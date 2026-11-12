package com.garmin.android.apps.connectmobile.activities.newmodel;

import am.x0;
import am.z0;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ps.a1;
import ps.o1;
import ps.w0;

/* JADX INFO: loaded from: classes7.dex */
public class h extends s1 implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f29448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f29449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f29451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f29452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public to.o f29455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ps.p0 f29456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ps.a f29457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ps.s1 f29458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a1 f29459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i0 f29460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f29461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ExerciseSetsDTO f29462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<w0> f29463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f29464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public o0 f29465r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p f29466t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList<ps.w> f29467v;

    public class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public h(Parcel parcel) {
        this.f29464q = new ArrayList();
        this.f29467v = new ArrayList<>();
        this.f29448a = parcel.readLong();
        this.f29449b = parcel.readString();
        this.f29450c = parcel.readString();
        this.f29451d = parcel.readLong();
        this.f29452e = parcel.readLong();
        this.f29453f = parcel.readInt() == 1;
        this.f29454g = parcel.readString();
        this.f29455h = (to.o) parcel.readParcelable(to.o.class.getClassLoader());
        this.f29456i = (ps.p0) parcel.readParcelable(ps.p0.class.getClassLoader());
        this.f29457j = (ps.a) parcel.readParcelable(ps.a.class.getClassLoader());
        this.f29458k = (ps.s1) parcel.readParcelable(ps.s1.class.getClassLoader());
        this.f29459l = (a1) parcel.readParcelable(a1.class.getClassLoader());
        this.f29460m = (i0) parcel.readParcelable(i0.class.getClassLoader());
        this.f29461n = (s) parcel.readParcelable(s.class.getClassLoader());
        this.f29465r = (o0) parcel.readParcelable(o0.class.getClassLoader());
        this.f29467v = parcel.createTypedArrayList(ps.w.CREATOR);
        this.f29463p = parcel.createTypedArrayList(w0.CREATOR);
        this.f29464q = parcel.readArrayList(o1.class.getClassLoader());
        this.f29462o = (ExerciseSetsDTO) parcel.readParcelable(ExerciseSetsDTO.class.getClassLoader());
        this.f29466t = (p) parcel.readParcelable(p.class.getClassLoader());
    }

    public final x0 C() {
        to.o oVar = this.f29455h;
        if (oVar == null) {
            return x0.f4346x;
        }
        return z0.l(x0.f4346x, oVar.j());
    }

    public final ExerciseSetsDTO D() {
        return this.f29462o;
    }

    public final boolean F() {
        return this.f29462o != null;
    }

    public final boolean G() {
        a1 a1Var = this.f29459l;
        return (a1Var == null || a1Var.getHasSplits() == null || !a1Var.getHasSplits().booleanValue()) ? false : true;
    }

    public final boolean H() {
        List<String> listK = this.f29459l.k();
        if (listK == null) {
            return true;
        }
        int i14 = 0;
        int i15 = 0;
        for (String str : listK) {
            z0 z0Var = z0.f4390a;
            if (z0.b(x0.f4308n, str) || z0.b(x0.f4312o, str) || (z0.b(x0.f4324r, str) && i14 < 4)) {
                i14++;
            } else {
                if (!z0.Y(str) || i15 >= 3) {
                    return false;
                }
                i15++;
            }
        }
        return true;
    }

    public final void I(ps.p0 p0Var) {
        this.f29456i = p0Var;
    }

    public final void M(a1 a1Var) {
        this.f29459l = a1Var;
    }

    public final void Z(am.l lVar) {
        this.f29457j = new ps.a(lVar.f4055b, lVar.f4054a);
    }

    public final void a0(List<o1> list) {
        this.f29464q = (ArrayList) list;
    }

    public final void c0(i0 i0Var) {
        this.f29460m = i0Var;
    }

    public final Object clone() {
        h hVar = new h();
        try {
            hVar.k(e0());
        } catch (JSONException unused) {
        }
        return hVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject e0() throws JSONException {
        Object objF;
        JSONObject jSONObject = new JSONObject();
        s1.j(jSONObject, "activityName", this.f29449b);
        jSONObject.put("userProfileId", this.f29451d);
        s1.j(jSONObject, "description", this.f29450c);
        s1.j(jSONObject, "locationName", this.f29454g);
        to.o oVar = this.f29455h;
        if (oVar != null) {
            jSONObject.put("activityTypeDTO", oVar.m());
        }
        ps.p0 p0Var = this.f29456i;
        if (p0Var != null) {
            jSONObject.put("eventTypeDTO", p0Var.f());
        }
        i0 i0Var = this.f29460m;
        if (i0Var != null) {
            jSONObject.put("summaryDTO", i0Var.e0());
        }
        s sVar = this.f29461n;
        if (sVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            int i14 = sVar.f29656a;
            if (i14 != 0 && sVar.f29657b != null) {
                jSONObject2.put("weight", i14);
                jSONObject2.put("weightUnit", sVar.f29657b.i());
            }
            s1.j(jSONObject2, "exposureSuit", sVar.f29658c);
            double d14 = sVar.f29659d;
            if (d14 != 0.0d) {
                jSONObject2.put("suitThickness", d14);
            }
            double d15 = sVar.f29660e;
            if (d15 != 0.0d && sVar.f29661f != null) {
                jSONObject2.put("visibility", d15);
                jSONObject2.put("visibilityUnit", sVar.f29661f.i());
            }
            s1.j(jSONObject2, "surfaceCondition", sVar.f29662g);
            s1.j(jSONObject2, "current", sVar.f29663h);
            s1.j(jSONObject2, "entryType", sVar.f29664i);
            s1.j(jSONObject2, "equipments", sVar.f29665j);
            s1.j(jSONObject2, "buddy", sVar.f29666k);
            if (!Double.isNaN(sVar.f29667l)) {
                double d16 = sVar.f29667l;
                if (d16 != 0.0d) {
                    jSONObject2.put("totalSurfaceTime", d16);
                }
            }
            t tVar = sVar.f29668m;
            if (tVar != null) {
                JSONObject jSONObject3 = new JSONObject();
                s1.j(jSONObject3, "name", tVar.f29670a);
                int i15 = tVar.f29671b;
                if (i15 != 0) {
                    jSONObject3.put(ModelSourceWrapper.TYPE, i15);
                }
                Integer num = tVar.f29674e;
                if (num != null) {
                    jSONObject3.put("waterType", num.intValue());
                }
                Double d17 = tVar.f29675f;
                if (d17 != null) {
                    s1.i(jSONObject3, "waterDensity", d17.doubleValue());
                }
                s1.j(jSONObject3, "ccrLowSetpointSwitchMode", tVar.f29676g);
                s1.j(jSONObject3, "ccrHighSetpointSwitchMode", tVar.f29679j);
                t.C(jSONObject3, "ccrLowSetpoint", tVar.f29677h);
                t.C(jSONObject3, "ccrHighSetpoint", tVar.f29680k);
                t.C(jSONObject3, "ccrLowSetpointDepth", tVar.f29678i);
                t.C(jSONObject3, "ccrHighSetpointDepth", tVar.f29681l);
                jSONObject2.put("diveSettings", jSONObject3);
            }
            if (sVar.f29669n != null) {
                JSONArray jSONArray = new JSONArray();
                for (r rVar : sVar.f29669n) {
                    rVar.getClass();
                    JSONObject jSONObject4 = new JSONObject();
                    if (rVar.f29644c == -1.0d) {
                        rVar.f29644c = 0.0d;
                    }
                    if (rVar.f29643b == -1.0d) {
                        rVar.f29643b = 0.0d;
                    }
                    jSONObject4.put("gasMode", rVar.f29642a);
                    jSONObject4.put("heliumContent", rVar.f29643b);
                    jSONObject4.put("oxygenContent", rVar.f29644c);
                    jSONObject4.put("status", rVar.f29645d);
                    jSONObject4.put("gasIndex", rVar.f29646e);
                    jSONObject4.put("volume", rVar.f29647f);
                    jSONObject4.put("tankType", rVar.f29648g);
                    if (rVar.f29650i != null) {
                        jSONObject4.put("tankStartingPressure", rVar.f29649h);
                        jSONObject4.put("tankStartingPressureUnit", rVar.f29650i.i());
                    }
                    if (rVar.f29652k != null) {
                        jSONObject4.put("tankEndingPressure", rVar.f29651j);
                        jSONObject4.put("tankEndingPressureUnit", rVar.f29652k.i());
                    }
                    if (rVar.f29654m != null) {
                        jSONObject4.put("tankSize", rVar.f29653l);
                        jSONObject4.put("tankSizeUnit", rVar.f29654m.i());
                    }
                    if (!Double.isNaN(rVar.f29655n)) {
                        jSONObject4.put("sacRate", rVar.f29655n);
                    }
                    jSONArray.put(jSONObject4);
                }
                jSONObject2.put("diveGases", jSONArray);
            }
            jSONObject.put("diveInfo", jSONObject2);
        }
        o0 o0Var = this.f29465r;
        if (o0Var != null && (objF = o0Var.f()) != null) {
            jSONObject.put("videoGameInfo", objF);
        }
        if (this.f29457j != null) {
            jSONObject.put("accessControlRuleDTO", new JSONObject(GsonUtil.a(this.f29457j)));
        }
        if (this.f29459l != null) {
            jSONObject.put("metadataDTO", new JSONObject(GsonUtil.a(this.f29459l)));
        }
        ArrayList<ps.w> arrayList = this.f29467v;
        if (arrayList != null && !arrayList.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            int size = this.f29467v.size();
            for (int i16 = 0; i16 < size; i16++) {
                jSONArray2.put(new JSONObject(GsonUtil.a(this.f29467v.get(i16))));
            }
            jSONObject.put("connectIQMeasurements", jSONArray2);
        }
        ArrayList arrayList2 = this.f29464q;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            JSONArray jSONArray3 = new JSONArray();
            int size2 = this.f29464q.size();
            for (int i17 = 0; i17 < size2; i17++) {
                o1 o1Var = (o1) this.f29464q.get(i17);
                if (o1Var != null) {
                    jSONArray3.put(o1Var.Y1());
                }
            }
            jSONObject.put("splitSummaries", jSONArray3);
        }
        return jSONObject;
    }

    public final JSONObject f0() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        s1.j(jSONObject, "activityName", this.f29449b);
        s1.j(jSONObject, "description", this.f29450c);
        ps.p0 p0Var = this.f29456i;
        if (p0Var != null) {
            jSONObject.put("eventTypeDTO", p0Var.f());
        }
        if (this.f29457j != null) {
            jSONObject.put("accessControlRuleDTO", new JSONObject(GsonUtil.a(this.f29457j)));
        }
        if (this.f29459l != null) {
            jSONObject.put("metadataDTO", new JSONObject(GsonUtil.a(this.f29459l)));
        }
        i0 i0Var = this.f29460m;
        if (i0Var != null) {
            JSONObject jSONObject2 = new JSONObject();
            s1.j(jSONObject2, "startTimeLocal", i0Var.f29484a);
            s1.j(jSONObject2, "startTimeGMT", i0Var.f29488b);
            if (jSONObject2.length() > 0) {
                jSONObject.put("summaryDTO", jSONObject2);
            }
        }
        return jSONObject;
    }

    public final JSONObject g0() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        s1.j(jSONObject, "activityName", this.f29449b);
        s1.j(jSONObject, "description", this.f29450c);
        s1.j(jSONObject, "locationName", this.f29454g);
        ps.p0 p0Var = this.f29456i;
        if (p0Var != null) {
            jSONObject.put("eventTypeDTO", p0Var.f());
        }
        i0 i0Var = this.f29460m;
        if (i0Var != null) {
            jSONObject.put("summaryDTO", i0Var.e0());
        }
        if (this.f29457j != null) {
            jSONObject.put("accessControlRuleDTO", new JSONObject(GsonUtil.a(this.f29457j)));
        }
        if (this.f29459l != null) {
            jSONObject.put("metadataDTO", new JSONObject(GsonUtil.a(this.f29459l)));
        }
        return jSONObject;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.f29448a = jSONObject.optLong("activityId", 0L);
            this.f29449b = s1.u(jSONObject, "activityName");
            this.f29450c = s1.u(jSONObject, "description");
            this.f29451d = jSONObject.optLong("userProfileId", 0L);
            this.f29452e = jSONObject.optLong("parentId", 0L);
            this.f29453f = jSONObject.optBoolean("isMultiSportParent", false);
            this.f29454g = s1.u(jSONObject, "locationName");
            if (!jSONObject.isNull("activityTypeDTO")) {
                this.f29455h = new to.o(jSONObject.getJSONObject("activityTypeDTO"));
            }
            if (!jSONObject.isNull("eventTypeDTO")) {
                this.f29456i = new ps.p0(jSONObject.getJSONObject("eventTypeDTO"));
            }
            if (!jSONObject.isNull("accessControlRuleDTO")) {
                this.f29457j = (ps.a) GsonUtil.f47253b.fromJson(String.valueOf(jSONObject.optJSONObject("accessControlRuleDTO")), ps.a.class);
            }
            if (!jSONObject.isNull("timeZoneUnitDTO")) {
                this.f29458k = (ps.s1) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("timeZoneUnitDTO").toString(), ps.s1.class);
            }
            if (!jSONObject.isNull("metadataDTO")) {
                this.f29459l = (a1) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("metadataDTO").toString(), a1.class);
            }
            if (!jSONObject.isNull("summaryDTO")) {
                i0 i0Var = new i0();
                this.f29460m = i0Var;
                i0Var.k(jSONObject.getJSONObject("summaryDTO"));
            }
            if (!jSONObject.isNull("diveInfo")) {
                s sVar = new s();
                this.f29461n = sVar;
                sVar.k(jSONObject.getJSONObject("diveInfo"));
            }
            if (!jSONObject.isNull("videoGameInfo")) {
                this.f29465r = (o0) GsonUtil.f47253b.fromJson(jSONObject.getString("videoGameInfo"), o0.class);
            }
            if (!jSONObject.isNull("deviceDisplayUnitsDTO")) {
                this.f29466t = (p) GsonUtil.f47253b.fromJson(jSONObject.getString("deviceDisplayUnitsDTO"), p.class);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("connectIQMeasurements");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                this.f29467v = new ArrayList<>(length);
                for (int i14 = 0; i14 < length; i14++) {
                    this.f29467v.add(i14, (ps.w) GsonUtil.f47253b.fromJson(jSONArrayOptJSONArray.getJSONObject(i14).toString(), ps.w.class));
                }
            }
            if (!jSONObject.isNull("splitSummaries")) {
                this.f29464q = new ArrayList();
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("splitSummaries");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i15 = 0; i15 < jSONArrayOptJSONArray2.length(); i15++) {
                        this.f29464q.add((o1) GsonUtil.f47253b.fromJson(jSONArrayOptJSONArray2.optString(i15), o1.class));
                    }
                }
            }
            if (jSONObject.isNull("deviceDisplayUnitsDTO")) {
                return;
            }
            this.f29466t = (p) GsonUtil.f47253b.fromJson(jSONObject.getString("deviceDisplayUnitsDTO"), p.class);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f29448a);
        parcel.writeString(this.f29449b);
        parcel.writeString(this.f29450c);
        parcel.writeLong(this.f29451d);
        parcel.writeLong(this.f29452e);
        parcel.writeInt(this.f29453f ? 1 : 0);
        parcel.writeString(this.f29454g);
        parcel.writeParcelable(this.f29455h, i14);
        parcel.writeParcelable(this.f29456i, i14);
        parcel.writeParcelable(this.f29457j, i14);
        parcel.writeParcelable(this.f29458k, i14);
        parcel.writeParcelable(this.f29459l, i14);
        parcel.writeParcelable(this.f29460m, i14);
        parcel.writeParcelable(this.f29461n, i14);
        parcel.writeParcelable(this.f29465r, i14);
        parcel.writeTypedList(this.f29467v);
        parcel.writeTypedList(this.f29463p);
        parcel.writeList(this.f29464q);
        parcel.writeParcelable(this.f29462o, i14);
    }

    public h() {
        this.f29464q = new ArrayList();
        this.f29467v = new ArrayList<>();
    }
}
