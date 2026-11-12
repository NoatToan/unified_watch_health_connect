package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class a extends s1 implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0454a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("activityId")
    protected long f29384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("measurementCount")
    protected int f29385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("metricsCount")
    protected int f29386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("totalMetricsCount")
    protected int f29387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("metricDescriptors")
    protected List<y> f29388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("activityDetailMetrics")
    protected List<b> f29389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("geoPolylineDTO")
    protected w f29390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SerializedName("heartRateDTOs")
    protected List<c> f29391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("detailsAvailable")
    protected boolean f29392i;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.newmodel.a$a, reason: collision with other inner class name */
    public class C0454a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new ActivityDetailChartDTO[i14];
        }
    }

    public a(Parcel parcel) {
        this.f29384a = parcel.readLong();
        this.f29385b = parcel.readInt();
        this.f29386c = parcel.readInt();
        this.f29387d = parcel.readInt();
        int i14 = parcel.readInt();
        if (i14 > 0) {
            if (this.f29388e == null) {
                this.f29388e = new ArrayList();
            }
            ClassLoader classLoader = y.class.getClassLoader();
            for (int i15 = 0; i15 < i14; i15++) {
                this.f29388e.add((y) parcel.readParcelable(classLoader));
            }
        }
        int i16 = parcel.readInt();
        if (i16 > 0) {
            if (this.f29389f == null) {
                this.f29389f = new ArrayList();
            }
            ClassLoader classLoader2 = b.class.getClassLoader();
            for (int i17 = 0; i17 < i16; i17++) {
                this.f29389f.add((b) parcel.readParcelable(classLoader2));
            }
        }
        this.f29390g = (w) parcel.readParcelable(w.class.getClassLoader());
        int i18 = parcel.readInt();
        if (i18 > 0) {
            if (this.f29391h == null) {
                this.f29391h = new ArrayList();
            }
            ClassLoader classLoader3 = c.class.getClassLoader();
            for (int i19 = 0; i19 < i18; i19++) {
                this.f29391h.add((c) parcel.readParcelable(classLoader3));
            }
        }
        this.f29392i = parcel.readInt() == 1;
    }

    public final List<b> C() {
        return this.f29389f;
    }

    public final w D() {
        return this.f29390g;
    }

    public final List<c> F() {
        return this.f29391h;
    }

    public final List<y> G() {
        return this.f29388e;
    }

    public final int H(String str) {
        List<y> list = this.f29388e;
        if (list == null || list.size() <= 0) {
            return -1;
        }
        for (y yVar : this.f29388e) {
            if (yVar.F().equalsIgnoreCase(str)) {
                return yVar.G();
            }
        }
        return -1;
    }

    public final int I() {
        return this.f29386c;
    }

    public final int M() {
        return this.f29387d;
    }

    public final boolean Z(String str) {
        List<y> list = this.f29388e;
        if (list != null) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                y yVar = this.f29388e.get(i14);
                if (yVar != null && yVar.F().equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a0() {
        return this.f29392i;
    }

    public final void c0(List<b> list) {
        this.f29389f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e0(w wVar) {
        this.f29390g = wVar;
    }

    public final void f0(List<y> list) {
        this.f29388e = list;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        List<Double> listC;
        this.f29384a = jSONObject.optLong("activityId");
        this.f29385b = jSONObject.optInt("measurementCount");
        this.f29386c = jSONObject.optInt("metricsCount");
        this.f29387d = jSONObject.optInt("totalMetricsCount");
        if (!jSONObject.isNull("metricDescriptors")) {
            this.f29388e = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("metricDescriptors");
            Parcelable.Creator<y> creator = y.CREATOR;
            int length = jSONArray.length();
            y[] yVarArr = new y[length];
            int length2 = jSONArray.length();
            for (int i14 = 0; i14 < length2; i14++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
                y yVar = new y();
                yVar.k(jSONObject2);
                yVarArr[i14] = yVar;
            }
            for (int i15 = 0; i15 < length; i15++) {
                this.f29388e.add(yVarArr[i15]);
            }
        }
        if (!jSONObject.isNull("activityDetailMetrics")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("activityDetailMetrics");
            Parcelable.Creator<b> creator2 = b.CREATOR;
            int length3 = jSONArray2.length();
            b[] bVarArr = new b[length3];
            for (int i16 = 0; i16 < jSONArray2.length(); i16++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i16);
                b bVar = new b();
                bVar.k(jSONObject3);
                bVarArr[i16] = bVar;
            }
            this.f29389f = new ArrayList(length3);
            for (int i17 = 0; i17 < length3; i17++) {
                this.f29389f.add(bVarArr[i17]);
            }
        }
        if (Z("directGrit") && Z("directFlow") && Z("directLatitude") && Z("directLongitude") && this.f29389f != null) {
            int iH = H("directLatitude");
            int iH2 = H("directLongitude");
            if (iH != -1 && iH2 != -1) {
                Iterator<b> it = this.f29389f.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    if (next != null && ((listC = next.C()) == null || Double.isNaN(listC.get(iH).doubleValue()) || Double.isNaN(listC.get(iH2).doubleValue()))) {
                        it.remove();
                    }
                }
            }
        }
        if (!jSONObject.isNull("geoPolylineDTO")) {
            w wVar = new w();
            this.f29390g = wVar;
            wVar.k(jSONObject.getJSONObject("geoPolylineDTO"));
        }
        if (!jSONObject.isNull("heartRateDTOs")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("heartRateDTOs");
            this.f29391h = new ArrayList(0);
            for (int i18 = 0; i18 < jSONArray3.length(); i18++) {
                this.f29391h.add(new c(jSONArray3.getJSONObject(i18)));
            }
        }
        this.f29392i = jSONObject.optBoolean("detailsAvailable");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityDetailsDTO [activityId=");
        sb3.append(this.f29384a);
        sb3.append(", measurementCount=");
        sb3.append(this.f29385b);
        sb3.append(", metricsCount=");
        sb3.append(this.f29386c);
        sb3.append(", metricDescriptors=");
        sb3.append(this.f29388e);
        sb3.append(", activityDetailMetrics=");
        sb3.append(this.f29389f);
        sb3.append(", geoPolylineDTO=");
        sb3.append(this.f29390g);
        sb3.append(", isDetailsAvailable=");
        return hb.a.k(sb3, this.f29392i, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f29384a);
        parcel.writeInt(this.f29385b);
        parcel.writeInt(this.f29386c);
        parcel.writeInt(this.f29387d);
        List<y> list = this.f29388e;
        if (list == null || list.isEmpty()) {
            parcel.writeInt(0);
        } else {
            int size = this.f29388e.size();
            parcel.writeInt(size);
            for (int i15 = 0; i15 < size; i15++) {
                parcel.writeParcelable(this.f29388e.get(i15), 0);
            }
        }
        List<b> list2 = this.f29389f;
        if (list2 == null || list2.isEmpty()) {
            parcel.writeInt(0);
        } else {
            int size2 = this.f29389f.size();
            parcel.writeInt(size2);
            for (int i16 = 0; i16 < size2; i16++) {
                parcel.writeParcelable(this.f29389f.get(i16), 0);
            }
        }
        parcel.writeParcelable(this.f29390g, 0);
        List<c> list3 = this.f29391h;
        if (list3 == null || list3.isEmpty()) {
            parcel.writeInt(0);
        } else {
            int size3 = this.f29391h.size();
            parcel.writeInt(size3);
            for (int i17 = 0; i17 < size3; i17++) {
                parcel.writeParcelable(this.f29391h.get(i17), 0);
            }
        }
        parcel.writeInt(this.f29392i ? 1 : 0);
    }

    public a() {
    }

    public a(long j8, int i14, int i15, List<y> list, List<b> list2, w wVar, List<c> list3, boolean z14) {
        this.f29384a = j8;
        this.f29385b = i14;
        this.f29386c = i15;
        this.f29388e = list;
        this.f29389f = list2;
        this.f29390g = wVar;
        this.f29391h = list3;
        this.f29392i = z14;
    }
}
