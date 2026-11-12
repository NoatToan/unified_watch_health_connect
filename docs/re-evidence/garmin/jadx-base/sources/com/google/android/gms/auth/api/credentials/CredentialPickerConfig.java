package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "CredentialPickerConfigCreator")
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new zze();

    @SafeParcelable.Field(getter = "shouldShowCancelButton", id = 2)
    private final boolean mShowCancelButton;

    @SafeParcelable.Field(id = 1000)
    private final int zzu;

    @SafeParcelable.Field(getter = "shouldShowAddAccountButton", id = 1)
    private final boolean zzv;

    @SafeParcelable.Field(getter = "isForNewAccount", id = 3)
    @Deprecated
    private final boolean zzw;

    @SafeParcelable.Field(getter = "getPromptInternalId", id = 4)
    private final int zzx;

    public static class Builder {
        private boolean zzv = false;
        private boolean mShowCancelButton = true;
        private int zzy = 1;

        public CredentialPickerConfig build() {
            return new CredentialPickerConfig(this);
        }

        @Deprecated
        public Builder setForNewAccount(boolean z14) {
            this.zzy = z14 ? 3 : 1;
            return this;
        }

        public Builder setPrompt(int i14) {
            this.zzy = i14;
            return this;
        }

        public Builder setShowAddAccountButton(boolean z14) {
            this.zzv = z14;
            return this;
        }

        public Builder setShowCancelButton(boolean z14) {
            this.mShowCancelButton = z14;
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
    public CredentialPickerConfig(@SafeParcelable.Param(id = 1000) int i14, @SafeParcelable.Param(id = 1) boolean z14, @SafeParcelable.Param(id = 2) boolean z15, @SafeParcelable.Param(id = 3) boolean z16, @SafeParcelable.Param(id = 4) int i15) {
        this.zzu = i14;
        this.zzv = z14;
        this.mShowCancelButton = z15;
        if (i14 < 2) {
            this.zzw = z16;
            this.zzx = z16 ? 3 : 1;
        } else {
            this.zzw = i15 == 3;
            this.zzx = i15;
        }
    }

    @Deprecated
    public final boolean isForNewAccount() {
        return this.zzx == 3;
    }

    public final boolean shouldShowAddAccountButton() {
        return this.zzv;
    }

    public final boolean shouldShowCancelButton() {
        return this.mShowCancelButton;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, shouldShowAddAccountButton());
        SafeParcelWriter.writeBoolean(parcel, 2, shouldShowCancelButton());
        SafeParcelWriter.writeBoolean(parcel, 3, isForNewAccount());
        SafeParcelWriter.writeInt(parcel, 4, this.zzx);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzu);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private CredentialPickerConfig(Builder builder) {
        this(2, builder.zzv, builder.mShowCancelButton, false, builder.zzy);
    }
}
