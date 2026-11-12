package com.huawei.openalliance.ad.download.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;

/* JADX INFO: loaded from: classes12.dex */
public class a extends AlertDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0200a f18482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppInfo f18484c;
    private ContentRecord d;
    private Context e;
    private com.huawei.openalliance.ad.analysis.i f;

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.download.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0200a {
        void a();

        void b();
    }

    @Override // android.app.Dialog
    public void show() {
        hw.b("AppAllowInstallDialog", "show appAllowInstallDialog");
        if (!c()) {
            hw.b("AppAllowInstallDialog", "don't remind again!");
            InterfaceC0200a interfaceC0200a = this.f18482a;
            if (interfaceC0200a == null) {
                return;
            } else {
                interfaceC0200a.a();
            }
        } else {
            if (this.d == null || this.f18484c == null || b().length() <= 0) {
                return;
            }
            if (this.f18484c.E() != 0) {
                try {
                    super.show();
                    hw.b("AppAllowInstallDialog", "show dialog popUp!");
                    this.f.e(this.d, "150");
                    return;
                } catch (Exception unused) {
                    d();
                    hw.c("AppAllowInstallDialog", "error occurs while showing dialog");
                    return;
                }
            }
            hw.b("AppAllowInstallDialog", "show toast popUp!");
            Toast.makeText(this.e.getApplicationContext(), b(), 0).show();
            this.f.e(this.d, "149");
        }
        d();
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (!(this.e instanceof Activity)) {
                window.setType(2038);
            }
            window.setBackgroundDrawableResource(R.color.hiad_0_percent_black);
            if (ab.o(this.e)) {
                window.setGravity(80);
            }
            setCancelable(false);
            setContentView(R.layout.hiad_app_allow_install_dialog_cotent);
            a();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        hw.b("AppAllowInstallDialog", "dialog is dismissed");
        super.dismiss();
        d();
    }

    private void d() {
        InterfaceC0200a interfaceC0200a = this.f18482a;
        if (interfaceC0200a != null) {
            interfaceC0200a.b();
        }
    }

    private boolean c() {
        return fp.b(this.e).cw();
    }

    private String b() {
        Resources resources;
        int i;
        String string;
        Resources resources2;
        int i2;
        String string2;
        Resources resources3;
        int i3;
        String string3;
        ContentRecord contentRecord = this.d;
        if (contentRecord == null) {
            hw.b("AppAllowInstallDialog", "contendRecord is null");
            return "";
        }
        int iC = pa.C(contentRecord.X());
        if (dg.b(this.f18484c.F())) {
            if (this.f18484c.E() > 0) {
                resources = this.e.getResources();
                i = R.string.hiad_app_allow_permi;
            } else {
                resources = this.e.getResources();
                i = R.string.hiad_app_allow_permi_t;
            }
            string = resources.getString(i);
        } else {
            string = this.f18484c.F();
        }
        if (dg.b(this.f18484c.G())) {
            if (this.f18484c.E() > 0) {
                resources2 = this.e.getResources();
                i2 = R.string.hiad_app_allow_pure_mode;
            } else {
                resources2 = this.e.getResources();
                i2 = R.string.hiad_app_allow_pure_mode_t;
            }
            string2 = resources2.getString(i2);
        } else {
            string2 = this.f18484c.G();
        }
        if (dg.b(this.f18484c.H())) {
            if (this.f18484c.E() > 0) {
                resources3 = this.e.getResources();
                i3 = R.string.hiad_app_allow_install_pure;
            } else {
                resources3 = this.e.getResources();
                i3 = R.string.hiad_app_allow_install_pure_t;
            }
            string3 = resources3.getString(i3);
        } else {
            string3 = this.f18484c.H();
        }
        int iA = a(iC, dk.w(this.e), dk.v(this.e));
        if (iA == 1) {
            return string2;
        }
        if (iA != 2) {
            return iA != 3 ? "" : string3;
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        fp.b(this.e).g(!z);
    }

    private void a() {
        ((TextView) findViewById(R.id.hiad_allow_install_title)).setText(getContext().getResources().getString(R.string.hiad_app_allow_continue_install));
        ((TextView) findViewById(R.id.hiad_allow_install_close)).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.download.app.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.this.f.e(a.this.d, "151");
                a aVar = a.this;
                aVar.a(aVar.f18483b);
                a.this.dismiss();
            }
        });
        ((TextView) findViewById(R.id.hiad_allow_install_message)).setText(b());
        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.hiad_allow_install_remind_again_parent);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.hiad_allow_install_remind_again);
        checkBox.setChecked(this.f18483b);
        checkBox.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.download.app.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (a.this.f18483b) {
                    radioGroup.clearCheck();
                } else {
                    checkBox.setChecked(true);
                }
                a aVar = a.this;
                aVar.f18483b = true ^ aVar.f18483b;
            }
        });
        TextView textView = (TextView) findViewById(R.id.hiad_allow_install_accept);
        textView.setText(!dg.b(this.f18484c.I()) ? this.f18484c.I() : this.e.getResources().getString(R.string.hiad_app_allow_continue_btn));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.download.app.a.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (a.this.f18482a != null) {
                    a.this.f.e(a.this.d, "152");
                    a.this.f18482a.a();
                }
                a aVar = a.this;
                aVar.a(aVar.f18483b);
                a.this.dismiss();
            }
        });
    }

    public static int a(int i, int i2, boolean z) {
        if (i > 3) {
            i -= 3;
        }
        int i3 = i2 != 1 ? 0 : 1;
        int i4 = z ? 0 : 2;
        hw.a("AppAllowInstallDialog", "pure mode is %s, install permission is %s", Integer.valueOf(i2), Boolean.valueOf(z));
        return i & (i3 | i4);
    }

    public a(Context context, ContentRecord contentRecord, InterfaceC0200a interfaceC0200a) {
        super(context);
        this.f18483b = true;
        this.e = context;
        this.d = contentRecord;
        this.f18482a = interfaceC0200a;
        if (contentRecord != null) {
            this.f18484c = contentRecord.ag();
        }
        this.f = new com.huawei.openalliance.ad.analysis.i(context);
    }
}
