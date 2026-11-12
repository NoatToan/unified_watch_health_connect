package defpackage;

import com.amap.api.col.p0003sl.m;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.Tile;
import com.amap.api.maps.model.TileProvider;
import com.autonavi.base.amap.mapcore.MapConfig;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class rks implements TileProvider {
    public MapConfig c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32650a = 256;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32651b = 256;
    public final boolean d = false;

    public class a extends m {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f32652r;
        public int s;
        public int t;
        public String u;
        public String v;
        public Random w = new Random();

        public a(int i, int i2, int i3, String str) {
            this.v = "";
            this.f32652r = i;
            this.s = i2;
            this.t = i3;
            this.u = str;
            this.v = m();
        }

        private String m() {
            if (wls.b(this.f32652r, this.s, this.t) || this.t < 6) {
                return String.format(Locale.US, "http://wprd0%d.is.autonavi.com/appmaptile?", Integer.valueOf((this.w.nextInt(100000) % 4) + 1));
            }
            if (MapsInitializer.isLoadWorldGridMap()) {
                return "http://restsdk.amap.com/v4/gridmap?";
            }
            return null;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getURL() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=");
            stringBuffer.append(e0t.k(p4s.f));
            stringBuffer.append("&channel=amapapi");
            if (wls.b(this.f32652r, this.s, this.t) || this.t < 6) {
                stringBuffer.append("&z=");
                stringBuffer.append(this.t);
                stringBuffer.append("&x=");
                stringBuffer.append(this.f32652r);
                stringBuffer.append("&y=");
                stringBuffer.append(this.s);
                stringBuffer.append("&lang=en&size=1&scale=1&style=7");
            } else if (MapsInitializer.isLoadWorldGridMap()) {
                stringBuffer.append("&x=");
                stringBuffer.append(this.f32652r);
                stringBuffer.append("&y=");
                stringBuffer.append(this.s);
                stringBuffer.append("&z=");
                stringBuffer.append(this.t);
                stringBuffer.append("&ds=0");
                stringBuffer.append("&dpitype=webrd");
                stringBuffer.append("&lang=");
                stringBuffer.append(this.u);
                stringBuffer.append("&scale=2");
            }
            return this.v + appendTsScode(stringBuffer.toString());
        }
    }

    public rks(MapConfig mapConfig) {
        this.c = mapConfig;
    }

    public final byte[] a(int i, int i2, int i3, String str) throws IOException {
        try {
            return new a(i, i2, i3, str).makeHttpRequestWithInterrupted();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        try {
            if (!this.d) {
                if (this.c.getMapLanguage().equals("zh_cn")) {
                    if (!MapsInitializer.isLoadWorldGridMap()) {
                        return TileProvider.NO_TILE;
                    }
                    if (i3 < 6 || wls.b(i, i2, i3)) {
                        return TileProvider.NO_TILE;
                    }
                } else if (!MapsInitializer.isLoadWorldGridMap() && i3 >= 6 && !wls.b(i, i2, i3)) {
                    return TileProvider.NO_TILE;
                }
            }
            MapConfig mapConfig = this.c;
            byte[] bArrA = a(i, i2, i3, mapConfig != null ? mapConfig.getMapLanguage() : "zh_cn");
            return bArrA == null ? TileProvider.NO_TILE : Tile.obtain(this.f32650a, this.f32651b, bArrA);
        } catch (IOException unused) {
            return TileProvider.NO_TILE;
        }
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileHeight() {
        return this.f32651b;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileWidth() {
        return this.f32650a;
    }
}
