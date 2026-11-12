package su0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.ContactsRepository", f = "ContactsRepository.kt", l = {93}, m = "isSelfMessengerAvailable", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f160986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f160986b = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160985a = obj;
        this.f160987c |= Integer.MIN_VALUE;
        return this.f160986b.l(this);
    }
}
