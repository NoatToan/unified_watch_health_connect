package com.xiaomi.fitness.devicesettings.common.eventremind;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderAdapter;
import com.xiaomi.fitness.settingitem.settingitem.EventReMinderItem;
import defpackage.dih;
import defpackage.eui;
import defpackage.qyi;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000267B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020 J\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0019J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0016J\u0018\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020*H\u0016J\"\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u00103\u001a\u00020\"2\u0006\u00104\u001a\u0002012\u0006\u00105\u001a\u00020\u0019H\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0019@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderAdapter$EventReminderHolder;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "selectItemList", "", "Lcom/xiaomi/fitness/settingitem/settingitem/EventReMinderItem;", "getSelectItemList", "()Ljava/util/List;", "minderItems", "value", "Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderModel;", "minderModel", "getMinderModel", "()Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderModel;", "setMinderModel", "(Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderModel;)V", "", "editMode", "getEditMode", "()Z", "setEditMode", "(Z)V", "mSelectListener", "Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderAdapter$OnItemSelectListener;", "setOnItemSelectListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSelectAll", "select", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "setCheckedNoEvent", "checkBox", "Landroid/widget/CompoundButton;", "checked", "onCheckedChanged", "buttonView", "isChecked", "OnItemSelectListener", "EventReminderHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EventMinderAdapter extends RecyclerView.Adapter<EventReminderHolder> implements CompoundButton.OnCheckedChangeListener {
    private boolean editMode;

    @NotNull
    private Context mContext;

    @Nullable
    private OnItemSelectListener mSelectListener;

    @Nullable
    private List<EventReMinderItem> minderItems;

    @Nullable
    private EventMinderModel minderModel;

    @NotNull
    private final List<EventReMinderItem> selectItemList;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderAdapter$EventReminderHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "labelTV", "Landroid/widget/TextView;", "getLabelTV", "()Landroid/widget/TextView;", "contentTV", "getContentTV", "desTV", "getDesTV", "Landroid/widget/CheckBox;", "checkBox", "Landroid/widget/CheckBox;", "getCheckBox", "()Landroid/widget/CheckBox;", "Landroid/view/View;", "itemClView", "Landroid/view/View;", "getItemClView", "()Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class EventReminderHolder extends RecyclerView.d0 {

        @NotNull
        private final CheckBox checkBox;

        @NotNull
        private final TextView contentTV;

        @NotNull
        private final TextView desTV;

        @NotNull
        private final View itemClView;

        @NotNull
        private final TextView labelTV;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventReminderHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(zqi.X2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.labelTV = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(zqi.T2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.contentTV = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(zqi.U2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.desTV = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(zqi.S2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.checkBox = (CheckBox) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(zqi.W2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.itemClView = viewFindViewById5;
        }

        @NotNull
        public final CheckBox getCheckBox() {
            return this.checkBox;
        }

        @NotNull
        public final TextView getContentTV() {
            return this.contentTV;
        }

        @NotNull
        public final TextView getDesTV() {
            return this.desTV;
        }

        @NotNull
        public final View getItemClView() {
            return this.itemClView;
        }

        @NotNull
        public final TextView getLabelTV() {
            return this.labelTV;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/eventremind/EventMinderAdapter$OnItemSelectListener;", "", "onItemSelect", "", "mindItemList", "", "Lcom/xiaomi/fitness/settingitem/settingitem/EventReMinderItem;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemSelectListener {
        void onItemSelect(@NotNull List<EventReMinderItem> mindItemList);
    }

    public EventMinderAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.selectItemList = new ArrayList();
        this.minderModel = new EventMinderModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(EventMinderAdapter this$0, EventReMinderItem eventReMinderItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.editMode) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_param1", eventReMinderItem);
        dih.a().f(this$0.mContext, new FragmentParams.b().e(EditEventMinderFragment.class).c(bundle).a(true).b(), false);
    }

    private final void setCheckedNoEvent(CompoundButton checkBox, boolean checked, CompoundButton.OnCheckedChangeListener listener) {
        checkBox.setOnCheckedChangeListener(null);
        checkBox.setChecked(checked);
        checkBox.setOnCheckedChangeListener(listener);
    }

    public final boolean getEditMode() {
        return this.editMode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        List<EventReMinderItem> list = this.minderItems;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @Nullable
    public final EventMinderModel getMinderModel() {
        return this.minderModel;
    }

    @NotNull
    public final List<EventReMinderItem> getSelectItemList() {
        return this.selectItemList;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(@NotNull CompoundButton buttonView, boolean isChecked) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        Object tag = buttonView.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.settingitem.settingitem.EventReMinderItem");
        EventReMinderItem eventReMinderItem = (EventReMinderItem) tag;
        if (isChecked) {
            this.selectItemList.add(eventReMinderItem);
        } else {
            this.selectItemList.remove(eventReMinderItem);
        }
        OnItemSelectListener onItemSelectListener = this.mSelectListener;
        if (onItemSelectListener != null) {
            onItemSelectListener.onItemSelect(this.selectItemList);
        }
    }

    public final void setEditMode(boolean z) {
        this.editMode = z;
        this.selectItemList.clear();
        notifyDataSetChanged();
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMinderModel(@Nullable EventMinderModel eventMinderModel) {
        this.minderModel = eventMinderModel;
        this.minderItems = eventMinderModel != null ? eventMinderModel.getEventMinders() : null;
        notifyDataSetChanged();
    }

    public final void setOnItemSelectListener(@NotNull OnItemSelectListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mSelectListener = listener;
    }

    public final void setSelectAll(boolean select) {
        this.selectItemList.clear();
        if (select) {
            List<EventReMinderItem> list = this.selectItemList;
            List<EventReMinderItem> list2 = this.minderItems;
            Intrinsics.checkNotNull(list2);
            list.addAll(list2);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull EventReminderHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<EventReMinderItem> list = this.minderItems;
        final EventReMinderItem eventReMinderItem = list != null ? list.get(position) : null;
        holder.getItemClView().setOnClickListener(new View.OnClickListener() { // from class: vd8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EventMinderAdapter.onBindViewHolder$lambda$0(this.f36767a, eventReMinderItem, view);
            }
        });
        if (this.editMode) {
            holder.getCheckBox().setVisibility(0);
            holder.getCheckBox().setTag(eventReMinderItem);
            if (CollectionsKt___CollectionsKt.contains(this.selectItemList, eventReMinderItem)) {
                setCheckedNoEvent(holder.getCheckBox(), true, this);
            } else {
                setCheckedNoEvent(holder.getCheckBox(), false, this);
            }
        } else {
            holder.getCheckBox().setVisibility(8);
        }
        TextView contentTV = holder.getContentTV();
        Intrinsics.checkNotNull(eventReMinderItem);
        contentTV.setText(eventReMinderItem.getTitle());
        TextView desTV = holder.getDesTV();
        EventMinderModel eventMinderModel = this.minderModel;
        Intrinsics.checkNotNull(eventMinderModel);
        desTV.setText(eventMinderModel.getItemDes(this.mContext, eventReMinderItem));
        EventMinderModel eventMinderModel2 = this.minderModel;
        Intrinsics.checkNotNull(eventMinderModel2);
        if (position < eventMinderModel2.getTypeIndex(1)) {
            EventMinderModel eventMinderModel3 = this.minderModel;
            Intrinsics.checkNotNull(eventMinderModel3);
            if (eventMinderModel3.getTypeCount(0) == 0) {
                return;
            }
            EventMinderModel eventMinderModel4 = this.minderModel;
            Intrinsics.checkNotNull(eventMinderModel4);
            if (position != eventMinderModel4.getTypeIndex(0)) {
                holder.getLabelTV().setVisibility(8);
                return;
            }
            Resources resources = this.mContext.getResources();
            int i = qyi.c;
            EventMinderModel eventMinderModel5 = this.minderModel;
            Intrinsics.checkNotNull(eventMinderModel5);
            int typeCount = eventMinderModel5.getTypeCount(0);
            EventMinderModel eventMinderModel6 = this.minderModel;
            Intrinsics.checkNotNull(eventMinderModel6);
            String quantityString = resources.getQuantityString(i, typeCount, Integer.valueOf(eventMinderModel6.getTypeCount(0)));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            holder.getLabelTV().setText(this.mContext.getResources().getString(wzi.L6, quantityString));
            holder.getLabelTV().setVisibility(0);
            return;
        }
        EventMinderModel eventMinderModel7 = this.minderModel;
        Intrinsics.checkNotNull(eventMinderModel7);
        if (position < eventMinderModel7.getTypeIndex(2)) {
            EventMinderModel eventMinderModel8 = this.minderModel;
            Intrinsics.checkNotNull(eventMinderModel8);
            if (eventMinderModel8.getTypeCount(1) == 0) {
                return;
            }
            EventMinderModel eventMinderModel9 = this.minderModel;
            Intrinsics.checkNotNull(eventMinderModel9);
            if (position != eventMinderModel9.getTypeIndex(1)) {
                holder.getLabelTV().setVisibility(8);
                return;
            }
            Resources resources2 = this.mContext.getResources();
            int i2 = qyi.c;
            EventMinderModel eventMinderModel10 = this.minderModel;
            Intrinsics.checkNotNull(eventMinderModel10);
            int typeCount2 = eventMinderModel10.getTypeCount(1);
            EventMinderModel eventMinderModel11 = this.minderModel;
            Intrinsics.checkNotNull(eventMinderModel11);
            String quantityString2 = resources2.getQuantityString(i2, typeCount2, Integer.valueOf(eventMinderModel11.getTypeCount(1)));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            holder.getLabelTV().setText(this.mContext.getResources().getString(wzi.M6, quantityString2));
            holder.getLabelTV().setVisibility(0);
            return;
        }
        EventMinderModel eventMinderModel12 = this.minderModel;
        Intrinsics.checkNotNull(eventMinderModel12);
        if (position < eventMinderModel12.getTypeIndex(-1)) {
            EventMinderModel eventMinderModel13 = this.minderModel;
            Intrinsics.checkNotNull(eventMinderModel13);
            if (eventMinderModel13.getTypeCount(2) == 0) {
                return;
            }
            EventMinderModel eventMinderModel14 = this.minderModel;
            Intrinsics.checkNotNull(eventMinderModel14);
            if (position != eventMinderModel14.getTypeIndex(2)) {
                holder.getLabelTV().setVisibility(8);
                return;
            }
            Resources resources3 = this.mContext.getResources();
            int i3 = qyi.c;
            EventMinderModel eventMinderModel15 = this.minderModel;
            Intrinsics.checkNotNull(eventMinderModel15);
            int typeCount3 = eventMinderModel15.getTypeCount(2);
            EventMinderModel eventMinderModel16 = this.minderModel;
            Intrinsics.checkNotNull(eventMinderModel16);
            String quantityString3 = resources3.getQuantityString(i3, typeCount3, Integer.valueOf(eventMinderModel16.getTypeCount(2)));
            Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
            holder.getLabelTV().setText(this.mContext.getResources().getString(wzi.F6, quantityString3));
            holder.getLabelTV().setVisibility(0);
            return;
        }
        EventMinderModel eventMinderModel17 = this.minderModel;
        Intrinsics.checkNotNull(eventMinderModel17);
        if (eventMinderModel17.getTypeCount(-1) == 0) {
            return;
        }
        EventMinderModel eventMinderModel18 = this.minderModel;
        Intrinsics.checkNotNull(eventMinderModel18);
        if (position != eventMinderModel18.getTypeIndex(-1)) {
            holder.getLabelTV().setVisibility(8);
            return;
        }
        Resources resources4 = this.mContext.getResources();
        int i4 = qyi.c;
        EventMinderModel eventMinderModel19 = this.minderModel;
        Intrinsics.checkNotNull(eventMinderModel19);
        int typeCount4 = eventMinderModel19.getTypeCount(-1);
        EventMinderModel eventMinderModel20 = this.minderModel;
        Intrinsics.checkNotNull(eventMinderModel20);
        String quantityString4 = resources4.getQuantityString(i4, typeCount4, Integer.valueOf(eventMinderModel20.getTypeCount(-1)));
        Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
        holder.getLabelTV().setText(this.mContext.getResources().getString(wzi.H6, quantityString4));
        holder.getLabelTV().setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public EventReminderHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(eui.F, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new EventReminderHolder(viewInflate);
    }
}
