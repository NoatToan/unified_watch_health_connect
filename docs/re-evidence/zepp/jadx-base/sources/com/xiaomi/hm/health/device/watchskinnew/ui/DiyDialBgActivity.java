package com.xiaomi.hm.health.device.watchskinnew.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicerecorder.UriGetter;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.ViewUtils;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.StorageUtil;
import com.huami.watchfacesstore.view.clip.ClipImageActivity;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.agps.HMAgpsUpgradeManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.watch_skin.UriUtils;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinDownloader;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinManager;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinProgressView;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinSyncManager;
import com.xiaomi.hm.health.device.watch_skin.watchskincoroutine.WatchSkinError;
import com.xiaomi.hm.health.device.watch_skin.watchskincoroutine.WatchSkinState;
import com.xiaomi.hm.health.device.watch_skin.watchskincoroutine.WatchSkinViewModel;
import com.xiaomi.hm.health.device.watchskinnew.DialLoader;
import com.xiaomi.hm.health.device.watchskinnew.api.WatchSkinAPIKt;
import com.xiaomi.hm.health.device.watchskinnew.bean.Metas;
import com.xiaomi.hm.health.device.watchskinnew.bean.WatchSkinBean;
import com.xiaomi.hm.health.device.watchskinnew.ui.DiyDialBgActivity;
import com.xiaomi.hm.health.fragment.SelectImageFragment;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.GlideRoundTransform;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 £\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\f£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001B\t¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u001c\u0010\u001e\u001a\u00020\u0006*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0006H\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002J\u0010\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0014H\u0002J\u0010\u0010'\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010(\u001a\u00020\u0006H\u0002J\u0010\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0016H\u0002J\u0010\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020.H\u0002J\b\u00100\u001a\u00020\u0006H\u0002J\b\u00101\u001a\u00020\u0006H\u0002J\b\u00102\u001a\u00020\u0014H\u0002J\b\u00103\u001a\u00020\u0006H\u0002J\b\u00104\u001a\u00020\u0006H\u0002J\u0010\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u001bH\u0002J\b\u00107\u001a\u00020\u0014H\u0002J\b\u00108\u001a\u00020\u0014H\u0002J\b\u00109\u001a\u00020\u0014H\u0002J\u0012\u0010<\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010:H\u0014J\b\u0010=\u001a\u00020\u0006H\u0014J\u0018\u0010A\u001a\u00020\"2\u0006\u0010>\u001a\u00020\u00162\u0006\u0010@\u001a\u00020?H\u0016J\u0006\u0010B\u001a\u00020\u0006J\u0006\u0010C\u001a\u00020\u0006J\"\u0010F\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u00162\u0006\u0010E\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010)H\u0014J\u000e\u0010H\u001a\u00020\u00062\u0006\u0010@\u001a\u00020GJ\u000e\u0010H\u001a\u00020\u00062\u0006\u0010@\u001a\u00020IJ\u000e\u0010H\u001a\u00020\u00062\u0006\u0010@\u001a\u00020JR\u001d\u0010P\u001a\u00020K8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001d\u0010U\u001a\u00020Q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010M\u001a\u0004\bS\u0010TR\u001d\u0010Z\u001a\u00020V8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010M\u001a\u0004\bX\u0010YR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010a\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010c\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010`R%\u0010i\u001a\n e*\u0004\u0018\u00010d0d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010M\u001a\u0004\bg\u0010hR%\u0010m\u001a\n e*\u0004\u0018\u00010\u001b0\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010M\u001a\u0004\bk\u0010lR%\u0010r\u001a\n e*\u0004\u0018\u00010n0n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010M\u001a\u0004\bp\u0010qR%\u0010u\u001a\n e*\u0004\u0018\u00010n0n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010M\u001a\u0004\bt\u0010qR\u0016\u0010w\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010gR\u0016\u0010\u001c\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010gR\u0018\u0010{\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010}\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010zR\u0016\u0010\u007f\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010'R\u0018\u0010\u0081\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010'R\u0019\u0010\u0084\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b1\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020Q8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010\u0085\u0001R\u0017\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010\u0087\u0001R\u0019\u0010\u008a\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b&\u0010\u0089\u0001R\u0019\u0010\u008d\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bt\u0010\u008c\u0001R\u0019\u0010\u0090\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bS\u0010\u008f\u0001R\u0017\u0010\u0091\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010zR \u0010\u0094\u0001\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bp\u0010M\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u0096\u0001\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u0018\u0010M\u001a\u0006\b\u0095\u0001\u0010\u0093\u0001R \u0010\u0098\u0001\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u0019\u0010M\u001a\u0006\b\u0097\u0001\u0010\u0093\u0001R \u0010\u009a\u0001\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u001a\u0010M\u001a\u0006\b\u0099\u0001\u0010\u0093\u0001R \u0010\u009c\u0001\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bN\u0010M\u001a\u0006\b\u009b\u0001\u0010\u0093\u0001R\u001a\u0010 \u0001\u001a\u00030\u009d\u00018V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001¨\u0006©\u0001"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lkotlinx/coroutines/CoroutineScope;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/watch_skin/watchskincoroutine/WatchSkinError;", "error", "", "h0", "l0", "k0", "g0", "c0", "a0", "R", "initView", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Landroid/widget/ImageView;", "imageView", "Q", "", "dialName", "", "N", "y", "z", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/xiaomi/hm/health/device/watch_skin/WatchSkinProgressView;", "state", "text", "o0", "V", "Ljava/io/File;", "file", "", "n0", "filePath", "Landroid/net/Uri;", "t", "Z", "P", "Landroid/content/Intent;", "data", "O", Constant.PAI_KEY_DAILY_PAI, SOAP.XMLNS, "", "r", "t0", DTransferConstants.SEARCH_KEY, "J", "p0", "s0", "progressView", "d0", "K", "M", "H", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "openGallery", "takePhoto", "requestCode", "resultCode", "onActivityResult", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "onEventMainThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceFwUpgradeEvent;", "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncDataEvent;", "Lkotlinx/coroutines/Job;", "a", "Lkotlin/Lazy;", "B", "()Lkotlinx/coroutines/Job;", "job", "Lcom/huami/devicex/manager/DeviceManagerApi;", "b", "v", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "c", "w", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/xiaomi/hm/health/device/watch_skin/watchskincoroutine/WatchSkinViewModel;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/watch_skin/watchskincoroutine/WatchSkinViewModel;", "viewModel", "e", "Landroid/widget/ImageView;", "bgImg", "f", "transparentImg", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "g", LogUtil.I, "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "h", "L", "()Lcom/xiaomi/hm/health/device/watch_skin/WatchSkinProgressView;", "syncBtn", "Landroid/widget/TextView;", "i", "x", "()Landroid/widget/TextView;", "errorTipTv", z.j, "u", "changeBgBtn", hl.k, "currPosition", "l", "m", "Ljava/lang/String;", "iconPath", GoogleApiAvailabilityLight.b, "croppedPath", "o", "pageEnable", com.google.android.exoplayer2.text.ttml.b.r, "canBack", "Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBean;", "Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBean;", "currDialBean", "Lcom/huami/devicex/manager/DeviceManagerApi;", "mDeviceManager", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Landroid/os/Handler;", "Landroid/os/Handler;", "mHandler", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "mRunnable", "Lcom/xiaomi/hm/health/device/watch_skin/WatchSkinDownloader;", "Lcom/xiaomi/hm/health/device/watch_skin/WatchSkinDownloader;", "downloader", "downloadedSkinPath", "G", "()Ljava/lang/String;", "mSyncSkinStr", "F", "mDownloadFailStr", "C", "mConnectingStr", "E", "mDataSyncingStr", LogUtil.D, "mDataSyncFailStr", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "DiyDialAdapter", "DiyDialHolder", "DiyItemDecoration", "MyDownloadListener", "SyncProgressListener", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DiyDialBgActivity extends AppCompatActivity implements CoroutineScope, KoinComponent {

    @NotNull
    private static final String C = "position";
    private static final int D = 10;
    private static final int E = 72;
    private static final int F = 132;

    @NotNull
    public static final String FOLDER_CAMERA = "dial_bg";
    private static final int G = 60;
    private static final int H = 120;
    private static final float I = 20.0f;

    @NotNull
    public static final String ID_58 = "60158";

    @NotNull
    public static final String ID_59 = "60159";

    @NotNull
    public static final String ID_60 = "60160";
    private static final int J = 0;
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 3;
    private static final int N = 4;
    private static final int O = 5;
    private static final int P = 6;
    private static final int Q = 7;
    private static final int R = 1;
    public static final int REQ_CROP = 1026;
    public static final int REQ_SELECT_IMAGE = 1024;
    public static final int REQ_TAKE_PHOTO = 1025;
    private static final long T = 30000;

    @NotNull
    public static final String TAG = "DiyDialBgActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataSyncingStr;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataSyncFailStr;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy job = LazyKt__LazyJVMKt.lazy(e.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private WatchSkinViewModel viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ImageView bgImg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ImageView transparentImg;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy recyclerView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncBtn;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy errorTipTv;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy changeBgBtn;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int currPosition;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int state;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private String iconPath;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private String croppedPath;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean pageEnable;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean canBack;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private WatchSkinBean currDialBean;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final DeviceManagerApi mDeviceManager;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private Handler mHandler;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private Runnable mRunnable;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private WatchSkinDownloader downloader;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private String downloadedSkinPath;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSyncSkinStr;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDownloadFailStr;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy mConnectingStr;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ArrayList<WatchSkinBean> S = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010/J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u0016\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\rR\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\rR\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\rR\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\rR\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\rR\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\rR\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\rR\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\rR\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\rR\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\rR\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\rR\u0016\u0010+\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0017R&\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "position", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBean;", "Lkotlin/collections/ArrayList;", "dials", "", WebConstant.QueryParam.LAUNCH, "BATTERY_LEVEL", LogUtil.I, "CINCO_ICON_HEIGHT", "CINCO_ICON_WIDTH", "CINCO_ITEM_HEIGHT", "CINCO_ITEM_WIDTH", "", "CONNECT_TIMEOUT", "J", "", "FOLDER_CAMERA", "Ljava/lang/String;", "ID_58", "ID_59", "ID_60", "", "ITEM_GAP", "F", "KEY_POSITION", "REQUEST_BLE_ENABLE", "REQ_CROP", "REQ_SELECT_IMAGE", "REQ_TAKE_PHOTO", "STATE_AGPS_UPGRADING", "STATE_CONNECTING", "STATE_DOWNLOADING", "STATE_FAIL", "STATE_INIT", "STATE_READY", "STATE_SYNC_DATA", "STATE_SYNC_SKIN", "TAG", "diyDials", "Ljava/util/ArrayList;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, int position, @NotNull ArrayList<WatchSkinBean> dials) {
            if (dials.isEmpty()) {
                return;
            }
            DialLoader.INSTANCE.getInstance().setCurrentPage(2);
            DiyDialBgActivity.S.clear();
            DiyDialBgActivity.S.addAll(dials);
            Intent intent = new Intent(context, (Class<?>) DiyDialBgActivity.class);
            intent.putExtra("position", position);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u001c\u0010\r\u001a\u00020\f2\n\u0010\n\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity$DiyDialAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity$DiyDialHolder;", "Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "<init>", "(Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class DiyDialAdapter extends RecyclerView.Adapter<DiyDialHolder> {
        public DiyDialAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DiyDialBgActivity diyDialBgActivity, int i, DiyDialAdapter diyDialAdapter, View view) {
            if (diyDialBgActivity.pageEnable) {
                diyDialBgActivity.currPosition = i;
                if (TextUtils.isEmpty(diyDialBgActivity.croppedPath)) {
                    DisplayConfig.ConfigBuilder configBuilderAsBitmap = HMImageLoader.with(diyDialBgActivity.I().getContext()).load(((WatchSkinBean) DiyDialBgActivity.S.get(i)).getImage()).asBitmap();
                    ImageView imageView = diyDialBgActivity.bgImg;
                    Objects.requireNonNull(imageView);
                    configBuilderAsBitmap.into(imageView);
                }
                String name = ((WatchSkinBean) DiyDialBgActivity.S.get(i)).getName();
                if (name != null) {
                    if (diyDialBgActivity.N(name) != -1) {
                        ImageView imageView2 = diyDialBgActivity.transparentImg;
                        Objects.requireNonNull(imageView2);
                        imageView2.setImageResource(diyDialBgActivity.N(name));
                    } else {
                        DisplayConfig.ConfigBuilder configBuilderWith = HMImageLoader.with((FragmentActivity) diyDialBgActivity);
                        Metas metas = ((WatchSkinBean) DiyDialBgActivity.S.get(diyDialBgActivity.currPosition)).getMetas();
                        DisplayConfig.ConfigBuilder configBuilderLoad = configBuilderWith.load(metas == null ? null : metas.getTransparentBg());
                        ImageView imageView3 = diyDialBgActivity.transparentImg;
                        Objects.requireNonNull(imageView3);
                        configBuilderLoad.into(imageView3);
                    }
                }
                diyDialAdapter.notifyDataSetChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return DiyDialBgActivity.S.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull DiyDialHolder holder, final int position) {
            holder.setSelected(position == DiyDialBgActivity.this.currPosition);
            holder.getImageView().setImageResource(R.drawable.icon_default_cinco_dial_list);
            HMImageLoader.with(DiyDialBgActivity.this.I().getContext()).load(((WatchSkinBean) DiyDialBgActivity.S.get(position)).getImage()).asBitmap().into(holder.getImageView());
            View view = holder.itemView;
            final DiyDialBgActivity diyDialBgActivity = DiyDialBgActivity.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: tb1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DiyDialBgActivity.DiyDialAdapter.b(diyDialBgActivity, position, this, view2);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public DiyDialHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            return DiyDialBgActivity.this.new DiyDialHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.watch_skin_item, parent, false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity$DiyDialHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "selected", "", "setSelected", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "imageView", "b", "selectedImg", "Landroid/view/View;", "c", "Landroid/view/View;", "selectedBg", "itemView", "<init>", "(Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity;Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class DiyDialHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ImageView imageView;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final ImageView selectedImg;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final View selectedBg;

        public DiyDialHolder(View view) {
            super(view);
            ImageView imageView = (ImageView) view.findViewById(R.id.thumbnail_img);
            this.imageView = imageView;
            ImageView imageView2 = (ImageView) view.findViewById(R.id.selected_img);
            this.selectedImg = imageView2;
            View viewFindViewById = view.findViewById(R.id.selected_bg);
            this.selectedBg = viewFindViewById;
            if (HMDialListActivityKt.supportDiy(DiyDialBgActivity.this.deviceSource)) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                DialConfig.Companion companion = DialConfig.INSTANCE;
                ImageSize imageSizeDialItemSize = companion.dialItemSize(DiyDialBgActivity.this.deviceSource);
                layoutParams.width = DiyDialBgActivity.this.s(imageSizeDialItemSize.getWidth());
                layoutParams.height = DiyDialBgActivity.this.s(imageSizeDialItemSize.getHeight());
                Unit unit = Unit.INSTANCE;
                view.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                ImageSize imageSizeDialItemImageSize = companion.dialItemImageSize(DiyDialBgActivity.this.deviceSource);
                layoutParams2.width = DiyDialBgActivity.this.s(imageSizeDialItemImageSize.getWidth());
                layoutParams2.height = DiyDialBgActivity.this.s(imageSizeDialItemImageSize.getHeight());
                imageView.setLayoutParams(layoutParams2);
                ImageSize imageSizeDialItemImageSize2 = companion.dialItemImageSize(DiyDialBgActivity.this.deviceSource);
                float fDialBgRadius = companion.dialBgRadius(DiyDialBgActivity.this.deviceSource) / companion.dialBgSize(DiyDialBgActivity.this.deviceSource).getWidth();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(DiyDialBgActivity.this.r(fDialBgRadius * imageSizeDialItemImageSize2.getWidth()));
                gradientDrawable.setStroke(DiyDialBgActivity.this.s(2), DiyDialBgActivity.this.getResources().getColor(R.color.dark_sky_blue));
                viewFindViewById.setBackground(gradientDrawable);
                ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
                ImageSize imageSizeDialItemImageSize3 = companion.dialItemImageSize(DiyDialBgActivity.this.deviceSource);
                layoutParams3.width = DiyDialBgActivity.this.s(imageSizeDialItemImageSize3.getWidth());
                layoutParams3.height = DiyDialBgActivity.this.s(imageSizeDialItemImageSize3.getHeight());
                viewFindViewById.setLayoutParams(layoutParams3);
            }
            imageView2.setVisibility(0);
        }

        @NotNull
        public final ImageView getImageView() {
            return this.imageView;
        }

        public final void setSelected(boolean selected) {
            this.selectedImg.setVisibility(selected ? 0 : 8);
            this.selectedBg.setVisibility(selected ? 0 : 8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity$DiyItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "", "a", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "getItemOffsets", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", LogUtil.I, "itemWidth", "c", "F", "paddingRight", GoogleApiAvailabilityLight.a, "imageGap", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class DiyItemDecoration extends RecyclerView.ItemDecoration {
        public static final int GAP_COUNT = 4;
        public static final int RECYCLER_PADDING = 16;
        public static final float RECYCLER_PADDING_LEFT = 12.0f;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int itemWidth;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final float paddingRight;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final float imageGap;

        public DiyItemDecoration(@NotNull Context context, @NotNull HMDeviceSource hMDeviceSource) {
            this.context = context;
            DialConfig.Companion companion = DialConfig.INSTANCE;
            int width = companion.dialItemSize(hMDeviceSource).getWidth();
            this.itemWidth = width;
            float deviceGapPaddingRight = companion.getDeviceGapPaddingRight(hMDeviceSource);
            this.paddingRight = deviceGapPaddingRight;
            this.imageGap = ((((a() - (width * 3)) - 16) - 12.0f) - deviceGapPaddingRight) / 4;
        }

        private final float a() {
            Object systemService = this.context.getSystemService("window");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels / displayMetrics.density;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                outRect.set((int) ViewUtils.dp2px(this.context, 12.0f), 0, (int) ViewUtils.dp2px(this.context, this.imageGap), 0);
            } else if (childAdapterPosition == state.getItemCount() - 1) {
                outRect.set((int) ViewUtils.dp2px(this.context, this.imageGap), 0, 0, 0);
            } else {
                outRect.set((int) ViewUtils.dp2px(this.context, this.imageGap), 0, (int) ViewUtils.dp2px(this.context, this.imageGap), 0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016R'\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity$MyDownloadListener;", "Lcom/xiaomi/hm/health/device/watch_skin/WatchSkinDownloader$DownloadProgressListener;", "Lcom/xiaomi/hm/health/device/watch_skin/WatchSkinProgressView;", "", "state", "", "text", "", "i", "onStart", "", "progress", "onProgress", "onFailure", "onSuccess", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "ref", "activity", "<init>", "(Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class MyDownloadListener implements WatchSkinDownloader.DownloadProgressListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final WeakReference<DiyDialBgActivity> ref;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onSuccess";
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
                return "onError: " + this.a;
            }
        }

        public MyDownloadListener(@NotNull DiyDialBgActivity diyDialBgActivity) {
            this.ref = new WeakReference<>(diyDialBgActivity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(DiyDialBgActivity diyDialBgActivity, View view) {
            diyDialBgActivity.state = 3;
            diyDialBgActivity.x().setText("");
            WatchSkinDownloader watchSkinDownloader = diyDialBgActivity.downloader;
            Objects.requireNonNull(watchSkinDownloader);
            watchSkinDownloader.startDownload();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean f(DiyDialBgActivity diyDialBgActivity) {
            String strJ = diyDialBgActivity.J();
            WatchSkinBean watchSkinBean = diyDialBgActivity.currDialBean;
            Objects.requireNonNull(watchSkinBean);
            return Boolean.valueOf(WatchSkinManager.saveInfo2Xml(strJ, watchSkinBean.getName()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(Boolean bool) {
            HMLog.debug(DiyDialBgActivity.TAG, a.a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(Throwable th) {
            HMLog.debug(DiyDialBgActivity.TAG, new b(th));
        }

        private final void i(WatchSkinProgressView watchSkinProgressView, int i, String str) {
            DiyDialBgActivity diyDialBgActivity = this.ref.get();
            if (diyDialBgActivity == null) {
                return;
            }
            watchSkinProgressView.setState(i, str);
            diyDialBgActivity.pageEnable = i == 1;
            diyDialBgActivity.canBack = i == 1;
            diyDialBgActivity.u().setEnabled(i == 1);
        }

        @NotNull
        public final WeakReference<DiyDialBgActivity> getRef() {
            return this.ref;
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinDownloader.DownloadProgressListener
        public void onFailure() {
            final DiyDialBgActivity diyDialBgActivity = this.ref.get();
            if (diyDialBgActivity == null) {
                return;
            }
            i(diyDialBgActivity.L(), 1, diyDialBgActivity.getString(R.string.download_watch_skin_fail));
            diyDialBgActivity.L().setProgress(0.0f);
            diyDialBgActivity.L().setVisibility(0);
            if (NetUtil.isNetworkConnected(DeviceXFunctionsKt.getDeviceXApplication())) {
                diyDialBgActivity.x().setText(diyDialBgActivity.F());
            } else {
                diyDialBgActivity.x().setText(diyDialBgActivity.getString(R.string.watch_skin_network_error));
            }
            diyDialBgActivity.state = 6;
            diyDialBgActivity.L().setOnClickListener(new View.OnClickListener() { // from class: ub1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DiyDialBgActivity.MyDownloadListener.e(diyDialBgActivity, view);
                }
            });
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinDownloader.DownloadProgressListener
        public void onProgress(float progress) {
            WatchSkinProgressView watchSkinProgressViewL;
            DiyDialBgActivity diyDialBgActivity = this.ref.get();
            if (diyDialBgActivity == null || (watchSkinProgressViewL = diyDialBgActivity.L()) == null) {
                return;
            }
            watchSkinProgressViewL.setProgress(progress);
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinDownloader.DownloadProgressListener
        public void onStart() {
            DiyDialBgActivity diyDialBgActivity = this.ref.get();
            if (diyDialBgActivity == null) {
                return;
            }
            diyDialBgActivity.state = 3;
            diyDialBgActivity.L().setProgress(0.0f);
            i(diyDialBgActivity.L(), 3, diyDialBgActivity.getString(R.string.downloading_watch_skin));
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinDownloader.DownloadProgressListener
        public void onSuccess() {
            final DiyDialBgActivity diyDialBgActivity = this.ref.get();
            if (diyDialBgActivity == null) {
                return;
            }
            int value = diyDialBgActivity.deviceSource.getValue();
            WatchSkinBean watchSkinBean = diyDialBgActivity.currDialBean;
            Objects.requireNonNull(watchSkinBean);
            WatchSkinAPIKt.reportDownload(value, watchSkinBean.getId().intValue());
            diyDialBgActivity.d0(diyDialBgActivity.L());
            Observable.fromCallable(new Callable() { // from class: vb1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return DiyDialBgActivity.MyDownloadListener.f(diyDialBgActivity);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new Action1() { // from class: wb1
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    DiyDialBgActivity.MyDownloadListener.g((Boolean) obj);
                }
            }, new Action1() { // from class: xb1
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    DiyDialBgActivity.MyDownloadListener.h((Throwable) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\u001c\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0016R'\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\n0\n0\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010#\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity$SyncProgressListener;", "Lcom/xiaomi/hm/health/device/watch_skin/WatchSkinSyncManager$SyncProgressListener;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/watch_skin/WatchSkinProgressView;", "", "state", "", "text", "", GoogleApiAvailabilityLight.b, "Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity;", "activity", "l", "resultCode", "i", "g", "h", "e", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "onProgress", "onStart", "onStop", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/ref/WeakReference;", "f", "()Ljava/lang/ref/WeakReference;", "ref", "Lcom/huami/devicex/manager/DeviceManagerApi;", "b", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "(Lcom/xiaomi/hm/health/device/watchskinnew/ui/DiyDialBgActivity;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class SyncProgressListener implements WatchSkinSyncManager.SyncProgressListener, KoinComponent {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final WeakReference<DiyDialBgActivity> ref;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Lazy deviceManagerApi;

        /* JADX WARN: Multi-variable type inference failed */
        public SyncProgressListener(@NotNull DiyDialBgActivity diyDialBgActivity) {
            this.ref = new WeakReference<>(diyDialBgActivity);
            LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
            final Qualifier qualifier = null;
            final Object[] objArr = 0 == true ? 1 : 0;
            this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.watchskinnew.ui.DiyDialBgActivity$SyncProgressListener$special$$inlined$inject$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: invoke */
                public final DeviceManagerApi getA() {
                    KoinComponent koinComponent = this;
                    return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
                }
            });
        }

        private final DeviceManagerApi d() {
            return (DeviceManagerApi) this.deviceManagerApi.getValue();
        }

        private final String e(DiyDialBgActivity activity) {
            return activity.getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_music : R.string.local_watch_skin_music_band);
        }

        private final String g(DiyDialBgActivity activity) {
            return activity.getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_sporting : R.string.local_watch_skin_sporting_band);
        }

        private final String h(DiyDialBgActivity activity) {
            return activity.getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_timing : R.string.local_watch_skin_timing_band);
        }

        private final void i(final DiyDialBgActivity activity, int resultCode) {
            n(activity.L(), 1, activity.G());
            activity.state = 6;
            if (!d().isBluetoothEnable()) {
                activity.state = 6;
                activity.x().setText(activity.getString(R.string.watch_skin_open_bluetooth));
                activity.L().setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.watchskinnew.ui.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DiyDialBgActivity.SyncProgressListener.k(activity, view);
                    }
                });
                return;
            }
            if (resultCode == 1) {
                activity.x().setText(activity.D());
            } else if (resultCode == 2) {
                activity.x().setText(g(activity));
            } else if (resultCode == 3) {
                activity.x().setText(h(activity));
            } else if (resultCode == 4) {
                activity.x().setText(e(activity));
            }
            activity.L().setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.watchskinnew.ui.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DiyDialBgActivity.SyncProgressListener.j(activity, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(DiyDialBgActivity diyDialBgActivity, View view) {
            diyDialBgActivity.s0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(DiyDialBgActivity diyDialBgActivity, View view) {
            diyDialBgActivity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
        }

        private final void l(final DiyDialBgActivity activity) {
            n(activity.L(), 1, activity.getString(R.string.watch_skin_sync_done));
            activity.x().setText("");
            activity.state = 2;
            activity.L().setOnClickListener(null);
            activity.pageEnable = false;
            activity.canBack = true;
            activity.u().setEnabled(false);
            Handler handler = activity.mHandler;
            Objects.requireNonNull(handler);
            handler.postDelayed(new Runnable() { // from class: com.xiaomi.hm.health.device.watchskinnew.ui.c
                @Override // java.lang.Runnable
                public final void run() {
                    DiyDialBgActivity.SyncProgressListener.m(activity);
                }
            }, 3000L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(DiyDialBgActivity diyDialBgActivity) {
            diyDialBgActivity.finish();
        }

        private final void n(WatchSkinProgressView watchSkinProgressView, int i, String str) {
            DiyDialBgActivity diyDialBgActivity = this.ref.get();
            if (diyDialBgActivity == null) {
                return;
            }
            watchSkinProgressView.setState(i, str);
            diyDialBgActivity.pageEnable = i == 1;
            diyDialBgActivity.canBack = i == 1;
            diyDialBgActivity.u().setEnabled(i == 1);
        }

        @NotNull
        public final WeakReference<DiyDialBgActivity> f() {
            return this.ref;
        }

        @Override // org.koin.core.component.KoinComponent
        @NotNull
        public Koin getKoin() {
            return KoinComponent.DefaultImpls.getKoin(this);
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinSyncManager.SyncProgressListener
        public void onProgress(@NotNull Progress progress) {
            DiyDialBgActivity diyDialBgActivity = this.ref.get();
            if (diyDialBgActivity == null) {
                return;
            }
            int i = progress.total;
            diyDialBgActivity.L().setProgress(i == 0 ? 0.0f : progress.progress / i);
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinSyncManager.SyncProgressListener
        public void onStart() {
            DiyDialBgActivity diyDialBgActivity = this.ref.get();
            if (diyDialBgActivity == null) {
                return;
            }
            diyDialBgActivity.L().setProgress(0.0f);
            n(diyDialBgActivity.L(), 3, diyDialBgActivity.getString(R.string.watch_skin_syncing));
            diyDialBgActivity.x().setText("");
            diyDialBgActivity.state = 5;
        }

        @Override // com.xiaomi.hm.health.device.watch_skin.WatchSkinSyncManager.SyncProgressListener
        public void onStop(int resultCode) {
            DiyDialBgActivity diyDialBgActivity = this.ref.get();
            if (diyDialBgActivity == null) {
                return;
            }
            if (resultCode == 0) {
                l(diyDialBgActivity);
            } else {
                i(diyDialBgActivity, resultCode);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WatchSkinError.values().length];
            iArr[WatchSkinError.SPORT_ONGOING.ordinal()] = 1;
            iArr[WatchSkinError.TIME_ONGOING.ordinal()] = 2;
            iArr[WatchSkinError.MUSIC_ONGOING.ordinal()] = 3;
            iArr[WatchSkinError.STORAGE_FULL.ordinal()] = 4;
            iArr[WatchSkinError.FAIL.ordinal()] = 5;
            iArr[WatchSkinError.SUCCESS.ordinal()] = 6;
            iArr[WatchSkinError.START.ordinal()] = 7;
            iArr[WatchSkinError.FW_LOW.ordinal()] = 8;
            iArr[WatchSkinError.BATTERY_LOW.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HMDeviceSource.values().length];
            iArr2[HMDeviceSource.MILI_FALCON.ordinal()] = 1;
            iArr2[HMDeviceSource.MILI_FALCON_W.ordinal()] = 2;
            iArr2[HMDeviceSource.MILI_FALCON_L.ordinal()] = 3;
            iArr2[HMDeviceSource.MILI_FALCON_WL.ordinal()] = 4;
            iArr2[HMDeviceSource.MILI_FALCON_DISNEY.ordinal()] = 5;
            iArr2[HMDeviceSource.MILI_KESTREL.ordinal()] = 6;
            iArr2[HMDeviceSource.MILI_KESTREL_L.ordinal()] = 7;
            iArr2[HMDeviceSource.MILI_KESTREL_WL.ordinal()] = 8;
            iArr2[HMDeviceSource.MILI_KESTREL_W.ordinal()] = 9;
            iArr2[HMDeviceSource.MILI_HAWK.ordinal()] = 10;
            iArr2[HMDeviceSource.MILI_HAWK_L.ordinal()] = 11;
            iArr2[HMDeviceSource.MILI_HAWK_WL.ordinal()] = 12;
            iArr2[HMDeviceSource.MILI_HAWK_W.ordinal()] = 13;
            iArr2[HMDeviceSource.MILI_HAWK_SWK.ordinal()] = 14;
            iArr2[HMDeviceSource.MILI_HAWK_SWK_W.ordinal()] = 15;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<TextView> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) DiyDialBgActivity.this.findViewById(R.id.change_bg_btn);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<TextView> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) DiyDialBgActivity.this.findViewById(R.id.error_tips_tv);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "ret: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.watchskinnew.ui.DiyDialBgActivity$handleGallery$2", f = "DiyDialBgActivity.kt", i = {}, l = {RtspMessageChannel.i}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Intent c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.watchskinnew.ui.DiyDialBgActivity$handleGallery$2$1", f = "DiyDialBgActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ DiyDialBgActivity b;
            public final /* synthetic */ Uri c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DiyDialBgActivity diyDialBgActivity, Uri uri, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = diyDialBgActivity;
                this.c = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ClipImageActivity.Companion companion = ClipImageActivity.INSTANCE;
                DiyDialBgActivity diyDialBgActivity = this.b;
                String strValueOf = String.valueOf(this.c);
                String str = this.b.croppedPath;
                DialConfig.Companion companion2 = DialConfig.INSTANCE;
                companion.actionStart(diyDialBgActivity, strValueOf, str, companion2.getCropSize(this.b.deviceSource), (32 & 16) != 0 ? 0 : companion2.getCropRadius(this.b.deviceSource), (32 & 32) != 0 ? null : null, 1026);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Intent intent, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DiyDialBgActivity.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Uri uriT;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    String string = FileUtils.getAppFileDir(DeviceXFunctionsKt.getDeviceXApplication()).toString();
                    String str = File.separator;
                    uriT = DiyDialBgActivity.this.t(string + str + "dial_bg" + str + System.currentTimeMillis() + ".png");
                } catch (Exception unused) {
                    uriT = null;
                }
                UriUtils.INSTANCE.savePhotoFromUriToUri(DiyDialBgActivity.this, this.c.getData(), uriT);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(DiyDialBgActivity.this, uriT, null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<CompletableJob> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob getA() {
            return JobKt__JobKt.d(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return DiyDialBgActivity.this.getString(R.string.device_connecting);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return DiyDialBgActivity.this.getString(R.string.watch_skin_sync_fail);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return DiyDialBgActivity.this.getString(R.string.watch_data_syncing);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return DiyDialBgActivity.this.getString(R.string.try_again);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return DiyDialBgActivity.this.getString(R.string.sync_watch_skin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onActivityResult, requstCode: " + this.a + ", resultCode: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "can not sync for low battery.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "bluetooth disable.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "device is connecting.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "data syncing.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "agps upgrading.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public static final q a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "ready to sync skin.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<RecyclerView> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclerView getA() {
            return (RecyclerView) DiyDialBgActivity.this.findViewById(R.id.recycler_view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/WatchSkinProgressView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<WatchSkinProgressView> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchSkinProgressView getA() {
            return (WatchSkinProgressView) DiyDialBgActivity.this.findViewById(R.id.sync_apply_btn);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiyDialBgActivity() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.watchskinnew.ui.DiyDialBgActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.watchskinnew.ui.DiyDialBgActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr2, objArr3);
            }
        });
        this.recyclerView = LazyKt__LazyJVMKt.lazy(new r());
        this.syncBtn = LazyKt__LazyJVMKt.lazy(new s());
        this.errorTipTv = LazyKt__LazyJVMKt.lazy(new b());
        this.changeBgBtn = LazyKt__LazyJVMKt.lazy(new a());
        this.state = 4;
        this.pageEnable = true;
        this.canBack = true;
        DeviceManagerApi deviceManagerApiV = v();
        this.mDeviceManager = deviceManagerApiV;
        this.deviceSource = deviceManagerApiV.getBoundDeviceSource(HMDeviceType.MILI);
        this.mSyncSkinStr = LazyKt__LazyJVMKt.lazy(new j());
        this.mDownloadFailStr = LazyKt__LazyJVMKt.lazy(new i());
        this.mConnectingStr = LazyKt__LazyJVMKt.lazy(new f());
        this.mDataSyncingStr = LazyKt__LazyJVMKt.lazy(new h());
        this.mDataSyncFailStr = LazyKt__LazyJVMKt.lazy(new g());
    }

    private final int A() {
        if (Language.isSimplifiedChinese()) {
            return R.drawable.icon_60160_simple;
        }
        return Language.isTraditionalChinese() ? R.drawable.icon_60160_traditional : R.drawable.icon_60160;
    }

    private final Job B() {
        return (Job) this.job.getValue();
    }

    private final String C() {
        return (String) this.mConnectingStr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String D() {
        return (String) this.mDataSyncFailStr.getValue();
    }

    private final String E() {
        return (String) this.mDataSyncingStr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String F() {
        return (String) this.mDownloadFailStr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String G() {
        return (String) this.mSyncSkinStr.getValue();
    }

    private final String H() {
        return getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_music : R.string.local_watch_skin_music_band);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView I() {
        return (RecyclerView) this.recyclerView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String J() {
        String str = this.downloadedSkinPath;
        Objects.requireNonNull(str);
        File file = new File(str);
        if (!file.exists()) {
            HMLog.debug(TAG, new c(file.getParentFile().mkdirs()));
        }
        return file.getParent();
    }

    private final String K() {
        return getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_sporting : R.string.local_watch_skin_sporting_band);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WatchSkinProgressView L() {
        return (WatchSkinProgressView) this.syncBtn.getValue();
    }

    private final String M() {
        return getString(HMDeviceConfig.hasBoundWatch() ? R.string.local_watch_skin_timing : R.string.local_watch_skin_timing_band);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int N(String dialName) {
        switch (dialName.hashCode()) {
            case 51348890:
                if (dialName.equals(ID_58)) {
                    return y();
                }
                return -1;
            case 51348891:
                if (dialName.equals(ID_59)) {
                    return z();
                }
                return -1;
            case 51348913:
                if (dialName.equals(ID_60)) {
                    return A();
                }
                return -1;
            default:
                return -1;
        }
    }

    private final void O(Intent data) {
        if (TextUtils.isEmpty(data.getDataString())) {
            return;
        }
        String string = FileUtils.getAppFileDir(DeviceXFunctionsKt.getDeviceXApplication()).toString();
        String str = File.separator;
        this.croppedPath = string + str + "dial_bg" + str + System.currentTimeMillis() + ".png";
        File file = new File(this.croppedPath);
        if (file.getParentFile().exists()) {
            for (File file2 : file.getParentFile().listFiles()) {
                file2.delete();
            }
        } else {
            file.getParentFile().mkdirs();
        }
        kotlinx.coroutines.e.f(this, null, null, new d(data, null), 3, null);
    }

    private final void P() {
        Uri uriT = t(this.iconPath);
        String string = FileUtils.getAppFileDir(DeviceXFunctionsKt.getDeviceXApplication()).toString();
        String str = File.separator;
        this.croppedPath = string + str + "dial_bg" + str + System.currentTimeMillis() + ".png";
        File file = new File(this.croppedPath);
        if (file.getParentFile().exists()) {
            for (File file2 : file.getParentFile().listFiles()) {
                file2.delete();
            }
        } else {
            file.getParentFile().mkdirs();
        }
        ClipImageActivity.Companion companion = ClipImageActivity.INSTANCE;
        String string2 = uriT.toString();
        String str2 = this.croppedPath;
        DialConfig.Companion companion2 = DialConfig.INSTANCE;
        companion.actionStart(this, string2, str2, companion2.getCropSize(this.deviceSource), (32 & 16) != 0 ? 0 : companion2.getCropRadius(this.deviceSource), (32 & 32) != 0 ? null : null, 1026);
    }

    private final void Q(HMDeviceSource deviceSource, ImageView imageView) {
        DialConfig.Companion companion = DialConfig.INSTANCE;
        ImageSize imageSizeDeviceImgSize = companion.deviceImgSize(deviceSource);
        ImageSize imageSizeDialImgSize = companion.dialImgSize(deviceSource);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = s(imageSizeDeviceImgSize.getWidth());
        layoutParams.height = s(imageSizeDeviceImgSize.getHeight());
        Unit unit = Unit.INSTANCE;
        imageView.setLayoutParams(layoutParams);
        int i2 = R.id.cinco_container;
        FrameLayout frameLayout = (FrameLayout) findViewById(i2);
        ViewGroup.LayoutParams layoutParams2 = ((FrameLayout) findViewById(i2)).getLayoutParams();
        layoutParams2.width = s(imageSizeDeviceImgSize.getWidth());
        layoutParams2.height = s(imageSizeDeviceImgSize.getHeight());
        frameLayout.setLayoutParams(layoutParams2);
        int i3 = R.id.cinco_bg_img;
        ImageView imageView2 = (ImageView) findViewById(i3);
        ViewGroup.LayoutParams layoutParams3 = ((ImageView) findViewById(i3)).getLayoutParams();
        layoutParams3.width = s(imageSizeDialImgSize.getWidth());
        layoutParams3.height = s(imageSizeDialImgSize.getHeight());
        imageView2.setLayoutParams(layoutParams3);
        int i4 = R.id.cinco_transparent_img;
        ImageView imageView3 = (ImageView) findViewById(i4);
        ViewGroup.LayoutParams layoutParams4 = ((ImageView) findViewById(i4)).getLayoutParams();
        layoutParams4.width = s(imageSizeDialImgSize.getWidth());
        layoutParams4.height = s(imageSizeDialImgSize.getHeight());
        imageView3.setLayoutParams(layoutParams4);
        imageView.setImageResource(companion.deviceImgResId(deviceSource));
    }

    private final void R() {
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mRunnable = new Runnable() { // from class: ib1
            @Override // java.lang.Runnable
            public final void run() {
                DiyDialBgActivity.S(this.a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(final DiyDialBgActivity diyDialBgActivity) {
        diyDialBgActivity.state = 6;
        if (diyDialBgActivity.v().isBluetoothEnable()) {
            diyDialBgActivity.x().setText(diyDialBgActivity.getString(R.string.watch_skin_conn_fail));
            diyDialBgActivity.o0(diyDialBgActivity.L(), 1, diyDialBgActivity.G());
            diyDialBgActivity.L().setOnClickListener(new View.OnClickListener() { // from class: qb1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DiyDialBgActivity.U(this.a, view);
                }
            });
        } else {
            diyDialBgActivity.o0(diyDialBgActivity.L(), 1, diyDialBgActivity.G());
            diyDialBgActivity.x().setText(diyDialBgActivity.getString(R.string.watch_skin_open_bluetooth));
            diyDialBgActivity.L().setOnClickListener(new View.OnClickListener() { // from class: rb1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DiyDialBgActivity.T(this.a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(DiyDialBgActivity diyDialBgActivity, View view) {
        diyDialBgActivity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(DiyDialBgActivity diyDialBgActivity, View view) {
        diyDialBgActivity.x().setText(diyDialBgActivity.C());
        diyDialBgActivity.state = 0;
        diyDialBgActivity.o0(diyDialBgActivity.L(), 2, diyDialBgActivity.G());
        Handler handler = diyDialBgActivity.mHandler;
        Objects.requireNonNull(handler);
        Runnable runnable = diyDialBgActivity.mRunnable;
        Objects.requireNonNull(runnable);
        handler.postDelayed(runnable, 30000L);
    }

    private final void V() {
        String storagePath = w().getStoragePath();
        String str = File.separator;
        String str2 = storagePath + str + "TEMP_PHOTO" + str;
        File file = new File(str2);
        n0(file);
        if (file.mkdirs()) {
            this.iconPath = str2 + System.currentTimeMillis() + ".jpg";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(DiyDialBgActivity diyDialBgActivity, View view) {
        diyDialBgActivity.t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(DiyDialBgActivity diyDialBgActivity, View view) {
        if (diyDialBgActivity.canBack) {
            diyDialBgActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(DiyDialBgActivity diyDialBgActivity, View view) {
        SelectImageFragment.newInstance(1023).show(diyDialBgActivity.getSupportFragmentManager(), (String) null);
    }

    private final boolean Z(HMDeviceSource deviceSource) {
        switch (WhenMappings.$EnumSwitchMapping$1[deviceSource.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                return false;
        }
    }

    private final void a0() {
        WatchSkinViewModel watchSkinViewModel = this.viewModel;
        Objects.requireNonNull(watchSkinViewModel);
        watchSkinViewModel.getWatchSkinLiveData().observe(this, new Observer() { // from class: hb1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DiyDialBgActivity.b0(this.a, (WatchSkinState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(DiyDialBgActivity diyDialBgActivity, WatchSkinState watchSkinState) {
        Progress progress = watchSkinState.getProgress();
        if (progress != null) {
            int i2 = progress.total;
            diyDialBgActivity.L().setProgress(i2 == 0 ? 0.0f : progress.progress / i2);
        }
        switch (WhenMappings.$EnumSwitchMapping$0[watchSkinState.getPageState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                diyDialBgActivity.h0(watchSkinState.getPageState());
                break;
            case 4:
                diyDialBgActivity.x().setText(diyDialBgActivity.getString(R.string.watch_storage_full));
                diyDialBgActivity.o0(diyDialBgActivity.L(), 1, diyDialBgActivity.G());
                diyDialBgActivity.state = 6;
                break;
            case 6:
                diyDialBgActivity.l0();
                break;
            case 7:
                diyDialBgActivity.k0();
                break;
            case 8:
                diyDialBgActivity.g0();
                break;
            case 9:
                diyDialBgActivity.c0();
                break;
        }
    }

    private final void c0() {
        HMLog.info(TAG, l.a);
        x().setText(ConfigHelperKt.hasFeature(this.deviceSource, Feature.WATCH_SOURCE_S) ? R.string.watch_skin_low_battery : R.string.watch_skin_low_battery_tempo);
        o0(L(), 2, G());
        this.canBack = true;
        this.state = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(WatchSkinProgressView progressView) {
        o0(progressView, 1, G());
        if (!v().isBluetoothEnable()) {
            HMLog.info(TAG, m.a);
            this.state = 6;
            x().setText(getString(R.string.watch_skin_open_bluetooth));
            progressView.setOnClickListener(new View.OnClickListener() { // from class: nb1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DiyDialBgActivity.e0(this.a, view);
                }
            });
            return;
        }
        DeviceManagerApi deviceManagerApiV = v();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (!deviceManagerApiV.isConnected(hMDeviceType)) {
            HMLog.info(TAG, n.a);
            x().setText(C());
            o0(progressView, 2, G());
            this.state = 0;
            Handler handler = this.mHandler;
            Objects.requireNonNull(handler);
            Runnable runnable = this.mRunnable;
            Objects.requireNonNull(runnable);
            handler.postDelayed(runnable, 30000L);
            return;
        }
        if (v().isSyncingData(hMDeviceType)) {
            HMLog.info(TAG, o.a);
            x().setText(E());
            o0(progressView, 2, G());
            this.state = 1;
            return;
        }
        if (HMAgpsUpgradeManager.getAgpsProgress() == null) {
            HMLog.info(TAG, q.a);
            this.state = 2;
            s0();
        } else {
            HMLog.info(TAG, p.a);
            x().setText(R.string.watch_skin_agps_upgrading);
            o0(progressView, 2, G());
            this.state = 7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(DiyDialBgActivity diyDialBgActivity, View view) {
        diyDialBgActivity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(DiyDialBgActivity diyDialBgActivity, View view) {
        diyDialBgActivity.mDeviceManager.startSyncData(HMDeviceType.MILI);
        diyDialBgActivity.o0(diyDialBgActivity.L(), 2, diyDialBgActivity.G());
        diyDialBgActivity.x().setText(diyDialBgActivity.D());
    }

    private final void g0() {
        x().setText(R.string.fw_version_low);
        o0(L(), 2, G());
        this.state = 6;
        p0();
    }

    private final void h0(WatchSkinError error) {
        o0(L(), 1, G());
        this.state = 6;
        if (!v().isBluetoothEnable()) {
            this.state = 6;
            x().setText(getString(R.string.watch_skin_open_bluetooth));
            L().setOnClickListener(new View.OnClickListener() { // from class: gb1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DiyDialBgActivity.j0(this.a, view);
                }
            });
            return;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
        if (i2 == 1) {
            x().setText(K());
        } else if (i2 == 2) {
            x().setText(M());
        } else if (i2 != 3) {
            x().setText(D());
        } else {
            x().setText(H());
        }
        L().setOnClickListener(new View.OnClickListener() { // from class: ob1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiyDialBgActivity.i0(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(DiyDialBgActivity diyDialBgActivity, View view) {
        diyDialBgActivity.s0();
    }

    private final void initView() {
        u().setOnClickListener(new View.OnClickListener() { // from class: pb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiyDialBgActivity.Y(this.a, view);
            }
        });
        Q(this.deviceSource, (ImageView) findViewById(R.id.device_preview_img));
        this.bgImg = (ImageView) findViewById(R.id.cinco_bg_img);
        this.transparentImg = (ImageView) findViewById(R.id.cinco_transparent_img);
        I().setAdapter(new DiyDialAdapter());
        I().setLayoutManager(new LinearLayoutManager(this, 0, false));
        I().addItemDecoration(new DiyItemDecoration(this, this.deviceSource));
        DisplayConfig.ConfigBuilder configBuilderWith = HMImageLoader.with((FragmentActivity) this);
        ArrayList<WatchSkinBean> arrayList = S;
        DisplayConfig.ConfigBuilder configBuilderAsBitmap = configBuilderWith.load(arrayList.get(this.currPosition).getImage()).asBitmap();
        ImageView imageView = this.bgImg;
        Objects.requireNonNull(imageView);
        configBuilderAsBitmap.into(imageView);
        String name = arrayList.get(this.currPosition).getName();
        if (name != null) {
            if (N(name) != -1) {
                ImageView imageView2 = this.transparentImg;
                Objects.requireNonNull(imageView2);
                imageView2.setImageResource(N(name));
            } else {
                DisplayConfig.ConfigBuilder configBuilderWith2 = HMImageLoader.with((FragmentActivity) this);
                Metas metas = arrayList.get(this.currPosition).getMetas();
                DisplayConfig.ConfigBuilder configBuilderLoad = configBuilderWith2.load(metas == null ? null : metas.getTransparentBg());
                ImageView imageView3 = this.transparentImg;
                Objects.requireNonNull(imageView3);
                configBuilderLoad.into(imageView3);
            }
        }
        L().setOnClickListener(new View.OnClickListener() { // from class: sb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiyDialBgActivity.W(this.a, view);
            }
        });
        ((RainbowTitleBar) findViewById(R.id.title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: mb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiyDialBgActivity.X(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(DiyDialBgActivity diyDialBgActivity, View view) {
        diyDialBgActivity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
    }

    private final void k0() {
        L().setProgress(0.0f);
        o0(L(), 3, getString(R.string.watch_skin_syncing));
        x().setText("");
        this.state = 5;
    }

    private final void l0() {
        o0(L(), 1, getString(R.string.watch_skin_sync_done));
        x().setText("");
        this.state = 2;
        L().setOnClickListener(null);
        this.pageEnable = false;
        this.canBack = true;
        u().setEnabled(false);
        Handler handler = this.mHandler;
        Objects.requireNonNull(handler);
        handler.postDelayed(new Runnable() { // from class: jb1
            @Override // java.lang.Runnable
            public final void run() {
                DiyDialBgActivity.m0(this.a);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(DiyDialBgActivity diyDialBgActivity) {
        diyDialBgActivity.finish();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    private final boolean n0(File file) {
        boolean zDelete;
        int i2 = 0;
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            zDelete = file.delete();
        } else {
            if (fileArrListFiles.length == 0) {
                zDelete = file.delete();
            } else {
                int length = fileArrListFiles.length;
                while (i2 < length) {
                    File file2 = fileArrListFiles[i2];
                    i2++;
                    n0(file2);
                }
                zDelete = file.delete();
            }
        }
        return zDelete;
    }

    private final void o0(WatchSkinProgressView watchSkinProgressView, int i2, String str) {
        watchSkinProgressView.setState(i2, str);
        this.pageEnable = i2 == 1;
        this.canBack = i2 == 1;
        u().setEnabled(i2 == 1);
    }

    private final void p0() {
        new AlertDialogFragment.Builder(this).setPositiveButton(R.string.update_now, new DialogInterface.OnClickListener() { // from class: fb1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                DiyDialBgActivity.q0(this.a, dialogInterface, i2);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: kb1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                DiyDialBgActivity.r0(this.a, dialogInterface, i2);
            }
        }).setCancelable(false).setMessage(HMDeviceConfig.hasBoundWatch() ? R.string.fw_upgrade_tips_watch : R.string.fw_upgrade_tips).show(getSupportFragmentManager());
    }

    private final void q() {
        WatchSkinBean watchSkinBean = S.get(this.currPosition);
        this.currDialBean = watchSkinBean;
        Objects.requireNonNull(watchSkinBean);
        String str = watchSkinBean.getCom.huami.watch.companion.ximalaya.XimalayaConst.DOWNLOAD_URL java.lang.String();
        this.downloadedSkinPath = WatchSkinManager.getDownloadPath(this, str, true);
        String str2 = this.downloadedSkinPath;
        Objects.requireNonNull(str2);
        File file = new File(str2);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }
        String str3 = this.downloadedSkinPath;
        Objects.requireNonNull(str3);
        WatchSkinDownloader watchSkinDownloader = new WatchSkinDownloader(str, str3);
        this.downloader = watchSkinDownloader;
        Objects.requireNonNull(watchSkinDownloader);
        watchSkinDownloader.setProgressListener(new MyDownloadListener(this));
        if (file.exists()) {
            d0(L());
            return;
        }
        WatchSkinDownloader watchSkinDownloader2 = this.downloader;
        Objects.requireNonNull(watchSkinDownloader2);
        watchSkinDownloader2.startDownload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    public static final void q0(DiyDialBgActivity diyDialBgActivity, DialogInterface dialogInterface, int i2) {
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
            HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
            HMDeviceType hMDeviceType = HMDeviceType.MILI;
            if (hMFwOnlineUpgradeManager.useOnline(hMDeviceType)) {
                HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(0, true);
                HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(diyDialBgActivity, hMDeviceType, false, true);
            } else {
                HMFwUpgradeManager.getInstance().enableFwUpgrade(0, true);
                HMFwUpgradeManager.getInstance().checkFwUpgrade(diyDialBgActivity, HMDeviceType.MILI, false, true);
            }
        } else {
            HMFwUpgradeManager.getInstance().enableFwUpgrade(0, true);
            HMFwUpgradeManager.getInstance().checkFwUpgrade(diyDialBgActivity, HMDeviceType.MILI, false, true);
        }
        diyDialBgActivity.canBack = true;
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float r(float dp) {
        return ViewUtils.dp2px(this, dp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(DiyDialBgActivity diyDialBgActivity, DialogInterface dialogInterface, int i2) {
        diyDialBgActivity.canBack = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int s(int dp) {
        return (int) ViewUtils.dp2px(this, dp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0() {
        WatchSkinViewModel watchSkinViewModel = this.viewModel;
        Objects.requireNonNull(watchSkinViewModel);
        WatchSkinBean watchSkinBean = this.currDialBean;
        Objects.requireNonNull(watchSkinBean);
        Metas metas = watchSkinBean.getMetas();
        String minimumFirmwareVersion = metas == null ? null : metas.getMinimumFirmwareVersion();
        String str = this.croppedPath;
        String str2 = this.downloadedSkinPath;
        Objects.requireNonNull(str2);
        WatchSkinViewModel.syncWatchSkin$default(watchSkinViewModel, minimumFirmwareVersion, str, str2, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uri t(String filePath) {
        return Build.VERSION.SDK_INT >= 24 ? FileProvider.getUriForFile(this, StorageUtil.FILE_PROVIDER_AUTH, new File(filePath)) : Uri.fromFile(new File(filePath));
    }

    private final void t0() {
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView u() {
        return (TextView) this.changeBgBtn.getValue();
    }

    private final DeviceManagerApi v() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceUtilsApi w() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView x() {
        return (TextView) this.errorTipTv.getValue();
    }

    private final int y() {
        if (Language.isSimplifiedChinese()) {
            return R.drawable.icon_60158_simple;
        }
        return Language.isTraditionalChinese() ? R.drawable.icon_60158_traditional : R.drawable.icon_60158;
    }

    private final int z() {
        if (Language.isSimplifiedChinese()) {
            return R.drawable.icon_60159_simple;
        }
        return Language.isTraditionalChinese() ? R.drawable.icon_60159_traditional : R.drawable.icon_60159;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return B().plus(Dispatchers.getIO());
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        HMLog.info(TAG, new k(requestCode, resultCode));
        if (requestCode == 1 && resultCode == -1) {
            x().setText(C());
            o0(L(), 2, G());
            this.state = 0;
            Handler handler = this.mHandler;
            Objects.requireNonNull(handler);
            Runnable runnable = this.mRunnable;
            Objects.requireNonNull(runnable);
            handler.postDelayed(runnable, 30000L);
            return;
        }
        if (requestCode == 1025 && resultCode == -1) {
            P();
            return;
        }
        if (requestCode == 1024) {
            if (data == null) {
                return;
            }
            O(data);
            return;
        }
        if (requestCode == 1026) {
            if (resultCode != -1) {
                this.croppedPath = null;
                return;
            }
            DialConfig.Companion companion = DialConfig.INSTANCE;
            if (companion.dialIsRound(this.deviceSource)) {
                DisplayConfig.ConfigBuilder configBuilderCircleCrop = HMImageLoader.with((FragmentActivity) this).load(this.croppedPath).asBitmap().circleCrop();
                ImageView imageView = this.bgImg;
                Objects.requireNonNull(imageView);
                configBuilderCircleCrop.into(imageView);
                return;
            }
            DisplayConfig.ConfigBuilder configBuilderTransform = HMImageLoader.with((FragmentActivity) this).load(this.croppedPath).asBitmap().transform(new GlideRoundTransform((companion.dialBgRadius(this.deviceSource) * 1.0f) / companion.dialBgSize(this.deviceSource).getWidth(), true));
            ImageView imageView2 = this.bgImg;
            Objects.requireNonNull(imageView2);
            configBuilderTransform.into(imageView2);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(Z(this.deviceSource) ? R.layout.activity_diy_watch_skin_gt_bg : R.layout.activity_diy_watch_skin_bg);
        this.viewModel = (WatchSkinViewModel) new ViewModelProvider(this).get(WatchSkinViewModel.class);
        EventBus.getDefault().registerSticky(this);
        this.currPosition = getIntent().getIntExtra("position", 0);
        ArrayList<WatchSkinBean> arrayList = S;
        if (arrayList.isEmpty()) {
            finish();
        }
        this.currDialBean = arrayList.get(this.currPosition);
        V();
        initView();
        R();
        a0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        Job.DefaultImpls.cancel$default(B(), (CancellationException) null, 1, (Object) null);
    }

    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        HMDeviceType deviceType = event.getDeviceType();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (deviceType == hMDeviceType && this.state == 0 && event.isConnected()) {
            Handler handler = this.mHandler;
            Objects.requireNonNull(handler);
            handler.removeCallbacksAndMessages(null);
            if (this.mDeviceManager.isSyncingData(hMDeviceType)) {
                o0(L(), 2, G());
                x().setText(E());
                this.state = 1;
            } else if (HMAgpsUpgradeManager.getAgpsProgress() != null) {
                x().setText(R.string.watch_skin_agps_upgrading);
                o0(L(), 2, G());
                this.state = 7;
            } else {
                this.state = 2;
                x().setText("");
                o0(L(), 1, G());
                s0();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        if (keyCode != 4 || this.canBack) {
            return super.onKeyDown(keyCode, event);
        }
        return true;
    }

    public final void openGallery() {
        Intent intent = new Intent();
        intent.setType(UriGetter.ShareContentType.IMAGE);
        intent.setAction("android.intent.action.GET_CONTENT");
        startActivityForResult(intent, 1024);
    }

    public final void takePhoto() {
        startActivityForResult(new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", t(this.iconPath)), 1025);
    }

    public final void onEventMainThread(@NotNull HMDeviceFwUpgradeEvent event) {
        if (this.state != 7) {
            return;
        }
        if ((event.getFirmwareType() == HMFirmwareType.FIRMWARE_GPS_CEP || event.getFirmwareType() == HMFirmwareType.FIRMWARE_GPS_NMEA) && event.isStop()) {
            o0(L(), 1, G());
            x().setText("");
            this.state = 2;
            s0();
        }
    }

    public final void onEventMainThread(@NotNull HMDeviceSyncDataEvent event) {
        if (event.getDeviceType() == HMDeviceType.MILI && this.state == 1 && event.isStop()) {
            if (event.getResult()) {
                if (HMAgpsUpgradeManager.getAgpsProgress() != null) {
                    x().setText(R.string.watch_skin_agps_upgrading);
                    o0(L(), 2, G());
                    this.state = 7;
                    return;
                } else {
                    o0(L(), 1, G());
                    x().setText("");
                    this.state = 2;
                    s0();
                    return;
                }
            }
            this.state = 6;
            o0(L(), 1, G());
            x().setText(D());
            L().setOnClickListener(new View.OnClickListener() { // from class: lb1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DiyDialBgActivity.f0(this.a, view);
                }
            });
        }
    }
}
