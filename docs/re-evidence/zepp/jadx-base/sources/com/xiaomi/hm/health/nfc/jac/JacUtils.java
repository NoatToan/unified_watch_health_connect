package com.xiaomi.hm.health.nfc.jac;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.jac.repo.ActionToJacActivity;
import com.huami.jac.ui.amazfit.activity.JacCarHostActivity;
import com.huami.jac.ui.amazfit.navigation.JacArgs;
import com.huami.nfc.applet.api.SeInfoApi;
import com.huami.nfc.base.PayResponse;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.activity.StartUpActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.nfc.NFCFeature;
import com.xiaomi.hm.health.di.koin.module.HuamipayModuleKt;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/nfc/jac/JacUtils;", "", "", "isSupportJac", "Landroid/content/Intent;", "intent", "isJacIntent", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "handleJacIntent", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class JacUtils {

    @NotNull
    public static final JacUtils INSTANCE = new JacUtils();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Intent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Intent intent) {
            super(0);
            this.a = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "handleJacIntent " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Lazy<SeInfoApi> a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ ActionToJacActivity d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Lazy<? extends SeInfoApi> lazy, String str, Context context, ActionToJacActivity actionToJacActivity, String str2) {
            super(0);
            this.a = lazy;
            this.b = str;
            this.c = context;
            this.d = actionToJacActivity;
            this.e = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Context context, ActionToJacActivity actionToJacActivity, String str) {
            JacCarHostActivity.INSTANCE.toCar(context, actionToJacActivity, 0, str, str);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PayResponse<String> cplc = this.a.getValue().getCplc(HuamipayModuleKt.getSN());
            if (!cplc.isSuccessful()) {
                cplc = null;
            }
            if (cplc == null) {
                return;
            }
            String str = this.b;
            final Context context = this.c;
            final ActionToJacActivity actionToJacActivity = this.d;
            final String str2 = this.e;
            JacArgs jacArgs = JacArgs.INSTANCE;
            jacArgs.setWatchId(cplc.getData());
            jacArgs.setVin(str);
            ((Activity) context).runOnUiThread(new Runnable() { // from class: com.xiaomi.hm.health.nfc.jac.a
                @Override // java.lang.Runnable
                public final void run() {
                    JacUtils.b.b(context, actionToJacActivity, str2);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "---isSupportJac " + this.a;
        }
    }

    private JacUtils() {
    }

    public final void handleJacIntent(@NotNull Context context, @NotNull Intent intent) {
        try {
            HMLog.info$default(null, new a(intent), 1, null);
            Uri data = intent.getData();
            String queryParameter = data == null ? null : data.getQueryParameter("token");
            Uri data2 = intent.getData();
            String queryParameter2 = data2 == null ? null : data2.getQueryParameter("vin");
            Uri data3 = intent.getData();
            ThreadsKt.thread((21 & 1) != 0, (21 & 2) != 0 ? false : false, (21 & 4) != 0 ? null : null, (21 & 8) != 0 ? null : null, (21 & 16) != 0 ? -1 : 0, new b(KoinJavaComponent.inject$default(SeInfoApi.class, null, null, 6, null), queryParameter2, context, Intrinsics.areEqual("bigCard", data3 == null ? null : data3.getQueryParameter("action")) ? ActionToJacActivity.BigCard : ActionToJacActivity.KeyCard, queryParameter));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final boolean isJacIntent(@Nullable Intent intent) {
        String scheme;
        String host;
        String path;
        if (intent != null) {
            try {
                if (intent.getData() != null) {
                    Uri data = intent.getData();
                    Boolean boolValueOf = null;
                    String scheme2 = data == null ? null : data.getScheme();
                    if (scheme2 == null || scheme2.length() == 0) {
                        return false;
                    }
                    Uri data2 = intent.getData();
                    String host2 = data2 == null ? null : data2.getHost();
                    if (host2 == null || host2.length() == 0) {
                        return false;
                    }
                    Uri data3 = intent.getData();
                    String path2 = data3 == null ? null : data3.getPath();
                    if (path2 == null || path2.length() == 0) {
                        return false;
                    }
                    Uri data4 = intent.getData();
                    if (!((data4 == null || (scheme = data4.getScheme()) == null) ? null : Boolean.valueOf(scheme.equals("amazfit"))).booleanValue()) {
                        return false;
                    }
                    Uri data5 = intent.getData();
                    if (!((data5 == null || (host = data5.getHost()) == null) ? null : Boolean.valueOf(host.equals(StartUpActivity.NFC_CARD_HOST))).booleanValue()) {
                        return false;
                    }
                    Uri data6 = intent.getData();
                    if (data6 != null && (path = data6.getPath()) != null) {
                        boolValueOf = Boolean.valueOf(m.endsWith$default(path, "create_car_card_jh", false, 2, null));
                    }
                    return boolValueOf.booleanValue();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public final boolean isSupportJac() {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) ((DeviceManagerApi) KoinJavaComponent.inject$default(DeviceManagerApi.class, null, null, 6, null).getValue()).getDevice(HMDeviceType.MILI);
        boolean zSupportNfcFeature = hMMiLiProDevice == null ? false : hMMiLiProDevice.supportNfcFeature(NFCFeature.JAC);
        HMLog.info$default(null, new c(zSupportNfcFeature), 1, null);
        return zSupportNfcFeature;
    }
}
