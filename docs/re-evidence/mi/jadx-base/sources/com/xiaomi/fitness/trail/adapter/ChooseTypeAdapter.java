package com.xiaomi.fitness.trail.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.util.AddTrailHelper;
import defpackage.bsi;
import defpackage.ivi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001\u001cB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\r2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u001a\u0010\u0017\u001a\u00020\r2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\fJ\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/ChooseTypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/trail/adapter/ChooseTypeAdapter$ChooseTypeHolder;", "Landroid/view/View$OnClickListener;", "sportList", "", "Lcom/xiaomi/fitness/util/AddTrailHelper$SportTypeInfo;", "<init>", "(Ljava/util/List;)V", "getSportList", "()Ljava/util/List;", "clickListener", "Lkotlin/Function1;", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "setOnGODetailListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onClick", "view", "Landroid/view/View;", "ChooseTypeHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChooseTypeAdapter extends RecyclerView.Adapter<ChooseTypeHolder> implements View.OnClickListener {

    @Nullable
    private Function1<? super AddTrailHelper.SportTypeInfo, Unit> clickListener;

    @NotNull
    private final List<AddTrailHelper.SportTypeInfo> sportList;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/ChooseTypeAdapter$ChooseTypeHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "bindView", "(I)V", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "setName", "(Landroid/widget/TextView;)V", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "setIcon", "(Landroid/widget/ImageView;)V", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/trail/adapter/ChooseTypeAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ChooseTypeHolder extends RecyclerView.d0 {

        @Nullable
        private ImageView icon;

        @Nullable
        private TextView name;
        final /* synthetic */ ChooseTypeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChooseTypeHolder(@NotNull ChooseTypeAdapter chooseTypeAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = chooseTypeAdapter;
            this.name = (TextView) view.findViewById(bsi.V6);
            View viewFindViewById = view.findViewById(bsi.C2);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            this.icon = (ImageView) viewFindViewById;
        }

        public final void bindView(int position) {
            TextView textView = this.name;
            if (textView != null) {
                textView.setText(this.this$0.getSportList().get(position).getName());
            }
        }

        @Nullable
        public final ImageView getIcon() {
            return this.icon;
        }

        @Nullable
        public final TextView getName() {
            return this.name;
        }

        public final void setIcon(@Nullable ImageView imageView) {
            this.icon = imageView;
        }

        public final void setName(@Nullable TextView textView) {
            this.name = textView;
        }
    }

    public ChooseTypeAdapter(@NotNull List<AddTrailHelper.SportTypeInfo> sportList) {
        Intrinsics.checkNotNullParameter(sportList, "sportList");
        this.sportList = sportList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.sportList.size();
    }

    @NotNull
    public final List<AddTrailHelper.SportTypeInfo> getSportList() {
        return this.sportList;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Object tag = view != null ? view.getTag() : null;
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.util.AddTrailHelper.SportTypeInfo");
        AddTrailHelper.SportTypeInfo sportTypeInfo = (AddTrailHelper.SportTypeInfo) tag;
        Function1<? super AddTrailHelper.SportTypeInfo, Unit> function1 = this.clickListener;
        if (function1 != null) {
            function1.invoke2(sportTypeInfo);
        }
    }

    public final void setOnGODetailListener(@NotNull Function1<? super AddTrailHelper.SportTypeInfo, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.clickListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ChooseTypeHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setTag(this.sportList.get(position));
        holder.bindView(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ChooseTypeHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(ivi.y0, parent, false);
        viewInflate.setOnClickListener(this);
        Intrinsics.checkNotNull(viewInflate);
        return new ChooseTypeHolder(this, viewInflate);
    }
}
