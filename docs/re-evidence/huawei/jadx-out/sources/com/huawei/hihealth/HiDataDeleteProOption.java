package com.huawei.hihealth;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class HiDataDeleteProOption implements Parcelable {
    public static final Parcelable.Creator<HiDataDeleteProOption> CREATOR = new Parcelable.Creator<HiDataDeleteProOption>() { // from class: com.huawei.hihealth.HiDataDeleteProOption.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public HiDataDeleteProOption createFromParcel(Parcel parcel) {
            return new HiDataDeleteProOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HiDataDeleteProOption[] newArray(int i) {
            return new HiDataDeleteProOption[i];
        }
    };
    private static final String DELETE_INTERVAL = "deleteInterval";
    private static final String DELETE_LEVEL = "deleteLevel";
    private static final String DELETE_TYPE = "deleteType";
    private static final String DEVICE_UUID = "deviceUuid";
    private static final String PACKAGE_NAME = "packageName";
    private final HiDataDeleteOption mDataDeleteOption;
    private final ContentValues mValueHolder;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private HiDataDeleteProOption(HiDataDeleteOption hiDataDeleteOption, ContentValues contentValues) {
        this.mDataDeleteOption = hiDataDeleteOption;
        this.mValueHolder = contentValues;
    }

    protected HiDataDeleteProOption(Parcel parcel) {
        this.mDataDeleteOption = (HiDataDeleteOption) parcel.readParcelable(HiDataDeleteOption.class.getClassLoader());
        this.mValueHolder = (ContentValues) parcel.readParcelable(ContentValues.class.getClassLoader());
    }

    public HiDataDeleteOption getDataDeleteOption() {
        return this.mDataDeleteOption;
    }

    public String getPackageName() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues != null) {
            return contentValues.getAsString("packageName");
        }
        return null;
    }

    public Integer getDeleteType() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues != null) {
            return contentValues.getAsInteger(DELETE_TYPE);
        }
        return null;
    }

    public String getDeviceUuid() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues != null) {
            return contentValues.getAsString(DEVICE_UUID);
        }
        return null;
    }

    public Integer getDeleteLevel() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues != null) {
            return contentValues.getAsInteger(DELETE_LEVEL);
        }
        return null;
    }

    public Integer getDeleteInterval() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues == null) {
            return null;
        }
        Integer asInteger = contentValues.getAsInteger(DELETE_INTERVAL);
        if (asInteger == null) {
            return 0;
        }
        return asInteger;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mDataDeleteOption, i);
        parcel.writeParcelable(this.mValueHolder, i);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HiDataDeleteOption f11793c;
        private ContentValues d;

        public Builder c(HiDataDeleteOption hiDataDeleteOption) {
            this.f11793c = hiDataDeleteOption;
            return this;
        }

        public Builder b(String str) {
            d().put("packageName", str);
            return this;
        }

        public Builder b(Integer num) {
            d().put(HiDataDeleteProOption.DELETE_TYPE, num);
            return this;
        }

        public Builder a(String str) {
            d().put(HiDataDeleteProOption.DEVICE_UUID, str);
            return this;
        }

        public Builder d(Integer num) {
            d().put(HiDataDeleteProOption.DELETE_LEVEL, num);
            return this;
        }

        public Builder a(Integer num) {
            d().put(HiDataDeleteProOption.DELETE_INTERVAL, num);
            return this;
        }

        public HiDataDeleteProOption c() {
            return new HiDataDeleteProOption(this.f11793c, this.d);
        }

        private ContentValues d() {
            if (this.d == null) {
                this.d = new ContentValues();
            }
            return this.d;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HiDataDeleteProOption {mDataDeleteOption = ");
        stringBuffer.append(this.mDataDeleteOption);
        stringBuffer.append(", mValueHolder = ").append(this.mValueHolder);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
