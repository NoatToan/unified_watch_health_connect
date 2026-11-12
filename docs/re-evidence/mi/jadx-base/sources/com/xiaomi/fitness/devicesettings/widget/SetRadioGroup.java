package com.xiaomi.fitness.devicesettings.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.el6;
import defpackage.eui;
import defpackage.sk5;
import defpackage.uk6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ,2\u00020\u0001:\u0004-./,B!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010'\u001a\u00020\f¢\u0006\u0004\b(\u0010)B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b(\u0010*B\u0019\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010+J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u00020\u00042\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u00060\u001bR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R*\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup;", "Landroid/widget/LinearLayout;", "", "title", "", "setTitle", "(Ljava/lang/String;)V", "", "Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup$RadioItem;", "items", "setRadioItems", "(Ljava/util/List;)V", "", "itemId", "setSelected", "(I)V", "Lkotlin/Function2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCheckedChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "", "enabled", "setEnabled", "(Z)V", "Lel6;", "mViewBinding", "Lel6;", "Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup$ItemAdapter;", "mAdapter", "Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup$ItemAdapter;", "", "mDataList", "Ljava/util/List;", "mItemSelectedListener", "Lkotlin/jvm/functions/Function2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "ItemAdapter", "RadioItemHolder", "RadioItem", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSetRadioGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetRadioGroup.kt\ncom/xiaomi/fitness/devicesettings/widget/SetRadioGroup\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1872#2,3:154\n*S KotlinDebug\n*F\n+ 1 SetRadioGroup.kt\ncom/xiaomi/fitness/devicesettings/widget/SetRadioGroup\n*L\n74#1:154,3\n*E\n"})
public final class SetRadioGroup extends LinearLayout {

    @NotNull
    public static final String TAG = "SetRadioGroup";

    @NotNull
    private final ItemAdapter mAdapter;

    @NotNull
    private final List<RadioItem> mDataList;

    @Nullable
    private Function2<? super RadioItem, ? super Integer, Unit> mItemSelectedListener;

