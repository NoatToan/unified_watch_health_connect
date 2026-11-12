package ba2;

import cw1.n1;
import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import w52.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f17080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f17082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17083e;

    public /* synthetic */ h(e23.a aVar, boolean z14, r rVar, int i14) {
        this.f17079a = 0;
        this.f17082d = aVar;
        this.f17081c = z14;
        this.f17080b = rVar;
        this.f17083e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17079a) {
            case 0:
                ((Integer) obj2).getClass();
                j.b(p0.t(this.f17083e | 1), this.f17082d, this.f17080b, (m) obj, this.f17081c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT = p0.t(49);
                n1.a(this.f17080b, this.f17081c, this.f17082d, (m) obj, iT, this.f17083e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                r0.a(p0.t(this.f17083e | 1), this.f17082d, this.f17080b, (m) obj, this.f17081c);
                break;
            case 3:
                ((Integer) obj2).getClass();
                wg2.c.c(p0.t(this.f17083e | 1), this.f17082d, this.f17080b, (m) obj, this.f17081c);
                break;
            default:
                ((Integer) obj2).getClass();
                z2.c.c(p0.t(this.f17083e | 1), this.f17082d, this.f17080b, (m) obj, this.f17081c);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(r rVar, e23.a aVar, boolean z14, int i14) {
        this.f17079a = 4;
        this.f17080b = rVar;
        this.f17082d = aVar;
        this.f17081c = z14;
        this.f17083e = i14;
    }

    public /* synthetic */ h(r rVar, boolean z14, e23.a aVar, int i14, int i15) {
        this.f17079a = 1;
        this.f17080b = rVar;
        this.f17081c = z14;
        this.f17082d = aVar;
        this.f17083e = i15;
    }

    public /* synthetic */ h(r rVar, boolean z14, e23.a aVar, int i14, int i15, byte b14) {
        this.f17079a = i15;
        this.f17080b = rVar;
        this.f17081c = z14;
        this.f17082d = aVar;
        this.f17083e = i14;
    }
}
