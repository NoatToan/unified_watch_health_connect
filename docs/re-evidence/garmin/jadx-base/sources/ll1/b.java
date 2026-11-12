package ll1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.init.RecordActivityInitialStateCheckScreenKt$RecordActivityInitialStateCheckScreen$1$1", f = "RecordActivityInitialStateCheckScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f113370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f113371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f113372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<Long, Unit> f113373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<Long, Unit> f113374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p<Long, String, Unit> f113375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x3<d> f113376g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar, e23.a<Unit> aVar2, e23.l<? super Long, Unit> lVar, e23.l<? super Long, Unit> lVar2, p<? super Long, ? super String, Unit> pVar, x3<d> x3Var, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f113371b = aVar;
        this.f113372c = aVar2;
        this.f113373d = lVar;
        this.f113374e = lVar2;
        this.f113375f = pVar;
        this.f113376g = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f113371b, this.f113372c, this.f113373d, this.f113374e, this.f113375f, this.f113376g, dVar);
        bVar.f113370a = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        a aVar2 = this.f113371b;
        if (aVar2 != null) {
            a2 a2Var = a2.RECORD_ACTIVITY;
            x3<d> x3Var = this.f113376g;
            boolean z14 = x3Var.getF182175a().f113377a;
            boolean z15 = x3Var.getF182175a().f113378b;
            a aVar3 = x3Var.getF182175a().f113379c;
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("Checking initial state: loading=", ", error=", ", initialState=", z14, z15);
            sbM.append(aVar3);
            String string = sbM.toString();
            i2.f36769a.getClass();
            i2.a.b(a2Var, "RecordActivityInitialStateCheckScreen", string);
            if (aVar2 instanceof a.d) {
                this.f113372c.invoke();
            } else if (aVar2 instanceof a.c) {
                this.f113373d.invoke(new Long(((a.c) aVar2).f113368a));
            } else if (aVar2 instanceof a.b) {
                this.f113374e.invoke(new Long(((a.b) aVar2).f113367a));
            } else {
                if (!(aVar2 instanceof a.C2168a)) {
                    u0.r();
                    return null;
                }
                a.C2168a c2168a = (a.C2168a) aVar2;
                this.f113375f.invoke(new Long(c2168a.f113365a), c2168a.f113366b);
            }
        }
        return Unit.INSTANCE;
    }
}
