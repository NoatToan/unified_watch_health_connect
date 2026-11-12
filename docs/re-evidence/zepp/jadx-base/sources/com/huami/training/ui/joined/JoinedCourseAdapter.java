package com.huami.training.ui.joined;

import android.view.ViewGroup;
import com.huami.training.ui.common.CourseLayoutDelegate;
import com.huami.training.ui.common.MiFitCourseLayoutDelegate;
import com.huami.training.ui.common.adapter.PagingListAdapter;
import com.huami.training.vo.JoinedCourseVo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/huami/training/ui/joined/JoinedCourseAdapter;", "Lcom/huami/training/ui/common/adapter/PagingListAdapter;", "Lcom/huami/training/vo/JoinedCourseVo;", "Lcom/huami/training/ui/joined/JoinedCourseViewHolder;", "holder", "item", "", "bindTo", "Landroid/view/ViewGroup;", "parent", "createItemViewHolder", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", "layoutDelegate", "Lkotlin/Function0;", "retryCallback", "<init>", "(Lcom/huami/training/ui/common/CourseLayoutDelegate;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class JoinedCourseAdapter extends PagingListAdapter<JoinedCourseVo, JoinedCourseViewHolder> {
    public /* synthetic */ JoinedCourseAdapter(CourseLayoutDelegate courseLayoutDelegate, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MiFitCourseLayoutDelegate() : courseLayoutDelegate, function0);
    }

    public JoinedCourseAdapter(@NotNull CourseLayoutDelegate courseLayoutDelegate, @NotNull Function0<Unit> function0) {
        super(courseLayoutDelegate, function0, new JoinedCourseDiffCallback());
    }

    @Override // com.huami.training.ui.common.adapter.PagingListAdapter
    public void bindTo(@NotNull JoinedCourseViewHolder holder, @Nullable JoinedCourseVo item) {
        holder.bind(item);
    }

    @Override // com.huami.training.ui.common.adapter.PagingListAdapter
    @NotNull
    public JoinedCourseViewHolder createItemViewHolder(@NotNull ViewGroup parent) {
        return new JoinedCourseViewHolder(parent);
    }
}
