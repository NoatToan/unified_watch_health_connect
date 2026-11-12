package com.xiaomi.fitness.mine.personal.data.management.data.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyResult;", "", "title", "", MiuiCursorConstants.CONTENT, "authStatus", "", "exitEnable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "getTitle", "()Ljava/lang/String;", "getContent", "getAuthStatus", "()I", "getExitEnable", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetThirdPartyResult {

    @SerializedName("auth_status")
    private final int authStatus;

    @SerializedName(MiuiCursorConstants.CONTENT)
    @NotNull
    private final String content;

    @SerializedName("exitable")
    private final boolean exitEnable;

    @SerializedName("title")
    @NotNull
    private final String title;

    public GetThirdPartyResult(@NotNull String title, @NotNull String content, int i, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.title = title;
        this.content = content;
        this.authStatus = i;
        this.exitEnable = z;
    }

    public static /* synthetic */ GetThirdPartyResult copy$default(GetThirdPartyResult getThirdPartyResult, String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getThirdPartyResult.title;
        }
        if ((i2 & 2) != 0) {
            str2 = getThirdPartyResult.content;
        }
        if ((i2 & 4) != 0) {
            i = getThirdPartyResult.authStatus;
        }
        if ((i2 & 8) != 0) {
            z = getThirdPartyResult.exitEnable;
        }
        return getThirdPartyResult.copy(str, str2, i, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAuthStatus() {
        return this.authStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getExitEnable() {
        return this.exitEnable;
    }

    @NotNull
    public final GetThirdPartyResult copy(@NotNull String title, @NotNull String content, int authStatus, boolean exitEnable) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        return new GetThirdPartyResult(title, content, authStatus, exitEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetThirdPartyResult)) {
            return false;
        }
        GetThirdPartyResult getThirdPartyResult = (GetThirdPartyResult) other;
        return Intrinsics.areEqual(this.title, getThirdPartyResult.title) && Intrinsics.areEqual(this.content, getThirdPartyResult.content) && this.authStatus == getThirdPartyResult.authStatus && this.exitEnable == getThirdPartyResult.exitEnable;
    }

    public final int getAuthStatus() {
        return this.authStatus;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final boolean getExitEnable() {
        return this.exitEnable;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.authStatus)) * 31) + Boolean.hashCode(this.exitEnable);
    }

    @NotNull
    public String toString() {
        return "GetThirdPartyResult(title=" + this.title + ", content=" + this.content + ", authStatus=" + this.authStatus + ", exitEnable=" + this.exitEnable + ")";
    }
}
