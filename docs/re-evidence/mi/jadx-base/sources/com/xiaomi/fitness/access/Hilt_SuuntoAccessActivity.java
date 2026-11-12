package com.xiaomi.fitness.access;

import android.content.Context;
import androidx.p004activity.contextaware.OnContextAvailableListener;
import defpackage.gbq;
import defpackage.txa;
import defpackage.yqo;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Hilt_SuuntoAccessActivity extends BaseThirdPartyAccessActivity {
    private boolean injected = false;

    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.p004activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_SuuntoAccessActivity.this.inject();
        }
    }

    public Hilt_SuuntoAccessActivity() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.xiaomi.fitness.access.Hilt_BaseThirdPartyAccessActivity
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((yqo) ((txa) gbq.a(this)).generatedComponent()).w((SuuntoAccessActivity) gbq.a(this));
    }
}
