package com.mi.health.course.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.course.export.data.CourseCatalogFilterItem;
import com.mibi.sdk.component.Constants;
import defpackage.sti;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\n2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007J\u0006\u0010\u0018\u001a\u00020\nR\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/mi/health/course/adapter/CatalogCourseTagAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mi/health/course/adapter/CatalogCourseTagAdapter$Holder;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "tags", "", "Lcom/mi/health/course/export/data/CourseCatalogFilterItem;", "onClick", "", "v", "Landroid/view/View;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "setData", Constants.KEY_RECHARGE_VALUES, "resetTag", "Holder", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCatalogCourseTagAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogCourseTagAdapter.kt\ncom/mi/health/course/adapter/CatalogCourseTagAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n2642#2:54\n1#3:55\n*S KotlinDebug\n*F\n+ 1 CatalogCourseTagAdapter.kt\ncom/mi/health/course/adapter/CatalogCourseTagAdapter\n*L\n47#1:54\n47#1:55\n*E\n"})
public final class CatalogCourseTagAdapter extends RecyclerView.Adapter<Holder> implements View.OnClickListener {

    @Nullable
    private List<CourseCatalogFilterItem> tags;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/mi/health/course/adapter/CatalogCourseTagAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Holder extends RecyclerView.d0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<CourseCatalogFilterItem> list = this.tags;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        boolean z = !v.isSelected();
        v.setSelected(z);
        Object tag = v.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.mi.health.course.export.data.CourseCatalogFilterItem");
        ((CourseCatalogFilterItem) tag).setSelected(z);
    }

    public final void resetTag() {
        List<CourseCatalogFilterItem> list = this.tags;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((CourseCatalogFilterItem) it.next()).setSelected(false);
            }
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setData(@Nullable List<CourseCatalogFilterItem> values) {
        this.tags = values;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view;
        List<CourseCatalogFilterItem> list = this.tags;
        Intrinsics.checkNotNull(list);
        CourseCatalogFilterItem courseCatalogFilterItem = list.get(position);
        textView.setTag(courseCatalogFilterItem);
        textView.setText(courseCatalogFilterItem.getName());
        textView.setSelected(courseCatalogFilterItem.getSelected());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(sti.course_catalog_tag, parent, false);
        viewInflate.setOnClickListener(this);
        Intrinsics.checkNotNull(viewInflate);
        return new Holder(viewInflate);
    }
}
