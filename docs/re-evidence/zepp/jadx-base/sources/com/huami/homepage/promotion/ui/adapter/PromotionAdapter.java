package com.huami.homepage.promotion.ui.adapter;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.homepage.promotion.beans.PromotionVo;
import com.huami.homepage.promotion.server.PromotionDeleteManager;
import com.huami.homepage.promotion.ui.adapter.PromotionAdapter;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0006*\u00015\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u008c\u0001\u00126\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\f0\u0012\u0012K\u0010\"\u001aG\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0004\b=\u0010>J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0016\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007RF\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\f0\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR[\u0010\"\u001aG\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\f0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*Ri\u00104\u001aI\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010!\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0017098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/huami/homepage/promotion/ui/adapter/PromotionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/homepage/promotion/ui/adapter/PromotionViewHolder;", "Lorg/koin/core/component/KoinComponent;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/huami/homepage/promotion/beans/PromotionVo;", "newData", "setNewData", "Lkotlin/Function2;", "Landroid/widget/ImageView;", "Lkotlin/ParameterName;", "name", "imageView", "", "url", "a", "Lkotlin/jvm/functions/Function2;", "loadImage", "Lkotlin/Function3;", "Landroid/view/View;", "v", "item", "b", "Lkotlin/jvm/functions/Function3;", "onItemClickListener", "", "c", "Ljava/util/List;", "list", "Lcom/huami/homepage/promotion/server/PromotionDeleteManager;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/huami/homepage/promotion/server/PromotionDeleteManager;", "deleteManager", "positionStart", "itemCount", "listSize", "e", "getDeleteListener", "()Lkotlin/jvm/functions/Function3;", "setDeleteListener", "(Lkotlin/jvm/functions/Function3;)V", "deleteListener", "com/huami/homepage/promotion/ui/adapter/PromotionAdapter$adapterDataObserver$1", "f", "Lcom/huami/homepage/promotion/ui/adapter/PromotionAdapter$adapterDataObserver$1;", "adapterDataObserver", "", "g", "Ljava/util/Set;", "visited", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "promotion_release"}, k = 1, mv = {1, 5, 1})
public final class PromotionAdapter extends RecyclerView.Adapter<PromotionViewHolder> implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function2<ImageView, String, Unit> loadImage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function3<View, Integer, PromotionVo, Unit> onItemClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<PromotionVo> list = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteManager = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Function3<? super Integer, ? super Integer, ? super Integer, Unit> deleteListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final PromotionAdapter$adapterDataObserver$1 adapterDataObserver;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Set<String> visited;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/homepage/promotion/server/PromotionDeleteManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PromotionDeleteManager> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PromotionDeleteManager invoke() {
            return new PromotionDeleteManager();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.recyclerview.widget.RecyclerView$AdapterDataObserver, com.huami.homepage.promotion.ui.adapter.PromotionAdapter$adapterDataObserver$1] */
    public PromotionAdapter(@NotNull Function2<? super ImageView, ? super String, Unit> function2, @NotNull Function3<? super View, ? super Integer, ? super PromotionVo, Unit> function3) {
        this.loadImage = function2;
        this.onItemClickListener = function3;
        ?? r1 = new RecyclerView.AdapterDataObserver() { // from class: com.huami.homepage.promotion.ui.adapter.PromotionAdapter$adapterDataObserver$1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int positionStart, int itemCount) {
                Function3<Integer, Integer, Integer, Unit> deleteListener = this.a.getDeleteListener();
                if (deleteListener == null) {
                    return;
                }
                deleteListener.invoke(Integer.valueOf(positionStart), Integer.valueOf(itemCount), Integer.valueOf(this.a.list.size()));
            }
        };
        this.adapterDataObserver = r1;
        this.visited = new LinkedHashSet();
        registerAdapterDataObserver(r1);
    }

    private final PromotionDeleteManager c() {
        return (PromotionDeleteManager) this.deleteManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(PromotionViewHolder promotionViewHolder, PromotionAdapter promotionAdapter, View view) {
        int adapterPosition = promotionViewHolder.getAdapterPosition();
        boolean z = false;
        if (adapterPosition >= 0 && adapterPosition < promotionAdapter.getPagerCount()) {
            z = true;
        }
        if (z) {
            promotionAdapter.onItemClickListener.invoke(view, Integer.valueOf(adapterPosition), promotionAdapter.list.get(adapterPosition));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(PromotionViewHolder promotionViewHolder, PromotionAdapter promotionAdapter, View view) {
        int adapterPosition = promotionViewHolder.getAdapterPosition();
        boolean z = false;
        if (adapterPosition >= 0 && adapterPosition < promotionAdapter.getPagerCount()) {
            z = true;
        }
        if (z && promotionAdapter.c().deleteById(promotionAdapter.list.get(adapterPosition).getId())) {
            Analytics.recordEvent(new CountEventBuilder("HOME_SELECTED_CLOSE_C").addExtra("tp", "selected").addExtra("id", promotionAdapter.list.get(adapterPosition).getId()));
            promotionAdapter.list.remove(adapterPosition);
            promotionAdapter.notifyItemRemoved(adapterPosition);
        }
    }

    @Nullable
    public final Function3<Integer, Integer, Integer, Unit> getDeleteListener() {
        return this.deleteListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.list.size();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void setDeleteListener(@Nullable Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3) {
        this.deleteListener = function3;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setNewData(@NotNull List<PromotionVo> newData) {
        this.list.clear();
        this.list.addAll(newData);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PromotionViewHolder holder, int position) {
        PromotionVo promotionVo = this.list.get(position);
        holder.bind(promotionVo);
        if (this.visited.contains(promotionVo.getId())) {
            return;
        }
        Analytics.recordEvent(new CountEventBuilder("HOME_SELECTED_V").addExtra("tp", "selected").addExtra("id", promotionVo.getId()));
        this.visited.add(promotionVo.getId());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PromotionViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        final PromotionViewHolder promotionViewHolder = new PromotionViewHolder(parent, this.loadImage);
        promotionViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: m46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromotionAdapter.d(promotionViewHolder, this, view);
            }
        });
        promotionViewHolder.getCloseIcon().setOnClickListener(new View.OnClickListener() { // from class: l46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromotionAdapter.e(promotionViewHolder, this, view);
            }
        });
        return promotionViewHolder;
    }
}
