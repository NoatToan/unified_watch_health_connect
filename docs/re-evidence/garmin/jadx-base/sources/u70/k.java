package u70;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import j70.r;
import j70.y;
import j70.z;
import lc.u0;
import n70.g7;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.focus.SelectHomeLayoutViewModel$saveMappedUserFocus$1", f = "SelectHomeLayoutViewModel.kt", l = {62, 65, 75}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f169446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f169447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f169448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f169449d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f169449d = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f169449d, dVar);
        kVar.f169448c = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x009c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e2  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dc, code lost:
    
        if (r2.emit(r0, r14) == r1) goto L27;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0078, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x00a0, please report this as an issue */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r rVarB;
        Object objJ0;
        v2 v2Var;
        g3 g3VarA;
        b0 b0Var = (b0) this.f169448c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169447b;
        i iVar = this.f169449d;
        if (i14 == 0) {
            o13.r.b(obj);
            e2 e2Var = iVar.f169434f;
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f169448c = b0Var;
            this.f169447b = 1;
            if (e2Var.emit(g3VarC, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            r rVar = this.f169446a;
            o13.r.b(obj);
            rVarB = rVar;
            objJ0 = obj;
            v2Var = (v2) objJ0;
            if (v2Var instanceof v2.b) {
                String str = "Focus save successful: " + rVarB;
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "SelectHomeLayoutViewModel", str);
                g3.a aVar3 = g3.f35298f;
                Unit unit = Unit.INSTANCE;
                aVar3.getClass();
                g3VarA = g3.a.d(unit);
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                String str2 = "Focus save failed: " + rVarB + " — " + ((v2.a) v2Var).f47383a;
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var2, "SelectHomeLayoutViewModel", str2);
                g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
            }
            e2 e2Var2 = iVar.f169434f;
            this.f169448c = null;
            this.f169446a = null;
            this.f169447b = 3;
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        r.a aVar5 = r.f97623f;
        String strH4 = iVar.f169429a.h4();
        aVar5.getClass();
        rVarB = z.b(r.a.a(strH4));
        g7 g7Var = iVar.f169431c;
        this.f169448c = b0Var;
        this.f169446a = rVarB;
        this.f169447b = 2;
        objJ0 = g7Var.f124245a.J0(new y(rVarB.f97636a, null, 2, null), this);
        if (objJ0 != aVar) {
            v2Var = (v2) objJ0;
            if (v2Var instanceof v2.b) {
                String str3 = "Focus save successful: " + rVarB;
                i2.a aVar6 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar6.getClass();
                i2.a.b(a2Var3, "SelectHomeLayoutViewModel", str3);
                g3.a aVar7 = g3.f35298f;
                Unit unit2 = Unit.INSTANCE;
                aVar7.getClass();
                g3VarA = g3.a.d(unit2);
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                String str4 = "Focus save failed: " + rVarB + " — " + ((v2.a) v2Var).f47383a;
                i2.a aVar8 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar8.getClass();
                i2.a.b(a2Var4, "SelectHomeLayoutViewModel", str4);
                g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
            }
            e2 e2Var3 = iVar.f169434f;
            this.f169448c = null;
            this.f169446a = null;
            this.f169447b = 3;
        }
        return aVar;
    }
}
