package com.xiaomi.fitness.webview.healthwebview;

import android.content.Context;
import androidx.p004activity.contextaware.OnContextAvailableListener;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.gbq;
import defpackage.t3c;
import defpackage.txa;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_HealthWebViewActivity extends WebViewActivity {
    private boolean injected = false;

    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.p004activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_HealthWebViewActivity.this.inject();
        }
    }

    public Hilt_HealthWebViewActivity() {
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
        ((t3c) ((txa) gbq.a(this)).generatedComponent()).x2((HealthWebViewActivity) gbq.a(this));
    }
}
