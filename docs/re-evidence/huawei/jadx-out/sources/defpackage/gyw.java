package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.operation.ble.BleConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class gyw {
    private static int d;

    public static void c(int i) {
        d = i;
    }

    public static int a() {
        return d;
    }

    public static void d(String str) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put(BleConstants.SPORT_TYPE, str);
        lmf.d().c(BaseApplication.b(), AnalyticsValue.VUI_2010093.value(), map, 0);
    }
}
