package o53;

import ch.qos.logback.core.CoreConstants;
import kotlinx.coroutines.TimeoutCancellationException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lo53/i2;", "U", "T", "Lu53/t;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "time", "Lt13/d;", "uCont", "<init>", "(JLt13/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i2<U, T extends U> extends u53.t<T> implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f129352e;

    public i2(long j8, t13.d<? super U> dVar) {
        super(dVar.getF157466b(), dVar);
        this.f129352e = j8;
    }

    @Override // o53.p1
    public final String i0() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.i0());
        sb3.append("(timeMillis=");
        return androidx.room.a0.l(sb3, this.f129352e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    @Override // java.lang.Runnable
    public final void run() {
        String strF;
        k0 k0VarD = m0.d(this.f129302c);
        n0 n0Var = k0VarD instanceof n0 ? (n0) k0VarD : null;
        long j8 = this.f129352e;
        if (n0Var != null) {
            e53.c.a aVar = e53.c.f63094b;
            e53.e.f(j8, e53.f.MILLISECONDS);
            strF = n0Var.k();
            if (strF == null) {
                strF = androidx.room.a0.f(j8, "Timed out waiting for ", " ms");
            }
        } else {
            strF = androidx.room.a0.f(j8, "Timed out waiting for ", " ms");
        }
        D(new TimeoutCancellationException(strF, this));
    }
}
