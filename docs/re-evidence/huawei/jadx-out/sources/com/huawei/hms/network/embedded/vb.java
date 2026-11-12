package com.huawei.hms.network.embedded;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class vb {
    public static final int h = 8192;
    public static final int i = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f15546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15548c;
    public boolean d;
    public boolean e;
    public vb f;
    public vb g;

    public final vb d() {
        return new vb((byte[]) this.f15546a.clone(), this.f15547b, this.f15548c, false, true);
    }

    public final vb c() {
        this.d = true;
        return new vb(this.f15546a, this.f15547b, this.f15548c, true, false);
    }

    @Nullable
    public final vb b() {
        vb vbVar = this.f;
        vb vbVar2 = vbVar != this ? vbVar : null;
        vb vbVar3 = this.g;
        vbVar3.f = vbVar;
        this.f.g = vbVar3;
        this.f = null;
        this.g = null;
        return vbVar2;
    }

    public final void a(vb vbVar, int i2) {
        if (!vbVar.e) {
            throw new IllegalArgumentException();
        }
        int i3 = vbVar.f15548c;
        int i4 = i3 + i2;
        if (i4 > 8192) {
            if (vbVar.d) {
                throw new IllegalArgumentException();
            }
            int i5 = vbVar.f15547b;
            if (i4 - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = vbVar.f15546a;
            System.arraycopy(bArr, i5, bArr, 0, i3 - i5);
            vbVar.f15548c -= vbVar.f15547b;
            vbVar.f15547b = 0;
        }
        System.arraycopy(this.f15546a, this.f15547b, vbVar.f15546a, vbVar.f15548c, i2);
        vbVar.f15548c += i2;
        this.f15547b += i2;
    }

    public final void a() {
        vb vbVar = this.g;
        if (vbVar == this) {
            throw new IllegalStateException();
        }
        if (vbVar.e) {
            int i2 = this.f15548c - this.f15547b;
            if (i2 > (8192 - vbVar.f15548c) + (vbVar.d ? 0 : vbVar.f15547b)) {
                return;
            }
            a(vbVar, i2);
            b();
            wb.a(this);
        }
    }

    public final vb a(vb vbVar) {
        vbVar.g = this;
        vbVar.f = this.f;
        this.f.g = vbVar;
        this.f = vbVar;
        return vbVar;
    }

    public final vb a(int i2) {
        vb vbVarA;
        if (i2 <= 0 || i2 > this.f15548c - this.f15547b) {
            throw new IllegalArgumentException();
        }
        if (i2 >= 1024) {
            vbVarA = c();
        } else {
            vbVarA = wb.a();
            System.arraycopy(this.f15546a, this.f15547b, vbVarA.f15546a, 0, i2);
        }
        vbVarA.f15548c = vbVarA.f15547b + i2;
        this.f15547b += i2;
        this.g.a(vbVarA);
        return vbVarA;
    }

    public vb(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        this.f15546a = bArr;
        this.f15547b = i2;
        this.f15548c = i3;
        this.d = z;
        this.e = z2;
    }

    public vb() {
        this.f15546a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
