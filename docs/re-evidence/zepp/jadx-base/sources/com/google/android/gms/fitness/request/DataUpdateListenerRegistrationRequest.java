package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.fitness.zzcm;
import com.google.android.gms.internal.fitness.zzcn;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DataUpdateListenerRegistrationRequestCreator")
@SafeParcelable.Reserved({1000})
public class DataUpdateListenerRegistrationRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<DataUpdateListenerRegistrationRequest> CREATOR = new zzw();

    @Nullable
    @SafeParcelable.Field(getter = "getDataSource", id = 1)
    private final DataSource a;

    @Nullable
    @SafeParcelable.Field(getter = "getDataType", id = 2)
    private final DataType b;

    @Nullable
    @SafeParcelable.Field(getter = "getIntent", id = 3)
    private final PendingIntent c;

    @Nullable
    @SafeParcelable.Field(getter = "getCallbackBinder", id = 4, type = "android.os.IBinder")
    private final zzcn d;

    public static class Builder {
        private DataSource a;
        private DataType b;
        private PendingIntent c;

        @RecentlyNonNull
        public DataUpdateListenerRegistrationRequest build() {
            Preconditions.checkState((this.a == null && this.b == null) ? false : true, "Set either dataSource or dataTYpe");
            Preconditions.checkNotNull(this.c, "pendingIntent must be set");
            return new DataUpdateListenerRegistrationRequest(this);
        }

        @RecentlyNonNull
        public Builder setDataSource(@RecentlyNonNull DataSource dataSource) {
            Preconditions.checkNotNull(dataSource);
            this.a = dataSource;
            return this;
        }

        @RecentlyNonNull
        public Builder setDataType(@RecentlyNonNull DataType dataType) {
            Preconditions.checkNotNull(dataType);
            this.b = dataType;
            return this;
        }

        @RecentlyNonNull
        public Builder setPendingIntent(@RecentlyNonNull PendingIntent pendingIntent) {
            Preconditions.checkNotNull(pendingIntent);
            this.c = pendingIntent;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public DataUpdateListenerRegistrationRequest(@Nullable @SafeParcelable.Param(id = 1) DataSource dataSource, @Nullable @SafeParcelable.Param(id = 2) DataType dataType, @Nullable @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @Nullable @SafeParcelable.Param(id = 4) IBinder iBinder) {
        this.a = dataSource;
        this.b = dataType;
        this.c = pendingIntent;
        this.d = iBinder == null ? null : zzcm.zzj(iBinder);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataUpdateListenerRegistrationRequest)) {
            return false;
        }
        DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest = (DataUpdateListenerRegistrationRequest) obj;
        return Objects.equal(this.a, dataUpdateListenerRegistrationRequest.a) && Objects.equal(this.b, dataUpdateListenerRegistrationRequest.b) && Objects.equal(this.c, dataUpdateListenerRegistrationRequest.c);
    }

    @RecentlyNullable
    public DataSource getDataSource() {
        return this.a;
    }

    @RecentlyNullable
    public DataType getDataType() {
        return this.b;
    }

    @RecentlyNullable
    public PendingIntent getIntent() {
        return this.c;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c);
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add(ParamKey.dataSource, this.a).add("dataType", this.b).add(BaseGmsClient.KEY_PENDING_INTENT, this.c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getDataType(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getIntent(), i, false);
        zzcn zzcnVar = this.d;
        SafeParcelWriter.writeIBinder(parcel, 4, zzcnVar == null ? null : zzcnVar.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public DataUpdateListenerRegistrationRequest(@RecentlyNonNull DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest, @Nullable IBinder iBinder) {
        this(dataUpdateListenerRegistrationRequest.a, dataUpdateListenerRegistrationRequest.b, dataUpdateListenerRegistrationRequest.c, iBinder);
    }

    private DataUpdateListenerRegistrationRequest(Builder builder) {
        this(builder.a, builder.b, builder.c, null);
    }
}
