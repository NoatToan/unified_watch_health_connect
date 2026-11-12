package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "LoyaltyPointsBalanceCreator")
@SafeParcelable.Reserved({1})
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new zzi();

    @SafeParcelable.Field(id = 5)
    String zzbl;

    @SafeParcelable.Field(id = 2)
    int zzfa;

    @SafeParcelable.Field(id = 3)
    String zzfb;

    @SafeParcelable.Field(id = 4)
    double zzfc;

    @SafeParcelable.Field(id = 6)
    long zzfd;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.wallet.wobs.LoyaltyPointsBalance.Type.UNDEFINED", id = 7)
    int zzfe;

    public final class Builder {
        private Builder() {
        }

        public final LoyaltyPointsBalance build() {
            return LoyaltyPointsBalance.this;
        }

        public final Builder setDouble(double d14) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzfc = d14;
            loyaltyPointsBalance.zzfe = 2;
            return this;
        }

        public final Builder setInt(int i14) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzfa = i14;
            loyaltyPointsBalance.zzfe = 0;
            return this;
        }

        public final Builder setMoney(String str, long j8) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzbl = str;
            loyaltyPointsBalance.zzfd = j8;
            loyaltyPointsBalance.zzfe = 3;
            return this;
        }

        public final Builder setString(String str) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzfb = str;
            loyaltyPointsBalance.zzfe = 1;
            return this;
        }
    }

    public interface Type {
        public static final int DOUBLE = 2;
        public static final int INT = 0;
        public static final int MONEY = 3;
        public static final int STRING = 1;
        public static final int UNDEFINED = -1;
    }

    @SafeParcelable.Constructor
    public LoyaltyPointsBalance(@SafeParcelable.Param(id = 2) int i14, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) double d14, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) long j8, @SafeParcelable.Param(id = 7) int i15) {
        this.zzfa = i14;
        this.zzfb = str;
        this.zzfc = d14;
        this.zzbl = str2;
        this.zzfd = j8;
        this.zzfe = i15;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final String getCurrencyCode() {
        return this.zzbl;
    }

    public final long getCurrencyMicros() {
        return this.zzfd;
    }

    public final double getDouble() {
        return this.zzfc;
    }

    public final int getInt() {
        return this.zzfa;
    }

    public final String getString() {
        return this.zzfb;
    }

    public final int getType() {
        return this.zzfe;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzfa);
        SafeParcelWriter.writeString(parcel, 3, this.zzfb, false);
        SafeParcelWriter.writeDouble(parcel, 4, this.zzfc);
        SafeParcelWriter.writeString(parcel, 5, this.zzbl, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zzfd);
        SafeParcelWriter.writeInt(parcel, 7, this.zzfe);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public LoyaltyPointsBalance() {
        this.zzfe = -1;
        this.zzfa = -1;
        this.zzfc = -1.0d;
    }
}
