package com.huawei.health.suggestion.ui.plan.viewmodel;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseBooleanArray;
import androidx.core.util.Consumer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.health.plan.model.PlanStatistics;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.hyr;
import defpackage.ibk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class PlanTabDataModel extends ViewModel {
    private int i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9796b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9797c = false;
    private boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9795a = false;
    private Handler d = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.suggestion.ui.plan.viewmodel.PlanTabDataModel.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Object obj = message.obj;
            if (obj instanceof ibk) {
                ibk ibkVar = (ibk) obj;
                PlanTabDataModel.this.h.put(ibkVar.b(), true);
                LogUtil.a("Suggestion_PlanTabDataModel", "handleMessage msg.itemData: ", Integer.valueOf(ibkVar.b()));
                PlanTabDataModel.this.g.setValue(ibkVar);
            }
        }
    };
    private MutableLiveData<ibk> g = new MutableLiveData<>();
    private SparseBooleanArray h = new SparseBooleanArray();
    private hyr j = new hyr();

    public void b(int i) {
        LogUtil.a("Suggestion_PlanTabDataModel", "loadViewList", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        this.i = i;
        int i2 = 0;
        arrayList.add(new ibk(0));
        arrayList.add(new ibk(1));
        if (i == 0) {
            arrayList.add(new ibk(2));
        } else {
            arrayList.add(new ibk(3));
        }
        while (i2 < arrayList.size()) {
            ibk ibkVar = (ibk) arrayList.get(i2);
            i2++;
            e(ibkVar, i2);
        }
    }

    private void e(ibk ibkVar, int i) {
        if (ibkVar == null) {
            LogUtil.j("Suggestion_PlanTabDataModel", "viewConfig is null");
            return;
        }
        int iB = ibkVar.b();
        ibk ibkVar2 = new ibk(i, iB);
        LogUtil.a("Suggestion_PlanTabDataModel", "resolveViewConfig viewId: ", Integer.valueOf(i), " viewType: ", Integer.valueOf(iB), "mPlanType", Integer.valueOf(this.i));
        if (iB == 0) {
            c(this.i, ibkVar2);
            return;
        }
        if (iB == 1) {
            d(this.i, ibkVar2);
            return;
        }
        if (iB == 2) {
            c(ibkVar2);
        } else if (iB != 3) {
            LogUtil.j("Suggestion_PlanTabDataModel", "unSupport viewType: ", Integer.valueOf(iB));
        } else {
            e(ibkVar2);
        }
    }

    public void c(int i) {
        if (!this.h.get(1)) {
            LogUtil.j("Suggestion_PlanTabDataModel", "refreshPlanStatisticsView: ", 1);
        } else {
            d(i, new ibk(1));
        }
    }

    public void a(int i) {
        if (!this.h.get(0)) {
            LogUtil.j("Suggestion_PlanTabDataModel", "refreshMyPlanView ", 0);
        } else {
            c(i, new ibk(0));
        }
    }

    public void d(int i, final ibk ibkVar) {
        final int i2 = i == 0 ? 2 : 3;
        this.j.b(new Consumer() { // from class: com.huawei.health.suggestion.ui.plan.viewmodel.PlanTabDataModel$$ExternalSyntheticLambda3
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f9802b.d(i2, ibkVar, (PlanStatistics) obj);
            }
        }, i2);
    }

    /* synthetic */ void d(int i, ibk ibkVar, PlanStatistics planStatistics) {
        if (planStatistics != null && planStatistics.acquireTotalPlan() != 0) {
            c(i, true);
        } else {
            c(i, false);
        }
        ibkVar.a(planStatistics);
        b(1, ibkVar);
    }

    private void c(int i, boolean z) {
        if (i == 2) {
            this.f9795a = z;
        } else {
            this.e = z;
        }
    }

    private void c(int i, final ibk ibkVar) {
        if (i == 0) {
            this.j.d(new Consumer() { // from class: com.huawei.health.suggestion.ui.plan.viewmodel.PlanTabDataModel$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.d.e(ibkVar, (Plan) obj);
                }
            });
        } else {
            this.j.e(new Consumer() { // from class: com.huawei.health.suggestion.ui.plan.viewmodel.PlanTabDataModel$$ExternalSyntheticLambda2
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f9800a.a(ibkVar, (Plan) obj);
                }
            });
        }
        b(0, ibkVar);
    }

    /* synthetic */ void e(ibk ibkVar, Plan plan) {
        if (plan == null) {
            this.f9797c = false;
        } else {
            this.f9797c = true;
        }
        ibkVar.a(plan);
        b(0, ibkVar);
    }

    /* synthetic */ void a(ibk ibkVar, Plan plan) {
        if (plan == null) {
            this.f9796b = false;
        } else {
            this.f9796b = true;
        }
        ibkVar.a(plan);
        b(0, ibkVar);
    }

    private void e(final ibk ibkVar) {
        this.j.c(new Consumer() { // from class: com.huawei.health.suggestion.ui.plan.viewmodel.PlanTabDataModel$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f9798a.b(ibkVar, (List) obj);
            }
        });
    }

    /* synthetic */ void b(ibk ibkVar, List list) {
        ibkVar.a(list);
        b(3, ibkVar);
    }

    private void c(final ibk ibkVar) {
        this.j.b(new Consumer() { // from class: com.huawei.health.suggestion.ui.plan.viewmodel.PlanTabDataModel$$ExternalSyntheticLambda4
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f9804a.e(ibkVar, (List) obj);
            }
        });
    }

    /* synthetic */ void e(ibk ibkVar, List list) {
        ibkVar.a(list);
        b(2, ibkVar);
    }

    public boolean e(int i) {
        if (i == 0) {
            return this.f9795a;
        }
        return this.e;
    }

    public boolean d(int i) {
        if (i == 0) {
            return this.f9797c;
        }
        return this.f9796b;
    }

    public void d(Observer<ibk> observer) {
        this.g.observeForever(observer);
    }

    public void d(LifecycleOwner lifecycleOwner) {
        this.g.removeObservers(lifecycleOwner);
    }

    private void b(int i, ibk ibkVar) {
        Message messageObtainMessage = this.d.obtainMessage(i);
        messageObtainMessage.obj = ibkVar;
        this.d.sendMessage(messageObtainMessage);
    }
}
