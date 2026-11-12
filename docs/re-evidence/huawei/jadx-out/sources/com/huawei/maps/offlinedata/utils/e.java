package com.huawei.maps.offlinedata.utils;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes40.dex */
public abstract class e {
    public static void a(String str, Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                    g.b(str, "IOException ::: cannot close io stream !");
                }
            }
        }
    }
}
