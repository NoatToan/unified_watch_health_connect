package com.huami.snore.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleep.sleephome.vo.ShowActionItemInfo;
import com.huami.snore.core.R;
import com.huami.snore.core.util.TimeUtil;
import com.huami.snore.core.vo.VoiceShowInfo;
import com.huami.snore.ui.util.CommonUiUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Lcom/huami/snore/ui/adapter/VoiceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/snore/core/vo/VoiceShowInfo;", "item", "", "itemPosition", "", ShowActionItemInfo.EDIT, "", "bindTo", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class VoiceViewHolder extends RecyclerView.ViewHolder {
    public VoiceViewHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_snore_layout, viewGroup, false));
    }

    public final void bindTo(@Nullable VoiceShowInfo item, int itemPosition, boolean edit) {
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.startTime)).setText(TimeUtil.INSTANCE.formatTime(view.getContext(), item == null ? null : item.getStartTime()));
        int i = R.id.duration;
        ((TextView) view.findViewById(i)).setText(item != null ? item.getDurationStr() : null);
        boolean z = false;
        if (edit) {
            ((ImageView) view.findViewById(R.id.delete)).setVisibility(0);
            ((ImageView) view.findViewById(R.id.start)).setVisibility(8);
            ((ImageView) view.findViewById(R.id.upload)).setVisibility(0);
            ((TextView) view.findViewById(i)).setVisibility(8);
        } else {
            ((ImageView) view.findViewById(R.id.delete)).setVisibility(8);
            ((ImageView) view.findViewById(R.id.start)).setVisibility(0);
            ((ImageView) view.findViewById(R.id.upload)).setVisibility(8);
            ((TextView) view.findViewById(i)).setVisibility(0);
        }
        if (item != null && item.isPlaying()) {
            ((ImageView) view.findViewById(R.id.start)).setImageResource(R.drawable.snore_stop_sudio_icon);
        } else {
            ((ImageView) view.findViewById(R.id.start)).setImageResource(R.drawable.snore_play_audio_icon);
        }
        if (item != null && item.getUploaded()) {
            z = true;
        }
        if (z) {
            ((ImageView) view.findViewById(R.id.upload)).setImageResource(R.drawable.snore_ic_uploaded_cloud);
        } else {
            ((ImageView) view.findViewById(R.id.upload)).setImageResource(R.drawable.snore_ic_unupload_cloud);
        }
        ((ImageView) view.findViewById(R.id.playVoice)).setImageResource(CommonUiUtil.INSTANCE.getInstance().getImageByName(view.getContext(), "snore_voice_play" + (itemPosition % 5)));
    }
}
