package p3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lp3/g3;", "T", "", "composer", "Lp3/m;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f135101a;

    private /* synthetic */ g3(m mVar) {
        this.f135101a = mVar;
    }

    public static final /* synthetic */ g3 a(m mVar) {
        return new g3(mVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g3) {
            return p005kotlin.jvm.internal.s.g(this.f135101a, ((g3) obj).f135101a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f135101a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f135101a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
