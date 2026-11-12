package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "PaymentMethodTokenizationParametersCreator")
@SafeParcelable.Reserved({1})
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new zzaa();

    @SafeParcelable.Field(id = 2)
    int zzdl;

    @SafeParcelable.Field(id = 3)
    Bundle zzdn;

    public final class Builder {
        private Builder() {
        }

        public final Builder addParameter(String str, String str2) {
            Preconditions.checkNotEmpty(str, "Tokenization parameter name must not be empty");
            Preconditions.checkNotEmpty(str2, "Tokenization parameter value must not be empty");
            PaymentMethodTokenizationParameters.this.zzdn.putString(str, str2);
            return this;
        }

        public final PaymentMethodTokenizationParameters build() {
            return PaymentMethodTokenizationParameters.this;
        }

        public final Builder setPaymentMethodTokenizationType(int i14) {
            PaymentMethodTokenizationParameters.this.zzdl = i14;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public PaymentMethodTokenizationParameters(@SafeParcelable.Param(id = 2) int i14, @SafeParcelable.Param(id = 3) Bundle bundle) {
        new Bundle();
        this.zzdl = i14;
        this.zzdn = bundle;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final Bundle getParameters() {
        return new Bundle(this.zzdn);
    }

    public final int getPaymentMethodTokenizationType() {
        return this.zzdl;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzdl);
        SafeParcelWriter.writeBundle(parcel, 3, this.zzdn, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private PaymentMethodTokenizationParameters() {
        this.zzdn = new Bundle();
    }
}
