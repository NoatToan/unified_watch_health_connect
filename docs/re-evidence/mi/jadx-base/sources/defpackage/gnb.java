package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.miui.circulate.api.bean.CirculateParam;
import com.miui.circulate.api.bean.ResponseParam;
import com.miui.circulate.api.exception.CirculateException;
import com.miui.circulate.api.protocol.headset.HeadsetDeviceInfo;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;
import com.miui.headset.api.HeadsetHost;
import com.miui.headset.api.HeadsetHostListener;
import com.miui.headset.api.HeadsetInfo;
import com.miui.headset.api.HeadsetServiceListener;
import com.miui.headset.api.IHeadset;
import com.miui.headset.api.MultipointInfo;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public class gnb extends c52 {
    public knb f;
    public IHeadset g;
    public HeadsetDeviceInfo j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CirculateServiceInfo f19154k;
    public long l;
    public AtomicBoolean d = new AtomicBoolean(false);
    public AtomicBoolean e = new AtomicBoolean(false);
    public final Set<CirculateDeviceInfo> h = new HashSet();
    public final Set<CirculateDeviceInfo> i = new HashSet();
    public boolean m = false;
    public final AtomicBoolean n = new AtomicBoolean(false);
    public HeadsetDeviceInfo o = null;
    public CirculateServiceInfo p = null;
    public CirculateDeviceInfo q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CirculateDeviceInfo f19155r = null;
    public final HeadsetServiceListener s = new a();
    public final HeadsetHostListener t = new b();

    @SuppressLint({"NewApi"})
    public final Handler u = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: qmb
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return this.f31655a.c0(message);
        }
    });

    public class a implements HeadsetServiceListener {
        public a() {
        }

        @Override // com.miui.headset.api.HeadsetServiceListener
        public void onHeadsetServiceDied() {
            tpe.f("HeadsetServiceClient", "onHeadsetServiceDied, clear all bluetooth host and headset");
            for (CirculateDeviceInfo circulateDeviceInfo : qx3.g().k(393216)) {
                gnb.this.f15094b.e(393216, circulateDeviceInfo, circulateDeviceInfo.c(393216));
            }
            gnb.this.h(false);
            omb.f().b();
            gnb.this.e.set(true);
            gnb.this.g.initialize();
        }

        @Override // com.miui.headset.api.HeadsetServiceListener
        public void onHeadsetServiceInitialized() {
            tpe.f("HeadsetServiceClient", "init success");
            gnb.this.h(true);
            gnb.this.f15094b.c(393216);
            if (gnb.this.e.compareAndSet(true, false) && gnb.this.d.get()) {
                gnb.this.g.startDiscovery();
            }
        }
    }

    public class b implements HeadsetHostListener {
        public b() {
        }

        @Override // com.miui.headset.api.HeadsetHostListener
        public void onHeadsetHostLost(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onHeadsetHostLost");
            sb.append(tpe.e(", device id=" + str));
            tpe.g("HeadsetServiceClient", true, sb.toString());
            Message message = new Message();
            message.what = 1;
            message.obj = str;
            gnb.this.u.sendMessage(message);
        }

        @Override // com.miui.headset.api.HeadsetHostListener
        public void onHeadsetHostUpdate(int i, HeadsetHost headsetHost) {
            StringBuilder sb = new StringBuilder();
            sb.append("onHeadsetHostUpdate, type=");
            sb.append(pmb.b(i));
            sb.append(tpe.e(", device id=" + headsetHost.getHostId()));
            tpe.g("HeadsetServiceClient", true, sb.toString());
            Message message = new Message();
            message.what = 0;
            message.arg1 = i;
            message.obj = headsetHost;
            gnb.this.u.sendMessage(message);
        }
    }

    public static /* synthetic */ void P(CirculateDeviceInfo circulateDeviceInfo) {
        tpe.a("HeadsetServiceClient", "from device: name=" + circulateDeviceInfo.c + ", id=" + circulateDeviceInfo.f10301a);
    }

    public static /* synthetic */ void Q(CirculateDeviceInfo circulateDeviceInfo) {
        tpe.a("HeadsetServiceClient", "to device: name=" + circulateDeviceInfo.c + ", id=" + circulateDeviceInfo.f10301a);
    }

    public static /* synthetic */ boolean R(CirculateDeviceInfo circulateDeviceInfo, CirculateDeviceInfo circulateDeviceInfo2) {
        return circulateDeviceInfo.f10301a.equals(circulateDeviceInfo2.f10301a);
    }

    public static /* synthetic */ boolean S(List list, final CirculateDeviceInfo circulateDeviceInfo) {
        return list.stream().anyMatch(new Predicate() { // from class: enb
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return gnb.R(circulateDeviceInfo, (CirculateDeviceInfo) obj);
            }
        });
    }

    public static /* synthetic */ boolean T(CirculateDeviceInfo circulateDeviceInfo) {
        return circulateDeviceInfo.c(393216) == null || circulateDeviceInfo.c(393216).d != 2;
    }

    public static /* synthetic */ boolean d0(String str, CirculateDeviceInfo circulateDeviceInfo) {
        return circulateDeviceInfo.f10301a.equals(str);
    }

    public final boolean D(HeadsetDeviceInfo headsetDeviceInfo, HeadsetDeviceInfo headsetDeviceInfo2) {
        if (headsetDeviceInfo == null || headsetDeviceInfo2 == null) {
            return true;
        }
        int i = !headsetDeviceInfo.f.equals(headsetDeviceInfo2.f) ? 1 : 0;
        if (headsetDeviceInfo.h != headsetDeviceInfo2.h) {
            i++;
        }
        if (headsetDeviceInfo.e != headsetDeviceInfo2.e) {
            i++;
        }
        if (!headsetDeviceInfo.c.equals(headsetDeviceInfo2.c)) {
            i++;
        }
        return i > 1;
    }

    public final void E(CirculateServiceInfo circulateServiceInfo, int i, CirculateDeviceInfo... circulateDeviceInfoArr) {
        CirculateServiceInfo circulateServiceInfo2;
        CirculateDeviceInfo circulateDeviceInfo = null;
        if (circulateDeviceInfoArr == null || circulateDeviceInfoArr.length <= 0) {
            circulateServiceInfo2 = null;
        } else {
            circulateServiceInfo2 = null;
            for (CirculateDeviceInfo circulateDeviceInfo2 : circulateDeviceInfoArr) {
                if (circulateDeviceInfo2 != null && circulateServiceInfo != null) {
                    tpe.f("HeadsetServiceClient", "circulateResult: code=" + i + ", connectState=" + circulateServiceInfo.d);
                    if (i > -1) {
                        circulateServiceInfo.d = i;
                    } else if (circulateServiceInfo.d == 3) {
                        circulateServiceInfo.d = 0;
                    }
                    if (circulateDeviceInfo == null) {
                        circulateServiceInfo2 = circulateServiceInfo;
                        circulateDeviceInfo = circulateDeviceInfo2;
                    }
                }
            }
        }
        this.f15094b.onConnectStateChange(i, circulateDeviceInfo, circulateServiceInfo2);
    }

    @SuppressLint({"NewApi"})
    public void F(List<CirculateDeviceInfo> list, List<CirculateDeviceInfo> list2, CirculateParam circulateParam) {
        for (CirculateDeviceInfo circulateDeviceInfo : list2) {
            knb knbVar = this.f;
            MultipointInfo multipointInfoQ = knbVar.q(knbVar.p(circulateDeviceInfo));
            if (multipointInfoQ == null) {
                tpe.a("HeadsetServiceClient", "device multi point info:null");
            } else {
                tpe.f("HeadsetServiceClient", "device multi point state=" + multipointInfoQ.isMultipointHost() + ", multi point address=" + tpe.e(multipointInfoQ.getMultipointAddress()));
                if (multipointInfoQ.isMultipointHost() && multipointInfoQ.getMultipointAddress().equals(circulateParam.f10282a.f10304a)) {
                    tpe.f("HeadsetServiceClient", "circulate multi point device,disconnect from device");
                    for (CirculateDeviceInfo circulateDeviceInfo2 : list) {
                        E(circulateParam.f10282a, 1, circulateDeviceInfo2);
                        Iterator<CirculateDeviceInfo> it = list2.iterator();
                        while (it.hasNext()) {
                            E(circulateParam.f10282a, 3, it.next());
                        }
                        L(circulateDeviceInfo2, omb.f().g(circulateParam.f10282a.f10304a), circulateParam.f10282a);
                    }
                    return;
                }
            }
        }
        this.h.addAll(list);
        this.i.addAll(list2);
        for (CirculateDeviceInfo circulateDeviceInfo3 : list) {
            this.f19154k = circulateDeviceInfo3.c(393216);
            this.j = omb.f().g(this.f19154k.f10304a);
            tpe.f("HeadsetServiceClient", "circulate service, disconnect from devices, name=" + circulateDeviceInfo3.c);
            E(this.f19154k, 1, circulateDeviceInfo3);
            L(circulateDeviceInfo3, omb.f().g(this.f19154k.f10304a), this.f19154k);
        }
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final int W(CirculateDeviceInfo circulateDeviceInfo, CirculateDeviceInfo circulateDeviceInfo2) {
        return this.g.circulateEnd(this.f.p(circulateDeviceInfo), this.f.p(circulateDeviceInfo2));
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final int Y(CirculateDeviceInfo circulateDeviceInfo, CirculateDeviceInfo circulateDeviceInfo2) {
        return this.g.circulateStart(this.f.p(circulateDeviceInfo), this.f.p(circulateDeviceInfo2));
    }

    public final int I(CirculateDeviceInfo circulateDeviceInfo, HeadsetDeviceInfo headsetDeviceInfo) {
        return this.g.getProfile().connect(this.f.p(circulateDeviceInfo), headsetDeviceInfo.f10300b, headsetDeviceInfo.d);
    }

    public final int J(CirculateDeviceInfo circulateDeviceInfo, HeadsetDeviceInfo headsetDeviceInfo) {
        return this.g.getProfile().disconnect(this.f.p(circulateDeviceInfo), headsetDeviceInfo.f10300b, headsetDeviceInfo.d);
    }

    @SuppressLint({"NewApi"})
    public final CompletableFuture<Integer> K(final CirculateDeviceInfo circulateDeviceInfo, final HeadsetDeviceInfo headsetDeviceInfo, final CirculateServiceInfo circulateServiceInfo) {
        return CompletableFuture.supplyAsync(new Supplier() { // from class: smb
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f33781a.V(circulateDeviceInfo, headsetDeviceInfo, circulateServiceInfo);
            }
        }, wcp.b());
    }

    @SuppressLint({"NewApi"})
    public final CompletableFuture<Integer> L(final CirculateDeviceInfo circulateDeviceInfo, final HeadsetDeviceInfo headsetDeviceInfo, final CirculateServiceInfo circulateServiceInfo) {
        return CompletableFuture.supplyAsync(new Supplier() { // from class: fnb
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f17951a.a0(circulateDeviceInfo, headsetDeviceInfo, circulateServiceInfo);
            }
        }, wcp.b());
    }

    public final String M(HeadsetHost headsetHost) {
        String string = headsetHost.getExtra().getString(DeviceContractKt.COLUMN_DEVICE_TYPE, "");
        String string2 = headsetHost.getExtra().getString("idhash", "");
        return (!TextUtils.equals(string, "AndroidTv") || TextUtils.isEmpty(string2)) ? headsetHost.getHostId() : string2;
    }

    public final String N(String str) {
        if (qx3.g().i(str) != null) {
            return str;
        }
        for (CirculateDeviceInfo circulateDeviceInfo : qx3.g().k(393216)) {
            if (TextUtils.equals(str, circulateDeviceInfo.h.f(CirculateDeviceInfo.MIPLAY_ID, ""))) {
                return circulateDeviceInfo.f10301a;
            }
        }
        return str;
    }

    public final boolean O(HeadsetHost headsetHost) {
        return headsetHost.getHeadsetInfo() == null || TextUtils.isEmpty(headsetHost.getHeadsetInfo().getAddress());
    }

    public final /* synthetic */ Object U(List list, List list2, CirculateParam circulateParam) {
        F(list, list2, circulateParam);
        return null;
    }

    public final /* synthetic */ Integer V(CirculateDeviceInfo circulateDeviceInfo, HeadsetDeviceInfo headsetDeviceInfo, CirculateServiceInfo circulateServiceInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("connecting, host device name=");
        sb.append(circulateDeviceInfo.c);
        sb.append(", headset name=");
        sb.append(headsetDeviceInfo.c);
        sb.append(tpe.e(", host device id=" + circulateDeviceInfo.f10301a + ", headset id=" + headsetDeviceInfo.f10300b + ", host connect id =" + this.f.p(circulateDeviceInfo)));
        tpe.f("HeadsetServiceClient", sb.toString());
        int I = I(circulateDeviceInfo, headsetDeviceInfo);
        if (I == 308) {
            E(circulateServiceInfo, I, circulateDeviceInfo);
            this.o = headsetDeviceInfo;
            this.p = circulateServiceInfo;
            Iterator<CirculateDeviceInfo> it = this.h.iterator();
            while (it.hasNext()) {
                this.f19155r = it.next();
            }
            Iterator<CirculateDeviceInfo> it2 = this.i.iterator();
            while (it2.hasNext()) {
                this.q = it2.next();
            }
            this.u.sendEmptyMessageDelayed(2, 20000L);
            g0();
            this.n.compareAndSet(true, false);
        } else if (I != 100 && I != 301) {
            this.h.forEach(new Consumer() { // from class: tmb
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f34851a.X((CirculateDeviceInfo) obj);
                }
            });
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.l);
            this.l = System.currentTimeMillis();
            this.m = true;
            tpe.i("HeadsetServiceClient", "connect failed, duration=" + iCurrentTimeMillis);
            this.f.getClass();
            E(circulateServiceInfo, I, circulateDeviceInfo);
            if (circulateDeviceInfo.c(393216) != null && !TextUtils.isEmpty(circulateDeviceInfo.c(393216).f10304a)) {
                E(circulateDeviceInfo.c(393216), 2, circulateDeviceInfo);
            }
            circulateServiceInfo.d = 0;
            if (!this.h.isEmpty()) {
                for (CirculateDeviceInfo circulateDeviceInfo2 : this.h) {
                    CirculateServiceInfo circulateServiceInfoC = circulateDeviceInfo2.c(393216);
                    if (circulateServiceInfoC == null || TextUtils.isEmpty(circulateServiceInfoC.f10304a) || !circulateServiceInfoC.f10304a.equals(this.f19154k.f10304a)) {
                        CirculateServiceInfo circulateServiceInfoC2 = circulateDeviceInfo2.c(393216);
                        if (circulateServiceInfoC2.d == 2) {
                            E(circulateServiceInfoC2, 0, circulateDeviceInfo2);
                        }
                        E(this.f19154k, 3, circulateDeviceInfo2);
                        CirculateServiceInfo circulateServiceInfoC3 = circulateDeviceInfo2.c(393216);
                        if (TextUtils.isEmpty(circulateServiceInfoC3.f10304a) && this.f19154k != null) {
                            circulateDeviceInfo2.i.remove(circulateServiceInfoC3);
                            circulateDeviceInfo2.i.add(this.f19154k);
                        }
                        HashSet hashSet = new HashSet(this.h);
                        this.h.clear();
                        this.h.addAll(this.i);
                        this.i.clear();
                        this.i.addAll(hashSet);
                        this.h.forEach(new Consumer() { // from class: umb
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                this.f35931a.Z((CirculateDeviceInfo) obj);
                            }
                        });
                        tpe.f("HeadsetServiceClient", "connect from device");
                        int I2 = I(circulateDeviceInfo2, this.j);
                        if (I2 != 100) {
                            tpe.i("HeadsetServiceClient", "connect from device failed, code=" + I2);
                            E(this.f19154k, 0, circulateDeviceInfo2);
                            System.currentTimeMillis();
                            this.f.getClass();
                            g0();
                        }
                    }
                }
            }
            this.n.compareAndSet(true, false);
        }
        return Integer.valueOf(I);
    }

    public final /* synthetic */ void X(final CirculateDeviceInfo circulateDeviceInfo) {
        this.i.forEach(new Consumer() { // from class: wmb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f38123a.W(circulateDeviceInfo, (CirculateDeviceInfo) obj);
            }
        });
    }

    public final /* synthetic */ void Z(final CirculateDeviceInfo circulateDeviceInfo) {
        this.i.forEach(new Consumer() { // from class: vmb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f37022a.Y(circulateDeviceInfo, (CirculateDeviceInfo) obj);
            }
        });
    }

    @Override // defpackage.dqc
    @SuppressLint({"NewApi"})
    public void a(final List<CirculateDeviceInfo> list, final List<CirculateDeviceInfo> list2, final CirculateParam circulateParam) throws CirculateException {
        if (!this.n.compareAndSet(false, true)) {
            tpe.c("HeadsetServiceClient", "circulate error, last circulate still processing");
            throw new CirculateException("circulate error, last circulate still processing");
        }
        tpe.f("HeadsetServiceClient", "circulate service");
        this.l = System.currentTimeMillis();
        this.m = false;
        if (gx3.d()) {
            list.forEach(new Consumer() { // from class: zmb
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    gnb.P((CirculateDeviceInfo) obj);
                }
            });
            list2.forEach(new Consumer() { // from class: anb
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    gnb.Q((CirculateDeviceInfo) obj);
                }
            });
        }
        if (list.stream().anyMatch(new Predicate() { // from class: bnb
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return gnb.S(list2, (CirculateDeviceInfo) obj);
            }
        })) {
            tpe.i("HeadsetServiceClient", "circulate service, local to local");
        } else {
            if (list.stream().anyMatch(new Predicate() { // from class: cnb
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return gnb.T((CirculateDeviceInfo) obj);
                }
            })) {
                tpe.c("HeadsetServiceClient", "circulate error, no headset connected to current device");
                throw new CirculateException("circulate error, no headset connected to current device");
            }
            this.h.clear();
            this.i.clear();
            rx3.a(new Supplier() { // from class: dnb
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f15715a.U(list, list2, circulateParam);
                }
            }, wcp.b());
        }
    }

    public final /* synthetic */ Integer a0(CirculateDeviceInfo circulateDeviceInfo, HeadsetDeviceInfo headsetDeviceInfo, CirculateServiceInfo circulateServiceInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("disconnecting, host device name=");
        sb.append(circulateDeviceInfo.c);
        sb.append(", headset name=");
        sb.append(headsetDeviceInfo.c);
        sb.append(tpe.e(", host device id=" + circulateDeviceInfo.f10301a + ", headset id=" + headsetDeviceInfo.f10300b));
        tpe.f("HeadsetServiceClient", sb.toString());
        if (this.h.isEmpty() || this.i.isEmpty()) {
            this.n.compareAndSet(true, false);
        } else {
            Iterator<CirculateDeviceInfo> it = this.h.iterator();
            CirculateDeviceInfo next = null;
            CirculateDeviceInfo next2 = null;
            while (it.hasNext()) {
                next2 = it.next();
            }
            Iterator<CirculateDeviceInfo> it2 = this.i.iterator();
            while (it2.hasNext()) {
                next = it2.next();
            }
            int iY = Y(next2, next);
            if (iY != 100) {
                E(circulateServiceInfo, iY, circulateDeviceInfo);
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.l);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("circulate conflict, duration=");
                sb2.append(iCurrentTimeMillis);
                sb2.append(", code=");
                sb2.append(iY);
                sb2.append("mStatCallBack ");
                this.f.getClass();
                sb2.append(false);
                tpe.f("HeadsetServiceClient", sb2.toString());
                this.f.getClass();
                E(circulateServiceInfo, 2, circulateDeviceInfo);
                g0();
                return Integer.valueOf(iY);
            }
        }
        int iJ = J(circulateDeviceInfo, headsetDeviceInfo);
        if (iJ != 100) {
            E(circulateServiceInfo, iJ, circulateDeviceInfo);
            tpe.f("HeadsetServiceClient", "circulate disconnect fail, duration=" + ((int) (System.currentTimeMillis() - this.l)) + ", code=" + iJ);
            this.f.getClass();
            E(circulateServiceInfo, 2, circulateDeviceInfo);
            g0();
        }
        return Integer.valueOf(iJ);
    }

    @Override // defpackage.trc
    public void b(dy6 dy6Var) throws CirculateException {
        boolean zCompareAndSet = this.d.compareAndSet(true, false);
        tpe.g("HeadsetServiceClient", true, "stopDiscovery, available: " + d() + ", success: " + zCompareAndSet);
        if (d() && zCompareAndSet) {
            this.g.stopDiscovery();
            qx3.g().f(393216, false);
        }
    }

    public final /* synthetic */ Boolean b0() {
        int I = I(this.f19155r, this.o);
        System.currentTimeMillis();
        this.f.getClass();
        if (I != 100) {
            E(this.p, 0, this.f19155r);
        }
        this.o = null;
        this.f19155r = null;
        this.q = null;
        this.p = null;
        return Boolean.TRUE;
    }

    @Override // defpackage.trc
    public void c(dy6 dy6Var, Executor executor) throws CirculateException {
        boolean zCompareAndSet = this.d.compareAndSet(false, true);
        tpe.g("HeadsetServiceClient", true, "startDiscovery， available: " + d() + ", success: " + zCompareAndSet);
        if (d() && zCompareAndSet) {
            this.g.startDiscovery();
        }
    }

    public final /* synthetic */ boolean c0(Message message) {
        try {
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    j0(N((String) message.obj));
                    return true;
                }
                if (i == 2) {
                    this.l = System.currentTimeMillis();
                    E(this.p, 3, this.f19155r);
                    CompletableFuture.supplyAsync(new Supplier() { // from class: xmb
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return this.f39262a.b0();
                        }
                    }, wcp.b());
                }
                return true;
            }
            int i2 = message.arg1;
            switch (i2) {
                case 1:
                    i0((HeadsetHost) message.obj);
                    return true;
                case 2:
                case 3:
                    f0((HeadsetHost) message.obj, i2);
                    return true;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    h0((HeadsetHost) message.obj, i2);
                    return true;
                default:
                    return true;
            }
        } catch (Exception e) {
            tpe.c("HeadsetServiceClient", e.toString());
            e.printStackTrace();
            return true;
        }
    }

    @Override // defpackage.b14
    public hyc e(int i) throws CirculateException {
        tpe.b("HeadsetServiceClient", true, "get service controller");
        return this.f;
    }

    public final /* synthetic */ Object e0() {
        if (!this.h.isEmpty() && !this.i.isEmpty()) {
            Iterator<CirculateDeviceInfo> it = this.h.iterator();
            CirculateDeviceInfo next = null;
            while (it.hasNext()) {
                next = it.next();
            }
            Iterator<CirculateDeviceInfo> it2 = this.i.iterator();
            CirculateDeviceInfo next2 = null;
            while (it2.hasNext()) {
                next2 = it2.next();
            }
            W(next, next2);
        }
        this.h.clear();
        this.i.clear();
        this.f19154k = null;
        this.j = null;
        this.n.compareAndSet(true, false);
        return null;
    }

    @Override // defpackage.b14
    public int f() {
        return 393216;
    }

    @SuppressLint({"NewApi"})
    public final void f0(HeadsetHost headsetHost, int i) {
        String str;
        final String strB = nnb.b(headsetHost);
        HeadsetInfo headsetInfo = headsetHost.getHeadsetInfo();
        StringBuilder sb = new StringBuilder();
        sb.append("on active headset changed, type=");
        sb.append(pmb.b(i));
        sb.append(tpe.e(", host device id=" + strB));
        tpe.f("HeadsetServiceClient", sb.toString());
        CirculateDeviceInfo circulateDeviceInfoI = qx3.g().i(strB);
        if (circulateDeviceInfoI == null || circulateDeviceInfoI.c(393216) == null) {
            tpe.i("HeadsetServiceClient", "cannot find host device or host deivce do not support bluetooth, update temporary bluetooth service");
            return;
        }
        CirculateServiceInfo circulateServiceInfoC = circulateDeviceInfoI.c(393216);
        CirculateServiceInfo circulateServiceInfoE = omb.f().e(headsetInfo, this.f);
        tpe.f("HeadsetServiceClient", "oldService=" + circulateServiceInfoC);
        if (circulateServiceInfoC == null) {
            tpe.i("HeadsetServiceClient", "oldService is null");
            return;
        }
        if (circulateServiceInfoC.d == 3 && i == 2 && !circulateServiceInfoE.f10304a.equals(circulateServiceInfoC.f10304a)) {
            tpe.i("HeadsetServiceClient", "other headset is connecting, ignore");
            return;
        }
        circulateDeviceInfoI.i.remove(circulateServiceInfoC);
        circulateDeviceInfoI.i.add(circulateServiceInfoE);
        circulateServiceInfoC.d = 0;
        HeadsetDeviceInfo headsetDeviceInfoG = omb.f().g(circulateServiceInfoC.f10304a);
        HeadsetDeviceInfo headsetDeviceInfoD = omb.f().d(headsetHost, this.f15093a);
        if (i == 2) {
            k0(headsetDeviceInfoG);
            omb.f().a(headsetDeviceInfoD);
            CirculateServiceInfo circulateServiceInfo = this.p;
            if (circulateServiceInfo != null && TextUtils.equals(headsetDeviceInfoD.f10300b, circulateServiceInfo.f10304a)) {
                this.u.removeMessages(2);
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.l);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("circulate success, duration=");
                sb2.append(iCurrentTimeMillis);
                sb2.append("mStatCallBack ");
                this.f.getClass();
                sb2.append(false);
                tpe.f("HeadsetServiceClient", sb2.toString());
                this.f.getClass();
                this.p = null;
                this.f19155r = null;
                this.q = null;
                this.o = null;
            }
            if (headsetDeviceInfoD != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("new headset name=");
                sb3.append(headsetDeviceInfoD.c);
                sb3.append(tpe.e(", new headset id=" + headsetDeviceInfoD.f10300b));
                tpe.f("HeadsetServiceClient", sb3.toString());
                String str2 = circulateServiceInfoC.f10304a;
                if (str2 != null && !str2.equals(circulateServiceInfoE.f10304a)) {
                    this.f15094b.onConnectStateChange(0, circulateDeviceInfoI, circulateServiceInfoC);
                }
                this.f15094b.onConnectStateChange(2, circulateDeviceInfoI, circulateServiceInfoE);
                if (this.i.stream().anyMatch(new Predicate() { // from class: ymb
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return gnb.d0(strB, (CirculateDeviceInfo) obj);
                    }
                })) {
                    if (headsetInfo == null) {
                        tpe.i("HeadsetServiceClient", "headsetInfo is null");
                        return;
                    }
                    String address = headsetInfo.getAddress();
                    HeadsetDeviceInfo headsetDeviceInfo = this.j;
                    if (headsetDeviceInfo != null && TextUtils.equals(address, headsetDeviceInfo.f10299a)) {
                        int iCurrentTimeMillis2 = (int) (System.currentTimeMillis() - this.l);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("circulate success, duration=");
                        sb4.append(iCurrentTimeMillis2);
                        sb4.append("mStatCallBack ");
                        this.f.getClass();
                        sb4.append(false);
                        tpe.f("HeadsetServiceClient", sb4.toString());
                        this.f.getClass();
                        this.f.getClass();
                        g0();
                    }
                }
            }
        } else {
            headsetDeviceInfoG = headsetDeviceInfoG;
        }
        if (i != 3 || headsetDeviceInfoG == null) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("lost headset name=");
        HeadsetDeviceInfo headsetDeviceInfo2 = headsetDeviceInfoG;
        sb5.append(headsetDeviceInfo2.c);
        sb5.append(tpe.e(", lost headset id=" + headsetDeviceInfo2.f10300b));
        tpe.f("HeadsetServiceClient", sb5.toString());
        this.f15094b.onConnectStateChange(0, circulateDeviceInfoI, circulateServiceInfoC);
        if (!this.h.contains(circulateDeviceInfoI) || !circulateServiceInfoC.equals(this.f19154k)) {
            k0(headsetDeviceInfo2);
            return;
        }
        tpe.f("HeadsetServiceClient", "circulate service, disconnect from devices success");
        headsetDeviceInfo2.h = -1;
        headsetDeviceInfo2.f = Arrays.asList(-1, -1, -1, 0, 0, 0);
        for (CirculateDeviceInfo circulateDeviceInfo : this.i) {
            CirculateServiceInfo circulateServiceInfoC2 = circulateDeviceInfo.c(393216);
            if (circulateServiceInfoC2 == null || (str = circulateServiceInfoC2.f10304a) == null || !str.equals(this.f19154k.f10304a)) {
                if (circulateDeviceInfo.c(393216) != null && !TextUtils.isEmpty(circulateDeviceInfo.c(393216).f10304a)) {
                    E(circulateDeviceInfo.c(393216), 0, circulateDeviceInfo);
                }
                tpe.f("HeadsetServiceClient", "circulate service, connect to devices");
                E(this.f19154k, 3, circulateDeviceInfo);
                K(circulateDeviceInfo, this.j, this.f19154k);
            } else {
                tpe.i("HeadsetServiceClient", "circulate service, already connected to device");
                E(circulateServiceInfoC2, 2, circulateDeviceInfo);
                g0();
            }
        }
    }

    @Override // defpackage.d52, defpackage.b14
    public void g(Context context, zw3 zw3Var, String str) {
        tpe.b("HeadsetServiceClient", true, "clientInstall");
        super.g(context, zw3Var, str);
        if (str.equals("com.milink.service")) {
            this.g = IHeadset.create(this.f15093a, this.s, this.t, "");
        } else if (str.equals("com.milink.service:provider")) {
            this.g = IHeadset.create(this.f15093a, this.s, this.t, "provider");
        } else {
            this.g = IHeadset.create(this.f15093a, this.s, this.t);
        }
    }

    @SuppressLint({"NewApi"})
    public final void g0() {
        CompletableFuture.supplyAsync(new Supplier() { // from class: rmb
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f32701a.e0();
            }
        }, wcp.b());
    }

    public final void h0(HeadsetHost headsetHost, int i) {
        String strM = M(headsetHost);
        StringBuilder sb = new StringBuilder();
        sb.append("on headset property updated, type=");
        sb.append(pmb.b(i));
        sb.append(", name=");
        sb.append(headsetHost.getHeadsetInfo() != null ? headsetHost.getHeadsetInfo().getName() : "");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(", headset address=");
        sb2.append(headsetHost.getHeadsetInfo() != null ? headsetHost.getHeadsetInfo().getAddress() : "");
        sb.append(tpe.e(sb2.toString()));
        tpe.f("HeadsetServiceClient", sb.toString());
        HeadsetDeviceInfo headsetDeviceInfoG = omb.f().g(headsetHost.getHeadsetInfo().getAddress());
        omb.f().h(headsetDeviceInfoG);
        HeadsetDeviceInfo headsetDeviceInfoD = omb.f().d(headsetHost, this.f15093a);
        omb.f().a(headsetDeviceInfoD);
        CirculateDeviceInfo circulateDeviceInfoI = qx3.g().i(strM);
        if (circulateDeviceInfoI == null) {
            tpe.i("HeadsetServiceClient", "cannot find host device, ignore");
        }
        if (i != 4 && D(headsetDeviceInfoG, headsetDeviceInfoD)) {
            i = 4;
        }
        switch (i) {
            case 4:
                if (circulateDeviceInfoI.c(393216) != null) {
                    this.f15094b.a(393216, circulateDeviceInfoI, circulateDeviceInfoI.c(393216));
                    break;
                }
                break;
            case 5:
                Iterator<lnb> it = this.f.a().iterator();
                while (it.hasNext()) {
                    it.next().onBluetoothNameChanged(circulateDeviceInfoI.c(393216), headsetDeviceInfoD.c);
                }
                break;
            case 6:
                Iterator<lnb> it2 = this.f.a().iterator();
                while (it2.hasNext()) {
                    it2.next().onBluetoothVolumeChanged(circulateDeviceInfoI.c(393216), headsetDeviceInfoD.e);
                }
                break;
            case 7:
                Iterator<lnb> it3 = this.f.a().iterator();
                while (it3.hasNext()) {
                    it3.next().onBluetoothBatteryChanged(circulateDeviceInfoI.c(393216), headsetHost.getHeadsetInfo().getPowers());
                }
                break;
            case 8:
                Iterator<lnb> it4 = this.f.a().iterator();
                while (it4.hasNext()) {
                    it4.next().onBluetoothModeChanged(circulateDeviceInfoI.c(393216), headsetDeviceInfoD.h);
                }
                break;
        }
    }

    public final void i0(HeadsetHost headsetHost) {
        CirculateDeviceInfo circulateDeviceInfoA = nnb.a(headsetHost);
        CirculateDeviceInfo circulateDeviceInfoI = qx3.g().i(circulateDeviceInfoA.f10301a);
        StringBuilder sb = new StringBuilder();
        sb.append("on host found, ");
        sb.append(tpe.e(", host device id=" + circulateDeviceInfoA.f10301a));
        sb.append(", cache = ");
        sb.append(circulateDeviceInfoI);
        tpe.f("HeadsetServiceClient", sb.toString());
        if (circulateDeviceInfoI == null || circulateDeviceInfoI.c(393216) != null) {
            return;
        }
        if (!O(headsetHost)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("add new headset, name=");
            sb2.append(headsetHost.getHeadsetInfo().getName());
            sb2.append(tpe.e(", headset address=" + headsetHost.getHeadsetInfo().getAddress()));
            tpe.f("HeadsetServiceClient", sb2.toString());
            omb.f().a(omb.f().d(headsetHost, this.f15093a));
        }
        CirculateServiceInfo circulateServiceInfoE = omb.f().e(headsetHost.getHeadsetInfo(), this.f);
        circulateDeviceInfoA.i.add(circulateServiceInfoE);
        this.f15094b.d(393216, circulateDeviceInfoA, circulateServiceInfoE);
    }

    @Override // defpackage.b14
    public void init() {
        int iA;
        tpe.g("HeadsetServiceClient", true, "start init");
        try {
            iA = fhh.a(this.f15093a, "com.milink.service");
        } catch (Exception unused) {
            tpe.c("HeadsetServiceClient", "get milink version code fail");
            iA = 0;
        }
        tpe.a("HeadsetServiceClient", "milink version=" + iA);
        if (iA >= 13200008) {
            this.g.initialize();
            this.f = new knb(this.g);
        } else {
            tpe.i("HeadsetServiceClient", "milink not support, init fail");
            this.f15094b.b(393216, new ResponseParam.b(201, "milink not support, init fail").a());
        }
    }

    public final void j0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("on host device lost");
        sb.append(tpe.e(", host device id=" + str));
        tpe.a("HeadsetServiceClient", sb.toString());
        if (qx3.g().i(str) == null || qx3.g().i(str).c(393216) == null) {
            tpe.f("HeadsetServiceClient", "remove service temporary cache");
            return;
        }
        CirculateDeviceInfo circulateDeviceInfoI = qx3.g().i(str);
        CirculateServiceInfo circulateServiceInfoC = circulateDeviceInfoI.c(393216);
        if (circulateServiceInfoC == null) {
            tpe.i("HeadsetServiceClient", "service is null");
            return;
        }
        if (circulateServiceInfoC.d == 2 && !this.d.get()) {
            tpe.i("HeadsetServiceClient", "service connected, ignore");
            return;
        }
        HeadsetDeviceInfo headsetDeviceInfoG = omb.f().g(circulateServiceInfoC.f10304a);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("remove headset info, headset name=");
        sb2.append(headsetDeviceInfoG == null ? "" : headsetDeviceInfoG.c);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(", headset id=");
        sb3.append(headsetDeviceInfoG != null ? headsetDeviceInfoG.f10300b : "");
        sb2.append(tpe.e(sb3.toString()));
        tpe.f("HeadsetServiceClient", sb2.toString());
        this.f15094b.e(393216, circulateDeviceInfoI, circulateServiceInfoC);
        k0(headsetDeviceInfoG);
    }

    public final void k0(HeadsetDeviceInfo headsetDeviceInfo) {
        if (headsetDeviceInfo == null || headsetDeviceInfo.f10300b == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("remove headset, name=");
        sb.append(headsetDeviceInfo.c);
        sb.append(tpe.e(", id=" + headsetDeviceInfo.f10300b));
        tpe.f("HeadsetServiceClient", sb.toString());
        Iterator<CirculateDeviceInfo> it = qx3.g().k(393216).iterator();
        while (it.hasNext()) {
            if (headsetDeviceInfo.f10300b.equals(it.next().c(393216).f10304a)) {
                tpe.i("HeadsetServiceClient", "device still in use, ignore");
                return;
            }
        }
        omb.f().h(headsetDeviceInfo);
    }

    @Override // defpackage.b14
    public void release() {
        tpe.g("HeadsetServiceClient", true, "release");
        IHeadset iHeadset = this.g;
        if (iHeadset != null) {
            iHeadset.release();
        }
        h(false);
    }
}