    @NotNull
    private final el6 mViewBinding;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup$ItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup$RadioItemHolder;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSetRadioGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetRadioGroup.kt\ncom/xiaomi/fitness/devicesettings/widget/SetRadioGroup$ItemAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1872#2,3:154\n*S KotlinDebug\n*F\n+ 1 SetRadioGroup.kt\ncom/xiaomi/fitness/devicesettings/widget/SetRadioGroup$ItemAdapter\n*L\n105#1:154,3\n*E\n"})
    public final class ItemAdapter extends RecyclerView.Adapter<RadioItemHolder> {
        public ItemAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onBindViewHolder$lambda$1(SetRadioGroup this$0, int i, ItemAdapter this$1, RadioItem radioItem, int i2) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(radioItem, "<unused var>");
            int i3 = 0;
            for (Object obj : this$0.mDataList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                ((RadioItem) obj).setSelected(i3 == i2);
                i3 = i4;
            }
            Logger.d("ItemAdapter setSelected " + i + " " + this$0.mDataList, new Object[0]);
            this$1.notifyDataSetChanged();
            Function2 function2 = this$0.mItemSelectedListener;
            if (function2 != null) {
                function2.invoke(this$0.mDataList.get(i2), Integer.valueOf(i2));
            }
            return Unit.INSTANCE;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return SetRadioGroup.this.mDataList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RadioItemHolder holder, final int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.setEnabled(SetRadioGroup.this.isEnabled());
            RadioItem radioItem = (RadioItem) SetRadioGroup.this.mDataList.get(position);
            final SetRadioGroup setRadioGroup = SetRadioGroup.this;
            holder.bindItem(radioItem, new Function2() { // from class: com.xiaomi.fitness.devicesettings.widget.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SetRadioGroup.ItemAdapter.onBindViewHolder$lambda$1(setRadioGroup, position, this, (SetRadioGroup.RadioItem) obj, ((Integer) obj2).intValue());
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RadioItemHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            uk6 uk6Var = (uk6) sk5.j(LayoutInflater.from(parent.getContext()), eui.e1, parent, false);
            Intrinsics.checkNotNull(uk6Var);
            return new RadioItemHolder(uk6Var);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup$RadioItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup$RadioItem;", "item", "Lkotlin/Function2;", "", "", "onRadioBtnClickListener", "bindItem", "(Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup$RadioItem;Lkotlin/jvm/functions/Function2;)V", "", "enabled", "setEnabled", "(Z)V", "Luk6;", "mViewBinding", "Luk6;", "<init>", "(Luk6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class RadioItemHolder extends RecyclerView.d0 {

        @NotNull
        private final uk6 mViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RadioItemHolder(@NotNull uk6 mViewBinding) {
            super(mViewBinding.getRoot());
            Intrinsics.checkNotNullParameter(mViewBinding, "mViewBinding");
            this.mViewBinding = mViewBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindItem$lambda$0(Function2 onRadioBtnClickListener, RadioItem item, RadioItemHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(onRadioBtnClickListener, "$onRadioBtnClickListener");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            onRadioBtnClickListener.invoke(item, Integer.valueOf(this$0.getAdapterPosition()));
        }

        public final void bindItem(@NotNull final RadioItem item, @NotNull final Function2<? super RadioItem, ? super Integer, Unit> onRadioBtnClickListener) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(onRadioBtnClickListener, "onRadioBtnClickListener");
            Logger.d("RadioItemHolder bindItem " + item, new Object[0]);
            this.mViewBinding.C.setText(item.getTitle());
            this.mViewBinding.A.setText(item.getDescription());
            this.mViewBinding.A.setVisibility(TextUtils.isEmpty(item.getDescription()) ? 8 : 0);
            this.mViewBinding.B.setSelected(this.mViewBinding.B.isEnabled() ? item.isSelected() : false);
            this.mViewBinding.B.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.devicesettings.widget.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SetRadioGroup.RadioItemHolder.bindItem$lambda$0(onRadioBtnClickListener, item, this, view);
                }
            });
        }

        public final void setEnabled(boolean enabled) {
            this.mViewBinding.C.setEnabled(enabled);
            this.mViewBinding.A.setEnabled(enabled);
            this.mViewBinding.B.setEnabled(enabled);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetRadioGroup(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDataList = new ArrayList();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        setOrientation(1);
        setMinimumHeight((int) TypedValue.applyDimension(1, 53.33f, getResources().getDisplayMetrics()));
        el6 el6Var = (el6) sk5.j(layoutInflaterFrom, eui.x1, this, true);
        this.mViewBinding = el6Var;
        ItemAdapter itemAdapter = new ItemAdapter();
        this.mAdapter = itemAdapter;
        el6Var.A.setAdapter(itemAdapter);
        el6Var.A.setLayoutManager(new LinearLayoutManager(context));
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.mViewBinding.B.setEnabled(enabled);
        this.mAdapter.notifyDataSetChanged();
    }

    public final void setOnCheckedChangeListener(@Nullable Function2<? super RadioItem, ? super Integer, Unit> listener) {
        this.mItemSelectedListener = listener;
    }

    public final void setRadioItems(@NotNull List<RadioItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Logger.d("SetRadioGroup setRadioItems " + items, new Object[0]);
        this.mDataList.clear();
        this.mDataList.addAll(items);
        this.mAdapter.notifyDataSetChanged();
    }

    public final void setSelected(int itemId) {
        int i = 0;
        for (Object obj : this.mDataList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            RadioItem radioItem = (RadioItem) obj;
            radioItem.setSelected(radioItem.getId() == itemId);
            i = i2;
        }
        Logger.i(TAG, "setSelected " + itemId);
        this.mAdapter.notifyDataSetChanged();
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.mViewBinding.B.setText(title);
        this.mViewBinding.B.setVisibility(TextUtils.isEmpty(title) ? 8 : 0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/widget/SetRadioGroup$RadioItem;", "", "id", "", "title", "", "description", "isSelected", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "getId", "()I", "getTitle", "()Ljava/lang/String;", "getDescription", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RadioItem {

        @NotNull
        private final String description;
        private final int id;
        private boolean isSelected;

        @NotNull
        private final String title;

        public RadioItem(int i, @NotNull String title, @NotNull String description, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.id = i;
            this.title = title;
            this.description = description;
            this.isSelected = z;
        }

        public static /* synthetic */ RadioItem copy$default(RadioItem radioItem, int i, String str, String str2, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = radioItem.id;
            }
            if ((i2 & 2) != 0) {
                str = radioItem.title;
            }
            if ((i2 & 4) != 0) {
                str2 = radioItem.description;
            }
            if ((i2 & 8) != 0) {
                z = radioItem.isSelected;
            }
            return radioItem.copy(i, str, str2, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public final RadioItem copy(int id, @NotNull String title, @NotNull String description, boolean isSelected) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            return new RadioItem(id, title, description, isSelected);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RadioItem)) {
                return false;
            }
            RadioItem radioItem = (RadioItem) other;
            return this.id == radioItem.id && Intrinsics.areEqual(this.title, radioItem.title) && Intrinsics.areEqual(this.description, radioItem.description) && this.isSelected == radioItem.isSelected;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public final void setSelected(boolean z) {
            this.isSelected = z;
        }

        @NotNull
        public String toString() {
            return "RadioItem(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", isSelected=" + this.isSelected + ")";
        }

        public /* synthetic */ RadioItem(int i, String str, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, (i2 & 8) != 0 ? false : z);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SetRadioGroup(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SetRadioGroup(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
