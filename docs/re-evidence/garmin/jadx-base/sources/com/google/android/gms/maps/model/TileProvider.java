package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes14.dex */
public interface TileProvider {
    public static final Tile NO_TILE = new Tile(-1, -1, null);

    Tile getTile(int i14, int i15, int i16);
}
