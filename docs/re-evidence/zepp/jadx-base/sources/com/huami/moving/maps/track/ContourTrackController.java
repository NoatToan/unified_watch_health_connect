package com.huami.moving.maps.track;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.location.Location;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.moving.maps.track.ContourTrackController;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class ContourTrackController {
    private static final String c = "ContourTrackController";
    private static final String d = ".track";
    private ITrackMapDataListener a = null;
    private Executor b;

    public static final class TrackMapInfo {
        public int mDeviceSource;
        public int mSportType;
        public int mSrcHeight;
        public int mSrcWidth;
        public long mTrackId;

        public boolean a() {
            return this.mTrackId <= 0 || this.mSrcWidth <= 0 || this.mSrcHeight <= 0;
        }
    }

    public final class a extends AsyncTask<Void, Void, Void> {
        private long a;
        private int b;
        private int c;
        private int d;
        private int e;
        private List<GPSPoint> f = null;
        private String g = "";
        private final Context h;

        public a(Context context, TrackMapInfo trackMapInfo) {
            this.a = 0L;
            this.b = -1;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.c = trackMapInfo.mSportType;
            this.a = trackMapInfo.mTrackId;
            this.b = trackMapInfo.mDeviceSource;
            this.d = trackMapInfo.mSrcWidth;
            this.e = trackMapInfo.mSrcHeight;
            this.h = (Context) new WeakReference(context).get();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            List<GPSPoint> list = this.f;
            if (list != null && list.size() > 0) {
                try {
                    List<GPSContourTrack.a> listE = ContourTrackController.this.e(this.f, this.e, this.d);
                    GPSContourTrack gPSContourTrack = new GPSContourTrack(this.c, this.a);
                    gPSContourTrack.setPointList(listE);
                    String strF = ContourTrackController.this.f(this.h, gPSContourTrack);
                    this.g = strF;
                    if (TextUtils.isEmpty(strF)) {
                        HMLog.i(ContourTrackController.c, "CoordinateCreatorTask  mResultUri = null", new Object[0]);
                        return null;
                    }
                } catch (Exception e) {
                    HMLog.i(ContourTrackController.c, "Failed to create countour = " + this.a + ",message = " + e.getMessage(), new Object[0]);
                }
            }
            return null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r6) {
            List<GPSPoint> list = this.f;
            if (list != null) {
                list.clear();
            }
            ContourTrackController.this.n(this.a, this.b, this.g);
            super.onCancelled(r6);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r6) {
            List<GPSPoint> list = this.f;
            if (list != null) {
                list.clear();
            }
            ContourTrackController.this.n(this.a, this.b, this.g);
            super.onPostExecute(r6);
        }

        public void d(List<GPSPoint> list) {
            this.f = list;
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (this.a <= 0) {
                cancel(true);
            }
        }
    }

    public static final class b {
        private int a = Integer.MAX_VALUE;
        private int b = Integer.MAX_VALUE;
        private int c = Integer.MIN_VALUE;
        private int d = Integer.MIN_VALUE;
        private List<Path> e = null;

        private b() {
        }

        public static b b(List<GPSContourTrack.a> list) {
            b bVar = new b();
            Iterator<GPSContourTrack.a> it2 = list.iterator();
            while (it2.hasNext()) {
                bVar.e(it2.next());
            }
            ArrayList arrayList = new ArrayList();
            GPSContourTrack.a aVar = null;
            Path path = null;
            for (GPSContourTrack.a aVar2 : list) {
                if (aVar == null) {
                    path = new Path();
                    path.moveTo(aVar2.c() - bVar.a, aVar2.d() - bVar.b);
                    arrayList.add(path);
                    aVar = aVar2;
                } else {
                    path.lineTo(aVar2.c() - bVar.a, aVar2.d() - bVar.b);
                }
            }
            bVar.e = arrayList;
            return bVar;
        }

        private void e(GPSContourTrack.a aVar) {
            if (this.a >= aVar.c()) {
                this.a = f(aVar.c(), false);
            }
            if (this.b >= aVar.d()) {
                this.b = f(aVar.d(), false);
            }
            if (this.c <= aVar.c()) {
                this.c = f(aVar.c(), true);
            }
            if (this.d <= aVar.d()) {
                this.d = f(aVar.d(), true);
            }
        }

        private int f(int i, boolean z) {
            return z ? Math.max(0, i + SimpleTrackBitmapCreator.f()) + SimpleTrackBitmapCreator.d() : i - SimpleTrackBitmapCreator.getCachedWidth();
        }

        public void c() {
            List<Path> list = this.e;
            if (list != null) {
                list.clear();
            }
        }

        public int[] d() {
            return new int[]{this.c - this.a, this.d - this.b};
        }
    }

    public ContourTrackController() {
        this.b = null;
        this.b = Executors.newScheduledThreadPool(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<GPSContourTrack.a> e(List<GPSPoint> list, int i, int i2) {
        double d2 = 2.147483647E9d;
        double d3 = -2.147483648E9d;
        double d4 = 2.147483647E9d;
        double d5 = -2.147483648E9d;
        for (GPSPoint gPSPoint : list) {
            double d6 = gPSPoint.mLatitude;
            if (d6 >= d5) {
                d5 = d6;
            }
            if (d6 <= d2) {
                d2 = d6;
            }
            double d7 = gPSPoint.mLongitude;
            if (d7 >= d3) {
                d3 = d7;
            }
            if (d7 <= d4) {
                d4 = d7;
            }
        }
        double[] dArrL = l(d5, d2, d3, d4, j(d2, d4, d5, d3, i2, i));
        if (dArrL.length != 2) {
            HMLog.i("IllegalArgumentException", "ContourTrackController convertToCoordinateList", new Object[0]);
            throw new IllegalArgumentException("scaleXyFactor.length != 2");
        }
        ArrayList arrayList = new ArrayList();
        for (GPSPoint gPSPoint2 : list) {
            int[] iArrK = k(gPSPoint2.mLatitude, gPSPoint2.mLongitude, d4, d5, dArrL);
            arrayList.add(new GPSContourTrack.a((short) iArrK[0], (short) iArrK[1], (short) 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String f(Context context, GPSContourTrack gPSContourTrack) {
        b bVarB = b.b(gPSContourTrack.getPointList());
        Bitmap bitmapCreateBitmap = new SimpleTrackBitmapCreator(bVarB.d()).createBitmap(bVarB.e);
        bVarB.c();
        String strI = i(context, gPSContourTrack.getTrackId() + d);
        if (p(strI, bitmapCreateBitmap)) {
            return strI;
        }
        return null;
    }

    private static float g(double d2, double d3, double d4, double d5) {
        float[] fArr = new float[1];
        Location.distanceBetween(d2, d3, d4, d5, fArr);
        return fArr[0];
    }

    private String i(Context context, String str) {
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir().getAbsolutePath() + "/trackPath");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str).getAbsolutePath();
    }

    private int[] j(double d2, double d3, double d4, double d5, int i, int i2) {
        double dG = g(d4, d5, d2, d5);
        double dG2 = g(d2, d3, d2, d5);
        if (dG2 <= 5.0d) {
            return new int[]{1, i};
        }
        if (dG <= 5.0d) {
            return new int[]{i, 1};
        }
        return dG / dG2 < 1.0d ? new int[]{i, (int) ((dG * ((double) i)) / dG2)} : new int[]{(int) ((dG2 * ((double) i2)) / dG), i2};
    }

    private int[] k(double d2, double d3, double d4, double d5, double[] dArr) {
        if (dArr[0] <= 0.0d || dArr[1] <= 0.0d) {
            throw new IllegalArgumentException("getRealXY invalid factor");
        }
        return new int[]{(int) (((d3 - d4) * 3600.0d) / dArr[0]), (int) (((d5 - d2) * 3600.0d) / dArr[1])};
    }

    private double[] l(double d2, double d3, double d4, double d5, int[] iArr) {
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            throw new IllegalArgumentException("getXYScaleFactor invalid ratio");
        }
        return new double[]{((d4 - d5) * 3600.0d) / ((double) iArr[0]), ((d2 - d3) * 3600.0d) / ((double) iArr[1])};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m(TrackMapInfo trackMapInfo) {
        return "ContourTrackController executeContourTrackAsynced: mapInfo=id=" + trackMapInfo.mTrackId + ", h=" + trackMapInfo.mSrcHeight + ", w=" + trackMapInfo.mSrcWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(long j, int i, String str) {
        ITrackMapDataListener iTrackMapDataListener = this.a;
        if (iTrackMapDataListener != null) {
            iTrackMapDataListener.onContourTrackCreated(j, i, str);
        }
    }

    private boolean p(String str, Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        boolean zCompress = false;
        if (!TextUtils.isEmpty(str) && bitmap != null) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                    } catch (Exception unused) {
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        return zCompress;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (Exception unused4) {
            } catch (Throwable th3) {
                fileOutputStream = null;
                th = th3;
            }
        }
        return zCompress;
    }

    public boolean h(Context context, List<GPSPoint> list, final TrackMapInfo trackMapInfo) {
        if (trackMapInfo.a()) {
            HMLog.warn(c, null, new Function0() { // from class: xz0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ContourTrackController.m(trackMapInfo);
                }
            });
            return false;
        }
        a aVar = new a(context, trackMapInfo);
        aVar.d(list);
        aVar.executeOnExecutor(this.b, new Void[0]);
        return true;
    }

    public void o(ITrackMapDataListener iTrackMapDataListener) {
        this.a = iTrackMapDataListener;
    }

    public void q() {
        this.a = null;
    }
}
