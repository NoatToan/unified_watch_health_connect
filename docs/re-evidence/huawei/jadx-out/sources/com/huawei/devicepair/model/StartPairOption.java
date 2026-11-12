package com.huawei.devicepair.model;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class StartPairOption implements Parcelable {
    private static final String BLUETOOTH_NAME = "name";
    public static final Parcelable.Creator<StartPairOption> CREATOR = new Parcelable.Creator<StartPairOption>() { // from class: com.huawei.devicepair.model.StartPairOption.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public StartPairOption createFromParcel(Parcel parcel) {
            return new StartPairOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StartPairOption[] newArray(int i) {
            return new StartPairOption[i];
        }
    };
    private static final String DEEP_LINK_PREFIX = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.dm-ccbk?h5pro=true&urlType=4&pName=com.huawei.health&path=devicePairing&info=";
    private static final String DEVICE_MAC = "uuid";
    private static final String IS_CLOUND_DEVICE = "isCloundDevice";
    private static final String KIND_ID = "kindId";
    private static final String PAIR_INFO = "pairInfo";
    private static final String RESOURCE_UUIDS = "uuids";
    private static final String TAG = "StartPairOption";
    private List<String> mUuids;
    private final ContentValues mValueHolder;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String creatDeepLink() {
        HashMap map = new HashMap();
        map.put(RESOURCE_UUIDS, getUuids());
        map.put(IS_CLOUND_DEVICE, Boolean.valueOf(isCloundDevice(false)));
        map.put("name", getBluetoothName(""));
        HashMap map2 = new HashMap();
        map2.put("uuid", getDeviceMac(""));
        map2.put("name", getBluetoothName(""));
        map2.put(KIND_ID, getKindId(""));
        map2.put(PAIR_INFO, map);
        String str = DEEP_LINK_PREFIX + HiJsonUtil.d(map2);
        LogUtil.a(TAG, "creatDeepLink, deepLink is ", str);
        return str;
    }

    protected StartPairOption(Parcel parcel) {
        this.mValueHolder = (ContentValues) parcel.readParcelable(ContentValues.class.getClassLoader());
    }

    private StartPairOption(ContentValues contentValues, List<String> list) {
        this.mUuids = list;
        this.mValueHolder = contentValues;
    }

    public String getDeviceMac(String str) {
        ContentValues contentValues = this.mValueHolder;
        return contentValues != null ? contentValues.getAsString("uuid") : str;
    }

    public String getBluetoothName(String str) {
        ContentValues contentValues = this.mValueHolder;
        return contentValues != null ? contentValues.getAsString("name") : str;
    }

    public String getKindId(String str) {
        ContentValues contentValues = this.mValueHolder;
        return contentValues != null ? contentValues.getAsString(KIND_ID) : str;
    }

    public List<String> getUuids() {
        return this.mUuids;
    }

    public boolean isCloundDevice(boolean z) {
        return getBooleanValue(IS_CLOUND_DEVICE, z);
    }

    public String getCustomParameter(String str) {
        return getString(str);
    }

    private boolean getBooleanValue(String str, boolean z) {
        ContentValues contentValues = this.mValueHolder;
        return (contentValues == null || !contentValues.containsKey(str) || this.mValueHolder.getAsBoolean(str) == null) ? z : this.mValueHolder.getAsBoolean(str).booleanValue();
    }

    public String getString(String str) {
        return this.mValueHolder.getAsString(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mValueHolder, i);
    }

    public static e builder() {
        return new e();
    }

    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ContentValues f5413b;
        private List<String> d;

        public StartPairOption a() {
            return new StartPairOption(d(), e());
        }

        public e c(String str) {
            d().put("uuid", str);
            return this;
        }

        public e d(String str) {
            d().put("name", str);
            return this;
        }

        public e a(String str) {
            d().put(StartPairOption.KIND_ID, str);
            return this;
        }

        public e d(List<String> list) {
            a(list);
            return this;
        }

        public e e(boolean z) {
            d().put(StartPairOption.IS_CLOUND_DEVICE, Boolean.valueOf(z));
            return this;
        }

        private ContentValues d() {
            if (this.f5413b == null) {
                this.f5413b = new ContentValues();
            }
            return this.f5413b;
        }

        private List<String> e() {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            return this.d;
        }

        private void a(List<String> list) {
            this.d = list;
        }
    }
}
