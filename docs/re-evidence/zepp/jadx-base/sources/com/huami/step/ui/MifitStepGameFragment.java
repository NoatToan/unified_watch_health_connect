package com.huami.step.ui;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.hmchartui.ui.view.CommonCardView;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
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
import kotlin.jvm.internal.StringCompanionObject;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0007R\u001e\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\u000b0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/step/ui/MifitStepGameFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/lifecycle/LifecycleObserver;", "", "isShow", "", GoogleApiAvailabilityLight.a, "c", "", "status", "a", "", "url", "Landroid/widget/ImageView;", "imageView", "b", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onShow", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
public final class MifitStepGameFragment extends Fragment implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: com.huami.step.ui.MifitStepGameFragment$onShow$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.step.ui.MifitStepGameFragment$onShow$1", f = "MifitStepGameFragment.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.step.ui.MifitStepGameFragment$onShow$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/step/model/StepGameResponse;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.step.ui.MifitStepGameFragment$onShow$1$1", f = "MifitStepGameFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function3<FlowCollector<? super StepGameResponse>, Throwable, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ MifitStepGameFragment c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MifitStepGameFragment mifitStepGameFragment, Continuation<? super a> continuation) {
                super(3, continuation);
                this.c = mifitStepGameFragment;
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

        /* JADX INFO: renamed from: com.huami.step.ui.MifitStepGameFragment$onShow$1$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b implements View.OnClickListener {
            public final /* synthetic */ StepGameBean a;
            public final /* synthetic */ MifitStepGameFragment b;

