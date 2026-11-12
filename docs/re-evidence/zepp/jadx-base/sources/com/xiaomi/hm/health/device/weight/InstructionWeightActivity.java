package com.xiaomi.hm.health.device.weight;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.view.RippleBackground;
import com.xiaomi.hm.health.view.indicator.PageIndicator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class InstructionWeightActivity extends BaseTitleActivity {
    private static final int Y = 0;
    private static final int Z = 1;
    private static final int m0 = 2;
    private static final int n0 = 3;
    private static final int o0 = 4;
    private static final int p0 = 5;
    private static final int q0 = 0;
    private static final int r0 = 1;
    private static final int s0 = 2;
    private static final int t0 = 3;
    private static final int u0 = 4;
    private static final int v0 = 5;
    private static String w0 = "InstructionWeightActivity";
    private static h x0;
    private ArrayList<Fragment> A;
    private int B;
    private RippleBackground C;
    private View D;
    private View E;
    private View F;
    private ImageView G;
    private ImageView H;
    private ImageView I;
    private ImageView J;
    private ImageView K;
    private ImageView L;
    private ImageView M;
    private ImageView N;
    private ImageView O;
    private ImageView P;
    private ImageView Q;
    private View R;
    private ImageView S;
    private View T;
    private View U;
    private View V;
    private View W;
    private int X = -1;
    public ImageView foot;
    public RelativeLayout.LayoutParams params;
    private ViewPager x;
    private PageIndicator y;
    private g z;

    public static class InstructionWeightBasePage extends Fragment {
        public TextView title;
        public View titleInfo;

        public void initWeightInfo(View view, i iVar) {
            this.titleInfo = view.findViewById(R.id.instruction_weight_info);
            TextView textView = (TextView) view.findViewById(R.id.instruction_weight_title);
            this.title = textView;
            textView.setText(iVar.a);
            ((TextView) view.findViewById(R.id.instruction_weight_tips1)).setText(iVar.b);
            ((TextView) view.findViewById(R.id.instruction_weight_tips2)).setText(iVar.c);
        }
    }

    public static class InstructionWeightPage1 extends InstructionWeightBasePage {
        public void initView(View view) {
            initWeightInfo(view, new i(getActivity(), R.string.instruction_weight_title_2, R.string.instruction_weight_tips1_2, R.string.instruction_weight_tips2_2));
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.activity_instruction_weight_page_1, viewGroup, false);
            initView(viewInflate);
            return viewInflate;
        }
    }

    public static class InstructionWeightPage2 extends InstructionWeightBasePage {
        public void initView(View view) {
            initWeightInfo(view, new i(getActivity().getString(R.string.instruction_weight_title_1), getActivity().getString(R.string.instruction_weight_tips1_1, new Object[]{getString(R.string.weight_setting_weight)}), null));
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.activity_instruction_weight_page_1, viewGroup, false);
            initView(viewInflate);
            return viewInflate;
        }
    }

    public static class InstructionWeightPage3 extends InstructionWeightBasePage {
        public void initView(View view) {
            initWeightInfo(view, new i(getActivity(), R.string.instruction_weight_title_4, R.string.instruction_weight_tips1_4, R.string.instruction_weight_tips2_4));
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.activity_instruction_weight_page_1, viewGroup, false);
            initView(viewInflate);
            return viewInflate;
        }
    }

    public static class InstructionWeightPage4 extends InstructionWeightBasePage {
        public void initView(View view) {
            initWeightInfo(view, new i(getActivity(), R.string.instruction_weight_title_5, R.string.instruction_weight_tips1_5, R.string.instruction_weight_tips2_5));
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.activity_instruction_weight_page_1, viewGroup, false);
            initView(viewInflate);
            return viewInflate;
        }
    }

    public static class InstructionWeightPage5 extends InstructionWeightBasePage {
        public void initView(View view) {
            initWeightInfo(view, new i(getActivity(), R.string.instruction_weight_title_3, R.string.instruction_weight_tips1_3, 0));
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.activity_instruction_weight_page_1, viewGroup, false);
            initView(viewInflate);
            return viewInflate;
        }
    }

    public static class InstructionWeightPage6 extends InstructionWeightBasePage {
        public void initView(View view) {
            initWeightInfo(view, new i(getActivity(), R.string.instruction_weight_title_6, R.string.instruction_weight1_tips1_6, R.string.instruction_weight1_tips2_6));
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R.layout.activity_instruction_weight_page_1, viewGroup, false);
            initView(viewInflate);
            return viewInflate;
        }
    }

    public class a implements ViewPager.OnPageChangeListener {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            HMLog.d(InstructionWeightActivity.w0, " Scroll state :" + i, new Object[0]);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            InstructionWeightActivity.this.O(i, Float.valueOf(f));
            InstructionWeightActivity.this.N(i, f);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            InstructionWeightActivity.this.B = i;
            HMLog.d(InstructionWeightActivity.w0, "selected  ---> position : " + i, new Object[0]);
            InstructionWeightActivity.this.M(i);
            InstructionWeightActivity.this.J(i);
            InstructionWeightActivity.this.L(i);
            InstructionWeightActivity.this.I(i);
            InstructionWeightActivity.this.X = i;
            HMLog.d(InstructionWeightActivity.w0, "selected  ---> lastPager : " + InstructionWeightActivity.this.X, new Object[0]);
        }
    }

    public class b implements Animation.AnimationListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ Animation b;

        public b(View view, Animation animation) {
            this.a = view;
            this.b = animation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.startAnimation(this.b);
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
            InstructionWeightActivity.x0.sendEmptyMessage(4);
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
            InstructionWeightActivity.x0.sendEmptyMessage(1);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            InstructionWeightActivity.this.D.setVisibility(4);
        }
    }

    public class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InstructionWeightActivity.x0.sendEmptyMessage(2);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class f implements Animation.AnimationListener {

        public class a implements Animation.AnimationListener {
            public final /* synthetic */ Animation a;

            public a(Animation animation) {
                this.a = animation;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                InstructionWeightActivity.x0.sendEmptyMessageDelayed(5, this.a.getDuration());
            }
        }

        public f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InstructionWeightActivity.this.foot.setVisibility(0);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 0.28f);
            translateAnimation.setDuration(1000L);
            translateAnimation.setFillAfter(true);
            translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            translateAnimation.setAnimationListener(new a(translateAnimation));
            InstructionWeightActivity.this.foot.startAnimation(translateAnimation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            InstructionWeightActivity.this.S.setVisibility(0);
            InstructionWeightActivity.this.foot.clearAnimation();
            InstructionWeightActivity.this.foot.setVisibility(4);
        }
    }

    public class g extends FragmentPagerAdapter {
        public g(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return InstructionWeightActivity.this.A.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            return (Fragment) InstructionWeightActivity.this.A.get(i);
        }
    }

    public static class h extends Handler {
        public WeakReference<InstructionWeightActivity> a;

        public h(InstructionWeightActivity instructionWeightActivity) {
            this.a = new WeakReference<>(instructionWeightActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            InstructionWeightActivity instructionWeightActivity = this.a.get();
            if (instructionWeightActivity == null) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                if (instructionWeightActivity.B != 4) {
                    return;
                }
                HMLog.d(InstructionWeightActivity.w0, " handle MESSAGE_MAGNIFY_-------ALPHA------_ANIM", new Object[0]);
                instructionWeightActivity.P();
                return;
            }
            if (i == 2) {
                if (instructionWeightActivity.B != 4) {
                    return;
                }
                HMLog.d(InstructionWeightActivity.w0, " handle MESSAGE_MAGNIFY_-------SWIPE------_ANIM", new Object[0]);
                instructionWeightActivity.R(instructionWeightActivity.L, R.anim.instruction_weight_swipe);
                return;
            }
            if (i == 3) {
                if (instructionWeightActivity.B != 4) {
                    return;
                }
                HMLog.d(InstructionWeightActivity.w0, " handle MESSAGE_WEIGHT_-----TRANSLATE-----_ANIM", new Object[0]);
                instructionWeightActivity.T();
                return;
            }
            if (i != 4) {
                if (i == 5 && instructionWeightActivity.B == 5) {
                    instructionWeightActivity.S();
                    return;
                }
                return;
            }
            if (instructionWeightActivity.B != 2) {
                return;
            }
            HMLog.d(InstructionWeightActivity.w0, " handle MESSAGE_MAGNIFY_-------BILnk------_ANIM", new Object[0]);
            instructionWeightActivity.I.setVisibility(0);
            instructionWeightActivity.K.setVisibility(0);
            instructionWeightActivity.Q(instructionWeightActivity.I);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(int i2) {
        if (i2 != 4) {
            this.D.clearAnimation();
            this.L.clearAnimation();
            this.H.clearAnimation();
            this.H.setVisibility(4);
            this.D.setVisibility(4);
            x0.removeMessages(2);
            x0.removeMessages(1);
            x0.removeMessages(3);
            return;
        }
        this.H.setVisibility(0);
        AnimationDrawable animationDrawable = (AnimationDrawable) this.H.getBackground();
        animationDrawable.start();
        HMLog.d(w0, "OverturnAnim is running-- : " + animationDrawable.isRunning(), new Object[0]);
        int duration = 0;
        for (int i3 = 0; i3 < animationDrawable.getNumberOfFrames(); i3++) {
            duration += animationDrawable.getDuration(i3);
        }
        x0.sendEmptyMessageDelayed(3, duration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(int i2) {
        if (i2 != 2 && i2 != 3) {
            this.W.setVisibility(4);
            return;
        }
        this.W.setVisibility(0);
        if (i2 != 2) {
            this.I.setVisibility(4);
            this.J.setVisibility(0);
            this.K.clearAnimation();
            this.K.setVisibility(0);
            this.I.clearAnimation();
            Q(this.J);
            return;
        }
        this.I.setVisibility(4);
        this.J.clearAnimation();
        this.J.setVisibility(4);
        this.I.clearAnimation();
        this.I.setVisibility(4);
        if (this.X == 1) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.instruction_weight_big_weight_out);
            animationLoadAnimation.setAnimationListener(new c());
            this.K.startAnimation(animationLoadAnimation);
        } else {
            this.J.clearAnimation();
            this.J.setVisibility(4);
            this.K.setVisibility(0);
            Q(this.I);
        }
    }

    private void K() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.125f, 1, 0.0f);
        translateAnimation.setDuration(400L);
        translateAnimation.setFillBefore(true);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        this.O.startAnimation(translateAnimation);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.14f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation2.setDuration(400L);
        translateAnimation2.setStartOffset(200L);
        translateAnimation2.setFillBefore(true);
        translateAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.P.startAnimation(translateAnimation2);
        TranslateAnimation translateAnimation3 = new TranslateAnimation(1, -0.14f, 1, 0.0f, 1, -0.07f, 1, 0.0f);
        translateAnimation3.setDuration(400L);
        translateAnimation3.setStartOffset(400L);
        translateAnimation3.setFillBefore(true);
        translateAnimation3.setInterpolator(new AccelerateDecelerateInterpolator());
        this.Q.startAnimation(translateAnimation3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(int i2) {
        if (i2 > 1) {
            this.C.stopRippleAnimation();
            this.C.setRBEnable(false);
            this.M.clearAnimation();
            this.N.clearAnimation();
            this.G.setVisibility(4);
            this.E.setVisibility(4);
            this.F.setVisibility(4);
            return;
        }
        this.C.setRBEnable(true);
        this.C.startRippleAnimation();
        this.G.setVisibility(0);
        this.E.setVisibility(0);
        if (i2 == 1) {
            findViewById(R.id.instruction_weight_img_phone).setVisibility(4);
            this.F.setVisibility(0);
            K();
        } else {
            this.F.setVisibility(4);
            findViewById(R.id.instruction_weight_img_phone).setVisibility(0);
        }
        if (i2 == 0) {
            findViewById(R.id.instruction_weight_line).setVisibility(0);
            R(this.M, R.anim.instruction_weight_left_arrow);
            R(this.N, R.anim.instruction_weight_right_arrow);
        } else {
            this.M.clearAnimation();
            this.N.clearAnimation();
            findViewById(R.id.instruction_weight_line).setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(int i2) {
        if (i2 != 5) {
            if (i2 == 4) {
                this.R.setVisibility(4);
                x0.removeMessages(5);
                return;
            }
            return;
        }
        this.D.clearAnimation();
        this.D.setVisibility(4);
        this.R.setVisibility(0);
        this.T.clearAnimation();
        this.U.clearAnimation();
        this.V.clearAnimation();
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 0.38f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setAnimationListener(new f());
        this.S.setVisibility(4);
        this.S.startAnimation(translateAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i2, float f2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(int i2, Float f2) {
        if (f2.floatValue() == 0.0f) {
            ((InstructionWeightBasePage) this.A.get(i2)).titleInfo.setAlpha(1.0f);
        } else {
            ((InstructionWeightBasePage) this.A.get(i2)).titleInfo.setAlpha(1.0f - f2.floatValue());
            ((InstructionWeightBasePage) this.A.get(i2 + 1)).titleInfo.setAlpha(f2.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        this.D.clearAnimation();
        this.D.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new e());
        this.D.startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setRepeatMode(1);
        alphaAnimation.setRepeatCount(-1);
        view.startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(View view, int i2) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, i2);
        animationLoadAnimation.setRepeatMode(1);
        animationLoadAnimation.setRepeatCount(-1);
        animationLoadAnimation.setAnimationListener(new b(view, animationLoadAnimation));
        view.startAnimation(animationLoadAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setFillAfter(true);
        this.T.startAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(1000L);
        alphaAnimation2.setStartOffset(1000L);
        alphaAnimation2.setFillAfter(true);
        this.U.startAnimation(alphaAnimation2);
        AlphaAnimation alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation3.setDuration(1000L);
        alphaAnimation3.setFillAfter(true);
        alphaAnimation3.setStartOffset(2000L);
        this.V.startAnimation(alphaAnimation3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        this.H.clearAnimation();
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.37f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(700L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new d());
        this.H.startAnimation(translateAnimation);
    }

    private void findViews() {
        RippleBackground rippleBackground = (RippleBackground) findViewById(R.id.content);
        this.C = rippleBackground;
        rippleBackground.startRippleAnimation();
        this.G = (ImageView) findViewById(R.id.instruction_weight_img_weight);
        this.E = findViewById(R.id.in_weight_page1_phone_and_dot);
        ImageView imageView = (ImageView) findViewById(R.id.instruction_weight_img_weight_overturn);
        this.H = imageView;
        imageView.setVisibility(4);
        this.H.setBackgroundResource(R.drawable.instruction_weight_overturn);
        View viewFindViewById = findViewById(R.id.instruction_weight_bg_34);
        this.W = viewFindViewById;
        viewFindViewById.setVisibility(4);
        ImageView imageView2 = (ImageView) findViewById(R.id.instruction_weight_overMax);
        this.J = imageView2;
        imageView2.setVisibility(4);
        ImageView imageView3 = (ImageView) findViewById(R.id.instruction_weight_low);
        this.I = imageView3;
        imageView3.setVisibility(4);
        ImageView imageView4 = (ImageView) findViewById(R.id.instruction_weight_big_weight);
        this.K = imageView4;
        imageView4.setVisibility(4);
        this.D = findViewById(R.id.instruction_weight_img_weight_magnify);
        this.L = (ImageView) findViewById(R.id.instruction_weight_img_swipe);
        this.M = (ImageView) findViewById(R.id.weight_left_arrow);
        this.N = (ImageView) findViewById(R.id.weight_right_arrow);
        this.O = (ImageView) findViewById(R.id.instruction_weight_img_phone1);
        this.P = (ImageView) findViewById(R.id.instruction_weight_img_phone_back1);
        this.Q = (ImageView) findViewById(R.id.instruction_weight_img_phone_back2);
        this.F = findViewById(R.id.instruction_weight_phones);
        this.R = findViewById(R.id.instruction_weight_page_6);
        this.foot = (ImageView) findViewById(R.id.instruction_weight_foot);
        this.S = (ImageView) findViewById(R.id.instruction_weight_flatwise);
        this.T = findViewById(R.id.instruction_weight_page6_tips1);
        this.U = findViewById(R.id.instruction_weight_page6_tips2);
        this.V = findViewById(R.id.instruction_weight_page6_tips3);
        this.R.setVisibility(4);
    }

    private void initView() {
        findViews();
        R(this.M, R.anim.instruction_weight_left_arrow);
        R(this.N, R.anim.instruction_weight_right_arrow);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_instruction_weight);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.weight_mon_bg), "");
        setTitleText(R.string.bind_mi_weight_howto_tips);
        initView();
        x0 = new h(this);
        this.x = (ViewPager) findViewById(R.id.view_pager);
        this.y = (PageIndicator) findViewById(R.id.indicator);
        ArrayList<Fragment> arrayList = new ArrayList<>(6);
        this.A = arrayList;
        arrayList.add(Fragment.instantiate(this, InstructionWeightPage1.class.getName()));
        this.A.add(Fragment.instantiate(this, InstructionWeightPage2.class.getName()));
        this.A.add(Fragment.instantiate(this, InstructionWeightPage3.class.getName()));
        this.A.add(Fragment.instantiate(this, InstructionWeightPage4.class.getName()));
        this.A.add(Fragment.instantiate(this, InstructionWeightPage5.class.getName()));
        this.A.add(Fragment.instantiate(this, InstructionWeightPage6.class.getName()));
        g gVar = new g(getSupportFragmentManager());
        this.z = gVar;
        this.x.setAdapter(gVar);
        this.x.setOffscreenPageLimit(6);
        this.y.setViewPager(this.x);
        this.y.setOnPageChangeListener(new a());
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RippleBackground rippleBackground = this.C;
        if (rippleBackground != null) {
            rippleBackground.stopRippleAnimation();
        }
    }

    public static class i {
        public String a;
        public String b;
        public String c;

        public i(Context context, int i, int i2, int i3) {
            this.a = context.getString(i);
            this.b = i2 == 0 ? "" : context.getString(i2);
            this.c = i3 != 0 ? context.getString(i3) : "";
        }

        public i(String str, String str2, String str3) {
            this.a = str;
            this.b = TextUtils.isEmpty(str2) ? "" : str2;
            this.c = TextUtils.isEmpty(str3) ? "" : str3;
        }
    }
}
