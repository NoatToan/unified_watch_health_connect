package mt1;

import ch.qos.logback.core.net.SyslogConstants;
import e23.p;
import i3.fe;
import i3.se;
import l72.d3;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pt1.k;
import r53.a2;
import r53.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.navigation.GarminTrailsNavHostKt$GarminTrailsNavHost$5$1", f = "GarminTrailsNavHost.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qt1.a f120973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe f120974c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpt1/k;", "snackbarDataState", "", "<anonymous>", "(Lpt1/k;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.navigation.GarminTrailsNavHostKt$GarminTrailsNavHost$5$1$1", f = "GarminTrailsNavHost.kt", l = {139}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<k, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f120975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f120976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fe f120977c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fe feVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f120977c = feVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f120977c, dVar);
            aVar.f120976b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(k kVar, t13.d<? super Unit> dVar) {
            return ((a) create(kVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            e23.a<Unit> aVar;
            k kVar = (k) this.f120976b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f120975a;
            if (i14 == 0) {
                r.b(obj);
                String str = kVar.f140871a;
                if (str != null) {
                    String str2 = kVar.f140872b;
                    this.f120976b = kVar;
                    this.f120975a = 1;
                    obj = d3.c(this.f120977c, str, str2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            if (((se) obj) == se.ActionPerformed && (aVar = kVar.f140873c) != null) {
                aVar.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qt1.a aVar, fe feVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f120973b = aVar;
        this.f120974c = feVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f120973b, this.f120974c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120972a;
        if (i14 == 0) {
            r.b(obj);
            a2 a2Var = this.f120973b.f147509x;
            a aVar2 = new a(this.f120974c, null);
            this.f120972a = 1;
            if (s.k(a2Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
