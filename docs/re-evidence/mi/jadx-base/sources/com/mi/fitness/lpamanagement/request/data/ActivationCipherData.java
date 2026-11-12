package com.mi.fitness.lpamanagement.request.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/mi/fitness/lpamanagement/request/data/ActivationCipherData;", "", "mCiphertext", "", "mCiphertextSign", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMCiphertext", "()Ljava/lang/String;", "getMCiphertextSign", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivationCipherData {

    @NotNull
    private final String mCiphertext;

    @NotNull
    private final String mCiphertextSign;

    public ActivationCipherData(@NotNull String mCiphertext, @NotNull String mCiphertextSign) {
        Intrinsics.checkNotNullParameter(mCiphertext, "mCiphertext");
        Intrinsics.checkNotNullParameter(mCiphertextSign, "mCiphertextSign");
        this.mCiphertext = mCiphertext;
        this.mCiphertextSign = mCiphertextSign;
    }

    public static /* synthetic */ ActivationCipherData copy$default(ActivationCipherData activationCipherData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activationCipherData.mCiphertext;
        }
        if ((i & 2) != 0) {
            str2 = activationCipherData.mCiphertextSign;
        }
        return activationCipherData.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMCiphertext() {
        return this.mCiphertext;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMCiphertextSign() {
        return this.mCiphertextSign;
    }

    @NotNull
    public final ActivationCipherData copy(@NotNull String mCiphertext, @NotNull String mCiphertextSign) {
        Intrinsics.checkNotNullParameter(mCiphertext, "mCiphertext");
        Intrinsics.checkNotNullParameter(mCiphertextSign, "mCiphertextSign");
        return new ActivationCipherData(mCiphertext, mCiphertextSign);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivationCipherData)) {
            return false;
        }
        ActivationCipherData activationCipherData = (ActivationCipherData) other;
        return Intrinsics.areEqual(this.mCiphertext, activationCipherData.mCiphertext) && Intrinsics.areEqual(this.mCiphertextSign, activationCipherData.mCiphertextSign);
    }

    @NotNull
    public final String getMCiphertext() {
        return this.mCiphertext;
    }

    @NotNull
    public final String getMCiphertextSign() {
        return this.mCiphertextSign;
    }

    public int hashCode() {
        return (this.mCiphertext.hashCode() * 31) + this.mCiphertextSign.hashCode();
    }

    @NotNull
    public String toString() {
        return "ActivationCipherData(mCiphertext=" + this.mCiphertext + ", mCiphertextSign=" + this.mCiphertextSign + ")";
    }
}
