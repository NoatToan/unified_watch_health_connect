package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.ui.smartplay.appnotify.AppsListAdapter;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B%\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b.\u0010/J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005H\u0016J>\u0010\u0015\u001a\u00020\n26\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n0\u000fJ\u0014\u0010\u0019\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016R\u0019\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\"\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)RF\u0010-\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n0\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppsListAdapter$AppHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "getItemId", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "isChecked", "onCheckedChangeListener", "setOnCheckedChangeListener", "", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppInfo;", "list", "update", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Z", "isSupportPersonalise", "()Z", "c", "Ljava/util/List;", "getAppInfoList", "()Ljava/util/List;", "setAppInfoList", "(Ljava/util/List;)V", "appInfoList", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function2;", "mListener", "<init>", "(Landroid/content/Context;ZLjava/util/List;)V", "AppHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AppsListAdapter extends RecyclerView.Adapter<AppHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSupportPersonalise;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<? extends AppInfo> appInfoList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function2<? super Integer, ? super Boolean, Unit> mListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u001c\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001f\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppsListAdapter$AppHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getAppName", "()Landroid/widget/TextView;", "appName", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "getAppIcon", "()Landroid/widget/ImageView;", "appIcon", GoogleApiAvailabilityLight.a, "getIvContacts", "ivContacts", "Landroid/widget/CompoundButton;", "e", "Landroid/widget/CompoundButton;", "getSwitch", "()Landroid/widget/CompoundButton;", WebConstant.QueryParam.SWITCH, "f", "getContactsClickAres", "contactsClickAres", "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class AppHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final View view;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView appName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final ImageView appIcon;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final ImageView ivContacts;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final CompoundButton switch;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final ImageView contactsClickAres;

        public AppHolder(@NotNull View view) {
            super(view);
            this.view = view;
            this.appName = (TextView) view.findViewById(R.id.tv_app_name);
            this.appIcon = (ImageView) view.findViewById(R.id.icon);
            this.ivContacts = (ImageView) view.findViewById(R.id.iv_contacts);
            this.switch = (CompoundButton) view.findViewById(R.id.notifi_on);
            this.contactsClickAres = (ImageView) view.findViewById(R.id.contacts_click_area);
        }

        @NotNull
        public final ImageView getAppIcon() {
            return this.appIcon;
        }

        @NotNull
        public final TextView getAppName() {
            return this.appName;
        }

        @NotNull
        public final ImageView getContactsClickAres() {
            return this.contactsClickAres;
        }

        @NotNull
        public final ImageView getIvContacts() {
            return this.ivContacts;
        }

        @NotNull
        public final CompoundButton getSwitch() {
            return this.switch;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    public AppsListAdapter(@NotNull Context context, boolean z, @NotNull List<? extends AppInfo> list) {
        this.context = context;
        this.isSupportPersonalise = z;
        this.appInfoList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AppsListAdapter appsListAdapter, int i, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            Function2<? super Integer, ? super Boolean, Unit> function2 = appsListAdapter.mListener;
            Objects.requireNonNull(function2);
            function2.invoke(Integer.valueOf(i), Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AppsListAdapter appsListAdapter, AppInfo appInfo, View view) {
        AnalyticsStarredContacts.INSTANCE.recordEntrance();
        IndividuationActivity.INSTANCE.launch(appsListAdapter.getContext(), appInfo.packageName, appInfo.name);
    }

    @NotNull
    public final List<AppInfo> getAppInfoList() {
        return this.appInfoList;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.appInfoList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    /* JADX INFO: renamed from: isSupportPersonalise, reason: from getter */
    public final boolean getIsSupportPersonalise() {
        return this.isSupportPersonalise;
    }

    public final void setAppInfoList(@NotNull List<? extends AppInfo> list) {
        this.appInfoList = list;
    }

    public final void setOnCheckedChangeListener(@NotNull Function2<? super Integer, ? super Boolean, Unit> onCheckedChangeListener) {
        this.mListener = onCheckedChangeListener;
    }

    public final void update(@NotNull List<? extends AppInfo> list) {
        this.appInfoList = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull AppHolder holder, final int position) {
        final AppInfo appInfo = this.appInfoList.get(position);
        holder.getAppName().setText(appInfo.name);
        holder.getAppIcon().setImageDrawable(appInfo.icon);
        holder.getSwitch().setChecked(appInfo.isChecked);
        holder.getSwitch().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ri
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AppsListAdapter.c(this.a, position, compoundButton, z);
            }
        });
        if (!getIsSupportPersonalise() || !AppInfoUtil.INSTANCE.supportPersonalise(appInfo.packageName)) {
            holder.getIvContacts().setVisibility(8);
            holder.getContactsClickAres().setVisibility(8);
        } else {
            holder.getIvContacts().setVisibility(0);
            holder.getContactsClickAres().setVisibility(0);
            holder.getContactsClickAres().setOnClickListener(new View.OnClickListener() { // from class: qi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppsListAdapter.d(this.a, appInfo, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public AppHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new AppHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_notifi_picked_apps_item, parent, false));
    }
}
