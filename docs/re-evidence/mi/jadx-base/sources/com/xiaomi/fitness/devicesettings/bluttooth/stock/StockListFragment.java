package com.xiaomi.fitness.devicesettings.bluttooth.stock;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.stock.StockListFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.stock.StockListViewModel;
import com.xiaomi.fitness.sync.export.db.StockInfoEntity;
import defpackage.cji;
import defpackage.eui;
import defpackage.jni;
import defpackage.qm6;
import defpackage.wzi;
import defpackage.zgo;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005789:;B\u0007¢\u0006\u0004\b6\u0010\u000bJ\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R&\u0010)\u001a\u00060(R\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001c¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListViewModel;", "Lqm6;", "", "Lzgo;", "stockSymbolList", "", "updateData", "(Ljava/util/List;)V", "updateAddBtn", "()V", "initActionBar", "", "isListChanged", "()Z", "resetListItemIndex", "saveList", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "setListener", "", "widgetCount", "()I", "adapterPosition", "delete", "(I)V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListFragment$Item;", "mDataList", "Ljava/util/ArrayList;", "getMDataList", "()Ljava/util/ArrayList;", "setMDataList", "(Ljava/util/ArrayList;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListFragment$StockListAdapter;", "mStockListAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListFragment$StockListAdapter;", "getMStockListAdapter", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListFragment$StockListAdapter;", "setMStockListAdapter", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListFragment$StockListAdapter;)V", "Landroidx/recyclerview/widget/l;", "mTouchHelper", "Landroidx/recyclerview/widget/l;", "mShowWidgetFullToast", "Z", "getLayoutId", "layoutId", "<init>", "Companion", "StockListAdapter", "StockListHolder", "LabelViewHolder", "Item", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class StockListFragment extends BaseLoadableBindingFragment<StockListViewModel, qm6> {

    @NotNull
    public static final String TAG = "StockListFragment";
    public static final int TYPE_DISABLE_LABEL = 1;
    public static final int TYPE_ENABLE_LABEL = 0;
    public static final int TYPE_STOCK = 2;
    private boolean mShowWidgetFullToast;

    @NotNull
    private ArrayList<Item> mDataList = new ArrayList<>();

    @NotNull
    private StockListAdapter mStockListAdapter = new StockListAdapter();

    @NotNull
    private final l mTouchHelper = new l(new l.h() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.stock.StockListFragment$mTouchHelper$1
        {
            super(3, 0);
        }

        @Override // androidx.recyclerview.widget.l.e
        public void clearView(RecyclerView recyclerView, RecyclerView.d0 viewHolder) {
            FragmentActivity mActivity;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            boolean zIsListChanged = this.this$0.isListChanged();
            if (this.this$0.mShowWidgetFullToast && viewHolder.itemView.getTranslationY() < -1.0f && !zIsListChanged && (mActivity = this.this$0.getMActivity()) != null) {
                ToastExtKt.toastShort(mActivity, wzi.e8);
            }
            super.clearView(recyclerView, viewHolder);
            if (viewHolder instanceof StockListFragment.StockListHolder) {
                ((StockListFragment.StockListHolder) viewHolder).itemView.setBackgroundColor(this.this$0.getResources().getColor(cji.common_transparent));
            }
            if (zIsListChanged) {
                this.this$0.saveList();
            }
        }

        @Override // androidx.recyclerview.widget.l.e
        public boolean isLongPressDragEnabled() {
            return false;
        }

        @Override // androidx.recyclerview.widget.l.e
        public boolean onMove(RecyclerView recyclerView, RecyclerView.d0 viewHolder, RecyclerView.d0 target) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            Intrinsics.checkNotNullParameter(target, "target");
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = target.getAdapterPosition();
            if (adapterPosition2 == 0) {
                return true;
            }
            int iWidgetCount = this.this$0.widgetCount();
            if (iWidgetCount >= 2 && adapterPosition > 3 && adapterPosition2 <= 3) {
                this.this$0.mShowWidgetFullToast = true;
                return true;
            }
            this.this$0.mShowWidgetFullToast = false;
            if (adapterPosition >= adapterPosition2) {
                int i = adapterPosition2 + 1;
                if (i <= adapterPosition) {
                    int i2 = adapterPosition;
                    while (true) {
                        StockListFragment.Item item = this.this$0.getMDataList().get(i2);
                        Intrinsics.checkNotNullExpressionValue(item, "get(...)");
                        StockListFragment.Item item2 = item;
                        int i3 = i2 - 1;
                        StockListFragment.Item item3 = this.this$0.getMDataList().get(i3);
                        Intrinsics.checkNotNullExpressionValue(item3, "get(...)");
                        StockListFragment.Item item4 = item3;
                        int targetIndex = item2.getTargetIndex();
                        item2.setTargetIndex(item4.getTargetIndex());
                        item4.setTargetIndex(targetIndex);
                        Collections.swap(this.this$0.getMDataList(), i2, i3);
                        if (i2 == i) {
                            break;
                        }
                        i2--;
                    }
                }
            } else {
                int i4 = adapterPosition;
                while (i4 < adapterPosition2) {
                    StockListFragment.Item item5 = this.this$0.getMDataList().get(i4);
                    Intrinsics.checkNotNullExpressionValue(item5, "get(...)");
                    StockListFragment.Item item6 = item5;
                    int i5 = i4 + 1;
                    StockListFragment.Item item7 = this.this$0.getMDataList().get(i5);
                    Intrinsics.checkNotNullExpressionValue(item7, "get(...)");
                    StockListFragment.Item item8 = item7;
                    int targetIndex2 = item6.getTargetIndex();
                    item6.setTargetIndex(item8.getTargetIndex());
                    item8.setTargetIndex(targetIndex2);
                    Collections.swap(this.this$0.getMDataList(), i4, i5);
                    i4 = i5;
                }
            }
            int iWidgetCount2 = this.this$0.widgetCount();
            if (iWidgetCount <= 0 && iWidgetCount2 > 0) {
                this.this$0.getMStockListAdapter().notifyDataSetChanged();
            } else if (iWidgetCount <= 0 || iWidgetCount2 > 0) {
                this.this$0.getMStockListAdapter().notifyItemMoved(adapterPosition, adapterPosition2);
            } else {
                this.this$0.getMStockListAdapter().notifyDataSetChanged();
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.l.e
        public void onSelectedChanged(RecyclerView.d0 viewHolder, int actionState) {
            super.onSelectedChanged(viewHolder, actionState);
        }

        @Override // androidx.recyclerview.widget.l.e
        public void onSwiped(RecyclerView.d0 viewHolder, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListFragment$LabelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "labelTV", "Landroid/widget/TextView;", "getLabelTV", "()Landroid/widget/TextView;", "setLabelTV", "(Landroid/widget/TextView;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class LabelViewHolder extends RecyclerView.d0 {

        @NotNull
        private TextView labelTV;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LabelViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.labelTV = (TextView) itemView.findViewById(zqi.g4);
        }

        @NotNull
        public final TextView getLabelTV() {
            return this.labelTV;
        }

        public final void setLabelTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.labelTV = textView;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListFragment$StockListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListFragment;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class StockListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
        public StockListAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return StockListFragment.this.getMDataList().size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return StockListFragment.this.getMDataList().get(position).getType();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.d0 viewHolder, int position) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            if (getItemViewType(position) == 0 || getItemViewType(position) == 1) {
                return;
            }
            ((StockListHolder) viewHolder).bindView();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup viewGroup, int viewType) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            if (viewType == 0) {
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(eui.b3, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                LabelViewHolder labelViewHolder = new LabelViewHolder(viewInflate);
                labelViewHolder.getLabelTV().setText(wzi.g8);
                return labelViewHolder;
            }
            if (viewType != 1) {
                StockListFragment stockListFragment = StockListFragment.this;
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(eui.a3, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
                return new StockListHolder(stockListFragment, viewInflate2);
            }
            View viewInflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(eui.b3, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
            LabelViewHolder labelViewHolder2 = new LabelViewHolder(viewInflate3);
            labelViewHolder2.getLabelTV().setText(wzi.f8);
            return labelViewHolder2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ StockListViewModel access$getMViewModel(StockListFragment stockListFragment) {
        return (StockListViewModel) stockListFragment.getMViewModel();
    }

    private final void initActionBar() {
        setTitle(wzi.b8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isListChanged() {
        Iterator<Item> it = this.mDataList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Item next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Item item = next;
            if (item.getTargetIndex() != item.getIndex()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(StockListFragment this$0, StockListViewModel.StockSymbolResult stockSymbolResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (stockSymbolResult.isSuc()) {
            this$0.updateData(stockSymbolResult.getStockSymbolList());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(StockListFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StockListAdapter stockListAdapter = this$0.mStockListAdapter;
        Intrinsics.checkNotNull(num);
        stockListAdapter.notifyItemChanged(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$2(StockListFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mDataList.size() <= 3) {
            this$0.mDataList.clear();
            ((qm6) this$0.getMBinding()).G.setVisibility(8);
            ((qm6) this$0.getMBinding()).D.setVisibility(0);
        } else {
            int iWidgetCount = this$0.widgetCount();
            ArrayList<Item> arrayList = this$0.mDataList;
            Intrinsics.checkNotNull(num);
            arrayList.remove(num.intValue());
            int iWidgetCount2 = this$0.widgetCount();
            if (iWidgetCount > 0 && iWidgetCount2 <= 0) {
                this$0.mStockListAdapter.notifyItemChanged(0);
            }
            this$0.mStockListAdapter.notifyItemRemoved(num.intValue());
        }
        this$0.updateAddBtn();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetListItemIndex() {
        int size = this.mDataList.size();
        for (int i = 0; i < size; i++) {
            Item item = this.mDataList.get(i);
            Intrinsics.checkNotNullExpressionValue(item, "get(...)");
            item.setdex(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void saveList() {
        ArrayList arrayList = new ArrayList();
        Iterator<Item> it = this.mDataList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        int i = 0;
        boolean z = true;
        while (it.hasNext()) {
            Item next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Item item = next;
            if (item.getType() == 1) {
                z = false;
            } else if (item.getStockSymbol() != null) {
                zgo zgoVar = new zgo();
                zgo stockSymbol = item.getStockSymbol();
                Intrinsics.checkNotNull(stockSymbol);
                zgoVar.c = stockSymbol.c;
                zgoVar.d = z;
                zgoVar.e = i;
                arrayList.add(zgoVar);
                i++;
            }
        }
        ((StockListViewModel) getMViewModel()).saveList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(StockListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, StockSearchFragment.class, new Bundle());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateAddBtn() {
        ((qm6) getMBinding()).A.setEnabled(this.mDataList.size() < 22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateData(List<zgo> stockSymbolList) {
        int i;
        this.mDataList.clear();
        if (stockSymbolList == null || !(!stockSymbolList.isEmpty())) {
            ((qm6) getMBinding()).G.setVisibility(8);
            ((qm6) getMBinding()).D.setVisibility(0);
        } else {
            final Function2 function2 = new Function2() { // from class: jgo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(StockListFragment.updateData$lambda$4((zgo) obj, (zgo) obj2));
                }
            };
            Collections.sort(stockSymbolList, new Comparator() { // from class: kgo
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return StockListFragment.updateData$lambda$5(function2, obj, obj2);
                }
            });
            this.mDataList.add(new Item(0));
            if (stockSymbolList.get(0).d) {
                this.mDataList.add(new Item(2, stockSymbolList.get(0)));
                if (stockSymbolList.size() <= 1 || !stockSymbolList.get(1).d) {
                    i = 1;
                } else {
                    this.mDataList.add(new Item(2, stockSymbolList.get(1)));
                    i = 2;
                }
            } else {
                i = 0;
            }
            this.mDataList.add(new Item(1));
            int size = stockSymbolList.size();
            while (i < size) {
                this.mDataList.add(new Item(2, stockSymbolList.get(i)));
                i++;
            }
            ((qm6) getMBinding()).G.setVisibility(0);
            ((qm6) getMBinding()).D.setVisibility(8);
            this.mStockListAdapter.notifyDataSetChanged();
        }
        updateAddBtn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateData$lambda$4(zgo zgoVar, zgo zgoVar2) {
        return zgoVar.e - zgoVar2.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateData$lambda$5(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void delete(int adapterPosition) {
        if (adapterPosition < 0 || adapterPosition >= this.mDataList.size()) {
            return;
        }
        Item item = this.mDataList.get(adapterPosition);
        Intrinsics.checkNotNullExpressionValue(item, "get(...)");
        Item item2 = item;
        if (item2.getStockSymbol() != null) {
            zgo stockSymbol = item2.getStockSymbol();
            Intrinsics.checkNotNull(stockSymbol);
            Logger.i(TAG, "delete position = " + adapterPosition + "  symbol = " + stockSymbol.c);
            StockListViewModel stockListViewModel = (StockListViewModel) getMViewModel();
            zgo stockSymbol2 = item2.getStockSymbol();
            Intrinsics.checkNotNull(stockSymbol2);
            stockListViewModel.delete(adapterPosition, stockSymbol2.c);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.T1;
    }

    @NotNull
    public final ArrayList<Item> getMDataList() {
        return this.mDataList;
    }

    @NotNull
    public final StockListAdapter getMStockListAdapter() {
        return this.mStockListAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        Logger.i(StockListViewModel.TAG, "showLoading()");
        ((StockListViewModel) getMViewModel()).loadStockList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initActionBar();
        ((qm6) getMBinding()).F.setLayoutManager(new LinearLayoutManager(getMActivity()));
        ((qm6) getMBinding()).F.setAdapter(this.mStockListAdapter);
        this.mTouchHelper.d(((qm6) getMBinding()).F);
        ((qm6) getMBinding()).A.setEnabled(false);
        setNeedAwaysToRefresh(true);
        ((StockListViewModel) getMViewModel()).getStockSymbolList().observe(getViewLifecycleOwner(), new StockListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fgo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockListFragment.onViewCreated$lambda$0(this.f17770a, (StockListViewModel.StockSymbolResult) obj);
            }
        }));
        ((StockListViewModel) getMViewModel()).getUpdateItemPosition().observe(getViewLifecycleOwner(), new StockListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ggo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockListFragment.onViewCreated$lambda$1(this.f18965a, (Integer) obj);
            }
        }));
        ((StockListViewModel) getMViewModel()).getDeleteItemPosition().observe(getViewLifecycleOwner(), new StockListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hgo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockListFragment.onViewCreated$lambda$2(this.f20055a, (Integer) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((qm6) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: igo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StockListFragment.setListener$lambda$3(this.f21120a, view);
            }
        });
    }

    public final void setMDataList(@NotNull ArrayList<Item> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mDataList = arrayList;
    }

    public final void setMStockListAdapter(@NotNull StockListAdapter stockListAdapter) {
        Intrinsics.checkNotNullParameter(stockListAdapter, "<set-?>");
        this.mStockListAdapter = stockListAdapter;
    }

    public final int widgetCount() {
        int i = 0;
        if (this.mDataList.size() <= 1) {
            return 0;
        }
        if (this.mDataList.get(1).getType() == 2) {
            i = 1;
        } else if (this.mDataList.get(1).getType() == 1) {
            return 0;
        }
        return (this.mDataList.size() <= 2 || this.mDataList.get(2).getType() != 2) ? i : i + 1;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\u0006R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListFragment$Item;", "", "", "index", "", "setdex", "(I)V", "type", "I", "getType", "()I", "setType", "Lzgo;", "stockSymbol", "Lzgo;", "getStockSymbol", "()Lzgo;", "setStockSymbol", "(Lzgo;)V", "getIndex", "setIndex", "targetIndex", "getTargetIndex", "setTargetIndex", "<init>", "(ILzgo;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Item {
        private int index;

        @Nullable
        private zgo stockSymbol;
        private int targetIndex;
        private int type;

        public Item(int i) {
            this.type = i;
        }

        public final int getIndex() {
            return this.index;
        }

        @Nullable
        public final zgo getStockSymbol() {
            return this.stockSymbol;
        }

        public final int getTargetIndex() {
            return this.targetIndex;
        }

        public final int getType() {
            return this.type;
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        public final void setStockSymbol(@Nullable zgo zgoVar) {
            this.stockSymbol = zgoVar;
        }

        public final void setTargetIndex(int i) {
            this.targetIndex = i;
        }

        public final void setType(int i) {
            this.type = i;
        }

        public final void setdex(int index) {
            this.index = index;
            this.targetIndex = index;
        }

        public Item(int i, @Nullable zgo zgoVar) {
            this.type = i;
            this.stockSymbol = zgoVar;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\tJ\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001c\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\"\u0010\"\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\"\u0010%\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R\"\u0010(\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\r\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R\"\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\r\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010.¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListFragment$StockListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/sync/export/db/StockInfoEntity;", "stockInfo", "", "bindView", "(Lcom/xiaomi/fitness/sync/export/db/StockInfoEntity;)V", "", "symbol", "(Ljava/lang/String;)V", "()V", "Landroid/widget/ImageView;", "delete", "Landroid/widget/ImageView;", "getDelete", "()Landroid/widget/ImageView;", "setDelete", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "nameTV", "Landroid/widget/TextView;", "getNameTV", "()Landroid/widget/TextView;", "setNameTV", "(Landroid/widget/TextView;)V", "marketTV", "getMarketTV", "setMarketTV", "symbolTV", "getSymbolTV", "setSymbolTV", "priceTV", "getPriceTV", "setPriceTV", "increaseTV", "getIncreaseTV", "setIncreaseTV", "increasePercentTV", "getIncreasePercentTV", "setIncreasePercentTV", "arrow", "getArrow", "setArrow", "swipe", "getSwipe", "setSwipe", "Ljava/lang/String;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListFragment;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class StockListHolder extends RecyclerView.d0 {

        @NotNull
        private ImageView arrow;

        @NotNull
        private ImageView delete;

        @NotNull
        private TextView increasePercentTV;

        @NotNull
        private TextView increaseTV;

        @NotNull
        private TextView marketTV;

        @NotNull
        private TextView nameTV;

        @NotNull
        private TextView priceTV;

        @NotNull
        private ImageView swipe;

        @Nullable
        private String symbol;

        @NotNull
        private TextView symbolTV;
        final /* synthetic */ StockListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StockListHolder(@NotNull final StockListFragment stockListFragment, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = stockListFragment;
            this.delete = (ImageView) itemView.findViewById(zqi.Z0);
            this.nameTV = (TextView) itemView.findViewById(zqi.B5);
            this.marketTV = (TextView) itemView.findViewById(zqi.S4);
            this.symbolTV = (TextView) itemView.findViewById(zqi.e9);
            this.priceTV = (TextView) itemView.findViewById(zqi.G6);
            this.increaseTV = (TextView) itemView.findViewById(zqi.T3);
            this.increasePercentTV = (TextView) itemView.findViewById(zqi.U3);
            this.arrow = (ImageView) itemView.findViewById(zqi.D);
            this.swipe = (ImageView) itemView.findViewById(zqi.Z8);
            this.delete.setOnClickListener(new View.OnClickListener() { // from class: lgo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StockListFragment.StockListHolder._init_$lambda$0(stockListFragment, this, view);
                }
            });
            this.swipe.setOnTouchListener(new View.OnTouchListener() { // from class: mgo
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return StockListFragment.StockListHolder._init_$lambda$1(stockListFragment, this, view, motionEvent);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(StockListFragment this$0, StockListHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.delete(this$1.getBindingAdapterPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean _init_$lambda$1(StockListFragment this$0, StockListHolder this$1, View view, MotionEvent event) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() == 0) {
                this$0.mShowWidgetFullToast = false;
                this$0.mTouchHelper.x(this$1);
                this$0.resetListItemIndex();
            }
            return false;
        }

        public final void bindView() {
            Item item = this.this$0.getMDataList().get(getBindingAdapterPosition());
            Intrinsics.checkNotNullExpressionValue(item, "get(...)");
            Item item2 = item;
            if (item2.getStockSymbol() != null) {
                zgo stockSymbol = item2.getStockSymbol();
                Intrinsics.checkNotNull(stockSymbol);
                this.symbol = stockSymbol.c;
                StockListViewModel stockListViewModelAccess$getMViewModel = StockListFragment.access$getMViewModel(this.this$0);
                String str = this.symbol;
                Intrinsics.checkNotNull(str);
                StockInfoEntity stockInfo = stockListViewModelAccess$getMViewModel.getStockInfo(str);
                if (stockInfo != null) {
                    bindView(stockInfo);
                    return;
                }
                bindView(this.symbol);
                StockListViewModel stockListViewModelAccess$getMViewModel2 = StockListFragment.access$getMViewModel(this.this$0);
                int bindingAdapterPosition = getBindingAdapterPosition();
                String str2 = this.symbol;
                Intrinsics.checkNotNull(str2);
                stockListViewModelAccess$getMViewModel2.requestStockInfo(bindingAdapterPosition, str2);
            }
        }

        @NotNull
        public final ImageView getArrow() {
            return this.arrow;
        }

        @NotNull
        public final ImageView getDelete() {
            return this.delete;
        }

        @NotNull
        public final TextView getIncreasePercentTV() {
            return this.increasePercentTV;
        }

        @NotNull
        public final TextView getIncreaseTV() {
            return this.increaseTV;
        }

        @NotNull
        public final TextView getMarketTV() {
            return this.marketTV;
        }

        @NotNull
        public final TextView getNameTV() {
            return this.nameTV;
        }

        @NotNull
        public final TextView getPriceTV() {
            return this.priceTV;
        }

        @NotNull
        public final ImageView getSwipe() {
            return this.swipe;
        }

        @NotNull
        public final TextView getSymbolTV() {
            return this.symbolTV;
        }

        public final void setArrow(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.arrow = imageView;
        }

        public final void setDelete(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.delete = imageView;
        }

        public final void setIncreasePercentTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.increasePercentTV = textView;
        }

        public final void setIncreaseTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.increaseTV = textView;
        }

        public final void setMarketTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.marketTV = textView;
        }

        public final void setNameTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.nameTV = textView;
        }

        public final void setPriceTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.priceTV = textView;
        }

        public final void setSwipe(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.swipe = imageView;
        }

        public final void setSymbolTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.symbolTV = textView;
        }

        private final void bindView(StockInfoEntity stockInfo) {
            if (Intrinsics.areEqual(this.symbol, stockInfo.getSymbol())) {
                this.nameTV.setText(stockInfo.getNameCN());
                this.marketTV.setText(stockInfo.getMarket());
                this.marketTV.setVisibility(0);
                this.symbolTV.setText(stockInfo.getSymbol());
                TextView textView = this.priceTV;
                Locale locale = Locale.US;
                textView.setText(String.format(locale, "%.2f", Float.valueOf(stockInfo.getLatestPrice())));
                boolean z = stockInfo.getLatestPrice() >= stockInfo.getPreClose();
                float latestPrice = stockInfo.getLatestPrice() - stockInfo.getPreClose();
                float preClose = (100 * latestPrice) / stockInfo.getPreClose();
                TextView textView2 = this.increaseTV;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(Math.abs(latestPrice))}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView2.setText(str);
                this.increaseTV.setTextColor(this.this$0.getResources().getColor(z ? cji.f5404b : cji.B));
                TextView textView3 = this.increasePercentTV;
                String str2 = String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(Math.abs(preClose))}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                textView3.setText(str2 + "%");
                this.increasePercentTV.setTextColor(this.this$0.getResources().getColor(z ? cji.C : cji.B));
                this.arrow.setImageResource(z ? jni.S0 : jni.R0);
                this.arrow.setVisibility(0);
            }
        }

        private final void bindView(String symbol) {
            this.nameTV.setText("");
            this.marketTV.setText("");
            this.marketTV.setVisibility(4);
            this.symbolTV.setText(symbol);
            this.priceTV.setText("");
            this.increaseTV.setText("");
            this.increasePercentTV.setText("");
            this.arrow.setVisibility(4);
        }
    }
}
