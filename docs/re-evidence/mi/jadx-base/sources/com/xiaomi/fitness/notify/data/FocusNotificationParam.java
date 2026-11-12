package com.xiaomi.fitness.notify.data;

import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bF\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010V\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010W\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010X\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010=J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010=J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010 HÆ\u0003JÆ\u0002\u0010`\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0002\u0010aJ\u0013\u0010b\u001a\u00020\u00192\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010d\u001a\u00020\u0003HÖ\u0001J\t\u0010e\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010%\u001a\u0004\b1\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010%\u001a\u0004\b6\u0010$R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u00109\u001a\u0004\b:\u00108R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u00109\u001a\u0004\b;\u00108R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010>\u001a\u0004\b?\u0010=R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010'R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u00109\u001a\u0004\bA\u00108R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010'R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010'R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bD\u0010E¨\u0006f"}, d2 = {"Lcom/xiaomi/fitness/notify/data/FocusNotificationParam;", "", "protocol", "", "scene", "", "title", MiuiCursorConstants.CONTENT, "desc1", "desc2", "ticker", "colorTitle", "colorTitleDark", BroadcastsKt.SILENT_PUSHING_PROGRESS, "progressCount", "colorContent", "colorContentDark", "colorDesc", "colorDescDark", "timerType", "timerWhen", "", "timerTotal", "timeout", "enableFloat", "", "updatable", "orderId", "sequence", CardUIInfo.KEY_SUBTITILE, "subContent", "param_v2", "Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2;)V", "getProtocol", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScene", "()Ljava/lang/String;", "getTitle", "getContent", "getDesc1", "getDesc2", "getTicker", "getColorTitle", "getColorTitleDark", "getProgress", "()Ljava/lang/Object;", "getProgressCount", "getColorContent", "getColorContentDark", "getColorDesc", "getColorDescDark", "getTimerType", "getTimerWhen", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTimerTotal", "getTimeout", "getEnableFloat", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUpdatable", "getOrderId", "getSequence", "getSubTitle", "getSubContent", "getParam_v2", "()Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2;)Lcom/xiaomi/fitness/notify/data/FocusNotificationParam;", "equals", "other", "hashCode", "toString", "notify-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FocusNotificationParam {

    @Nullable
    private final String colorContent;

    @Nullable
    private final String colorContentDark;

    @Nullable
    private final String colorDesc;

    @Nullable
    private final String colorDescDark;

    @Nullable
    private final String colorTitle;

    @Nullable
    private final String colorTitleDark;

    @Nullable
    private final String content;

    @Nullable
    private final String desc1;

    @Nullable
    private final String desc2;

    @Nullable
    private final Boolean enableFloat;

    @Nullable
    private final String orderId;

    @Nullable
    private final FocusNotificationParamV2 param_v2;

    @Nullable
    private final Object progress;

    @Nullable
    private final Integer progressCount;

    @Nullable
    private final Integer protocol;

    @Nullable
    private final String scene;

    @Nullable
    private final Long sequence;

    @Nullable
    private final String subContent;

    @Nullable
    private final String subTitle;

    @Nullable
    private final String ticker;

    @Nullable
    private final Long timeout;

    @Nullable
    private final Long timerTotal;

    @Nullable
    private final Integer timerType;

    @Nullable
    private final Long timerWhen;

    @Nullable
    private final String title;

    @Nullable
    private final Boolean updatable;

    public FocusNotificationParam(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Object obj, @Nullable Integer num2, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Integer num3, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str13, @Nullable Long l4, @Nullable String str14, @Nullable String str15, @Nullable FocusNotificationParamV2 focusNotificationParamV2) {
        this.protocol = num;
        this.scene = str;
        this.title = str2;
        this.content = str3;
        this.desc1 = str4;
        this.desc2 = str5;
        this.ticker = str6;
        this.colorTitle = str7;
        this.colorTitleDark = str8;
        this.progress = obj;
        this.progressCount = num2;
        this.colorContent = str9;
        this.colorContentDark = str10;
        this.colorDesc = str11;
        this.colorDescDark = str12;
        this.timerType = num3;
        this.timerWhen = l;
        this.timerTotal = l2;
        this.timeout = l3;
        this.enableFloat = bool;
        this.updatable = bool2;
        this.orderId = str13;
        this.sequence = l4;
        this.subTitle = str14;
        this.subContent = str15;
        this.param_v2 = focusNotificationParamV2;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getProtocol() {
        return this.protocol;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getProgress() {
        return this.progress;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getProgressCount() {
        return this.progressCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getColorContent() {
        return this.colorContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getColorContentDark() {
        return this.colorContentDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getColorDesc() {
        return this.colorDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getColorDescDark() {
        return this.colorDescDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getTimerType() {
        return this.timerType;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Long getTimerWhen() {
        return this.timerWhen;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Long getTimerTotal() {
        return this.timerTotal;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Long getTimeout() {
        return this.timeout;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getEnableFloat() {
        return this.enableFloat;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getUpdatable() {
        return this.updatable;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Long getSequence() {
        return this.sequence;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getSubContent() {
        return this.subContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final FocusNotificationParamV2 getParam_v2() {
        return this.param_v2;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDesc1() {
        return this.desc1;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDesc2() {
        return this.desc2;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTicker() {
        return this.ticker;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getColorTitle() {
        return this.colorTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getColorTitleDark() {
        return this.colorTitleDark;
    }

    @NotNull
    public final FocusNotificationParam copy(@Nullable Integer protocol, @Nullable String scene, @Nullable String title, @Nullable String content, @Nullable String desc1, @Nullable String desc2, @Nullable String ticker, @Nullable String colorTitle, @Nullable String colorTitleDark, @Nullable Object progress, @Nullable Integer progressCount, @Nullable String colorContent, @Nullable String colorContentDark, @Nullable String colorDesc, @Nullable String colorDescDark, @Nullable Integer timerType, @Nullable Long timerWhen, @Nullable Long timerTotal, @Nullable Long timeout, @Nullable Boolean enableFloat, @Nullable Boolean updatable, @Nullable String orderId, @Nullable Long sequence, @Nullable String subTitle, @Nullable String subContent, @Nullable FocusNotificationParamV2 param_v2) {
        return new FocusNotificationParam(protocol, scene, title, content, desc1, desc2, ticker, colorTitle, colorTitleDark, progress, progressCount, colorContent, colorContentDark, colorDesc, colorDescDark, timerType, timerWhen, timerTotal, timeout, enableFloat, updatable, orderId, sequence, subTitle, subContent, param_v2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FocusNotificationParam)) {
            return false;
        }
        FocusNotificationParam focusNotificationParam = (FocusNotificationParam) other;
        return Intrinsics.areEqual(this.protocol, focusNotificationParam.protocol) && Intrinsics.areEqual(this.scene, focusNotificationParam.scene) && Intrinsics.areEqual(this.title, focusNotificationParam.title) && Intrinsics.areEqual(this.content, focusNotificationParam.content) && Intrinsics.areEqual(this.desc1, focusNotificationParam.desc1) && Intrinsics.areEqual(this.desc2, focusNotificationParam.desc2) && Intrinsics.areEqual(this.ticker, focusNotificationParam.ticker) && Intrinsics.areEqual(this.colorTitle, focusNotificationParam.colorTitle) && Intrinsics.areEqual(this.colorTitleDark, focusNotificationParam.colorTitleDark) && Intrinsics.areEqual(this.progress, focusNotificationParam.progress) && Intrinsics.areEqual(this.progressCount, focusNotificationParam.progressCount) && Intrinsics.areEqual(this.colorContent, focusNotificationParam.colorContent) && Intrinsics.areEqual(this.colorContentDark, focusNotificationParam.colorContentDark) && Intrinsics.areEqual(this.colorDesc, focusNotificationParam.colorDesc) && Intrinsics.areEqual(this.colorDescDark, focusNotificationParam.colorDescDark) && Intrinsics.areEqual(this.timerType, focusNotificationParam.timerType) && Intrinsics.areEqual(this.timerWhen, focusNotificationParam.timerWhen) && Intrinsics.areEqual(this.timerTotal, focusNotificationParam.timerTotal) && Intrinsics.areEqual(this.timeout, focusNotificationParam.timeout) && Intrinsics.areEqual(this.enableFloat, focusNotificationParam.enableFloat) && Intrinsics.areEqual(this.updatable, focusNotificationParam.updatable) && Intrinsics.areEqual(this.orderId, focusNotificationParam.orderId) && Intrinsics.areEqual(this.sequence, focusNotificationParam.sequence) && Intrinsics.areEqual(this.subTitle, focusNotificationParam.subTitle) && Intrinsics.areEqual(this.subContent, focusNotificationParam.subContent) && Intrinsics.areEqual(this.param_v2, focusNotificationParam.param_v2);
    }

    @Nullable
    public final String getColorContent() {
        return this.colorContent;
    }

    @Nullable
    public final String getColorContentDark() {
        return this.colorContentDark;
    }

    @Nullable
    public final String getColorDesc() {
        return this.colorDesc;
    }

    @Nullable
    public final String getColorDescDark() {
        return this.colorDescDark;
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
    public final String getDesc1() {
        return this.desc1;
    }

    @Nullable
    public final String getDesc2() {
        return this.desc2;
    }

    @Nullable
    public final Boolean getEnableFloat() {
        return this.enableFloat;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final FocusNotificationParamV2 getParam_v2() {
        return this.param_v2;
    }

    @Nullable
    public final Object getProgress() {
        return this.progress;
    }

    @Nullable
    public final Integer getProgressCount() {
        return this.progressCount;
    }

    @Nullable
    public final Integer getProtocol() {
        return this.protocol;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    public final Long getSequence() {
        return this.sequence;
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
    public final String getTicker() {
        return this.ticker;
    }

    @Nullable
    public final Long getTimeout() {
        return this.timeout;
    }

    @Nullable
    public final Long getTimerTotal() {
        return this.timerTotal;
    }

    @Nullable
    public final Integer getTimerType() {
        return this.timerType;
    }

    @Nullable
    public final Long getTimerWhen() {
        return this.timerWhen;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Boolean getUpdatable() {
        return this.updatable;
    }

    public int hashCode() {
        Integer num = this.protocol;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.scene;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.desc1;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.desc2;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ticker;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.colorTitle;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.colorTitleDark;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Object obj = this.progress;
        int iHashCode10 = (iHashCode9 + (obj == null ? 0 : obj.hashCode())) * 31;
        Integer num2 = this.progressCount;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str9 = this.colorContent;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.colorContentDark;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.colorDesc;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.colorDescDark;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num3 = this.timerType;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.timerWhen;
        int iHashCode17 = (iHashCode16 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.timerTotal;
        int iHashCode18 = (iHashCode17 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.timeout;
        int iHashCode19 = (iHashCode18 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.enableFloat;
        int iHashCode20 = (iHashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.updatable;
        int iHashCode21 = (iHashCode20 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str13 = this.orderId;
        int iHashCode22 = (iHashCode21 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l4 = this.sequence;
        int iHashCode23 = (iHashCode22 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str14 = this.subTitle;
        int iHashCode24 = (iHashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.subContent;
        int iHashCode25 = (iHashCode24 + (str15 == null ? 0 : str15.hashCode())) * 31;
        FocusNotificationParamV2 focusNotificationParamV2 = this.param_v2;
        return iHashCode25 + (focusNotificationParamV2 != null ? focusNotificationParamV2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FocusNotificationParam(protocol=" + this.protocol + ", scene=" + this.scene + ", title=" + this.title + ", content=" + this.content + ", desc1=" + this.desc1 + ", desc2=" + this.desc2 + ", ticker=" + this.ticker + ", colorTitle=" + this.colorTitle + ", colorTitleDark=" + this.colorTitleDark + ", progress=" + this.progress + ", progressCount=" + this.progressCount + ", colorContent=" + this.colorContent + ", colorContentDark=" + this.colorContentDark + ", colorDesc=" + this.colorDesc + ", colorDescDark=" + this.colorDescDark + ", timerType=" + this.timerType + ", timerWhen=" + this.timerWhen + ", timerTotal=" + this.timerTotal + ", timeout=" + this.timeout + ", enableFloat=" + this.enableFloat + ", updatable=" + this.updatable + ", orderId=" + this.orderId + ", sequence=" + this.sequence + ", subTitle=" + this.subTitle + ", subContent=" + this.subContent + ", param_v2=" + this.param_v2 + ")";
    }
}
