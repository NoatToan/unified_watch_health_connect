package defpackage;

import android.content.Context;
import android.util.Pair;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes16.dex */
public class qjs {
    public static int c(boolean z, int i) {
        int i2;
        if (z || !qrs.af(BaseApplication.b())) {
            i2 = 4;
        } else {
            i2 = i == 3 ? 6 : 8;
        }
        return e(i, i2);
    }

    public static int e(int i, int i2) {
        Context contextJ = BaseApplication.j();
        if (contextJ == null) {
            contextJ = BaseApplication.b();
        }
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(contextJ, i);
        int iJ = healthColumnSystem.j();
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        return (((int) UnitUtil.d(healthColumnSystem.a(Math.min(i2, iJ)), 0)) - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue();
    }
}
