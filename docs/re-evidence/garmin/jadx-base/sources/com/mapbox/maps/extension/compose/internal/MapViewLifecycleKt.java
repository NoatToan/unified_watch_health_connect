package com.mapbox.maps.extension.compose.internal;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import com.mapbox.maps.MapView;
import e23.l;
import e23.p;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.h0;
import p3.i0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/MapView;", "mapView", "", "MapViewLifecycle", "(Lcom/mapbox/maps/MapView;Lp3/m;I)V", "Landroidx/lifecycle/k0;", "lifecycleEventObserver", "(Lcom/mapbox/maps/MapView;)Landroidx/lifecycle/k0;", "Landroid/content/ComponentCallbacks2;", "componentCallbacks2", "(Lcom/mapbox/maps/MapView;)Landroid/content/ComponentCallbacks2;", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MapViewLifecycleKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.internal.MapViewLifecycleKt$MapViewLifecycle$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<i0, h0> {
        final /* synthetic */ Context $context;
        final /* synthetic */ b0 $lifecycle;
        final /* synthetic */ MapView $mapView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MapView mapView, b0 b0Var, Context context) {
            super(1);
            this.$mapView = mapView;
            this.$lifecycle = b0Var;
            this.$context = context;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            final k0 k0VarLifecycleEventObserver = MapViewLifecycleKt.lifecycleEventObserver(this.$mapView);
            final ComponentCallbacks2 componentCallbacks2 = MapViewLifecycleKt.componentCallbacks2(this.$mapView);
            this.$lifecycle.a(k0VarLifecycleEventObserver);
            this.$context.registerComponentCallbacks(componentCallbacks2);
            final b0 b0Var = this.$lifecycle;
            final Context context = this.$context;
            return new h0() { // from class: com.mapbox.maps.extension.compose.internal.MapViewLifecycleKt$MapViewLifecycle$1$invoke$$inlined$onDispose$1
                @Override // p3.h0
                public void dispose() {
                    b0Var.d(k0VarLifecycleEventObserver);
                    context.unregisterComponentCallbacks(componentCallbacks2);
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.internal.MapViewLifecycleKt$MapViewLifecycle$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements l<i0, h0> {
        final /* synthetic */ MapView $mapView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MapView mapView) {
            super(1);
            this.$mapView = mapView;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            final MapView mapView = this.$mapView;
            return new h0() { // from class: com.mapbox.maps.extension.compose.internal.MapViewLifecycleKt$MapViewLifecycle$2$invoke$$inlined$onDispose$1
                @Override // p3.h0
                public void dispose() {
                    mapView.onDestroy();
                    mapView.removeAllViews();
                }
            };
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b0.a.values().length];
            try {
                iArr[b0.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b0.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b0.a.ON_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b0.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b0.a.ON_RESUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SuppressLint({"Lifecycle"})
    public static final void MapViewLifecycle(MapView mapView, m mVar, int i14) {
        mapView.getClass();
        o0 o0VarE = mVar.E(-183515956);
        x1 x1Var = n.f135158a;
        Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
        b0 viewLifecycleRegistry = ((n0) o0VarE.A(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getF158016a();
        viewLifecycleRegistry.getClass();
        l0.c(context, viewLifecycleRegistry, mapView, new AnonymousClass1(mapView, viewLifecycleRegistry, context), o0VarE);
        l0.a(mapView, new AnonymousClass2(mapView), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass3(mapView, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentCallbacks2 componentCallbacks2(final MapView mapView) {
        return new ComponentCallbacks2() { // from class: com.mapbox.maps.extension.compose.internal.MapViewLifecycleKt.componentCallbacks2.1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration config) {
                config.getClass();
            }

            @Override // android.content.ComponentCallbacks
            @SuppressLint({"Lifecycle"})
            public void onLowMemory() {
                mapView.onLowMemory();
            }

            @Override // android.content.ComponentCallbacks2
            @SuppressLint({"Lifecycle"})
            public void onTrimMemory(int level) {
                if (level == 10 || level == 15) {
                    mapView.onLowMemory();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Lifecycle"})
    public static final k0 lifecycleEventObserver(MapView mapView) {
        return new a0(mapView, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleEventObserver$lambda$0(MapView mapView, n0 n0Var, b0.a aVar) {
        mapView.getClass();
        n0Var.getClass();
        aVar.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                mapView.onStart();
                break;
            case 5:
                mapView.onStop();
                break;
            case 6:
                mapView.onResume();
                break;
            default:
                x.h();
                break;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.internal.MapViewLifecycleKt$MapViewLifecycle$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass3 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MapView $mapView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MapView mapView, int i14) {
            super(2);
            this.$mapView = mapView;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            MapViewLifecycleKt.MapViewLifecycle(this.$mapView, mVar, this.$$changed | 1);
        }
    }
}
