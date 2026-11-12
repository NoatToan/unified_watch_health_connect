package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class n7t extends j7t {
    public static n7t c = new n7t();

    public n7t() {
        super(5120);
    }

    public static String b(String str) {
        return str == null ? "" : str;
    }

    public static n7t d() {
        return c;
    }

    public final byte[] c(byte[] bArr, byte[] bArr2, List<? extends y7t> list) {
        if (list == null) {
            return null;
        }
        try {
            int size = list.size();
            if (size <= 0 || bArr == null) {
                return null;
            }
            a();
            int iC = b8t.c(this.f22511a, bArr);
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                y7t y7tVar = list.get(i);
                iArr[i] = g8t.b(this.f22511a, (byte) y7tVar.a(), g8t.c(this.f22511a, y7tVar.b()));
            }
            this.f22511a.w(b8t.b(this.f22511a, iC, bArr2 != null ? b8t.f(this.f22511a, bArr2) : 0, b8t.d(this.f22511a, iArr)));
            return this.f22511a.z();
        } catch (Throwable th) {
            fbt.a(th);
            return null;
        }
    }

    public final byte[] e() {
        super.a();
        try {
            this.f22511a.w(ebt.b(this.f22511a, dbt.a(), this.f22511a.b(dbt.m()), this.f22511a.b(dbt.g()), (byte) dbt.A(), this.f22511a.b(dbt.s()), this.f22511a.b(dbt.q()), this.f22511a.b(b(dbt.o())), this.f22511a.b(b(dbt.u())), cbt.a(dbt.C()), this.f22511a.b(dbt.y()), this.f22511a.b(dbt.w()), this.f22511a.b(dbt.i()), this.f22511a.b(dbt.k())));
            return this.f22511a.z();
        } catch (Exception e) {
            fbt.a(e);
            return null;
        }
    }
}
