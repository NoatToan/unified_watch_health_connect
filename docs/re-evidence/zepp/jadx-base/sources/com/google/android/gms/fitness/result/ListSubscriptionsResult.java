package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "ListSubscriptionsResultCreator")
@SafeParcelable.Reserved({3, 1000})
@Deprecated
public class ListSubscriptionsResult extends AbstractSafeParcelable implements Result {

    @RecentlyNonNull
    public static final Parcelable.Creator<ListSubscriptionsResult> CREATOR = new zzg();

    @SafeParcelable.Field(getter = "getSubscriptions", id = 1)
    private final List<Subscription> a;

    @SafeParcelable.Field(getter = "getStatus", id = 2)
    private final Status b;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ListSubscriptionsResult(@RecentlyNonNull @SafeParcelable.Param(id = 1) List<Subscription> list, @RecentlyNonNull @SafeParcelable.Param(id = 2) Status status) {
        this.a = list;
        this.b = status;
    }

    @RecentlyNonNull
    @ShowFirstParty
    public static ListSubscriptionsResult zzd(@RecentlyNonNull Status status) {
        return new ListSubscriptionsResult(Collections.emptyList(), status);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListSubscriptionsResult)) {
            return false;
        }
        ListSubscriptionsResult listSubscriptionsResult = (ListSubscriptionsResult) obj;
        return this.b.equals(listSubscriptionsResult.b) && Objects.equal(this.a, listSubscriptionsResult.a);
    }

    @Override // com.google.android.gms.common.api.Result
    @RecentlyNonNull
    public Status getStatus() {
        return this.b;
    }

    @RecentlyNonNull
    public List<Subscription> getSubscriptions() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hashCode(this.b, this.a);
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("status", this.b).add("subscriptions", this.a).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getSubscriptions(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @RecentlyNonNull
    public List<Subscription> getSubscriptions(@RecentlyNonNull DataType dataType) {
        ArrayList arrayList = new ArrayList();
        for (Subscription subscription : this.a) {
            if (dataType.equals(subscription.zzs())) {
                arrayList.add(subscription);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
