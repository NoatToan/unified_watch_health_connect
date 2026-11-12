package uy0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Luy0/g1;", "", "Ll22/a;", "stringResourceResolver", "<init>", "(Ll22/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f173177b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.a f173178a;

    static {
        new a(null);
    }

    public g1(l22.a aVar) {
        aVar.getClass();
        this.f173178a = aVar;
    }

    public final ArrayList a(List list) {
        int i14;
        Object next;
        com.garmin.android.apps.connectmobile.navigation.more.b bVar;
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            m1 m1Var = (m1) next2;
            com.garmin.android.apps.connectmobile.navigation.more.b bVar2 = m1Var.f173249a;
            if (bVar2 instanceof com.garmin.android.apps.connectmobile.navigation.more.b.l) {
                obj = ((com.garmin.android.apps.connectmobile.navigation.more.b.l) bVar2).f39421c;
            } else if (bVar2 instanceof com.garmin.android.apps.connectmobile.navigation.more.b.j) {
                obj = ((com.garmin.android.apps.connectmobile.navigation.more.b.j) bVar2).f39417c;
            } else {
                com.garmin.android.apps.connectmobile.navigation.more.b bVar3 = (com.garmin.android.apps.connectmobile.navigation.more.b) p13.h0.d0(m1Var.f173250b);
                if (bVar3 != null && (bVar3 instanceof com.garmin.android.apps.connectmobile.navigation.more.b.l)) {
                    obj = ((com.garmin.android.apps.connectmobile.navigation.more.b.l) bVar3).f39421c;
                }
            }
            Object arrayList = linkedHashMap.get(obj);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(obj, arrayList);
            }
            ((List) arrayList).add(next2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ty0.j jVar = (ty0.j) entry.getKey();
            List list2 = (List) entry.getValue();
            if (jVar != null) {
                Iterator it3 = list2.iterator();
                do {
                    i14 = 0;
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    bVar = ((m1) next).f173249a;
                } while (!(bVar instanceof com.garmin.android.apps.connectmobile.navigation.more.b.l ? p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.navigation.more.b.l) bVar).f39421c.f166935a, jVar.getF188047a()) : false));
                m1 m1Var2 = (m1) next;
                com.garmin.android.apps.connectmobile.navigation.more.b bVar4 = m1Var2 != null ? m1Var2.f173249a : null;
                if (bVar4 != null) {
                    com.garmin.android.apps.connectmobile.navigation.more.b bVar5 = bVar4;
                    vy0.e0 e0Var = new vy0.e0(bVar5, jVar, null, 4, null);
                    ArrayList<m1> arrayList3 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (!((m1) obj2).f173249a.c().equals(bVar5.c())) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
                    for (m1 m1Var3 : arrayList3) {
                        com.garmin.android.apps.connectmobile.navigation.more.b bVar6 = m1Var3.f173249a;
                        List<com.garmin.android.apps.connectmobile.navigation.more.b> list3 = m1Var3.f173250b;
                        List<com.garmin.android.apps.connectmobile.navigation.more.b> list4 = !list3.isEmpty() ? list3 : null;
                        arrayList4.add(new vy0.e0(bVar6, null, list4 != null ? p13.h0.k0(list4, " > ", null, null, new uo1.a(this, 6), 30) : null, 2, null));
                    }
                    arrayList2.addAll(p13.h0.C0(p13.w.c(e0Var), arrayList4));
                } else {
                    ArrayList arrayList5 = new ArrayList(p13.y.r(list2, 10));
                    for (Object obj3 : list2) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        m1 m1Var4 = (m1) obj3;
                        com.garmin.android.apps.connectmobile.navigation.more.b bVar7 = m1Var4.f173249a;
                        List<com.garmin.android.apps.connectmobile.navigation.more.b> list5 = m1Var4.f173250b;
                        List<com.garmin.android.apps.connectmobile.navigation.more.b> list6 = !list5.isEmpty() ? list5 : null;
                        arrayList5.add(new vy0.e0(bVar7, i14 == 0 ? jVar : null, list6 != null ? p13.h0.k0(list6, " > ", null, null, new uo1.a(this, 6), 30) : null));
                        i14 = i15;
                    }
                    arrayList2.addAll(arrayList5);
                }
                arrayList2.add(new vy0.e0(new com.garmin.android.apps.connectmobile.navigation.more.b.e(null, ty0.b.f166889l, null, false, 12, null), null, null, 6, null));
            }
        }
        return arrayList2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luy0/g1$a;", "", "<init>", "()V", "", "SEPARATOR", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
