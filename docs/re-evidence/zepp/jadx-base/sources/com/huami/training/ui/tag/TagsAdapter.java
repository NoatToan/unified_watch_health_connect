package com.huami.training.ui.tag;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.ui.common.CourseLayoutDelegate;
import com.huami.training.ui.common.MiFitCourseLayoutDelegate;
import com.huami.training.ui.tag.TagsAdapter;
import com.huami.training.vo.TagVo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005J\u0014\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0017¨\u0006%"}, d2 = {"Lcom/huami/training/ui/tag/TagsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/training/ui/tag/TagViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "selectItem", "", "Lcom/huami/training/vo/TagVo;", "newDataList", "setNewData", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", "a", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", "tagsDelegate", "b", LogUtil.I, "groupMargin", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "tagSelectedListener", "", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "dataList", "e", "selectedPos", "<init>", "(Lcom/huami/training/ui/common/CourseLayoutDelegate;ILkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class TagsAdapter extends RecyclerView.Adapter<TagViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CourseLayoutDelegate tagsDelegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int groupMargin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function1<TagVo, Unit> tagSelectedListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<TagVo> dataList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int selectedPos;

    public /* synthetic */ TagsAdapter(CourseLayoutDelegate courseLayoutDelegate, int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new MiFitCourseLayoutDelegate() : courseLayoutDelegate, (i2 & 2) != 0 ? 0 : i, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TagViewHolder tagViewHolder, TagsAdapter tagsAdapter, View view) {
        int adapterPosition = tagViewHolder.getAdapterPosition();
        TagVo tagVo = tagsAdapter.dataList.get(adapterPosition);
        tagsAdapter.selectedPos = adapterPosition;
        tagsAdapter.notifyDataSetChanged();
        tagsAdapter.tagSelectedListener.invoke(tagVo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.dataList.size();
    }

    public final void selectItem(int position) {
        this.selectedPos = position;
        notifyDataSetChanged();
    }

    public final void setNewData(@NotNull List<TagVo> newDataList) {
        List<TagVo> list = this.dataList;
        list.clear();
        list.addAll(newDataList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull TagViewHolder holder, int position) {
        holder.bind(this.dataList.get(position), position, this.selectedPos);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TagViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        int marginStart;
        final TagViewHolder tagViewHolder = new TagViewHolder(this.tagsDelegate, parent);
        ViewGroup.LayoutParams layoutParams = tagViewHolder.itemView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        int i = tagViewHolder.itemView.getContext().getResources().getDisplayMetrics().widthPixels - this.groupMargin;
        if (parent.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams3 = parent.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginStart = marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
        } else {
            marginStart = 0;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = (i - ((((layoutParams2.getMarginStart() * 4) + (layoutParams2.getMarginEnd() * 4)) + marginStart) + (parent.getPaddingStart() + parent.getPaddingEnd()))) / 4;
        tagViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: tk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TagsAdapter.b(tagViewHolder, this, view);
            }
        });
        return tagViewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TagsAdapter(@NotNull CourseLayoutDelegate courseLayoutDelegate, int i, @NotNull Function1<? super TagVo, Unit> function1) {
        this.tagsDelegate = courseLayoutDelegate;
        this.groupMargin = i;
        this.tagSelectedListener = function1;
        this.dataList = new ArrayList();
        this.selectedPos = -1;
    }
}
