package yy1;

import java.util.List;
import p005kotlin.Unit;
import p3.p0;
import zo1.r0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200142a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f200143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f200144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f200145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f200146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f200147f;

    public /* synthetic */ g(h4.r rVar, v61.a aVar, boolean z14, e23.l lVar, int i14) {
        this.f200146e = rVar;
        this.f200147f = aVar;
        this.f200143b = z14;
        this.f200144c = lVar;
        this.f200145d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f200142a) {
            case 0:
                ((Integer) obj2).intValue();
                h.a(this.f200143b, (List) this.f200146e, (e23.l) this.f200144c, (e23.a) this.f200147f, (p3.m) obj, p0.t(this.f200145d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                z61.a.b((h4.r) this.f200146e, (v61.a) this.f200147f, this.f200143b, (e23.l) this.f200144c, (p3.m) obj, p0.t(this.f200145d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT = p0.t(49);
                za0.n.a(this.f200143b, (e23.l) this.f200144c, (a4.a) this.f200146e, (e23.a) this.f200147f, this.f200145d, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                r0.d((yo1.b) this.f200146e, (yo1.i) this.f200144c, this.f200143b, (bp1.a) this.f200147f, (p3.m) obj, p0.t(this.f200145d | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(yo1.b bVar, yo1.i iVar, boolean z14, bp1.a aVar, int i14) {
        this.f200146e = bVar;
        this.f200144c = iVar;
        this.f200143b = z14;
        this.f200147f = aVar;
        this.f200145d = i14;
    }

    public /* synthetic */ g(boolean z14, e23.l lVar, a4.a aVar, e23.a aVar2, int i14, int i15) {
        this.f200143b = z14;
        this.f200144c = lVar;
        this.f200146e = aVar;
        this.f200147f = aVar2;
        this.f200145d = i14;
    }

    public /* synthetic */ g(boolean z14, List list, e23.l lVar, e23.a aVar, int i14) {
        this.f200143b = z14;
        this.f200146e = list;
        this.f200144c = lVar;
        this.f200147f = aVar;
        this.f200145d = i14;
    }
}
