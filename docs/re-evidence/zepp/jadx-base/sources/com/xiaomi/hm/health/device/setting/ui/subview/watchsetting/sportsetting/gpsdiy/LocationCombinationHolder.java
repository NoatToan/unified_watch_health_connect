package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001c\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/LocationCombinationHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroidx/appcompat/widget/AppCompatImageView;", "b", "Landroidx/appcompat/widget/AppCompatImageView;", "getSelectedImg", "()Landroidx/appcompat/widget/AppCompatImageView;", "selectedImg", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getTitleTv", "()Landroid/widget/TextView;", "titleTv", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/LevelView;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/LevelView;", "getAccuracyLevelView", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/LevelView;", "accuracyLevelView", "e", "getConsumptionLevelView", "consumptionLevelView", "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LocationCombinationHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AppCompatImageView selectedImg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TextView titleTv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LevelView accuracyLevelView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LevelView consumptionLevelView;

    public LocationCombinationHolder(@NotNull View view) {
        super(view);
        this.view = view;
        this.selectedImg = (AppCompatImageView) view.findViewById(R.id.select_img);
        this.titleTv = (TextView) view.findViewById(R.id.title_tv);
        this.accuracyLevelView = (LevelView) view.findViewById(R.id.accuracy_level_view);
        this.consumptionLevelView = (LevelView) view.findViewById(R.id.consumption_level_view);
    }

    @NotNull
    public final LevelView getAccuracyLevelView() {
        return this.accuracyLevelView;
    }

    @NotNull
    public final LevelView getConsumptionLevelView() {
        return this.consumptionLevelView;
    }

    @NotNull
    public final AppCompatImageView getSelectedImg() {
        return this.selectedImg;
    }

    @NotNull
    public final TextView getTitleTv() {
        return this.titleTv;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }
}
