package defpackage;

import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class yio {
    private static Map<Integer, String> e;

    static {
        HashMap map = new HashMap();
        e = map;
        map.put(0, "Success");
        e.put(1, "Generic error");
        e.put(2, "Health app not exist");
        e.put(3, "Health app not login");
        e.put(4, "Health app unbound device");
        e.put(5, "Invalid argument");
        e.put(6, "Server remote binder is null");
        e.put(7, "User unauthorized in health");
        e.put(8, "Scope unauthorized");
        e.put(9, "User unauthorized in wear engine");
        e.put(10, "Invalid file");
        e.put(11, "Too much receivers");
        e.put(12, "Internal error");
        e.put(13, "Device version is not supported");
        e.put(14, "Health version is low");
        e.put(15, "Health does not has permission to start");
        e.put(16, "Device is not connected");
        e.put(17, "Device uuid is invalid");
        e.put(18, "Interface is not supported");
        e.put(200, "Watch app not exist");
        e.put(201, "Watch app not running");
        e.put(202, "Watch app running");
        e.put(203, "Other error");
        e.put(204, "Phone app not exist");
        e.put(205, "Phone app exist");
        e.put(206, "Fail");
        e.put(Integer.valueOf(a.w), "Success");
        e.put(300, "Sensor Watch Wear Off");
        e.put(301, "Sensor Watch Lead Off");
        e.put(302, "Sensor Watch User Stop");
        e.put(303, "Sensor Watch Sensor Used");
        e.put(304, "Sensor Not Abilites");
        e.put(Integer.valueOf(a.A), "Send Offline Msg Success");
        e.put(19, "Service Timeout");
        e.put(20, "Power mode changing");
    }

    public static String b(int i) {
        if (e.containsKey(Integer.valueOf(i))) {
            return e.get(Integer.valueOf(i));
        }
        return "Generic error";
    }

    public static int e(String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            yis.c("WearEngineErrorCode", "NumberFormatException");
            i = 1;
        }
        if (e.containsKey(Integer.valueOf(i))) {
            return i;
        }
        return 1;
    }
}
