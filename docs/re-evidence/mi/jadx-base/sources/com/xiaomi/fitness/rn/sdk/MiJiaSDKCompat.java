package com.xiaomi.fitness.rn.sdk;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.smarthome.core.SmartHomeSDK;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.mijia.sdk.api.MiJiaBleBindCallback;
import com.xiaomi.fitness.mijia.sdk.api.MiJiaBleScanCallback;
import com.xiaomi.fitness.mijia.sdk.data.BaseBean;
import com.xiaomi.fitness.mijia.sdk.data.MiJiaEnv;
import com.xiaomi.fitness.mijia.sdk.data.MiJiaScanDevice;
import com.xiaomi.fitness.mijia.sdk.sp.MiJiaPreference;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.fitness.rn.sdk.MiJiaSDKCompat;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 <2\u00020\u0001:\u0001<B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJA\u0010\f\u001a\u00020\u00052\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0010j\b\u0012\u0004\u0012\u00020\u000f`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0010j\u0002`\u0012¢\u0006\u0002\u0010\u0014JQ\u0010\u0015\u001a\u00020\u00052(\u0010\r\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\u00050\u0010j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016`\u000e2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010j\u0004\u0018\u0001`\u0012¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bJ\u0016\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001fJQ\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00050\u0010j\b\u0012\u0004\u0012\u00020#`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0010j\u0002`\u0012¢\u0006\u0002\u0010$J]\u0010%\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00050\u0010j\b\u0012\u0004\u0012\u00020#`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0010j\u0002`\u0012¢\u0006\u0002\u0010)JY\u0010*\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u000f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00050\u0010j\b\u0012\u0004\u0012\u00020#`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0010j\u0002`\u0012¢\u0006\u0002\u0010-JY\u0010.\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u000f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00050\u0010j\b\u0012\u0004\u0012\u00020#`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0010j\u0002`\u0012¢\u0006\u0002\u0010-JA\u0010/\u001a\u00020\u00052\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0010j\b\u0012\u0004\u0012\u00020\u000f`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0010j\u0002`\u0012¢\u0006\u0002\u0010\u0014JI\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u000f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00050\u0010j\b\u0012\u0004\u0012\u00020#`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0010j\u0002`\u0012¢\u0006\u0002\u00102Jj\u00103\u001a\u00020\u0005\"\n\b\u0000\u00104\u0018\u0001*\u0002052\u0006\u00106\u001a\u00020\u000f2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001082\u0016\b\u0004\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H4\u0012\u0004\u0012\u00020\u00050\u00102\u001c\b\u0004\u00109\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050:H\u0086\bø\u0001\u0000J\u0006\u0010;\u001a\u00020\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat;", "", "<init>", "()V", "init", "", "setMiJiaEnv", "env", "", "setInitListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "getBindKey", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getBoundDeviceList", "", "Lcom/xiaomi/fitness/rn/export/bean/RNDevice;", "startScanDevice", "callback", "Lcom/xiaomi/fitness/mijia/sdk/api/MiJiaBleScanCallback;", "timeoutInMilli", "startBindDevice", "device", "Lcom/xiaomi/fitness/mijia/sdk/data/MiJiaScanDevice;", "Lcom/xiaomi/fitness/mijia/sdk/api/MiJiaBleBindCallback;", "renameDevice", "did", "newName", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "deleteDevice", "pid", "ownerUid", "", "(Ljava/lang/String;ILjava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "revokePrivacy", "privacyId", "privacyVersion", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "acceptPrivacy", "getCommonConfig", "setCommonConfig", "value", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "http", "T", "Lcom/xiaomi/fitness/mijia/sdk/data/BaseBean;", "url", "map", "", "onError", "Lkotlin/Function2;", "stopScan", "Companion", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiJiaSDKCompat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<MiJiaSDKCompat> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wuf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiJiaSDKCompat.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static Gson gson = new Gson();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat;", "getInstance", "()Lcom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat;", "instance$delegate", "Lkotlin/Lazy;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Gson getGson() {
            return MiJiaSDKCompat.gson;
        }

        @NotNull
        public final MiJiaSDKCompat getInstance() {
            return (MiJiaSDKCompat) MiJiaSDKCompat.instance$delegate.getValue();
        }

        public final void setGson(@NotNull Gson gson) {
            Intrinsics.checkNotNullParameter(gson, "<set-?>");
            MiJiaSDKCompat.gson = gson;
        }
    }

    private MiJiaSDKCompat() {
    }

    public static /* synthetic */ void deleteDevice$default(MiJiaSDKCompat miJiaSDKCompat, String str, int i, Long l, Function1 function1, Function1 function2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            l = null;
        }
        miJiaSDKCompat.deleteDevice(str, i, l, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MiJiaSDKCompat instance_delegate$lambda$0() {
        return new MiJiaSDKCompat();
    }

    public final void acceptPrivacy(@NotNull String did, int privacyId, @NotNull String privacyVersion, @NotNull Function1<? super Boolean, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(privacyVersion, "privacyVersion");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        MiJiaSdkNetCompat.INSTANCE.getInstance().acceptPrivacy(did, privacyId, privacyVersion, onSuccess, onFail);
    }

    public final void deleteDevice(@NotNull String did, int pid, @Nullable Long ownerUid, @NotNull Function1<? super Boolean, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        MiJiaSdkNetCompat.INSTANCE.getInstance().deleteDevice(did, pid, ownerUid, onSuccess, onFail);
    }

    public final void getBindKey(@NotNull Function1<? super String, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        MiJiaSdkNetCompat.INSTANCE.getInstance().getBindKey(onSuccess, onFail);
    }

    public final void getBoundDeviceList(@NotNull Function1<? super List<RNDevice>, Unit> onSuccess, @Nullable Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        MiJiaSdkNetCompat.INSTANCE.getInstance().getBoundDeviceList(onSuccess, onFail);
    }

    public final void getCommonConfig(@NotNull Function1<? super String, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        MiJiaSdkNetCompat.INSTANCE.getInstance().getCommonConfig(onSuccess, onFail);
    }

    public final /* synthetic */ <T extends BaseBean> void http(String url, Map<String, ? extends Object> map, final Function1<? super T, Unit> onSuccess, final Function2<? super Integer, ? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        ArrayList arrayList = new ArrayList();
        String strA = xpd.a(map);
        arrayList.add(new KeyValuePair("data", strA));
        if (!StringsKt__StringsJVMKt.startsWith$default(url, "/v2", false, 2, null)) {
            url = "/v2" + url;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("request realUrl ");
        sb.append(url);
        sb.append("  ");
        sb.append(strA);
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path(url).addQueries(arrayList).build();
        SmartHomeRc4Api smartHomeRc4Api = SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext());
        Intrinsics.needClassReification();
        smartHomeRc4Api.sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.sdk.MiJiaSDKCompat.http.1
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult p0) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError error) {
                Integer numValueOf = error != null ? Integer.valueOf(error.getCode()) : null;
                String detail = error != null ? error.getDetail() : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onFailure ");
                sb2.append(numValueOf);
                sb2.append(" ");
                sb2.append(detail);
                AnyExtKt.main$default(null, new MiJiaSDKCompat$http$1$onFailure$1(error, onError, null), 1, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        String str = netResult.mResponse;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onSuccess mResponse:");
                        sb2.append(str);
                        try {
                            String str2 = netResult.mResponse;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            Gson gson2 = MiJiaSDKCompat.INSTANCE.getGson();
                            Intrinsics.reifiedOperationMarker(4, "T");
                            ?? FromJson = gson2.fromJson(str2, (Class<??>) BaseBean.class);
                            objectRef.element = FromJson;
                            if (((BaseBean) FromJson).isSuccess()) {
                                AnyExtKt.main$default(null, new MiJiaSDKCompat$http$1$onSuccess$2(onSuccess, objectRef, null), 1, null);
                                return;
                            }
                            int code = ((BaseBean) objectRef.element).getCode();
                            String message = ((BaseBean) objectRef.element).getMessage();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onSuccess not  ");
                            sb3.append(code);
                            sb3.append("  ");
                            sb3.append(message);
                            AnyExtKt.main$default(null, new MiJiaSDKCompat$http$1$onSuccess$1(onError, objectRef, null), 1, null);
                            return;
                        } catch (Exception e) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("onSuccess ");
                            sb4.append(e);
                            AnyExtKt.main$default(null, new MiJiaSDKCompat$http$1$onSuccess$3(onError, null), 1, null);
                            return;
                        }
                    }
                }
                AnyExtKt.main$default(null, new MiJiaSDKCompat$http$1$onSuccess$4(onSuccess, null), 1, null);
            }
        });
    }

    public final void init() {
        MiJiaSDKInit.INSTANCE.getInstance().start();
    }

    public final void renameDevice(@NotNull String did, @NotNull String newName, @NotNull Function1<? super Boolean, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(newName, "newName");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        MiJiaSdkNetCompat.INSTANCE.getInstance().renameDevice(did, newName, onSuccess, onFail);
    }

    public final void revokePrivacy(@NotNull String did, int privacyId, @NotNull String privacyVersion, @NotNull Function1<? super Boolean, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(privacyVersion, "privacyVersion");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        MiJiaSdkNetCompat.INSTANCE.getInstance().revokePrivacy(did, privacyId, privacyVersion, onSuccess, onFail);
    }

    public final void setCommonConfig(@NotNull String value, @NotNull Function1<? super Boolean, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        MiJiaSdkNetCompat.INSTANCE.getInstance().setCommonConfig(value, onSuccess, onFail);
    }

    public final void setInitListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        MiJiaSDKInit.INSTANCE.getInstance().setInitListener(listener);
    }

    public final void setMiJiaEnv(@MiJiaEnv int env) {
        MiJiaPreference.INSTANCE.setMIJIA_ENV(env);
    }

    public final void startBindDevice(@NotNull MiJiaScanDevice device, @NotNull MiJiaBleBindCallback callback) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MiJiaSdkBleCompat.INSTANCE.getInstance().startBindDevice(device, callback);
    }

    public final void startScanDevice(@NotNull MiJiaBleScanCallback callback, int timeoutInMilli) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        MiJiaSdkBleCompat.INSTANCE.getInstance().startScanDevice(callback, timeoutInMilli);
    }

    public final void stopScan() {
        MiJiaSdkBleCompat.INSTANCE.getInstance().stopScan();
    }
}
