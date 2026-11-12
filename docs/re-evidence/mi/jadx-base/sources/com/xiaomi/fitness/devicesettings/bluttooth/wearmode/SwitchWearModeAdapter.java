package com.xiaomi.fitness.devicesettings.bluttooth.wearmode;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.wearmode.SwitchWearModeAdapter;
import com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil;
import defpackage.eui;
import defpackage.nuf;
import defpackage.wzi;
import defpackage.zqi;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\r\u001a\u00020\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bJ\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\f2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeAdapter$SwitchWearModeHolder;", "modeList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/WearModeBean;", "<init>", "(Ljava/util/List;)V", "getModeList", "()Ljava/util/List;", "onSelectListener", "Lkotlin/Function1;", "", "setOnSelectListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "SwitchWearModeHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwitchWearModeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchWearModeAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,93:1\n54#2,3:94\n24#2:97\n59#2,6:98\n54#2,3:104\n24#2:107\n57#2,6:108\n63#2,2:115\n54#2,3:117\n24#2:120\n57#2,6:121\n63#2,2:128\n57#3:114\n57#3:127\n*S KotlinDebug\n*F\n+ 1 SwitchWearModeAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeAdapter\n*L\n74#1:94,3\n74#1:97\n74#1:98,6\n78#1:104,3\n78#1:107\n78#1:108,6\n78#1:115,2\n82#1:117,3\n82#1:120\n82#1:121,6\n82#1:128,2\n78#1:114\n82#1:127\n*E\n"})
public final class SwitchWearModeAdapter extends RecyclerView.Adapter<SwitchWearModeHolder> {

    @NotNull
    private final List<WearModeBean> modeList;

    @Nullable
    private Function1<? super WearModeBean, Unit> onSelectListener;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeAdapter$SwitchWearModeHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "func", "getFunc", "desc", "getDesc", "Landroid/view/View;", "switch", "Landroid/view/View;", "getSwitch", "()Landroid/view/View;", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "itemView", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeAdapter;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SwitchWearModeHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView desc;

        @NotNull
        private final TextView func;

        @NotNull
        private final ImageView icon;

        @NotNull
        private final View switch;
        final /* synthetic */ SwitchWearModeAdapter this$0;

        @NotNull
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SwitchWearModeHolder(@NotNull SwitchWearModeAdapter switchWearModeAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = switchWearModeAdapter;
            nuf.f(itemView);
            View viewFindViewById = itemView.findViewById(zqi.r5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.title = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(zqi.o5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.func = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(zqi.n5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.desc = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(zqi.q5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.switch = viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(zqi.p5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById5;
        }

        @NotNull
        public final TextView getDesc() {
            return this.desc;
        }

        @NotNull
        public final TextView getFunc() {
            return this.func;
        }

        @NotNull
        public final ImageView getIcon() {
            return this.icon;
        }

        @NotNull
        public final View getSwitch() {
            return this.switch;
        }

        @NotNull
        public final TextView getTitle() {
            return this.title;
        }
    }

    public SwitchWearModeAdapter(@NotNull List<WearModeBean> modeList) {
        Intrinsics.checkNotNullParameter(modeList, "modeList");
        this.modeList = modeList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$4(SwitchWearModeAdapter this$0, WearModeBean mode, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mode, "$mode");
        Function1<? super WearModeBean, Unit> function1 = this$0.onSelectListener;
        if (function1 != null) {
            function1.invoke2(mode);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.modeList.size();
    }

    @NotNull
    public final List<WearModeBean> getModeList() {
        return this.modeList;
    }

    public final void setOnSelectListener(@Nullable Function1<? super WearModeBean, Unit> listener) {
        this.onSelectListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SwitchWearModeHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final WearModeBean wearModeBean = this.modeList.get(position);
        int mode = wearModeBean.getMode();
        if (mode == 1) {
            holder.getTitle().setText(ResourceExtKt.getString(wzi.p9));
            holder.getFunc().setText(ResourceExtKt.getString(wzi.q9));
            holder.getDesc().setText(ResourceExtKt.getString(wzi.r9));
        } else if (mode != 2) {
            holder.getTitle().setText(ResourceExtKt.getString(wzi.m9));
            holder.getFunc().setText(ResourceExtKt.getString(wzi.n9));
            holder.getDesc().setText(ResourceExtKt.getString(wzi.o9));
        } else {
            holder.getTitle().setText(ResourceExtKt.getString(wzi.s9));
            holder.getFunc().setText(ResourceExtKt.getString(wzi.t9));
            holder.getDesc().setText(ResourceExtKt.getString(wzi.u9));
        }
        holder.getSwitch().setSelected(wearModeBean.getIsSelect());
        if (wearModeBean.getUrl().length() > 0) {
            ImageView icon = holder.getIcon();
            String url = wearModeBean.getUrl();
            ImageLoader imageLoader = Coil.imageLoader(icon.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(icon.getContext()).data(url).target(icon);
            ImageLoadUtil.INSTANCE.lazyHeader(builderTarget, new LinkedHashMap());
            imageLoader.enqueue(builderTarget.build());
        } else if (wearModeBean.getIcon() != null) {
            ImageView icon2 = holder.getIcon();
            Coil.imageLoader(icon2.getContext()).enqueue(new ImageRequest.Builder(icon2.getContext()).data(wearModeBean.getIcon()).target(icon2).build());
        } else {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            String deviceIconUrl = wearableDeviceModel != null ? DeviceModelExtKt.getDeviceIconUrl(wearableDeviceModel, 3) : null;
            ImageView icon3 = holder.getIcon();
            Coil.imageLoader(icon3.getContext()).enqueue(new ImageRequest.Builder(icon3.getContext()).data(deviceIconUrl).target(icon3).build());
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: yro
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SwitchWearModeAdapter.onBindViewHolder$lambda$4(this.f40470a, wearModeBean, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SwitchWearModeHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(eui.A1, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new SwitchWearModeHolder(this, viewInflate);
    }
}
