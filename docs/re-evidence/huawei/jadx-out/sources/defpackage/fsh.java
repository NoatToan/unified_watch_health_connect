package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.TextUtils;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.uikit.hwcommon.anim.HwCubicBezierInterpolator;
import health.compact.a.LanguageUtil;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes7.dex */
public class fsh {
    private HealthCardView e;
    private int h;
    private fsg i;
    private LinearLayout j;
    private boolean k;
    private LinearLayout l;
    private static final HwCubicBezierInterpolator d = new HwCubicBezierInterpolator(0.38f, 1.33f, 0.6f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HwCubicBezierInterpolator f34475a = new HwCubicBezierInterpolator(0.33f, 0.0f, 0.67f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HwCubicBezierInterpolator f34476c = new HwCubicBezierInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
    private Queue<fsg> n = new LinkedBlockingQueue();
    private e g = new e(this);
    private fsg f = new fsg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f34477b = BaseApplication.b();

    public fsh(LinearLayout linearLayout, LinearLayout linearLayout2, fsg fsgVar, HealthCardView healthCardView, boolean z) {
        this.j = linearLayout;
        this.l = linearLayout2;
        this.i = fsgVar;
        if (fsgVar != null) {
            this.h = fsgVar.e();
            this.f.b(fsgVar);
        }
        this.e = healthCardView;
        this.k = z;
    }

    public void d(boolean z) {
        this.k = z;
    }

    public void e(List<fsg> list, boolean z) {
        if (njy.e(list)) {
            LogUtil.j("MessageAnimationManager", "messageList is empty");
            return;
        }
        LogUtil.a("MessageAnimationManager", "messageList size = ", Integer.valueOf(list.size()));
        this.n.clear();
        this.n.addAll(list);
        LogUtil.a("MessageAnimationManager", "mMessageQueue size = ", Integer.valueOf(this.n.size()));
        if (this.g.hasMessages(1) || !z) {
            return;
        }
        this.g.sendEmptyMessageDelayed(1, 500L);
    }

    public void d() {
        LogUtil.a("MessageAnimationManager", "releaseManager");
        this.n.clear();
        this.g.removeCallbacksAndMessages(null);
        this.j.clearAnimation();
        this.l.clearAnimation();
    }

    public void c() {
        LogUtil.a("MessageAnimationManager", "stopAnimate");
        this.n.clear();
        this.g.removeCallbacksAndMessages(null);
        if (this.j.getAnimation() != null) {
            this.j.getAnimation().cancel();
        }
        if (this.l.getAnimation() != null) {
            this.l.getAnimation().cancel();
        }
        this.j.clearAnimation();
        this.l.clearAnimation();
        d(this.i, true);
    }

    public void e() {
        LogUtil.a("MessageAnimationManager", "startAnimate");
        if (this.n.isEmpty()) {
            return;
        }
        LogUtil.a("MessageAnimationManager", "startAnimate mMessageQueue has msg");
        if (this.g.hasMessages(1)) {
            return;
        }
        this.g.sendEmptyMessageDelayed(1, 500L);
    }

    public boolean a() {
        return (this.i == null || this.f.a() == null || !this.f.a().equals(this.i.a())) ? false : true;
    }

    public LinearLayout b() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(fsg fsgVar, boolean z) {
        if (fsgVar == null || this.f.equals(fsgVar)) {
            LogUtil.j("MessageAnimationManager", "initNextMessageView messageInfo is null or need not refresh");
            return;
        }
        LogUtil.a("MessageAnimationManager", "initNextMessageView, messageInfo:", fsgVar.a(), " isNeedAnimate:", Boolean.valueOf(z));
        this.f.b(fsgVar);
        LinearLayout linearLayout = (LinearLayout) this.l.findViewById(R.id.title_layout);
        ImageView imageView = (ImageView) this.l.findViewById(R.id.bottom_step_icon);
        HealthTextView healthTextView = (HealthTextView) this.l.findViewById(R.id.bottom_step_text);
        HealthTextView healthTextView2 = (HealthTextView) this.l.findViewById(R.id.bottom_step_value);
        HealthTextView healthTextView3 = (HealthTextView) this.l.findViewById(R.id.divider_line_text);
        if (linearLayout == null || healthTextView3 == null) {
            LogUtil.j("MessageAnimationManager", "initNextMessageView, titleLayout is null");
            return;
        }
        imageView.setBackground(fsgVar.c());
        healthTextView.setText(fsgVar.a());
        if (TextUtils.isEmpty(fsgVar.i())) {
            healthTextView2.setVisibility(8);
        } else {
            healthTextView2.setVisibility(0);
        }
        healthTextView2.setText(fsgVar.i());
        if (fsgVar.d() != 0) {
            float dimension = this.f34477b.getResources().getDimension(fsgVar.d());
            healthTextView.setTextSize(0, dimension);
            healthTextView2.setTextSize(0, dimension);
        }
        if (fsgVar.f() != null) {
            Drawable drawableF = fsgVar.f();
            drawableF.setBounds(0, 0, this.f34477b.getResources().getDimensionPixelSize(R.dimen.health_common_12dp), this.f34477b.getResources().getDimensionPixelSize(R.dimen.health_common_12dp));
            healthTextView.setCompoundDrawablesRelative(null, null, drawableF, null);
            healthTextView.setCompoundDrawablePadding(this.f34477b.getResources().getDimensionPixelSize(R.dimen.health_common_2dp));
        } else {
            healthTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        d(fsgVar, healthTextView3, healthTextView, healthTextView2);
        this.l.setOnClickListener(fsgVar.b());
        healthTextView2.setOnClickListener(fsgVar.b());
        c(fsgVar.e(), z);
        if (!TextUtils.isEmpty(fsgVar.g()) && fsgVar.h() != null) {
            lmf.d().c(this.f34477b, fsgVar.g(), fsgVar.h(), 0);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        if (fsgVar == this.i) {
            layoutParams.setMargins(0, this.f34477b.getResources().getDimensionPixelOffset(R.dimen.health_common_2sp), 0, 0);
        } else {
            layoutParams.setMargins(0, 0, 0, 0);
        }
        linearLayout.setLayoutParams(layoutParams);
        LogUtil.a("MessageAnimationManager", "initNextMessageView end");
    }

    private void d(fsg fsgVar, HealthTextView healthTextView, HealthTextView healthTextView2, HealthTextView healthTextView3) {
        if (!this.k) {
            if (!TextUtils.isEmpty(fsgVar.i()) && !LanguageUtil.f(this.f34477b) && fsgVar != this.i) {
                healthTextView.setVisibility(0);
            } else {
                healthTextView.setVisibility(8);
            }
            healthTextView2.setMaxLines(1);
            healthTextView3.setMaxLines(1);
            this.l.setOrientation(0);
            return;
        }
        if (!TextUtils.isEmpty(fsgVar.i())) {
            this.l.setOrientation(1);
        } else {
            healthTextView2.setMaxLines(2);
            this.l.setOrientation(0);
        }
    }

    private void c(int i, boolean z) {
        if (z) {
            this.l.setVisibility(0);
            c(this.j, this.l, i);
        } else {
            this.g.removeMessages(2);
            this.e.setCardBackgroundColor(this.f34477b.getColor(i));
            this.h = i;
        }
        LinearLayout linearLayout = this.j;
        this.j = this.l;
        this.l = linearLayout;
        linearLayout.setVisibility(8);
        this.j.setVisibility(0);
        LogUtil.a("MessageAnimationManager", "startChange end");
    }

    private void c(LinearLayout linearLayout, LinearLayout linearLayout2, final int i) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, linearLayout.getWidth() / 2.0f, 0.0f);
        HwCubicBezierInterpolator hwCubicBezierInterpolator = f34476c;
        scaleAnimation.setInterpolator(hwCubicBezierInterpolator);
        scaleAnimation.setRepeatCount(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, linearLayout.getHeight() * 1.5f);
        translateAnimation.setInterpolator(hwCubicBezierInterpolator);
        translateAnimation.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        HwCubicBezierInterpolator hwCubicBezierInterpolator2 = f34475a;
        alphaAnimation.setInterpolator(hwCubicBezierInterpolator2);
        alphaAnimation.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        AnimationSet animationSetC = c(linearLayout, linearLayout2);
        animationSetC.setAnimationListener(new Animation.AnimationListener() { // from class: fsh.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                LogUtil.a("MessageAnimationManager", "animationInSet end");
                fsh.this.j.setAlpha(1.0f);
                fsh.this.l.setAlpha(1.0f);
            }
        });
        linearLayout.startAnimation(animationSet);
        linearLayout2.startAnimation(animationSetC);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f34477b.getResources().getColor(this.h)), Integer.valueOf(this.f34477b.getResources().getColor(i)));
        valueAnimatorOfObject.setDuration(250L);
        valueAnimatorOfObject.setRepeatCount(0);
        valueAnimatorOfObject.setInterpolator(hwCubicBezierInterpolator2);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fsm
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f34485b.d(i, valueAnimator);
            }
        });
        valueAnimatorOfObject.start();
        this.g.removeMessages(2);
        Message messageObtainMessage = this.g.obtainMessage(2);
        messageObtainMessage.arg1 = i;
        this.g.sendMessageDelayed(messageObtainMessage, 250L);
    }

    /* synthetic */ void d(int i, ValueAnimator valueAnimator) {
        this.e.setCardBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.h = i;
    }

    private AnimationSet c(LinearLayout linearLayout, LinearLayout linearLayout2) {
        int width = linearLayout2.getWidth();
        if (width == 0) {
            width = linearLayout.getWidth();
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.7f, 1.0f, 0.7f, 1.0f, width / 2.0f, 0.0f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(0);
        HwCubicBezierInterpolator hwCubicBezierInterpolator = d;
        scaleAnimation.setInterpolator(hwCubicBezierInterpolator);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -(linearLayout.getHeight() * 1.5f), 0.0f);
        translateAnimation.setDuration(400L);
        translateAnimation.setRepeatCount(0);
        translateAnimation.setInterpolator(hwCubicBezierInterpolator);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setRepeatCount(0);
        alphaAnimation.setInterpolator(f34475a);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    static class e extends BaseHandler<fsh> {
        e(fsh fshVar) {
            super(fshVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(fsh fshVar, Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                fshVar.e.setCardBackgroundColor(BaseApplication.b().getColor(message.arg1));
                return;
            }
            LogUtil.a("MessageAnimationManager", "AnimationHandler CHANGE_MESSAGE_MSG");
            if (fshVar.n.isEmpty()) {
                fshVar.d(fshVar.i, true);
                return;
            }
            fsg fsgVar = (fsg) fshVar.n.poll();
            while (fsgVar == null && !fshVar.n.isEmpty()) {
                fsgVar = (fsg) fshVar.n.poll();
            }
            if (fsgVar != null) {
                LogUtil.a("MessageAnimationManager", "AnimationHandler mMessageQueue size=", Integer.valueOf(fshVar.n.size()));
                fshVar.d(fsgVar, true);
                sendEmptyMessageDelayed(1, 5000L);
                return;
            }
            sendEmptyMessage(1);
        }
    }
}
