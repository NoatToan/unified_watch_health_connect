package su0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.ContactsRepository", f = "ContactsRepository.kt", l = {259}, m = "updateContactsList", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pu0.b f160997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f160998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f160999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f161000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f160999c = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160998b = obj;
        this.f161000d |= Integer.MIN_VALUE;
        t tVar = t.f161004a;
        return this.f160999c.p(null, this);
    }
}
