package com.mapbox.maps.plugin.annotation;

import com.mapbox.maps.plugin.annotation.generated.CircleAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotation;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotation;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/AnnotationType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", PolygonAnnotation.ID_KEY, PolylineAnnotation.ID_KEY, PointAnnotation.ID_KEY, CircleAnnotation.ID_KEY, "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum AnnotationType {
    PolygonAnnotation(1),
    PolylineAnnotation(2),
    PointAnnotation(3),
    CircleAnnotation(4);

    private int value;

    AnnotationType(int i14) {
        this.value = i14;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i14) {
        this.value = i14;
    }
}
