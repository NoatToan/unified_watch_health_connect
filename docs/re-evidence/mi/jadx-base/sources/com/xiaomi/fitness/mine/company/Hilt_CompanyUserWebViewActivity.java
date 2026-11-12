package com.xiaomi.fitness.mine.company;

import android.content.Context;
import androidx.p004activity.contextaware.OnContextAvailableListener;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.gbq;
import defpackage.n94;
import defpackage.txa;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Hilt_CompanyUserWebViewActivity extends WebViewActivity {
    private boolean injected = false;

    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.p004activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_CompanyUserWebViewActivity.this.inject();
        }
    }

    public Hilt_CompanyUserWebViewActivity() {
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
        ((n94) ((txa) gbq.a(this)).generatedComponent()).Q2((CompanyUserWebViewActivity) gbq.a(this));
    }
}
