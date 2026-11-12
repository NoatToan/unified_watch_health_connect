package bb2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import ps.z1;

/* JADX INFO: loaded from: classes8.dex */
public class d extends s1 implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z1 f17334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f17336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f17337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z1 f17338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f17340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f17341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f17343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f17344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f17345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Double f17346n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f17347o;

    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(Parcel parcel) {
        this.f17333a = parcel.readInt();
        this.f17334b = (z1) parcel.readParcelable(z1.class.getClassLoader());
        this.f17335c = parcel.readString();
        this.f17336d = parcel.readDouble();
        this.f17337e = parcel.readDouble();
        this.f17338f = (z1) parcel.readParcelable(z1.class.getClassLoader());
        this.f17339g = parcel.readString();
        this.f17340h = parcel.readString();
        this.f17341i = parcel.readString();
        this.f17342j = parcel.readString();
        this.f17343k = parcel.readString();
        this.f17345m = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.f17346n = (Double) parcel.readValue(Integer.class.getClassLoader());
        this.f17344l = parcel.readDouble();
        ArrayList arrayList = new ArrayList();
        this.f17347o = arrayList;
        parcel.readTypedList(arrayList, com.garmin.android.apps.connectmobile.activities.newmodel.r.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f17333a == dVar.f17333a && Double.compare(dVar.f17336d, this.f17336d) == 0 && Double.compare(dVar.f17337e, this.f17337e) == 0 && Objects.equals(this.f17334b, dVar.f17334b) && Objects.equals(this.f17335c, dVar.f17335c) && Objects.equals(this.f17338f, dVar.f17338f) && Objects.equals(this.f17339g, dVar.f17339g) && Objects.equals(this.f17340h, dVar.f17340h) && Objects.equals(this.f17341i, dVar.f17341i) && Objects.equals(this.f17342j, dVar.f17342j) && Objects.equals(this.f17343k, dVar.f17343k) && Objects.equals(this.f17345m, dVar.f17345m) && Objects.equals(this.f17346n, dVar.f17346n) && Objects.equals(this.f17347o, dVar.f17347o);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f17333a), this.f17334b, this.f17335c, Double.valueOf(this.f17336d), Double.valueOf(this.f17337e), this.f17338f, this.f17339g, this.f17340h, this.f17341i, this.f17342j, this.f17343k, this.f17345m, this.f17346n, this.f17347o);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f17333a = jSONObject.optInt("weight", 0);
        if (!jSONObject.isNull("weightUnit")) {
            this.f17334b = (z1) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("weightUnit").toString(), z1.class);
        }
        this.f17335c = s1.u(jSONObject, "exposureSuit");
        this.f17336d = jSONObject.optDouble("suitThickness", 0.0d);
        this.f17337e = jSONObject.optDouble("visibility", 0.0d);
        if (!jSONObject.isNull("visibilityUnit")) {
            this.f17338f = (z1) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("visibilityUnit").toString(), z1.class);
        }
        this.f17339g = s1.u(jSONObject, "surfaceCondition");
        this.f17340h = s1.u(jSONObject, "current");
        this.f17341i = s1.u(jSONObject, "entryType");
        this.f17342j = s1.u(jSONObject, "equipments");
        this.f17343k = s1.u(jSONObject, "buddy");
        this.f17344l = jSONObject.optDouble("totalSurfaceTime", 0.0d);
        if (!jSONObject.isNull("waterType")) {
            this.f17345m = Integer.valueOf(jSONObject.getInt("waterType"));
        }
        if (!jSONObject.isNull("waterDensity")) {
            this.f17346n = Double.valueOf(jSONObject.getDouble("waterDensity"));
        }
        this.f17347o = new ArrayList();
        if (jSONObject.isNull("summarizedDiveGases")) {
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("summarizedDiveGases");
        for (int i14 = 0; i14 < jSONArrayOptJSONArray.length(); i14++) {
            com.garmin.android.apps.connectmobile.activities.newmodel.r rVar = new com.garmin.android.apps.connectmobile.activities.newmodel.r();
            rVar.k(jSONArrayOptJSONArray.getJSONObject(i14));
            this.f17347o.add(rVar);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f17333a);
        parcel.writeParcelable(this.f17334b, i14);
        parcel.writeString(this.f17335c);
        parcel.writeDouble(this.f17336d);
        parcel.writeDouble(this.f17337e);
        parcel.writeParcelable(this.f17338f, i14);
        parcel.writeString(this.f17339g);
        parcel.writeString(this.f17340h);
        parcel.writeString(this.f17341i);
        parcel.writeString(this.f17342j);
        parcel.writeString(this.f17343k);
        parcel.writeValue(this.f17345m);
        parcel.writeValue(this.f17346n);
        parcel.writeDouble(this.f17344l);
        parcel.writeTypedList(this.f17347o);
    }

    public d() {
    }
}
