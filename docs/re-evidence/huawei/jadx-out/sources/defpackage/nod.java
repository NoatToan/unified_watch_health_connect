package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.widget.ArrayAdapter;
import com.huawei.android.hms.hwid.R;
import com.huawei.hwidauth.ui.d;

/* JADX INFO: loaded from: classes3.dex */
public class nod extends AlertDialog.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f43345a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AlertDialog f43346c;
    private Uri d;
    private d e;

    public nod(Activity activity, Uri uri, final d dVar) {
        super(activity, npi.d(activity));
        this.f43345a = activity;
        this.d = uri;
        this.e = dVar;
        setAdapter(new ArrayAdapter(this.f43345a, R.layout.item_hwid_auth_dialog_list, R.id.dialog_item_text, new CharSequence[]{activity.getResources().getString(R.string.CloudSetting_take_picture), activity.getResources().getString(R.string.hwid_string_choose_from_gallery), activity.getResources().getString(android.R.string.cancel)}), new DialogInterface.OnClickListener() { // from class: nod.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    nox.b("WebViewActivityAddPicDialog", "startCamare", true);
                    dVar.b();
                } else if (i == 1) {
                    nox.b("WebViewActivityAddPicDialog", "startGallery", true);
                    dVar.c();
                } else {
                    if (i != 2) {
                        return;
                    }
                    nox.b("WebViewActivityAddPicDialog", "CANCEL", true);
                    nod.this.e.a();
                    nod.this.a();
                }
            }
        });
    }

    @Override // android.app.AlertDialog.Builder
    public AlertDialog show() {
        AlertDialog alertDialogShow = super.show();
        this.f43346c = alertDialogShow;
        return alertDialogShow;
    }

    public void a() {
        nox.a("WebViewActivityAddPicDialog", "cancelDialog mDialog = " + this.f43346c, false);
        AlertDialog alertDialog = this.f43346c;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        nox.a("WebViewActivityAddPicDialog", "cancelDialog enter ", true);
        this.f43346c.cancel();
    }
}
