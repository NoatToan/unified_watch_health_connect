package com.mapbox.maps.plugin.annotation;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.AnnotationOptions;
import com.mapbox.maps.plugin.annotation.OnAnnotationClickListener;
import com.mapbox.maps.plugin.annotation.OnAnnotationDragListener;
import com.mapbox.maps.plugin.annotation.OnAnnotationInteractionListener;
import com.mapbox.maps.plugin.annotation.OnAnnotationLongClickListener;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u0004*\u0014\b\u0002\u0010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006*\u000e\b\u0003\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00030\b*\u000e\b\u0004\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\n*\u000e\b\u0005\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u00030\f*\u000e\b\u0006\u0010\r*\b\u0012\u0004\u0012\u0002H\u00030\u000e2\u00020\u000fJ\u0015\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00028\u0004H\u0016¢\u0006\u0002\u0010$J\u0015\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010'J\u0015\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00028\u0006H\u0016¢\u0006\u0002\u0010*J\u0015\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00028\u0005H\u0016¢\u0006\u0002\u0010-J\u0015\u0010.\u001a\u00028\u00012\u0006\u0010/\u001a\u00028\u0002H&¢\u0006\u0002\u00100J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00112\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00020\u0011H&J\u0015\u00102\u001a\u0002032\u0006\u00104\u001a\u00028\u0001H&¢\u0006\u0002\u00105J\u0016\u00102\u001a\u0002032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H&J\b\u00106\u001a\u000203H&J\u0010\u00107\u001a\u0002032\u0006\u00108\u001a\u000209H&J\b\u0010:\u001a\u000203H&J\u0018\u0010;\u001a\u0002032\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=H&J\u0015\u0010?\u001a\u00020\"2\u0006\u0010#\u001a\u00028\u0004H\u0016¢\u0006\u0002\u0010$J\u0015\u0010@\u001a\u00020\"2\u0006\u0010&\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010'J\u0015\u0010A\u001a\u00020\"2\u0006\u0010)\u001a\u00028\u0006H\u0016¢\u0006\u0002\u0010*J\u0015\u0010B\u001a\u00020\"2\u0006\u0010,\u001a\u00028\u0005H\u0016¢\u0006\u0002\u0010-J\u0015\u0010C\u001a\u0002032\u0006\u00104\u001a\u00028\u0001H&¢\u0006\u0002\u00105J\u0015\u0010D\u001a\u0002032\u0006\u00104\u001a\u00028\u0001H&¢\u0006\u0002\u00105J\u0016\u0010D\u001a\u0002032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H&R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00040\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00030\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00060\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00050\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0013¨\u0006E"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/AnnotationManager;", "G", "Lcom/mapbox/geojson/Geometry;", "T", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "S", "Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;", "D", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationDragListener;", "U", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationClickListener;", "V", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationLongClickListener;", "I", "Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;", "", "annotations", "", "getAnnotations", "()Ljava/util/List;", "clickListeners", "", "getClickListeners", "delegateProvider", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "getDelegateProvider", "()Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "dragListeners", "getDragListeners", "interactionListener", "getInteractionListener", "longClickListeners", "getLongClickListeners", "addClickListener", "", "u", "(Lcom/mapbox/maps/plugin/annotation/OnAnnotationClickListener;)Z", "addDragListener", "d", "(Lcom/mapbox/maps/plugin/annotation/OnAnnotationDragListener;)Z", "addInteractionListener", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;)Z", "addLongClickListener", "v", "(Lcom/mapbox/maps/plugin/annotation/OnAnnotationLongClickListener;)Z", "create", "option", "(Lcom/mapbox/maps/plugin/annotation/AnnotationOptions;)Lcom/mapbox/maps/plugin/annotation/Annotation;", "options", "delete", "", "annotation", "(Lcom/mapbox/maps/plugin/annotation/Annotation;)V", "deleteAll", "enableDataDrivenProperty", "property", "", "onDestroy", "onSizeChanged", "width", "", "height", "removeClickListener", "removeDragListener", "removeInteractionListener", "removeLongClickListener", "selectAnnotation", "update", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface AnnotationManager<G extends Geometry, T extends Annotation<G>, S extends AnnotationOptions<G, T>, D extends OnAnnotationDragListener<? extends T>, U extends OnAnnotationClickListener<T>, V extends OnAnnotationLongClickListener<T>, I extends OnAnnotationInteractionListener<T>> {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static <G extends Geometry, T extends Annotation<G>, S extends AnnotationOptions<G, T>, D extends OnAnnotationDragListener<? extends T>, U extends OnAnnotationClickListener<T>, V extends OnAnnotationLongClickListener<T>, I extends OnAnnotationInteractionListener<T>> boolean addClickListener(AnnotationManager<G, T, S, D, U, V, I> annotationManager, U u8) {
            u8.getClass();
            return annotationManager.getClickListeners().add(u8);
        }

        public static <G extends Geometry, T extends Annotation<G>, S extends AnnotationOptions<G, T>, D extends OnAnnotationDragListener<? extends T>, U extends OnAnnotationClickListener<T>, V extends OnAnnotationLongClickListener<T>, I extends OnAnnotationInteractionListener<T>> boolean addDragListener(AnnotationManager<G, T, S, D, U, V, I> annotationManager, D d14) {
            d14.getClass();
            return annotationManager.getDragListeners().add(d14);
        }

        public static <G extends Geometry, T extends Annotation<G>, S extends AnnotationOptions<G, T>, D extends OnAnnotationDragListener<? extends T>, U extends OnAnnotationClickListener<T>, V extends OnAnnotationLongClickListener<T>, I extends OnAnnotationInteractionListener<T>> boolean addInteractionListener(AnnotationManager<G, T, S, D, U, V, I> annotationManager, I i14) {
            i14.getClass();
            return annotationManager.getInteractionListener().add(i14);
        }

        public static <G extends Geometry, T extends Annotation<G>, S extends AnnotationOptions<G, T>, D extends OnAnnotationDragListener<? extends T>, U extends OnAnnotationClickListener<T>, V extends OnAnnotationLongClickListener<T>, I extends OnAnnotationInteractionListener<T>> boolean addLongClickListener(AnnotationManager<G, T, S, D, U, V, I> annotationManager, V v14) {
            v14.getClass();
            return annotationManager.getLongClickListeners().add(v14);
        }

        public static <G extends Geometry, T extends Annotation<G>, S extends AnnotationOptions<G, T>, D extends OnAnnotationDragListener<? extends T>, U extends OnAnnotationClickListener<T>, V extends OnAnnotationLongClickListener<T>, I extends OnAnnotationInteractionListener<T>> boolean removeClickListener(AnnotationManager<G, T, S, D, U, V, I> annotationManager, U u8) {
            u8.getClass();
            return annotationManager.getClickListeners().remove(u8);
        }

        public static <G extends Geometry, T extends Annotation<G>, S extends AnnotationOptions<G, T>, D extends OnAnnotationDragListener<? extends T>, U extends OnAnnotationClickListener<T>, V extends OnAnnotationLongClickListener<T>, I extends OnAnnotationInteractionListener<T>> boolean removeDragListener(AnnotationManager<G, T, S, D, U, V, I> annotationManager, D d14) {
            d14.getClass();
            return annotationManager.getDragListeners().remove(d14);
        }

        public static <G extends Geometry, T extends Annotation<G>, S extends AnnotationOptions<G, T>, D extends OnAnnotationDragListener<? extends T>, U extends OnAnnotationClickListener<T>, V extends OnAnnotationLongClickListener<T>, I extends OnAnnotationInteractionListener<T>> boolean removeInteractionListener(AnnotationManager<G, T, S, D, U, V, I> annotationManager, I i14) {
            i14.getClass();
            return annotationManager.getInteractionListener().remove(i14);
        }

        public static <G extends Geometry, T extends Annotation<G>, S extends AnnotationOptions<G, T>, D extends OnAnnotationDragListener<? extends T>, U extends OnAnnotationClickListener<T>, V extends OnAnnotationLongClickListener<T>, I extends OnAnnotationInteractionListener<T>> boolean removeLongClickListener(AnnotationManager<G, T, S, D, U, V, I> annotationManager, V v14) {
            v14.getClass();
            return annotationManager.getLongClickListeners().remove(v14);
        }
    }

    boolean addClickListener(U u8);

    boolean addDragListener(D d14);

    boolean addInteractionListener(I i14);

    boolean addLongClickListener(V v14);

    T create(S option);

    List<T> create(List<? extends S> options);

    void delete(T annotation);

    void delete(List<? extends T> annotations);

    void deleteAll();

    void enableDataDrivenProperty(String property);

    List<T> getAnnotations();

    List<U> getClickListeners();

    MapDelegateProvider getDelegateProvider();

    List<D> getDragListeners();

    List<I> getInteractionListener();

    List<V> getLongClickListeners();

    void onDestroy();

    void onSizeChanged(int width, int height);

    boolean removeClickListener(U u8);

    boolean removeDragListener(D d14);

    boolean removeInteractionListener(I i14);

    boolean removeLongClickListener(V v14);

    void selectAnnotation(T annotation);

    void update(T annotation);

    void update(List<? extends T> annotations);
}
