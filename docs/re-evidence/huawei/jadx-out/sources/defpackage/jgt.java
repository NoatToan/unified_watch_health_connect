package defpackage;

import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LenLatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.ReTrackSimplify;
import com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jgt extends TrackAnimationControl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f38592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f38593c;
    private c d;
    private e e;

    public jgt(ArrayList<LatLong> arrayList, ArrayList<LenLatLong> arrayList2, ReTrackSimplify reTrackSimplify) {
        this.f38592b = new d();
        this.d = new c();
        this.e = new e();
        this.f38593c = new a();
        this.mLensData = arrayList2;
        this.mTrackData = arrayList;
        this.mReTrackSimplify = reTrackSimplify;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public void update() {
        if (this.mLensData == null || this.mTrackData == null || this.mReTrackSimplify == null) {
            return;
        }
        this.mRunZoomLevel = this.f38592b.d().e();
        this.mMarkerControl.j();
        this.f38593c.e();
        this.d.b();
        this.e.a();
        this.mDurationControl.b(this.mMarkerControl.c(), this.mMarkerControl.a(), this.mMarkerControl.e(), this.mMarkerControl.d());
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double getSpinDuration(double d2, double d3) {
        return this.f38593c.b(d2, d3);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double getLineDrawDuration(double d2) {
        return this.f38592b.a(d2) * this.mDrawLineDurationPerPixel;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double getLenMoveDuration(double d2) {
        return (this.f38592b.a(d2) * this.mLenAdvanceDurationPerPixel) + 1.0d;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double toScale(double d2) {
        return this.f38592b.c(d2);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double toZoom(double d2) {
        return this.f38592b.d(d2);
    }

    class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f38597c;
        private double e;

        private c() {
            this.e = 1.0d;
            this.f38597c = 1.0d;
        }

        private void d() {
            if (jgt.this.mStrength == TrackAnimationControl.Strength.HIGH) {
                this.e = 3.8d;
                this.f38597c = 1.8d;
            } else {
                this.e = 4.2d;
                this.f38597c = 2.0d;
            }
        }

        private void e() {
            if (jgt.this.mRunScale < 1.0E-6d) {
                return;
            }
            double d = jgt.this.mStrength == TrackAnimationControl.Strength.HIGH ? 35000.0d : 30000.0d;
            if ((jgt.this.mReTrackSimplify.getTrackTotalDistance() / jgt.this.mRunScale) * jgt.this.mDrawLineDurationPerPixel > d) {
                jgt jgtVar = jgt.this;
                jgtVar.mDrawLineDurationPerPixel = d / (jgtVar.mReTrackSimplify.getTrackTotalDistance() / jgt.this.mRunScale);
            }
        }

        public void b() {
            d();
            double cycles = jgt.this.mReTrackSimplify.getCycles();
            if (cycles < 1.0d) {
                jgt.this.mDrawLineDurationPerPixel = this.e;
            } else {
                jgt jgtVar = jgt.this;
                double d = this.e;
                jgtVar.mDrawLineDurationPerPixel = d - ((cycles * (d - this.f38597c)) / 8.0d);
            }
            double d2 = jgt.this.mDrawLineDurationPerPixel;
            double d3 = this.f38597c;
            if (d2 < d3) {
                jgt.this.mDrawLineDurationPerPixel = d3;
            }
            e();
        }
    }

    class e {
        private e() {
        }

        public void a() {
            double dA = (jgt.this.mDrawLineDurationPerPixel * jgt.this.f38592b.a(jgt.this.mReTrackSimplify.getTrackTotalDistance())) - ((double) jgt.this.mTotalSpinDuration);
            if (dA < 1.0E-6d) {
                jgt.this.mLenAdvanceDurationPerPixel = 0.0d;
                return;
            }
            double dA2 = jgt.this.f38592b.a(jgt.this.mReTrackSimplify.getLensTotalDistance());
            if (Math.abs(dA2) > 1.0E-6d) {
                jgt.this.mLenAdvanceDurationPerPixel = dA / dA2;
            }
        }
    }

    class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<Integer, Integer> f38595c;

        private a() {
        }

        public double b(double d, double d2) {
            double dAbs = Math.abs(d - d2);
            if (dAbs >= 180.0d) {
                dAbs = 360.0d - dAbs;
            }
            double d3 = dAbs * 5.8d;
            if (d3 < 120.0d) {
                return 120.0d;
            }
            return d3;
        }

        public void e() {
            if (jgt.this.mLensData == null) {
                LogUtil.e("Track_GaoDeAnimationControl", "Lens Data is null");
                return;
            }
            b();
            jgt.this.mTotalSpinDuration = 0;
            this.f38595c = new HashMap();
            double angle = jgt.this.mLensData.get(0).getState() == -2 ? jgt.this.mLensData.get(0).getAngle() : 0.0d;
            for (int i = 1; i < jgt.this.mLensData.size(); i++) {
                if (jgt.this.mLensData.get(i).isTurnState()) {
                    double angle2 = jgt.this.mLensData.get(i).getAngle();
                    double dAbs = Math.abs(angle2 - angle);
                    if (dAbs >= 180.0d) {
                        dAbs = 360.0d - dAbs;
                    }
                    int i2 = (int) (dAbs * 5.8d);
                    if (i2 < 120) {
                        i2 = 120;
                    }
                    jgt.this.mTotalSpinDuration += i2;
                    this.f38595c.put(Integer.valueOf(i), Integer.valueOf(i2));
                    angle = angle2;
                }
            }
        }

        private void b() {
            for (LenLatLong lenLatLong : jgt.this.mLensData) {
                if (jgt.this.mStrength == TrackAnimationControl.Strength.HIGH) {
                    lenLatLong.toOriginalState();
                } else {
                    lenLatLong.forceStraight();
                }
            }
        }
    }

    class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f38599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f38600c;
        private float d;
        private double e;

        private d() {
            this.e = 0.0d;
            this.f38599b = 0.0d;
            this.f38600c = 0.0f;
            this.d = 2.5f;
        }

        private void c() {
            this.d = 2.5f;
        }

        private void a() {
            if (jgt.this.mTrackData == null || jgt.this.mTrackData.size() <= 1) {
                return;
            }
            this.f38599b = jgt.this.mReTrackSimplify.getTrackTotalDistance() / ((double) (jgt.this.mTrackData.size() - 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public double d(double d) {
            return Math.log(d / 60026.0d) / (-0.693d);
        }

        private void i() {
            float fD = (float) d(this.e);
            this.f38600c = fD;
            float f = fD < jgt.this.mOrgZoomLevel ? jgt.this.mOrgZoomLevel : this.f38600c;
            this.f38600c = f;
            this.f38600c = f > jgt.this.mMaxZoomLevel ? jgt.this.mMaxZoomLevel : this.f38600c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public double c(double d) {
            return Math.exp(d * (-0.693d)) * 60026.0d;
        }

        private void j() {
            double dC = c(this.f38600c);
            this.e = dC;
            if (dC < 1.0E-6d) {
                this.e = this.f38599b / ((double) jgt.this.mPixelDistance);
            }
            jgt.this.mRunScale = this.e;
            jgt jgtVar = jgt.this;
            jgtVar.mDefaultDistance = jgtVar.mRunScale * ((double) jer.d(2.5f));
        }

        private void h() {
            jgt.this.mPixelDistance = jer.d(this.d);
            double dC = this.f38599b / c(jgt.this.mOrgZoomLevel);
            if (jgt.this.mStrength == TrackAnimationControl.Strength.HIGH) {
                int i = ((int) ((dC * 120.0d) / 100.0d)) + 1;
                if (jgt.this.mPixelDistance < i) {
                    jgt.this.mPixelDistance = i;
                    return;
                }
                return;
            }
            jgt.this.mPixelDistance = ((int) ((dC * 103.0d) / 100.0d)) + 1;
        }

        private void b() {
            this.e = this.f38599b / ((double) jgt.this.mPixelDistance);
        }

        public d d() {
            a();
            c();
            h();
            b();
            i();
            j();
            return this;
        }

        public double a(double d) {
            double d2 = this.e;
            if (d2 >= 1.0E-6d) {
                return d / d2;
            }
            LogUtil.e("Track_GaoDeAnimationControl", "scale is zero");
            return 1.0d;
        }

        public float e() {
            return this.f38600c;
        }
    }
}
