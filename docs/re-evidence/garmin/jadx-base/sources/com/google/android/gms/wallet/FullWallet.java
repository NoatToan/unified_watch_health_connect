package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "FullWalletCreator")
@SafeParcelable.Reserved({1})
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new zzi();

    @SafeParcelable.Field(id = 2)
    private String zzat;

    @SafeParcelable.Field(id = 3)
    private String zzau;

    @SafeParcelable.Field(id = 4)
    private zzac zzav;

    @SafeParcelable.Field(id = 5)
    private String zzaw;

    @SafeParcelable.Field(id = 6)
    private zzb zzax;

    @SafeParcelable.Field(id = 7)
    private zzb zzay;

    @SafeParcelable.Field(id = 8)
    private String[] zzaz;

    @SafeParcelable.Field(id = 9)
    private UserAddress zzba;

    @SafeParcelable.Field(id = 10)
    private UserAddress zzbb;

    @SafeParcelable.Field(id = 11)
    private InstrumentInfo[] zzbc;

    @SafeParcelable.Field(id = 12)
    private PaymentMethodToken zzbd;

    @SafeParcelable.Constructor
    public FullWallet(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzac zzacVar, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) zzb zzbVar, @SafeParcelable.Param(id = 7) zzb zzbVar2, @SafeParcelable.Param(id = 8) String[] strArr, @SafeParcelable.Param(id = 9) UserAddress userAddress, @SafeParcelable.Param(id = 10) UserAddress userAddress2, @SafeParcelable.Param(id = 11) InstrumentInfo[] instrumentInfoArr, @SafeParcelable.Param(id = 12) PaymentMethodToken paymentMethodToken) {
        this.zzat = str;
        this.zzau = str2;
        this.zzav = zzacVar;
        this.zzaw = str3;
        this.zzax = zzbVar;
        this.zzay = zzbVar2;
        this.zzaz = strArr;
        this.zzba = userAddress;
        this.zzbb = userAddress2;
        this.zzbc = instrumentInfoArr;
        this.zzbd = paymentMethodToken;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzat, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzau, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzav, i14, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzaw, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzax, i14, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzay, i14, false);
        SafeParcelWriter.writeStringArray(parcel, 8, this.zzaz, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzba, i14, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzbb, i14, false);
        SafeParcelWriter.writeTypedArray(parcel, 11, this.zzbc, i14, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzbd, i14, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private FullWallet() {
    }
}
