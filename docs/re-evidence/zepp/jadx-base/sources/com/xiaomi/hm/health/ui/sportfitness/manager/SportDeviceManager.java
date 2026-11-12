package com.xiaomi.hm.health.ui.sportfitness.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.SensorManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.mifit.sportlib.devicekit.ISportDeviceCallback;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.tts.RunningPlayer;
import com.huami.mifit.sportlib.tts.SpeedVoiceInfo;
import com.huami.mifit.sportlib.utils.FunctionSwitcher;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import com.huami.mifit.sportlib.utils.RunDataConversion;
import com.huami.moving.datacenter.SportConfigDbClient;
import com.huami.moving.device.ISportUsingDeviceDelegate;
import com.huami.moving.device.SportDeviceProxy;
import com.huami.moving.sport.ui.common.HrZoneShowRuleConfig;
import com.huami.moving.ui.utils.SportUIKeeper;
import com.huami.tools.log.HMLog;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.GaitInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportInfo;
import com.xiaomi.hm.health.bt.profile.sport.SportKind;
import com.xiaomi.hm.health.databases.model.Runconfig;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.devicelib.DeviceConnectionStatus;
import com.xiaomi.hm.health.devicelib.DeviceHr;
import com.xiaomi.hm.health.devicelib.DeviceHrEvent;
import com.xiaomi.hm.health.devicelib.DeviceStep;
import com.xiaomi.hm.health.devicelib.HeartRateStatus;
import com.xiaomi.hm.health.devicelib.PhonePressure;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import com.xiaomi.hm.health.ui.sportdevice.utils.SportOpenDeviceUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public final class SportDeviceManager implements ISportDeviceCallback, ISportUsingDeviceDelegate, IHMSportListener, DeviceCenter.IPeripheralListener {
    public static final int SPORT_OPEN_DEVICE_MAX_COUNT = 2;

    @SuppressLint({"StaticFieldLeak"})
    private static SportDeviceManager v = null;
    private static final int w = -2;
    private static final String x = "SportDeviceManager";
    private final Context a;
    private Runconfig b;
    private boolean c;
    private HMDeviceSource d;
    private int e;
    private HMDeviceSource f;
    private HMDeviceSource g;
    private HMDeviceSource h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int[] m;
    private List<HMDeviceSource> n;
    private Map<HMDeviceSource, Boolean> o;
    private Lazy<DeviceSnService> p;
    private long q;
    private long r;
    private long s;
    private long t;
    private SportInfo u;

    public class a implements Comparator<HMDeviceSource> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(HMDeviceSource o1, HMDeviceSource o2) {
            return o2.getType().getValue() - o1.getType().getValue();
        }
    }

    public class b extends HMCallback {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public b(final long val$timeStamp, final int val$distance, final int val$steps, final int val$sportSource) {
            this.a = val$timeStamp;
            this.b = val$distance;
            this.c = val$steps;
            this.d = val$sportSource;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            if (result) {
                return;
            }
            SportDeviceManager.this.l(this.a, this.b, this.c, this.d);
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            a = iArr;
            try {
                iArr[HMDeviceSource.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceSource.MILI_1A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceSource.MILI_1S.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceSource.MILI_PRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceSource.MILI_ROCKY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceSource.MILI_WUHAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMDeviceSource.MILI_CHONGQING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMDeviceSource.MILI_RIO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO_L.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[HMDeviceSource.MILI_TEMPO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS_P.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS_W.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[HMDeviceSource.SHOES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[HMDeviceSource.SHOES_CHILD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[HMDeviceSource.SHOES_SPRANDI.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[HMDeviceSource.SHOES_LIGHT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[HMDeviceSource.SHOES_MARS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[HMDeviceSource.OTHER_BM.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[HMDeviceSource.MILI_DTH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[HMDeviceSource.MILI_DTH_W.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_L.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_O.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_OL.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO_L.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO_WL.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                a[HMDeviceSource.MILI_PYH.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                a[HMDeviceSource.MILI_PYH_W.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                a[HMDeviceSource.WATCH_AMAZFIT.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                a[HMDeviceSource.WATCH_AMAZFIT_QOG.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                a[HMDeviceSource.WATCH_EVEREST.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                a[HMDeviceSource.WATCH_EVEREST_2S.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                a[HMDeviceSource.SMART_WATCH_EVEREST_2.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                a[HMDeviceSource.SMART_WATCH_EVEREST_2S.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                a[HMDeviceSource.SMART_WATCH_EVEREST_2SW.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                a[HMDeviceSource.SMART_WATCH_EVEREST_2W.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                a[HMDeviceSource.WATCH_AMAZFIT_XIHU.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                a[HMDeviceSource.WATCH_AMAZFIT_XIHU_E.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                a[HMDeviceSource.WATCH_AMAZFIT_XIHU_EA.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                a[HMDeviceSource.WATCH_AMAZFIT_XIHU_DISNEY.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON_L.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON_W.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON_WL.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON_DISNEY.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_L.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_W.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_WL.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_SWK.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                a[HMDeviceSource.MILI_HAWK_SWK_W.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                a[HMDeviceSource.MILI_KESTREL_L.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                a[HMDeviceSource.MILI_KESTREL_WL.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                a[HMDeviceSource.MILI_KESTREL.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                a[HMDeviceSource.MILI_KESTREL_W.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                a[HMDeviceSource.MILI_VULTURE.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                a[HMDeviceSource.MILI_ANETO.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                a[HMDeviceSource.MILI_VENICE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                a[HMDeviceSource.MILI_VENICE_W.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                a[HMDeviceSource.OTHER_BOLT.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                a[HMDeviceSource.OTHER_BOLT_SECOND.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                a[HMDeviceSource.OTHER_MOZART.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                a[HMDeviceSource.MILI_ONYX.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                a[HMDeviceSource.MILI_ONYX_W.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                a[HMDeviceSource.MILI_CORSICA.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                a[HMDeviceSource.MILI_CORSICA_W.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                a[HMDeviceSource.MILI_OSPREY.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                a[HMDeviceSource.MILI_OSPREY_C.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                a[HMDeviceSource.MILI_OSPREY_W.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                a[HMDeviceSource.MILI_LISBON.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                a[HMDeviceSource.MILI_LISBON_W.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                a[HMDeviceSource.MILI_LINCS.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                a[HMDeviceSource.MILI_LINCS_W.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                a[HMDeviceSource.MILI_NEWTON.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                a[HMDeviceSource.MILI_NEWTON_W.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                a[HMDeviceSource.MILI_PRAGUE.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                a[HMDeviceSource.MILI_PRAGUE_W.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                a[HMDeviceSource.MILI_VOLGA.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                a[HMDeviceSource.MILI_VOLGA_W.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                a[HMDeviceSource.MILI_TOKYO.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                a[HMDeviceSource.MILI_COMO.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                a[HMDeviceSource.MILI_COMO_L.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                a[HMDeviceSource.MILI_COMO_W.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                a[HMDeviceSource.MILI_COMO_WL.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                a[HMDeviceSource.MILI_HAMBURG.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                a[HMDeviceSource.MILI_HAMBURG_W.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                a[HMDeviceSource.MILI_BONN.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                a[HMDeviceSource.MILI_BONN_W.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                a[HMDeviceSource.OTHER_HAYDN.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                a[HMDeviceSource.MILI_BLANC.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                a[HMDeviceSource.MILI_BLANC_W.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                a[HMDeviceSource.MILI_MADRID.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                a[HMDeviceSource.MILI_MADRID_W.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                a[HMDeviceSource.MILI_MADRID_HML.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
        }
    }

    private SportDeviceManager(Context context) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
        this.d = hMDeviceSource;
        this.e = -1;
        this.f = hMDeviceSource;
        this.g = hMDeviceSource;
        this.h = hMDeviceSource;
        this.n = new ArrayList();
        this.o = new ConcurrentHashMap();
        this.p = KoinJavaComponent.inject(DeviceSnService.class);
        this.q = -1L;
        this.r = -1L;
        this.s = -1L;
        this.t = -1L;
        this.a = context;
    }

    private List<HMDeviceSource> b(final int sportType, @NotNull final List<HMDeviceSource> devices, final int maxCount) {
        HMDeviceSource hMDeviceSource;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < Math.min(devices.size(), maxCount); i++) {
            arrayList.add(devices.get(i));
        }
        int size = arrayList.size();
        HMDeviceSource hMDeviceSource2 = null;
        if (size > 1) {
            hMDeviceSource2 = (HMDeviceSource) arrayList.get(0);
            hMDeviceSource = (HMDeviceSource) arrayList.get(1);
        } else if (size == 1) {
            hMDeviceSource2 = (HMDeviceSource) arrayList.get(0);
            hMDeviceSource = null;
        } else {
            hMDeviceSource = null;
        }
        saveUserOpenedBoundDevices(sportType, hMDeviceSource2, hMDeviceSource);
        return arrayList;
    }

    private int c(float pace) {
        int i = (int) (pace * 1000.0f);
        if (i > 1800) {
            return 1800;
        }
        return i;
    }

    public static int convertSportSource2DeviceValue(int sportSource) {
        HMDeviceSource hMDeviceSource;
        if (sportSource > 100) {
            return sportSource - 100;
        }
        switch (sportSource) {
            case 1:
                hMDeviceSource = HMDeviceSource.WATCH_AMAZFIT;
                break;
            case 2:
                hMDeviceSource = HMDeviceSource.MILI_PEYTO;
                break;
            case 3:
                hMDeviceSource = HMDeviceSource.MILI_TEMPO;
                break;
            case 4:
                hMDeviceSource = HMDeviceSource.WATCH_EVEREST;
                break;
            case 5:
                hMDeviceSource = HMDeviceSource.WATCH_EVEREST_2S;
                break;
            case 6:
                hMDeviceSource = HMDeviceSource.MILI_BEATS;
                break;
            case 7:
                hMDeviceSource = HMDeviceSource.MILI_BEATS_P;
                break;
            case 8:
                hMDeviceSource = HMDeviceSource.MILI_WUHAN;
                break;
            case 9:
                hMDeviceSource = HMDeviceSource.MILI_CHONGQING;
                break;
            case 10:
                hMDeviceSource = HMDeviceSource.MILI_DTH;
                break;
            case 11:
                hMDeviceSource = HMDeviceSource.WATCH_AMAZFIT_QOG;
                break;
            default:
                switch (sportSource) {
                    case 31:
                        hMDeviceSource = HMDeviceSource.WATCH_AMAZFIT_XIHU;
                        break;
                    case 32:
                        hMDeviceSource = HMDeviceSource.WATCH_AMAZFIT_XIHU_E;
                        break;
                    case 33:
                        hMDeviceSource = HMDeviceSource.WATCH_AMAZFIT_XIHU_EA;
                        break;
                    case 34:
                        hMDeviceSource = HMDeviceSource.WATCH_AMAZFIT_XIHU_DISNEY;
                        break;
                    case 35:
                        hMDeviceSource = HMDeviceSource.SMART_WATCH_EVEREST_2;
                        break;
                    default:
                        hMDeviceSource = HMDeviceSource.VDEVICE;
                        break;
                }
                break;
        }
        return hMDeviceSource.getValue();
    }

    private float d(float pace) {
        if (pace <= 0.0f) {
            return 0.0f;
        }
        return 3600.0f / pace;
    }

    private float e(float pace) {
        float f;
        float f2 = pace > 0.0f ? 3600.0f / pace : 0.0f;
        float fRound = Math.round(f2 * 100.0f) / 100.0f;
        float f3 = (int) fRound;
        float f4 = fRound - f3;
        if (f4 < 0.25f) {
            return f3;
        }
        if (0.25f <= f4 && f4 < 0.75f) {
            f = 0.5f;
        } else {
            if (0.75f > f4) {
                return f2;
            }
            f = 1.0f;
        }
        return f3 + f;
    }

    @NotNull
    private List<HMDeviceSource> f(int sportType, int maxCount) {
        i(sportType);
        List<HMDeviceSource> boundDevices = getBoundDevices(Integer.valueOf(sportType));
        int size = boundDevices.size();
        int iIntValue = SportConfigDbClient.getConfig(sportType).getDevicesCount().intValue();
        if (iIntValue != size) {
            SportConfigDbClient.setConfigChooseDevicesCount(size, sportType);
        }
        if (size > iIntValue) {
            return b(sportType, boundDevices, maxCount);
        }
        int[] configChooseDevices = SportConfigDbClient.getConfigChooseDevices(sportType);
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(configChooseDevices[0]);
        HMDeviceSource hMDeviceSourceFromValue2 = HMDeviceSource.fromValue(configChooseDevices[1]);
        ArrayList arrayList = new ArrayList();
        int value = hMDeviceSourceFromValue.getValue();
        HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
        if (value == hMDeviceSource.getValue() && hMDeviceSourceFromValue2.getValue() == hMDeviceSource.getValue()) {
            return arrayList;
        }
        boolean z = hMDeviceSourceFromValue.getValue() != hMDeviceSource.getValue();
        boolean z2 = hMDeviceSourceFromValue2.getValue() != hMDeviceSource.getValue();
        for (HMDeviceSource hMDeviceSource2 : boundDevices) {
            if (hMDeviceSource2.getValue() == hMDeviceSourceFromValue.getValue()) {
                arrayList.add(hMDeviceSourceFromValue);
                z = false;
            } else if (hMDeviceSource2.getValue() == hMDeviceSourceFromValue2.getValue()) {
                arrayList.add(hMDeviceSourceFromValue2);
                z2 = false;
            }
        }
        return (z || z2) ? b(sportType, boundDevices, maxCount) : arrayList;
    }

    private void g(DeviceConnectionStatus status, HMDeviceSource source) {
        if (status != DeviceConnectionStatus.CONNECTED) {
            this.o.put(source, Boolean.FALSE);
            return;
        }
        SportKind sportKind = SportKind.OUTDOOR;
        int sportType = GPSDataController.getInstance().getSportType();
        if (sportType != 1) {
            if (sportType == 8) {
                sportKind = SportKind.INDOOR;
            } else if (sportType == 9) {
                sportKind = SportKind.RIDING;
            } else if (sportType == 6) {
                sportKind = SportKind.WALK;
            }
        }
        DeviceCenter.getInstance().sendSportConfig(new SportConfig(sportKind), this);
        SportInfo sportInfo = new SportInfo();
        sportInfo.setStartTime((int) GPSDataController.getInstance().getTrackId());
        sportInfo.setElapsedTime(GPSDataController.getInstance().getTickerTime());
        DeviceCenter.getInstance().sendSportCommand(SportCommand.START, sportInfo);
        if (GPSDataController.getInstance().getState() == 2) {
            DeviceCenter.getInstance().sendSportCommand(SportCommand.PAUSE, this.u);
        }
    }

    @NotNull
    public static synchronized SportDeviceManager getInstance(@NotNull Context context) {
        if (v == null) {
            v = new SportDeviceManager(context.getApplicationContext());
        }
        return v;
    }

    private boolean h(HMDeviceSource source) {
        for (int i = 0; i < this.n.size(); i++) {
            HMDeviceSource hMDeviceSource = this.n.get(i);
            if (this.o.get(hMDeviceSource) != null && this.o.get(hMDeviceSource).booleanValue()) {
                return hMDeviceSource == source;
            }
        }
        return false;
    }

    private void i(int sportType) {
        int specifiedSportTypeLastDeviceCount = SportUIKeeper.getSpecifiedSportTypeLastDeviceCount(this.a, sportType);
        if (specifiedSportTypeLastDeviceCount >= 0) {
            SportConfigDbClient.setConfigChooseDevicesCount(specifiedSportTypeLastDeviceCount, sportType);
            SportUIKeeper.setSpecifiedSportTypeLastDeviceCount(this.a, sportType, -2);
        }
        int specifiedSportTypeHaveOpenedDeviceFirstDeviceValue = SportUIKeeper.getSpecifiedSportTypeHaveOpenedDeviceFirstDeviceValue(this.a, sportType);
        int specifiedSportTypeHaveOpenedDeviceSecondDeviceValue = SportUIKeeper.getSpecifiedSportTypeHaveOpenedDeviceSecondDeviceValue(this.a, sportType);
        if (specifiedSportTypeHaveOpenedDeviceFirstDeviceValue <= -2 || specifiedSportTypeHaveOpenedDeviceSecondDeviceValue <= -2) {
            return;
        }
        SportConfigDbClient.setConfigChooseDevices(new int[]{specifiedSportTypeHaveOpenedDeviceFirstDeviceValue, specifiedSportTypeHaveOpenedDeviceSecondDeviceValue}, sportType);
        SportUIKeeper.setSpecifiedSportTypeHaveOpenedDeviceFirstDeviceValue(this.a, sportType, -2);
        SportUIKeeper.setSpecifiedSportTypeHaveOpenedDeviceSecondDeviceValue(this.a, sportType, -2);
    }

    public static boolean isDeviceSupportSport(@NotNull HMDeviceSource source, int sportType) {
        if (9 == sportType) {
            return SportOpenDeviceUtil.isDeviceSupportCyclingAnalysis(source);
        }
        if (6 == sportType) {
            return SportOpenDeviceUtil.isDeviceSupportWalkingAnalysis(source);
        }
        if (1 == sportType || 8 == sportType || 25 == sportType) {
            return SportOpenDeviceUtil.isDeviceSupportRunningAnalysis(source);
        }
        return false;
    }

    private void j(int sportType) {
        this.o.clear();
        k();
        List<HMDeviceSource> userOpenedBoundDevices = getUserOpenedBoundDevices(sportType);
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        if (boundDeviceSource == HMDeviceSource.MILI_RIO) {
            userOpenedBoundDevices.add(boundDeviceSource);
        }
        int i = 0;
        if (userOpenedBoundDevices.size() <= 0) {
            this.m = new int[]{HMDeviceSource.VDEVICE.getValue()};
            return;
        }
        this.m = new int[userOpenedBoundDevices.size()];
        for (HMDeviceSource hMDeviceSource : userOpenedBoundDevices) {
            if (hMDeviceSource == HMDeviceSource.OTHER_BM) {
                this.i = true;
                FunctionSwitcher.isSupportFirstBeat = true;
            } else if (hMDeviceSource.getType() == HMDeviceType.MILI) {
                this.j = true;
            } else if (hMDeviceSource.getType() == HMDeviceType.SHOES) {
                this.k = true;
            } else if (hMDeviceSource.getType() == HMDeviceType.HEADSET) {
                this.l = true;
            }
            this.m[i] = hMDeviceSource.getValue();
            this.o.put(hMDeviceSource, Boolean.FALSE);
            this.n.add(hMDeviceSource);
            i++;
        }
        Collections.sort(this.n, new a());
    }

    private void k() {
        this.m = null;
        FunctionSwitcher.isSupportFirstBeat = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(long timeStamp, int distance, int steps, int sportSource) {
        StringBuilder sb = new StringBuilder();
        sb.append(timeStamp);
        sb.append(',');
        sb.append(distance);
        sb.append(',');
        sb.append(steps);
        sb.append(',');
        sb.append(sportSource);
        SportUIKeeper.setIndoorRunCalibratedData(null, sb.toString());
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public int deviceIconResId(int source, boolean deviceOrSport) {
        if (!deviceOrSport) {
            source = convertSportSource2DeviceValue(source);
        }
        switch (c.a[HMDeviceSource.fromValue(source).ordinal()]) {
            case 1:
            case 2:
            case 3:
                return R.drawable.ic_sport_prepare_miband_series_1;
            case 4:
                return R.drawable.ic_sport_prepare_miband_series_2;
            case 5:
                return R.drawable.ic_running_overview_amazfit_arc;
            case 6:
            case 7:
            case 8:
                return R.drawable.ic_sport_prepare_miband_series_3;
            case 9:
            case 10:
                return R.drawable.ic_sport_prepare_miband_series_4;
            case 11:
                return R.drawable.ic_sport_prepare_amazfitband;
            case 12:
            case 13:
            case 14:
                return R.drawable.ic_sport_prepare_amazfitband_2;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return R.drawable.ic_sport_prepare_smart_chip;
            case 20:
            default:
                return R.drawable.ic_sport_prepare_default_device;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return R.drawable.ic_sport_prepare_mili_chaohu_serie;
            case 30:
            case 31:
                return R.drawable.ic_sport_prepare_pyh_serie;
            case 32:
                return R.drawable.ic_running_overview_pace;
            case 33:
                return R.drawable.ic_running_overview_smartwatch;
            case 34:
            case 35:
                return R.drawable.ic_running_overview_stratos;
            case 36:
            case 37:
            case 38:
            case 39:
                return R.drawable.ic_running_overview_everest2;
            case 40:
            case 41:
            case 42:
            case 43:
                return R.drawable.ic_running_overview_xihu;
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 75:
            case 76:
            case 79:
            case 80:
                return R.drawable.ic_running_overview_falcon;
            case 49:
            case 50:
            case 51:
            case 52:
                return R.drawable.ic_running_overview_hawk;
            case 53:
            case 54:
                return R.drawable.ic_running_overview_hawk_swk;
            case 55:
            case 56:
            case 57:
            case 58:
                return R.drawable.ic_running_overview_kestrel;
            case 59:
                return R.drawable.ic_running_overview_vultrue;
            case 60:
                return R.drawable.ic_running_overview_aneto;
            case 61:
            case 62:
                return R.drawable.ic_running_overview_venice;
            case 63:
            case 64:
                return R.drawable.ic_running_overview_bolt;
            case 65:
                return R.drawable.ic_running_overview_mozart;
            case 66:
            case 67:
                return R.drawable.onyx_ic_running_overview_onyx;
            case 68:
            case 69:
                return R.drawable.corsica_ic_running_overview_corsica;
            case 70:
            case 71:
            case 72:
                return R.drawable.ic_running_overview_osprey;
            case 73:
            case 74:
                return R.drawable.ic_running_overview_lisbon;
            case 77:
            case 78:
                return R.drawable.ic_running_overview_newton;
            case 81:
            case 82:
                return R.drawable.ic_running_overview_volga;
            case 83:
                return R.drawable.tokyo_ic_running_overview_tokyo;
            case 84:
            case 85:
            case 86:
            case 87:
                return R.drawable.ic_running_overview_como;
            case 88:
            case 89:
                return R.drawable.ic_running_overview_hamburg;
            case 90:
            case 91:
                return R.drawable.ic_running_overview_bonn;
            case 92:
                return R.drawable.ic_running_overview_haydn;
            case 93:
            case 94:
                return R.drawable.ic_running_overview_blanc;
            case 95:
            case 96:
            case 97:
                return R.drawable.ic_running_overview_madrid;
        }
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void deviceServicePause(int emitter) {
        if (emitter == 20) {
            return;
        }
        SportInfo sportInfo = new SportInfo();
        sportInfo.setElapsedTime(GPSDataController.getInstance().getTickerTime());
        DeviceCenter.getInstance().sendSportCommand(SportCommand.PAUSE, sportInfo);
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void deviceServiceResume(int emitter) {
        SportInfo sportInfo = new SportInfo();
        sportInfo.setElapsedTime(GPSDataController.getInstance().getTickerTime());
        DeviceCenter.getInstance().sendSportCommand(SportCommand.RESUME, sportInfo);
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void deviceServiceStop(int emitter) {
        SportInfo sportInfo = new SportInfo();
        sportInfo.setElapsedTime(GPSDataController.getInstance().getTickerTime());
        DeviceCenter.getInstance().sendSportCommand(SportCommand.STOP, sportInfo);
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public String formatDeviceToString() {
        String str;
        HMDeviceSource hMDeviceSource = this.d;
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.VDEVICE;
        if (hMDeviceSource != hMDeviceSource2) {
            str = this.d.getType().getValue() + ":" + DataTypeSource.SHOES + ":" + this.d.getValue();
            if (this.d == HMDeviceSource.SHOES_MARS && this.e >= 0) {
                str = str + ":" + this.e;
            }
        } else {
            str = "";
        }
        if (this.f != hMDeviceSource2) {
            if (!TextUtils.isEmpty(str)) {
                str = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            }
            str = str + this.f.getType().getValue() + ":" + DataTypeSource.MILI + ":" + this.f.getValue();
        }
        if (this.g != hMDeviceSource2) {
            if (!TextUtils.isEmpty(str)) {
                str = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            }
            str = str + this.g.getType().getValue() + ":BLUEMONKEY:" + this.g.getValue();
        }
        if (this.h != hMDeviceSource2) {
            if (!TextUtils.isEmpty(str)) {
                str = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            }
            str = str + this.h.getType().getValue() + ":" + DataTypeSource.EARPHONE + ":" + this.h.getValue();
        }
        HMLog.d(x, "device string:" + str, new Object[0]);
        return str;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public int getBandValue() {
        int[] iArr = this.m;
        if (iArr == null) {
            return -1;
        }
        for (int i : iArr) {
            HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(i);
            if (hMDeviceSourceFromValue.getType() == HMDeviceType.MILI) {
                return hMDeviceSourceFromValue.getValue();
            }
        }
        return -1;
    }

    @NotNull
    public final List<HMDeviceSource> getBoundDevices(@Nullable Integer sportType) {
        ArrayList<HMDeviceSource> arrayList = new ArrayList();
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.HEADSET;
        HMDeviceType type = hMDeviceManager.getBoundDeviceSource(hMDeviceType).getType();
        HMDeviceType hMDeviceType2 = HMDeviceType.VDevice;
        if (type != hMDeviceType2) {
            arrayList.add(hMDeviceManager.getBoundDeviceSource(hMDeviceType));
        }
        HMDeviceType hMDeviceType3 = HMDeviceType.OTHER;
        if (hMDeviceManager.getBoundDeviceSource(hMDeviceType3).getType() != hMDeviceType2) {
            arrayList.add(hMDeviceManager.getBoundDeviceSource(hMDeviceType3));
        }
        HMDeviceType hMDeviceType4 = HMDeviceType.MILI;
        if (hMDeviceManager.getBoundDeviceSource(hMDeviceType4).getType() != hMDeviceType2) {
            arrayList.add(hMDeviceManager.getBoundDeviceSource(hMDeviceType4));
        }
        HMDeviceType hMDeviceType5 = HMDeviceType.SHOES;
        if (hMDeviceManager.getBoundDeviceSource(hMDeviceType5).getType() != hMDeviceType2) {
            arrayList.add(hMDeviceManager.getBoundDeviceSource(hMDeviceType5));
        }
        if (sportType == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (HMDeviceSource hMDeviceSource : arrayList) {
            if (isDeviceSupportSport(hMDeviceSource, sportType.intValue())) {
                arrayList2.add(hMDeviceSource);
            }
        }
        return arrayList2;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public String getDeviceId(int source) {
        return HMDeviceManager.getInstance().getBoundDeviceId(HMDeviceSource.fromValue(convertSportSource2DeviceValue(source)).getType());
    }

    public HrZoneShowRuleConfig getHrZoneRuleConfigByActiveDevice() {
        return new HrZoneShowRuleConfig(5, 5, HMDeviceConfig.isL66Series());
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public String getSN(int source) {
        return this.p.getValue().getSn(HMDeviceSource.fromValue(convertSportSource2DeviceValue(source)).getType());
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public int getShoeValue() {
        int[] iArr = this.m;
        if (iArr == null) {
            return -1;
        }
        for (int i : iArr) {
            HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(i);
            if (hMDeviceSourceFromValue.getType() == HMDeviceType.SHOES) {
                return hMDeviceSourceFromValue.getValue();
            }
        }
        return -1;
    }

    @NotNull
    public final List<HMDeviceSource> getUserOpenedBoundDevices(int sportType) {
        return f(sportType, 2);
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public boolean hasBaroMeter() {
        return DeviceCenter.getInstance().hasBarometer();
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean hasValidDevices() {
        int[] iArr = this.m;
        if (iArr != null) {
            for (int i : iArr) {
                if (i > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public int heartRateState(int state) {
        if (HeartRateStatus.isSuccess(state)) {
            return 1;
        }
        if (HeartRateStatus.isDisconnected(state)) {
            return 2;
        }
        if (HeartRateStatus.isLowBattery(state)) {
            return 3;
        }
        return HeartRateStatus.isTimeout(state) ? 4 : 0;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean isBandConnected() {
        int[] iArr = this.m;
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(i);
            if (hMDeviceSourceFromValue.getType() == HMDeviceType.MILI) {
                return DeviceCenter.getInstance().isConnected(hMDeviceSourceFromValue);
            }
        }
        return false;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean isHrDevice(int source) {
        return DeviceCenter.isHrDevice(HMDeviceSource.fromValue(source));
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean isHrDeviceConnected() {
        int[] iArr = this.m;
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(i);
            if (DeviceCenter.isHrDevice(hMDeviceSourceFromValue) && DeviceCenter.getInstance().isConnected(hMDeviceSourceFromValue)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean isShoeConnected() {
        int[] iArr = this.m;
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(i);
            if (hMDeviceSourceFromValue.getType() == HMDeviceType.SHOES) {
                return DeviceCenter.getInstance().isConnected(hMDeviceSourceFromValue);
            }
        }
        return false;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean isSupportStep(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        if (!hasValidDevices()) {
            if ((sensorManager != null ? sensorManager.getDefaultSensor(18) : null) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean isValidHrDevices() {
        int[] iArr = this.m;
        if (iArr != null) {
            for (int i : iArr) {
                if (DeviceCenter.isHrDevice(HMDeviceSource.fromValue(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onBatteryLevelChanged(int level, HMDeviceSource source) {
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onConnectionStatusChanged(DeviceConnectionStatus status, HMDeviceSource source) {
        HMLog.i(x, "onConnectionStatusChanged status:" + status + ",source:" + source, new Object[0]);
        g(status, source);
        GPSDataController.getInstance().sendDeviceConnect(source.getType() == HMDeviceType.MILI, status == DeviceConnectionStatus.CONNECTED);
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onHrData(DeviceHr hr) {
        HMDeviceSource source = hr.getSource();
        this.o.put(source, Boolean.TRUE);
        HMLog.d(x, "onHrData:" + hr, new Object[0]);
        if (!h(source)) {
            HMLog.d(x, source + " isn't the hr device", new Object[0]);
            return;
        }
        if (this.l && source.getType() == HMDeviceType.HEADSET) {
            this.h = source;
        }
        GPSDataController.getInstance().sendHrData(hr.getHr());
        ProxyTreadmill.INSTANCE.getInstance().syncHr(hr.getHr());
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onHrState(DeviceHrEvent event) {
        HMLog.d(x, "onHrState state:" + event.getState() + ",hr:" + event.getHr(), new Object[0]);
        HMDeviceSource source = event.getSource();
        if (event.getState() != 1) {
            this.o.put(source, Boolean.FALSE);
        }
        if (h(source)) {
            GPSDataController.getInstance().sendHrState(event.getState(), event.getHr());
            return;
        }
        HMLog.d(x, source + " isn't the hr device", new Object[0]);
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onPressureData(PhonePressure pressure) {
        HMLog.d(x, "onPressureData:" + pressure, new Object[0]);
        GPSDataController.getInstance().sendPressureData(pressure.getPressure());
    }

    @Override // com.xiaomi.hm.health.bt.profile.sport.IHMSportListener
    public void onSportCommand(SportCommand command) {
        int i;
        if (command == SportCommand.PAUSE) {
            i = 3;
        } else if (command == SportCommand.RESUME) {
            i = 2;
        } else if (command != SportCommand.STOP) {
            return;
        } else {
            i = 4;
        }
        GPSDataController.getInstance().setSportControlByDevice(i);
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onStepData(DeviceStep step) {
        int i;
        HMLog.d(x, "onStepData:" + step, new Object[0]);
        HMDeviceType type = step.getSource().getType();
        HMLog.i(x, "receiveStep:" + type, new Object[0]);
        if (type == HMDeviceType.SENSORHUB) {
            i = 43;
        } else if (type == HMDeviceType.MILI) {
            i = 42;
            this.f = step.getSource();
        } else if (type == HMDeviceType.SHOES) {
            i = 44;
            this.d = step.getSource();
            this.e = step.getBrandType();
        } else if (type == HMDeviceType.OTHER) {
            if (step.getSource() == HMDeviceSource.OTHER_BM) {
                this.g = step.getSource();
            }
            i = 45;
        } else {
            i = 0;
        }
        GaitInfo stepInfo = step.getStepInfo();
        if (stepInfo == null) {
            GPSDataController.getInstance().sendStepData(i, step.getTotal(), step.getFront(), 0, 0, 2);
            return;
        }
        SparseArray<GaitInfo.Gait> gaits = stepInfo.getGaits();
        if (gaits != null) {
            int size = gaits.size();
            if (size > 2) {
                throw new IllegalArgumentException("invalid step gait!! size =" + gaits.size());
            }
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = gaits.keyAt(i2);
                GaitInfo.Gait gait = gaits.get(iKeyAt);
                GPSDataController.getInstance().sendStepData(i, step.getTotal(), step.getFront(), gait.getTouchTime(), gait.getFlyTime(), iKeyAt);
            }
        }
    }

    public void registerSportUsingDevice(int sportType) {
        j(sportType);
        SportDeviceProxy.getInstance().setSecondaryProxy(this);
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public void remindHRIfNeed(int hr) {
        if (GPSDataController.getInstance().getState() == 2) {
            return;
        }
        if (hr < this.b.getRemindHeartRate().intValue() || !this.b.getRemindHREnable().booleanValue()) {
            this.q = -1L;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.q;
        if (j == -1) {
            this.q = jCurrentTimeMillis;
            return;
        }
        if (jCurrentTimeMillis - j <= 15000 || jCurrentTimeMillis - this.s <= 40000) {
            return;
        }
        this.q = -1L;
        this.s = jCurrentTimeMillis;
        DeviceCenter.getInstance().vibrateHr(hr, this.b.getRemindHeartRate().intValue());
        RunningPlayer.getInstance().playHRWarn(hr);
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean remindPaceIfNeed(float realPaceSpeed) {
        Runconfig runconfig;
        if (GPSDataController.getInstance().getState() != 2 && GPSDataController.getInstance().getSportType() != 6 && (runconfig = this.b) != null && runconfig.getRemindPaceEnable() != null) {
            if (!this.b.getRemindPaceEnable().booleanValue()) {
                this.r = -1L;
                return false;
            }
            float fConvertTospkm = RunDataConversion.convertTospkm(realPaceSpeed);
            if (fConvertTospkm <= 18000.0f && fConvertTospkm > this.b.getRemindPace().intValue()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.r;
                if (j == -1) {
                    this.r = jCurrentTimeMillis;
                    return false;
                }
                if (jCurrentTimeMillis - j <= 15000 || jCurrentTimeMillis - this.t <= 40000) {
                    return false;
                }
                this.r = -1L;
                this.t = jCurrentTimeMillis;
                if (fConvertTospkm > 1800.0f) {
                    fConvertTospkm = 1800.0f;
                }
                int i = this.c ? (int) fConvertTospkm : (int) (((double) fConvertTospkm) * 1.609344d);
                float fIntValue = this.b.getRemindPace().intValue();
                if (GPSDataController.getInstance().getSportType() == 9) {
                    SpeedVoiceInfo speedVoiceInfo = new SpeedVoiceInfo();
                    speedVoiceInfo.speed = NumberFormatter.format(3600.0f / (i * 1.0f), 1, new int[0]);
                    speedVoiceInfo.isMetric = this.c;
                    RunningPlayer.getInstance().playSpeedWarn(speedVoiceInfo);
                    DeviceCenter.getInstance().vibrateSpeed((int) (d(fConvertTospkm) * 1000.0f), (int) (e(fIntValue) * 1000.0f));
                } else {
                    RunningPlayer.getInstance().playPaceWarn(i);
                    DeviceCenter.getInstance().vibratePace((int) fConvertTospkm, i, (int) fIntValue);
                }
                return true;
            }
            this.r = -1L;
        }
        return false;
    }

    public final void saveUserOpenedBoundDevices(int sportType, @Nullable HMDeviceSource first, @Nullable HMDeviceSource second) {
        SportConfigDbClient.setConfigChooseDevices(new int[]{first == null ? -1 : first.getValue(), second != null ? second.getValue() : -1}, sportType);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sendDataToDevice(String dataJson) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        float f2;
        float f3;
        SportInfo sportInfo = new SportInfo();
        float f4 = 0.0f;
        try {
            JSONObject jSONObject = new JSONObject(dataJson);
            i = jSONObject.getInt("sportType");
            try {
                i2 = jSONObject.getInt(com.huami.mifit.sportlib.common.Constants.DATA_KEY_HR);
                try {
                    i3 = jSONObject.getInt("cal");
                    try {
                        i4 = jSONObject.getInt(com.huami.mifit.sportlib.common.Constants.DATA_KEY_STEP_LEN);
                        try {
                            i5 = jSONObject.getInt("step");
                            try {
                                f = (float) jSONObject.getDouble("distance");
                                try {
                                    f2 = (float) jSONObject.getDouble("pace");
                                    try {
                                        f3 = (float) jSONObject.getDouble(com.huami.mifit.sportlib.common.Constants.DATA_KEY_AVG_PACE);
                                        try {
                                            f4 = (float) jSONObject.getDouble(com.huami.mifit.sportlib.common.Constants.DATA_KEY_STEP_FREQ);
                                        } catch (JSONException e) {
                                            e = e;
                                            e.printStackTrace();
                                            HMLog.i(x, "error DATA :" + dataJson, new Object[0]);
                                        }
                                    } catch (JSONException e2) {
                                        e = e2;
                                        f3 = 0.0f;
                                        e.printStackTrace();
                                        HMLog.i(x, "error DATA :" + dataJson, new Object[0]);
                                        sportInfo.setHr(i2);
                                        sportInfo.setDistance((int) f);
                                        sportInfo.setPace(c(f2));
                                        sportInfo.setAvePace(c(f3));
                                        sportInfo.setStepFreq((int) (f4 * 60.0f));
                                        sportInfo.setStep(i5);
                                        sportInfo.setSpeed((int) d(f2));
                                        sportInfo.setAveSpeed((int) d(f3));
                                        sportInfo.setCal(i3);
                                        sportInfo.setStepLen(i4);
                                        int i6 = (int) (f3 * f);
                                        sportInfo.setAvgCadence(i6 != 0 ? (int) (((i5 * 1.0f) / i6) * 60.0f) : 0);
                                        if (i == 1) {
                                            sportInfo.setSportType(SportType.SPORT_TYPE_ODRUN);
                                        } else if (i == 8) {
                                            sportInfo.setSportType(SportType.SPORT_TYPE_IDRUN);
                                        } else {
                                            if (i == 25) {
                                                return;
                                            }
                                            if (i == 9) {
                                                sportInfo.setSportType(SportType.SPORT_TYPE_RIDING);
                                            } else if (i == 6) {
                                                sportInfo.setSportType(SportType.SPORT_TYPE_WALKING);
                                            }
                                        }
                                        DeviceCenter.getInstance().sendSportCommand(SportCommand.SHOW, sportInfo);
                                        this.u = sportInfo;
                                    }
                                } catch (JSONException e3) {
                                    e = e3;
                                    f2 = 0.0f;
                                    f3 = 0.0f;
                                    e.printStackTrace();
                                    HMLog.i(x, "error DATA :" + dataJson, new Object[0]);
                                    sportInfo.setHr(i2);
                                    sportInfo.setDistance((int) f);
                                    sportInfo.setPace(c(f2));
                                    sportInfo.setAvePace(c(f3));
                                    sportInfo.setStepFreq((int) (f4 * 60.0f));
                                    sportInfo.setStep(i5);
                                    sportInfo.setSpeed((int) d(f2));
                                    sportInfo.setAveSpeed((int) d(f3));
                                    sportInfo.setCal(i3);
                                    sportInfo.setStepLen(i4);
                                    int i7 = (int) (f3 * f);
                                    sportInfo.setAvgCadence(i7 != 0 ? (int) (((i5 * 1.0f) / i7) * 60.0f) : 0);
                                    if (i == 1) {
                                        sportInfo.setSportType(SportType.SPORT_TYPE_ODRUN);
                                    } else if (i == 8) {
                                        sportInfo.setSportType(SportType.SPORT_TYPE_IDRUN);
                                    } else {
                                        if (i == 25) {
                                            return;
                                        }
                                        if (i == 9) {
                                            sportInfo.setSportType(SportType.SPORT_TYPE_RIDING);
                                        } else if (i == 6) {
                                            sportInfo.setSportType(SportType.SPORT_TYPE_WALKING);
                                        }
                                    }
                                    DeviceCenter.getInstance().sendSportCommand(SportCommand.SHOW, sportInfo);
                                    this.u = sportInfo;
                                }
                            } catch (JSONException e4) {
                                e = e4;
                                f = 0.0f;
                                f2 = 0.0f;
                                f3 = 0.0f;
                                e.printStackTrace();
                                HMLog.i(x, "error DATA :" + dataJson, new Object[0]);
                                sportInfo.setHr(i2);
                                sportInfo.setDistance((int) f);
                                sportInfo.setPace(c(f2));
                                sportInfo.setAvePace(c(f3));
                                sportInfo.setStepFreq((int) (f4 * 60.0f));
                                sportInfo.setStep(i5);
                                sportInfo.setSpeed((int) d(f2));
                                sportInfo.setAveSpeed((int) d(f3));
                                sportInfo.setCal(i3);
                                sportInfo.setStepLen(i4);
                                int i8 = (int) (f3 * f);
                                sportInfo.setAvgCadence(i8 != 0 ? (int) (((i5 * 1.0f) / i8) * 60.0f) : 0);
                                if (i == 1) {
                                    sportInfo.setSportType(SportType.SPORT_TYPE_ODRUN);
                                } else if (i == 8) {
                                    sportInfo.setSportType(SportType.SPORT_TYPE_IDRUN);
                                } else {
                                    if (i == 25) {
                                        return;
                                    }
                                    if (i == 9) {
                                        sportInfo.setSportType(SportType.SPORT_TYPE_RIDING);
                                    } else if (i == 6) {
                                        sportInfo.setSportType(SportType.SPORT_TYPE_WALKING);
                                    }
                                }
                                DeviceCenter.getInstance().sendSportCommand(SportCommand.SHOW, sportInfo);
                                this.u = sportInfo;
                            }
                        } catch (JSONException e5) {
                            e = e5;
                            i5 = 0;
                            f = 0.0f;
                            f2 = 0.0f;
                            f3 = 0.0f;
                            e.printStackTrace();
                            HMLog.i(x, "error DATA :" + dataJson, new Object[0]);
                            sportInfo.setHr(i2);
                            sportInfo.setDistance((int) f);
                            sportInfo.setPace(c(f2));
                            sportInfo.setAvePace(c(f3));
                            sportInfo.setStepFreq((int) (f4 * 60.0f));
                            sportInfo.setStep(i5);
                            sportInfo.setSpeed((int) d(f2));
                            sportInfo.setAveSpeed((int) d(f3));
                            sportInfo.setCal(i3);
                            sportInfo.setStepLen(i4);
                            int i9 = (int) (f3 * f);
                            sportInfo.setAvgCadence(i9 != 0 ? (int) (((i5 * 1.0f) / i9) * 60.0f) : 0);
                            if (i == 1) {
                                sportInfo.setSportType(SportType.SPORT_TYPE_ODRUN);
                            } else if (i == 8) {
                                sportInfo.setSportType(SportType.SPORT_TYPE_IDRUN);
                            } else {
                                if (i == 25) {
                                    return;
                                }
                                if (i == 9) {
                                    sportInfo.setSportType(SportType.SPORT_TYPE_RIDING);
                                } else if (i == 6) {
                                    sportInfo.setSportType(SportType.SPORT_TYPE_WALKING);
                                }
                            }
                            DeviceCenter.getInstance().sendSportCommand(SportCommand.SHOW, sportInfo);
                            this.u = sportInfo;
                        }
                    } catch (JSONException e6) {
                        e = e6;
                        i4 = 0;
                        i5 = 0;
                        f = 0.0f;
                        f2 = 0.0f;
                        f3 = 0.0f;
                        e.printStackTrace();
                        HMLog.i(x, "error DATA :" + dataJson, new Object[0]);
                        sportInfo.setHr(i2);
                        sportInfo.setDistance((int) f);
                        sportInfo.setPace(c(f2));
                        sportInfo.setAvePace(c(f3));
                        sportInfo.setStepFreq((int) (f4 * 60.0f));
                        sportInfo.setStep(i5);
                        sportInfo.setSpeed((int) d(f2));
                        sportInfo.setAveSpeed((int) d(f3));
                        sportInfo.setCal(i3);
                        sportInfo.setStepLen(i4);
                        int i10 = (int) (f3 * f);
                        sportInfo.setAvgCadence(i10 != 0 ? (int) (((i5 * 1.0f) / i10) * 60.0f) : 0);
                        if (i == 1) {
                            sportInfo.setSportType(SportType.SPORT_TYPE_ODRUN);
                        } else if (i == 8) {
                            sportInfo.setSportType(SportType.SPORT_TYPE_IDRUN);
                        } else {
                            if (i == 25) {
                                return;
                            }
                            if (i == 9) {
                                sportInfo.setSportType(SportType.SPORT_TYPE_RIDING);
                            } else if (i == 6) {
                                sportInfo.setSportType(SportType.SPORT_TYPE_WALKING);
                            }
                        }
                        DeviceCenter.getInstance().sendSportCommand(SportCommand.SHOW, sportInfo);
                        this.u = sportInfo;
                    }
                } catch (JSONException e7) {
                    e = e7;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    f = 0.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    e.printStackTrace();
                    HMLog.i(x, "error DATA :" + dataJson, new Object[0]);
                    sportInfo.setHr(i2);
                    sportInfo.setDistance((int) f);
                    sportInfo.setPace(c(f2));
                    sportInfo.setAvePace(c(f3));
                    sportInfo.setStepFreq((int) (f4 * 60.0f));
                    sportInfo.setStep(i5);
                    sportInfo.setSpeed((int) d(f2));
                    sportInfo.setAveSpeed((int) d(f3));
                    sportInfo.setCal(i3);
                    sportInfo.setStepLen(i4);
                    int i11 = (int) (f3 * f);
                    sportInfo.setAvgCadence(i11 != 0 ? (int) (((i5 * 1.0f) / i11) * 60.0f) : 0);
                    if (i == 1) {
                        sportInfo.setSportType(SportType.SPORT_TYPE_ODRUN);
                    } else if (i == 8) {
                        sportInfo.setSportType(SportType.SPORT_TYPE_IDRUN);
                    } else {
                        if (i == 25) {
                            return;
                        }
                        if (i == 9) {
                            sportInfo.setSportType(SportType.SPORT_TYPE_RIDING);
                        } else if (i == 6) {
                            sportInfo.setSportType(SportType.SPORT_TYPE_WALKING);
                        }
                    }
                    DeviceCenter.getInstance().sendSportCommand(SportCommand.SHOW, sportInfo);
                    this.u = sportInfo;
                }
            } catch (JSONException e8) {
                e = e8;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
                e.printStackTrace();
                HMLog.i(x, "error DATA :" + dataJson, new Object[0]);
                sportInfo.setHr(i2);
                sportInfo.setDistance((int) f);
                sportInfo.setPace(c(f2));
                sportInfo.setAvePace(c(f3));
                sportInfo.setStepFreq((int) (f4 * 60.0f));
                sportInfo.setStep(i5);
                sportInfo.setSpeed((int) d(f2));
                sportInfo.setAveSpeed((int) d(f3));
                sportInfo.setCal(i3);
                sportInfo.setStepLen(i4);
                int i12 = (int) (f3 * f);
                sportInfo.setAvgCadence(i12 != 0 ? (int) (((i5 * 1.0f) / i12) * 60.0f) : 0);
                if (i == 1) {
                    sportInfo.setSportType(SportType.SPORT_TYPE_ODRUN);
                } else if (i == 8) {
                    sportInfo.setSportType(SportType.SPORT_TYPE_IDRUN);
                } else {
                    if (i == 25) {
                        return;
                    }
                    if (i == 9) {
                        sportInfo.setSportType(SportType.SPORT_TYPE_RIDING);
                    } else if (i == 6) {
                        sportInfo.setSportType(SportType.SPORT_TYPE_WALKING);
                    }
                }
                DeviceCenter.getInstance().sendSportCommand(SportCommand.SHOW, sportInfo);
                this.u = sportInfo;
            }
        } catch (JSONException e9) {
            e = e9;
            i = 0;
        }
        sportInfo.setHr(i2);
        sportInfo.setDistance((int) f);
        sportInfo.setPace(c(f2));
        sportInfo.setAvePace(c(f3));
        sportInfo.setStepFreq((int) (f4 * 60.0f));
        sportInfo.setStep(i5);
        sportInfo.setSpeed((int) d(f2));
        sportInfo.setAveSpeed((int) d(f3));
        sportInfo.setCal(i3);
        sportInfo.setStepLen(i4);
        int i13 = (int) (f3 * f);
        sportInfo.setAvgCadence(i13 != 0 ? (int) (((i5 * 1.0f) / i13) * 60.0f) : 0);
        if (i == 1) {
            sportInfo.setSportType(SportType.SPORT_TYPE_ODRUN);
        } else if (i == 8) {
            sportInfo.setSportType(SportType.SPORT_TYPE_IDRUN);
        } else {
            if (i == 25) {
                return;
            }
            if (i == 9) {
                sportInfo.setSportType(SportType.SPORT_TYPE_RIDING);
            } else if (i == 6) {
                sportInfo.setSportType(SportType.SPORT_TYPE_WALKING);
            }
        }
        DeviceCenter.getInstance().sendSportCommand(SportCommand.SHOW, sportInfo);
        this.u = sportInfo;
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sendPaceToDevice(int cost, float distance) {
        SportInfo sportInfo = new SportInfo();
        sportInfo.setElapsedTime(cost);
        sportInfo.setDistance((int) distance);
        DeviceCenter.getInstance().sendSportCommand(SportCommand.NOTIFY, sportInfo);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean sendVerifyDisCmd2Device(long timeStamp, int distance, int steps, int sportSource) {
        boolean z;
        HMDeviceSource boundDevice = DeviceCenter.getInstance().getBoundDevice(HMDeviceType.MILI);
        int i = c.a[boundDevice.ordinal()];
        boolean z2 = true;
        if (i == 6) {
            if (sportSource != 8) {
                z2 = false;
            }
            z = z2;
        } else if (i == 14) {
            if (sportSource != 6) {
                z2 = false;
            }
            z = z2;
        } else if (i == 11) {
            if (sportSource != 3) {
                z2 = false;
            }
            z = z2;
        } else if (i != 12) {
            z = false;
        } else {
            if (sportSource != 6) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            if (DeviceCenter.getInstance().isConnected(boundDevice)) {
                DeviceCenter.getInstance().sendVerifyDistanceCommand(boundDevice, timeStamp, distance, steps, new b(timeStamp, distance, steps, sportSource));
            } else {
                l(timeStamp, distance, steps, sportSource);
            }
        }
        return z;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean setWebIcon(Context context, int sourceId, ImageView holder) {
        return false;
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportPause(int emitter) {
        DeviceCenter.getInstance().pause();
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportResume(int emitter) {
        DeviceCenter.getInstance().resume();
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportStart(int emitter) {
        HMLog.i(x, "sportStart, emitter: " + emitter, new Object[0]);
        DeviceCenter.getInstance().setPeripheralListener(this);
        if (this.m != null) {
            DeviceCenter.getInstance().start(this.m);
        } else {
            DeviceCenter.getInstance().start(new int[0]);
        }
        this.b = SportConfigDbClient.getConfig(GPSDataController.getInstance().getSportType());
        this.c = RunnerData.getRunner().isMetric();
        HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
        this.d = hMDeviceSource;
        this.e = -1;
        this.f = hMDeviceSource;
        this.g = hMDeviceSource;
        this.h = hMDeviceSource;
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportStop(int emitter) {
        DeviceCenter.getInstance().stop();
        DeviceCenter.getInstance().setPeripheralListener(null);
    }

    public boolean supportHRR(int sportSource) {
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(convertSportSource2DeviceValue(sportSource));
        if (HMDeviceType.WATCH != hMDeviceSourceFromValue.getType()) {
            return ConfigHelperKt.hasFeature(Feature.HEART_RATE_REGION_S, hMDeviceSourceFromValue);
        }
        return DeviceUtil.isRomSupportHRR(this.a, DataTypeSource.RunSource.getSourceByValue(sportSource));
    }
}
