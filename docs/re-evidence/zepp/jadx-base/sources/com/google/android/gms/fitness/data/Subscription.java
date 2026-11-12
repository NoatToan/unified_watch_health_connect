package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "SubscriptionCreator")
@SafeParcelable.Reserved({1000})
public class Subscription extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<Subscription> CREATOR = new zzai();

    @SafeParcelable.Field(getter = "getDataSource", id = 1)
    private final DataSource a;

    @SafeParcelable.Field(getter = "getDataType", id = 2)
    private final DataType b;

    @SafeParcelable.Field(getter = "getSamplingRateMicros", id = 3)
    private final long c;

    @SafeParcelable.Field(getter = "getAccuracyMode", id = 4)
    private final int d;

    @SafeParcelable.Field(getter = "getSubscriptionType", id = 5)
    private final int e;

    @ShowFirstParty
    public static class zza {
        private DataSource a;
        private DataType b;
        private long c = -1;
        private int d = 2;
        private int e = 0;

        public final zza zza(DataSource dataSource) {
            this.a = dataSource;
            return this;
        }

        public final Subscription zzr() {
            DataSource dataSource;
            Preconditions.checkState((this.a == null && this.b == null) ? false : true, "Must call setDataSource() or setDataType()");
            DataType dataType = this.b;
            Preconditions.checkState(dataType == null || (dataSource = this.a) == null || dataType.equals(dataSource.getDataType()), "Specified data type is incompatible with specified data source");
            return new Subscription(this.a, this.b, this.c, this.d, 0);
        }

        public final zza zza(DataType dataType) {
            this.b = dataType;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public Subscription(@SafeParcelable.Param(id = 1) DataSource dataSource, @SafeParcelable.Param(id = 2) DataType dataType, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) int i2) {
        this.a = dataSource;
        this.b = dataType;
        this.c = j;
        this.d = i;
        this.e = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return Objects.equal(this.a, subscription.a) && Objects.equal(this.b, subscription.b) && this.c == subscription.c && this.d == subscription.d && this.e == subscription.e;
    }

    @RecentlyNullable
    public DataSource getDataSource() {
        return this.a;
    }

    @RecentlyNullable
    public DataType getDataType() {
        return this.b;
    }

    public int hashCode() {
        DataSource dataSource = this.a;
        return Objects.hashCode(dataSource, dataSource, Long.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e));
    }

    @RecentlyNonNull
    public String toDebugString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        DataSource dataSource = this.a;
        objArr[0] = dataSource == null ? this.b.getName() : dataSource.toDebugString();
        objArr[1] = Integer.valueOf(this.e);
        return String.format(locale, "Subscription{%s}, subscriptionType{%d}", objArr);
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add(ParamKey.dataSource, this.a).add("dataType", this.b).add("samplingIntervalMicros", Long.valueOf(this.c)).add("accuracyMode", Integer.valueOf(this.d)).add("subscriptionType", Integer.valueOf(this.e)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getDataType(), i, false);
        SafeParcelWriter.writeLong(parcel, 3, this.c);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @RecentlyNonNull
    @ShowFirstParty
    public final DataType zzs() {
        DataType dataType = this.b;
        return dataType == null ? this.a.getDataType() : dataType;
    }
}
