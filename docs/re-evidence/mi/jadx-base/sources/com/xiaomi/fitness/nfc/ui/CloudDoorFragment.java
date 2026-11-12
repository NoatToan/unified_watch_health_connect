package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.CloudDoorFragment;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import defpackage.fog;
import defpackage.ltg;
import defpackage.o0j;
import defpackage.sui;
import defpackage.zl3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CloudDoorFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/CloudDoorViewModel;", "Lfog;", "", "bindView", "(Lfog;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "onBackPressed", "()Z", "<init>", "()V", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CloudDoorFragment extends BaseCardFragment<CloudDoorViewModel, fog> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int sRequestCodeIssue = 10;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CloudDoorFragment$Companion;", "", "<init>", "()V", "sRequestCodeIssue", "", "getSRequestCodeIssue", "()I", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSRequestCodeIssue() {
            return CloudDoorFragment.sRequestCodeIssue;
        }
    }

    public CloudDoorFragment() {
        super(sui.H, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$4(final CloudDoorFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = o0j.p2;
        int i2 = o0j.a0;
        int i3 = o0j.e;
        FragmentManager parentFragmentManager = this$0.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showMsgDialog(i, i2, i3, parentFragmentManager, o0j.d, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: f24
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CloudDoorFragment.bindView$lambda$4$lambda$2(this.f17323a, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: g24
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CloudDoorFragment.bindView$lambda$4$lambda$3((DialogInterface) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$4$lambda$2(final CloudDoorFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading(o0j.Z2, false);
        CloudDoorViewModel cloudDoorViewModel = (CloudDoorViewModel) this$0.getMViewModel();
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        cloudDoorViewModel.removeBackupCloudCard(cardWrapper, new Function0() { // from class: j24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CloudDoorFragment.bindView$lambda$4$lambda$2$lambda$0(this.f22346a);
            }
        }, new Function1() { // from class: k24
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CloudDoorFragment.bindView$lambda$4$lambda$2$lambda$1(this.f23354a, (String) obj);
            }
        });
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$2$lambda$0(CloudDoorFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1);
        }
        this$0.finish();
        ToastUtil.showShortToast(o0j.i3);
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$2$lambda$1(CloudDoorFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastUtil.showLongToast(str);
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$3(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$5(CloudDoorFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.setResult(1);
        }
        ltg.c().s(0, 0);
        zl3.g().l(this$0.getCardWrapper());
        this$0.startActivityForResult(new Intent(this$0.getMActivity(), (Class<?>) IssuerActivity.class), sRequestCodeIssue);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull fog fogVar) {
        Intrinsics.checkNotNullParameter(fogVar, "<this>");
        CardWrapper cardWrapper = getCardWrapper();
        setTitle(cardWrapper != null ? cardWrapper.mCardName : null);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        fogVar.B.show(wearableDeviceModel);
        fogVar.A.show(wearableDeviceModel, getCardWrapper());
        fogVar.E.setOnClickListener(new View.OnClickListener() { // from class: h24
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloudDoorFragment.bindView$lambda$4(this.f19599a, view);
            }
        });
        fogVar.C.setOnClickListener(new View.OnClickListener() { // from class: i24
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloudDoorFragment.bindView$lambda$5(this.f20686a, view);
            }
        });
        CardWrapper cardWrapper2 = getCardWrapper();
        if (cardWrapper2 != null) {
            if (cardWrapper2.isDownloadable) {
                fogVar.C.setVisibility(0);
            } else {
                fogVar.C.setVisibility(8);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == sRequestCodeIssue && resultCode == -1) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                mActivity.setResult(-1);
            }
            finish();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        finish();
        return super.onBackPressed();
    }
}
