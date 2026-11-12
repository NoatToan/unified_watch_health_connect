package com.xiaomi.fitness.baseui.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.f;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.baseui.ViewCreator;
import com.xiaomi.fitness.baseui.extension.RecycleViewExtKt;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BaseAdapter;
import com.xiaomi.fitness.baseui.recyclerview.diff.DefaultDiffCallback;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.a0;
import defpackage.ghe;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000·\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001l\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0014\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010P¢\u0006\u0005\b\u0087\u0001\u0010VJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0014J%\u0010\u0016\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u0007J\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J\u001d\u0010'\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\b)\u0010(J%\u0010)\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00028\u0000¢\u0006\u0004\b,\u0010-J\u001f\u0010,\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\n2\u0006\u0010+\u001a\u00028\u0000¢\u0006\u0004\b,\u0010.J\u0019\u0010/\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0005¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b3\u00104J\u0015\u00103\u001a\u00020\u00052\u0006\u00105\u001a\u00028\u0000¢\u0006\u0004\b3\u0010-J\u001b\u00106\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\b6\u0010(J)\u0010:\u001a\u00020\u00052\u0006\u00107\u001a\u00020\n2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000008¢\u0006\u0004\b:\u0010;J\u001d\u0010>\u001a\u00020\u00052\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<H\u0004¢\u0006\u0004\b>\u0010?JU\u0010F\u001a\u00020\u00052F\u0010E\u001aB\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\n¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0012¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u00050@j\b\u0012\u0004\u0012\u00028\u0000`D¢\u0006\u0004\bF\u0010GJU\u0010H\u001a\u00020\u00052F\u0010E\u001aB\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\n¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0012¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u00050@j\b\u0012\u0004\u0012\u00028\u0000`D¢\u0006\u0004\bH\u0010GJ\u001d\u0010K\u001a\u00020\u00052\f\b\u0001\u0010J\u001a\u00020I\"\u00020\nH\u0004¢\u0006\u0004\bK\u0010LJU\u0010O\u001a\u00020\u00052F\u0010E\u001aB\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\n¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0012¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020M0@j\b\u0012\u0004\u0012\u00028\u0000`N¢\u0006\u0004\bO\u0010GR$\u0010Q\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010W\u001a\u00020\u000e8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R(\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\b'\u0010?R(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010a\u001a\u0004\u0018\u00010 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010b\u001a\u0004\bc\u0010dR(\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR'\u0010q\u001a\u0012\u0012\u000e\u0012\f\b\u0002 p*\u0004\u0018\u00018\u00008\u00000o8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bq\u0010rRf\u0010s\u001aF\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\n¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0012¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u0005\u0018\u00010@j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`D8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010GRf\u0010x\u001aF\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\n¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0012¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020M\u0018\u00010@j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`N8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bx\u0010t\u001a\u0004\by\u0010v\"\u0004\bz\u0010GRZ\u0010{\u001aF\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\n¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0012¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u0005\u0018\u00010@j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010tR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020\n0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~Rp\u0010\u0081\u0001\u001aI\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\n¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u007fj\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0080\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001\u0082\u0002\u0004\n\u0002\b9¨\u0006\u0088\u0001"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "holder", "", "setClickListener", "(Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "Landroid/view/LayoutInflater;", "inflater", "createViewHolder", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "Landroid/view/View;", "view", "(Landroid/view/View;)Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "position", "onBindViewHolder", "(Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;I)V", "", "getItemId", "(I)J", "getItemViewType", "(I)I", "onViewRecycled", "getItemCount", "()I", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetachedFromRecyclerView", "", "list", "setDataList", "(Ljava/util/List;)V", "addDataList", "(ILjava/util/List;)V", "item", "addData", "(Ljava/lang/Object;)V", "(ILjava/lang/Object;)V", "getItemData", "(I)Ljava/lang/Object;", CervicalMucusRecord.Appearance.CLEAR, "()V", "remove", "(I)V", "data", "removeAll", "index", "Lkotlin/Function1;", "replace", "replaceAt", "(ILkotlin/jvm/functions/Function1;)V", "Landroidx/databinding/f;", "datas", "updateData", "(Landroidx/databinding/f;)V", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "itemView", "Lcom/xiaomi/fitness/baseui/extension/OnItemListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Lkotlin/jvm/functions/Function3;)V", "setOnChildClickListener", "", "viewIds", "addChildClickViewIds", "([I)V", "", "Lcom/xiaomi/fitness/baseui/extension/OnItemLongListener;", "setOnItemLongClickListener", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "setLifecycle", "(Landroidx/lifecycle/Lifecycle;)V", "mInflater", "Landroid/view/LayoutInflater;", "getMInflater", "()Landroid/view/LayoutInflater;", "setMInflater", "(Landroid/view/LayoutInflater;)V", "dataList", "Landroidx/databinding/f;", "getDataList", "()Landroidx/databinding/f;", "value", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/h$f;", "diffCallback", "Landroidx/recyclerview/widget/h$f;", "getDiffCallback", "()Landroidx/recyclerview/widget/h$f;", "setDiffCallback", "(Landroidx/recyclerview/widget/h$f;)V", "com/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter$listUpdateCallback$1", "listUpdateCallback", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter$listUpdateCallback$1;", "Landroidx/recyclerview/widget/d;", "kotlin.jvm.PlatformType", "differ", "Landroidx/recyclerview/widget/d;", "mListener", "Lkotlin/jvm/functions/Function3;", "getMListener", "()Lkotlin/jvm/functions/Function3;", "setMListener", "mLongListener", "getMLongListener", "setMLongListener", "mChildListener", "Ljava/util/LinkedHashSet;", "mChildClickViewIds", "Ljava/util/LinkedHashSet;", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/ViewHolderFactory;", "viewHolderFactory", "Lkotlin/jvm/functions/Function2;", "getViewHolderFactory", "()Lkotlin/jvm/functions/Function2;", "setViewHolderFactory", "(Lkotlin/jvm/functions/Function2;)V", "<init>", "ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBaseAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAdapter.kt\ncom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,288:1\n1863#2,2:289\n13423#3,2:291\n*S KotlinDebug\n*F\n+ 1 BaseAdapter.kt\ncom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter\n*L\n138#1:289,2\n278#1:291,2\n*E\n"})
public abstract class BaseAdapter<T> extends RecyclerView.Adapter<BaseViewHolder<T>> {

    @NotNull
    private f<T> dataList;

    @NotNull
    private h.f<T> diffCallback;

    @NotNull
    private final d<T> differ;

    @Nullable
    private Lifecycle lifecycle;

    @NotNull
    private final BaseAdapter$listUpdateCallback$1 listUpdateCallback;

    @NotNull
    private final LinkedHashSet<Integer> mChildClickViewIds;

    @Nullable
    private Function3<? super T, ? super Integer, ? super View, Unit> mChildListener;
    protected LayoutInflater mInflater;

    @Nullable
    private Function3<? super T, ? super Integer, ? super View, Unit> mListener;

    @Nullable
    private Function3<? super T, ? super Integer, ? super View, Boolean> mLongListener;

    @Nullable
    private RecyclerView recyclerView;

    @Nullable
    private Function2<? super View, ? super Integer, ? extends BaseViewHolder<T>> viewHolderFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void setClickListener(final BaseViewHolder<T> holder) {
        final Function3<? super T, ? super Integer, ? super View, Unit> function3 = this.mListener;
        if (function3 != null) {
            ViewExtKt.clickWithTrigger$default(holder.itemView, 0L, new Function1() { // from class: c22
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseAdapter.setClickListener$lambda$2$lambda$1(holder, function3, this, (View) obj);
                }
            }, 1, null);
        }
        Iterator<T> it = this.mChildClickViewIds.iterator();
        while (it.hasNext()) {
            View viewFindViewById = holder.itemView.findViewById(((Number) it.next()).intValue());
            if (viewFindViewById != null) {
                ViewExtKt.clickWithTrigger$default(viewFindViewById, 0L, new Function1() { // from class: d22
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return BaseAdapter.setClickListener$lambda$5$lambda$4(this.f14982a, holder, (View) obj);
                    }
                }, 1, null);
            }
        }
        final Function3<? super T, ? super Integer, ? super View, Boolean> function4 = this.mLongListener;
        if (function4 != null) {
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: e22
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return BaseAdapter.setClickListener$lambda$7$lambda$6(holder, function4, this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setClickListener$lambda$2$lambda$1(BaseViewHolder holder, Function3 it, BaseAdapter this$0, View v) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return Unit.INSTANCE;
        }
        Object itemData = this$0.getItemData(bindingAdapterPosition);
        Intrinsics.checkNotNull(itemData);
        it.invoke(itemData, Integer.valueOf(bindingAdapterPosition), v);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setClickListener$lambda$5$lambda$4(BaseAdapter this$0, BaseViewHolder holder, View v) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(v, "v");
        Function3<? super T, ? super Integer, ? super View, Unit> function3 = this$0.mChildListener;
        if (function3 != null) {
            int bindingAdapterPosition = holder.getBindingAdapterPosition();
            if (bindingAdapterPosition == -1) {
                return Unit.INSTANCE;
            }
            a0 a0Var = (Object) this$0.getItemData(bindingAdapterPosition);
            Intrinsics.checkNotNull(a0Var);
            function3.invoke(a0Var, Integer.valueOf(bindingAdapterPosition), v);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setClickListener$lambda$7$lambda$6(BaseViewHolder holder, Function3 it, BaseAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        Object itemData = this$0.getItemData(bindingAdapterPosition);
        Intrinsics.checkNotNull(itemData);
        Integer numValueOf = Integer.valueOf(bindingAdapterPosition);
        Intrinsics.checkNotNull(view);
        return ((Boolean) it.invoke(itemData, numValueOf, view)).booleanValue();
    }

    public final void addChildClickViewIds(@NotNull int... viewIds) {
        Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        for (int i : viewIds) {
            this.mChildClickViewIds.add(Integer.valueOf(i));
        }
    }

    public final void addData(T item) {
        addData(this.dataList.size(), item);
    }

    public final void addDataList(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.dataList.addAll(list);
        updateData(this.dataList);
    }

    public final void clear() {
        updateData(new ObservableArrayList());
    }

    @NotNull
    public BaseViewHolder<T> createViewHolder(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = inflater.inflate(viewType, parent, false);
        Function2<? super View, ? super Integer, ? extends BaseViewHolder<T>> function2 = this.viewHolderFactory;
        if (function2 == null) {
            return createViewHolder(viewInflate);
        }
        Intrinsics.checkNotNull(function2);
        return function2.invoke(viewInflate, Integer.valueOf(viewType));
    }

    @NotNull
    public final f<T> getDataList() {
        return this.dataList;
    }

    @NotNull
    public final h.f<T> getDiffCallback() {
        return this.diffCallback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @Nullable
    public final T getItemData(@IntRange(from = 0) int position) {
        if (position < 0 || position >= this.dataList.size()) {
            return null;
        }
        return this.dataList.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        T itemData = getItemData(position);
        return itemData instanceof ViewCreator ? ((ViewCreator) itemData).getLayoutId() : super.getItemViewType(position);
    }

    @Nullable
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @NotNull
    public final LayoutInflater getMInflater() {
        LayoutInflater layoutInflater = this.mInflater;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mInflater");
        return null;
    }

    @Nullable
    public final Function3<T, Integer, View, Unit> getMListener() {
        return this.mListener;
    }

    @Nullable
    public final Function3<T, Integer, View, Boolean> getMLongListener() {
        return this.mLongListener;
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Nullable
    public final Function2<View, Integer, BaseViewHolder<T>> getViewHolderFactory() {
        return this.viewHolderFactory;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerView = null;
    }

    public final void remove(@IntRange(from = 0) int position) {
        ListExtKt.remove(this.dataList, position);
        updateData(this.dataList);
    }

    public final void removeAll(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.dataList.removeAll(list);
        updateData(this.dataList);
    }

    public final void replaceAt(int index, @NotNull Function1<? super T, ? extends T> replace) {
        Intrinsics.checkNotNullParameter(replace, "replace");
        RecycleViewExtKt.replaceAt(this.dataList, index, replace);
    }

    public final void setDataList(@NotNull f<T> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.dataList = fVar;
    }

    public final void setDiffCallback(@NotNull h.f<T> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.diffCallback = fVar;
    }

    public final void setLifecycle(@Nullable Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public final void setMInflater(@NotNull LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<set-?>");
        this.mInflater = layoutInflater;
    }

    public final void setMListener(@Nullable Function3<? super T, ? super Integer, ? super View, Unit> function3) {
        this.mListener = function3;
    }

    public final void setMLongListener(@Nullable Function3<? super T, ? super Integer, ? super View, Boolean> function3) {
        this.mLongListener = function3;
    }

    public final void setOnChildClickListener(@NotNull Function3<? super T, ? super Integer, ? super View, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mChildListener = listener;
    }

    public final void setOnItemClickListener(@NotNull Function3<? super T, ? super Integer, ? super View, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
    }

    public final void setOnItemLongClickListener(@NotNull Function3<? super T, ? super Integer, ? super View, Boolean> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mLongListener = listener;
    }

    public final void setViewHolderFactory(@Nullable Function2<? super View, ? super Integer, ? extends BaseViewHolder<T>> function2) {
        this.viewHolderFactory = function2;
    }

    public final void updateData(@NotNull f<T> datas) {
        Intrinsics.checkNotNullParameter(datas, "datas");
        this.dataList = datas;
        this.differ.e(datas);
    }

    public /* synthetic */ BaseAdapter(Lifecycle lifecycle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lifecycle);
    }

    public final void addData(@IntRange(from = 0) int position, T item) {
        this.dataList.add(position, item);
        updateData(this.dataList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull BaseViewHolder<T> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        setClickListener(holder);
        T itemData = getItemData(position);
        if (itemData != null) {
            holder.onBindViewHolder(itemData);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final BaseViewHolder<T> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.mInflater == null) {
            setMInflater(LayoutInflater.from(parent.getContext()));
        }
        BaseViewHolder<T> baseViewHolderCreateViewHolder = createViewHolder(getMInflater(), parent, viewType);
        baseViewHolderCreateViewHolder.registerLifecycle(this);
        return baseViewHolderCreateViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull BaseViewHolder<T> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        holder.unregisterLifecycle$ui_release();
        holder.unbind();
    }

    public void setDataList(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (Intrinsics.areEqual(this.dataList, list)) {
            return;
        }
        if (list instanceof f) {
            updateData((f) list);
        } else {
            updateData(ListExtKt.newObservable(this.dataList, list));
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.xiaomi.fitness.baseui.recyclerview.adapter.BaseAdapter$listUpdateCallback$1, ghe] */
    public BaseAdapter(@Nullable Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        this.dataList = new ObservableArrayList();
        this.diffCallback = new DefaultDiffCallback();
        ?? r4 = new ghe(this) { // from class: com.xiaomi.fitness.baseui.recyclerview.adapter.BaseAdapter$listUpdateCallback$1
            final /* synthetic */ BaseAdapter<T> this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.ghe
            public void onChanged(int position, int count, Object payload) {
                this.this$0.notifyItemRangeChanged(position, count);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.ghe
            public void onInserted(int position, int count) {
                this.this$0.notifyItemRangeInserted(position, count);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.ghe
            public void onMoved(int fromPosition, int toPosition) {
                this.this$0.notifyItemMoved(fromPosition, toPosition);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.ghe
            public void onRemoved(int position, int count) {
                this.this$0.notifyItemRangeRemoved(position, count);
            }
        };
        this.listUpdateCallback = r4;
        this.differ = new d<>(r4, new c.a(this.diffCallback).a());
        this.mChildClickViewIds = new LinkedHashSet<>();
    }

    public final void addDataList(@IntRange(from = 0) int position, @NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.dataList.addAll(position, list);
        updateData(this.dataList);
    }

    public final void remove(T data) {
        int iIndexOf = this.dataList.indexOf(data);
        if (iIndexOf < 0) {
            return;
        }
        remove(iIndexOf);
    }

    @NotNull
    public BaseViewHolder<T> createViewHolder(@Nullable View view) {
        if (view != null) {
            return new DefaultViewHolder(view);
        }
        throw new NullPointerException("使用默认ViewHolder时，数据T必须实现ViewCreator接口返回布局id");
    }
}
