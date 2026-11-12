package s83;

import java.util.concurrent.atomic.AtomicLong;
import o83.m;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends AtomicLong implements j83.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f157950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f157951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f157952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2983a f157953d;

    /* JADX INFO: renamed from: s83.a$a, reason: collision with other inner class name */
    public interface InterfaceC2983a {
    }

    public a(InterfaceC2983a interfaceC2983a) {
        this.f157953d = interfaceC2983a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00b5 A[LOOP:1: B:14:0x0018->B:81:0x00b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x00c2  */
    public final void a() throws Throwable {
        m.a aVar;
        Object objPoll;
        AtomicLong atomicLong;
        synchronized (this) {
            try {
                if (this.f157950a) {
                    return;
                }
                boolean z14 = true;
                this.f157950a = true;
                boolean z15 = this.f157951b;
                long j8 = get();
                try {
                    InterfaceC2983a interfaceC2983a = this.f157953d;
                    while (true) {
                        int i14 = 0;
                        while (true) {
                            try {
                                if (j8 <= 0 && !z15) {
                                    break;
                                }
                                if (!z15) {
                                    aVar = (m.a) interfaceC2983a;
                                    objPoll = aVar.f130932e.poll();
                                    atomicLong = aVar.f130933f;
                                    if (atomicLong != null) {
                                        atomicLong.incrementAndGet();
                                    }
                                    if (objPoll != null) {
                                        break;
                                    }
                                    if (o83.e.a(aVar.f130934g, objPoll)) {
                                        return;
                                    }
                                    j8--;
                                    i14++;
                                } else {
                                    try {
                                        if (((m.a) interfaceC2983a).f130932e.peek() != null) {
                                            if (j8 == 0) {
                                                break;
                                            }
                                            try {
                                                aVar = (m.a) interfaceC2983a;
                                                objPoll = aVar.f130932e.poll();
                                                atomicLong = aVar.f130933f;
                                                if (atomicLong != null && objPoll != null) {
                                                    atomicLong.incrementAndGet();
                                                }
                                                if (objPoll != null) {
                                                    break;
                                                }
                                                try {
                                                    if (o83.e.a(aVar.f130934g, objPoll)) {
                                                        return;
                                                    }
                                                    j8--;
                                                    i14++;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    th = th;
                                                    z14 = false;
                                                    if (!z14) {
                                                        synchronized (this) {
                                                            this.f157950a = false;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        } else {
                                            Throwable th5 = this.f157952c;
                                            j83.f fVar = ((m.a) interfaceC2983a).f130934g;
                                            if (th5 != null) {
                                                fVar.onError(th5);
                                                return;
                                            } else {
                                                fVar.a();
                                                return;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        th = th;
                                        z14 = false;
                                        if (!z14) {
                                            synchronized (this) {
                                                this.f157950a = false;
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                if (!z14) {
                                    synchronized (this) {
                                        this.f157950a = false;
                                    }
                                }
                                throw th;
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        }
                        try {
                            synchronized (this) {
                                z15 = this.f157951b;
                                try {
                                    boolean z16 = ((m.a) interfaceC2983a).f130932e.peek() != null;
                                    if (get() != Long.MAX_VALUE) {
                                        long jAddAndGet = addAndGet(-i14);
                                        if ((jAddAndGet != 0 && z16) || (z15 && !z16)) {
                                            j8 = jAddAndGet;
                                        }
                                        this.f157950a = false;
                                        return;
                                    }
                                    if (!z16 && !z15) {
                                        this.f157950a = false;
                                        return;
                                    }
                                    j8 = Long.MAX_VALUE;
                                } catch (Throwable th8) {
                                    th = th8;
                                    throw th;
                                }
                            }
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    @Override // j83.g
    public final void b(long j8) throws Throwable {
        boolean z14;
        long j14;
        if (j8 == 0) {
            return;
        }
        while (true) {
            long j15 = get();
            boolean z15 = true;
            z14 = j15 == 0;
            if (j15 == Long.MAX_VALUE) {
                break;
            }
            if (j8 == Long.MAX_VALUE) {
                j14 = j8;
            } else {
                j14 = j15 <= Long.MAX_VALUE - j8 ? j15 + j8 : Long.MAX_VALUE;
                z15 = z14;
            }
            if (compareAndSet(j15, j14)) {
                z14 = z15;
                break;
            }
        }
        if (z14) {
            a();
        }
    }
}
