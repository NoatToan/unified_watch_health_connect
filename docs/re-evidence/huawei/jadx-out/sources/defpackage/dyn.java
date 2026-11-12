package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;

/* JADX INFO: loaded from: classes7.dex */
public class dyn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static dyn f32528b;
    private static final Object e = new Object();

    public static dyn a() {
        dyn dynVar;
        synchronized (e) {
            if (f32528b == null) {
                f32528b = new dyn();
            }
            dynVar = f32528b;
        }
        return dynVar;
    }

    public void a(Context context, View view, double d, boolean z) {
        int iIntValue;
        if (context == null) {
            LogUtil.j("PluginDevice_ScaleActivityHelper", "adjustForPad context is null");
            return;
        }
        if (context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) instanceof WindowManager) {
            WindowManager windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int iMax = displayMetrics.heightPixels;
            Object objC = dzw.c("screenHeight", new Integer(0));
            if ((objC instanceof Integer) && (iIntValue = ((Integer) objC).intValue()) != 0) {
                iMax = Math.max(iMax, iIntValue);
            }
            LogUtil.a("PluginDevice_ScaleActivityHelper", "adjustForPad height: ", Integer.valueOf(iMax));
            int iMin = (int) (Math.min(i, ((double) iMax) * 0.5d) * d);
            if (z) {
                i = iMin;
            }
            view.setLayoutParams(new LinearLayout.LayoutParams(i, iMin));
            dzw.a("screenHeight", Integer.valueOf(iMax));
        }
    }

    public boolean b(int i) {
        LogUtil.a("PluginDevice_ScaleActivityHelper", "isNextStartPairGuide downloadStatus: ", Integer.valueOf(i));
        if (i == -2) {
            return true;
        }
        if (i == 0) {
            qpx.a(BaseApplication.getContext(), R.string.IDS_device_download_resource);
            return false;
        }
        if (i != 1) {
            LogUtil.a("PluginDevice_ScaleActivityHelper", "isNextStartPairGuide default downloadStatus:", Integer.valueOf(i));
        }
        return true;
    }

    public boolean e(Context context, dti dtiVar) {
        if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            if (d(dtiVar)) {
                return true;
            }
            d(context, context.getString(R.string.IDS_device_hygride_device_not_wake_up_prompt_content), context.getString(R.string.IDS_device_measureactivity_result_confirm));
            return false;
        }
        if (dtiVar != null) {
            dtiVar.b(1);
        } else {
            LogUtil.j("PluginDevice_ScaleActivityHelper", "bluetooth is off, but mWeightInteractor is null");
            qpx.e(context, R.string.IDS_hw_health_music_check_bluetooth_connection);
        }
        return false;
    }

    private void d(Context context, String str, String str2) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.a(str).a(str2, new View.OnClickListener() { // from class: dyn.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private boolean d(dti dtiVar) {
        if (dtiVar != null) {
            return dtiVar.c();
        }
        return false;
    }

    public void c() {
        e();
    }

    private static void e() {
        synchronized (e) {
            f32528b = null;
        }
    }
}
