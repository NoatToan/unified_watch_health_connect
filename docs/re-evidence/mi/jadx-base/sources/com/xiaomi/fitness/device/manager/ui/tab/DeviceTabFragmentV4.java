package com.xiaomi.fitness.device.manager.ui.tab;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import coil.Coil;
import coil.memory.MemoryCache;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.NestRecyclerViewItemEffectiveExposeBiz;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.about.utils.CommonAppUrlsKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.SystemSetting;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.DevicePreference;
import com.xiaomi.fitness.device.manager.e;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceTabInfoProvider;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.extensions.DeviceWebUrlsKt;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.device.manager.ui.bind.BindDeviceCallbackWrapper;
import com.xiaomi.fitness.device.manager.ui.bind.PairCodeDialog;
import com.xiaomi.fitness.device.manager.ui.manager.ManagerActivity;
import com.xiaomi.fitness.device.manager.ui.tab.ConnectStatus;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4;
import com.xiaomi.fitness.device.manager.utils.BluetoothPermissionUtil;
import com.xiaomi.fitness.device.manager.utils.ChooseCommonAppUtil;
import com.xiaomi.fitness.devicesettings.export.wearmode.WearModeHelper;
import com.xiaomi.fitness.devicesettings.export.wearmode.WearModeHelperExtKt;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.main.export.BaseMainFragmentDelegate;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.nfc.export.NfcManager;
import com.xiaomi.fitness.nfc.export.NfcManagerExtKt;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.fitness.wearos.export.WearOSUtil;
import com.xiaomi.fitness.wearos.export.WearOsExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import com.xiaomi.onetrack.api.b;
import defpackage.a33;
import defpackage.av6;
import defpackage.bji;
import defpackage.dui;
import defpackage.eli;
import defpackage.h46;
import defpackage.l56;
import defpackage.n36;
import defpackage.ogi;
import defpackage.p36;
import defpackage.q06;
import defpackage.uzi;
import defpackage.xqi;
import defpackage.zv1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0082\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u0082\u0001B\u001b\b\u0007\u0012\u0006\u0010Z\u001a\u00020Y\u0012\u0006\u0010]\u001a\u00020\\¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J!\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u0007J\u000f\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\u0007J\u001f\u0010!\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u0014J\u0019\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0005H\u0002¢\u0006\u0004\b+\u0010\u0007J\u0019\u0010,\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b,\u0010$J\u0017\u0010-\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0017H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u0010.J\u001f\u00102\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0017H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0005H\u0002¢\u0006\u0004\b4\u0010\u0007J\u000f\u00105\u001a\u00020\u0005H\u0002¢\u0006\u0004\b5\u0010\u0007J\u0017\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0005H\u0002¢\u0006\u0004\b:\u0010\u0007J\u000f\u0010;\u001a\u00020\u0005H\u0002¢\u0006\u0004\b;\u0010\u0007J\u0017\u0010<\u001a\u00020\u00052\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b<\u00109J\u0017\u0010=\u001a\u00020\u00052\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b=\u00109J%\u0010?\u001a\u00020\u00052\u0006\u00107\u001a\u0002062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050>H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0005H\u0002¢\u0006\u0004\bA\u0010\u0007J\u001b\u0010B\u001a\u00020\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\bB\u0010.J\u0017\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0011H\u0002¢\u0006\u0004\bD\u0010EJ!\u0010J\u001a\u00020\u00052\u0006\u0010G\u001a\u00020F2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0005H\u0014¢\u0006\u0004\bL\u0010\u0007J\r\u0010M\u001a\u00020\u0005¢\u0006\u0004\bM\u0010\u0007J\u000f\u0010N\u001a\u00020\u0005H\u0014¢\u0006\u0004\bN\u0010\u0007J\u000f\u0010O\u001a\u00020\u0005H\u0014¢\u0006\u0004\bO\u0010\u0007J\u000f\u0010P\u001a\u00020\u0005H\u0016¢\u0006\u0004\bP\u0010\u0007J\u000f\u0010Q\u001a\u00020\u0005H\u0016¢\u0006\u0004\bQ\u0010\u0007J\u000f\u0010R\u001a\u00020\u0005H\u0016¢\u0006\u0004\bR\u0010\u0007J\u0017\u0010T\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u000bH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u000bH\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u000bH\u0016¢\u0006\u0004\bX\u0010WR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\"\u0010`\u001a\u00020_8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010gR\u001c\u0010j\u001a\b\u0012\u0002\b\u0003\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001c\u0010l\u001a\b\u0012\u0002\b\u0003\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010kR\u001c\u0010m\u001a\b\u0012\u0002\b\u0003\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010kR\u001c\u0010n\u001a\b\u0012\u0002\b\u0003\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010kR\u001c\u0010o\u001a\b\u0012\u0002\b\u0003\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010kR\u001c\u0010p\u001a\b\u0012\u0002\b\u0003\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010kR\u001c\u0010q\u001a\b\u0012\u0002\b\u0003\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010kR\u001c\u0010r\u001a\b\u0012\u0002\b\u0003\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010kR\u0016\u0010t\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010v\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u001c\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00050>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001c\u0010\u007f\u001a\b\u0012\u0002\b\u0003\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010k¨\u0006\u0083\u0001"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabFragmentV4;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel;", "Ll56;", "Lcom/xiaomi/fitness/device/manager/export/DeviceTabInfoProvider;", "", "clearLiveData", "()V", "startObservingPopMedalData", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "titleRes", "bondMiss", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;I)V", "removeDevice", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "", "retryDialog", "showRemoveFailDialog", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Z)V", "lostDevice", "rebindDevice", "", "oobNumber", "Lcom/xiaomi/fitness/device/manager/e;", "callback", "showBindConfirmDialog", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/e;)V", "showChooseAppDialog", "showGoUncommonUsedAppDialog", "showGoCommonUsedAppDialog", b.M, "showRebindFail", "mode", "showExistAccessoryModeFromAppDialog", "(Ljava/lang/Integer;)V", "did", "showExitAccessoryFromDeviceDialog", "(Ljava/lang/String;Ljava/lang/Integer;)V", "name", "showWearModeSwitchSuccessDialog", "(Ljava/lang/String;I)V", "showGoToSportDialog", "showExistAccessoryModeFromDeviceDialog", "showManageAccessoryDialog", "(Ljava/lang/String;)V", "showDeleteConfirmDialog", "accessoryDid", "currentDid", "showExitAccessoryModeDialog", "(Ljava/lang/String;Ljava/lang/String;)V", "showLocationDialog", "showDisableConnectDialog", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "tabContentItem", "onTabItemClicked", "(Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;)V", "onViewAllDevicesClick", "onSwitchWearModeClick", "onFaceEntranceItemClick", "onNormalTabItemClick", "Lkotlin/Function0;", "checkNeedConnect", "(Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;Lkotlin/jvm/functions/Function0;)V", "showPopMedalDialogIfNeed", "requestPermissionForConnect", "requestPermissionAgain", "bluetoothPermissionDialog", "(Z)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "firstVisible", "checkChosenAppIfNeed", "onVisible", "onInvisible", LifecycleConstantKt.ON_RESUME, "onDestroyView", LifecycleConstantKt.ON_STOP, "type", "tabName", "(I)Ljava/lang/String;", "deviceCount", "()I", "index", "Lcom/xiaomi/fitness/main/export/MainHelper;", "mMainHelper", "Lcom/xiaomi/fitness/main/export/MainHelper;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "mWearableDeviceManager", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "Lcom/xiaomi/fitness/main/export/BaseMainFragmentDelegate;", "mBaseFragmentDelegate", "Lcom/xiaomi/fitness/main/export/BaseMainFragmentDelegate;", "getMBaseFragmentDelegate", "()Lcom/xiaomi/fitness/main/export/BaseMainFragmentDelegate;", "setMBaseFragmentDelegate", "(Lcom/xiaomi/fitness/main/export/BaseMainFragmentDelegate;)V", "mRemoveRetryCount", "I", "mRebindRetryCount", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mBondMissDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mRemoveFailDialog", "mLostDeviceDialog", "mChooseAppDialog", "mGoCommonUsedAppDialog", "mGoUncommonUsedAppDialog", "mRebindDialog", "mPairCodeDialog", "", "mDevicePageStartShowTime", "J", "DEVICE_TAB_PAGE_NAME", "Ljava/lang/String;", "mShouldShowRetryDialog", "Z", "mCountryChangeListener", "Lkotlin/jvm/functions/Function0;", "La33;", "mBluetoothListener", "La33;", "switchWearModeDialog", "<init>", "(Lcom/xiaomi/fitness/main/export/MainHelper;Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;)V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceTabFragmentV4 extends Hilt_DeviceTabFragmentV4<DeviceTabV4ViewModel, l56> implements DeviceTabInfoProvider {
    private static final int CHOICE_COMMON_APP_SPORT_HEALTH = 3;
    private static final int CHOICE_COMMON_APP_WEARABLE = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "DeviceTabFragmentV4";

    @NotNull
    private final String DEVICE_TAB_PAGE_NAME;
    public BaseMainFragmentDelegate mBaseFragmentDelegate;

    @NotNull
    private final a33 mBluetoothListener;

    @Nullable
    private CommonDialog<?> mBondMissDialog;

    @Nullable
    private CommonDialog<?> mChooseAppDialog;

    @NotNull
    private Function0<Unit> mCountryChangeListener;
    private long mDevicePageStartShowTime;

    @Nullable
    private CommonDialog<?> mGoCommonUsedAppDialog;

    @Nullable
    private CommonDialog<?> mGoUncommonUsedAppDialog;

    @Nullable
    private CommonDialog<?> mLostDeviceDialog;

    @NotNull
    private final MainHelper mMainHelper;

    @Nullable
    private CommonDialog<?> mPairCodeDialog;

    @Nullable
    private CommonDialog<?> mRebindDialog;
    private int mRebindRetryCount;

    @Nullable
    private CommonDialog<?> mRemoveFailDialog;
    private int mRemoveRetryCount;
    private boolean mShouldShowRetryDialog;

    @NotNull
    private final WearableDeviceManager mWearableDeviceManager;

    @Nullable
    private CommonDialog<?> switchWearModeDialog;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabFragmentV4$Companion;", "", "<init>", "()V", "CHOICE_COMMON_APP_WEARABLE", "", "CHOICE_COMMON_APP_SPORT_HEALTH", "TAG", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4$checkNeedConnect$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4$checkNeedConnect$1", f = "DeviceTabFragmentV4.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $callback;
        final /* synthetic */ TabContentItem $tabContentItem;
        int label;
        final /* synthetic */ DeviceTabFragmentV4 this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4$checkNeedConnect$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4$checkNeedConnect$1$1", f = "DeviceTabFragmentV4.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DeviceTabFragmentV4 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04361(DeviceTabFragmentV4 deviceTabFragmentV4, Continuation<? super C04361> continuation) {
                super(2, continuation);
                this.this$0 = deviceTabFragmentV4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04361(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Context context = this.this$0.getContext();
                if (context != null) {
                    ToastExtKt.toastShort(context, uzi.o1);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4$checkNeedConnect$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4$checkNeedConnect$1$2", f = "DeviceTabFragmentV4.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $callback;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$callback = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$callback, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$callback.invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19751(TabContentItem tabContentItem, DeviceTabFragmentV4 deviceTabFragmentV4, Function0<Unit> function0, Continuation<? super C19751> continuation) {
            super(2, continuation);
            this.$tabContentItem = tabContentItem;
            this.this$0 = deviceTabFragmentV4;
            this.$callback = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C19751(this.$tabContentItem, this.this$0, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!this.$tabContentItem.getNeedConnect((WearableDeviceModel) this.this$0.mWearableDeviceManager.getCurrentDeviceModel()) || this.this$0.mWearableDeviceManager.isConnected()) {
                AnyExtKt.main$default(null, new AnonymousClass2(this.$callback, null), 1, null);
            } else {
                AnyExtKt.main$default(null, new C04361(this.this$0, null), 1, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceTabFragmentV4(@NotNull MainHelper mMainHelper, @NotNull WearableDeviceManager mWearableDeviceManager) {
        super(dui.q, zv1.f41707k);
        Intrinsics.checkNotNullParameter(mMainHelper, "mMainHelper");
        Intrinsics.checkNotNullParameter(mWearableDeviceManager, "mWearableDeviceManager");
        this.mMainHelper = mMainHelper;
        this.mWearableDeviceManager = mWearableDeviceManager;
        this.DEVICE_TAB_PAGE_NAME = "device_tab_page";
        this.mShouldShowRetryDialog = true;
        this.mCountryChangeListener = new Function0() { // from class: hr6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceTabFragmentV4.mCountryChangeListener$lambda$0(this.f20366a);
            }
        };
        this.mBluetoothListener = new a33() { // from class: ir6
            @Override // defpackage.a33
            public final void onStateChanged(int i) {
                DeviceTabFragmentV4.mBluetoothListener$lambda$1(this.f22011a, i);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ DeviceTabV4ViewModel access$getMViewModel(DeviceTabFragmentV4 deviceTabFragmentV4) {
        return (DeviceTabV4ViewModel) deviceTabFragmentV4.getMViewModel();
    }

    private final void bluetoothPermissionDialog(final boolean requestPermissionAgain) {
        CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(uzi.G0).setDialogDescription(Build.VERSION.SDK_INT >= 31 ? uzi.j1 : uzi.k1).setPositiveText(uzi.f36320a).setNegativeText(uzi.o2).create();
        commonDialogCreate.setCancelable(false);
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.bluetoothPermissionDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    if (requestPermissionAgain) {
                        DeviceTabFragmentV4.requestPermissionForConnect$default(this, null, 1, null);
                    } else {
                        FragmentActivity activity = this.getActivity();
                        if (activity != null) {
                            SystemSetting.INSTANCE.goToSetting(activity);
                        }
                    }
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        FragmentActivity activity = getActivity();
        commonDialogCreate.showIfNeed(activity != null ? activity.getSupportFragmentManager() : null);
    }

    private final void bondMiss(WearableDeviceModel deviceModel, int titleRes) {
        CommonDialog<?> commonDialog = this.mBondMissDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            String reconnectHelpUrl = DeviceWebUrlsKt.getReconnectHelpUrl(DeviceModelExtKt.getModel(deviceModel));
            Context context = getContext();
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("bondMiss").setDialogTitle(titleRes).setPositiveText(uzi.common_known).setDialogDescriptionString(new DialogParams.DialogDescriptionString(context != null ? LinkSpanHelper.a(context, getString(uzi.L, reconnectHelpUrl), Integer.valueOf(bji.f4286a), new LinkSpanHelper.a() { // from class: kq6
                @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
                public final void onLinkClicked(View view, String str) {
                    DeviceTabFragmentV4.bondMiss$lambda$22$lambda$21(view, str);
                }
            }) : null)).create();
            this.mBondMissDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate);
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.bondMiss.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    DeviceTabFragmentV4.this.mShouldShowRetryDialog = false;
                }
            });
            CommonDialog<?> commonDialog2 = this.mBondMissDialog;
            Intrinsics.checkNotNull(commonDialog2);
            commonDialog2.showIfNeed(getChildFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bondMiss$lambda$22$lambda$21(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    private final void checkNeedConnect(TabContentItem tabContentItem, Function0<Unit> callback) {
        AnyExtKt.io$default(null, new C19751(tabContentItem, this, callback, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void clearLiveData() {
        ((DeviceTabV4ViewModel) getMViewModel()).setMLoadingFlag(new MutableLiveData<>());
        DeviceTabV4ViewModel deviceTabV4ViewModel = (DeviceTabV4ViewModel) getMViewModel();
        Boolean bool = Boolean.FALSE;
        deviceTabV4ViewModel.setShowOpenLocationSwitch(new MutableLiveData<>(bool));
        ((DeviceTabV4ViewModel) getMViewModel()).setMGoUncommonUsedAppFlag(new MutableLiveData<>(bool));
        ((DeviceTabV4ViewModel) getMViewModel()).setMUpdateAppSuccessFlag(new MutableLiveData<>(bool));
        ((DeviceTabV4ViewModel) getMViewModel()).setMChoiceAppFlag(new MutableLiveData<>(bool));
        ((DeviceTabV4ViewModel) getMViewModel()).setShowConnectPermission(new MutableLiveData<>());
        ((DeviceTabV4ViewModel) getMViewModel()).setExitAccessory(new MutableLiveData<>());
        ((DeviceTabV4ViewModel) getMViewModel()).setManageAccessory(new MutableLiveData<>());
        ((DeviceTabV4ViewModel) getMViewModel()).setExistAccessoryMode(new MutableLiveData<>());
        ((DeviceTabV4ViewModel) getMViewModel()).setWearModeSwitchSuccess(new MutableLiveData<>());
        ((DeviceTabV4ViewModel) getMViewModel()).setWearModeSwitchSuccessFromApp(new MutableLiveData<>());
        ((DeviceTabV4ViewModel) getMViewModel()).setExitAccessoryModeFromDevice(new MutableLiveData<>());
        ((DeviceTabV4ViewModel) getMViewModel()).setShowDisableConnect(new MutableLiveData<>());
        ((DeviceTabV4ViewModel) getMViewModel()).setBleReconnect(new MutableLiveData<>());
        ((DeviceTabV4ViewModel) getMViewModel()).setMedalToPopLiveData(new MutableLiveData<>());
    }

    private final void lostDevice(final WearableDeviceModel deviceModel) {
        CommonDialog<?> commonDialog = this.mLostDeviceDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("lostDevice").setDialogDescriptionString(new DialogParams.DialogDescriptionString(uzi.f36323r, DeviceModelExtKt.getName(deviceModel))).setNegativeText(uzi.u1).setPositiveText(uzi.p).setCancelable(false).setCanceledOnBackPressed(false).create();
            this.mLostDeviceDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate);
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.lostDevice.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    DeviceTabFragmentV4.this.mLostDeviceDialog = null;
                    if (which == -2) {
                        DeviceTabFragmentV4.this.mRemoveRetryCount = 0;
                        DeviceTabFragmentV4.this.removeDevice(deviceModel);
                    } else {
                        if (which != -1) {
                            return;
                        }
                        DeviceTabFragmentV4.this.mRebindRetryCount = 0;
                        DeviceTabFragmentV4.this.rebindDevice(deviceModel);
                    }
                }
            }).showIfNeed(getChildFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void mBluetoothListener$lambda$1(DeviceTabFragmentV4 this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getIsFragmentVisible() && i == 12) {
            ((DeviceTabV4ViewModel) this$0.getMViewModel()).connectDeviceIfNeed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit mCountryChangeListener$lambda$0(DeviceTabFragmentV4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((DeviceTabV4ViewModel) this$0.getMViewModel()).switchRegin();
        return Unit.INSTANCE;
    }

    private final void onFaceEntranceItemClick(final TabContentItem tabContentItem) {
        if (tabContentItem.getType() != 212) {
            checkNeedConnect(tabContentItem, new Function0() { // from class: dr6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceTabFragmentV4.onFaceEntranceItemClick$lambda$46(tabContentItem, this);
                }
            });
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        tabContentItem.handleItemClicked(contextRequireContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFaceEntranceItemClick$lambda$46(TabContentItem tabContentItem, DeviceTabFragmentV4 this$0) {
        Intrinsics.checkNotNullParameter(tabContentItem, "$tabContentItem");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        tabContentItem.handleItemClicked(contextRequireContext);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNormalTabItemClick(TabContentItem tabContentItem) {
        Logger.i(TAG, "onTabItemClicked " + tabContentItem.getType());
        if (((DeviceTabV4ViewModel) getMViewModel()).getMAllFeatureCardIds().contains(Integer.valueOf(tabContentItem.getType()))) {
            onTabItemClicked(tabContentItem);
            return;
        }
        Logger.i(TAG, "mAllFeatureCardIds not contains " + tabContentItem.getType());
    }

    private final void onSwitchWearModeClick() {
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this.mWearableDeviceManager.getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        final p36 p36VarA0 = p36.A0(LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(p36VarA0, "inflate(...)");
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("").setDialogTitle(uzi.d2).setCustomView(p36VarA0.getRoot()).create();
        this.switchWearModeDialog = commonDialogCreate;
        if (commonDialogCreate != null) {
            commonDialogCreate.showIfNeed(getParentFragmentManager());
        }
        p36VarA0.C.setOnClickListener(new View.OnClickListener() { // from class: gr6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceTabFragmentV4.onSwitchWearModeClick$lambda$44$lambda$39(this.f19261a, wearableDeviceModel, view);
            }
        });
        p36VarA0.I.setOnClickListener(new View.OnClickListener() { // from class: nr6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceTabFragmentV4.onSwitchWearModeClick$lambda$44$lambda$41(this.f28282a, wearableDeviceModel, view);
            }
        });
        p36VarA0.O.setOnClickListener(new View.OnClickListener() { // from class: or6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceTabFragmentV4.onSwitchWearModeClick$lambda$44$lambda$43(this.f29414a, wearableDeviceModel, view);
            }
        });
        WearModeHelper.DefaultImpls.refreshWearMode$default(WearModeHelperExtKt.getInstance(WearModeHelper.INSTANCE), null, new Function1() { // from class: pr6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onSwitchWearModeClick$lambda$45(p36VarA0, ((Integer) obj).intValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onSwitchWearModeClick$lambda$44$lambda$39(final DeviceTabFragmentV4 this$0, WearableDeviceModel deviceModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceModel, "$deviceModel");
        ((DeviceTabV4ViewModel) this$0.getMViewModel()).switchAccessoryMode(0, deviceModel.getDid(), true, new Function1() { // from class: fq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onSwitchWearModeClick$lambda$44$lambda$39$lambda$38(this.f18078a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSwitchWearModeClick$lambda$44$lambda$39$lambda$38(DeviceTabFragmentV4 this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog<?> commonDialog = this$0.switchWearModeDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onSwitchWearModeClick$lambda$44$lambda$41(final DeviceTabFragmentV4 this$0, WearableDeviceModel deviceModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceModel, "$deviceModel");
        ((DeviceTabV4ViewModel) this$0.getMViewModel()).switchAccessoryMode(1, deviceModel.getDid(), true, new Function1() { // from class: rr6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onSwitchWearModeClick$lambda$44$lambda$41$lambda$40(this.f32818a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSwitchWearModeClick$lambda$44$lambda$41$lambda$40(DeviceTabFragmentV4 this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog<?> commonDialog = this$0.switchWearModeDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onSwitchWearModeClick$lambda$44$lambda$43(final DeviceTabFragmentV4 this$0, WearableDeviceModel deviceModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceModel, "$deviceModel");
        ((DeviceTabV4ViewModel) this$0.getMViewModel()).switchAccessoryMode(2, deviceModel.getDid(), true, new Function1() { // from class: jr6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onSwitchWearModeClick$lambda$44$lambda$43$lambda$42(this.f23051a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSwitchWearModeClick$lambda$44$lambda$43$lambda$42(DeviceTabFragmentV4 this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog<?> commonDialog = this$0.switchWearModeDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSwitchWearModeClick$lambda$45(p36 binding, int i) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        binding.A.setChecked(i == 0);
        binding.G.setChecked(i == 1);
        binding.M.setChecked(i == 2);
        return Unit.INSTANCE;
    }

    private final void onTabItemClicked(TabContentItem tabContentItem) {
        Bundle bundle = new Bundle();
        bundle.putInt(DeviceSettingListFragment.DEVICE_TAB_TYPE, tabContentItem.getType());
        Unit unit = Unit.INSTANCE;
        BaseFragmentExKt.gotoPage(this, DeviceSettingListFragment.class, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onViewAllDevicesClick() {
        if (ChooseCommonAppUtil.INSTANCE.isRecoveryAppCommonStatus()) {
            if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() && !AppUtil.INSTANCE.isPlayChannel() && ConfigPreference.INSTANCE.getIS_APP_CHOSEN_OPEN()) {
                ((DeviceTabV4ViewModel) getMViewModel()).checkChosenApp(Boolean.TRUE);
                return;
            }
            return;
        }
        Context context = getContext();
        if (context != null) {
            LaunchExtensionKt.startActivity(context, (Class<?>) ManagerActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: iq6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceTabFragmentV4.onViewAllDevicesClick$lambda$37((Intent) obj);
                }
            });
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.overridePendingTransition(ogi.f29146a, ogi.c);
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.51.0.1.36384"), "name", "Device_page_Devicelist");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewAllDevicesClick$lambda$37(Intent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra(ManagerActivity.LAUNCH_fROM_V4, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10(DeviceTabFragmentV4 this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
        String str = (String) pair.component2();
        if (zBooleanValue) {
            this$0.requestPermissionForConnect(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(DeviceTabFragmentV4 this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showExitAccessoryModeDialog((String) pair.getFirst(), (String) pair.getSecond());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$12(DeviceTabFragmentV4 this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(str);
        this$0.showManageAccessoryDialog(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13(DeviceTabFragmentV4 this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int iIntValue = ((Number) pair.component1()).intValue();
        if (((Boolean) pair.component2()).booleanValue()) {
            this$0.showExistAccessoryModeFromAppDialog(Integer.valueOf(iIntValue));
        } else {
            this$0.showExistAccessoryModeFromDeviceDialog(Integer.valueOf(iIntValue));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$15(DeviceTabFragmentV4 this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showWearModeSwitchSuccessDialog((String) pair.component1(), ((Number) pair.component2()).intValue());
        CommonDialog<?> commonDialog = this$0.switchWearModeDialog;
        if (commonDialog != null && commonDialog.isShowing()) {
            commonDialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$16(DeviceTabFragmentV4 this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            ISportAccessApi instance = SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE);
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            instance.launchSportBeanModeWearGuideActivity(contextRequireContext);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$17(DeviceTabFragmentV4 this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showExitAccessoryFromDeviceDialog((String) pair.component1(), Integer.valueOf(((Number) pair.component2()).intValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$18(DeviceTabFragmentV4 this$0, ConnectStatus connectStatus) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isInvalid()) {
            return Unit.INSTANCE;
        }
        int code = connectStatus.getCode();
        if (code == 2004) {
            CommonDialog<?> commonDialog = this$0.mBondMissDialog;
            if (commonDialog != null && commonDialog.isShowing()) {
                CommonDialog<?> commonDialog2 = this$0.mBondMissDialog;
                if (commonDialog2 != null) {
                    commonDialog2.dismiss();
                }
                this$0.mBondMissDialog = null;
            }
        } else if (code == 2005) {
            this$0.lostDevice(connectStatus.getDeviceModel());
        } else if (code == 2010) {
            this$0.bondMiss(connectStatus.getDeviceModel(), uzi.I);
        } else if (connectStatus.getRetry() == 2 && this$0.mShouldShowRetryDialog) {
            if (DeviceModelExtKt.isWearOS(connectStatus.getDeviceModel()) || connectStatus.getDeviceModel().getIsConnectActive()) {
                this$0.bondMiss(connectStatus.getDeviceModel(), uzi.M);
            } else {
                this$0.showDisableConnectDialog();
                this$0.mShouldShowRetryDialog = false;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(DeviceTabFragmentV4 this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.showDisableConnectDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(final DeviceTabFragmentV4 this$0, TabContentItem tabContentItem, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tabContentItem, "tabContentItem");
        Intrinsics.checkNotNullParameter(view, "view");
        int type = tabContentItem.getType();
        if (type == 4) {
            int id = view.getId();
            if (id == xqi.c) {
                this$0.getMBaseFragmentDelegate().scanToAddDevice(this$0.getMActivity());
                IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
                OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("click_v3", "56.51.0.1.36381");
                Object[] objArr = new Object[6];
                objArr[0] = "name";
                objArr[1] = "Device_page_Adddevice";
                objArr[2] = "status";
                objArr[3] = Integer.valueOf(this$0.deviceCount() != 0 ? 1 : 0);
                objArr[4] = "position_name";
                objArr[5] = "Device_Card_Scan";
                oneTrackExtKt.reportData(oneTrackStatBean, objArr);
            } else if (id == xqi.f39367b) {
                this$0.getMBaseFragmentDelegate().addDevice(this$0.getMActivity(), new Function0() { // from class: lr6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DeviceTabFragmentV4.onViewCreated$lambda$4$lambda$3(this.f25369a);
                    }
                });
            }
        } else if (type == 5) {
            if (view.getId() == xqi.J) {
                this$0.onViewAllDevicesClick();
            }
            if (view.getId() == xqi.W) {
                if (this$0.mWearableDeviceManager.isConnected()) {
                    this$0.onSwitchWearModeClick();
                } else {
                    Context context = this$0.getContext();
                    if (context != null) {
                        ToastExtKt.toastShort(context, uzi.o1);
                    }
                }
            }
        } else if (type == 19) {
            FaceHelper faceHelperExtKt = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE);
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            FaceHelper.DefaultImpls.gotoFacePage$default(faceHelperExtKt, contextRequireContext, null, 2, null);
        } else if (type != 102) {
            this$0.onNormalTabItemClick(tabContentItem);
        } else {
            this$0.onFaceEntranceItemClick(tabContentItem);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3(DeviceTabFragmentV4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkChosenAppIfNeed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(DeviceTabFragmentV4 this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            PageState.DefaultImpls.showLoading$default(this$0, uzi.Z1, false, 2, null);
        } else {
            this$0.dismissDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(DeviceTabFragmentV4 this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.showLocationDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(DeviceTabFragmentV4 this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.showGoUncommonUsedAppDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8(DeviceTabFragmentV4 this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.showGoCommonUsedAppDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9(DeviceTabFragmentV4 this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.showChooseAppDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void rebindDevice(final WearableDeviceModel deviceModel) {
        ((DeviceTabV4ViewModel) getMViewModel()).bindDevice(deviceModel.getDeviceInfo(), new BindDeviceCallbackWrapper() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.rebindDevice.1
            @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceCallbackWrapper, com.xiaomi.fitness.device.manager.a
            public void dismissPairingCode() {
                super.dismissPairingCode();
                CommonDialog commonDialog = DeviceTabFragmentV4.this.mPairCodeDialog;
                if (commonDialog != null) {
                    commonDialog.dismiss();
                }
            }

            @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceCallbackWrapper, com.xiaomi.fitness.device.manager.a
            public void onBindFailure(int status) {
                DeviceTabFragmentV4 deviceTabFragmentV4 = DeviceTabFragmentV4.this;
                deviceTabFragmentV4.showRebindFail(deviceModel, deviceTabFragmentV4.mRebindRetryCount < 5);
            }

            @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceCallbackWrapper, com.xiaomi.fitness.device.manager.a
            public void onBindSuccess(String did) {
                Context context = DeviceTabFragmentV4.this.getContext();
                if (context != null) {
                    ToastExtKt.toastShort(context, uzi.w);
                }
            }

            @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceCallbackWrapper, com.xiaomi.fitness.device.manager.a
            public void onConnectFailure(int status) {
                super.onConnectFailure(status);
                DeviceTabFragmentV4 deviceTabFragmentV4 = DeviceTabFragmentV4.this;
                deviceTabFragmentV4.showRebindFail(deviceModel, deviceTabFragmentV4.mRebindRetryCount < 5);
            }

            @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceCallbackWrapper, com.xiaomi.fitness.device.manager.a
            public void onPairingFailure(int status) {
                super.onPairingFailure(status);
                DeviceTabFragmentV4 deviceTabFragmentV4 = DeviceTabFragmentV4.this;
                deviceTabFragmentV4.showRebindFail(deviceModel, deviceTabFragmentV4.mRebindRetryCount < 5);
            }

            @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceCallbackWrapper, com.xiaomi.fitness.device.manager.a
            public void onRequestDeviceFailure() {
            }

            @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceCallbackWrapper, com.xiaomi.fitness.device.manager.a
            public void onRequestDeviceSuccess() {
                Logger.i(DeviceTabFragmentV4.TAG, "onRequestDeviceSuccess() called");
            }

            @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceCallbackWrapper, com.xiaomi.fitness.device.manager.a
            public void showPairingCode(String code, e callback) {
                super.showPairingCode(code, callback);
                if (code != null && code.length() != 0) {
                    DeviceTabFragmentV4.this.showBindConfirmDialog(code, callback);
                    return;
                }
                CommonDialog commonDialog = DeviceTabFragmentV4.this.mPairCodeDialog;
                if (commonDialog != null) {
                    commonDialog.dismiss();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void removeDevice(final WearableDeviceModel deviceModel) {
        ((DeviceTabV4ViewModel) getMViewModel()).removeDelete(deviceModel, new l.a() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.removeDevice.1
            @Override // com.xiaomi.fitness.device.manager.l
            public void onFail(int code) {
                DeviceTabFragmentV4 deviceTabFragmentV4 = DeviceTabFragmentV4.this;
                deviceTabFragmentV4.showRemoveFailDialog(deviceModel, deviceTabFragmentV4.mRemoveRetryCount < 3);
            }

            @Override // com.xiaomi.fitness.device.manager.l
            public void onSuccess() {
                com.xiaomi.fit.device.extensions.DeviceModelExtKt.loge("remove device success");
            }
        });
    }

    private final void requestPermissionForConnect(final String did) {
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            BluetoothPermissionUtil.INSTANCE.showBluetoothSyncDataDialogIfNeed(activity, new Function1() { // from class: jq6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceTabFragmentV4.requestPermissionForConnect$lambda$54$lambda$53(activity, this, did, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static /* synthetic */ void requestPermissionForConnect$default(DeviceTabFragmentV4 deviceTabFragmentV4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        deviceTabFragmentV4.requestPermissionForConnect(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissionForConnect$lambda$54$lambda$53(FragmentActivity it, final DeviceTabFragmentV4 this$0, final String str, boolean z) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            BluetoothPermissionUtil.INSTANCE.requestBluetoothIfNeed(it, false, new Function1() { // from class: vq6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceTabFragmentV4.requestPermissionForConnect$lambda$54$lambda$53$lambda$52(this.f37125a, str, (MultiplePermissionsBuilder) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissionForConnect$lambda$54$lambda$53$lambda$52(final DeviceTabFragmentV4 this$0, final String str, MultiplePermissionsBuilder requestBluetoothIfNeed) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestBluetoothIfNeed, "$this$requestBluetoothIfNeed");
        requestBluetoothIfNeed.allGranted(new Function0() { // from class: gq6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceTabFragmentV4.requestPermissionForConnect$lambda$54$lambda$53$lambda$52$lambda$48(this.f19227a, str);
            }
        });
        requestBluetoothIfNeed.denied(new Function1() { // from class: hq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.requestPermissionForConnect$lambda$54$lambda$53$lambda$52$lambda$51(this.f20333a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestPermissionForConnect$lambda$54$lambda$53$lambda$52$lambda$48(DeviceTabFragmentV4 this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((DeviceTabV4ViewModel) this$0.getMViewModel()).connectDevice(false, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissionForConnect$lambda$54$lambda$53$lambda$52$lambda$51(final DeviceTabFragmentV4 this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        DevicePreference.INSTANCE.setLAST_REQUEST_PERMISSION_TIME(System.currentTimeMillis());
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) it.get(0), activity, it, null, null, new Function0() { // from class: eq6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceTabFragmentV4.requestPermissionForConnect$lambda$54$lambda$53$lambda$52$lambda$51$lambda$50$lambda$49(this.f16954a);
                }
            }, 24, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissionForConnect$lambda$54$lambda$53$lambda$52$lambda$51$lambda$50$lambda$49(DeviceTabFragmentV4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bluetoothPermissionDialog(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBindConfirmDialog(String oobNumber, final e callback) {
        CommonDialog<?> commonDialogAddDialogCallback = new PairCodeDialog.Builder(oobNumber).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.showBindConfirmDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) throws RemoteException {
                e eVar;
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which != -2) {
                    if (which == -1 && (eVar = callback) != null) {
                        eVar.onConfirm();
                        return;
                    }
                    return;
                }
                e eVar2 = callback;
                if (eVar2 != null) {
                    eVar2.onCanceled();
                }
            }
        });
        this.mPairCodeDialog = commonDialogAddDialogCallback;
        Intrinsics.checkNotNull(commonDialogAddDialogCallback);
        commonDialogAddDialogCallback.showIfNeed(getChildFragmentManager());
    }

    private final void showChooseAppDialog() {
        ChooseCommonAppUtil.INSTANCE.setShowCommonAppDialog(false);
        CommonDialog<?> commonDialog = this.mChooseAppDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            CommonDialog<?> commonDialog2 = this.mGoCommonUsedAppDialog;
            if (commonDialog2 == null || !commonDialog2.isShowing()) {
                CommonDialog<?> commonDialog3 = this.mGoUncommonUsedAppDialog;
                if (commonDialog3 == null || !commonDialog3.isShowing()) {
                    View viewInflate = LayoutInflater.from(getContext()).inflate(dui.f15942k, (ViewGroup) null, false);
                    Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                    final View viewFindViewById = viewInflate.findViewById(xqi.A0);
                    final View viewFindViewById2 = viewInflate.findViewById(xqi.B0);
                    TextView textView = (TextView) viewInflate.findViewById(xqi.z0);
                    String string = getResources().getString(uzi.X, CommonAppUrlsKt.getSelectCommonApplicationUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    Context context = getContext();
                    textView.setText(context != null ? LinkSpanHelper.a(context, string, Integer.valueOf(bji.f4286a), new LinkSpanHelper.a() { // from class: bq6
                        @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
                        public final void onLinkClicked(View view, String str) {
                            DeviceTabFragmentV4.showChooseAppDialog$lambda$24$lambda$23(view, str);
                        }
                    }) : null);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    if (this.mChooseAppDialog == null) {
                        this.mChooseAppDialog = new CommonDialog.c("choice").setCustomView(viewInflate).setNegativeText(uzi.c).setPositiveText(uzi.e0).setCanceledOnBackPressed(false).setCancelable(false).create();
                    }
                    viewFindViewById.setSelected(true);
                    viewFindViewById2.setSelected(false);
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: cq6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DeviceTabFragmentV4.showChooseAppDialog$lambda$25(viewFindViewById, viewFindViewById2, view);
                        }
                    });
                    viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: dq6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DeviceTabFragmentV4.showChooseAppDialog$lambda$26(viewFindViewById, viewFindViewById2, view);
                        }
                    });
                    CommonDialog<?> commonDialog4 = this.mChooseAppDialog;
                    if (commonDialog4 != null) {
                        commonDialog4.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.showChooseAppDialog.3
                            @Override // defpackage.av6
                            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                                super.onDialogClick(dialogName, dialog, which);
                                if (which == -1) {
                                    DeviceTabFragmentV4.access$getMViewModel(DeviceTabFragmentV4.this).onAppChosen(viewFindViewById.isSelected() ? 3 : 2);
                                }
                                CommonDialog commonDialog5 = DeviceTabFragmentV4.this.mChooseAppDialog;
                                if (commonDialog5 != null) {
                                    commonDialog5.dismiss();
                                }
                                DeviceTabFragmentV4.this.mChooseAppDialog = null;
                            }
                        });
                    }
                    CommonDialog<?> commonDialog5 = this.mChooseAppDialog;
                    if (commonDialog5 != null) {
                        commonDialog5.showIfNeed(getChildFragmentManager());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showChooseAppDialog$lambda$24$lambda$23(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showChooseAppDialog$lambda$25(View view, View view2, View view3) {
        view.setSelected(true);
        view2.setSelected(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showChooseAppDialog$lambda$26(View view, View view2, View view3) {
        view.setSelected(false);
        view2.setSelected(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDeleteConfirmDialog(final String did) {
        new CommonDialog.c("delete").setDialogTitle(uzi.i).setDialogDescription(uzi.h).setPositiveText(uzi.d).setNegativeText(uzi.f36321b).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.showDeleteConfirmDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    DeviceTabFragmentV4.access$getMViewModel(DeviceTabFragmentV4.this).unbind(did);
                }
            }
        }).showIfNeed(getParentFragmentManager());
    }

    private final void showDisableConnectDialog() {
        String model;
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            mActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(mActivity, "requireActivity(...)");
        }
        n36 n36VarA0 = n36.A0(LayoutInflater.from(mActivity));
        Intrinsics.checkNotNullExpressionValue(n36VarA0, "inflate(...)");
        FragmentActivity mActivity2 = getMActivity();
        if (mActivity2 == null) {
            mActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(mActivity2, "requireActivity(...)");
        }
        int i = uzi.y1;
        Object[] objArr = new Object[1];
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr[0] = DeviceWebUrlsKt.getReconnectHelpUrl(model);
        n36VarA0.A.setText(LinkSpanHelper.a(mActivity2, getString(i, objArr), Integer.valueOf(bji.f4286a), new LinkSpanHelper.a() { // from class: kr6
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                DeviceTabFragmentV4.showDisableConnectDialog$lambda$35(view, str);
            }
        }));
        n36VarA0.A.setMovementMethod(LinkMovementMethod.getInstance());
        CommonDialog commonDialogAddDialogCallback = new CommonDialog.c("disableConnect").setDialogTitle(uzi.u).setCustomView(n36VarA0.getRoot()).setPositiveText(uzi.u).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.showDisableConnectDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                DeviceTabV4ViewModel.connectDevice$default(DeviceTabFragmentV4.access$getMViewModel(DeviceTabFragmentV4.this), true, null, 2, null);
            }
        });
        FragmentActivity mActivity3 = getMActivity();
        if (mActivity3 == null) {
            mActivity3 = requireActivity();
        }
        commonDialogAddDialogCallback.showIfNeed(mActivity3.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDisableConnectDialog$lambda$35(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    private final void showExistAccessoryModeFromAppDialog(Integer mode) {
        new CommonDialog.c("existMode").setDialogTitle(uzi.r0).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getString(uzi.o0))).setNegativeText(uzi.n0).create().showIfNeed(getParentFragmentManager());
    }

    private final void showExistAccessoryModeFromDeviceDialog(Integer mode) {
        new CommonDialog.c("existAccessoryMode").setDialogTitle(new DialogParams.DialogDescriptionString(getString(uzi.q0))).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getString(uzi.p0))).setNegativeText(uzi.n0).create().showIfNeed(getParentFragmentManager());
    }

    private final void showExitAccessoryFromDeviceDialog(String did, Integer mode) {
        new CommonDialog.c("exitAccessoryFromDevice").setDialogTitle(new DialogParams.DialogDescriptionString(getString(uzi.q0))).setDialogDescription(uzi.s0).setNegativeText(uzi.n0).setCancelable(false).setCanceledOnBackPressed(false).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.showExitAccessoryFromDeviceDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -2 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        }).showIfNeed(getParentFragmentManager());
    }

    private final void showExitAccessoryModeDialog(final String accessoryDid, String currentDid) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) this.mWearableDeviceManager.getDeviceModel(currentDid);
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) this.mWearableDeviceManager.getDeviceModel(accessoryDid);
        final h46 h46VarA0 = h46.A0(LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(h46VarA0, "inflate(...)");
        h46VarA0.D0(wearableDeviceModel != null ? wearableDeviceModel.getDeviceInfo() : null);
        h46VarA0.C0(wearableDeviceModel2 != null ? wearableDeviceModel2.getDeviceInfo() : null);
        final CommonDialog commonDialogCreate = new CommonDialog.c("exitAccessory").setDialogTitle(uzi.u0).setDialogDescription(uzi.t0).setCustomView(h46VarA0.getRoot()).setNegativeText(uzi.c).create();
        h46VarA0.setListener(new View.OnClickListener() { // from class: er6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceTabFragmentV4.showExitAccessoryModeDialog$lambda$33(this.f16984a, accessoryDid, commonDialogCreate, h46VarA0, view);
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showExitAccessoryModeDialog$lambda$33(final DeviceTabFragmentV4 this$0, final String accessoryDid, CommonDialog commonDialog, final h46 binding, final View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(accessoryDid, "$accessoryDid");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        ((DeviceTabV4ViewModel) this$0.getMViewModel()).switchAccessoryMode(0, accessoryDid, true, new Function1() { // from class: qr6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.showExitAccessoryModeDialog$lambda$33$lambda$32(view, binding, this$0, accessoryDid, ((Boolean) obj).booleanValue());
            }
        });
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showExitAccessoryModeDialog$lambda$33$lambda$32(View view, h46 binding, DeviceTabFragmentV4 this$0, String accessoryDid, boolean z) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(accessoryDid, "$accessoryDid");
        if (z) {
            if (view.getId() == binding.A.getId()) {
                WearableDeviceManager wearableDeviceManager = this$0.mWearableDeviceManager;
                wearableDeviceManager.switchDevice(wearableDeviceManager.getDeviceModel(accessoryDid));
            } else {
                this$0.mWearableDeviceManager.disconnectDevice(accessoryDid);
                ((DeviceTabV4ViewModel) this$0.getMViewModel()).loadDevice(false);
            }
        }
        return Unit.INSTANCE;
    }

    private final void showGoCommonUsedAppDialog() {
        CommonDialog commonDialogAddDialogCallback;
        View view;
        TextView textView;
        CommonDialog<?> commonDialog;
        CommonDialog<?> commonDialog2 = this.mGoCommonUsedAppDialog;
        if (commonDialog2 != null && commonDialog2.isShowing() && (commonDialog = this.mGoCommonUsedAppDialog) != null) {
            commonDialog.dismiss();
        }
        String string = ApplicationExtKt.getApplication().getResources().getString(uzi.z0, CommonAppUrlsKt.getSelectCommonApplicationUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Context context = getContext();
        Spannable spannableA = context != null ? LinkSpanHelper.a(context, string, Integer.valueOf(bji.f4286a), new LinkSpanHelper.a() { // from class: sr6
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view2, String str) {
                DeviceTabFragmentV4.showGoCommonUsedAppDialog$lambda$30$lambda$29(view2, str);
            }
        }) : null;
        if (this.mGoCommonUsedAppDialog == null) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("gotoapp").setDialogTitle(uzi.y0).setDialogDescriptionString(new DialogParams.DialogDescriptionString(spannableA)).setPositiveText(uzi.x0).setNegativeText(uzi.N).setCanceledOnBackPressed(false).setCancelable(false).create();
            this.mGoCommonUsedAppDialog = commonDialogCreate;
            if (commonDialogCreate != null && (view = commonDialogCreate.getView()) != null && (textView = (TextView) view.findViewById(xqi.k0)) != null) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        CommonDialog<?> commonDialog3 = this.mGoCommonUsedAppDialog;
        if (commonDialog3 == null || (commonDialogAddDialogCallback = commonDialog3.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.showGoCommonUsedAppDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                if (which == -1) {
                    DeviceTabFragmentV4.access$getMViewModel(DeviceTabFragmentV4.this).recordChosenApp();
                }
                dialog.dismiss();
                DeviceTabFragmentV4.this.mGoCommonUsedAppDialog = null;
            }
        })) == null) {
            return;
        }
        commonDialogAddDialogCallback.showIfNeed(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showGoCommonUsedAppDialog$lambda$30$lambda$29(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showGoToSportDialog() {
        q06 q06VarA0 = q06.A0(LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(q06VarA0, "inflate(...)");
        CommonDialog commonDialogCreate = new CommonDialog.c("gotoSport").setDialogTitle(uzi.l).setDialogDescription(uzi.f36322k).setCustomView(q06VarA0.getRoot()).setNegativeText(uzi.f36321b).create();
        DeviceAccessorySportSelectAdapter deviceAccessorySportSelectAdapter = new DeviceAccessorySportSelectAdapter(new Function1() { // from class: zp6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.showGoToSportDialog$lambda$31(this.f41541a, ((Integer) obj).intValue());
            }
        });
        q06VarA0.A.setAdapter(deviceAccessorySportSelectAdapter);
        q06VarA0.A.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        deviceAccessorySportSelectAdapter.show();
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showGoToSportDialog$lambda$31(DeviceTabFragmentV4 this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 0) {
            ISportAccessApi instance = SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE);
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity == null) {
                mActivity = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(mActivity, "requireActivity(...)");
            }
            instance.launchLaunchSportActivity(1, mActivity);
        } else if (i == 1) {
            ISportAccessApi instance2 = SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE);
            FragmentActivity mActivity2 = this$0.getMActivity();
            if (mActivity2 == null) {
                mActivity2 = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(mActivity2, "requireActivity(...)");
            }
            instance2.launchLaunchSportActivity(2, mActivity2);
        } else if (i == 2) {
            ISportAccessApi instance3 = SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE);
            FragmentActivity mActivity3 = this$0.getMActivity();
            if (mActivity3 == null) {
                mActivity3 = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(mActivity3, "requireActivity(...)");
            }
            instance3.launchLaunchSportActivity(6, mActivity3);
        } else if (i == 3) {
            ISportAccessApi instance4 = SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE);
            FragmentActivity mActivity4 = this$0.getMActivity();
            if (mActivity4 == null) {
                mActivity4 = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(mActivity4, "requireActivity(...)");
            }
            instance4.launchLaunchSportActivity(3, mActivity4);
        }
        return Unit.INSTANCE;
    }

    private final void showGoUncommonUsedAppDialog() {
        View view;
        TextView textView;
        CommonDialog<?> commonDialog = this.mGoUncommonUsedAppDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            String string = ApplicationExtKt.getApplication().getResources().getString(uzi.W, CommonAppUrlsKt.getSelectCommonApplicationUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Context context = getContext();
            Spannable spannableA = context != null ? LinkSpanHelper.a(context, string, Integer.valueOf(bji.f4286a), new LinkSpanHelper.a() { // from class: cr6
                @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
                public final void onLinkClicked(View view2, String str) {
                    DeviceTabFragmentV4.showGoUncommonUsedAppDialog$lambda$28$lambda$27(view2, str);
                }
            }) : null;
            if (this.mGoUncommonUsedAppDialog == null) {
                CommonDialog<?> commonDialogCreate = new CommonDialog.c("confirm").setDialogTitle(uzi.V).setDialogDescriptionString(new DialogParams.DialogDescriptionString(spannableA)).setNegativeText(uzi.c).setPositiveText(uzi.A0).setCanceledOnBackPressed(false).setCancelable(false).create();
                this.mGoUncommonUsedAppDialog = commonDialogCreate;
                if (commonDialogCreate != null && (view = commonDialogCreate.getView()) != null && (textView = (TextView) view.findViewById(xqi.k0)) != null) {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            CommonDialog<?> commonDialog2 = this.mGoUncommonUsedAppDialog;
            if (commonDialog2 != null) {
                commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.showGoUncommonUsedAppDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                        Intrinsics.checkNotNullParameter(dialog, "dialog");
                        super.onDialogClick(dialogName, dialog, which);
                        if (which == -1) {
                            DeviceTabFragmentV4.access$getMViewModel(DeviceTabFragmentV4.this).recordChosenApp();
                        }
                        dialog.dismiss();
                        DeviceTabFragmentV4.this.mGoUncommonUsedAppDialog = null;
                    }
                });
            }
            CommonDialog<?> commonDialog3 = this.mGoUncommonUsedAppDialog;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(getChildFragmentManager());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showGoUncommonUsedAppDialog$lambda$28$lambda$27(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    private final void showLocationDialog() {
        BluetoothPermissionUtil bluetoothPermissionUtil = BluetoothPermissionUtil.INSTANCE;
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
        bluetoothPermissionUtil.turnOnPermissionSetting((BaseActivity) activity, uzi.Z, "android.settings.LOCATION_SOURCE_SETTINGS", new Function2() { // from class: aq6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceTabFragmentV4.showLocationDialog$lambda$34(this.f3350a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showLocationDialog$lambda$34(DeviceTabFragmentV4 this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (LocationExtKt.isGpsEnable(ApplicationExtKt.getApplication())) {
            DeviceTabV4ViewModel.connectDevice$default((DeviceTabV4ViewModel) this$0.getMViewModel(), true, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    private final void showManageAccessoryDialog(final String did) {
        new CommonDialog.c("manageAccessory").setDialogTitle(uzi.e).setDialogDescription(uzi.j).setNegativeText(uzi.c).setNeutralText(uzi.g).setPositiveText(uzi.o).setButtonVertical(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.showManageAccessoryDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -3) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    DeviceTabFragmentV4.this.showDeleteConfirmDialog(did);
                } else if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    DeviceTabFragmentV4.access$getMViewModel(DeviceTabFragmentV4.this).connectDevice(true, did);
                }
            }
        }).showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showPopMedalDialogIfNeed() {
        Logger.d(TAG, "showPopMedalDialogIfNeed shouldPullData = " + ((DeviceTabV4ViewModel) getMViewModel()).shouldPullPopMedalDataFromNetwork());
        if (RegionPreference.INSTANCE.getSyncWeb() && ((DeviceTabV4ViewModel) getMViewModel()).shouldPullPopMedalDataFromNetwork()) {
            MedalManagerExtKt.getInstance(MedalManager.INSTANCE).requestAllTypeMedalPopupList(new Function1() { // from class: mr6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceTabFragmentV4.showPopMedalDialogIfNeed$lambda$47(this.f27123a, (List) obj);
                }
            });
        }
        boolean comeFromMedalDetailPageFromSP = ((DeviceTabV4ViewModel) getMViewModel()).getComeFromMedalDetailPageFromSP();
        Logger.d(TAG, "showPopMedalDialogIfNeed removePoppedMedalData=" + comeFromMedalDetailPageFromSP);
        if (((DeviceTabV4ViewModel) getMViewModel()).popMedalListFromSpIsEmpty()) {
            return;
        }
        if (comeFromMedalDetailPageFromSP) {
            ((DeviceTabV4ViewModel) getMViewModel()).removeMedalAlreadyPoppedFromSp();
        }
        if (((DeviceTabV4ViewModel) getMViewModel()).popMedalListFromSpIsEmpty()) {
            ((DeviceTabV4ViewModel) getMViewModel()).setShouldPullPopMedalDataFromNetwork();
        } else {
            ((DeviceTabV4ViewModel) getMViewModel()).getMedalToPopLiveData().setValue(((DeviceTabV4ViewModel) getMViewModel()).getFirstMedalFromPopMedalDataSP());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showPopMedalDialogIfNeed$lambda$47(DeviceTabFragmentV4 this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d(TAG, "showPopMedalDialogIfNeed popMedalDataList=" + it);
        if (it.isEmpty()) {
            ((DeviceTabV4ViewModel) this$0.getMViewModel()).setShouldPullPopMedalDataFromNetwork();
            return Unit.INSTANCE;
        }
        ((DeviceTabV4ViewModel) this$0.getMViewModel()).savePopMedalListToSp(it);
        ((DeviceTabV4ViewModel) this$0.getMViewModel()).setPopMedalDataAlreadyPulled();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRebindFail(final WearableDeviceModel deviceModel, boolean retry) {
        if (isInvalid()) {
            return;
        }
        CommonDialog<?> commonDialog = this.mRebindDialog;
        if (commonDialog != null && commonDialog.isShowing()) {
            CommonDialog<?> commonDialog2 = this.mRebindDialog;
            Intrinsics.checkNotNull(commonDialog2);
            commonDialog2.dismiss();
        }
        CommonDialog.c cVar = new CommonDialog.c("RebindFail");
        if (retry) {
            cVar.setDialogTitle(uzi.t1).setDialogDescription(uzi.s1).setNegativeText(uzi.c).setPositiveText(uzi.z1);
        } else {
            cVar.setDialogDescription(uzi.r1).setNeutralText(uzi.common_known);
        }
        CommonDialog<?> commonDialogCreate = cVar.create();
        this.mRebindDialog = commonDialogCreate;
        Intrinsics.checkNotNull(commonDialogCreate);
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.showRebindFail.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which != -1) {
                    DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).disconnectDevice(deviceModel.getDid());
                    return;
                }
                DeviceTabFragmentV4.this.mRebindRetryCount++;
                DeviceTabFragmentV4.this.rebindDevice(deviceModel);
            }
        }).showIfNeed(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRemoveFailDialog(final WearableDeviceModel deviceModel, boolean retryDialog) {
        if (isInvalid()) {
            return;
        }
        CommonDialog<?> commonDialog = this.mRemoveFailDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            CommonDialog.c cVar = new CommonDialog.c("RemoveFail");
            if (retryDialog) {
                cVar.setDialogTitle(uzi.w1).setDialogDescription(uzi.x1).setNegativeText(uzi.c).setPositiveText(uzi.z1);
            } else {
                cVar.setDialogDescription(uzi.v1).setNeutralText(uzi.common_known);
            }
            CommonDialog<?> commonDialogCreate = cVar.create();
            this.mRemoveFailDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate);
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.showRemoveFailDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    Logger.i(DeviceTabFragmentV4.TAG, "onDialogClick() which = " + which);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    DeviceTabFragmentV4.this.mRemoveFailDialog = null;
                    DeviceTabFragmentV4.this.mRemoveRetryCount++;
                    if (which == -1) {
                        DeviceTabFragmentV4.this.removeDevice(deviceModel);
                    }
                }
            }).showIfNeed(getChildFragmentManager());
        }
    }

    private final void showWearModeSwitchSuccessDialog(String name, final int mode) {
        new CommonDialog.c("wearModeSwitchSuccess").setDialogTitle(new DialogParams.DialogDescriptionString(getString(uzi.M1))).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getString(uzi.L1, name))).setCustomView(LayoutInflater.from(getContext()).inflate(dui.m, (ViewGroup) null)).setNegativeText(uzi.n0).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4.showWearModeSwitchSuccessDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -2 && mode == 1 && this.mWearableDeviceManager.getCurrentDeviceModel() == 0) {
                    this.showGoToSportDialog();
                }
            }
        }).showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startObservingPopMedalData() {
        ((DeviceTabV4ViewModel) getMViewModel()).getMedalToPopLiveData().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: br6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.startObservingPopMedalData$lambda$20(this.f4509a, (PopMedalData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startObservingPopMedalData$lambda$20(final DeviceTabFragmentV4 this$0, PopMedalData popMedalData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "medalToPopLiveData value=" + popMedalData);
        MedalManager medalManagerExtKt = MedalManagerExtKt.getInstance(MedalManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Intrinsics.checkNotNull(popMedalData);
        medalManagerExtKt.showLatestMedalPopDialog(fragmentActivityRequireActivity, popMedalData, new Function0() { // from class: fr6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceTabFragmentV4.startObservingPopMedalData$lambda$20$lambda$19(this.f18120a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startObservingPopMedalData$lambda$20$lambda$19(DeviceTabFragmentV4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((DeviceTabV4ViewModel) this$0.getMViewModel()).removeMedalAlreadyPoppedFromSp();
        if (((DeviceTabV4ViewModel) this$0.getMViewModel()).popMedalListFromSpIsEmpty()) {
            ((DeviceTabV4ViewModel) this$0.getMViewModel()).setShouldPullPopMedalDataFromNetwork();
        } else {
            ((DeviceTabV4ViewModel) this$0.getMViewModel()).getMedalToPopLiveData().setValue(((DeviceTabV4ViewModel) this$0.getMViewModel()).getFirstMedalFromPopMedalDataSP());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkChosenAppIfNeed() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() && !AppUtil.INSTANCE.isPlayChannel() && ConfigPreference.INSTANCE.getIS_APP_CHOSEN_OPEN()) {
            ((DeviceTabV4ViewModel) getMViewModel()).checkChosenApp(Boolean.TRUE);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTabInfoProvider
    public int deviceCount() {
        return this.mWearableDeviceManager.getDeviceSize();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void firstVisible() {
        super.firstVisible();
        NfcManagerExtKt.getInstance(NfcManager.INSTANCE).loadMasterRegionList();
    }

    @NotNull
    public final BaseMainFragmentDelegate getMBaseFragmentDelegate() {
        BaseMainFragmentDelegate baseMainFragmentDelegate = this.mBaseFragmentDelegate;
        if (baseMainFragmentDelegate != null) {
            return baseMainFragmentDelegate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBaseFragmentDelegate");
        return null;
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTabInfoProvider
    public int index() {
        return 3;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        RegionExtKt.getInstance(RegionManager.INSTANCE).removeCountryChangeListener(this.mCountryChangeListener);
        BluetoothManager bluetoothManager = BluetoothManager.INSTANCE.get();
        a33 a33Var = this.mBluetoothListener;
        Intrinsics.checkNotNull(a33Var);
        bluetoothManager.removeBluetoothStateListener(a33Var);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.mDevicePageStartShowTime) / ((long) 1000);
        MainHelper mainHelper = this.mMainHelper;
        String str = this.DEVICE_TAB_PAGE_NAME;
        String string = getString(uzi.U1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        mainHelper.onetrackRecordTabShowTime(jCurrentTimeMillis, str, string);
        Logger.i(TAG, "devices page show durationSec is " + jCurrentTimeMillis);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        WearableDeviceInfo deviceInfo;
        super.onResume();
        ((DeviceTabV4ViewModel) getMViewModel()).refreshFaceEntranceRedPoint();
        ((DeviceTabV4ViewModel) getMViewModel()).showSystemRedPoint();
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() && !AppUtil.INSTANCE.isPlayChannel() && ConfigPreference.INSTANCE.getIS_APP_CHOSEN_OPEN()) {
            ((DeviceTabV4ViewModel) getMViewModel()).checkChosenApp(Boolean.valueOf(ChooseCommonAppUtil.INSTANCE.getShowCommonAppDialog()));
            if (CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).getIntentStartApp()) {
                CommonDialog<?> commonDialog = this.mChooseAppDialog;
                if (commonDialog != null) {
                    commonDialog.dismiss();
                }
                CommonDialog<?> commonDialog2 = this.mGoUncommonUsedAppDialog;
                if (commonDialog2 != null) {
                    commonDialog2.dismiss();
                }
                CommonDialog<?> commonDialog3 = this.mGoCommonUsedAppDialog;
                if (commonDialog3 != null) {
                    commonDialog3.dismiss();
                }
            }
        }
        WearOSUtil wearOsExtKt = WearOsExtKt.getInstance(WearOSUtil.INSTANCE);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        wearOsExtKt.associate((wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getNodeID());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        try {
            MemoryCache memoryCache = Coil.imageLoader(ApplicationExtKt.getApplication()).getMemoryCache();
            if (memoryCache != null) {
                memoryCache.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RegionExtKt.getInstance(RegionManager.INSTANCE).addCountryChangeListener(this.mCountryChangeListener);
        setActionBarDisplayable(false);
        ((DeviceTabV4ViewModel) getMViewModel()).getShowDisableConnect().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onViewCreated$lambda$2(this.f25344a, (Boolean) obj);
            }
        }));
        ((DeviceTabV4ViewModel) getMViewModel()).loadDevice(true);
        ((DeviceTabV4ViewModel) getMViewModel()).setOnItemClickListener(new Function3() { // from class: rq6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DeviceTabFragmentV4.onViewCreated$lambda$4(this.f32790a, (TabContentItem) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
        clearLiveData();
        ((DeviceTabV4ViewModel) getMViewModel()).getMLoadingFlag().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onViewCreated$lambda$5(this.f33882a, (Boolean) obj);
            }
        }));
        ((DeviceTabV4ViewModel) getMViewModel()).getShowOpenLocationSwitch().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: tq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onViewCreated$lambda$6(this.f34938a, (Boolean) obj);
            }
        }));
        ((DeviceTabV4ViewModel) getMViewModel()).getMGoUncommonUsedAppFlag().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: uq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onViewCreated$lambda$7(this.f36023a, (Boolean) obj);
            }
        }));
        ((DeviceTabV4ViewModel) getMViewModel()).getMUpdateAppSuccessFlag().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onViewCreated$lambda$8(this.f38248a, (Boolean) obj);
            }
        }));
        ((DeviceTabV4ViewModel) getMViewModel()).getMChoiceAppFlag().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onViewCreated$lambda$9(this.f39356a, (Boolean) obj);
            }
        }));
        ((DeviceTabV4ViewModel) getMViewModel()).getShowConnectPermission().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onViewCreated$lambda$10(this.f40423a, (Pair) obj);
            }
        }));
        ((DeviceTabV4ViewModel) getMViewModel()).getExitAccessory().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onViewCreated$lambda$11(this.f41562a, (Pair) obj);
            }
        }));
        ((DeviceTabV4ViewModel) getMViewModel()).getManageAccessory().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ar6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onViewCreated$lambda$12(this.f3375a, (String) obj);
            }
        }));
        ((DeviceTabV4ViewModel) getMViewModel()).getExistAccessoryMode().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onViewCreated$lambda$13(this.f27095a, (Pair) obj);
            }
        }));
        ((DeviceTabV4ViewModel) getMViewModel()).getWearModeSwitchSuccess().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: nq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onViewCreated$lambda$15(this.f28248a, (Pair) obj);
            }
        }));
        ((DeviceTabV4ViewModel) getMViewModel()).getWearModeSwitchSuccessFromApp().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: oq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onViewCreated$lambda$16(this.f29382a, (Boolean) obj);
            }
        }));
        ((DeviceTabV4ViewModel) getMViewModel()).getExitAccessoryModeFromDevice().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: pq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onViewCreated$lambda$17(this.f30637a, (Pair) obj);
            }
        }));
        ((DeviceTabV4ViewModel) getMViewModel()).getBleReconnect().observe(getViewLifecycleOwner(), new DeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qq6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabFragmentV4.onViewCreated$lambda$18(this.f31739a, (ConnectStatus) obj);
            }
        }));
        BluetoothManager.INSTANCE.get().addBluetoothStateListener(this.mBluetoothListener);
        startObservingPopMedalData();
        int dimen = (int) BaseFragmentExtKt.getDimen(this, eli.g);
        NestRecyclerViewItemEffectiveExposeBiz nestRecyclerViewItemEffectiveExposeBiz = new NestRecyclerViewItemEffectiveExposeBiz();
        RecyclerView deviceRvContent = ((l56) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(deviceRvContent, "deviceRvContent");
        NestRecyclerViewItemEffectiveExposeBiz.startTrackItemExpose$default(nestRecyclerViewItemEffectiveExposeBiz, deviceRvContent, dimen, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mDevicePageStartShowTime = System.currentTimeMillis();
        showPopMedalDialogIfNeed();
        NotifyHelperExtKt.getNotificationManagerExport().updateNotificationRemind();
        ((DeviceTabV4ViewModel) getMViewModel()).updateBatteryIfNeed();
        ((DeviceTabV4ViewModel) getMViewModel()).syncDeviceIfNeed();
        ISportAccessApi.DefaultImpls.checkAndDownloadAudioFeedbackResourcesIfNeed$default(SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE), false, null, null, null, 15, null);
    }

    public final void setMBaseFragmentDelegate(@NotNull BaseMainFragmentDelegate baseMainFragmentDelegate) {
        Intrinsics.checkNotNullParameter(baseMainFragmentDelegate, "<set-?>");
        this.mBaseFragmentDelegate = baseMainFragmentDelegate;
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTabInfoProvider
    @NotNull
    public String tabName(int type) {
        if (type == 1) {
            String string = ApplicationExtKt.getApplication().getString(uzi.U1);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        String string2 = ApplicationExtKt.getApplication().getString(uzi.e2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
