package com.xiaomi.fitness.mine.personal.data.management.data.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetLabCollaborationAuthConfigResult;", "", "title", "", MiuiCursorConstants.CONTENT, "authStatus", "", "exitable", "", "userConsentLink", "userConsentTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getContent", "getAuthStatus", "()I", "getExitable", "()Z", "getUserConsentLink", "getUserConsentTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetLabCollaborationAuthConfigResult {

    @SerializedName("auth_status")
    private final int authStatus;

    @SerializedName(MiuiCursorConstants.CONTENT)
    @NotNull
    private final String content;

    @SerializedName("exitable")
    private final boolean exitable;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("user_consent_link")
    @NotNull
    private final String userConsentLink;

    @SerializedName("user_consent_title")
    @NotNull
    private final String userConsentTitle;

    public GetLabCollaborationAuthConfigResult(@NotNull String title, @NotNull String content, int i, boolean z, @NotNull String userConsentLink, @NotNull String userConsentTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(userConsentLink, "userConsentLink");
        Intrinsics.checkNotNullParameter(userConsentTitle, "userConsentTitle");
        this.title = title;
        this.content = content;
        this.authStatus = i;
        this.exitable = z;
        this.userConsentLink = userConsentLink;
        this.userConsentTitle = userConsentTitle;
    }

    public static /* synthetic */ GetLabCollaborationAuthConfigResult copy$default(GetLabCollaborationAuthConfigResult getLabCollaborationAuthConfigResult, String str, String str2, int i, boolean z, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getLabCollaborationAuthConfigResult.title;
        }
        if ((i2 & 2) != 0) {
            str2 = getLabCollaborationAuthConfigResult.content;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = getLabCollaborationAuthConfigResult.authStatus;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = getLabCollaborationAuthConfigResult.exitable;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            str3 = getLabCollaborationAuthConfigResult.userConsentLink;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = getLabCollaborationAuthConfigResult.userConsentTitle;
        }
        return getLabCollaborationAuthConfigResult.copy(str, str5, i3, z2, str6, str4);
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
    public final boolean getExitable() {
        return this.exitable;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserConsentLink() {
        return this.userConsentLink;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserConsentTitle() {
        return this.userConsentTitle;
    }

    @NotNull
    public final GetLabCollaborationAuthConfigResult copy(@NotNull String title, @NotNull String content, int authStatus, boolean exitable, @NotNull String userConsentLink, @NotNull String userConsentTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(userConsentLink, "userConsentLink");
        Intrinsics.checkNotNullParameter(userConsentTitle, "userConsentTitle");
        return new GetLabCollaborationAuthConfigResult(title, content, authStatus, exitable, userConsentLink, userConsentTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetLabCollaborationAuthConfigResult)) {
            return false;
        }
        GetLabCollaborationAuthConfigResult getLabCollaborationAuthConfigResult = (GetLabCollaborationAuthConfigResult) other;
        return Intrinsics.areEqual(this.title, getLabCollaborationAuthConfigResult.title) && Intrinsics.areEqual(this.content, getLabCollaborationAuthConfigResult.content) && this.authStatus == getLabCollaborationAuthConfigResult.authStatus && this.exitable == getLabCollaborationAuthConfigResult.exitable && Intrinsics.areEqual(this.userConsentLink, getLabCollaborationAuthConfigResult.userConsentLink) && Intrinsics.areEqual(this.userConsentTitle, getLabCollaborationAuthConfigResult.userConsentTitle);
    }

    public final int getAuthStatus() {
        return this.authStatus;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final boolean getExitable() {
        return this.exitable;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUserConsentLink() {
        return this.userConsentLink;
    }

    @NotNull
    public final String getUserConsentTitle() {
        return this.userConsentTitle;
    }

    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.authStatus)) * 31) + Boolean.hashCode(this.exitable)) * 31) + this.userConsentLink.hashCode()) * 31) + this.userConsentTitle.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetLabCollaborationAuthConfigResult(title=" + this.title + ", content=" + this.content + ", authStatus=" + this.authStatus + ", exitable=" + this.exitable + ", userConsentLink=" + this.userConsentLink + ", userConsentTitle=" + this.userConsentTitle + ")";
    }
}
