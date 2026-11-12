package com.huawei.openalliance.ad.activity;

import android.app.ActionBar;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.dg;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends e {
    private boolean e() {
        return true;
    }

    protected int c() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.e, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    protected String b() {
        return "";
    }

    private void d() {
        ActionBar actionBar = getActionBar();
        if (actionBar == null || !e()) {
            return;
        }
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        if (c() == 0 && dg.b(b())) {
            return;
        }
        if (cc.b(this)) {
            if (dg.b(b())) {
                actionBar.setTitle(c());
                return;
            } else {
                actionBar.setTitle(b());
                return;
            }
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.action_bar_title_layout, (ViewGroup) null);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setCustomView(viewInflate);
        a(viewInflate);
        if (dg.b(b())) {
            ((TextView) findViewById(R.id.custom_action_bar_title)).setText(c());
        } else {
            ((TextView) findViewById(R.id.custom_action_bar_title)).setText(b());
        }
    }

    private void a(final View view) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            final Toolbar toolbar = (Toolbar) view.getParent();
            if (toolbar != null) {
                toolbar.setLayoutParams(layoutParams);
            }
            view.post(new Runnable() { // from class: com.huawei.openalliance.ad.activity.c.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        TypedValue typedValue = new TypedValue();
                        int iMax = Math.max(view.getHeight(), c.this.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, c.this.getResources().getDisplayMetrics()) : 0);
                        if (iMax > 0) {
                            toolbar.setMinimumHeight(iMax);
                        }
                    } catch (Throwable unused) {
                        hw.c("BasePureWebActivity", "set toolBar min height error.");
                    }
                }
            });
        } catch (Throwable unused) {
            hw.c("BasePureWebActivity", "setCustomToolBar error.");
        }
    }
}
