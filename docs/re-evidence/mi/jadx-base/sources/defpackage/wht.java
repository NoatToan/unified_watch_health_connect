package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class wht implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f37993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cjt f37994b;
    public final /* synthetic */ xht c;

    public wht(xht xhtVar, List list, cjt cjtVar) {
        this.c = xhtVar;
        this.f37993a = list;
        this.f37994b = cjtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.c.c.b(this.f37993a)) {
                xht.d(this.c, this.f37994b);
            } else {
                xht.c(this.c, this.f37993a, this.f37994b);
            }
        } catch (Exception unused) {
            this.f37994b.a(-11);
        }
    }
}
