package com.twitter.sdk.android.core.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStore;

/* JADX INFO: loaded from: classes18.dex */
class b {
    private static final String c = "limit_ad_tracking_enabled";
    private static final String d = "advertising_id";
    private final Context a;
    private final PreferenceStore b;

    public class a implements Runnable {
        public final /* synthetic */ com.twitter.sdk.android.core.internal.a a;

        public a(com.twitter.sdk.android.core.internal.a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.twitter.sdk.android.core.internal.a aVarD = b.this.d();
            if (this.a.equals(aVarD)) {
                return;
            }
            Twitter.getLogger().d("Twitter", "Asychronously getting Advertising Info and storing it to preferences");
            b.this.j(aVarD);
        }
    }

    public b(Context context, PreferenceStore preferenceStore) {
        this.a = context.getApplicationContext();
        this.b = preferenceStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.twitter.sdk.android.core.internal.a d() {
        com.twitter.sdk.android.core.internal.a aVarA = f().a();
        if (h(aVarA)) {
            Twitter.getLogger().d("Twitter", "Using AdvertisingInfo from Reflection Provider");
        } else {
            aVarA = g().a();
            if (h(aVarA)) {
                Twitter.getLogger().d("Twitter", "Using AdvertisingInfo from Service Provider");
            } else {
                Twitter.getLogger().d("Twitter", "AdvertisingInfo not present");
            }
        }
        return aVarA;
    }

    private com.twitter.sdk.android.core.internal.a e() {
        return new com.twitter.sdk.android.core.internal.a(this.b.get().getString(d, ""), this.b.get().getBoolean(c, false));
    }

    private e f() {
        return new c(this.a);
    }

    private e g() {
        return new d(this.a);
    }

    private boolean h(com.twitter.sdk.android.core.internal.a aVar) {
        return (aVar == null || TextUtils.isEmpty(aVar.a)) ? false : true;
    }

    private void i(com.twitter.sdk.android.core.internal.a aVar) {
        new Thread(new a(aVar)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public void j(com.twitter.sdk.android.core.internal.a aVar) {
        if (h(aVar)) {
            PreferenceStore preferenceStore = this.b;
            preferenceStore.save(preferenceStore.edit().putString(d, aVar.a).putBoolean(c, aVar.b));
        } else {
            PreferenceStore preferenceStore2 = this.b;
            preferenceStore2.save(preferenceStore2.edit().remove(d).remove(c));
        }
    }

    public com.twitter.sdk.android.core.internal.a c() {
        com.twitter.sdk.android.core.internal.a aVarE = e();
        if (h(aVarE)) {
            Twitter.getLogger().d("Twitter", "Using AdvertisingInfo from Preference Store");
            i(aVarE);
            return aVarE;
        }
        com.twitter.sdk.android.core.internal.a aVarD = d();
        j(aVarD);
        return aVarD;
    }
}
