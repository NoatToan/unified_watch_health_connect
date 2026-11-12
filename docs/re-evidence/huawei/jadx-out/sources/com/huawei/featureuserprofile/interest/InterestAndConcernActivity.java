package com.huawei.featureuserprofile.interest;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.interest.adapter.InterestAndConcernAdapter;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.ddq;
import defpackage.lpc;
import defpackage.lpd;
import defpackage.lph;
import defpackage.lpi;
import defpackage.lpj;
import defpackage.lpl;
import defpackage.lpn;
import defpackage.lpo;
import defpackage.lpp;
import defpackage.lqo;
import health.compact.a.HiCommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class InterestAndConcernActivity extends BaseActivity {
    private static final List<String> d;
    private Context e;
    private HealthRecycleView g;
    private InterestAndConcernAdapter i;
    private CustomTitleBar j;
    private List<lpi> l;
    private CommonDialog21 m;
    private RelativeLayout n;
    private ArrayList<String> r = new ArrayList<>(10);
    private ArrayList<String> h = new ArrayList<>(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f5564a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<Boolean> f5566c = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f5565b = new ArrayList();
    private e p = new e(this);
    private b o = new b(this);
    private a k = new a(this);
    private Handler f = new c(this);

    private boolean d(char c2) {
        return c2 == '1';
    }

    static {
        ArrayList arrayList = new ArrayList(10);
        d = arrayList;
        arrayList.add("跑步");
        arrayList.add("骑行");
        arrayList.add("走路");
        arrayList.add("健身");
        arrayList.add("体重管理");
        arrayList.add("睡眠质量");
        arrayList.add("高血压管理");
        arrayList.add("糖尿病管理");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = this;
        setContentView(R.layout.hw_health_interest_and_concern_layout);
        cancelAdaptRingRegion();
        i();
        h();
    }

    private void i() {
        o();
        this.n = (RelativeLayout) findViewById(R.id.interest_relative);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.interest_healthrecycleview);
        this.g = healthRecycleView;
        healthRecycleView.d(false);
        this.g.c(false);
        this.j = (CustomTitleBar) findViewById(R.id.me_userInfo_titlebar);
        if (LanguageUtil.g(this.e)) {
            this.j.setTitleSize(16.0f);
        }
    }

    private void h() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cwk
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c();
            }
        });
        this.j.setRightButtonClickable(true);
        this.j.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.interest.InterestAndConcernActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (InterestAndConcernActivity.this.f5566c.size() <= 0 || InterestAndConcernActivity.this.f5566c.size() != InterestAndConcernActivity.this.f5564a.size()) {
                    return;
                }
                InterestAndConcernActivity.this.f();
                SharedPreferenceManager.c("privacy_center", "hobby", String.valueOf(System.currentTimeMillis()));
                if (InterestAndConcernActivity.this.e instanceof Activity) {
                    ((Activity) InterestAndConcernActivity.this.e).finish();
                }
            }
        });
    }

    public /* synthetic */ void c() {
        lpd lpdVar = new lpd();
        lpdVar.c("777913529bb71e1a");
        lpdVar.b("新用户兴趣标签");
        lqo.b(this.e).c(lpdVar, this.p);
    }

    private void o() {
        if (this.m == null) {
            this.m = CommonDialog21.b(this.e);
        }
        this.m.setCancelable(true);
        this.m.b(this.e.getString(R.string.IDS_sns_waiting));
        this.m.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        CommonDialog21 commonDialog21 = this.m;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        this.m.dismiss();
        this.m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Handler handler;
        ArrayList arrayList = new ArrayList();
        lpj lpjVarA = lqo.b(BaseApplication.getContext()).a(new lph());
        if (lpjVarA == null || lpjVarA.getResultCode().intValue() != 0) {
            LogUtil.a("SMART_InterestAndConcernActivity", "rsp is null");
            e();
            return;
        }
        LogUtil.j("SMART_InterestAndConcernActivity", "User tag");
        for (lpn lpnVar : lpjVarA.d()) {
            if (lpnVar != null && !HiCommonUtil.b(lpnVar.a())) {
                arrayList.addAll(lpnVar.a());
            }
        }
        a(arrayList, true);
        LogUtil.a("SMART_InterestAndConcernActivity", "allLabelList :", this.f5564a.toString(), "allLabelBooleanList :", this.f5566c.toString(), ",labelValueAll.size():", Integer.valueOf(arrayList.size()));
        if (arrayList.size() != 0) {
            LogUtil.a("SMART_InterestAndConcernActivity", "mSportHealthInfoHandler is", this.o);
            b bVar = this.o;
            if (bVar != null) {
                bVar.sendEmptyMessage(3);
            }
        } else {
            HiUserPreference userPreference = HiHealthManager.d(this.e).getUserPreference("custom.onboarding_concern_status");
            if (userPreference == null || (handler = this.f) == null) {
                LogUtil.a("SMART_InterestAndConcernActivity", "hiUserPreference is null");
                b bVar2 = this.o;
                if (bVar2 != null) {
                    bVar2.sendEmptyMessage(3);
                }
            } else {
                this.f.sendMessage(handler.obtainMessage(2, userPreference));
            }
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HiUserPreference hiUserPreference) {
        if (hiUserPreference != null && !TextUtils.isEmpty(hiUserPreference.getValue()) && this.f5566c.size() > 0 && hiUserPreference.getValue().length() == d.size()) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                List<String> list = d;
                if (i >= list.size()) {
                    break;
                }
                if (d(hiUserPreference.getValue().charAt(i))) {
                    arrayList.add(list.get(i));
                }
                i++;
            }
            a(arrayList, false);
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("SMART_InterestAndConcernActivity", "enter adapterInit ", "allLabelList :", this.f5564a.toString(), "allLabelBooleanList :", this.f5566c.toString());
        this.i = new InterestAndConcernAdapter(this, this.r, this.f5564a, this.f5566c);
        this.g.setLayoutManager(new HealthLinearLayoutManager(this.e));
        this.g.setAdapter(this.i);
        this.i.e(new InterestAndConcernAdapter.OnCheckBoxClickListener() { // from class: cwf
            @Override // com.huawei.featureuserprofile.interest.adapter.InterestAndConcernAdapter.OnCheckBoxClickListener
            public final void onCheckBoxClick(boolean z, int i) {
                this.f31439c.e(z, i);
            }
        });
    }

    public /* synthetic */ void e(boolean z, int i) {
        this.f5566c.set(i, Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        l();
        ThreadPoolManager.c().execute(new Runnable() { // from class: cwc
            @Override // java.lang.Runnable
            public final void run() {
                this.f31438c.b();
            }
        });
        ddq.d().setEvent(this.e, String.valueOf(1100), new HashMap());
    }

    public /* synthetic */ void b() {
        Context context = BaseApplication.getContext();
        String string = a(this.f5565b).toString();
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("custom.onboarding_concern_status");
        hiUserPreference.setValue(string);
        HiHealthManager.d(context).setUserPreference(hiUserPreference);
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(10026);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(context).synCloud(hiSyncOption, null);
        LogUtil.a("SMART_InterestAndConcernActivity", "Interest_up_to_cloud", string);
        if ("00000000".equals(string)) {
            return;
        }
        SharedPreferenceManager.e(context, Integer.toString(10000), "hw_health_have_concern", Integer.toString(1), new StorageParams());
    }

    private void l() {
        lpn lpnVar = new lpn();
        lpnVar.b("运动喜好");
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < this.r.size(); i++) {
            if (this.f5566c.get(i).booleanValue()) {
                arrayList.add(this.r.get(i));
            }
        }
        this.f5565b.addAll(arrayList);
        lpnVar.c(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(lpnVar);
        LogUtil.a("SMART_InterestAndConcernActivity", "sportFavorUpload:", lpnVar.b(), " labelValues:", lpnVar.a());
        e(arrayList2);
    }

    private void e(List<lpn> list) {
        lpn lpnVar = new lpn();
        lpnVar.b("健康偏好");
        ArrayList arrayList = new ArrayList();
        int size = this.r.size();
        for (int i = 0; i < this.h.size(); i++) {
            if (this.f5566c.get(size + i).booleanValue()) {
                arrayList.add(this.h.get(i));
            }
        }
        this.f5565b.addAll(arrayList);
        lpnVar.c(arrayList);
        list.add(lpnVar);
        lpp lppVar = new lpp();
        lppVar.e(list);
        LogUtil.a("SMART_InterestAndConcernActivity", "healthLabelUpload:", lpnVar.b(), " labelValues:", lpnVar.a());
        lqo.b(this).a(lppVar, this.k);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        a();
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("SMART_InterestAndConcernActivity", "onDestroy");
        super.onDestroy();
        if (this.f != null) {
            this.f = null;
        }
        if (this.o != null) {
            this.o = null;
        }
        a();
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class c extends BaseHandler<InterestAndConcernActivity> {
        public c(InterestAndConcernActivity interestAndConcernActivity) {
            super(interestAndConcernActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(InterestAndConcernActivity interestAndConcernActivity, Message message) {
            if (message.what == 2 && (message.obj instanceof HiUserPreference)) {
                interestAndConcernActivity.d((HiUserPreference) message.obj);
            }
        }
    }

    private void a(List<String> list, boolean z) {
        Iterator<String> it = this.r.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (list.contains(it.next())) {
                if (z) {
                    this.f5566c.add(true);
                } else {
                    this.f5566c.set(i, true);
                }
            } else if (z) {
                this.f5566c.add(false);
            } else {
                ArrayList<Boolean> arrayList = this.f5566c;
                arrayList.set(i, arrayList.get(i));
            }
            i++;
        }
        b(list, z);
    }

    private void b(List<String> list, boolean z) {
        Iterator<String> it = this.h.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (list.contains(it.next())) {
                if (z) {
                    this.f5566c.add(true);
                } else {
                    this.f5566c.set(this.r.size() + i, true);
                }
            } else if (z) {
                this.f5566c.add(false);
            } else {
                this.f5566c.set(this.r.size() + i, this.f5566c.get(this.r.size() + i));
            }
            i++;
        }
    }

    private StringBuilder a(List<String> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = d.iterator();
        while (it.hasNext()) {
            if (list.contains(it.next())) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        LogUtil.a("SMART_InterestAndConcernActivity", "selectSportHealth :", sb);
        return sb;
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class a implements ResultCallback<CloudCommonReponse> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<InterestAndConcernActivity> f5568c;

        public a(InterestAndConcernActivity interestAndConcernActivity) {
            this.f5568c = new WeakReference<>(interestAndConcernActivity);
        }

        @Override // com.huawei.networkclient.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(CloudCommonReponse cloudCommonReponse) {
            InterestAndConcernActivity interestAndConcernActivity = this.f5568c.get();
            if (interestAndConcernActivity == null) {
                LogUtil.j("SMART_InterestAndConcernActivity", "InterestSaveLabelCallback activity null");
                return;
            }
            if (cloudCommonReponse.getResultCode().intValue() == 0) {
                LogUtil.a("SMART_InterestAndConcernActivity", "InterestSaveLabelCallback upload label success");
                return;
            }
            LogUtil.j("SMART_InterestAndConcernActivity", "InterestSaveLabelCallback upload label fail reason is [", cloudCommonReponse.getResultCode(), ", " + cloudCommonReponse.getResultDesc(), "]");
            interestAndConcernActivity.e();
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            LogUtil.e("SMART_InterestAndConcernActivity", "InterestSaveLabelCallback fail, error is ", th.getMessage());
            InterestAndConcernActivity interestAndConcernActivity = this.f5568c.get();
            if (interestAndConcernActivity != null) {
                interestAndConcernActivity.e();
            } else {
                LogUtil.j("SMART_InterestAndConcernActivity", "InterestSaveLabelCallback activity null");
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class e implements ResultCallback<lpc> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<InterestAndConcernActivity> f5569a;

        public e(InterestAndConcernActivity interestAndConcernActivity) {
            this.f5569a = new WeakReference<>(interestAndConcernActivity);
        }

        @Override // com.huawei.networkclient.ResultCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(lpc lpcVar) {
            InterestAndConcernActivity interestAndConcernActivity = this.f5569a.get();
            if (interestAndConcernActivity == null) {
                LogUtil.j("SMART_InterestAndConcernActivity", "SportHealthLabelCallback activity null");
                return;
            }
            if (lpcVar.getResultCode().intValue() != 0) {
                LogUtil.e("SMART_InterestAndConcernActivity", "LabelCallback rsp resultCode is", lpcVar.getResultCode(), " ", lpcVar.getResultDesc());
                interestAndConcernActivity.e();
            } else {
                if (lpcVar.b() != null && lpcVar.b().b() != null) {
                    interestAndConcernActivity.l = lpcVar.b().b();
                    b bVar = interestAndConcernActivity.o;
                    if (bVar != null) {
                        bVar.sendEmptyMessage(1);
                        return;
                    }
                    return;
                }
                LogUtil.e("SMART_InterestAndConcernActivity", "SportHealthLabelCallback rsp body data null");
                interestAndConcernActivity.e();
            }
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            LogUtil.e("SMART_InterestAndConcernActivity", "SportHealthLabelCallback Label fail, pageClose, error is ", th.getMessage());
            InterestAndConcernActivity interestAndConcernActivity = this.f5569a.get();
            if (interestAndConcernActivity != null) {
                interestAndConcernActivity.e();
            } else {
                LogUtil.j("SMART_InterestAndConcernActivity", "SportHealthLabelCallback activity null");
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class b extends BaseHandler<InterestAndConcernActivity> {
        public b(InterestAndConcernActivity interestAndConcernActivity) {
            super(interestAndConcernActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(InterestAndConcernActivity interestAndConcernActivity, Message message) {
            int i = message.what;
            if (i == 1) {
                interestAndConcernActivity.g();
                return;
            }
            if (i == 3) {
                interestAndConcernActivity.d();
            } else {
                if (i != 4) {
                    return;
                }
                interestAndConcernActivity.n.setVisibility(0);
                interestAndConcernActivity.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        List<lpi> list = this.l;
        if (list == null) {
            LogUtil.j("SMART_InterestAndConcernActivity", "interestAndConcern labelRules is null");
            return;
        }
        for (lpi lpiVar : list) {
            if (lpiVar == null) {
                LogUtil.j("SMART_InterestAndConcernActivity", "interestAndConcern labeRule null skip");
            } else if ("运动喜好".equals(lpiVar.e())) {
                e(lpiVar.a(), this.r);
            } else if ("健康偏好".equals(lpiVar.e())) {
                e(lpiVar.a(), this.h);
            } else {
                LogUtil.a("SMART_InterestAndConcernActivity", "interestAndConcern one labelRule");
            }
        }
        this.f5564a.addAll(this.r);
        this.f5564a.addAll(this.h);
        ThreadPoolManager.c().execute(new Runnable() { // from class: cwe
            @Override // java.lang.Runnable
            public final void run() {
                this.e.j();
            }
        });
    }

    private void e(lpl lplVar, ArrayList<String> arrayList) {
        if (lplVar == null || lplVar.a() == null) {
            LogUtil.a("SMART_InterestAndConcernActivity", "interestAndConcern label from cloud has empty data");
            return;
        }
        List<lpo> listA = lplVar.a();
        for (int i = 0; i < listA.size(); i++) {
            arrayList.add(listA.get(i).e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = this.o;
        if (bVar != null) {
            bVar.sendEmptyMessage(4);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
