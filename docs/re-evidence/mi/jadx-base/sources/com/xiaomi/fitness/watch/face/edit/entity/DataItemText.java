package com.xiaomi.fitness.watch.face.edit.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u0006HÆ\u0003J\t\u0010K\u001a\u00020\u0006HÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u0006HÆ\u0003J\t\u0010O\u001a\u00020\u0006HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0016HÆ\u0003J\t\u0010R\u001a\u00020\u0016HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÆ\u0003J\u0081\u0002\u0010V\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÆ\u0001J\u0013\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020\u0016HÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010#\"\u0004\b.\u0010,R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0017\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8F¢\u0006\u0006\u001a\u0004\b?\u0010;¨\u0006\\"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/DataItemText;", "", "name", "", "fontId", "fontSize", "", "fontWeight", "color", "style", "align", "longMode", "letterSpace", "width", "height", "lineSpace", "rotation", "radius", "startAngle", "span", "textStr", "literalNum", "", "literalStringLength", "literalWholeFont", "literalCropFont", "sourceList", "", "Lcom/xiaomi/fitness/watch/face/edit/entity/TextContent;", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFFFFFLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getFontId", "getFontSize", "()F", "getFontWeight", "getColor", "getStyle", "getAlign", "getLongMode", "getLetterSpace", "getWidth", "setWidth", "(F)V", "getHeight", "setHeight", "getLineSpace", "getRotation", "getRadius", "getStartAngle", "getSpan", "getTextStr", "getLiteralNum", "()I", "getLiteralStringLength", "getLiteralWholeFont", "getLiteralCropFont", "getSourceList", "()Ljava/util/List;", "setSourceList", "(Ljava/util/List;)V", "textList", "getTextList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DataItemText {

    @Nullable
    private final String align;

    @Nullable
    private final String color;

    @Nullable
    private final String fontId;
    private final float fontSize;

    @Nullable
    private final String fontWeight;
    private float height;
    private final float letterSpace;
    private final float lineSpace;

    @Nullable
    private final String literalCropFont;
    private final int literalNum;
    private final int literalStringLength;

    @Nullable
    private final String literalWholeFont;

    @Nullable
    private final String longMode;

    @Nullable
    private final String name;
    private final float radius;
    private final float rotation;

    @Nullable
    private List<TextContent> sourceList;
    private final float span;
    private final float startAngle;

    @Nullable
    private final String style;

    @Nullable
    private final String textStr;
    private float width;

    public DataItemText(@Nullable String str, @Nullable String str2, float f, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, @Nullable String str8, int i, int i2, @Nullable String str9, @Nullable String str10, @Nullable List<TextContent> list) {
        this.name = str;
        this.fontId = str2;
        this.fontSize = f;
        this.fontWeight = str3;
        this.color = str4;
        this.style = str5;
        this.align = str6;
        this.longMode = str7;
        this.letterSpace = f2;
        this.width = f3;
        this.height = f4;
        this.lineSpace = f5;
        this.rotation = f6;
        this.radius = f7;
        this.startAngle = f8;
        this.span = f9;
        this.textStr = str8;
        this.literalNum = i;
        this.literalStringLength = i2;
        this.literalWholeFont = str9;
        this.literalCropFont = str10;
        this.sourceList = list;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getLineSpace() {
        return this.lineSpace;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final float getStartAngle() {
        return this.startAngle;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final float getSpan() {
        return this.span;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTextStr() {
        return this.textStr;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getLiteralNum() {
        return this.literalNum;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getLiteralStringLength() {
        return this.literalStringLength;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFontId() {
        return this.fontId;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getLiteralWholeFont() {
        return this.literalWholeFont;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getLiteralCropFont() {
        return this.literalCropFont;
    }

    @Nullable
    public final List<TextContent> component22() {
        return this.sourceList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getFontSize() {
        return this.fontSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFontWeight() {
        return this.fontWeight;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAlign() {
        return this.align;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLongMode() {
        return this.longMode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getLetterSpace() {
        return this.letterSpace;
    }

    @NotNull
    public final DataItemText copy(@Nullable String name, @Nullable String fontId, float fontSize, @Nullable String fontWeight, @Nullable String color, @Nullable String style, @Nullable String align, @Nullable String longMode, float letterSpace, float width, float height, float lineSpace, float rotation, float radius, float startAngle, float span, @Nullable String textStr, int literalNum, int literalStringLength, @Nullable String literalWholeFont, @Nullable String literalCropFont, @Nullable List<TextContent> sourceList) {
        return new DataItemText(name, fontId, fontSize, fontWeight, color, style, align, longMode, letterSpace, width, height, lineSpace, rotation, radius, startAngle, span, textStr, literalNum, literalStringLength, literalWholeFont, literalCropFont, sourceList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataItemText)) {
            return false;
        }
        DataItemText dataItemText = (DataItemText) other;
        return Intrinsics.areEqual(this.name, dataItemText.name) && Intrinsics.areEqual(this.fontId, dataItemText.fontId) && Float.compare(this.fontSize, dataItemText.fontSize) == 0 && Intrinsics.areEqual(this.fontWeight, dataItemText.fontWeight) && Intrinsics.areEqual(this.color, dataItemText.color) && Intrinsics.areEqual(this.style, dataItemText.style) && Intrinsics.areEqual(this.align, dataItemText.align) && Intrinsics.areEqual(this.longMode, dataItemText.longMode) && Float.compare(this.letterSpace, dataItemText.letterSpace) == 0 && Float.compare(this.width, dataItemText.width) == 0 && Float.compare(this.height, dataItemText.height) == 0 && Float.compare(this.lineSpace, dataItemText.lineSpace) == 0 && Float.compare(this.rotation, dataItemText.rotation) == 0 && Float.compare(this.radius, dataItemText.radius) == 0 && Float.compare(this.startAngle, dataItemText.startAngle) == 0 && Float.compare(this.span, dataItemText.span) == 0 && Intrinsics.areEqual(this.textStr, dataItemText.textStr) && this.literalNum == dataItemText.literalNum && this.literalStringLength == dataItemText.literalStringLength && Intrinsics.areEqual(this.literalWholeFont, dataItemText.literalWholeFont) && Intrinsics.areEqual(this.literalCropFont, dataItemText.literalCropFont) && Intrinsics.areEqual(this.sourceList, dataItemText.sourceList);
    }

    @Nullable
    public final String getAlign() {
        return this.align;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final String getFontId() {
        return this.fontId;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    @Nullable
    public final String getFontWeight() {
        return this.fontWeight;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getLetterSpace() {
        return this.letterSpace;
    }

    public final float getLineSpace() {
        return this.lineSpace;
    }

    @Nullable
    public final String getLiteralCropFont() {
        return this.literalCropFont;
    }

    public final int getLiteralNum() {
        return this.literalNum;
    }

    public final int getLiteralStringLength() {
        return this.literalStringLength;
    }

    @Nullable
    public final String getLiteralWholeFont() {
        return this.literalWholeFont;
    }

    @Nullable
    public final String getLongMode() {
        return this.longMode;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final float getRotation() {
        return this.rotation;
    }

    @Nullable
    public final List<TextContent> getSourceList() {
        return this.sourceList;
    }

    public final float getSpan() {
        return this.span;
    }

    public final float getStartAngle() {
        return this.startAngle;
    }

    @Nullable
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    public final List<String> getTextList() {
        String str;
        return (this.literalNum == 0 || (str = this.textStr) == null || str.length() == 0) ? CollectionsKt__CollectionsKt.emptyList() : StringsKt__StringsKt.split$default((CharSequence) this.textStr, new String[]{"\\0"}, false, 0, 6, (Object) null);
    }

    @Nullable
    public final String getTextStr() {
        return this.textStr;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fontId;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Float.hashCode(this.fontSize)) * 31;
        String str3 = this.fontWeight;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.color;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.style;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.align;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.longMode;
        int iHashCode7 = (((((((((((((((((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + Float.hashCode(this.letterSpace)) * 31) + Float.hashCode(this.width)) * 31) + Float.hashCode(this.height)) * 31) + Float.hashCode(this.lineSpace)) * 31) + Float.hashCode(this.rotation)) * 31) + Float.hashCode(this.radius)) * 31) + Float.hashCode(this.startAngle)) * 31) + Float.hashCode(this.span)) * 31;
        String str8 = this.textStr;
        int iHashCode8 = (((((iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + Integer.hashCode(this.literalNum)) * 31) + Integer.hashCode(this.literalStringLength)) * 31;
        String str9 = this.literalWholeFont;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.literalCropFont;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<TextContent> list = this.sourceList;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setSourceList(@Nullable List<TextContent> list) {
        this.sourceList = list;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    @NotNull
    public String toString() {
        return "DataItemText(name=" + this.name + ", fontId=" + this.fontId + ", fontSize=" + this.fontSize + ", fontWeight=" + this.fontWeight + ", color=" + this.color + ", style=" + this.style + ", align=" + this.align + ", longMode=" + this.longMode + ", letterSpace=" + this.letterSpace + ", width=" + this.width + ", height=" + this.height + ", lineSpace=" + this.lineSpace + ", rotation=" + this.rotation + ", radius=" + this.radius + ", startAngle=" + this.startAngle + ", span=" + this.span + ", textStr=" + this.textStr + ", literalNum=" + this.literalNum + ", literalStringLength=" + this.literalStringLength + ", literalWholeFont=" + this.literalWholeFont + ", literalCropFont=" + this.literalCropFont + ", sourceList=" + this.sourceList + ")";
    }

    public /* synthetic */ DataItemText(String str, String str2, float f, String str3, String str4, String str5, String str6, String str7, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, String str8, int i, int i2, String str9, String str10, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, f, str3, str4, str5, str6, str7, f2, f3, f4, f5, f6, f7, f8, f9, str8, i, i2, str9, str10, (i3 & 2097152) != 0 ? null : list);
    }
}
