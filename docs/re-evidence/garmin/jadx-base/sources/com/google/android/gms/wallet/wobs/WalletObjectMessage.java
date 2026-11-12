package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "WalletObjectMessageCreator")
@SafeParcelable.Reserved({1})
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new zzn();

    @SafeParcelable.Field(id = 2)
    String zzfg;

    @SafeParcelable.Field(id = 3)
    String zzfh;

    @SafeParcelable.Field(id = 4)
    TimeInterval zzfl;

    @SafeParcelable.Field(id = 5)
    @Deprecated
    UriData zzfm;

    @SafeParcelable.Field(id = 6)
    @Deprecated
    UriData zzfn;

    public final class Builder {
        private Builder() {
        }

        public final WalletObjectMessage build() {
            return WalletObjectMessage.this;
        }

        @Deprecated
        public final Builder setActionUri(UriData uriData) {
            WalletObjectMessage.this.zzfm = uriData;
            return this;
        }

        public final Builder setBody(String str) {
            WalletObjectMessage.this.zzfh = str;
            return this;
        }

        public final Builder setDisplayInterval(TimeInterval timeInterval) {
            WalletObjectMessage.this.zzfl = timeInterval;
            return this;
        }

        public final Builder setHeader(String str) {
            WalletObjectMessage.this.zzfg = str;
            return this;
        }

        @Deprecated
        public final Builder setImageUri(UriData uriData) {
            WalletObjectMessage.this.zzfn = uriData;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public WalletObjectMessage(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) TimeInterval timeInterval, @SafeParcelable.Param(id = 5) UriData uriData, @SafeParcelable.Param(id = 6) UriData uriData2) {
        this.zzfg = str;
        this.zzfh = str2;
        this.zzfl = timeInterval;
        this.zzfm = uriData;
        this.zzfn = uriData2;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Deprecated
    public final UriData getActionUri() {
        return this.zzfm;
    }

    public final String getBody() {
        return this.zzfh;
    }

    public final TimeInterval getDisplayInterval() {
        return this.zzfl;
    }

    public final String getHeader() {
        return this.zzfg;
    }

    @Deprecated
    public final UriData getImageUri() {
        return this.zzfn;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzfg, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzfh, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzfl, i14, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzfm, i14, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzfn, i14, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public WalletObjectMessage() {
    }
}
