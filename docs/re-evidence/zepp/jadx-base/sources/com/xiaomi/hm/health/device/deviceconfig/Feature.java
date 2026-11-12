package com.xiaomi.hm.health.device.deviceconfig;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0003\b´\u0001\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001¨\u0006¶\u0001"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/Feature;", "", "", "desc", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "SUPPORT_WATCH_STORE_S", "KONGMING_SERIES_S", "PANGU_SERIES_S", "L66_SERIES_S", "YORK_SERIES_S", "COMO_NESS_SERIES_S", "CINCO_SERIES_S", "TEMP_SERIES_S", "WUHAN_SERIES_S", "CHAOHU_SERIES_S", "PYH_SERIES_S", "FALCON_SERIES_S", "HAWK_SERIES_S", "KESTREL_SERIES_S", "GT_SOURCE_S", "SUPPORT_ONLINE_DIAL", "HUMIDITY_WIND_S", "HR_REALTIME_SOURCE_S", "HR_SOURCE_S", "HR_OFFLINE_SOURCE_S", "SPORT_SOURCE_S", "PRO_SOURCE_S", "FONT_RES_SOURCE_S", "AUTH_SOURCE_S", "FULL_HR_SOURCE_S", "FULL_HR_READ_WRITE_SOURCE_S", "WEATHER_SOURCE_S", "BACK_LIGHT_SOURCE_S", "WEATHER_SUNSET_SUNRISE", "LOG_SOURCE_S", "RESET_ON_DEVICE_S", "SECONDARY_SCREEN_S", "SUPPORT_DATE_FORMAT_S", "PROTOCAL_NEW_S", "ENABLE_HIDEALL_S", "PRODUCT_VERSION_S", "REMINDER_SOURCE_S", "COMPRESS_RES_SOURCE_S", "GPS_DATA_SOURCE_S", "LAZY_ALARM_SOURCE_S", "TEMPO_WATCH_FACE", "PEYTO_WATCH_FACE", "SPORT_TIME_SOURCE_S", "G3_SOURCE_S", "DISCONNECT_REMIND_SOURCE_S", "DND_SOURCE_S", "MUTE_PHONE_SOURCE_S", "LATIN_FW_SOURCE_S", "PAI_SOURCE_S", "MUSIC_CONTROL_SOURCE_S", "CUSTOM_VIBRATE", "LIFT_WRIST_SENSITIVITY", "SPORT_HR_DETECT", "HR_ALERT", "BAND_CONFIRM_ON_SCREEN", "SHOE_SOURCES", "DEVICE_SPORT_SOURCE_S", "DEVICE_SPORT_SUPPORT_GPS", "SUPPORT_AVOID_SPITE_BIND", "SUPPORT_LAPTOP_UNLOCK", "SUPPORT_LIBRARY", "SUPPORT_GET_TEMPERATURE_S", "LINKAGE_NOTIFICATION", "MUSIC_VOLUME", "OFF_WIST_LOCK_S", "OFF_WIST_LOCK_S_ACCURATE", "KOREAN_DISABLE_AUTO_LOCATE_S", "SPORT_HR_BROADCAST", "CALENDAR_AND_START_DAY_OF_WEEK", "WATCH_SOURCE_S", "BFS_SOURCE_S", "BAND3_SOURCE_S", "NEW_CAL_SOURCE_S", "PROTO_STATISTICS_SOURCE_S", "G1_SOURCE_S", "G2_SOURCE_S", "SPEECH_SOURCE_S", "SUPPORT_NEW_SPEECH_SOURCES", "SUPPORT_VIBRATE_NOTIFY_SOURCES", "SUPPORT_OLD_AUTH_SOURCES", "WEIGHT_SOURCES", "WEIGHT_SUPPORT_ACTIVE_CONNECT", "NOT_SUPPORT_DEFAULT_LAZY_ALARM", "NOT_SUPPORT_LF_EVENT_SOURCES", "NOT_SUPPORT_RT_STEP_SOURCES", "NOT_SUPPORT_AUTO_CONNECT_SOURCES", "SUPPORT_ANALYZE_SWIMMING_DATA_SOURCE", "XI_HU_SOURCE_S", "EVEREST_SOURCE_S", "HEART_RATE_REGION_S", "CLASSIC_BT_GPS_SOURCE_S", "CLASSIC_BT_SOURCE_S", "NFC_BUS", "NFC_DOOR", "NFC_TAG", "NFC_CAR_XP", "SUPPORT_ATRIAL_FIB", "EVEREST_2_SERIES", "SUPPORT_NATIVE_DIAL", "SUPPORT_EVENT_REMIND_NEW_NAME", "DISABLE_SCHEDULE", "CHOPIN_SOURCE_S", "NPS_QUESTION", "SUPPORT_DEVICE_LANGUAGE", "SUPPORT_SIX_OFF_WIST_PWD", "SUPPORT_HEALTH_DETECT", "SUPPORT_WATCH_EDIT_S", "HIDE_WATCH_SKIN_DOWNLOAD_TIME", "COMPRESS_DIAL", "UIH_COMPRESS_DIAL", "SUPPORT_CHANGE_ALARM_ON_DEVICE", "SUPPORT_CHANGE_REMINDER_ON_DEVICE", "ROUND_WATCH_S", "SQUARE_WATCH_S", "GES_SCREEN_ANIM", "OFF_WIST_ZERO_TO_NINE", "SUPPORT_SCHEDULE", "SUPPORT_UVI", "GT2_SOURCE", "GT3_SOURCE", "GT4_SOURCE", "SMART_ASSISTANT", "SUPPORT_NEW_DEVICE_SETTING", "SUPPORT_RR_PEAK", "SUPPORT_ECG", "SUPPORT_WATCH_FACE_STORE", "SUPPORT_TAKE_PIC", "SUPPORT_UNBIND_ACTION", "SUPPORT_STAND_ALERT", "SUPPORT_FAKE_STAND_ALERT", "SUPPORT_APP_SORT_NEW", "SUPPORT_INCOMING_CALL_REPLY", "SUPPORT_TODO", "FEMALE_HEALTH", "NEED_INJECT_TOKEN", "SUPPORT_PM", "IS_MEDICAL_DEVICE", "IS_MEDICAL_COLLECT_DEVICE", "SUPPORT_HEALTH_DETECT_TITLE", "SUPPORT_OFFLINE_VOICE", "HEADSET_MOZART_SOURCE_S", "SUPPORT_BIND_INTRO", "SUPPORT_FOLLOW_PHONE_LANGUAGE", "AMAZFIT_X_SOURCE_S", "IS_VIRTUAL_DEVICE", "UPLOAD_DEVICE_SETTINGS", "BTSTATUS_RETRY_UI", "IS_SUPPORT_SINGLE_EAR_UPGRADE", "ALEXA_PAIR_DEVICE", "BOUND_REFUSE_RETRY", "CLASSIC_BLUETOOTH_CYCLE_SCAN", "SELECT_RESTORE_SOURCE", "SUPPORT_READ_FEATURE_FROM_DEVICE", "SUPPORT_READ_APP_SORT_FROM_DEVICE", "APP_SORT_NEW_ICON", "SUPPORT_FIND_BAND_VIBRATE_TYPE", "MI_BAND_SERIES", "BOLT_SERIES", "SUPPORT_SPORT_SETTING", "SUPPORT_SIX_PASSWORD", "SUPPORT_JS_APP", "ZEPP_OS_DEVICE", "SUPPORT_VOICE", "NFC_MASTER", "SUPPORT_WEB_INTRO", "SUPPORT_FINE_GRAININESS", "SUPPORT_LANGUAGE_CHANGE_BY_APP_DEVICE", "SUPPORT_SCHEDULE_VIBRATE_MODE", "SUPPORT_SETTINGS_UPLOAD", "JS_DIAL", "SUPPORT_GPS", "OVERSEA", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public enum Feature {
    SUPPORT_WATCH_STORE_S("支持表盘商城的设备"),
    KONGMING_SERIES_S("KONGMING系列设备"),
    PANGU_SERIES_S("PANGU系列设备"),
    L66_SERIES_S("L66系列设备"),
    YORK_SERIES_S("YORK系列设备"),
    COMO_NESS_SERIES_S("COMO/NESS系列设备"),
    CINCO_SERIES_S("CINCO系列设备"),
    TEMP_SERIES_S("Tempo系列设备"),
    WUHAN_SERIES_S("武汉系列设备"),
    CHAOHU_SERIES_S("巢湖系列设备"),
    PYH_SERIES_S("鄱阳湖系列设备"),
    FALCON_SERIES_S("Falcon系列设备"),
    HAWK_SERIES_S("Hawk系列设备"),
    KESTREL_SERIES_S("Kestrel系列设备"),
    GT_SOURCE_S("GT系列设备"),
    SUPPORT_ONLINE_DIAL("支持在线表盘(非H5实现)"),
    HUMIDITY_WIND_S("支持风力风向和湿度"),
    HR_REALTIME_SOURCE_S("支持运动实时心率的设备"),
    HR_SOURCE_S("支持心率的设备类型"),
    HR_OFFLINE_SOURCE_S("支持离线测量心率的设备类型"),
    SPORT_SOURCE_S("支持运动副屏的设备"),
    PRO_SOURCE_S("二代手环设备类型"),
    FONT_RES_SOURCE_S("支持字库和资源的设备类型"),
    AUTH_SOURCE_S("需要敲击验证并且需要保存验证key的设备类型"),
    FULL_HR_SOURCE_S("支持全天心率的设备类型"),
    FULL_HR_READ_WRITE_SOURCE_S("支持读写全天心率的设备类型"),
    WEATHER_SOURCE_S("支持显示天气的设备"),
    BACK_LIGHT_SOURCE_S("支持夜间模式的设备"),
    WEATHER_SUNSET_SUNRISE("支持在天气页面展示日出日落的设备"),
    LOG_SOURCE_S("支持日志的设备"),
    RESET_ON_DEVICE_S("支持独立进行重置的设备"),
    SECONDARY_SCREEN_S("支持负一屏展示的设备"),
    SUPPORT_DATE_FORMAT_S("需要写时间格式的设备"),
    PROTOCAL_NEW_S("支持新排序协议的设备"),
    ENABLE_HIDEALL_S("支持应用全部隐藏"),
    PRODUCT_VERSION_S("需要区分ProductVersion的设备"),
    REMINDER_SOURCE_S("支持事件提醒的设备"),
    COMPRESS_RES_SOURCE_S("使用压缩资源的设备"),
    GPS_DATA_SOURCE_S("存储GPS运动协议数据格式的设备"),
    LAZY_ALARM_SOURCE_S("支持懒睡闹钟的设备(设置闹钟页面懒睡选项可见)"),
    TEMPO_WATCH_FACE("支持tempo表盘设置的设备（暂定）"),
    PEYTO_WATCH_FACE("支持chaohu表盘设置的设备（暂定）"),
    SPORT_TIME_SOURCE_S("支持运动或者记时的设备列表"),
    G3_SOURCE_S("第三代手环/手表,功能列表：短信提醒使用小米运动、心率设置单独弹出界面、抬腕时间段设置、铃声类型、停用命令"),
    DISCONNECT_REMIND_SOURCE_S("支持断连提醒的设备列表"),
    DND_SOURCE_S("支持App设置勿扰模式的设备类型"),
    MUTE_PHONE_SOURCE_S("支持手环控制手机静音功能"),
    LATIN_FW_SOURCE_S("支持拉丁固件、字体、资源的设备类型"),
    PAI_SOURCE_S("支持PAI数据的设备类型"),
    MUSIC_CONTROL_SOURCE_S("支持音乐控制的设备类型"),
    CUSTOM_VIBRATE("支持自定义振动的设备类型"),
    LIFT_WRIST_SENSITIVITY("支持设置抬腕亮屏灵敏度的设备类型"),
    SPORT_HR_DETECT("支持运动心率检测的设备类型"),
    HR_ALERT("支持心率预警的设备类型"),
    BAND_CONFIRM_ON_SCREEN("支持在设备屏幕内点击确认绑定的手环类设备，“请在手环上确认绑定”"),
    SHOE_SOURCES("跑鞋系列设备"),
    DEVICE_SPORT_SOURCE_S("需要App传GPS点的设备类型"),
    DEVICE_SPORT_SUPPORT_GPS("自带GPS，使用WGS－84原始坐标系"),
    SUPPORT_AVOID_SPITE_BIND("支持防恶意绑定的设备类型"),
    SUPPORT_LAPTOP_UNLOCK("支持小米笔记本解锁"),
    SUPPORT_LIBRARY("支持实验室功能"),
    SUPPORT_GET_TEMPERATURE_S("支持获取温度统计数据的设备类型"),
    LINKAGE_NOTIFICATION("支持消息联动删除的设备类型"),
    MUSIC_VOLUME("支持展示音量的设备类型"),
    OFF_WIST_LOCK_S("支持离腕锁定的设备"),
    OFF_WIST_LOCK_S_ACCURATE("更准确的离腕锁定。入口在设备页。只支持OFF_WIST_LOCK_S入口放在实验室"),
    KOREAN_DISABLE_AUTO_LOCATE_S("韩国天气，去除自动定位的设备"),
    SPORT_HR_BROADCAST("支持运动心率广播的设备"),
    CALENDAR_AND_START_DAY_OF_WEEK("支持其他历法和设置星期开始时间的设备"),
    WATCH_SOURCE_S("手表系列设备"),
    BFS_SOURCE_S("体脂秤系列设备"),
    BAND3_SOURCE_S("手环3系列设备"),
    NEW_CAL_SOURCE_S("支持新卡路里计算的设备"),
    PROTO_STATISTICS_SOURCE_S("支持使用Protobuf获取统计信息的设备"),
    G1_SOURCE_S("第一代手环"),
    G2_SOURCE_S("第二代手环"),
    SPEECH_SOURCE_S("支持语音的设备类型"),
    SUPPORT_NEW_SPEECH_SOURCES("支持新小爱通信协议的设备"),
    SUPPORT_VIBRATE_NOTIFY_SOURCES("支持设备震动提醒通知栏消息的设备"),
    SUPPORT_OLD_AUTH_SOURCES("支持老认证方式的的设备"),
    WEIGHT_SOURCES("秤系列设备"),
    WEIGHT_SUPPORT_ACTIVE_CONNECT("支持主动重连的秤设备"),
    NOT_SUPPORT_DEFAULT_LAZY_ALARM("MILI类型，且除以下设备外，都默认支持懒睡模式，且页面隐藏懒睡模式选项，绑定时，会将已有的闹钟变成懒睡模式闹钟。"),
    NOT_SUPPORT_LF_EVENT_SOURCES("不支持低频事件的设备"),
    NOT_SUPPORT_RT_STEP_SOURCES("不支持实时计步的设备"),
    NOT_SUPPORT_AUTO_CONNECT_SOURCES("不支持自动重连的设备"),
    SUPPORT_ANALYZE_SWIMMING_DATA_SOURCE("支持游泳日志上传分析"),
    XI_HU_SOURCE_S("西湖系列设备"),
    EVEREST_SOURCE_S("珠峰系列设备"),
    HEART_RATE_REGION_S("米动App，心率区间入口仅对当前连接的是“黄河”、“珠峰”、“乔格里”、“西湖”设备展示"),
    CLASSIC_BT_GPS_SOURCE_S("支持GPS的经典蓝牙设备类型"),
    CLASSIC_BT_SOURCE_S("经典蓝牙设备类型"),
    NFC_BUS("NFC支持公交"),
    NFC_DOOR("NFC支持门禁"),
    NFC_TAG("NFC支持标签"),
    NFC_CAR_XP("NFC支持小鹏车钥匙"),
    SUPPORT_ATRIAL_FIB("支持房颤"),
    EVEREST_2_SERIES("珠峰2系列设备"),
    SUPPORT_NATIVE_DIAL("是否使用原生表盘页面"),
    SUPPORT_EVENT_REMIND_NEW_NAME("\"事件提醒\"文案改为\"日程\""),
    DISABLE_SCHEDULE("禁用日程/事件提醒"),
    CHOPIN_SOURCE_S("肖邦系列设备"),
    NPS_QUESTION("支持NPS调查问卷"),
    SUPPORT_DEVICE_LANGUAGE("支持设备语言"),
    SUPPORT_SIX_OFF_WIST_PWD("支持离腕锁定6位密码"),
    SUPPORT_HEALTH_DETECT("使用新的健康监测页面"),
    SUPPORT_WATCH_EDIT_S("支持删除,替换表盘的设备"),
    HIDE_WATCH_SKIN_DOWNLOAD_TIME("隐藏表盘下载次数"),
    COMPRESS_DIAL("自定义背景表盘使用的是压缩表盘"),
    UIH_COMPRESS_DIAL("自定义背景表盘使用的是带UIH头的压缩表盘"),
    SUPPORT_CHANGE_ALARM_ON_DEVICE("支持在设备端增删改闹钟，需要两端同步"),
    SUPPORT_CHANGE_REMINDER_ON_DEVICE("支持在设备端增删改事件提醒，需要两端同步"),
    ROUND_WATCH_S("圆形手表"),
    SQUARE_WATCH_S("方形手表"),
    GES_SCREEN_ANIM("在抬腕亮屏页面展示动画的设备类型"),
    OFF_WIST_ZERO_TO_NINE("离腕锁定使用0~9位密码"),
    SUPPORT_SCHEDULE("支持日程的设备类型"),
    SUPPORT_UVI("支持展示紫外线的设备类型"),
    GT2_SOURCE("GT2系列设备（Onyx、Corsica、Lisbon以及Osprey等）"),
    GT3_SOURCE("GT3系列设备（Madrid、Zurich等）"),
    GT4_SOURCE("GT4系列设备"),
    SMART_ASSISTANT("智能助理模块"),
    SUPPORT_NEW_DEVICE_SETTING("是否支持新的设备页（新增展示实时表盘功能）"),
    SUPPORT_RR_PEAK("支持RRPEAK"),
    SUPPORT_ECG("支持ECG"),
    SUPPORT_WATCH_FACE_STORE("支持新版表盘商城"),
    SUPPORT_TAKE_PIC("支持手环控制拍照"),
    SUPPORT_UNBIND_ACTION("支持解绑操作"),
    SUPPORT_STAND_ALERT("是否支持站立提醒"),
    SUPPORT_FAKE_STAND_ALERT("假的站立提醒，原\"久坐提醒\"改名"),
    SUPPORT_APP_SORT_NEW("是否新的应用管理"),
    SUPPORT_INCOMING_CALL_REPLY("是否支持来电短信回复"),
    SUPPORT_TODO("是否支持代办事项"),
    FEMALE_HEALTH("支持女性健康功能"),
    NEED_INJECT_TOKEN("是否需要注入token"),
    SUPPORT_PM("支持设置PM2.5，PM10"),
    IS_MEDICAL_DEVICE("是否为医疗版本设备"),
    IS_MEDICAL_COLLECT_DEVICE("是否为医疗采集版本设备"),
    SUPPORT_HEALTH_DETECT_TITLE("心率设置显示为健康监测"),
    SUPPORT_OFFLINE_VOICE("是否支持离线语音命令词"),
    HEADSET_MOZART_SOURCE_S("mozart 系列"),
    SUPPORT_BIND_INTRO("支持绑定完成展示介绍页"),
    SUPPORT_FOLLOW_PHONE_LANGUAGE("支持仅绑定跟随手机语言"),
    AMAZFIT_X_SOURCE_S("Amazfit X系列设备，如Venice,London"),
    IS_VIRTUAL_DEVICE("是否为虚拟绑定设备"),
    UPLOAD_DEVICE_SETTINGS("是否上传设备设置信息（设备设置统计分析）"),
    BTSTATUS_RETRY_UI("BtStatusFragment 状态失败,clickListener invoke 支持展示连接中状态"),
    IS_SUPPORT_SINGLE_EAR_UPGRADE("是否支持单耳升级"),
    ALEXA_PAIR_DEVICE("需要升级Alexa配对协议的设备"),
    BOUND_REFUSE_RETRY("是否支持配对拒绝后，retry 机制"),
    CLASSIC_BLUETOOTH_CYCLE_SCAN("是否支持经典蓝牙循环扫描绑定"),
    SELECT_RESTORE_SOURCE("在绑定后可以选择是否恢复设置的设备类型"),
    SUPPORT_READ_FEATURE_FROM_DEVICE("支持从设备端读取功能列表"),
    SUPPORT_READ_APP_SORT_FROM_DEVICE("支持从设备端读取应用列表"),
    APP_SORT_NEW_ICON("应用列表页面使用新的图标"),
    SUPPORT_FIND_BAND_VIBRATE_TYPE("支持查找手环振动模式设置"),
    MI_BAND_SERIES("小米系列手环设备"),
    BOLT_SERIES("Bolt系列设备"),
    SUPPORT_SPORT_SETTING("支持运动设置的设备类型"),
    SUPPORT_SIX_PASSWORD("支持六位锁屏密码的设备（用于没有支持六位密码的DeviceFeature但实际上支持的设备，例如GT3）"),
    SUPPORT_JS_APP("支持JS小程序"),
    ZEPP_OS_DEVICE("zeppOS"),
    SUPPORT_VOICE("可以播放声音的设备"),
    NFC_MASTER("NFC支持万事达银行卡"),
    SUPPORT_WEB_INTRO("支持H5介绍页的设备"),
    SUPPORT_FINE_GRAININESS("支持亮屏时间西粒度调节"),
    SUPPORT_LANGUAGE_CHANGE_BY_APP_DEVICE("支持设备语言修改，既可以通过APP ，也可以通过设备端。"),
    SUPPORT_SCHEDULE_VIBRATE_MODE("支持日程振动模式的设备"),
    SUPPORT_SETTINGS_UPLOAD("支持设置项上传云端功能"),
    JS_DIAL("js表盘"),
    SUPPORT_GPS("支持GPS"),
    OVERSEA("是否是海外的设备");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String desc;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/Feature$Companion;", "", "", "type", "Lcom/xiaomi/hm/health/device/deviceconfig/Feature;", "fromValue", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Feature fromValue(int type) {
            Feature[] featureArrValues = Feature.values();
            int length = featureArrValues.length;
            int i = 0;
            while (i < length) {
                Feature feature = featureArrValues[i];
                i++;
                if (type == feature.ordinal()) {
                    return feature;
                }
            }
            return null;
        }
    }

    Feature(String str) {
        this.desc = str;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }
}
