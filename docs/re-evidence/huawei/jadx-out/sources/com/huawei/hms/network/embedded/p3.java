package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import com.huawei.hms.network.httpclient.websocket.WebSocketListener;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes34.dex */
public class p3 extends a8 {
    public static final String n = "WebSocketListenerAdapter";
    public static final String o = "connect_failed";
    public static final String p = "connect_closed";
    public static final String q = "WebSocket_PredictorModel";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebSocketListener f15170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebSocket f15171b;
    public volatile h1.f<ResponseBody> d;
    public Throwable e;
    public h1.d f;
    public l3 g;
    public q3 h;
    public r3 i;
    public int j;
    public LinkedList<Long> k;
    public int l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CountDownLatch f15172c = new CountDownLatch(1);
    public final ExecutorService m = ExecutorsUtils.newSingleThreadExecutor(q);

    public void predictorModel() {
        this.m.execute(new a());
    }

    public void onSend() {
        this.i.counting(1);
    }

    @Override // com.huawei.hms.network.embedded.a8
    public void onReadPong(long j, LinkedList<Long> linkedList) {
        super.onReadPong(j, linkedList);
        if (this.l == 0 || !this.i.aiPingEnable()) {
            return;
        }
        this.k.clear();
        this.k.addAll(linkedList);
        try {
            int pingResult = this.i.setPingResult(true, this.j, linkedList);
            if (pingResult != 0) {
                ((j4) this.f15171b).resetPingIntervalOnReadPong(pingResult);
                return;
            }
            Logger.d(n, "PingResult ping is:" + pingResult);
        } catch (Throwable unused) {
            Logger.w(n, "PingResult error on onReadPong");
        }
    }

