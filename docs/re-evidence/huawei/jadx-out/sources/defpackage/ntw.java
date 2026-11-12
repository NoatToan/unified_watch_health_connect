package defpackage;

import com.huawei.health.servicesapi.R;
import com.huawei.hwsportmodel.CommonSegment;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes11.dex */
public class ntw extends CommonSegment {
    private static final long serialVersionUID = 5871138592553728176L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f43713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43714c;
    private int d;
    private long e;
    private String f;
    private int g;

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getFieldNum() {
        return 7;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getSportSegmentMode() {
        return 0;
    }

    public int f() {
        return this.g;
    }

    public String c() {
        return this.f43714c;
    }

    public int h() {
        return this.f43712a;
    }

    public String g() {
        return this.f;
    }

    public int b() {
        return this.d;
    }

    public long a() {
        return this.e;
    }

    public long d() {
        return this.f43713b;
    }

    public String e() {
        if (h() <= 0) {
            return qre.f(R.string.IDS_motiontrack_show_invalid_data);
        }
        return h() + g();
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public String toTrackString() {
        StringBuffer stringBuffer = new StringBuffer(50);
        toTrackString(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void toTrackString(StringBuffer stringBuffer) {
        stringBuffer.append("tp=sec").append(";").append("sn=").append(f()).append(";").append("an=").append(c()).append(";").append("tw=").append(h()).append(";").append("wn=").append(g()).append(";").append("gac=").append(b()).append(";").append("gt=").append(a()).append(";").append("grt=").append(d()).append(";").append(System.lineSeparator());
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void fromTrackString(String[] strArr) {
        if (strArr == null || strArr.length < getFieldNum() + 1) {
            return;
        }
        this.g = CommonUtil.e(strArr[1].split("=")[1], -1);
        this.f43714c = strArr[2].split("=")[1];
        this.f43712a = CommonUtil.e(strArr[3].split("=")[1], -1);
        this.f = strArr[4].split("=")[1];
        this.d = CommonUtil.e(strArr[5].split("=")[1], -1);
        this.e = CommonUtil.e(strArr[6].split("=")[1], -1);
        this.f43713b = CommonUtil.e(strArr[7].split("=")[1], -1);
    }
}
