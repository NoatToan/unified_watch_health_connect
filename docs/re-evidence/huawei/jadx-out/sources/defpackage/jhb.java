package defpackage;

import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LenLatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.ReTrackSimplify;
import com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class jhb extends TrackAnimationControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f38603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f38604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f38605c;
    private d d;

    public jhb(ArrayList<LatLong> arrayList, ArrayList<LenLatLong> arrayList2, ReTrackSimplify reTrackSimplify) {
        this.f38604b = new a();
        this.f38605c = new e();
        this.d = new d();
        this.f38603a = new b();
        this.mTrackData = arrayList;
        this.mLensData = arrayList2;
        this.mReTrackSimplify = reTrackSimplify;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public void update() {
        if (this.mLensData == null || this.mTrackData == null || this.mReTrackSimplify == null) {
            LogUtil.a("Track_HmsAnimationControl", "HmsAnimationControl update null data return");
            return;
        }
        this.mRunZoomLevel = this.f38604b.a().d();
        this.mMarkerControl.j();
        this.f38603a.b();
        this.f38605c.d();
        this.d.c();
        this.mDurationControl.b(this.mMarkerControl.c(), this.mMarkerControl.a(), this.mMarkerControl.e(), this.mMarkerControl.d());
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double getSpinDuration(double d2, double d3) {
        return this.f38603a.c(d2, d3);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double getLineDrawDuration(double d2) {
        return this.f38604b.a(d2) * this.mDrawLineDurationPerPixel;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double getLenMoveDuration(double d2) {
        return (this.f38604b.a(d2) * this.mLenAdvanceDurationPerPixel) + 1.0d;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double toScale(double d2) {
        return this.f38604b.c(d2);
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl
    public double toZoom(double d2) {
        return this.f38604b.b(d2);
    }

    class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f38611c;
        private double e;

        private e() {
            this.e = 1.0d;
            this.f38611c = 1.0d;
        }

        private void a() {
            if (jhb.this.mStrength == TrackAnimationControl.Strength.HIGH) {
                this.e = 3.8d;
                this.f38611c = 1.8d;
            } else {
                this.e = 4.2d;
                this.f38611c = 2.0d;
            }
        }

        private void b() {
            if (jhb.this.mRunScale < 1.0E-6d) {
                return;
            }
            double d = jhb.this.mStrength == TrackAnimationControl.Strength.HIGH ? 35000.0d : 30000.0d;
            if ((jhb.this.mReTrackSimplify.getTrackTotalDistance() / jhb.this.mRunScale) * jhb.this.mDrawLineDurationPerPixel > d) {
                jhb jhbVar = jhb.this;
                jhbVar.mDrawLineDurationPerPixel = d / (jhbVar.mReTrackSimplify.getTrackTotalDistance() / jhb.this.mRunScale);
            }
        }

        public void d() {
            a();
            double cycles = jhb.this.mReTrackSimplify.getCycles();
            if (cycles < 1.0d) {
                jhb.this.mDrawLineDurationPerPixel = this.e;
            } else {
                jhb jhbVar = jhb.this;
                double d = this.e;
                jhbVar.mDrawLineDurationPerPixel = d - ((cycles * (d - this.f38611c)) / 8.0d);
            }
            double d2 = jhb.this.mDrawLineDurationPerPixel;
            double d3 = this.f38611c;
            if (d2 < d3) {
                jhb.this.mDrawLineDurationPerPixel = d3;
            }
            b();
        }
    }

    class d {
        private d() {
        }

        public void c() {
            double dA = (jhb.this.mDrawLineDurationPerPixel * jhb.this.f38604b.a(jhb.this.mReTrackSimplify.getTrackTotalDistance())) - ((double) jhb.this.mTotalSpinDuration);
            if (dA < 1.0E-6d) {
                jhb.this.mLenAdvanceDurationPerPixel = 0.0d;
                return;
            }
            double dA2 = jhb.this.f38604b.a(jhb.this.mReTrackSimplify.getLensTotalDistance());
            if (Math.abs(dA2) > 1.0E-6d) {
                jhb.this.mLenAdvanceDurationPerPixel = dA / dA2;
            }
        }
    }

    class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public double c(double d, double d2) {
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

        public void b() {
            if (njy.e(jhb.this.mLensData) || jhb.this.mLensData.get(0) == null) {
                LogUtil.e("Track_HmsAnimationControl", "Lens Data is null");
                return;
            }
            a();
            jhb.this.mTotalSpinDuration = 0;
            double angle = jhb.this.mLensData.get(0).getState() == -2 ? 360.0d - jhb.this.mLensData.get(0).getAngle() : 0.0d;
            for (int i = 1; i < jhb.this.mLensData.size(); i++) {
                if (jhb.this.mLensData.get(i) != null && jhb.this.mLensData.get(i).isTurnState()) {
                    double angle2 = 360.0d - jhb.this.mLensData.get(i).getAngle();
                    double dAbs = Math.abs(angle2 - angle);
                    if (dAbs >= 180.0d) {
                        dAbs = 360.0d - dAbs;
                    }
                    int i2 = (int) (dAbs * 5.8d);
                    if (i2 < 120) {
                        i2 = 120;
                    }
                    jhb.this.mTotalSpinDuration += i2;
                    angle = angle2;
                }
            }
        }

        private void a() {
            for (LenLatLong lenLatLong : jhb.this.mLensData) {
                if (jhb.this.mStrength == TrackAnimationControl.Strength.HIGH) {
                    lenLatLong.toOriginalState();
                } else {
                    lenLatLong.forceStraight();
                }
            }
        }
    }

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f38606a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f38608c;
        private float d;
        private double e;

        private a() {
            this.f38606a = 0.0d;
            this.e = 0.0d;
            this.d = 0.0f;
            this.f38608c = 2.5f;
        }

        private void e() {
            this.f38608c = 2.5f;
        }

        private void b() {
            if (jhb.this.mTrackData == null || jhb.this.mTrackData.size() <= 1) {
                return;
            }
            this.e = jhb.this.mReTrackSimplify.getTrackTotalDistance() / ((double) (jhb.this.mTrackData.size() - 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public double b(double d) {
            return Math.log(d / 49671.0d) / (-0.688d);
        }

        private void f() {
            float fB = (float) b(this.f38606a);
            this.d = fB;
            float f = fB < jhb.this.mOrgZoomLevel ? jhb.this.mOrgZoomLevel : this.d;
            this.d = f;
            this.d = f > jhb.this.mMaxZoomLevel ? jhb.this.mMaxZoomLevel : this.d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public double c(double d) {
            return Math.exp(d * (-0.688d)) * 49671.0d;
        }

        private void i() {
            double dC = c(this.d);
            this.f38606a = dC;
            if (dC < 1.0E-6d) {
                this.f38606a = this.e / ((double) jhb.this.mPixelDistance);
            }
            jhb.this.mRunScale = this.f38606a;
            jhb jhbVar = jhb.this;
            jhbVar.mDefaultDistance = jhbVar.mRunScale * ((double) jer.d(2.5f));
        }

        private void j() {
            jhb.this.mPixelDistance = jer.d(this.f38608c);
            double dC = this.e / c(jhb.this.mOrgZoomLevel);
            if (jhb.this.mStrength == TrackAnimationControl.Strength.HIGH) {
                int i = ((int) ((dC * 120.0d) / 100.0d)) + 1;
                if (jhb.this.mPixelDistance < i) {
                    jhb.this.mPixelDistance = i;
                    return;
                }
                return;
            }
            jhb.this.mPixelDistance = ((int) ((dC * 103.0d) / 100.0d)) + 1;
        }

        private void c() {
            this.f38606a = this.e / ((double) jhb.this.mPixelDistance);
        }

        public a a() {
            b();
            e();
            j();
            c();
            f();
            i();
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public double a(double d) {
            double d2 = this.f38606a;
            if (d2 >= 1.0E-6d) {
                return d / d2;
            }
            LogUtil.e("Track_HmsAnimationControl", "scale is zero");
            return 1.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float d() {
            return this.d;
        }
    }
}
