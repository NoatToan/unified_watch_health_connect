package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.util.Consumer;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import defpackage.qdm;
import defpackage.qqw;
import defpackage.qre;
import defpackage.qsp;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionSummary extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f7953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f7954c;
    private boolean d;
    private String e;
    private H5ProWebView f;
    private View h;
    private c i;
    private int j;

    @Override // com.huawei.health.knit.section.view.BaseSection
    public boolean isSupportShare() {
        return false;
    }

    public SectionSummary(Context context) {
        super(context);
        this.f7953b = false;
        this.d = true;
    }

    private void e(Context context) {
        c();
        if (this.h == null) {
            View viewA = qre.a(context, R.layout.section_summary, this, false);
            this.h = viewA;
            if (viewA == null) {
                ReleaseLogUtil.d("R_SectionSummary", "initView mView is null context ", context);
                return;
            }
            this.f7954c = (LinearLayout) viewA.findViewById(R.id.section_summary_layout);
        }
        if (this.i == null) {
            this.i = new c(this);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        e(context);
        return this.h;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "R_SectionSummary";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.b("R_SectionSummary", "bindParamsToView currentParams ", map);
        this.j = qqw.c(map, "PAGE_TYPE", 0);
        this.e = qqw.d((Map) map, "PAGE_ID", "");
        this.f7952a = ((Boolean) qqw.a(map, "is_scroll_to_summary", (Class<boolean>) Boolean.class, false)).booleanValue();
        Consumer consumer = (Consumer) qqw.a(map, "CALL_BACK", (Class<Object>) Consumer.class, (Object) null);
        if (consumer == null) {
            ReleaseLogUtil.d("R_SectionSummary", "bindParamsToView consumer is null");
            return;
        }
        Context context = getContext();
        if (this.f7954c == null) {
            ReleaseLogUtil.d("R_SectionSummary", "bindParamsToView mLayout is null context ", context);
            e(context);
        }
        LinearLayout linearLayout = this.f7954c;
        if (linearLayout == null) {
            ReleaseLogUtil.d("R_SectionSummary", "bindParamsToView mLayout is null");
            return;
        }
        if (this.f != null) {
            ReleaseLogUtil.c("R_SectionSummary", "webView is not null");
            return;
        }
        linearLayout.removeAllViews();
        H5ProWebView h5ProWebView = new H5ProWebView(context);
        this.f = h5ProWebView;
        this.f7954c.addView(h5ProWebView, new ViewGroup.LayoutParams(-1, -2));
        consumer.accept(this.f);
        b();
    }

    private void b() {
        if (!this.f7952a || !this.d) {
            ReleaseLogUtil.c("R_SectionSummary", "mIsCardShowSummary is false");
            return;
        }
        if (this.f7954c == null || getKnitFragment() == null || getKnitFragment().getHealthScrollView() == null) {
            ReleaseLogUtil.c("R_SectionSummary", "view is null");
        } else {
            final HealthScrollView healthScrollView = getKnitFragment().getHealthScrollView();
            healthScrollView.postDelayed(new Runnable() { // from class: com.huawei.health.knit.section.view.SectionSummary.1
                @Override // java.lang.Runnable
                public void run() {
                    SectionSummary.this.d = false;
                    int[] iArr = new int[2];
                    healthScrollView.getLocationInWindow(iArr);
                    int[] iArr2 = new int[2];
                    SectionSummary.this.f7954c.getLocationOnScreen(iArr2);
                    healthScrollView.scrollTo(0, iArr2[1] - iArr[1]);
                }
            }, 1000L);
        }
    }

    static class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
        private final WeakReference<SectionSummary> e;

        c(SectionSummary sectionSummary) {
            this.e = new WeakReference<>(sectionSummary);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SectionSummary sectionSummary = this.e.get();
            if (sectionSummary != null && ViewTreeVisibilityListener.c(sectionSummary)) {
                sectionSummary.e();
                qsp.b(sectionSummary, this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            SectionSummary sectionSummary = this.e.get();
            if (sectionSummary != null && ViewTreeVisibilityListener.c(sectionSummary)) {
                sectionSummary.e();
                qsp.c(sectionSummary, this);
            }
        }
    }

    private void c() {
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.huawei.health.knit.section.view.SectionSummary.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                SectionSummary.this.f7953b = true;
                LogUtil.b("R_SectionSummary", "onViewAttachedToWindow, addOnScrollChangedListener");
                if (SectionSummary.this.i == null) {
                    SectionSummary sectionSummary = SectionSummary.this;
                    sectionSummary.i = new c(sectionSummary);
                }
                SectionSummary sectionSummary2 = SectionSummary.this;
                qsp.a((View) sectionSummary2, (ViewTreeObserver.OnScrollChangedListener) sectionSummary2.i);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (SectionSummary.this.f7953b) {
                    LogUtil.b("R_SectionSummary", "onViewDetachedFromWindow, removeOnAttachStateChangeListene");
                    SectionSummary.this.removeOnAttachStateChangeListener(this);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!TextUtils.isEmpty(this.e)) {
            qdm.d(this.e, this.f7952a);
            return;
        }
        Boolean boolE = qdm.e();
        LogUtil.b("R_SectionSummary", "onVisible isActiveSleepManagement ", boolE);
        if (Boolean.TRUE.equals(boolE)) {
            return;
        }
        if (1073 == this.j) {
            qdm.w();
        }
        if (1077 == this.j) {
            qdm.c(qdm.d(), System.currentTimeMillis());
        }
    }
}
