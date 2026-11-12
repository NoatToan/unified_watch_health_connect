package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "HintRequestCreator")
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new zzj();

    @SafeParcelable.Field(id = 1000)
    private final int a;

    @SafeParcelable.Field(getter = "getHintPickerConfig", id = 1)
    private final CredentialPickerConfig b;

    @SafeParcelable.Field(getter = "isEmailAddressIdentifierSupported", id = 2)
    private final boolean c;

    @SafeParcelable.Field(getter = "isPhoneNumberIdentifierSupported", id = 3)
    private final boolean d;

    @SafeParcelable.Field(getter = "getAccountTypes", id = 4)
    private final String[] e;

    @SafeParcelable.Field(getter = "isIdTokenRequested", id = 5)
    private final boolean f;

    @Nullable
    @SafeParcelable.Field(getter = "getServerClientId", id = 6)
    private final String g;

    @Nullable
    @SafeParcelable.Field(getter = "getIdTokenNonce", id = 7)
    private final String h;

    public static final class Builder {
        private boolean a;
        private boolean b;
        private String[] c;
        private CredentialPickerConfig d = new CredentialPickerConfig.Builder().build();
        private boolean e = false;

        @Nullable
        private String f;

        @Nullable
        private String g;

        public final HintRequest build() {
            if (this.c == null) {
                this.c = new String[0];
            }
            if (this.a || this.b || this.c.length != 0) {
                return new HintRequest(this);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        public final Builder setAccountTypes(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.c = strArr;
            return this;
        }

        public final Builder setEmailAddressIdentifierSupported(boolean z) {
            this.a = z;
            return this;
        }

        public final Builder setHintPickerConfig(@NonNull CredentialPickerConfig credentialPickerConfig) {
            this.d = (CredentialPickerConfig) Preconditions.checkNotNull(credentialPickerConfig);
            return this;
        }

        public final Builder setIdTokenNonce(@Nullable String str) {
            this.g = str;
            return this;
        }

        public final Builder setIdTokenRequested(boolean z) {
            this.e = z;
            return this;
        }

        public final Builder setPhoneNumberIdentifierSupported(boolean z) {
            this.b = z;
            return this;
        }

        public final Builder setServerClientId(@Nullable String str) {
            this.f = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public HintRequest(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) String[] strArr, @SafeParcelable.Param(id = 5) boolean z3, @Nullable @SafeParcelable.Param(id = 6) String str, @Nullable @SafeParcelable.Param(id = 7) String str2) {
        this.a = i;
        this.b = (CredentialPickerConfig) Preconditions.checkNotNull(credentialPickerConfig);
        this.c = z;
        this.d = z2;
        this.e = (String[]) Preconditions.checkNotNull(strArr);
        if (i < 2) {
            this.f = true;
            this.g = null;
            this.h = null;
        } else {
            this.f = z3;
            this.g = str;
            this.h = str2;
        }
    }

    @NonNull
    public final String[] getAccountTypes() {
        return this.e;
    }

    @NonNull
    public final CredentialPickerConfig getHintPickerConfig() {
        return this.b;
    }

    @Nullable
    public final String getIdTokenNonce() {
        return this.h;
    }

    @Nullable
    public final String getServerClientId() {
        return this.g;
    }

    public final boolean isEmailAddressIdentifierSupported() {
        return this.c;
    }

    public final boolean isIdTokenRequested() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getHintPickerConfig(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, isEmailAddressIdentifierSupported());
        SafeParcelWriter.writeBoolean(parcel, 3, this.d);
        SafeParcelWriter.writeStringArray(parcel, 4, getAccountTypes(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
        SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.a);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private HintRequest(Builder builder) {
        this(2, builder.d, builder.a, builder.b, builder.c, builder.e, builder.f, builder.g);
    }
}
