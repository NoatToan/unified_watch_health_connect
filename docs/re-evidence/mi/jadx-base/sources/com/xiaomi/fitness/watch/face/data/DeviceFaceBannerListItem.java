package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/DeviceFaceBannerListItem;", "", "id", "", "main_title", "", "img_url", "jump_link", SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, "", SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "getId", "()I", "getMain_title", "()Ljava/lang/String;", "getImg_url", "getJump_link", "getStart_time", "()J", "getEnd_time", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceFaceBannerListItem {

    @SerializedName("endTime")
    private final long end_time;

    @SerializedName("id")
    private final int id;

    @SerializedName("iconHead")
    @NotNull
    private final String img_url;

    @SerializedName("jumpSource")
    @NotNull
    private final String jump_link;

    @SerializedName("mainTitle")
    @NotNull
    private final String main_title;

    @SerializedName("startTime")
    private final long start_time;

    public DeviceFaceBannerListItem(int i, @NotNull String main_title, @NotNull String img_url, @NotNull String jump_link, long j, long j2) {
        Intrinsics.checkNotNullParameter(main_title, "main_title");
        Intrinsics.checkNotNullParameter(img_url, "img_url");
        Intrinsics.checkNotNullParameter(jump_link, "jump_link");
        this.id = i;
        this.main_title = main_title;
        this.img_url = img_url;
        this.jump_link = jump_link;
        this.start_time = j;
        this.end_time = j2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMain_title() {
        return this.main_title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImg_url() {
        return this.img_url;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getJump_link() {
        return this.jump_link;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getStart_time() {
        return this.start_time;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getEnd_time() {
        return this.end_time;
    }

    @NotNull
    public final DeviceFaceBannerListItem copy(int id, @NotNull String main_title, @NotNull String img_url, @NotNull String jump_link, long start_time, long end_time) {
        Intrinsics.checkNotNullParameter(main_title, "main_title");
        Intrinsics.checkNotNullParameter(img_url, "img_url");
        Intrinsics.checkNotNullParameter(jump_link, "jump_link");
        return new DeviceFaceBannerListItem(id, main_title, img_url, jump_link, start_time, end_time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceFaceBannerListItem)) {
            return false;
        }
        DeviceFaceBannerListItem deviceFaceBannerListItem = (DeviceFaceBannerListItem) other;
        return this.id == deviceFaceBannerListItem.id && Intrinsics.areEqual(this.main_title, deviceFaceBannerListItem.main_title) && Intrinsics.areEqual(this.img_url, deviceFaceBannerListItem.img_url) && Intrinsics.areEqual(this.jump_link, deviceFaceBannerListItem.jump_link) && this.start_time == deviceFaceBannerListItem.start_time && this.end_time == deviceFaceBannerListItem.end_time;
    }

    public final long getEnd_time() {
        return this.end_time;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getImg_url() {
        return this.img_url;
    }

    @NotNull
    public final String getJump_link() {
        return this.jump_link;
    }

    @NotNull
    public final String getMain_title() {
        return this.main_title;
    }

    public final long getStart_time() {
        return this.start_time;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.main_title.hashCode()) * 31) + this.img_url.hashCode()) * 31) + this.jump_link.hashCode()) * 31) + Long.hashCode(this.start_time)) * 31) + Long.hashCode(this.end_time);
    }

    @NotNull
    public String toString() {
        return "DeviceFaceBannerListItem(id=" + this.id + ", main_title=" + this.main_title + ", img_url=" + this.img_url + ", jump_link=" + this.jump_link + ", start_time=" + this.start_time + ", end_time=" + this.end_time + ")";
    }
}
