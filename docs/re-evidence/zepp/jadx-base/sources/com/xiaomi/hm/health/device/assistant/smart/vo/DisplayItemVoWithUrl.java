package com.xiaomi.hm.health.device.assistant.smart.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\r\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\u000e\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\"\u0010\u000f\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u000f\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u0010\u001a\u00020\t8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/vo/DisplayItemVoWithUrl;", "Lcom/xiaomi/hm/health/device/assistant/smart/vo/ItemVo;", "", "component1", "component2", "component3", "component4", "", "component5", "", "component6", "iconUrl", "title", "cardId", "appId", "isEnable", "type", "copy", "toString", "hashCode", "", "other", "equals", "e", "Ljava/lang/String;", "getIconUrl", "()Ljava/lang/String;", "f", "getTitle", "g", "getCardId", "h", "getAppId", "i", "Z", "()Z", "setEnable", "(Z)V", z.j, LogUtil.I, "getType", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DisplayItemVoWithUrl extends ItemVo {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String iconUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String cardId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String appId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isEnable;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int type;

    public /* synthetic */ DisplayItemVoWithUrl(String str, String str2, String str3, String str4, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z, (i2 & 32) != 0 ? 0 : i);
    }

    public static /* synthetic */ DisplayItemVoWithUrl copy$default(DisplayItemVoWithUrl displayItemVoWithUrl, String str, String str2, String str3, String str4, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = displayItemVoWithUrl.iconUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = displayItemVoWithUrl.title;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = displayItemVoWithUrl.getCardId();
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = displayItemVoWithUrl.getAppId();
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            z = displayItemVoWithUrl.getIsEnable();
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            i = displayItemVoWithUrl.getType();
        }
        return displayItemVoWithUrl.copy(str, str5, str6, str7, z2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String component3() {
        return getCardId();
    }

    @NotNull
    public final String component4() {
        return getAppId();
    }

    public final boolean component5() {
        return getIsEnable();
    }

    public final int component6() {
        return getType();
    }

    @NotNull
    public final DisplayItemVoWithUrl copy(@NotNull String iconUrl, @NotNull String title, @NotNull String cardId, @NotNull String appId, boolean isEnable, int type) {
        return new DisplayItemVoWithUrl(iconUrl, title, cardId, appId, isEnable, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayItemVoWithUrl)) {
            return false;
        }
        DisplayItemVoWithUrl displayItemVoWithUrl = (DisplayItemVoWithUrl) other;
        return Intrinsics.areEqual(this.iconUrl, displayItemVoWithUrl.iconUrl) && Intrinsics.areEqual(this.title, displayItemVoWithUrl.title) && Intrinsics.areEqual(getCardId(), displayItemVoWithUrl.getCardId()) && Intrinsics.areEqual(getAppId(), displayItemVoWithUrl.getAppId()) && getIsEnable() == displayItemVoWithUrl.getIsEnable() && getType() == displayItemVoWithUrl.getType();
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.vo.ItemVo
    @NotNull
    public String getAppId() {
        return this.appId;
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.vo.ItemVo
    @NotNull
    public String getCardId() {
        return this.cardId;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.vo.ItemVo
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((this.iconUrl.hashCode() * 31) + this.title.hashCode()) * 31) + getCardId().hashCode()) * 31) + getAppId().hashCode()) * 31;
        boolean isEnable = getIsEnable();
        int i = isEnable;
        if (isEnable) {
            i = 1;
        }
        return ((iHashCode + i) * 31) + getType();
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.vo.ItemVo
    /* JADX INFO: renamed from: isEnable, reason: from getter */
    public boolean getIsEnable() {
        return this.isEnable;
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.vo.ItemVo
    public void setEnable(boolean z) {
        this.isEnable = z;
    }

    @NotNull
    public String toString() {
        return "DisplayItemVoWithUrl(iconUrl=" + this.iconUrl + ", title=" + this.title + ", cardId=" + getCardId() + ", appId=" + getAppId() + ", isEnable=" + getIsEnable() + ", type=" + getType() + ")";
    }

    public DisplayItemVoWithUrl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, int i) {
        super(str3, str4, z, 0, 8, null);
        this.iconUrl = str;
        this.title = str2;
        this.cardId = str3;
        this.appId = str4;
        this.isEnable = z;
        this.type = i;
    }
}
