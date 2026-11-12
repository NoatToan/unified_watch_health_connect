package t21;

import c2.t2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161958a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f161959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f161960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f161961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f161962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f161963f;

    public /* synthetic */ t(float f14, boolean z14, z3.e eVar, e23.a aVar, e23.a aVar2, int i14) {
        this.f161959b = f14;
        this.f161960c = z14;
        this.f161962e = eVar;
        this.f161961d = aVar;
        this.f161963f = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f161958a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(1);
                h0.d((t2) this.f161962e, this.f161960c, (String) this.f161963f, this.f161961d, this.f161959b, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(1);
                wg2.c.b(this.f161959b, this.f161960c, (z3.e) this.f161962e, this.f161961d, (e23.a) this.f161963f, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ t(t2 t2Var, boolean z14, String str, e23.a aVar, float f14, int i14) {
        this.f161962e = t2Var;
        this.f161960c = z14;
        this.f161963f = str;
        this.f161961d = aVar;
        this.f161959b = f14;
    }
}
