package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.ContactsDelegate", f = "LivetrackGcmDelegateImpl.kt", l = {532}, m = "inviteToMessenger", v = 2)
public final class j0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f104137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104138c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, t13.d<? super j0> dVar) {
        super(dVar);
        this.f104137b = m0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104136a = obj;
        this.f104138c |= Integer.MIN_VALUE;
        return this.f104137b.a(0L, null, this);
    }
}
