package com.xiaomi.hm.health.device.weather.adapter;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.view.ViewUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/weather/adapter/WeatherGridRecyclerViewHelper;", "", "", "a", "", "setup", "Landroid/app/Activity;", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "c", LogUtil.I, "itemWidth", GoogleApiAvailabilityLight.a, "verticalGap", "e", "spanCount", "", "f", "Z", "isRTL", "<init>", "(Landroid/app/Activity;Landroidx/recyclerview/widget/RecyclerView;III)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WeatherGridRecyclerViewHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RecyclerView recyclerView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int itemWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int verticalGap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int spanCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isRTL = ViewUtils.isRTL();

    public WeatherGridRecyclerViewHelper(@NotNull Activity activity, @NotNull RecyclerView recyclerView, int i, int i2, int i3) {
        this.activity = activity;
        this.recyclerView = recyclerView;
        this.itemWidth = i;
        this.verticalGap = i2;
        this.spanCount = i3;
    }

    private final float a() {
        return (ViewUtils.getScreenWidth(this.activity) - (ViewUtils.dp2px(this.activity, this.itemWidth) * this.spanCount)) / (this.spanCount + 1);
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final void setup() {
        final int iDp2px = (int) ViewUtils.dp2px(this.activity, this.verticalGap);
        final float fA = a();
        this.recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.xiaomi.hm.health.device.weather.adapter.WeatherGridRecyclerViewHelper.setup.1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
                int childAdapterPosition = parent.getChildAdapterPosition(view);
                int i = childAdapterPosition % WeatherGridRecyclerViewHelper.this.spanCount;
                if (WeatherGridRecyclerViewHelper.this.isRTL) {
                    outRect.right = (int) ((i * fA) / WeatherGridRecyclerViewHelper.this.spanCount);
                    float f = fA;
                    outRect.left = (int) (f - (((i + 1) * f) / WeatherGridRecyclerViewHelper.this.spanCount));
                } else {
                    outRect.left = (int) ((i * fA) / WeatherGridRecyclerViewHelper.this.spanCount);
                    float f2 = fA;
                    outRect.right = (int) (f2 - (((i + 1) * f2) / WeatherGridRecyclerViewHelper.this.spanCount));
                }
                if (childAdapterPosition >= WeatherGridRecyclerViewHelper.this.spanCount) {
                    outRect.top = iDp2px;
                }
            }
        });
        if (this.isRTL) {
            int i = (int) fA;
            this.recyclerView.setPadding(i, 0, i, 0);
        } else {
            int i2 = (int) fA;
            this.recyclerView.setPadding(i2, 0, i2, 0);
        }
    }
}
