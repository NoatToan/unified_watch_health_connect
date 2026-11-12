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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lkd1/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.reminders.domain.SaveUserRemindersUseCase$invoke$1", f = "SaveUserRemindersUseCase.kt", l = {25, 27, 28, 31}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<r53.j<? super g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pd1.a f104514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f104515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pd1.c f104516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(pd1.a aVar, h hVar, pd1.c cVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f104514c = aVar;
        this.f104515d = hVar;
        this.f104516e = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f104514c, this.f104515d, this.f104516e, dVar);
        iVar.f104513b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super g> jVar, t13.d<? super Unit> dVar) {
        return ((i) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L30;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0088, please report this as an issue */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        r53.j jVar = (r53.j) this.f104513b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f104512a;
        pd1.a aVar2 = this.f104514c;
        if (i14 == 0) {
            r.b(obj);
            i2.f36769a.getClass();
            i2.a.b(a2.USER_REMINDERS, "SaveUserRemindersUseCase", "Saving reminder for " + aVar2);
            g.b bVar = g.b.f104508a;
            this.f104513b = jVar;
            this.f104512a = 1;
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
                g.c cVar = g.c.f104509a;
                this.f104513b = null;
                this.f104512a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                i2.f36769a.getClass();
                i2.a.b(a2.USER_REMINDERS, "SaveUserRemindersUseCase", "Failed to save reminder for " + aVar2);
                g.a aVar3 = g.a.f104507a;
                this.f104513b = null;
                this.f104512a = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        sd1.e eVar = this.f104515d.f104510a;
        this.f104513b = jVar;
        this.f104512a = 2;
        eVar.getClass();
        obj = f0.J(eVar, new sd1.h(this.f104516e, null), this);
        if (obj != aVar) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                g.c cVar2 = g.c.f104509a;
                this.f104513b = null;
                this.f104512a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                i2.f36769a.getClass();
                i2.a.b(a2.USER_REMINDERS, "SaveUserRemindersUseCase", "Failed to save reminder for " + aVar2);
                g.a aVar4 = g.a.f104507a;
                this.f104513b = null;
                this.f104512a = 4;
            }
        }
        return aVar;
    }
}
