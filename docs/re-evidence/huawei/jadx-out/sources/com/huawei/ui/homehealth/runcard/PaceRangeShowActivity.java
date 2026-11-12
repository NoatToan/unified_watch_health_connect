package com.huawei.ui.homehealth.runcard;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelRsp;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.main.stories.health.activity.healthdata.AthleticAbilityEmptyActivity;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningLevelCurrentData;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningStateIndexData;
import defpackage.dek;
import defpackage.dem;
import defpackage.haf;
import defpackage.ieg;
import defpackage.izn;
import defpackage.jyd;
import defpackage.qrs;
import defpackage.wka;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Date;

/* JADX INFO: loaded from: classes17.dex */
public class PaceRangeShowActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25768a;
    private HealthTextView aa;
    private HealthTextView ab;
    private HealthTextView ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthImageView f25769b;
    private HealthCardView d;
    private HealthButton e;
    private HealthImageView f;
    private HealthImageView g;
    private HealthTextView h;
    private HealthImageView i;
    private HealthImageView j;
    private HealthTextView k;
    private HealthTextView l;
    private boolean m;
    private HealthTextView o;
    private HealthTextView p;
    private HealthTextView q;
    private RunningStateIndexData r;
    private double s;
    private int[] t;
    private HealthTextView u;
    private HealthTextView v;
    private HealthTextView w;
    private HealthTextView x;
    private HealthTextView y;
    private HealthTextView z;
    private boolean n = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f25770c = new d(this);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pace_range_show);
        l();
        g();
        j();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        d();
    }

    private void l() {
        clearBackgroundDrawable();
        ((CustomTitleBar) findViewById(R.id.ctb_pace_range_show_title)).setTitleBarBackgroundColor(ContextCompat.getColor(this, com.huawei.health.servicesui.R.color.common_transparent));
        this.d = (HealthCardView) findViewById(R.id.hcv_top_prompt_container);
        this.o = (HealthTextView) findViewById(R.id.htv_knows_btn);
        this.k = (HealthTextView) findViewById(R.id.htv_learn_btn);
        HealthCardView healthCardView = (HealthCardView) findViewById(R.id.hcv_pace_range_list_container);
        d(healthCardView);
        this.u = (HealthTextView) healthCardView.findViewById(R.id.tv_pace_range_easy_run_label);
        this.ad = (HealthTextView) healthCardView.findViewById(R.id.tv_pace_range_marathon_label);
        this.aa = (HealthTextView) healthCardView.findViewById(R.id.tv_pace_range_lactic_acid_label);
        this.y = (HealthTextView) healthCardView.findViewById(R.id.tv_pace_range_anaerobic_label);
        this.z = (HealthTextView) healthCardView.findViewById(R.id.tv_pace_range_take_oxygen_label);
        this.i = (HealthImageView) healthCardView.findViewById(R.id.hiv_pace_range_easy_run);
        this.j = (HealthImageView) healthCardView.findViewById(R.id.hiv_pace_range_marathon);
        this.f = (HealthImageView) healthCardView.findViewById(R.id.hiv_pace_range_lactic_acid);
        this.f25769b = (HealthImageView) healthCardView.findViewById(R.id.hiv_pace_range_anaerobic);
        this.g = (HealthImageView) healthCardView.findViewById(R.id.hiv_range_take_oxygen);
        this.ab = (HealthTextView) healthCardView.findViewById(R.id.htv_current_range_one);
        this.w = (HealthTextView) healthCardView.findViewById(R.id.htv_current_range_two);
        this.p = (HealthTextView) healthCardView.findViewById(R.id.htv_current_range_three);
        this.q = (HealthTextView) healthCardView.findViewById(R.id.htv_current_range_four);
        this.x = (HealthTextView) healthCardView.findViewById(R.id.htv_current_range_five);
        this.v = (HealthTextView) healthCardView.findViewById(R.id.htv_current_range_six);
        this.l = (HealthTextView) findViewById(R.id.htv_learn_more);
        this.h = (HealthTextView) findViewById(R.id.htv_guide_bubbles);
        this.e = (HealthButton) findViewById(R.id.hbt_modify_pace_range);
    }

    private void d(HealthCardView healthCardView) {
        d((HealthTextView) healthCardView.findViewById(R.id.tv_pace_range_title), 36.0f);
        d((ConstraintLayout) healthCardView.findViewById(R.id.cl_pace_range_title), 36.0f);
        d((HealthTextView) healthCardView.findViewById(R.id.tv_current_pace), 26.0f);
        d((ConstraintLayout) healthCardView.findViewById(R.id.cl_current_pace), 26.0f);
    }

    private void d(View view, float f) {
        view.setLayoutParams(new LinearLayout.LayoutParams(0, -1, f));
    }

    private void g() {
        m();
        n();
        p();
        k();
    }

    private void j() {
        this.o.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.e.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("Track_PaceRangeShowActivity", "onClick view is null");
            return;
        }
        if (qrs.c(500)) {
            LogUtil.j("Track_PaceRangeShowActivity", "click button is too fast");
            return;
        }
        int id = view.getId();
        if (id == R.id.htv_knows_btn) {
            f();
        }
        if (id == R.id.htv_learn_btn) {
            e();
        }
        if (id == R.id.htv_learn_more) {
            b();
        }
        if (id == R.id.hbt_modify_pace_range) {
            a();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.n) {
            this.n = false;
            if (!SharedPreferenceManager.a("pace_zone_module_id", "guide_showed_bottom_modify")) {
                h();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private void m() {
        if (UnitUtil.f()) {
            this.s = 1.609344d;
        } else {
            this.s = 1.0d;
        }
    }

    private void i() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeShowActivity.4
            @Override // java.lang.Runnable
            public void run() {
                int[] iArrD = haf.d();
                if (iArrD.length <= 1) {
                    LogUtil.j("Track_PaceRangeShowActivity", "getEachPaceRangeValue paceZoneArray is default");
                    iArrD = haf.e();
                }
                LogUtil.a("Track_PaceRangeShowActivity", "paceZoneArray is ", Arrays.toString(iArrD));
                Message messageObtain = Message.obtain();
                messageObtain.what = 103;
                messageObtain.obj = iArrD;
                if (PaceRangeShowActivity.this.f25770c != null) {
                    PaceRangeShowActivity.this.f25770c.sendMessage(messageObtain);
                } else {
                    LogUtil.j("Track_PaceRangeShowActivity", "getEachPaceRangeValue mHandler is null");
                }
            }
        });
    }

    private void n() {
        this.u.setText(e(1));
        this.ad.setText(e(2));
        this.aa.setText(e(3));
        this.y.setText(e(4));
        this.z.setText(e(5));
    }

    private void p() {
        if (LanguageUtil.ba(this)) {
            this.i.setImageResource(R.drawable.pace_rang_connection_line_mirroring);
            this.j.setImageResource(R.drawable.pace_rang_connection_line_mirroring);
            this.f.setImageResource(R.drawable.pace_rang_connection_line_mirroring);
            this.f25769b.setImageResource(R.drawable.pace_rang_connection_line_mirroring);
            this.g.setImageResource(R.drawable.pace_rang_connection_line_mirroring);
            return;
        }
        this.i.setImageResource(R.drawable.pace_rang_connection_line);
        this.j.setImageResource(R.drawable.pace_rang_connection_line);
        this.f.setImageResource(R.drawable.pace_rang_connection_line);
        this.f25769b.setImageResource(R.drawable.pace_rang_connection_line);
        this.g.setImageResource(R.drawable.pace_rang_connection_line);
    }

    private void t() {
        this.d.setVisibility(this.m && !SharedPreferenceManager.a("pace_zone_module_id", "guide_showed_top_know") && !this.f25768a ? 0 : 8);
    }

    private void k() {
        this.h.setVisibility(SharedPreferenceManager.a("pace_zone_module_id", "guide_showed_bottom_modify") ? 8 : 0);
    }

    private void d() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: swm
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c();
            }
        });
    }

    public /* synthetic */ void c() {
        this.m = dek.c();
        int iB = ieg.b(new Date(System.currentTimeMillis()));
        new jyd().c((Context) this, iB, iB, 0, (IBaseResponseCallback) new b(this));
    }

    private void f() {
        this.d.setVisibility(8);
        SharedPreferenceManager.e("pace_zone_module_id", "guide_showed_top_know", true);
    }

    private void e() {
        Intent intent = new Intent(this, (Class<?>) AthleticAbilityEmptyActivity.class);
        intent.putExtra("athletic_ability_empty_flag", "running_no_record");
        startActivity(intent);
    }

    private void b() {
        dem.b().a("PACE_ZONE");
    }

    private void h() {
        this.h.setVisibility(8);
        SharedPreferenceManager.e("pace_zone_module_id", "guide_showed_bottom_modify", true);
    }

    private void a() {
        Intent intent = new Intent(this, (Class<?>) PaceRangeActivity.class);
        intent.putExtra("running_level_data", this.r);
        intent.putExtra("setting_auto_calc_key_status", this.m);
        intent.putExtra("intent_pace_zone", this.t);
        startActivityForResult(intent, 1);
    }

    private boolean d(RunningStateIndexData runningStateIndexData) {
        if (runningStateIndexData == null) {
            LogUtil.j("Track_PaceRangeShowActivity", "hasRunningDataFromCloud data is null");
            return false;
        }
        RunningLevelCurrentData runningLevelCurrentData = runningStateIndexData.getRunningLevelCurrentData();
        if (runningLevelCurrentData == null) {
            LogUtil.j("Track_PaceRangeShowActivity", "hasRunningDataFromCloud runningLevelCurrentData is null");
            return false;
        }
        if (runningLevelCurrentData.getLastCurrentRunLevel() != 0.0f) {
            return true;
        }
        LogUtil.j("Track_PaceRangeShowActivity", "hasRunningDataFromCloud currentRunLevel is zero");
        return false;
    }

    private String e(int i) {
        return getResources().getString(com.huawei.ui.main.R.string.IDS_pace_range_label_number, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.ab.setText(izn.a((float) (((double) this.t[0]) * this.s)));
        this.w.setText(izn.a((float) (((double) this.t[1]) * this.s)));
        this.p.setText(izn.a((float) (((double) this.t[2]) * this.s)));
        this.q.setText(izn.a((float) (((double) this.t[3]) * this.s)));
        this.x.setText(izn.a((float) (((double) this.t[4]) * this.s)));
        this.v.setText(getString(R.string.IDS_pace_less_than_or_equal_to, new Object[]{izn.a((float) (((double) this.t[5]) * this.s))}));
    }

    private void d(float f) {
        this.ab.setText(dek.b(this, 0, f, this.s));
        this.w.setText(dek.b(this, 1, f, this.s));
        this.p.setText(dek.b(this, 2, f, this.s));
        this.q.setText(dek.b(this, 3, f, this.s));
        this.x.setText(dek.b(this, 4, f, this.s));
        this.v.setText(getString(R.string.IDS_pace_less_than_or_equal_to, new Object[]{dek.b(this, 5, f, this.s)}));
    }

    private void a(float f) {
        final int[] iArr = {dek.c(0, f), dek.c(1, f), dek.c(2, f), dek.c(3, f), dek.c(4, f), dek.c(5, f)};
        this.t = iArr;
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeShowActivity.2
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("Track_PaceRangeShowActivity", "savePaceZoneValue currentPaceZone is ", Arrays.toString(iArr));
                dek.b(iArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj) {
        if (obj instanceof GetRunLevelRsp) {
            RunningStateIndexData runningStateIndexDataC = wka.c((GetRunLevelRsp) obj);
            if (d(runningStateIndexDataC)) {
                this.f25768a = true;
                this.r = runningStateIndexDataC;
            } else {
                this.f25768a = false;
            }
        } else {
            this.f25768a = false;
        }
        t();
        if (this.f25768a && this.m) {
            float fD = (float) UnitUtil.d(this.r.getRunningLevelCurrentData().getLastCurrentRunLevel(), 1);
            d(fD);
            a(fD);
            return;
        }
        i();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == 2 && intent != null) {
            try {
                int[] intArrayExtra = intent.getIntArrayExtra("current_pace_zone_value");
                if (intArrayExtra == null || intArrayExtra.length != 6) {
                    return;
                }
                LogUtil.a("Track_PaceRangeShowActivity", "onActivityResult currentPaceZone is ", Arrays.toString(intArrayExtra));
                this.t = intArrayExtra;
                o();
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.e("Track_PaceRangeShowActivity", "onActivityResult ArrayIndexOutOfBoundsException");
            }
        }
    }

    static class d extends BaseHandler<PaceRangeShowActivity> {
        d(PaceRangeShowActivity paceRangeShowActivity) {
            super(paceRangeShowActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(PaceRangeShowActivity paceRangeShowActivity, Message message) {
            Object obj = message.obj;
            switch (message.what) {
                case 101:
                    paceRangeShowActivity.e(obj);
                    break;
                case 102:
                    paceRangeShowActivity.f25768a = false;
                    paceRangeShowActivity.e((Object) null);
                    break;
                case 103:
                    if (obj instanceof int[]) {
                        paceRangeShowActivity.t = (int[]) obj;
                        paceRangeShowActivity.o();
                    }
                    break;
                default:
                    LogUtil.j("Track_PaceRangeShowActivity", "PaceRangeShowActivityHandler handleMessageWhenReferenceNotNull switch default");
                    break;
            }
        }
    }

    static class b implements IBaseResponseCallback {
        private WeakReference<PaceRangeShowActivity> d;

        b(PaceRangeShowActivity paceRangeShowActivity) {
            this.d = new WeakReference<>(paceRangeShowActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            PaceRangeShowActivity paceRangeShowActivity = this.d.get();
            if (paceRangeShowActivity == null || paceRangeShowActivity.f25770c == null) {
                LogUtil.j("Track_PaceRangeShowActivity", "MyRunningData onResponse activity or mHandler is null");
            } else {
                if (i == 200) {
                    Message messageObtainMessage = paceRangeShowActivity.f25770c.obtainMessage(101);
                    messageObtainMessage.obj = obj;
                    paceRangeShowActivity.f25770c.sendMessage(messageObtainMessage);
                    return;
                }
                paceRangeShowActivity.f25770c.sendEmptyMessage(102);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f25770c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f25770c = null;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
