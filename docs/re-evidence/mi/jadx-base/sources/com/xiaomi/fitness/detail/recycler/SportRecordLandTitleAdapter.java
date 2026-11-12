package com.xiaomi.fitness.detail.recycler;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.detail.recycler.SportRecordLandTitleAdapter;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import defpackage.bsi;
import defpackage.ivi;
import defpackage.j1j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000301/B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0014\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\fJ\u000e\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0010J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\u0018\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0006H\u0016J\u0010\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\rH\u0002J\u000e\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\u0014R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportRecordLandTitleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/detail/recycler/SportRecordLandTitleAdapter$DetailTitleViewHolder;", "context", "Landroid/content/Context;", DailyRecordKey.sportType, "", "<init>", "(Landroid/content/Context;I)V", "mContext", "mSportType", "clickStatusList", "", "", "clickColorList", "sportRecordKeyList", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "clickStatusNum", "firstChartRecordKey", "titleItemClickListener", "Lcom/xiaomi/fitness/detail/recycler/SportRecordLandTitleAdapter$OnTitleItemClickListener;", "getTitleItemClickListener", "()Lcom/xiaomi/fitness/detail/recycler/SportRecordLandTitleAdapter$OnTitleItemClickListener;", "setTitleItemClickListener", "(Lcom/xiaomi/fitness/detail/recycler/SportRecordLandTitleAdapter$OnTitleItemClickListener;)V", "chartTitleClickValid", "getChartTitleClickValid", "()Z", "setChartTitleClickValid", "(Z)V", "getClickStatusList", "setEnableClickList", "", "list", "setFirstChartRecordKey", "recordKey", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "checkTheClickValid", "status", "setOnTitleItemClickListener", "OnTitleItemClickListener", "Companion", "DetailTitleViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportRecordLandTitleAdapter extends RecyclerView.Adapter<DetailTitleViewHolder> {
    public static final int disableClickStatus = 3;
    public static final int enableClickGone = 2;
    public static final int enableClickVisible = 1;
    public static final int showAwakeChart = 3;
    public static final int showDeepChart = 0;
    public static final int showHrmChart = 4;
    public static final int showLightChart = 1;
    public static final int showRemChart = 2;
    public static final int showSpo2Chart = 5;
    private boolean chartTitleClickValid;

    @NotNull
    private List<Integer> clickColorList;

    @NotNull
    private List<Boolean> clickStatusList;
    private int clickStatusNum;

    @Nullable
    private SportRecordKey firstChartRecordKey;

    @NotNull
    private Context mContext;
    private int mSportType;

    @NotNull
    private List<SportRecordKey> sportRecordKeyList;

    @Nullable
    private OnTitleItemClickListener titleItemClickListener;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportRecordLandTitleAdapter$DetailTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/LinearLayout;", "clickView", "Landroid/widget/LinearLayout;", "getClickView", "()Landroid/widget/LinearLayout;", "Landroid/widget/CheckBox;", "imageView", "Landroid/widget/CheckBox;", "getImageView", "()Landroid/widget/CheckBox;", "Landroid/widget/TextView;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DetailTitleViewHolder extends RecyclerView.d0 {

        @NotNull
        private final LinearLayout clickView;

        @NotNull
        private final CheckBox imageView;

        @NotNull
        private final TextView textView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailTitleViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(bsi.b3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.clickView = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = view.findViewById(bsi.n1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.imageView = (CheckBox) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(bsi.o1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.textView = (TextView) viewFindViewById3;
        }

        @NotNull
        public final LinearLayout getClickView() {
            return this.clickView;
        }

        @NotNull
        public final CheckBox getImageView() {
            return this.imageView;
        }

        @NotNull
        public final TextView getTextView() {
            return this.textView;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportRecordLandTitleAdapter$OnTitleItemClickListener;", "", "onClick", "", "position", "", "changeStatus", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnTitleItemClickListener {
        void onClick(int position, boolean changeStatus);
    }

    public SportRecordLandTitleAdapter(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.mSportType = i;
        this.clickStatusList = new ArrayList();
        this.clickColorList = new ArrayList();
        this.sportRecordKeyList = new ArrayList();
        this.chartTitleClickValid = true;
    }

    private final boolean checkTheClickValid(boolean status) {
        if (!status || this.clickStatusNum >= 6) {
            return !status && this.clickStatusNum > 1;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(SportRecordLandTitleAdapter this$0, DetailTitleViewHolder holder, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (this$0.chartTitleClickValid && this$0.checkTheClickValid(!holder.getImageView().isChecked())) {
            holder.getImageView().setChecked(!holder.getImageView().isChecked());
            OnTitleItemClickListener onTitleItemClickListener = this$0.titleItemClickListener;
            if (onTitleItemClickListener != null) {
                onTitleItemClickListener.onClick(i, holder.getImageView().isChecked());
            }
            if (holder.getImageView().isChecked()) {
                this$0.clickStatusNum++;
            } else {
                this$0.clickStatusNum--;
            }
        } else {
            int i2 = this$0.clickStatusNum;
            if (i2 >= 6 && this$0.chartTitleClickValid) {
                ToastUtil.INSTANCE.showToast(j1j.j5);
            } else if (i2 == 1 && this$0.chartTitleClickValid) {
                ToastUtil.INSTANCE.showToast(j1j.k5);
            }
        }
        this$0.chartTitleClickValid = true;
    }

    public final boolean getChartTitleClickValid() {
        return this.chartTitleClickValid;
    }

    @NotNull
    public final List<Boolean> getClickStatusList() {
        return this.clickStatusList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.sportRecordKeyList.size();
    }

    @Nullable
    public final OnTitleItemClickListener getTitleItemClickListener() {
        return this.titleItemClickListener;
    }

    public final void setChartTitleClickValid(boolean z) {
        this.chartTitleClickValid = z;
    }

    public final void setEnableClickList(@NotNull List<SportRecordKey> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.sportRecordKeyList = list;
    }

    public final void setFirstChartRecordKey(@NotNull SportRecordKey recordKey) {
        Intrinsics.checkNotNullParameter(recordKey, "recordKey");
        this.firstChartRecordKey = recordKey;
    }

    public final void setOnTitleItemClickListener(@NotNull OnTitleItemClickListener OnTitleItemClickListener2) {
        Intrinsics.checkNotNullParameter(OnTitleItemClickListener2, "OnTitleItemClickListener");
        this.titleItemClickListener = OnTitleItemClickListener2;
    }

    public final void setTitleItemClickListener(@Nullable OnTitleItemClickListener onTitleItemClickListener) {
        this.titleItemClickListener = onTitleItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final DetailTitleViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SportRecordKey sportRecordKey = this.sportRecordKeyList.get(position);
        if (this.clickStatusNum == 0 && sportRecordKey == this.firstChartRecordKey) {
            this.clickStatusNum = 1;
            holder.getImageView().setChecked(true);
        }
        SportRecordDataUtil sportRecordDataUtil = SportRecordDataUtil.INSTANCE;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(sportRecordDataUtil.getLinerColorsByKey(sportRecordKey));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        holder.getImageView().setButtonTintList(colorStateListValueOf);
        holder.getTextView().setText(sportRecordDataUtil.getTitleStrByType(this.mContext, sportRecordKey, Integer.valueOf(this.mSportType)));
        holder.getClickView().setOnClickListener(new View.OnClickListener() { // from class: ztn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportRecordLandTitleAdapter.onBindViewHolder$lambda$0(this.f41668a, holder, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DetailTitleViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(ivi.B1, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new DetailTitleViewHolder(viewInflate);
    }
}
