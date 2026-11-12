package g20;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import c22.s3;
import com.garmin.android.apps.connectmobile.g3;
import f20.d0;
import f20.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l20.p;
import m20.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.x;
import re0.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lg20/i;", "Landroidx/lifecycle/u1;", "Lm20/z;", "contactsRepo", "Lre0/o;", "managedAccountRepo", "Lhl/a;", "screenAccessRole", "<init>", "(Lm20/z;Lre0/o;Lhl/a;)V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends u1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f75336p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f75337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f75338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hl.a f75339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l20.a f75340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l20.a f75341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f75342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f75343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e0 f75344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f75345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<n> f75346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0 f75347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0<g3<l20.a>> f75348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0 f75349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y0<String> f75350n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y0 f75351o;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75352a;

        static {
            int[] iArr = new int[l20.f.values().length];
            try {
                iArr[l20.f.OPTOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l20.f.ADMINOPTOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l20.f.OPTOUTSMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75352a = iArr;
        }
    }

    static {
        new a(null);
    }

    public i(z zVar, o oVar, hl.a aVar) {
        zVar.getClass();
        oVar.getClass();
        aVar.getClass();
        this.f75337a = zVar;
        this.f75338b = oVar;
        this.f75339c = aVar;
        this.f75345i = bo1.a.a().c().b0();
        y0<n> y0Var = new y0<>();
        this.f75346j = y0Var;
        this.f75347k = y0Var;
        y0<g3<l20.a>> y0Var2 = new y0<>();
        this.f75348l = y0Var2;
        this.f75349m = y0Var2;
        y0<String> y0Var3 = new y0<>();
        this.f75350n = y0Var3;
        this.f75351o = y0Var3;
    }

    public final void A4(String str) {
        l20.a aVar = this.f75341e;
        if (aVar == null) {
            s.m("contactDTO");
            throw null;
        }
        this.f75346j.m(new n(null, false, false, false, false, true, str, false, aVar, 159, null));
    }

    public final void B4(l20.a aVar) {
        this.f75341e = aVar;
        ArrayList arrayListY4 = y4(aVar);
        l20.a aVar2 = this.f75340d;
        if (aVar2 == null) {
            s.m("initialContactDTO");
            throw null;
        }
        this.f75346j.m(new n(arrayListY4, false, false, !aVar2.equals(aVar), false, false, null, false, aVar, 246, null));
        if (this.f75342f == 3) {
            l20.a aVar3 = this.f75341e;
            if (aVar3 == null) {
                s.m("contactDTO");
                throw null;
            }
            if (s.g(aVar3.getIsSosDefault(), Boolean.FALSE)) {
                x4();
            }
        }
    }

    public final void x4() {
        l20.a aVar = this.f75341e;
        if (aVar == null) {
            s.m("contactDTO");
            throw null;
        }
        this.f75346j.m(new n(null, false, false, false, true, false, null, false, aVar, 239, null));
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0346  */
    /* JADX WARN: Code duplicated, block: B:175:0x035d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0360  */
    /* JADX WARN: Code duplicated, block: B:178:0x0367  */
    /* JADX WARN: Code duplicated, block: B:186:0x0381  */
    /* JADX WARN: Code duplicated, block: B:188:0x0385  */
    /* JADX WARN: Code duplicated, block: B:198:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:202:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:205:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:206:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:212:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:220:0x0404  */
    /* JADX WARN: Code duplicated, block: B:249:0x0482  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r38v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r38v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public final ArrayList y4(l20.a aVar) {
        List<l20.c> listR;
        ?? featureConfirmationStatus;
        ?? next;
        List listN0;
        String str;
        ?? r17;
        int i14;
        Object featureConfirmationStatus2;
        boolean z14;
        boolean z15;
        ?? D;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        Boolean isLiveEventSharingDefault;
        boolean zBooleanValue;
        boolean z25;
        boolean z26;
        Object next2;
        l20.f liveTrackStatus;
        ArrayList arrayListM;
        boolean z27;
        int i15 = this.f75342f;
        e0 e0Var = this.f75344h;
        String str2 = null;
        int i16 = 3;
        if (i15 == 3) {
            if (e0Var == null) {
                s.m("phonePrefixProvider");
                throw null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            String firstName = aVar.getFirstName();
            if (firstName == null) {
                firstName = "";
            }
            String lastName = aVar.getLastName();
            if (lastName == null) {
                lastName = "";
            }
            l20.g gVarQ = aVar.q();
            arrayList.add(new com.garmin.android.apps.connectmobile.contacts.a.d(firstName, lastName, gVarQ != null ? gVarQ.getProfileImageUrlMedium() : null, false, ge1.b.F(aVar), 8, null));
            List<l20.c> listZ = aVar.z();
            if (listZ != null) {
                z27 = false;
                for (l20.c cVar : listZ) {
                    String str3 = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                    if (str3 != null) {
                        boolean z28 = !e0Var.a(str3) || s.g(cVar.getIsValid(), Boolean.FALSE) || (cVar.M() && cVar.f() && !cVar.d());
                        if (cVar.I() || (cVar.G() && cVar.d())) {
                            arrayList4.add(new d0.b(cVar.getContactInfoPk(), str3, cVar.u(), z28, cVar.getPhoneUUID(), false, ge1.b.E(cVar), ge1.b.N(cVar), ge1.b.C(cVar), arrayList4.isEmpty(), 0, 1056, null));
                        } else if (cVar.H()) {
                            arrayList2.add(new d0.b(cVar.getContactInfoPk(), str3, cVar.u(), z28, cVar.getPhoneUUID(), false, ge1.b.E(cVar), ge1.b.N(cVar), ge1.b.C(cVar), arrayList2.isEmpty(), 0, 1056, null));
                        } else if (cVar.Z() || cVar.M()) {
                            arrayList3.add(new d0.b(cVar.getContactInfoPk(), str3, cVar.u(), z28, cVar.getPhoneUUID(), false, ge1.b.E(cVar), ge1.b.N(cVar), ge1.b.C(cVar), arrayList3.isEmpty(), 0, 1056, null));
                        } else {
                            z27 = true;
                        }
                    }
                }
            } else {
                z27 = false;
            }
            List<l20.c> listR2 = aVar.r();
            if (listR2 != null) {
                for (l20.c cVar2 : listR2) {
                    String str4 = cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                    if (str4 != null) {
                        boolean z29 = !gl1.d.J(cVar2) || (cVar2.M() && cVar2.f() && !cVar2.d());
                        if (cVar2.I() || (cVar2.G() && cVar2.d())) {
                            arrayList4.add(new d0.b(cVar2.getContactInfoPk(), str4, cVar2.m(), z29, cVar2.getPhoneUUID(), false, ge1.b.E(cVar2), ge1.b.N(cVar2), ge1.b.C(cVar2), arrayList4.isEmpty(), 0, 1056, null));
                        } else if (cVar2.H()) {
                            arrayList2.add(new d0.b(cVar2.getContactInfoPk(), str4, cVar2.m(), z29, cVar2.getPhoneUUID(), false, ge1.b.E(cVar2), ge1.b.N(cVar2), ge1.b.C(cVar2), arrayList2.isEmpty(), 0, 1056, null));
                        } else if (cVar2.Z() || cVar2.M()) {
                            arrayList3.add(new d0.b(cVar2.getContactInfoPk(), str4, cVar2.m(), z29, cVar2.getPhoneUUID(), false, ge1.b.E(cVar2), ge1.b.N(cVar2), ge1.b.C(cVar2), arrayList3.isEmpty(), 0, 1056, null));
                        } else {
                            z27 = true;
                        }
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                Object obj = arrayList4.get(arrayList4.size() - 1);
                obj.getClass();
                d0.b bVar = (d0.b) obj;
                arrayList4.remove(bVar);
                bVar.f68373f = true;
                arrayList4.add(bVar);
            }
            arrayList.addAll(arrayList2);
            arrayList.addAll(arrayList3);
            arrayList.addAll(arrayList4);
            if (z27) {
                arrayList.add(d0.a.f68367a);
            }
            return arrayList;
        }
        if (e0Var == null) {
            s.m("phonePrefixProvider");
            throw null;
        }
        ArrayList arrayList5 = new ArrayList();
        String firstName2 = aVar.getFirstName();
        if (firstName2 == null) {
            firstName2 = "";
        }
        String lastName2 = aVar.getLastName();
        if (lastName2 == null) {
            lastName2 = "";
        }
        l20.g gVarQ2 = aVar.q();
        arrayList5.add(new com.garmin.android.apps.connectmobile.contacts.a.d(firstName2, lastName2, gVarQ2 != null ? gVarQ2.getProfileImageUrlMedium() : null, (i15 == 2 || i15 == 1 || (arrayListM = aVar.M()) == null || !(arrayListM.isEmpty() ^ true)) ? false : true, ge1.b.F(aVar)));
        if (i15 != 1) {
            List<l20.c> listZ2 = aVar.z();
            if (listZ2 == null || (listN0 = h0.N0(listZ2, new k())) == null) {
                listN0 = j0.f134944a;
            }
            int i17 = 0;
            for (Object obj2 : listN0) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    ?? r38 = str2;
                    x.q();
                    throw r38;
                }
                l20.c cVar3 = (l20.c) obj2;
                String str5 = cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                if (str5 != null) {
                    boolean z34 = i15 == 2;
                    boolean zG0 = cVar3.g0();
                    l20.e smsOptinStatus = cVar3.getSmsOptinStatus();
                    if (smsOptinStatus != null) {
                        liveTrackStatus = smsOptinStatus.getLiveTrackStatus();
                    } else {
                        r17 = str2;
                    }
                    if (r17 == 0) {
                        r17 = liveTrackStatus;
                        i14 = -1;
                    } else {
                        r17 = liveTrackStatus;
                        i14 = b.f75352a[r17.ordinal()];
                    }
                    int i19 = i14;
                    boolean z35 = i19 == 1 || i19 == 2 || i19 == i16;
                    List<l20.b> listQ = cVar3.q();
                    if (listQ != null) {
                        Iterator it = listQ.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                str = str2;
                                next2 = str;
                                break;
                            }
                            next2 = it.next();
                            str = str2;
                            if (((l20.b) next2).getFeatureName() == l20.l.LIVETRACK) {
                                break;
                            }
                            str2 = str;
                        }
                        l20.b bVar2 = (l20.b) next2;
                        if (bVar2 != null) {
                            featureConfirmationStatus2 = bVar2.getFeatureConfirmationStatus();
                        }
                        if (featureConfirmationStatus2 != com.garmin.android.apps.connectmobile.contacts.model.a.DECLINED || z35) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (e0Var.a(str5) || s.g(cVar3.getIsValid(), Boolean.FALSE)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i15 == 2) {
                            D = com.garmin.android.apps.connectmobile.contacts.b.d(cVar3, e0Var, true);
                        } else {
                            D = str;
                        }
                        if (e0Var.a(str5) || D != 0 || s.g(cVar3.getIsValid(), Boolean.FALSE)) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (i17 == 0 && ((l20.c) listN0.get(i17 - 1)).u() == cVar3.u()) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        z18 = z34;
                        Long contactInfoPk = cVar3.getContactInfoPk();
                        p pVarU = cVar3.u();
                        if (z18 && zG0) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (z18 || z15) {
                            z24 = false;
                        } else {
                            z24 = true;
                        }
                        isLiveEventSharingDefault = cVar3.getIsLiveEventSharingDefault();
                        if (isLiveEventSharingDefault != null) {
                            zBooleanValue = isLiveEventSharingDefault.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (gl1.d.K(cVar3, e0Var) || s.g(cVar3.getIsValid(), Boolean.FALSE)) {
                            z25 = false;
                        } else {
                            z25 = true;
                        }
                        Boolean isEmsValue = cVar3.getIsEmsValue();
                        String phoneUUID = cVar3.getPhoneUUID();
                        Integer numD = ge1.b.D(cVar3);
                        if (this.f75345i || !z18 || z15 || cVar3.f0()) {
                            z26 = false;
                        } else {
                            z26 = true;
                        }
                        arrayList5.add(new com.garmin.android.apps.connectmobile.contacts.a.f(contactInfoPk, str5, pVarU, z16, z19, z14, z24, zBooleanValue, z25, isEmsValue, phoneUUID, D, false, numD, null, z26, null, z17, 0, ge1.b.F(aVar), false, 1396736, null));
                    } else {
                        str = str2;
                    }
                    featureConfirmationStatus2 = str;
                    if (featureConfirmationStatus2 != com.garmin.android.apps.connectmobile.contacts.model.a.DECLINED) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (e0Var.a(str5)) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (i15 == 2) {
                        D = com.garmin.android.apps.connectmobile.contacts.b.d(cVar3, e0Var, true);
                    } else {
                        D = str;
                    }
                    if (e0Var.a(str5)) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (i17 == 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z34;
                    Long contactInfoPk2 = cVar3.getContactInfoPk();
                    p pVarU2 = cVar3.u();
                    if (z18) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z18) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    isLiveEventSharingDefault = cVar3.getIsLiveEventSharingDefault();
                    if (isLiveEventSharingDefault != null) {
                        zBooleanValue = isLiveEventSharingDefault.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (gl1.d.K(cVar3, e0Var)) {
                        z25 = false;
                    } else {
                        z25 = false;
                    }
                    Boolean isEmsValue2 = cVar3.getIsEmsValue();
                    String phoneUUID2 = cVar3.getPhoneUUID();
                    Integer numD2 = ge1.b.D(cVar3);
                    if (this.f75345i) {
                        z26 = false;
                    } else {
                        z26 = false;
                    }
                    arrayList5.add(new com.garmin.android.apps.connectmobile.contacts.a.f(contactInfoPk2, str5, pVarU2, z16, z19, z14, z24, zBooleanValue, z25, isEmsValue2, phoneUUID2, D, false, numD2, null, z26, null, z17, 0, ge1.b.F(aVar), false, 1396736, null));
                } else {
                    str = str2;
                }
                i17 = i18;
                str2 = str;
                i16 = 3;
            }
        }
        ?? r39 = str2;
        if (i15 != 2 && (listR = aVar.r()) != null) {
            int i24 = 0;
            for (Object obj3 : listR) {
                int i25 = i24 + 1;
                if (i24 < 0) {
                    x.q();
                    throw r39;
                }
                l20.c cVar4 = (l20.c) obj3;
                String str6 = cVar4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                if (str6 != null) {
                    boolean zG1 = cVar4.g0();
                    List<l20.b> listQ2 = cVar4.q();
                    if (listQ2 != null) {
                        Iterator it3 = listQ2.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = r39;
                                break;
                            }
                            next = it3.next();
                        } while (((l20.b) next).getFeatureName() != l20.l.LIVETRACK);
                        l20.b bVar3 = (l20.b) next;
                        if (bVar3 != null) {
                            featureConfirmationStatus = bVar3.getFeatureConfirmationStatus();
                        } else {
                            featureConfirmationStatus = r39;
                        }
                    } else {
                        featureConfirmationStatus = r39;
                    }
                    boolean z36 = featureConfirmationStatus == com.garmin.android.apps.connectmobile.contacts.model.a.DECLINED;
                    boolean z37 = i15 == 1;
                    arrayList5.add(new com.garmin.android.apps.connectmobile.contacts.a.c(cVar4.getContactInfoPk(), str6, cVar4.m(), gl1.d.J(cVar4), 0, !z37 && zG1, z36, z37, z37 && zG1, false, ge1.b.D(cVar4), null, i24 == 0, ge1.b.F(aVar), 2576, null));
                }
                i24 = i25;
            }
        }
        List<l20.c> listY = aVar.y();
        if (listY != null) {
            int i26 = 0;
            for (Object obj4 : listY) {
                int i27 = i26 + 1;
                if (i26 < 0) {
                    x.q();
                    throw r39;
                }
                l20.c cVar5 = (l20.c) obj4;
                String str7 = cVar5.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                if (str7 != null) {
                    arrayList5.add(new com.garmin.android.apps.connectmobile.contacts.a.e(str7, cVar5.g0(), i26 == 0));
                }
                i26 = i27;
            }
        }
        if (s3.b()) {
            arrayList5.add(com.garmin.android.apps.connectmobile.contacts.a.g.f32377a);
        }
        return arrayList5;
    }

    public final void z4() {
        l20.a aVar = this.f75341e;
        if (aVar == null) {
            s.m("contactDTO");
            throw null;
        }
        this.f75346j.m(new n(null, false, false, false, false, true, null, false, aVar, 159, null));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg20/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
