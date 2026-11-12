package com.xiaomi.fitness.devicesettings.huami.typesort;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortAdapter;
import defpackage.eui;
import defpackage.jni;
import defpackage.qyi;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004012/B\u001d\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0 \u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b-\u0010.J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ2\u0010\u0010\u001a\u00020\u00072#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010\u0005\"\u0004\b*\u0010\tR3\u0010+\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "whetherItemCountOutOfLimit", "()Z", "boolean", "", "setIsPangu", "(Z)V", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortBean;", "Lkotlin/ParameterName;", "name", "item", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemIconClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "Landroidx/recyclerview/widget/l;", "itemTouchHelper", "Landroidx/recyclerview/widget/l;", "isPangu", "Z", "setPangu", "itemIconClickListener", "Lkotlin/jvm/functions/Function1;", "<init>", "(Ljava/util/List;Landroidx/recyclerview/widget/l;)V", "Companion", "SportTypeSortViewHolder", "SportTypeSortHideViewHolder", "SportTypeSortLableViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportTypeSortAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportTypeSortAdapter.kt\ncom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n774#2:139\n865#2,2:140\n*S KotlinDebug\n*F\n+ 1 SportTypeSortAdapter.kt\ncom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortAdapter\n*L\n129#1:139\n129#1:140,2\n*E\n"})
public final class SportTypeSortAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int MAX_ENABLE_ITEM_COUNT = 11;

    @NotNull
    private final List<SportTypeSortBean> dataList;
    private boolean isPangu;

    @Nullable
    private Function1<? super SportTypeSortBean, Unit> itemIconClickListener;

    @NotNull
    private final l itemTouchHelper;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortAdapter$SportTypeSortHideViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class SportTypeSortHideViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView icon;

        @NotNull
        private final TextView name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportTypeSortHideViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortAdapter$SportTypeSortLableViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "divider", "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "Landroid/widget/TextView;", "label", "Landroid/widget/TextView;", "getLabel", "()Landroid/widget/TextView;", "Landroid/view/ViewGroup;", "tipInfo", "Landroid/view/ViewGroup;", "getTipInfo", "()Landroid/view/ViewGroup;", "view", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class SportTypeSortLableViewHolder extends RecyclerView.d0 {

        @NotNull
        private final View divider;

        @NotNull
        private final TextView label;

        @NotNull
        private final ViewGroup tipInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportTypeSortLableViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(zqi.j2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.divider = viewFindViewById;
            View viewFindViewById2 = view.findViewById(zqi.g4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.label = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(zqi.S9);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.tipInfo = (ViewGroup) viewFindViewById3;
        }

        @NotNull
        public final View getDivider() {
            return this.divider;
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortAdapter$SportTypeSortViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "swipe", "getSwipe", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class SportTypeSortViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView icon;

        @NotNull
        private final TextView name;

        @NotNull
        private final ImageView swipe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportTypeSortViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
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

    public SportTypeSortAdapter(@NotNull List<SportTypeSortBean> dataList, @NotNull l itemTouchHelper) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(itemTouchHelper, "itemTouchHelper");
        this.dataList = dataList;
        this.itemTouchHelper = itemTouchHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(boolean z, SportTypeSortAdapter this$0, SportTypeSortBean item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        if (z) {
            if (this$0.isPangu && !item.getSportTypeSort().visible() && this$0.whetherItemCountOutOfLimit()) {
                String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qyi.l, 11, 11);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), quantityString);
            } else {
                item.setType(3);
                Function1<? super SportTypeSortBean, Unit> function1 = this$0.itemIconClickListener;
                if (function1 != null) {
                    function1.invoke2(item);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$1(SportTypeSortAdapter this$0, RecyclerView.d0 holder, View view, MotionEvent event) {
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
    public static final void onBindViewHolder$lambda$2(SportTypeSortAdapter this$0, SportTypeSortBean item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        if (this$0.isPangu && !item.getSportTypeSort().visible() && this$0.whetherItemCountOutOfLimit()) {
            String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qyi.l, 11, 11);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), quantityString);
        } else {
            item.setType(1);
            Function1<? super SportTypeSortBean, Unit> function1 = this$0.itemIconClickListener;
            if (function1 != null) {
                function1.invoke2(item);
            }
        }
    }

    private final boolean whetherItemCountOutOfLimit() {
        List<SportTypeSortBean> list = this.dataList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            SportTypeSortBean sportTypeSortBean = (SportTypeSortBean) obj;
            if (sportTypeSortBean.getType() == 1 || sportTypeSortBean.getType() == 3) {
                if (sportTypeSortBean.getSportTypeSort().visible()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList.size() >= 11;
    }

    @NotNull
    public final List<SportTypeSortBean> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.dataList.get(position).getType();
    }

    /* JADX INFO: renamed from: isPangu, reason: from getter */
    public final boolean getIsPangu() {
        return this.isPangu;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final SportTypeSortBean sportTypeSortBean = this.dataList.get(position);
        final boolean z = true;
        if (holder instanceof SportTypeSortViewHolder) {
            if (this.isPangu && position == 1 && !this.dataList.get(position + 1).getSportTypeSort().visible()) {
                z = false;
            }
            if (TextUtils.isEmpty(sportTypeSortBean.getName())) {
                SportTypeSortViewHolder sportTypeSortViewHolder = (SportTypeSortViewHolder) holder;
                sportTypeSortViewHolder.getName().setVisibility(4);
                sportTypeSortViewHolder.getIcon().setVisibility(8);
            } else {
                SportTypeSortViewHolder sportTypeSortViewHolder2 = (SportTypeSortViewHolder) holder;
                sportTypeSortViewHolder2.getName().setVisibility(0);
                sportTypeSortViewHolder2.getIcon().setVisibility(0);
                sportTypeSortViewHolder2.getName().setText(sportTypeSortBean.getName());
                sportTypeSortViewHolder2.getIcon().setImageResource(z ? sportTypeSortBean.getIconRes() : jni.d1);
                sportTypeSortViewHolder2.getIcon().setOnClickListener(new View.OnClickListener() { // from class: c5o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SportTypeSortAdapter.onBindViewHolder$lambda$0(z, this, sportTypeSortBean, view);
                    }
                });
                sportTypeSortViewHolder2.getSwipe().setVisibility(sportTypeSortBean.getSwipeIconVisible() ? 0 : 4);
                sportTypeSortViewHolder2.getSwipe().setOnTouchListener(new View.OnTouchListener() { // from class: d5o
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return SportTypeSortAdapter.onBindViewHolder$lambda$1(this.f15115a, holder, view, motionEvent);
                    }
                });
            }
            ((SportTypeSortViewHolder) holder).getSwipe().setEnabled(z);
            return;
        }
        if (!(holder instanceof SportTypeSortLableViewHolder)) {
            if (holder instanceof SportTypeSortHideViewHolder) {
                SportTypeSortHideViewHolder sportTypeSortHideViewHolder = (SportTypeSortHideViewHolder) holder;
                sportTypeSortHideViewHolder.getName().setText(sportTypeSortBean.getName());
                sportTypeSortHideViewHolder.getIcon().setImageResource(sportTypeSortBean.getIconRes());
                sportTypeSortHideViewHolder.getIcon().setOnClickListener(new View.OnClickListener() { // from class: e5o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SportTypeSortAdapter.onBindViewHolder$lambda$2(this.f16290a, sportTypeSortBean, view);
                    }
                });
                return;
            }
            return;
        }
        if (sportTypeSortBean.getType() == 0) {
            SportTypeSortLableViewHolder sportTypeSortLableViewHolder = (SportTypeSortLableViewHolder) holder;
            sportTypeSortLableViewHolder.getDivider().setVisibility(0);
            sportTypeSortLableViewHolder.getTipInfo().setVisibility(position >= this.dataList.size() - 1 ? 0 : 8);
            sportTypeSortLableViewHolder.getLabel().setText(wzi.a1);
            return;
        }
        if (sportTypeSortBean.getType() == 2) {
            SportTypeSortLableViewHolder sportTypeSortLableViewHolder2 = (SportTypeSortLableViewHolder) holder;
            sportTypeSortLableViewHolder2.getDivider().setVisibility(8);
            sportTypeSortLableViewHolder2.getTipInfo().setVisibility(8);
            sportTypeSortLableViewHolder2.getLabel().setText(wzi.b1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(eui.T2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new SportTypeSortViewHolder(viewInflate);
        }
        if (viewType != 3) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(eui.U2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new SportTypeSortLableViewHolder(viewInflate2);
        }
        View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(eui.Q2, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
        return new SportTypeSortHideViewHolder(viewInflate3);
    }

    public final void setIsPangu(boolean z) {
        this.isPangu = z;
    }

    public final void setOnItemIconClickListener(@Nullable Function1<? super SportTypeSortBean, Unit> listener) {
        this.itemIconClickListener = listener;
    }

    public final void setPangu(boolean z) {
        this.isPangu = z;
    }
}
