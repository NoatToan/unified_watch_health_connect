package com.huawei.hms.iapfull;

import android.app.ActionBar;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

/* JADX INFO: loaded from: classes10.dex */
public class n0 extends FragmentActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ProgressDialog f13705a;

    static void a(n0 n0Var, String str, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        ProgressDialog progressDialog;
        if (n0Var.isFinishing()) {
            return;
        }
        ProgressDialog progressDialog2 = n0Var.f13705a;
        if (progressDialog2 != null && progressDialog2.isShowing() && (progressDialog = n0Var.f13705a) != null) {
            progressDialog.setMessage(str);
            n0Var.f13705a.setCanceledOnTouchOutside(false);
            n0Var.f13705a.setCancelable(z);
        } else {
            ProgressDialog progressDialog3 = new ProgressDialog(n0Var);
            n0Var.f13705a = progressDialog3;
            progressDialog3.setMessage(str);
            n0Var.f13705a.setCanceledOnTouchOutside(false);
            n0Var.f13705a.setCancelable(z);
            n0Var.f13705a.show();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(9216);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        if (a1.a(super.getIntent())) {
            finish();
        }
    }

    public void a(Fragment fragment, int i, boolean z) {
        if (isFinishing()) {
            Log.w("iap_full", "BaseActivity showFragment is finish");
            return;
        }
        try {
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            y0.b("BaseActivity", "showFragment，isAdded： " + fragment.isAdded());
            if (fragment.isAdded()) {
                fragmentTransactionBeginTransaction.show(fragment);
            } else {
                fragmentTransactionBeginTransaction.add(i, fragment);
            }
            if (z) {
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
            } else {
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            }
        } catch (IllegalStateException unused) {
            Log.w("iap_full", "BaseActivity showFragment: IllegalStateException");
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ProgressDialog progressDialog = this.f13705a;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f13705a = null;
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13706a;

        @Override // java.lang.Runnable
        public void run() {
            n0.a(n0.this, this.f13706a, false, null);
        }

        a(String str) {
            this.f13706a = str;
        }
    }

    public void a(String str) {
        runOnUiThread(new a(str));
    }

    public void a() {
        ProgressDialog progressDialog;
        if (isFinishing() || (progressDialog = this.f13705a) == null) {
            return;
        }
        progressDialog.dismiss();
        this.f13705a = null;
    }
}
