package com.huawei.sim.multisim.activity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.sim.esim.view.EsimManagerActivity;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.npz;
import defpackage.pxk;
import defpackage.qqp;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class MultiSimOpenGuideActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f23149a;
    private HealthTextView d;
    private ImageView f;
    private HealthTextView g;
    private CustomTitleBar h;
    private HealthTextView i;
    private RelativeLayout j;
    private Context e = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f23151c = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23150b = 1;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("MultiSimOpenGuideActivity", "onCreate");
        this.e = this;
        setContentView(R.layout.activity_multi_sim_open_guide);
        Intent intent = getIntent();
        if (intent != null) {
            this.f23151c = intent.getStringExtra("simImsi");
            this.f23150b = intent.getIntExtra("cardType", 1);
        }
        c();
        b();
    }

    private void c() {
        String string;
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.multi_sim_open_guide_title_bar);
        this.h = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.j = (RelativeLayout) findViewById(R.id.multi_sim_open_guide_image_layout);
        this.f = (ImageView) findViewById(R.id.multi_sim_open_guide_image);
        this.i = (HealthTextView) findViewById(R.id.multi_sim_open_guide_tips);
        this.g = (HealthTextView) findViewById(R.id.multi_sim_open_guide_page_num);
        this.d = (HealthTextView) findViewById(R.id.multi_sim_open_guide_content);
        if (this.f23150b == 1) {
            string = this.e.getString(R.string.IDS_multi_sim);
        } else {
            string = this.e.getString(R.string.IDS_guide_open_method_standalone);
        }
        if (pxk.d(this.f23151c)) {
            if (this.f23150b == 2) {
                this.d.setText(getResources().getString(R.string.IDS_guide_open_content_cmcc_standalone));
            } else {
                this.d.setText(getResources().getString(R.string.IDS_guide_open_content_cmcc_multi_sim));
            }
        } else if (pxk.h(this.f23151c)) {
            this.d.setText(String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_guide_open_content_cucc_standalone), string));
        } else if (pxk.a(this.f23151c)) {
            this.d.setText(String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_guide_open_content_ctcc_standalone), string));
        } else {
            this.d.setText(getResources().getString(R.string.IDS_guide_open_content));
        }
        HealthButton healthButton = (HealthButton) findViewById(R.id.multi_sim_open_guide_open);
        this.f23149a = healthButton;
        healthButton.setOnClickListener(this);
        if (qrs.m() - qrs.s(this.e) < qqp.a(this.e, 640.0f)) {
            LogUtil.a("MultiSimOpenGuideActivity", "initView low phone");
            this.f.getLayoutParams().width = qqp.a(this.e, 212.0f);
            this.f.getLayoutParams().height = qqp.a(this.e, 212.0f);
            this.j.getLayoutParams().height = qqp.a(this.e, 248.0f);
        }
    }

    private void b() {
        LogUtil.a("MultiSimOpenGuideActivity", "setViewData()");
        Bitmap bitmapB = pxk.b(true, this.f23151c, this.f23150b);
        if (bitmapB != null) {
            this.f.setImageBitmap(bitmapB);
        } else {
            LogUtil.j("MultiSimOpenGuideActivity", "open guide image is default");
            this.f.setImageResource(R.drawable.operator_default_img);
        }
        String str = String.format(Locale.ENGLISH, this.e.getString(R.string.IDS_guide_page_num), UnitUtil.e(2.0d, 1, 0), UnitUtil.e(2.0d, 1, 0));
        this.i.setText(getResources().getString(R.string.IDS_esim_guide_open_note));
        this.g.setText(str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.multi_sim_open_guide_open) {
            LogUtil.a("MultiSimOpenGuideActivity", "onClick open button");
            try {
                Intent intent = new Intent(this.e, (Class<?>) MultiSimAuthActivity.class);
                intent.putExtra("simImsi", this.f23151c);
                intent.putExtra("cardType", this.f23150b);
                this.e.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("MultiSimOpenGuideActivity", "click open button ActivityNotFoundException");
                return;
            }
        }
        LogUtil.j("MultiSimOpenGuideActivity", "onClick other");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean zI = npz.b().i();
        LogUtil.a("MultiSimOpenGuideActivity", "onResume isOperatorOpenSuccess = ", Boolean.valueOf(zI));
        if (zI) {
            Intent intent = new Intent(this, (Class<?>) EsimManagerActivity.class);
            intent.setFlags(67108864);
            startActivity(intent);
            finish();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
