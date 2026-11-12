package o72;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.maps.android.compose.MapProperties;
import com.google.maps.android.compose.MapType;
import com.google.maps.android.compose.MapUiSettings;
import com.google.maps.android.compose.MarkerKt;
import com.google.maps.android.compose.MarkerState;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import v62.q5;
import v62.r4;

/* JADX INFO: loaded from: classes9.dex */
public final class o2 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.MapComponentsExample2Kt$MapComponentsExample2$1$1", f = "MapComponentsExample2.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.q<String[], Map<String, Boolean>> f130511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Boolean> f130512b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c.q<String[], Map<String, Boolean>> qVar, p3.p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f130511a = qVar;
            this.f130512b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f130511a, this.f130512b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (!this.f130512b.getF182175a().booleanValue()) {
                this.f130511a.a(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.MapComponentsExample2Kt$MapComponentsExample2$2$1$1", f = "MapComponentsExample2.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p3.p1<MapProperties> f130513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Boolean> f130514b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p3.p1<MapProperties> p1Var, p3.p1<Boolean> p1Var2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f130513a = p1Var;
            this.f130514b = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f130513a, this.f130514b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p3.p1<MapProperties> p1Var = this.f130513a;
            p1Var.setValue(MapProperties.copy$default(p1Var.getF182175a(), false, false, this.f130514b.getF182175a().booleanValue(), false, null, null, null, 0.0f, 0.0f, 507, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<CameraPositionState> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f130515a;

        public c(e23.l lVar) {
            this.f130515a = lVar;
        }

        @Override // e23.a
        public final CameraPositionState invoke() {
            CameraPositionState cameraPositionStateInvoke$default = CameraPositionState.Companion.invoke$default(CameraPositionState.INSTANCE, null, 1, null);
            this.f130515a.invoke(cameraPositionStateInvoke$default);
            return cameraPositionStateInvoke$default;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(2065368725);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = hb.a.n((a7.b.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) || (a7.b.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0), o0VarE);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            g.f fVar = new g.f();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new v1(p1Var, 24);
                o0VarE.K(objQ2);
            }
            c.q qVarC = c.w.c(fVar, (e23.l) objQ2, o0VarE, 48);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(qVarC);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new a(qVarC, p1Var, null);
                o0VarE.K(objQ3);
            }
            p3.l0.e((e23.p) objQ3, unit, o0VarE);
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            h4.r rVarF = c2.x2.f(aVar, 1.0f);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            LatLng latLng = new LatLng(1.35d, 103.87d);
            MarkerState markerStateRememberMarkerState = MarkerKt.rememberMarkerState(null, latLng, o0VarE, 0, 1);
            nw0.f fVar2 = new nw0.f(latLng, 10);
            o0VarE.C(-1911106014);
            CameraPositionState cameraPositionState = (CameraPositionState) d4.a.d(new Object[0], CameraPositionState.INSTANCE.getSaver(), null, new c(fVar2), o0VarE, 0, 0);
            o0VarE.g0(false);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(new MapUiSettings(true, false, false, false, false, false, false, false, false, false, 1022, null));
                o0VarE.K(objQ4);
            }
            p3.p1 p1Var2 = (p3.p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p3.p0.n(new MapProperties(true, true, ((Boolean) p1Var.getF182175a()).booleanValue(), true, null, null, MapType.NORMAL, 0.0f, 0.0f, 432, null));
                o0VarE.K(objQ5);
            }
            p3.p1 p1Var3 = (p3.p1) objQ5;
            Boolean bool = (Boolean) p1Var.getF182175a();
            bool.booleanValue();
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new b(p1Var3, p1Var, null);
                o0VarE.K(objQ6);
            }
            p3.l0.e((e23.p) objQ6, bool, o0VarE);
            GoogleMapKt.GoogleMap(c2.x2.d(aVar, 1.0f), false, cameraPositionState, null, null, (MapProperties) p1Var3.getF182175a(), null, (MapUiSettings) p1Var2.getF182175a(), null, null, null, null, null, null, null, null, null, z3.f.c(2114444725, new m92.f(markerStateRememberMarkerState, 17), o0VarE), o0VarE, (CameraPositionState.$stable << 6) | 6 | (MapProperties.$stable << 15) | (MapUiSettings.$stable << 21), 12582912, 130906);
            h4.r rVarY = c2.l.y(uVar.c(aVar, h4.d.a.f81526d), f14);
            s62.a.f157643a.getClass();
            t62.b bVar2 = t62.b.f162798a;
            u4.d dVarA = r4.a(bVar2);
            u4.d dVarA2 = q5.a(bVar2);
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = new i2(9);
                o0VarE.K(objQ7);
            }
            e23.a aVar4 = (e23.a) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = new i2(10);
                o0VarE.K(objQ8);
            }
            k82.c.b(rVarY, dVarA, aVar4, dVarA2, (e23.a) objQ8, o0VarE, 24960, 32);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(i14, 17);
        }
    }
}
