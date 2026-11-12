package com.huawei.health.suggestion.ui.healthcourse.fragment;

import android.animation.ObjectAnimator;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.healthcourse.fragment.SeriesCourseVideoFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.course.BaseVideoInfo;
import com.huawei.pluginfitnessadvice.course.EssenceVideoInfo;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.pdh;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes31.dex */
public class SeriesCourseVideoFragment extends BaseVideoFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConstraintLayout f9572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f9573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f9574c;
    private HealthImageView d;
    private ConstraintLayout e;
    private boolean f;
    private HealthTextView g;
    private EssenceVideoInfo h;
    private ConstraintLayout i;
    private ConstraintLayout j;
    private boolean l;
    private HealthTextView n;
    private boolean o = false;

    public static SeriesCourseVideoFragment c(BaseVideoInfo baseVideoInfo) {
        SeriesCourseVideoFragment seriesCourseVideoFragment = new SeriesCourseVideoFragment();
        Bundle bundle = new Bundle();
        EssenceVideoInfo essenceVideoInfo = (EssenceVideoInfo) baseVideoInfo;
        bundle.putParcelable("essenceVideoInfo", essenceVideoInfo);
        bundle.putString("videoUrl", essenceVideoInfo.getUrl());
        seriesCourseVideoFragment.setArguments(bundle);
        return seriesCourseVideoFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.sug_series_course_video, viewGroup, false);
    }

    @Override // com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.h = (EssenceVideoInfo) getArguments().getParcelable("essenceVideoInfo");
        }
    }

    private void f(View view) {
        this.d = (HealthImageView) view.findViewById(R.id.avatar);
        this.n = (HealthTextView) view.findViewById(R.id.title_name);
        qqf.e(this.d, this.h.getAvatar(), (int) BaseApplication.b().getResources().getDimension(com.huawei.ui.commonui.R.dimen.health_common_20dp), 0, R.drawable.default_avatar);
        ((HealthTextView) view.findViewById(R.id.title_name)).setText(this.h.getCourseName());
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.course_collapse_text);
        this.f9573b = healthTextView;
        healthTextView.setText(this.h.getIntroduction());
        this.g = (HealthTextView) view.findViewById(R.id.expand);
        ((HealthTextView) view.findViewById(R.id.course_expand_text)).setText(this.h.getIntroduction());
        ((HealthTextView) view.findViewById(R.id.course_guide_text)).setText(this.h.getGuideText());
        this.e = (ConstraintLayout) view.findViewById(R.id.main);
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void g() {
        ConstraintLayout constraintLayout = this.f9572a;
        if (constraintLayout == null || this.f9573b == null || this.h == null) {
            LogUtil.j("Suggestion_SeriesCourseVideoFragment", "updateExpendLayout layout is null");
            return;
        }
        if (this.f) {
            constraintLayout.setVisibility(4);
        } else {
            constraintLayout.setVisibility(0);
        }
        this.i.setVisibility(8);
        this.o = false;
        this.f9572a.post(new Runnable() { // from class: hoo
            @Override // java.lang.Runnable
            public final void run() {
                this.d.i();
            }
        });
    }

    public /* synthetic */ void i() {
        int measuredWidth = this.f9572a.getMeasuredWidth();
        TextPaint paint = this.f9573b.getPaint();
        paint.setTextSize(this.f9573b.getTextSize());
        int iMeasureText = (int) paint.measureText(this.h.getIntroduction());
        LogUtil.a("Suggestion_SeriesCourseVideoFragment", "updateExpendLayout totalWidth:", Integer.valueOf(measuredWidth), " targetWidth:", Integer.valueOf(iMeasureText));
        if (iMeasureText > measuredWidth) {
            this.g.setVisibility(0);
            this.f9572a.setOnClickListener(new View.OnClickListener() { // from class: hoq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.e(view);
                }
            });
        } else {
            this.g.setVisibility(8);
            this.f9572a.setOnClickListener(null);
        }
    }

    public /* synthetic */ void e(View view) {
        this.f9572a.setVisibility(8);
        this.i.setVisibility(0);
        this.o = true;
    }

    private void j() {
        if (qrs.ad(BaseApplication.b())) {
            this.e.setPaddingRelative(0, 0, 0, qre.d(R.dimen.health_common_8dp));
            LogUtil.a("Suggestion_SeriesCourseVideoFragment", "updateBottomDivider show NavigationBar");
        } else {
            this.e.setPaddingRelative(0, 0, 0, qre.d(R.dimen.health_common_24dp));
            LogUtil.a("Suggestion_SeriesCourseVideoFragment", "updateBottomDivider not show NavigationBar");
        }
    }

    private void c(View view) {
        this.f9574c = (LinearLayout) view.findViewById(R.id.avatar_layout);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.healthcourse.fragment.SeriesCourseVideoFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (!qrs.c(500)) {
                    SeriesCourseVideoFragment.this.f();
                } else {
                    LogUtil.a("Suggestion_SeriesCourseVideoFragment", "onClick isFastClick true");
                }
            }
        });
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.healthcourse.fragment.SeriesCourseVideoFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (!qrs.c(500)) {
                    SeriesCourseVideoFragment.this.f();
                } else {
                    LogUtil.a("Suggestion_SeriesCourseVideoFragment", "onClick isFastClick true");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (TextUtils.isEmpty(this.h.getSerialCourseId())) {
            ReleaseLogUtil.d("Suggestion_SeriesCourseVideoFragment", "getSerialCourseId is empty");
            return;
        }
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi == null) {
            LogUtil.e("Suggestion_SeriesCourseVideoFragment", "jumpToH5Detail marketRouterApi == null");
            return;
        }
        marketRouterApi.router("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&statusBarTextBlack&showStatusBar&isImmerse&path=seriesCourse&id=" + this.h.getSerialCourseId() + "&type=2");
    }

    private void g(View view) {
        this.j = (ConstraintLayout) view.findViewById(R.id.course_guide_layout);
        HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.pre_listen);
        if (LanguageUtil.ba(BaseApplication.b())) {
            healthImageView.setRotation(180.0f);
            this.j.setBackgroundResource(R.drawable.course_tip_bg_mirror);
        }
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.healthcourse.fragment.SeriesCourseVideoFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (!qrs.c(500)) {
                    if (TextUtils.isEmpty(SeriesCourseVideoFragment.this.h.getGuideCourseId()) || TextUtils.isEmpty(SeriesCourseVideoFragment.this.h.getSerialCourseId())) {
                        ReleaseLogUtil.d("Suggestion_SeriesCourseVideoFragment", "getGuideCourseId or getSerialCourseId is empty");
                        return;
                    }
                    MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
                    if (marketRouterApi == null) {
                        LogUtil.e("Suggestion_SeriesCourseVideoFragment", "jumpToH5Detail marketRouterApi == null");
                        return;
                    }
                    marketRouterApi.router("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=AudioDetailSeries&isImmerse=true&pullfrom=miniBar&id=" + SeriesCourseVideoFragment.this.h.getGuideCourseId() + "&courseId=" + SeriesCourseVideoFragment.this.h.getSerialCourseId());
                    return;
                }
                LogUtil.a("Suggestion_SeriesCourseVideoFragment", "onClick isFastClick true");
            }
        });
    }

    private void a(View view) {
        this.f9572a = (ConstraintLayout) view.findViewById(R.id.collapse_layout);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.expand_layout);
        this.i = constraintLayout;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.healthcourse.fragment.SeriesCourseVideoFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                SeriesCourseVideoFragment.this.f9572a.setVisibility(0);
                SeriesCourseVideoFragment.this.i.setVisibility(8);
                SeriesCourseVideoFragment.this.o = false;
            }
        });
    }

    private void b(View view) {
        final HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.full_screen_switch);
        healthImageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.healthcourse.fragment.SeriesCourseVideoFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                SeriesCourseVideoFragment seriesCourseVideoFragment = SeriesCourseVideoFragment.this;
                seriesCourseVideoFragment.f = !seriesCourseVideoFragment.f;
                if (SeriesCourseVideoFragment.this.f) {
                    SeriesCourseVideoFragment.this.i.setVisibility(8);
                    SeriesCourseVideoFragment.this.f9572a.setVisibility(8);
                    SeriesCourseVideoFragment.this.f9574c.setVisibility(8);
                    SeriesCourseVideoFragment.this.j.setVisibility(8);
                    healthImageView.setImageResource(R.drawable.show_data_screen);
                    return;
                }
                if (SeriesCourseVideoFragment.this.o) {
                    SeriesCourseVideoFragment.this.i.setVisibility(0);
                    SeriesCourseVideoFragment.this.f9572a.setVisibility(8);
                } else {
                    SeriesCourseVideoFragment.this.i.setVisibility(8);
                    SeriesCourseVideoFragment.this.f9572a.setVisibility(0);
                }
                if (SeriesCourseVideoFragment.this.l) {
                    SeriesCourseVideoFragment.this.j.setVisibility(0);
                } else {
                    SeriesCourseVideoFragment.this.j.setVisibility(8);
                }
                SeriesCourseVideoFragment.this.f9574c.setVisibility(0);
                healthImageView.setImageResource(R.drawable.clear_data_screen);
            }
        });
    }

    private void h(View view) {
        f(view);
        c(view);
        g(view);
        a(view);
        b(view);
        g();
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.healthcourse.fragment.SeriesCourseVideoFragment$8, reason: invalid class name */
    public class AnonymousClass8 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f9579b;

        AnonymousClass8(View view) {
            this.f9579b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            final View view = this.f9579b;
            view.post(new Runnable() { // from class: hov
                @Override // java.lang.Runnable
                public final void run() {
                    SeriesCourseVideoFragment.AnonymousClass8.b(view);
                }
            });
        }

        public static /* synthetic */ void b(View view) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[1];
            int height = view.getHeight();
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            float fHeight = rect.height() - (i + height);
            view.setTranslationY(fHeight);
            view.setTranslationY(fHeight);
            view.setVisibility(0);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", fHeight, 0.0f);
            objectAnimatorOfFloat.setDuration(400L);
            objectAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(BaseApplication.b(), R.anim.cubic_bezier_interpolator_20_80));
            objectAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(View view) {
        if (view == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new AnonymousClass8(view), 0L);
    }

    private void h() {
        EssenceVideoInfo essenceVideoInfo = this.h;
        if (essenceVideoInfo == null || TextUtils.isEmpty(essenceVideoInfo.getGuideText()) || TextUtils.isEmpty(this.h.getGuideCourseId())) {
            ReleaseLogUtil.c("Suggestion_SeriesCourseVideoFragment", "guideText is empty");
        } else {
            b(new BaseVideoFragment.PlayerCallback() { // from class: com.huawei.health.suggestion.ui.healthcourse.fragment.SeriesCourseVideoFragment.7
                @Override // com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment.PlayerCallback
                public void onVideoDurationChanged(long j) {
                    boolean z = ((int) j) / 1000 > SeriesCourseVideoFragment.this.h.getGuideShowTime();
                    if (SeriesCourseVideoFragment.this.l || !z || SeriesCourseVideoFragment.this.j == null) {
                        return;
                    }
                    SeriesCourseVideoFragment.this.l = true;
                    if (SeriesCourseVideoFragment.this.f) {
                        return;
                    }
                    SeriesCourseVideoFragment seriesCourseVideoFragment = SeriesCourseVideoFragment.this;
                    seriesCourseVideoFragment.d(seriesCourseVideoFragment.j);
                }
            });
        }
    }

    @Override // com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LogUtil.a("Suggestion_SeriesCourseVideoFragment", "onViewCreated: ");
        h(view);
        h();
    }

    @Override // com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment
    public void d() {
        EssenceVideoInfo essenceVideoInfo = this.h;
        if (essenceVideoInfo == null || TextUtils.isEmpty(essenceVideoInfo.getVideoCourseId())) {
            ReleaseLogUtil.d("Suggestion_SeriesCourseVideoFragment", "uploadBehavior essenceVideoInfo or videoCourseId is empty");
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.e("Suggestion_SeriesCourseVideoFragment", "uploadBehavior params invalid");
            return;
        }
        pdh pdhVar = new pdh();
        pdhVar.a(1000627);
        pdhVar.c(1);
        pdhVar.e(this.h.getVideoCourseId());
        pdhVar.c(this.h.getSerialCourseId());
        courseApi.uploadBehavior(pdhVar, new UiCallback<Boolean>() { // from class: com.huawei.health.suggestion.ui.healthcourse.fragment.SeriesCourseVideoFragment.9
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.d("Suggestion_SeriesCourseVideoFragment", "uploadBehavior onFailure errorInfo is：", str, "errorCode is：", Integer.valueOf(i));
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Boolean bool) {
                LogUtil.a("Suggestion_SeriesCourseVideoFragment", "uploadBehavior success");
            }
        });
    }

    @Override // com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LogUtil.a("Suggestion_SeriesCourseVideoFragment", "onStart");
    }

    @Override // com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LogUtil.a("Suggestion_SeriesCourseVideoFragment", BaseDialog.LIFE_CYCLE_ON_RESUME);
    }

    @Override // com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LogUtil.a("Suggestion_SeriesCourseVideoFragment", BaseDialog.LIFE_CYCLE_ON_PAUSE);
    }

    @Override // com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        LogUtil.a("Suggestion_SeriesCourseVideoFragment", "onStop");
    }

    @Override // com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        LogUtil.a("Suggestion_SeriesCourseVideoFragment", "onDestroyView");
    }

    @Override // com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Suggestion_SeriesCourseVideoFragment", "onDestroy");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a("Suggestion_SeriesCourseVideoFragment", "onConfigurationChanged");
        j();
        HandlerExecutor.c(new Runnable() { // from class: hop
            @Override // java.lang.Runnable
            public final void run() {
                this.f36989c.g();
            }
        }, 100L);
    }
}
