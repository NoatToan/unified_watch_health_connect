package com.garmin.android.apps.connectmobile.live.activity;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "it", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/repcounting/model/c;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.live.activity.LiveActivityExerciseProviderImpl$getExerciseList$2", f = "LiveActivityExerciseProviderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.repcounting.model.c, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38446a;

    public n(t13.d<? super n> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(dVar);
        nVar.f38446a = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.repcounting.model.c cVar, t13.d<? super Boolean> dVar) {
        return ((n) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) this.f38446a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        return Boolean.valueOf(cVar != null);
    }
}
