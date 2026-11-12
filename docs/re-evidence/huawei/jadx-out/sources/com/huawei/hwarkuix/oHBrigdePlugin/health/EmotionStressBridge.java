package com.huawei.hwarkuix.oHBrigdePlugin.health;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.pressure.PressureApi;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwarkuix.oHBrigdePlugin.health.utils.DeviceUtil;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.pluginalgorithms.EmotionStressAdviceApi;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.cph;
import defpackage.ecu;
import defpackage.edc;
import defpackage.eea;
import defpackage.eeb;
import defpackage.eed;
import defpackage.een;
import defpackage.gxt;
import defpackage.gxu;
import defpackage.gxy;
import defpackage.gxz;
import defpackage.gyd;
import defpackage.ioi;
import defpackage.qqf;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import ohos.ace.adapter.capability.bridge.BridgePlugin;

/* JADX INFO: loaded from: classes10.dex */
public class EmotionStressBridge extends OHProBridgePlugin {
    private static final String EMOTION_DEVICE_PKG_NAME = "hw.device.emotion";
    private static final String EMOTION_RISK_WARING_SWITCH = "emotionRiskTipSwitch";
    private static final String EMOTION_SRC_PKG_NAME = "hw.unitedevice.emotion";
    private static final String EMOTION_SWITCH = "emotionAutoMonitorSwitch";
    private static final String STRESS_SWITCH = "stressAutoMonitorSwitch";
    private static final int SUCCESS_RESPONSE = 0;
    private static final String SWITCH_OPEN = "true";
    private static final String SYNC_HEALTH_CLOUD_SWITCH = "cloudFeatureSwitch";
    private static final String TAG = "ArkUIX_EmotionStressBridge";
    private static final int WATER_MARKID = 1169;

    public EmotionStressBridge(Context context, String str, int i) {
        super(context, str, i);
    }

    public EmotionStressBridge(Context context, String str, int i, BridgePlugin.BridgeType bridgeType) {
        super(context, str, i, bridgeType);
    }

    public EmotionStressBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    public EmotionStressBridge(Context context, String str, BridgeManager bridgeManager, BridgePlugin.BridgeType bridgeType) {
        super(context, str, bridgeManager, bridgeType);
    }

