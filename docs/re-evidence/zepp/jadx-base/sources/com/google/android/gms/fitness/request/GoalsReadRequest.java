package com.google.android.gms.fitness.request;

import android.os.IBinder;
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
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.fitness.zzko;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "GoalsReadRequestCreator")
@SafeParcelable.Reserved({1000})
public class GoalsReadRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<GoalsReadRequest> CREATOR = new zzae();

    @Nullable
    @SafeParcelable.Field(getter = "getCallbackBinder", id = 1, type = "android.os.IBinder")
    private final com.google.android.gms.internal.fitness.zzbn a;

    @SafeParcelable.Field(getter = "getDataTypes", id = 2, type = "java.util.List")
    private final List<DataType> b;

    @SafeParcelable.Field(getter = "getObjectiveTypeList", id = 3, type = "java.util.List")
    private final List<Integer> c;

    @SafeParcelable.Field(getter = "getActivities", id = 4, type = "java.util.List")
    private final List<Integer> d;

    public static class Builder {
        private final List<DataType> a = new ArrayList();
        private final List<Integer> b = new ArrayList();
        private final List<Integer> c = new ArrayList();

        @RecentlyNonNull
        public Builder addActivity(@RecentlyNonNull String str) {
            int iZzo = zzko.zzo(str);
            Preconditions.checkState(iZzo != 4, "Attempting to add an unknown activity");
            com.google.android.gms.internal.fitness.zzh.zza(Integer.valueOf(iZzo), this.c);
            return this;
        }

        @RecentlyNonNull
        public Builder addDataType(@RecentlyNonNull DataType dataType) {
            Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            if (!this.a.contains(dataType)) {
                this.a.add(dataType);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder addObjectiveType(int i) {
            boolean z = true;
            if (i != 1 && i != 2 && i != 3) {
                z = false;
            }
            Preconditions.checkState(z, "Attempting to add an invalid objective type");
            if (!this.b.contains(Integer.valueOf(i))) {
                this.b.add(Integer.valueOf(i));
            }
            return this;
        }

        @RecentlyNonNull
        public GoalsReadRequest build() {
            Preconditions.checkState(!this.a.isEmpty(), "At least one data type should be specified.");
            return new GoalsReadRequest(this);
        }
    }

    @SafeParcelable.Constructor
    public GoalsReadRequest(@Nullable @SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) List<DataType> list, @SafeParcelable.Param(id = 3) List<Integer> list2, @SafeParcelable.Param(id = 4) List<Integer> list3) {
        this.a = iBinder == null ? null : com.google.android.gms.internal.fitness.zzbm.zzf(iBinder);
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoalsReadRequest)) {
            return false;
        }
        GoalsReadRequest goalsReadRequest = (GoalsReadRequest) obj;
        return Objects.equal(this.b, goalsReadRequest.b) && Objects.equal(this.c, goalsReadRequest.c) && Objects.equal(this.d, goalsReadRequest.d);
    }

    @RecentlyNullable
    public List<String> getActivityNames() {
        if (this.d.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = this.d.iterator();
        while (it2.hasNext()) {
            arrayList.add(zzko.getName(it2.next().intValue()));
        }
        return arrayList;
    }

    @RecentlyNonNull
    public List<DataType> getDataTypes() {
        return this.b;
    }

    @RecentlyNullable
    public List<Integer> getObjectiveTypes() {
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c;
    }

    public int hashCode() {
        return Objects.hashCode(this.b, this.c, getActivityNames());
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("dataTypes", this.b).add("objectiveTypes", this.c).add("activities", getActivityNames()).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.internal.fitness.zzbn zzbnVar = this.a;
        SafeParcelWriter.writeIBinder(parcel, 1, zzbnVar == null ? null : zzbnVar.asBinder(), false);
        SafeParcelWriter.writeList(parcel, 2, getDataTypes(), false);
        SafeParcelWriter.writeList(parcel, 3, this.c, false);
        SafeParcelWriter.writeList(parcel, 4, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private GoalsReadRequest(Builder builder) {
        this((com.google.android.gms.internal.fitness.zzbn) null, (List<DataType>) builder.a, (List<Integer>) builder.b, (List<Integer>) builder.c);
    }

    public GoalsReadRequest(GoalsReadRequest goalsReadRequest, com.google.android.gms.internal.fitness.zzbn zzbnVar) {
        this(zzbnVar, goalsReadRequest.getDataTypes(), goalsReadRequest.c, goalsReadRequest.d);
    }

    private GoalsReadRequest(@Nullable com.google.android.gms.internal.fitness.zzbn zzbnVar, List<DataType> list, List<Integer> list2, List<Integer> list3) {
        this(zzbnVar == null ? null : zzbnVar.asBinder(), list, list2, list3);
    }
}
