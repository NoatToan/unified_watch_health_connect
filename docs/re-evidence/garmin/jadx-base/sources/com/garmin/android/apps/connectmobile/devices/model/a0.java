package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fBC\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/a0;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "Lcom/garmin/android/apps/connectmobile/devices/model/b0;", "watchFaceDataType", "", "supportedOnTop", "supportedOnBottom", "topDefault", "bottomDefault", "<init>", "(Lcom/garmin/android/apps/connectmobile/devices/model/b0;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends s1 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f34088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f34089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f34090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f34091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f34092j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f34093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f34094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f34095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f34096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f34097e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        public final a0 createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            parcel.getClass();
            Boolean boolValueOf4 = null;
            b0 b0VarValueOf = parcel.readInt() == 0 ? null : b0.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new a0(b0VarValueOf, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final a0[] newArray(int i14) {
            return new a0[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
        f34088f = "dataType";
        f34089g = "supportedOnTop";
        f34090h = "supportedOnBottom";
        f34091i = "topDefault";
        f34092j = "bottomDefault";
    }

    public /* synthetic */ a0(b0 b0Var, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : b0Var, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? null : bool2, (i14 & 8) != 0 ? null : bool3, (i14 & 16) != 0 ? null : bool4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                String strOptString = jSONObject.optString(f34088f);
                strOptString.getClass();
                this.f34093a = b0.valueOf(strOptString);
                this.f34094b = Boolean.valueOf(jSONObject.optBoolean(f34089g));
                this.f34095c = Boolean.valueOf(jSONObject.optBoolean(f34090h));
                this.f34096d = Boolean.valueOf(jSONObject.optBoolean(f34091i));
                this.f34097e = Boolean.valueOf(jSONObject.optBoolean(f34092j));
            } catch (IllegalArgumentException unused) {
                this.f34093a = b0.NONE;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        b0 b0Var = this.f34093a;
        if (b0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(b0Var.name());
        }
        Boolean bool = this.f34094b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.f34095c;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.f34096d;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.f34097e;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/a0$a;", "", "<init>", "()V", "", "DATA_TYPE", "Ljava/lang/String;", "SUPPORTED_ON_TOP", "SUPPORTED_ON_BOTTOM", "TOP_DEFAULT", "BOTTOM_DEFAULT", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public a0(b0 b0Var, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.f34093a = b0Var;
        this.f34094b = bool;
        this.f34095c = bool2;
        this.f34096d = bool3;
        this.f34097e = bool4;
    }

    public a0() {
        this(null, null, null, null, null, 31, null);
    }
}
