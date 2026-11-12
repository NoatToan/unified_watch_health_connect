package bs;

import am.x0;
import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import uw0.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbs/e;", "Lrs/d;", "Lwg0/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements rs.d<wg0.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19648a;

    public e(Context context) {
        context.getClass();
        this.f19648a = context;
    }

    @Override // rs.d
    public final rs.e a(wg0.d dVar) {
        dVar.getClass();
        x0 x0Var = dVar.f185078a;
        g.a aVar = new g.a();
        x0Var.getClass();
        aVar.f172998b = x0Var;
        aVar.f172997a = true;
        Resources resources = this.f19648a.getResources();
        resources.getClass();
        return new rs.e(null, null, null, Integer.valueOf(aVar.a(resources).b()), 7, null);
    }
}
