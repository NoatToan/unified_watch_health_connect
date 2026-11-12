package com.mapbox.maps.plugin.gestures;

import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.android.gestures.BaseGesture;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/GestureState;", "", "gesturesManager", "Lcom/mapbox/android/gestures/AndroidGesturesManager;", "(Lcom/mapbox/android/gestures/AndroidGesturesManager;)V", "savedGestureEnabledMap", "", "Lcom/mapbox/maps/plugin/gestures/GestureState$Type;", "", "peek", "gesture", "(Lcom/mapbox/maps/plugin/gestures/GestureState$Type;)Ljava/lang/Boolean;", "restore", "", "saveAndDisable", "Type", "plugin-gestures_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GestureState {
    private final AndroidGesturesManager gesturesManager;
    private final Map<Type, Boolean> savedGestureEnabledMap;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/GestureState$Type;", "", "(Ljava/lang/String;I)V", "DoubleTap", "Scale", "ScaleQuickZoom", "Shove", "plugin-gestures_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Type {
        DoubleTap,
        Scale,
        ScaleQuickZoom,
        Shove
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Scale.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GestureState(AndroidGesturesManager androidGesturesManager) {
        androidGesturesManager.getClass();
        this.gesturesManager = androidGesturesManager;
        this.savedGestureEnabledMap = new LinkedHashMap();
    }

    public final Boolean peek(Type gesture) {
        gesture.getClass();
        return this.savedGestureEnabledMap.get(gesture);
    }

    public final void restore(Type gesture) {
        gesture.getClass();
        Boolean boolRemove = this.savedGestureEnabledMap.remove(gesture);
        if (boolRemove != null) {
            boolean zBooleanValue = boolRemove.booleanValue();
            int i14 = WhenMappings.$EnumSwitchMapping$0[gesture.ordinal()];
            AndroidGesturesManager androidGesturesManager = this.gesturesManager;
            (i14 == 1 ? androidGesturesManager.getRotateGestureDetector() : androidGesturesManager.getMoveGestureDetector()).setEnabled(zBooleanValue);
        }
    }

    public final boolean saveAndDisable(Type gesture) {
        gesture.getClass();
        int i14 = WhenMappings.$EnumSwitchMapping$0[gesture.ordinal()];
        AndroidGesturesManager androidGesturesManager = this.gesturesManager;
        BaseGesture rotateGestureDetector = i14 == 1 ? androidGesturesManager.getRotateGestureDetector() : androidGesturesManager.getMoveGestureDetector();
        boolean zIsEnabled = rotateGestureDetector.isEnabled();
        this.savedGestureEnabledMap.put(gesture, Boolean.valueOf(zIsEnabled));
        rotateGestureDetector.setEnabled(false);
        return zIsEnabled;
    }
}
