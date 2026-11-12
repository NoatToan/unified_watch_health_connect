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
@SafeParcelable.Class(creator = "CardRequirementsCreator")
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRequirements> CREATOR = new zze();

    @SafeParcelable.Field(id = 1)
    ArrayList<Integer> zzaj;

    @SafeParcelable.Field(defaultValue = BooleanUtils.TRUE, id = 2)
    boolean zzak;

    @SafeParcelable.Field(id = 3)
    boolean zzal;

    @SafeParcelable.Field(id = 4)
    int zzam;

    public final class Builder {
        private Builder() {
        }

        public final Builder addAllowedCardNetwork(int i14) {
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.zzaj == null) {
                cardRequirements.zzaj = new ArrayList<>();
            }
            CardRequirements.this.zzaj.add(Integer.valueOf(i14));
            return this;
        }

        public final Builder addAllowedCardNetworks(Collection<Integer> collection) {
            Preconditions.checkArgument((collection == null || collection.isEmpty()) ? false : true, "allowedCardNetworks can't be null or empty! You must provide a valid value from WalletConstants.CardNetwork.");
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.zzaj == null) {
                cardRequirements.zzaj = new ArrayList<>();
            }
            CardRequirements.this.zzaj.addAll(collection);
            return this;
        }

        public final CardRequirements build() {
            Preconditions.checkNotNull(CardRequirements.this.zzaj, "Allowed card networks must be non-empty! You can set it through addAllowedCardNetwork() or addAllowedCardNetworks() in the CardRequirements Builder.");
            return CardRequirements.this;
        }

        public final Builder setAllowPrepaidCards(boolean z14) {
            CardRequirements.this.zzak = z14;
            return this;
        }

        public final Builder setBillingAddressFormat(int i14) {
            CardRequirements.this.zzam = i14;
            return this;
        }

        public final Builder setBillingAddressRequired(boolean z14) {
            CardRequirements.this.zzal = z14;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CardRequirements(@SafeParcelable.Param(id = 1) ArrayList<Integer> arrayList, @SafeParcelable.Param(id = 2) boolean z14, @SafeParcelable.Param(id = 3) boolean z15, @SafeParcelable.Param(id = 4) int i14) {
        this.zzaj = arrayList;
        this.zzak = z14;
        this.zzal = z15;
        this.zzam = i14;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final boolean allowPrepaidCards() {
        return this.zzak;
    }

    public final ArrayList<Integer> getAllowedCardNetworks() {
        return this.zzaj;
    }

    public final int getBillingAddressFormat() {
        return this.zzam;
    }

    public final boolean isBillingAddressRequired() {
        return this.zzal;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, this.zzaj, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzak);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzal);
        SafeParcelWriter.writeInt(parcel, 4, this.zzam);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private CardRequirements() {
        this.zzak = true;
    }
}
