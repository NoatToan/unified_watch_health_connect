package kd0;

import android.app.Activity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.BaseModuleAppDelegateImpl", f = "BaseModuleAppDelegateImpl.kt", l = {99, 103}, m = "startupChecksRequired", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f104293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f104295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f104295c = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104294b = obj;
        this.f104296d |= Integer.MIN_VALUE;
        return this.f104295c.e(null, this);
    }
}
