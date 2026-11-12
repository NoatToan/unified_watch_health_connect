package com.amap.api.col.p0003sl;

import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.Tile;
import com.amap.api.maps.model.TileOverlaySource;
import com.amap.api.maps.model.TileProvider;
import com.autonavi.base.ae.gmap.bean.TileSourceProvider;
import com.autonavi.base.ae.gmap.bean.TileSourceReq;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class aj implements TileSourceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2207a = 256;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TileOverlaySource f2208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TileOverlaySource f2209c;

    @Override // com.autonavi.base.ae.gmap.bean.TileSourceProvider
    public final void cancel(TileSourceReq tileSourceReq) {
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        return null;
    }

    public aj(TileOverlaySource tileOverlaySource, TileOverlaySource tileOverlaySource2) {
        this.f2208b = tileOverlaySource;
        this.f2209c = tileOverlaySource2;
    }

    @Override // com.autonavi.base.ae.gmap.bean.TileSourceProvider
    public final Tile getTile(TileSourceReq tileSourceReq) {
        String url;
        if (tileSourceReq == null) {
            return TileProvider.NO_TILE;
        }
        Tile tileA = TileProvider.NO_TILE;
        try {
            if (tileSourceReq.sourceType == this.f2209c.getId()) {
                url = this.f2209c.getUrl();
            } else {
                url = this.f2208b.getUrl();
            }
            if (url == null) {
                return TileProvider.NO_TILE;
            }
            if (MapsInitializer.TERRAIN_LOCAL_DEM_SOURCE_PATH != null) {
                tileA = a(tileSourceReq);
            }
            if (tileA != TileProvider.NO_TILE) {
                return tileA;
            }
            int i = this.f2207a;
            return new Tile(i, i, a(tileSourceReq.x, tileSourceReq.y, tileSourceReq.zoom, url), true);
        } catch (Exception e) {
            Tile tile = TileProvider.NO_TILE;
            e.printStackTrace();
            return tile;
        }
    }

    private Tile a(TileSourceReq tileSourceReq) {
        String str = MapsInitializer.TERRAIN_LOCAL_DEM_SOURCE_PATH;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str + tileSourceReq.zoom + "/" + (tileSourceReq.x > 0 ? tileSourceReq.x / 10 : tileSourceReq.x) + "/" + (tileSourceReq.y > 0 ? tileSourceReq.y / 10 : tileSourceReq.y) + "/" + tileSourceReq.x + "_" + tileSourceReq.y + ".png"));
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            int i = this.f2207a;
            Tile tile = new Tile(i, i, bArr, true);
            fileInputStream.close();
            return tile;
        } catch (FileNotFoundException unused) {
            int i2 = tileSourceReq.x >> (tileSourceReq.zoom - 6);
            int i3 = tileSourceReq.y >> (tileSourceReq.zoom - 6);
            if (i2 >= 51 && i2 <= 53 && i3 >= 28 && i3 <= 31) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(str + "default.png"));
                    byte[] bArr2 = new byte[fileInputStream2.available()];
                    fileInputStream2.read(bArr2);
                    int i4 = this.f2207a;
                    Tile tile2 = new Tile(i4, i4, bArr2, true);
                    fileInputStream2.close();
                    return tile2;
                } catch (Exception e) {
                    e.printStackTrace();
                    return TileProvider.NO_TILE;
                }
            }
            return TileProvider.NO_TILE;
        } catch (IOException unused2) {
            return TileProvider.NO_TILE;
        }
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileWidth() {
        return this.f2207a;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileHeight() {
        return this.f2207a;
    }

    private byte[] a(int i, int i2, int i3, String str) {
        try {
            return new a(i, i2, i3, str).makeHttpRequestWithInterrupted();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    final class a extends dj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f2211b;
        private String g;

        public a(int i, int i2, int i3, String str) {
            this.f2211b = "";
            this.g = "";
            String str2 = String.format(str, Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2));
            if (!str2.contains("?")) {
                this.f2211b = str2 + "?";
                return;
            }
            String[] strArrSplit = str2.split("\\?");
            if (strArrSplit.length > 1) {
                this.f2211b = strArrSplit[0] + "?";
                this.g = strArrSplit[1];
            }
        }

        @Override // com.amap.api.col.p0003sl.dj, com.amap.api.col.p0003sl.la
        public final Map<String, String> getRequestHead() {
            return super.getRequestHead();
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getURL() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.g);
            stringBuffer.append("&key=").append(il.f(ad.f2193a));
            stringBuffer.append("&channel=amapapi");
            return this.f2211b + appendTsScode(stringBuffer.toString());
        }
    }
}
