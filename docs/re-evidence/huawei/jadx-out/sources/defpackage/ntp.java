package defpackage;

import com.huawei.hwsportmodel.CommonSegment;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes11.dex */
public class ntp extends CommonSegment {
    private static final long serialVersionUID = -8701188853113981276L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f43694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43696c;
    private int d;
    private int e;
    private long f;
    private long g;
    private int h;
    private long j;

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getFieldNum() {
        return 9;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getSportSegmentMode() {
        return 1;
    }

    public ntp() {
        this.h = 0;
    }

    public ntp(ntp ntpVar) {
        this.h = 0;
        if (ntpVar != null) {
            this.e = ntpVar.e;
            this.f = ntpVar.f;
            this.f43694a = ntpVar.f43694a;
            this.d = ntpVar.d;
            this.f43696c = ntpVar.f43696c;
            this.f43695b = ntpVar.f43695b;
            this.j = ntpVar.j;
            this.g = ntpVar.g;
            this.h = ntpVar.h;
            return;
        }
        i();
    }

    public int e() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public long j() {
        return this.f;
    }

    public int a() {
        return this.f43696c;
    }

    public void b(int i) {
        this.f43696c = i;
    }

    public void b(long j) {
        this.f = j;
    }

    public long d() {
        return this.f43694a;
    }

    public void e(long j) {
        this.f43694a = j;
    }

    public int b() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public int c() {
        return this.f43695b;
    }

    public void c(int i) {
        this.f43695b = i;
    }

    public long g() {
        return this.j;
    }

    public void d(long j) {
        this.j = j;
    }

    public long f() {
        return this.g;
    }

    public void a(long j) {
        this.g = j;
    }

    public int h() {
        return this.h;
    }

    public void a(int i) {
        this.h = i;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public String toTrackString() {
        StringBuffer stringBuffer = new StringBuffer(50);
        toTrackString(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void toTrackString(StringBuffer stringBuffer) {
        stringBuffer.append("tp=sec").append(";").append("sn=").append(e()).append(";").append("st=").append(j()).append(";").append("sd=").append(d()).append(";").append("shr=").append(b()).append(";").append("str=").append(g()).append(";").append("std=").append(f()).append(";").append("stp=").append(h()).append(";").append("sas=").append(a()).append(";").append("sac=").append(c()).append(";").append(System.lineSeparator());
    }

    public final void i() {
        this.f = -1L;
        this.f43694a = -1L;
        this.d = -1;
        this.j = -1L;
        this.g = -1L;
        this.f43695b = -1;
        this.f43696c = -1;
        this.h = 0;
    }

    public final void m() {
        this.f = 0L;
        this.f43694a = 0L;
        this.d = 0;
        this.j = 0L;
        this.g = 0L;
        this.f43695b = 0;
        this.f43696c = 0;
        this.h = 0;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void fromTrackString(String[] strArr) {
        if (strArr == null || strArr.length < getFieldNum() + 1) {
            return;
        }
        this.e = CommonUtil.e(strArr[1].split("=")[1], -1);
        this.f = CommonUtil.a(strArr[2].split("=")[1], -1L);
        this.f43694a = CommonUtil.a(strArr[3].split("=")[1], -1L);
        this.d = CommonUtil.e(strArr[4].split("=")[1], -1);
        this.j = CommonUtil.a(strArr[5].split("=")[1], -1L);
        this.g = CommonUtil.a(strArr[6].split("=")[1], -1L);
        this.h = CommonUtil.e(strArr[7].split("=")[1], -1);
        this.f43696c = CommonUtil.e(strArr[8].split("=")[1], -1);
        this.f43695b = CommonUtil.e(strArr[9].split("=")[1], -1);
    }
}
