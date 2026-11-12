package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class m6q implements g0q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0q f25816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<j6q> f25817b;
    public final List<j6q> c;
    public final Handler d;
    public ucp e;
    public Handler f;
    public final ConcurrentHashMap<String, i> g;
    public final k6q h;
    public k i;
    public final Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Handler f25818k;
    public u6q[] l;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f25819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y6q.c f25820b;

        public a(i iVar, y6q.c cVar) {
            this.f25819a = iVar;
            this.f25820b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = this.f25819a;
            if (iVar != null) {
                iVar.getClass();
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f25821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y6q.b f25822b;
        public final /* synthetic */ w6q c;

        public b(i iVar, y6q.b bVar, w6q w6qVar) {
            this.f25821a = iVar;
            this.f25822b = bVar;
            this.c = w6qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = this.f25821a;
            if (iVar != null) {
                iVar.getClass();
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
            m6q.this.f25816a.b(new j6q(this.c, 6093, 1025), this.d);
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
            j6q j6qVar = new j6q(this.c, 6093, 1025);
            m6q.this.f25816a.b(j6qVar, true);
            m6q.this.f25816a.b(j6qVar, false);
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
            synchronized (m6q.this.c) {
                m6q.this.f25816a.c(this.c, this.d);
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
            m6q.this.f25816a = new g0q(new j6q(1025), m6q.this.j, m6q.this);
            m6q.this.f25816a.e();
            return "open transmitmanage task";
        }
    }

    public class g extends Handler {
        public g() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 0) {
                return;
            }
            i iVar = (i) message.obj;
            if (iVar != null && iVar.f25824a != null && m6q.this.g.containsKey(iVar.f25824a)) {
                m6q.this.e.e(iVar.f25824a);
                m6q.this.g.remove(iVar.f25824a);
                iVar.f25825b = j.TIMEOUT;
                jpe.a("UDTClientManagerImpl", "remove callback (" + iVar.f25824a + ") for request time out");
                return;
            }
            if (iVar == null) {
                jpe.h("UDTClientManagerImpl", "timecallback invalid,callback is null");
                return;
            }
            jpe.h("UDTClientManagerImpl", "timecallback invalid,no match callback for key:" + iVar.f25824a + ",resulttype:" + iVar.f25825b.name());
            if (iVar.f25825b == j.INIT) {
                Iterator it = m6q.this.g.keySet().iterator();
                while (it.hasNext()) {
                    jpe.a("UDTClientManagerImpl", "has key:" + ((String) it.next()));
                }
            }
        }
    }

    public class h extends vcp {
        public final /* synthetic */ byte[] c;
        public final /* synthetic */ j6q d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, byte[] bArr, j6q j6qVar, int i) {
            super(str);
            this.c = bArr;
            this.d = j6qVar;
            this.e = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String call() {
            jpe.h("UDTClientManagerImpl", "onRecvCtrlByTCP, UDTClient: " + this.d + " inData: " + h5q.a(this.c) + " inTotal size: " + this.e);
            v6q v6qVarB = new u6q(this.c).b();
            if (v6qVarB == null) {
                return "ctrl region is null";
            }
            q6q q6qVarC = v6qVarB.c();
            if (!v6qVarB.d()) {
                String strB = v6qVarB.b();
                i iVar = (i) m6q.this.g.get(strB);
                if (iVar == null) {
                    jpe.b("UDTClientManagerImpl", "timeCallback is null,for requestid:" + strB);
                    return "callback invalid ";
                }
                jpe.b("UDTClientManagerImpl", "callback is null,for requestid:" + strB + ",callresult is :" + iVar.f25825b.name());
                return "callback is null ";
            }
            if (!(q6qVarC instanceof y6q)) {
                return "onRecvCtrlByTCP over";
            }
            y6q y6qVar = (y6q) q6qVarC;
            String strE = y6qVar.e();
            y6q.a aVarD = y6qVar.d();
            Object[] objArrCopyOf = Arrays.copyOf(aVarD.b(), aVarD.b().length + 1);
            objArrCopyOf[objArrCopyOf.length - 1] = v6qVarB.b();
            Class[] clsArr = new Class[objArrCopyOf.length];
            for (int i = 0; i < objArrCopyOf.length; i++) {
                Object obj = objArrCopyOf[i];
                if (obj instanceof JSONArray) {
                    clsArr[i] = Object[].class;
                    JSONArray jSONArray = (JSONArray) obj;
                    int length = jSONArray.length();
                    Object[] objArr = new Object[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            objArr[i2] = jSONArray.get(i2);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    objArrCopyOf[i] = objArr;
                } else {
                    clsArr[i] = obj.getClass();
                }
            }
            jpe.h("UDTClientManagerImpl", "method name: " + strE + " classes: " + clsArr);
            try {
                Method method = k6q.class.getMethod(strE, clsArr);
                jpe.b("UDTClientManagerImpl", "method: " + method);
                method.invoke(m6q.this.h, objArrCopyOf);
                return "onRecvCtrlByTCP over";
            } catch (IllegalAccessException e2) {
                jpe.b("UDTClientManagerImpl", "IllegalAccessException");
                e2.printStackTrace();
                return "onRecvCtrlByTCP over";
            } catch (IllegalArgumentException e3) {
                jpe.b("UDTClientManagerImpl", "IllegalArgumentException");
                e3.printStackTrace();
                return "onRecvCtrlByTCP over";
            } catch (NoSuchMethodException e4) {
                jpe.b("UDTClientManagerImpl", "NoSuchMethodException");
                e4.printStackTrace();
                return "onRecvCtrlByTCP over";
            } catch (InvocationTargetException e5) {
                jpe.b("UDTClientManagerImpl", "InvocationTargetException");
                e5.printStackTrace();
                return "onRecvCtrlByTCP over";
            }
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f25825b;
    }

    public enum j {
        RESPONSE,
        REMOVE,
        CANCEL,
        TIMEOUT,
        INIT
    }

    public interface k {
        void a(boolean z, boolean z2, int i);
    }

    public m6q(Context context) {
        this(context, null);
    }

    public final void A(u6q u6qVar) {
        if (u6qVar == null) {
            jpe.b("UDTClientManagerImpl", "receiveMessage is null");
            return;
        }
        w6q w6qVarC = u6qVar.c();
        i iVarRemove = this.g.remove(u6qVar.b().b());
        if (iVarRemove != null) {
            iVarRemove.f25825b = j.RESPONSE;
            jpe.a("UDTClientManagerImpl", "remove callback (" + iVarRemove.f25824a + ") for request datas over");
        } else {
            jpe.a("UDTClientManagerImpl", "not find callback (" + u6qVar.b().b() + ") for request datas over");
        }
        if (u6qVar.b().c() instanceof y6q) {
            this.f.post(new b(iVarRemove, ((y6q) u6qVar.b().c()).f(), w6qVarC));
        }
    }

    public void B(j6q j6qVar, boolean z) {
        this.e.d(new e("removeConnections", j6qVar, z));
    }

    public final void C(List<j6q> list, j6q j6qVar) {
        if (j6qVar == null) {
            jpe.h("UDTClientManagerImpl", "udtclien is null ,not remove");
            return;
        }
        if (list.size() == 0) {
            jpe.h("UDTClientManagerImpl", "ctrl udt client is null ,need not remove");
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            j6q j6qVar2 = list.get(i2);
            if (j6qVar2 != null && v(j6qVar2, j6qVar)) {
                list.remove(i2);
                jpe.h("UDTClientManagerImpl", "find udt in list and remove it");
                return;
            }
        }
        jpe.h("UDTClientManagerImpl", "not find udt in list and need not remove in list");
    }

    public final void D(j6q j6qVar, boolean z) {
        if (z) {
            synchronized (this.f25817b) {
                C(this.f25817b, j6qVar);
            }
        } else {
            synchronized (this.c) {
                C(this.c, j6qVar);
            }
        }
        k kVar = this.i;
        if (kVar != null) {
            kVar.a(z, false, j6qVar.b());
        }
    }

    public void E(k kVar) {
        this.i = kVar;
    }

    @Override // g0q.a
    public void a(j6q j6qVar, boolean z) {
        jpe.h("UDTClientManagerImpl", "onConnectionCreated, inDstClient: " + j6qVar + " isCtrlConnection: " + z);
        q(j6qVar, z);
    }

    @Override // g0q.a
    public void b(j6q j6qVar, byte[] bArr, int i2) {
        this.e.d(new h("onRecvCtrlByTCP", bArr, j6qVar, i2));
    }

    @Override // g0q.a
    public void c(j6q j6qVar, boolean z) {
        jpe.h("UDTClientManagerImpl", "onConnectionRemoved, inDstClient: " + j6qVar + " isCtrlConnection: " + z);
        D(j6qVar, z);
    }

    @Override // g0q.a
    public void d(j6q j6qVar) {
    }

    @Override // g0q.a
    public void e(j6q j6qVar, byte[] bArr, int i2) {
        jpe.h("UDTClientManagerImpl", "onRecvDataByUDP, UDTClient: " + j6qVar + " inData: " + bArr + " inTotal size: " + i2);
    }

    @Override // g0q.a
    public void f() {
        jpe.h("UDTClientManagerImpl", "onTransmitManagerReady");
    }

    @Override // g0q.a
    public void g(j6q j6qVar) {
        jpe.h("UDTClientManagerImpl", "onRecvDone, inDstClient:  " + j6qVar);
    }

    @Override // g0q.a
    public void h(j6q j6qVar, byte[] bArr, int i2) {
        jpe.h("UDTClientManagerImpl", "onRecvDataByTCP, UDTClient: " + j6qVar + " inTotal size: " + i2 + " inData: " + h5q.a(bArr));
        u6q u6qVar = new u6q(bArr);
        v6q v6qVarB = u6qVar.b();
        String strB = v6qVarB.b();
        q6q q6qVarC = v6qVarB.c();
        if (!(v6qVarB.c() instanceof y6q)) {
            jpe.a("UDTClientManagerImpl", "not UDTMethodController,message ctrl region: " + u6qVar.b().f().toString());
            return;
        }
        y6q.c cVarG = ((y6q) q6qVarC).g();
        i iVar = this.g.get(strB);
        if (cVarG == null) {
            jpe.a("UDTClientManagerImpl", "page data is null,return directly");
            A(u6qVar);
            return;
        }
        if (cVarG.a() == 1) {
            jpe.a("UDTClientManagerImpl", "start receive data channel first page data..");
            u6q[] u6qVarArr = new u6q[cVarG.b()];
            this.l = u6qVarArr;
            u6qVarArr[0] = u6qVar;
            if (cVarG.b() == 1) {
                z();
                jpe.h("UDTClientManagerImpl", "receive data channel last page data.., receive done!");
            }
        } else if (w(u6qVar)) {
            this.l[cVarG.a() - 1] = u6qVar;
            if (cVarG.a() == cVarG.b()) {
                z();
                jpe.h("UDTClientManagerImpl", "receive data channel last page data.., receive done!");
            }
        } else {
            jpe.b("UDTClientManagerImpl", "udt message is not valid, cancel assemble");
            this.l = null;
        }
        this.f.post(new a(iVar, cVarG));
    }

    public final void p(List<j6q> list, j6q j6qVar) {
        if (j6qVar == null) {
            jpe.h("UDTClientManagerImpl", "udtclien is null ,not add");
            return;
        }
        if (list.size() == 0) {
            list.add(j6qVar);
            jpe.h("UDTClientManagerImpl", "add udtclien(id: " + j6qVar.a() + ",ip:" + j6qVar.b() + ",port :" + j6qVar.c() + ")");
            return;
        }
        Iterator<j6q> it = list.iterator();
        while (it.hasNext()) {
            if (v(it.next(), j6qVar)) {
                jpe.h("UDTClientManagerImpl", "udtclien has contain ,not add");
                return;
            }
        }
        jpe.h("UDTClientManagerImpl", "add udtclien(id: " + j6qVar.a() + ",ip:" + j6qVar.b() + ",port :" + j6qVar.c() + ")");
        list.add(j6qVar);
    }

    public final void q(j6q j6qVar, boolean z) {
        if (z) {
            synchronized (this.f25817b) {
                p(this.f25817b, j6qVar);
            }
        } else {
            synchronized (this.c) {
                p(this.c, j6qVar);
            }
        }
        k kVar = this.i;
        if (kVar != null) {
            kVar.a(z, true, j6qVar.b());
        }
    }

    public void r(int i2) {
        this.e.d(new d("createConnections for all", i2));
    }

    public void s(int i2, boolean z) {
        this.e.d(new c("createConnections for single", i2, z));
    }

    public List<j6q> t() {
        return this.f25817b;
    }

    public List<j6q> u() {
        return this.c;
    }

    public final boolean v(j6q j6qVar, j6q j6qVar2) {
        return j6qVar2 != null && j6qVar != null && j6qVar.a() == j6qVar2.a() && j6qVar.b() == j6qVar2.b() && j6qVar.c() == j6qVar2.c();
    }

    public final boolean w(u6q u6qVar) {
        if (this.l == null) {
            return false;
        }
        v6q v6qVarB = u6qVar.b();
        String strB = v6qVarB.b();
        jpe.b("UDTClientManagerImpl", "message ctrl region: " + u6qVar.b().f().toString());
        jpe.b("UDTClientManagerImpl", "message ending region: " + u6qVar.d().b().toString());
        if (!(v6qVarB.c() instanceof y6q)) {
            return false;
        }
        y6q y6qVar = (y6q) v6qVarB.c();
        y6q.c cVarG = y6qVar.g();
        if (cVarG.a() - 2 >= 0) {
            int iA = cVarG.a() - 2;
            u6q[] u6qVarArr = this.l;
            if (iA <= u6qVarArr.length - 1) {
                u6q u6qVar2 = u6qVarArr[cVarG.a() - 2];
                if (!strB.equals(u6qVar2.b().b())) {
                    jpe.b("UDTClientManagerImpl", "request id is not equal");
                    return false;
                }
                if (!(u6qVar2.b().c() instanceof y6q)) {
                    return false;
                }
                y6q y6qVar2 = (y6q) u6qVar2.b().c();
                if (y6qVar2.c() != y6qVar.c()) {
                    jpe.b("UDTClientManagerImpl", "call id is not equal");
                    return false;
                }
                y6q.c cVarG2 = y6qVar2.g();
                return cVarG2.a() + 1 == cVarG.a() && cVarG2.b() == cVarG.b() && cVarG2.c() == cVarG.c();
            }
        }
        jpe.b("UDTClientManagerImpl", "pagingData.getPageNo(): " + cVarG.a() + " mReceviedDataUDTMessages.length :" + this.l.length);
        return false;
    }

    public void x() {
        ucp ucpVar = new ucp();
        this.e = ucpVar;
        ucpVar.h();
        this.e.d(new f("open TransmitManager"));
    }

    public void y() {
        jpe.b("UDTClientManagerImpl", "onActivityDestroy");
        ConcurrentHashMap<String, i> concurrentHashMap = this.g;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        List<j6q> list = this.c;
        if (list != null) {
            synchronized (list) {
                this.c.clear();
            }
        }
        List<j6q> list2 = this.f25817b;
        if (list2 != null) {
            synchronized (list2) {
                this.f25817b.clear();
            }
        }
        g0q g0qVar = this.f25816a;
        if (g0qVar != null) {
            g0qVar.a();
        }
        ucp ucpVar = this.e;
        if (ucpVar != null) {
            ucpVar.i();
        }
    }

    public final void z() {
        try {
            A(u6q.g(this.l));
        } catch (JSONException e2) {
            e2.printStackTrace();
            jpe.b("UDTClientManagerImpl", "packing sliced method message failed");
        }
    }

    public m6q(Context context, Handler handler) {
        Handler handler2 = new Handler();
        this.d = handler2;
        this.f = null;
        this.g = new ConcurrentHashMap<>();
        this.f25818k = new g();
        this.j = context;
        this.h = new k6q();
        this.f25817b = new ArrayList();
        this.c = new ArrayList();
        if (handler == null) {
            this.f = handler2;
        } else {
            this.f = handler;
        }
    }
}
