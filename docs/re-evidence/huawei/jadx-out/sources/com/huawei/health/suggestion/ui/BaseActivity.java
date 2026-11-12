package com.huawei.health.suggestion.ui;

import android.os.Bundle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.hzi;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseActivity extends BaseActivityTemp {
    protected static final int HAVE_NO_NET = -404;
    private static final String TAG = "Suggestion_BaseActivity";

    public abstract void initData();

    public abstract void initLayout();

    public abstract void initViewController();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hzi.b(new WeakReference(this));
        setHealthTheme();
        initData();
        initLayout();
        initViewController();
    }

    public void setHealthTheme() {
        int identifier = getResources().getIdentifier("HealthTheme", TtmlNode.TAG_STYLE, "com.huawei.health");
        if (identifier == 0) {
            LogUtil.j(TAG, "onCreate if (healthTheme == 0)");
        } else {
            LogUtil.a(TAG, "onCreate if (healthTheme == 0) ELSE healthTheme=", Integer.valueOf(identifier));
            setTheme(identifier);
        }
    }

    protected String getError(int i) {
        if (i != -404) {
            return getString(R.string.sug_data_fetch_error);
        }
        return getString(R.string.sug_haveno_network);
    }
}
