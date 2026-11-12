package com.mapbox.maps.plugin.annotation;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.android.gestures.MoveDistancesObject;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000 )*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001)B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0002\u0010\tJ\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u0007J\u001f\u0010\u001d\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H&¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020$H&J\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010(\u001a\u00020&H&R\u001c\u0010\b\u001a\u00028\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/Annotation;", "T", "Lcom/mapbox/geojson/Geometry;", "", TtmlNode.ATTR_ID, "", "jsonObject", "Lcom/google/gson/JsonObject;", "geometry", "(Ljava/lang/String;Lcom/google/gson/JsonObject;Lcom/mapbox/geojson/Geometry;)V", "getGeometry", "()Lcom/mapbox/geojson/Geometry;", "setGeometry", "(Lcom/mapbox/geojson/Geometry;)V", "Lcom/mapbox/geojson/Geometry;", "getId", "()Ljava/lang/String;", "isDraggable", "", "()Z", "setDraggable", "(Z)V", "isSelected", "setSelected", "getJsonObject", "()Lcom/google/gson/JsonObject;", "getData", "Lcom/google/gson/JsonElement;", "getJsonObjectCopy", "getOffsetGeometry", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "moveDistancesObject", "Lcom/mapbox/android/gestures/MoveDistancesObject;", "(Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;Lcom/mapbox/android/gestures/MoveDistancesObject;)Lcom/mapbox/geojson/Geometry;", "getType", "Lcom/mapbox/maps/plugin/annotation/AnnotationType;", "setData", "", "jsonElement", "setUsedDataDrivenProperties", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class Annotation<T extends Geometry> {
    private static final String FEATURE_IDENTIFIER_PREFIX = "mapbox_annotation_";
    public static final String ID_DATA = "custom_data";
    public static final double MAX_MERCATOR_LATITUDE = 85.05112877980659d;
    public static final double MIN_MERCATOR_LATITUDE = -85.05112877980659d;
    private T geometry;
    private final String id;
    private boolean isDraggable;
    private boolean isSelected;
    private final JsonObject jsonObject;

    public Annotation(String str, JsonObject jsonObject, T t7) {
        str.getClass();
        jsonObject.getClass();
        t7.getClass();
        this.id = str;
        this.jsonObject = jsonObject;
        this.geometry = t7;
    }

    public JsonElement getData() {
        return this.jsonObject.get(ID_DATA);
    }

    public final T getGeometry() {
        return this.geometry;
    }

    public final String getId() {
        return this.id;
    }

    public final JsonObject getJsonObject() {
        return this.jsonObject;
    }

    public final JsonObject getJsonObjectCopy() {
        JsonObject jsonObjectDeepCopy = this.jsonObject.deepCopy();
        jsonObjectDeepCopy.getClass();
        return jsonObjectDeepCopy;
    }

    public abstract T getOffsetGeometry(MapCameraManagerDelegate mapCameraManagerDelegate, MoveDistancesObject moveDistancesObject);

    public abstract AnnotationType getType();

    /* JADX INFO: renamed from: isDraggable, reason: from getter */
    public final boolean getIsDraggable() {
        return this.isDraggable;
    }

    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public void setData(JsonElement jsonElement) {
        this.jsonObject.add(ID_DATA, jsonElement);
    }

    public final void setDraggable(boolean z14) {
        this.isDraggable = z14;
    }

    public final void setGeometry(T t7) {
        t7.getClass();
        this.geometry = t7;
    }

    public final void setSelected(boolean z14) {
        this.isSelected = z14;
    }

    public abstract void setUsedDataDrivenProperties();
}
