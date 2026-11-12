package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Intent;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.ReIssueMasterCardFragment;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.fitness.nfc.widget.CardImageView;
import defpackage.lpg;
import defpackage.sui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/ReIssueMasterCardFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/ReissueMasterCardViewModel;", "Llpg;", "", "update", "()V", "bindView", "(Llpg;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nReIssueMasterCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReIssueMasterCardFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/ReIssueMasterCardFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,60:1\n54#2,3:61\n24#2:64\n59#2,6:65\n*S KotlinDebug\n*F\n+ 1 ReIssueMasterCardFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/ReIssueMasterCardFragment\n*L\n37#1:61,3\n37#1:64\n37#1:65,6\n*E\n"})
public final class ReIssueMasterCardFragment extends BaseCardFragment<ReissueMasterCardViewModel, lpg> {
    public static final int sRequestFail = 10;

    public ReIssueMasterCardFragment() {
        super(sui.X, 0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void update() {
        showLoading();
        ReissueMasterCardViewModel reissueMasterCardViewModel = (ReissueMasterCardViewModel) getMViewModel();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        reissueMasterCardViewModel.update(cardWrapper, new Function1() { // from class: icj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ReIssueMasterCardFragment.update$lambda$2(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit update$lambda$2(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull lpg lpgVar) {
        Intrinsics.checkNotNullParameter(lpgVar, "<this>");
        setTitle(NfcUtils.INSTANCE.payName());
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            ((lpg) getMBinding()).C.setScaleX(0.5f);
            ((lpg) getMBinding()).C.setScaleY(0.5f);
        }
        lpgVar.B.show(wearableDeviceModel);
        CardImageView cardView = lpgVar.A;
        Intrinsics.checkNotNullExpressionValue(cardView, "cardView");
        CardWrapper cardWrapper = getCardWrapper();
        String cardFace = cardWrapper != null ? cardWrapper.getCardFace() : null;
        ImageLoader imageLoader = Coil.imageLoader(cardView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(cardView.getContext()).data(cardFace).target(cardView);
        builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(Float.valueOf(16.0f))));
        imageLoader.enqueue(builderTarget.build());
        update();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10) {
            if (resultCode == -1) {
                update();
            } else {
                finish();
            }
        }
    }
}
