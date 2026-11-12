package oi1;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.locale.LocaleRepository", f = "LocaleRepository.kt", l = {21}, m = "updateUserTimezone-gIAlu-s", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f132263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f132264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f132265c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f132264b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132263a = obj;
        this.f132265c |= Integer.MIN_VALUE;
        Object objB = this.f132264b.b(null, this);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : q.a(objB);
    }
}
