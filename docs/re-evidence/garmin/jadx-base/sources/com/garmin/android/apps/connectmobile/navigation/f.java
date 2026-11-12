package com.garmin.android.apps.connectmobile.navigation;

import android.app.Activity;
import e23.p;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.FeatureNavigationUtils$Companion$handleItemSelected$17", f = "FeatureNavigationUtils.kt", l = {597}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ak0.a f39369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f39371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Activity activity, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f39371c = activity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f39371c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ak0.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f39370b;
        if (i14 == 0) {
            r.b(obj);
            ak0.a aVar3 = (ak0.a) KoinJavaComponent.get$default(ak0.a.class, null, null, 6, null);
            this.f39369a = aVar3;
            this.f39370b = 1;
            Object objG = aVar3.g(this);
            if (objG == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj = objG;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = this.f39369a;
            r.b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Activity activity = this.f39371c;
        if (zBooleanValue) {
            aVar.c(activity);
        } else {
            aVar.q(activity);
        }
        return Unit.INSTANCE;
    }
}
