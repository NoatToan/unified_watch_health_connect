package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "CredentialCreator")
@SafeParcelable.Reserved({1000})
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new zzc();
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";

    @Nonnull
    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String a;

    @Nullable
    @SafeParcelable.Field(getter = "getName", id = 2)
    private final String b;

    @Nullable
    @SafeParcelable.Field(getter = "getProfilePictureUri", id = 3)
    private final Uri c;

    @Nonnull
    @SafeParcelable.Field(getter = "getIdTokens", id = 4)
    private final List<IdToken> d;

    @Nullable
    @SafeParcelable.Field(getter = "getPassword", id = 5)
    private final String e;

    @Nullable
    @SafeParcelable.Field(getter = "getAccountType", id = 6)
    private final String f;

    @Nullable
    @SafeParcelable.Field(getter = "getGivenName", id = 9)
    private final String g;

    @Nullable
    @SafeParcelable.Field(getter = "getFamilyName", id = 10)
    private final String h;

    @SafeParcelable.Constructor
    public Credential(@SafeParcelable.Param(id = 1) String str, @Nullable @SafeParcelable.Param(id = 2) String str2, @Nullable @SafeParcelable.Param(id = 3) Uri uri, @SafeParcelable.Param(id = 4) List<IdToken> list, @Nullable @SafeParcelable.Param(id = 5) String str3, @Nullable @SafeParcelable.Param(id = 6) String str4, @Nullable @SafeParcelable.Param(id = 9) String str5, @Nullable @SafeParcelable.Param(id = 10) String str6) {
        String strTrim = ((String) Preconditions.checkNotNull(str, "credential identifier cannot be null")).trim();
        Preconditions.checkNotEmpty(strTrim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            boolean z = false;
            if (!TextUtils.isEmpty(str4)) {
                Uri uri2 = Uri.parse(str4);
                if (uri2.isAbsolute() && uri2.isHierarchical() && !TextUtils.isEmpty(uri2.getScheme()) && !TextUtils.isEmpty(uri2.getAuthority()) && ("http".equalsIgnoreCase(uri2.getScheme()) || "https".equalsIgnoreCase(uri2.getScheme()))) {
                    z = true;
                }
            }
            if (!Boolean.valueOf(z).booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.b = str2;
        this.c = uri;
        this.d = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.a = strTrim;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.a, credential.a) && TextUtils.equals(this.b, credential.b) && Objects.equal(this.c, credential.c) && TextUtils.equals(this.e, credential.e) && TextUtils.equals(this.f, credential.f);
    }

    @Nullable
    public String getAccountType() {
        return this.f;
    }

    @Nullable
    public String getFamilyName() {
        return this.h;
    }

    @Nullable
    public String getGivenName() {
        return this.g;
    }

    @Nonnull
    public String getId() {
        return this.a;
    }

    @Nonnull
    public List<IdToken> getIdTokens() {
        return this.d;
    }

    @Nullable
    public String getName() {
        return this.b;
    }

    @Nullable
    public String getPassword() {
        return this.e;
    }

    @Nullable
    public Uri getProfilePictureUri() {
        return this.c;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.e, this.f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getName(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getProfilePictureUri(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 4, getIdTokens(), false);
        SafeParcelWriter.writeString(parcel, 5, getPassword(), false);
        SafeParcelWriter.writeString(parcel, 6, getAccountType(), false);
        SafeParcelWriter.writeString(parcel, 9, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 10, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public static class Builder {
        private final String a;

        @Nullable
        private String b;

        @Nullable
        private Uri c;
        private List<IdToken> d;

        @Nullable
        private String e;

        @Nullable
        private String f;

        @Nullable
        private String g;

        @Nullable
        private String h;

        public Builder(String str) {
            this.a = str;
        }

        public Credential build() {
            return new Credential(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public Builder setAccountType(String str) {
            this.f = str;
            return this;
        }

        public Builder setName(String str) {
            this.b = str;
            return this;
        }

        public Builder setPassword(@Nullable String str) {
            this.e = str;
            return this;
        }

        public Builder setProfilePictureUri(Uri uri) {
            this.c = uri;
            return this;
        }

        public Builder(Credential credential) {
            this.a = credential.a;
            this.b = credential.b;
            this.c = credential.c;
            this.d = credential.d;
            this.e = credential.e;
            this.f = credential.f;
            this.g = credential.g;
            this.h = credential.h;
        }
    }
}
