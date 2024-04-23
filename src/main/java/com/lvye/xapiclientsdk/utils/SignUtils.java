package com.lvye.xapiclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * 签名工具
 * @author LVye
 * @version 1.0
 */
public class SignUtils {
    /**
     * secretKey
     * @param body
     * @param secretKey
     * @return
     */
    public static String getSign(String body, String secretKey) {
        //使用HmacSHA256算法加密
        Digester md5 = new Digester(DigestAlgorithm.SHA256);
        String content = body + "." + secretKey;
        return md5.digestHex(content);
    }
}
