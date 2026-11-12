package cv;

import android.content.Context;
import androidx.lifecycle.n0;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcv/g;", "Landroidx/lifecycle/n;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbv/c;", "baseModuleAppDelegate", "<init>", "(Landroid/content/Context;Lbv/c;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements androidx.lifecycle.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bv.c f55797b;

    public g(Context context, bv.c cVar) {
        context.getClass();
        cVar.getClass();
        this.f55796a = context;
        this.f55797b = cVar;
    }

    @Override // androidx.lifecycle.n
    public final void onStop(n0 n0Var) {
        this.f55797b.b(this.f55796a);
    }
}
