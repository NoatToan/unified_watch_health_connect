package com.xiaomi.fitness.device.manager.api;

import android.os.Build;
import android.os.Process;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.device.manager.api.DeviceRequest;
import com.xiaomi.fitness.device.manager.api.model.BindECDHInfo;
import com.xiaomi.fitness.device.manager.api.model.BindHelloInfo;
import com.xiaomi.fitness.device.manager.api.model.BindKey;
import com.xiaomi.fitness.device.manager.api.model.BindSignInfo;
import com.xiaomi.fitness.device.manager.api.model.BindStatus;
import com.xiaomi.fitness.device.manager.api.model.ConfirmBindInfo;
import com.xiaomi.fitness.device.manager.api.model.DeviceListData;
import com.xiaomi.fitness.device.manager.api.model.DeviceRecordInfo;
import com.xiaomi.fitness.device.manager.api.model.ProductListData;
import com.xiaomi.fitness.device.manager.api.model.UpdateDeviceInfoResult;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.bean.DeviceActive;
import com.xiaomi.fitness.device.manager.export.bean.DeviceActiveBean;
import com.xiaomi.fitness.device.manager.export.bean.HuamiTrackUpData;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import com.xiaomi.fitness.device.manager.report.DeviceActiveResult;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.c.i;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.wearable.ApplyBindInfo;
import com.xiaomi.wearable.BindResult;
import com.xiaomi.wearable.LocalBindInfo;
import com.xiaomi.wearable.LocalBindResult;
import com.xiaomi.wearable.UnbindInfo;
import com.xiaomi.wearable.VerifyBindInfo;
import dagger.hilt.android.EntryPointAccessors;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 g2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001gB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004Jk\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00132(\u0010\u0017\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u00110\u001bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019`\u00182\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001bj\u0002`\u001d¢\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020!H\u0086@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010%JQ\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)2\u001c\u0010*\u001a\u0018\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00110\u001bj\b\u0012\u0004\u0012\u00020+`\u00182\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001bj\u0002`\u001d¢\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020/H\u0086@¢\u0006\u0002\u00100J\u0016\u00101\u001a\u00020+2\u0006\u00102\u001a\u000203H\u0086@¢\u0006\u0002\u00104J,\u0010\u0010\u001a\u0002052\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u00106J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u000208072\b\b\u0002\u0010\u0016\u001a\u00020\u00132\u0006\u00109\u001a\u00020:H\u0086@¢\u0006\u0002\u0010;J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0086@¢\u0006\u0002\u0010@J\u0016\u0010A\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0086@¢\u0006\u0002\u0010@JA\u0010B\u001a\u00020\u00112\u001c\u0010*\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u001bj\b\u0012\u0004\u0012\u00020\u0015`\u00182\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001bj\u0002`\u001d¢\u0006\u0002\u0010DJI\u0010E\u001a\u00020\u00112\u0006\u0010F\u001a\u00020G2\u001c\u0010*\u001a\u0018\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00110\u001bj\b\u0012\u0004\u0012\u00020:`\u00182\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001bj\u0002`\u001d¢\u0006\u0002\u0010HJI\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020K2\u001c\u0010*\u001a\u0018\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u00110\u001bj\b\u0012\u0004\u0012\u00020L`\u00182\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001bj\u0002`\u001d¢\u0006\u0002\u0010MJI\u0010N\u001a\u00020\u00112\u0006\u0010O\u001a\u00020P2\u001c\u0010*\u001a\u0018\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\u00110\u001bj\b\u0012\u0004\u0012\u00020Q`\u00182\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001bj\u0002`\u001d¢\u0006\u0002\u0010RJI\u0010S\u001a\u00020\u00112\u0006\u0010T\u001a\u00020U2\u001c\u0010*\u001a\u0018\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\u00110\u001bj\b\u0012\u0004\u0012\u00020V`\u00182\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001bj\u0002`\u001d¢\u0006\u0002\u0010WJB\u0010X\u001a\u00020\u00112\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020\u00152\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\u00110\u001b2\u0016\u0010C\u001a\u0012\u0012\b\u0012\u00060\\j\u0002`[\u0012\u0004\u0012\u00020\u00110\u001bJJ\u0010]\u001a\u00020\u00112\u0006\u0010^\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020\u00152\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\u00110\u001b2\u0016\u0010C\u001a\u0012\u0012\b\u0012\u00060\\j\u0002`[\u0012\u0004\u0012\u00020\u00110\u001bJ\u0016\u0010`\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010aJ\u001e\u0010X\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010bJG\u0010c\u001a\u00020\u00112\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010d\u001a\u00020\u00152\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020\u00110\u001b2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001bj\u0002`\u001d¢\u0006\u0002\u0010fR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006h"}, d2 = {"Lcom/xiaomi/fitness/device/manager/api/DeviceRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/device/manager/api/DeviceApiService;", "<init>", "()V", "mBindService", "Lcom/xiaomi/fitness/device/manager/api/DeviceBindService;", "getMBindService", "()Lcom/xiaomi/fitness/device/manager/api/DeviceBindService;", "mBindService$delegate", "Lkotlin/Lazy;", "serializedNoNullGson", "Lcom/google/gson/Gson;", "getSerializedNoNullGson", "()Lcom/google/gson/Gson;", "serializedNoNullGson$delegate", "getDevices", "", MediaStoreUtil.MediaInfo.SIZE, "", "next", "", "status", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(ILjava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "recordDevices", "Lcom/xiaomi/fitness/device/manager/api/model/DeviceRecordInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadDeviceLocalBind", "device", "(Lcom/xiaomi/fitness/device/manager/bean/Device;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceActive", i.d, "eventValue", "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceActiveBean;", "success", "Lcom/xiaomi/fitness/device/manager/report/DeviceActiveResult;", "fail", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/export/bean/DeviceActiveBean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "deviceActiveArray", "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceActive;", "(Lcom/xiaomi/fitness/device/manager/export/bean/DeviceActive;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upHuamiTrackData", "huamiTrackUpData", "Lcom/xiaomi/fitness/device/manager/export/bean/HuamiTrackUpData;", "(Lcom/xiaomi/fitness/device/manager/export/bean/HuamiTrackUpData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fitness/device/manager/api/model/DeviceListData;", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDevice;", "bindDevice", "", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductByCategory", "Lcom/xiaomi/fitness/device/manager/api/model/ProductListData;", "lastModifyTime", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductConfig", "getBindKey", "error", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "bindWithSign", "bindSignInfo", "Lcom/xiaomi/fitness/device/manager/api/model/BindSignInfo;", "(Lcom/xiaomi/fitness/device/manager/api/model/BindSignInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "applyBind", "bindHelloInfo", "Lcom/xiaomi/fitness/device/manager/api/model/BindHelloInfo;", "Lcom/xiaomi/wearable/ApplyBindInfo;", "(Lcom/xiaomi/fitness/device/manager/api/model/BindHelloInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "verifyBind", "bindECDHInfo", "Lcom/xiaomi/fitness/device/manager/api/model/BindECDHInfo;", "Lcom/xiaomi/wearable/VerifyBindInfo;", "(Lcom/xiaomi/fitness/device/manager/api/model/BindECDHInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "confirmBind", "confirmBindInfo", "Lcom/xiaomi/fitness/device/manager/api/model/ConfirmBindInfo;", "Lcom/xiaomi/wearable/BindResult;", "(Lcom/xiaomi/fitness/device/manager/api/model/ConfirmBindInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "unbind", "did", "model", "Lkotlin/Exception;", "Ljava/lang/Exception;", "recordLocalBind", "sn", "Lcom/xiaomi/wearable/LocalBindResult;", "revoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDeviceInfo", "phoneId", "Lcom/xiaomi/fitness/device/manager/api/model/UpdateDeviceInfoResult;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceRequest.kt\ncom/xiaomi/fitness/device/manager/api/DeviceRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,335:1\n89#2,5:336\n141#2:341\n141#2:345\n89#2,5:349\n141#2:354\n141#2:358\n141#2:362\n141#2:366\n141#2:370\n89#2,5:374\n89#2,5:379\n89#2,5:384\n89#2,5:389\n89#2,5:394\n89#2,5:399\n89#2,5:404\n141#2:409\n141#2:413\n89#2,5:417\n31#3:342\n28#3,2:343\n31#3:346\n28#3,2:347\n31#3:355\n28#3,2:356\n31#3:359\n28#3,2:360\n31#3:363\n28#3,2:364\n31#3:367\n28#3,2:368\n31#3:371\n28#3,2:372\n31#3:410\n28#3,2:411\n31#3:414\n28#3,2:415\n*S KotlinDebug\n*F\n+ 1 DeviceRequest.kt\ncom/xiaomi/fitness/device/manager/api/DeviceRequest\n*L\n68#1:336,5\n101#1:341\n105#1:345\n123#1:349,5\n134#1:354\n141#1:358\n163#1:362\n203#1:366\n219#1:370\n223#1:374,5\n236#1:379,5\n248#1:384,5\n254#1:389,5\n264#1:394,5\n275#1:399,5\n287#1:404,5\n300#1:409\n310#1:413\n329#1:417,5\n101#1:342\n101#1:343,2\n105#1:346\n105#1:347,2\n134#1:355\n134#1:356,2\n141#1:359\n141#1:360,2\n163#1:363\n163#1:364,2\n203#1:367\n203#1:368,2\n219#1:371\n219#1:372,2\n300#1:410\n300#1:411,2\n310#1:414\n310#1:415,2\n*E\n"})
public final class DeviceRequest extends BaseRequest<DeviceApiService> {

    @NotNull
    private static final String TAG = "DeviceRequest";

    /* JADX INFO: renamed from: mBindService$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mBindService = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sb6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceRequest.mBindService_delegate$lambda$0(this.f33476a);
        }
    });

    /* JADX INFO: renamed from: serializedNoNullGson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy serializedNoNullGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tb6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceRequest.serializedNoNullGson_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$applyBind$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/wearable/ApplyBindInfo;", "it", "Lcom/xiaomi/fitness/device/manager/api/DeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest$applyBind$1", f = "DeviceRequest.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<DeviceApiService, Continuation<? super BaseResult<ApplyBindInfo>>, Object> {
        final /* synthetic */ BindHelloInfo $bindHelloInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BindHelloInfo bindHelloInfo, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bindHelloInfo = bindHelloInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceRequest.this.new AnonymousClass1(this.$bindHelloInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApiService deviceApiService, Continuation<? super BaseResult<ApplyBindInfo>> continuation) {
            return ((AnonymousClass1) create(deviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceBindService mBindService = DeviceRequest.this.getMBindService();
                String json = DeviceRequest.this.getMGson().toJson(this.$bindHelloInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = mBindService.applyBind(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$bindWithSign$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/device/manager/api/model/BindStatus;", "it", "Lcom/xiaomi/fitness/device/manager/api/DeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest$bindWithSign$1", f = "DeviceRequest.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19151 extends SuspendLambda implements Function2<DeviceApiService, Continuation<? super BaseResult<BindStatus>>, Object> {
        final /* synthetic */ BindSignInfo $bindSignInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19151(BindSignInfo bindSignInfo, Continuation<? super C19151> continuation) {
            super(2, continuation);
            this.$bindSignInfo = bindSignInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceRequest.this.new C19151(this.$bindSignInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApiService deviceApiService, Continuation<? super BaseResult<BindStatus>> continuation) {
            return ((C19151) create(deviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceBindService mBindService = DeviceRequest.this.getMBindService();
                String currentLocale = LocaleUtil.getCurrentLocale();
                String json = DeviceRequest.this.getMGson().toJson(this.$bindSignInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = mBindService.bindWithSign(currentLocale, json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$confirmBind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/wearable/BindResult;", "it", "Lcom/xiaomi/fitness/device/manager/api/DeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest$confirmBind$1", f = "DeviceRequest.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19161 extends SuspendLambda implements Function2<DeviceApiService, Continuation<? super BaseResult<BindResult>>, Object> {
        final /* synthetic */ ConfirmBindInfo $confirmBindInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19161(ConfirmBindInfo confirmBindInfo, Continuation<? super C19161> continuation) {
            super(2, continuation);
            this.$confirmBindInfo = confirmBindInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceRequest.this.new C19161(this.$confirmBindInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApiService deviceApiService, Continuation<? super BaseResult<BindResult>> continuation) {
            return ((C19161) create(deviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceBindService mBindService = DeviceRequest.this.getMBindService();
                String currentLocale = LocaleUtil.getCurrentLocale();
                String json = DeviceRequest.this.getMGson().toJson(this.$confirmBindInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = mBindService.confirmBind(currentLocale, json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$deviceActive$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/device/manager/report/DeviceActiveResult;", "it", "Lcom/xiaomi/fitness/device/manager/api/DeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest$deviceActive$1", f = "DeviceRequest.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19171 extends SuspendLambda implements Function2<DeviceApiService, Continuation<? super BaseResult<DeviceActiveResult>>, Object> {
        final /* synthetic */ JsonObject $object;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19171(JsonObject jsonObject, Continuation<? super C19171> continuation) {
            super(2, continuation);
            this.$object = jsonObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceRequest.this.new C19171(this.$object, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApiService deviceApiService, Continuation<? super BaseResult<DeviceActiveResult>> continuation) {
            return ((C19171) create(deviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceApiService deviceApiServiceAccess$getMService = DeviceRequest.access$getMService(DeviceRequest.this);
                String json = DeviceRequest.this.getMGson().toJson((JsonElement) this.$object);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = deviceApiServiceAccess$getMService.deviceActive(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$deviceActiveArray$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest", f = "DeviceRequest.kt", i = {}, l = {134}, m = "deviceActiveArray", n = {}, s = {})
    public static final class C19181 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C19181(Continuation<? super C19181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceRequest.this.deviceActiveArray(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$getBindKey$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/device/manager/api/model/BindKey;", "it", "Lcom/xiaomi/fitness/device/manager/api/DeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest$getBindKey$1", f = "DeviceRequest.kt", i = {}, l = {SportReportBaseParser.ReportType.avgFreq}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19191 extends SuspendLambda implements Function2<DeviceApiService, Continuation<? super BaseResult<BindKey>>, Object> {
        int label;

        public C19191(Continuation<? super C19191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceRequest.this.new C19191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApiService deviceApiService, Continuation<? super BaseResult<BindKey>> continuation) {
            return ((C19191) create(deviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceBindService mBindService = DeviceRequest.this.getMBindService();
                this.label = 1;
                obj = mBindService.getBindKey(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$getDevices$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/device/manager/api/model/DeviceListData;", "it", "Lcom/xiaomi/fitness/device/manager/api/DeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest$getDevices$1", f = "DeviceRequest.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19201 extends SuspendLambda implements Function2<DeviceApiService, Continuation<? super BaseResult<DeviceListData>>, Object> {
        final /* synthetic */ String $next;
        final /* synthetic */ int $size;
        final /* synthetic */ int $status;
        int label;
        final /* synthetic */ DeviceRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19201(int i, String str, int i2, DeviceRequest deviceRequest, Continuation<? super C19201> continuation) {
            super(2, continuation);
            this.$size = i;
            this.$next = str;
            this.$status = i2;
            this.this$0 = deviceRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C19201(this.$size, this.$next, this.$status, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApiService deviceApiService, Continuation<? super BaseResult<DeviceListData>> continuation) {
            return ((C19201) create(deviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("page_size", Boxing.boxInt(this.$size));
                String str = this.$next;
                if (str != null && str.length() != 0) {
                    linkedHashMap.put("page_start", this.$next);
                }
                int i2 = this.$status;
                if (i2 > 0) {
                    linkedHashMap.put("status", Boxing.boxInt(i2));
                }
                DeviceApiService deviceApiServiceAccess$getMService = DeviceRequest.access$getMService(this.this$0);
                String json = this.this$0.getMGson().toJson(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = deviceApiServiceAccess$getMService.getDevices(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$getDevices$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest", f = "DeviceRequest.kt", i = {}, l = {163}, m = "getDevices", n = {}, s = {})
    public static final class AnonymousClass3 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceRequest.this.getDevices(0, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$getDevices$4, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest", f = "DeviceRequest.kt", i = {0, 0, 0, 0, 0, 0}, l = {175}, m = "getDevices", n = {"this", "result", "status", "bindDevice", "pageLimit", "page"}, s = {"L$0", "L$1", "I$0", "Z$0", "I$1", "I$2"})
    public static final class AnonymousClass4 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceRequest.this.getDevices(0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$getProductByCategory$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest", f = "DeviceRequest.kt", i = {}, l = {203}, m = "getProductByCategory", n = {}, s = {})
    public static final class C19211 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C19211(Continuation<? super C19211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceRequest.this.getProductByCategory(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$getProductConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest", f = "DeviceRequest.kt", i = {}, l = {219}, m = "getProductConfig", n = {}, s = {})
    public static final class C19221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C19221(Continuation<? super C19221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceRequest.this.getProductConfig(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$recordDevices$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest", f = "DeviceRequest.kt", i = {}, l = {101}, m = "recordDevices", n = {}, s = {})
    public static final class C19231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C19231(Continuation<? super C19231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceRequest.this.recordDevices(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$recordLocalBind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/wearable/LocalBindResult;", "it", "Lcom/xiaomi/fitness/device/manager/api/DeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest$recordLocalBind$1", f = "DeviceRequest.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19241 extends SuspendLambda implements Function2<DeviceApiService, Continuation<? super BaseResult<LocalBindResult>>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $model;
        final /* synthetic */ String $sn;
        int label;
        final /* synthetic */ DeviceRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19241(String str, String str2, String str3, DeviceRequest deviceRequest, Continuation<? super C19241> continuation) {
            super(2, continuation);
            this.$sn = str;
            this.$did = str2;
            this.$model = str3;
            this.this$0 = deviceRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C19241(this.$sn, this.$did, this.$model, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApiService deviceApiService, Continuation<? super BaseResult<LocalBindResult>> continuation) {
            return ((C19241) create(deviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LocalBindInfo localBindInfo = new LocalBindInfo(this.$sn, this.$did, this.$model);
                DeviceBindService mBindService = this.this$0.getMBindService();
                String json = this.this$0.getMGson().toJson(localBindInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = mBindService.recordSourceToServer(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$revoke$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest", f = "DeviceRequest.kt", i = {}, l = {300}, m = "revoke", n = {}, s = {})
    public static final class C19251 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C19251(Continuation<? super C19251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceRequest.this.revoke(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$unbind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/device/manager/api/model/BindStatus;", "it", "Lcom/xiaomi/fitness/device/manager/api/DeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest$unbind$1", f = "DeviceRequest.kt", i = {}, l = {277}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19261 extends SuspendLambda implements Function2<DeviceApiService, Continuation<? super BaseResult<BindStatus>>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $model;
        int label;
        final /* synthetic */ DeviceRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19261(String str, String str2, DeviceRequest deviceRequest, Continuation<? super C19261> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$model = str2;
            this.this$0 = deviceRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C19261(this.$did, this.$model, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApiService deviceApiService, Continuation<? super BaseResult<BindStatus>> continuation) {
            return ((C19261) create(deviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UnbindInfo unbindInfo = new UnbindInfo(this.$did, this.$model);
                DeviceBindService mBindService = this.this$0.getMBindService();
                String json = this.this$0.getMGson().toJson(unbindInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = mBindService.unbind(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$unbind$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest", f = "DeviceRequest.kt", i = {}, l = {310}, m = "unbind", n = {}, s = {})
    public static final class AnonymousClass2 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceRequest.this.unbind(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$upHuamiTrackData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest", f = "DeviceRequest.kt", i = {}, l = {141}, m = "upHuamiTrackData", n = {}, s = {})
    public static final class C19271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C19271(Continuation<? super C19271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceRequest.this.upHuamiTrackData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$updateDeviceInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/device/manager/api/model/UpdateDeviceInfoResult;", "it", "Lcom/xiaomi/fitness/device/manager/api/DeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest$updateDeviceInfo$1", f = "DeviceRequest.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19281 extends SuspendLambda implements Function2<DeviceApiService, Continuation<? super BaseResult<UpdateDeviceInfoResult>>, Object> {
        final /* synthetic */ HashMap<String, Object> $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19281(HashMap<String, Object> map, Continuation<? super C19281> continuation) {
            super(2, continuation);
            this.$params = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceRequest.this.new C19281(this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApiService deviceApiService, Continuation<? super BaseResult<UpdateDeviceInfoResult>> continuation) {
            return ((C19281) create(deviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceBindService mBindService = DeviceRequest.this.getMBindService();
                String json = DeviceRequest.this.getMGson().toJson(this.$params);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = mBindService.updateDeviceInfo(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$uploadDeviceLocalBind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest", f = "DeviceRequest.kt", i = {}, l = {105}, m = "uploadDeviceLocalBind", n = {}, s = {})
    public static final class C19291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C19291(Continuation<? super C19291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceRequest.this.uploadDeviceLocalBind(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.DeviceRequest$verifyBind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/wearable/VerifyBindInfo;", "it", "Lcom/xiaomi/fitness/device/manager/api/DeviceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.DeviceRequest$verifyBind$1", f = "DeviceRequest.kt", i = {}, l = {255}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19301 extends SuspendLambda implements Function2<DeviceApiService, Continuation<? super BaseResult<VerifyBindInfo>>, Object> {
        final /* synthetic */ BindECDHInfo $bindECDHInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19301(BindECDHInfo bindECDHInfo, Continuation<? super C19301> continuation) {
            super(2, continuation);
            this.$bindECDHInfo = bindECDHInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceRequest.this.new C19301(this.$bindECDHInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceApiService deviceApiService, Continuation<? super BaseResult<VerifyBindInfo>> continuation) {
            return ((C19301) create(deviceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceBindService mBindService = DeviceRequest.this.getMBindService();
                String json = DeviceRequest.this.getMGson().toJson(this.$bindECDHInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = mBindService.verifyBind(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public static final /* synthetic */ DeviceApiService access$getMService(DeviceRequest deviceRequest) {
        return deviceRequest.getMService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindWithSign$lambda$4(Function1 success, Function1 error, BindStatus it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isSuccess()) {
            success.invoke2(Boolean.TRUE);
        } else {
            error.invoke2(new ApiException("", 1));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBindKey$lambda$3(Function1 success, Function1 error, BindKey it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        String bindKey = it.getBindKey();
        if (bindKey == null || bindKey.length() == 0) {
            error.invoke2(ApiException.INSTANCE.getEMPTY());
        } else {
            success.invoke2(bindKey);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getDevices$default(DeviceRequest deviceRequest, int i, String str, int i2, Function1 function1, Function1 function2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        deviceRequest.getDevices(i, str2, i2, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDevices$lambda$2(Function1 onSuccess, Function1 onFail, DeviceListData it) {
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "$onFail");
        Intrinsics.checkNotNullParameter(it, "it");
        List<WearableDevice> dataList = it.getDataList();
        List<WearableDevice> list = dataList;
        if (list == null || list.isEmpty()) {
            onFail.invoke2(ApiException.INSTANCE.getEMPTY());
        } else {
            onSuccess.invoke2(dataList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceBindService getMBindService() {
        return (DeviceBindService) this.mBindService.getValue();
    }

    private final Gson getSerializedNoNullGson() {
        Object value = this.serializedNoNullGson.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Gson) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceBindService mBindService_delegate$lambda$0(DeviceRequest this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (DeviceBindService) this$0.getRepository().getService(DeviceBindService.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson serializedNoNullGson_delegate$lambda$1() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeSpecialFloatingPointValues().setLenient();
        return gsonBuilder.create();
    }

    public final void applyBind(@NotNull BindHelloInfo bindHelloInfo, @NotNull Function1<? super ApplyBindInfo, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(bindHelloInfo, "bindHelloInfo");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(bindHelloInfo, null)).error(error).success(success);
    }

    public final void bindWithSign(@NotNull BindSignInfo bindSignInfo, @NotNull final Function1<? super Boolean, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(bindSignInfo, "bindSignInfo");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C19151(bindSignInfo, null)).error(error).success(new Function1() { // from class: rb6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceRequest.bindWithSign$lambda$4(success, error, (BindStatus) obj);
            }
        });
    }

    public final void confirmBind(@NotNull ConfirmBindInfo confirmBindInfo, @NotNull Function1<? super BindResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(confirmBindInfo, "confirmBindInfo");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C19161(confirmBindInfo, null)).error(error).success(success);
    }

    public final void deviceActive(@NotNull String eventName, @NotNull DeviceActiveBean eventValue, @NotNull Function1<? super DeviceActiveResult, Unit> success, @NotNull Function1<? super ApiException, Unit> fail) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventValue, "eventValue");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("key", eventName);
        jsonObject.addProperty("value", getMGson().toJson(eventValue));
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(jsonObject);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("sync_data", jsonArray);
        DeviceModelExtKt.logd("deviceActive " + getMGson().toJson((JsonElement) jsonObject2));
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C19171(jsonObject2, null)).error(fail).success(success);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deviceActiveArray(@NotNull DeviceActive deviceActive, @NotNull Continuation<? super DeviceActiveResult> continuation) {
        C19181 c19181;
        if (continuation instanceof C19181) {
            c19181 = (C19181) continuation;
            int i = c19181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19181.label = i - Integer.MIN_VALUE;
            } else {
                c19181 = new C19181(continuation);
            }
        } else {
            c19181 = new C19181(continuation);
        }
        Object objUpTrackData = c19181.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19181.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpTrackData);
            DeviceModelExtKt.logi(TAG, "recordPhone jsonObject string " + getMGson().toJson(deviceActive));
            DeviceApiService mService = getMService();
            String json = getMGson().toJson(deviceActive);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c19181.label = 1;
            objUpTrackData = mService.upTrackData(json, c19181);
            if (objUpTrackData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpTrackData);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUpTrackData);
    }

    public final void getBindKey(@NotNull final Function1<? super String, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C19191(null)).error(error).success(new Function1() { // from class: ub6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceRequest.getBindKey$lambda$3(success, error, (BindKey) obj);
            }
        });
    }

    public final void getDevices(int size, @Nullable String next, int status, @NotNull final Function1<? super List<? extends Device>, Unit> onSuccess, @NotNull final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C19201(size, next, status, this, null)).error(onFail).success(new Function1() { // from class: vb6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceRequest.getDevices$lambda$2(onSuccess, onFail, (DeviceListData) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProductByCategory(long j, @NotNull Continuation<? super ProductListData> continuation) {
        C19211 c19211;
        if (continuation instanceof C19211) {
            c19211 = (C19211) continuation;
            int i = c19211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19211.label = i - Integer.MIN_VALUE;
            } else {
                c19211 = new C19211(continuation);
            }
        } else {
            c19211 = new C19211(continuation);
        }
        Object productConfigByCategory = c19211.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19211.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(productConfigByCategory);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("category", "wearable,other_device,equipment,application,mobile_terminal");
            linkedHashMap.put(OneTrack.Param.APP_PLATFORM, Boxing.boxInt(0));
            String versionName = AppUtil.getVersionName();
            if (versionName.length() > 0) {
                linkedHashMap.put("app_version", versionName);
            }
            linkedHashMap.put("last_modify_time", Boxing.boxLong(j));
            DeviceApiService mService = getMService();
            String currentLocale = LocaleUtil.getCurrentLocale();
            String json = getMGson().toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c19211.label = 1;
            productConfigByCategory = mService.getProductConfigByCategory(currentLocale, json, c19211);
            if (productConfigByCategory == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(productConfigByCategory);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(productConfigByCategory);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProductConfig(long j, @NotNull Continuation<? super ProductListData> continuation) {
        C19221 c19221;
        if (continuation instanceof C19221) {
            c19221 = (C19221) continuation;
            int i = c19221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19221.label = i - Integer.MIN_VALUE;
            } else {
                c19221 = new C19221(continuation);
            }
        } else {
            c19221 = new C19221(continuation);
        }
        Object productConfig = c19221.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(productConfig);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(OneTrack.Param.APP_PLATFORM, Boxing.boxInt(0));
            String versionName = AppUtil.getVersionName();
            if (versionName.length() > 0) {
                linkedHashMap.put("app_version", versionName);
            }
            linkedHashMap.put("last_modify_time", Boxing.boxLong(j));
            DeviceApiService mService = getMService();
            String currentLocale = LocaleUtil.getCurrentLocale();
            String json = getMGson().toJson(linkedHashMap);
            c19221.label = 1;
            productConfig = mService.getProductConfig(currentLocale, json, c19221);
            if (productConfig == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(productConfig);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(productConfig);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object recordDevices(@NotNull Continuation<? super DeviceRecordInfo> continuation) {
        C19231 c19231;
        if (continuation instanceof C19231) {
            c19231 = (C19231) continuation;
            int i = c19231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19231.label = i - Integer.MIN_VALUE;
            } else {
                c19231 = new C19231(continuation);
            }
        } else {
            c19231 = new C19231(continuation);
        }
        Object objRecordDevices = c19231.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19231.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRecordDevices);
            String uniqueIdentify = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getUniqueIdentify();
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            String string = SystemProperties.INSTANCE.getString("persist.sys.device_name", MODEL);
            Intrinsics.checkNotNull(string);
            Device device = new Device(null, 0, Product.PHONE_MODEL, string, null, uniqueIdentify, MODEL, 0, null, 0, 787, null);
            DeviceModelExtKt.logi(TAG, "recordPhone identifier " + device.getIdentifier() + "**pid" + Process.myPid());
            DeviceApiService mService = getMService();
            String json = getMGson().toJson(device);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c19231.label = 1;
            objRecordDevices = mService.recordDevices(json, c19231);
            if (objRecordDevices == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRecordDevices);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objRecordDevices);
    }

    public final void recordLocalBind(@NotNull String sn, @NotNull String did, @NotNull String model, @NotNull Function1<? super LocalBindResult, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C19241(sn, did, model, this, null)).error(error).success(success);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object revoke(@NotNull String str, @NotNull Continuation<? super Integer> continuation) {
        C19251 c19251;
        if (continuation instanceof C19251) {
            c19251 = (C19251) continuation;
            int i = c19251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19251.label = i - Integer.MIN_VALUE;
            } else {
                c19251 = new C19251(continuation);
            }
        } else {
            c19251 = new C19251(continuation);
        }
        Object objRevokeAuthorization = c19251.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRevokeAuthorization);
            HashMap map = new HashMap();
            map.put("did", str);
            DeviceBindService mBindService = getMBindService();
            String json = getMGson().toJson(map);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c19251.label = 1;
            objRevokeAuthorization = mBindService.revokeAuthorization(json, c19251);
            if (objRevokeAuthorization == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRevokeAuthorization);
        }
        return Boxing.boxInt(((BindStatus) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objRevokeAuthorization)).getRet());
    }

    public final void unbind(@NotNull String did, @NotNull String model, @NotNull Function1<? super BindResult, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C19261(did, model, this, null)).error(error).success(success);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object upHuamiTrackData(@NotNull HuamiTrackUpData huamiTrackUpData, @NotNull Continuation<? super DeviceActiveResult> continuation) {
        C19271 c19271;
        if (continuation instanceof C19271) {
            c19271 = (C19271) continuation;
            int i = c19271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19271.label = i - Integer.MIN_VALUE;
            } else {
                c19271 = new C19271(continuation);
            }
        } else {
            c19271 = new C19271(continuation);
        }
        Object objUpHuamiTrackData = c19271.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpHuamiTrackData);
            DeviceModelExtKt.logi(TAG, "upHuamiTrackData  " + getMGson().toJson(huamiTrackUpData));
            DeviceApiService mService = getMService();
            String json = getMGson().toJson(huamiTrackUpData);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c19271.label = 1;
            objUpHuamiTrackData = mService.upHuamiTrackData(json, c19271);
            if (objUpHuamiTrackData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpHuamiTrackData);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUpHuamiTrackData);
    }

    public final void updateDeviceInfo(@NotNull String did, @NotNull String phoneId, @NotNull Function1<? super UpdateDeviceInfoResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("phone_id", phoneId);
        map.put("did", did);
        map.put("detail", map2);
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C19281(map, null)).error(error).success(success);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object uploadDeviceLocalBind(@NotNull Device device, @NotNull Continuation<? super Unit> continuation) throws IOException {
        C19291 c19291;
        if (continuation instanceof C19291) {
            c19291 = (C19291) continuation;
            int i = c19291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19291.label = i - Integer.MIN_VALUE;
            } else {
                c19291 = new C19291(continuation);
            }
        } else {
            c19291 = new C19291(continuation);
        }
        Object objUploadDeviceLocalBind = c19291.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUploadDeviceLocalBind);
            DeviceApiService mService = getMService();
            String json = getSerializedNoNullGson().toJson(device);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c19291.label = 1;
            objUploadDeviceLocalBind = mService.uploadDeviceLocalBind(json, c19291);
            if (objUploadDeviceLocalBind == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUploadDeviceLocalBind);
        }
        ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUploadDeviceLocalBind);
        return Unit.INSTANCE;
    }

    public final void verifyBind(@NotNull BindECDHInfo bindECDHInfo, @NotNull Function1<? super VerifyBindInfo, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(bindECDHInfo, "bindECDHInfo");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C19301(bindECDHInfo, null)).error(error).success(success);
    }

    public static /* synthetic */ Object getDevices$default(DeviceRequest deviceRequest, int i, String str, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        return deviceRequest.getDevices(i, str, i2, continuation);
    }

    public static /* synthetic */ Object getDevices$default(DeviceRequest deviceRequest, int i, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return deviceRequest.getDevices(i, z, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getDevices(int i, @Nullable String str, int i2, @NotNull Continuation<? super DeviceListData> continuation) {
        AnonymousClass3 anonymousClass3;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            int i3 = anonymousClass3.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        } else {
            anonymousClass3 = new AnonymousClass3(continuation);
        }
        Object devices = anonymousClass3.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass3.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(devices);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_size", Boxing.boxInt(i));
            if (str != null && str.length() != 0) {
                linkedHashMap.put("page_start", str);
            }
            if (i2 > 0) {
                linkedHashMap.put("status", Boxing.boxInt(i2));
            }
            DeviceApiService mService = getMService();
            String json = getMGson().toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            anonymousClass3.label = 1;
            devices = mService.getDevices(json, anonymousClass3);
            if (devices == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(devices);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(devices);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object unbind(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Integer> continuation) {
        AnonymousClass2 anonymousClass2;
        if (continuation instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) continuation;
            int i = anonymousClass2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(continuation);
            }
        } else {
            anonymousClass2 = new AnonymousClass2(continuation);
        }
        Object objUnbind = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUnbind);
            HashMap map = new HashMap();
            map.put("did", str);
            map.put("model", str2);
            DeviceBindService mBindService = getMBindService();
            String json = getMGson().toJson(map);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            anonymousClass2.label = 1;
            objUnbind = mBindService.unbind(json, anonymousClass2);
            if (objUnbind == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUnbind);
        }
        BindStatus bindStatus = (BindStatus) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUnbind);
        return Boxing.boxInt(bindStatus.isSuccess() ? 0 : bindStatus.getRet());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006d -> B:23:0x0072). Please report as a decompilation issue!!! */
    @Nullable
    public final Object getDevices(int i, boolean z, @NotNull Continuation<? super List<WearableDevice>> continuation) {
        AnonymousClass4 anonymousClass4;
        List arrayList;
        int i2;
        String str;
        int i3;
        DeviceRequest deviceRequest;
        Object devices;
        int i4;
        int i5;
        List list;
        if (continuation instanceof AnonymousClass4) {
            anonymousClass4 = (AnonymousClass4) continuation;
            int i6 = anonymousClass4.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                anonymousClass4.label = i6 - Integer.MIN_VALUE;
            } else {
                anonymousClass4 = new AnonymousClass4(continuation);
            }
        } else {
            anonymousClass4 = new AnonymousClass4(continuation);
        }
        Object obj = anonymousClass4.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = anonymousClass4.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            arrayList = new ArrayList();
            i2 = z ? Integer.MAX_VALUE : 6;
            str = null;
            i3 = 0;
            deviceRequest = this;
            anonymousClass4.L$0 = deviceRequest;
            anonymousClass4.L$1 = arrayList;
            anonymousClass4.I$0 = i;
            anonymousClass4.Z$0 = z;
            anonymousClass4.I$1 = i2;
            anonymousClass4.I$2 = i3;
            anonymousClass4.label = 1;
            devices = deviceRequest.getDevices(50, str, i, anonymousClass4);
            if (devices == coroutine_suspended) {
                return coroutine_suspended;
            }
            i4 = i;
            i5 = i3;
            list = arrayList;
            obj = devices;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i5 = anonymousClass4.I$2;
            int i8 = anonymousClass4.I$1;
            boolean z2 = anonymousClass4.Z$0;
            i4 = anonymousClass4.I$0;
            list = (List) anonymousClass4.L$1;
            deviceRequest = (DeviceRequest) anonymousClass4.L$0;
            ResultKt.throwOnFailure(obj);
            i2 = i8;
            z = z2;
        }
        DeviceListData deviceListData = (DeviceListData) obj;
        String next = deviceListData.getNext();
        List<WearableDevice> dataList = deviceListData.getDataList();
        if (dataList != null && !dataList.isEmpty()) {
            list.addAll(dataList);
        }
        int i9 = i5 + 1;
        DeviceModelExtKt.logi("getDevices  page:" + i9 + ", limit:" + i2 + ", is bind device:" + z);
        if (next != null || next.length() == 0 || i9 >= i2) {
            return list;
        }
        arrayList = list;
        i3 = i9;
        i = i4;
        str = next;
        anonymousClass4.L$0 = deviceRequest;
        anonymousClass4.L$1 = arrayList;
        anonymousClass4.I$0 = i;
        anonymousClass4.Z$0 = z;
        anonymousClass4.I$1 = i2;
        anonymousClass4.I$2 = i3;
        anonymousClass4.label = 1;
        devices = deviceRequest.getDevices(50, str, i, anonymousClass4);
        if (devices == coroutine_suspended) {
            return coroutine_suspended;
        }
        i4 = i;
        i5 = i3;
        list = arrayList;
        obj = devices;
        DeviceListData deviceListData2 = (DeviceListData) obj;
        String next2 = deviceListData2.getNext();
        List<WearableDevice> dataList2 = deviceListData2.getDataList();
        if (dataList2 != null) {
            list.addAll(dataList2);
        }
        int i10 = i5 + 1;
        DeviceModelExtKt.logi("getDevices  page:" + i10 + ", limit:" + i2 + ", is bind device:" + z);
        if (next2 != null) {
        }
        return list;
    }
}
