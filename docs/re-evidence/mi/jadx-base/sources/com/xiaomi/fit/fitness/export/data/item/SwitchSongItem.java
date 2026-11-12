package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0016\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jt\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u000bHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R \u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006-"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", "Ljava/io/Serializable;", "songName", "", "name", "share", "aliasName", "color", "", "", "starNum", "", "score", "calories", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getSongName", "()Ljava/lang/String;", "getName", "getShare", "getAliasName", "getColor", "()[Ljava/lang/Double;", "[Ljava/lang/Double;", "getStarNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScore", "getCalories", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", "equals", "", "other", "", "hashCode", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SwitchSongItem implements Serializable {

    @SerializedName("aliasName")
    @Nullable
    private final String aliasName;

    @SerializedName("calories")
    @Nullable
    private final String calories;

    @SerializedName("color")
    @Nullable
    private final Double[] color;

    @SerializedName("name")
    @Nullable
    private final String name;

    @SerializedName("score")
    @Nullable
    private final Integer score;

    @SerializedName("shareUrl")
    @Nullable
    private final String share;

    @SerializedName("songName")
    @Nullable
    private final String songName;

    @SerializedName("starNum")
    @Nullable
    private final Integer starNum;

    public SwitchSongItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Double[] dArr, @Nullable Integer num, @Nullable Integer num2, @Nullable String str5) {
        this.songName = str;
        this.name = str2;
        this.share = str3;
        this.aliasName = str4;
        this.color = dArr;
        this.starNum = num;
        this.score = num2;
        this.calories = str5;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSongName() {
        return this.songName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShare() {
        return this.share;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAliasName() {
        return this.aliasName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double[] getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getStarNum() {
        return this.starNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCalories() {
        return this.calories;
    }

    @NotNull
    public final SwitchSongItem copy(@Nullable String songName, @Nullable String name, @Nullable String share, @Nullable String aliasName, @Nullable Double[] color, @Nullable Integer starNum, @Nullable Integer score, @Nullable String calories) {
        return new SwitchSongItem(songName, name, share, aliasName, color, starNum, score, calories);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchSongItem)) {
            return false;
        }
        SwitchSongItem switchSongItem = (SwitchSongItem) other;
        return Intrinsics.areEqual(this.songName, switchSongItem.songName) && Intrinsics.areEqual(this.name, switchSongItem.name) && Intrinsics.areEqual(this.share, switchSongItem.share) && Intrinsics.areEqual(this.aliasName, switchSongItem.aliasName) && Intrinsics.areEqual(this.color, switchSongItem.color) && Intrinsics.areEqual(this.starNum, switchSongItem.starNum) && Intrinsics.areEqual(this.score, switchSongItem.score) && Intrinsics.areEqual(this.calories, switchSongItem.calories);
    }

    @Nullable
    public final String getAliasName() {
        return this.aliasName;
    }

    @Nullable
    public final String getCalories() {
        return this.calories;
    }

    @Nullable
    public final Double[] getColor() {
        return this.color;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    @Nullable
    public final String getShare() {
        return this.share;
    }

    @Nullable
    public final String getSongName() {
        return this.songName;
    }

    @Nullable
    public final Integer getStarNum() {
        return this.starNum;
    }

    public int hashCode() {
        String str = this.songName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.share;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.aliasName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double[] dArr = this.color;
        int iHashCode5 = (iHashCode4 + (dArr == null ? 0 : Arrays.hashCode(dArr))) * 31;
        Integer num = this.starNum;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.score;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.calories;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SwitchSongItem(songName=" + this.songName + ", name=" + this.name + ", share=" + this.share + ", aliasName=" + this.aliasName + ", color=" + Arrays.toString(this.color) + ", starNum=" + this.starNum + ", score=" + this.score + ", calories=" + this.calories + ")";
    }
}
