package com.xiaomi.fitness.sport.view.route;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.route.detail.model.RouteSceneType;
import com.xiaomi.fitness.sport.utils.ExtensionsKt;
import com.xiaomi.fitness.sport.view.route.CreateRouteEmptyRouteFragment;
import com.xiaomi.fitness.sport.view.tab.adapter.RunningRouteView;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import defpackage.aki;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.jrk;
import defpackage.kmn;
import defpackage.mpi;
import defpackage.p9n;
import defpackage.vwq;
import defpackage.xri;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b/\u00100J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\fJ+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteEmptyRouteFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V", "initAiEmptyRouteView", "()V", "initUserStyleRouteView", "initEmptyRouteView", "fragment", "handleBackPressed", "(Landroidx/fragment/app/Fragment;)V", "getData", "initBehavior", "initButtonState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/xiaomi/fitness/sport/route/detail/model/RouteSceneType;", "routeSceneType", "Lcom/xiaomi/fitness/sport/route/detail/model/RouteSceneType;", "getRouteSceneType", "()Lcom/xiaomi/fitness/sport/route/detail/model/RouteSceneType;", "Lkmn;", "mBinding", "Lkmn;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "createRouteActivity", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "Lp9n;", "createRouteActivityBinding", "Lp9n;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "midContentView", "Landroid/view/View;", "contentLayout", "Lcom/xiaomi/fitness/sport/view/tab/adapter/RunningRouteView;", "routeView", "Lcom/xiaomi/fitness/sport/view/tab/adapter/RunningRouteView;", "<init>", "(Lcom/xiaomi/fitness/sport/route/detail/model/RouteSceneType;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CreateRouteEmptyRouteFragment extends Fragment {
    private View contentLayout;
    private CreateRouteActivity createRouteActivity;
    private p9n createRouteActivityBinding;
    private CreateRouteViewModel createRouteViewModel;
    private kmn mBinding;
    private View midContentView;

    @NotNull
    private final RouteSceneType routeSceneType;
    private RunningRouteView routeView;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteEmptyRouteFragment$initEmptyRouteView$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteEmptyRouteFragment$initEmptyRouteView$1", f = "CreateRouteEmptyRouteFragment.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteEmptyRouteFragment$initEmptyRouteView$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteEmptyRouteFragment$initEmptyRouteView$1$1", f = "CreateRouteEmptyRouteFragment.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CreateRouteEmptyRouteFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07591(CreateRouteEmptyRouteFragment createRouteEmptyRouteFragment, Continuation<? super C07591> continuation) {
                super(2, continuation);
                this.this$0 = createRouteEmptyRouteFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07591(this.this$0, continuation);
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
                    StateFlow<RunningRouteListBean> routeListFlow = createRouteViewModel.getRouteListFlow();
                    final CreateRouteEmptyRouteFragment createRouteEmptyRouteFragment = this.this$0;
                    FlowCollector<? super RunningRouteListBean> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteEmptyRouteFragment.initEmptyRouteView.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((RunningRouteListBean) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(RunningRouteListBean runningRouteListBean, Continuation<? super Unit> continuation) {
                            TextView textView;
                            TextView textView2;
                            ConstraintLayout constraintLayout;
                            if (runningRouteListBean == null) {
                                return Unit.INSTANCE;
                            }
                            List<RouteInfo> route_Info_list = runningRouteListBean.getRoute_Info_list();
                            List<RouteInfo> list = route_Info_list;
                            RunningRouteView runningRouteView = null;
                            if (!(list == null || list.isEmpty())) {
                                RunningRouteView runningRouteView2 = createRouteEmptyRouteFragment.routeView;
                                if (runningRouteView2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("routeView");
                                    runningRouteView2 = null;
                                }
                                vwq binding = runningRouteView2.getBinding();
                                if (binding != null && (constraintLayout = binding.C) != null) {
                                    constraintLayout.setPaddingRelative(0, ExtUtilsKt.getDp(Boxing.boxInt(15)), 0, ExtUtilsKt.getDp(Boxing.boxInt(11)));
                                }
                                RunningRouteView runningRouteView3 = createRouteEmptyRouteFragment.routeView;
                                if (runningRouteView3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("routeView");
                                    runningRouteView3 = null;
                                }
                                vwq binding2 = runningRouteView3.getBinding();
                                if (binding2 != null && (textView2 = binding2.A) != null) {
                                    textView2.setVisibility(8);
                                }
                                RunningRouteView runningRouteView4 = createRouteEmptyRouteFragment.routeView;
                                if (runningRouteView4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("routeView");
                                    runningRouteView4 = null;
                                }
                                vwq binding3 = runningRouteView4.getBinding();
                                if (binding3 != null && (textView = binding3.D) != null) {
                                    FragmentActivity activity = createRouteEmptyRouteFragment.getActivity();
                                    textView.setText(activity != null ? activity.getString(c1j.O3) : null);
                                    textView.setTextSize(ExtensionsKt.getPx(16));
                                    textView.setTypeface(jrk.h(textView.getContext(), mpi.f27069a));
                                    textView.setTextColor(ViewExtKt.getColor(textView, aki.A));
                                    textView.setPaddingRelative(0, 0, 0, 0);
                                }
                                RunningRouteView runningRouteView5 = createRouteEmptyRouteFragment.routeView;
                                if (runningRouteView5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("routeView");
                                    runningRouteView5 = null;
                                }
                                ViewExtKt.setVisible(runningRouteView5, true);
                                RunningRouteView runningRouteView6 = createRouteEmptyRouteFragment.routeView;
                                if (runningRouteView6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("routeView");
                                } else {
                                    runningRouteView = runningRouteView6;
                                }
                                Intrinsics.checkNotNull(route_Info_list);
                                runningRouteView.setDataToView(new RunningRouteListBean(route_Info_list));
                            } else {
                                RunningRouteView runningRouteView7 = createRouteEmptyRouteFragment.routeView;
                                if (runningRouteView7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("routeView");
                                } else {
                                    runningRouteView = runningRouteView7;
                                }
                                ViewExtKt.setVisible(runningRouteView, false);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (routeListFlow.collect(flowCollector, this) == coroutine_suspended) {
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
                return ((C07591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteEmptyRouteFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Lifecycle lifecycle = CreateRouteEmptyRouteFragment.this.getViewLifecycleOwner().getLifecycle();
                Lifecycle.State state = Lifecycle.State.STARTED;
                C07591 c07591 = new C07591(CreateRouteEmptyRouteFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c07591, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public CreateRouteEmptyRouteFragment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void getData() {
        int i;
        RouteSceneType routeSceneType = this.routeSceneType;
        if (routeSceneType == RouteSceneType.RouteSceneTypeAi) {
            i = 2;
        } else {
            i = routeSceneType == RouteSceneType.RouteSceneTypeStyle ? 3 : 0;
        }
        int i2 = i;
        CreateRouteViewModel createRouteViewModel = this.createRouteViewModel;
        CreateRouteViewModel createRouteViewModel2 = null;
        if (createRouteViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel = null;
        }
        CreateRouteViewModel createRouteViewModel3 = this.createRouteViewModel;
        if (createRouteViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel3 = null;
        }
        double longitude = createRouteViewModel3.getUserRouteStyleListRequestParams().getLongitude();
        CreateRouteViewModel createRouteViewModel4 = this.createRouteViewModel;
        if (createRouteViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
        } else {
            createRouteViewModel2 = createRouteViewModel4;
        }
        createRouteViewModel.getRecommendedRouteList(longitude, createRouteViewModel2.getUserRouteStyleListRequestParams().getLatitude(), i2);
    }

    private final void handleBackPressed(final Fragment fragment) {
        CreateRouteActivity createRouteActivity = this.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.setBackPressedFragment(this, new Function0() { // from class: c35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateRouteEmptyRouteFragment.handleBackPressed$lambda$0(this.f4884a, fragment);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBackPressed$lambda$0(CreateRouteEmptyRouteFragment this$0, Fragment fragment) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fragment, "$fragment");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.replaceBottomSheetFragment(fragment);
        return Unit.INSTANCE;
    }

    private final void initAiEmptyRouteView() {
        kmn kmnVar = this.mBinding;
        kmn kmnVar2 = null;
        if (kmnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            kmnVar = null;
        }
        kmnVar.E.setVisibility(0);
        kmn kmnVar3 = this.mBinding;
        if (kmnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            kmnVar2 = kmnVar3;
        }
        kmnVar2.H.setVisibility(8);
    }

    private final void initBehavior() {
        CreateRouteActivity createRouteActivity;
        CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
        kmn kmnVar = null;
        if (createRouteActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        } else {
            createRouteActivity = createRouteActivity2;
        }
        kmn kmnVar2 = this.mBinding;
        if (kmnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            kmnVar = kmnVar2;
        }
        View root = kmnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        CreateRouteActivity.setDefaultBehavior$default(createRouteActivity, root, ExtUtilsKt.getDp(122), false, false, 8, null);
    }

    private final void initButtonState() {
        kmn kmnVar = this.mBinding;
        if (kmnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            kmnVar = null;
        }
        kmnVar.B.setOnClickListener(new View.OnClickListener() { // from class: d35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteEmptyRouteFragment.initButtonState$lambda$1(this.f15029a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonState$lambda$1(CreateRouteEmptyRouteFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = null;
        if (this$0.routeSceneType == RouteSceneType.RouteSceneTypeAi) {
            CreateRouteActivity createRouteActivity2 = this$0.createRouteActivity;
            if (createRouteActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            } else {
                createRouteActivity = createRouteActivity2;
            }
            createRouteActivity.replaceBottomSheetFragment(new CreateRouteSelectTargetFragment());
            return;
        }
        CreateRouteActivity createRouteActivity3 = this$0.createRouteActivity;
        if (createRouteActivity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
        } else {
            createRouteActivity = createRouteActivity3;
        }
        createRouteActivity.replaceBottomSheetFragment(new CreateRouteSelectStyleFragment());
    }

    private final void initEmptyRouteView() {
        CreateRouteViewModel createRouteViewModel = this.createRouteViewModel;
        if (createRouteViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel = null;
        }
        createRouteViewModel.clearRouteListFlow();
        getData();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    private final void initUserStyleRouteView() {
        kmn kmnVar = this.mBinding;
        kmn kmnVar2 = null;
        if (kmnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            kmnVar = null;
        }
        kmnVar.E.setVisibility(8);
        kmn kmnVar3 = this.mBinding;
        if (kmnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            kmnVar2 = kmnVar3;
        }
        kmnVar2.H.setVisibility(0);
    }

    private final void initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kmn kmnVarA0 = kmn.A0(inflater, container, false);
        this.mBinding = kmnVarA0;
        CreateRouteActivity createRouteActivity = null;
        if (kmnVarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            kmnVarA0 = null;
        }
        this.midContentView = kmnVarA0.D;
        kmn kmnVar = this.mBinding;
        if (kmnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            kmnVar = null;
        }
        this.contentLayout = kmnVar.C;
        kmn kmnVar2 = this.mBinding;
        if (kmnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            kmnVar2 = null;
        }
        RunningRouteView runningRouteView = kmnVar2.I;
        this.routeView = runningRouteView;
        if (runningRouteView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("routeView");
            runningRouteView = null;
        }
        ((RecyclerView) runningRouteView.findViewById(xri.W4)).setPaddingRelative(ExtUtilsKt.getDp(0), ExtUtilsKt.getDp(1), ExtUtilsKt.getDp(29), ExtUtilsKt.getDp(13));
        if (getActivity() instanceof CreateRouteActivity) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.xiaomi.fitness.sport.view.route.CreateRouteActivity");
            CreateRouteActivity createRouteActivity2 = (CreateRouteActivity) activity;
            this.createRouteActivity = createRouteActivity2;
            if (createRouteActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity2 = null;
            }
            this.createRouteActivityBinding = createRouteActivity2.getCreateRouteActivityBinding();
            CreateRouteActivity createRouteActivity3 = this.createRouteActivity;
            if (createRouteActivity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity3 = null;
            }
            this.createRouteViewModel = createRouteActivity3.getCreateRouteViewModel();
            p9n p9nVar = this.createRouteActivityBinding;
            if (p9nVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                p9nVar = null;
            }
            p9nVar.K.setVisibility(8);
        }
        RouteSceneType routeSceneType = this.routeSceneType;
        if (routeSceneType == RouteSceneType.RouteSceneTypeAi) {
            initAiEmptyRouteView();
            handleBackPressed(new CreateRouteSelectTargetFragment());
        } else if (routeSceneType == RouteSceneType.RouteSceneTypeStyle) {
            CreateRouteActivity createRouteActivity4 = this.createRouteActivity;
            if (createRouteActivity4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity4 = null;
            }
            createRouteActivity4.setStyleFragmentIndex(0);
            p9n p9nVar2 = this.createRouteActivityBinding;
            if (p9nVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
                p9nVar2 = null;
            }
            FilterSortView filterSortView = p9nVar2.G;
            CreateRouteActivity createRouteActivity5 = this.createRouteActivity;
            if (createRouteActivity5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity5 = null;
            }
            filterSortView.setFilteredTab(createRouteActivity5.getTabViewMap().get(0));
            initUserStyleRouteView();
            CreateRouteActivity createRouteActivity6 = this.createRouteActivity;
            if (createRouteActivity6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
                createRouteActivity6 = null;
            }
            LinearLayout titleLayout = createRouteActivity6.getCreateRouteActivityBinding().T;
            Intrinsics.checkNotNullExpressionValue(titleLayout, "titleLayout");
            ViewExtKt.setVisible(titleLayout, true);
            CreateRouteActivity createRouteActivity7 = this.createRouteActivity;
            if (createRouteActivity7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            } else {
                createRouteActivity = createRouteActivity7;
            }
            View root = createRouteActivity.getCreateRouteActivityBinding().R.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.setVisible(root, false);
            handleBackPressed(new CreateRouteSelectStyleFragment());
        }
        initEmptyRouteView();
    }

    @NotNull
    public final RouteSceneType getRouteSceneType() {
        return this.routeSceneType;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        initView(inflater, container, savedInstanceState);
        initButtonState();
        initBehavior();
        kmn kmnVar = this.mBinding;
        if (kmnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            kmnVar = null;
        }
        View root = kmnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public /* synthetic */ CreateRouteEmptyRouteFragment(RouteSceneType routeSceneType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RouteSceneType.RouteSceneTypeAi : routeSceneType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRouteEmptyRouteFragment(@NotNull RouteSceneType routeSceneType) {
        super(dvi.j0);
        Intrinsics.checkNotNullParameter(routeSceneType, "routeSceneType");
        this.routeSceneType = routeSceneType;
    }
}
