package com.xiaomi.xms.wearable.node;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class DataItem implements Parcelable {
    public static final String KEY_BATTERY_STATUS = "battery_status";
    public static final String KEY_CHARGING_STATUS = "charging_status";
    public static final String KEY_CONNECTION_STATUS = "connection_status";
    public static final String KEY_SLEEP_STATUS = "sleep_status";
    public static final String KEY_WARNING_STATUS = "warning_status";
    public static final String KEY_WEARING_STATUS = "wearing_status";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14480a;
    public static final DataItem ITEM_CONNECTION = new DataItem(1);
    public static final DataItem ITEM_CHARGING = new DataItem(2);
    public static final DataItem ITEM_SLEEP = new DataItem(3);
    public static final DataItem ITEM_WEARING = new DataItem(4);
    public static final DataItem ITEM_BATTERY = new DataItem(5);
    public static final DataItem ITEM_WARNING = new DataItem(6);
    public static final Parcelable.Creator<DataItem> CREATOR = new a();

    public class a implements Parcelable.Creator<DataItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataItem createFromParcel(Parcel parcel) {
            return new DataItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataItem[] newArray(int i) {
            return new DataItem[i];
        }
    }

    public DataItem(int i) {
        this.f14480a = i;
    }

    public int a() {
        return this.f14480a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f14480a == ((DataItem) obj).f14480a;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14480a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14480a);
    }

    public DataItem(Parcel parcel) {
        this.f14480a = parcel.readInt();
    }
}
