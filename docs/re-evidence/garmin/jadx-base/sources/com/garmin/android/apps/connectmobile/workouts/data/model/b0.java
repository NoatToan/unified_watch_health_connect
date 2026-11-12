package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b0 extends s1 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f48116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f48118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f48119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<String> f48120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<String> f48121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<String> f48122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f48123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f48124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f48125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f48126k;

    public class a implements Parcelable.Creator<b0> {
        @Override // android.os.Parcelable.Creator
        public final b0 createFromParcel(Parcel parcel) {
            return new b0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b0[] newArray(int i14) {
            return new b0[i14];
        }
    }

    public b0(Parcel parcel) {
        this.f48116a = Long.valueOf(parcel.readLong());
        this.f48117b = parcel.readString();
        this.f48118c = parcel.createStringArrayList();
        this.f48119d = parcel.createStringArrayList();
        this.f48120e = parcel.createStringArrayList();
        this.f48121f = parcel.createStringArrayList();
        this.f48122g = parcel.createStringArrayList();
        int i14 = parcel.readInt();
        if (i14 >= 0) {
            this.f48123h = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                this.f48123h.add(Long.valueOf(parcel.readLong()));
            }
        }
        this.f48124i = parcel.readString();
        this.f48125j = parcel.readInt();
        this.f48126k = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        ArrayList arrayList;
        this.f48116a = Long.valueOf(jSONObject.optLong("ownerId"));
        this.f48117b = jSONObject.optString("ownerDisplayName");
        this.f48118c = s1.y(jSONObject, "trainingLevels");
        this.f48119d = s1.y(jSONObject, "trainingStatusList");
        this.f48120e = s1.y(jSONObject, "trainingTypes");
        this.f48121f = s1.y(jSONObject, "trainingSubTypes");
        this.f48122g = s1.y(jSONObject, "trainingVersions");
        if (jSONObject.isNull("allowedPrivacyList")) {
            arrayList = null;
        } else {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("allowedPrivacyList");
            int length = jSONArrayOptJSONArray.length();
            arrayList = new ArrayList();
            for (int i14 = 0; i14 < length; i14++) {
                arrayList.add(Long.valueOf(jSONArrayOptJSONArray.optLong(i14)));
            }
        }
        this.f48123h = arrayList;
        this.f48124i = jSONObject.optString("locale");
        this.f48125j = jSONObject.optInt(TtmlNode.START);
        this.f48126k = jSONObject.optInt(MapboxMap.QFE_LIMIT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f48116a.longValue());
        parcel.writeString(this.f48117b);
        parcel.writeStringList(this.f48118c);
        parcel.writeStringList(this.f48119d);
        parcel.writeStringList(this.f48120e);
        parcel.writeStringList(this.f48121f);
        parcel.writeStringList(this.f48122g);
        ArrayList arrayList = this.f48123h;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator it = this.f48123h.iterator();
            while (it.hasNext()) {
                parcel.writeLong(((Long) it.next()).longValue());
            }
        }
        parcel.writeString(this.f48124i);
        parcel.writeInt(this.f48125j);
        parcel.writeInt(this.f48126k);
    }

    public b0() {
    }
}
