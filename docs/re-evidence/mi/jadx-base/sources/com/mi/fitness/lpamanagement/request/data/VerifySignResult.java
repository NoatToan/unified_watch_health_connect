package com.mi.fitness.lpamanagement.request.data;

import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/mi/fitness/lpamanagement/request/data/VerifySignResult;", "", "success", "", MiuiCursorConstants.PLAIN_TEXT, "", "<init>", "(ZLjava/lang/String;)V", "getSuccess", "()Z", "getPlain_text", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VerifySignResult {

    @NotNull
    private final String plain_text;
    private final boolean success;

    public VerifySignResult(boolean z, @NotNull String plain_text) {
        Intrinsics.checkNotNullParameter(plain_text, "plain_text");
        this.success = z;
        this.plain_text = plain_text;
    }

    public static /* synthetic */ VerifySignResult copy$default(VerifySignResult verifySignResult, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = verifySignResult.success;
        }
        if ((i & 2) != 0) {
            str = verifySignResult.plain_text;
        }
        return verifySignResult.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlain_text() {
        return this.plain_text;
    }

    @NotNull
    public final VerifySignResult copy(boolean success, @NotNull String plain_text) {
        Intrinsics.checkNotNullParameter(plain_text, "plain_text");
        return new VerifySignResult(success, plain_text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifySignResult)) {
            return false;
        }
        VerifySignResult verifySignResult = (VerifySignResult) other;
        return this.success == verifySignResult.success && Intrinsics.areEqual(this.plain_text, verifySignResult.plain_text);
    }

    @NotNull
    public final String getPlain_text() {
        return this.plain_text;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.success) * 31) + this.plain_text.hashCode();
    }

    @NotNull
    public String toString() {
        return "VerifySignResult(success=" + this.success + ", plain_text=" + this.plain_text + ")";
    }
}
