package com.huawei.openalliance.ad.utils;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ac {

    public interface a {
        void a();

        void a(boolean z);
    }

    private static void a(Dialog dialog) {
        try {
            dialog.show();
        } catch (WindowManager.BadTokenException unused) {
            hw.c("DialogUtil", "showDialog BadTokenException");
        } catch (Throwable th) {
            hw.c("DialogUtil", "showDialog exception %s", th.getClass().getSimpleName());
        }
    }

    public static Dialog a(Context context, String str, String str2, String str3, String str4, a aVar) {
        AlertDialog.Builder builderA = a(context);
        if (str2 != null) {
            builderA.setMessage(str2);
        }
        Dialog dialogA = a(context, builderA, str, str3, str4, aVar);
        a(dialogA);
        return dialogA;
    }

    public static Dialog a(Context context, ContentRecord contentRecord, com.huawei.openalliance.ad.download.app.a.InterfaceC0200a interfaceC0200a) {
        com.huawei.openalliance.ad.download.app.a aVar = new com.huawei.openalliance.ad.download.app.a(context, contentRecord, interfaceC0200a);
        aVar.show();
        return aVar;
    }

    private static Dialog a(Context context, AlertDialog.Builder builder, String str, String str2, String str3, final a aVar) {
        Window window;
        if (str != null) {
            builder.setTitle(str);
        }
        builder.setPositiveButton(str2, new DialogInterface.OnClickListener() { // from class: com.huawei.openalliance.ad.utils.ac.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        });
        builder.setNegativeButton(str3, new DialogInterface.OnClickListener() { // from class: com.huawei.openalliance.ad.utils.ac.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(true);
                }
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.huawei.openalliance.ad.utils.ac.3
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(false);
                }
            }
        });
        if (!(context instanceof Activity) && (window = alertDialogCreate.getWindow()) != null) {
            window.setType(2038);
        }
        return alertDialogCreate;
    }

    public static AlertDialog.Builder a(Context context) {
        if (com.huawei.openalliance.ad.cc.c(context)) {
            return new AlertDialog.Builder(context);
        }
        return as.l(context) ? new AlertDialog.Builder(context, R.style.Theme.DeviceDefault.Dialog.Alert) : new AlertDialog.Builder(context, R.style.Theme.DeviceDefault.Light.Dialog.Alert);
    }
}
