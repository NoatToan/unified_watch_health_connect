package com.miui.circulate.device.api;

import android.net.Uri;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.wearable.hm.ChangeListenerImpl;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\bÆ\u0002\u0018\u00002\u00020\u0001:\u00076789:;<B\t\b\u0002¢\u0006\u0004\b5\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010#\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u0017\u0010%\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u0017\u0010'\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010 R \u0010)\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u001e\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010 R\u0017\u0010-\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010 R\u0017\u0010/\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010 R\u0017\u00101\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b1\u0010\u001e\u001a\u0004\b2\u0010 R\u0017\u00103\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b3\u0010\u001e\u001a\u0004\b4\u0010 ¨\u0006="}, d2 = {"Lcom/miui/circulate/device/api/Constant;", "", "", "TAG", "Ljava/lang/String;", "AUTHORITY", "EXPORT_PATH", "DEVICE_META_PATH", "PIN_PATH", "CATEGORY_PATH", "METHOD_PATH", "KV_PATH", "METHOD_START_SEARCH", "METHOD_STOP_SEARCH", "PARAM_FROM", "PARAM_SEARCH", "", "MAX_EXPORT_DEVICE_COUNT", "I", "MAX_MIJIA_DEVICE_COUNT", "MAX_STR_LENGTH", "", "CACHE_EXPIRED_DURATION", "J", "MAX_WORK_THREAD_LIVE_TIME", "MAX_DISCOVERY_WAIT_DURATION", "DATABASE_AUTO_CLOSE_DURATION", "AUDIO_GROUP_ID", "Landroid/net/Uri;", "METHOD_CALL", "Landroid/net/Uri;", "getMETHOD_CALL", "()Landroid/net/Uri;", "EXPORT_LIST_URI", "getEXPORT_LIST_URI", "DEVICE_META_LIST_URI", "getDEVICE_META_LIST_URI", "PIN_URI", "getPIN_URI", "MIJIA_SHOW_URI", "getMIJIA_SHOW_URI", "MIJIA_ALL_URI", "getMIJIA_ALL_URI", "getMIJIA_ALL_URI$annotations", "()V", "HEALTH_DEVICE_LIST_URI", "getHEALTH_DEVICE_LIST_URI", "KEY_VALUE_URI", "getKEY_VALUE_URI", "CATEGORY_DEVICE_LIST_URI", "getCATEGORY_DEVICE_LIST_URI", "NEARBY_DEVICE_LIST_URI", "getNEARBY_DEVICE_LIST_URI", "<init>", "DeviceCategory", "DeviceType", "KeyValue", "MethodCallResult", "QueryParameter", "State", "UpdateType", "api_release"}, k = 1, mv = {1, 6, 0})
public final class Constant {

    @NotNull
    public static final String AUDIO_GROUP_ID = "audio_group";

    @NotNull
    public static final String AUTHORITY = "com.milink.service.device";
    public static final long CACHE_EXPIRED_DURATION = 86400000;

    @NotNull
    private static final Uri CATEGORY_DEVICE_LIST_URI;

    @NotNull
    public static final String CATEGORY_PATH = "category";
    public static final long DATABASE_AUTO_CLOSE_DURATION = 15;

    @NotNull
    private static final Uri DEVICE_META_LIST_URI;

    @NotNull
    public static final String DEVICE_META_PATH = "device";

    @NotNull
    private static final Uri EXPORT_LIST_URI;

    @NotNull
    public static final String EXPORT_PATH = "export";

    @NotNull
    private static final Uri HEALTH_DEVICE_LIST_URI;

    @NotNull
    public static final Constant INSTANCE = new Constant();

    @NotNull
    private static final Uri KEY_VALUE_URI;

    @NotNull
    public static final String KV_PATH = "kv";
    public static final long MAX_DISCOVERY_WAIT_DURATION = 15000;
    public static final int MAX_EXPORT_DEVICE_COUNT = 7;
    public static final int MAX_MIJIA_DEVICE_COUNT = 12;
    public static final int MAX_STR_LENGTH = 5000;
    public static final long MAX_WORK_THREAD_LIVE_TIME = 300000;

    @NotNull
    private static final Uri METHOD_CALL;

    @NotNull
    public static final String METHOD_PATH = "method";

    @NotNull
    public static final String METHOD_START_SEARCH = "start_search";

    @NotNull
    public static final String METHOD_STOP_SEARCH = "stop_search";

    @NotNull
    private static final Uri MIJIA_ALL_URI;

