package com.huawei.health.suggestion.ui.plan.viewholder;

import android.os.SystemClock;
import android.view.View;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProReverseControlExecutor;
import com.huawei.health.knit.section.view.CustomH5ProWebview;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ddv;

/* JADX INFO: loaded from: classes9.dex */
public class AiPlanH5ViewHolder extends AbsFitnessViewHolder<IntPlan> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomH5ProWebview f9737b;

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void init(IntPlan intPlan) {
    }

    public AiPlanH5ViewHolder(View view) {
        super(view);
        LogUtil.a("Suggestion_AiPlanH5ViewHolder", "AiPlanH5ViewHolder create");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        CustomH5ProWebview customH5ProWebview = (CustomH5ProWebview) view.findViewById(R.id.int_plan_h5_web_view);
        this.f9737b = customH5ProWebview;
        customH5ProWebview.setIsDisallowIntercept(true);
        PluginSuggestion.getInstance().setH5ProWebView(this.f9737b);
        ddv.b().loadEmbeddedH5(this.f9737b, "com.huawei.health.h5.ai-weight", new H5ProLaunchOption.Builder().addPath("#/main_page"));
        LogUtil.a("Suggestion_AiPlanH5ViewHolder", "AiPlanH5ViewHolder create time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        HandlerCenter.a().d(new Runnable() { // from class: hxh
            @Override // java.lang.Runnable
            public final void run() {
                this.f37301c.a();
            }
        }, 300L);
    }

    public /* synthetic */ void a() {
        LogUtil.a("Suggestion_AiPlanH5ViewHolder", "h5ProInstance:", this.f9737b.getInstance());
        if (H5ProReverseControlExecutor.f6746b.containsValue(this.f9737b.getInstance())) {
            return;
        }
        LogUtil.a("Suggestion_AiPlanH5ViewHolder", "AiPlanH5ViewHolder: put h5ProInstance");
        H5ProReverseControlExecutor.f6746b.put(this.f9737b.getInstance());
    }

    public void a(String str) {
        LogUtil.a("Suggestion_AiPlanH5ViewHolder", "refreshH5WebView mCustomH5ProWebView ", this.f9737b, " sourceTag ", str);
        CustomH5ProWebview customH5ProWebview = this.f9737b;
        if (customH5ProWebview == null) {
            return;
        }
        customH5ProWebview.execJs("window.nativeEvent&&window.nativeEvent('onResume')", null);
    }
}
