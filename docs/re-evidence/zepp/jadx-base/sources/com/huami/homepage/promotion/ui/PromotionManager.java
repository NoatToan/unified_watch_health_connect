package com.huami.homepage.promotion.ui;

import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.homepage.promotion.beans.PromotionVo;
import com.huami.homepage.promotion.server.PromotionDeleteManager;
import com.huami.homepage.promotion.ui.PromotionManager;
import com.huami.homepage.promotion.ui.adapter.PromotionAdapter;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B¨\u0001\u0012\u0006\u0010!\u001a\u00020 \u00126\u0010*\u001a2\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110'¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b((\u0012\u0004\u0012\u00020)0\"\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012K\u00101\u001aG\u0012\u0013\u0012\u00110,¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110.¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020)0+¢\u0006\u0004\b2\u00103R%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R%\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0019\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u00064"}, d2 = {"Lcom/huami/homepage/promotion/ui/PromotionManager;", "", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/homepage/promotion/beans/PromotionVo;", "a", "Landroidx/lifecycle/LiveData;", "getDataSource", "()Landroidx/lifecycle/LiveData;", ParamKey.dataSource, "Lcom/huami/homepage/promotion/ui/adapter/PromotionAdapter;", "b", "Lcom/huami/homepage/promotion/ui/adapter/PromotionAdapter;", "adapter", "Lcom/huami/homepage/promotion/server/PromotionDeleteManager;", "c", "Lkotlin/Lazy;", "e", "()Lcom/huami/homepage/promotion/server/PromotionDeleteManager;", "deleteManager", "Landroidx/lifecycle/MutableLiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "_filterDataSource", "getFilterDataSource", "filterDataSource", "Landroidx/recyclerview/widget/RecyclerView;", "f", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlin/Function2;", "Landroid/widget/ImageView;", "Lkotlin/ParameterName;", "name", "imageView", "", "url", "", "loadImage", "Lkotlin/Function3;", "Landroid/view/View;", "v", "", "position", "item", "onItemClickListener", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function2;Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function3;)V", "promotion_release"}, k = 1, mv = {1, 5, 1})
public final class PromotionManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<PromotionVo>> dataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PromotionAdapter adapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<PromotionVo>> _filterDataSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<PromotionVo>> filterDataSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final RecyclerView recyclerView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "listSize", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function3<Integer, Integer, Integer, Unit> {
        public a() {
            super(3);
        }

        public final void a(int i, int i2, int i3) {
            if (i3 == 0) {
                PromotionManager.this._filterDataSource.postValue(CollectionsKt__CollectionsKt.emptyList());
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2.intValue(), num3.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/homepage/promotion/server/PromotionDeleteManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<PromotionDeleteManager> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PromotionDeleteManager invoke() {
            return new PromotionDeleteManager();
        }
    }

    public PromotionManager(@NotNull FragmentActivity fragmentActivity, @NotNull Function2<? super ImageView, ? super String, Unit> function2, @NotNull LiveData<List<PromotionVo>> liveData, @NotNull Function3<? super View, ? super Integer, ? super PromotionVo, Unit> function3) {
        this.dataSource = liveData;
        PromotionAdapter promotionAdapter = new PromotionAdapter(function2, function3);
        promotionAdapter.setDeleteListener(new a());
        Unit unit = Unit.INSTANCE;
        this.adapter = promotionAdapter;
        this.deleteManager = LazyKt__LazyJVMKt.lazy(b.a);
        MutableLiveData<List<PromotionVo>> mutableLiveData = new MutableLiveData<>();
        this._filterDataSource = mutableLiveData;
        this.filterDataSource = mutableLiveData;
        RecyclerView recyclerView = new RecyclerView(fragmentActivity);
        recyclerView.setAdapter(promotionAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new com.huami.homepage.promotion.ui.a(PromotionManagerKt.a(recyclerView.getContext(), 15)));
        recyclerView.setNestedScrollingEnabled(false);
        this.recyclerView = recyclerView;
        liveData.observe(fragmentActivity, new Observer() { // from class: o46
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PromotionManager.c(this.a, (List) obj);
            }
        });
        mutableLiveData.observe(fragmentActivity, new Observer() { // from class: n46
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PromotionManager.d(this.a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(PromotionManager promotionManager, List list) {
        MutableLiveData<List<PromotionVo>> mutableLiveData = promotionManager._filterDataSource;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (promotionManager.e().isIdNeedShow(((PromotionVo) obj).getId())) {
                arrayList.add(obj);
            }
        }
        mutableLiveData.setValue(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(PromotionManager promotionManager, List list) {
        promotionManager.adapter.setNewData(list);
    }

    private final PromotionDeleteManager e() {
        return (PromotionDeleteManager) this.deleteManager.getValue();
    }

    @NotNull
    public final LiveData<List<PromotionVo>> getDataSource() {
        return this.dataSource;
    }

    @NotNull
    public final LiveData<List<PromotionVo>> getFilterDataSource() {
        return this.filterDataSource;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }
}
