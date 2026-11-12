package com.huawei.maps.offlinedata.service.cloud.utils;

import com.huawei.maps.offlinedata.utils.g;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {
    public static SecureRandom a() {
        try {
            return SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException unused) {
            g.b("SecureRandomFactory", "getInstanceStrong  NoSuchAlgorithmException");
            return new SecureRandom();
        }
    }
}
