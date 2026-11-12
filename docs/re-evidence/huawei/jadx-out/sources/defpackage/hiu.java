package defpackage;

import android.content.Intent;
import com.google.android.gms.wearable.PutDataRequest;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.suggestion.CoachController;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hiu {
    private static Map<String, Object> b(d dVar) {
        HashMap map = new HashMap(7);
        if (dVar == null) {
            LogUtil.j("Suggestion_CoachBiHelper", "baseCoachBi coachBiKey == null");
            return map;
        }
        map.put("click", 1);
        map.put("course_type", dVar.a());
        map.put("body_position", dVar.c());
        map.put("course_rate", dVar.b());
        map.put("resourceType", Integer.valueOf(dVar.f()));
        map.put("workout_name", dVar.j());
        map.put("workout_id", dVar.e());
        map.put("isAICourse", dVar.i());
        return map;
    }

    public static void e(d dVar, CoachController.StatusSource statusSource) {
        Map<String, Object> mapB = b(dVar);
        if (dVar != null) {
            mapB.put("eventType", Integer.valueOf(dVar.d()));
        }
        if (statusSource.equals(CoachController.StatusSource.NEW_LINK_WEAR)) {
            mapB.put("ControlMode", PutDataRequest.WEAR_URI_SCHEME);
        } else {
            mapB.put("ControlMode", "app");
        }
        a("1130066", mapB);
    }

    public static void a(d dVar, int i) {
        c(dVar, i, CoachController.StatusSource.APP);
    }

    public static void c(d dVar, int i, CoachController.StatusSource statusSource) {
        Map<String, Object> mapB = b(dVar);
        if (dVar != null) {
            mapB.put("event", Integer.valueOf(i));
        }
        if (statusSource.equals(CoachController.StatusSource.NEW_LINK_WEAR)) {
            mapB.put("ControlMode", PutDataRequest.WEAR_URI_SCHEME);
        } else {
            mapB.put("ControlMode", "app");
        }
        a("1130067", mapB);
    }

    private static void a(final String str, final Map<String, Object> map) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hjb
            @Override // java.lang.Runnable
            public final void run() {
                lmf.d().c(BaseApplication.b(), str, map, 0);
            }
        });
    }

    public static d c(Intent intent, String str, String str2, String str3) {
        d dVar = new d();
        dVar.d(str);
        dVar.b(str2);
        dVar.f(str3);
        if (intent == null) {
            LogUtil.j("Suggestion_CoachBiHelper", "getCoachBiValue intent == null");
            return dVar;
        }
        dVar.d(intent.getIntExtra("commodityFlag", 0));
        if (!(intent.getSerializableExtra("BI_INTENT_COURSE") instanceof Map)) {
            LogUtil.j("Suggestion_CoachBiHelper", "getCoachBiValue not instanceof Map");
            return dVar;
        }
        Map map = (Map) intent.getSerializableExtra("BI_INTENT_COURSE");
        if (map != null) {
            dVar.a(e((Map<String, Object>) map, "course_type"));
            dVar.e(e((Map<String, Object>) map, "body_position"));
            dVar.c(e((Map<String, Object>) map, "course_rate"));
        }
        return dVar;
    }

    public static String e(Map<String, Object> map, String str) {
        if (map == null || map.isEmpty() || !map.containsKey(str)) {
            return "";
        }
        if (map.get(str) instanceof String) {
            return (String) map.get(str);
        }
        if (map.get(str) instanceof Integer) {
            return (String) map.get(str);
        }
        return "";
    }

    public static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f36785c;
        private int e;
        private int h;
        private String i;
        private String j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36783a = "";
        private String d = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f36784b = "";

        public void a(String str) {
            this.f36783a = str;
        }

        public String a() {
            return this.f36783a;
        }

        public void e(String str) {
            this.d = str;
        }

        public String c() {
            return this.d;
        }

        public void c(String str) {
            this.f36784b = str;
        }

        public String b() {
            return this.f36784b;
        }

        public void c(int i) {
            this.e = i;
        }

        public int d() {
            return this.e;
        }

        public void d(int i) {
            this.h = i;
        }

        public int f() {
            return this.h;
        }

        public void d(String str) {
            this.j = str;
        }

        public String j() {
            return this.j;
        }

        public void b(String str) {
            this.f36785c = str;
        }

        public String e() {
            return this.f36785c;
        }

        public String i() {
            return this.i;
        }

        public void f(String str) {
            this.i = str;
        }
    }
}
