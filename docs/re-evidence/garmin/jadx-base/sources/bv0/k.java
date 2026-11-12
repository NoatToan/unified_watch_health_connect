package bv0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc.f f21340b;

    public /* synthetic */ k(sc.f fVar, int i14) {
        this.f21339a = i14;
        this.f21340b = fVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        sc.j jVar;
        switch (this.f21339a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                this.f21340b.a(new a.o(str, false, 2, (p005kotlin.jvm.internal.j) null));
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                this.f21340b.a(new a.v(str2));
                return Unit.INSTANCE;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                this.f21340b.a(new a.v(str3));
                return Unit.INSTANCE;
            case 3:
                this.f21340b.a(new a.w(((Long) obj).longValue()));
                return Unit.INSTANCE;
            case 4:
                String str4 = (String) obj;
                str4.getClass();
                this.f21340b.a(new a.v(str4));
                return Unit.INSTANCE;
            default:
                qx0.e eVar = (qx0.e) obj;
                eVar.getClass();
                int i14 = px0.b.e.f141774a[eVar.ordinal()];
                if (i14 == 1) {
                    jVar = ox0.a.INSTANCE;
                } else {
                    if (i14 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    jVar = ox0.c.INSTANCE;
                }
                sc.f fVar = this.f21340b;
                fVar.clear();
                fVar.a(jVar);
                return Unit.INSTANCE;
        }
    }
}
