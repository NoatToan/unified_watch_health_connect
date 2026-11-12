package com.xiaomi.fitness.device.manager.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.ui.widget.DeviceImgView;
import defpackage.ini;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/widget/DeviceImgView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "show", "", "productId", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceImgView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceImgView.kt\ncom/xiaomi/fitness/device/manager/ui/widget/DeviceImgView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,28:1\n54#2,3:29\n24#2:32\n59#2,6:33\n*S KotlinDebug\n*F\n+ 1 DeviceImgView.kt\ncom/xiaomi/fitness/device/manager/ui/widget/DeviceImgView\n*L\n21#1:29,3\n21#1:32\n21#1:33,6\n*E\n"})
public final class DeviceImgView extends AppCompatImageView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public DeviceImgView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean show$lambda$0(int i, WearableProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getProductId() == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void show(final int productId) {
        WearableProduct wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: t56
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(DeviceImgView.show$lambda$0(productId, (WearableProduct) obj));
            }
        });
        if (wearableProduct != null) {
            String bigIcon3 = wearableProduct.getBigIcon3() != null ? wearableProduct.getBigIcon3() : wearableProduct.getBigIcon();
            ImageLoader imageLoader = Coil.imageLoader(getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(getContext()).data(bigIcon3).target(this);
            builderTarget.placeholder(ini.f21321a);
            imageLoader.enqueue(builderTarget.build());
        }
    }

    public /* synthetic */ DeviceImgView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceImgView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
