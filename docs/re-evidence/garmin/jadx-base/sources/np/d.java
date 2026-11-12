package np;

import ch.qos.logback.core.net.SyslogConstants;
import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.presentation.ActivityReportsPagerViewModel$deleteActivity$1", f = "ActivityReportsPagerViewModel.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f126815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f126816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f126817d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.a implements l<t13.d<? super Unit>, Object> {
        public a(Object obj) {
            super(1, obj, c.class, "refreshData", "refreshData()V", 4);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            ((c) this.receiver).x4();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, long j8, String str, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f126815b = cVar;
        this.f126816c = j8;
        this.f126817d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f126815b, this.f126816c, this.f126817d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126814a;
        c cVar = this.f126815b;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = cVar.f126788f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, qp.d.a((qp.d) value, true, false, null, null, null, null, null, null, 509)));
            lp.a aVar2 = cVar.f126783a;
            a aVar3 = new a(cVar);
            this.f126814a = 1;
            obj = aVar2.a(this.f126816c, aVar3, this);
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
        if (((Boolean) obj).booleanValue()) {
            p2 p2Var2 = cVar.f126788f;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, qp.d.a((qp.d) value3, false, true, this.f126817d, null, null, null, null, null, 497)));
        } else {
            p2 p2Var3 = cVar.f126788f;
            do {
                value2 = p2Var3.getValue();
            } while (!p2Var3.b(value2, qp.d.a((qp.d) value2, false, false, null, null, null, null, null, null, 509)));
        }
        return Unit.INSTANCE;
    }
}
