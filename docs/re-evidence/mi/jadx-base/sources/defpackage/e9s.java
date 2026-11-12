package defpackage;

import com.xiaomi.ai.api.common.APIUtils;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class e9s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gt3 f16427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c9s f16428b;
    public int c;
    public int d;
    public int e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16429a;

        /* JADX INFO: renamed from: e9s$a$a, reason: collision with other inner class name */
        public class C0921a implements Comparator<c> {
            public C0921a(a aVar) {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(c cVar, c cVar2) {
                return cVar.c - cVar2.c;
            }
        }

        public a(String str) {
            this.f16429a = str;
        }

        public final void a(List<c> list, mj1 mj1Var) {
            String string;
            StringBuilder sb;
            Collections.sort(list, new C0921a(this));
            mj1 mj1VarCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
            for (int i = 0; i < mj1Var.size(); i++) {
                if (i < list.size()) {
                    c cVar = list.get(i);
                    if (cVar.c == Integer.MAX_VALUE) {
                        sb = new StringBuilder();
                        sb.append("connect timeout at ");
                        sb.append(cVar);
                        sb.append(" , remove it from dns list");
                    } else {
                        mj1VarCreateArrayNode.e0(cVar.f16433a + ":" + cVar.f16434b);
                        sb = new StringBuilder();
                        sb.append("race result: ");
                        sb.append(cVar.f16433a);
                        sb.append(":");
                        sb.append(cVar.f16434b);
                        sb.append(" cost:");
                        sb.append(cVar.c);
                    }
                    string = sb.toString();
                } else {
                    mj1VarCreateArrayNode.e0(mj1Var.i0(i).l());
                    string = "original address: " + mj1Var.i0(i).l();
                }
                wpe.b("HorseRace", string);
            }
            wpe.h("HorseRace", "newDnsList: " + mj1VarCreateArrayNode);
            if (mj1VarCreateArrayNode.size() > 0) {
                e9s.this.f16428b.f(mj1VarCreateArrayNode, true, this.f16429a, "http_dns_cache");
            } else {
                e9s.this.f16428b.n(this.f16429a, "http_dns_cache");
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList();
            mj1 mj1VarC = e9s.this.f16428b.c("http_dns_cache", this.f16429a);
            if (mj1VarC == null || mj1VarC.size() == 0) {
                wpe.h("HorseRace", "local dns is empty!");
                return;
            }
            if (e9s.this.c > mj1VarC.size()) {
                e9s.this.c = mj1VarC.size();
                wpe.k("HorseRace", "add just horseNum to " + e9s.this.c);
            }
            wpe.b("HorseRace", "original dns:" + mj1VarC);
            CountDownLatch countDownLatch = new CountDownLatch(e9s.this.c);
            int i = 0;
            for (int i2 = 0; i2 < mj1VarC.size(); i2++) {
                String strL = mj1VarC.i0(i2).l();
                if (yrs.b(strL)) {
                    e9s.this.f16428b.n(this.f16429a, "http_dns_cache");
                    wpe.k("HorseRace", "empty item in http dns cache! stop horse race");
                    return;
                }
                String[] strArrSplit = strL.split(":");
                if (strArrSplit.length != 2) {
                    e9s.this.f16428b.n(this.f16429a, "http_dns_cache");
                    wpe.k("HorseRace", "invalid item in http dns cache! stop horse race");
                    return;
                }
                c cVar = new c(e9s.this, strArrSplit[0], Integer.parseInt(strArrSplit[1]));
                wpe.b("HorseRace", "start race " + strL);
                arrayList.add(ues.f35695a.submit(e9s.this.new b(cVar, countDownLatch)));
                i++;
                if (i >= e9s.this.c) {
                    break;
                }
            }
            try {
                countDownLatch.await(e9s.this.d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                wpe.k("HorseRace", "latch interrupted");
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    arrayList2.add((c) ((Future) it.next()).get());
                } catch (InterruptedException | ExecutionException | Exception e) {
                    wpe.e("HorseRace", wpe.o(e));
                }
            }
            a(arrayList2, mj1VarC);
        }
    }

    public class b implements Callable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f16431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CountDownLatch f16432b;

        public b(c cVar, CountDownLatch countDownLatch) {
            this.f16431a = cVar;
            this.f16432b = countDownLatch;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c call() {
            StringBuilder sb;
            String str;
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                c cVar = this.f16431a;
                InetSocketAddress inetSocketAddress = new InetSocketAddress(cVar.f16433a, cVar.f16434b);
                Socket socket = new Socket();
                socket.connect(inetSocketAddress, e9s.this.d);
                socket.close();
                this.f16431a.c = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
            } catch (IOException e) {
                e = e;
                this.f16431a.c = Integer.MAX_VALUE;
                sb = new StringBuilder();
                str = "connect timeout at ";
                sb.append(str);
                sb.append(this.f16431a);
                sb.append(", ");
                sb.append(wpe.o(e));
                wpe.e("HorseRace", sb.toString());
            } catch (Exception e2) {
                e = e2;
                this.f16431a.c = Integer.MAX_VALUE;
                sb = new StringBuilder();
                str = "connect failed at ";
                sb.append(str);
                sb.append(this.f16431a);
                sb.append(", ");
                sb.append(wpe.o(e));
                wpe.e("HorseRace", sb.toString());
            }
            this.f16432b.countDown();
            return this.f16431a;
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16434b;
        public int c;

        public c(e9s e9sVar, String str, int i) {
            this.f16433a = str;
            this.f16434b = i;
        }

        public String toString() {
            return this.f16433a + ":" + this.f16434b;
        }
    }

    public e9s(gt3 gt3Var, c9s c9sVar) {
        this.f16427a = gt3Var;
        this.f16428b = c9sVar;
        this.c = gt3Var.getAivsConfig().f("connection.tcp_horse_num", 3);
        this.d = this.f16427a.getAivsConfig().f("connection.horse_race_timeout", 5000);
        this.e = this.f16427a.getAivsConfig().f("connection.horse_race_interval", 300);
    }

    public void c(String str) {
        synchronized (e9s.class) {
            try {
                String strOnRead = this.f16427a.getListener().onRead(this.f16427a, "last_horse_race_at");
                if (!yrs.b(strOnRead)) {
                    long j = Long.parseLong(strOnRead) + ((long) (this.e * 1000));
                    if (System.currentTimeMillis() < j) {
                        wpe.h("HorseRace", "frequency limited, wait until " + j);
                        return;
                    }
                }
                this.f16427a.getListener().onWrite(this.f16427a, "last_horse_race_at", String.valueOf(System.currentTimeMillis()));
                ues.f35695a.execute(new a(str));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
