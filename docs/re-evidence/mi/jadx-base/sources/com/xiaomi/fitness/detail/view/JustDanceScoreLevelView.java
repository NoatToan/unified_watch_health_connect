package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.npp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/detail/view/JustDanceScoreLevelView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mJustDanceScoreLevelListView", "Landroidx/recyclerview/widget/RecyclerView;", "initView", "", "initData", "score", "level", "isBigView", "", "Companion", "JustDanceScoreLevelAdapter", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JustDanceScoreLevelView extends ConstraintLayout {
    private RecyclerView mJustDanceScoreLevelListView;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/detail/view/JustDanceScoreLevelView$JustDanceScoreLevelAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/detail/view/JustDanceScoreLevelView$JustDanceScoreLevelAdapter$JustDanceCoverViewHolder;", "score", "", "dataList", "", "isBigView", "", "<init>", "(ILjava/util/List;Z)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "", "holder", "position", "JustDanceCoverViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class JustDanceScoreLevelAdapter extends RecyclerView.Adapter<JustDanceCoverViewHolder> {

        @NotNull
        private final List<Integer> dataList;
        private final boolean isBigView;
        private final int score;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/detail/view/JustDanceScoreLevelView$JustDanceScoreLevelAdapter$JustDanceCoverViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "score", "num", "", "updateItem", "(II)V", "Lnpp;", "binding", "Lnpp;", "getBinding", "()Lnpp;", "<init>", "(Lnpp;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        public static final class JustDanceCoverViewHolder extends RecyclerView.d0 {

            @NotNull
            private final npp binding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JustDanceCoverViewHolder(@NotNull npp binding) {
                super(binding.getRoot());
                Intrinsics.checkNotNullParameter(binding, "binding");
                this.binding = binding;
            }

            @NotNull
            public final npp getBinding() {
                return this.binding;
            }

            public final void updateItem(int score, int num) {
                if (num < 5) {
                    this.binding.A.setBackground(ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), hoi.X1));
                    return;
                }
                if (score >= 12000) {
                    this.binding.A.setBackground(ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), hoi.Z1));
                } else if (score >= 11000) {
                    this.binding.A.setBackground(ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), hoi.Y1));
                } else {
                    this.binding.A.setBackground(ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), hoi.X1));
                }
            }
        }

        public /* synthetic */ JustDanceScoreLevelAdapter(int i, List list, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, list, (i2 & 4) != 0 ? false : z);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.dataList.size();
        }

        public JustDanceScoreLevelAdapter(int i, @NotNull List<Integer> dataList, boolean z) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            this.score = i;
            this.dataList = dataList;
            this.isBigView = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull JustDanceCoverViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            ViewGroup.LayoutParams layoutParams = holder.getBinding().A.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (position == 0) {
                layoutParams2.setMarginStart(ExtUtilsKt.getDp(Float.valueOf(0.0f)));
            } else {
                layoutParams2.setMarginStart(ExtUtilsKt.getDp(Float.valueOf(-4.0f)));
            }
            if (this.isBigView) {
                ImageView trailSportReportStar = holder.getBinding().A;
                Intrinsics.checkNotNullExpressionValue(trailSportReportStar, "trailSportReportStar");
                ViewExtKt.setWidth(trailSportReportStar, ExtUtilsKt.getDp(Float.valueOf(28.0f)));
                ImageView trailSportReportStar2 = holder.getBinding().A;
                Intrinsics.checkNotNullExpressionValue(trailSportReportStar2, "trailSportReportStar");
                ViewExtKt.setHeight(trailSportReportStar2, ExtUtilsKt.getDp(Float.valueOf(28.0f)));
            }
            holder.updateItem(this.score, this.dataList.size());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public JustDanceCoverViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            npp nppVarA0 = npp.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(nppVarA0, "inflate(...)");
            return new JustDanceCoverViewHolder(nppVarA0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JustDanceScoreLevelView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void initData$default(JustDanceScoreLevelView justDanceScoreLevelView, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        justDanceScoreLevelView.initData(i, i2, z);
    }

    private final void initView(Context context, AttributeSet attrs, int defStyleAttr) {
        this.mJustDanceScoreLevelListView = (RecyclerView) LayoutInflater.from(context).inflate(ivi.D1, this).findViewById(bsi.s3);
    }

    public final void initData(int score, int level, boolean isBigView) {
        ArrayList arrayList = new ArrayList();
        int iMin = Math.min(level, 5);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        JustDanceScoreLevelAdapter justDanceScoreLevelAdapter = new JustDanceScoreLevelAdapter(score, arrayList, isBigView);
        RecyclerView recyclerView = this.mJustDanceScoreLevelListView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mJustDanceScoreLevelListView");
            recyclerView = null;
        }
        recyclerView.setAdapter(justDanceScoreLevelAdapter);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JustDanceScoreLevelView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JustDanceScoreLevelView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context, attributeSet, i);
    }
}
