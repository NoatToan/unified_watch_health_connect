package kd1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lkd1/c;", "Lpd1/c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.reminders.domain.GetUserRemindersUseCase$invoke$1", f = "GetUserRemindersUseCase.kt", l = {23, 25, 26, 29}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<r53.j<? super c<? extends pd1.c>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pd1.a f104504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f104505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(pd1.a aVar, d dVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f104504c = aVar;
        this.f104505d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f104504c, this.f104505d, dVar);
        eVar.f104503b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super c<? extends pd1.c>> jVar, t13.d<? super Unit> dVar) {
        return ((e) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r0.emit(r2, r11) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L30;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x008d, please report this as an issue */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        r53.j jVar = (r53.j) this.f104503b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f104502a;
        pd1.a aVar2 = this.f104504c;
        if (i14 == 0) {
            r.b(obj);
            i2.f36769a.getClass();
            i2.a.b(a2.USER_REMINDERS, "GetUserRemindersUseCase", "Loading reminder for " + aVar2);
            c.b bVar = c.b.f104498a;
            this.f104503b = jVar;
            this.f104502a = 1;
            if (jVar.emit(bVar, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else if (i14 == 2) {
            r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                c.C1998c c1998c = new c.C1998c(((v2.b) v2Var).f47386a);
                this.f104503b = null;
                this.f104502a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                i2.f36769a.getClass();
                i2.a.f(a2.USER_REMINDERS, "GetUserRemindersUseCase", "Failed to load reminder for " + aVar2);
                c.a aVar3 = c.a.f104497a;
                this.f104503b = null;
                this.f104502a = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        sd1.e eVar = this.f104505d.f104500a;
        this.f104503b = jVar;
        this.f104502a = 2;
        eVar.getClass();
        obj = f0.J(eVar, new sd1.g(aVar2, null), this);
        if (obj != aVar) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                c.C1998c c1998c2 = new c.C1998c(((v2.b) v2Var).f47386a);
                this.f104503b = null;
                this.f104502a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                i2.f36769a.getClass();
                i2.a.f(a2.USER_REMINDERS, "GetUserRemindersUseCase", "Failed to load reminder for " + aVar2);
                c.a aVar4 = c.a.f104497a;
                this.f104503b = null;
                this.f104502a = 4;
            }
        }
        return aVar;
    }
}
