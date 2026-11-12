package com.xiaomi.fitness.sport.view.route.holder;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.model.LatLng;
import com.miui.tsmclient.entity.CardUIInfo;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel;
import com.xiaomi.fitness.sport.utils.ExtensionsKt;
import com.xiaomi.fitness.sport.view.route.CreateRouteActivity;
import com.xiaomi.fitness.sport.view.route.RunningRouteListActivity;
import com.xiaomi.fitness.sport.view.route.RunningRouteListBean;
import com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder;
import com.xiaomi.fitness.sport.view.tab.adapter.RunningRouteView;
import com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import defpackage.aki;
import defpackage.bxa;
import defpackage.c1j;
import defpackage.eoi;
import defpackage.jrk;
import defpackage.mpi;
import defpackage.ni4;
import defpackage.xri;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 B2\u00020\u0001:\u0002BCB'\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b@\u0010AJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0004R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010&\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u001c\u0010'\u001a\n #*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u000bR\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020>018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00104¨\u0006D"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/holder/RunningRouteHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "initListeners", "()V", "updateCityState", "switchOfficialView", "switchAiView", "bindData", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "mViewModel", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "getMViewModel", "()Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteListVM;", "runningRouteListVM", "Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteListVM;", "getRunningRouteListVM", "()Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteListVM;", "Lcom/xiaomi/fitness/sport/view/tab/adapter/RunningRouteView;", "routeView", "Lcom/xiaomi/fitness/sport/view/tab/adapter/RunningRouteView;", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "title", "Landroid/widget/TextView;", CardUIInfo.KEY_SUBTITILE, "createRouteCard", "Lcom/amap/api/location/AMapLocationClient;", "mLocationClient", "Lcom/amap/api/location/AMapLocationClient;", "Lcom/amap/api/location/AMapLocationListener;", "mLocationListener", "Lcom/amap/api/location/AMapLocationListener;", "Lcom/amap/api/maps/model/LatLng;", "curLocationdata", "Lcom/amap/api/maps/model/LatLng;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/xiaomi/fitness/sport/view/route/holder/RunningRouteHolder$LocationPoint;", "_locationPoint", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "locationPoint", "Lkotlinx/coroutines/flow/StateFlow;", "", "currentCityCode", "Ljava/lang/String;", "", "hasLocationPermission", "Z", "", "state", "<init>", "(Landroid/view/View;Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteListVM;)V", "Companion", "LocationPoint", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RunningRouteHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "RunningRouteHolder";

    @NotNull
    private final MutableStateFlow<LocationPoint> _locationPoint;
    private final View createRouteCard;

    @Nullable
    private LatLng curLocationdata;

    @Nullable
    private String currentCityCode;

    @NotNull
    private final FragmentActivity fragmentActivity;
    private boolean hasLocationPermission;

    @NotNull
    private final StateFlow<LocationPoint> locationPoint;

    @Nullable
    private AMapLocationClient mLocationClient;

    @NotNull
    private final AMapLocationListener mLocationListener;

    @NotNull
    private final SportTabV4ViewModel mViewModel;

    @NotNull
    private final RunningRouteView routeView;

    @NotNull
    private final RunningRouteListVM runningRouteListVM;

    @NotNull
    private volatile MutableStateFlow<Integer> state;
    private final TextView subTitle;
    private final TextView title;

    @NotNull
    private View view;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder$2", f = "RunningRouteHolder.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "location", "Lcom/xiaomi/fitness/sport/view/route/holder/RunningRouteHolder$LocationPoint;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder$2$1", f = "RunningRouteHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<LocationPoint, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RunningRouteHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RunningRouteHolder runningRouteHolder, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = runningRouteHolder;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(LocationPoint locationPoint, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(locationPoint, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LocationPoint locationPoint = (LocationPoint) this.L$0;
                if (locationPoint != null) {
                    this.this$0.getRunningRouteListVM().getRecommendedRouteList(locationPoint.getLongitude(), locationPoint.getLatitude(), 1);
                }
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RunningRouteHolder.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = RunningRouteHolder.this.locationPoint;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RunningRouteHolder.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder$3", f = "RunningRouteHolder.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder$3$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a.\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u00070\u00012\u0017\u0010\b\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u00052\u0015\u0010\t\u001a\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListBean;", "Lkotlin/ParameterName;", "name", PluginDeviceInfo.FMODEL, "", PluginDeviceInfo.FDESC, "routeListBean", "state"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder$3$1", f = "RunningRouteHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<RunningRouteListBean, Integer, Continuation<? super Pair<? extends RunningRouteListBean, ? extends Integer>>, Object> {
            /* synthetic */ int I$0;
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            public final Object invoke(RunningRouteListBean runningRouteListBean, int i, Continuation<? super Pair<RunningRouteListBean, Integer>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = runningRouteListBean;
                anonymousClass1.I$0 = i;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new Pair((RunningRouteListBean) this.L$0, Boxing.boxInt(this.I$0));
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(RunningRouteListBean runningRouteListBean, Integer num, Continuation<? super Pair<? extends RunningRouteListBean, ? extends Integer>> continuation) {
                return invoke(runningRouteListBean, num.intValue(), (Continuation<? super Pair<RunningRouteListBean, Integer>>) continuation);
            }
        }

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RunningRouteHolder.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(RunningRouteHolder.this.getRunningRouteListVM().getRouteListFlow(), RunningRouteHolder.this.state, new AnonymousClass1(null));
                final RunningRouteHolder runningRouteHolder = RunningRouteHolder.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder.3.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Pair<RunningRouteListBean, Integer>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Pair<RunningRouteListBean, Integer> pair, Continuation<? super Unit> continuation) {
                        RunningRouteListBean runningRouteListBeanComponent1 = pair.component1();
                        int iIntValue = pair.component2().intValue();
                        List<RouteInfo> route_Info_list = runningRouteListBeanComponent1 != null ? runningRouteListBeanComponent1.getRoute_Info_list() : null;
                        boolean z = !(route_Info_list == null || route_Info_list.isEmpty());
                        if (iIntValue != 1) {
                            if (iIntValue != 2) {
                                if (iIntValue != 3) {
                                    ViewExtKt.gone(runningRouteHolder.routeView);
                                    View view = runningRouteHolder.createRouteCard;
                                    Intrinsics.checkNotNullExpressionValue(view, "access$getCreateRouteCard$p(...)");
                                    ViewExtKt.gone(view);
                                } else {
                                    ViewExtKt.gone(runningRouteHolder.routeView);
                                    runningRouteHolder.switchAiView();
                                    View view2 = runningRouteHolder.createRouteCard;
                                    Intrinsics.checkNotNullExpressionValue(view2, "access$getCreateRouteCard$p(...)");
                                    ViewExtKt.visible(view2);
                                }
                            } else if (z) {
                                ViewExtKt.visible(runningRouteHolder.routeView);
                                View view3 = runningRouteHolder.createRouteCard;
                                Intrinsics.checkNotNullExpressionValue(view3, "access$getCreateRouteCard$p(...)");
                                ViewExtKt.gone(view3);
                                RunningRouteView runningRouteView = runningRouteHolder.routeView;
                                Intrinsics.checkNotNull(runningRouteListBeanComponent1);
                                List<RouteInfo> route_Info_list2 = runningRouteListBeanComponent1.getRoute_Info_list();
                                Intrinsics.checkNotNull(route_Info_list2);
                                runningRouteView.setData(new RunningRouteListBean(route_Info_list2));
                            } else {
                                ViewExtKt.gone(runningRouteHolder.routeView);
                                runningRouteHolder.switchOfficialView();
                                View view4 = runningRouteHolder.createRouteCard;
                                Intrinsics.checkNotNullExpressionValue(view4, "access$getCreateRouteCard$p(...)");
                                ViewExtKt.visible(view4);
                            }
                        } else if (z) {
                            ViewExtKt.visible(runningRouteHolder.routeView);
                            View view5 = runningRouteHolder.createRouteCard;
                            Intrinsics.checkNotNullExpressionValue(view5, "access$getCreateRouteCard$p(...)");
                            ViewExtKt.gone(view5);
                            RunningRouteView runningRouteView2 = runningRouteHolder.routeView;
                            Intrinsics.checkNotNull(runningRouteListBeanComponent1);
                            List<RouteInfo> route_Info_list3 = runningRouteListBeanComponent1.getRoute_Info_list();
                            Intrinsics.checkNotNull(route_Info_list3);
                            runningRouteView2.setData(new RunningRouteListBean(route_Info_list3));
                        } else {
                            ViewExtKt.gone(runningRouteHolder.routeView);
                            runningRouteHolder.switchAiView();
                            View view6 = runningRouteHolder.createRouteCard;
                            Intrinsics.checkNotNullExpressionValue(view6, "access$getCreateRouteCard$p(...)");
                            ViewExtKt.visible(view6);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowCombine.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder$4", f = "RunningRouteHolder.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RunningRouteHolder.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<RunningRouteSupportCityBean> runningRouteIsCurrentCitySupportedResultFlow = RunningRouteHolder.this.getMViewModel().getRunningRouteIsCurrentCitySupportedResultFlow();
                final RunningRouteHolder runningRouteHolder = RunningRouteHolder.this;
                FlowCollector<? super RunningRouteSupportCityBean> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder.4.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((RunningRouteSupportCityBean) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(RunningRouteSupportCityBean runningRouteSupportCityBean, Continuation<? super Unit> continuation) {
                        if (runningRouteSupportCityBean == null) {
                            return Unit.INSTANCE;
                        }
                        Logger.i(RunningRouteHolder.TAG, "get support city result:" + runningRouteSupportCityBean);
                        if (runningRouteSupportCityBean.getOfficialOpen() && runningRouteSupportCityBean.getAiOpen()) {
                            if (((Number) runningRouteHolder.state.getValue()).intValue() == 1) {
                                return Unit.INSTANCE;
                            }
                            runningRouteHolder.state.setValue(Boxing.boxInt(1));
                        } else if (runningRouteSupportCityBean.getOfficialOpen()) {
                            if (((Number) runningRouteHolder.state.getValue()).intValue() == 2) {
                                return Unit.INSTANCE;
                            }
                            runningRouteHolder.state.setValue(Boxing.boxInt(2));
                        } else if (runningRouteSupportCityBean.getAiOpen()) {
                            if (((Number) runningRouteHolder.state.getValue()).intValue() == 3) {
                                return Unit.INSTANCE;
                            }
                            runningRouteHolder.state.setValue(Boxing.boxInt(3));
                        } else {
                            if (((Number) runningRouteHolder.state.getValue()).intValue() == -1) {
                                return Unit.INSTANCE;
                            }
                            runningRouteHolder.state.setValue(Boxing.boxInt(-1));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (runningRouteIsCurrentCitySupportedResultFlow.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/holder/RunningRouteHolder$LocationPoint;", "", "longitude", "", "latitude", "<init>", "(DD)V", "getLongitude", "()D", "getLatitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationPoint {
        private final double latitude;
        private final double longitude;

        public LocationPoint(double d, double d2) {
            this.longitude = d;
            this.latitude = d2;
        }

        public static /* synthetic */ LocationPoint copy$default(LocationPoint locationPoint, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = locationPoint.longitude;
            }
            if ((i & 2) != 0) {
                d2 = locationPoint.latitude;
            }
            return locationPoint.copy(d, d2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        @NotNull
        public final LocationPoint copy(double longitude, double latitude) {
            return new LocationPoint(longitude, latitude);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationPoint)) {
                return false;
            }
            LocationPoint locationPoint = (LocationPoint) other;
            return Double.compare(this.longitude, locationPoint.longitude) == 0 && Double.compare(this.latitude, locationPoint.latitude) == 0;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public int hashCode() {
            return (Double.hashCode(this.longitude) * 31) + Double.hashCode(this.latitude);
        }

        @NotNull
        public String toString() {
            return "LocationPoint(longitude=" + this.longitude + ", latitude=" + this.latitude + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder$initListeners$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder$initListeners$1", f = "RunningRouteHolder.kt", i = {}, l = {272}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder$initListeners$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder$initListeners$1$1", f = "RunningRouteHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            public C07661(Continuation<? super C07661> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07661(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RunningRouteHolder.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FragmentActivity fragmentActivity = RunningRouteHolder.this.getFragmentActivity();
                Lifecycle.State state = Lifecycle.State.STARTED;
                C07661 c07661 = new C07661(null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(fragmentActivity, state, c07661, this) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunningRouteHolder(@NotNull View view, @NotNull FragmentActivity fragmentActivity, @NotNull SportTabV4ViewModel mViewModel, @NotNull RunningRouteListVM runningRouteListVM) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        Intrinsics.checkNotNullParameter(runningRouteListVM, "runningRouteListVM");
        this.view = view;
        this.fragmentActivity = fragmentActivity;
        this.mViewModel = mViewModel;
        this.runningRouteListVM = runningRouteListVM;
        View viewFindViewById = view.findViewById(xri.G5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RunningRouteView runningRouteView = (RunningRouteView) viewFindViewById;
        this.routeView = runningRouteView;
        this.title = (TextView) this.view.findViewById(xri.v6);
        this.subTitle = (TextView) this.view.findViewById(xri.u6);
        View createRouteCard = this.view.findViewById(xri.A0);
        this.createRouteCard = createRouteCard;
        MutableStateFlow<LocationPoint> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._locationPoint = MutableStateFlow;
        this.locationPoint = MutableStateFlow;
        this.state = StateFlowKt.MutableStateFlow(-1);
        View viewFindViewById2 = this.view.findViewById(xri.b8);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        textView.setTypeface(jrk.h(this.view.getContext(), mpi.c));
        textView.setTextSize(2, 17.0f);
        textView.setTextColor(ExtUtilsKt.getColor(aki.A));
        textView.setPaddingRelative(ExtUtilsKt.getDp(7), ExtUtilsKt.getDp(12), 0, ExtUtilsKt.getDp(12));
        View viewFindViewById3 = this.view.findViewById(xri.L3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById3;
        textView2.setTypeface(jrk.h(this.view.getContext(), mpi.f27070b));
        textView2.setTextColor(ExtUtilsKt.getColor(aki.D));
        textView2.setText(c1j.Z4);
        textView2.setTextSize(ExtensionsKt.getPx(14));
        textView2.setCompoundDrawablesWithIntrinsicBounds(textView2.getCompoundDrawables()[0], textView2.getCompoundDrawables()[1], ni4.e(this.view.getContext(), eoi.f16885r), textView2.getCompoundDrawables()[3]);
        textView2.setCompoundDrawablePadding(-ExtUtilsKt.getDp(1));
        textView2.setPaddingRelative(0, 0, -ExtUtilsKt.getDp(1), 0);
        ((RecyclerView) runningRouteView.findViewById(xri.W4)).setPaddingRelative(ExtUtilsKt.getDp(10), ExtUtilsKt.getDp(1), ExtUtilsKt.getDp(10), ExtUtilsKt.getDp(13));
        this.mLocationListener = new AMapLocationListener() { // from class: q3l
            @Override // com.amap.api.location.AMapLocationListener
            public final void onLocationChanged(AMapLocation aMapLocation) {
                RunningRouteHolder._init_$lambda$0(this.f31049a, aMapLocation);
            }
        };
        ViewExtKt.gone(runningRouteView);
        Intrinsics.checkNotNullExpressionValue(createRouteCard, "createRouteCard");
        ViewExtKt.gone(createRouteCard);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new AnonymousClass3(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new AnonymousClass4(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(RunningRouteHolder this$0, AMapLocation aMapLocation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "AMapLocationListener get location:" + aMapLocation.getLatitude() + "," + aMapLocation.getLongitude());
        double[] dArrB = bxa.b(aMapLocation.getLatitude(), aMapLocation.getLongitude());
        LocationPoint locationPoint = new LocationPoint(dArrB[1], dArrB[0]);
        this$0.curLocationdata = new LatLng(aMapLocation.getLatitude(), aMapLocation.getLongitude());
        this$0._locationPoint.setValue(locationPoint);
        if (!Intrinsics.areEqual(this$0.currentCityCode, aMapLocation.getCityCode())) {
            this$0.currentCityCode = aMapLocation.getCityCode();
            Logger.i(TAG, "AMapLocationListener get cityCode:" + aMapLocation.getCityCode());
            this$0.updateCityState();
        }
        AMapLocationClient aMapLocationClient = this$0.mLocationClient;
        if (aMapLocationClient != null) {
            aMapLocationClient.stopLocation();
        }
        AMapLocationClient aMapLocationClient2 = this$0.mLocationClient;
        if (aMapLocationClient2 != null) {
            aMapLocationClient2.onDestroy();
        }
        this$0.mLocationClient = null;
    }

    private final void initListeners() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.fragmentActivity), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchAiView() {
        this.title.setText(ResourceExtKt.getString(c1j.X0));
        this.subTitle.setText(ResourceExtKt.getString(c1j.I4));
        this.createRouteCard.setOnClickListener(new View.OnClickListener() { // from class: r3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningRouteHolder.switchAiView$lambda$3(this.f32149a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void switchAiView$lambda$3(RunningRouteHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity.Companion companion = CreateRouteActivity.INSTANCE;
        Context context = this$0.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.start(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchOfficialView() {
        this.title.setText(ResourceExtKt.getString(c1j.p1));
        this.subTitle.setText(ResourceExtKt.getString(c1j.c4));
        this.createRouteCard.setOnClickListener(new View.OnClickListener() { // from class: s3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningRouteHolder.switchOfficialView$lambda$2(this.f33245a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void switchOfficialView$lambda$2(RunningRouteHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.view.getContext().startActivity(new Intent(this$0.view.getContext(), (Class<?>) RunningRouteListActivity.class));
    }

    private final void updateCityState() {
        this.mViewModel.updateRunningRouteIsCurrentCitySupportedFlow(this.currentCityCode);
    }

    public final void bindData() {
        AMapLocationClient aMapLocationClient = this.mLocationClient;
        if (aMapLocationClient != null) {
            aMapLocationClient.stopLocation();
        }
        AMapLocationClient aMapLocationClient2 = this.mLocationClient;
        if (aMapLocationClient2 != null) {
            aMapLocationClient2.onDestroy();
        }
        this.mLocationClient = null;
        boolean z = LocationExtKt.supportsOutdoorSportPositionService(this.fragmentActivity) && PermissionExtKt.isPermissionGranted(this.fragmentActivity, "android.permission.ACCESS_FINE_LOCATION");
        this.hasLocationPermission = z;
        Logger.i(TAG, "bindData hasLocationPermission:" + z);
        if (!this.hasLocationPermission) {
            updateCityState();
            return;
        }
        AMapLocationClient aMapLocationClient3 = new AMapLocationClient(AppUtil.getApp());
        this.mLocationClient = aMapLocationClient3;
        AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
        aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        aMapLocationClientOption.setOnceLocation(true);
        aMapLocationClientOption.setLocationCacheEnable(true);
        aMapLocationClientOption.setNeedAddress(true);
        aMapLocationClientOption.setMockEnable(true);
        aMapLocationClient3.setLocationOption(aMapLocationClientOption);
        AMapLocationClient aMapLocationClient4 = this.mLocationClient;
        if (aMapLocationClient4 != null) {
            aMapLocationClient4.setLocationListener(this.mLocationListener);
        }
        AMapLocationClient aMapLocationClient5 = this.mLocationClient;
        if (aMapLocationClient5 != null) {
            aMapLocationClient5.startLocation();
        }
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    @NotNull
    public final SportTabV4ViewModel getMViewModel() {
        return this.mViewModel;
    }

    @NotNull
    public final RunningRouteListVM getRunningRouteListVM() {
        return this.runningRouteListVM;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    public final void setView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.view = view;
    }
}
