package com.garmin.android.livesessionview;

import e23.p;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.livesessionview.LiveActivityViewModel$initializeSessionState$1", f = "LiveActivityViewModel.kt", l = {42}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f50572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ig2.b f50573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ig2.b bVar, d<? super b> dVar) {
        super(2, dVar);
        this.f50572b = aVar;
        this.f50573c = bVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f50572b, this.f50573c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f50571a;
        a aVar2 = this.f50572b;
        if (i14 == 0) {
            r.b(obj);
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityViewModel", "Starting session state initialization");
            int i15 = a.f50566e;
            aVar2.getClass();
            ig2.b bVar = this.f50573c;
            hg2.c bVar2 = bVar.b() ? new hg2.b(new ig2.e(bVar), aVar2.f50567a, aVar2.f50568b) : new hg2.a();
            this.f50571a = 1;
            objA = bVar2.a(this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objA = ((q) obj).f128597a;
        }
        Throwable thB = q.b(objA);
        if (thB != null) {
            zg2.c.f204692a.getClass();
            zg2.c.c("LiveActivityViewModel", thB);
            p2 p2Var = aVar2.f50569c;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, new c.a(thB)));
        }
        if (!(objA instanceof q.b)) {
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityViewModel", "Session state initialization successful");
            p2 p2Var2 = aVar2.f50569c;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, c.b.f50575a));
        }
        return Unit.INSTANCE;
    }
}
