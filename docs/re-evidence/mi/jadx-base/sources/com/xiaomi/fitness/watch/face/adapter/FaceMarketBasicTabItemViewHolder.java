package com.xiaomi.fitness.watch.face.adapter;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.NestRecyclerViewItemEffectiveExposeBiz;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.adapter.FaceMarketBasicTabItemViewHolder;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketListItemWrapper;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.helper.FaceOneTrackUtil;
import com.xiaomi.fitness.watch.face.market.DeviceFaceMarketPageManager;
import com.xiaomi.fitness.watch.face.widget.NoTouchRecyclerView;
import defpackage.p1j;
import defpackage.p9e;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 (2\u00020\u0001:\u0001(B!\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b&\u0010'J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceMarketBasicTabItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "key", "getOperationText", "(Ljava/lang/String;)Ljava/lang/String;", "", "position", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;", "data", "", "bindData", "(ILcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lp9e;", "binding", "Lp9e;", "", "showWatchFacePrice", "Z", "name", "Ljava/lang/String;", "source", "I", "columnCount", "Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "trackExpose$delegate", "Lkotlin/Lazy;", "getTrackExpose", "()Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "trackExpose", "Lcom/xiaomi/fitness/watch/face/adapter/FaceMarketResourcePoolItemAdapter;", "mFaceMarketResourcePoolItemAdapter$delegate", "getMFaceMarketResourcePoolItemAdapter", "()Lcom/xiaomi/fitness/watch/face/adapter/FaceMarketResourcePoolItemAdapter;", "mFaceMarketResourcePoolItemAdapter", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lp9e;Z)V", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceMarketBasicTabItemViewHolder extends RecyclerView.d0 {

    @NotNull
    public static final String EDITORS_PICKS = "resource_pool_editors_picks";

    @NotNull
    public static final String POOL_ALL = "resource_pool_al";

    @NotNull
    public static final String POOL_HOT = "resource_pool_popular";

    @NotNull
    public static final String POOL_NEW = "resource_pool_new";

    @NotNull
    private final p9e binding;
    private final int columnCount;

    @Nullable
    private final WearableDeviceModel deviceModel;

    /* JADX INFO: renamed from: mFaceMarketResourcePoolItemAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFaceMarketResourcePoolItemAdapter;

    @Nullable
    private String name;
    private final boolean showWatchFacePrice;
    private int source;

    /* JADX INFO: renamed from: trackExpose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy trackExpose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceMarketBasicTabItemViewHolder(@Nullable WearableDeviceModel wearableDeviceModel, @NotNull p9e binding, boolean z) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.deviceModel = wearableDeviceModel;
        this.binding = binding;
        this.showWatchFacePrice = z;
        this.trackExpose = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: n39
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceMarketBasicTabItemViewHolder.trackExpose_delegate$lambda$0();
            }
        });
        this.mFaceMarketResourcePoolItemAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: o39
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceMarketBasicTabItemViewHolder.mFaceMarketResourcePoolItemAdapter_delegate$lambda$1(this.f28691a);
            }
        });
        Context context = binding.getRoot().getContext();
        UIUtils uIUtils = UIUtils.INSTANCE;
        Intrinsics.checkNotNull(context);
        int i = uIUtils.isTabletAndLandscape(context) ? 6 : 3;
        this.columnCount = i;
        binding.A.setLayoutManager(new GridLayoutManager(context, i));
        binding.A.setAdapter(getMFaceMarketResourcePoolItemAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$2(DeviceFaceMarketListItemWrapper data, int i, FaceMarketBasicTabItemViewHolder this$0, View view) {
        String model;
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceFaceMarketPageManager.INSTANCE.toFaceResourcePoolPage(ApplicationExtKt.getApplication(), data.getResourcePoolListItem().getKey(), i);
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("click_v3", "56.82.1.1.35074");
        Object[] objArr = new Object[4];
        objArr[0] = "area";
        objArr[1] = i + "-" + data.getResourcePoolListItem().getName();
        objArr[2] = "device_model";
        WearableDeviceModel wearableDeviceModel = this$0.deviceModel;
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr[3] = model;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    private final FaceMarketResourcePoolItemAdapter getMFaceMarketResourcePoolItemAdapter() {
        return (FaceMarketResourcePoolItemAdapter) this.mFaceMarketResourcePoolItemAdapter.getValue();
    }

    private final String getOperationText(String key) {
        int iHashCode = key.hashCode();
        if (iHashCode != -1555880825) {
            if (iHashCode != -962977778) {
                if (iHashCode == 671121991 && key.equals(POOL_HOT)) {
                    return "operation_hot";
                }
            } else if (key.equals(POOL_NEW)) {
                return "operation_newest";
            }
        } else if (key.equals(EDITORS_PICKS)) {
            return "operation_official";
        }
        return "";
    }

    private final NestRecyclerViewItemEffectiveExposeBiz getTrackExpose() {
        return (NestRecyclerViewItemEffectiveExposeBiz) this.trackExpose.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceMarketResourcePoolItemAdapter mFaceMarketResourcePoolItemAdapter_delegate$lambda$1(FaceMarketBasicTabItemViewHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new FaceMarketResourcePoolItemAdapter(this$0.showWatchFacePrice, new Function3<View, Integer, FaceData, Unit>() { // from class: com.xiaomi.fitness.watch.face.adapter.FaceMarketBasicTabItemViewHolder$mFaceMarketResourcePoolItemAdapter$2$1
            public void invoke(View p1, int position, FaceData data) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                Intrinsics.checkNotNullParameter(data, "data");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, FaceData faceData) {
                invoke(view, num.intValue(), faceData);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestRecyclerViewItemEffectiveExposeBiz trackExpose_delegate$lambda$0() {
        return new NestRecyclerViewItemEffectiveExposeBiz();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    public final void bindData(final int position, @NotNull final DeviceFaceMarketListItemWrapper data) {
        String string;
        Intrinsics.checkNotNullParameter(data, "data");
        this.source = position;
        if (data.getResourcePoolListItem() != null) {
            this.itemView.setTag(FaceOneTrackUtil.buildTrackContent$default(FaceOneTrackUtil.INSTANCE, getOperationText(data.getResourcePoolListItem().getKey()), "56.82.1.1.35072", null, 1.0f, 4, null));
            String name = data.getResourcePoolListItem().getName();
            if (name == null || name.length() == 0) {
                String key = data.getResourcePoolListItem().getKey();
                int iHashCode = key.hashCode();
                if (iHashCode != -1555880825) {
                    if (iHashCode != -962977778) {
                        if (iHashCode == 671121991 && key.equals(POOL_HOT)) {
                            string = ApplicationExtKt.getApplication().getString(p1j.j0);
                        } else {
                            string = "";
                        }
                    } else if (key.equals(POOL_NEW)) {
                        string = ApplicationExtKt.getApplication().getString(p1j.l0);
                    } else {
                        string = "";
                    }
                } else if (key.equals(EDITORS_PICKS)) {
                    string = ApplicationExtKt.getApplication().getString(p1j.k0);
                } else {
                    string = "";
                }
                Intrinsics.checkNotNull(string);
            } else {
                string = data.getResourcePoolListItem().getName();
            }
            this.name = string;
            this.binding.C.setText(string);
            this.binding.B.setOnClickListener(new View.OnClickListener() { // from class: p39
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceMarketBasicTabItemViewHolder.bindData$lambda$2(data, position, this, view);
                }
            });
            getMFaceMarketResourcePoolItemAdapter().setData(data.getResourcePoolListItem(), this.columnCount, this.source);
            NestRecyclerViewItemEffectiveExposeBiz trackExpose = getTrackExpose();
            NoTouchRecyclerView faceMarketBasicTabList = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(faceMarketBasicTabList, "faceMarketBasicTabList");
            NestRecyclerViewItemEffectiveExposeBiz.startTrackItemExpose$default(trackExpose, faceMarketBasicTabList, 0, null, 6, null);
        }
    }
}
