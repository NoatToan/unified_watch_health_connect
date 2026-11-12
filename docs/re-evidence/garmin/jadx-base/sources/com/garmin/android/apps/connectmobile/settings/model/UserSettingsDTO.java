package com.garmin.android.apps.connectmobile.settings.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.reflect.TypeToken;
import com.nimbusds.jose.jwk.JWKParameterNames;
import gg1.h0;
import gg1.o0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import wi1.j;
import wi1.k;
import wi1.l;
import ww0.i;
import ww0.u;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(UserSettingsDeserializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\b\t\n\u000b\fB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "c", "d", JWKParameterNames.RSA_EXPONENT, "UserSettingsDeserializer", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UserSettingsDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<UserSettingsDTO> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f43523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f43524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f43525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<l> f43526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f43527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f43528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f43530h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO$UserSettingsDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UserSettingsDeserializer implements JsonDeserializer<UserSettingsDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final UserSettingsDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                UserSettingsDTO userSettingsDTO = new UserSettingsDTO();
                userSettingsDTO.k(new JSONObject(jsonElement.toString()));
                return userSettingsDTO;
            } catch (Exception e4) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.g(a2Var, "UserSettingsDTO", e4);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserSettingsDTO> {
        @Override // android.os.Parcelable.Creator
        public final UserSettingsDTO createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new UserSettingsDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UserSettingsDTO[] newArray(int i14) {
            return new UserSettingsDTO[i14];
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO$f", "Lcom/google/gson/reflect/TypeToken;", "", "Lwi1/l;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends TypeToken<List<? extends l>> {
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public UserSettingsDTO(Parcel parcel) throws IllegalAccessException {
        parcel.getClass();
        this.f43523a = parcel.readString();
        this.f43524b = (j) parcel.readParcelable(j.class.getClassLoader());
        this.f43525c = (k) parcel.readParcelable(k.class.getClassLoader());
        this.f43527e = (u) parcel.readParcelable(u.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        Object obj = l.class.getDeclaredField("CREATOR").get(null);
        Parcelable.Creator creator = obj instanceof Parcelable.Creator ? (Parcelable.Creator) obj : null;
        if (creator == null) {
            n23.j.A(s0.f105811a.b(l.class).D(), "Could not access CREATOR field in class ");
            throw null;
        }
        parcel.readTypedList(arrayList, creator);
        this.f43526d = arrayList;
        this.f43528f = parcel.readString();
        this.f43529g = parcel.readInt() == 1;
        this.f43530h = parcel.readDouble();
    }

    public final void A0(boolean z14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.I(Boolean.valueOf(z14));
    }

    public final UserSettingsDTO C() {
        o0 o0VarB;
        e eVarA;
        h0 h0VarA;
        String str;
        UserSettingsDTO userSettingsDTO = new UserSettingsDTO();
        userSettingsDTO.f43523a = this.f43523a;
        userSettingsDTO.P0(G());
        userSettingsDTO.S0(I());
        userSettingsDTO.s1(E2());
        userSettingsDTO.L0(F());
        j jVar = this.f43524b;
        if (jVar != null) {
            o0.a aVar = o0.f77285d;
            String str2 = jVar.f185544g;
            aVar.getClass();
            o0VarB = o0.a.b(str2);
        } else {
            o0VarB = o0.STATUTE_US;
        }
        userSettingsDTO.V0(o0VarB);
        j jVar2 = this.f43524b;
        if (jVar2 != null) {
            e.a aVar2 = e.f43546b;
            String str3 = jVar2.f185542e;
            aVar2.getClass();
            eVarA = e.a.a(str3);
        } else {
            eVarA = e.TWELVE_HOUR;
        }
        userSettingsDTO.c1(eVarA);
        j jVar3 = this.f43524b;
        userSettingsDTO.J0(jVar3 != null ? jVar3.f185545h : 0);
        userSettingsDTO.R0(H());
        j jVar4 = this.f43524b;
        userSettingsDTO.e1(jVar4 != null ? jVar4.f185550m : -1);
        j jVar5 = this.f43524b;
        userSettingsDTO.h1(jVar5 != null ? jVar5.f185549l : -1);
        j jVar6 = this.f43524b;
        userSettingsDTO.M0(jVar6 != null ? jVar6.f185551n : -1L);
        j jVar7 = this.f43524b;
        String str4 = jVar7 != null ? jVar7.f185557v : null;
        if (userSettingsDTO.f43524b == null) {
            userSettingsDTO.f43524b = new j();
        }
        j jVar8 = userSettingsDTO.f43524b;
        jVar8.getClass();
        jVar8.f185557v = str4;
        k kVar = this.f43525c;
        boolean z14 = kVar == null || kVar.f185577c;
        if (userSettingsDTO.f43525c == null) {
            userSettingsDTO.f43525c = new k();
        }
        k kVar2 = userSettingsDTO.f43525c;
        kVar2.getClass();
        kVar2.f185577c = z14;
        k kVar3 = this.f43525c;
        boolean z15 = kVar3 == null || kVar3.f185578d;
        if (userSettingsDTO.f43525c == null) {
            userSettingsDTO.f43525c = new k();
        }
        k kVar4 = userSettingsDTO.f43525c;
        kVar4.getClass();
        kVar4.f185578d = z15;
        userSettingsDTO.Z0(M());
        userSettingsDTO.j1(Z());
        j jVar9 = this.f43524b;
        String str5 = jVar9 != null ? jVar9.f185556t : null;
        if (userSettingsDTO.f43524b == null) {
            userSettingsDTO.f43524b = new j();
        }
        j jVar10 = userSettingsDTO.f43524b;
        jVar10.getClass();
        jVar10.f185556t = str5;
        u uVar = this.f43527e;
        if (uVar != null) {
            userSettingsDTO.f43527e = uVar.f();
        }
        List<l> list = this.f43526d;
        if (list != null) {
            userSettingsDTO.f43526d = (List) list.stream().map(new a73.k(new w40.d(29), 11)).collect(Collectors.toList());
        }
        j jVar11 = this.f43524b;
        if (jVar11 == null || (str = jVar11.f185539b) == null) {
            h0VarA = null;
        } else {
            h0.f77238d.getClass();
            h0VarA = h0.a.a(str);
        }
        userSettingsDTO.Q0(h0VarA);
        userSettingsDTO.f43528f = this.f43528f;
        userSettingsDTO.f43529g = this.f43529g;
        userSettingsDTO.f43530h = this.f43530h;
        j jVar12 = this.f43524b;
        g42.d dVar = jVar12 != null ? jVar12.f185558w : null;
        if (userSettingsDTO.f43524b == null) {
            userSettingsDTO.f43524b = new j();
        }
        j jVar13 = userSettingsDTO.f43524b;
        jVar13.getClass();
        jVar13.f185558w = dVar;
        return userSettingsDTO;
    }

    public final void C0(boolean z14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.M(Boolean.valueOf(z14));
    }

    public final boolean D() {
        u uVar = this.f43527e;
        if (uVar == null) {
            return false;
        }
        uVar.getClass();
        if (uVar.getPeriodPrediction() == null) {
            return false;
        }
        u uVar2 = this.f43527e;
        uVar2.getClass();
        Boolean boolI = uVar2.getPeriodPrediction();
        boolI.getClass();
        return boolI.booleanValue();
    }

    public final void E0(boolean z14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        if (uVar != null) {
            uVar.Z(Boolean.valueOf(z14));
        }
    }

    public final double E2() {
        j jVar = this.f43524b;
        if (jVar == null) {
            return 0.0d;
        }
        jVar.getClass();
        return jVar.f185540c;
    }

    public final LocalDate F() {
        j jVar = this.f43524b;
        if (jVar == null || jVar.f185543f == null) {
            return null;
        }
        try {
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd");
            j jVar2 = this.f43524b;
            jVar2.getClass();
            return dateTimeFormatterForPattern.parseLocalDate(jVar2.f185543f);
        } catch (IllegalArgumentException unused) {
            a2 a2Var = a2.SETTINGS;
            j jVar3 = this.f43524b;
            jVar3.getClass();
            String strM = am.j.m("Exception creating Date object from JSON value [", jVar3.f185543f, "].");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "UserSettingsDTO", strM);
            return null;
        } catch (UnsupportedOperationException unused2) {
            a2 a2Var2 = a2.SETTINGS;
            j jVar4 = this.f43524b;
            jVar4.getClass();
            String strM2 = am.j.m("Exception creating Date object from JSON value [", jVar4.f185543f, "].");
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "UserSettingsDTO", strM2);
            return null;
        }
    }

    public final c G() {
        String str;
        j jVar = this.f43524b;
        if (jVar == null || (str = jVar.f185538a) == null) {
            return null;
        }
        c.f43531c.getClass();
        return c.a.a(str);
    }

    public final d H() {
        j jVar = this.f43524b;
        if (jVar == null) {
            return d.RIGHT;
        }
        d.a aVar = d.f43539c;
        String str = jVar.f185546i;
        aVar.getClass();
        return d.a.a(str);
    }

    public final double I() {
        j jVar = this.f43524b;
        if (jVar == null) {
            return 0.0d;
        }
        jVar.getClass();
        return jVar.f185541d;
    }

    public final void J0(int i14) {
        if (this.f43524b == null) {
            this.f43524b = new j();
        }
        j jVar = this.f43524b;
        jVar.getClass();
        jVar.f185545h = i14;
    }

    public final void L0(LocalDate localDate) {
        if (this.f43524b == null) {
            this.f43524b = new j();
        }
        j jVar = this.f43524b;
        jVar.getClass();
        jVar.f185543f = localDate != null ? DateTimeFormat.forPattern("yyyy-MM-dd").print(localDate) : null;
    }

    public final long M() {
        k kVar = this.f43525c;
        if (kVar == null) {
            return -1L;
        }
        kVar.getClass();
        return kVar.f185575a;
    }

    public final void M0(long j8) {
        if (this.f43524b == null) {
            this.f43524b = new j();
        }
        j jVar = this.f43524b;
        jVar.getClass();
        jVar.f185551n = j8;
    }

    public final void P0(c cVar) {
        if (this.f43524b == null) {
            this.f43524b = new j();
        }
        j jVar = this.f43524b;
        jVar.getClass();
        jVar.f185538a = cVar != null ? cVar.f43537a : null;
    }

    public final void Q0(h0 h0Var) {
        if (this.f43524b == null) {
            this.f43524b = new j();
        }
        j jVar = this.f43524b;
        jVar.getClass();
        jVar.f185539b = h0Var != null ? h0Var.f77242a : null;
    }

    public final void R0(d dVar) {
        if (this.f43524b == null) {
            this.f43524b = new j();
        }
        j jVar = this.f43524b;
        jVar.getClass();
        jVar.f185546i = dVar != null ? dVar.f43544a : null;
    }

    public final void S0(double d14) {
        if (this.f43524b == null) {
            this.f43524b = new j();
        }
        j jVar = this.f43524b;
        jVar.getClass();
        jVar.f185541d = d14;
    }

    public final void V0(o0 o0Var) {
        if (this.f43524b == null) {
            this.f43524b = new j();
        }
        j jVar = this.f43524b;
        jVar.getClass();
        jVar.f185544g = o0Var != null ? o0Var.f77291a : null;
    }

    public final long Z() {
        k kVar = this.f43525c;
        if (kVar == null) {
            return -1L;
        }
        kVar.getClass();
        return kVar.f185576b;
    }

    public final void Z0(long j8) {
        if (this.f43525c == null) {
            this.f43525c = new k();
        }
        k kVar = this.f43525c;
        kVar.getClass();
        kVar.f185575a = j8;
    }

    public final void a0(int i14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.k(Integer.valueOf(i14));
    }

    public final void c0(int i14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.m(Integer.valueOf(i14));
    }

    public final void c1(e eVar) {
        if (this.f43524b == null) {
            this.f43524b = new j();
        }
        j jVar = this.f43524b;
        jVar.getClass();
        jVar.f185542e = eVar != null ? eVar.f43550a : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e0(boolean z14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.o(Boolean.valueOf(z14));
    }

    public final void e1(int i14) {
        if (this.f43524b == null) {
            this.f43524b = new j();
        }
        j jVar = this.f43524b;
        jVar.getClass();
        jVar.f185550m = i14;
    }

    public final void f0(i iVar) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.q(iVar);
    }

    public final void g0(ww0.a aVar) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.A(aVar);
    }

    public final void h0(boolean z14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.r(Boolean.valueOf(z14));
    }

    public final void h1(int i14) {
        if (this.f43524b == null) {
            this.f43524b = new j();
        }
        j jVar = this.f43524b;
        jVar.getClass();
        jVar.f185549l = i14;
    }

    public final void i0(boolean z14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.s(Boolean.valueOf(z14));
    }

    public final void j0(boolean z14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.t(Boolean.valueOf(z14));
    }

    public final void j1(long j8) {
        if (this.f43525c == null) {
            this.f43525c = new k();
        }
        k kVar = this.f43525c;
        kVar.getClass();
        kVar.f185576b = j8;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f43523a = s1.u(jSONObject, TtmlNode.ATTR_ID);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("userData");
            if (jSONObjectOptJSONObject != null) {
                j jVar = new j();
                this.f43524b = jVar;
                jVar.k(jSONObjectOptJSONObject);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("userSleep");
            if (jSONObjectOptJSONObject2 != null) {
                k kVar = new k();
                this.f43525c = kVar;
                kVar.k(jSONObjectOptJSONObject2);
            }
            if (jSONObject.optJSONObject("userMenstrualCycleSettings") != null) {
                String string = jSONObject.optJSONObject("userMenstrualCycleSettings").toString();
                string.getClass();
                this.f43527e = (u) GsonUtil.f47253b.fromJson(string, u.class);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("userSleepWindows");
            if (jSONArrayOptJSONArray != null) {
                this.f43526d = (List) GsonUtil.f47253b.fromJson(jSONArrayOptJSONArray.toString(), new f().getType());
            }
            this.f43528f = s1.u(jSONObject, "sourceType");
        }
    }

    public final void k0(boolean z14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.u(Boolean.valueOf(z14));
    }

    public final void n0(boolean z14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.z(Boolean.valueOf(z14));
    }

    public final void o0(boolean z14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.C(Boolean.valueOf(z14));
    }

    public final void p0(boolean z14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.D(Boolean.valueOf(z14));
    }

    public final void s1(double d14) {
        if (this.f43524b == null) {
            this.f43524b = new j();
        }
        j jVar = this.f43524b;
        jVar.getClass();
        jVar.f185540c = d14;
    }

    public final JSONObject t1() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f43523a)) {
                jSONObject.put(TtmlNode.ATTR_ID, this.f43523a);
            }
            j jVar = this.f43524b;
            if (jVar != null) {
                jSONObject.put("userData", jVar.F());
            }
            k kVar = this.f43525c;
            if (kVar != null) {
                jSONObject.put("userSleep", kVar.C());
            }
            if (this.f43527e != null) {
                jSONObject.put("userMenstrualCycleSettings", new JSONObject(GsonUtil.a(this.f43527e)));
            }
            if (this.f43526d != null) {
                jSONObject.put("userSleepWindows", new JSONArray(GsonUtil.a(this.f43526d)));
            }
            if (!TextUtils.isEmpty(this.f43528f)) {
                jSONObject.put("sourceType", this.f43528f);
            }
            return jSONObject;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, j.class.getSimpleName(), "Error while converting to JSON object: " + e4);
            return jSONObject;
        }
    }

    public final void w0(boolean z14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.F(Boolean.valueOf(z14));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f43523a);
        parcel.writeParcelable(this.f43524b, i14);
        parcel.writeParcelable(this.f43525c, i14);
        parcel.writeParcelable(this.f43527e, i14);
        parcel.writeTypedList(this.f43526d);
        parcel.writeString(this.f43528f);
        parcel.writeInt(this.f43529g ? 1 : 0);
        parcel.writeDouble(this.f43530h);
    }

    public final void x0(boolean z14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.G(Boolean.valueOf(z14));
    }

    public final void z0(boolean z14) {
        if (this.f43527e == null) {
            this.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }
        u uVar = this.f43527e;
        uVar.getClass();
        uVar.H(Boolean.valueOf(z14));
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO$c[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO$c[]) from 0x0031: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO$c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO$c;", "", "", "jsonValue", "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        MALE("MALE", R.string.lbl_gender_male),
        FEMALE("FEMALE", R.string.lbl_gender_female),
        NOT_SPECIFIED("", R.string.gender_not_specified);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43531c = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ w13.c f43536h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43538b;

        static {
            f43536h = new w13.c(new c[]{r0, r1, r2});
        }

        private c(String str, int i14) {
            super(str, i);
            this.f43537a = str;
            this.f43538b = i14;
        }

        public static final CharSequence[] a(Context context) {
            f43531c.getClass();
            context.getClass();
            w13.c cVar = f43536h;
            CharSequence[] charSequenceArr = new CharSequence[cVar.getF168272d()];
            int length = cVar.toArray(new c[0]).length;
            for (int i14 = 0; i14 < length; i14++) {
                charSequenceArr[i14] = context.getString(((c) cVar.get(i14)).f43538b);
            }
            return charSequenceArr;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f43535g.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO$c$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static c a(String str) {
                if (str != null) {
                    w13.c cVar = c.f43536h;
                    p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                    while (bVarN.hasNext()) {
                        c cVar2 = (c) bVarN.next();
                        if (s.g(cVar2.f43537a, str)) {
                            return cVar2;
                        }
                    }
                }
                return c.MALE;
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO$d[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO$d[]) from 0x0022: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO$d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO$d;", "", "", "jsonValue", "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        LEFT("LEFT", R.string.handedness_golf_value_left_handed),
        RIGHT("RIGHT", R.string.handedness_golf_value_right_handed);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f43539c = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ w13.c f43543g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43545b;

        static {
            f43543g = new w13.c(new d[]{r0, r1});
        }

        private d(String str, int i14) {
            super(str, i);
            this.f43544a = str;
            this.f43545b = i14;
        }

        public static final CharSequence[] a(Context context) {
            f43539c.getClass();
            context.getClass();
            w13.c cVar = f43543g;
            CharSequence[] charSequenceArr = new CharSequence[cVar.getF168272d()];
            int length = cVar.toArray(new d[0]).length;
            for (int i14 = 0; i14 < length; i14++) {
                charSequenceArr[i14] = context.getString(((d) cVar.get(i14)).f43545b);
            }
            return charSequenceArr;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f43542f.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO$d$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static d a(String str) {
                if (str != null) {
                    w13.c cVar = d.f43543g;
                    p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                    while (bVarN.hasNext()) {
                        d dVar = (d) bVarN.next();
                        if (s.g(dVar.f43544a, str)) {
                            return dVar;
                        }
                    }
                }
                return d.RIGHT;
            }

            private a() {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO$e[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO$e[]) from 0x0024: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO$e[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO$e;", "", "", "jsonValue", "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e {
        TWELVE_HOUR("time_twelve_hr", R.string.lbl_12_hour),
        /* JADX INFO: Fake field, exist only in values array */
        TWENTY_FOUR_HOUR("time_twenty_four_hr", R.string.lbl_24_hour);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f43546b = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ w13.c f43549e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43550a;

        static {
            f43549e = new w13.c(new e[]{r0, new e("time_twenty_four_hr", R.string.lbl_24_hour)});
        }

        private e(String str, int i14) {
            super(str, i);
            this.f43550a = str;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f43548d.clone();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO$e$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static e a(String str) {
                if (str != null) {
                    w13.c cVar = e.f43549e;
                    p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                    while (bVarN.hasNext()) {
                        e eVar = (e) bVarN.next();
                        if (s.g(eVar.f43550a, str)) {
                            return eVar;
                        }
                    }
                }
                return e.TWELVE_HOUR;
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_AGE", "I", "INVALID_DIVE_NUMBER", "INVALID_LAP_COUNT", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "CREATOR", "Landroid/os/Parcelable$Creator;", "DEFAULT_SLEEP_START_TIME_MILLIS_MIDNIGHT", "DEFAULT_SLEEP_WAKE_TIME_MILLIS_MIDNIGHT", "DEFAULT_SLEEP_START_HOUR", "DEFAULT_SLEEP_WAKE_HOUR", "USER_DATA", "USER_SLEEP", "USER_MENSTRUAL_CYCLE_SETTINGS", "USER_SLEEP_WINDOWS", "SOURCE_TYPE", "SOURCE_TYPE_BIC", "ID", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public UserSettingsDTO() {
    }
}
