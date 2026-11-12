package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class uhs {
    public static void c(float f, long j) {
        double d = uhv.d(f) / 1000.0d;
        double dB = uhv.b(f);
        LogUtil.a("SCUI_StepShareUtil", "averSteps", Float.valueOf(f), " calorie", Double.valueOf(d), " distance", Double.valueOf(dB));
        HashMap map = new HashMap();
        Context contextB = BaseApplication.b();
        map.put("step", UnitUtil.e(f, 1, 0));
        map.put("step_unit", contextB.getResources().getString(R.string.IDS_settings_steps_unit));
        map.put("step_title", contextB.getResources().getString(R.string.IDS_settings_steps));
        map.put("calorie", UnitUtil.e(d, 1, 0));
        map.put("calorie_unit", contextB.getResources().getString(R.string.IDS_band_data_sport_energy_unit));
        map.put("calorie_title", contextB.getResources().getString(R.string.IDS_active_caloric));
        map.put("distance_title", contextB.getResources().getString(R.string.IDS_sport_distance));
        map.put("sport_data", UnitUtil.d("MM/dd", j));
        if (UnitUtil.f()) {
            map.put("distance_unit", contextB.getResources().getString(R.string.IDS_band_data_sport_distance_unit_en));
            map.put("distance", UnitUtil.e(UnitUtil.e(dB / 1000.0d, 3), 1, 2));
        } else {
            map.put("distance_unit", contextB.getResources().getString(R.string.IDS_motiontrack_show_sport_unit_km));
            map.put("distance", UnitUtil.e(dB / 1000.0d, 1, 2));
        }
        gyd gydVar = new gyd();
        gydVar.e(map);
        ArrayList arrayList = new ArrayList(1);
        gxz gxzVar = new gxz();
        gxzVar.a(999);
        gxzVar.b(R.drawable.share_geometry_1);
        arrayList.add(gxzVar);
        Bundle bundle = new Bundle();
        bundle.putSerializable("shareWaterMarkData", gydVar);
        bundle.putSerializable("waterMarkIds", arrayList);
        bundle.putInt("downLoadId", 257);
        AppRouter.c("/PluginSocialShare/CustomizeShareActivity").d(bundle).b(contextB);
    }
}
