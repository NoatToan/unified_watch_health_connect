package com.mapbox.maps.viewannotation;

import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.maps.AnnotatedLayerFeature;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.ViewAnnotationOptions;
import e23.l;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\bf\u0018\u0000 B2\u00020\u0001:\u0001BJ!\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0007\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bH&¢\u0006\u0004\b\u0007\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0006H&¢\u0006\u0004\b\u001c\u0010\u001eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H&¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020$H&¢\u0006\u0004\b(\u0010)JC\u00102\u001a\u0004\u0018\u0001012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00100\u001a\u0004\u0018\u00010.H'¢\u0006\u0004\b2\u00103JU\u00102\u001a\u00020\f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00100\u001a\u0004\u0018\u00010.2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\f0\u000bH&¢\u0006\u0004\b2\u00105R2\u0010>\u001a\u0012\u0012\u0004\u0012\u00020706j\b\u0012\u0004\u0012\u000207`88&@&X§\u000e¢\u0006\u0012\u0012\u0004\b=\u0010\u0015\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/mapbox/maps/viewannotation/ViewAnnotationManager;", "", "", "resId", "Lcom/mapbox/maps/ViewAnnotationOptions;", "options", "Landroid/view/View;", "addViewAnnotation", "(ILcom/mapbox/maps/ViewAnnotationOptions;)Landroid/view/View;", "Lq/a;", "asyncInflater", "Lkotlin/Function1;", "", "asyncInflateCallback", "(ILcom/mapbox/maps/ViewAnnotationOptions;Lq/a;Le23/l;)V", "view", "(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)V", "", "removeViewAnnotation", "(Landroid/view/View;)Z", "removeAllViewAnnotations", "()V", "updateViewAnnotation", "(Landroid/view/View;Lcom/mapbox/maps/ViewAnnotationOptions;)Z", "Lcom/mapbox/maps/AnnotatedLayerFeature;", "annotatedLayerFeature", "getViewAnnotation", "(Lcom/mapbox/maps/AnnotatedLayerFeature;)Landroid/view/View;", "getViewAnnotationOptions", "(Lcom/mapbox/maps/AnnotatedLayerFeature;)Lcom/mapbox/maps/ViewAnnotationOptions;", "(Landroid/view/View;)Lcom/mapbox/maps/ViewAnnotationOptions;", "Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnViewAnnotationUpdatedListener", "(Lcom/mapbox/maps/viewannotation/OnViewAnnotationUpdatedListener;)V", "removeOnViewAnnotationUpdatedListener", "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "mode", "setViewAnnotationUpdateMode", "(Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;)V", "getViewAnnotationUpdateMode", "()Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "", "annotations", "Lcom/mapbox/maps/EdgeInsets;", "edgeInsets", "", "bearing", "pitch", "Lcom/mapbox/maps/CameraOptions;", "cameraForAnnotations", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "result", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Le23/l;)V", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "getViewAnnotationAvoidLayers", "()Ljava/util/HashSet;", "setViewAnnotationAvoidLayers", "(Ljava/util/HashSet;)V", "getViewAnnotationAvoidLayers$annotations", "viewAnnotationAvoidLayers", "", "getAnnotations", "()Ljava/util/Map;", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ViewAnnotationManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final ViewAnnotationUpdateMode DEFAULT_UPDATE_MODE = ViewAnnotationUpdateMode.MAP_SYNCHRONIZED;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/viewannotation/ViewAnnotationManager$Companion;", "", "()V", "DEFAULT_UPDATE_MODE", "Lcom/mapbox/maps/viewannotation/ViewAnnotationUpdateMode;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addOnViewAnnotationUpdatedListener(OnViewAnnotationUpdatedListener listener);

    View addViewAnnotation(int resId, ViewAnnotationOptions options);

    void addViewAnnotation(int resId, ViewAnnotationOptions options, q.a asyncInflater, l<? super View, Unit> asyncInflateCallback);

    void addViewAnnotation(View view2, ViewAnnotationOptions options);

    @MapboxDelicateApi
    CameraOptions cameraForAnnotations(List<? extends View> annotations, EdgeInsets edgeInsets, Double bearing, Double pitch);

    void cameraForAnnotations(List<? extends View> annotations, EdgeInsets edgeInsets, Double bearing, Double pitch, l<? super CameraOptions, Unit> result);

    Map<View, ViewAnnotationOptions> getAnnotations();

    View getViewAnnotation(AnnotatedLayerFeature annotatedLayerFeature);

    HashSet<String> getViewAnnotationAvoidLayers();

    ViewAnnotationOptions getViewAnnotationOptions(View view2);

    ViewAnnotationOptions getViewAnnotationOptions(AnnotatedLayerFeature annotatedLayerFeature);

    ViewAnnotationUpdateMode getViewAnnotationUpdateMode();

    void removeAllViewAnnotations();

    void removeOnViewAnnotationUpdatedListener(OnViewAnnotationUpdatedListener listener);

    boolean removeViewAnnotation(View view2);

    void setViewAnnotationAvoidLayers(HashSet<String> hashSet);

    void setViewAnnotationUpdateMode(ViewAnnotationUpdateMode mode);

    boolean updateViewAnnotation(View view2, ViewAnnotationOptions options);

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ CameraOptions cameraForAnnotations$default(ViewAnnotationManager viewAnnotationManager, List list, EdgeInsets edgeInsets, Double d14, Double d15, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: cameraForAnnotations");
                return null;
            }
            if ((i14 & 2) != 0) {
                edgeInsets = null;
            }
            if ((i14 & 4) != 0) {
                d14 = null;
            }
            if ((i14 & 8) != 0) {
                d15 = null;
            }
            return viewAnnotationManager.cameraForAnnotations(list, edgeInsets, d14, d15);
        }

        @MapboxExperimental
        public static /* synthetic */ void getViewAnnotationAvoidLayers$annotations() {
        }

        public static /* synthetic */ void cameraForAnnotations$default(ViewAnnotationManager viewAnnotationManager, List list, EdgeInsets edgeInsets, Double d14, Double d15, l lVar, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: cameraForAnnotations");
                return;
            }
            if ((i14 & 2) != 0) {
                edgeInsets = null;
            }
            if ((i14 & 4) != 0) {
                d14 = null;
            }
            if ((i14 & 8) != 0) {
                d15 = null;
            }
            viewAnnotationManager.cameraForAnnotations(list, edgeInsets, d14, d15, lVar);
        }
    }
}
