package z53;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p005kotlin.Metadata;
import u53.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0010\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\t8\u0006¨\u0006\u000b"}, d2 = {"Lz53/i;", "Lu53/u;", "", TtmlNode.ATTR_ID, "prev", "", "pointers", "<init>", "(JLz53/i;I)V", "", "acquirers", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends u<i> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f202574e;

    public i(long j8, i iVar, int i14) {
        super(j8, iVar, i14);
        this.f202574e = new AtomicReferenceArray(h.f202573f);
    }

    @Override // u53.u
    public final int g() {
        return h.f202573f;
    }

    @Override // u53.u
    public final void h(t13.g gVar, int i14) {
        this.f202574e.set(i14, h.f202572e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f168771c + ", hashCode=" + hashCode() + ']';
    }
}
