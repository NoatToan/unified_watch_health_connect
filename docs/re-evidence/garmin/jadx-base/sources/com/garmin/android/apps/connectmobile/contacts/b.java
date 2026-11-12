package com.garmin.android.apps.connectmobile.contacts;

import com.garmin.android.apps.connectmobile.R;
import d53.u;
import d53.w;
import f20.e0;
import f20.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l20.j;
import l20.n;
import l20.o;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Marker;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final int a(l20.a aVar) {
        List<l20.c> listZ;
        int i14 = 0;
        if (aVar != null && (listZ = aVar.z()) != null) {
            if (listZ.isEmpty()) {
                return 0;
            }
            Iterator<T> it = listZ.iterator();
            while (it.hasNext()) {
                if (s.g(((l20.c) it.next()).getIsLiveEventSharingDefault(), Boolean.TRUE) && (i14 = i14 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
        }
        return i14;
    }

    public static final int b(l20.a aVar) {
        List<l20.c> listR;
        int i14 = 0;
        if ((aVar != null ? s.g(aVar.getIsLiveTrackDefault(), Boolean.TRUE) : false) && (listR = aVar.r()) != null) {
            if (listR.isEmpty()) {
                return 0;
            }
            Iterator<T> it = listR.iterator();
            while (it.hasNext()) {
                if (((l20.c) it.next()).g0() && (i14 = i14 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
        }
        return i14;
    }

    public static final l20.a c(String str, String str2, List list) {
        Object obj = null;
        if (str != null && str.length() != 0) {
            for (Object obj2 : list) {
                if (s.g(((l20.a) obj2).getContactId(), str)) {
                    obj = obj2;
                    break;
                }
            }
            return (l20.a) obj;
        }
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        for (Object obj3 : list) {
            if (s.g(((l20.a) obj3).getLocalId(), str2)) {
                obj = obj3;
                break;
            }
        }
        return (l20.a) obj;
    }

    public static final Integer d(l20.c cVar, e0 e0Var, boolean z14) {
        e0Var.getClass();
        if (!gl1.d.K(cVar, e0Var) || s.g(cVar.getIsValid(), Boolean.FALSE)) {
            return Integer.valueOf(R.string.les_invalid_phone_number_dialog_title);
        }
        if (bo1.a.a().c().b0()) {
            l20.e smsOptinStatus = cVar.getSmsOptinStatus();
            if ((smsOptinStatus != null ? smsOptinStatus.getLiveEventSharingFitnessStatus() : null) == l20.f.OPTOUT) {
                return Integer.valueOf(z14 ? R.string.lbl_recipient_opted_out_message : R.string.contacts_validation_contact_opted_out);
            }
            if (s.g(cVar.getIsLiveEventSharingDefault(), Boolean.TRUE) && !cVar.f0()) {
                return Integer.valueOf(R.string.contacts_validation_needs_opt_in);
            }
        }
        return null;
    }

    public static final boolean e() {
        return !((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
    }

    public static final boolean f(l20.a aVar, e0 e0Var) {
        aVar.getClass();
        e0Var.getClass();
        List<l20.c> listZ = aVar.z();
        if (listZ == null || listZ.isEmpty()) {
            return false;
        }
        Iterator<T> it = listZ.iterator();
        while (it.hasNext()) {
            if (g((l20.c) it.next(), e0Var)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean g(l20.c cVar, e0 e0Var) {
        cVar.getClass();
        e0Var.getClass();
        return (bo1.a.a().c().b0() && !cVar.f0()) || !gl1.d.K(cVar, e0Var) || s.g(cVar.getIsValid(), Boolean.FALSE);
    }

    public static final Boolean h(l20.a aVar, l20.c cVar) {
        aVar.getClass();
        cVar.getClass();
        if (!aVar.k().contains(cVar)) {
            return null;
        }
        List<l20.c> listR = aVar.r();
        boolean z14 = false;
        if (listR != null && listR.contains(cVar)) {
            z14 = true;
        }
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public static final boolean i(l20.a aVar, l20.a aVar2) {
        ?? arrayList;
        aVar.getClass();
        aVar2.getClass();
        List<l20.g> listA = aVar.A();
        ?? arrayList2 = 0;
        if (listA != null) {
            arrayList = new ArrayList(y.r(listA, 10));
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(((l20.g) it.next()).getUserId());
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = j0.f134944a;
        }
        List<l20.g> listA2 = aVar2.A();
        if (listA2 != null) {
            arrayList2 = new ArrayList(y.r(listA2, 10));
            Iterator it3 = listA2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((l20.g) it3.next()).getUserId());
            }
        }
        if (arrayList2 == 0) {
            arrayList2 = j0.f134944a;
        }
        boolean zIsEmpty = h0.h0((Iterable) arrayList, (Iterable) arrayList2).isEmpty();
        List<l20.c> listK = aVar.k();
        ArrayList arrayList3 = new ArrayList(y.r(listK, 10));
        Iterator it4 = listK.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((l20.c) it4.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String());
        }
        List<l20.c> listK2 = aVar2.k();
        ArrayList arrayList4 = new ArrayList(y.r(listK2, 10));
        Iterator it5 = listK2.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((l20.c) it5.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String());
        }
        boolean zIsEmpty2 = h0.h0(arrayList3, arrayList4).isEmpty();
        if (zIsEmpty) {
            return s.g(aVar.getFirstName(), aVar2.getFirstName()) && s.g(aVar.getLastName(), aVar2.getLastName()) && !zIsEmpty2;
        }
        return true;
    }

    public static final l20.a j(l20.a aVar) {
        ArrayList arrayList;
        aVar.getClass();
        l20.a aVarG = l20.a.g(aVar, null, null, null, Boolean.FALSE, null, null, null, null, null, 8183);
        if (!aVarG.f()) {
            return aVarG;
        }
        List<l20.c> listZ = aVarG.z();
        ArrayList arrayList2 = null;
        if (listZ != null) {
            ArrayList arrayList3 = new ArrayList(y.r(listZ, 10));
            for (l20.c cVarB : listZ) {
                if (cVarB.G()) {
                    cVarB = l20.c.b(cVarB, null, null, null, null, null, null, null, null, null, Boolean.FALSE, 0, 983039);
                }
                arrayList3.add(cVarB);
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        l20.a aVarG2 = l20.a.g(aVarG, null, null, null, null, null, null, null, arrayList, null, 8063);
        List<l20.c> listR = aVarG2.r();
        if (listR != null) {
            arrayList2 = new ArrayList(y.r(listR, 10));
            for (l20.c cVarB2 : listR) {
                if (cVarB2.G()) {
                    cVarB2 = l20.c.b(cVarB2, null, null, null, null, null, null, null, null, null, Boolean.FALSE, 0, 983039);
                }
                arrayList2.add(cVarB2);
            }
        }
        return l20.a.g(aVarG2, null, null, null, null, null, null, arrayList2, null, null, 8127);
    }

    public static final String k(String str) {
        if (str == null || w.J(str)) {
            return "";
        }
        if (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f() || ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).n() || ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).y()) {
            return u.y(str, Marker.ANY_NON_NULL_MARKER, false) ? w.O(str, "+86") : w.O(str, "86");
        }
        return w.O(str, "+1");
    }

    public static final boolean l(ArrayList arrayList, l20.c cVar) {
        int i14;
        Long contactInfoPk = cVar.getContactInfoPk();
        int localId = cVar.getLocalId();
        if (contactInfoPk == null) {
            Iterator it = arrayList.iterator();
            i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                }
                if (((l20.c) it.next()).getLocalId() == localId) {
                    break;
                }
                i14++;
            }
        } else {
            Iterator it3 = arrayList.iterator();
            i14 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i14 = -1;
                    break;
                }
                Long contactInfoPk2 = ((l20.c) it3.next()).getContactInfoPk();
                long jLongValue = contactInfoPk.longValue();
                if (contactInfoPk2 != null && contactInfoPk2.longValue() == jLongValue) {
                    break;
                }
                i14++;
            }
        }
        if (i14 <= -1) {
            return false;
        }
        arrayList.set(i14, cVar);
        return true;
    }

    public static l20.a m(n nVar, int i14) {
        boolean z14 = (i14 & 1) == 0;
        boolean z15 = (i14 & 2) == 0;
        String strA = nVar.a();
        String strB = nVar.b();
        Set<o> set = nVar.f109031e;
        ArrayList arrayList = new ArrayList();
        for (o oVar : set) {
            oVar.getClass();
            String str = oVar.f109033a;
            Boolean boolValueOf = Boolean.valueOf(oVar.f109035c);
            Integer numValueOf = Integer.valueOf(oVar.f109034b.f109040a);
            i.f32732a.getClass();
            arrayList.add(new l20.c(null, str, boolValueOf, null, numValueOf, null, null, null, Boolean.valueOf(i.a.a(str)), null, null, null, null, null, null, null, null, null, null, 0, 1048297, null));
        }
        Set<j> set2 = nVar.f109032f;
        ArrayList arrayList2 = new ArrayList();
        for (j jVar : set2) {
            jVar.getClass();
            String str2 = jVar.f109005a;
            Boolean boolValueOf2 = Boolean.valueOf(jVar.f109007c);
            Integer numValueOf2 = Integer.valueOf(jVar.f109006b.f109012a);
            i.f32732a.getClass();
            arrayList2.add(new l20.c(null, str2, boolValueOf2, null, numValueOf2, null, null, null, Boolean.valueOf(i.f32735d.d(str2)), null, null, null, null, null, null, null, null, null, null, 0, 1048297, null));
        }
        return new l20.a(null, strA, strB, Boolean.valueOf(z14), Boolean.valueOf(z15), null, arrayList2, arrayList, null, null, null, null, null, 7969, null);
    }

    public static final p n(l20.g gVar) {
        gVar.getClass();
        String displayName = gVar.getDisplayName();
        if (displayName == null) {
            displayName = "";
        }
        String fullName = gVar.getFullName();
        if (fullName == null) {
            fullName = "";
        }
        String profileImageUrlMedium = gVar.getProfileImageUrlMedium();
        String location = gVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION java.lang.String();
        return new p(displayName, fullName, profileImageUrlMedium, location != null ? location : "", false, 16, null);
    }
}
