package wy;

import e23.p;
import n82.f;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import sy.k;
import xy.j;
import xy.l;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o82.a f188020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f188021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f188022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sy.a f188023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f188024f;

    public /* synthetic */ b(o82.a aVar, k kVar, f fVar, sy.a aVar2, int i14, int i15) {
        this.f188019a = i15;
        this.f188020b = aVar;
        this.f188021c = kVar;
        this.f188022d = fVar;
        this.f188023e = aVar2;
        this.f188024f = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f188019a) {
            case 0:
                ((Integer) obj2).getClass();
                d.a(this.f188020b, this.f188021c, this.f188022d, this.f188023e, (m) obj, p0.t(this.f188024f | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                j.b(this.f188020b, this.f188021c, this.f188022d, this.f188023e, (m) obj, p0.t(this.f188024f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                l.b(this.f188020b, this.f188021c, this.f188022d, this.f188023e, (m) obj, p0.t(this.f188024f | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
