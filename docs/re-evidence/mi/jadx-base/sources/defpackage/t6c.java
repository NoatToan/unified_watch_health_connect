package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class t6c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f34364a = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34365b = 10000;
    public volatile boolean c;
    public final List<a> d;

    public interface a {
        void a();
    }

    public t6c(a aVar) {
        ArrayList arrayList = new ArrayList(1);
        this.d = arrayList;
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    public void a() {
        if (System.currentTimeMillis() - this.f34364a >= this.f34365b) {
            if (this.c) {
                this.c = false;
                jpe.h("RCCHeartbeatWatchDog", " receive client heart beat");
            } else {
                jpe.h("RCCHeartbeatWatchDog", " not receive client heart beat ");
                for (int i = 0; i < this.d.size(); i++) {
                    this.d.get(i).a();
                }
            }
        }
    }

    public void b() {
        this.c = true;
        this.f34364a = System.currentTimeMillis();
    }
}
