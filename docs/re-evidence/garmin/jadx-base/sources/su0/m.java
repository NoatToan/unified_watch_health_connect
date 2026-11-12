package su0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.ContactsRepository", f = "ContactsRepository.kt", l = {110}, m = "hasLiveTrackPhoneRecipients", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f160980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160981c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f160980b = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160979a = obj;
        this.f160981c |= Integer.MIN_VALUE;
        return this.f160980b.h(this);
    }
}
