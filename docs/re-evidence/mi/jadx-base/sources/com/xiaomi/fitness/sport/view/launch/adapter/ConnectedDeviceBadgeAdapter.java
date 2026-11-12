package com.xiaomi.fitness.sport.view.launch.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceModelExtKt;
import com.xiaomi.fitness.sport.utils.SportBeanHelperExtKt;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.xri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/adapter/ConnectedDeviceBadgeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/sport/view/launch/adapter/ConnectedDeviceBadgeModel;", "badgeModelList", "", "updateBadgeModelList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "", "mBadgeModelList", "Ljava/util/List;", "<init>", "()V", "ItemViewHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ConnectedDeviceBadgeAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private List<ConnectedDeviceBadgeModel> mBadgeModelList = new ArrayList();

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/adapter/ConnectedDeviceBadgeAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/sport/view/launch/adapter/ConnectedDeviceBadgeModel;", "badgeModel", "", "bindData", "(Lcom/xiaomi/fitness/sport/view/launch/adapter/ConnectedDeviceBadgeModel;)V", "Landroidx/appcompat/widget/AppCompatTextView;", "deviceNameTv", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/widget/ImageView;", "deviceIconIv", "Landroid/widget/ImageView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/sport/view/launch/adapter/ConnectedDeviceBadgeAdapter;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nConnectedDeviceBadgeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectedDeviceBadgeAdapter.kt\ncom/xiaomi/fitness/sport/view/launch/adapter/ConnectedDeviceBadgeAdapter$ItemViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,74:1\n54#2,3:75\n24#2:78\n57#2,6:79\n63#2,2:86\n54#2,3:88\n24#2:91\n57#2,6:92\n63#2,2:99\n57#3:85\n57#3:98\n*S KotlinDebug\n*F\n+ 1 ConnectedDeviceBadgeAdapter.kt\ncom/xiaomi/fitness/sport/view/launch/adapter/ConnectedDeviceBadgeAdapter$ItemViewHolder\n*L\n40#1:75,3\n40#1:78\n40#1:79,6\n40#1:86,2\n45#1:88,3\n45#1:91\n45#1:92,6\n45#1:99,2\n40#1:85\n45#1:98\n*E\n"})
    public final class ItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView deviceIconIv;

        @NotNull
        private final AppCompatTextView deviceNameTv;
        final /* synthetic */ ConnectedDeviceBadgeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull ConnectedDeviceBadgeAdapter connectedDeviceBadgeAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = connectedDeviceBadgeAdapter;
            View viewFindViewById = itemView.findViewById(xri.f39393b);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.deviceNameTv = (AppCompatTextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(xri.x2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.deviceIconIv = (ImageView) viewFindViewById2;
        }

        public final void bindData(@NotNull ConnectedDeviceBadgeModel badgeModel) {
            int i;
            Intrinsics.checkNotNullParameter(badgeModel, "badgeModel");
            Product product = badgeModel.getDeviceModel().getProduct();
            if (!badgeModel.isPrimaryDevice()) {
                if (SportBeanHelperExtKt.supportsSportBeanByDeviceModel(badgeModel.getDeviceModel())) {
                    int i2 = eoi.w;
                    this.deviceNameTv.setText(c1j.f4);
                    ImageView imageView = this.deviceIconIv;
                    Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(Integer.valueOf(i2)).target(imageView).build());
                    return;
                }
                return;
            }
            if (DeviceModelExtKt.isRunwayScreen(product)) {
                i = eoi.x;
            } else if (DeviceModelExtKt.isRectangularScreen(product)) {
                i = eoi.q;
            } else {
                i = DeviceModelExtKt.isRoundScreen(product) ? eoi.s : eoi.x;
            }
            this.deviceNameTv.setText(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getName(badgeModel.getDeviceModel()));
            ImageView imageView2 = this.deviceIconIv;
            Coil.imageLoader(imageView2.getContext()).enqueue(new ImageRequest.Builder(imageView2.getContext()).data(Integer.valueOf(i)).target(imageView2).build());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mBadgeModelList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ConnectedDeviceBadgeModel connectedDeviceBadgeModel = this.mBadgeModelList.get(position);
        if (holder instanceof ItemViewHolder) {
            ((ItemViewHolder) holder).bindData(connectedDeviceBadgeModel);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(dvi.v, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ItemViewHolder(this, viewInflate);
    }

    public final void updateBadgeModelList(@NotNull List<ConnectedDeviceBadgeModel> badgeModelList) {
        Intrinsics.checkNotNullParameter(badgeModelList, "badgeModelList");
        this.mBadgeModelList.clear();
        this.mBadgeModelList.addAll(badgeModelList);
        notifyDataSetChanged();
    }
}
