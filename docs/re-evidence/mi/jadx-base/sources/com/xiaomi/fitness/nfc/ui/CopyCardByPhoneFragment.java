package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.util.Constants;
import com.tsmclient.smartcard.handler.SmartCardReader;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.InvokeBean;
import com.xiaomi.fitness.nfc.ui.CopyCardByPhoneFragment;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.emg;
import defpackage.h4b;
import defpackage.ltg;
import defpackage.lxf;
import defpackage.nog;
import defpackage.o0j;
import defpackage.sui;
import defpackage.vqg;
import defpackage.zl3;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B\u0007¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0006J\u0019\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0006J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0006J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0006J)\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CopyCardByPhoneFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/CopyCardViewModel;", "Lnog;", "", "startPoll", "()V", "stopPoll", "", "getHtml", "()Ljava/lang/String;", "", "isNeedCardInfo", "()Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", LifecycleConstantKt.ON_RESUME, SdkContants.KEY_BUNDLE, "onNewIntent", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_PAUSE, "navigatorInstallCard", "showNoticeDialog", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/tsmclient/smartcard/handler/SmartCardReader;", "mSmartCardReader", "Lcom/tsmclient/smartcard/handler/SmartCardReader;", "getMSmartCardReader", "()Lcom/tsmclient/smartcard/handler/SmartCardReader;", "setMSmartCardReader", "(Lcom/tsmclient/smartcard/handler/SmartCardReader;)V", "Lcom/miui/tsmclient/entity/MifareTag;", "mMifareTag", "Lcom/miui/tsmclient/entity/MifareTag;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CopyCardByPhoneFragment extends BaseCardFragment<CopyCardViewModel, nog> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int sRequestCodeIssue = 10;

    @Nullable
    private MifareTag mMifareTag;
    public SmartCardReader mSmartCardReader;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CopyCardByPhoneFragment$Companion;", "", "<init>", "()V", "sRequestCodeIssue", "", "getSRequestCodeIssue", "()I", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSRequestCodeIssue() {
            return CopyCardByPhoneFragment.sRequestCodeIssue;
        }
    }

    public CopyCardByPhoneFragment() {
        super(sui.L, 0, true);
    }

    private final String getHtml() {
        return "https://watch.iot.mi.com/html/door_card_support/index.html?locale=" + Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNewIntent$lambda$1(CopyCardByPhoneFragment this$0, MifareTag mifareTag) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mifareTag, "mifareTag");
        this$0.mMifareTag = mifareTag;
        this$0.hideLoading();
        this$0.stopPoll();
        this$0.navigatorInstallCard();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNewIntent$lambda$2(CopyCardByPhoneFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.hideLoading();
        ToastUtil.showShortToast(msg);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onNewIntent$lambda$7(final CopyCardByPhoneFragment this$0, final MifareTag mifareTag) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mifareTag, "mifareTag");
        vqg.b("CopyCardByPhoneFragment onNewIntent mifareTag callback");
        this$0.hideLoading();
        try {
            this$0.stopPoll();
        } catch (Exception e) {
            vqg.c("CopyCardByPhoneFragment onNewIntent stopPoll", e);
        }
        ((nog) this$0.getMBinding()).A.setVisibility(8);
        ((nog) this$0.getMBinding()).F.setVisibility(0);
        ((nog) this$0.getMBinding()).G.setVisibility(0);
        ((nog) this$0.getMBinding()).I.setVisibility(0);
        ((nog) this$0.getMBinding()).J.setVisibility(8);
        ((nog) this$0.getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: wk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CopyCardByPhoneFragment.onNewIntent$lambda$7$lambda$3(this.f38052a, view);
            }
        });
        ((nog) this$0.getMBinding()).I.setOnClickListener(new View.OnClickListener() { // from class: xk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CopyCardByPhoneFragment.onNewIntent$lambda$7$lambda$6(this.f39209a, mifareTag, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNewIntent$lambda$7$lambda$3(CopyCardByPhoneFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onNewIntent$lambda$7$lambda$6(final CopyCardByPhoneFragment this$0, final MifareTag mifareTag, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mifareTag, "$mifareTag");
        this$0.showLoading();
        CopyCardViewModel copyCardViewModel = (CopyCardViewModel) this$0.getMViewModel();
        String uid = mifareTag.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        copyCardViewModel.checkMifareIssued(uid, new Function0() { // from class: cl4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CopyCardByPhoneFragment.onNewIntent$lambda$7$lambda$6$lambda$4(this.f5446a, mifareTag);
            }
        }, new Function1() { // from class: dl4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CopyCardByPhoneFragment.onNewIntent$lambda$7$lambda$6$lambda$5(this.f15647a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNewIntent$lambda$7$lambda$6$lambda$4(CopyCardByPhoneFragment this$0, MifareTag mifareTag) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mifareTag, "$mifareTag");
        this$0.hideLoading();
        this$0.mMifareTag = mifareTag;
        this$0.navigatorInstallCard();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNewIntent$lambda$7$lambda$6$lambda$5(CopyCardByPhoneFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        ToastUtil.showToast(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(CopyCardByPhoneFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String strA = emg.a();
        Intrinsics.checkNotNullExpressionValue(strA, "doorCardSupport(...)");
        WebViewUtilKt.startWebView$default(strA, this$0.getString(o0j.j3), false, false, null, false, null, false, 252, null);
    }

    private final void startPoll() {
        if (getMSmartCardReader() != null) {
            getMSmartCardReader().startPoll();
        }
    }

    private final void stopPoll() {
        if (getMSmartCardReader() == null || !getMSmartCardReader().isCardPolling()) {
            return;
        }
        getMSmartCardReader().stopPoll();
    }

    @NotNull
    public final SmartCardReader getMSmartCardReader() {
        SmartCardReader smartCardReader = this.mSmartCardReader;
        if (smartCardReader != null) {
            return smartCardReader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSmartCardReader");
        return null;
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    public final void navigatorInstallCard() {
        zl3.g().l(null);
        Intent intent = new Intent(getMActivity(), (Class<?>) IssuerActivity.class);
        MifareTag mifareTag = this.mMifareTag;
        Intrinsics.checkNotNull(mifareTag);
        String uid = mifareTag.getUid();
        MifareTag mifareTag2 = this.mMifareTag;
        Intrinsics.checkNotNull(mifareTag2);
        String atqa = mifareTag2.getAtqa();
        MifareTag mifareTag3 = this.mMifareTag;
        Intrinsics.checkNotNull(mifareTag3);
        String sak = mifareTag3.getSak();
        MifareTag mifareTag4 = this.mMifareTag;
        Intrinsics.checkNotNull(mifareTag4);
        String blockContent = mifareTag4.getBlockContent();
        MifareTag mifareTag5 = this.mMifareTag;
        Intrinsics.checkNotNull(mifareTag5);
        InvokeBean invokeBean = new InvokeBean("99998-00001", uid, atqa, sak, blockContent, mifareTag5.getSize());
        ltg.c().u(0, 0, lxf.a(false));
        intent.putExtra(IssuerFragment.INSTANCE.getSInvokeJson(), h4b.c(invokeBean));
        startActivityForResult(intent, sRequestCodeIssue);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == sRequestCodeIssue) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        Tag tag = bundle != null ? (Tag) bundle.getParcelable("android.nfc.extra.TAG") : null;
        if (tag == null) {
            vqg.d("CopyCardByPhoneFragment  tag is null");
        } else {
            showLoading();
            ((CopyCardViewModel) getMViewModel()).parsePhoneTag(tag, new Function1() { // from class: zk4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CopyCardByPhoneFragment.onNewIntent$lambda$1(this.f41395a, (MifareTag) obj);
                }
            }, new Function1() { // from class: al4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CopyCardByPhoneFragment.onNewIntent$lambda$2(this.f1158a, (String) obj);
                }
            }, new Function1() { // from class: bl4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CopyCardByPhoneFragment.onNewIntent$lambda$7(this.f4329a, (MifareTag) obj);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        stopPoll();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(AppUtil.getApp());
        if (defaultAdapter != null && defaultAdapter.isEnabled()) {
            startPoll();
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("CopyCardByPhoneFragment.nfcAdapter.notEnable").setDialogTitle(o0j.p2).setDialogDescription(o0j.F4).setPositiveText(o0j.u2).setCancelable(false).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.CopyCardByPhoneFragment.onResume.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    CopyCardByPhoneFragment.this.finish();
                    return;
                }
                if (which != -1) {
                    return;
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
                FragmentActivity mActivity = CopyCardByPhoneFragment.this.getMActivity();
                Intrinsics.checkNotNull(mActivity);
                mActivity.startActivity(new Intent(Constants.INTENT_ACTION_NFC_SETTINGS));
            }
        });
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(o0j.f28617k);
        setMSmartCardReader(new SmartCardReader(getMActivity()));
        showNoticeDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((nog) getMBinding()).K.setOnClickListener(new View.OnClickListener() { // from class: yk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CopyCardByPhoneFragment.setListener$lambda$0(this.f40260a, view);
            }
        });
    }

    public final void setMSmartCardReader(@NotNull SmartCardReader smartCardReader) {
        Intrinsics.checkNotNullParameter(smartCardReader, "<set-?>");
        this.mSmartCardReader = smartCardReader;
    }

    public final void showNoticeDialog() {
        String string = getString(o0j.H1, getHtml());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        View viewInflate = requireActivity().getLayoutInflater().inflate(sui.m, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewInflate;
        textView.setText(com.xiaomi.fitness.nfc.hyperlink.a.b(string));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setContentDescription(getString(o0j.I1));
        CommonDialog commonDialogCreate = new CommonDialog.c("CopyCardByPhoneFragment.notice").setDialogTitle(o0j.B1).setCustomView(textView).setPositiveText(o0j.u2).setCancelable(false).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.CopyCardByPhoneFragment.showNoticeDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -1 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        });
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }
}
