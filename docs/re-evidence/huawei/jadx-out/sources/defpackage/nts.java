package defpackage;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.CommonSegment;
import health.compact.a.CommonUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class nts extends CommonSegment {
    private static final long serialVersionUID = 4898624082127999532L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mSectionAvgSpeed")
    private int f43703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mSectionAvgSlopeDegree")
    private int f43704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mSectionAverageGForce")
    private float f43705c;

    @SerializedName("mSectionAvgSlopePercent")
    private int d;

    @SerializedName("mSectionAvgTurnFrequency")
    private int e;

    @SerializedName("mSectionLeftTurnNumber")
    private int f;

    @SerializedName("mSectionEndGpsPointIndex")
    private long g;

    @SerializedName("mSectionCableStartGpsPointIndex")
    private long h;

    @SerializedName("mSectionDistance")
    private long i;

    @SerializedName("mSectionCableEndGpsPointIndex")
    private long j;

    @SerializedName("mSectionRightTurnNumber")
    private int k;

    @SerializedName("mSectionLongRadiusTurn")
    private int l;

    @SerializedName("mSectionNum")
    private int m;

    @SerializedName("mSectionMaxSpeed")
    private int n;

    @SerializedName("mSectionMaxGForce")
    private float o;

    @SerializedName("mSectionSlopePercent")
    private int p;

    @SerializedName("mSectionSlopeDegree")
    private int q;

    @SerializedName("mSectionStartGpsPointIndex")
    private long r;

    @SerializedName("mSectionShortRadiusTurn")
    private int s;

    @SerializedName("mSectionTime")
    private long t;

    @SerializedName("mSectionTotalTurnNumber")
    private int w;

    @SerializedName("mSectionTotalDescend")
    private long y;

    public int b() {
        return 11;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getFieldNum() {
        return 11;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getSportSegmentMode() {
        return 0;
    }

    public nts() {
        x();
    }

    public nts(nts ntsVar) {
        if (ntsVar != null) {
            this.m = ntsVar.m;
            this.t = ntsVar.t;
            this.i = ntsVar.i;
            this.n = ntsVar.n;
            this.f43703a = ntsVar.f43703a;
            this.r = ntsVar.r;
            this.g = ntsVar.g;
            this.h = ntsVar.h;
            this.j = ntsVar.j;
            this.q = ntsVar.q;
            this.p = ntsVar.p;
            this.f43704b = ntsVar.f43704b;
            this.d = ntsVar.d;
            this.y = ntsVar.y;
            this.w = ntsVar.w;
            this.f = ntsVar.f;
            this.k = ntsVar.k;
            this.e = ntsVar.e;
            this.l = ntsVar.l;
            this.s = ntsVar.s;
            this.o = ntsVar.o;
            this.f43705c = ntsVar.f43705c;
            return;
        }
        x();
    }

    public int n() {
        return this.m;
    }

    public void i(int i) {
        this.m = i;
    }

    public long y() {
        return this.t;
    }

    public void i(long j) {
        this.t = j;
    }

    public long g() {
        return this.i;
    }

    public void c(long j) {
        this.i = j;
    }

    public int m() {
        return this.n;
    }

    public void h(int i) {
        this.n = i;
    }

    public int d() {
        return this.f43703a;
    }

    public void a(int i) {
        this.f43703a = i;
    }

    public long r() {
        return this.r;
    }

    public void a(long j) {
        this.r = j;
    }

    public long h() {
        return this.g;
    }

    public void b(long j) {
        this.g = j;
    }

    public long i() {
        return this.h;
    }

    public void d(long j) {
        this.h = j;
    }

    public long f() {
        return this.j;
    }

    public void e(long j) {
        this.j = j;
    }

    public int t() {
        return this.q;
    }

    public void k(int i) {
        this.q = i;
    }

    public int q() {
        return this.p;
    }

    public void n(int i) {
        this.p = i;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public String toTrackString() {
        StringBuffer stringBuffer = new StringBuffer(40);
        toTrackString(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void toTrackString(StringBuffer stringBuffer) {
        stringBuffer.append("tp=sec").append(";").append("sn=").append(n()).append(";").append("st=").append(y()).append(";").append("skid=").append(g()).append(";").append("msp=").append(m()).append(";").append("asp=").append(d()).append(";").append("sgps=").append(r()).append(";").append("egps=").append(h()).append(";").append("csgps=").append(i()).append(";").append("cegps=").append(f()).append(";").append("sd=").append(t()).append(";").append("sp=").append(q()).append(";").append("sasde=").append(a()).append(";").append("saspe=").append(e()).append(";").append("std=").append(v()).append(";");
        if (u() != -1) {
            stringBuffer.append("sttn=").append(u()).append(";");
        }
        if (k() != -1) {
            stringBuffer.append("sltn=").append(k()).append(";");
        }
        if (p() != -1) {
            stringBuffer.append("srtn=").append(p()).append(";");
        }
        if (j() != -1) {
            stringBuffer.append("satf=").append(j()).append(";");
        }
        if (o() != -1) {
            stringBuffer.append("slrt=").append(o()).append(";");
        }
        if (s() != -1) {
            stringBuffer.append("ssrt=").append(s()).append(";");
        }
        if (Float.compare(l(), -1.0f) != 0) {
            stringBuffer.append("smgf=").append(l()).append(";");
        }
        if (Float.compare(c(), -1.0f) != 0) {
            stringBuffer.append("sagf=").append(c()).append(";");
        }
        stringBuffer.append(System.lineSeparator());
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void fromTrackString(String[] strArr) {
        LogUtil.d("TrackSkiSegment", "fromTrackString ", strArr);
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
        this.m = CommonUtil.e((String) map.get("sn"), -1);
        this.t = CommonUtil.a((String) map.get(CmcdConfiguration.KEY_STREAM_TYPE), -1L);
        this.i = CommonUtil.a((String) map.get("skid"), -1L);
        this.n = CommonUtil.e((String) map.get("msp"), -1);
        this.f43703a = CommonUtil.e((String) map.get("asp"), -1);
        this.r = CommonUtil.a((String) map.get("sgps"), -1L);
        this.g = CommonUtil.a((String) map.get("egps"), -1L);
        this.h = CommonUtil.a((String) map.get("csgps"), -1L);
        this.j = CommonUtil.a((String) map.get("cegps"), -1L);
        this.q = CommonUtil.e((String) map.get("sd"), -1);
        this.p = CommonUtil.e((String) map.get("sp"), -1);
        this.f43704b = CommonUtil.e((String) map.get("sasde"), -1);
        this.d = CommonUtil.e((String) map.get("saspe"), -1);
        this.y = CommonUtil.a((String) map.get("std"), -1L);
        this.w = CommonUtil.e((String) map.get("sttn"), -1);
        this.f = CommonUtil.e((String) map.get("sltn"), -1);
        this.k = CommonUtil.e((String) map.get("srtn"), -1);
        this.e = CommonUtil.e((String) map.get("satf"), -1);
        this.l = CommonUtil.e((String) map.get("slrt"), -1);
        this.s = CommonUtil.e((String) map.get("ssrt"), -1);
        this.o = CommonUtil.c((String) map.get("smgf"), -1.0f);
        this.f43705c = CommonUtil.c((String) map.get("sagf"), -1.0f);
    }

    public final void x() {
        this.t = -1L;
        this.i = -1L;
        this.n = -1;
        this.f43703a = -1;
        this.r = -1L;
        this.g = -1L;
        this.h = -1L;
        this.j = -1L;
        this.q = -1;
        this.p = -1;
        this.f43704b = -1;
        this.d = -1;
        this.y = -1L;
        this.w = -1;
        this.f = -1;
        this.k = -1;
        this.e = -1;
        this.l = -1;
        this.s = -1;
        this.o = -1.0f;
        this.f43705c = -1.0f;
    }

    public int a() {
        return this.f43704b;
    }

    public int e() {
        return this.d;
    }

    public long v() {
        return this.y;
    }

    public void d(int i) {
        this.f43704b = i;
    }

    public void b(int i) {
        this.d = i;
    }

    public void g(long j) {
        this.y = j;
    }

    public float c() {
        return this.f43705c;
    }

    public void e(float f) {
        this.f43705c = f;
    }

    public float l() {
        return this.o;
    }

    public void d(float f) {
        this.o = f;
    }

    public int s() {
        return this.s;
    }

    public void f(int i) {
        this.s = i;
    }

    public int o() {
        return this.l;
    }

    public void j(int i) {
        this.l = i;
    }

    public int j() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public int p() {
        return this.k;
    }

    public void g(int i) {
        this.k = i;
    }

    public int k() {
        return this.f;
    }

    public void c(int i) {
        this.f = i;
    }

    public int u() {
        return this.w;
    }

    public void o(int i) {
        this.w = i;
    }
}
