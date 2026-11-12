package com.smarthome.core;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.smarthome.core.SDKBleCoreProvider;
import com.smarthome.core.modelconfig.PluginDeviceManager;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.bluetooth.Response;
import com.xiaomi.smarthome.cache.BleCacheManager;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.account.MiJiaAccountManager;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleDeleteDeviceCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleKeyValuePair;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetRequest;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleRpcCallback;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.device.api.BleMeshFirmwareUpdateInfo;
import com.xiaomi.smarthome.device.api.McuUpdateInfo;
import com.xiaomi.smarthome.frame.AsyncCallback;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.common.imagecache.ImageCacheUtils;
import com.xiaomi.smarthome.library.crypto.MD5Util;
import com.xiaomi.smarthome.library.http.Error;
import com.xiaomi.smarthome.library.http.HttpApi;
import com.xiaomi.smarthome.library.http.Request;
import com.xiaomi.smarthome.library.http.async.FileAsyncHandler;
import com.xiaomi.smarthome.library.http.async.HttpAsyncHandle;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002]^B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0002J$\u0010\u000f\u001a\u00020\r2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J&\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u0012\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0014\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u0011H\u0016J\u0012\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\n\u0010(\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u0004H\u0002J\b\u0010+\u001a\u00020\u0004H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0018H\u0016J\u0012\u0010/\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u00100\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0016J6\u00101\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u0018\u00104\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u00105\u001a\u0002062\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u00107\u001a\u0002062\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u00108\u001a\u000206H\u0016J\b\u00109\u001a\u000206H\u0016J\b\u0010:\u001a\u000206H\u0016J\u0012\u0010;\u001a\u0002062\b\u0010<\u001a\u0004\u0018\u00010\u0004H\u0016J$\u0010=\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u000106\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010@\u001a\u0002062\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010A\u001a\u0002062\b\u0010<\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010B\u001a\u0002062\b\u0010<\u001a\u0004\u0018\u00010\u0004H\u0016J0\u0010C\u001a\u00020\r2\b\u0010?\u001a\u0004\u0018\u00010\u00042\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u001c\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020\u00042\b\u0010L\u001a\u0004\u0018\u00010%H\u0002J\u0012\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u001c\u0010O\u001a\u00020\r2\b\u0010P\u001a\u0004\u0018\u00010\u00042\b\u0010G\u001a\u0004\u0018\u00010\u0004H\u0016J0\u0010Q\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010R\u001a\u0004\u0018\u00010\u00042\b\u0010S\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010TH\u0016J\u001c\u0010U\u001a\u00020\r2\b\u0010V\u001a\u0004\u0018\u00010W2\b\u0010\u0012\u001a\u0004\u0018\u00010XH\u0016J\u001c\u0010Y\u001a\u00020\r2\b\u0010Z\u001a\u0004\u0018\u00010\u00042\b\u0010S\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010[\u001a\u00020\r2\b\u0010Z\u001a\u0004\u0018\u00010\u00042\b\u0010S\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\\\u001a\u00020\r2\b\u0010Z\u001a\u0004\u0018\u00010\u00042\b\u0010S\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lcom/smarthome/core/SDKBleCoreProvider;", "Lcom/xiaomi/smarthome/core/server/internal/bluetooth/IBleCoreProvider;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "mHandler", "Landroid/os/Handler;", "mHttpAsyncHandlers", "", "Lcom/smarthome/core/SDKBleCoreProvider$UpgradeRequest;", "cancelDownloadBleFirmwareInner", "", "url", "delDeviceBatch", "didList", "", "callback", "Lcom/xiaomi/smarthome/core/server/internal/bluetooth/blecore/BleDeleteDeviceCallback;", "dispatchProgress", b.I, "Lcom/smarthome/core/SDKBleCoreProvider$UpgradeResponse;", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "dispatchResponse", "code", "path", "generateOneTimePwdBySelf", "did", "Lcom/xiaomi/smarthome/frame/AsyncCallback;", "Lcom/xiaomi/smarthome/frame/Error;", "getBluetoothBindStyle", "model", "getCurrentHome", "Lcom/xiaomi/smarthome/homeroom/model/Home;", "getDeviceByDid", "Lcom/xiaomi/smarthome/device/Device;", "getDeviceList", "getDownloadFileName", "getDownloadLocalDir", "getFirmwareMD5", "localPath", "getMachineCode", "getMiId", "getModelByProductId", "pid", "getPluginNameByModel", "getProductIdByModel", "initOneTimeContextBySelf", "interval", "digits", "innerDownloadBleFirmware", "isBluetoothGatewayDevice", "", "isBluetoothSecurityChipDevice", "isEuropeServer", "isInternationalServer", "isKuailianUseA4", "isLockCanShare", "p0", "isMeshDevice", "Landroid/util/Pair;", "mac", "isPluginDevice", "isShareDevice", "isXiaoaiSupportA4", "onBleCharacterChanged", "service", "Ljava/util/UUID;", "character", "value", "", "parseVersionResponse", "Lcom/xiaomi/smarthome/device/api/BleMeshFirmwareUpdateInfo;", "result", "device", "prepareDownloadFile", "Ljava/io/File;", "reportStat", "key", "rpcAsync", "token", "msg", "Lcom/xiaomi/smarthome/core/server/internal/bluetooth/blecore/BleRpcCallback;", "sendSmartHomeRequest", "bleNetRequest", "Lcom/xiaomi/smarthome/core/server/internal/bluetooth/blecore/BleNetRequest;", "Lcom/xiaomi/smarthome/core/server/internal/bluetooth/blecore/BleNetCallback;", "writeLogOnAll", "tag", "writeLogOnDebug", "writeLogOnGrey", "UpgradeRequest", "UpgradeResponse", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SDKBleCoreProvider implements IBleCoreProvider {

    @NotNull
    private final String TAG = "smartCoreTest";

    @NotNull
    private final Map<String, UpgradeRequest> mHttpAsyncHandlers = new LinkedHashMap();

    @NotNull
    private Handler mHandler = new Handler(Looper.getMainLooper());

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/smarthome/core/SDKBleCoreProvider$UpgradeRequest;", "", "handle", "Lcom/xiaomi/smarthome/library/http/async/HttpAsyncHandle;", b.I, "Lcom/smarthome/core/SDKBleCoreProvider$UpgradeResponse;", "(Lcom/xiaomi/smarthome/library/http/async/HttpAsyncHandle;Lcom/smarthome/core/SDKBleCoreProvider$UpgradeResponse;)V", "getHandle", "()Lcom/xiaomi/smarthome/library/http/async/HttpAsyncHandle;", "setHandle", "(Lcom/xiaomi/smarthome/library/http/async/HttpAsyncHandle;)V", "getResponse", "()Lcom/smarthome/core/SDKBleCoreProvider$UpgradeResponse;", "setResponse", "(Lcom/smarthome/core/SDKBleCoreProvider$UpgradeResponse;)V", BroadcastsKt.SILENT_PUSHING_CANCEL, "", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class UpgradeRequest {

        @Nullable
        private HttpAsyncHandle handle;

        @NotNull
        private UpgradeResponse response;

        public UpgradeRequest(@Nullable HttpAsyncHandle httpAsyncHandle, @NotNull UpgradeResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.handle = httpAsyncHandle;
            this.response = response;
        }

        public final void cancel() {
            HttpAsyncHandle httpAsyncHandle = this.handle;
            if (httpAsyncHandle != null) {
                Intrinsics.checkNotNull(httpAsyncHandle);
                httpAsyncHandle.cancel();
            }
        }

        @Nullable
        public final HttpAsyncHandle getHandle() {
            return this.handle;
        }

        @NotNull
        public final UpgradeResponse getResponse() {
            return this.response;
        }

        public final void setHandle(@Nullable HttpAsyncHandle httpAsyncHandle) {
            this.handle = httpAsyncHandle;
        }

        public final void setResponse(@NotNull UpgradeResponse upgradeResponse) {
            Intrinsics.checkNotNullParameter(upgradeResponse, "<set-?>");
            this.response = upgradeResponse;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/smarthome/core/SDKBleCoreProvider$UpgradeResponse;", "Lcom/xiaomi/smarthome/bluetooth/Response$BleResponse;", "Landroid/os/Bundle;", "onProgress", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface UpgradeResponse extends Response.BleResponse<Bundle> {
        void onProgress(int progress);
    }

    private final void cancelDownloadBleFirmwareInner(String url) {
        UpgradeRequest upgradeRequestRemove;
        if (TextUtils.isEmpty(url) || (upgradeRequestRemove = this.mHttpAsyncHandlers.remove(url)) == null) {
            return;
        }
        upgradeRequestRemove.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchProgress(final UpgradeResponse response, final int progress) {
        this.mHandler.post(new Runnable() { // from class: a7l
            @Override // java.lang.Runnable
            public final void run() {
                SDKBleCoreProvider.m200dispatchProgress$lambda1(response, progress);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dispatchProgress$lambda-1, reason: not valid java name */
    public static final void m200dispatchProgress$lambda1(UpgradeResponse response, int i) {
        Intrinsics.checkNotNullParameter(response, "$response");
        response.onProgress(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchResponse(final UpgradeResponse response, final int code, final String path) {
        this.mHandler.post(new Runnable() { // from class: z6l
            @Override // java.lang.Runnable
            public final void run() {
                SDKBleCoreProvider.m201dispatchResponse$lambda2(code, response, path, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dispatchResponse$lambda-2, reason: not valid java name */
    public static final void m201dispatchResponse$lambda2(int i, UpgradeResponse response, String path, SDKBleCoreProvider this$0) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(path, "$path");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 0) {
            response.onResponse(i, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("path", path);
        bundle.putString("md5", this$0.getFirmwareMD5(path));
        response.onResponse(0, bundle);
    }

    private final String getDownloadFileName(String url) {
        if (TextUtils.isEmpty(url)) {
            return MD5Util.getMd5Digest(url);
        }
        String path = URI.create(url).getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) path, "/", 0, false, 6, (Object) null);
        if (iLastIndexOf$default < 0) {
            return path;
        }
        String strSubstring = path.substring(iLastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    private final String getDownloadLocalDir() {
        String path;
        SmartHomeSDK smartHomeSDK = SmartHomeSDK.INSTANCE;
        if (smartHomeSDK.getContext() == null || Intrinsics.areEqual("mounted", Environment.getExternalStorageState()) || !ImageCacheUtils.isExternalStorageRemovable()) {
            path = ImageCacheUtils.getExternalCacheDir(MiJiaEnvironment.getAppContext()).getPath();
        } else {
            StringBuilder sb = new StringBuilder();
            Context context = smartHomeSDK.getContext();
            Intrinsics.checkNotNull(context);
            sb.append(context.getCacheDir().getPath());
            sb.append((Object) File.separator);
            sb.append("app");
            path = sb.toString();
        }
        return new File(path, "ble").getAbsolutePath();
    }

    private final String getFirmwareMD5(String localPath) {
        if (TextUtils.isEmpty(localPath)) {
            return "";
        }
        File file = new File(localPath);
        return (file.exists() && file.isFile()) ? MD5Util.getFileMD5(file) : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.io.File] */
    private final void innerDownloadBleFirmware(final String url, final UpgradeResponse response) {
        if (TextUtils.isEmpty(url)) {
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("downloadFirmware v2", Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        BluetoothLog.v(str);
        if (TextUtils.isEmpty(url)) {
            response.onResponse(-3, null);
            return;
        }
        if (this.mHttpAsyncHandlers.containsKey(url)) {
            response.onResponse(-13, null);
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            objectRef.element = prepareDownloadFile(url);
            Request requestBuild = new Request.Builder().method("GET").url(url).build();
            T t = objectRef.element;
            Intrinsics.checkNotNull(t);
            final String absolutePath = ((File) t).getAbsolutePath();
            HttpAsyncHandle httpAsyncHandleSendRequestDefault = HttpApi.sendRequestDefault(requestBuild, new FileAsyncHandler(objectRef, this, url, response, absolutePath) { // from class: com.smarthome.core.SDKBleCoreProvider$innerDownloadBleFirmware$handle$1
                final /* synthetic */ Ref.ObjectRef<File> $localFile;
                final /* synthetic */ String $path;
                final /* synthetic */ SDKBleCoreProvider.UpgradeResponse $response;
                final /* synthetic */ String $url;
                final /* synthetic */ SDKBleCoreProvider this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(objectRef.element);
                    this.$localFile = objectRef;
                    this.this$0 = this;
                    this.$url = url;
                    this.$response = response;
                    this.$path = absolutePath;
                }

                @Override // com.xiaomi.smarthome.library.http.async.FileAsyncHandler, com.xiaomi.smarthome.library.http.async.OkhttpCallback
                public void onFailure(@NotNull Error error, @NotNull Exception e, @NotNull okhttp3.Response callback) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    Intrinsics.checkNotNullParameter(e, "e");
                    Intrinsics.checkNotNullParameter(callback, "callback");
                    FileUtils.deleteFile(this.$path);
                    this.this$0.mHttpAsyncHandlers.remove(this.$url);
                    this.this$0.dispatchResponse(this.$response, -1, "");
                }

                @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
                public void onProgress(long bytesWritten, long totalSize) {
                    float f = 0.0f;
                    float f2 = totalSize > 0 ? bytesWritten / totalSize : 0.0f;
                    if (f2 >= 0.0f) {
                        f = 1.0f;
                        if (1.0f >= f2) {
                            f = f2;
                        }
                    }
                    this.this$0.dispatchProgress(this.$response, (int) (f * 100));
                }

                @Override // com.xiaomi.smarthome.library.http.async.FileAsyncHandler, com.xiaomi.smarthome.library.http.async.OkhttpCallback
                public void onSuccess(@NotNull File result, @NotNull okhttp3.Response callback) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    Intrinsics.checkNotNullParameter(callback, "callback");
                    this.this$0.mHttpAsyncHandlers.remove(this.$url);
                    SDKBleCoreProvider sDKBleCoreProvider = this.this$0;
                    SDKBleCoreProvider.UpgradeResponse upgradeResponse = this.$response;
                    String path = this.$path;
                    Intrinsics.checkNotNullExpressionValue(path, "path");
                    sDKBleCoreProvider.dispatchResponse(upgradeResponse, 0, path);
                }
            });
            if (httpAsyncHandleSendRequestDefault != null) {
                this.mHttpAsyncHandlers.put(url, new UpgradeRequest(httpAsyncHandleSendRequestDefault, response));
            }
        } catch (Throwable th) {
            response.onResponse(-1, null);
            BluetoothLog.e(th);
        }
    }

    private final BleMeshFirmwareUpdateInfo parseVersionResponse(String result, Device device) throws JSONException {
        if (TextUtils.isEmpty(result)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(result);
        BleMeshFirmwareUpdateInfo bleMeshFirmwareUpdateInfo = new BleMeshFirmwareUpdateInfo();
        bleMeshFirmwareUpdateInfo.version = jSONObject.optString("version");
        bleMeshFirmwareUpdateInfo.safeUrl = jSONObject.optString("safe_url");
        bleMeshFirmwareUpdateInfo.timeout = jSONObject.optInt("time_out", 30);
        bleMeshFirmwareUpdateInfo.url = jSONObject.optString("url");
        bleMeshFirmwareUpdateInfo.changeLog = jSONObject.optString("changeLog");
        bleMeshFirmwareUpdateInfo.md5 = jSONObject.optString("md5");
        if (device != null) {
            BleCacheManager.getInstance().getBleDeviceState(device.mac).setLatestVersion(bleMeshFirmwareUpdateInfo.version);
        }
        String strOptString = jSONObject.optString("mcu_version");
        String strOptString2 = jSONObject.optString("mcu_safe_url");
        String strOptString3 = jSONObject.optString("mcu_md5");
        if (!TextUtils.isEmpty(strOptString)) {
            McuUpdateInfo mcuUpdateInfo = new McuUpdateInfo();
            mcuUpdateInfo.version = strOptString;
            mcuUpdateInfo.url = strOptString2;
            mcuUpdateInfo.md5 = strOptString3;
            bleMeshFirmwareUpdateInfo.mcuUpdateInfo = mcuUpdateInfo;
        }
        return bleMeshFirmwareUpdateInfo;
    }

    private final File prepareDownloadFile(String url) {
        String downloadLocalDir = getDownloadLocalDir();
        if (!(!TextUtils.isEmpty(downloadLocalDir))) {
            throw new IllegalStateException("downloadDir null".toString());
        }
        File file = new File(downloadLocalDir);
        if (!file.exists() && !file.mkdirs()) {
            throw new IllegalStateException("downloadDir not exist or mkdirs failed".toString());
        }
        if (file.isFile() && (!file.delete() || !file.mkdirs())) {
            throw new IllegalStateException("downloadDir is file, delete failed or mkdirs failed".toString());
        }
        String downloadFileName = getDownloadFileName(url);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) downloadLocalDir);
        sb.append((Object) File.separator);
        sb.append((Object) downloadFileName);
        String string = sb.toString();
        FileUtils.deleteFile(string);
        File fileCreateFileIfNotExists = FileUtils.createFileIfNotExists(string);
        if (fileCreateFileIfNotExists != null) {
            return fileCreateFileIfNotExists;
        }
        FileUtils.deleteFile(string);
        throw new IllegalStateException("create download file failed");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void delDeviceBatch(@Nullable List<String> didList, @Nullable BleDeleteDeviceCallback callback) {
        if (callback == null) {
            return;
        }
        callback.onFailure(new Bundle());
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void generateOneTimePwdBySelf(@Nullable String did, @NotNull AsyncCallback<String, com.xiaomi.smarthome.frame.Error> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public int getBluetoothBindStyle(@Nullable String model) {
        return 0;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    @Nullable
    public Home getCurrentHome() {
        return null;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    @Nullable
    public Device getDeviceByDid(@Nullable String did) {
        return null;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    @NotNull
    public List<Device> getDeviceList() {
        return new ArrayList();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    @NotNull
    public String getMachineCode() {
        return "cn";
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    @NotNull
    public String getMiId() {
        String miId = MiJiaAccountManager.getInstance().getMiId();
        Intrinsics.checkNotNullExpressionValue(miId, "getInstance().miId");
        return miId;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    @NotNull
    public String getModelByProductId(int pid) {
        String modelByProductId = PluginDeviceManager.INSTANCE.getInstance().getModelByProductId(pid);
        return (modelByProductId == null || modelByProductId.length() == 0) ? "" : modelByProductId;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    @NotNull
    public String getPluginNameByModel(@Nullable String model) {
        return "";
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public int getProductIdByModel(@Nullable String model) {
        return PluginDeviceManager.INSTANCE.getInstance().getProductIdByModel(model);
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void initOneTimeContextBySelf(@Nullable String did, int interval, int digits, @NotNull AsyncCallback<String, com.xiaomi.smarthome.frame.Error> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isBluetoothGatewayDevice(@Nullable String model) {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isBluetoothSecurityChipDevice(@Nullable String model) {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isEuropeServer() {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isInternationalServer() {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isKuailianUseA4() {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isLockCanShare(@Nullable String p0) {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    @Nullable
    public Pair<Boolean, String> isMeshDevice(@Nullable String mac) {
        return TextUtils.isEmpty(mac) ? new Pair<>(Boolean.FALSE, "") : new Pair<>(Boolean.FALSE, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isPluginDevice(@Nullable String model) {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isShareDevice(@Nullable String p0) {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public boolean isXiaoaiSupportA4(@Nullable String p0) {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void onBleCharacterChanged(@Nullable String mac, @Nullable UUID service, @Nullable UUID character, @Nullable byte[] value) {
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void reportStat(@Nullable String key, @Nullable String value) {
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void rpcAsync(@Nullable String did, @Nullable String token, @Nullable String msg, @Nullable BleRpcCallback callback) {
        if (callback == null) {
            return;
        }
        callback.onFailure(-1, "BleCoreProvider need implement");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void sendSmartHomeRequest(@Nullable BleNetRequest bleNetRequest, @Nullable final BleNetCallback callback) {
        Intrinsics.stringPlus("sendSmartHomeRequest, request:", bleNetRequest);
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNull(bleNetRequest);
        if (bleNetRequest.getQueryParams() != null && bleNetRequest.getQueryParams().size() > 0) {
            for (BleKeyValuePair bleKeyValuePair : bleNetRequest.getQueryParams()) {
                arrayList.add(new KeyValuePair(bleKeyValuePair.getKey(), bleKeyValuePair.getValue()));
            }
        }
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(new NetRequest.Builder().method(bleNetRequest.getMethod()).path(bleNetRequest.getPath()).addQueries(arrayList).build(), new NetCallback<NetResult, NetError>() { // from class: com.smarthome.core.SDKBleCoreProvider.sendSmartHomeRequest.1
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(@Nullable NetResult result) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(@Nullable NetError error) {
                BleNetCallback bleNetCallback = callback;
                if (bleNetCallback != null) {
                    if (error != null) {
                        bleNetCallback.onFailed(error.getCode(), error.getDetail());
                    } else {
                        bleNetCallback.onFailed(-9999, "error is null");
                    }
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(@Nullable NetResult result) {
                BleNetCallback bleNetCallback = callback;
                if (bleNetCallback != null) {
                    if (result != null) {
                        bleNetCallback.onSuccess(result.mResponse);
                    } else {
                        bleNetCallback.onFailed(-9999, "response is null");
                    }
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void writeLogOnAll(@Nullable String tag, @Nullable String msg) {
        if (msg == null) {
            return;
        }
        getTAG();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void writeLogOnDebug(@Nullable String tag, @Nullable String msg) {
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.IBleCoreProvider
    public void writeLogOnGrey(@Nullable String tag, @Nullable String msg) {
    }
}
