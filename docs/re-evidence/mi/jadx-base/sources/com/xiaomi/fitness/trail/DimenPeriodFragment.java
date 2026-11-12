package com.xiaomi.fitness.trail;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.trail.DimenPeriodFragment;
import com.xiaomi.fitness.trail.adapter.IndicatorAdapter;
import com.xiaomi.fitness.trail.adapter.RecordPageAdapter;
import com.xiaomi.fitness.trail.viewmodel.RecordMainVM;
import defpackage.epp;
import defpackage.ivi;
import defpackage.tli;
import defpackage.wc0;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\nR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00040\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/xiaomi/fitness/trail/DimenPeriodFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/trail/viewmodel/RecordMainVM;", "Lepp;", "", "initAdapter", "()V", "", "pos", "indicatorScroll", "(I)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getSelectedStart", "()J", "getSelectedEnd", "setIndicatorPos", "", "timeDim", "Ljava/lang/String;", DailyRecordKey.sportType, "Lcom/xiaomi/fitness/trail/adapter/IndicatorAdapter;", "indicatorAdapter", "Lcom/xiaomi/fitness/trail/adapter/IndicatorAdapter;", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/trail/adapter/IndicatorAdapter$Indicator;", "onIndicatorClick", "Lkotlin/jvm/functions/Function1;", "<init>", "Lcom/xiaomi/fitness/trail/adapter/RecordPageAdapter;", "pageAdapter", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DimenPeriodFragment extends BaseBindingFragment<RecordMainVM, epp> {
    private IndicatorAdapter indicatorAdapter;

    @NotNull
    private final Function1<IndicatorAdapter.Indicator, Unit> onIndicatorClick;

    @NotNull
    private String sportType;
    private String timeDim;

    public DimenPeriodFragment() {
        super(ivi.S1, -1, true);
        this.sportType = "sport_stats_all";
        this.onIndicatorClick = new Function1() { // from class: nw6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DimenPeriodFragment.onIndicatorClick$lambda$0(this.f28500a, (IndicatorAdapter.Indicator) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void indicatorScroll(int pos) {
        getMBinding().A.scrollToPosition(pos);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAdapter() {
        long startMills = ((RecordMainVM) getMViewModel()).getStartMills();
        String str = this.timeDim;
        IndicatorAdapter indicatorAdapter = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeDim");
            str = null;
        }
        this.indicatorAdapter = new IndicatorAdapter(startMills, str, this.onIndicatorClick);
        getMBinding().A.setPadding(0, 0, (DisplayUtil.getScreenWidth() - (ExtUtilsKt.getDimension(tli.h) * 2)) / 2, 0);
        RecyclerView.o layoutManager = getMBinding().A.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).setStackFromEnd(true);
        RecyclerView recyclerView = getMBinding().A;
        IndicatorAdapter indicatorAdapter2 = this.indicatorAdapter;
        if (indicatorAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("indicatorAdapter");
            indicatorAdapter2 = null;
        }
        recyclerView.setAdapter(indicatorAdapter2);
        IndicatorAdapter indicatorAdapter3 = this.indicatorAdapter;
        if (indicatorAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("indicatorAdapter");
        } else {
            indicatorAdapter = indicatorAdapter3;
        }
        indicatorScroll(indicatorAdapter.getSelectedPos());
        Lazy lazy = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ow6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DimenPeriodFragment.initAdapter$lambda$1(this.f29756a);
            }
        });
        ViewPager2 viewPager2 = getMBinding().B;
        viewPager2.setAdapter(initAdapter$lambda$2(lazy));
        viewPager2.k(initAdapter$lambda$2(lazy).getCount() - 1, false);
        viewPager2.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.trail.DimenPeriodFragment$initAdapter$1$1
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int position) {
                IndicatorAdapter indicatorAdapter4 = this.this$0.indicatorAdapter;
                IndicatorAdapter indicatorAdapter5 = null;
                if (indicatorAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("indicatorAdapter");
                    indicatorAdapter4 = null;
                }
                if (indicatorAdapter4.getSelectedPos() != position) {
                    IndicatorAdapter indicatorAdapter6 = this.this$0.indicatorAdapter;
                    if (indicatorAdapter6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("indicatorAdapter");
                    } else {
                        indicatorAdapter5 = indicatorAdapter6;
                    }
                    indicatorAdapter5.setSelectedPos(position);
                    this.this$0.indicatorScroll(position);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecordPageAdapter initAdapter$lambda$1(DimenPeriodFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IndicatorAdapter indicatorAdapter = this$0.indicatorAdapter;
        if (indicatorAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("indicatorAdapter");
            indicatorAdapter = null;
        }
        return new RecordPageAdapter(this$0, indicatorAdapter, this$0.sportType);
    }

    private static final RecordPageAdapter initAdapter$lambda$2(Lazy<RecordPageAdapter> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onIndicatorClick$lambda$0(DimenPeriodFragment this$0, IndicatorAdapter.Indicator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.indicatorScroll(it.getPos());
        this$0.getMBinding().B.k(it.getPos(), false);
        return Unit.INSTANCE;
    }

    public final long getSelectedEnd() {
        IndicatorAdapter indicatorAdapter = this.indicatorAdapter;
        if (indicatorAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("indicatorAdapter");
            indicatorAdapter = null;
        }
        return indicatorAdapter.getCheckedEndMills();
    }

    public final long getSelectedStart() {
        IndicatorAdapter indicatorAdapter = this.indicatorAdapter;
        if (indicatorAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("indicatorAdapter");
            indicatorAdapter = null;
        }
        return indicatorAdapter.getStart();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.hide();
        }
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(RecordMainActivityKt.KEY_DIMEN)) == null) {
            string = SportDataTypeKt.DIMEN_MONTHLY;
        }
        this.timeDim = string;
        initAdapter();
    }

    public final void setIndicatorPos(int pos) {
        indicatorScroll(pos);
    }
}
