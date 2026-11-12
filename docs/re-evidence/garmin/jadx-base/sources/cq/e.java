package cq;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55007a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f55008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f55009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f55010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f55011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f55012f;

    public /* synthetic */ e(String str, String str2, float f14, float f15, eq.e eVar, int i14) {
        this.f55008b = str;
        this.f55009c = str2;
        this.f55010d = f14;
        this.f55011e = f15;
        this.f55012f = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55007a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                u.j(this.f55008b, this.f55009c, this.f55010d, this.f55011e, (eq.e) this.f55012f, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(24577);
                u.i(this.f55008b, this.f55009c, (String) this.f55012f, this.f55010d, this.f55011e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(String str, String str2, String str3, float f14, float f15, int i14) {
        this.f55008b = str;
        this.f55009c = str2;
        this.f55012f = str3;
        this.f55010d = f14;
        this.f55011e = f15;
    }
}
