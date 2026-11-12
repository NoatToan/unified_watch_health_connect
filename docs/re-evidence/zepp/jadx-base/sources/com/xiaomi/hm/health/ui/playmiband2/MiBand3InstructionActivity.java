package com.xiaomi.hm.health.ui.playmiband2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huami.lib.view.ViewUtils;
import com.huami.sleep.daysleep.daydetail.ui.SleepDetailFragment;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseui.FramesSequenceAnimation;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMMiLiSettingActivity;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class MiBand3InstructionActivity extends BaseTitleActivity {
    private static final String B = "MiBand3InstructionActivity";
    private static final int C = 46;
    private static final int D = 74;
    private HMDeviceSource A;
    private List<BaseFragment> x;
    private ImageView y;
    public boolean z = false;

    public static class BaseFragment extends Fragment {
        /* JADX INFO: renamed from: a */
        public void p(Context context) {
        }

        public void b() {
        }
    }

    public static class Fragment01 extends BaseFragment {
        private ImageView a;
        private FrameLayout b;
        private FrameLayout c;
        private FrameLayout d;
        private List<Animation> e = new ArrayList();
        private Handler f;

        private void i(Context context, boolean reverse, boolean firstTime) {
            float fDp2px;
            float fDp2px2;
            if (firstTime) {
                fDp2px2 = ViewUtils.dp2px(context, -74.0f);
                fDp2px = 0.0f;
            } else {
                fDp2px = ViewUtils.dp2px(context, -74.0f);
                fDp2px2 = ViewUtils.dp2px(context, -74.0f) * 2.0f;
            }
            TranslateAnimation translateAnimation = reverse ? new TranslateAnimation(0.0f, 0.0f, fDp2px2, fDp2px) : new TranslateAnimation(0.0f, 0.0f, fDp2px, fDp2px2);
            translateAnimation.setDuration(600L);
            translateAnimation.setFillAfter(true);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setAnimationListener(null);
            if (firstTime) {
                this.b.startAnimation(translateAnimation);
                this.c.startAnimation(translateAnimation);
            } else {
                this.c.startAnimation(translateAnimation);
                this.d.startAnimation(translateAnimation);
            }
            this.e.add(translateAnimation);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        private void j(Context context, boolean z) {
            AnimationSet animationSet = new AnimationSet(false);
            TranslateAnimation translateAnimation = z ? new TranslateAnimation(0.0f, 0.0f, ViewUtils.dp2px(context, -24.0f), ViewUtils.dp2px(context, 10.0f)) : new TranslateAnimation(0.0f, 0.0f, ViewUtils.dp2px(context, 10.0f), ViewUtils.dp2px(context, -24.0f));
            translateAnimation.setDuration(600L);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setFillAfter(true);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(200L);
            alphaAnimation2.setStartOffset(400L);
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.setFillAfter(true);
            animationSet.setStartOffset(300L);
            animationSet.setAnimationListener(null);
            if (this.e == null) {
                this.e = new ArrayList();
            }
            this.e.add(animationSet);
            this.a.startAnimation(animationSet);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(Context context) {
            i(context, false, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(Context context) {
            j(context, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(Context context) {
            i(context, false, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(Context context) {
            j(context, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(Context context) {
            i(context, true, false);
        }

        @Override // com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity.BaseFragment
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void p(final Context context) {
            j(context, false);
            this.f.postDelayed(new Runnable() { // from class: l25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.k(context);
                }
            }, 1100L);
            this.f.postDelayed(new Runnable() { // from class: j25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.l(context);
                }
            }, 1700L);
            this.f.postDelayed(new Runnable() { // from class: i25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.m(context);
                }
            }, 2800L);
            this.f.postDelayed(new Runnable() { // from class: h25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.n(context);
                }
            }, 3300L);
            this.f.postDelayed(new Runnable() { // from class: k25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.o(context);
                }
            }, 4400L);
        }

        @Override // com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity.BaseFragment
        public void b() {
            if (this.b == null || this.c == null || this.d == null || this.a == null || this.e == null) {
                return;
            }
            this.f.removeCallbacksAndMessages(null);
            this.b.clearAnimation();
            this.c.clearAnimation();
            this.d.clearAnimation();
            this.a.clearAnimation();
            this.a.setVisibility(4);
            List<Animation> list = this.e;
            if (list != null && list.size() > 0) {
                Iterator<Animation> it2 = this.e.iterator();
                while (it2.hasNext()) {
                    it2.next().cancel();
                }
            }
            this.e = null;
        }

        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            HMLog.d(MiBand3InstructionActivity.B, "onCreateView.", new Object[0]);
            View viewInflate = inflater.inflate(R.layout.fragment_miband3_1, container, false);
            this.a = (ImageView) viewInflate.findViewById(R.id.hand_img);
            this.b = (FrameLayout) viewInflate.findViewById(R.id.frame_img_1);
            this.c = (FrameLayout) viewInflate.findViewById(R.id.frame_img_2);
            this.d = (FrameLayout) viewInflate.findViewById(R.id.frame_img_3);
            return viewInflate;
        }

        @Override // androidx.fragment.app.Fragment
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            HMLog.d(MiBand3InstructionActivity.B, "onViewCreated", new Object[0]);
            final MiBand3InstructionActivity miBand3InstructionActivity = (MiBand3InstructionActivity) getActivity();
            if (miBand3InstructionActivity == null || !miBand3InstructionActivity.z) {
                return;
            }
            Handler handler = new Handler();
            this.f = handler;
            handler.postDelayed(new Runnable() { // from class: m25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.p(miBand3InstructionActivity);
                }
            }, 300L);
        }
    }

    public static class Fragment02 extends BaseFragment {
        private MovableImageView a;
        private FrameLayout b;
        private FrameLayout c;
        private FrameLayout d;
        private ImageView e;
        private CustomAnimator f = CustomAnimator.getInstance();
        private Handler g = new Handler();

        private void h(Context context) {
            final float fDp2px = ViewUtils.dp2px(context, -46.0f);
            final float fDp2px2 = ViewUtils.dp2px(context, 11.0f);
            this.f.u(this.b, SleepDetailFragment.START_VALID_INTO_TIME, this.d.getTranslationX(), fDp2px, 500);
            this.f.u(this.c, SleepDetailFragment.START_VALID_INTO_TIME, this.d.getTranslationX(), fDp2px, 500);
            this.f.t(this.e, SleepDetailFragment.START_VALID_INTO_TIME, 0.0f, fDp2px2);
            this.g.postDelayed(new Runnable() { // from class: o25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.j(fDp2px, fDp2px2);
                }
            }, 2400L);
            this.g.postDelayed(new Runnable() { // from class: n25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.k(fDp2px, fDp2px2);
                }
            }, TimeUtils.TIME_1_HOURS);
        }

        private void i(Context context) {
            this.a.setAlpha(0.0f);
            final int iDp2px = (int) ViewUtils.dp2px(context, 45.0f);
            this.g.postDelayed(new Runnable() { // from class: r25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.l(iDp2px);
                }
            }, 400L);
            this.g.postDelayed(new Runnable() { // from class: p25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.m(iDp2px);
                }
            }, 1600L);
            this.g.postDelayed(new Runnable() { // from class: q25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.n(iDp2px);
                }
            }, 2800L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(float f, float f2) {
            this.f.t(this.d, 0, 0.0f, f);
            this.f.t(this.c, 0, f, f * 2.0f);
            this.f.t(this.e, 0, f2, 2.0f * f2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(float f, float f2) {
            this.f.t(this.d, 0, f, 0.0f);
            this.f.t(this.c, 0, f * 2.0f, f);
            this.f.u(this.e, 0, f2 * 2.0f, f2, 600);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(int i) {
            this.f.r(this.a, 0, -i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(int i) {
            this.f.r(this.a, 0, -i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(int i) {
            this.f.r(this.a, -i, 0);
        }

        @Override // com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity.BaseFragment
        /* JADX INFO: renamed from: a */
        public void p(Context context) {
            i(context);
            h(context);
        }

        @Override // com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity.BaseFragment
        public void b() {
            if (this.b == null || this.c == null || this.a == null) {
                return;
            }
            this.g.removeCallbacksAndMessages(null);
            this.a.clearAnimation();
            this.a.setTranslationX(0.0f);
            this.a.setAlpha(0.0f);
            this.f.i();
        }

        @Override // androidx.fragment.app.Fragment
        @Nullable
        @SuppressLint({"WrongViewCast"})
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View viewInflate = inflater.inflate(R.layout.fragment_miband3_2, container, false);
            this.a = (MovableImageView) viewInflate.findViewById(R.id.hand_img);
            this.b = (FrameLayout) viewInflate.findViewById(R.id.frame_img_1);
            this.c = (FrameLayout) viewInflate.findViewById(R.id.frame_img_2);
            this.d = (FrameLayout) viewInflate.findViewById(R.id.frame_img_3);
            this.e = (ImageView) viewInflate.findViewById(R.id.indicator_img);
            return viewInflate;
        }
    }

    public static class Fragment03 extends BaseFragment {
        private FrameLayout a;
        private FrameLayout b;
        private FrameLayout c;
        private MovableImageView d;
        private CustomAnimator e = CustomAnimator.getInstance();
        private Handler f = new Handler();

        private void i(final Context context) {
            this.e.s(this.c, 850, ViewUtils.dp2px(context, 46.0f));
            this.e.s(this.b, 850, ViewUtils.dp2px(context, 46.0f));
            this.f.postDelayed(new Runnable() { // from class: w25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.l(context);
                }
            }, 2150L);
        }

        private void j(Context context) {
            this.e.h(this.d);
            this.d.translateX(0, ViewUtils.dp2px(context, -35.0f));
            this.f.postDelayed(new Runnable() { // from class: t25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.m();
                }
            }, 600L);
            this.f.postDelayed(new Runnable() { // from class: v25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.n();
                }
            }, 900L);
            this.f.postDelayed(new Runnable() { // from class: u25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.o();
                }
            }, 3550L);
            this.f.postDelayed(new Runnable() { // from class: s25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.p();
                }
            }, 3900L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(Context context) {
            j(context);
            i(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(Context context) {
            this.e.v(this.a, 0, 0.0f, ViewUtils.dp2px(context, 74.0f));
            this.e.v(this.b, 0, 0.0f, ViewUtils.dp2px(context, 74.0f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m() {
            this.d.click(0.97f, false, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n() {
            this.d.click();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o() {
            this.d.translateX(0, 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p() {
            this.e.j(this.d);
        }

        @Override // com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity.BaseFragment
        /* JADX INFO: renamed from: a */
        public void p(final Context context) {
            this.f.postDelayed(new Runnable() { // from class: x25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.k(context);
                }
            }, 400L);
        }

        @Override // com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity.BaseFragment
        public void b() {
            MovableImageView movableImageView;
            if (this.a == null || this.b == null || this.c == null || (movableImageView = this.d) == null) {
                return;
            }
            movableImageView.clearAnim();
            this.d.setAlpha(0.0f);
            this.f.removeCallbacksAndMessages(null);
            this.e.i();
            this.a.setVisibility(0);
        }

        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View viewInflate = inflater.inflate(R.layout.fragment_miband3_3, container, false);
            this.a = (FrameLayout) viewInflate.findViewById(R.id.frame_img_1);
            this.b = (FrameLayout) viewInflate.findViewById(R.id.frame_img_2);
            this.c = (FrameLayout) viewInflate.findViewById(R.id.frame_img_3);
            this.d = (MovableImageView) viewInflate.findViewById(R.id.hand_img);
            return viewInflate;
        }
    }

    public static class Fragment04 extends BaseFragment {
        private static final int[] j = {R.drawable.img_band_3_spread_1, R.drawable.img_band_3_spread_2, R.drawable.img_band_3_spread_3, R.drawable.img_band_3_spread_4, R.drawable.img_band_3_spread_5, R.drawable.img_band_3_spread_6, R.drawable.img_band_3_spread_7, R.drawable.img_band_3_spread_8, R.drawable.img_band_3_spread_9, R.drawable.img_band_3_spread_10, R.drawable.img_band_3_spread_11, R.drawable.img_band_3_spread_12, R.drawable.img_band_3_spread_13, R.drawable.img_band_3_spread_14, R.drawable.img_band_3_spread_15, R.drawable.img_band_3_spread_16, R.drawable.img_band_3_spread_17, R.drawable.img_band_3_spread_18};
        private MovableImageView a;
        private MovableImageView b;
        private ImageView c;
        private FrameLayout d;
        private MovableImageView e;
        private TextView f;
        private Handler g = new Handler();
        private CustomAnimator h = CustomAnimator.getInstance();
        private FramesSequenceAnimation i;

        private void n(Context context) {
            this.g.postDelayed(new Runnable() { // from class: c35
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.p();
                }
            }, 400L);
            this.a.translateX(400, 0.0f, ViewUtils.dp2px(context, -35.0f));
            this.g.postDelayed(new Runnable() { // from class: f35
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.q();
                }
            }, 1000L);
        }

        private void o(final Context context) {
            this.g.postDelayed(new Runnable() { // from class: e35
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.s();
                }
            }, 1150L);
            this.g.postDelayed(new Runnable() { // from class: d35
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.t();
                }
            }, 2326L);
            this.g.postDelayed(new Runnable() { // from class: h35
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.u();
                }
            }, 2026L);
            this.g.postDelayed(new Runnable() { // from class: a35
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.v();
                }
            }, 2326L);
            this.g.postDelayed(new Runnable() { // from class: y25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.w();
                }
            }, 2476L);
            this.g.postDelayed(new Runnable() { // from class: i35
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.x(context);
                }
            }, 3876L);
            this.g.postDelayed(new Runnable() { // from class: b35
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.y();
                }
            }, 4576L);
            this.g.postDelayed(new Runnable() { // from class: z25
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.z(context);
                }
            }, 4976L);
            this.g.postDelayed(new Runnable() { // from class: g35
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.r();
                }
            }, TimeUtils.TIME_1_HOURS_30_MINUTE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p() {
            this.h.h(this.a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q() {
            this.a.press(0.97f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r() {
            this.h.j(this.a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s() {
            this.c.setVisibility(0);
            this.i.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t() {
            this.c.setVisibility(4);
            this.c.setImageResource(R.drawable.img_band_3_spread_1);
            this.i.stop();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u() {
            this.e.appearAndRise();
            this.f.setText(R.string.play_miband3_distance_heart_rate_finding_phone);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v() {
            this.a.release(0.97f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w() {
            this.a.translateX(0, 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(Context context) {
            this.a.translateXY(ViewUtils.dp2px(context, -35.0f), ViewUtils.dp2px(context, -32.0f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y() {
            this.a.clearAnimation();
            this.a.setVisibility(4);
            this.b.setVisibility(0);
            this.b.click(0.97f, false, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(Context context) {
            this.e.clearAnimation();
            this.e.setVisibility(4);
            this.f.setText(R.string.play_miband3_distance_heart_rate_find_phone);
            this.b.setVisibility(4);
            this.a.setVisibility(0);
            this.a.translateXY(ViewUtils.dp2px(context, -35.0f), 0.0f, ViewUtils.dp2px(context, -32.0f), 0.0f);
        }

        @Override // com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity.BaseFragment
        /* JADX INFO: renamed from: a */
        public void p(Context context) {
            n(context);
            o(context);
        }

        @Override // com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity.BaseFragment
        public void b() {
            Handler handler = this.g;
            if (handler == null || this.a == null || this.b == null || this.e == null || this.d == null || this.i == null) {
                return;
            }
            handler.removeCallbacksAndMessages(null);
            this.h.i();
            this.a.setAlpha(0.0f);
            this.a.clearAnim();
            this.a.setTranslationX(0.0f);
            this.a.setTranslationY(0.0f);
            this.a.setVisibility(0);
            this.b.setVisibility(4);
            this.e.clearAnimation();
            this.e.setVisibility(4);
            this.c.setVisibility(4);
            this.f.setText(R.string.play_miband3_distance_heart_rate_find_phone);
            this.i.stop();
        }

        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View viewInflate = inflater.inflate(R.layout.fragment_miband3_4, container, false);
            this.a = (MovableImageView) viewInflate.findViewById(R.id.hand_img);
            this.b = (MovableImageView) viewInflate.findViewById(R.id.hand_img_1);
            this.c = (ImageView) viewInflate.findViewById(R.id.find_phone_img);
            this.e = (MovableImageView) viewInflate.findViewById(R.id.close_img);
            this.d = (FrameLayout) viewInflate.findViewById(R.id.finding_phone_img);
            this.f = (TextView) viewInflate.findViewById(R.id.find_phone_tv);
            this.i = new FramesSequenceAnimation(this.c, j, new int[]{84, 84, 84, 84, 84, 84, 84, 84, 84, 84, 42, 42, 42, 42, 42, 42, 42, 42}, true);
            return viewInflate;
        }
    }

    public static class Fragment05 extends BaseFragment {
        private static final int[] g = {R.drawable.img_band_3_unlock_1, R.drawable.img_band_3_unlock_2, R.drawable.img_band_3_unlock_3, R.drawable.img_band_3_unlock_4, R.drawable.img_band_3_unlock_5, R.drawable.img_band_3_unlock_6, R.drawable.img_band_3_unlock_7, R.drawable.img_band_3_unlock_8, R.drawable.img_band_3_unlock_9, R.drawable.img_band_3_unlock_10, R.drawable.img_band_3_unlock_11, R.drawable.img_band_3_unlock_12, R.drawable.img_band_3_unlock_13, R.drawable.img_band_3_unlock_14, R.drawable.img_band_3_unlock_15, R.drawable.img_band_3_unlock_16};
        private FrameLayout a;
        private ImageView b;
        private ImageView c;
        private FrameLayout d;
        private FramesSequenceAnimation e;
        private Handler f;

        public class a extends b {
            public a() {
                super();
            }

            @Override // com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity.b, android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                Fragment05.this.d.setVisibility(0);
            }
        }

        private void f() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.d.startAnimation(alphaAnimation);
        }

        private void g(Context context) {
            AnimationSet animationSet = new AnimationSet(false);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, ViewUtils.dp2px(context, 20.0f), ViewUtils.dp2px(context, -24.0f));
            translateAnimation.setDuration(1000L);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setFillAfter(true);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(200L);
            alphaAnimation2.setStartOffset(400L);
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.setFillAfter(true);
            this.c.startAnimation(animationSet);
        }

        private void h() {
            this.a.setVisibility(0);
            this.e.start();
            this.f.postDelayed(new Runnable() { // from class: j35
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.j();
                }
            }, TimeUtils.TIME_1_HOURS);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Context context) {
            this.c.setVisibility(0);
            g(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j() {
            this.e.stop();
            this.a.setVisibility(4);
            f();
        }

        @Override // com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity.BaseFragment
        /* JADX INFO: renamed from: a */
        public void p(final Context context) {
            h();
            this.f.postDelayed(new Runnable() { // from class: k35
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.i(context);
                }
            }, 2800L);
        }

        @Override // com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity.BaseFragment
        public void b() {
            FrameLayout frameLayout = this.a;
            if (frameLayout == null || this.f == null || this.d == null || this.c == null || this.e == null) {
                return;
            }
            frameLayout.setVisibility(0);
            this.b.setImageResource(R.drawable.img_band_3_unlock_1);
            this.f.removeCallbacksAndMessages(null);
            this.d.clearAnimation();
            this.d.setVisibility(4);
            this.d.setTranslationY(0.0f);
            this.c.clearAnimation();
            this.c.setVisibility(4);
            this.e.stop();
        }

        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View viewInflate = inflater.inflate(R.layout.fragment_miband3_5, container, false);
            this.a = (FrameLayout) viewInflate.findViewById(R.id.unlock_container);
            this.b = (ImageView) viewInflate.findViewById(R.id.unlock_img);
            this.c = (ImageView) viewInflate.findViewById(R.id.hand_img);
            this.d = (FrameLayout) viewInflate.findViewById(R.id.frame_img);
            this.e = new FramesSequenceAnimation(this.b, g, new int[]{100, 100, 100, 100, 100, 100, 100, 100, 50, 50, 50, 50, 50, 50, 50, 50}, true);
            this.f = new Handler();
            return viewInflate;
        }
    }

    public static class Fragment06 extends BaseFragment {
        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_miband3_6, container, false);
        }
    }

    public static class Fragment07 extends BaseFragment {
        private MovableImageView a;
        private ImageView b;
        private TextView c;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Context context) {
            this.a.setVisibility(0);
            this.a.appearAndTranslate(ViewUtils.dp2px(context, -35.0f), 0.0f, ViewUtils.dp2px(context, 32.0f), 0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g() {
            this.c.setText(R.string.play_miband3_nfc_slot_card_success);
            this.b.setImageResource(R.drawable.img_open_card_done);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(View view) {
            if (getActivity() != null) {
                getActivity().setResult(-1);
                getActivity().finish();
            }
            HMBaseDevice device = HMDeviceManager.getInstance().getDevice();
            if (device == null || device.getMDeviceSource() == null || getContext() == null) {
                return;
            }
            ((DeviceXNavigator) KoinJavaComponent.get(DeviceXNavigator.class)).navigateToDeviceSetting(getContext(), device.getMDeviceSource());
        }

        @Override // com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity.BaseFragment
        /* JADX INFO: renamed from: a */
        public void p(final Context context) {
            this.a.postDelayed(new Runnable() { // from class: n35
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f(context);
                }
            }, 400L);
            this.a.postDelayed(new Runnable() { // from class: m35
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g();
                }
            }, 1400L);
        }

        @Override // com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity.BaseFragment
        public void b() {
            MovableImageView movableImageView = this.a;
            if (movableImageView == null || this.c == null || this.b == null) {
                return;
            }
            movableImageView.clearAnim();
            this.a.setTranslationX(0.0f);
            this.a.setTranslationY(0.0f);
            this.a.setVisibility(8);
            this.c.setText(R.string.play_miband3_nfc_please_slot_card);
            this.b.setImageResource(R.drawable.img_open_card);
        }

        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View viewInflate = inflater.inflate(R.layout.fragment_miband3_7, container, false);
            this.a = (MovableImageView) viewInflate.findViewById(R.id.img_slot_card);
            this.b = (ImageView) viewInflate.findViewById(R.id.img_pos);
            this.c = (TextView) viewInflate.findViewById(R.id.indicator_tv);
            viewInflate.findViewById(R.id.tv_goto_add).setOnClickListener(new View.OnClickListener() { // from class: l35
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.h(view);
                }
            });
            return viewInflate;
        }
    }

    public class a implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ float a;

        public a(final float val$pointSize) {
            this.a = val$pointSize;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            MiBand3InstructionActivity.this.y.setTranslationX((position + positionOffset) * this.a);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            HMLog.d(MiBand3InstructionActivity.B, "pageSelected: " + position, new Object[0]);
            MiBand3InstructionActivity.this.z = false;
            for (int i = 0; i < MiBand3InstructionActivity.this.x.size(); i++) {
                if (i == position) {
                    ((BaseFragment) MiBand3InstructionActivity.this.x.get(i)).p(MiBand3InstructionActivity.this);
                } else {
                    ((BaseFragment) MiBand3InstructionActivity.this.x.get(i)).b();
                }
            }
        }
    }

    public static class b implements Animation.AnimationListener {
        private b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class c extends FragmentPagerAdapter {
        public c(FragmentManager fm) {
            super(fm);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getA() {
            return MiBand3InstructionActivity.this.x.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int position) {
            return (Fragment) MiBand3InstructionActivity.this.x.get(position);
        }
    }

    private void initView() {
        float dimension = getResources().getDimension(R.dimen.new_version_helper_point_size);
        this.y = (ImageView) findViewById(R.id.indicator_img);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        ArrayList arrayList = new ArrayList();
        this.x = arrayList;
        arrayList.add(new Fragment01());
        this.x.add(new Fragment02());
        this.x.add(new Fragment03());
        this.x.add(new Fragment04());
        if (HMDeviceSource.MILI_CHONGQING == this.A) {
            this.x.add(new Fragment07());
            findViewById(R.id.last_indicator_img).setVisibility(8);
        } else {
            this.x.add(new Fragment05());
            this.x.add(new Fragment06());
        }
        viewPager.setAdapter(new c(getSupportFragmentManager()));
        viewPager.addOnPageChangeListener(new a(dimension));
    }

    public static void launch(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) MiBand3InstructionActivity.class);
        if (activity instanceof HMMiLiSettingActivity) {
            activity.startActivityForResult(intent, 1);
        } else {
            activity.startActivity(intent);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miband3_instuction);
        setStyle(BaseTitleActivity.STYLE.SINGLE_BACK, ContextCompat.getColor(this, R.color.pale_grey_two), true);
        this.A = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        initView();
        this.z = true;
    }
}
