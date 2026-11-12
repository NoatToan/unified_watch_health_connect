package d6;

import ch.qos.logback.core.CoreConstants;
import o13.z;
import o4.d0;
import o4.w;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ld6/c;", "Ld6/l;", "Lo4/d0;", "value", "<init>", "(JLkotlin/jvm/internal/j;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57707b;

    private c(long j8) {
        this.f57707b = j8;
        if (j8 != 16) {
            return;
        }
        y5.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // d6.l
    public final float a() {
        return d0.e(this.f57707b);
    }

    @Override // d6.l
    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getF57707b() {
        return this.f57707b;
    }

    @Override // d6.l
    public final w e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && d0.d(this.f57707b, ((c) obj).f57707b);
    }

    public final int hashCode() {
        d0.a aVar = d0.f128823b;
        z.a aVar2 = z.f128618b;
        return Long.hashCode(this.f57707b);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) d0.j(this.f57707b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ c(long j8, p005kotlin.jvm.internal.j jVar) {
        this(j8);
    }
}
