package com.mi.health.course.adapter;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.course.export.data.CourseCatalogFilter;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.zp4;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0019B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tH\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/mi/health/course/adapter/CatalogCourseTabAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mi/health/course/adapter/CatalogCourseTabAdapter$Holder;", "Landroid/view/View$OnClickListener;", "groups", "", "Lcom/mi/health/course/export/data/CourseCatalogFilter;", "onTabClick", "Lkotlin/Function1;", "", "", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "onClick", "v", "Landroid/view/View;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "clearState", "Holder", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCatalogCourseTabAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogCourseTabAdapter.kt\ncom/mi/health/course/adapter/CatalogCourseTabAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1863#2,2:56\n1863#2,2:58\n*S KotlinDebug\n*F\n+ 1 CatalogCourseTabAdapter.kt\ncom/mi/health/course/adapter/CatalogCourseTabAdapter\n*L\n23#1:56,2\n52#1:58,2\n*E\n"})
public final class CatalogCourseTabAdapter extends RecyclerView.Adapter<Holder> implements View.OnClickListener {

    @NotNull
    private final List<CourseCatalogFilter> groups;

    @NotNull
    private final Function1<Integer, Unit> onTabClick;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/mi/health/course/adapter/CatalogCourseTabAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lzp4;", "bind", "Lzp4;", "getBind", "()Lzp4;", "<init>", "(Lzp4;)V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Holder extends RecyclerView.d0 {

        @NotNull
        private final zp4 bind;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull zp4 bind) {
            super(bind.getRoot());
            Intrinsics.checkNotNullParameter(bind, "bind");
            this.bind = bind;
        }

        @NotNull
        public final zp4 getBind() {
            return this.bind;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogCourseTabAdapter(@NotNull List<CourseCatalogFilter> groups, @NotNull Function1<? super Integer, Unit> onTabClick) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(onTabClick, "onTabClick");
        this.groups = groups;
        this.onTabClick = onTabClick;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void clearState() {
        Iterator<T> it = this.groups.iterator();
        while (it.hasNext()) {
            ((CourseCatalogFilter) it.next()).setSelected(false);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.groups.size();
    }

    @Override // android.view.View.OnClickListener
    @SuppressLint({"NotifyDataSetChanged"})
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Object tag = v.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        Integer num = (Integer) tag;
        int iIntValue = num.intValue();
        this.onTabClick.invoke2(num);
        Iterator<Integer> it = CollectionsKt__CollectionsKt.getIndices(this.groups).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            this.groups.get(iNextInt).setSelected(iIntValue == iNextInt);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        int i;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setTag(Integer.valueOf(position));
        TextView titleView = holder.getBind().A;
        Intrinsics.checkNotNullExpressionValue(titleView, "titleView");
        ViewGroup.LayoutParams layoutParams = titleView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i2 = position % 3;
        if (i2 == 0) {
            i = 8388627;
        } else {
            i = i2 == 1 ? 17 : 8388629;
        }
        layoutParams2.gravity = i;
        titleView.setSelected(this.groups.get(position).getSelected());
        titleView.setText(this.groups.get(position).getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        zp4 zp4VarA0 = zp4.A0(ExtUtilsKt.getInflater(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(zp4VarA0, "inflate(...)");
        zp4VarA0.getRoot().setOnClickListener(this);
        return new Holder(zp4VarA0);
    }
}
