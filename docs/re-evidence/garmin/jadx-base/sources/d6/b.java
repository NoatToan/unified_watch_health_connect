package d6;

import ch.qos.logback.core.CoreConstants;
import o4.d0;
import o4.p1;
import o4.w;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld6/b;", "Ld6/l;", "Lo4/p1;", "value", "", "alpha", "<init>", "(Lo4/p1;F)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f57705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f57706c;

    public b(p1 p1Var, float f14) {
        this.f57705b = p1Var;
        this.f57706c = f14;
    }

    @Override // d6.l
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getF57706c() {
        return this.f57706c;
    }

    @Override // d6.l
    /* JADX INFO: renamed from: b */
    public final long getF57707b() {
        d0.f128823b.getClass();
        return d0.f128832k;
    }

    @Override // d6.l
    public final w e() {
        return this.f57705b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f57705b, bVar.f57705b) && Float.compare(this.f57706c, bVar.f57706c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f57706c) + (this.f57705b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BrushStyle(value=");
        sb3.append(this.f57705b);
        sb3.append(", alpha=");
        return q6.f.p(sb3, this.f57706c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
