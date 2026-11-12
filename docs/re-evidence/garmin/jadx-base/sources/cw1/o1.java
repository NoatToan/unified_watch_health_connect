package cw1;

import i3.fe;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f56146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f56147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f56148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f56149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o13.h f56150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f56151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f56152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f56153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f56154k;

    public /* synthetic */ o1(h4.r rVar, String str, String str2, List list, boolean z14, boolean z15, i53.c cVar, i53.c cVar2, e23.a aVar, int i14) {
        this.f56144a = 1;
        this.f56145b = rVar;
        this.f56152i = str;
        this.f56153j = str2;
        this.f56154k = list;
        this.f56146c = z14;
        this.f56147d = z15;
        this.f56148e = cVar;
        this.f56149f = cVar2;
        this.f56150g = aVar;
        this.f56151h = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56144a) {
            case 0:
                ((Integer) obj2).getClass();
                q1.c((h4.r) this.f56145b, (tw1.k) this.f56152i, (vt1.o) this.f56153j, this.f56146c, this.f56147d, (Integer) this.f56154k, (i53.c) this.f56148e, (i53.c) this.f56149f, (e23.a) this.f56150g, (p3.m) obj, p3.p0.t(this.f56151h | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                q1.b((h4.r) this.f56145b, (String) this.f56152i, (String) this.f56153j, (List) this.f56154k, this.f56146c, this.f56147d, (i53.c) this.f56148e, (i53.c) this.f56149f, (e23.a) this.f56150g, (p3.m) obj, p3.p0.t(this.f56151h | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                e52.g.a((z42.g) this.f56145b, (DateTime) this.f56152i, (tf0.i) this.f56153j, this.f56146c, this.f56147d, (e23.l) this.f56154k, (e23.l) this.f56148e, (e23.a) this.f56150g, (e23.l) this.f56149f, (p3.m) obj, p3.p0.t(this.f56151h | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(7);
                lw1.j.c((fe) this.f56145b, this.f56146c, (String) this.f56152i, this.f56151h, (List) this.f56153j, this.f56147d, (e23.l) this.f56154k, (e23.a) this.f56150g, (e23.a) this.f56148e, (e23.a) this.f56149f, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                sq1.d.a((DateTime) this.f56145b, (jq1.g) this.f56152i, (tf0.i) this.f56153j, this.f56146c, this.f56147d, (e23.l) this.f56154k, (e23.l) this.f56148e, (e23.l) this.f56149f, (e23.l) this.f56150g, (p3.m) obj, p3.p0.t(this.f56151h | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o1(fe feVar, boolean z14, String str, int i14, List list, boolean z15, e23.l lVar, e23.a aVar, e23.a aVar2, e23.a aVar3, int i15) {
        this.f56144a = 3;
        this.f56145b = feVar;
        this.f56146c = z14;
        this.f56152i = str;
        this.f56151h = i14;
        this.f56153j = list;
        this.f56147d = z15;
        this.f56154k = lVar;
        this.f56150g = aVar;
        this.f56148e = aVar2;
        this.f56149f = aVar3;
    }

    public /* synthetic */ o1(Object obj, Object obj2, Object obj3, boolean z14, boolean z15, Object obj4, Object obj5, Object obj6, o13.h hVar, int i14, int i15) {
        this.f56144a = i15;
        this.f56145b = obj;
        this.f56152i = obj2;
        this.f56153j = obj3;
        this.f56146c = z14;
        this.f56147d = z15;
        this.f56154k = obj4;
        this.f56148e = obj5;
        this.f56149f = obj6;
        this.f56150g = hVar;
        this.f56151h = i14;
    }

    public /* synthetic */ o1(z42.g gVar, DateTime dateTime, tf0.i iVar, boolean z14, boolean z15, e23.l lVar, e23.l lVar2, e23.a aVar, e23.l lVar3, int i14) {
        this.f56144a = 2;
        this.f56145b = gVar;
        this.f56152i = dateTime;
        this.f56153j = iVar;
        this.f56146c = z14;
        this.f56147d = z15;
        this.f56154k = lVar;
        this.f56148e = lVar2;
        this.f56150g = aVar;
        this.f56149f = lVar3;
        this.f56151h = i14;
    }
}
