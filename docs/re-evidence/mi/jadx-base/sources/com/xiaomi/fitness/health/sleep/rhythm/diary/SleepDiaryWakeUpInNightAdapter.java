package com.xiaomi.fitness.health.sleep.rhythm.diary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryWakeUpInNightAdapter;
import defpackage.eri;
import defpackage.jui;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001a\u001bB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0014\u0010\u0018\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryWakeUpInNightAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryWakeUpInNightAdapter$SleepDiaryWakeUpInNightViewHolder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryWakeUpInNightAdapter$OnSleepDiaryWakeUpInNightItemClickListener;", "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryWakeUpInNightAdapter$OnSleepDiaryWakeUpInNightItemClickListener;)V", "getListener", "()Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryWakeUpInNightAdapter$OnSleepDiaryWakeUpInNightItemClickListener;", "setListener", "currentDataList", "", "", "getCurrentDataList", "()Ljava/util/List;", "getItemCount", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "updateDataList", "dataList", "SleepDiaryWakeUpInNightViewHolder", "OnSleepDiaryWakeUpInNightItemClickListener", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepDiaryWakeUpInNightAdapter extends RecyclerView.Adapter<SleepDiaryWakeUpInNightViewHolder> {

    @NotNull
    private final List<Integer> currentDataList;

    @Nullable
    private OnSleepDiaryWakeUpInNightItemClickListener listener;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u001e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryWakeUpInNightAdapter$OnSleepDiaryWakeUpInNightItemClickListener;", "", "onItemSelectEdit", "", "index", "", "wakeUpTimeInNight", "onItemSelectDelete", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnSleepDiaryWakeUpInNightItemClickListener {
        void onItemSelectDelete(int index, @NotNull List<Integer> wakeUpTimeInNight);

        void onItemSelectEdit(int index, int wakeUpTimeInNight);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryWakeUpInNightAdapter$SleepDiaryWakeUpInNightViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "wakeUpTimeInNight", "", "bindData", "(I)V", "Landroid/widget/ImageView;", "editIcon", "Landroid/widget/ImageView;", "getEditIcon", "()Landroid/widget/ImageView;", "setEditIcon", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "wakeUpInNightCountTv", "Landroid/widget/TextView;", "getWakeUpInNightCountTv", "()Landroid/widget/TextView;", "setWakeUpInNightCountTv", "(Landroid/widget/TextView;)V", "wakeUpInNightTimeTv", "getWakeUpInNightTimeTv", "setWakeUpInNightTimeTv", "deleteIcon", "getDeleteIcon", "setDeleteIcon", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryWakeUpInNightAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SleepDiaryWakeUpInNightViewHolder extends RecyclerView.d0 {

        @Nullable
        private ImageView deleteIcon;

        @Nullable
        private ImageView editIcon;
        final /* synthetic */ SleepDiaryWakeUpInNightAdapter this$0;

        @Nullable
        private TextView wakeUpInNightCountTv;

        @Nullable
        private TextView wakeUpInNightTimeTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepDiaryWakeUpInNightViewHolder(@NotNull SleepDiaryWakeUpInNightAdapter sleepDiaryWakeUpInNightAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepDiaryWakeUpInNightAdapter;
            this.editIcon = (ImageView) itemView.findViewById(eri.e6);
            this.deleteIcon = (ImageView) itemView.findViewById(eri.jp);
            this.wakeUpInNightCountTv = (TextView) itemView.findViewById(eri.ip);
            this.wakeUpInNightTimeTv = (TextView) itemView.findViewById(eri.lp);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$0(SleepDiaryWakeUpInNightAdapter this$0, SleepDiaryWakeUpInNightViewHolder this$1, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            OnSleepDiaryWakeUpInNightItemClickListener listener = this$0.getListener();
            if (listener != null) {
                listener.onItemSelectEdit(this$1.getBindingAdapterPosition(), i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$1(SleepDiaryWakeUpInNightAdapter this$0, SleepDiaryWakeUpInNightViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this$0.getCurrentDataList());
            arrayList.remove(this$1.getBindingAdapterPosition());
            this$0.updateDataList(arrayList);
            OnSleepDiaryWakeUpInNightItemClickListener listener = this$0.getListener();
            if (listener != null) {
                listener.onItemSelectDelete(this$1.getBindingAdapterPosition(), arrayList);
            }
        }

        public final void bindData(final int wakeUpTimeInNight) {
            TextView textView = this.wakeUpInNightCountTv;
            Intrinsics.checkNotNull(textView);
            textView.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.F1, getBindingAdapterPosition() + 1, Integer.valueOf(getBindingAdapterPosition() + 1)));
            TextView textView2 = this.wakeUpInNightTimeTv;
            Intrinsics.checkNotNull(textView2);
            textView2.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.G1, wakeUpTimeInNight, Integer.valueOf(wakeUpTimeInNight)));
            ImageView imageView = this.editIcon;
            Intrinsics.checkNotNull(imageView);
            final SleepDiaryWakeUpInNightAdapter sleepDiaryWakeUpInNightAdapter = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: qlm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepDiaryWakeUpInNightAdapter.SleepDiaryWakeUpInNightViewHolder.bindData$lambda$0(sleepDiaryWakeUpInNightAdapter, this, wakeUpTimeInNight, view);
                }
            });
            ImageView imageView2 = this.deleteIcon;
            Intrinsics.checkNotNull(imageView2);
            final SleepDiaryWakeUpInNightAdapter sleepDiaryWakeUpInNightAdapter2 = this.this$0;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: rlm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepDiaryWakeUpInNightAdapter.SleepDiaryWakeUpInNightViewHolder.bindData$lambda$1(sleepDiaryWakeUpInNightAdapter2, this, view);
                }
            });
        }

        @Nullable
        public final ImageView getDeleteIcon() {
            return this.deleteIcon;
        }

        @Nullable
        public final ImageView getEditIcon() {
            return this.editIcon;
        }

        @Nullable
        public final TextView getWakeUpInNightCountTv() {
            return this.wakeUpInNightCountTv;
        }

        @Nullable
        public final TextView getWakeUpInNightTimeTv() {
            return this.wakeUpInNightTimeTv;
        }

        public final void setDeleteIcon(@Nullable ImageView imageView) {
            this.deleteIcon = imageView;
        }

        public final void setEditIcon(@Nullable ImageView imageView) {
            this.editIcon = imageView;
        }

        public final void setWakeUpInNightCountTv(@Nullable TextView textView) {
            this.wakeUpInNightCountTv = textView;
        }

        public final void setWakeUpInNightTimeTv(@Nullable TextView textView) {
            this.wakeUpInNightTimeTv = textView;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepDiaryWakeUpInNightAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final List<Integer> getCurrentDataList() {
        return this.currentDataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.currentDataList.size();
    }

    @Nullable
    public final OnSleepDiaryWakeUpInNightItemClickListener getListener() {
        return this.listener;
    }

    public final void setListener(@Nullable OnSleepDiaryWakeUpInNightItemClickListener onSleepDiaryWakeUpInNightItemClickListener) {
        this.listener = onSleepDiaryWakeUpInNightItemClickListener;
    }

    public final void updateDataList(@NotNull List<Integer> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.currentDataList.clear();
        this.currentDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public /* synthetic */ SleepDiaryWakeUpInNightAdapter(OnSleepDiaryWakeUpInNightItemClickListener onSleepDiaryWakeUpInNightItemClickListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : onSleepDiaryWakeUpInNightItemClickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SleepDiaryWakeUpInNightViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.currentDataList.get(position).intValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SleepDiaryWakeUpInNightViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.j5, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new SleepDiaryWakeUpInNightViewHolder(this, viewInflate);
    }

    public SleepDiaryWakeUpInNightAdapter(@Nullable OnSleepDiaryWakeUpInNightItemClickListener onSleepDiaryWakeUpInNightItemClickListener) {
        this.listener = onSleepDiaryWakeUpInNightItemClickListener;
        this.currentDataList = new ArrayList();
    }
}
