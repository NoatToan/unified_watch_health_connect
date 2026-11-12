package kd0;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.NewsfeedDelegateImpl", f = "NewsfeedDelegateImpl.kt", l = {293}, m = "fetchActivityPost", v = 2)
public final class o4 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f104266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n4 f104268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104269d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(n4 n4Var, t13.d<? super o4> dVar) {
        super(dVar);
        this.f104268c = n4Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104267b = obj;
        this.f104269d |= Integer.MIN_VALUE;
        return this.f104268c.r(null, 0L, this);
    }
}
