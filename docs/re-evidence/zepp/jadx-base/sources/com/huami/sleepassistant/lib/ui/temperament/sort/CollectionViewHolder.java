package com.huami.sleepassistant.lib.ui.temperament.sort;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleepassistant.apilib.vo.LiveMusicVo;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.base.ext.ImageViewExKt;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.huami.sleepassistant.lib.widget.circleimageview.HMCircleImageView;
import com.huami.widget.typeface.TypefaceTextView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/temperament/sort/CollectionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/sleepassistant/apilib/vo/LiveMusicVo;", "item", "", "bind", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class CollectionViewHolder extends RecyclerView.ViewHolder {
    public CollectionViewHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sls_item_live_music, viewGroup, false));
    }

    public final void bind(@NotNull LiveMusicVo item) {
        View view = this.itemView;
        ((TypefaceTextView) view.findViewById(R.id.sls_item_title)).setText(String.valueOf(item.getName()));
        ((TypefaceTextView) view.findViewById(R.id.sls_item_time)).setText(TimeUtils.INSTANCE.secToTime(item.getPlayTime() * 60));
        ((TypefaceTextView) view.findViewById(R.id.sls_item_group_name)).setText(item.getDescription());
        HMCircleImageView hMCircleImageView = (HMCircleImageView) view.findViewById(R.id.sls_img_live_music);
        if (hMCircleImageView != null) {
            ImageViewExKt.loadWithMusicGlideCircle(hMCircleImageView, item.getItemImgUrl());
        }
        ViewExKt.setVisible((ImageView) view.findViewById(R.id.sls_sort_icon), true);
        ViewExKt.setVisible((ImageView) view.findViewById(R.id.sls_item_play_icon), false);
        ViewExKt.setVisible((ImageView) view.findViewById(R.id.sls_item_more), false);
    }
}
