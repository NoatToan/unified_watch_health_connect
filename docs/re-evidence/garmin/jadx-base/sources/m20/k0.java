package m20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lm20/k0;", "Lm20/e;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lm20/g;", "contactsAPI", "Lm20/a;", "contactConsentMessageAPI", "<init>", "(Lm20/g;Lm20/a;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 implements e, com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f115984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f115985b;

    public /* synthetic */ k0(g gVar, a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? com.garmin.android.apps.connectmobile.contacts.b.e() ? (g) ez0.b.a(ez0.b.f67468a, ez0.c.GC, a0.class, new c83.h.a[0], null, null, null, 120) : (g) ez0.b.a(ez0.b.f67468a, ez0.c.GC, g.class, new c83.h.a[0], null, null, null, 120) : gVar, aVar);
    }

    @Override // m20.e
    public final Object a(long j8, j20.l.a aVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new i0(this, j8, null), aVar);
    }

    @Override // m20.e
    public final Object b(String str, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new j0(this, str, null), iVar);
    }

    @Override // m20.e
    public final Object c(b bVar, hl.a aVar, j20.l.a aVar2) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new h0(this, bVar, null), aVar2);
    }

    public k0(g gVar, a aVar) {
        gVar.getClass();
        aVar.getClass();
        this.f115984a = gVar;
        this.f115985b = aVar;
    }
}
