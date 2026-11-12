package com.amap.api.col.p0003sl;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class lt extends lx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3074b;

    public lt(String str, lx lxVar) {
        super(lxVar);
        this.f3073a = 30;
        this.f3074b = str;
    }

    @Override // com.amap.api.col.p0003sl.lx
    protected final boolean c() {
        return a(this.f3074b) >= this.f3073a;
    }

    private static int a(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.list().length;
            }
            return 0;
        } catch (Throwable th) {
            jv.c(th, "fus", "gfn");
            return 0;
        }
    }
}
