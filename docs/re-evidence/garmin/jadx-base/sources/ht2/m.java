package ht2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.inappupdate.InAppUpdateCheckHelper$savePersistentDataStoreEntry$2$1", f = "InAppUpdateCheckHelper.kt", l = {131}, m = "invokeSuspend")
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.inappupdate.e f85665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.garmin.inappupdate.e eVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f85665b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f85665b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f85664a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                n63.b.a aVar2 = n63.b.f123892d;
                com.garmin.inappupdate.e eVar = this.f85665b;
                aVar2.getClass();
                String strB = aVar2.b(com.garmin.inappupdate.e.INSTANCE.serializer(), eVar);
                c cVar = new c();
                zy2.j jVar = new zy2.j("mostRecentUpdate", strB);
                this.f85664a = 1;
                if (cVar.c("InAppUpdateCheckHelper", jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (Throwable th3) {
            a aVar3 = a.f85620a;
            n.f85666a.getClass();
            aVar3.c("savePersistentDataStoreEntry", th3);
        }
        return Unit.INSTANCE;
    }
}
