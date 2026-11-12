package com.xiaomi.fitness.sport.view.route;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.GestureDetectorCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.decode.GifDecoder;
import coil.decode.ImageDecoderDecoder;
import coil.request.ImageRequest;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.route.detail.model.CreateRouteStatus;
import com.xiaomi.fitness.sport.route.detail.model.ProgressRouteStatus;
import com.xiaomi.fitness.sport.route.detail.model.RouteSceneType;
import com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import defpackage.amn;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.p9n;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 I2\u00020\u0001:\u0002IJB\u0007¢\u0006\u0004\bH\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u001d\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00104R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010C\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\u0018¨\u0006K"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteLoadingFragment;", "Landroidx/fragment/app/Fragment;", "", "initNoneGesture", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V", "buildDialog", "cancelJob", "handleBackPressed", "showConfirmationDialog", "showLoading", "hideLoading", "destroyLoading", "startProgress", "", "sceneType", "buildLoadingTimer", "(I)V", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "strategyId", "Lcom/xiaomi/fitness/sport/route/detail/model/RouteSceneType;", "type", "requestRoutesAndJump", "(ILcom/xiaomi/fitness/sport/route/detail/model/RouteSceneType;)V", "Lamn;", "mBinding", "Lamn;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "createRouteActivity", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "Lp9n;", "createRouteActivityBinding", "Lp9n;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "Lmiuix/appcompat/app/c;", "dialog", "Lmiuix/appcompat/app/c;", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/ImageLoader;", "Ljava/lang/Integer;", "Landroid/os/CountDownTimer;", "loadingTimer", "Landroid/os/CountDownTimer;", "getLoadingTimer", "()Landroid/os/CountDownTimer;", "setLoadingTimer", "(Landroid/os/CountDownTimer;)V", "Landroid/animation/ValueAnimator;", "loadingFinishAnimator", "Landroid/animation/ValueAnimator;", "getLoadingFinishAnimator", "()Landroid/animation/ValueAnimator;", "setLoadingFinishAnimator", "(Landroid/animation/ValueAnimator;)V", "startCount", "I", "getStartCount", "()I", "setStartCount", "<init>", "Companion", "MyGestureListener", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCreateRouteLoadingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteLoadingFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteLoadingFragment\n+ 2 ImageLoader.kt\ncoil/ImageLoader$Builder\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Extensions.kt\ncoil/-SingletonExtensions\n+ 5 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,367:1\n192#2:368\n254#3:369\n54#4,9:370\n63#4,2:380\n57#5:379\n*S KotlinDebug\n*F\n+ 1 CreateRouteLoadingFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteLoadingFragment\n*L\n151#1:368\n211#1:369\n216#1:370,9\n216#1:380,2\n216#1:379\n*E\n"})
public final class CreateRouteLoadingFragment extends Fragment {
    public static final long LOADING_COUNT_DOWN_INTERVAL = 1000;
    public static final long ROUTE_LOADING_DURATION = 25000;
    public static final long STYLE_LOADING_DURATION = 50000;

    @NotNull
    public static final String TAG = "CreateRouteLoadingFragment";
    private CreateRouteActivity createRouteActivity;
    private p9n createRouteActivityBinding;
    private CreateRouteViewModel createRouteViewModel;

    @Nullable
    private miuix.appcompat.app.c dialog;

    @Nullable
    private ImageLoader imageLoader;

    @Nullable
    private ValueAnimator loadingFinishAnimator;

    @Nullable
    private CountDownTimer loadingTimer;
    private amn mBinding;
    private int startCount;

