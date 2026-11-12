package com.xiaomi.fitness.training_plan.report;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.Disposable;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.training_plan.report.DefaultShareWholeReportFragment;
import defpackage.jvi;
import defpackage.wrp;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0007¢\u0006\u0004\b!\u0010\u000bJ\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/DefaultShareWholeReportFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportShareViewModel;", "Lwrp;", "", "bitmapWidth", "bitmapHeight", "calcScrollViewHeight", "(II)I", "", "initSlideUpWidget", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_START, LifecycleConstantKt.ON_STOP, "", "hasInitSlideUpWidget", "Z", "hasLoadedLongImage", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "scrollViewTreeObserver$delegate", "Lkotlin/Lazy;", "getScrollViewTreeObserver", "()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "scrollViewTreeObserver", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DefaultShareWholeReportFragment extends BaseBindingFragment<TrainPlanReportShareViewModel, wrp> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "DefaultShareWholeReportFragment";
    private boolean hasInitSlideUpWidget;
    private boolean hasLoadedLongImage;

    /* JADX INFO: renamed from: scrollViewTreeObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scrollViewTreeObserver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zw5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DefaultShareWholeReportFragment.scrollViewTreeObserver_delegate$lambda$1(this.f41740a);
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/DefaultShareWholeReportFragment$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lcom/xiaomi/fitness/training_plan/report/DefaultShareWholeReportFragment;", "bitmapUriStr", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DefaultShareWholeReportFragment newInstance(@Nullable String bitmapUriStr) {
            DefaultShareWholeReportFragment defaultShareWholeReportFragment = new DefaultShareWholeReportFragment();
            Bundle bundle = new Bundle();
            bundle.putString(TrainPlanReportShareActivityKt.BUNDLE_PARAM_URI, bitmapUriStr);
            defaultShareWholeReportFragment.setArguments(bundle);
            return defaultShareWholeReportFragment;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.report.DefaultShareWholeReportFragment$onViewCreated$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.report.DefaultShareWholeReportFragment$onViewCreated$1", f = "DefaultShareWholeReportFragment.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.report.DefaultShareWholeReportFragment$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil/request/Disposable;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.training_plan.report.DefaultShareWholeReportFragment$onViewCreated$1$1", f = "DefaultShareWholeReportFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nDefaultShareWholeReportFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultShareWholeReportFragment.kt\ncom/xiaomi/fitness/training_plan/report/DefaultShareWholeReportFragment$onViewCreated$1$1\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,118:1\n54#2,3:119\n24#2:122\n59#2,4:123\n63#2,2:138\n489#3,11:127\n*S KotlinDebug\n*F\n+ 1 DefaultShareWholeReportFragment.kt\ncom/xiaomi/fitness/training_plan/report/DefaultShareWholeReportFragment$onViewCreated$1$1\n*L\n67#1:119,3\n67#1:122\n67#1:123,4\n67#1:138,2\n68#1:127,11\n*E\n"})
        public static final class C08001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Disposable>, Object> {
            final /* synthetic */ Bitmap $bitmap;
            int label;
            final /* synthetic */ DefaultShareWholeReportFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08001(DefaultShareWholeReportFragment defaultShareWholeReportFragment, Bitmap bitmap, Continuation<? super C08001> continuation) {
                super(2, continuation);
                this.this$0 = defaultShareWholeReportFragment;
                this.$bitmap = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08001(this.this$0, this.$bitmap, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ImageView imgShareLong = DefaultShareWholeReportFragment.access$getMBinding(this.this$0).C;
                Intrinsics.checkNotNullExpressionValue(imgShareLong, "imgShareLong");
                Bitmap bitmap = this.$bitmap;
                final DefaultShareWholeReportFragment defaultShareWholeReportFragment = this.this$0;
                ImageLoader imageLoader = Coil.imageLoader(imgShareLong.getContext());
                ImageRequest.Builder builderTarget = new ImageRequest.Builder(imgShareLong.getContext()).data(bitmap).target(imgShareLong);
                builderTarget.listener(new ImageRequest.Listener() { // from class: com.xiaomi.fitness.training_plan.report.DefaultShareWholeReportFragment$onViewCreated$1$1$invokeSuspend$lambda$2$$inlined$listener$default$1
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
                        ViewGroup.LayoutParams layoutParams = DefaultShareWholeReportFragment.access$getMBinding(defaultShareWholeReportFragment).G.getLayoutParams();
                        DefaultShareWholeReportFragment defaultShareWholeReportFragment2 = defaultShareWholeReportFragment;
                        layoutParams.height = defaultShareWholeReportFragment2.calcScrollViewHeight(DefaultShareWholeReportFragment.access$getMBinding(defaultShareWholeReportFragment2).C.getWidth(), DefaultShareWholeReportFragment.access$getMBinding(defaultShareWholeReportFragment).C.getHeight());
                        DefaultShareWholeReportFragment.access$getMBinding(defaultShareWholeReportFragment).G.setLayoutParams(layoutParams);
                        defaultShareWholeReportFragment.hasLoadedLongImage = true;
                    }
                });
                return imageLoader.enqueue(builderTarget.build());
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Disposable> continuation) {
                return ((C08001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultShareWholeReportFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Bundle arguments = DefaultShareWholeReportFragment.this.getArguments();
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(Uri.parse(arguments != null ? arguments.getString(TrainPlanReportShareActivityKt.BUNDLE_PARAM_URI) : null).getPath());
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    C08001 c08001 = new C08001(DefaultShareWholeReportFragment.this, bitmapDecodeFile, null);
                    this.label = 1;
                    if (BuildersKt.withContext(main, c08001, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                Logger.e("DefaultShareWholeReportFragment", "load bitmap exception", e);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final /* synthetic */ wrp access$getMBinding(DefaultShareWholeReportFragment defaultShareWholeReportFragment) {
        return defaultShareWholeReportFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calcScrollViewHeight(int bitmapWidth, int bitmapHeight) {
        float f = bitmapHeight / bitmapWidth;
        int measuredWidth = getMBinding().G.getMeasuredWidth();
        float measuredWidth2 = f * getMBinding().G.getMeasuredWidth();
        return ((float) measuredWidth) > measuredWidth2 ? (int) measuredWidth2 : measuredWidth;
    }

    private final ViewTreeObserver.OnGlobalLayoutListener getScrollViewTreeObserver() {
        return (ViewTreeObserver.OnGlobalLayoutListener) this.scrollViewTreeObserver.getValue();
    }

    private final void initSlideUpWidget() {
        int height = getMBinding().G.getHeight();
        ConstraintLayout slideUpWidget = getMBinding().I;
        Intrinsics.checkNotNullExpressionValue(slideUpWidget, "slideUpWidget");
        ViewExtKt.setVisible(slideUpWidget, height < getMBinding().C.getHeight() - ExtUtilsKt.getDp(25));
        ConstraintLayout slideUpWidget2 = getMBinding().I;
        Intrinsics.checkNotNullExpressionValue(slideUpWidget2, "slideUpWidget");
        if (ExtUtilsKt.isVisible(slideUpWidget2)) {
            getMBinding().G.setOnScrollChangeListener(new NestedScrollView.d() { // from class: vw5
                @Override // androidx.core.widget.NestedScrollView.d
                public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                    DefaultShareWholeReportFragment.initSlideUpWidget$lambda$2(this.f37296a, nestedScrollView, i, i2, i3, i4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSlideUpWidget$lambda$2(DefaultShareWholeReportFragment this$0, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nestedScrollView, "<unused var>");
        if (i2 >= 20) {
            ConstraintLayout slideUpWidget = this$0.getMBinding().I;
            Intrinsics.checkNotNullExpressionValue(slideUpWidget, "slideUpWidget");
            ViewExtKt.gone(slideUpWidget);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewTreeObserver.OnGlobalLayoutListener scrollViewTreeObserver_delegate$lambda$1(final DefaultShareWholeReportFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xw5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                DefaultShareWholeReportFragment.scrollViewTreeObserver_delegate$lambda$1$lambda$0(this.f39526a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollViewTreeObserver_delegate$lambda$1$lambda$0(DefaultShareWholeReportFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getMBinding().G.getHeight() <= 0 || this$0.getMBinding().C.getHeight() <= 0 || !this$0.hasLoadedLongImage || this$0.hasInitSlideUpWidget) {
            return;
        }
        this$0.initSlideUpWidget();
        this$0.hasInitSlideUpWidget = true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.W;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getMBinding().G.getViewTreeObserver().addOnGlobalLayoutListener(getScrollViewTreeObserver());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getMBinding().G.getViewTreeObserver().removeOnGlobalLayoutListener(getScrollViewTreeObserver());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(null));
    }
}
