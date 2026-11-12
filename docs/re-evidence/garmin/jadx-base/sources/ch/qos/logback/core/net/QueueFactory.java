package ch.qos.logback.core.net;

import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes7.dex */
public class QueueFactory {
    public <E> LinkedBlockingDeque<E> newLinkedBlockingDeque(int i14) {
        if (i14 < 1) {
            i14 = 1;
        }
        return new LinkedBlockingDeque<>(i14);
    }
}
