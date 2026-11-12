package xg0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import ps.b1;
import ps.c1;
import ps.t1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxg0/j0;", "Lrs/d;", "Lwg0/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 implements rs.d<wg0.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f190780a;

    public j0(Context context) {
        context.getClass();
        this.f190780a = context;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    @Override // rs.d
    public final rs.e a(wg0.d dVar) {
        t1 t1Var;
        b1 b1Var;
        dVar.getClass();
        c1 c1Var = dVar.f185079b;
        if (c1Var == null) {
            t1Var = null;
        } else {
            t1Var = c1Var.f139768e;
            if (p005kotlin.jvm.internal.s.g((t1Var == null || (b1Var = t1Var.f140222a) == null) ? null : b1Var.f139689a, new b1.r(0.0f, 1, null).f139689a)) {
                t1Var = null;
            }
        }
        if (t1Var == null) {
            return null;
        }
        b1 b1Var2 = t1Var.f140222a;
        return new rs.e(Integer.valueOf(b1Var2.f139691c), Integer.valueOf(b1Var2.f139692d), t1Var.d(this.f190780a), Integer.valueOf(b1Var2.f139697i));
    }
}
