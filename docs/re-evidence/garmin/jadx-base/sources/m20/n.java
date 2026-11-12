package m20;

import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ll20/r;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.network.ContactsRepo$getContacts$2", f = "ContactsRepo.kt", l = {61}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.l<t13.d<? super c83.a0<l20.r>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f115995b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(z zVar, t13.d<? super n> dVar) {
        super(1, dVar);
        this.f115995b = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n(this.f115995b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<l20.r>> dVar) {
        return ((n) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115994a;
        if (i14 == 0) {
            o13.r.b(obj);
            o53.i0<c83.a0<l20.r>> i0VarE = this.f115995b.f116055a.e();
            this.f115994a = 1;
            obj = i0VarE.await(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        c83.a0 a0Var = (c83.a0) obj;
        if (a0Var.f25745a.isSuccessful()) {
            l20.r rVar = (l20.r) a0Var.f25746b;
            List<l20.a> listF = rVar != null ? rVar.f() : null;
            f20.v vVar = (f20.v) KoinJavaComponent.get$default(f20.v.class, null, null, 6, null);
            if (listF == null) {
                listF = p13.j0.f134944a;
            }
            vVar.c(listF);
        }
        return a0Var;
    }
}
