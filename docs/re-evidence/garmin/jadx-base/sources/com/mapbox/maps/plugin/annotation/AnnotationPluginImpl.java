package com.mapbox.maps.plugin.annotation;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationManager;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationManager;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationManager;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J6\u0010\u0011\u001a\u001e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J,\u0010\u001b\u001a\u00020\u00102\"\u0010\u001c\u001a\u001e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000RD\u0010\u0007\u001a*\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n0\t0\b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/AnnotationPluginImpl;", "Lcom/mapbox/maps/plugin/annotation/AnnotationPlugin;", "()V", "delegateProvider", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "height", "", "managerList", "", "Ljava/lang/ref/WeakReference;", "Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "getManagerList$plugin_annotation_release$annotations", "getManagerList$plugin_annotation_release", "()Ljava/util/List;", "width", "cleanup", "", "createAnnotationManager", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/mapbox/maps/plugin/annotation/AnnotationType;", "annotationConfig", "Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;", "onDelegateProvider", "onSizeChanged", "onStyleChanged", TtmlNode.TAG_STYLE, "Lcom/mapbox/maps/MapboxStyleManager;", "removeAnnotationManager", "annotationManager", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AnnotationPluginImpl implements AnnotationPlugin {
    private MapDelegateProvider delegateProvider;
    private int height;
    private final List<WeakReference<AnnotationManager<?, ?, ?, ?, ?, ?, ?>>> managerList = new ArrayList();
    private int width;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            try {
                iArr[AnnotationType.PolygonAnnotation.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotationType.CircleAnnotation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotationType.PolylineAnnotation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnnotationType.PointAnnotation.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getManagerList$plugin_annotation_release$annotations() {
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        Iterator<T> it = this.managerList.iterator();
        while (it.hasNext()) {
            AnnotationManager annotationManager = (AnnotationManager) ((WeakReference) it.next()).get();
            if (annotationManager != null) {
                annotationManager.onDestroy();
            }
        }
        this.managerList.clear();
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationPlugin
    public AnnotationManager<?, ?, ?, ?, ?, ?, ?> createAnnotationManager(AnnotationType type, AnnotationConfig annotationConfig) {
        AnnotationManager<?, ?, ?, ?, ?, ?, ?> polygonAnnotationManager;
        type.getClass();
        int i14 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i14 == 1) {
            MapDelegateProvider mapDelegateProvider = this.delegateProvider;
            if (mapDelegateProvider == null) {
                s.m("delegateProvider");
                throw null;
            }
            polygonAnnotationManager = new PolygonAnnotationManager(mapDelegateProvider, annotationConfig);
        } else if (i14 == 2) {
            MapDelegateProvider mapDelegateProvider2 = this.delegateProvider;
            if (mapDelegateProvider2 == null) {
                s.m("delegateProvider");
                throw null;
            }
            polygonAnnotationManager = new CircleAnnotationManager(mapDelegateProvider2, annotationConfig);
        } else if (i14 == 3) {
            MapDelegateProvider mapDelegateProvider3 = this.delegateProvider;
            if (mapDelegateProvider3 == null) {
                s.m("delegateProvider");
                throw null;
            }
            polygonAnnotationManager = new PolylineAnnotationManager(mapDelegateProvider3, annotationConfig);
        } else {
            if (i14 != 4) {
                u0.r();
                return null;
            }
            MapDelegateProvider mapDelegateProvider4 = this.delegateProvider;
            if (mapDelegateProvider4 == null) {
                s.m("delegateProvider");
                throw null;
            }
            polygonAnnotationManager = new PointAnnotationManager(mapDelegateProvider4, annotationConfig);
        }
        polygonAnnotationManager.onSizeChanged(this.width, this.height);
        this.managerList.add(new WeakReference<>(polygonAnnotationManager));
        return polygonAnnotationManager;
    }

    public final List<WeakReference<AnnotationManager<?, ?, ?, ?, ?, ?, ?>>> getManagerList$plugin_annotation_release() {
        return this.managerList;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        AnnotationPlugin.DefaultImpls.initialize(this);
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(MapDelegateProvider delegateProvider) {
        delegateProvider.getClass();
        this.delegateProvider = delegateProvider;
    }

    @Override // com.mapbox.maps.plugin.MapSizePlugin
    public void onSizeChanged(int width, int height) {
        this.width = width;
        this.height = height;
        Iterator<T> it = this.managerList.iterator();
        while (it.hasNext()) {
            AnnotationManager annotationManager = (AnnotationManager) ((WeakReference) it.next()).get();
            if (annotationManager != null) {
                annotationManager.onSizeChanged(width, height);
            }
        }
    }

    @Override // com.mapbox.maps.plugin.MapStyleObserverPlugin
    public void onStyleChanged(MapboxStyleManager style) {
        style.getClass();
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationPlugin
    public void removeAnnotationManager(AnnotationManager<?, ?, ?, ?, ?, ?, ?> annotationManager) {
        annotationManager.getClass();
        int i14 = 0;
        for (Object obj : this.managerList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            AnnotationManager annotationManager2 = (AnnotationManager) ((WeakReference) obj).get();
            if (annotationManager2 != null && annotationManager2.equals(annotationManager)) {
                this.managerList.remove(i14);
                annotationManager.onDestroy();
                return;
            }
            i14 = i15;
        }
    }
}
