package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.opengl.GLES20;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.TileOverlayOptions;
import com.amap.api.maps.model.TileProvider;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.ITileOverlay;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.ITileOverlayDelegate;
import com.autonavi.base.amap.mapcore.MapConfig;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dd implements ITileOverlayDelegate {
    private static int h;
    public df.g a;
    private z b;
    private TileProvider c;
    private Float d;
    private boolean e;
    private boolean f;
    private IAMapDelegate g;
    private int i;
    private int j;
    private int k;
    private es l;
    private List<a> m = new ArrayList();
    private boolean n = false;
    private b o = null;
    private String p;
    private FloatBuffer q;

    public static class b extends dr<Void, Void, List<a>> {
        private int d;
        private boolean e;
        private int f;
        private int g;
        private int h;
        private WeakReference<IAMapDelegate> i;
        private List<a> j;
        private boolean k;
        private WeakReference<z> l;
        private WeakReference<es> m;

        public b(boolean z, IAMapDelegate iAMapDelegate, int i, int i2, int i3, List<a> list, boolean z2, z zVar, es esVar) {
            this.f = 256;
            this.g = 256;
            this.h = 0;
            this.e = z;
            this.i = new WeakReference<>(iAMapDelegate);
            this.f = i;
            this.g = i2;
            this.h = i3;
            this.j = list;
            this.k = z2;
            this.l = new WeakReference<>(zVar);
            this.m = new WeakReference<>(esVar);
        }

        private List<a> d() {
            try {
                IAMapDelegate iAMapDelegate = this.i.get();
                if (iAMapDelegate == null) {
                    return null;
                }
                int mapWidth = iAMapDelegate.getMapWidth();
                int mapHeight = iAMapDelegate.getMapHeight();
                int zoomLevel = (int) iAMapDelegate.getZoomLevel();
                this.d = zoomLevel;
                if (mapWidth > 0 && mapHeight > 0) {
                    return dd.a(iAMapDelegate, zoomLevel, this.f, this.g, this.h, this.l.get(), this.m.get());
                }
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        @Override // com.amap.api.mapcore.util.dr
        public final /* synthetic */ List<a> a(Void[] voidArr) {
            return d();
        }

        @Override // com.amap.api.mapcore.util.dr
        public final /* synthetic */ void a(List<a> list) {
            List<a> list2 = list;
            if (list2 != null) {
                try {
                    if (list2.size() <= 0) {
                        return;
                    }
                    dd.b(this.i.get(), list2, this.d, this.e, this.j, this.k, this.l.get(), this.m.get());
                    list2.clear();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public dd(TileOverlayOptions tileOverlayOptions, z zVar, boolean z) {
        this.f = false;
        this.i = 256;
        this.j = 256;
        this.k = -1;
        this.p = null;
        this.q = null;
        this.b = zVar;
        TileProvider tileProvider = tileOverlayOptions.getTileProvider();
        this.c = tileProvider;
        this.i = tileProvider.getTileWidth();
        this.j = this.c.getTileHeight();
        this.q = er.a(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f});
        this.d = Float.valueOf(tileOverlayOptions.getZIndex());
        this.e = tileOverlayOptions.isVisible();
        this.f = z;
        if (z) {
            this.p = "TileOverlay0";
        } else {
            this.p = getId();
        }
        this.g = this.b.a();
        this.k = Integer.parseInt(this.p.substring(11));
        try {
            ev.a aVar = z ? new ev.a(this.b.f(), this.p, zVar.a().getMapConfig().getMapLanguage()) : new ev.a(this.b.f(), this.p);
            aVar.f = tileOverlayOptions.getMemoryCacheEnabled();
            if (this.f) {
                aVar.i = false;
            }
            aVar.g = tileOverlayOptions.getDiskCacheEnabled();
            aVar.a = tileOverlayOptions.getMemCacheSize();
            long diskCacheSize = tileOverlayOptions.getDiskCacheSize();
            if (diskCacheSize <= 0) {
                aVar.g = false;
            }
            aVar.b = diskCacheSize;
            String diskCacheDir = tileOverlayOptions.getDiskCacheDir();
            if (diskCacheDir != null && !"".equals(diskCacheDir)) {
                aVar.c = new File(diskCacheDir);
            }
            es esVar = new es(this.b.f(), this.i, this.j);
            this.l = esVar;
            esVar.a(this.c);
            this.l.a(aVar);
            this.l.a(new eu.c() { // from class: com.amap.api.mapcore.util.dd.1
                @Override // com.amap.api.mapcore.util.eu.c
                public final void a() {
                    dd.this.g.resetRenderTimeLongLong();
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6 A[Catch: all -> 0x00b9, TryCatch #0 {, blocks: (B:8:0x0008, B:9:0x000c, B:11:0x0013, B:12:0x001d, B:14:0x0023, B:16:0x002f, B:18:0x0033, B:21:0x003d, B:22:0x0041, B:24:0x004b, B:27:0x0053, B:29:0x0059, B:32:0x005d, B:35:0x0067, B:37:0x007d, B:39:0x0083, B:41:0x0087, B:44:0x0092, B:46:0x0098, B:48:0x009c, B:50:0x00a6, B:53:0x00af, B:54:0x00b2, B:55:0x00b5, B:57:0x00b7), top: B:62:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x00b2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static boolean b(IAMapDelegate iAMapDelegate, List<a> list, int i, boolean z, List<a> list2, boolean z2, z zVar, es esVar) {
        int i2;
        int i3;
        boolean z3;
        if (list == null || list2 == null) {
            return false;
        }
        synchronized (list2) {
            Iterator<a> it2 = list2.iterator();
            while (true) {
                boolean z4 = true;
                if (!it2.hasNext()) {
                    break;
                }
                a next = it2.next();
                Iterator<a> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z4 = false;
                        break;
                    }
                    a next2 = it3.next();
                    if (next.equals(next2) && (z3 = next.g)) {
                        next2.g = z3;
                        next2.f = next.f;
                        break;
                    }
                }
                if (!z4) {
                    next.a();
                }
            }
            list2.clear();
            if (i <= ((int) iAMapDelegate.getMaxZoomLevel()) && i >= ((int) iAMapDelegate.getMinZoomLevel())) {
                int size = list.size();
                if (size <= 0) {
                    return false;
                }
                for (int i4 = 0; i4 < size; i4++) {
                    a aVar = list.get(i4);
                    if (aVar != null) {
                        if (!z2) {
                            list2.add(aVar);
                            if (aVar.g && esVar != null) {
                                esVar.a(z, aVar);
                            }
                        } else if (zVar.a().getMapConfig().getMapLanguage().equals("zh_cn")) {
                            if (MapsInitializer.isLoadWorldGridMap() && (i3 = aVar.c) >= 6 && !ek.a(aVar.a, aVar.b, i3)) {
                                list2.add(aVar);
                                if (aVar.g) {
                                }
                            }
                        } else if (MapsInitializer.isLoadWorldGridMap() || (i2 = aVar.c) < 6 || ek.a(aVar.a, aVar.b, i2)) {
                            list2.add(aVar);
                            if (aVar.g) {
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ITileOverlay
    public final void clearTileCache() {
        es esVar = this.l;
        if (esVar != null) {
            esVar.f();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ITileOverlay
    public final void destroy(boolean z) {
        b();
        synchronized (this.m) {
            int size = this.m.size();
            for (int i = 0; i < size; i++) {
                this.m.get(i).a();
            }
            this.m.clear();
        }
        es esVar = this.l;
        if (esVar != null) {
            esVar.c(z);
            this.l.a(true);
            this.l.a((TileProvider) null);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.ITileOverlayDelegate
    public final void drawTiles() throws Throwable {
        dd ddVar;
        int i;
        z zVar;
        dd ddVar2 = this;
        List<a> list = ddVar2.m;
        if (list != null) {
            synchronized (list) {
                try {
                    if (ddVar2.m.size() == 0) {
                        return;
                    }
                    int size = ddVar2.m.size();
                    char c = 0;
                    int i2 = 0;
                    while (i2 < size) {
                        a aVar = ddVar2.m.get(i2);
                        if (!aVar.g) {
                            try {
                                IPoint iPoint = aVar.e;
                                Bitmap bitmap = aVar.i;
                                if (bitmap != null && !bitmap.isRecycled() && iPoint != null) {
                                    int iA = er.a(aVar.i);
                                    aVar.f = iA;
                                    if (iA != 0) {
                                        aVar.g = true;
                                    }
                                    aVar.i = null;
                                }
                            } catch (Throwable th) {
                                hn.c(th, "TileOverlayDelegateImp", "drawTiles");
                            }
                        }
                        if (aVar.g) {
                            float f = aVar.c;
                            int i3 = ddVar2.i;
                            int i4 = ddVar2.j;
                            IPoint iPoint2 = aVar.e;
                            int i5 = ((Point) iPoint2).x;
                            int i6 = 1 << (20 - ((int) f));
                            int i7 = i4 * i6;
                            int i8 = ((Point) iPoint2).y + i7;
                            MapConfig mapConfig = ddVar2.g.getMapConfig();
                            float[] fArr = new float[12];
                            double d = i5;
                            fArr[c] = (float) (d - mapConfig.getSX());
                            double d2 = i8;
                            i = i2;
                            fArr[1] = (float) (d2 - mapConfig.getSY());
                            fArr[2] = 0.0f;
                            double d3 = i5 + (i6 * i3);
                            try {
                                fArr[3] = (float) (d3 - mapConfig.getSX());
                                fArr[4] = (float) (d2 - mapConfig.getSY());
                                fArr[5] = 0.0f;
                                fArr[6] = (float) (d3 - mapConfig.getSX());
                                double d4 = i8 - i7;
                                fArr[7] = (float) (d4 - mapConfig.getSY());
                                fArr[8] = 0.0f;
                                fArr[9] = (float) (d - mapConfig.getSX());
                                fArr[10] = (float) (d4 - mapConfig.getSY());
                                fArr[11] = 0.0f;
                                FloatBuffer floatBuffer = aVar.h;
                                if (floatBuffer == null) {
                                    aVar.h = er.a(fArr);
                                } else {
                                    aVar.h = er.a(fArr, floatBuffer);
                                }
                                int i9 = aVar.f;
                                FloatBuffer floatBuffer2 = aVar.h;
                                ddVar = this;
                                try {
                                    FloatBuffer floatBuffer3 = ddVar.q;
                                    if (floatBuffer2 != null && floatBuffer3 != null && i9 != 0) {
                                        df.g gVar = ddVar.a;
                                        if ((gVar == null || gVar.b()) && (zVar = ddVar.b) != null && zVar.a() != null) {
                                            ddVar.a = (df.g) ddVar.b.a().getGLShader(0);
                                        }
                                        GLES20.glUseProgram(ddVar.a.d);
                                        GLES20.glEnable(3042);
                                        GLES20.glBlendFunc(1, 771);
                                        GLES20.glBlendColor(1.0f, 1.0f, 1.0f, 1.0f);
                                        GLES20.glActiveTexture(33984);
                                        GLES20.glBindTexture(3553, i9);
                                        GLES20.glEnableVertexAttribArray(ddVar.a.b);
                                        GLES20.glVertexAttribPointer(ddVar.a.b, 3, 5126, false, 12, (Buffer) floatBuffer2);
                                        GLES20.glEnableVertexAttribArray(ddVar.a.c);
                                        GLES20.glVertexAttribPointer(ddVar.a.c, 2, 5126, false, 8, (Buffer) floatBuffer3);
                                        GLES20.glUniformMatrix4fv(ddVar.a.a, 1, false, ddVar.b.g(), 0);
                                        GLES20.glDrawArrays(6, 0, 4);
                                        GLES20.glDisableVertexAttribArray(ddVar.a.b);
                                        GLES20.glDisableVertexAttribArray(ddVar.a.c);
                                        GLES20.glBindTexture(3553, 0);
                                        GLES20.glUseProgram(0);
                                        GLES20.glDisable(3042);
                                    }
                                    i2 = i + 1;
                                    ddVar2 = ddVar;
                                    c = 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            ddVar = ddVar2;
                            i = i2;
                        }
                        i2 = i + 1;
                        ddVar2 = ddVar;
                        c = 0;
                    }
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
                throw th;
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ITileOverlay
    public final boolean equalsRemote(ITileOverlay iTileOverlay) {
        return equals(iTileOverlay) || iTileOverlay.getId().equals(getId());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ITileOverlay
    public final String getId() {
        if (this.p == null) {
            h++;
            this.p = "TileOverlay" + h;
        }
        return this.p;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ITileOverlay
    public final float getZIndex() {
        return this.d.floatValue();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ITileOverlay
    public final int hashCodeRemote() {
        return super.hashCode();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ITileOverlay
    public final boolean isVisible() {
        return this.e;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.ITileOverlayDelegate
    public final void onFling(boolean z) {
        if (this.n != z) {
            this.n = z;
            es esVar = this.l;
            if (esVar != null) {
                esVar.a(z);
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.ITileOverlayDelegate
    public final void onPause() {
        b();
        synchronized (this.m) {
            int size = this.m.size();
            for (int i = 0; i < size; i++) {
                this.m.get(i).a();
            }
            this.m.clear();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.ITileOverlayDelegate
    public final void onResume() {
        es esVar = this.l;
        if (esVar != null) {
            esVar.a();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.ITileOverlayDelegate
    public final void reLoadTexture() {
        List<a> list = this.m;
        if (list != null) {
            synchronized (list) {
                if (this.m.size() == 0) {
                    return;
                }
                for (a aVar : this.m) {
                    aVar.g = false;
                    aVar.f = 0;
                }
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.ITileOverlayDelegate
    public final void refresh(boolean z) {
        if (this.n) {
            return;
        }
        try {
            b();
            a(z);
        } catch (Throwable th) {
            th.printStackTrace();
            hn.c(th, "TileOverlayDelegateImp", "refresh");
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ITileOverlay
    public final void remove() {
        this.b.a(this);
        this.g.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ITileOverlay
    public final void setVisible(boolean z) {
        this.e = z;
        this.g.setRunLowFrame(false);
        if (z) {
            refresh(true);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.ITileOverlay
    public final void setZIndex(float f) {
        this.d = Float.valueOf(f);
        this.b.d();
    }

    public final void a() {
        List<a> list = this.m;
        if (list != null) {
            synchronized (list) {
                this.m.clear();
            }
        }
    }

    private void a(boolean z) {
        try {
            b bVar = new b(z, this.g, this.i, this.j, this.k, this.m, this.f, this.b, this.l);
            this.o = bVar;
            bVar.b((Object[]) new Void[0]);
        } catch (Throwable unused) {
        }
    }

    public final void a(String str) {
        b();
        a();
        es esVar = this.l;
        if (esVar != null) {
            esVar.a(true);
            this.l.a(str);
            this.l.a(false);
        }
        a(true);
    }

    public static class a implements Cloneable {
        public int a;
        public int b;
        public int c;
        public int d;
        public IPoint e;
        public int f;
        public boolean g;
        public FloatBuffer h;
        public Bitmap i;
        public eu.a j;
        public int k;
        private IAMapDelegate l;
        private z m;
        private es n;

        public a(int i, int i2, int i3, int i4, IAMapDelegate iAMapDelegate, z zVar, es esVar) {
            this.f = 0;
            this.g = false;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = 0;
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.l = iAMapDelegate;
            this.m = zVar;
            this.n = esVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a clone() {
            try {
                a aVar = (a) super.clone();
                aVar.a = this.a;
                aVar.b = this.b;
                aVar.c = this.c;
                aVar.d = this.d;
                aVar.e = (IPoint) this.e.clone();
                aVar.h = this.h.asReadOnlyBuffer();
                this.k = 0;
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return new a(this);
        }

        public final synchronized void a(Bitmap bitmap) {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    try {
                        this.j = null;
                        this.i = bitmap;
                        this.l.setRunLowFrame(false);
                        return;
                    } catch (Throwable th) {
                        hn.c(th, "TileOverlayDelegateImp", "setBitmap");
                        th.printStackTrace();
                        int i = this.k;
                        if (i < 3) {
                            this.k = i + 1;
                            es esVar = this.n;
                            if (esVar != null) {
                                esVar.a(true, this);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            int i2 = this.k;
            if (i2 < 3) {
                this.k = i2 + 1;
                es esVar2 = this.n;
                if (esVar2 != null) {
                    esVar2.a(true, this);
                }
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return (this.a * 7) + (this.b * 11) + (this.c * 13) + this.d;
        }

        public final String toString() {
            return this.a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.b + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.c + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.d;
        }

        private a(a aVar) {
            this.f = 0;
            this.g = false;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = 0;
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.h = aVar.h;
            this.k = 0;
            this.m = aVar.m;
            this.l = aVar.l;
            this.n = aVar.n;
        }

        public final void a() {
            try {
                eu.a(this);
                if (this.g) {
                    this.m.a(this.f);
                }
                this.g = false;
                this.f = 0;
                Bitmap bitmap = this.i;
                if (bitmap != null && !bitmap.isRecycled()) {
                    er.c(this.i);
                }
                this.i = null;
                FloatBuffer floatBuffer = this.h;
                if (floatBuffer != null) {
                    floatBuffer.clear();
                }
                this.h = null;
                this.j = null;
                this.k = 0;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0196  */
    public static /* synthetic */ ArrayList a(IAMapDelegate iAMapDelegate, int i, int i2, int i3, int i4, z zVar, es esVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int i9;
        boolean z2;
        int i10;
        int i11;
        GLMapState mapProjection = iAMapDelegate.getMapProjection();
        Rect rect = iAMapDelegate.getMapConfig().getGeoRectangle().getRect();
        IPoint iPointObtain = IPoint.obtain();
        IPoint iPointObtain2 = IPoint.obtain();
        int i12 = rect.left;
        ((Point) iPointObtain).x = i12;
        ((Point) iPointObtain).y = rect.top;
        int iMin = Math.min(Integer.MAX_VALUE, i12);
        int iMax = Math.max(0, ((Point) iPointObtain).x);
        int iMin2 = Math.min(Integer.MAX_VALUE, ((Point) iPointObtain).y);
        int iMax2 = Math.max(0, ((Point) iPointObtain).y);
        int i13 = rect.right;
        ((Point) iPointObtain).x = i13;
        ((Point) iPointObtain).y = rect.top;
        int iMin3 = Math.min(iMin, i13);
        int iMax3 = Math.max(iMax, ((Point) iPointObtain).x);
        int iMin4 = Math.min(iMin2, ((Point) iPointObtain).y);
        int iMax4 = Math.max(iMax2, ((Point) iPointObtain).y);
        int i14 = rect.left;
        ((Point) iPointObtain).x = i14;
        ((Point) iPointObtain).y = rect.bottom;
        int iMin5 = Math.min(iMin3, i14);
        int iMax5 = Math.max(iMax3, ((Point) iPointObtain).x);
        int iMin6 = Math.min(iMin4, ((Point) iPointObtain).y);
        int iMax6 = Math.max(iMax4, ((Point) iPointObtain).y);
        int i15 = rect.right;
        ((Point) iPointObtain).x = i15;
        ((Point) iPointObtain).y = rect.bottom;
        int iMin7 = Math.min(iMin5, i15);
        int iMax7 = Math.max(iMax5, ((Point) iPointObtain).x);
        int iMin8 = Math.min(iMin6, ((Point) iPointObtain).y);
        int iMax8 = Math.max(iMax6, ((Point) iPointObtain).y);
        int i16 = 20 - i;
        int i17 = 1 << i16;
        int i18 = iMin7 - (i17 * i2);
        mapProjection.getMapGeoCenter(iPointObtain2);
        int i19 = (((Point) iPointObtain2).x >> i16) / i2;
        int i20 = (((Point) iPointObtain2).y >> i16) / i3;
        int i21 = iMin8 - (i17 * i3);
        int i22 = iMax8;
        a aVar = new a(i19, i20, i, i4, iAMapDelegate, zVar, esVar);
        aVar.e = IPoint.obtain((i19 << i16) * i2, (i20 << i16) * i3);
        iPointObtain.recycle();
        iPointObtain2.recycle();
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        int i23 = 1;
        while (true) {
            int i24 = i19 - i23;
            int i25 = i24;
            boolean z3 = false;
            while (true) {
                i5 = i19 + i23;
                if (i25 > i5) {
                    break;
                }
                int i26 = i20 + i23;
                int i27 = (i25 << i16) * i2;
                IPoint iPoint = new IPoint(i27, (i26 << i16) * i3);
                int i28 = ((Point) iPoint).x;
                if (i28 >= iMax7 || i28 <= i18) {
                    i8 = i22;
                } else {
                    int i29 = ((Point) iPoint).y;
                    int i30 = i22;
                    if (i29 < i30) {
                        int i31 = i21;
                        if (i29 > i31) {
                            if (!z3) {
                                z3 = true;
                            }
                            int i32 = i25;
                            i19 = i19;
                            i24 = i24;
                            i8 = i30;
                            i25 = i25;
                            i27 = i27;
                            i21 = i31;
                            a aVar2 = new a(i32, i26, i, i4, iAMapDelegate, zVar, esVar);
                            aVar2.e = iPoint;
                            arrayList.add(aVar2);
                            z = z3;
                        } else {
                            i24 = i24;
                            i25 = i25;
                            i21 = i31;
                            i8 = i30;
                            i27 = i27;
                            z = z3;
                        }
                    } else {
                        i8 = i30;
                    }
                    int i33 = i20 - i23;
                    IPoint iPoint2 = new IPoint(i27, (i33 << i16) * i3);
                    i9 = ((Point) iPoint2).x;
                    if (i9 < iMax7 || i9 <= i18 || (i11 = ((Point) iPoint2).y) >= i8) {
                        z2 = z;
                        i10 = i21;
                    } else {
                        int i34 = i21;
                        if (i11 > i34) {
                            if (!z) {
                                z = true;
                            }
                            boolean z4 = z;
                            i10 = i34;
                            a aVar3 = new a(i25, i33, i, i4, iAMapDelegate, zVar, esVar);
                            aVar3.e = iPoint2;
                            arrayList.add(aVar3);
                            z2 = z4;
                        } else {
                            z2 = z;
                            i10 = i34;
                        }
                    }
                    i25++;
                    i22 = i8;
                    i24 = i24;
                    int i35 = i10;
                    z3 = z2;
                    i19 = i19;
                    i21 = i35;
                }
                z = z3;
                int i36 = i20 - i23;
                IPoint iPoint3 = new IPoint(i27, (i36 << i16) * i3);
                i9 = ((Point) iPoint3).x;
                if (i9 < iMax7) {
                    z2 = z;
                    i10 = i21;
                } else {
                    z2 = z;
                    i10 = i21;
                }
                i25++;
                i22 = i8;
                i24 = i24;
                int i37 = i10;
                z3 = z2;
                i19 = i19;
                i21 = i37;
            }
            int i38 = i24;
            int i39 = i22;
            int i40 = i21;
            int i41 = i19;
            boolean z5 = z3;
            int i42 = (i20 + i23) - 1;
            while (i42 > i20 - i23) {
                int i43 = (i42 << i16) * i3;
                IPoint iPoint4 = new IPoint((i5 << i16) * i2, i43);
                int i44 = ((Point) iPoint4).x;
                if (i44 < iMax7 && i44 > i18 && (i7 = ((Point) iPoint4).y) < i39 && i7 > i40) {
                    if (!z5) {
                        z5 = true;
                    }
                    a aVar4 = new a(i5, i42, i, i4, iAMapDelegate, zVar, esVar);
                    aVar4.e = iPoint4;
                    arrayList.add(aVar4);
                    z5 = z5;
                }
                IPoint iPoint5 = new IPoint((i38 << i16) * i2, i43);
                int i45 = ((Point) iPoint5).x;
                if (i45 < iMax7 && i45 > i18 && (i6 = ((Point) iPoint5).y) < i39 && i6 > i40) {
                    if (!z5) {
                        z5 = true;
                    }
                    a aVar5 = new a(i38, i42, i, i4, iAMapDelegate, zVar, esVar);
                    aVar5.e = iPoint5;
                    arrayList.add(aVar5);
                }
                i42--;
                i23 = i23;
                i5 = i5;
            }
            int i46 = i23;
            if (!z5) {
                return arrayList;
            }
            i23 = i46 + 1;
            i22 = i39;
            i19 = i41;
            i21 = i40;
        }
    }

    private void b() {
        b bVar = this.o;
        if (bVar == null || bVar.a() != dr.e.b) {
            return;
        }
        this.o.c();
    }
}
