package pj1;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p13.h0;
import p13.j0;
import p13.m0;
import zb0.n0;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 {
    public static final int a(sd2.f fVar) {
        if (fVar.y0()) {
            return 2;
        }
        if (fVar.B2()) {
            return 1;
        }
        return (km2.a.i(fVar.getUnitID(), null, SupportedCapability.INCIDENT_DETECTION.ordinal()) || j(fVar)) ? 0 : -1;
    }

    public static final int b(ue0.h hVar) {
        Boolean emergencyCallingCapable = hVar.getEmergencyCallingCapable();
        Boolean bool = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(emergencyCallingCapable, bool)) {
            return 1;
        }
        return (p005kotlin.jvm.internal.s.g(hVar.getIncidentDetectionCapable(), bool) || p005kotlin.jvm.internal.s.g(hVar.getFallDetectionCapable(), bool)) ? 0 : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList c(List list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            ue0.h hVar = (ue0.h) obj;
            Boolean incidentDetectionCapable = hVar.getIncidentDetectionCapable();
            Boolean bool = Boolean.TRUE;
            if (p005kotlin.jvm.internal.s.g(incidentDetectionCapable, bool) || p005kotlin.jvm.internal.s.g(hVar.getFallDetectionCapable(), bool) || p005kotlin.jvm.internal.s.g(hVar.getEmergencyCallingCapable(), bool)) {
                arrayListL.add(obj);
            }
        }
        List listN0 = h0.N0(h0.j1(arrayListL), new a0(new z()));
        ArrayList arrayList = new ArrayList(p13.y.r(listN0, 10));
        Iterator it = listN0.iterator();
        while (it.hasNext()) {
            arrayList.add((ue0.h) ((m0) it.next()).f134952b);
        }
        return arrayList;
    }

    public static final ArrayList d(List list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            sd2.f fVar = (sd2.f) obj;
            fVar.getClass();
            if (km2.a.i(fVar.getUnitID(), null, SupportedCapability.INCIDENT_DETECTION.ordinal()) || j(fVar) || fVar.y0() || fVar.B2()) {
                arrayListL.add(obj);
            }
        }
        List listN0 = h0.N0(h0.j1(arrayListL), new c0(new b0()));
        ArrayList arrayList = new ArrayList(p13.y.r(listN0, 10));
        Iterator it = listN0.iterator();
        while (it.hasNext()) {
            arrayList.add((sd2.f) ((m0) it.next()).f134952b);
        }
        return arrayList;
    }

    public static final String e(tj1.e eVar, boolean z14) {
        l20.q selfUserContactDTO;
        List<l20.c> listS;
        Object next;
        String str;
        eVar.getClass();
        l20.r userContactsDTO = eVar.getUserContactsDTO();
        if (userContactsDTO == null || (selfUserContactDTO = userContactsDTO.getSelfUserContactDTO()) == null || (listS = selfUserContactDTO.s()) == null) {
            return "";
        }
        Iterator<T> it = listS.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((l20.c) next).getIsPrimary(), Boolean.valueOf(z14)));
        l20.c cVar = (l20.c) next;
        return (cVar == null || (str = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String()) == null) ? "" : str;
    }

    public static final boolean f(ArrayList arrayList) {
        Object next;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<l20.c> listZ = ((l20.a) it.next()).z();
            if (listZ == null) {
                listZ = j0.f134944a;
            }
            p13.d0.v(arrayList2, listZ);
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            String str = ((l20.c) next).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
            if (str != null && str.length() != 0) {
                break;
            }
        }
        return ((l20.c) next) != null;
    }

    public static final boolean g(l20.q qVar, boolean z14) {
        qVar.getClass();
        if (!l(z14)) {
            return true;
        }
        if (!g22.n.d(qVar.getState()) || !g22.n.d(qVar.getCity())) {
            return false;
        }
        if (z14) {
            return g22.n.d(qVar.getCountry()) && g22.n.d(qVar.getZipCode()) && g22.n.d(qVar.getAddressLine1());
        }
        return true;
    }

    public static final boolean h(List<l20.c> list) {
        if (list.isEmpty()) {
            return false;
        }
        for (l20.c cVar : list) {
            if (p005kotlin.jvm.internal.s.g(cVar.getIsPrimary(), Boolean.TRUE)) {
                com.garmin.android.apps.connectmobile.contacts.i.a aVar = com.garmin.android.apps.connectmobile.contacts.i.f32732a;
                String str = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                aVar.getClass();
                if (com.garmin.android.apps.connectmobile.contacts.i.a.a(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean i(tj1.e eVar, boolean z14) {
        l20.r userContactsDTO;
        l20.q selfUserContactDTO;
        String fullName;
        l20.r userContactsDTO2;
        l20.q selfUserContactDTO2;
        l20.r userContactsDTO3;
        l20.q selfUserContactDTO3;
        String countryOfCitizenship;
        l20.r userContactsDTO4;
        l20.q selfUserContactDTO4;
        List<l20.c> listJ;
        eVar.getClass();
        if ((p005kotlin.jvm.internal.s.g(eVar.getAssistancePlusEnabled(), Boolean.TRUE) || z14) && (userContactsDTO = eVar.getUserContactsDTO()) != null && (selfUserContactDTO = userContactsDTO.getSelfUserContactDTO()) != null && (fullName = selfUserContactDTO.getFullName()) != null && (!d53.w.J(fullName)) && (userContactsDTO2 = eVar.getUserContactsDTO()) != null && (selfUserContactDTO2 = userContactsDTO2.getSelfUserContactDTO()) != null && g(selfUserContactDTO2, true) && (userContactsDTO3 = eVar.getUserContactsDTO()) != null && (selfUserContactDTO3 = userContactsDTO3.getSelfUserContactDTO()) != null && (countryOfCitizenship = selfUserContactDTO3.getCountryOfCitizenship()) != null && (!d53.w.J(countryOfCitizenship)) && (userContactsDTO4 = eVar.getUserContactsDTO()) != null && (selfUserContactDTO4 = userContactsDTO4.getSelfUserContactDTO()) != null && (listJ = selfUserContactDTO4.j()) != null && !listJ.isEmpty()) {
            Iterator<T> it = listJ.iterator();
            while (it.hasNext()) {
                if (gl1.d.J((l20.c) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean j(sd2.f fVar) {
        fVar.getClass();
        return km2.a.i(fVar.getUnitID(), n0.f203579c, SupportedCapability.INCIDENT_DETECT_AND_ASSISTANCE.ordinal());
    }

    public static final boolean k(l20.q qVar) {
        String fullName = qVar.getFullName();
        return fullName != null && fullName.length() > 0 && g(qVar, false);
    }

    public static final boolean l(boolean z14) {
        return !((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f() || z14;
    }

    public static final void m(Context context, boolean z14, boolean z15, boolean z16, boolean z17) {
        context.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_ASSISTANCE_PLUS", z14);
        bundle.putBoolean("IS_EMERGENCY_CALLING_CAPABLE_DEVICE", z15);
        bundle.putBoolean("IS_FALL_DETECTION_CAPABLE_DEVICE", z16);
        bundle.putBoolean("IS_INCIDENT_DETECTION_ONLY_CAPABLE_DEVICE", z17);
        HelpActivity.a aVar = HelpActivity.f36653a;
        ro0.l lVar = ro0.l.SAFETY_FEATURES;
        aVar.getClass();
        HelpActivity.a.d(context, lVar, null, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    public static final tj1.e n(tj1.e eVar, l20.a aVar) {
        ArrayList arrayList;
        l20.a aVarG;
        l20.a emergencyServiceContact;
        String contactId;
        ArrayList arrayList2;
        String firstName;
        String lastName;
        List<l20.a> listF;
        boolean z14;
        ArrayList arrayList3;
        boolean z15;
        eVar.getClass();
        l20.c cVarB = aVar != null ? vj1.f.b(aVar) : null;
        boolean zC = aVar != null ? vj1.f.c(aVar) : false;
        l20.r userContactsDTO = eVar.getUserContactsDTO();
        if (userContactsDTO == null || (listF = userContactsDTO.f()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(p13.y.r(listF, 10));
            for (l20.a aVar2 : listF) {
                if (!zC) {
                    z14 = false;
                } else if (p005kotlin.jvm.internal.s.g(aVar2.getContactId(), aVar != null ? aVar.getContactId() : null)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                List<l20.c> listZ = aVar2.z();
                if (listZ != null) {
                    ArrayList arrayList4 = new ArrayList(p13.y.r(listZ, 10));
                    for (l20.c cVar : listZ) {
                        if (!zC || !z14) {
                            z15 = false;
                        } else if (p005kotlin.jvm.internal.s.g(cVar.getContactInfoPk(), cVarB != null ? cVarB.getContactInfoPk() : null)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        arrayList4.add(l20.c.b(cVar, null, null, null, null, null, Boolean.valueOf(z15), null, null, null, null, 0, 1048511));
                    }
                    arrayList3 = arrayList4;
                } else {
                    arrayList3 = null;
                }
                arrayList.add(l20.a.g(aVar2, null, null, null, null, null, null, null, arrayList3, Boolean.valueOf(z14), 6015));
            }
        }
        if (zC || aVar == null || !(((firstName = aVar.getFirstName()) == null || firstName.length() == 0) && ((lastName = aVar.getLastName()) == null || lastName.length() == 0))) {
            l20.r userContactsDTO2 = eVar.getUserContactsDTO();
            if (userContactsDTO2 == null || (emergencyServiceContact = userContactsDTO2.getEmergencyServiceContact()) == null || (contactId = emergencyServiceContact.getContactId()) == null || contactId.length() == 0) {
                aVarG = null;
            } else {
                List<l20.c> listZ2 = emergencyServiceContact.z();
                if (listZ2 != null) {
                    ArrayList arrayList5 = new ArrayList(p13.y.r(listZ2, 10));
                    Iterator<T> it = listZ2.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(l20.c.b((l20.c) it.next(), null, null, null, null, null, Boolean.FALSE, null, null, null, null, 0, 1048511));
                    }
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = null;
                }
                aVarG = l20.a.g(emergencyServiceContact, null, null, null, null, null, null, null, arrayList2, Boolean.FALSE, 6015);
            }
        } else {
            aVarG = aVar;
        }
        l20.r userContactsDTO3 = eVar.getUserContactsDTO();
        return tj1.e.b(eVar, null, userContactsDTO3 != null ? l20.r.b(userContactsDTO3, arrayList, aVarG, null, 60) : null, 1);
    }
}
