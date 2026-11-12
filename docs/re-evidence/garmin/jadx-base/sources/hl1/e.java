package hl1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.AllActivitiesViewModel$getAllActivities$2", f = "AllActivitiesViewModel.kt", l = {57, 59, 60}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f84378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f84379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f84382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f84383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f84383f = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f84383f, dVar);
        eVar.f84382e = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        boolean zBooleanValue;
        String strK;
        Object objE0;
        List list;
        Object objD;
        List list2;
        b0 b0Var = (b0) this.f84382e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84381d;
        c cVar = this.f84383f;
        if (i14 == 0) {
            o13.r.b(obj);
            fl1.f fVar = cVar.f84364b;
            long j8 = cVar.f84363a;
            this.f84382e = b0Var;
            this.f84381d = 1;
            objA = fVar.a(j8, this);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objA = ((o13.q) obj).f128597a;
        } else {
            if (i14 == 2) {
                zBooleanValue = this.f84380c;
                strK = this.f84378a;
                o13.r.b(obj);
                objE0 = obj;
                list = (List) objE0;
                ws.a aVar2 = cVar.f84370h;
                this.f84382e = null;
                this.f84378a = strK;
                this.f84379b = list;
                this.f84380c = zBooleanValue;
                this.f84381d = 3;
                objD = aVar2.d(this);
                if (objD != aVar) {
                    list2 = list;
                }
                return aVar;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zBooleanValue = this.f84380c;
            list2 = this.f84379b;
            strK = this.f84378a;
            o13.r.b(obj);
            objD = obj;
        }
        boolean zBooleanValue2 = ((Boolean) objD).booleanValue();
        p2 p2Var = cVar.f84371i;
        b bVar = (b) p2Var.getValue();
        kl1.c.f105264a.getClass();
        p2Var.k(null, b.a(bVar, false, i53.a.g(kl1.c.a(strK, zBooleanValue)), i53.a.e(list2), null, false, zBooleanValue2, 24));
        return Unit.INSTANCE;
        Throwable thB = o13.q.b(objA);
        if (thB != null) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.g(a2Var, "AllActivitiesViewModel", thB);
        }
        Boolean bool = Boolean.FALSE;
        if (objA instanceof o13.q.b) {
            objA = bool;
        }
        zBooleanValue = ((Boolean) objA).booleanValue();
        rd2.j jVar = rd2.f.a().f152045a;
        long j14 = cVar.f84363a;
        jVar.getClass();
        strK = rd2.j.k(j14);
        fl1.k kVar = cVar.f84369g;
        long j15 = cVar.f84363a;
        this.f84382e = null;
        this.f84378a = strK;
        this.f84380c = zBooleanValue;
        this.f84381d = 2;
        objE0 = ge1.b.e0(kVar.f72020c, new fl1.l(kVar, j15, null), this);
        if (objE0 != aVar) {
            list = (List) objE0;
            ws.a aVar4 = cVar.f84370h;
            this.f84382e = null;
            this.f84378a = strK;
            this.f84379b = list;
            this.f84380c = zBooleanValue;
            this.f84381d = 3;
            objD = aVar4.d(this);
            if (objD != aVar) {
                list2 = list;
                boolean zBooleanValue3 = ((Boolean) objD).booleanValue();
                p2 p2Var2 = cVar.f84371i;
                b bVar2 = (b) p2Var2.getValue();
                kl1.c.f105264a.getClass();
                p2Var2.k(null, b.a(bVar2, false, i53.a.g(kl1.c.a(strK, zBooleanValue)), i53.a.e(list2), null, false, zBooleanValue3, 24));
                return Unit.INSTANCE;
            }
        }
        return aVar;
    }
}
