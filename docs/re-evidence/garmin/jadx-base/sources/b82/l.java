package b82;

import com.google.maps.android.compose.clustering.ClusteringKt;
import i3.mc;
import java.util.Collection;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o13.h f16648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o13.h f16650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f16653k;

    public /* synthetic */ l(String str, i53.c cVar, i53.c cVar2, Long l14, String str2, String str3, e23.a aVar, e23.l lVar, int i14, int i15) {
        this.f16643a = 3;
        this.f16644b = str;
        this.f16653k = cVar;
        this.f16649g = cVar2;
        this.f16646d = l14;
        this.f16645c = str2;
        this.f16647e = str3;
        this.f16648f = aVar;
        this.f16650h = lVar;
        this.f16651i = i14;
        this.f16652j = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16643a;
        int i15 = this.f16651i;
        o13.h hVar = this.f16650h;
        Object obj3 = this.f16646d;
        Object obj4 = this.f16649g;
        o13.h hVar2 = this.f16648f;
        Object obj5 = this.f16645c;
        Object obj6 = this.f16644b;
        Object obj7 = this.f16647e;
        Object obj8 = this.f16653k;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                n.d((u4.d) obj8, (String) obj6, (String) obj5, (h4.r) obj3, (String) obj7, (e23.a) hVar2, (String) obj4, (e23.a) hVar, (p3.m) obj, p3.p0.t(i15 | 1), this.f16652j);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                n.b((e23.p) obj8, (String) obj6, (String) obj5, (h4.r) obj3, (String) obj7, (e23.a) hVar2, (String) obj4, (e23.a) hVar, (p3.m) obj, p3.p0.t(i15 | 1), this.f16652j);
                return Unit.INSTANCE;
            case 2:
                int iIntValue = ((Integer) obj2).intValue();
                return ClusteringKt.Clustering$lambda$39((Collection) obj8, (e23.l) obj6, (e23.l) obj5, (e23.l) obj7, (e23.l) obj4, (e23.q) obj3, (e23.q) hVar2, (e23.l) hVar, this.f16651i, this.f16652j, (p3.m) obj, iIntValue);
            case 3:
                ((Integer) obj2).getClass();
                f10.m.b((String) obj6, (i53.c) obj8, (i53.c) obj4, (Long) obj3, (String) obj5, (String) obj7, (e23.a) hVar2, (e23.l) hVar, (p3.m) obj, p3.p0.t(i15 | 1), this.f16652j);
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                l72.w wVar = l72.w.f111301a;
                ((l72.w) obj8).c((e23.q) obj6, (e23.p) obj5, (e23.a) hVar2, (mc) obj7, (b92.a) obj4, (e23.p) obj3, (e23.q) hVar, (p3.m) obj, p3.p0.t(i15 | 1), this.f16652j);
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                l72.w wVar2 = l72.w.f111301a;
                ((l72.w) obj8).d((String) obj6, (e23.p) obj5, (e23.a) hVar2, (mc) obj7, (b92.a) obj4, (e23.p) obj3, (e23.q) hVar, (p3.m) obj, p3.p0.t(i15 | 1), this.f16652j);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                z02.f.b((u4.d) obj8, (b92.a) obj7, (String) obj6, (String) obj5, (e23.a) hVar2, (i53.c) obj4, (i53.c) obj3, (e23.l) hVar, (p3.m) obj, p3.p0.t(i15 | 1), this.f16652j);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(Object obj, String str, String str2, h4.r rVar, String str3, e23.a aVar, String str4, e23.a aVar2, int i14, int i15, int i16) {
        this.f16643a = i16;
        this.f16653k = obj;
        this.f16644b = str;
        this.f16645c = str2;
        this.f16646d = rVar;
        this.f16647e = str3;
        this.f16648f = aVar;
        this.f16649g = str4;
        this.f16650h = aVar2;
        this.f16651i = i14;
        this.f16652j = i15;
    }

    public /* synthetic */ l(Collection collection, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, e23.q qVar, e23.q qVar2, e23.l lVar5, int i14, int i15) {
        this.f16643a = 2;
        this.f16653k = collection;
        this.f16644b = lVar;
        this.f16645c = lVar2;
        this.f16647e = lVar3;
        this.f16649g = lVar4;
        this.f16646d = qVar;
        this.f16648f = qVar2;
        this.f16650h = lVar5;
        this.f16651i = i14;
        this.f16652j = i15;
    }

    public /* synthetic */ l(l72.w wVar, Object obj, e23.p pVar, e23.a aVar, mc mcVar, b92.a aVar2, e23.p pVar2, e23.q qVar, int i14, int i15, int i16) {
        this.f16643a = i16;
        this.f16653k = wVar;
        this.f16644b = obj;
        this.f16645c = pVar;
        this.f16648f = aVar;
        this.f16647e = mcVar;
        this.f16649g = aVar2;
        this.f16646d = pVar2;
        this.f16650h = qVar;
        this.f16651i = i14;
        this.f16652j = i15;
    }

    public /* synthetic */ l(u4.d dVar, b92.a aVar, String str, String str2, e23.a aVar2, i53.c cVar, i53.c cVar2, e23.l lVar, int i14, int i15) {
        this.f16643a = 6;
        this.f16653k = dVar;
        this.f16647e = aVar;
        this.f16644b = str;
        this.f16645c = str2;
        this.f16648f = aVar2;
        this.f16649g = cVar;
        this.f16646d = cVar2;
        this.f16650h = lVar;
        this.f16651i = i14;
        this.f16652j = i15;
    }
}
