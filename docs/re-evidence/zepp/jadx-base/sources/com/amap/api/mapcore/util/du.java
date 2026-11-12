package com.amap.api.mapcore.util;

import android.text.TextUtils;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.Tile;
import com.amap.api.maps.model.TileProvider;
import com.autonavi.base.amap.mapcore.MapConfig;
import com.loopj.android.http.AsyncHttpClient;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class du implements TileProvider {
    public Random a = new Random();
    private final int b = 256;
    private final int c = 256;
    private MapConfig d;
    private final boolean e;

    public class a extends dq {
        private int f;
        private int g;
        private int h;
        private String i;
        private String j;

        public a(int i, int i2, int i3, String str) {
            this.j = "";
            this.f = i;
            this.g = i2;
            this.h = i3;
            this.i = str;
            this.j = (ek.a(i, i2, i3) || this.h < 6) ? String.format(Locale.US, "http://wprd0%d.is.autonavi.com/appmaptile?", Integer.valueOf((du.this.a.nextInt(100000) % 4) + 1)) : MapsInitializer.isLoadWorldGridMap() ? "http://restsdk.amap.com/v4/gridmap?" : null;
            setProxy(gs.a(t.a));
            setConnectionTimeout(5000);
            setSoTimeout(50000);
        }

        private static String a(String str) {
            String[] strArrSplit = str.split(com.alipay.sdk.m.s.a.l);
            Arrays.sort(strArrSplit);
            StringBuffer stringBuffer = new StringBuffer();
            for (String str2 : strArrSplit) {
                stringBuffer.append(b(str2));
                stringBuffer.append(com.alipay.sdk.m.s.a.l);
            }
            String string = stringBuffer.toString();
            return string.length() > 1 ? (String) string.subSequence(0, string.length() - 1) : str;
        }

        private static String b(String str) {
            if (str == null) {
                return str;
            }
            try {
                return URLDecoder.decode(str, "utf-8");
            } catch (UnsupportedEncodingException e) {
                hn.c(e, "AbstractProtocalHandler", "strReEncoder");
                return "";
            } catch (Exception e2) {
                hn.c(e2, "AbstractProtocalHandler", "strReEncoderException");
                return "";
            }
        }

        @Override // com.amap.api.mapcore.util.ir
        public final String getIPV6URL() {
            String url = getURL();
            return (url == null || !url.contains("http://restsdk.amap.com/v4/gridmap?")) ? url : er.a(url);
        }

        @Override // com.amap.api.mapcore.util.dq, com.amap.api.mapcore.util.ir
        public final Map<String, String> getParams() {
            return null;
        }

        @Override // com.amap.api.mapcore.util.ir
        public final Map<String, String> getRequestHead() {
            Hashtable hashtable = new Hashtable(16);
            hashtable.put("User-Agent", l.c);
            hashtable.put("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
            hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", "7.9.1", "3dmap"));
            hashtable.put("x-INFO", gm.a(t.a));
            hashtable.put("key", gj.f(t.a));
            hashtable.put("logversion", "2.1");
            return hashtable;
        }

        @Override // com.amap.api.mapcore.util.ir
        public final String getURL() {
            if (TextUtils.isEmpty(this.j)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.j);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=");
            stringBuffer.append(gj.f(t.a));
            stringBuffer.append("&channel=amapapi");
            if (ek.a(this.f, this.g, this.h) || this.h < 6) {
                stringBuffer.append("&z=");
                stringBuffer.append(this.h);
                stringBuffer.append("&x=");
                stringBuffer.append(this.f);
                stringBuffer.append("&y=");
                stringBuffer.append(this.g);
                stringBuffer.append("&lang=en&size=1&scale=1&style=7");
            } else if (MapsInitializer.isLoadWorldGridMap()) {
                stringBuffer.append("&x=");
                stringBuffer.append(this.f);
                stringBuffer.append("&y=");
                stringBuffer.append(this.g);
                stringBuffer.append("&z=");
                stringBuffer.append(this.h);
                stringBuffer.append("&ds=0");
                stringBuffer.append("&dpitype=webrd");
                stringBuffer.append("&lang=");
                stringBuffer.append(this.i);
                stringBuffer.append("&scale=2");
            }
            String string = stringBuffer.toString();
            String strA = a(string);
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(string);
            String strA2 = gm.a();
            stringBuffer2.append("&ts=".concat(String.valueOf(strA2)));
            stringBuffer2.append("&scode=" + gm.a(t.a, strA2, strA));
            sb.append(stringBuffer2.toString());
            return sb.toString();
        }

        @Override // com.amap.api.mapcore.util.ir
        public final boolean isSupportIPV6() {
            String url = getURL();
            return url != null && url.contains("http://restsdk.amap.com/v4/gridmap?");
        }
    }

    public du(MapConfig mapConfig, boolean z) {
        this.d = mapConfig;
        this.e = z;
    }

    private byte[] a(int i, int i2, int i3, String str) throws IOException {
        try {
            return new a(i, i2, i3, str).makeHttpRequestWithInterrupted();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        try {
            if (!this.e) {
                if (this.d.getMapLanguage().equals("zh_cn")) {
                    if (!MapsInitializer.isLoadWorldGridMap()) {
                        return TileProvider.NO_TILE;
                    }
                    if (i3 < 6 || ek.a(i, i2, i3)) {
                        return TileProvider.NO_TILE;
                    }
                } else if (!MapsInitializer.isLoadWorldGridMap() && i3 >= 6 && !ek.a(i, i2, i3)) {
                    return TileProvider.NO_TILE;
                }
            }
            MapConfig mapConfig = this.d;
            byte[] bArrA = a(i, i2, i3, mapConfig != null ? mapConfig.getMapLanguage() : "zh_cn");
            return bArrA == null ? TileProvider.NO_TILE : Tile.obtain(this.b, this.c, bArrA);
        } catch (IOException unused) {
            return TileProvider.NO_TILE;
        }
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileHeight() {
        return this.c;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileWidth() {
        return this.b;
    }
}
