package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bs2.gf;
import c22.l3;
import c22.m3;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.gms.identity.intents.AddressConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import gg1.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.BooleanUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.i0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\t\n\u000b\f\r\u000eB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/f;", "Lcom/garmin/android/apps/connectmobile/s1;", "Lpd2/b;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", JWKParameterNames.RSA_EXPONENT, "g", "c", "f", "d", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends s1 implements pd2.b, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, Object> f34132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f34130c = new b(null);
    public static final Parcelable.Creator<f> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/devices/model/f$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/f;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public static final /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34163a;

        static {
            int[] iArr = new int[hg1.k.values().length];
            try {
                iArr[hg1.k.DATA_FIELD_PACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hg1.k.DATA_FIELD_PACE_AVG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hg1.k.DATA_FIELD_PACE_LAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[hg1.k.DATA_FIELD_SPEED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[hg1.k.DATA_FIELD_SPEED_AVG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[hg1.k.DATA_FIELD_SPEED_LAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[hg1.k.DATA_FIELD_LAPS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f34163a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e22.d, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f34165a;

        public j(e23.l lVar) {
            lVar.getClass();
            this.f34165a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof e22.d) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f34165a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // e22.d
        public final /* synthetic */ Object transform(Object obj) {
            return this.f34165a.invoke(obj);
        }
    }

    public f(Parcel parcel) {
        parcel.getClass();
        this.f34132b = new HashMap<>();
        String string = parcel.readString();
        string.getClass();
        d(string);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    public static final String M(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        f34130c.getClass();
        if (jSONObject == null || jSONObject2 == null) {
            jSONObject3 = null;
        } else {
            jSONObject3 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if (p005kotlin.jvm.internal.s.g(next, "subSport") || p005kotlin.jvm.internal.s.g(next, "subSportType")) {
                        jSONObject3.put(next, jSONObject.opt(next));
                    } else {
                        Object objOpt = jSONObject.opt(next);
                        Object objOpt2 = jSONObject2.opt(next);
                        if (objOpt != null && (objOpt2 == null || !p005kotlin.jvm.internal.s.g(objOpt.toString(), objOpt2.toString()))) {
                            jSONObject3.put(next, objOpt);
                        }
                    }
                } catch (JSONException e4) {
                    sn.a.s("Error creating delta JSONObject. ", e4.getMessage(), i2.f36769a, a2.DEVICES, "DeviceActivityOptionsDTO");
                }
            }
            if (jSONObject3.length() == 0) {
                jSONObject3 = null;
            }
        }
        if (jSONObject3 != null) {
            return jSONObject3.toString();
        }
        return null;
    }

    public static m3 p0() {
        f12.l.f68084a.getClass();
        return f12.l.a.a().g() == o0.METRIC ? m3.KILOMETER : m3.MILE;
    }

    public final ArrayList A0() {
        ArrayList arrayList = new ArrayList();
        if (R0()) {
            arrayList.add(hg1.j.ALERT_TYPE_RUN_WALK_INTERVALS);
        }
        if (V0()) {
            arrayList.add(hg1.j.ALERT_TYPE_VIRTUAL_PACER);
        }
        if (Q0()) {
            arrayList.add(hg1.j.ALERT_TYPE_DISTANCE);
        }
        if (S0()) {
            arrayList.add(hg1.j.ALERT_TYPE_TIME);
        }
        if (M0()) {
            arrayList.add(hg1.j.ALERT_TYPE_CALORIES);
        }
        if (this.f34132b.containsKey("repsAlertEnabled")) {
            arrayList.add(hg1.j.ALERT_TYPE_REP_COUNTING);
        }
        return arrayList;
    }

    public final void A1(Object obj, String str) {
        this.f34132b.put(str, obj);
    }

    public final void C() {
        if (R0()) {
            y1("intervalAlertsEnabled", Boolean.FALSE);
        }
        if (V0()) {
            y1("virtualPacerEnabled", Boolean.FALSE);
        }
        if (Q0()) {
            y1("distanceAlertEnabled", Boolean.FALSE);
        }
        if (S0()) {
            y1("timeAlertEnabled", Boolean.FALSE);
        }
        if (M0()) {
            y1("caloriesAlertEnabled", Boolean.FALSE);
        }
        if (this.f34132b.containsKey("repsAlertEnabled")) {
            y1("repsAlertEnabled", Boolean.FALSE);
        }
    }

    public final m3 C0() {
        m3 m3VarP0 = p0();
        if (!TextUtils.isEmpty(a0())) {
            w13.c cVar = m3.f23159r;
            cVar.getClass();
            for (m3 m3Var : (m3[]) p005kotlin.jvm.internal.i.d(cVar, new m3[0])) {
                if (d53.u.q(m3Var.name(), a0(), true)) {
                    m3VarP0 = m3Var;
                }
            }
        }
        return m3VarP0.f23160a ? m3.METER : m3.YARD;
    }

    public final void C1(List<? extends hg1.k> list) {
        List listB = e22.a.b(list, new j(new i0() { // from class: com.garmin.android.apps.connectmobile.devices.model.f.i
            @Override // p005kotlin.jvm.internal.i0, k23.n
            public final Object get(Object obj) {
                return ((hg1.k) obj).f83712a;
            }
        }), null);
        if (listB != null) {
            y1("availableFields", listB);
        } else {
            vb.h.s("Invalid value: [null].");
        }
    }

    public final Integer D() {
        Object obj = this.f34132b.get("autoActivityStartThreshold");
        obj.getClass();
        return (Integer) obj;
    }

    public final void D1(int i14) {
        if (i14 < 50 || i14 > 5000) {
            i14 = 100;
        }
        y1("caloriesAlertValue", Integer.valueOf(i14));
    }

    public final int E0() {
        HashMap<String, Object> map = this.f34132b;
        if (!map.containsKey("timeAlertSeconds")) {
            return 1800;
        }
        Object obj = map.get("timeAlertSeconds");
        obj.getClass();
        return ((Integer) obj).intValue();
    }

    public final double F() {
        HashMap<String, Object> map = this.f34132b;
        if (map.containsKey("autoLapDistanceInMeters")) {
            Double d14 = (Double) map.get("autoLapDistanceInMeters");
            d14.getClass();
            return d14.doubleValue();
        }
        m3 m3VarP0 = p0();
        l3.f23124b.getClass();
        return l3.a.h(1.0d, m3VarP0);
    }

    public final void F1(String str) {
        if (TextUtils.isEmpty(str)) {
            vb.h.s("Invalid value: [null]. Expected values: [\"MILE\", \"KILOMETER\"].");
        } else {
            y1("distanceAlertUnit", str);
        }
    }

    public final ArrayList G() {
        Object obj = this.f34132b.get("availableFields");
        List<String> arrayList = obj != null ? (List) obj : new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            hg1.k.f83699c.getClass();
            hg1.k kVarA = hg1.k.a.a(str);
            if (!arrayList2.contains(kVarA)) {
                arrayList2.add(kVarA);
            }
        }
        return arrayList2;
    }

    public final void G1(int i14) {
        if (i14 < 0 || i14 > 630) {
            i14 = 30;
        }
        y1("intervalRunSeconds", Integer.valueOf(i14));
    }

    public final int H() {
        HashMap<String, Object> map = this.f34132b;
        if (!map.containsKey("caloriesAlertValue")) {
            return 100;
        }
        Object obj = map.get("caloriesAlertValue");
        obj.getClass();
        return ((Integer) obj).intValue();
    }

    public final List<com.garmin.android.apps.connectmobile.devices.model.g> I() {
        Object obj = this.f34132b.get("dataFieldPages");
        return obj != null ? (List) obj : new ArrayList();
    }

    public final void I1(int i14) {
        if (i14 < 0 || i14 > 630) {
            i14 = 30;
        }
        y1("intervalWalkSeconds", Integer.valueOf(i14));
    }

    public final int J0() {
        HashMap<String, Object> map = this.f34132b;
        if (!map.containsKey("virtualPacerPace")) {
            return AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES;
        }
        l3.a aVar = l3.f23124b;
        Integer num = (Integer) map.get("virtualPacerPace");
        num.getClass();
        double dIntValue = ((double) num.intValue()) / 1000.0d;
        boolean zS1 = s1();
        aVar.getClass();
        return l3.a.p(dIntValue, zS1);
    }

    public final void J1(double d14) {
        if (Double.isNaN(d14)) {
            vb.h.s("Invalid value: [NaN].");
        } else {
            V1(((double) ((int) (Z() / k0()))) * d14);
            A1(String.valueOf(d14 * 100.0d), "poolLength");
        }
    }

    public final boolean L0() {
        if (R0() || V0() || Q0() || S0() || M0()) {
            return true;
        }
        HashMap<String, Object> map = this.f34132b;
        return map.containsKey("repsAlertEnabled") || map.containsKey("heartRateAlertEnabled");
    }

    public final boolean M0() {
        return this.f34132b.containsKey("caloriesAlertEnabled");
    }

    public final void M1(double d14) {
        m3 m3VarW0 = w0();
        l3.f23124b.getClass();
        double dH = l3.a.h(0.2d, m3VarW0);
        m3 m3Var = m3.METER;
        double dG = l3.a.g(99.99d, m3VarW0, m3Var);
        double dG2 = l3.a.g(1.0d, m3VarW0, m3Var);
        if (d14 < dH || d14 > dG) {
            d14 = dG2;
        }
        y1("distanceAlertMeter", Double.valueOf(d14));
    }

    public final boolean P0() {
        return !I().isEmpty();
    }

    public final boolean Q0() {
        return this.f34132b.containsKey("distanceAlertEnabled");
    }

    public final boolean R0() {
        HashMap<String, Object> map = this.f34132b;
        return map.containsKey("intervalAlertsEnabled") && map.get("intervalAlertsEnabled") != null;
    }

    public final boolean S0() {
        return this.f34132b.containsKey("timeAlertEnabled");
    }

    public final void S1(m3 m3Var) {
        m3Var.getClass();
        if (m3.MILE != m3Var && m3.KILOMETER != m3Var) {
            org.apache.commons.lang3.e.l("Invalid value: [", m3Var, "]. Expected values: [MILE, KILOMETER].");
            return;
        }
        String lowerCase = m3Var.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        F1(lowerCase);
    }

    public final void U1(hg1.k kVar) {
        if (kVar == null) {
            A1(null, "speedType");
            return;
        }
        switch (h.f34163a[kVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                A1(kVar.f83712a, "speedType");
                break;
            default:
                org.apache.commons.lang3.e.l("Invalid value: [", kVar, "]. Expected values: [PACE, PAVE_AVG, PACE_LAP, SPEED, SPEED_AVG, SPEED_LAP].");
                break;
        }
    }

    public final boolean V0() {
        HashMap<String, Object> map = this.f34132b;
        return map.containsKey("virtualPacerEnabled") && map.get("virtualPacerEnabled") != null;
    }

    public final void V1(double d14) {
        m3 m3VarC0 = C0();
        m3VarC0.getClass();
        l3.f23124b.getClass();
        double dG = l3.a.g(1.0d, m3VarC0, m3.METER);
        if (d14 < 25.0d || d14 > 9975.0d || d14 % ((double) 25) != 0.0d) {
            d14 = dG;
        }
        y1("distanceAlertMeter", Double.valueOf(d14));
    }

    public final void Y1(m3 m3Var) {
        m3Var.getClass();
        if (m3.METER == m3Var) {
            String lowerCase = "KILOMETER".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            F1(lowerCase);
        } else {
            if (m3.YARD != m3Var) {
                org.apache.commons.lang3.e.l("Invalid value: [", m3Var, "]. Expected values: [YARD, METER].");
                return;
            }
            String lowerCase2 = "MILE".toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            F1(lowerCase2);
        }
    }

    public final double Z() {
        HashMap<String, Object> map = this.f34132b;
        if (map.containsKey("distanceAlertMeter")) {
            Object obj = map.get("distanceAlertMeter");
            obj.getClass();
            return ((Double) obj).doubleValue();
        }
        l3.a aVar = l3.f23124b;
        m3 m3VarW0 = w0();
        aVar.getClass();
        return l3.a.h(1.0d, m3VarW0);
    }

    public final Boolean Z0() {
        HashMap<String, Object> map = this.f34132b;
        if (!map.containsKey("autoLapEnabled")) {
            return Boolean.FALSE;
        }
        Object obj = map.get("autoLapEnabled");
        obj.getClass();
        return (Boolean) obj;
    }

    public final String a0() {
        HashMap<String, Object> map = this.f34132b;
        if (map.containsKey("distanceAlertUnit")) {
            return (String) map.get("distanceAlertUnit");
        }
        return null;
    }

    public final void b2(int i14) {
        if (i14 < 240 || 1015 < i14) {
            i14 = AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES;
        }
        l3.a aVar = l3.f23124b;
        double d14 = i14;
        boolean zS1 = s1();
        aVar.getClass();
        y1("virtualPacerPace", Integer.valueOf((int) (l3.a.m(d14, zS1) * 1000.0d)));
    }

    public final ArrayList c0() {
        ArrayList arrayList = new ArrayList();
        if (R0() && j1().booleanValue()) {
            arrayList.add(hg1.j.ALERT_TYPE_RUN_WALK_INTERVALS);
        }
        if (V0() && x1().booleanValue()) {
            arrayList.add(hg1.j.ALERT_TYPE_VIRTUAL_PACER);
        }
        if (Q0() && e1().booleanValue()) {
            arrayList.add(hg1.j.ALERT_TYPE_DISTANCE);
        }
        if (S0() && v1().booleanValue()) {
            arrayList.add(hg1.j.ALERT_TYPE_TIME);
        }
        if (M0() && c1().booleanValue()) {
            arrayList.add(hg1.j.ALERT_TYPE_CALORIES);
        }
        if (this.f34132b.containsKey("repsAlertEnabled") && t1().booleanValue()) {
            arrayList.add(hg1.j.ALERT_TYPE_REP_COUNTING);
        }
        return arrayList;
    }

    public final Boolean c1() {
        if (!M0()) {
            return Boolean.FALSE;
        }
        Object obj = this.f34132b.get("caloriesAlertEnabled");
        obj.getClass();
        return (Boolean) obj;
    }

    @Override // pd2.b
    public final boolean d(String str) {
        try {
            k(new JSONObject(str));
            return true;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.DEVICES;
            aVar.getClass();
            i2.a.g(a2Var, "DeviceActivityOptionsDTO", e4);
            return false;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final gf e0() {
        HashMap<String, Object> map = this.f34132b;
        if (!map.containsKey("gpsMode")) {
            return null;
        }
        Object obj = map.get("gpsMode");
        obj.getClass();
        short sIntValue = (short) ((Integer) obj).intValue();
        for (gf gfVar : gf.values()) {
            if (sIntValue == gfVar.f20164a) {
                return gfVar;
            }
        }
        return gf.INVALID;
    }

    public final Boolean e1() {
        if (!Q0()) {
            return Boolean.FALSE;
        }
        Object obj = this.f34132b.get("distanceAlertEnabled");
        obj.getClass();
        return (Boolean) obj;
    }

    public final JSONObject e2() {
        HashMap<String, Object> map = this.f34132b;
        try {
            JSONObject jSONObject = new JSONObject(this.f34131a);
            for (String str : map.keySet()) {
                str.getClass();
                String str2 = str;
                if (str2.equals("dataFieldPages")) {
                    List<com.garmin.android.apps.connectmobile.devices.model.g> listI = I();
                    JSONArray jSONArray = new JSONArray();
                    Iterator<com.garmin.android.apps.connectmobile.devices.model.g> it = listI.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(new JSONObject(it.next().h()));
                    }
                    jSONObject.put(str2, jSONArray);
                } else if (str2.equals("availableFields")) {
                    Object obj = map.get("availableFields");
                    List arrayList = obj != null ? (List) obj : new ArrayList();
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        jSONArray2.put((String) it3.next());
                    }
                    jSONObject.put(str2, jSONArray2);
                } else {
                    if (map.get(str2) instanceof Double) {
                        Double d14 = (Double) map.get(str2);
                        d14.getClass();
                        if (!Double.isNaN(d14.doubleValue())) {
                        }
                    }
                    jSONObject.put(str2, map.get(str2));
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final int f0() {
        HashMap<String, Object> map = this.f34132b;
        if (!map.containsKey("heartRateAlertCustomHigh")) {
            return 180;
        }
        Object obj = map.get("heartRateAlertCustomHigh");
        obj.getClass();
        if (((Integer) obj).intValue() == 0) {
            return 180;
        }
        Object obj2 = map.get("heartRateAlertCustomHigh");
        obj2.getClass();
        return ((Integer) obj2).intValue();
    }

    public final int g0() {
        HashMap<String, Object> map = this.f34132b;
        if (!map.containsKey("heartRateAlertCustomLow")) {
            return 120;
        }
        Object obj = map.get("heartRateAlertCustomLow");
        obj.getClass();
        if (((Integer) obj).intValue() == 0) {
            return 120;
        }
        Object obj2 = map.get("heartRateAlertCustomLow");
        obj2.getClass();
        return ((Integer) obj2).intValue();
    }

    @Override // pd2.b
    public final String h() {
        String string;
        JSONObject jSONObjectE2 = e2();
        return (jSONObjectE2 == null || (string = jSONObjectE2.toString()) == null) ? "" : string;
    }

    public final int h0() {
        HashMap<String, Object> map = this.f34132b;
        if (!map.containsKey("heartRateAlertZone")) {
            return 1;
        }
        Object obj = map.get("heartRateAlertZone");
        obj.getClass();
        return ((Integer) obj).intValue();
    }

    public final Boolean h1() {
        HashMap<String, Object> map = this.f34132b;
        if (!map.containsKey("heartRateAlertEnabled")) {
            return Boolean.FALSE;
        }
        Object obj = map.get("heartRateAlertEnabled");
        obj.getClass();
        return (Boolean) obj;
    }

    public final int i0() {
        HashMap<String, Object> map = this.f34132b;
        if (!map.containsKey("intervalRunSeconds")) {
            return 30;
        }
        Object obj = map.get("intervalRunSeconds");
        obj.getClass();
        return ((Integer) obj).intValue();
    }

    public final int j0() {
        HashMap<String, Object> map = this.f34132b;
        if (!map.containsKey("intervalWalkSeconds")) {
            return 30;
        }
        Object obj = map.get("intervalWalkSeconds");
        obj.getClass();
        return ((Integer) obj).intValue();
    }

    public final Boolean j1() {
        if (!R0()) {
            return Boolean.FALSE;
        }
        Object obj = this.f34132b.get("intervalAlertsEnabled");
        obj.getClass();
        return (Boolean) obj;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f34131a = jSONObject.toString();
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.n(a2.DEVICES, "DeviceActivityOptionsDTO", "loadFromJson: json=" + jSONObject);
        this.f34132b.clear();
        y1("intervalAlertsEnabled", s1.o(jSONObject, "intervalAlertsEnabled"));
        y1("intervalRunSeconds", Integer.valueOf(jSONObject.optInt("intervalRunSeconds")));
        y1("intervalWalkSeconds", Integer.valueOf(jSONObject.optInt("intervalWalkSeconds")));
        y1("virtualPacerEnabled", s1.o(jSONObject, "virtualPacerEnabled"));
        y1("virtualPacerPace", Integer.valueOf(jSONObject.optInt("virtualPacerPace")));
        y1("heartRateAlertEnabled", s1.o(jSONObject, "heartRateAlertEnabled"));
        int iOptInt = jSONObject.optInt("heartRateAlertZone");
        if (iOptInt == -1) {
            iOptInt = 0;
        }
        y1("heartRateAlertZone", Integer.valueOf(iOptInt));
        y1("heartRateAlertCustomLow", Integer.valueOf(jSONObject.optInt("heartRateAlertCustomLow")));
        y1("heartRateAlertCustomHigh", Integer.valueOf(jSONObject.optInt("heartRateAlertCustomHigh")));
        y1("autoActivityStartThreshold", Integer.valueOf(jSONObject.optInt("autoActivityStartThreshold")));
        y1("autoLapEnabled", s1.o(jSONObject, "autoLapEnabled"));
        y1("lapKeyEnabled", s1.o(jSONObject, "lapKeyEnabled"));
        y1("autoPauseEnabled", s1.o(jSONObject, "autoPauseEnabled"));
        y1("speedType", s1.u(jSONObject, "speedType"));
        y1("timeAlertEnabled", s1.o(jSONObject, "timeAlertEnabled"));
        y1("timeAlertSeconds", Integer.valueOf(jSONObject.optInt("timeAlertSeconds")));
        y1("distanceAlertEnabled", s1.o(jSONObject, "distanceAlertEnabled"));
        y1("distanceAlertMeter", Double.valueOf(jSONObject.optDouble("distanceAlertMeter")));
        y1("distanceAlertUnit", s1.u(jSONObject, "distanceAlertUnit"));
        y1("autoLapDistanceInMeters", Double.valueOf(jSONObject.optDouble("autoLapDistanceInMeters")));
        y1("caloriesAlertEnabled", s1.o(jSONObject, "caloriesAlertEnabled"));
        y1("caloriesAlertValue", Integer.valueOf(jSONObject.optInt("caloriesAlertValue")));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dataFieldPages");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                com.garmin.android.apps.connectmobile.devices.model.g gVar = new com.garmin.android.apps.connectmobile.devices.model.g();
                gVar.k(jSONArrayOptJSONArray.getJSONObject(i14));
                arrayList.add(gVar);
            }
            y1("dataFieldPages", arrayList);
        }
        y1("availableFields", s1.y(jSONObject, "availableFields"));
        y1("timeDateEnabled", s1.o(jSONObject, "timeDateEnabled"));
        y1("gpsMode", s1.r(jSONObject, "gpsMode"));
        y1("sportType", s1.r(jSONObject, "sportType"));
        y1("subSportType", s1.r(jSONObject, "subSportType"));
        y1("sport", s1.u(jSONObject, "sport"));
        y1("subSport", s1.u(jSONObject, "subSport"));
        y1("measurementUnits", s1.u(jSONObject, "measurementUnits"));
        y1("poolLength", s1.u(jSONObject, "poolLength"));
        y1("poolLengthUnit", s1.u(jSONObject, "poolLengthUnit"));
        y1("autoRestEnabled", s1.o(jSONObject, "autoRestEnabled"));
        y1("strokeTypeDetectionEnabled", s1.o(jSONObject, "strokeTypeDetectionEnabled"));
        y1("swimPacingAlertEnabled", s1.o(jSONObject, "swimPacingAlertEnabled"));
        y1("countdownStartEnabled", s1.o(jSONObject, "countdownStartEnabled"));
        y1("swimPacingAlertValue", Integer.valueOf(jSONObject.optInt("swimPacingAlertValue")));
        y1("cadenceAlertModeHighEnabled", s1.o(jSONObject, "cadenceAlertModeHighEnabled"));
        y1("cadenceAlertCustomHighValue", Integer.valueOf(jSONObject.optInt("cadenceAlertCustomHighValue")));
        y1("cadenceAlertModeLowEnabled", s1.o(jSONObject, "cadenceAlertModeLowEnabled"));
        y1("cadenceAlertCustomLowValue", Integer.valueOf(jSONObject.optInt("cadenceAlertCustomLowValue")));
        y1("hrGaugeEnabled", s1.o(jSONObject, "hrGaugeEnabled"));
        y1("musicEnabled", s1.o(jSONObject, "musicEnabled"));
    }

    public final double k0() {
        HashMap<String, Object> map = this.f34132b;
        if (!map.containsKey("poolLength")) {
            return 25.0d;
        }
        String str = (String) map.get("poolLength");
        try {
            str.getClass();
            return Double.parseDouble(str) / 100.0d;
        } catch (NullPointerException e4) {
            sn.a.s("Expected double value for poolLength. error: ", e4.getMessage(), i2.f36769a, a2.DEVICES, "DeviceActivityOptionsDTO");
            return 25.0d;
        } catch (NumberFormatException e14) {
            sn.a.s("Expected double value for poolLength. error: ", e14.getMessage(), i2.f36769a, a2.DEVICES, "DeviceActivityOptionsDTO");
            return 25.0d;
        }
    }

    public final o0 n0() {
        if (TextUtils.isEmpty(o0())) {
            return null;
        }
        w13.c cVar = o0.f77290i;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            o0 o0Var = (o0) bVarN.next();
            if (d53.u.q(o0Var.f77291a, o0(), true)) {
                return o0Var;
            }
        }
        return null;
    }

    public final String o0() {
        String str;
        HashMap<String, Object> map = this.f34132b;
        return (!map.containsKey("poolLengthUnit") || (str = (String) map.get("poolLengthUnit")) == null) ? o0.METRIC.f77291a : str;
    }

    public final boolean s1() {
        return p005kotlin.jvm.internal.s.g((String) this.f34132b.get("measurementUnits"), "metric");
    }

    public final Boolean t1() {
        HashMap<String, Object> map = this.f34132b;
        if (!map.containsKey("repsAlertEnabled")) {
            return Boolean.FALSE;
        }
        Object obj = map.get("repsAlertEnabled");
        obj.getClass();
        return (Boolean) obj;
    }

    public final Boolean v1() {
        if (!S0()) {
            return Boolean.FALSE;
        }
        Object obj = this.f34132b.get("timeAlertEnabled");
        obj.getClass();
        return (Boolean) obj;
    }

    public final m3 w0() {
        if (!TextUtils.isEmpty(a0())) {
            w13.c cVar = m3.f23159r;
            cVar.getClass();
            for (m3 m3Var : (m3[]) p005kotlin.jvm.internal.i.d(cVar, new m3[0])) {
                if (d53.u.q(m3Var.name(), a0(), true)) {
                    return m3Var;
                }
            }
        }
        return p0();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(h());
    }

    public final hg1.k x0() {
        hg1.k.a aVar = hg1.k.f83699c;
        HashMap<String, Object> map = this.f34132b;
        String str = map.containsKey("speedType") ? (String) map.get("speedType") : null;
        aVar.getClass();
        hg1.k kVarA = hg1.k.a.a(str);
        switch (h.f34163a[kVarA.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return kVarA;
            default:
                return hg1.k.DATA_FIELD_PACE;
        }
    }

    public final Boolean x1() {
        if (!V0()) {
            return Boolean.FALSE;
        }
        Object obj = this.f34132b.get("virtualPacerEnabled");
        obj.getClass();
        return (Boolean) obj;
    }

    public final void y1(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.f34132b.put(str, obj);
    }

    public final String z0() {
        return (String) this.f34132b.get("subSport");
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/f$c;", "", "", Action.KEY_ATTRIBUTE, "", "value", "resource", "displayValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f34133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f34134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ c[] f34135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34136f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34138b;

        /* JADX INFO: Fake field, exist only in values array */
        c EF0;

        static {
            Object obj = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj.getClass();
            c cVar = new c("OFF", 0, BooleanUtils.OFF, 0, hb.a.h((c22.o) obj, R.string.lbl_off), 0);
            Object obj2 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj2.getClass();
            c cVar2 = new c("TEN_MINUTES", 1, "ten_minutes", 1, hb.a.h((c22.o) obj2, R.string.ten_minutes), 10);
            f34134d = cVar2;
            Object obj3 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj3.getClass();
            c cVar3 = new c("FIFTEEN_MINUTES", 2, "fifteen_minutes", 2, hb.a.h((c22.o) obj3, R.string.fifteen_minutes), 15);
            Object obj4 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj4.getClass();
            c[] cVarArr = {cVar, cVar2, cVar3, new c("TWENTY_MINUTES", 3, "twenty_minutes", 3, hb.a.h((c22.o) obj4, R.string.twenty_minutes), 20)};
            f34135e = cVarArr;
            f34136f = new w13.c(cVarArr);
            f34133c = new a(null);
        }

        private c(String str, int i14, String str2, int i15, String str3, int i16) {
            super(str, i14);
            this.f34137a = str3;
            this.f34138b = i16;
        }

        public static final c a(int i14) {
            f34133c.getClass();
            if (i14 != -1) {
                w13.c cVar = f34136f;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    c cVar2 = (c) bVarN.next();
                    if (cVar2.f34138b == i14) {
                        return cVar2;
                    }
                }
            }
            return f34134d;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f34135e.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/f$c$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/f$d;", "", "", Action.KEY_ATTRIBUTE, "", "value", "resource", "displayValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f34139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f34140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ d[] f34141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34142f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34144b;

        /* JADX INFO: Fake field, exist only in values array */
        d EF0;

        static {
            Object obj = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj.getClass();
            d dVar = new d("OFF", 0, BooleanUtils.OFF, 0, hb.a.h((c22.o) obj, R.string.lbl_off), 0);
            Object obj2 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj2.getClass();
            d dVar2 = new d("FIVE_MINUTES", 1, "five_minutes", 1, hb.a.h((c22.o) obj2, R.string.five_minutes), 5);
            f34140d = dVar2;
            Object obj3 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj3.getClass();
            d dVar3 = new d("TEN_MINUTES", 2, "ten_minutes", 2, hb.a.h((c22.o) obj3, R.string.ten_minutes), 10);
            Object obj4 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj4.getClass();
            d[] dVarArr = {dVar, dVar2, dVar3, new d("FIFTEEN_MINUTES", 3, "fifteen_minutes", 3, hb.a.h((c22.o) obj4, R.string.fifteen_minutes), 15)};
            f34141e = dVarArr;
            f34142f = new w13.c(dVarArr);
            f34139c = new a(null);
        }

        private d(String str, int i14, String str2, int i15, String str3, int i16) {
            super(str, i14);
            this.f34143a = str3;
            this.f34144b = i16;
        }

        public static final d a(int i14) {
            f34139c.getClass();
            if (i14 != -1) {
                w13.c cVar = f34142f;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    d dVar = (d) bVarN.next();
                    if (dVar.f34144b == i14) {
                        return dVar;
                    }
                }
            }
            return f34140d;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f34141e.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/f$d$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/f$e;", "", "", Action.KEY_ATTRIBUTE, "", "value", "resource", "displayValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f34145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f34146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ e[] f34147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34148f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34150b;

        /* JADX INFO: Fake field, exist only in values array */
        e EF0;

        static {
            Object obj = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj.getClass();
            e eVar = new e("OFF", 0, BooleanUtils.OFF, 0, hb.a.h((c22.o) obj, R.string.lbl_off), 0);
            Object obj2 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj2.getClass();
            e eVar2 = new e("ONE_MINUTE", 1, "one_minute", 1, hb.a.h((c22.o) obj2, R.string.one_minute), 1);
            f34146d = eVar2;
            Object obj3 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj3.getClass();
            e eVar3 = new e("TWO_MINUTES", 2, "two_minutes", 2, hb.a.h((c22.o) obj3, R.string.two_minutes), 2);
            Object obj4 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj4.getClass();
            e[] eVarArr = {eVar, eVar2, eVar3, new e("THREE_MINUTES", 3, "three_minutes", 3, hb.a.h((c22.o) obj4, R.string.three_minutes), 3)};
            f34147e = eVarArr;
            f34148f = new w13.c(eVarArr);
            f34145c = new a(null);
        }

        private e(String str, int i14, String str2, int i15, String str3, int i16) {
            super(str, i14);
            this.f34149a = str3;
            this.f34150b = i16;
        }

        public static final e a(int i14) {
            f34145c.getClass();
            if (i14 != -1) {
                w13.c cVar = f34148f;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    e eVar = (e) bVarN.next();
                    if (eVar.f34150b == i14) {
                        return eVar;
                    }
                }
            }
            return f34146d;
        }

        public static final e b(int i14) {
            f34145c.getClass();
            if (i14 != -1) {
                w13.c cVar = f34148f;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    e eVar = (e) bVarN.next();
                    if (eVar.ordinal() == i14) {
                        return eVar;
                    }
                }
            }
            return f34146d;
        }

        public static final CharSequence[] c() {
            f34145c.getClass();
            w13.c cVar = f34148f;
            CharSequence[] charSequenceArr = new CharSequence[cVar.getF168272d()];
            int length = cVar.toArray(new e[0]).length;
            for (int i14 = 0; i14 < length; i14++) {
                charSequenceArr[i14] = ((e) cVar.get(i14)).f34149a;
            }
            return charSequenceArr;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f34147e.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/f$e$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.model.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/f$f;", "", "", Action.KEY_ATTRIBUTE, "", "value", "resource", "displayValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EnumC0577f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f34151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final EnumC0577f f34152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumC0577f[] f34153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34154f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34156b;

        /* JADX INFO: Fake field, exist only in values array */
        EnumC0577f EF0;

        static {
            Object obj = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj.getClass();
            EnumC0577f enumC0577f = new EnumC0577f("OFF", 0, BooleanUtils.OFF, 0, hb.a.h((c22.o) obj, R.string.lbl_off), 0);
            Object obj2 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj2.getClass();
            EnumC0577f enumC0577f2 = new EnumC0577f("FIVE_MINUTES", 1, "five_minutes", 1, hb.a.h((c22.o) obj2, R.string.five_minutes), 5);
            f34152d = enumC0577f2;
            Object obj3 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj3.getClass();
            EnumC0577f enumC0577f3 = new EnumC0577f("TEN_MINUTES", 2, "ten_minutes", 2, hb.a.h((c22.o) obj3, R.string.ten_minutes), 10);
            Object obj4 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj4.getClass();
            EnumC0577f[] enumC0577fArr = {enumC0577f, enumC0577f2, enumC0577f3, new EnumC0577f("FIFTEEN_MINUTES", 3, "fifteen_minutes", 3, hb.a.h((c22.o) obj4, R.string.fifteen_minutes), 15)};
            f34153e = enumC0577fArr;
            f34154f = new w13.c(enumC0577fArr);
            f34151c = new a(null);
        }

        private EnumC0577f(String str, int i14, String str2, int i15, String str3, int i16) {
            super(str, i14);
            this.f34155a = str3;
            this.f34156b = i16;
        }

        public static final EnumC0577f a(int i14) {
            f34151c.getClass();
            if (i14 != -1) {
                w13.c cVar = f34154f;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    EnumC0577f enumC0577f = (EnumC0577f) bVarN.next();
                    if (enumC0577f.f34156b == i14) {
                        return enumC0577f;
                    }
                }
            }
            return f34152d;
        }

        public static EnumC0577f valueOf(String str) {
            return (EnumC0577f) Enum.valueOf(EnumC0577f.class, str);
        }

        public static EnumC0577f[] values() {
            return (EnumC0577f[]) f34153e.clone();
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.model.f$f$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/f$f$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/f$g;", "", "", Action.KEY_ATTRIBUTE, "", "value", "resource", "displayValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f34157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final g f34158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ g[] f34159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34160f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34162b;

        /* JADX INFO: Fake field, exist only in values array */
        g EF0;

        static {
            Object obj = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj.getClass();
            g gVar = new g("OFF", 0, BooleanUtils.OFF, 0, hb.a.h((c22.o) obj, R.string.lbl_off), 0);
            Object obj2 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj2.getClass();
            g gVar2 = new g("FIVE_MINUTES", 1, "five_minutes", 1, hb.a.h((c22.o) obj2, R.string.five_minutes), 5);
            Object obj3 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj3.getClass();
            g gVar3 = new g("TEN_MINUTES", 2, "ten_minutes", 2, hb.a.h((c22.o) obj3, R.string.ten_minutes), 10);
            f34158d = gVar3;
            Object obj4 = KoinJavaComponent.get$default(c22.o.class, null, null, 6, null);
            obj4.getClass();
            g[] gVarArr = {gVar, gVar2, gVar3, new g("FIFTEEN_MINUTES", 3, "fifteen_minutes", 3, hb.a.h((c22.o) obj4, R.string.fifteen_minutes), 15)};
            f34159e = gVarArr;
            f34160f = new w13.c(gVarArr);
            f34157c = new a(null);
        }

        private g(String str, int i14, String str2, int i15, String str3, int i16) {
            super(str, i14);
            this.f34161a = str3;
            this.f34162b = i16;
        }

        public static final g a(int i14) {
            f34157c.getClass();
            if (i14 != -1) {
                w13.c cVar = f34160f;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    g gVar = (g) bVarN.next();
                    if (gVar.f34162b == i14) {
                        return gVar;
                    }
                }
            }
            return f34158d;
        }

        public static final g b(int i14) {
            f34157c.getClass();
            if (i14 != -1) {
                w13.c cVar = f34160f;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    g gVar = (g) bVarN.next();
                    if (gVar.ordinal() == i14) {
                        return gVar;
                    }
                }
            }
            return f34158d;
        }

        public static final CharSequence[] c() {
            f34157c.getClass();
            w13.c cVar = f34160f;
            CharSequence[] charSequenceArr = new CharSequence[cVar.getF168272d()];
            int length = cVar.toArray(new g[0]).length;
            for (int i14 = 0; i14 < length; i14++) {
                charSequenceArr[i14] = ((g) cVar.get(i14)).f34161a;
            }
            return charSequenceArr;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f34159e.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/f$g$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000206058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/f$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "JSON_KEY_INTERVAL_ALERTS_ENABLED", "JSON_KEY_INTERVAL_RUN_SECONDS", "JSON_KEY_INTERVAL_WALK_SECONDS", "JSON_KEY_VIRTUAL_PACER_ENABLED", "JSON_KEY_VIRTUAL_PACER_PACE", "JSON_KEY_HEART_RATE_ALERT_ENABLED", "JSON_KEY_HEART_RATE_ALERT_ZONE", "JSON_KEY_HEART_RATE_ALERT_CUSTOM_LOW", "JSON_KEY_HEART_RATE_ALERT_CUSTOM_HIGH", "JSON_KEY_AUTO_ACTIVITY_START_THRESHOLD", "JSON_KEY_AUTO_LAP_ENABLED", "JSON_KEY_AUTO_LAP_DISTANCE_METERS", "JSON_KEY_LAP_KEY_ENABLED", "JSON_KEY_AUTO_PAUSE_ENABLED", "JSON_KEY_SPEED_TYPE", "JSON_KEY_TIME_ALERT_ENABLED", "JSON_KEY_TIME_ALERT_SECONDS", "JSON_KEY_DISTANCE_ALERT_ENABLED", "JSON_KEY_DISTANCE_ALERT_METER", "JSON_KEY_DISTANCE_ALERT_UNIT", "JSON_KEY_CALORIES_ALERT_ENABLED", "JSON_KEY_CALORIES_ALERT_VALUE", "JSON_KEY_REP_COUNTING_ALERT_ENABLED", "JSON_KEY_REP_COUNTING_ALERT_VALUE", "JSON_KEY_DATA_FIELD_PAGES", "JSON_KEY_AVAILABLE_FIELDS", "JSON_KEY_TIME_DATE_ENABLED", "JSON_KEY_GPS_MODE", "JSON_KEY_SPORT_TYPE", "JSON_KEY_SUB_SPORT_TYPE", "JSON_KEY_SPORT", "JSON_KEY_SUB_SPORT", "JSON_KEY_MEASUREMENT_UNITS", "JSON_KEY_POOL_LENGTH", "JSON_KEY_POOL_LENGTH_UNIT", "JSON_KEY_PACING_ALERT_ENABLED", "JSON_KEY_PACING_ALERT_VALUE", "JSON_KEY_AUTO_REST_ENABLED", "JSON_KEY_STROKE_TYPE_DETECTION_ENABLED", "JSON_KEY_COUNTDOWN_START_ENABLED", "JSON_KEY_CADENCE_ALERT_HIGH_ENABLED", "JSON_KEY_CADENCE_ALERT_HIGH_VALUE", "JSON_KEY_CADENCE_ALERT_LOW_ENABLED", "JSON_KEY_CADENCE_ALERT_LOW_VALUE", "JSON_KEY_HEART_RATE_GAUGE", "JSON_KEY_MUSIC", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/f;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public f() {
        this.f34132b = new HashMap<>();
    }
}
