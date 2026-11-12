package com.xiaomi.fitness.notify.focus;

import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import com.mi.health.sleep.SleepDataHelperKt;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.notify.data.FocusNotificationParam;
import com.xiaomi.fitness.notify.data.FocusNotificationParamV2;
import com.xiaomi.fitness.notify.data.FocusNotificationParamV2BaseInfo;
import com.xiaomi.fitness.notify.data.FocusNotificationParamV2ProgressInfo;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.rxg;
import defpackage.sxg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 B2\u00020\u0001:\u0001BB\t\b\u0007¢\u0006\u0004\bA\u00103J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010+\u001a\u00020#2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u00100\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020#H\u0016¢\u0006\u0004\b2\u00103J'\u00104\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b4\u00105R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R&\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010:R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010:R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/notify/focus/NotificationFocusManager;", "Lcom/xiaomi/fitness/notify/focus/NotificationFocusInterface;", "", "packageName", "Lcom/xiaomi/fitness/notify/data/FocusNotificationParam;", "focusNotificationParam", "Lrxg$b;", "parseFocusV2Notification", "(Ljava/lang/String;Lcom/xiaomi/fitness/notify/data/FocusNotificationParam;)Lrxg$b;", "Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BaseInfo;", "Lrxg$c;", "createNotifyDataInfo", "(Lcom/xiaomi/fitness/notify/data/FocusNotificationParamV2BaseInfo;)Lrxg$c;", "Lrxg$a;", "parseFocusNotificationV1", "(Ljava/lang/String;Lcom/xiaomi/fitness/notify/data/FocusNotificationParam;)Lrxg$a;", "Lcom/xiaomi/fitness/notify/focus/FocusTemplate;", "parseStyle", "(Lcom/xiaomi/fitness/notify/data/FocusNotificationParam;)Lcom/xiaomi/fitness/notify/focus/FocusTemplate;", "Lcom/xiaomi/fitness/notify/focus/FocusTemplateV2;", "parseV2Style", "(Ljava/lang/String;)Lcom/xiaomi/fitness/notify/focus/FocusTemplateV2;", "spiritColor", "", "parseColor", "(Ljava/lang/String;)[B", "scene", "", "supportScene", "(Ljava/lang/String;)Z", "", "supportFocusRomVersion", "()I", "Landroid/content/Context;", "context", "", "registerMiuiNotificationContentObserver", "(Landroid/content/Context;)V", "hasFocusPermission", "(Ljava/lang/String;Landroid/content/Context;)Z", "", "Lcom/xiaomi/fitness/notify/focus/RemoveNotification;", "notifyIdList", "handleFocusNotificationRemove", "(Ljava/util/List;)V", "Lrxg;", "notifyData", "updatable", "handleFocusNotificationPostDisable", "(Lrxg;Z)Z", "handleFocusNotificationRemoveIfListenDisConnect", "()V", "handleFocusNotification", "(Ljava/lang/String;Lcom/xiaomi/fitness/notify/data/FocusNotificationParam;Lrxg;)V", "supportFocusAppPackages", "Ljava/util/List;", "", "markToRemoveFocusNotifications", "Ljava/util/Map;", "blacklistFocusNotifications", "focusTemplateMaps", "focusTemplateV2Maps", "Landroid/database/ContentObserver;", "mCanShowFocusObserver", "Landroid/database/ContentObserver;", "<init>", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nNotificationFocusManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationFocusManager.kt\ncom/xiaomi/fitness/notify/focus/NotificationFocusManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,584:1\n1863#2,2:585\n1863#2,2:587\n1246#2,4:591\n477#3:589\n423#3:590\n125#4:595\n133#4:596\n141#4:597\n*S KotlinDebug\n*F\n+ 1 NotificationFocusManager.kt\ncom/xiaomi/fitness/notify/focus/NotificationFocusManager\n*L\n389#1:585,2\n432#1:587,2\n448#1:591,4\n448#1:589\n448#1:590\n505#1:595\n506#1:596\n507#1:597\n*E\n"})
public final class NotificationFocusManager implements NotificationFocusInterface {

