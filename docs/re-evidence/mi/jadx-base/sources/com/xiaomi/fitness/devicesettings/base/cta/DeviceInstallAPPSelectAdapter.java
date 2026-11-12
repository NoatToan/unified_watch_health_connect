package com.xiaomi.fitness.devicesettings.base.cta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPSelectAdapter;
import defpackage.nuf;
import defpackage.yd6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B%\u0012\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u0011j\u0002`\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u0011j\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPSelectAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/devicesettings/base/cta/CTABehaviorApp;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPSelectCallback;", "deviceInstallAPPSelectCallback", "Lkotlin/jvm/functions/Function2;", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "InstallAppSelectItemViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceInstallAPPSelectAdapter extends p<CTABehaviorApp, RecyclerView.d0> {

    @NotNull
    private final Function2<Integer, CTABehaviorApp, Unit> deviceInstallAPPSelectCallback;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPSelectAdapter$InstallAppSelectItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/base/cta/CTABehaviorApp;", "entity", "", "bind", "(Lcom/xiaomi/fitness/devicesettings/base/cta/CTABehaviorApp;)V", "Lyd6;", "binding", "Lyd6;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPSelectAdapter;Lyd6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class InstallAppSelectItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final yd6 binding;
        final /* synthetic */ DeviceInstallAPPSelectAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstallAppSelectItemViewHolder(@NotNull DeviceInstallAPPSelectAdapter deviceInstallAPPSelectAdapter, yd6 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = deviceInstallAPPSelectAdapter;
            this.binding = binding;
            nuf.f(this.itemView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(CTABehaviorApp entity, DeviceInstallAPPSelectAdapter this$0, InstallAppSelectItemViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(entity, "$entity");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            entity.setSelect(!entity.isSelect());
            this$0.deviceInstallAPPSelectCallback.invoke(Integer.valueOf(this$1.getBindingAdapterPosition()), entity);
        }

        public final void bind(@NotNull final CTABehaviorApp entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            this.binding.A.setText(entity.getAppInfo().d);
            this.binding.B.setSelected(entity.isSelect());
            TextView textView = this.binding.B;
            final DeviceInstallAPPSelectAdapter deviceInstallAPPSelectAdapter = this.this$0;
            textView.setOnClickListener(new View.OnClickListener() { // from class: c76
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeviceInstallAPPSelectAdapter.InstallAppSelectItemViewHolder.bind$lambda$0(entity, deviceInstallAPPSelectAdapter, this, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceInstallAPPSelectAdapter(@NotNull Function2<? super Integer, ? super CTABehaviorApp, Unit> deviceInstallAPPSelectCallback) {
        super(new DeviceInstallAPPSelectDiffCallback());
        Intrinsics.checkNotNullParameter(deviceInstallAPPSelectCallback, "deviceInstallAPPSelectCallback");
        this.deviceInstallAPPSelectCallback = deviceInstallAPPSelectCallback;
    }

    @Override // androidx.recyclerview.widget.p, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return getCurrentList().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CTABehaviorApp cTABehaviorApp = getCurrentList().get(position);
        if (holder instanceof InstallAppSelectItemViewHolder) {
            Intrinsics.checkNotNull(cTABehaviorApp);
            ((InstallAppSelectItemViewHolder) holder).bind(cTABehaviorApp);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        yd6 yd6VarA0 = yd6.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(yd6VarA0, "inflate(...)");
        return new InstallAppSelectItemViewHolder(this, yd6VarA0);
    }
}
