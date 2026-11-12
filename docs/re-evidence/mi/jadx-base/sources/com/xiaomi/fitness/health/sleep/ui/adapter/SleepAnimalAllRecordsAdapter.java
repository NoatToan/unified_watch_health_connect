package com.xiaomi.fitness.health.sleep.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.fitness.export.data.stat.AnimalInfo;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepAnimalAllRecordsAdapter;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalExtKt;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.eri;
import defpackage.jui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\"\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepAnimalAllRecordsAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepAnimalAllRecordsAdapter$AnimalRecordsHolder;", "<init>", "()V", "onItemClickListener", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepAnimalAllRecordsAdapter$OnItemClickListener;", "setOnItemClickListener", "", "selectDeleteList", "", "getSelectDeleteList", "()Ljava/util/List;", "value", "", "editMode", "getEditMode", "()Z", "setEditMode", "(Z)V", "isAllSelected", "setAllSelected", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "setCheckedNoEvent", "checkBox", "Landroid/widget/CompoundButton;", "checked", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "OnItemClickListener", "AnimalRecordsHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepAnimalAllRecordsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAnimalAllRecordsAdapter.kt\ncom/xiaomi/fitness/health/sleep/ui/adapter/SleepAnimalAllRecordsAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,128:1\n54#2,3:129\n24#2:132\n57#2,6:133\n63#2,2:140\n57#3:139\n*S KotlinDebug\n*F\n+ 1 SleepAnimalAllRecordsAdapter.kt\ncom/xiaomi/fitness/health/sleep/ui/adapter/SleepAnimalAllRecordsAdapter\n*L\n82#1:129,3\n82#1:132\n82#1:133,6\n82#1:140,2\n82#1:139\n*E\n"})
public final class SleepAnimalAllRecordsAdapter extends PagingDataAdapter<SleepAnimalReport, AnimalRecordsHolder> {
    private boolean editMode;
    private boolean isAllSelected;

    @Nullable
    private OnItemClickListener onItemClickListener;

