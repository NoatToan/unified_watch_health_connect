package health.compact.a;

import android.content.Context;
import com.huawei.health.manager.migration.InterfaceMigration;
import com.huawei.health.manager.migration.MigrationAthenePreviewToAthene;
import com.huawei.health.manager.migration.MigrationAtheneThreeToAtheneFour;
import com.huawei.health.manager.migration.MigrationAtheneToAtheneTwo;
import com.huawei.health.manager.migration.MigrationAtheneTwoToAtheneThree;
import com.huawei.health.manager.migration.MigrationVersionOneToAthene;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.SharedPerferenceUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MigrationManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<InterfaceMigration> f36617c;

    private MigrationManager() {
        ArrayList arrayList = new ArrayList(10);
        this.f36617c = arrayList;
        e(arrayList);
    }

    private static void e(List<InterfaceMigration> list) {
        list.add(new MigrationVersionOneToAthene());
        list.add(new MigrationAthenePreviewToAthene());
        list.add(new MigrationAtheneToAtheneTwo());
        list.add(new MigrationAtheneTwoToAtheneThree());
        list.add(new MigrationAtheneThreeToAtheneFour());
        list.add(new InterfaceMigration() { // from class: com.huawei.health.manager.migration.MigrationManager$1
            @Override // com.huawei.health.manager.migration.InterfaceMigration
            public boolean filter(String str) {
                return true;
            }

            @Override // com.huawei.health.manager.migration.InterfaceMigration
            public void migration(Context context) {
                if (context == null) {
                    LogUtil.a("Step_MigrationManager", "context is null");
                } else {
                    SharedPerferenceUtils.c(context, "Athene4");
                }
            }
        });
    }

    public static void c(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_MigrationManager", "context is null");
        } else {
            new MigrationManager().c(context, "Athene4");
            MigrationAtheneTwoToAtheneThree.c();
        }
    }

    private void c(Context context, String str) {
        String strE = e(context);
        if (strE == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_MigrationManager", "migrate version == null");
            return;
        }
        if (UserInfomation.BIRTHDAY_UNSETED.equals(strE)) {
            SharedPerferenceUtils.c(context, str);
            return;
        }
        if (strE.equals(str)) {
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.a("Step_MigrationManager", "migrate begin from:", strE);
        while (true) {
            String strE2 = e(context);
            if (strE2.equals(str)) {
                com.huawei.hwlogsmodel.LogUtil.a("Step_MigrationManager", "migrate end at:", strE2);
                return;
            }
            for (InterfaceMigration interfaceMigration : this.f36617c) {
                if (interfaceMigration.filter(strE2)) {
                    interfaceMigration.migration(context);
                    break;
                }
            }
        }
    }

    private String e(Context context) {
        String strAa = SharedPerferenceUtils.aa(context);
        boolean z = false;
        if (UserInfomation.BIRTHDAY_UNSETED.equals(strAa) && context.getSharedPreferences("plugin_device_preferences_settings", 0).getString("plugin_device_last_time_and_this_time", null) != null) {
            strAa = "v1";
        }
        if (UserInfomation.BIRTHDAY_UNSETED.equals(strAa)) {
            String[] strArrY = SharedPerferenceUtils.y(context);
            if (strArrY != null && (!strArrY[0].equals("0") || !strArrY[1].equals("0") || !strArrY[2].equals("0"))) {
                z = true;
            }
            if (SharedPerferenceUtils.s(context) != null || z) {
                return "v2_preview";
            }
        }
        return strAa;
    }
}
