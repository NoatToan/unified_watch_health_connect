package defpackage;

import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.fitness.device.manager.export.bean.Feature;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j14 extends pvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22321a;

    public static class a extends j14 {
        public a(int i, ReadableMap readableMap, svg svgVar) {
            super(i, readableMap, svgVar);
        }

        @Override // defpackage.j14
        public Double b(pvg pvgVar) {
            if (pvgVar instanceof yjh) {
                ((yjh) pvgVar).f();
            } else {
                ((i14) pvgVar).b();
            }
            return pvg.ZERO;
        }

        @Override // defpackage.pvg
        public /* bridge */ /* synthetic */ Object evaluate() {
            return super.evaluate();
        }
    }

    public static class b extends j14 {
        public b(int i, ReadableMap readableMap, svg svgVar) {
            super(i, readableMap, svgVar);
        }

        @Override // defpackage.j14
        public Double b(pvg pvgVar) {
            if (pvgVar instanceof yjh) {
                ((yjh) pvgVar).g();
            } else {
                ((i14) pvgVar).c();
            }
            return pvg.ZERO;
        }

        @Override // defpackage.pvg
        public /* bridge */ /* synthetic */ Object evaluate() {
            return super.evaluate();
        }
    }

    public static class c extends j14 {
        public c(int i, ReadableMap readableMap, svg svgVar) {
            super(i, readableMap, svgVar);
        }

        @Override // defpackage.j14
        public Double b(pvg pvgVar) {
            if (pvgVar instanceof yjh) {
                return Double.valueOf(((yjh) pvgVar).e() ? 1.0d : 0.0d);
            }
            return Double.valueOf(((i14) pvgVar).f20658a ? 1.0d : 0.0d);
        }

        @Override // defpackage.pvg
        public /* bridge */ /* synthetic */ Object evaluate() {
            return super.evaluate();
        }
    }

    public j14(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.f22321a = x4f.a(readableMap, Feature.CLOCK, "Reanimated: Argument passed to clock node is either of wrong type or is missing.");
    }

    public abstract Double b(pvg pvgVar);

    @Override // defpackage.pvg
    public Double evaluate() {
        return b(this.mNodesManager.o(this.f22321a, pvg.class));
    }
}
