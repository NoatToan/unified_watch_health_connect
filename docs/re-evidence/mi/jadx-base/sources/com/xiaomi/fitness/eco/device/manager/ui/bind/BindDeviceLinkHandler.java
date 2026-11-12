package com.xiaomi.fitness.eco.device.manager.ui.bind;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import com.mi.health.uri_parser.ILinkHandler;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.OnProductChangeListener;
import com.xiaomi.fitness.device.manager.ProductManager;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindDeviceLinkHandler;
import com.xiaomi.fitness.keep_alive.KeepAliveService;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.yzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\b\b*\u0002!$\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J*\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010&\u001a\u00020\u000eH\u0002J\b\u0010'\u001a\u00020\u000eH\u0002J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u0010\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindDeviceLinkHandler;", "Lcom/mi/health/uri_parser/ILinkHandler;", "<init>", "()V", "mFrom", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "onMainActivityStarted", "Lkotlin/Function0;", "", "getOnMainActivityStarted", "()Lkotlin/jvm/functions/Function0;", "lifecycleListener", "Lkotlin/Function2;", "", "getLifecycleListener", "()Lkotlin/jvm/functions/Function2;", "handleUri", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "from", "mac", "name", "redirection", "intentDispatcher", "mHandleIntent", "mServiceConnection", "com/xiaomi/fitness/eco/device/manager/ui/bind/BindDeviceLinkHandler$mServiceConnection$1", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindDeviceLinkHandler$mServiceConnection$1;", "mProductChangeListener", "com/xiaomi/fitness/eco/device/manager/ui/bind/BindDeviceLinkHandler$mProductChangeListener$1", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindDeviceLinkHandler$mProductChangeListener$1;", "removeServiceConnectListener", "removeProductListener", "getValidMac", "shortMac", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindDeviceLinkHandler implements ILinkHandler {

    @NotNull
    public static final String LINK_ABROAD = "https://region.hlth.io.mi.com/abroad_download";

    @NotNull
    public static final String LINK_CN = "https://hlth.io.mi.com/download";

    @NotNull
    private static final String TAG = "EcoBindDeviceLinkHandler";
    public Context context;
    private int mFrom;

    @Nullable
    private String mac;

    @Nullable
    private String name;

    @Nullable
    private String redirection;

    @NotNull
    private final Function0<Unit> onMainActivityStarted = new Function0() { // from class: ik2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BindDeviceLinkHandler.onMainActivityStarted$lambda$0(this.f21242a);
        }
    };

    @NotNull
    private final Function2<String, String, Unit> lifecycleListener = new Function2() { // from class: kk2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return BindDeviceLinkHandler.lifecycleListener$lambda$1(this.f23937a, (String) obj, (String) obj2);
        }
    };

    @NotNull
    private final Function0<Unit> mHandleIntent = new Function0() { // from class: mk2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BindDeviceLinkHandler.mHandleIntent$lambda$4(this.f26946a);
        }
    };

    @NotNull
    private final BindDeviceLinkHandler$mServiceConnection$1 mServiceConnection = new ServiceConnection() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindDeviceLinkHandler$mServiceConnection$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            this.this$0.mHandleIntent.invoke();
            this.this$0.removeServiceConnectListener();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            EcoDeviceModelExtKt.logi("EcoBindDeviceLinkHandler", "onServiceDisconnected: ");
        }
    };

    @NotNull
    private final BindDeviceLinkHandler$mProductChangeListener$1 mProductChangeListener = new OnProductChangeListener() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindDeviceLinkHandler$mProductChangeListener$1
        @Override // com.xiaomi.fitness.device.manager.OnProductChangeListener
        public void onChange() {
            EcoDeviceModelExtKt.logi("mProductChangeListener update get product");
            BindDeviceLinkHandler bindDeviceLinkHandler = this.this$0;
            bindDeviceLinkHandler.intentDispatcher(bindDeviceLinkHandler.redirection, this.this$0.mac, this.this$0.name);
            this.this$0.removeProductListener();
        }
    };

    private final String getValidMac(String shortMac) {
        EcoDeviceModelExtKt.logi(TAG, "getValidMac() called with: shortMac = " + shortMac);
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
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[Catch: Exception -> 0x00f3, TryCatch #0 {Exception -> 0x00f3, blocks: (B:35:0x00ab, B:38:0x00c5, B:41:0x00cc, B:44:0x00d4, B:45:0x00df, B:46:0x00eb), top: B:53:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00df A[Catch: Exception -> 0x00f3, TryCatch #0 {Exception -> 0x00f3, blocks: (B:35:0x00ab, B:38:0x00c5, B:41:0x00cc, B:44:0x00d4, B:45:0x00df, B:46:0x00eb), top: B:53:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb A[Catch: Exception -> 0x00f3, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f3, blocks: (B:35:0x00ab, B:38:0x00c5, B:41:0x00cc, B:44:0x00d4, B:45:0x00df, B:46:0x00eb), top: B:53:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void intentDispatcher(final String redirection, String mac, String name) {
        EcoProduct ecoProduct;
        EcoProduct ecoProduct2;
        EcoDeviceModelExtKt.logi(TAG, "intentDispatcher() called with: redirection = " + redirection + ", mac = " + mac + ", name = " + name);
        if (redirection != null) {
            switch (redirection.hashCode()) {
                case -1979887412:
                    if (!redirection.equals("mifitness")) {
                        try {
                            final int i = Integer.parseInt(redirection);
                            ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: qk2
                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: invoke */
                                public final Object invoke2(Object obj) {
                                    return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$3(i, (EcoProduct) obj));
                                }
                            });
                            if (ecoProduct == null) {
                                ToastUtil.INSTANCE.showToast(yzi.common_not_support);
                            } else if (mac != null || mac.length() == 0) {
                                DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                            } else {
                                Context context = getContext();
                                if (name == null) {
                                    name = "";
                                }
                                EcoDeviceManagerExtKt.launchToBindDevice(context, name, mac, null, ecoProduct, this.mFrom, "");
                            }
                        } catch (Exception unused) {
                            ToastUtil.INSTANCE.showToast(yzi.common_not_support);
                        }
                    } else {
                        MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
                    }
                    break;
                case -1354814997:
                    if (!redirection.equals("common")) {
                        final int i2 = Integer.parseInt(redirection);
                        ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: qk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$3(i2, (EcoProduct) obj));
                            }
                        });
                        if (ecoProduct == null) {
                            ToastUtil.INSTANCE.showToast(yzi.common_not_support);
                        } else if (mac != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                        } else {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                        }
                    } else {
                        DeviceManagerExtKt.launchToAddDevice(getContext());
                    }
                    break;
                case 104551:
                    if (!redirection.equals("k62")) {
                        final int i3 = Integer.parseInt(redirection);
                        ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: qk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$3(i3, (EcoProduct) obj));
                            }
                        });
                        if (ecoProduct == null) {
                            ToastUtil.INSTANCE.showToast(yzi.common_not_support);
                        } else if (mac != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                        } else {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                        }
                    } else {
                        ecoProduct2 = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: ok2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$2(redirection, (EcoProduct) obj));
                            }
                        });
                        if (ecoProduct2 != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct2), true);
                        } else {
                            DeviceManagerExtKt.launchToAddDevice(getContext());
                        }
                    }
                    break;
                case 104552:
                    if (!redirection.equals("k63")) {
                        final int i4 = Integer.parseInt(redirection);
                        ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: qk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$3(i4, (EcoProduct) obj));
                            }
                        });
                        if (ecoProduct == null) {
                            ToastUtil.INSTANCE.showToast(yzi.common_not_support);
                        } else if (mac != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                        } else {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                        }
                    } else {
                        ecoProduct2 = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: ok2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$2(redirection, (EcoProduct) obj));
                            }
                        });
                        if (ecoProduct2 != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct2), true);
                        } else {
                            DeviceManagerExtKt.launchToAddDevice(getContext());
                        }
                    }
                    break;
                case 104554:
                    if (!redirection.equals("k65")) {
                        final int i5 = Integer.parseInt(redirection);
                        ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: qk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$3(i5, (EcoProduct) obj));
                            }
                        });
                        if (ecoProduct == null) {
                            ToastUtil.INSTANCE.showToast(yzi.common_not_support);
                        } else if (mac != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                        } else {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                        }
                    } else {
                        ecoProduct2 = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: ok2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$2(redirection, (EcoProduct) obj));
                            }
                        });
                        if (ecoProduct2 != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct2), true);
                        } else {
                            DeviceManagerExtKt.launchToAddDevice(getContext());
                        }
                    }
                    break;
                case 104556:
                    if (!redirection.equals("k67")) {
                        final int i6 = Integer.parseInt(redirection);
                        ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: qk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$3(i6, (EcoProduct) obj));
                            }
                        });
                        if (ecoProduct == null) {
                            ToastUtil.INSTANCE.showToast(yzi.common_not_support);
                        } else if (mac != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                        } else {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                        }
                    } else {
                        ecoProduct2 = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: ok2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$2(redirection, (EcoProduct) obj));
                            }
                        });
                        if (ecoProduct2 != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct2), true);
                        } else {
                            DeviceManagerExtKt.launchToAddDevice(getContext());
                        }
                    }
                    break;
                case 3241271:
                    if (!redirection.equals("k65a")) {
                        final int i7 = Integer.parseInt(redirection);
                        ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: qk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$3(i7, (EcoProduct) obj));
                            }
                        });
                        if (ecoProduct == null) {
                            ToastUtil.INSTANCE.showToast(yzi.common_not_support);
                        } else if (mac != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                        } else {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                        }
                    } else {
                        ecoProduct2 = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: ok2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$2(redirection, (EcoProduct) obj));
                            }
                        });
                        if (ecoProduct2 != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct2), true);
                        } else {
                            DeviceManagerExtKt.launchToAddDevice(getContext());
                        }
                    }
                    break;
                case 1025677390:
                    if (!redirection.equals("hmbrace")) {
                        final int i8 = Integer.parseInt(redirection);
                        ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: qk2
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$3(i8, (EcoProduct) obj));
                            }
                        });
                        if (ecoProduct == null) {
                            ToastUtil.INSTANCE.showToast(yzi.common_not_support);
                        } else if (mac != null) {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                        } else {
                            DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                        }
                    } else {
                        DeviceManagerExtKt.launchToAddDevice(getContext());
                    }
                    break;
                default:
                    final int i9 = Integer.parseInt(redirection);
                    ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: qk2
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return Boolean.valueOf(BindDeviceLinkHandler.intentDispatcher$lambda$3(i9, (EcoProduct) obj));
                        }
                    });
                    if (ecoProduct == null) {
                        ToastUtil.INSTANCE.showToast(yzi.common_not_support);
                    } else if (mac != null) {
                        DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                    } else {
                        DeviceManagerExtKt.launchToScanDevice(getContext(), EcoProductExtKt.toDeviceProduct(ecoProduct), true);
                    }
                    break;
            }
        } else {
            MainExtKt.showMainActivity$default(getContext(), null, null, 6, null);
        }
        AppManager.INSTANCE.getInstance().unregisterLifecycleListener(this.lifecycleListener);
    }

    public static /* synthetic */ void intentDispatcher$default(BindDeviceLinkHandler bindDeviceLinkHandler, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        bindDeviceLinkHandler.intentDispatcher(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean intentDispatcher$lambda$2(String str, EcoProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getAlias(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean intentDispatcher$lambda$3(int i, EcoProduct it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getProductId() == i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lifecycleListener$lambda$1(BindDeviceLinkHandler this$0, String activity, String lifecycle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Logger.i(TAG, "lifecycleListener() called with: activity = " + activity + ", lifecycle = " + lifecycle);
        if (Intrinsics.areEqual((String) StringsKt__StringsKt.split$default((CharSequence) activity, new String[]{";"}, false, 0, 6, (Object) null).get(0), AppManager.INSTANCE.getInstance().getMainActivity()) && Intrinsics.areEqual(lifecycle, LifecycleConstantKt.ON_RESUME)) {
            this$0.onMainActivityStarted.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mHandleIntent$lambda$4(BindDeviceLinkHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoProductManager.Companion companion = EcoProductManager.INSTANCE;
        List productList$default = ProductManager.DefaultImpls.getProductList$default(EcoDeviceManagerExtKt.getInstance(companion), null, 1, null);
        EcoDeviceModelExtKt.logi(TAG, "mHandleIntent: productList " + productList$default.size());
        if (productList$default.isEmpty()) {
            EcoDeviceManagerExtKt.getInstance(companion).addProductChangeListener(this$0.mProductChangeListener);
        } else {
            this$0.intentDispatcher(this$0.redirection, this$0.mac, this$0.name);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMainActivityStarted$lambda$0(BindDeviceLinkHandler this$0) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeProductListener() {
        EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).removeProductChangeListener(this.mProductChangeListener);
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
    public final Function2<String, String, Unit> getLifecycleListener() {
        return this.lifecycleListener;
    }

    @NotNull
    public final Function0<Unit> getOnMainActivityStarted() {
        return this.onMainActivityStarted;
    }

    @Override // com.mi.health.uri_parser.ILinkHandler
    public boolean handleUri(@NotNull Context context, @NotNull Uri uri, int from) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        setContext(context);
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (!StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "https://hlth.io.mi.com/download", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "https://region.hlth.io.mi.com/abroad_download", false, 2, (Object) null)) {
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
        AppManager.Companion companion = AppManager.INSTANCE;
        Activity topActivity = companion.getInstance().getTopActivity();
        EcoDeviceModelExtKt.logi(TAG, "handleUri: isMainActivity on top " + (topActivity != null ? topActivity.getClass().getName() : null));
        Activity topActivity2 = companion.getInstance().getTopActivity();
        if (Intrinsics.areEqual(topActivity2 != null ? topActivity2.getClass().getName() : null, KeepAliveService.MAIN_ACTIVITY)) {
            this.onMainActivityStarted.invoke();
            return true;
        }
        companion.getInstance().registerLifecycleListener(this.lifecycleListener);
        return true;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }
}
