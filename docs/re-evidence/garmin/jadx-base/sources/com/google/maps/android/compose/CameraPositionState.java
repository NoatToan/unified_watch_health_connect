package com.google.maps.android.compose;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.concurrent.CancellationException;
import o13.r;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 G2\u00020\u0001:\u0002HGB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0087@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR+\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010*\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020$8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010/\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u0005R\u0014\u00100\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001f\u001a\u0004\b3\u00104\"\u0004\b\u000b\u0010\nR/\u00109\u001a\u0004\u0018\u00010\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u0017R/\u0010?\u001a\u0004\u0018\u00010\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u001f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0013\u0010C\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010-\"\u0004\bF\u0010\u0005¨\u0006I"}, d2 = {"Lcom/google/maps/android/compose/CameraPositionState;", "", "Lcom/google/android/gms/maps/model/CameraPosition;", ModelSourceWrapper.POSITION, "<init>", "(Lcom/google/android/gms/maps/model/CameraPosition;)V", "Lcom/google/android/gms/maps/GoogleMap;", "map", "", "setMap$maps_compose_release", "(Lcom/google/android/gms/maps/GoogleMap;)V", "setMap", "Lcom/google/android/gms/maps/CameraUpdate;", "update", "", "durationMs", "animate", "(Lcom/google/android/gms/maps/CameraUpdate;ILt13/d;)Ljava/lang/Object;", "move", "(Lcom/google/android/gms/maps/CameraUpdate;)V", "Lcom/google/maps/android/compose/CameraPositionState$OnMapChangedCallback;", "callback", "doOnMapChangedLocked", "(Lcom/google/maps/android/compose/CameraPositionState$OnMapChangedCallback;)V", "Lo53/j;", "continuation", "performAnimateCameraLocked", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/CameraUpdate;ILo53/j;)V", "", "<set-?>", "isMoving$delegate", "Lp3/p1;", "isMoving", "()Z", "setMoving$maps_compose_release", "(Z)V", "Lcom/google/maps/android/compose/CameraMoveStartedReason;", "cameraMoveStartedReason$delegate", "getCameraMoveStartedReason", "()Lcom/google/maps/android/compose/CameraMoveStartedReason;", "setCameraMoveStartedReason$maps_compose_release", "(Lcom/google/maps/android/compose/CameraMoveStartedReason;)V", "cameraMoveStartedReason", "rawPosition$delegate", "getRawPosition$maps_compose_release", "()Lcom/google/android/gms/maps/model/CameraPosition;", "setRawPosition$maps_compose_release", "rawPosition", "lock", "Lkotlin/Unit;", "map$delegate", "getMap", "()Lcom/google/android/gms/maps/GoogleMap;", "onMapChanged$delegate", "getOnMapChanged", "()Lcom/google/maps/android/compose/CameraPositionState$OnMapChangedCallback;", "setOnMapChanged", "onMapChanged", "movementOwner$delegate", "getMovementOwner", "()Ljava/lang/Object;", "setMovementOwner", "(Ljava/lang/Object;)V", "movementOwner", "Lcom/google/android/gms/maps/Projection;", "getProjection", "()Lcom/google/android/gms/maps/Projection;", "projection", "value", "getPosition", "setPosition", "Companion", "OnMapChangedCallback", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraPositionState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final d4.k<CameraPositionState, CameraPosition> Saver;

    /* JADX INFO: renamed from: cameraMoveStartedReason$delegate, reason: from kotlin metadata */
    private final p1 cameraMoveStartedReason;

    /* JADX INFO: renamed from: isMoving$delegate, reason: from kotlin metadata */
    private final p1 isMoving;
    private final Unit lock;

    /* JADX INFO: renamed from: map$delegate, reason: from kotlin metadata */
    private final p1 map;

    /* JADX INFO: renamed from: movementOwner$delegate, reason: from kotlin metadata */
    private final p1 movementOwner;

    /* JADX INFO: renamed from: onMapChanged$delegate, reason: from kotlin metadata */
    private final p1 onMapChanged;

    /* JADX INFO: renamed from: rawPosition$delegate, reason: from kotlin metadata */
    private final p1 rawPosition;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/maps/android/compose/CameraPositionState$OnMapChangedCallback;", "", "onMapChangedLocked", "", "newMap", "Lcom/google/android/gms/maps/GoogleMap;", "onCancelLocked", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnMapChangedCallback {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void onCancelLocked(OnMapChangedCallback onMapChangedCallback) {
            }
        }

        void onCancelLocked();

        void onMapChangedLocked(GoogleMap newMap);
    }

    /* JADX INFO: renamed from: com.google.maps.android.compose.CameraPositionState$animate$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.google.maps.android.compose.CameraPositionState", f = "CameraPositionState.kt", l = {335}, m = "animate")
    public static final class AnonymousClass1 extends v13.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(t13.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CameraPositionState.this.animate(null, 0, this);
        }
    }

    static {
        q0 q0Var = new q0(5);
        a aVar = new a(0);
        d4.l lVar = d4.m.f57455a;
        Saver = new d4.l(q0Var, aVar);
    }

    private CameraPositionState(CameraPosition cameraPosition) {
        this.isMoving = p3.p0.n(Boolean.FALSE);
        this.cameraMoveStartedReason = p3.p0.n(CameraMoveStartedReason.NO_MOVEMENT_YET);
        this.rawPosition = p3.p0.n(cameraPosition);
        this.lock = Unit.INSTANCE;
        this.map = p3.p0.n(null);
        this.onMapChanged = p3.p0.n(null);
        this.movementOwner = p3.p0.n(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraPosition Saver$lambda$7(d4.n nVar, CameraPositionState cameraPositionState) {
        nVar.getClass();
        cameraPositionState.getClass();
        return cameraPositionState.getPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraPositionState Saver$lambda$8(CameraPosition cameraPosition) {
        cameraPosition.getClass();
        return new CameraPositionState(cameraPosition);
    }

    public static /* synthetic */ Object animate$default(CameraPositionState cameraPositionState, CameraUpdate cameraUpdate, int i14, t13.d dVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i14 = Integer.MAX_VALUE;
        }
        return cameraPositionState.animate(cameraUpdate, i14, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doOnMapChangedLocked(OnMapChangedCallback callback) {
        OnMapChangedCallback onMapChanged = getOnMapChanged();
        if (onMapChanged != null) {
            onMapChanged.onCancelLocked();
        }
        setOnMapChanged(callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final GoogleMap getMap() {
        return (GoogleMap) this.map.getF182175a();
    }

    private final Object getMovementOwner() {
        return this.movementOwner.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnMapChangedCallback getOnMapChanged() {
        return (OnMapChangedCallback) this.onMapChanged.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performAnimateCameraLocked(final GoogleMap map, CameraUpdate update, int durationMs, final o53.j<? super Unit> continuation) {
        GoogleMap.CancelableCallback cancelableCallback = new GoogleMap.CancelableCallback() { // from class: com.google.maps.android.compose.CameraPositionState$performAnimateCameraLocked$cancelableCallback$1
            @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
            public void onCancel() {
                o53.j<Unit> jVar = continuation;
                int i14 = o13.q.f128596b;
                jVar.resumeWith(new o13.q.b(new CancellationException("Animation cancelled")));
            }

            @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
            public void onFinish() {
                o53.j<Unit> jVar = continuation;
                int i14 = o13.q.f128596b;
                jVar.resumeWith(Unit.INSTANCE);
            }
        };
        if (durationMs == Integer.MAX_VALUE) {
            map.animateCamera(update, cancelableCallback);
        } else {
            map.animateCamera(update, durationMs, cancelableCallback);
        }
        doOnMapChangedLocked(new OnMapChangedCallback() { // from class: com.google.maps.android.compose.CameraPositionState.performAnimateCameraLocked.1
            @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
            public void onCancelLocked() {
                OnMapChangedCallback.DefaultImpls.onCancelLocked(this);
            }

            @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
            public final void onMapChangedLocked(GoogleMap googleMap) {
                if (googleMap == null) {
                    map.stopAnimation();
                } else {
                    vb.h.z("New GoogleMap unexpectedly set while an animation was still running");
                }
            }
        });
    }

    private final void setMap(GoogleMap googleMap) {
        this.map.setValue(googleMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMovementOwner(Object obj) {
        this.movementOwner.setValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOnMapChanged(OnMapChangedCallback onMapChangedCallback) {
        this.onMapChanged.setValue(onMapChangedCallback);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009c A[Catch: all -> 0x00a9, TryCatch #4 {, blocks: (B:35:0x0096, B:37:0x009c, B:39:0x00a5), top: B:72:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #4 {, blocks: (B:35:0x0096, B:37:0x009c, B:39:0x00a5), top: B:72:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3 A[Catch: all -> 0x00d0, TryCatch #1 {all -> 0x00d0, blocks: (B:54:0x00bd, B:56:0x00c3, B:58:0x00cc, B:61:0x00d2), top: B:67:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc A[Catch: all -> 0x00d0, TryCatch #1 {all -> 0x00d0, blocks: (B:54:0x00bd, B:56:0x00c3, B:58:0x00cc, B:61:0x00d2), top: B:67:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.maps.android.compose.CameraPositionState$OnMapChangedCallback, com.google.maps.android.compose.CameraPositionState$animate$2$1$animateOnMapAvailable$1] */
    public final Object animate(final CameraUpdate cameraUpdate, final int i14, t13.d<? super Unit> dVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Throwable th3;
        l1 l1Var;
        CameraPositionState cameraPositionState;
        GoogleMap map;
        GoogleMap map2;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i15 = anonymousClass1.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i15 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = anonymousClass1.label;
        if (i16 != 0) {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l1Var = (l1) anonymousClass1.L$2;
            cameraPositionState = (CameraPositionState) anonymousClass1.L$0;
            try {
                r.b(obj);
                synchronized (cameraPositionState.lock) {
                    if (l1Var != null) {
                        if (cameraPositionState.getMovementOwner() == l1Var) {
                            cameraPositionState.setMovementOwner(null);
                            map2 = cameraPositionState.getMap();
                            if (map2 != null) {
                                map2.stopAnimation();
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                th3 = th4;
                synchronized (cameraPositionState.lock) {
                    if (l1Var != null) {
                        try {
                            if (cameraPositionState.getMovementOwner() == l1Var) {
                                cameraPositionState.setMovementOwner(null);
                                map = cameraPositionState.getMap();
                                if (map != null) {
                                    map.stopAnimation();
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    throw th3;
                }
            }
        }
        r.b(obj);
        l1 l1Var2 = (l1) anonymousClass1.getF129302c().get(l1.f129368i0);
        try {
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = cameraUpdate;
            anonymousClass1.L$2 = l1Var2;
            anonymousClass1.I$0 = i14;
            anonymousClass1.label = 1;
            final o53.k kVar = new o53.k(u13.f.b(anonymousClass1), 1);
            kVar.q();
            this.lock;
            synchronized (Unit.INSTANCE) {
                try {
                    setMovementOwner(l1Var2);
                    GoogleMap map3 = getMap();
                    if (map3 == null) {
                        final ?? r14 = new OnMapChangedCallback() { // from class: com.google.maps.android.compose.CameraPositionState$animate$2$1$animateOnMapAvailable$1
                            @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
                            public void onCancelLocked() {
                                o53.j<Unit> jVar = kVar;
                                int i17 = o13.q.f128596b;
                                jVar.resumeWith(new o13.q.b(new CancellationException("Animation cancelled")));
                            }

                            @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
                            public void onMapChangedLocked(GoogleMap newMap) {
                                if (newMap != null) {
                                    this.performAnimateCameraLocked(newMap, cameraUpdate, i14, kVar);
                                    return;
                                }
                                o53.j<Unit> jVar = kVar;
                                int i17 = o13.q.f128596b;
                                jVar.resumeWith(new o13.q.b(new CancellationException("internal error; no GoogleMap available")));
                                vb.h.z("internal error; no GoogleMap available to animate position");
                            }
                        };
                        doOnMapChangedLocked(r14);
                        kVar.r(new e23.l<Throwable, Unit>() { // from class: com.google.maps.android.compose.CameraPositionState$animate$2$1$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable th6) {
                                this.this$0.lock;
                                Unit unit2 = Unit.INSTANCE;
                                CameraPositionState cameraPositionState2 = this.this$0;
                                CameraPositionState$animate$2$1$animateOnMapAvailable$1 cameraPositionState$animate$2$1$animateOnMapAvailable$1 = r14;
                                synchronized (unit2) {
                                    if (cameraPositionState2.getOnMapChanged() == cameraPositionState$animate$2$1$animateOnMapAvailable$1) {
                                        cameraPositionState2.setOnMapChanged(null);
                                    }
                                }
                            }

                            @Override // e23.l
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th6) {
                                invoke2(th6);
                                return Unit.INSTANCE;
                            }
                        });
                    } else {
                        performAnimateCameraLocked(map3, cameraUpdate, i14, kVar);
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            if (kVar.p() == aVar) {
                return aVar;
            }
            cameraPositionState = this;
            l1Var = l1Var2;
            synchronized (cameraPositionState.lock) {
                if (l1Var != null) {
                    if (cameraPositionState.getMovementOwner() == l1Var) {
                        cameraPositionState.setMovementOwner(null);
                        map2 = cameraPositionState.getMap();
                        if (map2 != null) {
                            map2.stopAnimation();
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        } catch (Throwable th7) {
            th3 = th7;
            l1Var = l1Var2;
            cameraPositionState = this;
            synchronized (cameraPositionState.lock) {
                if (l1Var != null) {
                    if (cameraPositionState.getMovementOwner() == l1Var) {
                        cameraPositionState.setMovementOwner(null);
                        map = cameraPositionState.getMap();
                        if (map != null) {
                            map.stopAnimation();
                        }
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            }
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CameraMoveStartedReason getCameraMoveStartedReason() {
        return (CameraMoveStartedReason) this.cameraMoveStartedReason.getF182175a();
    }

    public final CameraPosition getPosition() {
        return getRawPosition$maps_compose_release();
    }

    public final Projection getProjection() {
        GoogleMap map = getMap();
        if (map != null) {
            return map.getProjection();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CameraPosition getRawPosition$maps_compose_release() {
        return (CameraPosition) this.rawPosition.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isMoving() {
        return ((Boolean) this.isMoving.getF182175a()).booleanValue();
    }

    public final void move(final CameraUpdate update) {
        update.getClass();
        synchronized (this.lock) {
            try {
                GoogleMap map = getMap();
                setMovementOwner(null);
                if (map == null) {
                    doOnMapChangedLocked(new OnMapChangedCallback() { // from class: com.google.maps.android.compose.CameraPositionState$move$1$1
                        @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
                        public void onCancelLocked() {
                            CameraPositionState.OnMapChangedCallback.DefaultImpls.onCancelLocked(this);
                        }

                        @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
                        public final void onMapChangedLocked(GoogleMap googleMap) {
                            if (googleMap != null) {
                                googleMap.moveCamera(update);
                            }
                        }
                    });
                } else {
                    map.moveCamera(update);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void setCameraMoveStartedReason$maps_compose_release(CameraMoveStartedReason cameraMoveStartedReason) {
        cameraMoveStartedReason.getClass();
        this.cameraMoveStartedReason.setValue(cameraMoveStartedReason);
    }

    public final void setMap$maps_compose_release(GoogleMap map) {
        synchronized (this.lock) {
            try {
                if (getMap() == null && map == null) {
                    return;
                }
                if (getMap() != null && map != null) {
                    throw new IllegalStateException("CameraPositionState may only be associated with one GoogleMap at a time");
                }
                setMap(map);
                if (map == null) {
                    setMoving$maps_compose_release(false);
                } else {
                    map.moveCamera(CameraUpdateFactory.newCameraPosition(getPosition()));
                }
                OnMapChangedCallback onMapChanged = getOnMapChanged();
                if (onMapChanged != null) {
                    setOnMapChanged(null);
                    onMapChanged.onMapChangedLocked(map);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void setMoving$maps_compose_release(boolean z14) {
        this.isMoving.setValue(Boolean.valueOf(z14));
    }

    public final void setPosition(CameraPosition cameraPosition) {
        cameraPosition.getClass();
        synchronized (this.lock) {
            try {
                GoogleMap map = getMap();
                if (map == null) {
                    setRawPosition$maps_compose_release(cameraPosition);
                } else {
                    map.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void setRawPosition$maps_compose_release(CameraPosition cameraPosition) {
        cameraPosition.getClass();
        this.rawPosition.setValue(cameraPosition);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\bR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/maps/android/compose/CameraPositionState$Companion;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/CameraPosition;", ModelSourceWrapper.POSITION, "Lcom/google/maps/android/compose/CameraPositionState;", "invoke", "(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/maps/android/compose/CameraPositionState;", "Ld4/k;", "Saver", "Ld4/k;", "getSaver", "()Ld4/k;", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static /* synthetic */ CameraPositionState invoke$default(Companion companion, CameraPosition cameraPosition, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                cameraPosition = new CameraPosition(new LatLng(0.0d, 0.0d), 0.0f, 0.0f, 0.0f);
            }
            return companion.invoke(cameraPosition);
        }

        public final d4.k<CameraPositionState, CameraPosition> getSaver() {
            return CameraPositionState.Saver;
        }

        public final CameraPositionState invoke(CameraPosition position) {
            position.getClass();
            return new CameraPositionState(position, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CameraPositionState(CameraPosition cameraPosition, p005kotlin.jvm.internal.j jVar) {
        this(cameraPosition);
    }

    public /* synthetic */ CameraPositionState(CameraPosition cameraPosition, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new CameraPosition(new LatLng(0.0d, 0.0d), 0.0f, 0.0f, 0.0f) : cameraPosition);
    }
}
