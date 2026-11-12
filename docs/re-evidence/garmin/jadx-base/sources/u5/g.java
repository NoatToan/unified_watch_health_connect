package u5;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i3.e5;
import java.text.BreakIterator;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import t5.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lu5/g;", "", "", "charSequence", "", TtmlNode.START, TtmlNode.END, "Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f168635e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f168636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f168637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f168638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BreakIterator f168639d;

    public g(CharSequence charSequence, int i14, int i15, Locale locale) {
        this.f168636a = charSequence;
        if (!(i14 >= 0 && i14 <= charSequence.length())) {
            y5.a.a("input start index is outside the CharSequence");
        }
        if (!(i15 >= 0 && i15 <= charSequence.length())) {
            y5.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f168639d = wordInstance;
        this.f168637b = Math.max(0, i14 - 50);
        this.f168638c = Math.min(charSequence.length(), i15 + 50);
        wordInstance.setText(new k(charSequence, i14, i15));
    }

    public final void a(int i14) {
        boolean z14 = false;
        int i15 = this.f168637b;
        int i16 = this.f168638c;
        if (i14 <= i16 && i15 <= i14) {
            z14 = true;
        }
        if (z14) {
            return;
        }
        StringBuilder sbJ = e5.j(i14, i15, "Invalid offset: ", ". Valid range is [", " , ");
        sbJ.append(i16);
        sbJ.append(']');
        y5.a.a(sbJ.toString());
    }

    public final boolean b(int i14) {
        int i15 = this.f168637b + 1;
        if (i14 > this.f168638c || i15 > i14) {
            return false;
        }
        CharSequence charSequence = this.f168636a;
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i14))) {
            int i16 = i14 - 1;
            if (!Character.isSurrogate(charSequence.charAt(i16))) {
                if (!androidx.emoji2.text.d.e()) {
                    return false;
                }
                androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
                if (dVarA.c() != 1 || dVarA.b(i16, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(int i14) {
        int i15 = this.f168637b + 1;
        if (i14 > this.f168638c || i15 > i14) {
            return false;
        }
        int iCodePointBefore = Character.codePointBefore(this.f168636a, i14);
        f168635e.getClass();
        return a.a(iCodePointBefore);
    }

    public final boolean d(int i14) {
        a(i14);
        if (!this.f168639d.isBoundary(i14)) {
            return false;
        }
        if (f(i14) && f(i14 - 1) && f(i14 + 1)) {
            return false;
        }
        return i14 <= 0 || i14 >= this.f168636a.length() - 1 || !(e(i14) || e(i14 + 1));
    }

    public final boolean e(int i14) {
        int i15 = i14 - 1;
        CharSequence charSequence = this.f168636a;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i15));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (s.g(unicodeBlockOf, unicodeBlock) && s.g(Character.UnicodeBlock.of(charSequence.charAt(i14)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return s.g(Character.UnicodeBlock.of(charSequence.charAt(i14)), unicodeBlock) && s.g(Character.UnicodeBlock.of(charSequence.charAt(i15)), Character.UnicodeBlock.KATAKANA);
    }

    public final boolean f(int i14) {
        if (i14 >= this.f168638c || this.f168637b > i14) {
            return false;
        }
        CharSequence charSequence = this.f168636a;
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i14)) && !Character.isSurrogate(charSequence.charAt(i14))) {
            if (!androidx.emoji2.text.d.e()) {
                return false;
            }
            androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
            if (dVarA.c() != 1 || dVarA.b(i14, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(int i14) {
        if (i14 >= this.f168638c || this.f168637b > i14) {
            return false;
        }
        int iCodePointAt = Character.codePointAt(this.f168636a, i14);
        f168635e.getClass();
        return a.a(iCodePointAt);
    }

    public final int h(int i14) {
        a(i14);
        int iFollowing = this.f168639d.following(i14);
        return (f(iFollowing + (-1)) && f(iFollowing) && !e(iFollowing)) ? h(iFollowing) : iFollowing;
    }

    public final int i(int i14) {
        a(i14);
        int iPreceding = this.f168639d.preceding(i14);
        return (f(iPreceding) && b(iPreceding) && !e(iPreceding)) ? i(iPreceding) : iPreceding;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu5/g$a;", "", "<init>", "()V", "", "WINDOW_WIDTH", "I", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static boolean a(int i14) {
            int type = Character.getType(i14);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private a() {
        }
    }
}
