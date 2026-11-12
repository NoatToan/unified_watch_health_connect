package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.summary.recycler.SportBehaviorAdapter;
import com.xiaomi.fitness.summary.recycler.SportBehaviorModel;
import com.xiaomi.fitness.widget.view.DividerView;
import defpackage.bl5;
import defpackage.hoi;
import defpackage.iod;
import defpackage.j1j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportDetailBehaviorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "initRecycler", "()V", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "setActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "", "Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;", "sportBehaviorModelList", "bindData", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/summary/recycler/SportBehaviorAdapter;", "mBehaviorAdapter", "Lcom/xiaomi/fitness/summary/recycler/SportBehaviorAdapter;", "", "mDataListBehavior", "Ljava/util/List;", "Liod;", "binding", "Liod;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerBehavior", "Landroidx/recyclerview/widget/RecyclerView;", "mActivity", "Landroidx/fragment/app/FragmentActivity;", "Landroid/view/View$OnClickListener;", "mClickListener", "Landroid/view/View$OnClickListener;", "getMClickListener", "()Landroid/view/View$OnClickListener;", "setMClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportDetailBehaviorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailBehaviorView.kt\ncom/xiaomi/fitness/detail/view/SportDetailBehaviorView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1863#2,2:117\n*S KotlinDebug\n*F\n+ 1 SportDetailBehaviorView.kt\ncom/xiaomi/fitness/detail/view/SportDetailBehaviorView\n*L\n75#1:117,2\n*E\n"})
public final class SportDetailBehaviorView extends ConstraintLayout {

    @NotNull
    private final iod binding;

    @Nullable
    private FragmentActivity mActivity;
    private SportBehaviorAdapter mBehaviorAdapter;

    @Nullable
    private View.OnClickListener mClickListener;
    private List<SportBehaviorModel> mDataListBehavior;

    @NotNull
    private RecyclerView recyclerBehavior;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportDetailBehaviorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initRecycler() {
        this.mDataListBehavior = new ArrayList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.detail.view.SportDetailBehaviorView.initRecycler.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                SportBehaviorAdapter sportBehaviorAdapter = SportDetailBehaviorView.this.mBehaviorAdapter;
                if (sportBehaviorAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBehaviorAdapter");
                    sportBehaviorAdapter = null;
                }
                return sportBehaviorAdapter.getItemAsPosition(position).h;
            }
        });
        this.recyclerBehavior.setLayoutManager(gridLayoutManager);
        this.recyclerBehavior.addItemDecoration(new bl5(false));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        List<SportBehaviorModel> list = this.mDataListBehavior;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataListBehavior");
            list = null;
        }
        SportBehaviorAdapter sportBehaviorAdapter = new SportBehaviorAdapter(context, list);
        this.mBehaviorAdapter = sportBehaviorAdapter;
        this.recyclerBehavior.setAdapter(sportBehaviorAdapter);
    }

    public final void bindData(@NotNull List<? extends SportBehaviorModel> sportBehaviorModelList) {
        Intrinsics.checkNotNullParameter(sportBehaviorModelList, "sportBehaviorModelList");
        this.binding.I.setGuideIcon(hoi.K0, this.mClickListener);
        List<SportBehaviorModel> list = this.mDataListBehavior;
        SportBehaviorAdapter sportBehaviorAdapter = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataListBehavior");
            list = null;
        }
        if (list.size() > 0) {
            List<SportBehaviorModel> list2 = this.mDataListBehavior;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDataListBehavior");
                list2 = null;
            }
            list2.clear();
        }
        ArrayList arrayList = new ArrayList();
        for (SportBehaviorModel sportBehaviorModel : sportBehaviorModelList) {
            int i = sportBehaviorModel.f13232a;
            if (i == 0) {
                DividerView dividerView = this.binding.D;
                Intrinsics.checkNotNullExpressionValue(dividerView, "dividerView");
                ViewExtKt.visible(dividerView);
                List<SportBehaviorModel> list3 = this.mDataListBehavior;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDataListBehavior");
                    list3 = null;
                }
                list3.add(sportBehaviorModel);
            } else if (i == 4) {
                this.binding.I.bindData(hoi.R1, getContext().getString(j1j.W3));
                this.binding.I.hideGuideIcon();
                DividerView dividerView2 = this.binding.D;
                Intrinsics.checkNotNullExpressionValue(dividerView2, "dividerView");
                ViewExtKt.visible(dividerView2);
                this.binding.A.setVisibility(0);
                this.binding.C.setText(sportBehaviorModel.e);
                this.binding.B.setText(sportBehaviorModel.g);
            } else {
                int i2 = sportBehaviorModel.d;
                if (i2 == 3 || i2 == 2) {
                    this.binding.I.bindData(hoi.R1, getContext().getString(j1j.W3));
                    this.binding.I.hideGuideIcon();
                }
                arrayList.add(sportBehaviorModel);
            }
        }
        List<SportBehaviorModel> list4 = this.mDataListBehavior;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDataListBehavior");
            list4 = null;
        }
        if (!list4.isEmpty()) {
            ViewExtKt.visible(this.recyclerBehavior);
            SportBehaviorAdapter sportBehaviorAdapter2 = this.mBehaviorAdapter;
            if (sportBehaviorAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBehaviorAdapter");
            } else {
                sportBehaviorAdapter = sportBehaviorAdapter2;
            }
            sportBehaviorAdapter.notifyDataSetChanged();
        } else {
            ViewExtKt.gone(this.recyclerBehavior);
        }
        if (!arrayList.isEmpty()) {
            SportsBehaviorCircleView leftCircleView = this.binding.E;
            Intrinsics.checkNotNullExpressionValue(leftCircleView, "leftCircleView");
            ViewExtKt.visible(leftCircleView);
            this.binding.E.updateView((SportBehaviorModel) arrayList.get(0));
            if (arrayList.size() > 1) {
                SportsBehaviorCircleView rightCircleView = this.binding.H;
                Intrinsics.checkNotNullExpressionValue(rightCircleView, "rightCircleView");
                ViewExtKt.visible(rightCircleView);
                this.binding.H.updateView((SportBehaviorModel) arrayList.get(1));
                if (arrayList.size() > 2) {
                    SportsBehaviorCircleView midCircleView = this.binding.F;
                    Intrinsics.checkNotNullExpressionValue(midCircleView, "midCircleView");
                    ViewExtKt.visible(midCircleView);
                    this.binding.F.updateView((SportBehaviorModel) arrayList.get(2));
                }
            }
        }
    }

    @Nullable
    public final View.OnClickListener getMClickListener() {
        return this.mClickListener;
    }

    public final void setActivity(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.mActivity = activity;
        SportBehaviorAdapter sportBehaviorAdapter = this.mBehaviorAdapter;
        if (sportBehaviorAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBehaviorAdapter");
            sportBehaviorAdapter = null;
        }
        sportBehaviorAdapter.setActivity(this.mActivity);
    }

    public final void setMClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportDetailBehaviorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SportDetailBehaviorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportDetailBehaviorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        iod iodVarA0 = iod.A0(LayoutInflater.from(context), this, true);
        this.binding = iodVarA0;
        this.recyclerBehavior = iodVarA0.G;
        iodVarA0.I.bindData(hoi.P1, context.getString(j1j.T2));
        initRecycler();
    }
}
