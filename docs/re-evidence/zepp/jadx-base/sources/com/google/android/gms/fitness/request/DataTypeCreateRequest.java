package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.facebook.GraphRequest;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DataTypeCreateRequestCreator")
@SafeParcelable.Reserved({4, 1000})
@Deprecated
public class DataTypeCreateRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<DataTypeCreateRequest> CREATOR = new zzs();

    @SafeParcelable.Field(getter = "getName", id = 1)
    private final String a;

    @SafeParcelable.Field(getter = "getFields", id = 2)
    private final List<Field> b;

    @Nullable
    @SafeParcelable.Field(getter = "getCallbackBinder", id = 3, type = "android.os.IBinder")
    private final com.google.android.gms.internal.fitness.zzbi c;

    @SafeParcelable.Constructor
    public DataTypeCreateRequest(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) List<Field> list, @Nullable @SafeParcelable.Param(id = 3) IBinder iBinder) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = iBinder == null ? null : com.google.android.gms.internal.fitness.zzbl.zze(iBinder);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataTypeCreateRequest)) {
            return false;
        }
        DataTypeCreateRequest dataTypeCreateRequest = (DataTypeCreateRequest) obj;
        return Objects.equal(this.a, dataTypeCreateRequest.a) && Objects.equal(this.b, dataTypeCreateRequest.b);
    }

    @RecentlyNonNull
    public List<Field> getFields() {
        return this.b;
    }

    @RecentlyNonNull
    public String getName() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("name", this.a).add(GraphRequest.FIELDS_PARAM, this.b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeTypedList(parcel, 2, getFields(), false);
        com.google.android.gms.internal.fitness.zzbi zzbiVar = this.c;
        SafeParcelWriter.writeIBinder(parcel, 3, zzbiVar == null ? null : zzbiVar.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public static class Builder {
        private String a;
        private final List<Field> b = new ArrayList();

        @RecentlyNonNull
        public Builder addField(@RecentlyNonNull Field field) {
            if (!this.b.contains(field)) {
                this.b.add(field);
            }
            return this;
        }

        @RecentlyNonNull
        public DataTypeCreateRequest build() {
            Preconditions.checkState(this.a != null, "Must set the name");
            Preconditions.checkState(!this.b.isEmpty(), "Must specify the data fields");
            return new DataTypeCreateRequest(this);
        }

        @RecentlyNonNull
        public Builder setName(@RecentlyNonNull String str) {
            this.a = str;
            return this;
        }

        @RecentlyNonNull
        public Builder addField(@RecentlyNonNull String str, int i) {
            Preconditions.checkArgument((str == null || str.isEmpty()) ? false : true, "Invalid name specified");
            return addField(new Field(str, i));
        }
    }

    private DataTypeCreateRequest(Builder builder) {
        this(builder.a, (List<Field>) builder.b, (com.google.android.gms.internal.fitness.zzbi) null);
    }

    public DataTypeCreateRequest(DataTypeCreateRequest dataTypeCreateRequest, com.google.android.gms.internal.fitness.zzbi zzbiVar) {
        this(dataTypeCreateRequest.a, dataTypeCreateRequest.b, zzbiVar);
    }

    private DataTypeCreateRequest(String str, List<Field> list, @Nullable com.google.android.gms.internal.fitness.zzbi zzbiVar) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = zzbiVar;
    }
}
