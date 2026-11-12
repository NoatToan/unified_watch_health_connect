package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.CommonSegment;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes11.dex */
public class ntr extends CommonSegment {
    private static final long serialVersionUID = 5871138592553728173L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43701b;
    private int f;
    private int i;
    private int j;
    private int d = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43702c = -1;
    private int e = -1;

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getFieldNum() {
        return 5;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public int getSportSegmentMode() {
        return 0;
    }

    public int f() {
        return this.f;
    }

    public void h(int i) {
        this.f = i;
    }

    public int d() {
        return this.f43701b;
    }

    public void e(int i) {
        this.f43701b = i;
    }

    public int b() {
        return this.f43700a;
    }

    public void a(int i) {
        this.f43700a = i;
    }

    public int i() {
        return this.i;
    }

    public void g(int i) {
        this.i = i;
    }

    public int j() {
        return this.j;
    }

    public void j(int i) {
        this.j = i;
    }

    public int c() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public int a() {
        return this.f43702c;
    }

    public void b(int i) {
        this.f43702c = i;
    }

    public int e() {
        return this.e;
    }

    public void c(int i) {
        this.e = i;
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public String toTrackString() {
        StringBuffer stringBuffer = new StringBuffer(30);
        toTrackString(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void toTrackString(StringBuffer stringBuffer) {
        stringBuffer.append("tp=sec").append(";").append("sn=").append(f()).append(";").append("sbst=").append(d()).append(";").append("sdst=").append(b()).append(";").append("shs=").append(i()).append(";").append("sst=").append(j()).append(";").append("sbsa=").append(c()).append(";").append("sdsp=").append(a()).append(";").append("sct=").append(e()).append(";").append(System.lineSeparator());
    }

    @Override // com.huawei.hwsportmodel.CommonSegment
    public void fromTrackString(String[] strArr) {
        if (strArr == null || strArr.length < getFieldNum() + 1) {
            return;
        }
        this.f = CommonUtil.e(strArr[1].split("=")[1], -1);
        this.f43701b = CommonUtil.e(strArr[2].split("=")[1], -1);
        this.f43700a = CommonUtil.e(strArr[3].split("=")[1], -1);
        this.i = CommonUtil.e(strArr[4].split("=")[1], -1);
        this.j = CommonUtil.e(strArr[5].split("=")[1], -1);
        if (strArr.length < 7) {
            return;
        }
        for (int i = 6; i < strArr.length; i++) {
            c(strArr[i].split("="));
        }
    }

    private void c(String[] strArr) {
        if (strArr.length < 2) {
            LogUtil.e("TrackGolfSegment", "initExtendFields kv.length error.");
            this.d = -1;
            this.f43702c = -1;
            this.e = -1;
            return;
        }
        if (strArr[0].equals("sbsa")) {
            this.d = CommonUtil.e(strArr[1], -1);
        } else if (strArr[0].equals("sdsp")) {
            this.f43702c = CommonUtil.e(strArr[1], -1);
        } else if (strArr[0].equals("sct")) {
            this.e = CommonUtil.e(strArr[1], -1);
        }
    }
}
