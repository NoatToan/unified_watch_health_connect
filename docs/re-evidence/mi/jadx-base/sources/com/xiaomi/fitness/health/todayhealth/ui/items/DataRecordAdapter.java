package com.xiaomi.fitness.health.todayhealth.ui.items;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.todayhealth.ui.items.DataRecordAdapter;
import defpackage.c0j;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/DataRecordAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/DataRecordAdapter$MyViewHolder;", "<init>", "()V", "dataList", "", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/DataRecordItem;", "setData", "", "newList", "", "titleItemClickListener", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/DataRecordAdapter$OnTitleItemClickListener;", "getTitleItemClickListener", "()Lcom/xiaomi/fitness/health/todayhealth/ui/items/DataRecordAdapter$OnTitleItemClickListener;", "setTitleItemClickListener", "(Lcom/xiaomi/fitness/health/todayhealth/ui/items/DataRecordAdapter$OnTitleItemClickListener;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "setOnTitleItemClickListener", "OnTitleItemClickListener", "MyViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataRecordAdapter extends RecyclerView.Adapter<MyViewHolder> {

    @NotNull
    private List<DataRecordItem> dataList = new ArrayList();

    @Nullable
    private OnTitleItemClickListener titleItemClickListener;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/DataRecordAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/DataRecordItem;", "data", "", "bind", "(Lcom/xiaomi/fitness/health/todayhealth/ui/items/DataRecordItem;)V", "", "status", "Lkotlin/Pair;", "", "getHeartStatusTextAndColor", "(I)Lkotlin/Pair;", "Landroid/widget/TextView;", "tvHeartRate", "Landroid/widget/TextView;", "tvHeartStatus", "tvHeartTime", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class MyViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView tvHeartRate;

        @NotNull
        private final TextView tvHeartStatus;

        @NotNull
        private final TextView tvHeartTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(eri.yl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.tvHeartRate = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(eri.Km);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.tvHeartStatus = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(eri.Vm);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.tvHeartTime = (TextView) viewFindViewById3;
        }

        public final void bind(@NotNull DataRecordItem data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.tvHeartRate.setText(String.valueOf(data.getHeartRate()));
            Pair<String, Integer> heartStatusTextAndColor = getHeartStatusTextAndColor(data.getStatus());
            String strComponent1 = heartStatusTextAndColor.component1();
            int iIntValue = heartStatusTextAndColor.component2().intValue();
            this.tvHeartStatus.setText(strComponent1);
            this.tvHeartStatus.setTextColor(iIntValue);
            this.tvHeartTime.setText(TimeDateUtil.getDateMMDDHHmmLocalFormat(data.getTime()));
        }

        @NotNull
        public final Pair<String, Integer> getHeartStatusTextAndColor(int status) {
            if (status != 0 && status != 1) {
                if (status == 2 || status == 3) {
                    return new Pair<>(ResourceExtKt.getString(c0j.Aq), Integer.valueOf(ExtUtilsKt.getColor(iji.O2)));
                }
                return (status == 4 || status == 5) ? new Pair<>(ResourceExtKt.getString(c0j.X8), Integer.valueOf(ExtUtilsKt.getColor(iji.P2))) : new Pair<>(ResourceExtKt.getString(c0j.X8), Integer.valueOf(ExtUtilsKt.getColor(iji.P2)));
            }
            return new Pair<>(ResourceExtKt.getString(c0j.d9), Integer.valueOf(ExtUtilsKt.getColor(iji.M2)));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/DataRecordAdapter$OnTitleItemClickListener;", "", "onClick", "", "position", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnTitleItemClickListener {
        void onClick(int position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(DataRecordAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnTitleItemClickListener onTitleItemClickListener = this$0.titleItemClickListener;
        if (onTitleItemClickListener != null) {
            onTitleItemClickListener.onClick(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Nullable
    public final OnTitleItemClickListener getTitleItemClickListener() {
        return this.titleItemClickListener;
    }

    public final void setData(@NotNull final List<? extends DataRecordItem> newList) {
        Intrinsics.checkNotNullParameter(newList, "newList");
        h.e eVarB = h.b(new h.b() { // from class: com.xiaomi.fitness.health.todayhealth.ui.items.DataRecordAdapter$setData$diffCallback$1
            @Override // androidx.recyclerview.widget.h.b
            public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                return Intrinsics.areEqual(this.this$0.dataList.get(oldItemPosition), newList.get(newItemPosition));
            }

            @Override // androidx.recyclerview.widget.h.b
            public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                return Intrinsics.areEqual(this.this$0.dataList.get(oldItemPosition), newList.get(newItemPosition));
            }

            @Override // androidx.recyclerview.widget.h.b
            /* JADX INFO: renamed from: getNewListSize */
            public int get$newSize() {
                return newList.size();
            }

            @Override // androidx.recyclerview.widget.h.b
            /* JADX INFO: renamed from: getOldListSize */
            public int get$oldSize() {
                return this.this$0.dataList.size();
            }
        });
        Intrinsics.checkNotNullExpressionValue(eVarB, "calculateDiff(...)");
        this.dataList.clear();
        this.dataList.addAll(newList);
        eVarB.d(this);
    }

    public final void setOnTitleItemClickListener(@NotNull OnTitleItemClickListener OnTitleItemClickListener2) {
        Intrinsics.checkNotNullParameter(OnTitleItemClickListener2, "OnTitleItemClickListener");
        this.titleItemClickListener = OnTitleItemClickListener2;
    }

    public final void setTitleItemClickListener(@Nullable OnTitleItemClickListener onTitleItemClickListener) {
        this.titleItemClickListener = onTitleItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MyViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DataRecordItem dataRecordItem = this.dataList.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: cn5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DataRecordAdapter.onBindViewHolder$lambda$0(this.f5568a, position, view);
            }
        });
        holder.bind(dataRecordItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MyViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.d6, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new MyViewHolder(viewInflate);
    }
}
