package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.ui.adapter.HistoricalRoutesGroupAdapter;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.route.utils.RouteSourceUtils;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.gch;
import defpackage.gdg;
import defpackage.gdi;
import defpackage.gdq;
import defpackage.gdr;
import defpackage.jbd;
import defpackage.lmf;
import defpackage.ltb;
import defpackage.njy;
import health.compact.a.CommonUtil;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HistoricalRoutesActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference<HistoricalRoutesActivity> f10825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f10826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HistoricalRoutesGroupAdapter f10827c;
    private CustomTitleBar d;
    private int e;
    private boolean g;
    private boolean j;
    private RelativeLayout k;
    private RelativeLayout m;
    private View n;
    private HealthRecycleView o;
    private List<gdq> i = new ArrayList();
    private boolean f = false;
    private int l = 258;
    private Handler h = new Handler(Looper.getMainLooper()) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.HistoricalRoutesActivity.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 220) {
                if (!HistoricalRoutesActivity.this.i.isEmpty()) {
                    HistoricalRoutesActivity historicalRoutesActivity = HistoricalRoutesActivity.this;
                    historicalRoutesActivity.d((List<gdq>) historicalRoutesActivity.i);
                } else {
                    HistoricalRoutesActivity.this.a();
                }
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f10825a = new WeakReference<>(this);
        setContentView(R.layout.historical_routes_page);
        g();
        f();
        i();
        j();
        clearBackgroundDrawable();
    }

    private void i() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.d("HistoricalRoutesActivity", "intent == null");
            return;
        }
        this.j = intent.getBooleanExtra(BasePairManagerJsApi.FROM_H5_KEY, false);
        this.e = intent.getIntExtra("from", 0);
        Uri uriB = AppRouterUtils.b(intent);
        if (uriB == null || uriB.isOpaque()) {
            LogUtil.d("HistoricalRoutesActivity", "uri is invalid");
            return;
        }
        String queryParameter = uriB.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM);
        this.g = uriB.getBooleanQueryParameter("isBackList", false);
        LogUtil.a("HistoricalRoutesActivity", "from : ", queryParameter);
        if ("push".equals(queryParameter)) {
            this.e = 2;
        }
        String queryParameter2 = uriB.getQueryParameter(BleConstants.SPORT_TYPE);
        if (!TextUtils.isEmpty(queryParameter2)) {
            try {
                this.l = Integer.parseInt(queryParameter2);
            } catch (NumberFormatException e) {
                LogUtil.c("HistoricalRoutesActivity", "parse sportType error: ", e.getMessage());
            }
        }
        if (this.g) {
            this.d.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: jjo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38677a.d(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        n();
    }

    private void n() {
        RunningRouteUtils.b(BaseApplication.b(), e(this.l), (HotPathCityInfo) null);
        finish();
    }

    private int e(int i) {
        return new HashMap<Integer, Integer>() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.HistoricalRoutesActivity.5
            {
                put(1, 258);
                put(2, 257);
                put(3, 259);
            }
        }.getOrDefault(Integer.valueOf(i), 258).intValue();
    }

    private void j() {
        int iD;
        h();
        int iE = e();
        int iD2 = d(b());
        LogUtil.a("HistoricalRoutesActivity", "goLiveFormatDay: ", Integer.valueOf(iD2));
        Date dateA = a(b());
        Date time = Calendar.getInstance().getTime();
        if (dateA.after(time)) {
            iD = d(time);
        } else {
            iD = d(dateA);
        }
        LogUtil.a("HistoricalRoutesActivity", "curFormatDay: ", Integer.valueOf(iD));
        if (iD2 == 0 || iD == 0) {
            return;
        }
        d(iE, iD2, iD);
    }

    private void d(int i, int i2, int i3) {
        CountDownLatch countDownLatch = new CountDownLatch(i);
        while (true) {
            int i4 = i3;
            int i5 = i2;
            i2 = i4;
            if (i <= 0) {
                return;
            }
            gch.b().getHotPathParticipateInfos(new gdg.d().b(i5).e(i2).b(), new b(this, countDownLatch));
            Date dateE = e(String.valueOf(i2));
            i3 = e(dateE) == 0 ? i2 : e(dateE);
            LogUtil.a("HistoricalRoutesActivity", "reqStartDay: ", Integer.valueOf(i2), " reqEndDay: ", Integer.valueOf(i3));
            i--;
        }
    }

    private int d(Date date) {
        String strE = ltb.e(date, "yyyyMMdd");
        if (TextUtils.isEmpty(strE)) {
            return 0;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException unused) {
            LogUtil.a("HistoricalRoutesActivity", "parse fail");
            return 0;
        }
    }

    private int e() {
        return (int) Math.ceil(((Calendar.getInstance().getTime().getTime() - b().getTime()) * 1.0d) / 8.5536E9d);
    }

    private int e(Date date) {
        Date time = Calendar.getInstance().getTime();
        if (date == null) {
            return 0;
        }
        Date dateA = a(date);
        if (dateA.after(time)) {
            return d(time);
        }
        return d(dateA);
    }

    private void g() {
        this.m = (RelativeLayout) findViewById(R.id.historical_routes_recycler_layout);
        this.f10826b = (RelativeLayout) findViewById(R.id.no_data_layout);
        this.n = findViewById(R.id.loading_layout);
        this.k = (RelativeLayout) findViewById(R.id.no_network_layout);
        this.d = (CustomTitleBar) findViewById(R.id.title_bar);
        if (CommonUtil.ab(this)) {
            return;
        }
        this.m.setVisibility(8);
        this.k.setVisibility(0);
    }

    private Date e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyyMMdd").parse(str);
        } catch (ParseException e) {
            LogUtil.c("TimeDateFormatUtil", "ParseException = ", e.getMessage());
            return null;
        }
    }

    private Date b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 2022);
        calendar.set(2, 3);
        calendar.set(5, 1);
        return calendar.getTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("event", 3);
        map.put("from", Integer.valueOf(this.e));
        map.put("pageStatus", z ? "true" : "false");
        lmf.d().c(BaseApplication.b(), RouteSourceUtils.RUNNING_ROUTE_ANALYSIS_1040087, map, 0);
    }

    private void f() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.historical_routes_recycler_view);
        this.o = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        HistoricalRoutesGroupAdapter historicalRoutesGroupAdapter = new HistoricalRoutesGroupAdapter(this, new ArrayList(), R.layout.historical_routes_group_item);
        this.f10827c = historicalRoutesGroupAdapter;
        this.o.setAdapter(historicalRoutesGroupAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        HandlerExecutor.c(new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final List<gdq> list) {
        LogUtil.a("HistoricalRoutesActivity", "getDataSuccess enter");
        LogUtil.a("HistoricalRoutesActivity", "getDataSuccess data.size=", Integer.valueOf(list.size()));
        runOnUiThread(new Runnable() { // from class: jjk
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(List list) {
        this.f10826b.setVisibility(8);
        this.m.setVisibility(0);
        this.f10827c.refreshDataChange(b((List<gdq>) list));
        d();
    }

    private void d() {
        if (this.n.getVisibility() == 0) {
            this.n.setVisibility(8);
        }
    }

    private void h() {
        this.n.setVisibility(0);
    }

    private Date a(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, 99);
        return calendar.getTime();
    }

    private void a(gdr gdrVar) {
        if (gdrVar != null) {
            gdrVar.d(RunningRouteUtils.a(RunningRouteUtils.a(), RunningRouteUtils.c(gdrVar.f())));
        }
    }

    private List<jbd> b(List<gdq> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            return arrayList;
        }
        HashMap map = new HashMap();
        for (gdq gdqVar : list) {
            if (gdqVar != null) {
                long jLongValue = gdqVar.b().longValue();
                a(gdqVar.d());
                long time = ltb.y(new Date(jLongValue)).getTime();
                if (!map.containsKey(Long.valueOf(time))) {
                    map.put(Long.valueOf(time), new ArrayList());
                }
                ((List) map.get(Long.valueOf(time))).add(gdqVar);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                jbd jbdVar = new jbd();
                jbdVar.c(((Long) entry.getKey()).longValue());
                List<gdq> list2 = (List) entry.getValue();
                if (njy.e(list2)) {
                    LogUtil.c("HistoricalRoutesActivity", "sortList is empty");
                } else {
                    Collections.sort(list2, new Comparator<gdq>(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.HistoricalRoutesActivity.4
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                        public int compare(gdq gdqVar2, gdq gdqVar3) {
                            return Long.compare(gdqVar3.b().longValue(), gdqVar2.b().longValue());
                        }
                    });
                    jbdVar.d(e(list2));
                    arrayList.add(jbdVar);
                }
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: jjn
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((jbd) obj2).a(), ((jbd) obj).a());
            }
        });
        LogUtil.a("HistoricalRoutesActivity", "convertGroup beanList=", arrayList);
        return arrayList;
    }

    private List<gdq> e(List<gdq> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (gdq gdqVar : list) {
            if (gdqVar == null) {
                LogUtil.c("HistoricalRoutesActivity", "hotPathParticipateHistory is null");
            } else {
                gdr gdrVarD = gdqVar.d();
                if (gdrVarD == null) {
                    LogUtil.c("HistoricalRoutesActivity", "hotPathOperationInfo is null");
                } else {
                    String strJ = gdrVarD.j();
                    if (!arrayList2.contains(strJ)) {
                        arrayList2.add(strJ);
                        arrayList.add(gdqVar);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        HistoricalRoutesGroupAdapter historicalRoutesGroupAdapter = this.f10827c;
        if (historicalRoutesGroupAdapter != null) {
            historicalRoutesGroupAdapter.e();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.h.removeMessages(HeartRateThresholdConfig.HEART_RATE_LIMIT);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.g) {
            n();
        } else {
            super.onBackPressed();
        }
    }

    public void c(boolean z) {
        if (this.j) {
            a(z);
        } else if (z) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putBoolean("isBackList", true);
            intent.putExtras(bundle);
            setResult(-1, intent);
        }
        super.finish();
    }

    private void a(boolean z) {
        LogUtil.a("HistoricalRoutesActivity", "setResultToH5");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackList", z);
            Intent intent = new Intent();
            intent.putExtra("result", HiJsonUtil.d(jSONObject));
            setResult(-1, intent);
            LogUtil.a("HistoricalRoutesActivity", "setResultToH5 success");
        } catch (JSONException e) {
            LogUtil.c("HistoricalRoutesActivity", "setResultToH5 error: %s", e.getMessage());
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class b extends UiCallback<gdi> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CountDownLatch f10830b;
        private WeakReference<HistoricalRoutesActivity> d;

        public b(HistoricalRoutesActivity historicalRoutesActivity, CountDownLatch countDownLatch) {
            this.d = new WeakReference<>(historicalRoutesActivity);
            this.f10830b = countDownLatch;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            WeakReference<HistoricalRoutesActivity> weakReference = this.d;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            LogUtil.c("HistoricalRoutesActivity", "loadData onFailure errorCode=", Integer.valueOf(i));
            this.d.get().a();
            this.f10830b.countDown();
            if (this.f10830b.getCount() == 0) {
                this.d.get().h.sendEmptyMessageDelayed(HeartRateThresholdConfig.HEART_RATE_LIMIT, 500L);
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(gdi gdiVar) {
            WeakReference<HistoricalRoutesActivity> weakReference = this.d;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            LogUtil.a("HistoricalRoutesActivity", "loadData onSuccess");
            List<gdq> listA = gdiVar.a();
            if (!njy.e(listA)) {
                LogUtil.a("HistoricalRoutesActivity", "list size: ", Integer.valueOf(listA.size()));
                this.d.get().i.addAll(listA);
                this.d.get().f = true;
            }
            this.f10830b.countDown();
            if (this.f10830b.getCount() == 0) {
                this.d.get().h.sendEmptyMessageDelayed(HeartRateThresholdConfig.HEART_RATE_LIMIT, 500L);
                this.d.get().e(this.d.get().f);
            }
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<HistoricalRoutesActivity> f10829c;

        public a(HistoricalRoutesActivity historicalRoutesActivity) {
            this.f10829c = new WeakReference<>(historicalRoutesActivity);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<HistoricalRoutesActivity> weakReference = this.f10829c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            HistoricalRoutesActivity historicalRoutesActivity = this.f10829c.get();
            if (historicalRoutesActivity.n.getVisibility() == 0) {
                historicalRoutesActivity.n.setVisibility(8);
            }
            historicalRoutesActivity.m.setVisibility(8);
            historicalRoutesActivity.f10826b.setVisibility(0);
        }
    }

    public static HistoricalRoutesActivity c() {
        WeakReference<HistoricalRoutesActivity> weakReference = f10825a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
