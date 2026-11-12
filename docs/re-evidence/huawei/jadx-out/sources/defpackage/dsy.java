package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.dialog.CustomDeviceSelectDialog;
import com.huawei.health.device.ui.dialog.DeviceCheckAdapter;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.plugindevice.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes27.dex */
public final class dsy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile dsy f32340b;

    private dsy() {
    }

    public static dsy e() {
        if (f32340b == null) {
            synchronized (dsy.class) {
                if (f32340b == null) {
                    f32340b = new dsy();
                }
            }
        }
        return f32340b;
    }

    public void a(final Context context, ArrayList<ContentValues> arrayList) {
        LogUtil.a("RopeDeviceHelper", "showSelectDeviceDialog: productsList.size = ", Integer.valueOf(arrayList.size()));
        CustomDeviceSelectDialog customDeviceSelectDialogB = new CustomDeviceSelectDialog.Builder(context).d(R.string.IDS_plugin_device_select).d(HealthDevice.HealthDeviceKind.HDK_ROPE_SKIPPING).e(R.string.IDS_settings_button_ok, new DeviceCheckAdapter.OnItemClickListener() { // from class: dtd
            @Override // com.huawei.health.device.ui.dialog.DeviceCheckAdapter.OnItemClickListener
            public final void onItemClick(dru druVar) {
                this.f32344a.b(context, druVar);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dtb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("RopeDeviceHelper", "cancel clicked");
            }
        }).b();
        customDeviceSelectDialogB.setCancelable(false);
        customDeviceSelectDialogB.show();
    }

    /* synthetic */ void b(Context context, dru druVar) {
        if (druVar != null) {
            d(context, druVar);
        } else {
            LogUtil.a("RopeDeviceHelper", "select no device");
        }
    }

    private void d(Context context, dru druVar) {
        ContentValues contentValuesD = druVar.d();
        String asString = contentValuesD.getAsString("productId");
        String asString2 = contentValuesD.getAsString("uniqueId");
        elh elhVarD = ResourceManager.c().d(asString);
        if (elhVarD == null) {
            LogUtil.j("RopeDeviceHelper", "handleSelectDevice: productInfo is null");
            return;
        }
        elh.a aVarN = elhVarD.n();
        if (aVarN == null) {
            LogUtil.j("RopeDeviceHelper", "handleSelectDevice: introduction is null");
            return;
        }
        if (BleConstants.BLE_THIRD_DEVICE_H5.equals(aVarN.b())) {
            Intent intentB = etn.b(elhVarD, asString, asString2);
            if (intentB != null) {
                context.startActivity(intentB);
                return;
            }
            return;
        }
        e(context, asString, asString2);
    }

    public void e(Context context, String str, String str2) {
        LogUtil.a("RopeDeviceHelper", "startRopeDeviceConnectingPage: productId=", str, ", uniqueId=", dyg.d(str2));
        elh elhVarD = ResourceManager.c().d(str);
        if (context == null || elhVarD == null) {
            LogUtil.a("RopeDeviceHelper", "startRopeDeviceConnectingPage: context or productInfo is null");
        } else {
            context.startActivity(a(elhVarD.t(), str2, elhVarD.m().name(), elo.a(elhVarD.t(), elhVarD.l().d()), elhVarD.l().b()));
        }
    }

    public Intent a(String str, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("SWITCH_PLUGINDEVICE");
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getContext(), "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtra("productId", str);
        intent.putExtra("arg1", "ropeDeviceConnecting");
        intent.putExtra("DeviceType", str3);
        intent.putExtra("DeviceName", str4);
        intent.putExtra("DeviceIconPath", str5);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", str2);
        contentValues.put("productId", str);
        intent.putExtra("commonDeviceInfo", contentValues);
        return intent;
    }
}
