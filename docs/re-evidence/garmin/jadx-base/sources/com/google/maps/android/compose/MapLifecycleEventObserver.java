package com.google.maps.android.compose;

import android.os.Bundle;
import com.google.android.gms.maps.MapView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/google/maps/android/compose/MapLifecycleEventObserver;", "Landroidx/lifecycle/k0;", "Lcom/google/android/gms/maps/MapView;", "mapView", "<init>", "(Lcom/google/android/gms/maps/MapView;)V", "Landroidx/lifecycle/b0$b;", "targetState", "", "moveToLifecycleState", "(Landroidx/lifecycle/b0$b;)V", "moveDown", "()V", "moveUp", "Landroidx/lifecycle/b0$a;", "event", "invokeEvent", "(Landroidx/lifecycle/b0$a;)V", "Landroidx/lifecycle/n0;", "source", "onStateChanged", "(Landroidx/lifecycle/n0;Landroidx/lifecycle/b0$a;)V", "moveToBaseState", "moveToDestroyedState", "Lcom/google/android/gms/maps/MapView;", "currentLifecycleState", "Landroidx/lifecycle/b0$b;", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class MapLifecycleEventObserver implements androidx.lifecycle.k0 {
    private androidx.lifecycle.b0.b currentLifecycleState;
    private final MapView mapView;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.lifecycle.b0.a.values().length];
            try {
                iArr[androidx.lifecycle.b0.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.b0.a.ON_CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.lifecycle.b0.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.lifecycle.b0.a.ON_RESUME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.lifecycle.b0.a.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.lifecycle.b0.a.ON_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MapLifecycleEventObserver(MapView mapView) {
        mapView.getClass();
        this.mapView = mapView;
        this.currentLifecycleState = androidx.lifecycle.b0.b.INITIALIZED;
    }

    private final void invokeEvent(androidx.lifecycle.b0.a event) {
        switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                this.mapView.onDestroy();
                break;
            case 2:
                this.mapView.onCreate(new Bundle());
                break;
            case 3:
                this.mapView.onStart();
                break;
            case 4:
                this.mapView.onResume();
                break;
            case 5:
                this.mapView.onPause();
                break;
            case 6:
                this.mapView.onStop();
                break;
            default:
                ds.e0.t(event, "Unsupported lifecycle event: ");
                return;
        }
        this.currentLifecycleState = event.a();
    }

    private final void moveDown() {
        androidx.lifecycle.b0.a.Companion companion = androidx.lifecycle.b0.a.INSTANCE;
        androidx.lifecycle.b0.b bVar = this.currentLifecycleState;
        companion.getClass();
        androidx.lifecycle.b0.a aVarA = androidx.lifecycle.b0.a.Companion.a(bVar);
        if (aVarA != null) {
            invokeEvent(aVarA);
        } else {
            androidx.core.view.j.x(this.currentLifecycleState, "no event down from ");
        }
    }

    private final void moveToLifecycleState(androidx.lifecycle.b0.b targetState) {
        while (true) {
            androidx.lifecycle.b0.b bVar = this.currentLifecycleState;
            if (bVar == targetState) {
                return;
            }
            if (bVar.compareTo(targetState) < 0) {
                moveUp();
            } else if (this.currentLifecycleState.compareTo(targetState) > 0) {
                moveDown();
            }
        }
    }

    private final void moveUp() {
        androidx.lifecycle.b0.a.Companion companion = androidx.lifecycle.b0.a.INSTANCE;
        androidx.lifecycle.b0.b bVar = this.currentLifecycleState;
        companion.getClass();
        androidx.lifecycle.b0.a aVarB = androidx.lifecycle.b0.a.Companion.b(bVar);
        if (aVarB != null) {
            invokeEvent(aVarB);
        } else {
            androidx.core.view.j.x(this.currentLifecycleState, "no event up from ");
        }
    }

    public final void moveToBaseState() {
        androidx.lifecycle.b0.b bVar = this.currentLifecycleState;
        androidx.lifecycle.b0.b bVar2 = androidx.lifecycle.b0.b.CREATED;
        if (bVar.compareTo(bVar2) > 0) {
            moveToLifecycleState(bVar2);
        }
    }

    public final void moveToDestroyedState() {
        if (this.currentLifecycleState.compareTo(androidx.lifecycle.b0.b.INITIALIZED) > 0) {
            moveToLifecycleState(androidx.lifecycle.b0.b.DESTROYED);
        }
    }

    @Override // androidx.lifecycle.k0
    public void onStateChanged(androidx.lifecycle.n0 source, androidx.lifecycle.b0.a event) {
        source.getClass();
        event.getClass();
        if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            moveToBaseState();
        } else {
            moveToLifecycleState(event.a());
        }
    }
}
