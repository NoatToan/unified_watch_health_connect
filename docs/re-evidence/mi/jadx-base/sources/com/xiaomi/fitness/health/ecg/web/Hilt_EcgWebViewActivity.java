package com.xiaomi.fitness.health.ecg.web;

import android.content.Context;
import androidx.p004activity.contextaware.OnContextAvailableListener;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.gbq;
import defpackage.txa;
import defpackage.vc7;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Hilt_EcgWebViewActivity extends WebViewActivity {
    private boolean injected = false;

    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.p004activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_EcgWebViewActivity.this.inject();
        }
    }

    public Hilt_EcgWebViewActivity() {
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
        ((vc7) ((txa) gbq.a(this)).generatedComponent()).b0((EcgWebViewActivity) gbq.a(this));
    }
}
