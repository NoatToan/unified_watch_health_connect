package com.xiaomi.smarthome.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils;

/* JADX INFO: loaded from: classes2.dex */
public class ValueEntry implements Parcelable {
    public static final Parcelable.Creator<ValueEntry> CREATOR = new Parcelable.Creator<ValueEntry>() { // from class: com.xiaomi.smarthome.state.ValueEntry.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ValueEntry createFromParcel(Parcel parcel) {
            return new ValueEntry(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ValueEntry[] newArray(int i) {
            return new ValueEntry[i];
        }
    };
    public long requestTime;
    public long time;
    public long timeIgnore;
    private byte type;
    public byte typeIgnore;
    private Object value;
    public Object valueIgnore;

    private ValueEntry() {
    }

    public static ValueEntry create(byte b2, Object obj, long j) {
        ValueEntry valueEntry = new ValueEntry();
        valueEntry.setValue(obj);
        valueEntry.time = j;
        valueEntry.type = b2;
        return valueEntry;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getTime() {
        return this.time;
    }

    public byte getType() {
        return this.type;
    }

    public Object getValue() {
        return this.value;
    }

    public void setType(byte b2) {
        this.type = b2;
        this.requestTime = System.currentTimeMillis();
    }

    public void setValue(Object obj) {
        this.value = obj;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelUtils.writeValue(parcel, this.value);
        parcel.writeLong(this.time);
    }

    public ValueEntry(Parcel parcel) {
        this.value = ParcelUtils.readValue(parcel, getClass().getClassLoader());
        this.time = parcel.readLong();
    }
}
