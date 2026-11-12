package com.amap.api.mapcore.util;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class jk extends jo {
    private int a;
    private String b;

    public jk(String str, jo joVar) {
        super(joVar);
        this.a = 30;
        this.b = str;
    }

    private static int a(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.list().length;
            }
            return 0;
        } catch (Throwable th) {
            hn.c(th, "fus", "gfn");
            return 0;
        }
    }

    @Override // com.amap.api.mapcore.util.jo
    public final boolean c() {
        return a(this.b) >= this.a;
    }
}
