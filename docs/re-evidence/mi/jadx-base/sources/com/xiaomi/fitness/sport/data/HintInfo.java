package com.xiaomi.fitness.sport.data;

import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0007HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/sport/data/HintInfo;", "", CardUIInfo.KEY_SUBTITILE, "", MiuiCursorConstants.CONTENT, "subContent", "type", "", "actionInfo", "Lcom/xiaomi/fitness/sport/data/ActionInfo;", "timerInfo", "Lcom/xiaomi/fitness/sport/data/TimerInfo;", "colorTitle", "colorTitleDark", "colorSubTitle", "colorSubTitleDark", "colorContent", "colorContentDark", "colorSubContent", "colorSubContentDark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/xiaomi/fitness/sport/data/ActionInfo;Lcom/xiaomi/fitness/sport/data/TimerInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSubTitle", "()Ljava/lang/String;", "getContent", "getSubContent", "getType", "()I", "getActionInfo", "()Lcom/xiaomi/fitness/sport/data/ActionInfo;", "getTimerInfo", "()Lcom/xiaomi/fitness/sport/data/TimerInfo;", "getColorTitle", "getColorTitleDark", "getColorSubTitle", "getColorSubTitleDark", "getColorContent", "getColorContentDark", "getColorSubContent", "getColorSubContentDark", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HintInfo {

    @NotNull
    private final ActionInfo actionInfo;

    @NotNull
    private final String colorContent;

    @NotNull
    private final String colorContentDark;

    @NotNull
    private final String colorSubContent;

    @NotNull
    private final String colorSubContentDark;

    @NotNull
    private final String colorSubTitle;

    @NotNull
    private final String colorSubTitleDark;

    @NotNull
    private final String colorTitle;

    @NotNull
    private final String colorTitleDark;

    @NotNull
    private final String content;

    @NotNull
    private final String subContent;

    @NotNull
    private final String subTitle;

    @NotNull
    private final TimerInfo timerInfo;
    private final int type;

    public HintInfo(@NotNull String subTitle, @NotNull String content, @NotNull String subContent, int i, @NotNull ActionInfo actionInfo, @NotNull TimerInfo timerInfo, @NotNull String colorTitle, @NotNull String colorTitleDark, @NotNull String colorSubTitle, @NotNull String colorSubTitleDark, @NotNull String colorContent, @NotNull String colorContentDark, @NotNull String colorSubContent, @NotNull String colorSubContentDark) {
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(subContent, "subContent");
        Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
        Intrinsics.checkNotNullParameter(timerInfo, "timerInfo");
        Intrinsics.checkNotNullParameter(colorTitle, "colorTitle");
        Intrinsics.checkNotNullParameter(colorTitleDark, "colorTitleDark");
        Intrinsics.checkNotNullParameter(colorSubTitle, "colorSubTitle");
        Intrinsics.checkNotNullParameter(colorSubTitleDark, "colorSubTitleDark");
        Intrinsics.checkNotNullParameter(colorContent, "colorContent");
        Intrinsics.checkNotNullParameter(colorContentDark, "colorContentDark");
        Intrinsics.checkNotNullParameter(colorSubContent, "colorSubContent");
        Intrinsics.checkNotNullParameter(colorSubContentDark, "colorSubContentDark");
        this.subTitle = subTitle;
        this.content = content;
        this.subContent = subContent;
        this.type = i;
        this.actionInfo = actionInfo;
        this.timerInfo = timerInfo;
        this.colorTitle = colorTitle;
        this.colorTitleDark = colorTitleDark;
        this.colorSubTitle = colorSubTitle;
        this.colorSubTitleDark = colorSubTitleDark;
        this.colorContent = colorContent;
        this.colorContentDark = colorContentDark;
        this.colorSubContent = colorSubContent;
        this.colorSubContentDark = colorSubContentDark;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getColorSubTitleDark() {
        return this.colorSubTitleDark;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getColorContent() {
        return this.colorContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getColorContentDark() {
        return this.colorContentDark;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getColorSubContent() {
        return this.colorSubContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getColorSubContentDark() {
        return this.colorSubContentDark;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubContent() {
        return this.subContent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ActionInfo getActionInfo() {
        return this.actionInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TimerInfo getTimerInfo() {
        return this.timerInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getColorTitle() {
        return this.colorTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getColorTitleDark() {
        return this.colorTitleDark;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getColorSubTitle() {
        return this.colorSubTitle;
    }

    @NotNull
    public final HintInfo copy(@NotNull String subTitle, @NotNull String content, @NotNull String subContent, int type, @NotNull ActionInfo actionInfo, @NotNull TimerInfo timerInfo, @NotNull String colorTitle, @NotNull String colorTitleDark, @NotNull String colorSubTitle, @NotNull String colorSubTitleDark, @NotNull String colorContent, @NotNull String colorContentDark, @NotNull String colorSubContent, @NotNull String colorSubContentDark) {
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(subContent, "subContent");
        Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
        Intrinsics.checkNotNullParameter(timerInfo, "timerInfo");
        Intrinsics.checkNotNullParameter(colorTitle, "colorTitle");
        Intrinsics.checkNotNullParameter(colorTitleDark, "colorTitleDark");
        Intrinsics.checkNotNullParameter(colorSubTitle, "colorSubTitle");
        Intrinsics.checkNotNullParameter(colorSubTitleDark, "colorSubTitleDark");
        Intrinsics.checkNotNullParameter(colorContent, "colorContent");
        Intrinsics.checkNotNullParameter(colorContentDark, "colorContentDark");
        Intrinsics.checkNotNullParameter(colorSubContent, "colorSubContent");
        Intrinsics.checkNotNullParameter(colorSubContentDark, "colorSubContentDark");
        return new HintInfo(subTitle, content, subContent, type, actionInfo, timerInfo, colorTitle, colorTitleDark, colorSubTitle, colorSubTitleDark, colorContent, colorContentDark, colorSubContent, colorSubContentDark);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HintInfo)) {
            return false;
        }
        HintInfo hintInfo = (HintInfo) other;
        return Intrinsics.areEqual(this.subTitle, hintInfo.subTitle) && Intrinsics.areEqual(this.content, hintInfo.content) && Intrinsics.areEqual(this.subContent, hintInfo.subContent) && this.type == hintInfo.type && Intrinsics.areEqual(this.actionInfo, hintInfo.actionInfo) && Intrinsics.areEqual(this.timerInfo, hintInfo.timerInfo) && Intrinsics.areEqual(this.colorTitle, hintInfo.colorTitle) && Intrinsics.areEqual(this.colorTitleDark, hintInfo.colorTitleDark) && Intrinsics.areEqual(this.colorSubTitle, hintInfo.colorSubTitle) && Intrinsics.areEqual(this.colorSubTitleDark, hintInfo.colorSubTitleDark) && Intrinsics.areEqual(this.colorContent, hintInfo.colorContent) && Intrinsics.areEqual(this.colorContentDark, hintInfo.colorContentDark) && Intrinsics.areEqual(this.colorSubContent, hintInfo.colorSubContent) && Intrinsics.areEqual(this.colorSubContentDark, hintInfo.colorSubContentDark);
    }

    @NotNull
    public final ActionInfo getActionInfo() {
        return this.actionInfo;
    }

    @NotNull
    public final String getColorContent() {
        return this.colorContent;
    }

    @NotNull
    public final String getColorContentDark() {
        return this.colorContentDark;
    }

    @NotNull
    public final String getColorSubContent() {
        return this.colorSubContent;
    }

    @NotNull
    public final String getColorSubContentDark() {
        return this.colorSubContentDark;
    }

    @NotNull
    public final String getColorSubTitle() {
        return this.colorSubTitle;
    }

    @NotNull
    public final String getColorSubTitleDark() {
        return this.colorSubTitleDark;
    }

    @NotNull
    public final String getColorTitle() {
        return this.colorTitle;
    }

    @NotNull
    public final String getColorTitleDark() {
        return this.colorTitleDark;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getSubContent() {
        return this.subContent;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final TimerInfo getTimerInfo() {
        return this.timerInfo;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.subTitle.hashCode() * 31) + this.content.hashCode()) * 31) + this.subContent.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + this.actionInfo.hashCode()) * 31) + this.timerInfo.hashCode()) * 31) + this.colorTitle.hashCode()) * 31) + this.colorTitleDark.hashCode()) * 31) + this.colorSubTitle.hashCode()) * 31) + this.colorSubTitleDark.hashCode()) * 31) + this.colorContent.hashCode()) * 31) + this.colorContentDark.hashCode()) * 31) + this.colorSubContent.hashCode()) * 31) + this.colorSubContentDark.hashCode();
    }

    @NotNull
    public String toString() {
        return "HintInfo(subTitle=" + this.subTitle + ", content=" + this.content + ", subContent=" + this.subContent + ", type=" + this.type + ", actionInfo=" + this.actionInfo + ", timerInfo=" + this.timerInfo + ", colorTitle=" + this.colorTitle + ", colorTitleDark=" + this.colorTitleDark + ", colorSubTitle=" + this.colorSubTitle + ", colorSubTitleDark=" + this.colorSubTitleDark + ", colorContent=" + this.colorContent + ", colorContentDark=" + this.colorContentDark + ", colorSubContent=" + this.colorSubContent + ", colorSubContentDark=" + this.colorSubContentDark + ")";
    }

    public /* synthetic */ HintInfo(String str, String str2, String str3, int i, ActionInfo actionInfo, TimerInfo timerInfo, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, actionInfo, timerInfo, (i2 & 64) != 0 ? "#000000" : str4, (i2 & 128) != 0 ? "#FFFFFF" : str5, (i2 & 256) != 0 ? "#000000" : str6, (i2 & 512) != 0 ? "#FFFFFF" : str7, (i2 & 1024) != 0 ? "#80000000" : str8, (i2 & 2048) != 0 ? "#66FFFFFF" : str9, (i2 & 4096) != 0 ? "#80000000" : str10, (i2 & 8192) != 0 ? "#66FFFFFF" : str11);
    }
}
