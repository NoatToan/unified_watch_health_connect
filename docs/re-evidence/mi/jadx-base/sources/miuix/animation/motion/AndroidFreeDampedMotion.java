package miuix.animation.motion;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidFreeDampedMotion extends FreeDampedMotion implements AndroidMotion {
    private double finishTime;
    private final double g;
    private final double p;
    private double threshold;

    public AndroidFreeDampedMotion(double d, double d2) {
        super(d, d2);
        this.p = d;
        this.g = d2;
    }

    private double solveFinishTime() {
        double dFinishTime = super.finishTime();
        if (dFinishTime == 0.0d) {
            return dFinishTime;
        }
        double d = this.threshold;
        return d == 0.0d ? dFinishTime : (-Math.log(d)) / this.p;
    }

    @Override // miuix.animation.motion.FreeDampedMotion, miuix.animation.motion.Motion
    public double finishTime() {
        if (Double.isNaN(this.finishTime)) {
            this.finishTime = solveFinishTime();
        }
        return this.finishTime;
    }

    @Override // miuix.animation.motion.FreeDampedMotion, miuix.animation.motion.BaseMotion
    public void onInitialVChanged() {
        super.onInitialVChanged();
        this.finishTime = Double.NaN;
    }

    @Override // miuix.animation.motion.FreeDampedMotion, miuix.animation.motion.BaseMotion
    public void onInitialXChanged() {
        super.onInitialXChanged();
        this.finishTime = Double.NaN;
    }

    @Override // miuix.animation.motion.AndroidMotion
    public void setThreshold(double d) {
        this.threshold = d;
        this.finishTime = Double.NaN;
    }

    @Override // miuix.animation.motion.FreeDampedMotion, miuix.animation.motion.Motion
    public double stopPosition() {
        return this.g == 0.0d ? getInitialX() + (getInitialV() / this.p) : solve().apply(finishTime());
    }
}
