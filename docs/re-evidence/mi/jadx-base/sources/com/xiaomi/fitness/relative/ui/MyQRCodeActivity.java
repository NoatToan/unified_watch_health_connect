package com.xiaomi.fitness.relative.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.account.api.bean.QrInfo;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.ui.MyQRCodeActivity;
import com.xiaomi.fitness.relative.ui.util.RelativeCareUtil;
import com.xiaomi.fitness.widget.view.DividerView;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.t0j;
import defpackage.xfk;
import defpackage.xui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/MyQRCodeActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/relative/ui/RelativeCareViewModel;", "Lxfk;", "", Constants.KEY_REQUEST_DATA, "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MyQRCodeActivity extends Hilt_MyQRCodeActivity<RelativeCareViewModel, xfk> {

    @NotNull
    public static final String TAG = "MyQRCodeActivity";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(MyQRCodeActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestData();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        ((RelativeCareViewModel) getMViewModel()).getMyUserInfoLiveData().observe(this, new MyQRCodeActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xeg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MyQRCodeActivity.requestData$lambda$1(this.f39045a, (AccountCoreInfo) obj);
            }
        }));
        ((RelativeCareViewModel) getMViewModel()).getPersonalQrCodeLiveData().observe(this, new MyQRCodeActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yeg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MyQRCodeActivity.requestData$lambda$4(this.f40100a, (RelativeResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestData$lambda$1(MyQRCodeActivity this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (accountCoreInfo == null) {
            return Unit.INSTANCE;
        }
        RelativeCareUtil relativeCareUtil = RelativeCareUtil.INSTANCE;
        RoundImageView relativeAvatar = ((xfk) this$0.getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(relativeAvatar, "relativeAvatar");
        RelativeCareUtil.loadImageWithUrl$default(relativeCareUtil, relativeAvatar, accountCoreInfo.getAvatarAddress(), 0, 4, null);
        ((xfk) this$0.getMBinding()).I.setText(accountCoreInfo.getUserName());
        ((xfk) this$0.getMBinding()).J.setText(this$0.getString(t0j.y0, accountCoreInfo.getUserId()));
        DividerView horizontalDivider = ((xfk) this$0.getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(horizontalDivider, "horizontalDivider");
        ViewExtKt.visible(horizontalDivider);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestData$lambda$4(final MyQRCodeActivity this$0, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!relativeResult.isSuccess() || relativeResult.getData() == null) {
            Logger.i(TAG, "requestData getPersonalQrCodeLiveData failed errorCode=" + relativeResult.getErrorCode() + " errorMsg=" + relativeResult.getErrorMsg());
        } else {
            RelativeCareViewModel relativeCareViewModel = (RelativeCareViewModel) this$0.getMViewModel();
            Object data = relativeResult.getData();
            Intrinsics.checkNotNull(data);
            relativeCareViewModel.createMyQrCodeBitmap(((QrInfo) data).getQrCodeId(), new Function1() { // from class: zeg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MyQRCodeActivity.requestData$lambda$4$lambda$3(this.f41193a, (Bitmap) obj);
                }
            });
            Object data2 = relativeResult.getData();
            Intrinsics.checkNotNull(data2);
            Logger.d(TAG, "requestData getPersonalQrCodeLiveData succeeded. qrCodeId=" + ((QrInfo) data2).getQrCodeId());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$4$lambda$3(final MyQRCodeActivity this$0, final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ExecutorHelper.INSTANCE.runInMain(new Runnable() { // from class: veg
            @Override // java.lang.Runnable
            public final void run() {
                MyQRCodeActivity.requestData$lambda$4$lambda$3$lambda$2(this.f36803a, bitmap);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void requestData$lambda$4$lambda$3$lambda$2(MyQRCodeActivity this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        ((xfk) this$0.getMBinding()).F.setImageDrawable(new BitmapDrawable(this$0.getResources(), bitmap));
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return xui.f39483k;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.relative.ui.Hilt_MyQRCodeActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(t0j.c0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        RelativeCareUtil relativeCareUtil = RelativeCareUtil.INSTANCE;
        TextView noNetwork = ((xfk) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
        ConstraintLayout content = ((xfk) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        relativeCareUtil.handleUnavailableNetworkAndShowFallbackPageIfNeed(noNetwork, content, new Function0() { // from class: weg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MyQRCodeActivity.onResume$lambda$0(this.f37900a);
            }
        });
    }
}
