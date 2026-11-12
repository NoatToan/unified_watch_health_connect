package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public class CustomRasterSourceClient {
    private Type type;
    private Object value;

    public enum Type {
        CUSTOM_RASTER_SOURCE_TILE_STATUS_CHANGED_CALLBACK,
        CUSTOM_RASTER_SOURCE_TILE_RENDERER
    }

    public CustomRasterSourceClient(CustomRasterSourceTileStatusChangedCallback customRasterSourceTileStatusChangedCallback) {
        this.type = Type.CUSTOM_RASTER_SOURCE_TILE_STATUS_CHANGED_CALLBACK;
        this.value = customRasterSourceTileStatusChangedCallback;
    }

    public static CustomRasterSourceClient valueOf(CustomRasterSourceTileStatusChangedCallback customRasterSourceTileStatusChangedCallback) {
        return new CustomRasterSourceClient(customRasterSourceTileStatusChangedCallback);
    }

    public CustomRasterSourceTileRenderer getCustomRasterSourceTileRenderer() {
        if (isCustomRasterSourceTileRenderer()) {
            return (CustomRasterSourceTileRenderer) this.value;
        }
        vb.h.z("The content of the variant does not have type (CustomRasterSourceTileRenderer)");
        return null;
    }

    public CustomRasterSourceTileStatusChangedCallback getCustomRasterSourceTileStatusChangedCallback() {
        if (isCustomRasterSourceTileStatusChangedCallback()) {
            return (CustomRasterSourceTileStatusChangedCallback) this.value;
        }
        vb.h.z("The content of the variant does not have type (CustomRasterSourceTileStatusChangedCallback)");
        return null;
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isCustomRasterSourceTileRenderer() {
        return this.type == Type.CUSTOM_RASTER_SOURCE_TILE_RENDERER;
    }

    public boolean isCustomRasterSourceTileStatusChangedCallback() {
        return this.type == Type.CUSTOM_RASTER_SOURCE_TILE_STATUS_CHANGED_CALLBACK;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static CustomRasterSourceClient valueOf(CustomRasterSourceTileRenderer customRasterSourceTileRenderer) {
        return new CustomRasterSourceClient(customRasterSourceTileRenderer);
    }

    public CustomRasterSourceClient(CustomRasterSourceTileRenderer customRasterSourceTileRenderer) {
        this.type = Type.CUSTOM_RASTER_SOURCE_TILE_RENDERER;
        this.value = customRasterSourceTileRenderer;
    }
}
