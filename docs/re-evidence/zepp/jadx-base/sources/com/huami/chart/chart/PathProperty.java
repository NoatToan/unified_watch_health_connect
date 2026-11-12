package com.huami.chart.chart;

import android.graphics.Path;
import android.graphics.PathEffect;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/chart/chart/PathProperty;", "", "Landroid/graphics/Path;", "a", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "path", "", "b", "J", "getAnimatorDuration", "()J", "animatorDuration", "Landroid/graphics/PathEffect;", "c", "Landroid/graphics/PathEffect;", "getEffect", "()Landroid/graphics/PathEffect;", "effect", "Lcom/huami/chart/data/ChartData;", GoogleApiAvailabilityLight.a, "Lcom/huami/chart/data/ChartData;", "getData", "()Lcom/huami/chart/data/ChartData;", "data", "<init>", "(Landroid/graphics/Path;JLandroid/graphics/PathEffect;Lcom/huami/chart/data/ChartData;)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class PathProperty {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Path path;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long animatorDuration;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final PathEffect effect;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final ChartData data;

    public PathProperty(@NotNull Path path, long j, @Nullable PathEffect pathEffect, @Nullable ChartData chartData) {
        this.path = path;
        this.animatorDuration = j;
        this.effect = pathEffect;
        this.data = chartData;
    }

    public final long getAnimatorDuration() {
        return this.animatorDuration;
    }

    @Nullable
    public final ChartData getData() {
        return this.data;
    }

    @Nullable
    public final PathEffect getEffect() {
        return this.effect;
    }

    @NotNull
    public final Path getPath() {
        return this.path;
    }
}
