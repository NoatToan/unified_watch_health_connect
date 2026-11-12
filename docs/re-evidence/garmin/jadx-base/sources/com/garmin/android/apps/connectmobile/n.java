package com.garmin.android.apps.connectmobile;

import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "Landroid/util/Pair;", "", "<anonymous>", "(Lo53/b0;)Lkotlin/Array;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.AppConfigurationViewActivity$AppConfigurationViewModel$fetchAppConfig$2", f = "AppConfigurationViewActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Pair<String, String>[]>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppConfigurationViewActivity.a f39326a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AppConfigurationViewActivity.a aVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f39326a = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f39326a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Pair<String, String>[]> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        FirebaseRemoteConfigInfo firebaseRemoteConfigInfoF;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        l.g().getClass();
        Pair[] pairArrE = gh2.i.f77458c.a().f77477b.e();
        r53.p2 p2Var = this.f39326a.f28631e;
        do {
            value = p2Var.getValue();
            l.g().getClass();
            firebaseRemoteConfigInfoF = gh2.i.f77458c.a().f77477b.f();
        } while (!p2Var.b(value, firebaseRemoteConfigInfoF != null ? new Long(firebaseRemoteConfigInfoF.getFetchTimeMillis()) : null));
        return pairArrE == null ? new Pair[0] : pairArrE;
    }
}
