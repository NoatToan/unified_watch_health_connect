package com.huami.chart.data;

import android.graphics.Shader;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\"\u001a\u00020\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/huami/chart/data/BackgroundShader;", "", "", "a", "F", "getX0", "()F", "x0", "b", "getY0", "y0", "c", "getX1", "x1", GoogleApiAvailabilityLight.a, "getY1", "y1", "", "e", "[I", "getColors", "()[I", "colors", "", "f", "[F", "getPositions", "()[F", "positions", "Landroid/graphics/Shader$TileMode;", "g", "Landroid/graphics/Shader$TileMode;", "getTile", "()Landroid/graphics/Shader$TileMode;", "tile", "<init>", "(FFFF[I[FLandroid/graphics/Shader$TileMode;)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class BackgroundShader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float x0;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float y0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float x1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float y1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final int[] colors;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final float[] positions;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Shader.TileMode tile;

    public BackgroundShader(float f, float f2, float f3, float f4, @NotNull int[] iArr, @Nullable float[] fArr, @NotNull Shader.TileMode tileMode) {
        this.x0 = f;
        this.y0 = f2;
        this.x1 = f3;
        this.y1 = f4;
        this.colors = iArr;
        this.positions = fArr;
        this.tile = tileMode;
    }

    @NotNull
    public final int[] getColors() {
        return this.colors;
    }

    @Nullable
    public final float[] getPositions() {
        return this.positions;
    }

    @NotNull
    public final Shader.TileMode getTile() {
        return this.tile;
    }

    public final float getX0() {
        return this.x0;
    }

    public final float getX1() {
        return this.x1;
    }

    public final float getY0() {
        return this.y0;
    }

    public final float getY1() {
        return this.y1;
    }
}
