package bm2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.device.pairing.devices.PrimaryApp;
import com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class c implements Parcelable, Comparable<c>, f, IRegisteredDeviceDto {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public boolean A;
    public boolean A1;
    public boolean B;
    public boolean B1;
    public int C;
    public boolean C1;
    public int D;
    public boolean D1;
    public boolean E;
    public boolean E1;
    public String F;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public String O0;
    public boolean P;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public boolean X;
    public boolean X0;
    public boolean Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18897a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f18898a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18899b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f18900b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18901c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f18902c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18903d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f18904d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18905e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f18906e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f18907f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f18908f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f18909g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f18910g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f18911h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f18912h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f18913i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f18914i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f18915j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f18916j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f18917k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f18918k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f18919k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18920l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f18921l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18922m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f18923m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18924n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public boolean f18925n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f18926o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f18927o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18928p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public String f18929p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18930q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public PrimaryApp f18931q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f18932r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public ArrayList f18933r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public boolean f18934s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f18935t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public boolean f18936t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public boolean f18937u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f18938v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public long f18939v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18940w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public boolean f18941w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f18942x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public boolean f18943x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f18944y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public boolean f18945y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f18946z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public boolean f18947z1;

    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    private c(Parcel parcel) {
        this.f18942x = -1L;
        this.f18933r1 = new ArrayList();
        this.f18897a = parcel.readString();
        this.f18899b = parcel.readString();
        this.f18901c = parcel.readString();
        this.f18903d = parcel.readString();
        this.f18905e = parcel.readString();
        this.f18907f = parcel.readString();
        this.f18909g = parcel.readString();
        this.f18911h = parcel.readString();
        this.f18913i = parcel.readString();
        this.f18930q = parcel.readInt();
        this.f18935t = parcel.readString();
        this.f18938v = parcel.readString();
        this.F = parcel.readString();
        this.f18942x = parcel.readLong();
        this.f18932r = parcel.createStringArray();
        this.O0 = parcel.readString();
        this.f18915j = parcel.readString();
        this.f18917k = parcel.readString();
        this.f18920l = parcel.readInt() != 0;
        this.f18922m = parcel.readInt() != 0;
        this.f18924n = parcel.readInt() != 0;
        this.f18926o = parcel.readInt() != 0;
        this.f18928p = parcel.readInt() != 0;
        this.f18940w = parcel.readInt() != 0;
        this.f18944y = parcel.readInt() != 0;
        this.f18946z = parcel.readInt() != 0;
        this.A = parcel.readInt() != 0;
        this.B = parcel.readInt() != 0;
        this.M0 = parcel.readInt() != 0;
        this.N0 = parcel.readInt() != 0;
        this.f18898a1 = parcel.readInt() != 0;
        this.f18900b1 = parcel.readInt() != 0;
        this.f18902c1 = parcel.readInt() != 0;
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.f18939v1 = parcel.readLong();
        this.P0 = parcel.readInt() != 0;
        this.E = parcel.readInt() != 0;
        this.Q0 = parcel.readInt() != 0;
        this.R0 = parcel.readInt() != 0;
        this.S0 = parcel.readInt() != 0;
        this.I = parcel.readInt() != 0;
        this.P = parcel.readInt() != 0;
        this.T = parcel.readInt() != 0;
        this.X = parcel.readInt() != 0;
        this.Y = parcel.readInt() != 0;
        this.Z = parcel.readInt() != 0;
        this.f18918k0 = parcel.readInt() != 0;
        this.H0 = parcel.readInt() != 0;
        this.I0 = parcel.readInt() != 0;
        this.J0 = parcel.readInt() != 0;
        this.K0 = parcel.readInt() != 0;
        this.L0 = parcel.readInt() != 0;
        this.T0 = parcel.readInt() != 0;
        this.U0 = parcel.readInt() != 0;
        this.V0 = parcel.readInt() != 0;
        this.W0 = parcel.readInt() != 0;
        this.Y0 = parcel.readInt() != 0;
        this.Z0 = parcel.readInt() != 0;
        this.f18904d1 = parcel.readInt() != 0;
        this.f18906e1 = parcel.readInt() != 0;
        this.f18908f1 = parcel.readInt() != 0;
        this.f18910g1 = parcel.readInt() != 0;
        this.f18912h1 = parcel.readInt() != 0;
        this.f18914i1 = parcel.readInt() != 0;
        this.f18916j1 = parcel.readInt() != 0;
        this.f18919k1 = parcel.readInt() != 0;
        this.f18921l1 = parcel.readInt() != 0;
        this.f18923m1 = parcel.readInt() != 0;
        this.f18925n1 = parcel.readInt() != 0;
        this.f18927o1 = parcel.readInt() != 0;
        this.f18929p1 = parcel.readString();
        this.f18931q1 = (PrimaryApp) parcel.readSerializable();
        ArrayList arrayList = new ArrayList();
        this.f18933r1 = arrayList;
        parcel.readTypedList(arrayList, PrimaryApp.CREATOR);
        this.f18934s1 = parcel.readInt() != 0;
        this.f18936t1 = parcel.readInt() != 0;
        this.f18937u1 = parcel.readInt() != 0;
        this.f18941w1 = parcel.readInt() != 0;
        this.f18943x1 = parcel.readInt() != 0;
        this.f18945y1 = parcel.readInt() != 0;
        this.f18947z1 = parcel.readInt() != 0;
        this.A1 = parcel.readInt() != 0;
        this.B1 = parcel.readInt() != 0;
        this.C1 = parcel.readInt() != 0;
        this.D1 = parcel.readInt() != 0;
        this.E1 = parcel.readInt() != 0;
    }

    public static c d(JSONObject jSONObject) throws JSONException {
        c cVar = new c();
        if (!jSONObject.has("applicationKey") || !jSONObject.has("partNumber")) {
            return null;
        }
        cVar.f18897a = jSONObject.optString("applicationKey");
        cVar.f18899b = jSONObject.optString("partNumber");
        cVar.f18915j = jSONObject.optString("deviceSettingsFile");
        cVar.f18917k = !jSONObject.isNull("gcmSettingsFile") ? jSONObject.optString("gcmSettingsFile") : jSONObject.optString("deviceSettingsFile");
        String strOptString = jSONObject.optString("productDisplayName", "???");
        if (strOptString.startsWith("Garmin ")) {
            cVar.f18901c = strOptString.replaceFirst("Garmin ", "");
        } else {
            cVar.f18901c = strOptString;
        }
        if (!jSONObject.isNull("productSku")) {
            cVar.f18903d = jSONObject.getString("productSku");
        }
        if (!jSONObject.isNull("serialNumber")) {
            cVar.f18905e = jSONObject.getString("serialNumber");
        }
        if (!jSONObject.isNull("currentFirmwareVersion")) {
            cVar.f18907f = jSONObject.getString("currentFirmwareVersion");
        }
        if (!jSONObject.isNull("imageUrl")) {
            cVar.f18909g = jSONObject.getString("imageUrl");
        }
        if (!jSONObject.isNull("deviceEmbedVideoLink")) {
            cVar.f18911h = jSONObject.getString("deviceEmbedVideoLink");
        }
        if (!jSONObject.isNull("deviceVideoPageLink")) {
            cVar.f18913i = jSONObject.getString("deviceVideoPageLink");
        }
        cVar.f18920l = jSONObject.optBoolean("wifi");
        cVar.f18922m = jSONObject.optBoolean("bluetoothClassicDevice");
        cVar.f18924n = jSONObject.optBoolean("bluetoothLowEnergyDevice");
        cVar.f18926o = jSONObject.optBoolean("wellness");
        cVar.f18928p = jSONObject.optBoolean("primary");
        cVar.f18930q = jSONObject.optInt("minGCMAndroidVersion");
        cVar.f18940w = jSONObject.optBoolean("segmentCapable");
        cVar.f18944y = jSONObject.optBoolean("hybrid");
        cVar.f18946z = jSONObject.optBoolean("intensityMinutesGoalCapable");
        cVar.A = jSONObject.optBoolean("floorsClimbedGoalCapable");
        cVar.B = jSONObject.optBoolean("moderateIntensityMinutesGoalCapable");
        cVar.C = jSONObject.optInt("displayOrder");
        cVar.D = jSONObject.optInt("golfDisplayOrder");
        JSONArray jSONArray = jSONObject.getJSONArray("deviceCategories");
        cVar.f18932r = new String[jSONArray.length()];
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            cVar.f18932r[i14] = jSONArray.getString(i14);
        }
        if (!jSONObject.isNull("includeCountries")) {
            cVar.f18935t = jSONObject.getString("includeCountries");
        }
        if (!jSONObject.isNull("excludeCountries")) {
            cVar.f18938v = jSONObject.getString("excludeCountries");
        }
        if (!jSONObject.isNull("deviceId")) {
            cVar.f18942x = jSONObject.getLong("deviceId");
        }
        cVar.f18939v1 = jSONObject.optLong("fitProductNumber");
        cVar.P0 = jSONObject.optBoolean("gcj02CourseCapable");
        if (jSONObject.optJSONArray("supportedHrZones") != null) {
            cVar.E = jSONObject.optJSONArray("supportedHrZones").length() > 0;
        } else {
            cVar.E = false;
        }
        cVar.Q0 = jSONObject.optBoolean("courseCapable");
        cVar.R0 = jSONObject.optBoolean("workoutCapable");
        cVar.S0 = jSONObject.optBoolean("trainingPlanCapable");
        cVar.F = jSONObject.optString("displayName");
        cVar.I = jSONObject.optBoolean("scheduleCapable");
        cVar.P = jSONObject.optBoolean("customWorkoutCapable");
        cVar.T = jSONObject.optBoolean("swimWorkoutCapable");
        cVar.X = jSONObject.optBoolean("runningWorkoutCapable");
        cVar.Y = jSONObject.optBoolean("cyclingWorkoutCapable");
        cVar.Z = jSONObject.optBoolean("atpWorkoutCapable");
        cVar.f18918k0 = jSONObject.optBoolean("strengthWorkoutCapable");
        cVar.H0 = jSONObject.optBoolean("cardioWorkoutCapable");
        cVar.M0 = jSONObject.optBoolean("customIntensityMinutesCapable");
        cVar.O0 = jSONObject.optString("minCustomIntensityMinutesVersion");
        cVar.N0 = !jSONObject.isNull("customIntensityMinutesCapable");
        cVar.I0 = jSONObject.optBoolean("primaryActivityTrackerIndicator");
        cVar.J0 = jSONObject.optBoolean("primaryActivityTrackerSettingCapable");
        cVar.K0 = jSONObject.optBoolean("primaryTrainingCapable");
        cVar.L0 = jSONObject.optBoolean("lhaBackupCapable");
        cVar.X0 = jSONObject.optBoolean("nfcCapable");
        cVar.T0 = jSONObject.optBoolean("solarPanelUtilizationCapable");
        cVar.U0 = jSONObject.optBoolean("isPrimaryUser", true);
        cVar.V0 = jSONObject.optBoolean("supportsSecondaryUsers");
        cVar.W0 = jSONObject.optBoolean("appSupport");
        cVar.Y0 = jSONObject.optBoolean("lowHrAlertCapable");
        cVar.Z0 = jSONObject.optBoolean("abnormalHeartRateAlertCapable");
        cVar.f18898a1 = jSONObject.optBoolean("spectatorMessagingCapable");
        cVar.f18900b1 = jSONObject.optBoolean("trainingStatusCapable");
        cVar.f18902c1 = jSONObject.optBoolean("trainingStatusPauseCapable");
        cVar.f18904d1 = jSONObject.optBoolean("measurementUnitSettingCapable");
        cVar.f18906e1 = jSONObject.optBoolean("powerCurveCapable");
        cVar.f18908f1 = jSONObject.optBoolean("secondaryWorkoutStepTargetCapable");
        cVar.f18910g1 = jSONObject.optBoolean("assistancePlusCapable");
        cVar.f18912h1 = jSONObject.optBoolean("emergencyCallingCapable");
        cVar.f18914i1 = jSONObject.optBoolean("solarChargeCapable");
        cVar.f18916j1 = jSONObject.optBoolean("hasPowerButton");
        cVar.f18919k1 = jSONObject.optBoolean("diveAppSyncCapable");
        cVar.f18921l1 = jSONObject.optBoolean("dayOfWeekSleepWindowCapable");
        cVar.f18923m1 = jSONObject.optBoolean("golfAppSyncCapable");
        cVar.f18925n1 = jSONObject.optBoolean("golfAppPairingCapable");
        cVar.f18927o1 = jSONObject.optBoolean("golfLiveScoringCapable");
        if (!jSONObject.isNull("deviceTags")) {
            cVar.f18929p1 = jSONObject.getString("deviceTags");
        }
        cVar.f18931q1 = PrimaryApp.fromKey(jSONObject.optString("primaryApplication"));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("incompatibleApplications");
        if (jSONArrayOptJSONArray != null) {
            for (int i15 = 0; i15 < jSONArrayOptJSONArray.length(); i15++) {
                PrimaryApp primaryAppFromKey = PrimaryApp.fromKey(jSONArrayOptJSONArray.optString(i15));
                if (primaryAppFromKey != PrimaryApp.UNSPECIFIED) {
                    arrayList.add(primaryAppFromKey);
                }
            }
        }
        cVar.f18933r1 = arrayList;
        cVar.f18934s1 = jSONObject.optBoolean("wearableBackupRestoreCapable");
        cVar.f18936t1 = jSONObject.optBoolean("hillScoreAndEnduranceScoreCapable");
        cVar.f18937u1 = jSONObject.optBoolean("cyclingComputerBackupRestoreCapable");
        cVar.f18941w1 = jSONObject.optBoolean("acuteChronicWorkloadRatioCapable");
        cVar.f18943x1 = jSONObject.optBoolean("bodyBatteryTrueUpCapable");
        cVar.f18945y1 = jSONObject.optBoolean("startActivityCapable");
        cVar.f18947z1 = jSONObject.optBoolean("pendingActivityCapable");
        cVar.A1 = jSONObject.optBoolean("fixedLocationCapable");
        cVar.B1 = jSONObject.optBoolean("screenlessDeviceCapable");
        cVar.C1 = jSONObject.optBoolean("startStopWorkoutCapable");
        cVar.D1 = jSONObject.optBoolean("fallDetectionCapable");
        cVar.E1 = jSONObject.optBoolean("inReachServicesDirectActivationCapable");
        return cVar;
    }

    public static c[] f(JSONArray jSONArray) throws JSONException {
        c[] cVarArr = new c[jSONArray.length()];
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            c cVarD = d(jSONArray.getJSONObject(i14));
            if (cVarD == null) {
                return null;
            }
            cVarArr[i14] = cVarD;
        }
        return cVarArr;
    }

    @Override // bm2.f
    public final void b(long j8) {
        this.f18942x = j8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        return this.f18901c.toLowerCase().compareTo(cVar.f18901c.toLowerCase());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean g() {
        if (this.I) {
            return this.R0 || this.P || this.T || this.X || this.Y || this.Z || this.f18918k0 || this.H0;
        }
        return false;
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final String getApplicationKey() {
        return this.f18897a;
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final long getDeviceId() {
        return this.f18942x;
    }

    @Override // com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final String getDisplayName() {
        return this.F;
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final String getImageUrl() {
        return this.f18909g;
    }

    @Override // com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final String getPartNumber() {
        return this.f18899b;
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final String getPartNumberPartial() {
        String str = this.f18899b;
        if (str != null) {
            int length = str.length();
            String str2 = this.f18899b;
            if (length == 4) {
                return str2;
            }
            try {
                int iIndexOf = str2.indexOf("-", 0);
                return this.f18899b.substring(iIndexOf + 2, iIndexOf + 6);
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        return null;
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final String getProductDisplayName() {
        String str = this.f18901c;
        if (str == null) {
            return null;
        }
        return (str.startsWith("Garmin ") || str.startsWith("GARMIN ")) ? str.substring(7, str.length()).trim() : str;
    }

    public final boolean h() {
        String[] strArr = this.f18932r;
        boolean z14 = false;
        if (strArr != null && strArr.length > 0) {
            String strName = b.WELLNESS.name();
            for (String str : this.f18932r) {
                if (strName.equalsIgnoreCase(str)) {
                    z14 = true;
                    break;
                }
            }
        }
        if (getPartNumberPartial() == null) {
            return true;
        }
        return z14;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeviceDTO:\ndeviceId:");
        sb3.append(this.f18942x);
        sb3.append("\napplicationKey:");
        String str = this.f18897a;
        String str2 = BuildConfig.TRAVIS;
        if (str == null) {
            str = BuildConfig.TRAVIS;
        }
        sb3.append(str);
        sb3.append("\npartNumber:");
        String str3 = this.f18899b;
        if (str3 == null) {
            str3 = BuildConfig.TRAVIS;
        }
        sb3.append(str3);
        sb3.append("\nproductDisplayName:");
        String str4 = this.f18901c;
        if (str4 == null) {
            str4 = BuildConfig.TRAVIS;
        }
        sb3.append(str4);
        sb3.append("\nproductSku:");
        String str5 = this.f18903d;
        if (str5 == null) {
            str5 = BuildConfig.TRAVIS;
        }
        sb3.append(str5);
        sb3.append("\nserialNumber:");
        String str6 = this.f18905e;
        if (str6 == null) {
            str6 = BuildConfig.TRAVIS;
        }
        sb3.append(str6);
        sb3.append("\ncurrentFirmwareVersion:");
        String str7 = this.f18907f;
        if (str7 == null) {
            str7 = BuildConfig.TRAVIS;
        }
        sb3.append(str7);
        sb3.append("\nimageUrl:");
        String str8 = this.f18909g;
        if (str8 == null) {
            str8 = BuildConfig.TRAVIS;
        }
        sb3.append(str8);
        sb3.append("\ndeviceEmbedVideoLink:");
        String str9 = this.f18911h;
        if (str9 == null) {
            str9 = BuildConfig.TRAVIS;
        }
        sb3.append(str9);
        sb3.append("\ndeviceVideoPageLink:");
        String str10 = this.f18913i;
        if (str10 == null) {
            str10 = BuildConfig.TRAVIS;
        }
        sb3.append(str10);
        sb3.append("\nwifi:");
        sb3.append(this.f18920l);
        sb3.append("\nbluetoothClassic:");
        sb3.append(this.f18922m);
        sb3.append("\nble:");
        sb3.append(this.f18924n);
        sb3.append("\nsegmentCapable:");
        sb3.append(this.f18940w);
        sb3.append("\nwellness (do not use!):");
        sb3.append(this.f18926o);
        sb3.append("\nisWellnessDevice():");
        sb3.append(h());
        sb3.append("\nprimary:");
        sb3.append(this.f18928p);
        sb3.append("\nminGCMVersion:");
        sb3.append(this.f18930q);
        sb3.append("\ndeviceCategories:");
        String[] strArr = this.f18932r;
        sb3.append(strArr != null ? Arrays.toString(strArr) : BuildConfig.TRAVIS);
        sb3.append("\nincludeCountries:");
        String str11 = this.f18935t;
        if (str11 == null) {
            str11 = BuildConfig.TRAVIS;
        }
        sb3.append(str11);
        sb3.append("\nexcludeCountries:");
        String str12 = this.f18938v;
        if (str12 != null) {
            str2 = str12;
        }
        sb3.append(str2);
        sb3.append("\ndisplayOrder:");
        sb3.append(this.C);
        sb3.append("\ngolfDisplayOrder:");
        sb3.append(this.D);
        sb3.append("\nfitProductNumber:");
        sb3.append(this.f18939v1);
        sb3.append("\ngcj02CourseCapable:");
        sb3.append(this.P0);
        sb3.append("\nsupportedHRZones:");
        sb3.append(this.E);
        sb3.append("\nactivityCourseCapable:");
        sb3.append(this.Q0);
        sb3.append("\ncustomIntensityMinutesCapable:");
        sb3.append(this.M0);
        sb3.append("\nminCustomIntensityMinutesVersion:");
        sb3.append(this.O0);
        sb3.append("\nworkoutCapable:");
        sb3.append(this.R0);
        sb3.append("\nscheduleCapable:");
        sb3.append(this.I);
        sb3.append("\ncustomWorkoutCapable:");
        sb3.append(this.P);
        sb3.append("\nswimWorkoutCapable:");
        sb3.append(this.T);
        sb3.append("\nrunningWorkoutCapable:");
        sb3.append(this.X);
        sb3.append("\ncyclingWorkoutCapable:");
        sb3.append(this.Y);
        sb3.append("\natpWorkoutCapable:");
        sb3.append(this.Z);
        sb3.append("\nstrengthWorkoutCapable:");
        sb3.append(this.f18918k0);
        sb3.append("\ncardioWorkoutCapable:");
        sb3.append(this.H0);
        sb3.append("\nprimaryActivityTrackerIndicator:");
        sb3.append(this.I0);
        sb3.append("\nprimaryActivityTrackerSettingCapable:");
        sb3.append(this.J0);
        sb3.append("\nprimaryTrainingCapable:");
        sb3.append(this.K0);
        sb3.append("\nlhaBackupCapable:");
        sb3.append(this.L0);
        sb3.append("\nnfcCapable:");
        sb3.append(this.X0);
        sb3.append("\nsolarPanelUtilizationCapable:");
        sb3.append(this.T0);
        sb3.append("\nisPrimaryUser:");
        sb3.append(this.U0);
        sb3.append("\nsupportsSecondaryUsers:");
        sb3.append(this.V0);
        sb3.append("\nsupportsConnectIq:");
        sb3.append(this.W0);
        sb3.append("\nisLowHRAlarmCapable:");
        sb3.append(this.Y0);
        sb3.append("\nisHighHrAlertCapable:");
        sb3.append(this.Z0);
        sb3.append("\ndeviceSettingsFile:");
        sb3.append(this.f18915j);
        sb3.append("\ngcmSettingsFile:");
        sb3.append(this.f18917k);
        sb3.append("\nspectatorMessagingCapable");
        sb3.append(this.f18898a1);
        sb3.append("\ntrainingStatusCapable:");
        sb3.append(this.f18900b1);
        sb3.append("\ntrainingStatusPauseCapable:");
        sb3.append(this.f18902c1);
        sb3.append("\nmeasurementUnitSettingCapable:");
        sb3.append(this.f18904d1);
        sb3.append("\npowerCurveCapable:");
        sb3.append(this.f18906e1);
        sb3.append("\nsecondaryWorkoutStepTargetCapable:");
        sb3.append(this.f18908f1);
        sb3.append("\nassistancePlusCapable:");
        sb3.append(this.f18910g1);
        sb3.append("\nemergencyCallingCapable:");
        sb3.append(this.f18912h1);
        sb3.append("\nsolarChargeCapable:");
        sb3.append(this.f18914i1);
        sb3.append("\nhasPowerButton:");
        sb3.append(this.f18916j1);
        sb3.append("\ndiveAppSyncCapable:");
        sb3.append(this.f18919k1);
        sb3.append("\ndayOfWeekSleepWindowCapable:");
        sb3.append(this.f18921l1);
        sb3.append("\ngolfAppSyncCapable:");
        sb3.append(this.f18923m1);
        sb3.append("\ngolfAppPairingCapable:");
        sb3.append(this.f18925n1);
        sb3.append("\ngolfLiveScoringCapable:");
        sb3.append(this.f18927o1);
        sb3.append("\ndeviceTags");
        sb3.append(this.f18929p1);
        sb3.append("\nprimaryApp:");
        sb3.append(this.f18931q1);
        sb3.append("\nincompatibleApps: ");
        sb3.append(this.f18933r1);
        sb3.append("\nwearableBackupRestoreCapable:");
        sb3.append(this.f18934s1);
        sb3.append("\nhillScoreEnduranceScoreCapable:");
        sb3.append(this.f18936t1);
        sb3.append("\ncyclingComputerBackupRestoreCapable:");
        sb3.append(this.f18937u1);
        sb3.append("\nacuteChronicWorkloadRatioCapable:");
        sb3.append(this.f18941w1);
        sb3.append("\nbodyBatteryTrueUpCapable:");
        sb3.append(this.f18943x1);
        sb3.append("\nstartActivityCapable:");
        sb3.append(this.f18945y1);
        sb3.append("\npendingActivityCapable");
        sb3.append(this.f18947z1);
        sb3.append("\nfixedLocationCapable");
        sb3.append(this.A1);
        sb3.append("\nscreenlessDeviceCapable");
        sb3.append(this.B1);
        sb3.append("\nstartStopWorkoutCapable");
        sb3.append(this.C1);
        sb3.append("\nfallDetectionCapable");
        sb3.append(this.D1);
        sb3.append("\ninReachDirectActivationCapable");
        return hb.a.k(sb3, this.E1, "\n");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f18897a);
        parcel.writeString(this.f18899b);
        parcel.writeString(this.f18901c);
        parcel.writeString(this.f18903d);
        parcel.writeString(this.f18905e);
        parcel.writeString(this.f18907f);
        parcel.writeString(this.f18909g);
        parcel.writeString(this.f18911h);
        parcel.writeString(this.f18913i);
        parcel.writeInt(this.f18930q);
        parcel.writeString(this.f18935t);
        parcel.writeString(this.f18938v);
        parcel.writeString(this.F);
        parcel.writeLong(this.f18942x);
        parcel.writeStringArray(this.f18932r);
        parcel.writeString(this.O0);
        parcel.writeString(this.f18915j);
        parcel.writeString(this.f18917k);
        parcel.writeInt(this.f18920l ? 1 : 0);
        parcel.writeInt(this.f18922m ? 1 : 0);
        parcel.writeInt(this.f18924n ? 1 : 0);
        parcel.writeInt(this.f18926o ? 1 : 0);
        parcel.writeInt(this.f18928p ? 1 : 0);
        parcel.writeInt(this.f18940w ? 1 : 0);
        parcel.writeInt(this.f18944y ? 1 : 0);
        parcel.writeInt(this.f18946z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.M0 ? 1 : 0);
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeInt(this.f18898a1 ? 1 : 0);
        parcel.writeInt(this.f18900b1 ? 1 : 0);
        parcel.writeInt(this.f18902c1 ? 1 : 0);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeLong(this.f18939v1);
        parcel.writeInt(this.P0 ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.Q0 ? 1 : 0);
        parcel.writeInt(this.R0 ? 1 : 0);
        parcel.writeInt(this.S0 ? 1 : 0);
        parcel.writeInt(this.I ? 1 : 0);
        parcel.writeInt(this.P ? 1 : 0);
        parcel.writeInt(this.T ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.f18918k0 ? 1 : 0);
        parcel.writeInt(this.H0 ? 1 : 0);
        parcel.writeInt(this.I0 ? 1 : 0);
        parcel.writeInt(this.J0 ? 1 : 0);
        parcel.writeInt(this.K0 ? 1 : 0);
        parcel.writeInt(this.L0 ? 1 : 0);
        parcel.writeInt(this.T0 ? 1 : 0);
        parcel.writeInt(this.U0 ? 1 : 0);
        parcel.writeInt(this.V0 ? 1 : 0);
        parcel.writeInt(this.W0 ? 1 : 0);
        parcel.writeInt(this.Y0 ? 1 : 0);
        parcel.writeInt(this.Z0 ? 1 : 0);
        parcel.writeInt(this.f18904d1 ? 1 : 0);
        parcel.writeInt(this.f18906e1 ? 1 : 0);
        parcel.writeInt(this.f18908f1 ? 1 : 0);
        parcel.writeInt(this.f18910g1 ? 1 : 0);
        parcel.writeInt(this.f18912h1 ? 1 : 0);
        parcel.writeInt(this.f18914i1 ? 1 : 0);
        parcel.writeInt(this.f18916j1 ? 1 : 0);
        parcel.writeInt(this.f18919k1 ? 1 : 0);
        parcel.writeInt(this.f18921l1 ? 1 : 0);
        parcel.writeInt(this.f18923m1 ? 1 : 0);
        parcel.writeInt(this.f18925n1 ? 1 : 0);
        parcel.writeInt(this.f18927o1 ? 1 : 0);
        parcel.writeString(this.f18929p1);
        parcel.writeSerializable(this.f18931q1);
        parcel.writeTypedList(this.f18933r1);
        parcel.writeInt(this.f18934s1 ? 1 : 0);
        parcel.writeInt(this.f18936t1 ? 1 : 0);
        parcel.writeInt(this.f18937u1 ? 1 : 0);
        parcel.writeInt(this.f18941w1 ? 1 : 0);
        parcel.writeInt(this.f18943x1 ? 1 : 0);
        parcel.writeInt(this.f18945y1 ? 1 : 0);
        parcel.writeInt(this.f18947z1 ? 1 : 0);
        parcel.writeInt(this.A1 ? 1 : 0);
        parcel.writeInt(this.B1 ? 1 : 0);
        parcel.writeInt(this.C1 ? 1 : 0);
        parcel.writeInt(this.D1 ? 1 : 0);
        parcel.writeInt(this.E1 ? 1 : 0);
    }

    public /* synthetic */ c(Parcel parcel, int i14) {
        this(parcel);
    }

    public c() {
        this.f18942x = -1L;
        this.f18933r1 = new ArrayList();
    }
}
