package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside;

import android.text.TextUtils;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.CustomConfig;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceIdReportInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.utils.ArrayUtils;
import defpackage.coq;
import defpackage.cpy;
import defpackage.cqj;
import defpackage.cql;
import defpackage.edc;
import defpackage.eec;
import defpackage.eee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class CustomConfigWatchFaceService implements DataReceiveCallback {
    private static final int COLOR_INDEX_0x6 = 6;
    private static final int CUSTOM_COLOR_VALUE_0x7 = 7;
    public static final String CUSTOM_CONFIG_APP_PACKAGE_NAME = "hw.app.watchface.custom";
    public static final String CUSTOM_CONFIG_DEVICE_PACKAGE_NAME = "hw.watch.watchface.custom";
    private static final int DIAL_EDIT_MODE_BACKGROUND_0x1 = 1;
    private static final int DIAL_EDIT_MODE_DUAL_0x2 = 2;
    private static final int DIAL_EDIT_MODE_HAND_0x7 = 7;
    private static final int DIAL_EDIT_MODE_SCALE_0x3 = 3;
    private static final int DIAL_EDIT_MODE_STYLE_0x0 = 0;
    private static final int DIAL_EDIT_MODE_SYMBOL_0x4 = 4;
    private static final int DIAL_EDIT_MODE_TIME_0x6 = 6;
    private static final int DIAL_EDIT_MODE_TYPEFACE_0x5 = 5;
    private static final int DIAL_NOT_FOUND = -1;
    private static final long EVENT_QUERY_CUSTOM_WATCHFACE = 800100008;
    private static final long EVENT_REPORT_CUSTOM_WATCHFACE = 800100009;
    private static final int MARKET_ID_0x1 = 1;
    private static final int STYLE_KEY_0x4 = 4;
    private static final int STYLE_LIST_0x2 = 2;
    private static final int STYLE_MODE_0x5 = 5;
    private static final int STYLE_STRUCT_0x3 = 3;
    private static final int SUCCEED_RESPONSE = 100000;
    private static final String TAG = "CustomConfigWatchFaceService";
    private static final int WIDGET_INDEX_0xA = 10;
    private static final int WIDGET_LIST_0x8 = 8;
    private static final int WIDGET_OPTION_INDEX_0xB = 11;
    private static final int WIDGET_STRUCT_0x9 = 9;
    private IBaseResponseCallback applyCustomConfigCallback;
    private final Map<String, Consumer<CustomConfig>> customConfigListenerMap;
    private String watchFaceToApply;

    public static CustomConfigWatchFaceService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private CustomConfigWatchFaceService() {
        this.customConfigListenerMap = new ConcurrentHashMap();
        WatchFaceDeviceService.getInstance().registerIdReportCb(TAG, createWatchFaceReportCallback());
    }

    public void registerDeviceSampleListener() {
        edc.e().registerDeviceSampleListener(CUSTOM_CONFIG_APP_PACKAGE_NAME, this);
    }

    public void queryCustomConfig(DeviceInfo deviceInfo, String str) {
        LogUtil.a(TAG, "queryCustomConfig enter");
        eee eeeVarBuildSampleEvent = buildSampleEvent(EVENT_QUERY_CUSTOM_WATCHFACE, new cqj().b(1, str).e());
        LogUtil.a(TAG, "queryCustomConfig sample event: ", eeeVarBuildSampleEvent);
        sendSampleEventToDevice(deviceInfo, eeeVarBuildSampleEvent);
    }

    public void setCustomConfig(DeviceInfo deviceInfo, CustomConfig customConfig, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "setCustomConfig enter");
        eee eeeVarBuildSampleEvent = buildSampleEvent(EVENT_REPORT_CUSTOM_WATCHFACE, buildCustomConfigEventDataBytes(customConfig));
        LogUtil.a(TAG, "setCustomConfig sample event: ", eeeVarBuildSampleEvent);
        this.watchFaceToApply = customConfig.getMarketId();
        this.applyCustomConfigCallback = iBaseResponseCallback;
        sendSampleEventToDevice(deviceInfo, eeeVarBuildSampleEvent);
    }

    public void notifyCustomConfigListener(CustomConfig customConfig) {
        LogUtil.a(TAG, "notifyCustomConfigListener enter...");
        if (customConfig == null) {
            LogUtil.j(TAG, "notifyCustomConfigListener customConfig is null");
            return;
        }
        Iterator<Map.Entry<String, Consumer<CustomConfig>>> it = this.customConfigListenerMap.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().accept(customConfig);
            } catch (Exception e) {
                LogUtil.e(TAG, "notifyCustomConfigListener error:", ExceptionUtils.c(e));
            }
        }
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (i != 100000) {
            LogUtil.e(TAG, "channel onDataReceived error: ", Integer.valueOf(i));
            return;
        }
        if (deviceInfo == null || eecVar == null) {
            return;
        }
        String srcPkgName = eecVar.getSrcPkgName();
        String wearPkgName = eecVar.getWearPkgName();
        if (!isCheckPkgName(srcPkgName, wearPkgName)) {
            LogUtil.j(TAG, "channel onDataReceived pkg error srcPkgNam: ", srcPkgName, ", wearPkgName:", wearPkgName);
            return;
        }
        if (!(eecVar instanceof eee)) {
            LogUtil.j(TAG, "channel message not SampleEvent");
            return;
        }
        eee eeeVar = (eee) eecVar;
        if (!Objects.equals(Long.valueOf(EVENT_REPORT_CUSTOM_WATCHFACE), Long.valueOf(eeeVar.d()))) {
            LogUtil.j(TAG, "channel message not report custom watchface");
            return;
        }
        LogUtil.a(TAG, "channel onDataReceived :", eeeVar);
        CustomConfig customConfigLoadCustomConfigFromSampleEvent = loadCustomConfigFromSampleEvent(eeeVar);
        if (customConfigLoadCustomConfigFromSampleEvent == null) {
            LogUtil.e(TAG, "channel load custom config fail");
        } else {
            LogUtil.a(TAG, "channel custom config:", customConfigLoadCustomConfigFromSampleEvent);
            notifyCustomConfigListener(customConfigLoadCustomConfigFromSampleEvent);
        }
    }

    public void registerCustomConfigListener(String str, Consumer<CustomConfig> consumer) {
        this.customConfigListenerMap.put(str, consumer);
    }

    public void unregisterCustomConfigListener(String str) {
        this.customConfigListenerMap.remove(str);
    }

    private eee buildSampleEvent(long j, byte[] bArr) {
        eee eeeVar = new eee();
        eeeVar.a(j);
        eeeVar.a(0);
        eeeVar.setSrcPkgName(CUSTOM_CONFIG_APP_PACKAGE_NAME);
        eeeVar.setWearPkgName(CUSTOM_CONFIG_DEVICE_PACKAGE_NAME);
        eeeVar.e(bArr);
        return eeeVar;
    }

    private byte[] buildCustomConfigEventDataBytes(CustomConfig customConfig) {
        LogUtil.a(TAG, "buildCustomConfigEventDataBytes enter");
        cqj cqjVar = new cqj();
        cqjVar.b(1, customConfig.getMarketId());
        buildEventDataStyleList(customConfig.getCustomStyle(), cqjVar);
        if (customConfig.getColorSelectedIndex() != null) {
            cqjVar.b(6, customConfig.getColorSelectedIndex().intValue());
        }
        String customColorValue = customConfig.getCustomColorValue();
        if (!TextUtils.isEmpty(customColorValue)) {
            cqjVar.b(7, customColorValue);
        }
        buildEventDataWidgetList(customConfig, cqjVar);
        return cqjVar.e();
    }

    private void buildEventDataWidgetList(CustomConfig customConfig, cqj cqjVar) {
        List<Integer> widgetSelectedOptions = customConfig.getWidgetSelectedOptions();
        if (ArrayUtils.isEmpty(widgetSelectedOptions)) {
            return;
        }
        cqjVar.a(8);
        for (int i = 0; i < widgetSelectedOptions.size(); i++) {
            cqjVar.d(9);
            cqjVar.c(10, i);
            cqjVar.c(11, widgetSelectedOptions.get(i).intValue());
            cqjVar.b(cqjVar.b());
        }
        cqjVar.a(cqjVar.d());
    }

    private void buildEventDataStyleList(CustomConfig.CustomStyle customStyle, cqj cqjVar) {
        if (customStyle == null) {
            return;
        }
        ArrayList<int[]> arrayList = new ArrayList();
        if (customStyle.getStyleSelectedIndex() != null) {
            arrayList.add(new int[]{0, customStyle.getStyleSelectedIndex().intValue()});
        }
        if (customStyle.getBkgSelectedIndex() != null) {
            arrayList.add(new int[]{1, customStyle.getBkgSelectedIndex().intValue()});
        }
        if (customStyle.getScaleSelectedIndex() != null) {
            arrayList.add(new int[]{2, customStyle.getScaleSelectedIndex().intValue()});
        }
        if (customStyle.getScaleSelectedIndex() != null) {
            arrayList.add(new int[]{3, customStyle.getScaleSelectedIndex().intValue()});
        }
        if (customStyle.getSymbolSelectedIndex() != null) {
            arrayList.add(new int[]{4, customStyle.getSymbolSelectedIndex().intValue()});
        }
        if (customStyle.getTypefaceSelectedIndex() != null) {
            arrayList.add(new int[]{5, customStyle.getTypefaceSelectedIndex().intValue()});
        }
        if (customStyle.getTimeSelectedIndex() != null) {
            arrayList.add(new int[]{6, customStyle.getTimeSelectedIndex().intValue()});
        }
        if (customStyle.getHandSelectedIndex() != null) {
            arrayList.add(new int[]{7, customStyle.getHandSelectedIndex().intValue()});
        }
        if (coq.d(arrayList)) {
            return;
        }
        cqjVar.a(2);
        for (int[] iArr : arrayList) {
            cqjVar.d(3);
            cqjVar.c(4, iArr[0]);
            cqjVar.c(5, iArr[1]);
            cqjVar.b(cqjVar.b());
        }
        cqjVar.a(cqjVar.d());
    }

    private void sendSampleEventToDevice(DeviceInfo deviceInfo, eee eeeVar) {
        LogUtil.a(TAG, "sendSampleEventToDevice sampleEvent=", eeeVar);
        if (deviceInfo == null) {
            LogUtil.j(TAG, "sendSampleEventToDevice deviceInfo null");
        } else {
            edc.e().sendSampleEventCommand(deviceInfo, eeeVar, TAG);
        }
    }

    private boolean isCheckPkgName(String str, String str2) {
        return CUSTOM_CONFIG_DEVICE_PACKAGE_NAME.equals(str) && CUSTOM_CONFIG_APP_PACKAGE_NAME.equals(str2);
    }

    private CustomConfig.CustomStyle loadCustomStyle(List<cql.c> list) {
        CustomConfig.CustomStyle customStyle = new CustomConfig.CustomStyle();
        if (coq.d(list)) {
            return null;
        }
        for (cql.c cVar : list) {
            int iD = cVar.d((byte) 4, -1);
            int iD2 = cVar.d((byte) 5, -1);
            if (iD == -1 || iD2 == -1) {
                LogUtil.e(TAG, "style not found");
            } else {
                switch (iD) {
                    case 0:
                        customStyle.setStyleSelectedIndex(Integer.valueOf(iD2));
                        break;
                    case 1:
                        customStyle.setBkgSelectedIndex(Integer.valueOf(iD2));
                        break;
                    case 2:
                    case 3:
                        customStyle.setScaleSelectedIndex(Integer.valueOf(iD2));
                        break;
                    case 4:
                        customStyle.setSymbolSelectedIndex(Integer.valueOf(iD2));
                        break;
                    case 5:
                        customStyle.setTypefaceSelectedIndex(Integer.valueOf(iD2));
                        break;
                    case 6:
                        customStyle.setTimeSelectedIndex(Integer.valueOf(iD2));
                        break;
                    case 7:
                        customStyle.setHandSelectedIndex(Integer.valueOf(iD2));
                        break;
                }
            }
        }
        return customStyle;
    }

    private List<Integer> loadWidgetList(List<cql.c> list) {
        ArrayList arrayList = new ArrayList();
        if (!coq.d(list)) {
            for (cql.c cVar : list) {
                int iD = cVar.d((byte) 10, -1);
                int iD2 = cVar.d((byte) 11, -1);
                if (iD < 0 || iD >= list.size()) {
                    LogUtil.e(TAG, "loadWidgetList err: widget len is ", Integer.valueOf(arrayList.size()), " but index: ", Integer.valueOf(iD));
                } else {
                    arrayList.add(Integer.valueOf(iD2));
                }
            }
        }
        return arrayList;
    }

    private CustomConfig loadCustomConfigFromSampleEvent(eee eeeVar) {
        CustomConfig customConfig = new CustomConfig();
        try {
            cql.c cVarA = new cql().a(eeeVar.c(), 0);
            String strE = cVarA.e((byte) 1, null);
            CustomConfig.CustomStyle customStyleLoadCustomStyle = loadCustomStyle(cVarA.b((byte) 2));
            int iD = cVarA.d((byte) 6, -1);
            String strE2 = cVarA.e((byte) 7, null);
            List<Integer> listLoadWidgetList = loadWidgetList(cVarA.b((byte) 8));
            customConfig.setMarketId(strE);
            customConfig.setCustomStyle(customStyleLoadCustomStyle);
            if (iD != -1) {
                customConfig.setColorSelectedIndex(Integer.valueOf(iD));
            }
            customConfig.setCustomColorValue(strE2);
            if (!coq.d(listLoadWidgetList)) {
                customConfig.setContainerCount(Integer.valueOf(listLoadWidgetList.size()));
                customConfig.setWidgetSelectedOptions(listLoadWidgetList);
            }
            return customConfig;
        } catch (cpy unused) {
            LogUtil.e(TAG, "channel load event device tlv error");
            return null;
        }
    }

    static class SingletonHolder {
        private static final CustomConfigWatchFaceService INSTANCE = new CustomConfigWatchFaceService();

        private SingletonHolder() {
        }
    }

    private ResponseCallback<WatchFaceIdReportInfo> createWatchFaceReportCallback() {
        return new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside.CustomConfigWatchFaceService$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1433x528c0f1c(i, (WatchFaceIdReportInfo) obj);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$createWatchFaceReportCallback$0$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-deviceside-CustomConfigWatchFaceService, reason: not valid java name */
    /* synthetic */ void m1433x528c0f1c(int i, WatchFaceIdReportInfo watchFaceIdReportInfo) {
        int reportStatus = watchFaceIdReportInfo.getReportStatus();
        LogUtil.a(TAG, "createWatchFaceReportCallback onResponse status: ", Integer.valueOf(i), ", reportInfo.getReportStatus(): ", Integer.valueOf(reportStatus), ", reportInfo.getWatchFaceId(): ", watchFaceIdReportInfo.getWatchFaceId());
        if (!Objects.equals(this.watchFaceToApply, watchFaceIdReportInfo.getWatchFaceId())) {
            LogUtil.a(TAG, "createWatchFaceReportCallback onResponse watchFaceToApply equals reportInfo.getWatchFaceId is false");
        } else {
            if (watchFaceIdReportInfo.getReportStatus() != 1) {
                return;
            }
            this.watchFaceToApply = null;
            this.applyCustomConfigCallback.a(0, watchFaceIdReportInfo.getWatchFaceId());
        }
    }
}
