package miuix.animation.motion;

import java.util.Random;
import miuix.animation.function.Differentiable;
import miuix.animation.function.Function;
import miuix.animation.function.Polynomial;

/* JADX INFO: loaded from: classes3.dex */
public class PerlinMotion extends BaseMotion {
    public static final Differentiable INTERPOLATOR = new Polynomial(3, -2.0d, 3.0d, 0.0d, 0.0d);
    public static final Differentiable INTERPOLATOR2 = new Polynomial(5, 6.0d, -15.0d, 10.0d, 0.0d, 0.0d, 0.0d);
    private final double duration;
    private Differentiable function;
    private final Differentiable interpolator;
    private final double range;

    public class PerlinFunction implements Differentiable {
        private int currentStep;
        private Function derivative;
        private double nextFrame;
        private double prevFrame;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Random f26281r;
        private final long seed;

        public PerlinFunction() {
            Random random = new Random();
            this.f26281r = random;
            this.seed = random.nextLong();
            this.nextFrame = getFrame(1);
        }

        private double getFrame(int i) {
            if (i == 0) {
                return 0.0d;
            }
            this.f26281r.setSeed(this.seed + ((long) i));
            this.f26281r.nextInt();
            return (((this.f26281r.nextDouble() * PerlinMotion.this.range) * 2.0d) - PerlinMotion.this.range) + PerlinMotion.this.getInitialX();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ double lambda$derivative$0(double d) {
            double d2 = d / PerlinMotion.this.duration;
            int iFloor = (int) Math.floor(d2);
            walk(iFloor);
            return PerlinMotion.this.interpolator.derivative().apply(d2 - ((double) iFloor)) * (this.nextFrame - this.prevFrame);
        }

        private void walk(int i) {
            while (true) {
                int i2 = this.currentStep;
                if (i2 <= i) {
                    break;
                }
                int i3 = i2 - 1;
                this.currentStep = i3;
                this.nextFrame = this.prevFrame;
                this.prevFrame = getFrame(i3);
            }
            while (true) {
                int i4 = this.currentStep;
                if (i4 >= i) {
                    return;
                }
                this.currentStep = i4 + 1;
                this.prevFrame = this.nextFrame;
                this.nextFrame = getFrame(i4 + 2);
            }
        }

        @Override // miuix.animation.function.Differentiable, miuix.animation.function.Function
        public double apply(double d) {
            double d2 = d / PerlinMotion.this.duration;
            int iFloor = (int) Math.floor(d2);
            walk(iFloor);
            double dApply = PerlinMotion.this.interpolator.apply(d2 - ((double) iFloor));
            double d3 = this.nextFrame;
            double d4 = this.prevFrame;
            return (dApply * (d3 - d4)) + d4;
        }

        @Override // miuix.animation.function.Differentiable
        public Function derivative() {
            if (this.derivative == null) {
                this.derivative = new Function() { // from class: miuix.animation.motion.b
                    @Override // miuix.animation.function.Function
                    public final double apply(double d) {
                        return this.f26284a.lambda$derivative$0(d);
                    }
                };
            }
            return this.derivative;
        }
    }

    public PerlinMotion(double d, double d2, Differentiable differentiable) {
        this.duration = d;
        this.range = d2;
        this.interpolator = differentiable;
    }

    private Differentiable solveInternal() {
        return new PerlinFunction();
    }

    @Override // miuix.animation.motion.BaseMotion
    public void onInitialXChanged() {
        super.onInitialXChanged();
        this.function = null;
    }

    @Override // miuix.animation.motion.Motion
    public Differentiable solve() {
        if (this.function == null) {
            this.function = solveInternal();
        }
        return this.function;
    }
}
