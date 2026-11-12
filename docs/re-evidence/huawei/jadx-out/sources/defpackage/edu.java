package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class edu implements Serializable {
    private static final long serialVersionUID = 1557041249539848525L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32816c;
    private List<String> d;
    private String e;
    private List<String> f;

    public List<String> g() {
        return this.f;
    }

    public void b(List<String> list) {
        this.f = list;
    }

    public String c() {
        return this.f32816c;
    }

    public void e(String str) {
        this.f32816c = str;
    }

    public String d() {
        return this.e;
    }

    public void b(String str) {
        this.e = str;
    }

    public String b() {
        return this.f32814a;
    }

    public void a(String str) {
        this.f32814a = str;
    }

    public List<String> a() {
        return this.d;
    }

    public void a(List<String> list) {
        this.d = list;
    }

    public String e() {
        return this.f32815b;
    }

    public void c(String str) {
        this.f32815b = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("SecondResourceBean{mUuid='");
        stringBuffer.append(String.valueOf(this.f.toString()));
        stringBuffer.append("mDeviceName='");
        stringBuffer.append(this.f32816c);
        stringBuffer.append("mDeviceDescription='");
        stringBuffer.append(this.e);
        stringBuffer.append("mSecondIcon='");
        stringBuffer.append(this.f32814a);
        stringBuffer.append("mBluetoothNameList='");
        stringBuffer.append(String.valueOf(this.d.toString()));
        stringBuffer.append("mBluetoothMatch='");
        stringBuffer.append(this.f32815b);
        return stringBuffer.toString();
    }
}
