package db2;

import c22.y2;
import cq0.g;
import e23.p;
import f12.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import q53.t;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq53/t;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.framework.datamanagement.provider.util.EmergencyContactAlertPref$onPrefsUpdate$1", f = "EmergencyContactAlertPref.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<t<? super Unit>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f59092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f59093b;

    public b(t13.d<? super b> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(dVar);
        bVar.f59093b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super Unit> tVar, t13.d<? super Unit> dVar) {
        return ((b) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t tVar = (t) this.f59093b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f59092a;
        if (i14 == 0) {
            r.b(obj);
            y2 y2Var = new y2(tVar, 1);
            l lVar = a.f59091b;
            if (lVar == null) {
                s.m("prefs");
                throw null;
            }
            lVar.u3(y2Var);
            g gVar = new g(y2Var, 16);
            this.f59093b = null;
            this.f59092a = 1;
            if (q53.r.a(tVar, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
