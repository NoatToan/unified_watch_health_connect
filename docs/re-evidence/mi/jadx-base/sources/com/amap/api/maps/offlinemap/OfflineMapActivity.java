package com.amap.api.maps.offlinemap;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.amap.api.offlineservice.AMapPermissionActivity;
import defpackage.pss;
import defpackage.q2s;
import defpackage.rss;
import defpackage.xss;

/* JADX INFO: loaded from: classes4.dex */
public class OfflineMapActivity extends AMapPermissionActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q2s f6466b;
    private pss c;
    private pss[] d = new pss[32];
    private int e = -1;
    private rss f;

    private void a(pss pssVar) {
        try {
            q2s q2sVar = this.f6466b;
            if (q2sVar != null) {
                q2sVar.h();
                this.f6466b = null;
            }
            q2s q2sVarC = c(pssVar);
            this.f6466b = q2sVarC;
            if (q2sVarC != null) {
                this.c = pssVar;
                q2sVarC.d(this);
                this.f6466b.b();
                this.f6466b.e();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b(pss pssVar) {
        try {
            f6465a++;
            a(pssVar);
            int i = (this.e + 1) % 32;
            this.e = i;
            this.d[i] = pssVar;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private q2s c(pss pssVar) {
        try {
            if (pssVar.f30721a != 1) {
                return null;
            }
            if (this.f == null) {
                this.f = new rss();
            }
            return this.f;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void closeScr() {
        try {
            if (a((Bundle) null)) {
                return;
            }
            q2s q2sVar = this.f6466b;
            if (q2sVar != null) {
                q2sVar.h();
            }
            finish();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            q2s q2sVar = this.f6466b;
            if (q2sVar != null) {
                q2sVar.c(view);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            getWindow().setSoftInputMode(32);
            getWindow().setFormat(-3);
            requestWindowFeature(1);
            xss.f(getApplicationContext());
            this.e = -1;
            f6465a = 0;
            b(new pss());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            super.onDestroy();
            q2s q2sVar = this.f6466b;
            if (q2sVar != null) {
                q2sVar.h();
                this.f6466b = null;
            }
            this.c = null;
            this.d = null;
            rss rssVar = this.f;
            if (rssVar != null) {
                rssVar.h();
                this.f = null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            try {
                q2s q2sVar = this.f6466b;
                if (q2sVar != null && !q2sVar.f()) {
                    return true;
                }
                if (a((Bundle) null)) {
                    return false;
                }
                if (keyEvent == null) {
                    if (f6465a == 1) {
                        finish();
                    }
                    return false;
                }
                this.e = -1;
                f6465a = 0;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        try {
            super.onPause();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.offlineservice.AMapPermissionActivity, android.app.Activity
    public void onResume() {
        try {
            super.onResume();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        try {
            super.onStart();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        try {
            super.onStop();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void showScr() {
        try {
            setContentView(this.f6466b.g());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void closeScr(Bundle bundle) {
        try {
            if (a(bundle)) {
                return;
            }
            q2s q2sVar = this.f6466b;
            if (q2sVar != null) {
                q2sVar.h();
            }
            finish();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean a(Bundle bundle) {
        try {
            int i = f6465a;
            if ((i != 1 || this.f6466b == null) && i > 1) {
                f6465a = i - 1;
                int i2 = (this.e + 31) % 32;
                this.e = i2;
                pss pssVar = this.d[i2];
                pssVar.f30722b = bundle;
                a(pssVar);
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }
}
