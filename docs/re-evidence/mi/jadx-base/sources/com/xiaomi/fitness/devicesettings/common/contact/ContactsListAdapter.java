package com.xiaomi.fitness.devicesettings.common.contact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.devicesettings.common.contact.ContactsListAdapter;
import defpackage.eui;
import defpackage.zqi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002'(B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0019H\u0016J\u0014\u0010\"\u001a\u00020\u001f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070#J\u000e\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListAdapter$TopContactViewHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListAdapter$OnItemClickListener;", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListAdapter$OnItemClickListener;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "getListener", "()Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListAdapter$OnItemClickListener;", "setListener", "(Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListAdapter$OnItemClickListener;)V", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "updateDataList", "", "getPositionForSection", "section", "", "TopContactViewHolder", "OnItemClickListener", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContactsListAdapter extends RecyclerView.Adapter<TopContactViewHolder> {

    @NotNull
    private Context context;

    @NotNull
    private List<ContactBean> dataList;

    @Nullable
    private OnItemClickListener listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListAdapter$OnItemClickListener;", "", "onItemSelect", "", "contactBean", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemSelect(@NotNull ContactBean contactBean);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/contact/ContactsListAdapter$TopContactViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;", "contactBean", "", "bindData", "(Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;)V", "Landroid/widget/TextView;", "nameView", "Landroid/widget/TextView;", "getNameView", "()Landroid/widget/TextView;", "setNameView", "(Landroid/widget/TextView;)V", "numberView", "getNumberView", "setNumberView", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class TopContactViewHolder extends RecyclerView.d0 {

        @Nullable
        private TextView nameView;

        @Nullable
        private TextView numberView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TopContactViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.nameView = (TextView) itemView.findViewById(zqi.C5);
            this.numberView = (TextView) itemView.findViewById(zqi.i6);
        }

        public final void bindData(@NotNull ContactBean contactBean) {
            Intrinsics.checkNotNullParameter(contactBean, "contactBean");
            TextView textView = this.nameView;
            if (textView != null) {
                textView.setText(contactBean.getName());
            }
            TextView textView2 = this.numberView;
            if (textView2 != null) {
                textView2.setText(contactBean.getPhone());
            }
        }

        @Nullable
        public final TextView getNameView() {
            return this.nameView;
        }

        @Nullable
        public final TextView getNumberView() {
            return this.numberView;
        }

        public final void setNameView(@Nullable TextView textView) {
            this.nameView = textView;
        }

        public final void setNumberView(@Nullable TextView textView) {
            this.numberView = textView;
        }
    }

    public /* synthetic */ ContactsListAdapter(Context context, List list, OnItemClickListener onItemClickListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list, (i & 4) != 0 ? null : onItemClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(ContactsListAdapter this$0, ContactBean contactBean, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(contactBean, "$contactBean");
        OnItemClickListener onItemClickListener = this$0.listener;
        if (onItemClickListener != null) {
            onItemClickListener.onItemSelect(contactBean);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<ContactBean> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @Nullable
    public final OnItemClickListener getListener() {
        return this.listener;
    }

    public final int getPositionForSection(char section) {
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (this.dataList.get(i).getPinyin().charAt(0) == section) {
                return i;
            }
        }
        return -1;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDataList(@NotNull List<ContactBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void setListener(@Nullable OnItemClickListener onItemClickListener) {
        this.listener = onItemClickListener;
    }

    public final void updateDataList(@NotNull List<ContactBean> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList.clear();
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public ContactsListAdapter(@NotNull Context context, @NotNull List<ContactBean> dataList, @Nullable OnItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.context = context;
        this.dataList = dataList;
        this.listener = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull TopContactViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final ContactBean contactBean = this.dataList.get(position);
        holder.bindData(contactBean);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: tg4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactsListAdapter.onBindViewHolder$lambda$0(this.f34669a, contactBean, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TopContactViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(eui.Y0, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new TopContactViewHolder(viewInflate);
    }
}
