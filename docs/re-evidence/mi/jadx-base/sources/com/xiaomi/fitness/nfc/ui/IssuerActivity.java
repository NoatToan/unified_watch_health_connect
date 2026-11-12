package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.IssuerActivity;
import com.xiaomi.fitness.nfc.ui.issued.CardRenameFragment;
import com.xiaomi.fitness.nfc.ui.issued.DoorCardDetailFragment;
import com.xiaomi.fitness.nfc.utils.PageUtilsKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.lxf;
import defpackage.o0j;
import defpackage.rji;
import defpackage.s3q;
import defpackage.sui;
import defpackage.vlg;
import defpackage.vqg;
import defpackage.w8q;
import defpackage.zl3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001>B\u0007¢\u0006\u0004\b=\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b \u0010\u001fJ)\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\u0004H\u0014¢\u0006\u0004\b'\u0010\u0006R\u0018\u0010(\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R \u0010/\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/IssuerActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/nfc/ui/IssuerViewModel;", "Lvlg;", "", "issuerCard", "()V", "", "productId", "openPrivateCard", "(Ljava/lang/String;)V", "findMierCard", "", "doIssue", "()Z", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "code", "msg", "setResult", "(ILjava/lang/String;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "checkIssueProtocol", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;)V", "startIssueCard", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", LifecycleConstantKt.ON_DESTROY, "mToken", "Ljava/lang/String;", "mProductId", "mSourceChannel", "mResultIntent", "Landroid/content/Intent;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "mFragment", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "mAccountManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "getMAccountManager", "()Lcom/xiaomi/fitness/account/manager/AccountManager;", "setMAccountManager", "(Lcom/xiaomi/fitness/account/manager/AccountManager;)V", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class IssuerActivity extends Hilt_IssuerActivity<IssuerViewModel, vlg> {
    public static final int CODE_FAIL_ERR = 10;
    public static final int CODE_FAIL_NO_AGREE = 7;
    public static final int CODE_FAIL_NO_BLUETOOTH = 4;
    public static final int CODE_FAIL_NO_CONNECT = 5;
    public static final int CODE_FAIL_NO_DEVICE = 2;
    public static final int CODE_FAIL_NO_LOGIN = 8;
    public static final int CODE_FAIL_NO_SELECT = 3;
    public static final int CODE_FAIL_NO_SUPPORT = 9;
    public static final int CODE_FAIL_NO_UNKNOW = 6;
    public static final int CODE_FAIL_PARAM = 1;
    public static final int CODE_SUCCESS = 0;

    @NotNull
    public static final String KEY_ACTION = "action";

    @NotNull
    public static final String KEY_DID = "did";

    @NotNull
    public static final String KEY_MODEL_ALIAS = "model";

    @NotNull
    public static final String KEY_NEED_CONFIRM = "need_confirm";

    @NotNull
    public static final String KEY_PASS_THROUGH = "pass_through";

    @NotNull
    public static final String KEY_PRODUCT_ID = "product_id";

    @NotNull
    public static final String KEY_PROTO_TYPE = "proto_type";

    @NotNull
    public static final String KEY_SHARE_URL = "relay_server";

    @NotNull
    public static final String KEY_SOURCE_CHANNEL = "source_channel";

    @NotNull
    public static final String KEY_TOKEN = "token";

    @NotNull
    public static final String KEY_TYPE = "type";

    @NotNull
    public static final String KINGSOFT = "Kingsoft";

    @NotNull
    public static final String MIER = "MiEr";

    @NotNull
    public static final String MIHOME = "MiHome";
    public AccountManager mAccountManager;

    @Nullable
    private BaseCardFragment<?, ?> mFragment;

    @Nullable
    private String mProductId;

    @Nullable
    private Intent mResultIntent;

    @Nullable
    private String mSourceChannel;

    @Nullable
    private String mToken;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean doIssue() {
        if (Intrinsics.areEqual(this.mSourceChannel, MIER)) {
            MifareCardInfo mifareCardInfo = new MifareCardInfo();
            mifareCardInfo.mMifareCardType = 2;
            mifareCardInfo.mCardName = getString(o0j.s3);
            mifareCardInfo.mCardArt = "http://cdn.cnbj1.fds.api.mi-img.com/door-card-img/xiaomi_staff_card/xiaomi_staff_card_art_new.png";
            mifareCardInfo.setProductId("59012-40001");
            checkIssueProtocol(new CardWrapper(CardCategory.DOOR, mifareCardInfo));
            return true;
        }
        if (!Intrinsics.areEqual(this.mSourceChannel, KINGSOFT)) {
            String str = Intrinsics.areEqual("MiHome", this.mSourceChannel) ? "66666-00211" : "00000-00001";
            String string = getString(o0j.H2);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            PageState.DefaultImpls.showLoading$default(this, string, 0, false, 6, null);
            ((IssuerViewModel) getMViewModel()).findSeCardBydProductId(str, new Function1() { // from class: eld
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IssuerActivity.doIssue$lambda$4(this.f16771a, (CardWrapper) obj);
                }
            }, new Function1() { // from class: fld
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IssuerActivity.doIssue$lambda$5(this.f17895a, (String) obj);
                }
            });
            return false;
        }
        MifareCardInfo mifareCardInfo2 = new MifareCardInfo();
        mifareCardInfo2.mMifareCardType = 2;
        mifareCardInfo2.mCardName = getString(o0j.q3);
        mifareCardInfo2.mCardArt = lxf.b();
        mifareCardInfo2.setProductId("59013-40002");
        checkIssueProtocol(new CardWrapper(CardCategory.DOOR, mifareCardInfo2));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doIssue$lambda$4(IssuerActivity this$0, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (cardWrapper == null) {
            ToastUtil.showLongToast(o0j.f5);
            return Unit.INSTANCE;
        }
        this$0.checkIssueProtocol(cardWrapper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doIssue$lambda$5(IssuerActivity this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.hideLoading();
        ToastUtil.showShortToast(o0j.f5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void findMierCard() {
        PageState.DefaultImpls.showLoading$default(this, o0j.Z3, false, 2, null);
        ((IssuerViewModel) getMViewModel()).findMiCard(StringsKt__StringsJVMKt.equals(MIER, this.mSourceChannel, true) ? "59012-40001" : "59013-40002", new Function1() { // from class: gld
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerActivity.findMierCard$lambda$2(this.f19103a, (CardWrapper) obj);
            }
        }, new Function0() { // from class: hld
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IssuerActivity.findMierCard$lambda$3(this.f20211a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findMierCard$lambda$2(final IssuerActivity this$0, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        if (cardWrapper == null) {
            CommonDialog commonDialogCreate = new CommonDialog.c("IssuerActivity.notfound.mi").setDialogTitle(o0j.p2).setDialogDescription(o0j.A7).setPositiveText(o0j.x2).create();
            Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.IssuerActivity$findMierCard$1$1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (which == -1) {
                        MainExtKt.showMainActivity$default(this.this$0, null, null, 6, null);
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
            commonDialogCreate.showIfNeed(this$0.getSupportFragmentManager());
        } else {
            zl3.g().l(cardWrapper);
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_DELETE", true);
            PageUtilsKt.gotoPage(this$0, DoorCardDetailFragment.class, bundle);
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findMierCard$lambda$3(final IssuerActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        CommonDialog commonDialogCreate = new CommonDialog.c("IssuerActivity.error.mi").setDialogTitle(o0j.p2).setDialogDescription(o0j.common_load_fail).setNegativeText(o0j.j2).setPositiveText(o0j.z2).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.IssuerActivity$findMierCard$2$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    this.this$0.finish();
                } else if (which == -1) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    this.this$0.findMierCard();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(this$0.getSupportFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0127, code lost:
    
        r2 = new kotlin.jvm.internal.Ref.ObjectRef();
        r2.element = r0.getQueryParameter(com.xiaomi.fitness.nfc.ui.IssuerActivity.KEY_SHARE_URL);
        r4 = new kotlin.jvm.internal.Ref.ObjectRef();
        r4.element = r0.getQueryParameter(com.xiaomi.fitness.nfc.ui.IssuerActivity.KEY_NEED_CONFIRM);
        r8.setCarShareUrl((java.lang.String) r2.element);
        r8.setOnPrepareListener(new com.xiaomi.fitness.nfc.ui.IssuerActivity.AnonymousClass3());
        defpackage.w8q.b(r11, r11.mFragment, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void issuerCard() {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.nfc.ui.IssuerActivity.issuerCard():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(View view, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void openPrivateCard(String productId) {
        PageState.DefaultImpls.showLoading$default(this, o0j.Z3, false, 2, null);
        ((IssuerViewModel) getMViewModel()).findPrivateSeCard(productId, new Function1() { // from class: jld
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IssuerActivity.openPrivateCard$lambda$1(this.f22906a, (CardWrapper) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openPrivateCard$lambda$1(IssuerActivity this$0, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        if (cardWrapper == null) {
            this$0.setResult(6, "find secard by productId is null, check productId is correct");
            this$0.finish();
            return Unit.INSTANCE;
        }
        zl3.g().l(cardWrapper);
        this$0.mFragment = new IssuerFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(CardRenameFragment.INSTANCE.getSIsFromOurApp(), false);
        bundle.putString(IssuerFragment.INSTANCE.getSToken(), this$0.mToken);
        BaseCardFragment<?, ?> baseCardFragment = this$0.mFragment;
        if (baseCardFragment != null) {
            baseCardFragment.setArguments(bundle);
        }
        w8q.b(this$0, this$0.mFragment, false);
        return Unit.INSTANCE;
    }

    public final void checkIssueProtocol(@NotNull CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        startIssueCard(cardWrapper);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sui.c;
    }

    @NotNull
    public final AccountManager getMAccountManager() {
        AccountManager accountManager = this.mAccountManager;
        if (accountManager != null) {
            return accountManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountManager");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        BaseCardFragment<?, ?> baseCardFragment = this.mFragment;
        if (baseCardFragment != null) {
            baseCardFragment.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        BaseCardFragment<?, ?> baseCardFragment = this.mFragment;
        if (baseCardFragment == null) {
            setResult(0);
            super.lambda$onCreate$0();
        } else if (baseCardFragment != null) {
            baseCardFragment.onBackPressed();
        }
    }

    @Override // com.xiaomi.fitness.nfc.ui.Hilt_IssuerActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        hideBack();
        Configuration configuration = getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
        onConfigurationChanged(configuration);
        s3q.f0().t0((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel());
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.getBoolean("sIsMaster")) {
            issuerCard();
            return;
        }
        String stringExtra = getIntent().getStringExtra(Cvn2Fragment.sProcolUrl);
        if (stringExtra == null) {
            stringExtra = "";
        }
        new CommonDialog.c("commonDialog").setDialogTitle(o0j.F5).setNegativeText(o0j.d).setPositiveText(o0j.e).setCanceledOnBackPressed(false).setDialogDescriptionString(new DialogParams.DialogDescriptionString(LinkSpanHelper.b(this, getString(o0j.R2, stringExtra), Integer.valueOf(rji.o), new LinkSpanHelper.a() { // from class: ild
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                IssuerActivity.onCreate$lambda$0(view, str);
            }
        }))).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.IssuerActivity.onCreate.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    IssuerActivity.this.finish();
                    if (dialog != null) {
                        dialog.dismiss();
                        return;
                    }
                    return;
                }
                if (which != -1) {
                    return;
                }
                IssuerActivity.this.issuerCard();
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.nfc.ui.Hilt_IssuerActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        vqg.b("IssuerActivity  onDestroy");
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        vqg.b("IssuerActivity  onNewIntent");
    }

    public final void setMAccountManager(@NotNull AccountManager accountManager) {
        Intrinsics.checkNotNullParameter(accountManager, "<set-?>");
        this.mAccountManager = accountManager;
    }

    public final void setResult(int code, @Nullable String msg) {
        Intent intent = this.mResultIntent;
        Intrinsics.checkNotNull(intent);
        intent.putExtra("code", code);
        Intent intent2 = this.mResultIntent;
        Intrinsics.checkNotNull(intent2);
        intent2.putExtra("msg", msg);
        setResult(-1, this.mResultIntent);
        finish();
    }

    public final void startIssueCard(@NotNull CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        zl3.g().l(cardWrapper);
        this.mFragment = new IssuerFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(CardRenameFragment.INSTANCE.getSIsFromOurApp(), false);
        bundle.putString(Constants.EXTRA_DOOR_CARD_PRODUCT_ID, this.mProductId);
        bundle.putString(KEY_SOURCE_CHANNEL, this.mSourceChannel);
        if (!TextUtils.isEmpty(this.mToken)) {
            if (Intrinsics.areEqual(this.mSourceChannel, KINGSOFT)) {
                String str = this.mToken;
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                this.mToken = str + (wearableDeviceModel != null ? wearableDeviceModel.getDid() : null);
            }
            bundle.putString(Constants.EXTRA_MIFARE_DOOR_CARD_ISSUER_TOKEN, this.mToken);
        }
        BaseCardFragment<?, ?> baseCardFragment = this.mFragment;
        if (baseCardFragment != null) {
            baseCardFragment.setArguments(bundle);
        }
        w8q.b(this, this.mFragment, false);
    }
}
