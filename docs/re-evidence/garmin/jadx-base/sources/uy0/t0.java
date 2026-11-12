package uy0;

import java.io.Serializable;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Luy0/m1;", "<anonymous>", "(Z)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetSearchableItemsUseCase$invoke$1", f = "GetSearchableItemsUseCase.kt", l = {21}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.p<Boolean, t13.d<? super List<? extends m1>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f173308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f173309b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, t13.d<? super t0> dVar) {
        super(2, dVar);
        this.f173309b = u0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t0(this.f173309b, dVar);
    }

    @Override // e23.p
    public final Object invoke(Boolean bool, t13.d<? super List<? extends m1>> dVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((t0) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f173308a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ty0.b bVar = ty0.b.f166892l3;
        this.f173308a = 1;
        Serializable serializableA = u0.a(this.f173309b, bVar, this);
        return serializableA == aVar ? aVar : serializableA;
    }
}
