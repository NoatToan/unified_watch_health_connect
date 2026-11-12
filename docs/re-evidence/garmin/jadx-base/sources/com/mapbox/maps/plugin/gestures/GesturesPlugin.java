package com.mapbox.maps.plugin.gestures;

import android.view.MotionEvent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.maps.plugin.ContextBinder;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.MapSizePlugin;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H&J\u0012\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010#H&J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010(\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0011H&J\u0010\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0014H&J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0017H&J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u001aH&J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH&J \u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020!H&¨\u00063"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "Lcom/mapbox/maps/plugin/MapPlugin;", "Lcom/mapbox/maps/plugin/ContextBinder;", "Lcom/mapbox/maps/plugin/MapSizePlugin;", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettingsInterface;", "addOnFlingListener", "", "onFlingListener", "Lcom/mapbox/maps/plugin/gestures/OnFlingListener;", "addOnMapClickListener", "onMapClickListener", "Lcom/mapbox/maps/plugin/gestures/OnMapClickListener;", "addOnMapLongClickListener", "onMapLongClickListener", "Lcom/mapbox/maps/plugin/gestures/OnMapLongClickListener;", "addOnMoveListener", "onMoveListener", "Lcom/mapbox/maps/plugin/gestures/OnMoveListener;", "addOnRotateListener", "onRotateListener", "Lcom/mapbox/maps/plugin/gestures/OnRotateListener;", "addOnScaleListener", "onScaleListener", "Lcom/mapbox/maps/plugin/gestures/OnScaleListener;", "addOnShoveListener", "onShoveListener", "Lcom/mapbox/maps/plugin/gestures/OnShoveListener;", "addProtectedAnimationOwner", "owner", "", "getGesturesManager", "Lcom/mapbox/android/gestures/AndroidGesturesManager;", "onGenericMotionEvent", "", "event", "Landroid/view/MotionEvent;", "onTouchEvent", "motionEvent", "removeOnFlingListener", "removeOnMapClickListener", "removeOnMapLongClickListener", "removeOnMoveListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeOnRotateListener", "removeOnScaleListener", "removeOnShoveListener", "removeProtectedAnimationOwner", "setGesturesManager", "internalGesturesManager", "attachDefaultListeners", "setDefaultMutuallyExclusives", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface GesturesPlugin extends MapPlugin, ContextBinder, MapSizePlugin, GesturesSettingsInterface {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void cleanup(GesturesPlugin gesturesPlugin) {
            MapPlugin.DefaultImpls.cleanup(gesturesPlugin);
        }

        public static void initialize(GesturesPlugin gesturesPlugin) {
            MapPlugin.DefaultImpls.initialize(gesturesPlugin);
        }

        public static void onDelegateProvider(GesturesPlugin gesturesPlugin, MapDelegateProvider mapDelegateProvider) {
            mapDelegateProvider.getClass();
            MapPlugin.DefaultImpls.onDelegateProvider(gesturesPlugin, mapDelegateProvider);
        }

        public static void onSizeChanged(GesturesPlugin gesturesPlugin, int i14, int i15) {
            MapSizePlugin.DefaultImpls.onSizeChanged(gesturesPlugin, i14, i15);
        }
    }

    void addOnFlingListener(OnFlingListener onFlingListener);

    void addOnMapClickListener(OnMapClickListener onMapClickListener);

    void addOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener);

    void addOnMoveListener(OnMoveListener onMoveListener);

    void addOnRotateListener(OnRotateListener onRotateListener);

    void addOnScaleListener(OnScaleListener onScaleListener);

    void addOnShoveListener(OnShoveListener onShoveListener);

    void addProtectedAnimationOwner(String owner);

    AndroidGesturesManager getGesturesManager();

    boolean onGenericMotionEvent(MotionEvent event);

    boolean onTouchEvent(MotionEvent motionEvent);

    void removeOnFlingListener(OnFlingListener onFlingListener);

    void removeOnMapClickListener(OnMapClickListener onMapClickListener);

    void removeOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener);

    void removeOnMoveListener(OnMoveListener listener);

    void removeOnRotateListener(OnRotateListener listener);

    void removeOnScaleListener(OnScaleListener listener);

    void removeOnShoveListener(OnShoveListener listener);

    void removeProtectedAnimationOwner(String owner);

    void setGesturesManager(AndroidGesturesManager internalGesturesManager, boolean attachDefaultListeners, boolean setDefaultMutuallyExclusives);
}
