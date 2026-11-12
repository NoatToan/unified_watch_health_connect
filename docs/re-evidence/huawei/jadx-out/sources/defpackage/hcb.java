package defpackage;

import android.os.Bundle;
import com.huawei.basefitnessadvice.callback.FitnessCallback;
import health.compact.a.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class hcb implements FitnessCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, FitnessCallback> f36387a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static hcb f36388b = new hcb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f36389c = new Object();
    private int d = -1;

    private hcb() {
    }

    public static hcb a() {
        return f36388b;
    }

    public int d() {
        return this.d;
    }

    public void b(String str, FitnessCallback fitnessCallback) {
        synchronized (f36389c) {
            LogUtil.b("Suggestion_FitListenerUtil", "addListener tab=", str, " callback=", fitnessCallback);
            if (str != null && fitnessCallback != null) {
                f36387a.put(str, fitnessCallback);
            }
        }
    }

    public void c(String str) {
        synchronized (f36389c) {
            LogUtil.b("Suggestion_FitListenerUtil", "removeListener = ", str);
            if (str != null) {
                f36387a.remove(str);
            }
        }
    }

    @Override // com.huawei.basefitnessadvice.callback.FitnessCallback
    public void onChange(String str, int i, Bundle bundle) {
        LogUtil.b("Suggestion_FitListenerUtil", "onChange workoutId = ", str, ", type =", Integer.valueOf(i));
        this.d = i;
        SharedPreferenceManager.d(Integer.toString(10000), "health_fit_play_state", this.d);
        synchronized (f36389c) {
            for (Map.Entry<String, FitnessCallback> entry : f36387a.entrySet()) {
                LogUtil.b("Suggestion_FitListenerUtil", "onChange notify = ", entry.getKey());
                entry.getValue().onChange(str, i, bundle);
            }
        }
    }
}
