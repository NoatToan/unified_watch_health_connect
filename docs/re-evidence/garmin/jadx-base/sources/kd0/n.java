package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.BaseModuleAppDelegateImpl", f = "BaseModuleAppDelegateImpl.kt", l = {288}, m = "isChildAccountSuspended", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f104240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f104240b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104239a = obj;
        this.f104241c |= Integer.MIN_VALUE;
        return this.f104240b.n(0L, this);
    }
}
