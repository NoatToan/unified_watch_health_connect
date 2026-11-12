package m20;

import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ltj1/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.network.ContactsRepo$getECCContacts$2", f = "ContactsRepo.kt", l = {45, 48}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super c83.a0<tj1.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c83.a0 f115997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f115998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f115999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f115999c = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f115999c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<tj1.e>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        c83.a0 a0Var;
        l20.r userContactsDTO;
        tj1.e eVar;
        List<l20.a> listF;
        l20.r userContactsDTO2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115998b;
        z zVar = this.f115999c;
        if (i14 == 0) {
            o13.r.b(obj);
            o53.i0<c83.a0<tj1.e>> i0VarL = zVar.f116055a.l();
            this.f115998b = 1;
            obj = i0VarL.await(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a0Var = this.f115997a;
            o13.r.b(obj);
        }
        eVar = (tj1.e) a0Var.f25746b;
        if (eVar != null || (userContactsDTO2 = eVar.getUserContactsDTO()) == null) {
            listF = null;
        } else {
            listF = userContactsDTO2.f();
        }
        if (ge1.b.P(listF)) {
            ((a31.e) KoinJavaComponent.get$default(a31.e.class, null, null, 6, null)).b(e31.a.HAS_EMERGENCY_CONTACTS);
        }
        return a0Var;
        c83.a0 a0Var2 = (c83.a0) obj;
        if (!a0Var2.f25745a.isSuccessful()) {
            return a0Var2;
        }
        tj1.e eVar2 = (tj1.e) a0Var2.f25746b;
        List<l20.a> listF2 = (eVar2 == null || (userContactsDTO = eVar2.getUserContactsDTO()) == null) ? null : userContactsDTO.f();
        this.f115997a = a0Var2;
        this.f115998b = 2;
        if (z.d(zVar, listF2, this) != aVar) {
            a0Var = a0Var2;
            eVar = (tj1.e) a0Var.f25746b;
            if (eVar != null) {
                listF = null;
            } else {
                listF = null;
            }
            if (ge1.b.P(listF)) {
                ((a31.e) KoinJavaComponent.get$default(a31.e.class, null, null, 6, null)).b(e31.a.HAS_EMERGENCY_CONTACTS);
            }
            return a0Var;
        }
        return aVar;
    }
}
