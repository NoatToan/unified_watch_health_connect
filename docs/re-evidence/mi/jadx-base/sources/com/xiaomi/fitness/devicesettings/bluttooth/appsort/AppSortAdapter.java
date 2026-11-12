package com.xiaomi.fitness.devicesettings.bluttooth.appsort;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.utils.ItemDragHelperCallBack;
import com.xiaomi.fitness.baseui.utils.OnItemDragListener;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortAdapter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.eui;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00049:;<B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b7\u00108J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001f\u0010\u0005\"\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R6\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u0016\u00100\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0017\u00103\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "listHasChanged", "()Z", "Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortWrapper;", "appSortWrapper", "", "onItemIconClicked", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortWrapper;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "supportHide", "Z", "supportMore", "Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortAdapter$DragListener;", "dragListener", "Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortAdapter$DragListener;", "isDragging", "setDragging", "(Z)V", "", "TAG", "Ljava/lang/String;", "", "value", "appSortList", "Ljava/util/List;", "getAppSortList", "()Ljava/util/List;", "setAppSortList", "(Ljava/util/List;)V", "originList", "getOriginList", "setOriginList", "intentToHidePosition", "I", "Lcom/xiaomi/fitness/baseui/utils/ItemDragHelperCallBack;", "itemTouchHelperCallback", "Lcom/xiaomi/fitness/baseui/utils/ItemDragHelperCallBack;", "getItemTouchHelperCallback", "()Lcom/xiaomi/fitness/baseui/utils/ItemDragHelperCallBack;", "<init>", "(ZZLcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortAdapter$DragListener;)V", "DragListener", "AppSortItemViewHolder", "AppSortHideItemViewHolder", "AppSortLabelItemViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAppSortAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSortAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,319:1\n360#2,7:320\n360#2,7:327\n360#2,7:334\n*S KotlinDebug\n*F\n+ 1 AppSortAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortAdapter\n*L\n257#1:320,7\n278#1:327,7\n279#1:334,7\n*E\n"})
public final class AppSortAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private final String TAG;

    @NotNull
    private List<AppSortWrapper> appSortList;

    @NotNull
    private final DragListener dragListener;
    private int intentToHidePosition;
    private boolean isDragging;

    @NotNull
    private final ItemDragHelperCallBack itemTouchHelperCallback;

    @NotNull
    private List<AppSortWrapper> originList;
    private final boolean supportHide;
    private final boolean supportMore;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortAdapter$AppSortHideItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AppSortHideItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView icon;

        @NotNull
        private final TextView name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppSortHideItemViewHolder(@NotNull View view) {
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortAdapter$AppSortItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "swipe", "getSwipe", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AppSortItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView icon;

        @NotNull
        private final TextView name;

        @NotNull
        private final ImageView swipe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppSortItemViewHolder(@NotNull View view) {
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortAdapter$AppSortLabelItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "label", "Landroid/widget/TextView;", "getLabel", "()Landroid/widget/TextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "tipInfo", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getTipInfo", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AppSortLabelItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView label;

        @NotNull
        private final ConstraintLayout tipInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppSortLabelItemViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(zqi.g4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.label = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(zqi.S9);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.tipInfo = (ConstraintLayout) viewFindViewById2;
        }

        @NotNull
        public final TextView getLabel() {
            return this.label;
        }

        @NotNull
        public final ConstraintLayout getTipInfo() {
            return this.tipInfo;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortAdapter$DragListener;", "", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "", "startDragItem", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "onOrderChange", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public interface DragListener {
        void onOrderChange();

        void startDragItem(@NotNull RecyclerView.d0 holder);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortAdapter$itemTouchHelperCallback$2] */
    public AppSortAdapter(boolean z, boolean z2, @NotNull DragListener dragListener) {
        Intrinsics.checkNotNullParameter(dragListener, "dragListener");
        this.supportHide = z;
        this.supportMore = z2;
        this.dragListener = dragListener;
        this.TAG = "AppSortAdapter";
        this.appSortList = new ArrayList();
        this.originList = new ArrayList();
        final ?? r2 = new OnItemDragListener() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortAdapter$itemTouchHelperCallback$2
            @Override // com.xiaomi.fitness.baseui.utils.OnItemDragListener
            public void onItemMove(RecyclerView recyclerView, RecyclerView.d0 viewHolder, float y, float dY, boolean isCurrentlyActive) {
                RecyclerView.d0 d0VarFindViewHolderForAdapterPosition;
                int bindingAdapterPosition;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                Iterator<AppSortWrapper> it = this.this$0.getAppSortList().iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (it.next().getViewType() == 4) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != this.this$0.getAppSortList().size() - 1 || (d0VarFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) == null) {
                    return;
                }
                if (d0VarFindViewHolderForAdapterPosition.itemView.getTop() + ExtUtilsKt.getDp(50) + ((TextView) d0VarFindViewHolderForAdapterPosition.itemView.findViewById(zqi.g4)).getHeight() + viewHolder.itemView.getHeight() >= y || (bindingAdapterPosition = viewHolder.getBindingAdapterPosition()) < 0 || bindingAdapterPosition == this.this$0.intentToHidePosition) {
                    return;
                }
                this.this$0.intentToHidePosition = bindingAdapterPosition;
                int bindingAdapterPosition2 = d0VarFindViewHolderForAdapterPosition.getBindingAdapterPosition();
                if (bindingAdapterPosition2 != this.this$0.getAppSortList().size() - 1) {
                    return;
                }
                AppSortWrapper appSortWrapper = this.this$0.getAppSortList().get(bindingAdapterPosition);
                if (appSortWrapper.isAlwaysShown()) {
                    return;
                }
                Logger.i(this.this$0.TAG, "drag to remove from: " + bindingAdapterPosition + " to: " + bindingAdapterPosition2);
                appSortWrapper.getData().f = true;
                appSortWrapper.getData().h = false;
                appSortWrapper.setViewType(2);
                Collections.swap(this.this$0.getAppSortList(), bindingAdapterPosition, bindingAdapterPosition2);
                if (recyclerView.isComputingLayout()) {
                    return;
                }
                this.this$0.notifyDataSetChanged();
                this.this$0.intentToHidePosition = 0;
            }

            @Override // com.xiaomi.fitness.baseui.utils.OnItemDragListener
            public void onItemSwap(RecyclerView recyclerView, int from, int to) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                boolean z3 = false;
                if (from < to) {
                    int i = from;
                    boolean z4 = false;
                    while (i < to) {
                        AppSortWrapper appSortWrapper = this.this$0.getAppSortList().get(i);
                        int i2 = i + 1;
                        AppSortWrapper appSortWrapper2 = this.this$0.getAppSortList().get(i2);
                        if (appSortWrapper2.getViewType() == 4) {
                            appSortWrapper.getData().f = true;
                            appSortWrapper.getData().h = false;
                            appSortWrapper.setViewType(2);
                            z4 = true;
                        }
                        if (appSortWrapper2.getViewType() == 3 && appSortWrapper.getData().g) {
                            appSortWrapper.getData().f = false;
                            appSortWrapper.getData().h = true;
                            appSortWrapper.setViewType(1);
                        }
                        Collections.swap(this.this$0.getAppSortList(), i, i2);
                        i = i2;
                    }
                    z3 = z4;
                } else {
                    int i3 = to + 1;
                    if (i3 <= from) {
                        int i4 = from;
                        boolean z5 = false;
                        while (true) {
                            AppSortWrapper appSortWrapper3 = this.this$0.getAppSortList().get(i4);
                            int i5 = i4 - 1;
                            AppSortWrapper appSortWrapper4 = this.this$0.getAppSortList().get(i5);
                            if (appSortWrapper4.getViewType() == 4) {
                                appSortWrapper3.getData().f = false;
                                appSortWrapper3.getData().h = this.this$0.supportMore;
                                appSortWrapper3.setViewType(1);
                                z5 = true;
                            }
                            if (appSortWrapper4.getViewType() == 3) {
                                appSortWrapper3.getData().f = false;
                                appSortWrapper3.getData().h = false;
                                appSortWrapper3.setViewType(1);
                            }
                            Collections.swap(this.this$0.getAppSortList(), i4, i5);
                            if (i4 == i3) {
                                break;
                            } else {
                                i4--;
                            }
                        }
                        z3 = z5;
                    }
                }
                if (recyclerView.isComputingLayout()) {
                    return;
                }
                if (z3) {
                    this.this$0.notifyDataSetChanged();
                } else {
                    this.this$0.notifyItemMoved(from, to);
                }
            }
        };
        this.itemTouchHelperCallback = new ItemDragHelperCallBack(r2) { // from class: com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortAdapter$itemTouchHelperCallback$1
            @Override // androidx.recyclerview.widget.l.e
            public boolean canDropOver(RecyclerView recyclerView, RecyclerView.d0 current, RecyclerView.d0 target) {
                int i;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(current, "current");
                Intrinsics.checkNotNullParameter(target, "target");
                int bindingAdapterPosition = current.getBindingAdapterPosition();
                int bindingAdapterPosition2 = target.getBindingAdapterPosition();
                AppSortWrapper appSortWrapper = this.this$0.getAppSortList().get(bindingAdapterPosition);
                AppSortWrapper appSortWrapper2 = this.this$0.getAppSortList().get(bindingAdapterPosition2);
                boolean z3 = (appSortWrapper.isAlwaysShown() && (appSortWrapper2.getViewType() == 2 || appSortWrapper2.getViewType() == 4)) ? false : true;
                if (!appSortWrapper.getData().g && this.this$0.supportMore) {
                    Iterator<AppSortWrapper> it = this.this$0.getAppSortList().iterator();
                    int i2 = 0;
                    while (true) {
                        i = -1;
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (it.next().getViewType() == 3) {
                            break;
                        }
                        i2++;
                    }
                    Iterator<AppSortWrapper> it2 = this.this$0.getAppSortList().iterator();
                    int i3 = 0;
                    while (it2.hasNext()) {
                        if (it2.next().getViewType() == 4) {
                            i = i3;
                            break;
                        }
                        i3++;
                    }
                    if (i2 <= bindingAdapterPosition2 && bindingAdapterPosition2 < i) {
                        return false;
                    }
                }
                return z3;
            }

            @Override // androidx.recyclerview.widget.l.e
            public void clearView(RecyclerView recyclerView, RecyclerView.d0 viewHolder) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                super.clearView(recyclerView, viewHolder);
                Logger.i(this.this$0.TAG, "clearView: " + recyclerView.isComputingLayout());
                if (!recyclerView.isComputingLayout()) {
                    this.this$0.notifyDataSetChanged();
                }
                if (this.this$0.listHasChanged()) {
                    Logger.i(this.this$0.TAG, "listHasChanged");
                    this.this$0.dragListener.onOrderChange();
                }
            }

            @Override // androidx.recyclerview.widget.l.e
            public boolean isLongPressDragEnabled() {
                return false;
            }

            @Override // androidx.recyclerview.widget.l.e
            public void onSelectedChanged(RecyclerView.d0 viewHolder, int actionState) {
                super.onSelectedChanged(viewHolder, actionState);
                this.this$0.setDragging(actionState != 0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean listHasChanged() {
        if (this.appSortList.size() != this.originList.size()) {
            return true;
        }
        int size = this.appSortList.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.areEqual(this.appSortList.get(i).getData().c, this.originList.get(i).getData().c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$0(AppSortAdapter this$0, RecyclerView.d0 holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        this$0.dragListener.startDragItem(holder);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(AppSortWrapper appSorWrapper, AppSortAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(appSorWrapper, "$appSorWrapper");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (appSorWrapper.isAlwaysShown()) {
            return;
        }
        this$0.onItemIconClicked(appSorWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(AppSortAdapter this$0, AppSortWrapper appSorWrapper, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appSorWrapper, "$appSorWrapper");
        this$0.onItemIconClicked(appSorWrapper);
    }

    private final void onItemIconClicked(AppSortWrapper appSortWrapper) {
        int i;
        int iIndexOf = this.appSortList.indexOf(appSortWrapper);
        if (iIndexOf < 0) {
            return;
        }
        boolean z = appSortWrapper.getData().f;
        Iterator<AppSortWrapper> it = this.appSortList.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (it.next().getViewType() == 4) {
                break;
            } else {
                i2++;
            }
        }
        Iterator<AppSortWrapper> it2 = this.appSortList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            if (it2.next().getViewType() == 3) {
                i = i3;
                break;
            }
            i3++;
        }
        if (i2 < 0) {
            return;
        }
        if (z) {
            if (iIndexOf > i2) {
                AppSortWrapper appSortWrapper2 = this.appSortList.get(iIndexOf);
                appSortWrapper2.getData().f = false;
                appSortWrapper2.getData().h = true;
                appSortWrapper2.setViewType(1);
                this.appSortList.remove(iIndexOf);
                if (!appSortWrapper2.getData().g && this.supportMore) {
                    i2 = i;
                }
                this.appSortList.add(i2, appSortWrapper2);
                notifyDataSetChanged();
            }
        } else if (iIndexOf < i2) {
            AppSortWrapper appSortWrapper3 = this.appSortList.get(iIndexOf);
            appSortWrapper3.getData().f = true;
            appSortWrapper3.getData().h = false;
            appSortWrapper3.setViewType(2);
            this.appSortList.add(i2 + 1, appSortWrapper3);
            this.appSortList.remove(iIndexOf);
            notifyDataSetChanged();
        }
        if (listHasChanged()) {
            Logger.i(this.TAG, "listHasChanged");
            this.dragListener.onOrderChange();
        }
    }

    @NotNull
    public final List<AppSortWrapper> getAppSortList() {
        return this.appSortList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.appSortList.size();
    }

    @NotNull
    public final ItemDragHelperCallBack getItemTouchHelperCallback() {
        return this.itemTouchHelperCallback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.appSortList.get(position).getViewType();
    }

    @NotNull
    public final List<AppSortWrapper> getOriginList() {
        return this.originList;
    }

    /* JADX INFO: renamed from: isDragging, reason: from getter */
    public final boolean getIsDragging() {
        return this.isDragging;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"ClickableViewAccessibility"})
    public void onBindViewHolder(@NotNull final RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final AppSortWrapper appSortWrapper = this.appSortList.get(position);
        if (holder instanceof AppSortItemViewHolder) {
            Logger.i("onBindViewHolder id: " + appSortWrapper.getData().c + " name: " + appSortWrapper.getData().d, new Object[0]);
            AppSortItemViewHolder appSortItemViewHolder = (AppSortItemViewHolder) holder;
            appSortItemViewHolder.getName().setText(appSortWrapper.getData().d);
            appSortItemViewHolder.getSwipe().setOnLongClickListener(new View.OnLongClickListener() { // from class: ch1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return AppSortAdapter.onBindViewHolder$lambda$0(this.f5325a, holder, view);
                }
            });
            ViewExtKt.setVisible(appSortItemViewHolder.getIcon(), this.supportHide);
            appSortItemViewHolder.getIcon().setImageResource(appSortWrapper.getIconRes());
            appSortItemViewHolder.getIcon().setOnClickListener(new View.OnClickListener() { // from class: dh1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppSortAdapter.onBindViewHolder$lambda$1(appSortWrapper, this, view);
                }
            });
            appSortItemViewHolder.getIcon().setContentDescription(ResourceExtKt.getString(wzi.f0));
            if (this.supportHide) {
                return;
            }
            appSortItemViewHolder.getName().setPadding(0, 0, 0, 0);
            return;
        }
        if (holder instanceof AppSortHideItemViewHolder) {
            AppSortHideItemViewHolder appSortHideItemViewHolder = (AppSortHideItemViewHolder) holder;
            appSortHideItemViewHolder.getName().setText(appSortWrapper.getData().d);
            appSortHideItemViewHolder.getIcon().setImageResource(appSortWrapper.getIconRes());
            appSortHideItemViewHolder.getIcon().setOnClickListener(new View.OnClickListener() { // from class: eh1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppSortAdapter.onBindViewHolder$lambda$2(this.f16630a, appSortWrapper, view);
                }
            });
            appSortHideItemViewHolder.getIcon().setContentDescription(ResourceExtKt.getString(wzi.e0));
            return;
        }
        AppSortLabelItemViewHolder appSortLabelItemViewHolder = (AppSortLabelItemViewHolder) holder;
        if (appSortWrapper.getViewType() != 3) {
            appSortLabelItemViewHolder.getLabel().setText(ResourceExtKt.getString(wzi.a1));
            ViewExtKt.setVisible(appSortLabelItemViewHolder.getTipInfo(), !(appSortLabelItemViewHolder.getBindingAdapterPosition() + 1 < this.appSortList.size()));
            ((TextView) appSortLabelItemViewHolder.getTipInfo().findViewById(zqi.e1)).setText(wzi.W9);
            return;
        }
        appSortLabelItemViewHolder.getLabel().setText(ResourceExtKt.getString(wzi.X));
        Iterator<AppSortWrapper> it = this.appSortList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getViewType() == 4) {
                break;
            } else {
                i++;
            }
        }
        ViewExtKt.setVisible(appSortLabelItemViewHolder.getTipInfo(), !(position + 1 < i));
        ((TextView) appSortLabelItemViewHolder.getTipInfo().findViewById(zqi.e1)).setText(wzi.Y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(eui.T2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new AppSortItemViewHolder(viewInflate);
        }
        if (viewType != 2) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(eui.U2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new AppSortLabelItemViewHolder(viewInflate2);
        }
        View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(eui.Q2, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
        return new AppSortHideItemViewHolder(viewInflate3);
    }

    public final void setAppSortList(@NotNull List<AppSortWrapper> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.appSortList = value;
        Logger.i("appSortList load finish: size " + value.size(), new Object[0]);
        notifyDataSetChanged();
    }

    public final void setDragging(boolean z) {
        this.isDragging = z;
    }

    public final void setOriginList(@NotNull List<AppSortWrapper> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.originList = list;
    }
}
