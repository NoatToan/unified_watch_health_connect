package defpackage;

import health.compact.a.LogUtil;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class lnr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40500c;
    private byte[] d;
    private boolean g;
    private int i;
    private String j;
    private boolean h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40498a = -1;
    private int e = 1;
    private int f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40499b = 0;

    public void e(String str) {
        if (str == null) {
            return;
        }
        this.j = (String) cpu.a(str);
    }

    public String g() {
        return (String) cpu.a(this.j);
    }

    public void c(int i) {
        this.f40500c = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public int a() {
        return ((Integer) cpu.a(Integer.valueOf(this.f40500c))).intValue();
    }

    public void c(byte[] bArr) {
        if (bArr != null) {
            this.d = (byte[]) cpu.a(Arrays.copyOf(bArr, bArr.length));
        } else {
            LogUtil.b("BTDeviceCommand", "dataContent is null");
        }
    }

    public byte[] d() {
        byte[] bArr = this.d;
        if (bArr != null) {
            return (byte[]) cpu.a(Arrays.copyOf(bArr, bArr.length));
        }
        return null;
    }

    public void d(int i) {
        this.i = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public int f() {
        return ((Integer) cpu.a(Integer.valueOf(this.i))).intValue();
    }

    public void c(boolean z) {
        this.g = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean j() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.g))).booleanValue();
    }

    public void b(int i) {
        this.f40498a = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public int e() {
        return ((Integer) cpu.a(Integer.valueOf(this.f40498a))).intValue();
    }

    public void d(boolean z) {
        this.h = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean i() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.h))).booleanValue();
    }

    public void a(int i) {
        this.e = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public int b() {
        return ((Integer) cpu.a(Integer.valueOf(this.e))).intValue();
    }

    public void g(int i) {
        this.f = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public int h() {
        return ((Integer) cpu.a(Integer.valueOf(this.f))).intValue();
    }

    public void e(int i) {
        this.f40499b = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public int c() {
        return ((Integer) cpu.a(Integer.valueOf(this.f40499b))).intValue();
    }

    public String toString() {
        return "BTDeviceCommand{mServiceID='" + cph.b(this.f) + "', mCommandID='" + cph.b(this.f40499b) + "', mDataLen='" + this.f40500c + "', mDataContent= " + cph.d(this.d) + '}';
    }
}
