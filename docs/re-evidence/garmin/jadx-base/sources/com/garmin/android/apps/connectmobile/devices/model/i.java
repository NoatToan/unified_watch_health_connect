package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/i;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "deviceAlarmDTO", "(Lcom/garmin/android/apps/connectmobile/devices/model/i;)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends s1 implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f34183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f34185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34186f;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/devices/model/i$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/i;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public i(Parcel parcel) {
        parcel.getClass();
        this.f34184d = "TONE";
        this.f34185e = -1L;
        this.f34186f = "UNCHANGED";
        this.f34181a = parcel.readString();
        this.f34182b = parcel.readInt();
        this.f34183c = parcel.createStringArrayList();
        this.f34184d = parcel.readString();
        this.f34185e = parcel.readLong();
        String string = parcel.readString();
        string.getClass();
        this.f34186f = string;
    }

    public final void C(c cVar) {
        cVar.getClass();
        this.f34181a = cVar.f34118a;
    }

    public final JSONObject D() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("alarmMode", this.f34181a);
            jSONObject.put("alarmTime", this.f34182b);
            if (this.f34183c != null) {
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = this.f34183c;
                arrayList.getClass();
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ArrayList arrayList2 = this.f34183c;
                    arrayList2.getClass();
                    jSONArray.put(arrayList2.get(i14));
                }
                jSONObject.put("alarmDays", jSONArray);
            }
            jSONObject.put("alarmSound", this.f34184d);
            long j8 = this.f34185e;
            if (j8 != -1) {
                jSONObject.put("alarmId", j8);
            }
            jSONObject.put("changeState", this.f34186f);
            return jSONObject;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.DEVICES, "DeviceAlarmDTO", "Error while converting to JSON object: " + e4);
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
        if (obj == null || !i.class.equals(obj.getClass())) {
            return false;
        }
        i iVar = (i) obj;
        return this.f34182b == iVar.f34182b && this.f34185e == iVar.f34185e && p005kotlin.jvm.internal.s.g(this.f34181a, iVar.f34181a) && p005kotlin.jvm.internal.s.g(this.f34183c, iVar.f34183c) && p005kotlin.jvm.internal.s.g(this.f34184d, iVar.f34184d) && p005kotlin.jvm.internal.s.g(this.f34186f, iVar.f34186f);
    }

    public final int hashCode() {
        return Objects.hash(this.f34181a, Integer.valueOf(this.f34182b), this.f34183c, this.f34184d, Long.valueOf(this.f34185e), this.f34186f);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        ArrayList arrayList;
        if (jSONObject != null) {
            this.f34181a = s1.u(jSONObject, "alarmMode");
            this.f34182b = jSONObject.optInt("alarmTime");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("alarmDays");
            if (jSONArrayOptJSONArray != null) {
                arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                int length = jSONArrayOptJSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i14));
                }
            } else {
                arrayList = null;
            }
            this.f34183c = arrayList;
            this.f34184d = s1.u(jSONObject, "alarmSound");
            this.f34185e = jSONObject.optLong("alarmId", -1L);
            String strOptString = jSONObject.optString("changeState", "UNCHANGED");
            strOptString.getClass();
            this.f34186f = strOptString;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f34181a);
        parcel.writeInt(this.f34182b);
        parcel.writeStringList(this.f34183c);
        parcel.writeString(this.f34184d);
        parcel.writeLong(this.f34185e);
        parcel.writeString(this.f34186f);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/i$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/i;", "CREATOR", "Landroid/os/Parcelable$Creator;", "ALARM_MODE", "ALARM_TIME", "ALARM_DAYS", "ALARM_SOUND", "ALARM_ID", "CHANGE_STATE", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public i(i iVar) {
        iVar.getClass();
        this.f34184d = "TONE";
        this.f34185e = -1L;
        this.f34186f = "UNCHANGED";
        this.f34181a = iVar.f34181a;
        this.f34182b = iVar.f34182b;
        ArrayList arrayList = iVar.f34183c;
        if (arrayList != null) {
            this.f34183c = new ArrayList(arrayList);
        }
        this.f34184d = iVar.f34184d;
        this.f34185e = iVar.f34185e;
        this.f34186f = iVar.f34186f;
    }

    public i() {
        this.f34184d = "TONE";
        this.f34185e = -1L;
        this.f34186f = "UNCHANGED";
    }
}
