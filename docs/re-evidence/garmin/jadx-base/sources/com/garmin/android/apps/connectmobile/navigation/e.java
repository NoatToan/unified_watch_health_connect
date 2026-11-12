package com.garmin.android.apps.connectmobile.navigation;

import android.app.Activity;
import android.net.Uri;
import e23.p;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.FeatureNavigationUtils$Companion$handleItemSelected$16", f = "FeatureNavigationUtils.kt", l = {573}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f39368b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Activity activity, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f39368b = activity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f39368b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f39367a;
        if (i14 == 0) {
            r.b(obj);
            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            this.f39367a = 1;
            obj = j1Var.h(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        g22.a.c(this.f39368b, (Uri) obj);
        return Unit.INSTANCE;
    }
}
