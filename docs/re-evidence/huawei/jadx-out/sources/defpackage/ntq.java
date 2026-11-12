package defpackage;

import com.huawei.hwsportmodel.CommonSegment;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes11.dex */
public class ntq extends CommonSegment {
    private static final long serialVersionUID = -5518080497760210736L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43699c;
    private int d;
    private int e;
    private long f;
    private int g;
    private long h;
    private int i;
    private int j;

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getFieldNum() {
        return 10;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getSportSegmentMode() {
        return 0;
    }

    public int e() {
        return this.f43697a;
    }

    public void e(int i) {
        this.f43697a = i;
    }

    public long i() {
        return this.h;
    }

    public void c(long j) {
        this.h = j;
    }

    public int a() {
        return this.f43698b;
    }

    public void b(int i) {
        this.f43698b = i;
    }

    public int f() {
        return this.j;
    }

    public void i(int i) {
        this.j = i;
    }

    public int h() {
        return this.i;
    }

    public void j(int i) {
        this.i = i;
    }

    public int c() {
        return this.e;
    }

    public void c(int i) {
        this.e = i;
    }

    public int d() {
        return this.d;
    }

    public int b() {
        return this.f43699c;
    }

    public void a(int i) {
        this.f43699c = i;
    }

    public long j() {
        return this.f;
    }

    public void e(long j) {
        this.f = j;
    }

    public int g() {
        return this.g;
    }

    public void d(int i) {
        this.g = i;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public String toTrackString() {
        StringBuffer stringBuffer = new StringBuffer(80);
        toTrackString(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void toTrackString(StringBuffer stringBuffer) {
        stringBuffer.append("tp=sec").append(";").append("sn=").append(e()).append(";").append("st=").append(i()).append(";").append("shr=").append(a()).append(";").append("stp=").append(f()).append(";").append("stsn=").append(h()).append(";").append("sass=").append(c()).append(";").append("smsn=").append(d()).append(";").append("sin=").append(b()).append(";").append("srt=").append(j()).append(";").append("stc=").append(g()).append(System.lineSeparator());
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void fromTrackString(String[] strArr) {
        if (strArr == null || strArr.length < getFieldNum() + 1) {
            return;
        }
        this.f43697a = CommonUtil.e(strArr[1].split("=")[1], -1);
        this.h = CommonUtil.e(strArr[2].split("=")[1], -1);
        this.f43698b = CommonUtil.e(strArr[3].split("=")[1], -1);
        this.j = CommonUtil.e(strArr[4].split("=")[1], -1);
        this.i = CommonUtil.e(strArr[5].split("=")[1], -1);
        this.e = CommonUtil.e(strArr[6].split("=")[1], -1);
        this.d = CommonUtil.e(strArr[7].split("=")[1], -1);
        this.f43699c = CommonUtil.e(strArr[8].split("=")[1], -1);
        this.f = CommonUtil.e(strArr[9].split("=")[1], -1);
        this.g = CommonUtil.e(strArr[10].split("=")[1], -1);
    }
}
