package androidx.constraintlayout.compose;

import android.graphics.Matrix;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.Key;
import io.netty.util.internal.StringUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bN\u0010OJ;\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0018\u001a\u00020\u000b2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0002H\u0002JI\u0010&\u001a\u00020\u000b*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J1\u0010*\u001a\u00020\u000b*\u00020\u00192\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u0006\u0010+\u001a\u00020\u001aJc\u00107\u001a\u0002042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u0001002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u00103\u001a\u000202ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J\u0012\u00108\u001a\u00020\u000b2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010J\b\u00109\u001a\u00020\u000bH\u0016J\u0013\u0010;\u001a\u00020\u000b*\u00020:H\u0007¢\u0006\u0004\b;\u0010<J&\u0010B\u001a\u00020\"2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b@\u0010AJ\u0016\u0010C\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=J\u0006\u0010D\u001a\u00020\u000bJ(\u0010G\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0016\u001a\u00020\u001aR\u0016\u0010H\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0019\u00101\u001a\u00020J8\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010K\u001a\u0004\bL\u0010M\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/constraintlayout/compose/MotionMeasurer;", "Landroidx/constraintlayout/compose/Measurer;", "", "optimizationLevel", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintSet", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "measureConstraintSet--hBUhpc", "(ILandroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;J)V", "measureConstraintSet", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "json", "", "location", "", "types", "progress", "count", "encodeKeyFrames", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "parentWidth", "parentHeight", "Landroidx/constraintlayout/core/state/WidgetFrame;", "startFrame", "endFrame", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "Landroidx/compose/ui/graphics/Color;", "color", "drawFrameDebug-PE3pjmc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFLandroidx/constraintlayout/core/state/WidgetFrame;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V", "drawFrameDebug", TypedValues.AttributesType.S_FRAME, "drawFrame-g2O1Hgs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V", "drawFrame", "getProgress", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "constraintSetStart", "constraintSetEnd", "Landroidx/constraintlayout/compose/Transition;", "transition", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/unit/IntSize;", "performInterpolationMeasure-OQbXsTc", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Ljava/util/List;IFLandroidx/compose/ui/layout/MeasureScope;)J", "performInterpolationMeasure", "encodeRoot", "computeLayoutResult", "Landroidx/compose/foundation/layout/BoxScope;", "drawDebug", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "", "id", "name", "getCustomColor-WaAFU9c", "(Ljava/lang/String;Ljava/lang/String;)J", "getCustomColor", "getCustomFloat", "clearConstraintSets", "start", "end", "initWith", Key.MOTIONPROGRESS, "F", "Landroidx/constraintlayout/core/state/Transition;", "Landroidx/constraintlayout/core/state/Transition;", "getTransition", "()Landroidx/constraintlayout/core/state/Transition;", "<init>", "()V", "compose_release"}, k = 1, mv = {1, 5, 1})
@PublishedApi
public final class MotionMeasurer extends Measurer {
    private float motionProgress;

    @NotNull
    private final androidx.constraintlayout.core.state.Transition transition = new androidx.constraintlayout.core.state.Transition();

