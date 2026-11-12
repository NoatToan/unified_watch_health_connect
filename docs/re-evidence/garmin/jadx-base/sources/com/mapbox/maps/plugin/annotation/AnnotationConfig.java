package com.mapbox.maps.plugin.annotation;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;", "", "belowLayerId", "", "layerId", "sourceId", "annotationSourceOptions", "Lcom/mapbox/maps/plugin/annotation/AnnotationSourceOptions;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/plugin/annotation/AnnotationSourceOptions;)V", "getAnnotationSourceOptions", "()Lcom/mapbox/maps/plugin/annotation/AnnotationSourceOptions;", "getBelowLayerId", "()Ljava/lang/String;", "getLayerId", "getSourceId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class AnnotationConfig {
    private final AnnotationSourceOptions annotationSourceOptions;
    private final String belowLayerId;
    private final String layerId;
    private final String sourceId;

    public /* synthetic */ AnnotationConfig(String str, String str2, String str3, AnnotationSourceOptions annotationSourceOptions, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : annotationSourceOptions);
    }

    public static /* synthetic */ AnnotationConfig copy$default(AnnotationConfig annotationConfig, String str, String str2, String str3, AnnotationSourceOptions annotationSourceOptions, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = annotationConfig.belowLayerId;
        }
        if ((i14 & 2) != 0) {
            str2 = annotationConfig.layerId;
        }
        if ((i14 & 4) != 0) {
            str3 = annotationConfig.sourceId;
        }
        if ((i14 & 8) != 0) {
            annotationSourceOptions = annotationConfig.annotationSourceOptions;
        }
        return annotationConfig.copy(str, str2, str3, annotationSourceOptions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBelowLayerId() {
        return this.belowLayerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLayerId() {
        return this.layerId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AnnotationSourceOptions getAnnotationSourceOptions() {
        return this.annotationSourceOptions;
    }

    public final AnnotationConfig copy(String belowLayerId, String layerId, String sourceId, AnnotationSourceOptions annotationSourceOptions) {
        return new AnnotationConfig(belowLayerId, layerId, sourceId, annotationSourceOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotationConfig)) {
            return false;
        }
        AnnotationConfig annotationConfig = (AnnotationConfig) other;
        return s.g(this.belowLayerId, annotationConfig.belowLayerId) && s.g(this.layerId, annotationConfig.layerId) && s.g(this.sourceId, annotationConfig.sourceId) && s.g(this.annotationSourceOptions, annotationConfig.annotationSourceOptions);
    }

    public final AnnotationSourceOptions getAnnotationSourceOptions() {
        return this.annotationSourceOptions;
    }

    public final String getBelowLayerId() {
        return this.belowLayerId;
    }

    public final String getLayerId() {
        return this.layerId;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public int hashCode() {
        String str = this.belowLayerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.layerId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AnnotationSourceOptions annotationSourceOptions = this.annotationSourceOptions;
        return iHashCode3 + (annotationSourceOptions != null ? annotationSourceOptions.hashCode() : 0);
    }

    public String toString() {
        return "AnnotationConfig(belowLayerId=" + this.belowLayerId + ", layerId=" + this.layerId + ", sourceId=" + this.sourceId + ", annotationSourceOptions=" + this.annotationSourceOptions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public AnnotationConfig(String str) {
        this(str, null, null, null, 14, null);
    }

    public AnnotationConfig(String str, String str2) {
        this(str, str2, null, null, 12, null);
    }

    public AnnotationConfig(String str, String str2, String str3) {
        this(str, str2, str3, null, 8, null);
    }

    public AnnotationConfig(String str, String str2, String str3, AnnotationSourceOptions annotationSourceOptions) {
        this.belowLayerId = str;
        this.layerId = str2;
        this.sourceId = str3;
        this.annotationSourceOptions = annotationSourceOptions;
    }

    public AnnotationConfig() {
        this(null, null, null, null, 15, null);
    }
}
