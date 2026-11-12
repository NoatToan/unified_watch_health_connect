package com.xiaomi.fitness.sport.view.tab.adapter;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.bean.RecommendSportListBean;
import com.xiaomi.fitness.sport.view.BaseSportItemView;
import com.xiaomi.fitness.sport.view.ISportTabItemData;
import com.xiaomi.fitness.sport.view.adapter.RecommendAdapter;
import com.xiaomi.fitness.sport.view.tab.adapter.RecommendSportView;
import defpackage.dvi;
import defpackage.gak;
import defpackage.pz9;
import defpackage.twq;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sport/view/tab/adapter/RecommendSportView;", "Lcom/xiaomi/fitness/sport/view/BaseSportItemView;", "Ltwq;", "Lcom/xiaomi/fitness/sport/bean/RecommendSportListBean;", "Lcom/xiaomi/fitness/sport/view/ISportTabItemData;", "Landroid/content/Context;", "context", "", "initView", "(Landroid/content/Context;)V", "", "getLayoutId", "()I", "data", "setDataToView", "(Lcom/xiaomi/fitness/sport/bean/RecommendSportListBean;)V", "", "isExpandedState", "Z", "countPerRow", "I", "Lcom/xiaomi/fitness/sport/view/adapter/RecommendAdapter;", "recommendAdapter$delegate", "Lkotlin/Lazy;", "getRecommendAdapter", "()Lcom/xiaomi/fitness/sport/view/adapter/RecommendAdapter;", "recommendAdapter", "<init>", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RecommendSportView extends BaseSportItemView<twq, RecommendSportListBean> implements ISportTabItemData<RecommendSportListBean> {
    private final int countPerRow;
    private final boolean isExpandedState;

    /* JADX INFO: renamed from: recommendAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recommendAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendSportView(@NotNull Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = SystemProperties.INSTANCE.isFoldDisplay() && !pz9.b(context);
        this.isExpandedState = z;
        this.countPerRow = z ? 2 : 1;
        this.recommendAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ljj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendSportView.recommendAdapter_delegate$lambda$0();
            }
        });
        initView(context);
    }

    private final RecommendAdapter getRecommendAdapter() {
        return (RecommendAdapter) this.recommendAdapter.getValue();
    }

    private final void initView(Context context) {
        RecyclerView recyclerView;
        twq binding = getBinding();
        if (binding == null || (recyclerView = binding.A) == null) {
            return;
        }
        recyclerView.addItemDecoration(new gak(ExtUtilsKt.getDp(12), ExtUtilsKt.getDp(13)));
        recyclerView.setAdapter(getRecommendAdapter());
        new LinearLayoutManager(context).setOrientation(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendAdapter recommendAdapter_delegate$lambda$0() {
        return new RecommendAdapter();
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView
    public int getLayoutId() {
        return dvi.M1;
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView
    public void setDataToView(@NotNull RecommendSportListBean data) {
        TextView textView;
        RecyclerView recyclerView;
        TextView textView2;
        TextView textView3;
        Intrinsics.checkNotNullParameter(data, "data");
        int categoryRes = data.getCategoryRes();
        if (categoryRes > 0) {
            twq binding = getBinding();
            if (binding != null && (textView3 = binding.B) != null) {
                textView3.setText(ApplicationExtKt.getApplication().getText(categoryRes));
            }
            twq binding2 = getBinding();
            if (binding2 != null && (textView2 = binding2.B) != null) {
                ViewExtKt.setVisible(textView2, true);
            }
        } else {
            twq binding3 = getBinding();
            if (binding3 != null && (textView = binding3.B) != null) {
                ViewExtKt.setVisible(textView, false);
            }
        }
        getRecommendAdapter().setData(data.getData());
        final int size = data.getData().size();
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) ApplicationExtKt.getApplication(), this.countPerRow, 1, false);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.sport.view.tab.adapter.RecommendSportView$setDataToView$gridLayoutManager$1$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                if (size == 1) {
                    return this.countPerRow;
                }
                return 1;
            }
        });
        twq binding4 = getBinding();
        if (binding4 == null || (recyclerView = binding4.A) == null) {
            return;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
    }
}
