package com.huami.watch.companion.ui.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.watch.companion.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/huami/watch/companion/ui/adapter/DeviceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getDeviceTitle", "()Landroid/widget/TextView;", "deviceTitle", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TextView deviceTitle;

    public DeviceViewHolder(@NotNull View view) {
        super(view);
        this.deviceTitle = (TextView) view.findViewById(R.id.device_title);
    }

    @NotNull
    public final TextView getDeviceTitle() {
        return this.deviceTitle;
    }
}
