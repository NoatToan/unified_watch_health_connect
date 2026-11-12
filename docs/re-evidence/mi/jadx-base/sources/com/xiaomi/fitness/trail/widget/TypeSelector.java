package com.xiaomi.fitness.trail.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportCategoryData;
import com.xiaomi.fitness.baseui.dialog.DriftDialog;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.common.viewbinding.FragmentViewBindings;
import com.xiaomi.fitness.common.viewbinding.ViewBindingProperty;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.trail.widget.TypeSelector;
import defpackage.app;
import defpackage.cpp;
import defpackage.dki;
import defpackage.ivi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b$\u0010%J?\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001cR#\u0010#\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/trail/widget/TypeSelector;", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "", "curCategory", "", "Lcom/xiaomi/fit/data/common/data/sport/SportCategoryData;", "categoryList", "Lkotlin/Function1;", "", "callback", "setData", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getGravity", "()I", "getOffsetY", "getLayoutRes", "", "isCanceledOnTouchOutside", "()Z", "Ljava/lang/String;", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "Lapp;", "kotlin.jvm.PlatformType", "binding$delegate", "Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "getBinding", "()Lapp;", "binding", "<init>", "()V", "TypeAdapter", "Holder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTypeSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSelector.kt\ncom/xiaomi/fitness/trail/widget/TypeSelector\n+ 2 FragmentViewBindings.kt\ncom/xiaomi/fitness/common/viewbinding/FragmentViewBindings\n*L\n1#1,100:1\n63#2,6:101\n*S KotlinDebug\n*F\n+ 1 TypeSelector.kt\ncom/xiaomi/fitness/trail/widget/TypeSelector\n*L\n41#1:101,6\n*E\n"})
public final class TypeSelector extends DriftDialog {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TypeSelector.class, "binding", "getBinding()Lcom/xiaomi/fitness/trail/databinding/TrailDialogTypeBinding;", 0))};

    @Nullable
    private List<SportCategoryData> categoryList;

    @Nullable
    private String curCategory = "";

    @NotNull
    private Function1<? super SportCategoryData, Unit> callback = new Function1() { // from class: d5q
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return TypeSelector.callback$lambda$0((SportCategoryData) obj);
        }
    };

    /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
    @NotNull
    private final ViewBindingProperty binding = FragmentViewBindings.viewBindingFragment(this, new Function1<TypeSelector, app>() { // from class: com.xiaomi.fitness.trail.widget.TypeSelector$special$$inlined$viewBindingFragment$default$1
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final app invoke2(TypeSelector fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return app.A0(fragment.requireView());
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/trail/widget/TypeSelector$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcpp;", "binding", "Lcpp;", "getBinding", "()Lcpp;", "<init>", "(Lcpp;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Holder extends RecyclerView.d0 {

        @NotNull
        private final cpp binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull cpp binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        @NotNull
        public final cpp getBinding() {
            return this.binding;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/trail/widget/TypeSelector$TypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/trail/widget/TypeSelector$Holder;", "Landroid/view/View$OnClickListener;", "type", "", "<init>", "(Lcom/xiaomi/fitness/trail/widget/TypeSelector;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onClick", "v", "Landroid/view/View;", "getItemCount", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class TypeAdapter extends RecyclerView.Adapter<Holder> implements View.OnClickListener {
        private final LayoutInflater inflater;
        final /* synthetic */ TypeSelector this$0;

        @NotNull
        private String type;

        public TypeAdapter(@NotNull TypeSelector typeSelector, String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.this$0 = typeSelector;
            this.type = type;
            this.inflater = LayoutInflater.from(typeSelector.requireActivity());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            List list = this.this$0.categoryList;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            Object tag = v.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fit.data.common.data.sport.SportCategoryData");
            SportCategoryData sportCategoryData = (SportCategoryData) tag;
            if (!Intrinsics.areEqual(this.this$0.curCategory, sportCategoryData.getKey())) {
                this.this$0.callback.invoke2(sportCategoryData);
            }
            this.this$0.dismissAllowingStateLoss();
        }

        public final void setType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.type = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull Holder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            List list = this.this$0.categoryList;
            Intrinsics.checkNotNull(list);
            SportCategoryData sportCategoryData = (SportCategoryData) list.get(position);
            holder.itemView.setTag(sportCategoryData);
            holder.getBinding().A.setText(sportCategoryData.getNameRes());
            if (Intrinsics.areEqual(this.type, sportCategoryData.getKey())) {
                holder.itemView.setSelected(true);
                holder.getBinding().getRoot().setBackgroundColor(ExtUtilsKt.getColor(dki.f1));
                holder.getBinding().A.setTextColor(ExtUtilsKt.getColor(dki.g1));
                ImageView selectedView = holder.getBinding().B;
                Intrinsics.checkNotNullExpressionValue(selectedView, "selectedView");
                ViewExtKt.visible(selectedView);
                return;
            }
            holder.itemView.setSelected(false);
            ImageView selectedView2 = holder.getBinding().B;
            Intrinsics.checkNotNullExpressionValue(selectedView2, "selectedView");
            ViewExtKt.invisible(selectedView2);
            holder.getBinding().getRoot().setBackgroundColor(ExtUtilsKt.getColor(dki.e1));
            holder.getBinding().A.setTextColor(ExtUtilsKt.getColor(dki.Q0));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            cpp cppVarA0 = cpp.A0(this.inflater, parent, false);
            Intrinsics.checkNotNullExpressionValue(cppVarA0, "inflate(...)");
            Holder holder = new Holder(cppVarA0);
            holder.itemView.setOnClickListener(this);
            return holder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit callback$lambda$0(SportCategoryData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final app getBinding() {
        return (app) this.binding.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(TypeSelector typeSelector, String str, List list, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            list = null;
        }
        typeSelector.setData(str, list, function1);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.DriftDialog
    public int getGravity() {
        return 49;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.DriftDialog
    public int getLayoutRes() {
        return ivi.Q1;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.DriftDialog
    public int getOffsetY() {
        return ExtUtilsKt.getDp(39);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.DriftDialog
    public boolean isCanceledOnTouchOutside() {
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.DriftDialog, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        String str = this.curCategory;
        Intrinsics.checkNotNull(str);
        TypeAdapter typeAdapter = new TypeAdapter(this, str);
        List<SportCategoryData> list = this.categoryList;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            if (list.size() > 8) {
                UIUtils uIUtils = UIUtils.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                int iDip2px = uIUtils.dip2px(contextRequireContext, 400.0f);
                RecyclerView recyclerView = getBinding().A;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                ViewExtKt.setHeight(recyclerView, iDip2px);
            }
        }
        getBinding().A.setAdapter(typeAdapter);
    }

    public final void setData(@Nullable String curCategory, @Nullable List<SportCategoryData> categoryList, @NotNull Function1<? super SportCategoryData, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.curCategory = curCategory;
        this.categoryList = categoryList;
        this.callback = callback;
    }
}
