package com.xiaomi.hm.health.device.earbud.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.ui.view.HuaMiFontTextView;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rR\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/activity/HmEarbudBreathTrainActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "", "step", "o", b.r, DTransferConstants.SEARCH_KEY, GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "stopBreath", "", "x", "Lkotlin/Lazy;", "m", "()F", "scaleValue", "Landroid/os/Handler;", "y", "l", "()Landroid/os/Handler;", "handler", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudBreathTrainActivity extends BaseTitleActivity {
    private static final int A = 2;
    private static final int B = 3;
    private static final int z = 1;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy scaleValue = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy handler = LazyKt__LazyJVMKt.lazy(new Function0<HmEarbudBreathTrainActivity$handler$2.Handler1>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudBreathTrainActivity$handler$2

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/xiaomi/hm/health/device/earbud/activity/HmEarbudBreathTrainActivity$handler$2$Handler1", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "dispatchMessage", "<init>", "(Lcom/xiaomi/hm/health/device/earbud/activity/HmEarbudBreathTrainActivity;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Handler1 extends Handler {
            public final /* synthetic */ HmEarbudBreathTrainActivity a;

            public Handler1(@NotNull HmEarbudBreathTrainActivity hmEarbudBreathTrainActivity) {
                this.a = hmEarbudBreathTrainActivity;
            }

            @Override // android.os.Handler
            public void dispatchMessage(@NotNull Message msg) {
                if (this.a.isDestroyed()) {
                    return;
                }
                int i = msg.what;
                if (i == 1) {
                    this.a.o(msg.arg1);
                } else {
                    if (i != 2) {
                        return;
                    }
                    ((HuaMiFontTextView) this.a.findViewById(R.id.time_text)).setText(String.valueOf(msg.arg1));
                    Handler handlerL = this.a.l();
                    Message messageObtainMessage = this.a.l().obtainMessage(2);
                    int i2 = msg.arg1 - 1;
                    msg.arg1 = i2;
                    messageObtainMessage.arg1 = i2;
                    Unit unit = Unit.INSTANCE;
                    handlerL.sendMessageDelayed(messageObtainMessage, 1000L);
                }
            }
        }

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler1 invoke() {
            return new Handler1(this.a);
        }
    });

    @NotNull
    private static final int[] C = {4, 7, 8};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Float> {
        public a() {
            super(0);
        }

        public final float a() {
            float fDp2px = ViewUtils.dp2px(HmEarbudBreathTrainActivity.this, 90.0f);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            HmEarbudBreathTrainActivity.this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return e.coerceAtLeast(displayMetrics.heightPixels / fDp2px, displayMetrics.widthPixels / fDp2px);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(a());
        }
    }

    private final void initView() {
        Handler handlerL = l();
        Message messageObtainMessage = l().obtainMessage(1);
        messageObtainMessage.arg1 = 0;
        Unit unit = Unit.INSTANCE;
        handlerL.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler l() {
        return (Handler) this.handler.getValue();
    }

    private final float m() {
        return ((Number) this.scaleValue.getValue()).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
    private final void n(final int step) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        if (step != 0) {
            if (step != 2) {
                Handler handlerL = l();
                Message messageObtainMessage = l().obtainMessage(1);
                messageObtainMessage.arg1 = (step + 1) % 3;
                Unit unit = Unit.INSTANCE;
                handlerL.sendMessageDelayed(messageObtainMessage, ((long) C[step]) * 1000);
                animatorSet2 = null;
            } else {
                int i = R.id.scale_img;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((ImageView) findViewById(i), "scaleX", m(), 1.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((ImageView) findViewById(i), "scaleY", m(), 1.0f);
                animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(((long) C[step]) * 1000);
            }
            if (animatorSet2 == null) {
                return;
            }
            animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudBreathTrainActivity$setupAnim$2$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@Nullable Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@Nullable Animator animation) {
                    Handler handlerL2 = this.a.l();
                    Message messageObtainMessage2 = this.a.l().obtainMessage(1);
                    messageObtainMessage2.arg1 = (step + 1) % 3;
                    Unit unit2 = Unit.INSTANCE;
                    handlerL2.sendMessage(messageObtainMessage2);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@Nullable Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@Nullable Animator animation) {
                }
            });
            animatorSet2.start();
        }
        int i2 = R.id.scale_img;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat((ImageView) findViewById(i2), "scaleX", 1.0f, m());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat((ImageView) findViewById(i2), "scaleY", 1.0f, m());
        animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.setDuration(((long) C[step]) * 1000);
        animatorSet2 = animatorSet;
        if (animatorSet2 == null) {
            return;
        }
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudBreathTrainActivity$setupAnim$2$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animation) {
                Handler handlerL2 = this.a.l();
                Message messageObtainMessage2 = this.a.l().obtainMessage(1);
                messageObtainMessage2.arg1 = (step + 1) % 3;
                Unit unit2 = Unit.INSTANCE;
                handlerL2.sendMessage(messageObtainMessage2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@Nullable Animator animation) {
            }
        });
        animatorSet2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(int step) {
        p(step);
        q(step);
        n(step);
    }

    private final void p(int step) {
        ((TextView) findViewById(R.id.duration_text)).setText(getResources().getStringArray(R.array.earbud_breath_train)[step]);
        ((TextView) findViewById(R.id.duration_msg_text)).setText(getResources().getStringArray(R.array.earbud_breath_train_msg)[step]);
    }

    private final void q(int step) {
        ((HuaMiFontTextView) findViewById(R.id.time_text)).setVisibility(step == 1 ? 0 : 8);
        l().removeMessages(2);
        Handler handlerL = l();
        Message messageObtainMessage = l().obtainMessage(2);
        messageObtainMessage.arg1 = C[step];
        Unit unit = Unit.INSTANCE;
        handlerL.sendMessage(messageObtainMessage);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BaseTitleActivity.STYLE.NONE, 0, true);
        setContentView(R.layout.activity_earbud_breath_train);
        initView();
    }

    public final void stopBreath(@NotNull View view) {
        onBackPressed();
    }
}
