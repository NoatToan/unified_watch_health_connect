package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.model.RecordAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;

/* JADX INFO: loaded from: classes7.dex */
public class eqr {
    private static eqr d;

    public boolean b(int i) {
        return i != 0;
    }

    private eqr() {
    }

    public static eqr a() {
        if (d == null) {
            d = new eqr();
        }
        return d;
    }

    public String a(int i) {
        if (i == 1) {
            return HealthDevice.HealthDeviceKind.HDK_TREADMILL.name();
        }
        if (i == 2) {
            return HealthDevice.HealthDeviceKind.HDK_EXERCISE_BIKE.name();
        }
        return "";
    }

    public String c(ContentValues contentValues) {
        if (contentValues == null) {
            return "";
        }
        return a(contentValues.getAsString("kind"), contentValues.getAsString("uniqueId"));
    }

    public String e(MeasurableDevice measurableDevice) {
        if (measurableDevice == null) {
            return "";
        }
        return a(measurableDevice.getKind().name(), measurableDevice.getUniqueId());
    }

    private String a(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder(16);
        if (!"HDK_EXERCISE_BIKE".equals(str)) {
            str3 = "31";
        } else {
            str3 = BleConstants.SPORT_TYPE_BIKE;
        }
        sb.append(RecordAction.ACT_COST_TIME_TAG);
        sb.append(str3);
        sb.append("&ftmp=1&ble=");
        sb.append(str2);
        return sb.toString();
    }

    public void a(Context context, int i, String str, MeasurableDevice measurableDevice) {
        if (context == null) {
            LogUtil.a("DeviceCoursesHelper", "startIndoorEquipConnectedActivity context is null");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.indoorequip.activity.IndoorEquipConnectedActivity");
        intent.putExtra("PAYLOAD_FROM_NFC", e(measurableDevice));
        intent.putExtra("KEY_INTENT_COURSE_ENTRANCE", i);
        intent.putExtra("KEY_INTENT_EQUIPMENT_TYPE", str);
        iov.d(context, intent);
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public void b(Context context, String str) {
        String string;
        if (context == null) {
            LogUtil.a("DeviceCoursesHelper", "showTipDialog context is null");
            return;
        }
        if (HealthDevice.HealthDeviceKind.HDK_TREADMILL.name().equals(str)) {
            string = context.getResources().getString(R.string.IDS_course_treadmill_nonmatch_content);
        } else if (!HealthDevice.HealthDeviceKind.HDK_EXERCISE_BIKE.name().equals(str)) {
            LogUtil.a("DeviceCoursesHelper", "Course equipmentType", str);
            string = "";
        } else {
            string = context.getResources().getString(R.string.IDS_course_bicycle_nonmatch_content);
        }
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(context).d(R.string.IDS_course_device_nonmatch_dialog_title).e(string).a(R.string.IDS_course_device_nonmatch_dialog_ok, new DialogInterface.OnClickListener() { // from class: eqs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.j("DeviceCoursesHelper", "showTipDialog，click known button");
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    public void a(Intent intent, Bundle bundle) {
        if (intent == null || bundle == null) {
            LogUtil.a("DeviceCoursesHelper", "intent or bundle is null");
            return;
        }
        int intExtra = intent.getIntExtra("KEY_INTENT_COURSE_ENTRANCE", 0);
        if (b(intExtra)) {
            String stringExtra = intent.getStringExtra("KEY_INTENT_EQUIPMENT_TYPE");
            bundle.putInt("KEY_INTENT_COURSE_ENTRANCE", intExtra);
            bundle.putString("KEY_INTENT_EQUIPMENT_TYPE", stringExtra);
        }
    }
}
