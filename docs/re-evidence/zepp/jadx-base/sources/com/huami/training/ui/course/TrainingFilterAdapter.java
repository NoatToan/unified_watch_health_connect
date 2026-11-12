package com.huami.training.ui.course;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.training.ui.common.CourseLayoutDelegate;
import com.huami.training.ui.common.MiFitCourseLayoutDelegate;
import com.huami.training.ui.common.TrainingVoDiffCallback;
import com.huami.training.ui.common.adapter.PagingListAdapter;
import com.huami.training.ui.common.viewholder.CourseViewHolder;
import com.huami.training.utils.AnalyticsHelper;
import com.huami.training.utils.CountListItemVisitHelper;
import com.huami.training.vo.TrainingVo;
import com.loc.z;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0016\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/huami/training/ui/course/TrainingFilterAdapter;", "Lcom/huami/training/ui/common/adapter/PagingListAdapter;", "Lcom/huami/training/vo/TrainingVo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "item", "", "bindTo", "Landroid/view/ViewGroup;", "parent", "Lcom/huami/training/ui/common/viewholder/CourseViewHolder;", "createItemViewHolder", "bindViewHolder", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", "h", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", "layoutDelegate", "", "i", "Ljava/lang/String;", "getFilterName", "()Ljava/lang/String;", "filterName", "com/huami/training/ui/course/TrainingFilterAdapter$countItemVisitHelper$2$1", z.j, "Lkotlin/Lazy;", "e", "()Lcom/huami/training/ui/course/TrainingFilterAdapter$countItemVisitHelper$2$1;", "countItemVisitHelper", "Lkotlin/Function0;", "retryCallback", "<init>", "(Lcom/huami/training/ui/common/CourseLayoutDelegate;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingFilterAdapter extends PagingListAdapter<TrainingVo, RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final CourseLayoutDelegate layoutDelegate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final String filterName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy countItemVisitHelper;

    public /* synthetic */ TrainingFilterAdapter(CourseLayoutDelegate courseLayoutDelegate, String str, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MiFitCourseLayoutDelegate() : courseLayoutDelegate, str, function0);
    }

    private final TrainingFilterAdapter$countItemVisitHelper$2.AnonymousClass1 e() {
        return (TrainingFilterAdapter$countItemVisitHelper$2.AnonymousClass1) this.countItemVisitHelper.getValue();
    }

    public final void bindViewHolder(@NotNull RecyclerView.ViewHolder holder, @NotNull TrainingVo item) {
        ((CourseViewHolder) holder).bind(item);
    }

    @NotNull
    public final String getFilterName() {
        return this.filterName;
    }

    @Override // com.huami.training.ui.common.adapter.PagingListAdapter
    public void bindTo(@NotNull RecyclerView.ViewHolder holder, @Nullable TrainingVo item) {
        if (item == null) {
            return;
        }
        bindViewHolder(holder, item);
        e().put(item, holder.getAdapterPosition());
    }

    @Override // com.huami.training.ui.common.adapter.PagingListAdapter
    @NotNull
    public CourseViewHolder createItemViewHolder(@NotNull ViewGroup parent) {
        return new CourseViewHolder(parent, this.layoutDelegate);
    }

    public TrainingFilterAdapter(@NotNull CourseLayoutDelegate courseLayoutDelegate, @NotNull String str, @NotNull Function0<Unit> function0) {
        super(courseLayoutDelegate, function0, new TrainingVoDiffCallback());
        this.layoutDelegate = courseLayoutDelegate;
        this.filterName = str;
        this.countItemVisitHelper = LazyKt__LazyJVMKt.lazy(new Function0<TrainingFilterAdapter$countItemVisitHelper$2.AnonymousClass1>() { // from class: com.huami.training.ui.course.TrainingFilterAdapter$countItemVisitHelper$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.training.ui.course.TrainingFilterAdapter$countItemVisitHelper$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 invoke() {
                final TrainingFilterAdapter trainingFilterAdapter = this.a;
                return new CountListItemVisitHelper<TrainingVo>() { // from class: com.huami.training.ui.course.TrainingFilterAdapter$countItemVisitHelper$2.1
                    @Override // com.huami.training.utils.CountListItemVisitHelper
                    public void count(int position, @NotNull TrainingVo v) {
                        AnalyticsHelper.INSTANCE.countAllCourseListItemVisit(position, String.valueOf(v.getId()), trainingFilterAdapter.getFilterName());
                    }
                };
            }
        });
    }
}
