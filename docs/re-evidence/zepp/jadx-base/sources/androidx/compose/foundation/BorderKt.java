package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a1\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0012\u0010\u0011\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u001a\f\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002\u001a:\u0010\u001c\u001a\u00020\u0013*\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u001aW\u0010$\u001a\u00020\u0013*\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001aA\u0010(\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a(\u0010-\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u001a\u0018\u0010/\u001a\u00020+2\u0006\u0010.\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+H\u0002\u001a!\u00104\u001a\u000200*\u0002002\u0006\u00101\u001a\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "Landroidx/compose/ui/graphics/Color;", "color", "border-xT4_qwU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/Brush;", "brush", "border-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/node/Ref;", "Landroidx/compose/foundation/BorderCache;", "obtain", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "drawContentWithoutBorder", "borderCacheRef", "Landroidx/compose/ui/graphics/Outline$Generic;", "outline", "", "fillArea", "", "strokeWidth", "drawGenericBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "borderSize", "drawRoundRectBorder-SYlcjDY", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "drawRoundRectBorder", "strokeWidthPx", "drawRectBorder-NsqcLGU", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;", "drawRectBorder", "Landroidx/compose/ui/graphics/Path;", "targetPath", "Landroidx/compose/ui/geometry/RoundRect;", "roundedRect", "createRoundRectPath", "widthPx", "createInsetRoundedRect", "Landroidx/compose/ui/geometry/CornerRadius;", "value", "shrink-Kibmq7A", "(JF)J", "shrink", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class BorderKt {
    @NotNull
    public static final Modifier border(@NotNull Modifier modifier, @NotNull BorderStroke borderStroke, @NotNull Shape shape) {
        return m118borderziNgDLE(modifier, borderStroke.getWidth(), borderStroke.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i, Object obj) {
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    @NotNull
    /* JADX INFO: renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m116borderxT4_qwU(@NotNull Modifier modifier, float f, long j, @NotNull Shape shape) {
        return m118borderziNgDLE(modifier, f, new SolidColor(j, null), shape);
    }

    /* JADX INFO: renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m117borderxT4_qwU$default(Modifier modifier, float f, long j, Shape shape, int i, Object obj) {
        if ((i & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m116borderxT4_qwU(modifier, f, j, shape);
    }

    @NotNull
    /* JADX INFO: renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m118borderziNgDLE(@NotNull Modifier modifier, final float f, @NotNull final Brush brush, @NotNull final Shape shape) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.BorderKt$border-ziNgDLE$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("border");
                inspectorInfo.getProperties().set(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, Dp.m2963boximpl(f));
                if (brush instanceof SolidColor) {
                    inspectorInfo.getProperties().set("color", Color.m1202boximpl(((SolidColor) brush).getValue()));
                    inspectorInfo.setValue(Color.m1202boximpl(((SolidColor) brush).getValue()));
                } else {
                    inspectorInfo.getProperties().set("brush", brush);
                }
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.BorderKt.border.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                composer.startReplaceableGroup(1369505880);
                composer.startReplaceableGroup(-3687241);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Ref();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final Ref ref = (Ref) objRememberedValue;
                Modifier.Companion companion = Modifier.INSTANCE;
                final float f2 = f;
                final Shape shape2 = shape;
                final Brush brush2 = brush;
                Modifier modifierThen = modifier2.then(DrawModifierKt.drawWithCache(companion, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderKt.border.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DrawResult invoke(@NotNull CacheDrawScope cacheDrawScope) {
                        if (!(cacheDrawScope.mo193toPx0680j_4(f2) >= 0.0f && Size.m1051getMinDimensionimpl(cacheDrawScope.m917getSizeNHjbRc()) > 0.0f)) {
                            return BorderKt.drawContentWithoutBorder(cacheDrawScope);
                        }
                        float f3 = 2;
                        float fMin = Math.min(Dp.m2970equalsimpl0(f2, Dp.INSTANCE.m2983getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo193toPx0680j_4(f2)), (float) Math.ceil(Size.m1051getMinDimensionimpl(cacheDrawScope.m917getSizeNHjbRc()) / f3));
                        float f4 = fMin / f3;
                        long jOffset = OffsetKt.Offset(f4, f4);
                        long jSize = SizeKt.Size(Size.m1052getWidthimpl(cacheDrawScope.m917getSizeNHjbRc()) - fMin, Size.m1049getHeightimpl(cacheDrawScope.m917getSizeNHjbRc()) - fMin);
                        boolean z = f3 * fMin > Size.m1051getMinDimensionimpl(cacheDrawScope.m917getSizeNHjbRc());
                        Outline outlineMo147createOutlinePq9zytI = shape2.mo147createOutlinePq9zytI(cacheDrawScope.m917getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                        if (outlineMo147createOutlinePq9zytI instanceof Outline.Generic) {
                            return BorderKt.drawGenericBorder(cacheDrawScope, ref, brush2, (Outline.Generic) outlineMo147createOutlinePq9zytI, z, fMin);
                        }
                        if (outlineMo147createOutlinePq9zytI instanceof Outline.Rounded) {
                            return BorderKt.m120drawRoundRectBorderSYlcjDY(cacheDrawScope, ref, brush2, (Outline.Rounded) outlineMo147createOutlinePq9zytI, jOffset, jSize, z, fMin);
                        }
                        if (outlineMo147createOutlinePq9zytI instanceof Outline.Rectangle) {
                            return BorderKt.m119drawRectBorderNsqcLGU(cacheDrawScope, brush2, jOffset, jSize, z, fMin);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }));
                composer.endReplaceableGroup();
                return modifierThen;
            }
        });
    }

    private static final RoundRect createInsetRoundedRect(float f, RoundRect roundRect) {
        return new RoundRect(f, f, roundRect.getWidth() - f, roundRect.getHeight() - f, m121shrinkKibmq7A(roundRect.m1033getTopLeftCornerRadiuskKHJgLs(), f), m121shrinkKibmq7A(roundRect.m1034getTopRightCornerRadiuskKHJgLs(), f), m121shrinkKibmq7A(roundRect.m1032getBottomRightCornerRadiuskKHJgLs(), f), m121shrinkKibmq7A(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    private static final Path createRoundRectPath(Path path, RoundRect roundRect, float f, boolean z) {
        path.reset();
        path.addRoundRect(roundRect);
        if (!z) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect(createInsetRoundedRect(f, roundRect));
            path.mo1117opN5in7k0(path, Path, PathOperation.INSTANCE.m1433getDifferenceb3I0S0c());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt.drawContentWithoutBorder.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /* JADX WARN: Type inference failed for: r11v5 */
    public static final DrawResult drawGenericBorder(CacheDrawScope cacheDrawScope, Ref<BorderCache> ref, final Brush brush, final Outline.Generic generic, boolean z, float f) {
        int iM1368getArgb8888_sVssgQ;
        ColorFilter colorFilterM1253tintxETnrds$default;
        boolean z2;
        ?? r11;
        Canvas canvas;
        if (z) {
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt.drawGenericBorder.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                    contentDrawScope.drawContent();
                    DrawScope.DefaultImpls.m1623drawPathGBMwjPU$default(contentDrawScope, generic.getPath(), brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        if (brush instanceof SolidColor) {
            iM1368getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m1367getAlpha8_sVssgQ();
            colorFilterM1253tintxETnrds$default = ColorFilter.Companion.m1253tintxETnrds$default(ColorFilter.INSTANCE, ((SolidColor) brush).getValue(), 0, 2, null);
        } else {
            iM1368getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m1368getArgb8888_sVssgQ();
            colorFilterM1253tintxETnrds$default = null;
        }
        final Rect bounds = generic.getPath().getBounds();
        BorderCache borderCacheObtain = obtain(ref);
        Path pathObtainPath = borderCacheObtain.obtainPath();
        pathObtainPath.reset();
        pathObtainPath.addRect(bounds);
        pathObtainPath.mo1117opN5in7k0(pathObtainPath, generic.getPath(), PathOperation.INSTANCE.m1433getDifferenceb3I0S0c());
        Unit unit = Unit.INSTANCE;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        final long jIntSize = IntSizeKt.IntSize((int) Math.ceil(bounds.getWidth()), (int) Math.ceil(bounds.getHeight()));
        ImageBitmap imageBitmap = borderCacheObtain.imageBitmap;
        Canvas canvas2 = borderCacheObtain.canvas;
        ImageBitmapConfig imageBitmapConfigM1360boximpl = imageBitmap == null ? null : ImageBitmapConfig.m1360boximpl(imageBitmap.mo1092getConfig_sVssgQ());
        if (!(imageBitmapConfigM1360boximpl == null ? false : ImageBitmapConfig.m1363equalsimpl0(imageBitmapConfigM1360boximpl.m1366unboximpl(), ImageBitmapConfig.INSTANCE.m1368getArgb8888_sVssgQ()))) {
            z2 = ImageBitmapConfig.m1362equalsimpl(iM1368getArgb8888_sVssgQ, imageBitmap != null ? ImageBitmapConfig.m1360boximpl(imageBitmap.mo1092getConfig_sVssgQ()) : null);
        }
        if (imageBitmap == null || canvas2 == null || Size.m1052getWidthimpl(cacheDrawScope.m917getSizeNHjbRc()) > imageBitmap.getWidth() || Size.m1049getHeightimpl(cacheDrawScope.m917getSizeNHjbRc()) > imageBitmap.getHeight() || !z2) {
            ImageBitmap imageBitmapM1373ImageBitmapx__hDU$default = ImageBitmapKt.m1373ImageBitmapx__hDU$default(IntSize.m3085getWidthimpl(jIntSize), IntSize.m3084getHeightimpl(jIntSize), iM1368getArgb8888_sVssgQ, false, null, 24, null);
            borderCacheObtain.imageBitmap = imageBitmapM1373ImageBitmapx__hDU$default;
            Canvas Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmapM1373ImageBitmapx__hDU$default);
            borderCacheObtain.canvas = Canvas;
            r11 = imageBitmapM1373ImageBitmapx__hDU$default;
            canvas = Canvas;
        } else {
            r11 = imageBitmap;
            canvas = canvas2;
        }
        CanvasDrawScope canvasDrawScope = borderCacheObtain.canvasDrawScope;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            borderCacheObtain.canvasDrawScope = canvasDrawScope;
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        long jM3095toSizeozmzZPI = IntSizeKt.m3095toSizeozmzZPI(jIntSize);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas3 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m1590setSizeuvyYCjk(jM3095toSizeozmzZPI);
        canvas.save();
        long jM1238getBlack0d7_KjU = Color.INSTANCE.m1238getBlack0d7_KjU();
        BlendMode.Companion companion = BlendMode.INSTANCE;
        DrawScope.DefaultImpls.m1628drawRectnJ9OG0$default(canvasDrawScope2, jM1238getBlack0d7_KjU, 0L, jM3095toSizeozmzZPI, 0.0f, null, null, companion.m1136getClear0nO6VwU(), 58, null);
        float f2 = -bounds.getLeft();
        float f3 = -bounds.getTop();
        canvasDrawScope2.getDrawContext().getTransform().translate(f2, f3);
        DrawScope.DefaultImpls.m1623drawPathGBMwjPU$default(canvasDrawScope2, generic.getPath(), brush, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        float f4 = 1;
        float fM1052getWidthimpl = (Size.m1052getWidthimpl(canvasDrawScope2.mo1585getSizeNHjbRc()) + f4) / Size.m1052getWidthimpl(canvasDrawScope2.mo1585getSizeNHjbRc());
        float fM1049getHeightimpl = (Size.m1049getHeightimpl(canvasDrawScope2.mo1585getSizeNHjbRc()) + f4) / Size.m1049getHeightimpl(canvasDrawScope2.mo1585getSizeNHjbRc());
        long jMo1584getCenterF1C5BW0 = canvasDrawScope2.mo1584getCenterF1C5BW0();
        DrawContext drawContext = canvasDrawScope2.getDrawContext();
        long jMo1591getSizeNHjbRc = drawContext.mo1591getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1598scale0AR0LA0(fM1052getWidthimpl, fM1049getHeightimpl, jMo1584getCenterF1C5BW0);
        DrawScope.DefaultImpls.m1623drawPathGBMwjPU$default(canvasDrawScope2, pathObtainPath, brush, 0.0f, null, null, companion.m1136getClear0nO6VwU(), 28, null);
        drawContext.getCanvas().restore();
        drawContext.mo1592setSizeuvyYCjk(jMo1591getSizeNHjbRc);
        canvasDrawScope2.getDrawContext().getTransform().translate(-f2, -f3);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas3);
        drawParams3.m1590setSizeuvyYCjk(size);
        r11.prepareToDraw();
        objectRef.element = r11;
        final ColorFilter colorFilter = colorFilterM1253tintxETnrds$default;
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt.drawGenericBorder.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                float left = bounds.getLeft();
                float top = bounds.getTop();
                kotlin.jvm.internal.Ref.ObjectRef<ImageBitmap> objectRef2 = objectRef;
                long j = jIntSize;
                ColorFilter colorFilter2 = colorFilter;
                contentDrawScope.getDrawContext().getTransform().translate(left, top);
                DrawScope.DefaultImpls.m1617drawImage9jGpkUE$default(contentDrawScope, objectRef2.element, 0L, j, 0L, 0L, 0.0f, null, colorFilter2, 0, 378, null);
                contentDrawScope.getDrawContext().getTransform().translate(-left, -top);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final DrawResult m119drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j, long j2, boolean z, float f) {
        final long jM999getZeroF1C5BW0 = z ? Offset.INSTANCE.m999getZeroF1C5BW0() : j;
        final long jM917getSizeNHjbRc = z ? cacheDrawScope.m917getSizeNHjbRc() : j2;
        final DrawStyle stroke = z ? Fill.INSTANCE : new Stroke(f, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.DefaultImpls.m1627drawRectAsUm42w$default(contentDrawScope, brush, jM999getZeroF1C5BW0, jM917getSizeNHjbRc, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawRoundRectBorder-SYlcjDY, reason: not valid java name */
    public static final DrawResult m120drawRoundRectBorderSYlcjDY(CacheDrawScope cacheDrawScope, Ref<BorderCache> ref, final Brush brush, Outline.Rounded rounded, final long j, final long j2, final boolean z, final float f) {
        if (!RoundRectKt.isSimple(rounded.getRoundRect())) {
            final Path pathCreateRoundRectPath = createRoundRectPath(obtain(ref).obtainPath(), rounded.getRoundRect(), f, z);
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                    contentDrawScope.drawContent();
                    DrawScope.DefaultImpls.m1623drawPathGBMwjPU$default(contentDrawScope, pathCreateRoundRectPath, brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        final long jM1033getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m1033getTopLeftCornerRadiuskKHJgLs();
        final float f2 = f / 2;
        final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                if (z) {
                    DrawScope.DefaultImpls.m1629drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, jM1033getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                    return;
                }
                float fM958getXimpl = CornerRadius.m958getXimpl(jM1033getTopLeftCornerRadiuskKHJgLs);
                float f3 = f2;
                if (fM958getXimpl >= f3) {
                    DrawScope.DefaultImpls.m1629drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j, j2, BorderKt.m121shrinkKibmq7A(jM1033getTopLeftCornerRadiuskKHJgLs, f3), 0.0f, stroke, null, 0, 208, null);
                    return;
                }
                float f4 = f;
                float fM1052getWidthimpl = Size.m1052getWidthimpl(contentDrawScope.mo1585getSizeNHjbRc()) - f;
                float fM1049getHeightimpl = Size.m1049getHeightimpl(contentDrawScope.mo1585getSizeNHjbRc()) - f;
                int iM1200getDifferencertfAjoo = ClipOp.INSTANCE.m1200getDifferencertfAjoo();
                Brush brush2 = brush;
                long j3 = jM1033getTopLeftCornerRadiuskKHJgLs;
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo1591getSizeNHjbRc = drawContext.mo1591getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo1594clipRectN_I0leg(f4, f4, fM1052getWidthimpl, fM1049getHeightimpl, iM1200getDifferencertfAjoo);
                DrawScope.DefaultImpls.m1629drawRoundRectZuiqVtQ$default(contentDrawScope, brush2, 0L, 0L, j3, 0.0f, null, null, 0, 246, null);
                drawContext.getCanvas().restore();
                drawContext.mo1592setSizeuvyYCjk(jMo1591getSizeNHjbRc);
            }
        });
    }

    private static final BorderCache obtain(Ref<BorderCache> ref) {
        BorderCache value = ref.getValue();
        if (value != null) {
            return value;
        }
        BorderCache borderCache = new BorderCache(null, null, null, null, 15, null);
        ref.setValue(borderCache);
        return borderCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m121shrinkKibmq7A(long j, float f) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.m958getXimpl(j) - f), Math.max(0.0f, CornerRadius.m959getYimpl(j) - f));
    }
}
