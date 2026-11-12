package com.garmin.android.apps.connectmobile.live.activity;

import am.x0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Iterator;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.live.activity.LiveActivityExerciseProviderImpl$initCache$1", f = "LiveActivityExerciseProviderImpl.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f38450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f38451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f38454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f38455f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f38455f = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f38455f, dVar);
        pVar.f38454e = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int i14;
        k kVar;
        Iterator it;
        b0 b0Var = (b0) this.f38454e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f38453d;
        if (i15 == 0) {
            o13.r.b(obj);
            Iterator it3 = x.k(x0.f4322q2, x0.f4326r2, x0.f4346x).iterator();
            i14 = 0;
            kVar = this.f38455f;
            it = it3;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = this.f38452c;
            it = this.f38451b;
            kVar = this.f38450a;
            o13.r.b(obj);
        }
        while (it.hasNext()) {
            x0 x0Var = (x0) it.next();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "LiveActivityExerciseProviderImpl", "Get exercise list for " + x0Var);
            this.f38454e = b0Var;
            this.f38450a = kVar;
            this.f38451b = it;
            this.f38452c = i14;
            this.f38453d = 1;
            int i16 = k.f38433c;
            if (kVar.c(x0Var, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
