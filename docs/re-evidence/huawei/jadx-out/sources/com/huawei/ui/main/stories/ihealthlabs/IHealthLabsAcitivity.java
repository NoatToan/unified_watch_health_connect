package com.huawei.ui.main.stories.ihealthlabs;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.ihealthlabs.freeindoorrunning.FreeIndoorRunningActivity;
import defpackage.lmf;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class IHealthLabsAcitivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f28359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f28360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f28361c;
    private ImageView e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("IHealthLabsAcitivity", "onCreate");
        setContentView(R.layout.activity_ihealth_labs);
        d();
        c();
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
    }

    private void c() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.free_indoor_running);
        this.f28360b = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.f28359a = (ImageView) findViewById(R.id.iHealth_lab_background);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.free_indoor_running_img_layout);
        this.f28361c = linearLayout;
        qrs.b(linearLayout, 2);
        this.e = (ImageView) findViewById(R.id.indoor_arrow);
        Context context = BaseApplication.getContext();
        boolean zBa = LanguageUtil.ba(context);
        BitmapDrawable bitmapDrawableE = qqz.e(context, R.drawable.pic_laboratory);
        if (zBa) {
            this.e.setImageDrawable(qqz.e(context, R.drawable.ic_health_list_arrow_gray));
            this.f28359a.setImageDrawable(bitmapDrawableE);
        } else {
            this.f28359a.setImageDrawable(context.getResources().getDrawable(R.drawable.pic_laboratory));
            this.e.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_health_list_arrow_gray));
        }
    }

    private void d() {
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "ihealthredpoint", "clicked", new StorageParams());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.a("IHealthLabsAcitivity", "onClick view is null");
            return;
        }
        if (view.getId() != R.id.free_indoor_running) {
            LogUtil.a("IHealthLabsAcitivity", "onClick else");
            return;
        }
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_MINE_FREE_INDOOR_RUNNING_2040073.value(), map, 0);
        startActivity(new Intent(this, (Class<?>) FreeIndoorRunningActivity.class));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
