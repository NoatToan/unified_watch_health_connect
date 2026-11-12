package sd2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.maps.android.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class j implements f, Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean H0;
    public boolean I;
    public String I0;
    public String J0;
    public String K0;
    public String L0;
    public String M0;
    public String N0;
    public String O0;
    public boolean P;
    public String P0;
    public String Q0;
    public String R0;
    public byte[] S0;
    public boolean T;
    public byte[] T0;
    public byte[] U0;
    public byte[] V0;
    public String[] W0;
    public boolean X;
    public int X0;
    public boolean Y;
    public String Y0;
    public boolean Z;
    public String Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158682a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public String f158683a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public int f158684b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public String f158685b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f158686c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f158687c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f158688d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public String f158689d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f158690e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public String f158691e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f158692f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public String f158693f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f158694g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public String f158695g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f158696h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public String f158697h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f158698i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public String f158699i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f158700j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public String f158701j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f158702k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f158703k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public String f158704k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f158705l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public String f158706l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f158707m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f158708m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f158709n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public long f158710n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f158711o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f158712o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f158713p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public ArrayList f158714p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f158715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f158716r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f158717t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f158718v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f158719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f158720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f158721y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f158722z;

    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(Parcel parcel) {
        this.f158686c = -1L;
        this.f158688d = -1L;
        this.f158705l = true;
        this.f158707m = true;
        this.W0 = null;
        this.X0 = 0;
        this.f158687c1 = false;
        this.f158714p1 = new ArrayList();
        this.f158682a = parcel.readInt();
        this.f158684b = parcel.readInt();
        this.f158686c = parcel.readLong();
        this.f158688d = parcel.readLong();
        this.f158690e = parcel.readByte() != 0;
        this.f158692f = parcel.readByte() != 0;
        this.f158694g = parcel.readByte() != 0;
        this.f158696h = parcel.readByte() != 0;
        this.f158698i = parcel.readByte() != 0;
        this.f158700j = parcel.readByte() != 0;
        this.f158702k = parcel.readByte() != 0;
        this.f158705l = parcel.readByte() != 0;
        this.I0 = parcel.readString();
        this.J0 = parcel.readString();
        this.K0 = parcel.readString();
        this.L0 = parcel.readString();
        this.M0 = parcel.readString();
        this.N0 = parcel.readString();
        this.O0 = parcel.readString();
        this.P0 = parcel.readString();
        this.Q0 = parcel.readString();
        this.R0 = parcel.readString();
        this.S0 = parcel.createByteArray();
        this.T0 = parcel.createByteArray();
        this.U0 = parcel.createByteArray();
        this.V0 = parcel.createByteArray();
        this.W0 = parcel.createStringArray();
        this.X0 = parcel.readInt();
        this.f158707m = parcel.readByte() != 0;
        this.f158709n = parcel.readByte() != 0;
        this.f158711o = parcel.readByte() != 0;
        this.f158713p = parcel.readByte() != 0;
        this.f158715q = parcel.readByte() != 0;
        this.f158716r = parcel.readByte() != 0;
        this.f158717t = parcel.readByte() != 0;
        this.f158718v = parcel.readByte() != 0;
        this.f158719w = parcel.readByte() != 0;
        this.f158720x = parcel.readByte() != 0;
        this.Y0 = parcel.readString();
        this.Z0 = parcel.readString();
        this.f158683a1 = parcel.readString();
        this.f158685b1 = parcel.readString();
        this.f158687c1 = parcel.readByte() != 0;
        this.f158689d1 = parcel.readString();
        this.f158691e1 = parcel.readString();
        this.f158693f1 = parcel.readString();
        this.f158695g1 = parcel.readString();
        this.f158697h1 = parcel.readString();
        this.f158699i1 = parcel.readString();
        this.f158701j1 = parcel.readString();
        this.f158704k1 = parcel.readString();
        this.f158706l1 = parcel.readString();
        this.f158708m1 = parcel.readByte() != 0;
        this.f158721y = parcel.readByte() != 0;
        this.f158722z = parcel.readByte() != 0;
        this.A = parcel.readByte() != 0;
        this.B = parcel.readByte() != 0;
        this.C = parcel.readByte() != 0;
        this.f158710n1 = parcel.readLong();
        this.f158712o1 = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.f158714p1 = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        this.D = parcel.readByte() != 0;
        this.E = parcel.readByte() != 0;
        this.F = parcel.readByte() != 0;
        this.I = parcel.readByte() != 0;
        this.P = parcel.readByte() != 0;
        this.T = parcel.readByte() != 0;
        this.X = parcel.readByte() != 0;
        this.Y = parcel.readByte() != 0;
        this.Z = parcel.readByte() != 0;
        this.f158703k0 = parcel.readByte() != 0;
        this.H0 = parcel.readByte() != 0;
    }

    @Override // sd2.f
    public final String[] B() {
        return this.W0;
    }

    @Override // sd2.f
    public final boolean B1() {
        return this.F;
    }

    @Override // sd2.f
    public final boolean B2() {
        return this.f158722z;
    }

    @Override // sd2.f
    public final int C2() {
        return this.f158682a;
    }

    @Override // sd2.f
    public final boolean F2() {
        return this.X0 == 0;
    }

    @Override // sd2.f
    public final String J3() {
        return this.N0;
    }

    @Override // sd2.f
    public final long K2() {
        return this.f158688d;
    }

    @Override // sd2.f
    public final String L() {
        return this.f158697h1;
    }

    @Override // sd2.f
    public final boolean L2() {
        return this.f158711o;
    }

    @Override // sd2.f
    public final boolean N0() {
        return this.f158719w;
    }

    @Override // sd2.f
    public final boolean N1() {
        return this.X;
    }

    @Override // sd2.f
    public final boolean N2() {
        return this.H0;
    }

    @Override // sd2.f
    public final boolean O() {
        return this.f158687c1;
    }

    @Override // sd2.f
    public final boolean O0() {
        return this.E;
    }

    @Override // sd2.f
    public final String Q() {
        if (this.X0 == 2) {
            return this.J0;
        }
        return null;
    }

    @Override // sd2.f
    public final boolean Q2() {
        return this.f158702k;
    }

    @Override // sd2.f
    public final boolean S() {
        return this.f158707m;
    }

    @Override // sd2.f
    public final long S2() {
        return this.f158710n1;
    }

    @Override // sd2.f
    public final boolean S3() {
        return this.f158716r;
    }

    @Override // sd2.f
    public final boolean T() {
        return this.f158705l;
    }

    @Override // sd2.f
    public final boolean T1() {
        return this.T;
    }

    @Override // sd2.f
    public final boolean X0() {
        return this.f158708m1;
    }

    @Override // sd2.f
    public final boolean X1() {
        return this.Z;
    }

    @Override // sd2.f
    public final String a1() {
        return this.f158695g1;
    }

    @Override // sd2.f
    public final boolean c2() {
        return this.f158715q;
    }

    @Override // sd2.f
    public final boolean c3() {
        return this.f158717t;
    }

    @Override // sd2.f
    public final String d0() {
        if (this.X0 == 1) {
            return this.J0;
        }
        return null;
    }

    @Override // sd2.f
    public final boolean d2() {
        return this.Y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // sd2.f
    public final String f3() {
        return this.f158704k1;
    }

    @Override // sd2.f
    public final boolean g3() {
        return this.P;
    }

    @Override // sd2.f
    public final String getApplicationKey() {
        return this.I0;
    }

    @Override // sd2.f
    public final int getConnectionType() {
        return this.X0;
    }

    @Override // sd2.f
    public final String getDisplayName() {
        return this.f158685b1;
    }

    @Override // sd2.f
    public final byte[] getGbleEdiv() {
        return this.T0;
    }

    @Override // sd2.f
    public final byte[] getGbleLongTermKey() {
        return this.V0;
    }

    @Override // sd2.f
    public final byte[] getGbleRand() {
        return this.U0;
    }

    @Override // sd2.f
    public final String getImageURL() {
        return this.L0;
    }

    @Override // sd2.f
    public final String getPartNumber() {
        return this.Y0;
    }

    @Override // sd2.f
    public final String getProductDisplayName() {
        return this.f158683a1;
    }

    @Override // sd2.f
    public final String getProductNumber() {
        return this.Z0;
    }

    @Override // sd2.f
    public final String getSku() {
        return this.P0;
    }

    @Override // sd2.f
    public final String getSoftwareVersion() {
        return this.K0;
    }

    @Override // sd2.f
    public final long getUnitID() {
        return this.f158686c;
    }

    @Override // sd2.f
    public final boolean i1() {
        return this.f158709n;
    }

    @Override // sd2.f
    public final boolean isDualBluetoothConnection() {
        return false;
    }

    @Override // sd2.f
    public final boolean isMultiLinkSupported() {
        return this.f158698i;
    }

    @Override // sd2.f
    public final boolean isPaired() {
        return this.J0 != null;
    }

    @Override // sd2.f
    public final boolean l1() {
        return this.f158720x;
    }

    @Override // sd2.f
    public final boolean p2() {
        return this.f158718v;
    }

    @Override // sd2.f
    public final boolean p3() {
        return this.D;
    }

    @Override // sd2.f
    public final boolean q2() {
        return this.X0 == 2;
    }

    @Override // sd2.f
    public final boolean q4() {
        return this.C;
    }

    @Override // sd2.f
    public final boolean r0() {
        return this.f158700j;
    }

    @Override // sd2.f
    public final String r1() {
        return this.M0;
    }

    @Override // sd2.f
    public final String r2() {
        return this.f158701j1;
    }

    @Override // sd2.f
    public final boolean r4() {
        return this.V0 != null;
    }

    @Override // sd2.f
    public final boolean s2() {
        return this.f158713p;
    }

    @Override // sd2.f
    public final String t0() {
        return this.f158693f1;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("unitID[");
        sb3.append(this.f158686c);
        sb3.append("], applicationKey[");
        sb3.append(this.I0);
        sb3.append("], productDisplayName[");
        sb3.append(this.f158683a1);
        sb3.append("], macAddress[");
        sb3.append(this.J0);
        sb3.append("], connectionType[");
        sb3.append(this.X0);
        sb3.append("], bluetoothFriendlyName[");
        sb3.append(this.O0);
        sb3.append("], productNumber[");
        sb3.append(this.Z0);
        sb3.append("], partNumber[");
        sb3.append(this.Y0);
        sb3.append("], softwareVersion[");
        sb3.append(this.K0);
        sb3.append("], isSoftwareUpdateAvailable[");
        sb3.append(this.f158690e);
        sb3.append("], minAppVersionCodeSupported[");
        sb3.append(this.f158682a);
        sb3.append("], imageURL[");
        sb3.append(this.L0);
        sb3.append("], videoURL[");
        sb3.append(this.M0);
        sb3.append("], trainingVideoURL[");
        sb3.append(this.M0);
        sb3.append("], categories[");
        String[] strArr = this.W0;
        sb3.append(strArr != null ? strArr.toString() : "");
        sb3.append("], isSegmentCapable[");
        sb3.append(this.f158692f);
        sb3.append("], garminDeviceXML[");
        byte[] bArr = this.S0;
        String str = BuildConfig.TRAVIS;
        sb3.append((bArr == null || bArr.length <= 0) ? BuildConfig.TRAVIS : "not null");
        sb3.append("], isSegmentCapable[");
        sb3.append(this.f158692f);
        sb3.append("], sku[");
        String str2 = this.P0;
        sb3.append(str2 != null ? str2 : "");
        sb3.append("], gbleEdiv[");
        byte[] bArr2 = this.T0;
        sb3.append((bArr2 == null || bArr2.length <= 0) ? BuildConfig.TRAVIS : "not null");
        sb3.append("], gbleRand[");
        byte[] bArr3 = this.U0;
        sb3.append((bArr3 == null || bArr3.length <= 0) ? BuildConfig.TRAVIS : "not null");
        sb3.append("], gbleLongTermKey[");
        byte[] bArr4 = this.V0;
        if (bArr4 != null && bArr4.length > 0) {
            str = "not null";
        }
        sb3.append(str);
        sb3.append("], isVivohubConfigurable[");
        sb3.append(this.f158696h);
        sb3.append("], isPrimaryUser[");
        sb3.append(this.f158705l);
        sb3.append("], displayName[");
        sb3.append(this.f158685b1);
        sb3.append("],activeInd[");
        sb3.append(this.f158684b);
        sb3.append("],isOrphanDevice[");
        sb3.append(this.f158687c1);
        sb3.append("],fitPayUserID[");
        sb3.append(this.Q0);
        sb3.append("],nfcSecureElementID[");
        sb3.append(this.R0);
        sb3.append("],multiLinkSupported[");
        sb3.append(this.f158698i);
        sb3.append("],");
        if (this.f158688d != -1) {
            sb3.append("lastConnected[");
            sb3.append(new SimpleDateFormat("EEE, MMM d, yyyy hh:mm aa", Locale.ENGLISH).format(Long.valueOf(this.f158688d)));
            sb3.append("],");
        } else {
            sb3.append("lastConnected[-1],");
        }
        sb3.append("isGcj02CourseCapable[");
        sb3.append(this.f158700j);
        sb3.append("]isActivityCourseCapable[");
        sb3.append(this.f158702k);
        sb3.append("]isHighHrAlertCapable[");
        sb3.append(this.f158715q);
        sb3.append("]gcmSettingsFileName[");
        sb3.append(this.f158689d1);
        sb3.append("]skuImageURL[");
        sb3.append(this.f158691e1);
        sb3.append("]skuImageDefaultWatchFaceURL[");
        sb3.append(this.f158693f1);
        sb3.append("]skuImageDefaultWatchFaceBlankURL[");
        sb3.append(this.f158695g1);
        sb3.append("]skuImageSideProfileURL[");
        sb3.append(this.f158697h1);
        sb3.append("]skuImageTutorialURL[");
        sb3.append(this.f158699i1);
        sb3.append("]skuImageOption1URL[");
        sb3.append(this.f158701j1);
        sb3.append("]skuImageOption2URL[");
        sb3.append(this.f158704k1);
        sb3.append("]skuImageOption3URL[");
        sb3.append(this.f158706l1);
        sb3.append("]isSpectatorMessagingCapable[");
        sb3.append(this.f158716r);
        sb3.append("]isTrainingStatusCapable[");
        sb3.append(this.f158717t);
        sb3.append("]isTrainingStatusPauseCapable[");
        sb3.append(this.f158718v);
        sb3.append("]isMeasurementUnitSettingCapable[");
        sb3.append(this.f158708m1);
        sb3.append("]isPowerCurveCapable[");
        sb3.append(this.f158719w);
        sb3.append("]isSecondaryWorkoutStepTargetCapable[");
        sb3.append(this.f158720x);
        sb3.append("]isAssistancePlusCapable[");
        sb3.append(this.f158721y);
        sb3.append("]isEmergencyCallingCapable[");
        sb3.append(this.f158722z);
        sb3.append("]isSolarChargeCapable[");
        sb3.append(this.A);
        sb3.append("]isDiveAppSyncCapable[");
        sb3.append(this.B);
        sb3.append("]lastUploadToServerTimestamp[");
        sb3.append(this.f158710n1);
        sb3.append("]primaryAppKey[");
        sb3.append(this.f158712o1);
        sb3.append("]incompatibleAppKeys[");
        sb3.append(this.f158714p1);
        sb3.append("]isApplyBackupCapable[");
        sb3.append(this.D);
        sb3.append("]isHillScoreEnduranceScoreCapable[");
        sb3.append(this.E);
        sb3.append("]isBodyBatteryTrueUpCapable[");
        sb3.append(this.F);
        sb3.append("]isRechargeableSensorCapable[");
        sb3.append(this.I);
        sb3.append("]isStartActivityCapable[");
        sb3.append(this.P);
        sb3.append("]isPendingActivityCapable[");
        sb3.append(this.T);
        sb3.append("]isFixedLocationCapable[");
        sb3.append(this.X);
        sb3.append("]isScreenlessCapable[");
        sb3.append(this.Y);
        sb3.append("]isStartStopWorkoutCapable[");
        sb3.append(this.Z);
        sb3.append("]isFallDetectionCapable[");
        sb3.append(this.f158703k0);
        sb3.append("]isDirectActivationCapable[");
        return hb.a.k(sb3, this.H0, "]");
    }

    @Override // sd2.f
    public final boolean u0() {
        return this.f158703k0;
    }

    @Override // sd2.f
    public final boolean u2() {
        return this.f158696h;
    }

    @Override // sd2.f
    public final boolean u3() {
        return this.f158692f;
    }

    @Override // sd2.f
    public final String u4() {
        return this.f158691e1;
    }

    @Override // sd2.f
    public final String v0() {
        return this.f158689d1;
    }

    @Override // sd2.f
    public final String w1() {
        return this.f158706l1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f158682a);
        parcel.writeInt(this.f158684b);
        parcel.writeLong(this.f158686c);
        parcel.writeLong(this.f158688d);
        parcel.writeByte(this.f158690e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158692f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158694g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158696h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158698i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158700j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158702k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158705l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.I0);
        parcel.writeString(this.J0);
        parcel.writeString(this.K0);
        parcel.writeString(this.L0);
        parcel.writeString(this.M0);
        parcel.writeString(this.N0);
        parcel.writeString(this.O0);
        parcel.writeString(this.P0);
        parcel.writeString(this.Q0);
        parcel.writeString(this.R0);
        parcel.writeByteArray(this.S0);
        parcel.writeByteArray(this.T0);
        parcel.writeByteArray(this.U0);
        parcel.writeByteArray(this.V0);
        parcel.writeStringArray(this.W0);
        parcel.writeInt(this.X0);
        parcel.writeByte(this.f158707m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158709n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158711o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158713p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158715q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158716r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158717t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158718v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158719w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158720x ? (byte) 1 : (byte) 0);
        parcel.writeString(this.Y0);
        parcel.writeString(this.Z0);
        parcel.writeString(this.f158683a1);
        parcel.writeString(this.f158685b1);
        parcel.writeByte(this.f158687c1 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f158689d1);
        parcel.writeString(this.f158691e1);
        parcel.writeString(this.f158693f1);
        parcel.writeString(this.f158695g1);
        parcel.writeString(this.f158697h1);
        parcel.writeString(this.f158699i1);
        parcel.writeString(this.f158701j1);
        parcel.writeString(this.f158704k1);
        parcel.writeString(this.f158706l1);
        parcel.writeByte(this.f158708m1 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158721y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158722z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f158710n1);
        parcel.writeInt(this.f158712o1);
        parcel.writeList(this.f158714p1);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.I ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.P ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.T ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.X ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f158703k0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.H0 ? (byte) 1 : (byte) 0);
    }

    @Override // sd2.f
    public final boolean y0() {
        return this.f158721y;
    }

    @Override // sd2.f
    public final boolean z1() {
        return this.X0 == 1;
    }

    public j() {
        this.f158686c = -1L;
        this.f158688d = -1L;
        this.f158705l = true;
        this.f158707m = true;
        this.W0 = null;
        this.X0 = 0;
        this.f158687c1 = false;
        this.f158714p1 = new ArrayList();
    }
}
