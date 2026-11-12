package com.huami.watchfacesstore.ui.store.detail;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.Loading;
import com.huami.arch.core.State;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.devicerecorder.UriGetter;
import com.huami.module.ktx.GlobalFunctionKt;
import com.huami.pay.service.ProductCashierParam;
import com.huami.privacy.moneyformat.MoneyFormatterFactory;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.analytic.WFAnalyticHelper;
import com.huami.watchfacesstore.analytic.WFStateEvent;
import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import com.huami.watchfacesstore.bean.Publisher;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.bean.WatchFaceDetailBean;
import com.huami.watchfacesstore.databinding.WfActivityWatchFaceDetailBinding;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.device.WFProgress;
import com.huami.watchfacesstore.device.WatchFaceState;
import com.huami.watchfacesstore.device.WatchFaceStatus;
import com.huami.watchfacesstore.device.config.IDeviceConfig;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.ext.ViewExtKt;
import com.huami.watchfacesstore.ui.LiveDataChannel;
import com.huami.watchfacesstore.ui.SelectImageFragment;
import com.huami.watchfacesstore.ui.StartPayHolder;
import com.huami.watchfacesstore.ui.WFConstant;
import com.huami.watchfacesstore.ui.WatchFaceManager;
import com.huami.watchfacesstore.ui.adapter.ColorAdapter;
import com.huami.watchfacesstore.ui.adapter.StyleWatchAdapter;
import com.huami.watchfacesstore.ui.adapter.WatchFaceAdapter;
import com.huami.watchfacesstore.ui.base.BaseActivity;
import com.huami.watchfacesstore.ui.decoration.DividerItemDecoration;
import com.huami.watchfacesstore.ui.decoration.RecyclerViewCornerRadius;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity.k;
import com.huami.watchfacesstore.util.FormatUtil;
import com.huami.watchfacesstore.view.TipDialog;
import com.huami.watchfacesstore.view.clip.ClipImageActivity;
import com.huami.watchfacesstore.view.popwindow.SmartPopupWindow;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import com.huami.widget.toast.CustomToastKtxKt;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 t2\u00020\u00012\u00020\u0002:\u0001tB\u0007¢\u0006\u0004\br\u0010sJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\b\u0010\u0018\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010!\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\u0005H\u0002J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\u001d\u0010(\u001a\u00020\u0005\"\u0004\b\u0000\u0010'2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010)J\u0012\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010*H\u0016J\b\u0010.\u001a\u00020-H\u0016J\b\u00100\u001a\u00020/H\u0016J\b\u00101\u001a\u00020\u0005H\u0016J\u0006\u00102\u001a\u00020\u0005J\u0006\u00103\u001a\u00020\u0005J\"\u00106\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010#H\u0014R\u001d\u0010;\u001a\u0002078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b+\u0010:R\u001d\u0010@\u001a\u00020<8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010?R\u001d\u0010E\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010KR\u0016\u0010O\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010NR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010\u001dR\u001d\u0010X\u001a\u00020T8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bU\u0010WR\u001d\u0010\\\u001a\u00020Y8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\bZ\u0010[R\u001d\u0010a\u001a\u00020]8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u00109\u001a\u0004\b_\u0010`R\u0016\u0010c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010GR\u001d\u0010g\u001a\u00020d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u00109\u001a\u0004\bR\u0010fR\u001d\u0010i\u001a\u00020d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u00109\u001a\u0004\bh\u0010fR\u001d\u0010k\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u00109\u001a\u0004\b^\u0010jR\u001d\u0010n\u001a\u00020l8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u00109\u001a\u0004\bb\u0010mR\u001d\u0010q\u001a\u00020o8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00109\u001a\u0004\be\u0010p¨\u0006u"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/detail/WatchFaceDetailActivity;", "Lcom/huami/watchfacesstore/ui/base/BaseActivity;", "Landroid/view/View$OnClickListener;", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "watchFaceDetailBean", "", "O", "L", "", "isHighPowerCost", "K", "data", GoogleApiAvailabilityLight.b, "isFree", "m", "", "event", "l", "isTouch", "P", "", "color", "R", "Q", LogUtil.D, "F", "E", "Ljava/io/File;", "file", "J", "filePath", "Landroid/net/Uri;", "o", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "C", "Landroid/content/Intent;", "B", "initView", "loadData", ExifInterface.GPS_DIRECTION_TRUE, "setData", "(Ljava/lang/Object;)V", "Landroid/view/View;", "v", "onClick", "Landroidx/viewbinding/ViewBinding;", "getBinding", "", "getContainerIds", "onBackPressed", "openGallery", "takePhoto", "requestCode", "resultCode", "onActivityResult", "Lcom/huami/watchfacesstore/ui/store/detail/WatchFaceDetailViewModel;", "g", "Lkotlin/Lazy;", "()Lcom/huami/watchfacesstore/ui/store/detail/WatchFaceDetailViewModel;", "mViewModel", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "h", "r", "()Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "mDeviceConfigManager", "Lcom/huami/watchfacesstore/ui/StartPayHolder;", "i", "y", "()Lcom/huami/watchfacesstore/ui/StartPayHolder;", "startPayHolder", z.j, LogUtil.I, "mWatchFaceId", hl.k, "mPageMode", "Ljava/lang/String;", "iconPath", "croppedPath", "Z", "mIsTouch", "", "mStartSyncTime", com.google.android.exoplayer2.text.ttml.b.r, "mSuccessSyncTime", "Lcom/huami/watchfacesstore/databinding/WfActivityWatchFaceDetailBinding;", DTransferConstants.SEARCH_KEY, "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "()Lcom/huami/watchfacesstore/databinding/WfActivityWatchFaceDetailBinding;", "mBinding", "Lcom/huami/watchfacesstore/ui/adapter/WatchFaceAdapter;", "x", "()Lcom/huami/watchfacesstore/ui/adapter/WatchFaceAdapter;", "recommendAdapter", "Lcom/huami/watchfacesstore/ui/adapter/StyleWatchAdapter;", SOAP.XMLNS, "z", "()Lcom/huami/watchfacesstore/ui/adapter/StyleWatchAdapter;", "stylesAdapter", "t", "currentStylePosition", "Lcom/huami/watchfacesstore/ui/adapter/ColorAdapter;", "u", "()Lcom/huami/watchfacesstore/ui/adapter/ColorAdapter;", "colorAdapter", "w", "moreColorAdapter", "()Landroid/view/View;", "mPopView", "Lcom/huami/watchfacesstore/view/popwindow/SmartPopupWindow;", "()Lcom/huami/watchfacesstore/view/popwindow/SmartPopupWindow;", "mPopWindow", "Lcom/huami/watchfacesstore/ui/store/detail/ReplaceDialDialog;", "()Lcom/huami/watchfacesstore/ui/store/detail/ReplaceDialDialog;", "mReplaceDialDialog", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"InflateParams"})
public final class WatchFaceDetailActivity extends BaseActivity implements View.OnClickListener {

    @NotNull
    private static final String A = "WatchFaceDetailActivity";

    @NotNull
    private static final String B = "from";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final String FOLDER_CAMERA = "dial_bg";

    @NotNull
    public static final String FROM_CATEGORY = "category";

    @NotNull
    public static final String FROM_FAVORITES = "favorites";

    @NotNull
    public static final String FROM_FAVORITES_LIST = "favoriteslist";

    @NotNull
    public static final String FROM_LOCAL = "local";

    @NotNull
    public static final String FROM_NEW = "new";

    @NotNull
    public static final String FROM_PURCHASE = "purchase";

    @NotNull
    public static final String FROM_PURCHASE_LIST = "purchaselist";

    @NotNull
    public static final String FROM_RANK = "rank";

    @NotNull
    public static final String FROM_RECOMMEND = "recommend";

    @NotNull
    public static final String FROM_REC_SERIES_LIST = "rec_series_list";

    @NotNull
    public static final String FROM_REC_SINGLE = "rec_single";

    @NotNull
    public static final String FROM_TYPE = "type";
    public static final int REQ_CROP = 1026;
    public static final int REQ_SELECT_IMAGE = 1024;
    public static final int REQ_TAKE_PHOTO = 1025;

    @NotNull
    public static final String SOURCE = "source";

    @NotNull
    public static final String TRANSPARENT_COLOR = "color";

    @NotNull
    public static final String WATCH_FACE_ID = "watchFaceId";
    public static final /* synthetic */ KProperty<Object>[] z;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceConfigManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy startPayHolder;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int mWatchFaceId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int mPageMode;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private String iconPath;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private String croppedPath;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean mIsTouch;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private long mStartSyncTime;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private long mSuccessSyncTime;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty mBinding;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Lazy recommendAdapter;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Lazy stylesAdapter;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int currentStylePosition;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final Lazy colorAdapter;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final Lazy moreColorAdapter;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPopView;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPopWindow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy mReplaceDialDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0016\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0016\u0010\u0018\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0016\u0010\u0019\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0016\u0010\u001a\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u0016\u0010\u001b\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000eR\u0016\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010 \u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u000eR\u0016\u0010!\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u000eR\u0016\u0010\"\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u0016\u0010#\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u000e¨\u0006&"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/detail/WatchFaceDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "from", WatchFaceDetailActivity.WATCH_FACE_ID, "color", "", "fromType", "", "actionStart", "(Landroid/content/Context;IILjava/lang/Integer;Ljava/lang/String;)V", "FOLDER_CAMERA", "Ljava/lang/String;", "FROM", "FROM_CATEGORY", "FROM_FAVORITES", "FROM_FAVORITES_LIST", "FROM_LOCAL", "FROM_NEW", "FROM_PURCHASE", "FROM_PURCHASE_LIST", "FROM_RANK", "FROM_RECOMMEND", "FROM_REC_SERIES_LIST", "FROM_REC_SINGLE", "FROM_TYPE", "REQ_CROP", LogUtil.I, "REQ_SELECT_IMAGE", "REQ_TAKE_PHOTO", "SOURCE", "TAG", "TRANSPARENT_COLOR", "WATCH_FACE_ID", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void actionStart$default(Companion companion, Context context, int i, int i2, Integer num, String str, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                num = null;
            }
            Integer num2 = num;
            if ((i3 & 16) != 0) {
                str = "";
            }
            companion.actionStart(context, i, i2, num2, str);
        }

        @JvmOverloads
        public final void actionStart(@NotNull Context context, int i, int i2) {
            actionStart$default(this, context, i, i2, null, null, 24, null);
        }

        @JvmOverloads
        public final void actionStart(@NotNull Context context, int i, int i2, @Nullable Integer num) {
            actionStart$default(this, context, i, i2, num, null, 16, null);
        }

        @JvmOverloads
        public final void actionStart(@NotNull Context context, int from, int watchFaceId, @Nullable Integer color, @NotNull String fromType) {
            Intent intent = new Intent(context, (Class<?>) WatchFaceDetailActivity.class);
            intent.putExtra("source", from).putExtra(WatchFaceDetailActivity.WATCH_FACE_ID, watchFaceId).putExtra("color", color).putExtra("from", fromType).putExtra("checkNetwork", from == 0);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WatchFaceStatus.values().length];
            iArr[WatchFaceStatus.WAITE_PAY.ordinal()] = 1;
            iArr[WatchFaceStatus.WAITE_DOWNLOAD.ordinal()] = 2;
            iArr[WatchFaceStatus.WAITE_SYNC.ordinal()] = 3;
            iArr[WatchFaceStatus.WAITE_UPDATE.ordinal()] = 4;
            iArr[WatchFaceStatus.START.ordinal()] = 5;
            iArr[WatchFaceStatus.SYNCING.ordinal()] = 6;
            iArr[WatchFaceStatus.USING.ordinal()] = 7;
            iArr[WatchFaceStatus.SUCCESS.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/ColorAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ColorAdapter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ColorAdapter invoke() {
            return new ColorAdapter(WatchFaceDetailActivity.this, WFConstant.INSTANCE.getColorLists(), R.layout.wf_item_color_selector);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$handleGallery$1", f = "WatchFaceDetailActivity.kt", i = {}, l = {849}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Intent c;
        public final /* synthetic */ String d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$handleGallery$1$1", f = "WatchFaceDetailActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ WatchFaceDetailActivity b;
            public final /* synthetic */ Uri c;
            public final /* synthetic */ String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceDetailActivity watchFaceDetailActivity, Uri uri, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = watchFaceDetailActivity;
                this.c = uri;
                this.d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
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
                ClipImageActivity.INSTANCE.actionStart(this.b, this.c.toString(), this.d, this.b.r().getCropDialSize(), this.b.r().getCropDialRadius(), this.b.v().getTransBackgroundPath(), 1026);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Intent intent, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = intent;
            this.d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchFaceDetailActivity.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchFaceDetailActivity watchFaceDetailActivity = WatchFaceDetailActivity.this;
                String string = FileUtils.getAppFileDir(watchFaceDetailActivity.getApplicationContext()).toString();
                String str = File.separator;
                Uri uriO = watchFaceDetailActivity.o(string + str + "dial_bg" + str + System.currentTimeMillis() + ".png");
                WatchFaceManager.INSTANCE.savePhotoFromUriToUri(WatchFaceDetailActivity.this, this.c.getData(), uriO);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(WatchFaceDetailActivity.this, uriO, this.d, null);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<StateBuilder<WatchFaceDetailBean>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Loading<? extends WatchFaceDetailBean>, Unit> {
            public final /* synthetic */ WatchFaceDetailActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceDetailActivity watchFaceDetailActivity) {
                super(1);
                this.a = watchFaceDetailActivity;
            }

            public final void a(@NotNull Loading<WatchFaceDetailBean> loading) {
                this.a.showLoadingDialog();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends WatchFaceDetailBean> loading) {
                a(loading);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Success<? extends WatchFaceDetailBean>, Unit> {
            public final /* synthetic */ WatchFaceDetailActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(WatchFaceDetailActivity watchFaceDetailActivity) {
                super(1);
                this.a = watchFaceDetailActivity;
            }

            public final void a(@NotNull Success<WatchFaceDetailBean> success) {
                WatchFaceDetailBean value = success.getValue();
                if (value == null) {
                    return;
                }
                this.a.setData(value);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends WatchFaceDetailBean> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0700c extends Lambda implements Function1<Fail<? extends WatchFaceDetailBean>, Unit> {
            public final /* synthetic */ WatchFaceDetailActivity a;

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$c$c$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Fail<WatchFaceDetailBean> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fail<WatchFaceDetailBean> fail) {
                    super(0);
                    this.a = fail;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return this.a.getError().getMessage();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0700c(WatchFaceDetailActivity watchFaceDetailActivity) {
                super(1);
                this.a = watchFaceDetailActivity;
            }

            public final void a(@NotNull Fail<WatchFaceDetailBean> fail) {
                HMLog.info(WatchFaceDetailActivity.A, new a(fail));
                this.a.showDefaultError();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends WatchFaceDetailBean> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function1<State<? extends WatchFaceDetailBean>, Unit> {
            public final /* synthetic */ WatchFaceDetailActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(WatchFaceDetailActivity watchFaceDetailActivity) {
                super(1);
                this.a = watchFaceDetailActivity;
            }

            public final void a(@NotNull State<WatchFaceDetailBean> state) {
                this.a.hideLoadingDialog();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State<? extends WatchFaceDetailBean> state) {
                a(state);
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<WatchFaceDetailBean> stateBuilder) {
            stateBuilder.onLoading(new a(WatchFaceDetailActivity.this));
            stateBuilder.onSuccess(new b(WatchFaceDetailActivity.this));
            stateBuilder.onFail(new C0700c(WatchFaceDetailActivity.this));
            stateBuilder.onCompleted(new d(WatchFaceDetailActivity.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<WatchFaceDetailBean> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<StateBuilder<Boolean>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Loading<? extends Boolean>, Unit> {
            public final /* synthetic */ WatchFaceDetailActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceDetailActivity watchFaceDetailActivity) {
                super(1);
                this.a = watchFaceDetailActivity;
            }

            public final void a(@NotNull Loading<Boolean> loading) {
                this.a.showLoadingDialog();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends Boolean> loading) {
                a(loading);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Success<? extends Boolean>, Unit> {
            public final /* synthetic */ WatchFaceDetailActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(WatchFaceDetailActivity watchFaceDetailActivity) {
                super(1);
                this.a = watchFaceDetailActivity;
            }

            public final void a(@NotNull Success<Boolean> success) {
                Boolean value = success.getValue();
                if (value == null) {
                    return;
                }
                WatchFaceDetailActivity watchFaceDetailActivity = this.a;
                boolean zBooleanValue = value.booleanValue();
                LiveDataChannel.INSTANCE.getCollectLiveData().postValue(Boolean.valueOf(zBooleanValue));
                watchFaceDetailActivity.z().setItemCollected(watchFaceDetailActivity.currentStylePosition);
                watchFaceDetailActivity.q().ivIsCollect.setImageResource(zBooleanValue ? R.drawable.wf_ic_collected : R.drawable.wf_ic_uncollect);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Boolean> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<State<? extends Boolean>, Unit> {
            public final /* synthetic */ WatchFaceDetailActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(WatchFaceDetailActivity watchFaceDetailActivity) {
                super(1);
                this.a = watchFaceDetailActivity;
            }

            public final void a(@NotNull State<Boolean> state) {
                this.a.hideLoadingDialog();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State<? extends Boolean> state) {
                a(state);
                return Unit.INSTANCE;
            }
        }

        public d() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<Boolean> stateBuilder) {
            stateBuilder.onLoading(new a(WatchFaceDetailActivity.this));
            stateBuilder.onSuccess(new b(WatchFaceDetailActivity.this));
            stateBuilder.onCompleted(new c(WatchFaceDetailActivity.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Boolean> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "WatchFaceDetailActivity WatchFaceStatus.START";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "WatchFaceDetailActivity WatchFaceStatus.SYNCING";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "WatchFaceDetailActivity WatchFaceStatus.USING";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "WatchFaceDetailActivity WatchFaceStatus.SUCCESS";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ WatchFaceState a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(WatchFaceState watchFaceState) {
            super(0);
            this.a = watchFaceState;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "WatchFaceDetailActivity sync fail " + this.a.getStatus().name();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<StateBuilder<Boolean>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends Boolean>, Unit> {
            public final /* synthetic */ WatchFaceDetailActivity a;

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$j$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0702a extends Lambda implements Function0<String> {
                public final /* synthetic */ WatchFaceDetailActivity a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0702a(WatchFaceDetailActivity watchFaceDetailActivity) {
                    super(0);
                    this.a = watchFaceDetailActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "report watchFaceId: " + this.a.mWatchFaceId + " success";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceDetailActivity watchFaceDetailActivity) {
                super(1);
                this.a = watchFaceDetailActivity;
            }

            public final void a(@NotNull Success<Boolean> success) {
                HMLog.info(WatchFaceDetailActivity.A, new C0702a(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Boolean> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Fail<? extends Boolean>, Unit> {
            public final /* synthetic */ WatchFaceDetailActivity a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ WatchFaceDetailActivity a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(WatchFaceDetailActivity watchFaceDetailActivity) {
                    super(0);
                    this.a = watchFaceDetailActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "report watchFaceId: " + this.a.mWatchFaceId + " fail";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(WatchFaceDetailActivity watchFaceDetailActivity) {
                super(1);
                this.a = watchFaceDetailActivity;
            }

            public final void a(@NotNull Fail<Boolean> fail) {
                HMLog.error$default(WatchFaceDetailActivity.A, null, null, new a(this.a), 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends Boolean> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        public j() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<Boolean> stateBuilder) {
            stateBuilder.onSuccess(new a(WatchFaceDetailActivity.this));
            stateBuilder.onFail(new b(WatchFaceDetailActivity.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Boolean> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Unit> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WatchFaceDetailActivity.this.v().doWhenPaySuccess();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<View> {
        public l() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return LayoutInflater.from(WatchFaceDetailActivity.this).inflate(R.layout.wf_pop_more_color, (ViewGroup) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/view/popwindow/SmartPopupWindow;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<SmartPopupWindow> {
        public m() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(WatchFaceDetailActivity watchFaceDetailActivity, ViewHolder viewHolder, int i, int i2) {
            watchFaceDetailActivity.l("WF_Function_Colour_Click");
            watchFaceDetailActivity.p().resetColorSelect();
            watchFaceDetailActivity.w().updateSelectPosition(i2);
            watchFaceDetailActivity.R(watchFaceDetailActivity.w().getListData().get(i2).intValue());
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SmartPopupWindow invoke() {
            View viewFindViewById = WatchFaceDetailActivity.this.s().findViewById(R.id.rl_more_color);
            WatchFaceDetailActivity watchFaceDetailActivity = WatchFaceDetailActivity.this;
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            ExtensionsKt.setShape(recyclerView, ExtensionsKt.getDp(15), Integer.valueOf(R.color.wf_home_tab_text_select_color));
            RecyclerViewCornerRadius recyclerViewCornerRadius = new RecyclerViewCornerRadius(recyclerView);
            recyclerViewCornerRadius.setCornerRadius(ExtensionsKt.getDp(15));
            Unit unit = Unit.INSTANCE;
            recyclerView.addItemDecoration(recyclerViewCornerRadius);
            recyclerView.setAdapter(watchFaceDetailActivity.w());
            ColorAdapter colorAdapterW = WatchFaceDetailActivity.this.w();
            final WatchFaceDetailActivity watchFaceDetailActivity2 = WatchFaceDetailActivity.this;
            colorAdapterW.setOnItemClickListener(new BaseRVAdapter.OnItemClickListener() { // from class: com.huami.watchfacesstore.ui.store.detail.a
                @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter.OnItemClickListener
                public final void onItemClick(ViewHolder viewHolder, int i, int i2) {
                    WatchFaceDetailActivity.m.c(watchFaceDetailActivity2, viewHolder, i, i2);
                }
            });
            int dp = WatchFaceDetailActivity.this.getResources().getDisplayMetrics().widthPixels - ExtensionsKt.getDp(30);
            WatchFaceDetailActivity watchFaceDetailActivity3 = WatchFaceDetailActivity.this;
            return SmartPopupWindow.Builder.build(watchFaceDetailActivity3, watchFaceDetailActivity3.s()).setSize(dp, -2).createPopupWindow();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/detail/ReplaceDialDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<ReplaceDialDialog> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<MyWatchFaceBean, Unit> {
            public final /* synthetic */ WatchFaceDetailActivity a;

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$n$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0703a extends Lambda implements Function0<String> {
                public static final C0703a a = new C0703a();

                public C0703a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "click replaceDialog confirm";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceDetailActivity watchFaceDetailActivity) {
                super(1);
                this.a = watchFaceDetailActivity;
            }

            public final void a(@NotNull MyWatchFaceBean myWatchFaceBean) {
                HMLog.info(WatchFaceDetailActivity.A, C0703a.a);
                this.a.v().replaceWatchFace(myWatchFaceBean.getBuiltinId());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MyWatchFaceBean myWatchFaceBean) {
                a(myWatchFaceBean);
                return Unit.INSTANCE;
            }
        }

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReplaceDialDialog invoke() {
            ReplaceDialDialog replaceDialDialog = new ReplaceDialDialog();
            replaceDialDialog.onConfirm(new a(WatchFaceDetailActivity.this));
            return replaceDialDialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/ColorAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<ColorAdapter> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ColorAdapter invoke() {
            return new ColorAdapter(WatchFaceDetailActivity.this, WFConstant.INSTANCE.getMoreColorLists(), R.layout.wf_item_more_color_selector);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onActivityResult, requstCode: " + this.a + "  resultCode: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/WatchFaceAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<WatchFaceAdapter> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchFaceAdapter invoke() {
            return new WatchFaceAdapter(WatchFaceDetailActivity.this, R.layout.wf_item_watchface_common, DeviceConfigManager.DeviceSize.SIZE_ONE, false, 8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/StyleWatchAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<StyleWatchAdapter> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StyleWatchAdapter invoke() {
            return new StyleWatchAdapter(WatchFaceDetailActivity.this);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[11];
        kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WatchFaceDetailActivity.class), "mBinding", "getMBinding()Lcom/huami/watchfacesstore/databinding/WfActivityWatchFaceDetailBinding;"));
        z = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchFaceDetailActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WatchFaceDetailViewModel>() { // from class: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WatchFaceDetailViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(WatchFaceDetailViewModel.class), function0, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.mDeviceConfigManager = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<DeviceConfigManager>() { // from class: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.watchfacesstore.device.DeviceConfigManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceConfigManager invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceConfigManager.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.startPayHolder = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<StartPayHolder>() { // from class: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.watchfacesstore.ui.StartPayHolder, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final StartPayHolder invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(StartPayHolder.class), objArr4, objArr5);
            }
        });
        this.mWatchFaceId = -1;
        this.mIsTouch = true;
        this.mBinding = ActivityViewBindingsKt.viewBinding(new WatchFaceDetailActivity$special$$inlined$viewBinding$1(new InflateViewBinder(WfActivityWatchFaceDetailBinding.class)));
        this.recommendAdapter = LazyKt__LazyJVMKt.lazy(new q());
        this.stylesAdapter = LazyKt__LazyJVMKt.lazy(new r());
        this.colorAdapter = LazyKt__LazyJVMKt.lazy(new a());
        this.moreColorAdapter = LazyKt__LazyJVMKt.lazy(new o());
        this.mPopView = LazyKt__LazyJVMKt.lazy(new l());
        this.mPopWindow = LazyKt__LazyJVMKt.lazy(new m());
        this.mReplaceDialDialog = LazyKt__LazyJVMKt.lazy(new n());
    }

    private final String A() {
        String string = FileUtils.getAppFileDir(getApplicationContext()).toString();
        String str = File.separator;
        String str2 = string + str + "dial_bg" + str + System.currentTimeMillis() + ".png";
        File parentFile = new File(str2).getParentFile();
        if (parentFile != null) {
            if (parentFile.exists()) {
                File[] fileArrListFiles = parentFile.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        file.delete();
                    }
                }
            } else {
                parentFile.mkdirs();
            }
        }
        this.croppedPath = str2;
        return str2;
    }

    private final void B(Intent data) {
        if (TextUtils.isEmpty(data.getDataString())) {
            return;
        }
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new b(data, A(), null), 2, null);
    }

    private final void C() {
        Uri uriO = o(this.iconPath);
        ClipImageActivity.INSTANCE.actionStart(this, uriO.toString(), A(), r().getCropDialSize(), r().getCropDialRadius(), v().getTransBackgroundPath(), 1026);
    }

    private final void D() {
        r().setMiddleImageParamsByDevice(q().ivDevicePreview);
        r().setMiddleImageParamsByDevice(q().ivDeviceTransparent);
        IDeviceConfig currentDeviceConfig = r().getCurrentDeviceConfig();
        r().setViewLayoutParams(q().ivWatchFaceChange, currentDeviceConfig.getShadowInCardSizeFive());
        q().ivWatchFaceChange.setBackgroundResource(currentDeviceConfig.getPlaceHolderImage());
        q().ivDeviceBg.setImageResource(currentDeviceConfig.getDefaultDeviceImage());
    }

    private final void E() {
        String absolutePath = getCacheDir().getAbsolutePath();
        String str = File.separator;
        String str2 = absolutePath + str + "TEMP_PHOTO" + str;
        File file = new File(str2);
        J(file);
        if (file.mkdirs()) {
            this.iconPath = str2 + System.currentTimeMillis() + ".jpg";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void F() {
        LiveDataExtensionKt.observeState$default(v().getDetailLiveData(), this, null, new c(), 2, null);
        LiveDataExtensionKt.observeState$default(v().getCollectLiveData(), this, null, new d(), 2, null);
        v().getWatchFaceLiveData().observe(this, new Observer<T>() { // from class: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$initLiveData$$inlined$observeWithNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (t == 0) {
                }
                WatchFaceState watchFaceState = (WatchFaceState) t;
                switch (WatchFaceDetailActivity.WhenMappings.$EnumSwitchMapping$0[watchFaceState.getStatus().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        if (watchFaceState.getStatus() == WatchFaceStatus.WAITE_PAY) {
                            this.a.q().btnSync.setDoneColor(R.color.wf_color_btn_pay);
                        } else {
                            this.a.q().btnSync.setDoneColor(R.color.wf_done_color);
                        }
                        this.a.q().btnSync.setState(1, watchFaceState.getStatus().getMsgId() != -1 ? this.a.getString(watchFaceState.getStatus().getMsgId()) : watchFaceState.getStatus().getMsg());
                        break;
                    case 4:
                        if (!this.a.r().isSupportPay()) {
                            this.a.q().btnSync.setState(1, R.string.wf_sync_watch_face);
                        } else {
                            this.a.q().btnSync.setState(1, watchFaceState.getStatus().getMsgId() != -1 ? this.a.getString(watchFaceState.getStatus().getMsgId()) : watchFaceState.getStatus().getMsg());
                        }
                        break;
                    case 5:
                        this.a.P(false);
                        this.a.mStartSyncTime = System.currentTimeMillis();
                        this.a.q().btnSync.setState(3, R.string.wf_sync_watch_face_start);
                        this.a.q().btnSync.setProgress(0.0f);
                        HMLog.info("WatchFaceDetailActivity", WatchFaceDetailActivity.e.a);
                        break;
                    case 6:
                        HMLog.info("WatchFaceDetailActivity", WatchFaceDetailActivity.f.a);
                        WFProgress progress = watchFaceState.getProgress();
                        if (progress != null) {
                            this.a.q().btnSync.setState(3, this.a.getString(R.string.wf_sync_watch_face_loading, new Object[]{progress.getPercent() + "%"}));
                            int i2 = progress.total;
                            this.a.q().btnSync.setProgress(i2 != 0 ? progress.progress / i2 : 0.0f);
                            break;
                        }
                        break;
                    case 7:
                        HMLog.info("WatchFaceDetailActivity", WatchFaceDetailActivity.g.a);
                        WFProgress progress2 = watchFaceState.getProgress();
                        if (progress2 != null) {
                            this.a.q().btnSync.setState(3, this.a.getString(R.string.wf_sync_watch_face_using, new Object[]{progress2.getPercent() + "%"}));
                            int i3 = progress2.total;
                            this.a.q().btnSync.setProgress(i3 != 0 ? progress2.progress / i3 : 0.0f);
                            break;
                        }
                        break;
                    case 8:
                        this.a.mSuccessSyncTime = System.currentTimeMillis();
                        HMLog.info("WatchFaceDetailActivity", WatchFaceDetailActivity.h.a);
                        WFAnalyticHelper.INSTANCE.reportWatchFaceAnalytic("WF_Sync_Success", this.a.mWatchFaceId, Long.valueOf(this.a.mSuccessSyncTime - this.a.mStartSyncTime));
                        this.a.q().btnSync.setState(1, R.string.wf_sync_watch_face_success);
                        LiveDataChannel.INSTANCE.getOperateWatchLiveData().postValue(null);
                        this.a.v().saveDiyImage();
                        ExtensionsKt.finishDelay(this.a, 2000L);
                        break;
                    default:
                        this.a.P(true);
                        WFAnalyticHelper.INSTANCE.reportWatchFaceFailAnalytic("WF_Sync_Fail", this.a.mWatchFaceId, watchFaceState.getStatus().name());
                        HMLog.info("WatchFaceDetailActivity", new WatchFaceDetailActivity.i(watchFaceState));
                        if (watchFaceState.getStatus() == WatchFaceStatus.STORAGE_FULL) {
                            if (this.a.r().isDirectReplaceDial()) {
                                this.a.v().replaceWatchFaceDirectly();
                                break;
                            } else if (this.a.r().isSupportDialReplace()) {
                                this.a.u().show(this.a.getSupportFragmentManager());
                            } else {
                                new TipDialog().show(this.a.getSupportFragmentManager());
                            }
                        } else if (watchFaceState.getStatus().getMsgId() != -1) {
                            WatchFaceDetailActivity watchFaceDetailActivity = this.a;
                            CustomToastKtxKt.showToast((Activity) watchFaceDetailActivity, (CharSequence) watchFaceDetailActivity.getString(watchFaceState.getStatus().getMsgId()), false);
                        }
                        this.a.q().btnSync.setState(1, R.string.wf_sync_watch_face);
                        break;
                }
            }
        });
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WatchFaceDetailActivity$initLiveData$4(this, null), 3, null);
        LiveDataExtensionKt.observeState$default(v().getReplaceDialLiveData(), this, null, new Function1<StateBuilder<WatchFaceState>, Unit>() { // from class: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$initLiveData$5

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function1<Loading<? extends WatchFaceState>, Unit> {
                public final /* synthetic */ WatchFaceDetailActivity a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(WatchFaceDetailActivity watchFaceDetailActivity) {
                    super(1);
                    this.a = watchFaceDetailActivity;
                }

                public final void a(@NotNull Loading<WatchFaceState> loading) {
                    this.a.showLoadingDialog();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends WatchFaceState> loading) {
                    a(loading);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function1<Fail<? extends WatchFaceState>, Unit> {
                public final /* synthetic */ WatchFaceDetailActivity a;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public static final a a = new a();

                    public a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "replace fail";
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(WatchFaceDetailActivity watchFaceDetailActivity) {
                    super(1);
                    this.a = watchFaceDetailActivity;
                }

                public final void a(@NotNull Fail<WatchFaceState> fail) {
                    HMLog.error("", "WatchFaceDetailActivity", fail.getError(), a.a);
                    IconToast.showError(KoinExtKt.getAppContext(), R.string.wf_sync_watch_face_fail);
                    this.a.q().btnSync.setState(1, R.string.wf_sync_watch_face);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends WatchFaceState> fail) {
                    a(fail);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function1<State<? extends WatchFaceState>, Unit> {
                public final /* synthetic */ WatchFaceDetailActivity a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(WatchFaceDetailActivity watchFaceDetailActivity) {
                    super(1);
                    this.a = watchFaceDetailActivity;
                }

                public final void a(@NotNull State<WatchFaceState> state) {
                    this.a.hideLoadingDialog();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(State<? extends WatchFaceState> state) {
                    a(state);
                    return Unit.INSTANCE;
                }
            }

            {
                super(1);
            }

            public final void a(@NotNull StateBuilder<WatchFaceState> stateBuilder) {
                stateBuilder.onLoading(new a(this.a));
                final WatchFaceDetailActivity watchFaceDetailActivity = this.a;
                stateBuilder.onSuccess(new Function1<Success<? extends WatchFaceState>, Unit>() { // from class: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$initLiveData$5.2

                    /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$initLiveData$5$2$WhenMappings */
                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[WatchFaceStatus.values().length];
                            iArr[WatchFaceStatus.REPLACE_SUCCESS.ordinal()] = 1;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    {
                        super(1);
                    }

                    public final void a(@NotNull Success<WatchFaceState> success) {
                        WatchFaceState value = success.getValue();
                        if (value == null) {
                            return;
                        }
                        WatchFaceDetailActivity watchFaceDetailActivity2 = watchFaceDetailActivity;
                        if (WhenMappings.$EnumSwitchMapping$0[value.getStatus().ordinal()] != 1) {
                            IconToast.showError(KoinExtKt.getAppContext(), value.getStatus().getMsgId());
                        } else {
                            watchFaceDetailActivity2.u().dismiss();
                            watchFaceDetailActivity2.v().startToSync();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Success<? extends WatchFaceState> success) {
                        a(success);
                        return Unit.INSTANCE;
                    }
                });
                stateBuilder.onFail(new b(this.a));
                stateBuilder.onCompleted(new c(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<WatchFaceState> stateBuilder) {
                a(stateBuilder);
                return Unit.INSTANCE;
            }
        }, 2, null);
        LiveDataExtensionKt.observeState$default(v().getReportLiveData(), this, null, new j(), 2, null);
        v().getPayDialogLiveData().observe(this, new Observer<T>() { // from class: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity$initLiveData$$inlined$observeWithNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (t == 0) {
                    return;
                }
                StartPayHolder startPayHolderY = this.a.y();
                WatchFaceDetailActivity watchFaceDetailActivity = this.a;
                startPayHolderY.invoke(watchFaceDetailActivity, (ProductCashierParam) t, String.valueOf(watchFaceDetailActivity.mWatchFaceId), this.a.new k());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(WatchFaceDetailActivity watchFaceDetailActivity, ViewHolder viewHolder, int i2, int i3) {
        WatchData item = watchFaceDetailActivity.x().getItem(i3);
        if (item == null) {
            return;
        }
        watchFaceDetailActivity.l(WFStateEvent.WF_DETAIL_RECOMMEND_CLICK_NUM);
        Companion.actionStart$default(INSTANCE, watchFaceDetailActivity, 0, item.getId(), null, FROM_REC_SERIES_LIST, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(WatchFaceDetailActivity watchFaceDetailActivity, ViewHolder viewHolder, int i2, int i3) {
        watchFaceDetailActivity.currentStylePosition = i3;
        watchFaceDetailActivity.z().setItemSelected(i3);
        watchFaceDetailActivity.n(watchFaceDetailActivity.z().getItem(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(WatchFaceDetailActivity watchFaceDetailActivity, ViewHolder viewHolder, int i2, int i3) {
        if (i3 == watchFaceDetailActivity.p().getListData().size() - 1) {
            watchFaceDetailActivity.Q();
            return;
        }
        watchFaceDetailActivity.l("WF_Function_Colour_Click");
        watchFaceDetailActivity.w().setSelectPosition(-1);
        watchFaceDetailActivity.w().setPrePosition(-1);
        watchFaceDetailActivity.p().updateSelectPosition(i3);
        watchFaceDetailActivity.R(watchFaceDetailActivity.p().getListData().get(i3).intValue());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    private final boolean J(File file) {
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
                    J(file2);
                }
                zDelete = file.delete();
            }
        }
        return zDelete;
    }

    private final void K(boolean isHighPowerCost) {
        if (!isHighPowerCost) {
            q().tvWatchFaceName.setPaddingRelative(0, 0, ExtensionsKt.getDp(30), 0);
            return;
        }
        if (ViewExtKt.getStartDistanceOnScreen(q().ivIsCollect) - (ViewExtKt.getStartDistanceOnScreen(q().tvPowerConsumptionShort) + q().tvPowerConsumptionShort.getWidth()) >= ExtensionsKt.getDp(10)) {
            ExtensionsKt.visible(q().tvPowerConsumptionShort);
        } else {
            q().tvWatchFaceName.setPaddingRelative(0, 0, ExtensionsKt.getDp(30), 0);
            ExtensionsKt.visible(q().tvPowerConsumptionLong);
        }
    }

    private final void L() {
        q().publisherNameTv.setMaxWidth((GlobalFunctionKt.screenWidth() - q().packageInfoLayout.getWidth()) - ExtensionsKt.getDp(60));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(WatchFaceDetailActivity watchFaceDetailActivity, WatchFaceDetailBean watchFaceDetailBean) {
        watchFaceDetailActivity.K(watchFaceDetailBean.isHighPowerCost());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(WatchFaceDetailActivity watchFaceDetailActivity) {
        watchFaceDetailActivity.L();
    }

    private final void O(WatchFaceDetailBean watchFaceDetailBean) {
        if (!r().isSupportPay()) {
            ExtensionsKt.gone(q().moneyTv);
            ExtensionsKt.gone(q().packageSizeDivider);
        } else {
            if (watchFaceDetailBean.isFree()) {
                q().moneyTv.setText(getString(R.string.wf_free));
                return;
            }
            String currencyCode = watchFaceDetailBean.getCurrencyCode();
            if (currencyCode == null) {
                return;
            }
            q().moneyTv.setText(MoneyFormatterFactory.INSTANCE.getFormatter(currencyCode).getMoney(Float.valueOf(watchFaceDetailBean.getPrice())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(boolean isTouch) {
        this.mIsTouch = isTouch;
        if (isTouch) {
            getWindow().clearFlags(16);
        } else {
            getWindow().setFlags(16, 16);
        }
    }

    private final void Q() {
        ((RecyclerView) s().findViewById(R.id.rl_more_color)).setAdapter(w());
        t().showAtAnchorView(q().rlColorList, 1, 3, -ExtensionsKt.getDp(15), ExtensionsKt.getDp(42), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(int color) {
        v().setSelectedColor(Integer.valueOf(color));
        ExtensionsKt.setTintColor$default(q().ivDeviceTransparent, color, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(String event) {
        WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, event, null, kotlin.collections.q.mapOf(TuplesKt.to("WatchFaceId", String.valueOf(this.mWatchFaceId))), null, 10, null);
    }

    private final void m(boolean isFree) {
        String stringExtra = getIntent().getStringExtra("from");
        if (stringExtra == null) {
            stringExtra = "";
        }
        WFAnalyticHelper wFAnalyticHelper = WFAnalyticHelper.INSTANCE;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("WatchFaceId", String.valueOf(this.mWatchFaceId));
        pairArr[1] = TuplesKt.to(WFStateEvent.WF_IS_PAY, isFree ? "free" : "paid");
        pairArr[2] = TuplesKt.to("From", stringExtra);
        WFAnalyticHelper.analyticCount$default(wFAnalyticHelper, "WF_Detail_ViewNum", null, kotlin.collections.r.mapOf(pairArr), null, 10, null);
    }

    private final void n(WatchFaceDetailBean data) {
        v().setDetailData(data);
        setData(data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uri o(String filePath) {
        return Build.VERSION.SDK_INT >= 24 ? FileProvider.getUriForFile(this, WFConstant.INSTANCE.getFILE_PROVIDER_AUTH(), new File(filePath)) : Uri.fromFile(new File(filePath));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ColorAdapter p() {
        return (ColorAdapter) this.colorAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WfActivityWatchFaceDetailBinding q() {
        return (WfActivityWatchFaceDetailBinding) this.mBinding.getValue(this, z[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceConfigManager r() {
        return (DeviceConfigManager) this.mDeviceConfigManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View s() {
        return (View) this.mPopView.getValue();
    }

    private final SmartPopupWindow t() {
        return (SmartPopupWindow) this.mPopWindow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReplaceDialDialog u() {
        return (ReplaceDialDialog) this.mReplaceDialDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WatchFaceDetailViewModel v() {
        return (WatchFaceDetailViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ColorAdapter w() {
        return (ColorAdapter) this.moreColorAdapter.getValue();
    }

    private final WatchFaceAdapter x() {
        return (WatchFaceAdapter) this.recommendAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StartPayHolder y() {
        return (StartPayHolder) this.startPayHolder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StyleWatchAdapter z() {
        return (StyleWatchAdapter) this.stylesAdapter.getValue();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    @NotNull
    public ViewBinding getBinding() {
        return q();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    @NotNull
    public int[] getContainerIds() {
        return new int[]{R.id.layout_container, R.id.sync_area};
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    public void initView() {
        StatusBarUtil.setStatusBarColor(this, ContextCompat.getColor(this, R.color.wf_home_background_color));
        Intent intent = getIntent();
        if (intent != null) {
            this.mWatchFaceId = intent.getIntExtra(WATCH_FACE_ID, -1);
            this.mPageMode = intent.getIntExtra("source", 0);
            int intExtra = intent.getIntExtra("color", -1);
            if (intExtra != -1) {
                v().setSelectedColor(Integer.valueOf(intExtra));
            }
            if (this.mPageMode == 1) {
                ExtensionsKt.gone(q().ivIsCollect);
                ExtensionsKt.gone(q().groupRecommend);
            }
        }
        D();
        q().rlRecommend.setAdapter(x());
        x().setOnItemClickListener(new BaseRVAdapter.OnItemClickListener() { // from class: if8
            @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter.OnItemClickListener
            public final void onItemClick(ViewHolder viewHolder, int i2, int i3) {
                WatchFaceDetailActivity.G(this.a, viewHolder, i2, i3);
            }
        });
        q().rlStyleList.setAdapter(z());
        q().rlStyleList.addItemDecoration(new DividerItemDecoration());
        z().setOnItemClickListener(new BaseRVAdapter.OnItemClickListener() { // from class: gf8
            @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter.OnItemClickListener
            public final void onItemClick(ViewHolder viewHolder, int i2, int i3) {
                WatchFaceDetailActivity.H(this.a, viewHolder, i2, i3);
            }
        });
        q().rlColorList.setAdapter(p());
        p().setOnItemClickListener(new BaseRVAdapter.OnItemClickListener() { // from class: hf8
            @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter.OnItemClickListener
            public final void onItemClick(ViewHolder viewHolder, int i2, int i3) {
                WatchFaceDetailActivity.I(this.a, viewHolder, i2, i3);
            }
        });
        q().ivIsCollect.setOnClickListener(this);
        q().btnSync.setOnClickListener(this);
        q().ivWatchFaceChange.setOnClickListener(this);
        q().flImage.setOnClickListener(this);
        F();
        E();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    public void loadData() {
        v().getWatchFaceDetail(this.mPageMode, this.mWatchFaceId);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        HMLog.info(A, new p(requestCode, resultCode));
        if (resultCode == -1) {
            switch (requestCode) {
                case 1024:
                    if (data != null) {
                        B(data);
                        break;
                    }
                    break;
                case 1025:
                    C();
                    break;
                case 1026:
                    v().setBgPath(this.croppedPath);
                    ExtensionsKt.loadWithRadius(q().ivDevicePreview, this.croppedPath, r().getCurrentDeviceConfig().getRadiusOne());
                    break;
            }
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mIsTouch) {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        WatchFaceDetailBean detailData;
        if (Intrinsics.areEqual(v, q().ivIsCollect)) {
            l("WF_Favourite_ClickNum");
            v().collectOrNoWatchFace(this.mWatchFaceId);
            return;
        }
        if (Intrinsics.areEqual(v, q().btnSync)) {
            if (v().getDetailData() == null) {
                return;
            }
            l("WF_Download_ClickNum");
            v().startToSync();
            return;
        }
        if (Intrinsics.areEqual(v, q().ivWatchFaceChange)) {
            l("WF_Function_Background_Click");
            SelectImageFragment.INSTANCE.newInstance(1023).show(getSupportFragmentManager());
            return;
        }
        if (!Intrinsics.areEqual(v, q().flImage) || (detailData = v().getDetailData()) == null) {
            return;
        }
        l("WF_Picture_Click");
        String str = this.croppedPath;
        String bgPath = null;
        if (str != null && new File(str).exists()) {
            bgPath = this.croppedPath;
        }
        if (bgPath == null && (bgPath = detailData.getBgPath()) == null && (bgPath = detailData.getMetas().getGif()) == null) {
            bgPath = detailData.getImage();
        }
        LargeWatchFaceActivity.INSTANCE.actionStart(this, detailData.getMetas().getPreviewImage(), bgPath, detailData.getMetas().getTransparentBackground(), v().getSelectedColor());
    }

    public final void openGallery() {
        Intent intent = new Intent();
        intent.setType(UriGetter.ShareContentType.IMAGE);
        intent.setAction("android.intent.action.GET_CONTENT");
        startActivityForResult(intent, 1024);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    public <T> void setData(T data) {
        boolean z2;
        String name;
        super.setData(data);
        Unit unit = null;
        final WatchFaceDetailBean watchFaceDetailBean = data instanceof WatchFaceDetailBean ? (WatchFaceDetailBean) data : null;
        if (watchFaceDetailBean == null) {
            return;
        }
        v().setBtnText();
        this.mWatchFaceId = watchFaceDetailBean.getId();
        q().tvWatchFaceName.setText(watchFaceDetailBean.getName());
        q().tvWatchFaceName.post(new Runnable() { // from class: kf8
            @Override // java.lang.Runnable
            public final void run() {
                WatchFaceDetailActivity.M(this.a, watchFaceDetailBean);
            }
        });
        int i2 = 0;
        q().packageSizeTv.setText(getString(R.string.wf_package_size_holder, new Object[]{FormatUtil.INSTANCE.gePackageRoundSize(watchFaceDetailBean.getSize())}));
        O(watchFaceDetailBean);
        Publisher publisher = watchFaceDetailBean.getPublisher();
        if (publisher != null && (name = publisher.getName()) != null) {
            q().publisherNameTv.setText(getString(R.string.wf_watch_author, new Object[]{name}));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            ExtensionsKt.gone(q().publisherNameTv);
            ExtensionsKt.gone(q().publisherNameDivider);
            q().packageSizeTv.setPadding(0, 0, 0, 0);
        }
        q().publisherNameTv.post(new Runnable() { // from class: jf8
            @Override // java.lang.Runnable
            public final void run() {
                WatchFaceDetailActivity.N(this.a);
            }
        });
        String description = watchFaceDetailBean.getDescription();
        if (description == null) {
            z2 = false;
        } else if (description.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            ExtensionsKt.gone(q().tvWatchFaceIntro);
        } else {
            q().tvWatchFaceIntro.setText(watchFaceDetailBean.getDescription());
        }
        q().ivIsCollect.setImageResource(watchFaceDetailBean.isCollect() ? R.drawable.wf_ic_collected : R.drawable.wf_ic_uncollect);
        v().setCollected(watchFaceDetailBean.isCollect());
        v().setWatchFaceUrl(watchFaceDetailBean.getDownloadUrl());
        v().setTransBackgroundPath(watchFaceDetailBean.getMetas().getTransparentBackground());
        if (this.mPageMode == 1) {
            v().setBgPath(watchFaceDetailBean.getBgPath());
        }
        List<WatchData> recommend = watchFaceDetailBean.getRecommend();
        if (recommend != null) {
            x().addAll(recommend);
        }
        if (watchFaceDetailBean.getCustomizable()) {
            ExtensionsKt.visible(q().tvDiyTip);
            ExtensionsKt.visible(q().groupDiy);
            ExtensionsKt.visible(q().groupColor);
            if (this.mPageMode == 1) {
                ExtensionsKt.gone(q().groupStyle);
            } else {
                ExtensionsKt.visible(q().groupStyle);
            }
            List<WatchFaceDetailBean> styles = watchFaceDetailBean.getStyles();
            if (styles != null) {
                for (T t : styles) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    WatchFaceDetailBean watchFaceDetailBean2 = (WatchFaceDetailBean) t;
                    if (watchFaceDetailBean2.getId() == watchFaceDetailBean.getId()) {
                        this.currentStylePosition = i2;
                        watchFaceDetailBean2.setSelected(true);
                    }
                    i2 = i3;
                }
                z().addAll(styles);
            }
        } else {
            ExtensionsKt.gone(q().tvDiyTip);
        }
        if (!r().isSupportDialStyle()) {
            ExtensionsKt.gone(q().groupStyle);
        }
        if (!r().isSupportDialColor()) {
            ExtensionsKt.gone(q().groupColor);
        }
        ExtensionsKt.loadUrl(q().ivDeviceBg, watchFaceDetailBean.getMetas().getDeviceImage());
        int dialRadiusInCard = KoinExtKt.getDeviceConfigManager().getCurrentDeviceConfig().getDialRadiusInCard();
        String bgPath = watchFaceDetailBean.getBgPath();
        if (bgPath == null && (bgPath = this.croppedPath) == null && (bgPath = watchFaceDetailBean.getMetas().getGif()) == null) {
            bgPath = watchFaceDetailBean.getImage();
        }
        ExtensionsKt.loadWithRadius(q().ivDevicePreview, bgPath, dialRadiusInCard);
        ExtensionsKt.loadUrlAndHintColor(q().ivDeviceTransparent, watchFaceDetailBean.getMetas().getTransparentBackground(), v().getSelectedColor());
        m(watchFaceDetailBean.isFree());
    }

    public final void takePhoto() {
        startActivityForResult(new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", o(this.iconPath)), 1025);
    }
}
