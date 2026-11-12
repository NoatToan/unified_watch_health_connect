package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "CredentialPickerConfigCreator")
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new zze();

    @SafeParcelable.Field(id = 1000)
    private final int a;

    @SafeParcelable.Field(getter = "shouldShowAddAccountButton", id = 1)
    private final boolean b;

    @SafeParcelable.Field(getter = "shouldShowCancelButton", id = 2)
    private final boolean c;

    @SafeParcelable.Field(getter = "isForNewAccount", id = 3)
    @Deprecated
    private final boolean d;

    @SafeParcelable.Field(getter = "getPromptInternalId", id = 4)
    private final int e;

    public static class Builder {
        private boolean a = false;
        private boolean b = true;
        private int c = 1;

        public CredentialPickerConfig build() {
            return new CredentialPickerConfig(this);
        }

        @Deprecated
        public Builder setForNewAccount(boolean z) {
            this.c = z ? 3 : 1;
            return this;
        }

        public Builder setPrompt(int i) {
            this.c = i;
            return this;
        }

        public Builder setShowAddAccountButton(boolean z) {
            this.a = z;
            return this;
        }

        public Builder setShowCancelButton(boolean z) {
            this.b = z;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;
    }

    @SafeParcelable.Constructor
    public CredentialPickerConfig(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z2, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) int i2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        if (i < 2) {
            this.d = z3;
            this.e = z3 ? 3 : 1;
        } else {
            this.d = i2 == 3;
            this.e = i2;
        }
    }

    @Deprecated
    public final boolean isForNewAccount() {
        return this.e == 3;
    }

    public final boolean shouldShowAddAccountButton() {
        return this.b;
    }

    public final boolean shouldShowCancelButton() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, shouldShowAddAccountButton());
        SafeParcelWriter.writeBoolean(parcel, 2, shouldShowCancelButton());
        SafeParcelWriter.writeBoolean(parcel, 3, isForNewAccount());
        SafeParcelWriter.writeInt(parcel, 4, this.e);
        SafeParcelWriter.writeInt(parcel, 1000, this.a);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private CredentialPickerConfig(Builder builder) {
        this(2, builder.a, builder.b, false, builder.c);
    }
}
