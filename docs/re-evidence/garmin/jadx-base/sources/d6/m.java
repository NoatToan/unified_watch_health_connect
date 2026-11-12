package d6;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ld6/m;", "", "", "scaleX", "skewX", "<init>", "(FF)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f57775c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f57776d = new m(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f57778b;

    public /* synthetic */ m(float f14, float f15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 1.0f : f14, (i14 & 2) != 0 ? 0.0f : f15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f57777a == mVar.f57777a && this.f57778b == mVar.f57778b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f57778b) + (Float.hashCode(this.f57777a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb3.append(this.f57777a);
        sb3.append(", skewX=");
        return q6.f.p(sb3, this.f57778b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/m$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public m(float f14, float f15) {
        this.f57777a = f14;
        this.f57778b = f15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m() {
        float f14 = 0.0f;
        this(f14, f14, 3, null);
    }
}
