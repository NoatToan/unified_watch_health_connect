package com.xiaomi.fitness.watch.face.edit.entity;

import com.xiaomi.smarthome.setting.ServerSetting;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B·\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010$J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003Jà\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010%\u001a\u0004\b&\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010%\u001a\u0004\b+\u0010$R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/CustomWidget;", "", "name", "", "widgetName", ServerSetting.SERVER_ENV_PREVIEW, "bg", "editBox", "bgColor", "icon", "groupType", "groupNameTranslation", "width", "", "height", "flexDirection", "justifyContent", "alignContent", "alignItems", "alignGap", "widgetItemList", "", "Lcom/xiaomi/fitness/watch/face/edit/entity/WidgetItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getWidgetName", "getPreview", "getBg", "getEditBox", "getBgColor", "getIcon", "getGroupType", "getGroupNameTranslation", "getWidth", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getHeight", "getFlexDirection", "getJustifyContent", "getAlignContent", "getAlignItems", "getAlignGap", "getWidgetItemList", "()Ljava/util/List;", "setWidgetItemList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/util/List;)Lcom/xiaomi/fitness/watch/face/edit/entity/CustomWidget;", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CustomWidget {

    @Nullable
    private final String alignContent;

    @Nullable
    private final Float alignGap;

    @Nullable
    private final String alignItems;

    @Nullable
    private final String bg;

    @Nullable
    private final String bgColor;

    @Nullable
    private final String editBox;

    @Nullable
    private final String flexDirection;

    @Nullable
    private final String groupNameTranslation;

    @Nullable
    private final String groupType;

    @Nullable
    private final Float height;

    @Nullable
    private final String icon;

    @Nullable
    private final String justifyContent;

    @Nullable
    private final String name;

    @Nullable
    private final String preview;

    @Nullable
    private List<WidgetItem> widgetItemList;

    @Nullable
    private final String widgetName;

    @Nullable
    private final Float width;

    public CustomWidget(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Float f, @Nullable Float f2, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Float f3, @Nullable List<WidgetItem> list) {
        this.name = str;
        this.widgetName = str2;
        this.preview = str3;
        this.bg = str4;
        this.editBox = str5;
        this.bgColor = str6;
        this.icon = str7;
        this.groupType = str8;
        this.groupNameTranslation = str9;
        this.width = f;
        this.height = f2;
        this.flexDirection = str10;
        this.justifyContent = str11;
        this.alignContent = str12;
        this.alignItems = str13;
        this.alignGap = f3;
        this.widgetItemList = list;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Float getWidth() {
        return this.width;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Float getHeight() {
        return this.height;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFlexDirection() {
        return this.flexDirection;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getJustifyContent() {
        return this.justifyContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAlignContent() {
        return this.alignContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAlignItems() {
        return this.alignItems;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Float getAlignGap() {
        return this.alignGap;
    }

    @Nullable
    public final List<WidgetItem> component17() {
        return this.widgetItemList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPreview() {
        return this.preview;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBg() {
        return this.bg;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEditBox() {
        return this.editBox;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGroupType() {
        return this.groupType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getGroupNameTranslation() {
        return this.groupNameTranslation;
    }

    @NotNull
    public final CustomWidget copy(@Nullable String name, @Nullable String widgetName, @Nullable String preview, @Nullable String bg, @Nullable String editBox, @Nullable String bgColor, @Nullable String icon, @Nullable String groupType, @Nullable String groupNameTranslation, @Nullable Float width, @Nullable Float height, @Nullable String flexDirection, @Nullable String justifyContent, @Nullable String alignContent, @Nullable String alignItems, @Nullable Float alignGap, @Nullable List<WidgetItem> widgetItemList) {
        return new CustomWidget(name, widgetName, preview, bg, editBox, bgColor, icon, groupType, groupNameTranslation, width, height, flexDirection, justifyContent, alignContent, alignItems, alignGap, widgetItemList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomWidget)) {
            return false;
        }
        CustomWidget customWidget = (CustomWidget) other;
        return Intrinsics.areEqual(this.name, customWidget.name) && Intrinsics.areEqual(this.widgetName, customWidget.widgetName) && Intrinsics.areEqual(this.preview, customWidget.preview) && Intrinsics.areEqual(this.bg, customWidget.bg) && Intrinsics.areEqual(this.editBox, customWidget.editBox) && Intrinsics.areEqual(this.bgColor, customWidget.bgColor) && Intrinsics.areEqual(this.icon, customWidget.icon) && Intrinsics.areEqual(this.groupType, customWidget.groupType) && Intrinsics.areEqual(this.groupNameTranslation, customWidget.groupNameTranslation) && Intrinsics.areEqual((Object) this.width, (Object) customWidget.width) && Intrinsics.areEqual((Object) this.height, (Object) customWidget.height) && Intrinsics.areEqual(this.flexDirection, customWidget.flexDirection) && Intrinsics.areEqual(this.justifyContent, customWidget.justifyContent) && Intrinsics.areEqual(this.alignContent, customWidget.alignContent) && Intrinsics.areEqual(this.alignItems, customWidget.alignItems) && Intrinsics.areEqual((Object) this.alignGap, (Object) customWidget.alignGap) && Intrinsics.areEqual(this.widgetItemList, customWidget.widgetItemList);
    }

    @Nullable
    public final String getAlignContent() {
        return this.alignContent;
    }

    @Nullable
    public final Float getAlignGap() {
        return this.alignGap;
    }

    @Nullable
    public final String getAlignItems() {
        return this.alignItems;
    }

    @Nullable
    public final String getBg() {
        return this.bg;
    }

    @Nullable
    public final String getBgColor() {
        return this.bgColor;
    }

    @Nullable
    public final String getEditBox() {
        return this.editBox;
    }

    @Nullable
    public final String getFlexDirection() {
        return this.flexDirection;
    }

    @Nullable
    public final String getGroupNameTranslation() {
        return this.groupNameTranslation;
    }

    @Nullable
    public final String getGroupType() {
        return this.groupType;
    }

    @Nullable
    public final Float getHeight() {
        return this.height;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getJustifyContent() {
        return this.justifyContent;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPreview() {
        return this.preview;
    }

    @Nullable
    public final List<WidgetItem> getWidgetItemList() {
        return this.widgetItemList;
    }

    @Nullable
    public final String getWidgetName() {
        return this.widgetName;
    }

    @Nullable
    public final Float getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.widgetName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.preview;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bg;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.editBox;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bgColor;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.icon;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.groupType;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.groupNameTranslation;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Float f = this.width;
        int iHashCode10 = (iHashCode9 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.height;
        int iHashCode11 = (iHashCode10 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str10 = this.flexDirection;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.justifyContent;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.alignContent;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.alignItems;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Float f3 = this.alignGap;
        int iHashCode16 = (iHashCode15 + (f3 == null ? 0 : f3.hashCode())) * 31;
        List<WidgetItem> list = this.widgetItemList;
        return iHashCode16 + (list != null ? list.hashCode() : 0);
    }

    public final void setWidgetItemList(@Nullable List<WidgetItem> list) {
        this.widgetItemList = list;
    }

    @NotNull
    public String toString() {
        return "CustomWidget(name=" + this.name + ", widgetName=" + this.widgetName + ", preview=" + this.preview + ", bg=" + this.bg + ", editBox=" + this.editBox + ", bgColor=" + this.bgColor + ", icon=" + this.icon + ", groupType=" + this.groupType + ", groupNameTranslation=" + this.groupNameTranslation + ", width=" + this.width + ", height=" + this.height + ", flexDirection=" + this.flexDirection + ", justifyContent=" + this.justifyContent + ", alignContent=" + this.alignContent + ", alignItems=" + this.alignItems + ", alignGap=" + this.alignGap + ", widgetItemList=" + this.widgetItemList + ")";
    }
}
