package o4;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lo4/r;", "Lo4/e0;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "Lo4/q;", "blendMode", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(JILandroid/graphics/ColorFilter;Lkotlin/jvm/internal/j;)V", "(JILkotlin/jvm/internal/j;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f128961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f128962d;

    /* JADX WARN: Illegal instructions before constructor call */
    private r(long j8, int i14) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            t.f129006a.getClass();
            s.h();
            porterDuffColorFilter = s.b(f0.j(j8), b.a(i14));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(f0.j(j8), b.b(i14));
        }
        this(j8, i14, porterDuffColorFilter, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!d0.d(this.f128961c, rVar.f128961c)) {
            return false;
        }
        int i14 = rVar.f128962d;
        q.a aVar = q.f128930b;
        return this.f128962d == i14;
    }

    public final int hashCode() {
        d0.a aVar = d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        int iHashCode = Long.hashCode(this.f128961c) * 31;
        q.a aVar3 = q.f128930b;
        return Integer.hashCode(this.f128962d) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BlendModeColorFilter(color=");
        q2.m(this.f128961c, ", blendMode=", sb3);
        sb3.append((Object) q.b(this.f128962d));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public /* synthetic */ r(long j8, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, i14);
    }

    public /* synthetic */ r(long j8, int i14, ColorFilter colorFilter, p005kotlin.jvm.internal.j jVar) {
        this(j8, i14, colorFilter);
    }

    private r(long j8, int i14, ColorFilter colorFilter) {
        super(colorFilter);
        this.f128961c = j8;
        this.f128962d = i14;
    }
}
