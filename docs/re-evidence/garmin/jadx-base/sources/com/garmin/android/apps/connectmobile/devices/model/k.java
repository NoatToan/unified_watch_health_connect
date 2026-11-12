package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/k;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends s1 implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f34190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f34191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f34192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f34193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f34194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f34195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f34196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f34197h;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/devices/model/k$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/k;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public k(Parcel parcel) {
        Class cls = Boolean.TYPE;
        this.f34190a = (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null);
        this.f34191b = (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null);
        this.f34192c = (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null);
        this.f34193d = (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null);
        this.f34194e = (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null);
        this.f34195f = (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null);
        this.f34196g = (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null);
        this.f34197h = (Boolean) (parcel != null ? parcel.readValue(cls.getClassLoader()) : null);
    }

    public final JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("autoActivityDetectEnabled", this.f34190a);
            jSONObject.put("autoActivityStartEnabled", this.f34191b);
            jSONObject.put("runningEnabled", this.f34192c);
            jSONObject.put("cyclingEnabled", this.f34193d);
            jSONObject.put("swimmingEnabled", this.f34194e);
            jSONObject.put("walkingEnabled", this.f34195f);
            jSONObject.put("ellipticalEnabled", this.f34196g);
            jSONObject.put("drivingEnabled", this.f34197h);
            return jSONObject;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, k.class.getSimpleName(), "Error while converting to JSON object: " + e4);
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f34190a = s1.o(jSONObject, "autoActivityDetectEnabled");
            this.f34191b = s1.o(jSONObject, "autoActivityStartEnabled");
            this.f34192c = s1.o(jSONObject, "runningEnabled");
            this.f34193d = s1.o(jSONObject, "cyclingEnabled");
            this.f34194e = s1.o(jSONObject, "swimmingEnabled");
            this.f34195f = s1.o(jSONObject, "walkingEnabled");
            this.f34196g = s1.o(jSONObject, "ellipticalEnabled");
            this.f34197h = s1.o(jSONObject, "drivingEnabled");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeValue(this.f34190a);
        parcel.writeValue(this.f34191b);
        parcel.writeValue(this.f34192c);
        parcel.writeValue(this.f34193d);
        parcel.writeValue(this.f34194e);
        parcel.writeValue(this.f34195f);
        parcel.writeValue(this.f34196g);
        parcel.writeValue(this.f34197h);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/k$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/devices/model/k;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "AUTO_ACTIVITY_DETECT_ENABLED", "Ljava/lang/String;", "AUTO_ACTIVITY_START_ENABLED", "RUNNING_ENABLED", "CYCLING_ENABLED", "SWIMMING_ENABLED", "WALKING_ENABLED", "ELLIPTICAL_ENABLED", "DRIVING_ENABLED", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public k() {
    }
}
