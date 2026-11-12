package defpackage;

import android.graphics.PointF;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes6.dex */
public class ki2 extends pvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f23866b;

    public ki2(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.f23865a = x4f.a(readableMap, "input", "Reanimated: Argument passed to bezier node is either of wrong type or is missing.");
        this.f23866b = new a((float) readableMap.getDouble("mX1"), (float) readableMap.getDouble("mY1"), (float) readableMap.getDouble("mX2"), (float) readableMap.getDouble("mY2"));
    }

    @Override // defpackage.pvg
    public Double evaluate() {
        return Double.valueOf(this.f23866b.c(((Double) this.mNodesManager.p(this.f23865a)).floatValue()));
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PointF f23867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PointF f23868b;
        public PointF c;
        public PointF d;
        public PointF e;

        public a(PointF pointF, PointF pointF2) {
            this.c = new PointF();
            this.d = new PointF();
            this.e = new PointF();
            this.f23867a = pointF;
            this.f23868b = pointF2;
        }

        public final float a(float f) {
            PointF pointF = this.e;
            PointF pointF2 = this.f23867a;
            float f2 = pointF2.x * 3.0f;
            pointF.x = f2;
            PointF pointF3 = this.d;
            float f3 = ((this.f23868b.x - pointF2.x) * 3.0f) - f2;
            pointF3.x = f3;
            PointF pointF4 = this.c;
            float f4 = (1.0f - pointF.x) - f3;
            pointF4.x = f4;
            return f * (pointF.x + ((pointF3.x + (f4 * f)) * f));
        }

        public float b(float f) {
            PointF pointF = this.e;
            PointF pointF2 = this.f23867a;
            float f2 = pointF2.y * 3.0f;
            pointF.y = f2;
            PointF pointF3 = this.d;
            float f3 = ((this.f23868b.y - pointF2.y) * 3.0f) - f2;
            pointF3.y = f3;
            PointF pointF4 = this.c;
            float f4 = (1.0f - pointF.y) - f3;
            pointF4.y = f4;
            return f * (pointF.y + ((pointF3.y + (f4 * f)) * f));
        }

        public float c(float f) {
            return b(e(f));
        }

        public final float d(float f) {
            return this.e.x + (f * ((this.d.x * 2.0f) + (this.c.x * 3.0f * f)));
        }

        public float e(float f) {
            float fD = f;
            for (int i = 1; i < 14; i++) {
                float fA = a(fD) - f;
                if (Math.abs(fA) < 0.001d) {
                    break;
                }
                fD -= fA / d(fD);
            }
            return fD;
        }

        public a(float f, float f2, float f3, float f4) {
            this(new PointF(f, f2), new PointF(f3, f4));
        }
    }
}
