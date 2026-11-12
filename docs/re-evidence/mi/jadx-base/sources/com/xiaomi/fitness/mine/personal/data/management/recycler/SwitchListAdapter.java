package com.xiaomi.fitness.mine.personal.data.management.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt;
import com.xiaomi.fitness.mine.personal.data.management.data.model.Scope;
import com.xiaomi.fitness.mine.personal.data.management.recycler.SwitchListAdapter;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.lri;
import defpackage.rui;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003/01B\u0007¢\u0006\u0004\b.\u0010\u001eJ\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00140\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010\u001eR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020)0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/recycler/SwitchListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/SwitchListAdapter$OnItemsCheckCountListener;", "onItemsCheckCountListener", "", "setOnAllItemsCheckedListener", "(Lcom/xiaomi/fitness/mine/personal/data/management/recycler/SwitchListAdapter$OnItemsCheckCountListener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/Scope;", "scopeList", "updateScopeList", "(Ljava/util/List;)V", "Lkotlin/Pair;", "", "getGrantedAndRevokedScopeIdsPair", "()Lkotlin/Pair;", "switchAllOn", "()V", "switchAllOff", "mScopeList", "Ljava/util/List;", "selectedItemSize", "I", "mOnItemsCheckCountListener", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/SwitchListAdapter$OnItemsCheckCountListener;", "", "scopeIdPositionMap", "Ljava/util/Map;", "Lcom/xiaomi/fitness/widget/SwitchButtonSingleLineTextView;", "positionSwitchButtonTextViewMap", "", "allSwitchOn", "Z", "<init>", "Companion", "OnItemsCheckCountListener", "SwitchItemViewHolder", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSwitchListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchListAdapter.kt\ncom/xiaomi/fitness/mine/personal/data/management/recycler/SwitchListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1863#2,2:123\n1872#2,3:125\n1863#2,2:128\n1863#2,2:130\n*S KotlinDebug\n*F\n+ 1 SwitchListAdapter.kt\ncom/xiaomi/fitness/mine/personal/data/management/recycler/SwitchListAdapter\n*L\n59#1:123,2\n78#1:125,3\n90#1:128,2\n97#1:130,2\n*E\n"})
public final class SwitchListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "SwitchListAdapter";

    @Nullable
    private OnItemsCheckCountListener mOnItemsCheckCountListener;

    @Nullable
    private List<Scope> mScopeList;
    private int selectedItemSize;

    @NotNull
    private final Map<String, Integer> scopeIdPositionMap = new LinkedHashMap();

    @NotNull
    private final Map<Integer, SwitchButtonSingleLineTextView> positionSwitchButtonTextViewMap = new LinkedHashMap();
    private boolean allSwitchOn = true;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/recycler/SwitchListAdapter$OnItemsCheckCountListener;", "", "onAllItemsChecked", "", "onNotAllItemsChecked", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemsCheckCountListener {
        void onAllItemsChecked();

        void onNotAllItemsChecked();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/recycler/SwitchListAdapter$SwitchItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/Scope;", "scope", "", "bindData", "(Lcom/xiaomi/fitness/mine/personal/data/management/data/model/Scope;)V", "Lcom/xiaomi/fitness/widget/SwitchButtonSingleLineTextView;", "switchItemTv", "Lcom/xiaomi/fitness/widget/SwitchButtonSingleLineTextView;", "getSwitchItemTv", "()Lcom/xiaomi/fitness/widget/SwitchButtonSingleLineTextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/mine/personal/data/management/recycler/SwitchListAdapter;Landroid/view/View;)V", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SwitchItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final SwitchButtonSingleLineTextView switchItemTv;
        final /* synthetic */ SwitchListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SwitchItemViewHolder(@NotNull SwitchListAdapter switchListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = switchListAdapter;
            View viewFindViewById = itemView.findViewById(lri.Y0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.switchItemTv = (SwitchButtonSingleLineTextView) viewFindViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$0(SwitchListAdapter this$0, Scope scope, boolean z, ISwitchButton iSwitchButton) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(scope, "$scope");
            SwitchButtonSingleLineTextView switchButtonSingleLineTextView = (SwitchButtonSingleLineTextView) this$0.positionSwitchButtonTextViewMap.get((Integer) this$0.scopeIdPositionMap.get(scope.getScopeId()));
            if (switchButtonSingleLineTextView != null) {
                switchButtonSingleLineTextView.setSwitch(z);
            }
            if (z) {
                this$0.selectedItemSize++;
            } else {
                this$0.selectedItemSize--;
            }
            Logger.d(SwitchListAdapter.TAG, "setOnCheckedChangeCallback selectedItemSize=" + this$0.selectedItemSize);
            if (this$0.selectedItemSize == this$0.getCount()) {
                OnItemsCheckCountListener onItemsCheckCountListener = this$0.mOnItemsCheckCountListener;
                if (onItemsCheckCountListener != null) {
                    onItemsCheckCountListener.onAllItemsChecked();
                    return;
                }
                return;
            }
            OnItemsCheckCountListener onItemsCheckCountListener2 = this$0.mOnItemsCheckCountListener;
            if (onItemsCheckCountListener2 != null) {
                onItemsCheckCountListener2.onNotAllItemsChecked();
            }
        }

        public final void bindData(@NotNull final Scope scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            SwitchButtonSingleLineTextView switchButtonSingleLineTextView = this.switchItemTv;
            final SwitchListAdapter switchListAdapter = this.this$0;
            switchButtonSingleLineTextView.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: kro
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                    SwitchListAdapter.SwitchItemViewHolder.bindData$lambda$0(switchListAdapter, scope, z, iSwitchButton);
                }
            });
            this.switchItemTv.setSwitch(scope.getAuthStatus() == 1);
            this.switchItemTv.setTitle(PersonalDataManagementExtKt.convertToHealthDataTypeName(scope.getScopeId()));
        }

        @NotNull
        public final SwitchButtonSingleLineTextView getSwitchItemTv() {
            return this.switchItemTv;
        }
    }

    @NotNull
    public final Pair<List<String>, List<String>> getGrantedAndRevokedScopeIdsPair() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<Scope> list = this.mScopeList;
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Scope scope = (Scope) obj;
                SwitchButtonSingleLineTextView switchButtonSingleLineTextView = this.positionSwitchButtonTextViewMap.get(Integer.valueOf(i));
                if (switchButtonSingleLineTextView == null || switchButtonSingleLineTextView.getSwitch()) {
                    arrayList2.add(scope.getScopeId());
                } else {
                    arrayList.add(scope.getScopeId());
                }
                i = i2;
            }
        }
        return new Pair<>(arrayList2, arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        List<Scope> list = this.mScopeList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<Scope> list = this.mScopeList;
        if (list == null) {
            return;
        }
        Intrinsics.checkNotNull(list);
        Scope scope = list.get(position);
        SwitchItemViewHolder switchItemViewHolder = (SwitchItemViewHolder) holder;
        this.positionSwitchButtonTextViewMap.put(Integer.valueOf(position), switchItemViewHolder.getSwitchItemTv());
        this.scopeIdPositionMap.put(scope.getScopeId(), Integer.valueOf(position));
        switchItemViewHolder.bindData(scope);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(rui.v, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new SwitchItemViewHolder(this, viewInflate);
    }

    public final void setOnAllItemsCheckedListener(@Nullable OnItemsCheckCountListener onItemsCheckCountListener) {
        if (onItemsCheckCountListener != null) {
            this.mOnItemsCheckCountListener = onItemsCheckCountListener;
        }
    }

    public final void switchAllOff() {
        this.selectedItemSize = 0;
        Iterator<T> it = this.positionSwitchButtonTextViewMap.values().iterator();
        while (it.hasNext()) {
            ((SwitchButtonSingleLineTextView) it.next()).setSwitch(false);
        }
    }

    public final void switchAllOn() {
        this.selectedItemSize = getCount();
        Iterator<T> it = this.positionSwitchButtonTextViewMap.values().iterator();
        while (it.hasNext()) {
            ((SwitchButtonSingleLineTextView) it.next()).setSwitch(true);
        }
    }

    public final void updateScopeList(@Nullable List<Scope> scopeList) {
        if (scopeList == null) {
            return;
        }
        this.mScopeList = scopeList;
        for (Scope scope : scopeList) {
            boolean z = scope.getAuthStatus() == 1;
            if (z) {
                this.selectedItemSize++;
            } else {
                this.allSwitchOn = false;
            }
            SwitchButtonSingleLineTextView switchButtonSingleLineTextView = this.positionSwitchButtonTextViewMap.get(this.scopeIdPositionMap.get(scope.getScopeId()));
            if (switchButtonSingleLineTextView != null) {
                switchButtonSingleLineTextView.setSwitch(z);
            }
        }
        if (this.allSwitchOn) {
            OnItemsCheckCountListener onItemsCheckCountListener = this.mOnItemsCheckCountListener;
            if (onItemsCheckCountListener != null) {
                onItemsCheckCountListener.onAllItemsChecked();
            }
        } else {
            OnItemsCheckCountListener onItemsCheckCountListener2 = this.mOnItemsCheckCountListener;
            if (onItemsCheckCountListener2 != null) {
                onItemsCheckCountListener2.onNotAllItemsChecked();
            }
        }
        notifyDataSetChanged();
    }
}
