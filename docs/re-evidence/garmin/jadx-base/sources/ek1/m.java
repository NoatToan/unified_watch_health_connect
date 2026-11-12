package ek1;

import android.os.Build;
import aq1.d0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.Office365SettingDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.g0;
import hk1.a0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lek1/m;", "", "Ldk1/a;", "thirdPartyDelegate", "Lcom/garmin/android/apps/connectmobile/googlehealthconnect/a;", "googleHealthConnectDelegate", "Lnk1/g;", "repository", "Lf12/l;", "userSettings", "Lf12/b;", "userAccount", "Lek1/g;", "getAvailableThirdPartyAppsUseCase", "<init>", "(Ldk1/a;Lcom/garmin/android/apps/connectmobile/googlehealthconnect/a;Lnk1/g;Lf12/l;Lf12/b;Lek1/g;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f64465g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dk1.a f64466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.googlehealthconnect.a f64467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nk1.g f64468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.l f64469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f12.b f64470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f64471f;

    static {
        new a(null);
    }

    public m(dk1.a aVar, com.garmin.android.apps.connectmobile.googlehealthconnect.a aVar2, nk1.g gVar, f12.l lVar, f12.b bVar, g gVar2) {
        aVar.getClass();
        aVar2.getClass();
        gVar.getClass();
        lVar.getClass();
        bVar.getClass();
        gVar2.getClass();
        this.f64466a = aVar;
        this.f64467b = aVar2;
        this.f64468c = gVar;
        this.f64469d = lVar;
        this.f64470e = bVar;
        this.f64471f = gVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, d0 d0Var, v13.c cVar) {
        n nVar;
        Object next;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f64475d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f64475d = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objN = nVar.f64473b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f64475d;
        if (i15 == 0) {
            o13.r.b(objN);
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((a0) next).o(), hk1.v.f84201g.f84204a));
            if (next != null) {
                return Unit.INSTANCE;
            }
            nVar.f64472a = d0Var;
            nVar.f64475d = 1;
            objN = this.f64467b.n(nVar);
            if (objN == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d0Var = nVar.f64472a;
            o13.r.b(objN);
        }
        if (((Boolean) objN).booleanValue()) {
            d0Var.invoke(hk1.v.f84201g);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(List list, d0 d0Var, v13.c cVar) {
        o oVar;
        Object next;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f64479d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f64479d = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object obj = oVar.f64477b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f64479d;
        if (i15 == 0) {
            o13.r.b(obj);
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((a0) next).o(), hk1.v.f84199e.f84204a));
            if (next != null) {
                return Unit.INSTANCE;
            }
            oVar.f64476a = d0Var;
            oVar.f64479d = 1;
            if (this.f64466a.e(oVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d0Var = oVar.f64476a;
            o13.r.b(obj);
        }
        if (this.f64469d.d3()) {
            d0Var.invoke(hk1.v.f84199e);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(List list, g0 g0Var, v13.c cVar) throws Throwable {
        p pVar;
        Object next;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f64483d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f64483d = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objE0 = pVar.f64481b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f64483d;
        if (i15 == 0) {
            o13.r.b(objE0);
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((a0) next).o(), hk1.v.f84198d.f84204a));
            if (next != null) {
                return Unit.INSTANCE;
            }
            pVar.f64480a = g0Var;
            pVar.f64483d = 1;
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new nk1.m(null), pVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g0Var = pVar.f64480a;
            o13.r.b(objE0);
        }
        Office365SettingDTO office365SettingDTO = (Office365SettingDTO) objE0;
        if (office365SettingDTO != null && office365SettingDTO.f43515e) {
            g0Var.invoke(hk1.v.f84198d);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(v13.c cVar) {
        q qVar;
        v2 v2Var;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f64487d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f64487d = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objJ = qVar.f64485b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f64487d;
        if (i15 == 0) {
            o13.r.b(objJ);
            qVar.f64487d = 1;
            nk1.g gVar = this.f64468c;
            objJ = f0.J(gVar, new nk1.o(gVar, null), qVar);
            if (objJ != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objJ);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = qVar.f64484a;
            o13.r.b(objJ);
        }
        return new v2.b((fk1.a) objJ, ((v2.b) v2Var).f47387b, null, null, 12, null);
        v2 v2Var2 = (v2) objJ;
        if (!(v2Var2 instanceof v2.b)) {
            if (v2Var2 instanceof v2.a) {
                return v2Var2;
            }
            u0.r();
            return null;
        }
        v2.b bVar = (v2.b) v2Var2;
        List list = (List) bVar.f47386a;
        qVar.f64484a = bVar;
        qVar.f64487d = 2;
        Object objE = e(list, qVar);
        if (objE != obj) {
            v2Var = v2Var2;
            objJ = objE;
            return new v2.b((fk1.a) objJ, ((v2.b) v2Var).f47387b, null, null, 12, null);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x0103  */
    /* JADX WARN: Code duplicated, block: B:42:0x0116 A[LOOP:3: B:40:0x0110->B:42:0x0116, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0138 A[LOOP:4: B:44:0x0132->B:46:0x0138, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x019d A[LOOP:0: B:49:0x0197->B:51:0x019d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:76:0x0218 A[LOOP:2: B:74:0x0212->B:76:0x0218, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0230  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0236  */
    /* JADX WARN: Code duplicated, block: B:83:0x026c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0201 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x026c, please report this as an issue */
    public final Object e(List list, v13.c cVar) {
        u uVar;
        List arrayList;
        List list2;
        List list3;
        List list4;
        List list5;
        d0 d0Var;
        List list6;
        List list7;
        List list8;
        List list9;
        boolean zIsEmpty;
        Comparator comparator;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        Iterator it3;
        ArrayList arrayList4;
        Iterator it4;
        ArrayList arrayList5;
        Iterator it5;
        hk1.v vVar;
        boolean z14;
        g gVar;
        List list10;
        List list11 = list;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f64497g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f64497g = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj = uVar.f64495e;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f64497g;
        if (i15 == 0) {
            ArrayList arrayListX = v.h.x(obj);
            arrayList = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            g0 g0Var = new g0(2, arrayList6);
            uVar.f64491a = list11;
            uVar.f64492b = arrayListX;
            uVar.f64493c = arrayList;
            uVar.f64494d = arrayList6;
            uVar.f64497g = 1;
            if (c(list11, g0Var, uVar) != obj2) {
                list2 = arrayListX;
                list3 = arrayList6;
            }
            return obj2;
        }
        if (i15 == 1) {
            List list12 = uVar.f64494d;
            arrayList = uVar.f64493c;
            list2 = uVar.f64492b;
            List list13 = uVar.f64491a;
            o13.r.b(obj);
            list3 = list12;
            list11 = list13;
        } else {
            if (i15 == 2) {
                List list14 = uVar.f64494d;
                arrayList = uVar.f64493c;
                list2 = uVar.f64492b;
                list4 = uVar.f64491a;
                o13.r.b(obj);
                list5 = list14;
                d0Var = new d0(list5, 5);
                uVar.f64491a = list4;
                uVar.f64492b = list2;
                uVar.f64493c = arrayList;
                uVar.f64494d = list5;
                uVar.f64497g = 3;
                if (a(list4, d0Var, uVar) != obj2) {
                    list6 = arrayList;
                    list7 = list2;
                    list8 = list4;
                    list10 = list5;
                }
                return obj2;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list15 = uVar.f64494d;
            list6 = uVar.f64493c;
            list7 = uVar.f64492b;
            list8 = uVar.f64491a;
            o13.r.b(obj);
            list10 = list15;
        }
        list9 = list10;
        list11 = list8;
        list2 = list7;
        arrayList = list6;
        zIsEmpty = list11.isEmpty();
        comparator = String.CASE_INSENSITIVE_ORDER;
        if (zIsEmpty || !list9.isEmpty()) {
            arrayList2 = new ArrayList(y.r(list11, 10));
            it = list11.iterator();
            while (it.hasNext()) {
                arrayList2.add(new hk1.p((a0) it.next()));
            }
            arrayList3 = new ArrayList(y.r(list9, 10));
            it3 = list9.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new hk1.p(((hk1.v) it3.next()).f84204a, null, 2, null));
            }
            ArrayList arrayListC0 = h0.C0(arrayList2, arrayList3);
            d53.u.s(x0.f105818a);
            List listN0 = h0.N0(arrayListC0, new r(comparator));
            comparator.getClass();
            list2.addAll(h0.N0(listN0, new s(comparator)));
            i2.f36769a.getClass();
            i2.a.b(a2.SETTINGS, "ProcessThirdPartyAppsListUseCase", listN0 + " added to third party apps list.");
        } else {
            i2.f36769a.getClass();
            i2.a.b(a2.SETTINGS, "ProcessThirdPartyAppsListUseCase", list11 + " is empty or " + list9 + " is empty.");
        }
        list9.getClass();
        arrayList4 = new ArrayList(y.r(list11, 10));
        it4 = list11.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((a0) it4.next()).o());
        }
        Set setG1 = h0.g1(arrayList4);
        w13.c cVar2 = hk1.v.f84203i;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : cVar2) {
            vVar = (hk1.v) obj3;
            if (vVar.f84205b) {
                z14 = vVar.f84206c;
                gVar = this.f64471f;
                if (z14 || !gVar.f64447a.f()) {
                    if (vVar != hk1.v.f84201g) {
                        if (list9.contains(vVar) && !setG1.contains(vVar.f84204a)) {
                            arrayList7.add(obj3);
                        }
                    } else if (gVar.f64448b.d()) {
                        em0.a.f64581a.getClass();
                        if (Build.VERSION.SDK_INT >= 34) {
                            if (list9.contains(vVar)) {
                            }
                        }
                    }
                }
            }
        }
        arrayList5 = new ArrayList(y.r(arrayList7, 10));
        it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            arrayList5.add(new hk1.p(((hk1.v) it5.next()).f84204a, null, 2, null));
        }
        if (arrayList5.isEmpty()) {
            i2.f36769a.getClass();
            i2.a.b(a2.SETTINGS, "ProcessThirdPartyAppsListUseCase", arrayList5 + " is empty.");
        } else {
            if (!list2.isEmpty()) {
                arrayList.add(new hk1.u(R.string.platform_apps_not_connected_lbl));
            }
            d53.u.s(x0.f105818a);
            arrayList.addAll(h0.N0(arrayList5, new t(comparator)));
            i2.f36769a.getClass();
            i2.a.b(a2.SETTINGS, "ProcessThirdPartyAppsListUseCase", arrayList5 + " added to third party apps list.");
        }
        return new fk1.a(i53.a.j(list2), i53.a.j(arrayList));
        list9 = list3;
        if (!this.f64470e.f()) {
            d0 d0Var2 = new d0(list3, 4);
            uVar.f64491a = list11;
            uVar.f64492b = list2;
            uVar.f64493c = arrayList;
            uVar.f64494d = list3;
            uVar.f64497g = 2;
            if (b(list11, d0Var2, uVar) != obj2) {
                List list16 = list3;
                list4 = list11;
                list5 = list16;
                d0Var = new d0(list5, 5);
                uVar.f64491a = list4;
                uVar.f64492b = list2;
                uVar.f64493c = arrayList;
                uVar.f64494d = list5;
                uVar.f64497g = 3;
                if (a(list4, d0Var, uVar) != obj2) {
                    list6 = arrayList;
                    list7 = list2;
                    list8 = list4;
                    list10 = list5;
                    list9 = list10;
                    list11 = list8;
                    list2 = list7;
                    arrayList = list6;
                }
            }
            return obj2;
        }
        zIsEmpty = list11.isEmpty();
        comparator = String.CASE_INSENSITIVE_ORDER;
        if (zIsEmpty) {
            arrayList2 = new ArrayList(y.r(list11, 10));
            it = list11.iterator();
            while (it.hasNext()) {
                arrayList2.add(new hk1.p((a0) it.next()));
            }
            arrayList3 = new ArrayList(y.r(list9, 10));
            it3 = list9.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new hk1.p(((hk1.v) it3.next()).f84204a, null, 2, null));
            }
            ArrayList arrayListC1 = h0.C0(arrayList2, arrayList3);
            d53.u.s(x0.f105818a);
            List listN1 = h0.N0(arrayListC1, new r(comparator));
            comparator.getClass();
            list2.addAll(h0.N0(listN1, new s(comparator)));
            i2.f36769a.getClass();
            i2.a.b(a2.SETTINGS, "ProcessThirdPartyAppsListUseCase", listN1 + " added to third party apps list.");
        } else {
            arrayList2 = new ArrayList(y.r(list11, 10));
            it = list11.iterator();
            while (it.hasNext()) {
                arrayList2.add(new hk1.p((a0) it.next()));
            }
            arrayList3 = new ArrayList(y.r(list9, 10));
            it3 = list9.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new hk1.p(((hk1.v) it3.next()).f84204a, null, 2, null));
            }
            ArrayList arrayListC2 = h0.C0(arrayList2, arrayList3);
            d53.u.s(x0.f105818a);
            List listN2 = h0.N0(arrayListC2, new r(comparator));
            comparator.getClass();
            list2.addAll(h0.N0(listN2, new s(comparator)));
            i2.f36769a.getClass();
            i2.a.b(a2.SETTINGS, "ProcessThirdPartyAppsListUseCase", listN2 + " added to third party apps list.");
        }
        list9.getClass();
        arrayList4 = new ArrayList(y.r(list11, 10));
        it4 = list11.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((a0) it4.next()).o());
        }
        Set setG2 = h0.g1(arrayList4);
        w13.c cVar3 = hk1.v.f84203i;
        ArrayList arrayList8 = new ArrayList();
        while (r2.hasNext()) {
            vVar = (hk1.v) obj3;
            if (vVar.f84205b) {
                z14 = vVar.f84206c;
                gVar = this.f64471f;
                if (z14) {
                    if (vVar != hk1.v.f84201g) {
                        if (list9.contains(vVar)) {
                        }
                    } else if (gVar.f64448b.d()) {
                        em0.a.f64581a.getClass();
                        if (Build.VERSION.SDK_INT >= 34) {
                            if (list9.contains(vVar)) {
                            }
                        }
                    }
                } else if (vVar != hk1.v.f84201g) {
                    if (list9.contains(vVar)) {
                    }
                } else if (gVar.f64448b.d()) {
                    em0.a.f64581a.getClass();
                    if (Build.VERSION.SDK_INT >= 34) {
                        if (list9.contains(vVar)) {
                        }
                    }
                }
            }
        }
        arrayList5 = new ArrayList(y.r(arrayList8, 10));
        it5 = arrayList8.iterator();
        while (it5.hasNext()) {
            arrayList5.add(new hk1.p(((hk1.v) it5.next()).f84204a, null, 2, null));
        }
        if (arrayList5.isEmpty()) {
            if (!list2.isEmpty()) {
                arrayList.add(new hk1.u(R.string.platform_apps_not_connected_lbl));
            }
            d53.u.s(x0.f105818a);
            arrayList.addAll(h0.N0(arrayList5, new t(comparator)));
            i2.f36769a.getClass();
            i2.a.b(a2.SETTINGS, "ProcessThirdPartyAppsListUseCase", arrayList5 + " added to third party apps list.");
        } else {
            i2.f36769a.getClass();
            i2.a.b(a2.SETTINGS, "ProcessThirdPartyAppsListUseCase", arrayList5 + " is empty.");
        }
        return new fk1.a(i53.a.j(list2), i53.a.j(arrayList));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lek1/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
