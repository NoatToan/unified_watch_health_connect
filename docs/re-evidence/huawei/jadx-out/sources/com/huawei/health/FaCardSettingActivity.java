package com.huawei.health;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import defpackage.ira;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class FaCardSettingActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6110a = -1;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        LogUtil.a("FaCardSettingActivity", "onCreate");
        super.onCreate(bundle);
        setContentView(R.layout.fa_card_setting_activity);
        this.f6110a = e();
        String strB = b();
        String strD = d();
        String strC = c();
        int iA = a();
        if (TextUtils.isEmpty(strB) || TextUtils.isEmpty(strD) || TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.e("R_FaCardSettingActivity", "fa card not find");
            finish();
        } else {
            ira iraVar = new ira(this, strB, strD, strC, iA);
            iraVar.show();
            iraVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: dax
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.d.a(dialogInterface);
                }
            });
        }
    }

    public /* synthetic */ void a(DialogInterface dialogInterface) {
        finish();
    }

    private int e() {
        Uri uriB = AppRouterUtils.b(getIntent());
        if (uriB == null) {
            ReleaseLogUtil.e("R_FaCardSettingActivity", "schemeData is null");
            return -1;
        }
        String queryParameter = uriB.getQueryParameter("type");
        if (TextUtils.isEmpty(queryParameter) || !TextUtils.isDigitsOnly(queryParameter)) {
            ReleaseLogUtil.e("R_FaCardSettingActivity", "vaild type: ", queryParameter);
            return -1;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException e) {
            ReleaseLogUtil.e("R_FaCardSettingActivity", e.getMessage());
            return -1;
        }
    }

    private String b() {
        int i = this.f6110a;
        if (i == 201) {
            return "sports_card_medium";
        }
        if (i == 202) {
            return "sports_card_mini";
        }
        if (i == 301) {
            return "fitness_courses_medium";
        }
        if (i == 401) {
            return "diet_diary_medium";
        }
        if (i != 402) {
            switch (i) {
                case 101:
                    return "sleep_card_medium";
                case 102:
                    return "sleep_music_mini";
                case 103:
                    return "sleep_data_mini";
                default:
                    return "";
            }
        }
        return "diet_diary_mini";
    }

    private String d() {
        int i = this.f6110a;
        if (i == 201) {
            return qre.f(R.string.IDS_fa_card_sport_2x2_title);
        }
        if (i == 202) {
            return qre.f(R.string.IDS_fa_card_sport_1x2_title);
        }
        if (i == 301) {
            return qre.f(R.string.IDS_fa_card_fitness_2x2_title);
        }
        if (i != 401 && i != 402) {
            switch (i) {
                case 101:
                    return qre.f(R.string.IDS_fa_card_sleep_2x2_title);
                case 102:
                    return qre.f(R.string.IDS_fa_card_sleep_music_1x2_title);
                case 103:
                    return qre.f(R.string.IDS_fa_card_sleep_data_1x2_title);
                default:
                    return "";
            }
        }
        return qre.f(R.string.IDS_fa_card_diet_2x2_title);
    }

    private String c() {
        int i = this.f6110a;
        if (i == 201) {
            return qre.f(R.string.IDS_fa_card_sport_2x2_desc);
        }
        if (i == 202) {
            return qre.f(R.string.IDS_fa_card_sport_1x2_desc);
        }
        if (i == 301) {
            return qre.f(R.string.IDS_fa_card_fitness_2x2_desc);
        }
        if (i == 401) {
            return qre.f(R.string.IDS_fa_card_diet_2x2_desc);
        }
        if (i != 402) {
            switch (i) {
                case 101:
                    return qre.f(R.string.IDS_fa_card_sleep_2x2_desc);
                case 102:
                    return qre.f(R.string.IDS_fa_card_sleep_music_1x2_desc);
                case 103:
                    return qre.f(R.string.IDS_fa_card_sleep_data_1x2_desc);
                default:
                    return "";
            }
        }
        return qre.f(R.string.IDS_fa_card_diet_1x2_desc);
    }

    private int a() {
        int i = this.f6110a;
        if (i == 201) {
            if (ProfileRequestConstants.X_LANGUAGE_VALUE.equals(LanguageUtil.a())) {
                return R.mipmap.sport_card_2x2;
            }
            return R.mipmap.sport_card_2x2_en;
        }
        if (i == 202) {
            if (ProfileRequestConstants.X_LANGUAGE_VALUE.equals(LanguageUtil.a())) {
                return R.mipmap.sport_card_1x2;
            }
            return R.mipmap.sport_card_1x2_en;
        }
        if (i == 301) {
            if (ProfileRequestConstants.X_LANGUAGE_VALUE.equals(LanguageUtil.a())) {
                return R.mipmap.fitness_card_2x2;
            }
            return R.mipmap.fitness_card_2x2_en;
        }
        if (i == 401) {
            if (ProfileRequestConstants.X_LANGUAGE_VALUE.equals(LanguageUtil.a())) {
                return R.mipmap.diet_card_2x2;
            }
            return R.mipmap.diet_card_2x2_en;
        }
        if (i != 402) {
            switch (i) {
                case 101:
                    if (ProfileRequestConstants.X_LANGUAGE_VALUE.equals(LanguageUtil.a())) {
                        return R.mipmap.sleep_card_2x2;
                    }
                    return R.mipmap.sleep_card_2x2_en;
                case 102:
                    if (ProfileRequestConstants.X_LANGUAGE_VALUE.equals(LanguageUtil.a())) {
                        return R.mipmap.sleep_music_1x2;
                    }
                    return R.mipmap.sleep_music_1x2_en;
                case 103:
                    if (ProfileRequestConstants.X_LANGUAGE_VALUE.equals(LanguageUtil.a())) {
                        return R.mipmap.sleep_data_1x2;
                    }
                    return R.mipmap.sleep_data_1x2_en;
                default:
                    return -1;
            }
        }
        if (ProfileRequestConstants.X_LANGUAGE_VALUE.equals(LanguageUtil.a())) {
            return R.mipmap.diet_card_1x2;
        }
        return R.mipmap.diet_card_1x2_en;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
