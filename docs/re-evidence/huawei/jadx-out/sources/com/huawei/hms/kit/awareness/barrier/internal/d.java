package com.huawei.hms.kit.awareness.barrier.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.barrier.BarrierStatus;
import com.huawei.hms.kit.awareness.internal.communication.Constants;

/* JADX INFO: loaded from: classes34.dex */
public class d extends BarrierStatus implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f13976c;
    private final String d;

    @Override // com.huawei.hms.kit.awareness.barrier.BarrierStatus, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13974a);
        parcel.writeInt(this.f13975b);
        parcel.writeLong(this.f13976c);
        parcel.writeString(this.d);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.BarrierStatus
    public int getPresentStatus() {
        return this.f13974a;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.BarrierStatus
    public int getLastStatus() {
        return this.f13975b;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.BarrierStatus
    public long getLastBarrierUpdateTime() {
        return this.f13976c;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.BarrierStatus
    public String getBarrierLabel() {
        return this.d;
    }

    public Intent c() {
        return b(null);
    }

    public Intent b(String str) {
        Intent intent = new Intent();
        if (!com.huawei.hms.kit.awareness.barrier.internal.f.c.a(str)) {
            intent.setAction(Constants.ACTION_INNER_BARRIER_TRIGGER);
            intent.setPackage(str);
        }
        intent.putExtra("context_barrier_current_state", this.f13974a);
        intent.putExtra("context_barrier_previous_state", this.f13975b);
        intent.putExtra("context_barrier_last_updated_time", getLastBarrierUpdateTime());
        intent.putExtra("context_barrier_key", getBarrierLabel());
        return intent;
    }

    public void a(long j) {
        this.f13976c = j;
    }

    public void a(int i) {
        this.f13975b = this.f13974a;
        this.f13974a = i;
    }

    public static d a(String str) {
        return new d(2, 2, System.currentTimeMillis(), str);
    }

    public static d a(Parcel parcel) {
        return new d(parcel);
    }

    public static d a(int i, int i2, long j, String str) {
        return new d(i, i2, j, str);
    }

    private d(Parcel parcel) {
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        this.f13974a = i;
        this.f13975b = i2;
        this.f13976c = parcel.readLong();
        this.d = parcel.readString();
    }

    private d(int i, int i2, long j, String str) {
        this.f13974a = i;
        this.f13975b = i2;
        this.f13976c = j;
        this.d = str;
    }
}
