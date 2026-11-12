package com.xiaomi.fitness.training_plan.ability_plan;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.decode.GifDecoder;
import coil.decode.ImageDecoderDecoder;
import coil.request.Disposable;
import coil.request.ImageRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanCreateLoadingActivity;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlan;
import com.xiaomi.fitness.training_plan_export.model.TrainingPlanConstantsKt;
import com.xiaomi.fitness.training_plan_export.utils.TrainingEventUtils;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import defpackage.aje;
import defpackage.csi;
import defpackage.ioi;
import defpackage.jvi;
import defpackage.k1j;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001eH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanCreateLoadingActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "trainingPlanRequest", "Lcom/xiaomi/fitness/training_plan/net/TrainingPlanRequest;", "getTrainingPlanRequest", "()Lcom/xiaomi/fitness/training_plan/net/TrainingPlanRequest;", "trainingPlanRequest$delegate", "Lkotlin/Lazy;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "layoutId", "", "getLayoutId", "()I", "generateParams", "Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanCreateLoadingActivity$AbilityPlanGenerateParams;", "gifImageLoader", "Lcoil/ImageLoader;", "loadingImg", "Landroid/widget/ImageView;", "loadingTipTV", "Landroid/widget/TextView;", "imageDisposable", "Lcoil/request/Disposable;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "createAbilityPlan", LifecycleConstantKt.ON_DESTROY, "Companion", "AbilityPlanGenerateParams", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAbilityPlanCreateLoadingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityPlanCreateLoadingActivity.kt\ncom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanCreateLoadingActivity\n+ 2 ImageLoader.kt\ncoil/ImageLoader$Builder\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,151:1\n192#2:152\n54#3,9:153\n63#3,2:163\n57#4:162\n*S KotlinDebug\n*F\n+ 1 AbilityPlanCreateLoadingActivity.kt\ncom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanCreateLoadingActivity\n*L\n83#1:152\n106#1:153,9\n106#1:163,2\n106#1:162\n*E\n"})
public final class AbilityPlanCreateLoadingActivity extends BaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_ABILITY_GENERATE_PARAMS = "ability_plan_generate_param";

    @NotNull
    private static final String TAG = "AbilityPlanCreateLoadingActivity";

    @Nullable
    private AbilityPlanGenerateParams generateParams;
    private ImageLoader gifImageLoader;

    @Nullable
    private Disposable imageDisposable;
    private ImageView loadingImg;
    private TextView loadingTipTV;

    /* JADX INFO: renamed from: trainingPlanRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy trainingPlanRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hi
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbilityPlanCreateLoadingActivity.trainingPlanRequest_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ii
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbilityPlanCreateLoadingActivity.gson_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanCreateLoadingActivity$Companion;", "", "<init>", "()V", "KEY_ABILITY_GENERATE_PARAMS", "", "TAG", "launch", "", "context", "Landroid/content/Context;", "params", "Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanCreateLoadingActivity$AbilityPlanGenerateParams;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, @NotNull AbilityPlanGenerateParams params) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(params, "params");
            Intent intent = new Intent(context, (Class<?>) AbilityPlanCreateLoadingActivity.class);
            intent.putExtra(AbilityPlanCreateLoadingActivity.KEY_ABILITY_GENERATE_PARAMS, params);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanCreateLoadingActivity$createAbilityPlan$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanCreateLoadingActivity$createAbilityPlan$1", f = "AbilityPlanCreateLoadingActivity.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanCreateLoadingActivity$createAbilityPlan$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanCreateLoadingActivity$createAbilityPlan$1$1", f = "AbilityPlanCreateLoadingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nAbilityPlanCreateLoadingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityPlanCreateLoadingActivity.kt\ncom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanCreateLoadingActivity$createAbilityPlan$1$1\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,151:1\n54#2,9:152\n63#2,2:162\n57#3:161\n*S KotlinDebug\n*F\n+ 1 AbilityPlanCreateLoadingActivity.kt\ncom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanCreateLoadingActivity$createAbilityPlan$1$1\n*L\n118#1:152,9\n118#1:162,2\n118#1:161\n*E\n"})
        public static final class C07931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ AbilityPlan $generateResult;
            int label;
            final /* synthetic */ AbilityPlanCreateLoadingActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07931(AbilityPlan abilityPlan, AbilityPlanCreateLoadingActivity abilityPlanCreateLoadingActivity, Continuation<? super C07931> continuation) {
                super(2, continuation);
                this.$generateResult = abilityPlan;
                this.this$0 = abilityPlanCreateLoadingActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(AbilityPlanCreateLoadingActivity abilityPlanCreateLoadingActivity, AbilityPlan abilityPlan) {
                AbilityPlanDetailActivity.INSTANCE.launchWithPlanId(abilityPlanCreateLoadingActivity, abilityPlan.getPlanId());
                abilityPlanCreateLoadingActivity.finish();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07931(this.$generateResult, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AbilityPlan abilityPlan = this.$generateResult;
                if (abilityPlan == null || abilityPlan.getPlanId() == 0) {
                    TrainingEventUtils trainingEventUtils = TrainingEventUtils.INSTANCE;
                    AbilityPlanGenerateParams abilityPlanGenerateParams = this.this$0.generateParams;
                    Intrinsics.checkNotNull(abilityPlanGenerateParams);
                    trainingEventUtils.trackPlanGenerated(false, abilityPlanGenerateParams.getDistanceGoal());
                    ToastUtil.showToast(this.this$0.getString(k1j.T));
                    this.this$0.finish();
                } else {
                    TrainingEventUtils trainingEventUtils2 = TrainingEventUtils.INSTANCE;
                    AbilityPlanGenerateParams abilityPlanGenerateParams2 = this.this$0.generateParams;
                    Intrinsics.checkNotNull(abilityPlanGenerateParams2);
                    trainingEventUtils2.trackPlanGenerated(true, abilityPlanGenerateParams2.getDistanceGoal());
                    aje.b(this.this$0).d(new Intent(TrainingPlanConstantsKt.FINISH_CREATE_ACTION));
                    AbilityPlanCreateLoadingActivity abilityPlanCreateLoadingActivity = this.this$0;
                    ImageView imageView = abilityPlanCreateLoadingActivity.loadingImg;
                    TextView textView = null;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loadingImg");
                        imageView = null;
                    }
                    Integer numBoxInt = Boxing.boxInt(ioi.f21947a);
                    ImageLoader imageLoader = this.this$0.gifImageLoader;
                    if (imageLoader == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("gifImageLoader");
                        imageLoader = null;
                    }
                    ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(numBoxInt).target(imageView);
                    Unit unit = Unit.INSTANCE;
                    abilityPlanCreateLoadingActivity.imageDisposable = imageLoader.enqueue(builderTarget.build());
                    TextView textView2 = this.this$0.loadingTipTV;
                    if (textView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loadingTipTV");
                    } else {
                        textView = textView2;
                    }
                    textView.setText(this.this$0.getString(k1j.S));
                    Handler handler = new Handler(Looper.getMainLooper());
                    final AbilityPlanCreateLoadingActivity abilityPlanCreateLoadingActivity2 = this.this$0;
                    final AbilityPlan abilityPlan2 = this.$generateResult;
                    Boxing.boxBoolean(handler.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.training_plan.ability_plan.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbilityPlanCreateLoadingActivity.AnonymousClass1.C07931.invokeSuspend$lambda$0(abilityPlanCreateLoadingActivity2, abilityPlan2);
                        }
                    }, 500L));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AbilityPlanCreateLoadingActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrainingPlanRequest trainingPlanRequest = AbilityPlanCreateLoadingActivity.this.getTrainingPlanRequest();
                String json = AbilityPlanCreateLoadingActivity.this.getGson().toJson(AbilityPlanCreateLoadingActivity.this.generateParams);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = trainingPlanRequest.generateAbilityPlan(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AnyExtKt.main$default(null, new C07931((AbilityPlan) obj, AbilityPlanCreateLoadingActivity.this, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void createAbilityPlan() {
        ImageView imageView = this.loadingImg;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingImg");
            imageView = null;
        }
        Integer numValueOf = Integer.valueOf(ioi.f21948b);
        ImageLoader imageLoader = this.gifImageLoader;
        if (imageLoader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gifImageLoader");
            imageLoader = null;
        }
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(numValueOf).target(imageView);
        Unit unit = Unit.INSTANCE;
        this.imageDisposable = imageLoader.enqueue(builderTarget.build());
        TextView textView = this.loadingTipTV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingTipTV");
            textView = null;
        }
        textView.setText(getString(k1j.U));
        ScopeExtKt.scopeNet$default(null, new AnonymousClass1(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson getGson() {
        return (Gson) this.gson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrainingPlanRequest getTrainingPlanRequest() {
        return (TrainingPlanRequest) this.trainingPlanRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gson_delegate$lambda$1() {
        return new Gson();
    }

    private final void initView() {
        TrainingPlanTitleBar trainingPlanTitleBar = (TrainingPlanTitleBar) findViewById(csi.J3);
        trainingPlanTitleBar.hideMore();
        trainingPlanTitleBar.setTitle(k1j.q0);
        this.loadingImg = (ImageView) findViewById(csi.l0);
        this.loadingTipTV = (TextView) findViewById(csi.m0);
        createAbilityPlan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrainingPlanRequest trainingPlanRequest_delegate$lambda$0() {
        return new TrainingPlanRequest();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.q;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(jvi.q);
        DisplayUtil.setTranslucentStatusBar(this);
        boolean z = false;
        setActionBarDisplayable(false);
        Serializable serializableExtra = getIntent().getSerializableExtra(KEY_ABILITY_GENERATE_PARAMS);
        DefaultConstructorMarker defaultConstructorMarker = null;
        AbilityPlanGenerateParams abilityPlanGenerateParams = serializableExtra instanceof AbilityPlanGenerateParams ? (AbilityPlanGenerateParams) serializableExtra : null;
        this.generateParams = abilityPlanGenerateParams;
        if (abilityPlanGenerateParams == null) {
            LogExtKt.loge(TAG, "can not create ability with empty params!!");
            finish();
        }
        ImageLoader.Builder builder = new ImageLoader.Builder(this);
        ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
        int i = 1;
        if (Build.VERSION.SDK_INT >= 28) {
            builder2.add(new ImageDecoderDecoder.Factory(z, i, defaultConstructorMarker));
        } else {
            builder2.add(new GifDecoder.Factory(z, i, defaultConstructorMarker));
        }
        Unit unit = Unit.INSTANCE;
        this.gifImageLoader = builder.components(builder2.build()).build();
        initView();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Disposable disposable = this.imageDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/training_plan/ability_plan/AbilityPlanCreateLoadingActivity$AbilityPlanGenerateParams;", "Ljava/io/Serializable;", "distanceGoal", "", "frequency", "perRunningDistance", "pace", "runningDays", "", "strengthDays", "<init>", "(IIIILjava/lang/String;Ljava/lang/String;)V", "getDistanceGoal", "()I", "getFrequency", "getPerRunningDistance", "getPace", "getRunningDays", "()Ljava/lang/String;", "setRunningDays", "(Ljava/lang/String;)V", "getStrengthDays", "setStrengthDays", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AbilityPlanGenerateParams implements Serializable {

        @SerializedName("improve_distance")
        private final int distanceGoal;

        @SerializedName("running_frequency")
        private final int frequency;

        @SerializedName("running_pace")
        private final int pace;

        @SerializedName("running_distance")
        private final int perRunningDistance;

        @SerializedName("running_days")
        @NotNull
        private String runningDays;

        @SerializedName("strength_days")
        @NotNull
        private String strengthDays;

        public AbilityPlanGenerateParams(int i, int i2, int i3, int i4, @NotNull String runningDays, @NotNull String strengthDays) {
            Intrinsics.checkNotNullParameter(runningDays, "runningDays");
            Intrinsics.checkNotNullParameter(strengthDays, "strengthDays");
            this.distanceGoal = i;
            this.frequency = i2;
            this.perRunningDistance = i3;
            this.pace = i4;
            this.runningDays = runningDays;
            this.strengthDays = strengthDays;
        }

        public static /* synthetic */ AbilityPlanGenerateParams copy$default(AbilityPlanGenerateParams abilityPlanGenerateParams, int i, int i2, int i3, int i4, String str, String str2, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = abilityPlanGenerateParams.distanceGoal;
            }
            if ((i5 & 2) != 0) {
                i2 = abilityPlanGenerateParams.frequency;
            }
            int i6 = i2;
            if ((i5 & 4) != 0) {
                i3 = abilityPlanGenerateParams.perRunningDistance;
            }
            int i7 = i3;
            if ((i5 & 8) != 0) {
                i4 = abilityPlanGenerateParams.pace;
            }
            int i8 = i4;
            if ((i5 & 16) != 0) {
                str = abilityPlanGenerateParams.runningDays;
            }
            String str3 = str;
            if ((i5 & 32) != 0) {
                str2 = abilityPlanGenerateParams.strengthDays;
            }
            return abilityPlanGenerateParams.copy(i, i6, i7, i8, str3, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getDistanceGoal() {
            return this.distanceGoal;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getFrequency() {
            return this.frequency;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getPerRunningDistance() {
            return this.perRunningDistance;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getPace() {
            return this.pace;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getRunningDays() {
            return this.runningDays;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getStrengthDays() {
            return this.strengthDays;
        }

        @NotNull
        public final AbilityPlanGenerateParams copy(int distanceGoal, int frequency, int perRunningDistance, int pace, @NotNull String runningDays, @NotNull String strengthDays) {
            Intrinsics.checkNotNullParameter(runningDays, "runningDays");
            Intrinsics.checkNotNullParameter(strengthDays, "strengthDays");
            return new AbilityPlanGenerateParams(distanceGoal, frequency, perRunningDistance, pace, runningDays, strengthDays);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AbilityPlanGenerateParams)) {
                return false;
            }
            AbilityPlanGenerateParams abilityPlanGenerateParams = (AbilityPlanGenerateParams) other;
            return this.distanceGoal == abilityPlanGenerateParams.distanceGoal && this.frequency == abilityPlanGenerateParams.frequency && this.perRunningDistance == abilityPlanGenerateParams.perRunningDistance && this.pace == abilityPlanGenerateParams.pace && Intrinsics.areEqual(this.runningDays, abilityPlanGenerateParams.runningDays) && Intrinsics.areEqual(this.strengthDays, abilityPlanGenerateParams.strengthDays);
        }

        public final int getDistanceGoal() {
            return this.distanceGoal;
        }

        public final int getFrequency() {
            return this.frequency;
        }

        public final int getPace() {
            return this.pace;
        }

        public final int getPerRunningDistance() {
            return this.perRunningDistance;
        }

        @NotNull
        public final String getRunningDays() {
            return this.runningDays;
        }

        @NotNull
        public final String getStrengthDays() {
            return this.strengthDays;
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.distanceGoal) * 31) + Integer.hashCode(this.frequency)) * 31) + Integer.hashCode(this.perRunningDistance)) * 31) + Integer.hashCode(this.pace)) * 31) + this.runningDays.hashCode()) * 31) + this.strengthDays.hashCode();
        }

        public final void setRunningDays(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.runningDays = str;
        }

        public final void setStrengthDays(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.strengthDays = str;
        }

        @NotNull
        public String toString() {
            return "AbilityPlanGenerateParams(distanceGoal=" + this.distanceGoal + ", frequency=" + this.frequency + ", perRunningDistance=" + this.perRunningDistance + ", pace=" + this.pace + ", runningDays=" + this.runningDays + ", strengthDays=" + this.strengthDays + ")";
        }

        public /* synthetic */ AbilityPlanGenerateParams(int i, int i2, int i3, int i4, String str, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3, i4, (i5 & 16) != 0 ? "" : str, (i5 & 32) != 0 ? "" : str2);
        }
    }
}
