package defpackage;

import android.os.RemoteException;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.monitor.SwitchStatusCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class yjq {
    private volatile Map<String, List<SwitchStatusCallback>> e;

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final yjq f53522a = new yjq();
    }

    private yjq() {
        this.e = new ConcurrentHashMap(16);
        LogUtil.a("SwitchStatusManager", "enter SwitchStatusManager");
        this.e.clear();
    }

    public static yjq a() {
        return e.f53522a;
    }

    public void c(String str, int i, SwitchStatusCallback switchStatusCallback) {
        LogUtil.a("SwitchStatusManager", "enter registerSwitchStatusListener");
        String strA = a(str, i);
        List<SwitchStatusCallback> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (this.e.containsKey(strA)) {
            copyOnWriteArrayList = this.e.get(strA);
        }
        if (copyOnWriteArrayList == null) {
            LogUtil.e("SwitchStatusManager", "registerSwitchStatusListener switchStatusCallbackList is null");
        } else {
            copyOnWriteArrayList.add(switchStatusCallback);
            this.e.put(strA, copyOnWriteArrayList);
        }
    }

    private String a(String str, int i) {
        return str + "_" + i;
    }

    public void c(String str, int i, int i2) {
        String strA = a(str, i);
        if (!this.e.containsKey(strA)) {
            LogUtil.j("SwitchStatusManager", "key does not exist in Map");
            return;
        }
        List<SwitchStatusCallback> list = this.e.get(strA);
        if (list == null || list.size() == 0) {
            LogUtil.j("SwitchStatusManager", "List is empty");
            return;
        }
        int i3 = i2 == 0 ? 1 : 0;
        ArrayList arrayList = new ArrayList();
        for (SwitchStatusCallback switchStatusCallback : list) {
            if (switchStatusCallback != null) {
                StringBuilder sb = new StringBuilder("SwitchStatusCallback => type: ");
                sb.append(str);
                sb.append(", status: ");
                sb.append(i == 1 ? "open" : "close");
                LogUtil.a("SwitchStatusManager", sb.toString());
                try {
                    switchStatusCallback.onResult(i3);
                    arrayList.add(switchStatusCallback);
                } catch (RemoteException unused) {
                    LogUtil.e("SwitchStatusManager", "handleNotifyCallback RemoteException");
                }
            }
        }
        list.removeAll(arrayList);
    }
}
