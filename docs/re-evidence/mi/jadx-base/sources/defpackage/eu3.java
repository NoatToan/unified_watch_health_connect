package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.entrys.MultiBarEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.util.ChartUtil;
import com.xiaomi.fitness.chart.util.RectFWrapper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class eu3 {
    public static Path a(PointF pointF, PointF pointF2, float f) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        path.lineTo(pointF2.x, pointF2.y);
        path.lineTo(pointF2.x, f);
        path.lineTo(pointF.x, f);
        path.close();
        return path;
    }

    public static Path b(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        path.lineTo(pointF2.x, pointF2.y);
        path.lineTo(pointF3.x, pointF3.y);
        path.lineTo(pointF4.x, pointF4.y);
        path.close();
        return path;
    }

    public static RectFWrapper c(float f, float f2, float f3, float f4, float f5) {
        RectFWrapper rectFWrapper = new RectFWrapper();
        float f6 = f2 - f4;
        rectFWrapper.set(f, f6, f3, f2);
        rectFWrapper.set(f, Math.max(f6, f5), f3, f2);
        return rectFWrapper;
    }

    public static <T extends RecyclerBarEntry, V extends sf2> RectF d(View view, RecyclerView recyclerView, V v, a52 a52Var, T t) {
        RectF rectF = new RectF();
        float height = (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - a52Var.f625a;
        float paddingTop = recyclerView.getPaddingTop() + a52Var.f626b;
        float fR = jak.r(recyclerView, v, a52Var);
        float width = view.getWidth();
        float f = a52Var.e0 * width;
        float f2 = width - f;
        float f3 = a52Var.f0;
        if (f3 > 0.0f && f2 > f3) {
            f = width - f3;
            f2 = f3;
        }
        float left = view.getLeft() + (f / 2.0f);
        float f4 = f2 + left;
        float axisMaximum = v.getAxisMaximum();
        float axisMinimum = v.getAxisMinimum();
        float y = t.getY();
        if (axisMinimum >= 0.0f) {
            rectF.set(left, Math.max(height - ((y - axisMinimum) * fR), paddingTop), f4, height);
        } else {
            float f5 = axisMaximum * fR;
            float fAbs = Math.abs(axisMaximum) * fR;
            float f6 = height - fAbs;
            if (y >= 0.0f) {
                rectF.set(left, Math.max(f6 - ((y / axisMaximum) * f5), paddingTop), f4, f6);
            } else {
                rectF.set(left, f6, f4, Math.min(((y / axisMinimum) * fAbs) + f6, height));
            }
        }
        return rectF;
    }

    public static <T extends RecyclerBarEntry, V extends sf2> RectF e(View view, RecyclerView recyclerView, V v, a52 a52Var, T t, boolean z) {
        RectF rectF = new RectF();
        float height = (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - a52Var.f625a;
        float paddingTop = recyclerView.getPaddingTop() + a52Var.f626b;
        float fR = jak.r(recyclerView, v, a52Var);
        float width = view.getWidth();
        float f = a52Var.e0 * width;
        float f2 = width - f;
        float f3 = a52Var.f0;
        if (f3 > 0.0f && f2 > f3) {
            f = width - f3;
            f2 = f3;
        }
        float left = view.getLeft() + (f / 2.0f);
        float f4 = f2 + left;
        float axisMaximum = v.getAxisMaximum();
        float axisMinimum = v.getAxisMinimum();
        float y = t.getY();
        if (axisMinimum >= 0.0f || !z) {
            rectF.set(left, Math.max(height - ((y - axisMinimum) * fR), paddingTop), f4, height);
        } else {
            float f5 = axisMaximum * fR;
            float fAbs = Math.abs(axisMaximum) * fR;
            float f6 = height - fAbs;
            if (y >= 0.0f) {
                rectF.set(left, Math.max(f6 - ((y / axisMaximum) * f5), paddingTop), f4, f6);
            } else {
                rectF.set(left, f6, f4, Math.min(((y / axisMinimum) * fAbs) + f6, height));
            }
        }
        return rectF;
    }

    public static <T extends RecyclerBarEntry, V extends sf2> RectF f(View view, RecyclerView recyclerView, V v, a52 a52Var, T t) {
        RectF rectF = new RectF();
        float height = (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - a52Var.f625a;
        float paddingTop = (height - recyclerView.getPaddingTop()) - a52Var.f626b;
        float paddingTop2 = recyclerView.getPaddingTop() + a52Var.f626b;
        float width = view.getWidth();
        float f = a52Var.e0 * width;
        float left = view.getLeft() + (f / 2.0f);
        float f2 = (width - f) + left;
        float axisMaximum = v.getAxisMaximum() - v.getAxisMinimum();
        float y = ((t.getY() - v.getAxisMinimum()) / axisMaximum) * paddingTop;
        if (a52Var.M && t.getY() > 0.0f) {
            y = (((v.getAxisMaximum() - t.getY()) - v.getAxisMinimum()) / axisMaximum) * paddingTop;
        }
        rectF.set(left, Math.max(height - y, paddingTop2), f2, height);
        return rectF;
    }

    public static PointF g(PointF pointF, PointF pointF2, float f) {
        float fAbs = ((Math.abs(pointF.x - f) * 1.0f) / Math.abs(pointF.x - pointF2.x)) * Math.abs(pointF.y - pointF2.y);
        float f2 = pointF2.y;
        float f3 = pointF.y;
        return new PointF(f, f2 < f3 ? f3 - fAbs : f3 + fAbs);
    }

    public static <T extends sf2> List<RectFWrapper> h(View view, RecyclerView recyclerView, T t, a52 a52Var, List<MultiBarEntry.a> list) {
        ArrayList arrayList = new ArrayList();
        float height = (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - a52Var.f625a;
        float paddingTop = (height - recyclerView.getPaddingTop()) - a52Var.f626b;
        float width = view.getWidth();
        float f = a52Var.e0 * width;
        float f2 = width - f;
        float f3 = a52Var.f0;
        if (f3 > 0.0f && f2 > f3) {
            f = width - f3;
            f2 = f3;
        }
        float left = view.getLeft() + (f / 2.0f);
        float f4 = f2 + left;
        float paddingTop2 = recyclerView.getPaddingTop();
        if (!ArrayUtils.isEmpty(list)) {
            for (MultiBarEntry.a aVar : list) {
                RectFWrapper rectFWrapperC = c(left, height, f4, (aVar.f11757b / t.getAxisMaximum()) * paddingTop, paddingTop2);
                rectFWrapperC.f11775a = aVar.c;
                rectFWrapperC.f11776b = aVar.f11756a;
                arrayList.add(rectFWrapperC);
            }
        }
        return arrayList;
    }

    public static <T extends sf2> List<RectFWrapper> i(View view, RecyclerView recyclerView, T t, a52 a52Var, List<npm> list) {
        ArrayList arrayList = new ArrayList();
        float height = (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - a52Var.f625a;
        float paddingTop = (height - recyclerView.getPaddingTop()) - a52Var.f626b;
        float width = view.getWidth();
        float f = a52Var.e0 * width;
        float f2 = width - f;
        float f3 = a52Var.f0;
        if (f3 > 0.0f && f2 > f3) {
            f = width - f3;
            f2 = f3;
        }
        float left = view.getLeft() + (f / 2.0f);
        float f4 = f2 + left;
        float paddingTop2 = recyclerView.getPaddingTop();
        for (int i = 0; i < list.size(); i++) {
            npm npmVar = list.get(i);
            RectFWrapper rectFWrapperC = c(left, height, f4, (npmVar.f28233a / t.getAxisMaximum()) * paddingTop, paddingTop2);
            rectFWrapperC.f11775a = npmVar.h;
            rectFWrapperC.f11776b = npm.d(recyclerView.getContext(), npmVar.c);
            arrayList.add(0, rectFWrapperC);
            height = ((RectF) rectFWrapperC).top;
        }
        return arrayList;
    }

    public static <T extends RecyclerBarEntry> str j(RecyclerView recyclerView, int i) {
        float theMaxNumber;
        float theMinNumber;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        List<T> entries = ((j22) recyclerView.getAdapter()).getEntries();
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        if (iFindLastCompletelyVisibleItemPosition == -1) {
            iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        }
        if (iFindFirstCompletelyVisibleItemPosition == -1) {
            iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        }
        List<T> arrayList = new ArrayList<>();
        if (iFindFirstCompletelyVisibleItemPosition != -1 && iFindLastCompletelyVisibleItemPosition != -1 && iFindLastCompletelyVisibleItemPosition < entries.size()) {
            arrayList = entries.subList(iFindFirstCompletelyVisibleItemPosition, iFindLastCompletelyVisibleItemPosition + 1);
        }
        if (arrayList.size() > 0) {
            theMaxNumber = ChartUtil.getTheMaxNumber(arrayList);
            theMinNumber = ChartUtil.getTheMinNumber(arrayList);
        } else {
            theMaxNumber = 0.0f;
            theMinNumber = 0.0f;
        }
        return new str(theMaxNumber, theMinNumber, arrayList);
    }

    public static <T extends RecyclerBarEntry> float k(float f, RecyclerView recyclerView, sf2 sf2Var, a52 a52Var) {
        float height = (recyclerView.getHeight() - a52Var.f625a) - recyclerView.getPaddingBottom();
        return height - (((f - sf2Var.getAxisMinimum()) * (height - (a52Var.f626b + recyclerView.getPaddingTop()))) / (sf2Var.getAxisMaximum() - sf2Var.getAxisMinimum()));
    }
}
