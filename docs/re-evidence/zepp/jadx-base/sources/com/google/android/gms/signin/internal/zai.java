package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "RecordConsentByConsentResultResponseCreator")
public final class zai extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zai> CREATOR = new zah();

    @SafeParcelable.Field(getter = "getGrantedScopes", id = 1)
    private final List<String> a;

    @Nullable
    @SafeParcelable.Field(getter = "getToken", id = 2)
    private final String b;

    @SafeParcelable.Constructor
    public zai(@SafeParcelable.Param(id = 1) List<String> list, @Nullable @SafeParcelable.Param(id = 2) String str) {
        this.a = list;
        this.b = str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.b != null ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
