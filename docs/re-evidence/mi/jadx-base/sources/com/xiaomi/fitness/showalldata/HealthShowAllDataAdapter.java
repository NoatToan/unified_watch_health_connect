package com.xiaomi.fitness.showalldata;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.log.TalkbackLogger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.showalldata.HealthShowAllDataAdapter;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.km5;
import defpackage.l2c;
import defpackage.nuf;
import defpackage.pni;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000  2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004!\"# B%\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter$ShowAllDataViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter$ShowAllDataViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter$ShowAllDataViewHolder;I)V", "getItemCount", "()I", "", "Lkm5;", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter$OnItemClickListener;", "onItemClick", "Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter$OnItemClickListener;", "Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter$OnSaveItemClick;", "onSaveItemClick", "Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter$OnSaveItemClick;", "getOnSaveItemClick", "()Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter$OnSaveItemClick;", "<init>", "(Ljava/util/List;Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter$OnItemClickListener;Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter$OnSaveItemClick;)V", "Companion", "ShowAllDataViewHolder", "OnItemClickListener", "OnSaveItemClick", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HealthShowAllDataAdapter extends RecyclerView.Adapter<ShowAllDataViewHolder> {

    @NotNull
    public static final String TAG = "HealthShowAllDataAdapter";

    @NotNull
    private final List<km5> dataList;

    @NotNull
    private final OnItemClickListener onItemClick;

    @NotNull
    private final OnSaveItemClick onSaveItemClick;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter$OnItemClickListener;", "", "onItemClick", "", DailyRecordKey.sportType, "", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemClick(int sportType, @NotNull Bundle bundle);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter$OnSaveItemClick;", "", "onSaveItemClick", "", "position", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnSaveItemClick {
        void onSaveItemClick(int position);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter$ShowAllDataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "savedIcon", "getSavedIcon", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/showalldata/HealthShowAllDataAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ShowAllDataViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView icon;

        @NotNull
        private final TextView name;

        @NotNull
        private final ImageView savedIcon;
        final /* synthetic */ HealthShowAllDataAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowAllDataViewHolder(@NotNull HealthShowAllDataAdapter healthShowAllDataAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = healthShowAllDataAdapter;
            View viewFindViewById = view.findViewById(eri.f7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(eri.bc);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.name = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(eri.l7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.savedIcon = (ImageView) viewFindViewById3;
        }

        @NotNull
        public final ImageView getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextView getName() {
            return this.name;
        }

        @NotNull
        public final ImageView getSavedIcon() {
            return this.savedIcon;
        }
    }

    public HealthShowAllDataAdapter(@NotNull List<km5> dataList, @NotNull OnItemClickListener onItemClick, @NotNull OnSaveItemClick onSaveItemClick) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onSaveItemClick, "onSaveItemClick");
        this.dataList = dataList;
        this.onItemClick = onItemClick;
        this.onSaveItemClick = onSaveItemClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(km5 data, HealthShowAllDataAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        data.e = data.e >= 0 ? -1 : 0;
        data.l = true;
        this$0.notifyItemChanged(i);
        this$0.onSaveItemClick.onSaveItemClick(i);
        boolean z = data.e >= 0;
        String string = z ? ExtUtilKt.getString(c0j.Nq) : ExtUtilKt.getString(c0j.Jq);
        view.setContentDescription(string);
        TalkbackLogger.INSTANCE.d("HealthShowAllDataAdapter", "isSelected=" + z + " talkback=" + string, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(km5 data, HealthShowAllDataAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(data.d)) {
            bundle.putString("did", data.d);
            bundle.putSerializable("local_date", TimeDateUtil.timestampToLocalDate(data.f23978a));
        }
        int i = data.f23979b;
        bundle.putInt("sport_type", i);
        this$0.onItemClick.onItemClick(i, bundle);
    }

    @NotNull
    public final List<km5> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @NotNull
    public final OnSaveItemClick getOnSaveItemClick() {
        return this.onSaveItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ShowAllDataViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final km5 km5Var = this.dataList.get(position);
        holder.getName().setText(l2c.b(km5Var.f23979b));
        holder.getIcon().setImageResource(l2c.a(km5Var.f23979b));
        if (km5Var.e == -1) {
            holder.getSavedIcon().setImageResource(pni.Y0);
            holder.getSavedIcon().setContentDescription(ExtUtilKt.getString(c0j.Jq));
        } else {
            holder.getSavedIcon().setImageResource(pni.a1);
            holder.getSavedIcon().setContentDescription(ExtUtilKt.getString(c0j.Nq));
        }
        holder.getSavedIcon().setOnClickListener(new View.OnClickListener() { // from class: z0c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthShowAllDataAdapter.onBindViewHolder$lambda$0(km5Var, this, position, view);
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: a1c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthShowAllDataAdapter.onBindViewHolder$lambda$1(km5Var, this, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ShowAllDataViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.q4, parent, false);
        nuf.f(viewInflate);
        Intrinsics.checkNotNull(viewInflate);
        return new ShowAllDataViewHolder(this, viewInflate);
    }
}
