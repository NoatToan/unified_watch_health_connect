package com.xiaomi.fitness.device.manager.api.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/device/manager/api/model/BindThirdParty;", "", "convertedUserId", "", "bindToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getConvertedUserId", "()Ljava/lang/String;", "getBindToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BindThirdParty {

    @SerializedName("bind_token")
    @NotNull
    private final String bindToken;

    @SerializedName("user_unionid")
    @NotNull
    private final String convertedUserId;

    public BindThirdParty(@NotNull String convertedUserId, @NotNull String bindToken) {
        Intrinsics.checkNotNullParameter(convertedUserId, "convertedUserId");
        Intrinsics.checkNotNullParameter(bindToken, "bindToken");
        this.convertedUserId = convertedUserId;
        this.bindToken = bindToken;
    }

    public static /* synthetic */ BindThirdParty copy$default(BindThirdParty bindThirdParty, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindThirdParty.convertedUserId;
        }
        if ((i & 2) != 0) {
            str2 = bindThirdParty.bindToken;
        }
        return bindThirdParty.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConvertedUserId() {
        return this.convertedUserId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBindToken() {
        return this.bindToken;
    }

    @NotNull
    public final BindThirdParty copy(@NotNull String convertedUserId, @NotNull String bindToken) {
        Intrinsics.checkNotNullParameter(convertedUserId, "convertedUserId");
        Intrinsics.checkNotNullParameter(bindToken, "bindToken");
        return new BindThirdParty(convertedUserId, bindToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindThirdParty)) {
            return false;
        }
        BindThirdParty bindThirdParty = (BindThirdParty) other;
        return Intrinsics.areEqual(this.convertedUserId, bindThirdParty.convertedUserId) && Intrinsics.areEqual(this.bindToken, bindThirdParty.bindToken);
    }

    @NotNull
    public final String getBindToken() {
        return this.bindToken;
    }

    @NotNull
    public final String getConvertedUserId() {
        return this.convertedUserId;
    }

    public int hashCode() {
        return (this.convertedUserId.hashCode() * 31) + this.bindToken.hashCode();
    }

    @NotNull
    public String toString() {
        return "BindThirdParty(convertedUserId=" + this.convertedUserId + ", bindToken=" + this.bindToken + ")";
    }
}
