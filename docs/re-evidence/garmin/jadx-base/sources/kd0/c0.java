package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.CalendarDelegateImpl", f = "CalendarDelegateImpl.kt", l = {380}, m = "getEcgCalendarItemsForMonth", v = 2)
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f104009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b0 b0Var, t13.d<? super c0> dVar) {
        super(dVar);
        this.f104009b = b0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104008a = obj;
        this.f104010c |= Integer.MIN_VALUE;
        return this.f104009b.v(null, this);
    }
}
