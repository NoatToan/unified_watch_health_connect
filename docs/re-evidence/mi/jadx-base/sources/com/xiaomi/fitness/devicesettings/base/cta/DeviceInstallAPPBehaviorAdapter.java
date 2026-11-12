package com.xiaomi.fitness.devicesettings.base.cta;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import defpackage.ce6;
import defpackage.me6;
import defpackage.nuf;
import defpackage.q64;
import defpackage.v69;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorAdapter;", "Landroidx/recyclerview/widget/p;", "Lv69;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "<init>", "()V", "InstallAppItemViewHolder", "CTABehaviorAppAdapter", "CTABehaviorAppAdapterDiffCallback", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceInstallAPPBehaviorAdapter extends p<v69, RecyclerView.d0> {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorAdapter$CTABehaviorAppAdapter;", "Landroidx/recyclerview/widget/p;", "Lq64;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "<init>", "(Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorAdapter;)V", "CTABehaviorAppAdapterItemViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class CTABehaviorAppAdapter extends p<q64, RecyclerView.d0> {

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorAdapter$CTABehaviorAppAdapter$CTABehaviorAppAdapterItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lq64;", "entity", "", "bind", "(Lq64;)V", "Lce6;", "binding", "Lce6;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorAdapter$CTABehaviorAppAdapter;Lce6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        public final class CTABehaviorAppAdapterItemViewHolder extends RecyclerView.d0 {

            @NotNull
            private final ce6 binding;
            final /* synthetic */ CTABehaviorAppAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CTABehaviorAppAdapterItemViewHolder(@NotNull CTABehaviorAppAdapter cTABehaviorAppAdapter, ce6 binding) {
                super(binding.getRoot());
                Intrinsics.checkNotNullParameter(binding, "binding");
                this.this$0 = cTABehaviorAppAdapter;
                this.binding = binding;
                nuf.f(this.itemView);
            }

            public final void bind(@NotNull q64 entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                TextView textView = this.binding.A;
                String str = entity.c;
                String value = entity.d;
                Intrinsics.checkNotNullExpressionValue(value, "value");
                textView.setText(str + " : " + StringsKt__StringsJVMKt.replace$default(value, "\n", "", false, 4, (Object) null));
            }
        }

        public CTABehaviorAppAdapter() {
            super(new CTABehaviorAppAdapterDiffCallback());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            q64 q64Var = getCurrentList().get(position);
            if (holder instanceof CTABehaviorAppAdapterItemViewHolder) {
                Intrinsics.checkNotNull(q64Var);
                ((CTABehaviorAppAdapterItemViewHolder) holder).bind(q64Var);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            ce6 ce6VarA0 = ce6.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(ce6VarA0, "inflate(...)");
            return new CTABehaviorAppAdapterItemViewHolder(this, ce6VarA0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorAdapter$CTABehaviorAppAdapterDiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lq64;", "oldItem", "newItem", "", "areItemsTheSame", "(Lq64;Lq64;)Z", "areContentsTheSame", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class CTABehaviorAppAdapterDiffCallback extends h.f<q64> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull q64 oldItem, @NotNull q64 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.c, newItem.c);
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull q64 oldItem, @NotNull q64 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.c, newItem.c);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorAdapter$InstallAppItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lv69;", "entity", "", "bind", "(Lv69;)V", "Lme6;", "binding", "Lme6;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPBehaviorAdapter;Lme6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class InstallAppItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final me6 binding;
        final /* synthetic */ DeviceInstallAPPBehaviorAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstallAppItemViewHolder(@NotNull DeviceInstallAPPBehaviorAdapter deviceInstallAPPBehaviorAdapter, me6 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = deviceInstallAPPBehaviorAdapter;
            this.binding = binding;
            nuf.f(this.itemView);
        }

        public final void bind(@NotNull v69 entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            this.binding.A.setText(entity.c);
            CTABehaviorAppAdapter cTABehaviorAppAdapter = this.this$0.new CTABehaviorAppAdapter();
            this.binding.B.setAdapter(cTABehaviorAppAdapter);
            q64[] items = entity.d;
            Intrinsics.checkNotNullExpressionValue(items, "items");
            cTABehaviorAppAdapter.submitList(ArraysKt___ArraysKt.toMutableList(items));
        }
    }

    public DeviceInstallAPPBehaviorAdapter() {
        super(new DeviceInstallAPPBehaviorDiffCallback());
    }

    @Override // androidx.recyclerview.widget.p, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return getCurrentList().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        v69 v69Var = getCurrentList().get(position);
        if (holder instanceof InstallAppItemViewHolder) {
            Intrinsics.checkNotNull(v69Var);
            ((InstallAppItemViewHolder) holder).bind(v69Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        me6 me6VarA0 = me6.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(me6VarA0, "inflate(...)");
        return new InstallAppItemViewHolder(this, me6VarA0);
    }
}
