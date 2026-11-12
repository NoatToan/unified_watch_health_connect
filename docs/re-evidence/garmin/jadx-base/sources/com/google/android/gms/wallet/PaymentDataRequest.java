package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.lang3.BooleanUtils;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "PaymentDataRequestCreator")
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new zzw();

    @SafeParcelable.Field(id = 6)
    ArrayList<Integer> zzbu;

    @SafeParcelable.Field(id = 10)
    String zzbw;

    @SafeParcelable.Field(id = 1)
    boolean zzdc;

    @SafeParcelable.Field(id = 2)
    boolean zzdd;

    @SafeParcelable.Field(id = 3)
    CardRequirements zzde;

    @SafeParcelable.Field(id = 4)
    boolean zzdf;

    @SafeParcelable.Field(id = 5)
    ShippingAddressRequirements zzdg;

    @SafeParcelable.Field(id = 7)
    PaymentMethodTokenizationParameters zzdh;

    @SafeParcelable.Field(id = 8)
    TransactionInfo zzdi;

    @SafeParcelable.Field(defaultValue = BooleanUtils.TRUE, id = 9)
    boolean zzdj;

    @Deprecated
    public final class Builder {
        private Builder() {
        }

        public final Builder addAllowedPaymentMethod(int i14) {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzbu == null) {
                paymentDataRequest.zzbu = new ArrayList<>();
            }
            PaymentDataRequest.this.zzbu.add(Integer.valueOf(i14));
            return this;
        }

        public final Builder addAllowedPaymentMethods(Collection<Integer> collection) {
            Preconditions.checkArgument((collection == null || collection.isEmpty()) ? false : true, "allowedPaymentMethods can't be null or empty!");
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzbu == null) {
                paymentDataRequest.zzbu = new ArrayList<>();
            }
            PaymentDataRequest.this.zzbu.addAll(collection);
            return this;
        }

        public final PaymentDataRequest build() {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzbw == null) {
                Preconditions.checkNotNull(paymentDataRequest.zzbu, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                Preconditions.checkNotNull(PaymentDataRequest.this.zzde, "Card requirements must be set!");
                PaymentDataRequest paymentDataRequest2 = PaymentDataRequest.this;
                if (paymentDataRequest2.zzdh != null) {
                    Preconditions.checkNotNull(paymentDataRequest2.zzdi, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return PaymentDataRequest.this;
        }

        public final Builder setCardRequirements(CardRequirements cardRequirements) {
            PaymentDataRequest.this.zzde = cardRequirements;
            return this;
        }

        public final Builder setEmailRequired(boolean z14) {
            PaymentDataRequest.this.zzdc = z14;
            return this;
        }

        public final Builder setPaymentMethodTokenizationParameters(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
            PaymentDataRequest.this.zzdh = paymentMethodTokenizationParameters;
            return this;
        }

        public final Builder setPhoneNumberRequired(boolean z14) {
            PaymentDataRequest.this.zzdd = z14;
            return this;
        }

        public final Builder setShippingAddressRequired(boolean z14) {
            PaymentDataRequest.this.zzdf = z14;
            return this;
        }

        public final Builder setShippingAddressRequirements(ShippingAddressRequirements shippingAddressRequirements) {
            PaymentDataRequest.this.zzdg = shippingAddressRequirements;
            return this;
        }

        public final Builder setTransactionInfo(TransactionInfo transactionInfo) {
            PaymentDataRequest.this.zzdi = transactionInfo;
            return this;
        }

        public final Builder setUiRequired(boolean z14) {
            PaymentDataRequest.this.zzdj = z14;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public PaymentDataRequest(@SafeParcelable.Param(id = 1) boolean z14, @SafeParcelable.Param(id = 2) boolean z15, @SafeParcelable.Param(id = 3) CardRequirements cardRequirements, @SafeParcelable.Param(id = 4) boolean z16, @SafeParcelable.Param(id = 5) ShippingAddressRequirements shippingAddressRequirements, @SafeParcelable.Param(id = 6) ArrayList<Integer> arrayList, @SafeParcelable.Param(id = 7) PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, @SafeParcelable.Param(id = 8) TransactionInfo transactionInfo, @SafeParcelable.Param(id = 9) boolean z17, @SafeParcelable.Param(id = 10) String str) {
        this.zzdc = z14;
        this.zzdd = z15;
        this.zzde = cardRequirements;
        this.zzdf = z16;
        this.zzdg = shippingAddressRequirements;
        this.zzbu = arrayList;
        this.zzdh = paymentMethodTokenizationParameters;
        this.zzdi = transactionInfo;
        this.zzdj = z17;
        this.zzbw = str;
    }

    public static PaymentDataRequest fromJson(String str) {
        Builder builderNewBuilder = newBuilder();
        PaymentDataRequest.this.zzbw = (String) Preconditions.checkNotNull(str, "paymentDataRequestJson cannot be null!");
        return builderNewBuilder.build();
    }

    @Deprecated
    public static Builder newBuilder() {
        return new Builder();
    }

    @Deprecated
    public final ArrayList<Integer> getAllowedPaymentMethods() {
        return this.zzbu;
    }

    @Deprecated
    public final CardRequirements getCardRequirements() {
        return this.zzde;
    }

    @Deprecated
    public final PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters() {
        return this.zzdh;
    }

    @Deprecated
    public final ShippingAddressRequirements getShippingAddressRequirements() {
        return this.zzdg;
    }

    @Deprecated
    public final TransactionInfo getTransactionInfo() {
        return this.zzdi;
    }

    @Deprecated
    public final boolean isEmailRequired() {
        return this.zzdc;
    }

    @Deprecated
    public final boolean isPhoneNumberRequired() {
        return this.zzdd;
    }

    @Deprecated
    public final boolean isShippingAddressRequired() {
        return this.zzdf;
    }

    @Deprecated
    public final boolean isUiRequired() {
        return this.zzdj;
    }

    public final String toJson() {
        return this.zzbw;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zzdc);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdd);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzde, i14, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzdf);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzdg, i14, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.zzbu, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzdh, i14, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzdi, i14, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzdj);
        SafeParcelWriter.writeString(parcel, 10, this.zzbw, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private PaymentDataRequest() {
        this.zzdj = true;
    }
}
