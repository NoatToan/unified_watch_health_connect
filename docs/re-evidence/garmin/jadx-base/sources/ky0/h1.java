package ky0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$loadMultiDayActivityDetails$12", f = "MultiDayActivitiesDetailViewModel.kt", l = {502}, m = "invokeSuspend", v = 2)
public final class h1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f107352b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(w0 w0Var, t13.d<? super h1> dVar) {
        super(2, dVar);
        this.f107352b = w0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h1(this.f107352b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Boolean boolValueOf;
        String str;
        String sessionName;
        String url;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f107351a;
        w0 w0Var = this.f107352b;
        if (i14 == 0) {
            o13.r.b(obj);
            gy0.r0 r0Var = (gy0.r0) w0Var.E.getValue();
            String str2 = w0Var.f107579b;
            this.f107351a = 1;
            obj = r0Var.f80221a.n(str2, this);
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
        cy0.j jVar = (cy0.j) p13.h0.d0((List) obj);
        if (jVar != null) {
            p2 p2Var = w0Var.f107607o1;
            r53.b2 b2Var = w0Var.f107605n1;
            do {
                value = p2Var.getValue();
                sy0.h hVar = (sy0.h) value;
                boolValueOf = Boolean.valueOf(((sy0.k) w0Var.f107598k0.getValue()).f161242j);
                str = ((sy0.t) b2Var.f150540a.getValue()).f161282a;
                if (str == null && (str = ((sy0.t) b2Var.f150540a.getValue()).f161283b) == null) {
                    str = "";
                }
                sessionName = jVar.getSessionName();
                url = jVar.getUrl();
                hVar.getClass();
                sessionName.getClass();
                url.getClass();
            } while (!p2Var.b(value, new sy0.h(boolValueOf, str, sessionName, url)));
        }
        return Unit.INSTANCE;
    }
}
