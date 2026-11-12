package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;
import java.util.BitSet;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
public abstract class CharMatcher implements Predicate<Character> {
    private static final int a = 65536;

    public class a extends x {
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CharMatcher charMatcher, String str) {
            super(charMatcher);
            this.c = str;
        }

        @Override // com.google.common.base.CharMatcher.w, com.google.common.base.CharMatcher
        public String toString() {
            return this.c;
        }
    }

    public static class a0 extends CharMatcher {
        private final String b;
        private final char[] c;
        private final char[] d;

        public a0(String str, char[] cArr, char[] cArr2) {
            this.b = str;
            this.c = cArr;
            this.d = cArr2;
            Preconditions.checkArgument(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                Preconditions.checkArgument(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    Preconditions.checkArgument(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            int iBinarySearch = Arrays.binarySearch(this.c, c);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i = (~iBinarySearch) - 1;
            return i >= 0 && c <= this.d[i];
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return this.b;
        }
    }

    public static final class b extends CharMatcher {
        public final CharMatcher b;
        public final CharMatcher c;

        public b(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.b = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.c = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void g(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.b.g(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.c.g(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.b.matches(c) && this.c.matches(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.and(" + this.b + ", " + this.c + ")";
        }
    }

    public static final class b0 extends a0 {
        public static final b0 e = new b0();

        private b0() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    public static final class c extends v {
        public static final c c = new c();

        private c() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c2) {
            return charSequence.length() == 0 ? "" : String.valueOf(c2);
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c2) {
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher.i, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.none();
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c2) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c2);
            return new String(cArr);
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }
    }

    @VisibleForTesting
    public static final class c0 extends v {
        public static final String c = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000";
        public static final int d = 1682554634;
        public static final int e = Integer.numberOfLeadingZeros(31);
        public static final c0 f = new c0();

        public c0() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void g(BitSet bitSet) {
            for (int i = 0; i < 32; i++) {
                bitSet.set(c.charAt(i));
            }
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c2) {
            return c.charAt((d * c2) >>> e) == c2;
        }
    }

    public static final class d extends CharMatcher {
        private final char[] b;

        public d(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.b = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void g(BitSet bitSet) {
            for (char c : this.b) {
                bitSet.set(c);
            }
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Arrays.binarySearch(this.b, c) >= 0;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.b) {
                sb.append(CharMatcher.h(c));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    public static final class e extends v {
        public static final e c = new e();

        public e() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c2) {
            return c2 <= 127;
        }
    }

    @GwtIncompatible
    public static final class f extends v {
        private final BitSet c;

        public /* synthetic */ f(BitSet bitSet, String str, a aVar) {
            this(bitSet, str);
        }

        @Override // com.google.common.base.CharMatcher
        public void g(BitSet bitSet) {
            bitSet.or(this.c);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.c.get(c);
        }

        private f(BitSet bitSet, String str) {
            super(str);
            this.c = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }
    }

    public static final class g extends CharMatcher {
        public static final CharMatcher b = new g();

        private g() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (c != ' ' && c != 133 && c != 5760) {
                if (c == 8199) {
                    return false;
                }
                if (c != 8287 && c != 12288 && c != 8232 && c != 8233) {
                    switch (c) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            return c >= 8192 && c <= 8202;
                    }
                }
            }
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    public static final class h extends a0 {
        private static final String e = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";
        public static final h f = new h();

        private h() {
            super("CharMatcher.digit()", j(), i());
        }

        private static char[] i() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) (e.charAt(i) + '\t');
            }
            return cArr;
        }

        private static char[] j() {
            return e.toCharArray();
        }
    }

    public static abstract class i extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return new x(this);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher precomputed() {
            return this;
        }
    }

    public static final class j extends CharMatcher {
        private final Predicate<? super Character> b;

        public j(Predicate<? super Character> predicate) {
            this.b = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.b.apply(Character.valueOf(c));
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.forPredicate(" + this.b + ")";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public boolean apply(Character ch) {
            return this.b.apply(Preconditions.checkNotNull(ch));
        }
    }

    public static final class k extends i {
        private final char b;
        private final char c;

        public k(char c, char c2) {
            Preconditions.checkArgument(c2 >= c);
            this.b = c;
            this.c = c2;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void g(BitSet bitSet) {
            bitSet.set(this.b, this.c + 1);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.b <= c && c <= this.c;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.inRange('" + CharMatcher.h(this.b) + "', '" + CharMatcher.h(this.c) + "')";
        }
    }

    public static final class l extends a0 {
        private static final String e = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9";
        private static final String f = "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb";
        public static final l g = new l();

        private l() {
            super("CharMatcher.invisible()", e.toCharArray(), f.toCharArray());
        }
    }

    public static final class m extends i {
        private final char b;

        public m(char c) {
            this.b = c;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.b) ? this : CharMatcher.none();
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void g(BitSet bitSet) {
            bitSet.set(this.b);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return c == this.b;
        }

        @Override // com.google.common.base.CharMatcher.i, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.isNot(this.b);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.b) ? charMatcher : super.or(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.b, c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.is('" + CharMatcher.h(this.b) + "')";
        }
    }

    public static final class n extends i {
        private final char b;
        private final char c;

        public n(char c, char c2) {
            this.b = c;
            this.c = c2;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void g(BitSet bitSet) {
            bitSet.set(this.b);
            bitSet.set(this.c);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return c == this.b || c == this.c;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.h(this.b) + CharMatcher.h(this.c) + "\")";
        }
    }

    public static final class o extends i {
        private final char b;

        public o(char c) {
            this.b = c;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.b) ? super.and(charMatcher) : charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void g(BitSet bitSet) {
            bitSet.set(0, this.b);
            bitSet.set(this.b + 1, 65536);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return c != this.b;
        }

        @Override // com.google.common.base.CharMatcher.i, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.is(this.b);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.b) ? CharMatcher.any() : this;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.isNot('" + CharMatcher.h(this.b) + "')";
        }
    }

    public static final class p extends CharMatcher {
        public static final p b = new p();

        private p() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isDigit(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    public static final class q extends v {
        public static final q c = new q();

        private q() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c2) {
            return c2 <= 31 || (c2 >= 127 && c2 <= 159);
        }
    }

    public static final class r extends CharMatcher {
        public static final r b = new r();

        private r() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLetter(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    public static final class s extends CharMatcher {
        public static final s b = new s();

        private s() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLetterOrDigit(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    public static final class t extends CharMatcher {
        public static final t b = new t();

        private t() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLowerCase(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    public static final class u extends CharMatcher {
        public static final u b = new u();

        private u() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isUpperCase(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    public static abstract class v extends i {
        private final String b;

        public v(String str) {
            this.b = (String) Preconditions.checkNotNull(str);
        }

        @Override // com.google.common.base.CharMatcher
        public final String toString() {
            return this.b;
        }
    }

    public static class w extends CharMatcher {
        public final CharMatcher b;

        public w(CharMatcher charMatcher) {
            this.b = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.b.countIn(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void g(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.b.g(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return !this.b.matches(c);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.b.matchesNoneOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.b.matchesAllOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return this.b;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return this.b + ".negate()";
        }
    }

    public static class x extends w {
        public x(CharMatcher charMatcher) {
            super(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher precomputed() {
            return this;
        }
    }

    public static final class y extends v {
        public static final y c = new y();

        private y() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c2) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c2) {
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher.i, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.any();
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c2) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i) {
            Preconditions.checkPositionIndex(i, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }
    }

    public static final class z extends CharMatcher {
        public final CharMatcher b;
        public final CharMatcher c;

        public z(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.b = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.c = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void g(BitSet bitSet) {
            this.b.g(bitSet);
            this.c.g(bitSet);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.b.matches(c) || this.c.matches(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.or(" + this.b + ", " + this.c + ")";
        }
    }

    public static CharMatcher any() {
        return c.c;
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return none();
        }
        if (length != 1) {
            return length != 2 ? new d(charSequence) : c(charSequence.charAt(0), charSequence.charAt(1));
        }
        return is(charSequence.charAt(0));
    }

    public static CharMatcher ascii() {
        return e.c;
    }

    private String b(CharSequence charSequence, int i2, int i3, char c2, StringBuilder sb, boolean z2) {
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            if (!matches(cCharAt)) {
                sb.append(cCharAt);
                z2 = false;
            } else if (!z2) {
                sb.append(c2);
                z2 = true;
            }
            i2++;
        }
        return sb.toString();
    }

    public static CharMatcher breakingWhitespace() {
        return g.b;
    }

    private static n c(char c2, char c3) {
        return new n(c2, c3);
    }

    @GwtIncompatible
    private static boolean d(int i2, int i3) {
        return i2 <= 1023 && i3 > (i2 * 4) * 16;
    }

    @Deprecated
    public static CharMatcher digit() {
        return h.f;
    }

    @GwtIncompatible
    private static CharMatcher f(int i2, BitSet bitSet, String str) {
        if (i2 == 0) {
            return none();
        }
        if (i2 == 1) {
            return is((char) bitSet.nextSetBit(0));
        }
        if (i2 != 2) {
            return d(i2, bitSet.length()) ? com.google.common.base.l.k(bitSet, str) : new f(bitSet, str, null);
        }
        char cNextSetBit = (char) bitSet.nextSetBit(0);
        return c(cNextSetBit, (char) bitSet.nextSetBit(cNextSetBit + 1));
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        return predicate instanceof CharMatcher ? (CharMatcher) predicate : new j(predicate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h(char c2) {
        char[] cArr = {'\\', JsonLexerKt.UNICODE_ESC, 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static CharMatcher inRange(char c2, char c3) {
        return new k(c2, c3);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return l.g;
    }

    public static CharMatcher is(char c2) {
        return new m(c2);
    }

    public static CharMatcher isNot(char c2) {
        return new o(c2);
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return p.b;
    }

    public static CharMatcher javaIsoControl() {
        return q.c;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return r.b;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return s.b;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return t.b;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return u.b;
    }

    public static CharMatcher none() {
        return y.c;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return b0.e;
    }

    public static CharMatcher whitespace() {
        return c0.f;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new b(this, charMatcher);
    }

    public String collapseFrom(CharSequence charSequence, char c2) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (matches(cCharAt)) {
                if (cCharAt != c2 || (i2 != length - 1 && matches(charSequence.charAt(i2 + 1)))) {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i2);
                    sb.append(c2);
                    return b(charSequence, i2 + 1, length, c2, sb, true);
                }
                i2++;
            }
            i2++;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (matches(charSequence.charAt(i3))) {
                i2++;
            }
        }
        return i2;
    }

    @GwtIncompatible
    public CharMatcher e() {
        String strSubstring;
        BitSet bitSet = new BitSet();
        g(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality * 2 <= 65536) {
            return f(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i2 = 65536 - iCardinality;
        String string = toString();
        if (string.endsWith(".negate()")) {
            strSubstring = string.substring(0, string.length() - 9);
        } else {
            strSubstring = string + ".negate()";
        }
        return new a(f(i2, bitSet, strSubstring), string);
    }

    @GwtIncompatible
    public void g(BitSet bitSet) {
        for (int i2 = 65535; i2 >= 0; i2--) {
            if (matches((char) i2)) {
                bitSet.set(i2);
            }
        }
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c2);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public CharMatcher negate() {
        return new w(this);
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return new z(this, charMatcher);
    }

    public CharMatcher precomputed() {
        return com.google.common.base.j.i(this);
    }

    public String removeFrom(CharSequence charSequence) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i2 = 1;
        while (true) {
            iIndexIn++;
            while (iIndexIn != charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    i2++;
                } else {
                    charArray[iIndexIn - i2] = charArray[iIndexIn];
                    iIndexIn++;
                }
            }
            return new String(charArray, 0, iIndexIn - i2);
        }
    }

    public String replaceFrom(CharSequence charSequence, char c2) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iIndexIn] = c2;
        while (true) {
            iIndexIn++;
            if (iIndexIn >= charArray.length) {
                return new String(charArray);
            }
            if (matches(charArray[iIndexIn])) {
                charArray[iIndexIn] = c2;
            }
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c2) {
        int length = charSequence.length();
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < length && matches(charSequence.charAt(i3))) {
            i3++;
        }
        int i4 = i2;
        while (i4 > i3 && matches(charSequence.charAt(i4))) {
            i4--;
        }
        if (i3 == 0 && i4 == i2) {
            return collapseFrom(charSequence, c2);
        }
        int i5 = i4 + 1;
        return b(charSequence, i3, i5, c2, new StringBuilder(i5 - i3), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && matches(charSequence.charAt(i2))) {
            i2++;
        }
        int i3 = length - 1;
        while (i3 > i2 && matches(charSequence.charAt(i3))) {
            i3--;
        }
        return charSequence.subSequence(i2, i3 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!matches(charSequence.charAt(i2))) {
                return charSequence.subSequence(i2, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(Character ch) {
        return matches(ch.charValue());
    }

    public int indexIn(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i2, length);
        while (i2 < length) {
            if (matches(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i2 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append((CharSequence) string, i2, iIndexIn);
            sb.append(charSequence2);
            i2 = iIndexIn + 1;
            iIndexIn = indexIn(string, i2);
        } while (iIndexIn != -1);
        sb.append((CharSequence) string, i2, length2);
        return sb.toString();
    }
}
