package in2;

import com.garmin.feature.garminpay.devicedrivensocket.NativeDeviceDrivenSocketApi;
import java.util.concurrent.ConcurrentHashMap;
import jn2.m;
import jn2.u;
import o13.l;
import o13.p;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import v.h;
import wr2.n;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lin2/f;", "Lin2/a;", "", "unitId", "<init>", "(J)V", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements in2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f94576c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap<Long, Integer> f94577d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f94579b = KoinJavaComponent.inject$default(in2.a.class, new TypeQualifier(s0.f105811a.b(NativeDeviceDrivenSocketApi.class)), null, 4, null);

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"in2/f$a", "Lhs2/e;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements hs2.e {
        public a() {
        }

        @Override // hs2.e
        public final void b(hs2.a aVar, m mVar) {
        }

        @Override // hs2.e
        public final void c(long j8) {
            Integer numRemove;
            f fVar = f.this;
            if (fVar.f94578a == j8 && (numRemove = f.f94577d.remove(Long.valueOf(j8))) != null) {
                fVar.a().close(numRemove.intValue());
            }
        }

        @Override // hs2.e
        public final void d(long j8, hs2.e.a aVar) {
            aVar.getClass();
        }
    }

    public f(long j8) {
        this.f94578a = j8;
        u uVar = u.f99680a;
        a aVar = new a();
        uVar.getClass();
        u.f99682c.add(aVar);
    }

    public final in2.a a() {
        return (in2.a) this.f94579b.getValue();
    }

    @Override // in2.a
    public final int close(int i14) {
        long j8 = this.f94578a;
        Long lValueOf = Long.valueOf(j8);
        ConcurrentHashMap<Long, Integer> concurrentHashMap = f94577d;
        Integer num = concurrentHashMap.get(lValueOf);
        if (num == null || num.intValue() != i14) {
            return -1;
        }
        int iClose = a().close(i14);
        concurrentHashMap.remove(Long.valueOf(j8));
        return iClose;
    }

    @Override // in2.a
    public final int connectByName(int i14, int i15, int i16, int i17, String str, String str2, byte[] bArr) {
        Integer num = f94577d.get(Long.valueOf(this.f94578a));
        if (num == null || num.intValue() != i14) {
            return -1;
        }
        in2.b.f94555a.getClass();
        if (in2.b.f94556b.contains(new p(str, str2))) {
            return a().connectByName(i14, i15, i16, i17, str, str2, bArr);
        }
        return -1;
    }

    @Override // in2.a
    public final int read(int i14, byte[] bArr) {
        Integer num = f94577d.get(Long.valueOf(this.f94578a));
        if (num == null || num.intValue() != i14) {
            return -1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i15 = a().read(i14, bArr);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Logger loggerA = f94576c.f94581a.a();
        StringBuilder sbW = h.w(bArr.length, "read() took ", " ms, allocated a buffer of ", jCurrentTimeMillis2 - jCurrentTimeMillis);
        sbW.append(" bytes, and returned ");
        sbW.append(i15);
        sbW.append(".");
        loggerA.debug(sbW.toString());
        return i15;
    }

    @Override // in2.a
    public final int recv(int i14, byte[] bArr, int i15) {
        Integer num = f94577d.get(Long.valueOf(this.f94578a));
        if (num == null || num.intValue() != i14) {
            return -1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iRecv = a().recv(i14, bArr, i15);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Logger loggerA = f94576c.f94581a.a();
        StringBuilder sbW = h.w(bArr.length, "recv() took ", " ms, allocated a buffer of ", jCurrentTimeMillis2 - jCurrentTimeMillis);
        sbW.append(" bytes, and returned ");
        sbW.append(iRecv);
        sbW.append(".");
        loggerA.debug(sbW.toString());
        return iRecv;
    }

    @Override // in2.a
    public final int select(int i14) {
        Integer num = f94577d.get(Long.valueOf(this.f94578a));
        if (num != null && num.intValue() == i14) {
            return a().select(i14);
        }
        return -1;
    }

    @Override // in2.a
    public final int send(int i14, byte[] bArr, int i15) {
        Integer num = f94577d.get(Long.valueOf(this.f94578a));
        if (num == null || num.intValue() != i14) {
            return -1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iSend = a().send(i14, bArr, i15);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Logger loggerA = f94576c.f94581a.a();
        StringBuilder sbW = h.w(bArr.length, "send() took ", " ms, allocated a buffer of ", jCurrentTimeMillis2 - jCurrentTimeMillis);
        sbW.append(" bytes, and returned ");
        sbW.append(iSend);
        sbW.append(".");
        loggerA.debug(sbW.toString());
        return iSend;
    }

    @Override // in2.a
    public final int setRecvTimeout(int i14, int i15) {
        Integer num = f94577d.get(Long.valueOf(this.f94578a));
        if (num != null && num.intValue() == i14) {
            return a().setRecvTimeout(i14, i15);
        }
        return -1;
    }

    @Override // in2.a
    public final int socket(int i14, int i15, int i16) {
        long j8 = this.f94578a;
        Long lValueOf = Long.valueOf(j8);
        ConcurrentHashMap<Long, Integer> concurrentHashMap = f94577d;
        Integer num = concurrentHashMap.get(lValueOf);
        if (num != null) {
            int iIntValue = num.intValue();
            f94576c.f94581a.a().debug("There was already a socket " + iIntValue + " for device " + j8 + ", close it.");
            int iClose = close(iIntValue);
            if (iClose != 0) {
                return iClose;
            }
            concurrentHashMap.remove(Long.valueOf(j8));
        }
        int iSocket = a().socket(i14, i15, i16);
        if (iSocket != -1) {
            concurrentHashMap.put(Long.valueOf(j8), Integer.valueOf(iSocket));
        }
        return iSocket;
    }

    @Override // in2.a
    public final int write(int i14, byte[] bArr) {
        Integer num = f94577d.get(Long.valueOf(this.f94578a));
        if (num == null || num.intValue() != i14) {
            return -1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iWrite = a().write(i14, bArr);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Logger loggerA = f94576c.f94581a.a();
        StringBuilder sbW = h.w(bArr.length, "write() took ", " ms, allocated a buffer of ", jCurrentTimeMillis2 - jCurrentTimeMillis);
        sbW.append(" bytes, and returned ");
        sbW.append(iWrite);
        sbW.append(".");
        loggerA.debug(sbW.toString());
        return iWrite;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lin2/f$b;", "", "<init>", "()V", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "socketDeviceMap", "Ljava/util/concurrent/ConcurrentHashMap;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wr2.m f94581a;

        private b() {
            n nVar = c.f94557b.f94558a;
            nVar.getClass();
            this.f94581a = new wr2.m(nVar, "SecureDeviceDrivenSocketApi");
        }

        public /* synthetic */ b(j jVar) {
            this();
        }
    }
}
