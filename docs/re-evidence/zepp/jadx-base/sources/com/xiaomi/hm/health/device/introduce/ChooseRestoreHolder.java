package com.xiaomi.hm.health.device.introduce;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.devicex.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/introduce/ChooseRestoreHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getChooseRestoreTitleTv", "()Landroid/widget/TextView;", "chooseRestoreTitleTv", "b", "getChooseRestoreItemTipsTv", "chooseRestoreItemTipsTv", "Landroid/widget/CheckBox;", "c", "Landroid/widget/CheckBox;", "getRestoreCb", "()Landroid/widget/CheckBox;", "restoreCb", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ChooseRestoreHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TextView chooseRestoreTitleTv;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TextView chooseRestoreItemTipsTv;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CheckBox restoreCb;

    public ChooseRestoreHolder(@NotNull View view) {
        super(view);
        this.chooseRestoreTitleTv = (TextView) view.findViewById(R.id.restore_item_title_tv);
        this.chooseRestoreItemTipsTv = (TextView) view.findViewById(R.id.restore_item_tips_tv);
        this.restoreCb = (CheckBox) view.findViewById(R.id.restore_item_cb);
    }

    @NotNull
    public final TextView getChooseRestoreItemTipsTv() {
        return this.chooseRestoreItemTipsTv;
    }

    @NotNull
    public final TextView getChooseRestoreTitleTv() {
        return this.chooseRestoreTitleTv;
    }

    @NotNull
    public final CheckBox getRestoreCb() {
        return this.restoreCb;
    }
}
