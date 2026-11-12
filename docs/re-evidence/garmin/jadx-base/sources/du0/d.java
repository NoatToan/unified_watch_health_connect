package du0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.commands.StartEventSharingCommand$execute$1", f = "StartEventSharingCommand.kt", l = {51, 52}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gu0.b f61231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f61233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f61234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f61235e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, String str, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f61234d = cVar;
        this.f61235e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f61234d, this.f61235e, dVar);
        dVar2.f61233c = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        gu0.b bVar;
        List<ju0.c> list;
        b0 b0Var = (b0) this.f61233c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f61232b;
        c cVar = this.f61234d;
        if (i14 == 0) {
            r.b(obj);
            a2 a2Var = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "StartEventSharingCommand", "execute():");
            ju0.e eVar = (ju0.e) cVar.f61230f.getValue();
            long j8 = cVar.f61226b;
            this.f61233c = b0Var;
            this.f61232b = 1;
            obj = eVar.a(j8, this, true);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = this.f61231a;
            r.b(obj);
        }
        List list2 = (List) obj;
        ju0.e eVar2 = (ju0.e) cVar.f61230f.getValue();
        long j14 = cVar.f61226b;
        eVar2.getClass();
        ((fu0.e) eVar2.f100886e.getValue()).c(new gu0.c(j14, 0));
        if (bVar == null && (list = bVar.f79040e) != null && list.contains(ju0.c.START)) {
            cVar.f61229e.a(this.f61235e, list2);
        } else {
            a2 a2Var2 = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.k(a2Var2, "StartEventSharingCommand", "execute(): Start message is not selected, no msg will be sent.");
        }
        return Unit.INSTANCE;
        gu0.b bVar2 = (gu0.b) obj;
        ju0.e eVar3 = (ju0.e) cVar.f61230f.getValue();
        this.f61233c = b0Var;
        this.f61231a = bVar2;
        this.f61232b = 2;
        Object objB = eVar3.b(true, this);
        if (objB != aVar) {
            bVar = bVar2;
            obj = objB;
            List list3 = (List) obj;
            ju0.e eVar4 = (ju0.e) cVar.f61230f.getValue();
            long j15 = cVar.f61226b;
            eVar4.getClass();
            ((fu0.e) eVar4.f100886e.getValue()).c(new gu0.c(j15, 0));
            if (bVar == null) {
                a2 a2Var3 = a2.LIVE_EVENT_SHARING;
                i2.f36769a.getClass();
                i2.a.k(a2Var3, "StartEventSharingCommand", "execute(): Start message is not selected, no msg will be sent.");
            } else {
                a2 a2Var4 = a2.LIVE_EVENT_SHARING;
                i2.f36769a.getClass();
                i2.a.k(a2Var4, "StartEventSharingCommand", "execute(): Start message is not selected, no msg will be sent.");
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
