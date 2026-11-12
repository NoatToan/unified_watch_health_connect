package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public interface CustomRasterSourceTileRenderer {
    void contextLost();

    void deinitialize();

    void initialize();

    boolean isTileRenderable(CanonicalTileID canonicalTileID, CustomRasterSourceTileStatus customRasterSourceTileStatus);

    void prerender(CustomLayerRenderParameters customLayerRenderParameters);

    void renderToTile(CanonicalTileID canonicalTileID);
}
