package oi1;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.locale.LocaleRepository", f = "LocaleRepository.kt", l = {10}, m = "updateUserLocale-gIAlu-s", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f132257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f132258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f132259c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f132258b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132257a = obj;
        this.f132259c |= Integer.MIN_VALUE;
        Object objA = this.f132258b.a(null, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : q.a(objA);
    }
}
