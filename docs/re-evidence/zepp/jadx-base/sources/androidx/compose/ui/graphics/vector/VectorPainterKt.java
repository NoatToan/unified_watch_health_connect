package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0094\u0001\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2;\u0010\u0010\u001a7\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0014\u0010\u0017\u001a-\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\"\u0016\u0010\u001f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "", "name", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "Landroidx/compose/runtime/Composable;", "content", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter-mlNsNFs", "(FFFFLjava/lang/String;JILkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "image", "(Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "group", "", "Landroidx/compose/ui/graphics/vector/VectorOverride;", "overrides", "RenderVectorGroup", "(Landroidx/compose/ui/graphics/vector/VectorGroup;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "RootGroupName", "Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class VectorPainterKt {

    @NotNull
    public static final String RootGroupName = "VectorRootGroup";

    @Composable
    public static final void RenderVectorGroup(@NotNull final VectorGroup vectorGroup, @Nullable Map<String, ? extends VectorOverride> map, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Map<String, ? extends VectorOverride> map2;
        final Map<String, ? extends VectorOverride> map3;
        final Map<String, ? extends VectorOverride> map4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-326287540);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(vectorGroup) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 16;
        }
        if ((2 & (~i2)) == 0 && ((i3 & 91) ^ 18) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            map3 = map;
        } else {
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.startDefaults();
                Map<String, ? extends VectorOverride> mapEmptyMap = i4 != 0 ? r.emptyMap() : map;
                composerStartRestartGroup.endDefaults();
                map2 = mapEmptyMap;
            } else {
                composerStartRestartGroup.skipCurrentGroup();
                map2 = map;
            }
            for (final VectorNode vectorNode : vectorGroup) {
                if (vectorNode instanceof VectorPath) {
                    composerStartRestartGroup.startReplaceableGroup(-326287363);
                    VectorPath vectorPath = (VectorPath) vectorNode;
                    VectorOverride vectorOverride = map2.get(vectorPath.getName());
                    if (vectorOverride == null) {
                        vectorOverride = DefaultVectorOverride.INSTANCE;
                    }
                    VectorOverride vectorOverride2 = vectorOverride;
                    map4 = map2;
                    VectorComposeKt.m1704Path9cdaXJ4(vectorOverride2.obtainPathData(vectorPath.getPathData()), vectorPath.getPathFillType(), vectorPath.getName(), vectorOverride2.obtainFill(vectorPath.getFill()), vectorOverride2.obtainFillAlpha(vectorPath.getFillAlpha()), vectorOverride2.obtainStroke(vectorPath.getStroke()), vectorOverride2.obtainStrokeAlpha(vectorPath.getStrokeAlpha()), vectorOverride2.obtainStrokeWidth(vectorPath.getStrokeLineWidth()), vectorPath.getStrokeLineCap(), vectorPath.getStrokeLineJoin(), vectorPath.getStrokeLineMiter(), vectorOverride2.obtainTrimPathStart(vectorPath.getTrimPathStart()), vectorOverride2.obtainTrimPathEnd(vectorPath.getTrimPathEnd()), vectorOverride2.obtainTrimPathOffset(vectorPath.getTrimPathOffset()), composerStartRestartGroup, 8, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    map4 = map2;
                    if (vectorNode instanceof VectorGroup) {
                        composerStartRestartGroup.startReplaceableGroup(-326286219);
                        VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                        VectorOverride vectorOverride3 = map4.get(vectorGroup2.getName());
                        if (vectorOverride3 == null) {
                            vectorOverride3 = DefaultVectorOverride.INSTANCE;
                        }
                        VectorComposeKt.Group(vectorGroup2.getName(), vectorOverride3.obtainRotation(vectorGroup2.getRotation()), vectorOverride3.obtainPivotX(vectorGroup2.getPivotX()), vectorOverride3.obtainPivotY(vectorGroup2.getPivotY()), vectorOverride3.obtainScaleX(vectorGroup2.getScaleX()), vectorOverride3.obtainScaleY(vectorGroup2.getScaleY()), vectorOverride3.obtainTranslateX(vectorGroup2.getTranslationX()), vectorOverride3.obtainTranslateY(vectorGroup2.getTranslationY()), vectorOverride3.obtainPathData(vectorGroup2.getClipPathData()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819898735, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt.RenderVectorGroup.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i5) {
                                if (((i5 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    VectorPainterKt.RenderVectorGroup((VectorGroup) vectorNode, map4, composer2, 64, 0);
                                }
                            }
                        }), composerStartRestartGroup, 939524096, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-326285376);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                map2 = map4;
            }
            map3 = map2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt.RenderVectorGroup.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i5) {
                VectorPainterKt.RenderVectorGroup(vectorGroup, map3, composer2, i | 1, i2);
            }
        });
    }

    @Composable
    @NotNull
    public static final VectorPainter rememberVectorPainter(@NotNull final ImageVector imageVector, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1998939043);
        VectorPainter vectorPainterM1710rememberVectorPaintermlNsNFs = m1710rememberVectorPaintermlNsNFs(imageVector.getDefaultWidth(), imageVector.getDefaultHeight(), imageVector.getViewportWidth(), imageVector.getViewportHeight(), imageVector.getName(), imageVector.getTintColor(), imageVector.getTintBlendMode(), ComposableLambdaKt.composableLambda(composer, -819890981, true, new Function4<Float, Float, Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt.rememberVectorPainter.2
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2, Composer composer2, Integer num) {
                invoke(f.floatValue(), f2.floatValue(), composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(float f, float f2, @Nullable Composer composer2, int i2) {
                if (((i2 & 11) ^ 2) == 0 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    VectorPainterKt.RenderVectorGroup(imageVector.getRoot(), null, composer2, 0, 2);
                }
            }
        }), composer, 12582912, 0);
        composer.endReplaceableGroup();
        return vectorPainterM1710rememberVectorPaintermlNsNFs;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final VectorPainter m1710rememberVectorPaintermlNsNFs(float f, float f2, float f3, float f4, @Nullable String str, long j, int i, @NotNull Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> function4, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1998940692);
        float f5 = (i3 & 4) != 0 ? Float.NaN : f3;
        float f6 = (i3 & 8) == 0 ? f4 : Float.NaN;
        String str2 = (i3 & 16) != 0 ? RootGroupName : str;
        final long jM1248getUnspecified0d7_KjU = (i3 & 32) != 0 ? Color.INSTANCE.m1248getUnspecified0d7_KjU() : j;
        final int iM1161getSrcIn0nO6VwU = (i3 & 64) != 0 ? BlendMode.INSTANCE.m1161getSrcIn0nO6VwU() : i;
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float fMo193toPx0680j_4 = density.mo193toPx0680j_4(f);
        float fMo193toPx0680j_5 = density.mo193toPx0680j_4(f2);
        if (Float.isNaN(f5)) {
            f5 = fMo193toPx0680j_4;
        }
        if (Float.isNaN(f6)) {
            f6 = fMo193toPx0680j_5;
        }
        composer.startReplaceableGroup(-1998939971);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new VectorPainter();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final VectorPainter vectorPainter = (VectorPainter) objRememberedValue;
        vectorPainter.m1709setSizeuvyYCjk$ui_release(SizeKt.Size(fMo193toPx0680j_4, fMo193toPx0680j_5));
        int i4 = i2 >> 12;
        vectorPainter.RenderVector$ui_release(str2, f5, f6, function4, composer, 32768 | (i4 & 14) | (i4 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY));
        composer.endReplaceableGroup();
        EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt.rememberVectorPainter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                vectorPainter.setIntrinsicColorFilter$ui_release(!Color.m1213equalsimpl0(jM1248getUnspecified0d7_KjU, Color.INSTANCE.m1248getUnspecified0d7_KjU()) ? ColorFilter.INSTANCE.m1256tintxETnrds(jM1248getUnspecified0d7_KjU, iM1161getSrcIn0nO6VwU) : null);
            }
        }, composer, 0);
        composer.endReplaceableGroup();
        return vectorPainter;
    }
}
