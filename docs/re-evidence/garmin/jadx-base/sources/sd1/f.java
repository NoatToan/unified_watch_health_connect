package sd1;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.reminders.network.UserRemindersRepository$deleteUserReminder$2", f = "UserRemindersRepository.kt", l = {59}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pd1.a f158627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f158628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(pd1.a aVar, int i14, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f158627b = aVar;
        this.f158628c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f158627b, this.f158628c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f158626a;
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
        String str = this.f158627b.f137376a;
        this.f158626a = 1;
        Object objC = bVarA.c(str, this.f158628c, this);
        return objC == aVar ? aVar : objC;
    }
}
