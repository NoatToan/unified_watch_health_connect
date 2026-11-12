package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.CommonSegment;
import health.compact.a.CommonUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class ntm extends CommonSegment {
    private static final long serialVersionUID = 2768423466126702180L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43690c;
    private int d;
    private int e;
    private long f;

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getFieldNum() {
        return 6;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getSportSegmentMode() {
        return 0;
    }

    public int d() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    public long j() {
        return this.f;
    }

    public void c(long j) {
        this.f = j;
    }

    public int a() {
        return this.f43688a;
    }

    public void d(int i) {
        this.f43688a = i;
    }

    public int e() {
        return this.f43690c;
    }

    public void b(int i) {
        this.f43690c = i;
    }

    public int c() {
        return this.f43689b;
    }

    public void a(int i) {
        this.f43689b = i;
    }

    public int b() {
        return this.e;
    }

    public void c(int i) {
        this.e = i;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public String toTrackString() {
        StringBuffer stringBuffer = new StringBuffer(40);
        toTrackString(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void toTrackString(StringBuffer stringBuffer) {
        stringBuffer.append("tp=sec").append(";").append("sn=").append(d()).append(";").append("st=").append(j()).append(";").append("sc=").append(a()).append(";").append("spw=").append(e()).append(";").append("spp=").append(c()).append(";").append("shr=").append(b()).append(";").append(System.lineSeparator());
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void fromTrackString(String[] strArr) {
        if (strArr == null || strArr.length < getFieldNum() + 1) {
            LogUtil.j("RowingMachineSegment", "strArray is invalid");
            return;
        }
        this.d = CommonUtil.e(strArr[1].split("=")[1], -1);
        this.f = CommonUtil.a(strArr[2].split("=")[1], -1L);
        this.f43688a = CommonUtil.e(strArr[3].split("=")[1], -1);
        this.f43690c = CommonUtil.e(strArr[4].split("=")[1], -1);
        this.f43689b = CommonUtil.e(strArr[5].split("=")[1], -1);
        this.e = CommonUtil.e(strArr[6].split("=")[1], -1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.d == ((ntm) obj).d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.d));
    }
}
