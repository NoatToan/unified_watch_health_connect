package defpackage;

import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class btq {
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Set<OnFitnessStatusChangeCallback>> f1145b;

    private btq() {
        this.f1145b = new ConcurrentHashMap(10);
    }

    public static btq e() {
        return e.f1146c;
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final btq f1146c = new btq();
    }

    public boolean c(OnFitnessStatusChangeCallback onFitnessStatusChangeCallback, String str) {
        boolean zAdd;
        if (onFitnessStatusChangeCallback == null) {
            return false;
        }
        if (!this.f1145b.containsKey(str)) {
            this.f1145b.put(str, new HashSet(10));
        }
        synchronized (d) {
            zAdd = this.f1145b.get(str).add(onFitnessStatusChangeCallback);
        }
        return zAdd;
    }

    public boolean d(OnFitnessStatusChangeCallback onFitnessStatusChangeCallback, String str) {
        boolean zRemove;
        if (onFitnessStatusChangeCallback == null) {
            LogUtil.j("Suggestion_WorkoutFinishedHelper", "callback == null");
            return false;
        }
        if (!this.f1145b.containsKey(str)) {
            LogUtil.j("Suggestion_WorkoutFinishedHelper", "callback not exist");
            return false;
        }
        synchronized (d) {
            Set<OnFitnessStatusChangeCallback> set = this.f1145b.get(str);
            zRemove = set != null ? set.remove(onFitnessStatusChangeCallback) : false;
        }
        return zRemove;
    }

    public void e(String str) {
        synchronized (d) {
            if (!this.f1145b.containsKey(str)) {
                LogUtil.j("Suggestion_WorkoutFinishedHelper", "callback not exist");
                return;
            }
            Set<OnFitnessStatusChangeCallback> set = this.f1145b.get(str);
            OnFitnessStatusChangeCallback[] onFitnessStatusChangeCallbackArr = set != null ? (OnFitnessStatusChangeCallback[]) set.toArray(new OnFitnessStatusChangeCallback[set.size()]) : null;
            if (onFitnessStatusChangeCallbackArr == null) {
                return;
            }
            for (OnFitnessStatusChangeCallback onFitnessStatusChangeCallback : onFitnessStatusChangeCallbackArr) {
                if (onFitnessStatusChangeCallback != null) {
                    onFitnessStatusChangeCallback.onUpdate();
                }
            }
        }
    }
}
