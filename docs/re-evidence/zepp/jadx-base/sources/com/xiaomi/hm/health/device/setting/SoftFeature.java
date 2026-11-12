package com.xiaomi.hm.health.device.setting;

import android.app.Application;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.wallet.accessdoor.utils.ParamValue;
import com.huami.watch.companion.ui.activity.FindWatchActivity;
import com.huami.watch.transdata.transport.DataTransHelper;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'FLIGHT_BUTLER' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b:\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;¨\u0006<"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/SoftFeature;", "", "", "name", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "DIAL_SKIN", "E_SIM_MANAGEMENT", "PUSH_REMINDER", "HEALTH_DETECT", "DEVICE_SETTING", "DEVICE_APPLICATION_MANAGE", "SMART_ASSISTANT", "APPLICATION_SETTING", "DEVICE_DISPLAY_ITEM_SETTING", "NET_EAST_MUSIC", "FLIGHT_BUTLER", "TIGER_STOCKS", "ALI_PAY", "ALBUM", WebConstant.QueryParam.TYPE_ACTIVITY, "API", FindWatchActivity.MAIN_MODULE_TOOL_KEY_NAME, DataTransHelper.TYPE_SPORT, "SPORT_RECORD", "WEATHER", "ALARM", "MUSIC", "COMPASS", "COUNT_DOWN", "SETTING", "SCHEDULE", "NFC_CARD", "WORLD_CLOCK", "TELEPHONE", "SLEEP", "CASSETTE_PLAYER", "TEXT_MESSAGE", "TODO", "ALEXA", "PHONE_ALARM", "MEMBER_CARD", "NIGHT_MODE", "FIND_PHONE", "BLUE_TOOTH_BROADCAST", "BIND_LIMIT", "BACKGROUND_RUNNING", "SCREEN_UNLOCK", "VIBRATE_MODE", HMKeeperConstant.KEY_RING_TYPE, "XIAOAI", "FW_UPGRADE", "ABOUT", "FEEDBACK", "OFFLINE_VOICE_CMD", "NPS", "PLAY_HELP", "DISABLE_AGPS_OR_GDSP_STATUS", "JS_APP_STORE", "JS_APP_SETTING", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SoftFeature {
    private static final /* synthetic */ SoftFeature[] $VALUES;
    public static final SoftFeature ABOUT;
    public static final SoftFeature ACTIVITY;
    public static final SoftFeature ALARM;
    public static final SoftFeature ALBUM;
    public static final SoftFeature ALEXA;
    public static final SoftFeature ALI_PAY;
    public static final SoftFeature API;
    public static final SoftFeature BACKGROUND_RUNNING;
    public static final SoftFeature BIND_LIMIT;
    public static final SoftFeature BLUE_TOOTH_BROADCAST;
    public static final SoftFeature CASSETTE_PLAYER;
    public static final SoftFeature COMPASS;
    public static final SoftFeature COUNT_DOWN;
    public static final SoftFeature DISABLE_AGPS_OR_GDSP_STATUS;
    public static final SoftFeature FEEDBACK;
    public static final SoftFeature FIND_DEVICE;
    public static final SoftFeature FIND_PHONE;
    public static final SoftFeature FLIGHT_BUTLER;
    public static final SoftFeature FW_UPGRADE;
    public static final SoftFeature JS_APP_SETTING;
    public static final SoftFeature JS_APP_STORE;
    public static final SoftFeature MEMBER_CARD;
    public static final SoftFeature MUSIC;
    public static final SoftFeature NFC_CARD;
    public static final SoftFeature NIGHT_MODE;
    public static final SoftFeature NPS;
    public static final SoftFeature OFFLINE_VOICE_CMD;
    public static final SoftFeature PHONE_ALARM;
    public static final SoftFeature PLAY_HELP;
    public static final SoftFeature RING_TYPE;
    public static final SoftFeature SCHEDULE;
    public static final SoftFeature SCREEN_UNLOCK;
    public static final SoftFeature SETTING;
    public static final SoftFeature SLEEP;
    public static final SoftFeature SPORT;
    public static final SoftFeature SPORT_RECORD;
    public static final SoftFeature TELEPHONE;
    public static final SoftFeature TEXT_MESSAGE;
    public static final SoftFeature TIGER_STOCKS;
    public static final SoftFeature TODO;
    public static final SoftFeature VIBRATE_MODE;
    public static final SoftFeature WEATHER;
    public static final SoftFeature WORLD_CLOCK;
    public static final SoftFeature XIAOAI;
    public static final SoftFeature DIAL_SKIN = new SoftFeature("DIAL_SKIN", 0, "表盘管理");
    public static final SoftFeature E_SIM_MANAGEMENT = new SoftFeature("E_SIM_MANAGEMENT", 1, "eSIM卡管理");
    public static final SoftFeature PUSH_REMINDER = new SoftFeature("PUSH_REMINDER", 2, "通知与提醒");
    public static final SoftFeature HEALTH_DETECT = new SoftFeature("HEALTH_DETECT", 3, "健康监测");
    public static final SoftFeature DEVICE_SETTING = new SoftFeature("DEVICE_SETTING", 4, "手环或手表设置，Zepp Life(小米运动)只适配手环");
    public static final SoftFeature DEVICE_APPLICATION_MANAGE = new SoftFeature("DEVICE_APPLICATION_MANAGE", 5, "应用列表管理");
    public static final SoftFeature SMART_ASSISTANT = new SoftFeature("SMART_ASSISTANT", 6, "智能助理");
    public static final SoftFeature APPLICATION_SETTING = new SoftFeature("APPLICATION_SETTING", 7, "应用设置");
    public static final SoftFeature DEVICE_DISPLAY_ITEM_SETTING = new SoftFeature("DEVICE_DISPLAY_ITEM_SETTING", 8, "手环显示设置");
    public static final SoftFeature NET_EAST_MUSIC = new SoftFeature("NET_EAST_MUSIC", 9, "网易云音乐");

    static {
        Application context = DeviceXFunctionsKt.getContext();
        int i = R.string.un_translate;
        FLIGHT_BUTLER = new SoftFeature("FLIGHT_BUTLER", 10, context.getString(i));
        TIGER_STOCKS = new SoftFeature("TIGER_STOCKS", 11, DeviceXFunctionsKt.getContext().getString(i));
        ALI_PAY = new SoftFeature("ALI_PAY", 12, TrainingAnalytics.ParamValue.PurchaseMethod.ALIPAY);
        ALBUM = new SoftFeature("ALBUM", 13, "相册");
        ACTIVITY = new SoftFeature(WebConstant.QueryParam.TYPE_ACTIVITY, 14, "活动目标");
        API = new SoftFeature("API", 15, "PAI");
        FIND_DEVICE = new SoftFeature(FindWatchActivity.MAIN_MODULE_TOOL_KEY_NAME, 16, "找手表、手环");
        SPORT = new SoftFeature(DataTransHelper.TYPE_SPORT, 17, "运动");
        SPORT_RECORD = new SoftFeature("SPORT_RECORD", 18, "运动记录");
        WEATHER = new SoftFeature("WEATHER", 19, "天气");
        ALARM = new SoftFeature("ALARM", 20, "闹钟");
        MUSIC = new SoftFeature("MUSIC", 21, "音乐");
        COMPASS = new SoftFeature("COMPASS", 22, "指南针");
        COUNT_DOWN = new SoftFeature("COUNT_DOWN", 23, "倒计时");
        SETTING = new SoftFeature("SETTING", 24, "设置");
        SCHEDULE = new SoftFeature("SCHEDULE", 25, "日程");
        NFC_CARD = new SoftFeature("NFC_CARD", 26, "卡包");
        WORLD_CLOCK = new SoftFeature("WORLD_CLOCK", 27, "世界时钟");
        TELEPHONE = new SoftFeature("TELEPHONE", 28, "电话");
        SLEEP = new SoftFeature("SLEEP", 29, "睡眠");
        CASSETTE_PLAYER = new SoftFeature("CASSETTE_PLAYER", 30, "录音机");
        TEXT_MESSAGE = new SoftFeature("TEXT_MESSAGE", 31, "短信");
        TODO = new SoftFeature("TODO", 32, "待办事项");
        ALEXA = new SoftFeature("ALEXA", 33, "Amazon Alexa");
        PHONE_ALARM = new SoftFeature("PHONE_ALARM", 34, "MIUI手机闹钟");
        MEMBER_CARD = new SoftFeature("MEMBER_CARD", 35, "会员卡");
        NIGHT_MODE = new SoftFeature("NIGHT_MODE", 36, "夜间模式");
        FIND_PHONE = new SoftFeature("FIND_PHONE", 37, "查找设备");
        BLUE_TOOTH_BROADCAST = new SoftFeature("BLUE_TOOTH_BROADCAST", 38, "蓝牙广播");
        BIND_LIMIT = new SoftFeature("BIND_LIMIT", 39, "限制绑定");
        BACKGROUND_RUNNING = new SoftFeature("BACKGROUND_RUNNING", 40, "后台运行权限");
        SCREEN_UNLOCK = new SoftFeature("SCREEN_UNLOCK", 41, "手机屏解锁");
        VIBRATE_MODE = new SoftFeature("VIBRATE_MODE", 42, "振动模式");
        RING_TYPE = new SoftFeature(HMKeeperConstant.KEY_RING_TYPE, 43, "查找手机铃声");
        XIAOAI = new SoftFeature("XIAOAI", 44, "Xiaoai");
        FW_UPGRADE = new SoftFeature("FW_UPGRADE", 45, "固件更新");
        ABOUT = new SoftFeature("ABOUT", 46, "关于本机");
        FEEDBACK = new SoftFeature("FEEDBACK", 47, ParamValue.FAQ);
        OFFLINE_VOICE_CMD = new SoftFeature("OFFLINE_VOICE_CMD", 48, "离线语音指令词");
        NPS = new SoftFeature("NPS", 49, "满意度调查");
        PLAY_HELP = new SoftFeature("PLAY_HELP", 50, "玩转");
        DISABLE_AGPS_OR_GDSP_STATUS = new SoftFeature("DISABLE_AGPS_OR_GDSP_STATUS", 51, "隐藏AGPS更新状态及进度");
        JS_APP_STORE = new SoftFeature("JS_APP_STORE", 52, "应用商城");
        JS_APP_SETTING = new SoftFeature("JS_APP_SETTING", 53, "更多设置");
        $VALUES = a();
    }

    private SoftFeature(String str, int i, String str2) {
        super(str, i);
    }

    private static final /* synthetic */ SoftFeature[] a() {
        return new SoftFeature[]{DIAL_SKIN, E_SIM_MANAGEMENT, PUSH_REMINDER, HEALTH_DETECT, DEVICE_SETTING, DEVICE_APPLICATION_MANAGE, SMART_ASSISTANT, APPLICATION_SETTING, DEVICE_DISPLAY_ITEM_SETTING, NET_EAST_MUSIC, FLIGHT_BUTLER, TIGER_STOCKS, ALI_PAY, ALBUM, ACTIVITY, API, FIND_DEVICE, SPORT, SPORT_RECORD, WEATHER, ALARM, MUSIC, COMPASS, COUNT_DOWN, SETTING, SCHEDULE, NFC_CARD, WORLD_CLOCK, TELEPHONE, SLEEP, CASSETTE_PLAYER, TEXT_MESSAGE, TODO, ALEXA, PHONE_ALARM, MEMBER_CARD, NIGHT_MODE, FIND_PHONE, BLUE_TOOTH_BROADCAST, BIND_LIMIT, BACKGROUND_RUNNING, SCREEN_UNLOCK, VIBRATE_MODE, RING_TYPE, XIAOAI, FW_UPGRADE, ABOUT, FEEDBACK, OFFLINE_VOICE_CMD, NPS, PLAY_HELP, DISABLE_AGPS_OR_GDSP_STATUS, JS_APP_STORE, JS_APP_SETTING};
    }

    public static SoftFeature valueOf(String str) {
        return (SoftFeature) Enum.valueOf(SoftFeature.class, str);
    }

    public static SoftFeature[] values() {
        return (SoftFeature[]) $VALUES.clone();
    }
}
