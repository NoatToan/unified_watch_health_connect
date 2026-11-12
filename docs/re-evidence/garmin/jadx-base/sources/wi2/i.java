package wi2;

import kotlinx.serialization.SerializationException;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.auth.cmc.presentation.CMCPortalViewModel$handleJavaScriptMessage$2", f = "CMCPortalViewModel.kt", l = {227}, m = "invokeSuspend")
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f185667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f185668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SerializationException f185669c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, SerializationException serializationException, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f185668b = eVar;
        this.f185669c = serializationException;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f185668b, this.f185669c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185667a;
        if (i14 == 0) {
            o13.r.b(obj);
            q53.b bVar = this.f185668b.f185647h;
            String message = this.f185669c.getMessage();
            if (message == null) {
                message = "";
            }
            ti2.c.g gVar = new ti2.c.g(message);
            this.f185667a = 1;
            if (bVar.h(gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
