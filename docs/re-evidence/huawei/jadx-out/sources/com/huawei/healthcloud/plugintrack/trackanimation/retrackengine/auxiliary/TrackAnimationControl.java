package com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary;

import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LenLatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.ReTrackSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.profile.ProfileExtendConstants;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes10.dex */
public abstract class TrackAnimationControl {
    protected static final float DEFAULT_DP_DISTANCE = 2.5f;
    private static final float DEFAULT_MAX_ZOOM = 19.0f;
    private static final float DEFAULT_MIN_ZOOM = 3.0f;
    protected static final int DEFAULT_PX_DISTANCE = 10;
    public static final long DISAPPEAR_DECELERATION_DURATION = 150;
    public static final long DISAPPEAR_FRICTION_DURATION = 250;
    public static final long DISAPPEAR_INTERVAL = 100;
    public static final long DISPLAY_DECELERATION_DURATION = 150;
    public static final long DISPLAY_FRICTION_DURATION = 250;
    public static final long DISPLAY_PHOTO_DURATION = 1600;
    public static final long FINAL_TILT_DURATION = 500;
    public static final long FINAL_ZOOM_DURATION = 1000;
    public static final long INITIAL_TILT_DURATION = 500;
    public static final long INITIAL_WAIT_DURATION = 300;
    public static final long INITIAL_ZOOM_DURATION = 1000;
    public static final long PAUSE_REGAIN_DURATION = 300;
    public static final long SYNC_TIME_DIFF = 200;
    private static final String TAG = "Track_TrackAnimationControl";
    public ArrayList<LenLatLong> mLensData = null;
    public ArrayList<LatLong> mTrackData = null;
    public ReTrackSimplify mReTrackSimplify = null;
    public float mMaxZoomLevel = DEFAULT_MAX_ZOOM;
    public float mOrgZoomLevel = 3.0f;
    protected float mRunZoomLevel = 0.0f;
    public double mRunScale = 1.0d;
    public int mPixelDistance = 10;
    protected a mMarkerControl = new a();
    protected b mDurationControl = new b();
    public int mTotalSpinDuration = 0;
    public double mDrawLineDurationPerPixel = 0.0d;
    public double mLenAdvanceDurationPerPixel = 0.0d;
    public Strength mStrength = Strength.HIGH;
    protected boolean mIsSupportArea = true;
    public double mDefaultDistance = 0.0d;
    protected int mPhotosNum = 0;
    protected int mEditMarkersNum = 0;

    public enum Strength {
        HIGH,
        MIDDLE,
        LOW
    }

    public abstract double getLenMoveDuration(double d);

    public abstract double getLineDrawDuration(double d);

    public float getRunTiltAngle() {
        return 45.0f;
    }

    public abstract double getSpinDuration(double d, double d2);

    protected abstract double toScale(double d);

    protected abstract double toZoom(double d);

    public abstract void update();

    public double getKmMarkerSpace() {
        this.mMarkerControl.j();
        return this.mMarkerControl.b();
    }

    public float getRunZoomLevel() {
        return this.mRunZoomLevel;
    }

    public float getNewZoomLevel(float f) {
        if (!this.mIsSupportArea) {
            return this.mRunZoomLevel;
        }
        double zoom = toZoom(toScale(this.mRunZoomLevel) * ((double) f));
        float f2 = this.mRunZoomLevel;
        double d = f2;
        if (zoom <= d) {
            return f2;
        }
        if (zoom - d > 1.5d) {
            zoom = f2 + 1.5f;
        }
        float f3 = this.mMaxZoomLevel;
        return zoom > ((double) f3) ? f3 : (float) zoom;
    }

    public TrackAnimationControl setMaxZoomLevel(float f) {
        this.mMaxZoomLevel = f;
        return this;
    }

    public TrackAnimationControl setOrgZoomLevel(float f) {
        this.mOrgZoomLevel = f;
        return this;
    }

    public TrackAnimationControl setAlgorithmStrength(Strength strength) {
        this.mStrength = strength;
        return this;
    }

    public TrackAnimationControl setIsSupportArea(boolean z) {
        this.mIsSupportArea = z;
        return this;
    }

    public TrackAnimationControl setPhotosNumber(int i) {
        this.mPhotosNum = i;
        return this;
    }

    public TrackAnimationControl setMarkersNumber(int i) {
        this.mEditMarkersNum = i;
        return this;
    }

