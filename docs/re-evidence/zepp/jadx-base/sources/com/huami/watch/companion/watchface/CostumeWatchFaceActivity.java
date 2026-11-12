package com.huami.watch.companion.watchface;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.bumptech.glide.signature.ObjectKey;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.GsonBuilder;
import com.huami.devicerecorder.UriGetter;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMFileDownloadResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.watch.companion.R;
import com.huami.watch.companion.initial.InitialState;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.watchface.CostumeWatchFaceActivity;
import com.huami.watch.companion.watchface.adapter.DiyTypeAdapter;
import com.huami.watch.companion.watchface.bean.Metas;
import com.huami.watch.companion.watchface.bean.WatchFaceBean;
import com.huami.watch.companion.watchface.bean.WatchFaceCloud;
import com.huami.watch.companion.watchface.bean.WatchSkinBean;
import com.huami.watch.companion.watchface.manager.LocalWatchFaceResponse;
import com.huami.watch.companion.watchface.manager.ReceiveState;
import com.huami.watch.companion.watchface.manager.SyncWatchFaceManager;
import com.huami.watch.companion.watchface.manager.SyncWatchFaceState;
import com.huami.watch.companion.watchface.manager.WatchFaceCloudManager;
import com.huami.watch.companion.watchface.manager.WatchState;
import com.huami.watch.companion.watchface.view.WatchSkinProgressView;
import com.huami.watch.photodial.WatchInfo;
import com.huami.watch.transport.httpsupport.transporter.file.MD5FileUtils;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import com.huami.watch.util.StorageUtil;
import com.huami.watch.util.ZipUtil;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.view.clip.ClipImageActivity;
import com.loc.z;
import com.xiaomi.hm.health.imageload.GlideApp;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u0002:\u0004\u008a\u0001\u008b\u0001B\t¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000fH\u0002J$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\u001a\u0010\u001d\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u001c\u0010\"\u001a\u00020\u0003*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0006H\u0002J\b\u0010#\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0002J\u0012\u0010)\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010'H\u0014J\b\u0010*\u001a\u00020\u0003H\u0014J\u001a\u0010.\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016J\"\u00101\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u00103\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u001fH\u0016J\u0006\u00104\u001a\u00020\u0003J\u0006\u00105\u001a\u00020\u0003J/\u0010:\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u001f2\u000e\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u0006062\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001e\u0010U\u001a\n\u0012\u0004\u0012\u00020O\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001f0V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010`\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010_R\u0016\u0010d\u001a\u00020a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010cR!\u0010i\u001a\u00060eR\u00020\u00008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010f\u001a\u0004\bg\u0010hR\u0016\u0010l\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010kR\u0016\u0010n\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bm\u0010kR\u0016\u0010p\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bo\u0010kR\u001d\u0010t\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010f\u001a\u0004\br\u0010sR\u001d\u0010w\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010f\u001a\u0004\bv\u0010sR\u001d\u0010y\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010f\u001a\u0004\bo\u0010sR\u001d\u0010{\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010f\u001a\u0004\bz\u0010sR\u001d\u0010}\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010f\u001a\u0004\bq\u0010sR\u001d\u0010\u007f\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b~\u0010f\u001a\u0004\b|\u0010sR\u001f\u0010\u0081\u0001\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0005\b\u0080\u0001\u0010f\u001a\u0004\bx\u0010sR\u001e\u0010\u0082\u0001\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010f\u001a\u0004\b~\u0010sR\u001f\u0010\u0084\u0001\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0005\b\u0083\u0001\u0010f\u001a\u0004\bm\u0010sR\u001f\u0010\u0085\u0001\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bv\u0010f\u001a\u0005\b\u0083\u0001\u0010sR\u001e\u0010\u0086\u0001\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010f\u001a\u0004\bu\u0010sR\u001f\u0010\u0087\u0001\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u0010\u0010f\u001a\u0005\b\u0080\u0001\u0010s¨\u0006\u008c\u0001"}, d2 = {"Lcom/huami/watch/companion/watchface/CostumeWatchFaceActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/huami/watch/companion/watchface/adapter/DiyTypeAdapter$SelectDiyWatchListener;", "", LogUtil.D, "initData", "", "data", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "M", "initView", "Q", "R", "P", hl.k, "Landroid/content/Intent;", "B", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/net/Uri;", "inputUri", "outputUri", "", "L", "C", "m", "Landroid/widget/ImageView;", "iv", "imageUrl", "K", "Lcom/huami/watch/companion/watchface/view/WatchSkinProgressView;", "", "state", "text", "O", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Message;", "msg", ExifInterface.LATITUDE_SOUTH, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "requestCode", "resultCode", "onActivityResult", "selectedId", "callback", "takePhoto", "openGallery", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/huami/watch/companion/watchface/SelectImageDialogFragment;", "a", "Lcom/huami/watch/companion/watchface/SelectImageDialogFragment;", "mSelectImageDialogFragment", "b", "Ljava/lang/String;", "croppedPath", "Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager;", "c", "Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceManager;", "mSyncWatchFaceManager", GoogleApiAvailabilityLight.a, LogUtil.I, "selectIndex", "e", "Z", "canBack", "f", "pageClickEnable", "Lcom/huami/watch/companion/watchface/bean/WatchSkinBean;", "g", "Lcom/huami/watch/companion/watchface/bean/WatchSkinBean;", "currentWatchSkinBean", "h", "[Lcom/huami/watch/companion/watchface/bean/WatchSkinBean;", "diyWatchSkinList", "", "i", "Ljava/util/List;", "watchSupportSkinIds", "Lcom/huami/watch/companion/watchface/adapter/DiyTypeAdapter;", z.j, "Lcom/huami/watch/companion/watchface/adapter/DiyTypeAdapter;", "mDiyTypeAdapter", "Landroid/os/Handler;", "Landroid/os/Handler;", "mBluetoothHandler", "Ljava/lang/Runnable;", "l", "Ljava/lang/Runnable;", "mConnectRunnable", "Lcom/huami/watch/companion/watchface/CostumeWatchFaceActivity$SyncWatchFaceHandler;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.b, "()Lcom/huami/watch/companion/watchface/CostumeWatchFaceActivity$SyncWatchFaceHandler;", "mSyncWatchFaceHandler", "Ljava/io/File;", "Ljava/io/File;", "binFile", "o", "imageFile", com.google.android.exoplayer2.text.ttml.b.r, "zipFile", DTransferConstants.SEARCH_KEY, "t", "()Ljava/lang/String;", "strSyncWatchSkin", "r", "z", "strWatchSkinLowBattery", SOAP.XMLNS, "strConnecting", "x", "strTiming", "u", "strMoving", "v", "strSyncWatchSkinDone", "w", "strOpenBluetooth", "strSyncWatchSkinFailed", "y", "strChangingWatchSkin", "strUpdateSystem", "strNoNetwork", "strSyncing", "<init>", "()V", "Companion", "SyncWatchFaceHandler", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class CostumeWatchFaceActivity extends AppCompatActivity implements DiyTypeAdapter.SelectDiyWatchListener {

    @NotNull
    private static final String C = "CostumeWatchFaceActivity";
    public static final int CROP_HEIGHT = 240;
    public static final int CROP_RADIUS = 120;
    public static final int CROP_WIDTH = 240;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String D = "extra_params_bundle";

    @NotNull
    private static final String E = "extra_params_position";

    @NotNull
    private static final String F = "extra_params_diy_watch_skin";
    private static final int G = 11;
    private static final long H = 30000;
    private static final long I = 3000;
    public static final int MSG_CHANGE_WATCH_FACE_FAILURE = 4099;
    public static final int MSG_CHANGE_WATCH_FACE_SUCCESS = 4098;
    public static final int MSG_CONNECT_AVAILABLE = 4117;
    public static final int MSG_DATA_CHANNEL_AVAILABLE = 4114;
    public static final int MSG_DATA_CHANNEL_UNAVAILABLE = 4115;
    public static final int MSG_FILE_CANCEL_RECEIVE = 4113;
    public static final int MSG_FILE_CONFIRM_RECEIVE = 4112;
    public static final int MSG_FILE_SEND_PROGRESS = 4105;
    public static final int MSG_FILE_TRANSFER_FAILURE = 4104;
    public static final int MSG_FORCE_CHANGE_WATCH_FACE = 4097;
    public static final int MSG_SYNC = 4103;
    public static final int MSG_TRANSFER_INTERRUPT = 4116;
    public static final int STATE_CHANGE_WATCH_FACE_NOW = 4100;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private SelectImageDialogFragment mSelectImageDialogFragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String croppedPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private SyncWatchFaceManager mSyncWatchFaceManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int selectIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private WatchSkinBean currentWatchSkinBean;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private WatchSkinBean[] diyWatchSkinList;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private DiyTypeAdapter mDiyTypeAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Handler mBluetoothHandler;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Runnable mConnectRunnable;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private File binFile;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private File imageFile;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private File zipFile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean canBack = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean pageClickEnable = true;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private List<Integer> watchSupportSkinIds = new ArrayList();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSyncWatchFaceHandler = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Lazy strSyncWatchSkin = LazyKt__LazyJVMKt.lazy(new i());

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Lazy strWatchSkinLowBattery = LazyKt__LazyJVMKt.lazy(new o());

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Lazy strConnecting = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final Lazy strTiming = LazyKt__LazyJVMKt.lazy(new m());

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final Lazy strMoving = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final Lazy strSyncWatchSkinDone = LazyKt__LazyJVMKt.lazy(new j());

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final Lazy strOpenBluetooth = LazyKt__LazyJVMKt.lazy(new h());

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy strSyncWatchSkinFailed = LazyKt__LazyJVMKt.lazy(new k());

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy strChangingWatchSkin = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy strUpdateSystem = LazyKt__LazyJVMKt.lazy(new n());

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy strNoNetwork = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy strSyncing = LazyKt__LazyJVMKt.lazy(new l());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0016\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0016\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0016\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u0016\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0016\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u0016\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u0016\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0010R\u0016\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0010R\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0010R\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0010R\u0016\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0010R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0010R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0010R\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0010R\u0016\u0010'\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0015¨\u0006*"}, d2 = {"Lcom/huami/watch/companion/watchface/CostumeWatchFaceActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "position", "", "Lcom/huami/watch/companion/watchface/bean/WatchSkinBean;", "diyWatchSkin", "", "launchActivity", "(Landroid/content/Context;I[Lcom/huami/watch/companion/watchface/bean/WatchSkinBean;)V", "", "CONNECT_TIMEOUT", "J", "CROP_HEIGHT", LogUtil.I, "CROP_RADIUS", "CROP_WIDTH", "", "EXTRA_PARAMS_BUNDLE", "Ljava/lang/String;", "EXTRA_PARAMS_DIY_WATCH_SKIN", "EXTRA_PARAMS_POSITION", "FINISH_DELAY", "MSG_CHANGE_WATCH_FACE_FAILURE", "MSG_CHANGE_WATCH_FACE_SUCCESS", "MSG_CONNECT_AVAILABLE", "MSG_DATA_CHANNEL_AVAILABLE", "MSG_DATA_CHANNEL_UNAVAILABLE", "MSG_FILE_CANCEL_RECEIVE", "MSG_FILE_CONFIRM_RECEIVE", "MSG_FILE_SEND_PROGRESS", "MSG_FILE_TRANSFER_FAILURE", "MSG_FORCE_CHANGE_WATCH_FACE", "MSG_SYNC", "MSG_TRANSFER_INTERRUPT", "REQUEST_BLE_ENABLE", "STATE_CHANGE_WATCH_FACE_NOW", "TAG", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void launchActivity(@NotNull Context context, int position, @NotNull WatchSkinBean[] diyWatchSkin) {
            Intent intent = new Intent(context, (Class<?>) CostumeWatchFaceActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt(CostumeWatchFaceActivity.E, position);
            bundle.putSerializable(CostumeWatchFaceActivity.F, (Serializable) diyWatchSkin);
            Unit unit = Unit.INSTANCE;
            intent.putExtra(CostumeWatchFaceActivity.D, bundle);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/watch/companion/watchface/CostumeWatchFaceActivity$SyncWatchFaceHandler;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "<init>", "(Lcom/huami/watch/companion/watchface/CostumeWatchFaceActivity;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public final class SyncWatchFaceHandler extends Handler {
        public SyncWatchFaceHandler() {
            super(Looper.getMainLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(CostumeWatchFaceActivity costumeWatchFaceActivity, View view) {
            costumeWatchFaceActivity.Q();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(CostumeWatchFaceActivity costumeWatchFaceActivity) {
            costumeWatchFaceActivity.finish();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(CostumeWatchFaceActivity costumeWatchFaceActivity, View view) {
            costumeWatchFaceActivity.Q();
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) throws Throwable {
            super.handleMessage(msg);
            int i = msg.what;
            switch (i) {
                case 4097:
                    Object obj = msg.obj;
                    String str = obj instanceof String ? (String) obj : null;
                    ((TextView) CostumeWatchFaceActivity.this.findViewById(R.id.error_tips_tv)).setText(str != null ? str : "");
                    CostumeWatchFaceActivity costumeWatchFaceActivity = CostumeWatchFaceActivity.this;
                    costumeWatchFaceActivity.O((WatchSkinProgressView) costumeWatchFaceActivity.findViewById(R.id.sync_apply_btn), 1, CostumeWatchFaceActivity.this.t());
                    return;
                case 4098:
                    CostumeWatchFaceActivity.this.S(msg);
                    CostumeWatchFaceActivity.this.T();
                    CostumeWatchFaceActivity costumeWatchFaceActivity2 = CostumeWatchFaceActivity.this;
                    int i2 = R.id.sync_apply_btn;
                    costumeWatchFaceActivity2.O((WatchSkinProgressView) costumeWatchFaceActivity2.findViewById(i2), 1, CostumeWatchFaceActivity.this.u());
                    ((WatchSkinProgressView) CostumeWatchFaceActivity.this.findViewById(i2)).setOnClickListener(null);
                    final CostumeWatchFaceActivity costumeWatchFaceActivity3 = CostumeWatchFaceActivity.this;
                    postDelayed(new Runnable() { // from class: k01
                        @Override // java.lang.Runnable
                        public final void run() {
                            CostumeWatchFaceActivity.SyncWatchFaceHandler.e(costumeWatchFaceActivity3);
                        }
                    }, 3000L);
                    return;
                case 4099:
                    break;
                default:
                    switch (i) {
                        case CostumeWatchFaceActivity.MSG_SYNC /* 4103 */:
                            File file = CostumeWatchFaceActivity.this.imageFile;
                            if (file == null) {
                                file = null;
                            }
                            if (file.exists()) {
                                File file2 = CostumeWatchFaceActivity.this.binFile;
                                if ((file2 != null ? file2 : null).exists()) {
                                    CostumeWatchFaceActivity.this.R();
                                }
                            }
                            CostumeWatchFaceActivity.this.k();
                            break;
                        case CostumeWatchFaceActivity.MSG_FILE_TRANSFER_FAILURE /* 4104 */:
                            break;
                        case CostumeWatchFaceActivity.MSG_FILE_SEND_PROGRESS /* 4105 */:
                            ((WatchSkinProgressView) CostumeWatchFaceActivity.this.findViewById(R.id.sync_apply_btn)).setProgress(msg.arg1 / 100.0f);
                            break;
                        default:
                            switch (i) {
                                case CostumeWatchFaceActivity.MSG_FILE_CONFIRM_RECEIVE /* 4112 */:
                                    CostumeWatchFaceActivity.this.M();
                                    break;
                                case CostumeWatchFaceActivity.MSG_FILE_CANCEL_RECEIVE /* 4113 */:
                                    ((TextView) CostumeWatchFaceActivity.this.findViewById(R.id.error_tips_tv)).setText(CostumeWatchFaceActivity.this.v());
                                    CostumeWatchFaceActivity costumeWatchFaceActivity4 = CostumeWatchFaceActivity.this;
                                    costumeWatchFaceActivity4.O((WatchSkinProgressView) costumeWatchFaceActivity4.findViewById(R.id.sync_apply_btn), 1, CostumeWatchFaceActivity.this.v());
                                    break;
                                case CostumeWatchFaceActivity.MSG_DATA_CHANNEL_AVAILABLE /* 4114 */:
                                    Handler handler = CostumeWatchFaceActivity.this.mBluetoothHandler;
                                    if (handler == null) {
                                        handler = null;
                                    }
                                    handler.removeCallbacksAndMessages(null);
                                    ((TextView) CostumeWatchFaceActivity.this.findViewById(R.id.error_tips_tv)).setText("");
                                    CostumeWatchFaceActivity costumeWatchFaceActivity5 = CostumeWatchFaceActivity.this;
                                    int i3 = R.id.sync_apply_btn;
                                    costumeWatchFaceActivity5.O((WatchSkinProgressView) costumeWatchFaceActivity5.findViewById(i3), 1, CostumeWatchFaceActivity.this.t());
                                    WatchSkinProgressView watchSkinProgressView = (WatchSkinProgressView) CostumeWatchFaceActivity.this.findViewById(i3);
                                    final CostumeWatchFaceActivity costumeWatchFaceActivity6 = CostumeWatchFaceActivity.this;
                                    watchSkinProgressView.setOnClickListener(new View.OnClickListener() { // from class: j01
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            CostumeWatchFaceActivity.SyncWatchFaceHandler.d(costumeWatchFaceActivity6, view);
                                        }
                                    });
                                    break;
                                case CostumeWatchFaceActivity.MSG_DATA_CHANNEL_UNAVAILABLE /* 4115 */:
                                    Handler handler2 = CostumeWatchFaceActivity.this.mBluetoothHandler;
                                    if (handler2 == null) {
                                        handler2 = null;
                                    }
                                    Runnable runnable = CostumeWatchFaceActivity.this.mConnectRunnable;
                                    handler2.postDelayed(runnable != null ? runnable : null, 0L);
                                    ((TextView) CostumeWatchFaceActivity.this.findViewById(R.id.error_tips_tv)).setText(CostumeWatchFaceActivity.this.v());
                                    CostumeWatchFaceActivity costumeWatchFaceActivity7 = CostumeWatchFaceActivity.this;
                                    costumeWatchFaceActivity7.O((WatchSkinProgressView) costumeWatchFaceActivity7.findViewById(R.id.sync_apply_btn), 2, CostumeWatchFaceActivity.this.t());
                                    break;
                                case CostumeWatchFaceActivity.MSG_TRANSFER_INTERRUPT /* 4116 */:
                                    Handler handler3 = CostumeWatchFaceActivity.this.mBluetoothHandler;
                                    if (handler3 == null) {
                                        handler3 = null;
                                    }
                                    Runnable runnable2 = CostumeWatchFaceActivity.this.mConnectRunnable;
                                    handler3.postDelayed(runnable2 != null ? runnable2 : null, 0L);
                                    CostumeWatchFaceActivity costumeWatchFaceActivity8 = CostumeWatchFaceActivity.this;
                                    costumeWatchFaceActivity8.O((WatchSkinProgressView) costumeWatchFaceActivity8.findViewById(R.id.sync_apply_btn), 2, CostumeWatchFaceActivity.this.t());
                                    ((TextView) CostumeWatchFaceActivity.this.findViewById(R.id.error_tips_tv)).setText(CostumeWatchFaceActivity.this.v());
                                    break;
                                case CostumeWatchFaceActivity.MSG_CONNECT_AVAILABLE /* 4117 */:
                                    Object obj2 = msg.obj;
                                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                                    if (!(bool == null ? false : bool.booleanValue())) {
                                        Handler handler4 = CostumeWatchFaceActivity.this.mBluetoothHandler;
                                        if (handler4 == null) {
                                            handler4 = null;
                                        }
                                        Runnable runnable3 = CostumeWatchFaceActivity.this.mConnectRunnable;
                                        handler4.postDelayed(runnable3 != null ? runnable3 : null, 0L);
                                        CostumeWatchFaceActivity costumeWatchFaceActivity9 = CostumeWatchFaceActivity.this;
                                        costumeWatchFaceActivity9.O((WatchSkinProgressView) costumeWatchFaceActivity9.findViewById(R.id.sync_apply_btn), 2, CostumeWatchFaceActivity.this.t());
                                    } else {
                                        Handler handler5 = CostumeWatchFaceActivity.this.mBluetoothHandler;
                                        if (handler5 == null) {
                                            handler5 = null;
                                        }
                                        handler5.removeCallbacksAndMessages(null);
                                        ((TextView) CostumeWatchFaceActivity.this.findViewById(R.id.error_tips_tv)).setText("");
                                        CostumeWatchFaceActivity costumeWatchFaceActivity10 = CostumeWatchFaceActivity.this;
                                        int i4 = R.id.sync_apply_btn;
                                        costumeWatchFaceActivity10.O((WatchSkinProgressView) costumeWatchFaceActivity10.findViewById(i4), 1, CostumeWatchFaceActivity.this.t());
                                        WatchSkinProgressView watchSkinProgressView2 = (WatchSkinProgressView) CostumeWatchFaceActivity.this.findViewById(i4);
                                        final CostumeWatchFaceActivity costumeWatchFaceActivity11 = CostumeWatchFaceActivity.this;
                                        watchSkinProgressView2.setOnClickListener(new View.OnClickListener() { // from class: i01
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                CostumeWatchFaceActivity.SyncWatchFaceHandler.f(costumeWatchFaceActivity11, view);
                                            }
                                        });
                                    }
                                    break;
                            }
                            break;
                    }
                    return;
            }
            CostumeWatchFaceActivity costumeWatchFaceActivity12 = CostumeWatchFaceActivity.this;
            costumeWatchFaceActivity12.O((WatchSkinProgressView) costumeWatchFaceActivity12.findViewById(R.id.sync_apply_btn), 1, CostumeWatchFaceActivity.this.t());
            ((TextView) CostumeWatchFaceActivity.this.findViewById(R.id.error_tips_tv)).setText(CostumeWatchFaceActivity.this.v());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watch.companion.watchface.CostumeWatchFaceActivity$handleGallery$1", f = "CostumeWatchFaceActivity.kt", i = {}, l = {445}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Intent c;

        /* JADX INFO: renamed from: com.huami.watch.companion.watchface.CostumeWatchFaceActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.watch.companion.watchface.CostumeWatchFaceActivity$handleGallery$1$1", f = "CostumeWatchFaceActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0662a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ CostumeWatchFaceActivity b;
            public final /* synthetic */ Uri c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0662a(CostumeWatchFaceActivity costumeWatchFaceActivity, Uri uri, Continuation<? super C0662a> continuation) {
                super(2, continuation);
                this.b = costumeWatchFaceActivity;
                this.c = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0662a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0662a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ClipImageActivity.INSTANCE.actionStart(this.b, String.valueOf(this.c), this.b.croppedPath, TuplesKt.to(Boxing.boxInt(ExtensionsKt.getDp(240)), Boxing.boxInt(ExtensionsKt.getDp(240))), (32 & 16) != 0 ? 0 : ExtensionsKt.getDp(120), (32 & 32) != 0 ? null : null, 3);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Intent intent, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CostumeWatchFaceActivity.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Uri uriFromFile;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    SyncWatchFaceManager syncWatchFaceManager = CostumeWatchFaceActivity.this.mSyncWatchFaceManager;
                    if (syncWatchFaceManager == null) {
                        syncWatchFaceManager = null;
                    }
                    uriFromFile = Uri.fromFile(new File(syncWatchFaceManager.getTakePhotoPath()));
                } catch (Exception unused) {
                    uriFromFile = null;
                }
                CostumeWatchFaceActivity costumeWatchFaceActivity = CostumeWatchFaceActivity.this;
                costumeWatchFaceActivity.L(costumeWatchFaceActivity, this.c.getData(), uriFromFile);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C0662a c0662a = new C0662a(CostumeWatchFaceActivity.this, uriFromFile, null);
                this.a = 1;
                if (BuildersKt.withContext(main, c0662a, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00060\u0000R\u00020\u0001H\n"}, d2 = {"Lcom/huami/watch/companion/watchface/CostumeWatchFaceActivity$SyncWatchFaceHandler;", "Lcom/huami/watch/companion/watchface/CostumeWatchFaceActivity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SyncWatchFaceHandler> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SyncWatchFaceHandler invoke() {
            return CostumeWatchFaceActivity.this.new SyncWatchFaceHandler();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Uri a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Uri uri, Exception exc) {
            super(0);
            this.a = uri;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Failed to write photo: " + this.a + " because: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return CostumeWatchFaceActivity.this.getString(R.string.watch_skin_changing);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return CostumeWatchFaceActivity.this.getString(R.string.device_connecting);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return CostumeWatchFaceActivity.this.getString(R.string.watch_skin_sport);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return CostumeWatchFaceActivity.this.getString(R.string.no_network_plz_retry);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return CostumeWatchFaceActivity.this.getString(R.string.watch_skin_open_bluetooth);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return CostumeWatchFaceActivity.this.getString(R.string.sync_watch_skin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return CostumeWatchFaceActivity.this.getString(R.string.watch_skin_sync_done);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return CostumeWatchFaceActivity.this.getString(R.string.watch_skin_sync_failed);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return CostumeWatchFaceActivity.this.getString(R.string.watch_skin_syncing);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return CostumeWatchFaceActivity.this.getString(R.string.watch_skin_timing);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return CostumeWatchFaceActivity.this.getString(R.string.watch_skin_update_system);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return CostumeWatchFaceActivity.this.getString(R.string.watch_skin_low_battery);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(String data) {
        Log.d(C, "handleData：all data: " + data, new Object[0]);
        ReceiveState receiveState = (ReceiveState) new GsonBuilder().create().fromJson(data, ReceiveState.class);
        int state = receiveState.getState();
        if (state == SyncWatchFaceState.STATE_LOW_BATTERY.getState()) {
            n().obtainMessage(4097, z()).sendToTarget();
            return;
        }
        if (state == SyncWatchFaceState.STATE_CHANGING_WATCH_FACE.getState()) {
            n().obtainMessage(4097, o()).sendToTarget();
            return;
        }
        if (state == SyncWatchFaceState.STATE_KEEP_TIME.getState()) {
            n().obtainMessage(4097, x()).sendToTarget();
            return;
        }
        if (state == SyncWatchFaceState.STATE_KEEP_MOVING.getState()) {
            n().obtainMessage(4097, q()).sendToTarget();
            return;
        }
        if (state == SyncWatchFaceState.STATE_WATCH_UPGRADING.getState()) {
            n().obtainMessage(4097, y()).sendToTarget();
            return;
        }
        if (state == SyncWatchFaceState.STATE_CONFIRM_FILE_RECEIVE.getState()) {
            n().obtainMessage(MSG_FILE_CONFIRM_RECEIVE).sendToTarget();
            return;
        }
        if (state == SyncWatchFaceState.STATE_FILE_RECEIVED_FORBIDDEN.getState()) {
            n().obtainMessage(MSG_FILE_CANCEL_RECEIVE).sendToTarget();
            return;
        }
        if (state == WatchState.STATE_CHANGE_WATCH_FACE_NOW.getState()) {
            n().obtainMessage(STATE_CHANGE_WATCH_FACE_NOW).sendToTarget();
            return;
        }
        if (state == WatchState.STATE_CHANGE_WATCH_FACE_SUCCESS.getState()) {
            n().obtainMessage(4098, receiveState.getData()).sendToTarget();
            return;
        }
        if (state == WatchState.STATE_CHANGE_WATCH_FACE_FAILURE.getState()) {
            n().obtainMessage(4099).sendToTarget();
            return;
        }
        if (state == WatchState.STATE_FILE_TRANSFER_FAILURE.getState()) {
            n().obtainMessage(MSG_FILE_TRANSFER_FAILURE).sendToTarget();
            return;
        }
        Log.d(C, "handleData：unable to handle data: " + data, new Object[0]);
    }

    private final void B(Intent data) {
        if (TextUtils.isEmpty(data.getDataString())) {
            return;
        }
        SyncWatchFaceManager syncWatchFaceManager = this.mSyncWatchFaceManager;
        if (syncWatchFaceManager == null) {
            syncWatchFaceManager = null;
        }
        this.croppedPath = syncWatchFaceManager.getTakePhotoPath();
        File file = new File(this.croppedPath);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new a(data, null), 3, null);
    }

    private final void C() {
        Uri uriM = m();
        SyncWatchFaceManager syncWatchFaceManager = this.mSyncWatchFaceManager;
        if (syncWatchFaceManager == null) {
            syncWatchFaceManager = null;
        }
        this.croppedPath = syncWatchFaceManager.getTakePhotoPath();
        File file = new File(this.croppedPath);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        ClipImageActivity.INSTANCE.actionStart(this, uriM.toString(), this.croppedPath, TuplesKt.to(Integer.valueOf(ExtensionsKt.getDp(240)), Integer.valueOf(ExtensionsKt.getDp(240))), (32 & 16) != 0 ? 0 : ExtensionsKt.getDp(120), (32 & 32) != 0 ? null : null, 3);
    }

    private final void D() {
        this.mBluetoothHandler = new Handler(Looper.getMainLooper());
        this.mConnectRunnable = new Runnable() { // from class: g01
            @Override // java.lang.Runnable
            public final void run() {
                CostumeWatchFaceActivity.E(this.a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(final CostumeWatchFaceActivity costumeWatchFaceActivity) {
        if (InitialState.isBluetoothOn()) {
            ((TextView) costumeWatchFaceActivity.findViewById(R.id.error_tips_tv)).setText(costumeWatchFaceActivity.getString(R.string.watch_skin_conn_fail));
            int i2 = R.id.sync_apply_btn;
            costumeWatchFaceActivity.O((WatchSkinProgressView) costumeWatchFaceActivity.findViewById(i2), 1, costumeWatchFaceActivity.t());
            ((WatchSkinProgressView) costumeWatchFaceActivity.findViewById(i2)).setOnClickListener(new View.OnClickListener() { // from class: d01
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CostumeWatchFaceActivity.G(this.a, view);
                }
            });
            return;
        }
        int i3 = R.id.sync_apply_btn;
        costumeWatchFaceActivity.O((WatchSkinProgressView) costumeWatchFaceActivity.findViewById(i3), 1, costumeWatchFaceActivity.s());
        ((TextView) costumeWatchFaceActivity.findViewById(R.id.error_tips_tv)).setText(costumeWatchFaceActivity.s());
        ((WatchSkinProgressView) costumeWatchFaceActivity.findViewById(i3)).setOnClickListener(new View.OnClickListener() { // from class: a01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CostumeWatchFaceActivity.F(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(CostumeWatchFaceActivity costumeWatchFaceActivity, View view) {
        costumeWatchFaceActivity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(CostumeWatchFaceActivity costumeWatchFaceActivity, View view) {
        ((TextView) costumeWatchFaceActivity.findViewById(R.id.error_tips_tv)).setText(costumeWatchFaceActivity.p());
        costumeWatchFaceActivity.O((WatchSkinProgressView) costumeWatchFaceActivity.findViewById(R.id.sync_apply_btn), 2, costumeWatchFaceActivity.t());
        Handler handler = costumeWatchFaceActivity.mBluetoothHandler;
        if (handler == null) {
            handler = null;
        }
        Runnable runnable = costumeWatchFaceActivity.mConnectRunnable;
        handler.postDelayed(runnable != null ? runnable : null, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(CostumeWatchFaceActivity costumeWatchFaceActivity, View view) {
        costumeWatchFaceActivity.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(CostumeWatchFaceActivity costumeWatchFaceActivity, View view) {
        if (costumeWatchFaceActivity.canBack) {
            costumeWatchFaceActivity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(CostumeWatchFaceActivity costumeWatchFaceActivity, View view) {
        SelectImageDialogFragment selectImageDialogFragment = costumeWatchFaceActivity.mSelectImageDialogFragment;
        if (selectImageDialogFragment == null) {
            return;
        }
        selectImageDialogFragment.show(costumeWatchFaceActivity.getSupportFragmentManager(), (String) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.hm.health.imageload.GlideRequest] */
    private final void K(ImageView iv, String imageUrl) {
        if (iv == null) {
            return;
        }
        GlideApp.with((FragmentActivity) this).load(imageUrl).signature(new ObjectKey(imageUrl)).skipMemoryCache(false).optionalCircleCrop().into(iv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean L(Context context, Uri inputUri, Uri outputUri) {
        if (inputUri != null && outputUri != null) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(outputUri, "rw");
                FileOutputStream fileOutputStreamCreateOutputStream = assetFileDescriptorOpenAssetFileDescriptor == null ? null : assetFileDescriptorOpenAssetFileDescriptor.createOutputStream();
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(inputUri);
                if (fileOutputStreamCreateOutputStream != null && inputStreamOpenInputStream != null) {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int i2 = inputStreamOpenInputStream.read(bArr);
                        if (i2 <= 0) {
                            return true;
                        }
                        fileOutputStreamCreateOutputStream.write(bArr, 0, i2);
                    }
                }
                return false;
            } catch (Exception e2) {
                HMLog.info(C, new c(inputUri, e2));
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        Rx.io(new Runnable() { // from class: h01
            @Override // java.lang.Runnable
            public final void run() {
                CostumeWatchFaceActivity.N(this.a);
            }
        }).safeSubscribe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(CostumeWatchFaceActivity costumeWatchFaceActivity) {
        SyncWatchFaceManager syncWatchFaceManager = costumeWatchFaceActivity.mSyncWatchFaceManager;
        if (syncWatchFaceManager == null) {
            syncWatchFaceManager = null;
        }
        File file = costumeWatchFaceActivity.zipFile;
        syncWatchFaceManager.sendFile((file != null ? file : null).getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(WatchSkinProgressView watchSkinProgressView, int i2, String str) {
        watchSkinProgressView.setState(i2, str);
        this.canBack = i2 == 1;
        this.pageClickEnable = i2 == 1;
        ((TextView) findViewById(R.id.tv_change_skin)).setEnabled(i2 == 1);
        DiyTypeAdapter diyTypeAdapter = this.mDiyTypeAdapter;
        if (diyTypeAdapter == null) {
            diyTypeAdapter = null;
        }
        diyTypeAdapter.setItemClickable(this.pageClickEnable);
    }

    private final void P() {
        WatchSkinBean watchSkinBean;
        Metas metas;
        String transparentBg;
        WatchSkinBean[] watchSkinBeanArr;
        WatchSkinBean watchSkinBean2;
        ImageView imageView = (ImageView) findViewById(R.id.iv_skin_transparent);
        WatchSkinBean[] watchSkinBeanArr2 = this.diyWatchSkinList;
        String str = "";
        if (watchSkinBeanArr2 == null || (watchSkinBean = watchSkinBeanArr2[this.selectIndex]) == null || (metas = watchSkinBean.getMetas()) == null || (transparentBg = metas.getTransparentBg()) == null) {
            transparentBg = "";
        }
        K(imageView, transparentBg);
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_skin);
        String image = this.croppedPath;
        if (image != null || ((watchSkinBeanArr = this.diyWatchSkinList) != null && (watchSkinBean2 = watchSkinBeanArr[this.selectIndex]) != null && (image = watchSkinBean2.getImage()) != null)) {
            str = image;
        }
        K(imageView2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        ((TextView) findViewById(R.id.error_tips_tv)).setText("");
        int i2 = R.id.sync_apply_btn;
        ((WatchSkinProgressView) findViewById(i2)).setProgress(0.0f);
        O((WatchSkinProgressView) findViewById(i2), 3, w());
        SyncWatchFaceManager syncWatchFaceManager = this.mSyncWatchFaceManager;
        if (syncWatchFaceManager == null) {
            syncWatchFaceManager = null;
        }
        syncWatchFaceManager.queryDiyWatchSkinFromWatch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() throws Throwable {
        File[] fileArr;
        WatchSkinBean watchSkinBean;
        WatchSkinBean watchSkinBean2;
        Integer id;
        if (this.croppedPath != null) {
            this.imageFile = new File(this.croppedPath);
        }
        File file = this.imageFile;
        if (file == null) {
            file = null;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeFile(file.getAbsolutePath()), 454, 454, true);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        File file2 = this.imageFile;
        if (file2 == null) {
            file2 = null;
        }
        bitmapCreateScaledBitmap.compress(compressFormat, 100, new FileOutputStream(file2));
        File file3 = this.zipFile;
        if (file3 == null) {
            file3 = null;
        }
        if (file3.getParentFile().exists()) {
            File file4 = this.zipFile;
            if (file4 == null) {
                file4 = null;
            }
            for (File file5 : file4.getParentFile().listFiles()) {
                file5.delete();
            }
        } else {
            File file6 = this.zipFile;
            if (file6 == null) {
                file6 = null;
            }
            file6.getParentFile().mkdirs();
        }
        List<Integer> list = this.watchSupportSkinIds;
        WatchSkinBean watchSkinBean3 = this.currentWatchSkinBean;
        if (CollectionsKt___CollectionsKt.contains(list, watchSkinBean3 == null ? null : watchSkinBean3.getId())) {
            fileArr = new File[1];
            File file7 = this.imageFile;
            if (file7 == null) {
                file7 = null;
            }
            fileArr[0] = file7;
        } else {
            fileArr = new File[2];
            File file8 = this.binFile;
            if (file8 == null) {
                file8 = null;
            }
            fileArr[0] = file8;
            File file9 = this.imageFile;
            if (file9 == null) {
                file9 = null;
            }
            fileArr[1] = file9;
        }
        File file10 = this.zipFile;
        if (file10 == null) {
            file10 = null;
        }
        ZipUtil.zip(fileArr, file10);
        SyncWatchFaceManager syncWatchFaceManager = this.mSyncWatchFaceManager;
        if (syncWatchFaceManager == null) {
            syncWatchFaceManager = null;
        }
        WatchInfo watchInfo = new WatchInfo();
        File file11 = this.zipFile;
        if (file11 == null) {
            file11 = null;
        }
        watchInfo.setMd5(MD5FileUtils.getFileMD5String(file11));
        WatchSkinBean[] watchSkinBeanArr = this.diyWatchSkinList;
        long jIntValue = 0;
        if (watchSkinBeanArr != null && (watchSkinBean2 = watchSkinBeanArr[this.selectIndex]) != null && (id = watchSkinBean2.getId()) != null) {
            jIntValue = id.intValue();
        }
        watchInfo.setId(jIntValue);
        WatchSkinBean[] watchSkinBeanArr2 = this.diyWatchSkinList;
        watchInfo.setWatchfaceName((watchSkinBeanArr2 == null || (watchSkinBean = watchSkinBeanArr2[this.selectIndex]) == null) ? null : watchSkinBean.getName());
        watchInfo.setUsWatchFaceName("");
        File file12 = this.zipFile;
        watchInfo.setSize((file12 != null ? file12 : null).length());
        Unit unit = Unit.INSTANCE;
        syncWatchFaceManager.sendWatchInfo(watchInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(Message msg) {
        Object obj = msg.obj;
        if (obj != null && (obj instanceof WatchFaceBean)) {
            RxBus.get().post(new UpdateWatchFaceListEvent((WatchFaceBean) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        String absolutePath;
        Integer id;
        WatchFaceCloudManager manager = WatchFaceCloudManager.getManager();
        WatchFaceCloud watchFaceCloud = new WatchFaceCloud();
        WatchSkinBean watchSkinBean = this.currentWatchSkinBean;
        int iIntValue = 1;
        if (watchSkinBean != null && (id = watchSkinBean.getId()) != null) {
            iIntValue = id.intValue();
        }
        watchFaceCloud.setWatchFaceId(iIntValue);
        if (this.croppedPath == null) {
            WatchSkinBean watchSkinBean2 = this.currentWatchSkinBean;
            absolutePath = watchSkinBean2 == null ? null : watchSkinBean2.getImage();
        } else {
            File file = this.imageFile;
            if (file == null) {
                file = null;
            }
            absolutePath = file.getAbsolutePath();
        }
        watchFaceCloud.setImage(absolutePath);
        WatchSkinBean watchSkinBean3 = this.currentWatchSkinBean;
        watchFaceCloud.setName(watchSkinBean3 == null ? null : watchSkinBean3.getName());
        WatchSkinBean watchSkinBean4 = this.currentWatchSkinBean;
        watchFaceCloud.setDownload_url(watchSkinBean4 != null ? watchSkinBean4.getDownloadUrl() : null);
        Unit unit = Unit.INSTANCE;
        manager.add(watchFaceCloud);
    }

    private final void initData() {
        Object serializable;
        Bundle bundleExtra = getIntent().getBundleExtra(D);
        this.selectIndex = bundleExtra != null ? bundleExtra.getInt(E, 0) : 0;
        if (bundleExtra != null && (serializable = bundleExtra.getSerializable(F)) != null) {
            WatchSkinBean[] watchSkinBeanArr = serializable instanceof WatchSkinBean[] ? (WatchSkinBean[]) serializable : null;
            this.diyWatchSkinList = watchSkinBeanArr != null ? watchSkinBeanArr : null;
        }
        SyncWatchFaceManager syncWatchFaceManager = new SyncWatchFaceManager(this);
        syncWatchFaceManager.startTransaction();
        syncWatchFaceManager.addSyncWatchFaceListener(new SyncWatchFaceManager.SyncWatchFaceListener() { // from class: com.huami.watch.companion.watchface.CostumeWatchFaceActivity$initData$2$1
            @Override // com.huami.watch.companion.watchface.manager.SyncWatchFaceManager.SyncWatchFaceListener
            public void connectCallback(boolean connected) {
                this.a.n().obtainMessage(CostumeWatchFaceActivity.MSG_CONNECT_AVAILABLE, Boolean.valueOf(connected)).sendToTarget();
            }

            @Override // com.huami.watch.companion.watchface.manager.SyncWatchFaceManager.SyncWatchFaceListener
            public void interruptedCallback(int p) {
                this.a.n().obtainMessage(CostumeWatchFaceActivity.MSG_TRANSFER_INTERRUPT).sendToTarget();
            }

            @Override // com.huami.watch.companion.watchface.manager.SyncWatchFaceManager.SyncWatchFaceListener
            public void onDataArrivedCallback(@NotNull String data) {
                this.a.A(data);
            }

            @Override // com.huami.watch.companion.watchface.manager.SyncWatchFaceManager.SyncWatchFaceListener
            public void onSendFileProgressCallback(int progress) {
                this.a.n().obtainMessage(CostumeWatchFaceActivity.MSG_FILE_SEND_PROGRESS, progress, 0).sendToTarget();
            }
        });
        Unit unit = Unit.INSTANCE;
        this.mSyncWatchFaceManager = syncWatchFaceManager;
        syncWatchFaceManager.addWatchDiySkinListener(new SyncWatchFaceManager.WatchDiySkinListener() { // from class: com.huami.watch.companion.watchface.CostumeWatchFaceActivity.initData.3
            @Override // com.huami.watch.companion.watchface.manager.SyncWatchFaceManager.WatchDiySkinListener
            public void onDataCallback(@Nullable LocalWatchFaceResponse[] data) {
                if (data == null) {
                    CostumeWatchFaceActivity.this.n().obtainMessage(4099).sendToTarget();
                    return;
                }
                CostumeWatchFaceActivity costumeWatchFaceActivity = CostumeWatchFaceActivity.this;
                ArrayList arrayList = new ArrayList(data.length);
                for (LocalWatchFaceResponse localWatchFaceResponse : data) {
                    arrayList.add(Integer.valueOf(localWatchFaceResponse.getCloudId()));
                }
                costumeWatchFaceActivity.watchSupportSkinIds = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                CostumeWatchFaceActivity costumeWatchFaceActivity2 = CostumeWatchFaceActivity.this;
                WatchSkinBean[] watchSkinBeanArr2 = costumeWatchFaceActivity2.diyWatchSkinList;
                costumeWatchFaceActivity2.currentWatchSkinBean = watchSkinBeanArr2 == null ? null : watchSkinBeanArr2[CostumeWatchFaceActivity.this.selectIndex];
                CostumeWatchFaceActivity costumeWatchFaceActivity3 = CostumeWatchFaceActivity.this;
                SyncWatchFaceManager syncWatchFaceManager2 = CostumeWatchFaceActivity.this.mSyncWatchFaceManager;
                if (syncWatchFaceManager2 == null) {
                    syncWatchFaceManager2 = null;
                }
                WatchSkinBean watchSkinBean = CostumeWatchFaceActivity.this.currentWatchSkinBean;
                costumeWatchFaceActivity3.binFile = new File(syncWatchFaceManager2.getDownloadBinPath(watchSkinBean == null ? null : watchSkinBean.getDownloadUrl()));
                CostumeWatchFaceActivity costumeWatchFaceActivity4 = CostumeWatchFaceActivity.this;
                SyncWatchFaceManager syncWatchFaceManager3 = CostumeWatchFaceActivity.this.mSyncWatchFaceManager;
                if (syncWatchFaceManager3 == null) {
                    syncWatchFaceManager3 = null;
                }
                WatchSkinBean watchSkinBean2 = CostumeWatchFaceActivity.this.currentWatchSkinBean;
                costumeWatchFaceActivity4.imageFile = new File(syncWatchFaceManager3.getDownloadImagePath(watchSkinBean2 == null ? null : watchSkinBean2.getImage()));
                CostumeWatchFaceActivity costumeWatchFaceActivity5 = CostumeWatchFaceActivity.this;
                SyncWatchFaceManager syncWatchFaceManager4 = CostumeWatchFaceActivity.this.mSyncWatchFaceManager;
                costumeWatchFaceActivity5.zipFile = new File((syncWatchFaceManager4 != null ? syncWatchFaceManager4 : null).getZipPath());
                CostumeWatchFaceActivity.this.n().obtainMessage(CostumeWatchFaceActivity.MSG_SYNC).sendToTarget();
            }
        });
    }

    private final void initView() {
        int i2 = R.id.actionbar;
        ((ActionbarLayout) findViewById(i2)).setTitleText(getString(R.string.watch_skin_diy_title));
        ((ActionbarLayout) findViewById(i2)).setBackArrowClickListener(new View.OnClickListener() { // from class: b01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CostumeWatchFaceActivity.I(this.a, view);
            }
        });
        P();
        DiyTypeAdapter diyTypeAdapter = new DiyTypeAdapter(this.selectIndex);
        WatchSkinBean[] watchSkinBeanArr = this.diyWatchSkinList;
        diyTypeAdapter.setNewData(watchSkinBeanArr == null ? null : ArraysKt___ArraysJvmKt.asList(watchSkinBeanArr));
        diyTypeAdapter.addSelectDiyWatchCallback(this);
        Unit unit = Unit.INSTANCE;
        this.mDiyTypeAdapter = diyTypeAdapter;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
        DiyTypeAdapter diyTypeAdapter2 = this.mDiyTypeAdapter;
        recyclerView.setAdapter(diyTypeAdapter2 != null ? diyTypeAdapter2 : null);
        recyclerView.addItemDecoration(new DiyTypeAdapter.DiyItemDecoration(this));
        this.mSelectImageDialogFragment = SelectImageDialogFragment.INSTANCE.newInstance();
        ((TextView) findViewById(R.id.tv_change_skin)).setOnClickListener(new View.OnClickListener() { // from class: c01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CostumeWatchFaceActivity.J(this.a, view);
            }
        });
        ((WatchSkinProgressView) findViewById(R.id.sync_apply_btn)).setOnClickListener(new View.OnClickListener() { // from class: e01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CostumeWatchFaceActivity.H(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            ((TextView) findViewById(R.id.error_tips_tv)).setText(r());
            O((WatchSkinProgressView) findViewById(R.id.sync_apply_btn), 1, t());
            return;
        }
        File file = this.binFile;
        if (file == null) {
            file = null;
        }
        if (!file.getParentFile().exists()) {
            File file2 = this.binFile;
            if (file2 == null) {
                file2 = null;
            }
            file2.getParentFile().mkdirs();
        }
        File file3 = this.imageFile;
        if (file3 == null) {
            file3 = null;
        }
        if (!file3.getParentFile().exists()) {
            File file4 = this.imageFile;
            (file4 != null ? file4 : null).getParentFile().mkdirs();
        }
        Rx.io(new Runnable() { // from class: f01
            @Override // java.lang.Runnable
            public final void run() {
                CostumeWatchFaceActivity.l(this.a);
            }
        }).safeSubscribe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final CostumeWatchFaceActivity costumeWatchFaceActivity) {
        WatchSkinBean watchSkinBean = costumeWatchFaceActivity.currentWatchSkinBean;
        String downloadUrl = watchSkinBean == null ? null : watchSkinBean.getDownloadUrl();
        File file = costumeWatchFaceActivity.binFile;
        File file2 = file == null ? null : file;
        Support.RequestSupport requestSupport = Support.RequestSupport.GET;
        HMWebUtil.doSeparateRequest(downloadUrl, (Map<String, String>) null, file2, requestSupport, false, true, new IHMFileDownloadResponseHandler() { // from class: com.huami.watch.companion.watchface.CostumeWatchFaceActivity$downloadSkinFile$1$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ File a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(File file) {
                    super(0);
                    this.a = file;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    File file = this.a;
                    return "onFailure:" + (file == null ? "null" : Long.valueOf(file.length()));
                }
            }

            @Override // com.huami.network.base.handler.IHMFileDownloadResponseHandler
            public void onFailure(@Nullable HMHttpResponseData item, @Nullable File file3) {
                HMLog.info("CostumeWatchFaceActivity", new a(file3));
            }

            @Override // com.huami.network.base.handler.IHMFileDownloadResponseHandler
            public void onSuccess(@Nullable HMHttpResponseData item, @Nullable File file3) {
            }
        }, new HMHttpConfig[0]);
        WatchSkinBean watchSkinBean2 = costumeWatchFaceActivity.currentWatchSkinBean;
        String image = watchSkinBean2 == null ? null : watchSkinBean2.getImage();
        File file3 = costumeWatchFaceActivity.imageFile;
        HMWebUtil.doSeparateRequest(image, (Map<String, String>) null, file3 == null ? null : file3, requestSupport, false, true, new IHMFileDownloadResponseHandler() { // from class: com.huami.watch.companion.watchface.CostumeWatchFaceActivity$downloadSkinFile$1$2

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ File a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(File file) {
                    super(0);
                    this.a = file;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    File file = this.a;
                    return "onFailure:" + (file == null ? "null" : Long.valueOf(file.length()));
                }
            }

            @Override // com.huami.network.base.handler.IHMFileDownloadResponseHandler
            public void onFailure(@Nullable HMHttpResponseData item, @Nullable File file4) {
                HMLog.info("CostumeWatchFaceActivity", new a(file4));
            }

            @Override // com.huami.network.base.handler.IHMFileDownloadResponseHandler
            public void onSuccess(@Nullable HMHttpResponseData item, @Nullable File file4) throws Throwable {
                this.b.R();
            }
        }, new HMHttpConfig[0]);
    }

    private final Uri m() {
        return StorageUtil.getFileUri(this, StorageUtil.getImageCaptureFile(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SyncWatchFaceHandler n() {
        return (SyncWatchFaceHandler) this.mSyncWatchFaceHandler.getValue();
    }

    private final String o() {
        return (String) this.strChangingWatchSkin.getValue();
    }

    private final String p() {
        return (String) this.strConnecting.getValue();
    }

    private final String q() {
        return (String) this.strMoving.getValue();
    }

    private final String r() {
        return (String) this.strNoNetwork.getValue();
    }

    private final String s() {
        return (String) this.strOpenBluetooth.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String t() {
        return (String) this.strSyncWatchSkin.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String u() {
        return (String) this.strSyncWatchSkinDone.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String v() {
        return (String) this.strSyncWatchSkinFailed.getValue();
    }

    private final String w() {
        return (String) this.strSyncing.getValue();
    }

    private final String x() {
        return (String) this.strTiming.getValue();
    }

    private final String y() {
        return (String) this.strUpdateSystem.getValue();
    }

    private final String z() {
        return (String) this.strWatchSkinLowBattery.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.watch.companion.watchface.adapter.DiyTypeAdapter.SelectDiyWatchListener
    public void callback(int selectedId) {
        this.selectIndex = selectedId;
        P();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != -1) {
            return;
        }
        if (requestCode == 1) {
            C();
            return;
        }
        if (requestCode == 2) {
            if (data != null) {
                B(data);
            }
        } else {
            if (requestCode == 3) {
                P();
                return;
            }
            if (requestCode != 11) {
                return;
            }
            ((TextView) findViewById(R.id.error_tips_tv)).setText(p());
            O((WatchSkinProgressView) findViewById(R.id.sync_apply_btn), 2, t());
            Handler handler = this.mBluetoothHandler;
            if (handler == null) {
                handler = null;
            }
            Runnable runnable = this.mConnectRunnable;
            handler.postDelayed(runnable != null ? runnable : null, 30000L);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        setContentView(R.layout.activity_costume_watch_face);
        initData();
        initView();
        D();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SyncWatchFaceManager syncWatchFaceManager = this.mSyncWatchFaceManager;
        if (syncWatchFaceManager == null) {
            syncWatchFaceManager = null;
        }
        syncWatchFaceManager.onClear();
        Handler handler = this.mBluetoothHandler;
        if (handler == null) {
            handler = null;
        }
        handler.removeCallbacksAndMessages(null);
        n().removeCallbacksAndMessages(null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @Nullable KeyEvent event) {
        if (keyCode != 4 || this.canBack) {
            return super.onKeyDown(keyCode, event);
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        int length = permissions.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str = permissions[i2];
            int i4 = i3 + 1;
            if (grantResults[i3] == 0) {
                if (Intrinsics.areEqual(str, "android.permission.CAMERA")) {
                    takePhoto();
                } else if (Intrinsics.areEqual(str, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    openGallery();
                }
            }
            i2++;
            i3 = i4;
        }
    }

    public final void openGallery() {
        Intent intent = new Intent();
        intent.setType(UriGetter.ShareContentType.IMAGE);
        intent.setAction("android.intent.action.GET_CONTENT");
        if (intent.resolveActivity(getPackageManager()) == null) {
            return;
        }
        startActivityForResult(intent, 2);
    }

    public final void takePhoto() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", m());
        Unit unit = Unit.INSTANCE;
        startActivityForResult(intent, 1);
    }
}
