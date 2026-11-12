package com.xiaomi.fitness.trail.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.trail.model.AddSportTypeModel;
import defpackage.bsi;
import defpackage.ivi;
import defpackage.j1j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001&B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\u001a\u0010\u001c\u001a\u00020\u000e2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rJ\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017H\u0002J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0017H\u0002R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bR(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/AddTrailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/trail/adapter/AddTrailAdapter$AddTrailHolder;", "Landroid/view/View$OnClickListener;", "sportList", "", "Lcom/xiaomi/fitness/trail/model/AddSportTypeModel$DetailItem;", "<init>", "(Ljava/util/List;)V", "getSportList", "()Ljava/util/List;", "setSportList", "clickListener", "Lkotlin/Function1;", "", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "setClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "setOnSetDetailListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onClick", "v", "Landroid/view/View;", "getSportIntensity", "", "intensity", "getPosture", "posture", "AddTrailHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddTrailAdapter extends RecyclerView.Adapter<AddTrailHolder> implements View.OnClickListener {

    @Nullable
    private Function1<? super AddSportTypeModel.DetailItem, Unit> clickListener;

    @NotNull
    private List<AddSportTypeModel.DetailItem> sportList;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/AddTrailAdapter$AddTrailHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "bindView", "(I)V", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "setName", "(Landroid/widget/TextView;)V", "value", "getValue", "setValue", "unit", "getUnit", "setUnit", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/trail/adapter/AddTrailAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class AddTrailHolder extends RecyclerView.d0 {

        @NotNull
        private TextView name;
        final /* synthetic */ AddTrailAdapter this$0;

        @NotNull
        private TextView unit;

        @NotNull
        private TextView value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddTrailHolder(@NotNull AddTrailAdapter addTrailAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = addTrailAdapter;
            this.name = (TextView) view.findViewById(bsi.M9);
            this.value = (TextView) view.findViewById(bsi.O9);
            this.unit = (TextView) view.findViewById(bsi.N9);
        }

        public final void bindView(int position) {
            AddSportTypeModel.DetailItem detailItem = this.this$0.getSportList().get(position);
            this.name.setText(detailItem.getName());
            this.unit.setText(detailItem.getUnit());
            int itemType = detailItem.getItemType();
            if (itemType == 2) {
                TextView textView = this.value;
                Integer value = detailItem.getValue();
                Intrinsics.checkNotNull(value);
                textView.setText(TimeDateUtil.getDateHHmm24Format(value.intValue()));
                return;
            }
            if (itemType == 6) {
                TextView textView2 = this.value;
                AddTrailAdapter addTrailAdapter = this.this$0;
                Integer value2 = detailItem.getValue();
                Intrinsics.checkNotNull(value2);
                textView2.setText(addTrailAdapter.getPosture(value2.intValue()));
                return;
            }
            if (itemType != 7) {
                this.value.setText(String.valueOf(this.this$0.getSportList().get(position).getValue()));
                return;
            }
            TextView textView3 = this.value;
            AddTrailAdapter addTrailAdapter2 = this.this$0;
            Integer value3 = detailItem.getValue();
            Intrinsics.checkNotNull(value3);
            textView3.setText(addTrailAdapter2.getSportIntensity(value3.intValue()));
        }

        @NotNull
        public final TextView getName() {
            return this.name;
        }

        @NotNull
        public final TextView getUnit() {
            return this.unit;
        }

        @NotNull
        public final TextView getValue() {
            return this.value;
        }

        public final void setName(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.name = textView;
        }

        public final void setUnit(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.unit = textView;
        }

        public final void setValue(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.value = textView;
        }
    }

    public AddTrailAdapter(@NotNull List<AddSportTypeModel.DetailItem> sportList) {
        Intrinsics.checkNotNullParameter(sportList, "sportList");
        this.sportList = sportList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPosture(int posture) {
        if (posture == 0) {
            return ResourceExtKt.getString(j1j.da);
        }
        if (posture == 1) {
            return ResourceExtKt.getString(j1j.aa);
        }
        if (posture == 2) {
            return ResourceExtKt.getString(j1j.ca);
        }
        if (posture != 3) {
            return posture != 4 ? "" : ResourceExtKt.getString(j1j.ba);
        }
        return ResourceExtKt.getString(j1j.Z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSportIntensity(int intensity) {
        if (intensity == 0) {
            return ResourceExtKt.getString(j1j.k1);
        }
        if (intensity != 1) {
            return intensity != 2 ? "" : ResourceExtKt.getString(j1j.l1);
        }
        return ResourceExtKt.getString(j1j.m1);
    }

    @Nullable
    public final Function1<AddSportTypeModel.DetailItem, Unit> getClickListener() {
        return this.clickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.sportList.size();
    }

    @NotNull
    public final List<AddSportTypeModel.DetailItem> getSportList() {
        return this.sportList;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        Object tag = v != null ? v.getTag() : null;
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.trail.model.AddSportTypeModel.DetailItem");
        AddSportTypeModel.DetailItem detailItem = (AddSportTypeModel.DetailItem) tag;
        Function1<? super AddSportTypeModel.DetailItem, Unit> function1 = this.clickListener;
        if (function1 != null) {
            function1.invoke2(detailItem);
        }
    }

    public final void setClickListener(@Nullable Function1<? super AddSportTypeModel.DetailItem, Unit> function1) {
        this.clickListener = function1;
    }

    public final void setOnSetDetailListener(@NotNull Function1<? super AddSportTypeModel.DetailItem, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.clickListener = listener;
    }

    public final void setSportList(@NotNull List<AddSportTypeModel.DetailItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sportList = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull AddTrailHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setTag(this.sportList.get(position));
        holder.bindView(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public AddTrailHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(ivi.u0, parent, false);
        viewInflate.setOnClickListener(this);
        Intrinsics.checkNotNull(viewInflate);
        return new AddTrailHolder(this, viewInflate);
    }
}
