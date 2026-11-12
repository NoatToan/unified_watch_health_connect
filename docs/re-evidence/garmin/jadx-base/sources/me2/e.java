package me2;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.compose.CameraPositionState;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lme2/e;", "Lje2/b;", "Lcom/google/maps/android/compose/CameraPositionState;", "Lje2/a;", "cameraSettings", "<init>", "(Lje2/a;)V", "a", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends je2.b<CameraPositionState> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f118163c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d4.l f118164d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.library.mapsdkadapter.google.GoogleCameraStateAdapter", f = "GoogleCameraStateAdapter.kt", l = {99}, m = "rotateMapToNorth", v = 1)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f118165a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f118167c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f118165a = obj;
            this.f118167c |= Integer.MIN_VALUE;
            return e.this.h(this);
        }
    }

    static {
        m72.o oVar = new m72.o(23);
        m30.n nVar = new m30.n(27);
        d4.l lVar = d4.m.f57455a;
        f118164d = new d4.l(oVar, nVar);
    }

    public /* synthetic */ e(je2.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new je2.a(null, 0.0f, 0.0f, 0.0f, 15, null) : aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // je2.b
    public final Object c(List<ke2.b> list, e23.l<? super Boolean, Unit> lVar, t13.d<? super Unit> dVar) throws Throwable {
        LatLngBounds.Builder builder = LatLngBounds.builder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            builder.include(ke2.c.c((ke2.b) it.next()));
        }
        LatLngBounds latLngBoundsBuild = builder.build();
        latLngBoundsBuild.getClass();
        CameraPositionState cameraPositionState = (CameraPositionState) this.f98598b;
        if (cameraPositionState == null) {
            return Unit.INSTANCE;
        }
        CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(latLngBoundsBuild, 0);
        cameraUpdateNewLatLngBounds.getClass();
        Object objAnimate = cameraPositionState.animate(cameraUpdateNewLatLngBounds, 500, dVar);
        return objAnimate == u13.a.COROUTINE_SUSPENDED ? objAnimate : Unit.INSTANCE;
    }

    @Override // je2.b
    public final z3.e d(h4.r rVar, ie2.l lVar, le2.b bVar, boolean z14, boolean z15, boolean z16, e23.l lVar2, e23.r rVar2, e23.l lVar3) {
        rVar.getClass();
        bVar.getClass();
        return new z3.e(1729681688, true, new c(rVar, (je2.b) this, lVar, bVar, z14, z15, z16, lVar2, rVar2, lVar3, 0));
    }

    @Override // je2.b
    public final z3.e e(h4.r rVar, i53.c cVar, i53.c cVar2, List list, int i14, boolean z14, e23.a aVar, boolean z15, e23.l lVar) {
        rVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        list.getClass();
        return new z3.e(2053221473, true, new me2.b(rVar, this, cVar, cVar2, list, i14, z14, aVar, lVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // je2.b
    public final Object f(List<ke2.b> list, t13.d<? super Unit> dVar) {
        LatLngBounds.Builder builder = LatLngBounds.builder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            builder.include(ke2.c.c((ke2.b) it.next()));
        }
        LatLngBounds latLngBoundsBuild = builder.build();
        latLngBoundsBuild.getClass();
        CameraPositionState cameraPositionState = (CameraPositionState) this.f98598b;
        if (cameraPositionState != null) {
            CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(latLngBoundsBuild, 100);
            cameraUpdateNewLatLngBounds.getClass();
            cameraPositionState.move(cameraUpdateNewLatLngBounds);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // je2.b
    public final Unit g(ke2.b bVar) {
        CameraPositionState cameraPositionState = (CameraPositionState) this.f98598b;
        if (cameraPositionState != null) {
            CameraUpdate cameraUpdateNewLatLng = CameraUpdateFactory.newLatLng(ke2.c.c(bVar));
            cameraUpdateNewLatLng.getClass();
            cameraPositionState.move(cameraUpdateNewLatLng);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // je2.b
    public final Object h(t13.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f118167c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f118167c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f118165a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar2.f118167c;
        if (i15 == 0) {
            o13.r.b(obj);
            CameraPositionState cameraPositionState = (CameraPositionState) this.f98598b;
            if (cameraPositionState != null) {
                CameraPosition cameraPositionBuild = CameraPosition.builder(cameraPositionState.getPosition()).bearing(0.0f).build();
                cameraPositionBuild.getClass();
                CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(cameraPositionBuild);
                cameraUpdateNewCameraPosition.getClass();
                bVar2.f118167c = 1;
                if (CameraPositionState.animate$default(cameraPositionState, cameraUpdateNewCameraPosition, 0, bVar2, 2, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // je2.b
    public final void j(je2.a aVar) {
        aVar.getClass();
        CameraPositionState cameraPositionState = (CameraPositionState) this.f98598b;
        if (cameraPositionState != null) {
            CameraPosition.Builder builder = CameraPosition.builder(cameraPositionState.getPosition());
            builder.target(aVar.f98593a);
            builder.zoom(aVar.f98594b);
            CameraPosition cameraPositionBuild = builder.build();
            cameraPositionBuild.getClass();
            cameraPositionState.setPosition(cameraPositionBuild);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object k(ke2.b bVar, Double d14, e23.l lVar, v13.i iVar) {
        Object objAnimate;
        CameraUpdate cameraUpdateNewLatLngZoom = CameraUpdateFactory.newLatLngZoom(ke2.c.c(bVar), ((float) d14.doubleValue()) + 1.0f);
        cameraUpdateNewLatLngZoom.getClass();
        CameraPositionState cameraPositionState = (CameraPositionState) this.f98598b;
        return (cameraPositionState == null || (objAnimate = cameraPositionState.animate(cameraUpdateNewLatLngZoom, 500, iVar)) != u13.a.COROUTINE_SUSPENDED) ? Unit.INSTANCE : objAnimate;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lme2/e$a;", "", "<init>", "()V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(je2.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
