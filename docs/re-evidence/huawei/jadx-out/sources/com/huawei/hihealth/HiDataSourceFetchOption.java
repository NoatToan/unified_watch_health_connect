package com.huawei.hihealth;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class HiDataSourceFetchOption implements Parcelable {
    public static final Parcelable.Creator<HiDataSourceFetchOption> CREATOR = new Parcelable.Creator<HiDataSourceFetchOption>() { // from class: com.huawei.hihealth.HiDataSourceFetchOption.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public HiDataSourceFetchOption createFromParcel(Parcel parcel) {
            return new HiDataSourceFetchOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HiDataSourceFetchOption[] newArray(int i) {
            return new HiDataSourceFetchOption[i];
        }
    };
    private static final String FETCH_TYPE = "fetchType";
    private final int[] mClientIds;
    private final ContentValues mValueHolder;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private HiDataSourceFetchOption(Parcel parcel) {
        this.mValueHolder = (ContentValues) parcel.readParcelable(ContentValues.class.getClassLoader());
        this.mClientIds = parcel.createIntArray();
    }

    private HiDataSourceFetchOption(ContentValues contentValues, int[] iArr) {
        this.mValueHolder = contentValues;
        this.mClientIds = iArr == null ? new int[0] : iArr;
    }

    public Integer getFetchType() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues != null) {
            return contentValues.getAsInteger(FETCH_TYPE);
        }
        return null;
    }

    public int[] getClientIds() {
        return (int[]) this.mClientIds.clone();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mValueHolder, i);
        parcel.writeIntArray(this.mClientIds);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int[] f11795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ContentValues f11796c;

        public Builder c(Integer num) {
            e().put(HiDataSourceFetchOption.FETCH_TYPE, num);
            return this;
        }

        public Builder b(int[] iArr) {
            this.f11795b = (int[]) iArr.clone();
            return this;
        }

        public HiDataSourceFetchOption a() {
            return new HiDataSourceFetchOption(this.f11796c, this.f11795b);
        }

        private ContentValues e() {
            if (this.f11796c == null) {
                this.f11796c = new ContentValues();
            }
            return this.f11796c;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HiDataSourceFetchOption {");
        stringBuffer.append(this.mValueHolder);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
