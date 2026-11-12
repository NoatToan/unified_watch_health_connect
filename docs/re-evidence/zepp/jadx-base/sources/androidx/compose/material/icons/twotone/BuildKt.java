package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0017\u0010\u0006\u001a\u00020\u0000*\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "_build", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBuild", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Build", "material-icons-core_release"}, k = 2, mv = {1, 5, 1})
public final class BuildKt {

    @Nullable
    private static ImageVector _build;

    @NotNull
    public static final ImageVector getBuild(@NotNull Icons.TwoTone twoTone) {
        ImageVector imageVector = _build;
        if (imageVector != null) {
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Build", Dp.m2965constructorimpl(24.0f), Dp.m2965constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m1238getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM1481getButtKaPHkGw = companion2.m1481getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM1491getBevelLxFBmk8 = companion3.m1491getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.92f, 8.28f);
        pathBuilder.curveToRelative(0.24f, -1.4f, -0.16f, -2.89f, -1.24f, -3.96f);
        pathBuilder.curveToRelative(-0.94f, -0.95f, -2.2f, -1.39f, -3.44f, -1.32f);
        pathBuilder.lineToRelative(3.09f, 3.09f);
        pathBuilder.lineToRelative(-4.24f, 4.24f);
        pathBuilder.lineTo(3.0f, 7.24f);
        pathBuilder.curveToRelative(-0.07f, 1.24f, 0.37f, 2.49f, 1.31f, 3.44f);
        pathBuilder.curveToRelative(1.04f, 1.04f, 2.47f, 1.45f, 3.83f, 1.25f);
        pathBuilder.curveToRelative(0.71f, -0.1f, 1.4f, -0.38f, 2.0f, -0.82f);
        pathBuilder.lineToRelative(9.46f, 9.46f);
        pathBuilder.lineToRelative(0.88f, -0.88f);
        pathBuilder.lineToRelative(-9.45f, -9.45f);
        pathBuilder.curveToRelative(0.47f, -0.6f, 0.77f, -1.26f, 0.89f, -1.96f);
        pathBuilder.close();
        Unit unit = Unit.INSTANCE;
        builder.m1680addPathoIyEayM(pathBuilder.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 0.3f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 0.3f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM1481getButtKaPHkGw, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM1491getBevelLxFBmk8, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m1238getBlack0d7_KjU(), null);
        int iM1481getButtKaPHkGw2 = companion2.m1481getButtKaPHkGw();
        int iM1491getBevelLxFBmk9 = companion3.m1491getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(22.61f, 18.97f);
        pathBuilder2.lineTo(13.54f, 9.9f);
        pathBuilder2.curveToRelative(0.93f, -2.34f, 0.45f, -5.1f, -1.44f, -7.0f);
        pathBuilder2.curveTo(9.8f, 0.6f, 6.22f, 0.39f, 3.67f, 2.25f);
        pathBuilder2.lineTo(7.5f, 6.08f);
        pathBuilder2.lineTo(6.08f, 7.5f);
        pathBuilder2.lineTo(2.25f, 3.67f);
        pathBuilder2.curveTo(0.39f, 6.21f, 0.6f, 9.79f, 2.9f, 12.09f);
        pathBuilder2.curveToRelative(1.86f, 1.86f, 4.57f, 2.35f, 6.89f, 1.48f);
        pathBuilder2.lineToRelative(9.11f, 9.11f);
        pathBuilder2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder2.lineToRelative(2.3f, -2.3f);
        pathBuilder2.curveToRelative(0.4f, -0.38f, 0.4f, -1.02f, 0.0f, -1.41f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.61f, 20.57f);
        pathBuilder2.lineToRelative(-9.46f, -9.46f);
        pathBuilder2.curveToRelative(-0.61f, 0.45f, -1.29f, 0.72f, -2.0f, 0.82f);
        pathBuilder2.curveToRelative(-1.36f, 0.2f, -2.79f, -0.21f, -3.83f, -1.25f);
        pathBuilder2.curveToRelative(-0.95f, -0.94f, -1.39f, -2.2f, -1.32f, -3.44f);
        pathBuilder2.lineToRelative(3.09f, 3.09f);
        pathBuilder2.lineToRelative(4.24f, -4.24f);
        pathBuilder2.lineTo(7.24f, 3.0f);
        pathBuilder2.curveToRelative(1.24f, -0.07f, 2.49f, 0.37f, 3.44f, 1.31f);
        pathBuilder2.curveToRelative(1.08f, 1.08f, 1.49f, 2.57f, 1.24f, 3.96f);
        pathBuilder2.curveToRelative(-0.12f, 0.7f, -0.42f, 1.36f, -0.88f, 1.95f);
        pathBuilder2.lineToRelative(9.45f, 9.45f);
        pathBuilder2.lineToRelative(-0.88f, 0.9f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = builder.m1680addPathoIyEayM(pathBuilder2.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType2, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor2, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM1481getButtKaPHkGw2, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM1491getBevelLxFBmk9, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f).build();
        _build = imageVectorBuild;
        return imageVectorBuild;
    }
}
