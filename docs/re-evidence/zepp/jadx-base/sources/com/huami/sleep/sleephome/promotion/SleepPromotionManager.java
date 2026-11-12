package com.huami.sleep.sleephome.promotion;

import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleep.sleephome.promotion.SleepPromotionManager;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B¨\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u00126\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001d0\u0016\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012K\u0010%\u001aG\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u001d0\u001f¢\u0006\u0004\b&\u0010'R%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, d2 = {"Lcom/huami/sleep/sleephome/promotion/SleepPromotionManager;", "", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/sleep/sleephome/promotion/SleepPromotionVo;", "a", "Landroidx/lifecycle/LiveData;", "getDataSource", "()Landroidx/lifecycle/LiveData;", ParamKey.dataSource, "Lcom/huami/sleep/sleephome/promotion/SleepPromotionAdapter;", "b", "Lcom/huami/sleep/sleephome/promotion/SleepPromotionAdapter;", "adapter", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlin/Function2;", "Landroid/widget/ImageView;", "Lkotlin/ParameterName;", "name", "imageView", "", "url", "", "loadImage", "Lkotlin/Function3;", "Landroid/view/View;", "v", "", "position", "item", "onItemClickListener", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function2;Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function3;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepPromotionManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<SleepPromotionVo>> dataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SleepPromotionAdapter adapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final RecyclerView recyclerView;

    public SleepPromotionManager(@NotNull FragmentActivity fragmentActivity, @NotNull Function2<? super ImageView, ? super String, Unit> function2, @NotNull LiveData<List<SleepPromotionVo>> liveData, @NotNull Function3<? super View, ? super Integer, ? super SleepPromotionVo, Unit> function3) {
        this.dataSource = liveData;
        SleepPromotionAdapter sleepPromotionAdapter = new SleepPromotionAdapter(function2, function3);
        this.adapter = sleepPromotionAdapter;
        RecyclerView recyclerView = new RecyclerView(fragmentActivity);
        recyclerView.setAdapter(sleepPromotionAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new a(SleepPromotionManagerKt.a(recyclerView.getContext(), 15)));
        recyclerView.setNestedScrollingEnabled(false);
        Unit unit = Unit.INSTANCE;
        this.recyclerView = recyclerView;
        liveData.observe(fragmentActivity, new Observer() { // from class: d17
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepPromotionManager.b(this.a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SleepPromotionManager sleepPromotionManager, List list) {
        sleepPromotionManager.adapter.setNewData(list);
    }

    @NotNull
    public final LiveData<List<SleepPromotionVo>> getDataSource() {
        return this.dataSource;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }
}
