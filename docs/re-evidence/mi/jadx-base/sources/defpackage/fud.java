package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18248b;

    public fud() {
    }

    public fud(fud fudVar) {
        this.f18247a = fudVar.f18247a;
        this.f18248b = fudVar.f18248b;
    }

    public final int a() {
        int i = this.f18248b;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public abstract String b();

    public abstract Object c();

    public final int d() {
        return this.f18248b + 1;
    }

    public abstract fud e();

    public final boolean f() {
        return this.f18247a == 1;
    }

    public final boolean g() {
        return this.f18247a == 2;
    }

    public final boolean h() {
        return this.f18247a == 0;
    }

    public abstract void i(Object obj);

    public String j() {
        int i = this.f18247a;
        if (i == 0) {
            return "root";
        }
        if (i != 1) {
            return i != 2 ? "?" : "Object";
        }
        return "Array";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.f18247a;
        if (i == 0) {
            sb.append("/");
        } else if (i != 1) {
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            String strB = b();
            if (strB != null) {
                sb.append('\"');
                xt3.a(sb, strB);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
        } else {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(a());
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }

    public fud(int i, int i2) {
        this.f18247a = i;
        this.f18248b = i2;
    }
}
