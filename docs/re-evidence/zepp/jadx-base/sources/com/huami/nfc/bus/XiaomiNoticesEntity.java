package com.huami.nfc.bus;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017¨\u0006%"}, d2 = {"Lcom/huami/nfc/bus/XiaomiNoticesEntity;", "", "", "component1", "component2", "component3", "", "component4", "component5", "appCode", "cardName", "type", "status", "description", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAppCode", "()Ljava/lang/String;", "b", "getCardName", "c", "getType", GoogleApiAvailabilityLight.a, LogUtil.I, "getStatus", "()I", "e", "getDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "Companion", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class XiaomiNoticesEntity {

    @NotNull
    public static final String TYPE_OPEN_CARD = "OPEN_CARD";

    @NotNull
    public static final String TYPE_RECHARGE = "RECHARGE";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String cardName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int status;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String description;

    public XiaomiNoticesEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4) {
        this.appCode = str;
        this.cardName = str2;
        this.type = str3;
        this.status = i;
        this.description = str4;
    }

    public static /* synthetic */ XiaomiNoticesEntity copy$default(XiaomiNoticesEntity xiaomiNoticesEntity, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = xiaomiNoticesEntity.appCode;
        }
        if ((i2 & 2) != 0) {
            str2 = xiaomiNoticesEntity.cardName;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = xiaomiNoticesEntity.type;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = xiaomiNoticesEntity.status;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = xiaomiNoticesEntity.description;
        }
        return xiaomiNoticesEntity.copy(str, str5, str6, i3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final XiaomiNoticesEntity copy(@NotNull String appCode, @NotNull String cardName, @NotNull String type, int status, @NotNull String description) {
        return new XiaomiNoticesEntity(appCode, cardName, type, status, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XiaomiNoticesEntity)) {
            return false;
        }
        XiaomiNoticesEntity xiaomiNoticesEntity = (XiaomiNoticesEntity) other;
        return Intrinsics.areEqual(this.appCode, xiaomiNoticesEntity.appCode) && Intrinsics.areEqual(this.cardName, xiaomiNoticesEntity.cardName) && Intrinsics.areEqual(this.type, xiaomiNoticesEntity.type) && this.status == xiaomiNoticesEntity.status && Intrinsics.areEqual(this.description, xiaomiNoticesEntity.description);
    }

    @NotNull
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
        return (((((((this.appCode.hashCode() * 31) + this.cardName.hashCode()) * 31) + this.type.hashCode()) * 31) + this.status) * 31) + this.description.hashCode();
    }

    @NotNull
    public String toString() {
        return "XiaomiNoticesEntity(appCode=" + this.appCode + ", cardName=" + this.cardName + ", type=" + this.type + ", status=" + this.status + ", description=" + this.description + ')';
    }
}
