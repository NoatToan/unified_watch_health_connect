package uc;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luc/d;", "", "T", "Lwc/g;", "Luc/c;", "scene", "<init>", "(Luc/c;)V", "navigation3-ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d<T> extends wc.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<T> f169923a;

    public d(c<T> cVar) {
        this.f169923a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return s.g(this.f169923a, ((d) obj).f169923a);
    }

    public final int hashCode() {
        return this.f169923a.hashCode();
    }

    public final String toString() {
        return "SceneInfo(scene=" + this.f169923a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
