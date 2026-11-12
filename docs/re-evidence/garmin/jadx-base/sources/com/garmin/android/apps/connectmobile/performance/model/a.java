package com.garmin.android.apps.connectmobile.performance.model;

import am.j;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.s1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.commons.text.StringSubstitutor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/a;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends s1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f39918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f39916e = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new C0734a();

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.model.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/performance/model/a$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/performance/model/a;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0734a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Parcel parcel) {
        parcel.getClass();
        this.f39917a = parcel.readString();
        this.f39918b = parcel.readString();
        this.f39919c = parcel.readString();
        this.f39920d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !a.class.equals(obj.getClass())) {
            return false;
        }
        return s.g(this.f39917a, ((a) obj).f39917a);
    }

    public final int hashCode() {
        return Objects.hash(this.f39917a);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f39917a = s1.u(jSONObject, "deviceId");
        this.f39918b = s1.u(jSONObject, "deviceName");
        String strU = s1.u(jSONObject, "imageUrl");
        this.f39919c = strU;
        if (strU == null) {
            this.f39919c = s1.u(jSONObject, "imageURL");
        }
        this.f39920d = jSONObject.optInt("category");
    }

    public final String toString() {
        return j.o(this.f39919c, StringSubstitutor.DEFAULT_VAR_END, p6.b.i("DeviceRecordDTO{deviceId='", this.f39917a, "', deviceName='", this.f39918b, "', imageUrl='"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f39917a);
        parcel.writeString(this.f39918b);
        parcel.writeString(this.f39919c);
        parcel.writeInt(this.f39920d);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/model/a$b;", "", "<init>", "()V", "", "DEVICE_ID_KEY", "Ljava/lang/String;", "DEVICE_NAME_KEY", "IMAGE_URL_KEY", "IMAGE_URL_KEY_2", "OTHER_DEVICE_KEY", "CATEGORY", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/performance/model/a;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(Context context, int i14, String str) {
            if (context == null) {
                return "";
            }
            if (TextUtils.isEmpty(str) || "other.device".equalsIgnoreCase(str)) {
                String string = context.getString(R.string.sensor_unknown);
                string.getClass();
                return string;
            }
            if (i14 != 1) {
                return str == null ? "" : str;
            }
            String string2 = context.getString(R.string.gcm_training_status_inactive_device, str);
            string2.getClass();
            return string2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
        public static List b(JSONArray jSONArray) throws JSONException {
            int length;
            ?? arrayList = j0.f134944a;
            if (jSONArray != null && (length = jSONArray.length()) > 0) {
                arrayList = new ArrayList(length);
                for (int i14 = 0; i14 < length; i14++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i14);
                    jSONObject.getClass();
                    a aVar = new a();
                    aVar.k(jSONObject);
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }

        private b() {
        }
    }

    public a() {
    }
}
