package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ts5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f34983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34984b;
    public final String c;
    public final List<byte[]> d;
    public final String e;
    public Integer f;
    public Integer g;
    public Object h;
    public final int i;
    public final int j;

    public ts5(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public List<byte[]> a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public int c() {
        return this.f34984b;
    }

    public Object d() {
        return this.h;
    }

    public byte[] e() {
        return this.f34983a;
    }

    public int f() {
        return this.i;
    }

    public int g() {
        return this.j;
    }

    public String h() {
        return this.c;
    }

    public boolean i() {
        return this.i >= 0 && this.j >= 0;
    }

    public void j(Integer num) {
        this.g = num;
    }

    public void k(Integer num) {
        this.f = num;
    }

    public void l(int i) {
        this.f34984b = i;
    }

    public void m(Object obj) {
        this.h = obj;
    }

    public ts5(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f34983a = bArr;
        this.f34984b = bArr == null ? 0 : bArr.length * 8;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.i = i2;
        this.j = i;
    }
}
