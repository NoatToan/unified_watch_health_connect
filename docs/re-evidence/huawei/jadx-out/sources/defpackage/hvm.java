package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.basefitnessadvice.model.PlanPoster;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.callback.JudgeCallback;
import com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.health.suggestion.util.ResourceJudgeUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.trade.TradeViewApi;
import com.huawei.trade.datatype.TradeViewInfo;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hvm implements PlanDetailContract.Ipresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PlanApi f37219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f37220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f37221c;
    private FitnessPackageInfo d;
    private String e;
    private TradeViewApi i;
    private PlanDetailContract.Iview j;

    public hvm(String str, PlanDetailContract.Iview iview) {
        this.e = str;
        this.j = iview;
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        this.f37219a = planApi;
        if (this.j == null) {
            LogUtil.j("Suggestion_PlanDetailPresenter", "constructor : mView is null.");
        } else if (planApi == null) {
            LogUtil.j("Suggestion_PlanDetailPresenter", "constructor : planApi is null.");
            this.j.finishView();
        } else {
            this.f37220b = new a(Looper.getMainLooper(), this);
        }
    }

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Ipresenter
    public void getData() {
        if (this.f37219a == null) {
            this.f37219a = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        }
        PlanApi planApi = this.f37219a;
        if (planApi == null) {
            LogUtil.j("Suggestion_PlanDetailPresenter", "getData : planApi is null.");
            this.j.finishView();
            return;
        }
        FitnessPackageInfo fitnessPkgInfoByTempId = planApi.getFitnessPkgInfoByTempId(this.e);
        this.d = fitnessPkgInfoByTempId;
        if (fitnessPkgInfoByTempId == null) {
            LogUtil.j("Suggestion_PlanDetailPresenter", "null is mFitnessPackageInfo");
            this.j.finishView();
        } else {
            this.j.bindData(e());
            this.j.bindTitleText(this.d.acquireName());
            d();
        }
    }

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Ipresenter
    public void onDestroy() {
        h();
        Handler handler = this.f37220b;
        if (handler != null) {
            handler.removeMessages(1);
            this.f37220b.removeMessages(2);
            this.f37220b.removeMessages(3);
            this.f37220b = null;
        }
        this.j = null;
    }

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Ipresenter
    public void onResume() {
        PlanDetailContract.Iview iview = this.j;
        if (iview != null && CommonUtil.ab(iview.acquireContext())) {
            d();
        }
    }

    private List<String> e() {
        if (this.j == null) {
            return new ArrayList();
        }
        FitnessPackageInfo fitnessPackageInfo = this.d;
        if (fitnessPackageInfo == null) {
            return new ArrayList();
        }
        PlanPoster planPoster = fitnessPackageInfo.getPlanPoster();
        if (planPoster == null) {
            return new ArrayList();
        }
        if (qrs.af(this.j.acquireContext()) || qrs.ah(this.j.acquireContext())) {
            if (njy.e(planPoster.getPicturesForPad())) {
                return planPoster.getPicturesForPhone();
            }
            return planPoster.getPicturesForPad();
        }
        if (njy.e(planPoster.getPicturesForPhone())) {
            return planPoster.getPicturesForPad();
        }
        return planPoster.getPicturesForPhone();
    }

    private void d() {
        if (TextUtils.isEmpty(this.e)) {
            LogUtil.j("Suggestion_PlanDetailPresenter", "judgeResource: mPlanTempId is Empty");
        } else {
            ResourceJudgeUtil.c(2, this.e, 2, (JudgeCallback<Integer>) new JudgeCallback() { // from class: hvk
                @Override // com.huawei.health.suggestion.callback.JudgeCallback
                public final void onJudgeCallback(Object obj) {
                    this.e.c((Integer) obj);
                }
            });
        }
    }

    /* synthetic */ void c(Integer num) {
        if (num.intValue() == 2) {
            Handler handler = this.f37220b;
            if (handler != null) {
                handler.sendEmptyMessage(1);
                return;
            }
            return;
        }
        Handler handler2 = this.f37220b;
        if (handler2 != null) {
            handler2.sendEmptyMessage(2);
            this.f37220b.sendEmptyMessage(3);
        }
    }

    private void c() {
        if (this.j == null) {
            LogUtil.j("Suggestion_PlanDetailPresenter", "jump2CreateView: mView is null");
        } else {
            ifi.d(new JudgeCallback() { // from class: hvn
                @Override // com.huawei.health.suggestion.callback.JudgeCallback
                public final void onJudgeCallback(Object obj) {
                    this.f37222b.a((Boolean) obj);
                }
            });
        }
    }

    /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.j.showDialog();
        } else {
            JumpUtil.d(IntPlan.PlanType.FIT_PLAN.getType(), this.j.acquireContext(), this.e);
            this.j.finishView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.d == null) {
            LogUtil.j("Suggestion_PlanDetailPresenter", "addTradeView: mFitnessPackageInfo is null");
            return;
        }
        if (this.f37221c != null) {
            LogUtil.a("Suggestion_PlanDetailPresenter", "addTradeView: mTradeView is not null");
            return;
        }
        if (this.i == null) {
            this.i = (TradeViewApi) Services.d("TradeService", TradeViewApi.class);
        }
        if (this.i == null) {
            LogUtil.j("Suggestion_PlanDetailPresenter", "TradeViewApi is null");
            return;
        }
        TradeViewInfo tradeViewInfo = new TradeViewInfo(this.e, 2);
        HashMap map = new HashMap(16);
        map.put(WebViewHelp.BI_KEY_PULL_FROM, hbz.c().a());
        map.put("resourceId", hbz.c().b());
        map.put("resourceName", hbz.c().j());
        map.put("pullOrder", hbz.c().d());
        tradeViewInfo.setBiParams(map);
        View tradeView = this.i.getTradeView(this.j.acquireContext(), tradeViewInfo);
        this.f37221c = tradeView;
        this.j.addTradeView(tradeView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        PlanDetailContract.Iview iview = this.j;
        if (iview == null) {
            LogUtil.j("Suggestion_PlanDetailPresenter", "addTradeView: mView is null");
            return;
        }
        iview.recycleTradeView(this.f37221c);
        View viewInflate = LayoutInflater.from(this.j.acquireContext()).inflate(R.layout.sug_view_plan_create_btn, (ViewGroup) null);
        this.f37221c = viewInflate;
        if (viewInflate == null) {
            return;
        }
        if (viewInflate.findViewById(R.id.sug_plan_create_btn) != null) {
            this.f37221c.findViewById(R.id.sug_plan_create_btn).setOnClickListener(new View.OnClickListener() { // from class: hvo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.a(view);
                }
            });
        }
        this.j.addTradeView(this.f37221c);
    }

    /* synthetic */ void a(View view) {
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        View view = this.f37221c;
        if (view == null) {
            return;
        }
        this.j.recycleTradeView(view);
        TradeViewApi tradeViewApi = this.i;
        if (tradeViewApi != null) {
            tradeViewApi.cancelView(this.f37221c);
            this.i = null;
        }
        this.f37221c = null;
    }

    static class a extends BaseHandler<hvm> {
        a(Looper looper, hvm hvmVar) {
            super(looper, hvmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(hvm hvmVar, Message message) {
            if (message.what == 1) {
                hvmVar.a();
            } else if (message.what == 2) {
                hvmVar.h();
            } else if (message.what == 3) {
                hvmVar.b();
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Ipresenter
    public void viewCurrentPlan() {
        PlanDetailContract.Iview iview = this.j;
        if (iview != null) {
            JumpUtil.a(iview.acquireContext());
        }
    }
}
