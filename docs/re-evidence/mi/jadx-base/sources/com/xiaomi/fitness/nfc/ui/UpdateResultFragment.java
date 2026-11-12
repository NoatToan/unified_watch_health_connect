package com.xiaomi.fitness.nfc.ui;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.ui.UpdateResultFragment;
import com.xiaomi.fitness.nfc.ui.issued.MasterCardListFragment;
import com.xiaomi.fitness.nfc.utils.PageUtilsKt;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import defpackage.lqg;
import defpackage.o0j;
import defpackage.sui;
import defpackage.wni;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001f\u0010\u000fJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/UpdateResultFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/nfc/ui/UpgradePwdSecurityLvViewModel;", "Llqg;", "Landroid/os/Bundle;", "args", "", "setArguments", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "", "isSuccess", "Z", "", "from", "I", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class UpdateResultFragment extends BaseBindingFragment<UpgradePwdSecurityLvViewModel, lqg> {

    @NotNull
    public static final String sFrom = "sFrom";
    public static final int sFromUpdateMasterCard = 1;
    public static final int sFromUpdatePin = 0;

    @NotNull
    public static final String sIsSuccess = "sIsSuccess";
    private int from;
    private boolean isSuccess;

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jcq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UpdateResultFragment.mDeviceModel_delegate$lambda$0();
        }
    });

    private final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(UpdateResultFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isSuccess) {
            Intent intent = new Intent();
            FragmentActivity mActivity = this$0.getMActivity();
            Intrinsics.checkNotNull(mActivity);
            mActivity.setResult(-1, intent);
            FragmentActivity mActivity2 = this$0.getMActivity();
            Intrinsics.checkNotNull(mActivity2);
            mActivity2.finish();
            return;
        }
        if (this$0.from == 0) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("sIsMaster", true);
            FragmentActivity mActivity3 = this$0.getMActivity();
            Intrinsics.checkNotNull(mActivity3);
            PageUtilsKt.gotoPage(mActivity3, MasterCardListFragment.class, bundle);
            this$0.finish();
        } else {
            this$0.finish();
        }
        FragmentActivity mActivity4 = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity4);
        PageUtilsKt.gotoPage(mActivity4, MasterCardListFragment.class, null);
        this$0.finish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sui.l0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(o0j.D6);
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        if (DeviceModelExtKt.isHuaMi(mDeviceModel)) {
            getMBinding().F.setScaleX(0.5f);
            getMBinding().F.setScaleY(0.5f);
        }
        DeviceImageView deviceImageView = getMBinding().C;
        WearableDeviceModel mDeviceModel2 = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel2);
        deviceImageView.show(mDeviceModel2);
        int i3 = o0j.B2;
        int i4 = o0j.z6;
        int i5 = o0j.A6;
        int i6 = this.from;
        if (i6 != 0) {
            if (i6 == 1) {
                if (this.isSuccess) {
                    i = o0j.F6;
                    i2 = o0j.w6;
                } else {
                    i = o0j.E6;
                    i2 = o0j.z2;
                }
                int i7 = i2;
                i4 = i;
                i3 = i7;
                getMBinding().A.setVisibility(8);
            }
        } else if (!this.isSuccess) {
            i3 = o0j.z2;
            i4 = o0j.x6;
            i5 = o0j.y6;
        }
        getMBinding().D.setText(i3);
        getMBinding().E.setText(i4);
        getMBinding().A.setText(i5);
        if (this.isSuccess) {
            getMBinding().E.setTextColor(Color.parseColor("#7ED321"));
            getMBinding().F.setImageResource(wni.l);
        } else {
            getMBinding().E.setTextColor(Color.parseColor("#FF4747"));
            getMBinding().F.setImageResource(wni.f38163k);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            this.isSuccess = args.getBoolean(sIsSuccess);
            this.from = args.getInt(sFrom, 0);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        getMBinding().D.setOnClickListener(new View.OnClickListener() { // from class: icq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpdateResultFragment.setListener$lambda$1(this.f21005a, view);
            }
        });
    }
}
