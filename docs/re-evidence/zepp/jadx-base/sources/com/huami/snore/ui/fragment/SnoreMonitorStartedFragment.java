package com.huami.snore.ui.fragment;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.huami.snore.core.R;
import com.huami.snore.core.domain.RecorderConfig;
import com.huami.snore.core.domain.SnoreConstant;
import com.huami.snore.core.ext.KoinExtKt;
import com.huami.snore.core.helper.SnoreHelper;
import com.huami.snore.core.service.SnoreRecordService;
import com.huami.snore.core.util.SnoreSpCache;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import com.huami.snore.ui.base.BaseSnoreMonitorFragment;
import com.huami.snore.ui.fragment.SnoreMonitorStartedFragment;
import com.huami.snore.ui.util.CommonUiUtil;
import com.huami.snore.ui.view.CustomRoundProgressBar;
import com.huami.snore.ui.viewmodel.SnoreMonitorViewModel;
import com.loc.z;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\t*\u0001.\u0018\u00002\u00020\u0001:\u000245B\u0007¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J \u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u001a\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010\u001a\u001a\u00020\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016R\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010%\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010)R\u001d\u0010-\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010)R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00066"}, d2 = {"Lcom/huami/snore/ui/fragment/SnoreMonitorStartedFragment;", "Lcom/huami/snore/ui/base/BaseSnoreMonitorFragment;", "", "o", "g", "t", "w", "", "progressValue", "r", "v", "Landroid/view/View;", "target", "Landroid/animation/Animator$AnimatorListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "process", SOAP.XMLNS, "u", z.j, ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onCreate", "getContentView", "startScaleAnim", "cancelScaleAnim", "onDestroyView", "onDestroy", "Landroid/animation/ObjectAnimator;", "b", "Lkotlin/Lazy;", "l", "()Landroid/animation/ObjectAnimator;", "mProgressAnimator", "c", "m", "mProgressCancelAnimator", "Landroid/view/animation/Animation;", GoogleApiAvailabilityLight.a, GoogleApiAvailabilityLight.b, "()Landroid/view/animation/Animation;", "mScaleAnimator", "e", hl.k, "mAlphaAnimator", "com/huami/snore/ui/fragment/SnoreMonitorStartedFragment$mBroadcastReceiver$1", "f", "Lcom/huami/snore/ui/fragment/SnoreMonitorStartedFragment$mBroadcastReceiver$1;", "mBroadcastReceiver", "<init>", "()V", "EasyAnimatorListener", "ProgressTouchListener", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreMonitorStartedFragment extends BaseSnoreMonitorFragment {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mProgressAnimator = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mProgressCancelAnimator = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mScaleAnimator = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAlphaAnimator = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final SnoreMonitorStartedFragment$mBroadcastReceiver$1 mBroadcastReceiver = new BroadcastReceiver() { // from class: com.huami.snore.ui.fragment.SnoreMonitorStartedFragment$mBroadcastReceiver$1
        /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context p0, @Nullable Intent p1) {
            String stringExtra = p1 == null ? null : p1.getStringExtra(SnoreRecordService.RECORD_FINISH_TYPE);
            long longExtra = p1 == null ? 0L : p1.getLongExtra(SnoreRecordService.KEY_MONITOR_TOTAL_TIME, 0L);
            boolean z = false;
            if (0 <= longExtra && longExtra < 600000) {
                z = true;
            }
            if (z) {
                SnoreMonitorViewModel model = this.a.getModel();
                Serializable serializableExtra = p1 != null ? p1.getSerializableExtra(SnoreRecordService.KEY_MONITOR_START_TIME) : null;
                Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type java.util.Date");
                model.deleteData((Date) serializableExtra, new Date());
            }
            if (stringExtra != null) {
                int iHashCode = stringExtra.hashCode();
                if (iHashCode != -2122358630) {
                    if (iHashCode != 735220717) {
                        if (iHashCode == 1651737656 && stringExtra.equals(SnoreRecordService.TYPE_PROCESS_ERROR)) {
                            this.a.getModel().getPageStateLiveData().setValue("finish");
                        }
                    } else if (stringExtra.equals(SnoreRecordService.TYPE_RECORD_END)) {
                        CommonUiUtil.INSTANCE.getInstance().showSnoreMonitorFinishDialog(this.a.getMActivity(), this.a.getMActivity().getSupportFragmentManager(), longExtra);
                        this.a.getModel().getPageStateLiveData().setValue(SnoreMonitorActivity.PAGE_UN_START);
                        KoinExtKt.getPageStatusAnalyticsManagerImpl().recordEvent("SNORING_RESULT_V");
                    }
                } else if (stringExtra.equals(SnoreRecordService.TYPE_RECORD_ERROR)) {
                    this.a.getModel().getPageStateLiveData().setValue("finish");
                }
            }
            SnoreSpCache.Companion companion = SnoreSpCache.INSTANCE;
            companion.getInstance().removeShareCache(this.a.getMActivity(), SnoreConstant.SP_KEY_START_MONITOR);
            companion.getInstance().removeShareCache(this.a.getMActivity(), SnoreConstant.SP_KEY_MORE_TEN_MINI);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/snore/ui/fragment/SnoreMonitorStartedFragment$EasyAnimatorListener;", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationStart", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "snore_release"}, k = 1, mv = {1, 5, 1})
    public interface EasyAnimatorListener extends Animator.AnimatorListener {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class DefaultImpls {
            public static void onAnimationCancel(@NotNull EasyAnimatorListener easyAnimatorListener, @NotNull Animator animator) {
            }

            public static void onAnimationEnd(@NotNull EasyAnimatorListener easyAnimatorListener, @NotNull Animator animator) {
            }

            public static void onAnimationRepeat(@NotNull EasyAnimatorListener easyAnimatorListener, @NotNull Animator animator) {
            }

            public static void onAnimationStart(@NotNull EasyAnimatorListener easyAnimatorListener, @NotNull Animator animator) {
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        void onAnimationCancel(@NotNull Animator animation);

        @Override // android.animation.Animator.AnimatorListener
        void onAnimationEnd(@NotNull Animator animation);

        @Override // android.animation.Animator.AnimatorListener
        void onAnimationRepeat(@NotNull Animator animation);

        @Override // android.animation.Animator.AnimatorListener
        void onAnimationStart(@NotNull Animator animation);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/snore/ui/fragment/SnoreMonitorStartedFragment$ProgressTouchListener;", "Landroid/view/View$OnTouchListener;", "", "onStart", "onCancel", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "event", "", "onTouch", "snore_release"}, k = 1, mv = {1, 5, 1})
    public interface ProgressTouchListener extends View.OnTouchListener {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class DefaultImpls {
            public static boolean onTouch(@NotNull ProgressTouchListener progressTouchListener, @NotNull View view, @NotNull MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    progressTouchListener.onStart();
                } else if (action == 1) {
                    view.performClick();
                    progressTouchListener.onCancel();
                }
                return true;
            }
        }

        void onCancel();

        void onStart();

        @Override // android.view.View.OnTouchListener
        boolean onTouch(@NotNull View v, @NotNull MotionEvent event);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Animation> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Animation invoke() {
            return AnimationUtils.loadAnimation(SnoreMonitorStartedFragment.this.getMActivity(), R.anim.alpha);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/ObjectAnimator;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ObjectAnimator> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ObjectAnimator invoke() {
            ObjectAnimator objectAnimator = new ObjectAnimator();
            objectAnimator.setPropertyName("progress");
            objectAnimator.setDuration(TimeUtils.TIME_30_MINUTE);
            objectAnimator.setInterpolator(new DecelerateInterpolator());
            return objectAnimator;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/ObjectAnimator;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ObjectAnimator> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ObjectAnimator invoke() {
            ObjectAnimator objectAnimator = new ObjectAnimator();
            objectAnimator.setPropertyName("progress");
            objectAnimator.setDuration(500L);
            objectAnimator.setInterpolator(new DecelerateInterpolator());
            return objectAnimator;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Animation> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Animation invoke() {
            return AnimationUtils.loadAnimation(SnoreMonitorStartedFragment.this.getMActivity(), R.anim.scale_out_in);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.snore.ui.fragment.SnoreMonitorStartedFragment$onCreate$2", f = "SnoreMonitorStartedFragment.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SnoreMonitorStartedFragment.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SnoreMonitorViewModel model = SnoreMonitorStartedFragment.this.getModel();
                this.a = 1;
                if (model.getRealTime(this) == coroutine_suspended) {
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
    }

    private final void g() {
        SnoreMonitorViewModel model = getModel();
        model.getCurrentHour().observe(getMActivity(), new Observer() { // from class: u57
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreMonitorStartedFragment.h(this.a, (String) obj);
            }
        });
        model.getCurrentMin().observe(getMActivity(), new Observer() { // from class: t57
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SnoreMonitorStartedFragment.i(this.a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SnoreMonitorStartedFragment snoreMonitorStartedFragment, String str) {
        View view = snoreMonitorStartedFragment.getView();
        TextView textView = (TextView) (view == null ? null : view.findViewById(R.id.timeHour));
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SnoreMonitorStartedFragment snoreMonitorStartedFragment, String str) {
        View view = snoreMonitorStartedFragment.getView();
        TextView textView = (TextView) (view == null ? null : view.findViewById(R.id.timeMin));
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        if (l().isStarted()) {
            l().cancel();
        }
    }

    private final Animation k() {
        return (Animation) this.mAlphaAnimator.getValue();
    }

    private final ObjectAnimator l() {
        return (ObjectAnimator) this.mProgressAnimator.getValue();
    }

    private final ObjectAnimator m() {
        return (ObjectAnimator) this.mProgressCancelAnimator.getValue();
    }

    private final Animation n() {
        return (Animation) this.mScaleAnimator.getValue();
    }

    private final void o() {
        View view = getView();
        ((CustomRoundProgressBar) (view == null ? null : view.findViewById(R.id.progress))).setTotal(100);
        View view2 = getView();
        ((CustomRoundProgressBar) (view2 == null ? null : view2.findViewById(R.id.progress))).setOnTouchListener(new ProgressTouchListener() { // from class: com.huami.snore.ui.fragment.SnoreMonitorStartedFragment$setupView$1
            @Override // com.huami.snore.ui.fragment.SnoreMonitorStartedFragment.ProgressTouchListener
            public void onCancel() {
                this.a.j();
                this.a.cancelScaleAnim();
            }

            @Override // com.huami.snore.ui.fragment.SnoreMonitorStartedFragment.ProgressTouchListener
            public void onStart() {
                this.a.t();
                this.a.startScaleAnim();
            }

            @Override // com.huami.snore.ui.fragment.SnoreMonitorStartedFragment.ProgressTouchListener, android.view.View.OnTouchListener
            public boolean onTouch(@NotNull View view3, @NotNull MotionEvent motionEvent) {
                return SnoreMonitorStartedFragment.ProgressTouchListener.DefaultImpls.onTouch(this, view3, motionEvent);
            }
        });
        v();
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.helpSleepTonality))).setOnClickListener(new View.OnClickListener() { // from class: s57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                SnoreMonitorStartedFragment.p(this.a, view4);
            }
        });
        View view4 = getView();
        ((TextView) (view4 != null ? view4.findViewById(R.id.helpSleepRegulation) : null)).setOnClickListener(new View.OnClickListener() { // from class: r57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                SnoreMonitorStartedFragment.q(this.a, view5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(SnoreMonitorStartedFragment snoreMonitorStartedFragment, View view) {
        KoinExtKt.getPageJumpManager().toHelpSleepTonality(snoreMonitorStartedFragment.getMActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SnoreMonitorStartedFragment snoreMonitorStartedFragment, View view) {
        KoinExtKt.getPageJumpManager().toHelpSleepRegulation(snoreMonitorStartedFragment.getMActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(int progressValue) {
        if (m().isStarted()) {
            return;
        }
        EasyAnimatorListener easyAnimatorListener = new EasyAnimatorListener() { // from class: com.huami.snore.ui.fragment.SnoreMonitorStartedFragment$startCancelAnim$animatorListener$1
            @Override // com.huami.snore.ui.fragment.SnoreMonitorStartedFragment.EasyAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                SnoreMonitorStartedFragment.EasyAnimatorListener.DefaultImpls.onAnimationCancel(this, animation);
                animation.removeListener(this);
                View view = this.a.getView();
                ((CustomRoundProgressBar) (view == null ? null : view.findViewById(R.id.progress))).setProgress(0);
            }

            @Override // com.huami.snore.ui.fragment.SnoreMonitorStartedFragment.EasyAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                SnoreMonitorStartedFragment.EasyAnimatorListener.DefaultImpls.onAnimationEnd(this, animation);
                animation.removeListener(this);
                View view = this.a.getView();
                ((CustomRoundProgressBar) (view == null ? null : view.findViewById(R.id.progress))).setProgress(0);
            }

            @Override // com.huami.snore.ui.fragment.SnoreMonitorStartedFragment.EasyAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
                SnoreMonitorStartedFragment.EasyAnimatorListener.DefaultImpls.onAnimationRepeat(this, animator);
            }

            @Override // com.huami.snore.ui.fragment.SnoreMonitorStartedFragment.EasyAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                SnoreMonitorStartedFragment.EasyAnimatorListener.DefaultImpls.onAnimationStart(this, animator);
            }
        };
        View view = getView();
        s(view == null ? null : view.findViewById(R.id.progress), easyAnimatorListener, progressValue);
    }

    private final void s(View target, Animator.AnimatorListener listener, int process) {
        m().setTarget(target);
        m().setIntValues(process, 0);
        m().addListener(listener);
        m().start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        if (l().isStarted()) {
            return;
        }
        EasyAnimatorListener easyAnimatorListener = new EasyAnimatorListener() { // from class: com.huami.snore.ui.fragment.SnoreMonitorStartedFragment$startDoneAnim$animatorListener$1
            @Override // com.huami.snore.ui.fragment.SnoreMonitorStartedFragment.EasyAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                SnoreMonitorStartedFragment.EasyAnimatorListener.DefaultImpls.onAnimationCancel(this, animation);
                animation.removeListener(this);
                SnoreMonitorStartedFragment snoreMonitorStartedFragment = this.a;
                View view = snoreMonitorStartedFragment.getView();
                snoreMonitorStartedFragment.r(((CustomRoundProgressBar) (view == null ? null : view.findViewById(R.id.progress))).getProgress());
                View view2 = this.a.getView();
                ((CustomRoundProgressBar) (view2 != null ? view2.findViewById(R.id.progress) : null)).setProgress(0);
            }

            @Override // com.huami.snore.ui.fragment.SnoreMonitorStartedFragment.EasyAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                SnoreMonitorStartedFragment.EasyAnimatorListener.DefaultImpls.onAnimationEnd(this, animation);
                animation.removeListener(this);
                this.a.cancelScaleAnim();
                View view = this.a.getView();
                ((CustomRoundProgressBar) (view == null ? null : view.findViewById(R.id.progress))).setProgress(0);
                this.a.w();
            }

            @Override // com.huami.snore.ui.fragment.SnoreMonitorStartedFragment.EasyAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
                SnoreMonitorStartedFragment.EasyAnimatorListener.DefaultImpls.onAnimationRepeat(this, animator);
            }

            @Override // com.huami.snore.ui.fragment.SnoreMonitorStartedFragment.EasyAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                SnoreMonitorStartedFragment.EasyAnimatorListener.DefaultImpls.onAnimationStart(this, animator);
            }
        };
        View view = getView();
        u(view == null ? null : view.findViewById(R.id.progress), easyAnimatorListener);
    }

    private final void u(View target, Animator.AnimatorListener listener) {
        l().setTarget(target);
        l().setIntValues(0, 100);
        l().addListener(listener);
        l().start();
    }

    private final void v() {
        View view = getView();
        TextView textView = (TextView) (view == null ? null : view.findViewById(R.id.colons));
        if (textView == null) {
            return;
        }
        textView.startAnimation(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        SnoreHelper.instance.stopRecorder(getMActivity());
    }

    @Override // com.huami.snore.ui.base.BaseSnoreMonitorFragment
    public void _$_clearFindViewByIdCache() {
    }

    public final void cancelScaleAnim() {
        View view = getView();
        (view == null ? null : view.findViewById(R.id.scale)).setVisibility(8);
        if (n().hasStarted()) {
            View view2 = getView();
            View viewFindViewById = view2 != null ? view2.findViewById(R.id.scale) : null;
            if (viewFindViewById == null) {
                return;
            }
            viewFindViewById.clearAnimation();
        }
    }

    @Override // com.huami.snore.ui.base.BaseSnoreMonitorFragment
    @NotNull
    public View getContentView() {
        return LayoutInflater.from(getMActivity()).inflate(R.layout.fragment_snore_monitor_started_layout, (ViewGroup) null, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SnoreHelper snoreHelper = SnoreHelper.instance;
        AppCompatActivity mActivity = getMActivity();
        RecorderConfig recorderConfig = new RecorderConfig();
        recorderConfig.setTfModel(RecorderConfig.defaultModePath);
        recorderConfig.setChannels(1);
        Unit unit = Unit.INSTANCE;
        snoreHelper.startRecorder(mActivity, recorderConfig);
        LocalBroadcastManager.getInstance(getMActivity()).registerReceiver(this.mBroadcastReceiver, new IntentFilter(SnoreRecordService.SNORE_FINISH_ACTION));
        g();
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new e(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        w();
        LocalBroadcastManager.getInstance(getMActivity()).unregisterReceiver(this.mBroadcastReceiver);
        super.onDestroy();
    }

    @Override // com.huami.snore.ui.base.BaseSnoreMonitorFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view = getView();
        TextView textView = (TextView) (view == null ? null : view.findViewById(R.id.colons));
        if (textView != null) {
            textView.clearAnimation();
        }
        super.onDestroyView();
    }

    @Override // com.huami.snore.ui.base.BaseSnoreMonitorFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        o();
    }

    public final void startScaleAnim() {
        View view = getView();
        (view == null ? null : view.findViewById(R.id.scale)).setVisibility(0);
        View view2 = getView();
        (view2 != null ? view2.findViewById(R.id.scale) : null).startAnimation(n());
    }
}
