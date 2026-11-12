package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.fs;
import com.xiaomi.push.ha;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public abstract class sws extends gws {
    public volatile long A;
    public int B;
    public long C;
    public Exception t;
    public Socket u;
    public String v;
    public String w;
    public XMPushService x;
    public volatile long y;
    public volatile long z;

    public sws(XMPushService xMPushService, jws jwsVar) {
        super(xMPushService, jwsVar);
        this.t = null;
        this.v = null;
        this.y = 0L;
        this.z = 0L;
        this.A = 0L;
        this.C = 0L;
        this.x = xMPushService;
    }

    @Override // defpackage.gws
    public void A(boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        O(z);
        cdt.c(this.x).q();
        if (z) {
            return;
        }
        this.x.a(new uws(this, 13, jElapsedRealtime, jCurrentTimeMillis), 10000L);
    }

    public Context F() {
        return this.x;
    }

    public mis G(String str) {
        mis misVarB = wjs.c().b(str, false);
        if (!misVarB.u()) {
            vys.c(new yws(this, str));
        }
        return misVarB;
    }

    public Socket H() {
        return new Socket();
    }

    public abstract void I();

    public synchronized void J(int i, Exception exc) {
        if (s() == 2) {
            return;
        }
        h(2, i, exc);
        this.j = "";
        try {
            this.u.close();
        } catch (Throwable unused) {
        }
        this.y = 0L;
        this.z = 0L;
    }

    public final void K(jws jwsVar) throws Throwable {
        M(jwsVar.j(), jwsVar.a());
    }

    public void L(Exception exc) {
        if (SystemClock.elapsedRealtime() - this.A >= 300000) {
            this.B = 0;
            return;
        }
        if (obs.v(this.x)) {
            int i = this.B + 1;
            this.B = i;
            if (i >= 2) {
                String strD = d();
                x9s.o("max short conn time reached, sink down current host:" + strD);
                N(strD, 0L, exc);
                this.B = 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:66:0x0244  */
    /* JADX WARN: Code duplicated, block: B:67:0x0246  */
    /* JADX WARN: Code duplicated, block: B:70:0x025f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0277  */
    /* JADX WARN: Code duplicated, block: B:79:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:83:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0309  */
    /* JADX WARN: Code duplicated, block: B:88:0x030c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0326  */
    /* JADX WARN: Code duplicated, block: B:94:0x032c  */
    /* JADX WARN: Code duplicated, block: B:96:0x033a  */
    /* JADX WARN: Code duplicated, block: B:99:0x035e  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x01b4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x0246, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x02ce, please report this as an issue */
    public final void M(String str, int i) throws Throwable {
        long j;
        int i2;
        String str2;
        boolean z;
        int iElapsedRealtime;
        int i3;
        String str3;
        String str4;
        String str5;
        boolean z2;
        this.t = null;
        ArrayList<String> arrayList = new ArrayList<>();
        Integer numB = x9s.b("get bucket for host : " + str);
        numB.intValue();
        mis misVarG = G(str);
        x9s.n(numB);
        if (misVarG != null) {
            arrayList = misVarG.e(true);
        }
        mis misVarX = wjs.c().x(str);
        if (misVarX != null) {
            for (String str6 : misVarX.e(true)) {
                if (arrayList.indexOf(str6) == -1) {
                    arrayList.add(str6);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(str);
        }
        long j2 = 0;
        this.A = 0L;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strJ = obs.j(this.x);
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = arrayList.iterator();
        String str7 = "";
        int i4 = 0;
        while (true) {
            if (it.hasNext()) {
                String next = it.next();
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f19415a++;
                i3 = i4 + 1;
                try {
                    try {
                        try {
                            x9s.o("begin to connect to " + next);
                            this.u = H();
                            this.u.connect(rjs.d(next, i), 8000);
                            x9s.o("tcp connected");
                            try {
                                this.u.setTcpNoDelay(true);
                                this.w = next;
                                I();
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                this.f19416b = jCurrentTimeMillis2;
                                this.f19417k = strJ;
                                if (misVarG != null) {
                                    it = it;
                                    sb = sb;
                                    strJ = strJ;
                                    z2 = true;
                                    j = 0;
                                    misVarG = misVarG;
                                    try {
                                        misVarG.s(next, jCurrentTimeMillis2, 0L);
                                    } catch (Exception e) {
                                        e = e;
                                        str3 = strJ;
                                        try {
                                            this.t = e;
                                            x9s.D("SMACK: Could not connect to:" + next);
                                            sb.append("SMACK: Could not connect to ");
                                            sb.append(next);
                                            sb.append(" port:");
                                            sb.append(i);
                                            sb.append(" err:");
                                            sb.append(this.t.getClass().getSimpleName());
                                            sb.append("\n");
                                            if (TextUtils.isEmpty(str7)) {
                                                str2 = next;
                                            } else {
                                                str2 = str7 + "|" + next;
                                            }
                                            gvs.h(next, this.t);
                                            if (misVarG != null) {
                                                misVarG.t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.t);
                                            }
                                            if (TextUtils.equals(str3, obs.j(this.x))) {
                                                str7 = str2;
                                                sb = sb;
                                                strJ = str3;
                                                i4 = i3;
                                                it = it;
                                                j2 = j;
                                                misVarG = misVarG;
                                            } else {
                                                i2 = i3;
                                                z = false;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            x9s.D("SMACK: Could not connect to:" + next);
                                            sb.append("SMACK: Could not connect to ");
                                            sb.append(next);
                                            sb.append(" port:");
                                            sb.append(i);
                                            sb.append(" err:");
                                            sb.append(this.t.getClass().getSimpleName());
                                            sb.append("\n");
                                            if (TextUtils.isEmpty(str7)) {
                                                str5 = next;
                                            } else {
                                                str5 = str7 + "|" + next;
                                            }
                                            gvs.h(next, this.t);
                                            if (misVarG != null) {
                                                misVarG.t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.t);
                                            }
                                            if (!TextUtils.equals(str3, obs.j(this.x))) {
                                                throw th;
                                            }
                                            str2 = str5;
                                            i2 = i3;
                                            z = false;
                                            wjs.c().w();
                                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                            if (!z) {
                                                gvs.d(0, fs.BATCH_TCP_CONN_SUCCESS.a(), iElapsedRealtime, str2, i2);
                                                return;
                                            }
                                            if (this.C != j) {
                                                this.C = SystemClock.elapsedRealtime();
                                                gvs.d(0, fs.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, obs.w(this.x.getApplicationContext()) ? 1 : 0);
                                            } else {
                                                this.C = SystemClock.elapsedRealtime();
                                                gvs.d(0, fs.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, obs.w(this.x.getApplicationContext()) ? 1 : 0);
                                            }
                                            throw new ha(sb.toString());
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            this.t = new Exception("abnormal exception", th);
                                            x9s.s(th);
                                            x9s.D("SMACK: Could not connect to:" + next);
                                            sb.append("SMACK: Could not connect to ");
                                            sb.append(next);
                                            sb.append(" port:");
                                            sb.append(i);
                                            sb.append(" err:");
                                            sb.append(this.t.getClass().getSimpleName());
                                            sb.append("\n");
                                            if (TextUtils.isEmpty(str7)) {
                                                str2 = next;
                                            } else {
                                                str2 = str7 + "|" + next;
                                            }
                                            gvs.h(next, this.t);
                                            if (misVarG != null) {
                                                misVarG.t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.t);
                                            }
                                            str4 = strJ;
                                            if (TextUtils.equals(str4, obs.j(this.x))) {
                                                str3 = str4;
                                                str7 = str2;
                                                sb = sb;
                                                strJ = str3;
                                                i4 = i3;
                                                it = it;
                                                j2 = j;
                                                misVarG = misVarG;
                                            } else {
                                                i2 = i3;
                                                z = false;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            str7 = str7;
                                            str3 = strJ;
                                            x9s.D("SMACK: Could not connect to:" + next);
                                            sb.append("SMACK: Could not connect to ");
                                            sb.append(next);
                                            sb.append(" port:");
                                            sb.append(i);
                                            sb.append(" err:");
                                            sb.append(this.t.getClass().getSimpleName());
                                            sb.append("\n");
                                            if (TextUtils.isEmpty(str7)) {
                                                str5 = next;
                                            } else {
                                                str5 = str7 + "|" + next;
                                            }
                                            gvs.h(next, this.t);
                                            if (misVarG != null) {
                                                misVarG.t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.t);
                                            }
                                            if (!TextUtils.equals(str3, obs.j(this.x))) {
                                                throw th;
                                            }
                                            str2 = str5;
                                            i2 = i3;
                                            z = false;
                                            wjs.c().w();
                                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                            if (!z) {
                                                gvs.d(0, fs.BATCH_TCP_CONN_SUCCESS.a(), iElapsedRealtime, str2, i2);
                                                return;
                                            }
                                            if (this.C != j) {
                                                this.C = SystemClock.elapsedRealtime();
                                                gvs.d(0, fs.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, obs.w(this.x.getApplicationContext()) ? 1 : 0);
                                            } else {
                                                this.C = SystemClock.elapsedRealtime();
                                                gvs.d(0, fs.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, obs.w(this.x.getApplicationContext()) ? 1 : 0);
                                            }
                                            throw new ha(sb.toString());
                                        }
                                    }
                                } else {
                                    it = it;
                                    sb = sb;
                                    strJ = strJ;
                                    misVarG = misVarG;
                                    z2 = true;
                                    j = 0;
                                }
                                this.A = SystemClock.elapsedRealtime();
                                x9s.o("connected to " + next + " in " + this.f19416b);
                                str2 = str7;
                                z = z2;
                                i2 = i3;
                            } catch (Exception e2) {
                                e = e2;
                                j = 0;
                                str3 = strJ;
                                this.t = e;
                                x9s.D("SMACK: Could not connect to:" + next);
                                sb.append("SMACK: Could not connect to ");
                                sb.append(next);
                                sb.append(" port:");
                                sb.append(i);
                                sb.append(" err:");
                                sb.append(this.t.getClass().getSimpleName());
                                sb.append("\n");
                                if (TextUtils.isEmpty(str7)) {
                                    str2 = next;
                                } else {
                                    str2 = str7 + "|" + next;
                                }
                                gvs.h(next, this.t);
                                if (misVarG != null) {
                                    misVarG.t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.t);
                                }
                                if (TextUtils.equals(str3, obs.j(this.x))) {
                                    i2 = i3;
                                    z = false;
                                    wjs.c().w();
                                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                    if (!z) {
                                        gvs.d(0, fs.BATCH_TCP_CONN_SUCCESS.a(), iElapsedRealtime, str2, i2);
                                        return;
                                    }
                                    if (this.C != j) {
                                        this.C = SystemClock.elapsedRealtime();
                                        gvs.d(0, fs.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, obs.w(this.x.getApplicationContext()) ? 1 : 0);
                                    } else {
                                        this.C = SystemClock.elapsedRealtime();
                                        gvs.d(0, fs.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, obs.w(this.x.getApplicationContext()) ? 1 : 0);
                                    }
                                    throw new ha(sb.toString());
                                }
                                str7 = str2;
                                sb = sb;
                                strJ = str3;
                                i4 = i3;
                                it = it;
                                j2 = j;
                                misVarG = misVarG;
                            } catch (Throwable th4) {
                                th = th4;
                                j = 0;
                                this.t = new Exception("abnormal exception", th);
                                x9s.s(th);
                                x9s.D("SMACK: Could not connect to:" + next);
                                sb.append("SMACK: Could not connect to ");
                                sb.append(next);
                                sb.append(" port:");
                                sb.append(i);
                                sb.append(" err:");
                                sb.append(this.t.getClass().getSimpleName());
                                sb.append("\n");
                                if (TextUtils.isEmpty(str7)) {
                                    str2 = next;
                                } else {
                                    str2 = str7 + "|" + next;
                                }
                                gvs.h(next, this.t);
                                if (misVarG != null) {
                                    misVarG.t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.t);
                                }
                                str4 = strJ;
                                if (TextUtils.equals(str4, obs.j(this.x))) {
                                    i2 = i3;
                                    z = false;
                                    wjs.c().w();
                                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                    if (!z) {
                                        gvs.d(0, fs.BATCH_TCP_CONN_SUCCESS.a(), iElapsedRealtime, str2, i2);
                                        return;
                                    }
                                    if (this.C != j) {
                                        this.C = SystemClock.elapsedRealtime();
                                        gvs.d(0, fs.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, obs.w(this.x.getApplicationContext()) ? 1 : 0);
                                    } else {
                                        this.C = SystemClock.elapsedRealtime();
                                        gvs.d(0, fs.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, obs.w(this.x.getApplicationContext()) ? 1 : 0);
                                    }
                                    throw new ha(sb.toString());
                                }
                                str3 = str4;
                                str7 = str2;
                                sb = sb;
                                strJ = str3;
                                i4 = i3;
                                it = it;
                                j2 = j;
                                misVarG = misVarG;
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        it = it;
                        sb = sb;
                        misVarG = misVarG;
                        j = 0;
                        str3 = strJ;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                wjs.c().w();
                iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                if (!z) {
                    gvs.d(0, fs.BATCH_TCP_CONN_SUCCESS.a(), iElapsedRealtime, str2, i2);
                    return;
                }
                if (this.C != j || SystemClock.elapsedRealtime() - this.C > 480000) {
                    this.C = SystemClock.elapsedRealtime();
                    gvs.d(0, fs.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, obs.w(this.x.getApplicationContext()) ? 1 : 0);
                }
                throw new ha(sb.toString());
            }
            sb = sb;
            j = j2;
            i2 = i4;
            str2 = str7;
            z = false;
            wjs.c().w();
            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
            if (!z) {
                gvs.d(0, fs.BATCH_TCP_CONN_SUCCESS.a(), iElapsedRealtime, str2, i2);
                return;
            }
            if (this.C != j) {
                this.C = SystemClock.elapsedRealtime();
                gvs.d(0, fs.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, obs.w(this.x.getApplicationContext()) ? 1 : 0);
            } else {
                this.C = SystemClock.elapsedRealtime();
                gvs.d(0, fs.BATCH_TCP_CONN_FAIL.a(), iElapsedRealtime, str2, obs.w(this.x.getApplicationContext()) ? 1 : 0);
            }
            throw new ha(sb.toString());
            str7 = str2;
            sb = sb;
            strJ = str3;
            i4 = i3;
            it = it;
            j2 = j;
            misVarG = misVarG;
        }
    }

    public void N(String str, long j, Exception exc) {
        mis misVarB = wjs.c().b(jws.b(), false);
        if (misVarB != null) {
            misVarB.t(str, j, 0L, exc);
            wjs.c().w();
        }
    }

    public abstract void O(boolean z);

    public String P() {
        return this.j;
    }

    public void Q(int i, Exception exc) {
        obs.u();
        this.x.a(new wws(this, 2, i, exc));
    }

    public synchronized void R() {
        try {
            if (!D() && !B()) {
                h(0, 0, null);
                K(this.n);
                return;
            }
            x9s.o("WARNING: current xmpp has connected");
        } catch (IOException e) {
            throw new ha(e);
        }
    }

    public void S() {
        this.y = SystemClock.elapsedRealtime();
    }

    public void T() {
        this.z = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.gws
    public String d() {
        return this.w;
    }

    @Override // defpackage.gws
    public void v(int i, Exception exc) {
        J(i, exc);
        if ((exc != null || i == 18) && this.A != 0) {
            L(exc);
        }
    }
}
