package com.xiaomi.fitness.access.health_connect;

import android.content.Context;
import androidx.p004activity.contextaware.OnContextAvailableListener;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.gbq;
import defpackage.prb;
import defpackage.txa;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Hilt_HealthConnectPrivacyActivity extends WebViewActivity {
    private boolean injected = false;

    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.p004activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_HealthConnectPrivacyActivity.this.inject();
        }
    }

    public Hilt_HealthConnectPrivacyActivity() {
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
        ((prb) ((txa) gbq.a(this)).generatedComponent()).R0((HealthConnectPrivacyActivity) gbq.a(this));
    }
}
