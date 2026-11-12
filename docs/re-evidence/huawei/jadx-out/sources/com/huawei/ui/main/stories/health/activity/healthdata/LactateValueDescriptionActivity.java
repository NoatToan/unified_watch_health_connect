package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.template.BaseActivity;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
public class LactateValueDescriptionActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwTextView f27584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwTextView f27585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwTextView f27586c;
    private HwTextView d;
    private HwTextView e;
    private HwTextView f;
    private HwTextView g;
    private HwTextView h;
    private HwTextView i;
    private HwTextView j;
    private String k;
    private HwTextView l;
    private HwTextView m;
    private HwTextView n;
    private String o;
    private String p;
    private HwTextView q;
    private String r;
    private HwTextView s;
    private String t;
    private HwTextView u;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_lactate_description);
        cancelAdaptRingRegion();
        c();
        a();
        d();
    }

    public void c() {
        this.j = (HwTextView) findViewById(R.id.IDS_lactate_subHeader_top1_text);
        this.u = (HwTextView) findViewById(R.id.IDS_lactate_subHeader_top2);
        this.q = (HwTextView) findViewById(R.id.IDS_lactate_subHeader_top2_text);
        this.m = (HwTextView) findViewById(R.id.IDS_lactate_subHeader_top3);
        this.l = (HwTextView) findViewById(R.id.IDS_lactate_subHeader_top3_text);
        this.f27586c = (HwTextView) findViewById(R.id.IDS_lactate_subHeader_top4);
        this.f27584a = (HwTextView) findViewById(R.id.IDS_lactate_subHeader_top4_text);
        this.h = (HwTextView) findViewById(R.id.IDS_lactate_subHeader_top5);
        this.i = (HwTextView) findViewById(R.id.IDS_lactate_subHeader_top5_text);
        this.e = (HwTextView) findViewById(R.id.IDS_lactate_subHeader_top6);
        this.f27585b = (HwTextView) findViewById(R.id.IDS_lactate_subHeader_top6_text);
        this.s = (HwTextView) findViewById(R.id.IDS_lactate_one);
        this.n = (HwTextView) findViewById(R.id.IDS_lactate_two);
        this.f = (HwTextView) findViewById(R.id.IDS_lactate_three);
        this.g = (HwTextView) findViewById(R.id.IDS_lactate_four);
        this.d = (HwTextView) findViewById(R.id.IDS_lactate_five);
    }

    public void a() {
        this.j.setText(R.string.IDS_lactate_subHeader_top1_text);
        this.u.setText(R.string.IDS_lactate_subHeader_top2);
        this.q.setText(R.string.IDS_lactate_subHeader_top2_text);
        this.m.setText(R.string.IDS_lactate_subHeader_top3);
        this.l.setText(R.string.IDS_lactate_subHeader_top3_text);
        this.f27586c.setText(R.string.IDS_lactate_subHeader_top4);
        this.f27584a.setText(R.string.IDS_lactate_subHeader_top4_text);
        this.h.setText(R.string.IDS_lactate_subHeader_top5);
        this.i.setText(R.string.IDS_lactate_subHeader_top5_text);
        this.e.setText(R.string.IDS_lactate_subHeader_top6);
        this.f27585b.setText(R.string.IDS_lactate_subHeader_top6_text);
    }

    public void d() {
        String strE = e(87.0d, 1, 0);
        String str = d(80.0d, 1, 0) + strE;
        this.o = str;
        this.s.setText(str);
        String strE2 = e(80.0d, 1, 0);
        String str2 = d(89.0d, 1, 0) + strE2;
        this.t = str2;
        this.n.setText(str2);
        String strE3 = e(89.0d, 1, 0);
        String str3 = d(97.0d, 1, 0) + strE3;
        this.p = str3;
        this.f.setText(str3);
        String strE4 = e(90.0d, 1, 0);
        String str4 = d(102.0d, 1, 0) + strE4;
        this.r = str4;
        this.g.setText(str4);
        String strD = d(102.0d, 1, 0);
        this.k = strD;
        this.d.setText(strD);
    }

    public String e(double d, int i, int i2) {
        return UnitUtil.e(d, i, i2) + " % ";
    }

    public String d(double d, int i, int i2) {
        return UnitUtil.e(d, i, i2) + " %~ ";
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
