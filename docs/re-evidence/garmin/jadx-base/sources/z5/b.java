package z5;

import com.google.android.exoplayer2.C;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lz5/b;", "", "Ljava/util/Locale;", "platformLocale", "<init>", "(Ljava/util/Locale;)V", "", "languageTag", "(Ljava/lang/String;)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f202439b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f202440a;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (s.g(localeForLanguageTag.toLanguageTag(), C.LANGUAGE_UNDETERMINED)) {
            System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        this(localeForLanguageTag);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return s.g(this.f202440a.toLanguageTag(), ((b) obj).f202440a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f202440a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f202440a.toLanguageTag();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz5/b$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a() {
            return d.f202445a.a().f202443a.get(0);
        }

        private a() {
        }
    }

    public b(Locale locale) {
        this.f202440a = locale;
    }
}
