package com.xiaomi.fitness.device.manager.ui.tab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceAccessorySportSelectAdapter;
import defpackage.hni;
import defpackage.j86;
import defpackage.uzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0007J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u001c\u0010\u0015\u001a\u00020\u00072\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006H\u0016R \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceAccessorySportSelectAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceAccessorySportSelectAdapter$DeviceAccessorySportSelectHolder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceAccessorySportSelectListener;", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "list", "", "getList", "()Ljava/util/List;", "show", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "DeviceAccessorySportSelectHolder", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceAccessorySportSelectAdapter extends RecyclerView.Adapter<DeviceAccessorySportSelectHolder> {

    @NotNull
    private final List<Integer> list;

    @NotNull
    private final Function1<Integer, Unit> listener;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceAccessorySportSelectAdapter$DeviceAccessorySportSelectHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "onBind", "(I)V", "onClick", "Lj86;", "binding", "Lj86;", "<init>", "(Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceAccessorySportSelectAdapter;Lj86;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nDeviceAccessorySportSelectAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceAccessorySportSelectAdapter.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceAccessorySportSelectAdapter$DeviceAccessorySportSelectHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,78:1\n54#2,3:79\n24#2:82\n57#2,6:83\n63#2,2:90\n57#3:89\n*S KotlinDebug\n*F\n+ 1 DeviceAccessorySportSelectAdapter.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceAccessorySportSelectAdapter$DeviceAccessorySportSelectHolder\n*L\n26#1:79,3\n26#1:82\n26#1:83,6\n26#1:90,2\n26#1:89\n*E\n"})
    public final class DeviceAccessorySportSelectHolder extends RecyclerView.d0 {

        @NotNull
        private final j86 binding;
        final /* synthetic */ DeviceAccessorySportSelectAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceAccessorySportSelectHolder(@NotNull DeviceAccessorySportSelectAdapter deviceAccessorySportSelectAdapter, j86 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = deviceAccessorySportSelectAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$0(DeviceAccessorySportSelectAdapter this$0, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.listener.invoke2(Integer.valueOf(i));
        }

        public final void onBind(int position) {
            int i;
            String string;
            int i2;
            ImageView image = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            if (position == 0) {
                i = hni.E;
            } else if (position == 1) {
                i = hni.G;
            } else if (position != 2) {
                i = position != 3 ? hni.E : hni.F;
            } else {
                i = hni.D;
            }
            Coil.imageLoader(image.getContext()).enqueue(new ImageRequest.Builder(image.getContext()).data(Integer.valueOf(i)).target(image).build());
            TextView textView = this.binding.B;
            if (position == 0) {
                string = ResourceExtKt.getString(uzi.i2);
            } else if (position == 1) {
                string = ResourceExtKt.getString(uzi.j2);
            } else if (position != 2) {
                string = position != 3 ? "" : ResourceExtKt.getString(uzi.h2);
            } else {
                string = ResourceExtKt.getString(uzi.g2);
            }
            textView.setText(string);
            View root = this.binding.getRoot();
            if (position == 0) {
                i2 = hni.c;
            } else if (position == 1) {
                i2 = hni.d;
            } else if (position != 2) {
                i2 = position != 3 ? hni.c : hni.f20262a;
            } else {
                i2 = hni.f20263b;
            }
            root.setBackgroundResource(i2);
        }

        public final void onClick(final int position) {
            View root = this.binding.getRoot();
            final DeviceAccessorySportSelectAdapter deviceAccessorySportSelectAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: s06
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeviceAccessorySportSelectAdapter.DeviceAccessorySportSelectHolder.onClick$lambda$0(deviceAccessorySportSelectAdapter, position, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceAccessorySportSelectAdapter(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.list = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 2, 3});
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    @NotNull
    public final List<Integer> getList() {
        return this.list;
    }

    public final void show() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull DeviceAccessorySportSelectHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.onBind(position);
        holder.onClick(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DeviceAccessorySportSelectHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        j86 j86VarA0 = j86.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(j86VarA0, "inflate(...)");
        return new DeviceAccessorySportSelectHolder(this, j86VarA0);
    }
}
