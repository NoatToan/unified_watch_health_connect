package kotlin;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.l;
import o13.e;
import w5.p;
import w5.p0;

/* JADX INFO: loaded from: classes.dex */
@e
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li5/i0;", "Lw5/p$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 implements p.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f91205a;

    public i0(Context context) {
        this.f91205a = context;
    }

    @Override // w5.p.b
    public final Typeface a(p pVar) {
        if (!(pVar instanceof p0)) {
            l.j(pVar, "Unknown font type: ");
            return null;
        }
        j0 j0Var = j0.f91219a;
        int i14 = ((p0) pVar).f182144a;
        j0Var.getClass();
        return this.f91205a.getResources().getFont(i14);
    }
}
