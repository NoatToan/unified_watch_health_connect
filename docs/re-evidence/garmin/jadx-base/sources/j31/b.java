package j31;

import android.content.Context;
import com.garmin.android.apps.connectmobile.activities.deeplink.AppPromoPopupActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj31/b;", "Lj31/z0;", "Lb31/f;", "onboardingChecksRepository", "<init>", "(Lb31/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.f f96869b;

    public b(b31.f fVar) {
        fVar.getClass();
        this.f96869b = fVar;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        ds.e0.p(context, str, str2);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new a(this, null), 3);
        context.startActivity(AppPromoPopupActivity.a.b(AppPromoPopupActivity.f29002e, context, en.n.AB_QUANTUM, false, null, null, 60));
    }
}
