package u51;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import j22.f;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu51/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lv51/a;", "pendingActivitiesPreferences", "<init>", "(Landroid/content/Context;Lv51/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f168701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v51.a f168702b;

    public c(Context context, v51.a aVar) {
        context.getClass();
        aVar.getClass();
        this.f168701a = context;
        this.f168702b = aVar;
    }

    public final boolean a(boolean z14) {
        boolean z15 = false;
        if (z14 || this.f168702b.b()) {
            return false;
        }
        j22.b.f96736a.getClass();
        if (j22.b.j(this.f168701a) == f.ALLOWED_ALL_TIME && j22.b.k(j22.a.f96719h)) {
            z15 = true;
        }
        return !z15;
    }
}
