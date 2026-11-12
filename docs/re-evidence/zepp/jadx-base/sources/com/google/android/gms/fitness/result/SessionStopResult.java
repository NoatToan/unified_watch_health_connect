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
import com.google.android.gms.fitness.data.Session;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "SessionStopResultCreator")
@SafeParcelable.Reserved({4, 1000})
public class SessionStopResult extends AbstractSafeParcelable implements Result {

    @RecentlyNonNull
    public static final Parcelable.Creator<SessionStopResult> CREATOR = new zzi();

    @SafeParcelable.Field(getter = "getStatus", id = 2)
    private final Status a;

    @SafeParcelable.Field(getter = "getSessions", id = 3)
    private final List<Session> b;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SessionStopResult(@RecentlyNonNull @SafeParcelable.Param(id = 2) Status status, @RecentlyNonNull @SafeParcelable.Param(id = 3) List<Session> list) {
        this.a = status;
        this.b = Collections.unmodifiableList(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionStopResult)) {
            return false;
        }
        SessionStopResult sessionStopResult = (SessionStopResult) obj;
        return this.a.equals(sessionStopResult.a) && Objects.equal(this.b, sessionStopResult.b);
    }

    @RecentlyNonNull
    public List<Session> getSessions() {
        return this.b;
    }

    @Override // com.google.android.gms.common.api.Result
    @RecentlyNonNull
    public Status getStatus() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("status", this.a).add("sessions", this.b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, getSessions(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