    @Override // com.huawei.hms.network.embedded.a8
    public void onOpen(z7 z7Var, v7 v7Var) {
        a(z7Var);
        this.g.getMetricsTime().setCallEndTime();
        this.g.getMetricsRealTime().setCallEndTime();
        this.h.setOnOpenTime(System.currentTimeMillis());
        this.i.setOnOpenTime(System.currentTimeMillis());
        this.d = a(v7Var);
        this.f15170a.onOpen(this.f15171b, this.d);
        CountDownLatch countDownLatch = this.f15172c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // com.huawei.hms.network.embedded.a8
    public void onMessage(z7 z7Var, String str) {
        this.f15170a.onMessage(this.f15171b, str);
        this.i.counting(2);
    }

    @Override // com.huawei.hms.network.embedded.a8
    public void onMessage(z7 z7Var, eb ebVar) {
        this.f15170a.onMessage(this.f15171b, ebVar.m());
        this.i.counting(2);
    }

    @Override // com.huawei.hms.network.embedded.a8
    public void onFailure(z7 z7Var, Throwable th, v7 v7Var) {
        this.e = th;
        a(z7Var);
        this.g.getMetricsRealTime().setRequestBodyEndTime();
        this.g.getMetricsTime().setRequestBodyEndTime();
        this.g.getMetricsTime().setCallEndTime();
        this.g.getMetricsRealTime().setCallEndTime();
        if (th instanceof Exception) {
            Exception exc = (Exception) th;
            this.g.setException(exc);
            this.h.reportData(exc, o);
        } else {
            Exception exc2 = new Exception(th);
            this.g.setException(exc2);
            this.h.reportData(exc2, o);
        }
        this.d = v7Var == null ? null : a(v7Var);
        this.f15170a.onFailure(this.f15171b, th, this.d);
        CountDownLatch countDownLatch = this.f15172c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (this.l == 0 || this.k.size() <= 0) {
            return;
        }
        try {
            this.i.setPingResult(false, this.j, this.k);
        } catch (Throwable unused) {
            Logger.w(n, "PingResult error on onFailure");
        }
    }

    @Override // com.huawei.hms.network.embedded.a8
    public void onClosing(z7 z7Var, int i, String str) {
        this.f15170a.onClosing(this.f15171b, i, str);
    }

    @Override // com.huawei.hms.network.embedded.a8
    public void onClosed(z7 z7Var, int i, String str) {
        a(z7Var);
        this.g.getMetricsRealTime().setRequestBodyEndTime();
        this.g.getMetricsTime().setRequestBodyEndTime();
        this.h.reportData(Integer.valueOf(i), p);
        this.f15170a.onClosed(this.f15171b, i, str);
        Logger.v(n, "Closed " + str);
        CountDownLatch countDownLatch = this.f15172c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public h1.f<ResponseBody> getResponse() throws IOException {
        try {
            this.f15172c.await();
        } catch (InterruptedException e) {
            Logger.w(n, "InterruptedException ", e);
        }
        if (this.d == null) {
            Throwable th = this.e;
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
        }
        return this.d == null ? new h1.f<>(new u0.b().build()) : this.d;
    }

    public CountDownLatch getCountDownLatch() {
        return this.f15172c;
    }

    public boolean enableDynamicPing(int i) {
        StringBuilder sb;
        boolean actionType = false;
        if (this.j <= 0) {
            sb = new StringBuilder("canot predictor model ,pingInterval is:");
            sb.append(this.j);
        } else {
            r3 r3Var = this.i;
            actionType = r3Var != null ? r3Var.setActionType(i) : false;
            sb = new StringBuilder("enable dynamic ping model predictor:");
            sb.append(actionType);
        }
        Logger.i(n, sb.toString());
        return actionType;
    }

    private void a(z7 z7Var) {
        if (z7Var instanceof ua) {
            ua uaVar = (ua) z7Var;
            this.h.setPingPongDelayList(uaVar.d());
            g3 listener = o3.getWebSocketEventFactory().getListener(uaVar.c());
            if (listener == null || !(listener instanceof o3)) {
                return;
            }
            l3 webSocketRequestFinishedInfo = ((o3) listener).getWebSocketRequestFinishedInfo();
            this.g = webSocketRequestFinishedInfo;
            if (webSocketRequestFinishedInfo == null) {
                Logger.i(n, "webSocketRequestFinishedInfo is null");
                this.g = new l3();
            }
            this.g.getMetricsTime().setPingInterval(this.f.getNetConfig().getPingInterval());
            this.h.setRequestFinishedInfo(this.g);
            this.i.setRequestFinishedInfo(this.g);
        }
    }

    private void a() {
        this.h = new q3(this.g, this.f);
        String str = this.f.getNetConfig().getMap("core_metrics_data").get("trace_id");
        int iEnableDynamicPing = this.f.getNetConfig().enableDynamicPing();
        this.l = iEnableDynamicPing;
        r3 r3Var = new r3(iEnableDynamicPing, this.j, str);
        this.i = r3Var;
        this.h.setPingIntervalManager(r3Var);
        this.k = new LinkedList<>();
        Logger.d(n, "init actionType is:" + this.l);
    }

    private Map<String, List<String>> a(j7 j7Var) {
        Headers.Builder builder = new Headers.Builder();
        int iD = j7Var.d();
        for (int i = 0; i < iD; i++) {
            builder.add(j7Var.a(i), j7Var.b(i));
        }
        return builder.build().toMultimap();
    }

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb;
            int i;
            String string;
            if (p3.this.j > 0) {
                if (p3.this.l == 1 || p3.this.l == 2) {
                    string = "webSocket ping model predictor:" + (p3.this.i != null ? p3.this.i.predictorModel() : false);
                } else {
                    sb = new StringBuilder("canot predictor model ,actionType is:");
                    i = p3.this.l;
                }
                Logger.i(p3.n, string);
            }
            sb = new StringBuilder("canot predictor model ,pingInterval is:");
            i = p3.this.j;
            sb.append(i);
            string = sb.toString();
            Logger.i(p3.n, string);
        }

        public a() {
        }
    }

    private h1.f<ResponseBody> a(v7 v7Var) {
        w7 w7VarS = v7Var.s();
        String strA = v7Var.y().a("Content-Type");
        f1 f1VarBuild = null;
        o7 o7VarB = strA != null ? o7.b(strA) : null;
        if (w7VarS != null) {
            f1VarBuild = new f1.b().inputStream(w7VarS.s()).contentLength(w7VarS.v()).charSet(o7VarB != null ? o7VarB.a() : null).contentType(o7VarB != null ? o7VarB.c() : "").build();
        }
        u0.b bVar = new u0.b();
        if (f1VarBuild != null) {
            bVar.body(new h1.g(f1VarBuild));
        }
        bVar.headers(a(v7Var.y())).code(v7Var.w()).message(v7Var.B()).url(v7Var.H().k().toString());
        return new h1.f<>(bVar.build());
    }

    public p3(WebSocket webSocket, WebSocketListener webSocketListener, h1.d dVar) {
        this.f15170a = webSocketListener;
        this.f15171b = webSocket;
        this.f = dVar;
        this.j = dVar.getNetConfig().getPingInterval();
        a();
    }
}