    @NotNull
    private static final Uri MIJIA_SHOW_URI;

    @NotNull
    private static final Uri NEARBY_DEVICE_LIST_URI;

    @NotNull
    public static final String PARAM_FROM = "from";

    @NotNull
    public static final String PARAM_SEARCH = "search";

    @NotNull
    public static final String PIN_PATH = "pin";

    @NotNull
    private static final Uri PIN_URI;

    @NotNull
    public static final String TAG = "MDC";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/miui/circulate/device/api/Constant$DeviceCategory;", "", "()V", ChangeListenerImpl.SETTING_GROUP_TYPE_HEALTH, "", "MIJIA", "NEARBY", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DeviceCategory {

        @NotNull
        public static final String HEALTH = "health";

        @NotNull
        public static final DeviceCategory INSTANCE = new DeviceCategory();

        @NotNull
        public static final String MIJIA = "mijia";

        @NotNull
        public static final String NEARBY = "nearby";

        private DeviceCategory() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b!\u0010\u0002R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/miui/circulate/device/api/Constant$DeviceType;", "", "()V", "ANDROID_PAD", "", "ANDROID_PHONE", "ANDROID_TV", "AUDIO_GROUP", "AUDIO_STEREO", "BAND", "BLUETOOTH", "BLUETOOTH_CAR", "CAMERA", "CAR", "Car", "getCar$annotations", "GLASSES", "HEADSET", "HYPERMIND", "MIJIA_IOT", "MIJIA_IOT_CONTROL", "SCREEN_SOUND", "SOUND", "THIRD_ANDROID_TV", "THIRD_CAR_KIT", "THIRD_HEADSET", "THIRD_HEARING_AID", "THIRD_OTHER", "THIRD_SPEAKER", "THIRD_WATCH", DeviceTypes.UNKNOWN, "WATCH", "WEARABLE", "getWEARABLE$annotations", "WINDOWS_PC", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DeviceType {

        @NotNull
        public static final String ANDROID_PAD = "AndroidPad";

        @NotNull
        public static final String ANDROID_PHONE = "AndroidPhone";

        @NotNull
        public static final String ANDROID_TV = "TV";

        @NotNull
        public static final String AUDIO_GROUP = "audio_group";

        @NotNull
        public static final String AUDIO_STEREO = "audio_stereo";

        @NotNull
        public static final String BAND = "band";

        @NotNull
        public static final String BLUETOOTH = "bluetooth";

        @NotNull
        public static final String BLUETOOTH_CAR = "bluetooth_car";

        @NotNull
        public static final String CAMERA = "Camera";

        @NotNull
        public static final String CAR = "Car";

        @NotNull
        public static final String Car = "Car";

        @NotNull
        public static final String GLASSES = "glasses";

        @NotNull
        public static final String HEADSET = "headset";

        @NotNull
        public static final String HYPERMIND = "HyperMind";

        @NotNull
        public static final DeviceType INSTANCE = new DeviceType();

        @NotNull
        public static final String MIJIA_IOT = "mijia_iot";

        @NotNull
        public static final String MIJIA_IOT_CONTROL = "mijia_iot_control";

        @NotNull
        public static final String SCREEN_SOUND = "ScreenSound";

        @NotNull
        public static final String SOUND = "Sound";

        @NotNull
        public static final String THIRD_ANDROID_TV = "third_TV";

        @NotNull
        public static final String THIRD_CAR_KIT = "third_car_kit";

        @NotNull
        public static final String THIRD_HEADSET = "third_headset";

        @NotNull
        public static final String THIRD_HEARING_AID = "third_hearing_aid";

        @NotNull
        public static final String THIRD_OTHER = "third_other";

        @NotNull
        public static final String THIRD_SPEAKER = "third_speaker";

        @NotNull
        public static final String THIRD_WATCH = "third_watch";

        @NotNull
        public static final String UNKNOWN = "unknown";

        @NotNull
        public static final String WATCH = "watch";

        @NotNull
        public static final String WEARABLE = "wearable";

        @NotNull
        public static final String WINDOWS_PC = "Windows";

        private DeviceType() {
        }

        @Deprecated(message = "NO NOT USE", replaceWith = @ReplaceWith(expression = "use CAR", imports = {}))
        public static /* synthetic */ void getCar$annotations() {
        }

        @Deprecated(message = "DO NOT USE", replaceWith = @ReplaceWith(expression = "use WATCH, BAND", imports = {}))
        public static /* synthetic */ void getWEARABLE$annotations() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/miui/circulate/device/api/Constant$KeyValue;", "", "()V", "KEY_COLUMN", "", "VALUE_COLUMN", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class KeyValue {

