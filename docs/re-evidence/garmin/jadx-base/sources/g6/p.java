package g6;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg6/p;", "Lh6/a;", "", "fontScale", "<init>", "(F)V", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class p implements h6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f76017a;

    public p(float f14) {
        this.f76017a = f14;
    }

    @Override // h6.a
    public final float a(float f14) {
        return f14 * this.f76017a;
    }

    @Override // h6.a
    public final float b(float f14) {
        return f14 / this.f76017a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Float.compare(this.f76017a, ((p) obj).f76017a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f76017a);
    }

    public final String toString() {
        return q6.f.p(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f76017a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
