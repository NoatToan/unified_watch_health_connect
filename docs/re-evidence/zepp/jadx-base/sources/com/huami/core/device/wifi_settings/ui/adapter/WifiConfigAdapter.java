package com.huami.core.device.wifi_settings.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.core.device.wifi_settings.R;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import com.huami.core.device.wifi_settings.bean.WifiMultiBean;
import com.huami.core.device.wifi_settings.ui.adapter.WifiConfigAdapter;
import com.huami.core.device.wifi_settings.wifiscan.WifiUtil;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004%&'(B\u0019\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0016R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006)"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "position", "getItemViewType", "getItemCount", "holder", "", "onBindViewHolder", "", "Lcom/huami/core/device/wifi_settings/bean/WifiMultiBean;", "a", "Ljava/util/List;", "mData", "Landroid/view/View$OnClickListener;", "b", "Landroid/view/View$OnClickListener;", "getMListener", "()Landroid/view/View$OnClickListener;", "setMListener", "(Landroid/view/View$OnClickListener;)V", "mListener", "Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter$OnClickConfigWifiListener;", "c", "Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter$OnClickConfigWifiListener;", "getMClickConfigWifiListener", "()Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter$OnClickConfigWifiListener;", "setMClickConfigWifiListener", "(Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter$OnClickConfigWifiListener;)V", "mClickConfigWifiListener", "<init>", "(Ljava/util/List;)V", "OnClickConfigWifiListener", "WifiHeaderViewHolder", "WifiViewConfigHolder", "WifiViewHolder", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiConfigAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private List<WifiMultiBean> mData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener mListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private OnClickConfigWifiListener mClickConfigWifiListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter$OnClickConfigWifiListener;", "", "Lcom/huami/core/device/wifi_settings/bean/WifiMultiBean;", "wifiMultiBean", "", "position", "", "onClickReset", "onClickRemove", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public interface OnClickConfigWifiListener {
        void onClickRemove(@NotNull WifiMultiBean wifiMultiBean, int position);

        void onClickReset(@NotNull WifiMultiBean wifiMultiBean, int position);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\n\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter$WifiHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/core/device/wifi_settings/bean/WifiMultiBean;", "wifiMultiBean", "", "bindHeader", "Landroidx/appcompat/widget/AppCompatTextView;", "a", "Lkotlin/Lazy;", "()Landroidx/appcompat/widget/AppCompatTextView;", "tvWifiTitle", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter;Landroid/view/View;)V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public final class WifiHeaderViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Lazy tvWifiTitle;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/appcompat/widget/AppCompatTextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<AppCompatTextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppCompatTextView invoke() {
                return (AppCompatTextView) this.a.findViewById(R.id.tv_title);
            }
        }

        public WifiHeaderViewHolder(View view) {
            super(view);
            this.tvWifiTitle = LazyKt__LazyJVMKt.lazy(new a(view));
        }

        private final AppCompatTextView a() {
            return (AppCompatTextView) this.tvWifiTitle.getValue();
        }

        public final void bindHeader(@NotNull WifiMultiBean wifiMultiBean) {
            this.itemView.setTag(wifiMultiBean);
            a().setText(wifiMultiBean.getTitle());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter$WifiViewConfigHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/core/device/wifi_settings/bean/WifiMultiBean;", "wifiMultiBean", "", "position", "", "bindData", "Landroidx/appcompat/widget/AppCompatTextView;", "a", "Lkotlin/Lazy;", "g", "()Landroidx/appcompat/widget/AppCompatTextView;", "tvWifiName", "Landroid/view/View;", "b", "f", "()Landroid/view/View;", "tvReset", "c", "e", "tvRemove", "itemView", "<init>", "(Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter;Landroid/view/View;)V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public final class WifiViewConfigHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Lazy tvWifiName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Lazy tvReset;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy tvRemove;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/appcompat/widget/AppCompatTextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<AppCompatTextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppCompatTextView invoke() {
                return (AppCompatTextView) this.a.findViewById(R.id.tv_remove);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<View> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(View view) {
                super(0);
                this.a = view;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return this.a.findViewById(R.id.tv_reset);
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

        public WifiViewConfigHolder(View view) {
            super(view);
            this.tvWifiName = LazyKt__LazyJVMKt.lazy(new c(view));
            this.tvReset = LazyKt__LazyJVMKt.lazy(new b(view));
            this.tvRemove = LazyKt__LazyJVMKt.lazy(new a(view));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(WifiConfigAdapter wifiConfigAdapter, WifiMultiBean wifiMultiBean, int i, View view) {
            OnClickConfigWifiListener mClickConfigWifiListener = wifiConfigAdapter.getMClickConfigWifiListener();
            if (mClickConfigWifiListener == null) {
                return;
            }
            mClickConfigWifiListener.onClickRemove(wifiMultiBean, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(WifiConfigAdapter wifiConfigAdapter, WifiMultiBean wifiMultiBean, int i, View view) {
            OnClickConfigWifiListener mClickConfigWifiListener = wifiConfigAdapter.getMClickConfigWifiListener();
            if (mClickConfigWifiListener == null) {
                return;
            }
            mClickConfigWifiListener.onClickReset(wifiMultiBean, i);
        }

        private final AppCompatTextView e() {
            return (AppCompatTextView) this.tvRemove.getValue();
        }

        private final View f() {
            return (View) this.tvReset.getValue();
        }

        private final AppCompatTextView g() {
            return (AppCompatTextView) this.tvWifiName.getValue();
        }

        public final void bindData(@NotNull final WifiMultiBean wifiMultiBean, final int position) {
            WifiBean wifiBean = wifiMultiBean.getWifiBean();
            if (wifiBean != null) {
                g().setText(wifiBean.getWifiSSID());
            }
            AppCompatTextView appCompatTextViewE = e();
            final WifiConfigAdapter wifiConfigAdapter = WifiConfigAdapter.this;
            appCompatTextViewE.setOnClickListener(new View.OnClickListener() { // from class: ru8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WifiConfigAdapter.WifiViewConfigHolder.c(wifiConfigAdapter, wifiMultiBean, position, view);
                }
            });
            View viewF = f();
            final WifiConfigAdapter wifiConfigAdapter2 = WifiConfigAdapter.this;
            viewF.setOnClickListener(new View.OnClickListener() { // from class: su8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WifiConfigAdapter.WifiViewConfigHolder.d(wifiConfigAdapter2, wifiMultiBean, position, view);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter$WifiViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/core/device/wifi_settings/bean/WifiMultiBean;", "wifiMultiBean", "", "bindData", "Landroidx/appcompat/widget/AppCompatTextView;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Landroidx/appcompat/widget/AppCompatTextView;", "tvWifiName", "Landroidx/appcompat/widget/AppCompatImageView;", "b", "c", "()Landroidx/appcompat/widget/AppCompatImageView;", "ivWifiLock", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter;Landroid/view/View;)V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public final class WifiViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Lazy tvWifiName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
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
                return (AppCompatTextView) this.a.findViewById(R.id.tv_wifi_name);
            }
        }

        public WifiViewHolder(View view) {
            super(view);
            this.tvWifiName = LazyKt__LazyJVMKt.lazy(new b(view));
            this.ivWifiLock = LazyKt__LazyJVMKt.lazy(new a(view));
            view.setOnClickListener(new View.OnClickListener() { // from class: tu8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    WifiConfigAdapter.WifiViewHolder.b(wifiConfigAdapter, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(WifiConfigAdapter wifiConfigAdapter, View view) {
            View.OnClickListener mListener = wifiConfigAdapter.getMListener();
            if (mListener == null) {
                return;
            }
            mListener.onClick(view);
        }

        private final AppCompatImageView c() {
            return (AppCompatImageView) this.ivWifiLock.getValue();
        }

        private final AppCompatTextView d() {
            return (AppCompatTextView) this.tvWifiName.getValue();
        }

        public final void bindData(@NotNull WifiMultiBean wifiMultiBean) {
            this.itemView.setTag(wifiMultiBean);
            WifiBean wifiBean = wifiMultiBean.getWifiBean();
            if (wifiBean == null) {
                return;
            }
            d().setText(wifiBean.getWifiSSID());
            c().setVisibility(WifiUtil.INSTANCE.needWifiPwd(wifiBean.getCapabilities()) ? 0 : 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WifiConfigAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ WifiConfigAdapter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        List<WifiMultiBean> list = this.mData;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        WifiMultiBean wifiMultiBean;
        Integer itemType;
        List<WifiMultiBean> list = this.mData;
        if (list == null || (wifiMultiBean = list.get(position)) == null || (itemType = wifiMultiBean.getItemType()) == null) {
            return 0;
        }
        return itemType.intValue();
    }

    @Nullable
    public final OnClickConfigWifiListener getMClickConfigWifiListener() {
        return this.mClickConfigWifiListener;
    }

    @Nullable
    public final View.OnClickListener getMListener() {
        return this.mListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        WifiMultiBean wifiMultiBean;
        List<WifiMultiBean> list = this.mData;
        if (list == null || (wifiMultiBean = list.get(position)) == null) {
            return;
        }
        if (holder instanceof WifiViewHolder) {
            ((WifiViewHolder) holder).bindData(wifiMultiBean);
        } else if (holder instanceof WifiHeaderViewHolder) {
            ((WifiHeaderViewHolder) holder).bindHeader(wifiMultiBean);
        } else if (holder instanceof WifiViewConfigHolder) {
            ((WifiViewConfigHolder) holder).bindData(wifiMultiBean, position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        if (viewType != 1) {
            return viewType != 2 ? new WifiViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.wifi_setting_item_nearby_wifi, parent, false)) : new WifiViewConfigHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.wifi_setting_item_config_wifi, parent, false));
        }
        return new WifiHeaderViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.wifi_setting_item_config_wifi_title, parent, false));
    }

    public final void setMClickConfigWifiListener(@Nullable OnClickConfigWifiListener onClickConfigWifiListener) {
        this.mClickConfigWifiListener = onClickConfigWifiListener;
    }

    public final void setMListener(@Nullable View.OnClickListener onClickListener) {
        this.mListener = onClickListener;
    }

    public WifiConfigAdapter(@Nullable List<WifiMultiBean> list) {
        this.mData = list;
    }
}
