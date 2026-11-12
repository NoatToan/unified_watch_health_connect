package t4;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import n4.g;
import o13.z;
import o4.d0;
import o4.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q4.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt4/c;", "Lt4/d;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f162257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f162258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e0 f162259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f162260d;

    private c(long j8) {
        this.f162257a = j8;
        this.f162258b = 1.0f;
        g.f123559b.getClass();
        this.f162260d = g.f123560c;
    }

    @Override // t4.d
    public final boolean applyAlpha(float f14) {
        this.f162258b = f14;
        return true;
    }

    @Override // t4.d
    public final boolean applyColorFilter(e0 e0Var) {
        this.f162259c = e0Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return d0.d(this.f162257a, ((c) obj).f162257a);
        }
        return false;
    }

    @Override // t4.d
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: from getter */
    public final long getF162260d() {
        return this.f162260d;
    }

    public final int hashCode() {
        d0.a aVar = d0.f128823b;
        z.a aVar2 = z.f128618b;
        return Long.hashCode(this.f162257a);
    }

    @Override // t4.d
    public final void onDraw(f fVar) {
        f.A0(fVar, this.f162257a, 0L, 0L, this.f162258b, null, this.f162259c, 86);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) d0.j(this.f162257a)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ c(long j8, j jVar) {
        this(j8);
    }
}
