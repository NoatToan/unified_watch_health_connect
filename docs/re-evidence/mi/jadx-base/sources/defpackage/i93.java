package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class i93 implements Comparable<i93> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20898b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public i93(String str, long j, long j2, long j3, File file) {
        this.f20897a = str;
        this.f20898b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i93 i93Var) {
        if (!this.f20897a.equals(i93Var.f20897a)) {
            return this.f20897a.compareTo(i93Var.f20897a);
        }
        long j = this.f20898b - i93Var.f20898b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.d;
    }

    public boolean c() {
        return this.c == -1;
    }

    public String toString() {
        long j = this.f20898b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(44);
        sb.append("[");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
