package com.huami.core.device.wifi_settings.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.core.device.wifi_settings.R;
import com.huami.core.device.wifi_settings.bean.ConnectStatus;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import com.huami.core.device.wifi_settings.ui.adapter.WifiListAdapter;
import com.huami.core.device.wifi_settings.wifiscan.WifiUtil;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u0017\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/adapter/WifiListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/core/device/wifi_settings/ui/adapter/WifiListAdapter$WifiViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "a", "Ljava/util/List;", "mWifiData", "Landroid/view/View$OnClickListener;", "b", "Landroid/view/View$OnClickListener;", "getMListener", "()Landroid/view/View$OnClickListener;", "setMListener", "(Landroid/view/View$OnClickListener;)V", "mListener", "<init>", "(Ljava/util/List;)V", "WifiViewHolder", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiListAdapter extends RecyclerView.Adapter<WifiViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private List<WifiBean> mWifiData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener mListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000e\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001d\u0010\u0012\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/adapter/WifiListAdapter$WifiViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "wifiBean", "", "bindData", "Landroidx/appcompat/widget/AppCompatTextView;", "a", "Lkotlin/Lazy;", "e", "()Landroidx/appcompat/widget/AppCompatTextView;", "tvWifiName", "b", GoogleApiAvailabilityLight.a, "tvFlagCurrent", "Landroidx/appcompat/widget/AppCompatImageView;", "c", "()Landroidx/appcompat/widget/AppCompatImageView;", "ivWifiLock", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/core/device/wifi_settings/ui/adapter/WifiListAdapter;Landroid/view/View;)V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public final class WifiViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Lazy tvWifiName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Lazy tvFlagCurrent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy ivWifiLock;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/appcompat/widget/AppCompatImageView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<AppCompatImageView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppCompatImageView invoke() {
                return (AppCompatImageView) this.a.findViewById(R.id.iv_wifi_lock);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/appcompat/widget/AppCompatTextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<AppCompatTextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppCompatTextView invoke() {
                return (AppCompatTextView) this.a.findViewById(R.id.tv_flag_current);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/appcompat/widget/AppCompatTextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<AppCompatTextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppCompatTextView invoke() {
                return (AppCompatTextView) this.a.findViewById(R.id.tv_wifi_name);
            }
        }

        public WifiViewHolder(View view) {
            super(view);
            this.tvWifiName = LazyKt__LazyJVMKt.lazy(new c(view));
            this.tvFlagCurrent = LazyKt__LazyJVMKt.lazy(new b(view));
            this.ivWifiLock = LazyKt__LazyJVMKt.lazy(new a(view));
            view.setOnClickListener(new View.OnClickListener() { // from class: pv8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    WifiListAdapter.WifiViewHolder.b(wifiListAdapter, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(WifiListAdapter wifiListAdapter, View view) {
            View.OnClickListener mListener = wifiListAdapter.getMListener();
            if (mListener == null) {
                return;
            }
            mListener.onClick(view);
        }

        private final AppCompatImageView c() {
            return (AppCompatImageView) this.ivWifiLock.getValue();
        }

        private final AppCompatTextView d() {
            return (AppCompatTextView) this.tvFlagCurrent.getValue();
        }

        private final AppCompatTextView e() {
            return (AppCompatTextView) this.tvWifiName.getValue();
        }

        public final void bindData(@NotNull WifiBean wifiBean) {
            this.itemView.setTag(wifiBean);
            e().setText(wifiBean.getWifiSSID());
            d().setVisibility(wifiBean.getWifiState() == ConnectStatus.CONNECTED ? 0 : 8);
            c().setVisibility(WifiUtil.INSTANCE.needWifiPwd(wifiBean.getCapabilities()) ? 0 : 8);
        }
    }

    public WifiListAdapter(@Nullable List<WifiBean> list) {
        this.mWifiData = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        List<WifiBean> list = this.mWifiData;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Nullable
    public final View.OnClickListener getMListener() {
        return this.mListener;
    }

    public final void setMListener(@Nullable View.OnClickListener onClickListener) {
        this.mListener = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull WifiViewHolder holder, int position) {
        WifiBean wifiBean;
        List<WifiBean> list = this.mWifiData;
        if (list == null || (wifiBean = list.get(position)) == null) {
            return;
        }
        holder.bindData(wifiBean);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public WifiViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new WifiViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.wifi_setting_item_nearby_wifi, parent, false));
    }
}
