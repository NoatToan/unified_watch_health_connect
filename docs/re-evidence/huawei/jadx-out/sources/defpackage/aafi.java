package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class aafi implements ILoggerFactory {
    boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map<String, aafh> f167b = new HashMap();
    final LinkedBlockingQueue<aafd> d = new LinkedBlockingQueue<>();

    @Override // org.slf4j.ILoggerFactory
    public Logger getLogger(String str) {
        aafh aafhVar;
        synchronized (this) {
            aafhVar = this.f167b.get(str);
            if (aafhVar == null) {
                aafhVar = new aafh(str, this.d, this.e);
                this.f167b.put(str, aafhVar);
            }
        }
        return aafhVar;
    }

    public List<aafh> c() {
        return new ArrayList(this.f167b.values());
    }

    public LinkedBlockingQueue<aafd> e() {
        return this.d;
    }

    public void b() {
        this.e = true;
    }

    public void a() {
        this.f167b.clear();
        this.d.clear();
    }
}
