package defpackage;

import com.xiaomi.fitness.sync.model.EventRecurrence;

/* JADX INFO: loaded from: classes4.dex */
public class su5 implements tpo<hpf> {
    private int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return EventRecurrence.TH;
        }
        return iMin < 33554432 ? 2097152 : 4194304;
    }

    @Override // defpackage.tpo
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public hpf get() {
        int iB = b();
        return new hpf(iB, Integer.MAX_VALUE, iB, Integer.MAX_VALUE, iB / 8);
    }
}
