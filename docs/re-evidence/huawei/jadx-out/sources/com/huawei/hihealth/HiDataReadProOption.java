package com.huawei.hihealth;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class HiDataReadProOption implements Parcelable {
    public static final Parcelable.Creator<HiDataReadProOption> CREATOR = new Parcelable.Creator<HiDataReadProOption>() { // from class: com.huawei.hihealth.HiDataReadProOption.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public HiDataReadProOption createFromParcel(Parcel parcel) {
            return new HiDataReadProOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public HiDataReadProOption[] newArray(int i) {
            return new HiDataReadProOption[i];
        }
    };
    private static final String DATA_FILTER = "dataFilter";
    private static final String GROUP_BY_TIME = "isGroupByTime";
    private static final String IS_RETURN_SEQUENCE_DATA = "isReturnSequenceData";
    private static final String LAST_DAY_DETAIL = "lastDayDetail";
    private static final String METADATA_FILTER = "metadataFilter";
    private static final String PACKAGE_NAME = "packageName";
    private static final String SEQUENCE_DATA_TYPE = "sequenceDataType";
    private static final String TRACK_DATA_TYPE = "trackDataType";
    private final HiDataReadOption mDataReadOption;
    private final ContentValues mValueHolder;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private HiDataReadProOption(HiDataReadOption hiDataReadOption, ContentValues contentValues) {
        this.mDataReadOption = hiDataReadOption;
        this.mValueHolder = contentValues;
    }

    protected HiDataReadProOption(Parcel parcel) {
        this.mDataReadOption = (HiDataReadOption) parcel.readParcelable(HiDataReadOption.class.getClassLoader());
        this.mValueHolder = (ContentValues) parcel.readParcelable(ContentValues.class.getClassLoader());
    }

    public HiDataReadOption getDataReadOption() {
        return this.mDataReadOption;
    }

    public String getPackageName() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues != null) {
            return contentValues.getAsString("packageName");
        }
        return null;
    }

    public int getSequenceDataType() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues == null || !contentValues.containsKey(SEQUENCE_DATA_TYPE) || this.mValueHolder.getAsInteger(SEQUENCE_DATA_TYPE) == null) {
            return 0;
        }
        return this.mValueHolder.getAsInteger(SEQUENCE_DATA_TYPE).intValue();
    }

    public String getDataFilter() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues != null) {
            return contentValues.getAsString(DATA_FILTER);
        }
        return null;
    }

    public String getMetadataFilter() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues != null) {
            return contentValues.getAsString(METADATA_FILTER);
        }
        return null;
    }

    public boolean isLastDayDetail() {
        return getBooleanValue(LAST_DAY_DETAIL);
    }

    public boolean isGroupByTime() {
        return getBooleanValue(GROUP_BY_TIME);
    }

    public boolean isReturnSequenceData() {
        return getBooleanValue(IS_RETURN_SEQUENCE_DATA);
    }

    private boolean getBooleanValue(String str) {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues == null || !contentValues.containsKey(str) || this.mValueHolder.getAsBoolean(str) == null) {
            return false;
        }
        return this.mValueHolder.getAsBoolean(str).booleanValue();
    }

    public int getTrackDataType() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues == null || !contentValues.containsKey(TRACK_DATA_TYPE) || this.mValueHolder.getAsInteger(TRACK_DATA_TYPE) == null) {
            return 0;
        }
        return this.mValueHolder.getAsInteger(TRACK_DATA_TYPE).intValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mDataReadOption, i);
        parcel.writeParcelable(this.mValueHolder, i);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ContentValues f11794c;
        private HiDataReadOption d;

        public Builder e(HiDataReadOption hiDataReadOption) {
            this.d = hiDataReadOption;
            return this;
        }

        public Builder a(String str) {
            d().put("packageName", str);
            return this;
        }

        public Builder a(int i) {
            d().put(HiDataReadProOption.SEQUENCE_DATA_TYPE, Integer.valueOf(i));
            return this;
        }

        public Builder b(String str) {
            d().put(HiDataReadProOption.DATA_FILTER, str);
            return this;
        }

        public Builder d(String str) {
            d().put(HiDataReadProOption.METADATA_FILTER, str);
            return this;
        }

        public Builder a(boolean z) {
            d().put(HiDataReadProOption.LAST_DAY_DETAIL, Boolean.valueOf(z));
            return this;
        }

        public Builder d(boolean z) {
            d().put(HiDataReadProOption.GROUP_BY_TIME, Boolean.valueOf(z));
            return this;
        }

        public Builder b(int i) {
            d().put(HiDataReadProOption.TRACK_DATA_TYPE, Integer.valueOf(i));
            return this;
        }

        public HiDataReadProOption b() {
            return new HiDataReadProOption(this.d, this.f11794c);
        }

        private ContentValues d() {
            if (this.f11794c == null) {
                this.f11794c = new ContentValues();
            }
            return this.f11794c;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HiDataReadProOption {mDataReadOption = ");
        stringBuffer.append(this.mDataReadOption);
        stringBuffer.append(", mValueHolder = ").append(this.mValueHolder);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
