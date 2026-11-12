package com.huami.device.feature.quickcards.cards.dto;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/device/feature/quickcards/cards/dto/CardItemResourceDto;", "Lcom/huami/device/feature/quickcards/cards/dto/CardItemDto;", "", "a", "", "b", "", "component3", "component4", "mType", "mIsEnable", "iconUrl", "title", "copy", "toString", "hashCode", "", "other", "equals", "c", LogUtil.I, GoogleApiAvailabilityLight.a, "Z", "e", "Ljava/lang/String;", "getIconUrl", "()Ljava/lang/String;", "f", "getTitle", "<init>", "(IZLjava/lang/String;Ljava/lang/String;)V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CardItemResourceDto extends CardItemDto {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int mType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean mIsEnable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String iconUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    public CardItemResourceDto(int i, boolean z, @NotNull String str, @NotNull String str2) {
        super(i, z);
        this.mType = i;
        this.mIsEnable = z;
        this.iconUrl = str;
        this.title = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    private final int getMType() {
        return this.mType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    private final boolean getMIsEnable() {
        return this.mIsEnable;
    }

    public static /* synthetic */ CardItemResourceDto copy$default(CardItemResourceDto cardItemResourceDto, int i, boolean z, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cardItemResourceDto.mType;
        }
        if ((i2 & 2) != 0) {
            z = cardItemResourceDto.mIsEnable;
        }
        if ((i2 & 4) != 0) {
            str = cardItemResourceDto.iconUrl;
        }
        if ((i2 & 8) != 0) {
            str2 = cardItemResourceDto.title;
        }
        return cardItemResourceDto.copy(i, z, str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final CardItemResourceDto copy(int mType, boolean mIsEnable, @NotNull String iconUrl, @NotNull String title) {
        return new CardItemResourceDto(mType, mIsEnable, iconUrl, title);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardItemResourceDto)) {
            return false;
        }
        CardItemResourceDto cardItemResourceDto = (CardItemResourceDto) other;
        return this.mType == cardItemResourceDto.mType && this.mIsEnable == cardItemResourceDto.mIsEnable && Intrinsics.areEqual(this.iconUrl, cardItemResourceDto.iconUrl) && Intrinsics.areEqual(this.title, cardItemResourceDto.title);
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int i = this.mType * 31;
        boolean z = this.mIsEnable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((i + r1) * 31) + this.iconUrl.hashCode()) * 31) + this.title.hashCode();
    }

    @NotNull
    public String toString() {
        return "CardItemResourceDto(mType=" + this.mType + ", mIsEnable=" + this.mIsEnable + ", iconUrl=" + this.iconUrl + ", title=" + this.title + ')';
    }
}
