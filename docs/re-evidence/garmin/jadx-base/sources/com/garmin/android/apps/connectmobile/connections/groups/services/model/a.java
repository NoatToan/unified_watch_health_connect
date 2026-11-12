package com.garmin.android.apps.connectmobile.connections.groups.services.model;

import am.x0;
import am.z0;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class a extends s1 implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0515a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31610d;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.connections.groups.services.model.a$a, reason: collision with other inner class name */
    public class C0515a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Parcel parcel) {
        this.f31607a = parcel.readString();
        this.f31608b = parcel.readString();
        this.f31609c = parcel.readString();
        this.f31610d = parcel.readString();
    }

    public static a C(x0 x0Var) {
        a aVar = new a();
        aVar.f31608b = x0Var.f4358a;
        aVar.f31607a = String.valueOf(z0.n(x0Var));
        return aVar;
    }

    public static ArrayList D(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            arrayList.add(C((x0) list.get(i14)));
        }
        return arrayList;
    }

    public static ArrayList F(JSONArray jSONArray) throws JSONException {
        if (jSONArray.length() == 0) {
            return new ArrayList();
        }
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i14 = 0; i14 < length; i14++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i14);
            if (jSONObject != null) {
                a aVar = new a();
                aVar.k(jSONObject);
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public final JSONObject G() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("typeId", this.f31607a);
            jSONObject.put("typeKey", this.f31608b);
            jSONObject.put("parentTypeId", this.f31609c);
            jSONObject.put("sortOrder", this.f31610d);
            return jSONObject;
        } catch (JSONException e4) {
            i2.a(a2.CONNECTIONS, "ActivityFeedTypeDTO", "Error while converting to JSON object: " + e4.toString());
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            String str = this.f31607a;
            String str2 = aVar.f31607a;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.f31608b;
            String str4 = aVar.f31608b;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.f31609c;
            String str6 = aVar.f31609c;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            String str7 = this.f31610d;
            String str8 = aVar.f31610d;
            if (str7 != null) {
                return str7.equals(str8);
            }
            if (str8 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f31607a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31608b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f31609c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f31610d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f31607a = s1.u(jSONObject, "typeId");
            this.f31608b = s1.u(jSONObject, "typeKey");
            this.f31609c = s1.u(jSONObject, "parentTypeId");
            this.f31610d = s1.u(jSONObject, "sortOrder");
        }
    }

    public final String toString() {
        return "typeId: " + this.f31607a + ", typeKey: " + this.f31608b + ", parentTypeId: " + this.f31609c + ", sortOrder: " + this.f31610d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f31607a);
        parcel.writeString(this.f31608b);
        parcel.writeString(this.f31609c);
        parcel.writeString(this.f31610d);
    }

    public a() {
    }
}
