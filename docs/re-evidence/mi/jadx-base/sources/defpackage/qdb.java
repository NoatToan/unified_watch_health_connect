package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class qdb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, Class<? extends pdb>> f31406a;

    static {
        HashMap map = new HashMap();
        f31406a = map;
        map.put("require_device_mode", rdb.class);
        f31406a.put("require_foreground_app", tdb.class);
        f31406a.put("require_device_name", sdb.class);
        f31406a.put("require_version", udb.class);
    }

    public static pdb a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Class<? extends pdb> cls = f31406a.get(jSONObject.optString("name", ""));
        if (cls != null) {
            try {
                pdb pdbVarNewInstance = cls.newInstance();
                pdbVarNewInstance.c(jSONObject.optString("value", ""));
                return pdbVarNewInstance;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
