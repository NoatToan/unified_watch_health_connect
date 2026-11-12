package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.huawei.ecologydevice.R;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes27.dex */
public class etj {
    public static void a(Fragment fragment, boolean z) {
        if (fragment == null) {
            LogUtil.d("TurnOnBleUtils", "startIntent, context is null");
        } else if (!d(fragment.getActivity())) {
            b(fragment.getActivity());
        } else {
            b(fragment, z);
        }
    }

    public static boolean d(Context context) {
        if (context == null) {
            LogUtil.d("TurnOnBleUtils", "isSupportBluetooth, context is null");
            return false;
        }
        if ((context.getSystemService("bluetooth") instanceof BluetoothManager ? (BluetoothManager) context.getSystemService("bluetooth") : null) != null) {
            return true;
        }
        LogUtil.d("TurnOnBleUtils", "no BT Manager in this phone");
        return false;
    }

    public static void b(Activity activity) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).b(R.string.IDS_pad_cannot_be_added).c(R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: etj.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("TurnOnBleUtils", "Bluetooth not supported");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private static void b(Fragment fragment, boolean z) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && !defaultAdapter.isEnabled()) {
            PermissionDialogHelper.a(fragment, 102);
        } else {
            erj.b(fragment.getContext(), z);
        }
    }
}
