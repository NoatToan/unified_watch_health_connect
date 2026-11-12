package com.xiaomi.fitness.relative.ui.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter;
import com.xiaomi.fitness.relative.ui.util.RelativeCareUtil;
import defpackage.nuf;
import defpackage.qri;
import defpackage.t0j;
import defpackage.xui;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002<=B\u0017\u0012\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b:\u0010;J%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007Jµ\u0001\u0010\u0013\u001a\u00020\f2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020)0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020)0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\"\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010'R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\"\u00102\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00100R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00100¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "disabledItems", "getEditableItemList", "(Ljava/util/List;)Ljava/util/List;", "allSelectedItems", "alreadySharedList", "requestedButNotSharedList", "Lkotlin/Function0;", "", "noEditableItemsCallback", "checkAllCheckboxCallback", "noItemSelectedCallback", "atLeastOnItemSelectedCallback", "allEditableItemsSelectedCallback", "notAllEditableItemsSelectedCallback", "updateSelectedItemList", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "selectAll", "()V", "unselectAll", "getAllSelectedHomeDataTypeList", "()Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "allDisplayItems", "Ljava/util/List;", "", "", "mSelectedItemTypeMap", "Ljava/util/Map;", "mDisabledItemTypeMap", "mToastTypeMap", "mEditableItemList", "mNoItemSelectedCallback", "Lkotlin/jvm/functions/Function0;", "mAtLeastOnItemSelectedCallback", "selectAllBtnControlledByDirectClick", "Z", "getSelectAllBtnControlledByDirectClick", "()Z", "setSelectAllBtnControlledByDirectClick", "(Z)V", "mAllEditableItemsSelectedCallback", "mNotAllEditableItemsSelectedCallback", "<init>", "(Ljava/util/List;)V", "Companion", "DataItemViewHolder", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nShareDataListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareDataListAdapter.kt\ncom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1863#2,2:209\n1863#2,2:211\n1863#2,2:213\n1863#2,2:215\n1863#2,2:217\n1863#2,2:219\n1863#2,2:221\n1863#2,2:223\n1863#2,2:225\n*S KotlinDebug\n*F\n+ 1 ShareDataListAdapter.kt\ncom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter\n*L\n49#1:209,2\n85#1:211,2\n88#1:213,2\n91#1:215,2\n94#1:217,2\n103#1:219,2\n111#1:221,2\n118#1:223,2\n126#1:225,2\n*E\n"})
public final class ShareDataListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "ShareDataListAdapter";

    @NotNull
    private final List<HomeDataType> allDisplayItems;

    @NotNull
    private Function0<Unit> mAllEditableItemsSelectedCallback;

    @NotNull
    private Function0<Unit> mAtLeastOnItemSelectedCallback;

    @NotNull
    private Map<HomeDataType, Boolean> mDisabledItemTypeMap;

    @Nullable
    private List<? extends HomeDataType> mEditableItemList;

    @NotNull
    private Function0<Unit> mNoItemSelectedCallback;

    @NotNull
    private Function0<Unit> mNotAllEditableItemsSelectedCallback;

    @NotNull
    private Map<HomeDataType, Boolean> mSelectedItemTypeMap;

    @NotNull
    private Map<HomeDataType, Integer> mToastTypeMap;
    private boolean selectAllBtnControlledByDirectClick;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter$DataItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lkotlin/Pair;", "", "nameIconResIdPair", "", "bindData", "(Lkotlin/Pair;)V", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "itemName", "Landroid/widget/TextView;", "Landroid/widget/CheckBox;", "checkbox", "Landroid/widget/CheckBox;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter;Landroid/view/View;)V", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nShareDataListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareDataListAdapter.kt\ncom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter$DataItemViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,208:1\n54#2,3:209\n24#2:212\n57#2,6:213\n63#2,2:220\n57#3:219\n*S KotlinDebug\n*F\n+ 1 ShareDataListAdapter.kt\ncom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter$DataItemViewHolder\n*L\n179#1:209,3\n179#1:212\n179#1:213,6\n179#1:220,2\n179#1:219\n*E\n"})
    public final class DataItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final CheckBox checkbox;

        @NotNull
        private final ImageView icon;

        @NotNull
        private final TextView itemName;
        final /* synthetic */ ShareDataListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataItemViewHolder(@NotNull ShareDataListAdapter shareDataListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = shareDataListAdapter;
            View viewFindViewById = view.findViewById(qri.u);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(qri.E);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.itemName = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(qri.l);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.checkbox = (CheckBox) viewFindViewById3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$0(ShareDataListAdapter this$0, HomeDataType homeDataType, CompoundButton compoundButton, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(homeDataType, "$homeDataType");
            this$0.mSelectedItemTypeMap.put(homeDataType, Boolean.valueOf(z));
            Logger.d(ShareDataListAdapter.TAG, "bindData mSelectedItemTypeMap[homeDataType]=" + z);
            Logger.d(ShareDataListAdapter.TAG, "bindData mSelectedItemTypeMap=" + this$0.mSelectedItemTypeMap);
            List<HomeDataType> allSelectedHomeDataTypeList = this$0.getAllSelectedHomeDataTypeList();
            (allSelectedHomeDataTypeList.isEmpty() ? this$0.mNoItemSelectedCallback : this$0.mAtLeastOnItemSelectedCallback).invoke();
            this$0.setSelectAllBtnControlledByDirectClick(false);
            if (RelativeCareUtil.INSTANCE.hasSameAuthData(allSelectedHomeDataTypeList, this$0.mEditableItemList)) {
                this$0.mAllEditableItemsSelectedCallback.invoke();
            } else {
                this$0.mNotAllEditableItemsSelectedCallback.invoke();
            }
        }

        public final void bindData(@NotNull Pair<Integer, Integer> nameIconResIdPair) {
            Intrinsics.checkNotNullParameter(nameIconResIdPair, "nameIconResIdPair");
            ImageView imageView = this.icon;
            Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(nameIconResIdPair.getSecond()).target(imageView).build());
            this.itemName.setText(nameIconResIdPair.getFirst().intValue());
            final HomeDataType homeDataType = (HomeDataType) this.this$0.allDisplayItems.get(getBindingAdapterPosition());
            CheckBox checkBox = this.checkbox;
            Boolean bool = (Boolean) this.this$0.mSelectedItemTypeMap.get(homeDataType);
            checkBox.setChecked(bool != null ? bool.booleanValue() : false);
            Boolean bool2 = (Boolean) this.this$0.mDisabledItemTypeMap.get(homeDataType);
            this.checkbox.setEnabled(!(bool2 != null ? bool2.booleanValue() : false));
            if (this.checkbox.isChecked()) {
                if (this.checkbox.isEnabled()) {
                    this.checkbox.setAlpha(1.0f);
                } else {
                    this.checkbox.setAlpha(0.3f);
                }
            }
            CheckBox checkBox2 = this.checkbox;
            final ShareDataListAdapter shareDataListAdapter = this.this$0;
            checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: n5m
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ShareDataListAdapter.DataItemViewHolder.bindData$lambda$0(shareDataListAdapter, homeDataType, compoundButton, z);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShareDataListAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final List<HomeDataType> getEditableItemList(List<? extends HomeDataType> disabledItems) {
        if (disabledItems == null) {
            return this.allDisplayItems;
        }
        ArrayList arrayList = new ArrayList();
        for (HomeDataType homeDataType : this.allDisplayItems) {
            if (!disabledItems.contains(homeDataType)) {
                arrayList.add(homeDataType);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$19(ShareDataListAdapter this$0, HomeDataType homeDataType, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(homeDataType, "$homeDataType");
        if (Intrinsics.areEqual(this$0.mDisabledItemTypeMap.get(homeDataType), Boolean.TRUE)) {
            Logger.d(TAG, "setOnCheckedChangeListener mToastTypeMap[homeDataType]=" + this$0.mToastTypeMap.get(homeDataType));
            Integer num = this$0.mToastTypeMap.get(homeDataType);
            if (num != null && num.intValue() == 1) {
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), t0j.w);
            } else if (num != null && num.intValue() == 2) {
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), t0j.x);
            }
        }
    }

    @NotNull
    public final List<HomeDataType> getAllSelectedHomeDataTypeList() {
        ArrayList arrayList = new ArrayList();
        for (HomeDataType homeDataType : this.allDisplayItems) {
            if (Intrinsics.areEqual(this.mSelectedItemTypeMap.get(homeDataType), Boolean.TRUE)) {
                arrayList.add(homeDataType);
            }
        }
        Logger.d(TAG, "getAllSelectedHomeDataTypeList list=" + arrayList);
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.allDisplayItems.size();
    }

    public final boolean getSelectAllBtnControlledByDirectClick() {
        return this.selectAllBtnControlledByDirectClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setIsRecyclable(false);
        final HomeDataType homeDataType = this.allDisplayItems.get(position);
        Pair<Integer, Integer> healthItemNameIconResIdPair = HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getHealthItemNameIconResIdPair(homeDataType);
        if (holder instanceof DataItemViewHolder) {
            ((DataItemViewHolder) holder).bindData(healthItemNameIconResIdPair);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: d5m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShareDataListAdapter.onBindViewHolder$lambda$19(this.f15113a, homeDataType, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(xui.p, parent, false);
        nuf.f(viewInflate);
        Intrinsics.checkNotNull(viewInflate);
        return new DataItemViewHolder(this, viewInflate);
    }

    public final void selectAll() {
        List<? extends HomeDataType> list = this.mEditableItemList;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.mSelectedItemTypeMap.put((HomeDataType) it.next(), Boolean.TRUE);
            }
        }
        notifyDataSetChanged();
    }

    public final void setSelectAllBtnControlledByDirectClick(boolean z) {
        this.selectAllBtnControlledByDirectClick = z;
    }

    public final void unselectAll() {
        List<? extends HomeDataType> list = this.mEditableItemList;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.mSelectedItemTypeMap.put((HomeDataType) it.next(), Boolean.FALSE);
            }
        }
        notifyDataSetChanged();
    }

    public final void updateSelectedItemList(@Nullable List<? extends HomeDataType> allSelectedItems, @Nullable List<? extends HomeDataType> disabledItems, @Nullable List<? extends HomeDataType> alreadySharedList, @Nullable List<? extends HomeDataType> requestedButNotSharedList, @NotNull Function0<Unit> noEditableItemsCallback, @NotNull Function0<Unit> checkAllCheckboxCallback, @NotNull Function0<Unit> noItemSelectedCallback, @NotNull Function0<Unit> atLeastOnItemSelectedCallback, @NotNull Function0<Unit> allEditableItemsSelectedCallback, @NotNull Function0<Unit> notAllEditableItemsSelectedCallback) {
        Intrinsics.checkNotNullParameter(noEditableItemsCallback, "noEditableItemsCallback");
        Intrinsics.checkNotNullParameter(checkAllCheckboxCallback, "checkAllCheckboxCallback");
        Intrinsics.checkNotNullParameter(noItemSelectedCallback, "noItemSelectedCallback");
        Intrinsics.checkNotNullParameter(atLeastOnItemSelectedCallback, "atLeastOnItemSelectedCallback");
        Intrinsics.checkNotNullParameter(allEditableItemsSelectedCallback, "allEditableItemsSelectedCallback");
        Intrinsics.checkNotNullParameter(notAllEditableItemsSelectedCallback, "notAllEditableItemsSelectedCallback");
        Logger.d(TAG, "updateSelectedItemList allSelectedItems=" + allSelectedItems);
        Logger.d(TAG, "updateSelectedItemList disabledItems=" + disabledItems);
        Logger.d(TAG, "updateSelectedItemList alreadySharedList=" + alreadySharedList);
        Logger.d(TAG, "updateSelectedItemList requestedButNotSharedList=" + requestedButNotSharedList);
        this.mNoItemSelectedCallback = noItemSelectedCallback;
        this.mAtLeastOnItemSelectedCallback = atLeastOnItemSelectedCallback;
        this.mAllEditableItemsSelectedCallback = allEditableItemsSelectedCallback;
        this.mNotAllEditableItemsSelectedCallback = notAllEditableItemsSelectedCallback;
        this.mEditableItemList = getEditableItemList(disabledItems);
        if (Intrinsics.areEqual(allSelectedItems, this.allDisplayItems)) {
            checkAllCheckboxCallback.invoke();
        }
        if (disabledItems != null && disabledItems.size() == this.allDisplayItems.size()) {
            noEditableItemsCallback.invoke();
        }
        if (allSelectedItems != null) {
            Iterator<T> it = allSelectedItems.iterator();
            while (it.hasNext()) {
                this.mSelectedItemTypeMap.put((HomeDataType) it.next(), Boolean.TRUE);
            }
        }
        if (disabledItems != null) {
            Iterator<T> it2 = disabledItems.iterator();
            while (it2.hasNext()) {
                this.mDisabledItemTypeMap.put((HomeDataType) it2.next(), Boolean.TRUE);
            }
        }
        if (alreadySharedList != null) {
            Iterator<T> it3 = alreadySharedList.iterator();
            while (it3.hasNext()) {
                this.mToastTypeMap.put((HomeDataType) it3.next(), 1);
            }
        }
        if (requestedButNotSharedList != null) {
            Iterator<T> it4 = requestedButNotSharedList.iterator();
            while (it4.hasNext()) {
                this.mToastTypeMap.put((HomeDataType) it4.next(), 2);
            }
        }
        notifyDataSetChanged();
    }

    public /* synthetic */ ShareDataListAdapter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RelativeCareUtil.INSTANCE.constructRelativeCareShareableDataTypeList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShareDataListAdapter(@NotNull List<? extends HomeDataType> allDisplayItems) {
        Intrinsics.checkNotNullParameter(allDisplayItems, "allDisplayItems");
        this.allDisplayItems = allDisplayItems;
        this.mSelectedItemTypeMap = new LinkedHashMap();
        this.mDisabledItemTypeMap = new LinkedHashMap();
        this.mToastTypeMap = new LinkedHashMap();
        this.mNoItemSelectedCallback = new Function0() { // from class: j5m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        this.mAtLeastOnItemSelectedCallback = new Function0() { // from class: k5m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        this.selectAllBtnControlledByDirectClick = true;
        this.mAllEditableItemsSelectedCallback = new Function0() { // from class: l5m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        this.mNotAllEditableItemsSelectedCallback = new Function0() { // from class: m5m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        for (HomeDataType homeDataType : allDisplayItems) {
            Map<HomeDataType, Boolean> map = this.mSelectedItemTypeMap;
            Boolean bool = Boolean.FALSE;
            map.put(homeDataType, bool);
            this.mDisabledItemTypeMap.put(homeDataType, bool);
            this.mToastTypeMap.put(homeDataType, 0);
        }
    }
}
