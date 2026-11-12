package com.xiaomi.push;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public abstract class bz extends bt {
    public Exception a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Socket f60a;
    public XMPushService b;
    public volatile long e;
    public volatile long f;
    public volatile long g;
    public String m;
    private String n;
    private int o;
    private long p;

    public bz(XMPushService xMPushService, bu buVar) {
        super(xMPushService, buVar);
        this.a = null;
        this.m = null;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.p = 0L;
        this.b = xMPushService;
    }

    private void f(bu buVar) throws Throwable {
        g(buVar.c(), buVar.m3611a());
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x022d  */
    /* JADX WARN: Code duplicated, block: B:58:0x022f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0243  */
    /* JADX WARN: Code duplicated, block: B:61:0x025b  */
    /* JADX WARN: Code duplicated, block: B:69:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x030f A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x022f, please report this as an issue */
    private void g(String str, int i) throws Throwable {
        long j;
        boolean z;
        String str2;
        String str3;
        String str4;
        this.a = null;
        ArrayList<String> arrayList = new ArrayList<>();
        int iIntValue = com.xiaomi.channel.commonutils.logger.b.a("get bucket for host : " + str).intValue();
        ag agVarE = e(str);
        com.xiaomi.channel.commonutils.logger.b.a(Integer.valueOf(iIntValue));
        if (agVarE != null) {
            arrayList = agVarE.a(true);
        }
        ag agVarD = ak.a().d(str);
        if (agVarD != null) {
            for (String str5 : agVarD.a(true)) {
                if (arrayList.indexOf(str5) == -1) {
                    arrayList.add(str5);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(str);
        }
        long j2 = 0;
        this.g = 0L;
        SystemClock.elapsedRealtime();
        String strM3840a = y.m3840a((Context) this.b);
        StringBuilder sb = new StringBuilder();
        Iterator<String> it2 = arrayList.iterator();
        String str6 = "";
        while (true) {
            if (it2.hasNext()) {
                String next = it2.next();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ((bt) this).f50a++;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        sb2.append("begin to connect to ");
                        sb2.append(next);
                        com.xiaomi.channel.commonutils.logger.b.m3434a(sb2.toString());
                        this.f60a = a();
                        this.f60a.connect(ai.m3495a(next, i), 8000);
                        com.xiaomi.channel.commonutils.logger.b.m3434a("tcp connected");
                        this.f60a.setTcpNoDelay(true);
                        this.n = next;
                        mo3615a();
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        ((bt) this).f51a = jCurrentTimeMillis2;
                        ((bt) this).f58b = strM3840a;
                        if (agVarE != null) {
                            it2 = it2;
                            sb = sb;
                            str2 = strM3840a;
                            j = 0;
                            agVarE = agVarE;
                            try {
                                agVarE.b(next, jCurrentTimeMillis2, 0L);
                            } catch (Exception e) {
                                e = e;
                                str3 = str2;
                                try {
                                    this.a = e;
                                    com.xiaomi.channel.commonutils.logger.b.d("SMACK: Could not connect to:" + next);
                                    sb.append("SMACK: Could not connect to ");
                                    sb.append(next);
                                    sb.append(" port:");
                                    sb.append(i);
                                    sb.append(" err:");
                                    sb.append(this.a.getClass().getSimpleName());
                                    sb.append("\n");
                                    if (TextUtils.isEmpty(str6)) {
                                        str4 = next;
                                    } else {
                                        str4 = str6 + AESEncryptionHelper.SEPARATOR + next;
                                    }
                                    if (agVarE != null) {
                                        agVarE.b(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.a);
                                    }
                                    if (!TextUtils.equals(str3, y.m3840a((Context) this.b))) {
                                        z = false;
                                        break;
                                    }
                                    str6 = str4;
                                    sb = sb;
                                    strM3840a = str3;
                                    it2 = it2;
                                    j2 = j;
                                    agVarE = agVarE;
                                } catch (Throwable th) {
                                    th = th;
                                    com.xiaomi.channel.commonutils.logger.b.d("SMACK: Could not connect to:" + next);
                                    sb.append("SMACK: Could not connect to ");
                                    sb.append(next);
                                    sb.append(" port:");
                                    sb.append(i);
                                    sb.append(" err:");
                                    sb.append(this.a.getClass().getSimpleName());
                                    sb.append("\n");
                                    TextUtils.isEmpty(str6);
                                    if (agVarE != null) {
                                        agVarE.b(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.a);
                                    }
                                    if (TextUtils.equals(str3, y.m3840a((Context) this.b))) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    this.a = new Exception("abnormal exception", th);
                                    com.xiaomi.channel.commonutils.logger.b.a(th);
                                    com.xiaomi.channel.commonutils.logger.b.d("SMACK: Could not connect to:" + next);
                                    sb.append("SMACK: Could not connect to ");
                                    sb.append(next);
                                    sb.append(" port:");
                                    sb.append(i);
                                    sb.append(" err:");
                                    sb.append(this.a.getClass().getSimpleName());
                                    sb.append("\n");
                                    str4 = TextUtils.isEmpty(str6) ? next : str6 + AESEncryptionHelper.SEPARATOR + next;
                                    if (agVarE != null) {
                                        agVarE.b(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.a);
                                    }
                                    String str7 = str2;
                                    if (!TextUtils.equals(str7, y.m3840a((Context) this.b))) {
                                        z = false;
                                        break;
                                    }
                                    str3 = str7;
                                    str6 = str4;
                                    sb = sb;
                                    strM3840a = str3;
                                    it2 = it2;
                                    j2 = j;
                                    agVarE = agVarE;
                                } catch (Throwable th3) {
                                    th = th3;
                                    str6 = str6;
                                    str3 = str2;
                                    com.xiaomi.channel.commonutils.logger.b.d("SMACK: Could not connect to:" + next);
                                    sb.append("SMACK: Could not connect to ");
                                    sb.append(next);
                                    sb.append(" port:");
                                    sb.append(i);
                                    sb.append(" err:");
                                    sb.append(this.a.getClass().getSimpleName());
                                    sb.append("\n");
                                    TextUtils.isEmpty(str6);
                                    if (agVarE != null) {
                                        agVarE.b(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.a);
                                    }
                                    if (TextUtils.equals(str3, y.m3840a((Context) this.b))) {
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            it2 = it2;
                            sb = sb;
                            str2 = strM3840a;
                            agVarE = agVarE;
                            j = 0;
                        }
                        this.g = SystemClock.elapsedRealtime();
                        com.xiaomi.channel.commonutils.logger.b.m3434a("connected to " + next + " in " + ((bt) this).f51a);
                        z = true;
                        break;
                    } catch (Exception e2) {
                        e = e2;
                        j = 0;
                        str3 = strM3840a;
                        this.a = e;
                        com.xiaomi.channel.commonutils.logger.b.d("SMACK: Could not connect to:" + next);
                        sb.append("SMACK: Could not connect to ");
                        sb.append(next);
                        sb.append(" port:");
                        sb.append(i);
                        sb.append(" err:");
                        sb.append(this.a.getClass().getSimpleName());
                        sb.append("\n");
                        if (TextUtils.isEmpty(str6)) {
                            str4 = next;
                        } else {
                            str4 = str6 + AESEncryptionHelper.SEPARATOR + next;
                        }
                        if (agVarE != null) {
                            agVarE.b(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.a);
                        }
                        if (!TextUtils.equals(str3, y.m3840a((Context) this.b))) {
                            z = false;
                            ak.a().m3504d();
                            SystemClock.elapsedRealtime();
                            if (z) {
                            }
                            if (this.p != j) {
                                this.p = SystemClock.elapsedRealtime();
                                y.b(this.b.getApplicationContext());
                            } else {
                                this.p = SystemClock.elapsedRealtime();
                                y.b(this.b.getApplicationContext());
                            }
                            throw new cd(sb.toString());
                        }
                        str6 = str4;
                        sb = sb;
                        strM3840a = str3;
                        it2 = it2;
                        j2 = j;
                        agVarE = agVarE;
                    } catch (Throwable th4) {
                        th = th4;
                        it2 = it2;
                        sb = sb;
                        str2 = strM3840a;
                        agVarE = agVarE;
                        j = 0;
                    }
                } catch (Exception e3) {
                    e = e3;
                    j = j2;
                } catch (Throwable th5) {
                    th = th5;
                    it2 = it2;
                    sb = sb;
                    str2 = strM3840a;
                    j = j2;
                    agVarE = agVarE;
                }
            } else {
                sb = sb;
                j = j2;
            }
            z = false;
            str6 = str4;
            sb = sb;
            strM3840a = str3;
            it2 = it2;
            j2 = j;
            agVarE = agVarE;
        }
        ak.a().m3504d();
        SystemClock.elapsedRealtime();
        if (z) {
            if (this.p != j || SystemClock.elapsedRealtime() - this.p > 480000) {
                this.p = SystemClock.elapsedRealtime();
                y.b(this.b.getApplicationContext());
            }
            throw new cd(sb.toString());
        }
    }

    @Override // com.xiaomi.push.bt
    /* JADX INFO: renamed from: a */
    public String mo3606a() {
        return this.n;
    }

    public Socket a() {
        return new Socket();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized void mo3615a() {
    }

    public synchronized void a(int i, Exception exc) {
        if (a() == 2) {
            return;
        }
        a(2, i, exc);
        ((bt) this).f55a = "";
        try {
            this.f60a.close();
        } catch (Throwable unused) {
        }
        this.e = 0L;
        this.f = 0L;
    }

    public void a(Exception exc) throws JSONException, IOException {
        if (SystemClock.elapsedRealtime() - this.g < 300000) {
            if (!y.m3842a((Context) this.b)) {
                return;
            }
            int i = this.o + 1;
            this.o = i;
            if (i < 2) {
                return;
            }
            String strMo3606a = mo3606a();
            com.xiaomi.channel.commonutils.logger.b.m3434a("max short conn time reached, sink down current host:" + strMo3606a);
            a(strMo3606a, 0L, exc);
        }
        this.o = 0;
    }

    public void a(String str, long j, Exception exc) throws JSONException, IOException {
        ag agVarA = ak.a().a(bu.a(), false);
        if (agVarA != null) {
            agVarA.b(str, j, 0L, exc);
            ak.a().m3504d();
        }
    }

    public abstract void a(boolean z);

    @Override // com.xiaomi.push.bt
    public void a(bi[] biVarArr) throws cd {
        throw new cd("Don't support send Blob");
    }

    @Override // com.xiaomi.push.bt
    public void b(int i, Exception exc) {
        a(i, exc);
        if ((exc != null || i == 18) && this.g != 0) {
            a(exc);
        }
    }

    @Override // com.xiaomi.push.bt
    public void b(boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        a(z);
        com.xiaomi.push.service.n.a(this.b).c();
        if (z) {
            return;
        }
        this.b.a(new i0(this, 13, jElapsedRealtime, jCurrentTimeMillis), 10000L);
    }

    public String c() {
        return ((bt) this).f55a;
    }

    public void c(int i, Exception exc) {
        this.b.a(new j0(this, 2, i, exc));
    }

    public ag e(String str) {
        ag agVarA = ak.a().a(str, false);
        if (!agVarA.b()) {
            cv.a(new k0(this, str));
        }
        return agVarA;
    }

    public synchronized void e() {
        try {
            if (!m3610c() && !m3609b()) {
                a(0, 0, (Exception) null);
                f(((bt) this).f52a);
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m3434a("WARNING: current xmpp has connected");
        } catch (IOException e) {
            throw new cd(e);
        }
    }

    public void f() {
        this.e = SystemClock.elapsedRealtime();
    }

    public void g() {
        this.f = SystemClock.elapsedRealtime();
    }
}
