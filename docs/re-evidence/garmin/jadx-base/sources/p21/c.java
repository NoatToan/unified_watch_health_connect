package p21;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import t21.j0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f135005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f135006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f135007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f135008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f135009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f135010g;

    public /* synthetic */ c(r rVar, String str, String str2, float f14, e23.l lVar, String str3, int i14, int i15) {
        this.f135004a = i15;
        this.f135005b = rVar;
        this.f135006c = str;
        this.f135007d = str2;
        this.f135008e = f14;
        this.f135009f = lVar;
        this.f135010g = str3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f135004a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                d.b(this.f135005b, this.f135006c, this.f135007d, this.f135008e, this.f135009f, this.f135010g, (m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                j0.b(this.f135005b, this.f135006c, this.f135007d, this.f135008e, this.f135009f, this.f135010g, (m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
