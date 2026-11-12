package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0013\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0016\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0019\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/appcompat/widget/AppCompatImageView;", "a", "Landroidx/appcompat/widget/AppCompatImageView;", "getCheckedImg", "()Landroidx/appcompat/widget/AppCompatImageView;", "checkedImg", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getModeTv", "()Landroid/widget/TextView;", "modeTv", "c", "getGpsFrequenciesTv", "gpsFrequenciesTv", GoogleApiAvailabilityLight.a, "getGpsCombineTv", "gpsCombineTv", "e", "getStarSearchPreferencesTv", "starSearchPreferencesTv", "f", "getDataIntervalTv", "dataIntervalTv", "Landroid/widget/FrameLayout;", "g", "Landroid/widget/FrameLayout;", "getMoreLayout", "()Landroid/widget/FrameLayout;", "moreLayout", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GpsSettingViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppCompatImageView checkedImg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TextView modeTv;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TextView gpsFrequenciesTv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final TextView gpsCombineTv;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final TextView starSearchPreferencesTv;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final TextView dataIntervalTv;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final FrameLayout moreLayout;

    public GpsSettingViewHolder(@NotNull View view) {
        super(view);
        this.checkedImg = (AppCompatImageView) this.itemView.findViewById(R.id.checked_img);
        this.modeTv = (TextView) this.itemView.findViewById(R.id.mode_tv);
        this.gpsFrequenciesTv = (TextView) this.itemView.findViewById(R.id.gps_frequencies_tv);
        this.gpsCombineTv = (TextView) this.itemView.findViewById(R.id.gps_combine_tv);
        this.starSearchPreferencesTv = (TextView) this.itemView.findViewById(R.id.star_search_preferences_tv);
        this.dataIntervalTv = (TextView) this.itemView.findViewById(R.id.data_interval_tv);
        this.moreLayout = (FrameLayout) this.itemView.findViewById(R.id.more_layout);
    }

    @NotNull
    public final AppCompatImageView getCheckedImg() {
        return this.checkedImg;
    }

    @NotNull
    public final TextView getDataIntervalTv() {
        return this.dataIntervalTv;
    }

    @NotNull
    public final TextView getGpsCombineTv() {
        return this.gpsCombineTv;
    }

    @NotNull
    public final TextView getGpsFrequenciesTv() {
        return this.gpsFrequenciesTv;
    }

    @NotNull
    public final TextView getModeTv() {
        return this.modeTv;
    }

    @NotNull
    public final FrameLayout getMoreLayout() {
        return this.moreLayout;
    }

    @NotNull
    public final TextView getStarSearchPreferencesTv() {
        return this.starSearchPreferencesTv;
    }
}
