package com.xiaomi.fitness.route.track.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.route.track.view.TrackListTabAdapter;
import defpackage.izk;
import defpackage.x0j;
import defpackage.yji;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0006J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\u001c\u0010\u001a\u001a\u00020\u00072\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0006H\u0016R \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackListTabAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/route/track/view/TrackListTabAdapter$TrackListTabHolder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/route/track/view/OnTrackListTabClickListener;", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "currentSelect", "getCurrentSelect", "()I", "setCurrentSelect", "(I)V", "tabList", "", "setDataList", "select", "setSelect", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "TrackListTabHolder", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackListTabAdapter extends RecyclerView.Adapter<TrackListTabHolder> {
    private int currentSelect;

    @NotNull
    private final Function1<Integer, Unit> listener;

    @NotNull
    private final List<Integer> tabList;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackListTabAdapter$TrackListTabHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "onBind", "(I)V", "onClick", "Lizk;", "binding", "Lizk;", "<init>", "(Lcom/xiaomi/fitness/route/track/view/TrackListTabAdapter;Lizk;)V", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class TrackListTabHolder extends RecyclerView.d0 {

        @NotNull
        private final izk binding;
        final /* synthetic */ TrackListTabAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackListTabHolder(@NotNull TrackListTabAdapter trackListTabAdapter, izk binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = trackListTabAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$0(TrackListTabAdapter this$0, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.listener.invoke2(Integer.valueOf(i));
        }

        public final void onBind(int position) {
            String string;
            boolean z = position == this.this$0.getCurrentSelect();
            TextView textView = this.binding.B;
            if (position != 0) {
                string = position != 1 ? ApplicationExtKt.getApplication().getString(x0j.V) : ApplicationExtKt.getApplication().getString(x0j.T);
            } else {
                string = ApplicationExtKt.getApplication().getString(x0j.U);
            }
            textView.setText(string);
            this.binding.B.setTextColor(ApplicationExtKt.getApplication().getColor(z ? yji.f40244b : yji.f40243a));
            View select = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(select, "select");
            ViewExtKt.setVisible(select, z);
        }

        public final void onClick(final int position) {
            View root = this.binding.getRoot();
            final TrackListTabAdapter trackListTabAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: pnp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TrackListTabAdapter.TrackListTabHolder.onClick$lambda$0(trackListTabAdapter, position, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackListTabAdapter(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.tabList = CollectionsKt__CollectionsKt.mutableListOf(0, 1, 2);
    }

    public final int getCurrentSelect() {
        return this.currentSelect;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.tabList.size();
    }

    public final void setCurrentSelect(int i) {
        this.currentSelect = i;
    }

    public final void setDataList(int select) {
        this.currentSelect = select;
        notifyDataSetChanged();
    }

    public final void setSelect(int select) {
        notifyItemChanged(this.currentSelect);
        this.currentSelect = select;
        notifyItemChanged(select);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull TrackListTabHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.onBind(position);
        holder.onClick(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TrackListTabHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        izk izkVarA0 = izk.A0(LayoutInflater.from(parent.getContext()));
        Intrinsics.checkNotNullExpressionValue(izkVarA0, "inflate(...)");
        return new TrackListTabHolder(this, izkVarA0);
    }
}
