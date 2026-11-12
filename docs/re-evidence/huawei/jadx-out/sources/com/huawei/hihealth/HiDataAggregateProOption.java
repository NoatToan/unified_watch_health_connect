package com.huawei.hihealth;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class HiDataAggregateProOption implements Parcelable {
    public static final Parcelable.Creator<HiDataAggregateProOption> CREATOR = new Parcelable.Creator<HiDataAggregateProOption>() { // from class: com.huawei.hihealth.HiDataAggregateProOption.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public HiDataAggregateProOption createFromParcel(Parcel parcel) {
            return new HiDataAggregateProOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HiDataAggregateProOption[] newArray(int i) {
            return new HiDataAggregateProOption[i];
        }
    };
    private static final String DATA_FILTER = "dataFilter";
    private static final String PACKAGE_NAME = "packageName";
    private static final String WITHOUT_DEFAULT_ZERO = "withoutDefaultZero";
    private final HiAggregateOption mAggregateOption;
    private final ContentValues mValueHolder;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private HiDataAggregateProOption(HiAggregateOption hiAggregateOption, ContentValues contentValues) {
        this.mAggregateOption = hiAggregateOption;
        this.mValueHolder = contentValues;
    }

    protected HiDataAggregateProOption(Parcel parcel) {
        this.mAggregateOption = (HiAggregateOption) parcel.readParcelable(HiAggregateOption.class.getClassLoader());
        this.mValueHolder = (ContentValues) parcel.readParcelable(ContentValues.class.getClassLoader());
    }

    public HiAggregateOption getAggregateOption() {
        return this.mAggregateOption;
    }

    public String getPackageName() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues != null) {
            return contentValues.getAsString("packageName");
        }
        return null;
    }

    public String getDataFilter() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues != null) {
            return contentValues.getAsString(DATA_FILTER);
        }
        return null;
    }

    public boolean getWithoutDefaultZero() {
        return getBooleanValue(WITHOUT_DEFAULT_ZERO);
    }

    private boolean getBooleanValue(String str) {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues == null || !contentValues.containsKey(str) || this.mValueHolder.getAsBoolean(str) == null) {
            return false;
        }
        return this.mValueHolder.getAsBoolean(str).booleanValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mAggregateOption, i);
        parcel.writeParcelable(this.mValueHolder, i);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ContentValues f11792b;
        private HiAggregateOption e;

        public Builder c(HiAggregateOption hiAggregateOption) {
            this.e = hiAggregateOption;
            return this;
        }

        public Builder e(String str) {
            c().put("packageName", str);
            return this;
        }

        public Builder b(String str) {
            c().put(HiDataAggregateProOption.DATA_FILTER, str);
            return this;
        }

        public Builder e(boolean z) {
            c().put(HiDataAggregateProOption.WITHOUT_DEFAULT_ZERO, Boolean.valueOf(z));
            return this;
        }

        public HiDataAggregateProOption e() {
            return new HiDataAggregateProOption(this.e, this.f11792b);
        }

        private ContentValues c() {
            if (this.f11792b == null) {
                this.f11792b = new ContentValues();
            }
            return this.f11792b;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HiDataAggregateProOption{mAggOpt=");
        stringBuffer.append(this.mAggregateOption);
        stringBuffer.append(",mValHld=").append(this.mValueHolder);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
