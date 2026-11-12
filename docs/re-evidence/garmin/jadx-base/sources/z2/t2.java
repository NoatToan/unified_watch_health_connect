package z2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz2/t2;", "", "Lo4/d0;", "handleColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "<init>", "(JJLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f201802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f201803b;

    private t2(long j8, long j14) {
        this.f201802a = j8;
        this.f201803b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return o4.d0.d(this.f201802a, t2Var.f201802a) && o4.d0.d(this.f201803b, t2Var.f201803b);
    }

    public final int hashCode() {
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        return Long.hashCode(this.f201803b) + (Long.hashCode(this.f201802a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SelectionColors(selectionHandleColor=");
        r1.q2.m(this.f201802a, ", selectionBackgroundColor=", sb3);
        sb3.append((Object) o4.d0.j(this.f201803b));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public /* synthetic */ t2(long j8, long j14, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14);
    }
}
