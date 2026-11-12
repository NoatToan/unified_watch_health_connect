package com.xiaomi.fitness.trail.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.viewbinding.LazyViewBindingProperty;
import com.xiaomi.fitness.common.viewbinding.ViewBindingProperty;
import com.xiaomi.fitness.trail.adapter.RecordTypeAdapter;
import defpackage.bqp;
import defpackage.ivi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/RecordTypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/trail/adapter/RecordTypeAdapter$Holder;", "onSelect", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getOnSelect", "()Lkotlin/jvm/functions/Function1;", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "Holder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecordTypeAdapter extends RecyclerView.Adapter<Holder> {
    private final LayoutInflater inflater;

    @NotNull
    private final Function1<Integer, Unit> onSelect;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/RecordTypeAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lbqp;", "kotlin.jvm.PlatformType", "bind$delegate", "Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "getBind", "()Lbqp;", "bind", "<init>", "(Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nRecordTypeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordTypeAdapter.kt\ncom/xiaomi/fitness/trail/adapter/RecordTypeAdapter$Holder\n+ 2 ViewHolderBindings.kt\ncom/xiaomi/fitness/common/viewbinding/ViewHolderBindings\n*L\n1#1,37:1\n24#2,5:38\n*S KotlinDebug\n*F\n+ 1 RecordTypeAdapter.kt\ncom/xiaomi/fitness/trail/adapter/RecordTypeAdapter$Holder\n*L\n35#1:38,5\n*E\n"})
    public static final class Holder extends RecyclerView.d0 {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Holder.class, "bind", "getBind()Lcom/xiaomi/fitness/trail/databinding/TrailLayoutTypeBinding;", 0))};

        /* JADX INFO: renamed from: bind$delegate, reason: from kotlin metadata */
        @NotNull
        private final ViewBindingProperty bind;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.bind = new LazyViewBindingProperty(new Function1<Holder, bqp>() { // from class: com.xiaomi.fitness.trail.adapter.RecordTypeAdapter$Holder$special$$inlined$viewBinding$default$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final bqp invoke2(RecordTypeAdapter.Holder viewHolder) {
                    Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                    return bqp.A0(viewHolder.itemView);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final bqp getBind() {
            return (bqp) this.bind.getValue(this, $$delegatedProperties[0]);
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecordTypeAdapter(@NotNull Function1<? super Integer, Unit> onSelect) {
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        this.onSelect = onSelect;
        this.inflater = LayoutInflater.from(ApplicationExtKt.getApplication());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$1$lambda$0(RecordTypeAdapter this$0, View view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<Integer, Unit> function1 = this$0.onSelect;
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        function1.invoke2((Integer) tag);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return 6;
    }

    @NotNull
    public final Function1<Integer, Unit> getOnSelect() {
        return this.onSelect;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getBind().B.setText(String.valueOf(position));
        holder.getBind().getRoot().setTag(Integer.valueOf(position));
        StringBuilder sb = new StringBuilder();
        sb.append("onBindViewHolder: ");
        sb.append(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        final View viewInflate = this.inflater.inflate(ivi.g2, parent, false);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: y9k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecordTypeAdapter.onCreateViewHolder$lambda$1$lambda$0(this.f39963a, viewInflate, view);
            }
        });
        Intrinsics.checkNotNull(viewInflate);
        return new Holder(viewInflate);
    }
}
