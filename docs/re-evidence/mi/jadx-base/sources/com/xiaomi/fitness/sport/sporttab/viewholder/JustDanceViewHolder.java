package com.xiaomi.fitness.sport.sporttab.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.sport.extension.DeviceModelExtKt;
import com.xiaomi.fitness.sport.sporttab.viewholder.JustDanceViewHolder;
import com.xiaomi.fitness.sport_export.IJustDanceApi;
import com.xiaomi.fitness.sport_export.JustDanceExtKt;
import defpackage.eoi;
import defpackage.xri;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/viewholder/JustDanceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "shouldSupportJustDance", "()Z", "", "bindData", "()V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "emptyHolder", "Landroid/widget/ImageView;", "imgIv", "Landroid/widget/ImageView;", "<init>", "(Landroid/view/View;)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nJustDanceViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JustDanceViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/JustDanceViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,71:1\n54#2,3:72\n24#2:75\n59#2,6:76\n*S KotlinDebug\n*F\n+ 1 JustDanceViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/JustDanceViewHolder\n*L\n48#1:72,3\n48#1:75\n48#1:76,6\n*E\n"})
public final class JustDanceViewHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "BannerItemViewHolder";

    @NotNull
    private final ConstraintLayout container;

    @NotNull
    private final View emptyHolder;

    @NotNull
    private final ImageView imgIv;

    @NotNull
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JustDanceViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        View viewFindViewById = view.findViewById(xri.o0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.container = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(xri.B1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.emptyHolder = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(xri.z2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.imgIv = (ImageView) viewFindViewById3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindData$lambda$1(JustDanceViewHolder this$0, ConstraintLayout it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IJustDanceApi justDanceExtKt = JustDanceExtKt.getInstance(IJustDanceApi.INSTANCE);
        Context context = this$0.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        justDanceExtKt.gotoLaunchActivity(context);
        return Unit.INSTANCE;
    }

    private final boolean shouldSupportJustDance() {
        if (AppUtil.INSTANCE.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            return false;
        }
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel != null && DeviceModelExtKt.supportJustDance(wearableDeviceModel)) {
            return true;
        }
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) CollectionsKt___CollectionsKt.firstOrNull((List) DeviceManagerExtKt.getInstance(companion).getAccessoryDeviceModels());
        if (wearableDeviceModel2 == null) {
            return false;
        }
        return DeviceModelExtKt.supportJustDance(wearableDeviceModel2);
    }

    public final void bindData() {
        if (!shouldSupportJustDance()) {
            ViewExtKt.gone(this.container);
            ViewExtKt.visible(this.emptyHolder);
            return;
        }
        ViewExtKt.visible(this.container);
        ViewExtKt.gone(this.emptyHolder);
        int screenState = UIUtils.INSTANCE.getScreenState();
        int i = (screenState == 0 || screenState == 1 || screenState == 2) ? eoi.F1 : eoi.E1;
        ImageView imageView = this.imgIv;
        Integer numValueOf = Integer.valueOf(i);
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(numValueOf).target(imageView);
        builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(Float.valueOf(16.0f))));
        imageLoader.enqueue(builderTarget.build());
        ViewExtKt.clickWithTrigger$default(this.container, 0L, new Function1() { // from class: bzd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return JustDanceViewHolder.bindData$lambda$1(this.f4745a, (ConstraintLayout) obj);
            }
        }, 1, null);
    }

    @NotNull
    public final View getView() {
        return this.view;
    }
}
