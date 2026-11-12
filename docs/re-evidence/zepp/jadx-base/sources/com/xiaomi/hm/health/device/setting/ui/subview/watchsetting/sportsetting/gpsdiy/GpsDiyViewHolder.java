package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017R!\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R!\u0010\u000b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R!\u0010\u000e\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R!\u0010\u0014\u001a\n \u0003*\u0004\u0018\u00010\u000f0\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "a", "Landroid/widget/TextView;", "getNameTv", "()Landroid/widget/TextView;", "nameTv", "b", "getSelectedTv", "selectedTv", "c", "getTipsTv", "tipsTv", "Landroid/view/View;", GoogleApiAvailabilityLight.a, "Landroid/view/View;", "getMaskView", "()Landroid/view/View;", "maskView", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GpsDiyViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextView nameTv;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextView selectedTv;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextView tipsTv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final View maskView;

    public GpsDiyViewHolder(@NotNull View view) {
        super(view);
        this.nameTv = (TextView) this.itemView.findViewById(R.id.name_tv);
        this.selectedTv = (TextView) this.itemView.findViewById(R.id.selected_tv);
        this.tipsTv = (TextView) this.itemView.findViewById(R.id.tips_tv);
        this.maskView = this.itemView.findViewById(R.id.mask_view);
    }

    public final View getMaskView() {
        return this.maskView;
    }

    public final TextView getNameTv() {
        return this.nameTv;
    }

    public final TextView getSelectedTv() {
        return this.selectedTv;
    }

    public final TextView getTipsTv() {
        return this.tipsTv;
    }
}
