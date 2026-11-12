package com.huawei.hihealthkit;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hihealthkit.data.type.AggregateType;
import com.huawei.hihealthkit.data.type.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthDataQueryOption implements Parcelable {
    private static final int ARRAY_MAX_SIZE = 65535;
    public static final Parcelable.Creator<HiHealthDataQueryOption> CREATOR = new Parcelable.Creator<HiHealthDataQueryOption>() { // from class: com.huawei.hihealthkit.HiHealthDataQueryOption.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HiHealthDataQueryOption createFromParcel(Parcel parcel) {
            return new HiHealthDataQueryOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HiHealthDataQueryOption[] newArray(int i) {
            if (i > 65535 || i < 0) {
                return null;
            }
            return new HiHealthDataQueryOption[i];
        }
    };
    private static final String TAG = "HiHealthDataQueryOption";
    private AggregateType mAggregateType;
    private String mDeviceUuid;
    private int mGroupUnitSize;
    private TimeUnit mGroupUnitType;
    private int mLimit;
    private int mOffset;
    private int mOrder;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected HiHealthDataQueryOption(Parcel parcel) {
        this.mDeviceUuid = "";
        if (parcel == null) {
            Log.w(TAG, "HiHealthDataQueryOption in == null.");
            return;
        }
        this.mLimit = parcel.readInt();
        this.mOffset = parcel.readInt();
        this.mOrder = parcel.readInt();
    }

    public HiHealthDataQueryOption() {
        this.mDeviceUuid = "";
    }

    public HiHealthDataQueryOption(int i, int i2, int i3) {
        this.mDeviceUuid = "";
        this.mLimit = i;
        this.mOffset = i2;
        this.mOrder = i3;
    }

    /* JADX INFO: loaded from: classes33.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AggregateType f12342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f12343c = "";
        private TimeUnit d;
        private int e;
        private int f;
        private int j;
    }

    private HiHealthDataQueryOption(b bVar) {
        this.mDeviceUuid = "";
        this.mAggregateType = bVar.f12342b;
        this.mGroupUnitSize = bVar.e;
        this.mGroupUnitType = bVar.d;
        this.mLimit = bVar.f12341a;
        this.mOffset = bVar.f;
        this.mOrder = bVar.j;
        this.mDeviceUuid = bVar.f12343c;
    }

    public int getLimit() {
        return this.mLimit;
    }

    public void setLimit(int i) {
        this.mLimit = i;
    }

    public int getOffset() {
        return this.mOffset;
    }

    public void setOffset(int i) {
        this.mOffset = i;
    }

    public int getOrder() {
        return this.mOrder;
    }

    public void setOrder(int i) {
        this.mOrder = i;
    }

    public AggregateType getAggregateType() {
        return this.mAggregateType;
    }

    public int getGroupUnitSize() {
        return this.mGroupUnitSize;
    }

    public TimeUnit getGroupUnitType() {
        return this.mGroupUnitType;
    }

    public String getDeviceUuid() {
        return this.mDeviceUuid;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Log.w(TAG, "writeToParcel dest == null.");
            return;
        }
        parcel.writeInt(this.mLimit);
        parcel.writeInt(this.mOffset);
        parcel.writeInt(this.mOrder);
    }
}
