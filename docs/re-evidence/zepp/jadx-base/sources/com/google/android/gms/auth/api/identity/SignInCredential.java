package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "SignInCredentialCreator")
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new zzm();

    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String a;

    @Nullable
    @SafeParcelable.Field(getter = "getDisplayName", id = 2)
    private final String b;

    @Nullable
    @SafeParcelable.Field(getter = "getGivenName", id = 3)
    private final String c;

    @Nullable
    @SafeParcelable.Field(getter = "getFamilyName", id = 4)
    private final String d;

    @Nullable
    @SafeParcelable.Field(getter = "getProfilePictureUri", id = 5)
    private final Uri e;

    @Nullable
    @SafeParcelable.Field(getter = "getPassword", id = 6)
    private final String f;

    @Nullable
    @SafeParcelable.Field(getter = "getGoogleIdToken", id = 7)
    private final String g;

    @SafeParcelable.Constructor
    public SignInCredential(@SafeParcelable.Param(id = 1) String str, @Nullable @SafeParcelable.Param(id = 2) String str2, @Nullable @SafeParcelable.Param(id = 3) String str3, @Nullable @SafeParcelable.Param(id = 4) String str4, @Nullable @SafeParcelable.Param(id = 5) Uri uri, @Nullable @SafeParcelable.Param(id = 6) String str5, @Nullable @SafeParcelable.Param(id = 7) String str6) {
        this.a = Preconditions.checkNotEmpty(str);
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return Objects.equal(this.a, signInCredential.a) && Objects.equal(this.b, signInCredential.b) && Objects.equal(this.c, signInCredential.c) && Objects.equal(this.d, signInCredential.d) && Objects.equal(this.e, signInCredential.e) && Objects.equal(this.f, signInCredential.f) && Objects.equal(this.g, signInCredential.g);
    }

    @Nullable
    public final String getDisplayName() {
        return this.b;
    }

    @Nullable
    public final String getFamilyName() {
        return this.d;
    }

    @Nullable
    public final String getGivenName() {
        return this.c;
    }

    @Nullable
    public final String getGoogleIdToken() {
        return this.g;
    }

    public final String getId() {
        return this.a;
    }

    @Nullable
    public final String getPassword() {
        return this.f;
    }

    @Nullable
    public final Uri getProfilePictureUri() {
        return this.e;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        SafeParcelWriter.writeString(parcel, 3, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 4, getFamilyName(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getProfilePictureUri(), i, false);
        SafeParcelWriter.writeString(parcel, 6, getPassword(), false);
        SafeParcelWriter.writeString(parcel, 7, getGoogleIdToken(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
