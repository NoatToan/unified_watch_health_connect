package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.huawei.hihealth.HiDataFilter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ChainRun extends WidgetRun {
    private int chainStyle;
    ArrayList<WidgetRun> widgets;

    public ChainRun(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.widgets = new ArrayList<>();
        this.orientation = i;
        build();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.orientation == 0 ? "horizontal : " : "vertical : ");
        for (WidgetRun widgetRun : this.widgets) {
            sb.append(HiDataFilter.DataFilterExpression.LESS_THAN);
            sb.append(widgetRun);
            sb.append("> ");
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean supportsWrapComputation() {
        int size = this.widgets.size();
        for (int i = 0; i < size; i++) {
            if (!this.widgets.get(i).supportsWrapComputation()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
        int size = this.widgets.size();
        long wrapDimension = 0;
        for (int i = 0; i < size; i++) {
            WidgetRun widgetRun = this.widgets.get(i);
            wrapDimension = wrapDimension + ((long) widgetRun.start.margin) + widgetRun.getWrapDimension() + ((long) widgetRun.end.margin);
        }
        return wrapDimension;
    }

    private void build() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.widget;
        ConstraintWidget previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
        while (true) {
            ConstraintWidget constraintWidget3 = previousChainMember;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            } else {
                previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
            }
        }
        this.widget = constraintWidget;
        this.widgets.add(constraintWidget.getRun(this.orientation));
        ConstraintWidget nextChainMember = constraintWidget.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            this.widgets.add(nextChainMember.getRun(this.orientation));
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        for (WidgetRun widgetRun : this.widgets) {
            if (this.orientation == 0) {
                widgetRun.widget.horizontalChainRun = this;
            } else if (this.orientation == 1) {
                widgetRun.widget.verticalChainRun = this;
            }
        }
        if (this.orientation == 0 && ((ConstraintWidgetContainer) this.widget.getParent()).isRtl() && this.widgets.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.widgets;
            this.widget = arrayList.get(arrayList.size() - 1).widget;
        }
        this.chainStyle = this.orientation == 0 ? this.widget.getHorizontalChainStyle() : this.widget.getVerticalChainStyle();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void clear() {
        this.runGroup = null;
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void reset() {
        this.start.resolved = false;
        this.end.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        if (this.start.resolved && this.end.resolved) {
            ConstraintWidget parent = this.widget.getParent();
            boolean zIsRtl = parent instanceof ConstraintWidgetContainer ? ((ConstraintWidgetContainer) parent).isRtl() : false;
            int i12 = this.end.value - this.start.value;
            int size = this.widgets.size();
            int i13 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i13 >= size) {
                    i13 = -1;
                    break;
                } else if (this.widgets.get(i13).widget.getVisibility() != 8) {
                    break;
                } else {
                    i13++;
                }
            }
            int i14 = size - 1;
            for (int i15 = i14; i15 >= 0; i15--) {
                if (this.widgets.get(i15).widget.getVisibility() != 8) {
                    i = i15;
                    break;
                }
            }
            int i16 = 0;
            while (true) {
                if (i16 >= 2) {
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    f = 0.0f;
                    break;
                }
                int i17 = 0;
                i4 = 0;
                i5 = 0;
                int i18 = 0;
                f = 0.0f;
                while (i17 < size) {
                    WidgetRun widgetRun = this.widgets.get(i17);
                    if (widgetRun.widget.getVisibility() != i2) {
                        i18++;
                        if (i17 > 0 && i17 >= i13) {
                            i4 += widgetRun.start.margin;
                        }
                        int i19 = widgetRun.dimension.value;
                        boolean z = widgetRun.dimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z) {
                            if (this.orientation == 0 && !widgetRun.widget.horizontalRun.dimension.resolved) {
                                return;
                            }
                            if (this.orientation == 1 && !widgetRun.widget.verticalRun.dimension.resolved) {
                                return;
                            }
                        } else {
                            if (widgetRun.matchConstraintsType == 1 && i16 == 0) {
                                i19 = widgetRun.dimension.wrapValue;
                                i5++;
                            } else if (widgetRun.dimension.resolved) {
                            }
                            z = true;
                        }
                        if (z) {
                            i4 += i19;
                        } else {
                            i5++;
                            float f2 = widgetRun.widget.mWeight[this.orientation];
                            if (f2 >= 0.0f) {
                                f += f2;
                            }
                        }
                        if (i17 < i14 && i17 < i) {
                            i4 += -widgetRun.end.margin;
                        }
                    }
                    i17++;
                    i2 = 8;
                }
                if (i4 < i12 || i5 == 0) {
                    i3 = i18;
                    break;
                } else {
                    i16++;
                    i2 = 8;
                }
            }
            int i20 = this.start.value;
            if (zIsRtl) {
                i20 = this.end.value;
            }
            if (i4 > i12) {
                int i21 = (int) (((i4 - i12) / 2.0f) + 0.5f);
                i20 = zIsRtl ? i20 + i21 : i20 - i21;
            }
            if (i5 > 0) {
                float f3 = i12 - i4;
                int i22 = (int) ((f3 / i5) + 0.5f);
                int i23 = 0;
                int i24 = 0;
                while (i23 < size) {
                    WidgetRun widgetRun2 = this.widgets.get(i23);
                    int i25 = i22;
                    if (widgetRun2.widget.getVisibility() == 8 || widgetRun2.dimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || widgetRun2.dimension.resolved) {
                        f3 = f3;
                    } else {
                        int i26 = f > 0.0f ? (int) (((widgetRun2.widget.mWeight[this.orientation] * f3) / f) + 0.5f) : i25;
                        if (this.orientation == 0) {
                            i10 = widgetRun2.widget.mMatchConstraintMaxWidth;
                            i11 = widgetRun2.widget.mMatchConstraintMinWidth;
                        } else {
                            i10 = widgetRun2.widget.mMatchConstraintMaxHeight;
                            i11 = widgetRun2.widget.mMatchConstraintMinHeight;
                        }
                        int iMax = Math.max(i11, widgetRun2.matchConstraintsType == 1 ? Math.min(i26, widgetRun2.dimension.wrapValue) : i26);
                        if (i10 > 0) {
                            iMax = Math.min(i10, iMax);
                        }
                        if (iMax != i26) {
                            i24++;
                            i26 = iMax;
                        }
                        widgetRun2.dimension.resolve(i26);
                    }
                    i23++;
                    i22 = i25;
                    f3 = f3;
                    i4 = i4;
                    i20 = i20;
                }
                i6 = i20;
                int i27 = i4;
                if (i24 > 0) {
                    i5 -= i24;
                    int i28 = 0;
                    for (int i29 = 0; i29 < size; i29++) {
                        WidgetRun widgetRun3 = this.widgets.get(i29);
                        if (widgetRun3.widget.getVisibility() != 8) {
                            if (i29 > 0 && i29 >= i13) {
                                i28 += widgetRun3.start.margin;
                            }
                            i28 += widgetRun3.dimension.value;
                            if (i29 < i14 && i29 < i) {
                                i28 += -widgetRun3.end.margin;
                            }
                        }
                    }
                    i4 = i28;
                } else {
                    i4 = i27;
                }
                i8 = 2;
                if (this.chainStyle == 2 && i24 == 0) {
                    i7 = 0;
                    this.chainStyle = 0;
                } else {
                    i7 = 0;
                }
            } else {
                i6 = i20;
                i7 = 0;
                i8 = 2;
            }
            if (i4 > i12) {
                this.chainStyle = i8;
            }
            if (i3 > 0 && i5 == 0 && i13 == i) {
                this.chainStyle = i8;
            }
            int i30 = this.chainStyle;
            if (i30 == 1) {
                if (i3 > 1) {
                    i9 = (i12 - i4) / (i3 - 1);
                } else {
                    i9 = i3 == 1 ? (i12 - i4) / 2 : i7;
                }
                if (i5 > 0) {
                    i9 = i7;
                }
                int i31 = i6;
                for (int i32 = i7; i32 < size; i32++) {
                    WidgetRun widgetRun4 = this.widgets.get(zIsRtl ? size - (i32 + 1) : i32);
                    if (widgetRun4.widget.getVisibility() == 8) {
                        widgetRun4.start.resolve(i31);
                        widgetRun4.end.resolve(i31);
                    } else {
                        if (i32 > 0) {
                            i31 = zIsRtl ? i31 - i9 : i31 + i9;
                        }
                        if (i32 > 0 && i32 >= i13) {
                            if (zIsRtl) {
                                i31 -= widgetRun4.start.margin;
                            } else {
                                i31 += widgetRun4.start.margin;
                            }
                        }
                        if (zIsRtl) {
                            widgetRun4.end.resolve(i31);
                        } else {
                            widgetRun4.start.resolve(i31);
                        }
                        int i33 = widgetRun4.dimension.value;
                        if (widgetRun4.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun4.matchConstraintsType == 1) {
                            i33 = widgetRun4.dimension.wrapValue;
                        }
                        i31 = zIsRtl ? i31 - i33 : i31 + i33;
                        if (zIsRtl) {
                            widgetRun4.start.resolve(i31);
                        } else {
                            widgetRun4.end.resolve(i31);
                        }
                        widgetRun4.resolved = true;
                        if (i32 < i14 && i32 < i) {
                            if (zIsRtl) {
                                i31 -= -widgetRun4.end.margin;
                            } else {
                                i31 += -widgetRun4.end.margin;
                            }
                        }
                    }
                }
                return;
            }
            if (i30 == 0) {
                int i34 = (i12 - i4) / (i3 + 1);
                if (i5 > 0) {
                    i34 = i7;
                }
                int i35 = i6;
                for (int i36 = i7; i36 < size; i36++) {
                    WidgetRun widgetRun5 = this.widgets.get(zIsRtl ? size - (i36 + 1) : i36);
                    if (widgetRun5.widget.getVisibility() == 8) {
                        widgetRun5.start.resolve(i35);
                        widgetRun5.end.resolve(i35);
                    } else {
                        int i37 = zIsRtl ? i35 - i34 : i35 + i34;
                        if (i36 > 0 && i36 >= i13) {
                            if (zIsRtl) {
                                i37 -= widgetRun5.start.margin;
                            } else {
                                i37 += widgetRun5.start.margin;
                            }
                        }
                        if (zIsRtl) {
                            widgetRun5.end.resolve(i37);
                        } else {
                            widgetRun5.start.resolve(i37);
                        }
                        int iMin = widgetRun5.dimension.value;
                        if (widgetRun5.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun5.matchConstraintsType == 1) {
                            iMin = Math.min(iMin, widgetRun5.dimension.wrapValue);
                        }
                        i35 = zIsRtl ? i37 - iMin : i37 + iMin;
                        if (zIsRtl) {
                            widgetRun5.start.resolve(i35);
                        } else {
                            widgetRun5.end.resolve(i35);
                        }
                        if (i36 < i14 && i36 < i) {
                            if (zIsRtl) {
                                i35 -= -widgetRun5.end.margin;
                            } else {
                                i35 += -widgetRun5.end.margin;
                            }
                        }
                    }
                }
                return;
            }
            if (i30 == 2) {
                float horizontalBiasPercent = this.orientation == 0 ? this.widget.getHorizontalBiasPercent() : this.widget.getVerticalBiasPercent();
                if (zIsRtl) {
                    horizontalBiasPercent = 1.0f - horizontalBiasPercent;
                }
                int i38 = (int) (((i12 - i4) * horizontalBiasPercent) + 0.5f);
                if (i38 < 0 || i5 > 0) {
                    i38 = i7;
                }
                int i39 = zIsRtl ? i6 - i38 : i6 + i38;
                for (int i40 = i7; i40 < size; i40++) {
                    WidgetRun widgetRun6 = this.widgets.get(zIsRtl ? size - (i40 + 1) : i40);
                    if (widgetRun6.widget.getVisibility() == 8) {
                        widgetRun6.start.resolve(i39);
                        widgetRun6.end.resolve(i39);
                    } else {
                        if (i40 > 0 && i40 >= i13) {
                            if (zIsRtl) {
                                i39 -= widgetRun6.start.margin;
                            } else {
                                i39 += widgetRun6.start.margin;
                            }
                        }
                        if (zIsRtl) {
                            widgetRun6.end.resolve(i39);
                        } else {
                            widgetRun6.start.resolve(i39);
                        }
                        int i41 = widgetRun6.dimension.value;
                        if (widgetRun6.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.matchConstraintsType == 1) {
                            i41 = widgetRun6.dimension.wrapValue;
                        }
                        i39 = zIsRtl ? i39 - i41 : i39 + i41;
                        if (zIsRtl) {
                            widgetRun6.start.resolve(i39);
                        } else {
                            widgetRun6.end.resolve(i39);
                        }
                        if (i40 < i14 && i40 < i) {
                            if (zIsRtl) {
                                i39 -= -widgetRun6.end.margin;
                            } else {
                                i39 += -widgetRun6.end.margin;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        for (int i = 0; i < this.widgets.size(); i++) {
            this.widgets.get(i).applyToWidget();
        }
    }

    private ConstraintWidget getFirstVisibleWidget() {
        for (int i = 0; i < this.widgets.size(); i++) {
            WidgetRun widgetRun = this.widgets.get(i);
            if (widgetRun.widget.getVisibility() != 8) {
                return widgetRun.widget;
            }
        }
        return null;
    }

    private ConstraintWidget getLastVisibleWidget() {
        for (int size = this.widgets.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.widgets.get(size);
            if (widgetRun.widget.getVisibility() != 8) {
                return widgetRun.widget;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void apply() {
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().apply();
        }
        int size = this.widgets.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.widgets.get(0).widget;
        ConstraintWidget constraintWidget2 = this.widgets.get(size - 1).widget;
        if (this.orientation == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.mRight;
            DependencyNode target = getTarget(constraintAnchor, 0);
            int margin = constraintAnchor.getMargin();
            ConstraintWidget firstVisibleWidget = getFirstVisibleWidget();
            if (firstVisibleWidget != null) {
                margin = firstVisibleWidget.mLeft.getMargin();
            }
            if (target != null) {
                addTarget(this.start, target, margin);
            }
            DependencyNode target2 = getTarget(constraintAnchor2, 0);
            int margin2 = constraintAnchor2.getMargin();
            ConstraintWidget lastVisibleWidget = getLastVisibleWidget();
            if (lastVisibleWidget != null) {
                margin2 = lastVisibleWidget.mRight.getMargin();
            }
            if (target2 != null) {
                addTarget(this.end, target2, -margin2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.mBottom;
            DependencyNode target3 = getTarget(constraintAnchor3, 1);
            int margin3 = constraintAnchor3.getMargin();
            ConstraintWidget firstVisibleWidget2 = getFirstVisibleWidget();
            if (firstVisibleWidget2 != null) {
                margin3 = firstVisibleWidget2.mTop.getMargin();
            }
            if (target3 != null) {
                addTarget(this.start, target3, margin3);
            }
            DependencyNode target4 = getTarget(constraintAnchor4, 1);
            int margin4 = constraintAnchor4.getMargin();
            ConstraintWidget lastVisibleWidget2 = getLastVisibleWidget();
            if (lastVisibleWidget2 != null) {
                margin4 = lastVisibleWidget2.mBottom.getMargin();
            }
            if (target4 != null) {
                addTarget(this.end, target4, -margin4);
            }
        }
        this.start.updateDelegate = this;
        this.end.updateDelegate = this;
    }
}
