package com.xiaomi.fitness.sport.viewmodel;

import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.sport.route.detail.model.AddressInfo;
import com.xiaomi.fitness.sport.route.detail.model.CreateRouteCustomStyle;
import com.xiaomi.fitness.sport.route.detail.model.CreateRouteStatus;
import com.xiaomi.fitness.sport.route.detail.model.EmptyMapData;
import com.xiaomi.fitness.sport.route.detail.model.GetRouteDetailResult;
import com.xiaomi.fitness.sport.route.detail.model.ProgressRouteStatus;
import com.xiaomi.fitness.sport.route.detail.model.RouteListRequestParams;
import com.xiaomi.fitness.sport.route.detail.model.RouteSceneType;
import com.xiaomi.fitness.sport.route.detail.model.RouteStyleListResult;
import com.xiaomi.fitness.sport.route.detail.model.StrategyRouteListBean;
import com.xiaomi.fitness.sport.route.detail.model.StyleDetail;
import com.xiaomi.fitness.sport.route.detail.model.UserRouteStrategyRequestParams;
import com.xiaomi.fitness.sport.route.detail.model.UserRouteStyleListResult;
import com.xiaomi.fitness.sport.route.detail.server.RouteRepository;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import com.xiaomi.fitness.sport.view.route.CreateRouteChooseModuleFragment;
import com.xiaomi.fitness.sport.view.route.RunningRouteListBean;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.sport_export.data.StrategyRouteInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.mi_connect_sdk.api.AppDiscType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u009c\u00012\u00020\u0001:\n\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u00100\u001a\u0002012\u0006\u00102\u001a\u00020+J\u0016\u0010Z\u001a\u0002012\u0006\u0010[\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\\J\u000e\u0010]\u001a\u00020+H\u0086@¢\u0006\u0002\u0010^J \u0010g\u001a\u00020+2\u0006\u0010h\u001a\u00020i2\b\b\u0002\u0010j\u001a\u00020`H\u0086@¢\u0006\u0002\u0010kJ\u0010\u0010l\u001a\u00020+2\u0006\u0010m\u001a\u00020nH\u0002J\u0006\u0010q\u001a\u000201J\u0006\u0010r\u001a\u000201J\u001e\u0010s\u001a\u0002012\u0006\u0010t\u001a\u00020\u001d2\u0006\u0010u\u001a\u00020\u001d2\u0006\u0010v\u001a\u00020wJ\u0006\u0010x\u001a\u000201J\u0018\u0010y\u001a\u0004\u0018\u00010;2\u0006\u0010z\u001a\u00020{H\u0082@¢\u0006\u0002\u0010|J\u000e\u0010}\u001a\u0002012\u0006\u0010[\u001a\u00020\u000eJ\u0010\u0010~\u001a\u0004\u0018\u00010\u007fH\u0082@¢\u0006\u0002\u0010^J\u001b\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00012\u0006\u00105\u001a\u000204H\u0082@¢\u0006\u0003\u0010\u0082\u0001J%\u0010\u0083\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u00010\u0084\u00012\u0007\u0010\u0086\u0001\u001a\u00020\u000e2\t\b\u0002\u0010\u0087\u0001\u001a\u00020\u000eJ\u0007\u0010\u008b\u0001\u001a\u000201J\u0007\u0010\u0090\u0001\u001a\u000201J$\u0010\u0097\u0001\u001a\u0002012\u0007\u0010\u0098\u0001\u001a\u00020\u001d2\u0007\u0010\u0099\u0001\u001a\u00020\u001d2\t\b\u0002\u0010\u009a\u0001\u001a\u00020\u000eJ\u000f\u0010\u009b\u0001\u001a\u0002012\u0006\u0010[\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00168F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R(\u0010$\u001a\u0004\u0018\u00010!2\b\u0010\u000f\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020+0-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\b\u0012\u0004\u0012\u0002040\rX\u0082\u0004¢\u0006\u0002\n\u0000R$\u00105\u001a\u0002042\u0006\u0010\u000f\u001a\u0002048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0-¢\u0006\b\n\u0000\u001a\u0004\b=\u0010/R\u001f\u0010>\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020@\u0018\u00010?0\u0016¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0018R\u001a\u0010B\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0012\"\u0004\bD\u0010\u0014R\u001c\u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010K\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020L\u0018\u00010?0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010M\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020L\u0018\u00010?0-¢\u0006\b\n\u0000\u001a\u0004\bN\u0010/R \u0010O\u001a\b\u0012\u0004\u0012\u00020P0?X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u001f\"\u0004\bR\u0010SR\u0016\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010V\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020W\u0018\u00010?0\r¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020`0\r¢\u0006\b\n\u0000\u001a\u0004\ba\u0010YR\u001a\u0010b\u001a\u00020`X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0017\u0010o\u001a\b\u0012\u0004\u0012\u00020`0\r¢\u0006\b\n\u0000\u001a\u0004\bp\u0010YR(\u0010\u0088\u0001\u001a\u0017\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020`\u0012\u0005\u0012\u00030\u0089\u0001\u0018\u00010\u001b0\r¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010YR\u0018\u0010\u008c\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u008d\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u008e\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u008d\u00010\u0016¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010\u0018R$\u0010\u0091\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001¨\u0006¡\u0001"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "Lcom/xiaomi/fitness/sport/viewmodel/RouteBaseViewModel;", "routeRequest", "Lcom/xiaomi/fitness/sport/route/detail/server/RouteRequest;", "<init>", "(Lcom/xiaomi/fitness/sport/route/detail/server/RouteRequest;)V", "currentBitmap", "Landroid/graphics/Bitmap;", "getCurrentBitmap", "()Landroid/graphics/Bitmap;", "setCurrentBitmap", "(Landroid/graphics/Bitmap;)V", "_savedPickerPosition", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "value", "savedPickerPosition", "getSavedPickerPosition", "()I", "setSavedPickerPosition", "(I)V", "savedPickerPositionFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getSavedPickerPositionFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "selectTargetDistanceOptionPairs", "", "Lkotlin/Pair;", "", "", "getSelectTargetDistanceOptionPairs", "()Ljava/util/List;", "_currentFragment", "Landroidx/fragment/app/Fragment;", "currentFragmentFlow", "getCurrentFragmentFlow", "currentFragment", "getCurrentFragment", "()Landroidx/fragment/app/Fragment;", "setCurrentFragment", "(Landroidx/fragment/app/Fragment;)V", "_stateMessageFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$StatusCodes;", "stateMessageFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getStateMessageFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "sendStateMessage", "", "status", "_userRouteStrategyListRequestParams", "Lcom/xiaomi/fitness/sport/route/detail/model/UserRouteStrategyRequestParams;", "userRouteStyleListRequestParams", "getUserRouteStyleListRequestParams", "()Lcom/xiaomi/fitness/sport/route/detail/model/UserRouteStrategyRequestParams;", "setUserRouteStyleListRequestParams", "(Lcom/xiaomi/fitness/sport/route/detail/model/UserRouteStrategyRequestParams;)V", "_userRouteStrategyListResult", "Lcom/xiaomi/fitness/sport/route/detail/model/StrategyRouteListBean;", "userRouteStrategyListResultFlow", "getUserRouteStrategyListResultFlow", "aiRouteDataFlow", "", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;", "getAiRouteDataFlow", "aiRouteSelected", "getAiRouteSelected", "setAiRouteSelected", "moduleSelected", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus;", "getModuleSelected", "()Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus;", "setModuleSelected", "(Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus;)V", "_routeStyleList", "Lcom/xiaomi/fitness/sport/route/detail/model/CreateRouteCustomStyle;", "routeStyleListFlow", "getRouteStyleListFlow", "patternList", "Lcom/xiaomi/fitness/sport/route/detail/model/StyleDetail;", "getPatternList", "setPatternList", "(Ljava/util/List;)V", "_createRouteResult", "Lcom/xiaomi/fitness/sport/route/detail/model/CreateRouteStatus;", "emptyMapList", "Lcom/xiaomi/fitness/sport/route/detail/model/EmptyMapData;", "getEmptyMapList", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "requestRoute", "strategyId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestRouteStyleList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseLastCameraPositionFlow", "", "getParseLastCameraPositionFlow", "allowCleanUserRouteStyleListRequestParams", "getAllowCleanUserRouteStyleListRequestParams", "()Z", "setAllowCleanUserRouteStyleListRequestParams", "(Z)V", "requestUserRouteStyleList", "routeSceneType", "Lcom/xiaomi/fitness/sport/route/detail/model/RouteSceneType;", "isEmptySpaceMode", "(Lcom/xiaomi/fitness/sport/route/detail/model/RouteSceneType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apiExceptionToErrorStatus", PluginDeviceInfo.FICONOFFLINE, "Lcom/xiaomi/fitness/net/response/ApiException;", "showLoadingFlow", "getShowLoadingFlow", "startLoading", "stopLoading", "updateRouteStrategyParams", "lat", "lon", "addressInfo", "Lcom/xiaomi/fitness/sport/route/detail/model/AddressInfo;", "clearRouteStrategyLocationParams", "getRouteStrategyList", "userRouteStrategyListRequestParams", "Lcom/xiaomi/fitness/sport/route/detail/model/RouteListRequestParams;", "(Lcom/xiaomi/fitness/sport/route/detail/model/RouteListRequestParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRouteSpaceList", "getRouteStyleList", "Lcom/xiaomi/fitness/sport/route/detail/model/RouteStyleListResult;", "getUserRouteStyleList", "Lcom/xiaomi/fitness/sport/route/detail/model/UserRouteStyleListResult;", "(Lcom/xiaomi/fitness/sport/route/detail/model/UserRouteStrategyRequestParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCreateRouteDetail", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "routeId", "routeType", "progressLoadingFlow", "Lcom/xiaomi/fitness/sport/route/detail/model/ProgressRouteStatus;", "getProgressLoadingFlow", "getProcessRouteStatus", "_routeListFlow", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListBean;", "routeListFlow", "getRouteListFlow", "clearRouteListFlow", "routeRepository", "Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "getRouteRepository", "()Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "setRouteRepository", "(Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;)V", "getRecommendedRouteList", "longitude", "latitude", "originType", "cancelJob", "Companion", "RouteData", "ModuleStatus", "CreateRouteResult", "StatusCodes", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCreateRouteViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteViewModel.kt\ncom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,624:1\n1557#2:625\n1628#2,3:626\n53#3:629\n55#3:633\n50#4:630\n55#4:632\n107#5:631\n*S KotlinDebug\n*F\n+ 1 CreateRouteViewModel.kt\ncom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel\n*L\n77#1:625\n77#1:626,3\n154#1:629\n154#1:633\n154#1:630\n154#1:632\n154#1:631\n*E\n"})
public final class CreateRouteViewModel extends RouteBaseViewModel {

    @NotNull
    public static final String TAG = "CreateRouteViewModel";

    @NotNull
    private final MutableStateFlow<CreateRouteStatus> _createRouteResult;

    @NotNull
    private final MutableStateFlow<Fragment> _currentFragment;

    @NotNull
    private final MutableStateFlow<RunningRouteListBean> _routeListFlow;

    @NotNull
    private final MutableSharedFlow<List<CreateRouteCustomStyle>> _routeStyleList;

    @NotNull
    private final MutableStateFlow<Integer> _savedPickerPosition;

    @NotNull
    private final MutableSharedFlow<StatusCodes> _stateMessageFlow;

    @NotNull
    private final MutableStateFlow<UserRouteStrategyRequestParams> _userRouteStrategyListRequestParams;

    @NotNull
    private final MutableSharedFlow<StrategyRouteListBean> _userRouteStrategyListResult;

    @NotNull
    private final StateFlow<List<RouteData>> aiRouteDataFlow;
    private int aiRouteSelected;
    private volatile boolean allowCleanUserRouteStyleListRequestParams;

    @Nullable
    private Bitmap currentBitmap;

    @NotNull
    private final MutableStateFlow<List<EmptyMapData>> emptyMapList;

    @Nullable
    private ModuleStatus moduleSelected;

    @NotNull
    private final MutableStateFlow<Boolean> parseLastCameraPositionFlow;
    public List<StyleDetail> patternList;

    @NotNull
    private final MutableStateFlow<Pair<Boolean, ProgressRouteStatus>> progressLoadingFlow;

    @NotNull
    private final StateFlow<RunningRouteListBean> routeListFlow;
    public RouteRepository routeRepository;

    @NotNull
    private final RouteRequest routeRequest;

    @NotNull
    private final SharedFlow<List<CreateRouteCustomStyle>> routeStyleListFlow;

    @NotNull
    private final StateFlow<Integer> savedPickerPositionFlow;

    @NotNull
    private final List<Pair<String, Double>> selectTargetDistanceOptionPairs;

    @NotNull
    private final MutableStateFlow<Boolean> showLoadingFlow;

    @NotNull
    private final SharedFlow<StatusCodes> stateMessageFlow;

    @NotNull
    private final SharedFlow<StrategyRouteListBean> userRouteStrategyListResultFlow;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$1", f = "CreateRouteViewModel.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> savedPickerPositionFlow = CreateRouteViewModel.this.getSavedPickerPositionFlow();
                final CreateRouteViewModel createRouteViewModel = CreateRouteViewModel.this;
                FlowCollector<? super Integer> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(int i2, Continuation<? super Unit> continuation) {
                        createRouteViewModel.getUserRouteStyleListRequestParams().setDistance(createRouteViewModel.getSelectTargetDistanceOptionPairs().get(i2).getSecond().doubleValue());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (savedPickerPositionFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$CreateRouteResult;", "", "routeId", "", "routeType", "routeStatus", "Lcom/xiaomi/fitness/sport/route/detail/model/CreateRouteStatus;", "<init>", "(IILcom/xiaomi/fitness/sport/route/detail/model/CreateRouteStatus;)V", "getRouteId", "()I", "getRouteType", "getRouteStatus", "()Lcom/xiaomi/fitness/sport/route/detail/model/CreateRouteStatus;", "setRouteStatus", "(Lcom/xiaomi/fitness/sport/route/detail/model/CreateRouteStatus;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CreateRouteResult {
        private final int routeId;

        @NotNull
        private CreateRouteStatus routeStatus;
        private final int routeType;

        public CreateRouteResult(int i, int i2, @NotNull CreateRouteStatus routeStatus) {
            Intrinsics.checkNotNullParameter(routeStatus, "routeStatus");
            this.routeId = i;
            this.routeType = i2;
            this.routeStatus = routeStatus;
        }

        public static /* synthetic */ CreateRouteResult copy$default(CreateRouteResult createRouteResult, int i, int i2, CreateRouteStatus createRouteStatus, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = createRouteResult.routeId;
            }
            if ((i3 & 2) != 0) {
                i2 = createRouteResult.routeType;
            }
            if ((i3 & 4) != 0) {
                createRouteStatus = createRouteResult.routeStatus;
            }
            return createRouteResult.copy(i, i2, createRouteStatus);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRouteId() {
            return this.routeId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getRouteType() {
            return this.routeType;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CreateRouteStatus getRouteStatus() {
            return this.routeStatus;
        }

        @NotNull
        public final CreateRouteResult copy(int routeId, int routeType, @NotNull CreateRouteStatus routeStatus) {
            Intrinsics.checkNotNullParameter(routeStatus, "routeStatus");
            return new CreateRouteResult(routeId, routeType, routeStatus);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateRouteResult)) {
                return false;
            }
            CreateRouteResult createRouteResult = (CreateRouteResult) other;
            return this.routeId == createRouteResult.routeId && this.routeType == createRouteResult.routeType && this.routeStatus == createRouteResult.routeStatus;
        }

        public final int getRouteId() {
            return this.routeId;
        }

        @NotNull
        public final CreateRouteStatus getRouteStatus() {
            return this.routeStatus;
        }

        public final int getRouteType() {
            return this.routeType;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.routeId) * 31) + Integer.hashCode(this.routeType)) * 31) + this.routeStatus.hashCode();
        }

        public final void setRouteStatus(@NotNull CreateRouteStatus createRouteStatus) {
            Intrinsics.checkNotNullParameter(createRouteStatus, "<set-?>");
            this.routeStatus = createRouteStatus;
        }

        @NotNull
        public String toString() {
            return "CreateRouteResult(routeId=" + this.routeId + ", routeType=" + this.routeType + ", routeStatus=" + this.routeStatus + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus;", "", "<init>", "()V", "DistancePlan", "Char", "Pattern", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus$Char;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus$DistancePlan;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus$Pattern;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ModuleStatus {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus$Char;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus;", "planInfo", "", "<init>", "(Ljava/lang/String;)V", "getPlanInfo", "()Ljava/lang/String;", "setPlanInfo", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Char extends ModuleStatus {

            @NotNull
            private String planInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Char(@NotNull String planInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(planInfo, "planInfo");
                this.planInfo = planInfo;
            }

            public static /* synthetic */ Char copy$default(Char r0, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = r0.planInfo;
                }
                return r0.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getPlanInfo() {
                return this.planInfo;
            }

            @NotNull
            public final Char copy(@NotNull String planInfo) {
                Intrinsics.checkNotNullParameter(planInfo, "planInfo");
                return new Char(planInfo);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Char) && Intrinsics.areEqual(this.planInfo, ((Char) other).planInfo);
            }

            @NotNull
            public final String getPlanInfo() {
                return this.planInfo;
            }

            public int hashCode() {
                return this.planInfo.hashCode();
            }

            public final void setPlanInfo(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.planInfo = str;
            }

            @NotNull
            public String toString() {
                return "Char(planInfo=" + this.planInfo + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus$DistancePlan;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus;", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class DistancePlan extends ModuleStatus {
            public DistancePlan() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus$Pattern;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$ModuleStatus;", "patternId", "", "<init>", "(I)V", "getPatternId", "()I", "setPatternId", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Pattern extends ModuleStatus {
            private int patternId;

            public Pattern(int i) {
                super(null);
                this.patternId = i;
            }

            public static /* synthetic */ Pattern copy$default(Pattern pattern, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = pattern.patternId;
                }
                return pattern.copy(i);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getPatternId() {
                return this.patternId;
            }

            @NotNull
            public final Pattern copy(int patternId) {
                return new Pattern(patternId);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Pattern) && this.patternId == ((Pattern) other).patternId;
            }

            public final int getPatternId() {
                return this.patternId;
            }

            public int hashCode() {
                return Integer.hashCode(this.patternId);
            }

            public final void setPatternId(int i) {
                this.patternId = i;
            }

            @NotNull
            public String toString() {
                return "Pattern(patternId=" + this.patternId + ")";
            }
        }

        private ModuleStatus() {
        }

        public /* synthetic */ ModuleStatus(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$StatusCodes;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "StatusSuccess", "StatusErrorOther", "StatusErrorExistRouteDoing", "StatusErrorClickFrequently", "StatusErrorStrategyOutLimit", "StatusErrorStrategySensitive", "StatusErrorStrategyBlacklist", "StatusErrorStrategyNoSupport", "StausErrorLocationEmpty", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum StatusCodes {
        StatusSuccess(1),
        StatusErrorOther(-1),
        StatusErrorExistRouteDoing(11001),
        StatusErrorClickFrequently(11002),
        StatusErrorStrategyOutLimit(11003),
        StatusErrorStrategySensitive(11004),
        StatusErrorStrategyBlacklist(11005),
        StatusErrorStrategyNoSupport(11006),
        StausErrorLocationEmpty(11007);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final int code;

        StatusCodes(int i) {
            this.code = i;
        }

        @NotNull
        public static EnumEntries<StatusCodes> getEntries() {
            return $ENTRIES;
        }

        public final int getCode() {
            return this.code;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$cancelJob$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$cancelJob$1", f = "CreateRouteViewModel.kt", i = {}, l = {619}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $strategyId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30671(int i, Continuation<? super C30671> continuation) {
            super(2, continuation);
            this.$strategyId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteViewModel.this.new C30671(this.$strategyId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RouteRequest routeRequest = CreateRouteViewModel.this.routeRequest;
                int i2 = this.$strategyId;
                this.label = 1;
                if (routeRequest.cancelCreateRoute(i2, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getCreateRouteDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getCreateRouteDetail$1", f = "CreateRouteViewModel.kt", i = {}, l = {536, 534}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30681 extends SuspendLambda implements Function2<LiveDataScope<RouteInfo>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $routeId;
        final /* synthetic */ int $routeType;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30681(int i, int i2, Continuation<? super C30681> continuation) {
            super(2, continuation);
            this.$routeId = i;
            this.$routeType = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30681 c30681 = CreateRouteViewModel.this.new C30681(this.$routeId, this.$routeType, continuation);
            c30681.L$0 = obj;
            return c30681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<RouteInfo> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C30681) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            LiveDataScope liveDataScope2;
            RouteInfo routeDetail;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$1;
                    liveDataScope2 = (LiveDataScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e) {
                        e = e;
                        FitnessLogUtils.i(CreateRouteViewModel.TAG, "getCreateRouteDetail,api error:" + e);
                        liveDataScope = liveDataScope2;
                        routeDetail = null;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.L$0;
            try {
                RouteRequest routeRequest = CreateRouteViewModel.this.routeRequest;
                int i2 = this.$routeId;
                int i3 = this.$routeType;
                this.L$0 = liveDataScope;
                this.L$1 = liveDataScope;
                this.label = 1;
                obj = routeRequest.getRouteDetail(i2, i3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                liveDataScope2 = liveDataScope;
            } catch (Exception e2) {
                e = e2;
                liveDataScope2 = liveDataScope;
                FitnessLogUtils.i(CreateRouteViewModel.TAG, "getCreateRouteDetail,api error:" + e);
                liveDataScope = liveDataScope2;
                routeDetail = null;
            }
            routeDetail = ((GetRouteDetailResult) obj).getRouteDetail();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (liveDataScope.emit(routeDetail, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getProcessRouteStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getProcessRouteStatus$1", f = "CreateRouteViewModel.kt", i = {0, 1, 2, 3, 4}, l = {549, 554, 555, 561, 570, 576}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class C30691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C30691(Continuation<? super C30691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30691 c30691 = CreateRouteViewModel.this.new C30691(continuation);
            c30691.L$0 = obj;
            return c30691;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0067  */
        /* JADX WARN: Code duplicated, block: B:19:0x0075  */
        /* JADX WARN: Code duplicated, block: B:21:0x0094 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x0095  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ef A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:36:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:38:0x0117 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x0118  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            ProgressRouteStatus progressRouteStatus;
            CreateRouteViewModel createRouteViewModel;
            MutableStateFlow<Pair<Boolean, ProgressRouteStatus>> progressLoadingFlow;
            Pair<Boolean, ProgressRouteStatus> pair;
            CreateRouteViewModel createRouteViewModel2;
            CreateRouteViewModel createRouteViewModel3;
            int routeStatus;
            MutableStateFlow<Pair<Boolean, ProgressRouteStatus>> progressLoadingFlow2;
            Pair<Boolean, ProgressRouteStatus> pair2;
            MutableStateFlow<Pair<Boolean, ProgressRouteStatus>> progressLoadingFlow3;
            Pair<Boolean, ProgressRouteStatus> pair3;
            MutableStateFlow<Pair<Boolean, ProgressRouteStatus>> progressLoadingFlow4;
            Pair<Boolean, ProgressRouteStatus> pair4;
            CoroutineScope coroutineScope2;
            CreateRouteViewModel createRouteViewModel4;
            CreateRouteViewModel createRouteViewModel5;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                    RouteRequest routeRequest = CreateRouteViewModel.this.routeRequest;
                    this.L$0 = coroutineScope3;
                    this.label = 1;
                    Object progressRoute = routeRequest.getProgressRoute(this);
                    if (progressRoute == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope = coroutineScope3;
                    obj = progressRoute;
                    progressRouteStatus = (ProgressRouteStatus) obj;
                    if (progressRouteStatus != null) {
                        createRouteViewModel3 = CreateRouteViewModel.this;
                        routeStatus = progressRouteStatus.getRouteStatus();
                        if (routeStatus == CreateRouteStatus.LOADING.getStatus()) {
                            FitnessLogUtils.i(CreateRouteViewModel.TAG, "getProcessRouteStatus loading...");
                            progressLoadingFlow4 = createRouteViewModel3.getProgressLoadingFlow();
                            pair4 = new Pair<>(Boxing.boxBoolean(true), progressRouteStatus);
                            this.L$0 = coroutineScope;
                            this.L$1 = createRouteViewModel3;
                            this.label = 2;
                            if (progressLoadingFlow4.emit(pair4, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            coroutineScope2 = coroutineScope;
                            createRouteViewModel4 = createRouteViewModel3;
                            this.L$0 = coroutineScope2;
                            this.L$1 = createRouteViewModel4;
                            this.label = 3;
                            if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            createRouteViewModel5 = createRouteViewModel4;
                            createRouteViewModel5.getProcessRouteStatus();
                        } else if (routeStatus == CreateRouteStatus.CREATED.getStatus()) {
                            FitnessLogUtils.i(CreateRouteViewModel.TAG, "getProcessRouteStatus loading finish");
                            progressLoadingFlow3 = createRouteViewModel3.getProgressLoadingFlow();
                            pair3 = new Pair<>(Boxing.boxBoolean(false), progressRouteStatus);
                            this.L$0 = coroutineScope;
                            this.label = 4;
                            if (progressLoadingFlow3.emit(pair3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            FitnessLogUtils.i(CreateRouteViewModel.TAG, "getProcessRouteStatus loading failed");
                            progressLoadingFlow2 = createRouteViewModel3.getProgressLoadingFlow();
                            pair2 = new Pair<>(Boxing.boxBoolean(false), progressRouteStatus);
                            this.L$0 = coroutineScope;
                            this.label = 5;
                            if (progressLoadingFlow2.emit(pair2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        createRouteViewModel = CreateRouteViewModel.this;
                        FitnessLogUtils.i(CreateRouteViewModel.TAG, "getProcessRouteStatus loading exception");
                        progressLoadingFlow = createRouteViewModel.getProgressLoadingFlow();
                        pair = new Pair<>(Boxing.boxBoolean(false), new ProgressRouteStatus(0, 0, 0));
                        this.L$0 = createRouteViewModel;
                        this.L$1 = null;
                        this.label = 6;
                        if (progressLoadingFlow.emit(pair, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        createRouteViewModel2 = createRouteViewModel;
                        createRouteViewModel2.sendStateMessage(StatusCodes.StatusErrorOther);
                    }
                    return Unit.INSTANCE;
                case 1:
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    progressRouteStatus = (ProgressRouteStatus) obj;
                    if (progressRouteStatus != null) {
                        createRouteViewModel3 = CreateRouteViewModel.this;
                        routeStatus = progressRouteStatus.getRouteStatus();
                        if (routeStatus == CreateRouteStatus.LOADING.getStatus()) {
                            FitnessLogUtils.i(CreateRouteViewModel.TAG, "getProcessRouteStatus loading...");
                            progressLoadingFlow4 = createRouteViewModel3.getProgressLoadingFlow();
                            pair4 = new Pair<>(Boxing.boxBoolean(true), progressRouteStatus);
                            this.L$0 = coroutineScope;
                            this.L$1 = createRouteViewModel3;
                            this.label = 2;
                            if (progressLoadingFlow4.emit(pair4, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            coroutineScope2 = coroutineScope;
                            createRouteViewModel4 = createRouteViewModel3;
                            this.L$0 = coroutineScope2;
                            this.L$1 = createRouteViewModel4;
                            this.label = 3;
                            if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            createRouteViewModel5 = createRouteViewModel4;
                            createRouteViewModel5.getProcessRouteStatus();
                        } else if (routeStatus == CreateRouteStatus.CREATED.getStatus()) {
                            FitnessLogUtils.i(CreateRouteViewModel.TAG, "getProcessRouteStatus loading finish");
                            progressLoadingFlow3 = createRouteViewModel3.getProgressLoadingFlow();
                            pair3 = new Pair<>(Boxing.boxBoolean(false), progressRouteStatus);
                            this.L$0 = coroutineScope;
                            this.label = 4;
                            if (progressLoadingFlow3.emit(pair3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            FitnessLogUtils.i(CreateRouteViewModel.TAG, "getProcessRouteStatus loading failed");
                            progressLoadingFlow2 = createRouteViewModel3.getProgressLoadingFlow();
                            pair2 = new Pair<>(Boxing.boxBoolean(false), progressRouteStatus);
                            this.L$0 = coroutineScope;
                            this.label = 5;
                            if (progressLoadingFlow2.emit(pair2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        createRouteViewModel = CreateRouteViewModel.this;
                        FitnessLogUtils.i(CreateRouteViewModel.TAG, "getProcessRouteStatus loading exception");
                        progressLoadingFlow = createRouteViewModel.getProgressLoadingFlow();
                        pair = new Pair<>(Boxing.boxBoolean(false), new ProgressRouteStatus(0, 0, 0));
                        this.L$0 = createRouteViewModel;
                        this.L$1 = null;
                        this.label = 6;
                        if (progressLoadingFlow.emit(pair, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        createRouteViewModel2 = createRouteViewModel;
                        createRouteViewModel2.sendStateMessage(StatusCodes.StatusErrorOther);
                    }
                    return Unit.INSTANCE;
                case 2:
                    createRouteViewModel4 = (CreateRouteViewModel) this.L$1;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = coroutineScope2;
                    this.L$1 = createRouteViewModel4;
                    this.label = 3;
                    if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    createRouteViewModel5 = createRouteViewModel4;
                    createRouteViewModel5.getProcessRouteStatus();
                    return Unit.INSTANCE;
                case 3:
                    createRouteViewModel5 = (CreateRouteViewModel) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    createRouteViewModel5.getProcessRouteStatus();
                    return Unit.INSTANCE;
                case 4:
                case 5:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 6:
                    createRouteViewModel2 = (CreateRouteViewModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    createRouteViewModel2.sendStateMessage(StatusCodes.StatusErrorOther);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getRecommendedRouteList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getRecommendedRouteList$1", f = "CreateRouteViewModel.kt", i = {}, l = {603}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ double $latitude;
        final /* synthetic */ double $longitude;
        final /* synthetic */ int $originType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30701(double d, double d2, int i, Continuation<? super C30701> continuation) {
            super(2, continuation);
            this.$longitude = d;
            this.$latitude = d2;
            this.$originType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteViewModel.this.new C30701(this.$longitude, this.$latitude, this.$originType, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                CreateRouteViewModel$getRecommendedRouteList$1$result$1 createRouteViewModel$getRecommendedRouteList$1$result$1 = new CreateRouteViewModel$getRecommendedRouteList$1$result$1(CreateRouteViewModel.this, this.$longitude, this.$latitude, this.$originType, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, createRouteViewModel$getRecommendedRouteList$1$result$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CreateRouteViewModel.this._routeListFlow.setValue((RunningRouteListBean) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getRouteSpaceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getRouteSpaceList$1", f = "CreateRouteViewModel.kt", i = {}, l = {442}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $strategyId;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getRouteSpaceList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getRouteSpaceList$1$1", f = "CreateRouteViewModel.kt", i = {0, 1, 1, 1}, l = {443, AppDiscType.MC_DISC_TYPE_DEFAULT}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "tempList", "routeInfo"}, s = {"L$0", "L$0", "L$2", "L$4"})
        @SourceDebugExtension({"SMAP\nCreateRouteViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteViewModel.kt\ncom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$getRouteSpaceList$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,624:1\n1863#2,2:625\n*S KotlinDebug\n*F\n+ 1 CreateRouteViewModel.kt\ncom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$getRouteSpaceList$1$1\n*L\n448#1:625,2\n*E\n"})
        public static final class C07781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $strategyId;
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;
            final /* synthetic */ CreateRouteViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07781(CreateRouteViewModel createRouteViewModel, int i, Continuation<? super C07781> continuation) {
                super(2, continuation);
                this.this$0 = createRouteViewModel;
                this.$strategyId = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07781 c07781 = new C07781(this.this$0, this.$strategyId, continuation);
                c07781.L$0 = obj;
                return c07781;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x0095  */
            /* JADX WARN: Code duplicated, block: B:28:0x00bc A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
            /* JADX WARN: Code duplicated, block: B:38:0x00ec A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ba -> B:29:0x00bd). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x000c
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 272
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel.C30711.C07781.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30711(int i, Continuation<? super C30711> continuation) {
            super(2, continuation);
            this.$strategyId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteViewModel.this.new C30711(this.$strategyId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07781 c07781 = new C07781(CreateRouteViewModel.this, this.$strategyId, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c07781, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getRouteStrategyList$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sport/route/detail/model/StrategyRouteListBean;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getRouteStrategyList$2", f = "CreateRouteViewModel.kt", i = {}, l = {432}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super StrategyRouteListBean>, Object> {
        final /* synthetic */ RouteListRequestParams $userRouteStrategyListRequestParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RouteListRequestParams routeListRequestParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$userRouteStrategyListRequestParams = routeListRequestParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteViewModel.this.new AnonymousClass2(this.$userRouteStrategyListRequestParams, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RouteRequest routeRequest = CreateRouteViewModel.this.routeRequest;
                RouteListRequestParams routeListRequestParams = this.$userRouteStrategyListRequestParams;
                this.label = 1;
                obj = routeRequest.getRouteStrategyList(routeListRequestParams, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super StrategyRouteListBean> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getRouteStyleList$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sport/route/detail/model/RouteStyleListResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getRouteStyleList$2", f = "CreateRouteViewModel.kt", i = {}, l = {484}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30722 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RouteStyleListResult>, Object> {
        int label;

        public C30722(Continuation<? super C30722> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteViewModel.this.new C30722(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ApiException {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RouteRequest routeRequest = CreateRouteViewModel.this.routeRequest;
                this.label = 1;
                obj = RouteRequest.getRouteStyleList$default(routeRequest, null, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (RouteStyleListResult) obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RouteStyleListResult> continuation) {
            return ((C30722) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getUserRouteStyleList$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sport/route/detail/model/UserRouteStyleListResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$getUserRouteStyleList$2", f = "CreateRouteViewModel.kt", i = {}, l = {498}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30732 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserRouteStyleListResult>, Object> {
        final /* synthetic */ UserRouteStrategyRequestParams $userRouteStyleListRequestParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30732(UserRouteStrategyRequestParams userRouteStrategyRequestParams, Continuation<? super C30732> continuation) {
            super(2, continuation);
            this.$userRouteStyleListRequestParams = userRouteStrategyRequestParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteViewModel.this.new C30732(this.$userRouteStyleListRequestParams, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RouteRequest routeRequest = CreateRouteViewModel.this.routeRequest;
                UserRouteStrategyRequestParams userRouteStrategyRequestParams = this.$userRouteStyleListRequestParams;
                this.label = 1;
                obj = routeRequest.getUserRouteStyleList(userRouteStrategyRequestParams, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (UserRouteStyleListResult) obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserRouteStyleListResult> continuation) {
            return ((C30732) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$requestRoute$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel", f = "CreateRouteViewModel.kt", i = {0, 1, 1, 2}, l = {254, 257, SportSummary.VERSION_103, SportSummary.VERSION_105}, m = "requestRoute", n = {"this", "this", "$this$requestRoute_u24lambda_u244", "this"}, s = {"L$0", "L$0", "L$1", "L$0"})
    public static final class C30741 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C30741(Continuation<? super C30741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreateRouteViewModel.this.requestRoute(0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$requestRouteStyleList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel", f = "CreateRouteViewModel.kt", i = {0, 3, 3}, l = {273, 283, 287, 291}, m = "requestRouteStyleList", n = {"this", "this", "result"}, s = {"L$0", "L$0", "L$1"})
    public static final class C30751 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C30751(Continuation<? super C30751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreateRouteViewModel.this.requestRouteStyleList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$requestUserRouteStyleList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel", f = "CreateRouteViewModel.kt", i = {0, 0, 0, 0, 1, 1, 2, 2}, l = {319, 334, 364}, m = "requestUserRouteStyleList", n = {"this", "routeSceneType", "isEmptySpaceMode", "delayedTime", "this", "isEmptySpaceMode", "this", "status"}, s = {"L$0", "L$1", "Z$0", "I$0", "L$0", "Z$0", "L$0", "L$1"})
    public static final class C30761 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C30761(Continuation<? super C30761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreateRouteViewModel.this.requestUserRouteStyleList(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$sendStateMessage$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$sendStateMessage$1", f = "CreateRouteViewModel.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatusCodes $status;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30771(StatusCodes statusCodes, Continuation<? super C30771> continuation) {
            super(2, continuation);
            this.$status = statusCodes;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteViewModel.this.new C30771(this.$status, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = CreateRouteViewModel.this._stateMessageFlow;
                StatusCodes statusCodes = this.$status;
                this.label = 1;
                if (mutableSharedFlow.emit(statusCodes, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public CreateRouteViewModel(@NotNull RouteRequest routeRequest) {
        Intrinsics.checkNotNullParameter(routeRequest, "routeRequest");
        this.routeRequest = routeRequest;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(2);
        this._savedPickerPosition = MutableStateFlow;
        this.savedPickerPositionFlow = MutableStateFlow;
        IntRange intRange = new IntRange(3, 20);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(iNextInt)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            arrayList.add(new Pair(str, Double.valueOf(iNextInt)));
        }
        List<Pair<String, Double>> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        mutableList.add(new Pair<>("21.0975", Double.valueOf(21.0975d)));
        mutableList.add(new Pair<>("42.195", Double.valueOf(42.195d)));
        this.selectTargetDistanceOptionPairs = mutableList;
        this._currentFragment = StateFlowKt.MutableStateFlow(new CreateRouteChooseModuleFragment());
        MutableSharedFlow<StatusCodes> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._stateMessageFlow = mutableSharedFlowMutableSharedFlow$default;
        this.stateMessageFlow = mutableSharedFlowMutableSharedFlow$default;
        this._userRouteStrategyListRequestParams = StateFlowKt.MutableStateFlow(new UserRouteStrategyRequestParams(0, 0, null, 0, 0.0d, 0.0d, null, null, 0.0d, null, null, 2047, null));
        final MutableSharedFlow<StrategyRouteListBean> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._userRouteStrategyListResult = mutableSharedFlowMutableSharedFlow$default2;
        this.userRouteStrategyListResultFlow = mutableSharedFlowMutableSharedFlow$default2;
        this.aiRouteDataFlow = FlowKt.stateIn(new Flow<List<? extends RouteData>>() { // from class: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CreateRouteViewModel.kt\ncom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n54#2:223\n155#3,12:224\n167#3:239\n187#3:240\n188#3,2:242\n1557#4:236\n1628#4,2:237\n1630#4:241\n*S KotlinDebug\n*F\n+ 1 CreateRouteViewModel.kt\ncom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel\n*L\n166#1:236\n166#1:237,2\n166#1:241\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ CreateRouteViewModel this$0;

                /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$special$$inlined$map$1$2", f = "CreateRouteViewModel.kt", i = {}, l = {242, SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, CreateRouteViewModel createRouteViewModel) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = createRouteViewModel;
                }

                /* JADX WARN: Code duplicated, block: B:32:0x00cb A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    FlowCollector flowCollector;
                    List listEmptyList;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object objAwaitAll = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            flowCollector = (FlowCollector) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(objAwaitAll);
                        } else {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(objAwaitAll);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(objAwaitAll);
                    flowCollector = this.$this_unsafeFlow;
                    StrategyRouteListBean strategyRouteListBean = (StrategyRouteListBean) obj;
                    if (strategyRouteListBean == null) {
                        listEmptyList = null;
                    } else if (strategyRouteListBean.getStrategyRouteInfoList() == null) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        Logger.i(CreateRouteViewModel.TAG, "userRouteStrategyListResultFlow get route_Info_list " + strategyRouteListBean.getStrategyRouteInfoList().size());
                        List<StrategyRouteInfo> strategyRouteInfoList = strategyRouteListBean.getStrategyRouteInfoList();
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(strategyRouteInfoList, 10));
                        Iterator<T> it = strategyRouteInfoList.iterator();
                        while (it.hasNext()) {
                            arrayList.add(BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this.this$0), null, null, new CreateRouteViewModel$aiRouteDataFlow$1$1$1(this.this$0, (StrategyRouteInfo) it.next(), null), 3, null));
                        }
                        anonymousClass1.L$0 = flowCollector;
                        anonymousClass1.label = 1;
                        objAwaitAll = AwaitKt.awaitAll(arrayList, anonymousClass1);
                        if (objAwaitAll == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(listEmptyList, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                    listEmptyList = (List) objAwaitAll;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(listEmptyList, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super List<? extends CreateRouteViewModel.RouteData>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = mutableSharedFlowMutableSharedFlow$default2.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this), SharingStarted.INSTANCE.getEagerly(), null);
        this.moduleSelected = new ModuleStatus.DistancePlan();
        MutableSharedFlow<List<CreateRouteCustomStyle>> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._routeStyleList = mutableSharedFlowMutableSharedFlow$default3;
        this.routeStyleListFlow = mutableSharedFlowMutableSharedFlow$default3;
        this._createRouteResult = StateFlowKt.MutableStateFlow(null);
        this.emptyMapList = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        Boolean bool = Boolean.FALSE;
        this.parseLastCameraPositionFlow = StateFlowKt.MutableStateFlow(bool);
        this.allowCleanUserRouteStyleListRequestParams = true;
        this.showLoadingFlow = StateFlowKt.MutableStateFlow(bool);
        this.progressLoadingFlow = StateFlowKt.MutableStateFlow(null);
        MutableStateFlow<RunningRouteListBean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._routeListFlow = MutableStateFlow2;
        this.routeListFlow = MutableStateFlow2;
    }

    private final StatusCodes apiExceptionToErrorStatus(ApiException e) {
        int errorCode = e.getErrorCode();
        StatusCodes statusCodes = StatusCodes.StatusErrorExistRouteDoing;
        if (errorCode == statusCodes.getCode()) {
            return statusCodes;
        }
        StatusCodes statusCodes2 = StatusCodes.StatusErrorClickFrequently;
        if (errorCode == statusCodes2.getCode()) {
            return statusCodes2;
        }
        StatusCodes statusCodes3 = StatusCodes.StatusErrorStrategyOutLimit;
        if (errorCode == statusCodes3.getCode()) {
            return statusCodes3;
        }
        StatusCodes statusCodes4 = StatusCodes.StatusErrorStrategySensitive;
        if (errorCode == statusCodes4.getCode()) {
            return statusCodes4;
        }
        StatusCodes statusCodes5 = StatusCodes.StatusErrorStrategyBlacklist;
        if (errorCode == statusCodes5.getCode()) {
            return statusCodes5;
        }
        StatusCodes statusCodes6 = StatusCodes.StatusErrorStrategyNoSupport;
        return errorCode == statusCodes6.getCode() ? statusCodes6 : StatusCodes.StatusErrorOther;
    }

    public static /* synthetic */ LiveData getCreateRouteDetail$default(CreateRouteViewModel createRouteViewModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        return createRouteViewModel.getCreateRouteDetail(i, i2);
    }

    public static /* synthetic */ void getRecommendedRouteList$default(CreateRouteViewModel createRouteViewModel, double d, double d2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        createRouteViewModel.getRecommendedRouteList(d, d2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getRouteStrategyList(RouteListRequestParams routeListRequestParams, Continuation<? super StrategyRouteListBean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(routeListRequestParams, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getRouteStyleList(Continuation<? super RouteStyleListResult> continuation) throws ApiException {
        return BuildersKt.withContext(Dispatchers.getIO(), new C30722(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getUserRouteStyleList(UserRouteStrategyRequestParams userRouteStrategyRequestParams, Continuation<? super UserRouteStyleListResult> continuation) throws ApiException {
        return BuildersKt.withContext(Dispatchers.getIO(), new C30732(userRouteStrategyRequestParams, null), continuation);
    }

    public static /* synthetic */ Object requestUserRouteStyleList$default(CreateRouteViewModel createRouteViewModel, RouteSceneType routeSceneType, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return createRouteViewModel.requestUserRouteStyleList(routeSceneType, z, continuation);
    }

    public final void cancelJob(int strategyId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C30671(strategyId, null), 3, null);
    }

    public final void clearRouteListFlow() {
        this._routeListFlow.setValue(null);
    }

    public final void clearRouteStrategyLocationParams() {
        if (this.allowCleanUserRouteStyleListRequestParams) {
            getUserRouteStyleListRequestParams().setLatitude(0.0d);
            getUserRouteStyleListRequestParams().setLongitude(0.0d);
            getUserRouteStyleListRequestParams().setCityCode("");
            getUserRouteStyleListRequestParams().setCityName("");
            getUserRouteStyleListRequestParams().setAddressName("");
            getUserRouteStyleListRequestParams().setStartName("");
        }
    }

    @NotNull
    public final StateFlow<List<RouteData>> getAiRouteDataFlow() {
        return this.aiRouteDataFlow;
    }

    public final int getAiRouteSelected() {
        return this.aiRouteSelected;
    }

    public final boolean getAllowCleanUserRouteStyleListRequestParams() {
        return this.allowCleanUserRouteStyleListRequestParams;
    }

    @NotNull
    public final LiveData<RouteInfo> getCreateRouteDetail(int routeId, int routeType) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C30681(routeId, routeType, null), 3, (Object) null);
    }

    @Nullable
    public final Bitmap getCurrentBitmap() {
        return this.currentBitmap;
    }

    @Nullable
    public final Fragment getCurrentFragment() {
        return this._currentFragment.getValue();
    }

    @NotNull
    public final StateFlow<Fragment> getCurrentFragmentFlow() {
        return this._currentFragment;
    }

    @NotNull
    public final MutableStateFlow<List<EmptyMapData>> getEmptyMapList() {
        return this.emptyMapList;
    }

    @Nullable
    public final ModuleStatus getModuleSelected() {
        return this.moduleSelected;
    }

    @NotNull
    public final MutableStateFlow<Boolean> getParseLastCameraPositionFlow() {
        return this.parseLastCameraPositionFlow;
    }

    @NotNull
    public final List<StyleDetail> getPatternList() {
        List<StyleDetail> list = this.patternList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("patternList");
        return null;
    }

    public final void getProcessRouteStatus() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C30691(null), 2, null);
    }

    @NotNull
    public final MutableStateFlow<Pair<Boolean, ProgressRouteStatus>> getProgressLoadingFlow() {
        return this.progressLoadingFlow;
    }

    public final void getRecommendedRouteList(double longitude, double latitude, int originType) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C30701(longitude, latitude, originType, null), 3, null);
    }

    @NotNull
    public final StateFlow<RunningRouteListBean> getRouteListFlow() {
        return this.routeListFlow;
    }

    @NotNull
    public final RouteRepository getRouteRepository() {
        RouteRepository routeRepository = this.routeRepository;
        if (routeRepository != null) {
            return routeRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("routeRepository");
        return null;
    }

    public final void getRouteSpaceList(int strategyId) {
        this.emptyMapList.setValue(null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C30711(strategyId, null), 3, null);
    }

    @NotNull
    public final SharedFlow<List<CreateRouteCustomStyle>> getRouteStyleListFlow() {
        return this.routeStyleListFlow;
    }

    public final int getSavedPickerPosition() {
        return this._savedPickerPosition.getValue().intValue();
    }

    @NotNull
    public final StateFlow<Integer> getSavedPickerPositionFlow() {
        return this.savedPickerPositionFlow;
    }

    @NotNull
    public final List<Pair<String, Double>> getSelectTargetDistanceOptionPairs() {
        return this.selectTargetDistanceOptionPairs;
    }

    @NotNull
    public final MutableStateFlow<Boolean> getShowLoadingFlow() {
        return this.showLoadingFlow;
    }

    @NotNull
    public final SharedFlow<StatusCodes> getStateMessageFlow() {
        return this.stateMessageFlow;
    }

    @NotNull
    public final SharedFlow<StrategyRouteListBean> getUserRouteStrategyListResultFlow() {
        return this.userRouteStrategyListResultFlow;
    }

    @NotNull
    public final UserRouteStrategyRequestParams getUserRouteStyleListRequestParams() {
        return this._userRouteStrategyListRequestParams.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object requestRoute(int i, @NotNull Continuation<? super Unit> continuation) {
        C30741 c30741;
        CreateRouteViewModel createRouteViewModel;
        StrategyRouteListBean strategyRouteListBean;
        MutableSharedFlow<StrategyRouteListBean> mutableSharedFlow;
        if (continuation instanceof C30741) {
            c30741 = (C30741) continuation;
            int i2 = c30741.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30741.label = i2 - Integer.MIN_VALUE;
            } else {
                c30741 = new C30741(continuation);
            }
        } else {
            c30741 = new C30741(continuation);
        }
        Object routeStrategyList = c30741.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c30741.label;
        if (i3 != 0) {
            if (i3 == 1) {
                CreateRouteViewModel createRouteViewModel2 = (CreateRouteViewModel) c30741.L$0;
                ResultKt.throwOnFailure(routeStrategyList);
                createRouteViewModel = createRouteViewModel2;
            } else if (i3 != 2) {
                if (i3 == 3) {
                } else if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(routeStrategyList);
            } else {
                strategyRouteListBean = (StrategyRouteListBean) c30741.L$1;
                createRouteViewModel = (CreateRouteViewModel) c30741.L$0;
                ResultKt.throwOnFailure(routeStrategyList);
                mutableSharedFlow = createRouteViewModel._userRouteStrategyListResult;
                c30741.L$0 = createRouteViewModel;
                c30741.L$1 = null;
                c30741.label = 3;
                if (mutableSharedFlow.emit(strategyRouteListBean, c30741) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(routeStrategyList);
        RouteListRequestParams routeListRequestParams = new RouteListRequestParams(i);
        c30741.L$0 = this;
        c30741.label = 1;
        routeStrategyList = getRouteStrategyList(routeListRequestParams, c30741);
        if (routeStrategyList == coroutine_suspended) {
            return coroutine_suspended;
        }
        createRouteViewModel = this;
        strategyRouteListBean = (StrategyRouteListBean) routeStrategyList;
        if (strategyRouteListBean != null) {
            List<StrategyRouteInfo> strategyRouteInfoList = strategyRouteListBean.getStrategyRouteInfoList();
            if (strategyRouteInfoList == null || strategyRouteInfoList.isEmpty()) {
                MutableSharedFlow<StrategyRouteListBean> mutableSharedFlow2 = createRouteViewModel._userRouteStrategyListResult;
                StrategyRouteListBean strategyRouteListBean2 = new StrategyRouteListBean(CollectionsKt__CollectionsKt.emptyList());
                c30741.L$0 = createRouteViewModel;
                c30741.L$1 = strategyRouteListBean;
                c30741.label = 2;
                if (mutableSharedFlow2.emit(strategyRouteListBean2, c30741) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            mutableSharedFlow = createRouteViewModel._userRouteStrategyListResult;
            c30741.L$0 = createRouteViewModel;
            c30741.L$1 = null;
            c30741.label = 3;
            if (mutableSharedFlow.emit(strategyRouteListBean, c30741) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            MutableSharedFlow<StrategyRouteListBean> mutableSharedFlow3 = createRouteViewModel._userRouteStrategyListResult;
            StrategyRouteListBean strategyRouteListBean3 = new StrategyRouteListBean(CollectionsKt__CollectionsKt.emptyList());
            c30741.L$0 = null;
            c30741.label = 4;
            if (mutableSharedFlow3.emit(strategyRouteListBean3, c30741) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00de  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:0: B:48:0x00b1->B:79:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x00f5, please report this as an issue */
    @Nullable
    public final Object requestRouteStyleList(@NotNull Continuation<? super StatusCodes> continuation) {
        C30751 c30751;
        CreateRouteViewModel createRouteViewModel;
        RouteStyleListResult routeStyleListResult;
        CreateRouteViewModel createRouteViewModel2;
        CreateRouteCustomStyle createRouteCustomStyle;
        List<StyleDetail> listEmptyList;
        StyleDetail senStyle;
        String desc;
        if (continuation instanceof C30751) {
            c30751 = (C30751) continuation;
            int i = c30751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30751.label = i - Integer.MIN_VALUE;
            } else {
                c30751 = new C30751(continuation);
            }
        } else {
            c30751 = new C30751(continuation);
        }
        Object routeStyleList = c30751.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c30751.label;
        Object obj = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(routeStyleList);
            try {
                c30751.L$0 = this;
                c30751.label = 1;
                routeStyleList = getRouteStyleList(c30751);
                if (routeStyleList == coroutine_suspended) {
                    return coroutine_suspended;
                }
                createRouteViewModel = this;
            } catch (Exception e) {
                e = e;
                createRouteViewModel = this;
                if (e instanceof ApiException) {
                    return createRouteViewModel.apiExceptionToErrorStatus((ApiException) e);
                }
                Logger.i(TAG, "requestRouteStyleList fail. error=" + e);
                return StatusCodes.StatusErrorOther;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(routeStyleList);
                    return StatusCodes.StatusErrorOther;
                }
                if (i2 == 3) {
                    ResultKt.throwOnFailure(routeStyleList);
                    return StatusCodes.StatusErrorOther;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                routeStyleListResult = (RouteStyleListResult) c30751.L$1;
                createRouteViewModel2 = (CreateRouteViewModel) c30751.L$0;
                ResultKt.throwOnFailure(routeStyleList);
                List<CreateRouteCustomStyle> styleList = routeStyleListResult.getStyleList();
                Intrinsics.checkNotNull(styleList);
                for (Object obj2 : styleList) {
                    senStyle = ((CreateRouteCustomStyle) obj2).getSenStyle();
                    if (senStyle != null) {
                        desc = senStyle.getDesc();
                    } else {
                        desc = null;
                    }
                    if (Intrinsics.areEqual(desc, "pattern")) {
                        obj = obj2;
                        break;
                    }
                }
                createRouteCustomStyle = (CreateRouteCustomStyle) obj;
                if (createRouteCustomStyle != null || (listEmptyList = createRouteCustomStyle.getSubStyle()) == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                createRouteViewModel2.setPatternList(listEmptyList);
                return StatusCodes.StatusSuccess;
            }
            createRouteViewModel = (CreateRouteViewModel) c30751.L$0;
            try {
                ResultKt.throwOnFailure(routeStyleList);
            } catch (Exception e2) {
                e = e2;
                if (e instanceof ApiException) {
                    return createRouteViewModel.apiExceptionToErrorStatus((ApiException) e);
                }
                Logger.i(TAG, "requestRouteStyleList fail. error=" + e);
                return StatusCodes.StatusErrorOther;
            }
        }
        RouteStyleListResult routeStyleListResult2 = (RouteStyleListResult) routeStyleList;
        if (routeStyleListResult2 == null) {
            MutableSharedFlow<List<CreateRouteCustomStyle>> mutableSharedFlow = createRouteViewModel._routeStyleList;
            c30751.L$0 = null;
            c30751.label = 2;
            if (mutableSharedFlow.emit(null, c30751) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return StatusCodes.StatusErrorOther;
        }
        if (routeStyleListResult2.getStyleList() == null) {
            MutableSharedFlow<List<CreateRouteCustomStyle>> mutableSharedFlow2 = createRouteViewModel._routeStyleList;
            c30751.L$0 = null;
            c30751.label = 3;
            if (mutableSharedFlow2.emit(null, c30751) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return StatusCodes.StatusErrorOther;
        }
        MutableSharedFlow<List<CreateRouteCustomStyle>> mutableSharedFlow3 = createRouteViewModel._routeStyleList;
        List<CreateRouteCustomStyle> styleList2 = routeStyleListResult2.getStyleList();
        c30751.L$0 = createRouteViewModel;
        c30751.L$1 = routeStyleListResult2;
        c30751.label = 4;
        if (mutableSharedFlow3.emit(styleList2, c30751) == coroutine_suspended) {
            return coroutine_suspended;
        }
        routeStyleListResult = routeStyleListResult2;
        createRouteViewModel2 = createRouteViewModel;
        List<CreateRouteCustomStyle> styleList3 = routeStyleListResult.getStyleList();
        Intrinsics.checkNotNull(styleList3);
        while (r9.hasNext()) {
            senStyle = ((CreateRouteCustomStyle) obj2).getSenStyle();
            if (senStyle != null) {
                desc = senStyle.getDesc();
            } else {
                desc = null;
            }
            if (Intrinsics.areEqual(desc, "pattern")) {
                obj = obj2;
                break;
            }
        }
        createRouteCustomStyle = (CreateRouteCustomStyle) obj;
        if (createRouteCustomStyle != null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        createRouteViewModel2.setPatternList(listEmptyList);
        return StatusCodes.StatusSuccess;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0193 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0194  */
    /* JADX WARN: Code duplicated, block: B:69:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.MutableSharedFlow<com.xiaomi.fitness.sport.route.detail.model.StrategyRouteListBean>] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$requestUserRouteStyleList$1] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$requestUserRouteStyleList$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$requestUserRouteStyleList$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0194 -> B:67:0x0199). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object requestUserRouteStyleList(@org.jetbrains.annotations.NotNull com.xiaomi.fitness.sport.route.detail.model.RouteSceneType r20, boolean r21, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel.StatusCodes> r22) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel.requestUserRouteStyleList(com.xiaomi.fitness.sport.route.detail.model.RouteSceneType, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void sendStateMessage(@NotNull StatusCodes status) {
        Intrinsics.checkNotNullParameter(status, "status");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C30771(status, null), 3, null);
    }

    public final void setAiRouteSelected(int i) {
        this.aiRouteSelected = i;
    }

    public final void setAllowCleanUserRouteStyleListRequestParams(boolean z) {
        this.allowCleanUserRouteStyleListRequestParams = z;
    }

    public final void setCurrentBitmap(@Nullable Bitmap bitmap) {
        this.currentBitmap = bitmap;
    }

    public final void setCurrentFragment(@Nullable Fragment fragment) {
        this._currentFragment.setValue(fragment);
    }

    public final void setModuleSelected(@Nullable ModuleStatus moduleStatus) {
        this.moduleSelected = moduleStatus;
    }

    public final void setPatternList(@NotNull List<StyleDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.patternList = list;
    }

    public final void setRouteRepository(@NotNull RouteRepository routeRepository) {
        Intrinsics.checkNotNullParameter(routeRepository, "<set-?>");
        this.routeRepository = routeRepository;
    }

    public final void setSavedPickerPosition(int i) {
        this._savedPickerPosition.setValue(Integer.valueOf(i));
        getRouteTrackLiveData();
    }

    public final void setUserRouteStyleListRequestParams(@NotNull UserRouteStrategyRequestParams value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._userRouteStrategyListRequestParams.setValue(value);
    }

    public final void startLoading() {
        this.showLoadingFlow.setValue(Boolean.TRUE);
    }

    public final void stopLoading() {
        this.showLoadingFlow.setValue(Boolean.FALSE);
    }

    public final void updateRouteStrategyParams(double lat, double lon, @NotNull AddressInfo addressInfo) {
        Intrinsics.checkNotNullParameter(addressInfo, "addressInfo");
        getUserRouteStyleListRequestParams().setLatitude(lat);
        getUserRouteStyleListRequestParams().setLongitude(lon);
        getUserRouteStyleListRequestParams().setCityCode(addressInfo.getCityCode());
        getUserRouteStyleListRequestParams().setCityName(addressInfo.getCity());
        getUserRouteStyleListRequestParams().setAddressName(addressInfo.getTitle());
        getUserRouteStyleListRequestParams().setStartName(addressInfo.getStartName());
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jl\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\rHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;", "", Constants.KEY_RECHARGE_ICON_URL, "", "routeList", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "angle", "", "downloadPath", "length", "", "routeStyle", "", "startPoint", "identify", "<init>", "(Ljava/lang/String;Ljava/util/List;FLjava/lang/String;DLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getIconUrl", "()Ljava/lang/String;", "getRouteList", "()Ljava/util/List;", "getAngle", "()F", "getDownloadPath", "getLength", "()D", "getRouteStyle", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartPoint", "getIdentify", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/util/List;FLjava/lang/String;DLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;", "equals", "", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteData {
        private final float angle;

        @Nullable
        private final String downloadPath;

        @NotNull
        private final String iconUrl;

        @Nullable
        private final String identify;
        private final double length;

        @Nullable
        private final List<CommonTrackData> routeList;

        @Nullable
        private final Integer routeStyle;

        @NotNull
        private final String startPoint;

        public RouteData(@NotNull String iconUrl, @Nullable List<CommonTrackData> list, float f, @Nullable String str, double d, @Nullable Integer num, @NotNull String startPoint, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
            Intrinsics.checkNotNullParameter(startPoint, "startPoint");
            this.iconUrl = iconUrl;
            this.routeList = list;
            this.angle = f;
            this.downloadPath = str;
            this.length = d;
            this.routeStyle = num;
            this.startPoint = startPoint;
            this.identify = str2;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        public final List<CommonTrackData> component2() {
            return this.routeList;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getAngle() {
            return this.angle;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDownloadPath() {
            return this.downloadPath;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final double getLength() {
            return this.length;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Integer getRouteStyle() {
            return this.routeStyle;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getStartPoint() {
            return this.startPoint;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getIdentify() {
            return this.identify;
        }

        @NotNull
        public final RouteData copy(@NotNull String iconUrl, @Nullable List<CommonTrackData> routeList, float angle, @Nullable String downloadPath, double length, @Nullable Integer routeStyle, @NotNull String startPoint, @Nullable String identify) {
            Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
            Intrinsics.checkNotNullParameter(startPoint, "startPoint");
            return new RouteData(iconUrl, routeList, angle, downloadPath, length, routeStyle, startPoint, identify);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RouteData)) {
                return false;
            }
            RouteData routeData = (RouteData) other;
            return Intrinsics.areEqual(this.iconUrl, routeData.iconUrl) && Intrinsics.areEqual(this.routeList, routeData.routeList) && Float.compare(this.angle, routeData.angle) == 0 && Intrinsics.areEqual(this.downloadPath, routeData.downloadPath) && Double.compare(this.length, routeData.length) == 0 && Intrinsics.areEqual(this.routeStyle, routeData.routeStyle) && Intrinsics.areEqual(this.startPoint, routeData.startPoint) && Intrinsics.areEqual(this.identify, routeData.identify);
        }

        public final float getAngle() {
            return this.angle;
        }

        @Nullable
        public final String getDownloadPath() {
            return this.downloadPath;
        }

        @NotNull
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @Nullable
        public final String getIdentify() {
            return this.identify;
        }

        public final double getLength() {
            return this.length;
        }

        @Nullable
        public final List<CommonTrackData> getRouteList() {
            return this.routeList;
        }

        @Nullable
        public final Integer getRouteStyle() {
            return this.routeStyle;
        }

        @NotNull
        public final String getStartPoint() {
            return this.startPoint;
        }

        public int hashCode() {
            int iHashCode = this.iconUrl.hashCode() * 31;
            List<CommonTrackData> list = this.routeList;
            int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Float.hashCode(this.angle)) * 31;
            String str = this.downloadPath;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.length)) * 31;
            Integer num = this.routeStyle;
            int iHashCode4 = (((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31) + this.startPoint.hashCode()) * 31;
            String str2 = this.identify;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "RouteData(iconUrl=" + this.iconUrl + ", routeList=" + this.routeList + ", angle=" + this.angle + ", downloadPath=" + this.downloadPath + ", length=" + this.length + ", routeStyle=" + this.routeStyle + ", startPoint=" + this.startPoint + ", identify=" + this.identify + ")";
        }

        public /* synthetic */ RouteData(String str, List list, float f, String str2, double d, Integer num, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, (i & 4) != 0 ? 0.0f : f, str2, (i & 16) != 0 ? 0.0d : d, num, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? null : str4);
        }
    }
}
