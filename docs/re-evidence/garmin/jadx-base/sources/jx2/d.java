package jx2;

import com.garmin.samd.exception.GHSUserAccountAlreadyExistsException;
import o53.b0;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDAccountManager$createSaMDUserAccount$2", f = "SaMDAccountManager.kt", l = {115}, m = "invokeSuspend")
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f101521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mx2.e.a f101522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f101523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f101524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f101525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, b bVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f101524d = str;
        this.f101525e = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f101524d, this.f101525e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b bVar;
        mx2.e.a aVar;
        Throwable thG;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f101523c;
        if (i14 == 0) {
            o13.r.b(obj);
            String str = this.f101524d;
            boolean zJ = d53.w.J(str);
            b bVar2 = this.f101525e;
            if (zJ) {
                bVar2.e("createSaMDUserAccount: blank MFA token", null);
                vb.h.s("blank MFA token");
                return null;
            }
            gx2.a aVarH = bVar2.h("createSaMDUserAccount");
            bVar2.d().debug("createSaMDUserAccount");
            try {
                mx2.e.a aVar3 = mx2.e.f121455b;
                mx2.c cVar = new mx2.c(str);
                this.f101521a = bVar2;
                this.f101522b = aVar3;
                this.f101523c = 1;
                obj = o72.t.s(cVar, aVarH, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                bVar = bVar2;
                aVar = aVar3;
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                thG = bVar.g(th);
                if (thG instanceof GHSUserAccountAlreadyExistsException) {
                    throw thG;
                }
                bVar.f((Exception) thG, "createSaMDUserAccount");
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = this.f101522b;
            bVar = this.f101521a;
            try {
                o13.r.b(obj);
            } catch (Throwable th4) {
                th = th4;
                thG = bVar.g(th);
                if (thG instanceof GHSUserAccountAlreadyExistsException) {
                    throw thG;
                }
                bVar.f((Exception) thG, "createSaMDUserAccount");
            }
        }
        mx2.d dVar = (mx2.d) obj;
        aVar.getClass();
        dVar.getClass();
        try {
            String string = new JSONObject(dVar.f121454a).getString("samdId");
            string.getClass();
            String str2 = new mx2.e(string).f121456a;
            bVar.getClass();
            qx2.a.f148445a.i(str2);
            b.i(bVar, str2);
            return Unit.INSTANCE;
        } catch (Throwable th5) {
            ge1.b.L("UserAccount").error("fromGHSJson", th5);
            throw th5;
        }
    }
}
