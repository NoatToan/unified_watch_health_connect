package com.xiaomi.hm.health.devicex.service.bind;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.IconCompat;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.account.HMLoginManager;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.BuildConfigApi;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.util.Rx;
import com.huami.web.service.WebViewService;
import com.loc.z;
import com.twitter.sdk.android.core.identity.AuthHandler;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.EarbudEnableHelper;
import com.xiaomi.hm.health.device.H5UrlSource;
import com.xiaomi.hm.health.device.HMBindDeviceActivity;
import com.xiaomi.hm.health.device.HMBlueMonkeySettingActivity;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.HMHeadsetSettingActivity;
import com.xiaomi.hm.health.device.HMShoesUseActivity;
import com.xiaomi.hm.health.device.HMSwitchDeviceActivity;
import com.xiaomi.hm.health.device.HMTreadmillSettingActivity;
import com.xiaomi.hm.health.device.HMUseDeviceActivity;
import com.xiaomi.hm.health.device.HMWeightSettingActivity;
import com.xiaomi.hm.health.device.HmEarbudMusicActivity;
import com.xiaomi.hm.health.device.InstallNormandyActivity;
import com.xiaomi.hm.health.device.PairCCBActivity;
import com.xiaomi.hm.health.device.amazfit_watch.ResourceProvider;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.bind.HMBindBaseLogic;
import com.xiaomi.hm.health.device.bind.HMUnbindBaseLogic;
import com.xiaomi.hm.health.device.bind.IUnbindListener;
import com.xiaomi.hm.health.device.bolt.TreadmillStartListener;
import com.xiaomi.hm.health.device.bolt.TreadmillStartTask;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.devicex.service.bind.BindServiceImpl;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.manager.SpeechTokenManager;
import com.xiaomi.hm.health.smalltool.ToolNavigateActivity;
import com.xiaomi.hm.health.speech.utils.EngineAccessCheckFucKt;
import com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity;
import com.xiaomi.hm.health.ui.smartplay.MiuiAPI;
import com.xiaomi.hm.health.ui.smartplay.RestoreDeviceConfigActivity;
import com.xiaomi.hm.health.utils.DeviceManualUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001eB\u0007¢\u0006\u0004\bc\u0010dJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002J.\u0010\u0017\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u001c\u0010\u001a\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0012H\u0002J\u0012\u0010\u001d\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J=\u0010#\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u001e*\u0012\u0012\u0004\u0012\u00028\u00000\u001fj\b\u0012\u0004\u0012\u00028\u0000` 2\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000!\"\u00028\u0000H\u0002¢\u0006\u0004\b#\u0010$J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030&2\u0006\u0010%\u001a\u00020\u0005H\u0016J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0005H\u0016J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0005H\u0016J\u0012\u0010*\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010+\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0019\u0010,\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\n2\u0006\u0010%\u001a\u00020\u0005H\u0016J*\u00102\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00122\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020\u0014H\u0016J\"\u00103\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u0014H\u0016J,\u00104\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u00101\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u001c\u00107\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u00106\u001a\u0004\u0018\u000105H\u0016J\"\u0010<\u001a\u0014\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00050:2\u0006\u00109\u001a\u000208H\u0016J\"\u0010=\u001a\u0014\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00140:2\u0006\u00109\u001a\u000208H\u0016J\u0014\u0010>\u001a\u0004\u0018\u00010\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010?\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J \u0010?\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010A\u001a\u00020@H\u0016J\u0010\u0010B\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\"\u0010D\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010C2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u001a\u0010E\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010CH\u0016J\u0010\u0010G\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\nH\u0016J\u001c\u0010J\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010I\u001a\u0004\u0018\u00010HH\u0016J\u0018\u0010L\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020K2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J.\u00103\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010K2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010M\u001a\u0004\u0018\u00010H2\u0006\u0010N\u001a\u00020\u0014H\u0016J\u0018\u0010O\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010P\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010R\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020\u0010H\u0016R\u001d\u0010X\u001a\u00020S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001d\u0010]\u001a\u00020Y8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010U\u001a\u0004\b[\u0010\\R\u001d\u0010b\u001a\u00020^8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010U\u001a\u0004\b`\u0010a¨\u0006f"}, d2 = {"Lcom/xiaomi/hm/health/devicex/service/bind/BindServiceImpl;", "Lcom/xiaomi/hm/health/device/bind/BindServiceApi;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "r", SOAP.XMLNS, "Lcom/xiaomi/hm/health/device/amazfit_watch/ResourceProvider;", "resourceProvider", "", hl.k, "l", z.j, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "", "firstBind", "", "o", "Landroid/app/Activity;", "activity", com.google.android.exoplayer2.text.ttml.b.r, "dbDevice", "e", DTransferConstants.SEARCH_KEY, ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", AuthHandler.d, GoogleApiAvailabilityLight.a, "(Ljava/util/ArrayList;[Ljava/lang/Object;)V", PhoneBindActivity.EXTRA_BIND_TYPE, "", "getAllowBindSources", "isBindingWatch", "isBindingAllWatch", "sourceToBandType", "sourceToWatchType", "getWatchIcon", "(I)Ljava/lang/Integer;", "getWatchName", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "dialog", "gotoInstruction", "doNext", "startUseDevice", "goNext", "Lcom/xiaomi/hm/health/device/bind/IUnbindListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, HMUnbindBaseLogic.TAG, "", IconCompat.EXTRA_OBJ, "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "createSwitchDeviceStopTask", "createSwitchDeviceStartTask", "getStartBindDevice", "startBindDevice", "Lcom/xiaomi/hm/health/device/model/HMBrandType;", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_BRAND_TYPE, "startBindShoes", "Landroid/bluetooth/BluetoothDevice;", "startBindWatch", "startBindMiLi", "flag", "getFlag", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "switchDeviceDestroyDevice", "Landroidx/appcompat/app/AppCompatActivity;", "switchStartUseDevice", "bleDevice", "newDevice", "useDeviceActivityStart", "getBindType", "deviceType", "startBind", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "a", "Lkotlin/Lazy;", "m", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "sNavigator", "Lcom/huami/web/service/WebViewService;", "b", GoogleApiAvailabilityLight.b, "()Lcom/huami/web/service/WebViewService;", "service", "Lcom/huami/devicex/injection/BuildConfigApi;", "c", "i", "()Lcom/huami/devicex/injection/BuildConfigApi;", "buildConfigApi", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BindServiceImpl implements BindServiceApi, KoinComponent {

    @NotNull
    private static final String d = "BindServiceImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy sNavigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy service;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy buildConfigApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_MADRID.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_MADRID_W.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_MADRID_HML.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_ZURICH.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_ZURICH_W.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_VERONA.ordinal()] = 6;
            iArr[HMDeviceSource.MILI_VERONA_W.ordinal()] = 7;
            iArr[HMDeviceSource.MILI_VIENNA.ordinal()] = 8;
            iArr[HMDeviceSource.MILI_VIENNA_W.ordinal()] = 9;
            iArr[HMDeviceSource.MILI_ANDES.ordinal()] = 10;
            iArr[HMDeviceSource.MILI_ANDES_W.ordinal()] = 11;
            iArr[HMDeviceSource.MILI_TEIDE.ordinal()] = 12;
            iArr[HMDeviceSource.MILI_TEIDE_W.ordinal()] = 13;
            iArr[HMDeviceSource.MILI_LEIDEN.ordinal()] = 14;
            iArr[HMDeviceSource.MILI_LEIDEN_W.ordinal()] = 15;
            iArr[HMDeviceSource.MILI_BLED.ordinal()] = 16;
            iArr[HMDeviceSource.MILI_BLED_W.ordinal()] = 17;
            iArr[HMDeviceSource.MILI_BLED_PRO.ordinal()] = 18;
            iArr[HMDeviceSource.MILI_BLED_PRO_W.ordinal()] = 19;
            iArr[HMDeviceSource.MILI_CANNES.ordinal()] = 20;
            iArr[HMDeviceSource.MILI_CANNES_W.ordinal()] = 21;
            iArr[HMDeviceSource.MILI_SOFIA.ordinal()] = 22;
            iArr[HMDeviceSource.MILI_SOFIA_W.ordinal()] = 23;
            iArr[HMDeviceSource.MILI_PROVENCE.ordinal()] = 24;
            iArr[HMDeviceSource.MILI_PROVENCE_W.ordinal()] = 25;
            iArr[HMDeviceSource.MILI_PROVENCE_W_NFC.ordinal()] = 26;
            iArr[HMDeviceSource.MILI_FLORENCE.ordinal()] = 27;
            iArr[HMDeviceSource.MILI_FLORENCE_W.ordinal()] = 28;
            iArr[HMDeviceSource.MILI_BERLIN.ordinal()] = 29;
            iArr[HMDeviceSource.MILI_BERLIN_W.ordinal()] = 30;
            iArr[HMDeviceSource.MILI_LILLE.ordinal()] = 31;
            iArr[HMDeviceSource.MILI_LILLE_W.ordinal()] = 32;
            iArr[HMDeviceSource.MILI_WUHAN.ordinal()] = 33;
            iArr[HMDeviceSource.MILI_CHONGQING.ordinal()] = 34;
            iArr[HMDeviceSource.MILI_CINCO.ordinal()] = 35;
            iArr[HMDeviceSource.EARBUD_CHOPIN.ordinal()] = 36;
            iArr[HMDeviceSource.MILI_CINCO_L.ordinal()] = 37;
            iArr[HMDeviceSource.MILI_RIO.ordinal()] = 38;
            iArr[HMDeviceSource.OTHER_MOZART.ordinal()] = 39;
            iArr[HMDeviceSource.OTHER_HAYDN.ordinal()] = 40;
            iArr[HMDeviceSource.MILI_ONYX.ordinal()] = 41;
            iArr[HMDeviceSource.MILI_ONYX_W.ordinal()] = 42;
            iArr[HMDeviceSource.MILI_HAMBURG.ordinal()] = 43;
            iArr[HMDeviceSource.MILI_HAMBURG_W.ordinal()] = 44;
            iArr[HMDeviceSource.MILI_BONN.ordinal()] = 45;
            iArr[HMDeviceSource.MILI_BONN_W.ordinal()] = 46;
            iArr[HMDeviceSource.MILI_NEWTON.ordinal()] = 47;
            iArr[HMDeviceSource.MILI_NEWTON_W.ordinal()] = 48;
            iArr[HMDeviceSource.MILI_LISBON.ordinal()] = 49;
            iArr[HMDeviceSource.MILI_LISBON_W.ordinal()] = 50;
            iArr[HMDeviceSource.MILI_OSPREY.ordinal()] = 51;
            iArr[HMDeviceSource.MILI_OSPREY_W.ordinal()] = 52;
            iArr[HMDeviceSource.MILI_OSPREY_C.ordinal()] = 53;
            iArr[HMDeviceSource.MILI_CORSICA.ordinal()] = 54;
            iArr[HMDeviceSource.MILI_CORSICA_W.ordinal()] = 55;
            iArr[HMDeviceSource.MILI_VOLGA.ordinal()] = 56;
            iArr[HMDeviceSource.MILI_VOLGA_W.ordinal()] = 57;
            iArr[HMDeviceSource.MILI_PRAGUE.ordinal()] = 58;
            iArr[HMDeviceSource.MILI_PRAGUE_W.ordinal()] = 59;
            iArr[HMDeviceSource.MILI_LISBON_WL.ordinal()] = 60;
            iArr[HMDeviceSource.MILI_NEWTON_WL.ordinal()] = 61;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HMDeviceType.values().length];
            iArr2[HMDeviceType.MILI.ordinal()] = 1;
            iArr2[HMDeviceType.SHOES.ordinal()] = 2;
            iArr2[HMDeviceType.WEIGHT.ordinal()] = 3;
            iArr2[HMDeviceType.OTHER.ordinal()] = 4;
            iArr2[HMDeviceType.TREADMILL.ordinal()] = 5;
            iArr2[HMDeviceType.HEADSET.ordinal()] = 6;
            iArr2[HMDeviceType.EARBUD.ordinal()] = 7;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "enable earbud result:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "enable earbud error:" + this.a.getLocalizedMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "source null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "source null!";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BindServiceImpl() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.sNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.devicex.service.bind.BindServiceImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceXNavigator getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.service = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<WebViewService>() { // from class: com.xiaomi.hm.health.devicex.service.bind.BindServiceImpl$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.web.service.WebViewService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WebViewService getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WebViewService.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.buildConfigApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<BuildConfigApi>() { // from class: com.xiaomi.hm.health.devicex.service.bind.BindServiceImpl$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.BuildConfigApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BuildConfigApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(BuildConfigApi.class), objArr4, objArr5);
            }
        });
    }

    private final <T> void d(ArrayList<T> arrayList, T... tArr) {
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            T t = tArr[i];
            i++;
            arrayList.add(t);
        }
    }

    private final void e(final Activity context, final Device dbDevice) {
        Rx.io(new ObservableOnSubscribe() { // from class: wx
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                BindServiceImpl.f(dbDevice, observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: xx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BindServiceImpl.g(this.a, context, dbDevice, ((Boolean) obj).booleanValue());
            }
        }, new Consumer() { // from class: yx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BindServiceImpl.h(this.a, context, dbDevice, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Device device, ObservableEmitter observableEmitter) {
        observableEmitter.onNext(Boolean.valueOf(EarbudEnableHelper.INSTANCE.enableEarbud(device, HMBindBaseLogic.getBleDevice())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(BindServiceImpl bindServiceImpl, Activity activity, Device device, boolean z) {
        HMLog.info("BindServiceApi", new a(z));
        if (z) {
            bindServiceImpl.goNext(activity, device, true, true);
        } else {
            bindServiceImpl.m().navigateToUnused(activity, device);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(BindServiceImpl bindServiceImpl, Activity activity, Device device, Throwable th) {
        HMLog.info("BindServiceApi", new b(th));
        bindServiceImpl.m().navigateToUnused(activity, device);
    }

    private final BuildConfigApi i() {
        return (BuildConfigApi) this.buildConfigApi.getValue();
    }

    private final String j(ResourceProvider resourceProvider) {
        return ViewUtils.isRTL() ? resourceProvider.getString(R.string.device_name_everest_all_bind) : resourceProvider.getString(R.string.device_name_everest_all);
    }

    private final String k(ResourceProvider resourceProvider) {
        return resourceProvider.getString(R.string.mili_gtr_h);
    }

    private final String l(ResourceProvider resourceProvider) {
        if (Language.isFrench()) {
            return HMDeviceUtils.getDeviceDescription(HMDeviceSource.MILI_PYH_W);
        }
        if (Language.isSimplifiedChinese()) {
            return resourceProvider.getString(R.string.mili_pyh_feed_simple_chinese);
        }
        return Language.isTraditionalChinese() ? resourceProvider.getString(R.string.mili_pyh_feed_traditional_chinese) : HMDeviceUtils.getDeviceDescription(HMDeviceSource.MILI_PYH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceXNavigator m() {
        return (DeviceXNavigator) this.sNavigator.getValue();
    }

    private final WebViewService n() {
        return (WebViewService) this.service.getValue();
    }

    private final void o(Context context, HMDeviceType type, Device device, boolean firstBind) {
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$1[type.ordinal()]) {
            case 1:
                m().navigateToDeviceSetting(context, HMDeviceSource.fromValue(device.getDevice_source().intValue()));
                break;
            case 2:
                Intent intent = new Intent(context, (Class<?>) HMShoesUseActivity.class);
                intent.putExtra(InstallNormandyActivity.EXTRA, true);
                context.startActivity(intent);
                break;
            case 3:
                HMWeightSettingActivity.launch(context, true, firstBind);
                break;
            case 4:
                context.startActivity(new Intent(context, (Class<?>) HMBlueMonkeySettingActivity.class));
                break;
            case 5:
                context.startActivity(new Intent(context, (Class<?>) HMTreadmillSettingActivity.class));
                break;
            case 6:
                HMHeadsetSettingActivity.INSTANCE.start(context, device.getDevice_address());
                break;
            case 7:
                context.startActivity(new Intent(context, (Class<?>) HmEarbudMusicActivity.class));
                break;
        }
    }

    private final void p(Activity activity, HMDeviceSource source) {
        switch (source == null ? -1 : WhenMappings.$EnumSwitchMapping$0[source.ordinal()]) {
            case 33:
            case 34:
                MiBand3InstructionActivity.launch(activity);
                break;
            case 35:
                if (Language.isSimplifiedChinese()) {
                    DeviceManualUtils.showDeviceManual(activity, source);
                }
                if (EngineAccessCheckFucKt.miAiRegionAccess()) {
                    HMKeeper.setUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(HMLoginManager.getValidUid(), true);
                }
                break;
            case 36:
            case 37:
                DeviceManualUtils.showDeviceManual(activity, source);
                break;
            case 38:
                if (Language.isEnglish()) {
                    DeviceManualUtils.showDeviceManual(activity, source);
                }
                break;
            case 39:
            case 40:
                String playUrl = H5UrlSource.INSTANCE.getMozartH5UrlStatic(source).getPlayUrl();
                if (playUrl != null) {
                    n().launch(playUrl);
                    break;
                }
                break;
        }
    }

    private final int q(HMDeviceSource source) {
        switch (source == null ? -1 : WhenMappings.$EnumSwitchMapping$0[source.ordinal()]) {
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return 11;
            case 60:
            case 61:
                if (DeviceXFunctionsKt.getBuildConfigApi().isSupportLNL()) {
                    return 11;
                }
            case 58:
            case 59:
            default:
                return 24;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0066 A[ORIG_RETURN, RETURN] */
    private final int r(HMDeviceSource source) {
        switch (WhenMappings.$EnumSwitchMapping$0[source.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return 11;
            case 8:
            case 9:
                if (DeviceXFunctionsKt.getBuildConfigApi().isSupportVienna()) {
                    return 11;
                }
                return 24;
            case 10:
            case 11:
                if (DeviceXFunctionsKt.getBuildConfigApi().isSupportAndes()) {
                    return 11;
                }
                return 24;
            case 12:
            case 13:
                if (DeviceXFunctionsKt.getBuildConfigApi().isSupportTeide()) {
                    return 11;
                }
                return 24;
            case 14:
            case 15:
                if (DeviceXFunctionsKt.getBuildConfigApi().isSupportLeiden()) {
                    return 11;
                }
                return 24;
            case 16:
            case 17:
            case 18:
            case 19:
                if (DeviceXFunctionsKt.getBuildConfigApi().isSupportBled()) {
                    return 11;
                }
                return 24;
            case 20:
            case 21:
                if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCannes()) {
                    return 11;
                }
                return 24;
            case 22:
            case 23:
                if (DeviceXFunctionsKt.getBuildConfigApi().isSupportSofia()) {
                    return 11;
                }
                return 24;
            case 24:
            case 25:
            case 26:
                if (DeviceXFunctionsKt.getBuildConfigApi().isSupportProvence()) {
                    return 11;
                }
                return 24;
            default:
                return 24;
        }
    }

    private final int s(HMDeviceSource source) {
        int i = WhenMappings.$EnumSwitchMapping$0[source.ordinal()];
        return 24;
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    @NotNull
    public AsyncTask<Void, Void, Boolean> createSwitchDeviceStartTask(@NotNull Object obj) {
        return new HMSwitchDeviceActivity.MyStartTask(obj);
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    @NotNull
    public AsyncTask<Void, Void, Integer> createSwitchDeviceStopTask(@NotNull Object obj) {
        return new HMSwitchDeviceActivity.MyStopTask(obj);
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public void doNext(@NotNull final Activity context, @NotNull final Device dbDevice, @Nullable final LoadingDialog dialog, boolean gotoInstruction) {
        Integer activeStatus = dbDevice.getActiveStatus();
        if (activeStatus != null && activeStatus.intValue() == 1) {
            startUseDevice(context, dbDevice, gotoInstruction);
            context.finish();
            return;
        }
        Integer device_type = dbDevice.getDevice_type();
        int value = HMDeviceType.EARBUD.getValue();
        if (device_type != null && device_type.intValue() == value) {
            e(context, dbDevice);
            return;
        }
        Integer device_source = dbDevice.getDevice_source();
        HMDeviceSource hMDeviceSource = HMDeviceSource.OTHER_BOLT;
        int value2 = hMDeviceSource.getValue();
        if (device_source != null && device_source.intValue() == value2) {
            new TreadmillStartTask(HMBindBaseLogic.getBleDevice(), HMDeviceManager.getInstance().getConflictDevice(hMDeviceSource), dbDevice, new TreadmillStartListener() { // from class: com.xiaomi.hm.health.devicex.service.bind.BindServiceImpl$doNext$task$1
                @Override // com.xiaomi.hm.health.device.bolt.TreadmillStartListener
                public void onFinish(boolean result) {
                    LoadingDialog loadingDialog = dialog;
                    if (loadingDialog != null) {
                        loadingDialog.dismiss();
                    }
                    context.finish();
                    if (result) {
                        ToolNavigateActivity.INSTANCE.to(context, 5);
                    } else {
                        this.m().navigateToUnused(context, dbDevice);
                    }
                }
            }).execute(new Void[0]);
        } else {
            HMUseDeviceActivity.start(context, dbDevice);
            context.finish();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    @NotNull
    public List<HMDeviceSource> getAllowBindSources(int bindType) {
        ArrayList arrayList = new ArrayList();
        if (bindType == 7) {
            arrayList.add(HMDeviceSource.MILI_DTH);
            arrayList.add(HMDeviceSource.MILI_TONLESAP);
            arrayList.add(HMDeviceSource.MILI_TONLESAP_O);
            arrayList.add(HMDeviceSource.MILI_TONLESAP_OL);
        } else if (bindType == 19) {
            arrayList.add(HMDeviceSource.MILI_VULTURE);
            arrayList.add(HMDeviceSource.MILI_BLANC);
            arrayList.add(HMDeviceSource.MILI_BLANC_W);
        } else if (bindType == 27) {
            arrayList.add(HMDeviceSource.MILI_COMO);
            arrayList.add(HMDeviceSource.MILI_COMO_L);
            arrayList.add(HMDeviceSource.MILI_COMO_W);
            arrayList.add(HMDeviceSource.MILI_COMO_WL);
            arrayList.add(HMDeviceSource.MILI_NESS);
            arrayList.add(HMDeviceSource.MILI_NESS_W);
            arrayList.add(HMDeviceSource.MILI_DAX);
            if (i().isSupportCrater()) {
                arrayList.add(HMDeviceSource.MILI_CRATER_W);
                arrayList.add(HMDeviceSource.MILI_CRATER_WL);
            }
        } else if (bindType == 11) {
            arrayList.add(HMDeviceSource.MILI_FALCON_DISNEY);
            arrayList.add(HMDeviceSource.MILI_FALCON);
            arrayList.add(HMDeviceSource.MILI_FALCON_W);
            arrayList.add(HMDeviceSource.MILI_FALCON_WL);
            arrayList.add(HMDeviceSource.MILI_HAWK);
            arrayList.add(HMDeviceSource.MILI_HAWK_W);
            arrayList.add(HMDeviceSource.MILI_HAWK_SWK);
            arrayList.add(HMDeviceSource.MILI_HAWK_SWK_W);
            arrayList.add(HMDeviceSource.MILI_FALCON_L);
            arrayList.add(HMDeviceSource.MILI_HAWK_L);
            arrayList.add(HMDeviceSource.MILI_HAWK_WL);
            arrayList.add(HMDeviceSource.MILI_KESTREL);
            arrayList.add(HMDeviceSource.MILI_KESTREL_L);
            arrayList.add(HMDeviceSource.MILI_KESTREL_W);
            arrayList.add(HMDeviceSource.MILI_KESTREL_WL);
            arrayList.add(HMDeviceSource.MILI_ONYX);
            arrayList.add(HMDeviceSource.MILI_ONYX_W);
            arrayList.add(HMDeviceSource.MILI_CORSICA);
            arrayList.add(HMDeviceSource.MILI_CORSICA_W);
            arrayList.add(HMDeviceSource.MILI_OSPREY);
            arrayList.add(HMDeviceSource.MILI_OSPREY_W);
            arrayList.add(HMDeviceSource.MILI_OSPREY_C);
            arrayList.add(HMDeviceSource.MILI_LISBON);
            arrayList.add(HMDeviceSource.MILI_LISBON_W);
            arrayList.add(HMDeviceSource.MILI_LINCS);
            arrayList.add(HMDeviceSource.MILI_LINCS_W);
            arrayList.add(HMDeviceSource.MILI_NEWTON);
            arrayList.add(HMDeviceSource.MILI_NEWTON_W);
            arrayList.add(HMDeviceSource.MILI_PRAGUE);
            arrayList.add(HMDeviceSource.MILI_PRAGUE_W);
            arrayList.add(HMDeviceSource.MILI_VOLGA);
            arrayList.add(HMDeviceSource.MILI_VOLGA_W);
            arrayList.add(HMDeviceSource.MILI_HAMBURG);
            arrayList.add(HMDeviceSource.MILI_BONN);
            arrayList.add(HMDeviceSource.MILI_HAMBURG_W);
            arrayList.add(HMDeviceSource.MILI_BONN_W);
            arrayList.add(HMDeviceSource.MILI_MADRID);
            arrayList.add(HMDeviceSource.MILI_MADRID_W);
            arrayList.add(HMDeviceSource.MILI_MADRID_HML);
            arrayList.add(HMDeviceSource.MILI_VIENNA);
            arrayList.add(HMDeviceSource.MILI_VIENNA_W);
            arrayList.add(HMDeviceSource.MILI_ANDES);
            arrayList.add(HMDeviceSource.MILI_ANDES_W);
            arrayList.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new HMDeviceSource[]{HMDeviceSource.MILI_TEIDE, HMDeviceSource.MILI_TEIDE_W}));
            arrayList.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new HMDeviceSource[]{HMDeviceSource.MILI_ZURICH, HMDeviceSource.MILI_ZURICH_W}));
            arrayList.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new HMDeviceSource[]{HMDeviceSource.MILI_VERONA, HMDeviceSource.MILI_VERONA_W}));
            HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_BLED_PRO;
            arrayList.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new HMDeviceSource[]{HMDeviceSource.MILI_BLED, hMDeviceSource, hMDeviceSource, HMDeviceSource.MILI_BLED_PRO_W, HMDeviceSource.MILI_CANNES, HMDeviceSource.MILI_CANNES_W}));
            arrayList.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new HMDeviceSource[]{HMDeviceSource.MILI_SOFIA, HMDeviceSource.MILI_SOFIA_W}));
            arrayList.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new HMDeviceSource[]{HMDeviceSource.MILI_LISBON_WL, HMDeviceSource.MILI_NEWTON_WL}));
            HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_PROVENCE;
            HMDeviceSource hMDeviceSource3 = HMDeviceSource.MILI_PROVENCE_W;
            arrayList.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new HMDeviceSource[]{hMDeviceSource2, hMDeviceSource3}));
            arrayList.add(hMDeviceSource2);
            arrayList.add(hMDeviceSource3);
            d(arrayList, HMDeviceSource.MILI_LEIDEN, HMDeviceSource.MILI_LEIDEN_W);
        } else if (bindType != 12) {
            switch (bindType) {
                case 21:
                    arrayList.add(HMDeviceSource.MILI_VENICE);
                    arrayList.add(HMDeviceSource.MILI_VENICE_W);
                    break;
                case 22:
                    arrayList.add(HMDeviceSource.MILI_ANETO);
                    break;
                case 23:
                    arrayList.add(HMDeviceSource.MILI_LONDON);
                    arrayList.add(HMDeviceSource.MILI_LONDON_W);
                    break;
            }
        } else {
            arrayList.add(HMDeviceSource.MILI_KESTREL);
            arrayList.add(HMDeviceSource.MILI_KESTREL_W);
        }
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public int getBindType(@NotNull HMDeviceType type) {
        int i = WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 6;
        }
        if (i == 5) {
            return 18;
        }
        if (i == 6) {
            return 20;
        }
        throw new RuntimeException("HMBindDeviceActivity - Start bind unsupported type: " + type);
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public int getFlag(@NotNull String flag) {
        return Intrinsics.areEqual(flag, "HMSwitchDeviceActivity#STOP_NOT_CONNECTED") ? 1 : -1;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    @Nullable
    public Device getStartBindDevice(@Nullable Activity activity) {
        if (activity != null && (activity instanceof HMBindDeviceActivity)) {
            return ((HMBindDeviceActivity) activity).getStartDevice();
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    @Nullable
    public Integer getWatchIcon(int bindType) {
        Integer numValueOf = Integer.valueOf(R.drawable.img_venice_bg);
        switch (bindType) {
            case 7:
            case 27:
                return Integer.valueOf(R.drawable.img_dth);
            case 8:
                return Integer.valueOf(R.drawable.img_pyh);
            case 9:
            case 18:
            case 20:
            case 24:
            case 25:
            default:
                return null;
            case 10:
                return Integer.valueOf(R.drawable.img_bind_amazfit_bip);
            case 11:
                return Integer.valueOf(R.drawable.img_gtr);
            case 12:
                return Integer.valueOf(R.drawable.img_kestrel);
            case 13:
                return Integer.valueOf(R.drawable.img_everest_2);
            case 14:
                return Integer.valueOf(R.drawable.img_everest_series);
            case 15:
                return Integer.valueOf(R.drawable.img_qog);
            case 16:
                return Integer.valueOf(R.drawable.img_huanghe);
            case 17:
                return Integer.valueOf(R.drawable.img_xihu);
            case 19:
                return Integer.valueOf(R.drawable.img_vulture);
            case 21:
            case 23:
                return numValueOf;
            case 22:
                return Integer.valueOf(R.drawable.img_aneto);
            case 26:
                return Integer.valueOf(R.drawable.tokyo_img_tokyo);
        }
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    @Nullable
    public String getWatchName(int bindType) {
        ResourceProvider resourceProvider = new ResourceProvider(DeviceXFunctionsKt.getContext());
        switch (bindType) {
            case 7:
                return resourceProvider.getString(R.string.mili_settting_mili_dth_line_feed);
            case 8:
                return l(resourceProvider);
            case 9:
            case 18:
            case 20:
            case 24:
            case 25:
            default:
                return null;
            case 10:
                return resourceProvider.getString(R.string.mili_chaohu_series);
            case 11:
                return k(resourceProvider);
            case 12:
                return resourceProvider.getString(R.string.mili_kestrel);
            case 13:
                return resourceProvider.getString(R.string.everest_2_bind);
            case 14:
                return j(resourceProvider);
            case 15:
                return resourceProvider.getString(R.string.device_name_qogir_for_bind);
            case 16:
                return resourceProvider.getString(R.string.device_name_huanghe);
            case 17:
                return resourceProvider.getString(R.string.device_name_xihu);
            case 19:
                return resourceProvider.getString(R.string.mili_vulture);
            case 21:
                return resourceProvider.getString(R.string.mili_venice);
            case 22:
                return resourceProvider.getString(R.string.mili_aneto);
            case 23:
                return resourceProvider.getString(R.string.mili_london);
            case 26:
                return resourceProvider.getString(R.string.mili_setting_mili_tokyo);
            case 27:
                return resourceProvider.getString(R.string.bind_como_ness);
        }
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public void goNext(@Nullable Activity activity, @Nullable Device device, boolean gotoInstruction, boolean firstBind) {
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device.getDevice_source().intValue());
        HMDeviceType type = hMDeviceSourceFromValue.getType();
        o(activity, type, device, firstBind);
        if (gotoInstruction) {
            p(activity, hMDeviceSourceFromValue);
        }
        if (hMDeviceSourceFromValue == HMDeviceSource.MILI_NFC && Language.isSimplifiedChinese()) {
            activity.startActivity(new Intent(activity, (Class<?>) PairCCBActivity.class));
        }
        if (HMDeviceType.MILI == type) {
            MiuiAPI.checkMiuiNotify(activity);
            RestoreDeviceConfigActivity.start(activity, hMDeviceSourceFromValue);
        }
        if (HMDeviceSource.OTHER_BOLT == hMDeviceSourceFromValue) {
            ToolNavigateActivity.INSTANCE.to(activity, 5);
        }
        SpeechTokenManager.getInstance().updateSpeechMiotToken();
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public boolean isBindingAllWatch(int bindType) {
        return bindType == 24;
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public boolean isBindingWatch(int bindType) {
        return bindType == 4 || bindType == 7 || bindType == 11 || bindType == 12 || bindType == 8 || bindType == 9 || bindType == 10 || bindType == 26 || bindType == 19 || bindType == 21 || bindType == 22 || bindType == 23 || bindType == 27;
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public int sourceToBandType(@Nullable HMDeviceSource source) {
        if (source != null) {
            return (CollectionsKt__CollectionsKt.arrayListOf(HMDeviceSource.MILI_BARI, HMDeviceSource.MILI_BARI_NFC, HMDeviceSource.MILI_BARI_W).contains(source) && i().isSupportBari()) ? 0 : 24;
        }
        HMLog.error$default(d, null, null, c.a, 6, null);
        return 24;
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public int sourceToWatchType(@Nullable HMDeviceSource source) {
        if (source == null) {
            HMLog.error$default(d, null, null, d.a, 6, null);
            return 24;
        }
        if (HMDeviceConfig.isChaohuSeries(source)) {
            return 10;
        }
        if (source == HMDeviceSource.MILI_DTH || source == HMDeviceSource.MILI_DTH_W || source == HMDeviceSource.MILI_TONLESAP || source == HMDeviceSource.MILI_TONLESAP_L || source == HMDeviceSource.MILI_TONLESAP_O || source == HMDeviceSource.MILI_TONLESAP_OL) {
            return 7;
        }
        if (HMDeviceConfig.isPYHSeries(source)) {
            return 8;
        }
        if (source == HMDeviceSource.MILI_VULTURE || source == HMDeviceSource.MILI_BLANC || source == HMDeviceSource.MILI_BLANC_W) {
            return 19;
        }
        if (HMDeviceConfig.isKestrelSeries(source)) {
            return 12;
        }
        if (HMDeviceConfig.isGT(source)) {
            return 11;
        }
        if (HMDeviceSource.MILI_ANETO == source) {
            return 22;
        }
        if (HMDeviceSource.MILI_TOKYO == source) {
            return 26;
        }
        if (HMDeviceSource.MILI_VENICE == source || HMDeviceSource.MILI_VENICE_W == source) {
            return 21;
        }
        if (HMDeviceSource.MILI_LONDON == source || HMDeviceSource.MILI_LONDON_W == source) {
            return 23;
        }
        if (CollectionsKt__CollectionsKt.listOf((Object[]) new HMDeviceSource[]{HMDeviceSource.MILI_COMO_L, HMDeviceSource.MILI_COMO_WL, HMDeviceSource.MILI_COMO, HMDeviceSource.MILI_COMO_W, HMDeviceSource.MILI_NESS, HMDeviceSource.MILI_NESS_W, HMDeviceSource.MILI_DAX}).contains(source)) {
            return 27;
        }
        if ((HMDeviceSource.MILI_CRATER_W == source || HMDeviceSource.MILI_CRATER_WL == source) && i().isSupportCrater()) {
            return 27;
        }
        if (ConfigHelperKt.hasFeature(Feature.GT4_SOURCE, source)) {
            return s(source);
        }
        if (ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, source)) {
            return r(source);
        }
        if (ConfigHelperKt.hasFeature(Feature.GT2_SOURCE, source)) {
            return q(source);
        }
        CollectionsKt__CollectionsKt.listOf((Object[]) new HMDeviceSource[]{HMDeviceSource.MILI_WAST, HMDeviceSource.MILI_WAST_W}).contains(source);
        return 24;
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public void startBind(@NotNull Context context, @NotNull HMDeviceType deviceType) {
        HMBindDeviceActivity.startBind(context, deviceType);
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public void startBindDevice(@NotNull Context activity, @NotNull HMDeviceType type) {
        HMBindDeviceActivity.startBind(activity, type);
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public void startBindMiLi(@NotNull Context context, @Nullable BluetoothDevice device) {
        HMBindDeviceActivity.startBindMiLi(context, device);
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public void startBindShoes(@NotNull Context context) {
        HMBindDeviceActivity.startBindShoes(context);
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public void startBindWatch(@NotNull Context context, @Nullable BluetoothDevice device, int type) {
        HMBindDeviceActivity.startBindWatch(context, device, type);
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public void startUseDevice(@Nullable Activity context, @NotNull Device dbDevice, boolean gotoInstruction) {
        HMDeviceManager.getInstance().bindDevice(HMBindBaseLogic.getBleDevice(), dbDevice);
        HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(dbDevice.getDevice_type().intValue());
        goNext(context, dbDevice, gotoInstruction, true);
        EventBus.getDefault().postSticky(new HMDeviceBindEvent(true, hMDeviceTypeFromValue));
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public void switchDeviceDestroyDevice(@Nullable Device device, @Nullable HMBaseDevice baseDevice) {
        HMSwitchDeviceActivity.destroyDevice(device, baseDevice);
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public void switchStartUseDevice(@NotNull AppCompatActivity activity, @NotNull Device device) {
        HMSwitchDeviceActivity.startUseDevice(activity, device);
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public void unbind(@Nullable Device device, @Nullable IUnbindListener listener) {
        HMUnbindBaseLogic.unbind(device, listener);
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public void useDeviceActivityStart(@NotNull Activity context, @NotNull Device device) {
        HMUseDeviceActivity.start(context, device);
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public void startBindDevice(@NotNull Context context, int type, @NotNull HMBrandType brandType) {
        Intent intent = new Intent(context, (Class<?>) HMBindDeviceActivity.class);
        intent.putExtra("bind_type", type);
        intent.putExtra("bind_brand_type", brandType.getValue());
        context.startActivity(intent);
    }

    @Override // com.xiaomi.hm.health.device.bind.BindServiceApi
    public void startUseDevice(@Nullable AppCompatActivity activity, @Nullable Device device, @Nullable HMBaseDevice bleDevice, boolean newDevice) {
        HMSwitchDeviceActivity.startUseDevice(activity, device, bleDevice, newDevice);
    }
}
