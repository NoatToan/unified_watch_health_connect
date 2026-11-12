package com.mapbox.maps.plugin.annotation;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JJ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/AnnotationSourceOptions;", "", "maxZoom", "", "buffer", "lineMetrics", "", "tolerance", "", "clusterOptions", "Lcom/mapbox/maps/plugin/annotation/ClusterOptions;", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Double;Lcom/mapbox/maps/plugin/annotation/ClusterOptions;)V", "getBuffer", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getClusterOptions", "()Lcom/mapbox/maps/plugin/annotation/ClusterOptions;", "getLineMetrics", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxZoom", "getTolerance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Double;Lcom/mapbox/maps/plugin/annotation/ClusterOptions;)Lcom/mapbox/maps/plugin/annotation/AnnotationSourceOptions;", "equals", "other", "hashCode", "", "toString", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class AnnotationSourceOptions {
    private final Long buffer;
    private final ClusterOptions clusterOptions;
    private final Boolean lineMetrics;
    private final Long maxZoom;
    private final Double tolerance;

    public /* synthetic */ AnnotationSourceOptions(Long l14, Long l15, Boolean bool, Double d14, ClusterOptions clusterOptions, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : bool, (i14 & 8) != 0 ? null : d14, (i14 & 16) != 0 ? null : clusterOptions);
    }

    public static /* synthetic */ AnnotationSourceOptions copy$default(AnnotationSourceOptions annotationSourceOptions, Long l14, Long l15, Boolean bool, Double d14, ClusterOptions clusterOptions, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            l14 = annotationSourceOptions.maxZoom;
        }
        if ((i14 & 2) != 0) {
            l15 = annotationSourceOptions.buffer;
        }
        if ((i14 & 4) != 0) {
            bool = annotationSourceOptions.lineMetrics;
        }
        if ((i14 & 8) != 0) {
            d14 = annotationSourceOptions.tolerance;
        }
        if ((i14 & 16) != 0) {
            clusterOptions = annotationSourceOptions.clusterOptions;
        }
        ClusterOptions clusterOptions2 = clusterOptions;
        Boolean bool2 = bool;
        return annotationSourceOptions.copy(l14, l15, bool2, d14, clusterOptions2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getMaxZoom() {
        return this.maxZoom;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getBuffer() {
        return this.buffer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getLineMetrics() {
        return this.lineMetrics;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getTolerance() {
        return this.tolerance;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ClusterOptions getClusterOptions() {
        return this.clusterOptions;
    }

    public final AnnotationSourceOptions copy(Long maxZoom, Long buffer, Boolean lineMetrics, Double tolerance, ClusterOptions clusterOptions) {
        return new AnnotationSourceOptions(maxZoom, buffer, lineMetrics, tolerance, clusterOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotationSourceOptions)) {
            return false;
        }
        AnnotationSourceOptions annotationSourceOptions = (AnnotationSourceOptions) other;
        return s.g(this.maxZoom, annotationSourceOptions.maxZoom) && s.g(this.buffer, annotationSourceOptions.buffer) && s.g(this.lineMetrics, annotationSourceOptions.lineMetrics) && s.g(this.tolerance, annotationSourceOptions.tolerance) && s.g(this.clusterOptions, annotationSourceOptions.clusterOptions);
    }

    public final Long getBuffer() {
        return this.buffer;
    }

    public final ClusterOptions getClusterOptions() {
        return this.clusterOptions;
    }

    public final Boolean getLineMetrics() {
        return this.lineMetrics;
    }

    public final Long getMaxZoom() {
        return this.maxZoom;
    }

    public final Double getTolerance() {
        return this.tolerance;
    }

    public int hashCode() {
        Long l14 = this.maxZoom;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.buffer;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        Boolean bool = this.lineMetrics;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d14 = this.tolerance;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        ClusterOptions clusterOptions = this.clusterOptions;
        return iHashCode4 + (clusterOptions != null ? clusterOptions.hashCode() : 0);
    }

    public String toString() {
        return "AnnotationSourceOptions(maxZoom=" + this.maxZoom + ", buffer=" + this.buffer + ", lineMetrics=" + this.lineMetrics + ", tolerance=" + this.tolerance + ", clusterOptions=" + this.clusterOptions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public AnnotationSourceOptions(Long l14) {
        this(l14, null, null, null, null, 30, null);
    }

    public AnnotationSourceOptions(Long l14, Long l15) {
        this(l14, l15, null, null, null, 28, null);
    }

    public AnnotationSourceOptions(Long l14, Long l15, Boolean bool) {
        this(l14, l15, bool, null, null, 24, null);
    }

    public AnnotationSourceOptions(Long l14, Long l15, Boolean bool, Double d14) {
        this(l14, l15, bool, d14, null, 16, null);
    }

    public AnnotationSourceOptions(Long l14, Long l15, Boolean bool, Double d14, ClusterOptions clusterOptions) {
        this.maxZoom = l14;
        this.buffer = l15;
        this.lineMetrics = bool;
        this.tolerance = d14;
        this.clusterOptions = clusterOptions;
    }

    public AnnotationSourceOptions() {
        this(null, null, null, null, null, 31, null);
    }
}
