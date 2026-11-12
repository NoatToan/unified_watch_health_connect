package su0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.ContactsRepository", f = "ContactsRepository.kt", l = {242, 243}, m = "updatePhoneContact", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f161001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f161002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f161003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f161002b = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f161001a = obj;
        this.f161003c |= Integer.MIN_VALUE;
        t tVar = t.f161004a;
        return this.f161002b.q(null, this);
    }
}
