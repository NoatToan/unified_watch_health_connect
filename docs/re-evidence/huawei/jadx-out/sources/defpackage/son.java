package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.knit.section.view.CustomH5ProWebview;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public final class son extends CardViewHolder {
    private CustomH5ProWebview d;
    private d e;

    public son(View view, Context context, boolean z) {
        super(view, context, z);
        this.d = (CustomH5ProWebview) view.findViewById(R.id.health_trend_web_view);
        BaseActivity.setViewSafeRegion(true, (LinearLayout) view.findViewById(R.id.health_trend));
        LogUtil.a("HealthTrendCardDataCardViewHolder", "begin to push health trend H5ProWebView");
        f();
        if (this.e == null) {
            this.e = new d(this, this.d);
        }
        HandlerExecutor.c(new Runnable() { // from class: sot
            @Override // java.lang.Runnable
            public final void run() {
                this.f48477c.d();
            }
        });
    }

    /* synthetic */ void d() {
        d(this.d);
    }

    public void c() {
        qsp.b(this.d, this.e);
        this.d.c();
    }

    public void a() {
        CustomH5ProWebview customH5ProWebview = this.d;
        if (customH5ProWebview != null) {
            customH5ProWebview.onResume();
        }
    }

    public void e() {
        if (this.d != null) {
            LogUtil.a("HealthTrendCardDataCardViewHolder", "h5 begin to refresh trend card");
            this.d.execJs("window.nativeEvent&&window.nativeEvent('onResume')", null);
        }
    }

    public void b() {
        if (this.d != null) {
            LogUtil.a("HealthTrendCardDataCardViewHolder", "loginChange h5 begin to refresh trend card");
            f();
        }
    }

    private void f() {
        HandlerExecutor.b(new Runnable() { // from class: son.2
            @Override // java.lang.Runnable
            public void run() {
                ddv.b().loadEmbeddedH5(son.this.d, "com.huawei.health.h5.health-trend", new H5ProLaunchOption.Builder().addPath("#/cardView?from=1"));
            }
        });
    }

    private void d(View view) {
        if (view == null) {
            return;
        }
        qsp.a(view, this.e);
    }

    static class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<View> f48470a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<son> f48471c;

        public d(son sonVar, View view) {
            this.f48471c = new WeakReference<>(sonVar);
            this.f48470a = new WeakReference<>(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            son sonVar = this.f48471c.get();
            View view = this.f48470a.get();
            if (sonVar == null || view == null || view.getVisibility() != 0) {
                return;
            }
            HashMap map = new HashMap();
            map.put("click", 1);
            LogUtil.a("HealthTrendCardDataCardViewHolder", "uploadBiEvent health trend card visible, FUNCTION_CARD_2010229: ", map.toString());
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_TREND_CARD_2010229.value(), map, 0);
            qsp.b(view, this);
        }
    }
}
