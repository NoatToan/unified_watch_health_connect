package com.mi.fitness.lpamanagement.request.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/mi/fitness/lpamanagement/request/data/DecryptResult;", "", "plainText", "", "<init>", "(Ljava/lang/String;)V", "getPlainText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DecryptResult {

    @SerializedName(MiuiCursorConstants.PLAIN_TEXT)
    @NotNull
    private final String plainText;

    public DecryptResult(@NotNull String plainText) {
        Intrinsics.checkNotNullParameter(plainText, "plainText");
        this.plainText = plainText;
    }

    public static /* synthetic */ DecryptResult copy$default(DecryptResult decryptResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = decryptResult.plainText;
        }
        return decryptResult.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlainText() {
        return this.plainText;
    }

    @NotNull
    public final DecryptResult copy(@NotNull String plainText) {
        Intrinsics.checkNotNullParameter(plainText, "plainText");
        return new DecryptResult(plainText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DecryptResult) && Intrinsics.areEqual(this.plainText, ((DecryptResult) other).plainText);
    }

    @NotNull
    public final String getPlainText() {
        return this.plainText;
    }

    public int hashCode() {
        return this.plainText.hashCode();
    }

    @NotNull
    public String toString() {
        return "DecryptResult(plainText=" + this.plainText + ")";
    }
}
