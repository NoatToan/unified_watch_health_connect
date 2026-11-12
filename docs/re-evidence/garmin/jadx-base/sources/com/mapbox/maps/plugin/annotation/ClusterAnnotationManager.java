package com.mapbox.maps.plugin.annotation;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\bH\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/ClusterAnnotationManager;", "", "clusterClickListeners", "", "Lcom/mapbox/maps/plugin/annotation/OnClusterClickListener;", "getClusterClickListeners", "()Ljava/util/List;", "clusterLongClickListeners", "Lcom/mapbox/maps/plugin/annotation/OnClusterLongClickListener;", "getClusterLongClickListeners", "addClusterClickListener", "", "clusterClickListener", "addClusterLongClickListener", "onClusterLongClickListener", "removeClusterClickListener", "removeClusterLongClickListener", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ClusterAnnotationManager {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static boolean addClusterClickListener(ClusterAnnotationManager clusterAnnotationManager, OnClusterClickListener onClusterClickListener) {
            onClusterClickListener.getClass();
            return clusterAnnotationManager.getClusterClickListeners().add(onClusterClickListener);
        }

        public static boolean addClusterLongClickListener(ClusterAnnotationManager clusterAnnotationManager, OnClusterLongClickListener onClusterLongClickListener) {
            onClusterLongClickListener.getClass();
            return clusterAnnotationManager.getClusterLongClickListeners().add(onClusterLongClickListener);
        }

        public static boolean removeClusterClickListener(ClusterAnnotationManager clusterAnnotationManager, OnClusterClickListener onClusterClickListener) {
            onClusterClickListener.getClass();
            return clusterAnnotationManager.getClusterClickListeners().remove(onClusterClickListener);
        }

        public static boolean removeClusterLongClickListener(ClusterAnnotationManager clusterAnnotationManager, OnClusterLongClickListener onClusterLongClickListener) {
            onClusterLongClickListener.getClass();
            return clusterAnnotationManager.getClusterLongClickListeners().remove(onClusterLongClickListener);
        }
    }

    boolean addClusterClickListener(OnClusterClickListener clusterClickListener);

    boolean addClusterLongClickListener(OnClusterLongClickListener onClusterLongClickListener);

    List<OnClusterClickListener> getClusterClickListeners();

    List<OnClusterLongClickListener> getClusterLongClickListeners();

    boolean removeClusterClickListener(OnClusterClickListener clusterClickListener);

    boolean removeClusterLongClickListener(OnClusterLongClickListener onClusterLongClickListener);
}
