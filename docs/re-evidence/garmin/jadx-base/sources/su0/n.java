package su0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.ContactsRepository", f = "ContactsRepository.kt", l = {100}, m = "isMessengerSmsStatusForSelfSupported", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f160983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160984c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f160983b = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160982a = obj;
        this.f160984c |= Integer.MIN_VALUE;
        return this.f160983b.k(this);
    }
}
