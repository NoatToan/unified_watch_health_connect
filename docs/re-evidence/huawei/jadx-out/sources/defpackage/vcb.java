package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.huawei.basichealth.bloodpressure.BloodPressureSyncManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import defpackage.vcb;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class vcb {
    public static void b() {
        lsy.a(new Runnable() { // from class: vca
            @Override // java.lang.Runnable
            public final void run() {
                vcb.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        final boolean z = uub.c(BaseApplication.b()) > 0;
        final boolean zB = BloodPressureSyncManager.b();
        LogUtil.a("BloodPressureMeasureUtils", "isBondedProducts： ", Boolean.valueOf(z), ", isBloodPressureWatch: ", Boolean.valueOf(zB));
        HandlerExecutor.c(new Runnable() { // from class: vby
            @Override // java.lang.Runnable
            public final void run() {
                vcb.a(z, zB);
            }
        });
    }

    static /* synthetic */ void a(boolean z, boolean z2) {
        if (z || z2) {
            e(z2);
        } else {
            h();
        }
    }

    private static void e(boolean z) {
        Bundle bundle = new Bundle();
        if (z) {
            AppRouter.c("/Main/BloodMeasureHintActivity").d(bundle).d(268435456).b(BaseApplication.b());
            vbw.a(3);
        } else {
            bundle.putString("kind", "HDK_BLOOD_PRESSURE");
            bundle.putString("view", "MeasureDevice");
            AppRouter.c("/PluginDevice/DeviceMainActivity").d(bundle).d(268435456).b(BaseApplication.b());
            vbw.a(4);
        }
    }

    private static void h() {
        if (Utils.o() && BloodPressureUtil.e()) {
            c();
        } else {
            i();
        }
    }

    private static void c() {
        LogUtil.a("BloodPressureMeasureUtils", "showDialogIfBPDeviceConnectedEver");
        e(BaseApplication.b().getString(R.string.IDS_hw_plugin_device_selection_click_rebind_my_device_oversea_unsupported), new View.OnClickListener() { // from class: vbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppRouter.c("/HomeHealth/DeviceMoreListActivity").b(BaseApplication.b());
            }
        }).show();
    }

    private static void i() {
        String string;
        final Context contextB = BaseApplication.b();
        LogUtil.a("BloodPressureMeasureUtils", "bondedProductCount: ", Integer.valueOf(uub.c(contextB)), ", isBloodPressureWatch: ", Boolean.valueOf(BloodPressureSyncManager.b()), ", isChineseSimplifiedLocal: ", Boolean.valueOf(LanguageUtil.l(contextB)), ", isEnglish: ", Boolean.valueOf(LanguageUtil.q(contextB)), ", isHasWearDevice: ", Boolean.valueOf(mga.c()), ", isBluetoothEnabled: ", Boolean.valueOf(iem.b()));
        if (d() && iem.b()) {
            if (Utils.o()) {
                string = contextB.getString(R.string.IDS_hw_plugin_device_selection_click_bind_my_device_oversea_unsupported);
            } else {
                string = contextB.getString(R.string.IDS_hw_plugin_device_selection_click_bind_my_device_unsupported, e());
            }
        } else {
            string = contextB.getString(R.string.IDS_hw_plugin_device_selection_click_rebind_my_device_oversea_unsupported);
        }
        e(string, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.util.BloodPressureMeasureUtils$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vcb.b(contextB, view);
            }
        }).show();
    }

    public static /* synthetic */ void b(Context context, View view) {
        String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODPRESS_DETAIL_BIND_2030024.value();
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(context, strValue, map, 0);
        etn.a(BaseApplication.j(), "HDK_BLOOD_PRESSURE");
    }

    private static NoTitleCustomAlertDialog e(String str, View.OnClickListener onClickListener) {
        Context contextJ = BaseApplication.j();
        if (contextJ == null) {
            contextJ = BaseApplication.b();
        }
        String string = BaseApplication.b().getString(R.string.IDS_tips_connect_go);
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(contextJ);
        builder.a(str).a(string, onClickListener).d(contextJ.getString(R.string.IDS_hw_health_show_common_dialog_cancle_button), new View.OnClickListener() { // from class: vbz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("BloodPressureMeasureUtils", "onClick negative button");
            }
        });
        return builder.c();
    }

    private static boolean d() {
        ArrayList<dxy> arrayListJ = lvl.j();
        if (njy.e(arrayListJ)) {
            LogUtil.a("BloodPressureMeasureUtils", "deviceInfoForWears is null");
            return false;
        }
        for (dxy dxyVar : arrayListJ) {
            if (dxyVar != null && dxyVar.b() == 2) {
                return true;
            }
        }
        return false;
    }

    private static String e() {
        ArrayList<dxy> arrayListJ = lvl.j();
        if (njy.e(arrayListJ)) {
            LogUtil.a("BloodPressureMeasureUtils", "deviceInfoForWears is null");
            return "";
        }
        for (dxy dxyVar : arrayListJ) {
            if (dxyVar != null && dxyVar.b() == 2) {
                return dxyVar.i();
            }
        }
        return "";
    }
}
