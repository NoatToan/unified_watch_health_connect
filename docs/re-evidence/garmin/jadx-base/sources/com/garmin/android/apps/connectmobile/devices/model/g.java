package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\tB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/g;", "Lcom/garmin/android/apps/connectmobile/s1;", "Lpd2/b;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends s1 implements pd2.b, Parcelable {
    public static final Parcelable.Creator<g> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f34167b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/devices/model/g$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/g;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public g(Parcel parcel) {
        parcel.getClass();
        this.f34166a = parcel.readString();
        List<String> list = this.f34167b;
        list.getClass();
        parcel.readStringList(list);
    }

    public final hg1.k C(int i14) {
        List<String> list = this.f34167b;
        if (i14 > -1) {
            list.getClass();
            if (i14 < list.size()) {
                String str = list.get(i14);
                hg1.k.f83699c.getClass();
                return hg1.k.a.a(str);
            }
        }
        vb.h.s(am.j.h(i14, "Invalid index: "));
        return null;
    }

    public final int D() {
        List<String> list = this.f34167b;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        List<String> list2 = this.f34167b;
        list2.getClass();
        return list2.size();
    }

    public final void F(int i14, hg1.k kVar) {
        if (kVar != null) {
            List<String> list = this.f34167b;
            if (i14 > -1) {
                list.getClass();
                if (i14 < list.size()) {
                    list.set(i14, kVar.f83712a);
                    return;
                }
            }
            vb.h.s(am.j.h(i14, "Invalid index: "));
        }
    }

    @Override // pd2.b
    public final boolean d(String str) {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // pd2.b
    public final String h() {
        try {
            JSONObject jSONObject = new JSONObject(this.f34166a);
            List<String> list = this.f34167b;
            if (list != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("displayFields", jSONArray);
            }
            String string = jSONObject.toString();
            string.getClass();
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f34166a = jSONObject.toString();
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.n(a2.DEVICES, "DeviceActivityOptionsPageDTO", "loadFromJson: json=" + jSONObject);
        this.f34167b = s1.y(jSONObject, "displayFields");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f34166a);
        parcel.writeStringList(this.f34167b);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/g$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "JSON_KEY_DISPLAY_FIELDS", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/g;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public g() {
    }
}
