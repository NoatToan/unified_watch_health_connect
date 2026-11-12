package com.mibi.sdk.channel.wxpay;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.MarketUtils;
import com.mibi.sdk.widget.AlertDialog;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    public class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f10122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f10123b;

        public a(Activity activity, c cVar) {
            this.f10122a = activity;
            this.f10123b = cVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            MibiLog.d("WxUtils", "onConfirm");
            MarketUtils.openDetailInMarket(this.f10122a.getApplicationContext(), "com.tencent.mm");
            c cVar = this.f10123b;
            if (cVar != null) {
                cVar.b();
            }
            dialogInterface.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f10124a;

        public b(c cVar) {
            this.f10124a = cVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            MibiLog.d("WxUtils", "onCancel");
            c cVar = this.f10124a;
            if (cVar != null) {
                cVar.a();
            }
            dialogInterface.dismiss();
        }
    }

    public interface c {
        void a();

        void b();
    }

    public static void a(Activity activity, c cVar) {
        MibiLog.d("WxUtils", "showInstallPromptDialog");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setMessage(activity.getResources().getString(com.mibi.sdk.channel.wxpay.a.c)).setClickable(true).setNegativeButton(R.string.cancel, new b(cVar)).setPositiveButton(com.mibi.sdk.channel.wxpay.a.f10120a, new a(activity, cVar)).create();
        alertDialogCreate.setCancelable(false);
        alertDialogCreate.show();
    }

    public static boolean b(Context context) {
        return MarketUtils.isAppInstalled(context, "com.tencent.mm");
    }
}
