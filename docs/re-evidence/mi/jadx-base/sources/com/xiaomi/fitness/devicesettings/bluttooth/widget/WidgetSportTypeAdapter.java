package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetSportTypeAdapter;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetSportTypeEntity;
import defpackage.eui;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u001c\u0010\u0010\u001a\u00020\u000b2\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J \u0010\u0014\u001a\u00020\u000b2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ\u0014\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSportTypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSportTypeAdapter$WidgetSportTypeHolder;", "<init>", "()V", "mList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSportTypeEntity;", "mTypeChooseListener", "Lkotlin/Function2;", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "setTypeChooseListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setList", "list", "getSportsType", "", "sportsType", "WidgetSportTypeHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WidgetSportTypeAdapter extends RecyclerView.Adapter<WidgetSportTypeHolder> {

    @NotNull
    private List<WidgetSportTypeEntity> mList = new ArrayList();

    @Nullable
    private Function2<? super WidgetSportTypeEntity, ? super Integer, Unit> mTypeChooseListener;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSportTypeAdapter$WidgetSportTypeHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSportTypeEntity;", "type", "", "bindData", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSportTypeEntity;)V", "Lkotlin/Function2;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onSelect", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "name", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSportTypeAdapter;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class WidgetSportTypeHolder extends RecyclerView.d0 {
        private final TextView name;
        final /* synthetic */ WidgetSportTypeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WidgetSportTypeHolder(@NotNull WidgetSportTypeAdapter widgetSportTypeAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = widgetSportTypeAdapter;
            this.name = (TextView) itemView.findViewById(zqi.Da);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSelect$lambda$0(Function2 listener, WidgetSportTypeAdapter this$0, WidgetSportTypeHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            listener.invoke(this$0.mList.get(this$1.getBindingAdapterPosition()), Integer.valueOf(this$1.getBindingAdapterPosition()));
        }

        public final void bindData(@NotNull WidgetSportTypeEntity type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.name.setText(this.this$0.getSportsType(type.getType()));
            this.itemView.setSelected(type.isSelect());
        }

        public final void onSelect(@NotNull final Function2<? super WidgetSportTypeEntity, ? super Integer, Unit> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            View view = this.itemView;
            final WidgetSportTypeAdapter widgetSportTypeAdapter = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: bkr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    WidgetSportTypeAdapter.WidgetSportTypeHolder.onSelect$lambda$0(listener, widgetSportTypeAdapter, this, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(WidgetSportTypeAdapter this$0, WidgetSportTypeEntity entity, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Function2<? super WidgetSportTypeEntity, ? super Integer, Unit> function2 = this$0.mTypeChooseListener;
        if (function2 != null) {
            function2.invoke(entity, Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mList.size();
    }

    @NotNull
    public final String getSportsType(int sportsType) {
        switch (sportsType) {
            case 0:
                return ResourceExtKt.getString(wzi.V7);
            case 1:
                return ResourceExtKt.getString(wzi.Y7);
            case 2:
                return ResourceExtKt.getString(wzi.X7);
            case 3:
                return ResourceExtKt.getString(wzi.R7);
            case 4:
                return ResourceExtKt.getString(wzi.Q7);
            case 5:
                return ResourceExtKt.getString(wzi.S7);
            case 6:
                return ResourceExtKt.getString(wzi.O7);
            case 7:
                return ResourceExtKt.getString(wzi.T7);
            case 8:
                return ResourceExtKt.getString(wzi.U7);
            case 9:
                return ResourceExtKt.getString(wzi.P7);
            default:
                return ResourceExtKt.getString(wzi.W7);
        }
    }

    public final void setList(@NotNull List<WidgetSportTypeEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mList = list;
    }

    public final void setTypeChooseListener(@NotNull Function2<? super WidgetSportTypeEntity, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mTypeChooseListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull WidgetSportTypeHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.mList.get(position));
        holder.onSelect(new Function2() { // from class: akr
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WidgetSportTypeAdapter.onBindViewHolder$lambda$0(this.f1150a, (WidgetSportTypeEntity) obj, ((Integer) obj2).intValue());
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public WidgetSportTypeHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(eui.n1, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new WidgetSportTypeHolder(this, viewInflate);
    }
}
