package com.huami.sleep.sleephome.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u000f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001f¨\u0006("}, d2 = {"Lcom/huami/sleep/sleephome/vo/ShareSleepVo;", "", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "date", "title", "score", "deepDur", "startMin", "endMin", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "b", "getTitle", "c", LogUtil.I, "getScore", "()I", GoogleApiAvailabilityLight.a, "getDeepDur", "e", "getStartMin", "f", "getEndMin", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIII)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ShareSleepVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int score;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int deepDur;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int startMin;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int endMin;

    public ShareSleepVo(@NotNull String str, @NotNull String str2, int i, int i2, int i3, int i4) {
        this.date = str;
        this.title = str2;
        this.score = i;
        this.deepDur = i2;
        this.startMin = i3;
        this.endMin = i4;
    }

    public static /* synthetic */ ShareSleepVo copy$default(ShareSleepVo shareSleepVo, String str, String str2, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = shareSleepVo.date;
        }
        if ((i5 & 2) != 0) {
            str2 = shareSleepVo.title;
        }
        String str3 = str2;
        if ((i5 & 4) != 0) {
            i = shareSleepVo.score;
        }
        int i6 = i;
        if ((i5 & 8) != 0) {
            i2 = shareSleepVo.deepDur;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = shareSleepVo.startMin;
        }
        int i8 = i3;
        if ((i5 & 32) != 0) {
            i4 = shareSleepVo.endMin;
        }
        return shareSleepVo.copy(str, str3, i6, i7, i8, i4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeepDur() {
        return this.deepDur;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStartMin() {
        return this.startMin;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getEndMin() {
        return this.endMin;
    }

    @NotNull
    public final ShareSleepVo copy(@NotNull String date, @NotNull String title, int score, int deepDur, int startMin, int endMin) {
        return new ShareSleepVo(date, title, score, deepDur, startMin, endMin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareSleepVo)) {
            return false;
        }
        ShareSleepVo shareSleepVo = (ShareSleepVo) other;
        return Intrinsics.areEqual(this.date, shareSleepVo.date) && Intrinsics.areEqual(this.title, shareSleepVo.title) && this.score == shareSleepVo.score && this.deepDur == shareSleepVo.deepDur && this.startMin == shareSleepVo.startMin && this.endMin == shareSleepVo.endMin;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final int getDeepDur() {
        return this.deepDur;
    }

    public final int getEndMin() {
        return this.endMin;
    }

    public final int getScore() {
        return this.score;
    }

    public final int getStartMin() {
        return this.startMin;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((this.date.hashCode() * 31) + this.title.hashCode()) * 31) + this.score) * 31) + this.deepDur) * 31) + this.startMin) * 31) + this.endMin;
    }

    @NotNull
    public String toString() {
        return "ShareSleepVo(date=" + this.date + ", title=" + this.title + ", score=" + this.score + ", deepDur=" + this.deepDur + ", startMin=" + this.startMin + ", endMin=" + this.endMin + ")";
    }
}
