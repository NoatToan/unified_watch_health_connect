package com.huami.wallet.lib.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B1\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017¨\u0006%"}, d2 = {"Lcom/huami/wallet/lib/entity/XiaomiNotice;", "", "", "component1", "component2", "", "component3", "component4", "component5", "appCode", "cardName", "status", "type", "description", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAppCode", "()Ljava/lang/String;", "b", "getCardName", "c", LogUtil.I, "getStatus", "()I", GoogleApiAvailabilityLight.a, "getType", "e", "getDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Companion", "core-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class XiaomiNotice {
    public static final int STATUS_CROSS_BAR = 0;
    public static final int STATUS_POP = 4;

    @NotNull
    public static final String TYPE_OPEN_CARD = "OPEN_CARD";

    @NotNull
    public static final String TYPE_RECHARGE = "RECHARGE";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String appCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String cardName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int status;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String description;

    public XiaomiNotice(@Nullable String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4) {
        this.appCode = str;
        this.cardName = str2;
        this.status = i;
        this.type = str3;
        this.description = str4;
    }

    public static /* synthetic */ XiaomiNotice copy$default(XiaomiNotice xiaomiNotice, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = xiaomiNotice.appCode;
        }
        if ((i2 & 2) != 0) {
            str2 = xiaomiNotice.cardName;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = xiaomiNotice.status;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = xiaomiNotice.type;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = xiaomiNotice.description;
        }
        return xiaomiNotice.copy(str, str5, i3, str6, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final XiaomiNotice copy(@Nullable String appCode, @NotNull String cardName, int status, @NotNull String type, @NotNull String description) {
        return new XiaomiNotice(appCode, cardName, status, type, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XiaomiNotice)) {
            return false;
        }
        XiaomiNotice xiaomiNotice = (XiaomiNotice) other;
        return Intrinsics.areEqual(this.appCode, xiaomiNotice.appCode) && Intrinsics.areEqual(this.cardName, xiaomiNotice.cardName) && this.status == xiaomiNotice.status && Intrinsics.areEqual(this.type, xiaomiNotice.type) && Intrinsics.areEqual(this.description, xiaomiNotice.description);
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final String getCardName() {
        return this.cardName;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.appCode;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.cardName.hashCode()) * 31) + this.status) * 31) + this.type.hashCode()) * 31) + this.description.hashCode();
    }

    @NotNull
    public String toString() {
        return "XiaomiNotice(appCode=" + ((Object) this.appCode) + ", cardName=" + this.cardName + ", status=" + this.status + ", type=" + this.type + ", description=" + this.description + ')';
    }
}
