package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.callback.FrameReceiver;
import health.compact.a.LogUtil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class xje {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, FrameReceiver> f53108c;

    private xje() {
        this.f53108c = new ConcurrentHashMap(10);
    }

    public static xje e() {
        return d.f53109a;
    }

    public Map<String, FrameReceiver> b() {
        return this.f53108c;
    }

    public void a(String str, FrameReceiver frameReceiver) {
        if (TextUtils.isEmpty(str) || frameReceiver == null) {
            return;
        }
        LogUtil.e("ListenerManagement", "registerListener put: ", str);
        this.f53108c.put(str, frameReceiver);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LogUtil.e("ListenerManagement", "unregisterListener remove: ", str);
        this.f53108c.remove(str);
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static xje f53109a = new xje();
    }
}
