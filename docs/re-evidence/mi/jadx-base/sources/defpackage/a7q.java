package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class a7q implements g0q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0q f730b;
    public final List<j6q> c;
    public final List<j6q> d;
    public final Handler e;
    public ucp f;
    public Handler g;
    public final ConcurrentHashMap<String, j> h;
    public final k6q i;
    public m6q.k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f731k;
    public final Handler l;
    public u6q[] m;
    public final List<String> n;
    public final Map<Integer, i> o;
    public final Object p;
    public final Map<String, String> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f732r;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y6q.c f734b;

        public a(j jVar, y6q.c cVar) {
            this.f733a = jVar;
            this.f734b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = this.f733a;
            if (jVar != null) {
                jVar.getClass();
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y6q.b f736b;
        public final /* synthetic */ w6q c;

        public b(j jVar, y6q.b bVar, w6q w6qVar) {
            this.f735a = jVar;
            this.f736b = bVar;
            this.c = w6qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = this.f735a;
            if (jVar != null) {
                jVar.getClass();
            }
        }
    }

    public class c extends vcp {
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i, boolean z) {
            super(str);
            this.c = i;
            this.d = z;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String call() {
            a7q.this.f730b.b(new j6q(this.c, 6093, a7q.this.u()), this.d);
            return "create connecttion(" + this.d + "," + this.c + ") task is over";
        }
    }

    public class d extends vcp {
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, int i) {
            super(str);
            this.c = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String call() {
            j6q j6qVar = new j6q(this.c, 6093, a7q.this.u());
            a7q.this.f730b.b(j6qVar, true);
            a7q.this.f730b.b(j6qVar, false);
            return "create connecttion for all task is over";
        }
    }

    public class e extends vcp {
        public final /* synthetic */ j6q c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, j6q j6qVar, boolean z) {
            super(str);
            this.c = j6qVar;
            this.d = z;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String call() {
            synchronized (a7q.this.d) {
                a7q.this.f730b.c(this.c, this.d);
            }
            return "remove removeCurrentDataConnections task is over";
        }
    }

    public class f extends vcp {
        public f(String str) {
            super(str);
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String call() {
            jpe.b("UDTOperationClientMI", "create TransmitManager");
            a7q a7qVar = a7q.this;
            a7qVar.f730b = new g0q(new j6q(a7qVar.u()), a7q.this.f731k, a7q.this);
            a7q.this.f730b.e();
            return "open transmitmanage task";
        }
    }

    public class g extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j6q f737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f738b;

        public g(j6q j6qVar, byte[] bArr) {
            this.f737a = j6qVar;
            this.f738b = bArr;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a7q.this.f730b.d(this.f737a, this.f738b);
        }
    }

    public class h extends Handler {
        public h() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 0) {
                return;
            }
            j jVar = (j) message.obj;
            if (jVar != null && jVar.f740a != null && a7q.this.h.containsKey(jVar.f740a)) {
                a7q.this.f.e(jVar.f740a);
                a7q.this.h.remove(jVar.f740a);
                jVar.f741b = k.TIMEOUT;
                jpe.a("UDTOperationClientMI", "remove callback (" + jVar.f740a + ") for request time out");
                return;
            }
            if (jVar == null) {
                jpe.h("UDTOperationClientMI", "timecallback invalid,callback is null");
                return;
            }
            jpe.h("UDTOperationClientMI", "timecallback invalid,no match callback for key:" + jVar.f740a + ",resulttype:" + jVar.f741b.name());
            if (jVar.f741b == k.INIT) {
                Iterator it = a7q.this.h.keySet().iterator();
                while (it.hasNext()) {
                    jpe.a("UDTOperationClientMI", "has key:" + ((String) it.next()));
                }
            }
        }
    }

    public interface i {
        void a(String str, boolean z, byte[] bArr);

        void b(int i, int i2);
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k f741b;
    }

    public enum k {
        RESPONSE,
        REMOVE,
        CANCEL,
        TIMEOUT,
        INIT
    }

    public a7q(Context context, int i2) {
        this(context, (Handler) null);
        this.f729a = i2;
    }

    private void D() {
        try {
            E(u6q.g(this.m));
        } catch (JSONException e2) {
            e2.printStackTrace();
            jpe.b("UDTOperationClientMI", "packing sliced method message failed");
        }
    }

    private void E(u6q u6qVar) {
        if (u6qVar == null) {
            jpe.b("UDTOperationClientMI", "receiveMessage is null");
            return;
        }
        w6q w6qVarC = u6qVar.c();
        j jVarRemove = this.h.remove(u6qVar.b().b());
        if (jVarRemove != null) {
            jVarRemove.f741b = k.RESPONSE;
            jpe.a("UDTOperationClientMI", "remove callback (" + jVarRemove.f740a + ") for request datas over");
        } else {
            jpe.a("UDTOperationClientMI", "not find callback (" + u6qVar.b().b() + ") for request datas over");
        }
        if (u6qVar.b().c() instanceof y6q) {
            this.g.post(new b(jVarRemove, ((y6q) u6qVar.b().c()).f(), w6qVarC));
        }
    }

    private void G(List<j6q> list, j6q j6qVar) {
        if (j6qVar == null) {
            jpe.h("UDTOperationClientMI", "udtclien is null ,not remove");
            return;
        }
        if (list.size() == 0) {
            jpe.h("UDTOperationClientMI", "ctrl udt client is null ,need not remove");
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            j6q j6qVar2 = list.get(i2);
            if (j6qVar2 != null && y(j6qVar2, j6qVar)) {
                list.remove(i2);
                jpe.h("UDTOperationClientMI", "find udt in list and remove it");
                return;
            }
        }
        jpe.h("UDTOperationClientMI", "not find udt in list and need not remove in list");
    }

    private void H(j6q j6qVar, boolean z) {
        if (z) {
            synchronized (this.c) {
                G(this.c, j6qVar);
            }
        } else {
            synchronized (this.d) {
                G(this.d, j6qVar);
            }
        }
        m6q.k kVar = this.j;
        if (kVar != null) {
            kVar.a(z, false, j6qVar.b());
        }
    }

    private void p(List<j6q> list, j6q j6qVar) {
        if (j6qVar == null) {
            jpe.h("UDTOperationClientMI", "udtclien is null ,not add");
            return;
        }
        if (list.size() == 0) {
            list.add(j6qVar);
            jpe.h("UDTOperationClientMI", "add udtclien(id: " + j6qVar.a() + ",ip:" + j6qVar.b() + ",port :" + j6qVar.c() + ")");
            return;
        }
        Iterator<j6q> it = list.iterator();
        while (it.hasNext()) {
            if (y(it.next(), j6qVar)) {
                jpe.h("UDTOperationClientMI", "udtclien has contain ,not add");
                return;
            }
        }
        jpe.h("UDTOperationClientMI", "add udtclien(id: " + j6qVar.a() + ",ip:" + j6qVar.b() + ",port :" + j6qVar.c() + ")");
        list.add(j6qVar);
    }

    private void q(j6q j6qVar, boolean z) {
        jpe.h("UDTOperationClientMI", "addUdtClient(UDTClient udtClient,boolean isCtrl)");
        if (z) {
            synchronized (this.c) {
                p(this.c, j6qVar);
            }
        } else {
            synchronized (this.d) {
                p(this.d, j6qVar);
            }
        }
        m6q.k kVar = this.j;
        if (kVar != null) {
            kVar.a(z, true, j6qVar.b());
        }
    }

    private boolean y(j6q j6qVar, j6q j6qVar2) {
        return j6qVar2 != null && j6qVar != null && j6qVar.a() == j6qVar2.a() && j6qVar.b() == j6qVar2.b() && j6qVar.c() == j6qVar2.c();
    }

    private boolean z(u6q u6qVar) {
        if (this.m == null) {
            return false;
        }
        v6q v6qVarB = u6qVar.b();
        String strB = v6qVarB.b();
        jpe.b("UDTOperationClientMI", "message ctrl region: " + u6qVar.b().f().toString());
        jpe.b("UDTOperationClientMI", "message ending region: " + u6qVar.d().b().toString());
        if (!(v6qVarB.c() instanceof y6q)) {
            return false;
        }
        y6q y6qVar = (y6q) v6qVarB.c();
        y6q.c cVarG = y6qVar.g();
        if (cVarG.a() - 2 >= 0) {
            int iA = cVarG.a() - 2;
            u6q[] u6qVarArr = this.m;
            if (iA <= u6qVarArr.length - 1) {
                u6q u6qVar2 = u6qVarArr[cVarG.a() - 2];
                if (!strB.equals(u6qVar2.b().b())) {
                    jpe.b("UDTOperationClientMI", "request id is not equal");
                    return false;
                }
                if (!(u6qVar2.b().c() instanceof y6q)) {
                    return false;
                }
                y6q y6qVar2 = (y6q) u6qVar2.b().c();
                if (y6qVar2.c() != y6qVar.c()) {
                    jpe.b("UDTOperationClientMI", "call id is not equal");
                    return false;
                }
                y6q.c cVarG2 = y6qVar2.g();
                return cVarG2.a() + 1 == cVarG.a() && cVarG2.b() == cVarG.b() && cVarG2.c() == cVarG.c();
            }
        }
        jpe.b("UDTOperationClientMI", "pagingData.getPageNo(): " + cVarG.a() + " mReceviedDataUDTMessages.length :" + this.m.length);
        return false;
    }

    public void A() {
        ucp ucpVar = new ucp();
        this.f = ucpVar;
        ucpVar.h();
        this.f.d(new f("open TransmitManager"));
    }

    public void B() {
        jpe.b("UDTOperationClientMI", "onActivityDestroy");
        this.h.clear();
        synchronized (this.d) {
            this.d.clear();
        }
        synchronized (this.c) {
            this.c.clear();
        }
        g0q g0qVar = this.f730b;
        if (g0qVar != null) {
            g0qVar.a();
        }
        this.f.i();
    }

    public int C(String str, int i2) {
        jpe.a("UDTOperationClientMI", "onCommandResult");
        synchronized (this.p) {
            String str2 = this.q.get(str);
            if (str2 != null) {
                String[] strArrSplit = str2.split("::");
                jpe.a("UDTOperationClientMI", "obj is " + str2);
                if (this.o.get(Integer.valueOf(strArrSplit[0])) != null) {
                    try {
                        jpe.k("UDTOperationClientMI", "onCommandResult for app: " + strArrSplit[0]);
                        this.o.get(Integer.valueOf(strArrSplit[0])).b(2, i2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    jpe.a("UDTOperationClientMI", "mPushCallbackTable is null");
                }
                this.q.remove(str);
            } else {
                jpe.a("UDTOperationClientMI", "obj is null");
            }
        }
        return 0;
    }

    public void F(j6q j6qVar, boolean z) {
        this.f.d(new e("removeConnections", j6qVar, z));
    }

    public void I(byte[] bArr) {
        if (this.c.size() == 0) {
            jpe.h("UDTOperationClientMI", "no connected ctrl UDTClient");
            return;
        }
        jpe.h("UDTOperationClientMI", "send ctrl data for " + this.c.size() + " clients");
        for (j6q j6qVar : this.c) {
            jpe.h("UDTOperationClientMI", "sendCtrlByTCP mCtrlUDTClientLists");
            if (j6qVar != null) {
                jpe.h("UDTOperationClientMI", "sendCtrlByTCP udtClient != null");
                new g(j6qVar, bArr).start();
            }
        }
    }

    public void J(m6q.k kVar) {
        this.j = kVar;
    }

    @Override // g0q.a
    public void a(j6q j6qVar, boolean z) {
        jpe.h("UDTOperationClientMI", "onConnectionCreated, inDstClient: " + j6qVar + " isCtrlConnection: " + z);
        StringBuilder sb = new StringBuilder();
        sb.append("mAppID = ");
        sb.append(this.f729a);
        jpe.h("UDTOperationClientMI", sb.toString());
        q(j6qVar, z);
    }

    @Override // g0q.a
    public void b(j6q j6qVar, byte[] bArr, int i2) {
        jpe.h("UDTOperationClientMI", "onRecvCtrlByTCP, UDTClient: " + j6qVar + " inData: " + h5q.a(bArr) + " inTotal size: " + i2);
        v6q v6qVarB = new u6q(bArr).b();
        q6q q6qVarC = v6qVarB.c();
        String strB = v6qVarB.b();
        if (!(q6qVarC instanceof b7q)) {
            jpe.b("UDTOperationClientMI", "It is NOT operationController.");
            return;
        }
        jpe.b("UDTOperationClientMI", "udtController instanceof UDTOperationController, requestId = " + strB + " ctrlRegion.isRequest() = " + v6qVarB.d());
        b7q b7qVar = (b7q) q6qVarC;
        StringBuilder sb = new StringBuilder();
        sb.append("udtController instanceof UDTOperationController, operationController.getTopic() = ");
        sb.append(b7qVar.d());
        jpe.b("UDTOperationClientMI", sb.toString());
        if (v6qVarB.d() && !TextUtils.isEmpty(strB)) {
            try {
                jpe.b("UDTOperationClientMI", "request from remote");
                I(r("Operation/ACK", "OK".getBytes(), strB, b7qVar.e(), false).e());
                x(b7qVar.d(), b7qVar.c(), b7qVar.e());
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (v6qVarB.d() || TextUtils.isEmpty(strB)) {
            return;
        }
        if (!b7qVar.d().startsWith("Operation/ACK")) {
            jpe.b("UDTOperationClientMI", "It is not Request and topic is useless: " + b7qVar.d());
            return;
        }
        String str = new String(b7qVar.c());
        jpe.b("UDTOperationClientMI", "ackResult = " + str);
        C(strB, !str.startsWith("OK") ? 1 : 0);
    }

    @Override // g0q.a
    public void c(j6q j6qVar, boolean z) {
        jpe.h("UDTOperationClientMI", "onConnectionRemoved, inDstClient: " + j6qVar + " isCtrlConnection: " + z);
        H(j6qVar, z);
    }

    @Override // g0q.a
    public void d(j6q j6qVar) {
    }

    @Override // g0q.a
    public void e(j6q j6qVar, byte[] bArr, int i2) {
        jpe.h("UDTOperationClientMI", "onRecvDataByUDP, UDTClient: " + j6qVar + " inData: " + bArr + " inTotal size: " + i2);
    }

    @Override // g0q.a
    public void f() {
        jpe.h("UDTOperationClientMI", "onTransmitManagerReady");
    }

    @Override // g0q.a
    public void g(j6q j6qVar) {
        jpe.h("UDTOperationClientMI", "onRecvDone, inDstClient:  " + j6qVar);
    }

    @Override // g0q.a
    public void h(j6q j6qVar, byte[] bArr, int i2) {
        jpe.h("UDTOperationClientMI", "onRecvDataByTCP, UDTClient: " + j6qVar + " inTotal size: " + i2 + " inData: " + h5q.a(bArr));
        u6q u6qVar = new u6q(bArr);
        v6q v6qVarB = u6qVar.b();
        String strB = v6qVarB.b();
        q6q q6qVarC = v6qVarB.c();
        if (!(v6qVarB.c() instanceof y6q)) {
            jpe.a("UDTOperationClientMI", "not UDTMethodController,message ctrl region: " + u6qVar.b().f().toString());
            return;
        }
        y6q.c cVarG = ((y6q) q6qVarC).g();
        j jVar = this.h.get(strB);
        if (cVarG == null) {
            jpe.a("UDTOperationClientMI", "page data is null,return directly");
            E(u6qVar);
            return;
        }
        if (cVarG.a() == 1) {
            jpe.a("UDTOperationClientMI", "start receive data channel first page data..");
            u6q[] u6qVarArr = new u6q[cVarG.b()];
            this.m = u6qVarArr;
            u6qVarArr[0] = u6qVar;
            if (cVarG.b() == 1) {
                D();
                jpe.h("UDTOperationClientMI", "receive data channel last page data.., receive done!");
            }
        } else if (z(u6qVar)) {
            this.m[cVarG.a() - 1] = u6qVar;
            if (cVarG.a() == cVarG.b()) {
                D();
                jpe.h("UDTOperationClientMI", "receive data channel last page data.., receive done!");
            }
        } else {
            jpe.b("UDTOperationClientMI", "udt message is not valid, cancel assemble");
            this.m = null;
        }
        this.g.post(new a(jVar, cVarG));
    }

    public u6q r(String str, byte[] bArr, String str2, boolean z, boolean z2) {
        v6q v6qVar = new v6q(0, z2, new b7q(str, z, bArr));
        v6qVar.e(str2);
        return new u6q(v6qVar, w6q.b(), new x6q(str2));
    }

    public void s(int i2) {
        this.f.d(new d("createConnections for all", i2));
    }

    public void t(int i2, boolean z) {
        this.f.d(new c("createConnections for single", i2, z));
    }

    public final int u() {
        int i2 = this.f729a;
        if (i2 != -1) {
            return i2;
        }
        return 1025;
    }

    public List<j6q> v() {
        return this.c;
    }

    public List<j6q> w() {
        return this.d;
    }

    public int x(String str, byte[] bArr, boolean z) {
        int iIntValue;
        jpe.b("UDTOperationClientMI", "handleData, topic = " + str + " data.length = " + bArr.length + " isCtrl = " + z);
        synchronized (this.p) {
            try {
                Iterator<String> it = this.n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        iIntValue = -1;
                        break;
                    }
                    String next = it.next();
                    jpe.b("UDTOperationClientMI", "str in pushTopic = " + next);
                    String[] strArrSplit = next.split("::");
                    if (str.startsWith(strArrSplit[1])) {
                        iIntValue = Integer.valueOf(strArrSplit[0]).intValue();
                        jpe.a("UDTOperationClientMI", "mgrID in subscribe table is " + iIntValue);
                        break;
                    }
                }
                if (!this.o.containsKey(Integer.valueOf(iIntValue))) {
                    return -1;
                }
                if (this.o.get(Integer.valueOf(iIntValue)) != null) {
                    jpe.b("UDTOperationClientMI", "forward topic: " + str + "to app: " + iIntValue);
                    this.o.get(Integer.valueOf(iIntValue)).a(str, z, bArr);
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a7q(Context context, Handler handler) {
        this.f729a = -1;
        Handler handler2 = new Handler();
        this.e = handler2;
        this.g = null;
        this.h = new ConcurrentHashMap<>();
        this.l = new h();
        this.n = new ArrayList();
        this.o = new Hashtable();
        this.p = new Object();
        this.q = new Hashtable();
        this.f732r = 0;
        this.f731k = context;
        this.i = new k6q();
        this.c = new ArrayList();
        this.d = new ArrayList();
        if (handler == null) {
            this.g = handler2;
        } else {
            this.g = handler;
        }
    }
}
