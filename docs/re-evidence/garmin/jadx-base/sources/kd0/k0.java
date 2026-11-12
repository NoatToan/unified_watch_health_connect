package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.ContactsDelegate", f = "LivetrackGcmDelegateImpl.kt", l = {546}, m = "updateContact", v = 2)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f104161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104162c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, t13.d<? super k0> dVar) {
        super(dVar);
        this.f104161b = m0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104160a = obj;
        this.f104162c |= Integer.MIN_VALUE;
        return this.f104161b.b(null, this);
    }
}
