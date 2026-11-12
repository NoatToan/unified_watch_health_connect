package es;

import ds.n;
import e23.p;
import h4.r;
import nr.p0;
import p005kotlin.Unit;
import p3.m;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f65149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f65150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f65151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f65152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f65153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f65154g;

    public /* synthetic */ c(r rVar, p0 p0Var, n nVar, boolean z14, float f14, e23.a aVar, int i14, int i15) {
        this.f65148a = i15;
        this.f65149b = rVar;
        this.f65150c = p0Var;
        this.f65151d = nVar;
        this.f65152e = z14;
        this.f65153f = f14;
        this.f65154g = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f65148a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(1);
                d.a(this.f65149b, this.f65150c, this.f65151d, this.f65152e, this.f65153f, this.f65154g, (m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(1);
                e.a(this.f65149b, this.f65150c, this.f65151d, this.f65152e, this.f65153f, this.f65154g, (m) obj, iT2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT3 = p3.p0.t(1);
                g.a(this.f65149b, this.f65150c, this.f65151d, this.f65152e, this.f65153f, this.f65154g, (m) obj, iT3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iT4 = p3.p0.t(1);
                h.a(this.f65149b, this.f65150c, this.f65151d, this.f65152e, this.f65153f, this.f65154g, (m) obj, iT4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iT5 = p3.p0.t(1);
                j.a(this.f65149b, this.f65150c, this.f65151d, this.f65152e, this.f65153f, this.f65154g, (m) obj, iT5);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT6 = p3.p0.t(1);
                k.a(this.f65149b, this.f65150c, this.f65151d, this.f65152e, this.f65153f, this.f65154g, (m) obj, iT6);
                break;
        }
        return Unit.INSTANCE;
    }
}
