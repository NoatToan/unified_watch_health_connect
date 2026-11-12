package kotlin;

import java.text.BreakIterator;
import java.util.Locale;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Li5/g;", "Li5/b;", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/util/Locale;)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f91186d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static g f91187e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BreakIterator f91188c;

    private g(Locale locale) {
        this.f91188c = BreakIterator.getWordInstance(locale);
    }

    @Override // kotlin.b
    public final int[] a(int i14) {
        if (c().length() > 0 && i14 < c().length()) {
            if (i14 < 0) {
                i14 = 0;
            }
            while (!f(i14) && (!f(i14) || (i14 != 0 && f(i14 - 1)))) {
                BreakIterator breakIterator = this.f91188c;
                if (breakIterator == null) {
                    s.m("impl");
                    throw null;
                }
                i14 = breakIterator.following(i14);
                if (i14 == -1) {
                }
            }
            BreakIterator breakIterator2 = this.f91188c;
            if (breakIterator2 == null) {
                s.m("impl");
                throw null;
            }
            int iFollowing = breakIterator2.following(i14);
            if (iFollowing != -1 && e(iFollowing)) {
                return b(i14, iFollowing);
            }
        }
        return null;
    }

    @Override // kotlin.b
    public final int[] d(int i14) {
        int length = c().length();
        if (length > 0 && i14 > 0) {
            if (i14 > length) {
                i14 = length;
            }
            while (i14 > 0 && !f(i14 - 1) && !e(i14)) {
                BreakIterator breakIterator = this.f91188c;
                if (breakIterator == null) {
                    s.m("impl");
                    throw null;
                }
                i14 = breakIterator.preceding(i14);
                if (i14 == -1) {
                }
            }
            BreakIterator breakIterator2 = this.f91188c;
            if (breakIterator2 == null) {
                s.m("impl");
                throw null;
            }
            int iPreceding = breakIterator2.preceding(i14);
            if (iPreceding != -1 && f(iPreceding) && (iPreceding == 0 || !f(iPreceding - 1))) {
                return b(iPreceding, i14);
            }
        }
        return null;
    }

    public final boolean e(int i14) {
        if (i14 <= 0 || !f(i14 - 1)) {
            return false;
        }
        return i14 == c().length() || !f(i14);
    }

    public final boolean f(int i14) {
        if (i14 < 0 || i14 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i14));
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li5/g$a;", "", "<init>", "()V", "Li5/g;", "instance", "Li5/g;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ g(Locale locale, j jVar) {
        this(locale);
    }
}
