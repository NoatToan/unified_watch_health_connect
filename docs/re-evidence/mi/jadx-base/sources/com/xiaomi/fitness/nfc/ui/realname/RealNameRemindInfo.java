package com.xiaomi.fitness.nfc.ui.realname;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/realname/RealNameRemindInfo;", "", "msg", "", "type", "redirectURL", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "getType", "getRedirectURL", "getButton", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RealNameRemindInfo {

    @NotNull
    private final String button;

    @NotNull
    private final String msg;

    @NotNull
    private final String redirectURL;

    @NotNull
    private final String type;

    public RealNameRemindInfo(@NotNull String msg, @NotNull String type, @NotNull String redirectURL, @NotNull String button) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(redirectURL, "redirectURL");
        Intrinsics.checkNotNullParameter(button, "button");
        this.msg = msg;
        this.type = type;
        this.redirectURL = redirectURL;
        this.button = button;
    }

    public static /* synthetic */ RealNameRemindInfo copy$default(RealNameRemindInfo realNameRemindInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = realNameRemindInfo.msg;
        }
        if ((i & 2) != 0) {
            str2 = realNameRemindInfo.type;
        }
        if ((i & 4) != 0) {
            str3 = realNameRemindInfo.redirectURL;
        }
        if ((i & 8) != 0) {
            str4 = realNameRemindInfo.button;
        }
        return realNameRemindInfo.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRedirectURL() {
        return this.redirectURL;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getButton() {
        return this.button;
    }

    @NotNull
    public final RealNameRemindInfo copy(@NotNull String msg, @NotNull String type, @NotNull String redirectURL, @NotNull String button) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(redirectURL, "redirectURL");
        Intrinsics.checkNotNullParameter(button, "button");
        return new RealNameRemindInfo(msg, type, redirectURL, button);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealNameRemindInfo)) {
            return false;
        }
        RealNameRemindInfo realNameRemindInfo = (RealNameRemindInfo) other;
        return Intrinsics.areEqual(this.msg, realNameRemindInfo.msg) && Intrinsics.areEqual(this.type, realNameRemindInfo.type) && Intrinsics.areEqual(this.redirectURL, realNameRemindInfo.redirectURL) && Intrinsics.areEqual(this.button, realNameRemindInfo.button);
    }

    @NotNull
    public final String getButton() {
        return this.button;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final String getRedirectURL() {
        return this.redirectURL;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.msg.hashCode() * 31) + this.type.hashCode()) * 31) + this.redirectURL.hashCode()) * 31) + this.button.hashCode();
    }

    @NotNull
    public String toString() {
        return "RealNameRemindInfo(msg=" + this.msg + ", type=" + this.type + ", redirectURL=" + this.redirectURL + ", button=" + this.button + ")";
    }
}
