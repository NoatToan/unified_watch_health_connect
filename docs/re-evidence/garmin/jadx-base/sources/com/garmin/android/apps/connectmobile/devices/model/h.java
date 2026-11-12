package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b+\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0099\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\"\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0014\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0014\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0014\u001a\u0004\b-\u0010\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\"\"\u0004\b \u0010$R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010\u0014¨\u00062"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/h;", "Landroid/os/Parcelable;", "", "activityTrackingEnabled", "bloodEfficiencySleepTrackingEnabled", "bloodEfficiencyAcclimationEnabled", "highHrAlertEnabled", "", "highHrAlertThreshold", "lowHrAlertEnabled", "lowHrAlertThreshold", "lowSpo2AlertEnabled", "moveAlertEnabled", "moveBarEnabled", "spo2Threshold", "pulseOxAcclimationEnabled", "pulseOxSleepTrackingEnabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZIZILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "u", "(Ljava/lang/Boolean;)V", "c", "d", "Z", "()Z", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "(Z)V", JWKParameterNames.RSA_EXPONENT, "I", "f", "()I", "z", "(I)V", "g", "A", "h", "C", IntegerTokenConverter.CONVERTER_KEY, "D", "j", "F", "getMoveBarEnabled", JWKParameterNames.OCT_KEY_VALUE, "o", "l", "m", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityTrackingEnabled")
    private Boolean activityTrackingEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bloodEfficiencySleepTrackingEnabled")
    private Boolean bloodEfficiencySleepTrackingEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bloodEfficiencyAcclimationEnabled")
    private Boolean bloodEfficiencyAcclimationEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("highHrAlertEnabled")
    private boolean highHrAlertEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("highHrAlertThreshold")
    private int highHrAlertThreshold;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowHrAlertEnabled")
    private boolean lowHrAlertEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowHrAlertThreshold")
    private int lowHrAlertThreshold;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowSpo2AlertEnabled")
    private Boolean lowSpo2AlertEnabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("moveAlertEnabled")
    private Boolean moveAlertEnabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("moveBarEnabled")
    private final Boolean moveBarEnabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spo2Threshold")
    private int spo2Threshold;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pulseOxAcclimationEnabled")
    private Boolean pulseOxAcclimationEnabled;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pulseOxSleepTrackingEnabled")
    private Boolean pulseOxSleepTrackingEnabled;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            boolean z14;
            boolean z15;
            boolean z16;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean bool;
            Boolean boolValueOf7;
            Boolean boolValueOf8;
            parcel.getClass();
            boolean z17 = true;
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
            if (parcel.readInt() == 0) {
                z17 = false;
            }
            Boolean bool2 = boolValueOf2;
            int i14 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z14 = false;
                z16 = true;
                z15 = true;
            } else {
                z14 = false;
                z15 = z17;
                z16 = false;
            }
            int i15 = parcel.readInt();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0 ? z15 : z14);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0 ? z15 : z14);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
                bool = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0 ? z15 : z14);
                bool = null;
            }
            Boolean bool3 = boolValueOf4;
            int i16 = parcel.readInt();
            if (parcel.readInt() == 0) {
                boolValueOf7 = bool;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0 ? z15 : z14);
            }
            if (parcel.readInt() == 0) {
                boolValueOf8 = bool;
            } else {
                if (parcel.readInt() != 0) {
                    z14 = z15;
                }
                boolValueOf8 = Boolean.valueOf(z14);
            }
            return new h(boolValueOf, bool2, boolValueOf3, z17, i14, z16, i15, bool3, boolValueOf5, boolValueOf6, i16, boolValueOf7, boolValueOf8);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ h(Boolean bool, Boolean bool2, Boolean bool3, boolean z14, int i14, boolean z15, int i15, Boolean bool4, Boolean bool5, Boolean bool6, int i16, Boolean bool7, Boolean bool8, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? null : bool, (i17 & 2) != 0 ? null : bool2, (i17 & 4) != 0 ? null : bool3, (i17 & 8) != 0 ? false : z14, (i17 & 16) != 0 ? 100 : i14, (i17 & 32) != 0 ? false : z15, (i17 & 64) != 0 ? 40 : i15, (i17 & 128) != 0 ? null : bool4, (i17 & 256) != 0 ? null : bool5, (i17 & 512) != 0 ? null : bool6, (i17 & 1024) == 0 ? i16 : 0, (i17 & 2048) != 0 ? null : bool7, (i17 & 4096) != 0 ? null : bool8);
    }

    public final void A(boolean z14) {
        this.lowHrAlertEnabled = z14;
    }

    public final void C(int i14) {
        this.lowHrAlertThreshold = i14;
    }

    public final void D(Boolean bool) {
        this.lowSpo2AlertEnabled = bool;
    }

    public final void F(Boolean bool) {
        this.moveAlertEnabled = bool;
    }

    public final void G(boolean z14) {
        if (this.bloodEfficiencyAcclimationEnabled != null) {
            this.bloodEfficiencyAcclimationEnabled = Boolean.valueOf(z14);
        } else {
            this.pulseOxAcclimationEnabled = Boolean.valueOf(z14);
        }
    }

    public final void H(Boolean bool) {
        if (this.bloodEfficiencySleepTrackingEnabled != null) {
            this.bloodEfficiencySleepTrackingEnabled = bool;
        } else {
            this.pulseOxSleepTrackingEnabled = bool;
        }
    }

    public final void I(int i14) {
        this.spo2Threshold = i14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getActivityTrackingEnabled() {
        return this.activityTrackingEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHighHrAlertEnabled() {
        return this.highHrAlertEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getHighHrAlertThreshold() {
        return this.highHrAlertThreshold;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getLowHrAlertEnabled() {
        return this.lowHrAlertEnabled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getLowHrAlertThreshold() {
        return this.lowHrAlertThreshold;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getLowSpo2AlertEnabled() {
        return this.lowSpo2AlertEnabled;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getMoveAlertEnabled() {
        return this.moveAlertEnabled;
    }

    public final Boolean k() {
        Boolean bool = this.bloodEfficiencyAcclimationEnabled;
        return bool == null ? this.pulseOxAcclimationEnabled : bool;
    }

    public final Boolean m() {
        Boolean bool = this.bloodEfficiencySleepTrackingEnabled;
        return bool == null ? this.pulseOxSleepTrackingEnabled : bool;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getSpo2Threshold() {
        return this.spo2Threshold;
    }

    public final boolean q() {
        return (this.bloodEfficiencyAcclimationEnabled == null && this.pulseOxAcclimationEnabled == null) ? false : true;
    }

    public final boolean r() {
        return (this.bloodEfficiencySleepTrackingEnabled == null && this.pulseOxSleepTrackingEnabled == null) ? false : true;
    }

    public final boolean s() {
        Boolean bool = this.activityTrackingEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean t() {
        Boolean bool = this.moveAlertEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void u(Boolean bool) {
        this.activityTrackingEnabled = bool;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Boolean bool = this.activityTrackingEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.bloodEfficiencySleepTrackingEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.bloodEfficiencyAcclimationEnabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        parcel.writeInt(this.highHrAlertEnabled ? 1 : 0);
        parcel.writeInt(this.highHrAlertThreshold);
        parcel.writeInt(this.lowHrAlertEnabled ? 1 : 0);
        parcel.writeInt(this.lowHrAlertThreshold);
        Boolean bool4 = this.lowSpo2AlertEnabled;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        Boolean bool5 = this.moveAlertEnabled;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool5);
        }
        Boolean bool6 = this.moveBarEnabled;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool6);
        }
        parcel.writeInt(this.spo2Threshold);
        Boolean bool7 = this.pulseOxAcclimationEnabled;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool7);
        }
        Boolean bool8 = this.pulseOxSleepTrackingEnabled;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool8);
        }
    }

    public final void y(boolean z14) {
        this.highHrAlertEnabled = z14;
    }

    public final void z(int i14) {
        this.highHrAlertThreshold = i14;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/h$a;", "", "<init>", "()V", "", "HR_HIGH_MINIMUM_THRESHOLD", "I", "HR_LOW_MINIMUM_THRESHOLD", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public h(Boolean bool, Boolean bool2, Boolean bool3, boolean z14, int i14, boolean z15, int i15, Boolean bool4, Boolean bool5, Boolean bool6, int i16, Boolean bool7, Boolean bool8) {
        this.activityTrackingEnabled = bool;
        this.bloodEfficiencySleepTrackingEnabled = bool2;
        this.bloodEfficiencyAcclimationEnabled = bool3;
        this.highHrAlertEnabled = z14;
        this.highHrAlertThreshold = i14;
        this.lowHrAlertEnabled = z15;
        this.lowHrAlertThreshold = i15;
        this.lowSpo2AlertEnabled = bool4;
        this.moveAlertEnabled = bool5;
        this.moveBarEnabled = bool6;
        this.spo2Threshold = i16;
        this.pulseOxAcclimationEnabled = bool7;
        this.pulseOxSleepTrackingEnabled = bool8;
    }

    public h() {
        this(null, null, null, false, 0, false, 0, null, null, null, 0, null, null, 8191, null);
    }
}
