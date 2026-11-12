package defpackage;

import android.os.Bundle;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class nxj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, MessageOrStateCallback> f43893c = new ConcurrentHashMap<>();

    public final void b(String str, MessageOrStateCallback messageOrStateCallback) {
        LogUtil.a("Track_IDEQ_FitnessMessagePublisher", "callbackKey = " + str);
        ConcurrentHashMap<String, MessageOrStateCallback> concurrentHashMap = this.f43893c;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, messageOrStateCallback);
        }
    }

    public boolean c(String str) {
        LogUtil.a("Track_IDEQ_FitnessMessagePublisher", "unregisterDataOrStateCallBack = " + str);
        ConcurrentHashMap<String, MessageOrStateCallback> concurrentHashMap = this.f43893c;
        if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
            this.f43893c.remove(str);
        }
        ConcurrentHashMap<String, MessageOrStateCallback> concurrentHashMap2 = this.f43893c;
        return concurrentHashMap2 == null || concurrentHashMap2.isEmpty();
    }

    public final void e() {
        this.f43893c.clear();
    }

    public void c(int i, Bundle bundle) {
        ConcurrentHashMap<String, MessageOrStateCallback> concurrentHashMap = this.f43893c;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator<MessageOrStateCallback> it = this.f43893c.values().iterator();
        while (it.hasNext()) {
            it.next().onNewMessage(i, bundle);
        }
    }

    public void a(String str) {
        ConcurrentHashMap<String, MessageOrStateCallback> concurrentHashMap = this.f43893c;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        LogUtil.d("Track_IDEQ_FitnessMessagePublisher", "notifyFitnessDeviceDataOrStateCallback, state is ", str);
        Iterator<MessageOrStateCallback> it = this.f43893c.values().iterator();
        while (it.hasNext()) {
            it.next().onStateChange(str);
        }
    }
}
