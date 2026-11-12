package sd1;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.reminders.network.UserRemindersRepository$putUserReminders$2", f = "UserRemindersRepository.kt", l = {49}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pd1.c f158632b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pd1.c cVar, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f158632b = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f158632b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f158631a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        e.b bVarA = e.a.a(e.f158625a);
        this.f158631a = 1;
        Object objA = bVarA.a(this.f158632b, this);
        return objA == aVar ? aVar : objA;
    }
}
