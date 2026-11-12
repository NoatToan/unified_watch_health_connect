package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.alipay.sdk.m.u.i;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.fitness.zzkq;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DataSourceCreator")
@SafeParcelable.Reserved({2, 7, 8, 1000})
public class DataSource extends AbstractSafeParcelable {

    @RecentlyNonNull
    @ShowFirstParty
    public static final Parcelable.Creator<DataSource> CREATOR;

    @RecentlyNonNull
    public static final String EXTRA_DATA_SOURCE = "vnd.google.fitness.data_source";
    public static final int TYPE_DERIVED = 1;
    public static final int TYPE_RAW = 0;
    private static final String g;
    private static final String h;

    @SafeParcelable.Field(getter = "getDataType", id = 1)
    private final DataType a;

    @SafeParcelable.Field(getter = "getType", id = 3)
    private final int b;

    @Nullable
    @SafeParcelable.Field(getter = "getDevice", id = 4)
    private final Device c;

    @Nullable
    @SafeParcelable.Field(getter = "getApplication", id = 5)
    private final zza d;

    @SafeParcelable.Field(getter = "getStreamName", id = 6)
    private final String e;
    private final String f;

    public static final class Builder {
        private DataType a;
        private Device c;
        private zza d;
        private int b = -1;
        private String e = "";

        @RecentlyNonNull
        public final DataSource build() {
            Preconditions.checkState(this.a != null, "Must set data type");
            Preconditions.checkState(this.b >= 0, "Must set data source type");
            return new DataSource(this);
        }

        @RecentlyNonNull
        public final Builder setAppPackageName(@RecentlyNonNull String str) {
            this.d = zza.zza(str);
            return this;
        }

        @RecentlyNonNull
        public final Builder setDataType(@RecentlyNonNull DataType dataType) {
            this.a = dataType;
            return this;
        }

        @RecentlyNonNull
        public final Builder setDevice(@RecentlyNonNull Device device) {
            this.c = device;
            return this;
        }

        @RecentlyNonNull
        public final Builder setStreamName(@RecentlyNonNull String str) {
            Preconditions.checkArgument(str != null, "Must specify a valid stream name");
            this.e = str;
            return this;
        }

        @RecentlyNonNull
        public final Builder setType(int i) {
            this.b = i;
            return this;
        }

        @RecentlyNonNull
        public final Builder setAppPackageName(@RecentlyNonNull Context context) {
            return setAppPackageName(context.getPackageName());
        }
    }

    static {
        String strName = zzkq.zzb.zzc.RAW.name();
        Locale locale = Locale.ROOT;
        g = strName.toLowerCase(locale);
        h = zzkq.zzb.zzc.DERIVED.name().toLowerCase(locale);
        CREATOR = new zzk();
    }

    @SafeParcelable.Constructor
    public DataSource(@SafeParcelable.Param(id = 1) DataType dataType, @SafeParcelable.Param(id = 3) int i, @Nullable @SafeParcelable.Param(id = 4) Device device, @Nullable @SafeParcelable.Param(id = 5) zza zzaVar, @SafeParcelable.Param(id = 6) String str) {
        this.a = dataType;
        this.b = i;
        this.c = device;
        this.d = zzaVar;
        this.e = str;
        StringBuilder sb = new StringBuilder();
        sb.append(a(i));
        sb.append(":");
        sb.append(dataType.getName());
        if (zzaVar != null) {
            sb.append(":");
            sb.append(zzaVar.getPackageName());
        }
        if (device != null) {
            sb.append(":");
            sb.append(device.getStreamIdentifier());
        }
        if (str != null) {
            sb.append(":");
            sb.append(str);
        }
        this.f = sb.toString();
    }

    private static String a(int i) {
        if (i != 0) {
            return i != 1 ? h : h;
        }
        return g;
    }

    @RecentlyNullable
    public static DataSource extract(@RecentlyNonNull Intent intent) {
        if (intent == null) {
            return null;
        }
        return (DataSource) SafeParcelableSerializer.deserializeFromIntentExtra(intent, EXTRA_DATA_SOURCE, CREATOR);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DataSource) {
            return this.f.equals(((DataSource) obj).f);
        }
        return false;
    }

    @RecentlyNullable
    public String getAppPackageName() {
        zza zzaVar = this.d;
        if (zzaVar == null) {
            return null;
        }
        return zzaVar.getPackageName();
    }

    @RecentlyNonNull
    public DataType getDataType() {
        return this.a;
    }

    @RecentlyNullable
    public Device getDevice() {
        return this.c;
    }

    @RecentlyNonNull
    public String getStreamIdentifier() {
        return this.f;
    }

    @RecentlyNonNull
    public String getStreamName() {
        return this.e;
    }

    public int getType() {
        return this.b;
    }

    public int hashCode() {
        return this.f.hashCode();
    }

    @RecentlyNonNull
    @ShowFirstParty
    public final String toDebugString() {
        String str;
        String strConcat;
        String string;
        int i = this.b;
        if (i != 0) {
            str = i != 1 ? "?" : GoogleApiAvailabilityLight.a;
        } else {
            str = "r";
        }
        String strZzm = this.a.zzm();
        zza zzaVar = this.d;
        String strConcat2 = "";
        if (zzaVar == null) {
            strConcat = "";
        } else if (zzaVar.equals(zza.zzlb)) {
            strConcat = ":gms";
        } else {
            String strValueOf = String.valueOf(this.d.getPackageName());
            strConcat = strValueOf.length() != 0 ? ":".concat(strValueOf) : new String(":");
        }
        Device device = this.c;
        if (device != null) {
            String model = device.getModel();
            String uid = this.c.getUid();
            StringBuilder sb = new StringBuilder(String.valueOf(model).length() + 2 + String.valueOf(uid).length());
            sb.append(":");
            sb.append(model);
            sb.append(":");
            sb.append(uid);
            string = sb.toString();
        } else {
            string = "";
        }
        String str2 = this.e;
        if (str2 != null) {
            String strValueOf2 = String.valueOf(str2);
            strConcat2 = strValueOf2.length() != 0 ? ":".concat(strValueOf2) : new String(":");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(strZzm).length() + String.valueOf(strConcat).length() + String.valueOf(string).length() + String.valueOf(strConcat2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(strZzm);
        sb2.append(strConcat);
        sb2.append(string);
        sb2.append(strConcat2);
        return sb2.toString();
    }

    @RecentlyNonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DataSource{");
        sb.append(a(this.b));
        if (this.d != null) {
            sb.append(":");
            sb.append(this.d);
        }
        if (this.c != null) {
            sb.append(":");
            sb.append(this.c);
        }
        if (this.e != null) {
            sb.append(":");
            sb.append(this.e);
        }
        sb.append(":");
        sb.append(this.a);
        sb.append(i.d);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getDataType(), i, false);
        SafeParcelWriter.writeInt(parcel, 3, getType());
        SafeParcelWriter.writeParcelable(parcel, 4, getDevice(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.d, i, false);
        SafeParcelWriter.writeString(parcel, 6, getStreamName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Nullable
    @ShowFirstParty
    public final zza zzj() {
        return this.d;
    }

    private DataSource(Builder builder) {
        this(builder.a, builder.b, builder.c, builder.d, builder.e);
    }
}
