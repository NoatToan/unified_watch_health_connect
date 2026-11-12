package com.huawei.health.suggestion.ui.plan.viewmodel;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.viewholder.IntAiDialogViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.OverseaAiDialogViewHolder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import defpackage.btw;
import defpackage.buh;
import defpackage.hvu;
import defpackage.ibk;
import defpackage.irz;
import defpackage.njy;
import defpackage.pcp;
import defpackage.pdn;
import defpackage.pjg;
import defpackage.qrs;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class IntPlanDetailDataViewModel extends ViewModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f9792c;
    private IntPlan e;
    private boolean i = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f9790a = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.suggestion.ui.plan.viewmodel.IntPlanDetailDataViewModel.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Object obj = message.obj;
            if (obj instanceof ibk) {
                ibk ibkVar = (ibk) obj;
                int i = message.what;
                if (i == 0) {
                    IntPlanDetailDataViewModel.this.h.put(ibkVar.b(), true);
                    IntPlanDetailDataViewModel.this.f.setValue(ibkVar);
                    LogUtil.a("Suggestion_PlanDetailDataViewModel", "handleMessage add ItemData type:", Integer.valueOf(ibkVar.b()));
                } else {
                    if (i != 1) {
                        return;
                    }
                    IntPlanDetailDataViewModel.this.h.put(ibkVar.b(), false);
                    LogUtil.a("Suggestion_PlanDetailDataViewModel", "handleMessage delete ItemData type:", Integer.valueOf(ibkVar.b()));
                    IntPlanDetailDataViewModel.this.d.setValue(ibkVar);
                }
            }
        }
    };
    private MutableLiveData<ibk> f = new MutableLiveData<>();
    private MutableLiveData<ibk> d = new MutableLiveData<>();
    private SparseBooleanArray h = new SparseBooleanArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MutableLiveData<Boolean> f9791b = new MutableLiveData<>();

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ibk ibkVar, int i) {
        LogUtil.a("Suggestion_PlanDetailDataViewModel", "freshCurrentPlan viewType:", Integer.valueOf(ibkVar.b()), ",viewId:", Integer.valueOf(ibkVar.a()));
        c(ibkVar, i);
    }

    public void a(IntPlan intPlan) {
        if (intPlan == null) {
            return;
        }
        this.e = intPlan;
        g();
    }

    private void g() {
        int i;
        int i2;
        boolean zL;
        if (this.e == null) {
            LogUtil.j("Suggestion_PlanDetailDataViewModel", "freshPlanDetail() mCurrentPlan is null");
            return;
        }
        this.i = false;
        h();
        ArrayList arrayList = new ArrayList();
        if (this.e.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
            String strC = pjg.c();
            if (TextUtils.isEmpty(strC)) {
                zL = Utils.o();
                ReleaseLogUtil.d("Suggestion_PlanDetailDataViewModel", "freshPlanDetail cacheJson ", strC, " isH5AiFitnessPlan ", Boolean.valueOf(zL));
            } else {
                zL = btw.l(this.e);
            }
            i = zL ? 8 : 4;
        } else {
            arrayList.add(new ibk(1, 1));
            i = 2;
        }
        arrayList.add(new ibk(2, i));
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((ibk) arrayList.get(i3)).a(this.e);
        }
        ibk ibkVar = new ibk(3, 5);
        arrayList.add(ibkVar);
        int i4 = AnonymousClass2.d[this.e.getPlanType().ordinal()];
        if (i4 == 1) {
            i2 = 4041;
        } else if (i4 != 2) {
            i2 = i4 != 3 ? -1 : 4046;
        } else {
            i2 = 4047;
        }
        ibkVar.a(Integer.valueOf(i2));
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            a((ibk) arrayList.get(i5), 0);
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.plan.viewmodel.IntPlanDetailDataViewModel$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[IntPlan.PlanType.values().length];
            d = iArr;
            try {
                iArr[IntPlan.PlanType.AI_FITNESS_PLAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[IntPlan.PlanType.FIT_PLAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[IntPlan.PlanType.AI_RUN_PLAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ((PlanApi) Services.d("CoursePlanService", PlanApi.class)).getAllFitnessPackage(-1, new UiCallback<List<FitnessPackageInfo>>() { // from class: com.huawei.health.suggestion.ui.plan.viewmodel.IntPlanDetailDataViewModel.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_PlanDetailDataViewModel", "loadAllPlanList on freshPlanDetail fail.");
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<FitnessPackageInfo> list) {
                LogUtil.a("Suggestion_PlanDetailDataViewModel", "loadAllPlanList on freshPlanDetail success.");
            }
        });
    }

    public void b(IntAiDialogViewHolder.b bVar) {
        if (this.i || btw.l(this.e)) {
            return;
        }
        ibk ibkVar = new ibk(0, 0);
        d(bVar);
        ibkVar.a(bVar);
        a(ibkVar, 0);
    }

    public void d() {
        a(new ibk(0, 0), 1);
    }

    public void d(final boolean z) {
        this.i = true;
        this.f9791b.postValue(false);
        final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_PlanDetailDataViewModel", "loadAllPlanList planApi is null.");
        } else if (hvu.d()) {
            a(z);
            HandlerCenter.a().d(new Runnable() { // from class: hyo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37335a.h();
                }
            }, 2000L);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: hym
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(z, planApi);
                }
            });
        }
    }

    public /* synthetic */ void d(boolean z, PlanApi planApi) {
        if (irz.j()) {
            a(z);
        } else if (btw.o()) {
            f();
        } else {
            LogUtil.a("Suggestion_PlanDetailDataViewModel", "smart train plan entrance not display");
        }
        b(planApi);
        a(planApi);
    }

    private void f() {
        ibk ibkVar = new ibk(-10, 9);
        ibkVar.a(new Object());
        a(ibkVar, 0);
        if (qrs.af(BaseApplication.b())) {
            a(new ibk(-9, 7), 0);
        }
    }

    private void b(PlanApi planApi) {
        planApi.getAllFitnessPackage(-1, new UiCallback<List<FitnessPackageInfo>>() { // from class: com.huawei.health.suggestion.ui.plan.viewmodel.IntPlanDetailDataViewModel.5
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_PlanDetailDataViewModel", "loadAllPlanList onFailure.");
                IntPlanDetailDataViewModel.this.i = false;
                IntPlanDetailDataViewModel.this.f9791b.postValue(true);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<FitnessPackageInfo> list) {
                if (list == null) {
                    LogUtil.j("Suggestion_PlanDetailDataViewModel", "loadDomesticAllPlanList onSuccess data is null.");
                    return;
                }
                if (!hvu.d()) {
                    IntPlanDetailDataViewModel.this.i = true;
                    LogUtil.j("Suggestion_PlanDetailDataViewModel", "loadDomesticAllPlanList onSuccess size ", Integer.valueOf(list.size()));
                    for (int i = 0; i < list.size(); i++) {
                        FitnessPackageInfo fitnessPackageInfo = list.get(i);
                        if (fitnessPackageInfo != null && fitnessPackageInfo.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
                            ibk ibkVar = new ibk(i + 1, 3);
                            ibkVar.a(fitnessPackageInfo);
                            LogUtil.a("Suggestion_PlanDetailDataViewModel", "loadDomesticAllPlanList onSuccess info = ", fitnessPackageInfo.toString());
                            IntPlanDetailDataViewModel.this.a(ibkVar, 0);
                        }
                    }
                    if (list.size() % 2 != 0) {
                        IntPlanDetailDataViewModel.this.a(new ibk(list.size() + 1, 7), 0);
                        return;
                    }
                    return;
                }
                LogUtil.j("Suggestion_PlanDetailDataViewModel", "loadDomesticAllPlanList onSuccess size " + list.size());
            }
        });
    }

    private void a(boolean z) {
        ibk ibkVar = new ibk(0, 5);
        ibkVar.a(Integer.valueOf(z ? -4048 : 4048));
        a(ibkVar, 0);
    }

    private void a(PlanApi planApi) {
        planApi.getAllPlans(0, new UiCallback<pdn>() { // from class: com.huawei.health.suggestion.ui.plan.viewmodel.IntPlanDetailDataViewModel.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_PlanDetailDataViewModel", "loadAllPlanList onFailure.");
                IntPlanDetailDataViewModel.this.i = false;
                IntPlanDetailDataViewModel.this.f9791b.postValue(true);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(pdn pdnVar) {
                if (pdnVar != null && !njy.e(pdnVar.a())) {
                    IntPlanDetailDataViewModel.this.i = true;
                    List<pcp> listA = pdnVar.a();
                    IntPlanDetailDataViewModel.this.f9791b.postValue(Boolean.valueOf(pdnVar.a().size() == 0));
                    for (int i = 0; i < listA.size(); i++) {
                        pcp pcpVar = listA.get(i);
                        if (pcpVar != null) {
                            ibk ibkVar = new ibk(i + 10, 3);
                            ibkVar.a(pcpVar);
                            IntPlanDetailDataViewModel.this.a(ibkVar, 0);
                        }
                    }
                    IntPlanDetailDataViewModel.this.j();
                    return;
                }
                LogUtil.j("Suggestion_PlanDetailDataViewModel", "onSuccess getRunPlanInfoList is empty");
            }
        });
    }

    public void a() {
        a(new ibk(-1, 2), 1);
        a(new ibk(-1, 4), 1);
        a(new ibk(-1, 8), 1);
        a(new ibk(-1, 1), 1);
        a(new ibk(-1, 5), 1);
    }

    public void b() {
        ibk ibkVar;
        if (hvu.d()) {
            ibkVar = new ibk(-1, 5);
        } else {
            ibkVar = new ibk(-1, 3);
            c();
        }
        a(ibkVar, 1);
        this.i = false;
    }

    public void e() {
        a(new ibk(-1, 5), 1);
        ibk ibkVar = new ibk(-1, 3);
        c();
        a(ibkVar, 1);
        this.i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (Utils.o()) {
            String strE = buh.e("read_oversea_dialog");
            if (this.i) {
                if (strE == null || strE.equals("")) {
                    OverseaAiDialogViewHolder.b bVar = new OverseaAiDialogViewHolder.b();
                    bVar.d = BaseApplication.b().getString(R.string.IDS_sug_oversea_run_plan_tip);
                    bVar.f9771b = BaseApplication.b().getString(R.string.sug_dialog_yes);
                    bVar.f9770a = new View.OnClickListener() { // from class: hyq
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f37337c.c(view);
                        }
                    };
                    ibk ibkVar = new ibk(0, 6);
                    ibkVar.a(bVar);
                    a(ibkVar, 0);
                    buh.d("read_oversea_dialog", "1");
                }
            }
        }
    }

    public /* synthetic */ void c(View view) {
        c();
    }

    public void c() {
        a(new ibk(-1, 6), 1);
    }

    public void b(Observer<ibk> observer) {
        this.f.observeForever(observer);
    }

    public void d(Observer<Boolean> observer) {
        this.f9791b.observeForever(observer);
    }

    public void e(Observer<ibk> observer) {
        this.d.observeForever(observer);
    }

    public void c(Observer<ibk> observer) {
        this.f.removeObserver(observer);
    }

    public void h(Observer<Boolean> observer) {
        this.f9791b.removeObserver(observer);
    }

    public void a(Observer<ibk> observer) {
        this.d.removeObserver(observer);
    }

    private void c(ibk ibkVar, int i) {
        Message messageObtainMessage = this.f9790a.obtainMessage();
        messageObtainMessage.what = i;
        messageObtainMessage.obj = ibkVar;
        this.f9790a.sendMessage(messageObtainMessage);
    }

    private void d(IntAiDialogViewHolder.b bVar) {
        IntPlan intPlan = this.e;
        if (intPlan != null && btw.r(intPlan)) {
            bVar.e = R.drawable.head_portrait;
        } else {
            bVar.e = R.drawable.ic_aiplan_assistant;
        }
    }

    public void c(List<Integer> list) {
        this.f9792c = list;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }
}
