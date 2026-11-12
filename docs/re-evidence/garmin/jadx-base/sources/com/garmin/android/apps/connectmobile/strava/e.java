package com.garmin.android.apps.connectmobile.strava;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.strava.GetConsumerPermissionsTask$execute$2", f = "GetConsumerPermissionsTask.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f44986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v2<List<hk1.h>> f44987b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(d dVar, v2<? extends List<hk1.h>> v2Var, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f44986a = dVar;
        this.f44987b = v2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f44986a, this.f44987b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        this.f44986a.f44984b.b((List) ((v2.b) this.f44987b).f47386a);
        return Unit.INSTANCE;
    }
}
