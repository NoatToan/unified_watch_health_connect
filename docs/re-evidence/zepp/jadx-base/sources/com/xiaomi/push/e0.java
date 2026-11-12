package com.xiaomi.push;

import android.util.Log;

/* JADX INFO: loaded from: classes22.dex */
class e0 {
    private static final boolean a = Log.isLoggable("BCompressed", 3);

    public static byte[] a(bi biVar, byte[] bArr) {
        try {
            byte[] bArrA = bm.a.a(bArr);
            if (a) {
                com.xiaomi.channel.commonutils.logger.b.m3435a("BCompressed", "decompress " + bArr.length + " to " + bArrA.length + " for " + biVar);
                if (biVar.e == 1) {
                    com.xiaomi.channel.commonutils.logger.b.m3435a("BCompressed", "decompress not support upStream");
                }
            }
            return bArrA;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3435a("BCompressed", "decompress error " + e);
            return bArr;
        }
    }
}
