package oo1;

import com.garmin.android.apps.connectmobile.userprofile.model.k;
import f12.l;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Loo1/b;", "", "Lf12/l;", "gcmUserSettings", "<init>", "(Lf12/l;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f133129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f133130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f133131c;

    public b(l lVar) {
        lVar.getClass();
        this.f133129a = lVar;
        this.f133130b = k.PREMIUM_PROFILE;
        this.f133131c = q2.a(b12.b.f14386g);
    }

    public final p2 a(k kVar) {
        kVar.getClass();
        this.f133130b = kVar;
        b12.b bVar = new b12.b(this.f133129a.z4(kVar.name()), null, null, null, null, 30, null);
        p2 p2Var = this.f133131c;
        p2Var.k(null, bVar);
        return p2Var;
    }

    public final void b() {
        this.f133131c.k(null, new b12.b(this.f133129a.z4(this.f133130b.name()), null, null, null, null, 30, null));
    }
}
