package com.mapbox.maps.viewannotation;

import android.graphics.Rect;
import android.os.Looper;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.AnnotatedFeature;
import com.mapbox.maps.AnnotatedLayerFeature;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CoordinateBounds;
import com.mapbox.maps.DelegatingViewAnnotationPositionDescriptor;
import com.mapbox.maps.DelegatingViewAnnotationPositionsUpdateListener;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxViewAnnotationException;
import com.mapbox.maps.ProjectedMeters;
import com.mapbox.maps.R;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.ViewAnnotationAnchor;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.mapbox.maps.ViewAnnotationOptions;
import com.mapbox.maps.renderer.MapboxRenderThread;
import com.mapbox.maps.util.CameraOptionsUtils;
import e23.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kg.f;
import o13.p;
import o13.u;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.j0;
import p13.u0;
import p13.x;
import r1.q2;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0089\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005*\u0001f\b\u0001\u0018\u0000 ¤\u00012\u00020\u00012\u00020\u0002:\u0004¤\u0001¥\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0013\u001a\u00020\u00112\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0013\u001a\u00020\u00102\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0015J\u001f\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010\u00102\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020+H\u0016¢\u0006\u0004\b/\u00100J=\u00109\u001a\u0004\u0018\u0001082\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0010012\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001052\b\u00107\u001a\u0004\u0018\u000105H\u0017¢\u0006\u0004\b9\u0010:JO\u00109\u001a\u00020\u00112\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0010012\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001052\b\u00107\u001a\u0004\u0018\u0001052\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b9\u0010<J\u001d\u0010?\u001a\u00020\u00112\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=01H\u0017¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0011¢\u0006\u0004\bA\u0010\u001cJS\u0010C\u001a\u0004\u0018\u0001082\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0010012\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001052\b\u00107\u001a\u0004\u0018\u0001052\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0002¢\u0006\u0004\bC\u0010DJO\u0010I\u001a\u0004\u0018\u0001082\u0006\u0010E\u001a\u0002082\b\u00104\u001a\u0004\u0018\u0001032\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F012\u0006\u0010H\u001a\u0002082\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0002¢\u0006\u0004\bI\u0010JJ1\u0010M\u001a\u0004\u0018\u0001082\b\u0010K\u001a\u0004\u0018\u0001082\u0014\u0010L\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0002¢\u0006\u0004\bM\u0010NJ+\u0010T\u001a\u0004\u0018\u00010S2\u0006\u0010O\u001a\u00020F2\u0006\u0010Q\u001a\u00020P2\b\u0010R\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\bT\u0010UJ\u001f\u0010X\u001a\u0004\u0018\u00010W*\u00020F2\b\u0010V\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\bX\u0010YJ#\u0010Z\u001a\u0004\u0018\u00010P2\u0006\u0010O\u001a\u00020F2\b\u0010V\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\\\u0010]J\u001f\u0010_\u001a\u00020\u00112\u0006\u0010^\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b_\u0010\u0017J\u0017\u0010`\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b`\u0010aJ'\u0010g\u001a\u00020f2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010c\u001a\u00020b2\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020d2\u0006\u0010O\u001a\u00020FH\u0002¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020b2\u0006\u0010O\u001a\u00020FH\u0002¢\u0006\u0004\bk\u0010lJ'\u0010n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0m2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bn\u0010oJ\u001d\u0010q\u001a\u00020\u00112\f\u0010p\u001a\b\u0012\u0004\u0012\u00020=01H\u0002¢\u0006\u0004\bq\u0010@J\u001f\u0010s\u001a\u00020\u00112\u0006\u0010O\u001a\u00020F2\u0006\u0010r\u001a\u00020=H\u0002¢\u0006\u0004\bs\u0010tJ\u001f\u0010u\u001a\u00020\u00112\u0006\u0010O\u001a\u00020F2\u0006\u0010r\u001a\u00020=H\u0002¢\u0006\u0004\bu\u0010tJ\u001f\u0010v\u001a\u00020\u00112\u0006\u0010O\u001a\u00020F2\u0006\u0010r\u001a\u00020=H\u0002¢\u0006\u0004\bv\u0010tJ.\u0010{\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010w\u0018\u00012\u0012\u0010z\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00028\u00000xH\u0082\b¢\u0006\u0004\b{\u0010|J\"\u0010\u0080\u0001\u001a\u00020\u00112\u0006\u0010}\u001a\u00020F2\u0006\u0010\u007f\u001a\u00020~H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001a\u0010\u0082\u0001\u001a\u00020\u00112\u0006\u0010}\u001a\u00020FH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\"\u0010G\u001a\u000f\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020F0\u008e\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bG\u0010\u008f\u0001R-\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020&0\u0090\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u0012\u0005\b\u0095\u0001\u0010\u001c\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001d\u0010p\u001a\b\u0012\u0004\u0012\u00020=018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bp\u0010\u0096\u0001R\u001f\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020=018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0096\u0001RU\u0010 \u0001\u001a\u0014\u0012\u0004\u0012\u00020y0\u0098\u0001j\t\u0012\u0004\u0012\u00020y`\u0099\u00012\u0019\u0010\u009a\u0001\u001a\u0014\u0012\u0004\u0012\u00020y0\u0098\u0001j\t\u0012\u0004\u0012\u00020y`\u0099\u00018V@VX\u0097\u000e¢\u0006\u0017\u0012\u0005\b\u009f\u0001\u0010\u001c\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R#\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0¡\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001¨\u0006¦\u0001"}, d2 = {"Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl;", "Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;", "Lcom/mapbox/maps/MapView;", "mapView", "Landroid/widget/FrameLayout;", "viewAnnotationsLayout", "<init>", "(Lcom/mapbox/maps/MapView;Landroid/widget/FrameLayout;)V", "", "resId", "Lcom/mapbox/maps/ViewAnnotationOptions;", "options", "Lq/a;", "asyncInflater", "Lkotlin/Function1;", "Landroid/view/View;", "", "asyncInflateCallback", "addViewAnnotation", "(ILcom/mapbox/maps/ViewAnnotationOptions;Lq/a;Le23/l;)V", "(ILcom/mapbox/maps/ViewAnnotationOptions;)Landroid/view/View;", "view", "(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)V", "", "removeViewAnnotation", "(Landroid/view/View;)Z", "removeAllViewAnnotations", "()V", "updateViewAnnotation", "(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)Z", "Lcom/mapbox/maps/AnnotatedLayerFeature;", "annotatedLayerFeature", "getViewAnnotation", "(Lcom/mapbox/maps/AnnotatedLayerFeature;)Landroid/view/View;", "getViewAnnotationOptions", "(Lcom/mapbox/maps/AnnotatedLayerFeature;)Lcom/mapbox/maps/ViewAnnotationOptions;", "(Landroid/view/View;)Lcom/mapbox/maps/ViewAnnotationOptions;", "Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnViewAnnotationUpdatedListener", "(Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;)V", "removeOnViewAnnotationUpdatedListener", "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "mode", "setViewAnnotationUpdateMode", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;)V", "getViewAnnotationUpdateMode", "()Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "", "annotations", "Lcom/mapbox/maps/EdgeInsets;", "edgeInsets", "", "bearing", "pitch", "Lcom/mapbox/maps/CameraOptions;", "cameraForAnnotations", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "result", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Le23/l;)V", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;", "positions", "onDelegatingViewAnnotationPositionsUpdate", "(Ljava/util/List;)V", "destroy", "resultCallback", "cameraForAnnotationsImpl", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Le23/l;)Lcom/mapbox/maps/CameraOptions;", "cameraForViewAnnotationPoints", "Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;", "viewAnnotations", "cameraOptionsWithNoZoom", "adjustCameraForAnnotations", "(Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Le23/l;)Lcom/mapbox/maps/CameraOptions;", "camera", "callback", "invokeCallbackAndReturn", "(Lcom/mapbox/maps/CameraOptions;Le23/l;)Lcom/mapbox/maps/CameraOptions;", "viewAnnotation", "Landroid/graphics/Rect;", "annotationFrame", "zoom", "Lcom/mapbox/maps/CoordinateBounds;", "calculateCoordinateBoundForAnnotation", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Landroid/graphics/Rect;Ljava/lang/Double;)Lcom/mapbox/maps/CoordinateBounds;", "positionDescriptor", "Lcom/mapbox/geojson/Point;", "coordinate", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Lcom/mapbox/geojson/Point;", "getViewAnnotationOptionsFrame", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)Landroid/graphics/Rect;", "validateOptions", "(Lcom/mapbox/maps/ViewAnnotationOptions;)V", "inflatedView", "prepareViewAnnotation", "measureView", "(Landroid/view/View;)V", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayoutListener", "Landroid/view/ViewTreeObserver$OnDrawListener;", "onDrawListener", "com/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$buildAttachStateListener$1", "buildAttachStateListener", "(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnDrawListener;)Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$buildAttachStateListener$1;", "buildDrawListener", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)Landroid/view/ViewTreeObserver$OnDrawListener;", "buildGlobalLayoutListener", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lo13/p;", "findByAnnotatedLayerFeature", "(Lcom/mapbox/maps/AnnotatedLayerFeature;)Lo13/p;", "updatedPositionDescriptors", "positionAnnotationViews", "newPositionDescriptor", "notifyPositionListeners", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)V", "notifyAnchorCoordinateListeners", "notifyAnchorListeners", "V", "Lcom/mapbox/bindgen/Expected;", "", "expected", "getValue", "(Lcom/mapbox/bindgen/Expected;)Ljava/lang/Object;", "annotation", "Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;", "currentVisibility", "updateVisibilityAndNotifyUpdateListeners", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;)V", "remove", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;)V", "Landroid/widget/FrameLayout;", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "Lcom/mapbox/maps/MapboxMap;", "Lcom/mapbox/maps/renderer/MapboxRenderThread;", "renderThread", "Lcom/mapbox/maps/renderer/MapboxRenderThread;", "", "pixelRatio", "F", "", "Ljava/util/Map;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "viewUpdatedListenerSet", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getViewUpdatedListenerSet$maps_sdk_release", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "getViewUpdatedListenerSet$maps_sdk_release$annotations", "Ljava/util/List;", "currentPositionDescriptors", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "value", "getViewAnnotationAvoidLayers", "()Ljava/util/HashSet;", "setViewAnnotationAvoidLayers", "(Ljava/util/HashSet;)V", "getViewAnnotationAvoidLayers$annotations", "viewAnnotationAvoidLayers", "", "getAnnotations", "()Ljava/util/Map;", "Companion", "ViewAnnotation", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ViewAnnotationManagerImpl extends DelegatingViewAnnotationPositionsUpdateListener implements ViewAnnotationManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXCEPTION_TEXT_FEATURE_IS_NULL = "Annotated feature can not be null!";
    private static final int MAX_ADJUST_BOUNDS_COUNTER = 2;
    private static final String TAG = "ViewAnnotationImpl";
    private static final int USER_FIXED_DIMENSION = -1;
    private List<DelegatingViewAnnotationPositionDescriptor> currentPositionDescriptors;
    private final MapboxMap mapboxMap;
    private final float pixelRatio;
    private final MapboxRenderThread renderThread;
    private volatile List<DelegatingViewAnnotationPositionDescriptor> updatedPositionDescriptors;
    private final Map<String, ViewAnnotation> viewAnnotations;
    private final FrameLayout viewAnnotationsLayout;
    private final CopyOnWriteArraySet<OnViewAnnotationUpdatedListener> viewUpdatedListenerSet;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewAnnotationAnchor.values().length];
            try {
                iArr[ViewAnnotationAnchor.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewAnnotationAnchor.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewAnnotationAnchor.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ViewAnnotationAnchor.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ViewAnnotationAnchor.BOTTOM_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ViewAnnotationAnchor.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ViewAnnotationAnchor.LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ViewAnnotationAnchor.RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ViewAnnotationManagerImpl(MapView mapView, FrameLayout frameLayout) {
        mapView.getClass();
        frameLayout.getClass();
        this.viewAnnotationsLayout = frameLayout;
        MapboxMap mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
        this.mapboxMap = mapboxMapDeprecated;
        this.renderThread = mapView.getMapController$maps_sdk_release().getRenderer().getRenderThread$maps_sdk_release();
        this.pixelRatio = mapView.getResources().getDisplayMetrics().density;
        this.viewAnnotations = new LinkedHashMap();
        this.viewUpdatedListenerSet = new CopyOnWriteArraySet<>();
        j0 j0Var = j0.f134944a;
        this.updatedPositionDescriptors = j0Var;
        this.currentPositionDescriptors = j0Var;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mapView.addView(frameLayout, 1);
        mapView.requestDisallowInterceptTouchEvent(false);
        mapboxMapDeprecated.setViewAnnotationPositionsUpdateListener$maps_sdk_release(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addViewAnnotation$lambda$0(ViewAnnotationManagerImpl viewAnnotationManagerImpl, ViewAnnotationOptions viewAnnotationOptions, l lVar, View view2, int i14, ViewGroup viewGroup) {
        viewAnnotationManagerImpl.getClass();
        viewAnnotationOptions.getClass();
        lVar.getClass();
        view2.getClass();
        viewAnnotationManagerImpl.prepareViewAnnotation(view2, viewAnnotationOptions);
        lVar.invoke(view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final CameraOptions adjustCameraForAnnotations(CameraOptions cameraForViewAnnotationPoints, EdgeInsets edgeInsets, List<ViewAnnotation> viewAnnotations, CameraOptions cameraOptionsWithNoZoom, l<? super CameraOptions, Unit> resultCallback) {
        Double dValueOf = Double.valueOf(0.0d);
        int i14 = 0;
        Integer num = 0;
        if (CameraOptionsUtils.isEmpty(cameraForViewAnnotationPoints)) {
            return invokeCallbackAndReturn(null, resultCallback);
        }
        CameraOptions cameraOptionsCameraForCoordinates = cameraForViewAnnotationPoints;
        boolean z14 = false;
        u uVar = null;
        u uVar2 = null;
        u uVar3 = null;
        u uVar4 = null;
        int i15 = 1;
        while (!z14 && i15 <= 2) {
            Double zoom = cameraOptionsCameraForCoordinates.getZoom();
            i15++;
            u uVar5 = uVar4;
            u uVar6 = uVar3;
            u uVar7 = uVar2;
            u uVar8 = uVar;
            boolean z15 = true;
            for (ViewAnnotation viewAnnotation : viewAnnotations) {
                Rect viewAnnotationOptionsFrame = getViewAnnotationOptionsFrame(viewAnnotation, viewAnnotation.getPositionDescriptor());
                if (viewAnnotationOptionsFrame == null) {
                    viewAnnotationOptionsFrame = new Rect(i14, i14, i14, i14);
                }
                CoordinateBounds coordinateBoundsCalculateCoordinateBoundForAnnotation = calculateCoordinateBoundForAnnotation(viewAnnotation, viewAnnotationOptionsFrame, zoom);
                if (coordinateBoundsCalculateCoordinateBoundForAnnotation != null) {
                    if (uVar8 == null || ((Number) uVar8.f128607c).doubleValue() < coordinateBoundsCalculateCoordinateBoundForAnnotation.north()) {
                        uVar8 = new u(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(coordinateBoundsCalculateCoordinateBoundForAnnotation.north()));
                        z15 = false;
                    }
                    if (uVar7 == null || ((Number) uVar7.f128607c).doubleValue() < coordinateBoundsCalculateCoordinateBoundForAnnotation.east()) {
                        uVar7 = new u(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(coordinateBoundsCalculateCoordinateBoundForAnnotation.east()));
                        z15 = false;
                    }
                    if (uVar5 == null || ((Number) uVar5.f128607c).doubleValue() > coordinateBoundsCalculateCoordinateBoundForAnnotation.south()) {
                        uVar5 = new u(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(coordinateBoundsCalculateCoordinateBoundForAnnotation.south()));
                        z15 = false;
                    }
                    if (uVar6 == null || ((Number) uVar6.f128607c).doubleValue() > coordinateBoundsCalculateCoordinateBoundForAnnotation.west()) {
                        uVar6 = new u(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(coordinateBoundsCalculateCoordinateBoundForAnnotation.west()));
                        z15 = false;
                    }
                }
                i14 = 0;
            }
            if (uVar8 == null || uVar7 == null || uVar5 == null || uVar6 == null) {
                MapboxLogger.logW(TAG, "ViewAnnotation options framing is null. Returning empty camera");
                return invokeCallbackAndReturn(null, resultCallback);
            }
            A a14 = uVar6.f128605a;
            Point pointCoordinate = coordinate((ViewAnnotation) a14, ((ViewAnnotation) a14).getPositionDescriptor());
            pointCoordinate.getClass();
            double dLongitude = pointCoordinate.longitude();
            A a15 = uVar5.f128605a;
            Point pointCoordinate2 = coordinate((ViewAnnotation) a15, ((ViewAnnotation) a15).getPositionDescriptor());
            pointCoordinate2.getClass();
            Double d14 = dValueOf;
            Point pointFromLngLat = Point.fromLngLat(dLongitude, pointCoordinate2.latitude());
            A a16 = uVar7.f128605a;
            Point pointCoordinate3 = coordinate((ViewAnnotation) a16, ((ViewAnnotation) a16).getPositionDescriptor());
            pointCoordinate3.getClass();
            double dLongitude2 = pointCoordinate3.longitude();
            A a17 = uVar8.f128605a;
            Point pointCoordinate4 = coordinate((ViewAnnotation) a17, ((ViewAnnotation) a17).getPositionDescriptor());
            pointCoordinate4.getClass();
            Integer num2 = num;
            List<Point> listK = x.k(pointFromLngLat, Point.fromLngLat(dLongitude2, pointCoordinate4.latitude()));
            double dDoubleValue = (edgeInsets != null ? Double.valueOf(edgeInsets.getTop()) : num2).doubleValue();
            Rect rect = (Rect) uVar8.f128606b;
            double dAbs = Math.abs((rect != null ? Integer.valueOf(rect.top) : d14).doubleValue()) + dDoubleValue;
            double dDoubleValue2 = (edgeInsets != null ? Double.valueOf(edgeInsets.getLeft()) : num2).doubleValue();
            Rect rect2 = (Rect) uVar6.f128606b;
            double dAbs2 = Math.abs((rect2 != null ? Integer.valueOf(rect2.left) : d14).doubleValue()) + dDoubleValue2;
            double dDoubleValue3 = (edgeInsets != null ? Double.valueOf(edgeInsets.getBottom()) : num2).doubleValue();
            Rect rect3 = (Rect) uVar5.f128606b;
            double dAbs3 = Math.abs((rect3 != null ? Integer.valueOf(rect3.bottom) : d14).doubleValue()) + dDoubleValue3;
            double dDoubleValue4 = (edgeInsets != null ? Double.valueOf(edgeInsets.getRight()) : num2).doubleValue();
            Rect rect4 = (Rect) uVar7.f128606b;
            cameraOptionsCameraForCoordinates = this.mapboxMap.cameraForCoordinates(listK, cameraOptionsWithNoZoom, new EdgeInsets(dAbs, dAbs2, dAbs3, Math.abs((rect4 != null ? Integer.valueOf(rect4.right) : d14).doubleValue()) + dDoubleValue4), null, null);
            dValueOf = d14;
            z14 = z15;
            uVar = uVar8;
            uVar2 = uVar7;
            uVar3 = uVar6;
            uVar4 = uVar5;
            num = num2;
            i14 = 0;
        }
        return invokeCallbackAndReturn(CameraOptionsUtils.isEmpty(cameraOptionsCameraForCoordinates) ? null : cameraOptionsCameraForCoordinates, resultCallback);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl$buildAttachStateListener$1] */
    private final AnonymousClass1 buildAttachStateListener(final View view2, final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, final ViewTreeObserver.OnDrawListener onDrawListener) {
        return new View.OnAttachStateChangeListener() { // from class: com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl.buildAttachStateListener.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v14) {
                v14.getClass();
                view2.getViewTreeObserver().addOnDrawListener(onDrawListener);
                view2.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v14) {
                v14.getClass();
                view2.getViewTreeObserver().removeOnDrawListener(onDrawListener);
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        };
    }

    private final ViewTreeObserver.OnDrawListener buildDrawListener(final ViewAnnotation viewAnnotation) {
        return new ViewTreeObserver.OnDrawListener() { // from class: com.mapbox.maps.viewannotation.b
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                ViewAnnotationManagerImpl.buildDrawListener$lambda$21(viewAnnotation, this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildDrawListener$lambda$21(ViewAnnotation viewAnnotation, ViewAnnotationManagerImpl viewAnnotationManagerImpl) {
        viewAnnotation.getClass();
        viewAnnotationManagerImpl.getClass();
        if (viewAnnotation.getHandleVisibilityAutomatically()) {
            boolean z14 = viewAnnotation.getView().getVisibility() == 0;
            if (z14 && viewAnnotation.isVisible()) {
                return;
            }
            if (z14 || viewAnnotation.getVisibility() != ViewAnnotationVisibility.INVISIBLE) {
                if (z14 || viewAnnotation.getVisibility() != ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED) {
                    if (z14) {
                        ViewAnnotation viewAnnotation2 = viewAnnotationManagerImpl.viewAnnotations.get(viewAnnotation.getId());
                        if (viewAnnotation2 != null) {
                            viewAnnotation2.setPositioned(false);
                        }
                        viewAnnotation.getView().setVisibility(4);
                    }
                    viewAnnotationManagerImpl.updateVisibilityAndNotifyUpdateListeners(viewAnnotation, z14 ? ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED : ViewAnnotationVisibility.INVISIBLE);
                    Expected viewAnnotationOptions$maps_sdk_release = viewAnnotationManagerImpl.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
                    if (viewAnnotationOptions$maps_sdk_release.isError()) {
                        throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
                    }
                    ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
                    if (viewAnnotationOptions != null ? s.g(viewAnnotationOptions.getVisible(), Boolean.valueOf(z14)) : false) {
                        return;
                    }
                    MapboxMap mapboxMap = viewAnnotationManagerImpl.mapboxMap;
                    String id3 = viewAnnotation.getId();
                    ViewAnnotationOptions viewAnnotationOptionsBuild = new ViewAnnotationOptions.Builder().visible(Boolean.valueOf(z14)).build();
                    viewAnnotationOptionsBuild.getClass();
                    Expected expectedUpdateViewAnnotation$maps_sdk_release = mapboxMap.updateViewAnnotation$maps_sdk_release(id3, viewAnnotationOptionsBuild);
                    if (expectedUpdateViewAnnotation$maps_sdk_release.isError()) {
                        throw new MapboxViewAnnotationException((String) expectedUpdateViewAnnotation$maps_sdk_release.getError());
                    }
                    expectedUpdateViewAnnotation$maps_sdk_release.getValue();
                }
            }
        }
    }

    private final ViewTreeObserver.OnGlobalLayoutListener buildGlobalLayoutListener(final ViewAnnotation viewAnnotation) {
        return new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.mapbox.maps.viewannotation.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewAnnotationManagerImpl.buildGlobalLayoutListener$lambda$22(viewAnnotation, this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildGlobalLayoutListener$lambda$22(ViewAnnotation viewAnnotation, ViewAnnotationManagerImpl viewAnnotationManagerImpl) {
        viewAnnotation.getClass();
        viewAnnotationManagerImpl.getClass();
        if (viewAnnotation.getMeasuredWidth() != -1 && viewAnnotation.getView().getMeasuredWidth() > 0 && viewAnnotation.getView().getMeasuredWidth() != viewAnnotation.getMeasuredWidth()) {
            viewAnnotation.setMeasuredWidth(viewAnnotation.getView().getMeasuredWidth());
            MapboxMap mapboxMap = viewAnnotationManagerImpl.mapboxMap;
            String id3 = viewAnnotation.getId();
            ViewAnnotationOptions viewAnnotationOptionsBuild = new ViewAnnotationOptions.Builder().width(Double.valueOf(viewAnnotation.getView().getMeasuredWidth())).build();
            viewAnnotationOptionsBuild.getClass();
            Expected expectedUpdateViewAnnotation$maps_sdk_release = mapboxMap.updateViewAnnotation$maps_sdk_release(id3, viewAnnotationOptionsBuild);
            if (expectedUpdateViewAnnotation$maps_sdk_release.isError()) {
                throw new MapboxViewAnnotationException((String) expectedUpdateViewAnnotation$maps_sdk_release.getError());
            }
            expectedUpdateViewAnnotation$maps_sdk_release.getValue();
        }
        if (viewAnnotation.getMeasuredHeight() == -1 || viewAnnotation.getView().getMeasuredHeight() <= 0 || viewAnnotation.getView().getMeasuredHeight() == viewAnnotation.getMeasuredHeight()) {
            return;
        }
        viewAnnotation.setMeasuredHeight(viewAnnotation.getView().getMeasuredHeight());
        MapboxMap mapboxMap2 = viewAnnotationManagerImpl.mapboxMap;
        String id4 = viewAnnotation.getId();
        ViewAnnotationOptions viewAnnotationOptionsBuild2 = new ViewAnnotationOptions.Builder().height(Double.valueOf(viewAnnotation.getView().getMeasuredHeight())).build();
        viewAnnotationOptionsBuild2.getClass();
        Expected expectedUpdateViewAnnotation$maps_sdk_release2 = mapboxMap2.updateViewAnnotation$maps_sdk_release(id4, viewAnnotationOptionsBuild2);
        if (expectedUpdateViewAnnotation$maps_sdk_release2.isError()) {
            throw new MapboxViewAnnotationException((String) expectedUpdateViewAnnotation$maps_sdk_release2.getError());
        }
        expectedUpdateViewAnnotation$maps_sdk_release2.getValue();
    }

    private final CoordinateBounds calculateCoordinateBoundForAnnotation(ViewAnnotation viewAnnotation, Rect annotationFrame, Double zoom) {
        Point pointCoordinate = coordinate(viewAnnotation, viewAnnotation.getPositionDescriptor());
        if (pointCoordinate == null) {
            return null;
        }
        MapboxMap mapboxMap = this.mapboxMap;
        double metersPerPixelAtLatitude = zoom == null ? mapboxMap.getMetersPerPixelAtLatitude(pointCoordinate.latitude()) : mapboxMap.getMetersPerPixelAtLatitude(pointCoordinate.latitude(), zoom.doubleValue());
        ProjectedMeters projectedMetersProjectedMetersForCoordinate = this.mapboxMap.projectedMetersForCoordinate(pointCoordinate);
        double d14 = metersPerPixelAtLatitude / ((double) this.pixelRatio);
        double dAbs = (((double) Math.abs(annotationFrame.top)) * d14) + projectedMetersProjectedMetersForCoordinate.getNorthing();
        double dAbs2 = (((double) Math.abs(annotationFrame.right)) * d14) + projectedMetersProjectedMetersForCoordinate.getEasting();
        double northing = projectedMetersProjectedMetersForCoordinate.getNorthing() - (((double) Math.abs(annotationFrame.bottom)) * d14);
        double easting = projectedMetersProjectedMetersForCoordinate.getEasting() - (((double) Math.abs(annotationFrame.left)) * d14);
        ProjectedMeters projectedMeters = new ProjectedMeters(dAbs, dAbs2);
        return new CoordinateBounds(this.mapboxMap.coordinateForProjectedMeters(new ProjectedMeters(northing, easting)), this.mapboxMap.coordinateForProjectedMeters(projectedMeters));
    }

    private final CameraOptions cameraForAnnotationsImpl(List<? extends View> annotations, EdgeInsets edgeInsets, Double bearing, Double pitch, l<? super CameraOptions, Unit> resultCallback) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : annotations) {
            if (((View) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        ArrayList<ViewAnnotation> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            View view2 = (View) it.next();
            for (Object obj3 : this.viewAnnotations.values()) {
                if (s.g(((ViewAnnotation) obj3).getView(), view2)) {
                    obj2 = obj3;
                    break;
                }
            }
            ViewAnnotation viewAnnotation = (ViewAnnotation) obj2;
            if (viewAnnotation != null) {
                arrayList2.add(viewAnnotation);
            }
        }
        if (arrayList2.isEmpty()) {
            return invokeCallbackAndReturn(null, resultCallback);
        }
        ArrayList arrayList3 = new ArrayList();
        for (ViewAnnotation viewAnnotation2 : arrayList2) {
            Point pointCoordinate = coordinate(viewAnnotation2, viewAnnotation2.getPositionDescriptor());
            if (pointCoordinate != null) {
                arrayList3.add(pointCoordinate);
            }
        }
        CameraOptions.Builder builder = new CameraOptions.Builder();
        builder.pitch(pitch);
        builder.bearing(bearing);
        CameraOptions cameraOptionsBuild = builder.build();
        cameraOptionsBuild.getClass();
        MapboxMap mapboxMap = this.mapboxMap;
        if (resultCallback == null) {
            return adjustCameraForAnnotations(mapboxMap.cameraForCoordinates(arrayList3, cameraOptionsBuild, new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d), null, null), edgeInsets, arrayList2, cameraOptionsBuild, null);
        }
        mapboxMap.cameraForCoordinates(arrayList3, cameraOptionsBuild, new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d), null, null, new C42531(edgeInsets, arrayList2, cameraOptionsBuild, resultCallback));
        return null;
    }

    private final Point coordinate(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor) {
        Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
        if (viewAnnotationOptions$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
        }
        ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
        if (viewAnnotationOptions == null) {
            return null;
        }
        AnnotatedFeature annotatedFeature = viewAnnotationOptions.getAnnotatedFeature();
        annotatedFeature.getClass();
        if (!annotatedFeature.isGeometry()) {
            if (delegatingViewAnnotationPositionDescriptor != null) {
                return delegatingViewAnnotationPositionDescriptor.getAnchorCoordinate();
            }
            return null;
        }
        AnnotatedFeature annotatedFeature2 = viewAnnotationOptions.getAnnotatedFeature();
        annotatedFeature2.getClass();
        Geometry geometry = annotatedFeature2.getGeometry();
        if (geometry instanceof Point) {
            return (Point) geometry;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final p<View, ViewAnnotationOptions> findByAnnotatedLayerFeature(AnnotatedLayerFeature annotatedLayerFeature) {
        Object next;
        AnnotatedFeature annotatedFeature;
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ViewAnnotation> entry : map.entrySet()) {
            String key = entry.getKey();
            View view2 = entry.getValue().getView();
            Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(key);
            if (viewAnnotationOptions$maps_sdk_release.isError()) {
                throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
            }
            arrayList.add(new p(view2, viewAnnotationOptions$maps_sdk_release.getValue()));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) ((p) next).f128595b;
            if (viewAnnotationOptions != null && (annotatedFeature = viewAnnotationOptions.getAnnotatedFeature()) != null && annotatedFeature.isAnnotatedLayerFeature()) {
                AnnotatedFeature annotatedFeature2 = viewAnnotationOptions.getAnnotatedFeature();
                if (s.g(annotatedFeature2 != null ? annotatedFeature2.getAnnotatedLayerFeature() : null, annotatedLayerFeature)) {
                    break;
                }
            }
        }
        p<View, ViewAnnotationOptions> pVar = (p) next;
        return pVar == null ? new p<>(null, null) : pVar;
    }

    private final /* synthetic */ <V> V getValue(Expected<String, V> expected) {
        if (expected.isError()) {
            throw new MapboxViewAnnotationException(expected.getError());
        }
        return expected.getValue();
    }

    @MapboxExperimental
    public static /* synthetic */ void getViewAnnotationAvoidLayers$annotations() {
    }

    private final Rect getViewAnnotationOptionsFrame(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor positionDescriptor) {
        int iDoubleValue;
        int iDoubleValue2;
        ViewAnnotationAnchorConfig viewAnnotationAnchorConfigBuild;
        Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
        if (viewAnnotationOptions$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
        }
        ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
        if (viewAnnotationOptions == null || viewAnnotationOptions.getWidth() == null || viewAnnotationOptions.getHeight() == null) {
            return null;
        }
        Double width = viewAnnotationOptions.getWidth();
        width.getClass();
        if (width.doubleValue() > 0.0d) {
            Double width2 = viewAnnotationOptions.getWidth();
            width2.getClass();
            iDoubleValue = (int) (width2.doubleValue() * 0.5d);
        } else {
            iDoubleValue = 0;
        }
        Double height = viewAnnotationOptions.getHeight();
        height.getClass();
        if (height.doubleValue() > 0.0d) {
            Double height2 = viewAnnotationOptions.getHeight();
            height2.getClass();
            iDoubleValue2 = (int) (height2.doubleValue() * 0.5d);
        } else {
            iDoubleValue2 = 0;
        }
        int i14 = -iDoubleValue;
        int i15 = -iDoubleValue2;
        Rect rect = new Rect(i14, i15, iDoubleValue, iDoubleValue2);
        if (positionDescriptor == null || (viewAnnotationAnchorConfigBuild = positionDescriptor.getAnchorConfig()) == null) {
            viewAnnotationAnchorConfigBuild = new ViewAnnotationAnchorConfig.Builder().anchor(ViewAnnotationAnchor.CENTER).build();
        }
        switch (WhenMappings.$EnumSwitchMapping$0[viewAnnotationAnchorConfigBuild.getAnchor().ordinal()]) {
            case 1:
                rect.offset(0, iDoubleValue2);
                break;
            case 2:
                rect.offset(iDoubleValue, iDoubleValue2);
                break;
            case 3:
                rect.offset(i14, iDoubleValue2);
                break;
            case 4:
                rect.offset(0, i15);
                break;
            case 5:
                rect.offset(iDoubleValue, i15);
                break;
            case 6:
                rect.offset(i14, i15);
                break;
            case 7:
                rect.offset(iDoubleValue, 0);
                break;
            case 8:
                rect.offset(i14, 0);
                break;
            default:
                rect.offset(0, 0);
                break;
        }
        rect.offset((int) viewAnnotationAnchorConfigBuild.getOffsetX(), (int) viewAnnotationAnchorConfigBuild.getOffsetY());
        return rect;
    }

    public static /* synthetic */ void getViewUpdatedListenerSet$maps_sdk_release$annotations() {
    }

    private final CameraOptions invokeCallbackAndReturn(CameraOptions camera, l<? super CameraOptions, Unit> callback) {
        CameraOptions cameraOptionsBuild;
        if (callback != null) {
            if (camera == null) {
                cameraOptionsBuild = new CameraOptions.Builder().build();
                cameraOptionsBuild.getClass();
            } else {
                cameraOptionsBuild = camera;
            }
            callback.invoke(cameraOptionsBuild);
        }
        return camera;
    }

    private final void measureView(View view2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        boolean z14 = view2.getTag(R.id.composeView) != null;
        if (z14) {
            this.viewAnnotationsLayout.addView(view2);
        }
        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        if (z14) {
            this.viewAnnotationsLayout.removeView(view2);
        }
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
    }

    private final void notifyAnchorCoordinateListeners(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor newPositionDescriptor) {
        DelegatingViewAnnotationPositionDescriptor positionDescriptor = viewAnnotation.getPositionDescriptor();
        if (s.g(positionDescriptor != null ? positionDescriptor.getAnchorCoordinate() : null, newPositionDescriptor.getAnchorCoordinate())) {
            return;
        }
        for (OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener : this.viewUpdatedListenerSet) {
            View view2 = viewAnnotation.getView();
            Point anchorCoordinate = newPositionDescriptor.getAnchorCoordinate();
            anchorCoordinate.getClass();
            onViewAnnotationUpdatedListener.onViewAnnotationAnchorCoordinateUpdated(view2, anchorCoordinate);
        }
    }

    private final void notifyAnchorListeners(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor newPositionDescriptor) {
        DelegatingViewAnnotationPositionDescriptor positionDescriptor = viewAnnotation.getPositionDescriptor();
        if (s.g(positionDescriptor != null ? positionDescriptor.getAnchorConfig() : null, newPositionDescriptor.getAnchorConfig())) {
            return;
        }
        for (OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener : this.viewUpdatedListenerSet) {
            View view2 = viewAnnotation.getView();
            ViewAnnotationAnchorConfig anchorConfig = newPositionDescriptor.getAnchorConfig();
            anchorConfig.getClass();
            onViewAnnotationUpdatedListener.onViewAnnotationAnchorUpdated(view2, anchorConfig);
        }
    }

    private final void notifyPositionListeners(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor newPositionDescriptor) {
        DelegatingViewAnnotationPositionDescriptor positionDescriptor = viewAnnotation.getPositionDescriptor();
        if (s.g(positionDescriptor != null ? positionDescriptor.getLeftTopCoordinate() : null, newPositionDescriptor.getLeftTopCoordinate())) {
            DelegatingViewAnnotationPositionDescriptor positionDescriptor2 = viewAnnotation.getPositionDescriptor();
            if (s.c(positionDescriptor2 != null ? Double.valueOf(positionDescriptor2.getWidth()) : null, newPositionDescriptor.getWidth())) {
                DelegatingViewAnnotationPositionDescriptor positionDescriptor3 = viewAnnotation.getPositionDescriptor();
                if (s.c(positionDescriptor3 != null ? Double.valueOf(positionDescriptor3.getHeight()) : null, newPositionDescriptor.getHeight())) {
                    return;
                }
            }
        }
        for (OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener : this.viewUpdatedListenerSet) {
            View view2 = viewAnnotation.getView();
            ScreenCoordinate leftTopCoordinate = newPositionDescriptor.getLeftTopCoordinate();
            leftTopCoordinate.getClass();
            onViewAnnotationUpdatedListener.onViewAnnotationPositionUpdated(view2, leftTopCoordinate, newPositionDescriptor.getWidth(), newPositionDescriptor.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDelegatingViewAnnotationPositionsUpdate$lambda$20(ViewAnnotationManagerImpl viewAnnotationManagerImpl, List list, long j8) {
        viewAnnotationManagerImpl.getClass();
        list.getClass();
        viewAnnotationManagerImpl.positionAnnotationViews(list);
    }

    private final void positionAnnotationViews(List<DelegatingViewAnnotationPositionDescriptor> updatedPositionDescriptors) {
        boolean zNeedToReorderZ$maps_sdk_release = INSTANCE.needToReorderZ$maps_sdk_release(this.currentPositionDescriptors, updatedPositionDescriptors);
        this.currentPositionDescriptors = updatedPositionDescriptors;
        for (DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor : updatedPositionDescriptors) {
            ViewAnnotation viewAnnotation = this.viewAnnotations.get(delegatingViewAnnotationPositionDescriptor.getIdentifier());
            if (viewAnnotation != null) {
                View view2 = viewAnnotation.getView();
                view2.setTranslationX((float) delegatingViewAnnotationPositionDescriptor.getLeftTopCoordinate().getX());
                view2.setTranslationY((float) delegatingViewAnnotationPositionDescriptor.getLeftTopCoordinate().getY());
                ViewGroup.LayoutParams viewLayoutParams = viewAnnotation.getViewLayoutParams();
                if (viewAnnotation.getMeasuredWidth() == -1) {
                    viewLayoutParams.width = (int) delegatingViewAnnotationPositionDescriptor.getWidth();
                }
                if (viewAnnotation.getMeasuredHeight() == -1) {
                    viewLayoutParams.height = (int) delegatingViewAnnotationPositionDescriptor.getHeight();
                }
                if (!viewAnnotation.isVisible() && this.viewAnnotationsLayout.indexOfChild(viewAnnotation.getView()) == -1) {
                    viewAnnotation.setPositioned(true);
                    this.viewAnnotationsLayout.addView(viewAnnotation.getView(), viewAnnotation.getViewLayoutParams());
                    updateVisibilityAndNotifyUpdateListeners(viewAnnotation, viewAnnotation.getView().getVisibility() == 0 ? ViewAnnotationVisibility.VISIBLE_AND_POSITIONED : ViewAnnotationVisibility.INVISIBLE);
                }
                if (!viewAnnotation.isPositioned()) {
                    viewAnnotation.setPositioned(true);
                    viewAnnotation.getView().setVisibility(0);
                    updateVisibilityAndNotifyUpdateListeners(viewAnnotation, ViewAnnotationVisibility.VISIBLE_AND_POSITIONED);
                }
                notifyAnchorListeners(viewAnnotation, delegatingViewAnnotationPositionDescriptor);
                notifyAnchorCoordinateListeners(viewAnnotation, delegatingViewAnnotationPositionDescriptor);
                notifyPositionListeners(viewAnnotation, delegatingViewAnnotationPositionDescriptor);
                viewAnnotation.setPositionDescriptor(delegatingViewAnnotationPositionDescriptor);
                if (zNeedToReorderZ$maps_sdk_release) {
                    viewAnnotation.getView().bringToFront();
                }
            }
        }
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ViewAnnotation> entry : map.entrySet()) {
            if (entry.getValue().getView().getVisibility() == 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            List<DelegatingViewAnnotationPositionDescriptor> list = this.currentPositionDescriptors;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!s.g(((DelegatingViewAnnotationPositionDescriptor) it.next()).getIdentifier(), entry2.getKey()));
            }
            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
        }
        Iterator it3 = linkedHashMap2.entrySet().iterator();
        while (it3.hasNext()) {
            ViewAnnotation viewAnnotation2 = (ViewAnnotation) ((Map.Entry) it3.next()).getValue();
            this.viewAnnotationsLayout.removeView(viewAnnotation2.getView());
            updateVisibilityAndNotifyUpdateListeners(viewAnnotation2, ViewAnnotationVisibility.INVISIBLE);
        }
    }

    private final void prepareViewAnnotation(View inflatedView, ViewAnnotationOptions options) {
        measureView(inflatedView);
        ViewGroup.LayoutParams layoutParams = inflatedView.getLayoutParams();
        layoutParams.getClass();
        int measuredWidth = layoutParams.width;
        if (measuredWidth < 0) {
            measuredWidth = inflatedView.getMeasuredWidth();
        }
        int measuredHeight = layoutParams.height;
        if (measuredHeight < 0) {
            measuredHeight = inflatedView.getMeasuredHeight();
        }
        ViewAnnotationOptions.Builder builder = options.toBuilder();
        Double width = options.getWidth();
        if (width == null) {
            width = Double.valueOf(measuredWidth);
        }
        ViewAnnotationOptions.Builder builderWidth = builder.width(width);
        Double height = options.getHeight();
        if (height == null) {
            height = Double.valueOf(measuredHeight);
        }
        ViewAnnotationOptions viewAnnotationOptionsBuild = builderWidth.height(height).build();
        boolean z14 = options.getVisible() == null;
        ViewAnnotationVisibility viewAnnotationVisibility = ViewAnnotationVisibility.INITIAL;
        if (options.getWidth() != null) {
            measuredWidth = -1;
        }
        ViewAnnotation viewAnnotation = new ViewAnnotation(inflatedView, layoutParams, null, z14, viewAnnotationVisibility, measuredWidth, options.getHeight() != null ? -1 : measuredHeight, null, false, null, 516, null);
        viewAnnotation.setAttachStateListener(buildAttachStateListener(viewAnnotation.getView(), buildGlobalLayoutListener(viewAnnotation), buildDrawListener(viewAnnotation)));
        inflatedView.addOnAttachStateChangeListener(viewAnnotation.getAttachStateListener());
        this.viewAnnotations.put(viewAnnotation.getId(), viewAnnotation);
        MapboxMap mapboxMap = this.mapboxMap;
        String id3 = viewAnnotation.getId();
        viewAnnotationOptionsBuild.getClass();
        Expected expectedAddViewAnnotation$maps_sdk_release = mapboxMap.addViewAnnotation$maps_sdk_release(id3, viewAnnotationOptionsBuild);
        if (expectedAddViewAnnotation$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) expectedAddViewAnnotation$maps_sdk_release.getError());
        }
        expectedAddViewAnnotation$maps_sdk_release.getValue();
    }

    private final void remove(ViewAnnotation annotation) {
        this.viewAnnotationsLayout.removeView(annotation.getView());
        updateVisibilityAndNotifyUpdateListeners(annotation, ViewAnnotationVisibility.INVISIBLE);
        View.OnAttachStateChangeListener attachStateListener = annotation.getAttachStateListener();
        if (attachStateListener != null) {
            attachStateListener.onViewDetachedFromWindow(annotation.getView());
        }
        annotation.getView().removeOnAttachStateChangeListener(annotation.getAttachStateListener());
        annotation.setAttachStateListener(null);
        Expected expectedRemoveViewAnnotation$maps_sdk_release = this.mapboxMap.removeViewAnnotation$maps_sdk_release(annotation.getId());
        if (expectedRemoveViewAnnotation$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) expectedRemoveViewAnnotation$maps_sdk_release.getError());
        }
        expectedRemoveViewAnnotation$maps_sdk_release.getValue();
    }

    private final void updateVisibilityAndNotifyUpdateListeners(ViewAnnotation annotation, ViewAnnotationVisibility currentVisibility) {
        if (annotation.getVisibility() != currentVisibility) {
            if (annotation.getVisibility() == ViewAnnotationVisibility.INITIAL && currentVisibility == ViewAnnotationVisibility.INVISIBLE) {
                return;
            }
            boolean zIsVisible = annotation.isVisible();
            boolean z14 = currentVisibility == ViewAnnotationVisibility.VISIBLE_AND_POSITIONED || currentVisibility == ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED;
            annotation.setVisibility(currentVisibility);
            if (this.viewUpdatedListenerSet.isEmpty() || z14 == zIsVisible) {
                return;
            }
            Iterator<T> it = this.viewUpdatedListenerSet.iterator();
            while (it.hasNext()) {
                ((OnViewAnnotationUpdatedListener) it.next()).onViewAnnotationVisibilityUpdated(annotation.getView(), z14);
            }
        }
    }

    private final void validateOptions(ViewAnnotationOptions options) {
        if (options.getAnnotatedFeature() != null) {
            return;
        }
        h.s(EXCEPTION_TEXT_FEATURE_IS_NULL);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void addOnViewAnnotationUpdatedListener(OnViewAnnotationUpdatedListener listener) {
        listener.getClass();
        this.viewUpdatedListenerSet.add(listener);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void addViewAnnotation(View view2, ViewAnnotationOptions options) {
        view2.getClass();
        options.getClass();
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        if (!map.isEmpty()) {
            Iterator<Map.Entry<String, ViewAnnotation>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (s.g(it.next().getValue().getView(), view2)) {
                    throw new MapboxViewAnnotationException("Trying to add view annotation that was already added before! Please consider deleting annotation view (" + view2 + ") beforehand.");
                }
            }
        }
        validateOptions(options);
        prepareViewAnnotation(view2, options);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    @MapboxDelicateApi
    public CameraOptions cameraForAnnotations(List<? extends View> annotations, EdgeInsets edgeInsets, Double bearing, Double pitch) {
        annotations.getClass();
        return cameraForAnnotationsImpl(annotations, edgeInsets, bearing, pitch, null);
    }

    public final void destroy() {
        this.mapboxMap.setViewAnnotationPositionsUpdateListener$maps_sdk_release(null);
        this.viewUpdatedListenerSet.clear();
        removeAllViewAnnotations();
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public Map<View, ViewAnnotationOptions> getAnnotations() {
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ViewAnnotation>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            ViewAnnotation value = it.next().getValue();
            Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(value.getId());
            if (viewAnnotationOptions$maps_sdk_release.isError()) {
                throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
            }
            ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
            p pVar = viewAnnotationOptions != null ? new p(value.getView(), viewAnnotationOptions) : null;
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return u0.l(arrayList);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public View getViewAnnotation(AnnotatedLayerFeature annotatedLayerFeature) {
        annotatedLayerFeature.getClass();
        return findByAnnotatedLayerFeature(annotatedLayerFeature).f128594a;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public HashSet<String> getViewAnnotationAvoidLayers() {
        return this.mapboxMap.getViewAnnotationAvoidLayers$maps_sdk_release();
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public ViewAnnotationOptions getViewAnnotationOptions(View view2) {
        Object next;
        view2.getClass();
        Iterator<T> it = this.viewAnnotations.values().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((ViewAnnotation) next).getView(), view2));
        ViewAnnotation viewAnnotation = (ViewAnnotation) next;
        if (viewAnnotation == null) {
            return null;
        }
        Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
        if (viewAnnotationOptions$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
        }
        return (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public ViewAnnotationUpdateMode getViewAnnotationUpdateMode() {
        return this.renderThread.getViewAnnotationMode();
    }

    public final CopyOnWriteArraySet<OnViewAnnotationUpdatedListener> getViewUpdatedListenerSet$maps_sdk_release() {
        return this.viewUpdatedListenerSet;
    }

    @Override // com.mapbox.maps.DelegatingViewAnnotationPositionsUpdateListener
    public void onDelegatingViewAnnotationPositionsUpdate(List<DelegatingViewAnnotationPositionDescriptor> positions) {
        positions.getClass();
        if (s.g(Looper.myLooper(), Looper.getMainLooper())) {
            final List<DelegatingViewAnnotationPositionDescriptor> list = this.updatedPositionDescriptors;
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.mapbox.maps.viewannotation.a
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j8) {
                    ViewAnnotationManagerImpl.onDelegatingViewAnnotationPositionsUpdate$lambda$20(this.f54619a, list, j8);
                }
            });
        } else {
            this.renderThread.setNeedViewAnnotationSync$maps_sdk_release(true);
            this.updatedPositionDescriptors = positions;
        }
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void removeAllViewAnnotations() {
        Iterator<Map.Entry<String, ViewAnnotation>> it = this.viewAnnotations.entrySet().iterator();
        while (it.hasNext()) {
            remove(it.next().getValue());
            it.remove();
        }
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void removeOnViewAnnotationUpdatedListener(OnViewAnnotationUpdatedListener listener) {
        listener.getClass();
        this.viewUpdatedListenerSet.remove(listener);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public boolean removeViewAnnotation(View view2) {
        Object next;
        view2.getClass();
        Iterator<T> it = this.viewAnnotations.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((ViewAnnotation) ((Map.Entry) next).getValue()).getView(), view2));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        String str = (String) entry.getKey();
        ViewAnnotation viewAnnotation = (ViewAnnotation) entry.getValue();
        this.viewAnnotations.remove(str);
        remove(viewAnnotation);
        return true;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void setViewAnnotationAvoidLayers(HashSet<String> hashSet) {
        hashSet.getClass();
        this.mapboxMap.setViewAnnotationAvoidLayers$maps_sdk_release(hashSet);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void setViewAnnotationUpdateMode(ViewAnnotationUpdateMode mode) {
        mode.getClass();
        this.renderThread.setViewAnnotationMode$maps_sdk_release(mode);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public boolean updateViewAnnotation(View view2, ViewAnnotationOptions options) {
        Object next;
        view2.getClass();
        options.getClass();
        Iterator<T> it = this.viewAnnotations.values().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((ViewAnnotation) next).getView(), view2));
        ViewAnnotation viewAnnotation = (ViewAnnotation) next;
        if (viewAnnotation == null) {
            return false;
        }
        viewAnnotation.setHandleVisibilityAutomatically(options.getVisible() == null);
        if (options.getWidth() != null) {
            viewAnnotation.setMeasuredWidth(-1);
        }
        if (options.getHeight() != null) {
            viewAnnotation.setMeasuredHeight(-1);
        }
        Expected expectedUpdateViewAnnotation$maps_sdk_release = this.mapboxMap.updateViewAnnotation$maps_sdk_release(viewAnnotation.getId(), options);
        if (expectedUpdateViewAnnotation$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) expectedUpdateViewAnnotation$maps_sdk_release.getError());
        }
        expectedUpdateViewAnnotation$maps_sdk_release.getValue();
        return true;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0001¢\u0006\u0002\b\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$Companion;", "", "()V", "EXCEPTION_TEXT_FEATURE_IS_NULL", "", "MAX_ADJUST_BOUNDS_COUNTER", "", "TAG", "USER_FIXED_DIMENSION", "needToReorderZ", "", "currentPositionDescriptors", "", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;", "updatedPositionDescriptors", "needToReorderZ$maps_sdk_release", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final boolean needToReorderZ$maps_sdk_release(List<DelegatingViewAnnotationPositionDescriptor> currentPositionDescriptors, List<DelegatingViewAnnotationPositionDescriptor> updatedPositionDescriptors) {
            currentPositionDescriptors.getClass();
            updatedPositionDescriptors.getClass();
            if (currentPositionDescriptors.size() < updatedPositionDescriptors.size()) {
                return true;
            }
            if (!currentPositionDescriptors.isEmpty() && !updatedPositionDescriptors.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i14 = 0;
                int i15 = 0;
                while (i14 < currentPositionDescriptors.size() && i15 < updatedPositionDescriptors.size()) {
                    if (s.g(currentPositionDescriptors.get(i14).getIdentifier(), updatedPositionDescriptors.get(i15).getIdentifier())) {
                        i14++;
                        i15++;
                    } else {
                        if (linkedHashSet.contains(updatedPositionDescriptors.get(i15).getIdentifier())) {
                            return true;
                        }
                        while (i14 < currentPositionDescriptors.size() && !s.g(currentPositionDescriptors.get(i14).getIdentifier(), updatedPositionDescriptors.get(i15).getIdentifier())) {
                            String identifier = currentPositionDescriptors.get(i14).getIdentifier();
                            identifier.getClass();
                            linkedHashSet.add(identifier);
                            i14++;
                        }
                    }
                }
                while (i15 < updatedPositionDescriptors.size()) {
                    if (linkedHashSet.contains(updatedPositionDescriptors.get(i15).getIdentifier())) {
                        return true;
                    }
                    i15++;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void cameraForAnnotations(List<? extends View> annotations, EdgeInsets edgeInsets, Double bearing, Double pitch, l<? super CameraOptions, Unit> result) {
        annotations.getClass();
        result.getClass();
        cameraForAnnotationsImpl(annotations, edgeInsets, bearing, pitch, result);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl$cameraForAnnotationsImpl$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cameraForViewAnnotationPoints", "Lcom/mapbox/maps/CameraOptions;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C42531 extends w implements l<CameraOptions, Unit> {
        final /* synthetic */ CameraOptions $cameraOptionsWithNoZoom;
        final /* synthetic */ EdgeInsets $edgeInsets;
        final /* synthetic */ l<CameraOptions, Unit> $resultCallback;
        final /* synthetic */ List<ViewAnnotation> $viewAnnotations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C42531(EdgeInsets edgeInsets, List<ViewAnnotation> list, CameraOptions cameraOptions, l<? super CameraOptions, Unit> lVar) {
            super(1);
            this.$edgeInsets = edgeInsets;
            this.$viewAnnotations = list;
            this.$cameraOptionsWithNoZoom = cameraOptions;
            this.$resultCallback = lVar;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CameraOptions cameraOptions) {
            cameraOptions.getClass();
            ViewAnnotationManagerImpl.this.adjustCameraForAnnotations(cameraOptions, this.$edgeInsets, this.$viewAnnotations, this.$cameraOptionsWithNoZoom, this.$resultCallback);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(CameraOptions cameraOptions) {
            invoke2(cameraOptions);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b1\b\u0082\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0013HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003Jq\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010@\u001a\u00020\t2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\rHÖ\u0001J\t\u0010C\u001a\u00020\u0013HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0011\u0010 \u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006D"}, d2 = {"Lcom/mapbox/maps/viewannotation/ViewAnnotationManagerImpl$ViewAnnotation;", "", "view", "Landroid/view/View;", "viewLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "attachStateListener", "Landroid/view/View$OnAttachStateChangeListener;", "handleVisibilityAutomatically", "", "visibility", "Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;", "measuredWidth", "", "measuredHeight", "positionDescriptor", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;", "isPositioned", TtmlNode.ATTR_ID, "", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;Landroid/view/View$OnAttachStateChangeListener;ZLcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;IILcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;ZLjava/lang/String;)V", "getAttachStateListener", "()Landroid/view/View$OnAttachStateChangeListener;", "setAttachStateListener", "(Landroid/view/View$OnAttachStateChangeListener;)V", "getHandleVisibilityAutomatically", "()Z", "setHandleVisibilityAutomatically", "(Z)V", "getId", "()Ljava/lang/String;", "setPositioned", "isVisible", "getMeasuredHeight", "()I", "setMeasuredHeight", "(I)V", "getMeasuredWidth", "setMeasuredWidth", "getPositionDescriptor", "()Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;", "setPositionDescriptor", "(Lcom/mapbox/maps/DelegatingViewAnnotationPositionDescriptor;)V", "getView", "()Landroid/view/View;", "getViewLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "setViewLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "getVisibility", "()Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;", "setVisibility", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationVisibility;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ViewAnnotation {
        private View.OnAttachStateChangeListener attachStateListener;
        private boolean handleVisibilityAutomatically;
        private final String id;
        private boolean isPositioned;
        private int measuredHeight;
        private int measuredWidth;
        private DelegatingViewAnnotationPositionDescriptor positionDescriptor;
        private final View view;
        private ViewGroup.LayoutParams viewLayoutParams;
        private ViewAnnotationVisibility visibility;

        public /* synthetic */ ViewAnnotation(View view2, ViewGroup.LayoutParams layoutParams, View.OnAttachStateChangeListener onAttachStateChangeListener, boolean z14, ViewAnnotationVisibility viewAnnotationVisibility, int i14, int i15, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor, boolean z15, String str, int i16, j jVar) {
            this(view2, layoutParams, (i16 & 4) != 0 ? null : onAttachStateChangeListener, z14, viewAnnotationVisibility, i14, i15, delegatingViewAnnotationPositionDescriptor, z15, (i16 & 512) != 0 ? f.c() : str);
        }

        public static /* synthetic */ ViewAnnotation copy$default(ViewAnnotation viewAnnotation, View view2, ViewGroup.LayoutParams layoutParams, View.OnAttachStateChangeListener onAttachStateChangeListener, boolean z14, ViewAnnotationVisibility viewAnnotationVisibility, int i14, int i15, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor, boolean z15, String str, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                view2 = viewAnnotation.view;
            }
            if ((i16 & 2) != 0) {
                layoutParams = viewAnnotation.viewLayoutParams;
            }
            if ((i16 & 4) != 0) {
                onAttachStateChangeListener = viewAnnotation.attachStateListener;
            }
            if ((i16 & 8) != 0) {
                z14 = viewAnnotation.handleVisibilityAutomatically;
            }
            if ((i16 & 16) != 0) {
                viewAnnotationVisibility = viewAnnotation.visibility;
            }
            if ((i16 & 32) != 0) {
                i14 = viewAnnotation.measuredWidth;
            }
            if ((i16 & 64) != 0) {
                i15 = viewAnnotation.measuredHeight;
            }
            if ((i16 & 128) != 0) {
                delegatingViewAnnotationPositionDescriptor = viewAnnotation.positionDescriptor;
            }
            if ((i16 & 256) != 0) {
                z15 = viewAnnotation.isPositioned;
            }
            if ((i16 & 512) != 0) {
                str = viewAnnotation.id;
            }
            boolean z16 = z15;
            String str2 = str;
            int i17 = i15;
            DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor2 = delegatingViewAnnotationPositionDescriptor;
            ViewAnnotationVisibility viewAnnotationVisibility2 = viewAnnotationVisibility;
            int i18 = i14;
            return viewAnnotation.copy(view2, layoutParams, onAttachStateChangeListener, z14, viewAnnotationVisibility2, i18, i17, delegatingViewAnnotationPositionDescriptor2, z16, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final View getView() {
            return this.view;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ViewGroup.LayoutParams getViewLayoutParams() {
            return this.viewLayoutParams;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final View.OnAttachStateChangeListener getAttachStateListener() {
            return this.attachStateListener;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getHandleVisibilityAutomatically() {
            return this.handleVisibilityAutomatically;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final ViewAnnotationVisibility getVisibility() {
            return this.visibility;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getMeasuredWidth() {
            return this.measuredWidth;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getMeasuredHeight() {
            return this.measuredHeight;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final DelegatingViewAnnotationPositionDescriptor getPositionDescriptor() {
            return this.positionDescriptor;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getIsPositioned() {
            return this.isPositioned;
        }

        public final ViewAnnotation copy(View view2, ViewGroup.LayoutParams viewLayoutParams, View.OnAttachStateChangeListener attachStateListener, boolean handleVisibilityAutomatically, ViewAnnotationVisibility visibility, int measuredWidth, int measuredHeight, DelegatingViewAnnotationPositionDescriptor positionDescriptor, boolean isPositioned, String id3) {
            view2.getClass();
            viewLayoutParams.getClass();
            visibility.getClass();
            id3.getClass();
            return new ViewAnnotation(view2, viewLayoutParams, attachStateListener, handleVisibilityAutomatically, visibility, measuredWidth, measuredHeight, positionDescriptor, isPositioned, id3);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewAnnotation)) {
                return false;
            }
            ViewAnnotation viewAnnotation = (ViewAnnotation) other;
            return s.g(this.view, viewAnnotation.view) && s.g(this.viewLayoutParams, viewAnnotation.viewLayoutParams) && s.g(this.attachStateListener, viewAnnotation.attachStateListener) && this.handleVisibilityAutomatically == viewAnnotation.handleVisibilityAutomatically && this.visibility == viewAnnotation.visibility && this.measuredWidth == viewAnnotation.measuredWidth && this.measuredHeight == viewAnnotation.measuredHeight && s.g(this.positionDescriptor, viewAnnotation.positionDescriptor) && this.isPositioned == viewAnnotation.isPositioned && s.g(this.id, viewAnnotation.id);
        }

        public final View.OnAttachStateChangeListener getAttachStateListener() {
            return this.attachStateListener;
        }

        public final boolean getHandleVisibilityAutomatically() {
            return this.handleVisibilityAutomatically;
        }

        public final String getId() {
            return this.id;
        }

        public final int getMeasuredHeight() {
            return this.measuredHeight;
        }

        public final int getMeasuredWidth() {
            return this.measuredWidth;
        }

        public final DelegatingViewAnnotationPositionDescriptor getPositionDescriptor() {
            return this.positionDescriptor;
        }

        public final View getView() {
            return this.view;
        }

        public final ViewGroup.LayoutParams getViewLayoutParams() {
            return this.viewLayoutParams;
        }

        public final ViewAnnotationVisibility getVisibility() {
            return this.visibility;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v16, types: [int] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v6, types: [int] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [int] */
        /* JADX WARN: Type inference failed for: r4v2 */
        public int hashCode() {
            int iHashCode = (this.viewLayoutParams.hashCode() + (this.view.hashCode() * 31)) * 31;
            View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
            int iHashCode2 = (iHashCode + (onAttachStateChangeListener == null ? 0 : onAttachStateChangeListener.hashCode())) * 31;
            boolean z14 = this.handleVisibilityAutomatically;
            ?? r14 = z14;
            if (z14) {
                r14 = 1;
            }
            int iD = q2.d(this.measuredHeight, q2.d(this.measuredWidth, (this.visibility.hashCode() + ((iHashCode2 + r14) * 31)) * 31, 31), 31);
            DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor = this.positionDescriptor;
            int iHashCode3 = (iD + (delegatingViewAnnotationPositionDescriptor != null ? delegatingViewAnnotationPositionDescriptor.hashCode() : 0)) * 31;
            boolean z15 = this.isPositioned;
            return this.id.hashCode() + ((iHashCode3 + (z15 ? 1 : z15)) * 31);
        }

        public final boolean isPositioned() {
            return this.isPositioned;
        }

        public final boolean isVisible() {
            ViewAnnotationVisibility viewAnnotationVisibility = this.visibility;
            return viewAnnotationVisibility == ViewAnnotationVisibility.VISIBLE_AND_POSITIONED || viewAnnotationVisibility == ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED;
        }

        public final void setAttachStateListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
            this.attachStateListener = onAttachStateChangeListener;
        }

        public final void setHandleVisibilityAutomatically(boolean z14) {
            this.handleVisibilityAutomatically = z14;
        }

        public final void setMeasuredHeight(int i14) {
            this.measuredHeight = i14;
        }

        public final void setMeasuredWidth(int i14) {
            this.measuredWidth = i14;
        }

        public final void setPositionDescriptor(DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor) {
            this.positionDescriptor = delegatingViewAnnotationPositionDescriptor;
        }

        public final void setPositioned(boolean z14) {
            this.isPositioned = z14;
        }

        public final void setViewLayoutParams(ViewGroup.LayoutParams layoutParams) {
            layoutParams.getClass();
            this.viewLayoutParams = layoutParams;
        }

        public final void setVisibility(ViewAnnotationVisibility viewAnnotationVisibility) {
            viewAnnotationVisibility.getClass();
            this.visibility = viewAnnotationVisibility;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("ViewAnnotation(view=");
            sb3.append(this.view);
            sb3.append(", viewLayoutParams=");
            sb3.append(this.viewLayoutParams);
            sb3.append(", attachStateListener=");
            sb3.append(this.attachStateListener);
            sb3.append(", handleVisibilityAutomatically=");
            sb3.append(this.handleVisibilityAutomatically);
            sb3.append(", visibility=");
            sb3.append(this.visibility);
            sb3.append(", measuredWidth=");
            sb3.append(this.measuredWidth);
            sb3.append(", measuredHeight=");
            sb3.append(this.measuredHeight);
            sb3.append(", positionDescriptor=");
            sb3.append(this.positionDescriptor);
            sb3.append(", isPositioned=");
            sb3.append(this.isPositioned);
            sb3.append(", id=");
            return a0.m(sb3, this.id, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public ViewAnnotation(View view2, ViewGroup.LayoutParams layoutParams, View.OnAttachStateChangeListener onAttachStateChangeListener, boolean z14, ViewAnnotationVisibility viewAnnotationVisibility, int i14, int i15, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor, boolean z15, String str) {
            view2.getClass();
            layoutParams.getClass();
            viewAnnotationVisibility.getClass();
            str.getClass();
            this.view = view2;
            this.viewLayoutParams = layoutParams;
            this.attachStateListener = onAttachStateChangeListener;
            this.handleVisibilityAutomatically = z14;
            this.visibility = viewAnnotationVisibility;
            this.measuredWidth = i14;
            this.measuredHeight = i15;
            this.positionDescriptor = delegatingViewAnnotationPositionDescriptor;
            this.isPositioned = z15;
            this.id = str;
        }
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public ViewAnnotationOptions getViewAnnotationOptions(AnnotatedLayerFeature annotatedLayerFeature) {
        annotatedLayerFeature.getClass();
        return findByAnnotatedLayerFeature(annotatedLayerFeature).f128595b;
    }

    public /* synthetic */ ViewAnnotationManagerImpl(MapView mapView, FrameLayout frameLayout, int i14, j jVar) {
        this(mapView, (i14 & 2) != 0 ? new FrameLayout(mapView.getContext()) : frameLayout);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public View addViewAnnotation(int resId, ViewAnnotationOptions options) {
        options.getClass();
        validateOptions(options);
        View viewInflate = LayoutInflater.from(this.viewAnnotationsLayout.getContext()).inflate(resId, (ViewGroup) this.viewAnnotationsLayout, false);
        viewInflate.getClass();
        prepareViewAnnotation(viewInflate, options);
        return viewInflate;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void addViewAnnotation(int resId, ViewAnnotationOptions options, q.a asyncInflater, l<? super View, Unit> asyncInflateCallback) {
        options.getClass();
        asyncInflater.getClass();
        asyncInflateCallback.getClass();
        validateOptions(options);
        FrameLayout frameLayout = this.viewAnnotationsLayout;
        a73.f fVar = new a73.f(this, 16, options, asyncInflateCallback);
        q.a.d dVar = asyncInflater.f141956c;
        q.a.c cVarAcquire = dVar.f141966b.acquire();
        if (cVarAcquire == null) {
            cVarAcquire = new q.a.c();
        }
        cVarAcquire.f141959a = asyncInflater;
        cVarAcquire.f141961c = resId;
        cVarAcquire.f141960b = frameLayout;
        cVarAcquire.f141963e = fVar;
        try {
            dVar.f141965a.put(cVarAcquire);
        } catch (InterruptedException e4) {
            q2.v("Failed to enqueue async inflate request", e4);
        }
    }
}
