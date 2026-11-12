package j31;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj31/z;", "Lj31/z0;", "Landroid/content/Context;", "applicationContext", "Lb31/f;", "onboardingChecksRepository", "<init>", "(Landroid/content/Context;Lb31/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f96951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b31.f f96952c;

    public z(Context context, b31.f fVar) {
        context.getClass();
        fVar.getClass();
        this.f96951b = context;
        this.f96952c = fVar;
    }

    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        if (hb2.g.b(this.f96951b, hb2.g.a.GARMIN_DIVE)) {
            this.f96952c.b(e31.a.GARMIN_DIVE_APP_ONBOARDING);
        }
        return Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        ds.e0.p(context, str, str2);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new y(this, null), 3);
        new c22.n1(context, hb2.g.a.GARMIN_DIVE).a();
    }
}
