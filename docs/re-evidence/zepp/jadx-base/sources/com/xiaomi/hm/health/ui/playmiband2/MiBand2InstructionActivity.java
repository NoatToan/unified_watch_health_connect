package com.xiaomi.hm.health.ui.playmiband2;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseui.FramesSequenceAnimation;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.view.indicator.CirclePageIndicator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class MiBand2InstructionActivity extends BaseTitleActivity {
    private static final int A0 = 3;
    private static final int B0 = 1000;
    private static final int C0 = 1500;
    private static final int D0 = 2100;
    private static final int E0 = -1;
    public static final String EXTRA = "FullScreen";
    private static final int F0 = 0;
    private static final int G0 = 1;
    private static final int H0 = 2;
    private static final int I0 = 3;
    private static final int J0 = 4;
    private static final int[] K0 = {R.drawable.img_measure_heart_1, R.drawable.img_measure_heart_2, R.drawable.img_measure_heart_3, R.drawable.img_measure_heart_4, R.drawable.img_measure_heart_5, R.drawable.img_measure_heart_6};
    private static final int[] L0 = {R.drawable.lift_hand_1, R.drawable.lift_hand_2, R.drawable.lift_hand_3, R.drawable.lift_hand_4, R.drawable.lift_hand_5, R.drawable.lift_hand_6, R.drawable.lift_hand_7};
    private static final int[] M0 = {R.drawable.img_remind_1, R.drawable.img_remind_2, R.drawable.img_remind_3, R.drawable.img_remind_4, R.drawable.img_remind_5, R.drawable.img_remind_6, R.drawable.img_remind_7};
    private static final int[] N0 = {R.drawable.img_remind_sit_longtime_1, R.drawable.img_remind_sit_longtime_2, R.drawable.img_remind_sit_longtime_3, R.drawable.img_remind_sit_longtime_4, R.drawable.img_remind_sit_longtime_5, R.drawable.img_remind_sit_longtime_6, R.drawable.img_remind_sit_longtime_7, R.drawable.img_remind_sit_longtime_8, R.drawable.img_remind_sit_longtime_9, R.drawable.img_remind_sit_longtime_10_16_18, R.drawable.img_remind_sit_longtime_11_15_19, R.drawable.img_remind_sit_longtime_12_14_20, R.drawable.img_remind_sit_longtime_13_21, R.drawable.img_remind_sit_longtime_12_14_20, R.drawable.img_remind_sit_longtime_11_15_19, R.drawable.img_remind_sit_longtime_10_16_18, R.drawable.img_remind_sit_longtime_17, R.drawable.img_remind_sit_longtime_10_16_18, R.drawable.img_remind_sit_longtime_11_15_19, R.drawable.img_remind_sit_longtime_12_14_20, R.drawable.img_remind_sit_longtime_13_21};
    private static final String w0 = "MiBand2InstructionActivity";
    private static final int x0 = 0;
    private static final int y0 = 1;
    private static final int z0 = 2;
    private FramesSequenceAnimation R;
    private FramesSequenceAnimation t0;
    private FramesSequenceAnimation u0;
    private FramesSequenceAnimation v0;
    private List<Fragment> x = null;
    private int y = 0;
    private g z = null;
    private FrameLayout A = null;
    private ImageView B = null;
    private AlphaAnimation C = null;
    private ImageView D = null;
    private Animation E = null;
    private ImageView F = null;
    private ImageView G = null;
    private AnimationSet H = null;
    private Fragment03 I = null;
    private ImageView J = null;
    private ImageView K = null;
    private ImageView L = null;
    private ImageView M = null;
    private ImageView N = null;
    private ImageView O = null;
    private AnimationSet P = null;
    private AnimationSet Q = null;
    private AlphaAnimation S = null;
    private AlphaAnimation T = null;
    private ImageView U = null;
    private FrameLayout V = null;
    private Fragment04 W = null;
    private FrameLayout X = null;
    private ImageView Y = null;
    private ImageView Z = null;
    private ValueAnimator m0 = null;
    private String n0 = null;
    private String o0 = null;
    private String p0 = null;
    private String q0 = null;
    private String r0 = null;
    private boolean s0 = true;

    public static class Fragment01 extends Fragment {
        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
            View viewInflate = inflater.inflate(R.layout.activity_instruction_miband_page_1, container, false);
            ((TextView) viewInflate.findViewById(R.id.title)).setText(getString(R.string.install_band_correct, getString(R.string.mili_settting_mili_pro)));
            return viewInflate;
        }
    }

    public static class Fragment02 extends Fragment {
        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View viewInflate = inflater.inflate(R.layout.activity_instruction_miband_page_2, container, false);
            ((TextView) viewInflate.findViewById(R.id.more_info)).setText(getString(R.string.view_time_tips_2, getString(R.string.mili_settting_mili_pro)));
            return viewInflate;
        }
    }

    public static class Fragment03 extends Fragment {
        private TextView a = null;

        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View viewInflate = inflater.inflate(R.layout.activity_instruction_miband_page_3, container, false);
            this.a = (TextView) viewInflate.findViewById(R.id.measure_tips);
            return viewInflate;
        }

        public void setMeasureTipsText(String str) {
            TextView textView = this.a;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    public static class Fragment04 extends Fragment {
        private TextView a = null;
        private TextView b = null;

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                Fragment04.this.getContext().startActivity(new Intent(Fragment04.this.getContext(), (Class<?>) MiBand2IllustrationActivity.class));
            }
        }

        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View viewInflate = inflater.inflate(R.layout.activity_instruction_miband_page_4, container, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.more_info);
            this.a = textView;
            textView.setText(MiBand2InstructionActivity.fromHtml("<u>" + getString(R.string.more_icon_tips) + "</u>"));
            this.b = (TextView) viewInflate.findViewById(R.id.instruction_text);
            this.a.setOnClickListener(new a());
            return viewInflate;
        }

        public void setInstructionText(String text) {
            TextView textView = this.b;
            if (textView != null) {
                textView.setText(text);
            }
        }
    }

    public class a implements ViewPager.OnPageChangeListener {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            if (position == 3 && MiBand2InstructionActivity.this.s0) {
                Analytics.event(MiBand2InstructionActivity.this, StatEvent.EventId.INSTRUCTION_MIBAND2_BANDICON);
                MiBand2InstructionActivity.this.s0 = false;
            }
            MiBand2InstructionActivity.this.y = position;
            MiBand2InstructionActivity.this.a0(position);
            MiBand2InstructionActivity.this.d0(position);
            MiBand2InstructionActivity.this.b0(position);
            MiBand2InstructionActivity.this.c0(position);
        }
    }

    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (MiBand2InstructionActivity.this.y == 0) {
                MiBand2InstructionActivity.this.D.setVisibility(0);
                MiBand2InstructionActivity.this.D.startAnimation(MiBand2InstructionActivity.this.H);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (MiBand2InstructionActivity.this.y == 0) {
                MiBand2InstructionActivity.this.D.setVisibility(4);
                MiBand2InstructionActivity.this.B.setVisibility(4);
                MiBand2InstructionActivity.this.F.setVisibility(4);
                MiBand2InstructionActivity.this.G.setVisibility(0);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class d implements Animation.AnimationListener {
        public d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (MiBand2InstructionActivity.this.y == 2) {
                MiBand2InstructionActivity.this.J.setVisibility(4);
                MiBand2InstructionActivity.this.K.setVisibility(0);
                MiBand2InstructionActivity.this.R.start();
                MiBand2InstructionActivity.this.z.sendEmptyMessageDelayed(1, 300L);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            MiBand2InstructionActivity.this.Y.setAlpha(((Float) animation.getAnimatedValue()).floatValue());
        }
    }

    public class f extends FragmentPagerAdapter {
        public f(FragmentManager fm) {
            super(fm);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return MiBand2InstructionActivity.this.x.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int position) {
            return (Fragment) MiBand2InstructionActivity.this.x.get(position);
        }
    }

    public static class g extends Handler {
        public WeakReference<Activity> a;

        public g(MiBand2InstructionActivity activity) {
            this.a = null;
            this.a = new WeakReference<>(activity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            MiBand2InstructionActivity miBand2InstructionActivity = (MiBand2InstructionActivity) this.a.get();
            if (miBand2InstructionActivity != null) {
                int i = msg.what;
                if (i == -1) {
                    if (miBand2InstructionActivity.v0 != null) {
                        miBand2InstructionActivity.v0.stop();
                    }
                    if (miBand2InstructionActivity.u0 == null) {
                        miBand2InstructionActivity.u0 = new FramesSequenceAnimation(miBand2InstructionActivity.Z, MiBand2InstructionActivity.M0, new int[]{100, 100, 200, 200, 200, 200, 500}, true);
                    }
                    miBand2InstructionActivity.W.setInstructionText(miBand2InstructionActivity.r0);
                    miBand2InstructionActivity.u0.start();
                    sendEmptyMessageDelayed(0, 1500L);
                    return;
                }
                if (i == 0) {
                    if (miBand2InstructionActivity.u0 != null) {
                        miBand2InstructionActivity.u0.stop();
                    }
                    if (miBand2InstructionActivity.v0 == null) {
                        miBand2InstructionActivity.v0 = new FramesSequenceAnimation(miBand2InstructionActivity.Z, MiBand2InstructionActivity.N0, new int[]{100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100}, true);
                    }
                    miBand2InstructionActivity.v0.start();
                    miBand2InstructionActivity.W.setInstructionText(miBand2InstructionActivity.q0);
                    sendEmptyMessageDelayed(-1, 2100L);
                    return;
                }
                if (i == 1) {
                    miBand2InstructionActivity.I.setMeasureTipsText(miBand2InstructionActivity.n0);
                    miBand2InstructionActivity.O.setVisibility(4);
                    miBand2InstructionActivity.M.setVisibility(0);
                    miBand2InstructionActivity.M.startAnimation(miBand2InstructionActivity.T);
                    miBand2InstructionActivity.L.setVisibility(0);
                    miBand2InstructionActivity.L.startAnimation(miBand2InstructionActivity.Q);
                    sendEmptyMessageDelayed(2, 1400L);
                    return;
                }
                if (i == 2) {
                    miBand2InstructionActivity.I.setMeasureTipsText(miBand2InstructionActivity.o0);
                    miBand2InstructionActivity.L.setVisibility(4);
                    miBand2InstructionActivity.L.clearAnimation();
                    miBand2InstructionActivity.Q.cancel();
                    miBand2InstructionActivity.N.setVisibility(0);
                    miBand2InstructionActivity.N.startAnimation(miBand2InstructionActivity.S);
                    sendEmptyMessageDelayed(3, 800L);
                    return;
                }
                if (i == 3) {
                    miBand2InstructionActivity.I.setMeasureTipsText(miBand2InstructionActivity.n0);
                    miBand2InstructionActivity.N.setVisibility(4);
                    miBand2InstructionActivity.M.setVisibility(0);
                    miBand2InstructionActivity.L.setVisibility(0);
                    miBand2InstructionActivity.L.startAnimation(miBand2InstructionActivity.Q);
                    sendEmptyMessageDelayed(4, 1400L);
                    return;
                }
                if (i != 4) {
                    return;
                }
                miBand2InstructionActivity.I.setMeasureTipsText(miBand2InstructionActivity.p0);
                miBand2InstructionActivity.N.setVisibility(4);
                miBand2InstructionActivity.M.setVisibility(4);
                miBand2InstructionActivity.L.clearAnimation();
                miBand2InstructionActivity.L.setVisibility(4);
                miBand2InstructionActivity.O.setVisibility(0);
                sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    private void Z() {
        this.n0 = getResources().getString(R.string.hr_measuring);
        this.o0 = getResources().getString(R.string.measure_fail);
        this.p0 = getResources().getString(R.string.hr_measure_success);
        this.q0 = getResources().getString(R.string.long_sit);
        this.r0 = getResources().getString(R.string.day_step_reach_goal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(int position) {
        if (position != 0) {
            this.A.setVisibility(4);
            this.B.setVisibility(4);
            this.F.setVisibility(4);
            this.D.setVisibility(4);
            this.G.setVisibility(4);
            this.B.clearAnimation();
            this.D.clearAnimation();
            this.E.cancel();
            this.H.cancel();
            return;
        }
        if (this.C == null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            this.C = alphaAnimation;
            alphaAnimation.setDuration(1000L);
            this.C.setAnimationListener(new b());
        }
        if (this.H == null) {
            AnimationSet animationSet = new AnimationSet(true);
            this.H = animationSet;
            animationSet.setInterpolator(new LinearInterpolator());
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            this.E = alphaAnimation2;
            alphaAnimation2.setDuration(500L);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -ViewUtils.dp2px(this, 23.0f), 0.0f, -ViewUtils.dp2px(this, 8.0f));
            translateAnimation.setDuration(500L);
            translateAnimation.setStartOffset(500L);
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, -ViewUtils.dp2px(this, 15.0f), 0.0f, 0.0f);
            translateAnimation2.setDuration(600L);
            translateAnimation2.setStartOffset(1000L);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 5.0f, 0.5f, 0.5f);
            rotateAnimation.setDuration(600L);
            rotateAnimation.setStartOffset(1000L);
            TranslateAnimation translateAnimation3 = new TranslateAnimation(0.0f, -ViewUtils.dp2px(this, 13.0f), 0.0f, -ViewUtils.dp2px(this, 8.0f));
            translateAnimation3.setDuration(700L);
            translateAnimation3.setStartOffset(1600L);
            RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, 5.0f, 0.5f, 0.5f);
            rotateAnimation2.setDuration(500L);
            rotateAnimation2.setStartOffset(1600L);
            TranslateAnimation translateAnimation4 = new TranslateAnimation(0.0f, 0.0f, 0.0f, ViewUtils.dp2px(this, 4.0f));
            translateAnimation4.setDuration(500L);
            translateAnimation4.setStartOffset(1600L);
            RotateAnimation rotateAnimation3 = new RotateAnimation(0.0f, -10.0f, 1, 0.2f, 1, 0.7f);
            rotateAnimation3.setDuration(500L);
            rotateAnimation3.setStartOffset(2100L);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.05f, 1.0f, 1.05f, 0.5f, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setStartOffset(2100L);
            TranslateAnimation translateAnimation5 = new TranslateAnimation(0.0f, -ViewUtils.dp2px(this, 1.0f), 0.0f, -ViewUtils.dp2px(this, 8.0f));
            translateAnimation5.setDuration(500L);
            translateAnimation5.setStartOffset(2100L);
            this.H.addAnimation(this.E);
            this.H.addAnimation(translateAnimation);
            this.H.addAnimation(translateAnimation2);
            this.H.addAnimation(rotateAnimation);
            this.H.addAnimation(translateAnimation3);
            this.H.addAnimation(rotateAnimation2);
            this.H.addAnimation(translateAnimation4);
            this.H.addAnimation(rotateAnimation3);
            this.H.addAnimation(scaleAnimation);
            this.H.addAnimation(translateAnimation5);
            this.H.setAnimationListener(new c());
        }
        this.A.setVisibility(0);
        this.B.setVisibility(0);
        this.F.setVisibility(0);
        this.B.startAnimation(this.C);
        this.F.startAnimation(this.C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(int position) {
        if (2 == position) {
            this.I.setMeasureTipsText(this.n0);
            this.V.setVisibility(0);
            this.J.setVisibility(0);
            if (this.P == null) {
                AnimationSet animationSet = (AnimationSet) AnimationUtils.loadAnimation(this, R.anim.hr_alpha);
                this.P = animationSet;
                animationSet.setFillAfter(true);
                this.P.setAnimationListener(new d());
            }
            if (this.S == null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                this.S = alphaAnimation;
                alphaAnimation.setDuration(200L);
            }
            if (this.T == null) {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                this.T = alphaAnimation2;
                alphaAnimation2.setDuration(200L);
            }
            this.Q = (AnimationSet) AnimationUtils.loadAnimation(this, R.anim.hr_heart_scale);
            this.R = new FramesSequenceAnimation(this.K, K0, new int[]{50, 50, 50, 50, 50, 50}, false);
            this.J.startAnimation(this.P);
            return;
        }
        AnimationSet animationSet2 = this.P;
        if (animationSet2 != null) {
            animationSet2.cancel();
            this.J.clearAnimation();
        }
        AnimationSet animationSet3 = this.Q;
        if (animationSet3 != null) {
            animationSet3.cancel();
            this.L.clearAnimation();
        }
        FramesSequenceAnimation framesSequenceAnimation = this.R;
        if (framesSequenceAnimation != null) {
            framesSequenceAnimation.stop();
        }
        this.O.setVisibility(4);
        this.N.setVisibility(4);
        this.L.setVisibility(4);
        this.V.setVisibility(4);
        this.J.setVisibility(4);
        this.K.setVisibility(4);
        this.M.setVisibility(4);
        this.L.setVisibility(4);
        this.z.removeMessages(1);
        this.z.removeMessages(2);
        this.z.removeMessages(3);
        this.z.removeMessages(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int position) {
        HMLog.i(w0, "start reach goal remind animation", new Object[0]);
        if (3 != position) {
            this.z.removeMessages(-1);
            this.z.removeMessages(0);
            FramesSequenceAnimation framesSequenceAnimation = this.u0;
            if (framesSequenceAnimation != null) {
                framesSequenceAnimation.stop();
                this.u0 = null;
            }
            this.X.setVisibility(4);
            this.Z.setVisibility(4);
            return;
        }
        if (this.m0 == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.m0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new e());
            this.m0.setDuration(1000L);
        }
        this.X.setVisibility(0);
        this.Z.setVisibility(0);
        this.W.setInstructionText(this.r0);
        this.m0.start();
        this.z.sendEmptyMessage(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(int position) {
        if (1 != position) {
            this.t0.stop();
            this.U.clearAnimation();
            this.U.setVisibility(8);
        } else {
            this.U.setVisibility(0);
            FramesSequenceAnimation framesSequenceAnimation = new FramesSequenceAnimation(this.U, L0, new int[]{100, 100, 200, 200, 200, 200, 500}, false);
            this.t0 = framesSequenceAnimation;
            framesSequenceAnimation.start();
        }
    }

    private void findViews() {
        this.A = (FrameLayout) findViewById(R.id.install_band_container);
        this.B = (ImageView) findViewById(R.id.install_miband2);
        this.D = (ImageView) findViewById(R.id.mili_pro);
        this.F = (ImageView) findViewById(R.id.miband_inner);
        this.G = (ImageView) findViewById(R.id.install_done);
        this.U = (ImageView) findViewById(R.id.lift_wrist);
        this.V = (FrameLayout) findViewById(R.id.measure_hr_animation_container);
        this.J = (ImageView) findViewById(R.id.hand_img);
        this.K = (ImageView) findViewById(R.id.band_hr_img);
        this.M = (ImageView) findViewById(R.id.measuring);
        this.L = (ImageView) findViewById(R.id.red_heart);
        this.N = (ImageView) findViewById(R.id.measure_hr_fail);
        this.O = (ImageView) findViewById(R.id.measure_hr_success);
        this.Z = (ImageView) findViewById(R.id.remind_img);
        this.Y = (ImageView) findViewById(R.id.img_miband2);
        this.X = (FrameLayout) findViewById(R.id.remind_animation_container);
    }

    public static Spanned fromHtml(String source) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(source, 0) : Html.fromHtml(source);
    }

    private void initViews() {
        findViews();
        Z();
        a0(0);
        this.x = new ArrayList(4);
        Fragment01 fragment01 = new Fragment01();
        Fragment02 fragment02 = new Fragment02();
        this.I = new Fragment03();
        this.W = new Fragment04();
        this.x.add(fragment01);
        this.x.add(fragment02);
        this.x.add(this.I);
        this.x.add(this.W);
        f fVar = new f(getSupportFragmentManager());
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(fVar);
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) findViewById(R.id.indicator);
        circlePageIndicator.setViewPager(viewPager);
        circlePageIndicator.setOnPageChangeListener(new a());
    }

    public static void launch(Context context) {
        context.startActivity(new Intent(context, (Class<?>) MiBand2InstructionActivity.class));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miband_instruction);
        setStyle(BaseTitleActivity.STYLE.SINGLE_BACK, ContextCompat.getColor(this, R.color.common_light_color));
        if (getIntent().getBooleanExtra(EXTRA, false)) {
            HMLog.d(w0, "none style ", new Object[0]);
            getLeft().setVisibility(4);
        } else {
            HMLog.d(w0, "back style ", new Object[0]);
        }
        initViews();
        this.z = new g(this);
        Analytics.event(this, StatEvent.EventId.INSTRUCTION_MIBAND2);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.z.removeCallbacksAndMessages(null);
    }
}
