package kd0;

import android.content.Context;
import android.content.Intent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.NewsfeedDelegateImpl", f = "NewsfeedDelegateImpl.kt", l = {471, 507}, m = "getActivitiesEditActivityIntent", v = 2)
public final class p4 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f104284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f104285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f104286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f104287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n4 f104288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f104289f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(n4 n4Var, t13.d<? super p4> dVar) {
        super(dVar);
        this.f104288e = n4Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104287d = obj;
        this.f104289f |= Integer.MIN_VALUE;
        return this.f104288e.y(null, null, this);
    }
}