    public void getAdvice(int i, String str) {
        LogUtil.a(TAG, "getAdvice enter：callbackId:", Integer.valueOf(i), " json:", str);
        String emotionStressAdvice = ((EmotionStressAdviceApi) Services.b("HealthAlgorithmModule", EmotionStressAdviceApi.class)).getEmotionStressAdvice(str);
        LogUtil.a(TAG, "advice is ", emotionStressAdvice);
        ohProOnSuccess(i, emotionStressAdvice);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void getSwitch(int i, String str) {
        LogUtil.a(TAG, "getSwitch enter, param: ", str);
        List list = (List) HiJsonUtil.d(str, new TypeToken<List<Map<String, String>>>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.EmotionStressBridge.1
        }.getType());
        if (CollectionUtils.a(list)) {
            ohProOnSuccess(i, "");
            return;
        }
        byte b2 = 0;
        String str2 = (String) ((Map) list.get(0)).get("switchItem");
        final ecu ecuVarD = ecu.d();
        str2.hashCode();
        switch (str2.hashCode()) {
            case -2017903452:
                if (!str2.equals(EMOTION_SWITCH)) {
                    b2 = -1;
                }
                break;
            case -888115963:
                if (!str2.equals(EMOTION_RISK_WARING_SWITCH)) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case -827602837:
                if (!str2.equals(STRESS_SWITCH)) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case -69640811:
                if (!str2.equals(SYNC_HEALTH_CLOUD_SWITCH)) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            Objects.requireNonNull(ecuVarD);
            executeSwitchQuery(new Consumer() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.EmotionStressBridge$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ecuVarD.getEmotionAutoMonitorSwitch((IBaseResponseCallback) obj);
                }
            }, i, EMOTION_SWITCH);
            return;
        }
        if (b2 == 1) {
            Objects.requireNonNull(ecuVarD);
            executeSwitchQuery(new Consumer() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.EmotionStressBridge$$ExternalSyntheticLambda2
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ecuVarD.getEmotionRiskWarningSwitch((IBaseResponseCallback) obj);
                }
            }, i, EMOTION_RISK_WARING_SWITCH);
        } else if (b2 == 2) {
            Objects.requireNonNull(ecuVarD);
            executeSwitchQuery(new Consumer() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.EmotionStressBridge$$ExternalSyntheticLambda1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ecuVarD.getStressAutoMonitorSwitch((IBaseResponseCallback) obj);
                }
            }, i, STRESS_SWITCH);
        } else if (b2 == 3) {
            getCloudFeatureSwitch(i);
        } else {
            LogUtil.a(TAG, "getSwitch enter param error!");
            ohProOnSuccess(i, "");
        }
    }

    private void executeSwitchQuery(Consumer<IBaseResponseCallback> consumer, final int i, final String str) {
        consumer.accept(new IBaseResponseCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.EmotionStressBridge.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                LogUtil.a(EmotionStressBridge.TAG, str + " errorCode: ", Integer.valueOf(i2), " ,res: ", arrayList);
                EmotionStressBridge.this.ohProOnSuccess((long) i, arrayList);
            }
        });
    }

    private void getCloudFeatureSwitch(int i) {
        String strC = ioi.d().c(7);
        int i2 = (strC == null || strC.isEmpty() || !"true".equals(strC)) ? 0 : 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i2));
        LogUtil.a(TAG, "getCloudFeatureSwitch res: ", arrayList);
        ohProOnSuccess(i, arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    public void openSwitch(int i, String str) {
        byte b2;
        LogUtil.a(TAG, "openSwitch enter, params: ", str);
        for (Map map : (List) HiJsonUtil.d(str, new TypeToken<List<Map<String, String>>>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.EmotionStressBridge.3
        }.getType())) {
            if (map.containsKey("switchItem")) {
                String str2 = (String) map.get("switchItem");
                str2.hashCode();
                switch (str2) {
                    case "emotionAutoMonitorSwitch":
                        b2 = 0;
                        break;
                    case "emotionRiskTipSwitch":
                        b2 = 1;
                        break;
                    case "stressAutoMonitorSwitch":
                        b2 = 2;
                        break;
                    case "cloudFeatureSwitch":
                        b2 = 3;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    ecu.d().setEmotionAutoMonitorSwitch("1");
                } else if (b2 == 1) {
                    ecu.d().setEmotionRiskWarningSwitch("1");
                } else if (b2 != 2) {
                    if (b2 != 3) {
                        ohProOnSuccess(i, "");
                    } else {
                        ioi.d().e(7, true, String.valueOf(7), new IBaseResponseCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.EmotionStressBridge.4
                            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                            /* JADX INFO: renamed from: onResponse */
                            public void a(int i2, Object obj) {
                                if (i2 != 0) {
                                    LogUtil.a(EmotionStressBridge.TAG, "open couldFeatureSwitch failure,", Integer.valueOf(i2));
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    public void getSupportPressureDevice(final int i) {
        LogUtil.a(TAG, "getSupportPressureDevice enter", Integer.valueOf(i));
        ((PressureApi) Services.b("Main", PressureApi.class)).getSupportPressureDevice(new IBaseResponseCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.EmotionStressBridge$$ExternalSyntheticLambda3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.f$0.m1405x396c99b8(i, i2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getSupportPressureDevice$0$com-huawei-hwarkuix-oHBrigdePlugin-health-EmotionStressBridge, reason: not valid java name */
    /* synthetic */ void m1405x396c99b8(int i, int i2, Object obj) {
        ohProOnSuccess(i, obj);
    }

    public void share(final int i, final HashMap<String, Object> map, final ByteBuffer byteBuffer) {
        if (PermissionUtil.a()) {
            shareImage(i, map, byteBuffer);
        } else {
            PermissionUtil.d(BaseApplication.j(), PermissionUtil.PermissionType.STORAGE, new CustomPermissionAction(BaseApplication.j()) { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.EmotionStressBridge.5
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    EmotionStressBridge.this.shareImage(i, map, byteBuffer);
                }
            });
        }
    }

    public void shareImage(int i, HashMap<String, Object> map, ByteBuffer byteBuffer) {
        LogUtil.a(TAG, "share enter", map.toString(), "callbackID:", Integer.valueOf(i));
        int iIntValue = ((Integer) map.get("height")).intValue();
        int iIntValue2 = ((Integer) map.get("width")).intValue();
        String str = (String) map.get("date");
        String str2 = (String) map.get("stressTime");
        String str3 = (String) map.get("unpleasantTime");
        String str4 = (String) map.get("pleasantTime");
        String str5 = (String) map.get("legendTexts");
        String str6 = (String) map.get("legendColors");
        String str7 = (String) map.get("productId");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue2, iIntValue, Bitmap.Config.ARGB_8888);
        byteBuffer.rewind();
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
        int i2 = 0;
        try {
            LogUtil.a(TAG, "productId: ", str7);
            i2 = Integer.parseInt(str7.trim());
        } catch (Exception e) {
            ReleaseLogUtil.a(TAG, "readDietRecord onResult exception ", ExceptionUtils.c(e));
        }
        gxt gxtVar = new gxt(12);
        gyd gydVar = new gyd();
        HashMap map2 = new HashMap(16);
        map2.put("sport_type", String.valueOf(10002));
        map2.put("emotion_date", str);
        map2.put("emotion_title", String.format(BaseApplication.b().getResources().getString(R.string.IDS_emotion_share_title), str));
        map2.put("emotion_stresstime_title", String.format(BaseApplication.b().getResources().getString(R.string.IDS_emotion_stresstime_title), str));
        map2.put("emotion_stresstime_value", str2);
        map2.put("emotion_unpleasanttime_title", String.format(BaseApplication.b().getResources().getString(R.string.IDS_emotion_unpleasanttime_title), str));
        map2.put("emotion_unpleasanttime_value", str3);
        map2.put("emotion_pleasanttime_title", String.format(BaseApplication.b().getResources().getString(R.string.IDS_emotion_pleasanttime_title), str));
        map2.put("emotion_pleasanttime_value", str4);
        map2.put("emotion_legend_texts", str5);
        map2.put("emotion_legend_colors", str6);
        map2.put("device_name", een.e(i2, BaseApplication.b(), BaseApplication.b().getPackageName(), ""));
        gydVar.e(map2);
        gydVar.e(qqf.d(bitmapCreateBitmap, gxu.f36208c));
        gxy gxyVar = new gxy();
        gxyVar.c(10002);
        gxyVar.c(gydVar);
        gxtVar.d(gxyVar);
        ArrayList arrayList = new ArrayList(1);
        gxz gxzVar = new gxz();
        gxzVar.a(WATER_MARKID);
        gxzVar.b(R.drawable.emotion_template);
        arrayList.add(gxzVar);
        gxyVar.d(arrayList);
        gxtVar.d(gxyVar);
        gxtVar.d(AnalyticsValue.HEALTH_PRESSUER_CARD_CLICK_2160001.value());
        gxtVar.d(16);
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVar, BaseApplication.b());
    }

    public void syncDeviceEmotion(int i, String str) {
        LogUtil.a(TAG, "syncDeviceEmotion enter, param: ", str);
        Map map = (Map) HiJsonUtil.d(str, new TypeToken<Map<String, String>>() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.EmotionStressBridge.6
        }.getType());
        if (CollectionUtils.c((Map<?, ?>) map)) {
            ohProOnSuccess(i, "");
            return;
        }
        String str2 = (String) map.get("startTime");
        String str3 = (String) map.get("endTime");
        String str4 = (String) map.get("modifiedTime");
        String str5 = (String) map.get("emotionStatus");
        if (DeviceUtil.isSupportEmotionAutoMonitor()) {
            try {
                eed eedVar = new eed();
                ArrayList arrayList = new ArrayList();
                eedVar.e(DicDataTypeUtil.DataType.EMOTION_STATUS.value());
                eedVar.a(cph.g(Integer.parseInt(str5)));
                arrayList.add(eedVar);
                eeb eebVar = new eeb();
                ArrayList arrayList2 = new ArrayList();
                eebVar.e(arrayList);
                eebVar.c(Long.parseLong(str2));
                eebVar.d(Long.parseLong(str3));
                eebVar.a(Long.parseLong(str4));
                arrayList2.add(eebVar);
                eea eeaVar = new eea();
                eeaVar.setSrcPkgName(EMOTION_SRC_PKG_NAME);
                eeaVar.setWearPkgName(EMOTION_DEVICE_PKG_NAME);
                eeaVar.c(DicDataTypeUtil.DataType.EMOTION_SET.value());
                eeaVar.a(1);
                eeaVar.a(arrayList2);
                DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
                LogUtil.a(TAG, "dictionaryPointInfo: ", eeaVar.toString());
                ReleaseLogUtil.d(TAG, "sendDictionaryPointInfoCommand isValid: ", Boolean.valueOf(edc.e().sendDictionaryPointInfoCommand(deviceInfo, eeaVar, TAG)));
            } catch (NullPointerException | NumberFormatException e) {
                ReleaseLogUtil.a(TAG, "Exception occurred: ", e.getMessage());
            }
        }
        ohProOnSuccess(i, "");
    }
}
