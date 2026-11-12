package pk1;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.usersettings.GetLoginTokenViewModel$handleLoginToken$1", f = "GetLoginTokenViewModel.kt", l = {25, 27, 30}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f138284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f138285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, String str, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f138284b = fVar;
        this.f138285c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f138284b, this.f138285c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r1.emit(r2, r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f138283a;
        String str = this.f138285c;
        f fVar = this.f138284b;
        if (i14 == 0) {
            o13.r.b(obj);
            n nVar = fVar.f138286a;
            this.f138283a = 1;
            obj = nVar.a(str, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2 && i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            e2 e2Var = fVar.f138287b;
            l lVar = new l((String) ((v2.b) v2Var).f47386a, str);
            this.f138283a = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            e2 e2Var2 = fVar.f138287b;
            l lVar2 = new l(null, str);
            this.f138283a = 3;
        }
    }
}
