package bm2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.Collections;
import java.util.Set;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements Parcelable, rs2.c {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceProfile f18948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Configuration f18955h;

    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            int i14 = parcel.readInt();
            if (i14 == 1) {
                return new d((DeviceProfile) parcel.readParcelable(DeviceProfile.class.getClassLoader()));
            }
            if (i14 == 2) {
                return new d(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), (Configuration) parcel.readParcelable(Configuration.class.getClassLoader()));
            }
            h.z("Invalid storage type");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(rs2.c cVar, Integer num) {
        this.f18948a = null;
        this.f18954g = cVar.getF172494b();
        this.f18949b = cVar.getF172495c();
        this.f18952e = cVar.getF172493a();
        this.f18950c = cVar.getF172496d();
        this.f18951d = cVar.getF172497e();
        if (num != null) {
            this.f18953f = num.intValue();
        } else {
            this.f18953f = 0;
        }
        this.f18955h = new Configuration(cVar.getConfigurationFlags());
    }

    public final Configuration b() {
        DeviceProfile deviceProfile = this.f18948a;
        return (deviceProfile == null || deviceProfile.getConfiguration() == null) ? this.f18955h : deviceProfile.getConfiguration();
    }

    public final String d() {
        DeviceProfile deviceProfile = this.f18948a;
        if (deviceProfile != null) {
            return deviceProfile.getDualPairingMacAddress();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String f() {
        DeviceProfile deviceProfile = this.f18948a;
        return deviceProfile != null ? deviceProfile.getMacAddress() : this.f18952e;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getBleMacAddress */
    public final String getF172501i() {
        return this.f18953f == 1 ? f() : d();
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getBluetoothLimitation */
    public final int getF172499g() {
        DeviceProfile deviceProfile = this.f18948a;
        if (deviceProfile != null) {
            return deviceProfile.getF172499g();
        }
        return 0;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getBtcMacAddress */
    public final String getF172502j() {
        return this.f18953f == 2 ? f() : d();
    }

    @Override // rs2.c
    public final Set<Integer> getConfigurationFlags() {
        DeviceProfile deviceProfile = this.f18948a;
        if (deviceProfile != null) {
            return deviceProfile.getConfigurationFlags();
        }
        Configuration configuration = this.f18955h;
        return configuration != null ? configuration.getCapabilityFlagsAsSet() : Collections.EMPTY_SET;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getConnectionId */
    public final String getF172493a() {
        return f();
    }

    public final int getConnectionType() {
        DeviceProfile deviceProfile = this.f18948a;
        return deviceProfile != null ? deviceProfile.getConnectionType() : this.f18953f;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getDeviceName */
    public final String getF172496d() {
        DeviceProfile deviceProfile = this.f18948a;
        return deviceProfile != null ? deviceProfile.getF172496d() : this.f18950c;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getProductNumber */
    public final int getF172495c() {
        DeviceProfile deviceProfile = this.f18948a;
        return deviceProfile != null ? deviceProfile.getF172495c() : this.f18949b;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getSoftwareVersion */
    public final int getF172497e() {
        DeviceProfile deviceProfile = this.f18948a;
        return deviceProfile != null ? deviceProfile.getF172497e() : this.f18951d;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getUnitId */
    public final long getF172494b() {
        DeviceProfile deviceProfile = this.f18948a;
        return deviceProfile != null ? deviceProfile.getF172494b() : this.f18954g;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: isDualBluetoothConnection */
    public final boolean getF172498f() {
        DeviceProfile deviceProfile = this.f18948a;
        return deviceProfile != null && deviceProfile.getF172498f();
    }

    public final boolean isMultiLinkSupported() {
        DeviceProfile deviceProfile = this.f18948a;
        return deviceProfile != null && deviceProfile.isMultiLinkSupported();
    }

    public final String toString() {
        return "DeviceInfoDTO:\n  unitId:" + getF172494b() + "\n  productNumber:" + getF172495c() + "\n  deviceName:" + getF172496d() + "\n  softwareVersion:" + getF172497e() + "\n  configuration:" + b() + "\n  dualBluetoothConnection:" + getF172498f() + "\n  multiLinkSupported:" + isMultiLinkSupported() + "\n  macAddress:" + f() + "\n  connectionType:" + getConnectionType() + "\n";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        DeviceProfile deviceProfile = this.f18948a;
        if (deviceProfile != null) {
            parcel.writeInt(1);
            parcel.writeParcelable(deviceProfile, i14);
            return;
        }
        parcel.writeInt(2);
        parcel.writeLong(this.f18954g);
        parcel.writeInt(this.f18949b);
        parcel.writeString(this.f18952e);
        parcel.writeString(this.f18950c);
        parcel.writeInt(this.f18951d);
        parcel.writeInt(this.f18953f);
        parcel.writeParcelable(this.f18955h, i14);
    }

    public d(DeviceProfile deviceProfile) {
        this.f18948a = deviceProfile;
        this.f18954g = 0L;
        this.f18949b = 0;
        this.f18952e = "";
        this.f18950c = "";
        this.f18951d = 0;
        this.f18953f = 0;
        this.f18955h = new Configuration();
    }

    public d(long j8, int i14, String str, String str2, int i15, int i16, Configuration configuration) {
        this.f18948a = null;
        this.f18954g = j8;
        this.f18949b = i14;
        this.f18952e = str;
        this.f18950c = str2;
        this.f18951d = i15;
        this.f18953f = i16;
        this.f18955h = configuration;
    }
}
