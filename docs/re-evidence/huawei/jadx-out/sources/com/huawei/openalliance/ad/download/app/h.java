package com.huawei.openalliance.ad.download.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.PermissionEntity;
import com.huawei.openalliance.ad.pp;
import com.huawei.openalliance.ad.utils.ac;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dq;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class h {

    public interface a {
        void a();

        void a(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, AppInfo appInfo, final a aVar) {
        AlertDialog.Builder builderA = ac.a(context);
        builderA.setTitle("");
        if (aVar != null) {
            builderA.setPositiveButton(R.string.hiad_dialog_accept, new DialogInterface.OnClickListener() { // from class: com.huawei.openalliance.ad.download.app.h.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    aVar.a();
                }
            });
            builderA.setNeutralButton(R.string.hiad_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.huawei.openalliance.ad.download.app.h.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    aVar.a(1006);
                }
            });
        } else {
            builderA.setNeutralButton(R.string.hiad_dialog_close, (DialogInterface.OnClickListener) null);
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.hiad_permission_dialog_cotent, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.hiad_permissions_dialog_content_title_tv)).setText(context.getResources().getString(R.string.hiad_permission_dialog_title, appInfo.getAppName()));
        ((ListView) viewInflate.findViewById(R.id.hiad_permissions_dialog_content_lv)).setAdapter((ListAdapter) new g(context, appInfo.getPermissions()));
        builderA.setView(viewInflate);
        AlertDialog alertDialogCreate = builderA.create();
        hw.a("AppPermissionsDialog", "show, time:%d", Long.valueOf(System.currentTimeMillis()));
        a(context, alertDialogCreate);
    }

    private static void c(final Context context, final AppInfo appInfo, final a aVar) {
        AlertDialog.Builder builderA = ac.a(context);
        builderA.setView(LayoutInflater.from(context).inflate(R.layout.hiad_loading_dialog_content, (ViewGroup) null));
        final AlertDialog alertDialogCreate = builderA.create();
        a(context, alertDialogCreate);
        new pp(context, new pp.a() { // from class: com.huawei.openalliance.ad.download.app.h.1
            @Override // com.huawei.openalliance.ad.pp.a
            public void a(final List<PermissionEntity> list) {
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.download.app.h.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        alertDialogCreate.dismiss();
                        if (!bm.a(list)) {
                            h.d(context, appInfo, aVar);
                            return;
                        }
                        Toast.makeText(context, R.string.hiad_net_error, 0).show();
                        if (aVar != null) {
                            aVar.a(1005);
                        }
                    }
                });
            }
        }).a(appInfo);
    }

    public static void a(Context context, AppInfo appInfo, a aVar) {
        if (appInfo == null) {
            hw.c("AppPermissionsDialog", "appInfo is null.");
            return;
        }
        hw.b("AppPermissionsDialog", "show, context:" + context);
        if (!bm.a(appInfo.getPermissions())) {
            d(context, appInfo, aVar);
        } else {
            hw.b("AppPermissionsDialog", "permissions is empty");
            c(context, appInfo, aVar);
        }
    }

    public static void a(Context context, AppInfo appInfo) {
        a(context, appInfo, null);
    }

    private static void a(Context context, AlertDialog alertDialog) {
        Window window;
        if (!(context instanceof Activity) && (window = alertDialog.getWindow()) != null) {
            window.setType(2038);
        }
        alertDialog.show();
    }
}
