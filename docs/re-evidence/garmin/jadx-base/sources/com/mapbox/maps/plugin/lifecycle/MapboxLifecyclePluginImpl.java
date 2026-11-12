package com.mapbox.maps.plugin.lifecycle;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import androidx.lifecycle.a1;
import androidx.lifecycle.b0;
import androidx.lifecycle.m0;
import com.mapbox.maps.MapboxLifecycleObserver;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/plugin/lifecycle/MapboxLifecyclePluginImpl;", "Lcom/mapbox/maps/plugin/lifecycle/MapboxLifecyclePlugin;", "()V", "registerLifecycleObserver", "", "mapView", "Landroid/view/View;", "observer", "Lcom/mapbox/maps/MapboxLifecycleObserver;", "Companion", "plugin-lifecycle_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapboxLifecyclePluginImpl implements MapboxLifecyclePlugin {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "MapboxLifecyclePlugin";

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        MapboxLifecyclePlugin.DefaultImpls.cleanup(this);
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        MapboxLifecyclePlugin.DefaultImpls.initialize(this);
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(MapDelegateProvider mapDelegateProvider) {
        MapboxLifecyclePlugin.DefaultImpls.onDelegateProvider(this, mapDelegateProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.ComponentCallbacks, com.mapbox.maps.plugin.lifecycle.MapboxLifecyclePluginImpl$registerLifecycleObserver$componentCallback$1] */
    @Override // com.mapbox.maps.plugin.lifecycle.MapboxLifecyclePlugin
    public void registerLifecycleObserver(final View mapView, final MapboxLifecycleObserver observer) {
        mapView.getClass();
        observer.getClass();
        final ViewLifecycleOwner viewLifecycleOwner = new ViewLifecycleOwner(mapView);
        MapboxLogger.logI(TAG, "registerLifecycleObserver is called");
        final ?? r14 = new ComponentCallbacks2() { // from class: com.mapbox.maps.plugin.lifecycle.MapboxLifecyclePluginImpl$registerLifecycleObserver$componentCallback$1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration newConfig) {
                newConfig.getClass();
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
                observer.onLowMemory();
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int level) {
                if (level == 10 || level == 15) {
                    MapboxLogger.logW("MapboxLifecyclePlugin", "onTrimMemory with level " + level + " is received, reduceMemoryUse will be called.");
                    observer.onLowMemory();
                }
            }
        };
        mapView.getContext().registerComponentCallbacks(r14);
        viewLifecycleOwner.getF158017a().a(new m0() { // from class: com.mapbox.maps.plugin.lifecycle.MapboxLifecyclePluginImpl.registerLifecycleObserver.1
            @a1(b0.a.ON_DESTROY)
            public final void onDestroy() {
                MapboxLogger.logI(MapboxLifecyclePluginImpl.TAG, "onDestroy is called, MapboxLifecycleObserver will be notified.");
                observer.onDestroy();
                viewLifecycleOwner.getF158017a().d(this);
                viewLifecycleOwner.cleanUp();
                mapView.getContext().unregisterComponentCallbacks(r14);
            }

            @a1(b0.a.ON_RESUME)
            public final void onResume() {
                MapboxLogger.logI(MapboxLifecyclePluginImpl.TAG, "onResume is called, MapboxLifecycleObserver will be notified.");
                observer.onResume();
            }

            @a1(b0.a.ON_START)
            public final void onStart() {
                MapboxLogger.logI(MapboxLifecyclePluginImpl.TAG, "onStart is called, MapboxLifecycleObserver will be notified.");
                observer.onStart();
            }

            @a1(b0.a.ON_STOP)
            public final void onStop() {
                MapboxLogger.logI(MapboxLifecyclePluginImpl.TAG, "onStop is called, MapboxLifecycleObserver will be notified.");
                observer.onStop();
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/plugin/lifecycle/MapboxLifecyclePluginImpl$Companion;", "", "()V", "TAG", "", "plugin-lifecycle_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }
}
