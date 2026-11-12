package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.entity.MifareTag;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.bean.InvokeBean;
import com.xiaomi.fitness.nfc.ui.CopyCardByDeviceFragment;
import defpackage.av6;
import defpackage.bg4;
import defpackage.h4b;
import defpackage.log;
import defpackage.ltg;
import defpackage.lxf;
import defpackage.o0j;
import defpackage.pli;
import defpackage.sui;
import defpackage.z5l;
import defpackage.zl3;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001)B\u0007¢\u0006\u0004\b(\u0010\u0017J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u0017J)\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u000fJ\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CopyCardByDeviceFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/CopyCardViewModel;", "Llog;", "", "getHtml", "()Ljava/lang/String;", "", "status", "", "beforeRead", "(I)V", "read", "", "isNeedCardInfo", "()Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "showNoticeDialog", "()V", "setListener", "navigatorInstallCard", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/miui/tsmclient/entity/MifareTag;", "mifareTag", "Lcom/miui/tsmclient/entity/MifareTag;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CopyCardByDeviceFragment extends BaseCardFragment<CopyCardViewModel, log> {
    public static final float HUAMI_PROGRESS_SCALE = 0.5f;
    private static final int sRequestCodeIssue = 10;

    @Nullable
    private MifareTag mifareTag;

    public CopyCardByDeviceFragment() {
        super(sui.K, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beforeRead(int status) {
        read(status);
    }

    private final String getHtml() {
        return "https://watch.iot.mi.com/html/door_card_support/index.html?locale=" + Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void read(int status) {
        ((log) getMBinding()).G.setVisibility(8);
        ((log) getMBinding()).I.setText(o0j.J4);
        ((log) getMBinding()).F.setVisibility(0);
        ((log) getMBinding()).C.setVisibility(0);
        String string = getString(o0j.L5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        showLoading(string, 0, false);
        ((CopyCardViewModel) getMViewModel()).readMifareTagByDevice(status, new Function1() { // from class: sk4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CopyCardByDeviceFragment.read$lambda$4(this.f33726a, (MifareTag) obj);
            }
        }, new Function1() { // from class: tk4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CopyCardByDeviceFragment.read$lambda$5(this.f34780a, (CardWrapper) obj);
            }
        }, new Function0() { // from class: uk4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CopyCardByDeviceFragment.read$lambda$6(this.f35859a);
            }
        }, new Function2() { // from class: vk4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CopyCardByDeviceFragment.read$lambda$7(this.f36970a, (String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit read$lambda$4(CopyCardByDeviceFragment this$0, MifareTag mifareTag) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mifareTag, "mifareTag");
        this$0.mifareTag = mifareTag;
        this$0.dismissDialogForce();
        ((log) this$0.getMBinding()).I.setText(o0j.t3);
        ((log) this$0.getMBinding()).C.setVisibility(4);
        ((log) this$0.getMBinding()).G.setText(o0j.u3);
        ((log) this$0.getMBinding()).G.setVisibility(0);
        ToastUtil.showLongToast(o0j.t3);
        this$0.navigatorInstallCard();
        TextView copyCardView = ((log) this$0.getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(copyCardView, "copyCardView");
        ExtUtilsKt.setVisible(copyCardView, false);
        TextView finishView = ((log) this$0.getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(finishView, "finishView");
        ExtUtilsKt.setVisible(finishView, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit read$lambda$5(CopyCardByDeviceFragment this$0, CardWrapper it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialogForce();
        ltg.c().t(0, 0, it);
        this$0.startActivityForResult(new Intent(this$0.getMActivity(), (Class<?>) IssueDoor3CardActivity.class), 10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit read$lambda$6(CopyCardByDeviceFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ltg.c().s(0, 2);
        this$0.dismissDialogForce();
        ((log) this$0.getMBinding()).I.setText(o0j.O5);
        ((log) this$0.getMBinding()).F.setVisibility(4);
        TextView copyCardView = ((log) this$0.getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(copyCardView, "copyCardView");
        ExtUtilsKt.setVisible(copyCardView, true);
        TextView finishView = ((log) this$0.getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(finishView, "finishView");
        ExtUtilsKt.setVisible(finishView, true);
        ((log) this$0.getMBinding()).C.setVisibility(0);
        ((log) this$0.getMBinding()).C.setText(o0j.P5);
        ((log) this$0.getMBinding()).G.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit read$lambda$7(CopyCardByDeviceFragment this$0, String msg, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        ltg.c().s(0, 2);
        this$0.dismissDialogForce();
        ((log) this$0.getMBinding()).F.setVisibility(4);
        TextView copyCardView = ((log) this$0.getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(copyCardView, "copyCardView");
        ExtUtilsKt.setVisible(copyCardView, false);
        TextView finishView = ((log) this$0.getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(finishView, "finishView");
        ExtUtilsKt.setVisible(finishView, false);
        ((log) this$0.getMBinding()).I.setText(msg);
        if (str == null) {
            ((log) this$0.getMBinding()).C.setVisibility(8);
        } else {
            ((log) this$0.getMBinding()).C.setText(str);
            ((log) this$0.getMBinding()).C.setVisibility(0);
        }
        ((log) this$0.getMBinding()).G.setText(o0j.z2);
        ((log) this$0.getMBinding()).G.setVisibility(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(CopyCardByDeviceFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.beforeRead(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(CopyCardByDeviceFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.beforeRead(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(CopyCardByDeviceFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    public final void navigatorInstallCard() {
        zl3.g().l(null);
        Intent intent = new Intent(getMActivity(), (Class<?>) IssuerActivity.class);
        MifareTag mifareTag = this.mifareTag;
        Intrinsics.checkNotNull(mifareTag);
        String uid = mifareTag.getUid();
        MifareTag mifareTag2 = this.mifareTag;
        Intrinsics.checkNotNull(mifareTag2);
        String atqa = mifareTag2.getAtqa();
        MifareTag mifareTag3 = this.mifareTag;
        Intrinsics.checkNotNull(mifareTag3);
        String sak = mifareTag3.getSak();
        MifareTag mifareTag4 = this.mifareTag;
        Intrinsics.checkNotNull(mifareTag4);
        String blockContent = mifareTag4.getBlockContent();
        MifareTag mifareTag5 = this.mifareTag;
        Intrinsics.checkNotNull(mifareTag5);
        InvokeBean invokeBean = new InvokeBean("99998-00001", uid, atqa, sak, blockContent, mifareTag5.getSize());
        ltg.c().u(0, 0, lxf.a(false));
        intent.putExtra(IssuerFragment.INSTANCE.getSInvokeJson(), h4b.c(invokeBean));
        startActivityForResult(intent, 10);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10) {
            if (resultCode != -1) {
                finish();
                return;
            }
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                mActivity.setResult(-1);
            }
            finish();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        ltg.c().h();
        return super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ViewGroup.LayoutParams layoutParams = ((log) getMBinding()).A.getLayoutParams();
        if (SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp())) {
            layoutParams.width = -1;
        } else {
            layoutParams.width = BaseFragmentExtKt.getDimensionPixelOffset(this, pli.d);
        }
        ((log) getMBinding()).A.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(o0j.f28617k);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        ((log) getMBinding()).D.show(wearableDeviceModel);
        ViewGroup.LayoutParams layoutParams = ((log) getMBinding()).A.getLayoutParams();
        if (SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp())) {
            layoutParams.width = -1;
        } else {
            layoutParams.width = BaseFragmentExtKt.getDimensionPixelOffset(this, pli.d);
        }
        ((log) getMBinding()).A.setLayoutParams(layoutParams);
        if (wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            ((log) getMBinding()).F.setScaleX(0.5f);
            ((log) getMBinding()).F.setScaleY(0.5f);
        }
        showNoticeDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        z5l.b(((log) getMBinding()).G, new bg4() { // from class: pk4
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CopyCardByDeviceFragment.setListener$lambda$1(this.f30482a, obj);
            }
        });
        z5l.b(((log) getMBinding()).B, new bg4() { // from class: qk4
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CopyCardByDeviceFragment.setListener$lambda$2(this.f31585a, obj);
            }
        });
        ((log) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: rk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CopyCardByDeviceFragment.setListener$lambda$3(this.f32627a, view);
            }
        });
    }

    public final void showNoticeDialog() {
        String string = getString(o0j.H1, getHtml());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        View viewInflate = requireActivity().getLayoutInflater().inflate(sui.m, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewInflate;
        textView.setText(com.xiaomi.fitness.nfc.hyperlink.a.b(string));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        CommonDialog commonDialogCreate = new CommonDialog.c("CopyCardByDeviceFragment.notice").setDialogTitle(o0j.B1).setCustomView(textView).setPositiveText(o0j.u2).setCancelable(false).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.CopyCardByDeviceFragment.showNoticeDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    CopyCardByDeviceFragment.this.beforeRead(0);
                }
            }
        });
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }
}
