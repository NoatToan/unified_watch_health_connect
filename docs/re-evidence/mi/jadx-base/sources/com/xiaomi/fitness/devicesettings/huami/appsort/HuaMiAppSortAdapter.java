package com.xiaomi.fitness.devicesettings.huami.appsort;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortAdapter;
import defpackage.eui;
import defpackage.jni;
import defpackage.wzi;
import defpackage.zqi;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003567B\u001d\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b3\u00104J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010#R+\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u00040,j\b\u0012\u0004\u0012\u00020\u0004`-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortBean;", "", "deepCopy", "(Ljava/util/List;)Ljava/util/List;", "item", "", "onItemIconClicked", "(Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortBean;)V", "initOriginDataList", "()V", "", "isListChanged", "()Z", "list", "setOriginDataList", "(Ljava/util/List;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "mDataList", "Ljava/util/List;", "getMDataList", "()Ljava/util/List;", "Landroidx/recyclerview/widget/l;", "itemTouchHelper", "Landroidx/recyclerview/widget/l;", "getItemTouchHelper", "()Landroidx/recyclerview/widget/l;", "mOriginDataList", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "itemComparator$delegate", "Lkotlin/Lazy;", "getItemComparator", "()Ljava/util/Comparator;", "itemComparator", "<init>", "(Ljava/util/List;Landroidx/recyclerview/widget/l;)V", "HuaMiAppSortViewHolder", "HuaMiAppSortHideViewHolder", "HuaMiAppSortViewHolderLabel", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHuaMiAppSortAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuaMiAppSortAdapter.kt\ncom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n360#2,7:192\n360#2,7:199\n*S KotlinDebug\n*F\n+ 1 HuaMiAppSortAdapter.kt\ncom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortAdapter\n*L\n162#1:192,7\n180#1:199,7\n*E\n"})
public final class HuaMiAppSortAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: itemComparator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy itemComparator;

    @NotNull
    private final l itemTouchHelper;

    @NotNull
    private final List<HuaMiAppSortBean> mDataList;
    private List<HuaMiAppSortBean> mOriginDataList;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortAdapter$HuaMiAppSortHideViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortAdapter;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HuaMiAppSortHideViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView icon;

        @NotNull
        private final TextView name;
        final /* synthetic */ HuaMiAppSortAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HuaMiAppSortHideViewHolder(@NotNull HuaMiAppSortAdapter huaMiAppSortAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = huaMiAppSortAdapter;
            View viewFindViewById = view.findViewById(zqi.A3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(zqi.B5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.name = (TextView) viewFindViewById2;
        }

        @NotNull
        public final ImageView getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextView getName() {
            return this.name;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortAdapter$HuaMiAppSortViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "swipe", "getSwipe", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortAdapter;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HuaMiAppSortViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView icon;

        @NotNull
        private final TextView name;

        @NotNull
        private final ImageView swipe;
        final /* synthetic */ HuaMiAppSortAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HuaMiAppSortViewHolder(@NotNull HuaMiAppSortAdapter huaMiAppSortAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = huaMiAppSortAdapter;
            View viewFindViewById = view.findViewById(zqi.A3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(zqi.B5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.name = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(zqi.Z8);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.swipe = (ImageView) viewFindViewById3;
        }

        @NotNull
        public final ImageView getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextView getName() {
            return this.name;
        }

        @NotNull
        public final ImageView getSwipe() {
            return this.swipe;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortAdapter$HuaMiAppSortViewHolderLabel;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "descTv", "Landroid/widget/TextView;", "getDescTv", "()Landroid/widget/TextView;", "label", "getLabel", "Landroid/view/ViewGroup;", "tipInfo", "Landroid/view/ViewGroup;", "getTipInfo", "()Landroid/view/ViewGroup;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortAdapter;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HuaMiAppSortViewHolderLabel extends RecyclerView.d0 {

        @NotNull
        private final TextView descTv;

        @NotNull
        private final ImageView icon;

        @NotNull
        private final TextView label;
        final /* synthetic */ HuaMiAppSortAdapter this$0;

        @NotNull
        private final ViewGroup tipInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HuaMiAppSortViewHolderLabel(@NotNull HuaMiAppSortAdapter huaMiAppSortAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = huaMiAppSortAdapter;
            View viewFindViewById = view.findViewById(zqi.A3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(zqi.e1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.descTv = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(zqi.g4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.label = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(zqi.S9);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.tipInfo = (ViewGroup) viewFindViewById4;
        }

        @NotNull
        public final TextView getDescTv() {
            return this.descTv;
        }

        @NotNull
        public final ImageView getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextView getLabel() {
            return this.label;
        }

        @NotNull
        public final ViewGroup getTipInfo() {
            return this.tipInfo;
        }
    }

    public HuaMiAppSortAdapter(@NotNull List<HuaMiAppSortBean> mDataList, @NotNull l itemTouchHelper) {
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        Intrinsics.checkNotNullParameter(itemTouchHelper, "itemTouchHelper");
        this.mDataList = mDataList;
        this.itemTouchHelper = itemTouchHelper;
        this.itemComparator = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mhc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HuaMiAppSortAdapter.itemComparator_delegate$lambda$0();
            }
        });
    }

    private final List<HuaMiAppSortBean> deepCopy(List<HuaMiAppSortBean> list) {
        Gson gson = new Gson();
        Object objFromJson = gson.fromJson(gson.toJson(list), new TypeToken<List<HuaMiAppSortBean>>() { // from class: com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortAdapter.deepCopy.1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return (List) objFromJson;
    }

    private final Comparator<HuaMiAppSortBean> getItemComparator() {
        return (Comparator) this.itemComparator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HuaMiAppSortViewModel.ItemComparator itemComparator_delegate$lambda$0() {
        return new HuaMiAppSortViewModel.ItemComparator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(HuaMiAppSortBean item, HuaMiAppSortAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (item.isAlwaysShown()) {
            return;
        }
        this$0.onItemIconClicked(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$2(HuaMiAppSortAdapter this$0, RecyclerView.d0 holder, View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0) {
            return false;
        }
        this$0.itemTouchHelper.x(holder);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3(HuaMiAppSortBean item, HuaMiAppSortAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (item.isAlwaysShown()) {
            return;
        }
        this$0.onItemIconClicked(item);
    }

    private final void onItemIconClicked(HuaMiAppSortBean item) {
        int iIndexOf = this.mDataList.indexOf(item);
        int i = 0;
        int i2 = -1;
        if (!item.getAppItem().getEnable()) {
            item.setType(1);
            item.getAppItem().setParentType(7);
            item.getAppItem().setEnable(true);
            CollectionsKt__MutableCollectionsJVMKt.sortWith(this.mDataList, getItemComparator());
            notifyItemMoved(iIndexOf, this.mDataList.indexOf(item));
            notifyDataSetChanged();
            Iterator<HuaMiAppSortBean> it = this.mDataList.iterator();
            while (it.hasNext()) {
                if (it.next().getType() == 2) {
                    i2 = i;
                    break;
                }
                i++;
            }
            if (i2 > 0 && i2 < this.mDataList.size() - 1 && this.mDataList.get(i2 + 1).getAppItem().getParentType() == 7) {
                notifyItemRangeChanged(i2, 1);
            }
            List<HuaMiAppSortBean> list = this.mDataList;
            if (list.get(list.size() - 1).getType() == 0) {
                notifyItemRangeChanged(this.mDataList.size() - 1, 1);
                return;
            }
            return;
        }
        item.setType(3);
        item.getAppItem().setParentType(-1);
        item.getAppItem().setEnable(false);
        CollectionsKt__MutableCollectionsJVMKt.sortWith(this.mDataList, getItemComparator());
        int iIndexOf2 = this.mDataList.indexOf(item);
        notifyItemMoved(iIndexOf, iIndexOf2);
        Iterator<HuaMiAppSortBean> it2 = this.mDataList.iterator();
        while (it2.hasNext()) {
            if (it2.next().getType() == 2) {
                i2 = i;
                break;
            }
            i++;
        }
        if (i2 > 0 && i2 < this.mDataList.size() - 1 && this.mDataList.get(i2 + 1).getAppItem().getParentType() != 7) {
            notifyItemRangeChanged(i2, 1);
        }
        int i3 = iIndexOf2 - 1;
        if (this.mDataList.get(i3).getType() == 0) {
            notifyItemRangeChanged(i3, 2);
        } else {
            notifyItemRangeChanged(iIndexOf2, 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mDataList.size();
    }

    @NotNull
    public final l getItemTouchHelper() {
        return this.itemTouchHelper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.mDataList.get(position).getType();
    }

    @NotNull
    public final List<HuaMiAppSortBean> getMDataList() {
        return this.mDataList;
    }

    public final void initOriginDataList() {
        if (this.mOriginDataList != null) {
            return;
        }
        Gson gson = new Gson();
        this.mOriginDataList = (List) gson.fromJson(gson.toJson(this.mDataList), new TypeToken<List<HuaMiAppSortBean>>() { // from class: com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortAdapter.initOriginDataList.1
        }.getType());
    }

    public final boolean isListChanged() {
        List<HuaMiAppSortBean> list = this.mOriginDataList;
        if (list == null) {
            Logger.e("HuaMiAppSortAdapter: mOriginDataList has not been initialized", new Object[0]);
            return false;
        }
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOriginDataList");
            list = null;
        }
        return !Intrinsics.areEqual(list, this.mDataList);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ef  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final RecyclerView.d0 holder, int position) {
        boolean z;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final HuaMiAppSortBean huaMiAppSortBean = this.mDataList.get(position);
        if (holder instanceof HuaMiAppSortViewHolder) {
            if (TextUtils.isEmpty(huaMiAppSortBean.getName())) {
                HuaMiAppSortViewHolder huaMiAppSortViewHolder = (HuaMiAppSortViewHolder) holder;
                huaMiAppSortViewHolder.getName().setVisibility(4);
                huaMiAppSortViewHolder.getIcon().setVisibility(8);
            } else {
                HuaMiAppSortViewHolder huaMiAppSortViewHolder2 = (HuaMiAppSortViewHolder) holder;
                huaMiAppSortViewHolder2.getName().setVisibility(0);
                huaMiAppSortViewHolder2.getIcon().setVisibility(0);
                huaMiAppSortViewHolder2.getName().setText(huaMiAppSortBean.getName());
                huaMiAppSortViewHolder2.getIcon().setImageResource(huaMiAppSortBean.getIconRes());
                huaMiAppSortViewHolder2.getIcon().setOnClickListener(new View.OnClickListener() { // from class: nhc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HuaMiAppSortAdapter.onBindViewHolder$lambda$1(huaMiAppSortBean, this, view);
                    }
                });
                huaMiAppSortViewHolder2.getSwipe().setEnabled(huaMiAppSortBean.getAppItem().getType() != 18);
                huaMiAppSortViewHolder2.getSwipe().setVisibility(huaMiAppSortBean.getSwipeIconVisible() ? 0 : 8);
                huaMiAppSortViewHolder2.getSwipe().setOnTouchListener(new View.OnTouchListener() { // from class: ohc
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return HuaMiAppSortAdapter.onBindViewHolder$lambda$2(this.f29170a, holder, view, motionEvent);
                    }
                });
            }
            HuaMiAppSortViewHolder huaMiAppSortViewHolder3 = (HuaMiAppSortViewHolder) holder;
            huaMiAppSortViewHolder3.getName().setEnabled(true);
            huaMiAppSortViewHolder3.getSwipe().setEnabled(true);
            return;
        }
        if (!(holder instanceof HuaMiAppSortViewHolderLabel)) {
            if (holder instanceof HuaMiAppSortHideViewHolder) {
                HuaMiAppSortHideViewHolder huaMiAppSortHideViewHolder = (HuaMiAppSortHideViewHolder) holder;
                huaMiAppSortHideViewHolder.getName().setText(huaMiAppSortBean.getName());
                huaMiAppSortHideViewHolder.getIcon().setImageResource(huaMiAppSortBean.getIconRes());
                huaMiAppSortHideViewHolder.getIcon().setOnClickListener(new View.OnClickListener() { // from class: phc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HuaMiAppSortAdapter.onBindViewHolder$lambda$3(huaMiAppSortBean, this, view);
                    }
                });
                return;
            }
            return;
        }
        int type = huaMiAppSortBean.getType();
        HuaMiAppSortViewHolderLabel huaMiAppSortViewHolderLabel = (HuaMiAppSortViewHolderLabel) holder;
        huaMiAppSortViewHolderLabel.getLabel().setText(huaMiAppSortBean.getName());
        if (type == 0) {
            huaMiAppSortViewHolderLabel.getTipInfo().setVisibility(position >= this.mDataList.size() - 1 ? 0 : 8);
            huaMiAppSortViewHolderLabel.getIcon().setImageResource(jni.y1);
            huaMiAppSortViewHolderLabel.getDescTv().setText(ResourceExtKt.getString(wzi.W9));
        } else {
            if (type != 2) {
                return;
            }
            if (position < this.mDataList.size() - 1) {
                int i = position + 1;
                z = this.mDataList.get(i).getType() == 1 && this.mDataList.get(i).getAppItem().getParentType() == 7;
            }
            huaMiAppSortViewHolderLabel.getTipInfo().setVisibility(z ? 8 : 0);
            huaMiAppSortViewHolderLabel.getIcon().setImageResource(jni.f22948a);
            huaMiAppSortViewHolderLabel.getDescTv().setText(ResourceExtKt.getString(wzi.Y));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(eui.T2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new HuaMiAppSortViewHolder(this, viewInflate);
        }
        if (viewType != 3) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(eui.U2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new HuaMiAppSortViewHolderLabel(this, viewInflate2);
        }
        View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(eui.Q2, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
        return new HuaMiAppSortHideViewHolder(this, viewInflate3);
    }

    public final void setOriginDataList(@NotNull List<HuaMiAppSortBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mOriginDataList = deepCopy(list);
    }
}
