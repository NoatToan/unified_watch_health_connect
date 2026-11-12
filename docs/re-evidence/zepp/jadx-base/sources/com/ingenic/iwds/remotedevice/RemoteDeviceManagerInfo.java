package com.ingenic.iwds.remotedevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.ximalaya.ting.android.player.XMediaPlayer;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteDeviceManagerInfo {
    public static final int DELETE_FAILED_DEVICE_POLICY_MANAGER = -112;
    public static final int DELETE_FAILED_INTERNAL_ERROR = -111;
    public static final int DELETE_FAILED_USER_RESTRICTED = -113;
    public static final int DELETE_SUCCEEDED = 1;
    public static final int INSTALL_FAILED_ALREADY_EXISTS = -1;
    public static final int INSTALL_FAILED_CPU_ABI_INCOMPATIBLE = -16;
    public static final int INSTALL_FAILED_INSUFFICIENT_STORAGE = -4;
    public static final int INSTALL_FAILED_INVALID_APK = -2;
    public static final int INSTALL_FAILED_INVALID_URI = -3;
    public static final int INSTALL_FAILED_OLDER_SDK = -12;
    public static final int INSTALL_FAILED_SEND_APK_FILE_ERROR = -105;
    public static final int INSTALL_FAILED_VERSION_DOWNGRADE = -25;
    public static final int INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES = -104;
    public static final int INSTALL_PARSE_FAILED_NOT_APK = -100;
    public static final int INSTALL_SUCCEEDED = 1;
    public static final int REQUEST_FAILED_PREVIOUS_DOING = -200;
    public static final int REQUEST_FAILED_SERVICE_DISCONNECTED = -201;
    public static final int REQUEST_REMOTE_FAILED = -119;
    public static final int REQUEST_SUCCEEDED = 0;
    public static final int TYPE_CLEAR_APP_CACHE = 1;
    public static final int TYPE_CLEAR_APP_USER_DATA = 0;
    public static final int TYPE_SETTING_WEAR_ON_WHICH_HAND = 0;
    public static final int VALUE_WEAR_ON_LEFT_HAND = 2;
    public static final int VALUE_WEAR_ON_RIGHT_HAND = 1;
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 8;
    public static final int i = 9;
    public static final int j = 10;
    public static final int k = 11;
    public static final int l = 12;
    public static final int m = 13;
    public static final int n = 20;
    public static final int o = 21;

    public static int a(int i2) {
        return i2 + XMediaPlayer.MEDIA_ERROR_TIMED_OUT;
    }

    public static class AppListResponse extends RemoteResponse {
        public static final Parcelable.Creator<AppListResponse> CREATOR = new a();
        public RemoteApplicationInfoList c;

        public static class a implements Parcelable.Creator<AppListResponse> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public AppListResponse createFromParcel(Parcel parcel) {
                return new AppListResponse(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public AppListResponse[] newArray(int i) {
                return new AppListResponse[i];
            }
        }

        public AppListResponse(RemoteApplicationInfoList remoteApplicationInfoList) {
            super(3, 0);
            this.c = remoteApplicationInfoList;
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse
        public void a(Parcel parcel) {
            super.a(parcel);
            this.c = (RemoteApplicationInfoList) parcel.readParcelable(AppListResponse.class.getClassLoader());
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, i);
        }

        public AppListResponse(Parcel parcel) {
            super(parcel);
        }
    }

    public static class ConfirmInstallResponse extends ResponseWithName {
        public static final Parcelable.Creator<ConfirmInstallResponse> CREATOR = new a();
        public String d;

        public static class a implements Parcelable.Creator<ConfirmInstallResponse> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ConfirmInstallResponse createFromParcel(Parcel parcel) {
                return new ConfirmInstallResponse(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ConfirmInstallResponse[] newArray(int i) {
                return new ConfirmInstallResponse[i];
            }
        }

        public ConfirmInstallResponse(String str, String str2, int i) {
            super(str, 6, i);
            this.d = str2;
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.ResponseWithName, com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse
        public void a(Parcel parcel) {
            super.a(parcel);
            this.d = parcel.readString();
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.ResponseWithName, com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.d);
        }

        public ConfirmInstallResponse(Parcel parcel) {
            super(parcel);
        }
    }

    public static class PkgInfoResponse extends RemoteResponse {
        public static final Parcelable.Creator<PkgInfoResponse> CREATOR = new a();
        public String c;
        public RemotePackageStats d;

        public static class a implements Parcelable.Creator<PkgInfoResponse> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public PkgInfoResponse createFromParcel(Parcel parcel) {
                return new PkgInfoResponse(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public PkgInfoResponse[] newArray(int i) {
                return new PkgInfoResponse[i];
            }
        }

        public PkgInfoResponse(String str, int i) {
            super(8, i);
            this.c = str;
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse
        public void a(Parcel parcel) {
            super.a(parcel);
            this.c = parcel.readString();
            this.d = (RemotePackageStats) parcel.readParcelable(PkgInfoResponse.class.getClassLoader());
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.c);
            parcel.writeParcelable(this.d, i);
        }

        public PkgInfoResponse(Parcel parcel) {
            super(parcel);
        }
    }

    public static class ProcessInfoResponse extends RemoteResponse {
        public static final Parcelable.Creator<ProcessInfoResponse> CREATOR = new a();
        public RemoteProcessInfoList c;

        public static class a implements Parcelable.Creator<ProcessInfoResponse> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ProcessInfoResponse createFromParcel(Parcel parcel) {
                return new ProcessInfoResponse(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ProcessInfoResponse[] newArray(int i) {
                return new ProcessInfoResponse[i];
            }
        }

        public ProcessInfoResponse(RemoteProcessInfoList remoteProcessInfoList) {
            super(10, 0);
            this.c = remoteProcessInfoList;
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse
        public void a(Parcel parcel) {
            super.a(parcel);
            this.c = (RemoteProcessInfoList) parcel.readParcelable(ProcessInfoResponse.class.getClassLoader());
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, i);
        }

        public ProcessInfoResponse(Parcel parcel) {
            super(parcel);
        }
    }

    public static class RemoteResponse implements Parcelable {
        public static final Parcelable.Creator<RemoteResponse> CREATOR = new a();
        public int a;
        public int b;

        public static class a implements Parcelable.Creator<RemoteResponse> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public RemoteResponse createFromParcel(Parcel parcel) {
                return new RemoteResponse(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public RemoteResponse[] newArray(int i) {
                return new RemoteResponse[i];
            }
        }

        public RemoteResponse(int i) {
            this.a = i;
        }

        public void a(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }

        public RemoteResponse(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public RemoteResponse(Parcel parcel) {
            a(parcel);
        }
    }

    public static class ResponseWithName extends RemoteResponse {
        public static final Parcelable.Creator<ResponseWithName> CREATOR = new a();
        public String c;

        public static class a implements Parcelable.Creator<ResponseWithName> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResponseWithName createFromParcel(Parcel parcel) {
                return new ResponseWithName(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResponseWithName[] newArray(int i) {
                return new ResponseWithName[i];
            }
        }

        public ResponseWithName(String str, int i, int i2) {
            super(i, i2);
            this.c = str;
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse
        public void a(Parcel parcel) {
            super.a(parcel);
            this.c = parcel.readString();
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.c);
        }

        public ResponseWithName(int i, int i2) {
            super(i, i2);
        }

        public ResponseWithName(Parcel parcel) {
            super(parcel);
        }
    }

    public static class SettingResponse extends RemoteResponse {
        public static final Parcelable.Creator<SettingResponse> CREATOR = new a();
        public int c;

        public static class a implements Parcelable.Creator<SettingResponse> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SettingResponse createFromParcel(Parcel parcel) {
                return new SettingResponse(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SettingResponse[] newArray(int i) {
                return new SettingResponse[i];
            }
        }

        public SettingResponse(int i, int i2, int i3) {
            super(i, i3);
            this.c = i2;
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse
        public void a(Parcel parcel) {
            super.a(parcel);
            this.c = parcel.readInt();
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
        }

        public SettingResponse(Parcel parcel) {
            super(parcel);
        }
    }

    public static class StorageInfoResponse extends RemoteResponse {
        public static final Parcelable.Creator<StorageInfoResponse> CREATOR = new a();
        public RemoteStorageInfo c;

        public static class a implements Parcelable.Creator<StorageInfoResponse> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public StorageInfoResponse createFromParcel(Parcel parcel) {
                return new StorageInfoResponse(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public StorageInfoResponse[] newArray(int i) {
                return new StorageInfoResponse[i];
            }
        }

        public StorageInfoResponse(RemoteStorageInfo remoteStorageInfo) {
            super(4, 0);
            this.c = remoteStorageInfo;
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse
        public void a(Parcel parcel) {
            super.a(parcel);
            this.c = (RemoteStorageInfo) parcel.readParcelable(StorageInfoResponse.class.getClassLoader());
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, i);
        }

        public StorageInfoResponse(Parcel parcel) {
            super(parcel);
        }
    }

    public static class a implements Serializable {
        private static final long serialVersionUID = -87257129103004422L;
        public String a;
        public int b;
        public int c;
        public int d;
        public String e;
        public boolean f;
        public long g;

        public a(int i) {
            this.b = i;
        }

        public a(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public a(int i, int i2, int i3) {
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public a(String str, int i, String str2, long j, boolean z) {
            this(str, i);
            this.e = str2;
            this.g = j;
            this.f = z;
        }
    }

    public static class SysMemResponse extends RemoteResponse {
        public static final Parcelable.Creator<SysMemResponse> CREATOR = new a();
        public long c;
        public long d;

        public static class a implements Parcelable.Creator<SysMemResponse> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SysMemResponse createFromParcel(Parcel parcel) {
                return new SysMemResponse(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SysMemResponse[] newArray(int i) {
                return new SysMemResponse[i];
            }
        }

        public SysMemResponse(long j, long j2) {
            super(9, 0);
            this.c = j;
            this.d = j2;
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse
        public void a(Parcel parcel) {
            super.a(parcel);
            this.c = parcel.readLong();
            this.d = parcel.readLong();
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.c);
            parcel.writeLong(this.d);
        }

        public SysMemResponse(Parcel parcel) {
            super(parcel);
        }
    }

    public static class ClearAllAppDataCacheResponse extends ResponseWithName {
        public static final Parcelable.Creator<ClearAllAppDataCacheResponse> CREATOR = new a();
        public int d;
        public int e;
        public int f;

        public static class a implements Parcelable.Creator<ClearAllAppDataCacheResponse> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ClearAllAppDataCacheResponse createFromParcel(Parcel parcel) {
                return new ClearAllAppDataCacheResponse(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ClearAllAppDataCacheResponse[] newArray(int i) {
                return new ClearAllAppDataCacheResponse[i];
            }
        }

        public ClearAllAppDataCacheResponse(int i, int i2, String str, int i3, int i4) {
            super(str, 2, i4);
            this.d = i;
            this.e = i2;
            this.f = i3;
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.ResponseWithName, com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse
        public void a(Parcel parcel) {
            super.a(parcel);
            this.c = parcel.readString();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
        }

        @Override // com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.ResponseWithName, com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo.RemoteResponse, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
        }

        public ClearAllAppDataCacheResponse(int i) {
            super(null, 2, i);
        }

        public ClearAllAppDataCacheResponse(Parcel parcel) {
            super(parcel);
        }
    }
}
