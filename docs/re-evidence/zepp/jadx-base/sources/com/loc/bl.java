package com.loc;

import java.io.File;

/* JADX INFO: loaded from: classes18.dex */
public final class bl extends bp {
    private int b;
    private String c;

    public bl(String str, bp bpVar) {
        super(bpVar);
        this.b = 30;
        this.c = str;
    }

    private static int a(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.list().length;
            }
            return 0;
        } catch (Throwable th) {
            ab.b(th, "fus", "gfn");
            return 0;
        }
    }

    @Override // com.loc.bp
    public final boolean a() {
        return a(this.c) >= this.b;
    }
}
