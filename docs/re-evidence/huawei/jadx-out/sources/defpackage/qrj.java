package defpackage;

import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class qrj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46699c;
    private int d;
    private int e;
    private int i;
    private int j;

    public void f(int i) {
        this.j = i;
    }

    public int d(int i) {
        return i / 3600;
    }

    public int c(int i) {
        return (i / 60) % 60;
    }

    public int b(int i) {
        return i % 60;
    }

    public int e(int i) {
        return Math.max(Math.min(i, this.e), this.i);
    }

    public int a(int i) {
        int iC = c(this.j);
        return i == 1 ? iC - this.d : iC + 5;
    }

    public int c() {
        int iD = d(this.j);
        if (iD == this.f46697a) {
            return 1;
        }
        return iD == this.f46698b ? 3 : 2;
    }

    public int a() {
        int i = this.j;
        int i2 = this.i;
        int i3 = (i - i2) / 60;
        int i4 = (this.e - i2) / 60;
        if (i3 == 0) {
            return 1;
        }
        return i3 == i4 ? 3 : 2;
    }

    public int j(int i) {
        int iB = b(this.j);
        return i == 1 ? iB - this.f46699c : iB + 5;
    }

    public int d() {
        return d(this.j) - this.f46697a;
    }

    public String b(String[] strArr, int i) {
        if (strArr == null) {
            LogUtil.e("TimeDialogUtils", "the valid value array is null");
            return null;
        }
        if (i >= 0 && i < strArr.length) {
            return strArr[i];
        }
        return "";
    }
}
