package su0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.ContactsRepository", f = "ContactsRepository.kt", l = {85}, m = "getLiveTrackRecipients", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f160977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t tVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f160977b = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160976a = obj;
        this.f160978c |= Integer.MIN_VALUE;
        return this.f160977b.f(false, this);
    }
}
