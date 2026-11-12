package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.knit.section.listener.IWebViewRefreshListener;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lmf;
import defpackage.qdm;
import defpackage.qqw;
import defpackage.qsp;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionSleepManagement extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f7936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f7937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private H5ProWebView f7938c;
    private volatile boolean d;
    private View e;

    @Override // com.huawei.health.knit.section.view.BaseSection
    public boolean isSupportShare() {
        return false;
    }

    static class a implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
        private final WeakReference<SectionSleepManagement> d;

        public a(SectionSleepManagement sectionSleepManagement) {
            this.d = new WeakReference<>(sectionSleepManagement);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SectionSleepManagement sectionSleepManagement = this.d.get();
            if (sectionSleepManagement == null) {
                return;
            }
            if (sectionSleepManagement.hasSetBiEvent()) {
                LogUtil.a("SectionSleepManagement", "enter onGlobalLayout");
                sectionSleepManagement.c();
                qsp.b(sectionSleepManagement, this);
                return;
            }
            sectionSleepManagement.checkVisibilityAndSetBiEvent();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            SectionSleepManagement sectionSleepManagement = this.d.get();
            if (sectionSleepManagement == null) {
                return;
            }
            if (sectionSleepManagement.hasSetBiEvent()) {
                LogUtil.a("SectionSleepManagement", "enter onScrollChanged");
                sectionSleepManagement.c();
                qsp.c(sectionSleepManagement, this);
                return;
            }
            sectionSleepManagement.checkVisibilityAndSetBiEvent();
        }
    }

    public SectionSleepManagement(Context context) {
        this(context, null);
    }

    public SectionSleepManagement(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionSleepManagement(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        d();
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qsp.c(this, this.f7937b);
    }

    private void d() {
        e();
        if (this.e == null) {
            LogUtil.j("SectionSleepManagement", "initView mainView is null, start to inflate");
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.section_sleep_managerment, (ViewGroup) this, false);
            this.e = viewInflate;
            if (viewInflate == null) {
                LogUtil.a("SectionSleepManagement", "mainView is null");
                return;
            }
            this.f7936a = (LinearLayout) viewInflate.findViewById(R.id.layout_webview);
        }
        if (this.f7937b == null) {
            this.f7937b = new a(this);
        }
    }

    private void e() {
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.huawei.health.knit.section.view.SectionSleepManagement.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                SectionSleepManagement.this.d = true;
                LogUtil.a("SectionSleepManagement", "onViewAttachedToWindow, addOnScrollChangedListener");
                if (SectionSleepManagement.this.f7937b == null) {
                    SectionSleepManagement sectionSleepManagement = SectionSleepManagement.this;
                    sectionSleepManagement.f7937b = new a(sectionSleepManagement);
                }
                SectionSleepManagement sectionSleepManagement2 = SectionSleepManagement.this;
                qsp.a((View) sectionSleepManagement2, (ViewTreeObserver.OnScrollChangedListener) sectionSleepManagement2.f7937b);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (SectionSleepManagement.this.d) {
                    LogUtil.a("SectionSleepManagement", "onViewDetachedFromWindow, removeOnAttachStateChangeListene ");
                    SectionSleepManagement.this.removeOnAttachStateChangeListener(this);
                }
            }
        });
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
    public void biEvent() {
        HashMap map = new HashMap();
        map.put("client", "app");
        map.put("click", 1);
        lmf.d().c(BaseApplication.b(), AnalyticsValue.SLEEP_MANAGEMENT_2030128_EVENT_VALUE.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("SectionSleepManagement", "onVisible");
        if (!qdm.e().booleanValue()) {
            LogUtil.a("SectionSleepManagement", "SleepManagement is close");
        } else {
            qdm.w();
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionSleepManagement";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionSleepManagement", "start to bindViewParams, ", this);
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionSleepManagement", "no need to bind");
            return;
        }
        if (this.e == null) {
            d();
        }
        IWebViewRefreshListener iWebViewRefreshListener = (IWebViewRefreshListener) qqw.a(map, "LAYOUT_VIEW", (Class<Object>) IWebViewRefreshListener.class, (Object) null);
        if (iWebViewRefreshListener == null) {
            LogUtil.j("SectionSleepManagement", "listener is null");
            return;
        }
        if (this.f7938c == null) {
            this.f7936a.removeAllViews();
            H5ProWebView h5ProWebView = new H5ProWebView(getContext());
            this.f7938c = h5ProWebView;
            this.f7936a.addView(h5ProWebView, new LinearLayout.LayoutParams(-1, -2));
            iWebViewRefreshListener.notifyWebViewLoad(this.f7938c);
            return;
        }
        iWebViewRefreshListener.notifyDataChanged(qqw.e((Map) map, "BAR_CHART_TIME_INT", 0L));
    }
}
