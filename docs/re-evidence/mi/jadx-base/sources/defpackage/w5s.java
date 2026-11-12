package defpackage;

import com.amap.api.col.p0003sl.m;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.Tile;
import com.amap.api.maps.model.TileOverlaySource;
import com.amap.api.maps.model.TileProvider;
import com.autonavi.base.ae.gmap.bean.TileSourceProvider;
import com.autonavi.base.ae.gmap.bean.TileSourceReq;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class w5s implements TileSourceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37641a = 256;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TileOverlaySource f37642b;
    public final TileOverlaySource c;

    public class a extends m {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public String f37643r;
        public String s;

        public a(int i, int i2, int i3, String str) {
            this.f37643r = "";
            this.s = "";
            String str2 = String.format(str, Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2));
            if (!str2.contains("?")) {
                this.f37643r = str2 + "?";
                return;
            }
            String[] strArrSplit = str2.split("\\?");
            if (strArrSplit.length > 1) {
                this.f37643r = strArrSplit[0] + "?";
                this.s = strArrSplit[1];
            }
        }

        @Override // com.amap.api.col.p0003sl.m, com.amap.api.col.p0003sl.la
        public final Map<String, String> getRequestHead() {
            return super.getRequestHead();
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getURL() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.s);
            stringBuffer.append("&key=");
            stringBuffer.append(e0t.k(p4s.f));
            stringBuffer.append("&channel=amapapi");
            return this.f37643r + appendTsScode(stringBuffer.toString());
        }
    }

    public w5s(TileOverlaySource tileOverlaySource, TileOverlaySource tileOverlaySource2) {
        this.f37642b = tileOverlaySource;
        this.c = tileOverlaySource2;
    }

    private byte[] b(int i, int i2, int i3, String str) {
        try {
            return new a(i, i2, i3, str).makeHttpRequestWithInterrupted();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final Tile a(TileSourceReq tileSourceReq) {
        String str = MapsInitializer.TERRAIN_LOCAL_DEM_SOURCE_PATH;
        try {
            int i = tileSourceReq.x;
            if (i > 0) {
                i /= 10;
            }
            int i2 = tileSourceReq.y;
            if (i2 > 0) {
                i2 /= 10;
            }
            FileInputStream fileInputStream = new FileInputStream(new File(str + tileSourceReq.zoom + "/" + i + "/" + i2 + "/" + tileSourceReq.x + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + tileSourceReq.y + ".png"));
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            int i3 = this.f37641a;
            Tile tile = new Tile(i3, i3, bArr, true);
            fileInputStream.close();
            return tile;
        } catch (FileNotFoundException unused) {
            int i4 = tileSourceReq.x;
            int i5 = tileSourceReq.zoom;
            int i6 = i4 >> (i5 - 6);
            int i7 = tileSourceReq.y >> (i5 - 6);
            if (i6 >= 51 && i6 <= 53 && i7 >= 28 && i7 <= 31) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(str + "default.png"));
                    byte[] bArr2 = new byte[fileInputStream2.available()];
                    fileInputStream2.read(bArr2);
                    int i8 = this.f37641a;
                    Tile tile2 = new Tile(i8, i8, bArr2, true);
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

    @Override // com.autonavi.base.ae.gmap.bean.TileSourceProvider
    public final void cancel(TileSourceReq tileSourceReq) {
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        return null;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileHeight() {
        return this.f37641a;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileWidth() {
        return this.f37641a;
    }

    @Override // com.autonavi.base.ae.gmap.bean.TileSourceProvider
    public final Tile getTile(TileSourceReq tileSourceReq) {
        if (tileSourceReq == null) {
            return TileProvider.NO_TILE;
        }
        Tile tile = TileProvider.NO_TILE;
        try {
            String url = tileSourceReq.sourceType == this.c.getId() ? this.c.getUrl() : this.f37642b.getUrl();
            if (url == null) {
                return tile;
            }
            Tile tileA = MapsInitializer.TERRAIN_LOCAL_DEM_SOURCE_PATH != null ? a(tileSourceReq) : tile;
            if (tileA != tile) {
                return tileA;
            }
            int i = this.f37641a;
            return new Tile(i, i, b(tileSourceReq.x, tileSourceReq.y, tileSourceReq.zoom, url), true);
        } catch (Exception e) {
            Tile tile2 = TileProvider.NO_TILE;
            e.printStackTrace();
            return tile2;
        }
    }
}
