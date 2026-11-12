package com.huami.training.ui.usercourse;

import android.view.ViewGroup;
import com.huami.training.ui.common.CourseLayoutDelegate;
import com.huami.training.ui.common.MiFitCourseLayoutDelegate;
import com.huami.training.ui.common.TrainingVoDiffCallback;
import com.huami.training.ui.common.adapter.PagingListAdapter;
import com.huami.training.ui.common.viewholder.CourseViewHolder;
import com.huami.training.vo.TrainingVo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/huami/training/ui/usercourse/TrainingFilterAdapter;", "Lcom/huami/training/ui/common/adapter/PagingListAdapter;", "Lcom/huami/training/vo/TrainingVo;", "Lcom/huami/training/ui/common/viewholder/CourseViewHolder;", "Landroid/view/ViewGroup;", "parent", "createItemViewHolder", "holder", "item", "", "bindTo", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", "h", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", "layoutDelegate", "Lkotlin/Function0;", "retryCallback", "<init>", "(Lcom/huami/training/ui/common/CourseLayoutDelegate;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingFilterAdapter extends PagingListAdapter<TrainingVo, CourseViewHolder> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final CourseLayoutDelegate layoutDelegate;

    public /* synthetic */ TrainingFilterAdapter(CourseLayoutDelegate courseLayoutDelegate, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MiFitCourseLayoutDelegate() : courseLayoutDelegate, function0);
    }

    public TrainingFilterAdapter(@NotNull CourseLayoutDelegate courseLayoutDelegate, @NotNull Function0<Unit> function0) {
        super(courseLayoutDelegate, function0, new TrainingVoDiffCallback());
        this.layoutDelegate = courseLayoutDelegate;
    }

    @Override // com.huami.training.ui.common.adapter.PagingListAdapter
    public void bindTo(@NotNull CourseViewHolder holder, @Nullable TrainingVo item) {
        if (item == null) {
            return;
        }
        holder.bind(item);
    }

    @Override // com.huami.training.ui.common.adapter.PagingListAdapter
    @NotNull
    public CourseViewHolder createItemViewHolder(@NotNull ViewGroup parent) {
        return new CourseViewHolder(parent, this.layoutDelegate);
    }
}
