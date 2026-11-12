package yj;

import ak.j;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import bk.l;
import ck.f;
import ck.g;
import ck.m;
import ck.n;
import ck.o;
import ck.p;
import wj.h;
import wj.i;

/* JADX INFO: loaded from: classes7.dex */
public class a implements xj.a, Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3700a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f197438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f197439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f197440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f197441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HandlerThread f197442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f197443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f197444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yj.d f197445h;

    /* JADX INFO: renamed from: yj.a$a, reason: collision with other inner class name */
    public static class C3700a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new a(yj.d.a.k0(parcel.readStrongBinder()), false);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f197446a;

        static {
            int[] iArr = new int[e.values().length];
            f197446a = iArr;
            try {
                iArr[e.RX_ANT_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f197446a[e.CHANNEL_DEATH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f197446a[e.BURST_STATE_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f197446a[e.LIB_CONFIG_CHANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f197446a[e.BACKGROUND_SCAN_STATE_CHANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f197446a[e.EVENT_BUFFER_SETTINGS_CHANGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f197446a[e.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(-1),
        SET_LIB_CONFIG(1),
        SET_EVENT_BUFFER_SETTINGS(2),
        /* JADX INFO: Fake field, exist only in values array */
        GET_BURST_STATE(101),
        /* JADX INFO: Fake field, exist only in values array */
        GET_LIB_CONFIG(102),
        /* JADX INFO: Fake field, exist only in values array */
        GET_BACKGROUND_SCAN_STATE(103),
        /* JADX INFO: Fake field, exist only in values array */
        GET_EVENT_BUFFER_SETTINGS(104);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f197450a;

        static {
            values();
        }

        c(int i14) {
            this.f197450a = i14;
        }
    }

    public static final class d extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f197451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f197452b;

        public d(a aVar, Looper looper) {
            super(looper);
            this.f197451a = new Object();
            this.f197452b = aVar;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            synchronized (this.f197451a) {
                try {
                    if (this.f197452b == null) {
                        return;
                    }
                    int i14 = message.what;
                    e eVar = e.UNKNOWN;
                    int i15 = 0;
                    while (true) {
                        e[] eVarArr = e.f197460i;
                        if (i15 >= eVarArr.length) {
                            break;
                        }
                        e eVar2 = eVarArr[i15];
                        if (i14 == eVar2.f197462a) {
                            eVar = eVar2;
                            break;
                        }
                        i15++;
                    }
                    switch (b.f197446a[eVar.ordinal()]) {
                        case 1:
                            Bundle data = message.getData();
                            data.setClassLoader(dk.a.class.getClassLoader());
                            dk.a aVar = (dk.a) data.getParcelable("com.dsi.ant.channel.data.antmessageparcel");
                            l lVar = l.BROADCAST_DATA;
                            l lVarA = l.a(aVar.f60155a, aVar.f60156b);
                            if (lVarA != l.OTHER) {
                                this.f197452b.I(lVarA, aVar);
                            }
                            return;
                        case 2:
                            this.f197452b.H();
                            return;
                        case 3:
                            Bundle data2 = message.getData();
                            data2.setClassLoader(wj.e.class.getClassLoader());
                            if (((wj.e) data2.getParcelable("com.dsi.ant.channel.data.burststate")) != null) {
                                a.G(this.f197452b);
                            }
                            return;
                        case 4:
                            Bundle data3 = message.getData();
                            data3.setClassLoader(ak.i.class.getClassLoader());
                            if (((ak.i) data3.getParcelable("com.dsi.ant.channel.data.libconfig")) != null) {
                                synchronized (this.f197452b.f197440c) {
                                    break;
                                }
                            }
                            return;
                        case 5:
                            Bundle data4 = message.getData();
                            data4.setClassLoader(wj.d.class.getClassLoader());
                            if (((wj.d) data4.getParcelable("com.dsi.ant.channel.data.backgroundscanstate")) != null) {
                                synchronized (this.f197452b.f197440c) {
                                    break;
                                }
                            }
                            return;
                        case 6:
                            Bundle data5 = message.getData();
                            data5.setClassLoader(h.class.getClassLoader());
                            if (((h) data5.getParcelable("com.dsi.ant.channel.data.eventbuffersettings")) != null) {
                                synchronized (this.f197452b.f197440c) {
                                    break;
                                }
                            }
                            return;
                        default:
                            return;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public enum e {
        UNKNOWN(-1),
        RX_ANT_MESSAGE(1),
        CHANNEL_DEATH(2),
        BURST_STATE_CHANGE(101),
        LIB_CONFIG_CHANGE(102),
        BACKGROUND_SCAN_STATE_CHANGE(103),
        EVENT_BUFFER_SETTINGS_CHANGE(104);


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final e[] f197460i = values();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f197462a;

        e(int i14) {
            this.f197462a = i14;
        }
    }

    public a(yj.d dVar, boolean z14) {
        this.f197439b = new Object();
        this.f197440c = new Object();
        Object obj = new Object();
        this.f197441d = obj;
        this.f197442e = null;
        this.f197443f = null;
        this.f197445h = dVar;
        synchronized (obj) {
            try {
                if (this.f197442e == null) {
                    HandlerThread handlerThread = new HandlerThread("a".concat(" Receive thread"));
                    this.f197442e = handlerThread;
                    handlerThread.start();
                    this.f197444g = new d(this, this.f197442e.getLooper());
                    try {
                        Messenger messenger = new Messenger(this.f197444g);
                        this.f197443f = messenger;
                        if (!dVar.N(messenger)) {
                            M();
                        }
                    } catch (RemoteException unused) {
                        this.f197443f = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z14) {
            try {
                this.f197445h.g0(new Binder());
            } catch (RemoteException unused2) {
            }
        }
    }

    public static void G(a aVar) {
        synchronized (aVar.f197440c) {
        }
    }

    @Override // xj.a
    public final void A(int i14, Bundle bundle) {
        this.f197445h.m(new dk.a(new ck.h(i14, true)), bundle);
    }

    @Override // xj.a
    public final void C(ak.h hVar, Bundle bundle) {
        this.f197445h.m(new dk.a(new o(hVar)), bundle);
    }

    @Override // xj.a
    public final dk.a D(l lVar, Bundle bundle) {
        return this.f197445h.q(new dk.a(new n(lVar)), bundle);
    }

    @Override // xj.a
    public final void F(int i14, Bundle bundle) {
        this.f197445h.m(new dk.a(new f(i14)), bundle);
    }

    public final void H() {
        synchronized (this.f197439b) {
            try {
                i iVar = this.f197438a;
                if (iVar != null) {
                    iVar.b();
                    M();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void I(l lVar, dk.a aVar) {
        synchronized (this.f197439b) {
            try {
                i iVar = this.f197438a;
                if (iVar != null) {
                    iVar.a(lVar, aVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void M() {
        synchronized (this.f197441d) {
            try {
                HandlerThread handlerThread = this.f197442e;
                if (handlerThread == null) {
                    return;
                }
                handlerThread.quit();
                this.f197442e = null;
                d dVar = this.f197444g;
                synchronized (dVar.f197451a) {
                    dVar.f197452b = null;
                    dVar.removeCallbacksAndMessages(null);
                }
                this.f197444g = null;
                try {
                    this.f197445h.S(this.f197443f);
                } catch (RemoteException unused) {
                }
                this.f197443f = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // xj.a
    public final void b(byte[] bArr, Bundle bundle) {
        this.f197445h.b(bArr, bundle);
    }

    @Override // xj.a
    public final void d(byte[] bArr, Bundle bundle) {
        this.f197445h.d(bArr, bundle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xj.a
    public final void f() {
        M();
        this.f197445h.f();
    }

    @Override // xj.a
    public final void g() {
        synchronized (this.f197440c) {
        }
    }

    @Override // xj.a
    public final wj.f getCapabilities() {
        return this.f197445h.getCapabilities();
    }

    @Override // xj.a
    public final void h(ak.b bVar, int i14, Bundle bundle) {
        this.f197445h.m(new dk.a(new ck.a(bVar, i14)), bundle);
    }

    @Override // xj.a
    public final void i(ak.d dVar, ak.f fVar, Bundle bundle) {
        this.f197445h.m(new dk.a(new ck.c(dVar, fVar)), bundle);
    }

    @Override // xj.a
    public final void j(ak.i iVar, Bundle bundle) {
        Message messageObtain = Message.obtain();
        Bundle bundle2 = new Bundle(ak.i.class.getClassLoader());
        bundle2.putParcelable("com.dsi.ant.channel.data.libconfig", iVar);
        messageObtain.what = c.SET_LIB_CONFIG.f197450a;
        messageObtain.setData(bundle2);
        this.f197445h.a(messageObtain, bundle);
        messageObtain.recycle();
    }

    @Override // xj.a
    public final void k(j jVar, Bundle bundle) {
        this.f197445h.m(new dk.a(new ck.j(jVar)), bundle);
    }

    @Override // xj.a
    public final void m(ak.b bVar, Bundle bundle) {
        this.f197445h.m(new dk.a(new ck.d(bVar)), bundle);
    }

    @Override // xj.a
    public final void o(Bundle bundle) {
        this.f197445h.m(new dk.a(new p()), bundle);
    }

    @Override // xj.a
    public final void q(int i14, Bundle bundle) {
        this.f197445h.m(new dk.a(new ck.e(i14)), bundle);
    }

    @Override // xj.a
    public final void r(h hVar, Bundle bundle) {
        Message messageObtain = Message.obtain();
        Bundle bundle2 = new Bundle(h.class.getClassLoader());
        bundle2.putParcelable("com.dsi.ant.channel.data.eventbuffersettings", hVar);
        messageObtain.what = c.SET_EVENT_BUFFER_SETTINGS.f197450a;
        messageObtain.setData(bundle2);
        this.f197445h.a(messageObtain, bundle);
        messageObtain.recycle();
    }

    @Override // xj.a
    public final void s(int i14, Bundle bundle) {
        this.f197445h.m(new dk.a(new m(i14)), bundle);
    }

    @Override // xj.a
    public final void t() {
        synchronized (this.f197439b) {
            this.f197438a = null;
        }
    }

    @Override // xj.a
    public final void u(Bundle bundle) {
        this.f197445h.m(new dk.a(new g()), bundle);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(1);
        parcel.writeStrongBinder(this.f197445h.asBinder());
    }

    @Override // xj.a
    public final void y(i iVar) {
        synchronized (this.f197439b) {
            this.f197438a = iVar;
        }
    }

    @Override // xj.a
    public final void z(Bundle bundle) {
        this.f197445h.m(new dk.a(new ck.l()), bundle);
    }

    public a(yj.d dVar) {
        this(dVar, true);
    }
}
