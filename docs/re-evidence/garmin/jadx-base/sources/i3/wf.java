package i3;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li3/wf;", "", "Lg6/f;", TtmlNode.LEFT, "width", "contentWidth", "<init>", "(FFFLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f90134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f90135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    public final float contentWidth;

    private wf(float f14, float f15, float f16) {
        this.f90134a = f14;
        this.f90135b = f15;
        this.contentWidth = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) obj;
        return g6.f.c(this.f90134a, wfVar.f90134a) && g6.f.c(this.f90135b, wfVar.f90135b) && g6.f.c(this.contentWidth, wfVar.contentWidth);
    }

    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Float.hashCode(this.contentWidth) + q6.f.d(this.f90135b, Float.hashCode(this.f90134a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TabPosition(left=");
        float f14 = this.f90134a;
        tn.k.l(f14, ", right=", sb3);
        float f15 = this.f90135b;
        sb3.append((Object) g6.f.d(f14 + f15));
        sb3.append(", width=");
        sb3.append((Object) g6.f.d(f15));
        sb3.append(", contentWidth=");
        sb3.append((Object) g6.f.d(this.contentWidth));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public /* synthetic */ wf(float f14, float f15, float f16, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16);
    }
}
