package com.huami.watchfacesstore.ui.store.detail;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.Loading;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.http.HttpError;
import com.huami.pay.service.ProductCashierParam;
import com.huami.privacy.moneyformat.MoneyFormatterFactory;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.bean.Metas;
import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import com.huami.watchfacesstore.bean.Publisher;
import com.huami.watchfacesstore.bean.WatchFaceDetailBean;
import com.huami.watchfacesstore.device.WFDeviceManager;
import com.huami.watchfacesstore.device.WFDeviceManagerFactory;
import com.huami.watchfacesstore.device.WatchFaceState;
import com.huami.watchfacesstore.device.WatchFaceStatus;
import com.huami.watchfacesstore.device.channel.DeviceInfo;
import com.huami.watchfacesstore.device.channel.IDeviceManager;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.repo.WatchFaceDetailRepo;
import com.huami.watchfacesstore.repo.WatchFaceStatusRepo;
import com.huami.watchfacesstore.room.WatchFaceInfo;
import com.huami.watchfacesstore.room.publisher.PublisherInfo;
import com.huami.watchfacesstore.ui.DownLoadState;
import com.huami.watchfacesstore.ui.LiveDataChannel;
import com.huami.watchfacesstore.ui.WFConstant;
import com.huami.watchfacesstore.ui.WatchFaceManager;
import com.huami.watchfacesstore.ui.base.BaseViewModel;
import com.huami.watchfacesstore.usecase.CheckFaceDownloadUseCase;
import com.huami.watchfacesstore.usecase.CheckUpdateNotPayUseCase;
import com.huami.watchfacesstore.usecase.CheckUpdateUseCase;
import com.huami.watchfacesstore.usecase.DownFaceImgUseCase;
import com.huami.watchfacesstore.usecase.DownloadFaceUseCase;
import com.huami.watchfacesstore.util.PayUtil;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 ¡\u00012\u00020\u0001:\u0002¡\u0001B\u0019\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J!\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002J\u0013\u0010\u0012\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000bJ\u0013\u0010\u0013\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000bJ\u001b\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000bJ\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0002J\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\"\u001a\u00020\u0004J\u0006\u0010#\u001a\u00020\u0004J\u0006\u0010$\u001a\u00020\u0004R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R%\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0,0+8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R%\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0,0+8\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00170+8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b4\u0010/R\u001c\u00108\u001a\b\u0012\u0004\u0012\u0002060+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010-R\u001f\u0010>\u001a\b\u0012\u0004\u0012\u000206098\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R$\u0010E\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR4\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F0,0+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010-\u001a\u0004\bH\u0010/\"\u0004\bI\u0010JR.\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170,0+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010-\u001a\u0004\bM\u0010/\"\u0004\bN\u0010JR\"\u0010R\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0016\u0010^\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010XR$\u0010a\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010X\u001a\u0004\b_\u0010Z\"\u0004\b`\u0010\\R\u0018\u0010c\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010XR$\u0010f\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010X\u001a\u0004\bd\u0010Z\"\u0004\be\u0010\\R$\u0010l\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001d\u0010p\u001a\u00020m8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010n\u001a\u0004\b?\u0010oR\u001d\u0010s\u001a\u00020q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010n\u001a\u0004\b:\u0010rR\u001d\u0010w\u001a\u00020t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010n\u001a\u0004\b7\u0010vR\u001d\u0010{\u001a\u00020x8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010n\u001a\u0004\bP\u0010zR\u001d\u0010\u007f\u001a\u00020|8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010n\u001a\u0004\bL\u0010~R\u001a\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R(\u0010\u008e\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0,0+8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010-\u001a\u0005\b\u008d\u0001\u0010/R \u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100\u008f\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R%\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100\u0093\u00018\u0006@\u0006¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R!\u0010\u009a\u0001\u001a\u0004\u0018\u00010V8B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0005\b\u0099\u0001\u0010n\u001a\u0004\bb\u0010ZR \u0010\u009c\u0001\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010n\u001a\u0005\b\u009c\u0001\u0010SR\u0018\u0010\u009e\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010Q\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006¢\u0001"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/detail/WatchFaceDetailViewModel;", "Lcom/huami/watchfacesstore/ui/base/BaseViewModel;", "", WatchFaceDetailActivity.WATCH_FACE_ID, "", GoogleApiAvailabilityLight.b, "m", "Lkotlin/Pair;", "", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", com.google.android.exoplayer2.text.ttml.b.r, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "b", "c", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/watchfacesstore/ui/DownLoadState;", "i", SOAP.XMLNS, "r", "id", DTransferConstants.SEARCH_KEY, "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "a", "pageFrom", "getWatchFaceDetail", "collectOrNoWatchFace", "getDeviceWatchFaceFromOnline", "startToSync", "chooseId", "replaceWatchFace", "replaceWatchFaceDirectly", "reportDownload", "saveDiyImage", "setBtnText", "doWhenPaySuccess", "Lcom/huami/watchfacesstore/repo/WatchFaceDetailRepo;", "Lcom/huami/watchfacesstore/repo/WatchFaceDetailRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;", "Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;", "watchFaceStatusRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "Landroidx/lifecycle/MutableLiveData;", "getDetailLiveData", "()Landroidx/lifecycle/MutableLiveData;", "detailLiveData", GoogleApiAvailabilityLight.a, "getCollectLiveData", "collectLiveData", "getWatchFaceLiveData", "watchFaceLiveData", "Lcom/huami/pay/service/ProductCashierParam;", "f", "_payDialogLiveData", "Landroidx/lifecycle/LiveData;", "g", "Landroidx/lifecycle/LiveData;", "getPayDialogLiveData", "()Landroidx/lifecycle/LiveData;", "payDialogLiveData", "h", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "getDetailData", "()Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "setDetailData", "(Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;)V", "detailData", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "getDeviceDialLiveData", "setDeviceDialLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "deviceDialLiveData", z.j, "getReplaceDialLiveData", "setReplaceDialLiveData", "replaceDialLiveData", hl.k, "Z", "isCollected", "()Z", "setCollected", "(Z)V", "", "l", "Ljava/lang/String;", "getWatchFaceUrl", "()Ljava/lang/String;", "setWatchFaceUrl", "(Ljava/lang/String;)V", "watchFaceUrl", "watchFacePath", "getTransBackgroundPath", "setTransBackgroundPath", "transBackgroundPath", "o", "gifPath", "getBgPath", "setBgPath", "bgPath", "Ljava/lang/Integer;", "getSelectedColor", "()Ljava/lang/Integer;", "setSelectedColor", "(Ljava/lang/Integer;)V", "selectedColor", "Lcom/huami/watchfacesstore/usecase/CheckUpdateUseCase;", "Lkotlin/Lazy;", "()Lcom/huami/watchfacesstore/usecase/CheckUpdateUseCase;", "checkUpdateUseCase", "Lcom/huami/watchfacesstore/usecase/CheckUpdateNotPayUseCase;", "()Lcom/huami/watchfacesstore/usecase/CheckUpdateNotPayUseCase;", "checkUpdateNotPayUseCase", "Lcom/huami/watchfacesstore/usecase/CheckFaceDownloadUseCase;", "t", "()Lcom/huami/watchfacesstore/usecase/CheckFaceDownloadUseCase;", "checkFaceDownloadUseCase", "Lcom/huami/watchfacesstore/usecase/DownloadFaceUseCase;", "u", "()Lcom/huami/watchfacesstore/usecase/DownloadFaceUseCase;", "downloadFaceUseCase", "Lcom/huami/watchfacesstore/usecase/DownFaceImgUseCase;", "v", "()Lcom/huami/watchfacesstore/usecase/DownFaceImgUseCase;", "downloadFaceImgUseCase", "Lcom/huami/watchfacesstore/device/channel/DeviceInfo;", "w", "Lcom/huami/watchfacesstore/device/channel/DeviceInfo;", "mDeviceInfo", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "x", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "mDeviceManager", "Lcom/huami/watchfacesstore/device/WFDeviceManager;", "y", "Lcom/huami/watchfacesstore/device/WFDeviceManager;", "operateManager", "z", "getReportLiveData", "reportLiveData", "Lkotlinx/coroutines/flow/MutableSharedFlow;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_downloadStatusFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "B", "Lkotlinx/coroutines/flow/SharedFlow;", "getDownloadStatusFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "downloadStatusFlow", "C", "watchFaceParentPath", LogUtil.D, "isSupportPay", "E", "isUpdate", "<init>", "(Lcom/huami/watchfacesstore/repo/WatchFaceDetailRepo;Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceDetailViewModel extends BaseViewModel {

    @NotNull
    private static final String F = "WatchFaceDetailViewModel";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final MutableSharedFlow<DownLoadState> _downloadStatusFlow;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final SharedFlow<DownLoadState> downloadStatusFlow;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchFaceParentPath;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Lazy isSupportPay;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean isUpdate;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WatchFaceDetailRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final WatchFaceStatusRepo watchFaceStatusRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<WatchFaceDetailBean>> detailLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<Boolean>> collectLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<WatchFaceState> watchFaceLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ProductCashierParam> _payDialogLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<ProductCashierParam> payDialogLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private WatchFaceDetailBean detailData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<State<List<MyWatchFaceBean>>> deviceDialLiveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<State<WatchFaceState>> replaceDialLiveData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isCollected;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private String watchFaceUrl;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private String watchFacePath;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private String transBackgroundPath;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private String gifPath;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private String bgPath;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private Integer selectedColor;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Lazy checkUpdateUseCase;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Lazy checkUpdateNotPayUseCase;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final Lazy checkFaceDownloadUseCase;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final Lazy downloadFaceUseCase;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final Lazy downloadFaceImgUseCase;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final DeviceInfo mDeviceInfo;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final IDeviceManager mDeviceManager;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final WFDeviceManager operateManager;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<Boolean>> reportLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel", f = "WatchFaceDetailViewModel.kt", i = {}, l = {444}, m = "checkWatchFaceStatus", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return WatchFaceDetailViewModel.this.a(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$collectOrNoWatchFace$1", f = "WatchFaceDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super State<? extends Boolean>>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, Continuation<? super b> continuation) {
            super(1, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return WatchFaceDetailViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Boolean>> continuation) {
            return invoke2((Continuation<? super State<Boolean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Boolean>> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (WatchFaceDetailViewModel.this.getIsCollected()) {
                WatchFaceDetailViewModel.this.repo.deleteCollectWatchFace(WatchFaceDetailViewModel.this.mDeviceInfo.getDeviceId(), String.valueOf(this.c));
            } else {
                WatchFaceDetailViewModel.this.repo.collectWatchFace(WatchFaceDetailViewModel.this.mDeviceInfo.getDeviceId(), String.valueOf(this.c));
            }
            WatchFaceDetailViewModel watchFaceDetailViewModel = WatchFaceDetailViewModel.this;
            watchFaceDetailViewModel.setCollected(!watchFaceDetailViewModel.getIsCollected());
            return new Success(Boxing.boxBoolean(WatchFaceDetailViewModel.this.getIsCollected()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$delLocalBean$2", f = "WatchFaceDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchFaceDetailViewModel.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (WatchFaceDetailViewModel.this.watchFacePath.length() > 0) {
                File file = new File(WatchFaceDetailViewModel.this.watchFacePath);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel", f = "WatchFaceDetailViewModel.kt", i = {0}, l = {FTPCodes.NAME_SYSTEM_TIME, 217}, m = "doUpdate", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return WatchFaceDetailViewModel.this.e(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$doWhenPaySuccess$1", f = "WatchFaceDetailViewModel.kt", i = {}, l = {483}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchFaceDetailViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchFaceDetailBean detailData = WatchFaceDetailViewModel.this.getDetailData();
                if (detailData != null) {
                    WatchFaceStatusRepo watchFaceStatusRepo = WatchFaceDetailViewModel.this.watchFaceStatusRepo;
                    int id = detailData.getId();
                    this.a = 1;
                    if (watchFaceStatusRepo.notifyPurchased(id, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$getDeviceWatchFaceFromOnline$1", f = "WatchFaceDetailViewModel.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function1<Continuation<? super State<? extends List<? extends MyWatchFaceBean>>>, Object> {
        public int a;

        public f(Continuation<? super f> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return WatchFaceDetailViewModel.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends List<? extends MyWatchFaceBean>>> continuation) {
            return invoke2((Continuation<? super State<? extends List<MyWatchFaceBean>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<? extends List<MyWatchFaceBean>>> continuation) {
            return ((f) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws HttpError {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String strJoinToString$default = ArraysKt___ArraysKt.joinToString$default(WatchFaceDetailViewModel.this.mDeviceManager.getAllWatchFaceIds(), (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                WatchFaceDetailRepo watchFaceDetailRepo = WatchFaceDetailViewModel.this.repo;
                String deviceId = WatchFaceDetailViewModel.this.mDeviceInfo.getDeviceId();
                this.a = 1;
                obj = watchFaceDetailRepo.getMyWatchList(deviceId, strJoinToString$default, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (Boxing.boxBoolean(!((MyWatchFaceBean) obj2).getOfficialBuiltin()).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            return new Success(arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/watchfacesstore/ui/DownLoadState;", "beanStatus", "imgStatus", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$getDownloadBinAndImgFlow$1", f = "WatchFaceDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function3<DownLoadState, DownLoadState, Continuation<? super DownLoadState>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ DownLoadState a;
            public final /* synthetic */ DownLoadState b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DownLoadState downLoadState, DownLoadState downLoadState2) {
                super(0);
                this.a = downLoadState;
                this.b = downLoadState2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "getDownloadBinAndImgFlow " + this.a + "," + this.b;
            }
        }

        public g(Continuation<? super g> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull DownLoadState downLoadState, @NotNull DownLoadState downLoadState2, @Nullable Continuation<? super DownLoadState> continuation) {
            g gVar = new g(continuation);
            gVar.b = downLoadState;
            gVar.c = downLoadState2;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DownLoadState downLoadState = (DownLoadState) this.b;
            DownLoadState downLoadState2 = (DownLoadState) this.c;
            HMLog.debug(WatchFaceDetailViewModel.F, new a(downLoadState, downLoadState2));
            return (!(downLoadState instanceof DownLoadState.SUCCESS) || Intrinsics.areEqual(downLoadState2, DownLoadState.SUCCESS.INSTANCE)) ? downLoadState : new DownLoadState.PROGRESS(100);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$getWatchFaceDetailByLocal$1", f = "WatchFaceDetailViewModel.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function1<Continuation<? super State<? extends WatchFaceDetailBean>>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i, Continuation<? super h> continuation) {
            super(1, continuation);
            this.d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return WatchFaceDetailViewModel.this.new h(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends WatchFaceDetailBean>> continuation) {
            return invoke2((Continuation<? super State<WatchFaceDetailBean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<WatchFaceDetailBean>> continuation) {
            return ((h) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WatchFaceDetailViewModel watchFaceDetailViewModel;
            String downloadUrl;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchFaceDetailViewModel watchFaceDetailViewModel2 = WatchFaceDetailViewModel.this;
                WatchFaceDetailRepo watchFaceDetailRepo = watchFaceDetailViewModel2.repo;
                String deviceId = WatchFaceDetailViewModel.this.mDeviceInfo.getDeviceId();
                int i2 = this.d;
                this.a = watchFaceDetailViewModel2;
                this.b = 1;
                Object watchFaceDetailByLocal = watchFaceDetailRepo.getWatchFaceDetailByLocal(deviceId, i2, this);
                if (watchFaceDetailByLocal == coroutine_suspended) {
                    return coroutine_suspended;
                }
                watchFaceDetailViewModel = watchFaceDetailViewModel2;
                obj = watchFaceDetailByLocal;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                watchFaceDetailViewModel = (WatchFaceDetailViewModel) this.a;
                ResultKt.throwOnFailure(obj);
            }
            watchFaceDetailViewModel.setDetailData((WatchFaceDetailBean) obj);
            WatchFaceDetailViewModel watchFaceDetailViewModel3 = WatchFaceDetailViewModel.this;
            WatchFaceDetailBean detailData = watchFaceDetailViewModel3.getDetailData();
            String str = "";
            if (detailData != null && (downloadUrl = detailData.getDownloadUrl()) != null) {
                str = downloadUrl;
            }
            watchFaceDetailViewModel3.setWatchFaceUrl(str);
            return new Success(WatchFaceDetailViewModel.this.getDetailData());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$getWatchFaceDetailByOnline$1", f = "WatchFaceDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function1<Continuation<? super State<? extends WatchFaceDetailBean>>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i, Continuation<? super i> continuation) {
            super(1, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return WatchFaceDetailViewModel.this.new i(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends WatchFaceDetailBean>> continuation) {
            return invoke2((Continuation<? super State<WatchFaceDetailBean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<WatchFaceDetailBean>> continuation) {
            return ((i) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WatchFaceDetailViewModel watchFaceDetailViewModel = WatchFaceDetailViewModel.this;
            watchFaceDetailViewModel.setDetailData(WatchFaceDetailRepo.getWatchFaceDetailByOnline$default(watchFaceDetailViewModel.repo, WatchFaceDetailViewModel.this.mDeviceInfo.getDeviceId(), this.c, null, 4, null));
            return new Success(WatchFaceDetailViewModel.this.getDetailData());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel", f = "WatchFaceDetailViewModel.kt", i = {0}, l = {163}, m = "hasDownload", n = {"this"}, s = {"L$0"})
    public static final class j extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return WatchFaceDetailViewModel.this.p(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Boolean> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return KoinExtKt.getSettingRepo().isSupportPay();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$replaceWatchFace$1", f = "WatchFaceDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/device/WatchFaceState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<WatchFaceState, Unit> {
            public final /* synthetic */ WatchFaceDetailViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceDetailViewModel watchFaceDetailViewModel) {
                super(1);
                this.a = watchFaceDetailViewModel;
            }

            public final void a(@NotNull WatchFaceState watchFaceState) {
                this.a.getReplaceDialLiveData().postValue(new Success(watchFaceState));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchFaceState watchFaceState) {
                a(watchFaceState);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(int i, Continuation<? super l> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchFaceDetailViewModel.this.new l(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WatchFaceDetailViewModel.this.getReplaceDialLiveData().postValue(new Loading());
            WatchFaceDetailViewModel.this.operateManager.replaceWatchFace(this.c, new a(WatchFaceDetailViewModel.this));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$replaceWatchFaceDirectly$2", f = "WatchFaceDetailViewModel.kt", i = {}, l = {AMapEngineUtils.ARROW_LINE_SHADOW_TEXTURE_ID}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/device/WatchFaceState;", "watchFaceState", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<WatchFaceState, Unit> {
            public final /* synthetic */ WatchFaceDetailViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceDetailViewModel watchFaceDetailViewModel) {
                super(1);
                this.a = watchFaceDetailViewModel;
            }

            public final void a(@NotNull WatchFaceState watchFaceState) {
                this.a.getReplaceDialLiveData().postValue(new Success(watchFaceState));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchFaceState watchFaceState) {
                a(watchFaceState);
                return Unit.INSTANCE;
            }
        }

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchFaceDetailViewModel.this.new m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws HttpError {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String strJoinToString$default = ArraysKt___ArraysKt.joinToString$default(WatchFaceDetailViewModel.this.mDeviceManager.getAllWatchFaceIds(), (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                WatchFaceDetailRepo watchFaceDetailRepo = WatchFaceDetailViewModel.this.repo;
                String deviceId = WatchFaceDetailViewModel.this.mDeviceInfo.getDeviceId();
                this.a = 1;
                obj = watchFaceDetailRepo.getMyWatchList(deviceId, strJoinToString$default, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (Boxing.boxBoolean(!((MyWatchFaceBean) obj2).getOfficialBuiltin()).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Boxing.boxInt(((MyWatchFaceBean) it2.next()).getBuiltinId()));
            }
            Integer num = (Integer) CollectionsKt.firstOrNull((List) arrayList2);
            if (num != null) {
                WatchFaceDetailViewModel watchFaceDetailViewModel = WatchFaceDetailViewModel.this;
                watchFaceDetailViewModel.operateManager.replaceWatchFace(num.intValue(), new a(watchFaceDetailViewModel));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$reportDownload$1", f = "WatchFaceDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function1<Continuation<? super State<? extends Boolean>>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i, Continuation<? super n> continuation) {
            super(1, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return WatchFaceDetailViewModel.this.new n(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Boolean>> continuation) {
            return invoke2((Continuation<? super State<Boolean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Boolean>> continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Success(Boxing.boxBoolean(WatchFaceDetailViewModel.this.repo.reportDownload(WatchFaceDetailViewModel.this.mDeviceInfo.getDeviceId(), String.valueOf(this.c))));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$saveDiyImage$1", f = "WatchFaceDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "bgName: " + this.a;
            }
        }

        public o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchFaceDetailViewModel.this.new o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Unit unit;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WatchFaceDetailBean detailData = WatchFaceDetailViewModel.this.getDetailData();
            if (detailData != null) {
                WatchFaceDetailViewModel watchFaceDetailViewModel = WatchFaceDetailViewModel.this;
                String bgPath = watchFaceDetailViewModel.getBgPath();
                if (bgPath == null) {
                    unit = null;
                } else {
                    if (watchFaceDetailViewModel.o() != null) {
                        HMLog.debug(WatchFaceDetailViewModel.F, new a(new File(bgPath).getName()));
                        String str = watchFaceDetailViewModel.o() + "/diy_bg";
                        String str2 = str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + System.currentTimeMillis() + ".png";
                        if (!Intrinsics.areEqual(bgPath, str2)) {
                            WatchFaceManager watchFaceManager = WatchFaceManager.INSTANCE;
                            watchFaceManager.copyFile(new File(bgPath), new File(str2));
                            watchFaceManager.delete(str, str2);
                            watchFaceDetailViewModel.repo.updateWatchFaceBgPath(watchFaceDetailViewModel.mDeviceInfo.getDeviceId(), detailData.getId(), str2);
                        }
                    }
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    Boxing.boxInt(watchFaceDetailViewModel.repo.updateWatchFaceBgPath(watchFaceDetailViewModel.mDeviceInfo.getDeviceId(), detailData.getId(), null));
                }
                watchFaceDetailViewModel.repo.updateWatchFaceColor(watchFaceDetailViewModel.mDeviceInfo.getDeviceId(), detailData.getId(), watchFaceDetailViewModel.getSelectedColor());
                LiveDataChannel.INSTANCE.getLocalWatchLiveData().postValue(null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$saveImageFile$2", f = "WatchFaceDetailViewModel.kt", i = {0, 0}, l = {379, 388}, m = "invokeSuspend", n = {"info", "publisherInfo"}, s = {"L$2", "L$3"})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "start save dialInfo";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "info is null start insert";
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
            public final String invoke() {
                return "info is exist start update";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "database execute fail " + this.a.getMessage();
            }
        }

        public p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchFaceDetailViewModel.this.new p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:52:0x0161 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:6:0x0013, B:11:0x0030, B:52:0x0161, B:54:0x017a, B:53:0x016e, B:48:0x013e), top: B:60:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:53:0x016e A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:6:0x0013, B:11:0x0030, B:52:0x0161, B:54:0x017a, B:53:0x016e, B:48:0x013e), top: B:60:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0197 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WatchFaceDetailBean detailData;
            WatchFaceDetailViewModel watchFaceDetailViewModel;
            WatchFaceInfo watchFaceInfo;
            PublisherInfo publisherInfo;
            Object watchFaceDetailByLocal;
            int id;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.e;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    HMLog.info(WatchFaceDetailViewModel.F, a.a);
                    detailData = WatchFaceDetailViewModel.this.getDetailData();
                    if (detailData != null) {
                        watchFaceDetailViewModel = WatchFaceDetailViewModel.this;
                        if (watchFaceDetailViewModel.o() == null) {
                            return Unit.INSTANCE;
                        }
                        String gif = detailData.getMetas().getGif();
                        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) ((gif == null && (gif = detailData.getImage()) == null) ? "" : gif), new String[]{FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE}, false, 0, 6, (Object) null);
                        String str = watchFaceDetailViewModel.o() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + listSplit$default.get(listSplit$default.size() - 1);
                        if (detailData.getMetas().getGif() != null) {
                            watchFaceDetailViewModel.gifPath = str;
                        }
                        int id2 = detailData.getId();
                        String name = detailData.getName();
                        String description = detailData.getDescription();
                        float rank = detailData.getRank();
                        boolean customizable = detailData.getCustomizable();
                        boolean zIsFree = detailData.isFree();
                        String str2 = watchFaceDetailViewModel.watchFacePath;
                        String transBackgroundPath = watchFaceDetailViewModel.getTransBackgroundPath();
                        String str3 = watchFaceDetailViewModel.gifPath;
                        String deviceId = watchFaceDetailViewModel.mDeviceInfo.getDeviceId();
                        String minimumFirmwareVersion = detailData.getMetas().getMinimumFirmwareVersion();
                        String str4 = minimumFirmwareVersion == null ? "" : minimumFirmwareVersion;
                        int size = detailData.getSize();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Publisher publisher = detailData.getPublisher();
                        Integer numBoxInt = publisher == null ? null : Boxing.boxInt(publisher.getId());
                        String version = detailData.getVersion();
                        watchFaceInfo = new WatchFaceInfo(id2, name, description, rank, 0, customizable, zIsFree, str, str2, transBackgroundPath, str3, deviceId, str4, size, jCurrentTimeMillis, null, null, numBoxInt, version == null ? "" : version, detailData.getPrice(), 98304, null);
                        Publisher publisher2 = detailData.getPublisher();
                        publisherInfo = publisher2 == null ? null : new PublisherInfo(publisher2.getId(), publisher2.getName(), publisher2.getIcon(), publisher2.getDescription());
                        WatchFaceDetailRepo watchFaceDetailRepo = watchFaceDetailViewModel.repo;
                        String deviceId2 = watchFaceDetailViewModel.mDeviceInfo.getDeviceId();
                        int id3 = detailData.getId();
                        this.a = watchFaceDetailViewModel;
                        this.b = detailData;
                        this.c = watchFaceInfo;
                        this.d = publisherInfo;
                        this.e = 1;
                        watchFaceDetailByLocal = watchFaceDetailRepo.getWatchFaceDetailByLocal(deviceId2, id3, this);
                        if (watchFaceDetailByLocal == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (watchFaceDetailByLocal == null) {
                            HMLog.info(WatchFaceDetailViewModel.F, b.a);
                            watchFaceDetailViewModel.repo.insertWatchInfo(watchFaceInfo, publisherInfo);
                        } else {
                            HMLog.info(WatchFaceDetailViewModel.F, c.a);
                            watchFaceDetailViewModel.repo.updateWatchFaceInfo(watchFaceInfo);
                        }
                        LiveDataChannel.INSTANCE.getLocalWatchLiveData().postValue(null);
                        id = detailData.getId();
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = 2;
                        if (watchFaceDetailViewModel.q(id, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i == 1) {
                    publisherInfo = (PublisherInfo) this.d;
                    WatchFaceInfo watchFaceInfo2 = (WatchFaceInfo) this.c;
                    detailData = (WatchFaceDetailBean) this.b;
                    watchFaceDetailViewModel = (WatchFaceDetailViewModel) this.a;
                    ResultKt.throwOnFailure(obj);
                    watchFaceInfo = watchFaceInfo2;
                    watchFaceDetailByLocal = obj;
                    if (watchFaceDetailByLocal == null) {
                        HMLog.info(WatchFaceDetailViewModel.F, b.a);
                        watchFaceDetailViewModel.repo.insertWatchInfo(watchFaceInfo, publisherInfo);
                    } else {
                        HMLog.info(WatchFaceDetailViewModel.F, c.a);
                        watchFaceDetailViewModel.repo.updateWatchFaceInfo(watchFaceInfo);
                    }
                    LiveDataChannel.INSTANCE.getLocalWatchLiveData().postValue(null);
                    id = detailData.getId();
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = 2;
                    if (watchFaceDetailViewModel.q(id, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                HMLog.info(WatchFaceDetailViewModel.F, new d(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$setBtnText$1", f = "WatchFaceDetailViewModel.kt", i = {}, l = {468}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        public q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchFaceDetailViewModel.this.new q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<WatchFaceState> watchFaceLiveData = WatchFaceDetailViewModel.this.getWatchFaceLiveData();
                WatchFaceDetailViewModel watchFaceDetailViewModel = WatchFaceDetailViewModel.this;
                this.a = watchFaceLiveData;
                this.b = 1;
                Object objA = watchFaceDetailViewModel.a(this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = watchFaceLiveData;
                obj = objA;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.a;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/device/WatchFaceState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function1<WatchFaceState, Unit> {
        public r() {
            super(1);
        }

        public final void a(@NotNull WatchFaceState watchFaceState) {
            WatchFaceDetailViewModel.this.getWatchFaceLiveData().postValue(watchFaceState);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchFaceState watchFaceState) {
            a(watchFaceState);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            WatchFaceManager watchFaceManager = WatchFaceManager.INSTANCE;
            String deviceId = WatchFaceDetailViewModel.this.mDeviceInfo.getDeviceId();
            WatchFaceDetailBean detailData = WatchFaceDetailViewModel.this.getDetailData();
            return watchFaceManager.getWatchPathByDeviceAndUrl(deviceId, String.valueOf(detailData == null ? null : Integer.valueOf(detailData.getId())));
        }
    }

    /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$startToSync$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$startToSync$1", f = "WatchFaceDetailViewModel.kt", i = {}, l = {172, 196, 199, 202}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$startToSync$1$WhenMappings */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WatchFaceStatus.values().length];
                iArr[WatchFaceStatus.WAITE_PAY.ordinal()] = 1;
                iArr[WatchFaceStatus.WAITE_UPDATE.ordinal()] = 2;
                iArr[WatchFaceStatus.WAITE_DOWNLOAD.ordinal()] = 3;
                iArr[WatchFaceStatus.WAITE_SYNC.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$startToSync$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ WatchFaceDetailBean a;
            public final /* synthetic */ ProductCashierParam b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceDetailBean watchFaceDetailBean, ProductCashierParam productCashierParam) {
                super(0);
                this.a = watchFaceDetailBean;
                this.b = productCashierParam;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return this.a + "," + this.b;
            }
        }

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$startToSync$1$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ WatchFaceDetailViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(WatchFaceDetailViewModel watchFaceDetailViewModel) {
                super(0);
                this.a = watchFaceDetailViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                WatchFaceDetailBean detailData = this.a.getDetailData();
                String name = detailData == null ? null : detailData.getName();
                WatchFaceDetailBean detailData2 = this.a.getDetailData();
                return "user click pay :" + name + " id:" + (detailData2 != null ? Integer.valueOf(detailData2.getId()) : null);
            }
        }

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$startToSync$1$c */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ WatchFaceDetailViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(WatchFaceDetailViewModel watchFaceDetailViewModel) {
                super(0);
                this.a = watchFaceDetailViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                WatchFaceDetailBean detailData = this.a.getDetailData();
                String name = detailData == null ? null : detailData.getName();
                WatchFaceDetailBean detailData2 = this.a.getDetailData();
                return "update watchface name :" + name + " id:" + (detailData2 != null ? Integer.valueOf(detailData2.getId()) : null);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchFaceDetailViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2 && i != 3 && i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            WatchFaceDetailViewModel watchFaceDetailViewModel = WatchFaceDetailViewModel.this;
            this.a = 1;
            obj = watchFaceDetailViewModel.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[((WatchFaceState) obj).getStatus().ordinal()];
            if (i2 == 1) {
                WatchFaceDetailBean detailData = WatchFaceDetailViewModel.this.getDetailData();
                if (detailData != null) {
                    WatchFaceDetailViewModel watchFaceDetailViewModel2 = WatchFaceDetailViewModel.this;
                    ProductCashierParam productCashierParamGenerateProductParam = PayUtil.INSTANCE.generateProductParam(detailData.getName(), detailData.getCurrencyCode(), detailData.getSkuId(), detailData.getPrice(), detailData.getThirdPartyId(), detailData.getPayChannels());
                    if (productCashierParamGenerateProductParam != null) {
                        HMLog.debug(WatchFaceDetailViewModel.F, new a(detailData, productCashierParamGenerateProductParam));
                        HMLog.info(WFConstant.WF_TAG, new b(watchFaceDetailViewModel2));
                        watchFaceDetailViewModel2._payDialogLiveData.postValue(productCashierParamGenerateProductParam);
                    }
                }
            } else if (i2 == 2) {
                HMLog.info(WFConstant.WF_TAG, new c(WatchFaceDetailViewModel.this));
                WatchFaceDetailViewModel watchFaceDetailViewModel3 = WatchFaceDetailViewModel.this;
                this.a = 2;
                if (watchFaceDetailViewModel3.e(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 == 3) {
                WatchFaceDetailViewModel watchFaceDetailViewModel4 = WatchFaceDetailViewModel.this;
                this.a = 3;
                if (watchFaceDetailViewModel4.c(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 == 4) {
                WatchFaceDetailViewModel watchFaceDetailViewModel5 = WatchFaceDetailViewModel.this;
                this.a = 4;
                if (watchFaceDetailViewModel5.s(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchFaceDetailViewModel(@NotNull WatchFaceDetailRepo watchFaceDetailRepo, @NotNull WatchFaceStatusRepo watchFaceStatusRepo) {
        this.repo = watchFaceDetailRepo;
        this.watchFaceStatusRepo = watchFaceStatusRepo;
        MutableLiveData<ProductCashierParam> mutableLiveData = new MutableLiveData<>();
        this._payDialogLiveData = mutableLiveData;
        this.payDialogLiveData = mutableLiveData;
        this.deviceDialLiveData = new MutableLiveData<>();
        this.replaceDialLiveData = new MutableLiveData<>();
        this.watchFaceUrl = "";
        this.watchFacePath = "";
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.checkUpdateUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<CheckUpdateUseCase>() { // from class: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.watchfacesstore.usecase.CheckUpdateUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CheckUpdateUseCase invoke() {
                Koin koin = GlobalContext.INSTANCE.get();
                return koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(CheckUpdateUseCase.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.checkUpdateNotPayUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<CheckUpdateNotPayUseCase>() { // from class: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.watchfacesstore.usecase.CheckUpdateNotPayUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CheckUpdateNotPayUseCase invoke() {
                Koin koin = GlobalContext.INSTANCE.get();
                return koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(CheckUpdateNotPayUseCase.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.checkFaceDownloadUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<CheckFaceDownloadUseCase>() { // from class: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.watchfacesstore.usecase.CheckFaceDownloadUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CheckFaceDownloadUseCase invoke() {
                Koin koin = GlobalContext.INSTANCE.get();
                return koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(CheckFaceDownloadUseCase.class), objArr4, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.downloadFaceUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DownloadFaceUseCase>() { // from class: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.watchfacesstore.usecase.DownloadFaceUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DownloadFaceUseCase invoke() {
                Koin koin = GlobalContext.INSTANCE.get();
                return koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DownloadFaceUseCase.class), objArr6, objArr7);
            }
        });
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.downloadFaceImgUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DownFaceImgUseCase>() { // from class: com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.watchfacesstore.usecase.DownFaceImgUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DownFaceImgUseCase invoke() {
                Koin koin = GlobalContext.INSTANCE.get();
                return koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DownFaceImgUseCase.class), objArr8, objArr9);
            }
        });
        this.mDeviceInfo = KoinExtKt.getDeviceInfo();
        this.mDeviceManager = KoinExtKt.getDeviceManager();
        this.operateManager = WFDeviceManagerFactory.INSTANCE.getHMDeviceManager();
        this.reportLiveData = new MutableLiveData<>();
        MutableSharedFlow<DownLoadState> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._downloadStatusFlow = mutableSharedFlowMutableSharedFlow$default;
        this.downloadStatusFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.watchFaceParentPath = LazyKt__LazyJVMKt.lazy(new s());
        this.isSupportPay = LazyKt__LazyJVMKt.lazy(k.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Continuation<? super WatchFaceState> continuation) {
        a aVar;
        WatchFaceDetailBean watchFaceDetailBean;
        WatchFaceDetailViewModel watchFaceDetailViewModel;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.e = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            WatchFaceDetailBean detailData = getDetailData();
            if (detailData == null) {
                return new WatchFaceState(WatchFaceStatus.WAITE_DOWNLOAD, null, 2, null);
            }
            if (!detailData.isFree() && !Intrinsics.areEqual(detailData.isPurchased(), Boxing.boxBoolean(true))) {
                WatchFaceStatus watchFaceStatus = WatchFaceStatus.WAITE_PAY;
                watchFaceStatus.setMsg(MoneyFormatterFactory.INSTANCE.getFormatter(detailData.getCurrencyCode()).getMoney(Boxing.boxFloat(detailData.getPrice())));
                Unit unit = Unit.INSTANCE;
                return new WatchFaceState(watchFaceStatus, null, 2, null);
            }
            aVar.a = this;
            aVar.b = detailData;
            aVar.e = 1;
            Object objP = p(aVar);
            if (objP == coroutine_suspended) {
                return coroutine_suspended;
            }
            watchFaceDetailBean = detailData;
            obj = objP;
            watchFaceDetailViewModel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            watchFaceDetailBean = (WatchFaceDetailBean) aVar.b;
            watchFaceDetailViewModel = (WatchFaceDetailViewModel) aVar.a;
            ResultKt.throwOnFailure(obj);
        }
        Pair pair = (Pair) obj;
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            return new WatchFaceState(WatchFaceStatus.WAITE_DOWNLOAD, null, 2, null);
        }
        if (watchFaceDetailViewModel.isSupportPay()) {
            CheckUpdateUseCase checkUpdateUseCaseH = watchFaceDetailViewModel.h();
            String version = watchFaceDetailBean.getVersion();
            WatchFaceDetailBean watchFaceDetailBean2 = (WatchFaceDetailBean) pair.getSecond();
            if (checkUpdateUseCaseH.invoke(version, watchFaceDetailBean2 == null ? null : watchFaceDetailBean2.getVersion())) {
                return new WatchFaceState(WatchFaceStatus.WAITE_UPDATE, null, 2, null);
            }
        } else if (watchFaceDetailViewModel.g().invoke(watchFaceDetailBean.getDownloadUrl(), watchFaceDetailViewModel.watchFacePath)) {
            return new WatchFaceState(WatchFaceStatus.WAITE_UPDATE, null, 2, null);
        }
        return new WatchFaceState(WatchFaceStatus.WAITE_SYNC, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new c(null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(Continuation<? super Unit> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WatchFaceDetailViewModel$doDownloadAndSync$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Continuation<? super Unit> continuation) {
        d dVar;
        WatchFaceDetailViewModel watchFaceDetailViewModel;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                watchFaceDetailViewModel = (WatchFaceDetailViewModel) dVar.a;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.isUpdate = true;
        dVar.a = this;
        dVar.d = 1;
        if (b(dVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        watchFaceDetailViewModel = this;
        dVar.a = null;
        dVar.d = 2;
        if (watchFaceDetailViewModel.c(dVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    private final CheckFaceDownloadUseCase f() {
        return (CheckFaceDownloadUseCase) this.checkFaceDownloadUseCase.getValue();
    }

    private final CheckUpdateNotPayUseCase g() {
        return (CheckUpdateNotPayUseCase) this.checkUpdateNotPayUseCase.getValue();
    }

    private final CheckUpdateUseCase h() {
        return (CheckUpdateUseCase) this.checkUpdateUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<DownLoadState> i() {
        Flow<DownLoadState> flowInvoke;
        if (o() == null) {
            return null;
        }
        Pair<Flow<DownLoadState>, String> pairInvoke = k().invoke(o(), this.watchFaceUrl);
        Flow<DownLoadState> flowComponent1 = pairInvoke.component1();
        this.watchFacePath = pairInvoke.component2();
        WatchFaceDetailBean watchFaceDetailBean = this.detailData;
        if (watchFaceDetailBean == null) {
            flowInvoke = null;
        } else {
            DownFaceImgUseCase downFaceImgUseCaseJ = j();
            String strO = o();
            String gif = watchFaceDetailBean.getMetas().getGif();
            if (gif == null && (gif = watchFaceDetailBean.getImage()) == null) {
                gif = "";
            }
            flowInvoke = downFaceImgUseCaseJ.invoke(strO, gif);
        }
        return flowInvoke != null ? FlowKt.distinctUntilChanged(FlowKt.flowCombine(flowComponent1, flowInvoke, new g(null))) : flowComponent1;
    }

    private final boolean isSupportPay() {
        return ((Boolean) this.isSupportPay.getValue()).booleanValue();
    }

    private final DownFaceImgUseCase j() {
        return (DownFaceImgUseCase) this.downloadFaceImgUseCase.getValue();
    }

    private final DownloadFaceUseCase k() {
        return (DownloadFaceUseCase) this.downloadFaceUseCase.getValue();
    }

    private final void m(int watchFaceId) {
        startWithLoading(this.detailLiveData, new h(watchFaceId, null));
    }

    private final void n(int watchFaceId) {
        startWithLoading(this.detailLiveData, new i(watchFaceId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o() {
        return (String) this.watchFaceParentPath.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(Continuation<? super Pair<Boolean, WatchFaceDetailBean>> continuation) {
        j jVar;
        WatchFaceDetailViewModel watchFaceDetailViewModel;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.d = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object objInvoke = jVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = jVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            CheckFaceDownloadUseCase checkFaceDownloadUseCaseF = f();
            int id = getDetailData().getId();
            jVar.a = this;
            jVar.d = 1;
            objInvoke = checkFaceDownloadUseCaseF.invoke(id, jVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            watchFaceDetailViewModel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            watchFaceDetailViewModel = (WatchFaceDetailViewModel) jVar.a;
            ResultKt.throwOnFailure(objInvoke);
        }
        Pair pair = (Pair) objInvoke;
        boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
        WatchFaceDetailBean watchFaceDetailBean = (WatchFaceDetailBean) pair.component2();
        if (zBooleanValue) {
            watchFaceDetailViewModel.watchFacePath = watchFaceDetailBean.getDownloadUrl();
        }
        return TuplesKt.to(Boxing.boxBoolean(zBooleanValue), watchFaceDetailBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(int i2, Continuation<? super Unit> continuation) {
        if (!this.isUpdate) {
            return Unit.INSTANCE;
        }
        this.isUpdate = false;
        Object objNotifyUpdate = this.watchFaceStatusRepo.notifyUpdate(i2, continuation);
        return objNotifyUpdate == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objNotifyUpdate : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(Continuation<? super Unit> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new p(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(Continuation<? super Unit> continuation) {
        Metas metas;
        Metas metas2;
        WFDeviceManager wFDeviceManager = this.operateManager;
        WatchFaceDetailBean detailData = getDetailData();
        String transparentBackground = null;
        String minimumFirmwareVersion = (detailData == null || (metas = detailData.getMetas()) == null) ? null : metas.getMinimumFirmwareVersion();
        String bgPath = getBgPath();
        Integer selectedColor = getSelectedColor();
        String str = this.watchFacePath;
        WatchFaceDetailBean detailData2 = getDetailData();
        if (detailData2 != null && (metas2 = detailData2.getMetas()) != null) {
            transparentBackground = metas2.getTransparentBackground();
        }
        Object objSyncWatchFace = wFDeviceManager.syncWatchFace(minimumFirmwareVersion, bgPath, selectedColor, str, transparentBackground, new r(), continuation);
        return objSyncWatchFace == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objSyncWatchFace : Unit.INSTANCE;
    }

    public final void collectOrNoWatchFace(int watchFaceId) {
        startWithLoading(this.collectLiveData, new b(watchFaceId, null));
    }

    public final void doWhenPaySuccess() {
        WatchFaceDetailBean watchFaceDetailBean = this.detailData;
        if (watchFaceDetailBean != null) {
            watchFaceDetailBean.setPurchased(Boolean.TRUE);
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new e(null), 3, null);
        startToSync();
    }

    @Nullable
    public final String getBgPath() {
        return this.bgPath;
    }

    @NotNull
    public final MutableLiveData<State<Boolean>> getCollectLiveData() {
        return this.collectLiveData;
    }

    @Nullable
    public final WatchFaceDetailBean getDetailData() {
        return this.detailData;
    }

    @NotNull
    public final MutableLiveData<State<WatchFaceDetailBean>> getDetailLiveData() {
        return this.detailLiveData;
    }

    @NotNull
    public final MutableLiveData<State<List<MyWatchFaceBean>>> getDeviceDialLiveData() {
        return this.deviceDialLiveData;
    }

    public final void getDeviceWatchFaceFromOnline() {
        startWithLoading(this.deviceDialLiveData, new f(null));
    }

    @NotNull
    public final SharedFlow<DownLoadState> getDownloadStatusFlow() {
        return this.downloadStatusFlow;
    }

    @NotNull
    public final LiveData<ProductCashierParam> getPayDialogLiveData() {
        return this.payDialogLiveData;
    }

    @NotNull
    public final MutableLiveData<State<WatchFaceState>> getReplaceDialLiveData() {
        return this.replaceDialLiveData;
    }

    @NotNull
    public final MutableLiveData<State<Boolean>> getReportLiveData() {
        return this.reportLiveData;
    }

    @Nullable
    public final Integer getSelectedColor() {
        return this.selectedColor;
    }

    @Nullable
    public final String getTransBackgroundPath() {
        return this.transBackgroundPath;
    }

    public final void getWatchFaceDetail(int pageFrom, int watchFaceId) {
        if (pageFrom == 0) {
            n(watchFaceId);
        } else {
            if (pageFrom != 1) {
                return;
            }
            m(watchFaceId);
        }
    }

    @NotNull
    public final MutableLiveData<WatchFaceState> getWatchFaceLiveData() {
        return this.watchFaceLiveData;
    }

    @NotNull
    public final String getWatchFaceUrl() {
        return this.watchFaceUrl;
    }

    /* JADX INFO: renamed from: isCollected, reason: from getter */
    public final boolean getIsCollected() {
        return this.isCollected;
    }

    public final void replaceWatchFace(int chooseId) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new l(chooseId, null), 2, null);
    }

    public final void replaceWatchFaceDirectly() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO().plus(new WatchFaceDetailViewModel$replaceWatchFaceDirectly$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this)), null, new m(null), 2, null);
    }

    public final void reportDownload(int watchFaceId) {
        startWithLoading(this.reportLiveData, new n(watchFaceId, null));
    }

    public final void saveDiyImage() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o(null), 2, null);
    }

    public final void setBgPath(@Nullable String str) {
        this.bgPath = str;
    }

    public final void setBtnText() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new q(null), 2, null);
    }

    public final void setCollected(boolean z) {
        this.isCollected = z;
    }

    public final void setDetailData(@Nullable WatchFaceDetailBean watchFaceDetailBean) {
        this.detailData = watchFaceDetailBean;
    }

    public final void setDeviceDialLiveData(@NotNull MutableLiveData<State<List<MyWatchFaceBean>>> mutableLiveData) {
        this.deviceDialLiveData = mutableLiveData;
    }

    public final void setReplaceDialLiveData(@NotNull MutableLiveData<State<WatchFaceState>> mutableLiveData) {
        this.replaceDialLiveData = mutableLiveData;
    }

    public final void setSelectedColor(@Nullable Integer num) {
        this.selectedColor = num;
    }

    public final void setTransBackgroundPath(@Nullable String str) {
        this.transBackgroundPath = str;
    }

    public final void setWatchFaceUrl(@NotNull String str) {
        this.watchFaceUrl = str;
    }

    public final void startToSync() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }
}
