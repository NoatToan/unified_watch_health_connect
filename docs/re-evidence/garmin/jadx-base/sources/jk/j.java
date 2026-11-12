package jk;

import android.os.RemoteException;
import com.dsi.ant.channel.AntCommandFailedException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j extends ok.e implements pk.b.InterfaceC2618b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f99064l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public GregorianCalendar f99069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f99070r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f99072t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f99073u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f99074v;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f99063k = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Exchanger<u> f99065m = new Exchanger<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Exchanger<i> f99066n = new Exchanger<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Semaphore f99067o = new Semaphore(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f99068p = h.NOT_CONNECTED;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f99071s = 2000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f99075w = 57;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f99076x = 4096;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public byte f99077y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f99078z = new b();

    public class a implements k {
        public a() {
        }

        @Override // jk.j.k
        public final void a(h hVar, g gVar) {
            j jVar = j.this;
            jVar.f99068p = hVar;
            jVar.f99064l.a(hVar, gVar);
        }
    }

    public class b implements u {
        public b() {
        }

        @Override // jk.u
        public final i run() {
            j jVar = j.this;
            return j.s(jVar, new jk.d(jVar.f99063k, 0, 0, 0, jVar.f99076x, jVar.f99075w), null);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f99081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f99082b;
    }

    public enum d {
        SUCCESS,
        SUCCESS_NO_RESPONSE,
        FAIL_COMMAND_NOT_SENT,
        FAIL_RESPONSE_DOWNLOAD_ERROR,
        FAIL_COMMAND_FAILURE,
        FAIL_COMMAND_REJECTED,
        FAIL_COMMAND_NOT_SUPPORTED,
        FAIL_OTHER
    }

    public static class e extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f99092c;

        public e(c cVar) {
            d dVar = cVar.f99081a;
            this.f99081a = dVar;
            byte[] bArr = cVar.f99082b;
            this.f99082b = bArr;
            if (dVar != d.SUCCESS) {
                return;
            }
            byte b14 = bArr[8];
            ik.a.e(9, bArr);
            this.f99092c = ik.a.d(12, this.f99082b);
        }
    }

    public enum f {
        SUCCESS,
        FAIL_NO_RESPONSE,
        FAIL_CRC_ERROR,
        FAIL_INVALID_RESPONSE,
        FAIL_REJECTED_FILE_DOES_NOT_EXIST,
        FAIL_REJECTED_FILE_NOT_READABLE,
        FAIL_REJECTED_NOT_READY,
        FAIL_REJECTED_INVALID_REQUEST,
        FAIL_REJECTED_INCORRECT_CRC,
        FAIL_DEVICE_TRANSMISSION_LOST,
        FAIL_OTHER
    }

    public enum g {
        CONNECTION_REQUESTED,
        LINK_START,
        LINK_PASS,
        AUTHENTICATION_START,
        /* JADX INFO: Fake field, exist only in values array */
        AUTHENTICATE_SERIAL_PASS,
        AUTHENTICATE_PASS,
        AUTHENTICATE_REJECT,
        AUTHENTICATE_REJECT_BAD_PASSKEY,
        AUTHENTICATE_REJECT_PAIRING,
        AUTHENTICATE_FAIL_NO_RESPONSE,
        AUTHENTICATE_FAIL_BAD_RESPONSE,
        AUTHENTICATE_BEACON_FOUND,
        DOWNLOAD_START,
        DOWNLOAD_INITIAL,
        DOWNLOAD_RESUME,
        DOWNLOAD_FINISHED,
        UPLOAD_START,
        UPLOAD_FINISHED,
        /* JADX INFO: Fake field, exist only in values array */
        ERASE_FINISHED,
        DISCONNECT_REQUESTED,
        DISCONNECT_PASS,
        CONNECTION_LOST,
        TASK_INTERRUPTED,
        TASK_CRASH,
        TASK_TIMEOUT
    }

    public enum h {
        LINK_IDLE,
        LINK_CONNECTING,
        AUTH_IDLE,
        AUTH_REQUESTING_SERIAL,
        AUTH_REQUESTING_PASSTHROUGH,
        AUTH_REQUESTING_PASSKEY,
        AUTH_WAITING_FOR_PAIRING,
        TRANSPORT_IDLE,
        TRANSPORT_DOWNLOADING,
        TRANSPORT_UPLOADING,
        TRANSPORT_ERASING,
        DISCONNECTING,
        SEARCHING,
        NOT_CONNECTED,
        DEAD
    }

    public enum i {
        SUCCESS,
        FAIL_REQUEST_IN_PROGRESS,
        FAIL_WRONG_ANTFS_STATE,
        FAIL_AUTHENTICATION_REJECTED,
        FAIL_DEVICE_TRANSMISSION_LOST,
        FAIL_OTHER_DEVICE_COMMUNICATION_ERROR,
        FAIL_EXECUTOR_CANCELLED_TASK,
        FAIL_NOT_SUPPORTED,
        /* JADX INFO: Fake field, exist only in values array */
        FAIL_DEVICE_NOT_READY,
        /* JADX INFO: Fake field, exist only in values array */
        FAIL_ERASE,
        /* JADX INFO: Fake field, exist only in values array */
        FAIL_ERASE_NOT_READY,
        /* JADX INFO: Fake field, exist only in values array */
        FAIL_ERASE_BAD_RESPONSE,
        /* JADX INFO: Fake field, exist only in values array */
        FAIL_TIMEOUT
    }

    /* JADX INFO: renamed from: jk.j$j, reason: collision with other inner class name */
    public enum EnumC1907j {
        SUCCESS,
        FAIL_NO_RESPONSE,
        FAIL_INVALID_RESPONSE,
        FAIL_UPLOAD_NOT_ENABLED,
        FAIL_REJECTED_FILE_DOES_NOT_EXIST,
        FAIL_REJECTED_FILE_NOT_WRITEABLE,
        FAIL_REJECTED_NOT_ENOUGH_SPACE,
        FAIL_REJECTED_INVALID_REQUEST,
        FAIL_REJECTED_NOT_READY,
        FAIL_REJECTED_OFFSET_OUT_OF_RANGE,
        FAIL_REJECTED_BAD_CRC,
        FAIL_TOO_MANY_RETRIES,
        FAIL_OTHER
    }

    public interface k {
        void a(h hVar, g gVar);
    }

    public interface l {
    }

    public j(k kVar, long j8, int i14) {
        this.f99064l = kVar;
        this.f99072t = j8;
        this.f99074v = i14;
    }

    public static i s(j jVar, p pVar, Long l14) {
        if (pVar.s(jVar.f99068p)) {
            jVar.r(pVar, l14);
            return pVar.f99180k;
        }
        Objects.toString(jVar.f99068p);
        int i14 = qk.b.f145071a;
        return i.FAIL_WRONG_ANTFS_STATE;
    }

    @Override // ok.e
    public final void a(bk.l lVar, dk.a aVar) {
        if (lVar == bk.l.CHANNEL_EVENT && new bk.g(aVar).f18440c == ak.e.CHANNEL_CLOSED) {
            this.f99063k.a(h.NOT_CONNECTED, g.CONNECTION_LOST);
        }
    }

    @Override // ok.e
    public final void c() throws RemoteException {
        i iVarRun;
        b bVar = this.f99078z;
        a aVar = this.f99063k;
        e();
        while (true) {
            try {
                ak.c cVarD = this.f132442j.d();
                if (cVarD != ak.c.TRACKING && cVarD != ak.c.SEARCHING) {
                    h hVar = this.f99068p;
                    h hVar2 = h.NOT_CONNECTED;
                    if (hVar != hVar2) {
                        aVar.a(hVar2, g.CONNECTION_LOST);
                    }
                }
                RemoteException e4 = null;
                try {
                    u uVarExchange = this.f99065m.exchange(null, this.f99071s, TimeUnit.MILLISECONDS);
                    if (uVarExchange == null) {
                        if (this.f99068p != h.NOT_CONNECTED) {
                            bVar.run();
                        }
                        aVar.a(h.DEAD, g.TASK_INTERRUPTED);
                        return;
                    }
                    try {
                        this.f99069q = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
                        iVarRun = uVarExchange.run();
                        Math.ceil((new Date().getTime() - this.f99069q.getTime().getTime()) / 1000.0d);
                    } catch (RemoteException e14) {
                        e4 = e14;
                        int i14 = qk.b.f145071a;
                        aVar.a(h.DEAD, g.TASK_CRASH);
                        iVarRun = i.FAIL_OTHER_DEVICE_COMMUNICATION_ERROR;
                    }
                    boolean z14 = false;
                    boolean z15 = false;
                    while (!z14) {
                        try {
                            this.f99066n.exchange(iVarRun);
                            z14 = true;
                        } catch (InterruptedException unused) {
                            z15 = true;
                        }
                    }
                    if (z15) {
                        Thread.currentThread().interrupt();
                    }
                    if (e4 != null) {
                        throw e4;
                    }
                    boolean zInterrupted = Thread.interrupted();
                    h hVar3 = this.f99068p;
                    if (zInterrupted) {
                        if (hVar3 != h.NOT_CONNECTED) {
                            bVar.run();
                        }
                        aVar.a(h.DEAD, g.TASK_INTERRUPTED);
                        return;
                    } else if (hVar3 == h.DEAD) {
                        return;
                    }
                } catch (InterruptedException unused2) {
                    if (this.f99068p != h.NOT_CONNECTED) {
                        bVar.run();
                    }
                    aVar.a(h.DEAD, g.TASK_INTERRUPTED);
                    return;
                } catch (TimeoutException unused3) {
                    r(new pk.b(r.f99223a, this, null), null);
                }
            } catch (AntCommandFailedException e15) {
                e15.toString();
                int i15 = qk.b.f145071a;
                aVar.a(h.DEAD, g.TASK_CRASH);
                throw new RemoteException();
            }
        }
    }

    @Override // ok.e
    public final String f() {
        return "AntFsHostSession";
    }

    @Override // ok.e
    public final void i() {
    }

    @Override // ok.e
    public final boolean j() {
        return true;
    }

    @Override // ok.e
    public final void n() {
    }

    public final i t(u uVar) {
        Semaphore semaphore = this.f99067o;
        if (!semaphore.tryAcquire()) {
            return i.FAIL_REQUEST_IN_PROGRESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() + 1000;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        while (!z15) {
            try {
                try {
                    this.f99065m.exchange(uVar, Math.max(jCurrentTimeMillis - System.currentTimeMillis(), 0L), TimeUnit.MILLISECONDS);
                    z15 = true;
                } catch (InterruptedException unused) {
                    z16 = true;
                } catch (TimeoutException unused2) {
                    i iVar = i.FAIL_REQUEST_IN_PROGRESS;
                    if (z16) {
                        Thread.currentThread().interrupt();
                    }
                    semaphore.release();
                    return iVar;
                }
            } catch (Throwable th3) {
                if (z16) {
                    Thread.currentThread().interrupt();
                }
                semaphore.release();
                throw th3;
            }
        }
        i iVarExchange = null;
        while (!z14) {
            try {
                iVarExchange = this.f99066n.exchange(null);
                z14 = true;
            } catch (InterruptedException unused3) {
                z16 = true;
            }
        }
        if (z16) {
            Thread.currentThread().interrupt();
        }
        semaphore.release();
        return iVarExchange;
    }

    public final c u(byte b14, byte[] bArr, boolean z14) {
        byte b15 = this.f99077y;
        this.f99077y = (byte) (b15 + 1);
        jk.c cVar = new jk.c(this.f99064l, b15, b14, bArr, true, z14);
        t(new jk.i(this, cVar, null));
        return cVar.f99000m;
    }
}
