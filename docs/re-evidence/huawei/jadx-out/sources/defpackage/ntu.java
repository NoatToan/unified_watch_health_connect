package defpackage;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.huawei.hwsportmodel.CommonSegment;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ntu extends CommonSegment {
    private static final long serialVersionUID = -1816333042159669204L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f43709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f43710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43711c;
    private float d;
    private boolean e;
    private long f;
    private float g;
    private int h;
    private int i;
    private float j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private long r;
    private int s;
    private long t;
    private long v;
    private int w;

    public int c() {
        return 4;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getFieldNum() {
        return 14;
    }

    public ntu() {
        this.e = false;
        this.n = -1;
        this.o = -1;
        this.q = -1;
        this.l = -1;
        this.w = 0;
        this.h = 0;
        this.f43711c = 0;
        this.f43709a = 0.0f;
        this.f43710b = 0.0f;
        this.g = 0.0f;
        this.j = -1.0f;
        this.d = -1.0f;
    }

    public ntu(ntu ntuVar) {
        this.e = false;
        this.n = -1;
        this.o = -1;
        this.q = -1;
        this.l = -1;
        this.w = 0;
        this.h = 0;
        this.f43711c = 0;
        this.f43709a = 0.0f;
        this.f43710b = 0.0f;
        this.g = 0.0f;
        this.j = -1.0f;
        this.d = -1.0f;
        if (ntuVar != null) {
            this.t = ntuVar.t;
            this.f = ntuVar.f;
            this.p = ntuVar.p;
            this.k = ntuVar.k;
            this.i = ntuVar.i;
            this.s = ntuVar.s;
            this.v = ntuVar.v;
            this.r = ntuVar.r;
            this.n = ntuVar.n;
            this.o = ntuVar.o;
            this.q = ntuVar.q;
            this.l = ntuVar.l;
            this.w = ntuVar.w;
            this.f43711c = ntuVar.f43711c;
            this.f43709a = ntuVar.f43709a;
            this.f43710b = ntuVar.f43710b;
            this.g = ntuVar.g;
            this.j = ntuVar.j;
            this.d = ntuVar.d;
            this.h = ntuVar.h;
            return;
        }
        y();
    }

    public int w() {
        return this.w;
    }

    public void o(int i) {
        this.w = i;
    }

    public int f() {
        return this.h;
    }

    public void a(int i) {
        this.h = i;
    }

    public int l() {
        return this.m;
    }

    public void h(int i) {
        this.m = i;
    }

    public long r() {
        return this.t;
    }

    public void e(long j) {
        this.t = j;
    }

    public long i() {
        return this.f;
    }

    public void a(long j) {
        this.f = j;
    }

    public int s() {
        return this.p;
    }

    public void i(int i) {
        this.p = i;
    }

    public int m() {
        return this.k;
    }

    public void j(int i) {
        this.k = i;
    }

    public int g() {
        return this.i;
    }

    public void b(int i) {
        this.i = i;
    }

    public int t() {
        return this.s;
    }

    public void g(int i) {
        this.s = i;
    }

    public long v() {
        return this.v;
    }

    public void c(long j) {
        this.v = j;
    }

    public long q() {
        return this.r;
    }

    public void b(long j) {
        this.r = j;
    }

    public int n() {
        return this.n;
    }

    public void d(int i) {
        this.n = i;
    }

    public int o() {
        return this.o;
    }

    public void f(int i) {
        this.o = i;
    }

    public int p() {
        return this.q;
    }

    public void l(int i) {
        this.q = i;
    }

    public int k() {
        return this.l;
    }

    public void e(int i) {
        this.l = i;
    }

    public int e() {
        return this.f43711c;
    }

    public void c(int i) {
        this.f43711c = i;
    }

    public float a() {
        return this.f43709a;
    }

    public void e(float f) {
        this.f43709a = f;
    }

    public float d() {
        return this.f43710b;
    }

    public void c(float f) {
        this.f43710b = f;
    }

    public float j() {
        return this.g;
    }

    public void d(float f) {
        this.g = f;
    }

    public float h() {
        return this.j;
    }

    public void a(float f) {
        this.j = f;
    }

    public float b() {
        return this.d;
    }

    public void b(float f) {
        this.d = f;
    }

    public boolean x() {
        return (this.l == -1 && this.o == -1 && this.n == -1 && this.q == -1) ? false : true;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getSportSegmentMode() {
        return this.w > 0 ? 1 : 0;
    }

    public void u() {
        this.t = 0L;
        this.f = 0L;
        this.p = 0;
        this.k = 0;
        this.i = 0;
        this.s = 0;
        this.v = 0L;
        this.r = 0L;
        this.n = 0;
        this.o = 0;
        this.q = 0;
        this.l = 0;
        this.w = 0;
        this.f43711c = 0;
        this.f43709a = 0.0f;
        this.f43710b = 0.0f;
        this.g = 0.0f;
        this.j = 0.0f;
        this.d = 0.0f;
        this.h = 0;
    }

    public final void y() {
        this.t = -1L;
        this.f = -1L;
        this.p = -1;
        this.k = -1;
        this.i = -1;
        this.s = -1;
        this.v = -1L;
        this.r = -1L;
        this.n = -1;
        this.o = -1;
        this.q = -1;
        this.l = -1;
        this.f43711c = -1;
        this.f43709a = -1.0f;
        this.f43710b = -1.0f;
        this.g = -1.0f;
        this.j = -1.0f;
        this.d = -1.0f;
        this.h = -1;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public String toTrackString() {
        StringBuffer stringBuffer = new StringBuffer(50);
        toTrackString(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void toTrackString(StringBuffer stringBuffer) {
        stringBuffer.append("tp=sec").append(";").append("sn=").append(l()).append(";").append("st=").append(r()).append(";").append("sd=").append(i()).append(";").append("sp=").append(s()).append(";").append("shr=").append(m()).append(";").append("sc=").append(g()).append(";").append("ssl=").append(t()).append(";").append("str=").append(v()).append(";").append("std=").append(q()).append(";").append("sgct=").append(n()).append(";").append("sgia=").append(o()).append(";").append("ssa=").append(p()).append(";").append("see=").append(k()).append(";").append("stp=").append(w()).append(";").append(z());
    }

    private StringBuffer z() {
        return new StringBuffer().append("sht=").append(e()).append(";sgtb=").append(a()).append(";svo=").append(d()).append(";svr=").append(j()).append(";spi=").append(h()).append(";spir=").append(b()).append(";saap=").append(f()).append(";").append(System.lineSeparator());
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void fromTrackString(String[] strArr) {
        if (strArr == null) {
            return;
        }
        HashMap map = new HashMap(strArr.length);
        for (String str : strArr) {
            String[] strArrSplit = str.split("=");
            if (strArrSplit.length >= 2) {
                map.put(strArrSplit[0], strArrSplit[1]);
            }
        }
        this.m = CommonUtil.e(map.get("sn"), -1);
        this.t = CommonUtil.a(map.get(CmcdConfiguration.KEY_STREAM_TYPE), -1L);
        this.f = CommonUtil.a(map.get("sd"), -1L);
        this.p = CommonUtil.e(map.get("sp"), -1);
        this.k = CommonUtil.e(map.get("shr"), -1);
        this.i = CommonUtil.e(map.get("sc"), -1);
        this.s = CommonUtil.e(map.get("ssl"), -1);
        this.v = CommonUtil.a(map.get("str"), -1L);
        this.r = CommonUtil.a(map.get("std"), -1L);
        this.n = CommonUtil.e(map.get("sgct"), -1);
        this.o = CommonUtil.e(map.get("sgia"), -1);
        this.q = CommonUtil.e(map.get("ssa"), -1);
        this.l = CommonUtil.e(map.get("see"), -1);
        this.w = CommonUtil.e(map.get("stp"), -1);
        this.h = CommonUtil.e(map.get("saap"), -1);
        e(map);
    }

    private void e(Map<String, String> map) {
        if (this.e) {
            this.f43711c = CommonUtil.e(map.get("sht"), -1);
            this.f43709a = CommonUtil.c(map.get("sgtb"), -1.0f);
            this.f43710b = CommonUtil.c(map.get("svo"), -1.0f);
            this.g = CommonUtil.c(map.get("svr"), -1.0f);
            this.j = CommonUtil.c(map.get("spi"), -1.0f);
            this.d = CommonUtil.c(map.get("spir"), -1.0f);
        }
    }
}
