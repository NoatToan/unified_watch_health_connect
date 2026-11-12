package com.huami.training.ui.promotion;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.training.dto.PromotePlace;
import com.huami.training.helper.AppExecutors;
import com.huami.training.ui.common.MiFitCourseLayoutDelegate;
import com.huami.training.ui.common.viewholder.CourseViewHolder;
import com.huami.training.vo.TrainingVo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0014"}, d2 = {"Lcom/huami/training/ui/promotion/MiFitCourseListAdapter;", "Lcom/huami/training/ui/promotion/BaseCourseListAdapter;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateCustomViewHolder", "holder", "Lcom/huami/training/vo/TrainingVo;", "item", "", "bindViewHolder", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lkotlin/Function0;", "Lcom/huami/training/dto/PromotePlace;", "promotePlace", "<init>", "(Lcom/huami/training/helper/AppExecutors;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class MiFitCourseListAdapter extends BaseCourseListAdapter {
    public MiFitCourseListAdapter(@NotNull AppExecutors appExecutors, @NotNull Function0<? extends PromotePlace> function0) {
        super(appExecutors, function0);
    }

    @Override // com.huami.training.ui.promotion.BaseCourseListAdapter
    public void bindViewHolder(@NotNull RecyclerView.ViewHolder holder, @NotNull TrainingVo item) {
        ((CourseViewHolder) holder).bind(item);
    }

    @Override // com.huami.training.ui.promotion.BaseCourseListAdapter
    @NotNull
    public RecyclerView.ViewHolder onCreateCustomViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new CourseViewHolder(parent, new MiFitCourseLayoutDelegate());
    }
}
