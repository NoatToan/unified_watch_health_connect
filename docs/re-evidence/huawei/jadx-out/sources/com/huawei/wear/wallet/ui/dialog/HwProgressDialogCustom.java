package com.huawei.wear.wallet.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.huawei.wear.R;
import defpackage.yfh;
import defpackage.yfj;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes46.dex */
public class HwProgressDialogCustom extends Dialog implements HwProgressDialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30720c;
    private Context d;
    private LinearLayout e;
    private int f;
    private int g;
    private int h;
    private Drawable i;
    private LayoutInflater j;
    private TextView k;
    private String l;
    private CharSequence m;
    private Drawable n;
    private ProgressBar o;
    private int p;
    private NumberFormat q;
    private int r;
    private int s;
    private LinearLayout t;
    private Handler x;

    public HwProgressDialogCustom(Context context) {
        super(context);
        this.f30718a = false;
        this.f30720c = false;
        this.s = 0;
        this.d = context;
        d();
    }

    public HwProgressDialogCustom(Context context, int i) {
        super(context, i);
        this.f30718a = false;
        this.f30720c = false;
        this.s = 0;
        this.d = context;
        d();
    }

    private void d() {
        Log.i("HwProgressDialog", "init: ");
        this.j = (LayoutInflater) this.d.getSystemService("layout_inflater");
        requestWindowFeature(1);
        a();
        c();
    }

    private void a() {
        try {
            setContentView(R.layout.oversea_custom_dialog_layout);
            this.t = (LinearLayout) findViewById(R.id.dialog_layout);
            this.e = (LinearLayout) findViewById(R.id.content);
        } catch (RuntimeException unused) {
            Log.e("HwProgressDialog", "initView NumberFormatException");
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i("HwProgressDialog", "onCreate ");
        b();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f30719b = true;
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        this.f30719b = false;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        yfj.e(this, getContext().getResources().getDimensionPixelSize(R.dimen.commen_margin_16dp), 0.98d);
    }

    private void b() {
        View viewInflate = this.j.inflate(R.layout.oversea_custom_progress_dlg, (ViewGroup) null);
        this.o = (ProgressBar) viewInflate.findViewById(R.id.progress);
        this.k = (TextView) viewInflate.findViewById(R.id.message);
        setView(viewInflate);
        yfh.c(this, this.h, this.r, this.p, this.f);
        yfh.c(this, this.g, this.n, this.i, this.m);
        yfh.b(this.s, this.x);
    }

    private void c() {
        this.l = "%1d/%2d";
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        this.q = percentInstance;
        percentInstance.setMaximumFractionDigits(0);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        setTitle(this.d.getResources().getString(i));
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void setMessage(CharSequence charSequence) {
        if (this.o != null) {
            yfh.e(this.k, charSequence);
        } else {
            this.m = charSequence;
        }
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void setProgressStyle(int i) {
        Log.i("HwProgressDialog", "setProgressStyle ");
        this.s = i;
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void setProgressNumberFormat(String str) {
        Log.i("HwProgressDialog", "setProgressNumberFormat ");
        this.l = str;
        yfh.b(this.s, this.x);
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void setProgressPercentFormat(NumberFormat numberFormat) {
        this.q = numberFormat;
        yfh.b(this.s, this.x);
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public int getProgress() {
        return yfh.d(this.o, this.r);
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void setProgress(int i) {
        if (this.f30719b) {
            Log.i("HwProgressDialog", "setProgress ");
            this.o.setProgress(i);
            yfh.b(this.s, this.x);
            return;
        }
        this.r = i;
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public int getSecondaryProgress() {
        return yfh.a(this.o, this.p);
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void setSecondaryProgress(int i) {
        ProgressBar progressBar = this.o;
        if (progressBar != null) {
            progressBar.setSecondaryProgress(i);
            yfh.b(this.s, this.x);
        } else {
            this.p = i;
        }
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public int getMax() {
        return yfh.b(this.o, this.h);
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void setMax(int i) {
        ProgressBar progressBar = this.o;
        if (progressBar != null) {
            progressBar.setMax(i);
            yfh.b(this.s, this.x);
        } else {
            this.h = i;
        }
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void incrementProgressBy(int i) {
        ProgressBar progressBar = this.o;
        if (progressBar != null) {
            progressBar.incrementProgressBy(i);
            yfh.b(this.s, this.x);
        } else {
            this.f += i;
        }
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void incrementSecondaryProgressBy(int i) {
        ProgressBar progressBar = this.o;
        if (progressBar != null) {
            progressBar.incrementSecondaryProgressBy(i);
            yfh.b(this.s, this.x);
        } else {
            this.g += i;
        }
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void setProgressDrawable(Drawable drawable) {
        ProgressBar progressBar = this.o;
        if (progressBar != null) {
            progressBar.setProgressDrawable(drawable);
        } else {
            this.n = drawable;
        }
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void setIndeterminateDrawable(Drawable drawable) {
        ProgressBar progressBar = this.o;
        if (progressBar != null) {
            progressBar.setIndeterminateDrawable(drawable);
        } else {
            this.i = drawable;
        }
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void setView(View view) {
        yfh.e(this.t, this.e, view);
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception unused) {
            Log.e("HwProgressDialog", "dismiss failed Exception");
        }
    }

    @Override // android.app.Dialog, com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void show() {
        try {
            super.show();
        } catch (Exception unused) {
            Log.e("HwProgressDialog", "showDialog failed Exception");
        }
    }

    @Override // android.app.Dialog, com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public Window getWindow() {
        return super.getWindow();
    }

    @Override // android.app.Dialog, android.view.Window.Callback, com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public boolean onSearchRequested() {
        if (this.f30718a) {
            return this.f30720c;
        }
        return super.onSearchRequested();
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void cancel() {
        try {
            super.cancel();
        } catch (Exception unused) {
            Log.e("HwProgressDialog", "cancel failed Exception");
        }
    }

    @Override // com.huawei.wear.wallet.ui.dialog.HwProgressDialogInterface
    public void setSearchRequestedReturn(boolean z) {
        this.f30718a = true;
        this.f30720c = z;
    }
}
