package com.xiaomi.fitness.sport_eco.view.launch.gym.setting;

import android.content.Context;
import androidx.p004activity.contextaware.OnContextAvailableListener;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.gbq;
import defpackage.hi2;
import defpackage.txa;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_BeltAdjustWebViewActivity extends WebViewActivity {
    private boolean injected = false;

    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.p004activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_BeltAdjustWebViewActivity.this.inject();
        }
    }

    public Hilt_BeltAdjustWebViewActivity() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.xiaomi.fitness.webview.Hilt_WebViewActivity
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((hi2) ((txa) gbq.a(this)).generatedComponent()).A1((BeltAdjustWebViewActivity) gbq.a(this));
    }
}
