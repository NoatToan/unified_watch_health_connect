package defpackage;

import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class ebs extends ebl {
    private static final long serialVersionUID = -1074804273256729256L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f32691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f32693c;
    private Integer d;
    private Long e;
    private String i;

    public String h() {
        return this.f32692b;
    }

    public void d(String str) {
        this.f32692b = str;
    }

    public Integer c() {
        return this.d;
    }

    public void b(Integer num) {
        this.d = num;
    }

    public String i() {
        return this.i;
    }

    public void c(String str) {
        this.i = str;
    }

    public Long b() {
        return this.e;
    }

    public void c(Long l) {
        this.e = l;
    }

    public Integer e() {
        return this.f32693c;
    }

    public void c(Integer num) {
        this.f32693c = num;
    }

    public Integer d() {
        return this.f32691a;
    }

    public void e(Integer num) {
        this.f32691a = num;
    }

    @Override // defpackage.ebl
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("CoapSessionResponseOEntityModel{errcode =");
        Object obj = this.f32693c;
        Object obj2 = Constants.NULL;
        if (obj == null) {
            obj = Constants.NULL;
        }
        stringBuffer.append(obj).append("', modeResp =");
        Integer num = this.d;
        if (num != null) {
            obj2 = num;
        }
        stringBuffer.append(obj2).append("'}");
        return stringBuffer.toString();
    }
}
