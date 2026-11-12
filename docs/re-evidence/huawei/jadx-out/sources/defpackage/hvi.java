package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.PlanPoster;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.callback.JudgeCallback;
import com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hvi implements PlanDetailContract.Ipresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37215a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f37216c;
    private pcp d;
    private PlanDetailContract.Iview e;

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Ipresenter
    public void onResume() {
    }

    public hvi(String str, PlanDetailContract.Iview iview) {
        this.e = iview;
        if (iview == null) {
            LogUtil.j("PlanDetailPresenter", "constructor : mView is null.");
        } else {
            this.f37215a = str;
            this.f37216c = new a(Looper.getMainLooper(), this);
        }
    }

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Ipresenter
    public void getData() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("PlanDetailPresenter", "Jump getPlanData : planApi is null.");
            this.e.finishView();
        } else {
            planApi.getAllPlans(0, new UiCallback<pdn>() { // from class: hvi.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("PlanDetailPresenter", "No current plan now.", Integer.valueOf(i), " ", str);
                    if (hvi.this.e != null) {
                        hvi.this.e.finishView();
                    }
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(pdn pdnVar) {
                    if (hvi.this.e == null) {
                        LogUtil.j("PlanDetailPresenter", "onSuccess mView is null");
                        return;
                    }
                    if (pdnVar == null || njy.e(pdnVar.a())) {
                        LogUtil.j("PlanDetailPresenter", "onSuccess getRunPlanInfoList is empty");
                        JumpUtil.a(hvi.this.e.acquireContext(), (pcp) null);
                        hvi.this.e.finishView();
                        return;
                    }
                    hvi hviVar = hvi.this;
                    hviVar.d = ifi.e(hviVar.f37215a, pdnVar.a());
                    if (hvi.this.d != null) {
                        hvi.this.e.bindTitleText(hvi.this.d.f());
                        hvi.this.e.bindData(hvi.this.e());
                        if (hvi.this.f37216c != null) {
                            hvi.this.f37216c.sendEmptyMessage(1);
                            return;
                        }
                        return;
                    }
                    LogUtil.j("PlanDetailPresenter", "onSuccess mRunPlanInfo is null");
                    JumpUtil.a(hvi.this.e.acquireContext(), (pcp) null);
                    hvi.this.e.finishView();
                }
            });
        }
    }

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Ipresenter
    public void onDestroy() {
        Handler handler = this.f37216c;
        if (handler != null) {
            handler.removeMessages(1);
            this.f37216c = null;
        }
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> e() {
        if (this.e == null) {
            return new ArrayList();
        }
        pcp pcpVar = this.d;
        if (pcpVar == null) {
            return a();
        }
        PlanPoster planPoster = pcpVar.getPlanPoster();
        if (planPoster == null) {
            return a();
        }
        if (njy.e(planPoster.getPicturesForPhone()) && njy.e(planPoster.getPicturesForPad())) {
            return a();
        }
        if (qrs.af(this.e.acquireContext()) || qrs.ah(this.e.acquireContext())) {
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

    private List<String> a() {
        ArrayList arrayList = new ArrayList();
        if (qrs.af(this.e.acquireContext()) || qrs.ah(this.e.acquireContext())) {
            arrayList.add(qqy.a(BaseApplication.getContext().getResources().getString(R.string.sug_ai_run_plan_des_pad_url)));
            return arrayList;
        }
        arrayList.add(qqy.a(BaseApplication.getContext().getResources().getString(R.string.sug_ai_run_plan_des_url)));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        PlanDetailContract.Iview iview = this.e;
        if (iview == null) {
            LogUtil.j("PlanDetailPresenter", "addTradeView: mView is null");
            return;
        }
        View viewInflate = LayoutInflater.from(iview.acquireContext()).inflate(R.layout.sug_view_plan_create_btn, (ViewGroup) null);
        if (viewInflate == null) {
            return;
        }
        viewInflate.findViewById(R.id.sug_plan_create_btn).setOnClickListener(new View.OnClickListener() { // from class: hvg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
        this.e.addTradeView(viewInflate);
    }

    /* synthetic */ void d(View view) {
        b();
    }

    private void b() {
        if (this.e == null) {
            LogUtil.j("PlanDetailPresenter", "jump2CreateView: mView is null");
        } else {
            ifi.d(new JudgeCallback() { // from class: hvj
                @Override // com.huawei.health.suggestion.callback.JudgeCallback
                public final void onJudgeCallback(Object obj) {
                    this.e.e((Boolean) obj);
                }
            });
        }
    }

    /* synthetic */ void e(Boolean bool) {
        if (bool.booleanValue()) {
            this.e.showDialog();
            return;
        }
        pcp pcpVar = this.d;
        if (pcpVar == null) {
            return;
        }
        JumpUtil.a(String.valueOf(pcpVar.e()), this.e.acquireContext());
        this.e.finishView();
    }

    static class a extends BaseHandler<hvi> {
        a(Looper looper, hvi hviVar) {
            super(looper, hviVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(hvi hviVar, Message message) {
            if (message.what == 1) {
                hviVar.c();
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.plan.mvp.PlanDetailContract.Ipresenter
    public void viewCurrentPlan() {
        PlanDetailContract.Iview iview = this.e;
        if (iview == null) {
            return;
        }
        JumpUtil.a(iview.acquireContext());
    }
}
