package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.clockwork.companion.partnerapi.EcoAppNotificationConfig;
import com.xiaomi.eco.api.EcoApiCallManager;
import com.xiaomi.eco.api.EcoApiResult;
import com.xiaomi.eco.api.bean.EcoConnectDeviceInfo;
import com.xiaomi.eco.api.p;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ag7 implements asc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f968b;
    public final String c;
    public final EcoConnectDeviceInfo d;
    public com.xiaomi.eco.common.connect.a f;
    public final com.xiaomi.eco.common.connect.a g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p.b f969k;
    public qj7 l;
    public final zrc m;
    public ch7 o;
    public mj7 p;
    public et7 q;
    public volatile boolean e = false;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final Map<Integer, e> i = new LinkedHashMap();
    public final Object j = new Object();
    public final AtomicInteger n = new AtomicInteger(0);

    public class a implements cv7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ csc f970a;

        public a(csc cscVar) {
            this.f970a = cscVar;
        }

        @Override // defpackage.cv7
        public void onCanceled() {
            try {
                this.f970a.onCancel();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.cv7
        public void onConfirm() {
            try {
                this.f970a.onConfirm();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public class b extends com.xiaomi.eco.common.connect.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p.a f972a;

        public b(p.a aVar) {
            this.f972a = aVar;
        }

        @Override // com.xiaomi.eco.common.connect.b
        public void onCallback(final EcoApiResult ecoApiResult) throws RemoteException {
            final p.a aVar = this.f972a;
            if (aVar != null) {
                ag7.this.h.post(new Runnable() { // from class: bg7
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.onCallback(ecoApiResult);
                    }
                });
            }
        }
    }

    public class c implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xiaomi.eco.common.connect.a aVar = ag7.this.f;
            if (aVar != null) {
                return method.invoke(aVar, objArr);
            }
            Logger.i("EcoBaseLocalApiCall", "ApiCallInvocationHandler -> method = " + method.getName());
            e eVar = new e(ag7.this.n.getAndDecrement(), method, objArr);
            synchronized (ag7.this.j) {
                ag7.this.i.put(Integer.valueOf(eVar.d), eVar);
            }
            return method.getName().startsWith("call") ? Integer.valueOf(eVar.d) : ExtUtilsKt.getBasicValue(method.getReturnType());
        }

        public c() {
        }
    }

    public class d extends wrc.a {
        @Override // defpackage.wrc
        public void I3(final List<String> list) throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: kg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23817a.f6(list);
                }
            });
        }

        public final /* synthetic */ void L5() {
            ch7 ch7Var = ag7.this.o;
            if (ch7Var != null) {
                ch7Var.dismissButtonConfirmDialog();
            }
        }

        public final /* synthetic */ void M5() {
            ch7 ch7Var = ag7.this.o;
            if (ch7Var != null) {
                ch7Var.dismissOOB();
            }
        }

        public final /* synthetic */ void N5(int i, byte[] bArr) {
            ag7.this.m.handleData(i, bArr);
        }

        public final /* synthetic */ void O5(String str, String str2, byte[] bArr) {
            ag7.this.m.handleEcoData(str, str2, bArr);
        }

        @Override // defpackage.wrc
        public void P4(final int i, final byte[] bArr) throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: lg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25032a.P5(bArr, i);
                }
            });
        }

        public final /* synthetic */ void P5(byte[] bArr, int i) {
            u7r u7rVarB = qm5.b(bArr);
            if (u7rVarB == null) {
                Logger.d("EcoBaseLocalApiCall", "handlePacket: error data from connect process");
            }
            ag7.this.m.handlePacket(i, u7rVarB);
            ag7.this.y(i, u7rVarB);
        }

        public final /* synthetic */ void Q5(int i, String str) {
            ch7 ch7Var = ag7.this.o;
            if (ch7Var != null) {
                ch7Var.onBindFailure(i, str);
            }
        }

        public final /* synthetic */ void R5(String str, String str2, String str3, String str4) {
            Logger.d("EcoBaseLocalApiCall", "onBindSuccess() called with: model = [" + str + "], did = [" + str2 + "], mac = [" + str3 + "], sn = [" + str4 + "]" + ag7.this.o);
            ag7.this.z(str, str2, str3, str4);
        }

        public final /* synthetic */ void S5(int i) {
            ch7 ch7Var = ag7.this.o;
            if (ch7Var != null) {
                ch7Var.onBondFailure(i);
            }
        }

        public final /* synthetic */ void T5() {
            ch7 ch7Var = ag7.this.o;
            if (ch7Var != null) {
                ch7Var.onBondSuccess();
            }
        }

        public final /* synthetic */ void U5(int i) {
            ch7 ch7Var = ag7.this.o;
            if (ch7Var != null) {
                ch7Var.onConnectFailure(i);
            }
        }

        public final /* synthetic */ void V5(int i, String str) {
            if (ag7.this.l != null) {
                ag7.this.l.b(i, str);
            }
        }

        public final /* synthetic */ void W5() {
            ch7 ch7Var = ag7.this.o;
            if (ch7Var != null) {
                ch7Var.onConnectSuccess();
            }
        }

        public final /* synthetic */ void X5() {
            Logger.d("EcoBaseLocalApiCall", "onConnected: " + ag7.this.f969k + "  old state:" + ag7.this.e);
            ag7.this.e = true;
            if (ag7.this.f969k != null) {
                ag7.this.f969k.onConnected();
            }
        }

        public final /* synthetic */ void Y5(int i) {
            if (ag7.this.q != null) {
                ag7.this.q.onDisconnectFailure(i);
            }
        }

        public final /* synthetic */ void Z5() {
            if (ag7.this.q != null) {
                ag7.this.q.onDisconnectSuccess();
            }
        }

        public final /* synthetic */ void a6() {
            Logger.d("EcoBaseLocalApiCall", "onDisconnected: " + ag7.this.f969k + "  old state:" + ag7.this.e);
            ag7.this.e = false;
            if (ag7.this.f969k != null) {
                ag7.this.f969k.onDisconnected();
            }
        }

        @Override // defpackage.wrc
        public void b(final int i, final String str) throws RemoteException {
            Logger.d("EcoBaseLocalApiCall", "onConnectStatus() called with: " + i + ":" + str);
            ag7.this.h.post(new Runnable() { // from class: eg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16619a.V5(i, str);
                }
            });
        }

        public final /* synthetic */ void b6(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
            Logger.d("EcoBaseLocalApiCall", "onBindSuccess() called with: model = [" + str + "], did = [" + str2 + "], mac = [" + str3 + "], sn = [" + str4 + "], appDeviceId = [" + str5 + "]" + ag7.this.o);
            ag7.this.A(str, str2, str3, str4, str5, bArr);
        }

        public final /* synthetic */ void c6(List list) {
            ag7.this.B(list);
        }

        public final /* synthetic */ void d6(int i) {
            if (ag7.this.p != null) {
                ag7.this.p.onRemoveFailure(i);
            }
        }

        @Override // defpackage.wrc
        public void dismissButtonConfirmDialog() throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: wg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37935a.L5();
                }
            });
        }

        @Override // defpackage.wrc
        public void dismissOOB() throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: ug7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35731a.M5();
                }
            });
        }

        public final /* synthetic */ void e6() {
            if (ag7.this.p != null) {
                ag7.this.p.onRemoveSuccess();
            }
        }

        public final /* synthetic */ void f6(List list) {
            ag7.this.C(list);
        }

        public final /* synthetic */ void g6() {
            ch7 ch7Var = ag7.this.o;
            if (ch7Var != null) {
                ch7Var.showButtonConfirmDialog();
            }
        }

        public final /* synthetic */ void h6(String str, csc cscVar) {
            ag7.this.D(str, cscVar);
        }

        @Override // defpackage.wrc
        public void handleData(final int i, final byte[] bArr) throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: pg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30364a.N5(i, bArr);
                }
            });
        }

        public final /* synthetic */ void i6(String str) {
            ag7.this.f968b = str;
            ag7.this.m.updateDid(str);
        }

        @Override // defpackage.wrc
        public void onBindFailure(final int i, final String str) throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: vg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36864a.Q5(i, str);
                }
            });
        }

        @Override // defpackage.wrc
        public void onBindSuccess(final String str, final String str2, final String str3, final String str4) throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: zg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41245a.R5(str, str2, str3, str4);
                }
            });
        }

        @Override // defpackage.wrc
        public void onBondFailure(final int i) throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: hg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20039a.S5(i);
                }
            });
        }

        @Override // defpackage.wrc
        public void onBondSuccess() throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: yg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40150a.T5();
                }
            });
        }

        @Override // defpackage.wrc
        public void onConnectFailure(final int i) throws RemoteException {
            Logger.d("EcoBaseLocalApiCall", "onConnectFailure() called with code=" + i);
            ag7.this.h.post(new Runnable() { // from class: qg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31496a.U5(i);
                }
            });
        }

        @Override // defpackage.wrc
        public void onConnectSuccess() throws RemoteException {
            Logger.d("EcoBaseLocalApiCall", "onConnectSuccess() called" + ag7.this.o);
            ag7.this.h.post(new Runnable() { // from class: ig7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21111a.W5();
                }
            });
        }

        @Override // defpackage.wrc
        public void onConnected() throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: og7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29132a.X5();
                }
            });
        }

        @Override // defpackage.wrc
        public void onDisconnectFailure(final int i) throws RemoteException {
            Logger.d("EcoBaseLocalApiCall", "onDisconnectFailure() called with: " + i);
            ag7.this.h.post(new Runnable() { // from class: jg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22762a.Y5(i);
                }
            });
        }

        @Override // defpackage.wrc
        public void onDisconnectSuccess() throws RemoteException {
            Logger.d("EcoBaseLocalApiCall", "onDisconnectSuccess() called");
            ag7.this.h.post(new Runnable() { // from class: sg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33607a.Z5();
                }
            });
        }

        @Override // defpackage.wrc
        public void onDisconnected() throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: fg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17757a.a6();
                }
            });
        }

        @Override // defpackage.wrc
        public void onLocalBindSuccess(final String str, final String str2, final String str3, final String str4, final String str5, final byte[] bArr) throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: ah7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1011a.b6(str, str2, str3, str4, str5, bArr);
                }
            });
        }

        @Override // defpackage.wrc
        public void onRemoveFailure(final int i) throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: rg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32515a.d6(i);
                }
            });
        }

        @Override // defpackage.wrc
        public void onRemoveSuccess() throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: gg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18946a.e6();
                }
            });
        }

        @Override // defpackage.wrc
        public void s(final String str, final String str2, final byte[] bArr) throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: mg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26132a.O5(str, str2, bArr);
                }
            });
        }

        @Override // defpackage.wrc
        public void showButtonConfirmDialog() throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: dg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15506a.g6();
                }
            });
        }

        @Override // defpackage.wrc
        public void t(final String str, final csc cscVar) throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: ng7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27902a.h6(str, cscVar);
                }
            });
        }

        @Override // defpackage.wrc
        public void u(final List<EcoAppNotificationConfig> list) throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: xg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39092a.c6(list);
                }
            });
        }

        @Override // defpackage.wrc
        public void updateDid(final String str) throws RemoteException {
            ag7.this.h.post(new Runnable() { // from class: tg7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34671a.i6(str);
                }
            });
        }

        public d() {
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f977b;
        public final long c = System.currentTimeMillis();
        public final int d;

        public e(int i, Method method, Object[] objArr) {
            this.f976a = method;
            this.f977b = objArr;
            this.d = i;
        }
    }

    public ag7(String str, String str2, boolean z, EcoConnectDeviceInfo ecoConnectDeviceInfo, p.b bVar, zrc zrcVar) {
        if (ecoConnectDeviceInfo == null) {
            throw new IllegalArgumentException("error product");
        }
        this.c = str;
        this.f968b = str2;
        this.f967a = z;
        this.d = ecoConnectDeviceInfo;
        this.m = zrcVar;
        this.f969k = bVar;
        this.g = (com.xiaomi.eco.common.connect.a) Proxy.newProxyInstance(com.xiaomi.eco.common.connect.a.class.getClassLoader(), new Class[]{com.xiaomi.eco.common.connect.a.class}, new c());
        x();
    }

    public final void A(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
        ch7 ch7Var = this.o;
        if (ch7Var == null) {
            return;
        }
        ch7Var.onLocalBindSuccess(str, str2, str3, str4, str5, bArr);
    }

    public void B(List<EcoAppNotificationConfig> list) {
    }

    public void C(List<String> list) {
    }

    public final void D(String str, csc cscVar) {
        ch7 ch7Var = this.o;
        if (ch7Var == null) {
            return;
        }
        ch7Var.showOOB(str, new a(cscVar));
    }

    @Override // defpackage.asc
    public final int a(u7r u7rVar, boolean z, p.a aVar) {
        try {
            return this.g.call(dsf.i(u7rVar), z, w(aVar));
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    @Override // defpackage.asc
    public void b(mj7 mj7Var) {
        this.p = mj7Var;
        try {
            this.g.removeBond();
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // defpackage.asc
    public void c(String str, String str2, String str3, String str4, String str5, String str6, boolean z, ch7 ch7Var) {
        this.o = ch7Var;
        try {
            this.g.bindV2(str, str2, str3, str4, str5, str6, z);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // defpackage.asc
    public int connectionType() {
        try {
            return this.g.connectionType();
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    @Override // defpackage.asc
    public void d(String str, byte[] bArr, qj7 qj7Var) {
        Logger.i("start connect with " + str, new Object[0]);
        this.l = qj7Var;
        try {
            this.g.connect(str, bArr);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // defpackage.asc
    public void destroy() {
        try {
            this.g.destroy();
            Logger.i("EcoBaseLocalApiCall", "destroy: did = " + this.f968b);
            EcoApiCallManager.get().destroyEcoCall(this.f968b);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // defpackage.asc
    public void e(et7 et7Var) {
        this.q = et7Var;
        try {
            this.g.disconnect();
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // defpackage.asc
    public void f(p.b bVar) {
        this.f969k = bVar;
    }

    @Override // defpackage.asc
    public void g(String str, byte[] bArr, String str2, String str3, int i, qj7 qj7Var) {
        this.l = qj7Var;
        try {
            this.g.connectV2(str, bArr, str2, str3, i);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    public final com.xiaomi.eco.common.connect.b.a w(p.a aVar) {
        return new b(aVar);
    }

    public final void x() {
        this.f = EcoApiCallManager.get().fetchEcoApiCall(this.c, this.f968b, this.f967a, this.d, new d());
        Logger.d("EcoBaseLocalApiCall", "createRemoteCall: mac=" + this.c + ", did=" + this.f968b + ", remoteCall=" + this.f + ", DataHandler=" + this.m);
    }

    public final void y(int i, u7r u7rVar) {
    }

    public final void z(String str, String str2, String str3, String str4) {
        ch7 ch7Var = this.o;
        if (ch7Var == null) {
            return;
        }
        ch7Var.onBindSuccess(str, str2, str3, str4);
    }
}
