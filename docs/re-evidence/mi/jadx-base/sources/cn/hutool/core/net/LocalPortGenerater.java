package cn.hutool.core.net;

import defpackage.sjg;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class LocalPortGenerater implements Serializable {
    private static final long serialVersionUID = 1;
    private final AtomicInteger alternativePort;

    public LocalPortGenerater(int i) {
        this.alternativePort = new AtomicInteger(i);
    }

    public int generate() {
        int iIncrementAndGet = this.alternativePort.get();
        while (!sjg.e(iIncrementAndGet)) {
            iIncrementAndGet = this.alternativePort.incrementAndGet();
        }
        return iIncrementAndGet;
    }
}
