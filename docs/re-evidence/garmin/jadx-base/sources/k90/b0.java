package k90;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Ljava/util/SortedMap;", "Lzb0/l;", "", "Ll90/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/SortedMap;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.GetDeviceCategoriesUseCase$getDeviceCategories$2", f = "GetDeviceCategoriesUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super SortedMap<zb0.l, List<? extends l90.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<l90.b> f103435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f103436b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(g22.n.e(((l90.b) t7).f111521f), g22.n.e(((l90.b) t14).f111521f));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(g22.n.e(((l90.b) t7).f111521f), g22.n.e(((l90.b) t14).f111521f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(List<l90.b> list, c0 c0Var, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f103435a = list;
        this.f103436b = c0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f103435a, this.f103436b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super SortedMap<zb0.l, List<? extends l90.b>>> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        zb0.l lVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ArrayList arrayList = new ArrayList();
        List<l90.b> list = this.f103435a;
        for (Object obj2 : list) {
            if (((l90.b) obj2).f111527l) {
                arrayList.add(obj2);
            }
        }
        List listN0 = p13.h0.N0(arrayList, new a());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : listN0) {
            l90.b bVar = (l90.b) obj3;
            zb0.l.a aVar2 = zb0.l.f203548c;
            String str = bVar.f111520e;
            String str2 = bVar.f111516a;
            String str3 = this.f103436b.f103441a;
            aVar2.getClass();
            str2.getClass();
            str3.getClass();
            w13.c cVar = zb0.l.f203554i;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (true) {
                if (!bVarN.hasNext()) {
                    lVar = zb0.l.OTHER;
                    break;
                }
                lVar = (zb0.l) bVarN.next();
                if (d53.u.q(lVar.f203555a, str, true)) {
                    break;
                }
                zb0.l.f203548c.getClass();
                List list2 = (List) ((Map) zb0.l.f203549d.getValue()).get(lVar);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((zb0.l.b) it.next()).a(str2, str3)) {
                            break;
                        }
                    }
                }
            }
            Object arrayList2 = linkedHashMap.get(lVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(lVar, arrayList2);
            }
            ((List) arrayList2).add(obj3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        zb0.l lVar2 = zb0.l.ALL;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list) {
            if (((l90.b) obj4).f111527l) {
                arrayList3.add(obj4);
            }
        }
        linkedHashMap2.put(lVar2, p13.h0.N0(arrayList3, new b()));
        return new TreeMap(linkedHashMap2);
    }
}
