package com.huawei.health.suggestion.ui.plan.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.plan.aicoach.SourceActionEnum;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.adapter.SmartTrainPlanAdapter;
import com.huawei.health.suggestion.ui.plan.fragment.SmartTrainPlanFragment;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.btq;
import defpackage.btw;
import defpackage.ddi;
import defpackage.fxl;
import defpackage.gfk;
import defpackage.gfl;
import defpackage.gfm;
import defpackage.gnf;
import defpackage.gnm;
import defpackage.hqp;
import defpackage.ibk;
import defpackage.irz;
import defpackage.iun;
import defpackage.iuo;
import defpackage.ivd;
import defpackage.lsl;
import defpackage.njy;
import defpackage.nkf;
import defpackage.qey;
import defpackage.qfk;
import defpackage.qfy;
import defpackage.qre;
import health.compact.a.Services;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes9.dex */
public class SmartTrainPlanFragment extends BaseFragment {
    private static Handler e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SmartTrainPlanAdapter f9705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f9706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gnm f9707c;
    private boolean d;
    private Map<Integer, ResourceResultInfo> f;
    private qey g;
    private HealthRecycleView h;
    private View j;

    public static SmartTrainPlanFragment b() {
        return new SmartTrainPlanFragment();
    }

    private SmartTrainPlanFragment() {
    }

