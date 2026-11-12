package com.xiaomi.fitness.health.sleep.rhythm.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import defpackage.cwb;
import defpackage.nuf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0014B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmSleepSupportDeviceAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "<init>", "()V", "SleepRhythmSleepSupportDeviceViewHolder", "SleepRhythmSleepSupportDeviceDiffCallback", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRhythmSleepSupportDeviceAdapter extends p<WearableProduct, RecyclerView.d0> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmSleepSupportDeviceAdapter$SleepRhythmSleepSupportDeviceDiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;)Z", "areContentsTheSame", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class SleepRhythmSleepSupportDeviceDiffCallback extends h.f<WearableProduct> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull WearableProduct oldItem, @NotNull WearableProduct newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getModel(), newItem.getModel());
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull WearableProduct oldItem, @NotNull WearableProduct newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getModel(), newItem.getModel());
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmSleepSupportDeviceAdapter$SleepRhythmSleepSupportDeviceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "entity", "", "bind", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;)V", "Lcwb;", "binding", "Lcwb;", "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmSleepSupportDeviceAdapter;Lcwb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSleepRhythmSleepSupportDeviceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmSleepSupportDeviceAdapter.kt\ncom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmSleepSupportDeviceAdapter$SleepRhythmSleepSupportDeviceViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,63:1\n54#2,3:64\n24#2:67\n57#2,6:68\n63#2,2:75\n57#3:74\n*S KotlinDebug\n*F\n+ 1 SleepRhythmSleepSupportDeviceAdapter.kt\ncom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmSleepSupportDeviceAdapter$SleepRhythmSleepSupportDeviceViewHolder\n*L\n45#1:64,3\n45#1:67\n45#1:68,6\n45#1:75,2\n45#1:74\n*E\n"})
    public final class SleepRhythmSleepSupportDeviceViewHolder extends RecyclerView.d0 {

        @NotNull
        private final cwb binding;
        final /* synthetic */ SleepRhythmSleepSupportDeviceAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepRhythmSleepSupportDeviceViewHolder(@NotNull SleepRhythmSleepSupportDeviceAdapter sleepRhythmSleepSupportDeviceAdapter, cwb binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = sleepRhythmSleepSupportDeviceAdapter;
            this.binding = binding;
            nuf.f(this.itemView);
        }

        public final void bind(@NotNull WearableProduct entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            ImageView deviceIcon = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(deviceIcon, "deviceIcon");
            Coil.imageLoader(deviceIcon.getContext()).enqueue(new ImageRequest.Builder(deviceIcon.getContext()).data(entity.getSmallIcon()).target(deviceIcon).build());
            this.binding.B.setText(entity.getProductName());
        }
    }

    public SleepRhythmSleepSupportDeviceAdapter() {
        super(new SleepRhythmSleepSupportDeviceDiffCallback());
    }

    @Override // androidx.recyclerview.widget.p, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return getCurrentList().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        WearableProduct wearableProduct = getCurrentList().get(position);
        if (holder instanceof SleepRhythmSleepSupportDeviceViewHolder) {
            Intrinsics.checkNotNull(wearableProduct);
            ((SleepRhythmSleepSupportDeviceViewHolder) holder).bind(wearableProduct);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        cwb cwbVarA0 = cwb.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(cwbVarA0, "inflate(...)");
        return new SleepRhythmSleepSupportDeviceViewHolder(this, cwbVarA0);
    }
}
