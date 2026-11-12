package defpackage;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class vpd {
    public static final vpd h = new vpd(0);
    public static final vpd i = new vpd(-1);
    public static final vpd j = new vpd(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f37104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37105b;
    public boolean c;
    public boolean d;
    public dqd.g e;
    public dqd.g f;
    public dqd.h g;

    public vpd(int i2) {
        boolean z = (i2 & 1) == 0;
        this.f37104a = z;
        boolean z2 = (i2 & 4) == 0;
        this.c = z2;
        boolean z3 = (i2 & 2) == 0;
        this.f37105b = z3;
        this.d = (i2 & 16) > 0;
        dqd.g gVar = (i2 & 8) > 0 ? dqd.c : dqd.f15812a;
        if (z2) {
            this.f = dqd.f15813b;
        } else {
            this.f = gVar;
        }
        if (z) {
            this.e = dqd.f15813b;
        } else {
            this.e = gVar;
        }
        if (z3) {
            this.g = dqd.e;
        } else {
            this.g = dqd.d;
        }
    }

    public void a(Appendable appendable) throws IOException {
        appendable.append(',');
    }

    public void b(Appendable appendable) throws IOException {
    }

    public void c(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.BEGIN_LIST);
    }

    public void d(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.END_LIST);
    }

    public void e(Appendable appendable) throws IOException {
    }

    public void f(String str, Appendable appendable) {
        this.g.a(str, appendable);
    }

    public boolean g() {
        return this.d;
    }

    public boolean h(String str) {
        return this.e.a(str);
    }

    public boolean i(String str) {
        return this.f.a(str);
    }

    public void j(Appendable appendable) throws IOException {
    }

    public void k(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.COLON);
    }

    public void l(Appendable appendable) throws IOException {
    }

    public void m(Appendable appendable) throws IOException {
        appendable.append(',');
    }

    public void n(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.BEGIN_OBJ);
    }

    public void o(Appendable appendable) throws IOException {
        appendable.append(AbstractJsonLexerKt.END_OBJ);
    }

    public void p(Appendable appendable, String str) throws IOException {
        if (!i(str)) {
            appendable.append(str);
            return;
        }
        appendable.append('\"');
        ypd.c(str, appendable, this);
        appendable.append('\"');
    }
}