    @Nullable
    private Integer strategyId;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J*\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteLoadingFragment$MyGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lcom/xiaomi/fitness/sport/view/route/CreateRouteLoadingFragment;)V", "onSingleTapConfirmed", "", PluginDeviceInfo.FICONOFFLINE, "Landroid/view/MotionEvent;", "onScroll", "e1", "e2", "distanceX", "", "distanceY", "onLongPress", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
        public MyGestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(@NotNull MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@Nullable MotionEvent e1, @NotNull MotionEvent e2, float distanceX, float distanceY) {
            Intrinsics.checkNotNullParameter(e2, "e2");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(@NotNull MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment$requestRoutesAndJump$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment$requestRoutesAndJump$1", f = "CreateRouteLoadingFragment.kt", i = {0}, l = {336, 337}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class C30401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $strategyId;
        final /* synthetic */ RouteSceneType $type;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment$requestRoutesAndJump$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001d\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007H\n"}, d2 = {"<anonymous>", "", "result", "", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment$requestRoutesAndJump$1$1", f = "CreateRouteLoadingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07611 extends SuspendLambda implements Function2<List<? extends CreateRouteViewModel.RouteData>, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$launch;
            final /* synthetic */ RouteSceneType $type;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreateRouteLoadingFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07611(RouteSceneType routeSceneType, CreateRouteLoadingFragment createRouteLoadingFragment, CoroutineScope coroutineScope, Continuation<? super C07611> continuation) {
                super(2, continuation);
                this.$type = routeSceneType;
                this.this$0 = createRouteLoadingFragment;
                this.$$this$launch = coroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07611 c07611 = new C07611(this.$type, this.this$0, this.$$this$launch, continuation);
                c07611.L$0 = obj;
                return c07611;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends CreateRouteViewModel.RouteData> list, Continuation<? super Unit> continuation) {
                return invoke2((List<CreateRouteViewModel.RouteData>) list, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                FitnessLogUtils.i(CreateRouteActivity.TAG, "aiRouteDataFlow:" + System.currentTimeMillis());
                if (list == null) {
                    return Unit.INSTANCE;
                }
                if (this.$type == RouteSceneType.RouteSceneTypeStyle && list.isEmpty()) {
                    CreateRouteActivity createRouteActivity = this.this$0.createRouteActivity;
                    if (createRouteActivity == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                        createRouteActivity = null;
                    }
                    createRouteActivity.replaceBottomSheetFragment(new CreateRouteEmptyMapFragment());
                    this.this$0.destroyLoading();
                    CoroutineScopeKt.cancel$default(this.$$this$launch, null, 1, null);
                    return Unit.INSTANCE;
                }
                CreateRouteActivity createRouteActivity2 = this.this$0.createRouteActivity;
                if (createRouteActivity2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                    createRouteActivity2 = null;
                }
                createRouteActivity2.replaceBottomSheetFragment(new CreateRouteConfirmRouteFragment(this.$type));
                this.this$0.destroyLoading();
                CoroutineScopeKt.cancel$default(this.$$this$launch, null, 1, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<CreateRouteViewModel.RouteData> list, Continuation<? super Unit> continuation) {
                return ((C07611) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30401(int i, RouteSceneType routeSceneType, Continuation<? super C30401> continuation) {
            super(2, continuation);
            this.$strategyId = i;
            this.$type = routeSceneType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30401 c30401 = CreateRouteLoadingFragment.this.new C30401(this.$strategyId, this.$type, continuation);
            c30401.L$0 = obj;
            return c30401;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    coroutineScope = (CoroutineScope) this.L$0;
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
            coroutineScope = (CoroutineScope) this.L$0;
            FitnessLogUtils.i(CreateRouteActivity.TAG, "requestAiRoutes:" + System.currentTimeMillis());
            CreateRouteViewModel createRouteViewModel = CreateRouteLoadingFragment.this.createRouteViewModel;
            if (createRouteViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                createRouteViewModel = null;
            }
            int i2 = this.$strategyId;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (createRouteViewModel.requestRoute(i2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            CreateRouteViewModel createRouteViewModel2 = CreateRouteLoadingFragment.this.createRouteViewModel;
            if (createRouteViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                createRouteViewModel2 = null;
            }
            StateFlow<List<CreateRouteViewModel.RouteData>> aiRouteDataFlow = createRouteViewModel2.getAiRouteDataFlow();
            C07611 c07611 = new C07611(this.$type, CreateRouteLoadingFragment.this, coroutineScope, null);
            this.L$0 = null;
            this.label = 2;
            if (FlowKt.collectLatest(aiRouteDataFlow, c07611, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment$startProgress$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment$startProgress$1", f = "CreateRouteLoadingFragment.kt", i = {}, l = {245}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment$startProgress$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment$startProgress$1$1", f = "CreateRouteLoadingFragment.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CreateRouteLoadingFragment this$0;

            /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment$startProgress$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nCreateRouteLoadingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteLoadingFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteLoadingFragment$startProgress$1$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,367:1\n254#2:368\n*S KotlinDebug\n*F\n+ 1 CreateRouteLoadingFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteLoadingFragment$startProgress$1$1$1\n*L\n290#1:368\n*E\n"})
            public static final class C07631<T> implements FlowCollector {
                final /* synthetic */ CreateRouteLoadingFragment this$0;

                public C07631(CreateRouteLoadingFragment createRouteLoadingFragment) {
                    this.this$0 = createRouteLoadingFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:9:0x0057 A[PHI: r0
                  0x0057: PHI (r0v11 com.xiaomi.fitness.sport.route.detail.model.RouteSceneType) = 
                  (r0v7 com.xiaomi.fitness.sport.route.detail.model.RouteSceneType)
                  (r0v8 com.xiaomi.fitness.sport.route.detail.model.RouteSceneType)
                 binds: [B:8:0x0055, B:11:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
                public static final void emit$lambda$0(CreateRouteLoadingFragment this$0, int i, Pair pair, ValueAnimator it) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object animatedValue = it.getAnimatedValue();
                    Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) animatedValue).intValue();
                    amn amnVar = this$0.mBinding;
                    if (amnVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        amnVar = null;
                    }
                    amnVar.D.setText(this$0.getString(c1j.m4) + " " + iIntValue + "%");
                    if (iIntValue == 100) {
                        RouteSceneType routeSceneType = RouteSceneType.Unknown;
                        RouteSceneType routeSceneType2 = RouteSceneType.RouteSceneTypeAi;
                        if (i == routeSceneType2.getCode()) {
                            routeSceneType = routeSceneType2;
                        } else {
                            routeSceneType2 = RouteSceneType.RouteSceneTypeStyle;
                            if (i == routeSceneType2.getCode()) {
                                routeSceneType = routeSceneType2;
                            }
                        }
                        this$0.showLoading();
                        FitnessLogUtils.i(CreateRouteLoadingFragment.TAG, "request route style:" + routeSceneType + ",time:" + System.currentTimeMillis());
                        this$0.requestRoutesAndJump(((ProgressRouteStatus) pair.getSecond()).getStrategyId(), routeSceneType);
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((Pair<Boolean, ProgressRouteStatus>) obj, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(final Pair<Boolean, ProgressRouteStatus> pair, Continuation<? super Unit> continuation) {
                    if (pair == null) {
                        return Unit.INSTANCE;
                    }
                    this.this$0.strategyId = Boxing.boxInt(pair.getSecond().getStrategyId());
                    final int sceneType = pair.getSecond().getSceneType();
                    int routeStatus = pair.getSecond().getRouteStatus();
                    FitnessLogUtils.i(CreateRouteLoadingFragment.TAG, "progress loading routeId:" + this.this$0.strategyId + ", routeStatus:" + routeStatus + ", sceneType:" + sceneType);
                    if (pair.getFirst().booleanValue()) {
                        this.this$0.showLoading();
                        this.this$0.buildLoadingTimer(sceneType);
                    } else {
                        CountDownTimer loadingTimer = this.this$0.getLoadingTimer();
                        if (loadingTimer != null) {
                            loadingTimer.cancel();
                        }
                        amn amnVar = null;
                        this.this$0.setLoadingTimer(null);
                        if (routeStatus == CreateRouteStatus.CREATED.getStatus()) {
                            CreateRouteLoadingFragment createRouteLoadingFragment = this.this$0;
                            createRouteLoadingFragment.setLoadingFinishAnimator(ValueAnimator.ofInt(createRouteLoadingFragment.getStartCount(), 100));
                            ValueAnimator loadingFinishAnimator = this.this$0.getLoadingFinishAnimator();
                            Intrinsics.checkNotNull(loadingFinishAnimator);
                            loadingFinishAnimator.setDuration(200L);
                            ValueAnimator loadingFinishAnimator2 = this.this$0.getLoadingFinishAnimator();
                            Intrinsics.checkNotNull(loadingFinishAnimator2);
                            final CreateRouteLoadingFragment createRouteLoadingFragment2 = this.this$0;
                            loadingFinishAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xiaomi.fitness.sport.view.route.i
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    CreateRouteLoadingFragment.C30411.C07621.C07631.emit$lambda$0(createRouteLoadingFragment2, sceneType, pair, valueAnimator);
                                }
                            });
                            ValueAnimator loadingFinishAnimator3 = this.this$0.getLoadingFinishAnimator();
                            if (loadingFinishAnimator3 != null) {
                                loadingFinishAnimator3.start();
                            }
                        } else {
                            amn amnVar2 = this.this$0.mBinding;
                            if (amnVar2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            } else {
                                amnVar = amnVar2;
                            }
                            FrameLayout createRouteLoadingContainer = amnVar.B;
                            Intrinsics.checkNotNullExpressionValue(createRouteLoadingContainer, "createRouteLoadingContainer");
                            if (createRouteLoadingContainer.getVisibility() == 0) {
                                ToastUtil.INSTANCE.showToast(c1j.common_load_fail);
                            }
                            this.this$0.destroyLoading();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07621(CreateRouteLoadingFragment createRouteLoadingFragment, Continuation<? super C07621> continuation) {
                super(2, continuation);
                this.this$0 = createRouteLoadingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07621(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CreateRouteViewModel createRouteViewModel = this.this$0.createRouteViewModel;
                    if (createRouteViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                        createRouteViewModel = null;
                    }
                    MutableStateFlow<Pair<Boolean, ProgressRouteStatus>> progressLoadingFlow = createRouteViewModel.getProgressLoadingFlow();
                    C07631 c07631 = new C07631(this.this$0);
                    this.label = 1;
                    if (progressLoadingFlow.collect(c07631, this) == coroutine_suspended) {
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
                return ((C07621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C30411(Continuation<? super C30411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteLoadingFragment.this.new C30411(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateRouteLoadingFragment createRouteLoadingFragment = CreateRouteLoadingFragment.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C07621 c07621 = new C07621(createRouteLoadingFragment, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(createRouteLoadingFragment, state, c07621, this) == coroutine_suspended) {
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
            return ((C30411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public CreateRouteLoadingFragment() {
        super(dvi.e0);
    }

    private final void buildDialog() {
        this.dialog = new miuix.appcompat.app.c.a(requireContext()).z("是否取消规划？").m("路线规划即将完成，是否中止任务？").v("确定", new DialogInterface.OnClickListener() { // from class: g35
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CreateRouteLoadingFragment.buildDialog$lambda$2(this.f18541a, dialogInterface, i);
            }
        }).p("取消", new DialogInterface.OnClickListener() { // from class: h35
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildDialog$lambda$2(CreateRouteLoadingFragment this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancelJob();
        dialogInterface.dismiss();
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.replaceBottomSheetFragment(new CreateRouteChooseModuleFragment());
        this$0.destroyLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buildLoadingTimer(int sceneType) {
        if (this.loadingTimer != null || sceneType == 0) {
            return;
        }
        CountDownTimer countDownTimer = new CountDownTimer(sceneType == RouteSceneType.RouteSceneTypeAi.getCode() ? ROUTE_LOADING_DURATION : STYLE_LOADING_DURATION, this) { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment.buildLoadingTimer.1
            final /* synthetic */ long $duration;
            final /* synthetic */ CreateRouteLoadingFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(j, 1000L);
                this.$duration = j;
                this.this$0 = this;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
            }

            @Override // android.os.CountDownTimer
            @SuppressLint({"SetTextI18n"})
            public void onTick(long millisUntilFinished) {
                long j = this.$duration;
                long j2 = ((j - millisUntilFinished) * ((long) 100)) / j;
                Logger.d(CreateRouteLoadingFragment.TAG, "onTick duration:" + j + ",millisUntilFinished:" + millisUntilFinished + ",cur:" + j2);
                this.this$0.setStartCount((int) (1 + j2));
                amn amnVar = this.this$0.mBinding;
                if (amnVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    amnVar = null;
                }
                amnVar.D.setText(this.this$0.getString(c1j.m4) + " " + j2 + "%");
            }
        };
        this.loadingTimer = countDownTimer;
        Intrinsics.checkNotNull(countDownTimer);
        countDownTimer.start();
    }

    private final void cancelJob() {
        Integer num = this.strategyId;
        if (num != null) {
            int iIntValue = num.intValue();
            CreateRouteViewModel createRouteViewModel = this.createRouteViewModel;
            if (createRouteViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                createRouteViewModel = null;
            }
            createRouteViewModel.cancelJob(iIntValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void destroyLoading() {
        Logger.i(TAG, "destroyLoading");
        CountDownTimer countDownTimer = this.loadingTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        p9n p9nVar = null;
        this.loadingTimer = null;
        CreateRouteActivity createRouteActivity = this.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        p9n p9nVar2 = this.createRouteActivityBinding;
        if (p9nVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
        } else {
            p9nVar = p9nVar2;
        }
        createRouteActivity.transactionRemoveFragment(p9nVar.J.getId());
    }

    private final void handleBackPressed() {
        CreateRouteActivity createRouteActivity = this.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.setBackPressedFragment(this, new Function0() { // from class: f35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateRouteLoadingFragment.handleBackPressed$lambda$5(this.f17354a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBackPressed$lambda$5(CreateRouteLoadingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showConfirmationDialog();
        return Unit.INSTANCE;
    }

    private final void hideLoading() {
        amn amnVar = this.mBinding;
        if (amnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            amnVar = null;
        }
        FrameLayout createRouteLoadingContainer = amnVar.B;
        Intrinsics.checkNotNullExpressionValue(createRouteLoadingContainer, "createRouteLoadingContainer");
        ViewExtKt.gone(createRouteLoadingContainer);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.core.view.GestureDetectorCompat] */
    private final void initNoneGesture() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new GestureDetectorCompat(requireContext(), new MyGestureListener());
        amn amnVar = this.mBinding;
        if (amnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            amnVar = null;
        }
        amnVar.getRoot().setOnTouchListener(new View.OnTouchListener() { // from class: e35
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return CreateRouteLoadingFragment.initNoneGesture$lambda$0(objectRef, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean initNoneGesture$lambda$0(Ref.ObjectRef gestureDetector, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(gestureDetector, "$gestureDetector");
        ((GestureDetectorCompat) gestureDetector.element).a(motionEvent);
        return true;
    }

    private final void initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        boolean z = false;
        this.mBinding = amn.A0(inflater, container, false);
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (getActivity() instanceof CreateRouteActivity) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.xiaomi.fitness.sport.view.route.CreateRouteActivity");
            CreateRouteActivity createRouteActivity = (CreateRouteActivity) activity;
            this.createRouteActivity = createRouteActivity;
            if (createRouteActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity = null;
            }
            this.createRouteActivityBinding = createRouteActivity.getCreateRouteActivityBinding();
            CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
            if (createRouteActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity2 = null;
            }
            this.createRouteViewModel = createRouteActivity2.getCreateRouteViewModel();
            p9n p9nVar = this.createRouteActivityBinding;
            if (p9nVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                p9nVar = null;
            }
            p9nVar.J.setVisibility(0);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ImageLoader.Builder builder = new ImageLoader.Builder(contextRequireContext);
        ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
        int i = 1;
        if (Build.VERSION.SDK_INT >= 28) {
            builder2.add(new ImageDecoderDecoder.Factory(z, i, defaultConstructorMarker));
        } else {
            builder2.add(new GifDecoder.Factory(z, i, defaultConstructorMarker));
        }
        Unit unit = Unit.INSTANCE;
        this.imageLoader = builder.components(builder2.build()).build();
        buildDialog();
    }

    private final void showConfirmationDialog() {
        miuix.appcompat.app.c cVar = this.dialog;
        if (cVar != null) {
            cVar.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading() {
        amn amnVar = this.mBinding;
        amn amnVar2 = null;
        if (amnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            amnVar = null;
        }
        FrameLayout createRouteLoadingContainer = amnVar.B;
        Intrinsics.checkNotNullExpressionValue(createRouteLoadingContainer, "createRouteLoadingContainer");
        if (createRouteLoadingContainer.getVisibility() == 0) {
            return;
        }
        amn amnVar3 = this.mBinding;
        if (amnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            amnVar3 = null;
        }
        FrameLayout createRouteLoadingContainer2 = amnVar3.B;
        Intrinsics.checkNotNullExpressionValue(createRouteLoadingContainer2, "createRouteLoadingContainer");
        ViewExtKt.visible(createRouteLoadingContainer2);
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            amn amnVar4 = this.mBinding;
            if (amnVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                amnVar2 = amnVar4;
            }
            ImageView routeCreating = amnVar2.C;
            Intrinsics.checkNotNullExpressionValue(routeCreating, "routeCreating");
            imageLoader.enqueue(new ImageRequest.Builder(routeCreating.getContext()).data(Integer.valueOf(eoi.f16882a)).target(routeCreating).build());
        }
    }

    private final void startProgress() {
        CreateRouteViewModel createRouteViewModel = this.createRouteViewModel;
        CreateRouteViewModel createRouteViewModel2 = null;
        if (createRouteViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel = null;
        }
        createRouteViewModel.getProgressLoadingFlow().setValue(null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C30411(null), 3, null);
        CreateRouteViewModel createRouteViewModel3 = this.createRouteViewModel;
        if (createRouteViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
        } else {
            createRouteViewModel2 = createRouteViewModel3;
        }
        createRouteViewModel2.getProcessRouteStatus();
    }

    @Nullable
    public final ValueAnimator getLoadingFinishAnimator() {
        return this.loadingFinishAnimator;
    }

    @Nullable
    public final CountDownTimer getLoadingTimer() {
        return this.loadingTimer;
    }

    public final int getStartCount() {
        return this.startCount;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        initView(inflater, container, savedInstanceState);
        initNoneGesture();
        handleBackPressed();
        startProgress();
        amn amnVar = this.mBinding;
        if (amnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            amnVar = null;
        }
        View root = amnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        miuix.appcompat.app.c cVar = this.dialog;
        if (cVar != null) {
            cVar.dismiss();
        }
        p9n p9nVar = this.createRouteActivityBinding;
        if (p9nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
            p9nVar = null;
        }
        FrameLayout loadingFrameLayout = p9nVar.J;
        Intrinsics.checkNotNullExpressionValue(loadingFrameLayout, "loadingFrameLayout");
        ViewExtKt.gone(loadingFrameLayout);
        CreateRouteViewModel createRouteViewModel = this.createRouteViewModel;
        if (createRouteViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel = null;
        }
        createRouteViewModel.stopLoading();
        CountDownTimer countDownTimer = this.loadingTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.loadingTimer = null;
        super.onDestroyView();
    }

    public final void requestRoutesAndJump(int strategyId, @NotNull RouteSceneType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (type == RouteSceneType.Unknown) {
            return;
        }
        if (type == RouteSceneType.RouteSceneTypeStyle) {
            CreateRouteViewModel createRouteViewModel = this.createRouteViewModel;
            if (createRouteViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                createRouteViewModel = null;
            }
            createRouteViewModel.getRouteSpaceList(strategyId);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C30401(strategyId, type, null), 3, null);
    }

    public final void setLoadingFinishAnimator(@Nullable ValueAnimator valueAnimator) {
        this.loadingFinishAnimator = valueAnimator;
    }

    public final void setLoadingTimer(@Nullable CountDownTimer countDownTimer) {
        this.loadingTimer = countDownTimer;
    }

    public final void setStartCount(int i) {
        this.startCount = i;
    }
}
