package defpackage;

import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LenLatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.ReTrackSimplify;
import com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class jgs extends TrackAnimationControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f38583a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f38584c;
    private c d;
    private a e;

    public jgs(ArrayList<LatLong> arrayList, ArrayList<LenLatLong> arrayList2, ReTrackSimplify reTrackSimplify) {
        this.e = new a();
        this.f38583a = new b();
        this.d = new c();
        this.f38584c = new d();
        this.mTrackData = arrayList;
        this.mLensData = arrayList2;
        this.mReTrackSimplify = reTrackSimplify;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public void update() {
        if (this.mLensData == null || this.mTrackData == null || this.mReTrackSimplify == null) {
            return;
        }
        this.mRunZoomLevel = this.e.b().e();
        this.mMarkerControl.j();
        this.f38584c.a();
        this.f38583a.a();
        this.d.b();
        this.mDurationControl.b(this.mMarkerControl.c(), this.mMarkerControl.a(), this.mMarkerControl.e(), this.mMarkerControl.d());
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double getSpinDuration(double d2, double d3) {
        return this.f38584c.a(d2, d3);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double getLineDrawDuration(double d2) {
        return this.e.c(d2) * this.mDrawLineDurationPerPixel;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double getLenMoveDuration(double d2) {
        return (this.e.c(d2) * this.mLenAdvanceDurationPerPixel) + 1.0d;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double toScale(double d2) {
        return this.e.d(d2);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double toZoom(double d2) {
        return this.e.e(d2);
    }

    class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f38589b;
        private double e;

        private b() {
            this.f38589b = 1.0d;
            this.e = 1.0d;
        }

        private void c() {
            if (jgs.this.mStrength == TrackAnimationControl.Strength.HIGH || jgs.this.mStrength == TrackAnimationControl.Strength.MIDDLE) {
                this.f38589b = 3.8d;
                this.e = 1.8d;
            } else {
                this.f38589b = 4.2d;
                this.e = 2.0d;
            }
        }

        private void e() {
            if (jgs.this.mRunScale < 1.0E-6d) {
                return;
            }
            double d = (jgs.this.mStrength == TrackAnimationControl.Strength.HIGH || jgs.this.mStrength == TrackAnimationControl.Strength.MIDDLE) ? 35000.0d : 30000.0d;
            if ((jgs.this.mReTrackSimplify.getTrackTotalDistance() / jgs.this.mRunScale) * jgs.this.mDrawLineDurationPerPixel > d) {
                jgs jgsVar = jgs.this;
                jgsVar.mDrawLineDurationPerPixel = d / (jgsVar.mReTrackSimplify.getTrackTotalDistance() / jgs.this.mRunScale);
            }
        }

        public void a() {
            c();
            double cycles = jgs.this.mReTrackSimplify.getCycles();
            if (cycles < 1.0d) {
                jgs.this.mDrawLineDurationPerPixel = this.f38589b;
            } else {
                jgs jgsVar = jgs.this;
                double d = this.f38589b;
                jgsVar.mDrawLineDurationPerPixel = d - ((cycles * (d - this.e)) / 8.0d);
            }
            double d2 = jgs.this.mDrawLineDurationPerPixel;
            double d3 = this.e;
            if (d2 < d3) {
                jgs.this.mDrawLineDurationPerPixel = d3;
            }
            e();
        }
    }

    class c {
        private c() {
        }

        public void b() {
            double dC = (jgs.this.mDrawLineDurationPerPixel * jgs.this.e.c(jgs.this.mReTrackSimplify.getTrackTotalDistance())) - ((double) jgs.this.mTotalSpinDuration);
            if (dC < 1.0E-6d) {
                jgs.this.mLenAdvanceDurationPerPixel = 0.0d;
                return;
            }
            double dC2 = jgs.this.e.c(jgs.this.mReTrackSimplify.getLensTotalDistance());
            if (Math.abs(dC2) > 1.0E-6d) {
                jgs.this.mLenAdvanceDurationPerPixel = dC / dC2;
            }
        }
    }

    class d {
        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public double a(double d, double d2) {
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

        public void a() {
            if (jgs.this.mLensData == null) {
                LogUtil.e("Track_HmsAnimationControl", "Lens Data is null");
                return;
            }
            e();
            jgs.this.mTotalSpinDuration = 0;
            double angle = jgs.this.mLensData.get(0).getState() == -2 ? 360.0d - jgs.this.mLensData.get(0).getAngle() : 0.0d;
            for (int i = 1; i < jgs.this.mLensData.size(); i++) {
                if (jgs.this.mLensData.get(i).isTurnState()) {
                    double angle2 = 360.0d - jgs.this.mLensData.get(i).getAngle();
                    double dAbs = Math.abs(angle2 - angle);
                    if (dAbs >= 180.0d) {
                        dAbs = 360.0d - dAbs;
                    }
                    int i2 = (int) (dAbs * 5.8d);
                    if (i2 < 120) {
                        i2 = 120;
                    }
                    jgs.this.mTotalSpinDuration += i2;
                    angle = angle2;
                }
            }
        }

        private void e() {
            for (LenLatLong lenLatLong : jgs.this.mLensData) {
                if (jgs.this.mStrength == TrackAnimationControl.Strength.HIGH || jgs.this.mStrength == TrackAnimationControl.Strength.MIDDLE) {
                    lenLatLong.toOriginalState();
                } else {
                    lenLatLong.forceStraight();
                }
            }
        }
    }

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f38585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f38586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f38587c;
        private double e;

        private a() {
            this.f38587c = 0.0d;
            this.e = 0.0d;
            this.f38585a = 0.0f;
            this.f38586b = 2.5f;
        }

        private void a() {
            this.f38586b = 2.5f;
        }

        private void d() {
            if (jgs.this.mTrackData == null || jgs.this.mTrackData.size() <= 1) {
                return;
            }
            this.e = jgs.this.mReTrackSimplify.getTrackTotalDistance() / ((double) (jgs.this.mTrackData.size() - 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public double e(double d) {
            return Math.log(d / 49671.0d) / (-0.688d);
        }

        private void i() {
            float fE = (float) e(this.f38587c);
            this.f38585a = fE;
            float f = fE < jgs.this.mOrgZoomLevel ? jgs.this.mOrgZoomLevel : this.f38585a;
            this.f38585a = f;
            this.f38585a = f > jgs.this.mMaxZoomLevel ? jgs.this.mMaxZoomLevel : this.f38585a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public double d(double d) {
            return Math.exp(d * (-0.688d)) * 49671.0d;
        }

        private void f() {
            double d = d(this.f38585a);
            this.f38587c = d;
            if (d < 1.0E-6d) {
                this.f38587c = this.e / ((double) jgs.this.mPixelDistance);
            }
            jgs.this.mRunScale = this.f38587c;
        }

        private void j() {
            jgs.this.mPixelDistance = jer.d(this.f38586b);
            double d = this.e / d(jgs.this.mOrgZoomLevel);
            if (jgs.this.mStrength == TrackAnimationControl.Strength.HIGH || jgs.this.mStrength == TrackAnimationControl.Strength.MIDDLE) {
                int i = ((int) ((d * 120.0d) / 100.0d)) + 1;
                if (jgs.this.mPixelDistance < i) {
                    jgs.this.mPixelDistance = i;
                    return;
                }
                return;
            }
            jgs.this.mPixelDistance = ((int) ((d * 103.0d) / 100.0d)) + 1;
        }

        private void c() {
            this.f38587c = this.e / ((double) jgs.this.mPixelDistance);
        }

        public a b() {
            d();
            a();
            j();
            c();
            i();
            f();
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public double c(double d) {
            double d2 = this.f38587c;
            if (d2 >= 1.0E-6d) {
                return d / d2;
            }
            LogUtil.e("Track_HmsAnimationControl", "scale is zero");
            return 1.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float e() {
            return this.f38585a;
        }
    }
}
