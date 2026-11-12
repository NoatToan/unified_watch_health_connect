package com.xiaomi.fitness.notify.data;

import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b=\b\u0086\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010N\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u001cHÆ\u0003J¢\u0002\u0010S\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010TJ\u0013\u0010U\u001a\u00020\u00162\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020\u0003HÖ\u0001J\t\u0010X\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u00105\u001a\u0004\b6\u00104R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006Y"}, d2 = {"Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BaseInfo;", "", "type", "", "title", "", "colorTitle", "colorTitleDark", CardUIInfo.KEY_SUBTITILE, "colorSubTitle", "colorSubTitleDark", MiuiCursorConstants.CONTENT, "colorContent", "colorContentDark", "colorContentBg", "subContent", "colorSubContent", "colorSubContentDark", "buttonTitle", "colorButtonTitle", "colorButtonBg", "showDivider", "", "showContentDivider", "specialTitle", "colorSpecialTitle", "colorSpecialBg", "actionInfo", "Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2ActionInfo;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2ActionInfo;)V", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "getColorTitle", "getColorTitleDark", "getSubTitle", "getColorSubTitle", "getColorSubTitleDark", "getContent", "getColorContent", "getColorContentDark", "getColorContentBg", "getSubContent", "getColorSubContent", "getColorSubContentDark", "getButtonTitle", "getColorButtonTitle", "getColorButtonBg", "getShowDivider", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowContentDivider", "getSpecialTitle", "getColorSpecialTitle", "getColorSpecialBg", "getActionInfo", "()Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2ActionInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2ActionInfo;)Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BaseInfo;", "equals", "other", "hashCode", "toString", "notify-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FocusNotificationParamV2BaseInfo {

    @Nullable
    private final FocusNotificationParamV2ActionInfo actionInfo;

    @Nullable
    private final String buttonTitle;

    @Nullable
    private final String colorButtonBg;

    @Nullable
    private final String colorButtonTitle;

    @Nullable
    private final String colorContent;

    @Nullable
    private final String colorContentBg;

    @Nullable
    private final String colorContentDark;

    @Nullable
    private final String colorSpecialBg;

    @Nullable
    private final String colorSpecialTitle;

    @Nullable
    private final String colorSubContent;

    @Nullable
    private final String colorSubContentDark;

    @Nullable
    private final String colorSubTitle;

    @Nullable
    private final String colorSubTitleDark;

    @Nullable
    private final String colorTitle;

    @Nullable
    private final String colorTitleDark;

    @Nullable
    private final String content;

    @Nullable
    private final Boolean showContentDivider;

    @Nullable
    private final Boolean showDivider;

    @Nullable
    private final String specialTitle;

    @Nullable
    private final String subContent;

    @Nullable
    private final String subTitle;

    @Nullable
    private final String title;

    @Nullable
    private final Integer type;

    public FocusNotificationParamV2BaseInfo(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable FocusNotificationParamV2ActionInfo focusNotificationParamV2ActionInfo) {
        this.type = num;
        this.title = str;
        this.colorTitle = str2;
        this.colorTitleDark = str3;
        this.subTitle = str4;
        this.colorSubTitle = str5;
        this.colorSubTitleDark = str6;
        this.content = str7;
        this.colorContent = str8;
        this.colorContentDark = str9;
        this.colorContentBg = str10;
        this.subContent = str11;
        this.colorSubContent = str12;
        this.colorSubContentDark = str13;
        this.buttonTitle = str14;
        this.colorButtonTitle = str15;
        this.colorButtonBg = str16;
        this.showDivider = bool;
        this.showContentDivider = bool2;
        this.specialTitle = str17;
        this.colorSpecialTitle = str18;
        this.colorSpecialBg = str19;
        this.actionInfo = focusNotificationParamV2ActionInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getColorContentDark() {
        return this.colorContentDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getColorContentBg() {
        return this.colorContentBg;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSubContent() {
        return this.subContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getColorSubContent() {
        return this.colorSubContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getColorSubContentDark() {
        return this.colorSubContentDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getColorButtonTitle() {
        return this.colorButtonTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getColorButtonBg() {
        return this.colorButtonBg;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getShowDivider() {
        return this.showDivider;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getShowContentDivider() {
        return this.showContentDivider;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getSpecialTitle() {
        return this.specialTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getColorSpecialTitle() {
        return this.colorSpecialTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getColorSpecialBg() {
        return this.colorSpecialBg;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final FocusNotificationParamV2ActionInfo getActionInfo() {
        return this.actionInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getColorTitle() {
        return this.colorTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getColorTitleDark() {
        return this.colorTitleDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getColorSubTitle() {
        return this.colorSubTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getColorSubTitleDark() {
        return this.colorSubTitleDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getColorContent() {
        return this.colorContent;
    }

    @NotNull
    public final FocusNotificationParamV2BaseInfo copy(@Nullable Integer type, @Nullable String title, @Nullable String colorTitle, @Nullable String colorTitleDark, @Nullable String subTitle, @Nullable String colorSubTitle, @Nullable String colorSubTitleDark, @Nullable String content, @Nullable String colorContent, @Nullable String colorContentDark, @Nullable String colorContentBg, @Nullable String subContent, @Nullable String colorSubContent, @Nullable String colorSubContentDark, @Nullable String buttonTitle, @Nullable String colorButtonTitle, @Nullable String colorButtonBg, @Nullable Boolean showDivider, @Nullable Boolean showContentDivider, @Nullable String specialTitle, @Nullable String colorSpecialTitle, @Nullable String colorSpecialBg, @Nullable FocusNotificationParamV2ActionInfo actionInfo) {
        return new FocusNotificationParamV2BaseInfo(type, title, colorTitle, colorTitleDark, subTitle, colorSubTitle, colorSubTitleDark, content, colorContent, colorContentDark, colorContentBg, subContent, colorSubContent, colorSubContentDark, buttonTitle, colorButtonTitle, colorButtonBg, showDivider, showContentDivider, specialTitle, colorSpecialTitle, colorSpecialBg, actionInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FocusNotificationParamV2BaseInfo)) {
            return false;
        }
        FocusNotificationParamV2BaseInfo focusNotificationParamV2BaseInfo = (FocusNotificationParamV2BaseInfo) other;
        return Intrinsics.areEqual(this.type, focusNotificationParamV2BaseInfo.type) && Intrinsics.areEqual(this.title, focusNotificationParamV2BaseInfo.title) && Intrinsics.areEqual(this.colorTitle, focusNotificationParamV2BaseInfo.colorTitle) && Intrinsics.areEqual(this.colorTitleDark, focusNotificationParamV2BaseInfo.colorTitleDark) && Intrinsics.areEqual(this.subTitle, focusNotificationParamV2BaseInfo.subTitle) && Intrinsics.areEqual(this.colorSubTitle, focusNotificationParamV2BaseInfo.colorSubTitle) && Intrinsics.areEqual(this.colorSubTitleDark, focusNotificationParamV2BaseInfo.colorSubTitleDark) && Intrinsics.areEqual(this.content, focusNotificationParamV2BaseInfo.content) && Intrinsics.areEqual(this.colorContent, focusNotificationParamV2BaseInfo.colorContent) && Intrinsics.areEqual(this.colorContentDark, focusNotificationParamV2BaseInfo.colorContentDark) && Intrinsics.areEqual(this.colorContentBg, focusNotificationParamV2BaseInfo.colorContentBg) && Intrinsics.areEqual(this.subContent, focusNotificationParamV2BaseInfo.subContent) && Intrinsics.areEqual(this.colorSubContent, focusNotificationParamV2BaseInfo.colorSubContent) && Intrinsics.areEqual(this.colorSubContentDark, focusNotificationParamV2BaseInfo.colorSubContentDark) && Intrinsics.areEqual(this.buttonTitle, focusNotificationParamV2BaseInfo.buttonTitle) && Intrinsics.areEqual(this.colorButtonTitle, focusNotificationParamV2BaseInfo.colorButtonTitle) && Intrinsics.areEqual(this.colorButtonBg, focusNotificationParamV2BaseInfo.colorButtonBg) && Intrinsics.areEqual(this.showDivider, focusNotificationParamV2BaseInfo.showDivider) && Intrinsics.areEqual(this.showContentDivider, focusNotificationParamV2BaseInfo.showContentDivider) && Intrinsics.areEqual(this.specialTitle, focusNotificationParamV2BaseInfo.specialTitle) && Intrinsics.areEqual(this.colorSpecialTitle, focusNotificationParamV2BaseInfo.colorSpecialTitle) && Intrinsics.areEqual(this.colorSpecialBg, focusNotificationParamV2BaseInfo.colorSpecialBg) && Intrinsics.areEqual(this.actionInfo, focusNotificationParamV2BaseInfo.actionInfo);
    }

    @Nullable
    public final FocusNotificationParamV2ActionInfo getActionInfo() {
        return this.actionInfo;
    }

    @Nullable
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @Nullable
    public final String getColorButtonBg() {
        return this.colorButtonBg;
    }

    @Nullable
    public final String getColorButtonTitle() {
        return this.colorButtonTitle;
    }

    @Nullable
    public final String getColorContent() {
        return this.colorContent;
    }

    @Nullable
    public final String getColorContentBg() {
        return this.colorContentBg;
    }

    @Nullable
    public final String getColorContentDark() {
        return this.colorContentDark;
    }

    @Nullable
    public final String getColorSpecialBg() {
        return this.colorSpecialBg;
    }

    @Nullable
    public final String getColorSpecialTitle() {
        return this.colorSpecialTitle;
    }

    @Nullable
    public final String getColorSubContent() {
        return this.colorSubContent;
    }

    @Nullable
    public final String getColorSubContentDark() {
        return this.colorSubContentDark;
    }

    @Nullable
    public final String getColorSubTitle() {
        return this.colorSubTitle;
    }

    @Nullable
    public final String getColorSubTitleDark() {
        return this.colorSubTitleDark;
    }

    @Nullable
    public final String getColorTitle() {
        return this.colorTitle;
    }

    @Nullable
    public final String getColorTitleDark() {
        return this.colorTitleDark;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Boolean getShowContentDivider() {
        return this.showContentDivider;
    }

    @Nullable
    public final Boolean getShowDivider() {
        return this.showDivider;
    }

    @Nullable
    public final String getSpecialTitle() {
        return this.specialTitle;
    }

    @Nullable
    public final String getSubContent() {
        return this.subContent;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.colorTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.colorTitleDark;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subTitle;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.colorSubTitle;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.colorSubTitleDark;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.content;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.colorContent;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.colorContentDark;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.colorContentBg;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.subContent;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.colorSubContent;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.colorSubContentDark;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.buttonTitle;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.colorButtonTitle;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.colorButtonBg;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool = this.showDivider;
        int iHashCode18 = (iHashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showContentDivider;
        int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str17 = this.specialTitle;
        int iHashCode20 = (iHashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.colorSpecialTitle;
        int iHashCode21 = (iHashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.colorSpecialBg;
        int iHashCode22 = (iHashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
        FocusNotificationParamV2ActionInfo focusNotificationParamV2ActionInfo = this.actionInfo;
        return iHashCode22 + (focusNotificationParamV2ActionInfo != null ? focusNotificationParamV2ActionInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FocusNotificationParamV2BaseInfo(type=" + this.type + ", title=" + this.title + ", colorTitle=" + this.colorTitle + ", colorTitleDark=" + this.colorTitleDark + ", subTitle=" + this.subTitle + ", colorSubTitle=" + this.colorSubTitle + ", colorSubTitleDark=" + this.colorSubTitleDark + ", content=" + this.content + ", colorContent=" + this.colorContent + ", colorContentDark=" + this.colorContentDark + ", colorContentBg=" + this.colorContentBg + ", subContent=" + this.subContent + ", colorSubContent=" + this.colorSubContent + ", colorSubContentDark=" + this.colorSubContentDark + ", buttonTitle=" + this.buttonTitle + ", colorButtonTitle=" + this.colorButtonTitle + ", colorButtonBg=" + this.colorButtonBg + ", showDivider=" + this.showDivider + ", showContentDivider=" + this.showContentDivider + ", specialTitle=" + this.specialTitle + ", colorSpecialTitle=" + this.colorSpecialTitle + ", colorSpecialBg=" + this.colorSpecialBg + ", actionInfo=" + this.actionInfo + ")";
    }
}
