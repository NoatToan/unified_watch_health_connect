package com.huami.step.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.hmchartui.ui.view.CommonCardView;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.step.R;
import com.huami.step.koin.IStepGameNavigator;
import com.huami.step.koin.KoinExtKt;
import com.huami.step.model.StepGameBean;
import com.huami.step.model.StepGameResponse;
import com.huami.step.utils.ExtensionUtilsKt;
import com.huami.step.utils.SerializationKtxKt;
import com.huami.step.utils.StepGameConstKt;
import com.huami.step.utils.StepStatEventKt;
import com.huami.tools.log.HMLog;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0007R\u001e\u0010\u0012\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/step/ui/StepGameFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/lifecycle/LifecycleObserver;", "", "isShow", "", "c", "b", "", "status", "a", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onShow", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepGameFragment extends Fragment implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: com.huami.step.ui.StepGameFragment$onShow$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.step.ui.StepGameFragment$onShow$1", f = "StepGameFragment.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.step.ui.StepGameFragment$onShow$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/step/model/StepGameResponse;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.step.ui.StepGameFragment$onShow$1$1", f = "StepGameFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function3<FlowCollector<? super StepGameResponse>, Throwable, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ StepGameFragment c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(StepGameFragment stepGameFragment, Continuation<? super a> continuation) {
                super(3, continuation);
                this.c = stepGameFragment;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull FlowCollector<? super StepGameResponse> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(this.c, continuation);
                aVar.b = th;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.b;
                HMLog.d(this.c.TAG, "error " + th, new Object[0]);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.step.ui.StepGameFragment$onShow$1$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b implements View.OnClickListener {
            public final /* synthetic */ StepGameBean a;
            public final /* synthetic */ StepGameFragment b;

            public b(StepGameBean stepGameBean, StepGameFragment stepGameFragment) {
                this.a = stepGameBean;
                this.b = stepGameFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String activity_link = this.a.getActivity_link();
                if (activity_link == null) {
                    return;
                }
                StepGameFragment stepGameFragment = this.b;
                stepGameFragment.a(this.a.getStatus());
                IStepGameNavigator stepGameNavigator = KoinExtKt.getStepGameNavigator();
                if (stepGameNavigator == null) {
                    return;
                }
                stepGameNavigator.navigatorUrl(stepGameFragment.requireContext(), activity_link);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return StepGameFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Flow flowM4456catch;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IStepGame iStepGame = KoinExtKt.getIStepGame();
                if (iStepGame != null && (flowM4456catch = FlowKt.m4456catch(iStepGame.getStepGameStatus(), new a(StepGameFragment.this, null))) != null) {
                    final StepGameFragment stepGameFragment = StepGameFragment.this;
                    FlowCollector<StepGameResponse> flowCollector = new FlowCollector<StepGameResponse>() { // from class: com.huami.step.ui.StepGameFragment$onShow$1$invokeSuspend$$inlined$collect$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public Object emit(StepGameResponse stepGameResponse, @NotNull Continuation continuation) {
                            int i2;
                            StepGameResponse stepGameResponse2 = stepGameResponse;
                            HMLog.d(stepGameFragment.TAG, String.valueOf(stepGameResponse2), new Object[0]);
                            int code = stepGameResponse2.getCode();
                            if (200 <= code && code <= 300) {
                                String body = stepGameResponse2.getBody();
                                if (body == null || m.isBlank(body)) {
                                    stepGameFragment.b(false);
                                } else {
                                    try {
                                        View view = stepGameFragment.getView();
                                        View viewFindViewById = null;
                                        if (RainbowUtils.isDarkMode(((ConstraintLayout) (view == null ? null : view.findViewById(R.id.card_step_game))).getContext())) {
                                            View view2 = stepGameFragment.getView();
                                            ((ConstraintLayout) (view2 == null ? null : view2.findViewById(R.id.card_step_game))).setBackgroundResource(R.drawable.bg_step_game_night);
                                        } else {
                                            View view3 = stepGameFragment.getView();
                                            ((ConstraintLayout) (view3 == null ? null : view3.findViewById(R.id.card_step_game))).setBackgroundResource(R.drawable.bg_step_game);
                                        }
                                        stepGameFragment.b(true);
                                        StepGameBean stepGameBean = (StepGameBean) SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(StepGameBean.INSTANCE.serializer(), stepGameResponse2.getBody());
                                        int status = stepGameBean.getStatus();
                                        if (status == StepGameConstKt.getSTEP_GAME_STATUS_NOSTART()) {
                                            View view4 = stepGameFragment.getView();
                                            ((TypefaceTextView) (view4 == null ? null : view4.findViewById(R.id.step_sub_title))).setText(R.string.step_game_sub_title);
                                            View view5 = stepGameFragment.getView();
                                            ((TypefaceTextView) (view5 == null ? null : view5.findViewById(R.id.step_tv_btn))).setText(R.string.step_unlock_step_game);
                                            stepGameFragment.c(false);
                                        } else if (status == StepGameConstKt.getSTEP_GAME_STATUS_ING()) {
                                            View view6 = stepGameFragment.getView();
                                            TypefaceTextView typefaceTextView = (TypefaceTextView) (view6 == null ? null : view6.findViewById(R.id.step_sub_title));
                                            String name = stepGameBean.getName();
                                            if (name == null) {
                                                name = stepGameFragment.getString(R.string.step_game_sub_title);
                                            }
                                            typefaceTextView.setText(name);
                                            View view7 = stepGameFragment.getView();
                                            ((TypefaceTextView) (view7 == null ? null : view7.findViewById(R.id.step_tv_btn))).setText(R.string.step_non_stop);
                                            StepGameFragment stepGameFragment2 = stepGameFragment;
                                            String percentage = stepGameBean.getPercentage();
                                            stepGameFragment2.c(!(percentage == null || percentage.length() == 0));
                                            String percentage2 = stepGameBean.getPercentage();
                                            if (percentage2 != null) {
                                                if (StringsKt__StringsKt.contains$default((CharSequence) percentage2, (CharSequence) "%", false, 2, (Object) null)) {
                                                    percentage2 = m.replace$default(percentage2, "%", "", false, 4, (Object) null);
                                                }
                                                try {
                                                    i2 = Integer.parseInt(percentage2);
                                                } catch (NumberFormatException unused) {
                                                    i2 = 0;
                                                }
                                                int iIntValue = Boxing.boxInt(i2).intValue();
                                                if (iIntValue < 0) {
                                                    iIntValue = 0;
                                                } else if (iIntValue > 100) {
                                                    iIntValue = 100;
                                                }
                                                int iIntValue2 = Boxing.boxInt(iIntValue).intValue();
                                                View view8 = stepGameFragment.getView();
                                                ((ProgressBar) (view8 == null ? null : view8.findViewById(R.id.step_pb))).setProgress(iIntValue2);
                                                View view9 = stepGameFragment.getView();
                                                ((TypefaceTextView) (view9 == null ? null : view9.findViewById(R.id.step_pb_desc))).setText(stepGameFragment.getString(R.string.step_percent_format, Boxing.boxInt(iIntValue2)));
                                            }
                                        } else if (status == StepGameConstKt.getSTEP_GAME_STATUS_END()) {
                                            View view10 = stepGameFragment.getView();
                                            TypefaceTextView typefaceTextView2 = (TypefaceTextView) (view10 == null ? null : view10.findViewById(R.id.step_sub_title));
                                            String name2 = stepGameBean.getName();
                                            String string = name2 == null ? null : stepGameFragment.getString(R.string.step_game_title_end, name2);
                                            if (string == null) {
                                                string = stepGameFragment.getString(R.string.step_game_sub_title);
                                            }
                                            typefaceTextView2.setText(string);
                                            View view11 = stepGameFragment.getView();
                                            ((TypefaceTextView) (view11 == null ? null : view11.findViewById(R.id.step_tv_btn))).setText(R.string.step_non_stop);
                                            stepGameFragment.c(false);
                                        }
                                        View view12 = stepGameFragment.getView();
                                        if (view12 != null) {
                                            viewFindViewById = view12.findViewById(R.id.root_step_game);
                                        }
                                        ((CommonCardView) viewFindViewById).setOnClickListener(new StepGameFragment.AnonymousClass1.b(stepGameBean, stepGameFragment));
                                    } catch (Throwable unused2) {
                                        stepGameFragment.b(false);
                                    }
                                }
                            } else {
                                stepGameFragment.b(false);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.a = 1;
                    if (flowM4456catch.collect(flowCollector, this) == coroutine_suspended) {
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

    public StepGameFragment() {
        super(R.layout.fragment_step_game);
        this.TAG = StepGameFragment.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int status) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(StepStatEventKt.getHEALTH_STEP_GAME_ENTER_C());
        HashMap map = new HashMap();
        if (status == StepGameConstKt.getSTEP_GAME_STATUS_NOSTART()) {
            map.put(StepStatEventKt.getHEALTH_STEP_GAME_ENTER_C_STATE(), StepStatEventKt.getHEALTH_STEP_GAME_ENTER_C_START());
        } else if (status == StepGameConstKt.getSTEP_GAME_STATUS_ING()) {
            map.put(StepStatEventKt.getHEALTH_STEP_GAME_ENTER_C_STATE(), StepStatEventKt.getHEALTH_STEP_GAME_ENTER_C_CONTINUE());
        } else if (status == StepGameConstKt.getSTEP_GAME_STATUS_END()) {
            map.put(StepStatEventKt.getHEALTH_STEP_GAME_ENTER_C_STATE(), StepStatEventKt.getHEALTH_STEP_GAME_ENTER_C_DONE());
        }
        countEventBuilder.putExtras(map);
        ExtensionUtilsKt.identifiedEvent(countEventBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(boolean isShow) {
        View view = getView();
        ((CommonCardView) (view == null ? null : view.findViewById(R.id.root_step_game))).setVisibility(isShow ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(boolean isShow) {
        View view = getView();
        ((ConstraintLayout) (view == null ? null : view.findViewById(R.id.step_pb_container))).setVisibility(isShow ? 0 : 8);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    @ExperimentalCoroutinesApi
    public final void onShow() {
        if (Intrinsics.areEqual(KoinExtKt.getStepGameEnable(), Boolean.TRUE)) {
            e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
        } else {
            b(false);
        }
    }
}
