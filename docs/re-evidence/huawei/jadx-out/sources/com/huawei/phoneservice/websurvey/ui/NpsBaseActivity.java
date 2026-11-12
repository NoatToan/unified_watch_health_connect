package com.huawei.phoneservice.websurvey.ui;

import android.app.ActionBar;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.websurvey.R;

/* JADX INFO: loaded from: classes13.dex */
public abstract class NpsBaseActivity extends AbstractBaseActivity {
    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        ActionBar actionBar;
        super.setTitle(charSequence);
        if (this.f21984a && (actionBar = getActionBar()) != null) {
            com.huawei.phoneservice.faq.base.widget.c.d(actionBar, charSequence);
        }
    }

    @Override // com.huawei.phoneservice.websurvey.ui.AbstractBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LinearLayout linearLayout;
        super.onCreate(bundle);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            try {
                com.huawei.phoneservice.faq.base.widget.c.d(actionBar, true, new View.OnClickListener() { // from class: com.huawei.phoneservice.websurvey.ui.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f21990b.onBackPressed(view);
                    }
                });
                if (!com.huawei.phoneservice.faq.base.widget.c.e() && (linearLayout = (LinearLayout) findViewById(R.id.linearlayout_action_bar_base_activity)) != null) {
                    linearLayout.setBackgroundColor(getResources().getColor(R.color.emui_color_subbg));
                }
                com.huawei.phoneservice.faq.base.widget.c.e(actionBar, true);
                TextView textViewO = o();
                if (textViewO != null) {
                    com.huawei.phoneservice.faq.base.widget.c.c(actionBar, textViewO);
                }
            } catch (Exception unused) {
                g.c("NpsBaseActivity", "exception happend!");
            }
        }
    }

    public TextView o() {
        return (TextView) getWindow().findViewById(Resources.getSystem().getIdentifier("action_bar_title", "id", OsType.ANDROID));
    }

    @Override // com.huawei.phoneservice.websurvey.ui.AbstractBaseActivity
    protected int n() {
        return com.huawei.uikit.hwresources.R.dimen.emui_dimens_max_start;
    }

    @Override // com.huawei.phoneservice.websurvey.ui.AbstractBaseActivity
    protected int j() {
        return com.huawei.uikit.hwresources.R.dimen.padding_m;
    }
}
