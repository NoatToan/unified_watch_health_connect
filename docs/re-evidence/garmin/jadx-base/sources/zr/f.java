package zr;

import e23.p;
import h4.r;
import nr.z;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f206716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f206717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f206718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f206719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f206720f;

    public /* synthetic */ f(r rVar, Object obj, e23.a aVar, int i14, int i15, int i16) {
        this.f206715a = i16;
        this.f206716b = rVar;
        this.f206720f = obj;
        this.f206717c = aVar;
        this.f206718d = i14;
        this.f206719e = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f206715a) {
            case 0:
                ((Integer) obj2).getClass();
                h.h(this.f206716b, (z) this.f206720f, this.f206717c, (p3.m) obj, p0.t(this.f206718d | 1), this.f206719e);
                break;
            default:
                ((Integer) obj2).getClass();
                ys1.b.a(this.f206716b, (String) this.f206720f, this.f206717c, (p3.m) obj, p0.t(this.f206718d | 1), this.f206719e);
                break;
        }
        return Unit.INSTANCE;
    }
}
