package com.mapbox.maps.plugin.annotation;

import com.mapbox.maps.plugin.annotation.Annotation;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001 \u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002H&J\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002H&J\u0014\u0010\b\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002H&¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/OnAnnotationDragListener;", "T", "Lcom/mapbox/maps/plugin/annotation/Annotation;", "", "onAnnotationDrag", "", "annotation", "onAnnotationDragFinished", "onAnnotationDragStarted", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface OnAnnotationDragListener<T extends Annotation<?>> {
    void onAnnotationDrag(Annotation<?> annotation);

    void onAnnotationDragFinished(Annotation<?> annotation);

    void onAnnotationDragStarted(Annotation<?> annotation);
}
