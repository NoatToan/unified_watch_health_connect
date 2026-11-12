package com.xiaomi.hm.health.bt.sdk;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseBooleanArray;
import com.huami.bluetooth.feature.sleep.SleepDataSource;
import com.huami.bluetooth.profile.channel.module.MenstruationModule;
import com.huami.bluetooth.profile.channel.module.OtaModule;
import com.huami.bluetooth.profile.channel.module.WiFiControllerModule;
import com.huami.bluetooth.profile.channel.module.WorldClockModule;
import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi;
import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyModule;
import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayBean;
import com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayListSettingModule;
import com.huami.bluetooth.profile.channel.module.health.HeartHealthApi;
import com.huami.bluetooth.profile.channel.module.notification.NotificationModule;
import com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleModule;
import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.voice.AiVoiceModule;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.bluetooth.profile.channel.module.voice.VoiceModule;
import com.huami.bluetooth.profile.channel.module.voice.content.ListContent;
import com.huami.bluetooth.profile.ecf.data.HidStatus;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.mi.health.sleep.SleepDataHelperKt;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.hm.health.bletool.device.firmware.ISyncAgpsCallback;
import com.xiaomi.hm.health.bt.ISBEListener;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import com.xiaomi.hm.health.bt.model.HMCardTSResponse;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertApp;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.HighOrLowHrNotificationData;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.RestHeartRate;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmAfData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.LowOsaNotificationData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstrualNotifiedData;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstrualPeriodData;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationConfig;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecord;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.bt.profile.nfc.ApduRequest;
import com.xiaomi.hm.health.bt.profile.nfc.ApduResponse;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardConfig;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardStatus;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardType;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCStatus;
import com.xiaomi.hm.health.bt.profile.nfc.PasswordInteractionResponse;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.IHMFirstbeatDataCallback;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportKind;
import com.xiaomi.hm.health.bt.profile.sport.SportTemperature;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeConfig;
import com.xiaomi.hm.health.bt.profile.weather.HMWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherModule;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting;
import com.xiaomi.hm.health.bt.profile.worldclock.WorldTime;
import com.xiaomi.hm.health.bt.sdk.HuamiDevice;
import com.xiaomi.hm.health.bt.sdk.data.DeviceBatteryInfo;
import com.xiaomi.hm.health.bt.sdk.data.GpsState;
import com.xiaomi.hm.health.bt.sdk.data.HrData;
import com.xiaomi.hm.health.bt.sdk.data.HrDataResult;
import com.xiaomi.hm.health.bt.sdk.data.HrFreq;
import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import com.xiaomi.hm.health.bt.sdk.data.PaiDataResult;
import com.xiaomi.hm.health.bt.sdk.data.RealtimeData;
import com.xiaomi.hm.health.bt.sdk.data.ShortcutItem;
import com.xiaomi.hm.health.bt.sdk.data.SleepManualData;
import com.xiaomi.hm.health.bt.sdk.data.SportData;
import com.xiaomi.hm.health.bt.sdk.data.VibrateType;
import com.xiaomi.hm.health.bt.sdk.fw.FwType;
import com.xiaomi.hm.health.bt.sdk.fw.IFirmwareInvokeCallback;
import com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback;
import com.xiaomi.hm.health.bt.sdk.fw.IUpgradeCallback;
import com.xiaomi.hm.health.bt.sdk.pai.PaiGoalData;
import com.xiaomi.hm.health.bt.sdk.proxy.RequestInterceptor;
import com.xiaomi.hm.health.bt.sdk.voice.QuietMode;
import com.xiaomi.hm.health.bt.sdk.voice.WeatherItem;
import defpackage.AlertItem;
import defpackage.C3623t;
import defpackage.DialVersion;
import defpackage.ah;
import defpackage.bt;
import defpackage.c0t;
import defpackage.chs;
import defpackage.dts;
import defpackage.eb;
import defpackage.ews;
import defpackage.fd;
import defpackage.fn;
import defpackage.g4s;
import defpackage.g8;
import defpackage.h2t;
import defpackage.h3t;
import defpackage.h7;
import defpackage.h8;
import defpackage.hws;
import defpackage.ict;
import defpackage.ih;
import defpackage.ik;
import defpackage.ivs;
import defpackage.j3t;
import defpackage.j7;
import defpackage.jdt;
import defpackage.jr;
import defpackage.jys;
import defpackage.k3t;
import defpackage.kdt;
import defpackage.ket;
import defpackage.ki;
import defpackage.kk;
import defpackage.kvs;
import defpackage.l7t;
import defpackage.le;
import defpackage.lh;
import defpackage.ln;
import defpackage.lu;
import defpackage.lxs;
import defpackage.m9;
import defpackage.n1t;
import defpackage.n5;
import defpackage.ne;
import defpackage.njs;
import defpackage.om;
import defpackage.ph;
import defpackage.pw;
import defpackage.px;
import defpackage.q1t;
import defpackage.q9;
import defpackage.qd;
import defpackage.qos;
import defpackage.r3t;
import defpackage.r6t;
import defpackage.rg;
import defpackage.rt;
import defpackage.rys;
import defpackage.s4t;
import defpackage.sd;
import defpackage.sg;
import defpackage.t5t;
import defpackage.ta;
import defpackage.td;
import defpackage.tdt;
import defpackage.tet;
import defpackage.ua;
import defpackage.ubt;
import defpackage.udt;
import defpackage.um;
import defpackage.uq;
import defpackage.vj;
import defpackage.vv;
import defpackage.vw;
import defpackage.vzs;
import defpackage.w1t;
import defpackage.w7;
import defpackage.wbt;
import defpackage.wg;
import defpackage.wk;
import defpackage.wt;
import defpackage.xct;
import defpackage.xd;
import defpackage.xp;
import defpackage.ycs;
import defpackage.yd;
import defpackage.zjs;
import defpackage.zos;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class HuamiDevice implements dts, IHMConnectionCallback {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static int AUTH = 1;
    public static int AUTH_FAILED = 5;
    public static final int BATTERY_LEVEL_ERROR = -1;
    public static int CONNECT = 0;
    public static int CONNECTED = 2;
    public static int CONNECTING = 1;
    public static int CONNECTING_TIMEOUT = 0;
    public static final int COUNT_LIMIT = 5;
    private static final int DELETE_MESSAGE_LENGTH = 4;
    public static int DENY = 4;
    private static final int DIAL_ID_INDEX_START = 18;
    private static final int DIAL_SIZE_INDEX_END = 25;
    private static final int DIAL_SIZE_INDEX_START = 22;
    private static final int DIGIT_ONE = 1;
    private static final int DIGIT_ZERO = 0;
    public static int DISCONNECTED = 3;
    public static int FAILED = 1;
    public static int KNOCK = 2;
    public static int KNOCK_SUCCESS = 3;
    private static final int MASK_VALUE = 255;
    public static final int MAX_PACE_SECOND = 1800;
    private static final byte MI_WEAR = 2;
    public static final int MODE_ACTIVITY = 1;
    public static final int MODE_STAND = 0;
    private static final byte OFF_WRIST_LOCK_CLOSED = 0;
    private static final byte OFF_WRIST_LOCK_OPENED = 1;
    public static final int OFF_WRIST_LOCK_STATE_ERROR = 0;
    public static final int OFF_WRIST_LOCK_STATE_SAVE_CLOUD = 1;
    public static final int OFF_WRIST_LOCK_STATE_SAVE_DEVICE_CLOSED = 3;
    public static final int OFF_WRIST_LOCK_STATE_SAVE_DEVICE_OPENED = 2;
    public static int SCAN_FAIL = 4;
    private static final int SPORT_LENGTH = 3;
    public static int SUCCESS = 0;
    private static final String TAG = "HuamiDevice";
    private static final int TYPE_DAILY = 0;
    public static final String VERSION_NAME = "android_245";
    private IDeviceBaseCallback deviceCallback;
    public ne hmMiLiProDevice;
    private vj lfEventAdapterManager;
    private Context mContext;
    private chs phoneMuteListener;
    private ah proxySetter;
    private IUpgradeCallback upgradeCallback;
    private VoiceConfig voiceConfig;

    public enum CardType {
        CARD_DEFAULT,
        CARD_BANK,
        CARD_TRAFFIC,
        CARD_ACCESS
    }

    public class a extends HMCallback<Boolean> {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            t5t.d(HuamiDevice.TAG, "alertMiuiAlarm result: " + z);
        }
    }

    public class a0 extends HMCallback<MenstruationTotalRecord> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f13483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13484b;

        public a0(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f13483a = atomicReference;
            this.f13484b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFinish(MenstruationTotalRecord menstruationTotalRecord) {
            super.onFinish(menstruationTotalRecord);
            this.f13483a.set(menstruationTotalRecord);
            this.f13484b.countDown();
        }
    }

    public class a1 extends HMCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13486b;

        public a1(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13485a = atomicBoolean;
            this.f13486b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13485a.set(z);
            this.f13486b.countDown();
        }
    }

    public class b extends HMCallback<Boolean> {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            t5t.d(HuamiDevice.TAG, "notify app info result: " + z);
        }
    }

    public class b0 extends HMCallback<MenstruationConfig> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f13488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13489b;

        public b0(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f13488a = atomicReference;
            this.f13489b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFinish(MenstruationConfig menstruationConfig) {
            super.onFinish(menstruationConfig);
            this.f13488a.set(menstruationConfig);
            this.f13489b.countDown();
        }
    }

    public class b1 extends HMCallback<List<LowOsaNotificationData>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f13490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13491b;

        public b1(List list, CountDownLatch countDownLatch) {
            this.f13490a = list;
            this.f13491b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(List<LowOsaNotificationData> list) {
            super.onData(list);
            if (list != null) {
                this.f13490a.addAll(list);
            }
            this.f13491b.countDown();
        }
    }

    public class c extends HMCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13493b;

        public c(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13492a = atomicBoolean;
            this.f13493b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13492a.set(z);
            this.f13493b.countDown();
        }
    }

    public class c0 extends HMCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13495b;

        public c0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13494a = atomicBoolean;
            this.f13495b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13494a.set(z);
            this.f13495b.countDown();
        }
    }

    public class c1 implements zos {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IDailyDataSyncCallback f13496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f13497b;
        public final /* synthetic */ AtomicInteger c;
        public final /* synthetic */ CountDownLatch d;

        public c1(IDailyDataSyncCallback iDailyDataSyncCallback, AtomicReference atomicReference, AtomicInteger atomicInteger, CountDownLatch countDownLatch) {
            this.f13496a = iDailyDataSyncCallback;
            this.f13497b = atomicReference;
            this.c = atomicInteger;
            this.d = countDownLatch;
        }

        @Override // defpackage.zos
        public void a() {
            t5t.m(HuamiDevice.TAG, "onSyncStart");
        }

        @Override // defpackage.zos
        public void a(Progress progress) {
            t5t.m(HuamiDevice.TAG, "onSyncProgress:" + progress);
        }

        @Override // defpackage.zos
        public void a(List<k3t> list) {
            t5t.m(HuamiDevice.TAG, "onSyncStop");
            t5t.d(HuamiDevice.TAG, "getDailyData sync time end:" + System.currentTimeMillis());
            IDailyDataSyncCallback iDailyDataSyncCallback = this.f13496a;
            if (iDailyDataSyncCallback != null) {
                iDailyDataSyncCallback.onActivityDataSyncFinish();
            }
            this.f13497b.set(list);
        }

        @Override // defpackage.zos
        public void a(tdt tdtVar) {
            t5t.m(HuamiDevice.TAG, "onSyncFinish:" + tdtVar);
            this.c.set(tdtVar.getError());
            this.d.countDown();
        }
    }

    public class d extends HMCallback<Boolean> {
        public d() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFinish(Boolean bool) {
            super.onFinish(bool);
            t5t.d(HuamiDevice.TAG, "notify call info result: " + bool);
        }
    }

    public class d0 extends HMCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13500b;

        public d0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13499a = atomicBoolean;
            this.f13500b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13499a.set(z);
            this.f13500b.countDown();
        }
    }

    public static /* synthetic */ class d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13502b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[CardType.values().length];
            d = iArr;
            try {
                iArr[CardType.CARD_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[CardType.CARD_BANK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[CardType.CARD_TRAFFIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[CardType.CARD_ACCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ik.values().length];
            c = iArr2;
            try {
                iArr2[ik.ALARM_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[ik.SETTINGS_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[ik.SPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[ik.IGNORE_CALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[ik.END_CALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[ik.MUTE_PHONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[ik.ILLEGAL_BIND.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                c[ik.REMINDER_CHANGED.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                c[ik.FIND_PHONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                c[ik.STOP_FIND_PHONE.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                c[ik.MUSIC_CONTROL.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                c[ik.HEART_RATE_ALL_DAY.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                c[ik.DELETE_MSG.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                c[ik.HEART_RATE_DETECTION_INTERVAL.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                c[ik.ALL_DAY_PRESSURE_CHANGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                c[ik.ATRIAL_FIB_CHANGED.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                c[ik.ALARM_CANCEL.ordinal()] = 17;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                c[ik.ALARM_DELAY.ordinal()] = 18;
            } catch (NoSuchFieldError unused22) {
            }
            int[] iArr3 = new int[QuietMode.values().length];
            f13502b = iArr3;
            try {
                iArr3[QuietMode.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f13502b[QuietMode.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr4 = new int[wt.values().length];
            f13501a = iArr4;
            try {
                iArr4[wt.CONNECTING_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f13501a[wt.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f13501a[wt.AUTH_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f13501a[wt.SCAN_FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f13501a[wt.AUTH_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    public class e extends HMCallback<Boolean> {
        public e() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            t5t.d(HuamiDevice.TAG, "notify hang up info result: " + z);
        }
    }

    public class e0 implements Function1<MenstrualNotifiedData, Unit> {
        public final /* synthetic */ IMenstrualNotifiedDataCallback t;

        public e0(IMenstrualNotifiedDataCallback iMenstrualNotifiedDataCallback) {
            this.t = iMenstrualNotifiedDataCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke2(MenstrualNotifiedData menstrualNotifiedData) {
            this.t.onResult(menstrualNotifiedData);
            return null;
        }
    }

    public class e1 extends HMCallback<UserInfoExt> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f13504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13505b;

        public e1(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f13504a = atomicReference;
            this.f13505b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(UserInfoExt userInfoExt) {
            super.onData(userInfoExt);
            this.f13504a.set(userInfoExt);
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13505b.countDown();
        }
    }

    public class f extends HMCallback<Boolean> {
        public f() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            t5t.d(HuamiDevice.TAG, "notify sms info result: " + z);
        }
    }

    public class f0 extends HMCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13508b;

        public f0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13507a = atomicBoolean;
            this.f13508b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13507a.set(z);
            this.f13508b.countDown();
        }
    }

    public class f1 extends HMCallback {
        public f1() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            t5t.d(HuamiDevice.TAG, "setGoal:" + z);
        }
    }

    public class g extends HMCallback<Boolean> {
        public g() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            t5t.d(HuamiDevice.TAG, "notify hongbao info result: " + z);
        }
    }

    public class g0 extends HMCallback<Integer> {
        public g0() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            HuamiDevice.this.upgradeCallback.onFinish(z);
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onProgress(Progress progress) {
            HuamiDevice.this.upgradeCallback.onProgress(progress);
        }
    }

    public class g1 extends HMCallback<List<GpsRecord>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IHMSportDataCallback f13512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DeviceInfoExt f13513b;

        public g1(IHMSportDataCallback iHMSportDataCallback, DeviceInfoExt deviceInfoExt) {
            this.f13512a = iHMSportDataCallback;
            this.f13513b = deviceInfoExt;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(List<GpsRecord> list) {
            super.onData(list);
            this.f13512a.setDeviceInfoExt(this.f13513b);
            this.f13512a.onData(list);
            t5t.d(HuamiDevice.TAG, "startSyncGpsData end:" + System.currentTimeMillis());
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13512a.onFinish(z);
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onProgress(Progress progress) {
            super.onProgress(progress);
            this.f13512a.onProgress(progress);
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onStart() {
            this.f13512a.onStart();
        }
    }

    public class h extends HMCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ISkinStorageStatusCallback f13514a;

        public h(ISkinStorageStatusCallback iSkinStorageStatusCallback) {
            this.f13514a = iSkinStorageStatusCallback;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            this.f13514a.onMemory(z);
        }
    }

    public class h0 extends HMCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13517b;

        public h0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13516a = atomicBoolean;
            this.f13517b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13516a.set(z);
            this.f13517b.countDown();
        }
    }

    public class h1 extends HMCallback<Boolean> {
        public h1() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            t5t.d(HuamiDevice.TAG, "alertMiuiAlarm result: " + z);
        }
    }

    public class i implements jys {
        public final /* synthetic */ ISyncSkinCallback t;

        public i(ISyncSkinCallback iSyncSkinCallback) {
            this.t = iSyncSkinCallback;
        }

        @Override // defpackage.jys
        public void a(int i) {
            this.t.onStart();
        }

        @Override // defpackage.jys
        public void onFwProgress(Progress progress) {
            this.t.onProgress(progress);
        }

        @Override // defpackage.jys
        public void onFwStop(boolean z) {
            if (z) {
                this.t.onStop(0);
            } else {
                this.t.onStop(4);
            }
        }
    }

    public class i0 extends HMCallback<ArrayList<udt>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ISyncPaiCallback f13519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserInfoExt f13520b;

        public i0(ISyncPaiCallback iSyncPaiCallback, UserInfoExt userInfoExt) {
            this.f13519a = iSyncPaiCallback;
            this.f13520b = userInfoExt;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFinish(ArrayList<udt> arrayList) {
            if (arrayList == null) {
                this.f13519a.onFinish(null);
                return;
            }
            ArrayList<PaiData> arrayList2 = new ArrayList<>();
            for (udt udtVar : arrayList) {
                PaiData paiData = new PaiData();
                paiData.setActivityScores(udtVar.e());
                paiData.setAge(udtVar.f());
                paiData.setDaily(udtVar.k() == 0.0f);
                paiData.setGender(udtVar.n());
                paiData.setHighZoneLimit(udtVar.q());
                paiData.setHighZoneMinutes(udtVar.t());
                paiData.setIndex(udtVar.x());
                paiData.setLowZoneLimit(udtVar.z());
                paiData.setLowZoneMinutes(udtVar.B());
                paiData.setMediumZoneLimit(udtVar.H());
                paiData.setMediumZoneMinutes(udtVar.J());
                paiData.setTime(udtVar.P());
                paiData.setTimezone(udtVar.Q());
                paiData.setVersion(udtVar.T());
                paiData.setLowZonePai(udtVar.D());
                paiData.setMediumZonePai(udtVar.L());
                paiData.setHighZonePai(udtVar.v());
                paiData.setDailyPai(udtVar.k());
                paiData.setTotalPai(udtVar.R());
                paiData.setRestHr(udtVar.O());
                paiData.setMaxHr(udtVar.F());
                paiData.setNextActivityScores(udtVar.M());
                arrayList2.add(paiData);
            }
            PaiDataResult paiDataResult = new PaiDataResult();
            paiDataResult.setList(arrayList2);
            paiDataResult.setUserInfoExt(this.f13520b);
            this.f13519a.onFinish(paiDataResult);
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onProgress(Progress progress) {
            this.f13519a.onProgress(progress);
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onStart() {
            this.f13519a.onStart();
        }
    }

    public class j extends HMCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13521a;

        public j(AtomicBoolean atomicBoolean) {
            this.f13521a = atomicBoolean;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13521a.set(z);
            t5t.d(HuamiDevice.TAG, "sportConfig result：" + z);
        }
    }

    public class j0 implements ki {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ISyncPressureDataSingleCallback f13523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f13524b;
        public final /* synthetic */ DeviceInfoExt c;

        public j0(ISyncPressureDataSingleCallback iSyncPressureDataSingleCallback, long j, DeviceInfoExt deviceInfoExt) {
            this.f13523a = iSyncPressureDataSingleCallback;
            this.f13524b = j;
            this.c = deviceInfoExt;
        }

        @Override // defpackage.ki
        public void a(@NotNull ArrayList<HMPressureData> arrayList) {
            this.f13523a.onPressureData(h2t.d(this.f13524b, this.c, arrayList));
        }

        @Override // defpackage.ki
        public void onPressureStart() {
            this.f13523a.onPressureStart();
        }

        @Override // defpackage.ki
        public void onPressureStop(boolean z) {
            this.f13523a.onPressureStop(z);
        }
    }

    public class k implements defpackage.w0 {
        @Override // defpackage.w0
        @NotNull
        public HashMap<String, qd> a() {
            return new HashMap<>();
        }

        @Override // defpackage.w0
        @NotNull
        public HashMap<String, qd> b() {
            HashMap<String, qd> map = new HashMap<>();
            qd qdVar = qd.o1;
            map.put(Product.KONG_MING_NAME_2, qdVar);
            map.put("KongmingPro", qdVar);
            return map;
        }
    }

    public class k0 implements ki {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ISyncPressureDataAllDayCallback f13525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f13526b;
        public final /* synthetic */ DeviceInfoExt c;

        public k0(ISyncPressureDataAllDayCallback iSyncPressureDataAllDayCallback, long j, DeviceInfoExt deviceInfoExt) {
            this.f13525a = iSyncPressureDataAllDayCallback;
            this.f13526b = j;
            this.c = deviceInfoExt;
        }

        @Override // defpackage.ki
        public void a(@NotNull ArrayList<HMPressureData> arrayList) {
            this.f13525a.onPressureData(h2t.a(this.f13526b, this.c, arrayList));
        }

        @Override // defpackage.ki
        public void onPressureStart() {
            this.f13525a.onPressureStart();
        }

        @Override // defpackage.ki
        public void onPressureStop(boolean z) {
            this.f13525a.onPressureStop(z);
        }
    }

    public class l extends HMCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13527a;

        public l(AtomicBoolean atomicBoolean) {
            this.f13527a = atomicBoolean;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13527a.set(z);
            t5t.d(HuamiDevice.TAG, "sendSportNoTimerConfig result：" + z);
        }
    }

    public class l0 extends HMCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13530b;

        public l0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13529a = atomicBoolean;
            this.f13530b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13529a.set(z);
            this.f13530b.countDown();
        }
    }

    public class m extends HMCallback {
        public m() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
        }
    }

    public class m0 extends HMCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13533b;

        public m0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13532a = atomicBoolean;
            this.f13533b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13532a.set(z);
            this.f13533b.countDown();
        }
    }

    public class n extends HMCallback {
        public n() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
        }
    }

    public class n0 extends HMCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13536b;

        public n0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13535a = atomicBoolean;
            this.f13536b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13535a.set(z);
            this.f13536b.countDown();
        }
    }

    public class o implements ih {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IVoiceCallback f13537a;

        public o(IVoiceCallback iVoiceCallback) {
            this.f13537a = iVoiceCallback;
        }

        @Override // defpackage.ih
        public void a(@NotNull List<AlertItem> list) {
        }

        @Override // defpackage.ih
        public void onAudioData(@NotNull byte[] bArr) {
            this.f13537a.onAudioData(bArr);
        }

        @Override // defpackage.ih
        public void onStartSession(@NotNull VoiceConfig voiceConfig) {
            this.f13537a.onStartSession(voiceConfig);
            HuamiDevice.this.voiceConfig = voiceConfig;
        }

        @Override // defpackage.ih
        public void onStopSession() {
            this.f13537a.onStopSession();
            HuamiDevice.this.voiceConfig = null;
        }

        @Override // defpackage.ih
        public void a(@NotNull AlertItem alertItem) {
        }
    }

    public class o0 extends HMCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13540b;

        public o0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13539a = atomicBoolean;
            this.f13540b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            t5t.d(HuamiDevice.TAG, "setVibrateWithTest onFinish: " + z);
            this.f13539a.set(z);
            this.f13540b.countDown();
        }
    }

    public class p extends HMCallback<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13542b;

        public p(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13541a = atomicBoolean;
            this.f13542b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFinish(Integer num) {
            super.onFinish(num);
            this.f13541a.set(num.intValue() == 0);
            this.f13542b.countDown();
        }
    }

    public class p0 extends HMCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13544b;

        public p0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13543a = atomicBoolean;
            this.f13544b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13543a.set(z);
            this.f13544b.countDown();
        }
    }

    public class q extends HMCallback {
        public q() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
        }
    }

    public class q0 extends HMCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13547b;

        public q0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13546a = atomicBoolean;
            this.f13547b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13546a.set(z);
            this.f13547b.countDown();
        }
    }

    public class r extends HMCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13549b;

        public r(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13548a = atomicBoolean;
            this.f13549b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13548a.set(z);
            this.f13549b.countDown();
        }
    }

    public class r0 implements c0t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f13550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13551b;

        public r0(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f13550a = atomicReference;
            this.f13551b = countDownLatch;
        }

        @Override // defpackage.c0t
        public void a() {
            t5t.m(HuamiDevice.TAG, "onSyncStart");
        }

        @Override // defpackage.c0t
        public void a(ArrayList<vzs> arrayList) {
            for (vzs vzsVar : arrayList) {
                ((HrDataResult) this.f13550a.get()).addData(new HrData(vzsVar.b(), vzsVar.a()));
            }
        }

        @Override // defpackage.c0t
        public void a(boolean z) {
            ((HrDataResult) this.f13550a.get()).setSuccess(z);
            this.f13551b.countDown();
        }
    }

    public class s0 extends HMCallback<ubt> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IBatteryChangeCallback f13554a;

        public s0(IBatteryChangeCallback iBatteryChangeCallback) {
            this.f13554a = iBatteryChangeCallback;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(ubt ubtVar) {
            if (ubtVar == null) {
                this.f13554a.onBatteryInfo(null);
            } else {
                this.f13554a.onBatteryInfo(HuamiDevice.this.getDeviceBatteryInfo(ubtVar));
            }
        }
    }

    public class t extends HMCallback {
        public t() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
        }
    }

    public class t0 extends sg {
        public final /* synthetic */ IAtrialFibCallback c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(int i, IAtrialFibCallback iAtrialFibCallback) {
            super(i);
            this.c = iAtrialFibCallback;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            this.c.onResult(z);
        }

        @Override // defpackage.yg
        public void a(List<? extends HmAfData> list) {
            this.c.onResultData(list);
        }
    }

    public class u extends HMCallback {
        public u() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
        }
    }

    public class u0 extends HMCallback {
        public u0() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            t5t.d(HuamiDevice.TAG, "enableConnectedAdv:" + z);
        }
    }

    public class v extends HMCallback<ycs> {
        public v() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(ycs ycsVar) {
            t5t.d(HuamiDevice.TAG, "RealtimeStep:" + ycsVar);
            IDeviceBaseCallback iDeviceBaseCallback = HuamiDevice.this.deviceCallback;
            if (iDeviceBaseCallback != null) {
                iDeviceBaseCallback.onStepChanged(ycsVar.h());
            }
        }
    }

    public class v0 extends HMCallback {
        public v0() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            t5t.d(HuamiDevice.TAG, "enableHrBroadcast:" + z);
        }
    }

    public class w extends HMCallback {
        public w() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
        }
    }

    public class w0 extends HMCallback<List<ActivityData>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbsActivityTodayCallback f13562a;

        public w0(AbsActivityTodayCallback absActivityTodayCallback) {
            this.f13562a = absActivityTodayCallback;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(List<ActivityData> list) {
            this.f13562a.onDataPulled((ArrayList) list);
        }
    }

    public class x extends HMCallback<ket> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ILFEventCallback f13564a;

        public x(ILFEventCallback iLFEventCallback) {
            this.f13564a = iLFEventCallback;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(ket ketVar) {
            super.onData(ketVar);
            if (ketVar == null) {
                this.f13564a.onSettingsChange(null);
                return;
            }
            ArrayList<ket.a> arrayListA = ketVar.a();
            if (arrayListA == null) {
                this.f13564a.onSettingsChange(null);
                return;
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (ket.a aVar : arrayListA) {
                sparseBooleanArray.put(aVar.a(), aVar.b());
            }
            this.f13564a.onSettingsChange(sparseBooleanArray);
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
        }
    }

    public class x0 extends HMCallback<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbsActivityTodayCallback f13566a;

        public x0(AbsActivityTodayCallback absActivityTodayCallback) {
            this.f13566a = absActivityTodayCallback;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFinish(Integer num) {
            this.f13566a.onDataPushed(num);
        }
    }

    public class y implements kvs.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ISportHrCallback f13568a;

        public y(ISportHrCallback iSportHrCallback) {
            this.f13568a = iSportHrCallback;
        }

        @Override // kvs.b
        public void onHeartRateChanged(int i) {
            this.f13568a.onHeartRateChanged(i);
        }

        @Override // kvs.b
        public void onOpen(boolean z) {
            this.f13568a.onOpen(z);
        }
    }

    public class y0 extends HMCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13571b;

        public y0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13570a = atomicBoolean;
            this.f13571b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13570a.set(z);
            this.f13571b.countDown();
        }
    }

    public class z extends HMCallback<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f13572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13573b;

        public z(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f13572a = atomicBoolean;
            this.f13573b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            this.f13572a.set(z);
            this.f13573b.countDown();
        }
    }

    public class z0 extends HMCallback<List<HighOrLowHrNotificationData>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f13574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f13575b;

        public z0(List list, CountDownLatch countDownLatch) {
            this.f13574a = list;
            this.f13575b = countDownLatch;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(List<HighOrLowHrNotificationData> list) {
            super.onData(list);
            if (list != null) {
                this.f13574a.addAll(list);
            }
            this.f13575b.countDown();
        }
    }

    public HuamiDevice(Context context, String str) {
        this(context, str, (byte) 0);
    }

    private boolean alert(ivs ivsVar) {
        if (isConnected()) {
            return this.hmMiLiProDevice.j1(ivsVar);
        }
        return false;
    }

    private String assembleDialWithColor(String str, byte[] bArr) {
        try {
            qd qdVarI = this.hmMiLiProDevice.O().I();
            if (td.f34581a.b(qdVarI)) {
                h8.d.a(this.hmMiLiProDevice.d4());
            }
            return w7.f37676a.a(qdVarI, null, bArr).a(this.mContext, str);
        } catch (Exception e2) {
            t5t.d(TAG, "assembleDialWithColor exception:" + e2.getMessage());
            return "";
        }
    }

    private s4t convert(Location location, int i2) {
        s4t s4tVar = new s4t();
        s4tVar.h((int) (location.getLongitude() * 3000000.0d));
        s4tVar.g((int) (location.getLatitude() * 3000000.0d));
        s4tVar.a((int) (location.getAltitude() * 100.0d));
        s4tVar.b((long) (location.getSpeed() * 10.0f));
        s4tVar.e(location.getTime());
        s4tVar.f((int) (location.getBearing() * 10.0f));
        s4tVar.d(i2);
        t5t.m(TAG, "gpsPoint:" + s4tVar);
        return s4tVar;
    }

    private boolean doAlertTips(String str) {
        return sendVoiceCommand(new lu(kdt.m(str)));
    }

    private VoiceModule getAiVoiceModule() {
        if (this.hmMiLiProDevice.O().A().hasSw(17)) {
            return (VoiceModule) this.hmMiLiProDevice.y(AiVoiceModule.class);
        }
        if (this.hmMiLiProDevice.O().A().hasSw(16)) {
            return (VoiceModule) this.hmMiLiProDevice.y(VoiceModule.class);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getAlarmChange(ILFEventCallback iLFEventCallback) {
        if (isConnected()) {
            this.hmMiLiProDevice.B4(new x(iLFEventCallback));
        } else {
            iLFEventCallback.onSettingsChange(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DeviceBatteryInfo getDeviceBatteryInfo(@NotNull ubt ubtVar) {
        return new DeviceBatteryInfo(ubtVar.j(), ubtVar.h(), ubtVar.a(), ubtVar.e(), ubtVar.l(), ubtVar.k());
    }

    private Long[] getFileUIHInfo(File file) {
        long jD;
        long jD2 = 0;
        try {
            byte[] bArr = new byte[26];
            if (new FileInputStream(file).read(bArr, 0, 26) != -1) {
                t5t.m(TAG, "bytes: " + tet.x(bArr));
            }
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 22, bArr2, 0, 4);
            jD = tet.d(bArr2, 0, 4);
            try {
                byte[] bArr3 = new byte[4];
                System.arraycopy(bArr, 18, bArr3, 0, 4);
                jD2 = tet.d(bArr3, 0, 4);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (Exception e3) {
            e = e3;
            jD = 0;
        }
        return new Long[]{Long.valueOf(jD), Long.valueOf(jD2)};
    }

    public static Locale getLocale(int i2) {
        return wg.a(i2);
    }

    private MenstruationModule getMenstruationModule() {
        return (MenstruationModule) this.hmMiLiProDevice.y(MenstruationModule.class);
    }

    private int getPace(float f2) {
        int i2 = (int) (f2 * 1000.0f);
        if (i2 > 1800) {
            return 1800;
        }
        return i2;
    }

    private int getSpeed(float f2) {
        if (f2 <= 0.0f) {
            return 0;
        }
        return (int) (3600.0f / f2);
    }

    @Nullable
    private WeatherModule getWeatherModule() {
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            return null;
        }
        return (WeatherModule) neVar.y(WeatherModule.class);
    }

    private WorldClockModule getWorldClockModule() {
        return (WorldClockModule) this.hmMiLiProDevice.y(WorldClockModule.class);
    }

    private String handleDialWithBg(String str, String str2, byte[] bArr) {
        try {
            if (!isConnected()) {
                return null;
            }
            g4s g4sVarO = this.hmMiLiProDevice.O();
            qd qdVarI = g4sVarO.I();
            if (td.f34581a.b(qdVarI)) {
                h8.d.a(this.hmMiLiProDevice.d4());
            }
            w7.a aVar = w7.f37676a;
            return aVar.a(this.mContext, qdVarI, aVar.a(g4sVarO.I()).a(this.mContext, str), bArr).a(this.mContext, str2);
        } catch (Exception e2) {
            t5t.d(TAG, "handleDialWithBg exception:" + e2.getMessage());
            return "";
        }
    }

    private String handleDialWithMultiBg(List<String> list, String str, byte[] bArr) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                return handleDialWithBg(list.get(0), str, bArr);
            }
            g4s g4sVarO = this.hmMiLiProDevice.O();
            if (td.f34581a.b(g4sVarO.I())) {
                ph phVarA = w7.f37676a.a(g4sVarO.I());
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    arrayList.add(phVarA.a(this.mContext, list.get(i2)));
                }
                return g8.f18702a.a(this.mContext, str, arrayList, bArr);
            }
        }
        return str;
    }

    public static void initLog(Context context, String str) {
        ict.b(context, false, str, new k());
        t5t.d(TAG, "version:android_245");
    }

    private void initSupportGPS() {
        ict.e(new lh() { // from class: yjc
            @Override // defpackage.lh
            public final boolean a(qd qdVar) {
                return zjs.i(qdVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$enableGoalRemind$4(boolean z2) {
        return "is huamiOS: " + z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openApduChannel$1(HMNFCStatus hMNFCStatus) {
        t5t.m(TAG, "nfc status:" + hMNFCStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setMultiTarget$5(boolean z2, boolean z3) {
        return "is huamiOS: " + z2 + ";is Multi Target: " + z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$setPeriodData$3(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, Boolean bool) {
        atomicBoolean.set(bool.booleanValue());
        countDownLatch.countDown();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMWeatherInfo lambda$setWeatherInfo$2(HMWeatherInfo hMWeatherInfo) {
        return hMWeatherInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void musicControl(byte[] bArr, ILFEventCallback iLFEventCallback) {
        HMMusicControl.DeviceCommand deviceCommandFrom = HMMusicControl.DeviceCommand.from(bArr[0]);
        if (deviceCommandFrom == null) {
            t5t.d(TAG, "Music command is null");
        } else {
            iLFEventCallback.onMusicControl(deviceCommandFrom);
        }
    }

    private void onConnected() {
        setPair(false);
        this.lfEventAdapterManager.a(this.mContext, this.hmMiLiProDevice);
        if (this.phoneMuteListener != null) {
            defpackage.j0.v.a().a(this.hmMiLiProDevice, this.phoneMuteListener);
        }
        if (this.upgradeCallback == null || !this.hmMiLiProDevice.F(OtaModule.class)) {
            return;
        }
        this.hmMiLiProDevice.b5(new g0());
    }

    private boolean sendVoiceCommand(pw pwVar) {
        if (!isConnected()) {
            return false;
        }
        VoiceModule aiVoiceModule = getAiVoiceModule();
        if (aiVoiceModule == null) {
            t5t.d(TAG, "module is null");
            return false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        aiVoiceModule.sendCommand(pwVar, new p(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    private boolean sendVoiceMusicCommand(int i2) {
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.c(9, new com.huami.bluetooth.profile.channel.module.voice.content.c.f(i2, null))));
    }

    public static void setContinuousScan(boolean z2) {
        h3t.H().o(z2);
    }

    public static void setNoFilterScan(boolean z2) {
        wbt.l = z2;
    }

    public static void setReConnectTimeout(int i2) {
        wbt.o = i2;
    }

    public static void setReconnectionWithScan(boolean z2) {
        wbt.d = z2;
    }

    public static void setSBEListener(ISBEListener iSBEListener) {
        ict.c(iSBEListener);
    }

    public static void setScanDeviceTimeout(int i2) {
        n1t.N = i2;
    }

    public static void setScanMode(int i2) {
        wbt.f37825k = i2;
    }

    public static void setStopScan(boolean z2) {
        wbt.n = z2;
    }

    private boolean setVibrateWithTest(qos qosVar) {
        if (!isConnected()) {
            t5t.d(TAG, "setVibrateWithTest not connected");
            return false;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.hmMiLiProDevice.H2(qosVar, new o0(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        boolean z2 = atomicBoolean.get();
        t5t.d(TAG, "setVibrateWithTest ret: " + z2);
        return z2;
    }

    public static void setconnectingtimeout(int i2) {
        n1t.U0(i2);
    }

    private boolean sportCommand(SportCommand sportCommand, r6t r6tVar) {
        if (!isConnected()) {
            return false;
        }
        this.hmMiLiProDevice.E2(sportCommand, r6tVar, new m());
        return true;
    }

    private boolean sportCommandPiece(SportCommand sportCommand, r6t r6tVar) {
        if (!isConnected()) {
            return false;
        }
        this.hmMiLiProDevice.K3(sportCommand, r6tVar, new n());
        return true;
    }

    private boolean supportHrSleep() {
        Feature featureA;
        g4s g4sVarO = this.hmMiLiProDevice.O();
        if (g4sVarO == null || (featureA = g4sVarO.A()) == null) {
            return false;
        }
        return featureA.hasSw(7);
    }

    private boolean supportSleepBreathScore() {
        return this.hmMiLiProDevice.O().A().hasSw(4) && this.hmMiLiProDevice.O().A().hasSw(21);
    }

    public boolean addSettingListener(ChangeListener changeListener) {
        t5t.d(TAG, "registerSettingListener");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return false;
        }
        SettingsModule settingsModule = (SettingsModule) neVar.y(SettingsModule.class);
        if (settingsModule == null) {
            t5t.d(TAG, "module null!");
            return false;
        }
        settingsModule.addListener(changeListener);
        return true;
    }

    public boolean alertApp(HMAlertApp hMAlertApp, int i2, String str, String str2, String str3, String str4) {
        ivs ivsVar = new ivs(hMAlertApp, str, str2);
        ivsVar.b(i2);
        ivsVar.c(str3);
        if (!this.hmMiLiProDevice.F(NotificationModule.class)) {
            return alert(ivsVar);
        }
        t5t.d(TAG, "support notification module");
        this.hmMiLiProDevice.J2(C3623t.f34140a.a(ivsVar, str4, 0), new b());
        return true;
    }

    public boolean alertFind() {
        ta taVarA = ua.f35555a.a(this.hmMiLiProDevice);
        if (taVarA != null) {
            return taVarA.a();
        }
        t5t.d(TAG, "没有创建成功查找手机的api");
        return false;
    }

    public boolean alertGenericApp(int i2, String str, String str2, String str3) {
        return alertApp(HMAlertApp.GENERIC, i2, str, str2, str3);
    }

    public boolean alertHongbao(int i2) {
        ivs ivsVar = new ivs(HMAlertApp.HONGBAO);
        ivsVar.b(i2);
        if (!this.hmMiLiProDevice.F(NotificationModule.class)) {
            return alert(ivsVar);
        }
        t5t.d(TAG, "support notification module");
        this.hmMiLiProDevice.J2(C3623t.f34140a.a(ivsVar, "com.tencent.mm", 0), new g());
        return true;
    }

    public boolean alertInCall(String str, String str2) {
        if (!this.hmMiLiProDevice.F(NotificationModule.class)) {
            return TextUtils.isEmpty(str2) ? alert(new ivs(fd.ALERT_INCALL, str)) : alert(new ivs(fd.ALERT_INCALL, str, str2));
        }
        t5t.d(TAG, "support notification module");
        this.hmMiLiProDevice.J2(C3623t.f34140a.a(str, str2), new d());
        return true;
    }

    public boolean alertInCallStop() {
        if (!this.hmMiLiProDevice.F(NotificationModule.class)) {
            return alert(new ivs(fd.ALERT_INCALL, (String) null, (byte) 0));
        }
        t5t.d(TAG, "support notification module");
        this.hmMiLiProDevice.J2(C3623t.f34140a.a(), new e());
        return true;
    }

    public boolean alertMiuiAlarm(int i2) {
        boolean zF = this.hmMiLiProDevice.F(NotificationModule.class);
        int i3 = supportLinkageMiuiAlarm() ? 130 : 250;
        if (zF) {
            this.hmMiLiProDevice.J2(new fn(i2, i3, 0, SleepDataHelperKt.DEAK_CLOCK_PKG, "", "", "", "", 0), new h1());
            return true;
        }
        t5t.d(TAG, "alertMiuiAlarm: supportNotificationModule=false");
        return false;
    }

    public boolean alertSms(int i2, String str, String str2, String str3) {
        ivs ivsVar = new ivs(fd.ALERT_SMS, str, str2);
        ivsVar.b(i2);
        if (!this.hmMiLiProDevice.F(NotificationModule.class)) {
            return alert(ivsVar);
        }
        t5t.d(TAG, "support notification module");
        this.hmMiLiProDevice.J2(C3623t.f34140a.a(ivsVar, str3, 0), new f());
        return true;
    }

    public boolean alertWeather(String str, String str2) {
        return alert(new ivs(HMAlertApp.WEATHER_ALERT, str, str2));
    }

    public void cancelFwUpgrade() {
        r3t.y().g();
    }

    public boolean checkAgpsUpgrade(File file, File file2, File file3, ISyncAgpsCallback iSyncAgpsCallback) {
        if (isConnected()) {
            return zjs.f(this.mContext, this.hmMiLiProDevice, file, file2, file3, iSyncAgpsCallback);
        }
        return false;
    }

    public HMNFCStatus closeApduChannel() {
        if (isConnected()) {
            return this.hmMiLiProDevice.U1();
        }
        return null;
    }

    public boolean closeHeartRate(HrFreq hrFreq) {
        if (!isConnected() || !this.hmMiLiProDevice.e1().setHeartRate(false, hrFreq.getFreq())) {
            return false;
        }
        if (supportHrSleep()) {
            return this.hmMiLiProDevice.z4(false) && this.hmMiLiProDevice.e1().enableFull(false, hrFreq.getFreq()) && this.hmMiLiProDevice.O4(false);
        }
        return true;
    }

    public void connect(IDeviceBaseCallback iDeviceBaseCallback) {
        this.deviceCallback = iDeviceBaseCallback;
        this.hmMiLiProDevice.x(false);
    }

    public boolean continueVoiceCommand() {
        return sendVoiceCommand(new n5());
    }

    public boolean defaultVibrate(VibrateType vibrateType) {
        boolean vibrateWithTest = setVibrateWithTest(qos.a(vibrateType.ordinal()));
        t5t.d(TAG, "defaultVibrate ret: " + vibrateWithTest);
        return vibrateWithTest;
    }

    public boolean deleteAlertToDevice(int i2) {
        if (isConnected()) {
            return alert(new ivs(i2, (byte) 2));
        }
        return false;
    }

    public boolean deleteDialsSync(ArrayList<Integer> arrayList) {
        if (isConnected()) {
            return this.hmMiLiProDevice.u3(arrayList);
        }
        return false;
    }

    public HMCardTSResponse<Boolean> deleteSwitchCardTimeSync(HMCardSwitchTime hMCardSwitchTime) {
        return this.hmMiLiProDevice.Z1(hMCardSwitchTime);
    }

    public boolean deleteVibrate(VibrateType vibrateType) {
        if (!isConnected()) {
            t5t.d(TAG, "deleteVibrate not connected");
            return false;
        }
        boolean zR3 = this.hmMiLiProDevice.r3(qos.a(vibrateType.ordinal()));
        t5t.d(TAG, "delete vibrate ret: " + zR3);
        return zR3;
    }

    public boolean deviceSportStop() {
        return sportCommandPiece(SportCommand.STOP, null);
    }

    public boolean disableBind(boolean z2) {
        return this.hmMiLiProDevice.r4(z2);
    }

    public boolean disableHid() {
        if (!isConnected()) {
            return false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.hmMiLiProDevice.P3(true, new q0(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public void disableRefreshGatt() {
        wbt.f37823a = false;
    }

    public void disconnect() {
        this.hmMiLiProDevice.G();
    }

    public boolean enableAtrialFib(boolean z2) {
        if (isConnected()) {
            return this.hmMiLiProDevice.e1().setAtrialFibEnable(z2);
        }
        return false;
    }

    public boolean enableConnectedAdv(boolean z2) {
        if (!isConnected()) {
            return false;
        }
        this.hmMiLiProDevice.b4(z2, new u0());
        return true;
    }

    public boolean enableFullHeartRate(HrFreq hrFreq) {
        if (!isConnected() || !this.hmMiLiProDevice.e1().enableFull(true, hrFreq.getFreq())) {
            return false;
        }
        if (supportHrSleep()) {
            return this.hmMiLiProDevice.z4(false);
        }
        return true;
    }

    @Deprecated
    public boolean enableGoalRemind(boolean z2) {
        UserInfoExt userInfoSync = getUserInfoSync();
        if (userInfoSync == null) {
            t5t.d(TAG, "enableGoalRemind:userInfoExt is null");
            return false;
        }
        t5t.d(TAG, "enableGoalRemind:goal = " + userInfoSync.getGoal());
        if (userInfoSync.getGoal() <= 0) {
            return false;
        }
        return enableGoalRemind(z2, userInfoSync.getGoal());
    }

    public boolean enableHeartRate(HrFreq hrFreq) {
        if (!isConnected() || !this.hmMiLiProDevice.e1().setHeartRate(true, hrFreq.getFreq())) {
            return false;
        }
        if (supportHrSleep()) {
            return this.hmMiLiProDevice.z4(true) && this.hmMiLiProDevice.e1().enableFull(true, hrFreq.getFreq());
        }
        return true;
    }

    public boolean enableHrBroadcast(boolean z2) {
        if (!isConnected()) {
            return false;
        }
        this.hmMiLiProDevice.j4(z2, new v0());
        return true;
    }

    public boolean enableMultiLink(boolean z2) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.hmMiLiProDevice.m4(z2, new p0(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public boolean enableOsa(boolean z2) {
        if (isConnected()) {
            return this.hmMiLiProDevice.C4(z2);
        }
        return false;
    }

    public boolean enablePressure(boolean z2) {
        if (isConnected()) {
            return this.hmMiLiProDevice.O4(z2);
        }
        return false;
    }

    public void enableRealtimeStep(boolean z2) {
        if (isConnected()) {
            this.hmMiLiProDevice.Q0(z2);
        }
    }

    public boolean enableSleepAssistHr(HrFreq hrFreq) {
        if (!isConnected() || !this.hmMiLiProDevice.e1().setSleepAssistantEnable(true)) {
            return false;
        }
        if (supportHrSleep()) {
            return this.hmMiLiProDevice.z4(true) && this.hmMiLiProDevice.e1().enableFull(false, hrFreq.getFreq()) && this.hmMiLiProDevice.O4(false);
        }
        return true;
    }

    public boolean enableSportHeartRate(boolean z2) {
        if (isConnected()) {
            return this.hmMiLiProDevice.F4(z2);
        }
        return false;
    }

    public boolean enableWristBright(HMLiftWristConfig hMLiftWristConfig) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.hmMiLiProDevice.A2(hMLiftWristConfig, new r(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public ArrayList<AlarmClockExt> getAlarms() {
        if (isConnected()) {
            return this.hmMiLiProDevice.V1();
        }
        return null;
    }

    public DeviceBatteryInfo getBatteryLevel() {
        ubt ubtVarB1;
        if (isConnected() && (ubtVarB1 = this.hmMiLiProDevice.b1()) != null) {
            return getDeviceBatteryInfo(ubtVarB1);
        }
        return null;
    }

    public boolean getCRSCode() {
        if (isConnected()) {
            return this.hmMiLiProDevice.W1();
        }
        return false;
    }

    @Nullable
    public CallReplyApi getCallReplyApi() {
        CallReplyModule callReplyModule;
        if (isConnected() && (callReplyModule = (CallReplyModule) this.hmMiLiProDevice.y(CallReplyModule.class)) != null) {
            return callReplyModule.loadApi();
        }
        return null;
    }

    public DailyDataResult getDailyData(long j2, int i2, UserInfoExt userInfoExt, List<SleepManualData> list, boolean z2, IDailyDataSyncCallback iDailyDataSyncCallback) {
        return getDailyData(j2, i2, userInfoExt, list, z2, true, iDailyDataSyncCallback);
    }

    public DeviceInfoExt getDeviceInfo() {
        String str;
        if (!isConnected()) {
            return null;
        }
        g4s g4sVarO = this.hmMiLiProDevice.O();
        hws hwsVarO0 = g4sVarO.o0();
        qd qdVarI = g4sVarO.I();
        DeviceInfoExt deviceInfoExt = new DeviceInfoExt();
        deviceInfoExt.setMacAddress(this.hmMiLiProDevice.L().getAddress());
        deviceInfoExt.setAuthKey(this.hmMiLiProDevice.J().e());
        deviceInfoExt.setDeviceId(g4sVarO.G());
        deviceInfoExt.setSn(g4sVarO.a());
        deviceInfoExt.setFirmwareVersion(g4sVarO.e0());
        deviceInfoExt.setHardwareVersion(g4sVarO.i0());
        deviceInfoExt.setPnpId(g4sVarO.q0());
        deviceInfoExt.setPnpVersion(g4sVarO.s0());
        deviceInfoExt.setDeviceType(qdVarI.a().a());
        deviceInfoExt.setDeviceSource(qdVarI.b());
        deviceInfoExt.setGpsVersion(g4sVarO.g0());
        com.xiaomi.hm.health.bt.profile.base.a aVarM0 = g4sVarO.m0();
        if (aVarM0 != null) {
            deviceInfoExt.setHasOtherVersion(true);
            deviceInfoExt.setResourceFlag(aVarM0.h());
            deviceInfoExt.setResourceVersion(aVarM0.i());
            deviceInfoExt.setFontFlag(aVarM0.c());
            deviceInfoExt.setFontVersion(aVarM0.d());
            deviceInfoExt.setFirmwareFlag(aVarM0.e());
            deviceInfoExt.setSystemImageStatus(aVarM0.j());
            lxs lxsVarA = aVarM0.a();
            if (lxsVarA != null) {
                deviceInfoExt.setHasBaseResource(true);
                deviceInfoExt.setBaseResourceVersion(lxsVarA.c());
                deviceInfoExt.setBaseResourceFlag(lxsVarA.a());
            } else {
                deviceInfoExt.setHasBaseResource(false);
            }
            q9 q9VarB = aVarM0.b();
            if (q9VarB != null) {
                deviceInfoExt.setHasExtResource(true);
                deviceInfoExt.setExtResourceVersion(q9VarB.getF31243a());
                deviceInfoExt.setExtResourceFlag(q9VarB.getF31244b());
            } else {
                deviceInfoExt.setHasExtResource(HMDeviceFeature.hasFeatureBaseResource(qdVarI));
            }
        } else {
            deviceInfoExt.setHasOtherVersion(false);
            deviceInfoExt.setHasBaseResource(false);
            deviceInfoExt.setHasExtResource(false);
        }
        if (hwsVarO0 != null) {
            deviceInfoExt.setVendorId(hwsVarO0.f20555a);
            deviceInfoExt.setVendorSource(hwsVarO0.f20556b);
        }
        try {
            str = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        deviceInfoExt.setSoftwareVersion(str);
        deviceInfoExt.setSystemModel(Build.MODEL);
        deviceInfoExt.setSystemVersion("Android_" + Build.VERSION.RELEASE);
        return deviceInfoExt;
    }

    public void getDeviceLog(File file, IHMDataCallback<File> iHMDataCallback) {
        if (isConnected()) {
            this.hmMiLiProDevice.z0(file, iHMDataCallback);
        }
    }

    @Nullable
    public HeartHealthApi getHeartHealthApi() {
        if (isConnected()) {
            return this.hmMiLiProDevice.e1();
        }
        return null;
    }

    public HrDataResult getHrData(long j2, int i2) {
        DeviceInfoExt deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            return new HrDataResult();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        calendar.setTimeZone(ProfileUtils.getTimezone((byte) i2));
        t5t.m(TAG, "getHrData:" + calendar.getTime());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference(new HrDataResult());
        ((HrDataResult) atomicReference.get()).setDeviceId(deviceInfo.getDeviceId());
        ((HrDataResult) atomicReference.get()).setDeviceSource(deviceInfo.getDeviceSource());
        this.hmMiLiProDevice.N2(calendar, new r0(atomicReference, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return (HrDataResult) atomicReference.get();
    }

    public List<HighOrLowHrNotificationData> getHrDetectionData(Calendar calendar) {
        ArrayList arrayList = new ArrayList();
        if (!isConnected()) {
            return arrayList;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        rg.f32510a.a(this.hmMiLiProDevice, calendar, new z0(arrayList, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return arrayList;
    }

    public ArrayList<HMLanguage> getLanguages() {
        return this.hmMiLiProDevice.h4();
    }

    public Boolean getLockStatus() {
        if (isConnected()) {
            return this.hmMiLiProDevice.k4();
        }
        return null;
    }

    @Nullable
    public HMHrReminder getLowHrReminder() {
        t5t.d(TAG, "getLowHrReminder");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return null;
        }
        if (neVar.V()) {
            return neVar.e1().getLowHrReminder();
        }
        t5t.d(TAG, "not connect!");
        return null;
    }

    public List<LowOsaNotificationData> getLowOsaDetectionData(Calendar calendar) {
        ArrayList arrayList = new ArrayList();
        if (!isConnected()) {
            return arrayList;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        wk.f38046a.a(this.hmMiLiProDevice, calendar, new b1(arrayList, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return arrayList;
    }

    @Nullable
    public Integer getLowSpo2AlertValue() {
        t5t.d(TAG, "getLowSpo2AlertValue");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return null;
        }
        if (neVar.V()) {
            return neVar.e1().getLowSpo2AlertValue();
        }
        t5t.d(TAG, "not connect!");
        return null;
    }

    public MenstruationConfig getMenstruationConfig() {
        if (!isConnected()) {
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.hmMiLiProDevice.y4(new b0(atomicReference, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return (MenstruationConfig) atomicReference.get();
    }

    public MenstruationTotalRecord getMenstruationTotalRecord() {
        if (!isConnected()) {
            return null;
        }
        MenstruationModule menstruationModule = getMenstruationModule();
        if (menstruationModule == null) {
            t5t.d(TAG, "MenstruationModule is null");
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        menstruationModule.getMenstruationTotalRecord(new a0(atomicReference, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return (MenstruationTotalRecord) atomicReference.get();
    }

    public HMNFCCardInfo getNfcCardInfoSync() {
        return this.hmMiLiProDevice.n4();
    }

    public PaiGoalData getPaiGoalData(int i2, int i3, int i4, int i5, int i6) {
        int[] iArrB = rys.b(i2, i3, i4, i5, i6);
        return new PaiGoalData(iArrB[0], iArrB[1], iArrB[2]);
    }

    @Nullable
    public Boolean getPressureAlertEnable() {
        t5t.d(TAG, "getPressureAlertEnable");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return null;
        }
        if (neVar.V()) {
            return neVar.e1().getPressureAlertEnable();
        }
        t5t.d(TAG, "not connect!");
        return null;
    }

    public RealtimeData getRealtimeData() {
        ycs ycsVarC0 = this.hmMiLiProDevice.c0();
        if (ycsVarC0 == null) {
            return null;
        }
        RealtimeData realtimeData = new RealtimeData();
        realtimeData.setSupportStepExtra(ycsVarC0.k());
        realtimeData.setTotalCal(ycsVarC0.a());
        realtimeData.setTotalDis(ycsVarC0.f());
        realtimeData.setTotalStep(ycsVarC0.h());
        return realtimeData;
    }

    public ArrayList<HMReminderInfo> getRemindersSync() {
        if (isConnected()) {
            return this.hmMiLiProDevice.G4();
        }
        return null;
    }

    public List<RestHeartRate> getRestHeartRate(Calendar calendar) {
        ArrayList arrayList = new ArrayList();
        if (isConnected()) {
            return uq.f36012a.a(this.hmMiLiProDevice, calendar);
        }
        t5t.m(TAG, "getRestHeartRate:isConnected = false");
        return arrayList;
    }

    @Nullable
    public ScheduleApi getScheduleApi() {
        t5t.d(TAG, "getScheduleApi");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return null;
        }
        if (!neVar.V()) {
            t5t.d(TAG, "not connect!");
            return null;
        }
        ScheduleModule scheduleModule = (ScheduleModule) neVar.y(ScheduleModule.class);
        if (scheduleModule != null) {
            return new jr(scheduleModule.loadOperationApi());
        }
        t5t.d(TAG, "schedulemodule null");
        return null;
    }

    public String getSkinPath(String str, List<String> list, byte[] bArr) {
        if (list != null && !list.isEmpty()) {
            return handleDialWithMultiBg(list, str, bArr);
        }
        if (bArr == null) {
            return str;
        }
        t5t.d(TAG, "no bg path");
        return assembleDialWithColor(str, bArr);
    }

    public int getSleepBreathScore(long j2, long j3, int i2) {
        UserInfoExt userInfoSync = getUserInfoSync();
        if (userInfoSync == null) {
            t5t.d(TAG, "getSleepBreathScore:userInfo is null");
            return -1;
        }
        return ln.a(this.hmMiLiProDevice, j2, j3, i2, userInfoSync.getUid());
    }

    @Nullable
    public Boolean getSmartSpo2Enable() {
        t5t.d(TAG, "getSmartSpo2Enable");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return null;
        }
        if (neVar.V()) {
            return neVar.e1().getSmartSpo2Enable();
        }
        t5t.d(TAG, "not connect!");
        return null;
    }

    public SportTypeConfig getSportTypeConfig() {
        if (isConnected()) {
            return this.hmMiLiProDevice.J4();
        }
        return null;
    }

    public int getSteps() {
        return this.hmMiLiProDevice.c0().h();
    }

    public UserInfoExt getUserInfoSync() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        this.hmMiLiProDevice.E4(new e1(atomicReference, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return (UserInfoExt) atomicReference.get();
    }

    public String getVersionName() {
        return VERSION_NAME;
    }

    public List<Integer> getWatchFacesAllSync() {
        if (isConnected()) {
            return this.hmMiLiProDevice.M4();
        }
        return null;
    }

    public boolean hasAlgoFeature(int i2) {
        Feature featureA;
        if (isConnected() && (featureA = this.hmMiLiProDevice.O().A()) != null) {
            return featureA.hasAlg(i2);
        }
        return false;
    }

    public boolean hasBaseFeature(int i2) {
        Feature featureA;
        if (isConnected() && (featureA = this.hmMiLiProDevice.O().A()) != null) {
            return featureA.hasBase(i2);
        }
        return false;
    }

    public boolean hasHardwareFeature(int i2) {
        Feature featureA;
        if (isConnected() && (featureA = this.hmMiLiProDevice.O().A()) != null) {
            return featureA.hasHw(i2);
        }
        return false;
    }

    public boolean hasSoftwareFeature(int i2) {
        Feature featureA;
        if (isConnected() && (featureA = this.hmMiLiProDevice.O().A()) != null) {
            return featureA.hasSw(i2);
        }
        return false;
    }

    public void initSupportBindDeviceSource() {
        HashSet hashSet = new HashSet();
        hashSet.add(qd.o1);
        hashSet.add(qd.p1);
        hashSet.add(qd.q1);
        hashSet.add(qd.C2);
        hashSet.add(qd.B2);
        hashSet.add(qd.I2);
        hashSet.add(qd.K2);
        hashSet.add(qd.J2);
        hashSet.add(qd.M2);
        hashSet.add(qd.G2);
        hashSet.add(qd.H2);
        hashSet.add(qd.L2);
        ict.d(hashSet);
    }

    public void invokeUpgrade(IFirmwareInvokeCallback iFirmwareInvokeCallback) {
        r3t.y().n(this.hmMiLiProDevice, iFirmwareInvokeCallback);
    }

    public boolean isConnected() {
        return this.hmMiLiProDevice.V();
    }

    public boolean isDfuBusy() {
        if (!isConnected()) {
            return false;
        }
        int state = this.hmMiLiProDevice.Y1().getState();
        le.c(TAG, "dfuState:" + state, new Object[0]);
        return state == 32 || state == 33 || state == 48 || state == 49 || state == 9;
    }

    public boolean isMiliMainLand() {
        if (isConnected()) {
            return l7t.c(this.hmMiLiProDevice.O().i0());
        }
        return false;
    }

    public int isOffWristLockStateSaveDevice() {
        try {
            Boolean boolS4 = this.hmMiLiProDevice.s4();
            if (boolS4 == null) {
                return 1;
            }
            return boolS4.booleanValue() ? 2 : 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    public boolean isSportAlive() {
        return isConnected() && this.hmMiLiProDevice.Y1().getState() == 32;
    }

    public boolean isSupportActivityData() {
        if (!isConnected()) {
            return false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.hmMiLiProDevice.f5(new y0(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public boolean isSupportCardTimeSwitchSync() {
        return this.hmMiLiProDevice.S4();
    }

    public boolean isSupportDialFontCustomColor() {
        DialVersion dialVersionD4 = this.hmMiLiProDevice.d4();
        if (dialVersionD4 == null) {
            return true;
        }
        return dialVersionD4.getSupportCustomColor();
    }

    public boolean modifyCity(@NotNull City city, boolean z2) {
        t5t.d(TAG, "start modifyCity");
        WeatherModule weatherModule = getWeatherModule();
        if (weatherModule == null) {
            return false;
        }
        boolean zModifyCity = weatherModule.modifyCity(city, z2);
        t5t.d(TAG, "modifyCity ret: " + zModifyCity);
        return zModifyCity;
    }

    public boolean muteMiuiAlarm(int i2) {
        boolean zF = this.hmMiLiProDevice.F(NotificationModule.class);
        int i3 = supportLinkageMiuiAlarm() ? 130 : 250;
        if (zF) {
            this.hmMiLiProDevice.J2(new fn(i2, i3, 2, SleepDataHelperKt.DEAK_CLOCK_PKG, "", "", "", "", 0), new a());
            return true;
        }
        t5t.d(TAG, "alertMiuiAlarm: supportNotificationModule=false");
        return false;
    }

    public ApduResponse nfcLoadService(byte[] bArr) {
        if (isConnected()) {
            return this.hmMiLiProDevice.c2(bArr);
        }
        return null;
    }

    public void observeHealthSettingChange(@NotNull ChangeListener changeListener) {
        t5t.d(TAG, "observeHealthSettingChange");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return;
        }
        if (!neVar.V()) {
            t5t.d(TAG, "not connect!");
            return;
        }
        SettingsModule settingsModule = (SettingsModule) neVar.y(SettingsModule.class);
        if (settingsModule == null) {
            t5t.d(TAG, "get settingmodule null");
        } else {
            settingsModule.addListener(changeListener);
        }
    }

    @Override // defpackage.dts
    public void onAuthentication(HMAuthState hMAuthState) {
        int i2;
        t5t.d(TAG, "onAuthentication " + hMAuthState);
        int state = hMAuthState.getState();
        if (state == 0) {
            i2 = SUCCESS;
        } else if (state == 1) {
            i2 = FAILED;
        } else if (state == 2) {
            i2 = KNOCK;
        } else if (state != 3) {
            i2 = state != 4 ? FAILED : DENY;
        } else {
            i2 = KNOCK_SUCCESS;
        }
        IDeviceBaseCallback iDeviceBaseCallback = this.deviceCallback;
        if (iDeviceBaseCallback != null) {
            iDeviceBaseCallback.onConnectionStateChange(AUTH, i2, hMAuthState.getState());
        }
    }

    @Override // com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
    public void onConnectionStatusChanged(BluetoothDevice bluetoothDevice, sd sdVar, wt wtVar) {
        int i2;
        t5t.d(TAG, "onConnectionStatusChanged device=" + bluetoothDevice + ",type=" + sdVar + ",status=" + wtVar + ",value=" + wtVar.a());
        int i3 = d1.f13501a[wtVar.ordinal()];
        if (i3 == 1) {
            i2 = CONNECTING_TIMEOUT;
        } else if (i3 == 2) {
            i2 = DISCONNECTED;
        } else if (i3 == 3) {
            onConnected();
            i2 = CONNECTED;
        } else if (i3 != 4) {
            i2 = i3 != 5 ? CONNECTING : AUTH_FAILED;
        } else {
            i2 = SCAN_FAIL;
        }
        r3t.y().m(this.hmMiLiProDevice, i2);
        IDeviceBaseCallback iDeviceBaseCallback = this.deviceCallback;
        if (iDeviceBaseCallback != null) {
            iDeviceBaseCallback.onConnectionStateChange(CONNECT, i2, wtVar.a());
        }
    }

    @Override // defpackage.dts
    public byte[] onGetSignData(byte[] bArr, byte[] bArr2, int i2) {
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder();
        sb.append(i2 == 0 ? "SHA1:" : "UNKNOWN:");
        sb.append(tet.B(bArr2));
        String string = sb.toString();
        IDeviceBaseCallback iDeviceBaseCallback = this.deviceCallback;
        if (iDeviceBaseCallback == null) {
            return null;
        }
        String strOnGetSignData = iDeviceBaseCallback.onGetSignData(strEncodeToString, string);
        t5t.d(TAG, "signStr:" + strOnGetSignData);
        if (TextUtils.isEmpty(strOnGetSignData)) {
            return null;
        }
        return Base64.decode(strOnGetSignData, 2);
    }

    public HMNFCStatus openApduChannel() {
        if (isConnected()) {
            return this.hmMiLiProDevice.e2(new w1t() { // from class: ckc
                @Override // defpackage.w1t
                public final void a(HMNFCStatus hMNFCStatus) {
                    HuamiDevice.lambda$openApduChannel$1(hMNFCStatus);
                }
            });
        }
        return null;
    }

    public PasswordInteractionResponse passwordInteraction() {
        if (isConnected()) {
            return this.hmMiLiProDevice.g5();
        }
        return null;
    }

    public void phoneMutePermissionMiss() {
        if (isConnected()) {
            defpackage.j0.v.a().b(this.hmMiLiProDevice);
        } else {
            t5t.d(TAG, "phoneMutePermissionMiss isConnected = false");
        }
    }

    @Nullable
    public List<City> queryCityList() {
        t5t.d(TAG, "start queryCityList");
        WeatherModule weatherModule = getWeatherModule();
        if (weatherModule == null) {
            return null;
        }
        ArrayList<City> arrayListQueryCityList = weatherModule.queryCityList();
        t5t.d(TAG, "queryCityList ret: " + arrayListQueryCityList);
        return arrayListQueryCityList;
    }

    @Nullable
    public List<DisplayBean> queryDisplayListSync(int i2) {
        t5t.d(TAG, "queryDisplayList");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return null;
        }
        if (!neVar.V()) {
            t5t.d(TAG, "not connect!");
            return null;
        }
        DisplayListSettingModule displayListSettingModule = (DisplayListSettingModule) this.hmMiLiProDevice.y(DisplayListSettingModule.class);
        if (displayListSettingModule != null) {
            return displayListSettingModule.queryList(i2);
        }
        t5t.d(TAG, "module null!");
        return null;
    }

    @Nullable
    public Settings querySettingSync(@NotNull SettingsGroupType settingsGroupType) {
        HashMap<SettingsGroupType, Settings> mapQuerySettingSync = querySettingSync(new SettingsGroupType[]{settingsGroupType});
        if (mapQuerySettingSync == null || mapQuerySettingSync.isEmpty()) {
            return null;
        }
        return mapQuerySettingSync.get(settingsGroupType);
    }

    public HMCardTSResponse<List<HMCardSwitchTime>> querySwitchCardTimeSync(String str, int i2) {
        return this.hmMiLiProDevice.a2(str, i2);
    }

    @Nullable
    public WeatherSetting queryWeatherSettings() {
        t5t.d(TAG, "start queryWeatherSetting");
        WeatherModule weatherModule = getWeatherModule();
        if (weatherModule == null) {
            return null;
        }
        WeatherSetting weatherSettingQueryWeatherSettings = weatherModule.queryWeatherSettings();
        t5t.d(TAG, "queryWeatherSetting ret: " + weatherSettingQueryWeatherSettings);
        return weatherSettingQueryWeatherSettings;
    }

    public boolean readWristAndPinState() {
        return this.hmMiLiProDevice.i5();
    }

    public void registerUpgradeCallback(IUpgradeCallback iUpgradeCallback) {
        this.upgradeCallback = iUpgradeCallback;
    }

    public boolean removeSettingListener(ChangeListener changeListener) {
        t5t.d(TAG, "removeSettingListener");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return false;
        }
        SettingsModule settingsModule = (SettingsModule) neVar.y(SettingsModule.class);
        if (settingsModule == null) {
            t5t.d(TAG, "module null!");
            return false;
        }
        settingsModule.removeListener(changeListener);
        return true;
    }

    public void retryFwUpgrade() {
        r3t.y().A(this.hmMiLiProDevice);
    }

    public ApduResponse sendApduData(ApduRequest apduRequest) {
        if (isConnected()) {
            return this.hmMiLiProDevice.b2(apduRequest);
        }
        return null;
    }

    public boolean sendGpsPoint(Location location, int i2, boolean z2) {
        r6t r6tVar = new r6t();
        if (z2) {
            r6tVar.o(1);
        }
        r6tVar.e(convert(location, i2));
        return sportCommandPiece(SportCommand.SHOW, r6tVar);
    }

    public boolean sendMusicControl(HMMusicControl hMMusicControl) {
        if (!isConnected()) {
            return false;
        }
        this.hmMiLiProDevice.D2(hMMusicControl, new t());
        return true;
    }

    public boolean sendSportNoTimerConfig(SportKind sportKind, IHMSportListener iHMSportListener) {
        if (!isConnected()) {
            t5t.d(TAG, "sendSportNoTimerConfig is not connected");
            return false;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.hmMiLiProDevice.L3(new SportConfig(sportKind), iHMSportListener, new l(atomicBoolean));
        return atomicBoolean.get();
    }

    public boolean sendSportTypeSort(SportTypeConfig sportTypeConfig) {
        if (isConnected()) {
            return this.hmMiLiProDevice.R3(sportTypeConfig);
        }
        return false;
    }

    public boolean sendVoiceAsrNoContent() {
        return sendVoiceAsrTimeOut();
    }

    public boolean sendVoiceAsrTimeOut() {
        return sendVoiceCommand(new m9(8, ""));
    }

    public boolean sendVoiceCaption(String str) {
        return sendVoiceCommand(new lu(kdt.m(str)));
    }

    public boolean sendVoiceCloseAlarmCommand() {
        return sendVoiceOpenAlarmCommand();
    }

    public boolean sendVoiceCloseReminderCommand(String str) {
        return doAlertTips(str);
    }

    public boolean sendVoiceDeleteAlarmCommand(String str) {
        return doAlertTips(str);
    }

    public boolean sendVoiceDeleteReminderCommand(String str) {
        return doAlertTips(str);
    }

    public boolean sendVoiceDeleteTimerCommand() {
        return sendVoiceOpenTimerCommand();
    }

    public boolean sendVoiceDeltaBrightnessCommand(int i2) {
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.c(15, new com.huami.bluetooth.profile.channel.module.voice.content.c.b(1, Integer.valueOf(i2), null))));
    }

    public boolean sendVoiceExeCustomSkillCommand(String str) {
        pw pwVarE = kdt.e(str, this);
        if (pwVarE == null) {
            return false;
        }
        return sendVoiceCommand(pwVarE);
    }

    public boolean sendVoiceFindPhoneCommand() {
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.c(12, null)));
    }

    public boolean sendVoiceInvalidateTokenCommand() {
        return sendVoiceCommand(new m9(6, "未授权，或者授权失效！"));
    }

    public boolean sendVoiceMusicNext() {
        return sendVoiceMusicCommand(3);
    }

    public boolean sendVoiceMusicPREV() {
        return sendVoiceMusicCommand(4);
    }

    public boolean sendVoiceMusicPause() {
        return sendVoiceMusicCommand(1);
    }

    public boolean sendVoiceMusicPlay() {
        return sendVoiceMusicCommand(0);
    }

    public boolean sendVoiceNavigateToMainPageCommand() {
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.c(46, null)));
    }

    public boolean sendVoiceNetworkDisable() {
        return sendVoiceCommand(new m9(2, ""));
    }

    public boolean sendVoiceNetworkError() {
        return sendVoiceCommand(new m9(3, ""));
    }

    public boolean sendVoiceNfcCommand(CardType cardType) {
        int i2 = d1.d[cardType.ordinal()];
        int i3 = 0;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 3;
            } else if (i2 == 3) {
                i3 = 2;
            } else if (i2 == 4) {
                i3 = 1;
            }
        }
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.c(1, new com.huami.bluetooth.profile.channel.module.voice.content.c.g(i3))));
    }

    public boolean sendVoiceNotSupportCommand() {
        return sendVoiceCommand(new m9(11, ""));
    }

    public boolean sendVoiceOpenAlarmCommand() {
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.c(16, null)));
    }

    public boolean sendVoiceOpenBrightnessCommand() {
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.c(15, new com.huami.bluetooth.profile.channel.module.voice.content.c.b(0, null, null))));
    }

    public boolean sendVoiceOpenReminderCommand(String str) {
        return doAlertTips(str);
    }

    public boolean sendVoiceOpenTimerCommand() {
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.c(11, new com.huami.bluetooth.profile.channel.module.voice.content.c.d(0, 0, 0, 0))));
    }

    public boolean sendVoicePercentBrightnessCommand(int i2) {
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.c(15, new com.huami.bluetooth.profile.channel.module.voice.content.c.b(2, null, Integer.valueOf(i2)))));
    }

    public boolean sendVoiceQueryAlarmCommand() {
        return sendVoiceOpenAlarmCommand();
    }

    public boolean sendVoiceQueryReminderCommand(String str) {
        return doAlertTips(str);
    }

    public boolean sendVoiceQuerySpeechText(String str, boolean z2) {
        return sendVoiceCommand(new defpackage.e(str, z2));
    }

    public boolean sendVoiceQuietModeCommand(QuietMode quietMode) {
        int i2 = d1.f13502b[quietMode.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 0;
            }
        }
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.c(7, new com.huami.bluetooth.profile.channel.module.voice.content.c.e(i3))));
    }

    public boolean sendVoiceReadyCommand(List<String> list) {
        return sendVoiceCommand(new xp(list));
    }

    public boolean sendVoiceRebootCommand() {
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.c(45, null)));
    }

    public boolean sendVoiceRenderListCommand(String str, String str2, ArrayList<ListContent.Item> arrayList) {
        return sendVoiceCommand(new om(new ListContent(str, str2, arrayList)));
    }

    public boolean sendVoiceSetAlarmCommand(String str, String str2, String str3, int i2) {
        Calendar calendarJ;
        int iA = kdt.a(str3, i2);
        if (iA <= -1 || (calendarJ = kdt.j(str2)) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return sendVoiceSetAlarmCommand(arrayList, calendarJ.getTimeInMillis(), iA);
    }

    public boolean sendVoiceSetReminderCommand(String str, String str2, String str3, String str4, int i2) {
        Calendar calendarJ;
        int iG = kdt.g(str3, i2);
        if (iG == -1 || (calendarJ = kdt.j(str2)) == null) {
            return false;
        }
        long timeInMillis = calendarJ.getTimeInMillis();
        int i3 = kdt.i(str3, iG);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return sendVoiceSetReminderCommand(arrayList, str4, timeInMillis, i3);
    }

    public boolean sendVoiceSetTimerCommand(String str, String str2) {
        return sendVoiceSetTimerCommand(kdt.l(str), str2);
    }

    public boolean sendVoiceSetTimerCommandForAlexa(String str, String str2) {
        jdt jdtVarH = kdt.h(kdt.j(str2).getTimeInMillis() - System.currentTimeMillis());
        com.huami.bluetooth.profile.channel.module.voice.content.a.e eVar = new com.huami.bluetooth.profile.channel.module.voice.content.a.e((int) jdtVarH.a(), (int) jdtVarH.b(), (int) jdtVarH.c());
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.a(1, 3, arrayList, eVar)));
    }

    public boolean sendVoiceShutdownCommand() {
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.c(47, null)));
    }

    public boolean sendVoiceTtsNoContent() {
        return sendVoiceTtsTimeout();
    }

    public boolean sendVoiceTtsTimeout() {
        return sendVoiceCommand(new m9(9, ""));
    }

    public boolean sendVoiceUnknownErrorCommand() {
        return sendVoiceCommand(new m9(1, ""));
    }

    public boolean sendVoiceWearableCommand(String str) {
        pw pwVarA = vw.a((Instruction<?>) APIUtils.readInstruction(str), this);
        return pwVarA == null ? sendVoiceNotSupportCommand() : sendVoiceCommand(pwVarA);
    }

    public boolean sendVoiceWeatherForecastCommand(List<WeatherItem> list) {
        ArrayList arrayList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        if (list.size() == 1) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (int i2 = 1; i2 < list.size(); i2++) {
                WeatherItem weatherItem = list.get(i2);
                arrayList.add(new com.huami.bluetooth.profile.channel.module.voice.content.d.b(kdt.c(weatherItem.getDate()) / 1000, weatherItem.gethTemperature(), weatherItem.getlTemperature(), kdt.d(weatherItem)));
            }
        }
        ArrayList arrayList2 = arrayList;
        WeatherItem weatherItem2 = list.get(0);
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.d(new com.huami.bluetooth.profile.channel.module.voice.content.d.C0287d(Long.valueOf(kdt.c(weatherItem2.getDate()) / 1000), weatherItem2.getLocation(), weatherItem2.getTitle(), weatherItem2.getSubTitle(), weatherItem2.getDescription(), kdt.d(weatherItem2), weatherItem2.getcTemperature(), weatherItem2.gethTemperature(), weatherItem2.getlTemperature(), arrayList2, weatherItem2.getAqi()))));
    }

    public boolean setAccessInfo(HMAccessInfo hMAccessInfo) {
        return isConnected() && this.hmMiLiProDevice.c3(hMAccessInfo);
    }

    public boolean setActivityMode(int i2) {
        if (!isConnected()) {
            return false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.hmMiLiProDevice.H3(i2, new a1(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public boolean setAidInfo(HMAidInfo hMAidInfo) {
        return isConnected() && this.hmMiLiProDevice.d3(hMAidInfo);
    }

    public boolean setAlarmSync(List<AlarmClockExt> list) {
        if (isConnected()) {
            return this.hmMiLiProDevice.v3(list);
        }
        return false;
    }

    public boolean setAppSort(List<AppItem> list) {
        if (!isConnected()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).getType() != -1) {
                AppItem appItem = list.get(i2);
                arrayList.add(new ews(appItem.getIndex(), appItem.getType(), appItem.getParentType(), !appItem.isEnable()));
            }
        }
        return this.hmMiLiProDevice.U3(arrayList);
    }

    public void setAuthKey(String str) {
        this.hmMiLiProDevice.J().c(str);
    }

    public boolean setAutoBacklight(HMAutoBacklightInfo hMAutoBacklightInfo) {
        if (isConnected()) {
            return this.hmMiLiProDevice.e3(hMAutoBacklightInfo);
        }
        return false;
    }

    public void setAutoReconnect(boolean z2) {
        this.hmMiLiProDevice.B(z2);
    }

    public void setBatteryChangedCallback(IBatteryChangeCallback iBatteryChangeCallback) {
        if (iBatteryChangeCallback == null) {
            throw new IllegalArgumentException("IBatteryChangeCallback is null");
        }
        this.hmMiLiProDevice.K(new s0(iBatteryChangeCallback));
    }

    public void setCallback(IDeviceBaseCallback iDeviceBaseCallback) {
        this.deviceCallback = iDeviceBaseCallback;
    }

    public boolean setDateTimeSync(Calendar calendar) {
        return this.hmMiLiProDevice.G0(calendar);
    }

    public boolean setDisplayListSync(int i2, @NotNull List<DisplayBean> list) {
        t5t.d(TAG, "setDisplayList");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return false;
        }
        if (!neVar.V()) {
            t5t.d(TAG, "not connect!");
            return false;
        }
        DisplayListSettingModule displayListSettingModule = (DisplayListSettingModule) this.hmMiLiProDevice.y(DisplayListSettingModule.class);
        if (displayListSettingModule != null) {
            return displayListSettingModule.updateList(i2, list);
        }
        t5t.d(TAG, "module null!");
        return false;
    }

    public boolean setDistanceUnit(boolean z2) {
        return this.hmMiLiProDevice.L4(z2);
    }

    public boolean setGoal(int i2) {
        this.hmMiLiProDevice.Y3(i2, new f1());
        return true;
    }

    public boolean setHidStatus(HidStatus hidStatus) {
        if (isConnected()) {
            return this.hmMiLiProDevice.a3(hidStatus);
        }
        return false;
    }

    public boolean setHrReminder(boolean z2, int i2) {
        if (!isConnected()) {
            return false;
        }
        HMHrReminder hMHrReminder = new HMHrReminder(z2);
        hMHrReminder.setHr(i2);
        return this.hmMiLiProDevice.f3(hMHrReminder);
    }

    public void setLFEventCallback(ILFEventCallback iLFEventCallback) {
        if (iLFEventCallback == null) {
            throw new IllegalArgumentException("ILFEventCallback is null");
        }
        this.phoneMuteListener = new chs(iLFEventCallback);
        this.hmMiLiProDevice.d5(new s(iLFEventCallback));
    }

    public boolean setLanguage(HMLanguage hMLanguage) {
        return this.hmMiLiProDevice.g3(hMLanguage);
    }

    public boolean setLowHrReminder(HMHrReminder hMHrReminder) {
        t5t.d(TAG, "setLowHrReminder");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return false;
        }
        if (neVar.V()) {
            return neVar.e1().setLowHrReminder(hMHrReminder);
        }
        t5t.d(TAG, "not connect!");
        return false;
    }

    public boolean setLowSpo2AlertValue(int i2) {
        t5t.d(TAG, "setLowSpo2AlertValue");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return false;
        }
        if (neVar.V()) {
            return neVar.e1().setLowSpo2AlertValue(i2);
        }
        t5t.d(TAG, "not connect!");
        return false;
    }

    public void setMenstrualNotifiedDataListener(IMenstrualNotifiedDataCallback iMenstrualNotifiedDataCallback) {
        if (iMenstrualNotifiedDataCallback == null) {
            throw new IllegalArgumentException("IMenstrualNotifiedDataCallback is null");
        }
        this.hmMiLiProDevice.S2(new e0(iMenstrualNotifiedDataCallback));
    }

    public boolean setMenstruationNotify(boolean z2, int i2) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.hmMiLiProDevice.W2(z2, i2, new d0(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public boolean setMenstruationOvulation(boolean z2, int i2) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.hmMiLiProDevice.O3(z2, i2, new c0(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public boolean setMenstruationTotalRecord(MenstruationTotalRecord menstruationTotalRecord) {
        if (!isConnected()) {
            return false;
        }
        MenstruationModule menstruationModule = getMenstruationModule();
        if (menstruationModule == null) {
            t5t.d(TAG, "MenstruationModule is null");
            return false;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        menstruationModule.setMenstruationTotalRecord(menstruationTotalRecord, new z(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public boolean setMultiTarget(Boolean bool, Long l2, Boolean bool2, Long l3, Boolean bool3, Long l4, Boolean bool4, Long l5, Boolean bool5, Long l6) {
        final boolean zG0 = this.hmMiLiProDevice.g0();
        g4s g4sVarO = this.hmMiLiProDevice.O();
        final boolean z2 = g4sVarO != null && g4sVarO.A().hasSw(9);
        le.c(TAG, new Function0() { // from class: zjc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HuamiDevice.lambda$setMultiTarget$5(zG0, z2);
            }
        });
        if (!zG0 && !z2) {
            return false;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.hmMiLiProDevice.C2(new HMTarget(bool, l2, bool2, l3, null, null, null, null, bool3, l4, bool4, l5, bool5, l6), new n0(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public void setPair(boolean z2) {
        this.hmMiLiProDevice.J().d(z2);
    }

    public boolean setPasswordInteraction() {
        if (isConnected()) {
            return this.hmMiLiProDevice.j5();
        }
        return false;
    }

    public boolean setPeriodData(MenstrualPeriodData[] menstrualPeriodDataArr) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.hmMiLiProDevice.Y2(menstrualPeriodDataArr, new Function1() { // from class: akc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiDevice.lambda$setPeriodData$3(atomicBoolean, countDownLatch, (Boolean) obj);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public boolean setPressureAlert(boolean z2) {
        t5t.d(TAG, "setPressureAlert");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return false;
        }
        if (neVar.V()) {
            return neVar.e1().enablePressureAlert(z2);
        }
        t5t.d(TAG, "not connect!");
        return false;
    }

    public boolean setReminderSync(List<HMReminderInfo> list) {
        return this.hmMiLiProDevice.g4(list);
    }

    public boolean setSedentary(HMSedentaryConfig hMSedentaryConfig) {
        if (!isConnected()) {
            return false;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.hmMiLiProDevice.B2(hMSedentaryConfig, new l0(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public boolean setShortcutApp(List<ShortcutItem> list) {
        if (!isConnected()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (ShortcutItem shortcutItem : list) {
            arrayList.add(new ews(shortcutItem.getIndex(), shortcutItem.getType(), 253, shortcutItem.isHide()));
        }
        return this.hmMiLiProDevice.U3(arrayList);
    }

    public boolean setSmartSpo2(boolean z2) {
        t5t.d(TAG, "setSmartSpo2");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return false;
        }
        if (neVar.V()) {
            return neVar.e1().enableSmartSpo2(z2);
        }
        t5t.d(TAG, "not connect!");
        return false;
    }

    public HMCardTSResponse<Boolean> setTimeSwitchCardSync(HMCardSwitchTime hMCardSwitchTime) {
        return this.hmMiLiProDevice.E3(hMCardSwitchTime);
    }

    public boolean setTimeUnitSync(boolean z2) {
        return this.hmMiLiProDevice.R4(z2);
    }

    public boolean setToken() {
        t5t.d(TAG, "start setToken");
        WiFiControllerModule wiFiControllerModule = (WiFiControllerModule) this.hmMiLiProDevice.y(WiFiControllerModule.class);
        if (wiFiControllerModule == null) {
            return false;
        }
        boolean zA = new j7().a(wiFiControllerModule, this.hmMiLiProDevice.O());
        t5t.d(TAG, "setToken ret: " + zA);
        return zA;
    }

    public boolean setUnwearPassword(boolean z2, String str) {
        return this.hmMiLiProDevice.A3(z2, str);
    }

    public boolean setUserInfoSync(UserInfoExt userInfoExt) {
        if (!isConnected()) {
            return false;
        }
        boolean zK3 = this.hmMiLiProDevice.k3(userInfoExt);
        t5t.d(TAG, "setUserInfo:" + zK3);
        if (zK3) {
            return setGoal(userInfoExt.getGoal());
        }
        return false;
    }

    public boolean setVibrate(VibrateType vibrateType, short s2, short[] sArr) {
        qos qosVar = new qos(s2, sArr);
        qosVar.c = false;
        qosVar.d = true;
        qosVar.e = (short) vibrateType.ordinal();
        boolean vibrateWithTest = setVibrateWithTest(qosVar);
        t5t.d(TAG, "setVibrate ret: " + vibrateWithTest);
        return vibrateWithTest;
    }

    public void setVoiceCallback(IVoiceCallback iVoiceCallback) {
        if (iVoiceCallback == null) {
            throw new IllegalArgumentException("IVoiceCallback is null");
        }
        VoiceModule aiVoiceModule = getAiVoiceModule();
        if (aiVoiceModule == null) {
            t5t.d(TAG, "module is null");
        } else {
            aiVoiceModule.setCallback(new o(iVoiceCallback));
        }
    }

    public boolean setWearLocation(boolean z2) {
        if (!isConnected()) {
            return false;
        }
        kk kkVar = new kk();
        if (z2) {
            kkVar.c(kk.b.WRIST);
            kkVar.b(kk.a.LEFT);
        } else {
            kkVar.c(kk.b.WRIST);
            kkVar.b(kk.a.RIGHT);
        }
        this.hmMiLiProDevice.R2(kkVar, new q());
        return true;
    }

    public boolean setWeatherInfo(final HMWeatherInfo hMWeatherInfo) {
        if (isConnected()) {
            return this.hmMiLiProDevice.y3(new Function0() { // from class: bkc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HuamiDevice.lambda$setWeatherInfo$2(hMWeatherInfo);
                }
            });
        }
        return false;
    }

    public boolean setWeatherTemperatureUnit(byte b2) {
        t5t.d(TAG, "start setWeatherTemperatureUnit");
        boolean zZ2 = this.hmMiLiProDevice.Z2(b2);
        t5t.d(TAG, "setWeatherTemperatureUnit ret: " + zZ2);
        return zZ2;
    }

    public boolean setWorldClock(List<WorldTime> list) {
        if (!isConnected()) {
            return false;
        }
        WorldClockModule worldClockModule = getWorldClockModule();
        if (worldClockModule != null) {
            return worldClockModule.setWorldClockSync(list);
        }
        t5t.d(TAG, "WorldClockModule is null");
        return false;
    }

    public boolean showContactInDevice(boolean z2) {
        return this.hmMiLiProDevice.s3(fd.ALERT_INCALL, z2);
    }

    public void shutdown() {
        this.hmMiLiProDevice.Y();
    }

    public boolean sportConfig(SportKind sportKind, IHMSportListener iHMSportListener) {
        if (!isConnected()) {
            t5t.d(TAG, "sportConfig is not connected");
            return false;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.hmMiLiProDevice.F2(new SportConfig(sportKind), iHMSportListener, new j(atomicBoolean));
        return atomicBoolean.get();
    }

    public boolean sportNotifyGpsState(GpsState gpsState) {
        r6t r6tVar = new r6t();
        r6tVar.o(gpsState.getValue());
        return sportCommandPiece(SportCommand.SHOW, r6tVar);
    }

    public boolean sportNotifyHr(int i2) {
        r6t r6tVar = new r6t();
        r6tVar.q(i2);
        return sportCommand(SportCommand.NOTIFY, r6tVar);
    }

    public boolean sportNotifyKm(float f2, int i2) {
        r6t r6tVar = new r6t();
        r6tVar.m(i2);
        r6tVar.k((int) f2);
        return sportCommand(SportCommand.NOTIFY, r6tVar);
    }

    public boolean sportNotifyPace(int i2) {
        r6t r6tVar = new r6t();
        r6tVar.s(i2);
        return sportCommand(SportCommand.NOTIFY, r6tVar);
    }

    public boolean sportNotifyTemperature(SportTemperature sportTemperature) {
        r6t r6tVar = new r6t();
        r6tVar.d(sportTemperature);
        return sportCommand(SportCommand.NOTIFY, r6tVar);
    }

    public boolean sportPause() {
        return sportCommand(SportCommand.PAUSE, null);
    }

    public boolean sportResume(int i2) {
        r6t r6tVar = new r6t();
        r6tVar.m(i2);
        return sportCommand(SportCommand.RESUME, r6tVar);
    }

    public boolean sportShow(SportData sportData) {
        r6t r6tVar = new r6t();
        r6tVar.q(sportData.getHr());
        r6tVar.k((int) sportData.getDistance());
        r6tVar.s(getPace(sportData.getPace()));
        r6tVar.b(getPace(sportData.getAvePace()));
        r6tVar.z((int) (sportData.getStepFreq() * 60.0f));
        r6tVar.x(sportData.getStep());
        r6tVar.u(getSpeed(sportData.getPace()));
        r6tVar.g(getSpeed(sportData.getAvePace()));
        r6tVar.h(sportData.getCal());
        r6tVar.A(sportData.getStepLen());
        r6tVar.c(sportData.getSportType());
        r6tVar.m(sportData.getElapsedTime());
        return sportCommand(SportCommand.SHOW, r6tVar);
    }

    public boolean sportStart(int i2, int i3) {
        r6t r6tVar = new r6t();
        r6tVar.w(i2);
        r6tVar.m(i3);
        return sportCommand(SportCommand.START, r6tVar);
    }

    public boolean sportStop() {
        return sportCommand(SportCommand.STOP, null);
    }

    public void startHttpProxy(RequestInterceptor requestInterceptor) {
        this.proxySetter.a(this.hmMiLiProDevice, requestInterceptor);
    }

    public void startRealtimeMeasureHr(ISportHrCallback iSportHrCallback) {
        if (iSportHrCallback == null) {
            throw new IllegalArgumentException("ISportHrCallback is null");
        }
        this.hmMiLiProDevice.i1(new y(iSportHrCallback));
    }

    public void startSyncAtrialFibData(Calendar calendar, IAtrialFibCallback iAtrialFibCallback) {
        if (iAtrialFibCallback == null) {
            throw new IllegalArgumentException("IAtrialFibCallback is null");
        }
        this.hmMiLiProDevice.Q2(calendar, new t0(17, iAtrialFibCallback));
    }

    public void startSyncFirstbeatData(Calendar calendar, Calendar calendar2, IHMFirstbeatDataCallback iHMFirstbeatDataCallback) {
        if (iHMFirstbeatDataCallback == null) {
            throw new IllegalArgumentException("IHMFirstbeatDataCallback is null");
        }
        if (this.hmMiLiProDevice.g0()) {
            new rt(calendar, this.hmMiLiProDevice, iHMFirstbeatDataCallback).b();
        } else {
            this.hmMiLiProDevice.O2(calendar, calendar2, iHMFirstbeatDataCallback);
        }
    }

    public void startSyncGpsData(Calendar calendar, IHMSportDataCallback iHMSportDataCallback) {
        if (iHMSportDataCallback == null) {
            throw new IllegalArgumentException("IHMSportDataCallback is null");
        }
        DeviceInfoExt deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            iHMSportDataCallback.onStart();
            iHMSportDataCallback.onFinish(false);
            return;
        }
        t5t.d(TAG, "startSyncGpsData start:" + System.currentTimeMillis());
        this.hmMiLiProDevice.t(calendar, new g1(iHMSportDataCallback, deviceInfo));
    }

    public void startSyncPaiData(Calendar calendar, ISyncPaiCallback iSyncPaiCallback) {
        if (iSyncPaiCallback == null) {
            throw new IllegalArgumentException("ISyncPaiCallback is null");
        }
        UserInfoExt userInfoSync = getUserInfoSync();
        if (userInfoSync != null) {
            this.hmMiLiProDevice.M3(calendar, new i0(iSyncPaiCallback, userInfoSync));
            return;
        }
        iSyncPaiCallback.onStart();
        iSyncPaiCallback.onFinish(null);
        t5t.d(TAG, "userInfoExt is null");
    }

    public void startSyncPressureDataAllDay(long j2, Calendar calendar, ISyncPressureDataAllDayCallback iSyncPressureDataAllDayCallback) {
        if (iSyncPressureDataAllDayCallback == null) {
            throw new IllegalArgumentException("ISyncPressureDataAllDayCallback is null");
        }
        DeviceInfoExt deviceInfo = getDeviceInfo();
        if (deviceInfo != null) {
            this.hmMiLiProDevice.P2(calendar, new k0(iSyncPressureDataAllDayCallback, j2, deviceInfo));
            return;
        }
        iSyncPressureDataAllDayCallback.onPressureStart();
        iSyncPressureDataAllDayCallback.onPressureStop(false);
        t5t.d(TAG, "userInfoExt or deviceInfoExt is null");
    }

    public void startSyncPressureDataSingle(long j2, Calendar calendar, ISyncPressureDataSingleCallback iSyncPressureDataSingleCallback) {
        if (iSyncPressureDataSingleCallback == null) {
            throw new IllegalArgumentException("ISyncPressureDataSingleCallback is null");
        }
        DeviceInfoExt deviceInfo = getDeviceInfo();
        if (deviceInfo != null) {
            this.hmMiLiProDevice.N3(calendar, new j0(iSyncPressureDataSingleCallback, j2, deviceInfo));
            return;
        }
        iSyncPressureDataSingleCallback.onPressureStart();
        iSyncPressureDataSingleCallback.onPressureStop(false);
        t5t.d(TAG, "userInfoExt or deviceInfoExt is null");
    }

    public void startSyncSpO2Data(Calendar calendar, ISpO2Callback iSpO2Callback) {
        if (iSpO2Callback == null) {
            throw new IllegalArgumentException("ISpO2Callback is null");
        }
        t5t.d(TAG, "startSyncSpO2Data");
        bt.f4578a.a(this.hmMiLiProDevice, calendar, iSpO2Callback);
    }

    public void stopHttpProxy() {
        this.proxySetter.a(this.hmMiLiProDevice);
    }

    public boolean stopRealtimeMeasureHr() {
        if (!isConnected()) {
            return false;
        }
        this.hmMiLiProDevice.h1();
        return true;
    }

    public boolean stopVoiceCommand() {
        return sendVoiceCommand(new vv());
    }

    public void storageStatus(String str, ISkinStorageStatusCallback iSkinStorageStatusCallback) {
        if (iSkinStorageStatusCallback == null) {
            throw new IllegalArgumentException("ISkinStorageStatusCallback is null");
        }
        if (!isConnected()) {
            t5t.d(TAG, "storageStatus:not connect");
            iSkinStorageStatusCallback.onMemory(false);
        } else if (!this.hmMiLiProDevice.O().A().hasSw(15)) {
            iSkinStorageStatusCallback.onMemory(true);
        } else {
            Long[] fileUIHInfo = getFileUIHInfo(new File(str));
            this.hmMiLiProDevice.n2(fileUIHInfo[0].longValue(), fileUIHInfo[1].longValue(), new h(iSkinStorageStatusCallback));
        }
    }

    public boolean supportFirstbeat() {
        Feature featureA;
        if (this.hmMiLiProDevice.g0()) {
            return true;
        }
        g4s g4sVarO = this.hmMiLiProDevice.O();
        if (g4sVarO == null || (featureA = g4sVarO.A()) == null) {
            return false;
        }
        return featureA.hasSw(10);
    }

    public boolean supportHrDetection() {
        return this.hmMiLiProDevice.O().A().hasSw(53);
    }

    public boolean supportHrDetectionData() {
        return this.hmMiLiProDevice.O().A().hasSw(54);
    }

    public boolean supportLinkageMiuiAlarm() {
        g4s g4sVarO;
        Feature featureA;
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null || (g4sVarO = neVar.O()) == null || (featureA = g4sVarO.A()) == null) {
            return false;
        }
        return featureA.hasSw(60);
    }

    public boolean supportLowOsaData() {
        return this.hmMiLiProDevice.O().A().hasSw(55);
    }

    public boolean supportNightModeSetting() {
        if (isConnected()) {
            return um.f35921a.a(this.hmMiLiProDevice);
        }
        return false;
    }

    public boolean supportSilentUpgrade() {
        return eb.b(this.hmMiLiProDevice);
    }

    public boolean switchMenstruationDeviceNotify(boolean z2) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.hmMiLiProDevice.q4(z2, new f0(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public boolean switchSmartPredict(boolean z2) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.hmMiLiProDevice.v4(z2, new h0(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public void syncActivityDataFromDevice(Calendar calendar, AbsActivityTodayCallback absActivityTodayCallback) {
        this.hmMiLiProDevice.a4(calendar, new w0(absActivityTodayCallback));
    }

    public void syncActivityDataToDevice(ArrayList<ActivityData> arrayList, AbsActivityTodayCallback absActivityTodayCallback) {
        this.hmMiLiProDevice.K2(arrayList, new x0(absActivityTodayCallback));
    }

    public void syncSkin(String str, ISyncSkinCallback iSyncSkinCallback) {
        if (iSyncSkinCallback == null) {
            throw new IllegalArgumentException("ISyncSkinCallback is null");
        }
        if (!isConnected()) {
            iSyncSkinCallback.onStart();
            iSyncSkinCallback.onStop(1);
        } else if (!isDfuBusy()) {
            this.hmMiLiProDevice.D0(new xd(str, yd.FIRMWARE_DIAL), new i(iSyncSkinCallback));
        } else {
            iSyncSkinCallback.onStart();
            iSyncSkinCallback.onStop(2);
        }
    }

    public boolean syncStandAlertConfig(@NotNull StandAlertConfig standAlertConfig) {
        return this.hmMiLiProDevice.b3(standAlertConfig);
    }

    public List<byte[]> syncStatisticData() {
        if (isConnected()) {
            return h7.b(this.hmMiLiProDevice);
        }
        t5t.d(TAG, "syncStatisticData is not connect");
        return null;
    }

    public boolean testVibrate(short[] sArr) {
        if (!isConnected()) {
            t5t.d(TAG, "testVibrate not connected");
            return false;
        }
        boolean zR3 = this.hmMiLiProDevice.r3(qos.b(sArr));
        t5t.d(TAG, "testVibrate ret: " + zR3);
        return zR3;
    }

    public boolean triggerPair() {
        if (!isConnected()) {
            return false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.hmMiLiProDevice.h5(new c(atomicBoolean, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public boolean unbindSync() {
        if (!isConnected()) {
            return false;
        }
        ne neVar = this.hmMiLiProDevice;
        return neVar.V3(neVar.J());
    }

    public boolean updateFindPhoneStatus(boolean z2) {
        if (!isConnected()) {
            return false;
        }
        ta taVarA = ua.f35555a.a(this.hmMiLiProDevice);
        if (taVarA == null) {
            t5t.d(TAG, "FindDeviceApi is null!!!");
            return false;
        }
        if (z2) {
            taVarA.c(new u());
            return true;
        }
        taVarA.a(new w());
        return true;
    }

    public void updateFwUpgrade(boolean z2, int i2, HashMap<FwType, String> map, String str, IFirmwareProgressCallback iFirmwareProgressCallback) {
        if (map == null) {
            throw new IllegalArgumentException("firmwares is null");
        }
        if (iFirmwareProgressCallback == null) {
            throw new IllegalArgumentException("IFirmwareProgressCallback is null");
        }
        if (map.isEmpty()) {
            t5t.d(TAG, "firmwares isEmpty!");
        } else {
            r3t.y().j(this.mContext, z2, i2, map.get(FwType.FIRMWARE), map.get(FwType.RESOURCE_BASE), map.get(FwType.RESOURCE_COMPRESS), map.get(FwType.RESOURCE_EXTERNAL), map.get(FwType.FONT), map.get(FwType.FIRMWARE_GPS), str, this.hmMiLiProDevice, iFirmwareProgressCallback);
        }
    }

    public HMNFCCardStatus updateNfcCardConfig(HMNFCCardConfig hMNFCCardConfig) {
        if (isConnected()) {
            return this.hmMiLiProDevice.d2(hMNFCCardConfig);
        }
        return null;
    }

    public boolean updateNfcCardList(List<HMNFCCardIdent> list, HMNFCCardType hMNFCCardType) {
        return isConnected() && this.hmMiLiProDevice.w3(list, hMNFCCardType);
    }

    public boolean updatePasswordInteraction(String str) {
        if (isConnected()) {
            return this.hmMiLiProDevice.S3(str);
        }
        return false;
    }

    public boolean updatePhoneMuteState(boolean z2) {
        if (isConnected()) {
            defpackage.j0.v.a().a(this.hmMiLiProDevice, z2);
            return true;
        }
        t5t.d(TAG, "updatePhoneMuteState isConnected = false");
        return false;
    }

    public boolean updateWeatherSettings(WeatherSetting weatherSetting) {
        t5t.d(TAG, "start updateWeatherSettings");
        WeatherModule weatherModule = getWeatherModule();
        if (weatherModule == null) {
            return false;
        }
        boolean zUpdateWeatherSettings = weatherModule.updateWeatherSettings(weatherSetting);
        t5t.d(TAG, "updateWeatherSettings ret: " + zUpdateWeatherSettings);
        return zUpdateWeatherSettings;
    }

    public boolean writeCityList(@NotNull ArrayList<City> arrayList) {
        t5t.d(TAG, "start write cityList: " + arrayList);
        WeatherModule weatherModule = getWeatherModule();
        if (weatherModule == null) {
            return false;
        }
        boolean cityList = weatherModule.setCityList(arrayList);
        t5t.d(TAG, "setCityList ret: " + cityList);
        return cityList;
    }

    public boolean writeSettingSync(@NotNull Settings settings) {
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        map.put(settings.getV(), settings);
        return writeSettingSync(map);
    }

    public void writeSleepBack(SleepDataSource sleepDataSource) {
        if (sleepDataSource == null) {
            throw new IllegalArgumentException("sleepDataSource is null");
        }
        if (isConnected()) {
            px.a(this.hmMiLiProDevice, sleepDataSource);
        } else {
            t5t.d(TAG, "writeSleepBack is not connected");
        }
    }

    public HuamiDevice(Context context, String str, byte b2) {
        this.lfEventAdapterManager = new vj();
        this.proxySetter = new ah();
        initSupportBindDeviceSource();
        initSupportGPS();
        this.mContext = context;
        ne neVar = new ne(context, str);
        this.hmMiLiProDevice = neVar;
        neVar.q(this);
        this.hmMiLiProDevice.r(this);
        this.hmMiLiProDevice.w(new xct(UUID.randomUUID().toString(), false, b2));
        this.hmMiLiProDevice.W0(new v());
    }

    public DailyDataResult getDailyData(long j2, int i2, UserInfoExt userInfoExt, List<SleepManualData> list, boolean z2, boolean z3, IDailyDataSyncCallback iDailyDataSyncCallback) {
        List<Spo2Data> listA;
        List<Spo2Data> listB;
        DeviceInfoExt deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            DailyDataResult dailyDataResult = new DailyDataResult();
            dailyDataResult.setError(3);
            return dailyDataResult;
        }
        Calendar calendarM = njs.m(j2, i2);
        t5t.m(TAG, "getDailyData:" + calendarM.getTime());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicInteger atomicInteger = new AtomicInteger(-2);
        t5t.d(TAG, "getDailyData sync time start:" + System.currentTimeMillis());
        this.hmMiLiProDevice.A0(calendarM, new c1(iDailyDataSyncCallback, atomicReference, atomicInteger, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        boolean z4 = supportSleepBreathScore() && z3;
        List list2 = (List) atomicReference.get();
        if (list2 == null) {
            t5t.d(TAG, "dataFragmentList is null!");
            DailyDataResult dailyDataResult2 = new DailyDataResult();
            dailyDataResult2.setError(atomicInteger.get());
            return dailyDataResult2;
        }
        if (z4) {
            listA = ln.a(this.hmMiLiProDevice, calendarM);
            listB = ln.b(this.hmMiLiProDevice, calendarM);
            iDailyDataSyncCallback.onOsaDataSyncFinish();
        } else {
            listA = null;
            listB = null;
        }
        j3t j3tVarI = njs.i(userInfoExt, calendarM, list2, list, z2);
        j3tVarI.j(atomicInteger.get());
        j3tVarI.f(deviceInfo.getDeviceId());
        DailyDataResult dailyDataResultD = njs.d(j3tVarI, userInfoExt, this.hmMiLiProDevice.O().I());
        if (z4) {
            ln.a(this.hmMiLiProDevice, listA, listB, dailyDataResultD, userInfoExt.getUid());
        }
        return dailyDataResultD;
    }

    public boolean sendVoiceDeleteAlarmCommand(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.a(2, 1, list, null)));
        }
        t5t.d(TAG, "sendVoiceDeleteAlarmCommand token is null or empty");
        return false;
    }

    public boolean sendVoiceDeleteReminderCommand(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.a(2, 2, list, null)));
        }
        t5t.d(TAG, "sendVoiceDeleteReminderCommand token is null or empty");
        return false;
    }

    public boolean sendVoiceDeleteTimerCommand(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.a(2, 3, list, null)));
        }
        t5t.d(TAG, "sendVoiceDeleteTimerCommand token is null or empty");
        return false;
    }

    public boolean sendVoiceSetTimerCommand(long j2, String str) {
        if (j2 == -1) {
            return false;
        }
        jdt jdtVarH = kdt.h(j2);
        if ((jdtVarH.a() * 60) + jdtVarH.b() > 99) {
            return doAlertTips(str);
        }
        return sendVoiceCommand(new om(new com.huami.bluetooth.profile.channel.module.voice.content.c(11, new com.huami.bluetooth.profile.channel.module.voice.content.c.d(0, Integer.valueOf((int) jdtVarH.a()), Integer.valueOf((int) jdtVarH.b()), Integer.valueOf((int) jdtVarH.c())))));
    }

    public boolean writeSettingSync(@NotNull HashMap<SettingsGroupType, Settings> map) {
        t5t.d(TAG, "writeSetting");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return false;
        }
        if (!neVar.V()) {
            t5t.d(TAG, "not connect!");
            return false;
        }
        SettingsModule settingsModule = (SettingsModule) this.hmMiLiProDevice.y(SettingsModule.class);
        if (settingsModule == null) {
            t5t.d(TAG, "module null!");
            return false;
        }
        return settingsModule.writeSettingSync(map);
    }

    @Nullable
    public HashMap<SettingsGroupType, Settings> querySettingSync(@Nullable SettingsGroupType[] settingsGroupTypeArr) {
        t5t.d(TAG, "querySetting");
        ne neVar = this.hmMiLiProDevice;
        if (neVar == null) {
            t5t.d(TAG, "device null!");
            return null;
        }
        if (!neVar.V()) {
            t5t.d(TAG, "not connect!");
            return null;
        }
        SettingsModule settingsModule = (SettingsModule) this.hmMiLiProDevice.y(SettingsModule.class);
        if (settingsModule == null) {
            t5t.d(TAG, "module null!");
            return null;
        }
        if (settingsGroupTypeArr == null) {
            settingsGroupTypeArr = new SettingsGroupType[0];
        }
        return settingsModule.querySettingsSync(true, settingsGroupTypeArr);
    }

    public boolean enableGoalRemind(boolean z2, long j2) {
        boolean z3 = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        m0 m0Var = new m0(atomicBoolean, countDownLatch);
        final boolean zG0 = this.hmMiLiProDevice.g0();
        g4s g4sVarO = this.hmMiLiProDevice.O();
        if (g4sVarO != null && g4sVarO.A().hasSw(9)) {
            z3 = true;
        }
        le.c(TAG, new Function0() { // from class: xjc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HuamiDevice.lambda$enableGoalRemind$4(zG0);
            }
        });
        if (!zG0 && !z3) {
            this.hmMiLiProDevice.f4(z2, m0Var);
        } else {
            this.hmMiLiProDevice.C2(new HMTarget(Boolean.valueOf(z2), Long.valueOf(j2), Boolean.valueOf(z2), null, Boolean.valueOf(z2), null, Boolean.valueOf(z2), null, Boolean.valueOf(z2), null, Boolean.valueOf(z2), null, Boolean.valueOf(z2), null), m0Var);
        }
        try {
            countDownLatch.await();
        } catch (Exception e2) {
            t5t.m(TAG, "latch await exception:" + e2.getMessage());
        }
        return atomicBoolean.get();
    }

    public boolean sendVoiceSetAlarmCommand(List<String> list, long j2, int i2) {
        com.huami.bluetooth.profile.channel.module.voice.content.a aVar;
        VoiceConfig voiceConfig = this.voiceConfig;
        if (voiceConfig != null && voiceConfig.getVersion() >= 3) {
            aVar = new com.huami.bluetooth.profile.channel.module.voice.content.a(1, 1, list, new com.huami.bluetooth.profile.channel.module.voice.content.a.d("", "", kdt.b(j2) / 1000, 0L, i2, true));
        } else {
            aVar = new com.huami.bluetooth.profile.channel.module.voice.content.a(1, 1, list, new com.huami.bluetooth.profile.channel.module.voice.content.a.c("", "", kdt.b(j2) / 1000, 0L, i2));
        }
        return sendVoiceCommand(new om(aVar));
    }

    public boolean alertApp(HMAlertApp hMAlertApp, int i2, String str, String str2, String str3) {
        return alertApp(hMAlertApp, i2, str, str2, "", str3);
    }

    public boolean sendVoiceSetReminderCommand(List<String> list, String str, long j2, int i2) {
        com.huami.bluetooth.profile.channel.module.voice.content.a aVar;
        t5t.d(TAG, "repeat:" + i2);
        if (i2 == -1) {
            return false;
        }
        String str2 = TextUtils.isEmpty(str) ? "" : str;
        VoiceConfig voiceConfig = this.voiceConfig;
        if (voiceConfig != null && voiceConfig.getVersion() >= 3) {
            aVar = new com.huami.bluetooth.profile.channel.module.voice.content.a(1, 2, list, new com.huami.bluetooth.profile.channel.module.voice.content.a.d(str2, str2, kdt.b(j2) / 1000, 0L, i2, true));
        } else {
            aVar = new com.huami.bluetooth.profile.channel.module.voice.content.a(1, 2, list, new com.huami.bluetooth.profile.channel.module.voice.content.a.c(str2, str2, kdt.b(j2) / 1000, 0L, i2));
        }
        return sendVoiceCommand(new om(aVar));
    }

    public class s extends HMCallback<q1t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ILFEventCallback f13552a;

        public s(ILFEventCallback iLFEventCallback) {
            this.f13552a = iLFEventCallback;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(q1t q1tVar) {
            SportConfig sportConfig;
            ik ikVarC = q1tVar.c();
            byte[] bArrB = q1tVar.b();
            switch (d1.c[ikVarC.ordinal()]) {
                case 1:
                    this.f13552a.onAlarmChange(HuamiDevice.this.getAlarms());
                    break;
                case 2:
                    HuamiDevice.this.getAlarmChange(this.f13552a);
                    break;
                case 3:
                    if (bArrB != null && bArrB.length >= 1 && (bArrB[0] & 255) == 0) {
                        if (bArrB.length == 1) {
                            sportConfig = new SportConfig(SportKind.OUTDOOR, 1, true);
                        } else if (bArrB.length == 3) {
                            sportConfig = new SportConfig(SportKind.from(bArrB[2]), 1, (bArrB[1] & 255) == 1);
                        }
                        ne neVar = HuamiDevice.this.hmMiLiProDevice;
                        final ILFEventCallback iLFEventCallback = this.f13552a;
                        neVar.F2(sportConfig, new IHMSportListener() { // from class: dkc
                            @Override // com.xiaomi.hm.health.bt.profile.sport.IHMSportListener
                            public final void onSportCommand(SportCommand sportCommand) {
                                HuamiDevice.s.a(iLFEventCallback, sportCommand);
                            }
                        }, new HMCallback());
                        this.f13552a.onSportStart(sportConfig.isNeedGps());
                        break;
                    }
                    break;
                case 4:
                    this.f13552a.ignoreCall();
                    break;
                case 5:
                    this.f13552a.endCall();
                    break;
                case 6:
                    if (bArrB != null && bArrB.length == 1) {
                        try {
                            byte b2 = bArrB[0];
                            if (b2 == 1) {
                                this.f13552a.phoneMuteMode();
                            } else if (b2 == 0) {
                                this.f13552a.phoneNormalMode();
                            }
                        } catch (Exception e) {
                            t5t.m(HuamiDevice.TAG, e.toString());
                            return;
                        }
                        break;
                    }
                    break;
                case 7:
                    if (bArrB != null && bArrB.length == 1 && bArrB[0] > 5) {
                        this.f13552a.illegalBind();
                        break;
                    }
                    break;
                case 8:
                    this.f13552a.onReminderChange(HuamiDevice.this.getRemindersSync());
                    break;
                case 9:
                    this.f13552a.onFindPhone(true);
                    break;
                case 10:
                    this.f13552a.onFindPhone(false);
                    break;
                case 11:
                    byte[] bArrB2 = q1tVar.b();
                    if (bArrB2 != null && bArrB2.length == 1) {
                        HuamiDevice.this.musicControl(bArrB2, this.f13552a);
                        break;
                    }
                    break;
                case 12:
                    if (bArrB != null && bArrB.length == 1 && bArrB[0] == 1) {
                        this.f13552a.onHrOpen();
                        break;
                    }
                    break;
                case 13:
                    if (bArrB != null && bArrB.length == 4) {
                        int i = (bArrB[0] & 255) | ((bArrB[1] & 255) << 8) | ((bArrB[2] & 255) << 16) | ((bArrB[3] & 255) << 24);
                        t5t.d(HuamiDevice.TAG, "deleteId:" + i);
                        this.f13552a.onNotificationDelete(i);
                        break;
                    }
                    break;
                case 14:
                    if (bArrB != null && bArrB.length > 0) {
                        this.f13552a.onHrDetectionInterval(bArrB[0]);
                        break;
                    }
                    break;
                case 15:
                    if (bArrB != null && bArrB.length > 0) {
                        this.f13552a.onAllDayPressureChange(bArrB[0] != 0);
                        break;
                    }
                    break;
                case 16:
                    if (bArrB != null && bArrB.length > 0) {
                        this.f13552a.onAtrialFibChanged(bArrB[0] != 0);
                        break;
                    }
                    break;
                case 17:
                    this.f13552a.onAlarmCancel();
                    break;
                case 18:
                    this.f13552a.onAlarmDelay();
                    break;
            }
        }

        public static /* synthetic */ void a(ILFEventCallback iLFEventCallback, SportCommand sportCommand) {
            if (sportCommand == SportCommand.STOP) {
                iLFEventCallback.onSportStop();
            }
        }
    }
}