            public b(StepGameBean stepGameBean, MifitStepGameFragment mifitStepGameFragment) {
                this.a = stepGameBean;
                this.b = mifitStepGameFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String activity_link = this.a.getActivity_link();
                if (activity_link == null) {
                    return;
                }
                MifitStepGameFragment mifitStepGameFragment = this.b;
                mifitStepGameFragment.a(this.a.getStatus());
                IStepGameNavigator stepGameNavigator = KoinExtKt.getStepGameNavigator();
                if (stepGameNavigator == null) {
                    return;
                }
                stepGameNavigator.navigatorUrl(mifitStepGameFragment.requireContext(), activity_link);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MifitStepGameFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Flow<StepGameResponse> stepGameStatus;
            Flow flowM4456catch;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IStepGame iStepGame = KoinExtKt.getIStepGame();
                if (iStepGame != null && (stepGameStatus = iStepGame.getStepGameStatus()) != null && (flowM4456catch = FlowKt.m4456catch(stepGameStatus, new a(MifitStepGameFragment.this, null))) != null) {
                    final MifitStepGameFragment mifitStepGameFragment = MifitStepGameFragment.this;
                    FlowCollector<StepGameResponse> flowCollector = new FlowCollector<StepGameResponse>() { // from class: com.huami.step.ui.MifitStepGameFragment$onShow$1$invokeSuspend$$inlined$collect$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public Object emit(StepGameResponse stepGameResponse, @NotNull Continuation continuation) {
                            int i2;
                            StepGameResponse stepGameResponse2 = stepGameResponse;
                            HMLog.d(mifitStepGameFragment.TAG, String.valueOf(stepGameResponse2), new Object[0]);
                            int code = stepGameResponse2.getCode();
                            boolean z = true;
                            if (200 <= code && code <= 300) {
                                String body = stepGameResponse2.getBody();
                                if (body == null || m.isBlank(body)) {
                                    mifitStepGameFragment.c(false);
                                } else {
                                    try {
                                        mifitStepGameFragment.c(true);
                                        StepGameBean stepGameBean = (StepGameBean) SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(StepGameBean.INSTANCE.serializer(), stepGameResponse2.getBody());
                                        View view = mifitStepGameFragment.getView();
                                        View viewFindViewById = null;
                                        ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.step_tv_btn))).setBackgroundColor(Color.parseColor(stepGameBean.getBackground_color()));
                                        MifitStepGameFragment mifitStepGameFragment2 = mifitStepGameFragment;
                                        String background_image_url = stepGameBean.getBackground_image_url();
                                        View view2 = mifitStepGameFragment.getView();
                                        mifitStepGameFragment2.b(background_image_url, (ImageView) (view2 == null ? null : view2.findViewById(R.id.img_background)));
                                        View view3 = mifitStepGameFragment.getView();
                                        ((TypefaceTextView) (view3 == null ? null : view3.findViewById(R.id.step_tv_title))).setVisibility(0);
                                        int status = stepGameBean.getStatus();
                                        if (status == StepGameConstKt.getSTEP_GAME_STATUS_NOSTART()) {
                                            View view4 = mifitStepGameFragment.getView();
                                            View viewFindViewById2 = view4 == null ? null : view4.findViewById(R.id.step_sub_title);
                                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                            ((TypefaceTextView) viewFindViewById2).setText(String.format(Locale.getDefault(), KoinExtKt.getAppContext().getString(R.string.step_geme_title_go), Arrays.copyOf(new Object[]{stepGameBean.getName()}, 1)));
                                            View view5 = mifitStepGameFragment.getView();
                                            ((TypefaceTextView) (view5 == null ? null : view5.findViewById(R.id.step_tv_btn))).setText(R.string.step_unlock_step_game);
                                            mifitStepGameFragment.d(false);
                                        } else if (status == StepGameConstKt.getSTEP_GAME_STATUS_ING()) {
                                            View view6 = mifitStepGameFragment.getView();
                                            View viewFindViewById3 = view6 == null ? null : view6.findViewById(R.id.step_sub_title);
                                            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                            ((TypefaceTextView) viewFindViewById3).setText(String.format(Locale.getDefault(), KoinExtKt.getAppContext().getString(R.string.step_geme_title_doing), Arrays.copyOf(new Object[]{stepGameBean.getName(), stepGameBean.getPercentage()}, 2)));
                                            View view7 = mifitStepGameFragment.getView();
                                            ((TypefaceTextView) (view7 == null ? null : view7.findViewById(R.id.step_tv_btn))).setText(R.string.step_non_stop);
                                            MifitStepGameFragment mifitStepGameFragment3 = mifitStepGameFragment;
                                            String percentage = stepGameBean.getPercentage();
                                            if (percentage == null || percentage.length() == 0) {
                                                z = false;
                                            }
                                            mifitStepGameFragment3.d(z);
                                            View view8 = mifitStepGameFragment.getView();
                                            ((TypefaceTextView) (view8 == null ? null : view8.findViewById(R.id.step_tv_title))).setVisibility(8);
                                            View view9 = mifitStepGameFragment.getView();
                                            ((ProgressBar) (view9 == null ? null : view9.findViewById(R.id.step_pb))).setProgressTintList(ColorStateList.valueOf(Color.parseColor(stepGameBean.getBackground_color())));
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
                                                View view10 = mifitStepGameFragment.getView();
                                                ((ProgressBar) (view10 == null ? null : view10.findViewById(R.id.step_pb))).setProgress(iIntValue2);
                                            }
                                        } else if (status == StepGameConstKt.getSTEP_GAME_STATUS_END()) {
                                            View view11 = mifitStepGameFragment.getView();
                                            TypefaceTextView typefaceTextView = (TypefaceTextView) (view11 == null ? null : view11.findViewById(R.id.step_sub_title));
                                            String string = stepGameBean.getName() == null ? null : mifitStepGameFragment.getString(R.string.step_geme_title_go, stepGameBean.getName());
                                            if (string == null) {
                                                string = mifitStepGameFragment.getString(R.string.step_game_sub_title);
                                            }
                                            typefaceTextView.setText(string);
                                            View view12 = mifitStepGameFragment.getView();
                                            ((TypefaceTextView) (view12 == null ? null : view12.findViewById(R.id.step_tv_btn))).setText(R.string.step_non_stop);
                                            mifitStepGameFragment.d(false);
                                        }
                                        View view13 = mifitStepGameFragment.getView();
                                        if (view13 != null) {
                                            viewFindViewById = view13.findViewById(R.id.root_step_game);
                                        }
                                        ((CommonCardView) viewFindViewById).setOnClickListener(new MifitStepGameFragment.AnonymousClass1.b(stepGameBean, mifitStepGameFragment));
                                    } catch (Throwable unused2) {
                                        mifitStepGameFragment.c(false);
                                    }
                                }
                            } else {
                                mifitStepGameFragment.c(false);
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

    public MifitStepGameFragment() {
        super(R.layout.fragment_step_game_v2);
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
    public final void b(String url, ImageView imageView) {
        Glide.with(KoinExtKt.getAppContext()).load(url).apply(new RequestOptions().placeholder(R.drawable.step_bg_pb_v2).transforms(new CenterCrop())).into(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(boolean isShow) {
        View view = getView();
        ((CommonCardView) (view == null ? null : view.findViewById(R.id.root_step_game))).setVisibility(isShow ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(boolean isShow) {
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
            c(false);
        }
    }
}
