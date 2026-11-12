package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.WifiDevicePressureCalibrateGuideActivity;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.adapter.MultiDeviceslistAdapter;
import defpackage.vdy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class vdy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f50983a = {"e4b0b1d5-2003-4d88-8b5f-c4f64542040b", "a8ba095d-4123-43c4-a30a-0240011c58de"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static CustomAlertDialog f50984c;

    public static void e(Context context, String str) {
        ArrayList<elh> arrayListC = ean.c();
        if (arrayListC.size() == 1) {
            a(context, str, arrayListC.get(0).t());
        } else if (arrayListC.size() > 1) {
            d(context, str);
        } else {
            d(context);
            LogUtil.a("WeightDevicePressureUtil", "handlePressureCalibrate , productList.size : ", Integer.valueOf(arrayListC.size()));
        }
    }

    private static void a(Context context, String str, String str2) {
        LogUtil.a("WeightDevicePressureUtil", "goToPressureCalibrate");
        Intent intent = new Intent(context, (Class<?>) WifiDevicePressureCalibrateGuideActivity.class);
        intent.putExtra("health_wifi_device_userId", str);
        intent.putExtra("health_wifi_device_productId", str2);
        iov.d(context, intent);
    }

    private static boolean e(String str) {
        for (String str2 : f50983a) {
            if (str2.equals(str)) {
                LogUtil.a("WeightDevicePressureUtil", "isSupportPressureDevcie()=true ", "productType = ", str);
                return true;
            }
        }
        LogUtil.a("WeightDevicePressureUtil", "isSupportPressureDevcie()=false ", "productType = ", str);
        return false;
    }

    private static void d(final Context context, final String str) {
        LogUtil.a("WeightDevicePressureUtil", "showPressureCalibrateDeviceDialog");
        ArrayList arrayList = new ArrayList();
        ArrayList<eby> arrayListD = drw.e().d();
        if (arrayListD != null && arrayListD.size() > 0) {
            for (int i = 0; i < arrayListD.size(); i++) {
                eby ebyVar = arrayListD.get(i);
                if (e(ebyVar.getProductId())) {
                    dru druVar = new dru();
                    druVar.d(0);
                    druVar.c(ebyVar);
                    arrayList.add(druVar);
                }
            }
        } else {
            LogUtil.j("WeightDevicePressureUtil", "WiFiDevice is null or WiFiDevice size is 0");
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pressure_multi_devices_list_layout, (ViewGroup) null);
        ListView listView = (ListView) viewInflate.findViewById(R.id.pressure_multi_devices_list);
        final MultiDeviceslistAdapter multiDeviceslistAdapter = new MultiDeviceslistAdapter(context, arrayList);
        listView.setAdapter((ListAdapter) multiDeviceslistAdapter);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(context);
        builder.d(R.string.IDS_device_wifi_pressure_calibrate_multi_devices_title).a(viewInflate).d(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: vdw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }).e(false);
        CustomAlertDialog customAlertDialogB = builder.b();
        f50984c = customAlertDialogB;
        customAlertDialogB.show();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.main.stories.health.util.WeightDevicePressureUtil$$ExternalSyntheticLambda2
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                vdy.d(multiDeviceslistAdapter, context, str, adapterView, view, i2, j);
            }
        });
    }

    public static /* synthetic */ void d(MultiDeviceslistAdapter multiDeviceslistAdapter, Context context, String str, AdapterView adapterView, View view, int i, long j) {
        dyg.a(false, "WeightDevicePressureUtil", "onItemClick position = " + i);
        dru item = multiDeviceslistAdapter.getItem(i);
        if (item != null && item.i() != null) {
            try {
                a(context, str, ((eby) item.i()).getProductId());
            } catch (ClassCastException e) {
                LogUtil.j("WeightDevicePressureUtil", "Object to WiFiDevice ClassCastException:" + e.getMessage());
            }
        }
        CustomAlertDialog customAlertDialog = f50984c;
        if (customAlertDialog == null || !customAlertDialog.isShowing()) {
            return;
        }
        f50984c.dismiss();
        f50984c = null;
    }

    private static void d(Context context) {
        LogUtil.a("WeightDevicePressureUtil", "showNoSupportDialog");
        new NoTitleCustomAlertDialog.Builder(context).b(R.string.IDS_hw_adjust_show_pressure_device_connect).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: vdz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("WeightDevicePressureUtil", "onClick know button");
            }
        }).c().show();
    }
}
