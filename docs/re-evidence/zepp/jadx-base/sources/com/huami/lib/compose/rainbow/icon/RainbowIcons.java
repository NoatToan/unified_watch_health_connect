package com.huami.lib.compose.rainbow.icon;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
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

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0013\u0010\b\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/lib/compose/rainbow/icon/RainbowIcons;", "", "Landroidx/compose/ui/graphics/vector/ImageVector;", "a", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowBack", "getArrowBack", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "ArrowBack", "<init>", "()V", "rainbow_release"}, k = 1, mv = {1, 5, 1})
public final class RainbowIcons {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static ImageVector _arrowBack;

    @NotNull
    public static final RainbowIcons INSTANCE = new RainbowIcons();
    public static final int $stable = 8;

    private RainbowIcons() {
    }

    @NotNull
    public final ImageVector getArrowBack() {
        ImageVector imageVector = _arrowBack;
        if (imageVector != null) {
            return imageVector;
        }
        float f = 20;
        ImageVector.Builder builder = new ImageVector.Builder("ArrowBack", Dp.m2965constructorimpl(f), Dp.m2965constructorimpl(f), 20.0f, 20.0f, 0L, 0, 96, null);
        int iM1424getEvenOddRgk1Os = PathFillType.INSTANCE.m1424getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m1238getBlack0d7_KjU(), null);
        int iM1481getButtKaPHkGw = StrokeCap.INSTANCE.m1481getButtKaPHkGw();
        int iM1491getBevelLxFBmk8 = StrokeJoin.INSTANCE.m1491getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 18.0f);
        pathBuilder.lineTo(-8.0f, -8.0f);
        pathBuilder.lineTo(8.0f, -8.0f);
        pathBuilder.lineTo(-0.0f, 0.0f);
        pathBuilder.close();
        Unit unit = Unit.INSTANCE;
        ImageVector imageVectorBuild = builder.m1680addPathoIyEayM(pathBuilder.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : iM1424getEvenOddRgk1Os, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.75f, (14336 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM1481getButtKaPHkGw, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM1491getBevelLxFBmk8, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f).build();
        _arrowBack = imageVectorBuild;
        return imageVectorBuild;
    }
}
