package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class drf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f32235b;
    private byte[] e;
    private float g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32234a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32236c = 0;
    private int h = 0;
    private int d = -1;

    public int d() {
        return this.f32234a;
    }

    public void d(int i) {
        this.f32234a = i;
    }

    public int a() {
        return this.f32236c;
    }

    public void c(int i) {
        this.f32236c = i;
    }

    public int e() {
        return this.h;
    }

    public void e(int i) {
        this.h = i;
    }

    public byte[] b() {
        byte[] bArr = this.f32235b;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public void a(byte[] bArr) {
        if (bArr != null) {
            this.f32235b = (byte[]) bArr.clone();
        }
    }

    public byte[] g() {
        byte[] bArr = this.e;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public void c(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        this.e = (byte[]) bArr.clone();
    }

    public float i() {
        return this.g;
    }

    public void d(float f) {
        this.g = f;
    }

    public int c() {
        return this.d;
    }

    public void b(int i) {
        this.d = i;
    }

    public String toString() {
        return "ConstructionsUserBean{height=" + this.f32234a + ", age=" + this.f32236c + ", sex=" + this.h + ", huids=" + Arrays.toString(this.f32235b) + ", uids=" + Arrays.toString(this.e) + ", weight=" + this.g + ", mouths=" + this.d + '}';
    }
}
