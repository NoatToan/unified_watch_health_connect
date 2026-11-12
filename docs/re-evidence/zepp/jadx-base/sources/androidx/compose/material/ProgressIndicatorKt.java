package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.fota.fotaState.StageEnum;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.watch.companion.cloud.WebResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a;\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u0013\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0016\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a9\u0010#\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a9\u0010%\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\"\u001aA\u0010(\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\"\u0019\u0010)\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b)\u0010*\"\u0019\u0010+\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b+\u0010*\"\u0019\u0010,\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b,\u0010*\"\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010/\"\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010/\"\u0016\u00101\u001a\u00020-8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010/\"\u0016\u00102\u001a\u00020-8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010/\"\u0016\u00103\u001a\u00020-8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010/\"\u0016\u00104\u001a\u00020-8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010/\"\u0016\u00105\u001a\u00020-8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010/\"\u0016\u00106\u001a\u00020-8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010/\"\u0016\u00107\u001a\u00020-8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010/\"\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:\"\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:\"\u0016\u0010<\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010:\"\u0016\u0010=\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010:\"\u0016\u0010>\u001a\u00020-8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010/\"\u0016\u0010?\u001a\u00020-8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010/\"\u0016\u0010@\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010*\"\u0016\u0010A\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010*\"\u0016\u0010B\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010*\"\u0016\u0010C\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010*\"\u0016\u0010D\u001a\u00020-8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010/\"\u0016\u0010E\u001a\u00020-8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010/\"\u0016\u0010F\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010:\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"", "progress", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", b.H, "", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startFraction", "endFraction", "strokeWidth", "drawLinearIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJF)V", "drawLinearIndicator", "drawLinearIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JF)V", "drawLinearIndicatorBackground", "Landroidx/compose/ui/unit/Dp;", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "startAngle", "sweep", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "stroke", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawDeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawIndeterminateCircularIndicator", "LinearIndicatorHeight", "F", "LinearIndicatorWidth", "CircularIndicatorDiameter", "", "LinearAnimationDuration", LogUtil.I, "FirstLineHeadDuration", "FirstLineTailDuration", "SecondLineHeadDuration", "SecondLineTailDuration", "FirstLineHeadDelay", "FirstLineTailDelay", "SecondLineHeadDelay", "SecondLineTailDelay", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineHeadEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineTailEasing", "SecondLineHeadEasing", "SecondLineTailEasing", "RotationsPerCycle", "RotationDuration", "StartAngleOffset", "BaseRotationAngle", "JumpRotationAngle", "RotationAngleOffset", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "CircularEasing", "material_release"}, k = 2, mv = {1, 5, 1})
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final float StartAngleOffset = -90.0f;
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m752getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = Dp.m2965constructorimpl(240);
    private static final float CircularIndicatorDiameter = Dp.m2965constructorimpl(40);

    @NotNull
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);

    @NotNull
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    @NotNull
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);

    @NotNull
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);

    @NotNull
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    @Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    public static final void m753CircularProgressIndicatorMBs18nI(final float f, @Nullable Modifier modifier, long j, float f2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final long j2;
        final float f3;
        Modifier modifier3;
        long jM638getPrimary0d7_KjU;
        float fM752getStrokeWidthD9Ej5fM;
        Modifier modifier4;
        final long j3;
        float f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1769710219);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    int i5 = composerStartRestartGroup.changed(j2) ? 256 : 128;
                    i3 |= i5;
                } else {
                    j2 = j;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    f3 = f2;
                    int i6 = composerStartRestartGroup.changed(f3) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    f3 = f2;
                }
                i3 |= i6;
            } else {
                f3 = f2;
            }
            if (((i3 & 5851) ^ 1170) == 0 || !composerStartRestartGroup.getSkipping()) {
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                    } else {
                        jM638getPrimary0d7_KjU = j2;
                    }
                    if ((i2 & 8) != 0) {
                        fM752getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m752getStrokeWidthD9Ej5fM();
                    } else {
                        fM752getStrokeWidthD9Ej5fM = f3;
                    }
                    composerStartRestartGroup.endDefaults();
                    modifier4 = modifier3;
                    j3 = jM638getPrimary0d7_KjU;
                    f4 = fM752getStrokeWidthD9Ej5fM;
                } else {
                    composerStartRestartGroup.skipCurrentGroup();
                    modifier4 = modifier2;
                    j3 = j2;
                    f4 = f3;
                }
                final Stroke stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(f4), 0.0f, StrokeCap.INSTANCE.m1481getButtKaPHkGw(), 0, null, 26, null);
                CanvasKt.Canvas(FocusableKt.focusable$default(SizeKt.m322size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier4, f, null, 0, 6, null), CircularIndicatorDiameter), false, null, 3, null), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        ProgressIndicatorKt.m778drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, f * 360.0f, j3, stroke);
                    }
                }, composerStartRestartGroup, 0);
                modifier2 = modifier4;
                j2 = j3;
                f3 = f4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i7) {
                    ProgressIndicatorKt.m753CircularProgressIndicatorMBs18nI(f, modifier2, j2, f3, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (composerStartRestartGroup.changed(j2)) {
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i2 & 8) == 0) {
                f3 = f2;
                if (composerStartRestartGroup.changed(f3)) {
                }
                i3 |= i6;
            } else {
                f3 = f2;
            }
            i3 |= i6;
        } else {
            f3 = f2;
        }
        if (((i3 & 5851) ^ 1170) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                } else {
                    jM638getPrimary0d7_KjU = j2;
                }
                if ((i2 & 8) != 0) {
                    fM752getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m752getStrokeWidthD9Ej5fM();
                } else {
                    fM752getStrokeWidthD9Ej5fM = f3;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                j3 = jM638getPrimary0d7_KjU;
                f4 = fM752getStrokeWidthD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                } else {
                    jM638getPrimary0d7_KjU = j2;
                }
                if ((i2 & 8) != 0) {
                    fM752getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m752getStrokeWidthD9Ej5fM();
                } else {
                    fM752getStrokeWidthD9Ej5fM = f3;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                j3 = jM638getPrimary0d7_KjU;
                f4 = fM752getStrokeWidthD9Ej5fM;
            }
            final Stroke stroke2 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(f4), 0.0f, StrokeCap.INSTANCE.m1481getButtKaPHkGw(), 0, null, 26, null);
            CanvasKt.Canvas(FocusableKt.focusable$default(SizeKt.m322size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier4, f, null, 0, 6, null), CircularIndicatorDiameter), false, null, 3, null), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    ProgressIndicatorKt.m778drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, f * 360.0f, j3, stroke2);
                }
            }, composerStartRestartGroup, 0);
            modifier2 = modifier4;
            j2 = j3;
            f3 = f4;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                } else {
                    jM638getPrimary0d7_KjU = j2;
                }
                if ((i2 & 8) != 0) {
                    fM752getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m752getStrokeWidthD9Ej5fM();
                } else {
                    fM752getStrokeWidthD9Ej5fM = f3;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                j3 = jM638getPrimary0d7_KjU;
                f4 = fM752getStrokeWidthD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                } else {
                    jM638getPrimary0d7_KjU = j2;
                }
                if ((i2 & 8) != 0) {
                    fM752getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m752getStrokeWidthD9Ej5fM();
                } else {
                    fM752getStrokeWidthD9Ej5fM = f3;
                }
                composerStartRestartGroup.endDefaults();
                modifier4 = modifier3;
                j3 = jM638getPrimary0d7_KjU;
                f4 = fM752getStrokeWidthD9Ej5fM;
            }
            final Stroke stroke3 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(f4), 0.0f, StrokeCap.INSTANCE.m1481getButtKaPHkGw(), 0, null, 26, null);
            CanvasKt.Canvas(FocusableKt.focusable$default(SizeKt.m322size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier4, f, null, 0, 6, null), CircularIndicatorDiameter), false, null, 3, null), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    ProgressIndicatorKt.m778drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, f * 360.0f, j3, stroke3);
                }
            }, composerStartRestartGroup, 0);
            modifier2 = modifier4;
            j2 = j3;
            f3 = f4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i7) {
                ProgressIndicatorKt.m753CircularProgressIndicatorMBs18nI(f, modifier2, j2, f3, composer2, i | 1, i2);
            }
        });
    }

    @Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    public static final void m754CircularProgressIndicatoraMcp0Q(@Nullable Modifier modifier, long j, float f, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        float f2;
        final Modifier modifier3;
        long jM638getPrimary0d7_KjU;
        final float f3;
        final long j3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1769711483);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                int i5 = composerStartRestartGroup.changed(j2) ? 32 : 16;
                i3 |= i5;
            } else {
                j2 = j;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                f2 = f;
                int i6 = composerStartRestartGroup.changed(f2) ? 256 : 128;
                i3 |= i6;
            } else {
                f2 = f;
            }
            i3 |= i6;
        } else {
            f2 = f;
        }
        if (((i3 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j3 = j2;
        } else {
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.startDefaults();
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                jM638getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU() : j2;
                float fM752getStrokeWidthD9Ej5fM = (i2 & 4) != 0 ? ProgressIndicatorDefaults.INSTANCE.m752getStrokeWidthD9Ej5fM() : f2;
                composerStartRestartGroup.endDefaults();
                f3 = fM752getStrokeWidthD9Ej5fM;
            } else {
                composerStartRestartGroup.skipCurrentGroup();
                modifier3 = modifier2;
                jM638getPrimary0d7_KjU = j2;
                f3 = f2;
            }
            final Stroke stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo193toPx0680j_4(f3), 0.0f, StrokeCap.INSTANCE.m1483getSquareKaPHkGw(), 0, null, 26, null);
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(composerStartRestartGroup, 0);
            TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
            InfiniteRepeatableSpec infiniteRepeatableSpecInfiniteRepeatable$default = AnimationSpecKt.infiniteRepeatable$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 2, null);
            int i7 = InfiniteTransition.$stable;
            int i8 = InfiniteRepeatableSpec.$stable;
            final State stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition, 0, 5, vectorConverter, infiniteRepeatableSpecInfiniteRepeatable$default, composerStartRestartGroup, i7 | 4528 | (i8 << 12));
            final State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, BaseRotationAngle, AnimationSpecKt.infiniteRepeatable$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 2, null), composerStartRestartGroup, i7 | 432 | (i8 << 9));
            final State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.infiniteRepeatable$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1332);
                    keyframesSpecConfig.with(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                    keyframesSpecConfig.at(Float.valueOf(290.0f), WebResponse.CODE_LIKED);
                }
            }), null, 2, null), composerStartRestartGroup, i7 | 432 | (i8 << 9));
            final State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.infiniteRepeatable$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1332);
                    keyframesSpecConfig.with(keyframesSpecConfig.at(Float.valueOf(0.0f), WebResponse.CODE_LIKED), ProgressIndicatorKt.CircularEasing);
                    keyframesSpecConfig.at(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                }
            }), null, 2, null), composerStartRestartGroup, i7 | 432 | (i8 << 9));
            f2 = f3;
            final long j4 = jM638getPrimary0d7_KjU;
            CanvasKt.Canvas(FocusableKt.focusable$default(SizeKt.m322size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), false, null, 3, null), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    ProgressIndicatorKt.m779drawIndeterminateCircularIndicatorhrjfTZI(drawScope, ProgressIndicatorKt.m756CircularProgressIndicator_aM_cp0Q$lambda11(stateAnimateFloat3) + (((ProgressIndicatorKt.m757CircularProgressIndicator_aM_cp0Q$lambda8(stateAnimateValue) * 216.0f) % 360.0f) - 90.0f) + ProgressIndicatorKt.m758CircularProgressIndicator_aM_cp0Q$lambda9(stateAnimateFloat), f3, Math.abs(ProgressIndicatorKt.m755CircularProgressIndicator_aM_cp0Q$lambda10(stateAnimateFloat2) - ProgressIndicatorKt.m756CircularProgressIndicator_aM_cp0Q$lambda11(stateAnimateFloat3)), j4, stroke);
                }
            }, composerStartRestartGroup, 0);
            j3 = jM638getPrimary0d7_KjU;
        }
        final float f4 = f2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i9) {
                ProgressIndicatorKt.m754CircularProgressIndicatoraMcp0Q(modifier3, j3, f4, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: CircularProgressIndicator_aM_cp0Q$lambda-10, reason: not valid java name */
    public static final float m755CircularProgressIndicator_aM_cp0Q$lambda10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: CircularProgressIndicator_aM_cp0Q$lambda-11, reason: not valid java name */
    public static final float m756CircularProgressIndicator_aM_cp0Q$lambda11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: CircularProgressIndicator_aM_cp0Q$lambda-8, reason: not valid java name */
    public static final int m757CircularProgressIndicator_aM_cp0Q$lambda8(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: CircularProgressIndicator_aM_cp0Q$lambda-9, reason: not valid java name */
    public static final float m758CircularProgressIndicator_aM_cp0Q$lambda9(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final void m759LinearProgressIndicatorRIQooxk(@Nullable Modifier modifier, long j, long j2, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long jM1211copywmQWz5c$default;
        final Modifier modifier3;
        long jM638getPrimary0d7_KjU;
        final long j4;
        Composer composerStartRestartGroup = composer.startRestartGroup(96019871);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                int i5 = composerStartRestartGroup.changed(j3) ? 32 : 16;
                i3 |= i5;
            } else {
                j3 = j;
            }
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                jM1211copywmQWz5c$default = j2;
                int i6 = composerStartRestartGroup.changed(jM1211copywmQWz5c$default) ? 256 : 128;
                i3 |= i6;
            } else {
                jM1211copywmQWz5c$default = j2;
            }
            i3 |= i6;
        } else {
            jM1211copywmQWz5c$default = j2;
        }
        if (((i3 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j4 = j3;
        } else {
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.startDefaults();
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                jM638getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU() : j3;
                if ((i2 & 4) != 0) {
                    jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(jM638getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.skipCurrentGroup();
                modifier3 = modifier2;
                jM638getPrimary0d7_KjU = j3;
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(composerStartRestartGroup, 0);
            InfiniteRepeatableSpec infiniteRepeatableSpecInfiniteRepeatable$default = AnimationSpecKt.infiniteRepeatable$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.with(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 750);
                }
            }), null, 2, null);
            int i7 = InfiniteTransition.$stable;
            int i8 = InfiniteRepeatableSpec.$stable;
            final State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, infiniteRepeatableSpecInfiniteRepeatable$default, composerStartRestartGroup, i7 | 432 | (i8 << 9));
            final State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.infiniteRepeatable$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.with(keyframesSpecConfig.at(Float.valueOf(0.0f), AMapEngineUtils.ARROW_LINE_SHADOW_TEXTURE_ID), ProgressIndicatorKt.FirstLineTailEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 1183);
                }
            }), null, 2, null), composerStartRestartGroup, i7 | 432 | (i8 << 9));
            final State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.infiniteRepeatable$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.with(keyframesSpecConfig.at(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 1567);
                }
            }), null, 2, null), composerStartRestartGroup, i7 | 432 | (i8 << 9));
            final State<Float> stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.infiniteRepeatable$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.with(keyframesSpecConfig.at(Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 1800);
                }
            }), null, 2, null), composerStartRestartGroup, i7 | 432 | (i8 << 9));
            Modifier modifierFocusable$default = FocusableKt.focusable$default(SizeKt.m323sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier3), LinearIndicatorWidth, LinearIndicatorHeight), false, null, 3, null);
            Object[] objArr = {Color.m1202boximpl(jM1211copywmQWz5c$default), stateAnimateFloat, stateAnimateFloat2, Color.m1202boximpl(jM638getPrimary0d7_KjU), stateAnimateFloat3, stateAnimateFloat4};
            composerStartRestartGroup.startReplaceableGroup(-3685570);
            boolean zChanged = false;
            int i9 = 0;
            while (i9 < 6) {
                Object obj = objArr[i9];
                i9++;
                zChanged |= composerStartRestartGroup.changed(obj);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final long j5 = jM1211copywmQWz5c$default;
                final long j6 = jM638getPrimary0d7_KjU;
                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        float fM1049getHeightimpl = Size.m1049getHeightimpl(drawScope.mo1585getSizeNHjbRc());
                        ProgressIndicatorKt.m781drawLinearIndicatorBackgroundbw27NRU(drawScope, j5, fM1049getHeightimpl);
                        if (ProgressIndicatorKt.m761LinearProgressIndicator_RIQooxk$lambda1(stateAnimateFloat) - ProgressIndicatorKt.m762LinearProgressIndicator_RIQooxk$lambda2(stateAnimateFloat2) > 0.0f) {
                            ProgressIndicatorKt.m780drawLinearIndicator42QJj7c(drawScope, ProgressIndicatorKt.m761LinearProgressIndicator_RIQooxk$lambda1(stateAnimateFloat), ProgressIndicatorKt.m762LinearProgressIndicator_RIQooxk$lambda2(stateAnimateFloat2), j6, fM1049getHeightimpl);
                        }
                        if (ProgressIndicatorKt.m763LinearProgressIndicator_RIQooxk$lambda3(stateAnimateFloat3) - ProgressIndicatorKt.m764LinearProgressIndicator_RIQooxk$lambda4(stateAnimateFloat4) > 0.0f) {
                            ProgressIndicatorKt.m780drawLinearIndicator42QJj7c(drawScope, ProgressIndicatorKt.m763LinearProgressIndicator_RIQooxk$lambda3(stateAnimateFloat3), ProgressIndicatorKt.m764LinearProgressIndicator_RIQooxk$lambda4(stateAnimateFloat4), j6, fM1049getHeightimpl);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierFocusable$default, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            j4 = jM638getPrimary0d7_KjU;
        }
        final long j7 = jM1211copywmQWz5c$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i10) {
                ProgressIndicatorKt.m759LinearProgressIndicatorRIQooxk(modifier3, j4, j7, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x011b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0123  */
    /* JADX WARN: Code duplicated, block: B:80:0x0144  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    public static final void m760LinearProgressIndicatoreaDK9VM(final float f, @Nullable Modifier modifier, long j, long j2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long jM1211copywmQWz5c$default;
        final Modifier modifier3;
        final long jM638getPrimary0d7_KjU;
        boolean zChanged;
        Object objRememberedValue;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(96018610);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    int i5 = composerStartRestartGroup.changed(j3) ? 256 : 128;
                    i3 |= i5;
                } else {
                    j3 = j;
                }
                i3 |= i5;
            } else {
                j3 = j;
            }
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if ((i2 & 8) == 0) {
                    jM1211copywmQWz5c$default = j2;
                    int i6 = composerStartRestartGroup.changed(jM1211copywmQWz5c$default) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    jM1211copywmQWz5c$default = j2;
                }
                i3 |= i6;
            } else {
                jM1211copywmQWz5c$default = j2;
            }
            if (((i3 & 5851) ^ 1170) == 0 || !composerStartRestartGroup.getSkipping()) {
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.startDefaults();
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                    } else {
                        jM638getPrimary0d7_KjU = j3;
                    }
                    if ((i2 & 8) != 0) {
                        jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(jM638getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.skipCurrentGroup();
                    modifier3 = modifier2;
                    jM638getPrimary0d7_KjU = j3;
                }
                Modifier modifierFocusable$default = FocusableKt.focusable$default(SizeKt.m323sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier3, f, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight), false, null, 3, null);
                Color colorM1202boximpl = Color.m1202boximpl(jM1211copywmQWz5c$default);
                Float fValueOf = Float.valueOf(f);
                Color colorM1202boximpl2 = Color.m1202boximpl(jM638getPrimary0d7_KjU);
                composerStartRestartGroup.startReplaceableGroup(-3686095);
                zChanged = composerStartRestartGroup.changed(colorM1202boximpl) | composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(colorM1202boximpl2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final long j5 = jM1211copywmQWz5c$default;
                    final long j6 = jM638getPrimary0d7_KjU;
                    objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            float fM1049getHeightimpl = Size.m1049getHeightimpl(drawScope.mo1585getSizeNHjbRc());
                            ProgressIndicatorKt.m781drawLinearIndicatorBackgroundbw27NRU(drawScope, j5, fM1049getHeightimpl);
                            ProgressIndicatorKt.m780drawLinearIndicator42QJj7c(drawScope, 0.0f, f, j6, fM1049getHeightimpl);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierFocusable$default, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                jM638getPrimary0d7_KjU = j3;
            }
            j4 = jM1211copywmQWz5c$default;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i7) {
                    ProgressIndicatorKt.m760LinearProgressIndicatoreaDK9VM(f, modifier3, jM638getPrimary0d7_KjU, j4, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j;
                if (composerStartRestartGroup.changed(j3)) {
                }
                i3 |= i5;
            } else {
                j3 = j;
            }
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if ((i2 & 8) == 0) {
                jM1211copywmQWz5c$default = j2;
                if (composerStartRestartGroup.changed(jM1211copywmQWz5c$default)) {
                }
                i3 |= i6;
            } else {
                jM1211copywmQWz5c$default = j2;
            }
            i3 |= i6;
        } else {
            jM1211copywmQWz5c$default = j2;
        }
        if (((i3 & 5851) ^ 1170) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                } else {
                    jM638getPrimary0d7_KjU = j3;
                }
                if ((i2 & 8) != 0) {
                    jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(jM638getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                } else {
                    jM638getPrimary0d7_KjU = j3;
                }
                if ((i2 & 8) != 0) {
                    jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(jM638getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                composerStartRestartGroup.endDefaults();
            }
            Modifier modifierFocusable$default2 = FocusableKt.focusable$default(SizeKt.m323sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier3, f, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight), false, null, 3, null);
            Color colorM1202boximpl3 = Color.m1202boximpl(jM1211copywmQWz5c$default);
            Float fValueOf2 = Float.valueOf(f);
            Color colorM1202boximpl4 = Color.m1202boximpl(jM638getPrimary0d7_KjU);
            composerStartRestartGroup.startReplaceableGroup(-3686095);
            zChanged = composerStartRestartGroup.changed(colorM1202boximpl3) | composerStartRestartGroup.changed(fValueOf2) | composerStartRestartGroup.changed(colorM1202boximpl4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                final long j7 = jM1211copywmQWz5c$default;
                final long j8 = jM638getPrimary0d7_KjU;
                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        float fM1049getHeightimpl = Size.m1049getHeightimpl(drawScope.mo1585getSizeNHjbRc());
                        ProgressIndicatorKt.m781drawLinearIndicatorBackgroundbw27NRU(drawScope, j7, fM1049getHeightimpl);
                        ProgressIndicatorKt.m780drawLinearIndicator42QJj7c(drawScope, 0.0f, f, j8, fM1049getHeightimpl);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                final long j9 = jM1211copywmQWz5c$default;
                final long j10 = jM638getPrimary0d7_KjU;
                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        float fM1049getHeightimpl = Size.m1049getHeightimpl(drawScope.mo1585getSizeNHjbRc());
                        ProgressIndicatorKt.m781drawLinearIndicatorBackgroundbw27NRU(drawScope, j9, fM1049getHeightimpl);
                        ProgressIndicatorKt.m780drawLinearIndicator42QJj7c(drawScope, 0.0f, f, j10, fM1049getHeightimpl);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierFocusable$default2, (Function1) objRememberedValue, composerStartRestartGroup, 0);
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                } else {
                    jM638getPrimary0d7_KjU = j3;
                }
                if ((i2 & 8) != 0) {
                    jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(jM638getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.startDefaults();
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 4) != 0) {
                    jM638getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 0).m638getPrimary0d7_KjU();
                } else {
                    jM638getPrimary0d7_KjU = j3;
                }
                if ((i2 & 8) != 0) {
                    jM1211copywmQWz5c$default = Color.m1211copywmQWz5c$default(jM638getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                composerStartRestartGroup.endDefaults();
            }
            Modifier modifierFocusable$default3 = FocusableKt.focusable$default(SizeKt.m323sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier3, f, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight), false, null, 3, null);
            Color colorM1202boximpl5 = Color.m1202boximpl(jM1211copywmQWz5c$default);
            Float fValueOf3 = Float.valueOf(f);
            Color colorM1202boximpl6 = Color.m1202boximpl(jM638getPrimary0d7_KjU);
            composerStartRestartGroup.startReplaceableGroup(-3686095);
            zChanged = composerStartRestartGroup.changed(colorM1202boximpl5) | composerStartRestartGroup.changed(fValueOf3) | composerStartRestartGroup.changed(colorM1202boximpl6);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                final long j11 = jM1211copywmQWz5c$default;
                final long j12 = jM638getPrimary0d7_KjU;
                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        float fM1049getHeightimpl = Size.m1049getHeightimpl(drawScope.mo1585getSizeNHjbRc());
                        ProgressIndicatorKt.m781drawLinearIndicatorBackgroundbw27NRU(drawScope, j11, fM1049getHeightimpl);
                        ProgressIndicatorKt.m780drawLinearIndicator42QJj7c(drawScope, 0.0f, f, j12, fM1049getHeightimpl);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                final long j13 = jM1211copywmQWz5c$default;
                final long j14 = jM638getPrimary0d7_KjU;
                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        float fM1049getHeightimpl = Size.m1049getHeightimpl(drawScope.mo1585getSizeNHjbRc());
                        ProgressIndicatorKt.m781drawLinearIndicatorBackgroundbw27NRU(drawScope, j13, fM1049getHeightimpl);
                        ProgressIndicatorKt.m780drawLinearIndicator42QJj7c(drawScope, 0.0f, f, j14, fM1049getHeightimpl);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierFocusable$default3, (Function1) objRememberedValue, composerStartRestartGroup, 0);
        }
        j4 = jM1211copywmQWz5c$default;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i7) {
                ProgressIndicatorKt.m760LinearProgressIndicatoreaDK9VM(f, modifier3, jM638getPrimary0d7_KjU, j4, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: LinearProgressIndicator_RIQooxk$lambda-1, reason: not valid java name */
    public static final float m761LinearProgressIndicator_RIQooxk$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: LinearProgressIndicator_RIQooxk$lambda-2, reason: not valid java name */
    public static final float m762LinearProgressIndicator_RIQooxk$lambda2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: LinearProgressIndicator_RIQooxk$lambda-3, reason: not valid java name */
    public static final float m763LinearProgressIndicator_RIQooxk$lambda3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: LinearProgressIndicator_RIQooxk$lambda-4, reason: not valid java name */
    public static final float m764LinearProgressIndicator_RIQooxk$lambda4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m777drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float fM1052getWidthimpl = Size.m1052getWidthimpl(drawScope.mo1585getSizeNHjbRc()) - (f3 * width);
        DrawScope.DefaultImpls.m1614drawArcyD3GUKo$default(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(fM1052getWidthimpl, fM1052getWidthimpl), 0.0f, stroke, null, 0, StageEnum.APP_TWS_RESULT_FOTA_NV_SUCCESS, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m778drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m777drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m779drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m777drawCircularIndicator42QJj7c(drawScope, f + (((f2 / Dp.m2965constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawLinearIndicator-42QJj7c, reason: not valid java name */
    public static final void m780drawLinearIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, float f3) {
        float fM1052getWidthimpl = Size.m1052getWidthimpl(drawScope.mo1585getSizeNHjbRc());
        float fM1049getHeightimpl = Size.m1049getHeightimpl(drawScope.mo1585getSizeNHjbRc()) / 2;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        DrawScope.DefaultImpls.m1620drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset((z ? f : 1.0f - f2) * fM1052getWidthimpl, fM1049getHeightimpl), OffsetKt.Offset((z ? f2 : 1.0f - f) * fM1052getWidthimpl, fM1049getHeightimpl), f3, 0, null, 0.0f, null, 0, 496, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawLinearIndicatorBackground-bw27NRU, reason: not valid java name */
    public static final void m781drawLinearIndicatorBackgroundbw27NRU(DrawScope drawScope, long j, float f) {
        m780drawLinearIndicator42QJj7c(drawScope, 0.0f, 1.0f, j, f);
    }
}
