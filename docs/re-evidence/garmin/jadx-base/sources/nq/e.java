package nq;

import android.view.View;
import com.garmin.android.apps.connectmobile.activities.newmodel.c0;
import com.garmin.android.apps.connectmobile.activities.newmodel.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.k0;
import p13.u0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B5\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnq/e;", "Lpq/c;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/c0;", "Lsq/a;", "", "Lpq/h;", "userActionStrategy", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseListDTO", "Lkotlin/Function1;", "", "onExerciseSetClick", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/repcounting/model/c;Le23/l;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends pq.c<c0, sq.a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<pq.h> f126892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.repcounting.model.c f126893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.l<sq.a, Unit> f126894g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(List<? extends pq.h> list, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, e23.l<? super sq.a, Unit> lVar) {
        super(list);
        list.getClass();
        cVar.getClass();
        this.f126892e = list;
        this.f126893f = cVar;
        this.f126894g = lVar;
    }

    public static ArrayList A(c0 c0Var) {
        Integer messageIndex;
        Integer messageIndex2;
        List<com.garmin.android.apps.connectmobile.repcounting.model.e> listF = c0Var.f();
        if (listF == null) {
            listF = j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Object obj : listF) {
            int i15 = i14 + 1;
            sq.a aVar = null;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            com.garmin.android.apps.connectmobile.repcounting.model.e eVar = (com.garmin.android.apps.connectmobile.repcounting.model.e) obj;
            if (!eVar.f0()) {
                com.garmin.android.apps.connectmobile.repcounting.model.e eVar2 = (com.garmin.android.apps.connectmobile.repcounting.model.e) h0.e0(i15, listF);
                int iIntValue = -1;
                if (eVar2 == null || !eVar2.f0()) {
                    f0 split = c0Var.getSplit();
                    if (split != null && (messageIndex = split.getMessageIndex()) != null) {
                        iIntValue = messageIndex.intValue();
                    }
                    aVar = new sq.a(iIntValue, eVar, null, 4, null);
                } else {
                    f0 split2 = c0Var.getSplit();
                    if (split2 != null && (messageIndex2 = split2.getMessageIndex()) != null) {
                        iIntValue = messageIndex2.intValue();
                    }
                    aVar = new sq.a(iIntValue, eVar, (com.garmin.android.apps.connectmobile.repcounting.model.e) h0.e0(i15, listF));
                }
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
            i14 = i15;
        }
        return arrayList;
    }

    public final void B(List<c0> list) {
        Map mapL;
        if (list != null) {
            for (c0 c0Var : list) {
                c0Var.h(list.indexOf(c0Var));
            }
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            for (c0 c0Var2 : list) {
                arrayList.add(new p(c0Var2, A(c0Var2)));
            }
            mapL = u0.l(arrayList);
        } else {
            mapL = k0.f134949a;
            mapL.getClass();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : mapL.keySet()) {
            arrayList2.add(new rq.a.C2917a(obj));
            List list2 = (List) mapL.get(obj);
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new rq.a.b(it.next()));
                }
            }
        }
        t(arrayList2);
    }

    @Override // pq.c
    public final f u(View view2) {
        return new f(view2, this.f126892e);
    }

    @Override // pq.c
    public final d x(View view2) {
        return new d(view2, this, this.f126892e, this.f126893f, this.f126894g);
    }

    public final ArrayList z() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Collection<rq.a> collection = this.f10698a.f10426f;
        collection.getClass();
        for (rq.a aVar : collection) {
            if (aVar instanceof rq.a.C2917a) {
                Header header = ((rq.a.C2917a) aVar).f154106a;
                ArrayList arrayList2 = new ArrayList();
                linkedHashMap.put(header, arrayList2);
                arrayList = arrayList2;
            }
            if (aVar instanceof rq.a.b) {
                arrayList.add(((rq.a.b) aVar).f154107a);
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Iterable<sq.a> iterable = (Iterable) entry.getValue();
            ArrayList arrayList4 = new ArrayList(y.r(iterable, 10));
            for (sq.a aVar2 : iterable) {
                arrayList4.add(x.k(aVar2.f160521b, aVar2.f160522c));
            }
            arrayList3.add(c0.b((c0) entry.getKey(), h0.Z(y.s(arrayList4)), 5));
        }
        return arrayList3;
    }

    public /* synthetic */ e(List list, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, cVar, (i14 & 4) != 0 ? null : lVar);
    }
}
