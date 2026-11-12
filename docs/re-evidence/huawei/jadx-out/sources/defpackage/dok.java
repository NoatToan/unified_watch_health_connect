package defpackage;

import com.huawei.health.device.kit.hwch.ch18.bean.WeightCmd;

/* JADX INFO: loaded from: classes7.dex */
public class dok<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32128b = 0;
    private byte[] e = null;
    private T d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeightCmd f32129c = null;

    public int a() {
        return ((Integer) dym.d(Integer.valueOf(this.f32128b))).intValue();
    }

    public void c(int i) {
        this.f32128b = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public byte[] c() {
        byte[] bArr = this.e;
        return (bArr == null || bArr.length == 0) ? new byte[0] : (byte[]) bArr.clone();
    }

    public void b(byte[] bArr) {
        this.e = bArr == null ? null : (byte[]) bArr.clone();
    }

    public T b() {
        return (T) dym.d(this.d);
    }

    public void c(T t) {
        this.d = (T) dym.d(t);
    }

    public WeightCmd d() {
        return this.f32129c;
    }

    public void b(WeightCmd weightCmd) {
        this.f32129c = weightCmd;
    }
}
