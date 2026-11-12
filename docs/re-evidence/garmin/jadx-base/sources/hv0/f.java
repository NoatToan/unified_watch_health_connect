package hv0;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gv0.d f85812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f85813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f85814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f85815e;

    public /* synthetic */ f(gv0.d dVar, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14, int i15) {
        this.f85811a = i15;
        this.f85812b = dVar;
        this.f85813c = aVar;
        this.f85814d = aVar2;
        this.f85815e = aVar3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f85811a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                i.a(this.f85812b, this.f85813c, this.f85814d, this.f85815e, (m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                i.a(this.f85812b, this.f85813c, this.f85814d, this.f85815e, (m) obj, iT2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(1);
                jv0.h.a(this.f85812b, this.f85813c, this.f85814d, this.f85815e, (m) obj, iT3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT4 = p0.t(1);
                kv0.c.a(this.f85812b, this.f85813c, this.f85814d, this.f85815e, (m) obj, iT4);
                break;
        }
        return Unit.INSTANCE;
    }
}
