package f12;

import java.util.LinkedHashMap;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.user.GCMUserAccountImpl$refreshUserITToken$2", f = "GCMUserAccountImpl.kt", l = {302}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedHashMap f68077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sc2.a f68078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f68080d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f68080d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f68080d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        sc2.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68079c;
        if (i14 == 0) {
            o13.r.b(obj);
            linkedHashMap = this.f68080d.f68021c;
            sc2.a aVar3 = sc2.a.f158478d;
            re2.b bVar = re2.b.f152215a;
            this.f68077a = linkedHashMap;
            this.f68078b = aVar3;
            this.f68079c = 1;
            bVar.getClass();
            Object objX = re2.b.x(aVar3, this);
            if (objX == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj = objX;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = this.f68078b;
            linkedHashMap = this.f68077a;
            o13.r.b(obj);
        }
        linkedHashMap.put(aVar, obj);
        return Unit.INSTANCE;
    }
}
