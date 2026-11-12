package fl1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfl1/n;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcl1/a;", "preferences", "Lfl1/m;", "isGpsActivity", "<init>", "(Landroid/content/Context;Lcl1/a;Lfl1/m;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f72027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl1.a f72028b;

    public n(Context context, cl1.a aVar, m mVar) {
        context.getClass();
        aVar.getClass();
        mVar.getClass();
        this.f72027a = context;
        this.f72028b = aVar;
    }

    public final boolean a(Set<String> set, zf2.d dVar) {
        set.getClass();
        dVar.getClass();
        boolean zA = m.a(set, dVar);
        boolean z14 = false;
        if (!zA || this.f72028b.b()) {
            return false;
        }
        j22.b.f96736a.getClass();
        if (j22.b.j(this.f72027a) == j22.f.ALLOWED_ALL_TIME && j22.b.k(j22.a.f96719h)) {
            z14 = true;
        }
        return !z14;
    }
}
