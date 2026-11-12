package com.xiaomi.fitness.route.track.viewmodel;

import android.app.Activity;
import android.content.ContentResolver;
import android.net.Uri;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fit.fitness.parser.sport.track.parser.WayPointData;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.route.export.track.FailRoutes;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.Route;
import com.xiaomi.fitness.route.export.track.RouteListResponse;
import com.xiaomi.fitness.route.export.track.RouteValue;
import com.xiaomi.fitness.route.track.model.MyTrackLibraryModel;
import com.xiaomi.fitness.route.track.view.RouteResultData;
import com.xiaomi.fitness.route.track.view.UiResultData;
import com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM;
import com.xiaomi.fitness.sport_export.IRunningRouteApi;
import com.xiaomi.fitness.sport_export.RunningRouteAccessExportExtKt;
import com.xiaomi.fitness.sport_export.data.RouteCollectResponse;
import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.x0j;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ß\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001M\b\u0007\u0018\u0000 u2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003uvwB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J@\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020.2\b\b\u0002\u00109\u001a\u00020\u00072\b\b\u0002\u0010:\u001a\u00020\u00182\u0010\b\u0002\u0010;\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010<J\u0010\u0010=\u001a\u0002062\b\b\u0002\u0010>\u001a\u00020\u0018J\u000e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0@J\u0016\u0010H\u001a\u0002062\f\u0010I\u001a\b\u0012\u0004\u0012\u00020K0JH\u0007J\u0010\u0010O\u001a\u0002062\u0006\u0010P\u001a\u00020QH\u0016J\u0012\u0010R\u001a\u0002062\b\u0010S\u001a\u0004\u0018\u00010TH\u0002J\u0006\u0010+\u001a\u00020\u0018J\u0014\u0010U\u001a\u0002062\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00070WJ&\u0010X\u001a\u0002062\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020\u00072\u0006\u0010]\u001a\u00020^J\u001f\u0010_\u001a\u0002062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000e2\u0006\u0010`\u001a\u00020\u0007H\u0096\u0001J\u001f\u0010a\u001a\u0002062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000e2\u0006\u0010b\u001a\u00020.H\u0096\u0001J\u001c\u0010c\u001a\u0002062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000eH\u0096A¢\u0006\u0002\u0010dJ(\u0010e\u001a\u000206*\b\u0012\u0004\u0012\u00020g0f2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020CH\u0096A¢\u0006\u0002\u0010kJ\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00020i0m2\u0006\u0010n\u001a\u00020KH\u0096A¢\u0006\u0002\u0010oJ \u0010X\u001a\u000206*\b\u0012\u0004\u0012\u00020i0f2\u0006\u0010h\u001a\u00020iH\u0096A¢\u0006\u0002\u0010pJ \u0010q\u001a\u000206*\b\u0012\u0004\u0012\u00020i0f2\u0006\u0010h\u001a\u00020iH\u0096A¢\u0006\u0002\u0010pJ5\u0010r\u001a\u0002062\u0006\u0010s\u001a\u00020.2\u0006\u0010t\u001a\u00020g2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020K0J2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000eH\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0010R'\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0010R!\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b%\u0010\u0010R3\u0010'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00180\u001a0\u000b0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b)\u0010\u0010R\u000e\u0010+\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u00103\u001a\u000204X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u00020CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0010\u0010L\u001a\u00020MX\u0082\u0004¢\u0006\u0004\n\u0002\u0010N¨\u0006x"}, d2 = {"Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/route/track/model/MyTrackLibraryModel;", "Lcom/xiaomi/fitness/route/track/viewmodel/DistributeTrack;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "stateData", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$RouteData;", "viewStates", "Landroidx/lifecycle/MutableLiveData;", "getViewStates", "()Landroidx/lifecycle/MutableLiveData;", "setViewStates", "(Landroidx/lifecycle/MutableLiveData;)V", "failRoutes", "Lcom/xiaomi/fitness/route/export/track/FailRoutes;", "getFailRoutes", "setFailRoutes", "parserData", "", "recorderData", "Lkotlin/Pair;", "", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "getRecorderData", "recorderData$delegate", "Lkotlin/Lazy;", "parserState", "getParserState", "parserState$delegate", "installPercentage", "Lcom/xiaomi/fitness/route/track/view/UiResultData;", "getInstallPercentage", "installPercentage$delegate", "collectData", "Lcom/xiaomi/fitness/sport_export/data/RouteCollectResponse;", "getCollectData", "collectData$delegate", "hasMore", "nextKey", "page", "", "isFirstPageData", "()Z", "setFirstPageData", "(Z)V", "refreshTime", "", "getTrackList", "", "resetPage", "limit", "nKey", "createByUser", "frequentAction", "Lkotlin/Function0;", "getCollectList", "loadMore", "checkSupportCity", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;", "installToDeviceScope", "Lkotlinx/coroutines/CoroutineScope;", "getInstallToDeviceScope", "()Lkotlinx/coroutines/CoroutineScope;", "setInstallToDeviceScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "toDeviceTrack", "list", "", "Lcom/xiaomi/fitness/route/export/track/Route;", "connectListener", "com/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$connectListener$1", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$connectListener$1;", LifecycleConstantKt.ON_DESTROY, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "setPageState", "resp", "Lcom/xiaomi/fitness/route/export/track/RouteListResponse;", "deleteTrackRoute", "routeIds", "", "parserFile", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "filePath", "trackName", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "catchDistributeToDevice", Constants.EXTRA_ERROR_MESSAGE, "catchIOThrowable", "noInstallCount", "distributeComplete", "(Landroidx/lifecycle/MutableLiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "distributeToDevice", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/route/track/view/RouteResultData;", "originalRoute", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;", "scope", "(Lkotlinx/coroutines/flow/FlowCollector;Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downTrackFile", "Lkotlinx/coroutines/flow/Flow;", "route", "(Lcom/xiaomi/fitness/route/export/track/Route;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/flow/FlowCollector;Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recorderFile", "updateUI", "installCount", "it", "Companion", "RouteData", "OriginalRoute", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MyTrackLibraryVM extends BaseViewModel<MyTrackLibraryModel> implements DistributeTrack {
    public static final int LIMIT = 10;
    private long refreshTime;
    private final /* synthetic */ DistributeTrackImpl $$delegate_0 = new DistributeTrackImpl();

    @NotNull
    private final StateData<RouteData> stateData = new StateData<>();

    @NotNull
    private MutableLiveData<StateData<RouteData>> viewStates = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<FailRoutes> failRoutes = new MutableLiveData<>();

    @NotNull
    private final StateData<Boolean> parserData = new StateData<>();

    /* JADX INFO: renamed from: recorderData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recorderData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pfg
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MyTrackLibraryVM.recorderData_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: parserState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy parserState = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qfg
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MyTrackLibraryVM.parserState_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: installPercentage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy installPercentage = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rfg
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MyTrackLibraryVM.installPercentage_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: collectData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy collectData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sfg
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MyTrackLibraryVM.collectData_delegate$lambda$3();
        }
    });
    private boolean hasMore = true;

    @NotNull
    private String nextKey = "";
    private int page = 1;
    private boolean isFirstPageData = true;

    @NotNull
    private CoroutineScope installToDeviceScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());

    @NotNull
    private final MyTrackLibraryVM$connectListener$1 connectListener = new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$connectListener$1
        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(String did) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            FitnessLogUtils.i(this.this$0.getTAG(), "onDisconnect did:" + did);
            ToastUtil.showLongToast(x0j.d);
            CoroutineScope installToDeviceScope = this.this$0.getInstallToDeviceScope();
            if (installToDeviceScope != null) {
                CoroutineScopeKt.cancel$default(installToDeviceScope, null, 1, null);
            }
            MyTrackLibraryVM myTrackLibraryVM = this.this$0;
            ScopeExtKt.scopeLife$default(myTrackLibraryVM, null, new MyTrackLibraryVM$connectListener$1$onDisconnect$1(myTrackLibraryVM, null), 1, null);
        }
    };

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$RouteData;", "", "feeds", "", "Lcom/xiaomi/fitness/route/export/track/Route;", "firstPage", "", "<init>", "(Ljava/util/List;Z)V", "getFeeds", "()Ljava/util/List;", "setFeeds", "(Ljava/util/List;)V", "getFirstPage", "()Z", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RouteData {

        @Nullable
        private List<Route> feeds;
        private final boolean firstPage;

        /* JADX WARN: Multi-variable type inference failed */
        public RouteData() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        @Nullable
        public final List<Route> getFeeds() {
            return this.feeds;
        }

        public final boolean getFirstPage() {
            return this.firstPage;
        }

        public final void setFeeds(@Nullable List<Route> list) {
            this.feeds = list;
        }

        public RouteData(@Nullable List<Route> list, boolean z) {
            this.feeds = list;
            this.firstPage = z;
        }

        public /* synthetic */ RouteData(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? false : z);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$checkSupportCity$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$checkSupportCity$1", f = "MyTrackLibraryVM.kt", i = {}, l = {159, 159}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<RunningRouteSupportCityBean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<RunningRouteSupportCityBean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
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
            IRunningRouteApi instance = RunningRouteAccessExportExtKt.getINSTANCE(IRunningRouteApi.INSTANCE);
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = instance.checkSupportCity(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$deleteTrackRoute$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$deleteTrackRoute$1", f = "MyTrackLibraryVM.kt", i = {}, l = {228}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $routeIds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29121(List<String> list, Continuation<? super C29121> continuation) {
            super(2, continuation);
            this.$routeIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MyTrackLibraryVM.this.new C29121(this.$routeIds, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                MyTrackLibraryVM$deleteTrackRoute$1$mFailRoutes$1 myTrackLibraryVM$deleteTrackRoute$1$mFailRoutes$1 = new MyTrackLibraryVM$deleteTrackRoute$1$mFailRoutes$1(this.$routeIds, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, myTrackLibraryVM$deleteTrackRoute$1$mFailRoutes$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FailRoutes failRoutes = (FailRoutes) obj;
            MutableLiveData<FailRoutes> failRoutes2 = MyTrackLibraryVM.this.getFailRoutes();
            if (failRoutes == null) {
                failRoutes = new FailRoutes(null);
            }
            failRoutes2.postValue(failRoutes);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getCollectList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getCollectList$1", f = "MyTrackLibraryVM.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $loadMore;
        int label;
        final /* synthetic */ MyTrackLibraryVM this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getCollectList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\\\u0012X\u0012V\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004 \u0007**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lkotlin/Pair;", "Lcom/xiaomi/fitness/sport_export/data/RouteCollectResponse;", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getCollectList$1$1", f = "MyTrackLibraryVM.kt", i = {0}, l = {141, 144}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
        public static final class C07241 extends SuspendLambda implements Function2<FlowCollector<? super StateData<Pair<? extends RouteCollectResponse, ? extends Boolean>>>, Continuation<? super Unit>, Object> {
            final /* synthetic */ StateData<Pair<RouteCollectResponse, Boolean>> $collectState;
            final /* synthetic */ boolean $loadMore;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MyTrackLibraryVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07241(boolean z, StateData<Pair<RouteCollectResponse, Boolean>> stateData, MyTrackLibraryVM myTrackLibraryVM, Continuation<? super C07241> continuation) {
                super(2, continuation);
                this.$loadMore = z;
                this.$collectState = stateData;
                this.this$0 = myTrackLibraryVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07241 c07241 = new C07241(this.$loadMore, this.$collectState, this.this$0, continuation);
                c07241.L$0 = obj;
                return c07241;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super StateData<Pair<? extends RouteCollectResponse, ? extends Boolean>>> flowCollector, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super StateData<Pair<RouteCollectResponse, Boolean>>>) flowCollector, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                FlowCollector flowCollector;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        flowCollector = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                MyTrackLibraryVM$getCollectList$1$1$result$1 myTrackLibraryVM$getCollectList$1$1$result$1 = new MyTrackLibraryVM$getCollectList$1$1$result$1(this.this$0, null);
                this.L$0 = flowCollector;
                this.label = 1;
                obj = BuildersKt.withContext(io2, myTrackLibraryVM$getCollectList$1$1$result$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                RouteCollectResponse routeCollectResponse = (RouteCollectResponse) obj;
                StateData<Pair<RouteCollectResponse, Boolean>> stateDataA = (routeCollectResponse == null || (!this.$loadMore && routeCollectResponse.getRoutes().isEmpty())) ? this.$collectState.a() : this.$collectState.r(new Pair<>(routeCollectResponse, Boxing.boxBoolean(this.$loadMore)));
                this.L$0 = null;
                this.label = 2;
                if (flowCollector.emit(stateDataA, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super StateData<Pair<RouteCollectResponse, Boolean>>> flowCollector, Continuation<? super Unit> continuation) {
                return ((C07241) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getCollectList$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\\\u0012X\u0012V\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004 \u0007**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u00022\u0015\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\fH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lkotlin/Pair;", "Lcom/xiaomi/fitness/sport_export/data/RouteCollectResponse;", "", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getCollectList$1$2", f = "MyTrackLibraryVM.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super StateData<Pair<? extends RouteCollectResponse, ? extends Boolean>>>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ StateData<Pair<RouteCollectResponse, Boolean>> $collectState;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ MyTrackLibraryVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MyTrackLibraryVM myTrackLibraryVM, StateData<Pair<RouteCollectResponse, Boolean>> stateData, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.this$0 = myTrackLibraryVM;
                this.$collectState = stateData;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super StateData<Pair<? extends RouteCollectResponse, ? extends Boolean>>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super StateData<Pair<RouteCollectResponse, Boolean>>>) flowCollector, th, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Throwable th = (Throwable) this.L$1;
                    Logger.e(this.this$0.getTAG(), "getCollectList error: " + th);
                    StateData<Pair<RouteCollectResponse, Boolean>> stateDataC = this.$collectState.c();
                    this.L$0 = null;
                    this.label = 1;
                    if (flowCollector.emit(stateDataC, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super StateData<Pair<RouteCollectResponse, Boolean>>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$collectState, continuation);
                anonymousClass2.L$0 = flowCollector;
                anonymousClass2.L$1 = th;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29131(boolean z, MyTrackLibraryVM myTrackLibraryVM, Continuation<? super C29131> continuation) {
            super(2, continuation);
            this.$loadMore = z;
            this.this$0 = myTrackLibraryVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29131(this.$loadMore, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateData stateData = new StateData();
                Flow flowM2416catch = FlowKt.m2416catch(FlowKt.flow(new C07241(this.$loadMore, stateData, this.this$0, null)), new AnonymousClass2(this.this$0, stateData, null));
                final MyTrackLibraryVM myTrackLibraryVM = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM.getCollectList.1.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((StateData<Pair<RouteCollectResponse, Boolean>>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(StateData<Pair<RouteCollectResponse, Boolean>> stateData2, Continuation<? super Unit> continuation) {
                        myTrackLibraryVM.getCollectData().postValue(stateData2);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowM2416catch.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C29131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getTrackList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getTrackList$1", f = "MyTrackLibraryVM.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $createByUser;
        final /* synthetic */ int $limit;
        final /* synthetic */ String $nKey;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getTrackList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$RouteData;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getTrackList$1$1", f = "MyTrackLibraryVM.kt", i = {0}, l = {106, 117}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
        public static final class C07251 extends SuspendLambda implements Function2<FlowCollector<? super StateData<RouteData>>, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $createByUser;
            final /* synthetic */ RouteData $data;
            final /* synthetic */ int $limit;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MyTrackLibraryVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07251(MyTrackLibraryVM myTrackLibraryVM, RouteData routeData, int i, boolean z, Continuation<? super C07251> continuation) {
                super(2, continuation);
                this.this$0 = myTrackLibraryVM;
                this.$data = routeData;
                this.$limit = i;
                this.$createByUser = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07251 c07251 = new C07251(this.this$0, this.$data, this.$limit, this.$createByUser, continuation);
                c07251.L$0 = obj;
                return c07251;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                FlowCollector flowCollector;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        flowCollector = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                MyTrackLibraryVM$getTrackList$1$1$result$1 myTrackLibraryVM$getTrackList$1$1$result$1 = new MyTrackLibraryVM$getTrackList$1$1$result$1(this.this$0, this.$limit, this.$createByUser, null);
                this.L$0 = flowCollector;
                this.label = 1;
                obj = BuildersKt.withContext(io2, myTrackLibraryVM$getTrackList$1$1$result$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                RouteListResponse routeListResponse = (RouteListResponse) obj;
                this.this$0.setPageState(routeListResponse);
                Intrinsics.checkNotNull(routeListResponse);
                List<Route> route_list = routeListResponse.getRoute_list();
                this.$data.setFeeds(route_list);
                List<Route> list = route_list;
                StateData stateDataB = (list == null || list.isEmpty()) ? this.this$0.stateData.b(this.$data) : this.this$0.stateData.r(this.$data);
                this.L$0 = null;
                this.label = 2;
                if (flowCollector.emit(stateDataB, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super StateData<RouteData>> flowCollector, Continuation<? super Unit> continuation) {
                return ((C07251) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getTrackList$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$RouteData;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getTrackList$1$2", f = "MyTrackLibraryVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super StateData<RouteData>>, Continuation<? super Unit>, Object> {
            final /* synthetic */ RouteData $data;
            int label;
            final /* synthetic */ MyTrackLibraryVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MyTrackLibraryVM myTrackLibraryVM, RouteData routeData, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = myTrackLibraryVM;
                this.$data = routeData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$data, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.getViewStates().setValue(this.this$0.stateData.m(this.$data));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super StateData<RouteData>> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getTrackList$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*,\u0012(\u0012&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u00022\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\nH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$RouteData;", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$getTrackList$1$3", f = "MyTrackLibraryVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super StateData<RouteData>>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ RouteData $data;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MyTrackLibraryVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(MyTrackLibraryVM myTrackLibraryVM, RouteData routeData, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = myTrackLibraryVM;
                this.$data = routeData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                FitnessLogUtils.e(this.this$0.getTAG(), "reqList: error = " + th.getMessage());
                this.this$0.getViewStates().setValue(((th instanceof UnknownHostException) || (th instanceof SocketTimeoutException)) ? this.this$0.stateData.o(this.$data) : this.this$0.stateData.e(this.$data));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super StateData<RouteData>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$data, continuation);
                anonymousClass3.L$0 = th;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29141(String str, int i, boolean z, Continuation<? super C29141> continuation) {
            super(2, continuation);
            this.$nKey = str;
            this.$limit = i;
            this.$createByUser = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MyTrackLibraryVM.this.new C29141(this.$nKey, this.$limit, this.$createByUser, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MyTrackLibraryVM.this.nextKey = this.$nKey;
                MyTrackLibraryVM myTrackLibraryVM = MyTrackLibraryVM.this;
                myTrackLibraryVM.setFirstPageData(myTrackLibraryVM.nextKey.length() == 0);
                FitnessLogUtils.i(MyTrackLibraryVM.this.getTAG(), "nextKey:" + MyTrackLibraryVM.this.nextKey + " , isFirstPageData:" + MyTrackLibraryVM.this.getIsFirstPageData());
                RouteData routeData = new RouteData(null, MyTrackLibraryVM.this.getIsFirstPageData(), i2, 0 == true ? 1 : 0);
                Flow flowM2416catch = FlowKt.m2416catch(FlowKt.onStart(FlowKt.flow(new C07251(MyTrackLibraryVM.this, routeData, this.$limit, this.$createByUser, null)), new AnonymousClass2(MyTrackLibraryVM.this, routeData, null)), new AnonymousClass3(MyTrackLibraryVM.this, routeData, null));
                final MyTrackLibraryVM myTrackLibraryVM2 = MyTrackLibraryVM.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM.getTrackList.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((StateData<RouteData>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(StateData<RouteData> stateData, Continuation<? super Unit> continuation) {
                        myTrackLibraryVM2.getViewStates().setValue(stateData);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowM2416catch.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C29141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$parserFile$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$parserFile$2", f = "MyTrackLibraryVM.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $filePath;
        final /* synthetic */ String $trackName;
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Uri uri, Activity activity, String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$uri = uri;
            this.$activity = activity;
            this.$filePath = str;
            this.$trackName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MyTrackLibraryVM.this.new AnonymousClass2(this.$uri, this.$activity, this.$filePath, this.$trackName, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MyTrackLibraryVM.this.getParserState().setValue(MyTrackLibraryVM.this.parserData.l());
                ParserHelper parserHelper = ParserHelper.INSTANCE;
                Uri uri = this.$uri;
                ContentResolver contentResolver = this.$activity.getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                String fileNameFromUri = parserHelper.getFileNameFromUri(uri, contentResolver);
                if (fileNameFromUri == null) {
                    fileNameFromUri = "";
                }
                if (!parserHelper.isSupportedParserFile(fileNameFromUri)) {
                    Logger.i(MyTrackLibraryVM.this.getTAG(), "parser file is not support");
                    MyTrackLibraryVM.this.getParserState().setValue(MyTrackLibraryVM.this.parserData.c());
                    return Unit.INSTANCE;
                }
                String second = parserHelper.separateFileNameAndExtension(fileNameFromUri).getSecond();
                String fileMD5 = MD5Util.getFileMD5(this.$filePath);
                Logger.i(MyTrackLibraryVM.this.getTAG(), "openFile start");
                Logger.d(MyTrackLibraryVM.this.getTAG(), "openFile = " + this.$filePath);
                Logger.i(MyTrackLibraryVM.this.getTAG(), "openFile fileExtension= " + second);
                Logger.i(MyTrackLibraryVM.this.getTAG(), "openFile trackName= " + this.$trackName);
                Logger.i(MyTrackLibraryVM.this.getTAG(), "openFile MD5 is = " + fileMD5);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                MyTrackLibraryVM$parserFile$2$result$1 myTrackLibraryVM$parserFile$2$result$1 = new MyTrackLibraryVM$parserFile$2$result$1(this.$trackName, this.$filePath, second, fileMD5, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, myTrackLibraryVM$parserFile$2$result$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MyTrackLibraryVM.this.getParserState().setValue(MyTrackLibraryVM.this.parserData.r(Boxing.boxBoolean(true)));
            MyTrackLibraryVM.this.getRecorderData().setValue((Pair) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$toDeviceTrack$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$toDeviceTrack$1", f = "MyTrackLibraryVM.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nMyTrackLibraryVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyTrackLibraryVM.kt\ncom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$toDeviceTrack$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,270:1\n39#2,6:271\n39#2,6:277\n39#2,6:283\n*S KotlinDebug\n*F\n+ 1 MyTrackLibraryVM.kt\ncom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$toDeviceTrack$1\n*L\n173#1:271,6\n175#1:277,6\n177#1:283,6\n*E\n"})
    public static final class C29151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.IntRef $installCount;
        final /* synthetic */ List<Route> $list;
        int label;
        final /* synthetic */ MyTrackLibraryVM this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$toDeviceTrack$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0015\u0010\u0003\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;", "route", "Lcom/xiaomi/fitness/route/export/track/Route;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$toDeviceTrack$1$1", f = "MyTrackLibraryVM.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07261 extends SuspendLambda implements Function2<Route, Continuation<? super Flow<? extends OriginalRoute>>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MyTrackLibraryVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07261(MyTrackLibraryVM myTrackLibraryVM, Continuation<? super C07261> continuation) {
                super(2, continuation);
                this.this$0 = myTrackLibraryVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07261 c07261 = new C07261(this.this$0, continuation);
                c07261.L$0 = obj;
                return c07261;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Route route, Continuation<? super Flow<OriginalRoute>> continuation) {
                return ((C07261) create(route, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Route route = (Route) this.L$0;
                    MyTrackLibraryVM myTrackLibraryVM = this.this$0;
                    this.label = 1;
                    obj = myTrackLibraryVM.downTrackFile(route, this);
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
            public /* bridge */ /* synthetic */ Object invoke(Route route, Continuation<? super Flow<? extends OriginalRoute>> continuation) {
                return invoke2(route, (Continuation<? super Flow<OriginalRoute>>) continuation);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$toDeviceTrack$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$toDeviceTrack$1$2", f = "MyTrackLibraryVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super OriginalRoute>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.IntRef $installCount;
            final /* synthetic */ List<Route> $list;
            int label;
            final /* synthetic */ MyTrackLibraryVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MyTrackLibraryVM myTrackLibraryVM, List<Route> list, Ref.IntRef intRef, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.this$0 = myTrackLibraryVM;
                this.$list = list;
                this.$installCount = intRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MyTrackLibraryVM myTrackLibraryVM = this.this$0;
                myTrackLibraryVM.catchIOThrowable(myTrackLibraryVM.getInstallPercentage(), this.$list.size() - this.$installCount.element);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super OriginalRoute> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass2(this.this$0, this.$list, this.$installCount, continuation).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$toDeviceTrack$1$6, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/route/track/view/RouteResultData;", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$toDeviceTrack$1$6", f = "MyTrackLibraryVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass6 extends SuspendLambda implements Function3<FlowCollector<? super RouteResultData>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MyTrackLibraryVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(MyTrackLibraryVM myTrackLibraryVM, Continuation<? super AnonymousClass6> continuation) {
                super(3, continuation);
                this.this$0 = myTrackLibraryVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                MyTrackLibraryVM myTrackLibraryVM = this.this$0;
                myTrackLibraryVM.catchDistributeToDevice(myTrackLibraryVM.getInstallPercentage(), String.valueOf(th.getMessage()));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super RouteResultData> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.this$0, continuation);
                anonymousClass6.L$0 = th;
                return anonymousClass6.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$toDeviceTrack$1$7, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0017\u0010\u0004\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/route/track/view/RouteResultData;", "it", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$toDeviceTrack$1$7", f = "MyTrackLibraryVM.kt", i = {}, l = {SportReportBaseParser.ReportType.entryTime}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass7 extends SuspendLambda implements Function3<FlowCollector<? super RouteResultData>, Throwable, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MyTrackLibraryVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(MyTrackLibraryVM myTrackLibraryVM, Continuation<? super AnonymousClass7> continuation) {
                super(3, continuation);
                this.this$0 = myTrackLibraryVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MyTrackLibraryVM myTrackLibraryVM = this.this$0;
                    MutableLiveData<UiResultData> installPercentage = myTrackLibraryVM.getInstallPercentage();
                    this.label = 1;
                    if (myTrackLibraryVM.distributeComplete(installPercentage, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.this$0.connectListener);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super RouteResultData> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass7(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29151(List<Route> list, MyTrackLibraryVM myTrackLibraryVM, Ref.IntRef intRef, Continuation<? super C29151> continuation) {
            super(2, continuation);
            this.$list = list;
            this.this$0 = myTrackLibraryVM;
            this.$installCount = intRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29151(this.$list, this.this$0, this.$installCount, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowOnCompletion = FlowKt.onCompletion(FlowKt.m2416catch(FlowKt.flow(new MyTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$3(FlowKt.flow(new MyTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$2(FlowKt.flow(new MyTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$1(FlowKt.m2416catch(FlowKt__MergeKt.flatMapMerge$default(FlowKt.asFlow(this.$list), 0, new C07261(this.this$0, null), 1, null), new AnonymousClass2(this.this$0, this.$list, this.$installCount, null)), null, this.this$0)), null, this.this$0)), null, this.this$0)), new AnonymousClass6(this.this$0, null)), new AnonymousClass7(this.this$0, null));
                final Ref.IntRef intRef = this.$installCount;
                final MyTrackLibraryVM myTrackLibraryVM = this.this$0;
                final List<Route> list = this.$list;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM.toDeviceTrack.1.8
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((RouteResultData) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(RouteResultData routeResultData, Continuation<? super Unit> continuation) {
                        if (routeResultData.getSuccess()) {
                            intRef.element++;
                        }
                        MyTrackLibraryVM myTrackLibraryVM2 = myTrackLibraryVM;
                        myTrackLibraryVM2.updateUI(intRef.element, routeResultData, list, myTrackLibraryVM2.getInstallPercentage());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowOnCompletion.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C29151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData collectData_delegate$lambda$3() {
        return new MutableLiveData();
    }

    public static /* synthetic */ void getCollectList$default(MyTrackLibraryVM myTrackLibraryVM, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        myTrackLibraryVM.getCollectList(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getTrackList$default(MyTrackLibraryVM myTrackLibraryVM, boolean z, int i, String str, boolean z2, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = 10;
        }
        if ((i2 & 4) != 0) {
            str = myTrackLibraryVM.nextKey;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        if ((i2 & 16) != 0) {
            function0 = null;
        }
        myTrackLibraryVM.getTrackList(z, i, str, z2, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData installPercentage_delegate$lambda$2() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData parserState_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData recorderData_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPageState(RouteListResponse resp) {
        String next_key = resp != null ? resp.getNext_key() : null;
        Intrinsics.checkNotNull(next_key);
        this.nextKey = next_key;
        this.hasMore = resp.getHas_more();
    }

    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    public void catchDistributeToDevice(@NotNull MutableLiveData<UiResultData> installPercentage, @NotNull String errorMsg) {
        Intrinsics.checkNotNullParameter(installPercentage, "installPercentage");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        this.$$delegate_0.catchDistributeToDevice(installPercentage, errorMsg);
    }

    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    public void catchIOThrowable(@NotNull MutableLiveData<UiResultData> installPercentage, int noInstallCount) {
        Intrinsics.checkNotNullParameter(installPercentage, "installPercentage");
        this.$$delegate_0.catchIOThrowable(installPercentage, noInstallCount);
    }

    @NotNull
    public final LiveData<RunningRouteSupportCityBean> checkSupportCity() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new AnonymousClass1(null), 3, (Object) null);
    }

    public final void deleteTrackRoute(@NotNull List<String> routeIds) {
        Intrinsics.checkNotNullParameter(routeIds, "routeIds");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C29121(routeIds, null), 3, null);
    }

    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    @Nullable
    public Object distributeComplete(@NotNull MutableLiveData<UiResultData> mutableLiveData, @NotNull Continuation<? super Unit> continuation) {
        return this.$$delegate_0.distributeComplete(mutableLiveData, continuation);
    }

    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    @Nullable
    public Object distributeToDevice(@NotNull FlowCollector<? super RouteResultData> flowCollector, @NotNull OriginalRoute originalRoute, @NotNull CoroutineScope coroutineScope, @NotNull Continuation<? super Unit> continuation) {
        return this.$$delegate_0.distributeToDevice(flowCollector, originalRoute, coroutineScope, continuation);
    }

    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    @Nullable
    public Object downTrackFile(@NotNull Route route, @NotNull Continuation<? super Flow<OriginalRoute>> continuation) {
        return this.$$delegate_0.downTrackFile(route, continuation);
    }

    @NotNull
    public final MutableLiveData<StateData<Pair<RouteCollectResponse, Boolean>>> getCollectData() {
        return (MutableLiveData) this.collectData.getValue();
    }

    public final void getCollectList(boolean loadMore) {
        if (loadMore) {
            this.page++;
        } else {
            this.page = 1;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C29131(loadMore, this, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<FailRoutes> getFailRoutes() {
        return this.failRoutes;
    }

    @NotNull
    public final MutableLiveData<UiResultData> getInstallPercentage() {
        return (MutableLiveData) this.installPercentage.getValue();
    }

    @NotNull
    public final CoroutineScope getInstallToDeviceScope() {
        return this.installToDeviceScope;
    }

    @NotNull
    public final MutableLiveData<StateData<Boolean>> getParserState() {
        return (MutableLiveData) this.parserState.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<byte[], Recorder>> getRecorderData() {
        return (MutableLiveData) this.recorderData.getValue();
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "MyTrackLibraryVM";
    }

    public final void getTrackList(boolean resetPage, int limit, @NotNull String nKey, boolean createByUser, @Nullable Function0<Unit> frequentAction) {
        Intrinsics.checkNotNullParameter(nKey, "nKey");
        if (System.currentTimeMillis() - this.refreshTime > 500) {
            this.refreshTime = System.currentTimeMillis();
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C29141(nKey, limit, createByUser, null), 3, null);
        } else {
            FitnessLogUtils.i(getTAG(), "frequent refresh");
            if (frequentAction != null) {
                frequentAction.invoke();
            }
        }
    }

    @NotNull
    public final MutableLiveData<StateData<RouteData>> getViewStates() {
        return this.viewStates;
    }

    /* JADX INFO: renamed from: hasMore, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* JADX INFO: renamed from: isFirstPageData, reason: from getter */
    public final boolean getIsFirstPageData() {
        return this.isFirstPageData;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        CoroutineScope coroutineScope = this.installToDeviceScope;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.connectListener);
    }

    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    @Nullable
    public Object parserFile(@NotNull FlowCollector<? super OriginalRoute> flowCollector, @NotNull OriginalRoute originalRoute, @NotNull Continuation<? super Unit> continuation) {
        return this.$$delegate_0.parserFile(flowCollector, originalRoute, continuation);
    }

    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    @Nullable
    public Object recorderFile(@NotNull FlowCollector<? super OriginalRoute> flowCollector, @NotNull OriginalRoute originalRoute, @NotNull Continuation<? super Unit> continuation) {
        return this.$$delegate_0.recorderFile(flowCollector, originalRoute, continuation);
    }

    public final void setFailRoutes(@NotNull MutableLiveData<FailRoutes> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.failRoutes = mutableLiveData;
    }

    public final void setFirstPageData(boolean z) {
        this.isFirstPageData = z;
    }

    public final void setInstallToDeviceScope(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<set-?>");
        this.installToDeviceScope = coroutineScope;
    }

    public final void setViewStates(@NotNull MutableLiveData<StateData<RouteData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.viewStates = mutableLiveData;
    }

    @FlowPreview
    public final void toDeviceTrack(@NotNull List<Route> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Ref.IntRef intRef = new Ref.IntRef();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this.connectListener);
        BuildersKt__Builders_commonKt.launch$default(this.installToDeviceScope, Dispatchers.getIO(), null, new C29151(list, this, intRef, null), 2, null);
    }

    @Override // com.xiaomi.fitness.route.track.viewmodel.DistributeTrack
    public void updateUI(int installCount, @NotNull RouteResultData it, @NotNull List<Route> list, @NotNull MutableLiveData<UiResultData> installPercentage) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(installPercentage, "installPercentage");
        this.$$delegate_0.updateUI(installCount, it, list, installPercentage);
    }

    public final void parserFile(@NotNull Uri uri, @NotNull String filePath, @NotNull String trackName, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(trackName, "trackName");
        Intrinsics.checkNotNullParameter(activity, "activity");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(uri, activity, filePath, trackName, null), 3, null);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012B\b\u0002\u0010\b\u001a<\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n\u0012\u001e\u0012\u001c\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\t\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018RT\u0010\b\u001a<\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n\u0012\u001e\u0012\u001c\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\t\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;", "", "byteArray", "", "route", "Lcom/xiaomi/fitness/route/export/track/Route;", "routeValue", "Lcom/xiaomi/fitness/route/export/track/RouteValue;", "parserData", "Lkotlin/Triple;", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointData;", "", "recorderData", "Lkotlin/Pair;", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "<init>", "([BLcom/xiaomi/fitness/route/export/track/Route;Lcom/xiaomi/fitness/route/export/track/RouteValue;Lkotlin/Triple;Lkotlin/Pair;)V", "getByteArray", "()[B", "getRoute", "()Lcom/xiaomi/fitness/route/export/track/Route;", "getRouteValue", "()Lcom/xiaomi/fitness/route/export/track/RouteValue;", "getParserData", "()Lkotlin/Triple;", "setParserData", "(Lkotlin/Triple;)V", "getRecorderData", "()Lkotlin/Pair;", "setRecorderData", "(Lkotlin/Pair;)V", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OriginalRoute {

        @NotNull
        private final byte[] byteArray;

        @Nullable
        private Triple<? extends List<CommonTrackData>, ? extends List<WayPointData>, Triple<Double, Double, Double>> parserData;

        @Nullable
        private Pair<byte[], Recorder> recorderData;

        @NotNull
        private final Route route;

        @NotNull
        private final RouteValue routeValue;

        public OriginalRoute(@NotNull byte[] byteArray, @NotNull Route route, @NotNull RouteValue routeValue, @Nullable Triple<? extends List<CommonTrackData>, ? extends List<WayPointData>, Triple<Double, Double, Double>> triple, @Nullable Pair<byte[], Recorder> pair) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(routeValue, "routeValue");
            this.byteArray = byteArray;
            this.route = route;
            this.routeValue = routeValue;
            this.parserData = triple;
            this.recorderData = pair;
        }

        @NotNull
        public final byte[] getByteArray() {
            return this.byteArray;
        }

        @Nullable
        public final Triple<List<CommonTrackData>, List<WayPointData>, Triple<Double, Double, Double>> getParserData() {
            return this.parserData;
        }

        @Nullable
        public final Pair<byte[], Recorder> getRecorderData() {
            return this.recorderData;
        }

        @NotNull
        public final Route getRoute() {
            return this.route;
        }

        @NotNull
        public final RouteValue getRouteValue() {
            return this.routeValue;
        }

        public final void setParserData(@Nullable Triple<? extends List<CommonTrackData>, ? extends List<WayPointData>, Triple<Double, Double, Double>> triple) {
            this.parserData = triple;
        }

        public final void setRecorderData(@Nullable Pair<byte[], Recorder> pair) {
            this.recorderData = pair;
        }

        public /* synthetic */ OriginalRoute(byte[] bArr, Route route, RouteValue routeValue, Triple triple, Pair pair, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bArr, route, routeValue, (i & 8) != 0 ? null : triple, (i & 16) != 0 ? null : pair);
        }
    }
}
