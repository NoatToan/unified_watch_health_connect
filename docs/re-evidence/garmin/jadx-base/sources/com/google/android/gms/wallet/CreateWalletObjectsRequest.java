package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "CreateWalletObjectsRequestCreator")
@SafeParcelable.Reserved({1})
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new zzg();
    public static final int REQUEST_IMMEDIATE_SAVE = 1;
    public static final int SHOW_SAVE_PROMPT = 0;

    @SafeParcelable.Field(id = 2)
    LoyaltyWalletObject zzao;

    @SafeParcelable.Field(id = 3)
    OfferWalletObject zzap;

    @SafeParcelable.Field(id = 4)
    GiftCardWalletObject zzaq;

    @SafeParcelable.Field(id = 5)
    int zzar;

    public final class Builder {
        private Builder() {
        }

        public final CreateWalletObjectsRequest build() {
            CreateWalletObjectsRequest createWalletObjectsRequest = CreateWalletObjectsRequest.this;
            Preconditions.checkState(((createWalletObjectsRequest.zzaq == null ? 0 : 1) + (createWalletObjectsRequest.zzao == null ? 0 : 1)) + (createWalletObjectsRequest.zzap == null ? 0 : 1) == 1, "CreateWalletObjectsRequest must have exactly one Wallet Object");
            return CreateWalletObjectsRequest.this;
        }

        public final Builder setCreateMode(int i14) {
            CreateWalletObjectsRequest.this.zzar = i14;
            return this;
        }

        public final Builder setGiftCardWalletObject(GiftCardWalletObject giftCardWalletObject) {
            CreateWalletObjectsRequest.this.zzaq = giftCardWalletObject;
            return this;
        }

        public final Builder setLoyaltyWalletObject(LoyaltyWalletObject loyaltyWalletObject) {
            CreateWalletObjectsRequest.this.zzao = loyaltyWalletObject;
            return this;
        }

        public final Builder setOfferWalletObject(OfferWalletObject offerWalletObject) {
            CreateWalletObjectsRequest.this.zzap = offerWalletObject;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CreateMode {
    }

    @SafeParcelable.Constructor
    public CreateWalletObjectsRequest(@SafeParcelable.Param(id = 2) LoyaltyWalletObject loyaltyWalletObject, @SafeParcelable.Param(id = 3) OfferWalletObject offerWalletObject, @SafeParcelable.Param(id = 4) GiftCardWalletObject giftCardWalletObject, @SafeParcelable.Param(id = 5) int i14) {
        this.zzao = loyaltyWalletObject;
        this.zzap = offerWalletObject;
        this.zzaq = giftCardWalletObject;
        this.zzar = i14;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final int getCreateMode() {
        return this.zzar;
    }

    public final GiftCardWalletObject getGiftCardWalletObject() {
        return this.zzaq;
    }

    public final LoyaltyWalletObject getLoyaltyWalletObject() {
        return this.zzao;
    }

    public final OfferWalletObject getOfferWalletObject() {
        return this.zzap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzao, i14, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzap, i14, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzaq, i14, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzar);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public CreateWalletObjectsRequest() {
    }

    @Deprecated
    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject) {
        this.zzao = loyaltyWalletObject;
    }

    @Deprecated
    public CreateWalletObjectsRequest(OfferWalletObject offerWalletObject) {
        this.zzap = offerWalletObject;
    }

    @Deprecated
    public CreateWalletObjectsRequest(GiftCardWalletObject giftCardWalletObject) {
        this.zzaq = giftCardWalletObject;
    }
}
