package com.huami.midong.ppg.ui.midong.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.health.afppg.model.AtrialFibrillation;
import com.huami.midong.ppg.ui.midong.R;
import com.huami.midong.ppg.ui.midong.databinding.ItemAfppgEmptyLayoutBinding;
import com.huami.midong.ppg.ui.midong.databinding.ItemAfppgHeadDescLayoutBinding;
import com.huami.midong.ppg.ui.midong.databinding.ItemAfppgHeartAbnormalBinding;
import com.huami.midong.ppg.ui.midong.databinding.ItemAfppgHrDateBinding;
import com.huami.midong.ppg.ui.midong.databinding.ItemAfppgTailLoadLayoutBinding;
import com.huami.midong.ppg.ui.midong.databinding.ItemAfppgTopDecorateLayoutBinding;
import com.huami.midong.ppg.ui.midong.ui.res.MedicalResource;
import com.huami.midong.ppg.ui.midong.ui.util.AtrialUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007!\"#$%& B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0014\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0014\u0010\n\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0006\u0010\u000b\u001a\u00020\u0007J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006'"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/adapter/AfppgAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "", "getData", "data", "", "fillData", "addData", "addDataList", "loadEndRefresh", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "onBindViewHolder", "getItemCount", "getItemViewType", "", "a", "Ljava/util/List;", "dataList", "", "b", "Z", "inLoading", "<init>", "()V", "Companion", "AfppgEmptyViewHolder", "AfppgHeadViewHolder", "AfppgMainContentViewHolder", "AfppgMainTitleViewHolder", "AfppgTailViewHolder", "AfppgTopDecorateViewHolder", "afppg-ui-midong_release"}, k = 1, mv = {1, 5, 1})
public final class AfppgAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int HEAD_OFFSET = 2;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final int g = 5;
    private static final int h = 3;
    private static final int i = 2;

    @NotNull
    private static final String j = "AfppgAdapter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Object> dataList = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean inLoading = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/adapter/AfppgAdapter$AfppgEmptyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgEmptyLayoutBinding;", "emptyBinding", "<init>", "(Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgEmptyLayoutBinding;)V", "afppg-ui-midong_release"}, k = 1, mv = {1, 5, 1})
    public static final class AfppgEmptyViewHolder extends RecyclerView.ViewHolder {
        public AfppgEmptyViewHolder(@NotNull ItemAfppgEmptyLayoutBinding itemAfppgEmptyLayoutBinding) {
            super(itemAfppgEmptyLayoutBinding.getRoot());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/adapter/AfppgAdapter$AfppgHeadViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgHeadDescLayoutBinding;", "headBinding", "<init>", "(Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgHeadDescLayoutBinding;)V", "afppg-ui-midong_release"}, k = 1, mv = {1, 5, 1})
    public static final class AfppgHeadViewHolder extends RecyclerView.ViewHolder {
        public AfppgHeadViewHolder(@NotNull ItemAfppgHeadDescLayoutBinding itemAfppgHeadDescLayoutBinding) {
            super(itemAfppgHeadDescLayoutBinding.getRoot());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/adapter/AfppgAdapter$AfppgMainContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgHeartAbnormalBinding;", "a", "Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgHeartAbnormalBinding;", "getMainContentBinding", "()Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgHeartAbnormalBinding;", "mainContentBinding", "<init>", "(Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgHeartAbnormalBinding;)V", "afppg-ui-midong_release"}, k = 1, mv = {1, 5, 1})
    public static final class AfppgMainContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ItemAfppgHeartAbnormalBinding mainContentBinding;

        public AfppgMainContentViewHolder(@NotNull ItemAfppgHeartAbnormalBinding itemAfppgHeartAbnormalBinding) {
            super(itemAfppgHeartAbnormalBinding.getRoot());
            this.mainContentBinding = itemAfppgHeartAbnormalBinding;
        }

        @NotNull
        public final ItemAfppgHeartAbnormalBinding getMainContentBinding() {
            return this.mainContentBinding;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/adapter/AfppgAdapter$AfppgMainTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgHrDateBinding;", "a", "Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgHrDateBinding;", "getMainTitleBinding", "()Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgHrDateBinding;", "mainTitleBinding", "<init>", "(Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgHrDateBinding;)V", "afppg-ui-midong_release"}, k = 1, mv = {1, 5, 1})
    public static final class AfppgMainTitleViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ItemAfppgHrDateBinding mainTitleBinding;

        public AfppgMainTitleViewHolder(@NotNull ItemAfppgHrDateBinding itemAfppgHrDateBinding) {
            super(itemAfppgHrDateBinding.getRoot());
            this.mainTitleBinding = itemAfppgHrDateBinding;
        }

        @NotNull
        public final ItemAfppgHrDateBinding getMainTitleBinding() {
            return this.mainTitleBinding;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/adapter/AfppgAdapter$AfppgTailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgTailLoadLayoutBinding;", "a", "Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgTailLoadLayoutBinding;", "getTailBinding", "()Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgTailLoadLayoutBinding;", "tailBinding", "<init>", "(Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgTailLoadLayoutBinding;)V", "afppg-ui-midong_release"}, k = 1, mv = {1, 5, 1})
    public static final class AfppgTailViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ItemAfppgTailLoadLayoutBinding tailBinding;

        public AfppgTailViewHolder(@NotNull ItemAfppgTailLoadLayoutBinding itemAfppgTailLoadLayoutBinding) {
            super(itemAfppgTailLoadLayoutBinding.getRoot());
            this.tailBinding = itemAfppgTailLoadLayoutBinding;
        }

        @NotNull
        public final ItemAfppgTailLoadLayoutBinding getTailBinding() {
            return this.tailBinding;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/adapter/AfppgAdapter$AfppgTopDecorateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgTopDecorateLayoutBinding;", "topDecorateBinding", "<init>", "(Lcom/huami/midong/ppg/ui/midong/databinding/ItemAfppgTopDecorateLayoutBinding;)V", "afppg-ui-midong_release"}, k = 1, mv = {1, 5, 1})
    public static final class AfppgTopDecorateViewHolder extends RecyclerView.ViewHolder {
        public AfppgTopDecorateViewHolder(@NotNull ItemAfppgTopDecorateLayoutBinding itemAfppgTopDecorateLayoutBinding) {
            super(itemAfppgTopDecorateLayoutBinding.getRoot());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onBindViewHolder position = " + this.a + " - actualDataPosition = " + this.b;
        }
    }

    public final void addDataList(@NotNull List<? extends Object> addData) {
        this.inLoading = true;
        this.dataList.addAll(addData);
        notifyItemRangeInserted(this.dataList.size(), addData.size());
    }

    public final void fillData(@NotNull List<? extends Object> data) {
        this.inLoading = true;
        this.dataList.clear();
        this.dataList.addAll(data);
        notifyDataSetChanged();
    }

    @NotNull
    public final List<Object> getData() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        if (this.dataList.size() == 0) {
            return 2;
        }
        return this.dataList.size() + 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (position == 0) {
            return 1;
        }
        if (position == 1 && this.dataList.size() > 0) {
            return 3;
        }
        if (position == getPagerCount() - 1 && this.dataList.size() > 0) {
            return 2;
        }
        if (this.dataList.size() > 0 && (this.dataList.get(position - 2) instanceof String)) {
            return 4;
        }
        if (this.dataList.size() == 0) {
            return 5;
        }
        return super.getItemViewType(position);
    }

    public final void loadEndRefresh() {
        this.inLoading = false;
        notifyItemChanged(this.dataList.size() + 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        int i2 = position - 2;
        Context context = holder.itemView.getContext();
        HMLog.info(j, new a(position, i2));
        if (holder instanceof AfppgTailViewHolder) {
            if (this.inLoading) {
                AfppgTailViewHolder afppgTailViewHolder = (AfppgTailViewHolder) holder;
                afppgTailViewHolder.getTailBinding().afppgLoadingImg.setVisibility(0);
                afppgTailViewHolder.getTailBinding().afppgTextDesc.setText(context.getText(R.string.afppg_loading));
                return;
            } else {
                AfppgTailViewHolder afppgTailViewHolder2 = (AfppgTailViewHolder) holder;
                afppgTailViewHolder2.getTailBinding().afppgLoadingImg.setVisibility(8);
                afppgTailViewHolder2.getTailBinding().afppgTextDesc.setText(context.getText(R.string.afppg_no_data_tip));
                return;
            }
        }
        if (holder instanceof AfppgMainTitleViewHolder) {
            AfppgMainTitleViewHolder afppgMainTitleViewHolder = (AfppgMainTitleViewHolder) holder;
            afppgMainTitleViewHolder.getMainTitleBinding().divideLine.setVisibility(position != 2 ? 0 : 8);
            afppgMainTitleViewHolder.getMainTitleBinding().hrDate.setText((String) this.dataList.get(i2));
            return;
        }
        if (holder instanceof AfppgMainContentViewHolder) {
            AtrialFibrillation atrialFibrillation = (AtrialFibrillation) this.dataList.get(i2);
            MedicalResource medicalResource = MedicalResource.INSTANCE.get(atrialFibrillation.getDeviceSource());
            int duration = atrialFibrillation.getDuration();
            AtrialUtils atrialUtils = AtrialUtils.INSTANCE;
            String time = atrialUtils.formatTime(context, atrialFibrillation.getEventTime());
            String time2 = atrialUtils.formatTime(context, atrialFibrillation.getEventTime() + ((long) (atrialFibrillation.getDuration() * 60 * 1000)));
            AfppgMainContentViewHolder afppgMainContentViewHolder = (AfppgMainContentViewHolder) holder;
            afppgMainContentViewHolder.getMainContentBinding().hrAbnormalTitle.setText(context.getText(medicalResource.getAtrial_fib_text()));
            afppgMainContentViewHolder.getMainContentBinding().hrAbnormalDuration.setText(context.getResources().getString(R.string.abnormal_heart_minute_time, Integer.valueOf(duration)));
            afppgMainContentViewHolder.getMainContentBinding().hrAbnormalTime.setText(context.getString(R.string.abnormal_timespan, time, time2));
            if (duration == 1) {
                afppgMainContentViewHolder.getMainContentBinding().hrAbnormalTime.setText(context.getString(R.string.abnormal_timespan_duration1, time));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        if (viewType == 1) {
            return new AfppgHeadViewHolder(ItemAfppgHeadDescLayoutBinding.inflate(LayoutInflater.from(parent.getContext())));
        }
        if (viewType == 2) {
            return new AfppgTailViewHolder(ItemAfppgTailLoadLayoutBinding.inflate(LayoutInflater.from(parent.getContext())));
        }
        if (viewType == 3) {
            return new AfppgTopDecorateViewHolder(ItemAfppgTopDecorateLayoutBinding.inflate(LayoutInflater.from(parent.getContext())));
        }
        if (viewType != 4) {
            return viewType != 5 ? new AfppgMainContentViewHolder(ItemAfppgHeartAbnormalBinding.inflate(LayoutInflater.from(parent.getContext()))) : new AfppgEmptyViewHolder(ItemAfppgEmptyLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        }
        return new AfppgMainTitleViewHolder(ItemAfppgHrDateBinding.inflate(LayoutInflater.from(parent.getContext())));
    }
}
