package com.xiaomi.fitness.nfc.bean.yoyo;

import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/nfc/bean/yoyo/DisableCardResponse;", "", TSMAuthContants.PARAM_RESP_CODE, "", "respTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRespCode", "()Ljava/lang/String;", "setRespCode", "(Ljava/lang/String;)V", "getRespTimestamp", "setRespTimestamp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DisableCardResponse {

    @NotNull
    private String respCode;

    @NotNull
    private String respTimestamp;

    public DisableCardResponse(@NotNull String respCode, @NotNull String respTimestamp) {
        Intrinsics.checkNotNullParameter(respCode, "respCode");
        Intrinsics.checkNotNullParameter(respTimestamp, "respTimestamp");
        this.respCode = respCode;
        this.respTimestamp = respTimestamp;
    }

    public static /* synthetic */ DisableCardResponse copy$default(DisableCardResponse disableCardResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = disableCardResponse.respCode;
        }
        if ((i & 2) != 0) {
            str2 = disableCardResponse.respTimestamp;
        }
        return disableCardResponse.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRespCode() {
        return this.respCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRespTimestamp() {
        return this.respTimestamp;
    }

    @NotNull
    public final DisableCardResponse copy(@NotNull String respCode, @NotNull String respTimestamp) {
        Intrinsics.checkNotNullParameter(respCode, "respCode");
        Intrinsics.checkNotNullParameter(respTimestamp, "respTimestamp");
        return new DisableCardResponse(respCode, respTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisableCardResponse)) {
            return false;
        }
        DisableCardResponse disableCardResponse = (DisableCardResponse) other;
        return Intrinsics.areEqual(this.respCode, disableCardResponse.respCode) && Intrinsics.areEqual(this.respTimestamp, disableCardResponse.respTimestamp);
    }

    @NotNull
    public final String getRespCode() {
        return this.respCode;
    }

    @NotNull
    public final String getRespTimestamp() {
        return this.respTimestamp;
    }

    public int hashCode() {
        return (this.respCode.hashCode() * 31) + this.respTimestamp.hashCode();
    }

    public final void setRespCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.respCode = str;
    }

    public final void setRespTimestamp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.respTimestamp = str;
    }

    @NotNull
    public String toString() {
        return "DisableCardResponse(respCode=" + this.respCode + ", respTimestamp=" + this.respTimestamp + ")";
    }
}
