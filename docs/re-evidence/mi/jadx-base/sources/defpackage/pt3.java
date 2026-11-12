package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class pt3 implements h6i<Character> {

    public static final class a extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f30730b = new a();

        public a() {
            super("CharMatcher.ascii()");
        }

        @Override // defpackage.pt3
        public boolean g(char c) {
            return c <= 127;
        }
    }

    public static abstract class b extends pt3 {
        @Override // defpackage.h6i
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.b(ch);
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f30731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final char f30732b;

        public c(char c, char c2) {
            c6i.d(c2 >= c);
            this.f30731a = c;
            this.f30732b = c2;
        }

        @Override // defpackage.pt3
        public boolean g(char c) {
            return this.f30731a <= c && c <= this.f30732b;
        }

        public String toString() {
            String strJ = pt3.j(this.f30731a);
            String strJ2 = pt3.j(this.f30732b);
            StringBuilder sb = new StringBuilder(String.valueOf(strJ).length() + 27 + String.valueOf(strJ2).length());
            sb.append("CharMatcher.inRange('");
            sb.append(strJ);
            sb.append("', '");
            sb.append(strJ2);
            sb.append("')");
            return sb.toString();
        }
    }

    public static final class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f30733a;

        public d(char c) {
            this.f30733a = c;
        }

        @Override // defpackage.pt3
        public boolean g(char c) {
            return c == this.f30733a;
        }

        public String toString() {
            String strJ = pt3.j(this.f30733a);
            StringBuilder sb = new StringBuilder(String.valueOf(strJ).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(strJ);
            sb.append("')");
            return sb.toString();
        }
    }

    public static abstract class e extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f30734a;

        public e(String str) {
            this.f30734a = (String) c6i.o(str);
        }

        public final String toString() {
            return this.f30734a;
        }
    }

    public static final class f extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f30735b = new f();

        public f() {
            super("CharMatcher.none()");
        }

        @Override // defpackage.pt3
        public int e(CharSequence charSequence, int i) {
            c6i.q(i, charSequence.length());
            return -1;
        }

        @Override // defpackage.pt3
        public boolean g(char c) {
            return false;
        }

        @Override // defpackage.pt3
        public boolean h(CharSequence charSequence) {
            return charSequence.length() == 0;
        }
    }

    public static pt3 c() {
        return a.f30730b;
    }

    public static pt3 d(char c2, char c3) {
        return new c(c2, c3);
    }

    public static pt3 f(char c2) {
        return new d(c2);
    }

    public static pt3 i() {
        return f.f30735b;
    }

    public static String j(char c2) {
        char[] cArr = {AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.UNICODE_ESC, 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public boolean b(Character ch) {
        return g(ch.charValue());
    }

    public int e(CharSequence charSequence, int i) {
        int length = charSequence.length();
        c6i.q(i, length);
        while (i < length) {
            if (g(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean g(char c2);

    public boolean h(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!g(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }
}
