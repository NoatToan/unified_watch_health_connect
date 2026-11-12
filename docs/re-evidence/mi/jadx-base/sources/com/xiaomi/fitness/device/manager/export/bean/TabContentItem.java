package com.xiaomi.fitness.device.manager.export.bean;

import android.content.Context;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.TodoRemindEditFragment;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b.\b\u0016\u0018\u0000 B2\u00020\u0001:\u0001BBÙ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u001b\b\u0002\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010¢\u0006\u0002\b\u0012\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010\u0012\u001b\b\u0002\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010¢\u0006\u0002\b\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010&\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010.\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u0010\u00104\u001a\u00020\u00152\b\u00105\u001a\u0004\u0018\u00010\bJ\u001a\u00106\u001a\u00020\u00152\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0010J\u0010\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u0014H\u0016J\u0010\u0010:\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010\u0011J\u0010\u0010<\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010\u0011J\u0012\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\bH\u0002J\u0010\u0010>\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\u000bH\u0016J\b\u0010@\u001a\u00020\bH\u0002J\b\u0010A\u001a\u00020\bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001c\"\u0004\b\u001f\u0010 R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$R!\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010¢\u0006\u0002\b\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010¢\u0006\u0002\b\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "", "itemType", "", "type", "icon", "title", "Landroidx/lifecycle/MutableLiveData;", "", Column.SUBTITLE, "more", "", "remind", "Landroidx/databinding/ObservableBoolean;", "remindText", "needConnect", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lkotlin/ExtensionFunctionType;", "onClickListener", "Landroid/content/Context;", "", "itemVisible", "extras", "rightTextWithDot", "<init>", "(IIILandroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;ZLandroidx/databinding/ObservableBoolean;Landroidx/lifecycle/MutableLiveData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/lifecycle/MutableLiveData;)V", "getItemType", "()I", "getType", "getIcon", "setIcon", "(I)V", "getTitle", "()Landroidx/lifecycle/MutableLiveData;", "setTitle", "(Landroidx/lifecycle/MutableLiveData;)V", "getSubtitle", "setSubtitle", "getMore", "()Z", "getRemind", "()Landroidx/databinding/ObservableBoolean;", "setRemind", "(Landroidx/databinding/ObservableBoolean;)V", "getRemindText", "setRemindText", "getExtras", "()Ljava/lang/String;", "setExtras", "(Ljava/lang/String;)V", "getRightTextWithDot", "setRightTextWithDot", "rightText", "setOnClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "handleItemClicked", "context", "getItemVisible", "deviceModel", "getNeedConnect", "toLiveData", "reportData", "isClickItem", "getClickReportName", "getSwitchReportName", "Companion", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class TabContentItem {
    public static final int ITEM_TYPE_AD_BANNER = 18;
    public static final int ITEM_TYPE_DEVICE_HINT = 14;
    public static final int ITEM_TYPE_DEVICE_TITLE = 15;
    public static final int ITEM_TYPE_DIAL = 10;
    public static final int ITEM_TYPE_FACE_ENTRANCE = 17;
    public static final int ITEM_TYPE_NORMAL = 11;
    public static final int ITEM_TYPE_NORMAL_SWITCH = 13;
    public static final int ITEM_TYPE_REMIND_SETTING_BANNER = 16;
    public static final int ITEM_TYPE_TITLE = 12;
    public static final int ITEM_TYPE_UNBIND = 8;
    public static final int ITEM_TYPE_VIEW_ALL_DEVICES = 9;
    public static final int TEMP_ALARM_NOTIFY = 163;
    public static final int TYPE_ABOUT_DEVICE = 145;
    public static final int TYPE_ACCESSORY_DEVICE = 203;
    public static final int TYPE_ACCESSORY_DEVICE_LIST = 202;
    public static final int TYPE_ALARM = 120;
    public static final int TYPE_ALEXA = 147;
    public static final int TYPE_ALGO_CAPTURE = 170;
    public static final int TYPE_ALL_SKILL = 151;
    public static final int TYPE_AOD = 177;
    public static final int TYPE_APPLICATION_SETTINGS = 106;
    public static final int TYPE_APP_LAYOUT = 129;
    public static final int TYPE_APP_SHOP = 154;
    public static final int TYPE_APP_SORT = 128;
    public static final int TYPE_AUDIO_RECORD = 216;
    public static final int TYPE_BAND_LANGUAGE = 137;
    public static final int TYPE_BIND_DEVICE_TITLE = 100;
    public static final int TYPE_BLOOD_PRESSURE_MEASURE_REMIND = 182;
    public static final int TYPE_BLUETOOTH_BROADCAST = 135;
    public static final int TYPE_CALL_NOTIFY = 111;
    public static final int TYPE_CAMERA_SETTING = 125;
    public static final int TYPE_CARD_PAYMENT = 103;
    public static final int TYPE_CHECK_UPDATE = 144;
    public static final int TYPE_CONNECT_NEW_PHONE = 211;
    public static final int TYPE_DEVICE_BANNER_REMIND_SETTING = 200;
    public static final int TYPE_DEVICE_MUSIC_MANAGER = 201;
    public static final int TYPE_DEVICE_STATUS = 101;
    public static final int TYPE_DEVICE_STATUS_HINT = 99;
    public static final int TYPE_DIAL_MARKET = 102;
    public static final int TYPE_ECG = 162;
    public static final int TYPE_ECG_MEASURE_REMIND = 181;
    public static final int TYPE_EMERGENCY_CONTACT = 157;
    public static final int TYPE_ESIM = 149;
    public static final int TYPE_EVENT_REMIND = 121;
    public static final int TYPE_FIND_DEVICE = 134;
    public static final int TYPE_GOAL_MANAGER_SETTING = 171;
    public static final int TYPE_GOAL_REMIND = 118;
    public static final int TYPE_GOOGLE_ACCOUNT = 206;
    public static final int TYPE_GOOGLE_ASSISTANT = 208;
    public static final int TYPE_GOOGLE_PRIVACY_SETTINGS = 207;
    public static final int TYPE_HANDLE_TYPE = 133;
    public static final int TYPE_HEALTH_MONITOR = 104;
    public static final int TYPE_HEART_HEALTH_MONITOR = 146;
    public static final int TYPE_HEART_RATE_BROADCAST = 136;
    public static final int TYPE_HEART_RATE_SETTING = 113;
    public static final int TYPE_HOTSPOT = 169;
    public static final int TYPE_HOT_KEY = 153;
    public static final int TYPE_KEEP_ALIVE = 112;
    public static final int TYPE_LIMIT_BIND = 141;
    public static final int TYPE_LOCK_OFF_WRIST = 138;
    public static final int TYPE_LPA_MANAGEMENT = 210;
    public static final int TYPE_MANAGE_WEARABLE_LOG = 176;
    public static final int TYPE_MSG_NOTIFICATION = 110;
    public static final int TYPE_NIGHT_MODE = 132;
    public static final int TYPE_NOTIFICATION_SETTING = 105;
    public static final int TYPE_OFFLINE_MAP = 212;
    public static final int TYPE_OLD_DIAL_MARKET = 180;
    public static final int TYPE_OTA_MANUAL = 159;
    public static final int TYPE_OTHER_DEVICE_TITLE = 108;
    public static final int TYPE_OTHER_SETTINGS = 107;
    public static final int TYPE_PRESSURE_SETTING = 116;
    public static final int TYPE_SCAN_LOGIN = 148;
    public static final int TYPE_SEDENTARY_REMIND = 117;
    public static final int TYPE_SELF_CHECK = 158;
    public static final int TYPE_SHORTCUT_SORT = 127;
    public static final int TYPE_SLEEP_MODE = 156;
    public static final int TYPE_SLEEP_SETTING = 114;
    public static final int TYPE_SPO2_SETTING = 115;
    public static final int TYPE_SPORT_ITEM = 126;
    public static final int TYPE_SPORT_T_SHIRT = 109;
    public static final int TYPE_STAND_REMINDERS = 165;
    public static final int TYPE_STOCK = 123;
    public static final int TYPE_SWITCH_WEAR_MODE = 174;
    public static final int TYPE_SYNC_MIUI_TODO = 204;
    public static final int TYPE_SYNC_PHONE_SCHEDULE = 161;
    public static final int TYPE_TEMPERATURE_SETTING = 217;
    public static final int TYPE_TODO_REMIND = 205;
    public static final int TYPE_TOP_CONTACTS = 164;
    public static final int TYPE_UNLOCK_LAPTOP = 140;
    public static final int TYPE_UNLOCK_PHONE = 139;
    public static final int TYPE_USE_GUIDE = 152;
    public static final int TYPE_VIBRATE_MODE = 131;
    public static final int TYPE_VIEW_ALL_DEVICES = 168;
    public static final int TYPE_VITALITY_REMIND = 173;
    public static final int TYPE_VOICE_OPTIMISE = 143;
    public static final int TYPE_WAKE_UP_GUIDE = 150;
    public static final int TYPE_WATCH_TRACK_MANAGER = 179;
    public static final int TYPE_WEAROS_BUGREPORT = 175;
    public static final int TYPE_WEAROS_PHONE_SWITCH = 215;
    public static final int TYPE_WEAROS_RESTORE = 214;
    public static final int TYPE_WEAROS_SCREENSHOT = 178;
    public static final int TYPE_WEAROS_WALLET = 218;
    public static final int TYPE_WEAR_FACTORY = 160;
    public static final int TYPE_WEATHER = 122;
    public static final int TYPE_WIDGET_MANAGER = 155;
    public static final int TYPE_WORLD_CLOCK = 124;
    public static final int TYPE_WRIST_SCREEN_WAKE = 130;
    public static final int TYPE_XIAOAI_COURSE_SCHEDULE = 172;
    public static final int TYPE_XIAOAI_SKILL_CENTER = 142;
    public static final int TYPE_YOYO_CARD = 213;
    public static final int TYPE_ZEN_MODE = 166;

    @Nullable
    private String extras;
    private int icon;
    private final int itemType;

    @Nullable
    private Function1<? super WearableDeviceModel, Boolean> itemVisible;
    private final boolean more;

    @Nullable
    private Function1<? super WearableDeviceModel, Boolean> needConnect;

    @Nullable
    private Function1<? super Context, Unit> onClickListener;

    @Nullable
    private ObservableBoolean remind;

    @Nullable
    private MutableLiveData<String> remindText;

    @Nullable
    private MutableLiveData<String> rightTextWithDot;

    @Nullable
    private MutableLiveData<String> subtitle;

    @NotNull
    private MutableLiveData<String> title;
    private final int type;

    public TabContentItem(int i, int i2, int i3, @NotNull MutableLiveData<String> title, @Nullable MutableLiveData<String> mutableLiveData, boolean z, @Nullable ObservableBoolean observableBoolean, @Nullable MutableLiveData<String> mutableLiveData2, @Nullable Function1<? super WearableDeviceModel, Boolean> function1, @Nullable Function1<? super Context, Unit> function2, @Nullable Function1<? super WearableDeviceModel, Boolean> function3, @Nullable String str, @Nullable MutableLiveData<String> mutableLiveData3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.itemType = i;
        this.type = i2;
        this.icon = i3;
        this.title = title;
        this.subtitle = mutableLiveData;
        this.more = z;
        this.remind = observableBoolean;
        this.remindText = mutableLiveData2;
        this.needConnect = function1;
        this.onClickListener = function2;
        this.itemVisible = function3;
        this.extras = str;
        this.rightTextWithDot = mutableLiveData3;
    }

    private final String getClickReportName() {
        int i = this.type;
        if (i != 102) {
            if (i == 103) {
                return "card_payment";
            }
            if (i == 144) {
                return "check_update";
            }
            if (i == 145) {
                return "about_device";
            }
            if (i == 177) {
                return "always_on_display";
            }
            if (i == 178) {
                return "watch_screenshot";
            }
            switch (i) {
                case 110:
                    return "msg_notification";
                case 111:
                    return "call_notify";
                case 112:
                    return "keep_alive";
                case 113:
                    return "heart_rate_setting";
                case 114:
                    return "sleep_setting";
                case 115:
                    return "spo2_setting";
                case 116:
                    return "pressure_setting";
                case 117:
                    return "sedentary_remind";
                case 118:
                    return Feature.GOAL_REMIND;
                default:
                    switch (i) {
                        case 120:
                            return DialWidgetType.ALARM;
                        case 121:
                            return Feature.EVENT_REMIND;
                        case 122:
                            return "weather";
                        case 123:
                            return "stock";
                        case 124:
                            return Feature.WORLD_CLOCK;
                        case 125:
                            return "camera_setting";
                        case 126:
                            return "sport_item";
                        case 127:
                            return "shortcut_sort";
                        case 128:
                            return "app_sort";
                        case 129:
                            return Feature.APP_LAYOUT;
                        case 130:
                            return "wrist_screen_wake";
                        case 131:
                            return "vibrate_mode";
                        case 132:
                            return Feature.NIGHT_MODE;
                        case 147:
                            return "alexa";
                        case 149:
                            return "lpa_management";
                        case 152:
                            return "user_guide";
                        case 162:
                            return "ecg";
                        case 169:
                            return "hotspot";
                        case 180:
                            break;
                        case 201:
                            return "device_music";
                        case 212:
                            return "offline_map";
                        case 217:
                            return "temperature_setting";
                        default:
                            switch (i) {
                                case 134:
                                    return "find_device";
                                case 135:
                                    return Feature.BLUETOOTH_BROADCAST;
                                case 136:
                                    return "heart_rate_broadcast";
                                case 137:
                                    return "band_language";
                                case 138:
                                    return "device_password";
                                case 139:
                                    return Feature.UNLOCK_PHONE;
                                case 140:
                                    return "unlock_pc";
                                case 141:
                                    return "limit_binding";
                                case 142:
                                    return "xiaoai_center";
                                default:
                                    switch (i) {
                                        case 154:
                                            return "app_shop";
                                        case 155:
                                            return "widget_manager";
                                        case 156:
                                            return "sleep_mode";
                                        case 157:
                                            return Feature.EMERGENCY_CONTACT;
                                        default:
                                            switch (i) {
                                                case 164:
                                                    return "top_contacts";
                                                case 165:
                                                    return "stand_reminders";
                                                case 166:
                                                    return "zen_mode";
                                                default:
                                                    switch (i) {
                                                        case 171:
                                                            return "goal_manager_setting";
                                                        case 172:
                                                            return "xiaoai_curriculum";
                                                        case 173:
                                                            return "vitality_remind";
                                                        case 174:
                                                            return "switch_wear_mode";
                                                        default:
                                                            switch (i) {
                                                                case 205:
                                                                    return TodoRemindEditFragment.KEY_REMIND_PARAM;
                                                                case 206:
                                                                    return "google_account";
                                                                case 207:
                                                                    return "google_privacy";
                                                                case 208:
                                                                    return "google_assistant";
                                                                default:
                                                                    return "";
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                    break;
            }
        }
        return "dial_market";
    }

    private final String getSwitchReportName() {
        int i = this.type;
        if (i != 161) {
            return i != 204 ? "" : "sync_miui_todo";
        }
        return "phone_schedule";
    }

    private final MutableLiveData<String> toLiveData(String str) {
        return new MutableLiveData<>(str);
    }

    @Nullable
    public final String getExtras() {
        return this.extras;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getItemType() {
        return this.itemType;
    }

    public final boolean getItemVisible(@Nullable WearableDeviceModel deviceModel) {
        Function1<? super WearableDeviceModel, Boolean> function1;
        boolean zBooleanValue = true;
        if (deviceModel != null && (function1 = this.itemVisible) != null) {
            zBooleanValue = function1.invoke(deviceModel).booleanValue();
        }
        Logger.i("getItemVisible " + this.type + " " + zBooleanValue, new Object[0]);
        return zBooleanValue;
    }

    public final boolean getMore() {
        return this.more;
    }

    public final boolean getNeedConnect(@Nullable WearableDeviceModel deviceModel) {
        Function1<? super WearableDeviceModel, Boolean> function1;
        if (deviceModel == null || (function1 = this.needConnect) == null) {
            return true;
        }
        return function1.invoke(deviceModel).booleanValue();
    }

    @Nullable
    public final ObservableBoolean getRemind() {
        return this.remind;
    }

    @Nullable
    public final MutableLiveData<String> getRemindText() {
        return this.remindText;
    }

    @Nullable
    public final MutableLiveData<String> getRightTextWithDot() {
        return this.rightTextWithDot;
    }

    @Nullable
    public final MutableLiveData<String> getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public void handleItemClicked(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Function1<? super Context, Unit> function1 = this.onClickListener;
        if (function1 != null) {
            if (function1 != null) {
                function1.invoke(context);
            }
            reportData(true);
        } else {
            Logger.i("handleItemClicked " + this.type + " error:clickListener is null", new Object[0]);
        }
    }

    public void reportData(boolean isClickItem) {
        String model;
        String clickReportName = isClickItem ? getClickReportName() : getSwitchReportName();
        if (clickReportName.length() > 0) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
                model = "";
            }
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.51.0.1.29510"), "name", clickReportName, "timestamp", String.valueOf(System.currentTimeMillis()), "model", model);
        }
    }

    public final void setExtras(@Nullable String str) {
        this.extras = str;
    }

    public final void setIcon(int i) {
        this.icon = i;
    }

    public final void setOnClickListener(@NotNull Function1<? super Context, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onClickListener = listener;
    }

    public final void setRemind(@Nullable ObservableBoolean observableBoolean) {
        this.remind = observableBoolean;
    }

    public final void setRemindText(@Nullable MutableLiveData<String> mutableLiveData) {
        this.remindText = mutableLiveData;
    }

    public final void setRightTextWithDot(@Nullable MutableLiveData<String> mutableLiveData) {
        this.rightTextWithDot = mutableLiveData;
    }

    public final void setSubtitle(@Nullable MutableLiveData<String> mutableLiveData) {
        this.subtitle = mutableLiveData;
    }

    public final void setTitle(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.title = mutableLiveData;
    }

    public final void setRemindText(@Nullable String remindText) {
        if (remindText != null && remindText.length() != 0 && this.remindText == null) {
            this.remindText = new MutableLiveData<>();
        }
        MutableLiveData<String> mutableLiveData = this.remindText;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(remindText);
        }
    }

    public final void setRightTextWithDot(@Nullable String rightText) {
        if (rightText != null && rightText.length() != 0 && this.rightTextWithDot == null) {
            this.rightTextWithDot = new MutableLiveData<>();
        }
        MutableLiveData<String> mutableLiveData = this.rightTextWithDot;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(rightText);
        }
    }

    public final void setSubtitle(@Nullable String subtitle) {
        if (this.subtitle == null && subtitle != null && subtitle.length() != 0) {
            this.subtitle = new MutableLiveData<>();
        }
        MutableLiveData<String> mutableLiveData = this.subtitle;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(subtitle);
        }
    }

    public /* synthetic */ TabContentItem(int i, int i2, int i3, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, boolean z, ObservableBoolean observableBoolean, MutableLiveData mutableLiveData3, Function1 function1, Function1 function2, Function1 function3, String str, MutableLiveData mutableLiveData4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? -1 : i3, mutableLiveData, (i4 & 16) != 0 ? null : mutableLiveData2, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? null : observableBoolean, (i4 & 128) != 0 ? null : mutableLiveData3, (i4 & 256) != 0 ? null : function1, (i4 & 512) != 0 ? null : function2, (i4 & 1024) != 0 ? null : function3, (i4 & 2048) != 0 ? null : str, (i4 & 4096) != 0 ? null : mutableLiveData4);
    }
}
