package com.xiaomi.hm.health.bt.profile.gdsp;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.statistic.ChaohuEvent;
import com.xiaomi.hm.health.bt.model.statistic.ChaohuStatistic;
import com.xiaomi.hm.health.bt.model.statistic.Statistic;
import com.xiaomi.hm.health.bt.model.statistic.TempoEvent;
import com.xiaomi.hm.health.bt.model.statistic.TempoStatistic;
import com.xiaomi.hm.health.bt.proto.Beats;
import com.xiaomi.hm.health.bt.proto.Beatsp;
import com.xiaomi.hm.health.bt.proto.Bell;
import com.xiaomi.hm.health.bt.proto.Chaohu;
import com.xiaomi.hm.health.bt.proto.Cinco;
import com.xiaomi.hm.health.bt.proto.Como;
import com.xiaomi.hm.health.bt.proto.Dongtinghu;
import com.xiaomi.hm.health.bt.proto.Falcon;
import com.xiaomi.hm.health.bt.proto.Hamburg;
import com.xiaomi.hm.health.bt.proto.Hawk;
import com.xiaomi.hm.health.bt.proto.Jiuhuashan;
import com.xiaomi.hm.health.bt.proto.Kestrel;
import com.xiaomi.hm.health.bt.proto.Kongming;
import com.xiaomi.hm.health.bt.proto.Lisbon;
import com.xiaomi.hm.health.bt.proto.Onyx;
import com.xiaomi.hm.health.bt.proto.Osprey;
import com.xiaomi.hm.health.bt.proto.Pangu;
import com.xiaomi.hm.health.bt.proto.Pyh;
import com.xiaomi.hm.health.bt.proto.StatisBase;
import com.xiaomi.hm.health.bt.proto.Tempo;
import com.xiaomi.hm.health.bt.proto.TimexOrigin;
import com.xiaomi.hm.health.bt.proto.Tokyo;
import com.xiaomi.hm.health.bt.proto.Tonlesap;
import com.xiaomi.hm.health.bt.proto.Venice;
import com.xiaomi.hm.health.bt.proto.Vulture;
import com.xiaomi.hm.health.bt.proto.York;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class HMGDSPData {
    private static final String g = "HMGDSPData";
    private HMGDSPType a;
    private HMDeviceSource b;
    private ArrayList<Integer> c = null;
    private ByteArrayOutputStream d = null;
    private Object e = null;
    private byte[] f = null;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            b = iArr;
            try {
                iArr[HMDeviceSource.HEARING_BELL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[HMGDSPType.values().length];
            a = iArr2;
            try {
                iArr2[HMGDSPType.PPG_RR.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMGDSPType.PROTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMGDSPType.DEVICE_SETTINGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMGDSPType.AF.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public HMGDSPData(HMGDSPType type, HMDeviceSource source) {
        this.a = type;
        this.b = source;
    }

    private ChaohuStatistic a(Chaohu.ChaoHuStatisticsMessage message) {
        ChaohuStatistic chaohuStatistic = new ChaohuStatistic();
        chaohuStatistic.setBacklightLevel(message.getBacklightLevel());
        chaohuStatistic.setSilenceMode(message.getSilenceMode().getNumber());
        chaohuStatistic.setStatistic(c(message.getBase()));
        Chaohu.ChaoHuEventMessage event = message.getEvent();
        ChaohuEvent chaohuEvent = new ChaohuEvent();
        chaohuEvent.setAlarmPage(event.getAlarmPage());
        chaohuEvent.setCompassNum(event.getCompassNum());
        chaohuEvent.setCompassPage(event.getCompassPage());
        chaohuEvent.setCountdownNum(event.getCountdownNum());
        chaohuEvent.setDial2DND(event.getDial2DND());
        chaohuEvent.setDial2MainItem1(event.getDial2MainItem1());
        chaohuEvent.setDial2Notify(event.getDial2Notify());
        chaohuEvent.setLcdOnBecauseOfEvent(event.getLcdOnBecauseOfEvent());
        chaohuEvent.setSettingBacklightPage(event.getSettingBacklightPage());
        chaohuEvent.setLcdOnBecauseOfPress(event.getLcdOnBecauseOfPress());
        chaohuEvent.setSettingLongpressPage(event.getSettingLongpressPage());
        chaohuEvent.setSettingPage(event.getSettingPage());
        chaohuEvent.setSettingWatchfacePage(event.getSettingWatchfacePage());
        chaohuEvent.setSkipGpsLocationNum(event.getSkipGpsLocationNum());
        chaohuEvent.setSportHistoryPage(event.getSportHistoryPage());
        chaohuEvent.setSportPage(event.getSportPage());
        chaohuEvent.setSportPage1Num(event.getSportPage1Num());
        chaohuEvent.setSportPage2Num(event.getSportPage2Num());
        chaohuEvent.setSportPage3Num(event.getSportPage3Num());
        chaohuEvent.setSportSettingPage(event.getSportSettingPage());
        chaohuEvent.setStatusPage1(event.getStatusPage1());
        chaohuEvent.setStatusPage2(event.getStatusPage2());
        chaohuEvent.setStopwatchNum(event.getStopwatchNum());
        chaohuEvent.setTimerCountdownPage(event.getTimerCountdownPage());
        chaohuEvent.setTimerPage(event.getTimerPage());
        chaohuEvent.setTimerStopwatchPage(event.getTimerStopwatchPage());
        chaohuEvent.setWaitGpsLocationNum(event.getWaitGpsLocationNum());
        chaohuEvent.setWeatherPage(event.getWeatherPage());
        if (event.hasAlipayQRCodeNum()) {
            chaohuEvent.setAlipayQRCodeNum(event.getAlipayQRCodeNum());
        }
        if (event.hasAlipayCode128Num()) {
            chaohuEvent.setAlipayCode128Num(event.getAlipayCode128Num());
        }
        if (event.hasDialId()) {
            chaohuEvent.setDialId(event.getDialId());
        }
        chaohuStatistic.setEvent(chaohuEvent);
        return chaohuStatistic;
    }

    private TempoStatistic b(Tempo.TempoStatisticsMessage message) {
        TempoStatistic tempoStatistic = new TempoStatistic();
        tempoStatistic.setBacklightLevel(message.getBacklightLevel());
        tempoStatistic.setSilenceMode(message.getSilenceMode().getNumber());
        tempoStatistic.setScreenLock(message.getScreenLock());
        tempoStatistic.setStatistic(c(message.getBase()));
        Tempo.TempoEventMessage event = message.getEvent();
        TempoEvent tempoEvent = new TempoEvent();
        tempoEvent.setAlarmPage(event.getAlarmPage());
        tempoEvent.setCountdownNum(event.getCountdownNum());
        tempoEvent.setDial2DND(event.getDial2DND());
        tempoEvent.setDial2MainItem1(event.getDial2MainItem1());
        tempoEvent.setDial2Notify(event.getDial2Notify());
        tempoEvent.setMirrorScreenHeartratePage(event.getMirrorScreenHeartratePage());
        tempoEvent.setMirrorScreenMainPage(event.getMirrorScreenMainPage());
        tempoEvent.setMirrorScreenTimePage(event.getMirrorScreenTimePage());
        tempoEvent.setNotifyPage(event.getNotifyPage());
        tempoEvent.setSettingBacklightPage(event.getSettingBacklightPage());
        tempoEvent.setSettingPage(event.getSettingPage());
        tempoEvent.setSettingScreenLockPage(event.getSettingScreenLockPage());
        tempoEvent.setSettingWatchfacePage(event.getSettingWatchfacePage());
        tempoEvent.setStatusPage1(event.getStatusPage1());
        tempoEvent.setStatusPage2(event.getStatusPage2());
        tempoEvent.setStopwatchNum(event.getStopwatchNum());
        tempoEvent.setTimerCountdownPage(event.getTimerCountdownPage());
        tempoEvent.setTimerPage(event.getTimerPage());
        tempoEvent.setTimerStopwatchPage(event.getTimerStopwatchPage());
        tempoEvent.setWeatherPage(event.getWeatherPage());
        if (event.hasAlipayQRCodeNum()) {
            tempoEvent.setAlipayQRCodeNum(event.getAlipayQRCodeNum());
        }
        if (event.hasAlipayCode128Num()) {
            tempoEvent.setAlipayCode128Num(event.getAlipayCode128Num());
        }
        if (event.hasDialId()) {
            tempoEvent.setDialId(event.getDialId());
        }
        tempoStatistic.setTempoEvent(tempoEvent);
        return tempoStatistic;
    }

    private Statistic c(StatisBase.StatisBaseMessage message) {
        Statistic statistic = new Statistic();
        statistic.setAlarmsCount(message.getAlarmsCount());
        statistic.setAlgTime(message.getAlgTime());
        statistic.setAppNotifyCount(message.getAppNotifyCount());
        statistic.setConnTime(message.getConnTime());
        statistic.setDisconnectCount(message.getDisconnectCount());
        statistic.setFlashTime(message.getFlashTime());
        statistic.setKeyCount(message.getKeyCount());
        statistic.setLcdTime(message.getLcdTime());
        statistic.setLiftWristCount(message.getLiftWristCount());
        statistic.setPhoneCount(message.getPhoneCount());
        statistic.setPpgTime(message.getPpgTime());
        statistic.setRebootCount(message.getRebootCount());
        statistic.setRunTime(message.getRunTime());
        statistic.setSedCount(message.getSedCount());
        statistic.setUpTime(message.getUpTime());
        statistic.setVibTime(message.getVibTime());
        return statistic;
    }

    private void d(byte[] data) {
        try {
            this.d.write(data);
        } catch (Exception unused) {
        }
    }

    private void e(byte[] data) {
        if (data == null || data.length % 2 != 0) {
            return;
        }
        for (int i = 0; i < data.length; i += 2) {
            this.c.add(Integer.valueOf((data[i] & 255) | ((data[i + 1] & 255) << 8)));
        }
    }

    private void f(byte[] data) {
        try {
            this.d.write(data);
        } catch (Exception unused) {
        }
    }

    public void deInit() {
        int i = a.a[this.a.ordinal()];
        if (i != 2) {
            if (i == 3 || i == 4) {
                this.f = this.d.toByteArray();
                try {
                    this.d.close();
                    this.d = null;
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        try {
            byte[] byteArray = this.d.toByteArray();
            HMDeviceSource hMDeviceSource = this.b;
            if (hMDeviceSource == HMDeviceSource.MILI_TEMPO) {
                this.e = b(Tempo.TempoStatisticsMessage.parseFrom(byteArray));
            } else if (hMDeviceSource == HMDeviceSource.MILI_PEYTO || hMDeviceSource == HMDeviceSource.MILI_PEYTO_L || hMDeviceSource == HMDeviceSource.MILI_PEYTO_WL) {
                this.e = Chaohu.ChaoHuStatisticsMessage.parseFrom(byteArray);
            } else if (hMDeviceSource == HMDeviceSource.MILI_CINCO || hMDeviceSource == HMDeviceSource.MILI_CINCO_L) {
                this.e = Cinco.CincoStatisticsMessage.parseFrom(byteArray);
            } else if (hMDeviceSource == HMDeviceSource.MILI_BEATS) {
                this.e = Beats.BeatsStatisticsMessage.parseFrom(byteArray);
            } else if (hMDeviceSource == HMDeviceSource.MILI_BEATS_P) {
                this.e = Beatsp.BeatsPStatisticsMessage.parseFrom(byteArray);
            } else if (hMDeviceSource == HMDeviceSource.MILI_DTH || hMDeviceSource == HMDeviceSource.MILI_DTH_W) {
                this.e = Dongtinghu.DongTingHuStatisticsMessage.parseFrom(byteArray);
            } else if (hMDeviceSource == HMDeviceSource.MILI_TONLESAP_O || hMDeviceSource == HMDeviceSource.MILI_TONLESAP_OL) {
                this.e = Tonlesap.TonlesapStatisticsMessage.parseFrom(byteArray);
            } else if (hMDeviceSource == HMDeviceSource.MILI_PYH || hMDeviceSource == HMDeviceSource.MILI_PYH_W) {
                this.e = Pyh.PyhStatisticsMessage.parseFrom(byteArray);
            } else if (hMDeviceSource == HMDeviceSource.MILI_JIUHUASHAN || hMDeviceSource == HMDeviceSource.MILI_JIUHUASHAN_PRO || hMDeviceSource == HMDeviceSource.MILI_JIUHUASHAN_NMPA_BLE_NB || hMDeviceSource == HMDeviceSource.MILI_JIUHUASHAN_PRO_NMPA_BLE_NB) {
                this.e = Jiuhuashan.JiuhuashanStatisticsMessage.parseFrom(byteArray);
            } else if (hMDeviceSource == HMDeviceSource.MILI_FALCON || hMDeviceSource == HMDeviceSource.MILI_FALCON_W || hMDeviceSource == HMDeviceSource.MILI_FALCON_L || hMDeviceSource == HMDeviceSource.MILI_FALCON_WL || hMDeviceSource == HMDeviceSource.TIMEX_FALCON) {
                this.e = Falcon.FalconStatisticsMessage.parseFrom(byteArray);
            } else if (hMDeviceSource == HMDeviceSource.MILI_HAWK || hMDeviceSource == HMDeviceSource.MILI_HAWK_W || hMDeviceSource == HMDeviceSource.MILI_HAWK_L || hMDeviceSource == HMDeviceSource.MILI_HAWK_WL || hMDeviceSource == HMDeviceSource.TIMEX_HAWK) {
                this.e = Hawk.HawkStatisticsMessage.parseFrom(byteArray);
            } else if (hMDeviceSource == HMDeviceSource.MILI_KESTREL || hMDeviceSource == HMDeviceSource.MILI_KESTREL_W || hMDeviceSource == HMDeviceSource.MILI_KESTREL_L || hMDeviceSource == HMDeviceSource.MILI_KESTREL_WL || hMDeviceSource == HMDeviceSource.TIMEX_KESTREL) {
                this.e = Kestrel.KestrelStatisticsMessage.parseFrom(byteArray);
            } else if (hMDeviceSource == HMDeviceSource.MILI_VULTURE) {
                this.e = Vulture.VultrueStatisticsMessage.parseFrom(byteArray);
            } else if (HMDeviceFeature.TIMEX_DEVICE.contains(hMDeviceSource)) {
                this.e = TimexOrigin.TimexStatisticsMessage.parseFrom(byteArray);
            } else {
                HMDeviceSource hMDeviceSource2 = this.b;
                if (hMDeviceSource2 == HMDeviceSource.MILI_TOKYO) {
                    this.e = Tokyo.TokyoStatisticMessage.parseFrom(byteArray);
                } else if (hMDeviceSource2 == HMDeviceSource.MILI_KONGMING || hMDeviceSource2 == HMDeviceSource.MILI_KONGMING_L || hMDeviceSource2 == HMDeviceSource.MILI_KONGMING_PRO || hMDeviceSource2 == HMDeviceSource.MILI_KONGMING_PRO_L || hMDeviceSource2 == HMDeviceSource.MILI_KONGMING_LITE) {
                    this.e = Kongming.KongmingStatisticsMessage.parseFrom(byteArray);
                } else if (hMDeviceSource2 == HMDeviceSource.MILI_ONYX || hMDeviceSource2 == HMDeviceSource.MILI_CORSICA || hMDeviceSource2 == HMDeviceSource.MILI_ONYX_W || hMDeviceSource2 == HMDeviceSource.MILI_CORSICA_W || hMDeviceSource2 == HMDeviceSource.MILI_BLANC || hMDeviceSource2 == HMDeviceSource.MILI_BLANC_W) {
                    this.e = Onyx.onyxStatisticsMessage.parseFrom(byteArray);
                } else if (hMDeviceSource2 == HMDeviceSource.MILI_OSPREY || hMDeviceSource2 == HMDeviceSource.MILI_OSPREY_W || hMDeviceSource2 == HMDeviceSource.MILI_OSPREY_C) {
                    this.e = Osprey.ospreyStatisticsMessage.parseFrom(byteArray);
                } else if (this.b == HMDeviceSource.MILI_LISBON || this.b == HMDeviceSource.MILI_LISBON_W || this.b == HMDeviceSource.MILI_NEWTON || this.b == HMDeviceSource.MILI_NEWTON_W || this.b == HMDeviceSource.MILI_LISBON_WL || this.b == HMDeviceSource.MILI_NEWTON_WL) {
                    this.e = Lisbon.lisbonStatisticsMessage.parseFrom(byteArray);
                } else if (this.b == HMDeviceSource.MILI_YORK || this.b == HMDeviceSource.MILI_NEW_YORK) {
                    this.e = York.YorkStatisticsMessage.parseFrom(byteArray);
                } else if (this.b == HMDeviceSource.MILI_VENICE || this.b == HMDeviceSource.MILI_VENICE_W || this.b == HMDeviceSource.MILI_LONDON || this.b == HMDeviceSource.MILI_LONDON_W) {
                    this.e = Venice.VeniceStatisticsMessage.parseFrom(byteArray);
                } else if (this.b == HMDeviceSource.MILI_HAMBURG || this.b == HMDeviceSource.MILI_HAMBURG_W || this.b == HMDeviceSource.MILI_BONN || this.b == HMDeviceSource.MILI_BONN_W) {
                    this.e = Hamburg.hamburgStatisticsMessage.parseFrom(byteArray);
                } else if (Arrays.asList(HMDeviceSource.MILI_COMO, HMDeviceSource.MILI_COMO_W, HMDeviceSource.MILI_COMO_L, HMDeviceSource.MILI_COMO_WL, HMDeviceSource.MILI_NESS, HMDeviceSource.MILI_NESS_W, HMDeviceSource.MILI_DAX).contains(this.b)) {
                    this.e = Como.ComoNessStatisticsMessage.parseFrom(byteArray);
                } else if (this.b == HMDeviceSource.MILI_PANGU_L || this.b == HMDeviceSource.MILI_PANGU) {
                    this.e = Pangu.PanguStatisticsMessage.parseFrom(byteArray);
                }
            }
            if (a.b[this.b.ordinal()] == 1) {
                this.e = Bell.BellStatisticsMessage.parseFrom(byteArray);
            }
            this.d.close();
            this.d = null;
        } catch (Exception e) {
            Debug.fi(g, "proto exception:" + e.getMessage());
        }
    }

    public Object get() {
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return this.c;
        }
        if (i == 2) {
            return this.e;
        }
        if (i != 3) {
            if (i != 4) {
                return null;
            }
            return this.f;
        }
        byte[] bArr = this.f;
        if (bArr != null && bArr.length > 1) {
            return new DeviceSettingsParser(this.b, this.f).get();
        }
        Debug.fi(g, "Device setting data invalid: " + GattUtils.bytesToHexString(this.f));
        return null;
    }

    public HMGDSPType getType() {
        return this.a;
    }

    public void init() {
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            this.c = new ArrayList<>();
        } else if (i == 2 || i == 3 || i == 4) {
            this.d = new ByteArrayOutputStream();
        }
    }

    public void parse(byte[] data) {
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            e(data);
            return;
        }
        if (i == 2 || i == 3) {
            f(data);
        } else {
            if (i != 4) {
                return;
            }
            d(data);
        }
    }
}
