package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.quickstart;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.devicex.R;
import com.xiaomi.hm.health.watermarkcamera.ui.activity.WatermarkClipActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R!\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R!\u0010\u000e\u001a\n \u0003*\u0004\u0018\u00010\t0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/quickstart/QuickStartHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/appcompat/widget/AppCompatImageView;", "kotlin.jvm.PlatformType", "a", "Landroidx/appcompat/widget/AppCompatImageView;", "getSelectImg", "()Landroidx/appcompat/widget/AppCompatImageView;", WatermarkClipActivity.EXTRA_SELECT_IMG, "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getNameTv", "()Landroid/widget/TextView;", "nameTv", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class QuickStartHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AppCompatImageView selectImg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextView nameTv;

    public QuickStartHolder(@NotNull View view) {
        super(view);
        this.selectImg = (AppCompatImageView) view.findViewById(R.id.selected_img);
        this.nameTv = (TextView) view.findViewById(R.id.quick_start_name_tv);
    }

    public final TextView getNameTv() {
        return this.nameTv;
    }

    public final AppCompatImageView getSelectImg() {
        return this.selectImg;
    }
}
