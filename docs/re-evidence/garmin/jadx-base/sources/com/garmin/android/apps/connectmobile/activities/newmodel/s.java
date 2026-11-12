package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ps.z1;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class s extends s1 implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z1 f29657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f29659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f29660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z1 f29661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f29663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f29664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f29666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f29667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t f29668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<r> f29669n;

    public class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            return new s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public s(Parcel parcel) {
        this.f29656a = parcel.readInt();
        this.f29657b = (z1) parcel.readParcelable(z1.class.getClassLoader());
        this.f29658c = parcel.readString();
        this.f29659d = parcel.readDouble();
        this.f29660e = parcel.readDouble();
        this.f29661f = (z1) parcel.readParcelable(z1.class.getClassLoader());
        this.f29662g = parcel.readString();
        this.f29663h = parcel.readString();
        this.f29664i = parcel.readString();
        this.f29665j = parcel.readString();
        this.f29666k = parcel.readString();
        this.f29667l = parcel.readDouble();
        this.f29668m = (t) parcel.readParcelable(t.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.f29669n = arrayList;
        parcel.readTypedList(arrayList, r.CREATOR);
    }

    public final void C(List<r> list) {
        this.f29669n = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f29656a = jSONObject.optInt("weight", 0);
        if (!jSONObject.isNull("weightUnit")) {
            this.f29657b = (z1) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("weightUnit").toString(), z1.class);
        }
        this.f29658c = s1.u(jSONObject, "exposureSuit");
        this.f29659d = jSONObject.optDouble("suitThickness", 0.0d);
        this.f29660e = jSONObject.optDouble("visibility", 0.0d);
        if (!jSONObject.isNull("visibilityUnit")) {
            this.f29661f = (z1) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("visibilityUnit").toString(), z1.class);
        }
        this.f29662g = s1.u(jSONObject, "surfaceCondition");
        this.f29663h = s1.u(jSONObject, "current");
        this.f29664i = s1.u(jSONObject, "entryType");
        this.f29665j = s1.u(jSONObject, "equipments");
        this.f29666k = s1.u(jSONObject, "buddy");
        this.f29667l = jSONObject.optDouble("totalSurfaceTime", 0.0d);
        if (!jSONObject.isNull("diveSettings")) {
            t tVar = new t();
            this.f29668m = tVar;
            tVar.k(jSONObject.getJSONObject("diveSettings"));
        }
        HashSet hashSet = new HashSet();
        this.f29669n = new ArrayList();
        if (!jSONObject.isNull("diveGases")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("diveGases");
            for (int i14 = 0; i14 < jSONArrayOptJSONArray.length(); i14++) {
                r rVar = new r();
                rVar.k(jSONArrayOptJSONArray.getJSONObject(i14));
                this.f29669n.add(rVar);
                hashSet.add(Integer.valueOf(rVar.f29646e));
            }
        }
        if (hashSet.size() != this.f29669n.size()) {
            for (int i15 = 0; i15 < this.f29669n.size(); i15++) {
                this.f29669n.get(i15).f29646e = i15;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f29656a);
        parcel.writeParcelable(this.f29657b, i14);
        parcel.writeString(this.f29658c);
        parcel.writeDouble(this.f29659d);
        parcel.writeDouble(this.f29660e);
        parcel.writeParcelable(this.f29661f, i14);
        parcel.writeString(this.f29662g);
        parcel.writeString(this.f29663h);
        parcel.writeString(this.f29664i);
        parcel.writeString(this.f29665j);
        parcel.writeString(this.f29666k);
        parcel.writeDouble(this.f29667l);
        parcel.writeParcelable(this.f29668m, i14);
        parcel.writeTypedList(this.f29669n);
    }

    public s() {
    }
}
