package com.xiaomi.smarthome.core.server.internal.api;

import android.text.TextUtils;
import com.xiaomi.smarthome.account.AccountDepApi;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingManager;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.setting.ServerSetting;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/smarthome/core/server/internal/api/HostApiIO;", "", "()V", "SMART_HOME_API_RELEASE", "", "buildHost", "netRequest", "Lcom/xiaomi/smarthome/core/entity/net/NetRequest;", "buildHostPath", "getTestHost", "smarthome-network-impl_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HostApiIO {

    @NotNull
    public static final HostApiIO INSTANCE = new HostApiIO();

    @NotNull
    private static final String SMART_HOME_API_RELEASE = "api.io.mi.com";

    private HostApiIO() {
    }

    @JvmStatic
    @NotNull
    public static final String buildHostPath(@NotNull NetRequest netRequest) {
        Intrinsics.checkNotNullParameter(netRequest, "netRequest");
        String prefix = netRequest.getPrefix();
        if (prefix != null && prefix.length() != 0) {
            return INSTANCE.buildHost(netRequest);
        }
        String midPath = MiJiaEnvironment.getMidPath();
        Intrinsics.checkNotNullExpressionValue(midPath, "getMidPath()");
        return midPath.length() == 0 ? Intrinsics.stringPlus(INSTANCE.buildHost(netRequest), "/app") : Intrinsics.stringPlus(INSTANCE.buildHost(netRequest), MiJiaEnvironment.getMidPath());
    }

    @JvmStatic
    @NotNull
    public static final String getTestHost() {
        return "http://localhost:8888";
    }

    /* JADX WARN: Code duplicated, block: B:112:0x017b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final String buildHost(@NotNull NetRequest netRequest) {
        String strStringPlus;
        Intrinsics.checkNotNullParameter(netRequest, "netRequest");
        ServerBean server = GlobalDynamicSettingManager.getInstance().getServer();
        String serverEnv = GlobalDynamicSettingManager.getInstance().getServerEnv();
        String prefix = netRequest.getPrefix();
        String path = netRequest.getPath();
        if (path != null) {
            switch (path.hashCode()) {
                case -2065378218:
                    if (path.equals("/homeroom/addroom")) {
                        prefix = "core.";
                    }
                    break;
                case -1967680597:
                    if (path.equals("/v2/irdevice/controllers")) {
                        prefix = "core.";
                    }
                    break;
                case -1708354789:
                    if (path.equals("/v2/plugin/get_support_models")) {
                        prefix = "core.";
                    }
                    break;
                case -1685724369:
                    if (path.equals("/v2/pincode/check_generic")) {
                        prefix = "core.";
                    }
                    break;
                case -1506740652:
                    if (path.equals("/v2/irdevice/send_key")) {
                        prefix = "core.";
                    }
                    break;
                case -1487702837:
                    if (path.equals("/v2/plugin/get_config_info_new")) {
                        prefix = "core.";
                    }
                    break;
                case -1339606541:
                    if (path.equals("/v2/home/device_list_page")) {
                        prefix = "core.";
                    }
                    break;
                case -1323866311:
                    if (path.equals("/v2/device/deviceinfo")) {
                        prefix = "core.";
                    }
                    break;
                case -1223049751:
                    if (path.equals("/v2/home/get_union_order")) {
                        prefix = "core.";
                    }
                    break;
                case -1069396582:
                    if (path.equals("/v2/productconfig/single_pull")) {
                        prefix = "core.";
                    }
                    break;
                case -992215921:
                    if (path.equals("/homeroom/gethome")) {
                        prefix = "core.";
                    }
                    break;
                case -991867576:
                    if (path.equals("/home/device_list_page")) {
                        prefix = "core.";
                    }
                    break;
                case -947436669:
                    if (path.equals("/device/batchdevicedatas")) {
                        prefix = "core.";
                    }
                    break;
                case -589736716:
                    if (path.equals("/v2/blemesh/dev_belong")) {
                        prefix = "core.";
                    }
                    break;
                case -116552882:
                    if (path.equals("/miotspec/prop/get")) {
                        prefix = "core.";
                    }
                    break;
                case -116541350:
                    if (path.equals("/miotspec/prop/set")) {
                        prefix = "core.";
                    }
                    break;
                case 115391450:
                    if (path.equals("/miotspec/action")) {
                        prefix = "core.";
                    }
                    break;
                case 147059435:
                    if (path.equals("/share/askbluetoothkey")) {
                        prefix = "core.";
                    }
                    break;
                case 208865906:
                    if (path.equals("/smh/get_home_data_new")) {
                        prefix = "core.";
                    }
                    break;
                case 233372511:
                    if (path.equals("/v2/device/miss_get_vendor")) {
                        prefix = "core.";
                    }
                    break;
                case 630473925:
                    if (path.equals("/v2/miotspec/action")) {
                        prefix = "core.";
                    }
                    break;
                case 982485715:
                    if (path.equals("/device/set_privacy_confirmation")) {
                        prefix = "core.";
                    }
                    break;
                case 1085164107:
                    if (path.equals("/smh/get_status")) {
                        prefix = "core.";
                    }
                    break;
                case 1208616080:
                    if (path.equals("/v2/plugin/fetch_plugin")) {
                        prefix = "core.";
                    }
                    break;
                case 1405548113:
                    if (path.equals("/v2/irdevice/controller/key/click")) {
                        prefix = "core.";
                    }
                    break;
                case 1562882183:
                    if (path.equals("/v2/home/local_device_list")) {
                        prefix = "core.";
                    }
                    break;
                case 1786566751:
                    if (path.equals("/device/get_privacy_confirmation")) {
                        prefix = "core.";
                    }
                    break;
                case 1898081550:
                    if (path.equals("/device/deviceinfo")) {
                        prefix = "core.";
                    }
                    break;
                case 1898278001:
                    if (path.equals("/device/devicepass")) {
                        prefix = "core.";
                    }
                    break;
                case 1945710230:
                    if (path.equals("/plugin/get_config_info_new")) {
                        prefix = "core.";
                    }
                    break;
                case 1955837403:
                    if (path.equals("/v2/irdevice/controller/keys")) {
                        prefix = "core.";
                    }
                    break;
                case 1994671251:
                    if (path.equals("/v2/home/home_device_list")) {
                        prefix = "core.";
                    }
                    break;
                case 2022545863:
                    if (path.equals("/app/v2/plugin/get_protocol")) {
                        prefix = "core.";
                    }
                    break;
                case 2049597209:
                    if (path.equals("/v2/product/category_v2")) {
                        prefix = "core.";
                    }
                    break;
                case 2090438916:
                    if (path.equals("/v2/homeroom/gethome")) {
                        prefix = "core.";
                    }
                    break;
            }
        }
        boolean zIsWithOutPrefix = MiJiaEnvironment.isWithOutPrefix();
        if (prefix == null || zIsWithOutPrefix) {
            prefix = "";
        } else if (prefix.length() != 0 && !StringsKt__StringsJVMKt.endsWith$default(prefix, ".", false, 2, null)) {
            prefix = Intrinsics.stringPlus(prefix, ".");
        }
        if (server == null || ServerCompact.isChinaMainLand(server)) {
            if (TextUtils.isEmpty(serverEnv) || StringsKt__StringsJVMKt.equals(serverEnv, "release", true)) {
                strStringPlus = (AccountDepApi.getInstance().isDebugUser() || AccountDepApi.getInstance().isGreyUser()) ? "pv." + ((Object) prefix) + "api.io.mi.com" : Intrinsics.stringPlus(prefix, "api.io.mi.com");
            } else if (StringsKt__StringsJVMKt.equals(serverEnv, ServerSetting.SERVER_ENV_PREVIEW, true)) {
                strStringPlus = "pv." + ((Object) prefix) + "api.io.mi.com";
            } else if (StringsKt__StringsJVMKt.equals(serverEnv, "at", true)) {
                strStringPlus = "at." + ((Object) prefix) + "api.io.mi.com";
            } else {
                strStringPlus = Intrinsics.stringPlus(prefix, "api.io.mi.com");
            }
        } else if (TextUtils.isEmpty(serverEnv) || StringsKt__StringsJVMKt.equals(serverEnv, "release", true)) {
            strStringPlus = (AccountDepApi.getInstance().isDebugUser() || AccountDepApi.getInstance().isGreyUser()) ? "pv-" + ((Object) server.machineCode) + '.' + ((Object) prefix) + "api.io.mi.com" : server.machineCode + '.' + ((Object) prefix) + "api.io.mi.com";
        } else if (StringsKt__StringsJVMKt.equals(serverEnv, ServerSetting.SERVER_ENV_PREVIEW, true)) {
            strStringPlus = "pv-" + ((Object) server.machineCode) + '.' + ((Object) prefix) + "api.io.mi.com";
        } else if (StringsKt__StringsJVMKt.equals(serverEnv, "at", true)) {
            strStringPlus = "at-" + ((Object) server.machineCode) + '.' + ((Object) prefix) + "api.io.mi.com";
        } else {
            strStringPlus = server.machineCode + '.' + ((Object) prefix) + "api.io.mi.com";
        }
        return Intrinsics.stringPlus("https://", strStringPlus);
    }
}
