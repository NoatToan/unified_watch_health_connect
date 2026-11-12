package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class q6t extends v6t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31185b;
    public String c;

    public q6t(String str, v6t v6tVar) {
        super(v6tVar);
        this.f31185b = 30;
        this.c = str;
    }

    public static int f(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.list().length;
            }
            return 0;
        } catch (Throwable th) {
            m2t.r(th, "fus", "gfn");
            return 0;
        }
    }

    @Override // defpackage.v6t
    public final boolean d() {
        return f(this.c) >= this.f31185b;
    }
}
