package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import health.compact.a.LogAnonymous;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes10.dex */
public class jcc {
    private static final Object d = new Object();
    private static jcc e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CommonDialog21 f38368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f38369c;

    private jcc(Context context) {
        if (context == null) {
            throw new RuntimeException("OfflineDialogController invalid params in constructor");
        }
        this.f38369c = context;
        new CommonDialog21(this.f38369c, R.style.app_update_dialogActivity);
        this.f38368b = CommonDialog21.b(this.f38369c);
    }

    public static jcc e(Context context) {
        synchronized (d) {
            if (e == null) {
                e = new jcc(context);
            }
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2) {
        LogUtil.a("Track_OfflineDialogController", "sendBroadcast() action:" + str2);
        Intent intent = new Intent(str2);
        intent.putExtra("TAG_ONE_CITY_STRING_AS", str);
        iyb.e(this.f38369c.getApplicationContext(), intent);
    }

    private void d(final String str) {
        String string;
        LogUtil.a("Track_OfflineDialogController", "showNoWifiWaitingDialog()");
        if (Utils.o()) {
            string = this.f38369c.getString(R.string.IDS_motiontrack_offlinemap_connectting_no_wifi);
        } else {
            string = this.f38369c.getString(R.string.IDS_motiontrack_offlinemap_connectting_no_wlan);
        }
        new CustomAlertDialog.Builder(this.f38369c).d(R.string.IDS_motiontrack_show_remind).e(string).a(R.string.IDS_motiontrack_show_cancel, new DialogInterface.OnClickListener(this) { // from class: jcc.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }).d(R.string.IDS_motiontrack_offlinemap_connectting_sure, new DialogInterface.OnClickListener() { // from class: jcc.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                jcc.this.a();
                LogUtil.a("Track_OfflineDialogController", "showNoWifiWaitingDialog() onDialogButtonClick Yes");
                jcc.this.d(str, "ACITON_ACTIVITY_WAIT_CITY_AS");
            }
        }).b().show();
    }

    private void c(final String str, final boolean z) {
        String string;
        LogUtil.a("Track_OfflineDialogController", "showNoWifiDialog()");
        if (Utils.o()) {
            string = this.f38369c.getString(R.string.IDS_motiontrack_offlinemap_connectting_no_wifi);
        } else {
            string = this.f38369c.getString(R.string.IDS_motiontrack_offlinemap_connectting_no_wlan);
        }
        new CustomAlertDialog.Builder(this.f38369c).d(R.string.IDS_motiontrack_show_remind).e(string).a(R.string.IDS_motiontrack_show_cancel, new DialogInterface.OnClickListener(this) { // from class: jcc.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }).d(R.string.IDS_motiontrack_offlinemap_connectting_sure, new DialogInterface.OnClickListener() { // from class: jcc.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (z) {
                    jcc.this.d(str, "ACTION_MAP_ONCHRCKUPDATE_AS");
                } else {
                    jcc.this.d(str, "ACITON_ACTIVITY_LOAD_CITY_AS");
                }
            }
        }).b().show();
    }

    public void b(String str) {
        LogUtil.a("Track_OfflineDialogController", "loadWaitCity() enter");
        if (!jcg.c(this.f38369c)) {
            d();
        } else {
            if (jcg.a(this.f38369c)) {
                d(str);
                return;
            }
            a();
            d(str, "ACITON_ACTIVITY_WAIT_CITY_AS");
            LogUtil.a("Track_OfflineDialogController", "loadWaitCity() finish");
        }
    }

    public void d(String str, boolean z) {
        LogUtil.a("Track_OfflineDialogController", "loadCity int isUpdate:", Boolean.valueOf(z));
        if (!jcg.c(this.f38369c)) {
            d();
            return;
        }
        if (jcg.a(this.f38369c)) {
            c(str, z);
        } else if (z) {
            d(str, "ACTION_MAP_ONCHRCKUPDATE_AS");
            LogUtil.a("Track_OfflineDialogController", "loadCity update ok");
        } else {
            d(str, "ACITON_ACTIVITY_LOAD_CITY_AS");
            LogUtil.a("Track_OfflineDialogController", "loadCity ok");
        }
    }

    public void e(String str, boolean z) {
        LogUtil.a("Track_OfflineDialogController", "deleteCity()");
        a(String.format(this.f38369c.getString(R.string.IDS_motiontrack_offlinemap_download_city_delete_on), str));
        Intent intent = new Intent("ACITON_ACTIVITY_DELETE_CITY_AS");
        intent.putExtra("TAG_ONE_CITY_STRING_AS", str);
        intent.putExtra("TAG_BOOLEAN_ISRESTART_AS", z);
        iyb.e(this.f38369c.getApplicationContext(), intent);
    }

    public void e(String str) {
        LogUtil.a("Track_OfflineDialogController", "stopLoading");
        d(str, "ACTION_ACTIVITY_PAUSE_CITY_AS");
    }

    private void a(String str) {
        a(str, true);
    }

    public void a() {
        LogUtil.a("Track_OfflineDialogController", "showWaitingDialog enter");
        d(true);
    }

    private void d(boolean z) {
        a(this.f38369c.getString(R.string.IDS_motiontrack_common_ui_waiting), z);
    }

    private void a(String str, boolean z) {
        if (this.f38368b == null) {
            new CommonDialog21(this.f38369c, R.style.app_update_dialogActivity);
            this.f38368b = CommonDialog21.b(this.f38369c);
        }
        this.f38368b.b(str);
        this.f38368b.setCancelable(z);
        this.f38368b.c();
    }

    private void d() {
        LogUtil.a("Track_OfflineDialogController", "showNetworkOpenDialog()");
        new CustomAlertDialog.Builder(this.f38369c).d(R.string.IDS_motiontrack_show_remind).e(this.f38369c.getString(R.string.IDS_motiontrack_offlinemap_connectting_error)).a(R.string.IDS_motiontrack_show_cancel, new DialogInterface.OnClickListener(this) { // from class: jcc.9
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }).d(R.string.IDS_motiontrack_offlinemap_operate_settings, new DialogInterface.OnClickListener() { // from class: jcc.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("Track_OfflineDialogController", "showNetworkOpenDialog() onDialogButtonClick Yes");
                try {
                    jcc.this.f38369c.startActivity(new Intent("android.settings.SETTINGS"));
                } catch (ActivityNotFoundException e2) {
                    LogUtil.e("Track_OfflineDialogController", "showNetworkOpenDialog() exception: ", LogAnonymous.b(e2));
                }
            }
        }).b().show();
    }

    public void e() {
        LogUtil.a("Track_OfflineDialogController", "closeWaitingDialog enter mWaitingDialog : ", this.f38368b);
        CommonDialog21 commonDialog21 = this.f38368b;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        this.f38368b.dismiss();
    }

    public void c() {
        this.f38368b = null;
        this.f38369c = null;
        b();
    }

    private static void b() {
        synchronized (jcc.class) {
            e = null;
        }
    }
}
