package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.fitness.zzcm;
import com.google.android.gms.internal.fitness.zzcn;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "StartBleScanRequestCreator")
@SafeParcelable.Reserved({5, 1000})
@Deprecated
public class StartBleScanRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<StartBleScanRequest> CREATOR = new zzbh();

    @SafeParcelable.Field(getter = "getDataTypes", id = 1)
    private final List<DataType> a;

    @Nullable
    @SafeParcelable.Field(getter = "getBleScanCallbackBinder", id = 2, type = "android.os.IBinder")
    private final zzad b;

    @SafeParcelable.Field(getter = "getTimeoutSecs", id = 3)
    private final int c;

    @Nullable
    @SafeParcelable.Field(getter = "getCallbackBinder", id = 4, type = "android.os.IBinder")
    private final zzcn d;

    @Nullable
    private final BleScanCallback e;

    public static class Builder {
        private BleScanCallback b;
        private DataType[] a = new DataType[0];
        private int c = 10;

        @RecentlyNonNull
        public StartBleScanRequest build() {
            Preconditions.checkState(this.b != null, "Must set BleScanCallback");
            return new StartBleScanRequest(ArrayUtils.toArrayList(this.a), this.b, this.c);
        }

        @RecentlyNonNull
        public Builder setBleScanCallback(@RecentlyNonNull BleScanCallback bleScanCallback) {
            this.b = bleScanCallback;
            return this;
        }

        @RecentlyNonNull
        public Builder setDataTypes(@RecentlyNonNull DataType... dataTypeArr) {
            this.a = dataTypeArr;
            return this;
        }

        @RecentlyNonNull
        public Builder setTimeoutSecs(int i) {
            Preconditions.checkArgument(i > 0, "Stop time must be greater than zero");
            Preconditions.checkArgument(i <= 60, "Stop time must be less than 1 minute");
            this.c = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public StartBleScanRequest(@SafeParcelable.Param(id = 1) List<DataType> list, @Nullable @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) int i, @Nullable @SafeParcelable.Param(id = 4) IBinder iBinder2) {
        zzad zzafVar;
        this.a = list;
        if (iBinder == null) {
            zzafVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            zzafVar = iInterfaceQueryLocalInterface instanceof zzad ? (zzad) iInterfaceQueryLocalInterface : new zzaf(iBinder);
        }
        this.b = zzafVar;
        this.c = i;
        this.d = iBinder2 == null ? null : zzcm.zzj(iBinder2);
        this.e = null;
    }

    @RecentlyNonNull
    public List<DataType> getDataTypes() {
        return Collections.unmodifiableList(this.a);
    }

    public int getTimeoutSecs() {
        return this.c;
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("dataTypes", this.a).add("timeoutSecs", Integer.valueOf(this.c)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getDataTypes(), false);
        zzad zzadVar = this.b;
        SafeParcelWriter.writeIBinder(parcel, 2, zzadVar == null ? null : zzadVar.asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 3, getTimeoutSecs());
        zzcn zzcnVar = this.d;
        SafeParcelWriter.writeIBinder(parcel, 4, zzcnVar != null ? zzcnVar.asBinder() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @RecentlyNullable
    public final BleScanCallback zzaa() {
        return this.e;
    }

    private StartBleScanRequest(List<DataType> list, BleScanCallback bleScanCallback, int i) {
        this.a = list;
        this.b = null;
        this.c = i;
        this.d = null;
        this.e = bleScanCallback;
    }

    public StartBleScanRequest(List<DataType> list, @Nullable zzad zzadVar, int i, @Nullable zzcn zzcnVar) {
        this.a = list;
        this.b = zzadVar;
        this.c = i;
        this.d = zzcnVar;
        this.e = null;
    }
}
