package com.xiaomi.hm.health.device.assistant.smart.vo;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.assistant.dto.CardType;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b1\u00102J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003JO\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\u000f\u001a\u00020\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0010\u001a\u00020\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\"\u0010\u0011\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\u0011\u0010(\"\u0004\b)\u0010*R\u001c\u0010\u0012\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010\u001dR\u0019\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/vo/DisplayItemVo;", "Lcom/xiaomi/hm/health/device/assistant/smart/vo/ItemVo;", "", "component1", "component2", "", "component3", "component4", "", "component5", "component6", "Lcom/huami/bluetooth/profile/channel/module/assistant/dto/CardType;", "component7", "iconRes", "titleRes", "cardId", "appId", "isEnable", "type", "sourceType", "copy", "toString", "hashCode", "", "other", "equals", "e", LogUtil.I, "getIconRes", "()I", "f", "getTitleRes", "g", "Ljava/lang/String;", "getCardId", "()Ljava/lang/String;", "h", "getAppId", "i", "Z", "()Z", "setEnable", "(Z)V", z.j, "getType", hl.k, "Lcom/huami/bluetooth/profile/channel/module/assistant/dto/CardType;", "getSourceType", "()Lcom/huami/bluetooth/profile/channel/module/assistant/dto/CardType;", "<init>", "(IILjava/lang/String;Ljava/lang/String;ZILcom/huami/bluetooth/profile/channel/module/assistant/dto/CardType;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DisplayItemVo extends ItemVo {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int iconRes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int titleRes;

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

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    private final CardType sourceType;

    public /* synthetic */ DisplayItemVo(int i, int i2, String str, String str2, boolean z, int i3, CardType cardType, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, str2, z, (i4 & 32) != 0 ? 0 : i3, cardType);
    }

    public static /* synthetic */ DisplayItemVo copy$default(DisplayItemVo displayItemVo, int i, int i2, String str, String str2, boolean z, int i3, CardType cardType, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = displayItemVo.iconRes;
        }
        if ((i4 & 2) != 0) {
            i2 = displayItemVo.titleRes;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            str = displayItemVo.getCardId();
        }
        String str3 = str;
        if ((i4 & 8) != 0) {
            str2 = displayItemVo.getAppId();
        }
        String str4 = str2;
        if ((i4 & 16) != 0) {
            z = displayItemVo.getIsEnable();
        }
        boolean z2 = z;
        if ((i4 & 32) != 0) {
            i3 = displayItemVo.getType();
        }
        int i6 = i3;
        if ((i4 & 64) != 0) {
            cardType = displayItemVo.sourceType;
        }
        return displayItemVo.copy(i, i5, str3, str4, z2, i6, cardType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIconRes() {
        return this.iconRes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
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
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CardType getSourceType() {
        return this.sourceType;
    }

    @NotNull
    public final DisplayItemVo copy(@DrawableRes int iconRes, @StringRes int titleRes, @NotNull String cardId, @NotNull String appId, boolean isEnable, int type, @NotNull CardType sourceType) {
        return new DisplayItemVo(iconRes, titleRes, cardId, appId, isEnable, type, sourceType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayItemVo)) {
            return false;
        }
        DisplayItemVo displayItemVo = (DisplayItemVo) other;
        return this.iconRes == displayItemVo.iconRes && this.titleRes == displayItemVo.titleRes && Intrinsics.areEqual(getCardId(), displayItemVo.getCardId()) && Intrinsics.areEqual(getAppId(), displayItemVo.getAppId()) && getIsEnable() == displayItemVo.getIsEnable() && getType() == displayItemVo.getType() && this.sourceType == displayItemVo.sourceType;
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

    public final int getIconRes() {
        return this.iconRes;
    }

    @NotNull
    public final CardType getSourceType() {
        return this.sourceType;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    @Override // com.xiaomi.hm.health.device.assistant.smart.vo.ItemVo
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((this.iconRes * 31) + this.titleRes) * 31) + getCardId().hashCode()) * 31) + getAppId().hashCode()) * 31;
        boolean isEnable = getIsEnable();
        int i = isEnable;
        if (isEnable) {
            i = 1;
        }
        return ((((iHashCode + i) * 31) + getType()) * 31) + this.sourceType.hashCode();
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
        return "DisplayItemVo(iconRes=" + this.iconRes + ", titleRes=" + this.titleRes + ", cardId=" + getCardId() + ", appId=" + getAppId() + ", isEnable=" + getIsEnable() + ", type=" + getType() + ", sourceType=" + this.sourceType + ")";
    }

    public DisplayItemVo(@DrawableRes int i, @StringRes int i2, @NotNull String str, @NotNull String str2, boolean z, int i3, @NotNull CardType cardType) {
        super(str, str2, z, 0, 8, null);
        this.iconRes = i;
        this.titleRes = i2;
        this.cardId = str;
        this.appId = str2;
        this.isEnable = z;
        this.type = i3;
        this.sourceType = cardType;
    }
}
