package com.xiaomi.fitness.sport.view.viewmodel;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import androidx.lifecycle.ViewModelKt;
import com.amap.api.maps.model.LatLng;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.UploadFileManagerExtKt;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.route.export.api.TrackApi;
import com.xiaomi.fitness.route.export.api.TrackApiKt;
import com.xiaomi.fitness.route.export.track.Recorder;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import com.xiaomi.fitness.route.export.track.UploadUrl;
import com.xiaomi.fitness.route.export.track.UploadUserRoute;
import com.xiaomi.fitness.sport.route.detail.model.RankCategory;
import com.xiaomi.fitness.sport.route.detail.model.RankInfo;
import com.xiaomi.fitness.sport.route.detail.server.RouteRepository;
import com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel;
import com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel;
import com.xiaomi.fitness.sport_export.data.RouteCollectResult;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.bxa;
import defpackage.c1j;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0010J<\u0010\u001b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001c\u0018\u00010\u00140\u00132\b\b\u0001\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0017J&\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001c0\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0016\u001a\u00020\u0017J\u001e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0017J,\u0010'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010)2\u001a\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u00190+J\u001c\u0010,\u001a\u00020\u00192\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/sport/view/viewmodel/RunningRouteDetailViewModel;", "Lcom/xiaomi/fitness/sport/viewmodel/RouteBaseViewModel;", "<init>", "()V", "routeRepository", "Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "getRouteRepository", "()Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "setRouteRepository", "(Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;)V", "curtRouteInfoLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "getCurtRouteInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "collectRouteLiveData", "", "getCollectRouteLiveData", "getRouteDetailLiveData", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;", "routeId", "", "collectRoute", "", "collect", "getRankingListLiveData", "", "categoryId", "limit", "getTracePointListLiveData", "Lcom/amap/api/maps/model/LatLng;", "traceFileUrl", "", "sendFeedbackToServer", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", MiuiCursorConstants.CONTENT, "sendToDevice", "bitmap", "Landroid/graphics/Bitmap;", "action", "Lkotlin/Function2;", "uploadTrack", "recorder", "Lcom/xiaomi/fitness/route/export/track/Recorder;", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RunningRouteDetailViewModel extends RouteBaseViewModel {

    @NotNull
    public static final String TAG = "RunningRouteDetailViewModel";
    public static final int TRANSFER_STATUS_ERROR = 4;
    public static final int TRANSFER_STATUS_FINISH = 3;
    public static final int TRANSFER_STATUS_PROGRESSING = 2;
    public static final int TRANSFER_STATUS_START = 1;
    public RouteRepository routeRepository;

    @NotNull
    private final MutableLiveData<RouteInfo> curtRouteInfoLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> collectRouteLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$collectRoute$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$collectRoute$1", f = "RunningRouteDetailViewModel.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $collect;
        final /* synthetic */ int $routeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$routeId = i;
            this.$collect = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RunningRouteDetailViewModel.this.new AnonymousClass1(this.$routeId, this.$collect, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RouteRepository routeRepository = RunningRouteDetailViewModel.this.getRouteRepository();
                int i2 = this.$routeId;
                int i3 = !this.$collect ? 1 : 0;
                this.label = 1;
                obj = routeRepository.collectRoute(i2, i3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RouteCollectResult routeCollectResult = (RouteCollectResult) obj;
            if (routeCollectResult != null) {
                RunningRouteDetailViewModel.this.getCollectRouteLiveData().postValue(Boxing.boxBoolean(routeCollectResult.getCollectResult()));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$getRankingListLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/Pair;", "Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$getRankingListLiveData$1", f = "RunningRouteDetailViewModel.kt", i = {}, l = {92, 92}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30501 extends SuspendLambda implements Function2<LiveDataScope<Pair<? extends RankInfo, ? extends List<? extends RankInfo>>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $categoryId;
        final /* synthetic */ int $limit;
        final /* synthetic */ int $routeId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30501(int i, int i2, int i3, Continuation<? super C30501> continuation) {
            super(2, continuation);
            this.$categoryId = i;
            this.$routeId = i2;
            this.$limit = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30501 c30501 = RunningRouteDetailViewModel.this.new C30501(this.$categoryId, this.$routeId, this.$limit, continuation);
            c30501.L$0 = obj;
            return c30501;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<Pair<RankInfo, List<RankInfo>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C30501) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            RouteRepository routeRepository = RunningRouteDetailViewModel.this.getRouteRepository();
            int i2 = this.$categoryId;
            int i3 = this.$routeId;
            int i4 = this.$limit;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = routeRepository.getRankingList(i2, i3, i4, this);
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

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<Pair<? extends RankInfo, ? extends List<? extends RankInfo>>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<Pair<RankInfo, List<RankInfo>>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$getRouteDetailLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/Pair;", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$getRouteDetailLiveData$1", f = "RunningRouteDetailViewModel.kt", i = {}, l = {75, 75}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30511 extends SuspendLambda implements Function2<LiveDataScope<Pair<? extends RouteInfo, ? extends RankInfo>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $routeId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30511(int i, Continuation<? super C30511> continuation) {
            super(2, continuation);
            this.$routeId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30511 c30511 = RunningRouteDetailViewModel.this.new C30511(this.$routeId, continuation);
            c30511.L$0 = obj;
            return c30511;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<Pair<RouteInfo, RankInfo>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C30511) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            RouteRepository routeRepository = RunningRouteDetailViewModel.this.getRouteRepository();
            int i2 = this.$routeId;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = RouteRepository.getRouteDetail$default(routeRepository, i2, 0, this, 2, null);
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

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<Pair<? extends RouteInfo, ? extends RankInfo>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<Pair<RouteInfo, RankInfo>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$getTracePointListLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$getTracePointListLiveData$1", f = "RunningRouteDetailViewModel.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRunningRouteDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningRouteDetailViewModel.kt\ncom/xiaomi/fitness/sport/view/viewmodel/RunningRouteDetailViewModel$getTracePointListLiveData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n1557#2:267\n1628#2,3:268\n*S KotlinDebug\n*F\n+ 1 RunningRouteDetailViewModel.kt\ncom/xiaomi/fitness/sport/view/viewmodel/RunningRouteDetailViewModel$getTracePointListLiveData$1\n*L\n106#1:267\n106#1:268,3\n*E\n"})
    public static final class C30521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableLiveData<List<LatLng>> $resultLiveData;
        final /* synthetic */ int $routeId;
        final /* synthetic */ String $traceFileUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30521(String str, int i, MutableLiveData<List<LatLng>> mutableLiveData, Continuation<? super C30521> continuation) {
            super(2, continuation);
            this.$traceFileUrl = str;
            this.$routeId = i;
            this.$resultLiveData = mutableLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30521(this.$traceFileUrl, this.$routeId, this.$resultLiveData, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
                String str = this.$traceFileUrl;
                String strValueOf = String.valueOf(this.$routeId);
                this.label = 1;
                obj = fitnessDataExtKt.getRouteGpsData(str, strValueOf, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            if (list != null) {
                List<Location> list2 = list;
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (Location location : list2) {
                    double[] dArrC = bxa.c(location.latitude, location.longitude);
                    arrayList.add(new LatLng(dArrC[0], dArrC[1]));
                }
            } else {
                arrayList = null;
            }
            Logger.d(RunningRouteDetailViewModel.TAG, "getLatLngPointListLiveData latLngList=" + arrayList);
            this.$resultLiveData.postValue(arrayList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$uploadTrack$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$uploadTrack$1", f = "RunningRouteDetailViewModel.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRunningRouteDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningRouteDetailViewModel.kt\ncom/xiaomi/fitness/sport/view/viewmodel/RunningRouteDetailViewModel$uploadTrack$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,266:1\n39#2,6:267\n39#2,6:273\n*S KotlinDebug\n*F\n+ 1 RunningRouteDetailViewModel.kt\ncom/xiaomi/fitness/sport/view/viewmodel/RunningRouteDetailViewModel$uploadTrack$1\n*L\n208#1:267,6\n225#1:273,6\n*E\n"})
    public static final class C30531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ String $fail;
        final /* synthetic */ Recorder $recorder;
        final /* synthetic */ String $success;
        final /* synthetic */ long $uploadTime;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$uploadTrack$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/route/export/track/UploadUrl;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$uploadTrack$1$1", f = "RunningRouteDetailViewModel.kt", i = {0}, l = {203, 205}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
        public static final class C07691 extends SuspendLambda implements Function2<FlowCollector<? super UploadUrl>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Recorder $recorder;
            final /* synthetic */ long $uploadTime;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07691(long j, Recorder recorder, Continuation<? super C07691> continuation) {
                super(2, continuation);
                this.$uploadTime = j;
                this.$recorder = recorder;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07691 c07691 = new C07691(this.$uploadTime, this.$recorder, continuation);
                c07691.L$0 = obj;
                return c07691;
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
                TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
                long j = this.$uploadTime;
                String md5Str = this.$recorder.getMd5Str();
                this.L$0 = flowCollector;
                this.label = 1;
                obj = TrackNet.DefaultImpls.getRunningRouteUploadUrl$default(trackNetManagerKt, j, md5Str, 0, this, 4, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                UploadUrl uploadUrl = (UploadUrl) obj;
                if (uploadUrl != null && uploadUrl.getCode() == 0) {
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(uploadUrl, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super UploadUrl> flowCollector, Continuation<? super Unit> continuation) {
                return ((C07691) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$uploadTrack$1$4, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class AnonymousClass4<T> implements FlowCollector {
            final /* synthetic */ Recorder $recorder;
            final /* synthetic */ long $uploadTime;

            /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$uploadTrack$1$4$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel$uploadTrack$1$4$1", f = "RunningRouteDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C07701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;

                public C07701(Continuation<? super C07701> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C07701(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    TrackApiKt.getInstance(TrackApi.INSTANCE).showTrackServerErrorToast(-100);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C07701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            public AnonymousClass4(long j, Recorder recorder) {
                this.$uploadTime = j;
                this.$recorder = recorder;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((String) obj, (Continuation<? super Unit>) continuation);
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            public final Object emit(String str, Continuation<? super Unit> continuation) {
                RunningRouteDetailViewModel$uploadTrack$1$4$emit$1 runningRouteDetailViewModel$uploadTrack$1$4$emit$1;
                if (continuation instanceof RunningRouteDetailViewModel$uploadTrack$1$4$emit$1) {
                    runningRouteDetailViewModel$uploadTrack$1$4$emit$1 = (RunningRouteDetailViewModel$uploadTrack$1$4$emit$1) continuation;
                    int i = runningRouteDetailViewModel$uploadTrack$1$4$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        runningRouteDetailViewModel$uploadTrack$1$4$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        runningRouteDetailViewModel$uploadTrack$1$4$emit$1 = new RunningRouteDetailViewModel$uploadTrack$1$4$emit$1(this, continuation);
                    }
                } else {
                    runningRouteDetailViewModel$uploadTrack$1$4$emit$1 = new RunningRouteDetailViewModel$uploadTrack$1$4$emit$1(this, continuation);
                }
                RunningRouteDetailViewModel$uploadTrack$1$4$emit$1 runningRouteDetailViewModel$uploadTrack$1$4$emit$2 = runningRouteDetailViewModel$uploadTrack$1$4$emit$1;
                Object objUploadUserRoute$default = runningRouteDetailViewModel$uploadTrack$1$4$emit$2.result;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = runningRouteDetailViewModel$uploadTrack$1$4$emit$2.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objUploadUserRoute$default);
                    if (str.length() > 0) {
                        HashMap map = new HashMap();
                        Recorder recorder = this.$recorder;
                        long j = this.$uploadTime;
                        map.put("alias", recorder.getNameStr());
                        map.put("source", "3");
                        map.put("suffix", recorder.getFileExtension());
                        map.put(StepsInfo.KEY_DISTANCE, String.valueOf(recorder.getDis()));
                        map.put("uploadTime", String.valueOf(j));
                        map.put("length", String.valueOf(recorder.getDis()));
                        TrackNet trackNetManagerKt = TrackNetManagerKt.getInstance(TrackNet.INSTANCE);
                        long j2 = this.$uploadTime;
                        String md5Str = this.$recorder.getMd5Str();
                        runningRouteDetailViewModel$uploadTrack$1$4$emit$2.label = 1;
                        objUploadUserRoute$default = TrackNet.DefaultImpls.uploadUserRoute$default(trackNetManagerKt, j2, md5Str, map, null, runningRouteDetailViewModel$uploadTrack$1$4$emit$2, 8, null);
                        if (objUploadUserRoute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        FitnessLogUtils.i(RunningRouteDetailViewModel.TAG, "uploadUserRoute :" + ((UploadUserRoute) objUploadUserRoute$default));
                    } else {
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        C07701 c07701 = new C07701(null);
                        runningRouteDetailViewModel$uploadTrack$1$4$emit$2.label = 2;
                        if (BuildersKt.withContext(main, c07701, runningRouteDetailViewModel$uploadTrack$1$4$emit$2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        FitnessLogUtils.i(RunningRouteDetailViewModel.TAG, "not upload user route");
                    }
                } else if (i2 == 1) {
                    ResultKt.throwOnFailure(objUploadUserRoute$default);
                    FitnessLogUtils.i(RunningRouteDetailViewModel.TAG, "uploadUserRoute :" + ((UploadUserRoute) objUploadUserRoute$default));
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objUploadUserRoute$default);
                    FitnessLogUtils.i(RunningRouteDetailViewModel.TAG, "not upload user route");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30531(long j, Recorder recorder, String str, String str2, Bitmap bitmap, Continuation<? super C30531> continuation) {
            super(2, continuation);
            this.$uploadTime = j;
            this.$recorder = recorder;
            this.$fail = str;
            this.$success = str2;
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30531(this.$uploadTime, this.$recorder, this.$fail, this.$success, this.$bitmap, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = FlowKt.flow(new RunningRouteDetailViewModel$uploadTrack$1$invokeSuspend$$inlined$transform$2(FlowKt.flow(new RunningRouteDetailViewModel$uploadTrack$1$invokeSuspend$$inlined$transform$1(FlowKt.flow(new C07691(this.$uploadTime, this.$recorder, null)), null, this.$recorder, this.$fail)), null, this.$success, this.$fail, this.$bitmap));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$uploadTime, this.$recorder);
                this.label = 1;
                if (flow.collect(anonymousClass4, this) == coroutine_suspended) {
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
            return ((C30531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendFeedbackToServer$lambda$0(FragmentActivity fragmentActivity, String it) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(it, "it");
        ToastExtKt.toastShort(fragmentActivity, c1j.g5);
        Logger.i(TAG, "sendFeedbackToServer success result=" + it);
        fragmentActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendFeedbackToServer$lambda$1(FragmentActivity fragmentActivity, ApiException it) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "sendFeedbackToServer fail error=" + it);
        ToastExtKt.toastShort(fragmentActivity, c1j.common_network_error_retry_later);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uploadTrack(Recorder recorder, Bitmap bitmap) {
        if (recorder == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C30531(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), recorder, "", "success", bitmap, null), 2, null);
    }

    public final void collectRoute(int routeId, boolean collect) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(routeId, collect, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getCollectRouteLiveData() {
        return this.collectRouteLiveData;
    }

    @NotNull
    public final MutableLiveData<RouteInfo> getCurtRouteInfoLiveData() {
        return this.curtRouteInfoLiveData;
    }

    @NotNull
    public final LiveData<Pair<RankInfo, List<RankInfo>>> getRankingListLiveData(@RankCategory int categoryId, int routeId, int limit) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C30501(categoryId, routeId, limit, null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<Pair<RouteInfo, RankInfo>> getRouteDetailLiveData(int routeId) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C30511(routeId, null), 3, (Object) null);
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

    @NotNull
    public final MutableLiveData<List<LatLng>> getTracePointListLiveData(@Nullable String traceFileUrl, int routeId) {
        MutableLiveData<List<LatLng>> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C30521(traceFileUrl, routeId, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    public final void sendFeedbackToServer(@NotNull final FragmentActivity fragmentActivity, @NotNull String content, int routeId) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(content, "content");
        FeedBackModelData feedBackModelData = new FeedBackModelData();
        feedBackModelData.setModule_id(239);
        feedBackModelData.setContent(content);
        feedBackModelData.setMi_wide_tag_id(-30);
        feedBackModelData.setVersion_code(AppUtil.getVersionCode());
        feedBackModelData.setVersion_name(AppUtil.getVersionName());
        feedBackModelData.setMi_tag_id(routeId);
        feedBackModelData.setTags(CollectionsKt__CollectionsKt.mutableListOf("跑步路线"));
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        feedBackModelData.setFw_version(wearableDeviceModel != null ? DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel) : null);
        UploadFileManagerExtKt.getInstance(UploadFileManager.INSTANCE).feedback(ViewModelKt.getViewModelScope(this), feedBackModelData, new Function1() { // from class: t2l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningRouteDetailViewModel.sendFeedbackToServer$lambda$0(fragmentActivity, (String) obj);
            }
        }, new Function1() { // from class: u2l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningRouteDetailViewModel.sendFeedbackToServer$lambda$1(fragmentActivity, (ApiException) obj);
            }
        });
    }

    public final void sendToDevice(@Nullable Bitmap bitmap, @NotNull Function2<? super Integer, ? super Integer, Unit> action) {
        int length;
        Intrinsics.checkNotNullParameter(action, "action");
        SportBasicReport sportBasicReport = new SportBasicReport(null);
        RouteInfo value = this.curtRouteInfoLiveData.getValue();
        if ((value != null ? Double.valueOf(value.getLength()) : null) != null) {
            RouteInfo value2 = this.curtRouteInfoLiveData.getValue();
            Intrinsics.checkNotNull(value2);
            length = (int) (value2.getLength() * 1000.0d);
        } else {
            length = 0;
        }
        sportBasicReport.setDistance(Integer.valueOf(length));
        RouteInfo value3 = this.curtRouteInfoLiveData.getValue();
        String name = value3 != null ? value3.getName() : null;
        Logger.e(TAG, "icSendToDevice file path = " + getTrackFilePath() + "，distance = " + sportBasicReport.getDistance());
        String trackFilePath = getTrackFilePath();
        if (trackFilePath != null) {
            String fileMD5 = MD5Util.getFileMD5(new File(trackFilePath));
            Logger.i(TAG, "gpx file md5 = " + fileMD5);
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) trackFilePath, new String[]{"."}, false, 0, 6, (Object) null);
            ScopeExtKt.scopeLife$default(this, null, new RunningRouteDetailViewModel$sendToDevice$1$1(name, trackFilePath, (String) listSplit$default.get(listSplit$default.size() - 1), fileMD5, this, bitmap, action, null), 1, null);
        }
    }

    public final void setRouteRepository(@NotNull RouteRepository routeRepository) {
        Intrinsics.checkNotNullParameter(routeRepository, "<set-?>");
        this.routeRepository = routeRepository;
    }
}
