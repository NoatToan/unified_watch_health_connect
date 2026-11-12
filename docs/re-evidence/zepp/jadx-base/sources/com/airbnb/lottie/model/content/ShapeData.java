package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.MiscUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeData {
    private final List<CubicCurveData> a;
    private PointF b;
    private boolean c;

    public ShapeData(PointF pointF, boolean z, List<CubicCurveData> list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    private void a(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public List<CubicCurveData> getCurves() {
        return this.a;
    }

    public PointF getInitialPoint() {
        return this.b;
    }

    public void interpolateBetween(ShapeData shapeData, ShapeData shapeData2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.c = shapeData.isClosed() || shapeData2.isClosed();
        if (shapeData.getCurves().size() != shapeData2.getCurves().size()) {
            Logger.warning("Curves must have the same number of control points. Shape 1: " + shapeData.getCurves().size() + "\tShape 2: " + shapeData2.getCurves().size());
        }
        int iMin = Math.min(shapeData.getCurves().size(), shapeData2.getCurves().size());
        if (this.a.size() < iMin) {
            for (int size = this.a.size(); size < iMin; size++) {
                this.a.add(new CubicCurveData());
            }
        } else if (this.a.size() > iMin) {
            for (int size2 = this.a.size() - 1; size2 >= iMin; size2--) {
                List<CubicCurveData> list = this.a;
                list.remove(list.size() - 1);
            }
        }
        PointF initialPoint = shapeData.getInitialPoint();
        PointF initialPoint2 = shapeData2.getInitialPoint();
        a(MiscUtils.lerp(initialPoint.x, initialPoint2.x, f), MiscUtils.lerp(initialPoint.y, initialPoint2.y, f));
        for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
            CubicCurveData cubicCurveData = shapeData.getCurves().get(size3);
            CubicCurveData cubicCurveData2 = shapeData2.getCurves().get(size3);
            PointF controlPoint1 = cubicCurveData.getControlPoint1();
            PointF controlPoint2 = cubicCurveData.getControlPoint2();
            PointF vertex = cubicCurveData.getVertex();
            PointF controlPoint3 = cubicCurveData2.getControlPoint1();
            PointF controlPoint4 = cubicCurveData2.getControlPoint2();
            PointF vertex2 = cubicCurveData2.getVertex();
            this.a.get(size3).setControlPoint1(MiscUtils.lerp(controlPoint1.x, controlPoint3.x, f), MiscUtils.lerp(controlPoint1.y, controlPoint3.y, f));
            this.a.get(size3).setControlPoint2(MiscUtils.lerp(controlPoint2.x, controlPoint4.x, f), MiscUtils.lerp(controlPoint2.y, controlPoint4.y, f));
            this.a.get(size3).setVertex(MiscUtils.lerp(vertex.x, vertex2.x, f), MiscUtils.lerp(vertex.y, vertex2.y, f));
        }
    }

    public boolean isClosed() {
        return this.c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.c + '}';
    }

    public ShapeData() {
        this.a = new ArrayList();
    }
}
