package defpackage;

import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class ebq extends ebl {
    private static final long serialVersionUID = 8809056063570514076L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f32687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f32688c;
    private Integer e;

    public Integer e() {
        return this.f32687b;
    }

    public void e(Integer num) {
        this.f32687b = num;
    }

    public Integer b() {
        return this.f32688c;
    }

    public void b(Integer num) {
        this.f32688c = num;
    }

    public String d() {
        return this.f32686a;
    }

    public void a(String str) {
        this.f32686a = str;
    }

    public Integer c() {
        return this.e;
    }

    public void a(Integer num) {
        this.e = num;
    }

    @Override // defpackage.ebl
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("CoapSessionInterfaceOEntityModel{errorCode =");
        stringBuffer.append(a());
        StringBuffer stringBufferAppend = stringBuffer.append(", type =");
        Object obj = this.f32687b;
        Object obj2 = Constants.NULL;
        if (obj == null) {
            obj = Constants.NULL;
        }
        stringBufferAppend.append(obj);
        StringBuffer stringBufferAppend2 = stringBuffer.append(", modeSupport =");
        Integer num = this.f32688c;
        if (num != null) {
            obj2 = num;
        }
        stringBufferAppend2.append(obj2);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
