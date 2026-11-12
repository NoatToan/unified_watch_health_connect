package z72;

import e23.p;
import e23.q;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202911a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f202912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f202913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f202914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f202915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f202916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f202917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f202918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f202919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f202920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f202921k;

    public /* synthetic */ e(r rVar, i53.c cVar, float f14, long j8, float f15, float f16, boolean z14, q qVar, int i14, int i15) {
        this.f202912b = rVar;
        this.f202913c = cVar;
        this.f202914d = f14;
        this.f202915e = j8;
        this.f202917g = f15;
        this.f202918h = f16;
        this.f202916f = z14;
        this.f202919i = qVar;
        this.f202920j = i14;
        this.f202921k = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f202911a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(this.f202920j | 1);
                k.b(this.f202914d, this.f202917g, this.f202918h, iT, this.f202921k, this.f202915e, this.f202919i, this.f202912b, this.f202913c, (m) obj, this.f202916f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(this.f202920j | 1);
                k.d(this.f202914d, this.f202917g, this.f202918h, iT2, this.f202921k, this.f202915e, this.f202919i, this.f202912b, this.f202913c, (m) obj, this.f202916f);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(r rVar, i53.c cVar, float f14, long j8, boolean z14, float f15, float f16, q qVar, int i14, int i15) {
        this.f202912b = rVar;
        this.f202913c = cVar;
        this.f202914d = f14;
        this.f202915e = j8;
        this.f202916f = z14;
        this.f202917g = f15;
        this.f202918h = f16;
        this.f202919i = qVar;
        this.f202920j = i14;
        this.f202921k = i15;
    }
}
