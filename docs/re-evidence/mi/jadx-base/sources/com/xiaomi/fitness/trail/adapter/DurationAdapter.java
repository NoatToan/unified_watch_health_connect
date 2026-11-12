package com.xiaomi.fitness.trail.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.viewbinding.LazyViewBindingProperty;
import com.xiaomi.fitness.common.viewbinding.ViewBindingProperty;
import com.xiaomi.fitness.trail.data.SportPercent;
import defpackage.bsi;
import defpackage.irp;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.tli;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nH\u0016J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020\nH\u0016J\u0016\u0010%\u001a\u00020\u001c2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010'R\u0018\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n \u0007*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0018\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0018\u0010\u0015\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/DurationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/trail/adapter/DurationAdapter$Holder;", "<init>", "()V", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "nameWidth", "", "durationWidth", "list", "", "Lcom/xiaomi/fitness/trail/data/SportPercent;", "view", "Landroid/view/View;", "Landroid/view/View;", "nameView", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "durationView", "nameMax", "widthMeasureSpec", "heightMeasureSpec", "widthMeasureSpec2", "heightMeasureSpec2", "calculateDataWidth", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "setData", "data", "", "Holder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDurationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationAdapter.kt\ncom/xiaomi/fitness/trail/adapter/DurationAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1863#2,2:86\n*S KotlinDebug\n*F\n+ 1 DurationAdapter.kt\ncom/xiaomi/fitness/trail/adapter/DurationAdapter\n*L\n46#1:86,2\n*E\n"})
public final class DurationAdapter extends RecyclerView.Adapter<Holder> {
    private final TextView durationView;
    private int durationWidth;
    private final int heightMeasureSpec;
    private final int heightMeasureSpec2;
    private final LayoutInflater inflater;

    @NotNull
    private final List<SportPercent> list;
    private final int nameMax;
    private final TextView nameView;
    private int nameWidth;
    private final View view;
    private final int widthMeasureSpec;
    private final int widthMeasureSpec2;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/DurationAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lirp;", "kotlin.jvm.PlatformType", "bind$delegate", "Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "getBind", "()Lirp;", "bind", "<init>", "(Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nDurationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationAdapter.kt\ncom/xiaomi/fitness/trail/adapter/DurationAdapter$Holder\n+ 2 ViewHolderBindings.kt\ncom/xiaomi/fitness/common/viewbinding/ViewHolderBindings\n*L\n1#1,85:1\n24#2,5:86\n*S KotlinDebug\n*F\n+ 1 DurationAdapter.kt\ncom/xiaomi/fitness/trail/adapter/DurationAdapter$Holder\n*L\n58#1:86,5\n*E\n"})
    public static final class Holder extends RecyclerView.d0 {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Holder.class, "bind", "getBind()Lcom/xiaomi/fitness/trail/databinding/TrailTimeItemBinding;", 0))};

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
            this.bind = new LazyViewBindingProperty(new Function1<Holder, irp>() { // from class: com.xiaomi.fitness.trail.adapter.DurationAdapter$Holder$special$$inlined$viewBinding$default$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final irp invoke2(DurationAdapter.Holder viewHolder) {
                    Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                    return irp.A0(viewHolder.itemView);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final irp getBind() {
            return (irp) this.bind.getValue(this, $$delegatedProperties[0]);
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    public DurationAdapter() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(ApplicationExtKt.getApplication());
        this.inflater = layoutInflaterFrom;
        this.list = new ArrayList();
        View viewInflate = layoutInflaterFrom.inflate(ivi.G2, (ViewGroup) null);
        this.view = viewInflate;
        this.nameView = (TextView) viewInflate.findViewById(bsi.J4);
        this.durationView = (TextView) viewInflate.findViewById(bsi.M1);
        int dimension = ExtUtilsKt.getDimension(tli.j);
        this.nameMax = dimension;
        this.widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(dimension, Integer.MIN_VALUE);
        this.heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(dimension, Integer.MIN_VALUE);
        this.widthMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dimension, Integer.MIN_VALUE);
        this.heightMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dimension, Integer.MIN_VALUE);
    }

    private final void calculateDataWidth() {
        this.durationView.setText(ResourceExtKt.getString(j1j.s1));
        for (SportPercent sportPercent : this.list) {
            this.nameView.setText(sportPercent.getName());
            this.durationView.setText(sportPercent.getDuration());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    public final void setData(@Nullable List<SportPercent> data) {
        this.list.clear();
        List<SportPercent> list = data;
        if (list != null && !list.isEmpty()) {
            this.list.addAll(list);
        }
        calculateDataWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Group label = holder.getBind().B;
        Intrinsics.checkNotNullExpressionValue(label, "label");
        ExtUtilsKt.setVisible(label, position == 0);
        SportPercent sportPercent = this.list.get(position);
        holder.getBind().F.setText(sportPercent.getName());
        holder.getBind().A.setText(sportPercent.getDuration());
        holder.getBind().G.setPercent(sportPercent.getIntPercent());
        holder.getView().setContentDescription(sportPercent.getName() + AppUtil.getApp().getString(j1j.p1, sportPercent.getIntPercent() + "%") + TimeDateUtil.getDurationHrMinSecInMills(ApplicationExtKt.getApplication(), sportPercent.getTime() * ((long) 1000)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = this.inflater.inflate(ivi.G2, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new Holder(viewInflate);
    }
}
