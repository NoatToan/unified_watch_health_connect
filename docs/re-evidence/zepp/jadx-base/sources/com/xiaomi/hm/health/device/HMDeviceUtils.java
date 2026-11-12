package com.xiaomi.hm.health.device;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.SparseArray;
import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.huami.account.HMLoginManager;
import com.huami.account.IDeviceTokenConfig;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.ai.helper.DeviceSpeechSupportFuncKt;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.user.HealthConfig;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.BuildConfigApi;
import com.huami.feedback.log.utils.ConstantsKt;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.pai.dc.PaiWebConst;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import com.huami.watch.hmwatchmanager.R;
import com.huami.worldclock.manager.WorldClockConfig;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.HMConfig;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMAmazfitDevice;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMColorTheme;
import com.xiaomi.hm.health.bt.model.HMDisconnectRemindConfig;
import com.xiaomi.hm.health.bt.model.HMDisplayData;
import com.xiaomi.hm.health.bt.model.HMDisplayType;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.bt.model.HMOffWistLockConfig;
import com.xiaomi.hm.health.bt.model.HMPeytoSettings;
import com.xiaomi.hm.health.bt.model.HMProDisplayItem;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.model.HMSilentConfig;
import com.xiaomi.hm.health.bt.model.HMWeightUnit;
import com.xiaomi.hm.health.bt.model.HmLocale;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.bt.profile.base.HardwareInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMPaiData;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmAfData;
import com.xiaomi.hm.health.bt.profile.mili.model.MiLiHwConfig;
import com.xiaomi.hm.health.bt.profile.page.PageItem;
import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.hm.health.bt.profile.user.GenderExt;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.dataprocess.DataAnalysis;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.assistant.smart.sync.AssistantRecoverImpl;
import com.xiaomi.hm.health.device.beep.BeepPropertyRepo;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.event.HMDeviceAlarmEvent;
import com.xiaomi.hm.health.device.model.BindBaseStep;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.device.setting.appsort.DeviceAppChecker;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import com.xiaomi.hm.health.device.setting.ui.DeviceSettingActivity;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.devicelib.UserData;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMCalendarConfig;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMNightModeConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMSportHRBroadcastConfig;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryModel;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryScreen;
import com.xiaomi.hm.health.speech.utils.CheckDeviceSupportAlexaKt;
import com.xiaomi.hm.health.ui.goal.GoalFunctionsKt;
import com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDelayTimeRecover;
import com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneDeviceLifeCycle;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateRepo;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager;
import com.xiaomi.hm.health.ui.smartplay.logsit.LongSitLogicKt;
import com.xiaomi.hm.health.ui.unit.UnitFunctionsKt;
import com.xiaomi.hm.health.ui.unit.UnitRecover;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import com.xiaomi.mipush.sdk.Constants;
import de.greenrobot.event.EventBus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceUtils {
    public static final String PARAM_SOURCE = "source";
    private static final String a = "HMDeviceUtils";
    private static final String b = "Hant";
    private static final String c = "zh_TW";
    private static final int d = 9999;
    private static final int e = 1900;
    private static final int f = 1970;
    private static final Lazy<BuildConfigApi> g = KoinJavaComponent.inject(BuildConfigApi.class);
    private static final String h = "qmLiftWristEnable";
    private static final int i = 20;
    private static final int j = 40;

    public class a extends HMCallback {
        public final /* synthetic */ boolean a;

        public a(final boolean val$showSms) {
            this.a = val$showSms;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            HMLog.i(HMDeviceUtils.a, "setShowContactBySystemLanguage ALERT_SMS " + this.a + " result:" + result, new Object[0]);
        }
    }

    public class b extends HMCallback {
        public final /* synthetic */ boolean a;

        public b(final boolean val$showIncall) {
            this.a = val$showIncall;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            HMLog.i(HMDeviceUtils.a, "setShowContactBySystemLanguage ALERT_INCALL " + this.a + " result:" + result, new Object[0]);
        }
    }

    public class c extends HMCallback {
        public final /* synthetic */ HMMiliConfig a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ HMPersonInfo d;

        public c(final HMMiliConfig val$miliConfig, final int val$timePanel, final int val$sysLang, final HMPersonInfo val$personInfo) {
            this.a = val$miliConfig;
            this.b = val$timePanel;
            this.c = val$sysLang;
            this.d = val$personInfo;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            HMLog.i(HMDeviceUtils.a, "setDisplayType onFinish :  " + result, new Object[0]);
            if (result) {
                this.a.setTimePanelType(this.b);
                this.a.setTimePanelLang(this.c);
                this.d.saveInfo(2);
            }
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            c = iArr;
            try {
                iArr[HMDeviceType.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[HMDeviceType.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[HMDeviceType.WATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[HMDeviceType.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[HMDeviceType.TREADMILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[HMDeviceType.SHOES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[HMDeviceSource.values().length];
            b = iArr2;
            try {
                iArr2[HMDeviceSource.MILI_WUHAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[HMDeviceSource.SHOES_MARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[HMDeviceSource.MILI_KONGMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[HMDeviceSource.MILI_KONGMING_L.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[HMDeviceSource.MILI_KONGMING_PRO.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[HMDeviceSource.MILI_YORK.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[HMDeviceSource.MILI_BARI.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[HMDeviceSource.MILI_BARI_NFC.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[HMDeviceSource.MILI_BARI_W.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr3 = new int[HMBrandType.values().length];
            a = iArr3;
            try {
                iArr3[HMBrandType.BRAND_MIJIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[HMBrandType.BRAND_SHOES_KANGNAI.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[HMBrandType.BRAND_SHOES_ANTELOPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[HMBrandType.BRAND_DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public static boolean checkConnectedMiLiDevice(Activity activity) {
        List<BluetoothDevice> connectedGattDevice = GattUtils.getConnectedGattDevice(activity);
        if (connectedGattDevice == null || connectedGattDevice.size() == 0) {
            return false;
        }
        HashMap<String, HMDeviceType> boundDevices = HMDeviceManager.getInstance().getBoundDevices(HMDeviceType.MILI);
        ArrayList arrayList = new ArrayList();
        for (BluetoothDevice bluetoothDevice : connectedGattDevice) {
            String bluetoothDeviceName = GattUtils.getBluetoothDeviceName(bluetoothDevice);
            if (!TextUtils.isEmpty(bluetoothDeviceName) && HMDeviceConfig.isBand(HMMiLiProDevice.nameToSource(bluetoothDeviceName))) {
                boolean zContains = ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_QINLING).getBtNames().contains(bluetoothDeviceName);
                if (GlobalConfig.get().isBuildInner() || !zContains) {
                    if (boundDevices == null || boundDevices.get(bluetoothDevice.getAddress()) == null) {
                        if (HMMiLiDevice.isSupportDeviceName(bluetoothDeviceName) || HMMiLiProDevice.isSupportDeviceName(bluetoothDeviceName) || HMAmazfitDevice.isSupportDeviceName(bluetoothDeviceName)) {
                            arrayList.add(bluetoothDevice);
                        }
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            return false;
        }
        activity.finish();
        HMSelectMiliActivity.show(activity, arrayList);
        return true;
    }

    public static boolean checkConnectedWatchDevice(Activity activity, int bindType) {
        List<BluetoothDevice> connectedGattDevice = GattUtils.getConnectedGattDevice(activity);
        if (connectedGattDevice == null || connectedGattDevice.size() == 0) {
            return false;
        }
        HashMap<String, HMDeviceType> boundDevices = HMDeviceManager.getInstance().getBoundDevices(HMDeviceType.MILI);
        ArrayList arrayList = new ArrayList();
        Iterator<BluetoothDevice> it2 = connectedGattDevice.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            BluetoothDevice next = it2.next();
            String bluetoothDeviceName = GattUtils.getBluetoothDeviceName(next);
            boolean z = !TextUtils.isEmpty(bluetoothDeviceName);
            boolean zE = e(bindType, bluetoothDeviceName);
            boolean z2 = (boundDevices == null || boundDevices.get(next.getAddress()) == null) ? false : true;
            if (z && zE && !z2) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 0) {
            return false;
        }
        activity.finish();
        HMSelectMiliActivity.show(activity, arrayList, bindType);
        return true;
    }

    public static HMWeightUnit convertToBtUnit(int unit) {
        HMWeightUnit hMWeightUnit = HMWeightUnit.KG;
        if (unit == 16) {
            return HMWeightUnit.JIN;
        }
        return unit == 1 ? HMWeightUnit.POUND : hMWeightUnit;
    }

    private static boolean e(int bindType, String deviceName) {
        if (bindType == 10) {
            return Arrays.asList(HMDeviceSource.MILI_PEYTO, HMDeviceSource.MILI_PEYTO_L, HMDeviceSource.MILI_PEYTO_WL).contains(HMMiLiProDevice.nameToSource(deviceName));
        }
        if (bindType == 7) {
            return Arrays.asList(HMDeviceSource.MILI_DTH, HMDeviceSource.MILI_DTH_W, HMDeviceSource.MILI_TONLESAP, HMDeviceSource.MILI_TONLESAP_L, HMDeviceSource.MILI_TONLESAP_O, HMDeviceSource.MILI_TONLESAP_OL).contains(HMMiLiProDevice.nameToSource(deviceName));
        }
        if (bindType == 27) {
            List listAsList = Arrays.asList(HMDeviceSource.MILI_COMO, HMDeviceSource.MILI_COMO_L, HMDeviceSource.MILI_COMO_W, HMDeviceSource.MILI_COMO_WL, HMDeviceSource.MILI_NESS, HMDeviceSource.MILI_NESS_W, HMDeviceSource.MILI_DAX);
            if (g.getValue().isSupportCrater()) {
                listAsList.add(HMDeviceSource.MILI_CRATER_W);
                listAsList.add(HMDeviceSource.MILI_CRATER_WL);
            }
            return listAsList.contains(HMMiLiProDevice.nameToSource(deviceName));
        }
        if (bindType == 8) {
            return Arrays.asList(HMDeviceSource.MILI_PYH, HMDeviceSource.MILI_PYH_W).contains(HMMiLiProDevice.nameToSource(deviceName));
        }
        if (bindType != 11) {
            if (bindType == 12) {
                return ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_KESTREL).getBtNames().contains(deviceName);
            }
            if (bindType == 19) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_VULTURE).getBtNames());
                arrayList.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_BLANC).getBtNames());
                arrayList.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_BLANC_W).getBtNames());
                return arrayList.contains(deviceName);
            }
            if (bindType == 21) {
                return ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_VENICE).getBtNames().contains(deviceName);
            }
            if (bindType == 22) {
                return ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_ANETO).getBtNames().contains(deviceName);
            }
            if (bindType == 23) {
                return ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_LONDON).getBtNames().contains(deviceName);
            }
            if (bindType != 26) {
                return false;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_TOKYO).getBtNames());
            arrayList2.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_OSAKA).getBtNames());
            arrayList2.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_OSAKA_W).getBtNames());
            return arrayList2.contains(deviceName);
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_FALCON).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_HAWK).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_FALCON_L).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_HAWK_SWK).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_FALCON_DISNEY).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_KESTREL).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_KESTREL_L).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_ONYX).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_ONYX_W).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_CORSICA).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_CORSICA_W).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_OSPREY).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_OSPREY_W).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_OSPREY_C).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_LISBON).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_LISBON_W).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_LINCS).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_LINCS_W).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_NEWTON).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_NEWTON_W).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_PRAGUE).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_PRAGUE_W).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_VOLGA).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_VOLGA_W).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_HAMBURG).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_BONN).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_HAMBURG_W).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_BONN_W).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_MADRID).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_MADRID_HML).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_MADRID_W).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_VIENNA).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_VIENNA_W).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_ANDES).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_ANDES_W).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_TEIDE).getBtNames());
        arrayList3.addAll(ConfigHelperKt.getDeviceConfig(HMDeviceSource.MILI_TEIDE_W).getBtNames());
        arrayList3.addAll(h(HMDeviceSource.MILI_ZURICH, HMDeviceSource.MILI_ZURICH_W));
        arrayList3.addAll(h(HMDeviceSource.MILI_VERONA, HMDeviceSource.MILI_VERONA_W));
        arrayList3.addAll(h(HMDeviceSource.MILI_BLED, HMDeviceSource.MILI_BLED_W));
        arrayList3.addAll(h(HMDeviceSource.MILI_BLED_PRO, HMDeviceSource.MILI_BLED_PRO_W));
        arrayList3.addAll(h(HMDeviceSource.MILI_CANNES, HMDeviceSource.MILI_CANNES_W));
        arrayList3.addAll(h(HMDeviceSource.MILI_SOFIA, HMDeviceSource.MILI_SOFIA_W));
        arrayList3.addAll(h(HMDeviceSource.MILI_LISBON_WL, HMDeviceSource.MILI_NEWTON_WL));
        arrayList3.addAll(h(HMDeviceSource.MILI_PROVENCE, HMDeviceSource.MILI_PROVENCE_W));
        arrayList3.addAll(h(HMDeviceSource.MILI_LEIDEN, HMDeviceSource.MILI_LEIDEN_W));
        return arrayList3.contains(deviceName);
    }

    public static List<HMDisplayData> f() {
        ArrayList arrayList = null;
        if (!HMDeviceConfig.hasFeatureSecondaryScreen(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI))) {
            return null;
        }
        SecondaryScreen secondaryScreen = SecondaryScreen.getInstance();
        if (secondaryScreen != null) {
            List<SecondaryModel> secondaryModelList = secondaryScreen.getSecondaryModelList();
            arrayList = new ArrayList();
            if (secondaryModelList != null && secondaryModelList.size() > 0) {
                for (SecondaryModel secondaryModel : secondaryModelList) {
                    arrayList.add(new HMDisplayData(secondaryModel.isEnable(), (byte) secondaryModel.getIndex(), (byte) secondaryModel.getType()));
                }
            }
        }
        return arrayList;
    }

    public static boolean fromAvoidSpiteBindingStr() {
        String property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty(Property.PROPERTY_AVOID_SPITE_BINDING, "");
        if (TextUtils.isEmpty(property)) {
            return false;
        }
        try {
            return new JSONObject(property).optBoolean("enable");
        } catch (Exception e2) {
            HMLog.i(a, "fromAvoidSpiteBindingStr exception: " + e2.getMessage(), new Object[0]);
            return false;
        }
    }

    public static HMDisconnectRemindConfig fromDisconnectRemindConfigString(String configStr) {
        HMDisconnectRemindConfig hMDisconnectRemindConfig = new HMDisconnectRemindConfig(false);
        if (TextUtils.isEmpty(configStr)) {
            return hMDisconnectRemindConfig;
        }
        try {
            JSONObject jSONObject = new JSONObject(configStr);
            hMDisconnectRemindConfig.setEnable(jSONObject.getBoolean("enable"));
            hMDisconnectRemindConfig.setStartIndex(jSONObject.getInt("startIndex"));
            hMDisconnectRemindConfig.setStopIndex(jSONObject.getInt("stopIndex"));
        } catch (Exception e2) {
            HMLog.d(a, e2.toString(), new Object[0]);
        }
        return hMDisconnectRemindConfig;
    }

    public static HMLiftWristConfig fromLiftWristConfig(boolean enable, String timeStr) {
        HMLiftWristConfig hMLiftWristConfig = new HMLiftWristConfig(enable);
        if (TextUtils.isEmpty(timeStr)) {
            return hMLiftWristConfig;
        }
        try {
            JSONObject jSONObject = new JSONObject(timeStr);
            hMLiftWristConfig.setStartTimeIndex(jSONObject.getInt("start"));
            hMLiftWristConfig.setStopTimeIndex(jSONObject.getInt(Command.STOP));
            hMLiftWristConfig.setAllDay(jSONObject.optBoolean("allday", true));
            hMLiftWristConfig.setSensitivity(jSONObject.optInt("liftWristBrightSpeed", 0));
        } catch (Exception e2) {
            HMLog.d(a, e2.toString(), new Object[0]);
        }
        return hMLiftWristConfig;
    }

    public static boolean fromMsgPreviewStr(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return new JSONObject(str).optBoolean("enable");
        } catch (Exception e2) {
            HMLog.d(a, e2.toString(), new Object[0]);
            return true;
        }
    }

    public static boolean fromPropertyBoolStr(String jsonStr) {
        if (jsonStr != null && !TextUtils.isEmpty(jsonStr)) {
            try {
                return new JSONObject(jsonStr).optBoolean("enable");
            } catch (Exception e2) {
                HMLog.d(a, e2.toString(), new Object[0]);
            }
        }
        return false;
    }

    public static HMSedentaryConfig fromSedentaryConfig(final String config) {
        boolean zOptBoolean;
        int i2;
        int iOptInt;
        HMLog.info(a, new Function0() { // from class: vt2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMDeviceUtils.r(config);
            }
        });
        if (TextUtils.isEmpty(config)) {
            return new HMSedentaryConfig(true);
        }
        try {
            JSONObject jSONObject = new JSONObject(config);
            String string = jSONObject.getString("enable");
            boolean z = "true".equalsIgnoreCase(string) || "1".equalsIgnoreCase(string);
            JSONArray jSONArray = jSONObject.getJSONArray("middayRest");
            if (jSONArray == null || jSONArray.length() <= 0) {
                zOptBoolean = false;
                i2 = -1;
                iOptInt = -1;
            } else {
                JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                zOptBoolean = jSONObject2.optBoolean("enable");
                int iOptInt2 = jSONObject2.optInt("start", 720);
                iOptInt = jSONObject2.optInt(Command.STOP, HMSedentaryConfig.INGORE_STOP_INDEX);
                i2 = iOptInt2;
            }
            int iOptInt3 = jSONObject.optInt("workSt", 480);
            int iOptInt4 = jSONObject.optInt("workEd", 1260);
            final HMSedentaryConfig hMSedentaryConfig = (i2 == -1 || iOptInt == -1) ? new HMSedentaryConfig(z, zOptBoolean, (short) 60, iOptInt3, iOptInt4) : new HMSedentaryConfig(z, zOptBoolean, (short) 60, iOptInt3, iOptInt4, i2, iOptInt);
            HMLog.info(a, new Function0() { // from class: ut2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceUtils.s(hMSedentaryConfig);
                }
            });
            return hMSedentaryConfig;
        } catch (Exception e2) {
            HMLog.i(a, "Exception:" + e2.getMessage(), new Object[0]);
            return new HMSedentaryConfig(true);
        }
    }

    public static HMSilentConfig fromSilentConfig(String config) {
        HMLog.d(a, "fromSilentConfig:" + config, new Object[0]);
        if (TextUtils.isEmpty(config)) {
            return new HMSilentConfig();
        }
        try {
            JSONObject jSONObject = new JSONObject(config);
            boolean zOptBoolean = jSONObject.optBoolean("enable");
            HMSilentConfig hMSilentConfig = new HMSilentConfig(zOptBoolean, jSONObject.optInt("start"), jSONObject.optInt(Command.STOP), jSONObject.has("enableType") ? jSONObject.optInt("enableType") : 1, jSONObject.has(h) ? jSONObject.optBoolean(h) : zOptBoolean);
            HMLog.d(a, "HMSilentConfig:" + hMSilentConfig, new Object[0]);
            return hMSilentConfig;
        } catch (Exception e2) {
            HMLog.i(a, "Exception:" + e2.getMessage(), new Object[0]);
            return new HMSilentConfig(false);
        }
    }

    public static HMLanguage fromSystemLanguage() {
        HMLanguage hMLanguage = new HMLanguage(2);
        hMLanguage.setLang(HMLanguage.getLanguageStr(Locale.getDefault()));
        if (Language.isEnglish()) {
            hMLanguage.setLanguage(2);
        } else if (Language.isTraditionalChinese()) {
            hMLanguage.setLanguage(1);
        } else if (Language.isSimplifiedChinese()) {
            if (b.equals(Locale.getDefault().getScript())) {
                hMLanguage.setLanguage(1);
                hMLanguage.setLang("zh_TW");
            } else {
                hMLanguage.setLanguage(0);
            }
        }
        return hMLanguage;
    }

    public static HMDisplayType g(int timePanel) {
        if (timePanel == 0) {
            return HMDisplayType.ONLY_TIME;
        }
        if (Language.isSimplifiedChinese()) {
            return HMDisplayType.SIMPLE_CHINESE;
        }
        return Language.isTraditionalChinese() ? HMDisplayType.TRAD_CHINESE : HMDisplayType.ENGLISH;
    }

    public static Calendar getAfResultSyncTime(List<? extends HmAfData> dataList) {
        if (dataList == null || dataList.isEmpty()) {
            return Calendar.getInstance();
        }
        long timestamp = 0;
        for (HmAfData hmAfData : dataList) {
            if (hmAfData.getTimestamp() > timestamp) {
                timestamp = hmAfData.getTimestamp();
            }
        }
        if (timestamp > 0) {
            timestamp += 1000;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        return calendar;
    }

    public static int getBindBaseStep() {
        BindBaseStep bindBaseStep = HMKeeper.getBindBaseStep();
        int baseStep = bindBaseStep.getBaseStep();
        String uid = bindBaseStep.getUid();
        if (baseStep <= 0) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(bindBaseStep.getBindTimestamp());
        Calendar calendar2 = Calendar.getInstance();
        boolean z = calendar.get(1) == calendar2.get(1);
        boolean z2 = calendar.get(2) == calendar2.get(2);
        boolean z3 = calendar.get(5) == calendar2.get(5);
        boolean z4 = !TextUtils.isEmpty(uid) && HMLoginManager.theSameUser(null, uid, null);
        if (!z || !z2 || !z3 || !z4) {
            HMLog.d(a, "clear bind base step", new Object[0]);
            return 0;
        }
        HMLog.d(a, "user base step:" + baseStep, new Object[0]);
        return baseStep;
    }

    public static String getBoundWatchDeviceDescription() {
        return HMDeviceConfig.hasBoundWatch() ? getMiLiDeviceDescription() : getDeviceDescription(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.WATCH));
    }

    public static String getDateFormat(HMDeviceSource source) {
        String strReplaceFirst;
        if (!HMDeviceConfig.hasFeatureDateFormat(source)) {
            return null;
        }
        Locale locale = Locale.getDefault();
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(source.getType());
        DeviceInfo deviceInfo = device == null ? null : device.getDeviceInfo();
        HMOtherVersion otherVersion = deviceInfo != null ? deviceInfo.getOtherVersion() : null;
        if (deviceInfo != null && otherVersion != null && deviceInfo.getLanguageComBination().isSupportDeviceSettings()) {
            try {
                locale = HmLocale.getLocale(otherVersion.getLanguage().getLanguage());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "yyyyMMdd");
        HMLog.i(a, "before deal pattern : " + bestDateTimePattern, new Object[0]);
        if (Pattern.matches("((?:y{4}|M{2}|d{2})[/\\-. ]){2}(?:y{4}|M{2}|d{2}).*", bestDateTimePattern)) {
            strReplaceFirst = bestDateTimePattern.substring(0, 10);
        } else {
            Matcher matcher = Pattern.compile(".*(y{4}|M{2}|d{2}).*(y{4}|M{2}|d{2}).*(y{4}|M{2}|d{2}).*").matcher(bestDateTimePattern);
            strReplaceFirst = matcher.matches() ? matcher.replaceFirst("$1/$2/$3") : TimeFormatUtils.PATTERN_YYY_MM_DD;
        }
        HMLog.i(a, "after deal pattern : " + strReplaceFirst, new Object[0]);
        return strReplaceFirst;
    }

    public static long getDateTimestamp(long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTimeInMillis(timestamp);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static String getDeviceDescription(HMDeviceSource source) {
        return getDeviceDescription(source, HMBrandType.BRAND_DEFAULT);
    }

    @SuppressLint({"SimpleDateFormat"})
    public static String getDeviceLogName(HMDeviceSource source) {
        return source.name() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ConstantsKt.LOG_FILE_SUFFIX;
    }

    public static int[] getDisAndCalByStep(int realtimeStep) {
        int calories;
        int distance;
        StepsInfo stepsInfo;
        int i2 = 0;
        HMLog.d(a, "realtimeStep:" + realtimeStep, new Object[0]);
        DaySportData todaySportData = HMDataCacheCenter.getInstance().getTodaySportData();
        if (todaySportData == null || (stepsInfo = todaySportData.getStepsInfo()) == null) {
            HMLog.d(a, "no sport data today", new Object[0]);
            calories = 0;
            distance = 0;
        } else {
            int stepsCount = stepsInfo.getStepsCount();
            distance = stepsInfo.getDistance();
            calories = stepsInfo.getCalories();
            HMLog.d(a, "existSteps " + stepsCount + " existDis " + distance + " existCal " + calories, new Object[0]);
            i2 = stepsCount;
        }
        return DataAnalysis.getCalAndDis(realtimeStep, i2, distance, calories, Utils.getAlgoUserInfo());
    }

    public static List<SecondaryModel> getDisplayDataNewList() {
        ArrayList arrayList = null;
        if (!HMDeviceConfig.hasFeatureSecondaryScreen(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI))) {
            return null;
        }
        SecondaryScreen secondaryScreen = SecondaryScreen.getInstance();
        if (secondaryScreen != null) {
            List<SecondaryModel> secondaryModelList = secondaryScreen.getSecondaryModelList();
            arrayList = new ArrayList();
            for (SecondaryModel secondaryModel : secondaryModelList) {
                if (secondaryModel.getType() == 57) {
                    boolean zIsLoginCountryAndDeviceSupportAlexa = CheckDeviceSupportAlexaKt.isLoginCountryAndDeviceSupportAlexa(DeviceXFunctionsKt.getContext());
                    HMLog.i("AlexaUtils", "showAlexa " + zIsLoginCountryAndDeviceSupportAlexa, new Object[0]);
                    if (zIsLoginCountryAndDeviceSupportAlexa) {
                        arrayList.add(secondaryModel);
                    }
                } else {
                    arrayList.add(secondaryModel);
                }
            }
        }
        return arrayList;
    }

    public static String getEarbudDeviceDescription() {
        return getDeviceDescription(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.EARBUD));
    }

    public static String getEarbudLogName(HMDeviceSource source, String deviceId) {
        return source.name() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + deviceId + ConstantsKt.LOG_FILE_SUFFIX;
    }

    public static String getHuamiDeviceDescription(Device device) {
        return DeviceSource.getDeviceName(DeviceXFunctionsKt.getContext(), toWatchDevice(device));
    }

    public static int getImageForDevice(HMDeviceSource deviceSource) {
        return ConfigHelperKt.getDeviceIcon(deviceSource);
    }

    public static MiLiHwConfig getInitMiliDeviceConfig(DeviceInfo deviceInfo, Context context) {
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        HMMiliConfig miliConfig = hMPersonInfo.getMiliConfig();
        MiLiHwConfig miLiHwConfig = new MiLiHwConfig();
        HealthConfig healthConfig = HealthDetect.INSTANCE.getHealthConfig();
        healthConfig.resetOnBind();
        HMMiLiProDevice miliProDevice = HMDeviceManager.getInstance().getMiliProDevice();
        if (miliProDevice != null && miliProDevice.isHuamiOs()) {
            miLiHwConfig.weightUnit = UnitFunctionsKt.toBleWeightUnit(UnitManager.getInstance().getWeightUnit());
            miLiHwConfig.addRecoverItem(new UnitRecover(WeatherSetting.fromJsonString(miliConfig.getWeatherSetting()).getTemperatureUnit(), UnitManager.getInstance().isMetric()));
        }
        miLiHwConfig.goals = miliConfig.getGoalStepsCount();
        miLiHwConfig.calorieGoal = Integer.valueOf(GoalFunctionsKt.getGoalCalorieValue());
        miLiHwConfig.weightGoal = Integer.valueOf(com.xiaomi.hm.health.utils.UnitFunctionsKt.convertKgToBleUnit(HMPersonInfo.getInstance().getUserInfo().getTargetWeight()));
        miLiHwConfig.sleepGoal = Integer.valueOf(GoalFunctionsKt.getGoalSleepValue());
        if (miliConfig.getLightColor() == null) {
            miLiHwConfig.color = HMColorTheme.Color.BLUE.getValue();
        } else {
            miLiHwConfig.color = x(miliConfig.getLightColor());
        }
        miLiHwConfig.assistSleep = healthConfig.getUserConfig().getCom.huami.device.feature.health.user.HrDetectSettingConfig.G java.lang.String();
        miLiHwConfig.enableConnectedBtAdv = miliConfig.isEnableConnectedBtAdv();
        miLiHwConfig.location = y(miliConfig.getWearHand());
        miLiHwConfig.baseStep = HMKeeper.getBindBaseStep().getBaseStep();
        miLiHwConfig.hrEnable = healthConfig.getUserConfig().getHrEnable();
        miLiHwConfig.hrSleepEnable = healthConfig.getUserConfig().getHrSleepEnable();
        miLiHwConfig.atrialFibEnable = healthConfig.getUserConfig().getAtrialFibEnable();
        miLiHwConfig.hrInterval = healthConfig.getUserConfig().getFreq();
        if (HMDeviceConfig.hasFeatureSportHrDetect()) {
            miLiHwConfig.sportHRCheckEnable = Boolean.valueOf(healthConfig.getUserConfig().getSportHrCheckEnable());
        }
        m(context, deviceSource, miLiHwConfig, hMPersonInfo, miliConfig, deviceInfo);
        HMKeeper.setNeedSyncAlarm2Cloud(AlarmClockManager.getInstance().checkAlarmData());
        HMKeeper.setNeedSetAlarm2Device(false);
        AlarmClockManager.getInstance().migrateAlarmClock(deviceSource);
        i(deviceSource, miLiHwConfig);
        j(deviceSource, miLiHwConfig, deviceInfo.getDeviceFeature());
        k(deviceSource, miliConfig, miLiHwConfig, healthConfig);
        return miLiHwConfig;
    }

    public static String getMiLiDeviceDescription() {
        return getDeviceDescription(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI));
    }

    public static int getNormandyBatteryDescriptionResId(int level) {
        if (level < 20) {
            return R.string.normandy_low_battery;
        }
        return level < 40 ? R.string.normandy_mid_battery : R.string.normandy_high_battery;
    }

    public static String getOtherDeviceDescription() {
        return getDeviceDescription(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.OTHER));
    }

    public static Calendar getPaiSyncTime(ArrayList<HMPaiData> dataArrayList) {
        if (dataArrayList == null || dataArrayList.size() == 0) {
            return Calendar.getInstance();
        }
        long time = 0;
        for (HMPaiData hMPaiData : dataArrayList) {
            if (hMPaiData.getTime() > time) {
                time = hMPaiData.getTime();
                hMPaiData.getTimezone();
            }
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return calendar;
    }

    public static String getShoesDeviceDescription() {
        Device bindInfo = HMDeviceManager.getInstance().getBindInfo(HMDeviceType.SHOES);
        return bindInfo == null ? getDeviceDescription(HMDeviceSource.VDEVICE) : getDeviceDescription(HMDeviceSource.fromValue(bindInfo.getDevice_source().intValue()), HMBrandType.fromValue(bindInfo.getBrandType().intValue()));
    }

    public static String getString(@StringRes int resId) {
        Application context = DeviceXFunctionsKt.getContext();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(Locale.SIMPLIFIED_CHINESE);
        return context.createConfigurationContext(configuration).getResources().getString(resId);
    }

    public static UserData getThirdPartyUserData() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        HMUserInfo userInfo = hMPersonInfo.getUserInfo();
        UserData userData = new UserData();
        userData.setUid(userInfo.getUserid());
        userData.setAge(userInfo.getAge());
        userData.setChinaUser(HMLoginManager.isInChina());
        userData.setIsMetric(hMPersonInfo.getMiliConfig().getUnit() == 0);
        userData.setWeight(userInfo.getWeight());
        userData.setHeight(userInfo.getHeight());
        userData.setGender(userInfo.getGender());
        userData.setName(userInfo.getNickname());
        userData.setAvatarUrl(userInfo.getAvatar());
        userData.setAvatarPath(userInfo.getAvatarPath());
        userData.setBuyMifiProUrl(HMConfig.Url.buyUrl());
        userData.setChannel(HMConfig.Channel.name());
        return userData;
    }

    public static String getVoiceRes(HMDeviceType type) {
        DeviceInfo deviceInfo;
        String string = BraceletApp.getContext().getString(R.string.app_sort_voice);
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(type);
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null) {
            return string;
        }
        if (HMDeviceConfig.isKongmingSeries()) {
            return HardwareInfo.isMiliKongmingMainLand(deviceInfo.getHardwareVersionStr()) ? BraceletApp.getContext().getString(R.string.setting_app_xiaoai) : BraceletApp.getContext().getString(R.string.setting_app_alexa);
        }
        if (DeviceSpeechSupportFuncKt.supportMIAI(device)) {
            return BraceletApp.getContext().getString(R.string.setting_app_xiaoai);
        }
        return DeviceSpeechSupportFuncKt.featureSupportAlexa(device) ? BraceletApp.getContext().getString(R.string.setting_app_alexa) : string;
    }

    public static String getWeightDeviceDescription() {
        return getDeviceDescription(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.WEIGHT));
    }

    private static List<String> h(HMDeviceSource... sources) {
        ArrayList arrayList = new ArrayList();
        for (HMDeviceSource hMDeviceSource : sources) {
            arrayList.addAll(ConfigHelperKt.getDeviceConfig(hMDeviceSource).getBtNames());
        }
        return arrayList;
    }

    private static void i(HMDeviceSource source, MiLiHwConfig config) {
        if (HMDeviceSource.MILI_AMAZFIT == source || HMDeviceConfig.hasFeaturePro(source)) {
            config.alarms = AlarmClockManager.getInstance().getAllAlarmExt();
        } else if (source != HMDeviceSource.MILI_ANETO) {
            config.alarms = AlarmClockManager.getInstance().getOneBandAlarmExt();
        }
    }

    public static boolean isPressureHrInDependent() {
        switch (d.b[HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI).ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(32);
            default:
                return true;
        }
    }

    public static boolean isSupportContactNameForSystemLanguage() {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        if (boundDeviceSource == HMDeviceSource.MILI_PEYTO) {
            return Language.isSimplifiedChinese() || Language.isEnglish() || Language.isTraditionalChinese() || Language.isSpainish() || Language.isRussia() || Language.isGerman() || Language.isItalian() || Language.isFrench() || Language.isTurkish();
        }
        if (boundDeviceSource == HMDeviceSource.MILI_TEMPO) {
            return Language.isSimplifiedChinese() || Language.isEnglish() || Language.isTraditionalChinese() || Language.isSpainish() || Language.isRussia();
        }
        if (boundDeviceSource == HMDeviceSource.MILI_WUHAN) {
            return isSupportWuhanLanguage();
        }
        if (boundDeviceSource == HMDeviceSource.MILI_CHONGQING) {
            return Language.isSimplifiedChinese() || Language.isEnglish() || Language.isTraditionalChinese();
        }
        if (boundDeviceSource == HMDeviceSource.MILI_BEATS || boundDeviceSource == HMDeviceSource.MILI_DTH) {
            return Language.isSimplifiedChinese() || Language.isEnglish() || Language.isTraditionalChinese();
        }
        if (boundDeviceSource == HMDeviceSource.MILI_BEATS_W) {
            return Language.isSimplifiedChinese() || Language.isEnglish() || Language.isTraditionalChinese() || Language.isSpainish() || Language.isRussia();
        }
        return boundDeviceSource != HMDeviceSource.MILI_DTH_W || Language.isSimplifiedChinese() || Language.isEnglish() || Language.isTraditionalChinese() || Language.isSpainish() || Language.isRussia() || Language.isGerman() || Language.isFrench() || Language.isItalian() || Language.isKorean() || Language.isTurkish() || Language.isPolish();
    }

    @Deprecated
    public static boolean isSupportDeviceToken(HMDeviceSource source) {
        return ((IDeviceTokenConfig) KoinJavaComponent.get(IDeviceTokenConfig.class)).isSupportDeviceToken(source.getValue());
    }

    public static boolean isSupportWuhanLanguage() {
        return Language.isSimplifiedChinese() || Language.isEnglish() || Language.isTraditionalChinese() || Language.isSpainish() || Language.isFrench() || Language.isRussia() || Language.isGerman() || Language.isIndonesian() || Language.isItalian() || Language.isPolish() || Language.isJapanese() || Language.isTurkish() || Language.isUkrainian() || Language.isNederlandse() || Language.isArabic() || Language.isVietnamese() || Language.isThai() || Language.isPortuguese() || Language.isKorean();
    }

    private static void j(HMDeviceSource source, MiLiHwConfig config, Feature feature) {
        HMAppSortDataManager hMAppSortDataManager = HMAppSortDataManager.getInstance();
        if (HMDeviceConfig.isSupportNewProtocal(source)) {
            SortableAppItems mergedDisplaySetting = hMAppSortDataManager.getMergedDisplaySetting(source);
            if (mergedDisplaySetting != null) {
                mergedDisplaySetting = DeviceAppChecker.checkFeature(feature, mergedDisplaySetting);
            }
            config.appSortInfo = transFromHMDisplaySetting(mergedDisplaySetting);
            config.displayPageDataList = z(getDisplayDataNewList(), source);
            return;
        }
        if (source == HMDeviceSource.MILI_DTH_W) {
            config.displaySetting = hMAppSortDataManager.getMergedDisplaySetting(HMDeviceSource.MILI_DTH);
        } else if (source == HMDeviceSource.MILI_BEATS_W) {
            config.displaySetting = hMAppSortDataManager.getMergedDisplaySetting(HMDeviceSource.MILI_BEATS);
        } else {
            config.displaySetting = hMAppSortDataManager.getMergedDisplaySetting(source);
        }
        config.displayDataList = f();
    }

    @MainThread
    public static void jumpToDeviceDetailPage(Context context, int sourceValue) {
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(sourceValue);
        HMLog.d(a, "source: " + hMDeviceSourceFromValue, new Object[0]);
        if (HMDeviceSource.VDEVICE == hMDeviceSourceFromValue) {
            HMLog.d(a, "source invalid!", new Object[0]);
            return;
        }
        if (!HMDeviceManager.getInstance().hasBoundAnyDevice(hMDeviceSourceFromValue)) {
            HMLog.d(a, "not bound!", new Object[0]);
            context.startActivity(new Intent(context, (Class<?>) MainTabActivity.class).putExtra("tab_index", 3));
            return;
        }
        switch (d.c[hMDeviceSourceFromValue.getType().ordinal()]) {
            case 1:
                ((DeviceXNavigator) KoinJavaComponent.get(DeviceXNavigator.class)).navigateToDeviceSetting(context, hMDeviceSourceFromValue);
                return;
            case 2:
                context.startActivity(new Intent(context, (Class<?>) HMWeightSettingActivity.class));
                return;
            case 3:
                p(context, hMDeviceSourceFromValue);
                return;
            case 4:
                context.startActivity(new Intent(context, (Class<?>) HMBlueMonkeySettingActivity.class));
                return;
            case 5:
                context.startActivity(new Intent(context, (Class<?>) HMTreadmillSettingActivity.class));
                break;
            case 6:
                break;
            default:
                return;
        }
        if (HMDeviceSource.SHOES_MARS == hMDeviceSourceFromValue) {
            context.startActivity(new Intent(context, (Class<?>) HMNormandySettingActivity.class));
        } else {
            context.startActivity(new Intent(context, (Class<?>) HMShoesSettingActivity.class));
        }
    }

    private static void k(HMDeviceSource hMDeviceSource, HMMiliConfig hMMiliConfig, MiLiHwConfig miLiHwConfig, HealthConfig healthConfig) {
        if (HMDeviceConfig.hasFeatureDND(hMDeviceSource)) {
            miLiHwConfig.silentConfig = fromSilentConfig(hMMiliConfig.getQuietMode());
        }
        if (HMDeviceConfig.hasFeatureG2(hMDeviceSource)) {
            miLiHwConfig.displayItem = new HMProDisplayItem(HMAppSortDataManager.toProDisplay(HMAppSortDataManager.getInstance().getDisplaySetting().get(HMDeviceSource.MILI_PRO)));
        } else {
            miLiHwConfig.displayItem = null;
        }
        if (HMDeviceConfig.hasFeatureDisconnectRemind(hMDeviceSource)) {
            miLiHwConfig.disconnectRemindConfig = fromDisconnectRemindConfigString(hMMiliConfig.getDisconnectRemind());
        }
        if (HMDeviceConfig.hasFeatureReminder(hMDeviceSource)) {
            miLiHwConfig.reminderInfos = EventRemindManager.getEnableReminderInfos();
        }
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_WUHAN;
        if (hMDeviceSource == hMDeviceSource2 || hMDeviceSource == HMDeviceSource.MILI_CHONGQING) {
            miLiHwConfig.enableLockScreen = Boolean.valueOf(fromPropertyBoolStr(DeviceXFunctionsKt.getPropertyStoreApi().getProperty(Property.PROPERTY_LOCK_SCREEN_WUHAN, null)));
        }
        if (HMDeviceConfig.hasFeatureHRAlert()) {
            HMHrReminder hMHrReminder = new HMHrReminder(healthConfig.getUserConfig().getCom.huami.device.feature.health.user.HrDetectSettingConfig.E java.lang.String());
            hMHrReminder.setHr(healthConfig.getUserConfig().getHighWarningValue());
            miLiHwConfig.setHrReminder(hMHrReminder);
        }
        if (HMDeviceConfig.hasFeatureSportHrBroadcast() && HMLoginManager.isAdult()) {
            miLiHwConfig.sportHrBroadcast = Boolean.valueOf(HMSportHRBroadcastConfig.fromJson().getEnable());
        }
        if (HMDeviceConfig.hasFeatureAvoidSpiteBind()) {
            miLiHwConfig.avoidSpiteBinding = Boolean.valueOf(fromAvoidSpiteBindingStr());
        }
        if (v(hMDeviceSource)) {
            OffWistConfig offWistConfig = OffWistConfig.INSTANCE.offWistConfig();
            miLiHwConfig.offWistLockConfig = new HMOffWistLockConfig(offWistConfig.getEnabled(), offWistConfig.getPassword());
        }
        if (hMDeviceSource == hMDeviceSource2) {
            miLiHwConfig.messagePreview = Boolean.valueOf(fromMsgPreviewStr(DeviceXFunctionsKt.getPropertyStoreApi().getProperty(Property.PROPERTY_MESSAGE_PREVIEW, null)));
        }
        if (HMDeviceConfig.hasFeatureBackLight(hMDeviceSource)) {
            miLiHwConfig.backNightInfo = HMNightModeConfig.fromJsonString().generateAutoBacklightInfo();
        }
        miLiHwConfig.dateFormat = getDateFormat(hMDeviceSource);
        if (HMDeviceConfig.hasFeatureCustomVibrate(hMDeviceSource)) {
            miLiHwConfig.vibrateInfos = VibrateRepo.getInstance().getDeviceVibrateEntity();
        }
        if (HMDeviceConfig.supportLibrary() && Language.isSimplifiedChinese()) {
            miLiHwConfig.enableMultiLink = Boolean.valueOf(fromPropertyBoolStr(DeviceXFunctionsKt.getPropertyStoreApi().getProperty("huami.mifit.user.settings.lab.laptopunlock", null)));
        }
        if (HMDeviceConfig.hasFeatureCalendarAndStartDayOfWeek()) {
            miLiHwConfig.calendar = Byte.valueOf(Language.isChinese() ? (byte) 1 : (byte) 0);
            miLiHwConfig.startDayOfWeek = Byte.valueOf((byte) HMCalendarConfig.fromJson().getStartDayOfWeekIndex());
        }
    }

    private static void l(HMDeviceSource source, MiLiHwConfig config, HMPersonInfo personInfo) {
        if (o(source)) {
            HMLiftWristConfig hMLiftWristConfig = new HMLiftWristConfig(true, 1);
            config.liftWristConfig = hMLiftWristConfig;
            config.liftWristSensitivity = Integer.valueOf(hMLiftWristConfig.getSensitivity());
            personInfo.getMiliConfig().setLiftWristTime(toLiftWristConfig(config.liftWristConfig));
            personInfo.getMiliConfig().setLiftWristBrightView(config.liftWristConfig.isEnable());
            return;
        }
        HMMiliConfig miliConfig = personInfo.getMiliConfig();
        if (!ConfigHelperKt.hasFeature(source, com.xiaomi.hm.health.device.deviceconfig.Feature.GT2_SOURCE) || !TextUtils.isEmpty(miliConfig.getLiftWristTime())) {
            config.liftWristConfig = fromLiftWristConfig(miliConfig.isLiftWristBrightView(), miliConfig.getLiftWristTime());
            if (HMDeviceConfig.hasFeatureLiftWristSensitivity(source)) {
                config.liftWristSensitivity = Integer.valueOf(config.liftWristConfig.getSensitivity());
                return;
            }
            return;
        }
        HMLiftWristConfig hMLiftWristConfig2 = new HMLiftWristConfig(true);
        config.liftWristConfig = hMLiftWristConfig2;
        hMLiftWristConfig2.setSensitivity(1);
        config.liftWristSensitivity = 1;
        personInfo.getMiliConfig().setLiftWristTime(toLiftWristConfig(config.liftWristConfig));
        personInfo.getMiliConfig().setLiftWristBrightView(true);
    }

    private static void m(Context context, HMDeviceSource source, MiLiHwConfig config, HMPersonInfo personInfo, HMMiliConfig miliConfig, DeviceInfo deviceInfo) {
        if (HMDeviceConfig.hasFeaturePro(source)) {
            config.userInfoExt = toUserInfoExt(personInfo.getUserInfo());
            config.isMetric = UnitManager.getInstance().isMetric();
            config.is12Hour = !DateFormat.is24HourFormat(DeviceXFunctionsKt.getContext());
            config.displayType = g(miliConfig.getTimePanelType());
            boolean z = false;
            config.showSms = isSupportContactNameForSystemLanguage() && miliConfig.isSmsNameDisplayEnabled();
            if (isSupportContactNameForSystemLanguage() && miliConfig.isIncallNameDisplayEnabled()) {
                z = true;
            }
            config.showIncall = z;
            config.sedentaryConfig = fromSedentaryConfig(miliConfig.getSedentaryRemind());
            l(source, config, personInfo);
            if (o(source)) {
                config.sedentaryConfig = new HMSedentaryConfig(true);
                personInfo.getMiliConfig().setSedentaryRemind(toSedentaryString(config.sedentaryConfig));
                config.goalRemind = true;
                personInfo.getMiliConfig().setGoalRemind(true);
                personInfo.saveInfo(2);
                HMAccountWebExtAPI.updateProfile();
            } else {
                HMSedentaryConfig hMSedentaryConfigFromSedentaryConfig = fromSedentaryConfig(miliConfig.getSedentaryRemind());
                if (LongSitLogicKt.getLongSitMode(source).isStandAlert()) {
                    config.standAlertConfig = StandAlertConfig.toStandAlertConfig(hMSedentaryConfigFromSedentaryConfig);
                } else {
                    config.sedentaryConfig = new HMSedentaryConfig(hMSedentaryConfigFromSedentaryConfig.isEnable(), hMSedentaryConfigFromSedentaryConfig.isPeriodEnable(), hMSedentaryConfigFromSedentaryConfig.getInterval(), hMSedentaryConfigFromSedentaryConfig.getStartIndex(), hMSedentaryConfigFromSedentaryConfig.getStopIndex());
                }
                config.goalRemind = personInfo.getMiliConfig().isGoalRemind();
            }
            config.recordStep = HMKeeper.getMaxSteps();
            config.filpWrist = personInfo.getMiliConfig().isFlipWrist();
            if (HMDeviceConfig.supportLaptopUnLock()) {
                config.enableMultiLink = Boolean.valueOf(fromPropertyBoolStr(DeviceXFunctionsKt.getPropertyStoreApi().getProperty("huami.mifit.user.settings.lab.laptopunlock", null)));
            }
            Feature deviceFeature = deviceInfo != null ? deviceInfo.getDeviceFeature() : null;
            if (deviceFeature != null && deviceFeature.hasSw(1)) {
                config.worldTimes = WorldClockConfig.INSTANCE.getLocaleWorldTimeAndBuiltInCity(context, deviceInfo);
            }
            if (source == HMDeviceSource.MILI_TOKYO) {
                BeepPropertyRepo beepPropertyRepo = BeepPropertyRepo.INSTANCE;
                config.beepItems = beepPropertyRepo.toBeepItem(beepPropertyRepo.getLocaleProperty() == null ? beepPropertyRepo.getDefaultBeeps() : beepPropertyRepo.getLocaleProperty());
            }
            HMNowTimeConfig hMNowTimeConfig = HMNowTimeConfig.INSTANCE;
            if (hMNowTimeConfig.supportNowTime(source, deviceInfo)) {
                config.nowTimeConfig = hMNowTimeConfig.fromNowTimeConfig().toNowTimeConfig();
            }
            config.addRecoverItem(new AssistantRecoverImpl());
            if (HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(20)) {
                config.addRecoverItem(new BtPhoneDelayTimeRecover());
            }
        }
    }

    private static boolean n(String deviceName) {
        return HMDeviceConfig.isWatch(HMMiLiProDevice.nameToSource(deviceName));
    }

    public static HMDeviceSource nameToDeviceSource(String localName) {
        if (TextUtils.isEmpty(localName)) {
            return null;
        }
        HMDeviceSource hMDeviceSourceNameToSource = HMMiLiDevice.nameToSource(localName);
        if (hMDeviceSourceNameToSource == null && (hMDeviceSourceNameToSource = HMMiLiProDevice.nameToSource(localName)) == HMDeviceSource.MILI_CINCO) {
            hMDeviceSourceNameToSource = HMDeviceSource.MILI_CINCO_L;
        }
        return hMDeviceSourceNameToSource == null ? HMAmazfitDevice.nameToSource(localName) : hMDeviceSourceNameToSource;
    }

    private static boolean o(HMDeviceSource deviceSource) {
        return ConfigHelperKt.hasFeature(com.xiaomi.hm.health.device.deviceconfig.Feature.FALCON_SERIES_S, deviceSource) || ConfigHelperKt.hasFeature(com.xiaomi.hm.health.device.deviceconfig.Feature.HAWK_SERIES_S, deviceSource) || ConfigHelperKt.hasFeature(com.xiaomi.hm.health.device.deviceconfig.Feature.KESTREL_SERIES_S, deviceSource);
    }

    private static void p(Context context, HMDeviceSource deviceSource) {
        for (Device device : HMDeviceManager.getDeviceListOrdered()) {
            if (device.getDevice_source().intValue() == deviceSource.getValue()) {
                q(context, device, HMDeviceManager.getInstance().isActive(device));
                break;
            }
        }
        HMLog.i(a, "设备详情跳转：没有找到对应的设备（" + deviceSource + "）", new Object[0]);
    }

    private static void q(Context context, Device device, boolean isActive) {
        if (!isActive) {
            ((DeviceXNavigator) KoinJavaComponent.get(DeviceXNavigator.class)).navigateToUnused(context, device);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(BaseDeviceStatusActivity.KEY_AREA, SelectAreaHelper.getArea().getValue());
        BaseDeviceStatusActivity.invokeDeviceStatusActivity(context, device.getDevice_address(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r(String str) {
        return "fromSedentaryConfig:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s(HMSedentaryConfig hMSedentaryConfig) {
        return "HMSedentaryConfig:" + hMSedentaryConfig;
    }

    public static void saveBaseStep() {
        StepsInfo stepsInfo;
        DaySportData todaySportData = HMDataCacheCenter.getInstance().getTodaySportData();
        if (todaySportData == null || (stepsInfo = todaySportData.getStepsInfo()) == null) {
            HMLog.d(a, "no sport data!!!", new Object[0]);
            return;
        }
        int stepsCount = stepsInfo.getStepsCount();
        HMLog.i(a, "baseStep:" + stepsCount, new Object[0]);
        if (stepsCount > 0) {
            HMKeeper.saveBindBaseStep(new BindBaseStep(stepsCount, System.currentTimeMillis(), HMLoginManager.getThirdId()));
        }
    }

    public static void setShowContactBySystemLanguage(HMMiLiProDevice device, HMPersonInfo personInfo) {
        boolean z = isSupportContactNameForSystemLanguage() && (personInfo.getMiliConfig().isSmsNameDisplayEnabled() || HMDeviceManager.getInstance().hasBound(HMDeviceSource.MILI_PEYTO));
        boolean z2 = isSupportContactNameForSystemLanguage() && (personInfo.getMiliConfig().isIncallNameDisplayEnabled() || BtPhoneDeviceLifeCycle.isBtPhoneEnable());
        device.showContact(HMAlertMode.ALERT_SMS, z, new a(z));
        device.showContact(HMAlertMode.ALERT_INCALL, z2, new b(z2));
    }

    public static void setTimePanelBYSystemLang(HMMiLiProDevice proDevice, final HMPersonInfo personInfo) {
        int systemLang = Utils.getSystemLang();
        HMMiliConfig miliConfig = personInfo.getMiliConfig();
        int timePanelType = miliConfig.getTimePanelType();
        HMDisplayType hMDisplayTypeG = g(timePanelType);
        if (proDevice == null) {
            proDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        }
        if (proDevice != null) {
            proDevice.setDisplayType(hMDisplayTypeG, new c(miliConfig, timePanelType, systemLang, personInfo));
        }
    }

    public static boolean shouldShowPlay(HMDeviceSource deviceSource) {
        return deviceSource.getType() == HMDeviceType.WEIGHT || deviceSource == HMDeviceSource.MILI_PRO || deviceSource == HMDeviceSource.MILI_TEMPO || deviceSource == HMDeviceSource.MILI_WUHAN || deviceSource == HMDeviceSource.EARBUD_CHOPIN;
    }

    public static Boolean supprotContactDefault() {
        return Boolean.valueOf(HMDeviceManager.getInstance().hasBound(HMDeviceSource.MILI_TOKYO));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t(boolean z) {
        return "supportWatchSettings: " + z;
    }

    public static String toAvoidSpiteBindingStr(boolean enable) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", enable);
        } catch (Exception e2) {
            HMLog.i(a, "toAvoidSpiteBindingStr exception: " + e2.getMessage(), new Object[0]);
        }
        return jSONObject.toString();
    }

    public static String toDisconnectRemindConfigString(HMDisconnectRemindConfig config) {
        HMLog.d(a, "toDisconnectRemindConfigString:" + config, new Object[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", config.isEnable());
            jSONObject.put("startIndex", config.getStartIndex());
            jSONObject.put("stopIndex", config.getStopIndex());
        } catch (Exception e2) {
            HMLog.d(a, e2.toString(), new Object[0]);
        }
        return jSONObject.toString();
    }

    public static String toJsonString(ArrayList<HMPaiData> dataArrayList) {
        HMDeviceManager hMDeviceManager;
        if (dataArrayList == null || dataArrayList.size() == 0) {
            return null;
        }
        HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
        HMDeviceManager hMDeviceManager2 = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.WATCH;
        if (hMDeviceSource == hMDeviceManager2.getBoundDeviceSource(hMDeviceType)) {
            hMDeviceManager = HMDeviceManager.getInstance();
            hMDeviceType = HMDeviceType.MILI;
        } else {
            hMDeviceManager = HMDeviceManager.getInstance();
        }
        HMDeviceSource boundDeviceSource = hMDeviceManager.getBoundDeviceSource(hMDeviceType);
        Device bindInfo = hMDeviceSource != boundDeviceSource ? HMDeviceManager.getInstance().getBindInfo(boundDeviceSource.getType()) : null;
        JSONArray jSONArray = new JSONArray();
        try {
            for (HMPaiData hMPaiData : dataArrayList) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userId", HMLoginManager.getHuamiId());
                jSONObject.put("eventType", PaiWebConst.Param.PAI_EVENT_TYPE);
                jSONObject.put("timestamp", getDateTimestamp(hMPaiData.getTime()));
                jSONObject.put("time", hMPaiData.getTime());
                jSONObject.put("timeZone", hMPaiData.getTimezone());
                float[] activityScores = hMPaiData.getActivityScores();
                if (activityScores != null && activityScores.length > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (float f2 : activityScores) {
                        jSONArray2.put(f2);
                    }
                    jSONObject.put("activityScores", jSONArray2.toString());
                }
                jSONObject.put("lowZonePai", hMPaiData.getLowZonePai());
                jSONObject.put("mediumZonePai", hMPaiData.getMediumZonePai());
                jSONObject.put("highZonePai", hMPaiData.getHighZonePai());
                jSONObject.put("lowZoneMinutes", hMPaiData.getLowZoneMinutes());
                jSONObject.put("mediumZoneMinutes", hMPaiData.getMediumZoneMinutes());
                jSONObject.put("highZoneMinutes", hMPaiData.getHighZoneMinutes());
                jSONObject.put("dailyPai", hMPaiData.getDailyPai());
                jSONObject.put("totalPai", hMPaiData.getTotalPai());
                jSONObject.put(Constant.PAI_KEY_RHR, hMPaiData.getRestHr());
                jSONObject.put(Constant.PAI_KEY_MAX_HR, hMPaiData.getMaxHr());
                jSONObject.put("index", hMPaiData.getIndex());
                jSONObject.put("age", hMPaiData.getAge());
                jSONObject.put("gender", hMPaiData.getGender());
                jSONObject.put("version", hMPaiData.getVersion());
                jSONObject.put("uploadTimestamp", System.currentTimeMillis());
                String sn = "";
                jSONObject.put("deviceSource", HMDeviceSource.VDEVICE == boundDeviceSource ? "" : Integer.valueOf(boundDeviceSource.getValue()));
                jSONObject.put("deviceId", bindInfo == null ? "" : bindInfo.getDevice_id());
                if (bindInfo != null) {
                    sn = bindInfo.getSn();
                }
                jSONObject.put("sn", sn);
                jSONObject.put("lowZoneLowerLimit", hMPaiData.getLowZoneLimit());
                jSONObject.put("mediumZoneLowerLimit", hMPaiData.getMediumZoneLimit());
                jSONObject.put("highZoneLowerLimit", hMPaiData.getHighZoneLimit());
                float[] nextActivityScores = hMPaiData.getNextActivityScores();
                if (nextActivityScores != null && nextActivityScores.length > 0) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (float f3 : nextActivityScores) {
                        jSONArray3.put(f3);
                    }
                    jSONObject.put("nextActivityScores", jSONArray3.toString());
                }
                jSONArray.put(jSONObject);
            }
        } catch (Exception unused) {
        }
        return jSONArray.toString();
    }

    public static String toLiftWristConfig(HMLiftWristConfig config) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start", config.getStartTimeIndex());
            jSONObject.put(Command.STOP, config.getStopTimeIndex());
            jSONObject.put("allday", config.isAllDay());
            jSONObject.put("liftWristBrightSpeed", config.getSensitivity());
        } catch (Exception e2) {
            HMLog.d(a, e2.toString(), new Object[0]);
        }
        return jSONObject.toString();
    }

    public static String toMsgPreviewStr(boolean enable) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", enable);
        } catch (Exception e2) {
            HMLog.d(a, e2.toString(), new Object[0]);
        }
        return jSONObject.toString();
    }

    public static String toPropertyBoolStr(boolean enable) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", enable);
        } catch (Exception e2) {
            HMLog.d(a, e2.toString(), new Object[0]);
        }
        return jSONObject.toString();
    }

    public static String toSedentaryString(HMSedentaryConfig config) {
        HMLog.d(a, "HMSedentaryConfig:" + config, new Object[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", config.isEnable());
            jSONObject.put("interval", config.getInterval());
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("enable", config.isPeriodEnable());
            jSONObject2.put("start", config.getDndStart());
            jSONObject2.put(Command.STOP, config.getDndStop());
            jSONArray.put(jSONObject2);
            jSONObject.put("middayRest", jSONArray);
            jSONObject.put("workSt", config.getStartIndex());
            jSONObject.put("workEd", config.getStopIndex());
        } catch (Exception e2) {
            HMLog.i(a, "Exception:" + e2.getMessage(), new Object[0]);
        }
        HMLog.d(a, "toSedentaryString:" + jSONObject.toString(), new Object[0]);
        return jSONObject.toString();
    }

    public static String toSilentJsonString(HMSilentConfig config) {
        HMLog.d(a, "HMSilentConfig:" + config, new Object[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", config.isEnable());
            jSONObject.put("start", config.getStartIndex());
            jSONObject.put(Command.STOP, config.getStopIndex());
            jSONObject.put("enableType", config.isSmart() ? 0 : 1);
            jSONObject.put(h, config.isEnableWristLift());
        } catch (Exception e2) {
            HMLog.i(a, "Exception:" + e2.getMessage(), new Object[0]);
        }
        HMLog.d(a, "toSilentJsonString:" + jSONObject.toString(), new Object[0]);
        return jSONObject.toString();
    }

    public static Locale toSystemLocale(HMLanguage language) {
        if (language == null) {
            return Locale.SIMPLIFIED_CHINESE;
        }
        int language2 = language.getLanguage();
        if (language2 == 2) {
            return Locale.ENGLISH;
        }
        if (language2 == 1) {
            return Locale.TRADITIONAL_CHINESE;
        }
        if (language2 == 0) {
            return Locale.SIMPLIFIED_CHINESE;
        }
        if (language2 == 3) {
            return new Locale(Language.ES);
        }
        if (language2 == 4) {
            return new Locale(Language.RU);
        }
        if (language2 == 5) {
            return Locale.KOREAN;
        }
        if (language2 == 6) {
            return Locale.FRENCH;
        }
        if (language2 == 7) {
            return Locale.GERMAN;
        }
        if (language2 == 10) {
            return Locale.ITALY;
        }
        if (language2 == 8) {
            return new Locale(Language.IN);
        }
        if (language2 == 9) {
            return new Locale(Language.PL);
        }
        if (language2 == 11) {
            return Locale.JAPANESE;
        }
        if (language2 == 16) {
            return new Locale(Language.NL);
        }
        if (language2 == 17) {
            return new Locale(Language.TR);
        }
        if (language2 == 14) {
            return new Locale(Language.VI);
        }
        if (language2 == 13) {
            return new Locale(Language.AR);
        }
        if (language2 == 12) {
            return new Locale(Language.TH);
        }
        if (language2 == 15) {
            return new Locale(Language.PT);
        }
        if (language2 == 18) {
            return new Locale(Language.UK);
        }
        if (language2 == 19) {
            return new Locale(Language.HE);
        }
        return language2 == 20 ? new Locale(Language.PT, Country.BR) : Locale.ENGLISH;
    }

    public static UserInfoExt toUserInfoExt(HMUserInfo userInfo) {
        Calendar calendarDateFormat = Utils.dateFormat(userInfo.getBirthday());
        if (calendarDateFormat == null) {
            HMLog.i(a, "toUserInfoExt return as birthday can't convert to calendar,use default!!!", new Object[0]);
            calendarDateFormat = Calendar.getInstance();
            calendarDateFormat.set(1990, 1, 1);
        }
        short s = (short) calendarDateFormat.get(1);
        if (s >= 9999 || s <= 1900) {
            if (GlobalConfig.get().isBuildInner()) {
                throw new IllegalArgumentException("invalid birth year: " + ((int) s));
            }
            HMLog.i(a, "invalid year: " + ((int) s), new Object[0]);
            s = 1970;
        }
        byte b2 = (byte) (calendarDateFormat.get(2) + 1);
        byte b3 = (byte) calendarDateFormat.get(5);
        UserInfoExt userInfoExt = new UserInfoExt(HMLoginManager.getMiIdIfExistsOrHuamiID(), (short) userInfo.getHeight(), (short) Math.round(userInfo.getWeight()), userInfo.getGender() == 0 ? GenderExt.FEMALE : GenderExt.MALE, new BirthDateExt(s, b2, b3));
        userInfoExt.setWeightFloat(userInfo.getWeight());
        userInfoExt.setNickName(HMPersonInfo.getInstance().getUserInfo().getNickname());
        try {
            long j2 = Long.parseLong(HMPersonInfo.getInstance().getUserInfo().getUserid());
            HMLog.i(a, "huamiId: " + j2, new Object[0]);
            userInfoExt.setHuamiId(j2);
            userInfoExt.setRegisterRegion(SelectAreaHelper.getArea().getValue());
            userInfoExt.setIdc(Short.parseShort(HMLoginManager.getRegion()));
            userInfoExt.setAlias(userInfo.getNickname());
        } catch (Exception e2) {
            HMLog.i(a, "e: " + e2, new Object[0]);
        }
        HMLog.d(a, "infoExt:" + userInfoExt, new Object[0]);
        return userInfoExt;
    }

    public static com.huami.watch.companion.device.Device toWatchDevice(Device mifitDevice) {
        com.huami.watch.companion.device.Device device = new com.huami.watch.companion.device.Device(mifitDevice.getDevice_address(), mifitDevice.getDevice_bind_time().longValue());
        device.setCpuId(mifitDevice.getDevice_id());
        device.info().setBuildNumber(mifitDevice.getFirmware_version());
        device.setLastBindingPlatform(mifitDevice.getLastBindingPlatform());
        device.setActive(false);
        device.setSyncedToCloud(true);
        try {
            String additionalInfo = mifitDevice.getAdditionalInfo();
            if (!TextUtils.isEmpty(additionalInfo)) {
                JSONObject jSONObject = new JSONObject(additionalInfo);
                device.setOverseaEdition(jSONObject.optBoolean("overseaEdition", Config.isLocaleOversea(DeviceXFunctionsKt.getContext())));
                device.setSN(jSONObject.optString("SN"));
                device.info().setHuamiModel(jSONObject.optString("huamiModel"));
                device.info().setHuamiBuildNum(jSONObject.optInt("huamiBuildNum", 0));
                device.info().setAndroidDId(jSONObject.optString("androidDeviceId"));
                device.info().setModelNumber(jSONObject.optString("modelNum"));
                device.info().bleAuthKey = jSONObject.optString(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_AUTH_KEY);
                device.info().bleAuthAppIdMiFit = true;
            }
        } catch (JSONException e2) {
            HMLog.i(a, "toWatchDeviceBindInfo exception:" + e2.getMessage(), new Object[0]);
        }
        return device;
    }

    public static List<PageItem> transFromHMDisplaySetting(@Nullable SortableAppItems setting) {
        if (setting == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < setting.getAppCount(); i2++) {
            AppItem appItem = setting.getAppItem(i2);
            arrayList.add(new PageItem(appItem.getIndex(), appItem.getType(), appItem.getParentType(), !appItem.isEnable()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u(boolean z) {
        return "supportOffWistLock: " + z;
    }

    public static void updateDeviceImg(ImageView imageView, HMDeviceSource deviceSource) {
        int imageForDevice = getImageForDevice(deviceSource);
        if (imageForDevice != -1) {
            imageView.setImageResource(imageForDevice);
        }
    }

    private static boolean v(HMDeviceSource source) {
        HMDeviceType type = source.getType();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (type != hMDeviceType) {
            return false;
        }
        HMBaseBleDevice hMBaseBleDevice = (HMBaseBleDevice) HMDeviceManager.getInstance().getDevice(hMDeviceType);
        if (!(hMBaseBleDevice instanceof HMMiLiProDevice)) {
            return false;
        }
        final boolean zSupportWatchSettings = hMBaseBleDevice.supportWatchSettings();
        HMLog.info(a, new Function0() { // from class: xt2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMDeviceUtils.t(zSupportWatchSettings);
            }
        });
        final boolean z = HMDeviceConfig.hasFeatureOffWistLock(source) || HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(11);
        HMLog.info(a, new Function0() { // from class: wt2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMDeviceUtils.u(z);
            }
        });
        return !zSupportWatchSettings && z;
    }

    private static void w(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static void writePeytoAlarmSettingToPersonInfo(ArrayList<HMPeytoSettings.AlarmSwitch> alarmSwitches) {
        if (alarmSwitches == null || alarmSwitches.size() == 0) {
            return;
        }
        SparseArray<Boolean> sparseArray = new SparseArray<>();
        for (HMPeytoSettings.AlarmSwitch alarmSwitch : alarmSwitches) {
            sparseArray.put(alarmSwitch.getIndex(), Boolean.valueOf(alarmSwitch.isEnable()));
        }
        AlarmClockManager.getInstance().updateAlarmSwitch(sparseArray);
        EventBus.getDefault().post(new HMDeviceAlarmEvent(HMDeviceType.MILI));
    }

    public static void writePeytoSettingToPersonInfo(HMPeytoSettings settings) {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        HMMiliConfig miliConfig = hMPersonInfo.getMiliConfig();
        miliConfig.setLongPressSettings(settings.getLongPressDef());
        miliConfig.setDialSetting(settings.getWatchFaceType());
        writePeytoAlarmSettingToPersonInfo(settings.getAlarmSwitches());
        hMPersonInfo.saveInfo(2);
        HMAccountWebExtAPI.updateProfile();
    }

    private static int x(String color) {
        color.hashCode();
        switch (color) {
            case "ORANGE":
                return HMColorTheme.Color.ORANGE.getValue();
            case "RED":
                return HMColorTheme.Color.RED.getValue();
            case "BLUE":
                return HMColorTheme.Color.BLUE.getValue();
            case "GREEN":
                return HMColorTheme.Color.GREEN.getValue();
            default:
                return HMColorTheme.Color.BLUE.getValue();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static LocationExt y(String location) {
        LocationExt locationExt = new LocationExt();
        location.hashCode();
        switch (location) {
            case "ONBODY":
            case "PENDANT":
                locationExt.setWear(LocationExt.Wear.CHEST);
                locationExt.setWay(LocationExt.Way.OTHER);
                return locationExt;
            case "RIGHT_HAND":
                locationExt.setWear(LocationExt.Wear.WRIST);
                locationExt.setWay(LocationExt.Way.RIGHT);
                return locationExt;
            case "LEFT_HAND":
                locationExt.setWear(LocationExt.Wear.WRIST);
                locationExt.setWay(LocationExt.Way.LEFT);
                return locationExt;
            default:
                return locationExt;
        }
    }

    private static List<PageItem> z(List<SecondaryModel> datas, HMDeviceSource source) {
        if (datas == null || !HMDeviceConfig.hasFeatureSecondaryScreen(source)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < datas.size(); i2++) {
            SecondaryModel secondaryModel = datas.get(i2);
            arrayList.add(new PageItem(secondaryModel.getIndex(), secondaryModel.getType(), secondaryModel.getParentType(), !secondaryModel.isEnable()));
        }
        return arrayList;
    }

    public static String getDeviceDescription(HMDeviceSource source, HMBrandType brandType) {
        return getDeviceDescription(source, brandType, source == HMDeviceSource.MILI_WUHAN ? HMDeviceManager.getInstance().getHardwareVersion(source.getType()) : null);
    }

    public static String getMiLiDeviceDescription(HMDeviceSource miliSource) {
        return getMiLiDeviceDescription(miliSource, miliSource == HMDeviceSource.MILI_WUHAN ? HMDeviceManager.getInstance().getHardwareVersion(miliSource.getType()) : null);
    }

    public static String getDeviceDescription(HMDeviceSource source, HMBrandType brandType, String hardwareVersion) {
        int i2 = d.b[source.ordinal()];
        int deviceDesc = R.string.mijia_device_name;
        if (i2 == 1) {
            deviceDesc = (!HardwareInfo.isYD(hardwareVersion) || Language.isChinese()) ? R.string.mili_settting_mili_wuhan : R.string.mili_settting_mili_wuhan_yd;
        } else if (i2 != 2) {
            deviceDesc = ConfigHelperKt.getDeviceDesc(source);
        } else {
            int i3 = d.a[brandType.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    deviceDesc = R.string.kangnai_device_name;
                } else if (i3 == 3) {
                    deviceDesc = R.string.antelope_device_name;
                }
            }
        }
        return DeviceXFunctionsKt.getContext().getString(deviceDesc);
    }

    public static String getMiLiDeviceDescription(HMDeviceSource miliSource, String hardwareVersion) {
        HMLog.d(a, "getMiLiDeviceDescription:" + hardwareVersion, new Object[0]);
        return getDeviceDescription(miliSource, HMBrandType.BRAND_DEFAULT, hardwareVersion);
    }

    public static String getDeviceDescription(Device device) {
        if (GlobalConfig.get().isBuildMidong() && HMDeviceManager.getInstance().isUseWearCompanionName(device)) {
            return getHuamiDeviceDescription(device);
        }
        String deviceDescription = getDeviceDescription(HMDeviceSource.fromValue(device.getDevice_source().intValue()), HMBrandType.fromValue(device.getBrandType().intValue()));
        String displayName = device.getDisplayName();
        if (TextUtils.isEmpty(displayName)) {
            return deviceDescription;
        }
        return deviceDescription + Constants.ACCEPT_TIME_SEPARATOR_SERVER + displayName;
    }

    public static boolean checkConnectedWatchDevice(Activity activity) {
        List<BluetoothDevice> connectedGattDevice = GattUtils.getConnectedGattDevice(activity);
        if (connectedGattDevice == null || connectedGattDevice.size() == 0) {
            return false;
        }
        HashMap<String, HMDeviceType> boundDevices = HMDeviceManager.getInstance().getBoundDevices(HMDeviceType.MILI);
        ArrayList arrayList = new ArrayList();
        for (BluetoothDevice bluetoothDevice : connectedGattDevice) {
            String bluetoothDeviceName = GattUtils.getBluetoothDeviceName(bluetoothDevice);
            if (!TextUtils.isEmpty(bluetoothDeviceName) && n(bluetoothDeviceName) && (boundDevices == null || boundDevices.size() <= 0 || boundDevices.get(bluetoothDevice.getAddress()) == null)) {
                if (HMMiLiDevice.isSupportDeviceName(bluetoothDeviceName) || HMMiLiProDevice.isSupportDeviceName(bluetoothDeviceName) || HMAmazfitDevice.isSupportDeviceName(bluetoothDeviceName)) {
                    arrayList.add(bluetoothDevice);
                }
            }
        }
        if (arrayList.size() == 0) {
            return false;
        }
        activity.finish();
        HMSelectBoundMiliActivity.show(activity, arrayList, 24);
        return true;
    }

    public static String getDeviceDescription(Context context, HMDeviceSource source, String modelName) {
        HMLog.i("[水印]", "source: " + source + ", modelName: " + modelName, new Object[0]);
        if (source.getType() == HMDeviceType.WATCH) {
            return DeviceSource.getDeviceNameBySource(context, source.getValue(), modelName);
        }
        return getDeviceDescription(source, HMBrandType.BRAND_DEFAULT);
    }

    @MainThread
    public static void jumpToDeviceDetailPage(Context context, int sourceValue, String jumpSource) {
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(sourceValue);
        HMLog.d(a, "source: " + hMDeviceSourceFromValue, new Object[0]);
        if (HMDeviceSource.VDEVICE == hMDeviceSourceFromValue) {
            HMLog.d(a, "source invalid!", new Object[0]);
        }
        if (HMDeviceType.HEADSET == hMDeviceSourceFromValue.getType()) {
            HMDeviceManager.getDeviceListOrdered();
            List<Device> deviceListOrdered = HMDeviceManager.getDeviceListOrdered();
            if (deviceListOrdered != null) {
                deviceListOrdered.size();
            }
            for (Device device : deviceListOrdered) {
                if (HMDeviceType.fromValue(device.getDevice_type().intValue()) == HMDeviceType.HEADSET) {
                    HMLog.d(a, "device ::;source ::" + device.getDevice_source(), new Object[0]);
                    HMHeadsetSettingActivity.start(context, device.getDevice_address());
                    return;
                }
            }
        }
        if (!HMDeviceManager.getInstance().hasBound(hMDeviceSourceFromValue)) {
            HMLog.d(a, "not bound!", new Object[0]);
            w(context, new Intent(context, (Class<?>) MainTabActivity.class).putExtra("tab_index", 3));
            return;
        }
        switch (d.c[hMDeviceSourceFromValue.getType().ordinal()]) {
            case 1:
                if (ConfigHelperKt.hasFeature(com.xiaomi.hm.health.device.deviceconfig.Feature.SUPPORT_NEW_DEVICE_SETTING, hMDeviceSourceFromValue)) {
                    w(context, new Intent(context, (Class<?>) DeviceSettingActivity.class));
                } else {
                    w(context, new Intent(context, (Class<?>) HMMiLiSettingActivity.class).putExtra("source", jumpSource));
                }
                break;
            case 2:
                w(context, new Intent(context, (Class<?>) HMWeightSettingActivity.class).putExtra("source", jumpSource));
                break;
            case 3:
                p(context, hMDeviceSourceFromValue);
                break;
            case 4:
                w(context, new Intent(context, (Class<?>) HMBlueMonkeySettingActivity.class).putExtra("source", jumpSource));
                break;
            case 5:
                w(context, new Intent(context, (Class<?>) HMTreadmillSettingActivity.class).putExtra("source", jumpSource));
                break;
            case 6:
                if (HMDeviceSource.SHOES_MARS == hMDeviceSourceFromValue) {
                    w(context, new Intent(context, (Class<?>) HMNormandySettingActivity.class).putExtra("source", jumpSource));
                } else {
                    w(context, new Intent(context, (Class<?>) HMShoesSettingActivity.class).putExtra("source", jumpSource));
                }
                break;
        }
    }
}
