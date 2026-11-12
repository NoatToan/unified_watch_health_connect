package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class eht {
    private ConcurrentHashMap<String, ehq> d = new ConcurrentHashMap<>();

    public void b(String str, MessageOrStateCallback messageOrStateCallback, List<Integer> list) {
        this.d.put(str, new ehq(messageOrStateCallback, list));
    }

    public void b(String str) {
        if (str == null) {
            LogUtil.a("PDROPE_MsgStateController", "context is null, can not release resource.");
        } else {
            this.d.remove(str);
        }
    }

    public void a() {
        this.d.clear();
    }

    public boolean b() {
        ConcurrentHashMap<String, ehq> concurrentHashMap = this.d;
        return concurrentHashMap == null || concurrentHashMap.isEmpty();
    }

    public void a(String str) {
        Iterator<ehq> it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next().d(str);
        }
    }

    public void b(int i, Bundle bundle) {
        int i2 = bundle != null ? bundle.getInt("com.huawei.health.fitness.KEY_MESSAGE_FITNESS_DATA_TYPE", -1) : -1;
        for (ehq ehqVar : this.d.values()) {
            if (i2 == -1 || ehqVar.c(i2)) {
                ehqVar.a(i, bundle);
            }
        }
    }

    public void b(String str, int i, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i2 = bundle != null ? bundle.getInt("com.huawei.health.fitness.KEY_MESSAGE_FITNESS_DATA_TYPE", -1) : -1;
        ehq ehqVar = this.d.get(str);
        if (ehqVar != null) {
            if (i2 == -1 || ehqVar.c(i2)) {
                ehqVar.a(i, bundle);
            }
        }
    }
}
