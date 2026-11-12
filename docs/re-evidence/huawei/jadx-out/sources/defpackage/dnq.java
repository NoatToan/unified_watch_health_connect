package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class dnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f32084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32085c;
    private int d;
    private int e;

    public int c() {
        return this.e;
    }

    public void d(int i) {
        this.e = i;
    }

    public int b() {
        return this.d;
    }

    public void b(int i) {
        this.d = i;
    }

    public int a() {
        return this.f32085c;
    }

    public void e(int i) {
        this.f32085c = i;
    }

    public byte[] d() {
        byte[] bArr = this.f32084b;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public void d(byte[] bArr) {
        if (bArr != null) {
            this.f32084b = (byte[]) bArr.clone();
        }
    }

    public int e() {
        return this.f32083a;
    }

    public void c(int i) {
        this.f32083a = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("WspFileCommand{mServiceId=");
        stringBuffer.append(eeq.d(this.e));
        stringBuffer.append(", mCommandId=");
        stringBuffer.append(eeq.d(this.d));
        stringBuffer.append(", mDataLength=");
        stringBuffer.append(this.f32085c);
        stringBuffer.append(", mDataContents=");
        stringBuffer.append(eeq.e(this.f32084b));
        stringBuffer.append(", mErrorCode=");
        stringBuffer.append(this.f32083a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
