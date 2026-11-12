package com.huami.module.homepage.sync.view.refresh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.R;
import com.huami.module.homepage.databinding.HomepageToastBinding;
import com.huami.module.ktx.NumberExtKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bJ\u0016\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/huami/module/homepage/sync/view/refresh/ToastAnimation;", "Landroid/widget/PopupWindow;", "", "b", "", "a", "c", "destroy", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "exitListener", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "message", "show", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/huami/module/homepage/databinding/HomepageToastBinding;", "Lcom/huami/module/homepage/databinding/HomepageToastBinding;", "binding", "Landroid/animation/AnimatorSet;", GoogleApiAvailabilityLight.a, "Landroid/animation/AnimatorSet;", "enterAnimator", "e", "exitAnimator", "f", "Z", "isDestroy", "g", "Lkotlin/jvm/functions/Function0;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;)V", "h", "homePage_release"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"InflateParams"})
public final class ToastAnimation extends PopupWindow {

    @Deprecated
    public static final long ANIM_DELAY_TIMES = 1500;

    @Deprecated
    public static final long ANIM_DURATION_300 = 300;

    @Deprecated
    public static final long ANIM_DURATION_500 = 500;

    @Deprecated
    public static final float TRANSLATION_Y = -10.0f;

    @NotNull
    private static final a h = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private HomepageToastBinding binding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private AnimatorSet enterAnimator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private AnimatorSet exitAnimator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isDestroy;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> exitListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"com/huami/module/homepage/sync/view/refresh/ToastAnimation$a", "", "", "ANIM_DELAY_TIMES", "J", "ANIM_DURATION_300", "ANIM_DURATION_500", "", "TRANSLATION_Y", "F", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ToastAnimation(@NotNull Context context, @NotNull LifecycleOwner lifecycleOwner) {
        super(context);
        this.context = context;
        this.lifecycleOwner = lifecycleOwner;
        HomepageToastBinding homepageToastBindingInflate = HomepageToastBinding.inflate(LayoutInflater.from(context), null, false);
        this.binding = homepageToastBindingInflate;
        setContentView(homepageToastBindingInflate.getRoot());
        setBackgroundDrawable(new ColorDrawable(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a() {
        Context context = this.context;
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        return (fragmentActivity == null || fragmentActivity.isFinishing()) ? false : true;
    }

    @SuppressLint({"Recycle"})
    private final void b() {
        if (this.enterAnimator == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.binding.homepageToastTv, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(500L);
            Unit unit = Unit.INSTANCE;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.binding.homepageToastTv, "translationY", NumberExtKt.getDp(-10.0f), 0.0f);
            objectAnimatorOfFloat2.setDuration(300L);
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.huami.module.homepage.sync.view.refresh.ToastAnimation$enterAnimator$1$3

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.module.homepage.sync.view.refresh.ToastAnimation$enterAnimator$1$3$onAnimationEnd$1", f = "ToastAnimation.kt", i = {}, l = {78, 79}, m = "invokeSuspend", n = {}, s = {})
                public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ ToastAnimation b;

                    /* JADX INFO: renamed from: com.huami.module.homepage.sync.view.refresh.ToastAnimation$enterAnimator$1$3$a$a, reason: collision with other inner class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "com.huami.module.homepage.sync.view.refresh.ToastAnimation$enterAnimator$1$3$onAnimationEnd$1$1", f = "ToastAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C0491a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public int a;
                        public final /* synthetic */ ToastAnimation b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C0491a(ToastAnimation toastAnimation, Continuation<? super C0491a> continuation) {
                            super(2, continuation);
                            this.b = toastAnimation;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new C0491a(this.b, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((C0491a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                            if (this.a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            if (this.b.a()) {
                                this.b.c();
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(ToastAnimation toastAnimation, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.b = toastAnimation;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new a(this.b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                        int i = this.a;
                        if (i != 0) {
                            if (i == 1) {
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
                        this.a = 1;
                        if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        C0491a c0491a = new C0491a(this.b, null);
                        this.a = 2;
                        if (BuildersKt.withContext(main, c0491a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@Nullable Animator animation) {
                    e.f(LifecycleOwnerKt.getLifecycleScope(this.a.lifecycleOwner), null, null, new a(this.a, null), 3, null);
                }
            });
            this.enterAnimator = animatorSet;
        }
        this.enterAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        if (this.exitAnimator == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.binding.homepageToastTv, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.binding.homepageToastTv, "translationY", 0.0f, -10.0f));
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.huami.module.homepage.sync.view.refresh.ToastAnimation$exitAnimator$1$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@Nullable Animator animation) {
                    Function0 function0 = this.a.exitListener;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    if (this.a.a()) {
                        this.a.dismiss();
                    }
                }
            });
            Unit unit = Unit.INSTANCE;
            this.exitAnimator = animatorSet;
        }
        this.exitAnimator.start();
    }

    public final void destroy() {
        this.isDestroy = true;
        AnimatorSet animatorSet = this.enterAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.exitAnimator;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        if (isShowing()) {
            dismiss();
        }
    }

    public final void exitListener(@Nullable Function0<Unit> block) {
        this.exitListener = block;
    }

    public final void show(@NotNull View view, @NotNull String message) {
        if (this.lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) && !this.isDestroy) {
            Triple tripleA = ToastAnimationKt.a(message);
            setWidth(((Number) tripleA.getFirst()).intValue());
            setHeight(((Number) tripleA.getSecond()).intValue());
            TextView textView = this.binding.homepageToastTv;
            textView.setText(message);
            textView.setBackground(ContextCompat.getDrawable(textView.getContext(), ((Boolean) tripleA.getThird()).booleanValue() ? R.drawable.homepage_toast_bg_big : R.drawable.homepage_toast_bg_small));
            showAsDropDown(view, (Resources.getSystem().getDisplayMetrics().widthPixels - getWidth()) / 2, NumberExtKt.getDp(90) - NumberExtKt.getDp(240), 17);
            b();
        }
    }
}
