package s1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ls1/i;", "T", "Ls1/r;", "V", "", "Ls1/m;", "endState", "Ls1/h;", "endReason", "<init>", "(Ls1/m;Ls1/h;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i<T, V extends r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m<T, V> f155593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f155594b;

    public i(m<T, V> mVar, h hVar) {
        this.f155593a = mVar;
        this.f155594b = hVar;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.f155594b + ", endState=" + this.f155593a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
