package defpackage;

import com.huawei.hwsportmodel.CommonSegment;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nto extends CommonSegment {
    private static final long serialVersionUID = -447041175639210488L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43692a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43693c;
    private int d = 0;
    private long e;

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getFieldNum() {
        return 4;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getSportSegmentMode() {
        return 1;
    }

    public int b() {
        return this.f43693c;
    }

    public void d(int i) {
        this.f43693c = i;
    }

    public long a() {
        return this.e;
    }

    public void b(long j) {
        this.e = j;
    }

    public int c() {
        return this.f43692a;
    }

    public void b(int i) {
        this.f43692a = i;
    }

    public int e() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public String toTrackString() {
        StringBuffer stringBuffer = new StringBuffer(50);
        toTrackString(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void toTrackString(StringBuffer stringBuffer) {
        stringBuffer.append("tp=sec").append(";").append("sn=").append(b()).append(";").append("st=").append(a()).append(";").append("shr=").append(c()).append(";").append("stp=").append(e()).append(";").append(System.lineSeparator());
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void fromTrackString(String[] strArr) {
        if (strArr == null || strArr.length < getFieldNum() + 1) {
            return;
        }
        this.f43693c = CommonUtil.e(strArr[1].split("=")[1], -1);
        this.e = CommonUtil.a(strArr[2].split("=")[1], -1L);
        this.f43692a = CommonUtil.e(strArr[3].split("=")[1], -1);
        this.d = CommonUtil.e(strArr[4].split("=")[1], -1);
    }
}
