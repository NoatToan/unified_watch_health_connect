package com.xiaomi.fitness.health.todayhealth.ui.items;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.todayhealth.TodayHealthExtKt;
import defpackage.eri;
import defpackage.jui;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BO\u0012F\u0010\u0019\u001aB\u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u0014j \u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015`\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013RT\u0010\u0019\u001aB\u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u0014j \u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/HealthRiskIndexTagAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "key", "", "isSleepKey", "(I)Z", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Ljava/util/HashMap;", "", "", "", "Lkotlin/collections/HashMap;", "riskMap", "Ljava/util/HashMap;", "", "positionHealthTypeMap", "Ljava/util/Map;", "<init>", "(Ljava/util/HashMap;)V", "ItemViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHealthRiskIndexTagAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthRiskIndexTagAdapter.kt\ncom/xiaomi/fitness/health/todayhealth/ui/items/HealthRiskIndexTagAdapter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,86:1\n216#2,2:87\n*S KotlinDebug\n*F\n+ 1 HealthRiskIndexTagAdapter.kt\ncom/xiaomi/fitness/health/todayhealth/ui/items/HealthRiskIndexTagAdapter\n*L\n40#1:87,2\n*E\n"})
public final class HealthRiskIndexTagAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private final Map<Integer, Integer> positionHealthTypeMap;

    @NotNull
    private final HashMap<Integer, Map<Integer, List<Object>>> riskMap;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/HealthRiskIndexTagAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "tagStr", "", "bindData", "(Ljava/lang/String;)V", "Landroid/widget/TextView;", "tagTv", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView tagTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(eri.Xh);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.tagTv = (TextView) viewFindViewById;
        }

        public final void bindData(@NotNull String tagStr) {
            Intrinsics.checkNotNullParameter(tagStr, "tagStr");
            this.tagTv.setText(tagStr);
        }
    }

    public HealthRiskIndexTagAdapter(@NotNull HashMap<Integer, Map<Integer, List<Object>>> riskMap) {
        Intrinsics.checkNotNullParameter(riskMap, "riskMap");
        this.riskMap = riskMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.positionHealthTypeMap = linkedHashMap;
        int i = 0;
        if (riskMap.containsKey(6) && riskMap.get(6) != null) {
            linkedHashMap.put(0, 6);
            i = 1;
        }
        if (riskMap.containsKey(-1) && riskMap.get(-1) != null) {
            linkedHashMap.put(Integer.valueOf(i), -1);
            i++;
        }
        if (riskMap.containsKey(-2) && riskMap.get(-2) != null) {
            linkedHashMap.put(Integer.valueOf(i), -2);
            i++;
        }
        Iterator<Map.Entry<Integer, Map<Integer, List<Object>>>> it = riskMap.entrySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().getKey().intValue();
            if (!isSleepKey(iIntValue)) {
                this.positionHealthTypeMap.put(Integer.valueOf(i), Integer.valueOf(iIntValue));
                i++;
            }
        }
    }

    private final boolean isSleepKey(int key) {
        return key == -2 || key == -1 || key == 6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.positionHealthTypeMap.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Integer num;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (!(holder instanceof ItemViewHolder) || (num = this.positionHealthTypeMap.get(Integer.valueOf(position))) == null) {
            return;
        }
        ((ItemViewHolder) holder).bindData(TodayHealthExtKt.getHealthTypeNameByHealth(num.intValue()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.H5, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ItemViewHolder(viewInflate);
    }
}
