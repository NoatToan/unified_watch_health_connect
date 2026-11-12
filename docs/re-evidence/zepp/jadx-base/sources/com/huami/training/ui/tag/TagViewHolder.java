package com.huami.training.ui.tag;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.training.ui.R;
import com.huami.training.ui.common.CourseLayoutDelegate;
import com.huami.training.vo.TagVo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"Lcom/huami/training/ui/tag/TagViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/training/vo/TagVo;", "tag", "", "position", "selectedPos", "", "bind", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", "layoutDelegate", "Landroid/view/ViewGroup;", "parent", "<init>", "(Lcom/huami/training/ui/common/CourseLayoutDelegate;Landroid/view/ViewGroup;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class TagViewHolder extends RecyclerView.ViewHolder {
    public TagViewHolder(@NotNull CourseLayoutDelegate courseLayoutDelegate, @NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(courseLayoutDelegate.getCourseTags(), viewGroup, false));
    }

    public final void bind(@NotNull TagVo tag, int position, int selectedPos) {
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.tv_tag_today_training)).setText(tag.getName());
        view.setSelected(position == selectedPos);
    }
}
