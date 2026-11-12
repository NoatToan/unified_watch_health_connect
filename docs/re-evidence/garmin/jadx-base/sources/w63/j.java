package w63;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lw63/j;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "readWrite", "<init>", "(Z)V", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class j implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f183373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f183374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f183375c = new ReentrantLock();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw63/j$a;", "Lw63/g0;", "Lw63/j;", "fileHandle", "", ModelSourceWrapper.POSITION, "<init>", "(Lw63/j;J)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f183376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f183377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f183378c;

        public a(j jVar, long j8) {
            jVar.getClass();
            this.f183376a = jVar;
            this.f183377b = j8;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f183378c) {
                return;
            }
            this.f183378c = true;
            j jVar = this.f183376a;
            ReentrantLock reentrantLock = jVar.f183375c;
            reentrantLock.lock();
            try {
                int i14 = jVar.f183374b - 1;
                jVar.f183374b = i14;
                if (i14 == 0 && jVar.f183373a) {
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    jVar.a();
                    return;
                }
                reentrantLock.unlock();
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }

        @Override // w63.g0
        public final long read(e eVar, long j8) {
            long j14;
            long j15;
            eVar.getClass();
            if (this.f183378c) {
                vb.h.z("closed");
                return 0L;
            }
            long j16 = this.f183377b;
            if (j8 < 0) {
                vb.h.x(org.apache.commons.lang3.e.e(j8, "byteCount < 0: "));
                return 0L;
            }
            long j17 = j8 + j16;
            long j18 = j16;
            while (true) {
                if (j18 < j17) {
                    c0 c0VarC = eVar.C(1);
                    byte[] bArr = c0VarC.f183336a;
                    int i14 = c0VarC.f183338c;
                    j14 = -1;
                    long j19 = j17;
                    int iC = this.f183376a.c(i14, (int) Math.min(j17 - j18, 8192 - i14), j18, bArr);
                    if (iC == -1) {
                        if (c0VarC.f183337b == c0VarC.f183338c) {
                            eVar.f183348a = c0VarC.a();
                            d0.a(c0VarC);
                        }
                        if (j16 == j18) {
                            j15 = -1;
                            break;
                        }
                    } else {
                        c0VarC.f183338c += iC;
                        long j24 = iC;
                        j18 += j24;
                        eVar.f183349b += j24;
                        j17 = j19;
                    }
                } else {
                    j14 = -1;
                }
                j15 = j18 - j16;
                break;
            }
            if (j15 != j14) {
                this.f183377b += j15;
            }
            return j15;
        }

        @Override // w63.g0
        public final h0 timeout() {
            return h0.NONE;
        }
    }

    public j(boolean z14) {
    }

    public abstract void a();

    public abstract int c(int i14, int i15, long j8, byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f183375c;
        reentrantLock.lock();
        try {
            if (this.f183373a) {
                reentrantLock.unlock();
                return;
            }
            this.f183373a = true;
            if (this.f183374b != 0) {
                reentrantLock.unlock();
                return;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            a();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public abstract long e();

    public final a f(long j8) {
        ReentrantLock reentrantLock = this.f183375c;
        reentrantLock.lock();
        try {
            if (this.f183373a) {
                throw new IllegalStateException("closed");
            }
            this.f183374b++;
            reentrantLock.unlock();
            return new a(this, j8);
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.f183375c;
        reentrantLock.lock();
        try {
            if (this.f183373a) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return e();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
