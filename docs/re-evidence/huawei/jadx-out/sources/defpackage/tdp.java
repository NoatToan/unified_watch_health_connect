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
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.uikit.hwcommon.anim.HwCubicBezierInterpolator;
import health.compact.a.LanguageUtil;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes17.dex */
public class tdp {
    private HealthCardView d;
    private LinearLayout g;
    private tdr i;
    private int j;
    private boolean l;
    private LinearLayout m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HwCubicBezierInterpolator f48998c = new HwCubicBezierInterpolator(0.38f, 1.33f, 0.6f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HwCubicBezierInterpolator f48997b = new HwCubicBezierInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
    private static final HwCubicBezierInterpolator e = new HwCubicBezierInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
    private Queue<tdr> k = new LinkedBlockingQueue();
    private e h = new e(this);
    private tdr f = new tdr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f48999a = BaseApplication.b();

    public tdp(LinearLayout linearLayout, LinearLayout linearLayout2, tdr tdrVar, HealthCardView healthCardView, boolean z) {
        this.g = linearLayout;
        this.m = linearLayout2;
        this.i = tdrVar;
        if (tdrVar != null) {
            this.j = tdrVar.d();
            this.f.d(tdrVar);
        }
        this.d = healthCardView;
        this.l = z;
    }

    public void c(boolean z) {
        this.l = z;
    }

    public void c(List<tdr> list, boolean z) {
        if (njy.e(list)) {
            LogUtil.j("MessageAnimationManager", "messageList is empty");
            return;
        }
        LogUtil.a("MessageAnimationManager", "messageList size = ", Integer.valueOf(list.size()));
        this.k.clear();
        this.k.addAll(list);
        LogUtil.a("MessageAnimationManager", "mMessageQueue size = ", Integer.valueOf(this.k.size()));
        if (this.h.hasMessages(1) || !z) {
            return;
        }
        this.h.sendEmptyMessageDelayed(1, 500L);
    }

    public void c() {
        LogUtil.a("MessageAnimationManager", "releaseManager");
        this.k.clear();
        this.h.removeCallbacksAndMessages(null);
        this.g.clearAnimation();
        this.m.clearAnimation();
    }

    public void e() {
        LogUtil.a("MessageAnimationManager", "stopAnimate");
        this.k.clear();
        this.h.removeCallbacksAndMessages(null);
        if (this.g.getAnimation() != null) {
            this.g.getAnimation().cancel();
        }
        if (this.m.getAnimation() != null) {
            this.m.getAnimation().cancel();
        }
        this.g.clearAnimation();
        this.m.clearAnimation();
        e(this.i, true);
    }

    public void d() {
        LogUtil.a("MessageAnimationManager", "startAnimate");
        if (this.k.isEmpty()) {
            return;
        }
        LogUtil.a("MessageAnimationManager", "startAnimate mMessageQueue has msg");
        if (this.h.hasMessages(1)) {
            return;
        }
        this.h.sendEmptyMessageDelayed(1, 500L);
    }

    public boolean b() {
        return (this.i == null || this.f.a() == null || !this.f.a().equals(this.i.a())) ? false : true;
    }

    public LinearLayout a() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(tdr tdrVar, boolean z) {
        if (tdrVar == null || this.f.equals(tdrVar)) {
            LogUtil.j("MessageAnimationManager", "initNextMessageView messageInfo is null or need not refresh");
            return;
        }
        LogUtil.a("MessageAnimationManager", "initNextMessageView, messageInfo:", tdrVar.a(), " isNeedAnimate:", Boolean.valueOf(z));
        this.f.d(tdrVar);
        LinearLayout linearLayout = (LinearLayout) this.m.findViewById(R.id.title_layout);
        ImageView imageView = (ImageView) this.m.findViewById(R.id.bottom_step_icon);
        HealthTextView healthTextView = (HealthTextView) this.m.findViewById(R.id.bottom_step_text);
        HealthTextView healthTextView2 = (HealthTextView) this.m.findViewById(R.id.bottom_step_value);
        HealthTextView healthTextView3 = (HealthTextView) this.m.findViewById(R.id.divider_line_text);
        if (linearLayout == null || healthTextView3 == null) {
            LogUtil.j("MessageAnimationManager", "initNextMessageView, titleLayout is null");
            return;
        }
        imageView.setBackground(tdrVar.b());
        healthTextView.setText(tdrVar.a());
        if (TextUtils.isEmpty(tdrVar.j())) {
            healthTextView2.setVisibility(8);
        } else {
            healthTextView2.setVisibility(0);
        }
        healthTextView2.setText(tdrVar.j());
        if (tdrVar.e() != 0) {
            float dimension = this.f48999a.getResources().getDimension(tdrVar.e());
            healthTextView.setTextSize(0, dimension);
            healthTextView2.setTextSize(0, dimension);
        }
        if (tdrVar.f() != null) {
            Drawable drawableF = tdrVar.f();
            drawableF.setBounds(0, 0, this.f48999a.getResources().getDimensionPixelSize(R.dimen.health_common_12dp), this.f48999a.getResources().getDimensionPixelSize(R.dimen.health_common_12dp));
            healthTextView.setCompoundDrawablesRelative(null, null, drawableF, null);
            healthTextView.setCompoundDrawablePadding(this.f48999a.getResources().getDimensionPixelSize(R.dimen.health_common_2dp));
        } else {
            healthTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (!this.l) {
            if (!TextUtils.isEmpty(tdrVar.j()) && !LanguageUtil.f(this.f48999a) && tdrVar != this.i) {
                healthTextView3.setVisibility(0);
            } else {
                healthTextView3.setVisibility(8);
            }
            healthTextView.setMaxLines(1);
            healthTextView2.setMaxLines(1);
            this.m.setOrientation(0);
        } else if (!TextUtils.isEmpty(tdrVar.j())) {
            this.m.setOrientation(1);
        } else {
            healthTextView.setMaxLines(2);
            this.m.setOrientation(0);
        }
        this.m.setOnClickListener(tdrVar.c());
        healthTextView2.setOnClickListener(tdrVar.c());
        a(tdrVar.d(), z);
        if (!TextUtils.isEmpty(tdrVar.g()) && tdrVar.h() != null) {
            lmf.d().c(this.f48999a, tdrVar.g(), tdrVar.h(), 0);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        if (tdrVar == this.i) {
            layoutParams.setMargins(0, this.f48999a.getResources().getDimensionPixelOffset(R.dimen.health_common_2sp), 0, 0);
        } else {
            layoutParams.setMargins(0, 0, 0, 0);
        }
        linearLayout.setLayoutParams(layoutParams);
        LogUtil.a("MessageAnimationManager", "initNextMessageView end");
    }

    private void a(int i, boolean z) {
        if (z) {
            this.m.setVisibility(0);
            a(this.g, this.m, i);
        } else {
            this.h.removeMessages(2);
            this.d.setCardBackgroundColor(this.f48999a.getColor(i));
            this.j = i;
        }
        LinearLayout linearLayout = this.g;
        this.g = this.m;
        this.m = linearLayout;
        linearLayout.setVisibility(8);
        this.g.setVisibility(0);
        LogUtil.a("MessageAnimationManager", "startChange end");
    }

    private void a(LinearLayout linearLayout, LinearLayout linearLayout2, final int i) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, linearLayout.getWidth() / 2.0f, 0.0f);
        HwCubicBezierInterpolator hwCubicBezierInterpolator = e;
        scaleAnimation.setInterpolator(hwCubicBezierInterpolator);
        scaleAnimation.setRepeatCount(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, linearLayout.getHeight() * 1.5f);
        translateAnimation.setInterpolator(hwCubicBezierInterpolator);
        translateAnimation.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        HwCubicBezierInterpolator hwCubicBezierInterpolator2 = f48997b;
        alphaAnimation.setInterpolator(hwCubicBezierInterpolator2);
        alphaAnimation.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        AnimationSet animationSetA = a(linearLayout, linearLayout2);
        animationSetA.setAnimationListener(new Animation.AnimationListener() { // from class: tdp.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                LogUtil.a("MessageAnimationManager", "animationInSet end");
                tdp.this.g.setAlpha(1.0f);
                tdp.this.m.setAlpha(1.0f);
            }
        });
        linearLayout.startAnimation(animationSet);
        linearLayout2.startAnimation(animationSetA);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f48999a.getResources().getColor(this.j)), Integer.valueOf(this.f48999a.getResources().getColor(i)));
        valueAnimatorOfObject.setDuration(250L);
        valueAnimatorOfObject.setRepeatCount(0);
        valueAnimatorOfObject.setInterpolator(hwCubicBezierInterpolator2);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tdw
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f49010b.c(i, valueAnimator);
            }
        });
        valueAnimatorOfObject.start();
        this.h.removeMessages(2);
        Message messageObtainMessage = this.h.obtainMessage(2);
        messageObtainMessage.arg1 = i;
        this.h.sendMessageDelayed(messageObtainMessage, 250L);
    }

    /* synthetic */ void c(int i, ValueAnimator valueAnimator) {
        this.d.setCardBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.j = i;
    }

    private AnimationSet a(LinearLayout linearLayout, LinearLayout linearLayout2) {
        int width = linearLayout2.getWidth();
        if (width == 0) {
            width = linearLayout.getWidth();
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.7f, 1.0f, 0.7f, 1.0f, width / 2.0f, 0.0f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(0);
        HwCubicBezierInterpolator hwCubicBezierInterpolator = f48998c;
        scaleAnimation.setInterpolator(hwCubicBezierInterpolator);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -(linearLayout.getHeight() * 1.5f), 0.0f);
        translateAnimation.setDuration(400L);
        translateAnimation.setRepeatCount(0);
        translateAnimation.setInterpolator(hwCubicBezierInterpolator);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setRepeatCount(0);
        alphaAnimation.setInterpolator(f48997b);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    static class e extends BaseHandler<tdp> {
        e(tdp tdpVar) {
            super(tdpVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(tdp tdpVar, Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                tdpVar.d.setCardBackgroundColor(BaseApplication.b().getColor(message.arg1));
                return;
            }
            LogUtil.a("MessageAnimationManager", "AnimationHandler CHANGE_MESSAGE_MSG");
            if (tdpVar.k.isEmpty()) {
                tdpVar.e(tdpVar.i, true);
                return;
            }
            tdr tdrVar = (tdr) tdpVar.k.poll();
            while (tdrVar == null && !tdpVar.k.isEmpty()) {
                tdrVar = (tdr) tdpVar.k.poll();
            }
            if (tdrVar != null) {
                LogUtil.a("MessageAnimationManager", "AnimationHandler mMessageQueue size=", Integer.valueOf(tdpVar.k.size()));
                tdpVar.e(tdrVar, true);
                sendEmptyMessageDelayed(1, 5000L);
                return;
            }
            sendEmptyMessage(1);
        }
    }
}
