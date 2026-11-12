package com.xiaomi.fitness.health.sleep.rhythm.adapter;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.fitness.export.data.annotation.SleepRhythmType;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.sleep.rhythm.adapter.SleepRhythmRecordsAdapter;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.iji;
import defpackage.kzb;
import defpackage.qxi;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmRecordsAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmRecordsAdapter$AllRecordsHolder;", "<init>", "()V", "itemSelectListener", "Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/OnItemClickListener;", "setOnItemClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AllRecordsHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepRhythmRecordsAdapter extends PagingDataAdapter<SleepRhythmReport, AllRecordsHolder> {

    @Nullable
    private OnItemClickListener itemSelectListener;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmRecordsAdapter$AllRecordsHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "type", "getTextStringResByType", "(I)I", "getTextColorByType", "color", "Landroid/graphics/drawable/Drawable;", "getTextBgDrawableByType", "(I)Landroid/graphics/drawable/Drawable;", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "item", "", "updateItem", "(Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;)V", "Lkzb;", "binding", "Lkzb;", "getBinding", "()Lkzb;", "<init>", "(Lkzb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AllRecordsHolder extends RecyclerView.d0 {

        @NotNull
        private final kzb binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AllRecordsHolder(@NotNull kzb binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        private final Drawable getTextBgDrawableByType(int color) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float dp = ExtUtilsKt.getDp(4);
            gradientDrawable.setCornerRadii(new float[]{dp, dp, dp, dp, dp, dp, dp, dp});
            gradientDrawable.setColor(color);
            gradientDrawable.setAlpha(25);
            return gradientDrawable;
        }

        private final int getTextColorByType(@SleepRhythmType int type) {
            if (type != 0) {
                return type != 2 ? iji.O1 : iji.P1;
            }
            return iji.Q1;
        }

        private final int getTextStringResByType(@SleepRhythmType int type) {
            if (type != 0) {
                return type != 2 ? c0j.Ki : c0j.Ji;
            }
            return c0j.Dj;
        }

        @NotNull
        public final kzb getBinding() {
            return this.binding;
        }

        public final void updateItem(@NotNull SleepRhythmReport item) {
            Intrinsics.checkNotNullParameter(item, "item");
            int type = item.getType();
            Resources resources = this.binding.getRoot().getResources();
            int color = resources.getColor(getTextColorByType(type), null);
            this.binding.C.setText(getTextStringResByType(type));
            this.binding.C.setTextColor(color);
            this.binding.C.setBackground(getTextBgDrawableByType(color));
            this.binding.E.setText(resources.getQuantityString(qxi.K0, item.getCycleDay(), Integer.valueOf(item.getCycleDay())));
            long j = 1000;
            String date = TimeUtils.formatDate(ExtUtilKt.getString(c0j.n), Long.valueOf(item.getTime() * j));
            String date2 = TimeUtils.formatDate(ExtUtilKt.getString(c0j.n), Long.valueOf((item.getTime() * j) + TimeUnit.DAYS.toMillis(((long) item.getCycleDay()) - 1)));
            TextView textView = this.binding.D;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s-%s", Arrays.copyOf(new Object[]{date, date2}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
        }
    }

    public SleepRhythmRecordsAdapter() {
        super(new h.f<SleepRhythmReport>() { // from class: com.xiaomi.fitness.health.sleep.rhythm.adapter.SleepRhythmRecordsAdapter.1
            @Override // androidx.recyclerview.widget.h.f
            public boolean areContentsTheSame(SleepRhythmReport oldItem, SleepRhythmReport newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.h.f
            public boolean areItemsTheSame(SleepRhythmReport oldItem, SleepRhythmReport newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(oldItem, newItem);
            }
        }, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(SleepRhythmRecordsAdapter this$0, SleepRhythmReport item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        OnItemClickListener onItemClickListener = this$0.itemSelectListener;
        if (onItemClickListener != null) {
            onItemClickListener.onClick(item);
        }
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.itemSelectListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull AllRecordsHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final SleepRhythmReport item = getItem(position);
        if (item == null) {
            return;
        }
        holder.updateItem(item);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: ivm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmRecordsAdapter.onBindViewHolder$lambda$0(this.f22144a, item, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public AllRecordsHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        kzb kzbVarA0 = kzb.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(kzbVarA0, "inflate(...)");
        return new AllRecordsHolder(kzbVarA0);
    }
}
