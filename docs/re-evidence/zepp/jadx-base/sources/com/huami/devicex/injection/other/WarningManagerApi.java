package com.huami.devicex.injection.other;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/huami/devicex/injection/other/WarningManagerApi;", "", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface WarningManagerApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int TYPE_AGPS_SYNC_FAILED = 19;
    public static final int TYPE_BATTERY_LOW_0 = 12;
    public static final int TYPE_BATTERY_LOW_0_WATCH = 15;
    public static final int TYPE_BATTERY_LOW_10 = 10;
    public static final int TYPE_BATTERY_LOW_10_WATCH = 13;
    public static final int TYPE_BATTERY_LOW_5 = 11;
    public static final int TYPE_BATTERY_LOW_5_WATCH = 14;
    public static final int TYPE_BLUETOOTH_OFF = 1;
    public static final int TYPE_MILI_CONNECT_TIMEOUT = 2;
    public static final int TYPE_MILI_SYNC_FAILED = 5;
    public static final int TYPE_MUSIC_ALIVE_FAILED = 21;
    public static final int TYPE_NORMANDY_CONNECT_TIMEOUT = 16;
    public static final int TYPE_NORMANDY_SYNC_FAILED = 17;
    public static final int TYPE_NO_DEVICE = 0;
    public static final int TYPE_PLAY_BEATS = 29;
    public static final int TYPE_PLAY_BEATS_W = 30;
    public static final int TYPE_PLAY_BFAT = 23;
    public static final int TYPE_PLAY_CINCO_H = 33;
    public static final int TYPE_PLAY_CINCO_L = 34;
    public static final int TYPE_PLAY_MILI = 22;
    public static final int TYPE_PLAY_MILI3_CHONGQING = 28;
    public static final int TYPE_PLAY_MILI3_WUHAN = 27;
    public static final int TYPE_PLAY_TEMPO = 26;
    public static final int TYPE_PLAY_WGHT = 24;
    public static final int TYPE_QUITE_MODE = 18;
    public static final int TYPE_SENSORHUB_SYNC_FAILED = 9;
    public static final int TYPE_SHOES_CONNECT_TIMEOUT = 4;
    public static final int TYPE_SHOES_SYNC_FAILED = 8;
    public static final int TYPE_SPECIFIC_PHONE_CONNECT_TIMEOUT = 20;
    public static final int TYPE_SPORT_WATCH_SYNC_FAILED = 7;
    public static final int TYPE_WATCH_CONNECT_TIMEOUT = 3;
    public static final int TYPE_WATCH_SYNC_FAIL = 256;
    public static final int TYPE_WATCH_SYNC_FAILED = 6;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b%\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0016\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004¨\u0006'"}, d2 = {"Lcom/huami/devicex/injection/other/WarningManagerApi$Companion;", "", "", "TYPE_NO_DEVICE", LogUtil.I, "TYPE_BLUETOOTH_OFF", "TYPE_MILI_CONNECT_TIMEOUT", "TYPE_WATCH_CONNECT_TIMEOUT", "TYPE_SHOES_CONNECT_TIMEOUT", "TYPE_MILI_SYNC_FAILED", "TYPE_WATCH_SYNC_FAILED", "TYPE_SPORT_WATCH_SYNC_FAILED", "TYPE_SHOES_SYNC_FAILED", "TYPE_SENSORHUB_SYNC_FAILED", "TYPE_BATTERY_LOW_10", "TYPE_BATTERY_LOW_5", "TYPE_BATTERY_LOW_0", "TYPE_BATTERY_LOW_10_WATCH", "TYPE_BATTERY_LOW_5_WATCH", "TYPE_BATTERY_LOW_0_WATCH", "TYPE_NORMANDY_CONNECT_TIMEOUT", "TYPE_NORMANDY_SYNC_FAILED", "TYPE_QUITE_MODE", "TYPE_AGPS_SYNC_FAILED", "TYPE_SPECIFIC_PHONE_CONNECT_TIMEOUT", "TYPE_MUSIC_ALIVE_FAILED", "TYPE_PLAY_MILI", "TYPE_PLAY_BFAT", "TYPE_PLAY_WGHT", "TYPE_PLAY_TEMPO", "TYPE_PLAY_MILI3_WUHAN", "TYPE_PLAY_MILI3_CHONGQING", "TYPE_PLAY_BEATS", "TYPE_PLAY_BEATS_W", "TYPE_PLAY_CINCO_H", "TYPE_PLAY_CINCO_L", "TYPE_WATCH_SYNC_FAIL", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int TYPE_AGPS_SYNC_FAILED = 19;
        public static final int TYPE_BATTERY_LOW_0 = 12;
        public static final int TYPE_BATTERY_LOW_0_WATCH = 15;
        public static final int TYPE_BATTERY_LOW_10 = 10;
        public static final int TYPE_BATTERY_LOW_10_WATCH = 13;
        public static final int TYPE_BATTERY_LOW_5 = 11;
        public static final int TYPE_BATTERY_LOW_5_WATCH = 14;
        public static final int TYPE_BLUETOOTH_OFF = 1;
        public static final int TYPE_MILI_CONNECT_TIMEOUT = 2;
        public static final int TYPE_MILI_SYNC_FAILED = 5;
        public static final int TYPE_MUSIC_ALIVE_FAILED = 21;
        public static final int TYPE_NORMANDY_CONNECT_TIMEOUT = 16;
        public static final int TYPE_NORMANDY_SYNC_FAILED = 17;
        public static final int TYPE_NO_DEVICE = 0;
        public static final int TYPE_PLAY_BEATS = 29;
        public static final int TYPE_PLAY_BEATS_W = 30;
        public static final int TYPE_PLAY_BFAT = 23;
        public static final int TYPE_PLAY_CINCO_H = 33;
        public static final int TYPE_PLAY_CINCO_L = 34;
        public static final int TYPE_PLAY_MILI = 22;
        public static final int TYPE_PLAY_MILI3_CHONGQING = 28;
        public static final int TYPE_PLAY_MILI3_WUHAN = 27;
        public static final int TYPE_PLAY_TEMPO = 26;
        public static final int TYPE_PLAY_WGHT = 24;
        public static final int TYPE_QUITE_MODE = 18;
        public static final int TYPE_SENSORHUB_SYNC_FAILED = 9;
        public static final int TYPE_SHOES_CONNECT_TIMEOUT = 4;
        public static final int TYPE_SHOES_SYNC_FAILED = 8;
        public static final int TYPE_SPECIFIC_PHONE_CONNECT_TIMEOUT = 20;
        public static final int TYPE_SPORT_WATCH_SYNC_FAILED = 7;
        public static final int TYPE_WATCH_CONNECT_TIMEOUT = 3;
        public static final int TYPE_WATCH_SYNC_FAIL = 256;
        public static final int TYPE_WATCH_SYNC_FAILED = 6;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }
}
