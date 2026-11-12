package defpackage;

import android.os.IBinder;
import com.huawei.wearengine.ClientToken;
import com.huawei.wearengine.common.ApplicationIdManager;
import com.huawei.wearengine.core.common.ClientBinderDied;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes46.dex */
public class yiw implements ApplicationIdManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Integer, IBinder> f53400a;
    private ConcurrentHashMap<ClientToken, String> e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<Integer, Map<Integer, Integer>> f53401b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBinder.DeathRecipient f53402c = new IBinder.DeathRecipient() { // from class: yiw.1
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            yit.e("ClientManager", "BinderService binderDied enter");
            Iterator it = yiw.this.e.entrySet().iterator();
            while (it.hasNext()) {
                ClientToken clientToken = (ClientToken) ((Map.Entry) it.next()).getKey();
                if (!clientToken.asBinder().pingBinder()) {
                    yiw.this.a(clientToken);
                    it.remove();
                }
            }
        }
    };
    private ConcurrentHashMap<Integer, String> d = new ConcurrentHashMap<>();

    public yiw(ConcurrentHashMap<Integer, IBinder> concurrentHashMap) {
        this.f53400a = concurrentHashMap;
    }

    public void d(int i, ClientToken clientToken, String str) {
        if (clientToken != null && yiv.e(str) && yiv.c(i, str)) {
            this.e.put(clientToken, str);
        }
    }

    public IBinder.DeathRecipient a() {
        return this.f53402c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ClientToken clientToken) {
        String str = this.e.get(clientToken);
        for (IBinder iBinder : this.f53400a.values()) {
            if (iBinder instanceof ClientBinderDied) {
                ((ClientBinderDied) iBinder).handleClientBinderDied(str);
            }
        }
        clientToken.asBinder().unlinkToDeath(this.f53402c, 0);
    }

    public void b(int i, int i2, int i3) {
        if (!this.f53401b.containsKey(Integer.valueOf(i))) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap.put(Integer.valueOf(i2), Integer.valueOf(i3));
            Map<Integer, Integer> mapPutIfAbsent = this.f53401b.putIfAbsent(Integer.valueOf(i), concurrentHashMap);
            if (mapPutIfAbsent == null) {
                return;
            }
            mapPutIfAbsent.put(Integer.valueOf(i2), Integer.valueOf(i3));
            return;
        }
        Map<Integer, Integer> map = this.f53401b.get(Integer.valueOf(i));
        if (map != null) {
            map.put(Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public int e(int i, int i2) {
        Map<Integer, Integer> map;
        if (this.f53401b.containsKey(Integer.valueOf(i)) && (map = this.f53401b.get(Integer.valueOf(i))) != null) {
            return map.get(Integer.valueOf(i2)).intValue();
        }
        yit.e("ClientManager", "getSdkApiLevel default value");
        return 0;
    }

    @Override // com.huawei.wearengine.common.ApplicationIdManager
    public void setApplicationId(Integer num, String str) {
        this.d.put(num, str);
        yit.e("ClientManager", "set Application pid is " + num + " applicationId is " + str + " mapSize " + this.d.size());
    }

    @Override // com.huawei.wearengine.common.ApplicationIdManager
    public String getApplicationIdByPid(Integer num) {
        yit.e("ClientManager", "getApplication pid is " + num + " mapSize " + this.d.size());
        if (this.d.containsKey(num)) {
            return this.d.get(num);
        }
        return "";
    }
}
