package com.xiaomi.smarthome.plugin.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.core.entity.Error;

/* JADX INFO: loaded from: classes2.dex */
public class PluginError extends Error {
    public static final int BRIDGE_SERVICE_IS_NULL = -801;
    public static final int CANCEL_OPEN_PLUGIN = -800;
    public static final Parcelable.Creator<PluginError> CREATOR = new Parcelable.Creator<PluginError>() { // from class: com.xiaomi.smarthome.plugin.update.PluginError.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PluginError createFromParcel(Parcel parcel) {
            return new PluginError(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PluginError[] newArray(int i) {
            return new PluginError[i];
        }
    };
    public static final int DOWNERROR_APPVERSION = -666;
    public static final int DOWNERROR_CREATE_PACKAGE_INFO_ERROR = -671;
    public static final int DOWNERROR_DOWNED = -665;
    public static final int DOWNERROR_DOWNERROR = -663;
    public static final int DOWNERROR_DOWNERRORCOPY = -669;
    public static final int DOWNERROR_DOWNING = -664;
    public static final int DOWNERROR_INFOERROR = -662;
    public static final int DOWNERROR_NOPLUGIN = -661;
    public static final int DOWNERROR_PLATFORM = -708;
    public static final int DOWNERROR_SDK = -667;
    public static final int DOWNERROR_SDKVERSION = -668;
    public static final int DOWNERROR_VERIFY = -670;
    public static final int EXTRA_RECYCLE_PLUGIN_TRUE = -900;
    public static final int GET_DOWNLOAD_PLUGIN_INFO_ERROR = -806;
    public static final int GET_INSTALL_PACKAGE_INFO_ERROR = -807;
    public static final int INSTALLERROR_DEVELOPER = -706;
    public static final int INSTALLERROR_DYNAMICFEATURE = -712;
    public static final int INSTALLERROR_INFOERROR = -703;
    public static final int INSTALLERROR_INSTALL = -704;
    public static final int INSTALLERROR_INSTALLED = -710;
    public static final int INSTALLERROR_MINLEVEL = -707;
    public static final int INSTALLERROR_MODELVAILD = -709;
    public static final int INSTALLERROR_NODOWN = -701;
    public static final int INSTALLERROR_NOEXITINFO = -705;
    public static final int INSTALLERROR_NOINFO = -702;
    public static final int INSTALLERROR_TYPEINVAILD = -711;
    public static final int INSTALL_CANCEL = -2;
    public static final int INSTALL_ERROR = -1;
    public static final int INSTALL_ERROR_FOR_COPY = -1003;
    public static final int INSTALL_ERROR_FOR_COPY_OR_FILE_CHECK = -1005;
    public static final int INSTALL_ERROR_FOR_CREATE_PACKAGE_INFO = -1006;
    public static final int INSTALL_ERROR_FOR_DOWNLOAD_INFO_NULL = -1001;
    public static final int INSTALL_ERROR_FOR_DOWNLOAD_PACKAGE_ID_INVALID = -1002;
    public static final int INSTALL_ERROR_FOR_FILE_CHECK = -1004;
    public static final int INSTALL_SUCCESS = 0;
    public static final int LAUNCHER_DEVICE_DID_NULL = -8032;
    public static final int LAUNCHER_DEVICE_STAT_NULL = -8030;
    public static final int MIJIA_INIT_ERROR = -804;
    public static final int OTHER_DEVICE_DID_NULL = -8033;
    public static final int OTHER_DEVICE_STAT_NULL = -8031;
    public static final int PLUGIN_CACHE_NOT_READY = -809;
    public static final int PLUGIN_RECORD_IS_NULL = -808;
    public static final int REACT_VIEW_IS_NULL = -901;
    public static final int RN_PLUGIN_PACKAGE_NOT_EXIST = -805;
    public static final int SEND_MESSAGE_EXCEPTION = -802;
    public static final int START_STD_PLUGIN_ERROR_NO_I18N = -714;
    public static final int START_STD_PLUGIN_ERROR_NO_PLUGIN = -713;

    public PluginError(int i, String str) {
        super(i, str);
    }

    @Override // com.xiaomi.smarthome.core.entity.Error, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.xiaomi.smarthome.core.entity.Error, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public PluginError(Parcel parcel) {
        super(parcel);
    }
}
