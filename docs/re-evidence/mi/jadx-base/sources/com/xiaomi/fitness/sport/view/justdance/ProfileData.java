package com.xiaomi.fitness.sport.view.justdance;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\u009f\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0005HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0005HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001bR\u0011\u0010(\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b)\u0010\u001b¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/ProfileData;", "", "name", "", "playerId", "", "color", "", "image", "avatarSpecialEffect", "portraitBorderFront", "portraitBorderBack", "aliasName", "aliasColor", "showOnScreen", "showConfirmButton", "additionalMessage", "isMasterPhone", "isCoopMode", "isSweatMode", "<init>", "(Ljava/lang/String;I[FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[FIILjava/lang/String;III)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPlayerId", "()I", "getColor", "()[F", "getImage", "setImage", "getAvatarSpecialEffect", "getPortraitBorderFront", "getPortraitBorderBack", "getAliasName", "getAliasColor", "getShowOnScreen", "getShowConfirmButton", "getAdditionalMessage", "colorInt", "getColorInt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProfileData {

    @NotNull
    private final String additionalMessage;

    @NotNull
    private final float[] aliasColor;

    @NotNull
    private final String aliasName;
    private final int avatarSpecialEffect;

    @NotNull
    private final float[] color;

    @NotNull
    private String image;
    private final int isCoopMode;
    private final int isMasterPhone;
    private final int isSweatMode;

    @NotNull
    private String name;
    private final int playerId;

    @NotNull
    private final String portraitBorderBack;

    @NotNull
    private final String portraitBorderFront;
    private final int showConfirmButton;
    private final int showOnScreen;

    public ProfileData(@NotNull String name, int i, @NotNull float[] color, @NotNull String image, int i2, @NotNull String portraitBorderFront, @NotNull String portraitBorderBack, @NotNull String aliasName, @NotNull float[] aliasColor, int i3, int i4, @NotNull String additionalMessage, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(portraitBorderFront, "portraitBorderFront");
        Intrinsics.checkNotNullParameter(portraitBorderBack, "portraitBorderBack");
        Intrinsics.checkNotNullParameter(aliasName, "aliasName");
        Intrinsics.checkNotNullParameter(aliasColor, "aliasColor");
        Intrinsics.checkNotNullParameter(additionalMessage, "additionalMessage");
        this.name = name;
        this.playerId = i;
        this.color = color;
        this.image = image;
        this.avatarSpecialEffect = i2;
        this.portraitBorderFront = portraitBorderFront;
        this.portraitBorderBack = portraitBorderBack;
        this.aliasName = aliasName;
        this.aliasColor = aliasColor;
        this.showOnScreen = i3;
        this.showConfirmButton = i4;
        this.additionalMessage = additionalMessage;
        this.isMasterPhone = i5;
        this.isCoopMode = i6;
        this.isSweatMode = i7;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getShowOnScreen() {
        return this.showOnScreen;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getShowConfirmButton() {
        return this.showConfirmButton;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAdditionalMessage() {
        return this.additionalMessage;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getIsMasterPhone() {
        return this.isMasterPhone;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getIsCoopMode() {
        return this.isCoopMode;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getIsSweatMode() {
        return this.isSweatMode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPlayerId() {
        return this.playerId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float[] getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAvatarSpecialEffect() {
        return this.avatarSpecialEffect;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPortraitBorderFront() {
        return this.portraitBorderFront;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPortraitBorderBack() {
        return this.portraitBorderBack;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAliasName() {
        return this.aliasName;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float[] getAliasColor() {
        return this.aliasColor;
    }

    @NotNull
    public final ProfileData copy(@NotNull String name, int playerId, @NotNull float[] color, @NotNull String image, int avatarSpecialEffect, @NotNull String portraitBorderFront, @NotNull String portraitBorderBack, @NotNull String aliasName, @NotNull float[] aliasColor, int showOnScreen, int showConfirmButton, @NotNull String additionalMessage, int isMasterPhone, int isCoopMode, int isSweatMode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(portraitBorderFront, "portraitBorderFront");
        Intrinsics.checkNotNullParameter(portraitBorderBack, "portraitBorderBack");
        Intrinsics.checkNotNullParameter(aliasName, "aliasName");
        Intrinsics.checkNotNullParameter(aliasColor, "aliasColor");
        Intrinsics.checkNotNullParameter(additionalMessage, "additionalMessage");
        return new ProfileData(name, playerId, color, image, avatarSpecialEffect, portraitBorderFront, portraitBorderBack, aliasName, aliasColor, showOnScreen, showConfirmButton, additionalMessage, isMasterPhone, isCoopMode, isSweatMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileData)) {
            return false;
        }
        ProfileData profileData = (ProfileData) other;
        return Intrinsics.areEqual(this.name, profileData.name) && this.playerId == profileData.playerId && Intrinsics.areEqual(this.color, profileData.color) && Intrinsics.areEqual(this.image, profileData.image) && this.avatarSpecialEffect == profileData.avatarSpecialEffect && Intrinsics.areEqual(this.portraitBorderFront, profileData.portraitBorderFront) && Intrinsics.areEqual(this.portraitBorderBack, profileData.portraitBorderBack) && Intrinsics.areEqual(this.aliasName, profileData.aliasName) && Intrinsics.areEqual(this.aliasColor, profileData.aliasColor) && this.showOnScreen == profileData.showOnScreen && this.showConfirmButton == profileData.showConfirmButton && Intrinsics.areEqual(this.additionalMessage, profileData.additionalMessage) && this.isMasterPhone == profileData.isMasterPhone && this.isCoopMode == profileData.isCoopMode && this.isSweatMode == profileData.isSweatMode;
    }

    @NotNull
    public final String getAdditionalMessage() {
        return this.additionalMessage;
    }

    @NotNull
    public final float[] getAliasColor() {
        return this.aliasColor;
    }

    @NotNull
    public final String getAliasName() {
        return this.aliasName;
    }

    public final int getAvatarSpecialEffect() {
        return this.avatarSpecialEffect;
    }

    @NotNull
    public final float[] getColor() {
        return this.color;
    }

    public final int getColorInt() {
        float[] fArr = this.color;
        if (fArr.length != 4) {
            return 0;
        }
        int i = ((int) ((fArr[0] * 255.0f) + 0.5f)) << 16;
        int i2 = ((int) ((fArr[1] * 255.0f) + 0.5f)) << 8;
        return (((int) ((fArr[3] * 255.0f) + 0.5f)) << 24) | i | i2 | ((int) ((fArr[2] * 255.0f) + 0.5f));
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    @NotNull
    public final String getPortraitBorderBack() {
        return this.portraitBorderBack;
    }

    @NotNull
    public final String getPortraitBorderFront() {
        return this.portraitBorderFront;
    }

    public final int getShowConfirmButton() {
        return this.showConfirmButton;
    }

    public final int getShowOnScreen() {
        return this.showOnScreen;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.name.hashCode() * 31) + Integer.hashCode(this.playerId)) * 31) + Arrays.hashCode(this.color)) * 31) + this.image.hashCode()) * 31) + Integer.hashCode(this.avatarSpecialEffect)) * 31) + this.portraitBorderFront.hashCode()) * 31) + this.portraitBorderBack.hashCode()) * 31) + this.aliasName.hashCode()) * 31) + Arrays.hashCode(this.aliasColor)) * 31) + Integer.hashCode(this.showOnScreen)) * 31) + Integer.hashCode(this.showConfirmButton)) * 31) + this.additionalMessage.hashCode()) * 31) + Integer.hashCode(this.isMasterPhone)) * 31) + Integer.hashCode(this.isCoopMode)) * 31) + Integer.hashCode(this.isSweatMode);
    }

    public final int isCoopMode() {
        return this.isCoopMode;
    }

    public final int isMasterPhone() {
        return this.isMasterPhone;
    }

    public final int isSweatMode() {
        return this.isSweatMode;
    }

    public final void setImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.image = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    @NotNull
    public String toString() {
        return "ProfileData(name=" + this.name + ", playerId=" + this.playerId + ", color=" + Arrays.toString(this.color) + ", image=" + this.image + ", avatarSpecialEffect=" + this.avatarSpecialEffect + ", portraitBorderFront=" + this.portraitBorderFront + ", portraitBorderBack=" + this.portraitBorderBack + ", aliasName=" + this.aliasName + ", aliasColor=" + Arrays.toString(this.aliasColor) + ", showOnScreen=" + this.showOnScreen + ", showConfirmButton=" + this.showConfirmButton + ", additionalMessage=" + this.additionalMessage + ", isMasterPhone=" + this.isMasterPhone + ", isCoopMode=" + this.isCoopMode + ", isSweatMode=" + this.isSweatMode + ")";
    }
}
