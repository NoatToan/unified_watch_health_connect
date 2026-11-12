package com.garmin.android.apps.connectmobile.devices.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bs2.in;
import c22.l3;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@JsonAdapter(DeviceSettingsDTODeserializer.class)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0016\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\n¨\u0006!"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "(Lorg/json/JSONObject;)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "DeviceSettingsDTODeserializer", "p", "j", "l", "v", "b", "c", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "u", "a", JWKParameterNames.OCT_KEY_VALUE, "g", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "d", "s", JWKParameterNames.RSA_MODULUS, JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "h", "m", "o", IntegerTokenConverter.CONVERTER_KEY, "f", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceSettingsDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<DeviceSettingsDTO> CREATOR;
    public String A;
    public Boolean A1;
    public String B;
    public Boolean B1;
    public String C;
    public Double C1;
    public String D;
    public Double D1;
    public String E;
    public Boolean E1;
    public String F;
    public String F1;
    public final HashSet G1;
    public Boolean H0;
    public List<String> I;
    public com.garmin.android.apps.connectmobile.devices.model.q I0;
    public Boolean J0;
    public Boolean K0;
    public String L0;
    public List<String> M0;
    public String N0;
    public List<String> O0;
    public Long P;
    public ArrayList P0;
    public x Q0;
    public String R0;
    public List<String> S0;
    public String T;
    public com.garmin.android.apps.connectmobile.devices.model.k T0;
    public String U0;
    public List<String> V0;
    public String W0;
    public String X;
    public String X0;
    public String Y;
    public String Y0;
    public String Z;
    public String Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f33860a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public String f33861a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33862b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public wi1.c f33863b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33864c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public wi1.f f33865c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33866d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public Boolean f33867d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33868e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public Boolean f33869e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.o f33870f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public Boolean f33871f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.o f33872g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public Boolean f33873g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f33874h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public String f33875h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<com.garmin.android.apps.connectmobile.devices.model.i> f33876i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public String f33877i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f33878j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public nr0.a f33879j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<String> f33880k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Boolean f33881k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public String f33882k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f33883l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public Boolean f33884l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.h f33885m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public Boolean f33886m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f33887n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public Boolean f33888n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Boolean f33889o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public String f33890o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean f33891p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public String f33892p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f33893q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public Integer f33894q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Boolean f33895r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public Boolean f33896r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public String f33897s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f33898t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public String f33899t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public Integer f33900u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f33901v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public Boolean f33902v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f33903w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public String f33904w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List<yg1.g> f33905x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public String f33906x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Integer f33907y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public Integer f33908y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List<String> f33909z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public String f33910z1;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$DeviceSettingsDTODeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DeviceSettingsDTODeserializer implements JsonDeserializer<DeviceSettingsDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final DeviceSettingsDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                DeviceSettingsDTO deviceSettingsDTO = new DeviceSettingsDTO();
                deviceSettingsDTO.k(new JSONObject(jsonElement.toString()));
                return deviceSettingsDTO;
            } catch (Exception unused) {
                return new DeviceSettingsDTO();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$e", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements Parcelable.Creator<DeviceSettingsDTO> {
        @Override // android.os.Parcelable.Creator
        public final DeviceSettingsDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new DeviceSettingsDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DeviceSettingsDTO[] newArray(int i14) {
            return new DeviceSettingsDTO[i14];
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class w implements e22.d, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f34074a;

        public w(e23.l lVar) {
            lVar.getClass();
            this.f34074a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof e22.d) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f34074a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // e22.d
        public final /* synthetic */ Object transform(Object obj) {
            return this.f34074a.invoke(obj);
        }
    }

    static {
        new f(null);
        CREATOR = new e();
    }

    public DeviceSettingsDTO(Parcel parcel) throws IllegalAccessException {
        parcel.getClass();
        this.G1 = new HashSet();
        this.F1 = parcel.readString();
        this.f33860a = parcel.readLong();
        this.f33862b = parcel.readString();
        this.f33864c = parcel.readString();
        this.f33866d = parcel.readString();
        this.f33868e = parcel.readString();
        this.f33870f = (com.garmin.android.apps.connectmobile.devices.model.o) parcel.readParcelable(com.garmin.android.apps.connectmobile.devices.model.o.class.getClassLoader());
        this.f33872g = (com.garmin.android.apps.connectmobile.devices.model.o) parcel.readParcelable(com.garmin.android.apps.connectmobile.devices.model.o.class.getClassLoader());
        this.f33874h = parcel.createTypedArrayList(z.CREATOR);
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, com.garmin.android.apps.connectmobile.devices.model.i.CREATOR);
        this.f33876i = arrayList;
        Class cls = Boolean.TYPE;
        this.f33878j = (Boolean) parcel.readValue(cls.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        parcel.readStringList(arrayList2);
        this.f33880k = arrayList2;
        this.f33883l = Integer.valueOf(parcel.readInt());
        this.f33885m = (com.garmin.android.apps.connectmobile.devices.model.h) parcel.readParcelable(com.garmin.android.apps.connectmobile.devices.model.h.class.getClassLoader());
        this.f33887n = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f33889o = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f33891p = (Boolean) parcel.readValue(cls.getClassLoader());
        this.F = parcel.readString();
        this.f33893q = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f33895r = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f33898t = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f33901v = (Boolean) parcel.readValue(cls.getClassLoader());
        ArrayList arrayList3 = new ArrayList();
        Object obj = com.garmin.android.apps.connectmobile.devices.model.w.class.getDeclaredField("CREATOR").get(null);
        Parcelable.Creator creator = obj instanceof Parcelable.Creator ? (Parcelable.Creator) obj : null;
        if (creator == null) {
            n23.j.A(s0.f105811a.b(com.garmin.android.apps.connectmobile.devices.model.w.class).D(), "Could not access CREATOR field in class ");
            throw null;
        }
        parcel.readTypedList(arrayList3, creator);
        this.f33903w = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        parcel.readTypedList(arrayList4, yg1.g.CREATOR);
        this.f33905x = arrayList4;
        this.f33907y = (Integer) parcel.readValue(Integer.TYPE.getClassLoader());
        ArrayList arrayList5 = new ArrayList();
        parcel.readStringList(arrayList5);
        this.f33909z = arrayList5;
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.P = Long.valueOf(parcel.readLong());
        this.T = parcel.readString();
        this.Y = parcel.readString();
        this.Z = parcel.readString();
        this.f33881k0 = (Boolean) parcel.readValue(cls.getClassLoader());
        this.I0 = (com.garmin.android.apps.connectmobile.devices.model.q) parcel.readParcelable(com.garmin.android.apps.connectmobile.devices.model.q.class.getClassLoader());
        this.J0 = (Boolean) parcel.readValue(cls.getClassLoader());
        this.K0 = (Boolean) parcel.readValue(cls.getClassLoader());
        ArrayList arrayList6 = new ArrayList();
        parcel.readStringList(arrayList6);
        this.I = arrayList6;
        this.L0 = parcel.readString();
        ArrayList arrayList7 = new ArrayList();
        parcel.readStringList(arrayList7);
        this.M0 = arrayList7;
        this.N0 = parcel.readString();
        ArrayList arrayList8 = new ArrayList();
        parcel.readStringList(arrayList8);
        this.O0 = arrayList8;
        ArrayList arrayList9 = new ArrayList();
        Object obj2 = c0.class.getDeclaredField("CREATOR").get(null);
        Parcelable.Creator creator2 = obj2 instanceof Parcelable.Creator ? (Parcelable.Creator) obj2 : null;
        if (creator2 == null) {
            n23.j.A(s0.f105811a.b(c0.class).D(), "Could not access CREATOR field in class ");
            throw null;
        }
        parcel.readTypedList(arrayList9, creator2);
        this.P0 = arrayList9;
        this.Q0 = (x) parcel.readParcelable(x.class.getClassLoader());
        this.R0 = parcel.readString();
        this.S0 = parcel.createStringArrayList();
        this.T0 = (com.garmin.android.apps.connectmobile.devices.model.k) parcel.readParcelable(com.garmin.android.apps.connectmobile.devices.model.k.class.getClassLoader());
        this.U0 = parcel.readString();
        ArrayList arrayList10 = new ArrayList();
        parcel.readStringList(arrayList10);
        this.V0 = arrayList10;
        this.W0 = parcel.readString();
        this.X0 = parcel.readString();
        this.Y0 = parcel.readString();
        this.Z0 = parcel.readString();
        this.f33861a1 = parcel.readString();
        this.H0 = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f33863b1 = (wi1.c) parcel.readParcelable(wi1.c.class.getClassLoader());
        this.f33865c1 = (wi1.f) parcel.readParcelable(wi1.f.class.getClassLoader());
        this.X = parcel.readString();
        this.f33867d1 = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f33869e1 = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f33871f1 = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f33875h1 = parcel.readString();
        this.f33877i1 = parcel.readString();
        this.f33879j1 = (nr0.a) parcel.readParcelable(nr0.a.class.getClassLoader());
        this.f33882k1 = parcel.readString();
        this.f33884l1 = (Boolean) parcel.readValue(cls.getClassLoader());
        this.f33873g1 = (Boolean) parcel.readValue(cls.getClassLoader());
        ClassLoader classLoader = cls.getClassLoader();
        this.f33886m1 = (Boolean) parcel.readValue(classLoader);
        this.A1 = (Boolean) parcel.readValue(classLoader);
        this.f33888n1 = (Boolean) parcel.readValue(classLoader);
        this.f33890o1 = parcel.readString();
        this.f33892p1 = parcel.readString();
        if (parcel.readInt() == 1) {
            this.f33894q1 = Integer.valueOf(parcel.readInt());
        }
        this.f33896r1 = (Boolean) parcel.readValue(classLoader);
        this.f33897s1 = parcel.readString();
        this.f33899t1 = parcel.readString();
        if (parcel.readInt() == 1) {
            this.f33900u1 = Integer.valueOf(parcel.readInt());
        }
        this.f33902v1 = (Boolean) parcel.readValue(classLoader);
        this.f33904w1 = parcel.readString();
        this.f33906x1 = parcel.readString();
        if (parcel.readInt() == 1) {
            this.f33908y1 = Integer.valueOf(parcel.readInt());
        }
        this.f33910z1 = parcel.readString();
        this.B1 = (Boolean) parcel.readValue(classLoader);
        ClassLoader classLoader2 = Double.TYPE.getClassLoader();
        this.C1 = (Double) parcel.readValue(classLoader2);
        this.D1 = (Double) parcel.readValue(classLoader2);
        this.E1 = (Boolean) parcel.readValue(classLoader);
    }

    public final List<zb0.a> A0() {
        List<String> list = this.f33909z;
        return (list == null || list.isEmpty()) ? new ArrayList() : e22.a.b(this.f33909z, new w(new ch1.f(10)), new f3());
    }

    public final void A1(String str) {
        this.A = str;
        S1("defaultPage");
    }

    public final z C() {
        ArrayList<z> arrayList = this.f33874h;
        if (arrayList == null) {
            return null;
        }
        for (z zVar : arrayList) {
            if ("ACTIVITY".equals(zVar.f34341a)) {
                return zVar;
            }
        }
        return null;
    }

    public final ArrayList C0() {
        ArrayList arrayList = new ArrayList();
        List<String> list = this.I;
        if (list == null || list.isEmpty()) {
            arrayList.add(g.ON);
            arrayList.add(g.DURING_ACTIVITY);
            arrayList.add(g.OFF);
            return arrayList;
        }
        List<String> list2 = this.I;
        list2.getClass();
        for (String str : list2) {
            g.f33947b.getClass();
            g gVarA = g.a.a(str);
            if (gVarA != null && !arrayList.contains(gVarA)) {
                arrayList.add(gVarA);
            }
        }
        return arrayList;
    }

    public final void C1(g gVar) {
        gVar.getClass();
        String str = gVar.f33955a;
        this.F = str;
        S1(str);
    }

    public final List<com.garmin.android.apps.connectmobile.devices.model.i> D() {
        if (this.f33876i == null) {
            this.f33876i = new ArrayList();
        }
        return this.f33876i;
    }

    public final void D1(j jVar) {
        jVar.getClass();
        this.f33864c = jVar.f33975a;
        S1("dateFormat");
    }

    public final ArrayList E0() {
        if (!Q0()) {
            return null;
        }
        wi1.c cVar = this.f33863b1;
        cVar.getClass();
        if (cVar.f185491i == null) {
            return null;
        }
        wi1.c cVar2 = this.f33863b1;
        cVar2.getClass();
        com.garmin.android.apps.connectmobile.devices.model.o oVar = cVar2.f185491i;
        oVar.getClass();
        return oVar.C(false);
    }

    public final zb0.a F() {
        zb0.a.C3799a c3799a = zb0.a.f203414e;
        String str = this.f33910z1;
        c3799a.getClass();
        return zb0.a.C3799a.a(str);
    }

    public final void F1(l lVar) {
        lVar.getClass();
        this.f33866d = lVar.f33989a;
        S1("allUnits");
    }

    public final c G() {
        c.a aVar = c.f33927c;
        String str = this.Z0;
        aVar.getClass();
        if (str != null) {
            w13.c cVar = c.f33938n;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                c cVar2 = (c) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(cVar2.f33939a, str)) {
                    return cVar2;
                }
            }
        }
        return c.AUTO_BRIGHTNESS_TIMEOUT;
    }

    public final void G1(s sVar) {
        sVar.getClass();
        this.Z = sVar.f34052a;
        S1("screenOrientation");
    }

    public final z H() {
        ArrayList<z> arrayList = this.f33874h;
        if (arrayList == null) {
            return null;
        }
        for (z zVar : arrayList) {
            if ("DEFAULT".equals(zVar.f34341a)) {
                return zVar;
            }
        }
        return null;
    }

    public final g I() {
        g.a aVar = g.f33947b;
        String str = this.F;
        aVar.getClass();
        return g.a.a(str);
    }

    public final void I1(p pVar) {
        pVar.getClass();
        this.f33862b = pVar.f34016a;
        S1("timeFormat");
    }

    public final ArrayList J0() {
        if (!c1()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<String> list = this.O0;
        list.getClass();
        for (String str : list) {
            q.f34018b.getClass();
            q qVarA = q.a.a(str);
            if (qVarA != null && !arrayList.contains(qVarA)) {
                arrayList.add(qVarA);
            }
        }
        return arrayList;
    }

    public final void J1(q qVar) {
        qVar.getClass();
        this.N0 = qVar.f34040a;
        S1("watchFace");
    }

    public final boolean L0() {
        com.garmin.android.apps.connectmobile.devices.model.h hVar = this.f33885m;
        return (hVar != null ? hVar.getActivityTrackingEnabled() : null) != null;
    }

    public final a M() {
        a.C0575a c0575a = a.f33911c;
        String str = this.T;
        c0575a.getClass();
        if (str != null) {
            w13.c cVar = a.f33916h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                a aVar = (a) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(aVar.f33917a, str)) {
                    return aVar;
                }
            }
        }
        return a.ALWAYS;
    }

    public final boolean M0() {
        if (D() != null) {
            List<com.garmin.android.apps.connectmobile.devices.model.i> listD = D();
            listD.getClass();
            if (!listD.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void M1(lu.b bVar) {
        if (bVar != null) {
            if (lu.b.LAP == bVar) {
                this.f33899t1 = "LAP";
                this.f33900u1 = 0;
                return;
            }
            this.f33899t1 = "TIME";
            l3.a aVar = l3.f23124b;
            int i14 = bVar.f114923a;
            aVar.getClass();
            this.f33900u1 = Integer.valueOf(l3.a.y(0, i14, 0));
        }
    }

    public final boolean P0() {
        com.garmin.android.apps.connectmobile.devices.model.k kVar = this.T0;
        return (kVar == null || kVar.f34190a == null) ? false : true;
    }

    public final boolean Q0() {
        return this.f33863b1 != null;
    }

    public final boolean R0() {
        return this.f33896r1 != null;
    }

    public final boolean S0() {
        return this.f33865c1 != null;
    }

    public final void S1(String str) {
        if (str != null) {
            this.G1.add(str);
        }
    }

    public final void U1(Boolean bool) {
        this.f33869e1 = bool;
        S1("soundInAppOnlyEnabled");
    }

    public final boolean V0() {
        return this.f33902v1 != null;
    }

    public final void V1(lu.b bVar) {
        if (bVar != null) {
            if (lu.b.LAP == bVar) {
                this.f33892p1 = "LAP";
                this.f33894q1 = 0;
                return;
            }
            this.f33892p1 = "TIME";
            l3.a aVar = l3.f23124b;
            int i14 = bVar.f114923a;
            aVar.getClass();
            this.f33894q1 = Integer.valueOf(l3.a.y(0, i14, 0));
        }
    }

    public final JSONObject Y1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceId", this.f33860a);
            jSONObject.put("timeFormat", this.f33862b);
            jSONObject.put("dateFormat", this.f33864c);
            jSONObject.put("allUnits", this.f33866d);
            jSONObject.put("distanceUnit", this.f33868e);
            com.garmin.android.apps.connectmobile.devices.model.o oVar = this.f33870f;
            if (oVar != null && this.f33872g != null) {
                jSONObject.put("visibleScreens", oVar.z0());
                com.garmin.android.apps.connectmobile.devices.model.o oVar2 = this.f33872g;
                oVar2.getClass();
                jSONObject.put("enabledScreens", oVar2.z0());
            }
            ArrayList arrayList = this.f33874h;
            if (arrayList != null && arrayList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = this.f33874h;
                arrayList2.getClass();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((z) it.next()).D());
                }
                jSONObject.put("screenLists", jSONArray);
            }
            List<com.garmin.android.apps.connectmobile.devices.model.i> list = this.f33876i;
            if (list == null || list.size() <= 0) {
                jSONObject.put("alarms", new JSONArray());
            } else {
                JSONArray jSONArray2 = new JSONArray();
                List<com.garmin.android.apps.connectmobile.devices.model.i> list2 = this.f33876i;
                list2.getClass();
                Iterator<com.garmin.android.apps.connectmobile.devices.model.i> it3 = list2.iterator();
                while (it3.hasNext()) {
                    jSONArray2.put(it3.next().D());
                }
                jSONObject.put("alarms", jSONArray2);
            }
            jSONObject.put("multipleAlarmEnabled", this.f33878j);
            List<String> list3 = this.f33880k;
            if (list3 != null && list3.size() > 0) {
                JSONArray jSONArray3 = new JSONArray();
                List<String> list4 = this.f33880k;
                list4.getClass();
                Iterator<String> it4 = list4.iterator();
                while (it4.hasNext()) {
                    jSONArray3.put(it4.next());
                }
                jSONObject.put("supportedAlarmModes", jSONArray3);
            }
            jSONObject.put("maxAlarm", this.f33883l);
            if (this.f33885m != null) {
                jSONObject.put("activityTracking", new JSONObject(GsonUtil.a(this.f33885m)));
            }
            jSONObject.put("keyTonesEnabled", this.f33887n);
            jSONObject.put("keyVibrationEnabled", this.f33889o);
            jSONObject.put("alertTonesEnabled", this.f33891p);
            jSONObject.put("backlightSetting", this.F);
            jSONObject.put("userNoticeTonesEnabled", this.f33893q);
            jSONObject.put("glonassEnabled", this.f33895r);
            jSONObject.put("turnPromptEnabled", this.f33898t);
            jSONObject.put("segmentPromptEnabled", this.f33901v);
            ArrayList arrayList3 = this.f33903w;
            if (arrayList3 != null && arrayList3.size() > 0) {
                JSONArray jSONArray4 = new JSONArray();
                ArrayList arrayList4 = this.f33903w;
                arrayList4.getClass();
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    jSONArray4.put(new JSONObject(GsonUtil.a((com.garmin.android.apps.connectmobile.devices.model.w) it5.next())));
                }
                jSONObject.put("supportedLanguages", jSONArray4);
            }
            List<yg1.g> list5 = this.f33905x;
            if (list5 != null && list5.size() > 0) {
                JSONArray jSONArray5 = new JSONArray();
                List<yg1.g> list6 = this.f33905x;
                list6.getClass();
                Iterator<yg1.g> it6 = list6.iterator();
                while (it6.hasNext()) {
                    jSONArray5.put(it6.next().C());
                }
                jSONObject.put("controlsMenuList", jSONArray5);
            }
            jSONObject.put("language", this.f33907y);
            List<String> list7 = this.f33909z;
            if (list7 != null && list7.size() > 0) {
                JSONArray jSONArray6 = new JSONArray();
                List<String> list8 = this.f33909z;
                list8.getClass();
                Iterator<String> it7 = list8.iterator();
                while (it7.hasNext()) {
                    jSONArray6.put(it7.next());
                }
                jSONObject.put("supportedAudioPromptDialects", jSONArray6);
            }
            jSONObject.put("defaultPage", this.A);
            jSONObject.put("nickname", this.B);
            jSONObject.put("displayOrientation", this.C);
            jSONObject.put("mountingSide", this.D);
            jSONObject.put("backlightMode", this.E);
            List<String> list9 = this.I;
            if (list9 != null && list9.size() > 0) {
                JSONArray jSONArray7 = new JSONArray();
                List<String> list10 = this.I;
                list10.getClass();
                Iterator<String> it8 = list10.iterator();
                while (it8.hasNext()) {
                    jSONArray7.put(it8.next());
                }
                jSONObject.put("supportedBacklightSettings", jSONArray7);
            }
            jSONObject.put("customWheelSize", this.P);
            jSONObject.put("gestureMode", this.T);
            jSONObject.put("startOfWeek", this.X);
            jSONObject.put("bandOrientation", this.Y);
            jSONObject.put("screenOrientation", this.Z);
            jSONObject.put("phoneVibrationEnabled", this.f33881k0);
            jSONObject.put("soundVibrationEnabled", this.H0);
            com.garmin.android.apps.connectmobile.devices.model.q qVar = this.I0;
            if (qVar != null) {
                qVar.getClass();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("autoUpdate", qVar.f34307a);
                } catch (JSONException e4) {
                    sn.a.s("Error converting to JSON: ", e4.getMessage(), i2.f36769a, a2.DEVICES, "DeviceSettingConnIQDTO");
                }
                jSONObject.put("connectIQ", jSONObject2);
            }
            jSONObject.put("vivohubEnabled", this.J0);
            jSONObject.put("opticalHeartRateEnabled", this.K0);
            jSONObject.put("screenMode", this.L0);
            List<String> list11 = this.M0;
            if (list11 != null && list11.size() > 0) {
                JSONArray jSONArray8 = new JSONArray();
                List<String> list12 = this.M0;
                list12.getClass();
                Iterator<String> it9 = list12.iterator();
                while (it9.hasNext()) {
                    jSONArray8.put(it9.next());
                }
                jSONObject.put("supportedScreenModes", jSONArray8);
            }
            jSONObject.put("watchFace", this.N0);
            List<String> list13 = this.O0;
            if (list13 != null && list13.size() > 0) {
                JSONArray jSONArray9 = new JSONArray();
                List<String> list14 = this.O0;
                list14.getClass();
                Iterator<String> it10 = list14.iterator();
                while (it10.hasNext()) {
                    jSONArray9.put(it10.next());
                }
                jSONObject.put("supportedWatchFaces", jSONArray9);
            }
            ArrayList arrayList5 = this.P0;
            if (arrayList5 != null && arrayList5.size() > 0) {
                JSONArray jSONArray10 = new JSONArray();
                ArrayList arrayList6 = this.P0;
                arrayList6.getClass();
                Iterator it11 = arrayList6.iterator();
                while (it11.hasNext()) {
                    jSONArray10.put(((c0) it11.next()).C());
                }
                jSONObject.put("watchFaceItemList", jSONArray10);
            }
            x xVar = this.Q0;
            if (xVar != null) {
                jSONObject.put("multipleSupportedWatchFace", xVar.C());
            }
            jSONObject.put("colorTheme", this.R0);
            List<String> list15 = this.S0;
            if (list15 != null && !list15.isEmpty()) {
                JSONArray jSONArray11 = new JSONArray();
                List<String> list16 = this.S0;
                list16.getClass();
                Iterator<String> it12 = list16.iterator();
                while (it12.hasNext()) {
                    jSONArray11.put(it12.next());
                }
                jSONObject.put("supportedColorThemes", jSONArray11);
            }
            com.garmin.android.apps.connectmobile.devices.model.k kVar = this.T0;
            if (kVar != null) {
                jSONObject.put("autoActivityDetect", kVar.C());
            }
            jSONObject.put("autoSyncFrequency", this.U0);
            List<String> list17 = this.V0;
            if (list17 != null && list17.size() > 0) {
                JSONArray jSONArray12 = new JSONArray();
                List<String> list18 = this.V0;
                list18.getClass();
                Iterator<String> it13 = list18.iterator();
                while (it13.hasNext()) {
                    jSONArray12.put(it13.next());
                }
                jSONObject.put("supportedAutoSyncs", jSONArray12);
            }
            jSONObject.put("phoneNotificationMode", this.W0);
            jSONObject.put("backlightTimeout", this.Z0);
            jSONObject.put("screenTimeout", this.f33861a1);
            jSONObject.put("goalAnimation", this.f33875h1);
            wi1.c cVar = this.f33863b1;
            if (cVar != null) {
                jSONObject.put("duringActivity", cVar.o0());
            }
            wi1.f fVar = this.f33865c1;
            if (fVar != null) {
                jSONObject.put("smartNotificationsStatus", fVar.f185502a);
                wi1.f fVar2 = this.f33865c1;
                fVar2.getClass();
                jSONObject.put("smartNotificationsSound", fVar2.f185503b);
                wi1.f fVar3 = this.f33865c1;
                fVar3.getClass();
                if (fVar3.f0()) {
                    wi1.f fVar4 = this.f33865c1;
                    fVar4.getClass();
                    in inVarA0 = fVar4.a0();
                    jSONObject.put("phoneNotificationPrivacyMode", inVarA0 != null ? inVarA0.name() : null);
                }
            }
            jSONObject.put("dndEnabled", this.f33867d1);
            jSONObject.put("soundInAppOnlyEnabled", this.f33869e1);
            jSONObject.put("bleConnectionAlertEnabled", this.f33871f1);
            jSONObject.put("metricsFileTrueupEnabled", this.f33873g1);
            jSONObject.put("dataRecording", this.f33877i1);
            jSONObject.put("customUserText", this.f33882k1);
            jSONObject.put("relaxRemindersEnabled", this.f33884l1);
            jSONObject.put("audioPromptLapEnabled", this.f33886m1);
            jSONObject.put("audioPromptSpeedPaceEnabled", this.f33888n1);
            jSONObject.put("audioPromptSpeedPaceType", this.f33890o1);
            jSONObject.put("audioPromptSpeedPaceFrequency", this.f33892p1);
            jSONObject.put("audioPromptSpeedPaceDuration", this.f33894q1);
            jSONObject.put("audioPromptHeartRateEnabled", this.f33896r1);
            jSONObject.put("audioPromptHeartRateType", this.f33897s1);
            jSONObject.put("audioPromptHeartRateFrequency", this.f33899t1);
            jSONObject.put("audioPromptHeartRateDuration", this.f33900u1);
            jSONObject.put("audioPromptPowerEnabled", this.f33902v1);
            jSONObject.put("audioPromptPowerType", this.f33904w1);
            jSONObject.put("audioPromptPowerFrequency", this.f33906x1);
            jSONObject.put("audioPromptPowerDuration", this.f33908y1);
            jSONObject.put("audioPromptDialectType", this.f33910z1);
            jSONObject.put("audioPromptActivityAlertsEnabled", this.A1);
            jSONObject.put("smartNotificationTimeout", this.Y0);
            jSONObject.put("weightOnlyModeEnabled", this.B1);
            jSONObject.put("latitude", this.C1);
            jSONObject.put("longitude", this.D1);
            jSONObject.put("autoActivityDetectEnabledV2", this.E1);
            return jSONObject;
        } catch (JSONException e14) {
            sn.a.s("Error converting to JSON: ", e14.getMessage(), i2.f36769a, a2.DEVICES, "DeviceSettingsDTO");
            return jSONObject;
        }
    }

    public final b Z() {
        b.a aVar = b.f33919b;
        String str = this.E;
        aVar.getClass();
        if (str != null) {
            w13.c cVar = b.f33925h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                b bVar = (b) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(bVar.f33926a, str)) {
                    return bVar;
                }
            }
        }
        return b.OFF;
    }

    public final boolean Z0() {
        return this.f33888n1 != null;
    }

    public final j a0() {
        j.a aVar = j.f33970c;
        String str = this.f33864c;
        aVar.getClass();
        if (str != null) {
            w13.c cVar = j.f33974g;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                j jVar = (j) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(jVar.f33975a, str)) {
                    return jVar;
                }
            }
        }
        return j.DATE_MONTH_DAY;
    }

    public final l c0() {
        l.a aVar = l.f33984c;
        String str = this.f33866d;
        aVar.getClass();
        if (str != null) {
            w13.c cVar = l.f33988g;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                l lVar = (l) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(lVar.f33989a, str)) {
                    return lVar;
                }
            }
        }
        return l.STATUTE;
    }

    public final boolean c1() {
        List<String> list = this.O0;
        if (list != null) {
            list.getClass();
            if (!list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final v e0() {
        Object next;
        v.a aVar = v.f34067c;
        String str = this.D;
        aVar.getClass();
        if (str != null) {
            Iterator<T> it = v.f34071g.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((v) next).f34072a, str));
            v vVar = (v) next;
            if (vVar != null) {
                return vVar;
            }
        }
        return v.LEFT;
    }

    public final boolean e1() {
        com.garmin.android.apps.connectmobile.devices.model.h hVar;
        return L0() && (hVar = this.f33885m) != null && hVar.s();
    }

    public final n f0() {
        n.a aVar = n.f33997b;
        String str = this.L0;
        aVar.getClass();
        return n.a.a(str);
    }

    public final ArrayList g0() {
        ArrayList arrayList = this.f33903w;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<com.garmin.android.apps.connectmobile.devices.model.w> arrayList3 = this.f33903w;
        arrayList3.getClass();
        for (com.garmin.android.apps.connectmobile.devices.model.w wVar : arrayList3) {
            w13.c cVar = zb0.s0.f203655g;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                zb0.s0 s0Var = (zb0.s0) bVarN.next();
                if (wVar.getId() == s0Var.f203656a.f20535a) {
                    arrayList2.add(s0Var);
                }
            }
        }
        return arrayList2;
    }

    public final p h0() {
        p.a aVar = p.f34010c;
        String str = this.f33862b;
        aVar.getClass();
        if (str != null) {
            w13.c cVar = p.f34015h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                p pVar = (p) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(pVar.f34016a, str)) {
                    return pVar;
                }
            }
        }
        return p.TWELVE_HOUR;
    }

    public final boolean h1() {
        Boolean bool = this.f33891p;
        if (bool == null) {
            return false;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    public final q i0() {
        q.a aVar = q.f34018b;
        String str = this.N0;
        aVar.getClass();
        return q.a.a(str);
    }

    public final r j0() {
        r.a aVar = r.f34041b;
        String str = this.C;
        aVar.getClass();
        if (str != null) {
            w13.c cVar = r.f34045f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                r rVar = (r) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(rVar.f34046a, str)) {
                    return rVar;
                }
            }
        }
        return r.LANDSCAPE;
    }

    public final boolean j1() {
        boolean zBooleanValue;
        if (P0()) {
            com.garmin.android.apps.connectmobile.devices.model.k kVar = this.T0;
            kVar.getClass();
            Boolean bool = kVar.f34190a;
            if (bool != null) {
                bool.getClass();
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.F1 = jSONObject.toString();
            this.f33860a = jSONObject.optLong("deviceId", -1L);
            this.f33862b = s1.u(jSONObject, "timeFormat");
            this.f33864c = s1.u(jSONObject, "dateFormat");
            this.f33866d = s1.u(jSONObject, "allUnits");
            this.f33868e = s1.u(jSONObject, "distanceUnit");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("visibleScreens");
            com.garmin.android.apps.connectmobile.devices.model.o oVar = new com.garmin.android.apps.connectmobile.devices.model.o();
            this.f33870f = oVar;
            if (jSONObjectOptJSONObject != null) {
                oVar.k(jSONObjectOptJSONObject);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("enabledScreens");
            com.garmin.android.apps.connectmobile.devices.model.o oVar2 = new com.garmin.android.apps.connectmobile.devices.model.o();
            this.f33872g = oVar2;
            if (jSONObjectOptJSONObject2 != null) {
                oVar2.k(jSONObjectOptJSONObject2);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("screenLists");
            if (jSONArrayOptJSONArray != null) {
                this.f33874h = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    z zVar = new z();
                    zVar.k(jSONArrayOptJSONArray.getJSONObject(i14));
                    ArrayList arrayList = this.f33874h;
                    if (arrayList != null) {
                        arrayList.add(zVar);
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("alarms");
            this.f33876i = new ArrayList();
            if (jSONArrayOptJSONArray2 != null) {
                int length2 = jSONArrayOptJSONArray2.length();
                for (int i15 = 0; i15 < length2; i15++) {
                    com.garmin.android.apps.connectmobile.devices.model.i iVar = new com.garmin.android.apps.connectmobile.devices.model.i();
                    iVar.k(jSONArrayOptJSONArray2.getJSONObject(i15));
                    List<com.garmin.android.apps.connectmobile.devices.model.i> list = this.f33876i;
                    if (list != null) {
                        list.add(iVar);
                    }
                }
            }
            this.f33878j = s1.o(jSONObject, "multipleAlarmEnabled");
            this.f33880k = s1.y(jSONObject, "supportedAlarmModes");
            this.f33883l = Integer.valueOf(jSONObject.optInt("maxAlarm"));
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("activityTracking");
            this.f33885m = new com.garmin.android.apps.connectmobile.devices.model.h(null, null, null, false, 0, false, 0, null, null, null, 0, null, null, 8191, null);
            if (jSONObjectOptJSONObject3 != null) {
                this.f33885m = (com.garmin.android.apps.connectmobile.devices.model.h) GsonUtil.f47253b.fromJson(jSONObjectOptJSONObject3.toString(), com.garmin.android.apps.connectmobile.devices.model.h.class);
            }
            this.f33887n = s1.o(jSONObject, "keyTonesEnabled");
            this.f33889o = s1.o(jSONObject, "keyVibrationEnabled");
            this.f33891p = s1.o(jSONObject, "alertTonesEnabled");
            this.F = s1.u(jSONObject, "backlightSetting");
            this.f33893q = s1.o(jSONObject, "userNoticeTonesEnabled");
            this.f33895r = s1.o(jSONObject, "glonassEnabled");
            this.f33898t = s1.o(jSONObject, "turnPromptEnabled");
            this.f33901v = s1.o(jSONObject, "segmentPromptEnabled");
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("supportedLanguages");
            if (jSONArrayOptJSONArray3 != null) {
                this.f33903w = new ArrayList();
                int length3 = jSONArrayOptJSONArray3.length();
                for (int i16 = 0; i16 < length3; i16++) {
                    com.garmin.android.apps.connectmobile.devices.model.w wVar = (com.garmin.android.apps.connectmobile.devices.model.w) GsonUtil.f47253b.fromJson(jSONArrayOptJSONArray3.getJSONObject(i16).toString(), com.garmin.android.apps.connectmobile.devices.model.w.class);
                    ArrayList arrayList2 = this.f33903w;
                    if (arrayList2 != null) {
                        arrayList2.add(wVar);
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("controlsMenuList");
            if (jSONArrayOptJSONArray4 != null) {
                this.f33905x = new ArrayList();
                int length4 = jSONArrayOptJSONArray4.length();
                for (int i17 = 0; i17 < length4; i17++) {
                    yg1.g gVar = new yg1.g();
                    gVar.k(jSONArrayOptJSONArray4.getJSONObject(i17));
                    List<yg1.g> list2 = this.f33905x;
                    if (list2 != null) {
                        list2.add(gVar);
                    }
                }
            }
            this.f33907y = s1.r(jSONObject, "language");
            this.f33909z = s1.y(jSONObject, "supportedAudioPromptDialects");
            this.A = s1.u(jSONObject, "defaultPage");
            this.B = s1.u(jSONObject, "nickname");
            this.C = s1.u(jSONObject, "displayOrientation");
            this.D = s1.u(jSONObject, "mountingSide");
            this.E = s1.u(jSONObject, "backlightMode");
            this.P = Long.valueOf(jSONObject.optLong("customWheelSize", 2096L));
            this.T = s1.u(jSONObject, "gestureMode");
            this.X = s1.u(jSONObject, "startOfWeek");
            this.Y = s1.u(jSONObject, "bandOrientation");
            this.Z = s1.u(jSONObject, "screenOrientation");
            this.f33881k0 = s1.o(jSONObject, "phoneVibrationEnabled");
            this.H0 = s1.o(jSONObject, "soundVibrationEnabled");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("connectIQ");
            if (jSONObjectOptJSONObject4 != null) {
                com.garmin.android.apps.connectmobile.devices.model.q qVar = new com.garmin.android.apps.connectmobile.devices.model.q();
                this.I0 = qVar;
                qVar.k(jSONObjectOptJSONObject4);
            }
            this.J0 = s1.o(jSONObject, "vivohubEnabled");
            this.K0 = s1.o(jSONObject, "opticalHeartRateEnabled");
            this.I = s1.y(jSONObject, "supportedBacklightSettings");
            this.L0 = s1.u(jSONObject, "screenMode");
            this.M0 = s1.y(jSONObject, "supportedScreenModes");
            this.N0 = s1.u(jSONObject, "watchFace");
            this.O0 = s1.y(jSONObject, "supportedWatchFaces");
            JSONArray jSONArrayZ = s1.z(jSONObject, "watchFaceItemList");
            List list3 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            if (jSONArrayZ != null) {
                this.P0 = new ArrayList();
                int length5 = jSONArrayZ.length();
                for (int i18 = 0; i18 < length5; i18++) {
                    c0 c0Var = new c0(list3, objArr4 == true ? 1 : 0, 3, objArr3 == true ? 1 : 0);
                    c0Var.k(jSONArrayZ.getJSONObject(i18));
                    ArrayList arrayList3 = this.P0;
                    if (arrayList3 != null) {
                        arrayList3.add(c0Var);
                    }
                }
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("multipleSupportedWatchFace");
            if (jSONObjectOptJSONObject5 != null) {
                x xVar = new x(objArr2 == true ? 1 : 0, 1, objArr == true ? 1 : 0);
                this.Q0 = xVar;
                xVar.k(jSONObjectOptJSONObject5);
            }
            this.R0 = s1.u(jSONObject, "colorTheme");
            this.S0 = s1.y(jSONObject, "supportedColorThemes");
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoActivityDetect");
            if (jSONObjectOptJSONObject6 != null) {
                com.garmin.android.apps.connectmobile.devices.model.k kVar = new com.garmin.android.apps.connectmobile.devices.model.k();
                this.T0 = kVar;
                kVar.k(jSONObjectOptJSONObject6);
            }
            this.U0 = s1.u(jSONObject, "autoSyncFrequency");
            this.V0 = s1.y(jSONObject, "supportedAutoSyncs");
            this.W0 = s1.u(jSONObject, "phoneNotificationMode");
            this.X0 = s1.u(jSONObject, "timeoutphonenotificationmode");
            this.Y0 = s1.u(jSONObject, "smartNotificationTimeout");
            this.f33867d1 = s1.o(jSONObject, "dndEnabled");
            this.Z0 = s1.u(jSONObject, "backlightTimeout");
            this.f33861a1 = s1.u(jSONObject, "screenTimeout");
            this.f33869e1 = s1.o(jSONObject, "soundInAppOnlyEnabled");
            this.f33871f1 = s1.o(jSONObject, "bleConnectionAlertEnabled");
            this.f33873g1 = s1.o(jSONObject, "metricsFileTrueupEnabled");
            this.f33875h1 = s1.u(jSONObject, "goalAnimation");
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("duringActivity");
            if (jSONObjectOptJSONObject7 != null) {
                wi1.c cVar = new wi1.c();
                this.f33863b1 = cVar;
                cVar.k(jSONObjectOptJSONObject7);
            }
            wi1.f fVar = new wi1.f();
            this.f33865c1 = fVar;
            fVar.k(jSONObject);
            this.f33877i1 = s1.u(jSONObject, "dataRecording");
            this.f33882k1 = s1.u(jSONObject, "customUserText");
            this.f33884l1 = s1.o(jSONObject, "relaxRemindersEnabled");
            this.f33886m1 = s1.o(jSONObject, "audioPromptLapEnabled");
            this.f33888n1 = s1.o(jSONObject, "audioPromptSpeedPaceEnabled");
            this.f33890o1 = s1.u(jSONObject, "audioPromptSpeedPaceType");
            this.f33892p1 = s1.u(jSONObject, "audioPromptSpeedPaceFrequency");
            this.f33894q1 = s1.r(jSONObject, "audioPromptSpeedPaceDuration");
            this.f33896r1 = s1.o(jSONObject, "audioPromptHeartRateEnabled");
            this.f33897s1 = s1.u(jSONObject, "audioPromptHeartRateType");
            this.f33899t1 = s1.u(jSONObject, "audioPromptHeartRateFrequency");
            this.f33900u1 = s1.r(jSONObject, "audioPromptHeartRateDuration");
            this.f33902v1 = s1.o(jSONObject, "audioPromptPowerEnabled");
            this.f33904w1 = s1.u(jSONObject, "audioPromptPowerType");
            this.f33906x1 = s1.u(jSONObject, "audioPromptPowerFrequency");
            this.f33908y1 = s1.r(jSONObject, "audioPromptPowerDuration");
            this.f33910z1 = s1.u(jSONObject, "audioPromptDialectType");
            this.A1 = s1.o(jSONObject, "audioPromptActivityAlertsEnabled");
            this.B1 = s1.o(jSONObject, "weightOnlyModeEnabled");
            this.C1 = s1.q(jSONObject, "latitude");
            this.D1 = s1.q(jSONObject, "longitude");
            this.E1 = s1.o(jSONObject, "autoActivityDetectEnabledV2");
        }
    }

    public final boolean k0() {
        if (!R0()) {
            return false;
        }
        Boolean bool = this.f33896r1;
        bool.getClass();
        return bool.booleanValue();
    }

    public final lu.b n0() {
        if (!"TIME".equalsIgnoreCase(this.f33899t1)) {
            return lu.b.LAP;
        }
        lu.b.a aVar = lu.b.f114909d;
        Integer num = this.f33900u1;
        num.getClass();
        int iIntValue = num.intValue();
        aVar.getClass();
        return lu.b.a.a(iIntValue);
    }

    public final boolean o0() {
        if (!V0()) {
            return false;
        }
        Boolean bool = this.f33902v1;
        bool.getClass();
        return bool.booleanValue();
    }

    public final lu.b p0() {
        if (!"TIME".equalsIgnoreCase(this.f33906x1)) {
            return lu.b.LAP;
        }
        lu.b.a aVar = lu.b.f114909d;
        Integer num = this.f33908y1;
        num.getClass();
        int iIntValue = num.intValue();
        aVar.getClass();
        return lu.b.a.a(iIntValue);
    }

    @o13.e
    public final boolean s1(String str) {
        if (TextUtils.isEmpty(this.F1)) {
            String simpleName = DeviceSettingsDTO.class.getSimpleName();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, simpleName, "JSON string null or empty while trying to check if device setting is null: isSettingsNull()");
            return true;
        }
        try {
            return new JSONObject(this.F1).isNull(str);
        } catch (JSONException e4) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.DEVICES;
            String string = e4.toString();
            aVar2.getClass();
            i2.a.b(a2Var2, "DeviceSettingsDTO", string);
            return true;
        }
    }

    public final boolean t1() {
        com.garmin.android.apps.connectmobile.devices.model.h hVar;
        com.garmin.android.apps.connectmobile.devices.model.h hVar2 = this.f33885m;
        return ((hVar2 != null ? hVar2.getMoveAlertEnabled() : null) == null || (hVar = this.f33885m) == null || !hVar.t()) ? false : true;
    }

    public final boolean v1() {
        Boolean bool = this.K0;
        if (bool == null) {
            return false;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    public final t w0() {
        t.a aVar = t.f34053b;
        String str = this.f33861a1;
        aVar.getClass();
        if (str != null) {
            w13.c cVar = t.f34059h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                t tVar = (t) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(tVar.f34060a, str)) {
                    return tVar;
                }
            }
        }
        return t.SHORT;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.F1);
        parcel.writeLong(this.f33860a);
        parcel.writeString(this.f33862b);
        parcel.writeString(this.f33864c);
        parcel.writeString(this.f33866d);
        parcel.writeString(this.f33868e);
        parcel.writeParcelable(this.f33870f, i14);
        parcel.writeParcelable(this.f33872g, i14);
        parcel.writeTypedList(this.f33874h);
        parcel.writeTypedList(this.f33876i);
        parcel.writeValue(this.f33878j);
        parcel.writeStringList(this.f33880k);
        Integer num = this.f33883l;
        if (num == null) {
            num = 0;
        }
        parcel.writeInt(num.intValue());
        parcel.writeParcelable(this.f33885m, i14);
        parcel.writeValue(this.f33887n);
        parcel.writeValue(this.f33889o);
        parcel.writeValue(this.f33891p);
        parcel.writeString(this.F);
        parcel.writeValue(this.f33893q);
        parcel.writeValue(this.f33895r);
        parcel.writeValue(this.f33898t);
        parcel.writeValue(this.f33901v);
        parcel.writeTypedList(this.f33903w);
        parcel.writeTypedList(this.f33905x);
        parcel.writeValue(this.f33907y);
        parcel.writeStringList(this.f33909z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        Long l14 = this.P;
        if (l14 == null) {
            l14 = 2096L;
        }
        parcel.writeLong(l14.longValue());
        parcel.writeString(this.T);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeValue(this.f33881k0);
        parcel.writeParcelable(this.I0, i14);
        parcel.writeValue(this.J0);
        parcel.writeValue(this.K0);
        parcel.writeStringList(this.I);
        parcel.writeString(this.L0);
        parcel.writeStringList(this.M0);
        parcel.writeString(this.N0);
        parcel.writeStringList(this.O0);
        parcel.writeTypedList(this.P0);
        parcel.writeParcelable(this.Q0, i14);
        parcel.writeString(this.R0);
        parcel.writeStringList(this.S0);
        parcel.writeParcelable(this.T0, i14);
        parcel.writeString(this.U0);
        parcel.writeStringList(this.V0);
        parcel.writeString(this.W0);
        parcel.writeString(this.X0);
        parcel.writeString(this.Y0);
        parcel.writeString(this.Z0);
        parcel.writeString(this.f33861a1);
        parcel.writeValue(this.H0);
        parcel.writeParcelable(this.f33863b1, i14);
        parcel.writeParcelable(this.f33865c1, i14);
        parcel.writeString(this.X);
        parcel.writeValue(this.f33867d1);
        parcel.writeValue(this.f33869e1);
        parcel.writeValue(this.f33871f1);
        parcel.writeString(this.f33875h1);
        parcel.writeString(this.f33877i1);
        parcel.writeParcelable(this.f33879j1, i14);
        parcel.writeString(this.f33882k1);
        parcel.writeValue(this.f33884l1);
        parcel.writeValue(this.f33873g1);
        parcel.writeValue(this.f33886m1);
        parcel.writeValue(this.A1);
        parcel.writeValue(this.f33888n1);
        parcel.writeString(this.f33890o1);
        parcel.writeString(this.f33892p1);
        if (this.f33894q1 != null) {
            parcel.writeInt(1);
            Integer num2 = this.f33894q1;
            num2.getClass();
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeValue(this.f33896r1);
        parcel.writeString(this.f33897s1);
        parcel.writeString(this.f33899t1);
        if (this.f33900u1 != null) {
            parcel.writeInt(1);
            Integer num3 = this.f33900u1;
            num3.getClass();
            parcel.writeInt(num3.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeValue(this.f33902v1);
        parcel.writeString(this.f33904w1);
        parcel.writeString(this.f33906x1);
        if (this.f33908y1 != null) {
            parcel.writeInt(1);
            Integer num4 = this.f33908y1;
            num4.getClass();
            parcel.writeInt(num4.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f33910z1);
        parcel.writeValue(this.B1);
        parcel.writeValue(this.C1);
        parcel.writeValue(this.D1);
        parcel.writeValue(this.E1);
    }

    public final boolean x0() {
        if (!Z0()) {
            return false;
        }
        Boolean bool = this.f33888n1;
        bool.getClass();
        return bool.booleanValue();
    }

    public final boolean x1() {
        Boolean bool = this.f33869e1;
        if (bool == null) {
            return false;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    public final void y1(Boolean bool) {
        this.f33891p = bool;
        S1("alertTonesEnabled");
    }

    public final lu.b z0() {
        if (!"TIME".equalsIgnoreCase(this.f33892p1)) {
            return lu.b.LAP;
        }
        lu.b.a aVar = lu.b.f114909d;
        Integer num = this.f33894q1;
        num.getClass();
        int iIntValue = num.intValue();
        aVar.getClass();
        return lu.b.a.a(iIntValue);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$a[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$a[]) from 0x0035: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$a;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        ALWAYS("ON", R.string.device_autodisplay_always),
        DURING_ACTIVITY("DURING_ACTIVITIES", R.string.device_autodisplay_during_activity),
        NEVER("OFF", R.string.device_autodisplay_never);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0575a f33911c = new C0575a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ w13.c f33916h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f33918b;

        static {
            f33916h = new w13.c(new a[]{r0, r1, r2});
        }

        private a(String str, int i14) {
            super(str, i);
            this.f33917a = str;
            this.f33918b = i14;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f33915g.clone();
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$a$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0575a {
            public /* synthetic */ C0575a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C0575a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$b[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$b[]) from 0x0030: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$b;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        AUTO_BRIGHTNESS("AUTO_BRIGHTNESS"),
        OFF("OFF"),
        STAYS_ON("STAYS_ON"),
        AUTO("AUTO");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f33919b = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ w13.c f33925h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33926a;

        static {
            f33925h = new w13.c(new b[]{r0, r1, r2, r3});
        }

        private b(String str) {
            super(str, i);
            this.f33926a = str;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f33924g.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$b$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$c[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$c[]) from 0x00a4: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$c;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        AUTO_BRIGHTNESS_TIMEOUT("AUTO", R.string.device_settings_backlight_auto),
        /* JADX INFO: Fake field, exist only in values array */
        STAYS_ON("STAYS_ON", R.string.device_settings_backlight_stays_on),
        SECONDS_5("SECONDS_5", R.string.device_settings_backlight_timeout_seconds_5),
        SECONDS_10("SECONDS_10", R.string.device_settings_backlight_timeout_seconds_10),
        SECONDS_15("SECONDS_15", R.string.device_settings_backlight_timeout_seconds_15),
        /* JADX INFO: Fake field, exist only in values array */
        SECONDS_20("SECONDS_20", R.string.device_settings_backlight_timeout_seconds_20),
        SECONDS_30("SECONDS_30", R.string.device_settings_backlight_timeout_seconds_30),
        SHORT("SHORT", R.string.screen_timeout_short),
        MEDIUM("MEDIUM", R.string.screen_timeout_medium),
        LONG("LONG", R.string.screen_timeout_long),
        VERY_LONG("VERY_LONG", R.string.timeout_verylong),
        /* JADX INFO: Fake field, exist only in values array */
        STAY_ON("STAY_ON", R.string.device_autodisplay_always_on);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f33927c = new a(null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ w13.c f33938n;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f33940b;

        static {
            f33938n = new w13.c(new c[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, new c("STAY_ON", R.string.device_autodisplay_always_on)});
        }

        private c(String str, int i14) {
            super(str, i);
            this.f33939a = str;
            this.f33940b = i14;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f33937m.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$c$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$d[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$d[]) from 0x001c: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$d;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        A("A"),
        B("B");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f33941b = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ w13.c f33945f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33946a;

        static {
            f33945f = new w13.c(new d[]{r0, r1});
        }

        private d(String str) {
            super(str, i);
            this.f33946a = str;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f33944e.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$d$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$g[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$g[]) from 0x0042: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$g[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$g;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g {
        ON("ON"),
        DURING_ACTIVITY("DURING_ACTIVITY"),
        OFF("OFF"),
        AUTO_INTERACTION_ONLY("AUTO_INTERACTION_ONLY"),
        AUTO_INTERACTION_GESTURE("AUTO_INTERACTION_GESTURE"),
        /* JADX INFO: Fake field, exist only in values array */
        ALWAYS_ON("ALWAYS_ON");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f33947b = new a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ w13.c f33954i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33955a;

        static {
            f33954i = new w13.c(new g[]{r0, r1, r2, r3, r4, new g("ALWAYS_ON")});
        }

        private g(String str) {
            super(str, i);
            this.f33955a = str;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f33953h.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$g$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static g a(String str) {
                if (str != null) {
                    w13.c cVar = g.f33954i;
                    p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                    while (bVarN.hasNext()) {
                        g gVar = (g) bVarN.next();
                        if (p005kotlin.jvm.internal.s.g(gVar.f33955a, str)) {
                            return gVar;
                        }
                    }
                }
                return g.ON;
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$h[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$h[]) from 0x0026: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$h[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$h;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h {
        ONCE_A_DAY("ONCE_A_DAY"),
        OCCASIONALLY("OCCASIONALLY"),
        FREQUENT("FREQUENT");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f33956b = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f33961g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33962a;

        static {
            f33961g = new w13.c(new h[]{r0, r1, r2});
        }

        private h(String str) {
            super(str, i);
            this.f33962a = str;
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f33960f.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$h$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$i[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$i[]) from 0x0022: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$i[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$i;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i {
        SMART("SMART", R.string.device_settings_data_recording_mode_smart),
        EVERY_SECOND("EVERY_SECOND", R.string.device_settings_data_recording_mode_every_one_second);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f33963c = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f33967g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f33969b;

        static {
            f33967g = new w13.c(new i[]{r0, r1});
        }

        private i(String str, int i14) {
            super(str, i);
            this.f33968a = str;
            this.f33969b = i14;
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) f33966f.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$i$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$j[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$j[]) from 0x0026: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$j[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$j;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j {
        DATE_MONTH_DAY("date_month_day", R.string.setting_month_day_date_format),
        DATE_DAY_MONTH("date_day_month", R.string.setting_day_month_date_format);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f33970c = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f33974g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f33976b;

        static {
            f33974g = new w13.c(new j[]{r0, r1});
        }

        private j(String str, int i14) {
            super(str, i);
            this.f33975a = str;
            this.f33976b = i14;
        }

        public static final CharSequence[] a(Context context) {
            f33970c.getClass();
            context.getClass();
            w13.c cVar = f33974g;
            CharSequence[] charSequenceArr = new CharSequence[cVar.getF168272d()];
            int length = cVar.toArray(new j[0]).length;
            for (int i14 = 0; i14 < length; i14++) {
                charSequenceArr[i14] = context.getString(((j) cVar.get(i14)).f33976b);
            }
            return charSequenceArr;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f33973f.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$j$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$k[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$k[]) from 0x002f: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$k[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$k;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class k {
        ON("ON", R.string.lbl_on),
        NOT_IN_ACTIVITY("NOT_IN_ACTIVITY", R.string.goal_animation_not_in_activity),
        OFF("OFF", R.string.lbl_off);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f33977b = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f33982g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33983a;

        static {
            f33982g = new w13.c(new k[]{r0, r1, r2});
        }

        private k(String str, int i14) {
            super(str, i);
            this.f33983a = str;
        }

        public static k valueOf(String str) {
            return (k) Enum.valueOf(k.class, str);
        }

        public static k[] values() {
            return (k[]) f33981f.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$k$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$l[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$l[]) from 0x0026: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$l[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$l;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class l {
        STATUTE("statute_us", R.string.settings_units_statute),
        METRIC("metric", R.string.settings_units_metric);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f33984c = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f33988g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f33990b;

        static {
            f33988g = new w13.c(new l[]{r0, r1});
        }

        private l(String str, int i14) {
            super(str, i);
            this.f33989a = str;
            this.f33990b = i14;
        }

        public static final CharSequence[] a(Context context) {
            f33984c.getClass();
            context.getClass();
            w13.c cVar = f33988g;
            CharSequence[] charSequenceArr = new CharSequence[cVar.getF168272d()];
            int length = cVar.toArray(new l[0]).length;
            for (int i14 = 0; i14 < length; i14++) {
                charSequenceArr[i14] = context.getString(((l) cVar.get(i14)).f33990b);
            }
            return charSequenceArr;
        }

        public static l valueOf(String str) {
            return (l) Enum.valueOf(l.class, str);
        }

        public static l[] values() {
            return (l[]) f33987f.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$l$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$m[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$m[]) from 0x0026: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$m[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$m;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class m {
        SHOW_ALL("SHOW_ALL"),
        /* JADX INFO: Fake field, exist only in values array */
        SHOW_CALLS("SHOW_CALLS_ONLY"),
        SHOW_NONE("SHOW_NONE");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f33991b = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ w13.c f33995f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33996a;

        static {
            f33995f = new w13.c(new m[]{r0, r1, r2});
        }

        private m(String str) {
            super(str, i);
            this.f33996a = str;
        }

        public static m valueOf(String str) {
            return (m) Enum.valueOf(m.class, str);
        }

        public static m[] values() {
            return (m[]) f33994e.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$m$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$n[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$n[]) from 0x001c: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$n[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$n;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class n {
        SINGLE_SCREEN("SINGLE_SCREEN"),
        SPLIT_SCREEN_HORIZONTAL("SPLIT_SCREEN_HORIZONTAL");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f33997b = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34001f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34002a;

        static {
            f34001f = new w13.c(new n[]{r0, r1});
        }

        private n(String str) {
            super(str, i);
            this.f34002a = str;
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f34000e.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$n$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static n a(String str) {
                if (str != null) {
                    w13.c cVar = n.f34001f;
                    p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                    while (bVarN.hasNext()) {
                        n nVar = (n) bVarN.next();
                        if (p005kotlin.jvm.internal.s.g(nVar.f34002a, str)) {
                            return nVar;
                        }
                    }
                }
                return n.SINGLE_SCREEN;
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$o[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$o[]) from 0x0026: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$o[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$o;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class o {
        SHOW_ALL("SHOW_ALL"),
        SHOW_CALLS_ONLY("SHOW_CALLS_ONLY"),
        OFF("OFF");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f34003b = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34008g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34009a;

        static {
            f34008g = new w13.c(new o[]{r0, r1, r2});
        }

        private o(String str) {
            super(str, i);
            this.f34009a = str;
        }

        public static final o a(String str) {
            f34003b.getClass();
            if (str != null) {
                w13.c cVar = f34008g;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    o oVar = (o) bVarN.next();
                    if (p005kotlin.jvm.internal.s.g(oVar.f34009a, str)) {
                        return oVar;
                    }
                }
            }
            return SHOW_ALL;
        }

        public static o valueOf(String str) {
            return (o) Enum.valueOf(o.class, str);
        }

        public static o[] values() {
            return (o[]) f34007f.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$o$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$p[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$p[]) from 0x0035: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$p[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$p;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class p {
        TWELVE_HOUR("time_twelve_hr", R.string.setting_12_hour_time_format),
        TWENTY_FOUR_HOUR("time_twenty_four_hr", R.string.setting_24_hour_time_format),
        MILITARY("military_twenty_four_hr", R.string.setting_military_time_format);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f34010c = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34015h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34017b;

        static {
            f34015h = new w13.c(new p[]{r0, r1, r2});
        }

        private p(String str, int i14) {
            super(str, i);
            this.f34016a = str;
            this.f34017b = i14;
        }

        public static final CharSequence[] a(Context context) {
            f34010c.getClass();
            context.getClass();
            w13.c cVar = f34015h;
            int f91800d = cVar.getF168272d() - 1;
            CharSequence[] charSequenceArr = new CharSequence[f91800d];
            for (int i14 = 0; i14 < f91800d; i14++) {
                charSequenceArr[i14] = context.getString(((p) cVar.get(i14)).f34017b);
            }
            return charSequenceArr;
        }

        public static p valueOf(String str) {
            return (p) Enum.valueOf(p.class, str);
        }

        public static p[] values() {
            return (p[]) f34014g.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$p$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v26 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$q[], still in use, count: 1, list:
      (r0v26 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$q[]) from 0x0156: CONSTRUCTOR (r0v26 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$q[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$q;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class q {
        ANALOG_MINIMAL("ANALOG_MINIMAL"),
        ANALOG_TRADITIONAL("ANALOG_TRADITIONAL"),
        DIGITAL_TRADITIONAL("DIGITAL_TRADITIONAL"),
        DIGITAL_BOLD("DIGITAL_BOLD"),
        DIGITAL_MODERN("DIGITAL_MODERN"),
        DIGITAL_TRADITIONAL_SPLIT("DIGITAL_TRADITIONAL_SPLIT"),
        ANALOG_GENERIC_1("ANALOG_GENERIC_1"),
        ANALOG_GENERIC_2("ANALOG_GENERIC_2"),
        ANALOG_GENERIC_3("ANALOG_GENERIC_3"),
        ANALOG_GENERIC_4("ANALOG_GENERIC_4"),
        ANALOG_GENERIC_5("ANALOG_GENERIC_5"),
        ANALOG_GENERIC_6("ANALOG_GENERIC_6"),
        ANALOG_GENERIC_7("ANALOG_GENERIC_7"),
        ANALOG_GENERIC_8("ANALOG_GENERIC_8"),
        ANALOG_GENERIC_9("ANALOG_GENERIC_9"),
        ANALOG_GENERIC_10("ANALOG_GENERIC_10"),
        ANALOG_GENERIC_11("ANALOG_GENERIC_11"),
        ANALOG_GENERIC_12("ANALOG_GENERIC_12"),
        GENERIC_1("generic_1"),
        /* JADX INFO: Fake field, exist only in values array */
        GENERIC_2("generic_2"),
        /* JADX INFO: Fake field, exist only in values array */
        GENERIC_3("generic_3"),
        /* JADX INFO: Fake field, exist only in values array */
        GENERIC_4("generic_4"),
        /* JADX INFO: Fake field, exist only in values array */
        GENERIC_5("generic_5"),
        /* JADX INFO: Fake field, exist only in values array */
        GENERIC_6("generic_6"),
        /* JADX INFO: Fake field, exist only in values array */
        GENERIC_7("generic_7"),
        /* JADX INFO: Fake field, exist only in values array */
        GENERIC_8("generic_8");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f34018b = new a(null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34039y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34040a;

        static {
            f34039y = new w13.c(new q[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1, new q("generic_2"), new q("generic_3"), new q("generic_4"), new q("generic_5"), new q("generic_6"), new q("generic_7"), new q("generic_8")});
        }

        private q(String str) {
            super(str, i);
            this.f34040a = str;
        }

        public static q valueOf(String str) {
            return (q) Enum.valueOf(q.class, str);
        }

        public static q[] values() {
            return (q[]) f34038x.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$q$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static q a(String str) {
                if (str != null) {
                    w13.c cVar = q.f34039y;
                    p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                    while (bVarN.hasNext()) {
                        q qVar = (q) bVarN.next();
                        if (p005kotlin.jvm.internal.s.g(qVar.f34040a, str)) {
                            return qVar;
                        }
                    }
                }
                return q.DIGITAL_TRADITIONAL;
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$r[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$r[]) from 0x0032: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$r[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$r;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class r {
        LANDSCAPE("LANDSCAPE", R.string.device_wrist_right),
        LANDSCAPE_FLIPPED("LANDSCAPE_FLIPPED", R.string.device_wrist_left),
        /* JADX INFO: Fake field, exist only in values array */
        PORTRAIT("PORTRAIT", R.string.device_wrist_right),
        /* JADX INFO: Fake field, exist only in values array */
        PORTRAIT_FLIPPED("PORTRAIT_FLIPPED", R.string.device_wrist_left);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f34041b = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34045f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34046a;

        static {
            f34045f = new w13.c(new r[]{r0, r1, new r("PORTRAIT", R.string.device_wrist_right), new r("PORTRAIT_FLIPPED", R.string.device_wrist_left)});
        }

        private r(String str, int i14) {
            super(str, i);
            this.f34046a = str;
        }

        public static r valueOf(String str) {
            return (r) Enum.valueOf(r.class, str);
        }

        public static r[] values() {
            return (r[]) f34044e.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$r$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$s[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$s[]) from 0x001c: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$s[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$s;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class s {
        LANDSCAPE("LANDSCAPE"),
        PORTRAIT("PORTRAIT");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f34047b = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34051f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34052a;

        static {
            f34051f = new w13.c(new s[]{r0, r1});
        }

        private s(String str) {
            super(str, i);
            this.f34052a = str;
        }

        public static s valueOf(String str) {
            return (s) Enum.valueOf(s.class, str);
        }

        public static s[] values() {
            return (s[]) f34050e.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$s$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static s a(String str) {
                if (str != null) {
                    w13.c cVar = s.f34051f;
                    p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                    while (bVarN.hasNext()) {
                        s sVar = (s) bVarN.next();
                        if (p005kotlin.jvm.internal.s.g(sVar.f34052a, str)) {
                            return sVar;
                        }
                    }
                }
                return s.LANDSCAPE;
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$t[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$t[]) from 0x0047: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$t[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$t;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class t {
        SHORT("SHORT", R.string.screen_timeout_short),
        MEDIUM("MEDIUM", R.string.screen_timeout_medium),
        LONG("LONG", R.string.screen_timeout_long),
        VERY_LONG("VERY_LONG", R.string.timeout_verylong),
        /* JADX INFO: Fake field, exist only in values array */
        INVALID("INVALID", R.string.lbl_invalid_name);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f34053b = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34059h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34060a;

        static {
            f34059h = new w13.c(new t[]{r0, r1, r2, r3, new t("INVALID", R.string.lbl_invalid_name)});
        }

        private t(String str, int i14) {
            super(str, i);
            this.f34060a = str;
        }

        public static t valueOf(String str) {
            return (t) Enum.valueOf(t.class, str);
        }

        public static t[] values() {
            return (t[]) f34058g.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$t$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$u[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$u[]) from 0x002b: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$u[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$u;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class u {
        /* JADX INFO: Fake field, exist only in values array */
        SATURDAY("SATURDAY", R.string.lbl_day_of_week_saturday),
        /* JADX INFO: Fake field, exist only in values array */
        SUNDAY("SUNDAY", R.string.lbl_day_of_week_sunday),
        MONDAY("MONDAY", R.string.lbl_day_of_week_monday);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f34061c = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34064f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34066b;

        static {
            f34064f = new w13.c(new u[]{r0, r1, r2});
        }

        private u(String str, int i14) {
            super(str, i);
            this.f34065a = str;
            this.f34066b = i14;
        }

        public static u valueOf(String str) {
            return (u) Enum.valueOf(u.class, str);
        }

        public static u[] values() {
            return (u[]) f34063e.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$u$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$v[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$v[]) from 0x0045: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO$v[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$v;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class v {
        LEFT("LEFT", R.string.device_wrist_left),
        RIGHT("RIGHT", R.string.device_wrist_right),
        /* JADX INFO: Fake field, exist only in values array */
        LEFT_WRIST("LEFT_WRIST", R.string.device_wrist_left),
        /* JADX INFO: Fake field, exist only in values array */
        RIGHT_WRIST("RIGHT_WRIST", R.string.device_wrist_right),
        /* JADX INFO: Fake field, exist only in values array */
        LEFT_UPPER_ARM("LEFT_UPPER_ARM", R.string.device_wrist_left),
        /* JADX INFO: Fake field, exist only in values array */
        RIGHT_UPPER_ARM("RIGHT_UPPER_ARM", R.string.device_wrist_right);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f34067c = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f34071g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34073b;

        static {
            f34071g = new w13.c(new v[]{r0, r1, new v("LEFT_WRIST", R.string.device_wrist_left), new v("RIGHT_WRIST", R.string.device_wrist_right), new v("LEFT_UPPER_ARM", R.string.device_wrist_left), new v("RIGHT_UPPER_ARM", R.string.device_wrist_right)});
        }

        private v(String str, int i14) {
            super(str, i);
            this.f34072a = str;
            this.f34073b = i14;
        }

        public static final CharSequence[] a(Context context) {
            f34067c.getClass();
            context.getClass();
            v[] vVarArr = {LEFT, RIGHT};
            ArrayList arrayList = new ArrayList(2);
            for (int i14 = 0; i14 < 2; i14++) {
                arrayList.add(context.getString(vVarArr[i14].f34073b));
            }
            return (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        }

        public static v valueOf(String str) {
            return (v) Enum.valueOf(v.class, str);
        }

        public static v[] values() {
            return (v[]) f34070f.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$v$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b_\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0006R\u0014\u00106\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0006R\u0014\u00107\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0006R\u0014\u00108\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0006R\u0014\u00109\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u0006R\u0014\u0010:\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u0006R\u0014\u0010;\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0006R\u0014\u0010<\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0006R\u0014\u0010=\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u0006R\u0014\u0010>\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0006R\u0014\u0010?\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\u0006R\u0014\u0010@\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u0006R\u0014\u0010A\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\u0006R\u0014\u0010B\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010\u0006R\u0014\u0010C\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010\u0006R\u0014\u0010D\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010\u0006R\u0014\u0010E\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010\u0006R\u0014\u0010F\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010\u0006R\u0014\u0010G\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010\u0006R\u0014\u0010H\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010\u0006R\u0014\u0010I\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010\u0006R\u0014\u0010J\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010\u0006R\u0014\u0010K\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010\u0006R\u0014\u0010L\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010\u0006R\u0014\u0010M\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010\u0006R\u0014\u0010N\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010\u0006R\u0014\u0010O\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010\u0006R\u0014\u0010P\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010\u0006R\u0014\u0010Q\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010\u0006R\u0014\u0010R\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bR\u0010\u0006R\u0014\u0010S\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010\u0006R\u0014\u0010T\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bT\u0010\u0006R\u0014\u0010U\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010\u0006R\u0014\u0010V\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bV\u0010\u0006R\u0014\u0010W\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010\u0006R\u0014\u0010X\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bX\u0010\u0006R\u0014\u0010Y\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bY\u0010\u0006R\u0014\u0010Z\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bZ\u0010\u0006R\u0014\u0010[\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b[\u0010\u0006R\u0014\u0010\\\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\\\u0010\u0006R\u0014\u0010]\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b]\u0010\u0006R\u0014\u0010^\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b^\u0010\u0006R\u0014\u0010_\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b_\u0010\u0006R\u0014\u0010`\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b`\u0010\u0006R\u0014\u0010a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\ba\u0010\u0006R\u0014\u0010b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bb\u0010\u0006R\u0014\u0010c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bc\u0010\u0006R\u0014\u0010d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bd\u0010\u0006R\u0014\u0010e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\be\u0010\u0006R\u0014\u0010f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bf\u0010\u0006R\u0014\u0010g\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bg\u0010\u0006R\u0014\u0010i\u001a\u00020h8\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bk\u0010\u0006R\u0014\u0010l\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bl\u0010\u0006R\u0014\u0010m\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bm\u0010\u0006¨\u0006n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO$f;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "DEVICE_ID", "TIME_FORMAT", "DATE_FORMAT", "MEASUREMENT_UNITS", "DISTANCE_UNIT", "VISIBLE_SCREENS", "ENABLE_SCREENS", "SCREEN_LISTS", "ALARMS", "MULTIPLE_ALARM_ENABLED", "SUPPORTED_ALARM_MODES", "MAX_NUMBER_OF_ALARMS", "ACTIVITY_TRACKING", "KEY_TONES_ENABLED", "KEY_VIBRATION_ENABLED", "ALERT_TONES_ENABLED", "BACKLIGHT_SETTINGS", "USER_NOTICE_TONES_ENABLED", "GLONASS_ENABLED", "TURN_PROMPT_ENABLED", "SEGMENT_PROMPT_ENABLED", "SUPPORTED_LANGUAGES", "CONTROLS_MENU_LIST", "LANGUAGE", "SUPPORTED_AUDIO_PROMPT_DIALECTS", "DEFAULT_PAGE", "NICK_NAME", "DISPLAY_ORIENTATION", "MOUNTING_SIDE", "BACKLIGHT_MODE", "BACKLIGHT_TIMEOUT", "SCREEN_TIMEOUT", "BACKLIGHT_SETTING", "SUPPORTED_BACKLIGHT_SETTINGS", "CUSTOM_WHEEL_SIZE", "GESTURE_MODE", "START_OF_WEEK", "BAND_ORIENTATION", "SCREEN_ORIENTATION", "DURING_ACTIVITY", "PHONE_VIBRATION_ENABLED", "SOUND_VIBRATION_ENABLED", "CONNECT_IQ", "VIVOHUB_ENABLED", "OPTICAL_HEART_RATE_ENABLED", "SCREEN_MODE", "SUPPORTED_SCREEN_MODES", "WATCH_FACE", "SUPPORTED_WATCH_FACES", "WATCH_FACE_ITEM_LIST", "MULTIPLE_SUPPORTED_WATCH_FACE", "COLOR_THEME", "SUPPORTED_COLOR_THEMES", "AUTO_ACTIVITY_DETECT", "AUTO_SYNC_FREQUENCY", "SUPPORTED_AUTO_SYNC_FREQUENCIES", "DO_NOT_DISTURB_MODE", "SOUND_IN_APP_ONLY_ENABLED", "BLE_CONNECT_ALERT_ENABLED", "METRIC_FILE_TRUE_UP_ENABLED", "GOAL_ANIMATION", "DATA_RECORDING", "CUSTOM_USER_TEXT", "RELAX_REMINDER_ENABLED", "WEIGHT_ONLY_MODE_KEY", "PHONE_NOTIFICATION_MODE", "TIMEOUT_PHONE_NOTIFICATION_MODE", "SMART_NOTIFICATION_TIMEOUT", "LAP_AUDIO_PROMPT_ALERT_ENABLED_KEY", "SPEED_PACE_AUDIO_PROMPT_ALERT_ENABLED_KEY", "SPEED_PACE_TYPE_AUDIO_PROMPT_ALERT_KEY", "SPEED_PACE_AUDIO_PROMPT_ALERT_FREQUENCY_KEY", "SPEED_PACE_AUDIO_PROMPT_ALERT_DURATION_KEY", "HEART_RATE_AUDIO_PROMPT_ALERT_ENABLED_KEY", "HEART_RATE_TYPE_AUDIO_PROMPT_ALERT_KEY", "HEART_RATE_AUDIO_PROMPT_ALERT_FREQUENCY_KEY", "HEART_RATE_AUDIO_PROMPT_ALERT_DURATION_KEY", "POWER_AUDIO_PROMPT_ALERT_ENABLED_KEY", "POWER_TYPE_AUDIO_PROMPT_ALERT_KEY", "POWER_AUDIO_PROMPT_ALERT_FREQUENCY_KEY", "POWER_AUDIO_PROMPT_ALERT_DURATION_KEY", "DIALECT_KEY", "AUDIO_PROMPT_ACTIVITY_ALERT", "HEART_RATE_ALERT_KEY", "HEART_RATE_ZONE_ALERT_KEY", "PERCENTAGE_MAX_HEART_RATE_ALERT_KEY", "PERCENTAGE_HEART_RATE_RESERVE_ALERT_KEY", "AVERAGE_ALERT_KEY", "CURRENT_ALERT_KEY", "LAP_ALERT_KEY", "NORMALIZED_POWER_ALERT_KEY", "LAP_FREQUENCY_KEY", "TIME_FREQUENCY_KEY", "", "DEFAULT_WHEEL_SIZE", "J", "LATITUDE_KEY", "LONGITUDE_KEY", "AUTO_ACTIVITY_DETECT_ENABLED_V2", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f {
        public /* synthetic */ f(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private f() {
        }
    }

    public DeviceSettingsDTO(JSONObject jSONObject) {
        jSONObject.getClass();
        this.G1 = new HashSet();
        try {
            k(jSONObject);
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.DEVICES;
            aVar.getClass();
            i2.a.g(a2Var, "DeviceSettingsDTO", e4);
        }
    }

    public DeviceSettingsDTO() {
        this.G1 = new HashSet();
    }
}
