package com.xiaomi.hm.health.training.ui.adapter;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.xiaomi.hm.health.training.api.entity.FeaturedCourseListItem;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.training.ui.adapter.viewholder.FeaturedCourseViewHolder;
import com.xiaomi.hm.health.training.ui.adapter.viewholder.LoadMoreViewHolder;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseListAdapter extends PagedListAdapter<FeaturedCourseListItem, RecyclerView.ViewHolder> {
    private static final int e = 1;
    private static final int f = 2;
    private static final DiffUtil.ItemCallback<FeaturedCourseListItem> g = new a();
    private Runnable a;
    private Resource<Void> b;
    private OnItemClickListener c;
    private SparseArray<String> d;

    public interface OnItemClickListener {
        void onItemClick(FeaturedCourseListAdapter featuredCourseListAdapter, View view, int i, FeaturedCourseListItem featuredCourseListItem);
    }

    public class a extends DiffUtil.ItemCallback<FeaturedCourseListItem> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(FeaturedCourseListItem featuredCourseListItem, FeaturedCourseListItem featuredCourseListItem2) {
            return TextUtils.equals(featuredCourseListItem.id, featuredCourseListItem2.id);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(FeaturedCourseListItem featuredCourseListItem, FeaturedCourseListItem featuredCourseListItem2) {
            return featuredCourseListItem == featuredCourseListItem2;
        }
    }

    public FeaturedCourseListAdapter(Runnable runnable) {
        super(g);
        this.d = new SparseArray<>();
        this.a = runnable;
    }

    private boolean b() {
        Resource<Void> resource = this.b;
        return (resource == null || resource.getStatus() == Status.SUCCESS) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(FeaturedCourseViewHolder featuredCourseViewHolder, View view) {
        if (this.c != null) {
            int layoutPosition = featuredCourseViewHolder.getLayoutPosition();
            this.c.onItemClick(this, view, layoutPosition, getItem(layoutPosition));
        }
    }

    @Override // androidx.paging.PagedListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return super.getPagerCount() + (b() ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (b() && i == getPagerCount() - 1) ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            ((LoadMoreViewHolder) viewHolder).bind(this.b);
            return;
        }
        if (itemViewType != 2) {
            return;
        }
        FeaturedCourseListItem item = getItem(i);
        ((FeaturedCourseViewHolder) viewHolder).bind(getItem(i));
        String str = item != null ? item.id : EcgData.DEFAULT_DIGIT_VALUE;
        String str2 = this.d.get(i);
        if (str2 == null || !TextUtils.equals(str2, str)) {
            this.d.put(i, str);
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.FEATURED_ARTICLE_CONTENT_V).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, str).addExtra("Position", String.valueOf(i)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 1) {
            return LoadMoreViewHolder.create(viewGroup, this.a);
        }
        if (i == 2) {
            final FeaturedCourseViewHolder featuredCourseViewHolderCreate = FeaturedCourseViewHolder.create(viewGroup);
            featuredCourseViewHolderCreate.itemView.setOnClickListener(new View.OnClickListener() { // from class: t12
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.c(featuredCourseViewHolderCreate, view);
                }
            });
            return featuredCourseViewHolderCreate;
        }
        throw new IllegalArgumentException("unknown view type " + i);
    }

    public void setNetworkState(@Nullable Resource<Void> resource) {
        Resource<Void> resource2 = this.b;
        boolean zB = b();
        this.b = resource;
        boolean zB2 = b();
        if (zB != zB2) {
            if (zB) {
                notifyItemRemoved(super.getPagerCount());
                return;
            } else {
                notifyItemInserted(super.getPagerCount());
                return;
            }
        }
        if (!zB2 || resource2 == resource) {
            return;
        }
        notifyItemChanged(getPagerCount() - 1);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.c = onItemClickListener;
    }
}
