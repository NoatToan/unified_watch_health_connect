package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huawei.android.hicloud.sync.R;
import com.huawei.android.hicloud.sync.update.ui.dialog.UpHisyncDialogCallback;

/* JADX INFO: loaded from: classes23.dex */
public class bcz extends AlertDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f1029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f1030b;
    UpHisyncDialogCallback d;

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            UpHisyncDialogCallback upHisyncDialogCallback = bcz.this.d;
            if (upHisyncDialogCallback != null) {
                if (i == -1) {
                    upHisyncDialogCallback.onClickInstall();
                } else if (i == -2) {
                    upHisyncDialogCallback.onClickCancel();
                }
            }
        }
    }

    public bcz(Context context, UpHisyncDialogCallback upHisyncDialogCallback, long j) {
        super(context);
        this.f1030b = context;
        this.d = upHisyncDialogCallback;
        this.f1029a = j;
        c();
    }

    private void c() {
        View viewInflate = LayoutInflater.from(this.f1030b).inflate(R.layout.up_hisync_dialog, (ViewGroup) null);
        setView(viewInflate);
        setCancelable(false);
        TextView textView = (TextView) bdb.d(viewInflate, R.id.up_hisync_dialog_content_tip);
        String strC = bcy.c(this.f1030b, this.f1029a);
        Context context = this.f1030b;
        textView.setText(context.getString(R.string.up_hisync_dialog_content_tip, context.getString(R.string.hisync_sdk_cloud_app_name), strC));
        setButton(-2, this.f1030b.getString(R.string.up_hisync_dialog_btn_cancel), new b());
        setButton(-1, this.f1030b.getString(R.string.up_hisync_dialog_btn_install), new b());
    }
}
