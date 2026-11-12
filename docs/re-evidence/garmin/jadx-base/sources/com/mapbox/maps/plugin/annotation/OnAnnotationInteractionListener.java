package com.mapbox.maps.plugin.annotation;

import com.mapbox.maps.plugin.annotation.Annotation;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/OnAnnotationInteractionListener;", "T", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "", "onDeselectAnnotation", "", "annotation", "(Lcom/mapbox/maps/plugin/annotation/Annotation;)V", "onSelectAnnotation", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface OnAnnotationInteractionListener<T extends Annotation<?>> {
    void onDeselectAnnotation(T annotation);

    void onSelectAnnotation(T annotation);
}
