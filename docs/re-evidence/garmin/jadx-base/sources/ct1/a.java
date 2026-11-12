package ct1;

import am.x0;
import e23.p;
import ew0.c0;
import h4.r;
import java.util.List;
import p005kotlin.Unit;
import p3.p0;
import qw0.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f55477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f55478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f55479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f55480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f55481f;

    public /* synthetic */ a(r rVar, int i14, boolean z14, boolean z15, e23.a aVar, int i15) {
        this.f55476a = 0;
        this.f55481f = rVar;
        this.f55480e = i14;
        this.f55477b = z14;
        this.f55478c = z15;
        this.f55479d = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55476a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                b.a((r) this.f55481f, this.f55480e, this.f55477b, this.f55478c, (e23.a) this.f55479d, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                c0.a((String) this.f55481f, this.f55477b, this.f55478c, (e23.a) this.f55479d, (p3.m) obj, p0.t(this.f55480e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                fv0.f.b((List) this.f55481f, this.f55477b, (Boolean) this.f55479d, this.f55478c, (p3.m) obj, p0.t(this.f55480e | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                kf1.h.a((kf1.e) this.f55481f, (o82.g) this.f55479d, this.f55477b, this.f55478c, (p3.m) obj, p0.t(this.f55480e | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(7);
                gg.b.i((v) this.f55481f, this.f55477b, this.f55478c, (e23.l) this.f55479d, (p3.m) obj, iT2, this.f55480e);
                break;
            case 5:
                ((Integer) obj2).getClass();
                qk0.r.a((x0) this.f55481f, this.f55477b, this.f55478c, (e23.a) this.f55479d, (p3.m) obj, p0.t(this.f55480e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                xu0.e.f((String) this.f55481f, this.f55477b, this.f55478c, (e23.l) this.f55479d, (p3.m) obj, p0.t(this.f55480e | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(int i14, int i15, Object obj, o13.h hVar, boolean z14, boolean z15) {
        this.f55476a = i15;
        this.f55481f = obj;
        this.f55477b = z14;
        this.f55478c = z15;
        this.f55479d = hVar;
        this.f55480e = i14;
    }

    public /* synthetic */ a(List list, boolean z14, Boolean bool, boolean z15, int i14) {
        this.f55476a = 2;
        this.f55481f = list;
        this.f55477b = z14;
        this.f55479d = bool;
        this.f55478c = z15;
        this.f55480e = i14;
    }

    public /* synthetic */ a(kf1.e eVar, o82.g gVar, boolean z14, boolean z15, int i14) {
        this.f55476a = 3;
        this.f55481f = eVar;
        this.f55479d = gVar;
        this.f55477b = z14;
        this.f55478c = z15;
        this.f55480e = i14;
    }

    public /* synthetic */ a(v vVar, boolean z14, boolean z15, e23.l lVar, int i14, int i15) {
        this.f55476a = 4;
        this.f55481f = vVar;
        this.f55477b = z14;
        this.f55478c = z15;
        this.f55479d = lVar;
        this.f55480e = i15;
    }
}
