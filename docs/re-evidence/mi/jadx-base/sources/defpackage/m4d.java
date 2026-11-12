package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class m4d {
    public static m4d d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<l4d.a> f25739b;
    public final l4d.a c = new ov5();

    public m4d() {
        f();
    }

    public static l4d b(InputStream inputStream) throws IOException {
        return d().a(inputStream);
    }

    public static l4d c(InputStream inputStream) {
        try {
            return b(inputStream);
        } catch (IOException e) {
            throw wdp.a(e);
        }
    }

    public static synchronized m4d d() {
        try {
            if (d == null) {
                d = new m4d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public static int e(int i, InputStream inputStream, byte[] bArr) throws IOException {
        b6i.g(inputStream);
        b6i.g(bArr);
        b6i.b(bArr.length >= i);
        if (!inputStream.markSupported()) {
            return t73.a(inputStream, bArr, 0, i);
        }
        try {
            inputStream.mark(i);
            return t73.a(inputStream, bArr, 0, i);
        } finally {
            inputStream.reset();
        }
    }

    public l4d a(InputStream inputStream) throws IOException {
        b6i.g(inputStream);
        int i = this.f25738a;
        byte[] bArr = new byte[i];
        int iE = e(i, inputStream, bArr);
        l4d l4dVarA = this.c.a(bArr, iE);
        if (l4dVarA != null && l4dVarA != l4d.c) {
            return l4dVarA;
        }
        List<l4d.a> list = this.f25739b;
        if (list != null) {
            Iterator<l4d.a> it = list.iterator();
            while (it.hasNext()) {
                l4d l4dVarA2 = it.next().a(bArr, iE);
                if (l4dVarA2 != null && l4dVarA2 != l4d.c) {
                    return l4dVarA2;
                }
            }
        }
        return l4d.c;
    }

    public final void f() {
        this.f25738a = this.c.b();
        List<l4d.a> list = this.f25739b;
        if (list != null) {
            Iterator<l4d.a> it = list.iterator();
            while (it.hasNext()) {
                this.f25738a = Math.max(this.f25738a, it.next().b());
            }
        }
    }
}