    public long getDurationMs() {
        return this.mDurationControl.b();
    }

    public class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f10737c = 1000.0d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f10736b = 1.0d;
        private int d = 0;

        protected a() {
        }

        private double d(double d) {
            this.f10736b = 1.0d;
            while (d > 25000.0d) {
                d /= 10.0d;
                this.f10736b *= 10.0d;
            }
            return d;
        }

        private double c(double d) {
            LogUtil.a(TrackAnimationControl.TAG, "Go into obtainInterval");
            double d2 = d(a(d));
            double d3 = 5000.0d;
            if (d2 <= 5000.0d) {
                d3 = 1000.0d;
            } else if (d2 <= 10000.0d) {
                d3 = 2000.0d;
            }
            LogUtil.a(TrackAnimationControl.TAG, "Go out obtainInterval");
            return e(d3 * this.f10736b);
        }

        private double a(double d) {
            return UnitUtil.f() ? UnitUtil.e(d / 1000.0d, 3) * 1000.0d : d;
        }

        private double e(double d) {
            return UnitUtil.f() ? UnitUtil.c(d / 1000.0d, 3) * 1000.0d : d;
        }

        public void j() {
            if (TrackAnimationControl.this.mReTrackSimplify == null) {
                return;
            }
            this.f10737c = c(TrackAnimationControl.this.mReTrackSimplify.getValidTotalDistance());
            this.d = g() + h();
        }

        public double b() {
            return this.f10737c;
        }

        public int a() {
            return g();
        }

        public int c() {
            return this.d;
        }

        public int e() {
            return TrackAnimationControl.this.mPhotosNum;
        }

        public int d() {
            return TrackAnimationControl.this.mEditMarkersNum;
        }

        private int h() {
            return (int) (TrackAnimationControl.this.mReTrackSimplify.getValidTotalDistance() / this.f10737c);
        }

        private int g() {
            HashSet hashSet = new HashSet();
            if (((Integer) TrackAnimationControl.this.mReTrackSimplify.getMaxSpeed().first).intValue() != -1) {
                hashSet.add((Integer) TrackAnimationControl.this.mReTrackSimplify.getMaxSpeed().first);
            }
            if (((Integer) TrackAnimationControl.this.mReTrackSimplify.getMaxHeartRate().first).intValue() != -1) {
                hashSet.add((Integer) TrackAnimationControl.this.mReTrackSimplify.getMaxHeartRate().first);
            }
            if (((Integer) TrackAnimationControl.this.mReTrackSimplify.getMaxAltitude().first).intValue() != -1) {
                hashSet.add((Integer) TrackAnimationControl.this.mReTrackSimplify.getMaxAltitude().first);
            }
            return hashSet.size();
        }
    }

    public class b {
        private int e = 0;
        private int h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f10738a = 0;
        private int d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10739b = 0;

        private long a() {
            return 3300L;
        }

        private long c() {
            return 0L;
        }

        private long f() {
            return ProfileExtendConstants.TIME_OUT;
        }

        protected b() {
        }

        public void b(int i, int i2, int i3, int i4) {
            this.e = i;
            this.h = i2;
            this.d = i3;
            this.f10739b = i4;
            this.f10738a = g();
        }

        public long b() {
            return this.f10738a + 500;
        }

        private long i() {
            return (((long) this.h) * 1000) + (((long) this.f10739b) * 700);
        }

        private long j() {
            return ((long) this.d) * TrackAnimationControl.DISPLAY_PHOTO_DURATION;
        }

        private long h() {
            int i = this.e;
            if (i <= 0) {
                return 0L;
            }
            return (((long) (i - 1)) * 100) + 400;
        }

        private long e() {
            return (long) (((TrackAnimationControl.this.mDrawLineDurationPerPixel * (TrackAnimationControl.this.mReTrackSimplify.getTrackTotalDistance() / TrackAnimationControl.this.mRunScale)) * 101.0d) / 100.0d);
        }

        private long d() {
            return ((long) TrackAnimationControl.this.mReTrackSimplify.getAreaNumber()) * 3200;
        }

        private long g() {
            if (TrackAnimationControl.this.mReTrackSimplify == null) {
                return 0L;
            }
            long jA = a();
            long jI = i();
            long jH = h();
            long j = jA + jI + jH + j() + e() + c() + f() + 200;
            return TrackAnimationControl.this.mIsSupportArea ? j + d() : j;
        }
    }
}
