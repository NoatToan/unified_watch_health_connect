package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.view.dashboard.BloodSugarDashboardView;
import com.huawei.ui.commonui.linechart.view.dashboard.DashboardRingView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.adapter.SugarFoodReferenceAdapter;
import com.huawei.ui.main.stories.health.util.BloodSugarCallback;
import com.huawei.ui.main.stories.health.util.UpDataFileListener;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import defpackage.coq;
import defpackage.ddv;
import defpackage.ddx;
import defpackage.idy;
import defpackage.lsl;
import defpackage.qre;
import defpackage.qrs;
import defpackage.uvz;
import defpackage.uws;
import defpackage.vcy;
import defpackage.vdl;
import defpackage.vgo;
import defpackage.vgw;
import defpackage.vil;
import defpackage.wkb;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarFeedbackActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f27423a;
    private long ab;
    private CustomTitleBar ac;
    private String ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f27425c;
    private int d;
    private HealthColumnLinearLayout e;
    private HealthButton f;
    private int g;
    private String h;
    private BloodSugarDashboardView i;
    private double j;
    private long k;
    private HealthRecycleView l;
    private vcy m;
    private int n;
    private HealthButton o;
    private HealthTextView p;
    private HealthTextView q;
    private Handler r;
    private boolean s;
    private boolean t;
    private String u;
    private boolean v;
    private boolean w;
    private String x;
    private long y;
    private SugarFoodReferenceAdapter z;
    private List<uws> aa = new ArrayList(16);
    private e ae = new e(Looper.getMainLooper(), this);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g();
        h();
    }

    private void g() {
        if (qrs.v()) {
            setContentView(R.layout.health_data_bloodsugar_feedback_large);
        } else {
            setContentView(R.layout.health_data_bloodsugar_feedback);
        }
        clearBackgroundDrawable();
        a();
        this.ac = (CustomTitleBar) findViewById(R.id.health_healthdata_bloodsugar_title_layout);
        this.p = (HealthTextView) findViewById(R.id.health_blood_desc);
        this.f27425c = (HealthTextView) findViewById(R.id.blood_feed_back_top_year);
        this.f27424b = (HealthTextView) findViewById(R.id.blood_feed_back_top_time);
        this.f27423a = (HealthTextView) findViewById(R.id.blood_feed_back_top_type);
        this.l = (HealthRecycleView) findViewById(R.id.sugary_foods_recycler_view);
        this.q = (HealthTextView) findViewById(R.id.health_blood_desc_by_blood_number);
        this.o = (HealthButton) findViewById(R.id.btn_enter_diet);
        this.f = (HealthButton) findViewById(R.id.hw_show_health_data_inputbloodsugar_confirm);
        this.e = (HealthColumnLinearLayout) findViewById(R.id.blood_sugar_foot_container);
        this.f.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.i = (BloodSugarDashboardView) findViewById(R.id.blood_sugar_dashboard_view);
        this.l.setLayoutManager(new GridLayoutManager(this, 4) { // from class: com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarFeedbackActivity.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
    }

    private void a() {
        Intent intent = getIntent();
        if (intent != null) {
            this.ad = intent.getStringExtra("titleName");
            this.ab = intent.getLongExtra("time", 0L);
            this.j = intent.getDoubleExtra("bloodNum", 0.0d);
            this.d = intent.getIntExtra("bloodTimePeriod", 0);
            this.w = intent.getBooleanExtra("isEdit", false);
            this.s = intent.getBooleanExtra("bloodSugarDataIsFromMeter", false);
            this.k = intent.getLongExtra("showDefaultTime", 0L);
            this.y = intent.getLongExtra(ParsedFieldTag.TASK_MODIFY_TIME, 0L);
            this.g = intent.getIntExtra("clientId", 0);
            this.n = intent.getIntExtra("pageFrom", 0);
            if (this.k > 0) {
                this.t = true;
            } else {
                this.t = false;
            }
        }
    }

    private void h() {
        this.r = new Handler();
        this.h = CommonUtil.e();
        String strU = CommonUtil.u();
        this.x = strU;
        LogUtil.d("BloodSugarFeedbackActivity", "current language", this.h, strU);
        SugarFoodReferenceAdapter sugarFoodReferenceAdapter = new SugarFoodReferenceAdapter(this);
        this.z = sugarFoodReferenceAdapter;
        this.l.setAdapter(sugarFoodReferenceAdapter);
        this.m = new vcy();
        if (String.valueOf(1001).equals(uvz.d(this, this.d, (float) this.j).get("HEALTH_BLOOD_SUGAR_LEVEL_KEY"))) {
            this.v = true;
            this.e.setVisibility(0);
        } else {
            this.v = false;
        }
        this.m.b(new d());
        l();
        a(this.d, (float) this.j);
        i();
    }

    private void i() {
        this.q.setText(vdl.b(this.d, this));
    }

    private void a(int i, float f) {
        ArrayList arrayList = new ArrayList();
        List<Float> listB = uvz.b(i);
        int i2 = 0;
        int i3 = 0;
        while (i3 < listB.size() && i3 != listB.size() - 1 && f >= listB.get(i3).floatValue()) {
            i3++;
        }
        int[] iArrC = uvz.c(this);
        int length = (iArrC.length / 2) + i3;
        float f2 = 0.0f;
        while (i2 < listB.size()) {
            float fFloatValue = listB.get(i2).floatValue();
            int i4 = i2 == i3 ? length : i2;
            if (iArrC != null && i4 < iArrC.length) {
                arrayList.add(new DashboardRingView.a(f2, fFloatValue, iArrC[i4]));
            }
            i2++;
            f2 = fFloatValue;
        }
        this.i.setRingAreas(1.0f, 33.0f, arrayList);
        String strValueOf = String.valueOf(uvz.d(this, i, f).get("HEALTH_BLOOD_SUGAR_LEVEL_DESC"));
        if (iArrC != null && length < iArrC.length) {
            this.i.setStatusText(strValueOf, iArrC[length]);
        }
        this.i.setCurrentValue(f);
        this.i.b();
    }

    private void l() {
        if (!TextUtils.isEmpty(this.ad)) {
            this.ac.setTitleText(this.ad);
        }
        if (this.t) {
            this.f27425c.setText(DateFormatUtil.a(this.k, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD));
            this.f27424b.setText(DateFormatUtil.a(this.k, DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE));
        } else {
            this.f27425c.setText(DateFormatUtil.a(this.ab, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD));
            this.f27424b.setText(DateFormatUtil.a(this.ab, DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE));
        }
        String strC = vdl.c(this.d, this);
        LogUtil.d("BloodSugarFeedbackActivity", "current time period text ", strC, Integer.valueOf(this.d));
        if (!TextUtils.isEmpty(strC)) {
            this.f27423a.setText(strC);
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.ac.getRightIconImage().setScaleX(-1.0f);
        }
        this.ac.setRightSoftkeyBackground(getResources().getDrawable(R.drawable.ic_public_edit_1), qre.f(R.string.IDS_hwh_open_service_toolbar_edit));
        this.ac.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: uoo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
        f();
        if (this.w) {
            this.f.setVisibility(8);
            this.ac.setRightSoftkeyVisibility(0);
            this.ac.setRightButtonVisibility(0);
        } else {
            this.f.setVisibility(0);
            this.ac.setRightSoftkeyVisibility(8);
            this.ac.setRightButtonVisibility(8);
        }
    }

    public /* synthetic */ void c(View view) {
        if (this.w) {
            Intent intent = new Intent();
            if (this.s) {
                b(intent);
            } else {
                a(intent);
            }
            startActivityForResult(intent, 201);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.w) {
            return;
        }
        j();
    }

    private void j() {
        int i;
        LogUtil.a("BloodSugarFeedbackActivity", "mBloodTimePeriod ", Integer.valueOf(this.d), " mModifyTime ", Long.valueOf(this.y), " mTime ", Long.valueOf(this.ab), " mDefaultTime ", Long.valueOf(this.k));
        int i2 = this.d;
        if ((i2 == 2008 || i2 == 2010 || i2 == 2012) && this.j < 3.9d) {
            this.ae.sendEmptyMessage(30011);
            LogUtil.a("BloodSugarFeedbackActivity", "mBloodValue is lower than 3.9");
            return;
        }
        if (i2 == 2008 || i2 == 2009) {
            i = 10;
        } else if (i2 == 2010 || i2 == 2011) {
            i = 20;
        } else if (i2 == 2012 || i2 == 2013) {
            i = 30;
        } else {
            this.ae.sendEmptyMessage(30011);
            LogUtil.a("BloodSugarFeedbackActivity", "mBloodValue is MSG_DIET_REFRESH");
            i = 40;
        }
        if (i != 40) {
            b(i, this.ab);
        }
    }

    private void b(int i, long j) {
        int iA = DateFormatUtil.a(j);
        ReleaseLogUtil.c("BloodSugarFeedbackActivity", "queryTimeDietRecord dayFormat ", Integer.valueOf(iA));
        vil.d(iA, iA, (ResponseCallback<List<vgo>>) new a(i, this.ae));
    }

    private int e() {
        int i = this.d;
        return (i == 2009 || i == 2011 || i == 2013 || i == 2014) ? 2 : 1;
    }

    private void e(long j) {
        HashMap map = new HashMap(16);
        map.put("type", Integer.valueOf(e()));
        String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_FEED_BACK_2040134.value();
        map.put("click", "1");
        idy.b(strValue, map);
        LogUtil.a("BloodSugarFeedbackActivity", "addPath is /diet_recording_tool?date=", Long.valueOf(j));
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/diet_recording_tool?date=" + j + "&from=2");
        ddv.b().loadH5ProApp(this, ddx.e, builder);
    }

    private void f() {
        PrivacyDataModel privacyDataModel = new PrivacyDataModel();
        if (this.t) {
            privacyDataModel.setStartTime(this.k);
            privacyDataModel.setEndTime(this.k);
            privacyDataModel.setModifyTime(this.y);
        } else {
            privacyDataModel.setStartTime(this.ab);
            privacyDataModel.setEndTime(this.ab);
            privacyDataModel.setModifyTime(this.y);
        }
        privacyDataModel.setClientId(this.g);
        String string = getResources().getString(R.string.IDS_device_measure_sugar_value_unit);
        privacyDataModel.setDoubleValue(this.j);
        privacyDataModel.setDataTitle(UnitUtil.e(this.j, 1, 1) + string);
        wkb.e(this, this.ac, 108, privacyDataModel);
    }

    private void a(Intent intent) {
        intent.setClass(this, InputBloodSugarActivity.class);
        intent.putExtra("titleName", this.ad);
        if (this.t) {
            intent.putExtra("showDefaultTime", this.k);
        }
        intent.putExtra("time", this.ab);
        intent.putExtra("bloodNum", this.j);
        intent.putExtra("bloodTimePeriod", this.d);
        intent.putExtra("pageFrom", this.n);
    }

    private void b(Intent intent) {
        intent.setClass(this, BloodSugarDeviceMeasureActivity.class);
        intent.putExtra("entrance", "jump_from_blood_sugar_feedback");
        if (this.t) {
            intent.putExtra("showDefaultTime", this.k);
        }
        intent.putExtra("start_time", this.ab);
        intent.putExtra("time_period", this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        final String str = uvz.d(this, this.d, (float) this.j).get("HEALTH_BLOOD_SUGAR_LEVEL_KEY");
        LogUtil.a("BloodSugarFeedbackActivity", "read file current level", str);
        if (String.valueOf(1003).equals(str)) {
            str = str + "_" + this.d;
        }
        LogUtil.a("BloodSugarFeedbackActivity", "read file current level", str);
        this.m.e(new BloodSugarCallback() { // from class: uop
            @Override // com.huawei.ui.main.stories.health.util.BloodSugarCallback
            public final void result(int i, JSONObject jSONObject) throws Throwable {
                this.f50426b.a(str, i, jSONObject);
            }
        });
    }

    public /* synthetic */ void a(String str, int i, JSONObject jSONObject) throws Throwable {
        LogUtil.a("BloodSugarFeedbackActivity", "load blood file", Integer.valueOf(i));
        if (i != 0 || jSONObject == null) {
            LogUtil.j("BloodSugarFeedbackActivity", "load blood file");
            return;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("bloodSugarLevel");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                d(jSONObject2, jSONObject2.getString(OpAnalyticsConstants.OPERATION_ID), str);
            }
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("BloodSugarFeedbackActivity", "not find res id");
        } catch (NumberFormatException unused2) {
            LogUtil.e("BloodSugarFeedbackActivity", "num error");
        } catch (JSONException unused3) {
            LogUtil.e("BloodSugarFeedbackActivity", "JSONException ");
        }
    }

    private void d(JSONObject jSONObject, String str, String str2) throws Throwable {
        final String strReplace;
        LogUtil.a("BloodSugarFeedbackActivity", "current id is ", str, ", compare id is ", str2);
        if (str2.equals(str)) {
            Iterator<String> itKeys = jSONObject.keys();
            String string = jSONObject.getString("suggesionDesc");
            LogUtil.a("BloodSugarFeedbackActivity", "serviceId is ", string);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String str3 = this.m.b() + "strings";
            String strE = vdl.e(string, str3, this.h, this.x);
            LogUtil.a("BloodSugarFeedbackActivity", "path is ", str3);
            if (TextUtils.isEmpty(strE)) {
                strReplace = vdl.d(str3 + "/strings.xml", string);
            } else {
                strReplace = strE.replace("\\", "");
                LogUtil.a("BloodSugarFeedbackActivity", "desc is ", strReplace);
            }
            d(jSONObject, itKeys, strReplace);
            LogUtil.a("BloodSugarFeedbackActivity", "current desc ", this.u);
            this.r.post(new Runnable() { // from class: uon
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50424a.e(strReplace);
                }
            });
        }
    }

    public /* synthetic */ void e(String str) {
        if (!TextUtils.isEmpty(this.u)) {
            this.p.setText(this.u);
        } else {
            this.p.setText(str);
        }
    }

    private void d(JSONObject jSONObject, Iterator<String> it, String str) throws JSONException {
        while (it.hasNext()) {
            String next = it.next();
            LogUtil.a("BloodSugarFeedbackActivity", "replace key", next, str);
            if ("placeholder".equals(next)) {
                this.u = b(str, jSONObject.getJSONArray("placeholder"));
            }
        }
    }

    private String b(String str, JSONArray jSONArray) throws JSONException, NumberFormatException {
        if (jSONArray == null) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LogUtil.d("BloodSugarFeedbackActivity", "current desc ", str);
        int length = jSONArray.length();
        if (length == 1) {
            return d(str, jSONArray);
        }
        if (length == 2) {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            String string = jSONObject.getString("type");
            String string2 = jSONObject.getString("value");
            JSONObject jSONObject2 = jSONArray.getJSONObject(1);
            String string3 = jSONObject2.getString("type");
            String string4 = jSONObject2.getString("value");
            try {
                if ("100".equals(string)) {
                    if ("100".equals(string3)) {
                        return String.format(Locale.getDefault(), str, Integer.valueOf(Integer.parseInt(string2)), Integer.valueOf(Integer.parseInt(string4)));
                    }
                    return String.format(Locale.getDefault(), str, Integer.valueOf(Integer.parseInt(string2)), Float.valueOf(Float.parseFloat(string4)));
                }
                if ("101".equals(string)) {
                    if ("101".equals(string3)) {
                        return String.format(Locale.getDefault(), str, Float.valueOf(Float.parseFloat(string2)), Float.valueOf(Float.parseFloat(string4)));
                    }
                    return String.format(Locale.getDefault(), str, Float.valueOf(Float.parseFloat(string2)), Integer.valueOf(Integer.parseInt(string4)));
                }
                LogUtil.d("BloodSugarFeedbackActivity", "no replace");
                return "";
            } catch (NumberFormatException unused) {
                LogUtil.e("BloodSugarFeedbackActivity", "Value NumberFormatException");
            }
        } else {
            return d(str, jSONArray);
        }
    }

    private String d(String str, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = jSONArray.getJSONObject(0);
        String string = jSONObject.getString("type");
        String string2 = jSONObject.getString("value");
        try {
            if ("100".equals(string)) {
                return String.format(Locale.getDefault(), str, Integer.valueOf(Integer.parseInt(string2)));
            }
            if (string.equals("101")) {
                return String.format(Locale.getDefault(), str, Float.valueOf(Float.parseFloat(string2)));
            }
            LogUtil.d("BloodSugarFeedbackActivity", "no replace");
            return "";
        } catch (NumberFormatException unused) {
            LogUtil.e("BloodSugarFeedbackActivity", "Value NumberFormatException");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.m.a(new BloodSugarCallback() { // from class: uom
            @Override // com.huawei.ui.main.stories.health.util.BloodSugarCallback
            public final void result(int i, JSONObject jSONObject) throws Throwable {
                this.f50423c.b(i, jSONObject);
            }
        });
    }

    public /* synthetic */ void b(int i, JSONObject jSONObject) throws Throwable {
        if (i != 0 || jSONObject == null) {
            return;
        }
        try {
            d(jSONObject.getJSONArray("sugarFood"));
            this.r.post(new Runnable() { // from class: uol
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50422c.d();
                }
            });
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("BloodSugarFeedbackActivity", "not find res id");
        } catch (JSONException unused2) {
            LogUtil.e("BloodSugarFeedbackActivity", "JSONException ");
        }
    }

    public /* synthetic */ void d() {
        this.z.e(this.aa);
    }

    private void d(JSONArray jSONArray) throws Throwable {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            uws uwsVar = new uws();
            d(jSONObject, uwsVar, jSONObject.getString("name"));
            uwsVar.b(this.m.b() + "images" + File.separator + jSONObject.getString("pictureUrl"));
            if (this.aa.size() < 4) {
                this.aa.add(uwsVar);
            }
        }
    }

    private void d(JSONObject jSONObject, uws uwsVar, String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strE = vdl.e(str, this.m.b() + "strings", this.h, this.x);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            LogUtil.d("BloodSugarFeedbackActivity", "replace key", next);
            if ("placeholder".equals(next)) {
                strE = b(strE, jSONObject.getJSONArray("placeholder"));
            }
        }
        uwsVar.d(strE);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 201 && i2 == 200) {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.btn_enter_diet) {
            long jR = lsl.r(this.ab) / 1000;
            LogUtil.a("BloodSugarFeedbackActivity", "onClick currentTime ", Long.valueOf(jR));
            e(jR);
        }
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this.ac != null) {
            this.ac = null;
        }
        if (this.f != null) {
            this.f = null;
        }
        super.onDestroy();
    }

    static class e extends BaseHandler<BloodSugarFeedbackActivity> {
        WeakReference<BloodSugarFeedbackActivity> d;

        public e(Looper looper, BloodSugarFeedbackActivity bloodSugarFeedbackActivity) {
            super(looper, bloodSugarFeedbackActivity);
            this.d = new WeakReference<>(bloodSugarFeedbackActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(BloodSugarFeedbackActivity bloodSugarFeedbackActivity, Message message) {
            BloodSugarFeedbackActivity bloodSugarFeedbackActivity2 = this.d.get();
            if (bloodSugarFeedbackActivity2 == null || message == null) {
                LogUtil.j("BloodSugarFeedbackActivity", "BloodSugarFeedbackActivity weakReference or message is null");
                return;
            }
            int i = message.what;
            if (i == 30010) {
                if (bloodSugarFeedbackActivity2.o != null && bloodSugarFeedbackActivity2.f != null) {
                    bloodSugarFeedbackActivity2.o.setVisibility(0);
                    bloodSugarFeedbackActivity2.f.setBackgroundResource(R.color.transparent);
                    bloodSugarFeedbackActivity2.f.setTextColor(bloodSugarFeedbackActivity.getResources().getColor(R.color.emui_accent));
                    return;
                }
                LogUtil.j("BloodSugarFeedbackActivity", "mEnterDiet or mConfirmButton is null");
                return;
            }
            if (i == 30011) {
                if (bloodSugarFeedbackActivity2.o != null) {
                    bloodSugarFeedbackActivity2.o.setVisibility(8);
                    bloodSugarFeedbackActivity2.f.setTextAppearance(bloodSugarFeedbackActivity, R.style.health_button_style_emphasize);
                    return;
                } else {
                    LogUtil.j("BloodSugarFeedbackActivity", "mEnterDiet is null");
                    return;
                }
            }
            LogUtil.j("BloodSugarFeedbackActivity", "other message");
        }
    }

    static class d implements UpDataFileListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<BloodSugarFeedbackActivity> f27428c;

        private d(BloodSugarFeedbackActivity bloodSugarFeedbackActivity) {
            this.f27428c = new WeakReference<>(bloodSugarFeedbackActivity);
        }

        @Override // com.huawei.ui.main.stories.health.util.UpDataFileListener
        public void onFinish() {
            BloodSugarFeedbackActivity bloodSugarFeedbackActivity = this.f27428c.get();
            if (bloodSugarFeedbackActivity == null) {
                LogUtil.j("BloodSugarFeedbackActivity", "activity is null");
                return;
            }
            LogUtil.a("BloodSugarFeedbackActivity", "download onFinish");
            bloodSugarFeedbackActivity.b();
            if (bloodSugarFeedbackActivity.v) {
                bloodSugarFeedbackActivity.c();
            }
        }
    }

    static class a implements ResponseCallback<List<vgo>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e f27427b;
        int d;

        a(int i, e eVar) {
            this.d = i;
            this.f27427b = eVar;
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<vgo> list) {
            LogUtil.a("BloodSugarFeedbackActivity", "DietDiaryCbkInner errorCode ", Integer.valueOf(i), " list ", list);
            if (coq.d(list)) {
                this.f27427b.sendEmptyMessage(30010);
                return;
            }
            vgo vgoVar = list.get(0);
            if (vgoVar == null) {
                this.f27427b.sendEmptyMessage(30010);
                return;
            }
            boolean zB = b(vgoVar);
            LogUtil.a("BloodSugarFeedbackActivity", "queryTimeDietRecord isContainsMeal ", Boolean.valueOf(zB), " MSG_DIET_REFRESH is true, MSG_NO_DIET is false");
            if (zB) {
                this.f27427b.sendEmptyMessage(30011);
            } else {
                this.f27427b.sendEmptyMessage(30010);
            }
        }

        private boolean b(vgo vgoVar) {
            List<vgw> listA = vgoVar.a();
            boolean z = false;
            if (coq.d(listA)) {
                return false;
            }
            for (vgw vgwVar : listA) {
                if (!coq.d(vgwVar.c())) {
                    int i = vgwVar.i();
                    LogUtil.a("BloodSugarFeedbackActivity", "queryTimeDietRecord meals is ", Integer.valueOf(listA.size()), " timeType is ", Integer.valueOf(this.d), " whichMeal is ", Integer.valueOf(i));
                    if (this.d == i) {
                        LogUtil.a("BloodSugarFeedbackActivity", "queryTimeDietRecord has a dietRecord");
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