    public void a(qey qeyVar) {
        if (qeyVar == null) {
            LogUtil.d("Suggestion_SmartTrainPlanFragment", "setPlanDetailBean planDetailBean is null");
        } else {
            this.g = qeyVar;
            o();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.j = layoutInflater.inflate(R.layout.sug_fragment_smart_train_plan, viewGroup, false);
        n();
        this.d = true;
        e = new c(this);
        o();
        return this.j;
    }

    public boolean c() {
        HealthRecycleView healthRecycleView = this.h;
        return healthRecycleView != null && healthRecycleView.canScrollVertically(-1);
    }

    private void n() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.j.findViewById(R.id.train_plan_recycle_view);
        this.h = healthRecycleView;
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(getContext()));
        SmartTrainPlanAdapter smartTrainPlanAdapter = new SmartTrainPlanAdapter(getContext());
        this.f9705a = smartTrainPlanAdapter;
        this.h.setAdapter(smartTrainPlanAdapter);
        this.h.setNestedScrollingEnabled(false);
        this.h.setItemAnimator(null);
    }

    private void o() {
        if (!this.d) {
            LogUtil.d("Suggestion_SmartTrainPlanFragment", "initData isCreateView false");
            return;
        }
        if (btw.d(this.g)) {
            k();
        } else if (btw.e(this.g)) {
            ThreadPoolManager.c().execute(new e(this));
        } else {
            LogUtil.d("Suggestion_SmartTrainPlanFragment", "initData mPlanDetailBean isSmartPlan false");
        }
    }

    private void k() {
        qey qeyVar = this.g;
        if (qeyVar == null) {
            LogUtil.d("Suggestion_SmartTrainPlanFragment", "initSmartTrainPlanData mPlanDetailBean is null");
            return;
        }
        gnm gnmVar = (gnm) HiJsonUtil.d(qeyVar.a(), gnm.class);
        this.f9707c = gnmVar;
        if (gnmVar == null) {
            LogUtil.d("Suggestion_SmartTrainPlanFragment", "initSmartTrainPlanData metaData is null");
            return;
        }
        LogUtil.a("Suggestion_SmartTrainPlanFragment", "initSmartTrainPlanData");
        List<gnf.e> listA = this.f9707c.a();
        if (njy.b(listA)) {
            listA.sort(Comparator.comparingLong(new ddi()));
            for (gnf.e eVar : listA) {
                if (eVar != null && lsl.c(eVar.d(), System.currentTimeMillis())) {
                    d();
                    break;
                }
            }
        }
        if (btw.d(false)) {
            ReleaseLogUtil.c("Suggestion_SmartTrainPlanFragment", "user have benefit");
            c((LinkedHashMap<Integer, gfl>) null);
        } else {
            ReleaseLogUtil.c("Suggestion_SmartTrainPlanFragment", "get aiCoach data");
            g();
        }
    }

    public static class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<SmartTrainPlanFragment> f9712a;

        e(SmartTrainPlanFragment smartTrainPlanFragment) {
            this.f9712a = new WeakReference<>(smartTrainPlanFragment);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0019  */
        @Override // java.lang.Runnable
        public void run() {
            final boolean z;
            UserMemberInfo userMemberInfoA = irz.a();
            ivd ivdVarN = iuo.n();
            int iD = 0;
            if (userMemberInfoA != null) {
                z = userMemberInfoA.getMemberFlag() == 1 && !irz.d(userMemberInfoA);
            }
            if (ivdVarN != null && ivdVarN.d() != null) {
                iD = ivdVarN.d().d();
            }
            final float fC = iun.c();
            final SmartTrainPlanFragment smartTrainPlanFragment = this.f9712a.get();
            if (smartTrainPlanFragment == null || !smartTrainPlanFragment.isAdded() || smartTrainPlanFragment.isRemoving() || smartTrainPlanFragment.isDetached()) {
                ReleaseLogUtil.b("Suggestion_SmartTrainPlanFragment", "InnerRunnable fragment ", smartTrainPlanFragment);
                return;
            }
            LogUtil.a("Suggestion_SmartTrainPlanFragment", "InnerRunnable isVipUser:", Boolean.valueOf(z), " currentWeight:", Float.valueOf(fC), " loseWeightRate:", Integer.valueOf(iD));
            qey qeyVar = smartTrainPlanFragment.g;
            if (qeyVar != null) {
                qeyVar.c(btw.c(DateFormatUtil.d(qeyVar.i()), DateFormatUtil.d(qeyVar.b()), iD));
            }
            HandlerExecutor.b(new Runnable() { // from class: hue
                @Override // java.lang.Runnable
                public final void run() {
                    smartTrainPlanFragment.c(fC, z);
                }
            });
        }
    }

    private void l() {
        ((VipApi) Services.b("vip", VipApi.class)).getVipInfo(new VipCallback() { // from class: com.huawei.health.suggestion.ui.plan.fragment.SmartTrainPlanFragment.1
            @Override // com.huawei.health.vip.api.VipCallback
            public void onSuccess(Object obj) {
                UserMemberInfo userMemberInfo = obj instanceof UserMemberInfo ? (UserMemberInfo) obj : null;
                boolean z = (userMemberInfo == null || userMemberInfo.getMemberFlag() != 1 || irz.d(userMemberInfo)) ? false : true;
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = Boolean.valueOf(z);
                SmartTrainPlanFragment.e.sendMessage(messageObtain);
            }

            @Override // com.huawei.health.vip.api.VipCallback
            public void onFailure(int i, String str) {
                LogUtil.d("Suggestion_SmartTrainPlanFragment", "getVipInfo errCode:", Integer.valueOf(i), " errMsg:", str);
            }
        });
    }

    private void i() {
        nkf.a().d(new ResponseCallback() { // from class: htr
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                SmartTrainPlanFragment.c(i, (Pair) obj);
            }
        });
    }

    public static /* synthetic */ void c(int i, Pair pair) {
        ivd ivdVar = pair != null ? (ivd) pair.second : null;
        int iD = (ivdVar == null || ivdVar.d() == null) ? 0 : ivdVar.d().d();
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = Integer.valueOf(iD);
        e.sendMessage(messageObtain);
    }

    private void j() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: htz
            @Override // java.lang.Runnable
            public final void run() {
                this.f37147b.e();
            }
        });
    }

    public /* synthetic */ void e() {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi != null) {
            userProfileMgrApi.waitInit();
        }
        iun.e(new UiCallback<Float>() { // from class: com.huawei.health.suggestion.ui.plan.fragment.SmartTrainPlanFragment.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.d("Suggestion_SmartTrainPlanFragment", "getCurrentWeight errorCode:", Integer.valueOf(i), "errorInfo:", str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Float f) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 3;
                messageObtain.obj = f;
                SmartTrainPlanFragment.e.sendMessage(messageObtain);
            }
        });
    }

    public static class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<SmartTrainPlanFragment> f9710a;

        public c(SmartTrainPlanFragment smartTrainPlanFragment) {
            this.f9710a = new WeakReference<>(smartTrainPlanFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            SmartTrainPlanFragment smartTrainPlanFragment = this.f9710a.get();
            if (smartTrainPlanFragment == null || !smartTrainPlanFragment.isAdded() || smartTrainPlanFragment.isRemoving() || smartTrainPlanFragment.isDetached()) {
                ReleaseLogUtil.b("Suggestion_SmartTrainPlanFragment", "SmartTrainPlanHandler fragment ", smartTrainPlanFragment);
                return;
            }
            int i = message.what;
            if (i == 1) {
                smartTrainPlanFragment.f9705a.b(Boolean.valueOf((message.obj instanceof Boolean) && ((Boolean) message.obj).booleanValue()), (Float) null, (String) null);
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                smartTrainPlanFragment.f9705a.b((Boolean) null, Float.valueOf(message.obj instanceof Float ? ((Float) message.obj).floatValue() : 0.0f), (String) null);
            } else {
                int iIntValue = message.obj instanceof Integer ? ((Integer) message.obj).intValue() : 0;
                qey qeyVar = smartTrainPlanFragment.g;
                if (qeyVar != null) {
                    smartTrainPlanFragment.f9705a.b((Boolean) null, (Float) null, btw.c(DateFormatUtil.d(qeyVar.i()), DateFormatUtil.d(qeyVar.b()), iIntValue));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(float f, boolean z) {
        if (this.g == null) {
            LogUtil.d("Suggestion_SmartTrainPlanFragment", "initSmartWeightPlanData mPlanDetailBean is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ibk ibkVar = new ibk(6);
        hqp hqpVar = new hqp();
        hqpVar.a(this.g);
        hqpVar.b(f);
        hqpVar.c(z);
        ibkVar.a(hqpVar);
        arrayList.add(ibkVar);
        h();
        arrayList.addAll(c(this.f));
        this.f9705a.d(arrayList);
        l();
        i();
        j();
    }

    private void g() {
        gfm gfmVar = new gfm();
        gfmVar.a(SourceActionEnum.RUNNING_PAGE.getValue());
        gfmVar.c(fxl.d());
        gfmVar.a(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        gfk.e().b(gfmVar, new AnonymousClass2());
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.plan.fragment.SmartTrainPlanFragment$2, reason: invalid class name */
    public class AnonymousClass2 implements ResultCallback<LinkedHashMap<Integer, gfl>> {
        AnonymousClass2() {
        }

        @Override // com.huawei.networkclient.ResultCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final LinkedHashMap<Integer, gfl> linkedHashMap) {
            LogUtil.a("Suggestion_SmartTrainPlanFragment", "initData isCreateView false");
            HandlerExecutor.c(new Runnable() { // from class: htw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37145b.c(linkedHashMap);
                }
            });
        }

        public /* synthetic */ void c(LinkedHashMap linkedHashMap) {
            SmartTrainPlanFragment.this.c((LinkedHashMap<Integer, gfl>) linkedHashMap);
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            ReleaseLogUtil.b("Suggestion_SmartTrainPlanFragment", "getAICoachInfo fail", th);
            HandlerExecutor.c(new Runnable() { // from class: htx
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a();
                }
            });
        }

        public /* synthetic */ void a() {
            SmartTrainPlanFragment.this.c((LinkedHashMap<Integer, gfl>) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(LinkedHashMap<Integer, gfl> linkedHashMap) {
        b(getContext());
        ArrayList arrayList = new ArrayList();
        ibk ibkVar = new ibk(1);
        hqp hqpVar = new hqp();
        hqpVar.a(this.g);
        hqpVar.a(linkedHashMap);
        ibkVar.a(hqpVar);
        arrayList.add(ibkVar);
        if (btw.a(linkedHashMap)) {
            h();
            arrayList.addAll(c(this.f));
            this.f9705a.d(arrayList);
            return;
        }
        long jD = DateFormatUtil.d(this.g.i());
        boolean z = lsl.z(DateFormatUtil.d(this.g.b()));
        if (lsl.ab(jD)) {
            ibk ibkVar2 = new ibk(2);
            hqp hqpVar2 = new hqp();
            hqpVar2.c(qre.a(R.string.IDS_train_plan_not_start_tip, DateFormatUtil.a(jD, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMMDD)));
            hqpVar2.c(R.drawable.sug_train_plan_course_rest);
            hqpVar2.b(true);
            ibkVar2.a(hqpVar2);
            arrayList.add(ibkVar2);
            ibk ibkVar3 = new ibk(3);
            ibkVar3.a(new Object());
            arrayList.add(ibkVar3);
        } else if (!z) {
            arrayList.addAll(f());
        }
        h();
        arrayList.addAll(c(this.f));
        this.f9705a.d(arrayList);
    }

    private List<ibk> f() {
        ArrayList arrayList = new ArrayList();
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        boolean z = false;
        boolean z2 = true;
        for (qfy qfyVar : njy.e(this.g.n()) ? new ArrayList<>() : this.g.n()) {
            if (!njy.e(qfyVar.n())) {
                for (qfk qfkVar : qfyVar.n()) {
                    if (lsl.c(DateFormatUtil.d(qfkVar.s()), System.currentTimeMillis())) {
                        ibk ibkVar = new ibk(5);
                        ibkVar.a(qfkVar);
                        arrayList.add(ibkVar);
                        z2 = z2 && planApi != null && planApi.getCompletionStatus(qfkVar.y()) == 1;
                        z = true;
                    }
                }
            }
        }
        if (z) {
            ibk ibkVar2 = new ibk(2);
            ibkVar2.a(qre.a(R.string.IDS_train_plan_course_today, DateFormatUtil.a(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMMDD)));
            arrayList.add(0, ibkVar2);
        }
        ibk ibkVarA = a(z, z2);
        if (ibkVarA != null) {
            arrayList.removeIf(new Predicate() { // from class: htv
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return SmartTrainPlanFragment.e((ibk) obj);
                }
            });
            arrayList.add(ibkVarA);
        }
        if (arrayList.size() > 0) {
            ibk ibkVar3 = new ibk(3);
            ibkVar3.a(new Object());
            arrayList.add(ibkVar3);
        }
        return arrayList;
    }

    public static /* synthetic */ boolean e(ibk ibkVar) {
        return 5 == ibkVar.b() || 2 == ibkVar.b();
    }

    private ibk a(boolean z, boolean z2) {
        hqp hqpVar;
        boolean z3 = false;
        boolean z4 = false;
        for (gnf.e eVar : njy.e(this.f9707c.a()) ? new ArrayList<>() : this.f9707c.a()) {
            if (eVar != null) {
                if (lsl.c(eVar.d(), System.currentTimeMillis())) {
                    z3 = true;
                } else if (lsl.ag(eVar.d())) {
                    z4 = true;
                }
            }
        }
        if (z3 && !z) {
            hqpVar = new hqp();
            hqpVar.c(qre.f(this.f9706b ? R.string.IDS_train_plan_competition_complete : R.string.IDS_train_plan_match_day));
            hqpVar.c(R.drawable.sug_train_plan_match_day_small);
            hqpVar.a(true);
        } else if (z4 && !z) {
            hqpVar = new hqp();
            hqpVar.c(qre.f(R.string.IDS_train_plan_recovery_today));
            hqpVar.c(R.drawable.sug_train_plan_course_rest);
        } else if (z4 && z && (z2 || lsl.m(System.currentTimeMillis()) >= 19)) {
            hqpVar = new hqp();
            hqpVar.c(qre.f(R.string.IDS_train_plan_rest_early_today));
            hqpVar.c(R.drawable.sug_train_plan_course_rest);
        } else if (z) {
            hqpVar = null;
        } else {
            hqpVar = new hqp();
            hqpVar.c(qre.f(R.string.IDS_train_plan_rest_day));
            hqpVar.c(R.drawable.sug_train_plan_course_rest);
        }
        if (hqpVar == null) {
            return null;
        }
        ibk ibkVar = new ibk(2);
        ibkVar.a(hqpVar);
        return ibkVar;
    }

    public void d() {
        int[] iArr = {258, 264, OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE, 227};
        long jR = lsl.r(System.currentTimeMillis());
        long jC = lsl.c(System.currentTimeMillis());
        LogUtil.a("Suggestion_SmartTrainPlanFragment", "getSportRecords startTime:", Long.valueOf(jR), " endTime:", Long.valueOf(jC));
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(jR, jC);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchSequenceDataBySportType(hiDataReadOption, new d(this));
    }

    public static class d implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<SmartTrainPlanFragment> f9711a;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public d(SmartTrainPlanFragment smartTrainPlanFragment) {
            this.f9711a = new WeakReference<>(smartTrainPlanFragment);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (!(obj instanceof SparseArray)) {
                LogUtil.d("Suggestion_SmartTrainPlanFragment", "getSportRecords instanceof SparseArray is false");
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (!(sparseArray.get(i) instanceof List)) {
                LogUtil.d("Suggestion_SmartTrainPlanFragment", "getSportRecords instanceof List is false");
                return;
            }
            if (njy.e((List) sparseArray.get(i))) {
                LogUtil.d("Suggestion_SmartTrainPlanFragment", "getSportRecords healthDataList empty");
                return;
            }
            final SmartTrainPlanFragment smartTrainPlanFragment = this.f9711a.get();
            if (smartTrainPlanFragment == null) {
                LogUtil.d("Suggestion_SmartTrainPlanFragment", "getSportRecords smartTrainPlanFragment is null");
                return;
            }
            LogUtil.a("Suggestion_SmartTrainPlanFragment", "getSportRecords healthDataList not empty");
            smartTrainPlanFragment.f9706b = true;
            HandlerExecutor.b(new Runnable() { // from class: hud
                @Override // java.lang.Runnable
                public final void run() {
                    smartTrainPlanFragment.f9705a.d(qre.f(R.string.IDS_train_plan_competition_complete));
                }
            });
        }
    }

    private void h() {
        int i;
        if (btw.d(this.g)) {
            i = 4204;
        } else {
            if (!btw.e(this.g)) {
                LogUtil.d("Suggestion_SmartTrainPlanFragment", "getMarketingResource mPlanDetailBean isSmartPlan false");
                return;
            }
            i = 4041;
        }
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.d("Suggestion_SmartTrainPlanFragment", "getMarketingResource marketingApi is null.");
        } else {
            marketingApi.getResourceResultInfo(i).addOnSuccessListener(new a(this, marketingApi));
        }
    }

    public static class a implements OnSuccessListener<Map<Integer, ResourceResultInfo>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<SmartTrainPlanFragment> f9709c;
        MarketingApi e;

        a(SmartTrainPlanFragment smartTrainPlanFragment, MarketingApi marketingApi) {
            this.f9709c = new WeakReference<>(smartTrainPlanFragment);
            this.e = marketingApi;
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Map<Integer, ResourceResultInfo> map) {
            WeakReference<SmartTrainPlanFragment> weakReference = this.f9709c;
            if (weakReference == null) {
                LogUtil.d("Suggestion_SmartTrainPlanFragment", "ResourceSucceedListener mWeakReference is null.");
                return;
            }
            final SmartTrainPlanFragment smartTrainPlanFragment = weakReference.get();
            if (smartTrainPlanFragment == null) {
                LogUtil.d("Suggestion_SmartTrainPlanFragment", "ResourceSucceedListener smartTrainPlanFragment is null.");
                return;
            }
            final Map<Integer, ResourceResultInfo> mapFilterMarketingRules = this.e.filterMarketingRules(map);
            if (!Objects.equals(smartTrainPlanFragment.f, mapFilterMarketingRules)) {
                smartTrainPlanFragment.f = mapFilterMarketingRules;
                HandlerExecutor.b(new Runnable() { // from class: huc
                    @Override // java.lang.Runnable
                    public final void run() {
                        SmartTrainPlanFragment smartTrainPlanFragment2 = smartTrainPlanFragment;
                        smartTrainPlanFragment2.f9705a.c(smartTrainPlanFragment2.c((Map<Integer, ResourceResultInfo>) mapFilterMarketingRules));
                    }
                });
            } else {
                LogUtil.d("Suggestion_SmartTrainPlanFragment", "ResourceSucceedListener resultInfoMap is same.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<ibk> c(Map<Integer, ResourceResultInfo> map) {
        final ArrayList arrayList = new ArrayList();
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.d("Suggestion_SmartTrainPlanFragment", "getResourceItemDataList marketingApi is null.");
            return arrayList;
        }
        List<View> marketingViewList = marketingApi.getMarketingViewList(getContext(), map);
        if (njy.e(marketingViewList)) {
            LogUtil.d("Suggestion_SmartTrainPlanFragment", "getResourceItemDataList viewList is empty.");
            return arrayList;
        }
        marketingViewList.forEach(new Consumer() { // from class: htt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                SmartTrainPlanFragment.b(arrayList, (View) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ void b(List list, View view) {
        ibk ibkVar = new ibk(4);
        ibkVar.a(view);
        list.add(ibkVar);
    }

    private void b(Context context) {
        qey qeyVar;
        String strF;
        if (context == null || (qeyVar = this.g) == null || this.f9707c == null) {
            LogUtil.d("Suggestion_SmartTrainPlanFragment", "showFinishPlan mPlanDetailBean or mMetaData is null");
            return;
        }
        if (!lsl.z(DateFormatUtil.d(qeyVar.b()))) {
            LogUtil.a("Suggestion_SmartTrainPlanFragment", "showFinishPlan just remind plan finished");
            return;
        }
        if (!this.f9707c.d()) {
            LogUtil.a("Suggestion_SmartTrainPlanFragment", "showFinishPlan just remind competition finished");
            return;
        }
        if (njy.e(this.f9707c.a())) {
            strF = qre.a(R.string.IDS_competition_finish_dialog_content, this.g.g());
        } else {
            strF = qre.f(R.string.IDS_competition_finish_content);
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(strF).a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: hua
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void b(View view) {
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: hty
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.m();
                }
            });
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.d("Suggestion_SmartTrainPlanFragment", "stopSmartTrainPlan intPlanApi is null.");
        } else {
            planApi.stopSmartTrainPlan(this.g.h(), new UiCallback<String>() { // from class: com.huawei.health.suggestion.ui.plan.fragment.SmartTrainPlanFragment.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.c("Suggestion_SmartTrainPlanFragment", "stopSmartTrainPlan onFailure:", Integer.valueOf(i), " errorInfo:", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    LogUtil.a("Suggestion_SmartTrainPlanFragment", "stopSmartTrainPlan onSuccess:", str);
                    btq.e().e("PLAN_UPDATE");
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Handler handler = e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
