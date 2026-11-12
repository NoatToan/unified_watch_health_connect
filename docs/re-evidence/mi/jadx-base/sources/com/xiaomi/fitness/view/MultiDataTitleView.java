package com.xiaomi.fitness.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.c8e;
import defpackage.opo;
import defpackage.qpo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/view/MultiDataTitleView;", "Landroid/widget/FrameLayout;", "", "initRecyclerView", "()V", "", "id", "showEmpty", "(I)V", "", "Lqpo;", "list", "showNormal", "(Ljava/util/List;)V", "Lc8e;", "binding", "Lc8e;", "Landroid/widget/TextView;", "tvEmpty", "Landroid/widget/TextView;", "Landroidx/recyclerview/widget/RecyclerView;", "detailRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lopo;", "detailAdapter", "Lopo;", "", "detailList", "Ljava/util/List;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMultiDataTitleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiDataTitleView.kt\ncom/xiaomi/fitness/view/MultiDataTitleView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,102:1\n326#2,4:103\n326#2,4:107\n*S KotlinDebug\n*F\n+ 1 MultiDataTitleView.kt\ncom/xiaomi/fitness/view/MultiDataTitleView\n*L\n55#1:103,4\n61#1:107,4\n*E\n"})
public final class MultiDataTitleView extends FrameLayout {

    @NotNull
    private final c8e binding;

    @Nullable
    private opo detailAdapter;

    @NotNull
    private List<qpo> detailList;

    @NotNull
    private final RecyclerView detailRecyclerView;

    @NotNull
    private final TextView tvEmpty;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MultiDataTitleView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initRecyclerView() {
        this.detailRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.detailRecyclerView.addItemDecoration(new DetailItemDecoration());
        opo opoVar = new opo(getContext(), this.detailList);
        this.detailAdapter = opoVar;
        this.detailRecyclerView.setAdapter(opoVar);
        this.detailRecyclerView.setHasFixedSize(true);
    }

    public static /* synthetic */ void showEmpty$default(MultiDataTitleView multiDataTitleView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c0j.L6;
        }
        multiDataTitleView.showEmpty(i);
    }

    public final void showEmpty(int id) {
        ViewExtKt.setVisible(this.detailRecyclerView, false);
        ViewExtKt.setVisible(this.tvEmpty, true);
        this.tvEmpty.setText(ExtUtilKt.getString(id));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = ExtUtilsKt.getDp(6);
        setLayoutParams(marginLayoutParams);
    }

    public final void showNormal(@NotNull List<? extends qpo> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = ExtUtilsKt.getDp(30);
        setLayoutParams(marginLayoutParams);
        ViewExtKt.setVisible(this.tvEmpty, false);
        ViewExtKt.setVisible(this.detailRecyclerView, true);
        this.detailList.clear();
        this.detailList.addAll(list);
        opo opoVar = this.detailAdapter;
        if (opoVar != null) {
            opoVar.notifyDataChanged();
        }
    }

    public /* synthetic */ MultiDataTitleView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultiDataTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        c8e c8eVarA0 = c8e.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c8eVarA0, "inflate(...)");
        this.binding = c8eVarA0;
        TextView tvEmpty = c8eVarA0.B;
        Intrinsics.checkNotNullExpressionValue(tvEmpty, "tvEmpty");
        this.tvEmpty = tvEmpty;
        RecyclerView detailRecycler = c8eVarA0.A;
        Intrinsics.checkNotNullExpressionValue(detailRecycler, "detailRecycler");
        this.detailRecyclerView = detailRecycler;
        this.detailList = new ArrayList();
        initRecyclerView();
    }
}
