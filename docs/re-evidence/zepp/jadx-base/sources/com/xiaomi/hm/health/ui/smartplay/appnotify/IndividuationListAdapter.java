package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.notification.entity.ContactSettingItem;
import com.huami.devicex.R;
import com.huami.sleep.sleephome.vo.ShowActionItemInfo;
import com.xiaomi.hm.health.ui.smartplay.appnotify.IndividuationListAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&'B\u0015\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b%\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u001e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationListAdapter$IndividuationViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "getItemId", "", ShowActionItemInfo.EDIT, "", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "items", "update", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationListAdapter$IndividuationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setIndividuationListener", "a", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "b", "Z", "editing", "c", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationListAdapter$IndividuationListener;", "mListener", "<init>", "IndividuationListener", "IndividuationViewHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class IndividuationListAdapter extends RecyclerView.Adapter<IndividuationViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<ContactSettingItem> data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean editing;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private IndividuationListener mListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationListAdapter$IndividuationListener;", "", "", "isChecked", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "item", "", "onCheckedChangeListener", "onContactClickListener", "onVibrationClickListener", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface IndividuationListener {
        void onCheckedChangeListener(boolean isChecked, @NotNull ContactSettingItem item);

        void onContactClickListener(@NotNull ContactSettingItem item);

        void onVibrationClickListener(@NotNull ContactSettingItem item);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u001c\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationListAdapter$IndividuationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/CheckBox;", "a", "Landroid/widget/CheckBox;", "getRbContract", "()Landroid/widget/CheckBox;", "rbContract", "Landroid/view/View;", "b", "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "divider", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getTvContact", "()Landroid/widget/TextView;", "tvContact", GoogleApiAvailabilityLight.a, "getTvVibration", "tvVibration", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "getIvVibration", "()Landroid/widget/ImageView;", "ivVibration", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class IndividuationViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final CheckBox rbContract;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final View divider;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final TextView tvContact;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final TextView tvVibration;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final ImageView ivVibration;

        public IndividuationViewHolder(@NotNull View view) {
            super(view);
            CheckBox checkBox = (CheckBox) view.findViewById(R.id.cb_contact);
            this.rbContract = checkBox;
            this.divider = view.findViewById(R.id.divider);
            this.tvContact = (TextView) view.findViewById(R.id.tv_contact);
            this.tvVibration = (TextView) view.findViewById(R.id.tv_vibration);
            this.ivVibration = (ImageView) view.findViewById(R.id.iv_vibration);
            checkBox.setChecked(false);
        }

        @NotNull
        public final View getDivider() {
            return this.divider;
        }

        @NotNull
        public final ImageView getIvVibration() {
            return this.ivVibration;
        }

        @NotNull
        public final CheckBox getRbContract() {
            return this.rbContract;
        }

        @NotNull
        public final TextView getTvContact() {
            return this.tvContact;
        }

        @NotNull
        public final TextView getTvVibration() {
            return this.tvVibration;
        }
    }

    public IndividuationListAdapter(@NotNull List<ContactSettingItem> list) {
        this.data = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(IndividuationListAdapter individuationListAdapter, ContactSettingItem contactSettingItem, CompoundButton compoundButton, boolean z) {
        IndividuationListener individuationListener;
        if (!compoundButton.isPressed() || (individuationListener = individuationListAdapter.mListener) == null) {
            return;
        }
        individuationListener.onCheckedChangeListener(z, contactSettingItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(IndividuationListAdapter individuationListAdapter, ContactSettingItem contactSettingItem, View view) {
        IndividuationListener individuationListener = individuationListAdapter.mListener;
        if (individuationListener == null) {
            return;
        }
        individuationListener.onContactClickListener(contactSettingItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(IndividuationListAdapter individuationListAdapter, ContactSettingItem contactSettingItem, View view) {
        IndividuationListener individuationListener = individuationListAdapter.mListener;
        if (individuationListener == null) {
            return;
        }
        individuationListener.onVibrationClickListener(contactSettingItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void update$default(IndividuationListAdapter individuationListAdapter, boolean z, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = individuationListAdapter.data;
        }
        individuationListAdapter.update(z, list);
    }

    @NotNull
    public final List<ContactSettingItem> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    public final void setData(@NotNull List<ContactSettingItem> list) {
        this.data = list;
    }

    public final void setIndividuationListener(@NotNull IndividuationListener listener) {
        this.mListener = listener;
    }

    public final void update(boolean edit, @NotNull List<ContactSettingItem> items) {
        this.editing = edit;
        this.data = items;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull IndividuationViewHolder holder, int position) {
        int i;
        CheckBox rbContract = holder.getRbContract();
        if (this.editing) {
            holder.getRbContract().setChecked(false);
            i = 0;
        } else {
            i = 8;
        }
        rbContract.setVisibility(i);
        holder.getDivider().setVisibility(this.editing ? 0 : 8);
        final ContactSettingItem contactSettingItem = this.data.get(position);
        holder.getRbContract().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kf4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IndividuationListAdapter.d(this.a, contactSettingItem, compoundButton, z);
            }
        });
        holder.getTvContact().setOnClickListener(new View.OnClickListener() { // from class: jf4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndividuationListAdapter.e(this.a, contactSettingItem, view);
            }
        });
        holder.getTvVibration().setOnClickListener(new View.OnClickListener() { // from class: if4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndividuationListAdapter.f(this.a, contactSettingItem, view);
            }
        });
        holder.getTvContact().setText(contactSettingItem.getContact());
        Pair<String, Integer> vibration = Vibration.INSTANCE.getVibration(contactSettingItem.getVibration());
        holder.getTvVibration().setText(vibration.getFirst());
        holder.getIvVibration().setImageResource(vibration.getSecond().intValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public IndividuationViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new IndividuationViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_individual_contact, parent, false));
    }
}
