package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Goal;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "GoalsResultCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
public class GoalsResult extends AbstractSafeParcelable implements Result {

    @RecentlyNonNull
    public static final Parcelable.Creator<GoalsResult> CREATOR = new zzf();

    @SafeParcelable.Field(getter = "getStatus", id = 1)
    private final Status a;

    @SafeParcelable.Field(getter = "getGoals", id = 2)
    private final List<Goal> b;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public GoalsResult(@RecentlyNonNull @SafeParcelable.Param(id = 1) Status status, @RecentlyNonNull @SafeParcelable.Param(id = 2) List<Goal> list) {
        this.a = status;
        this.b = list;
    }

    @RecentlyNonNull
    public List<Goal> getGoals() {
        return this.b;
    }

    @Override // com.google.android.gms.common.api.Result
    @RecentlyNonNull
    public Status getStatus() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 2, getGoals(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
