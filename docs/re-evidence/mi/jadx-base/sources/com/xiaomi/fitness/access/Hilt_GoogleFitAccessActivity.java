package com.xiaomi.fitness.access;

import android.content.Context;
import androidx.p004activity.contextaware.OnContextAvailableListener;
import defpackage.gbq;
import defpackage.q2b;
import defpackage.txa;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Hilt_GoogleFitAccessActivity extends BaseThirdPartyAccessActivity {
    private boolean injected = false;

    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.p004activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_GoogleFitAccessActivity.this.inject();
        }
    }

    public Hilt_GoogleFitAccessActivity() {
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
        ((q2b) ((txa) gbq.a(this)).generatedComponent()).K2((GoogleFitAccessActivity) gbq.a(this));
    }
}
