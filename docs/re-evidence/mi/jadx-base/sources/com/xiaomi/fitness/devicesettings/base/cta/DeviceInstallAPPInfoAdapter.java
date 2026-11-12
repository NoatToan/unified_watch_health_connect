package com.xiaomi.fitness.devicesettings.base.cta;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import defpackage.ke6;
import defpackage.nuf;
import defpackage.w69;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPInfoAdapter;", "Landroidx/recyclerview/widget/p;", "Lw69;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "<init>", "()V", "InstallAppItemViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceInstallAPPInfoAdapter extends p<w69, RecyclerView.d0> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPInfoAdapter$InstallAppItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lw69;", "entity", "", "bind", "(Lw69;)V", "Lke6;", "binding", "Lke6;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPInfoAdapter;Lke6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class InstallAppItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ke6 binding;
        final /* synthetic */ DeviceInstallAPPInfoAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstallAppItemViewHolder(@NotNull DeviceInstallAPPInfoAdapter deviceInstallAPPInfoAdapter, ke6 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = deviceInstallAPPInfoAdapter;
            this.binding = binding;
            nuf.f(this.itemView);
        }

        public final void bind(@NotNull w69 entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            this.binding.B.setText(entity.d);
            this.binding.C.setText("包名：" + entity.c);
            this.binding.D.setText("版本号：" + entity.e);
            this.binding.A.setText("安装时间：" + entity.f);
        }
    }

    public DeviceInstallAPPInfoAdapter() {
        super(new DeviceInstallAPPInfoDiffCallback());
    }

    @Override // androidx.recyclerview.widget.p, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return getCurrentList().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        w69 w69Var = getCurrentList().get(position);
        if (holder instanceof InstallAppItemViewHolder) {
            Intrinsics.checkNotNull(w69Var);
            ((InstallAppItemViewHolder) holder).bind(w69Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ke6 ke6VarA0 = ke6.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(ke6VarA0, "inflate(...)");
        return new InstallAppItemViewHolder(this, ke6VarA0);
    }
}
