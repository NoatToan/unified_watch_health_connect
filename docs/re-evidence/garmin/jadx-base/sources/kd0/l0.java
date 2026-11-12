package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.ContactsDelegate", f = "LivetrackGcmDelegateImpl.kt", l = {539}, m = "upsertContact", v = 2)
public final class l0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f104184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, t13.d<? super l0> dVar) {
        super(dVar);
        this.f104184b = m0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104183a = obj;
        this.f104185c |= Integer.MIN_VALUE;
        return this.f104184b.e(null, this);
    }
}
