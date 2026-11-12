package tn2;

import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class t0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f165668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pn2.m f165669c;

    public /* synthetic */ t0(r0 r0Var, pn2.m mVar, int i14) {
        this.f165667a = i14;
        this.f165668b = r0Var;
        this.f165669c = mVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f165667a;
        pn2.m mVar = this.f165669c;
        r0 r0Var = this.f165668b;
        Throwable th3 = (Throwable) obj;
        switch (i14) {
            case 0:
                th3.getClass();
                String strF = v.e0.f(((qn2.n) mVar.d()).getSequenceNumber(), "#", " GetScript()");
                Logger logger = r0.f165631n;
                r0Var.getClass();
                o0 o0Var = new o0(0, strF, th3);
                int i15 = w03.b.f181178a;
                return new z03.d(o0Var);
            case 1:
                th3.getClass();
                String strF2 = v.e0.f(((qn2.n) mVar.d()).getSequenceNumber(), "#", " getScript()");
                Logger logger2 = r0.f165631n;
                r0Var.getClass();
                o0 o0Var2 = new o0(0, strF2, th3);
                int i16 = w03.b.f181178a;
                return new z03.d(o0Var2);
            default:
                th3.getClass();
                String strF3 = v.e0.f(((qn2.n) mVar.d()).getSequenceNumber(), "#", " GetScript()");
                Logger logger3 = r0.f165631n;
                r0Var.getClass();
                o0 o0Var3 = new o0(0, strF3, th3);
                int i17 = w03.b.f181178a;
                return new z03.d(o0Var3);
        }
    }
}
