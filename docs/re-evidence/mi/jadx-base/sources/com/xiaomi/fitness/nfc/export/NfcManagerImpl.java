package com.xiaomi.fitness.nfc.export;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.export.NfcManagerImpl;
import com.xiaomi.fitness.nfc.feijie.FeijieUtils;
import com.xiaomi.fitness.nfc.request.NfcRequest;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.ui.CardManagerActivity;
import com.xiaomi.fitness.nfc.ui.IssuerActivity;
import com.xiaomi.fitness.nfc.ui.RechargeActivity;
import com.xiaomi.fitness.nfc.ui.UpgradePwdSecurityLevelFragment;
import com.xiaomi.fitness.nfc.ui.debug.SMXCardReaderActivity;
import com.xiaomi.fitness.nfc.ui.issued.BankCardDetailFragment;
import com.xiaomi.fitness.nfc.ui.issued.MasterCardListFragment;
import com.xiaomi.fitness.nfc.ui.issued.MasterTranslationFragment;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.ltg;
import defpackage.o0j;
import defpackage.rvf;
import defpackage.s3q;
import defpackage.ssg;
import defpackage.vqg;
import defpackage.zl3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0012H\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\b\u0010!\u001a\u00020\u0014H\u0016J\u001c\u0010\"\u001a\u00020\u00052\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050#H\u0016J\u001c\u0010$\u001a\u00020\u00052\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050#H\u0016J\b\u0010&\u001a\u00020\tH\u0016J\b\u0010'\u001a\u00020\tH\u0016J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010*\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0014H\u0016J\u0018\u0010,\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u0014H\u0016J \u0010.\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u0014H\u0016¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/nfc/export/NfcManagerImpl;", "Lcom/xiaomi/fitness/nfc/export/NfcManager;", "<init>", "()V", "gotoCardManagerPage", "", "context", "Landroid/content/Context;", "isDeleteMier", "", "gotoIssueActivity", "gotoRechargeActivity", "gotoIssueActivityByUri", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "gotoMasterListPage", "gotoUpgradePinPage", "getMasterSize", "", "getCplc", "", "isShowCard", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "openFeiJie", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "openSXMCardReader", "Landroid/app/Activity;", "loadMasterRegionList", "setEnv", "env", "getEnv", "getSpName", "pinStatus", "Lkotlin/Function1;", "checkCRSStatus", "crsStatus", "mipayPrepare", "mipayClearSE", "gotoBankCardDetailPage", "gotoBankCardTransactionPage", "showCanIssueCarDialog", "mailBoxId", "showDeleteCarDialog", "name", "startIssueActivity", "did", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NfcManagerImpl implements NfcManager {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkCRSStatus$lambda$1(Function1 crsStatus, Object obj) {
        Intrinsics.checkNotNullParameter(crsStatus, "$crsStatus");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        crsStatus.invoke2(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pinStatus$lambda$0(Function1 pinStatus, Object obj) {
        Intrinsics.checkNotNullParameter(pinStatus, "$pinStatus");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        Integer num = (Integer) obj;
        num.intValue();
        pinStatus.invoke2(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCanIssueCarDialog$lambda$2(BaseActivity activity, String mailBoxId, Ref.ObjectRef did, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(mailBoxId, "$mailBoxId");
        Intrinsics.checkNotNullParameter(did, "$did");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setPackage(activity.getPackageName());
        intent.setData(Uri.parse("miwear://card?action=issue&type=car_keys&source_channel=mi_wallet&need_confirm=0&relay_server=" + mailBoxId + "&did=" + did.element));
        activity.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCanIssueCarDialog$lambda$3(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDeleteCarDialog$lambda$4(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void checkCRSStatus(@NotNull final Function1<? super Boolean, Unit> crsStatus) throws Exception {
        Intrinsics.checkNotNullParameter(crsStatus, "crsStatus");
        ltg.c().checkCRSStatus(new ssg.b() { // from class: xqg
            @Override // ssg.b
            public final void onResult(Object obj) {
                NfcManagerImpl.checkCRSStatus$lambda$1(crsStatus, obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    @Nullable
    public String getCplc() {
        return s3q.f0().b0();
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public int getEnv() {
        return NfcPreference.getEnvr();
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public int getMasterSize() {
        return zl3.g().h().size();
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    @NotNull
    public String getSpName() {
        return NfcPreference.INSTANCE.getSpName();
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void gotoBankCardDetailPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        UtilsKt.gotoPage$default(context, BankCardDetailFragment.class, null, false, 8, null);
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void gotoBankCardTransactionPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        UtilsKt.gotoPage$default(context, MasterTranslationFragment.class, null, false, 8, null);
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void gotoCardManagerPage(@NotNull Context context, boolean isDeleteMier) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) CardManagerActivity.class));
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void gotoIssueActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) IssuerActivity.class);
        intent.addFlags(67108864);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void gotoIssueActivityByUri(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setClass(context, IssuerActivity.class);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void gotoMasterListPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        UtilsKt.gotoPage$default(context, MasterCardListFragment.class, null, false, 12, null);
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void gotoRechargeActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) RechargeActivity.class);
        intent.addFlags(67108864);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void gotoUpgradePinPage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        UtilsKt.gotoPage$default(context, UpgradePwdSecurityLevelFragment.class, null, false, 12, null);
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public boolean isShowCard(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return NfcUtils.INSTANCE.isShowCard(deviceModel);
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void loadMasterRegionList() {
        AppUtil appUtil = AppUtil.INSTANCE;
        vqg.d("loadMasterRegionList isPlayChannel:" + appUtil.isPlayChannel());
        if (appUtil.isPlayChannel()) {
            new NfcRequest().initSupportMasterCardRegions();
        }
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public boolean mipayClearSE() {
        return new rvf().d().isStatusOK();
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public boolean mipayPrepare() {
        return rvf.i().isStatusOK();
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void openFeiJie(@NotNull BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FeijieUtils.INSTANCE.addTestKey(activity);
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void openSXMCardReader(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivity(new Intent(activity, (Class<?>) SMXCardReaderActivity.class));
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void pinStatus(@NotNull final Function1<? super Integer, Unit> pinStatus) throws Exception {
        Intrinsics.checkNotNullParameter(pinStatus, "pinStatus");
        ltg.c().pinStatus(new ssg.b() { // from class: brg
            @Override // ssg.b
            public final void onResult(Object obj) {
                NfcManagerImpl.pinStatus$lambda$0(pinStatus, obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void setEnv(int env) {
        NfcPreference.setEnvCommit(env);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.String] */
    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void showCanIssueCarDialog(@NotNull final BaseActivity activity, @NotNull final String mailBoxId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mailBoxId, "mailBoxId");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = NfcPreference.getCarDeviceId();
        int i = o0j.O0;
        int i2 = o0j.N0;
        int i3 = o0j.e;
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        UtilsKt.showMsgDialog(i, i2, i3, supportFragmentManager, o0j.d, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: yqg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcManagerImpl.showCanIssueCarDialog$lambda$2(activity, mailBoxId, objectRef, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: zqg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcManagerImpl.showCanIssueCarDialog$lambda$3((DialogInterface) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void showDeleteCarDialog(@NotNull BaseActivity activity, @NotNull String name) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        String string = ResourceExtKt.getString(o0j.M0);
        String string2 = ResourceExtKt.getString(o0j.f3, name);
        int i = o0j.common_known;
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        UtilsKt.showMsgDialog((80 & 1) != 0 ? null : string, string2, i, supportFragmentManager, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: arg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcManagerImpl.showDeleteCarDialog$lambda$4((DialogInterface) obj);
            }
        }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
    }

    @Override // com.xiaomi.fitness.nfc.export.NfcManager
    public void startIssueActivity(@NotNull Context context, @NotNull String mailBoxId, @NotNull String did) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mailBoxId, "mailBoxId");
        Intrinsics.checkNotNullParameter(did, "did");
        Intent intent = new Intent(context, (Class<?>) IssuerActivity.class);
        intent.setFlags(268435456);
        intent.setData(Uri.parse("miwear://card?action=issue&type=car_keys&source_channel=mi_wallet&need_confirm=0&relay_server=" + mailBoxId + "&did=" + did));
        context.startActivity(intent);
    }
}