    /* JADX INFO: renamed from: drawFrame-g2O1Hgs, reason: not valid java name */
    private final void m3259drawFrameg2O1Hgs(DrawScope drawScope, WidgetFrame widgetFrame, PathEffect pathEffect, long j) {
        if (widgetFrame.isDefaultTransform()) {
            DrawScope.DefaultImpls.m1628drawRectnJ9OG0$default(drawScope, j, OffsetKt.Offset(widgetFrame.left, widgetFrame.top), SizeKt.Size(widgetFrame.width(), widgetFrame.height()), 0.0f, new Stroke(3.0f, 0.0f, 0, 0, pathEffect, 14, null), null, 0, 104, null);
            return;
        }
        Matrix matrix = new Matrix();
        if (!Float.isNaN(widgetFrame.rotationZ)) {
            matrix.preRotate(widgetFrame.rotationZ, widgetFrame.centerX(), widgetFrame.centerY());
        }
        matrix.preScale(Float.isNaN(widgetFrame.scaleX) ? 1.0f : widgetFrame.scaleX, Float.isNaN(widgetFrame.scaleY) ? 1.0f : widgetFrame.scaleY, widgetFrame.centerX(), widgetFrame.centerY());
        int i = widgetFrame.left;
        int i2 = widgetFrame.top;
        int i3 = widgetFrame.right;
        int i4 = widgetFrame.bottom;
        float[] fArr = {i, i2, i3, i2, i3, i4, i, i4};
        matrix.mapPoints(fArr);
        DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[0], fArr[1]), OffsetKt.Offset(fArr[2], fArr[3]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[2], fArr[3]), OffsetKt.Offset(fArr[4], fArr[5]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[4], fArr[5]), OffsetKt.Offset(fArr[6], fArr[7]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[6], fArr[7]), OffsetKt.Offset(fArr[0], fArr[1]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawFrameDebug-PE3pjmc, reason: not valid java name */
    public final void m3260drawFrameDebugPE3pjmc(DrawScope drawScope, float f, float f2, WidgetFrame widgetFrame, WidgetFrame widgetFrame2, PathEffect pathEffect, long j) {
        m3259drawFrameg2O1Hgs(drawScope, widgetFrame, pathEffect, j);
        m3259drawFrameg2O1Hgs(drawScope, widgetFrame2, pathEffect, j);
        int numberKeyPositions = this.transition.getNumberKeyPositions(widgetFrame);
        new MotionRenderDebug(23.0f).draw(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()), this.transition.getMotion(widgetFrame.widget.stringId), 1000, 1, (int) f, (int) f2);
        if (numberKeyPositions == 0) {
            return;
        }
        float[] fArr = new float[numberKeyPositions];
        float[] fArr2 = new float[numberKeyPositions];
        float[] fArr3 = new float[numberKeyPositions];
        this.transition.fillKeyPositions(widgetFrame, fArr, fArr2, fArr3);
        widgetFrame.centerX();
        widgetFrame.centerY();
        int i = 0;
        int i2 = numberKeyPositions - 1;
        if (i2 < 0) {
            return;
        }
        while (true) {
            int i3 = i + 1;
            float f3 = fArr3[i] / 100.0f;
            float f4 = 1 - f3;
            float fWidth = (widgetFrame.width() * f4) + (widgetFrame2.width() * f3);
            float fHeight = (f4 * widgetFrame.height()) + (f3 * widgetFrame2.height());
            float f5 = (fArr[i] * f) + (fWidth / 2.0f);
            float f6 = (fArr2[i] * f2) + (fHeight / 2.0f);
            Path Path = AndroidPath_androidKt.Path();
            Path.moveTo(f5 - 20.0f, f6);
            Path.lineTo(f5, f6 + 20.0f);
            Path.lineTo(f5 + 20.0f, f6);
            Path.lineTo(f5, f6 - 20.0f);
            Path.close();
            DrawScope.DefaultImpls.m1624drawPathLG529CI$default(drawScope, Path, j, 1.0f, new Stroke(3.0f, 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
            if (i == i2) {
                return;
            } else {
                i = i3;
            }
        }
    }

    private final void encodeKeyFrames(StringBuilder json, float[] location, int[] types, int[] progress, int count) {
        if (count == 0) {
            return;
        }
        json.append("keyTypes : [");
        int i = 0;
        if (count > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                int i4 = types[i2];
                StringBuilder sb = new StringBuilder();
                sb.append(StringUtil.SPACE);
                sb.append(i4);
                sb.append(',');
                json.append(sb.toString());
                if (i3 >= count) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        json.append("],\n");
        json.append("keyPos : [");
        int i5 = count * 2;
        if (i5 > 0) {
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                float f = location[i6];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(StringUtil.SPACE);
                sb2.append(f);
                sb2.append(',');
                json.append(sb2.toString());
                if (i7 >= i5) {
                    break;
                } else {
                    i6 = i7;
                }
            }
        }
        json.append("],\n ");
        json.append("keyFrames : [");
        if (count > 0) {
            while (true) {
                int i8 = i + 1;
                int i9 = progress[i];
                StringBuilder sb3 = new StringBuilder();
                sb3.append(StringUtil.SPACE);
                sb3.append(i9);
                sb3.append(',');
                json.append(sb3.toString());
                if (i8 >= count) {
                    break;
                } else {
                    i = i8;
                }
            }
        }
        json.append("],\n ");
    }

    /* JADX INFO: renamed from: measureConstraintSet--hBUhpc, reason: not valid java name */
    private final void m3261measureConstraintSethBUhpc(int optimizationLevel, ConstraintSet constraintSet, List<? extends Measurable> measurables, long constraints) {
        String string;
        getState().reset();
        constraintSet.applyTo(getState(), measurables);
        getState().apply(getRoot());
        m3232applyRootSizeBRTryo0(constraints);
        getRoot().updateHierarchy();
        if (MotionLayoutKt.DEBUG) {
            getRoot().setDebugName("ConstraintLayout");
            for (ConstraintWidget constraintWidget : getRoot().getChildren()) {
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                Object layoutId = measurable == null ? null : LayoutIdKt.getLayoutId(measurable);
                String str = "NOTAG";
                if (layoutId != null && (string = layoutId.toString()) != null) {
                    str = string;
                }
                constraintWidget.setDebugName(str);
            }
        }
        for (ConstraintWidget constraintWidget2 : getRoot().getChildren()) {
            Object companionWidget2 = constraintWidget2.getCompanionWidget();
            Measurable measurable2 = companionWidget2 instanceof Measurable ? (Measurable) companionWidget2 : null;
            Object layoutId2 = measurable2 == null ? null : LayoutIdKt.getLayoutId(measurable2);
            if (layoutId2 == null) {
                layoutId2 = measurable2 == null ? null : ConstraintLayoutTagKt.getConstraintLayoutId(measurable2);
            }
            constraintWidget2.stringId = layoutId2 == null ? null : layoutId2.toString();
        }
        getRoot().setOptimizationLevel(optimizationLevel);
        getRoot().measure(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public final void clearConstraintSets() {
        this.transition.clear();
        getFrameCache().clear();
    }

    @Override // androidx.constraintlayout.compose.Measurer
    public void computeLayoutResult() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        encodeRoot(sb);
        int[] iArr = new int[50];
        int[] iArr2 = new int[50];
        float[] fArr = new float[100];
        for (ConstraintWidget constraintWidget : getRoot().getChildren()) {
            WidgetFrame start = this.transition.getStart(constraintWidget.stringId);
            WidgetFrame end = this.transition.getEnd(constraintWidget.stringId);
            WidgetFrame interpolated = this.transition.getInterpolated(constraintWidget.stringId);
            float[] path = this.transition.getPath(constraintWidget.stringId);
            int keyFrames = this.transition.getKeyFrames(constraintWidget.stringId, fArr, iArr, iArr2);
            sb.append(StringUtil.SPACE + ((Object) constraintWidget.stringId) + ": {");
            sb.append(" interpolated : ");
            interpolated.serialize(sb, true);
            sb.append(", start : ");
            start.serialize(sb);
            sb.append(", end : ");
            end.serialize(sb);
            encodeKeyFrames(sb, fArr, iArr, iArr2, keyFrames);
            sb.append(" path : [");
            int i = 0;
            int length = path.length;
            while (i < length) {
                float f = path[i];
                i++;
                sb.append(StringUtil.SPACE + f + " ,");
            }
            sb.append(" ] ");
            sb.append("}, ");
        }
        sb.append(" }");
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if (layoutInformationReceiver == null) {
            return;
        }
        layoutInformationReceiver.setLayoutInformation(sb.toString());
    }

    @Composable
    public final void drawDebug(@NotNull final BoxScope boxScope, @Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(436941497);
        CanvasKt.Canvas(boxScope.matchParentSize(Modifier.INSTANCE), new Function1<DrawScope, Unit>() { // from class: androidx.constraintlayout.compose.MotionMeasurer.drawDebug.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope drawScope) {
                PathEffect pathEffectDashPathEffect = PathEffect.INSTANCE.dashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
                for (ConstraintWidget constraintWidget : MotionMeasurer.this.getRoot().getChildren()) {
                    WidgetFrame start = MotionMeasurer.this.getTransition().getStart(constraintWidget);
                    WidgetFrame end = MotionMeasurer.this.getTransition().getEnd(constraintWidget);
                    MotionMeasurer motionMeasurer = MotionMeasurer.this;
                    drawScope.getDrawContext().getTransform().translate(2.0f, 2.0f);
                    float fM1052getWidthimpl = Size.m1052getWidthimpl(drawScope.mo1585getSizeNHjbRc());
                    float fM1049getHeightimpl = Size.m1049getHeightimpl(drawScope.mo1585getSizeNHjbRc());
                    Color.Companion companion = Color.INSTANCE;
                    motionMeasurer.m3260drawFrameDebugPE3pjmc(drawScope, fM1052getWidthimpl, fM1049getHeightimpl, start, end, pathEffectDashPathEffect, companion.m1249getWhite0d7_KjU());
                    drawScope.getDrawContext().getTransform().translate(-2.0f, -2.0f);
                    MotionMeasurer.this.m3260drawFrameDebugPE3pjmc(drawScope, Size.m1052getWidthimpl(drawScope.mo1585getSizeNHjbRc()), Size.m1049getHeightimpl(drawScope.mo1585getSizeNHjbRc()), start, end, pathEffectDashPathEffect, companion.m1239getBlue0d7_KjU());
                }
            }
        }, composerStartRestartGroup, 0);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionMeasurer.drawDebug.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                MotionMeasurer.this.drawDebug(boxScope, composer2, i | 1);
            }
        });
    }

    public final void encodeRoot(@NotNull StringBuilder json) {
        json.append("  root: {");
        json.append("interpolated: { left:  0,");
        json.append("  top:  0,");
        json.append("  right:   " + getRoot().getWidth() + " ,");
        json.append("  bottom:  " + getRoot().getHeight() + " ,");
        json.append(" } }");
    }

    /* JADX INFO: renamed from: getCustomColor-WaAFU9c, reason: not valid java name */
    public final long m3262getCustomColorWaAFU9c(@NotNull String id, @NotNull String name) {
        if (!this.transition.contains(id)) {
            return Color.INSTANCE.m1238getBlack0d7_KjU();
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), this.motionProgress);
        return ColorKt.Color(this.transition.getInterpolated(id).getCustomColor(name));
    }

    public final float getCustomFloat(@NotNull String id, @NotNull String name) {
        if (!this.transition.contains(id)) {
            return 0.0f;
        }
        WidgetFrame start = this.transition.getStart(id);
        WidgetFrame end = this.transition.getEnd(id);
        float customFloat = start.getCustomFloat(name);
        float customFloat2 = end.getCustomFloat(name);
        float f = this.motionProgress;
        return ((1.0f - f) * customFloat) + (f * customFloat2);
    }

    /* JADX INFO: renamed from: getProgress, reason: from getter */
    public final float getMotionProgress() {
        return this.motionProgress;
    }

    @NotNull
    public final androidx.constraintlayout.core.state.Transition getTransition() {
        return this.transition;
    }

    public final void initWith(@NotNull ConstraintSet start, @NotNull ConstraintSet end, @Nullable Transition transition, float progress) {
        clearConstraintSets();
        start.applyTo(this.transition, 0);
        end.applyTo(this.transition, 1);
        this.transition.interpolate(0, 0, progress);
        if (transition == null) {
            return;
        }
        transition.applyTo(this.transition, 0);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0156 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x015c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x0182  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:73:0x018e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0198  */
    /* JADX WARN: Code duplicated, block: B:78:0x019f  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x016b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: performInterpolationMeasure-OQbXsTc, reason: not valid java name */
    public final long m3263performInterpolationMeasureOQbXsTc(long constraints, @NotNull LayoutDirection layoutDirection, @NotNull ConstraintSet constraintSetStart, @NotNull ConstraintSet constraintSetEnd, @Nullable Transition transition, @NotNull List<? extends Measurable> measurables, int optimizationLevel, float progress, @NotNull MeasureScope measureScope) {
        androidx.constraintlayout.core.state.Dimension dimensionMin;
        androidx.constraintlayout.core.state.Dimension dimensionMin2;
        LayoutInformationReceiver layoutInformationReceiver;
        Object companionWidget;
        WidgetFrame interpolated;
        Placeable placeable;
        Integer numValueOf;
        Integer numValueOf2;
        setDensity(measureScope);
        setMeasureScope(measureScope);
        boolean z = Constraints.m2933getHasFixedWidthimpl(constraints) && !getState().sameFixedWidth(Constraints.m2935getMaxWidthimpl(constraints));
        if (Constraints.m2932getHasFixedHeightimpl(constraints) && !getState().sameFixedHeight(Constraints.m2934getMaxHeightimpl(constraints))) {
            z = true;
        }
        if (this.motionProgress == progress) {
            LayoutInformationReceiver layoutInformationReceiver2 = getLayoutInformationReceiver();
            Integer numValueOf3 = layoutInformationReceiver2 == null ? null : Integer.valueOf(layoutInformationReceiver2.getForcedWidth());
            if (numValueOf3 == null || numValueOf3.intValue() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver3 = getLayoutInformationReceiver();
                Integer numValueOf4 = layoutInformationReceiver3 == null ? null : Integer.valueOf(layoutInformationReceiver3.getForcedHeight());
                if (numValueOf4 == null || numValueOf4.intValue() != Integer.MIN_VALUE) {
                    this.motionProgress = progress;
                    if (z) {
                        this.transition.clear();
                        resetMeasureState$compose_release();
                        getState().reset();
                        State state = getState();
                        if (Constraints.m2933getHasFixedWidthimpl(constraints)) {
                            dimensionMin = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2935getMaxWidthimpl(constraints));
                        } else {
                            dimensionMin = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2937getMinWidthimpl(constraints));
                        }
                        state.width(dimensionMin);
                        State state2 = getState();
                        if (Constraints.m2932getHasFixedHeightimpl(constraints)) {
                            dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2934getMaxHeightimpl(constraints));
                        } else {
                            dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2936getMinHeightimpl(constraints));
                        }
                        state2.height(dimensionMin2);
                        getState().m3265setRootIncomingConstraintsBRTryo0(constraints);
                        getState().setLayoutDirection(layoutDirection);
                        m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetStart, measurables, constraints);
                        this.transition.updateFrom(getRoot(), 0);
                        m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetEnd, measurables, constraints);
                        this.transition.updateFrom(getRoot(), 1);
                        if (transition != null) {
                            transition.applyTo(this.transition, 0);
                        }
                    } else {
                        this.transition.clear();
                        resetMeasureState$compose_release();
                        getState().reset();
                        State state3 = getState();
                        if (Constraints.m2933getHasFixedWidthimpl(constraints)) {
                            dimensionMin = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2935getMaxWidthimpl(constraints));
                        } else {
                            dimensionMin = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2937getMinWidthimpl(constraints));
                        }
                        state3.width(dimensionMin);
                        State state4 = getState();
                        if (Constraints.m2932getHasFixedHeightimpl(constraints)) {
                            dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2934getMaxHeightimpl(constraints));
                        } else {
                            dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2936getMinHeightimpl(constraints));
                        }
                        state4.height(dimensionMin2);
                        getState().m3265setRootIncomingConstraintsBRTryo0(constraints);
                        getState().setLayoutDirection(layoutDirection);
                        m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetStart, measurables, constraints);
                        this.transition.updateFrom(getRoot(), 0);
                        m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetEnd, measurables, constraints);
                        this.transition.updateFrom(getRoot(), 1);
                        if (transition != null) {
                            transition.applyTo(this.transition, 0);
                        }
                    }
                    this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), progress);
                    while (r0.hasNext()) {
                        companionWidget = constraintWidget.getCompanionWidget();
                        if (!(companionWidget instanceof Measurable)) {
                            placeable = getPlaceables().get(companionWidget);
                            if (placeable == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(placeable.getWidth());
                            }
                            if (placeable == null) {
                                numValueOf2 = null;
                            } else {
                                numValueOf2 = Integer.valueOf(placeable.getHeight());
                            }
                            if (placeable != null) {
                                int iWidth = interpolated.width();
                                if (numValueOf == null) {
                                    getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                                } else {
                                    int iHeight = interpolated.height();
                                    if (numValueOf2 != null) {
                                        getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                                    } else {
                                        getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                                    }
                                }
                            } else {
                                getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                            }
                            getFrameCache().put(companionWidget, interpolated);
                        }
                    }
                    layoutInformationReceiver = getLayoutInformationReceiver();
                    if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
                        computeLayoutResult();
                    }
                } else if (this.transition.isEmpty()) {
                    this.motionProgress = progress;
                    if (z) {
                        this.transition.clear();
                        resetMeasureState$compose_release();
                        getState().reset();
                        State state5 = getState();
                        if (Constraints.m2933getHasFixedWidthimpl(constraints)) {
                            dimensionMin = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2935getMaxWidthimpl(constraints));
                        } else {
                            dimensionMin = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2937getMinWidthimpl(constraints));
                        }
                        state5.width(dimensionMin);
                        State state6 = getState();
                        if (Constraints.m2932getHasFixedHeightimpl(constraints)) {
                            dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2934getMaxHeightimpl(constraints));
                        } else {
                            dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2936getMinHeightimpl(constraints));
                        }
                        state6.height(dimensionMin2);
                        getState().m3265setRootIncomingConstraintsBRTryo0(constraints);
                        getState().setLayoutDirection(layoutDirection);
                        m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetStart, measurables, constraints);
                        this.transition.updateFrom(getRoot(), 0);
                        m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetEnd, measurables, constraints);
                        this.transition.updateFrom(getRoot(), 1);
                        if (transition != null) {
                            transition.applyTo(this.transition, 0);
                        }
                    } else {
                        this.transition.clear();
                        resetMeasureState$compose_release();
                        getState().reset();
                        State state7 = getState();
                        if (Constraints.m2933getHasFixedWidthimpl(constraints)) {
                            dimensionMin = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2935getMaxWidthimpl(constraints));
                        } else {
                            dimensionMin = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2937getMinWidthimpl(constraints));
                        }
                        state7.width(dimensionMin);
                        State state8 = getState();
                        if (Constraints.m2932getHasFixedHeightimpl(constraints)) {
                            dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2934getMaxHeightimpl(constraints));
                        } else {
                            dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2936getMinHeightimpl(constraints));
                        }
                        state8.height(dimensionMin2);
                        getState().m3265setRootIncomingConstraintsBRTryo0(constraints);
                        getState().setLayoutDirection(layoutDirection);
                        m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetStart, measurables, constraints);
                        this.transition.updateFrom(getRoot(), 0);
                        m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetEnd, measurables, constraints);
                        this.transition.updateFrom(getRoot(), 1);
                        if (transition != null) {
                            transition.applyTo(this.transition, 0);
                        }
                    }
                    this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), progress);
                    while (r0.hasNext()) {
                        companionWidget = constraintWidget.getCompanionWidget();
                        if (!(companionWidget instanceof Measurable)) {
                            placeable = getPlaceables().get(companionWidget);
                            if (placeable == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(placeable.getWidth());
                            }
                            if (placeable == null) {
                                numValueOf2 = null;
                            } else {
                                numValueOf2 = Integer.valueOf(placeable.getHeight());
                            }
                            if (placeable != null) {
                                int iWidth2 = interpolated.width();
                                if (numValueOf == null) {
                                    getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                                } else {
                                    int iHeight2 = interpolated.height();
                                    if (numValueOf2 != null) {
                                        getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                                    } else {
                                        getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                                    }
                                }
                            } else {
                                getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                            }
                            getFrameCache().put(companionWidget, interpolated);
                        }
                    }
                    layoutInformationReceiver = getLayoutInformationReceiver();
                    if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
                        computeLayoutResult();
                    }
                } else {
                    this.motionProgress = progress;
                    if (z) {
                        this.transition.clear();
                        resetMeasureState$compose_release();
                        getState().reset();
                        State state9 = getState();
                        if (Constraints.m2933getHasFixedWidthimpl(constraints)) {
                            dimensionMin = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2935getMaxWidthimpl(constraints));
                        } else {
                            dimensionMin = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2937getMinWidthimpl(constraints));
                        }
                        state9.width(dimensionMin);
                        State state10 = getState();
                        if (Constraints.m2932getHasFixedHeightimpl(constraints)) {
                            dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2934getMaxHeightimpl(constraints));
                        } else {
                            dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2936getMinHeightimpl(constraints));
                        }
                        state10.height(dimensionMin2);
                        getState().m3265setRootIncomingConstraintsBRTryo0(constraints);
                        getState().setLayoutDirection(layoutDirection);
                        m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetStart, measurables, constraints);
                        this.transition.updateFrom(getRoot(), 0);
                        m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetEnd, measurables, constraints);
                        this.transition.updateFrom(getRoot(), 1);
                        if (transition != null) {
                            transition.applyTo(this.transition, 0);
                        }
                    } else {
                        this.transition.clear();
                        resetMeasureState$compose_release();
                        getState().reset();
                        State state11 = getState();
                        if (Constraints.m2933getHasFixedWidthimpl(constraints)) {
                            dimensionMin = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2935getMaxWidthimpl(constraints));
                        } else {
                            dimensionMin = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2937getMinWidthimpl(constraints));
                        }
                        state11.width(dimensionMin);
                        State state12 = getState();
                        if (Constraints.m2932getHasFixedHeightimpl(constraints)) {
                            dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2934getMaxHeightimpl(constraints));
                        } else {
                            dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2936getMinHeightimpl(constraints));
                        }
                        state12.height(dimensionMin2);
                        getState().m3265setRootIncomingConstraintsBRTryo0(constraints);
                        getState().setLayoutDirection(layoutDirection);
                        m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetStart, measurables, constraints);
                        this.transition.updateFrom(getRoot(), 0);
                        m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetEnd, measurables, constraints);
                        this.transition.updateFrom(getRoot(), 1);
                        if (transition != null) {
                            transition.applyTo(this.transition, 0);
                        }
                    }
                    this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), progress);
                    while (r0.hasNext()) {
                        companionWidget = constraintWidget.getCompanionWidget();
                        if (!(companionWidget instanceof Measurable)) {
                            placeable = getPlaceables().get(companionWidget);
                            if (placeable == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(placeable.getWidth());
                            }
                            if (placeable == null) {
                                numValueOf2 = null;
                            } else {
                                numValueOf2 = Integer.valueOf(placeable.getHeight());
                            }
                            if (placeable != null) {
                                int iWidth3 = interpolated.width();
                                if (numValueOf == null) {
                                    getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                                } else {
                                    int iHeight3 = interpolated.height();
                                    if (numValueOf2 != null) {
                                        getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                                    } else {
                                        getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                                    }
                                }
                            } else {
                                getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                            }
                            getFrameCache().put(companionWidget, interpolated);
                        }
                    }
                    layoutInformationReceiver = getLayoutInformationReceiver();
                    if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
                        computeLayoutResult();
                    }
                }
            } else if (this.transition.isEmpty() || getFrameCache().isEmpty() || z) {
                this.motionProgress = progress;
                if (z) {
                    this.transition.clear();
                    resetMeasureState$compose_release();
                    getState().reset();
                    State state13 = getState();
                    if (Constraints.m2933getHasFixedWidthimpl(constraints)) {
                        dimensionMin = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2935getMaxWidthimpl(constraints));
                    } else {
                        dimensionMin = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2937getMinWidthimpl(constraints));
                    }
                    state13.width(dimensionMin);
                    State state14 = getState();
                    if (Constraints.m2932getHasFixedHeightimpl(constraints)) {
                        dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2934getMaxHeightimpl(constraints));
                    } else {
                        dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2936getMinHeightimpl(constraints));
                    }
                    state14.height(dimensionMin2);
                    getState().m3265setRootIncomingConstraintsBRTryo0(constraints);
                    getState().setLayoutDirection(layoutDirection);
                    m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetStart, measurables, constraints);
                    this.transition.updateFrom(getRoot(), 0);
                    m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetEnd, measurables, constraints);
                    this.transition.updateFrom(getRoot(), 1);
                    if (transition != null) {
                        transition.applyTo(this.transition, 0);
                    }
                } else {
                    this.transition.clear();
                    resetMeasureState$compose_release();
                    getState().reset();
                    State state15 = getState();
                    if (Constraints.m2933getHasFixedWidthimpl(constraints)) {
                        dimensionMin = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2935getMaxWidthimpl(constraints));
                    } else {
                        dimensionMin = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2937getMinWidthimpl(constraints));
                    }
                    state15.width(dimensionMin);
                    State state16 = getState();
                    if (Constraints.m2932getHasFixedHeightimpl(constraints)) {
                        dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2934getMaxHeightimpl(constraints));
                    } else {
                        dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2936getMinHeightimpl(constraints));
                    }
                    state16.height(dimensionMin2);
                    getState().m3265setRootIncomingConstraintsBRTryo0(constraints);
                    getState().setLayoutDirection(layoutDirection);
                    m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetStart, measurables, constraints);
                    this.transition.updateFrom(getRoot(), 0);
                    m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetEnd, measurables, constraints);
                    this.transition.updateFrom(getRoot(), 1);
                    if (transition != null) {
                        transition.applyTo(this.transition, 0);
                    }
                }
                this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), progress);
                while (r0.hasNext()) {
                    companionWidget = constraintWidget.getCompanionWidget();
                    if (!(companionWidget instanceof Measurable)) {
                        placeable = getPlaceables().get(companionWidget);
                        if (placeable == null) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(placeable.getWidth());
                        }
                        if (placeable == null) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = Integer.valueOf(placeable.getHeight());
                        }
                        if (placeable != null) {
                            int iWidth4 = interpolated.width();
                            if (numValueOf == null) {
                                getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                            } else {
                                int iHeight4 = interpolated.height();
                                if (numValueOf2 != null) {
                                    getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                                } else {
                                    getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                                }
                            }
                        } else {
                            getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                        }
                        getFrameCache().put(companionWidget, interpolated);
                    }
                }
                layoutInformationReceiver = getLayoutInformationReceiver();
                if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
                    computeLayoutResult();
                }
            }
        } else {
            this.motionProgress = progress;
            if (z || this.transition.isEmpty() || getFrameCache().isEmpty()) {
                this.transition.clear();
                resetMeasureState$compose_release();
                getState().reset();
                State state17 = getState();
                if (Constraints.m2933getHasFixedWidthimpl(constraints)) {
                    dimensionMin = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2935getMaxWidthimpl(constraints));
                } else {
                    dimensionMin = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2937getMinWidthimpl(constraints));
                }
                state17.width(dimensionMin);
                State state18 = getState();
                if (Constraints.m2932getHasFixedHeightimpl(constraints)) {
                    dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m2934getMaxHeightimpl(constraints));
                } else {
                    dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m2936getMinHeightimpl(constraints));
                }
                state18.height(dimensionMin2);
                getState().m3265setRootIncomingConstraintsBRTryo0(constraints);
                getState().setLayoutDirection(layoutDirection);
                m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetStart, measurables, constraints);
                this.transition.updateFrom(getRoot(), 0);
                m3261measureConstraintSethBUhpc(optimizationLevel, constraintSetEnd, measurables, constraints);
                this.transition.updateFrom(getRoot(), 1);
                if (transition != null) {
                    transition.applyTo(this.transition, 0);
                }
            }
            this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), progress);
            for (ConstraintWidget constraintWidget : getRoot().getChildren()) {
                companionWidget = constraintWidget.getCompanionWidget();
                if (!(companionWidget instanceof Measurable) && (interpolated = this.transition.getInterpolated(constraintWidget)) != null) {
                    placeable = getPlaceables().get(companionWidget);
                    if (placeable == null) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(placeable.getWidth());
                    }
                    if (placeable == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(placeable.getHeight());
                    }
                    if (placeable != null) {
                        int iWidth5 = interpolated.width();
                        if (numValueOf == null && numValueOf.intValue() == iWidth5) {
                            int iHeight5 = interpolated.height();
                            if (numValueOf2 != null || numValueOf2.intValue() != iHeight5) {
                                getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                            }
                        } else {
                            getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                        }
                    } else {
                        getPlaceables().put(companionWidget, ((Measurable) companionWidget).mo2468measureBRTryo0(Constraints.INSTANCE.m2943fixedJhjzzOo(interpolated.width(), interpolated.height())));
                    }
                    getFrameCache().put(companionWidget, interpolated);
                }
            }
            layoutInformationReceiver = getLayoutInformationReceiver();
            if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
                computeLayoutResult();
            }
        }
        return IntSizeKt.IntSize(getRoot().getWidth(), getRoot().getHeight());
    }
}
