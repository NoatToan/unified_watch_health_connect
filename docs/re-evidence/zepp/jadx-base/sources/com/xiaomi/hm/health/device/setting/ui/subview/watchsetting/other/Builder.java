package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.other;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/other/Builder;", "", "", "edgeSpace", "setEdgeSpace", "space", "setSpace", "Landroid/app/Activity;", "activity", "setContext", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "setRecyclerView", "", "spanCount", "setSpanCount", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/other/GridRecyclerViewHelper;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "a", "Landroid/app/Activity;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "c", LogUtil.I, GoogleApiAvailabilityLight.a, "F", "e", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class Builder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private RecyclerView recyclerView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int spanCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float edgeSpace;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float space;

    @NotNull
    public final GridRecyclerViewHelper build() {
        Activity activity = this.activity;
        Objects.requireNonNull(activity);
        RecyclerView recyclerView = this.recyclerView;
        Objects.requireNonNull(recyclerView);
        return new GridRecyclerViewHelper(activity, recyclerView, this.spanCount, this.edgeSpace, this.space);
    }

    @NotNull
    public final Builder setContext(@NotNull Activity activity) {
        this.activity = activity;
        return this;
    }

    @NotNull
    public final Builder setEdgeSpace(float edgeSpace) {
        this.edgeSpace = edgeSpace;
        return this;
    }

    @NotNull
    public final Builder setRecyclerView(@NotNull RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
        return this;
    }

    @NotNull
    public final Builder setSpace(float space) {
        this.space = space;
        return this;
    }

    @NotNull
    public final Builder setSpanCount(int spanCount) {
        this.spanCount = spanCount;
        return this;
    }
}
