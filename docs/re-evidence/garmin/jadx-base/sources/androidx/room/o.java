package androidx.room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class o extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
    public o(Object obj) {
        super(0, obj, m.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        m mVar = (m) this.receiver;
        synchronized (mVar.f10892n) {
            try {
                r rVar = mVar.f10891m;
                if (rVar != null) {
                    ReentrantLock reentrantLock = mVar.f10885g;
                    reentrantLock.lock();
                    try {
                        List listB1 = p13.h0.b1(mVar.f10884f.keySet());
                        reentrantLock.unlock();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listB1) {
                            m.b bVar = (m.b) obj;
                            bVar.getClass();
                            if (!(bVar instanceof r.b)) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            rVar.a();
                        }
                    } catch (Throwable th3) {
                        reentrantLock.unlock();
                        throw th3;
                    }
                }
                s sVar = mVar.f10883e.f10982h;
                ReentrantLock reentrantLock2 = sVar.f10945a;
                reentrantLock2.lock();
                try {
                    boolean[] zArr = sVar.f10947c;
                    Arrays.fill(zArr, 0, zArr.length, false);
                    sVar.f10948d = true;
                    Unit unit = Unit.INSTANCE;
                    reentrantLock2.unlock();
                } catch (Throwable th4) {
                    reentrantLock2.unlock();
                    throw th4;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return Unit.INSTANCE;
    }
}
