package nj2;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import b21.a5;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.customermanagementlib.CustomerManagementException;
import d53.w;
import dj2.t0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.p0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lnj2/a;", "Landroidx/lifecycle/u1;", "Ldj2/a;", "repository", "<init>", "(Ldj2/a;)V", "a", "b", "c", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj2.a f126249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f126250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f126251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f126252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fj2.i f126253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public gj2.a f126254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public gj2.d f126255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f126256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f126257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<cj2.b> f126258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<Boolean> f126259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0<fj2.a> f126260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0<fj2.a> f126261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y0<List<fj2.a>> f126262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y0<List<fj2.h>> f126263o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y0<List<fj2.a>> f126264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y0<fj2.h> f126265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0<List<fj2.d>> f126266r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y0<List<o13.p<String, String>>> f126267t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y0<List<o13.p<String, String>>> f126268v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y0<List<o13.p<String, String>>> f126269w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y0<List<o13.p<String, String>>> f126270x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y0<List<fj2.f>> f126271y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final y0<List<fj2.i>> f126272z;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 nj2.a$b[], still in use, count: 1, list:
      (r0v1 nj2.a$b[]) from 0x00c7: CONSTRUCTOR (r0v1 nj2.a$b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnj2/a$b;", "", "", "isMandatory", "isVisible", "", "fieldName", "<init>", "(Ljava/lang/String;IZZI)V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        FIRST_NAME(true, true, R.string.cm_first_name),
        LAST_NAME(true, true, R.string.cm_last_name),
        ADDRESS_LINE_1(true, true, R.string.cm_address_1),
        ADDRESS_LINE_2(false, false, R.string.cm_address_2),
        ADDRESS_LINE_3(false, false, R.string.cm_address_3),
        ADDRESS_LINE_4(false, false, R.string.cm_address_4),
        COUNTRY_REGION(true, true, R.string.cm_country_region),
        STATE_OR_PROVINCE(true, false, R.string.cm_state_province),
        COUNTY_OR_DISTRICT(false, false, R.string.cm_county_district),
        CITY(true, true, R.string.cm_city_ward),
        POSTAL_CODE(true, true, R.string.cm_zip_postal_code),
        PHONE_REGION(true, true, R.string.cm_phone_region),
        PHONE_NUMBER(true, true, R.string.cm_phone_number);


        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final /* synthetic */ w13.c f126287r;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f126288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f126289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f126290c;

        static {
            f126287r = new w13.c(bVarArr);
        }

        private b(boolean z14, boolean z15, int i14) {
            super(str, i);
            this.f126288a = z14;
            this.f126289b = z15;
            this.f126290c = i14;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f126286q.clone();
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126293a;

        static {
            int[] iArr = new int[cj2.a.b.values().length];
            try {
                iArr[cj2.a.b.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cj2.a.b.REQUIRED_STATE_CODE_FOR_COUNTRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cj2.a.b.INVALID_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[cj2.a.b.INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[cj2.a.b.INVALID_STATE_CODE_FOR_COUNTRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f126293a = iArr;
        }
    }

    static {
        new C2428a(null);
    }

    public a(dj2.a aVar) {
        aVar.getClass();
        this.f126249a = aVar;
        this.f126250b = o13.m.b(new n61.h(22));
        this.f126252d = p0.n(Boolean.TRUE);
        this.f126256h = ((ij2.a) KoinJavaComponent.get$default(ij2.a.class, null, null, 6, null)).c().getCountry();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        w13.c cVar = b.f126287r;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            b bVar = (b) bVarN.next();
            t0 t0Var = new t0(null, null, false, false, false, 31, null);
            t0Var.f60141d = bVar.f126288a;
            t0Var.f60142e = bVar.f126289b;
            if (bVar == b.COUNTRY_REGION) {
                t0Var.f60138a = this.f126256h;
            }
            linkedHashMap.put(bVar, t0Var);
        }
        this.f126257i = linkedHashMap;
        this.f126258j = new y0<>();
        this.f126259k = new y0<>();
        this.f126260l = new y0<>();
        this.f126261m = new y0<>();
        this.f126262n = new y0<>();
        this.f126263o = new y0<>();
        this.f126264p = new y0<>();
        this.f126265q = new y0<>();
        this.f126266r = new y0<>();
        this.f126267t = new y0<>();
        this.f126268v = new y0<>();
        this.f126269w = new y0<>();
        this.f126270x = new y0<>();
        this.f126271y = new y0<>();
        this.f126272z = new y0<>();
    }

    public static final void x4(a aVar) {
        aVar.G4().debug("populateWithSavedValues");
        fj2.a aVarD = aVar.f126260l.d();
        if (aVarD != null) {
            String firstName = aVarD.getFirstName();
            if (firstName != null) {
                aVar.Q4(b.FIRST_NAME, firstName);
            }
            String lastName = aVarD.getLastName();
            if (lastName != null) {
                aVar.Q4(b.LAST_NAME, lastName);
            }
            String line1 = aVarD.getLine1();
            if (line1 != null) {
                aVar.Q4(b.ADDRESS_LINE_1, line1);
            }
            String line2 = aVarD.getLine2();
            if (line2 != null) {
                aVar.Q4(b.ADDRESS_LINE_2, line2);
            }
            String line3 = aVarD.getLine3();
            if (line3 != null) {
                aVar.Q4(b.ADDRESS_LINE_3, line3);
            }
            String line4 = aVarD.getLine4();
            if (line4 != null) {
                aVar.Q4(b.ADDRESS_LINE_4, line4);
            }
            String str = aVarD.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String();
            if (str != null) {
                aVar.f126256h = str;
                aVar.O4(b.COUNTRY_REGION, str);
            }
            String stateOrProvince = aVarD.getStateOrProvince();
            if (stateOrProvince != null) {
                aVar.O4(b.STATE_OR_PROVINCE, stateOrProvince);
            }
            String countyOrParish = aVarD.getCountyOrParish();
            if (countyOrParish != null) {
                aVar.O4(b.COUNTY_OR_DISTRICT, countyOrParish);
            }
            String city = aVarD.getCity();
            if (city != null) {
                b bVar = b.CITY;
                aVar.O4(bVar, city);
                aVar.Q4(bVar, city);
            }
            String postalCode = aVarD.getPostalCode();
            if (postalCode != null) {
                aVar.Q4(b.POSTAL_CODE, postalCode);
            }
            String phoneNumberId = aVarD.getPhoneNumberId();
            if (phoneNumberId != null) {
                aVar.O4(b.PHONE_NUMBER, phoneNumberId);
            }
            fj2.h hVarD = aVar.f126265q.d();
            if (hVarD != null) {
                String strF = hVarD.getIsoCountryCode();
                if (strF == null) {
                    strF = aVarD.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String();
                }
                if (hVarD.getCountryCode() != null) {
                    aVar.O4(b.PHONE_REGION, hVarD.getCountryCode() + "-" + strF);
                }
                String strG = hVarD.getPhoneNumber();
                if (strG != null) {
                    aVar.Q4(b.PHONE_NUMBER, strG);
                }
            }
        }
    }

    public final void A4(String str, String str2) {
        str.getClass();
        ge1.b.T(v1.a(this), null, null, new nj2.c(this, str2, str, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    public final o13.p<Boolean, Integer> B4(b bVar) {
        o13.p<Boolean, Integer> pVar;
        String str;
        String string;
        bVar.getClass();
        boolean z14 = bVar.f126289b;
        boolean z15 = bVar.f126288a;
        if (z15 && z14) {
            t0 t0Var = new t0(null, null, false, false, false, 31, null);
            LinkedHashMap linkedHashMap = this.f126257i;
            t0 t0Var2 = (t0) linkedHashMap.getOrDefault(bVar, t0Var);
            String str2 = t0Var2.f60138a;
            if ((str2 != null && str2.length() != 0) || ((str = t0Var2.f60139b) != null && str.length() != 0)) {
                String str3 = ((t0) linkedHashMap.getOrDefault(bVar, new t0(null, null, false, false, false, 31, null))).f60139b;
                if ((str3 == null || (string = w.i0(str3).toString()) == null || string.length() != 0) && !p005kotlin.jvm.internal.s.g(H4(bVar), "---")) {
                    cj2.a.f27739a.getClass();
                    pVar = cj2.a.f27740b;
                }
            }
            pVar = new o13.p<>(Boolean.FALSE, Integer.valueOf(R.string.cm_field_required));
        } else {
            cj2.a.f27739a.getClass();
            pVar = cj2.a.f27740b;
        }
        G4().debug("fieldNullCheck: (field = " + bVar + ", isVisible = " + z14 + ", isMandatory = " + z15 + ", returnPair = " + pVar + ")");
        return pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object C4(String str, v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f126313c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f126313c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objU = fVar.f126311a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f126313c;
        try {
            if (i15 == 0) {
                o13.r.b(objU);
                G4().debug("getAddressValidation");
                z4(str);
                gj2.a aVar2 = this.f126254f;
                if (aVar2 != null) {
                    dj2.a aVar3 = this.f126249a;
                    gj2.d dVar = this.f126255g;
                    String strB = dVar != null ? dVar.getPhoneNumber() : null;
                    gj2.b bVar = new gj2.b(aVar2.getFirstName(), aVar2.getLastName(), aVar2.getCity(), aVar2.getStateOrProvince(), aVar2.getCountryCode(), aVar2.getPostalCode(), aVar2.getLine1(), aVar2.getLine2(), new gj2.c(strB, strB != null, false, 4, null));
                    fVar.f126313c = 1;
                    objU = aVar3.u(bVar, fVar);
                    if (objU == aVar) {
                        return aVar;
                    }
                }
                return null;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objU);
            return (fj2.b) objU;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: D4, reason: from getter */
    public final y0 getF126269w() {
        return this.f126269w;
    }

    /* JADX INFO: renamed from: E4, reason: from getter */
    public final y0 getF126268v() {
        return this.f126268v;
    }

    public final String F4(b bVar) {
        bVar.getClass();
        return ((t0) this.f126257i.getOrDefault(bVar, new t0(null, null, false, false, false, 31, null))).f60138a;
    }

    public final Logger G4() {
        return (Logger) this.f126250b.getValue();
    }

    public final String H4(b bVar) {
        bVar.getClass();
        return ((t0) this.f126257i.getOrDefault(bVar, new t0(null, null, false, false, false, 31, null))).f60139b;
    }

    public final void I4(Exception exc) {
        G4().debug("handleException: e = " + exc.getLocalizedMessage());
        boolean z14 = exc instanceof CustomerManagementException;
        y0<cj2.b> y0Var = this.f126258j;
        if (z14) {
            y0Var.m(((CustomerManagementException) exc).getErrorFlag());
        } else {
            y0Var.m(cj2.b.UNKNOWN);
        }
    }

    public final boolean J4() {
        dj2.a aVar = this.f126249a;
        return aVar.f59962f.getCom.google.firebase.perf.util.Constants.ENABLE_DISABLE java.lang.String() || aVar.f59963g;
    }

    public final void K4(fj2.g gVar, e23.l<? super o13.p<Boolean, Integer>, Unit> lVar) {
        o13.p pVar;
        G4().debug("isFieldValid: " + gVar);
        b bVarD = gVar.d();
        if (bVarD != null && bVarD.f126288a) {
            if (((t0) this.f126257i.getOrDefault(bVarD, new t0(null, null, false, false, false, 31, null))).f60142e) {
                String strB = gVar.getReason();
                if (strB != null) {
                    int i14 = d.f126293a[cj2.a.b.valueOf(strB).ordinal()];
                    if (i14 == 1 || i14 == 2) {
                        pVar = new o13.p(Boolean.FALSE, Integer.valueOf(R.string.cm_field_required));
                    } else if (i14 == 3 || i14 == 4) {
                        pVar = new o13.p(Boolean.FALSE, Integer.valueOf(R.string.cm_please_enter_a_valid));
                    } else {
                        pVar = i14 != 5 ? new o13.p(Boolean.FALSE, Integer.valueOf(R.string.cm_invalid_field)) : new o13.p(Boolean.FALSE, Integer.valueOf(R.string.cm_state_country_mismatch));
                    }
                    lVar.invoke(pVar);
                    return;
                }
                return;
            }
        }
        cj2.a.f27739a.getClass();
        lVar.invoke(cj2.a.f27740b);
    }

    public final void L4(b bVar, boolean z14) {
        bVar.getClass();
        t0 t0Var = new t0(null, null, false, false, false, 31, null);
        LinkedHashMap linkedHashMap = this.f126257i;
        t0 t0Var2 = (t0) linkedHashMap.getOrDefault(bVar, t0Var);
        t0Var2.f60142e = z14;
        linkedHashMap.put(bVar, t0Var2);
    }

    public final void M4() {
        ge1.b.T(v1.a(this), null, null, new h(this, null), 3);
    }

    public final o53.c2 N4(String str, boolean z14) {
        return ge1.b.T(v1.a(this), null, null, new l(this, str, z14, null), 3);
    }

    public final void O4(b bVar, String str) {
        bVar.getClass();
        str.getClass();
        t0 t0Var = new t0(null, null, false, false, false, 31, null);
        LinkedHashMap linkedHashMap = this.f126257i;
        t0 t0Var2 = (t0) linkedHashMap.getOrDefault(bVar, t0Var);
        t0Var2.f60138a = str;
        linkedHashMap.put(bVar, t0Var2);
    }

    public final void P4(b bVar, String str, String str2) {
        bVar.getClass();
        str.getClass();
        str2.getClass();
        this.f126257i.put(bVar, new t0(str, str2, false, false, false, 28, null));
    }

    public final void Q4(b bVar, String str) {
        bVar.getClass();
        str.getClass();
        t0 t0Var = new t0(null, null, false, false, false, 31, null);
        LinkedHashMap linkedHashMap = this.f126257i;
        t0 t0Var2 = (t0) linkedHashMap.getOrDefault(bVar, t0Var);
        t0Var2.f60139b = str;
        linkedHashMap.put(bVar, t0Var2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R4(String str, a5 a5Var, v13.c cVar) {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f126357d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f126357d = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object objC4 = rVar.f126355b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f126357d;
        c2 c2Var = this.f126252d;
        if (i15 == 0) {
            o13.r.b(objC4);
            G4().debug("startValidations");
            c2Var.setValue(Boolean.TRUE);
            z4(str);
            gj2.a aVar = this.f126254f;
            if (aVar == null || !aVar.getPredicted()) {
                G4().debug("startValidations: Second validation: false. Proceed to third validation");
                rVar.f126354a = a5Var;
                rVar.f126357d = 1;
                objC4 = C4(str, rVar);
                if (objC4 == obj) {
                    return obj;
                }
            } else {
                G4().debug("startValidations: Second validation: true");
                a5Var.invoke(c.b.f126292a);
            }
            c2Var.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        a5Var = rVar.f126354a;
        o13.r.b(objC4);
        fj2.b bVar = (fj2.b) objC4;
        if (bVar == null) {
            G4().debug("startValidations: Since we already null check all mandatory fields proceed to save the address");
            a5Var.invoke(c.b.f126292a);
        } else if (bVar.getValid()) {
            G4().debug("startValidations: Third validation: valid");
            a5Var.invoke(c.b.f126292a);
        } else {
            G4().debug("startValidations: Third validation: not valid. Show invalid fields");
            a5Var.invoke(new c.C2429a(bVar.b()));
        }
        c2Var.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public final void y4(b bVar) {
        bVar.getClass();
        this.f126257i.put(bVar, new t0(null, null, false, false, false, 31, null));
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00f6  */
    public final void z4(String str) {
        boolean z14;
        String countryIso2;
        String line1;
        String line2;
        String line3;
        String line4;
        String city;
        String provinceCode;
        String provinceName;
        Unit unit;
        G4().debug("createAddressRequest");
        G4().debug("isAddressDataFromLoqate");
        fj2.i iVar = this.f126253e;
        if (iVar != null && (((countryIso2 = iVar.getCountryIso2()) == null || countryIso2.equals(F4(b.COUNTRY_REGION))) && (((line1 = iVar.getLine1()) == null || line1.equals(H4(b.ADDRESS_LINE_1))) && (((line2 = iVar.getLine2()) == null || line2.equals(H4(b.ADDRESS_LINE_2))) && (((line3 = iVar.getLine3()) == null || line3.equals(H4(b.ADDRESS_LINE_3))) && (((line4 = iVar.getLine4()) == null || line4.equals(H4(b.ADDRESS_LINE_4))) && (((city = iVar.getCity()) == null || city.equals(H4(b.CITY))) && (((provinceCode = iVar.getProvinceCode()) == null || provinceCode.equals(F4(b.STATE_OR_PROVINCE))) && ((provinceName = iVar.getProvinceName()) == null || provinceName.equals(H4(b.STATE_OR_PROVINCE))))))))))) {
            String postalCode = iVar.getPostalCode();
            if (postalCode == null) {
                unit = null;
            } else {
                if (!postalCode.equals(H4(b.POSTAL_CODE))) {
                    z14 = false;
                    break;
                }
                unit = Unit.INSTANCE;
            }
            if (unit != null) {
                Iterator<T> it = b.f126287r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z14 = true;
                        break;
                    } else if (!B4((b) it.next()).f128594a.booleanValue()) {
                        z14 = false;
                        break;
                    }
                }
            } else {
                z14 = false;
                break;
            }
        } else {
            z14 = false;
            break;
        }
        String strH4 = H4(b.FIRST_NAME);
        String strH5 = H4(b.LAST_NAME);
        String strF4 = F4(b.COUNTRY_REGION);
        String strF5 = F4(b.COUNTY_OR_DISTRICT);
        String strH6 = H4(b.ADDRESS_LINE_1);
        String strH7 = H4(b.ADDRESS_LINE_2);
        String strH8 = H4(b.ADDRESS_LINE_3);
        String strH9 = H4(b.ADDRESS_LINE_4);
        b bVar = b.CITY;
        String strH10 = F4(bVar) == null ? H4(bVar) : F4(bVar);
        String strF6 = F4(b.STATE_OR_PROVINCE);
        String strH11 = H4(b.POSTAL_CODE);
        b bVar2 = b.PHONE_NUMBER;
        this.f126254f = new gj2.a(str, null, null, z14, strH6, strH7, strH8, strH9, strH10, strF6, strH11, strF4, strF5, false, F4(bVar2), strH4, strH5, 8198, null);
        String strF7 = F4(bVar2);
        String strH12 = H4(bVar2);
        b bVar3 = b.PHONE_REGION;
        String strF8 = F4(bVar3);
        String str2 = strF8 != null ? (String) w.W(strF8, new String[]{"-"}).get(0) : null;
        String strF9 = F4(bVar3);
        this.f126255g = new gj2.d(strF7, null, str2, null, strH12, null, null, false, strF9 != null ? (String) w.W(strF9, new String[]{"-"}).get(1) : null, 234, null);
    }

    /* JADX INFO: renamed from: nj2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnj2/a$a;", "", "<init>", "()V", "", "FIND_ADDRESS_CALL_DELAY", "J", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2428a {
        public /* synthetic */ C2428a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2428a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lnj2/a$c;", "", "<init>", "()V", "b", "a", "Lnj2/a$c$a;", "Lnj2/a$c$b;", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: nj2.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnj2/a$c$a;", "Lnj2/a$c;", "", "Lfj2/g;", "invalidFields", "<init>", "(Ljava/util/List;)V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2429a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<fj2.g> f126291a;

            public C2429a(List<fj2.g> list) {
                super(null);
                this.f126291a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2429a) && p005kotlin.jvm.internal.s.g(this.f126291a, ((C2429a) obj).f126291a);
            }

            public final int hashCode() {
                List<fj2.g> list = this.f126291a;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            public final String toString() {
                return tn.k.h("InvalidFields(invalidFields=", ")", this.f126291a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnj2/a$c$b;", "Lnj2/a$c;", "<init>", "()V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f126292a = new b();

            private b() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1518242362;
            }

            public final String toString() {
                return "Successful";
            }
        }

        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
