package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.zzae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "SessionReadResultCreator")
@SafeParcelable.Reserved({4, 1000})
public class SessionReadResult extends AbstractSafeParcelable implements Result {

    @RecentlyNonNull
    public static final Parcelable.Creator<SessionReadResult> CREATOR = new zzh();

    @SafeParcelable.Field(getter = "getSessions", id = 1)
    private final List<Session> a;

    @SafeParcelable.Field(getter = "getSessionDataSets", id = 2)
    private final List<zzae> b;

    @SafeParcelable.Field(getter = "getStatus", id = 3)
    private final Status c;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SessionReadResult(@RecentlyNonNull @SafeParcelable.Param(id = 1) List<Session> list, @RecentlyNonNull @SafeParcelable.Param(id = 2) List<zzae> list2, @RecentlyNonNull @SafeParcelable.Param(id = 3) Status status) {
        this.a = list;
        this.b = Collections.unmodifiableList(list2);
        this.c = status;
    }

    @RecentlyNonNull
    @ShowFirstParty
    public static SessionReadResult zze(@RecentlyNonNull Status status) {
        return new SessionReadResult(new ArrayList(), new ArrayList(), status);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionReadResult)) {
            return false;
        }
        SessionReadResult sessionReadResult = (SessionReadResult) obj;
        return this.c.equals(sessionReadResult.c) && Objects.equal(this.a, sessionReadResult.a) && Objects.equal(this.b, sessionReadResult.b);
    }

    @RecentlyNonNull
    public List<DataSet> getDataSet(@RecentlyNonNull Session session, @RecentlyNonNull DataType dataType) {
        Preconditions.checkArgument(this.a.contains(session), "Attempting to read data for session %s which was not returned", session);
        ArrayList arrayList = new ArrayList();
        for (zzae zzaeVar : this.b) {
            if (Objects.equal(session, zzaeVar.getSession()) && dataType.equals(zzaeVar.getDataSet().getDataType())) {
                arrayList.add(zzaeVar.getDataSet());
            }
        }
        return arrayList;
    }

    @RecentlyNonNull
    public List<Session> getSessions() {
        return this.a;
    }

    @Override // com.google.android.gms.common.api.Result
    @RecentlyNonNull
    public Status getStatus() {
        return this.c;
    }

    public int hashCode() {
        return Objects.hashCode(this.c, this.a, this.b);
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("status", this.c).add("sessions", this.a).add("sessionDataSets", this.b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getSessions(), false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getStatus(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @RecentlyNonNull
    public List<DataSet> getDataSet(@RecentlyNonNull Session session) {
        Preconditions.checkArgument(this.a.contains(session), "Attempting to read data for session %s which was not returned", session);
        ArrayList arrayList = new ArrayList();
        for (zzae zzaeVar : this.b) {
            if (Objects.equal(session, zzaeVar.getSession())) {
                arrayList.add(zzaeVar.getDataSet());
            }
        }
        return arrayList;
    }
}
