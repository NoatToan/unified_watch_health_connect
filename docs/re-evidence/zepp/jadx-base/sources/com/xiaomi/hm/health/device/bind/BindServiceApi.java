package com.xiaomi.hm.health.device.bind;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.AsyncTask;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.IconCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 ?2\u00020\u0001:\u0001?J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ,\u0010\u0013\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH&J*\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0010\u001a\u00020\u000fH&J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u001d\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H&J\u001c\u0010 \u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH&J\"\u0010$\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00020\"2\u0006\u0010!\u001a\u00020\u0001H&J\"\u0010%\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000f0\"2\u0006\u0010!\u001a\u00020\u0001H&J\u0014\u0010&\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0007H&J\u001c\u0010+\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010*\u001a\u0004\u0018\u00010)H&J\u0018\u0010-\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020,2\u0006\u0010\u000e\u001a\u00020\rH&J\"\u0010.\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&J.\u0010.\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010,2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010/\u001a\u0004\u0018\u00010)2\u0006\u00100\u001a\u00020\u000fH&J\u0018\u00101\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u00104\u001a\u00020\u00022\u0006\u00103\u001a\u000202H&J\u0018\u00106\u001a\u00020\u00122\u0006\u0010\f\u001a\u0002052\u0006\u00103\u001a\u000202H&J \u00106\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u0002052\u0006\u00103\u001a\u00020\u00022\u0006\u00108\u001a\u000207H&J\u0010\u00109\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u000205H&J\"\u0010;\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u0002052\b\u0010\u000e\u001a\u0004\u0018\u00010:2\u0006\u00103\u001a\u00020\u0002H&J\u001a\u0010<\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u0002052\b\u0010\u000e\u001a\u0004\u0018\u00010:H&J\u0018\u0010>\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u0002052\u0006\u0010=\u001a\u000202H&¨\u0006@"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/BindServiceApi;", "", "", PhoneBindActivity.EXTRA_BIND_TYPE, "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getAllowBindSources", "", "getWatchName", "getWatchIcon", "(I)Ljava/lang/Integer;", "Landroid/app/Activity;", "activity", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "", "gotoInstruction", "firstBind", "", "goNext", DbUtils.Const.Table.CONTEXT, "dbDevice", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "dialog", "doNext", "isBindingWatch", "isBindingAllWatch", "source", "sourceToWatchType", "sourceToBandType", "Lcom/xiaomi/hm/health/device/bind/IUnbindListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, HMUnbindBaseLogic.TAG, IconCompat.EXTRA_OBJ, "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "createSwitchDeviceStopTask", "createSwitchDeviceStartTask", "getStartBindDevice", "flag", "getFlag", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "switchDeviceDestroyDevice", "Landroidx/appcompat/app/AppCompatActivity;", "switchStartUseDevice", "startUseDevice", "bleDevice", "newDevice", "useDeviceActivityStart", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "getBindType", "Landroid/content/Context;", "startBindDevice", "Lcom/xiaomi/hm/health/device/model/HMBrandType;", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_BRAND_TYPE, "startBindShoes", "Landroid/bluetooth/BluetoothDevice;", "startBindWatch", "startBindMiLi", "deviceType", "startBind", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface BindServiceApi {

    @NotNull
    public static final String BIND_ADDRESS_KEY = "bind_address";
    public static final int BIND_ALL_WATCH = 24;
    public static final int BIND_AMAZFIT_WATCH = 5;
    public static final int BIND_ANETO = 22;
    public static final int BIND_BLUE_MONKEY = 6;
    public static final int BIND_BOLT = 18;

    @NotNull
    public static final String BIND_BRAND_TYPE = "bind_brand_type";
    public static final int BIND_CHAOHU = 4;
    public static final int BIND_CHAOHU_L = 9;
    public static final int BIND_CHAOHU_SREIES = 10;
    public static final int BIND_COMO_NESS = 27;

    @NotNull
    public static final String BIND_DEVICE_KEY = "bind_device";

    @NotNull
    public static final String BIND_DEVICE_SOURCE = "bind_device_source";
    public static final int BIND_DONGTINGHU = 7;
    public static final int BIND_EARBUD = 25;
    public static final int BIND_EVEREST = 14;
    public static final int BIND_EVEREST_2 = 13;
    public static final int BIND_GT = 11;
    public static final int BIND_GTS = 12;
    public static final int BIND_HEADSET = 20;
    public static final int BIND_HEADSET_NEW = 28;
    public static final int BIND_HUANGHE = 16;
    public static final int BIND_LONDON = 23;
    public static final int BIND_MILI = 0;
    public static final int BIND_NORMANDY = 3;
    public static final int BIND_PYH = 8;
    public static final int BIND_QOG = 15;
    public static final int BIND_SHOES = 2;

    @NotNull
    public static final String BIND_SN_KEY = "bind_sn";
    public static final int BIND_TOKYO = 26;

    @NotNull
    public static final String BIND_TYPE_KEY = "bind_type";
    public static final int BIND_VENICE = 21;
    public static final int BIND_VULTURE = 19;
    public static final int BIND_WEIGHT = 1;
    public static final int BIND_XIHU = 17;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int MIN_RSSI = -90;
    public static final int REQUEST_CODE_START_DEVICE = 1024;
    public static final int RSSI_STOP_THELSHOLD = -45;
    public static final int RSSI_THELSHOLD = -60;

    @NotNull
    public static final String TAG = "BindServiceApi";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b%\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010/R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0016\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0016\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0016\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0016\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u0016\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0016\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\rR\u0016\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\rR\u0016\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\rR\u0016\u0010\u001d\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\rR\u0016\u0010\u001e\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\rR\u0016\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u0016\u0010 \u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\rR\u0016\u0010!\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\rR\u0016\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\rR\u0016\u0010#\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\rR\u0016\u0010$\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\rR\u0016\u0010%\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\rR\u0016\u0010&\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\rR\u0016\u0010'\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\rR\u0016\u0010(\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\rR\u0016\u0010)\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\rR\u0016\u0010*\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\rR\u0016\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\rR\u0016\u0010,\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\rR\u0016\u0010-\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\r¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/BindServiceApi$Companion;", "", "", "TAG", "Ljava/lang/String;", "BIND_TYPE_KEY", "BIND_ADDRESS_KEY", "BIND_DEVICE_KEY", "BIND_DEVICE_SOURCE", "BIND_SN_KEY", "BIND_BRAND_TYPE", "", "BIND_MILI", LogUtil.I, "BIND_WEIGHT", "BIND_SHOES", "BIND_NORMANDY", "BIND_CHAOHU", "BIND_AMAZFIT_WATCH", "BIND_BLUE_MONKEY", "BIND_DONGTINGHU", "REQUEST_CODE_START_DEVICE", "BIND_PYH", "BIND_CHAOHU_L", "BIND_CHAOHU_SREIES", "BIND_GT", "BIND_GTS", "BIND_EVEREST_2", "BIND_EVEREST", "BIND_QOG", "BIND_HUANGHE", "BIND_XIHU", "BIND_BOLT", "BIND_VULTURE", "BIND_HEADSET", "BIND_VENICE", "BIND_ANETO", "BIND_LONDON", "BIND_ALL_WATCH", "BIND_EARBUD", "BIND_TOKYO", "BIND_COMO_NESS", "BIND_HEADSET_NEW", "MIN_RSSI", "RSSI_THELSHOLD", "RSSI_STOP_THELSHOLD", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String BIND_ADDRESS_KEY = "bind_address";
        public static final int BIND_ALL_WATCH = 24;
        public static final int BIND_AMAZFIT_WATCH = 5;
        public static final int BIND_ANETO = 22;
        public static final int BIND_BLUE_MONKEY = 6;
        public static final int BIND_BOLT = 18;

        @NotNull
        public static final String BIND_BRAND_TYPE = "bind_brand_type";
        public static final int BIND_CHAOHU = 4;
        public static final int BIND_CHAOHU_L = 9;
        public static final int BIND_CHAOHU_SREIES = 10;
        public static final int BIND_COMO_NESS = 27;

        @NotNull
        public static final String BIND_DEVICE_KEY = "bind_device";

        @NotNull
        public static final String BIND_DEVICE_SOURCE = "bind_device_source";
        public static final int BIND_DONGTINGHU = 7;
        public static final int BIND_EARBUD = 25;
        public static final int BIND_EVEREST = 14;
        public static final int BIND_EVEREST_2 = 13;
        public static final int BIND_GT = 11;
        public static final int BIND_GTS = 12;
        public static final int BIND_HEADSET = 20;
        public static final int BIND_HEADSET_NEW = 28;
        public static final int BIND_HUANGHE = 16;
        public static final int BIND_LONDON = 23;
        public static final int BIND_MILI = 0;
        public static final int BIND_NORMANDY = 3;
        public static final int BIND_PYH = 8;
        public static final int BIND_QOG = 15;
        public static final int BIND_SHOES = 2;

        @NotNull
        public static final String BIND_SN_KEY = "bind_sn";
        public static final int BIND_TOKYO = 26;

        @NotNull
        public static final String BIND_TYPE_KEY = "bind_type";
        public static final int BIND_VENICE = 21;
        public static final int BIND_VULTURE = 19;
        public static final int BIND_WEIGHT = 1;
        public static final int BIND_XIHU = 17;
        public static final int MIN_RSSI = -90;
        public static final int REQUEST_CODE_START_DEVICE = 1024;
        public static final int RSSI_STOP_THELSHOLD = -45;
        public static final int RSSI_THELSHOLD = -60;

        @NotNull
        public static final String TAG = "BindServiceApi";
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @NotNull
    AsyncTask<Void, Void, Boolean> createSwitchDeviceStartTask(@NotNull Object obj);

    @NotNull
    AsyncTask<Void, Void, Integer> createSwitchDeviceStopTask(@NotNull Object obj);

    void doNext(@NotNull Activity context, @NotNull Device dbDevice, @Nullable LoadingDialog dialog, boolean gotoInstruction);

    @NotNull
    List<HMDeviceSource> getAllowBindSources(int bindType);

    int getBindType(@NotNull HMDeviceType type);

    int getFlag(@NotNull String flag);

    @Nullable
    Device getStartBindDevice(@Nullable Activity activity);

    @Nullable
    Integer getWatchIcon(int bindType);

    @Nullable
    String getWatchName(int bindType);

    void goNext(@Nullable Activity activity, @Nullable Device device, boolean gotoInstruction, boolean firstBind);

    boolean isBindingAllWatch(int bindType);

    boolean isBindingWatch(int bindType);

    int sourceToBandType(@Nullable HMDeviceSource source);

    int sourceToWatchType(@Nullable HMDeviceSource source);

    void startBind(@NotNull Context context, @NotNull HMDeviceType deviceType);

    void startBindDevice(@NotNull Context context, int type, @NotNull HMBrandType brandType);

    void startBindDevice(@NotNull Context activity, @NotNull HMDeviceType type);

    void startBindMiLi(@NotNull Context context, @Nullable BluetoothDevice device);

    void startBindShoes(@NotNull Context context);

    void startBindWatch(@NotNull Context context, @Nullable BluetoothDevice device, int type);

    void startUseDevice(@Nullable Activity context, @NotNull Device dbDevice, boolean gotoInstruction);

    void startUseDevice(@Nullable AppCompatActivity activity, @Nullable Device device, @Nullable HMBaseDevice bleDevice, boolean newDevice);

    void switchDeviceDestroyDevice(@Nullable Device device, @Nullable HMBaseDevice baseDevice);

    void switchStartUseDevice(@NotNull AppCompatActivity activity, @NotNull Device device);

    void unbind(@Nullable Device device, @Nullable IUnbindListener listener);

    void useDeviceActivityStart(@NotNull Activity context, @NotNull Device device);
}
