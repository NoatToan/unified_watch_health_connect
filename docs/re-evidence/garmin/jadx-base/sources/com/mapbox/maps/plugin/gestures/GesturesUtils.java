package com.mapbox.maps.plugin.gestures;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.ScrollMode;
import com.mapbox.maps.plugin.delegates.MapPluginExtensionsDelegate;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\r\u001a\"\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010\u0011\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0012\u0010\u0014\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u0012\u0010\u0017\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0012\u0010\u001a\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u001b\u001a\u0012\u0010\u001c\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u001d\u001a\u0012\u0010\u001e\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u001f\u001a\f\u0010 \u001a\u0004\u0018\u00010!*\u00020\u000e\u001a\n\u0010\"\u001a\u00020#*\u00020$\u001a\n\u0010%\u001a\u00020#*\u00020$\u001a\u0012\u0010&\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010'\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0012\u0010(\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u0012\u0010)\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0012\u0010*\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u001b\u001a\u0012\u0010+\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u001d\u001a\u0012\u0010,\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u001f\u001a\"\u0010-\u001a\u00020\r*\u00020\u000e2\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020#\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u00061"}, d2 = {"gestures", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "getGestures", "(Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;)Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "createGesturePlugin", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "pixelRatio", "", "addOnFlingListener", "", "Lcom/mapbox/maps/plugin/delegates/MapPluginExtensionsDelegate;", "onFlingListener", "Lcom/mapbox/maps/plugin/gestures/OnFlingListener;", "addOnMapClickListener", "onMapClickListener", "Lcom/mapbox/maps/plugin/gestures/OnMapClickListener;", "addOnMapLongClickListener", "onMapLongClickListener", "Lcom/mapbox/maps/plugin/gestures/OnMapLongClickListener;", "addOnMoveListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mapbox/maps/plugin/gestures/OnMoveListener;", "addOnRotateListener", "Lcom/mapbox/maps/plugin/gestures/OnRotateListener;", "addOnScaleListener", "Lcom/mapbox/maps/plugin/gestures/OnScaleListener;", "addOnShoveListener", "Lcom/mapbox/maps/plugin/gestures/OnShoveListener;", "getGesturesManager", "Lcom/mapbox/android/gestures/AndroidGesturesManager;", "isScrollHorizontallyLimited", "", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "isScrollVerticallyLimited", "removeOnFlingListener", "removeOnMapClickListener", "removeOnMapLongClickListener", "removeOnMoveListener", "removeOnRotateListener", "removeOnScaleListener", "removeOnShoveListener", "setGesturesManager", "androidGesturesManager", "attachDefaultListeners", "setDefaultMutuallyExclusives", "plugin-gestures_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class GesturesUtils {

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$getGesturesManager$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42341 extends w implements l<GesturesPlugin, Object> {
        public static final C42341 INSTANCE = new C42341();

        public C42341() {
            super(1);
        }

        @Override // e23.l
        public final Object invoke(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            return gesturesPlugin.getGesturesManager();
        }
    }

    public static final void addOnFlingListener(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, OnFlingListener onFlingListener) {
        mapPluginExtensionsDelegate.getClass();
        onFlingListener.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new AnonymousClass1(onFlingListener));
    }

    public static final void addOnMapClickListener(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, OnMapClickListener onMapClickListener) {
        mapPluginExtensionsDelegate.getClass();
        onMapClickListener.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new C42281(onMapClickListener));
    }

    public static final void addOnMapLongClickListener(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, OnMapLongClickListener onMapLongClickListener) {
        mapPluginExtensionsDelegate.getClass();
        onMapLongClickListener.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new C42291(onMapLongClickListener));
    }

    public static final void addOnMoveListener(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, OnMoveListener onMoveListener) {
        mapPluginExtensionsDelegate.getClass();
        onMoveListener.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new C42301(onMoveListener));
    }

    public static final void addOnRotateListener(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, OnRotateListener onRotateListener) {
        mapPluginExtensionsDelegate.getClass();
        onRotateListener.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new C42311(onRotateListener));
    }

    public static final void addOnScaleListener(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, OnScaleListener onScaleListener) {
        mapPluginExtensionsDelegate.getClass();
        onScaleListener.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new C42321(onScaleListener));
    }

    public static final void addOnShoveListener(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, OnShoveListener onShoveListener) {
        mapPluginExtensionsDelegate.getClass();
        onShoveListener.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new C42331(onShoveListener));
    }

    public static final /* synthetic */ GesturesPlugin createGesturePlugin(Context context, AttributeSet attributeSet, float f14) {
        context.getClass();
        return attributeSet != null ? new GesturesPluginImpl(context, attributeSet, f14) : new GesturesPluginImpl(context, f14);
    }

    public static final GesturesPlugin getGestures(MapPluginProviderDelegate mapPluginProviderDelegate) {
        mapPluginProviderDelegate.getClass();
        MapPlugin plugin = mapPluginProviderDelegate.getPlugin(Plugin.MAPBOX_GESTURES_PLUGIN_ID);
        plugin.getClass();
        return (GesturesPlugin) plugin;
    }

    public static final AndroidGesturesManager getGesturesManager(MapPluginExtensionsDelegate mapPluginExtensionsDelegate) {
        mapPluginExtensionsDelegate.getClass();
        return (AndroidGesturesManager) mapPluginExtensionsDelegate.gesturesPlugin(C42341.INSTANCE);
    }

    public static final boolean isScrollHorizontallyLimited(GesturesSettings gesturesSettings) {
        gesturesSettings.getClass();
        return gesturesSettings.getScrollMode() == ScrollMode.VERTICAL;
    }

    public static final boolean isScrollVerticallyLimited(GesturesSettings gesturesSettings) {
        gesturesSettings.getClass();
        return gesturesSettings.getScrollMode() == ScrollMode.HORIZONTAL;
    }

    public static final void removeOnFlingListener(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, OnFlingListener onFlingListener) {
        mapPluginExtensionsDelegate.getClass();
        onFlingListener.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new C42351(onFlingListener));
    }

    public static final void removeOnMapClickListener(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, OnMapClickListener onMapClickListener) {
        mapPluginExtensionsDelegate.getClass();
        onMapClickListener.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new C42361(onMapClickListener));
    }

    public static final void removeOnMapLongClickListener(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, OnMapLongClickListener onMapLongClickListener) {
        mapPluginExtensionsDelegate.getClass();
        onMapLongClickListener.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new C42371(onMapLongClickListener));
    }

    public static final void removeOnMoveListener(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, OnMoveListener onMoveListener) {
        mapPluginExtensionsDelegate.getClass();
        onMoveListener.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new C42381(onMoveListener));
    }

    public static final void removeOnRotateListener(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, OnRotateListener onRotateListener) {
        mapPluginExtensionsDelegate.getClass();
        onRotateListener.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new C42391(onRotateListener));
    }

    public static final void removeOnScaleListener(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, OnScaleListener onScaleListener) {
        mapPluginExtensionsDelegate.getClass();
        onScaleListener.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new C42401(onScaleListener));
    }

    public static final void removeOnShoveListener(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, OnShoveListener onShoveListener) {
        mapPluginExtensionsDelegate.getClass();
        onShoveListener.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new C42411(onShoveListener));
    }

    public static final void setGesturesManager(MapPluginExtensionsDelegate mapPluginExtensionsDelegate, AndroidGesturesManager androidGesturesManager, boolean z14, boolean z15) {
        mapPluginExtensionsDelegate.getClass();
        androidGesturesManager.getClass();
        mapPluginExtensionsDelegate.gesturesPlugin(new C42421(androidGesturesManager, z14, z15));
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$addOnFlingListener$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ OnFlingListener $onFlingListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OnFlingListener onFlingListener) {
            super(1);
            this.$onFlingListener = onFlingListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.addOnFlingListener(this.$onFlingListener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$addOnMapClickListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42281 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ OnMapClickListener $onMapClickListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42281(OnMapClickListener onMapClickListener) {
            super(1);
            this.$onMapClickListener = onMapClickListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.addOnMapClickListener(this.$onMapClickListener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$addOnMapLongClickListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42291 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ OnMapLongClickListener $onMapLongClickListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42291(OnMapLongClickListener onMapLongClickListener) {
            super(1);
            this.$onMapLongClickListener = onMapLongClickListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.addOnMapLongClickListener(this.$onMapLongClickListener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$addOnMoveListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42301 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ OnMoveListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42301(OnMoveListener onMoveListener) {
            super(1);
            this.$listener = onMoveListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.addOnMoveListener(this.$listener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$addOnRotateListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42311 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ OnRotateListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42311(OnRotateListener onRotateListener) {
            super(1);
            this.$listener = onRotateListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.addOnRotateListener(this.$listener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$addOnScaleListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42321 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ OnScaleListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42321(OnScaleListener onScaleListener) {
            super(1);
            this.$listener = onScaleListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.addOnScaleListener(this.$listener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$addOnShoveListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42331 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ OnShoveListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42331(OnShoveListener onShoveListener) {
            super(1);
            this.$listener = onShoveListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.addOnShoveListener(this.$listener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$removeOnFlingListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42351 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ OnFlingListener $onFlingListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42351(OnFlingListener onFlingListener) {
            super(1);
            this.$onFlingListener = onFlingListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.removeOnFlingListener(this.$onFlingListener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$removeOnMapClickListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42361 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ OnMapClickListener $onMapClickListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42361(OnMapClickListener onMapClickListener) {
            super(1);
            this.$onMapClickListener = onMapClickListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.removeOnMapClickListener(this.$onMapClickListener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$removeOnMapLongClickListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42371 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ OnMapLongClickListener $onMapLongClickListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42371(OnMapLongClickListener onMapLongClickListener) {
            super(1);
            this.$onMapLongClickListener = onMapLongClickListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.removeOnMapLongClickListener(this.$onMapLongClickListener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$removeOnMoveListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42381 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ OnMoveListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42381(OnMoveListener onMoveListener) {
            super(1);
            this.$listener = onMoveListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.removeOnMoveListener(this.$listener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$removeOnRotateListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42391 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ OnRotateListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42391(OnRotateListener onRotateListener) {
            super(1);
            this.$listener = onRotateListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.removeOnRotateListener(this.$listener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$removeOnScaleListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42401 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ OnScaleListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42401(OnScaleListener onScaleListener) {
            super(1);
            this.$listener = onScaleListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.removeOnScaleListener(this.$listener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$removeOnShoveListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42411 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ OnShoveListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42411(OnShoveListener onShoveListener) {
            super(1);
            this.$listener = onShoveListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.removeOnShoveListener(this.$listener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesUtils$setGesturesManager$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42421 extends w implements l<GesturesPlugin, Unit> {
        final /* synthetic */ AndroidGesturesManager $androidGesturesManager;
        final /* synthetic */ boolean $attachDefaultListeners;
        final /* synthetic */ boolean $setDefaultMutuallyExclusives;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42421(AndroidGesturesManager androidGesturesManager, boolean z14, boolean z15) {
            super(1);
            this.$androidGesturesManager = androidGesturesManager;
            this.$attachDefaultListeners = z14;
            this.$setDefaultMutuallyExclusives = z15;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesPlugin gesturesPlugin) {
            gesturesPlugin.getClass();
            gesturesPlugin.setGesturesManager(this.$androidGesturesManager, this.$attachDefaultListeners, this.$setDefaultMutuallyExclusives);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesPlugin gesturesPlugin) {
            invoke2(gesturesPlugin);
            return Unit.INSTANCE;
        }
    }
}
