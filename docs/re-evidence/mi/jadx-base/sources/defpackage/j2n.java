package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mi.health.course.export.data.CourseConfigModel;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class j2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f22359a = new HashSet(Arrays.asList("不要", "不想要", "不看", "不想看", "非", "没有"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<Character> f22360b = new HashSet(Arrays.asList(38646, 19968, 20108, 19977, 22235, 20116, 20845, 19971, 20843, 20061, 21313, 30334, 21315, 19975, 20159));

    public static boolean a(y2e y2eVar, j82 j82Var, Class<? extends j82> cls, Set<String> set) {
        ovg ovgVarE = y2eVar.l().e();
        HashMap map = new HashMap();
        while (ovgVarE != null) {
            xb8 xb8VarI = ovgVarE.i();
            String strF = xb8VarI.f();
            xb8 xb8VarI2 = ovgVarE.d().i();
            ovgVarE = ovgVarE.e();
            if (!strF.equals("eps")) {
                String strG = xb8VarI.g();
                if (set.contains(strF) && f22359a.contains(xb8VarI2.h())) {
                    strG = "!" + strG;
                }
                if (!map.containsKey(strF)) {
                    map.put(strF, new ArrayList());
                }
                ((List) map.get(strF)).add(mjh.e(xb8VarI, strG));
            }
        }
        List<String> listB = b(cls);
        boolean z = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            for (mjh<xb8, String> mjhVar : i2n.a(j82Var.getDomain(), str).a((List) entry.getValue())) {
                String str2 = CourseConfigModel.DevCmd.CMD_ACTION_SET + klo.p(str);
                xb8 xb8VarB = mjhVar.b();
                String strC = mjhVar.c();
                j82Var.getIntentionInfo().addProperty(str, strC);
                if (listB.contains(str) || listB.contains(klo.n(str))) {
                    try {
                        cls.getMethod(str2, String.class).invoke(j82Var, strC);
                    } catch (Exception unused) {
                        try {
                            cls.getMethod(CourseConfigModel.DevCmd.CMD_ACTION_SET + klo.o(str, true), String.class).invoke(j82Var, strC);
                        } catch (Exception unused2) {
                        }
                    }
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("entity", xb8VarB.g());
                    jsonObject.addProperty("slot_type", str);
                    jsonObject.addProperty("sidx", Integer.valueOf(xb8VarB.a()));
                    jsonObject.addProperty("eidx", Integer.valueOf(xb8VarB.b()));
                    JsonObject debugInfo = j82Var.getDebugInfo();
                    if (debugInfo.has("slot")) {
                        debugInfo.getAsJsonArray("slot").add(jsonObject);
                    } else {
                        JsonArray jsonArray = new JsonArray();
                        jsonArray.add(jsonObject);
                        debugInfo.add("slot", jsonArray);
                    }
                    j82Var.setDebugInfo(debugInfo);
                    z = true;
                }
            }
        }
        return z;
    }

    public static List<String> b(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            for (Field field : cls.getDeclaredFields()) {
                arrayList.add(field.getName());
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }
}
