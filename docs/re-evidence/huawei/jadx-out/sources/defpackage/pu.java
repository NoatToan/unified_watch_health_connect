package defpackage;

import android.content.Context;
import com.apprichtap.haptic.sync.SyncCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class pu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f45886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f45887b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedHashMap<Integer, oz> f45888c = new LinkedHashMap<>();
    private int d;

    public void c() {
        synchronized (this) {
            for (Map.Entry<Integer, oz> entry : this.f45888c.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().stop();
                }
            }
        }
    }

    public void b() {
        synchronized (this) {
            for (Map.Entry<Integer, oz> entry : this.f45888c.entrySet()) {
                entry.getValue().stop();
                entry.getValue().release();
            }
            this.f45888c.clear();
        }
    }

    public int d(String str, int i, int i2, int i3, int i4, SyncCallback syncCallback) {
        synchronized (this) {
            try {
                if (32 > this.d) {
                    c();
                }
                int iD = d();
                oz ozVar = this.f45888c.get(Integer.valueOf(iD));
                if (ozVar == null) {
                    po.e.a("PlayerObjectPool", "PlayerObjectPool, playHaptic, null == player");
                    return -1;
                }
                ozVar.setDataSource(str, i3, i4, i, i2, syncCallback);
                ozVar.prepare();
                ozVar.start();
                return iD;
            } catch (Throwable th) {
                th.printStackTrace();
                return -1;
            }
        }
    }

    private void a() {
        synchronized (this) {
            po.e.d("PlayerObjectPool", "PlayerObjectPool shrink() mPlayers.size():" + this.f45888c.size() + ", MAX_SIZE:4");
            if (4 <= this.f45888c.size()) {
                if (po.b()) {
                    String str = "";
                    Iterator<Integer> it = this.f45888c.keySet().iterator();
                    while (it.hasNext()) {
                        str = str + it.next().intValue() + " ";
                    }
                    po.e.d("PlayerObjectPool", "PlayerObjectPool mPlayers keys before shrink:" + str);
                }
                ArrayList<Integer> arrayList = new ArrayList();
                for (Map.Entry<Integer, oz> entry : this.f45888c.entrySet()) {
                    if (!entry.getValue().isPlaying()) {
                        arrayList.add(entry.getKey());
                    }
                }
                for (Integer num : arrayList) {
                    po.e.d("PlayerObjectPool", "PlayerObjectPool will remove :" + num.intValue() + " as not playing!");
                    this.f45888c.get(num).release();
                    this.f45888c.remove(num);
                }
                int size = this.f45888c.size() - 3;
                if (size <= 0) {
                    po.e.d("PlayerObjectPool", "PlayerObjectPool, no need to shrink the playing ones!");
                    return;
                }
                ArrayList<Integer> arrayList2 = new ArrayList();
                for (Map.Entry<Integer, oz> entry2 : this.f45888c.entrySet()) {
                    entry2.getValue().stop();
                    entry2.getValue().release();
                    arrayList2.add(entry2.getKey());
                    size--;
                    if (size == 0) {
                        break;
                    }
                }
                for (Integer num2 : arrayList2) {
                    po.e.d("PlayerObjectPool", "PlayerObjectPool will remove :" + num2.intValue() + " as oversize!");
                    this.f45888c.remove(num2);
                }
                if (po.b()) {
                    String str2 = "";
                    Iterator<Integer> it2 = this.f45888c.keySet().iterator();
                    while (it2.hasNext()) {
                        str2 = str2 + it2.next().intValue() + " ";
                    }
                    po.e.d("PlayerObjectPool", "PlayerObjectPool mPlayers current keys after shrink:" + str2);
                }
            }
        }
    }

    private int d() {
        int iIncrementAndGet;
        synchronized (this) {
            a();
            iIncrementAndGet = this.f45887b.incrementAndGet() % Integer.MAX_VALUE;
            oz ozVarB = oz.b(this.f45886a, 2);
            if (ozVarB != null) {
                this.f45888c.put(Integer.valueOf(iIncrementAndGet), ozVarB);
            }
        }
        return iIncrementAndGet;
    }

    public pu(Context context, int i) {
        this.f45886a = context;
        this.d = i;
    }
}
