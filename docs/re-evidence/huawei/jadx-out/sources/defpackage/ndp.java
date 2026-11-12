package defpackage;

import com.huawei.hms.ads.dynamic.a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EmuiBuild;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes11.dex */
public class ndp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42955c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;

    public void q(String str) {
        this.p = str;
    }

    public void m(String str) {
        this.m = str;
    }

    public void o(String str) {
        this.o = str;
    }

    public void n(String str) {
        this.l = str;
    }

    public void b(String str) {
        this.f42955c = str;
    }

    public void d(String str) {
        this.f42953a = str;
    }

    public void i(String str) {
        this.h = str;
    }

    public void e(String str) {
        this.e = str;
    }

    public void a(String str) {
        this.f42954b = str;
    }

    public void j(String str) {
        this.i = str;
    }

    public void r(String str) {
        this.q = str;
    }

    public void f(String str) {
        this.f = str;
    }

    public void t(String str) {
        this.s = str;
    }

    public void l(String str) {
        this.k = str;
    }

    public void s(String str) {
        this.r = str;
    }

    public void p(String str) {
        this.t = str;
    }

    public void y(String str) {
        this.u = str;
    }

    public void g(String str) {
        this.j = str;
    }

    public void h(String str) {
        this.g = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public void k(String str) {
        this.n = str;
    }

    public byte[] d() {
        return eeq.c(HiAnalyticsConstant.KeyAndValue.NUMBER_01 + eeq.d(this.e.length() / 2) + this.e);
    }

    public byte[] b() {
        return eeq.c(a.t + eeq.d(this.f42954b.length() / 2) + this.f42954b);
    }

    public byte[] i() {
        return eeq.c("03" + eeq.d(this.i.length() / 2) + this.i);
    }

    public byte[] y() {
        return eeq.c("04" + eeq.d(this.q.length() / 2) + this.q);
    }

    public byte[] g() {
        return eeq.c("05" + eeq.d(this.f.length() / 2) + this.f);
    }

    public byte[] s() {
        return eeq.c("06" + eeq.d(this.s.length() / 2) + this.s);
    }

    public byte[] k() {
        return eeq.c("07" + eeq.d(this.k.length() / 2) + this.k);
    }

    public byte[] q() {
        return eeq.c("08" + eeq.d(this.r.length() / 2) + this.r);
    }

    public byte[] p() {
        return eeq.c("09" + eeq.d(this.t.length() / 2) + this.t);
    }

    public byte[] v() {
        return eeq.c("0A" + eeq.d(this.u.length() / 2) + this.u);
    }

    public byte[] j() {
        return eeq.c("0B" + eeq.d(this.j.length() / 2) + this.j);
    }

    public byte[] h() {
        return eeq.c("0C" + eeq.d(this.g.length() / 2) + this.g);
    }

    public byte[] a() {
        return eeq.c("0D" + eeq.d(this.d.length() / 2) + this.d);
    }

    public byte[] f() {
        return eeq.c("10" + eeq.d(this.h.length() / 2) + this.h);
    }

    public byte[] e() {
        return eeq.c("11" + eeq.d(this.f42953a.length() / 2) + this.f42953a);
    }

    public byte[] o() {
        return eeq.c("0E" + eeq.d(this.n.length() / 2) + this.n);
    }

    public byte[] c() {
        return eeq.c("12" + eeq.d(this.f42955c.length() / 2) + this.f42955c);
    }

    public byte[] m() {
        return eeq.c("13" + eeq.d(this.m.length() / 2) + this.m);
    }

    public byte[] l() {
        return eeq.c("14" + eeq.d(this.o.length() / 2) + this.o);
    }

    public byte[] n() {
        return eeq.c("15" + eeq.d(this.l.length() / 2) + this.l);
    }

    public byte[] t() {
        return eeq.c("16" + eeq.d(this.p.length() / 2) + this.p);
    }

    public int a(List<Integer> list) {
        int length;
        Iterator<Integer> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            switch (iIntValue) {
                case 1:
                    length = d().length;
                    break;
                case 2:
                    length = b().length;
                    break;
                case 3:
                    length = i().length;
                    break;
                case 4:
                    length = y().length;
                    break;
                case 5:
                    length = g().length;
                    break;
                case 6:
                    length = s().length;
                    break;
                case 7:
                    length = k().length;
                    break;
                case 8:
                    length = q().length;
                    break;
                case 9:
                    length = p().length;
                    break;
                case 10:
                    length = v().length;
                    break;
                case 11:
                    length = j().length;
                    break;
                case 12:
                    length = h().length;
                    break;
                default:
                    length = e(iIntValue);
                    break;
            }
            i += length;
        }
        return i;
    }

    private int e(int i) {
        switch (i) {
            case 13:
                return a().length;
            case 14:
                return o().length;
            case 15:
            default:
                LogUtil.j("PhoneInfo", "can't recognize tag");
                return 0;
            case 16:
                return f().length;
            case 17:
                return e().length;
            case 18:
                return c().length;
            case 19:
                return m().length;
            case 20:
                return l().length;
            case 21:
                return n().length;
            case 22:
                return t().length;
        }
    }

    public void c(List<Integer> list, ByteBuffer byteBuffer) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            switch (iIntValue) {
                case 1:
                    byteBuffer.put(d());
                    break;
                case 2:
                    byteBuffer.put(b());
                    break;
                case 3:
                    byteBuffer.put(i());
                    break;
                case 4:
                    byteBuffer.put(y());
                    break;
                case 5:
                    byteBuffer.put(g());
                    break;
                case 6:
                    byteBuffer.put(s());
                    break;
                case 7:
                    byteBuffer.put(k());
                    break;
                case 8:
                    byteBuffer.put(q());
                    break;
                case 9:
                    byteBuffer.put(p());
                    break;
                case 10:
                    byteBuffer.put(v());
                    break;
                case 11:
                    byteBuffer.put(j());
                    break;
                case 12:
                    byteBuffer.put(h());
                    break;
                case 13:
                    byteBuffer.put(a());
                    break;
                default:
                    e(iIntValue, byteBuffer);
                    break;
            }
        }
    }

    private void e(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 14:
                byteBuffer.put(o());
                break;
            case 15:
            default:
                LogUtil.j("PhoneInfo", "can't recognize tag");
                break;
            case 16:
                byteBuffer.put(f());
                break;
            case 17:
                byteBuffer.put(e());
                break;
            case 18:
                byteBuffer.put(c());
                break;
            case 19:
                byteBuffer.put(m());
                break;
            case 20:
                byteBuffer.put(l());
                break;
            case 21:
                byteBuffer.put(n());
                break;
            case 22:
                byteBuffer.put(t());
                break;
        }
    }

    public int r() {
        if (CommonUtil.bg()) {
            return EmuiBuild.e;
        }
        return 0;
    }

    public String u() {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        return eeq.d(iCurrentTimeMillis >> 24) + eeq.d((iCurrentTimeMillis >> 16) & 255) + eeq.d((iCurrentTimeMillis >> 8) & 255) + eeq.d(iCurrentTimeMillis & 255);
    }

    public String x() {
        int offset = TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 3600;
        int iAbs = offset / 1000;
        int iAbs2 = (Math.abs(offset % 1000) * 60) / 1000;
        if (iAbs < 0) {
            iAbs = Math.abs(iAbs) + 128;
        }
        int i = (iAbs << 8) + iAbs2;
        return eeq.d(i >> 8) + eeq.d(i & 255);
    }
}
