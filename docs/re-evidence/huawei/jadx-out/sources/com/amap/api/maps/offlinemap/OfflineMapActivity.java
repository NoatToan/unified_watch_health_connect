package com.amap.api.maps.offlinemap;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.amap.api.col.p0003sl.fd;
import com.amap.api.col.p0003sl.fe;
import com.amap.api.col.p0003sl.fg;
import com.amap.api.offlineservice.AMapPermissionActivity;
import com.amap.api.offlineservice.a;

/* JADX INFO: loaded from: classes21.dex */
public class OfflineMapActivity extends AMapPermissionActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f3449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f3450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fd f3451c;
    private fd[] d = new fd[32];
    private int e = -1;
    private fe f;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            getWindow().setSoftInputMode(32);
            getWindow().setFormat(-3);
            requestWindowFeature(1);
            fg.a(getApplicationContext());
            this.e = -1;
            f3449a = 0;
            b(new fd());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void showScr() {
        try {
            setContentView(this.f3450b.d());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(fd fdVar) {
        try {
            a aVar = this.f3450b;
            if (aVar != null) {
                aVar.e();
                this.f3450b = null;
            }
            a aVarC = c(fdVar);
            this.f3450b = aVarC;
            if (aVarC != null) {
                this.f3451c = fdVar;
                aVarC.a(this);
                this.f3450b.a();
                this.f3450b.b();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b(fd fdVar) {
        try {
            f3449a++;
            a(fdVar);
            int i = (this.e + 1) % 32;
            this.e = i;
            this.d[i] = fdVar;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private a c(fd fdVar) {
        try {
            if (fdVar.f2516a != 1) {
                return null;
            }
            if (this.f == null) {
                this.f = new fe();
            }
            return this.f;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        try {
            super.onStart();
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
    protected void onPause() {
        try {
            super.onPause();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        try {
            super.onStop();
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

    public void closeScr() {
        try {
            if (a((Bundle) null)) {
                return;
            }
            a aVar = this.f3450b;
            if (aVar != null) {
                aVar.e();
            }
            finish();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void closeScr(Bundle bundle) {
        try {
            if (a(bundle)) {
                return;
            }
            a aVar = this.f3450b;
            if (aVar != null) {
                aVar.e();
            }
            finish();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean a(Bundle bundle) {
        try {
            int i = f3449a;
            if ((i != 1 || this.f3450b == null) && i > 1) {
                f3449a = i - 1;
                int i2 = (this.e + 31) % 32;
                this.e = i2;
                fd fdVar = this.d[i2];
                fdVar.f2517b = bundle;
                a(fdVar);
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        try {
            super.onDestroy();
            a aVar = this.f3450b;
            if (aVar != null) {
                aVar.e();
                this.f3450b = null;
            }
            this.f3451c = null;
            this.d = null;
            fe feVar = this.f;
            if (feVar != null) {
                feVar.e();
                this.f = null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            a aVar = this.f3450b;
            if (aVar != null) {
                aVar.a(view);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            try {
                a aVar = this.f3450b;
                if (aVar != null && !aVar.c()) {
                    return true;
                }
                if (a((Bundle) null)) {
                    return false;
                }
                if (keyEvent == null) {
                    if (f3449a == 1) {
                        finish();
                    }
                    return false;
                }
                this.e = -1;
                f3449a = 0;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
