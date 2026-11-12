package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f110960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f110961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f110962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f110963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f110964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f110965g;

    public /* synthetic */ d1(h4.r rVar, rl1.h hVar, boolean z14, boolean z15, int i14, int i15) {
        this.f110959a = 2;
        this.f110960b = rVar;
        this.f110963e = hVar;
        this.f110961c = z14;
        this.f110962d = z15;
        this.f110964f = i14;
        this.f110965g = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f110959a) {
            case 0:
                ((Integer) obj2).getClass();
                e1.a((String) this.f110960b, this.f110961c, this.f110962d, (e23.a) this.f110963e, (p3.m) obj, p3.p0.t(this.f110964f | 1), this.f110965g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                e1.a((String) this.f110960b, this.f110961c, this.f110962d, (e23.a) this.f110963e, (p3.m) obj, p3.p0.t(this.f110964f | 1), this.f110965g);
                break;
            default:
                ((Integer) obj2).getClass();
                in1.j.a((h4.r) this.f110960b, (rl1.h) this.f110963e, this.f110961c, this.f110962d, (p3.m) obj, p3.p0.t(this.f110964f | 1), this.f110965g);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d1(String str, boolean z14, boolean z15, e23.a aVar, int i14, int i15, int i16) {
        this.f110959a = i16;
        this.f110960b = str;
        this.f110961c = z14;
        this.f110962d = z15;
        this.f110963e = aVar;
        this.f110964f = i14;
        this.f110965g = i15;
    }
}
