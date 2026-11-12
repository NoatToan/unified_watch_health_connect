package com.huawei.ui.homehealth.runcard;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.manager.model.SingleDayRecord;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.runcard.adapter.PaceRangeDistanceAdapter;
import com.huawei.ui.homehealth.runcard.trackfragments.PaceRangeResultFragment;
import com.huawei.ui.homehealth.runcard.trackfragments.PaceRangeRunFragment;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningLevelCurrentData;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningStateIndexData;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import defpackage.ddz;
import defpackage.dek;
import defpackage.gzf;
import defpackage.izn;
import defpackage.jhi;
import defpackage.lmf;
import defpackage.osf;
import defpackage.otl;
import defpackage.ozn;
import defpackage.paw;
import defpackage.qpn;
import defpackage.vdo;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public class PaceRangeActivity extends BaseActivity implements View.OnClickListener, PaceRangeResultFragment.OnResultItemClickListener, PaceRangeRunFragment.OnRuntItemClickListener, HwViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f25746a;
    private NoTitleCustomAlertDialog aa;
    private HealthButton ac;
    private HealthButton ad;
    private HealthEditText ae;
    private HealthImageView af;
    private HealthImageView ag;
    private HealthImageView ah;
    private HealthImageView ai;
    private HealthViewPager aj;
    private boolean ak;
    private HealthImageView al;
    private HealthSubTabWidget an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private HealthTextView au;
    private HealthTextView av;
    private HealthTextView aw;
    private boolean ax;
    private HealthTextView ay;
    private HealthColumnRelativeLayout az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f25747b;
    private HealthTextView ba;
    private HealthTextView bb;
    private HealthTextView bc;
    private LinearLayout bd;
    private HealthTextView be;
    private LinearLayout bf;
    private HealthTextView bg;
    private HealthImageView bh;
    private HealthTextView bi;
    private HealthImageView bj;
    private int bk;
    private double bl;
    private HealthColumnRelativeLayout bm;
    private int bn;
    private PaceRangeRunFragment bo;
    private HealthTextView bp;
    private int[] bq;
    private PaceRangeResultFragment br;
    private NoTitleCustomAlertDialog bs;
    private CustomViewDialog bt;
    private CustomViewDialog.Builder bu;
    private gzf bv;
    private CustomViewDialog bw;
    private HealthTextView bx;
    private RunningStateIndexData by;
    private HealthColumnRelativeLayout bz;
    private int ca;
    private HealthColumnRelativeLayout cb;
    private HealthColumnRelativeLayout cc;
    private HealthTextView cd;
    private HealthImageView ce;
    private HealthImageView cf;
    private HealthTextView cg;
    private HealthTextView ch;
    private HealthTextView ci;
    private NoTitleCustomAlertDialog cj;
    private HealthColumnRelativeLayout ck;
    private HealthTextView cl;
    private NoTitleCustomAlertDialog cq;
    private CustomViewDialog d;
    private gzf f;
    private HealthImageView h;
    private HealthTextView i;
    private HealthColumnRelativeLayout j;
    private int k;
    private NoTitleCustomAlertDialog l;
    private gzf n;
    private HealthTextView o;
    private float p;
    private RelativeLayout q;
    private CustomViewDialog r;
    private int s;
    private ImageView t;
    private HealthImageView u;
    private HealthTextView v;
    private HealthTextView w;
    private SparseArray<ddz> x;
    private HealthColumnRelativeLayout y;
    private HealthMultiNumberPicker z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25748c = 0;
    private int e = 0;
    private int g = 0;
    private boolean ar = false;
    private boolean as = false;
    private boolean at = false;
    private boolean am = false;
    private Handler ab = new b(this);
    private Bundle m = new Bundle();

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    static class b extends BaseHandler<PaceRangeActivity> {
        b(PaceRangeActivity paceRangeActivity) {
            super(paceRangeActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(PaceRangeActivity paceRangeActivity, Message message) {
            switch (message.what) {
                case 100:
                    long jLongValue = ((Long) message.obj).longValue();
                    int i = message.arg1;
                    if ((i != 5 && i != 6 && i != 7) || !paceRangeActivity.at) {
                        paceRangeActivity.d(dek.d(i), jLongValue);
                    } else {
                        LogUtil.j("Track_PaceRangeActivity", "handleMessage acquireBestRun no metric distance in the imperial system");
                    }
                    break;
                case 101:
                    Object obj = message.obj;
                    if (obj instanceof int[]) {
                        paceRangeActivity.ai();
                        paceRangeActivity.e((int[]) obj);
                    }
                    break;
                case 102:
                    paceRangeActivity.b(paceRangeActivity.ae);
                    break;
                default:
                    LogUtil.j("Track_PaceRangeActivity", "handleMessageWhenReferenceNotNull switch default");
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.3
            @Override // java.lang.Runnable
            public void run() {
                dek.c(PaceRangeActivity.this.ak);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int[] iArr) {
        SharedPreferenceManager.d("pace_zone_module_id", "last_click_apply_fragment_position", this.k);
        af();
        Intent intent = new Intent();
        if (iArr != null) {
            intent.putExtra("current_pace_zone_value", iArr);
        }
        setResult(2, intent);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pace_range);
        o();
        boolean zF = UnitUtil.f();
        this.at = zF;
        if (zF) {
            this.s = 3;
            this.x = dek.b(this);
            this.bl = 1.609344d;
        } else {
            this.s = 0;
            this.x = dek.d(this);
            this.bl = 1.0d;
        }
        if (f(this.s)) {
            g(this.x.get(this.s).b());
        }
        aa();
        ab();
        u();
        z();
        ap();
        w();
        ao();
        az();
        j();
        t();
        s();
    }

    private void t() {
        a(this.ac, false, 0);
        a(this.ad, false, 0);
        a(this.ac, false, 1);
        a(this.ad, false, 1);
    }

    private void aa() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.ctb_pace_range_title);
        customTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this, com.huawei.health.servicesui.R.color.common_transparent));
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PaceRangeActivity.this.ag();
            }
        });
    }

    private void ab() {
        ac();
        v();
        y();
        x();
    }

    private void ac() {
        HealthCardView healthCardView = (HealthCardView) findViewById(R.id.hcv_pace_range_list_container);
        HealthTextView healthTextView = (HealthTextView) healthCardView.findViewById(R.id.tv_calc_result);
        this.bp = healthTextView;
        healthTextView.setVisibility(0);
        ((HealthTextView) healthCardView.findViewById(R.id.tv_current_pace)).setText(R.string.IDS_pace_current_pace);
        this.bb = (HealthTextView) healthCardView.findViewById(R.id.tv_pace_range_easy_run_label);
        this.bc = (HealthTextView) healthCardView.findViewById(R.id.tv_pace_range_marathon_label);
        this.ay = (HealthTextView) healthCardView.findViewById(R.id.tv_pace_range_lactic_acid_label);
        this.au = (HealthTextView) healthCardView.findViewById(R.id.tv_pace_range_anaerobic_label);
        this.av = (HealthTextView) healthCardView.findViewById(R.id.tv_pace_range_take_oxygen_label);
        this.ai = (HealthImageView) healthCardView.findViewById(R.id.hiv_pace_range_easy_run);
        this.ag = (HealthImageView) healthCardView.findViewById(R.id.hiv_pace_range_marathon);
        this.ah = (HealthImageView) healthCardView.findViewById(R.id.hiv_pace_range_lactic_acid);
        this.af = (HealthImageView) healthCardView.findViewById(R.id.hiv_pace_range_anaerobic);
        this.al = (HealthImageView) healthCardView.findViewById(R.id.hiv_range_take_oxygen);
        this.v = (HealthTextView) healthCardView.findViewById(R.id.htv_current_range_one);
        this.bi = (HealthTextView) healthCardView.findViewById(R.id.htv_current_range_two);
        this.bg = (HealthTextView) healthCardView.findViewById(R.id.htv_current_range_three);
        this.o = (HealthTextView) healthCardView.findViewById(R.id.htv_current_range_four);
        this.cl = (HealthTextView) healthCardView.findViewById(R.id.htv_current_range_five);
        this.cg = (HealthTextView) healthCardView.findViewById(R.id.htv_current_range_six);
        ((ConstraintLayout) healthCardView.findViewById(R.id.cl_calc_result)).setVisibility(0);
        this.y = (HealthColumnRelativeLayout) healthCardView.findViewById(R.id.hcrl_calc_result_one);
        this.w = (HealthTextView) healthCardView.findViewById(R.id.htv_calc_result_one);
        this.u = (HealthImageView) healthCardView.findViewById(R.id.hiv_calc_result_one);
        this.bm = (HealthColumnRelativeLayout) healthCardView.findViewById(R.id.hcrl_calc_result_two);
        this.be = (HealthTextView) healthCardView.findViewById(R.id.htv_calc_result_two);
        this.bj = (HealthImageView) healthCardView.findViewById(R.id.hiv_calc_result_two);
        this.az = (HealthColumnRelativeLayout) healthCardView.findViewById(R.id.hcrl_calc_result_three);
        this.ba = (HealthTextView) healthCardView.findViewById(R.id.htv_calc_result_three);
        this.bh = (HealthImageView) healthCardView.findViewById(R.id.hiv_calc_result_three);
        this.j = (HealthColumnRelativeLayout) healthCardView.findViewById(R.id.hcrl_calc_result_four);
        this.i = (HealthTextView) healthCardView.findViewById(R.id.htv_calc_result_four);
        this.h = (HealthImageView) healthCardView.findViewById(R.id.hiv_calc_result_four);
        this.cc = (HealthColumnRelativeLayout) healthCardView.findViewById(R.id.hcrl_calc_result_five);
        this.cd = (HealthTextView) healthCardView.findViewById(R.id.htv_calc_result_five);
        this.ce = (HealthImageView) healthCardView.findViewById(R.id.hiv_calc_result_five);
        this.cb = (HealthColumnRelativeLayout) healthCardView.findViewById(R.id.hcrl_calc_result_six);
        this.bx = (HealthTextView) healthCardView.findViewById(R.id.htv_calc_result_six);
        this.cf = (HealthImageView) healthCardView.findViewById(R.id.hiv_calc_result_six);
    }

    private void v() {
        this.bd = (LinearLayout) findViewById(R.id.ll_no_cloud_base_result_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hcv_pace_range_result_container);
        this.q = (RelativeLayout) linearLayout.findViewById(R.id.layout_pace_range_distance);
        this.f25746a = (RelativeLayout) linearLayout.findViewById(R.id.layout_pace_range_achievement);
        this.t = (ImageView) linearLayout.findViewById(R.id.img_pace_range_right_distance);
        this.f25747b = (ImageView) linearLayout.findViewById(R.id.img_pace_range_right_achievement);
        this.ch = (HealthTextView) linearLayout.findViewById(R.id.tv_pace_range_right_distance);
        this.aw = (HealthTextView) linearLayout.findViewById(R.id.tv_pace_range_label_achievement);
        this.ci = (HealthTextView) linearLayout.findViewById(R.id.tv_pace_range_right_achievement);
    }

    private void y() {
        this.bf = (LinearLayout) findViewById(R.id.ll_cloud_base_all_container);
        HealthSubTabWidget healthSubTabWidget = (HealthSubTabWidget) findViewById(R.id.hstw_sub_tab);
        this.an = healthSubTabWidget;
        healthSubTabWidget.setBackgroundColor(ContextCompat.getColor(this, com.huawei.health.servicesui.R.color.common_transparent));
        HealthViewPager healthViewPager = (HealthViewPager) findViewById(R.id.hvp_view_pager);
        this.aj = healthViewPager;
        healthViewPager.setIsAutoHeight(true);
    }

    private void x() {
        this.ad = (HealthButton) findViewById(R.id.hb_pace_range_calculation);
        this.ac = (HealthButton) findViewById(R.id.hb_pace_range_apply);
    }

    private void u() {
        this.y.setOnClickListener(this);
        this.bm.setOnClickListener(this);
        this.az.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.cc.setOnClickListener(this);
        this.cb.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.f25746a.setOnClickListener(this);
        this.ad.setOnClickListener(this);
        this.ac.setOnClickListener(this);
    }

    private void ap() {
        if (Utils.h()) {
            this.bf.setVisibility(0);
            this.bd.setVisibility(8);
        } else {
            this.bf.setVisibility(8);
            this.bd.setVisibility(0);
        }
    }

    private void w() {
        int iC = SharedPreferenceManager.c("pace_zone_module_id", "last_click_apply_fragment_position", 0);
        this.k = iC;
        qpn qpnVar = new qpn(this, this.aj, this.an);
        this.br = new PaceRangeResultFragment();
        this.bo = new PaceRangeRunFragment();
        qpnVar.b(this.an.b(getString(R.string.IDS_pace_base_result)), this.br, iC == 0);
        qpnVar.b(this.an.b(getString(R.string.IDS_pace_base_run)), this.bo, iC == 1);
        this.br.c(this);
        this.bo.c(this);
        this.aj.addOnPageChangeListener(this);
        RunningStateIndexData runningStateIndexData = this.by;
        if (runningStateIndexData != null) {
            this.m.putParcelable("running_level_data", runningStateIndexData);
        }
        this.m.putBoolean("setting_auto_calc_key_status", this.ak);
        this.bo.setArguments(this.m);
        a(iC);
        if (iC == 1) {
            c();
        }
    }

    private void ao() {
        this.bb.setText(b(1));
        this.bc.setText(b(2));
        this.ay.setText(b(3));
        this.au.setText(b(4));
        this.av.setText(b(5));
        int iQ = q();
        d(iQ, this.bb);
        d(iQ, this.bc);
        d(iQ, this.ay);
        d(iQ, this.au);
        d(iQ, this.av);
    }

    private void az() {
        if (LanguageUtil.ba(this)) {
            this.t.setImageResource(R.drawable.common_ui_arrow_left);
            this.f25747b.setImageResource(R.drawable.common_ui_arrow_left);
            this.ai.setImageResource(R.drawable.pace_rang_connection_line_mirroring);
            this.ag.setImageResource(R.drawable.pace_rang_connection_line_mirroring);
            this.ah.setImageResource(R.drawable.pace_rang_connection_line_mirroring);
            this.af.setImageResource(R.drawable.pace_rang_connection_line_mirroring);
            this.al.setImageResource(R.drawable.pace_rang_connection_line_mirroring);
            return;
        }
        this.t.setImageResource(R.drawable.common_ui_arrow_right);
        this.f25747b.setImageResource(R.drawable.common_ui_arrow_right);
        this.ai.setImageResource(R.drawable.pace_rang_connection_line);
        this.ag.setImageResource(R.drawable.pace_rang_connection_line);
        this.ah.setImageResource(R.drawable.pace_rang_connection_line);
        this.af.setImageResource(R.drawable.pace_rang_connection_line);
        this.al.setImageResource(R.drawable.pace_rang_connection_line);
    }

    private void j() {
        if (this.at) {
            this.bp.setText(getString(R.string.IDS_pace_column_mi_result));
        } else {
            this.bp.setText(getString(R.string.IDS_pace_range_column_result));
        }
    }

    private void ax() {
        if (this.r == null) {
            View viewL = l();
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
            builder.a(getString(R.string.IDS_sport_distance)).b(viewL, 0, 0).c(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.21
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            this.r = builder.d();
        }
        this.r.show();
    }

    private View l() {
        View viewInflate = View.inflate(this, R.layout.item_pace_range_distances_view, null);
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.hrv_pace_range_distance);
        healthRecycleView.setHasFixedSize(true);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this));
        final PaceRangeDistanceAdapter paceRangeDistanceAdapter = new PaceRangeDistanceAdapter(this, this.x);
        healthRecycleView.setAdapter(paceRangeDistanceAdapter);
        paceRangeDistanceAdapter.c(new PaceRangeDistanceAdapter.OnItemClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.24
            @Override // com.huawei.ui.homehealth.runcard.adapter.PaceRangeDistanceAdapter.OnItemClickListener
            public void onItemClick(int i) {
                if (PaceRangeActivity.this.f(i)) {
                    if (i != PaceRangeActivity.this.s) {
                        int iN = PaceRangeActivity.this.n();
                        ddz ddzVar = (ddz) PaceRangeActivity.this.x.get(i);
                        if (ddzVar.e() < iN || iN < ddzVar.b()) {
                            PaceRangeActivity.this.g(ddzVar.b());
                            PaceRangeActivity.this.ci.setText(PaceRangeActivity.this.getString(R.string.IDS_pace_range_no_input));
                            PaceRangeActivity.this.br.b(PaceRangeActivity.this.getString(R.string.IDS_pace_range_no_input));
                            PaceRangeActivity paceRangeActivity = PaceRangeActivity.this;
                            paceRangeActivity.b("achievement_value", paceRangeActivity.getString(R.string.IDS_pace_range_no_input));
                            PaceRangeActivity.this.as = false;
                            PaceRangeActivity paceRangeActivity2 = PaceRangeActivity.this;
                            paceRangeActivity2.a(paceRangeActivity2.ad, false, 0);
                        }
                    }
                    PaceRangeActivity.this.d(i);
                    paceRangeDistanceAdapter.notifyDataSetChanged();
                    PaceRangeActivity.this.b();
                    PaceRangeActivity paceRangeActivity3 = PaceRangeActivity.this;
                    paceRangeActivity3.c(paceRangeActivity3.r);
                    return;
                }
                LogUtil.j("Track_PaceRangeActivity", "onItemClick distanceType error");
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (!f(i) || !f(this.s)) {
            LogUtil.j("Track_PaceRangeActivity", "changePositionUpdateDistance distanceType or mDistanceSelectType error");
            return;
        }
        this.x.get(this.s).a(false);
        ddz ddzVar = this.x.get(i);
        ddzVar.a(true);
        this.s = i;
        this.ar = true;
        this.ch.setText(ddzVar.c());
        this.br.d(ddzVar.c());
        b("distance_value", ddzVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.m.putString(str, str2);
        if (this.br.isAdded()) {
            Bundle arguments = this.br.getArguments();
            if (arguments != null) {
                arguments.putString(str, str2);
                return;
            }
            return;
        }
        this.br.setArguments(this.m);
    }

    private void aq() {
        c(this.d);
        HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        this.z = healthMultiNumberPicker;
        healthMultiNumberPicker.setPickerCount(3, new boolean[]{false, true, true});
        this.z.setColonAndUnit(3);
        int iN = n();
        if (f(this.s)) {
            ddz ddzVar = this.x.get(this.s);
            final int iB = ddzVar.b();
            final int iE = ddzVar.e();
            if (iB > iE || iB < 0) {
                LogUtil.j("Track_PaceRangeActivity", "get minTime maxTime error");
                return;
            }
            int i = iB / 3600;
            this.bk = i;
            int i2 = iN / 3600;
            final String[] strArrD = d(iB, iE);
            String[] strArrC = c(iB, iE, i2 - i, strArrD.length);
            String[] strArrP = p();
            this.z.setDisplayedValues(0, strArrD, i2 - this.bk);
            this.z.setDisplayedValues(1, strArrC, ((iN % 3600) / 60) - this.bn);
            this.z.setDisplayedValues(2, strArrP, iN % 60);
            this.z.setOnValueChangeListener(new HealthMultiNumberPicker.OnValueChangeListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.22
                @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
                public void onValueChange(int i3, HealthMultiNumberPicker healthMultiNumberPicker2, int i4, int i5) {
                    int length = PaceRangeActivity.this.z.d(0).length;
                    if (i3 != 0 || length <= 1) {
                        return;
                    }
                    healthMultiNumberPicker2.setDisplayedValues(1, PaceRangeActivity.this.c(iB, iE, i5, strArrD.length), 0);
                }
            });
            d();
        }
    }

    private void d() {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
        builder.a(getString(R.string.IDS_pace_range_achievement)).b(this.z, 24, 24).c(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.23
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).d(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int[] selectedLocations = PaceRangeActivity.this.z.getSelectedLocations();
                if (selectedLocations.length < 3) {
                    LogUtil.j("Track_PaceRangeActivity", "selected length error ", Integer.valueOf(selectedLocations.length));
                    return;
                }
                PaceRangeActivity paceRangeActivity = PaceRangeActivity.this;
                paceRangeActivity.f25748c = selectedLocations[0] + paceRangeActivity.bk;
                PaceRangeActivity paceRangeActivity2 = PaceRangeActivity.this;
                paceRangeActivity2.e = selectedLocations[1] + paceRangeActivity2.bn;
                PaceRangeActivity.this.g = selectedLocations[2];
                PaceRangeActivity.this.am();
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.d = customViewDialogD;
        customViewDialogD.show();
    }

    private String[] d(int i, int i2) {
        return this.z.c(i / 3600, i2 / 3600, getResources().getString(com.huawei.ui.main.R.string.IDS_band_data_sleep_unit_h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String[] c(int i, int i2, int i3, int i4) {
        int i5 = (i % 3600) / 60;
        int i6 = (i2 % 3600) / 60;
        int i7 = 59;
        if (i4 >= 2 && i3 == 0) {
            i6 = 59;
        }
        int i8 = 0;
        if (i4 >= 2 && i3 == i4 - 1) {
            i5 = 0;
        }
        if (i4 <= 2 || i3 == 0 || i3 == i4 - 1) {
            i8 = i5;
            i7 = i6;
        }
        this.bn = i8;
        return this.z.c(i8, i7, getResources().getString(com.huawei.ui.main.R.string.IDS_band_data_sleep_unit_m));
    }

    private String[] p() {
        return this.z.c(0, 59, getResources().getString(com.huawei.ui.main.R.string.IDS_second));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        SimpleDateFormat simpleDateFormat;
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, this.f25748c);
        calendar.set(12, this.e);
        calendar.set(13, this.g);
        Date time = calendar.getTime();
        if (this.f25748c == 0) {
            simpleDateFormat = new SimpleDateFormat("mm:ss");
        } else {
            simpleDateFormat = new SimpleDateFormat(Constants.TIME_FORMAT_WITHOUT_MILLS);
        }
        String str = simpleDateFormat.format(time);
        this.ci.setText(str);
        this.br.b(str);
        b("achievement_value", str);
        this.as = true;
        this.ao = true;
        if (this.k == 0) {
            b();
        }
    }

    private void d(HealthTextView healthTextView, int i, boolean z) {
        boolean zA;
        if (healthTextView == null || (this.k == 1 && this.ak)) {
            LogUtil.j("Track_PaceRangeActivity", "showRangeTimeDialog textView is null or auto calc");
            return;
        }
        c(this.bt);
        HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        this.z = healthMultiNumberPicker;
        healthMultiNumberPicker.setPickerCount(2, new boolean[]{true, true});
        this.z.setColonAndUnit(2);
        int iRound = (int) Math.round(((double) a(i, z)) * this.bl);
        if (this.at) {
            zA = a(120, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, iRound);
        } else {
            zA = a(60, 900, iRound);
        }
        if (!zA) {
            LogUtil.d("Track_PaceRangeActivity", "showRangeTimeDialog init error");
            return;
        }
        this.z.setOnValueChangeListener(new HealthMultiNumberPicker.OnValueChangeListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.28
            @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
            public void onValueChange(int i2, HealthMultiNumberPicker healthMultiNumberPicker2, int i3, int i4) {
                int length = PaceRangeActivity.this.z.d(0).length;
                if (i2 == 0) {
                    healthMultiNumberPicker2.setDisplayedValues(1, PaceRangeActivity.this.c(i4, length), PaceRangeActivity.this.ca);
                }
            }
        });
        c(i, z);
    }

    private void c(final int i, final boolean z) {
        String string;
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
        if (z) {
            string = getString(R.string.IDS_pace_range_upper_limit, new Object[]{Integer.valueOf(i)});
        } else {
            string = getString(R.string.IDS_pace_range_lower_limit, new Object[]{Integer.valueOf(i)});
        }
        builder.a(string).b(this.z, 0, 0).c(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).d(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.30
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PaceRangeActivity.this.b(i, z);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.bt = customViewDialogD;
        customViewDialogD.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.4
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (PaceRangeActivity.this.bz == null || PaceRangeActivity.this.bz == PaceRangeActivity.this.ck) {
                    return;
                }
                PaceRangeActivity.this.bz.setBackgroundResource(R.drawable.pace_range_time_background);
                PaceRangeActivity.this.bz = null;
            }
        });
        this.bt.show();
    }

    private int a(int i, boolean z) {
        int iD;
        HealthColumnRelativeLayout healthColumnRelativeLayout = this.ck;
        if (healthColumnRelativeLayout != null) {
            healthColumnRelativeLayout.setBackgroundResource(R.drawable.pace_range_time_background);
            this.ck = null;
        }
        int i2 = this.k;
        if (i2 == 0) {
            iD = d(i, z, this.f);
        } else {
            iD = i2 == 1 ? d(i, z, this.bv) : 0;
        }
        this.bz.setBackgroundResource(R.drawable.pace_range_time_select_background);
        return iD;
    }

    private int d(int i, boolean z, gzf gzfVar) {
        int iG;
        if (i == 1) {
            iG = gzfVar != null ? gzfVar.g() : 0;
            this.bz = this.y;
            return iG;
        }
        if (i == 2) {
            iG = gzfVar != null ? gzfVar.a() : 0;
            this.bz = this.bm;
            return iG;
        }
        if (i == 3) {
            iG = gzfVar != null ? gzfVar.b() : 0;
            this.bz = this.az;
            return iG;
        }
        if (i == 4) {
            iG = gzfVar != null ? gzfVar.e() : 0;
            this.bz = this.j;
            return iG;
        }
        if (i != 5) {
            LogUtil.j("Track_PaceRangeActivity", "getPaceRangeAccordingFragment getPaceRange switch default");
            return 0;
        }
        if (z) {
            iG = gzfVar != null ? gzfVar.d() : 0;
            this.bz = this.cc;
            return iG;
        }
        iG = gzfVar != null ? gzfVar.c() : 0;
        this.bz = this.cb;
        return iG;
    }

    private boolean a(int i, int i2, int i3) {
        int i4;
        if (i > i2 || i < 0) {
            LogUtil.j("Track_PaceRangeActivity", "setMaxMinRangeData minTime maxTime error");
            return false;
        }
        int i5 = i / 60;
        this.bn = i5;
        int i6 = i3 / 60;
        int i7 = i3 % 60;
        this.ca = i7;
        if (i3 > i2 || i3 < i) {
            i4 = 0;
            i7 = 0;
        } else {
            i4 = i6 - i5;
        }
        String[] strArrC = this.z.c(i5, i2 / 60, getResources().getString(com.huawei.ui.main.R.string.IDS_band_data_sleep_unit_m));
        String[] strArrC2 = c(i4, strArrC.length);
        this.z.setDisplayedValues(0, strArrC, i4);
        this.z.setDisplayedValues(1, strArrC2, i7);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String[] c(int i, int i2) {
        int i3;
        if (i == i2 - 1) {
            this.ca = 0;
            i3 = 0;
        } else {
            i3 = 59;
        }
        return this.z.c(0, i3, getResources().getString(com.huawei.ui.main.R.string.IDS_second));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, boolean z) {
        int[] selectedLocations = this.z.getSelectedLocations();
        if (selectedLocations.length < 2) {
            LogUtil.j("Track_PaceRangeActivity", "the locations of MultiNumberPicker have something wrong");
            return;
        }
        float f = ((selectedLocations[0] + this.bn) * 60) + selectedLocations[1];
        String strA = izn.a(f);
        HashMap map = new HashMap(10);
        map.put("click", 1);
        int i2 = (int) (((double) f) / this.bl);
        c cVar = new c();
        cVar.b(i);
        cVar.d(z);
        a(cVar, strA, map, i2);
        this.am = true;
        a(this.ac, true, 0);
        d(map);
    }

    private void a(c cVar, String str, Map<String, Object> map, int i) {
        int i2 = this.k;
        if (i2 == 0) {
            if (this.f == null) {
                LogUtil.a("Track_PaceRangeActivity", "setRangeTimeDataForView mAchievementResultConfig is null");
                this.f = new gzf();
            }
            c(cVar, str, map, i, this.f);
            return;
        }
        if (i2 == 1) {
            if (this.bv == null) {
                LogUtil.a("Track_PaceRangeActivity", "setRangeTimeDataForView mRunResultConfig is null");
                this.bv = new gzf();
            }
            c(cVar, str, map, i, this.bv);
        }
    }

    private void c(c cVar, String str, Map<String, Object> map, int i, gzf gzfVar) {
        int iA = cVar.a();
        if (iA == 1) {
            this.w.setText(str);
            gzfVar.f(i);
            map.put("type", 1);
            d(gzfVar.g(), this.n.g(), this.u);
            return;
        }
        if (iA == 2) {
            this.be.setText(str);
            gzfVar.e(i);
            map.put("type", 2);
            d(gzfVar.a(), this.n.a(), this.bj);
            return;
        }
        if (iA == 3) {
            this.ba.setText(str);
            gzfVar.b(i);
            map.put("type", 3);
            d(gzfVar.b(), this.n.b(), this.bh);
            return;
        }
        if (iA == 4) {
            this.i.setText(str);
            gzfVar.d(i);
            map.put("type", 4);
            d(gzfVar.e(), this.n.e(), this.h);
            return;
        }
        if (iA != 5) {
            LogUtil.j("Track_PaceRangeActivity", "setRangeTimeDataForView switch default");
            return;
        }
        if (cVar.c()) {
            this.cd.setText(str);
            gzfVar.c(i);
            map.put("type", 5);
            d(gzfVar.d(), this.n.d(), this.ce);
            return;
        }
        this.bx.setText(str);
        gzfVar.a(i);
        map.put("type", 6);
        d(gzfVar.c(), this.n.c(), this.cf);
    }

    private void i() {
        if (!f(this.s)) {
            LogUtil.j("Track_PaceRangeActivity", "calculatePace mDistanceSelectType error");
            return;
        }
        double dE = dek.e(this.x.get(this.s).d(), n());
        if (dE == 0.0d) {
            LogUtil.j("Track_PaceRangeActivity", "calculatePace error");
            return;
        }
        if (this.f == null) {
            this.f = new gzf();
        }
        this.f.f(dek.b(dE));
        this.f.e(dek.a(dE));
        this.f.b(dek.e(dE));
        this.f.d(dek.d(dE));
        this.f.c(dek.i(dE));
        this.f.a(dek.c(dE));
        d(this.f);
        a(this.ac, true, 0);
        this.am = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.ar && this.as) {
            a(this.ad, true, 0);
        }
        h();
    }

    private void e() {
        this.ar = false;
        this.as = false;
        a(this.ad, false, 0);
        h();
    }

    private void h() {
        if (this.ar) {
            this.aw.setTextColor(ContextCompat.getColor(this, R.color.textColorPrimary));
            this.ci.setTextColor(ContextCompat.getColor(this, R.color.textColorSecondary));
            this.f25746a.setClickable(true);
        } else {
            this.aw.setTextColor(ContextCompat.getColor(this, R.color.textColorTertiary));
            this.ci.setTextColor(ContextCompat.getColor(this, R.color.textColorTertiary));
            this.f25746a.setClickable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HealthButton healthButton, boolean z, int i) {
        if (healthButton == null) {
            LogUtil.j("Track_PaceRangeActivity", "setBtnClickableAndAlpha healthButton null");
            return;
        }
        if (z) {
            healthButton.setAlpha(1.0f);
        } else {
            healthButton.setAlpha(0.38f);
        }
        healthButton.setClickable(z);
        if (i == 0) {
            if (healthButton == this.ad) {
                this.ao = z;
            }
            if (healthButton == this.ac) {
                this.aq = z;
            }
        }
        if (i == 1) {
            if (healthButton == this.ad) {
                this.ax = z;
            }
            if (healthButton == this.ac) {
                this.ap = z;
            }
        }
    }

    private void aw() {
        if (this.l == null) {
            this.l = new NoTitleCustomAlertDialog.Builder(this).a(getString(R.string.IDS_pace_close_auto_calc)).d(getString(R.string.IDS_pace_think_again), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }).a(getString(R.string.IDS_hw_common_ui_dialog_confirm), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    PaceRangeActivity.this.ak = false;
                    PaceRangeActivity.this.ae();
                }
            }).c();
        }
        this.l.show();
    }

    private void at() {
        if (this.bs == null) {
            this.bs = new NoTitleCustomAlertDialog.Builder(this).a(getString(R.string.IDS_pace_range_overlay_reminder)).d(getString(R.string.IDS_hw_common_ui_dialog_cancel), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }).a(getString(R.string.IDS_hw_common_ui_dialog_confirm), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    PaceRangeActivity.this.ae();
                }
            }).c();
        }
        this.bs.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        HealthColumnRelativeLayout healthColumnRelativeLayout = this.ck;
        if (healthColumnRelativeLayout != null) {
            healthColumnRelativeLayout.setBackgroundResource(R.drawable.pace_range_time_background);
            this.ck = null;
        }
        af();
        ae();
    }

    private void af() {
        if (!f(this.s) || !a(getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol))) {
            LogUtil.j("Track_PaceRangeActivity", "saveUserAchievement mDistanceSelectType error");
        } else {
            dek.b((Context) this, this.x.get(this.s).a(), n(), new Date().getTime());
        }
    }

    private void al() {
        gzf gzfVar = this.n;
        if (gzfVar == null) {
            LogUtil.j("Track_PaceRangeActivity", "setPaceRangeTimeView mApplyConfig null");
            return;
        }
        this.v.setText(izn.a((float) (((double) gzfVar.g()) * this.bl)));
        this.bi.setText(izn.a((float) (((double) this.n.a()) * this.bl)));
        this.bg.setText(izn.a((float) (((double) this.n.b()) * this.bl)));
        this.o.setText(izn.a((float) (((double) this.n.e()) * this.bl)));
        this.cl.setText(izn.a((float) (((double) this.n.d()) * this.bl)));
        this.cg.setText(getString(R.string.IDS_pace_less_than_or_equal_to, new Object[]{izn.a((float) (((double) this.n.c()) * this.bl))}));
        ak();
    }

    private boolean e(gzf gzfVar) {
        if (gzfVar == null) {
            LogUtil.j("Track_PaceRangeActivity", "judgeTimePaceRangeValid config is null");
            return false;
        }
        if (gzfVar.g() < 110 || gzfVar.g() < gzfVar.a()) {
            a(this.y);
        } else if (gzfVar.a() < gzfVar.b()) {
            if (gzfVar.b() > gzfVar.g()) {
                a(this.az);
            } else {
                a(this.bm);
            }
        } else if (gzfVar.b() < gzfVar.e()) {
            if (gzfVar.e() > gzfVar.a()) {
                a(this.j);
            } else {
                a(this.az);
            }
        } else if (gzfVar.e() < gzfVar.d()) {
            if (gzfVar.d() > gzfVar.b()) {
                a(this.cc);
            } else {
                a(this.j);
            }
        } else {
            if (gzfVar.d() >= gzfVar.c()) {
                return true;
            }
            if (gzfVar.c() > gzfVar.e()) {
                a(this.cb);
            } else {
                a(this.cc);
            }
        }
        return false;
    }

    private boolean a(gzf gzfVar) {
        if (gzfVar == null) {
            LogUtil.j("Track_PaceRangeActivity", "judgeTimeGreaterThanTen config is null");
            return false;
        }
        if (Math.round(((double) (gzfVar.g() - gzfVar.a())) * this.bl) < 10) {
            a(this.y);
        } else if (Math.round(((double) (gzfVar.a() - gzfVar.b())) * this.bl) < 10) {
            if (gzfVar.b() > gzfVar.g()) {
                a(this.az);
            } else {
                a(this.bm);
            }
        } else if (Math.round(((double) (gzfVar.b() - gzfVar.e())) * this.bl) < 10) {
            if (gzfVar.e() > gzfVar.a()) {
                a(this.j);
            } else {
                a(this.az);
            }
        } else if (Math.round(((double) (gzfVar.e() - gzfVar.d())) * this.bl) < 10) {
            if (gzfVar.d() > gzfVar.b()) {
                a(this.cc);
            } else {
                a(this.j);
            }
        } else {
            if (Math.round(((double) (gzfVar.d() - gzfVar.c())) * this.bl) >= 10) {
                return true;
            }
            if (gzfVar.c() > gzfVar.e()) {
                a(this.cb);
            } else {
                a(this.cc);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ad() {
        gzf gzfVar;
        if (this.k == 0) {
            b(this.n, this.f);
            gzfVar = this.f;
        } else {
            gzfVar = null;
        }
        if (this.k == 1) {
            b(this.n, this.bv);
            gzfVar = this.bv;
        }
        if (!e(gzfVar)) {
            c(false);
            return true;
        }
        if (a(gzfVar)) {
            return false;
        }
        c(true);
        return true;
    }

    private void a(HealthColumnRelativeLayout healthColumnRelativeLayout) {
        healthColumnRelativeLayout.setBackgroundResource(R.drawable.pace_range_time_warning_background);
        this.ck = healthColumnRelativeLayout;
    }

    private void c(boolean z) {
        String string;
        c(this.cq);
        if (z) {
            string = getString(R.string.IDS_pace_range_warning_space, new Object[]{10});
        } else {
            string = getString(R.string.IDS_pace_range_warning_content);
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(string).a(getString(R.string.IDS_common_notification_know_tips), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).c();
        this.cq = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.show();
    }

    private void au() {
        if (this.aa == null) {
            this.aa = new NoTitleCustomAlertDialog.Builder(this).a(getString(R.string.IDS_pace_range_exit_prompt)).d(getString(R.string.IDS_hw_common_ui_dialog_cancel), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }).a(getString(R.string.IDS_hw_common_ui_dialog_confirm), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    PaceRangeActivity.this.e((int[]) null);
                }
            }).c();
        }
        this.aa.show();
    }

    private void b(final boolean z) {
        String string;
        String string2;
        String string3;
        c(this.cj);
        if (z) {
            string = getString(R.string.IDS_pace_range_exit_overlay);
            string2 = getString(R.string.IDS_hw_common_ui_dialog_cancel);
            string3 = getString(R.string.IDS_hw_common_ui_dialog_confirm);
        } else {
            string = getString(R.string.IDS_pace_range_exit_save_content);
            string2 = getString(R.string.IDS_btn_discard);
            string3 = getString(R.string.IDS_save);
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(string).d(string2, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PaceRangeActivity.this.e((int[]) null);
            }
        }).a(string3, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PaceRangeActivity.this.ad()) {
                    LogUtil.j("Track_PaceRangeActivity", "showUnSavePromptDialog isShowJudgeTimePaceDialog true");
                } else if (z) {
                    PaceRangeActivity.this.a();
                } else {
                    PaceRangeActivity.this.ae();
                }
            }
        }).c();
        this.cj = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.show();
    }

    private void o() {
        Intent intent = getIntent();
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("running_level_data");
            if (parcelableExtra instanceof RunningStateIndexData) {
                this.by = (RunningStateIndexData) parcelableExtra;
            }
            this.ak = intent.getBooleanExtra("setting_auto_calc_key_status", false);
            try {
                this.bq = intent.getIntArrayExtra("intent_pace_zone");
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.e("Track_PaceRangeActivity", "getIntentContent mPaceZone ArrayIndexOutOfBoundsException.");
            }
        }
    }

    private void z() {
        int[] iArr = this.bq;
        if (iArr == null || iArr.length != 6) {
            an();
        } else {
            gzf gzfVar = new gzf();
            this.n = gzfVar;
            gzfVar.f(this.bq[0]);
            this.n.e(this.bq[1]);
            this.n.b(this.bq[2]);
            this.n.d(this.bq[3]);
            this.n.c(this.bq[4]);
            this.n.a(this.bq[5]);
        }
        al();
    }

    private void an() {
        gzf gzfVar = new gzf();
        this.n = gzfVar;
        gzfVar.f(450);
        this.n.e(420);
        this.n.b(390);
        this.n.d(360);
        this.n.c(330);
        this.n.a(300);
    }

    private void s() {
        String strE;
        e();
        if (this.at) {
            strE = SharedPreferenceManager.e(this, String.valueOf(10000), "USER_SAVE_ACHIEVEMENT_IMPERIAL_KEY");
        } else {
            strE = SharedPreferenceManager.e(this, String.valueOf(10000), "USER_SAVE_ACHIEVEMENT_METRIC_KEY");
        }
        if (TextUtils.isEmpty(strE)) {
            k();
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(strE);
            if (jSONArray.length() != 3) {
                k();
                LogUtil.j("Track_PaceRangeActivity", "userAchievement userPreference invalid");
            } else {
                d(Integer.parseInt(jSONArray.getString(0)), Integer.parseInt(jSONArray.getString(1)));
            }
        } catch (NumberFormatException | JSONException unused) {
            k();
            LogUtil.e("Track_PaceRangeActivity", "getUserAchievement JSONException error");
        }
    }

    private void k() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.13
            @Override // java.lang.Runnable
            public void run() {
                osf osfVarB = otl.b(BaseApplication.getContext()).b(2, new HashMap(16));
                SingleDayRecord singleDayRecord = osfVarB instanceof SingleDayRecord ? (SingleDayRecord) osfVarB : null;
                if (singleDayRecord != null) {
                    if (PaceRangeActivity.this.d(6, singleDayRecord) || PaceRangeActivity.this.d(7, singleDayRecord) || PaceRangeActivity.this.d(8, singleDayRecord) || PaceRangeActivity.this.d(5, singleDayRecord)) {
                        return;
                    }
                    PaceRangeActivity.this.d(9, singleDayRecord);
                    return;
                }
                LogUtil.j("Track_PaceRangeActivity", "getAcquireBestRun singleDayRecord null");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(int i, SingleDayRecord singleDayRecord) {
        String strA = paw.a(i, singleDayRecord);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("Track_PaceRangeActivity", "getAchieveToAchievement bestRunJson is error");
            return false;
        }
        ozn oznVarB = paw.b(strA);
        if (oznVarB == null || this.ab == null) {
            LogUtil.j("Track_PaceRangeActivity", "getAchieveToAchievement bestMotionPace or mHandler is null");
            return false;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.arg1 = i;
        messageObtain.obj = Long.valueOf((long) Math.ceil(oznVarB.e()));
        LogUtil.a("Track_PaceRangeActivity", "getAchieveToAchievement acquireValue=", Double.valueOf(oznVarB.e()));
        this.ab.sendMessage(messageObtain);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, long j) {
        if (!f(i)) {
            LogUtil.j("Track_PaceRangeActivity", "makeToAchievementDataUi distanceType invalid");
            return;
        }
        ddz ddzVar = this.x.get(i);
        if (j < ddzVar.b() || j > ddzVar.e()) {
            LogUtil.j("Track_PaceRangeActivity", "makeToAchievementDataUi elapsedTime invalid");
            return;
        }
        d(i);
        g((int) j);
        am();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i) {
        this.f25748c = i / 3600;
        this.e = (i % 3600) / 60;
        this.g = i % 60;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int n() {
        return (this.f25748c * 3600) + (this.e * 60) + this.g;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (R.id.hcrl_calc_result_one == id) {
            d(this.w, 1, true);
        }
        if (R.id.hcrl_calc_result_two == id) {
            d(this.be, 2, true);
        }
        if (R.id.hcrl_calc_result_three == id) {
            d(this.ba, 3, true);
        }
        if (R.id.hcrl_calc_result_four == id) {
            d(this.i, 4, true);
        }
        if (R.id.hcrl_calc_result_five == id) {
            d(this.cd, 5, true);
        }
        if (R.id.hcrl_calc_result_six == id) {
            d(this.bx, 5, false);
        }
        if (R.id.layout_pace_range_distance == id) {
            ax();
        }
        if (R.id.layout_pace_range_achievement == id) {
            aq();
        }
        if (R.id.hb_pace_range_calculation == id) {
            m();
        }
        if (R.id.hb_pace_range_apply == id) {
            f();
        }
    }

    private void m() {
        if (this.k == 0) {
            i();
            e(1);
        }
        if (this.k == 1) {
            g();
        }
    }

    private void f() {
        if (this.k == 0) {
            e(2);
        }
        if (ad()) {
            LogUtil.j("Track_PaceRangeActivity", "onClick apply button calc result has error data");
        } else if (this.ak) {
            aw();
        } else {
            at();
        }
    }

    private void ah() {
        if (this.n == null) {
            LogUtil.j("Track_PaceRangeActivity", "saveCurrentPaceToDb mApplyConfig is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.15
                @Override // java.lang.Runnable
                public void run() {
                    dek.b(new int[]{PaceRangeActivity.this.n.g(), PaceRangeActivity.this.n.a(), PaceRangeActivity.this.n.b(), PaceRangeActivity.this.n.e(), PaceRangeActivity.this.n.d(), PaceRangeActivity.this.n.c()});
                }
            });
        }
    }

    private void d(Map map) {
        if (map != null) {
            lmf.d().c(this, AnalyticsValue.PACE_RANGE_2040084.value(), map, 0);
        } else {
            LogUtil.j("Track_PaceRangeActivity", "map is null");
        }
    }

    private void e(int i) {
        HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        lmf.d().c(this, AnalyticsValue.PACE_RANGE_2040085.value(), map, 0);
    }

    private void c() {
        HashMap map = new HashMap(10);
        map.put("click", 1);
        lmf.d().c(this, AnalyticsValue.PACE_RANGE_2040194.value(), map, 0);
    }

    private void a(boolean z) {
        HashMap map = new HashMap(10);
        map.put("click", 1);
        if (!z) {
            map.put("type", 2);
        } else {
            map.put("type", 1);
        }
        lmf.d().c(this, AnalyticsValue.PACE_RANGE_2040195.value(), map, 0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("Track_PaceRangeActivity", "onBackPressed");
        ag();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Track_PaceRangeActivity", "onDestroy");
        c(this.r);
        c(this.d);
        c(this.bt);
        c(this.bs);
        c(this.cq);
        c(this.aa);
        c(this.cj);
        c(this.bw);
        c(this.l);
        Handler handler = this.ab;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.ab = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(BaseDialog baseDialog) {
        if (baseDialog == null || !baseDialog.isShowing()) {
            return;
        }
        baseDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        String string = getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
        if (string == null || !a(string) || ad()) {
            LogUtil.j("Track_PaceRangeActivity", "onBackJudgeNeedPrompt data is error");
            e((int[]) null);
            return;
        }
        if (this.ck != null) {
            LogUtil.j("Track_PaceRangeActivity", "onBackJudgeNeedPrompt mWarnTimeView is null");
            au();
            return;
        }
        if (this.k == 1) {
            LogUtil.a("Track_PaceRangeActivity", "onBackJudgeNeedPrompt mCurrentFragmentPosition is run fragment");
            if (this.ak) {
                e((int[]) null);
                return;
            } else if (a(this.bv)) {
                b(!this.am);
                return;
            } else {
                c(true);
                return;
            }
        }
        if (this.ak) {
            aw();
        } else if (a(this.f)) {
            b(!this.am);
        } else {
            c(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(int i) {
        SparseArray<ddz> sparseArray = this.x;
        if (sparseArray != null && sparseArray.get(i) != null) {
            return true;
        }
        LogUtil.j("Track_PaceRangeActivity", "isDistanceArrayKeyValid distanceType invalid");
        return false;
    }

    private String b(int i) {
        return getResources().getString(R.string.IDS_pace_range_label_number, Integer.valueOf(i));
    }

    private void av() {
        if (this.bw == null) {
            View viewInflate = View.inflate(this, R.layout.item_pace_range_run_edit_view, null);
            this.ae = (HealthEditText) viewInflate.findViewById(R.id.het_edit_value);
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.htv_edit_remark);
            healthTextView.setText(getString(R.string.IDS_indoor_run_end_valid_range, new Object[]{UnitUtil.e(20.0d, 1, 1), UnitUtil.e(90.0d, 1, 1)}));
            e(this.ae, healthTextView);
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
            this.bu = builder;
            builder.a(getString(R.string.IDS_data_running_index_title_outside)).b(viewInflate, 0, 0).c(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.20
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }).a(getString(R.string.IDS_hw_common_ui_dialog_confirm), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.16
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    String strTrim = PaceRangeActivity.this.ae.getText().toString().trim();
                    float f = CommonUtils.f(strTrim);
                    if (f > 90.0f || f < 20.0f) {
                        return;
                    }
                    LogUtil.a("Track_PaceRangeActivity", "showRunDataEditDialog edit run data is right");
                    PaceRangeActivity.this.bo.e(strTrim);
                    PaceRangeActivity.this.p = f;
                    PaceRangeActivity paceRangeActivity = PaceRangeActivity.this;
                    paceRangeActivity.a(paceRangeActivity.ad, true, 1);
                    PaceRangeActivity.this.bw.dismiss();
                }
            }).c(false);
            this.bw = this.bu.d();
        }
        this.bw.show();
        this.ab.sendEmptyMessageDelayed(102, 300L);
    }

    private void e(HealthEditText healthEditText, final HealthTextView healthTextView) {
        healthEditText.setFilters(new InputFilter[]{new d(), new InputFilter.LengthFilter(4)});
        healthEditText.addTextChangedListener(new TextWatcher() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.18
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                float f = CommonUtils.f(editable.toString().trim());
                if (PaceRangeActivity.this.bu == null) {
                    LogUtil.j("Track_PaceRangeActivity", "setRunInputEditProperty addTextChangedListener mRunDataEditDialogBuilder is null");
                    return;
                }
                if (f > 90.0f || f < 20.0f) {
                    PaceRangeActivity.this.bu.a(false);
                    healthTextView.setTextColor(ContextCompat.getColor(PaceRangeActivity.this, R.color.colorError));
                } else {
                    PaceRangeActivity.this.bu.a(true);
                    healthTextView.setTextColor(ContextCompat.getColor(PaceRangeActivity.this, R.color.textColorSecondary));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HealthEditText healthEditText) {
        if (healthEditText == null) {
            LogUtil.j("Track_PaceRangeActivity", "showSoftKeyboard inputEditText is null");
            return;
        }
        healthEditText.setFocusable(true);
        healthEditText.setFocusableInTouchMode(true);
        healthEditText.requestFocus();
        Object systemService = healthEditText.getContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            ((InputMethodManager) systemService).showSoftInput(healthEditText, 0);
        }
    }

    @Override // com.huawei.ui.homehealth.runcard.trackfragments.PaceRangeResultFragment.OnResultItemClickListener
    public void onResultItemClick(int i) {
        if (i == 1) {
            ax();
        }
        if (i == 2) {
            aq();
        }
    }

    @Override // com.huawei.ui.homehealth.runcard.trackfragments.PaceRangeRunFragment.OnRuntItemClickListener
    public void onRunItemClick(int i, final boolean z) {
        LogUtil.a("Track_PaceRangeActivity", "onRunItemClick isChecked is ", Boolean.valueOf(z));
        this.ak = z;
        if (i == 1) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.17
                @Override // java.lang.Runnable
                public void run() {
                    dek.c(z);
                }
            });
            if (this.ak) {
                ar();
            } else {
                aj();
            }
            a(this.ad, false, 1);
            a(this.ac, false, 1);
            a(this.ak);
        }
        if (i == 2) {
            if (!this.ak) {
                av();
            } else {
                LogUtil.j("Track_PaceRangeActivity", "onRunItemClick auto calc toggle is close");
            }
        }
    }

    private boolean d(RunningStateIndexData runningStateIndexData) {
        if (runningStateIndexData == null) {
            LogUtil.j("Track_PaceRangeActivity", "hasRunningData data is null");
            return false;
        }
        RunningLevelCurrentData runningLevelCurrentData = runningStateIndexData.getRunningLevelCurrentData();
        if (runningLevelCurrentData == null) {
            LogUtil.j("Track_PaceRangeActivity", "hasRunningData runningLevelCurrentData is null");
            return false;
        }
        if (runningLevelCurrentData.getLastCurrentRunLevel() != 0.0f) {
            return true;
        }
        LogUtil.j("Track_PaceRangeActivity", "hasRunningData currentRunLevel is zero");
        return false;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        this.k = i;
        a(i);
        LogUtil.a("Track_PaceRangeActivity", "onPageSelected mCurrentFragmentPosition ", Integer.valueOf(this.k));
    }

    private void a(int i) {
        if (i == 0) {
            a(this.ad, this.ao, i);
            a(this.ac, this.aq, i);
            d(this.f);
        }
        if (i == 1) {
            a(this.ad, this.ax, i);
            a(this.ac, this.ap, i);
            d(this.bv);
            if (this.ak) {
                ar();
            }
            c();
        }
    }

    private void ar() {
        if (this.n == null) {
            this.n = new gzf();
        }
        if (d(this.by)) {
            float fD = (float) UnitUtil.d(this.by.getRunningLevelCurrentData().getLastCurrentRunLevel(), 1);
            this.p = fD;
            LogUtil.a("Track_PaceRangeActivity", "showAutoCalcPaceView user current running value is ", Float.valueOf(fD));
            c(this.n);
            al();
            ah();
        } else {
            LogUtil.a("Track_PaceRangeActivity", "showAutoCalcPaceView user has not running data");
            dek.b(this.bq);
        }
        aj();
    }

    private void g() {
        if (this.p == 0.0f) {
            LogUtil.j("Track_PaceRangeActivity", "calculatePaceByRun mCurrentRunValue is error");
            return;
        }
        as();
        a(this.ac, true, 1);
        this.am = false;
    }

    private void as() {
        if (this.bv == null) {
            this.bv = new gzf();
        }
        c(this.bv);
        d(this.bv);
    }

    private void c(gzf gzfVar) {
        gzfVar.f(dek.c(0, this.p));
        gzfVar.e(dek.c(1, this.p));
        gzfVar.b(dek.c(2, this.p));
        gzfVar.d(dek.c(3, this.p));
        gzfVar.c(dek.c(4, this.p));
        gzfVar.a(dek.c(5, this.p));
    }

    private void d(gzf gzfVar) {
        if (gzfVar == null || !b(gzfVar)) {
            aj();
        } else {
            j(gzfVar);
            g(gzfVar);
        }
    }

    private void aj() {
        this.w.setText(getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol));
        this.be.setText(getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol));
        this.ba.setText(getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol));
        this.i.setText(getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol));
        this.cd.setText(getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol));
        this.bx.setText(getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol));
        r();
    }

    private void j(gzf gzfVar) {
        this.w.setText(izn.a((float) (((double) gzfVar.g()) * this.bl)));
        this.be.setText(izn.a((float) (((double) gzfVar.a()) * this.bl)));
        this.ba.setText(izn.a((float) (((double) gzfVar.b()) * this.bl)));
        this.i.setText(izn.a((float) (((double) gzfVar.e()) * this.bl)));
        this.cd.setText(izn.a((float) (((double) gzfVar.d()) * this.bl)));
        this.bx.setText(izn.a((float) (((double) gzfVar.c()) * this.bl)));
    }

    private void g(gzf gzfVar) {
        d(gzfVar.g(), this.n.g(), this.u);
        d(gzfVar.a(), this.n.a(), this.bj);
        d(gzfVar.b(), this.n.b(), this.bh);
        d(gzfVar.e(), this.n.e(), this.h);
        d(gzfVar.d(), this.n.d(), this.ce);
        d(gzfVar.c(), this.n.c(), this.cf);
    }

    private void d(int i, int i2, HealthImageView healthImageView) {
        if (i == 0) {
            healthImageView.setVisibility(8);
            return;
        }
        if (i < i2) {
            healthImageView.setImageResource(R.drawable.pace_range_up);
            healthImageView.setVisibility(0);
        } else if (i > i2) {
            healthImageView.setImageResource(R.drawable.pace_range_down);
            healthImageView.setVisibility(0);
        } else {
            healthImageView.setVisibility(8);
        }
    }

    private boolean b(gzf gzfVar) {
        if (gzfVar == null) {
            LogUtil.j("Track_PaceRangeActivity", "isValidPaceConfig config is null");
            return false;
        }
        if (gzfVar.g() == 0) {
            LogUtil.j("Track_PaceRangeActivity", "isValidPaceConfig config getRompedPaceZoneMinvalue is zero");
            return false;
        }
        if (gzfVar.a() == 0) {
            LogUtil.j("Track_PaceRangeActivity", "isValidPaceConfig config getMarathonPaceZoneMinValue is zero");
            return false;
        }
        if (gzfVar.b() == 0) {
            LogUtil.j("Track_PaceRangeActivity", "isValidPaceConfig config getLactatePaceZoneMinValue is zero");
            return false;
        }
        if (gzfVar.e() == 0) {
            LogUtil.j("Track_PaceRangeActivity", "isValidPaceConfig config getAnaerobicPaceZoneMinValue is zero");
            return false;
        }
        if (gzfVar.d() == 0) {
            LogUtil.j("Track_PaceRangeActivity", "isValidPaceConfig config getMaxOxygenPaceZoneMinValue is zero");
            return false;
        }
        if (gzfVar.c() != 0) {
            return true;
        }
        LogUtil.j("Track_PaceRangeActivity", "isValidPaceConfig config getMaxOxygenPaceZoneMaxValue is zero");
        return false;
    }

    private void r() {
        this.u.setVisibility(8);
        this.bj.setVisibility(8);
        this.bh.setVisibility(8);
        this.h.setVisibility(8);
        this.ce.setVisibility(8);
        this.cf.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        int i = this.k;
        final gzf gzfVar = i == 0 ? this.f : null;
        if (i == 1) {
            gzfVar = this.bv;
        }
        if (!b(gzfVar)) {
            LogUtil.j("Track_PaceRangeActivity", "saveResultPaceRange config has invalid value");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.PaceRangeActivity.19
                @Override // java.lang.Runnable
                public void run() {
                    int[] iArr = {gzfVar.g(), gzfVar.a(), gzfVar.b(), gzfVar.e(), gzfVar.d(), gzfVar.c()};
                    dek.b(iArr);
                    if (PaceRangeActivity.this.ab == null) {
                        LogUtil.j("Track_PaceRangeActivity", "saveResultPaceRange mHandler is null");
                        return;
                    }
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 101;
                    messageObtain.obj = iArr;
                    PaceRangeActivity.this.ab.sendMessage(messageObtain);
                }
            });
        }
    }

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f25767c;
        private boolean d;

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i) {
            this.f25767c = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(boolean z) {
            this.d = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            return this.f25767c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            return this.d;
        }
    }

    static class d implements InputFilter {
        private d() {
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            int length = spanned.length();
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i5 = -1;
                    break;
                }
                char cCharAt = spanned.charAt(i5);
                if (".".equals(String.valueOf(cCharAt)) || ",".equals(String.valueOf(cCharAt))) {
                    break;
                }
                i5++;
            }
            if (i5 < 0) {
                return null;
            }
            if (".".equals(charSequence.toString().trim()) || ",".equals(charSequence.toString().trim()) || length - i5 > 1) {
                return "";
            }
            return null;
        }
    }

    private void ak() {
        int iC = c(22);
        d(iC, this.v);
        d(iC, this.bi);
        d(iC, this.bg);
        d(iC, this.o);
        d(iC, this.cl);
        d(iC, this.cg);
    }

    private void d(int i, HealthTextView healthTextView) {
        healthTextView.setMaxWidth(i);
        c(healthTextView, i);
    }

    private int c(int i) {
        return ((jhi.e(this) - (vdo.b(this, 16.0f) * 2)) * i) / 100;
    }

    private int q() {
        return (c(30) - vdo.b(this, 10.0f)) - vdo.b(this, 22.0f);
    }

    private void c(HealthTextView healthTextView, float f) {
        float textSize = healthTextView.getTextSize();
        String string = healthTextView.getText().toString();
        float fMeasureText = healthTextView.getPaint().measureText(string);
        if (fMeasureText == 0.0f) {
            LogUtil.j("Track_PaceRangeActivity", "changeTextSize textViewWidth is zero");
            return;
        }
        if (fMeasureText <= f) {
            LogUtil.j("Track_PaceRangeActivity", "changeTextSize textViewWidth less than textViewMaxWidth");
            return;
        }
        while (fMeasureText > f) {
            textSize -= 1.0f;
            healthTextView.setTextSize(0, textSize);
            fMeasureText = healthTextView.getPaint().measureText(string);
            if (fMeasureText == f) {
                break;
            }
        }
        healthTextView.setTextSize(0, textSize);
    }

    private void b(gzf gzfVar, gzf gzfVar2) {
        if (gzfVar == null || gzfVar2 == null) {
            LogUtil.j("Track_PaceRangeActivity", "checkResultValue applyConfig or resultConfig is null");
            return;
        }
        String string = getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
        if (a(string)) {
            LogUtil.j("Track_PaceRangeActivity", "checkResultValue all result value is not valid value");
            return;
        }
        if (this.w.getText().toString().trim().equals(string)) {
            gzfVar2.f(gzfVar.g());
        }
        if (this.be.getText().toString().trim().equals(string)) {
            gzfVar2.e(gzfVar.a());
        }
        if (this.ba.getText().toString().trim().equals(string)) {
            gzfVar2.b(gzfVar.b());
        }
        if (this.i.getText().toString().trim().equals(string)) {
            gzfVar2.d(gzfVar.e());
        }
        if (this.cd.getText().toString().trim().equals(string)) {
            gzfVar2.c(gzfVar.d());
        }
        if (this.bx.getText().toString().trim().equals(string)) {
            gzfVar2.a(gzfVar.c());
        }
    }

    private boolean a(String str) {
        if (this.w.getText().toString().trim().equals(str)) {
            LogUtil.j("Track_PaceRangeActivity", "isAllResultHasValue easyRunUpResult is not valid value");
            return false;
        }
        if (this.be.getText().toString().trim().equals(str)) {
            LogUtil.j("Track_PaceRangeActivity", "isAllResultHasValue marathonUpResult is not valid value");
            return false;
        }
        if (this.ba.getText().toString().trim().equals(str)) {
            LogUtil.j("Track_PaceRangeActivity", "isAllResultHasValue lacticAcidUpResult is not valid value");
            return false;
        }
        if (this.i.getText().toString().trim().equals(str)) {
            LogUtil.j("Track_PaceRangeActivity", "isAllResultHasValue anaerobicUpResult is not valid value");
            return false;
        }
        if (this.cd.getText().toString().trim().equals(str)) {
            LogUtil.j("Track_PaceRangeActivity", "isAllResultHasValue takeOxygenUpResult is not valid value");
            return false;
        }
        if (!this.bx.getText().toString().trim().equals(str)) {
            return true;
        }
        LogUtil.j("Track_PaceRangeActivity", "isAllResultHasValue takeOxygenLowResult is not valid value");
        return false;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
