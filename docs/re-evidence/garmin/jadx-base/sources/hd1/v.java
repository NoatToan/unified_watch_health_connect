package hd1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.realtimedata.RealTimeDataProvider$registerBodyBatteryObserver$1", f = "RealTimeDataProvider.kt", l = {AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f83427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f83428c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f83428c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f83428c, dVar);
        vVar.f83427b = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f83427b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f83426a;
        if (i14 == 0) {
            o13.r.b(obj);
            t tVar = t.f83397a;
            this.f83427b = b0Var;
            this.f83426a = 1;
            obj = t.a(tVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            String str = this.f83428c;
            if (str != null) {
                a2 a2Var = a2.DEVICES;
                String strM = am.j.m("RealTimeDataProvider addListener bodyBatteryObserver macAddress[", str, "]");
                i2.f36769a.getClass();
                i2.a.a(a2Var, strM);
                xm2.g.f191527c.getClass();
                xm2.g gVarB = xm2.g.a.b();
                n nVar = t.f83408l;
                nVar.getClass();
                gVarB.a(nVar, xm2.h.BODY_BATTERY, str);
            }
        } else {
            Iterator it = t.f83417u.iterator();
            while (it.hasNext()) {
                t.D.post(new eh2.b((d) it.next(), 18));
            }
        }
        return Unit.INSTANCE;
    }
}
