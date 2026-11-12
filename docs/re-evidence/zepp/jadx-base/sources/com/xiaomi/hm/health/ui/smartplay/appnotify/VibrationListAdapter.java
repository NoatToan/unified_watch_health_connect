package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.devicex.R;
import com.xiaomi.hm.health.ui.smartplay.appnotify.VibrationListAdapter;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u001d\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u001a\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u000fR\u0016\u0010\u0014\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/VibrationListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/VibrationListAdapter$VibrationViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "getItemId", "Lkotlin/Function1;", "select", "setOnSelectListener", "a", LogUtil.I, "selectVibration", "", "b", "Ljava/util/List;", "getData", "()Ljava/util/List;", "data", "c", "Lkotlin/jvm/functions/Function1;", "<init>", "(ILjava/util/List;)V", "VibrationViewHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class VibrationListAdapter extends RecyclerView.Adapter<VibrationViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int selectVibration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Function1<? super Integer, Unit> select;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/VibrationListAdapter$VibrationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "getIvVibration", "()Landroid/widget/ImageView;", "ivVibration", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getTvVibration", "()Landroid/widget/TextView;", "tvVibration", "c", "getIvSelect", "ivSelect", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class VibrationViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ImageView ivVibration;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView tvVibration;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final ImageView ivSelect;

        public VibrationViewHolder(@NotNull View view) {
            super(view);
            this.ivVibration = (ImageView) view.findViewById(R.id.iv_vibration);
            this.tvVibration = (TextView) view.findViewById(R.id.tv_vibration);
            this.ivSelect = (ImageView) view.findViewById(R.id.iv_select);
        }

        @NotNull
        public final ImageView getIvSelect() {
            return this.ivSelect;
        }

        @NotNull
        public final ImageView getIvVibration() {
            return this.ivVibration;
        }

        @NotNull
        public final TextView getTvVibration() {
            return this.tvVibration;
        }
    }

    public VibrationListAdapter(int i, @NotNull List<Integer> list) {
        this.selectVibration = i;
        this.data = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(VibrationListAdapter vibrationListAdapter, int i, View view) {
        vibrationListAdapter.selectVibration = i;
        vibrationListAdapter.notifyDataSetChanged();
        Function1<? super Integer, Unit> function1 = vibrationListAdapter.select;
        Objects.requireNonNull(function1);
        function1.invoke(Integer.valueOf(i));
    }

    @NotNull
    public final List<Integer> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    public final void setOnSelectListener(@NotNull Function1<? super Integer, Unit> select) {
        this.select = select;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull VibrationViewHolder holder, int position) {
        final int iIntValue = this.data.get(position).intValue();
        Pair<String, Integer> vibration = Vibration.INSTANCE.getVibration(iIntValue);
        holder.getTvVibration().setText(vibration.getFirst());
        holder.getIvVibration().setImageResource(vibration.getSecond().intValue());
        holder.getIvSelect().setVisibility(iIntValue == this.selectVibration ? 0 : 4);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: ea8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VibrationListAdapter.b(this.a, iIntValue, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public VibrationViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new VibrationViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vibration, parent, false));
    }
}
