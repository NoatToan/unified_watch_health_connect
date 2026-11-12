package com.huawei.appgallery.marketinstallerservice.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.huawei.appgallery.marketinstallerservice.R;

/* JADX INFO: loaded from: classes23.dex */
public class c {

    public interface a {
        void a();

        void b();
    }

    static class d implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5250b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f5251c;
        private int e;

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            a aVar = this.f5251c;
            if (aVar == null || !this.f5250b) {
                return;
            }
            aVar.b();
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            a aVar;
            if (i != -1 || (aVar = this.f5251c) == null) {
                return;
            }
            int i2 = this.e;
            if (i2 == -3 || i2 == -2) {
                aVar.a();
                this.f5250b = false;
            }
        }

        d(a aVar, int i) {
            this.f5251c = aVar;
            this.e = i;
        }
    }

    public static AlertDialog d(Context context, int i, a aVar, String str) {
        int i2;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        d dVar = new d(aVar, i);
        if (str == null) {
            str = "";
        }
        if (i != -4) {
            if (i != -3) {
                if (i == -2) {
                    builder.setMessage(context.getResources().getString(R.string.market_install_market_failed, str));
                    i2 = R.string.market_install_retry_download;
                }
                return builder.create();
            }
            builder.setMessage(context.getResources().getString(R.string.market_install_download_failed));
            i2 = R.string.market_install_retry;
            builder.setPositiveButton(i2, dVar);
            builder.setNegativeButton(R.string.market_install_cancel, (DialogInterface.OnClickListener) null);
        } else {
            builder.setMessage(context.getResources().getString(R.string.market_install_can_not_get_market_info, str));
            builder.setPositiveButton(R.string.market_install_alert_dialog_ok, (DialogInterface.OnClickListener) null);
        }
        builder.setOnDismissListener(dVar);
        return builder.create();
    }
}