    @NotNull
    private final List<SleepAnimalReport> selectDeleteList;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepAnimalAllRecordsAdapter$AnimalRecordsHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "iconAnimal", "Landroid/widget/ImageView;", "getIconAnimal", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "tvAnimalName", "Landroid/widget/TextView;", "getTvAnimalName", "()Landroid/widget/TextView;", "setTvAnimalName", "(Landroid/widget/TextView;)V", "tvAnimalSampleTime", "getTvAnimalSampleTime", "setTvAnimalSampleTime", "Landroid/widget/CheckBox;", "checkBoxChoose", "Landroid/widget/CheckBox;", "getCheckBoxChoose", "()Landroid/widget/CheckBox;", "iconArrow", "getIconArrow", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnimalRecordsHolder extends RecyclerView.d0 {

        @NotNull
        private final CheckBox checkBoxChoose;

        @NotNull
        private final ImageView iconAnimal;

        @NotNull
        private final ImageView iconArrow;

        @NotNull
        private TextView tvAnimalName;

        @NotNull
        private TextView tvAnimalSampleTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimalRecordsHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(eri.j7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.iconAnimal = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(eri.Ml);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.tvAnimalName = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(eri.hk);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.tvAnimalSampleTime = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(eri.H1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.checkBoxChoose = (CheckBox) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(eri.k7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.iconArrow = (ImageView) viewFindViewById5;
        }

        @NotNull
        public final CheckBox getCheckBoxChoose() {
            return this.checkBoxChoose;
        }

        @NotNull
        public final ImageView getIconAnimal() {
            return this.iconAnimal;
        }

        @NotNull
        public final ImageView getIconArrow() {
            return this.iconArrow;
        }

        @NotNull
        public final TextView getTvAnimalName() {
            return this.tvAnimalName;
        }

        @NotNull
        public final TextView getTvAnimalSampleTime() {
            return this.tvAnimalSampleTime;
        }

        public final void setTvAnimalName(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.tvAnimalName = textView;
        }

        public final void setTvAnimalSampleTime(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.tvAnimalSampleTime = textView;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepAnimalAllRecordsAdapter$OnItemClickListener;", "", "onClick", "", "sleepAnimal", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "onDeleteSelectedItemUpdate", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClick(@NotNull SleepAnimalReport sleepAnimal);

        void onDeleteSelectedItemUpdate();
    }

    public SleepAnimalAllRecordsAdapter() {
        super(new PagingCallback(), null, null, 6, null);
        this.selectDeleteList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(SleepAnimalAllRecordsAdapter this$0, SleepAnimalReport sleepAnimalReport, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sleepAnimalReport, "$sleepAnimalReport");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onClick(sleepAnimalReport);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(SleepAnimalAllRecordsAdapter this$0, SleepAnimalReport sleepAnimalReport, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sleepAnimalReport, "$sleepAnimalReport");
        if (z) {
            this$0.selectDeleteList.add(sleepAnimalReport);
        } else {
            this$0.selectDeleteList.remove(sleepAnimalReport);
        }
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onDeleteSelectedItemUpdate();
        }
    }

    private final void setCheckedNoEvent(CompoundButton checkBox, boolean checked, CompoundButton.OnCheckedChangeListener listener) {
        checkBox.setOnCheckedChangeListener(null);
        checkBox.setChecked(checked);
        checkBox.setOnCheckedChangeListener(listener);
    }

    public final boolean getEditMode() {
        return this.editMode;
    }

    @NotNull
    public final List<SleepAnimalReport> getSelectDeleteList() {
        return this.selectDeleteList;
    }

    public final boolean isAllSelected() {
        return this.selectDeleteList.size() == getCount();
    }

    public final void setAllSelected(boolean z) {
        this.isAllSelected = z;
        this.selectDeleteList.clear();
        if (z) {
            int itemCount = getCount();
            for (int i = 0; i < itemCount; i++) {
                SleepAnimalReport item = getItem(i);
                if (item != null) {
                    this.selectDeleteList.add(item);
                }
            }
        }
        notifyDataSetChanged();
        OnItemClickListener onItemClickListener = this.onItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onDeleteSelectedItemUpdate();
        }
    }

    public final void setEditMode(boolean z) {
        this.editMode = z;
        this.selectDeleteList.clear();
        notifyDataSetChanged();
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.onItemClickListener = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull AnimalRecordsHolder holder, int position) {
        AnimalInfo animal;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final SleepAnimalReport item = getItem(position);
        if (item == null || (animal = item.getAnimal()) == null) {
            return;
        }
        ImageView iconAnimal = holder.getIconAnimal();
        Coil.imageLoader(iconAnimal.getContext()).enqueue(new ImageRequest.Builder(iconAnimal.getContext()).data(Integer.valueOf(SleepAnimalExtKt.getSleepAnimalDrawableRes(animal.getType()))).target(iconAnimal).build());
        holder.getTvAnimalName().setText(ExtUtilKt.getString(SleepAnimalExtKt.getSleepAnimalTypeStringRes(animal.getType())));
        long j = 1000;
        holder.getTvAnimalSampleTime().setText(TimeDateUtil.getDateRangeFormat(new LocalDate(animal.getStartTime() * j), new LocalDate(animal.getEndTime() * j)));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: sfm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepAnimalAllRecordsAdapter.onBindViewHolder$lambda$0(this.f33592a, item, view);
            }
        });
        ViewExtKt.setVisible(holder.getIconArrow(), !this.editMode);
        ViewExtKt.setVisible(holder.getCheckBoxChoose(), this.editMode);
        if (this.editMode) {
            setCheckedNoEvent(holder.getCheckBoxChoose(), this.selectDeleteList.contains(item), new CompoundButton.OnCheckedChangeListener() { // from class: tfm
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    SleepAnimalAllRecordsAdapter.onBindViewHolder$lambda$1(this.f34653a, item, compoundButton, z);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public AnimalRecordsHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.k7, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new AnimalRecordsHolder(viewInflate);
    }
}
