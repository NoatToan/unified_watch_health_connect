package com.xiaomi.fitness.devicesettings.bluttooth.audio.widget.popupmenu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.widget.popupmenu.CommonPopupMenuAdapter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.hae;
import defpackage.lki;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB@\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u001c\u0010\u001a\u001a\u00020\r2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R,\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/popupmenu/CommonPopupMenuAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/popupmenu/CommonPopupMenuAdapter$PopupMenuViewHolder;", "list", "", "", "checkedPosition", "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "", "<init>", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "getList", "()Ljava/util/List;", "getCheckedPosition", "()I", "getCallback", "()Lkotlin/jvm/functions/Function1;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "getItemCount", "PopupMenuViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonPopupMenuAdapter extends RecyclerView.Adapter<PopupMenuViewHolder> {

    @NotNull
    private final Function1<Integer, Unit> callback;
    private final int checkedPosition;

    @NotNull
    private final List<String> list;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/popupmenu/CommonPopupMenuAdapter$PopupMenuViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lhae;", "binding", "Lhae;", "getBinding", "()Lhae;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/popupmenu/CommonPopupMenuAdapter;Lhae;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class PopupMenuViewHolder extends RecyclerView.d0 {

        @NotNull
        private final hae binding;
        final /* synthetic */ CommonPopupMenuAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PopupMenuViewHolder(@NotNull CommonPopupMenuAdapter commonPopupMenuAdapter, hae binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = commonPopupMenuAdapter;
            this.binding = binding;
        }

        @NotNull
        public final hae getBinding() {
            return this.binding;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonPopupMenuAdapter(@NotNull List<String> list, int i, @NotNull Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.list = list;
        this.checkedPosition = i;
        this.callback = callback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(CommonPopupMenuAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.callback.invoke2(Integer.valueOf(i));
    }

    @NotNull
    public final Function1<Integer, Unit> getCallback() {
        return this.callback;
    }

    public final int getCheckedPosition() {
        return this.checkedPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    @NotNull
    public final List<String> getList() {
        return this.list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PopupMenuViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getBinding().B.setText(this.list.get(position));
        if (position == this.checkedPosition) {
            ImageView itemChecked = holder.getBinding().A;
            Intrinsics.checkNotNullExpressionValue(itemChecked, "itemChecked");
            ViewExtKt.visible(itemChecked);
            holder.getBinding().B.setTextColor(ExtUtilsKt.getColor(lki.c));
        } else {
            ImageView itemChecked2 = holder.getBinding().A;
            Intrinsics.checkNotNullExpressionValue(itemChecked2, "itemChecked");
            ViewExtKt.invisible(itemChecked2);
            holder.getBinding().B.setTextColor(ExtUtilsKt.getColor(lki.n));
        }
        holder.getBinding().getRoot().setOnClickListener(new View.OnClickListener() { // from class: i64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonPopupMenuAdapter.onBindViewHolder$lambda$0(this.f20824a, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PopupMenuViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        hae haeVarA0 = hae.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(haeVarA0, "inflate(...)");
        return new PopupMenuViewHolder(this, haeVarA0);
    }
}
