package com.huami.sleep.sleephome.promotion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.R;
import com.huami.sleep.sleephome.promotion.SleepPromotionAdapter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001,B\u008c\u0001\u00126\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000b0\u0011\u0012K\u0010!\u001aG\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0004\b*\u0010+J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rRF\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000b0\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R[\u0010!\u001aG\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000b0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/huami/sleep/sleephome/promotion/SleepPromotionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/sleep/sleephome/promotion/SleepPromotionAdapter$PromotionViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/huami/sleep/sleephome/promotion/SleepPromotionVo;", "newData", "setNewData", "Lkotlin/Function2;", "Landroid/widget/ImageView;", "Lkotlin/ParameterName;", "name", "imageView", "", "url", "a", "Lkotlin/jvm/functions/Function2;", "loadImage", "Lkotlin/Function3;", "Landroid/view/View;", "v", "item", "b", "Lkotlin/jvm/functions/Function3;", "onItemClickListener", "", "c", "Ljava/util/List;", "list", "", GoogleApiAvailabilityLight.a, "Ljava/util/Set;", "visited", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "PromotionViewHolder", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepPromotionAdapter extends RecyclerView.Adapter<PromotionViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function2<ImageView, String, Unit> loadImage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function3<View, Integer, SleepPromotionVo, Unit> onItemClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<SleepPromotionVo> list = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Set<String> visited = new LinkedHashSet();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00126\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002RF\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00040\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/sleep/sleephome/promotion/SleepPromotionAdapter$PromotionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/sleep/sleephome/promotion/SleepPromotionVo;", "item", "", "bind", "Lkotlin/Function2;", "Landroid/widget/ImageView;", "Lkotlin/ParameterName;", "name", "imageView", "", "url", "a", "Lkotlin/jvm/functions/Function2;", "loadImage", "Landroid/view/ViewGroup;", "parent", "<init>", "(Lcom/huami/sleep/sleephome/promotion/SleepPromotionAdapter;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public final class PromotionViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Function2<ImageView, String, Unit> loadImage;

        /* JADX WARN: Multi-variable type inference failed */
        public PromotionViewHolder(@NotNull ViewGroup viewGroup, Function2<? super ImageView, ? super String, Unit> function2) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sleep_promotion, viewGroup, false));
            this.loadImage = function2;
        }

        public final void bind(@NotNull SleepPromotionVo item) {
            View view = this.itemView;
            this.loadImage.invoke((ImageView) view.findViewById(R.id.image), item.getImageUrl());
            ((TextView) view.findViewById(R.id.title)).setText(item.getTitle());
            ((TextView) view.findViewById(R.id.subtitle)).setText(item.getSubtitle());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepPromotionAdapter(@NotNull Function2<? super ImageView, ? super String, Unit> function2, @NotNull Function3<? super View, ? super Integer, ? super SleepPromotionVo, Unit> function3) {
        this.loadImage = function2;
        this.onItemClickListener = function3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(PromotionViewHolder promotionViewHolder, SleepPromotionAdapter sleepPromotionAdapter, View view) {
        int adapterPosition = promotionViewHolder.getAdapterPosition();
        boolean z = false;
        if (adapterPosition >= 0 && adapterPosition < sleepPromotionAdapter.getA()) {
            z = true;
        }
        if (z) {
            sleepPromotionAdapter.onItemClickListener.invoke(view, Integer.valueOf(adapterPosition), sleepPromotionAdapter.list.get(adapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.list.size();
    }

    public final void setNewData(@NotNull List<SleepPromotionVo> newData) {
        this.list.clear();
        this.list.addAll(newData);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PromotionViewHolder holder, int position) {
        SleepPromotionVo sleepPromotionVo = this.list.get(position);
        holder.bind(sleepPromotionVo);
        if (this.visited.contains(sleepPromotionVo.getId())) {
            return;
        }
        this.visited.add(sleepPromotionVo.getId());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PromotionViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        final PromotionViewHolder promotionViewHolder = new PromotionViewHolder(parent, this.loadImage);
        promotionViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: c17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepPromotionAdapter.b(promotionViewHolder, this, view);
            }
        });
        return promotionViewHolder;
    }
}