    @NotNull
    public static final String NOTIFICATION_FOCUS_EXTRA = "miui.focus.param";

    @NotNull
    public static final String TAG = "FOCUS_NOTIFICATION";

    @NotNull
    private final Map<String, FocusTemplate> focusTemplateMaps;

    @NotNull
    private final Map<String, FocusTemplateV2> focusTemplateV2Maps;

    @NotNull
    private final ContentObserver mCanShowFocusObserver;

    @NotNull
    private final List<String> supportFocusAppPackages = new ArrayList();

    @NotNull
    private final Map<String, List<RemoveNotification>> markToRemoveFocusNotifications = new LinkedHashMap();

    @NotNull
    private final List<String> blacklistFocusNotifications = CollectionsKt__CollectionsKt.mutableListOf("com.android.soundrecorder", SleepDataHelperKt.DEAK_CLOCK_PKG, Constants.SETTINGS_PACKAGE, "com.android.incallui", "com.android.server.telecom", Constants.PACKAGE_NAME_SECURITYCENTER);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FocusTemplateV2.values().length];
            try {
                iArr[FocusTemplateV2.TEMPLATE_TICKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusTemplateV2.TEMPLATE_DIDI_PSNGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusTemplateV2.TEMPLATE_EXPRESS_DELIVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusTemplate.values().length];
            try {
                iArr2[FocusTemplate.TEMPLATE_BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusTemplate.TEMPLATE_BASE_REVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusTemplate.TEMPLATE_BASE_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusTemplate.TEMPLATE_BASE_REVERT_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public NotificationFocusManager() {
        String scene = FocusScene.SMART_HOME_ALERT.getScene();
        FocusTemplate focusTemplate = FocusTemplate.TEMPLATE_BASE;
        Pair pair = TuplesKt.to(scene, focusTemplate);
        Pair pair2 = TuplesKt.to(FocusScene.SOS.getScene(), focusTemplate);
        Pair pair3 = TuplesKt.to(FocusScene.EVENT.getScene(), focusTemplate);
        String scene2 = FocusScene.CAR_HAILING.getScene();
        FocusTemplate focusTemplate2 = FocusTemplate.TEMPLATE_BASE_PROGRESS;
        Pair pair4 = TuplesKt.to(scene2, focusTemplate2);
        String scene3 = FocusScene.VERIFY_CODE.getScene();
        FocusTemplate focusTemplate3 = FocusTemplate.TEMPLATE_BASE_REVERT;
        Pair pair5 = TuplesKt.to(scene3, focusTemplate3);
        Pair pair6 = TuplesKt.to(FocusScene.RECORDER.getScene(), focusTemplate3);
        Pair pair7 = TuplesKt.to(FocusScene.ALARM.getScene(), focusTemplate3);
        Pair pair8 = TuplesKt.to(FocusScene.TIMER.getScene(), focusTemplate3);
        String scene4 = FocusScene.FOOD_DELIVERY.getScene();
        FocusTemplate focusTemplate4 = FocusTemplate.TEMPLATE_BASE_REVERT_PROGRESS;
        this.focusTemplateMaps = MapsKt__MapsKt.mutableMapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, TuplesKt.to(scene4, focusTemplate4), TuplesKt.to(FocusScene.MISSED_CALLS.getScene(), focusTemplate4), TuplesKt.to(FocusScene.TEMPLATE_BASE.getScene(), focusTemplate), TuplesKt.to(FocusScene.TEMPLATE_BASE_REVERT.getScene(), focusTemplate3), TuplesKt.to(FocusScene.TEMPLATE_BASE_PROGRESS.getScene(), focusTemplate2), TuplesKt.to(FocusScene.TEMPLATE_BASE_REVERT_PROGRESS.getScene(), focusTemplate4));
        this.focusTemplateV2Maps = MapsKt__MapsKt.mutableMapOf(TuplesKt.to(FocusSceneV2.TEMPLATE_TICKET.getPackageName(), FocusTemplateV2.TEMPLATE_TICKET), TuplesKt.to(FocusSceneV2.TEMPLATE_DIDI_PSNGER.getPackageName(), FocusTemplateV2.TEMPLATE_DIDI_PSNGER), TuplesKt.to(FocusSceneV2.TEMPLATE_EXPRESS_DELIVERY.getPackageName(), FocusTemplateV2.TEMPLATE_EXPRESS_DELIVERY));
        this.mCanShowFocusObserver = new ContentObserver() { // from class: com.xiaomi.fitness.notify.focus.NotificationFocusManager$mCanShowFocusObserver$1
            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange, Uri uri) {
                try {
                    Intrinsics.checkNotNull(uri);
                    String queryParameter = uri.getQueryParameter("package");
                    Logger.i(NotificationFocusManager.TAG, "onChange: canShowFocus=" + Boolean.parseBoolean(uri.getQueryParameter("canShowFocus")) + ", pkg=" + queryParameter);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }

    private final rxg.c createNotifyDataInfo(FocusNotificationParamV2BaseInfo focusNotificationParamV2BaseInfo) {
        rxg.c cVar = new rxg.c();
        String title = focusNotificationParamV2BaseInfo.getTitle();
        if (title != null && title.length() != 0) {
            rxg.f fVar = new rxg.f();
            fVar.c = focusNotificationParamV2BaseInfo.getTitle();
            String colorTitle = focusNotificationParamV2BaseInfo.getColorTitle();
            if (colorTitle != null && colorTitle.length() != 0) {
                fVar.d = parseColor(focusNotificationParamV2BaseInfo.getColorTitle());
            }
            cVar.c = fVar;
        }
        String subTitle = focusNotificationParamV2BaseInfo.getSubTitle();
        if (subTitle != null && subTitle.length() != 0) {
            rxg.f fVar2 = new rxg.f();
            fVar2.c = focusNotificationParamV2BaseInfo.getSubTitle();
            String colorSubTitle = focusNotificationParamV2BaseInfo.getColorSubTitle();
            if (colorSubTitle != null && colorSubTitle.length() != 0) {
                fVar2.d = parseColor(focusNotificationParamV2BaseInfo.getColorSubTitle());
            }
            cVar.d = fVar2;
        }
        String content = focusNotificationParamV2BaseInfo.getContent();
        if (content != null && content.length() != 0) {
            rxg.f fVar3 = new rxg.f();
            fVar3.c = focusNotificationParamV2BaseInfo.getContent();
            String colorContent = focusNotificationParamV2BaseInfo.getColorContent();
            if (colorContent != null && colorContent.length() != 0) {
                fVar3.d = parseColor(focusNotificationParamV2BaseInfo.getColorContent());
            }
            cVar.e = fVar3;
        }
        String subContent = focusNotificationParamV2BaseInfo.getSubContent();
        if (subContent != null && subContent.length() != 0) {
            rxg.f fVar4 = new rxg.f();
            fVar4.c = focusNotificationParamV2BaseInfo.getSubContent();
            String colorSubContent = focusNotificationParamV2BaseInfo.getColorSubContent();
            if (colorSubContent != null && colorSubContent.length() != 0) {
                fVar4.d = parseColor(focusNotificationParamV2BaseInfo.getColorSubContent());
            }
            cVar.f = fVar4;
        }
        String specialTitle = focusNotificationParamV2BaseInfo.getSpecialTitle();
        if (specialTitle != null && specialTitle.length() != 0) {
            rxg.f fVar5 = new rxg.f();
            fVar5.c = focusNotificationParamV2BaseInfo.getSpecialTitle();
            String colorSpecialTitle = focusNotificationParamV2BaseInfo.getColorSpecialTitle();
            if (colorSpecialTitle != null && colorSpecialTitle.length() != 0) {
                fVar5.d = parseColor(focusNotificationParamV2BaseInfo.getColorSpecialTitle());
            }
            cVar.g = fVar5;
        }
        return cVar;
    }

    private final byte[] parseColor(String spiritColor) {
        if (spiritColor == null || !StringsKt__StringsJVMKt.startsWith$default(spiritColor, PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, false, 2, null) || (spiritColor.length() != 9 && spiritColor.length() != 7)) {
            return null;
        }
        int color = Color.parseColor(spiritColor);
        return new byte[]{-1, (byte) ((color >> 16) & 255), (byte) ((color >> 8) & 255), (byte) (color & 255)};
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:78:0x019c  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fa  */
    private final rxg.a parseFocusNotificationV1(String packageName, FocusNotificationParam focusNotificationParam) {
        rxg.f fVar;
        byte[] color;
        rxg.f fVar2;
        String content;
        String desc1;
        byte[] color2;
        String scene = focusNotificationParam.getScene();
        if (scene != null && scene.length() != 0) {
            String scene2 = focusNotificationParam.getScene();
            Intrinsics.checkNotNull(scene2);
            if (supportScene(scene2)) {
                rxg.a aVar = new rxg.a();
                FocusTemplate style = parseStyle(focusNotificationParam);
                aVar.c = style.getTemplate();
                int i = WhenMappings.$EnumSwitchMapping$1[style.ordinal()];
                String content2 = "";
                if (i != 1) {
                    if (i == 2) {
                        fVar = new rxg.f();
                        fVar.c = focusNotificationParam.getTitle();
                        color = parseColor(focusNotificationParam.getColorTitle());
                        if (color != null) {
                            fVar.d = color;
                        }
                        aVar.d = fVar;
                        fVar2 = new rxg.f();
                        if (!Intrinsics.areEqual(focusNotificationParam.getScene(), FocusScene.SMART_HOME_ALERT.getScene()) || Intrinsics.areEqual(focusNotificationParam.getScene(), FocusScene.EVENT.getScene()) || Intrinsics.areEqual(focusNotificationParam.getScene(), FocusScene.VERIFY_CODE.getScene()) || Intrinsics.areEqual(focusNotificationParam.getScene(), FocusScene.TEMPLATE_BASE.getScene()) || Intrinsics.areEqual(focusNotificationParam.getScene(), FocusScene.TEMPLATE_BASE_REVERT.getScene())) {
                            content = focusNotificationParam.getContent();
                            if (content != null || content.length() == 0) {
                                desc1 = focusNotificationParam.getDesc1();
                                if (desc1 != null || desc1.length() == 0) {
                                    fVar2.c = "";
                                } else {
                                    String desc2 = focusNotificationParam.getDesc2();
                                    if (desc2 == null || desc2.length() == 0) {
                                        fVar2.c = focusNotificationParam.getDesc1();
                                    } else {
                                        fVar2.c = focusNotificationParam.getDesc1() + " | " + focusNotificationParam.getDesc2();
                                    }
                                }
                            } else {
                                fVar2.c = focusNotificationParam.getContent();
                            }
                        } else {
                            String content3 = focusNotificationParam.getContent();
                            if (content3 != null && content3.length() != 0) {
                                content2 = focusNotificationParam.getContent();
                            }
                            fVar2.c = content2;
                        }
                        color2 = parseColor(focusNotificationParam.getColorContent());
                        if (color2 != null) {
                            fVar2.d = color2;
                        }
                        aVar.e = fVar2;
                    } else {
                        if (i != 3 && i != 4) {
                            return null;
                        }
                        rxg.f fVar3 = new rxg.f();
                        fVar3.c = focusNotificationParam.getTitle();
                        byte[] color3 = parseColor(focusNotificationParam.getColorTitle());
                        if (color3 != null) {
                            fVar3.d = color3;
                        }
                        aVar.d = fVar3;
                        rxg.f fVar4 = new rxg.f();
                        String content4 = focusNotificationParam.getContent();
                        fVar4.c = (content4 == null || content4.length() == 0) ? "" : focusNotificationParam.getContent();
                        byte[] color4 = parseColor(focusNotificationParam.getColorContent());
                        if (color4 != null) {
                            fVar4.d = color4;
                        }
                        aVar.e = fVar4;
                        rxg.f fVar5 = new rxg.f();
                        String desc3 = focusNotificationParam.getDesc1();
                        if (desc3 != null && desc3.length() != 0) {
                            String desc4 = focusNotificationParam.getDesc2();
                            if (desc4 == null || desc4.length() == 0) {
                                content2 = focusNotificationParam.getDesc1();
                            } else {
                                content2 = focusNotificationParam.getDesc1() + " | " + focusNotificationParam.getDesc2();
                            }
                        }
                        fVar5.c = content2;
                        byte[] color5 = parseColor(focusNotificationParam.getColorDesc());
                        if (color5 != null) {
                            fVar5.d = color5;
                        }
                        aVar.f = fVar5;
                        rxg.e eVar = new rxg.e();
                        eVar.d = (String.valueOf(focusNotificationParam.getProgress()).length() <= 0 || ((int) Double.parseDouble(String.valueOf(focusNotificationParam.getProgress()))) == -1) ? 0 : (int) Double.parseDouble(String.valueOf(focusNotificationParam.getProgress()));
                        Integer progressCount = focusNotificationParam.getProgressCount();
                        eVar.c = progressCount != null ? progressCount.intValue() : 2;
                        aVar.g = eVar;
                    }
                } else {
                    fVar = new rxg.f();
                    fVar.c = focusNotificationParam.getTitle();
                    color = parseColor(focusNotificationParam.getColorTitle());
                    if (color != null) {
                        fVar.d = color;
                    }
                    aVar.d = fVar;
                    fVar2 = new rxg.f();
                    if (Intrinsics.areEqual(focusNotificationParam.getScene(), FocusScene.SMART_HOME_ALERT.getScene())) {
                        content = focusNotificationParam.getContent();
                        if (content != null) {
                            desc1 = focusNotificationParam.getDesc1();
                            if (desc1 != null) {
                                fVar2.c = "";
                            } else {
                                fVar2.c = "";
                            }
                        } else {
                            desc1 = focusNotificationParam.getDesc1();
                            if (desc1 != null) {
                                fVar2.c = "";
                            } else {
                                fVar2.c = "";
                            }
                        }
                    } else {
                        content = focusNotificationParam.getContent();
                        if (content != null) {
                            desc1 = focusNotificationParam.getDesc1();
                            if (desc1 != null) {
                                fVar2.c = "";
                            } else {
                                fVar2.c = "";
                            }
                        } else {
                            desc1 = focusNotificationParam.getDesc1();
                            if (desc1 != null) {
                                fVar2.c = "";
                            } else {
                                fVar2.c = "";
                            }
                        }
                    }
                    color2 = parseColor(focusNotificationParam.getColorContent());
                    if (color2 != null) {
                        fVar2.d = color2;
                    }
                    aVar.e = fVar2;
                }
                aVar.h = !Intrinsics.areEqual(focusNotificationParam.getEnableFloat(), Boolean.TRUE);
                if (focusNotificationParam.getSequence() != null) {
                    Long sequence = focusNotificationParam.getSequence();
                    Intrinsics.checkNotNull(sequence);
                    aVar.i = (int) sequence.longValue();
                }
                return aVar;
            }
        }
        return null;
    }

    private final rxg.b parseFocusV2Notification(String packageName, FocusNotificationParam focusNotificationParam) {
        rxg.b bVar = new rxg.b();
        FocusTemplateV2 v2Style = parseV2Style(packageName);
        bVar.c = v2Style.getTemplate();
        FocusNotificationParamV2 param_v2 = focusNotificationParam.getParam_v2();
        Intrinsics.checkNotNull(param_v2);
        Boolean enableFloat = param_v2.getEnableFloat();
        if (enableFloat == null) {
            enableFloat = focusNotificationParam.getEnableFloat();
        }
        bVar.h = !Intrinsics.areEqual(enableFloat, Boolean.TRUE);
        if (focusNotificationParam.getSequence() != null) {
            Long sequence = focusNotificationParam.getSequence();
            Intrinsics.checkNotNull(sequence);
            bVar.i = (int) sequence.longValue();
        }
        String ticker = param_v2.getTicker();
        if (ticker == null) {
            ticker = "";
        }
        bVar.d = ticker;
        FocusNotificationParamV2BaseInfo baseInfo = param_v2.getBaseInfo();
        FocusNotificationParamV2BaseInfo hintInfo = param_v2.getHintInfo();
        FocusNotificationParamV2ProgressInfo progressInfo = param_v2.getProgressInfo();
        if (baseInfo != null) {
            bVar.e = createNotifyDataInfo(baseInfo);
        }
        if (hintInfo != null) {
            bVar.f = createNotifyDataInfo(hintInfo);
        }
        if (WhenMappings.$EnumSwitchMapping$0[v2Style.ordinal()] == 2 && progressInfo != null) {
            rxg.e eVar = new rxg.e();
            eVar.d = (String.valueOf(progressInfo.getProgress()).length() <= 0 || ((int) Double.parseDouble(String.valueOf(progressInfo.getProgress()))) == -1) ? 0 : (int) Double.parseDouble(String.valueOf(progressInfo.getProgress()));
            Integer progressCount = focusNotificationParam.getProgressCount();
            eVar.c = progressCount != null ? progressCount.intValue() : 2;
            if (progressInfo.getColorProgress() != null) {
                eVar.e = parseColor(progressInfo.getColorProgress());
            }
            bVar.g = eVar;
        }
        return bVar;
    }

    private final FocusTemplate parseStyle(FocusNotificationParam focusNotificationParam) {
        FocusTemplate focusTemplate = this.focusTemplateMaps.get(focusNotificationParam.getScene());
        if (focusTemplate == null) {
            focusTemplate = FocusTemplate.TEMPLATE_BASE;
        }
        if (focusTemplate == FocusTemplate.TEMPLATE_BASE_PROGRESS && focusNotificationParam.getProgress() == null && focusNotificationParam.getProgressCount() == null) {
            return FocusTemplate.TEMPLATE_BASE;
        }
        return (focusTemplate == FocusTemplate.TEMPLATE_BASE_REVERT_PROGRESS && focusNotificationParam.getProgress() == null && focusNotificationParam.getProgressCount() == null) ? FocusTemplate.TEMPLATE_BASE_REVERT : focusTemplate;
    }

    private final FocusTemplateV2 parseV2Style(String packageName) {
        FocusTemplateV2 focusTemplateV2 = this.focusTemplateV2Maps.get(packageName);
        return focusTemplateV2 == null ? FocusTemplateV2.TEMPLATE_BASE : focusTemplateV2;
    }

    private final boolean supportScene(String scene) {
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        listCreateListBuilder.add(FocusScene.FOOD_DELIVERY.getScene());
        listCreateListBuilder.add(FocusScene.CAR_HAILING.getScene());
        listCreateListBuilder.add(FocusScene.SMART_HOME_ALERT.getScene());
        listCreateListBuilder.add(FocusScene.VERIFY_CODE.getScene());
        listCreateListBuilder.add(FocusScene.EVENT.getScene());
        listCreateListBuilder.add(FocusScene.TEMPLATE_BASE.getScene());
        listCreateListBuilder.add(FocusScene.TEMPLATE_BASE_REVERT.getScene());
        listCreateListBuilder.add(FocusScene.TEMPLATE_BASE_PROGRESS.getScene());
        listCreateListBuilder.add(FocusScene.TEMPLATE_BASE_REVERT_PROGRESS.getScene());
        return CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder).contains(scene);
    }

    @Override // com.xiaomi.fitness.notify.focus.NotificationFocusInterface
    public void handleFocusNotification(@NotNull String packageName, @NotNull FocusNotificationParam focusNotificationParam, @NotNull rxg notifyData) {
        String did;
        rxg.b focusV2Notification;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(focusNotificationParam, "focusNotificationParam");
        Intrinsics.checkNotNullParameter(notifyData, "notifyData");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        int deviceCapability = DeviceManagerExtKt.getInstance(companion).getDeviceCapability(did);
        int deviceCapabilityV2 = DeviceManagerExtKt.getInstance(companion).getDeviceCapabilityV2(did);
        int i = 16777216 & deviceCapability;
        Logger.i(TAG, "focus support v1 = " + (i != 0) + " capability: " + deviceCapability);
        int i2 = deviceCapabilityV2 & 64;
        Logger.i(TAG, "focus support v2 = " + (i2 != 0) + " capabilityV2: " + deviceCapabilityV2);
        if (i == 0 && i2 == 0) {
            return;
        }
        if (!this.supportFocusAppPackages.contains(packageName)) {
            this.supportFocusAppPackages.add(packageName);
        }
        if (focusNotificationParam.getParam_v2() != null && i2 != 0 && (focusV2Notification = parseFocusV2Notification(packageName, focusNotificationParam)) != null) {
            notifyData.f33037r = focusV2Notification;
        }
        notifyData.q = parseFocusNotificationV1(packageName, focusNotificationParam);
    }

    @Override // com.xiaomi.fitness.notify.focus.NotificationFocusInterface
    public boolean handleFocusNotificationPostDisable(@NotNull rxg notifyData, boolean updatable) {
        List<RemoveNotification> list;
        Intrinsics.checkNotNullParameter(notifyData, "notifyData");
        Logger.i(TAG, "handleFocusNotificationPostDisable = " + this.markToRemoveFocusNotifications);
        if (!(!this.markToRemoveFocusNotifications.isEmpty()) || !this.markToRemoveFocusNotifications.containsKey(notifyData.c) || (list = this.markToRemoveFocusNotifications.get(notifyData.c)) == null || !(!list.isEmpty())) {
            return false;
        }
        List<RemoveNotification> list2 = this.markToRemoveFocusNotifications.get(notifyData.c);
        Intrinsics.checkNotNull(list2);
        Logger.i(TAG, "handleFocusNotificationPostDisable list contain updatable = " + updatable);
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((RemoveNotification) it.next()).getNotifyData().c == notifyData.i && updatable) {
                rxg.a aVar = notifyData.q;
                Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.h) : null;
                rxg.b bVar = notifyData.f33037r;
                Logger.i(TAG, "handleFocusNotificationPostDisable true " + notifyData + " updatable v1 = " + boolValueOf + " v2 = " + (bVar != null ? Boolean.valueOf(bVar.h) : null));
                return true;
            }
        }
        this.markToRemoveFocusNotifications.put(notifyData.c, new ArrayList());
        return false;
    }

    @Override // com.xiaomi.fitness.notify.focus.NotificationFocusInterface
    public void handleFocusNotificationRemove(@NotNull List<RemoveNotification> notifyIdList) {
        Intrinsics.checkNotNullParameter(notifyIdList, "notifyIdList");
        if (!notifyIdList.isEmpty()) {
            for (RemoveNotification removeNotification : notifyIdList) {
                sxg notifyData = removeNotification.getNotifyData();
                if (removeNotification.getReason() == 8 && !this.blacklistFocusNotifications.contains(notifyData.d)) {
                    this.markToRemoveFocusNotifications.put(notifyData.d, new ArrayList());
                } else if (removeNotification.getReason() != 10 && removeNotification.getReason() != 5 && !this.blacklistFocusNotifications.contains(notifyData.d) && (!this.supportFocusAppPackages.isEmpty()) && this.supportFocusAppPackages.contains(notifyData.d)) {
                    List<RemoveNotification> arrayList = this.markToRemoveFocusNotifications.get(notifyData.d);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    if ((!arrayList.isEmpty()) && arrayList.size() >= 100) {
                        arrayList.remove(0);
                    }
                    if (!arrayList.contains(removeNotification)) {
                        arrayList.add(removeNotification);
                    }
                    this.markToRemoveFocusNotifications.put(notifyData.d, arrayList);
                }
            }
        }
        Logger.i(TAG, " handleFocusNotificationRemove" + this.markToRemoveFocusNotifications);
    }

    @Override // com.xiaomi.fitness.notify.focus.NotificationFocusInterface
    public void handleFocusNotificationRemoveIfListenDisConnect() {
        Logger.i(TAG, "handleFocusNotificationRemoveIfListenDisConnect");
        Map<String, List<RemoveNotification>> map = this.markToRemoveFocusNotifications;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((List) entry.getValue()).clear();
            linkedHashMap.put(Unit.INSTANCE, entry.getValue());
        }
    }

    @Override // com.xiaomi.fitness.notify.focus.NotificationFocusInterface
    public boolean hasFocusPermission(@NotNull String packageName, @NotNull Context context) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Uri uri = Uri.parse("content://miui.statusbar.notification.public");
            Bundle bundle = new Bundle();
            bundle.putString("package", packageName);
            Bundle bundleCall = context.getContentResolver().call(uri, "canShowFocus", (String) null, bundle);
            z2 = bundleCall != null ? bundleCall.getBoolean("canShowFocus", false) : false;
            try {
                Logger.i(TAG, "content://miui.statusbar.notification.public packageName = " + packageName + " hasFocusPermission  =" + z2);
            } catch (Exception e) {
                z = z2;
                e = e;
                Logger.d(TAG, "content://miui.statusbar.notification.public exception " + e.getMessage());
                z2 = z;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
        if (!z2) {
            try {
                Uri uri2 = Uri.parse("content://statusbar.notification/canShowFocus");
                Bundle bundle2 = new Bundle();
                bundle2.putString("package", packageName);
                Bundle bundleCall2 = context.getContentResolver().call(uri2, "canShowFocus", (String) null, bundle2);
                boolean z3 = bundleCall2 != null ? bundleCall2.getBoolean("canShowFocus", false) : false;
                try {
                    Logger.i(TAG, "content://statusbar.notification/canShowFocus packageName = " + packageName + " hasFocusPermission  =" + z3);
                    z2 = z3;
                } catch (Exception e3) {
                    e = e3;
                    z2 = z3;
                    Logger.d(TAG, "content://statusbar.notification/canShowFocus exception" + e.getMessage());
                }
            } catch (Exception e4) {
                e = e4;
            }
        }
        Logger.i(TAG, " packageName = " + packageName + " hasFocusPermission  =" + z2);
        return z2;
    }

    public final void registerMiuiNotificationContentObserver(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getContentResolver().registerContentObserver(Uri.parse("content://statusbar.notification/canShowFocus"), false, this.mCanShowFocusObserver);
    }

    @Override // com.xiaomi.fitness.notify.focus.NotificationFocusInterface
    public int supportFocusRomVersion() {
        return Settings.System.getInt(ApplicationExtKt.getApplication().getContentResolver(), "notification_focus_protocol", 0);
    }
}
