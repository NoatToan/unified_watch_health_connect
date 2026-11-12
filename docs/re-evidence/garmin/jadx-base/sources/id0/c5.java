package id0;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.TrailsDelegateImpl", f = "TrailsDI.kt", l = {150}, m = "getTrailCopyForDuplication", v = 2)
public final class c5 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f92692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f92693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f92694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e5 f92695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f92696e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(e5 e5Var, t13.d<? super c5> dVar) {
        super(dVar);
        this.f92695d = e5Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92694c = obj;
        this.f92696e |= Integer.MIN_VALUE;
        return this.f92695d.f(null, 0L, 0L, this);
    }
}
