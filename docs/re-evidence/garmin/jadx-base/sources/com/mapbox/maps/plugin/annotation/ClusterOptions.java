package com.mapbox.maps.plugin.annotation;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.mapbox.bindgen.Value;
import java.util.HashMap;
import java.util.List;
import lc.u0;
import o13.p;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.w;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001BÅ\u0001\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00130\u0012\u0012(\b\u0002\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015j\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\"\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00130\u0012HÆ\u0003¢\u0006\u0004\b+\u0010,J0\u0010-\u001a\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015j\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0017HÆ\u0003¢\u0006\u0004\b-\u0010.JÌ\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00130\u00122(\b\u0002\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015j\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0017HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b3\u0010%J\u001a\u00105\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b?\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\bB\u0010 R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bC\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bD\u0010 R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\bE\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\bF\u0010\u001eR)\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bH\u0010,R7\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015j\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010I\u001a\u0004\bJ\u0010.¨\u0006K"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/ClusterOptions;", "", "", "cluster", "", "clusterRadius", "Lcom/mapbox/bindgen/Value;", "circleRadiusExpression", "", "circleRadius", "textColorExpression", "", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "textSizeExpression", "textSize", "textField", "clusterMaxZoom", "clusterMinPoints", "", "Lo13/p;", "colorLevels", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "clusterProperties", "<init>", "(ZJLcom/mapbox/bindgen/Value;DLcom/mapbox/bindgen/Value;ILcom/mapbox/bindgen/Value;DLcom/mapbox/bindgen/Value;JJLjava/util/List;Ljava/util/HashMap;)V", "component1", "()Z", "component2", "()J", "component3", "()Lcom/mapbox/bindgen/Value;", "component4", "()D", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/util/List;", "component13", "()Ljava/util/HashMap;", "copy", "(ZJLcom/mapbox/bindgen/Value;DLcom/mapbox/bindgen/Value;ILcom/mapbox/bindgen/Value;DLcom/mapbox/bindgen/Value;JJLjava/util/List;Ljava/util/HashMap;)Lcom/mapbox/maps/plugin/annotation/ClusterOptions;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getCluster", "J", "getClusterRadius", "Lcom/mapbox/bindgen/Value;", "getCircleRadiusExpression", "D", "getCircleRadius", "getTextColorExpression", "I", "getTextColor", "getTextSizeExpression", "getTextSize", "getTextField", "getClusterMaxZoom", "getClusterMinPoints", "Ljava/util/List;", "getColorLevels", "Ljava/util/HashMap;", "getClusterProperties", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ClusterOptions {
    private final double circleRadius;
    private final Value circleRadiusExpression;
    private final boolean cluster;
    private final long clusterMaxZoom;
    private final long clusterMinPoints;
    private final HashMap<String, Object> clusterProperties;
    private final long clusterRadius;
    private final List<p<Integer, Integer>> colorLevels;
    private final int textColor;
    private final Value textColorExpression;
    private final Value textField;
    private final double textSize;
    private final Value textSizeExpression;

    public /* synthetic */ ClusterOptions(boolean z14, long j8, Value value, double d14, Value value2, int i14, Value value3, double d15, Value value4, long j14, long j15, List list, HashMap map, int i15, j jVar) {
        this((i15 & 1) != 0 ? true : z14, (i15 & 2) != 0 ? 50L : j8, (i15 & 4) != 0 ? null : value, (i15 & 8) != 0 ? 18.0d : d14, (i15 & 16) != 0 ? null : value2, (i15 & 32) != 0 ? -1 : i14, (i15 & 64) != 0 ? null : value3, (i15 & 128) != 0 ? 12.0d : d15, (i15 & 256) != 0 ? null : value4, (i15 & 512) != 0 ? 14L : j14, (i15 & 1024) != 0 ? 2L : j15, (i15 & 2048) != 0 ? w.c(new p(0, -16776961)) : list, (i15 & 4096) != 0 ? null : map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCluster() {
        return this.cluster;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getClusterMaxZoom() {
        return this.clusterMaxZoom;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getClusterMinPoints() {
        return this.clusterMinPoints;
    }

    public final List<p<Integer, Integer>> component12() {
        return this.colorLevels;
    }

    public final HashMap<String, Object> component13() {
        return this.clusterProperties;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getClusterRadius() {
        return this.clusterRadius;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Value getCircleRadiusExpression() {
        return this.circleRadiusExpression;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getCircleRadius() {
        return this.circleRadius;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Value getTextColorExpression() {
        return this.textColorExpression;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Value getTextSizeExpression() {
        return this.textSizeExpression;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getTextSize() {
        return this.textSize;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Value getTextField() {
        return this.textField;
    }

    public final ClusterOptions copy(boolean cluster, long clusterRadius, Value circleRadiusExpression, double circleRadius, Value textColorExpression, int textColor, Value textSizeExpression, double textSize, Value textField, long clusterMaxZoom, long clusterMinPoints, List<p<Integer, Integer>> colorLevels, HashMap<String, Object> clusterProperties) {
        colorLevels.getClass();
        return new ClusterOptions(cluster, clusterRadius, circleRadiusExpression, circleRadius, textColorExpression, textColor, textSizeExpression, textSize, textField, clusterMaxZoom, clusterMinPoints, colorLevels, clusterProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClusterOptions)) {
            return false;
        }
        ClusterOptions clusterOptions = (ClusterOptions) other;
        return this.cluster == clusterOptions.cluster && this.clusterRadius == clusterOptions.clusterRadius && s.g(this.circleRadiusExpression, clusterOptions.circleRadiusExpression) && Double.compare(this.circleRadius, clusterOptions.circleRadius) == 0 && s.g(this.textColorExpression, clusterOptions.textColorExpression) && this.textColor == clusterOptions.textColor && s.g(this.textSizeExpression, clusterOptions.textSizeExpression) && Double.compare(this.textSize, clusterOptions.textSize) == 0 && s.g(this.textField, clusterOptions.textField) && this.clusterMaxZoom == clusterOptions.clusterMaxZoom && this.clusterMinPoints == clusterOptions.clusterMinPoints && s.g(this.colorLevels, clusterOptions.colorLevels) && s.g(this.clusterProperties, clusterOptions.clusterProperties);
    }

    public final double getCircleRadius() {
        return this.circleRadius;
    }

    public final Value getCircleRadiusExpression() {
        return this.circleRadiusExpression;
    }

    public final boolean getCluster() {
        return this.cluster;
    }

    public final long getClusterMaxZoom() {
        return this.clusterMaxZoom;
    }

    public final long getClusterMinPoints() {
        return this.clusterMinPoints;
    }

    public final HashMap<String, Object> getClusterProperties() {
        return this.clusterProperties;
    }

    public final long getClusterRadius() {
        return this.clusterRadius;
    }

    public final List<p<Integer, Integer>> getColorLevels() {
        return this.colorLevels;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final Value getTextColorExpression() {
        return this.textColorExpression;
    }

    public final Value getTextField() {
        return this.textField;
    }

    public final double getTextSize() {
        return this.textSize;
    }

    public final Value getTextSizeExpression() {
        return this.textSizeExpression;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    public int hashCode() {
        boolean z14 = this.cluster;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int iE = f.e(r14 * 31, 31, this.clusterRadius);
        Value value = this.circleRadiusExpression;
        int iB = e.b((iE + (value == null ? 0 : value.hashCode())) * 31, 31, this.circleRadius);
        Value value2 = this.textColorExpression;
        int iD = q2.d(this.textColor, (iB + (value2 == null ? 0 : value2.hashCode())) * 31, 31);
        Value value3 = this.textSizeExpression;
        int iB2 = e.b((iD + (value3 == null ? 0 : value3.hashCode())) * 31, 31, this.textSize);
        Value value4 = this.textField;
        int iB3 = u0.b(f.e(f.e((iB2 + (value4 == null ? 0 : value4.hashCode())) * 31, 31, this.clusterMaxZoom), 31, this.clusterMinPoints), 31, this.colorLevels);
        HashMap<String, Object> map = this.clusterProperties;
        return iB3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "ClusterOptions(cluster=" + this.cluster + ", clusterRadius=" + this.clusterRadius + ", circleRadiusExpression=" + this.circleRadiusExpression + ", circleRadius=" + this.circleRadius + ", textColorExpression=" + this.textColorExpression + ", textColor=" + this.textColor + ", textSizeExpression=" + this.textSizeExpression + ", textSize=" + this.textSize + ", textField=" + this.textField + ", clusterMaxZoom=" + this.clusterMaxZoom + ", clusterMinPoints=" + this.clusterMinPoints + ", colorLevels=" + this.colorLevels + ", clusterProperties=" + this.clusterProperties + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ClusterOptions(boolean z14) {
        this(z14, 0L, null, 0.0d, null, 0, null, 0.0d, null, 0L, 0L, null, null, 8190, null);
    }

    public ClusterOptions(boolean z14, long j8) {
        this(z14, j8, null, 0.0d, null, 0, null, 0.0d, null, 0L, 0L, null, null, 8188, null);
    }

    public ClusterOptions(boolean z14, long j8, Value value) {
        this(z14, j8, value, 0.0d, null, 0, null, 0.0d, null, 0L, 0L, null, null, 8184, null);
    }

    public ClusterOptions(boolean z14, long j8, Value value, double d14) {
        this(z14, j8, value, d14, null, 0, null, 0.0d, null, 0L, 0L, null, null, 8176, null);
    }

    public ClusterOptions(boolean z14, long j8, Value value, double d14, Value value2) {
        this(z14, j8, value, d14, value2, 0, null, 0.0d, null, 0L, 0L, null, null, 8160, null);
    }

    public ClusterOptions(boolean z14, long j8, Value value, double d14, Value value2, int i14) {
        this(z14, j8, value, d14, value2, i14, null, 0.0d, null, 0L, 0L, null, null, 8128, null);
    }

    public ClusterOptions(boolean z14, long j8, Value value, double d14, Value value2, int i14, Value value3) {
        this(z14, j8, value, d14, value2, i14, value3, 0.0d, null, 0L, 0L, null, null, 8064, null);
    }

    public ClusterOptions(boolean z14, long j8, Value value, double d14, Value value2, int i14, Value value3, double d15) {
        this(z14, j8, value, d14, value2, i14, value3, d15, null, 0L, 0L, null, null, 7936, null);
    }

    public ClusterOptions(boolean z14, long j8, Value value, double d14, Value value2, int i14, Value value3, double d15, Value value4) {
        this(z14, j8, value, d14, value2, i14, value3, d15, value4, 0L, 0L, null, null, GDIRealtimeSettingsProto.AppWellKnownCompositionId.INVALID_VALUE, null);
    }

    public ClusterOptions(boolean z14, long j8, Value value, double d14, Value value2, int i14, Value value3, double d15, Value value4, long j14) {
        this(z14, j8, value, d14, value2, i14, value3, d15, value4, j14, 0L, null, null, 7168, null);
    }

    public ClusterOptions(boolean z14, long j8, Value value, double d14, Value value2, int i14, Value value3, double d15, Value value4, long j14, long j15) {
        this(z14, j8, value, d14, value2, i14, value3, d15, value4, j14, j15, null, null, 6144, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClusterOptions(boolean z14, long j8, Value value, double d14, Value value2, int i14, Value value3, double d15, Value value4, long j14, long j15, List<p<Integer, Integer>> list) {
        this(z14, j8, value, d14, value2, i14, value3, d15, value4, j14, j15, list, null, 4096, null);
        list.getClass();
    }

    public ClusterOptions(boolean z14, long j8, Value value, double d14, Value value2, int i14, Value value3, double d15, Value value4, long j14, long j15, List<p<Integer, Integer>> list, HashMap<String, Object> map) {
        list.getClass();
        this.cluster = z14;
        this.clusterRadius = j8;
        this.circleRadiusExpression = value;
        this.circleRadius = d14;
        this.textColorExpression = value2;
        this.textColor = i14;
        this.textSizeExpression = value3;
        this.textSize = d15;
        this.textField = value4;
        this.clusterMaxZoom = j14;
        this.clusterMinPoints = j15;
        this.colorLevels = list;
        this.clusterProperties = map;
    }

    public ClusterOptions() {
        this(false, 0L, null, 0.0d, null, 0, null, 0.0d, null, 0L, 0L, null, null, 8191, null);
    }
}
