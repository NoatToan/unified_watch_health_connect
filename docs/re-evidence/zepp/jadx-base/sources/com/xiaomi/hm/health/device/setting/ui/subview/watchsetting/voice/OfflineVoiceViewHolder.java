package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Lcom/huami/lib/rainbow/ListTile;", "b", "Lcom/huami/lib/rainbow/ListTile;", "getLanguageTile", "()Lcom/huami/lib/rainbow/ListTile;", "languageTile", "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OfflineVoiceViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ListTile languageTile;

    public OfflineVoiceViewHolder(@NotNull View view) {
        super(view);
        this.view = view;
        this.languageTile = (ListTile) view.findViewById(R.id.offline_language_tile);
    }

    @NotNull
    public final ListTile getLanguageTile() {
        return this.languageTile;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }
}
