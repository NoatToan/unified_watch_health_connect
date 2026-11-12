package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/z;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends s1 implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<y> f34343c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/devices/model/z$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/z;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<z> {
        @Override // android.os.Parcelable.Creator
        public final z createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new z(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final z[] newArray(int i14) {
            return new z[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public z(Parcel parcel) {
        parcel.getClass();
        this.f34341a = parcel.readString();
        Boolean bool = (Boolean) parcel.readValue(Boolean.TYPE.getClassLoader());
        bool.getClass();
        this.f34342b = bool.booleanValue();
        this.f34343c = parcel.createTypedArrayList(y.CREATOR);
    }

    public final y C(String str) {
        str.getClass();
        List<y> list = this.f34343c;
        if (list == null) {
            return null;
        }
        list.getClass();
        for (y yVar : list) {
            if (str.equals(yVar.f34328a)) {
                return yVar;
            }
        }
        return null;
    }

    public final JSONObject D() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("screenListId", this.f34341a);
            jSONObject.put("defaultToLast", this.f34342b);
            JSONArray jSONArray = new JSONArray();
            List<y> list = this.f34343c;
            if (list != null) {
                Iterator<y> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().C());
                }
            }
            jSONObject.put("screens", jSONArray);
            return jSONObject;
        } catch (JSONException e4) {
            sn.a.s("Error converting to JSON: ", e4.getMessage(), i2.f36769a, a2.DEVICES, "ScreenListDTO");
            return jSONObject;
        }
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
        this.f34341a = jSONObject.optString("screenListId");
        this.f34342b = jSONObject.optBoolean("defaultToLast", false);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("screens");
        if (jSONArrayOptJSONArray != null) {
            this.f34343c = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                y yVar = new y();
                yVar.k(jSONArrayOptJSONArray.getJSONObject(i14));
                List<y> list = this.f34343c;
                if (list != null) {
                    list.add(yVar);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f34341a);
        parcel.writeValue(Boolean.valueOf(this.f34342b));
        parcel.writeTypedList(this.f34343c);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/z$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/z;", "CREATOR", "Landroid/os/Parcelable$Creator;", "SCREEN_LIST_ID", "SCREENS", "DEFAULT_TO_LAST", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public z() {
    }
}
