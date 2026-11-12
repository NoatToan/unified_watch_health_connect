package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class npt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f43425c;

    static {
        HashMap map = new HashMap();
        f43425c = map;
        map.put("<C1>", ParsedFieldTag.GOAL);
        map.put("<C2>", "target");
        map.put("<H1>", "heart");
        map.put("<S1>", "step");
        map.put("<S2>", "pace");
        map.put("<S3>", "climb");
        map.put("<S4>", "floor");
        map.put("<S5>", "active");
        map.put("<S6>", "calorie");
        map.put("<S7>", "distance");
        map.put("<S8>", "intensity");
    }

    public static Object[] d(Object... objArr) {
        if (!CollectionUtils.d(objArr)) {
            for (Map.Entry<String, String> entry : f43425c.entrySet()) {
                for (int i = 0; i < objArr.length; i++) {
                    String strValueOf = String.valueOf(objArr[i]);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        objArr[i] = strValueOf.replaceAll("(?i)" + entry.getValue(), entry.getKey());
                    }
                }
            }
        }
        return objArr;
    }
}
