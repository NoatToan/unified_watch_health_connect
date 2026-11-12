package ew0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66202a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f66203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f66204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f66205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f66206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f66207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f66208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o13.h f66209h;

    public /* synthetic */ e(h4.r rVar, boolean z14, boolean z15, boolean z16, int i14, e23.l lVar, e23.a aVar, int i15) {
        this.f66208g = rVar;
        this.f66203b = z14;
        this.f66204c = z15;
        this.f66205d = z16;
        this.f66206e = i14;
        this.f66209h = lVar;
        this.f66207f = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f66202a) {
            case 0:
                ((Integer) obj2).getClass();
                o53.f0.e((String) this.f66208g, this.f66203b, this.f66204c, this.f66205d, this.f66207f, (e23.a) this.f66209h, (p3.m) obj, p0.t(this.f66206e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iT = p0.t(7);
                ub0.k.d((h4.r) this.f66208g, this.f66203b, this.f66204c, this.f66205d, this.f66206e, (e23.l) this.f66209h, this.f66207f, (p3.m) obj, iT);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(String str, boolean z14, boolean z15, boolean z16, e23.a aVar, e23.a aVar2, int i14) {
        this.f66208g = str;
        this.f66203b = z14;
        this.f66204c = z15;
        this.f66205d = z16;
        this.f66207f = aVar;
        this.f66209h = aVar2;
        this.f66206e = i14;
    }
}
