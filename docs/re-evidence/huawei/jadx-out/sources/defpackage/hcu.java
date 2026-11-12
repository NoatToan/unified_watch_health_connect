package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.huawei.health.sport.model.data.RecordPlanInfo;
import com.huawei.pluginfitnessadvice.FitWorkout;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class hcu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f36432b = new Object();
    private static volatile hcu d;

    private hcu() {
    }

    public static hcu b() {
        if (d == null) {
            synchronized (f36432b) {
                if (d == null) {
                    d = new hcu();
                }
            }
        }
        return d;
    }

    public void c(String str) {
        hcx.b(str);
    }

    public void c() {
        hcx.d();
    }

    public void b(Context context, int i, int i2, float f) {
        hcx.d(context, i, i2, f);
    }

    public int c(Context context, String str, Map<String, Object> map) {
        return hct.d(context, str, map);
    }

    public float d() {
        return hcw.b();
    }

    public String e() {
        return hcw.d();
    }

    public int c(Context context, FitWorkout fitWorkout, RecordPlanInfo recordPlanInfo, Bundle bundle) {
        return hcx.b(context, fitWorkout, recordPlanInfo, bundle);
    }

    public void c(Object obj, String str) {
        hcx.a(obj, str);
    }

    public void d(String str, Object obj, String str2) {
        hcx.d(str, obj, str2);
    }

    public void b(String str, int i) {
        hcx.a(str, i);
    }

    public void b(String str, String str2, int i) {
        hcx.b(str, str2, i);
    }

    public void a(String str) {
        hcx.d(str);
    }
}
