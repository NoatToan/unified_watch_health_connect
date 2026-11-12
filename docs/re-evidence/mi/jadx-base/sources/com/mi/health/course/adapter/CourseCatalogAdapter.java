package com.mi.health.course.adapter;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.course.adapter.CourseCatalogAdapter;
import com.mi.health.course.export.data.CourseCatalogCategory;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bli;
import defpackage.xp4;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u001c\u0010\u001a\u001a\u00020\t2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/mi/health/course/adapter/CourseCatalogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mi/health/course/adapter/CourseCatalogAdapter$Holder;", "catalogList", "", "Lcom/mi/health/course/export/data/CourseCatalogCategory;", "clickAction", "Lkotlin/Function1;", "", "", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "dpCorner", "", "getDpCorner", "()F", "dpCorner$delegate", "Lkotlin/Lazy;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "Holder", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseCatalogAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    private final List<CourseCatalogCategory> catalogList;

    @NotNull
    private final Function1<Integer, Unit> clickAction;

    /* JADX INFO: renamed from: dpCorner$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dpCorner;
    private final LayoutInflater inflater;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/mi/health/course/adapter/CourseCatalogAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "bind", "(I)V", "Lxp4;", "itemBinding", "Lxp4;", "<init>", "(Lcom/mi/health/course/adapter/CourseCatalogAdapter;Lxp4;)V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class Holder extends RecyclerView.d0 {

        @NotNull
        private final xp4 itemBinding;
        final /* synthetic */ CourseCatalogAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull CourseCatalogAdapter courseCatalogAdapter, xp4 itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.this$0 = courseCatalogAdapter;
            this.itemBinding = itemBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$1(CourseCatalogAdapter this$0, int i, ConstraintLayout it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            this$0.clickAction.invoke2(Integer.valueOf(i));
            return Unit.INSTANCE;
        }

        public final void bind(final int position) {
            CourseCatalogCategory courseCatalogCategory = (CourseCatalogCategory) this.this$0.catalogList.get(position);
            View viewCatalogSelected = this.itemBinding.C;
            Intrinsics.checkNotNullExpressionValue(viewCatalogSelected, "viewCatalogSelected");
            Boolean selected = courseCatalogCategory.getSelected();
            Boolean bool = Boolean.TRUE;
            ExtUtilsKt.setVisible(viewCatalogSelected, Intrinsics.areEqual(selected, bool));
            this.itemBinding.B.setText(courseCatalogCategory.getName());
            if (Intrinsics.areEqual(courseCatalogCategory.getSelected(), bool)) {
                this.itemBinding.A.setBackgroundResource(bli.course_catalog_select_color);
            } else {
                ConstraintLayout constraintLayout = this.itemBinding.A;
                GradientDrawable gradientDrawable = new GradientDrawable();
                CourseCatalogAdapter courseCatalogAdapter = this.this$0;
                ConstraintLayout clItem = this.itemBinding.A;
                Intrinsics.checkNotNullExpressionValue(clItem, "clItem");
                gradientDrawable.setColor(ViewExtKt.getColor(clItem, bli.course_catalog_unselect_color));
                CourseCatalogCategory courseCatalogCategory2 = (CourseCatalogCategory) CollectionsKt___CollectionsKt.getOrNull(courseCatalogAdapter.catalogList, position - 1);
                boolean zAreEqual = courseCatalogCategory2 != null ? Intrinsics.areEqual(courseCatalogCategory2.getSelected(), bool) : false;
                CourseCatalogCategory courseCatalogCategory3 = (CourseCatalogCategory) CollectionsKt___CollectionsKt.getOrNull(courseCatalogAdapter.catalogList, position + 1);
                boolean zAreEqual2 = courseCatalogCategory3 != null ? Intrinsics.areEqual(courseCatalogCategory3.getSelected(), bool) : false;
                float[] fArr = new float[8];
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = zAreEqual ? courseCatalogAdapter.getDpCorner() : 0.0f;
                fArr[3] = zAreEqual ? courseCatalogAdapter.getDpCorner() : 0.0f;
                fArr[4] = zAreEqual2 ? courseCatalogAdapter.getDpCorner() : 0.0f;
                fArr[5] = zAreEqual2 ? courseCatalogAdapter.getDpCorner() : 0.0f;
                fArr[6] = 0.0f;
                fArr[7] = 0.0f;
                gradientDrawable.setCornerRadii(fArr);
                constraintLayout.setBackground(gradientDrawable);
            }
            ConstraintLayout constraintLayout2 = this.itemBinding.A;
            final CourseCatalogAdapter courseCatalogAdapter2 = this.this$0;
            ViewExtKt.clickWithTrigger$default(constraintLayout2, 0L, new Function1() { // from class: op4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CourseCatalogAdapter.Holder.bind$lambda$1(courseCatalogAdapter2, position, (ConstraintLayout) obj);
                }
            }, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CourseCatalogAdapter(@NotNull List<CourseCatalogCategory> catalogList, @NotNull Function1<? super Integer, Unit> clickAction) {
        Intrinsics.checkNotNullParameter(catalogList, "catalogList");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        this.catalogList = catalogList;
        this.clickAction = clickAction;
        this.inflater = LayoutInflater.from(ApplicationExtKt.getApplication());
        this.dpCorner = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: np4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(CourseCatalogAdapter.dpCorner_delegate$lambda$0());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dpCorner_delegate$lambda$0() {
        return ExtUtilsKt.getDp(13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getDpCorner() {
        return ((Number) this.dpCorner.getValue()).floatValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.catalogList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        xp4 xp4VarA0 = xp4.A0(this.inflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(xp4VarA0, "inflate(...)");
        return new Holder(this, xp4VarA0);
    }
}
