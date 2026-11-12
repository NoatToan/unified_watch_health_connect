package com.xiaomi.fitness.sport.view.justdance.control;

import android.content.Context;
import androidx.p004activity.contextaware.OnContextAvailableListener;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.gbq;
import defpackage.txa;
import defpackage.zyd;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_JustDanceShareWebViewActivity extends WebViewActivity {
    private boolean injected = false;

    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.p004activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_JustDanceShareWebViewActivity.this.inject();
        }
    }

    public Hilt_JustDanceShareWebViewActivity() {
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
        ((zyd) ((txa) gbq.a(this)).generatedComponent()).T1((JustDanceShareWebViewActivity) gbq.a(this));
    }
}
