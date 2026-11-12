package fe2;

import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.SessionExpander$checkAndExpand$1", f = "SessionExpander.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class y1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f71012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f71013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<DateTime> f71014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<DateTime, Unit> f71015e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y1(x1 x1Var, DateTime dateTime, p005kotlin.jvm.internal.r0<DateTime> r0Var, e23.l<? super DateTime, Unit> lVar, t13.d<? super y1> dVar) {
        super(2, dVar);
        this.f71012b = x1Var;
        this.f71013c = dateTime;
        this.f71014d = r0Var;
        this.f71015e = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y1(this.f71012b, this.f71013c, this.f71014d, this.f71015e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9, types: [T, java.lang.Object, org.joda.time.DateTime] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y1 y1Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71011a;
        x1 x1Var = this.f71012b;
        if (i14 == 0) {
            o13.r.b(obj);
            xd2.a1 a1Var = x1Var.f71003c;
            ae2.e0 e0Var = x1Var.f71002b;
            long j8 = x1Var.f71001a;
            this.f71011a = 1;
            y1Var = this;
            obj = a1Var.E(e0Var, j8, this.f71013c, y1Var);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            y1Var = this;
        }
        boolean z14 = ((xd2.g1) obj) instanceof xd2.g1.b;
        p005kotlin.jvm.internal.r0<DateTime> r0Var = y1Var.f71014d;
        if (z14) {
            ?? PlusHours = y1Var.f71013c.plusHours(24);
            r0Var.f105810a = PlusHours;
            x1Var.f71005e.debug("Expanded live track session with 24 hours: new end time " + ((Object) PlusHours) + ".");
        } else {
            x1Var.f71005e.debug("Error expanding live track session with 24 hours.");
        }
        y1Var.f71015e.invoke(r0Var.f105810a);
        return Unit.INSTANCE;
    }
}
