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

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "SavePasswordRequestCreator")
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new zzj();

    @SafeParcelable.Field(getter = "getSignInPassword", id = 1)
    private final SignInPassword a;

    @Nullable
    @SafeParcelable.Field(getter = "getSessionId", id = 2)
    private final String b;

    public static final class Builder {
        private SignInPassword a;

        @Nullable
        private String b;

        public final SavePasswordRequest build() {
            return new SavePasswordRequest(this.a, this.b);
        }

        public final Builder setSignInPassword(@NonNull SignInPassword signInPassword) {
            this.a = signInPassword;
            return this;
        }

        public final Builder zzg(@NonNull String str) {
            this.b = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public SavePasswordRequest(@SafeParcelable.Param(id = 1) SignInPassword signInPassword, @Nullable @SafeParcelable.Param(id = 2) String str) {
        this.a = (SignInPassword) Preconditions.checkNotNull(signInPassword);
        this.b = str;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder zzc(SavePasswordRequest savePasswordRequest) {
        Preconditions.checkNotNull(savePasswordRequest);
        Builder signInPassword = builder().setSignInPassword(savePasswordRequest.getSignInPassword());
        String str = savePasswordRequest.b;
        if (str != null) {
            signInPassword.zzg(str);
        }
        return signInPassword;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return Objects.equal(this.a, savePasswordRequest.a) && Objects.equal(this.b, savePasswordRequest.b);
    }

    public SignInPassword getSignInPassword() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getSignInPassword(), i, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
