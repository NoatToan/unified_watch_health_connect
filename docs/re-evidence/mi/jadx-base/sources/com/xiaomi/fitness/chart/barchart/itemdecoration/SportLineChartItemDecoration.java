package com.xiaomi.fitness.chart.barchart.itemdecoration;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.chart.entrys.model.SportRecordYModel;
import com.xiaomi.fitness.chart.render.BarBoardRender;
import com.xiaomi.fitness.chart.render.XAxisRender;
import com.xiaomi.fitness.chart.render.YAxisRender;
import defpackage.aun;
import defpackage.gv5;
import defpackage.onq;
import defpackage.rtr;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.yfe;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 82\u00020\u0001:\u00018B\u001f\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\nJ/\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/chart/barchart/itemdecoration/SportLineChartItemDecoration;", "Lyfe;", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "Lonq;", "highLightValueFormatter", "setHighLightValueFormatter", "(Lonq;)V", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "keyList", "setShowRecordKeyList", "(Ljava/util/List;)V", "", "sizePercent", "setMaxDrawSize", "(F)V", "", "Lcom/xiaomi/fitness/chart/entrys/model/SportRecordYModel;", "mValueList", "setYAxisValueList", "(Ljava/util/Map;)V", "onDraw", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "mOrientation", "I", "Laun;", "mLineChartRender", "Laun;", "mHighLightValueFormatter", "Lonq;", "mYAxisValueList", "Ljava/util/Map;", "mShowYAxisKeyList", "Ljava/util/List;", "Lrtr;", "yAxis", "Lvqr;", "xAxis", "Lvfe;", "barChartAttrs", "<init>", "(Lrtr;Lvqr;Lvfe;)V", "Companion", "chart_release"}, k = 1, mv = {2, 0, 0})
public final class SportLineChartItemDecoration extends yfe {
    public static final int HORIZONTAL_LIST = 0;
    public static final int VERTICAL_LIST = 1;

    @NotNull
    private onq mHighLightValueFormatter;

    @NotNull
    private final aun mLineChartRender;
    private final int mOrientation;

    @NotNull
    private List<? extends SportRecordKey> mShowYAxisKeyList;

    @NotNull
    private Map<SportRecordKey, SportRecordYModel> mYAxisValueList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportLineChartItemDecoration(@NotNull rtr yAxis, @NotNull vqr xAxis, @NotNull vfe mBarChartAttrs) {
        super(yAxis, xAxis, mBarChartAttrs);
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        Intrinsics.checkNotNullParameter(mBarChartAttrs, "barChartAttrs");
        this.mYAxisValueList = new LinkedHashMap();
        this.mShowYAxisKeyList = new ArrayList();
        this.mOrientation = mBarChartAttrs.i;
        this.mYAxis = yAxis;
        this.mXAxis = xAxis;
        this.mBarChartAttrs = mBarChartAttrs;
        Intrinsics.checkNotNullExpressionValue(mBarChartAttrs, "mBarChartAttrs");
        this.yAxisRenderer = new YAxisRender(mBarChartAttrs);
        T mBarChartAttrs2 = this.mBarChartAttrs;
        Intrinsics.checkNotNullExpressionValue(mBarChartAttrs2, "mBarChartAttrs");
        this.xAxisRenderer = new XAxisRender(mBarChartAttrs2);
        T mBarChartAttrs3 = this.mBarChartAttrs;
        Intrinsics.checkNotNullExpressionValue(mBarChartAttrs3, "mBarChartAttrs");
        this.mBarBoardRender = new BarBoardRender(mBarChartAttrs3);
        gv5 gv5Var = new gv5(0);
        this.mHighLightValueFormatter = gv5Var;
        this.mLineChartRender = new aun((vfe) this.mBarChartAttrs, gv5Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        outRect.set(0, 0, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    @Override // defpackage.yfe, androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(canvas, parent, state);
        if (this.mOrientation == 0) {
            this.mBarBoardRender.drawBarBorder(canvas, parent);
            YAxisRender yAxisRender = this.yAxisRenderer;
            Y mYAxis = this.mYAxis;
            Intrinsics.checkNotNullExpressionValue(mYAxis, "mYAxis");
            yAxisRender.drawHorizontalLine(canvas, parent, mYAxis);
            this.yAxisRenderer.drawSportDetailYLabel(canvas, parent, this.mYAxisValueList, this.mShowYAxisKeyList);
            XAxisRender xAxisRender = this.xAxisRenderer;
            vqr mXAxis = this.mXAxis;
            Intrinsics.checkNotNullExpressionValue(mXAxis, "mXAxis");
            xAxisRender.drawXAxis(canvas, parent, mXAxis);
            this.mLineChartRender.c(canvas, parent, (rtr) this.mYAxis);
            this.mLineChartRender.e(canvas, parent, (rtr) this.mYAxis);
            this.mLineChartRender.d(canvas, parent, (rtr) this.mYAxis);
            this.mLineChartRender.f(canvas, parent, (rtr) this.mYAxis);
        }
    }

    @Override // defpackage.yfe
    public void setHighLightValueFormatter(@Nullable onq highLightValueFormatter) {
        if (highLightValueFormatter != null) {
            this.mHighLightValueFormatter = highLightValueFormatter;
            this.mLineChartRender.setHighLightValueFormatter(highLightValueFormatter);
        }
    }

    public final void setMaxDrawSize(float sizePercent) {
        this.mLineChartRender.i = sizePercent;
    }

    public final void setShowRecordKeyList(@NotNull List<? extends SportRecordKey> keyList) {
        Intrinsics.checkNotNullParameter(keyList, "keyList");
        this.mShowYAxisKeyList = keyList;
        this.mLineChartRender.i(keyList);
    }

    public final void setYAxisValueList(@NotNull Map<SportRecordKey, SportRecordYModel> mValueList) {
        Intrinsics.checkNotNullParameter(mValueList, "mValueList");
        this.mYAxisValueList = mValueList;
    }
}
