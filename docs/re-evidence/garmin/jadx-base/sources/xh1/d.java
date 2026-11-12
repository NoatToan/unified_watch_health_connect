package xh1;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fw.m;
import lc.u0;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.swim.css.CriticalSwimSpeedEditViewModel$getLatestCriticalSwimSpeed$1", f = "CriticalSwimSpeedEditViewModel.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f191055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f191056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f191056b = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f191056b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f191055a;
        c cVar = this.f191056b;
        if (i14 == 0) {
            r.b(obj);
            cVar.f191049c.j(m.a.f(m.f73767e, null, null, 3));
            g60.c cVar2 = cVar.f191047a;
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            this.f191055a = 1;
            obj = cVar2.b(dateTimeNow, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            T t7 = bVar.f47386a;
            if (bVar.f47387b == 200) {
                cVar.f191051e = ((g60.b) t7).b();
                cVar.f191049c.j(m.a.g(m.f73767e, t7, 1));
            } else {
                cVar.f191049c.j(m.a.g(m.f73767e, null, 3));
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var;
            cVar.f191048b.error(c.f191046f + " - Got " + aVar2.f47384b + " http error code while getting latest critical swim speed.\n " + aVar2.f47385c);
            cVar.f191049c.j(m.a.d(m.f73767e, aVar2.f47383a));
        }
        return Unit.INSTANCE;
    }
}
