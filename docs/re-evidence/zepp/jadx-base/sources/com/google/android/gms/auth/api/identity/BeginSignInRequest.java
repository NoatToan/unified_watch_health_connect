package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "BeginSignInRequestCreator")
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getPasswordRequestOptions", id = 1)
    private final PasswordRequestOptions a;

    @SafeParcelable.Field(getter = "getGoogleIdTokenRequestOptions", id = 2)
    private final GoogleIdTokenRequestOptions b;

    @Nullable
    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final String c;

    @SafeParcelable.Field(getter = "isAutoSelectEnabled", id = 4)
    private final boolean d;

    public static final class Builder {
        private PasswordRequestOptions a = PasswordRequestOptions.builder().setSupported(false).build();
        private GoogleIdTokenRequestOptions b = GoogleIdTokenRequestOptions.builder().setSupported(false).build();

        @Nullable
        private String c;
        private boolean d;

        public final BeginSignInRequest build() {
            return new BeginSignInRequest(this.a, this.b, this.c, this.d);
        }

        public final Builder setAutoSelectEnabled(boolean z) {
            this.d = z;
            return this;
        }

        public final Builder setGoogleIdTokenRequestOptions(@NonNull GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.b = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
            return this;
        }

        public final Builder setPasswordRequestOptions(@NonNull PasswordRequestOptions passwordRequestOptions) {
            this.a = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
            return this;
        }

        public final Builder zzd(@NonNull String str) {
            this.c = str;
            return this;
        }
    }

    @SafeParcelable.Class(creator = "GoogleIdTokenRequestOptionsCreator")
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zzh();

        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean a;

        @Nullable
        @SafeParcelable.Field(getter = "getServerClientId", id = 2)
        private final String b;

        @Nullable
        @SafeParcelable.Field(getter = "getNonce", id = 3)
        private final String c;

        @SafeParcelable.Field(getter = "filterByAuthorizedAccounts", id = 4)
        private final boolean d;

        @Nullable
        @SafeParcelable.Field(getter = "getLinkedServiceId", id = 5)
        private final String e;

        @Nullable
        @SafeParcelable.Field(getter = "getIdTokenDepositionScopes", id = 6)
        private final List<String> f;

        public static final class Builder {
            private boolean a = false;

            @Nullable
            private String b = null;

            @Nullable
            private String c = null;
            private boolean d = true;

            @Nullable
            private String e = null;

            @Nullable
            private List<String> f = null;

            public final GoogleIdTokenRequestOptions build() {
                return new GoogleIdTokenRequestOptions(this.a, this.b, this.c, this.d, null, null);
            }

            public final Builder setFilterByAuthorizedAccounts(boolean z) {
                this.d = z;
                return this;
            }

            public final Builder setNonce(@Nullable String str) {
                this.c = str;
                return this;
            }

            public final Builder setServerClientId(@NonNull String str) {
                this.b = Preconditions.checkNotEmpty(str);
                return this;
            }

            public final Builder setSupported(boolean z) {
                this.a = z;
                return this;
            }
        }

        @SafeParcelable.Constructor
        public GoogleIdTokenRequestOptions(@SafeParcelable.Param(id = 1) boolean z, @Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z2, @Nullable @SafeParcelable.Param(id = 5) String str3, @Nullable @SafeParcelable.Param(id = 6) List<String> list) {
            this.a = z;
            if (z) {
                Preconditions.checkNotNull(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.b = str;
            this.c = str2;
            this.d = z2;
            this.f = BeginSignInRequest.a(list);
            this.e = str3;
        }

        public static Builder builder() {
            return new Builder();
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.a == googleIdTokenRequestOptions.a && Objects.equal(this.b, googleIdTokenRequestOptions.b) && Objects.equal(this.c, googleIdTokenRequestOptions.c) && this.d == googleIdTokenRequestOptions.d && Objects.equal(this.e, googleIdTokenRequestOptions.e) && Objects.equal(this.f, googleIdTokenRequestOptions.f);
        }

        public final boolean filterByAuthorizedAccounts() {
            return this.d;
        }

        @Nullable
        public final String getNonce() {
            return this.c;
        }

        @Nullable
        public final String getServerClientId() {
            return this.b;
        }

        public final int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f);
        }

        public final boolean isSupported() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
            SafeParcelWriter.writeString(parcel, 3, getNonce(), false);
            SafeParcelWriter.writeBoolean(parcel, 4, filterByAuthorizedAccounts());
            SafeParcelWriter.writeString(parcel, 5, this.e, false);
            SafeParcelWriter.writeStringList(parcel, 6, this.f, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    @SafeParcelable.Class(creator = "PasswordRequestOptionsCreator")
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zzi();

        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean a;

        public static final class Builder {
            private boolean a = false;

            public final PasswordRequestOptions build() {
                return new PasswordRequestOptions(this.a);
            }

            public final Builder setSupported(boolean z) {
                this.a = z;
                return this;
            }
        }

        @SafeParcelable.Constructor
        public PasswordRequestOptions(@SafeParcelable.Param(id = 1) boolean z) {
            this.a = z;
        }

        public static Builder builder() {
            return new Builder();
        }

        public final boolean equals(@Nullable Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.a == ((PasswordRequestOptions) obj).a;
        }

        public final int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.a));
        }

        public final boolean isSupported() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    @SafeParcelable.Constructor
    public BeginSignInRequest(@SafeParcelable.Param(id = 1) PasswordRequestOptions passwordRequestOptions, @SafeParcelable.Param(id = 2) GoogleIdTokenRequestOptions googleIdTokenRequestOptions, @Nullable @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) boolean z) {
        this.a = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
        this.b = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
        this.c = str;
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static List<String> a(@Nullable List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder zzc(BeginSignInRequest beginSignInRequest) {
        Preconditions.checkNotNull(beginSignInRequest);
        Builder autoSelectEnabled = builder().setGoogleIdTokenRequestOptions(beginSignInRequest.getGoogleIdTokenRequestOptions()).setPasswordRequestOptions(beginSignInRequest.getPasswordRequestOptions()).setAutoSelectEnabled(beginSignInRequest.d);
        String str = beginSignInRequest.c;
        if (str != null) {
            autoSelectEnabled.zzd(str);
        }
        return autoSelectEnabled;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return Objects.equal(this.a, beginSignInRequest.a) && Objects.equal(this.b, beginSignInRequest.b) && Objects.equal(this.c, beginSignInRequest.c) && this.d == beginSignInRequest.d;
    }

    public final GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
        return this.b;
    }

    public final PasswordRequestOptions getPasswordRequestOptions() {
        return this.a;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, Boolean.valueOf(this.d));
    }

    public final boolean isAutoSelectEnabled() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPasswordRequestOptions(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getGoogleIdTokenRequestOptions(), i, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isAutoSelectEnabled());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
