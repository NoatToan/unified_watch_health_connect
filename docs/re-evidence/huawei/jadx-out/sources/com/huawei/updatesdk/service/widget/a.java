package com.huawei.updatesdk.service.widget;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes20.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.huawei.updatesdk.service.widget.b f30018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f30019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AlertDialog f30020c;
    private final AlertDialog.Builder d;
    private DialogInterface.OnShowListener e;
    private DialogInterface.OnDismissListener f;

    public interface e {
        void a();
    }

    public void c() {
        AlertDialog.Builder builder = this.d;
        if (builder == null) {
            return;
        }
        builder.setNegativeButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public boolean b() {
        AlertDialog alertDialog = this.f30020c;
        return alertDialog != null && alertDialog.isShowing();
    }

    public void a(boolean z) {
        AlertDialog alertDialog = this.f30020c;
        if (alertDialog != null) {
            alertDialog.setCancelable(z);
        }
    }

    public void a(com.huawei.updatesdk.service.widget.b bVar) {
        this.f30018a = bVar;
    }

    public void a(e eVar) {
        Context context = this.f30019b;
        if (context != null && !((Activity) context).isFinishing()) {
            if (b()) {
                return;
            }
            b(eVar);
        } else {
            com.huawei.updatesdk.sdk.foundation.a.b("BaseAlertDialog", "context == null or activity isFinishing");
            if (eVar != null) {
                eVar.a();
            }
        }
    }

    public void a(View view) {
        ImageView imageView;
        if (this.d != null) {
            if ((com.huawei.updatesdk.service.util.a.d().b() >= 17 || com.huawei.updatesdk.service.util.a.d().e() > 0) && (imageView = (ImageView) view.findViewById(com.huawei.updatesdk.service.util.c.a(view.getContext(), "divider"))) != null) {
                imageView.setVisibility(8);
            }
            this.d.setMessage((CharSequence) null);
            this.d.setView(view);
        }
    }

    public void a(DialogInterface.OnShowListener onShowListener) {
        this.e = onShowListener;
    }

    public void a(DialogInterface.OnKeyListener onKeyListener) {
        AlertDialog alertDialog = this.f30020c;
        if (alertDialog != null) {
            alertDialog.setOnKeyListener(onKeyListener);
        }
    }

    public void a(DialogInterface.OnDismissListener onDismissListener) {
        this.f = onDismissListener;
    }

    public void a(int i, String str) {
        Button button;
        AlertDialog alertDialog = this.f30020c;
        if (alertDialog == null || (button = alertDialog.getButton(i)) == null) {
            return;
        }
        button.setText(str);
        button.setAllCaps(true);
    }

    public void a() {
        try {
            AlertDialog alertDialog = this.f30020c;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f30020c = null;
            }
        } catch (IllegalArgumentException unused) {
            com.huawei.updatesdk.sdk.foundation.a.b("BaseAlertDialog", "dialog dismiss IllegalArgumentException");
        }
    }

    private void b(e eVar) {
        try {
            this.f30020c = this.d.create();
            com.huawei.updatesdk.sdk.foundation.utils.device.c.c().a(this.f30020c.getWindow());
            this.f30020c.setCanceledOnTouchOutside(false);
            this.f30020c.setOnShowListener(new DialogInterfaceOnShowListenerC0296a());
            this.f30020c.setOnDismissListener(new b());
            this.f30020c.show();
            this.f30020c.getButton(-1).requestFocus();
        } catch (Exception e2) {
            if (eVar != null) {
                eVar.a();
            }
            com.huawei.updatesdk.sdk.foundation.a.a("BaseAlertDialog", "show dlg error, e: " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DialogInterface dialogInterface) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getButton(-1).setOnClickListener(new c());
        Button button = alertDialog.getButton(-2);
        if (button != null) {
            button.setOnClickListener(new d());
        }
    }

    /* JADX INFO: renamed from: com.huawei.updatesdk.service.widget.a$a, reason: collision with other inner class name */
    class DialogInterfaceOnShowListenerC0296a implements DialogInterface.OnShowListener {
        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            a.this.a(dialogInterface);
            if (a.this.e != null) {
                a.this.e.onShow(dialogInterface);
            }
        }

        DialogInterfaceOnShowListenerC0296a() {
        }
    }

    class b implements DialogInterface.OnDismissListener {
        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (a.this.f != null) {
                a.this.f.onDismiss(dialogInterface);
            }
        }

        b() {
        }
    }

    class c implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f30018a != null) {
                a.this.f30018a.a();
            }
        }

        c() {
        }
    }

    class d implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f30018a != null) {
                a.this.f30018a.b();
            }
        }

        d() {
        }
    }

    public static a a(Context context, String str, CharSequence charSequence) {
        return new a(context, str, charSequence);
    }

    protected a(Context context, String str, CharSequence charSequence) {
        this.f30019b = context;
        AlertDialog.Builder builder = com.huawei.updatesdk.sdk.foundation.utils.device.c.n() ? new AlertDialog.Builder(context) : ((context.getResources().getConfiguration().uiMode & 48) != 32 || Build.VERSION.SDK_INT < 29) ? new AlertDialog.Builder(context, R.style.Theme.DeviceDefault.Light.Dialog.Alert) : new AlertDialog.Builder(context, R.style.Theme.DeviceDefault.Dialog.Alert);
        this.d = builder;
        builder.setTitle(str);
        builder.setPositiveButton(com.huawei.updatesdk.service.util.c.c(context, "upsdk_third_app_dl_sure_cancel_download"), (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(com.huawei.updatesdk.service.util.c.c(context, "upsdk_cancel"), (DialogInterface.OnClickListener) null);
        builder.setMessage(charSequence);
    }
}
