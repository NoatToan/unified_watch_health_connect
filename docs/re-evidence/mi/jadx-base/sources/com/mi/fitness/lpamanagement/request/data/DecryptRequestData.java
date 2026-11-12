package com.mi.fitness.lpamanagement.request.data;

import com.xiaomi.account.openauth.AuthorizeActivityBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/mi/fitness/lpamanagement/request/data/DecryptRequestData;", "", AuthorizeActivityBase.KEY_OPERATOR, "", "cipher_text", "", "<init>", "(ILjava/lang/String;)V", "getOperator", "()I", "getCipher_text", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DecryptRequestData {

    @NotNull
    private final String cipher_text;
    private final int operator;

    public DecryptRequestData(int i, @NotNull String cipher_text) {
        Intrinsics.checkNotNullParameter(cipher_text, "cipher_text");
        this.operator = i;
        this.cipher_text = cipher_text;
    }

    public static /* synthetic */ DecryptRequestData copy$default(DecryptRequestData decryptRequestData, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = decryptRequestData.operator;
        }
        if ((i2 & 2) != 0) {
            str = decryptRequestData.cipher_text;
        }
        return decryptRequestData.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOperator() {
        return this.operator;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCipher_text() {
        return this.cipher_text;
    }

    @NotNull
    public final DecryptRequestData copy(int operator, @NotNull String cipher_text) {
        Intrinsics.checkNotNullParameter(cipher_text, "cipher_text");
        return new DecryptRequestData(operator, cipher_text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecryptRequestData)) {
            return false;
        }
        DecryptRequestData decryptRequestData = (DecryptRequestData) other;
        return this.operator == decryptRequestData.operator && Intrinsics.areEqual(this.cipher_text, decryptRequestData.cipher_text);
    }

    @NotNull
    public final String getCipher_text() {
        return this.cipher_text;
    }

    public final int getOperator() {
        return this.operator;
    }

    public int hashCode() {
        return (Integer.hashCode(this.operator) * 31) + this.cipher_text.hashCode();
    }

    @NotNull
    public String toString() {
        return "DecryptRequestData(operator=" + this.operator + ", cipher_text=" + this.cipher_text + ")";
    }
}
