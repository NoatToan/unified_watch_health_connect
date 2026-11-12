package rk;

import ak.e;
import ak.j;
import ak.m;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseIntArray;
import bk.d;
import bk.g;
import bk.h;
import bk.l;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ck.k;
import com.dsi.ant.channel.AntCommandFailedException;

/* JADX INFO: loaded from: classes7.dex */
public class b extends rk.a {
    public int A;
    public ak.b B;
    public Integer C;
    public boolean D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f153034y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SparseIntArray f153035z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153036a;

        static {
            int[] iArr = new int[l.values().length];
            f153036a = iArr;
            try {
                iArr[l.CHANNEL_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f153036a[l.BROADCAST_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f153036a[l.ACKNOWLEDGED_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(int i14, int i15, int i16, int i17, int i18, rk.a.b bVar) {
        super(i14, i15, i18, new ak.b(0, i16, i17), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[Catch: AntCommandFailedException -> 0x0042, TryCatch #0 {AntCommandFailedException -> 0x0042, blocks: (B:3:0x0001, B:10:0x0013, B:12:0x0017, B:14:0x003c, B:18:0x0049, B:20:0x0054, B:25:0x0069, B:27:0x007c, B:23:0x0065, B:26:0x0079, B:17:0x0044, B:29:0x008a, B:31:0x0095, B:33:0x0098, B:35:0x009c), top: B:39:0x0001 }] */
    @Override // ok.e
    public final void a(l lVar, dk.a aVar) {
        try {
            int i14 = a.f153036a[lVar.ordinal()];
            if (i14 == 1) {
                e eVar = new g(aVar).f18440c;
                if (eVar == e.RX_SEARCH_TIMEOUT) {
                    int i15 = qk.b.f145071a;
                    return;
                } else {
                    if (eVar == e.CHANNEL_CLOSED) {
                        int i16 = qk.b.f145071a;
                        b();
                        this.f153028w.countDown();
                        return;
                    }
                    return;
                }
            }
            if ((i14 == 2 || i14 == 3) && !this.f153025t) {
                wj.a aVar2 = this.f132410o;
                aVar2.getClass();
                l lVar2 = l.CHANNEL_ID;
                Bundle bundle = new Bundle();
                dk.a aVarD = aVar2.f185705a.D(lVar2, bundle);
                wj.a.b(k.REQUEST_MESSAGE, bundle);
                this.B = ((h) bk.b.f(aVarD)).f18442b;
                bk.k aVar3 = lVar == l.ACKNOWLEDGED_DATA ? new bk.a(aVar) : new d(aVar);
                if (new ak.g(aVar3).b()) {
                    int i17 = new ak.g(aVar3).f3531b.f3563a;
                    m.a aVar4 = m.a.DBM;
                    if ((i17 == aVar4.f3569a ? aVar4 : m.a.UNKNOWN) == aVar4) {
                        this.C = Integer.valueOf(new ak.g(aVar3).f3531b.f3564b);
                    } else {
                        this.C = null;
                    }
                } else {
                    this.C = null;
                }
                b();
                z(this.B);
                this.f153028w.countDown();
            }
        } catch (AntCommandFailedException e4) {
            e4.toString();
            int i18 = qk.b.f145071a;
            b();
            this.D = true;
            this.f153028w.countDown();
        }
    }

    @Override // ok.e
    public final void c() throws RemoteException {
        boolean z14;
        j jVar;
        ak.b bVar;
        this.D = false;
        this.f153035z = new SparseIntArray();
        this.f153034y = SystemClock.elapsedRealtime() + AbstractComponentTracker.LINGERING_TIMEOUT;
        if (v()) {
            while (!this.f153025t) {
                try {
                    this.B = null;
                    this.C = null;
                    long jElapsedRealtime = this.f153034y - SystemClock.elapsedRealtime();
                    if (jElapsedRealtime < 1000) {
                        w(rk.a.EnumC2896a.SEARCH_TIMEOUT);
                        if (this.D) {
                            return;
                        }
                        try {
                            this.f132410o.d(0);
                            return;
                        } catch (AntCommandFailedException e4) {
                            e4.toString();
                            int i14 = qk.b.f145071a;
                            throw new RemoteException();
                        }
                    }
                    if (jElapsedRealtime > 7500) {
                        jVar = j.TEN_SECONDS;
                    } else if (jElapsedRealtime > 5000) {
                        jVar = j.SEVEN_AND_A_HALF_SECONDS;
                    } else {
                        jVar = jElapsedRealtime > 2500 ? j.FIVE_SECONDS : j.TWO_AND_A_HALF_SECONDS;
                    }
                    e();
                    if (!y(jVar)) {
                        if (this.D) {
                            return;
                        }
                        try {
                            this.f132410o.d(0);
                            return;
                        } catch (AntCommandFailedException e14) {
                            e14.toString();
                            int i15 = qk.b.f145071a;
                            throw new RemoteException();
                        }
                    }
                    try {
                        if (!this.f153025t) {
                            this.f153028w.await();
                        }
                        if (this.f153025t || this.D || (bVar = this.B) == null) {
                            break;
                            break;
                            break;
                        } else {
                            x(rk.a.EnumC2896a.FOUND_DEVICE, bVar, this.C, false);
                            t();
                        }
                    } catch (InterruptedException unused) {
                        b();
                        z14 = true;
                    }
                } catch (Throwable th3) {
                    if (!this.D) {
                        try {
                            this.f132410o.d(0);
                        } catch (AntCommandFailedException e15) {
                            e15.toString();
                            int i16 = qk.b.f145071a;
                            throw new RemoteException();
                        }
                    }
                    throw th3;
                }
            }
            z14 = false;
            if (!this.D) {
                try {
                    this.f132410o.d(0);
                } catch (AntCommandFailedException e16) {
                    e16.toString();
                    int i17 = qk.b.f145071a;
                    throw new RemoteException();
                }
            }
            if (this.f153025t || this.B == null) {
                try {
                    wj.a aVar = this.f132410o;
                    aVar.getClass();
                    Bundle bundle = new Bundle();
                    aVar.f185705a.u(bundle);
                    wj.a.b(k.CLOSE_CHANNEL, bundle);
                } catch (AntCommandFailedException e17) {
                    if (e17.getFailureReason() != wj.c.INVALID_REQUEST) {
                        e17.toString();
                        int i18 = qk.b.f145071a;
                    }
                }
            }
            if (this.D) {
                throw new RemoteException();
            }
            if (this.f153025t) {
                return;
            }
            if (z14) {
                w(rk.a.EnumC2896a.INTERRUPTED);
            } else if (this.B == null) {
                w(rk.a.EnumC2896a.SEARCH_TIMEOUT);
            }
        }
    }

    @Override // ok.e
    public final String f() {
        return "Scan Search Controller";
    }

    public final void z(ak.b bVar) {
        int i14;
        ak.b bVar2;
        SparseIntArray sparseIntArray = this.f153035z;
        int i15 = bVar.f3497a;
        int i16 = sparseIntArray.get(i15, -1);
        SparseIntArray sparseIntArray2 = this.f153035z;
        if (i16 == -1) {
            sparseIntArray2.put(i15, 1);
            if (this.f153035z.size() <= 4) {
                wj.a aVar = this.f132410o;
                int size = this.f153035z.size() - 1;
                aVar.getClass();
                Bundle bundle = new Bundle();
                aVar.f185705a.h(bVar, size, bundle);
                wj.a.b(k.ADD_CHANNEL_ID_TO_LIST, bundle);
                this.f132410o.d(this.f153035z.size());
                return;
            }
            return;
        }
        int i17 = i16 + 1;
        sparseIntArray2.put(i15, i17);
        if (this.f153035z.size() <= 4 || i17 != (i14 = this.A + 1)) {
            return;
        }
        this.A = i14;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int size2 = this.f153035z.size();
            bVar2 = this.f153024s;
            if (i18 >= size2 || i19 >= 4) {
                break;
            }
            if (this.f153035z.valueAt(i18) >= this.A) {
                wj.a aVar2 = this.f132410o;
                ak.b bVar3 = new ak.b(this.f153035z.keyAt(i18), bVar2.f3499c, bVar2.f3500d);
                aVar2.getClass();
                Bundle bundle2 = new Bundle();
                aVar2.f185705a.h(bVar3, i19, bundle2);
                wj.a.b(k.ADD_CHANNEL_ID_TO_LIST, bundle2);
                i19++;
            }
            i18++;
        }
        if (i19 < 4) {
            this.A--;
            for (int i24 = 0; i24 < this.f153035z.size() && i19 < 4; i24++) {
                if (this.f153035z.valueAt(i24) == this.A) {
                    wj.a aVar3 = this.f132410o;
                    ak.b bVar4 = new ak.b(this.f153035z.keyAt(i24), bVar2.f3499c, bVar2.f3500d);
                    aVar3.getClass();
                    Bundle bundle3 = new Bundle();
                    aVar3.f185705a.h(bVar4, i19, bundle3);
                    wj.a.b(k.ADD_CHANNEL_ID_TO_LIST, bundle3);
                    i19++;
                }
            }
        }
    }
}