        @NotNull
        public static final KeyValue INSTANCE = new KeyValue();

        @NotNull
        public static final String KEY_COLUMN = "k";

        @NotNull
        public static final String VALUE_COLUMN = "v";

        private KeyValue() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/miui/circulate/device/api/Constant$MethodCallResult;", "", "()V", "NO_PERMISSION", "", "OK", "RESULT_KEY", "", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class MethodCallResult {

        @NotNull
        public static final MethodCallResult INSTANCE = new MethodCallResult();
        public static final int NO_PERMISSION = -1;
        public static final int OK = 1;

        @NotNull
        public static final String RESULT_KEY = "result";

        private MethodCallResult() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/miui/circulate/device/api/Constant$QueryParameter;", "", "()V", "EXPORT", "", "FORCE_UPDATE", "IGNORE_EVALUATE", "LIMIT", "MAX_COUNT", "QUERY_ID", "SEARCH_URI_LIST", "UPDATE_TYPE", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class QueryParameter {

        @NotNull
        public static final String EXPORT = "export";

        @NotNull
        public static final String FORCE_UPDATE = "force_update";

        @NotNull
        public static final String IGNORE_EVALUATE = "ignore_evaluate";

        @NotNull
        public static final QueryParameter INSTANCE = new QueryParameter();

        @NotNull
        public static final String LIMIT = "limit";

        @NotNull
        public static final String MAX_COUNT = "max_count";

        @NotNull
        public static final String QUERY_ID = "query_id";

        @NotNull
        public static final String SEARCH_URI_LIST = "search_uri_list";

        @NotNull
        public static final String UPDATE_TYPE = "update_type";

        private QueryParameter() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J\u0012\u0010\u0018\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\n\u0010\u001a\u001a\u00020\f*\u00020\u0004J\u0012\u0010\u001b\u001a\u00020\u0015*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\u0012\u0010\u001c\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\u001a\u0010\u001d\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/miui/circulate/device/api/Constant$State;", "", "()V", "STATE_APP_CONTINUITY", "", "STATE_AUDIO_CAST", "STATE_CALL_SYNERGY", "STATE_CAMERA_SYNERGY", "STATE_CELLULAR_SYNERGY", "STATE_HID_SYNERGY", "STATE_HYPERMIND_HABIT", "STATE_MASK_KEY", "", "STATE_MIRROR", "STATE_MUSIC_PLAYING", "STATE_ONLINE", "STATE_OPEN", "STATE_SCREEN_SYNERGY", "STATE_TAKE_PHOTO", "STATE_VIDEO_CAST", "synergyStateChange", "", e.f13808a, "r", "add", "stateMask", "binary", "check", "remove", "update", "inState", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class State {

        @NotNull
        public static final State INSTANCE = new State();
        public static final int STATE_APP_CONTINUITY = 512;
        public static final int STATE_AUDIO_CAST = 128;
        public static final int STATE_CALL_SYNERGY = 16;
        public static final int STATE_CAMERA_SYNERGY = 4;
        public static final int STATE_CELLULAR_SYNERGY = 4096;
        public static final int STATE_HID_SYNERGY = 32;
        public static final int STATE_HYPERMIND_HABIT = 8192;

        @NotNull
        public static final String STATE_MASK_KEY = "state_mask";
        public static final int STATE_MIRROR = 8;
        public static final int STATE_MUSIC_PLAYING = 256;
        public static final int STATE_ONLINE = 1;
        public static final int STATE_OPEN = 64;
        public static final int STATE_SCREEN_SYNERGY = 2;
        public static final int STATE_TAKE_PHOTO = 1024;
        public static final int STATE_VIDEO_CAST = 2048;

        private State() {
        }

        public final int add(int i, int i2) {
            return i | i2;
        }

        @NotNull
        public final String binary(int i) {
            String binaryString = Integer.toBinaryString(i);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(this)");
            return binaryString;
        }

        public final boolean check(int i, int i2) {
            return (i & i2) == i2;
        }

        public final int remove(int i, int i2) {
            return i & (~i2);
        }

        @Deprecated(message = "DO NOT USE", replaceWith = @ReplaceWith(expression = "l != r", imports = {}))
        public final boolean synergyStateChange(int l, int r2) {
            return l != r2;
        }

