package c02;

import e23.p;
import h4.r;
import o4.d0;
import o72.l2;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22398a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f22400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f22402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f22405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f22406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f22407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f22408k;

    public /* synthetic */ m(r rVar, i53.c cVar, c cVar2, String str, c cVar3, int i14, d0 d0Var, boolean z14, int i15, int i16) {
        this.f22405h = rVar;
        this.f22400c = cVar;
        this.f22406i = cVar2;
        this.f22399b = str;
        this.f22407j = cVar3;
        this.f22401d = i14;
        this.f22408k = d0Var;
        this.f22402e = z14;
        this.f22403f = i15;
        this.f22404g = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22398a) {
            case 0:
                ((Integer) obj2).getClass();
                n.a((r) this.f22405h, this.f22400c, (c) this.f22406i, this.f22399b, (c) this.f22407j, this.f22401d, (d0) this.f22408k, this.f22402e, (p3.m) obj, p0.t(this.f22403f | 1), this.f22404g);
                break;
            default:
                ((Integer) obj2).getClass();
                l2.a(this.f22399b, this.f22400c, (e23.l) this.f22405h, (String) this.f22406i, (e23.l) this.f22407j, this.f22401d, (e23.l) this.f22408k, this.f22402e, (p3.m) obj, p0.t(this.f22403f | 1), this.f22404g);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(String str, i53.c cVar, e23.l lVar, String str2, e23.l lVar2, int i14, e23.l lVar3, boolean z14, int i15, int i16) {
        this.f22399b = str;
        this.f22400c = cVar;
        this.f22405h = lVar;
        this.f22406i = str2;
        this.f22407j = lVar2;
        this.f22401d = i14;
        this.f22408k = lVar3;
        this.f22402e = z14;
        this.f22403f = i15;
        this.f22404g = i16;
    }
}
