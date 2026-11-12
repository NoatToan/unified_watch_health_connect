package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "ShippingAddressRequirementsCreator")
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new zzag();

    @SafeParcelable.Field(id = 1)
    ArrayList<String> zzdv;

    public final class Builder {
        private Builder() {
        }

        public final Builder addAllowedCountryCode(String str) {
            Preconditions.checkNotEmpty(str, "allowedCountryCode can't be null or empty! If you don't have restrictions, just leave it unset.");
            ShippingAddressRequirements shippingAddressRequirements = ShippingAddressRequirements.this;
            if (shippingAddressRequirements.zzdv == null) {
                shippingAddressRequirements.zzdv = new ArrayList<>();
            }
            ShippingAddressRequirements.this.zzdv.add(str);
            return this;
        }

        public final Builder addAllowedCountryCodes(Collection<String> collection) {
            if (collection == null || collection.isEmpty()) {
                h.s("allowedCountryCodes can't be null or empty! If you don't have restrictions, just leave it unset.");
                return null;
            }
            ShippingAddressRequirements shippingAddressRequirements = ShippingAddressRequirements.this;
            if (shippingAddressRequirements.zzdv == null) {
                shippingAddressRequirements.zzdv = new ArrayList<>();
            }
            ShippingAddressRequirements.this.zzdv.addAll(collection);
            return this;
        }

        public final ShippingAddressRequirements build() {
            return ShippingAddressRequirements.this;
        }
    }

    @SafeParcelable.Constructor
    public ShippingAddressRequirements(@SafeParcelable.Param(id = 1) ArrayList<String> arrayList) {
        this.zzdv = arrayList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final ArrayList<String> getAllowedCountryCodes() {
        return this.zzdv;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.zzdv, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private ShippingAddressRequirements() {
    }
}
