package j31;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj31/v;", "Lj31/z0;", "Landroid/content/Context;", "applicationContext", "Lb31/f;", "onboardingChecksRepository", "<init>", "(Landroid/content/Context;Lb31/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f96937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b31.f f96938c;

    public v(Context context, b31.f fVar) {
        context.getClass();
        fVar.getClass();
        this.f96937b = context;
        this.f96938c = fVar;
    }

    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        if (hb2.g.b(this.f96937b, hb2.g.a.GARMIN_DEZL)) {
            this.f96938c.b(e31.a.HAS_DEZL_APP_INSTALLED);
        }
        return Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        new en.e(context).execute();
    }
}
