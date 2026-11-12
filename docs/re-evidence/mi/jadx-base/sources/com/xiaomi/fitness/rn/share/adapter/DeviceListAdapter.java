package com.xiaomi.fitness.rn.share.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import com.xiaomi.fitness.rn.share.adapter.DeviceListAdapter;
import com.xiaomi.fitness.rn.share.bean.DeviceBean;
import defpackage.avi;
import defpackage.tri;
import defpackage.vo6;
import defpackage.w0j;
import defpackage.wxi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001c\u0010\u001e\u001a\u00020\n2\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u001dH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/rn/share/adapter/DeviceListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/rn/share/adapter/DeviceListAdapter$DeviceListHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/xiaomi/fitness/rn/share/bean/DeviceBean;", "onItemClick", "Lkotlin/Function1;", "", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "DeviceListHolder", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceListAdapter extends RecyclerView.Adapter<DeviceListHolder> {

    @NotNull
    private Context context;

    @NotNull
    private List<DeviceBean> dataList;

    @Nullable
    private Function1<? super DeviceBean, Unit> onItemClick;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0017\u001a\n \u000f*\u0004\u0018\u00010\u00160\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\n \u000f*\u0004\u0018\u00010\u00160\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/rn/share/adapter/DeviceListAdapter$DeviceListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/rn/share/bean/DeviceBean;", "pluginDevice", "", "bind", "(Lcom/xiaomi/fitness/rn/share/bean/DeviceBean;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "iconView", "Landroid/widget/ImageView;", "getIconView", "()Landroid/widget/ImageView;", "setIconView", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "nameView", "Landroid/widget/TextView;", "getNameView", "()Landroid/widget/TextView;", "setNameView", "(Landroid/widget/TextView;)V", "shareStatusView", "getShareStatusView", "setShareStatusView", "<init>", "(Lcom/xiaomi/fitness/rn/share/adapter/DeviceListAdapter;Landroid/view/View;)V", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nDeviceListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceListAdapter.kt\ncom/xiaomi/fitness/rn/share/adapter/DeviceListAdapter$DeviceListHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,75:1\n54#2,3:76\n24#2:79\n57#2,6:80\n63#2,2:87\n54#2,3:89\n24#2:92\n57#2,6:93\n63#2,2:100\n57#3:86\n57#3:99\n*S KotlinDebug\n*F\n+ 1 DeviceListAdapter.kt\ncom/xiaomi/fitness/rn/share/adapter/DeviceListAdapter$DeviceListHolder\n*L\n35#1:76,3\n35#1:79\n35#1:80,6\n35#1:87,2\n46#1:89,3\n46#1:92\n46#1:93,6\n46#1:100,2\n35#1:86\n46#1:99\n*E\n"})
    public final class DeviceListHolder extends RecyclerView.d0 {
        private ImageView iconView;
        private TextView nameView;
        private TextView shareStatusView;
        final /* synthetic */ DeviceListAdapter this$0;

        @NotNull
        private View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceListHolder(@NotNull DeviceListAdapter deviceListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = deviceListAdapter;
            this.view = view;
            this.iconView = (ImageView) view.findViewById(tri.i);
            this.nameView = (TextView) this.view.findViewById(tri.n);
            this.shareStatusView = (TextView) this.view.findViewById(tri.q);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2(DeviceListAdapter this$0, DeviceBean pluginDevice, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(pluginDevice, "$pluginDevice");
            Function1<DeviceBean, Unit> onItemClick = this$0.getOnItemClick();
            if (onItemClick != null) {
                onItemClick.invoke2(pluginDevice);
            }
        }

        public final void bind(@NotNull final DeviceBean pluginDevice) {
            RNProduct productByModel;
            Intrinsics.checkNotNullParameter(pluginDevice, "pluginDevice");
            String deviceIconUrl = DeviceModelExtKt.getDeviceIconUrl(pluginDevice.getDevice(), 1);
            ImageView iconView = this.iconView;
            Intrinsics.checkNotNullExpressionValue(iconView, "iconView");
            Coil.imageLoader(iconView.getContext()).enqueue(new ImageRequest.Builder(iconView.getContext()).data(deviceIconUrl).target(iconView).build());
            try {
                productByModel = ProductExtKt.getInstance(RNProductManager.INSTANCE).getProductByModel(DeviceModelExtKt.getModel(pluginDevice.getDevice()));
            } catch (Exception e) {
                e.printStackTrace();
                vo6.a("DeviceListAdapter getProductByModel error");
                productByModel = null;
            }
            vo6.c("DeviceListAdapter model " + DeviceModelExtKt.getModel(pluginDevice.getDevice()) + " " + (productByModel != null ? productByModel.getSmallIcon() : null));
            if (productByModel != null) {
                ImageView iconView2 = this.iconView;
                Intrinsics.checkNotNullExpressionValue(iconView2, "iconView");
                Coil.imageLoader(iconView2.getContext()).enqueue(new ImageRequest.Builder(iconView2.getContext()).data(productByModel.getSmallIcon()).target(iconView2).build());
            }
            this.nameView.setText(DeviceModelExtKt.getName(pluginDevice.getDevice()));
            this.shareStatusView.setText(pluginDevice.getSharedCount() == 0 ? AppUtil.getApp().getString(w0j.f37417k) : AppUtil.getApp().getResources().getQuantityString(wxi.f38461a, pluginDevice.getSharedCount(), Integer.valueOf(pluginDevice.getSharedCount())));
            View view = this.view;
            final DeviceListAdapter deviceListAdapter = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: o86
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeviceListAdapter.DeviceListHolder.bind$lambda$2(deviceListAdapter, pluginDevice, view2);
                }
            });
        }

        public final ImageView getIconView() {
            return this.iconView;
        }

        public final TextView getNameView() {
            return this.nameView;
        }

        public final TextView getShareStatusView() {
            return this.shareStatusView;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setIconView(ImageView imageView) {
            this.iconView = imageView;
        }

        public final void setNameView(TextView textView) {
            this.nameView = textView;
        }

        public final void setShareStatusView(TextView textView) {
            this.shareStatusView = textView;
        }

        public final void setView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.view = view;
        }
    }

    public /* synthetic */ DeviceListAdapter(Context context, List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list, (i & 4) != 0 ? null : function1);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<DeviceBean> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Nullable
    public final Function1<DeviceBean, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDataList(@NotNull List<DeviceBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void setOnItemClick(@Nullable Function1<? super DeviceBean, Unit> function1) {
        this.onItemClick = function1;
    }

    public DeviceListAdapter(@NotNull Context context, @NotNull List<DeviceBean> dataList, @Nullable Function1<? super DeviceBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.context = context;
        this.dataList = dataList;
        this.onItemClick = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull DeviceListHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.dataList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DeviceListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(avi.f, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new DeviceListHolder(this, viewInflate);
    }
}
