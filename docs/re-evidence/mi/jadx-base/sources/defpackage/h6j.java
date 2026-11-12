package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class h6j extends HandlerThread implements t6c.a {
    public static qwc p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f19744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SocketChannel f19745b;
    public String c;
    public int d;
    public String e;
    public volatile boolean f;
    public Selector g;
    public ConcurrentLinkedQueue<i62> h;
    public t6c i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19746k;
    public b l;
    public String m;
    public g1 n;
    public Boolean o;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                h6j.this.r();
                return;
            }
            if (i == 2) {
                h6j.this.s(ae4.e);
                return;
            }
            if (i == 3) {
                h6j.this.x();
                return;
            }
            if (i == 5) {
                h6j.this.t();
            } else {
                if (i != 6) {
                    return;
                }
                h6j.this.quitSafely();
                jpe.e("RCClientThreadV2", "stopService");
            }
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Selector f19748a;
        public t6c d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19749b = 10000;
        public volatile boolean c = false;
        public final int e = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        public final ByteBuffer f = ByteBuffer.allocateDirect(3);
        public ByteBuffer g = null;
        public byte[] h = null;

        public b(Selector selector, t6c t6cVar) {
            this.f19748a = selector;
            this.d = t6cVar;
            setName("ReadThread");
        }

        public void a() {
            this.c = true;
        }

        public final void b(SocketChannel socketChannel) throws IOException {
            this.f.clear();
            if (socketChannel.read(this.f) == -1) {
                jpe.e("ReadThread", "Thread name:" + Thread.currentThread().getName() + "threadId:" + Thread.currentThread().getId());
                throw new IOException("read len -1,peer closed");
            }
            byte[] bArr = new byte[3];
            this.f.flip();
            this.f.get(bArr, 0, 3);
            short s = (short) (((bArr[1] << 8) & 65280) | (bArr[2] & 255));
            if (s > 1500 || s < 0) {
                jpe.g("ReadThread", "date length invalid:" + ((int) s));
            } else if (s > 0) {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(s);
                this.g = byteBufferAllocateDirect;
                byteBufferAllocateDirect.clear();
                jpe.f("ReadThread", "   read --------command-------len:" + socketChannel.read(this.g));
                this.g.flip();
                byte[] bArr2 = new byte[this.g.remaining() + 3];
                this.h = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, 3);
                byte[] bArr3 = this.h;
                this.g.get(bArr3, 3, bArr3.length - 3);
            } else {
                byte[] bArr4 = new byte[3];
                this.h = bArr4;
                System.arraycopy(bArr, 0, bArr4, 0, 3);
            }
            byte b2 = this.h[0];
            jpe.f("ReadThread", "read " + this.h.length + " bytes type:" + ((int) b2));
            if (b2 == 2) {
                jpe.f("ReadThread", "heart beat");
                return;
            }
            if (b2 == 11) {
                jpe.f("ReadThread", "RC IR");
                if (l6j.a(this.h) < 0) {
                    jpe.e("ReadThread", "handle irdata failed");
                    return;
                }
                return;
            }
            if (b2 == 4) {
                jpe.f("ReadThread", "receive send key message");
                atl atlVarA = i6j.a(this.h);
                if (atlVarA == null) {
                    jpe.f("ReadThread", "handle sendkey failed");
                    return;
                }
                int iC = atlVarA.c().c();
                byte bA = zsl.a(iC);
                qwc qwcVar = h6j.p;
                if (qwcVar != null) {
                    qwcVar.c(iC, bA, atlVarA.b());
                    return;
                }
                return;
            }
            if (b2 == 5) {
                jpe.f("ReadThread", "version packet");
                dpq dpqVarA = fpq.a(this.h);
                if (q6j.p()) {
                    c(dpqVarA);
                    return;
                }
                return;
            }
            if (b2 == 6) {
                jpe.f("ReadThread", "receive send touch message");
                return;
            }
            jpe.g("ReadThread", "type [" + ((int) b2) + "] not handled");
        }

        public final void c(dpq dpqVar) {
            if (dpqVar == null || dpqVar.d() == null) {
                return;
            }
            if (dpqVar.d().b() <= 16777984) {
                jpe.f("ReadThread", "不支持加密1");
                h6j.this.o = Boolean.FALSE;
            } else if (!TextUtils.isEmpty(dpqVar.c())) {
                jpe.h("ReadThread", "TextJson: " + dpqVar.c());
                try {
                    String strOptString = new JSONObject(dpqVar.c()).optString("secretKey");
                    String strB = oz0.b(strOptString, sz0.g().b().c());
                    h6j.this.n = new g1();
                    if (h6j.this.n.b(strB)) {
                        jpe.f("ReadThread", "支持加密1");
                        jpe.h("ReadThread", strOptString);
                        h6j.this.o = Boolean.TRUE;
                    } else {
                        jpe.f("ReadThread", "不支持加密2");
                        h6j.this.n = null;
                        h6j.this.o = Boolean.FALSE;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    h6j.this.n = null;
                }
            }
            qwc qwcVar = h6j.p;
            if (qwcVar != null) {
                qwcVar.b(5, dpqVar.d());
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!this.c && !Thread.interrupted()) {
                try {
                    try {
                        if (this.f19748a.select(this.f19749b) == 0) {
                            t6c t6cVar = this.d;
                            if (t6cVar != null) {
                                t6cVar.a();
                            }
                        } else {
                            Set<SelectionKey> setSelectedKeys = this.f19748a.selectedKeys();
                            if (setSelectedKeys.size() == 0) {
                                jpe.f("ReadThread", " select keys 0");
                            } else {
                                Iterator<SelectionKey> it = setSelectedKeys.iterator();
                                while (it.hasNext()) {
                                    SelectionKey next = it.next();
                                    if (next.isValid() && next.isReadable()) {
                                        t6c t6cVar2 = this.d;
                                        if (t6cVar2 != null) {
                                            t6cVar2.b();
                                        }
                                        jpe.f("ReadThread", "receive readable op");
                                        try {
                                            b((SocketChannel) next.channel());
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                            h6j.this.s(ae4.j);
                                        }
                                    }
                                    it.remove();
                                }
                            }
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        jpe.b("ReadThread", "socket read thread end");
                    }
                } catch (ClosedSelectorException e3) {
                    e3.printStackTrace();
                }
            }
            jpe.b("ReadThread", "socket read thread end");
        }
    }

    public h6j(String str) {
        super(str);
        this.f = false;
        this.h = new ConcurrentLinkedQueue<>();
        this.j = 5000;
        this.f19746k = false;
        this.m = null;
        this.o = Boolean.FALSE;
        this.i = new t6c(this);
        jpe.f("RCClientThreadV2", "new socket thread");
    }

    public final void A() {
        b bVar = new b(this.g, this.i);
        this.l = bVar;
        bVar.start();
    }

    public void B() {
        this.f = true;
        Handler handler = this.f19744a;
        if (handler != null) {
            handler.sendEmptyMessage(6);
        }
    }

    @Override // t6c.a
    public void a() {
        if (p != null) {
            q(ae4.f917k);
        }
        j();
    }

    public int i(String str, String str2, String str3, int i) {
        this.c = str3;
        this.d = i;
        Handler handler = this.f19744a;
        if (handler == null) {
            return 0;
        }
        handler.sendEmptyMessage(1);
        return 0;
    }

    public void j() {
        Handler handler = this.f19744a;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        this.f = true;
    }

    public byte[] k(byte[] bArr, g1 g1Var) {
        if (g1Var == null) {
            return bArr;
        }
        byte b2 = bArr[0];
        int length = bArr.length - 3;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 3, bArr2, 0, length);
        byte[] bArrA = g1Var.a(bArr2);
        return l73.a(new j6j(b2, (short) bArrA.length).a(), bArrA);
    }

    public String l() {
        return this.e;
    }

    public boolean m() {
        SocketChannel socketChannel = this.f19745b;
        return socketChannel != null && socketChannel.isConnected();
    }

    public boolean n() {
        return this.f19746k;
    }

    public final void o() {
        jpe.f("RCClientThreadV2", "onConnected:");
        x();
        String string = null;
        if (q6j.p()) {
            yq1 yq1VarG = sz0.g();
            if (yq1VarG != null && yq1VarG.b() != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("deviceId", yq1VarG.b().e());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                string = jSONObject.toString();
                jpe.h("RCClientThreadV2", string);
            }
            z(string);
        } else {
            z(null);
        }
        qwc qwcVar = p;
        if (qwcVar != null) {
            qwcVar.onConnected();
        }
        this.f19746k = false;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        super.onLooperPrepared();
        if (this.f) {
            quitSafely();
            return;
        }
        this.f19744a = new a(getLooper());
        if (TextUtils.isEmpty(this.c) || this.d <= 0) {
            return;
        }
        r();
    }

    public final void p(int i, String str) {
        qwc qwcVar = p;
        if (qwcVar != null) {
            qwcVar.a(0, i, str);
        }
    }

    public final void q(ae4 ae4Var) {
        qwc qwcVar = p;
        if (qwcVar != null) {
            qwcVar.d(ae4Var);
        }
    }

    public final void r() {
        if (TextUtils.isEmpty(this.c)) {
            p(-1007, "ip is null");
            return;
        }
        jpe.f("RCClientThreadV2", "start connect");
        this.f = false;
        SocketChannel socketChannel = this.f19745b;
        if (socketChannel != null) {
            try {
                socketChannel.close();
                this.f19745b = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        qwc qwcVar = p;
        if (qwcVar != null) {
            qwcVar.e();
        }
        try {
            this.f19746k = true;
            SocketChannel socketChannelOpen = SocketChannel.open();
            this.f19745b = socketChannelOpen;
            socketChannelOpen.configureBlocking(true);
            boolean zConnect = this.f19745b.connect(new InetSocketAddress(this.c, this.d));
            this.e = this.c;
            this.f19745b.configureBlocking(false);
            if (zConnect) {
                Selector selectorOpen = Selector.open();
                this.g = selectorOpen;
                this.f19745b.register(selectorOpen, 1);
            }
            o();
            A();
        } catch (IOException e2) {
            e2.printStackTrace();
            q(new ae4(e2.getMessage(), -1));
            this.f = true;
        }
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        SocketChannel socketChannel = this.f19745b;
        if (socketChannel != null) {
            try {
                socketChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f19745b = null;
        }
        Handler handler = this.f19744a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        b bVar = this.l;
        if (bVar != null) {
            bVar.a();
            this.l = null;
        }
        this.f19744a = null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e A[Catch: all -> 0x001f, IOException -> 0x0037, TRY_LEAVE, TryCatch #0 {IOException -> 0x0037, blocks: (B:15:0x0025, B:17:0x002e, B:14:0x0022), top: B:29:0x0022, outer: #2 }] */
    public final void s(ae4 ae4Var) {
        Selector selector;
        b bVar = this.l;
        if (bVar != null) {
            bVar.a();
            this.l.interrupt();
            this.l = null;
        }
        SocketChannel socketChannel = this.f19745b;
        if (socketChannel != null) {
            try {
                try {
                    if (socketChannel.isConnectionPending()) {
                        this.f19745b.finishConnect();
                        this.f19745b.close();
                        selector = this.g;
                        if (selector != null) {
                            selector.wakeup();
                            this.g.close();
                        }
                    } else {
                        this.f19745b.close();
                        selector = this.g;
                        if (selector != null) {
                            selector.wakeup();
                            this.g.close();
                        }
                    }
                } catch (IOException e) {
                    try {
                        e.printStackTrace();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                this.f19745b = null;
                this.g = null;
                p(ae4Var.a(), ae4Var.b());
            } catch (Throwable th) {
                this.f19745b = null;
                this.g = null;
                throw th;
            }
        }
        jpe.g("RCClientThreadV2", "realDisConnect End");
    }

    public final void t() {
        int iWrite;
        if (m() && !this.h.isEmpty()) {
            while (!this.h.isEmpty()) {
                i62 i62VarPoll = this.h.poll();
                byte[] bArrK = (q6j.p() && this.o.booleanValue()) ? k(i62VarPoll.a(), this.n) : i62VarPoll.a();
                int length = bArrK.length;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrK);
                byteBufferWrap.clear();
                try {
                    iWrite = this.f19745b.write(byteBufferWrap);
                } catch (IOException e) {
                    e.printStackTrace();
                    jpe.e("RCClientThreadV2", "write error");
                    iWrite = 0;
                } catch (NotYetConnectedException e2) {
                    jpe.e("RCClientThreadV2", e2.toString());
                    iWrite = 0;
                }
                jpe.d("RCClientThreadV2", "send " + iWrite + " bytes to client");
            }
        }
    }

    public void u(qwc qwcVar) {
        p = qwcVar;
    }

    public void v() {
        p = null;
    }

    public void w(byte[] bArr) {
        this.f19744a.removeMessages(3);
        this.h.add(new i62(bArr));
        this.f19744a.sendEmptyMessage(5);
        this.f19744a.sendEmptyMessageDelayed(3, this.j);
    }

    public final void x() {
        if (this.f) {
            return;
        }
        w(m7h.f25842a.a());
    }

    public int y(int i, KeyEvent keyEvent, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("to send key:");
        sb.append(keyEvent == null ? AbstractJsonLexerKt.NULL : keyEvent.toString());
        sb.append(" extra:");
        sb.append(str);
        jpe.a("RCClientThreadV2", sb.toString());
        int iA = dg1.a();
        if (iA > 0 && iA != i) {
            jpe.b("RCClientThreadV2", "handle does not match.");
            return -1;
        }
        SocketChannel socketChannel = this.f19745b;
        if (socketChannel != null && !socketChannel.isConnected()) {
            jpe.b("RCClientThreadV2", "not in working state, auth first");
            return -1;
        }
        atl atlVar = new atl();
        int iD = atlVar.d(new xsl(keyEvent, str));
        int iC = atlVar.c().c();
        if (iD != 0) {
            jpe.f("RCClientThreadV2", "make send failed");
            return -1;
        }
        jpe.f("RCClientThreadV2", "make send success");
        w(atlVar.a());
        jpe.f("RCClientThreadV2", "add send to queue success");
        return iC;
    }

    public final int z(String str) {
        cpq cpqVar = new cpq();
        jpe.f("RCClientThreadV2", "to send version:0x" + Integer.toHexString(cpqVar.b()) + " desc:" + cpqVar.a());
        gpq gpqVar = new gpq();
        if (gpqVar.c(new dpq(cpqVar, str)) != 0) {
            jpe.f("RCClientThreadV2", "make version failed");
            return -1;
        }
        jpe.f("RCClientThreadV2", "make version success");
        w(gpqVar.a());
        jpe.f("RCClientThreadV2", "add version to queue success");
        return 0;
    }
}
