package defpackage;

import com.xiaomi.fitness.device.contact.remote.ContactCallTask;
import com.xiaomi.fitness.device.contact.remote.ContactTaskQueue;

/* JADX INFO: loaded from: classes8.dex */
public class kg4 extends gj1 {
    public kg4(Object[] objArr) {
        super(objArr);
    }

    @Override // defpackage.gj1
    public Object d(Object[] objArr) {
        Object[] objArr2 = this.f19043a;
        return xj4.c(ContactTaskQueue.enqueue_aroundBody0((ContactTaskQueue) objArr2[0], (ContactCallTask) objArr2[1], (nrd) objArr2[2]));
    }
}