        public final int update(int i, int i2, boolean z) {
            return z ? add(i, i2) : remove(i, i2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/miui/circulate/device/api/Constant$UpdateType;", "", "()V", "UPDATE_NORMAL", "", "UPDATE_STATE", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class UpdateType {

        @NotNull
        public static final UpdateType INSTANCE = new UpdateType();

        @NotNull
        public static final String UPDATE_NORMAL = "update_normal";

        @NotNull
        public static final String UPDATE_STATE = "update_state";

        private UpdateType() {
        }
    }

    static {
        Uri uriBuild = new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(AUTHORITY).appendPath("method").build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "Builder()\n        .schem…OD_PATH)\n        .build()");
        METHOD_CALL = uriBuild;
        Uri uriBuild2 = new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(AUTHORITY).appendPath("export").build();
        Intrinsics.checkNotNullExpressionValue(uriBuild2, "Builder()\n        .schem…RT_PATH)\n        .build()");
        EXPORT_LIST_URI = uriBuild2;
        Uri uriBuild3 = new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(AUTHORITY).appendPath("device").build();
        Intrinsics.checkNotNullExpressionValue(uriBuild3, "Builder()\n        .schem…TA_PATH)\n        .build()");
        DEVICE_META_LIST_URI = uriBuild3;
        Uri uriBuild4 = new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(AUTHORITY).appendPath(PIN_PATH).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild4, "Builder()\n        .schem…IN_PATH)\n        .build()");
        PIN_URI = uriBuild4;
        Uri uriBuild5 = new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(AUTHORITY).appendPath("category").appendPath(DeviceCategory.MIJIA).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild5, "Builder()\n        .schem…y.MIJIA)\n        .build()");
        MIJIA_SHOW_URI = uriBuild5;
        Uri uriBuild6 = new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(AUTHORITY).appendPath("category").appendPath(DeviceCategory.MIJIA).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild6, "Builder()\n        .schem…y.MIJIA)\n        .build()");
        MIJIA_ALL_URI = uriBuild6;
        Uri uriBuild7 = new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(AUTHORITY).appendPath("category").appendPath(DeviceCategory.HEALTH).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild7, "Builder()\n        .schem….HEALTH)\n        .build()");
        HEALTH_DEVICE_LIST_URI = uriBuild7;
        Uri uriBuild8 = new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(AUTHORITY).appendPath(KV_PATH).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild8, "Builder()\n        .schem…KV_PATH)\n        .build()");
        KEY_VALUE_URI = uriBuild8;
        Uri uriBuild9 = new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(AUTHORITY).appendPath("category").build();
        Intrinsics.checkNotNullExpressionValue(uriBuild9, "Builder()\n        .schem…RY_PATH)\n        .build()");
        CATEGORY_DEVICE_LIST_URI = uriBuild9;
        Uri uriBuild10 = new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(AUTHORITY).appendPath("category").appendPath(DeviceCategory.NEARBY).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild10, "Builder()\n        .schem….NEARBY)\n        .build()");
        NEARBY_DEVICE_LIST_URI = uriBuild10;
    }

    private Constant() {
    }

    @Deprecated(message = "use MIJIA_SHOW_URI instead")
    public static /* synthetic */ void getMIJIA_ALL_URI$annotations() {
    }

    @NotNull
    public final Uri getCATEGORY_DEVICE_LIST_URI() {
        return CATEGORY_DEVICE_LIST_URI;
    }

    @NotNull
    public final Uri getDEVICE_META_LIST_URI() {
        return DEVICE_META_LIST_URI;
    }

    @NotNull
    public final Uri getEXPORT_LIST_URI() {
        return EXPORT_LIST_URI;
    }

    @NotNull
    public final Uri getHEALTH_DEVICE_LIST_URI() {
        return HEALTH_DEVICE_LIST_URI;
    }

    @NotNull
    public final Uri getKEY_VALUE_URI() {
        return KEY_VALUE_URI;
    }

    @NotNull
    public final Uri getMETHOD_CALL() {
        return METHOD_CALL;
    }

    @NotNull
    public final Uri getMIJIA_ALL_URI() {
        return MIJIA_ALL_URI;
    }

    @NotNull
    public final Uri getMIJIA_SHOW_URI() {
        return MIJIA_SHOW_URI;
    }

    @NotNull
    public final Uri getNEARBY_DEVICE_LIST_URI() {
        return NEARBY_DEVICE_LIST_URI;
    }

    @NotNull
    public final Uri getPIN_URI() {
        return PIN_URI;
    }
}
