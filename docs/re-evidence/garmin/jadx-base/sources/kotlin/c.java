package kotlin;

import java.text.BreakIterator;
import java.util.Locale;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Li5/c;", "Li5/b;", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/util/Locale;)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f91117d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f91118e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BreakIterator f91119c;

    private c(Locale locale) {
        this.f91119c = BreakIterator.getCharacterInstance(locale);
    }

    @Override // kotlin.b
    public final int[] a(int i14) {
        int length = c().length();
        if (length <= 0 || i14 >= length) {
            return null;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        do {
            BreakIterator breakIterator = this.f91119c;
            if (breakIterator == null) {
                s.m("impl");
                throw null;
            }
            boolean zIsBoundary = breakIterator.isBoundary(i14);
            BreakIterator breakIterator2 = this.f91119c;
            if (zIsBoundary) {
                if (breakIterator2 == null) {
                    s.m("impl");
                    throw null;
                }
                int iFollowing = breakIterator2.following(i14);
                if (iFollowing == -1) {
                    return null;
                }
                return b(i14, iFollowing);
            }
            if (breakIterator2 == null) {
                s.m("impl");
                throw null;
            }
            i14 = breakIterator2.following(i14);
        } while (i14 != -1);
        return null;
    }

    @Override // kotlin.b
    public final int[] d(int i14) {
        int length = c().length();
        if (length <= 0 || i14 <= 0) {
            return null;
        }
        if (i14 > length) {
            i14 = length;
        }
        do {
            BreakIterator breakIterator = this.f91119c;
            if (breakIterator == null) {
                s.m("impl");
                throw null;
            }
            boolean zIsBoundary = breakIterator.isBoundary(i14);
            BreakIterator breakIterator2 = this.f91119c;
            if (zIsBoundary) {
                if (breakIterator2 == null) {
                    s.m("impl");
                    throw null;
                }
                int iPreceding = breakIterator2.preceding(i14);
                if (iPreceding == -1) {
                    return null;
                }
                return b(iPreceding, i14);
            }
            if (breakIterator2 == null) {
                s.m("impl");
                throw null;
            }
            i14 = breakIterator2.preceding(i14);
        } while (i14 != -1);
        return null;
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li5/c$a;", "", "<init>", "()V", "Li5/c;", "instance", "Li5/c;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(Locale locale, j jVar) {
        this(locale);
    }
}
