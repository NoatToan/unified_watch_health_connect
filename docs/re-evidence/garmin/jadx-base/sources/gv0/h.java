package gv0;

import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$completeSharingOptionsSetup$1", f = "LiveTrackSettingsViewModel.kt", l = {756}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f79273b;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3;", "Lou0/f;", "it", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/g3;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$completeSharingOptionsSetup$1$2", f = "LiveTrackSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<g3<? extends ou0.f>, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f79274a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f79274a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(g3<? extends ou0.f> g3Var, t13.d<? super Boolean> dVar) {
            return ((a) create(g3Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g3 g3Var = (g3) this.f79274a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return Boolean.valueOf(g3Var.f35300a != fw.p.LOADING);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, t13.d<? super h> dVar2) {
        super(2, dVar2);
        this.f79273b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f79273b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Boolean bool;
        Object value2;
        Boolean bool2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79272a;
        d dVar = this.f79273b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = dVar.f79200q;
            do {
                value = p2Var.getValue();
                g3.a aVar2 = g3.f35298f;
                bool = Boolean.FALSE;
                aVar2.getClass();
            } while (!p2Var.b(value, g3.a.b(bool)));
            if (dVar.D4() == 0) {
                dVar.N4(false);
            }
            b2 b2VarZ4 = dVar.Z4();
            a aVar3 = new a(null);
            this.f79272a = 1;
            if (r53.s.w(b2VarZ4, aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        dVar.f79184b.getF104144a().getClass();
        kg1.a.f104701a.getClass();
        kg1.a.C2003a.a().F(false);
        p2 p2Var2 = dVar.f79200q;
        do {
            value2 = p2Var2.getValue();
            g3.a aVar4 = g3.f35298f;
            bool2 = Boolean.TRUE;
            aVar4.getClass();
        } while (!p2Var2.b(value2, g3.a.d(bool2)));
        return Unit.INSTANCE;
    }
}
