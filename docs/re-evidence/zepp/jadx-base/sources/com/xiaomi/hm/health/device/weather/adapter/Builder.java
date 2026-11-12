package com.xiaomi.hm.health.device.weather.adapter;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/weather/adapter/Builder;", "", "Landroid/app/Activity;", "activity", "setContext", "", "itemWidth", "setItemWidth", "verticalGap", "setVerticalGap", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "setRecyclerView", "spanCount", "setSpanCount", "Lcom/xiaomi/hm/health/device/weather/adapter/WeatherGridRecyclerViewHelper;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "a", "Landroid/app/Activity;", "b", LogUtil.I, "c", GoogleApiAvailabilityLight.a, "Landroidx/recyclerview/widget/RecyclerView;", "e", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class Builder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int itemWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int verticalGap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private RecyclerView recyclerView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int spanCount;

    @NotNull
    public final WeatherGridRecyclerViewHelper build() {
        Activity activity = this.activity;
        Objects.requireNonNull(activity);
        RecyclerView recyclerView = this.recyclerView;
        Objects.requireNonNull(recyclerView);
        return new WeatherGridRecyclerViewHelper(activity, recyclerView, this.itemWidth, this.verticalGap, this.spanCount);
    }

    @NotNull
    public final Builder setContext(@NotNull Activity activity) {
        this.activity = activity;
        return this;
    }

    @NotNull
    public final Builder setItemWidth(int itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    @NotNull
    public final Builder setRecyclerView(@NotNull RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
        return this;
    }

    @NotNull
    public final Builder setSpanCount(int spanCount) {
        this.spanCount = spanCount;
        return this;
    }

    @NotNull
    public final Builder setVerticalGap(int verticalGap) {
        this.verticalGap = verticalGap;
        return this;
    }
}
