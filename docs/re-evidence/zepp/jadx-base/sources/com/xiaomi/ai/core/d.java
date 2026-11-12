package com.xiaomi.ai.core;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.b.f;
import com.xiaomi.ai.log.Logger;
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

/* JADX INFO: loaded from: classes18.dex */
public class d {
    private com.xiaomi.ai.core.a a;
    private com.xiaomi.ai.transport.b b;
    private int c;
    private int d;
    private int e;

    public class a implements Callable<c> {
        public c a;
        public CountDownLatch b;

        public a(c cVar, CountDownLatch countDownLatch) {
            this.a = cVar;
            this.b = countDownLatch;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c call() {
            StringBuilder sb;
            String str;
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                c cVar = this.a;
                InetSocketAddress inetSocketAddress = new InetSocketAddress(cVar.a, cVar.b);
                Socket socket = new Socket();
                socket.connect(inetSocketAddress, d.this.d);
                socket.close();
                this.a.c = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
            } catch (IOException e) {
                e = e;
                this.a.c = Integer.MAX_VALUE;
                sb = new StringBuilder();
                str = "connect timeout at ";
                sb.append(str);
                sb.append(this.a);
                sb.append(", ");
                sb.append(Logger.throwableToString(e));
                Logger.d("HorseRace", sb.toString());
            } catch (Exception e2) {
                e = e2;
                this.a.c = Integer.MAX_VALUE;
                sb = new StringBuilder();
                str = "connect failed at ";
                sb.append(str);
                sb.append(this.a);
                sb.append(", ");
                sb.append(Logger.throwableToString(e));
                Logger.d("HorseRace", sb.toString());
            }
            this.b.countDown();
            return this.a;
        }
    }

    public class b implements Runnable {
        public String a;

        public b(String str) {
            this.a = str;
        }

        private void a(List<c> list, ArrayNode arrayNode) {
            String string;
            StringBuilder sb;
            Collections.sort(list, new Comparator<c>() { // from class: com.xiaomi.ai.core.d.b.1
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(c cVar, c cVar2) {
                    return cVar.c - cVar2.c;
                }
            });
            ArrayNode arrayNodeCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
            for (int i = 0; i < arrayNode.size(); i++) {
                if (i < list.size()) {
                    c cVar = list.get(i);
                    if (cVar.c == Integer.MAX_VALUE) {
                        sb = new StringBuilder();
                        sb.append("connect timeout at ");
                        sb.append(cVar);
                        sb.append(" , remove it from dns list");
                    } else {
                        arrayNodeCreateArrayNode.add(cVar.a + ":" + cVar.b);
                        sb = new StringBuilder();
                        sb.append("race result: ");
                        sb.append(cVar.a);
                        sb.append(":");
                        sb.append(cVar.b);
                        sb.append(" cost:");
                        sb.append(cVar.c);
                    }
                    string = sb.toString();
                } else {
                    arrayNodeCreateArrayNode.add(arrayNode.get(i).asText());
                    string = "original address: " + arrayNode.get(i).asText();
                }
                Logger.a("HorseRace", string);
            }
            Logger.b("HorseRace", "newDnsList: " + arrayNodeCreateArrayNode);
            if (arrayNodeCreateArrayNode.size() > 0) {
                d.this.b.a(arrayNodeCreateArrayNode, true, this.a, "http_dns_cache");
            } else {
                d.this.b.b(this.a, "http_dns_cache");
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList();
            ArrayNode arrayNodeA = d.this.b.a("http_dns_cache", this.a);
            if (arrayNodeA == null || arrayNodeA.size() == 0) {
                Logger.b("HorseRace", "local dns is empty!");
                return;
            }
            if (d.this.c > arrayNodeA.size()) {
                d.this.c = arrayNodeA.size();
                Logger.c("HorseRace", "add just horseNum to " + d.this.c);
            }
            Logger.a("HorseRace", "original dns:" + arrayNodeA);
            CountDownLatch countDownLatch = new CountDownLatch(d.this.c);
            int i = 0;
            for (int i2 = 0; i2 < arrayNodeA.size(); i2++) {
                String strAsText = arrayNodeA.get(i2).asText();
                if (f.a(strAsText)) {
                    d.this.b.b(this.a, "http_dns_cache");
                    Logger.c("HorseRace", "empty item in http dns cache! stop horse race");
                    return;
                }
                String[] strArrSplit = strAsText.split(":");
                if (strArrSplit.length != 2) {
                    d.this.b.b(this.a, "http_dns_cache");
                    Logger.c("HorseRace", "invalid item in http dns cache! stop horse race");
                    return;
                }
                c cVar = d.this.new c(strArrSplit[0], Integer.parseInt(strArrSplit[1]));
                Logger.a("HorseRace", "start race " + strAsText);
                arrayList.add(com.xiaomi.ai.b.c.a.submit(d.this.new a(cVar, countDownLatch)));
                i++;
                if (i >= d.this.c) {
                    break;
                }
            }
            try {
                countDownLatch.await(d.this.d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Logger.c("HorseRace", "latch interrupted");
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    arrayList2.add((c) ((Future) it2.next()).get());
                } catch (InterruptedException | ExecutionException | Exception e) {
                    Logger.d("HorseRace", Logger.throwableToString(e));
                }
            }
            a(arrayList2, arrayNodeA);
        }
    }

    public class c {
        public String a;
        public int b;
        public int c;

        public c(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public String toString() {
            return this.a + ":" + this.b;
        }
    }

    public d(com.xiaomi.ai.core.a aVar, com.xiaomi.ai.transport.b bVar) {
        this.a = aVar;
        this.b = bVar;
        this.c = aVar.getAivsConfig().getInt(AivsConfig.Connection.TCP_HORSE_NUM, 3);
        this.d = this.a.getAivsConfig().getInt(AivsConfig.Connection.HORSE_RACE_TIMEOUT, 5000);
        this.e = this.a.getAivsConfig().getInt(AivsConfig.Connection.HORSE_RACE_INTERVAL, 300);
    }

    public void a(String str) {
        synchronized (d.class) {
            String strA = this.a.getListener().a(this.a, "last_horse_race_at");
            if (!f.a(strA)) {
                long j = Long.parseLong(strA) + ((long) (this.e * 1000));
                if (System.currentTimeMillis() < j) {
                    Logger.b("HorseRace", "frequency limited, wait until " + j);
                    return;
                }
            }
            this.a.getListener().a(this.a, "last_horse_race_at", String.valueOf(System.currentTimeMillis()));
            com.xiaomi.ai.b.c.a.execute(new b(str));
        }
    }
}
