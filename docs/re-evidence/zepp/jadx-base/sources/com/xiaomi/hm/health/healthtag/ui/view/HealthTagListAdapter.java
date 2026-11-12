package com.xiaomi.hm.health.healthtag.ui.view;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.hm.health.healthtag.core.dto.HealthDataTagType;
import com.xiaomi.hm.health.healthtag.core.dto.TagInfoDto;
import com.xiaomi.hm.health.healthtag.ui.view.HealthTagListAdapter;
import com.xiaomi.hm.health.healthtag.ui.vo.TagInfoVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0017J\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0011J\u001c\u0010\u0018\u001a\u00020\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000b0\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0007R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010 \u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/ui/view/HealthTagListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/xiaomi/hm/health/healthtag/core/dto/TagInfoDto;", "data", "updateData", "Lcom/xiaomi/hm/health/healthtag/ui/vo/TagInfoVo;", "item", "setSelected", "", "has", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "cancelSelect", "", "a", "Ljava/util/List;", "tagList", "b", "Lkotlin/jvm/functions/Function1;", "mListener", "c", "Lcom/xiaomi/hm/health/healthtag/ui/vo/TagInfoVo;", "mSelectItem", "<init>", "(Ljava/util/List;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthTagListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<TagInfoVo> tagList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function1<? super TagInfoVo, Unit> mListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private TagInfoVo mSelectItem;

    public HealthTagListAdapter(@NotNull List<TagInfoVo> list) {
        this.tagList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(HealthTagListAdapter healthTagListAdapter, int i, View view) {
        TagInfoVo tagInfoVo;
        TagInfoVo tagInfoVo2 = healthTagListAdapter.tagList.get(i);
        if (!Intrinsics.areEqual(healthTagListAdapter.mSelectItem, tagInfoVo2) && (tagInfoVo = healthTagListAdapter.mSelectItem) != null) {
            tagInfoVo.setSelect(false);
        }
        if (tagInfoVo2.getTagType() == HealthDataTagType.INSTANCE.getADD()) {
            Function1<? super TagInfoVo, Unit> function1 = healthTagListAdapter.mListener;
            if (function1 == null) {
                return;
            }
            function1.invoke(tagInfoVo2);
            return;
        }
        tagInfoVo2.setSelect(!tagInfoVo2.isSelect());
        if (!tagInfoVo2.isSelect()) {
            tagInfoVo2 = null;
        }
        healthTagListAdapter.mSelectItem = tagInfoVo2;
        healthTagListAdapter.notifyDataSetChanged();
        Function1<? super TagInfoVo, Unit> function2 = healthTagListAdapter.mListener;
        if (function2 == null) {
            return;
        }
        function2.invoke(healthTagListAdapter.mSelectItem);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void cancelSelect() {
        TagInfoVo tagInfoVo = this.mSelectItem;
        if (tagInfoVo != null) {
            tagInfoVo.setSelect(false);
        }
        this.mSelectItem = null;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.tagList.size();
    }

    public final boolean has(@NotNull TagInfoVo item) {
        Iterator<T> it2 = this.tagList.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual((TagInfoVo) it2.next(), item)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"NotifyDataSetChanged"})
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof TagHolder) {
            ((TagHolder) holder).bindTo(this.tagList.get(position));
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: yx3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HealthTagListAdapter.b(this.a, position, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new TagHolder(parent);
    }

    public final void setOnItemClickListener(@NotNull Function1<? super TagInfoVo, Unit> listener) {
        this.mListener = listener;
    }

    public final void setSelected(@NotNull TagInfoVo item) {
        TagInfoVo tagInfoVo = this.mSelectItem;
        if (tagInfoVo != null) {
            tagInfoVo.setSelect(false);
        }
        this.mSelectItem = item;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateData(@NotNull List<TagInfoDto> data) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
        for (TagInfoDto tagInfoDto : data) {
            arrayList.add(new TagInfoVo(tagInfoDto.getTag(), tagInfoDto.getTagType(), false));
        }
        List<TagInfoVo> list = this.tagList;
        list.clear();
        list.addAll(arrayList);
        for (TagInfoVo tagInfoVo : this.tagList) {
            if (Intrinsics.areEqual(tagInfoVo, this.mSelectItem)) {
                tagInfoVo.setSelect(true);
                this.mSelectItem = tagInfoVo;
            }
        }
        notifyDataSetChanged();
    }
}
