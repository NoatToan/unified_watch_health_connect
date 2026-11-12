package w5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw5/d;", "Lw5/m0;", "", "fontWeightAdjustment", "<init>", "(I)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d implements m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f182080b;

    public d(int i14) {
        this.f182080b = i14;
    }

    @Override // w5.m0
    public final f0 a(f0 f0Var) {
        int i14 = this.f182080b;
        return (i14 == 0 || i14 == Integer.MAX_VALUE) ? f0Var : new f0(j23.t.e(f0Var.f182107a + i14, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f182080b == ((d) obj).f182080b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f182080b);
    }

    public final String toString() {
        return ds.e0.j(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f182080b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
