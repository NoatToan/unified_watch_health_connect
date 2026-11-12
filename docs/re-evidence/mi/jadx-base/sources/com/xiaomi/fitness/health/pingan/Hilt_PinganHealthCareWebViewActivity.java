package com.xiaomi.fitness.health.pingan;

import android.content.Context;
import androidx.p004activity.contextaware.OnContextAvailableListener;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.gbq;
import defpackage.txa;
import defpackage.wwh;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Hilt_PinganHealthCareWebViewActivity extends WebViewActivity {
    private boolean injected = false;

    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.p004activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_PinganHealthCareWebViewActivity.this.inject();
        }
    }

    public Hilt_PinganHealthCareWebViewActivity() {
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
        ((wwh) ((txa) gbq.a(this)).generatedComponent()).Z1((PinganHealthCareWebViewActivity) gbq.a(this));
    }
}
