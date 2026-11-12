package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "TelemetryDataCreator")
public final class zaaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaaa> CREATOR = new zaad();

    @SafeParcelable.Field(getter = "getTelemetryConfigVersion", id = 1)
    private final int a;

    @Nullable
    @SafeParcelable.Field(getter = "getMethodInvocations", id = 2)
    private List<zao> b;

    @SafeParcelable.Constructor
    public zaaa(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) @Nullable List<zao> list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeTypedList(parcel, 2, this.b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zaa() {
        return this.a;
    }

    @Nullable
    public final List<zao> zab() {
        return this.b;
    }

    public final void zaa(zao zaoVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(zaoVar);
    }
}
