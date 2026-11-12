package jl1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.io.Serializable;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.p2;
import rd2.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.edit.SelectFavouriteActivitiesViewModel$getActivities$2", f = "SelectFavouriteActivitiesViewModel.kt", l = {53, 58}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i53.c f99532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f99533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f99534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f99535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f99536e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, long j8, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f99535d = gVar;
        this.f99536e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f99535d, this.f99536e, dVar);
        hVar.f99534c = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[LOOP:0: B:30:0x00ad->B:34:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca A[SYNTHETIC] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        Object obj2;
        i53.c cVar;
        Throwable thB;
        Boolean bool;
        i53.d dVarG;
        p2 p2Var;
        Object value;
        i53.d dVar;
        b0 b0Var = (b0) this.f99534c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f99533b;
        long j8 = this.f99536e;
        g gVar = this.f99535d;
        if (i14 == 0) {
            r.b(obj);
            fl1.g gVar2 = gVar.f99519b;
            this.f99534c = b0Var;
            this.f99533b = 1;
            objB = gVar2.b(j8, this);
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
            objB = ((q) obj).f128597a;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i53.c cVar2 = this.f99532a;
            r.b(obj);
            obj2 = ((q) obj).f128597a;
            cVar = cVar2;
        }
        thB = q.b(obj2);
        if (thB != null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.g(a2Var, "SelectFavouriteActivitiesViewModel", thB);
        }
        bool = Boolean.FALSE;
        if (obj2 instanceof q.b) {
            obj2 = bool;
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        rd2.f.a().f152045a.getClass();
        String strK = j.k(j8);
        kl1.c.f105264a.getClass();
        dVarG = i53.a.g(kl1.c.a(strK, zBooleanValue));
        p2Var = gVar.f99524g;
        while (true) {
            value = p2Var.getValue();
            dVar = dVarG;
            if (p2Var.b(value, d.a((d) value, false, false, null, cVar, cVar, dVar, g.x4(dVarG, cVar), 6))) {
                return Unit.INSTANCE;
            }
            dVarG = dVar;
        }
        Throwable thB2 = q.b(objB);
        if (thB2 != null) {
            a2 a2Var2 = a2.ACTIVITY_RECORDING;
            i2.f36769a.getClass();
            i2.a.g(a2Var2, "SelectFavouriteActivitiesViewModel", thB2);
        }
        j0 j0Var = j0.f134944a;
        if (objB instanceof q.b) {
            objB = j0Var;
        }
        i53.c cVarE = i53.a.e((Iterable) objB);
        fl1.f fVar = gVar.f99522e;
        this.f99534c = b0Var;
        this.f99532a = cVarE;
        this.f99533b = 2;
        Serializable serializableA = fVar.a(j8, this);
        if (serializableA != aVar) {
            obj2 = serializableA;
            cVar = cVarE;
            thB = q.b(obj2);
            if (thB != null) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar3.getClass();
                i2.a.g(a2Var3, "SelectFavouriteActivitiesViewModel", thB);
            }
            bool = Boolean.FALSE;
            if (obj2 instanceof q.b) {
                obj2 = bool;
            }
            boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
            rd2.f.a().f152045a.getClass();
            String strK2 = j.k(j8);
            kl1.c.f105264a.getClass();
            dVarG = i53.a.g(kl1.c.a(strK2, zBooleanValue2));
            p2Var = gVar.f99524g;
            while (true) {
                value = p2Var.getValue();
                dVar = dVarG;
                if (p2Var.b(value, d.a((d) value, false, false, null, cVar, cVar, dVar, g.x4(dVarG, cVar), 6))) {
                    return Unit.INSTANCE;
                }
                dVarG = dVar;
            }
        }
        return aVar;
    }
}
