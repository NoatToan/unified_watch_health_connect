package com.xiaomi.fitness.sport.data;

import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003Jw\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/sport/data/HighlightInfo;", "", "type", "", MiuiCursorConstants.CONTENT, "", "title", "picFunction", "picFunctionDark", "colorTitle", "colorTitleDark", "colorContent", "colorContentDark", "colorSubContent", "colorSubContentDark", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()I", "getContent", "()Ljava/lang/String;", "getTitle", "getPicFunction", "getPicFunctionDark", "getColorTitle", "getColorTitleDark", "getColorContent", "getColorContentDark", "getColorSubContent", "getColorSubContentDark", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HighlightInfo {

    @NotNull
    private final String colorContent;

    @NotNull
    private final String colorContentDark;

    @NotNull
    private final String colorSubContent;

    @NotNull
    private final String colorSubContentDark;

    @NotNull
    private final String colorTitle;

    @NotNull
    private final String colorTitleDark;

    @NotNull
    private final String content;

    @NotNull
    private final String picFunction;

    @NotNull
    private final String picFunctionDark;

    @NotNull
    private final String title;
    private final int type;

    public HighlightInfo(int i, @NotNull String content, @NotNull String title, @NotNull String picFunction, @NotNull String picFunctionDark, @NotNull String colorTitle, @NotNull String colorTitleDark, @NotNull String colorContent, @NotNull String colorContentDark, @NotNull String colorSubContent, @NotNull String colorSubContentDark) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(picFunction, "picFunction");
        Intrinsics.checkNotNullParameter(picFunctionDark, "picFunctionDark");
        Intrinsics.checkNotNullParameter(colorTitle, "colorTitle");
        Intrinsics.checkNotNullParameter(colorTitleDark, "colorTitleDark");
        Intrinsics.checkNotNullParameter(colorContent, "colorContent");
        Intrinsics.checkNotNullParameter(colorContentDark, "colorContentDark");
        Intrinsics.checkNotNullParameter(colorSubContent, "colorSubContent");
        Intrinsics.checkNotNullParameter(colorSubContentDark, "colorSubContentDark");
        this.type = i;
        this.content = content;
        this.title = title;
        this.picFunction = picFunction;
        this.picFunctionDark = picFunctionDark;
        this.colorTitle = colorTitle;
        this.colorTitleDark = colorTitleDark;
        this.colorContent = colorContent;
        this.colorContentDark = colorContentDark;
        this.colorSubContent = colorSubContent;
        this.colorSubContentDark = colorSubContentDark;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getColorSubContent() {
        return this.colorSubContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
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
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPicFunction() {
        return this.picFunction;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPicFunctionDark() {
        return this.picFunctionDark;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getColorTitle() {
        return this.colorTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getColorTitleDark() {
        return this.colorTitleDark;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getColorContent() {
        return this.colorContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getColorContentDark() {
        return this.colorContentDark;
    }

    @NotNull
    public final HighlightInfo copy(int type, @NotNull String content, @NotNull String title, @NotNull String picFunction, @NotNull String picFunctionDark, @NotNull String colorTitle, @NotNull String colorTitleDark, @NotNull String colorContent, @NotNull String colorContentDark, @NotNull String colorSubContent, @NotNull String colorSubContentDark) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(picFunction, "picFunction");
        Intrinsics.checkNotNullParameter(picFunctionDark, "picFunctionDark");
        Intrinsics.checkNotNullParameter(colorTitle, "colorTitle");
        Intrinsics.checkNotNullParameter(colorTitleDark, "colorTitleDark");
        Intrinsics.checkNotNullParameter(colorContent, "colorContent");
        Intrinsics.checkNotNullParameter(colorContentDark, "colorContentDark");
        Intrinsics.checkNotNullParameter(colorSubContent, "colorSubContent");
        Intrinsics.checkNotNullParameter(colorSubContentDark, "colorSubContentDark");
        return new HighlightInfo(type, content, title, picFunction, picFunctionDark, colorTitle, colorTitleDark, colorContent, colorContentDark, colorSubContent, colorSubContentDark);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightInfo)) {
            return false;
        }
        HighlightInfo highlightInfo = (HighlightInfo) other;
        return this.type == highlightInfo.type && Intrinsics.areEqual(this.content, highlightInfo.content) && Intrinsics.areEqual(this.title, highlightInfo.title) && Intrinsics.areEqual(this.picFunction, highlightInfo.picFunction) && Intrinsics.areEqual(this.picFunctionDark, highlightInfo.picFunctionDark) && Intrinsics.areEqual(this.colorTitle, highlightInfo.colorTitle) && Intrinsics.areEqual(this.colorTitleDark, highlightInfo.colorTitleDark) && Intrinsics.areEqual(this.colorContent, highlightInfo.colorContent) && Intrinsics.areEqual(this.colorContentDark, highlightInfo.colorContentDark) && Intrinsics.areEqual(this.colorSubContent, highlightInfo.colorSubContent) && Intrinsics.areEqual(this.colorSubContentDark, highlightInfo.colorSubContentDark);
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
    public final String getPicFunction() {
        return this.picFunction;
    }

    @NotNull
    public final String getPicFunctionDark() {
        return this.picFunctionDark;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.type) * 31) + this.content.hashCode()) * 31) + this.title.hashCode()) * 31) + this.picFunction.hashCode()) * 31) + this.picFunctionDark.hashCode()) * 31) + this.colorTitle.hashCode()) * 31) + this.colorTitleDark.hashCode()) * 31) + this.colorContent.hashCode()) * 31) + this.colorContentDark.hashCode()) * 31) + this.colorSubContent.hashCode()) * 31) + this.colorSubContentDark.hashCode();
    }

    @NotNull
    public String toString() {
        return "HighlightInfo(type=" + this.type + ", content=" + this.content + ", title=" + this.title + ", picFunction=" + this.picFunction + ", picFunctionDark=" + this.picFunctionDark + ", colorTitle=" + this.colorTitle + ", colorTitleDark=" + this.colorTitleDark + ", colorContent=" + this.colorContent + ", colorContentDark=" + this.colorContentDark + ", colorSubContent=" + this.colorSubContent + ", colorSubContentDark=" + this.colorSubContentDark + ")";
    }

    public /* synthetic */ HighlightInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, (i2 & 32) != 0 ? "#000000" : str5, (i2 & 64) != 0 ? "#FFFFFF" : str6, (i2 & 128) != 0 ? "#000000" : str7, (i2 & 256) != 0 ? "#FFFFFF" : str8, (i2 & 512) != 0 ? "#000000" : str9, (i2 & 1024) != 0 ? "#FFFFFF" : str10);
    }
}
