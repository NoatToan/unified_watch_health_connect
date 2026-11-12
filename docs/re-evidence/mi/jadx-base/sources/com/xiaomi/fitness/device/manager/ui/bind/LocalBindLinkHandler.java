package com.xiaomi.fitness.device.manager.ui.bind;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import android.text.TextUtils;
import com.mi.health.uri_parser.ILinkHandler;
import com.mi.health.uri_parser.links.UriMapKt;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.OnProductChangeListener;
import com.xiaomi.fitness.device.manager.ProductManager;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.ui.bind.LocalBindLinkHandler;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.fitness.sport_eco_manager_export.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.SportRouterKt;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.uzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002\u0010\u0016\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J \u0010\u001a\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010&\u001a\u00020\r2\u0006\u0010!\u001a\u00020$H\u0002J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/LocalBindLinkHandler;", "Lcom/mi/health/uri_parser/ILinkHandler;", "<init>", "()V", "context", "Landroid/content/Context;", "mMac", "", "mOOB", "mPid", "", "mName", "mCheckOOB", "", "mFrom", "mServiceConnection", "com/xiaomi/fitness/device/manager/ui/bind/LocalBindLinkHandler$mServiceConnection$1", "Lcom/xiaomi/fitness/device/manager/ui/bind/LocalBindLinkHandler$mServiceConnection$1;", "mHandleIntent", "Lkotlin/Function0;", "", "mProductChangeListener", "com/xiaomi/fitness/device/manager/ui/bind/LocalBindLinkHandler$mProductChangeListener$1", "Lcom/xiaomi/fitness/device/manager/ui/bind/LocalBindLinkHandler$mProductChangeListener$1;", "removeServiceConnectListener", "removeProductListener", "handleUri", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "from", "handleConnectLink", "handleEcoConnectLink", "getPathTo", "product", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "getEcpPathTo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "isConditionMatched", "isEcoConditionMatched", "parseParam", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalBindLinkHandler implements ILinkHandler {

    @NotNull
    private static final String TAG = "ConnectLinkHandler";

    @Nullable
    private Context context;
    private boolean mCheckOOB;
    private int mFrom;

    @Nullable
    private String mMac;

    @Nullable
    private String mName;

    @Nullable
    private String mOOB;
    private int mPid;

    @NotNull
    private final LocalBindLinkHandler$mServiceConnection$1 mServiceConnection = new ServiceConnection() { // from class: com.xiaomi.fitness.device.manager.ui.bind.LocalBindLinkHandler$mServiceConnection$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            this.this$0.mHandleIntent.invoke();
            this.this$0.removeServiceConnectListener();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            DeviceModelExtKt.logi("ConnectLinkHandler", "onServiceDisconnected: ");
        }
    };

    @NotNull
    private final Function0<Unit> mHandleIntent = new Function0() { // from class: xie
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalBindLinkHandler.mHandleIntent$lambda$1(this.f39157a);
        }
    };

    @NotNull
    private final LocalBindLinkHandler$mProductChangeListener$1 mProductChangeListener = new OnProductChangeListener() { // from class: com.xiaomi.fitness.device.manager.ui.bind.LocalBindLinkHandler$mProductChangeListener$1
        @Override // com.xiaomi.fitness.device.manager.OnProductChangeListener
        public void onChange() {
            DeviceModelExtKt.logi("mProductChangeListener update get product");
            Context context = this.this$0.context;
            if (context != null) {
                this.this$0.handleConnectLink(context);
            }
            this.this$0.removeProductListener();
        }
    };

    private final String getEcpPathTo(EcoProduct product) {
        String model = product.getModel();
        if (EcoDeviceModelExtKt.isLocalDevice(product) && model.length() > 0) {
            SportManagerExportPreference.INSTANCE.setKEY_GYM_LOCAL_SPORT_TYPE(model);
        }
        return (Intrinsics.areEqual(model, "runmi.exbike.jscrm1") || Intrinsics.areEqual(model, "yesoul.exbike.jsc01y")) ? SportRouterKt.GYM_LAUNCH : "";
    }

    private final String getPathTo(Product product) {
        String model = product.getModel();
        if (com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isLocalDevice(product) && model.length() > 0) {
            SportManagerExportPreference.INSTANCE.setKEY_GYM_LOCAL_SPORT_TYPE(model);
        }
        return (Intrinsics.areEqual(model, "ksmb.treadmill.m1v1") || Intrinsics.areEqual(model, "ksmb.treadmill.m2")) ? com.xiaomi.fitness.sport_manager_export.SportRouterKt.GYM_LAUNCH : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleConnectLink(Context context) {
        WearableProduct wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: wie
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(LocalBindLinkHandler.handleConnectLink$lambda$2(this.f38005a, (WearableProduct) obj));
            }
        });
        if (wearableProduct == null) {
            Logger.i(TAG, "handleConnectLink: product == null, not support");
            ToastUtil.INSTANCE.showToast(uzi.common_not_support);
        } else {
            if (!isConditionMatched(wearableProduct)) {
                Logger.i(TAG, "handleConnectLink: bad condition matched");
                return;
            }
            String str = this.mMac;
            Intrinsics.checkNotNull(str);
            DeviceManagerExtKt.launchToBindDevice(context, "", str, this.mOOB, wearableProduct, this.mFrom, getPathTo(wearableProduct), (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handleConnectLink$lambda$2(LocalBindLinkHandler this$0, WearableProduct it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getProductId() == this$0.mPid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleEcoConnectLink(Context context) {
        EcoProduct ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).findProduct(new Function1() { // from class: yie
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(LocalBindLinkHandler.handleEcoConnectLink$lambda$3(this.f40211a, (EcoProduct) obj));
            }
        });
        if (ecoProduct == null) {
            Logger.i(TAG, "handleEcoConnectLink: product == null, not support");
            ToastUtil.INSTANCE.showToast(uzi.common_not_support);
        } else {
            if (!isEcoConditionMatched(ecoProduct)) {
                Logger.i(TAG, "handleEcoConnectLink: bad condition matched");
                return;
            }
            String str = this.mMac;
            Intrinsics.checkNotNull(str);
            EcoDeviceManagerExtKt.launchToBindDevice(context, "", str, this.mOOB, ecoProduct, this.mFrom, getEcpPathTo(ecoProduct));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handleEcoConnectLink$lambda$3(LocalBindLinkHandler this$0, EcoProduct it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getProductId() == this$0.mPid;
    }

    private final boolean isConditionMatched(Product product) {
        if (com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isLocalDevice(product)) {
            WearableDeviceModel localDeviceModel = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getLocalDeviceModel(product.getModel());
            if (localDeviceModel != null && localDeviceModel.getIsDeviceConnected() && Intrinsics.areEqual(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(localDeviceModel), this.mMac)) {
                ToastUtil.INSTANCE.showToast(uzi.k2);
                return false;
            }
            if (SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).hasOngoingSport()) {
                Logger.i(TAG, "isConditionMatched: has on going sport");
                ToastUtil.INSTANCE.showToast(uzi.H1);
                return false;
            }
        }
        return true;
    }

    private final boolean isEcoConditionMatched(EcoProduct product) {
        if (EcoDeviceModelExtKt.isLocalDevice(product)) {
            EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(product.getModel());
            if (localDeviceModel != null && localDeviceModel.getIsDeviceConnected() && Intrinsics.areEqual(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(localDeviceModel), this.mMac)) {
                ToastUtil.INSTANCE.showToast(uzi.k2);
                return false;
            }
            if (SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).hasOngoingSport()) {
                Logger.i(TAG, "isEcoConditionMatched: has on going sport");
                ToastUtil.INSTANCE.showToast(uzi.H1);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mHandleIntent$lambda$1(LocalBindLinkHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableProductManager.Companion companion = WearableProductManager.INSTANCE;
        List productList$default = ProductManager.DefaultImpls.getProductList$default(DeviceManagerExtKt.getInstance(companion), null, 1, null);
        DeviceModelExtKt.logi(TAG, "mHandleIntent: productList " + productList$default.size());
        if (productList$default.isEmpty()) {
            DeviceManagerExtKt.getInstance(companion).addProductChangeListener(this$0.mProductChangeListener);
            return Unit.INSTANCE;
        }
        Context context = this$0.context;
        if (context == null) {
            return null;
        }
        this$0.handleConnectLink(context);
        return Unit.INSTANCE;
    }

    private final void parseParam(Uri uri) {
        this.mMac = uri.getQueryParameter("btmac");
        this.mOOB = uri.getQueryParameter("oob");
        this.mName = uri.getQueryParameter("name");
        String queryParameter = uri.getQueryParameter("pid");
        String string = queryParameter != null ? StringsKt__StringsKt.trim((CharSequence) queryParameter).toString() : null;
        if (TextUtils.isEmpty(this.mMac)) {
            ToastUtil.showToast("mac is invalid");
            return;
        }
        if (TextUtils.isEmpty(string)) {
            ToastUtil.showToast("not pid");
            return;
        }
        Integer numValueOf = string != null ? Integer.valueOf(Integer.parseInt(string)) : null;
        Intrinsics.checkNotNull(numValueOf);
        this.mPid = numValueOf.intValue();
        if (TextUtils.isEmpty(this.mOOB) || StringsKt__StringsJVMKt.equals$default(this.mOOB, AbstractJsonLexerKt.NULL, false, 2, null)) {
            return;
        }
        this.mCheckOOB = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeProductListener() {
        DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).removeProductChangeListener(this.mProductChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeServiceConnectListener() {
        ServiceConnector.removeServiceConnectListener$default(ServiceConnector.INSTANCE.getInstance(), this.mServiceConnection, 0, 2, null);
    }

    @Override // com.mi.health.uri_parser.ILinkHandler
    public boolean handleUri(@NotNull Context context, @NotNull Uri uri, int from) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.context = context;
        Logger.i(TAG, "handleUri() called with: context = " + context + ", uri = " + uri + ", from = " + from);
        if (!UriMapKt.isShortLink(uri) && !UriMapKt.isLongLink(uri)) {
            return false;
        }
        if (UriMapKt.isShortLink(uri)) {
            uri = UriMapKt.getLongUri(uri);
        }
        if (UriMapKt.getActionType(uri) == null) {
            Logger.i(TAG, "handleLink: actionType == null error parse");
            return false;
        }
        this.mFrom = from;
        if (!Intrinsics.areEqual(UriMapKt.getActionType(uri), "peripheral")) {
            return false;
        }
        String path = uri.getPath();
        if (path != null && !StringsKt__StringsJVMKt.endsWith$default(path, "connect", false, 2, null)) {
            return false;
        }
        parseParam(uri);
        if (SportDeviceModel.INSTANCE.isEcoDeviceByPid(this.mPid)) {
            handleEcoConnectLink(context);
        } else {
            ServiceConnector.Companion companion = ServiceConnector.INSTANCE;
            if (ServiceConnector.isConnected$default(companion.getInstance(), 0, 1, null)) {
                handleConnectLink(context);
            } else {
                ServiceConnector.addServiceConnectListener$default(companion.getInstance(), this.mServiceConnection, 0, 2, null);
            }
        }
        return true;
    }
}
