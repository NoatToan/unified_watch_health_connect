package com.xiaomi.fitness.sport.view.justdance;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003Jm\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0007HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\u0018¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/PlayerData;", "", "name", "", "alias", "avatarImg", "playerId", "", "color", "", "starNum", "starNumCoop", "score", "coopScore", "calories", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[FIILjava/lang/String;ILjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getAlias", "getAvatarImg", "setAvatarImg", "(Ljava/lang/String;)V", "getPlayerId", "()I", "getColor", "()[F", "getStarNum", "getStarNumCoop", "getScore", "getCoopScore", "getCalories", "colorInt", "getColorInt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PlayerData {

    @NotNull
    private final String alias;

    @NotNull
    private String avatarImg;

    @NotNull
    private final String calories;

    @NotNull
    private final float[] color;
    private final int coopScore;

    @NotNull
    private final String name;
    private final int playerId;

    @NotNull
    private final String score;
    private final int starNum;
    private final int starNumCoop;

    public PlayerData(@NotNull String name, @NotNull String alias, @NotNull String avatarImg, int i, @NotNull float[] color, int i2, int i3, @NotNull String score, int i4, @NotNull String calories) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(avatarImg, "avatarImg");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(score, "score");
        Intrinsics.checkNotNullParameter(calories, "calories");
        this.name = name;
        this.alias = alias;
        this.avatarImg = avatarImg;
        this.playerId = i;
        this.color = color;
        this.starNum = i2;
        this.starNumCoop = i3;
        this.score = score;
        this.coopScore = i4;
        this.calories = calories;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCalories() {
        return this.calories;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarImg() {
        return this.avatarImg;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPlayerId() {
        return this.playerId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float[] getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStarNum() {
        return this.starNum;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStarNumCoop() {
        return this.starNumCoop;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getCoopScore() {
        return this.coopScore;
    }

    @NotNull
    public final PlayerData copy(@NotNull String name, @NotNull String alias, @NotNull String avatarImg, int playerId, @NotNull float[] color, int starNum, int starNumCoop, @NotNull String score, int coopScore, @NotNull String calories) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(avatarImg, "avatarImg");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(score, "score");
        Intrinsics.checkNotNullParameter(calories, "calories");
        return new PlayerData(name, alias, avatarImg, playerId, color, starNum, starNumCoop, score, coopScore, calories);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerData)) {
            return false;
        }
        PlayerData playerData = (PlayerData) other;
        return Intrinsics.areEqual(this.name, playerData.name) && Intrinsics.areEqual(this.alias, playerData.alias) && Intrinsics.areEqual(this.avatarImg, playerData.avatarImg) && this.playerId == playerData.playerId && Intrinsics.areEqual(this.color, playerData.color) && this.starNum == playerData.starNum && this.starNumCoop == playerData.starNumCoop && Intrinsics.areEqual(this.score, playerData.score) && this.coopScore == playerData.coopScore && Intrinsics.areEqual(this.calories, playerData.calories);
    }

    @NotNull
    public final String getAlias() {
        return this.alias;
    }

    @NotNull
    public final String getAvatarImg() {
        return this.avatarImg;
    }

    @NotNull
    public final String getCalories() {
        return this.calories;
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

    public final int getCoopScore() {
        return this.coopScore;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    @NotNull
    public final String getScore() {
        return this.score;
    }

    public final int getStarNum() {
        return this.starNum;
    }

    public final int getStarNumCoop() {
        return this.starNumCoop;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + this.alias.hashCode()) * 31) + this.avatarImg.hashCode()) * 31) + Integer.hashCode(this.playerId)) * 31) + Arrays.hashCode(this.color)) * 31) + Integer.hashCode(this.starNum)) * 31) + Integer.hashCode(this.starNumCoop)) * 31) + this.score.hashCode()) * 31) + Integer.hashCode(this.coopScore)) * 31) + this.calories.hashCode();
    }

    public final void setAvatarImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.avatarImg = str;
    }

    @NotNull
    public String toString() {
        return "PlayerData(name=" + this.name + ", alias=" + this.alias + ", avatarImg=" + this.avatarImg + ", playerId=" + this.playerId + ", color=" + Arrays.toString(this.color) + ", starNum=" + this.starNum + ", starNumCoop=" + this.starNumCoop + ", score=" + this.score + ", coopScore=" + this.coopScore + ", calories=" + this.calories + ")";
    }
}
