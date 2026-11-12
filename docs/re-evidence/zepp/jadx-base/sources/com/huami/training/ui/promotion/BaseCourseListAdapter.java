package com.huami.training.ui.promotion;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.training.dto.PromotePlace;
import com.huami.training.helper.AppExecutors;
import com.huami.training.ui.common.TrainingVoDiffCallback;
import com.huami.training.ui.promotion.BaseCourseListAdapter;
import com.huami.training.utils.AnalyticsHelper;
import com.huami.training.utils.CountListItemVisitHelper;
import com.huami.training.vo.TrainingVo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0018\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e¢\u0006\u0004\b!\u0010\"J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H&R6\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/huami/training/ui/promotion/BaseCourseListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/huami/training/vo/TrainingVo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "onCreateCustomViewHolder", "item", "bindViewHolder", "Lkotlin/Function2;", "a", "Lkotlin/jvm/functions/Function2;", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "onItemClickListener", "com/huami/training/ui/promotion/BaseCourseListAdapter$itemVisitHelper$1", "b", "Lcom/huami/training/ui/promotion/BaseCourseListAdapter$itemVisitHelper$1;", "itemVisitHelper", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lkotlin/Function0;", "Lcom/huami/training/dto/PromotePlace;", "promotePlace", "<init>", "(Lcom/huami/training/helper/AppExecutors;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseCourseListAdapter extends ListAdapter<TrainingVo, RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function2<? super Integer, ? super TrainingVo, Unit> onItemClickListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BaseCourseListAdapter$itemVisitHelper$1 itemVisitHelper;

    /* JADX WARN: Type inference failed for: r3v4, types: [com.huami.training.ui.promotion.BaseCourseListAdapter$itemVisitHelper$1] */
    public BaseCourseListAdapter(@NotNull AppExecutors appExecutors, @NotNull final Function0<? extends PromotePlace> function0) {
        super(new AsyncDifferConfig.Builder(new TrainingVoDiffCallback()).setBackgroundThreadExecutor(appExecutors.getDiskIO()).build());
        this.itemVisitHelper = new CountListItemVisitHelper<TrainingVo>() { // from class: com.huami.training.ui.promotion.BaseCourseListAdapter$itemVisitHelper$1
            @Override // com.huami.training.utils.CountListItemVisitHelper
            public void count(int position, @NotNull TrainingVo v) {
                PromotePlace promotePlaceInvoke = function0.invoke();
                if (promotePlaceInvoke == null) {
                    return;
                }
                AnalyticsHelper.INSTANCE.countPromotionalCourseVisit(position, v.getId(), promotePlaceInvoke);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(BaseCourseListAdapter baseCourseListAdapter, RecyclerView.ViewHolder viewHolder, View view) {
        TrainingVo item = baseCourseListAdapter.getItem(viewHolder.getAdapterPosition());
        Function2<Integer, TrainingVo, Unit> onItemClickListener = baseCourseListAdapter.getOnItemClickListener();
        if (onItemClickListener == null) {
            return;
        }
        onItemClickListener.invoke(Integer.valueOf(viewHolder.getAdapterPosition()), item);
    }

    public abstract void bindViewHolder(@NotNull RecyclerView.ViewHolder holder, @NotNull TrainingVo item);

    @Nullable
    public final Function2<Integer, TrainingVo, Unit> getOnItemClickListener() {
        return this.onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        TrainingVo item = getItem(position);
        if (item == null) {
            return;
        }
        bindViewHolder(holder, item);
        put(item, position);
    }

    @NotNull
    public abstract RecyclerView.ViewHolder onCreateCustomViewHolder(@NotNull ViewGroup parent, int viewType);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        final RecyclerView.ViewHolder viewHolderOnCreateCustomViewHolder = onCreateCustomViewHolder(parent, viewType);
        viewHolderOnCreateCustomViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: rp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseCourseListAdapter.b(this.a, viewHolderOnCreateCustomViewHolder, view);
            }
        });
        return viewHolderOnCreateCustomViewHolder;
    }

    public final void setOnItemClickListener(@Nullable Function2<? super Integer, ? super TrainingVo, Unit> function2) {
        this.onItemClickListener = function2;
    }
}
