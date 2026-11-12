package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "GetSignInIntentRequestCreator")
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new zzg();

    @SafeParcelable.Field(getter = "getServerClientId", id = 1)
    private final String a;

    @Nullable
    @SafeParcelable.Field(getter = "getHostedDomainFilter", id = 2)
    private final String b;

    @Nullable
    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    private String c;

    public static final class Builder {
        private String a;

        @Nullable
        private String b;

        @Nullable
        private String c;

        public final GetSignInIntentRequest build() {
            return new GetSignInIntentRequest(this.a, this.b, this.c);
        }

        public final Builder filterByHostedDomain(@Nullable String str) {
            this.b = str;
            return this;
        }

        public final Builder setServerClientId(String str) {
            Preconditions.checkNotNull(str);
            this.a = str;
            return this;
        }

        public final Builder zzf(@Nullable String str) {
            this.c = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public GetSignInIntentRequest(@SafeParcelable.Param(id = 1) String str, @Nullable @SafeParcelable.Param(id = 2) String str2, @Nullable @SafeParcelable.Param(id = 3) String str3) {
        Preconditions.checkNotNull(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder zzc(GetSignInIntentRequest getSignInIntentRequest) {
        Preconditions.checkNotNull(getSignInIntentRequest);
        Builder builderFilterByHostedDomain = builder().setServerClientId(getSignInIntentRequest.getServerClientId()).filterByHostedDomain(getSignInIntentRequest.getHostedDomainFilter());
        String str = getSignInIntentRequest.c;
        if (str != null) {
            builderFilterByHostedDomain.zzf(str);
        }
        return builderFilterByHostedDomain;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return Objects.equal(this.a, getSignInIntentRequest.a) && Objects.equal(this.b, getSignInIntentRequest.b) && Objects.equal(this.c, getSignInIntentRequest.c);
    }

    @Nullable
    public String getHostedDomainFilter() {
        return this.b;
    }

    public String getServerClientId() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 2, getHostedDomainFilter(), false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
