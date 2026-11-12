package defpackage;

import com.huawei.health.ecologydevice.connectivity.ScanFilter;

/* JADX INFO: loaded from: classes7.dex */
public class ebb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f32652a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32653c;
    private String d;
    private ScanFilter e;

    public String c() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public ScanFilter e() {
        return this.e;
    }

    public void a(ScanFilter scanFilter) {
        this.e = scanFilter;
    }

    public String d() {
        return this.f32653c;
    }

    public void d(String str) {
        this.f32653c = str;
    }

    public int[] b() {
        int[] iArr = this.f32652a;
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public void a(int[] iArr) {
        if (iArr != null) {
            this.f32652a = (int[]) iArr.clone();
        }
    }
}
