package p4;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import o4.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001:\u0001\u000bB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lp4/c;", "", "", "name", "Lp4/b;", ModelSourceWrapper.TYPE, "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/j;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/j;)V", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f135542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f135543c;

    static {
        new a(null);
    }

    private c(String str, long j8, int i14) {
        this.f135541a = str;
        this.f135542b = j8;
        this.f135543c = i14;
        if (str.length() == 0) {
            vb.h.s("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i14 < -1 || i14 > 63) {
            vb.h.s("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i14);

    public abstract float c(int i14);

    /* JADX INFO: renamed from: d */
    public boolean getF135615q() {
        return false;
    }

    public long e(float f14, float f15, float f16) {
        float[] fArrF = f(new float[]{f14, f15, f16});
        return (((long) Float.floatToRawIntBits(fArrF[0])) << 32) | (((long) Float.floatToRawIntBits(fArrF[1])) & 4294967295L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f135543c == cVar.f135543c && p005kotlin.jvm.internal.s.g(this.f135541a, cVar.f135541a)) {
            return b.a(this.f135542b, cVar.f135542b);
        }
        return false;
    }

    public abstract float[] f(float[] fArr);

    public float g(float f14, float f15, float f16) {
        return f(new float[]{f14, f15, f16})[2];
    }

    public long h(float f14, float f15, float f16, float f17, c cVar) {
        b.a aVar = b.f135535b;
        float[] fArr = new float[(int) (this.f135542b >> 32)];
        fArr[0] = f14;
        fArr[1] = f15;
        fArr[2] = f16;
        float[] fArrA = a(fArr);
        return f0.a(fArrA[0], fArrA[1], fArrA[2], f17, cVar);
    }

    public int hashCode() {
        int iHashCode = this.f135541a.hashCode() * 31;
        b.a aVar = b.f135535b;
        return q6.f.e(iHashCode, 31, this.f135542b) + this.f135543c;
    }

    public final String toString() {
        return this.f135541a + " (id=" + this.f135543c + ", model=" + ((Object) b.b(this.f135542b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lp4/c$a;", "", "<init>", "()V", "", "MinId", "I", "MaxId", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(String str, long j8, p005kotlin.jvm.internal.j jVar) {
        this(str, j8);
    }

    public /* synthetic */ c(String str, long j8, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, j8, i14);
    }

    private c(String str, long j8) {
        this(str, j8, -1, null);
    }
}
