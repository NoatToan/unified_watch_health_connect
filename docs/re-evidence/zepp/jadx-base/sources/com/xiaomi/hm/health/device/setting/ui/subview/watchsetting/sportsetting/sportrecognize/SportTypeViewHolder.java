package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.devicex.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportTypeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getTypeTv", "()Landroid/widget/TextView;", "typeTv", "Landroidx/appcompat/widget/SwitchCompat;", "b", "Landroidx/appcompat/widget/SwitchCompat;", "getEnableSwitch", "()Landroidx/appcompat/widget/SwitchCompat;", "enableSwitch", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportTypeViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TextView typeTv;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SwitchCompat enableSwitch;

    public SportTypeViewHolder(@NotNull View view) {
        super(view);
        this.typeTv = (TextView) this.itemView.findViewById(R.id.type_text);
        this.enableSwitch = (SwitchCompat) this.itemView.findViewById(R.id.enable_switch);
    }

    @NotNull
    public final SwitchCompat getEnableSwitch() {
        return this.enableSwitch;
    }

    @NotNull
    public final TextView getTypeTv() {
        return this.typeTv;
    }
}
