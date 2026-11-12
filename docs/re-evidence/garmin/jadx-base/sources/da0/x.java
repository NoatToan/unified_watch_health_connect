package da0;

import g02.s0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f58860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f58861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f58862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f58863e;

    public /* synthetic */ x(String str, int i14, int i15, float f14) {
        this.f58859a = 2;
        this.f58860b = str;
        this.f58862d = i14;
        this.f58861c = f14;
        this.f58863e = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58859a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(this.f58862d | 1);
                y.a((h4.r) this.f58860b, this.f58861c, (p3.m) obj, iT, this.f58863e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(this.f58862d | 1);
                s0.b((h4.r) this.f58860b, this.f58861c, (p3.m) obj, iT2, this.f58863e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(this.f58863e | 1);
                kn1.j.d((String) this.f58860b, this.f58862d, this.f58861c, (p3.m) obj, iT3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ x(h4.r rVar, float f14, int i14, int i15, int i16) {
        this.f58859a = i16;
        this.f58860b = rVar;
        this.f58861c = f14;
        this.f58862d = i14;
        this.f58863e = i15;
    }
}
