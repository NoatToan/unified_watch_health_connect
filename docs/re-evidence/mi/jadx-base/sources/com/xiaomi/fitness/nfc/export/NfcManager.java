package com.xiaomi.fitness.nfc.export;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u0000 .2\u00020\u0001:\u0001.J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0010H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u0003H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0010H&J\b\u0010\u001e\u001a\u00020\u0010H&J\b\u0010\u001f\u001a\u00020\u0012H&J\u001c\u0010 \u001a\u00020\u00032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030!H&J\u001c\u0010\"\u001a\u00020\u00032\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030!H&J\b\u0010$\u001a\u00020\u0007H&J\b\u0010%\u001a\u00020\u0007H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0012H&J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0012H&J \u0010,\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H&¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/nfc/export/NfcManager;", "", "gotoCardManagerPage", "", "context", "Landroid/content/Context;", "isDeleteMier", "", "gotoIssueActivity", "gotoRechargeActivity", "gotoIssueActivityByUri", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "gotoMasterListPage", "gotoUpgradePinPage", "getMasterSize", "", "getCplc", "", "isShowCard", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "openFeiJie", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "openSXMCardReader", "Landroid/app/Activity;", "loadMasterRegionList", "setEnv", "env", "getEnv", "getSpName", "pinStatus", "Lkotlin/Function1;", "checkCRSStatus", "needCrsInit", "mipayPrepare", "mipayClearSE", "gotoBankCardDetailPage", "gotoBankCardTransactionPage", "showCanIssueCarDialog", "mailBoxId", "showDeleteCarDialog", "name", "startIssueActivity", "did", "Companion", "nfc-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NfcManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/nfc/export/NfcManager$Companion;", "", "<init>", "()V", "nfc-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void checkCRSStatus(@NotNull Function1<? super Boolean, Unit> needCrsInit);

    @Nullable
    String getCplc();

    int getEnv();

    int getMasterSize();

    @NotNull
    String getSpName();

    void gotoBankCardDetailPage(@NotNull Context context);

    void gotoBankCardTransactionPage(@NotNull Context context);

    void gotoCardManagerPage(@NotNull Context context, boolean isDeleteMier);

    void gotoIssueActivity(@NotNull Context context);

    void gotoIssueActivityByUri(@NotNull Context context, @NotNull Uri uri);

    void gotoMasterListPage(@NotNull Context context);

    void gotoRechargeActivity(@NotNull Context context);

    void gotoUpgradePinPage(@NotNull Context context);

    boolean isShowCard(@NotNull WearableDeviceModel deviceModel);

    void loadMasterRegionList();

    boolean mipayClearSE();

    boolean mipayPrepare();

    void openFeiJie(@NotNull BaseActivity activity);

    void openSXMCardReader(@NotNull Activity activity);

    void pinStatus(@NotNull Function1<? super Integer, Unit> pinStatus);

    void setEnv(int env);

    void showCanIssueCarDialog(@NotNull BaseActivity activity, @NotNull String mailBoxId);

    void showDeleteCarDialog(@NotNull BaseActivity activity, @NotNull String name);

    void startIssueActivity(@NotNull Context context, @NotNull String mailBoxId, @NotNull String did);
}
