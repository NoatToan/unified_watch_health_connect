package mo2;

import aq2.k;
import as2.g;
import e23.p;
import fb1.c;
import fo2.l0;
import fo2.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import t13.d;
import v13.e;
import v13.i;
import w3.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.cache.SnowballCacheRefreshStrategy$refresh$2", f = "SnowballCacheRefreshStrategy.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f119942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<l0> f119943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f119944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<s> f119945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List<l0> list, a aVar, List<s> list2, d<? super b> dVar) {
        super(2, dVar);
        this.f119943b = list;
        this.f119944c = aVar;
        this.f119945d = list2;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f119943b, this.f119944c, this.f119945d, dVar);
        bVar.f119942a = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List<s> list;
        a aVar;
        Object next;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        ArrayList arrayList = new ArrayList();
        List<l0> list2 = this.f119943b;
        for (Object obj2 : list2) {
            if (((l0) obj2).h() != null) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList) {
            String deviceId = ((l0) obj3).getDeviceId();
            Object arrayList2 = linkedHashMap.get(deviceId);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(deviceId, arrayList2);
            }
            ((List) arrayList2).add(obj3);
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            list = this.f119945d;
            aVar = this.f119944c;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List<l0> list3 = (List) entry.getValue();
            Iterator<T> it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!p005kotlin.jvm.internal.s.g(((s) next).f73101a, str));
            s sVar = (s) next;
            if (sVar == null) {
                a.f119940b.info(c.o("No valid device ", str, " found for ", list3, ", skip them."));
            } else {
                for (l0 l0Var : list3) {
                    aVar.f119941a.a(sVar.f73103c, l0Var);
                    a.f119940b.info("updateOrCreateTransitCard(" + str + "): " + l0Var);
                }
            }
        }
        co2.a aVar3 = aVar.f119941a;
        qs2.a aVar4 = qs2.a.f147388q;
        aVar4.getClass();
        List<fs2.a> listM = aVar3.f28192a.m("FITPAY");
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : listM) {
            fs2.a aVar5 = (fs2.a) obj4;
            if (x.r(aVar5) && aVar5.f73428c == aVar4) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(k.a((fs2.a) it4.next()));
        }
        ArrayList<l0> arrayList5 = new ArrayList(y.r(arrayList4, 10));
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            arrayList5.add((l0) ((g) it5.next()).e());
        }
        for (l0 l0Var2 : arrayList5) {
            ArrayList arrayList6 = new ArrayList(y.r(list2, 10));
            Iterator<T> it6 = list2.iterator();
            while (it6.hasNext()) {
                arrayList6.add(((l0) it6.next()).getCredentialId());
            }
            boolean zContains = arrayList6.contains(l0Var2.getCredentialId());
            ArrayList arrayList7 = new ArrayList(y.r(list, 10));
            Iterator<T> it7 = list.iterator();
            while (it7.hasNext()) {
                arrayList7.add(((s) it7.next()).f73101a);
            }
            boolean zContains2 = arrayList7.contains(l0Var2.getDeviceId());
            if (!zContains || !zContains2) {
                a.f119940b.trace("deleteCardCache(" + l0Var2 + ")");
                co2.a aVar6 = aVar.f119941a;
                String credentialId = l0Var2.getCredentialId();
                credentialId.getClass();
                aVar6.f28192a.n(credentialId);
            }
        }
        return Unit.INSTANCE;
    }
}
