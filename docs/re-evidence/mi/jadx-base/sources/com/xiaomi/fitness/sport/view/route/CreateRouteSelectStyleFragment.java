package com.xiaomi.fitness.sport.view.route;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelKt;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import coil.size.Size;
import coil.transform.RoundedCornersTransformation;
import coil.transform.Transformation;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.route.detail.model.CreateRouteCustomStyle;
import com.xiaomi.fitness.sport.route.detail.model.StyleDetail;
import com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.cmn;
import defpackage.dvi;
import defpackage.p9n;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 (2\u00020\u0001:\u0002()B\u0007¢\u0006\u0004\b'\u0010\u000eJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteSelectStyleFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V", "loadRes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleBackPressed", "()V", "initStyleChoices", "initBehavior", "initButtonState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcmn;", "mBinding", "Lcmn;", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "createRouteActivity", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "Lp9n;", "createRouteActivityBinding", "Lp9n;", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "createRouteViewModel", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel;", "midContentView", "Landroid/view/View;", "contentLayout", "", "stopShowLoading", "I", "<init>", "Companion", "PaddingTransformation", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCreateRouteSelectStyleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteSelectStyleFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteSelectStyleFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,267:1\n1#2:268\n*E\n"})
public final class CreateRouteSelectStyleFragment extends Fragment {

    @NotNull
    public static final String TAG = "CreateRouteSelectStyleFragment";
    private View contentLayout;
    private CreateRouteActivity createRouteActivity;
    private p9n createRouteActivityBinding;
    private CreateRouteViewModel createRouteViewModel;
    private cmn mBinding;
    private View midContentView;
    private volatile int stopShowLoading;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$initStyleChoices$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$initStyleChoices$1", f = "CreateRouteSelectStyleFragment.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$initStyleChoices$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$initStyleChoices$1$1", f = "CreateRouteSelectStyleFragment.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CreateRouteSelectStyleFragment this$0;

            /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$initStyleChoices$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001d\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007H\n"}, d2 = {"<anonymous>", "", "routeStyleList", "", "Lcom/xiaomi/fitness/sport/route/detail/model/CreateRouteCustomStyle;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$initStyleChoices$1$1$1", f = "CreateRouteSelectStyleFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nCreateRouteSelectStyleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteSelectStyleFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteSelectStyleFragment$initStyleChoices$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,267:1\n1#2:268\n54#3,3:269\n24#3:272\n59#3,4:273\n63#3,2:288\n54#3,3:290\n24#3:293\n59#3,4:294\n63#3,2:309\n489#4,11:277\n489#4,11:298\n*S KotlinDebug\n*F\n+ 1 CreateRouteSelectStyleFragment.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteSelectStyleFragment$initStyleChoices$1$1$1\n*L\n156#1:269,3\n156#1:272\n156#1:273,4\n156#1:288,2\n172#1:290,3\n172#1:293\n172#1:294,4\n172#1:309,2\n157#1:277,11\n173#1:298,11\n*E\n"})
            public static final class C07651 extends SuspendLambda implements Function2<List<? extends CreateRouteCustomStyle>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CreateRouteSelectStyleFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07651(CreateRouteSelectStyleFragment createRouteSelectStyleFragment, Continuation<? super C07651> continuation) {
                    super(2, continuation);
                    this.this$0 = createRouteSelectStyleFragment;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invokeSuspend$lambda$6(CreateRouteSelectStyleFragment createRouteSelectStyleFragment, View view) {
                    cmn cmnVar = createRouteSelectStyleFragment.mBinding;
                    CreateRouteViewModel createRouteViewModel = null;
                    if (cmnVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        cmnVar = null;
                    }
                    cmnVar.D.setSelected(true);
                    cmn cmnVar2 = createRouteSelectStyleFragment.mBinding;
                    if (cmnVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        cmnVar2 = null;
                    }
                    cmnVar2.N.setSelected(false);
                    CreateRouteViewModel createRouteViewModel2 = createRouteSelectStyleFragment.createRouteViewModel;
                    if (createRouteViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    } else {
                        createRouteViewModel = createRouteViewModel2;
                    }
                    createRouteViewModel.setModuleSelected(new CreateRouteViewModel.ModuleStatus.Char(""));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invokeSuspend$lambda$7(CreateRouteSelectStyleFragment createRouteSelectStyleFragment, View view) {
                    cmn cmnVar = createRouteSelectStyleFragment.mBinding;
                    CreateRouteViewModel createRouteViewModel = null;
                    if (cmnVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        cmnVar = null;
                    }
                    cmnVar.D.setSelected(false);
                    cmn cmnVar2 = createRouteSelectStyleFragment.mBinding;
                    if (cmnVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        cmnVar2 = null;
                    }
                    cmnVar2.N.setSelected(true);
                    CreateRouteViewModel createRouteViewModel2 = createRouteSelectStyleFragment.createRouteViewModel;
                    if (createRouteViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    } else {
                        createRouteViewModel = createRouteViewModel2;
                    }
                    createRouteViewModel.setModuleSelected(new CreateRouteViewModel.ModuleStatus.Pattern(0));
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C07651 c07651 = new C07651(this.this$0, continuation);
                    c07651.L$0 = obj;
                    return c07651;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends CreateRouteCustomStyle> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<CreateRouteCustomStyle>) list, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    cmn cmnVar;
                    Object next;
                    Object next2;
                    StyleDetail senStyle;
                    StyleDetail senStyle2;
                    StyleDetail senStyle3;
                    StyleDetail senStyle4;
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    List list = (List) this.L$0;
                    List list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    List list3 = list;
                    Iterator it = list3.iterator();
                    do {
                        cmnVar = null;
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        senStyle4 = ((CreateRouteCustomStyle) next).getSenStyle();
                    } while (!Intrinsics.areEqual(senStyle4 != null ? senStyle4.getDesc() : null, "num"));
                    CreateRouteCustomStyle createRouteCustomStyle = (CreateRouteCustomStyle) next;
                    String icon = (createRouteCustomStyle == null || (senStyle3 = createRouteCustomStyle.getSenStyle()) == null) ? null : senStyle3.getIcon();
                    cmn cmnVar2 = this.this$0.mBinding;
                    if (cmnVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        cmnVar2 = null;
                    }
                    ImageView charStyleIcon = cmnVar2.E;
                    Intrinsics.checkNotNullExpressionValue(charStyleIcon, "charStyleIcon");
                    final CreateRouteSelectStyleFragment createRouteSelectStyleFragment = this.this$0;
                    ImageLoader imageLoader = Coil.imageLoader(charStyleIcon.getContext());
                    final ImageRequest.Builder builderTarget = new ImageRequest.Builder(charStyleIcon.getContext()).data(icon).target(charStyleIcon);
                    builderTarget.listener(new ImageRequest.Listener() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$initStyleChoices$1$1$1$invokeSuspend$lambda$2$$inlined$listener$default$1
                        @Override // coil.request.ImageRequest.Listener
                        public void onCancel(@NotNull ImageRequest request) {
                        }

                        @Override // coil.request.ImageRequest.Listener
                        public void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
                        }

                        @Override // coil.request.ImageRequest.Listener
                        public void onStart(@NotNull ImageRequest request) {
                        }

                        @Override // coil.request.ImageRequest.Listener
                        public void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
                            builderTarget.transformations(new RoundedCornersTransformation(16.0f));
                            createRouteSelectStyleFragment.stopShowLoading++;
                        }
                    });
                    imageLoader.enqueue(builderTarget.build());
                    Iterator it2 = list3.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        senStyle2 = ((CreateRouteCustomStyle) next2).getSenStyle();
                    } while (!Intrinsics.areEqual(senStyle2 != null ? senStyle2.getDesc() : null, "pattern"));
                    CreateRouteCustomStyle createRouteCustomStyle2 = (CreateRouteCustomStyle) next2;
                    String icon2 = (createRouteCustomStyle2 == null || (senStyle = createRouteCustomStyle2.getSenStyle()) == null) ? null : senStyle.getIcon();
                    cmn cmnVar3 = this.this$0.mBinding;
                    if (cmnVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        cmnVar3 = null;
                    }
                    ImageView patternStyleIcon = cmnVar3.O;
                    Intrinsics.checkNotNullExpressionValue(patternStyleIcon, "patternStyleIcon");
                    final CreateRouteSelectStyleFragment createRouteSelectStyleFragment2 = this.this$0;
                    ImageLoader imageLoader2 = Coil.imageLoader(patternStyleIcon.getContext());
                    final ImageRequest.Builder builderTarget2 = new ImageRequest.Builder(patternStyleIcon.getContext()).data(icon2).target(patternStyleIcon);
                    builderTarget2.listener(new ImageRequest.Listener() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$initStyleChoices$1$1$1$invokeSuspend$lambda$5$$inlined$listener$default$1
                        @Override // coil.request.ImageRequest.Listener
                        public void onCancel(@NotNull ImageRequest request) {
                        }

                        @Override // coil.request.ImageRequest.Listener
                        public void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
                        }

                        @Override // coil.request.ImageRequest.Listener
                        public void onStart(@NotNull ImageRequest request) {
                        }

                        @Override // coil.request.ImageRequest.Listener
                        public void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
                            builderTarget2.transformations(new RoundedCornersTransformation(16.0f));
                            createRouteSelectStyleFragment2.stopShowLoading++;
                        }
                    });
                    imageLoader2.enqueue(builderTarget2.build());
                    CreateRouteViewModel createRouteViewModel = this.this$0.createRouteViewModel;
                    if (createRouteViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                        createRouteViewModel = null;
                    }
                    if (createRouteViewModel.getModuleSelected() instanceof CreateRouteViewModel.ModuleStatus.Char) {
                        cmn cmnVar4 = this.this$0.mBinding;
                        if (cmnVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            cmnVar4 = null;
                        }
                        cmnVar4.D.setSelected(true);
                        cmn cmnVar5 = this.this$0.mBinding;
                        if (cmnVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            cmnVar5 = null;
                        }
                        cmnVar5.N.setSelected(false);
                    } else {
                        cmn cmnVar6 = this.this$0.mBinding;
                        if (cmnVar6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            cmnVar6 = null;
                        }
                        cmnVar6.D.setSelected(false);
                        cmn cmnVar7 = this.this$0.mBinding;
                        if (cmnVar7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            cmnVar7 = null;
                        }
                        cmnVar7.N.setSelected(true);
                    }
                    cmn cmnVar8 = this.this$0.mBinding;
                    if (cmnVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        cmnVar8 = null;
                    }
                    ConstraintLayout constraintLayout = cmnVar8.F;
                    final CreateRouteSelectStyleFragment createRouteSelectStyleFragment3 = this.this$0;
                    constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.sport.view.route.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CreateRouteSelectStyleFragment.AnonymousClass1.C07641.C07651.invokeSuspend$lambda$6(createRouteSelectStyleFragment3, view);
                        }
                    });
                    cmn cmnVar9 = this.this$0.mBinding;
                    if (cmnVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        cmnVar = cmnVar9;
                    }
                    ConstraintLayout constraintLayout2 = cmnVar.P;
                    final CreateRouteSelectStyleFragment createRouteSelectStyleFragment4 = this.this$0;
                    constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.sport.view.route.k
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CreateRouteSelectStyleFragment.AnonymousClass1.C07641.C07651.invokeSuspend$lambda$7(createRouteSelectStyleFragment4, view);
                        }
                    });
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<CreateRouteCustomStyle> list, Continuation<? super Unit> continuation) {
                    return ((C07651) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07641(CreateRouteSelectStyleFragment createRouteSelectStyleFragment, Continuation<? super C07641> continuation) {
                super(2, continuation);
                this.this$0 = createRouteSelectStyleFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07641(this.this$0, continuation);
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
                    SharedFlow<List<CreateRouteCustomStyle>> routeStyleListFlow = createRouteViewModel.getRouteStyleListFlow();
                    C07651 c07651 = new C07651(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(routeStyleListFlow, c07651, this) == coroutine_suspended) {
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
                return ((C07641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteSelectStyleFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateRouteSelectStyleFragment createRouteSelectStyleFragment = CreateRouteSelectStyleFragment.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C07641 c07641 = new C07641(createRouteSelectStyleFragment, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(createRouteSelectStyleFragment, state, c07641, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$loadRes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment", f = "CreateRouteSelectStyleFragment.kt", i = {0}, l = {122}, m = "loadRes", n = {"this"}, s = {"L$0"})
    public static final class C30421 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C30421(Continuation<? super C30421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreateRouteSelectStyleFragment.this.loadRes(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$loadRes$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$loadRes$3", f = "CreateRouteSelectStyleFragment.kt", i = {0}, l = {107, 115}, m = "invokeSuspend", n = {"timeRecord"}, s = {"I$0"})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteSelectStyleFragment.this.new AnonymousClass3(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x002c  */
        /* JADX WARN: Code duplicated, block: B:16:0x003a A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0038 -> B:10:0x0022). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 0
                java.lang.String r3 = "createRouteActivity"
                r4 = 1
                r5 = 2
                if (r1 == 0) goto L24
                if (r1 == r4) goto L1d
                if (r1 != r5) goto L15
                kotlin.ResultKt.throwOnFailure(r13)
                goto L65
            L15:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                int r1 = r12.I$0
                kotlin.ResultKt.throwOnFailure(r13)
            L22:
                r13 = r1
                goto L28
            L24:
                kotlin.ResultKt.throwOnFailure(r13)
                r13 = 0
            L28:
                r1 = 601(0x259, float:8.42E-43)
                if (r13 >= r1) goto L3b
                int r1 = r13 + 200
                r12.I$0 = r1
                r12.label = r4
                r6 = 200(0xc8, double:9.9E-322)
                java.lang.Object r13 = kotlinx.coroutines.DelayKt.delay(r6, r12)
                if (r13 != r0) goto L22
                return r0
            L3b:
                com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment r13 = com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment.this
                int r13 = com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment.access$getStopShowLoading$p(r13)
                if (r13 >= r5) goto L65
                com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment r13 = com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment.this
                com.xiaomi.fitness.sport.view.route.CreateRouteActivity r13 = com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment.access$getCreateRouteActivity$p(r13)
                if (r13 != 0) goto L50
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
                r6 = r2
                goto L51
            L50:
                r6 = r13
            L51:
                com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment r13 = com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment.this
                int r1 = defpackage.c1j.f4831k
                java.lang.String r7 = r13.getString(r1)
                java.lang.String r13 = "getString(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r13)
                r10 = 6
                r11 = 0
                r8 = 0
                r9 = 0
                com.xiaomi.fitness.baseui.view.PageState.DefaultImpls.showLoading$default(r6, r7, r8, r9, r10, r11)
            L65:
                com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment r13 = com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment.this
                int r13 = com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment.access$getStopShowLoading$p(r13)
                if (r13 >= r5) goto L78
                r12.label = r5
                r6 = 100
                java.lang.Object r13 = kotlinx.coroutines.DelayKt.delay(r6, r12)
                if (r13 != r0) goto L65
                return r0
            L78:
                com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment r13 = com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment.this
                com.xiaomi.fitness.sport.view.route.CreateRouteActivity r13 = com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment.access$getCreateRouteActivity$p(r13)
                if (r13 != 0) goto L84
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
                goto L85
            L84:
                r2 = r13
            L85:
                r2.hideLoading()
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$loadRes$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$StatusCodes;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$loadRes$4", f = "CreateRouteSelectStyleFragment.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CreateRouteViewModel.StatusCodes>, Object> {
        int label;

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteSelectStyleFragment.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateRouteViewModel createRouteViewModel = CreateRouteSelectStyleFragment.this.createRouteViewModel;
                if (createRouteViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    createRouteViewModel = null;
                }
                this.label = 1;
                obj = createRouteViewModel.requestRouteStyleList(this);
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CreateRouteViewModel.StatusCodes> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$onCreateView$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteSelectStyleFragment$onCreateView$1", f = "CreateRouteSelectStyleFragment.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C30431(Continuation<? super C30431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRouteSelectStyleFragment.this.new C30431(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateRouteSelectStyleFragment createRouteSelectStyleFragment = CreateRouteSelectStyleFragment.this;
                this.label = 1;
                if (createRouteSelectStyleFragment.loadRes(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CreateRouteSelectStyleFragment.this.initStyleChoices();
            CreateRouteSelectStyleFragment.this.initBehavior();
            CreateRouteSelectStyleFragment.this.initButtonState();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public CreateRouteSelectStyleFragment() {
        super(dvi.f0);
    }

    private final void handleBackPressed() {
        CreateRouteActivity createRouteActivity = this.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.setBackPressedFragment(this, new Function0() { // from class: r35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateRouteSelectStyleFragment.handleBackPressed$lambda$2(this.f32131a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleBackPressed$lambda$2(CreateRouteSelectStyleFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.replaceBottomSheetFragment(new CreateRouteChooseModuleFragment());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initBehavior() {
        CreateRouteActivity createRouteActivity;
        CreateRouteActivity createRouteActivity2 = this.createRouteActivity;
        cmn cmnVar = null;
        if (createRouteActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        } else {
            createRouteActivity = createRouteActivity2;
        }
        cmn cmnVar2 = this.mBinding;
        if (cmnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            cmnVar = cmnVar2;
        }
        View root = cmnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        CreateRouteActivity.setDefaultBehavior$default(createRouteActivity, root, 0, false, false, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initButtonState() {
        cmn cmnVar = this.mBinding;
        cmn cmnVar2 = null;
        if (cmnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cmnVar = null;
        }
        cmnVar.C.setOnClickListener(new View.OnClickListener() { // from class: s35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteSelectStyleFragment.initButtonState$lambda$3(this.f33228a, view);
            }
        });
        cmn cmnVar3 = this.mBinding;
        if (cmnVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            cmnVar2 = cmnVar3;
        }
        cmnVar2.B.setOnClickListener(new View.OnClickListener() { // from class: t35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRouteSelectStyleFragment.initButtonState$lambda$4(this.f34256a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonState$lambda$3(CreateRouteSelectStyleFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteActivity createRouteActivity = this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.replaceBottomSheetFragment(new CreateRouteChooseModuleFragment());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonState$lambda$4(CreateRouteSelectStyleFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CreateRouteViewModel createRouteViewModel = this$0.createRouteViewModel;
        CreateRouteActivity createRouteActivity = null;
        if (createRouteViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel = null;
        }
        if (createRouteViewModel.getModuleSelected() instanceof CreateRouteViewModel.ModuleStatus.Char) {
            CreateRouteActivity createRouteActivity2 = this$0.createRouteActivity;
            if (createRouteActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            } else {
                createRouteActivity = createRouteActivity2;
            }
            createRouteActivity.replaceBottomSheetFragment(new CreateRouteSelectStyleCharFragment());
            return;
        }
        CreateRouteViewModel createRouteViewModel2 = this$0.createRouteViewModel;
        if (createRouteViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
            createRouteViewModel2 = null;
        }
        if (createRouteViewModel2.getModuleSelected() instanceof CreateRouteViewModel.ModuleStatus.Pattern) {
            CreateRouteActivity createRouteActivity3 = this$0.createRouteActivity;
            if (createRouteActivity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            } else {
                createRouteActivity = createRouteActivity3;
            }
            createRouteActivity.replaceBottomSheetFragment(new CreateRouteSelectStylePatternFragment());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initStyleChoices() {
        CreateRouteActivity createRouteActivity = this.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(createRouteActivity), null, null, new AnonymousClass1(null), 3, null);
    }

    private final void initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        cmn cmnVarA0 = cmn.A0(inflater, container, false);
        this.mBinding = cmnVarA0;
        p9n p9nVar = null;
        if (cmnVarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cmnVarA0 = null;
        }
        this.midContentView = cmnVarA0.L;
        cmn cmnVar = this.mBinding;
        if (cmnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cmnVar = null;
        }
        this.contentLayout = cmnVar.J;
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
            p9n p9nVar2 = this.createRouteActivityBinding;
            if (p9nVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivityBinding");
            } else {
                p9nVar = p9nVar2;
            }
            p9nVar.K.setVisibility(0);
        }
        handleBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadRes(Continuation<? super Unit> continuation) {
        C30421 c30421;
        CreateRouteSelectStyleFragment createRouteSelectStyleFragment;
        CreateRouteCustomStyle createRouteCustomStyle;
        Object next;
        StyleDetail senStyle;
        if (continuation instanceof C30421) {
            c30421 = (C30421) continuation;
            int i = c30421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30421.label = i - Integer.MIN_VALUE;
            } else {
                c30421 = new C30421(continuation);
            }
        } else {
            c30421 = new C30421(continuation);
        }
        Object objAwait = c30421.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c30421.label;
        CreateRouteActivity createRouteActivity = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            CreateRouteViewModel createRouteViewModel = this.createRouteViewModel;
            if (createRouteViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                createRouteViewModel = null;
            }
            if (!(createRouteViewModel.getModuleSelected() instanceof CreateRouteViewModel.ModuleStatus.Char)) {
                CreateRouteViewModel createRouteViewModel2 = this.createRouteViewModel;
                if (createRouteViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    createRouteViewModel2 = null;
                }
                if (!(createRouteViewModel2.getModuleSelected() instanceof CreateRouteViewModel.ModuleStatus.Pattern)) {
                    CreateRouteViewModel createRouteViewModel3 = this.createRouteViewModel;
                    if (createRouteViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                        createRouteViewModel3 = null;
                    }
                    createRouteViewModel3.setModuleSelected(new CreateRouteViewModel.ModuleStatus.Char(""));
                    cmn cmnVar = this.mBinding;
                    if (cmnVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        cmnVar = null;
                    }
                    cmnVar.D.setSelected(true);
                    cmn cmnVar2 = this.mBinding;
                    if (cmnVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        cmnVar2 = null;
                    }
                    cmnVar2.N.setSelected(false);
                }
            }
            CreateRouteViewModel createRouteViewModel4 = this.createRouteViewModel;
            if (createRouteViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                createRouteViewModel4 = null;
            }
            if (!createRouteViewModel4.getRouteStyleListFlow().getReplayCache().isEmpty()) {
                CreateRouteViewModel createRouteViewModel5 = this.createRouteViewModel;
                if (createRouteViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    createRouteViewModel5 = null;
                }
                List<CreateRouteCustomStyle> list = createRouteViewModel5.getRouteStyleListFlow().getReplayCache().get(0);
                if (list != null && !list.isEmpty()) {
                    CreateRouteViewModel createRouteViewModel6 = this.createRouteViewModel;
                    if (createRouteViewModel6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                        createRouteViewModel6 = null;
                    }
                    List<CreateRouteCustomStyle> list2 = createRouteViewModel6.getRouteStyleListFlow().getReplayCache().get(0);
                    if (list2 != null) {
                        Iterator<T> it = list2.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            senStyle = ((CreateRouteCustomStyle) next).getSenStyle();
                        } while (!Intrinsics.areEqual(senStyle != null ? senStyle.getDesc() : null, "num"));
                        createRouteCustomStyle = (CreateRouteCustomStyle) next;
                    } else {
                        createRouteCustomStyle = null;
                    }
                    if (createRouteCustomStyle != null) {
                        return Unit.INSTANCE;
                    }
                }
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass3(null), 3, null);
            CreateRouteViewModel createRouteViewModel7 = this.createRouteViewModel;
            if (createRouteViewModel7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                createRouteViewModel7 = null;
            }
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(createRouteViewModel7), null, null, new AnonymousClass4(null), 3, null);
            c30421.L$0 = this;
            c30421.label = 1;
            objAwait = deferredAsync$default.await(c30421);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            createRouteSelectStyleFragment = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createRouteSelectStyleFragment = (CreateRouteSelectStyleFragment) c30421.L$0;
            ResultKt.throwOnFailure(objAwait);
        }
        CreateRouteViewModel.StatusCodes statusCodes = (CreateRouteViewModel.StatusCodes) objAwait;
        if (statusCodes != CreateRouteViewModel.StatusCodes.StatusSuccess) {
            CreateRouteViewModel createRouteViewModel8 = createRouteSelectStyleFragment.createRouteViewModel;
            if (createRouteViewModel8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                createRouteViewModel8 = null;
            }
            createRouteViewModel8.sendStateMessage(statusCodes);
            CreateRouteActivity createRouteActivity2 = createRouteSelectStyleFragment.createRouteActivity;
            if (createRouteActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            } else {
                createRouteActivity = createRouteActivity2;
            }
            createRouteActivity.replaceBottomSheetFragment(new CreateRouteChooseModuleFragment());
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        initView(inflater, container, savedInstanceState);
        cmn cmnVar = null;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C30431(null), 3, null);
        cmn cmnVar2 = this.mBinding;
        if (cmnVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            cmnVar = cmnVar2;
        }
        View root = cmnVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteSelectStyleFragment$PaddingTransformation;", "Lcoil/transform/Transformation;", "scaleFactor", "", "cacheKey", "", "<init>", "(FLjava/lang/String;)V", "getCacheKey", "()Ljava/lang/String;", "transform", "Landroid/graphics/Bitmap;", "input", MediaStoreUtil.MediaInfo.SIZE, "Lcoil/size/Size;", "(Landroid/graphics/Bitmap;Lcoil/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PaddingTransformation implements Transformation {

        @NotNull
        private final String cacheKey;
        private final float scaleFactor;

        public PaddingTransformation(float f, @NotNull String cacheKey) {
            Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
            this.scaleFactor = f;
            this.cacheKey = cacheKey;
        }

        @Override // coil.transform.Transformation
        @NotNull
        public String getCacheKey() {
            return this.cacheKey;
        }

        @Override // coil.transform.Transformation
        @Nullable
        public Object transform(@NotNull Bitmap bitmap, @NotNull Size size, @NotNull Continuation<? super Bitmap> continuation) {
            int width = (int) (bitmap.getWidth() * this.scaleFactor);
            int height = (int) (bitmap.getHeight() * this.scaleFactor);
            Logger.i("PaddingTransformation", "oldWidth:" + bitmap.getWidth() + ",oldHeight:" + bitmap.getHeight() + ",newWidth:" + width + ",newHeight:" + height);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            return bitmapCreateScaledBitmap;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ PaddingTransformation(float f, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                str = "PaddingTransformation-" + f;
            }
            this(f, str);
        }
    }
}
