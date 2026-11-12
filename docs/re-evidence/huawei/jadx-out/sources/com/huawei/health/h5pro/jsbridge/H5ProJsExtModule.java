package com.huawei.health.h5pro.jsbridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.jsbridge.system.account.AccountEntry;
import com.huawei.health.h5pro.jsbridge.system.network.NetWorkEntry;

/* JADX INFO: loaded from: classes7.dex */
public enum H5ProJsExtModule implements Parcelable {
    MODULE_ACCOUNT("account", AccountEntry.class),
    MODULE_NETWORK("network", NetWorkEntry.class);

    public static final Parcelable.Creator<H5ProJsExtModule> CREATOR = new Parcelable.Creator<H5ProJsExtModule>() { // from class: com.huawei.health.h5pro.jsbridge.H5ProJsExtModule.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public H5ProJsExtModule[] newArray(int i) {
            return new H5ProJsExtModule[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public H5ProJsExtModule createFromParcel(Parcel parcel) {
            return H5ProJsExtModule.values()[parcel.readInt()];
        }
    };
    Class<? extends JsBaseModule> moduleClass;
    String moduleName;

    H5ProJsExtModule(String str, Class cls) {
        this.moduleName = str;
        this.moduleClass = cls;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
