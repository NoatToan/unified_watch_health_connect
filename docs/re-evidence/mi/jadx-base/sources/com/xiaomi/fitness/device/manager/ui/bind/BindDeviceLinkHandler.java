package com.xiaomi.fitness.device.manager.ui.bind;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import com.mi.health.uri_parser.ILinkHandler;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fit.device.extensions.ProductExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.OnProductChangeListener;
import com.xiaomi.fitness.device.manager.ProductManager;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.extensions.DeviceExtKt;
import com.xiaomi.fitness.device.manager.ui.bind.BindDeviceLinkHandler;
import com.xiaomi.fitness.main.MainActivity;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.uzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\b\t*\u0002',\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J \u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u0012\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016H\u0002J4\u0010$\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\"\u001a\u00020\u000eH\u0002J\b\u0010.\u001a\u00020\u000fH\u0002J\b\u0010/\u001a\u00020\u000fH\u0002J\b\u00100\u001a\u00020\u000eH\u0002J\u0010\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0004\n\u0002\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0004\n\u0002\u0010-¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/BindDeviceLinkHandler;", "Lcom/mi/health/uri_parser/ILinkHandler;", "<init>", "()V", "mFrom", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "accountListener", "Lkotlin/Function1;", "", "", "onMainActivityStarted", "Lkotlin/Function0;", "getOnMainActivityStarted", "()Lkotlin/jvm/functions/Function0;", "lifecycleListener", "Lkotlin/Function2;", "", "removeLifecycleListener", "removeAccountListener", "handleUri", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "from", "isXiaomiWearUrl", "url", "mac", "name", "redirection", "phoneSwitching", "linkUrl", "intentDispatcher", "mHandleIntent", "mServiceConnection", "com/xiaomi/fitness/device/manager/ui/bind/BindDeviceLinkHandler$mServiceConnection$1", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindDeviceLinkHandler$mServiceConnection$1;", "productChangeTimestamp", "", "mProductChangeListener", "com/xiaomi/fitness/device/manager/ui/bind/BindDeviceLinkHandler$mProductChangeListener$1", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindDeviceLinkHandler$mProductChangeListener$1;", "removeServiceConnectListener", "removeProductListener", "isDeviceExists", "getValidMac", "shortMac", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindDeviceLinkHandler implements ILinkHandler {

    @NotNull
    public static final String BLOOD_SUGAR_ID = "14104";

    @NotNull
    public static final String LINK_ABROAD = "https://region.hlth.io.mi.com/abroad_download";

    @NotNull
    public static final String LINK_CN = "https://hlth.io.mi.com/download";

    @NotNull
    public static final String LINK_CN_2 = "https://watch.iot.mi.com/";

    @NotNull
    public static final String LINK_CN_3_HOST = "xiaomiwear.com";

    @NotNull
    private static final String TAG = "BindDeviceLinkHandler";
    public Context context;

    @Nullable
    private String linkUrl;
    private int mFrom;

    @Nullable
    private String mac;

    @Nullable
    private String name;
    private boolean phoneSwitching;
    private volatile long productChangeTimestamp;

    @Nullable
    private String redirection;

    @NotNull
    private final Function1<Boolean, Unit> accountListener = new Function1() { // from class: lk2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return BindDeviceLinkHandler.accountListener$lambda$0(this.f25152a, ((Boolean) obj).booleanValue());
        }
    };

    @NotNull
    private final Function0<Unit> onMainActivityStarted = new Function0() { // from class: nk2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BindDeviceLinkHandler.onMainActivityStarted$lambda$1(this.f28002a);
        }
    };

    @NotNull
    private final Function2<String, String, Unit> lifecycleListener = new Function2() { // from class: pk2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return BindDeviceLinkHandler.lifecycleListener$lambda$2(this.f30478a, (String) obj, (String) obj2);
        }
    };

    @NotNull
    private final Function0<Unit> mHandleIntent = new Function0() { // from class: rk2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BindDeviceLinkHandler.mHandleIntent$lambda$5(this.f32626a);
        }
    };

    @NotNull
    private final BindDeviceLinkHandler$mServiceConnection$1 mServiceConnection = new ServiceConnection() { // from class: com.xiaomi.fitness.device.manager.ui.bind.BindDeviceLinkHandler$mServiceConnection$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            this.this$0.mHandleIntent.invoke();
            this.this$0.removeServiceConnectListener();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            DeviceModelExtKt.logi("BindDeviceLinkHandler", "onServiceDisconnected: ");
        }
    };

    @NotNull
    private final BindDeviceLinkHandler$mProductChangeListener$1 mProductChangeListener = new OnProductChangeListener() { // from class: com.xiaomi.fitness.device.manager.ui.bind.BindDeviceLinkHandler$mProductChangeListener$1
        @Override // com.xiaomi.fitness.device.manager.OnProductChangeListener
        public void onChange() {
            DeviceModelExtKt.logi("mProductChangeListener update get product");
            if (this.this$0.productChangeTimestamp == 0 || System.currentTimeMillis() - this.this$0.productChangeTimestamp > 3000) {
                BindDeviceLinkHandler bindDeviceLinkHandler = this.this$0;
                bindDeviceLinkHandler.intentDispatcher(bindDeviceLinkHandler.redirection, this.this$0.mac, this.this$0.name, this.this$0.phoneSwitching);
                this.this$0.productChangeTimestamp = System.currentTimeMillis();
            }
            this.this$0.removeProductListener();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accountListener$lambda$0(BindDeviceLinkHandler this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            Logger.i(TAG, "account login status = " + z);
            DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).addProductChangeListener(this$0.mProductChangeListener);
            this$0.removeAccountListener();
        }
        return Unit.INSTANCE;
    }

    private final String getValidMac(String shortMac) {
        DeviceModelExtKt.logi(TAG, "getValidMac() called with: shortMac = " + shortMac);
        if (shortMac.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, shortMac.length() - 2, 2);
        if (progressionLastElement >= 0) {
            while (true) {
                String strSlice = StringsKt___StringsKt.slice(shortMac, new IntRange(i, i + 1));
                Logger.i(TAG, "getValidMac: slice = " + strSlice);
                sb.append(strSlice);
                sb.append(":");
                if (i == progressionLastElement) {
                    break;
                }
                i += 2;
            }
        }
        String string = sb.deleteCharAt(sb.length() - 1).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Logger.i(TAG, "getValidMac() returned: " + string);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x011c A[Catch: Exception -> 0x0157, TRY_LEAVE, TryCatch #0 {Exception -> 0x0157, blocks: (B:47:0x0105, B:49:0x011c, B:52:0x012a, B:55:0x0132, B:58:0x0139, B:62:0x0141, B:65:0x0159, B:66:0x0162, B:67:0x016b, B:70:0x0178, B:73:0x017f, B:77:0x0187, B:78:0x019c, B:79:0x01b0), top: B:86:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x012a A[Catch: Exception -> 0x0157, TRY_ENTER, TryCatch #0 {Exception -> 0x0157, blocks: (B:47:0x0105, B:49:0x011c, B:52:0x012a, B:55:0x0132, B:58:0x0139, B:62:0x0141, B:65:0x0159, B:66:0x0162, B:67:0x016b, B:70:0x0178, B:73:0x017f, B:77:0x0187, B:78:0x019c, B:79:0x01b0), top: B:86:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:55:0x0132 A[Catch: Exception -> 0x0157, TryCatch #0 {Exception -> 0x0157, blocks: (B:47:0x0105, B:49:0x011c, B:52:0x012a, B:55:0x0132, B:58:0x0139, B:62:0x0141, B:65:0x0159, B:66:0x0162, B:67:0x016b, B:70:0x0178, B:73:0x017f, B:77:0x0187, B:78:0x019c, B:79:0x01b0), top: B:86:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0159 A[Catch: Exception -> 0x0157, TryCatch #0 {Exception -> 0x0157, blocks: (B:47:0x0105, B:49:0x011c, B:52:0x012a, B:55:0x0132, B:58:0x0139, B:62:0x0141, B:65:0x0159, B:66:0x0162, B:67:0x016b, B:70:0x0178, B:73:0x017f, B:77:0x0187, B:78:0x019c, B:79:0x01b0), top: B:86:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0162 A[Catch: Exception -> 0x0157, TryCatch #0 {Exception -> 0x0157, blocks: (B:47:0x0105, B:49:0x011c, B:52:0x012a, B:55:0x0132, B:58:0x0139, B:62:0x0141, B:65:0x0159, B:66:0x0162, B:67:0x016b, B:70:0x0178, B:73:0x017f, B:77:0x0187, B:78:0x019c, B:79:0x01b0), top: B:86:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x016b A[Catch: Exception -> 0x0157, TryCatch #0 {Exception -> 0x0157, blocks: (B:47:0x0105, B:49:0x011c, B:52:0x012a, B:55:0x0132, B:58:0x0139, B:62:0x0141, B:65:0x0159, B:66:0x0162, B:67:0x016b, B:70:0x0178, B:73:0x017f, B:77:0x0187, B:78:0x019c, B:79:0x01b0), top: B:86:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x019c A[Catch: Exception -> 0x0157, TryCatch #0 {Exception -> 0x0157, blocks: (B:47:0x0105, B:49:0x011c, B:52:0x012a, B:55:0x0132, B:58:0x0139, B:62:0x0141, B:65:0x0159, B:66:0x0162, B:67:0x016b, B:70:0x0178, B:73:0x017f, B:77:0x0187, B:78:0x019c, B:79:0x01b0), top: B:86:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b0 A[Catch: Exception -> 0x0157, TRY_LEAVE, TryCatch #0 {Exception -> 0x0157, blocks: (B:47:0x0105, B:49:0x011c, B:52:0x012a, B:55:0x0132, B:58:0x0139, B:62:0x0141, B:65:0x0159, B:66:0x0162, B:67:0x016b, B:70:0x0178, B:73:0x017f, B:77:0x0187, B:78:0x019c, B:79:0x01b0), top: B:86:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01db  */
    /* JADX WARN: Code duplicated, block: B:86:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void intentDispatcher(final String redirection, String mac, String name, boolean phoneSwitching) {
        WearableProduct wearableProduct;
        AccountManager.Companion companion;
        WearableProduct wearableProduct2;
        DeviceModelExtKt.logi(TAG, "intentDispatcher() called with: redirection = " + redirection + ", mac = " + mac + ", name = " + name + ", phoneSwitch = " + phoneSwitching);
        String str = this.linkUrl;
        if ((str != null && StringsKt__StringsJVMKt.startsWith$default(str, "https://watch.iot.mi.com/", false, 2, null)) || isXiaomiWearUrl(this.linkUrl)) {
            String str2 = this.linkUrl;
            Intrinsics.checkNotNull(str2);
            WebViewUtilKt.startWebView$default(str2, null, false, false, null, false, null, false, 254, null);
        } else if (redirection != null) {
            switch (redirection.hashCode()) {
                case -1979887412:
                    if (!redirection.equals("mifitness")) {
                        try {
                            final int i = Integer.parseInt(redirection);
                            wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: tk2
                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: invoke */
                                public final Object invoke2(Object obj) {
                                    return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$4(i, (WearableProduct) obj));
                                }
                            });
                            if (wearableProduct != null) {
                                companion = AccountManager.INSTANCE;
                                String str3 = "";
                                if (AccountManagerExtKt.getInstance(companion).isLogin()) {
                                    Logger.i(TAG, "intentDispatcher: no login is wearos");
                                    if (ProductExtKt.isWearOS(wearableProduct) || mac == null || mac.length() == 0) {
                                        MainExtKt.setShowLoginDialog(true);
                                        MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                        AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                    } else {
                                        Context context = getContext();
                                        if (name != null) {
                                            str3 = name;
                                        }
                                        DeviceManagerExtKt.launchToBindDevice(context, str3, mac, null, wearableProduct, this.mFrom, "", (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : phoneSwitching);
                                    }
                                } else if (DeviceExtKt.isVersionSupport(wearableProduct)) {
                                    ToastUtil.INSTANCE.showToast(uzi.a2);
                                } else if (mac != null || mac.length() == 0) {
                                    DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                                } else {
                                    Context context2 = getContext();
                                    if (name != null) {
                                        str3 = name;
                                    }
                                    DeviceManagerExtKt.launchToBindDevice(context2, str3, mac, null, wearableProduct, this.mFrom, "", (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : phoneSwitching);
                                }
                            } else {
                                ToastUtil.INSTANCE.showToast(uzi.common_not_support);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            Logger.i(TAG, "intentDispatcher: e " + e.getMessage());
                            ToastUtil.INSTANCE.showToast(uzi.common_not_support);
                        }
                    } else {
                        MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                    }
                    break;
                case -1354814997:
                    if (!redirection.equals("common")) {
                        final int i2 = Integer.parseInt(redirection);
                        wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: tk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$4(i2, (WearableProduct) obj));
                            }
                        });
                        if (wearableProduct != null) {
                            companion = AccountManager.INSTANCE;
                            String str4 = "";
                            if (AccountManagerExtKt.getInstance(companion).isLogin()) {
                                Logger.i(TAG, "intentDispatcher: no login is wearos");
                                if (ProductExtKt.isWearOS(wearableProduct)) {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                } else {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                }
                            } else if (DeviceExtKt.isVersionSupport(wearableProduct)) {
                                ToastUtil.INSTANCE.showToast(uzi.a2);
                            } else if (mac != null) {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            } else {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            }
                        } else {
                            ToastUtil.INSTANCE.showToast(uzi.common_not_support);
                        }
                    } else {
                        DeviceManagerExtKt.launchToAddDevice(getContext());
                    }
                    break;
                case 104551:
                    if (!redirection.equals("k62")) {
                        final int i3 = Integer.parseInt(redirection);
                        wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: tk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$4(i3, (WearableProduct) obj));
                            }
                        });
                        if (wearableProduct != null) {
                            companion = AccountManager.INSTANCE;
                            String str5 = "";
                            if (AccountManagerExtKt.getInstance(companion).isLogin()) {
                                Logger.i(TAG, "intentDispatcher: no login is wearos");
                                if (ProductExtKt.isWearOS(wearableProduct)) {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                } else {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                }
                            } else if (DeviceExtKt.isVersionSupport(wearableProduct)) {
                                ToastUtil.INSTANCE.showToast(uzi.a2);
                            } else if (mac != null) {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            } else {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            }
                        } else {
                            ToastUtil.INSTANCE.showToast(uzi.common_not_support);
                        }
                    } else {
                        wearableProduct2 = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: sk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$3(redirection, (WearableProduct) obj));
                            }
                        });
                        if (wearableProduct2 != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct2, true);
                        } else {
                            DeviceManagerExtKt.launchToAddDevice(getContext());
                        }
                    }
                    break;
                case 104552:
                    if (!redirection.equals("k63")) {
                        final int i4 = Integer.parseInt(redirection);
                        wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: tk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$4(i4, (WearableProduct) obj));
                            }
                        });
                        if (wearableProduct != null) {
                            companion = AccountManager.INSTANCE;
                            String str6 = "";
                            if (AccountManagerExtKt.getInstance(companion).isLogin()) {
                                Logger.i(TAG, "intentDispatcher: no login is wearos");
                                if (ProductExtKt.isWearOS(wearableProduct)) {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                } else {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                }
                            } else if (DeviceExtKt.isVersionSupport(wearableProduct)) {
                                ToastUtil.INSTANCE.showToast(uzi.a2);
                            } else if (mac != null) {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            } else {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            }
                        } else {
                            ToastUtil.INSTANCE.showToast(uzi.common_not_support);
                        }
                    } else {
                        wearableProduct2 = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: sk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$3(redirection, (WearableProduct) obj));
                            }
                        });
                        if (wearableProduct2 != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct2, true);
                        } else {
                            DeviceManagerExtKt.launchToAddDevice(getContext());
                        }
                    }
                    break;
                case 104554:
                    if (!redirection.equals("k65")) {
                        final int i5 = Integer.parseInt(redirection);
                        wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: tk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$4(i5, (WearableProduct) obj));
                            }
                        });
                        if (wearableProduct != null) {
                            companion = AccountManager.INSTANCE;
                            String str7 = "";
                            if (AccountManagerExtKt.getInstance(companion).isLogin()) {
                                Logger.i(TAG, "intentDispatcher: no login is wearos");
                                if (ProductExtKt.isWearOS(wearableProduct)) {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                } else {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                }
                            } else if (DeviceExtKt.isVersionSupport(wearableProduct)) {
                                ToastUtil.INSTANCE.showToast(uzi.a2);
                            } else if (mac != null) {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            } else {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            }
                        } else {
                            ToastUtil.INSTANCE.showToast(uzi.common_not_support);
                        }
                    } else {
                        wearableProduct2 = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: sk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$3(redirection, (WearableProduct) obj));
                            }
                        });
                        if (wearableProduct2 != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct2, true);
                        } else {
                            DeviceManagerExtKt.launchToAddDevice(getContext());
                        }
                    }
                    break;
                case 104556:
                    if (!redirection.equals("k67")) {
                        final int i6 = Integer.parseInt(redirection);
                        wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: tk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$4(i6, (WearableProduct) obj));
                            }
                        });
                        if (wearableProduct != null) {
                            companion = AccountManager.INSTANCE;
                            String str8 = "";
                            if (AccountManagerExtKt.getInstance(companion).isLogin()) {
                                Logger.i(TAG, "intentDispatcher: no login is wearos");
                                if (ProductExtKt.isWearOS(wearableProduct)) {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                } else {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                }
                            } else if (DeviceExtKt.isVersionSupport(wearableProduct)) {
                                ToastUtil.INSTANCE.showToast(uzi.a2);
                            } else if (mac != null) {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            } else {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            }
                        } else {
                            ToastUtil.INSTANCE.showToast(uzi.common_not_support);
                        }
                    } else {
                        wearableProduct2 = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: sk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$3(redirection, (WearableProduct) obj));
                            }
                        });
                        if (wearableProduct2 != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct2, true);
                        } else {
                            DeviceManagerExtKt.launchToAddDevice(getContext());
                        }
                    }
                    break;
                case 3241271:
                    if (!redirection.equals("k65a")) {
                        final int i7 = Integer.parseInt(redirection);
                        wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: tk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$4(i7, (WearableProduct) obj));
                            }
                        });
                        if (wearableProduct != null) {
                            companion = AccountManager.INSTANCE;
                            String str9 = "";
                            if (AccountManagerExtKt.getInstance(companion).isLogin()) {
                                Logger.i(TAG, "intentDispatcher: no login is wearos");
                                if (ProductExtKt.isWearOS(wearableProduct)) {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                } else {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                }
                            } else if (DeviceExtKt.isVersionSupport(wearableProduct)) {
                                ToastUtil.INSTANCE.showToast(uzi.a2);
                            } else if (mac != null) {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            } else {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            }
                        } else {
                            ToastUtil.INSTANCE.showToast(uzi.common_not_support);
                        }
                    } else {
                        wearableProduct2 = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: sk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$3(redirection, (WearableProduct) obj));
                            }
                        });
                        if (wearableProduct2 != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct2, true);
                        } else {
                            DeviceManagerExtKt.launchToAddDevice(getContext());
                        }
                    }
                    break;
                case 46850290:
                    if (!redirection.equals(BLOOD_SUGAR_ID)) {
                        final int i8 = Integer.parseInt(redirection);
                        wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: tk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$4(i8, (WearableProduct) obj));
                            }
                        });
                        if (wearableProduct != null) {
                            companion = AccountManager.INSTANCE;
                            String str10 = "";
                            if (AccountManagerExtKt.getInstance(companion).isLogin()) {
                                Logger.i(TAG, "intentDispatcher: no login is wearos");
                                if (ProductExtKt.isWearOS(wearableProduct)) {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                } else {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                }
                            } else if (DeviceExtKt.isVersionSupport(wearableProduct)) {
                                ToastUtil.INSTANCE.showToast(uzi.a2);
                            } else if (mac != null) {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            } else {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            }
                        } else {
                            ToastUtil.INSTANCE.showToast(uzi.common_not_support);
                        }
                    } else {
                        BloodSugarExtKt.launchBloodSugarBind(getContext(), Integer.parseInt(redirection), mac);
                    }
                    break;
                case 1025677390:
                    if (!redirection.equals("hmbrace")) {
                        final int i9 = Integer.parseInt(redirection);
                        wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: tk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$4(i9, (WearableProduct) obj));
                            }
                        });
                        if (wearableProduct != null) {
                            companion = AccountManager.INSTANCE;
                            String str11 = "";
                            if (AccountManagerExtKt.getInstance(companion).isLogin()) {
                                Logger.i(TAG, "intentDispatcher: no login is wearos");
                                if (ProductExtKt.isWearOS(wearableProduct)) {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                } else {
                                    MainExtKt.setShowLoginDialog(true);
                                    MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                    AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                                }
                            } else if (DeviceExtKt.isVersionSupport(wearableProduct)) {
                                ToastUtil.INSTANCE.showToast(uzi.a2);
                            } else if (mac != null) {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            } else {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                            }
                        } else {
                            ToastUtil.INSTANCE.showToast(uzi.common_not_support);
                        }
                    } else {
                        DeviceManagerExtKt.launchToAddDevice(getContext());
                    }
                    break;
                default:
                    final int i10 = Integer.parseInt(redirection);
                    wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: tk2
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$4(i10, (WearableProduct) obj));
                        }
                    });
                    if (wearableProduct != null) {
                        companion = AccountManager.INSTANCE;
                        String str12 = "";
                        if (AccountManagerExtKt.getInstance(companion).isLogin()) {
                            Logger.i(TAG, "intentDispatcher: no login is wearos");
                            if (ProductExtKt.isWearOS(wearableProduct)) {
                                MainExtKt.setShowLoginDialog(true);
                                MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                            } else {
                                MainExtKt.setShowLoginDialog(true);
                                MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                                AccountManagerExtKt.getInstance(companion).addAccountListener(this.accountListener);
                            }
                        } else if (DeviceExtKt.isVersionSupport(wearableProduct)) {
                            ToastUtil.INSTANCE.showToast(uzi.a2);
                        } else if (mac != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                        } else {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), wearableProduct, true);
                        }
                    } else {
                        ToastUtil.INSTANCE.showToast(uzi.common_not_support);
                    }
                    break;
            }
        } else {
            MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
        }
        AppManager.INSTANCE.getInstance().unregisterLifecycleListener(this.lifecycleListener);
    }

    public static /* synthetic */ void intentDispatcher$default(BindDeviceLinkHandler bindDeviceLinkHandler, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        bindDeviceLinkHandler.intentDispatcher(str, str2, str3, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean intentDispatcher$lambda$3(String str, WearableProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getAlias(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean intentDispatcher$lambda$4(int i, WearableProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getProductId() == i;
    }

    private final boolean isDeviceExists() {
        return ((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).findDeviceModel(new Function1() { // from class: jk2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(BindDeviceLinkHandler.isDeviceExists$lambda$6(this.f22882a, (WearableDeviceModel) obj));
            }
        })) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDeviceExists$lambda$6(BindDeviceLinkHandler this$0, WearableDeviceModel it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt__StringsJVMKt.equals(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(it), this$0.mac, true);
    }

    private final boolean isXiaomiWearUrl(String url) {
        if (url == null || url.length() == 0) {
            Logger.i(TAG, "isXiaomiWearUrl: url is null or empty");
            return false;
        }
        try {
            String host = Uri.parse(url).getHost();
            if (host != null) {
                return StringsKt__StringsJVMKt.endsWith$default(host, LINK_CN_3_HOST, false, 2, null);
            }
            return false;
        } catch (Exception e) {
            Logger.i(TAG, "isXiaomiWearUrl: e " + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lifecycleListener$lambda$2(BindDeviceLinkHandler this$0, String activity, String lifecycle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Logger.i(TAG, "lifecycleListener() called with: activity = " + activity + ", lifecycle = " + lifecycle);
        if (Intrinsics.areEqual((String) StringsKt__StringsKt.split$default((CharSequence) activity, new String[]{";"}, false, 0, 6, (Object) null).get(0), AppManager.INSTANCE.getInstance().getMainActivity()) && Intrinsics.areEqual(lifecycle, LifecycleConstantKt.ON_RESUME)) {
            this$0.onMainActivityStarted.invoke();
            this$0.removeLifecycleListener();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mHandleIntent$lambda$5(BindDeviceLinkHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableProductManager.Companion companion = WearableProductManager.INSTANCE;
        List productList$default = ProductManager.DefaultImpls.getProductList$default(DeviceManagerExtKt.getInstance(companion), null, 1, null);
        DeviceModelExtKt.logi(TAG, "mHandleIntent: productList " + productList$default.size());
        if (productList$default.isEmpty()) {
            DeviceManagerExtKt.getInstance(companion).addProductChangeListener(this$0.mProductChangeListener);
        } else {
            this$0.intentDispatcher(this$0.redirection, this$0.mac, this$0.name, this$0.phoneSwitching);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMainActivityStarted$lambda$1(BindDeviceLinkHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ServiceConnector.Companion companion = ServiceConnector.INSTANCE;
        boolean zIsConnected$default = ServiceConnector.isConnected$default(companion.getInstance(), 0, 1, null);
        Logger.i(TAG, "onMainActivityStarted: isServiceConnected = " + zIsConnected$default);
        if (zIsConnected$default) {
            this$0.mHandleIntent.invoke();
        } else {
            ServiceConnector.addServiceConnectListener$default(companion.getInstance(), this$0.mServiceConnection, 0, 2, null);
        }
        return Unit.INSTANCE;
    }

    private final void removeAccountListener() {
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).removeAccountListener(this.accountListener);
    }

    private final void removeLifecycleListener() {
        AppManager.INSTANCE.getInstance().unregisterLifecycleListener(this.lifecycleListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeProductListener() {
        DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).removeProductChangeListener(this.mProductChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeServiceConnectListener() {
        ServiceConnector.removeServiceConnectListener$default(ServiceConnector.INSTANCE.getInstance(), this.mServiceConnection, 0, 2, null);
    }

    @NotNull
    public final Context getContext() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    @NotNull
    public final Function0<Unit> getOnMainActivityStarted() {
        return this.onMainActivityStarted;
    }

    @Override // com.mi.health.uri_parser.ILinkHandler
    public boolean handleUri(@NotNull Context context, @NotNull Uri uri, int from) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.productChangeTimestamp = 0L;
        setContext(context);
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        boolean z = false;
        if (!StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "https://hlth.io.mi.com/download", false, 2, (Object) null) && !StringsKt__StringsJVMKt.startsWith$default(string, "https://watch.iot.mi.com/", false, 2, null) && !isXiaomiWearUrl(string) && !StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "https://region.hlth.io.mi.com/abroad_download", false, 2, (Object) null)) {
            return false;
        }
        this.mFrom = from;
        this.redirection = uri.getQueryParameter("redir");
        this.name = uri.getQueryParameter("name");
        String queryParameter = uri.getQueryParameter("mac");
        if (queryParameter == null) {
            queryParameter = "";
        }
        this.mac = getValidMac(queryParameter);
        String queryParameter2 = uri.getQueryParameter("switch");
        if (queryParameter2 != null && Intrinsics.areEqual(queryParameter2, "1")) {
            z = true;
        }
        this.phoneSwitching = z;
        this.linkUrl = string;
        AppManager.Companion companion = AppManager.INSTANCE;
        DeviceModelExtKt.logi(TAG, "handleUri: isMainActivity on top " + (companion.getInstance().getTopActivity() instanceof MainActivity) + ", showing " + companion.getInstance().isMainActivityShowing());
        if ((companion.getInstance().getTopActivity() instanceof MainActivity) || companion.getInstance().isMainActivityShowing()) {
            this.onMainActivityStarted.invoke();
        } else {
            companion.getInstance().registerLifecycleListener(this.lifecycleListener);
        }
        return true;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }
}
