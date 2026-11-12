package com.huami.chart.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.huami.chart.chart.HMChart;
import com.huami.chart.provider.PaintProvider;
import com.huami.chart.style.GoalLineStyle;
import com.huami.chart.util.ChartUtil;

/* JADX INFO: loaded from: classes6.dex */
public class GoalLineRender extends BaseRender<GoalLineStyle> {
    private static final String k = "GoalLineRender";
    private Path i;
    private float j;

    public GoalLineRender(HMChart hMChart, PaintProvider paintProvider) {
        super(hMChart, paintProvider);
        this.i = new Path();
    }

    private void e(float f, float f2, float f3, Path path, Canvas canvas, Paint paint) {
        path.reset();
        path.moveTo(f, f3);
        path.lineTo(f2, f3);
        canvas.drawPath(path, paint);
    }

    @Override // com.huami.chart.render.BaseRender
    public void draw(Canvas canvas, int i, int i2, float f) {
        super.draw(canvas, i, i2, f);
        float[] goals = ((GoalLineStyle) this.mStyle).getGoals();
        if (goals == null) {
            return;
        }
        int i3 = 0;
        while (i3 < goals.length) {
            float goalLineMarginStart = ((GoalLineStyle) this.mStyle).getGoalLineMarginStart();
            float width = this.hmChart.getDrawAreaManager().getWidth() - ((GoalLineStyle) this.mStyle).getGoalLineMarginEnd();
            float f2 = (goalLineMarginStart + width) / 2.0f;
            float positionByValue = getPositionByValue(goals[i3]);
            if (((GoalLineStyle) this.mStyle).getGoalLineOutsideShow()) {
                if (positionByValue <= 0.0f) {
                    positionByValue = 0.0f;
                } else if (positionByValue >= this.hmChart.getDrawAreaManager().getHeight()) {
                    positionByValue = this.hmChart.getDrawAreaManager().getHeight();
                }
            }
            if ((((GoalLineStyle) this.mStyle).getGoalLineStyle() & 8) > 0) {
                String[] goalLabels = ((GoalLineStyle) this.mStyle).getGoalLabels();
                String str = i3 < goalLabels.length ? goalLabels[i3] : "";
                float fCalculateTextWidth = str.isEmpty() ? 0.0f : ChartUtil.calculateTextWidth(this.paintProvider.getGoalLineLabelPaint(i3), str);
                float fCalculateTextHeight = ChartUtil.calculateTextHeight(this.paintProvider.getGoalLineLabelPaint(i3), str);
                if (((GoalLineStyle) this.mStyle).getGoalLineOutsideShow()) {
                    if (positionByValue == 0.0f) {
                        positionByValue = fCalculateTextHeight / 2.0f;
                    } else if (positionByValue == this.hmChart.getDrawAreaManager().getHeight()) {
                        positionByValue = this.hmChart.getDrawAreaManager().getHeight() - (fCalculateTextHeight / 2.0f);
                    }
                }
                float f3 = positionByValue;
                if (((GoalLineStyle) this.mStyle).getGoalLineLabelPosition() == GoalLineStyle.GoalLineLabelPosition.START) {
                    canvas.drawText(str, goalLineMarginStart, (fCalculateTextHeight / 2.0f) + f3, this.paintProvider.getGoalLineLabelPaint(i3));
                    goalLineMarginStart = goalLineMarginStart + fCalculateTextWidth + ((GoalLineStyle) this.mStyle).getGoalLabelMarginStart() + ((GoalLineStyle) this.mStyle).getGoalLabelMarginEnd();
                } else if (((GoalLineStyle) this.mStyle).getGoalLineLabelPosition() == GoalLineStyle.GoalLineLabelPosition.CENTER) {
                    float f4 = fCalculateTextWidth / 2.0f;
                    float f5 = f2 - f4;
                    canvas.drawText(str, f5, (fCalculateTextHeight / 2.0f) + f3, this.paintProvider.getGoalLineLabelPaint(i3));
                    if ((((GoalLineStyle) this.mStyle).getGoalLineStyle() & 2) > 0) {
                        e(goalLineMarginStart, f5 - ((GoalLineStyle) this.mStyle).getGoalLabelMarginStart(), f3, this.i, canvas, this.paintProvider.getGoalLinePaint(i3));
                        e(f2 + f4 + ((GoalLineStyle) this.mStyle).getGoalLabelMarginEnd(), width, f3, this.i, canvas, this.paintProvider.getGoalLinePaint(i3));
                    } else {
                        canvas.drawLine(goalLineMarginStart, f3, f5 - ((GoalLineStyle) this.mStyle).getGoalLabelMarginStart(), f3, this.paintProvider.getGoalLinePaint(i3));
                        canvas.drawLine(f2 + f4 + ((GoalLineStyle) this.mStyle).getGoalLabelMarginEnd(), f3, width, f3, this.paintProvider.getGoalLinePaint(i3));
                    }
                } else if (((GoalLineStyle) this.mStyle).getGoalLineLabelPosition() == GoalLineStyle.GoalLineLabelPosition.END) {
                    canvas.drawText(str, ((GoalLineStyle) this.mStyle).getGoalLabelMarginStart() + width, (fCalculateTextHeight / 2.0f) + f3, this.paintProvider.getGoalLineLabelPaint(i3));
                } else {
                    canvas.drawText(str, ((GoalLineStyle) this.mStyle).getGoalLineFloatTextOffsetX() + goalLineMarginStart, ((GoalLineStyle) this.mStyle).getGoalLineFloatTextOffsetY() + f3 + (fCalculateTextHeight / 2.0f), this.paintProvider.getGoalLineLabelPaint(i3));
                }
                positionByValue = f3;
            }
            if ((((GoalLineStyle) this.mStyle).getGoalLineStyle() & 4) > 0 && ((GoalLineStyle) this.mStyle).getGoalLineLabelPosition() != GoalLineStyle.GoalLineLabelPosition.CENTER) {
                canvas.drawLine(goalLineMarginStart, positionByValue, width, positionByValue, this.paintProvider.getGoalLinePaint(i3));
            }
            if ((((GoalLineStyle) this.mStyle).getGoalLineStyle() & 2) > 0 && ((GoalLineStyle) this.mStyle).getGoalLineLabelPosition() != GoalLineStyle.GoalLineLabelPosition.CENTER && (((GoalLineStyle) this.mStyle).getGoalLineStyle() & 2) > 0) {
                this.i.reset();
                this.i.moveTo(goalLineMarginStart, positionByValue);
                this.i.lineTo(width, positionByValue);
                canvas.drawPath(this.i, this.paintProvider.getGoalLinePaint(i3));
            }
            i3++;
        }
    }
}
