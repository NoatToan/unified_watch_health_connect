package com.huawei.pluginachievement.ui.level;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.lmf;
import defpackage.oru;
import defpackage.osb;
import defpackage.ouo;
import defpackage.out;
import defpackage.oyw;
import defpackage.paq;
import defpackage.paw;
import defpackage.qpb;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveLevelMessageDialog extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f22225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22226c;
    private LinearLayout d;
    private ImageView e;
    private ImageView g;
    private ImageView j;
    private HealthTextView k;
    private HealthTextView m;
    private Context n;
    private HealthButton p;
    private String l = "";
    private String f = "";
    private HashMap<Integer, Integer> o = new HashMap<>(0);
    private HashMap<Integer, Integer> i = new HashMap<>(0);
    private int h = 1;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(134217728);
        setContentView(R.layout.achieve_level_message_dialog);
        this.n = this;
        j();
        qpb.d(this.n);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        d();
    }

    private void j() {
        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra(RemoteMessageConst.Notification.TAG);
            if (bundleExtra != null) {
                int i = bundleExtra.getInt("level");
                this.h = i;
                if (i <= 1 || i > 20) {
                    finish();
                    return;
                }
                paq.e(this.o);
                paq.b(this.i);
                this.g = (ImageView) out.d(this, R.id.achieve_level_animation_up_before);
                this.j = (ImageView) out.d(this, R.id.achieve_level_animation_up_after);
                int iIntValue = this.o.get(Integer.valueOf(this.h - 1)).intValue();
                if (iIntValue != -1) {
                    this.g.setImageResource(iIntValue);
                }
                int iIntValue2 = this.o.get(Integer.valueOf(this.h)).intValue();
                if (iIntValue2 != -1) {
                    this.j.setImageResource(iIntValue2);
                }
                this.j.setVisibility(4);
                this.m = (HealthTextView) out.d(this, R.id.achieve_level_dialog_date);
                String strB = b(String.valueOf(System.currentTimeMillis()));
                this.l = strB;
                LogUtil.a("PLGACHIEVE_AchieveLevelMessageDialog", "level up time =", strB);
                String str = this.l;
                this.f = str;
                this.m.setText(str);
                HealthButton healthButton = (HealthButton) out.d(this, R.id.achieve_level_dialog_share_button);
                this.p = healthButton;
                healthButton.setOnClickListener(this);
                this.k = (HealthTextView) out.d(this, R.id.level_mgs);
                String str2 = String.format(Locale.ROOT, BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_level_msg_desc), BaseApplication.getContext().getResources().getString(this.i.get(Integer.valueOf(this.h)).intValue()));
                a();
                this.k.setText(str2);
                ImageView imageView = (ImageView) out.d(this, R.id.achieve_level_dialog_title_ImageView);
                this.e = imageView;
                imageView.setOnClickListener(this);
                c();
                return;
            }
            finish();
            return;
        }
        finish();
    }

    private void c() {
        this.e.setVisibility(4);
        this.k.setVisibility(4);
        this.p.setVisibility(4);
        this.m.setVisibility(4);
        AnimationSet animationSetE = oyw.e(200);
        animationSetE.setStartOffset(500L);
        this.g.startAnimation(animationSetE);
        animationSetE.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.pluginachievement.ui.level.AchieveLevelMessageDialog.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                AchieveLevelMessageDialog.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.g.setVisibility(8);
        this.j.setVisibility(0);
        AnimationSet animationSetD = oyw.d(500, 300);
        this.j.startAnimation(animationSetD);
        animationSetD.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.pluginachievement.ui.level.AchieveLevelMessageDialog.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                AchieveLevelMessageDialog.this.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.e.setVisibility(0);
        this.k.setVisibility(0);
        this.p.setVisibility(0);
        this.m.setVisibility(0);
        AnimationSet animationSetB = oyw.b(1000);
        this.p.startAnimation(animationSetB);
        this.k.startAnimation(animationSetB);
        this.e.startAnimation(animationSetB);
    }

    private void d() {
        HashMap map = new HashMap(4);
        if (!Utils.o()) {
            map.put("level", String.valueOf(this.h));
        }
        lmf.d().c(this.n, AnalyticsValue.LEVEL_MESSAGE_DIALOG_1100022.value(), map, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (R.id.achieve_level_dialog_title_ImageView == view.getId()) {
            finish();
        } else if (R.id.achieve_level_dialog_share_button == view.getId()) {
            h();
        } else {
            LogUtil.d("PLGACHIEVE_AchieveLevelMessageDialog", "onClick view is not matching");
        }
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return UnitUtil.a(new Date(Long.parseLong(str)), 20);
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_AchieveLevelMessageDialog", "setGainTime NumberFormatException");
            return "";
        }
    }

    private void a() {
        LinearLayout linearLayout = (LinearLayout) out.d(this, R.id.achieve_level_share_ll);
        this.d = linearLayout;
        HealthTextView healthTextView = (HealthTextView) out.b(linearLayout, R.id.achieve_level_share_date);
        this.f22224a = healthTextView;
        healthTextView.setText(this.f);
        ImageView imageView = (ImageView) out.b(this.d, R.id.achieve_level_share_image);
        this.f22225b = imageView;
        imageView.setImageResource(this.o.get(Integer.valueOf(this.h)).intValue());
        this.f22226c = (HealthTextView) out.b(this.d, R.id.achieve_level_share_text_level);
        this.f22226c.setText(String.format(Locale.ROOT, BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_level_msg_desc), BaseApplication.getContext().getResources().getString(this.i.get(Integer.valueOf(this.h)).intValue())));
    }

    private void h() {
        if (!osb.c(this.n)) {
            paw.a(this.n);
            return;
        }
        if (oru.a(this.n).getAdapter() != null) {
            HashMap map = new HashMap(4);
            map.put("click", "1");
            if (!Utils.o()) {
                map.put("level", String.valueOf(this.h));
            }
            Bitmap bitmapC = ouo.c(this.d);
            if (bitmapC != null) {
                osb.c(this.n, bitmapC, AnalyticsValue.LEVEL_SHARE_1100023.value(), map);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
