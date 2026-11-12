package com.huami.bluetooth.profile.gdsp;

import com.huami.bluetooth.profile.data.MultiPacketDataParser;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.statistic.Statistic;
import com.xiaomi.hm.health.bt.model.statistic.TempoEvent;
import com.xiaomi.hm.health.bt.model.statistic.TempoStatistic;
import com.xiaomi.hm.health.bt.proto.Beats;
import com.xiaomi.hm.health.bt.proto.Beatsp;
import com.xiaomi.hm.health.bt.proto.Chaohu;
import com.xiaomi.hm.health.bt.proto.Cinco;
import com.xiaomi.hm.health.bt.proto.Dongtinghu;
import com.xiaomi.hm.health.bt.proto.Falcon;
import com.xiaomi.hm.health.bt.proto.Hawk;
import com.xiaomi.hm.health.bt.proto.Jiuhuashan;
import com.xiaomi.hm.health.bt.proto.Kestrel;
import com.xiaomi.hm.health.bt.proto.Mozart;
import com.xiaomi.hm.health.bt.proto.Pyh;
import com.xiaomi.hm.health.bt.proto.StatisBase;
import com.xiaomi.hm.health.bt.proto.Tempo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\nH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/gdsp/DeviceStatisticParser;", "Lcom/huami/bluetooth/profile/data/MultiPacketDataParser;", "", "", "data", "b", "Lcom/xiaomi/hm/health/bt/proto/Tempo$TempoStatisticsMessage;", "message", "Lcom/xiaomi/hm/health/bt/model/statistic/TempoStatistic;", "a", "Lcom/xiaomi/hm/health/bt/proto/StatisBase$StatisBaseMessage;", "Lcom/xiaomi/hm/health/bt/model/statistic/Statistic;", "c", "get", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceStatisticParser extends MultiPacketDataParser<Object> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource source;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_TEMPO.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_PEYTO.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_PEYTO_L.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_PEYTO_WL.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_CINCO.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_CINCO_L.ordinal()] = 6;
            iArr[HMDeviceSource.MILI_BEATS.ordinal()] = 7;
            iArr[HMDeviceSource.MILI_BEATS_P.ordinal()] = 8;
            iArr[HMDeviceSource.MILI_DTH.ordinal()] = 9;
            iArr[HMDeviceSource.MILI_DTH_W.ordinal()] = 10;
            iArr[HMDeviceSource.MILI_JIUHUASHAN.ordinal()] = 11;
            iArr[HMDeviceSource.MILI_JIUHUASHAN_NMPA_BLE_NB.ordinal()] = 12;
            iArr[HMDeviceSource.MILI_JIUHUASHAN_PRO.ordinal()] = 13;
            iArr[HMDeviceSource.MILI_JIUHUASHAN_PRO_NMPA_BLE_NB.ordinal()] = 14;
            iArr[HMDeviceSource.MILI_PYH.ordinal()] = 15;
            iArr[HMDeviceSource.MILI_PYH_W.ordinal()] = 16;
            iArr[HMDeviceSource.MILI_FALCON.ordinal()] = 17;
            iArr[HMDeviceSource.MILI_FALCON_W.ordinal()] = 18;
            iArr[HMDeviceSource.MILI_FALCON_L.ordinal()] = 19;
            iArr[HMDeviceSource.MILI_FALCON_WL.ordinal()] = 20;
            iArr[HMDeviceSource.MILI_HAWK.ordinal()] = 21;
            iArr[HMDeviceSource.MILI_HAWK_W.ordinal()] = 22;
            iArr[HMDeviceSource.MILI_HAWK_L.ordinal()] = 23;
            iArr[HMDeviceSource.MILI_HAWK_WL.ordinal()] = 24;
            iArr[HMDeviceSource.MILI_KESTREL.ordinal()] = 25;
            iArr[HMDeviceSource.MILI_KESTREL_W.ordinal()] = 26;
            iArr[HMDeviceSource.MILI_KESTREL_L.ordinal()] = 27;
            iArr[HMDeviceSource.MILI_KESTREL_WL.ordinal()] = 28;
            iArr[HMDeviceSource.OTHER_MOZART.ordinal()] = 29;
            iArr[HMDeviceSource.OTHER_HAYDN.ordinal()] = 30;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DeviceStatisticParser(@NotNull HMDeviceSource hMDeviceSource) {
        this.source = hMDeviceSource;
    }

    private final TempoStatistic a(Tempo.TempoStatisticsMessage message) {
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

    private final Object b(byte[] data) {
        switch (WhenMappings.$EnumSwitchMapping$0[this.source.ordinal()]) {
            case 1:
                return a(Tempo.TempoStatisticsMessage.parseFrom(data));
            case 2:
            case 3:
            case 4:
                return Chaohu.ChaoHuStatisticsMessage.parseFrom(data);
            case 5:
            case 6:
                return Cinco.CincoStatisticsMessage.parseFrom(data);
            case 7:
                return Beats.BeatsStatisticsMessage.parseFrom(data);
            case 8:
                return Beatsp.BeatsPStatisticsMessage.parseFrom(data);
            case 9:
            case 10:
                return Dongtinghu.DongTingHuStatisticsMessage.parseFrom(data);
            case 11:
            case 12:
                return Jiuhuashan.JiuhuashanStatisticsMessage.parseFrom(data);
            case 13:
            case 14:
                return Jiuhuashan.JiuhuashanStatisticsMessage.parseFrom(data);
            case 15:
            case 16:
                return Pyh.PyhStatisticsMessage.parseFrom(data);
            case 17:
            case 18:
            case 19:
            case 20:
                return Falcon.FalconStatisticsMessage.parseFrom(data);
            case 21:
            case 22:
            case 23:
            case 24:
                return Hawk.HawkStatisticsMessage.parseFrom(data);
            case 25:
            case 26:
            case 27:
            case 28:
                return Kestrel.KestrelStatisticsMessage.parseFrom(data);
            case 29:
            case 30:
                return Mozart.MozartStatisticsMessage.parseFrom(data);
            default:
                return null;
        }
    }

    private final Statistic c(StatisBase.StatisBaseMessage message) {
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

    @Override // com.huami.bluetooth.profile.data.MultiPacketDataParser, com.huami.bluetooth.profile.data.DataParser
    @Nullable
    public Object get() {
        byte[] byteArray = getData().toByteArray();
        if (byteArray.length == 0) {
            return null;
        }
        return b(byteArray);
    }
}
