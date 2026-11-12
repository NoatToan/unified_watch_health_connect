package bs;

import am.x0;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;
import ps.d1;
import ps.x1;
import tq.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbs/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19645a;

    public b(Context context) {
        context.getClass();
        this.f19645a = context;
    }

    public final rs.c<wg0.d> a(x0 x0Var, List<x1> list, List<d1> list2) {
        Context context = this.f19645a;
        if (list2 == null || list2.isEmpty()) {
            return k.b(x0Var, list) ? new d(context) : new a(context);
        }
        return new c(context);
    }
}
