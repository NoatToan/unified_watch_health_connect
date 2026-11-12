package com.xiaomi.fitness.rn.sdk;

import android.text.TextUtils;
import com.smarthome.core.SmartCallBack;
import com.smarthome.core.SmartHomeSDK;
import com.smarthome.core.device.SmartDeviceInfo;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.smarthome.core.modelconfig.PluginDeviceInfoStatus;
import com.smarthome.core.modelconfig.PluginDeviceManager;
import com.smarthome.core.scan.DeviceScanManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.wearmode.SwitchWearModeViewModel;
import com.xiaomi.fitness.login.bean.PrivacyAgreeModel;
import com.xiaomi.fitness.mijia.sdk.data.BaseBean;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.rn.bean.ConfigInfo;
import com.xiaomi.fitness.rn.bean.ConfigInfos;
import com.xiaomi.fitness.rn.bean.DeleteDeviceResult;
import com.xiaomi.fitness.rn.bean.DeleteMiJiaDeviceInfo;
import com.xiaomi.fitness.rn.bean.GetCommonConfigResult;
import com.xiaomi.fitness.rn.bean.RevokePrivacyResult;
import com.xiaomi.fitness.rn.bean.SetCommonConfigResult;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.fitness.rn.extetions.DeviceExtKt;
import com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\b`\u00072\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\u000b¢\u0006\u0002\u0010\rJQ\u0010\u000e\u001a\u00020\u00052(\u0010\u0006\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00050\tj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f`\u00072\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tj\u0004\u0018\u0001`\u000b¢\u0006\u0002\u0010\rJQ\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0014`\u00072\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\u000b¢\u0006\u0002\u0010\u0015J]\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0014`\u00072\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\u000b¢\u0006\u0002\u0010\u001bJY\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\b2\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0014`\u00072\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\u000b¢\u0006\u0002\u0010\u001fJY\u0010 \u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\b2\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0014`\u00072\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\u000b¢\u0006\u0002\u0010\u001fJA\u0010!\u001a\u00020\u00052\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\b`\u00072\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\u000b¢\u0006\u0002\u0010\rJI\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\b2\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0014`\u00072\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\u000b¢\u0006\u0002\u0010$¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat;", "", "<init>", "()V", "getBindKey", "", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getBoundDeviceList", "", "Lcom/xiaomi/fitness/rn/export/bean/RNDevice;", "renameDevice", "did", "newName", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "deleteDevice", "pid", "", "ownerUid", "", "(Ljava/lang/String;ILjava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "revokePrivacy", "privacyId", "privacyVersion", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "acceptPrivacy", "getCommonConfig", "setCommonConfig", "value", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMiJiaSdkNetCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompatKt\n+ 3 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat\n*L\n1#1,263:1\n221#2,6:264\n263#2:270\n221#2,6:271\n263#2:277\n104#3,12:278\n160#3:290\n104#3,12:291\n160#3:303\n104#3,12:304\n160#3:316\n104#3,12:317\n160#3:329\n104#3,12:330\n160#3:342\n*S KotlinDebug\n*F\n+ 1 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n48#1:264,6\n48#1:270\n97#1:271,6\n97#1:277\n109#1:278,12\n109#1:290\n131#1:291,12\n131#1:303\n153#1:304,12\n153#1:316\n171#1:317,12\n171#1:329\n201#1:330,12\n201#1:342\n*E\n"})
public final class MiJiaSdkNetCompat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<MiJiaSdkNetCompat> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zuf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiJiaSdkNetCompat.instance_delegate$lambda$13();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat;", "getInstance", "()Lcom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat;", "instance$delegate", "Lkotlin/Lazy;", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MiJiaSdkNetCompat getInstance() {
            return (MiJiaSdkNetCompat) MiJiaSdkNetCompat.instance$delegate.getValue();
        }
    }

    private MiJiaSdkNetCompat() {
    }

    public static /* synthetic */ void deleteDevice$default(MiJiaSdkNetCompat miJiaSdkNetCompat, String str, int i, Long l, Function1 function1, Function1 function2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            l = null;
        }
        miJiaSdkNetCompat.deleteDevice(str, i, l, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MiJiaSdkNetCompat instance_delegate$lambda$13() {
        return new MiJiaSdkNetCompat();
    }

    public final void acceptPrivacy(@NotNull String did, int privacyId, @NotNull String privacyVersion, @NotNull final Function1<? super Boolean, Unit> onSuccess, @NotNull final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(privacyVersion, "privacyVersion");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Map mapMutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.to("type", PrivacyAgreeModel.TYPE_ACCEPT), TuplesKt.to("did", did), TuplesKt.to("extra", MapsKt__MapsKt.mutableMapOf(TuplesKt.to("client", 4), TuplesKt.to("privacy_id", Integer.valueOf(privacyId)), TuplesKt.to(DeviceTagInterface.TAG_VERSION_CODE, privacyVersion))));
        MiJiaSDKCompat.INSTANCE.getInstance();
        ArrayList arrayList = new ArrayList();
        String strA = xpd.a(mapMutableMapOf);
        arrayList.add(new KeyValuePair("data", strA));
        String str = "/v2/device/set_privacy_confirmation";
        if (!StringsKt__StringsJVMKt.startsWith$default("/v2/device/set_privacy_confirmation", "/v2", false, 2, null)) {
            str = "/v2/v2/device/set_privacy_confirmation";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("request realUrl ");
        sb.append(str);
        sb.append("  ");
        sb.append(strA);
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path(str).addQueries(arrayList).build();
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$acceptPrivacy$$inlined$http$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$acceptPrivacy$$inlined$http$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$acceptPrivacy$$inlined$http$1$1", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,129:1\n161#2,2:130\n*E\n"})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onFail$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$t, continuation, this.$onFail$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int code = ((BaseBean) this.$t.element).getCode();
                    this.$onFail$inlined.invoke2(new ApiException(((BaseBean) this.$t.element).getMessage(), code));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$acceptPrivacy$$inlined$http$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$acceptPrivacy$$inlined$http$1$2", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,134:1\n157#2,3:135\n*E\n"})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onSuccess$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$onSuccess$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$t, continuation, this.$onSuccess$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    RevokePrivacyResult revokePrivacyResult = (RevokePrivacyResult) this.$t.element;
                    Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "revokePrivacy onSuccess(" + revokePrivacyResult + ")");
                    Function1 function1 = this.$onSuccess$inlined;
                    boolean z = false;
                    if (revokePrivacyResult != null && revokePrivacyResult.isSuccess()) {
                        z = true;
                    }
                    function1.invoke2(Boxing.boxBoolean(z));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$acceptPrivacy$$inlined$http$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$acceptPrivacy$$inlined$http$1$3", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,139:1\n161#2,2:140\n*E\n"})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onFail$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation, this.$onFail$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$onFail$inlined.invoke2(new ApiException(null, -1));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$acceptPrivacy$$inlined$http$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$acceptPrivacy$$inlined$http$1$4", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,145:1\n157#2,3:146\n*E\n"})
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onSuccess$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$onSuccess$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(continuation, this.$onSuccess$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "revokePrivacy onSuccess(" + ((Object) null) + ")");
                    this.$onSuccess$inlined.invoke2(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$acceptPrivacy$$inlined$http$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$acceptPrivacy$$inlined$http$1$5", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,157:1\n161#2,2:158\n*E\n"})
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ NetError $error;
                final /* synthetic */ Function1 $onFail$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(NetError netError, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$error = netError;
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.$error, continuation, this.$onFail$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NetError netError = this.$error;
                    if (netError != null) {
                        int code = netError.getCode();
                        this.$onFail$inlined.invoke2(new ApiException(this.$error.getDetail(), code));
                    } else {
                        this.$onFail$inlined.invoke2(new ApiException(null, SwitchWearModeViewModel.EXIT_ACCESSORY_MODE));
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

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
                AnyExtKt.main$default(null, new AnonymousClass5(error, null, onFail), 1, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        String str2 = netResult.mResponse;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onSuccess mResponse:");
                        sb2.append(str2);
                        try {
                            String str3 = netResult.mResponse;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            ?? FromJson = MiJiaSDKCompat.INSTANCE.getGson().fromJson(str3, (Class<??>) RevokePrivacyResult.class);
                            objectRef.element = FromJson;
                            if (((BaseBean) FromJson).isSuccess()) {
                                AnyExtKt.main$default(null, new AnonymousClass2(objectRef, null, onSuccess), 1, null);
                                return;
                            }
                            int code = ((BaseBean) objectRef.element).getCode();
                            String message = ((BaseBean) objectRef.element).getMessage();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onSuccess not  ");
                            sb3.append(code);
                            sb3.append("  ");
                            sb3.append(message);
                            AnyExtKt.main$default(null, new AnonymousClass1(objectRef, null, onFail), 1, null);
                            return;
                        } catch (Exception e) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("onSuccess ");
                            sb4.append(e);
                            AnyExtKt.main$default(null, new AnonymousClass3(null, onFail), 1, null);
                            return;
                        }
                    }
                }
                AnyExtKt.main$default(null, new AnonymousClass4(null, onSuccess), 1, null);
            }
        });
    }

    public final void deleteDevice(@NotNull final String did, int pid, @Nullable Long ownerUid, @NotNull final Function1<? super Boolean, Unit> onSuccess, @NotNull final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        List listSingletonList = Collections.singletonList(new DeleteMiJiaDeviceInfo(did, pid, ownerUid));
        MiJiaSDKCompat.INSTANCE.getInstance();
        Map mapMutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.to("devList", listSingletonList));
        ArrayList arrayList = new ArrayList();
        String strA = xpd.a(mapMutableMapOf);
        arrayList.add(new KeyValuePair("data", strA));
        String str = "/v2/user/del_owner_device_batch";
        if (!StringsKt__StringsJVMKt.startsWith$default("/v2/user/del_owner_device_batch", "/v2", false, 2, null)) {
            str = "/v2/v2/user/del_owner_device_batch";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("request realUrl ");
        sb.append(str);
        sb.append("  ");
        sb.append(strA);
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path(str).addQueries(arrayList).build();
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$deleteDevice$$inlined$http$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$deleteDevice$$inlined$http$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$deleteDevice$$inlined$http$1$1", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,129:1\n117#2,2:130\n*E\n"})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onFail$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$t, continuation, this.$onFail$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int code = ((BaseBean) this.$t.element).getCode();
                    this.$onFail$inlined.invoke2(new ApiException(((BaseBean) this.$t.element).getMessage(), code));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$deleteDevice$$inlined$http$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$deleteDevice$$inlined$http$1$2", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,134:1\n113#2,3:135\n*E\n"})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $did$inlined;
                final /* synthetic */ Function1 $onSuccess$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Ref.ObjectRef objectRef, Continuation continuation, String str, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$did$inlined = str;
                    this.$onSuccess$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$t, continuation, this.$did$inlined, this.$onSuccess$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Map<String, Integer> result;
                    Integer num;
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    DeleteDeviceResult deleteDeviceResult = (DeleteDeviceResult) this.$t.element;
                    this.$onSuccess$inlined.invoke2(Boxing.boxBoolean(((deleteDeviceResult == null || (result = deleteDeviceResult.getResult()) == null || (num = result.get(this.$did$inlined)) == null) ? 0 : num.intValue()) == 1));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$deleteDevice$$inlined$http$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$deleteDevice$$inlined$http$1$3", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,139:1\n117#2,2:140\n*E\n"})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onFail$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation, this.$onFail$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$onFail$inlined.invoke2(new ApiException(null, -1));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$deleteDevice$$inlined$http$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$deleteDevice$$inlined$http$1$4", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,145:1\n113#2,3:146\n*E\n"})
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $did$inlined;
                final /* synthetic */ Function1 $onSuccess$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(Continuation continuation, String str, Function1 function1) {
                    super(2, continuation);
                    this.$did$inlined = str;
                    this.$onSuccess$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(continuation, this.$did$inlined, this.$onSuccess$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$onSuccess$inlined.invoke2(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$deleteDevice$$inlined$http$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$deleteDevice$$inlined$http$1$5", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,157:1\n117#2,2:158\n*E\n"})
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ NetError $error;
                final /* synthetic */ Function1 $onFail$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(NetError netError, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$error = netError;
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.$error, continuation, this.$onFail$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NetError netError = this.$error;
                    if (netError != null) {
                        int code = netError.getCode();
                        this.$onFail$inlined.invoke2(new ApiException(this.$error.getDetail(), code));
                    } else {
                        this.$onFail$inlined.invoke2(new ApiException(null, SwitchWearModeViewModel.EXIT_ACCESSORY_MODE));
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

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
                AnyExtKt.main$default(null, new AnonymousClass5(error, null, onFail), 1, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        String str2 = netResult.mResponse;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onSuccess mResponse:");
                        sb2.append(str2);
                        try {
                            String str3 = netResult.mResponse;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            ?? FromJson = MiJiaSDKCompat.INSTANCE.getGson().fromJson(str3, (Class<??>) DeleteDeviceResult.class);
                            objectRef.element = FromJson;
                            if (((BaseBean) FromJson).isSuccess()) {
                                AnyExtKt.main$default(null, new AnonymousClass2(objectRef, null, did, onSuccess), 1, null);
                                return;
                            }
                            int code = ((BaseBean) objectRef.element).getCode();
                            String message = ((BaseBean) objectRef.element).getMessage();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onSuccess not  ");
                            sb3.append(code);
                            sb3.append("  ");
                            sb3.append(message);
                            AnyExtKt.main$default(null, new AnonymousClass1(objectRef, null, onFail), 1, null);
                            return;
                        } catch (Exception e) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("onSuccess ");
                            sb4.append(e);
                            AnyExtKt.main$default(null, new AnonymousClass3(null, onFail), 1, null);
                            return;
                        }
                    }
                }
                AnyExtKt.main$default(null, new AnonymousClass4(null, did, onSuccess), 1, null);
            }
        });
    }

    public final void getBindKey(@NotNull final Function1<? super String, Unit> onSuccess, @NotNull final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Map mapEmptyMap = MapsKt__MapsKt.emptyMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValuePair("data", xpd.a(mapEmptyMap)));
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path("/user/get_bindkey").addQueries(arrayList).build();
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$getBindKey$$inlined$requestMiJiaServer$1
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult p0) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError error) {
                String detail;
                Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onFailure " + (error != null ? Integer.valueOf(error.getCode()) : null) + " " + (error != null ? error.getDetail() : null));
                if (error == null || (detail = error.getDetail()) == null) {
                    detail = "onFailure";
                }
                onFail.invoke2(new ApiException(detail, error != null ? error.getCode() : 10001));
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        try {
                            String str = netResult.mResponse;
                            BaseResult baseResult = (BaseResult) MiJiaSDKCompat.INSTANCE.getGson().fromJson(str, BaseResult.class);
                            if (baseResult.isSuccess() && baseResult.getResult() != null) {
                                Object result = baseResult.getResult();
                                Intrinsics.checkNotNull(result);
                                Map map = (Map) result;
                                Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "getBindKey onSuccess:" + map);
                                String str2 = (String) map.get("bindkey");
                                if (str2 == null || str2.length() == 0) {
                                    onFail.invoke2(new ApiException("bindkey is null", 10002));
                                } else {
                                    onSuccess.invoke2(str2);
                                }
                                Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onSuccess " + str);
                                return;
                            }
                            Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onSuccess failed " + baseResult);
                            onFail.invoke2(new ApiException(baseResult.getMsg(), baseResult.getCode()));
                            return;
                        } catch (Exception e) {
                            Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onSuccess exception " + e);
                            onFail.invoke2(new ApiException(e));
                            return;
                        }
                    }
                }
                Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onSuccess netResult is null");
                onFail.invoke2(new ApiException("netResult is null", 10001));
            }
        });
    }

    public final void getBoundDeviceList(@NotNull final Function1<? super List<RNDevice>, Unit> onSuccess, @Nullable final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        SmartHomeSDK.INSTANCE.getSmartManger().refreshDeviceList(new SmartCallBack<ArrayList<Device>>() { // from class: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat.getBoundDeviceList.1
            @Override // com.smarthome.core.SmartCallBack
            public void onFailure(int code, String result) {
                Intrinsics.checkNotNullParameter(result, "result");
                Logger.e(MiJiaSdkNetCompatKt.NET_TAG, "getDeviceList error code=" + code + ", result=" + result);
                Function1<ApiException, Unit> function1 = onFail;
                if (function1 != null) {
                    function1.invoke2(new ApiException(result, code));
                }
            }

            @Override // com.smarthome.core.SmartCallBack
            public void onSuccess(ArrayList<Device> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "getDeviceList success: result size" + result.size());
                ArrayList arrayList = new ArrayList();
                for (Device device : result) {
                    Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "getDeviceList contain(" + device + ")");
                    PluginDeviceInfo pluginInfo = PluginDeviceManager.INSTANCE.getInstance().getPluginInfo(device.model);
                    Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "getDeviceList info.status (" + (pluginInfo != null ? pluginInfo.t() : null) + ")");
                    if ((pluginInfo != null ? pluginInfo.t() : null) != PluginDeviceInfoStatus.WHITE_LIST) {
                        if ((pluginInfo != null ? pluginInfo.t() : null) != PluginDeviceInfoStatus.RELEASE) {
                            Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "设备穿戴不可用");
                        }
                    }
                    Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "设备穿戴可用");
                    arrayList.add(DeviceExtKt.toRNDevice(device));
                    SmartDeviceInfo smartDeviceInfo = new SmartDeviceInfo(null, null, null, 0, null, null, null, null, null, null, 1023, null);
                    smartDeviceInfo.initFromDevice(device);
                    DeviceScanManager.INSTANCE.saveBleDeviceInfo(smartDeviceInfo);
                }
                onSuccess.invoke2(arrayList);
            }
        });
    }

    public final void getCommonConfig(@NotNull final Function1<? super String, Unit> onSuccess, @NotNull final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Map mapMutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.to("keys", CollectionsKt__CollectionsJVMKt.listOf("health_device_access_switch")));
        MiJiaSDKCompat.INSTANCE.getInstance();
        ArrayList arrayList = new ArrayList();
        String strA = xpd.a(mapMutableMapOf);
        arrayList.add(new KeyValuePair("data", strA));
        String str = "/v2/user/get_common_config";
        if (!StringsKt__StringsJVMKt.startsWith$default("/v2/user/get_common_config", "/v2", false, 2, null)) {
            str = "/v2/v2/user/get_common_config";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("request realUrl ");
        sb.append(str);
        sb.append("  ");
        sb.append(strA);
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path(str).addQueries(arrayList).build();
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$getCommonConfig$$inlined$http$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$getCommonConfig$$inlined$http$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$getCommonConfig$$inlined$http$1$1", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,129:1\n189#2,2:130\n*E\n"})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onFail$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$t, continuation, this.$onFail$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int code = ((BaseBean) this.$t.element).getCode();
                    this.$onFail$inlined.invoke2(new ApiException(((BaseBean) this.$t.element).getMessage(), code));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$getCommonConfig$$inlined$http$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$getCommonConfig$$inlined$http$1$2", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,134:1\n175#2,13:135\n*E\n"})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onFail$inlined;
                final /* synthetic */ Function1 $onSuccess$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1, Function1 function2) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$onSuccess$inlined = function1;
                    this.$onFail$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$t, continuation, this.$onSuccess$inlined, this.$onFail$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    GetCommonConfigResult getCommonConfigResult = (GetCommonConfigResult) this.$t.element;
                    Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "getCommonConfig onSuccess(" + getCommonConfigResult + ")");
                    if (getCommonConfigResult != null) {
                        if (getCommonConfigResult.isSuccess()) {
                            ConfigInfos result = getCommonConfigResult.getResult();
                            if ((result != null ? result.getConfigInfos() : null) != null) {
                                ConfigInfos result2 = getCommonConfigResult.getResult();
                                List<ConfigInfo> configInfos = result2 != null ? result2.getConfigInfos() : null;
                                Intrinsics.checkNotNull(configInfos);
                                for (ConfigInfo configInfo : configInfos) {
                                    if (Intrinsics.areEqual("health_device_access_switch", configInfo.getKey())) {
                                        this.$onSuccess$inlined.invoke2(configInfo.getValue());
                                        break;
                                    }
                                }
                            }
                        }
                        this.$onFail$inlined.invoke2(new ApiException(getCommonConfigResult.getMessage(), getCommonConfigResult.getCode()));
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$getCommonConfig$$inlined$http$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$getCommonConfig$$inlined$http$1$3", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,139:1\n189#2,2:140\n*E\n"})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onFail$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation, this.$onFail$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$onFail$inlined.invoke2(new ApiException(null, -1));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$getCommonConfig$$inlined$http$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$getCommonConfig$$inlined$http$1$4", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,145:1\n175#2,13:146\n*E\n"})
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onFail$inlined;
                final /* synthetic */ Function1 $onSuccess$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(Continuation continuation, Function1 function1, Function1 function2) {
                    super(2, continuation);
                    this.$onSuccess$inlined = function1;
                    this.$onFail$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(continuation, this.$onSuccess$inlined, this.$onFail$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "getCommonConfig onSuccess(" + ((Object) null) + ")");
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$getCommonConfig$$inlined$http$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$getCommonConfig$$inlined$http$1$5", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,157:1\n189#2,2:158\n*E\n"})
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ NetError $error;
                final /* synthetic */ Function1 $onFail$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(NetError netError, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$error = netError;
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.$error, continuation, this.$onFail$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NetError netError = this.$error;
                    if (netError != null) {
                        int code = netError.getCode();
                        this.$onFail$inlined.invoke2(new ApiException(this.$error.getDetail(), code));
                    } else {
                        this.$onFail$inlined.invoke2(new ApiException(null, SwitchWearModeViewModel.EXIT_ACCESSORY_MODE));
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

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
                AnyExtKt.main$default(null, new AnonymousClass5(error, null, onFail), 1, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        String str2 = netResult.mResponse;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onSuccess mResponse:");
                        sb2.append(str2);
                        try {
                            String str3 = netResult.mResponse;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            ?? FromJson = MiJiaSDKCompat.INSTANCE.getGson().fromJson(str3, (Class<??>) GetCommonConfigResult.class);
                            objectRef.element = FromJson;
                            if (((BaseBean) FromJson).isSuccess()) {
                                AnyExtKt.main$default(null, new AnonymousClass2(objectRef, null, onSuccess, onFail), 1, null);
                                return;
                            }
                            int code = ((BaseBean) objectRef.element).getCode();
                            String message = ((BaseBean) objectRef.element).getMessage();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onSuccess not  ");
                            sb3.append(code);
                            sb3.append("  ");
                            sb3.append(message);
                            AnyExtKt.main$default(null, new AnonymousClass1(objectRef, null, onFail), 1, null);
                            return;
                        } catch (Exception e) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("onSuccess ");
                            sb4.append(e);
                            AnyExtKt.main$default(null, new AnonymousClass3(null, onFail), 1, null);
                            return;
                        }
                    }
                }
                AnyExtKt.main$default(null, new AnonymousClass4(null, onSuccess, onFail), 1, null);
            }
        });
    }

    public final void renameDevice(@NotNull String did, @NotNull String newName, @NotNull final Function1<? super Boolean, Unit> onSuccess, @NotNull final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(newName, "newName");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        if (StringsKt__StringsKt.trim((CharSequence) newName).toString().length() == 0) {
            onSuccess.invoke2(Boolean.TRUE);
            return;
        }
        Map mapMutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.to("did", did), TuplesKt.to("newName", newName));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValuePair("data", xpd.a(mapMutableMapOf)));
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path("/v2/device/rename").addQueries(arrayList).build();
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$renameDevice$$inlined$requestMiJiaServer$1
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult p0) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError error) {
                String detail;
                Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onFailure " + (error != null ? Integer.valueOf(error.getCode()) : null) + " " + (error != null ? error.getDetail() : null));
                Function1 function1 = onFail;
                if (error == null || (detail = error.getDetail()) == null) {
                    detail = "onFailure";
                }
                function1.invoke2(new ApiException(detail, error != null ? error.getCode() : 10001));
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        try {
                            String str = netResult.mResponse;
                            BaseResult baseResult = (BaseResult) MiJiaSDKCompat.INSTANCE.getGson().fromJson(str, BaseResult.class);
                            if (baseResult.isSuccess() && baseResult.getResult() != null) {
                                Function1 function1 = onSuccess;
                                Object result = baseResult.getResult();
                                Intrinsics.checkNotNull(result);
                                function1.invoke2(result);
                                Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onSuccess " + str);
                                return;
                            }
                            Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onSuccess failed " + baseResult);
                            onFail.invoke2(new ApiException(baseResult.getMsg(), baseResult.getCode()));
                            return;
                        } catch (Exception e) {
                            Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onSuccess exception " + e);
                            onFail.invoke2(new ApiException(e));
                            return;
                        }
                    }
                }
                Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "onSuccess netResult is null");
                onFail.invoke2(new ApiException("netResult is null", 10001));
            }
        });
    }

    public final void revokePrivacy(@NotNull String did, int privacyId, @NotNull String privacyVersion, @NotNull final Function1<? super Boolean, Unit> onSuccess, @NotNull final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(privacyVersion, "privacyVersion");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Map mapMutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.to("type", "remove"), TuplesKt.to("did", did), TuplesKt.to("extra", MapsKt__MapsKt.mutableMapOf(TuplesKt.to("client", 4), TuplesKt.to("privacy_id", Integer.valueOf(privacyId)), TuplesKt.to(DeviceTagInterface.TAG_VERSION_CODE, privacyVersion))));
        MiJiaSDKCompat.INSTANCE.getInstance();
        ArrayList arrayList = new ArrayList();
        String strA = xpd.a(mapMutableMapOf);
        arrayList.add(new KeyValuePair("data", strA));
        String str = "/v2/device/set_privacy_confirmation";
        if (!StringsKt__StringsJVMKt.startsWith$default("/v2/device/set_privacy_confirmation", "/v2", false, 2, null)) {
            str = "/v2/v2/device/set_privacy_confirmation";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("request realUrl ");
        sb.append(str);
        sb.append("  ");
        sb.append(strA);
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path(str).addQueries(arrayList).build();
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$revokePrivacy$$inlined$http$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$revokePrivacy$$inlined$http$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$revokePrivacy$$inlined$http$1$1", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,129:1\n139#2,2:130\n*E\n"})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onFail$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$t, continuation, this.$onFail$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int code = ((BaseBean) this.$t.element).getCode();
                    this.$onFail$inlined.invoke2(new ApiException(((BaseBean) this.$t.element).getMessage(), code));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$revokePrivacy$$inlined$http$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$revokePrivacy$$inlined$http$1$2", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,134:1\n135#2,3:135\n*E\n"})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onSuccess$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$onSuccess$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$t, continuation, this.$onSuccess$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    RevokePrivacyResult revokePrivacyResult = (RevokePrivacyResult) this.$t.element;
                    Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "revokePrivacy onSuccess(" + revokePrivacyResult + ")");
                    Function1 function1 = this.$onSuccess$inlined;
                    boolean z = false;
                    if (revokePrivacyResult != null && revokePrivacyResult.isSuccess()) {
                        z = true;
                    }
                    function1.invoke2(Boxing.boxBoolean(z));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$revokePrivacy$$inlined$http$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$revokePrivacy$$inlined$http$1$3", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,139:1\n139#2,2:140\n*E\n"})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onFail$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation, this.$onFail$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$onFail$inlined.invoke2(new ApiException(null, -1));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$revokePrivacy$$inlined$http$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$revokePrivacy$$inlined$http$1$4", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,145:1\n135#2,3:146\n*E\n"})
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onSuccess$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$onSuccess$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(continuation, this.$onSuccess$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "revokePrivacy onSuccess(" + ((Object) null) + ")");
                    this.$onSuccess$inlined.invoke2(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$revokePrivacy$$inlined$http$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$revokePrivacy$$inlined$http$1$5", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,157:1\n139#2,2:158\n*E\n"})
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ NetError $error;
                final /* synthetic */ Function1 $onFail$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(NetError netError, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$error = netError;
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.$error, continuation, this.$onFail$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NetError netError = this.$error;
                    if (netError != null) {
                        int code = netError.getCode();
                        this.$onFail$inlined.invoke2(new ApiException(this.$error.getDetail(), code));
                    } else {
                        this.$onFail$inlined.invoke2(new ApiException(null, SwitchWearModeViewModel.EXIT_ACCESSORY_MODE));
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

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
                AnyExtKt.main$default(null, new AnonymousClass5(error, null, onFail), 1, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        String str2 = netResult.mResponse;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onSuccess mResponse:");
                        sb2.append(str2);
                        try {
                            String str3 = netResult.mResponse;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            ?? FromJson = MiJiaSDKCompat.INSTANCE.getGson().fromJson(str3, (Class<??>) RevokePrivacyResult.class);
                            objectRef.element = FromJson;
                            if (((BaseBean) FromJson).isSuccess()) {
                                AnyExtKt.main$default(null, new AnonymousClass2(objectRef, null, onSuccess), 1, null);
                                return;
                            }
                            int code = ((BaseBean) objectRef.element).getCode();
                            String message = ((BaseBean) objectRef.element).getMessage();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onSuccess not  ");
                            sb3.append(code);
                            sb3.append("  ");
                            sb3.append(message);
                            AnyExtKt.main$default(null, new AnonymousClass1(objectRef, null, onFail), 1, null);
                            return;
                        } catch (Exception e) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("onSuccess ");
                            sb4.append(e);
                            AnyExtKt.main$default(null, new AnonymousClass3(null, onFail), 1, null);
                            return;
                        }
                    }
                }
                AnyExtKt.main$default(null, new AnonymousClass4(null, onSuccess), 1, null);
            }
        });
    }

    public final void setCommonConfig(@NotNull String value, @NotNull final Function1<? super Boolean, Unit> onSuccess, @NotNull final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Map mapMutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.to("configInfos", CollectionsKt__CollectionsJVMKt.listOf(MapsKt__MapsKt.mutableMapOf(TuplesKt.to("key", "health_device_access_switch"), TuplesKt.to("value", value)))));
        MiJiaSDKCompat.INSTANCE.getInstance();
        ArrayList arrayList = new ArrayList();
        String strA = xpd.a(mapMutableMapOf);
        arrayList.add(new KeyValuePair("data", strA));
        String str = "/v2/user/set_common_config";
        if (!StringsKt__StringsJVMKt.startsWith$default("/v2/user/set_common_config", "/v2", false, 2, null)) {
            str = "/v2/v2/user/set_common_config";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("request realUrl ");
        sb.append(str);
        sb.append("  ");
        sb.append(strA);
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path(str).addQueries(arrayList).build();
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$setCommonConfig$$inlined$http$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$setCommonConfig$$inlined$http$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$setCommonConfig$$inlined$http$1$1", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,129:1\n209#2,2:130\n*E\n"})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onFail$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$t, continuation, this.$onFail$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int code = ((BaseBean) this.$t.element).getCode();
                    this.$onFail$inlined.invoke2(new ApiException(((BaseBean) this.$t.element).getMessage(), code));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$setCommonConfig$$inlined$http$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$setCommonConfig$$inlined$http$1$2", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,134:1\n205#2,3:135\n*E\n"})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onSuccess$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$onSuccess$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$t, continuation, this.$onSuccess$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    SetCommonConfigResult setCommonConfigResult = (SetCommonConfigResult) this.$t.element;
                    Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "setCommonConfig onSuccess(" + setCommonConfigResult + ")");
                    Function1 function1 = this.$onSuccess$inlined;
                    boolean z = false;
                    if (setCommonConfigResult != null && setCommonConfigResult.isSuccess()) {
                        z = true;
                    }
                    function1.invoke2(Boxing.boxBoolean(z));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$setCommonConfig$$inlined$http$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$setCommonConfig$$inlined$http$1$3", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,139:1\n209#2,2:140\n*E\n"})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onFail$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation, this.$onFail$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$onFail$inlined.invoke2(new ApiException(null, -1));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$setCommonConfig$$inlined$http$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$setCommonConfig$$inlined$http$1$4", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,145:1\n205#2,3:146\n*E\n"})
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $onSuccess$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$onSuccess$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(continuation, this.$onSuccess$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Logger.i(MiJiaSdkNetCompatKt.NET_TAG, "setCommonConfig onSuccess(" + ((Object) null) + ")");
                    this.$onSuccess$inlined.invoke2(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$setCommonConfig$$inlined$http$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.sdk.MiJiaSdkNetCompat$setCommonConfig$$inlined$http$1$5", f = "MiJiaSdkNetCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1\n+ 2 MiJiaSdkNetCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSdkNetCompat\n*L\n1#1,157:1\n209#2,2:158\n*E\n"})
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ NetError $error;
                final /* synthetic */ Function1 $onFail$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(NetError netError, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$error = netError;
                    this.$onFail$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.$error, continuation, this.$onFail$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NetError netError = this.$error;
                    if (netError != null) {
                        int code = netError.getCode();
                        this.$onFail$inlined.invoke2(new ApiException(this.$error.getDetail(), code));
                    } else {
                        this.$onFail$inlined.invoke2(new ApiException(null, SwitchWearModeViewModel.EXIT_ACCESSORY_MODE));
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

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
                AnyExtKt.main$default(null, new AnonymousClass5(error, null, onFail), 1, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        String str2 = netResult.mResponse;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onSuccess mResponse:");
                        sb2.append(str2);
                        try {
                            String str3 = netResult.mResponse;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            ?? FromJson = MiJiaSDKCompat.INSTANCE.getGson().fromJson(str3, (Class<??>) SetCommonConfigResult.class);
                            objectRef.element = FromJson;
                            if (((BaseBean) FromJson).isSuccess()) {
                                AnyExtKt.main$default(null, new AnonymousClass2(objectRef, null, onSuccess), 1, null);
                                return;
                            }
                            int code = ((BaseBean) objectRef.element).getCode();
                            String message = ((BaseBean) objectRef.element).getMessage();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onSuccess not  ");
                            sb3.append(code);
                            sb3.append("  ");
                            sb3.append(message);
                            AnyExtKt.main$default(null, new AnonymousClass1(objectRef, null, onFail), 1, null);
                            return;
                        } catch (Exception e) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("onSuccess ");
                            sb4.append(e);
                            AnyExtKt.main$default(null, new AnonymousClass3(null, onFail), 1, null);
                            return;
                        }
                    }
                }
                AnyExtKt.main$default(null, new AnonymousClass4(null, onSuccess), 1, null);
            }
        });
    }
}
