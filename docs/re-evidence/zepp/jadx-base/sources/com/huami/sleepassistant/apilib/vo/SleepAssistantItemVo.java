package com.huami.sleepassistant.apilib.vo;

import com.alipay.sdk.m.x.d;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/huami/sleepassistant/apilib/vo/SleepAssistantItemVo;", "", "", "component1", "component2", "", "component3", "component4", "()Ljava/lang/Integer;", "title", "subTitle", "image", "background", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Lcom/huami/sleepassistant/apilib/vo/SleepAssistantItemVo;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", d.o, "(Ljava/lang/String;)V", "getSubTitle", "setSubTitle", LogUtil.I, "getImage", "()I", "setImage", "(I)V", "Ljava/lang/Integer;", "getBackground", "setBackground", "(Ljava/lang/Integer;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepAssistantItemVo {

    @Nullable
    private Integer background;
    private int image;

    @NotNull
    private String subTitle;

    @NotNull
    private String title;

    public SleepAssistantItemVo() {
        this(null, null, 0, null, 15, null);
    }

    public SleepAssistantItemVo(@NotNull String str, @NotNull String str2, int i, @Nullable Integer num) {
        this.title = str;
        this.subTitle = str2;
        this.image = i;
        this.background = num;
    }

    public static /* synthetic */ SleepAssistantItemVo copy$default(SleepAssistantItemVo sleepAssistantItemVo, String str, String str2, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sleepAssistantItemVo.title;
        }
        if ((i2 & 2) != 0) {
            str2 = sleepAssistantItemVo.subTitle;
        }
        if ((i2 & 4) != 0) {
            i = sleepAssistantItemVo.image;
        }
        if ((i2 & 8) != 0) {
            num = sleepAssistantItemVo.background;
        }
        return sleepAssistantItemVo.copy(str, str2, i, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getBackground() {
        return this.background;
    }

    @NotNull
    public final SleepAssistantItemVo copy(@NotNull String title, @NotNull String subTitle, int image, @Nullable Integer background) {
        return new SleepAssistantItemVo(title, subTitle, image, background);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepAssistantItemVo)) {
            return false;
        }
        SleepAssistantItemVo sleepAssistantItemVo = (SleepAssistantItemVo) other;
        return Intrinsics.areEqual(this.title, sleepAssistantItemVo.title) && Intrinsics.areEqual(this.subTitle, sleepAssistantItemVo.subTitle) && this.image == sleepAssistantItemVo.image && Intrinsics.areEqual(this.background, sleepAssistantItemVo.background);
    }

    @Nullable
    public final Integer getBackground() {
        return this.background;
    }

    public final int getImage() {
        return this.image;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.subTitle.hashCode()) * 31) + this.image) * 31;
        Integer num = this.background;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setBackground(@Nullable Integer num) {
        this.background = num;
    }

    public final void setImage(int i) {
        this.image = i;
    }

    public final void setSubTitle(@NotNull String str) {
        this.subTitle = str;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "SleepAssistantItemVo(title=" + this.title + ", subTitle=" + this.subTitle + ", image=" + this.image + ", background=" + this.background + ')';
    }

    public /* synthetic */ SleepAssistantItemVo(String str, String str2, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0 : num);
    }
}
