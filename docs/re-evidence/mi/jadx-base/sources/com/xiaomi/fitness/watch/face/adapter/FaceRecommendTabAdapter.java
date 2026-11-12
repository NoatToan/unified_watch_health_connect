package com.xiaomi.fitness.watch.face.adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.FaceCategoryFragment;
import com.xiaomi.fitness.watch.face.FaceTabListFragment;
import com.xiaomi.fitness.watch.face.adapter.FaceRecommendTabAdapter;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketListItemWrapper;
import com.xiaomi.fitness.watch.face.data.DeviceFaceRecommendListItem;
import com.xiaomi.fitness.watch.face.ext.FaceExtKt;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.qae;
import defpackage.xli;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u001c\u0010\u0018\u001a\u00020\u000f2\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0014\u0010\u001b\u001a\u00020\u000f2\n\u0010\u0019\u001a\u00060\u0002R\u00020\u0000H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceRecommendTabAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/adapter/FaceRecommendTabAdapter$FaceRecommendTabHolder;", "<init>", "()V", "mList", "", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceRecommendListItem;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel$delegate", "Lkotlin/Lazy;", "setData", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "onViewRecycled", "FaceRecommendTabHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceRecommendTabAdapter extends RecyclerView.Adapter<FaceRecommendTabHolder> {

    @NotNull
    private final List<DeviceFaceRecommendListItem> mList = new ArrayList();

    /* JADX INFO: renamed from: deviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: z49
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceRecommendTabAdapter.deviceModel_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceRecommendTabAdapter$FaceRecommendTabHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", CervicalMucusRecord.Appearance.CLEAR, "()V", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceRecommendListItem;", "data", "bindData", "(Lcom/xiaomi/fitness/watch/face/data/DeviceFaceRecommendListItem;)V", "onClick", "Lqae;", "binding", "Lqae;", "<init>", "(Lcom/xiaomi/fitness/watch/face/adapter/FaceRecommendTabAdapter;Lqae;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nFaceRecommendTabAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceRecommendTabAdapter.kt\ncom/xiaomi/fitness/watch/face/adapter/FaceRecommendTabAdapter$FaceRecommendTabHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,121:1\n54#2,3:122\n24#2:125\n59#2,6:126\n*S KotlinDebug\n*F\n+ 1 FaceRecommendTabAdapter.kt\ncom/xiaomi/fitness/watch/face/adapter/FaceRecommendTabAdapter$FaceRecommendTabHolder\n*L\n54#1:122,3\n54#1:125\n54#1:126,6\n*E\n"})
    public final class FaceRecommendTabHolder extends RecyclerView.d0 {

        @NotNull
        private final qae binding;
        final /* synthetic */ FaceRecommendTabAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceRecommendTabHolder(@NotNull FaceRecommendTabAdapter faceRecommendTabAdapter, qae binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceRecommendTabAdapter;
            this.binding = binding;
        }

        public final void bindData(@NotNull DeviceFaceRecommendListItem data) {
            Intrinsics.checkNotNullParameter(data, "data");
            ViewGroup.LayoutParams layoutParams = this.binding.getRoot().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int screenWidth = DisplayUtil.getScreenWidth() - (ApplicationExtKt.getApplication().getResources().getDimensionPixelSize(xli.e) * 2);
            if (marginLayoutParams != null) {
                marginLayoutParams.width = screenWidth / 5;
            }
            ImageView icon = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            Coil.imageLoader(icon.getContext()).enqueue(new ImageRequest.Builder(icon.getContext()).data(data.getTabIcon()).target(icon).build());
            this.binding.C.setText(data.getTabName());
        }

        public final void clear() {
            this.binding.A.setImageDrawable(null);
        }

        public final void onClick(@NotNull DeviceFaceRecommendListItem data) {
            String model;
            Intrinsics.checkNotNullParameter(data, "data");
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("click_v3", "56.82.1.1.35071");
            Object[] objArr = new Object[6];
            objArr[0] = "name";
            objArr[1] = "important_position";
            objArr[2] = "detail";
            objArr[3] = data.getPosition() + "-" + data.getTabIcon() + "-" + data.getTabName() + "-" + data.getConfig_value();
            objArr[4] = "device_model";
            WearableDeviceModel deviceModel = this.this$0.getDeviceModel();
            if (deviceModel == null || (model = DeviceModelExtKt.getModel(deviceModel)) == null) {
                model = "";
            }
            objArr[5] = model;
            oneTrackExtKt.reportData(oneTrackStatBean, objArr);
            if (data.getTabType() == 0) {
                Bundle bundle = new Bundle();
                bundle.putInt(FaceTabListFragment.TAB_TYPE, 1);
                bundle.putString(FaceTabListFragment.TAB_ID, String.valueOf(data.getPosition()));
                bundle.putInt(FaceTabListFragment.TAB_SOURCE, data.getPosition());
                FaceExtKt.gotoPage(ApplicationExtKt.getApplication(), FaceTabListFragment.class, bundle);
                return;
            }
            if (data.getTabType() == 2) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(FaceTabListFragment.TAB_NAME, data.getTabName());
                FaceExtKt.gotoPage(ApplicationExtKt.getApplication(), FaceCategoryFragment.class, bundle2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel deviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getDeviceModel() {
        return (WearableDeviceModel) this.deviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(FaceRecommendTabHolder holder, FaceRecommendTabAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        holder.onClick(this$0.mList.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mList.size();
    }

    public final void setData(@NotNull DeviceFaceMarketListItemWrapper t) {
        Intrinsics.checkNotNullParameter(t, "t");
        List<DeviceFaceRecommendListItem> recommendList = t.getRecommendList();
        if (recommendList == null || recommendList.isEmpty()) {
            return;
        }
        this.mList.clear();
        this.mList.addAll(recommendList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final FaceRecommendTabHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.mList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: y49
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceRecommendTabAdapter.onBindViewHolder$lambda$1(holder, this, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceRecommendTabHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        qae qaeVarA0 = qae.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(qaeVarA0, "inflate(...)");
        return new FaceRecommendTabHolder(this, qaeVarA0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull FaceRecommendTabHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        holder.clear();
    }
}
