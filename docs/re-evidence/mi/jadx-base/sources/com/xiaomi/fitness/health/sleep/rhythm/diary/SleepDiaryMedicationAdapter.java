package com.xiaomi.fitness.health.sleep.rhythm.diary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.fitness.export.data.project.SleepMedicationDetail;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryMedicationAdapter;
import defpackage.eri;
import defpackage.jui;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001b\u001cB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0014\u0010\u0019\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryMedicationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryMedicationAdapter$MedicationBeforeSleepViewHolder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryMedicationAdapter$OnMedicationBeforeSleepItemClickListener;", "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryMedicationAdapter$OnMedicationBeforeSleepItemClickListener;)V", "getListener", "()Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryMedicationAdapter$OnMedicationBeforeSleepItemClickListener;", "setListener", "currentDataList", "", "Lcom/xiaomi/fit/fitness/export/data/project/SleepMedicationDetail;", "getCurrentDataList", "()Ljava/util/List;", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "updateDataList", "dataList", "MedicationBeforeSleepViewHolder", "OnMedicationBeforeSleepItemClickListener", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepDiaryMedicationAdapter extends RecyclerView.Adapter<MedicationBeforeSleepViewHolder> {

    @NotNull
    private final List<SleepMedicationDetail> currentDataList;

    @Nullable
    private OnMedicationBeforeSleepItemClickListener listener;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryMedicationAdapter$MedicationBeforeSleepViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/fitness/export/data/project/SleepMedicationDetail;", "medicationBeforeSleep", "", "bindData", "(Lcom/xiaomi/fit/fitness/export/data/project/SleepMedicationDetail;)V", "Landroid/widget/ImageView;", "editIcon", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "medicationNameTV", "Landroid/widget/TextView;", "medicationTimeTV", "deleteIcon", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryMedicationAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class MedicationBeforeSleepViewHolder extends RecyclerView.d0 {

        @Nullable
        private ImageView deleteIcon;

        @Nullable
        private ImageView editIcon;

        @Nullable
        private TextView medicationNameTV;

        @Nullable
        private TextView medicationTimeTV;
        final /* synthetic */ SleepDiaryMedicationAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MedicationBeforeSleepViewHolder(@NotNull SleepDiaryMedicationAdapter sleepDiaryMedicationAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepDiaryMedicationAdapter;
            this.editIcon = (ImageView) itemView.findViewById(eri.e6);
            this.deleteIcon = (ImageView) itemView.findViewById(eri.l6);
            this.medicationNameTV = (TextView) itemView.findViewById(eri.wb);
            this.medicationTimeTV = (TextView) itemView.findViewById(eri.Ab);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$0(SleepDiaryMedicationAdapter this$0, MedicationBeforeSleepViewHolder this$1, SleepMedicationDetail medicationBeforeSleep, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(medicationBeforeSleep, "$medicationBeforeSleep");
            OnMedicationBeforeSleepItemClickListener listener = this$0.getListener();
            if (listener != null) {
                listener.onItemSelectEdit(this$1.getBindingAdapterPosition(), medicationBeforeSleep);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$2(final SleepDiaryMedicationAdapter this$0, final MedicationBeforeSleepViewHolder this$1, SleepMedicationDetail medicationBeforeSleep, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(medicationBeforeSleep, "$medicationBeforeSleep");
            OnMedicationBeforeSleepItemClickListener listener = this$0.getListener();
            if (listener != null) {
                listener.onItemSelectDelete(this$1.getBindingAdapterPosition(), medicationBeforeSleep, new Function0() { // from class: pkm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SleepDiaryMedicationAdapter.MedicationBeforeSleepViewHolder.bindData$lambda$2$lambda$1(this$0, this$1);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$2$lambda$1(SleepDiaryMedicationAdapter this$0, MedicationBeforeSleepViewHolder this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this$0.getCurrentDataList());
            arrayList.remove(this$1.getBindingAdapterPosition());
            this$0.updateDataList(arrayList);
            Logger.i(SleepDiaryHandle.TAG, "delete medication = " + arrayList.size());
            return Unit.INSTANCE;
        }

        public final void bindData(@NotNull final SleepMedicationDetail medicationBeforeSleep) {
            Intrinsics.checkNotNullParameter(medicationBeforeSleep, "medicationBeforeSleep");
            TextView textView = this.medicationNameTV;
            Intrinsics.checkNotNull(textView);
            textView.setText(medicationBeforeSleep.getMedicationName());
            TextView textView2 = this.medicationTimeTV;
            Intrinsics.checkNotNull(textView2);
            textView2.setText(TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(medicationBeforeSleep.getMedicationSchedule() * ((long) 1000))) + "，" + ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.Y, medicationBeforeSleep.getMedicationCount(), Integer.valueOf(medicationBeforeSleep.getMedicationCount())));
            ImageView imageView = this.editIcon;
            Intrinsics.checkNotNull(imageView);
            final SleepDiaryMedicationAdapter sleepDiaryMedicationAdapter = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: nkm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepDiaryMedicationAdapter.MedicationBeforeSleepViewHolder.bindData$lambda$0(sleepDiaryMedicationAdapter, this, medicationBeforeSleep, view);
                }
            });
            ImageView imageView2 = this.deleteIcon;
            Intrinsics.checkNotNull(imageView2);
            final SleepDiaryMedicationAdapter sleepDiaryMedicationAdapter2 = this.this$0;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: okm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepDiaryMedicationAdapter.MedicationBeforeSleepViewHolder.bindData$lambda$2(sleepDiaryMedicationAdapter2, this, medicationBeforeSleep, view);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J&\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH&¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryMedicationAdapter$OnMedicationBeforeSleepItemClickListener;", "", "onItemSelectEdit", "", "medicationBeforeSleep", "", "medicationBeforeSleep1", "Lcom/xiaomi/fit/fitness/export/data/project/SleepMedicationDetail;", "onItemSelectDelete", "index", "deleteCallBack", "Lkotlin/Function0;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnMedicationBeforeSleepItemClickListener {
        void onItemSelectDelete(int index, @NotNull SleepMedicationDetail medicationBeforeSleep, @NotNull Function0<Unit> deleteCallBack);

        void onItemSelectEdit(int medicationBeforeSleep, @NotNull SleepMedicationDetail medicationBeforeSleep1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepDiaryMedicationAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final List<SleepMedicationDetail> getCurrentDataList() {
        return this.currentDataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.currentDataList.size();
    }

    @Nullable
    public final OnMedicationBeforeSleepItemClickListener getListener() {
        return this.listener;
    }

    public final void setListener(@Nullable OnMedicationBeforeSleepItemClickListener onMedicationBeforeSleepItemClickListener) {
        this.listener = onMedicationBeforeSleepItemClickListener;
    }

    public final void updateDataList(@NotNull List<SleepMedicationDetail> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.currentDataList.clear();
        this.currentDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public /* synthetic */ SleepDiaryMedicationAdapter(OnMedicationBeforeSleepItemClickListener onMedicationBeforeSleepItemClickListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : onMedicationBeforeSleepItemClickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MedicationBeforeSleepViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.currentDataList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MedicationBeforeSleepViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.h5, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new MedicationBeforeSleepViewHolder(this, viewInflate);
    }

    public SleepDiaryMedicationAdapter(@Nullable OnMedicationBeforeSleepItemClickListener onMedicationBeforeSleepItemClickListener) {
        this.listener = onMedicationBeforeSleepItemClickListener;
        this.currentDataList = new ArrayList();
    }
}
