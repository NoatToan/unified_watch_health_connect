package cq;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55095a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f55096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f55097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f55098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f55099e;

    public /* synthetic */ s(int i14, long j8, e23.a aVar, boolean z14) {
        this.f55096b = z14;
        this.f55097c = j8;
        this.f55099e = aVar;
        this.f55098d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55095a) {
            case 0:
                ((Integer) obj2).intValue();
                u.o(this.f55097c, (yo1.d) this.f55099e, this.f55096b, (p3.m) obj, p0.t(this.f55098d | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                yy1.c.a(p0.t(this.f55098d | 1), this.f55097c, (e23.a) this.f55099e, (p3.m) obj, this.f55096b);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s(long j8, yo1.d dVar, boolean z14, int i14) {
        this.f55097c = j8;
        this.f55099e = dVar;
        this.f55096b = z14;
        this.f55098d = i14;
    }
}
