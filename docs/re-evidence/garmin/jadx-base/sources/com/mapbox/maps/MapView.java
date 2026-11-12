package com.mapbox.maps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.maps.debugoptions.DebugOptionsController;
import com.mapbox.maps.debugoptions.MapViewDebugOptions;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import com.mapbox.maps.renderer.MapboxRenderer;
import com.mapbox.maps.renderer.MapboxSurfaceHolderRenderer;
import com.mapbox.maps.renderer.MapboxTextureViewRenderer;
import com.mapbox.maps.renderer.OnFpsChangedListener;
import com.mapbox.maps.renderer.RenderThreadStatsRecorder;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.egl.EGLCore;
import com.mapbox.maps.renderer.widget.Widget;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.d0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 \u0089\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0089\u0001\u008a\u0001B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\fB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fB5\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\u0012B#\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\b\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010 \u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010 \u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010$\u001a\u00020\u0016H\u0016¢\u0006\u0004\b$\u0010\u0018J\u000f\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u0010\u0018J\u000f\u0010+\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u00100\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0011\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00103\u001a\u00020\u00162\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b3\u00107J\u0017\u00109\u001a\u00020\u00162\u0006\u00108\u001a\u00020.H\u0007¢\u0006\u0004\b9\u0010:J\u0019\u0010<\u001a\u00020\u00162\b\b\u0001\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0015\u0010D\u001a\u00020\u00162\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ#\u0010H\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010G*\u00020F2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020.2\u0006\u0010-\u001a\u00020JH\u0017¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020.2\u0006\u0010-\u001a\u00020JH\u0016¢\u0006\u0004\bM\u0010LJ\u0017\u0010N\u001a\u00020.2\u0006\u0010-\u001a\u00020JH\u0016¢\u0006\u0004\bN\u0010LJ\u0017\u0010P\u001a\u00020\u00162\u0006\u00106\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020\u00162\u0006\u0010S\u001a\u00020RH\u0017¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020\u00162\u0006\u0010W\u001a\u00020VH\u0017¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020.2\u0006\u0010W\u001a\u00020VH\u0017¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\\\u0010\u0018J\u0017\u0010_\u001a\u00020\u00162\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020\u00162\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\ba\u0010`J#\u0010d\u001a\u00020.*\u00020J2\u0006\u0010b\u001a\u00020J2\u0006\u0010c\u001a\u00020\rH\u0002¢\u0006\u0004\bd\u0010eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010f\u001a\u00020\u00138@@BX\u0080.¢\u0006\f\n\u0004\b\u0014\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020k0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001c\u0010o\u001a\b\u0012\u0004\u0012\u00020J0n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u001b\u0010c\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010m\u001a\u0004\br\u0010sR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020t0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010mR\u001b\u0010{\u001a\u00020v8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bw\u0010x*\u0004\by\u0010zR4\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020}0|2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020}0|8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0015\u0010\u0084\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u001f\u0010\u0088\u0001\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\u000f\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001*\u0005\b\u0087\u0001\u0010z¨\u0006\u008b\u0001"}, d2 = {"Lcom/mapbox/maps/MapView;", "Landroid/widget/FrameLayout;", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "Lcom/mapbox/maps/MapControllable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/maps/MapInitOptions;", "mapInitOptions", "<init>", "(Landroid/content/Context;Lcom/mapbox/maps/MapInitOptions;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "initOptions", "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/mapbox/maps/MapInitOptions;)V", "Lcom/mapbox/maps/MapController;", "mapController", "(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/mapbox/maps/MapController;)V", "", "onAttachedToWindow", "()V", "parseTypedArray$maps_sdk_release", "(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/mapbox/maps/MapInitOptions;", "parseTypedArray", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "(II)V", "onStart", "onStop", "onResume", "onLowMemory", "onDestroy", "Lcom/mapbox/maps/MapboxMap;", "getMapboxMapDeprecated", "()Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "Ljava/lang/Runnable;", "event", "", "needRender", "queueEvent", "(Ljava/lang/Runnable;Z)V", "Landroid/graphics/Bitmap;", "snapshot", "()Landroid/graphics/Bitmap;", "Lcom/mapbox/maps/MapView$OnSnapshotReady;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V", "enabled", "setSnapshotLegacyMode", "(Z)V", "fps", "setMaximumFps", "(I)V", "Lcom/mapbox/maps/plugin/Plugin;", "plugin", "createPlugin", "(Lcom/mapbox/maps/plugin/Plugin;)V", "", TtmlNode.ATTR_ID, "removePlugin", "(Ljava/lang/String;)V", "Lcom/mapbox/maps/plugin/MapPlugin;", "T", "getPlugin", "(Ljava/lang/String;)Lcom/mapbox/maps/plugin/MapPlugin;", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onInterceptTouchEvent", "onGenericMotionEvent", "Lcom/mapbox/maps/renderer/OnFpsChangedListener;", "setOnFpsChangedListener", "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V", "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;", "renderThreadStatsRecorder", "setRenderThreadStatsRecorder", "(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V", "Lcom/mapbox/maps/renderer/widget/Widget;", "widget", "addWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)V", "removeWidget", "(Lcom/mapbox/maps/renderer/widget/Widget;)Z", "scheduleThreadServiceTypeReset", "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;", "rendererSetupErrorListener", "addRendererSetupErrorListener", "(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V", "removeRendererSetupErrorListener", "moveEvent", "touchSlop", "hypot", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;I)Z", "<set-?>", "Lcom/mapbox/maps/MapController;", "getMapController$maps_sdk_release", "()Lcom/mapbox/maps/MapController;", "Lo13/l;", "Lcom/mapbox/maps/debugoptions/DebugOptionsController;", "debugOptionsControllerDelegate", "Lo13/l;", "", "interceptedViewAnnotationEvents", "Ljava/util/List;", "touchSlop$delegate", "getTouchSlop", "()I", "Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;", "viewAnnotationManagerDelegate", "Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;", "getViewAnnotationManager", "()Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;", "getViewAnnotationManager$delegate", "(Lcom/mapbox/maps/MapView;)Ljava/lang/Object;", "viewAnnotationManager", "", "Lcom/mapbox/maps/debugoptions/MapViewDebugOptions;", "value", "getDebugOptions", "()Ljava/util/Set;", "setDebugOptions", "(Ljava/util/Set;)V", "debugOptions", "mapboxMap", "getDebugOptionsController", "()Lcom/mapbox/maps/debugoptions/DebugOptionsController;", "getDebugOptionsController$delegate", "debugOptionsController", "Companion", "OnSnapshotReady", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class MapView extends FrameLayout implements MapPluginProviderDelegate, MapControllable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final /* synthetic */ int DEFAULT_ANTIALIASING_SAMPLE_COUNT = 1;
    public static final /* synthetic */ int DEFAULT_FPS = 60;
    private final o13.l<DebugOptionsController> debugOptionsControllerDelegate;
    private List<MotionEvent> interceptedViewAnnotationEvents;
    private MapController mapController;

    /* JADX INFO: renamed from: touchSlop$delegate, reason: from kotlin metadata */
    private final o13.l touchSlop;
    private final o13.l<ViewAnnotationManagerImpl> viewAnnotationManagerDelegate;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/MapView$OnSnapshotReady;", "", "onSnapshotReady", "", "bitmap", "Landroid/graphics/Bitmap;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnSnapshotReady {
        void onSnapshotReady(Bitmap bitmap);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapView$onInterceptTouchEvent$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements e23.l<MotionEvent, Boolean> {
        final /* synthetic */ int $upPointerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i14) {
            super(1);
            this.$upPointerId = i14;
        }

        @Override // e23.l
        public final Boolean invoke(MotionEvent motionEvent) {
            motionEvent.getClass();
            return Boolean.valueOf(this.$upPointerId == motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
    }

    private MapView(Context context, AttributeSet attributeSet, int i14, int i15, MapInitOptions mapInitOptions) {
        MapInitOptions mapInitOptions2;
        MapboxRenderer mapboxTextureViewRenderer;
        super(context, attributeSet, i14, i15);
        this.debugOptionsControllerDelegate = o13.m.b(new MapView$debugOptionsControllerDelegate$1(this));
        this.interceptedViewAnnotationEvents = new ArrayList();
        this.touchSlop = o13.m.b(new MapView$touchSlop$2(this));
        this.viewAnnotationManagerDelegate = o13.m.b(new MapView$viewAnnotationManagerDelegate$1(this));
        if (attributeSet != null) {
            mapInitOptions2 = parseTypedArray$maps_sdk_release(context, attributeSet);
        } else if (mapInitOptions == null) {
            mapInitOptions2 = new MapInitOptions(context, null, null, null, false, null, null, 0, null, 510, null);
        } else {
            mapInitOptions2 = mapInitOptions;
        }
        if (isInEditMode()) {
            return;
        }
        View textureView = mapInitOptions2.getTextureView() ? new TextureView(context, attributeSet) : new SurfaceView(context, attributeSet);
        ContextMode contextMode = mapInitOptions2.getMapOptions().getContextMode();
        contextMode = contextMode == null ? ContextMode.UNIQUE : contextMode;
        contextMode.getClass();
        if (textureView instanceof SurfaceView) {
            SurfaceHolder holder = ((SurfaceView) textureView).getHolder();
            holder.getClass();
            mapboxTextureViewRenderer = new MapboxSurfaceHolderRenderer(holder, mapInitOptions2.getAntialiasingSampleCount(), contextMode, mapInitOptions2.getMapName());
        } else {
            if (!(textureView instanceof TextureView)) {
                vb.h.s("Provided view has to be a texture or a surface.");
                throw null;
            }
            mapboxTextureViewRenderer = new MapboxTextureViewRenderer((TextureView) textureView, mapInitOptions2.getAntialiasingSampleCount(), contextMode, mapInitOptions2.getMapName());
        }
        this.mapController = new MapController(mapboxTextureViewRenderer, mapInitOptions2);
        addView(textureView, 0);
        getMapController$maps_sdk_release().initializePlugins(mapInitOptions2, this);
    }

    private final DebugOptionsController getDebugOptionsController() {
        return this.debugOptionsControllerDelegate.getValue();
    }

    private final int getTouchSlop() {
        return ((Number) this.touchSlop.getValue()).intValue();
    }

    private final boolean hypot(MotionEvent motionEvent, MotionEvent motionEvent2, int i14) {
        int pointerCount = motionEvent2.getPointerCount();
        for (int i15 = 0; i15 < pointerCount; i15++) {
            int pointerId = motionEvent2.getPointerId(i15);
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            int iFindPointerIndex2 = motionEvent2.findPointerIndex(pointerId);
            if (iFindPointerIndex != -1 && iFindPointerIndex2 != -1 && ((float) Math.hypot(motionEvent.getX(iFindPointerIndex) - motionEvent2.getX(iFindPointerIndex2), motionEvent.getY(iFindPointerIndex) - motionEvent2.getY(iFindPointerIndex2))) > i14) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isRenderingSupported() {
        return INSTANCE.isRenderingSupported();
    }

    public static final boolean isTerrainRenderingSupported() {
        return INSTANCE.isTerrainRenderingSupported();
    }

    @Override // com.mapbox.maps.MapControllable
    public void addRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        getMapController$maps_sdk_release().addRendererSetupErrorListener(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public void addWidget(Widget widget) {
        widget.getClass();
        getMapController$maps_sdk_release().addWidget(widget);
    }

    public final void createPlugin(Plugin plugin) {
        plugin.getClass();
        getMapController$maps_sdk_release().createPlugin(this, plugin);
    }

    public final Set<MapViewDebugOptions> getDebugOptions() {
        return getDebugOptionsController().getOptions();
    }

    public final /* synthetic */ MapController getMapController$maps_sdk_release() {
        MapController mapController = this.mapController;
        if (mapController != null) {
            return mapController;
        }
        s.m("mapController");
        throw null;
    }

    @Override // com.mapbox.maps.MapControllable
    /* JADX INFO: renamed from: getMapboxMap */
    public MapboxMap getMapboxMapDeprecated() {
        return getMapController$maps_sdk_release().getMapboxMapDeprecated();
    }

    @Override // com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate
    public <T extends MapPlugin> T getPlugin(String id3) {
        id3.getClass();
        return (T) getMapController$maps_sdk_release().getPlugin(id3);
    }

    public final ViewAnnotationManager getViewAnnotationManager() {
        return this.viewAnnotationManagerDelegate.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        getMapController$maps_sdk_release().onAttachedToWindow$maps_sdk_release(this);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onDestroy() {
        if (this.viewAnnotationManagerDelegate.isInitialized()) {
            ViewAnnotationManager viewAnnotationManager = getViewAnnotationManager();
            viewAnnotationManager.getClass();
            ((ViewAnnotationManagerImpl) viewAnnotationManager).destroy();
        }
        getMapController$maps_sdk_release().onDestroy();
    }

    @Override // android.view.View, com.mapbox.maps.MapControllable
    public boolean onGenericMotionEvent(MotionEvent event) {
        event.getClass();
        return getMapController$maps_sdk_release().onGenericMotionEvent(event) || super.onGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        event.getClass();
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    List<MotionEvent> list = this.interceptedViewAnnotationEvents;
                    if (list == null || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (hypot((MotionEvent) it.next(), event, getTouchSlop())) {
                                return true;
                            }
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            int pointerId = event.getPointerId(event.getActionIndex());
                            d0.B(new AnonymousClass2(pointerId), this.interceptedViewAnnotationEvents);
                            return false;
                        }
                    }
                }
                return false;
            }
            this.interceptedViewAnnotationEvents.clear();
            return false;
        }
        List<MotionEvent> list2 = this.interceptedViewAnnotationEvents;
        MotionEvent motionEventObtain = MotionEvent.obtain(event);
        motionEventObtain.getClass();
        list2.add(motionEventObtain);
        return false;
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onLowMemory() {
        getMapController$maps_sdk_release().onLowMemory();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onResume() {
        getMapController$maps_sdk_release().onResume();
    }

    @Override // com.mapbox.maps.MapControllable
    public void onSizeChanged(int w14, int h14) {
        if (isInEditMode()) {
            return;
        }
        getMapController$maps_sdk_release().onSizeChanged(w14, h14);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStart() {
        Display display = getDisplay();
        getMapController$maps_sdk_release().setScreenRefreshRate$maps_sdk_release(display != null ? (int) display.getRefreshRate() : 60);
        getMapController$maps_sdk_release().onStart();
        if (this.debugOptionsControllerDelegate.isInitialized()) {
            getDebugOptionsController().setStarted(true);
        }
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStop() {
        getMapController$maps_sdk_release().onStop();
        if (this.debugOptionsControllerDelegate.isInitialized()) {
            getDebugOptionsController().setStarted(false);
        }
    }

    @Override // android.view.View, com.mapbox.maps.MapControllable
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        boolean z14;
        event.getClass();
        if (this.interceptedViewAnnotationEvents.isEmpty()) {
            z14 = false;
        } else {
            List<MotionEvent> list = this.interceptedViewAnnotationEvents;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((MotionEvent) it.next()).getEventTime() == event.getEventTime()) {
                            z14 = false;
                        }
                    }
                }
            }
            z14 = false;
            for (MotionEvent motionEvent : this.interceptedViewAnnotationEvents) {
                z14 = getMapController$maps_sdk_release().onTouchEvent(motionEvent) || z14;
                motionEvent.recycle();
            }
        }
        this.interceptedViewAnnotationEvents.clear();
        return getMapController$maps_sdk_release().onTouchEvent(event) || z14;
    }

    @SuppressLint({"CustomViewStyleable"})
    public final /* synthetic */ MapInitOptions parseTypedArray$maps_sdk_release(Context context, AttributeSet attrs) {
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            MapOptions mapOptions = MapAttributeParser.INSTANCE.parseMapOptions(typedArrayObtainStyledAttributes, context.getResources().getDisplayMetrics().density);
            CameraOptions cameraOptions$default = CameraAttributeParser.parseCameraOptions$default(CameraAttributeParser.INSTANCE, typedArrayObtainStyledAttributes, 0.0f, 2, null);
            boolean z14 = typedArrayObtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_mapSurface, 0) != 0;
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_styleUri);
            if (string == null) {
                string = Style.STANDARD;
            }
            int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.mapbox_MapView_mapbox_mapAntialiasingSampleCount, 1);
            String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_mapName);
            if (string2 == null) {
                string2 = "";
            }
            String str = string2;
            String str2 = string;
            MapInitOptions mapInitOptions = new MapInitOptions(context, mapOptions, null, null, false, str2.length() == 0 ? null : str2, attrs, integer, str, 28, null);
            mapInitOptions.setCameraOptions(cameraOptions$default);
            mapInitOptions.setTextureView(z14);
            return mapInitOptions;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public void queueEvent(Runnable event, boolean needRender) {
        event.getClass();
        getMapController$maps_sdk_release().queueEvent(event, needRender);
    }

    public final void removePlugin(String id3) {
        id3.getClass();
        getMapController$maps_sdk_release().removePlugin(id3);
    }

    @Override // com.mapbox.maps.MapControllable
    public void removeRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        getMapController$maps_sdk_release().removeRendererSetupErrorListener(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public boolean removeWidget(Widget widget) {
        widget.getClass();
        return getMapController$maps_sdk_release().removeWidget(widget);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final void scheduleThreadServiceTypeReset() {
        getMapController$maps_sdk_release().getRenderer().getRenderThread$maps_sdk_release().scheduleThreadServiceTypeReset();
    }

    public final void setDebugOptions(Set<MapViewDebugOptions> set) {
        set.getClass();
        getDebugOptionsController().setOptions(set);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setMaximumFps(int fps) {
        getMapController$maps_sdk_release().setMaximumFps(fps);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setOnFpsChangedListener(OnFpsChangedListener listener) {
        listener.getClass();
        getMapController$maps_sdk_release().setOnFpsChangedListener(listener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public void setRenderThreadStatsRecorder(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        renderThreadStatsRecorder.getClass();
        getMapController$maps_sdk_release().setRenderThreadStatsRecorder(renderThreadStatsRecorder);
    }

    @MapboxExperimental
    public final void setSnapshotLegacyMode(boolean enabled) {
        getMapController$maps_sdk_release().getRenderer().setSnapshotLegacyModeEnabled$maps_sdk_release(enabled);
    }

    @Override // com.mapbox.maps.MapControllable
    public void snapshot(OnSnapshotReady listener) {
        listener.getClass();
        getMapController$maps_sdk_release().snapshot(listener);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0081\u0002¢\u0006\u0002\b\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/mapbox/maps/MapView$Companion;", "", "()V", "DEFAULT_ANTIALIASING_SAMPLE_COUNT", "", "DEFAULT_FPS", "invoke", "Lcom/mapbox/maps/MapView;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "mapController", "Lcom/mapbox/maps/MapController;", "invoke$maps_sdk_release", "isRenderingSupported", "", "isTerrainRenderingSupported", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final /* synthetic */ MapView invoke$maps_sdk_release(Context context, AttributeSet attrs, MapController mapController) {
            context.getClass();
            mapController.getClass();
            return new MapView(context, attrs, mapController, (p005kotlin.jvm.internal.j) null);
        }

        public final boolean isRenderingSupported() {
            EGLCore eGLCore = new EGLCore(false, 1, null, "", 4, null);
            boolean zPrepareEgl = eGLCore.prepareEgl();
            eGLCore.release();
            return zPrepareEgl;
        }

        public final boolean isTerrainRenderingSupported() {
            EGLCore eGLCore = new EGLCore(false, 1, null, "", 4, null);
            boolean zPrepareEgl = eGLCore.prepareEgl();
            EGLSurface eGLSurfaceCreateOffscreenSurface = eGLCore.createOffscreenSurface(1, 1);
            eGLCore.makeCurrent(eGLSurfaceCreateOffscreenSurface);
            IntBuffer intBufferAllocate = IntBuffer.allocate(1);
            GLES20.glGetIntegerv(35660, intBufferAllocate);
            intBufferAllocate.rewind();
            boolean z14 = intBufferAllocate.get() > 0;
            eGLCore.releaseSurface(eGLSurfaceCreateOffscreenSurface);
            eGLCore.release();
            return zPrepareEgl && z14;
        }

        private Companion() {
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public Bitmap snapshot() {
        return getMapController$maps_sdk_release().snapshot();
    }

    @Override // android.view.View
    public void onSizeChanged(int w14, int h14, int oldw, int oldh) {
        super.onSizeChanged(w14, h14, oldw, oldh);
        if (w14 == oldw && h14 == oldh) {
            return;
        }
        onSizeChanged(w14, h14);
    }

    public /* synthetic */ MapView(Context context, AttributeSet attributeSet, MapController mapController, p005kotlin.jvm.internal.j jVar) {
        this(context, attributeSet, mapController);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapView(Context context, MapInitOptions mapInitOptions) {
        this(context, null, 0, 0, mapInitOptions);
        context.getClass();
        mapInitOptions.getClass();
    }

    public /* synthetic */ MapView(Context context, MapInitOptions mapInitOptions, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            mapInitOptions = new MapInitOptions(context, null, null, null, false, null, null, 0, null, 510, null);
        }
        this(context, mapInitOptions);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapView(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapView(Context context) {
        this(context, (MapInitOptions) null, 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        context.getClass();
    }

    private MapView(Context context, AttributeSet attributeSet, MapController mapController) {
        super(context, attributeSet, 0, 0);
        this.debugOptionsControllerDelegate = o13.m.b(new MapView$debugOptionsControllerDelegate$1(this));
        this.interceptedViewAnnotationEvents = new ArrayList();
        this.touchSlop = o13.m.b(new MapView$touchSlop$2(this));
        this.viewAnnotationManagerDelegate = o13.m.b(new MapView$viewAnnotationManagerDelegate$1(this));
        this.mapController = mapController;
    }
}
